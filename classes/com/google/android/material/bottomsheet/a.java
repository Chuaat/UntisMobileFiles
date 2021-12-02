// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.bottomsheet;

import android.content.res.ColorStateList;
import com.google.android.material.shape.j;
import android.graphics.drawable.ColorDrawable;
import androidx.annotation.e0;
import android.content.res.TypedArray;
import android.view.Window;
import android.graphics.Color;
import android.view.MotionEvent;
import android.view.View$OnTouchListener;
import android.os.Bundle;
import androidx.core.view.accessibility.d;
import android.view.View$OnClickListener;
import androidx.core.view.a0;
import android.view.ViewGroup$LayoutParams;
import androidx.annotation.k0;
import android.os.Build$VERSION;
import android.view.ViewGroup;
import android.util.TypedValue;
import android.content.DialogInterface$OnCancelListener;
import android.view.View;
import androidx.annotation.x0;
import android.content.Context;
import androidx.annotation.j0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.widget.FrameLayout;
import androidx.appcompat.app.i;

public class a extends i
{
    private BottomSheetBehavior<FrameLayout> I;
    private FrameLayout J;
    private CoordinatorLayout K;
    private FrameLayout L;
    boolean M;
    boolean N;
    private boolean O;
    private boolean P;
    private BottomSheetBehavior.g Q;
    private boolean R;
    @j0
    private BottomSheetBehavior.g S;
    
    public a(@j0 final Context context) {
        this(context, 0);
        this.R = this.getContext().getTheme().obtainStyledAttributes(new int[] { o2.a.c.I4 }).getBoolean(0, false);
    }
    
    public a(@j0 final Context context, @x0 final int n) {
        super(context, c(context, n));
        this.N = true;
        this.O = true;
        this.S = new BottomSheetBehavior.g() {
            @Override
            public void a(@j0 final View view, final float n) {
            }
            
            @Override
            public void b(@j0 final View view, final int n) {
                if (n == 5) {
                    com.google.android.material.bottomsheet.a.this.cancel();
                }
            }
        };
        this.e(1);
        this.R = this.getContext().getTheme().obtainStyledAttributes(new int[] { o2.a.c.I4 }).getBoolean(0, false);
    }
    
    protected a(@j0 final Context context, final boolean n, final DialogInterface$OnCancelListener dialogInterface$OnCancelListener) {
        super(context, n, dialogInterface$OnCancelListener);
        this.N = true;
        this.O = true;
        this.S = new BottomSheetBehavior.g() {
            @Override
            public void a(@j0 final View view, final float n) {
            }
            
            @Override
            public void b(@j0 final View view, final int n) {
                if (n == 5) {
                    com.google.android.material.bottomsheet.a.this.cancel();
                }
            }
        };
        this.e(1);
        this.N = n;
        this.R = this.getContext().getTheme().obtainStyledAttributes(new int[] { o2.a.c.I4 }).getBoolean(0, false);
    }
    
    private static int c(@j0 final Context context, final int n) {
        int n2 = n;
        if (n == 0) {
            final TypedValue typedValue = new TypedValue();
            if (context.getTheme().resolveAttribute(o2.a.c.M0, typedValue, true)) {
                n2 = typedValue.resourceId;
            }
            else {
                n2 = o2.a.n.V7;
            }
        }
        return n2;
    }
    
    private FrameLayout j() {
        if (this.J == null) {
            final FrameLayout j = (FrameLayout)View.inflate(this.getContext(), o2.a.k.E, (ViewGroup)null);
            this.J = j;
            this.K = (CoordinatorLayout)j.findViewById(o2.a.h.U0);
            final FrameLayout l = (FrameLayout)this.J.findViewById(o2.a.h.g1);
            this.L = l;
            (this.I = BottomSheetBehavior.f0(l)).U(this.S);
            this.I.E0(this.N);
        }
        return this.J;
    }
    
    public static void p(@j0 final View view, final boolean b) {
        if (Build$VERSION.SDK_INT >= 23) {
            final int systemUiVisibility = view.getSystemUiVisibility();
            int systemUiVisibility2;
            if (b) {
                systemUiVisibility2 = (systemUiVisibility | 0x2000);
            }
            else {
                systemUiVisibility2 = (systemUiVisibility & 0xFFFFDFFF);
            }
            view.setSystemUiVisibility(systemUiVisibility2);
        }
    }
    
    private View r(final int n, @k0 final View view, @k0 final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.j();
        final CoordinatorLayout coordinatorLayout = (CoordinatorLayout)this.J.findViewById(o2.a.h.U0);
        View inflate = view;
        if (n != 0 && (inflate = view) == null) {
            inflate = this.getLayoutInflater().inflate(n, (ViewGroup)coordinatorLayout, false);
        }
        if (this.R) {
            androidx.core.view.j0.Y1((View)this.L, new a0() {
                @Override
                public androidx.core.view.x0 a(final View view, final androidx.core.view.x0 x0) {
                    if (com.google.android.material.bottomsheet.a.this.Q != null) {
                        com.google.android.material.bottomsheet.a.this.I.u0(com.google.android.material.bottomsheet.a.this.Q);
                    }
                    if (x0 != null) {
                        final a a = com.google.android.material.bottomsheet.a.this;
                        a.Q = new f((View)a.L, x0);
                        com.google.android.material.bottomsheet.a.this.I.U(com.google.android.material.bottomsheet.a.this.Q);
                    }
                    return x0;
                }
            });
        }
        this.L.removeAllViews();
        final FrameLayout l = this.L;
        if (viewGroup$LayoutParams == null) {
            l.addView(inflate);
        }
        else {
            l.addView(inflate, viewGroup$LayoutParams);
        }
        coordinatorLayout.findViewById(o2.a.h.H5).setOnClickListener((View$OnClickListener)new View$OnClickListener() {
            public void onClick(final View view) {
                final a g = a.this;
                if (g.N && g.isShowing() && a.this.q()) {
                    a.this.cancel();
                }
            }
        });
        androidx.core.view.j0.z1((View)this.L, new androidx.core.view.a() {
            @Override
            public void g(final View view, @j0 final d d) {
                super.g(view, d);
                boolean b;
                if (a.this.N) {
                    d.a(1048576);
                    b = true;
                }
                else {
                    b = false;
                }
                d.b1(b);
            }
            
            @Override
            public boolean j(final View view, final int n, final Bundle bundle) {
                if (n == 1048576) {
                    final a d = a.this;
                    if (d.N) {
                        d.cancel();
                        return true;
                    }
                }
                return super.j(view, n, bundle);
            }
        });
        this.L.setOnTouchListener((View$OnTouchListener)new View$OnTouchListener() {
            public boolean onTouch(final View view, final MotionEvent motionEvent) {
                return true;
            }
        });
        return (View)this.J;
    }
    
