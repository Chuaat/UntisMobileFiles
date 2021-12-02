// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.internal;

import android.view.inputmethod.InputMethodManager;
import android.view.View$OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.graphics.PorterDuff$Mode;
import android.view.ViewParent;
import android.os.Build$VERSION;
import android.view.ViewGroup;
import android.util.TypedValue;
import androidx.annotation.q;
import android.content.Context;
import androidx.core.view.a0;
import android.content.res.TypedArray;
import androidx.core.view.x0;
import o2.a;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import androidx.annotation.k0;
import android.view.View;
import androidx.annotation.t0;

@t0({ t0.a.H })
public class b0
{
    private b0() {
    }
    
    public static void a(@k0 final View view, @j0 final ViewTreeObserver$OnGlobalLayoutListener viewTreeObserver$OnGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserver$OnGlobalLayoutListener);
        }
    }
    
    public static void b(@j0 final View view, @k0 final AttributeSet set, final int n, final int n2) {
        c(view, set, n, n2, null);
    }
    
    public static void c(@j0 final View view, @k0 final AttributeSet set, final int n, final int n2, @k0 final e e) {
        final TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(set, a.o.ug, n, n2);
        final boolean boolean1 = obtainStyledAttributes.getBoolean(a.o.vg, false);
        final boolean boolean2 = obtainStyledAttributes.getBoolean(a.o.wg, false);
        final boolean boolean3 = obtainStyledAttributes.getBoolean(a.o.xg, false);
        obtainStyledAttributes.recycle();
        d(view, (e)new e() {
            @j0
            @Override
            public x0 a(final View view, @j0 final x0 x0, @j0 final f f) {
                if (boolean1) {
                    f.d += x0.o();
                }
                final boolean j = b0.j(view);
                if (boolean2) {
                    if (j) {
                        f.c += x0.p();
                    }
                    else {
                        f.a += x0.p();
                    }
                }
                if (boolean3) {
                    if (j) {
                        f.a += x0.q();
                    }
                    else {
                        f.c += x0.q();
                    }
                }
                f.a(view);
                final e d = e;
                x0 a = x0;
                if (d != null) {
                    a = d.a(view, x0, f);
                }
                return a;
            }
        });
    }
    
    public static void d(@j0 final View view, @j0 final e e) {
        androidx.core.view.j0.Y1(view, new a0() {
            final /* synthetic */ f b = new f(androidx.core.view.j0.j0(view), view.getPaddingTop(), androidx.core.view.j0.i0(view), view.getPaddingBottom());
            
            @Override
            public x0 a(final View view, final x0 x0) {
                return e.a(view, x0, new f(this.b));
            }
        });
        n(view);
    }
    
    public static float e(@j0 final Context context, @q(unit = 0) final int n) {
        return TypedValue.applyDimension(1, (float)n, context.getResources().getDisplayMetrics());
    }
    
    @k0
    public static ViewGroup f(@k0 final View view) {
        if (view == null) {
            return null;
        }
        final View rootView = view.getRootView();
        final ViewGroup viewGroup = (ViewGroup)rootView.findViewById(16908290);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView != view && rootView instanceof ViewGroup) {
            return (ViewGroup)rootView;
        }
        return null;
    }
    
    @k0
    public static com.google.android.material.internal.a0 g(@j0 final View view) {
        return h((View)f(view));
    }
    
    @k0
    public static com.google.android.material.internal.a0 h(@k0 final View view) {
        if (view == null) {
            return null;
        }
        if (Build$VERSION.SDK_INT >= 18) {
            return new z(view);
        }
        return y.e(view);
    }
    
    public static float i(@j0 final View view) {
        ViewParent viewParent = view.getParent();
        float n = 0.0f;
        while (viewParent instanceof View) {
            n += androidx.core.view.j0.P((View)viewParent);
            viewParent = viewParent.getParent();
        }
        return n;
    }
    
    public static boolean j(final View view) {
        final int x = androidx.core.view.j0.X(view);
        boolean b = true;
        if (x != 1) {
            b = false;
        }
        return b;
    }
    
    public static PorterDuff$Mode k(final int n, final PorterDuff$Mode porterDuff$Mode) {
        if (n == 3) {
            return PorterDuff$Mode.SRC_OVER;
        }
        if (n == 5) {
            return PorterDuff$Mode.SRC_IN;
        }
        if (n == 9) {
            return PorterDuff$Mode.SRC_ATOP;
        }
        switch (n) {
            default: {
                return porterDuff$Mode;
            }
            case 16: {
                return PorterDuff$Mode.ADD;
            }
            case 15: {
                return PorterDuff$Mode.SCREEN;
            }
            case 14: {
                return PorterDuff$Mode.MULTIPLY;
            }
        }
    }
    
    public static void l(@k0 final View view, @j0 final ViewTreeObserver$OnGlobalLayoutListener viewTreeObserver$OnGlobalLayoutListener) {
        if (view != null) {
            m(view.getViewTreeObserver(), viewTreeObserver$OnGlobalLayoutListener);
        }
    }
    
    public static void m(@j0 final ViewTreeObserver viewTreeObserver, @j0 final ViewTreeObserver$OnGlobalLayoutListener viewTreeObserver$OnGlobalLayoutListener) {
        if (Build$VERSION.SDK_INT >= 16) {
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserver$OnGlobalLayoutListener);
        }
        else {
            viewTreeObserver.removeGlobalOnLayoutListener(viewTreeObserver$OnGlobalLayoutListener);
        }
    }
    
    public static void n(@j0 final View view) {
        if (androidx.core.view.j0.N0(view)) {
            androidx.core.view.j0.t1(view);
        }
        else {
            view.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)new View$OnAttachStateChangeListener() {
                public void onViewAttachedToWindow(@j0 final View view) {
                    view.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
                    androidx.core.view.j0.t1(view);
                }
                
                public void onViewDetachedFromWindow(final View view) {
                }
            });
        }
    }
    
    public static void o(@j0 final View view) {
        view.requestFocus();
        view.post((Runnable)new Runnable() {
            @Override
            public void run() {
                ((InputMethodManager)view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
            }
        });
    }
    
    public interface e
    {
        x0 a(final View p0, final x0 p1, final f p2);
    }
    
    public static class f
    {
        public int a;
        public int b;
        public int c;
        public int d;
        
        public f(final int a, final int b, final int c, final int d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        
        public f(@j0 final f f) {
            this.a = f.a;
            this.b = f.b;
            this.c = f.c;
            this.d = f.d;
        }
        
        public void a(final View view) {
            androidx.core.view.j0.b2(view, this.a, this.b, this.c, this.d);
        }
    }
}
