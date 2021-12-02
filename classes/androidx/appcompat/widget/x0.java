// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import android.view.accessibility.AccessibilityManager;
import androidx.core.view.j0;
import android.util.Log;
import android.view.MotionEvent;
import android.text.TextUtils;
import androidx.core.view.k0;
import android.view.ViewConfiguration;
import android.view.View;
import androidx.annotation.t0;
import android.view.View$OnAttachStateChangeListener;
import android.view.View$OnHoverListener;
import android.view.View$OnLongClickListener;

@t0({ t0.a.I })
class x0 implements View$OnLongClickListener, View$OnHoverListener, View$OnAttachStateChangeListener
{
    private static final String P = "TooltipCompatHandler";
    private static final long Q = 2500L;
    private static final long R = 15000L;
    private static final long S = 3000L;
    private static x0 T;
    private static x0 U;
    private final View G;
    private final CharSequence H;
    private final int I;
    private final Runnable J;
    private final Runnable K;
    private int L;
    private int M;
    private y0 N;
    private boolean O;
    
    private x0(final View g, final CharSequence h) {
        this.J = new Runnable() {
            @Override
            public void run() {
                x0.this.g(false);
            }
        };
        this.K = new Runnable() {
            @Override
            public void run() {
                x0.this.c();
            }
        };
        this.G = g;
        this.H = h;
        this.I = k0.c(ViewConfiguration.get(g.getContext()));
        this.b();
        g.setOnLongClickListener((View$OnLongClickListener)this);
        g.setOnHoverListener((View$OnHoverListener)this);
    }
    
    private void a() {
        this.G.removeCallbacks(this.J);
    }
    
    private void b() {
        this.L = Integer.MAX_VALUE;
        this.M = Integer.MAX_VALUE;
    }
    
    private void d() {
        this.G.postDelayed(this.J, (long)ViewConfiguration.getLongPressTimeout());
    }
    
    private static void e(final x0 t) {
        final x0 t2 = x0.T;
        if (t2 != null) {
            t2.a();
        }
        if ((x0.T = t) != null) {
            t.d();
        }
    }
    
    public static void f(final View view, final CharSequence charSequence) {
        final x0 t = x0.T;
        if (t != null && t.G == view) {
            e(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            final x0 u = x0.U;
            if (u != null && u.G == view) {
                u.c();
            }
            view.setOnLongClickListener((View$OnLongClickListener)null);
            view.setLongClickable(false);
            view.setOnHoverListener((View$OnHoverListener)null);
        }
        else {
            new x0(view, charSequence);
        }
    }
    
    private boolean h(final MotionEvent motionEvent) {
        final int l = (int)motionEvent.getX();
        final int m = (int)motionEvent.getY();
        if (Math.abs(l - this.L) <= this.I && Math.abs(m - this.M) <= this.I) {
            return false;
        }
        this.L = l;
        this.M = m;
        return true;
    }
    
    void c() {
        if (x0.U == this) {
            x0.U = null;
            final y0 n = this.N;
            if (n != null) {
                n.c();
                this.N = null;
                this.b();
                this.G.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
            }
            else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (x0.T == this) {
            e(null);
        }
        this.G.removeCallbacks(this.K);
    }
    
    void g(final boolean o) {
        if (!j0.N0(this.G)) {
            return;
        }
        e(null);
        final x0 u = x0.U;
        if (u != null) {
            u.c();
        }
        x0.U = this;
        this.O = o;
        (this.N = new y0(this.G.getContext())).e(this.G, this.L, this.M, this.O, this.H);
        this.G.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
        long n;
        if (this.O) {
            n = 2500L;
        }
        else {
            long n2;
            if ((j0.B0(this.G) & 0x1) == 0x1) {
                n2 = 3000L;
            }
            else {
                n2 = 15000L;
            }
            n = n2 - ViewConfiguration.getLongPressTimeout();
        }
        this.G.removeCallbacks(this.K);
        this.G.postDelayed(this.K, n);
    }
    
    public boolean onHover(final View view, final MotionEvent motionEvent) {
        if (this.N != null && this.O) {
            return false;
        }
        final AccessibilityManager accessibilityManager = (AccessibilityManager)this.G.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        final int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                this.b();
                this.c();
            }
        }
        else if (this.G.isEnabled() && this.N == null && this.h(motionEvent)) {
            e(this);
        }
        return false;
    }
    
    public boolean onLongClick(final View view) {
        this.L = view.getWidth() / 2;
        this.M = view.getHeight() / 2;
        this.g(true);
        return true;
    }
    
    public void onViewAttachedToWindow(final View view) {
    }
    
    public void onViewDetachedFromWindow(final View view) {
        this.c();
    }
}
