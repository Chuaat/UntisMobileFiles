// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.elements.android;

import android.view.ViewParent;
import android.view.MotionEvent;
import android.graphics.Canvas;
import android.view.ViewGroup$LayoutParams;
import android.view.WindowManager$LayoutParams;
import android.content.Context;
import java.util.ArrayList;
import com.facebook.stetho.common.Predicate;
import com.facebook.stetho.inspector.elements.NodeDescriptor;
import com.facebook.stetho.common.Accumulator;
import com.facebook.stetho.inspector.elements.DescriptorRegistrar;
import android.view.Window;
import android.view.ViewGroup;
import android.view.View;
import android.widget.TextView;
import com.facebook.stetho.inspector.elements.ObjectDescriptor;
import android.app.Dialog;
import com.facebook.stetho.inspector.elements.Descriptor;
import android.app.Activity;
import com.facebook.stetho.common.Util;
import com.facebook.stetho.common.ThreadBound;
import com.facebook.stetho.inspector.elements.DescriptorProvider;
import java.util.List;
import c6.h;
import com.facebook.stetho.inspector.elements.DocumentProviderListener;
import android.graphics.Rect;
import com.facebook.stetho.inspector.elements.DescriptorMap;
import android.app.Application;
import com.facebook.stetho.inspector.elements.DocumentProvider;
import com.facebook.stetho.inspector.helper.ThreadBoundProxy;

final class AndroidDocumentProvider extends ThreadBoundProxy implements DocumentProvider, AndroidDescriptorHost
{
    private static final int INSPECT_HOVER_COLOR = 1077952767;
    private static final int INSPECT_OVERLAY_COLOR = 1090519039;
    private static final long REPORT_CHANGED_INTERVAL_MS = 1000L;
    private final Application mApplication;
    private final DescriptorMap mDescriptorMap;
    private final AndroidDocumentRoot mDocumentRoot;
    private final ViewHighlighter mHighlighter;
    private final Rect mHighlightingBoundsRect;
    private final Rect mHitRect;
    private final InspectModeHandler mInspectModeHandler;
    private boolean mIsReportChangesTimerPosted;
    @h
    private DocumentProviderListener mListener;
    private final Runnable mReportChangesTimer;
    
    public AndroidDocumentProvider(final Application application, final List<DescriptorProvider> list, final ThreadBound threadBound) {
        super(threadBound);
        this.mHighlightingBoundsRect = new Rect();
        this.mHitRect = new Rect();
        int i = 0;
        this.mIsReportChangesTimerPosted = false;
        this.mReportChangesTimer = new Runnable() {
            @Override
            public void run() {
                AndroidDocumentProvider.this.mIsReportChangesTimerPosted = false;
                if (AndroidDocumentProvider.this.mListener != null) {
                    AndroidDocumentProvider.this.mListener.onPossiblyChanged();
                    AndroidDocumentProvider.this.mIsReportChangesTimerPosted = true;
                    AndroidDocumentProvider.this.postDelayed(this, 1000L);
                }
            }
        };
        this.mApplication = Util.throwIfNull(application);
        final AndroidDocumentRoot mDocumentRoot = new AndroidDocumentRoot(application);
        this.mDocumentRoot = mDocumentRoot;
        final DescriptorMap registerDescriptor = new DescriptorMap().beginInit().registerDescriptor((Class<?>)Activity.class, (Descriptor)new ActivityDescriptor()).registerDescriptor((Class<?>)AndroidDocumentRoot.class, (Descriptor)mDocumentRoot).registerDescriptor((Class<?>)Application.class, (Descriptor)new ApplicationDescriptor()).registerDescriptor((Class<?>)Dialog.class, (Descriptor)new DialogDescriptor()).registerDescriptor((Class<?>)Object.class, (Descriptor)new ObjectDescriptor()).registerDescriptor((Class<?>)TextView.class, (Descriptor)new TextViewDescriptor()).registerDescriptor((Class<?>)View.class, (Descriptor)new ViewDescriptor()).registerDescriptor((Class<?>)ViewGroup.class, (Descriptor)new ViewGroupDescriptor()).registerDescriptor((Class<?>)Window.class, (Descriptor)new WindowDescriptor());
        DialogFragmentDescriptor.register(this.mDescriptorMap = registerDescriptor);
        FragmentDescriptor.register(registerDescriptor);
        while (i < list.size()) {
            list.get(i).registerDescriptor(this.mDescriptorMap);
            ++i;
        }
        this.mDescriptorMap.setHost(this).endInit();
        this.mHighlighter = ViewHighlighter.newInstance();
        this.mInspectModeHandler = new InspectModeHandler();
    }
    
