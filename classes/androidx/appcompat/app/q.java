// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.app;

import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.s;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.lang.ref.WeakReference;
import androidx.appcompat.view.menu.g;
import android.widget.AdapterView$OnItemSelectedListener;
import android.widget.SpinnerAdapter;
import android.view.ViewGroup$LayoutParams;
import android.view.LayoutInflater;
import android.graphics.drawable.Drawable;
import androidx.fragment.app.d;
import android.view.ViewGroup;
import android.view.Menu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.content.res.Configuration;
import androidx.core.view.p0;
import android.view.ContextThemeWrapper;
import android.util.TypedValue;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.Toolbar;
import android.app.Dialog;
import androidx.core.view.j0;
import androidx.core.view.r0;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import androidx.appcompat.view.b;
import java.util.ArrayList;
import androidx.appcompat.widget.m0;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.a0;
import androidx.appcompat.widget.ActionBarContainer;
import android.app.Activity;
import android.content.Context;
import androidx.core.view.s0;
import androidx.core.view.q0;
import androidx.appcompat.view.h;
import android.view.animation.Interpolator;
import androidx.annotation.t0;
import androidx.appcompat.widget.ActionBarOverlayLayout;

@t0({ t0.a.I })
public class q extends a implements ActionBarOverlayLayout.d
{
    private static final String N = "WindowDecorActionBar";
    private static final Interpolator O;
    private static final Interpolator P;
    private static final int Q = -1;
    private static final long R = 100L;
    private static final long S = 200L;
    private boolean A;
    private int B;
    boolean C;
    boolean D;
    boolean E;
    private boolean F;
    private boolean G;
    h H;
    private boolean I;
    boolean J;
    final q0 K;
    final q0 L;
    final s0 M;
    Context i;
    private Context j;
    private Activity k;
    ActionBarOverlayLayout l;
    ActionBarContainer m;
    a0 n;
    ActionBarContextView o;
    View p;
    m0 q;
    private ArrayList<e> r;
    private e s;
    private int t;
    private boolean u;
    d v;
    androidx.appcompat.view.b w;
    androidx.appcompat.view.b.a x;
    private boolean y;
    private ArrayList<androidx.appcompat.app.a.d> z;
    
    static {
        O = (Interpolator)new AccelerateInterpolator();
        P = (Interpolator)new DecelerateInterpolator();
    }
    
    public q(final Activity k, final boolean b) {
        this.r = new ArrayList<e>();
        this.t = -1;
        this.z = new ArrayList<androidx.appcompat.app.a.d>();
        this.B = 0;
        this.C = true;
        this.G = true;
        this.K = new r0() {
            @Override
            public void b(View p) {
                final q a = androidx.appcompat.app.q.this;
                if (a.C) {
                    p = a.p;
                    if (p != null) {
                        p.setTranslationY(0.0f);
                        androidx.appcompat.app.q.this.m.setTranslationY(0.0f);
                    }
                }
                androidx.appcompat.app.q.this.m.setVisibility(8);
                androidx.appcompat.app.q.this.m.setTransitioning(false);
                final q a2 = androidx.appcompat.app.q.this;
                a2.H = null;
                a2.H0();
                final ActionBarOverlayLayout l = androidx.appcompat.app.q.this.l;
                if (l != null) {
                    androidx.core.view.j0.t1((View)l);
                }
            }
        };
        this.L = new r0() {
            @Override
            public void b(final View view) {
                final q a = androidx.appcompat.app.q.this;
                a.H = null;
                a.m.requestLayout();
            }
        };
        this.M = new s0() {
            @Override
            public void a(final View view) {
                ((View)androidx.appcompat.app.q.this.m.getParent()).invalidate();
            }
        };
        this.k = k;
        final View decorView = k.getWindow().getDecorView();
        this.Q0(decorView);
        if (!b) {
            this.p = decorView.findViewById(16908290);
        }
    }
    
