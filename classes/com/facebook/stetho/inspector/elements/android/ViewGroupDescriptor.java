// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.elements.android;

import com.facebook.stetho.common.Accumulator;
import c6.h;
import android.graphics.Rect;
import com.facebook.stetho.common.android.FragmentCompatUtil;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.WeakHashMap;
import android.view.View;
import java.util.Map;
import android.view.ViewGroup;
import com.facebook.stetho.inspector.elements.AbstractChainedDescriptor;

final class ViewGroupDescriptor extends AbstractChainedDescriptor<ViewGroup> implements HighlightableDescriptor<ViewGroup>
{
    private final Map<View, Object> mViewToElementMap;
    
    public ViewGroupDescriptor() {
        this.mViewToElementMap = Collections.synchronizedMap(new WeakHashMap<View, Object>());
    }
    
    private Object getElement(final View view, final Object o) {
        if (o == this) {
            return view;
        }
        return ((WeakReference)o).get();
    }
    
    private Object getElementForView(final ViewGroup viewGroup, final View view) {
        final Object value = this.mViewToElementMap.get(view);
        if (value != null) {
            final Object element = this.getElement(view, value);
            if (element != null && view.getParent() == viewGroup) {
                return element;
            }
            this.mViewToElementMap.remove(view);
        }
        final Object fragmentForView = FragmentCompatUtil.findFragmentForView(view);
        if (fragmentForView != null && !FragmentCompatUtil.isDialogFragment(fragmentForView)) {
            this.mViewToElementMap.put(view, new WeakReference(fragmentForView));
            return fragmentForView;
        }
        this.mViewToElementMap.put(view, this);
        return view;
    }
    
    private boolean isChildVisible(final View view) {
        return view instanceof DocumentHiddenView ^ true;
    }
    
    @h
    @Override
    public Object getElementToHighlightAtPosition(final ViewGroup viewGroup, final int n, final int n2, final Rect rect) {
        while (true) {
            for (int i = viewGroup.getChildCount() - 1; i >= 0; --i) {
                final View child = viewGroup.getChildAt(i);
                if (this.isChildVisible(child) && child.getVisibility() == 0) {
                    child.getHitRect(rect);
                    if (rect.contains(n, n2)) {
                        if (child != null) {
                            return child;
                        }
                        rect.set(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
                        return viewGroup;
                    }
                }
            }
            final View child = null;
            continue;
        }
    }
    
    @h
    @Override
    public View getViewAndBoundsForHighlighting(final ViewGroup viewGroup, final Rect rect) {
        return (View)viewGroup;
    }
    
    @Override
    protected void onGetChildren(final ViewGroup viewGroup, final Accumulator<Object> accumulator) {
        for (int childCount = viewGroup.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = viewGroup.getChildAt(i);
            if (this.isChildVisible(child)) {
                accumulator.store(this.getElementForView(viewGroup, child));
            }
        }
    }
}