    private void getWindows(final Accumulator<Window> accumulator) {
        final Descriptor descriptor = this.getDescriptor(this.mApplication);
        if (descriptor != null) {
            descriptor.getChildren(this.mApplication, new Accumulator<Object>() {
                @Override
                public void store(final Object o) {
                    if (o instanceof Window) {
                        accumulator.store(o);
                    }
                    else {
                        final Descriptor descriptor = AndroidDocumentProvider.this.getDescriptor(o);
                        if (descriptor != null) {
                            descriptor.getChildren(o, this);
                        }
                    }
                }
            });
        }
    }
    
    @Override
    public void dispose() {
        this.verifyThreadAccess();
        this.mHighlighter.clearHighlight();
        this.mInspectModeHandler.disable();
        this.removeCallbacks(this.mReportChangesTimer);
        this.mIsReportChangesTimerPosted = false;
        this.mListener = null;
    }
    
    @Override
    public Descriptor getDescriptor(final Object o) {
        Descriptor value;
        if (o == null) {
            value = null;
        }
        else {
            value = this.mDescriptorMap.get(o.getClass());
        }
        return value;
    }
    
    @h
    @Override
    public HighlightableDescriptor getHighlightableDescriptor(@h final Object o) {
        if (o == null) {
            return null;
        }
        Class<?> clazz;
        Object o3;
        Object o2;
        Descriptor value;
        HighlightableDescriptor<?> highlightableDescriptor;
        for (clazz = o.getClass(), o2 = (o3 = null); o2 == null && clazz != null; clazz = clazz.getSuperclass(), o3 = value, o2 = highlightableDescriptor) {
            value = this.mDescriptorMap.get(clazz);
            if (value == null) {
                return null;
            }
            highlightableDescriptor = (HighlightableDescriptor<?>)o2;
            if (value != o3) {
                highlightableDescriptor = (HighlightableDescriptor<?>)o2;
                if (value instanceof HighlightableDescriptor) {
                    highlightableDescriptor = (HighlightableDescriptor<?>)value;
                }
            }
        }
        return (HighlightableDescriptor)o2;
    }
    
    @Override
    public NodeDescriptor getNodeDescriptor(final Object o) {
        this.verifyThreadAccess();
        return this.getDescriptor(o);
    }
    
    @Override
    public Object getRootElement() {
        this.verifyThreadAccess();
        return this.mDocumentRoot;
    }
    
    @Override
    public void hideHighlight() {
        this.verifyThreadAccess();
        this.mHighlighter.clearHighlight();
    }
    
    @Override
    public void highlightElement(final Object o, final int n) {
        this.verifyThreadAccess();
        final HighlightableDescriptor highlightableDescriptor = this.getHighlightableDescriptor(o);
        if (highlightableDescriptor == null) {
            this.mHighlighter.clearHighlight();
            return;
        }
        this.mHighlightingBoundsRect.setEmpty();
        final View viewAndBoundsForHighlighting = highlightableDescriptor.getViewAndBoundsForHighlighting(o, this.mHighlightingBoundsRect);
        if (viewAndBoundsForHighlighting == null) {
            this.mHighlighter.clearHighlight();
            return;
        }
        this.mHighlighter.setHighlightedView(viewAndBoundsForHighlighting, this.mHighlightingBoundsRect, n);
    }
    
    @Override
    public void onAttributeModified(final Object o, final String s, final String s2) {
        final DocumentProviderListener mListener = this.mListener;
        if (mListener != null) {
            mListener.onAttributeModified(o, s, s2);
        }
    }
    
    @Override
    public void onAttributeRemoved(final Object o, final String s) {
        final DocumentProviderListener mListener = this.mListener;
        if (mListener != null) {
            mListener.onAttributeRemoved(o, s);
        }
    }
    
    @Override
    public void setAttributesAsText(final Object o, final String s) {
        this.verifyThreadAccess();
        final Descriptor value = this.mDescriptorMap.get(o.getClass());
        if (value != null) {
            value.setAttributesAsText(o, s);
        }
    }
    
    @Override
    public void setInspectModeEnabled(final boolean b) {
        this.verifyThreadAccess();
        if (b) {
            this.mInspectModeHandler.enable();
        }
        else {
            this.mInspectModeHandler.disable();
        }
    }
    