    public q(final Dialog dialog) {
        this.r = new ArrayList<e>();
        this.t = -1;
        this.z = new ArrayList<androidx.appcompat.app.a.d>();
        this.B = 0;
        this.C = true;
        this.G = true;
        this.K = new r0() {
            @Override
            public void b(View p) {
                final q a = androidx.appcompat.app.q.this;
                if (a.C) {
                    p = a.p;
                    if (p != null) {
                        p.setTranslationY(0.0f);
                        androidx.appcompat.app.q.this.m.setTranslationY(0.0f);
                    }
                }
                androidx.appcompat.app.q.this.m.setVisibility(8);
                androidx.appcompat.app.q.this.m.setTransitioning(false);
                final q a2 = androidx.appcompat.app.q.this;
                a2.H = null;
                a2.H0();
                final ActionBarOverlayLayout l = androidx.appcompat.app.q.this.l;
                if (l != null) {
                    androidx.core.view.j0.t1((View)l);
                }
            }
        };
        this.L = new r0() {
            @Override
            public void b(final View view) {
                final q a = androidx.appcompat.app.q.this;
                a.H = null;
                a.m.requestLayout();
            }
        };
        this.M = new s0() {
            @Override
            public void a(final View view) {
                ((View)androidx.appcompat.app.q.this.m.getParent()).invalidate();
            }
        };
        this.Q0(dialog.getWindow().getDecorView());
    }
    
    @t0({ t0.a.I })
    public q(final View view) {
        this.r = new ArrayList<e>();
        this.t = -1;
        this.z = new ArrayList<androidx.appcompat.app.a.d>();
        this.B = 0;
        this.C = true;
        this.G = true;
        this.K = new r0() {
            @Override
            public void b(View p) {
                final q a = androidx.appcompat.app.q.this;
                if (a.C) {
                    p = a.p;
                    if (p != null) {
                        p.setTranslationY(0.0f);
                        androidx.appcompat.app.q.this.m.setTranslationY(0.0f);
                    }
                }
                androidx.appcompat.app.q.this.m.setVisibility(8);
                androidx.appcompat.app.q.this.m.setTransitioning(false);
                final q a2 = androidx.appcompat.app.q.this;
                a2.H = null;
                a2.H0();
                final ActionBarOverlayLayout l = androidx.appcompat.app.q.this.l;
                if (l != null) {
                    androidx.core.view.j0.t1((View)l);
                }
            }
        };
        this.L = new r0() {
            @Override
            public void b(final View view) {
                final q a = androidx.appcompat.app.q.this;
                a.H = null;
                a.m.requestLayout();
            }
        };
        this.M = new s0() {
            @Override
            public void a(final View view) {
                ((View)androidx.appcompat.app.q.this.m.getParent()).invalidate();
            }
        };
        this.Q0(view);
    }
    
    static boolean F0(final boolean b, final boolean b2, final boolean b3) {
        return b3 || (!b && !b2);
    }
    
    private void G0() {
        if (this.s != null) {
            this.S(null);
        }
        this.r.clear();
        final m0 q = this.q;
        if (q != null) {
            q.k();
        }
        this.t = -1;
    }
    
    private void I0(final f f, int n) {
        final e element = (e)f;
        if (element.r() != null) {
            element.s(n);
            this.r.add(n, element);
            while (++n < this.r.size()) {
                this.r.get(n).s(n);
            }
            return;
        }
        throw new IllegalStateException("Action Bar Tab must have a Callback");
    }
    
    private void L0() {
        if (this.q != null) {
            return;
        }
        final m0 m0 = new m0(this.i);
        if (this.A) {
            m0.setVisibility(0);
            this.n.o(m0);
        }
        else {
            if (this.u() == 2) {
                m0.setVisibility(0);
                final ActionBarOverlayLayout l = this.l;
                if (l != null) {
                    androidx.core.view.j0.t1((View)l);
                }
            }
            else {
                m0.setVisibility(8);
            }
            this.m.setTabContainer(m0);
        }
        this.q = m0;
    }
    