    public void cancel() {
        final BottomSheetBehavior<FrameLayout> k = this.k();
        if (this.M && k.o0() != 5) {
            k.K0(5);
        }
        else {
            super.cancel();
        }
    }
    
    @j0
    public BottomSheetBehavior<FrameLayout> k() {
        if (this.I == null) {
            this.j();
        }
        return this.I;
    }
    
    public boolean l() {
        return this.M;
    }
    
    public boolean m() {
        return this.R;
    }
    
    void n() {
        this.I.u0(this.S);
    }
    
    public void o(final boolean m) {
        this.M = m;
    }
    
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        final Window window = this.getWindow();
        if (window != null && Build$VERSION.SDK_INT >= 21) {
            final boolean b = this.R && Color.alpha(window.getNavigationBarColor()) < 255;
            final FrameLayout j = this.J;
            if (j != null) {
                j.setFitsSystemWindows(b ^ true);
            }
            final CoordinatorLayout k = this.K;
            if (k != null) {
                k.setFitsSystemWindows(b ^ true);
            }
            if (b) {
                window.getDecorView().setSystemUiVisibility(768);
            }
        }
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final Window window = this.getWindow();
        if (window != null) {
            final int sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT >= 21) {
                window.setStatusBarColor(0);
                window.addFlags(Integer.MIN_VALUE);
                if (sdk_INT < 23) {
                    window.addFlags(67108864);
                }
            }
            window.setLayout(-1, -1);
        }
    }
    
    protected void onStart() {
        super.onStart();
        final BottomSheetBehavior<FrameLayout> i = this.I;
        if (i != null && i.o0() == 5) {
            this.I.K0(4);
        }
    }
    
    boolean q() {
        if (!this.P) {
            final TypedArray obtainStyledAttributes = this.getContext().obtainStyledAttributes(new int[] { 16843611 });
            this.O = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.P = true;
        }
        return this.O;
    }
    
    public void setCancelable(final boolean b) {
        super.setCancelable(b);
        if (this.N != b) {
            this.N = b;
            final BottomSheetBehavior<FrameLayout> i = this.I;
            if (i != null) {
                i.E0(b);
            }
        }
    }
    
    public void setCanceledOnTouchOutside(final boolean b) {
        super.setCanceledOnTouchOutside(b);
        if (b && !this.N) {
            this.N = true;
        }
        this.O = b;
        this.P = true;
    }
    
    @Override
    public void setContentView(@e0 final int n) {
        super.setContentView(this.r(n, null, null));
    }
    
    @Override
    public void setContentView(final View view) {
        super.setContentView(this.r(0, view, null));
    }
    
    @Override
    public void setContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        super.setContentView(this.r(0, view, viewGroup$LayoutParams));
    }
    
    private static class f extends g
    {
        private final boolean a;
        private final boolean b;
        private final androidx.core.view.x0 c;
        
        private f(@j0 final View view, @j0 final androidx.core.view.x0 c) {
            this.c = c;
            final boolean b = Build$VERSION.SDK_INT >= 23 && (view.getSystemUiVisibility() & 0x2000) != 0x0;
            this.b = b;
            final com.google.android.material.shape.j i0 = BottomSheetBehavior.f0(view).i0();
            ColorStateList list;
            if (i0 != null) {
                list = i0.y();
            }
            else {
                list = androidx.core.view.j0.L(view);
            }
            int n;
            if (list != null) {
                n = list.getDefaultColor();
            }
            else {
                if (!(view.getBackground() instanceof ColorDrawable)) {
                    this.a = b;
                    return;
                }
                n = ((ColorDrawable)view.getBackground()).getColor();
            }
            this.a = s2.a.f(n);
        }
        
        private void c(final View view) {
            int n;
            int n2;
            if (view.getTop() < this.c.r()) {
                com.google.android.material.bottomsheet.a.p(view, this.a);
                n = view.getPaddingLeft();
                n2 = this.c.r() - view.getTop();
            }
            else {
                if (view.getTop() == 0) {
                    return;
                }
                com.google.android.material.bottomsheet.a.p(view, this.b);
                n = view.getPaddingLeft();
                n2 = 0;
            }
            view.setPadding(n, n2, view.getPaddingRight(), view.getPaddingBottom());
        }
        
        @Override
        public void a(@j0 final View view, final float n) {
            this.c(view);
        }
        
        @Override
        public void b(@j0 final View view, final int n) {
            this.c(view);
        }
    }
}