    @Override
    public void setListener(final DocumentProviderListener mListener) {
        this.verifyThreadAccess();
        this.mListener = mListener;
        if (mListener == null && this.mIsReportChangesTimerPosted) {
            this.mIsReportChangesTimerPosted = false;
            this.removeCallbacks(this.mReportChangesTimer);
        }
        else if (mListener != null && !this.mIsReportChangesTimerPosted) {
            this.mIsReportChangesTimerPosted = true;
            this.postDelayed(this.mReportChangesTimer, 1000L);
        }
    }
    
    private final class InspectModeHandler
    {
        private List<View> mOverlays;
        private final Predicate<View> mViewSelector;
        final /* synthetic */ AndroidDocumentProvider this$0;
        
        private InspectModeHandler() {
            this.mViewSelector = new Predicate<View>() {
                @Override
                public boolean apply(final View view) {
                    return view instanceof DocumentHiddenView ^ true;
                }
            };
        }
        
        public void disable() {
            AndroidDocumentProvider.this.verifyThreadAccess();
            if (this.mOverlays == null) {
                return;
            }
            for (int i = 0; i < this.mOverlays.size(); ++i) {
                final View view = this.mOverlays.get(i);
                ((ViewGroup)view.getParent()).removeView(view);
            }
            this.mOverlays = null;
        }
        
        public void enable() {
            AndroidDocumentProvider.this.verifyThreadAccess();
            if (this.mOverlays != null) {
                this.disable();
            }
            this.mOverlays = new ArrayList<View>();
            AndroidDocumentProvider.this.getWindows(new Accumulator<Window>() {
                @Override
                public void store(final Window window) {
                    if (window.peekDecorView() instanceof ViewGroup) {
                        final ViewGroup viewGroup = (ViewGroup)window.peekDecorView();
                        final InspectModeHandler this$1 = InspectModeHandler.this;
                        final OverlayView overlayView = this$1.new OverlayView((Context)this$1.this$0.mApplication);
                        final WindowManager$LayoutParams windowManager$LayoutParams = new WindowManager$LayoutParams();
                        windowManager$LayoutParams.width = -1;
                        windowManager$LayoutParams.height = -1;
                        viewGroup.addView((View)overlayView, (ViewGroup$LayoutParams)windowManager$LayoutParams);
                        viewGroup.bringChildToFront((View)overlayView);
                        InspectModeHandler.this.mOverlays.add(overlayView);
                    }
                }
            });
        }
        
        private final class OverlayView extends DocumentHiddenView
        {
            public OverlayView(final Context context) {
                super(context);
            }
            
            protected void onDraw(final Canvas canvas) {
                canvas.drawColor(1090519039);
                super.onDraw(canvas);
            }
            
            public boolean onTouchEvent(final MotionEvent motionEvent) {
                int n = (int)motionEvent.getX();
                int n2 = (int)motionEvent.getY();
                ViewParent parent = this.getParent();
                while (true) {
                    final HighlightableDescriptor highlightableDescriptor = AndroidDocumentProvider.this.getHighlightableDescriptor(parent);
                    if (highlightableDescriptor == null) {
                        break;
                    }
                    AndroidDocumentProvider.this.mHitRect.setEmpty();
                    final Object elementToHighlightAtPosition = highlightableDescriptor.getElementToHighlightAtPosition(parent, n, n2, AndroidDocumentProvider.this.mHitRect);
                    n -= AndroidDocumentProvider.this.mHitRect.left;
                    n2 -= AndroidDocumentProvider.this.mHitRect.top;
                    if (elementToHighlightAtPosition == parent) {
                        break;
                    }
                    parent = (ViewParent)elementToHighlightAtPosition;
                }
                if (parent != null) {
                    final HighlightableDescriptor highlightableDescriptor2 = AndroidDocumentProvider.this.getHighlightableDescriptor(parent);
                    if (highlightableDescriptor2 != null) {
                        final View viewAndBoundsForHighlighting = highlightableDescriptor2.getViewAndBoundsForHighlighting(parent, AndroidDocumentProvider.this.mHighlightingBoundsRect);
                        if (motionEvent.getAction() != 3 && viewAndBoundsForHighlighting != null) {
                            AndroidDocumentProvider.this.mHighlighter.setHighlightedView(viewAndBoundsForHighlighting, AndroidDocumentProvider.this.mHighlightingBoundsRect, 1077952767);
                            if (motionEvent.getAction() == 1 && AndroidDocumentProvider.this.mListener != null) {
                                AndroidDocumentProvider.this.mListener.onInspectRequested(parent);
                            }
                        }
                    }
                }
                return true;
            }
        }
    }
}
