// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.behavior;

import androidx.annotation.b1;
import android.view.MotionEvent;
import androidx.annotation.k0;
import androidx.core.view.accessibility.g;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.j0;
import androidx.customview.widget.d;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.View;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V>
{
    public static final int k = 0;
    public static final int l = 1;
    public static final int m = 2;
    public static final int n = 0;
    public static final int o = 1;
    public static final int p = 2;
    private static final float q = 0.5f;
    private static final float r = 0.0f;
    private static final float s = 0.5f;
    androidx.customview.widget.d a;
    c b;
    private boolean c;
    private float d;
    private boolean e;
    int f;
    float g;
    float h;
    float i;
    private final androidx.customview.widget.d.c j;
    
    public SwipeDismissBehavior() {
        this.d = 0.0f;
        this.f = 2;
        this.g = 0.5f;
        this.h = 0.0f;
        this.i = 0.5f;
        this.j = new androidx.customview.widget.d.c() {
            private static final int d = -1;
            private int a;
            private int b = -1;
            
            private boolean a(@j0 final View view, final float n) {
                final boolean b = false;
                final boolean b2 = false;
                boolean b3 = false;
                final float n2 = fcmpl(n, 0.0f);
                if (n2 == 0) {
                    final int left = view.getLeft();
                    final int a = this.a;
                    final int round = Math.round(view.getWidth() * SwipeDismissBehavior.this.g);
                    boolean b4 = b2;
                    if (Math.abs(left - a) >= round) {
                        b4 = true;
                    }
                    return b4;
                }
                final boolean b5 = androidx.core.view.j0.X(view) == 1;
                final int f = SwipeDismissBehavior.this.f;
                if (f == 2) {
                    return true;
                }
                if (f == 0) {
                    if (b5) {
                        if (n >= 0.0f) {
                            return b3;
                        }
                    }
                    else if (n2 <= 0) {
                        return b3;
                    }
                    b3 = true;
                    return b3;
                }
                boolean b6 = b;
                if (f == 1) {
                    if (b5) {
                        b6 = b;
                        if (n2 <= 0) {
                            return b6;
                        }
                    }
                    else {
                        b6 = b;
                        if (n >= 0.0f) {
                            return b6;
                        }
                    }
                    b6 = true;
                }
                return b6;
            }
            
            @Override
            public int clampViewPositionHorizontal(@j0 final View view, final int n, int n2) {
                if (androidx.core.view.j0.X(view) == 1) {
                    n2 = 1;
                }
                else {
                    n2 = 0;
                }
                final int f = SwipeDismissBehavior.this.f;
                Label_0052: {
                    if (f == 0) {
                        if (n2 == 0) {
                            break Label_0052;
                        }
                    }
                    else {
                        if (f != 1) {
                            final int a = this.a - view.getWidth();
                            n2 = this.a;
                            n2 += view.getWidth();
                            return SwipeDismissBehavior.I(a, n, n2);
                        }
                        if (n2 != 0) {
                            break Label_0052;
                        }
                    }
                    final int a = this.a - view.getWidth();
                    n2 = this.a;
                    return SwipeDismissBehavior.I(a, n, n2);
                }
                final int a = this.a;
                n2 = view.getWidth() + a;
                return SwipeDismissBehavior.I(a, n, n2);
            }
            
            @Override
            public int clampViewPositionVertical(@j0 final View view, final int n, final int n2) {
                return view.getTop();
            }
            
            @Override
            public int getViewHorizontalDragRange(@j0 final View view) {
                return view.getWidth();
            }
            
            @Override
            public void onViewCaptured(@j0 final View view, final int b) {
                this.b = b;
                this.a = view.getLeft();
                final ViewParent parent = view.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
            }
            
            @Override
            public void onViewDragStateChanged(final int n) {
                final SwipeDismissBehavior.c b = SwipeDismissBehavior.this.b;
                if (b != null) {
                    b.onDragStateChanged(n);
                }
            }
            
            @Override
            public void onViewPositionChanged(@j0 final View view, final int n, final int n2, final int n3, final int n4) {
                final float n5 = this.a + view.getWidth() * SwipeDismissBehavior.this.h;
                final float n6 = this.a + view.getWidth() * SwipeDismissBehavior.this.i;
                final float n7 = (float)n;
                if (n7 <= n5) {
                    view.setAlpha(1.0f);
                }
                else if (n7 >= n6) {
                    view.setAlpha(0.0f);
                }
                else {
                    view.setAlpha(SwipeDismissBehavior.H(0.0f, 1.0f - SwipeDismissBehavior.K(n5, n6, n7), 1.0f));
                }
            }
            
            @Override
            public void onViewReleased(@j0 final View view, final float n, final float n2) {
                this.b = -1;
                final int width = view.getWidth();
                int a2;
                boolean b;
                if (this.a(view, n)) {
                    final int left = view.getLeft();
                    final int a = this.a;
                    if (left < a) {
                        a2 = a - width;
                    }
                    else {
                        a2 = a + width;
                    }
                    b = true;
                }
                else {
                    a2 = this.a;
                    b = false;
                }
                if (SwipeDismissBehavior.this.a.V(a2, view.getTop())) {
                    androidx.core.view.j0.n1(view, new SwipeDismissBehavior.d(view, b));
                }
                else if (b) {
                    final SwipeDismissBehavior.c b2 = SwipeDismissBehavior.this.b;
                    if (b2 != null) {
                        b2.a(view);
                    }
                }
            }
            
            @Override
            public boolean tryCaptureView(final View view, final int n) {
                final int b = this.b;
                return (b == -1 || b == n) && SwipeDismissBehavior.this.G(view);
            }
        };
    }
    
    static float H(final float a, final float b, final float b2) {
        return Math.min(Math.max(a, b), b2);
    }
    
    static int I(final int a, final int b, final int b2) {
        return Math.min(Math.max(a, b), b2);
    }
    
    private void J(final ViewGroup viewGroup) {
        if (this.a == null) {
            androidx.customview.widget.d a;
            if (this.e) {
                a = androidx.customview.widget.d.p(viewGroup, this.d, this.j);
            }
            else {
                a = androidx.customview.widget.d.q(viewGroup, this.j);
            }
            this.a = a;
        }
    }
    
    static float K(final float n, final float n2, final float n3) {
        return (n3 - n) / (n2 - n);
    }
    
    private void T(final View view) {
        androidx.core.view.j0.p1(view, 1048576);
        if (this.G(view)) {
            androidx.core.view.j0.s1(view, androidx.core.view.accessibility.d.a.z, null, new androidx.core.view.accessibility.g() {
                @Override
                public boolean a(@j0 final View view, @k0 final a a) {
                    final boolean g = SwipeDismissBehavior.this.G(view);
                    final boolean b = false;
                    if (g) {
                        final boolean b2 = androidx.core.view.j0.X(view) == 1;
                        final int f = SwipeDismissBehavior.this.f;
                        int n = 0;
                        Label_0074: {
                            if (f != 0 || !b2) {
                                n = (b ? 1 : 0);
                                if (f != 1) {
                                    break Label_0074;
                                }
                                n = (b ? 1 : 0);
                                if (b2) {
                                    break Label_0074;
                                }
                            }
                            n = 1;
                        }
                        int width = view.getWidth();
                        if (n != 0) {
                            width = -width;
                        }
                        androidx.core.view.j0.c1(view, width);
                        view.setAlpha(0.0f);
                        final SwipeDismissBehavior.c b3 = SwipeDismissBehavior.this.b;
                        if (b3 != null) {
                            b3.a(view);
                        }
                        return true;
                    }
                    return false;
                }
            });
        }
    }
    
    @Override
    public boolean E(final CoordinatorLayout coordinatorLayout, final V v, final MotionEvent motionEvent) {
        final androidx.customview.widget.d a = this.a;
        if (a != null) {
            a.M(motionEvent);
            return true;
        }
        return false;
    }
    
    public boolean G(@j0 final View view) {
        return true;
    }
    
    public int L() {
        final androidx.customview.widget.d a = this.a;
        int f;
        if (a != null) {
            f = a.F();
        }
        else {
            f = 0;
        }
        return f;
    }
    
    @b1
    @k0
    public c M() {
        return this.b;
    }
    
    public void N(final float n) {
        this.g = H(0.0f, n, 1.0f);
    }
    
    public void O(final float n) {
        this.i = H(0.0f, n, 1.0f);
    }
    
    public void P(@k0 final c b) {
        this.b = b;
    }
    
    public void Q(final float d) {
        this.d = d;
        this.e = true;
    }
    
    public void R(final float n) {
        this.h = H(0.0f, n, 1.0f);
    }
    
    public void S(final int f) {
        this.f = f;
    }
    
    @Override
    public boolean l(@j0 final CoordinatorLayout coordinatorLayout, @j0 final V v, @j0 final MotionEvent motionEvent) {
        boolean c = this.c;
        final int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.c = false;
            }
        }
        else {
            c = coordinatorLayout.G(v, (int)motionEvent.getX(), (int)motionEvent.getY());
            this.c = c;
        }
        if (c) {
            this.J(coordinatorLayout);
            return this.a.W(motionEvent);
        }
        return false;
    }
    
    @Override
    public boolean m(@j0 final CoordinatorLayout coordinatorLayout, @j0 final V v, final int n) {
        final boolean m = super.m(coordinatorLayout, v, n);
        if (androidx.core.view.j0.T(v) == 0) {
            androidx.core.view.j0.P1(v, 1);
            this.T(v);
        }
        return m;
    }
    
    public interface c
    {
        void a(final View p0);
        
        void onDragStateChanged(final int p0);
    }
    
    private class d implements Runnable
    {
        private final View G;
        private final boolean H;
        
        d(final View g, final boolean h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void run() {
            final androidx.customview.widget.d a = SwipeDismissBehavior.this.a;
            if (a != null && a.o(true)) {
                androidx.core.view.j0.n1(this.G, this);
            }
            else if (this.H) {
                final c b = SwipeDismissBehavior.this.b;
                if (b != null) {
                    b.a(this.G);
                }
            }
        }
    }
}
