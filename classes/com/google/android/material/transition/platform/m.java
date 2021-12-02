// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.transition.platform;

import com.google.android.material.shape.s;
import android.view.View$MeasureSpec;
import com.google.android.material.internal.b;
import java.util.Map;
import java.util.List;
import com.google.android.material.shape.o;
import o2.a;
import android.content.Context;
import android.os.Parcelable;
import android.graphics.RectF;
import android.graphics.Matrix;
import androidx.annotation.j0;
import android.app.Activity;
import android.transition.Transition$TransitionListener;
import android.transition.Transition;
import androidx.core.graphics.c;
import androidx.core.graphics.d;
import android.view.Window;
import android.graphics.Rect;
import androidx.annotation.k0;
import android.view.View;
import java.lang.ref.WeakReference;
import androidx.annotation.p0;
import android.app.SharedElementCallback;

@p0(21)
public class m extends SharedElementCallback
{
    @k0
    private static WeakReference<View> f;
    private boolean a;
    private boolean b;
    private boolean c;
    @k0
    private Rect d;
    @k0
    private d e;
    
    public m() {
        this.a = true;
        this.b = true;
        this.c = false;
        this.e = (d)new e();
    }
    
    private static void h(final Window window) {
        window.getDecorView().getBackground().mutate().setColorFilter(c.a(0, androidx.core.graphics.d.G));
    }
    
    private static void i(final Window window) {
        window.getDecorView().getBackground().mutate().clearColorFilter();
    }
    
    private void m(final Window window) {
        final Transition sharedElementEnterTransition = window.getSharedElementEnterTransition();
        if (sharedElementEnterTransition instanceof l) {
            final l l = (l)sharedElementEnterTransition;
            if (!this.c) {
                window.setSharedElementReenterTransition((Transition)null);
            }
            if (this.b) {
                o(window, l);
                l.addListener((Transition$TransitionListener)new u() {
                    @Override
                    public void onTransitionEnd(final Transition transition) {
                        i(window);
                    }
                    
                    @Override
                    public void onTransitionStart(final Transition transition) {
                        h(window);
                    }
                });
            }
        }
    }
    
    private void n(final Activity activity, final Window window) {
        final Transition sharedElementReturnTransition = window.getSharedElementReturnTransition();
        if (sharedElementReturnTransition instanceof l) {
            final l l = (l)sharedElementReturnTransition;
            l.d0(true);
            l.addListener((Transition$TransitionListener)new u() {
                @Override
                public void onTransitionEnd(final Transition transition) {
                    if (m.f != null) {
                        final View view = (View)m.f.get();
                        if (view != null) {
                            view.setAlpha(1.0f);
                            m.f = null;
                        }
                    }
                    activity.finish();
                    activity.overridePendingTransition(0, 0);
                }
            });
            if (this.b) {
                o(window, l);
                l.addListener((Transition$TransitionListener)new u() {
                    @Override
                    public void onTransitionStart(final Transition transition) {
                        h(window);
                    }
                });
            }
        }
    }
    
    private static void o(final Window window, final l l) {
        if (l.getDuration() >= 0L) {
            window.setTransitionBackgroundFadeDuration(l.getDuration());
        }
    }
    
    @k0
    public d e() {
        return this.e;
    }
    
    public boolean f() {
        return this.c;
    }
    
    public boolean g() {
        return this.b;
    }
    
    public void j(@k0 final d e) {
        this.e = e;
    }
    
    public void k(final boolean c) {
        this.c = c;
    }
    
    public void l(final boolean b) {
        this.b = b;
    }
    
    @k0
    public Parcelable onCaptureSharedElementSnapshot(@j0 final View referent, @j0 final Matrix matrix, @j0 final RectF rectF) {
        m.f = new WeakReference<View>(referent);
        return super.onCaptureSharedElementSnapshot(referent, matrix, rectF);
    }
    
    @k0
    public View onCreateSnapshotView(@j0 final Context context, @k0 final Parcelable parcelable) {
        final View onCreateSnapshotView = super.onCreateSnapshotView(context, parcelable);
        if (onCreateSnapshotView != null) {
            final WeakReference<View> f = m.f;
            if (f != null && this.e != null) {
                final View view = f.get();
                if (view != null) {
                    final o a = this.e.a(view);
                    if (a != null) {
                        onCreateSnapshotView.setTag(o2.a.h.d3, (Object)a);
                    }
                }
            }
        }
        return onCreateSnapshotView;
    }
    
    public void onMapSharedElements(@j0 final List<String> list, @j0 final Map<String, View> map) {
        if (!list.isEmpty() && !map.isEmpty()) {
            final View view = map.get(list.get(0));
            if (view != null) {
                final Activity a = com.google.android.material.internal.b.a(view.getContext());
                if (a != null) {
                    final Window window = a.getWindow();
                    if (this.a) {
                        this.m(window);
                    }
                    else {
                        this.n(a, window);
                    }
                }
            }
        }
    }
    
    public void onSharedElementEnd(@j0 final List<String> list, @j0 final List<View> list2, @j0 final List<View> list3) {
        if (!list2.isEmpty()) {
            final View view = list2.get(0);
            final int d3 = o2.a.h.d3;
            if (view.getTag(d3) instanceof View) {
                list2.get(0).setTag(d3, (Object)null);
            }
        }
        if (!this.a && !list2.isEmpty()) {
            this.d = v.k(list2.get(0));
        }
        this.a = false;
    }
    
    public void onSharedElementStart(@j0 final List<String> list, @j0 final List<View> list2, @j0 final List<View> list3) {
        if (!list2.isEmpty() && !list3.isEmpty()) {
            list2.get(0).setTag(o2.a.h.d3, (Object)list3.get(0));
        }
        if (!this.a && !list2.isEmpty() && this.d != null) {
            final View view = list2.get(0);
            view.measure(View$MeasureSpec.makeMeasureSpec(this.d.width(), 1073741824), View$MeasureSpec.makeMeasureSpec(this.d.height(), 1073741824));
            final Rect d = this.d;
            view.layout(d.left, d.top, d.right, d.bottom);
        }
    }
    
    public interface d
    {
        @k0
        o a(@j0 final View p0);
    }
    
    public static class e implements d
    {
        @k0
        @Override
        public o a(@j0 final View view) {
            o shapeAppearanceModel;
            if (view instanceof s) {
                shapeAppearanceModel = ((s)view).getShapeAppearanceModel();
            }
            else {
                shapeAppearanceModel = null;
            }
            return shapeAppearanceModel;
        }
    }
}