    private a0 M0(final View view) {
        if (view instanceof a0) {
            return (a0)view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar)view).getWrapper();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        String simpleName;
        if (view != null) {
            simpleName = view.getClass().getSimpleName();
        }
        else {
            simpleName = "null";
        }
        sb.append(simpleName);
        throw new IllegalStateException(sb.toString());
    }
    
    private void P0() {
        if (this.F) {
            this.F = false;
            final ActionBarOverlayLayout l = this.l;
            if (l != null) {
                l.setShowingForActionMode(false);
            }
            this.U0(false);
        }
    }
    
    private void Q0(final View view) {
        final ActionBarOverlayLayout l = (ActionBarOverlayLayout)view.findViewById(c.a.h.m0);
        this.l = l;
        if (l != null) {
            l.setActionBarVisibilityCallback((ActionBarOverlayLayout.d)this);
        }
        this.n = this.M0(view.findViewById(c.a.h.H));
        this.o = (ActionBarContextView)view.findViewById(c.a.h.P);
        final ActionBarContainer m = (ActionBarContainer)view.findViewById(c.a.h.J);
        this.m = m;
        final a0 n = this.n;
        if (n != null && this.o != null && m != null) {
            this.i = n.getContext();
            final boolean b = (this.n.L() & 0x4) != 0x0;
            if (b) {
                this.u = true;
            }
            final androidx.appcompat.view.a b2 = androidx.appcompat.view.a.b(this.i);
            this.m0(b2.a() || b);
            this.R0(b2.g());
            final TypedArray obtainStyledAttributes = this.i.obtainStyledAttributes((AttributeSet)null, c.a.n.a, c.a.c.f, 0);
            if (obtainStyledAttributes.getBoolean(c.a.n.p, false)) {
                this.h0(true);
            }
            final int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(c.a.n.n, 0);
            if (dimensionPixelSize != 0) {
                this.f0((float)dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName());
        sb.append(" can only be used with a compatible window decor layout");
        throw new IllegalStateException(sb.toString());
    }
    
    private void R0(final boolean a) {
        if (!(this.A = a)) {
            this.n.o(null);
            this.m.setTabContainer(this.q);
        }
        else {
            this.m.setTabContainer(null);
            this.n.o(this.q);
        }
        final int u = this.u();
        final boolean b = true;
        final boolean b2 = u == 2;
        final m0 q = this.q;
        if (q != null) {
            if (b2) {
                q.setVisibility(0);
                final ActionBarOverlayLayout l = this.l;
                if (l != null) {
                    androidx.core.view.j0.t1((View)l);
                }
            }
            else {
                q.setVisibility(8);
            }
        }
        this.n.T(!this.A && b2);
        this.l.setHasNonEmbeddedTabs(!this.A && b2 && b);
    }
    
    private boolean S0() {
        return androidx.core.view.j0.T0((View)this.m);
    }
    
    private void T0() {
        if (!this.F) {
            this.F = true;
            final ActionBarOverlayLayout l = this.l;
            if (l != null) {
                l.setShowingForActionMode(true);
            }
            this.U0(false);
        }
    }
    
    private void U0(final boolean b) {
        if (F0(this.D, this.E, this.F)) {
            if (!this.G) {
                this.G = true;
                this.K0(b);
            }
        }
        else if (this.G) {
            this.G = false;
            this.J0(b);
        }
    }
    
    @Override
    public Context A() {
        if (this.j == null) {
            final TypedValue typedValue = new TypedValue();
            this.i.getTheme().resolveAttribute(c.a.c.k, typedValue, true);
            final int resourceId = typedValue.resourceId;
            if (resourceId != 0) {
                this.j = (Context)new ContextThemeWrapper(this.i, resourceId);
            }
            else {
                this.j = this.i;
            }
        }
        return this.j;
    }
    
    @Override
    public void A0(final CharSequence title) {
        this.n.setTitle(title);
    }
    
    @Override
    public CharSequence B() {
        return this.n.getTitle();
    }
    
    @Override
    public void B0(final CharSequence windowTitle) {
        this.n.setWindowTitle(windowTitle);
    }
    
    @Override
    public void C() {
        if (!this.D) {
            this.D = true;
            this.U0(false);
        }
    }
    
    @Override
    public void C0() {
        if (this.D) {
            this.U0(this.D = false);
        }
    }
    
    @Override
    public androidx.appcompat.view.b D0(final androidx.appcompat.view.b.a a) {
        final d v = this.v;
        if (v != null) {
            v.c();
        }
        this.l.setHideOnContentScrollEnabled(false);
        this.o.t();
        final d v2 = new d(this.o.getContext(), a);
        if (v2.u()) {
            (this.v = v2).k();
            this.o.q(v2);
            this.E0(true);
            this.o.sendAccessibilityEvent(32);
            return v2;
        }
        return null;
    }
    
    @Override
    public boolean E() {
        return this.l.A();
    }
    
    public void E0(final boolean b) {
        if (b) {
            this.T0();
        }
        else {
            this.P0();
        }
        if (this.S0()) {
            p0 p;
            p0 p2;
            if (b) {
                p = this.n.C(4, 100L);
                p2 = this.o.n(0, 200L);
            }
            else {
                p2 = this.n.C(0, 200L);
                p = this.o.n(8, 100L);
            }
            final h h = new h();
            h.d(p, p2);
            h.h();
        }
        else if (b) {
            this.n.setVisibility(4);
            this.o.setVisibility(0);
        }
        else {
            this.n.setVisibility(0);
            this.o.setVisibility(8);
        }
    }
    
    @Override
    public boolean F() {
        final int r = this.r();
        return this.G && (r == 0 || this.s() < r);
    }
    
    @Override
    public boolean G() {
        final a0 n = this.n;
        return n != null && n.r();
    }
    
    @Override
    public f H() {
        return new e();
    }
    
    void H0() {
        final androidx.appcompat.view.b.a x = this.x;
        if (x != null) {
            x.a(this.w);
            this.w = null;
            this.x = null;
        }
    }
    
    @Override
    public void I(final Configuration configuration) {
        this.R0(androidx.appcompat.view.a.b(this.i).g());
    }
    
    public void J0(final boolean b) {
        final h h = this.H;
        if (h != null) {
            h.a();
        }
        if (this.B == 0 && (this.I || b)) {
            this.m.setAlpha(1.0f);
            this.m.setTransitioning(true);
            final h h2 = new h();
            float n2;
            final float n = n2 = (float)(-this.m.getHeight());
            if (b) {
                final int[] array2;
                final int[] array = array2 = new int[2];
                array2[1] = (array2[0] = 0);
                this.m.getLocationInWindow(array);
                n2 = n - array[1];
            }
            final p0 z = androidx.core.view.j0.f((View)this.m).z(n2);
            z.v(this.M);
            h2.c(z);
            if (this.C) {
                final View p = this.p;
                if (p != null) {
                    h2.c(androidx.core.view.j0.f(p).z(n2));
                }
            }
            h2.f(androidx.appcompat.app.q.O);
            h2.e(250L);
            h2.g(this.K);
            (this.H = h2).h();
        }
        else {
            this.K.b(null);
        }
    }
    
    @Override
    public boolean K(final int n, final KeyEvent keyEvent) {
        final d v = this.v;
        if (v == null) {
            return false;
        }
        final Menu e = v.e();
        if (e != null) {
            int deviceId;
            if (keyEvent != null) {
                deviceId = keyEvent.getDeviceId();
            }
            else {
                deviceId = -1;
            }
            final int keyboardType = KeyCharacterMap.load(deviceId).getKeyboardType();
            boolean qwertyMode = true;
            if (keyboardType == 1) {
                qwertyMode = false;
            }
            e.setQwertyMode(qwertyMode);
            return e.performShortcut(n, keyEvent, 0);
        }
        return false;
    }
    
    public void K0(final boolean b) {
        final h h = this.H;
        if (h != null) {
            h.a();
        }
        this.m.setVisibility(0);
        if (this.B == 0 && (this.I || b)) {
            this.m.setTranslationY(0.0f);
            float n2;
            final float n = n2 = (float)(-this.m.getHeight());
            if (b) {
                final int[] array2;
                final int[] array = array2 = new int[2];
                array2[1] = (array2[0] = 0);
                this.m.getLocationInWindow(array);
                n2 = n - array[1];
            }
            this.m.setTranslationY(n2);
            final h h2 = new h();
            final p0 z = androidx.core.view.j0.f((View)this.m).z(0.0f);
            z.v(this.M);
            h2.c(z);
            if (this.C) {
                final View p = this.p;
                if (p != null) {
                    p.setTranslationY(n2);
                    h2.c(androidx.core.view.j0.f(this.p).z(0.0f));
                }
            }
            h2.f(androidx.appcompat.app.q.P);
            h2.e(250L);
            h2.g(this.L);
            (this.H = h2).h();
        }
        else {
            this.m.setAlpha(1.0f);
            this.m.setTranslationY(0.0f);
            if (this.C) {
                final View p2 = this.p;
                if (p2 != null) {
                    p2.setTranslationY(0.0f);
                }
            }
            this.L.b(null);
        }
        final ActionBarOverlayLayout l = this.l;
        if (l != null) {
            androidx.core.view.j0.t1((View)l);
        }
    }
    
    @Override
    public void N() {
        this.G0();
    }
    
    public boolean N0() {
        return this.n.f();
    }
    
    @Override
    public void O(final androidx.appcompat.app.a.d o) {
        this.z.remove(o);
    }
    
    public boolean O0() {
        return this.n.h();
    }
    
    @Override
    public void P(final f f) {
        this.Q(f.d());
    }
    
    @Override
    public void Q(final int index) {
        if (this.q == null) {
            return;
        }
        final e s = this.s;
        int n;
        if (s != null) {
            n = s.d();
        }
        else {
            n = this.t;
        }
        this.q.l(index);
        final e e = this.r.remove(index);
        if (e != null) {
            e.s(-1);
        }
        for (int size = this.r.size(), i = index; i < size; ++i) {
            this.r.get(i).s(i);
        }
        if (n == index) {
            f f;
            if (this.r.isEmpty()) {
                f = null;
            }
            else {
                f = this.r.get(Math.max(0, index - 1));
            }
            this.S(f);
        }
    }
    
    public boolean R() {
        final ViewGroup g = this.n.G();
        if (g != null && !g.hasFocus()) {
            g.requestFocus();
            return true;
        }
        return false;
    }
    
    @Override
    public void S(final f f) {
        final int u = this.u();
        int n = -1;
        if (u != 2) {
            if (f != null) {
                n = f.d();
            }
            this.t = n;
            return;
        }
        androidx.fragment.app.a0 x;
        if (this.k instanceof androidx.fragment.app.d && !this.n.G().isInEditMode()) {
            x = ((androidx.fragment.app.d)this.k).getSupportFragmentManager().r().x();
        }
        else {
            x = null;
        }
        final e s = this.s;
        if (s == f) {
            if (s != null) {
                s.r().c(this.s, x);
                this.q.c(f.d());
            }
        }
        else {
            final m0 q = this.q;
            if (f != null) {
                n = f.d();
            }
            q.setTabSelected(n);
            final e s2 = this.s;
            if (s2 != null) {
                s2.r().b(this.s, x);
            }
            final e s3 = (e)f;
            if ((this.s = s3) != null) {
                s3.r().a(this.s, x);
            }
        }
        if (x != null && !x.B()) {
            x.r();
        }
    }
    
    @Override
    public void T(final Drawable primaryBackground) {
        this.m.setPrimaryBackground(primaryBackground);
    }
    
    @Override
    public void U(final int n) {
        this.V(LayoutInflater.from(this.A()).inflate(n, this.n.G(), false));
    }
    
    @Override
    public void V(final View view) {
        this.n.O(view);
    }
    
    @Override
    public void W(final View view, final b layoutParams) {
        view.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        this.n.O(view);
    }
    
    @Override
    public void X(final boolean b) {
        if (!this.u) {
            this.Y(b);
        }
    }
    
    @Override
    public void Y(final boolean b) {
        int n;
        if (b) {
            n = 4;
        }
        else {
            n = 0;
        }
        this.a0(n, 4);
    }
    
    @Override
    public void Z(final int n) {
        if ((n & 0x4) != 0x0) {
            this.u = true;
        }
        this.n.s(n);
    }
    
    @Override
    public void a() {
        if (this.E) {
            this.E = false;
            this.U0(true);
        }
    }
    
    @Override
    public void a0(final int n, final int n2) {
        final int l = this.n.L();
        if ((n2 & 0x4) != 0x0) {
            this.u = true;
        }
        this.n.s((n & n2) | (~n2 & l));
    }
    
    @Override
    public void b() {
    }
    
    @Override
    public void b0(final boolean b) {
        int n;
        if (b) {
            n = 16;
        }
        else {
            n = 0;
        }
        this.a0(n, 16);
    }
    
    @Override
    public void c(final boolean c) {
        this.C = c;
    }
    
    @Override
    public void c0(final boolean b) {
        int n;
        if (b) {
            n = 2;
        }
        else {
            n = 0;
        }
        this.a0(n, 2);
    }
    
    @Override
    public void d() {
        if (!this.E) {
            this.U0(this.E = true);
        }
    }
    
    @Override
    public void d0(final boolean b) {
        int n;
        if (b) {
            n = 8;
        }
        else {
            n = 0;
        }
        this.a0(n, 8);
    }
    
    @Override
    public void e() {
        final h h = this.H;
        if (h != null) {
            h.a();
            this.H = null;
        }
    }
    
    @Override
    public void e0(final boolean b) {
        this.a0(b ? 1 : 0, 1);
    }
    
    @Override
    public void f(final int b) {
        this.B = b;
    }
    
    @Override
    public void f0(final float n) {
        androidx.core.view.j0.L1((View)this.m, n);
    }
    
    @Override
    public void g(final androidx.appcompat.app.a.d e) {
        this.z.add(e);
    }
    
    @Override
    public void g0(final int actionBarHideOffset) {
        if (actionBarHideOffset != 0 && !this.l.B()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to set a non-zero hide offset");
        }
        this.l.setActionBarHideOffset(actionBarHideOffset);
    }
    
    @Override
    public void h(final f f) {
        this.k(f, this.r.isEmpty());
    }
    
    @Override
    public void h0(final boolean b) {
        if (b && !this.l.B()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.J = b;
        this.l.setHideOnContentScrollEnabled(b);
    }
    
    @Override
    public void i(final f f, final int n) {
        this.j(f, n, this.r.isEmpty());
    }
    
    @Override
    public void i0(final int n) {
        this.n.N(n);
    }
    
    @Override
    public void j(final f f, final int n, final boolean b) {
        this.L0();
        this.q.a(f, n, b);
        this.I0(f, n);
        if (b) {
            this.S(f);
        }
    }
    
    @Override
    public void j0(final CharSequence charSequence) {
        this.n.t(charSequence);
    }
    
    @Override
    public void k(final f f, final boolean b) {
        this.L0();
        this.q.b(f, b);
        this.I0(f, this.r.size());
        if (b) {
            this.S(f);
        }
    }
    
    @Override
    public void k0(final int n) {
        this.n.E(n);
    }
    
    @Override
    public void l0(final Drawable drawable) {
        this.n.S(drawable);
    }
    
    @Override
    public boolean m() {
        final a0 n = this.n;
        if (n != null && n.q()) {
            this.n.collapseActionView();
            return true;
        }
        return false;
    }
    
    @Override
    public void m0(final boolean b) {
        this.n.H(b);
    }
    
    @Override
    public void n(final boolean y) {
        if (y == this.y) {
            return;
        }
        this.y = y;
        for (int size = this.z.size(), i = 0; i < size; ++i) {
            this.z.get(i).a(y);
        }
    }
    
    @Override
    public void n0(final int icon) {
        this.n.setIcon(icon);
    }
    
    @Override
    public View o() {
        return this.n.n();
    }
    
    @Override
    public void o0(final Drawable icon) {
        this.n.setIcon(icon);
    }
    
    @Override
    public int p() {
        return this.n.L();
    }
    
    @Override
    public void p0(final SpinnerAdapter spinnerAdapter, final androidx.appcompat.app.a.e e) {
        this.n.I(spinnerAdapter, (AdapterView$OnItemSelectedListener)new l(e));
    }
    
    @Override
    public float q() {
        return androidx.core.view.j0.P((View)this.m);
    }
    
    @Override
    public void q0(final int logo) {
        this.n.setLogo(logo);
    }
    
    @Override
    public int r() {
        return this.m.getHeight();
    }
    
    @Override
    public void r0(final Drawable drawable) {
        this.n.p(drawable);
    }
    
    @Override
    public int s() {
        return this.l.getActionBarHideOffset();
    }
    
    @Override
    public void s0(final int n) {
        final int a = this.n.A();
        if (a == 2) {
            this.t = this.v();
            this.S(null);
            this.q.setVisibility(8);
        }
        if (a != n && !this.A) {
            final ActionBarOverlayLayout l = this.l;
            if (l != null) {
                androidx.core.view.j0.t1((View)l);
            }
        }
        this.n.D(n);
        final boolean b = false;
        if (n == 2) {
            this.L0();
            this.q.setVisibility(0);
            final int t = this.t;
            if (t != -1) {
                this.t0(t);
                this.t = -1;
            }
        }
        this.n.T(n == 2 && !this.A);
        final ActionBarOverlayLayout i = this.l;
        boolean hasNonEmbeddedTabs = b;
        if (n == 2) {
            hasNonEmbeddedTabs = b;
            if (!this.A) {
                hasNonEmbeddedTabs = true;
            }
        }
        i.setHasNonEmbeddedTabs(hasNonEmbeddedTabs);
    }
    
    @Override
    public int t() {
        final int a = this.n.A();
        if (a == 1) {
            return this.n.Q();
        }
        if (a != 2) {
            return 0;
        }
        return this.r.size();
    }
    
    @Override
    public void t0(final int index) {
        final int a = this.n.A();
        if (a != 1) {
            if (a != 2) {
                throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
            }
            this.S(this.r.get(index));
        }
        else {
            this.n.x(index);
        }
    }
    
    @Override
    public int u() {
        return this.n.A();
    }
    
    @Override
    public void u0(final boolean i) {
        if (!(this.I = i)) {
            final h h = this.H;
            if (h != null) {
                h.a();
            }
        }
    }
    
    @Override
    public int v() {
        final int a = this.n.A();
        if (a == 1) {
            return this.n.M();
        }
        int d = -1;
        if (a != 2) {
            return -1;
        }
        final e s = this.s;
        if (s != null) {
            d = s.d();
        }
        return d;
    }
    
    @Override
    public void v0(final Drawable drawable) {
    }
    
    @Override
    public f w() {
        return this.s;
    }
    
    @Override
    public void w0(final Drawable stackedBackground) {
        this.m.setStackedBackground(stackedBackground);
    }
    
    @Override
    public CharSequence x() {
        return this.n.K();
    }
    
    @Override
    public void x0(final int n) {
        this.y0(this.i.getString(n));
    }
    
    @Override
    public f y(final int index) {
        return this.r.get(index);
    }
    
    @Override
    public void y0(final CharSequence charSequence) {
        this.n.u(charSequence);
    }
    
    @Override
    public int z() {
        return this.r.size();
    }
    
    @Override
    public void z0(final int n) {
        this.A0(this.i.getString(n));
    }
    
    @t0({ t0.a.I })
    public class d extends b implements g.a
    {
        private final Context I;
        private final g J;
        private a K;
        private WeakReference<View> L;
        
        public d(final Context i, final a k) {
            this.I = i;
            this.K = k;
            (this.J = new g(i).Z(1)).X((g.a)this);
        }
        
        @Override
        public boolean a(@androidx.annotation.j0 final g g, @androidx.annotation.j0 final MenuItem menuItem) {
            final a k = this.K;
            return k != null && k.d(this, menuItem);
        }
        
        @Override
        public void b(@androidx.annotation.j0 final g g) {
            if (this.K == null) {
                return;
            }
            this.k();
            q.this.o.o();
        }
        
        @Override
        public void c() {
            final q m = q.this;
            if (m.v != this) {
                return;
            }
            if (!q.F0(m.D, m.E, false)) {
                final q i = q.this;
                i.w = this;
                i.x = this.K;
            }
            else {
                this.K.a(this);
            }
            this.K = null;
            q.this.E0(false);
            q.this.o.p();
            q.this.n.G().sendAccessibilityEvent(32);
            final q j = q.this;
            j.l.setHideOnContentScrollEnabled(j.J);
            q.this.v = null;
        }
        
        @Override
        public View d() {
            final WeakReference<View> l = this.L;
            View view;
            if (l != null) {
                view = l.get();
            }
            else {
                view = null;
            }
            return view;
        }
        
        @Override
        public Menu e() {
            return (Menu)this.J;
        }
        
        @Override
        public MenuInflater f() {
            return new androidx.appcompat.view.g(this.I);
        }
        
        @Override
        public CharSequence g() {
            return q.this.o.getSubtitle();
        }
        
        @Override
        public CharSequence i() {
            return q.this.o.getTitle();
        }
        
        @Override
        public void k() {
            if (q.this.v != this) {
                return;
            }
            this.J.m0();
            try {
                this.K.c(this, (Menu)this.J);
            }
            finally {
                this.J.l0();
            }
        }
        
        @Override
        public boolean l() {
            return q.this.o.s();
        }
        
        @Override
        public void n(final View view) {
            q.this.o.setCustomView(view);
            this.L = new WeakReference<View>(view);
        }
        
        @Override
        public void o(final int n) {
            this.p(q.this.i.getResources().getString(n));
        }
        
        @Override
        public void p(final CharSequence subtitle) {
            q.this.o.setSubtitle(subtitle);
        }
        
        @Override
        public void r(final int n) {
            this.s(q.this.i.getResources().getString(n));
        }
        
        @Override
        public void s(final CharSequence title) {
            q.this.o.setTitle(title);
        }
        
        @Override
        public void t(final boolean titleOptional) {
            super.t(titleOptional);
            q.this.o.setTitleOptional(titleOptional);
        }
        
        public boolean u() {
            this.J.m0();
            try {
                return this.K.b(this, (Menu)this.J);
            }
            finally {
                this.J.l0();
            }
        }
        
        public void v(final g g, final boolean b) {
        }
        
        public void w(final s s) {
        }
        
        public boolean x(final s s) {
            if (this.K == null) {
                return false;
            }
            if (!s.hasVisibleItems()) {
                return true;
            }
            new m(q.this.A(), s).l();
            return true;
        }
    }
    
    @t0({ t0.a.I })
    public class e extends f
    {
        private g b;
        private Object c;
        private Drawable d;
        private CharSequence e;
        private CharSequence f;
        private int g;
        private View h;
        
        public e() {
            this.g = -1;
        }
        
        @Override
        public CharSequence a() {
            return this.f;
        }
        
        @Override
        public View b() {
            return this.h;
        }
        
        @Override
        public Drawable c() {
            return this.d;
        }
        
        @Override
        public int d() {
            return this.g;
        }
        
        @Override
        public Object e() {
            return this.c;
        }
        
        @Override
        public CharSequence f() {
            return this.e;
        }
        
        @Override
        public void g() {
            androidx.appcompat.app.q.this.S(this);
        }
        
        @Override
        public f h(final int n) {
            return this.i(androidx.appcompat.app.q.this.i.getResources().getText(n));
        }
        
        @Override
        public f i(final CharSequence f) {
            this.f = f;
            final int g = this.g;
            if (g >= 0) {
                androidx.appcompat.app.q.this.q.m(g);
            }
            return this;
        }
        
        @Override
        public f j(final int n) {
            return this.k(LayoutInflater.from(androidx.appcompat.app.q.this.A()).inflate(n, (ViewGroup)null));
        }
        
        @Override
        public f k(final View h) {
            this.h = h;
            final int g = this.g;
            if (g >= 0) {
                androidx.appcompat.app.q.this.q.m(g);
            }
            return this;
        }
        
        @Override
        public f l(final int n) {
            return this.m(androidx.appcompat.content.res.a.d(androidx.appcompat.app.q.this.i, n));
        }
        
        @Override
        public f m(final Drawable d) {
            this.d = d;
            final int g = this.g;
            if (g >= 0) {
                androidx.appcompat.app.q.this.q.m(g);
            }
            return this;
        }
        
        @Override
        public f n(final g b) {
            this.b = b;
            return this;
        }
        
        @Override
        public f o(final Object c) {
            this.c = c;
            return this;
        }
        
        @Override
        public f p(final int n) {
            return this.q(androidx.appcompat.app.q.this.i.getResources().getText(n));
        }
        
        @Override
        public f q(final CharSequence e) {
            this.e = e;
            final int g = this.g;
            if (g >= 0) {
                androidx.appcompat.app.q.this.q.m(g);
            }
            return this;
        }
        
        public g r() {
            return this.b;
        }
        
        public void s(final int g) {
            this.g = g;
        }
    }
}
