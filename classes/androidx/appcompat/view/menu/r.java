// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.view.menu;

import android.view.KeyEvent;
import android.view.Gravity;
import androidx.core.view.j0;
import android.os.Parcelable;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.FrameLayout;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import c.a;
import android.view.ViewTreeObserver;
import android.view.View;
import android.view.View$OnAttachStateChangeListener;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import androidx.appcompat.widget.h0;
import android.content.Context;
import android.view.View$OnKeyListener;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.PopupWindow$OnDismissListener;

final class r extends l implements PopupWindow$OnDismissListener, AdapterView$OnItemClickListener, n, View$OnKeyListener
{
    private static final int b0;
    private final Context H;
    private final g I;
    private final f J;
    private final boolean K;
    private final int L;
    private final int M;
    private final int N;
    final h0 O;
    final ViewTreeObserver$OnGlobalLayoutListener P;
    private final View$OnAttachStateChangeListener Q;
    private PopupWindow$OnDismissListener R;
    private View S;
    View T;
    private a U;
    ViewTreeObserver V;
    private boolean W;
    private boolean X;
    private int Y;
    private int Z;
    private boolean a0;
    
    static {
        b0 = c.a.k.t;
    }
    
    public r(final Context h, final g i, final View s, final int m, final int n, final boolean k) {
        this.P = (ViewTreeObserver$OnGlobalLayoutListener)new ViewTreeObserver$OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                if (r.this.c() && !r.this.O.L()) {
                    final View t = r.this.T;
                    if (t != null && t.isShown()) {
                        r.this.O.a();
                    }
                    else {
                        r.this.dismiss();
                    }
                }
            }
        };
        this.Q = (View$OnAttachStateChangeListener)new View$OnAttachStateChangeListener() {
            public void onViewAttachedToWindow(final View view) {
            }
            
            public void onViewDetachedFromWindow(final View view) {
                final ViewTreeObserver v = r.this.V;
                if (v != null) {
                    if (!v.isAlive()) {
                        r.this.V = view.getViewTreeObserver();
                    }
                    final r g = r.this;
                    g.V.removeGlobalOnLayoutListener(g.P);
                }
                view.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
            }
        };
        this.Z = 0;
        this.H = h;
        this.I = i;
        this.K = k;
        this.J = new f(i, LayoutInflater.from(h), k, r.b0);
        this.M = m;
        this.N = n;
        final Resources resources = h.getResources();
        this.L = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(c.a.f.x));
        this.S = s;
        this.O = new h0(h, null, m, n);
        i.c(this, h);
    }
    
    private boolean D() {
        if (this.c()) {
            return true;
        }
        if (!this.W) {
            final View s = this.S;
            if (s != null) {
                this.T = s;
                this.O.e0((PopupWindow$OnDismissListener)this);
                this.O.f0((AdapterView$OnItemClickListener)this);
                this.O.d0(true);
                final View t = this.T;
                final boolean b = this.V == null;
                final ViewTreeObserver viewTreeObserver = t.getViewTreeObserver();
                this.V = viewTreeObserver;
                if (b) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.P);
                }
                t.addOnAttachStateChangeListener(this.Q);
                this.O.S(t);
                this.O.W(this.Z);
                if (!this.X) {
                    this.Y = l.s((ListAdapter)this.J, null, this.H, this.L);
                    this.X = true;
                }
                this.O.U(this.Y);
                this.O.a0(2);
                this.O.X(this.r());
                this.O.a();
                final ListView l = this.O.l();
                l.setOnKeyListener((View$OnKeyListener)this);
                if (this.a0 && this.I.A() != null) {
                    final FrameLayout frameLayout = (FrameLayout)LayoutInflater.from(this.H).inflate(c.a.k.s, (ViewGroup)l, false);
                    final TextView textView = (TextView)frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(this.I.A());
                    }
                    frameLayout.setEnabled(false);
                    l.addHeaderView((View)frameLayout, (Object)null, false);
                }
                this.O.q((ListAdapter)this.J);
                this.O.a();
                return true;
            }
        }
        return false;
    }
    
    @Override
    public void A(final int n) {
        this.O.k(n);
    }
    
    public void a() {
        if (this.D()) {
            return;
        }
        throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    }
    
    public boolean c() {
        return !this.W && this.O.c();
    }
    
    public void d(final g g, final boolean b) {
        if (g != this.I) {
            return;
        }
        this.dismiss();
        final a u = this.U;
        if (u != null) {
            u.d(g, b);
        }
    }
    
    public void dismiss() {
        if (this.c()) {
            this.O.dismiss();
        }
    }
    
    public void e(final boolean b) {
        this.X = false;
        final f j = this.J;
        if (j != null) {
            j.notifyDataSetChanged();
        }
    }
    
    public boolean f() {
        return false;
    }
    
    public void i(final a u) {
        this.U = u;
    }
    
    public void k(final Parcelable parcelable) {
    }
    
    public ListView l() {
        return this.O.l();
    }
    
    public boolean m(final s s) {
        if (s.hasVisibleItems()) {
            final m m = new m(this.H, s, this.T, this.K, this.M, this.N);
            m.a(this.U);
            m.i(l.B(s));
            m.k(this.R);
            this.R = null;
            this.I.f(false);
            final int d = this.O.d();
            final int o = this.O.o();
            int n = d;
            if ((Gravity.getAbsoluteGravity(this.Z, j0.X(this.S)) & 0x7) == 0x5) {
                n = d + this.S.getWidth();
            }
            if (m.p(n, o)) {
                final a u = this.U;
                if (u != null) {
                    u.e(s);
                }
                return true;
            }
        }
        return false;
    }
    
    public Parcelable o() {
        return null;
    }
    
    public void onDismiss() {
        this.W = true;
        this.I.close();
        final ViewTreeObserver v = this.V;
        if (v != null) {
            if (!v.isAlive()) {
                this.V = this.T.getViewTreeObserver();
            }
            this.V.removeGlobalOnLayoutListener(this.P);
            this.V = null;
        }
        this.T.removeOnAttachStateChangeListener(this.Q);
        final PopupWindow$OnDismissListener r = this.R;
        if (r != null) {
            r.onDismiss();
        }
    }
    
    public boolean onKey(final View view, final int n, final KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && n == 82) {
            this.dismiss();
            return true;
        }
        return false;
    }
    
    @Override
    public void p(final g g) {
    }
    
    @Override
    public void t(final View s) {
        this.S = s;
    }
    
    @Override
    public void v(final boolean b) {
        this.J.e(b);
    }
    
    @Override
    public void w(final int z) {
        this.Z = z;
    }
    
    @Override
    public void x(final int n) {
        this.O.f(n);
    }
    
    @Override
    public void y(final PopupWindow$OnDismissListener r) {
        this.R = r;
    }
    
    @Override
    public void z(final boolean a0) {
        this.a0 = a0;
    }
}
