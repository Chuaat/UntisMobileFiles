// 
// Decompiled by Procyon v0.5.36
// 

package androidx.customview.widget;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.core.view.accessibility.e;
import java.util.List;
import java.util.ArrayList;
import android.view.accessibility.AccessibilityRecord;
import androidx.core.view.accessibility.f;
import android.view.accessibility.AccessibilityEvent;
import android.os.Bundle;
import androidx.annotation.k0;
import android.view.ViewParent;
import androidx.annotation.j0;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.collection.n;
import androidx.core.view.accessibility.d;
import android.graphics.Rect;

public abstract class a extends androidx.core.view.a
{
    public static final int n = Integer.MIN_VALUE;
    public static final int o = -1;
    private static final String p = "android.view.View";
    private static final Rect q;
    private static final b.a<d> r;
    private static final b.b<n<d>, d> s;
    private final Rect d;
    private final Rect e;
    private final Rect f;
    private final int[] g;
    private final AccessibilityManager h;
    private final View i;
    private c j;
    int k;
    int l;
    private int m;
    
    static {
        q = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        r = new b.a<d>() {
            public void b(final d d, final Rect rect) {
                d.r(rect);
            }
        };
        s = new b.b<n<d>, d>() {
            public d c(final n<d> n, final int n2) {
                return n.D(n2);
            }
            
            public int d(final n<d> n) {
                return n.C();
            }
        };
    }
    
    public a(@j0 final View i) {
        this.d = new Rect();
        this.e = new Rect();
        this.f = new Rect();
        this.g = new int[2];
        this.k = Integer.MIN_VALUE;
        this.l = Integer.MIN_VALUE;
        this.m = Integer.MIN_VALUE;
        if (i != null) {
            this.i = i;
            this.h = (AccessibilityManager)i.getContext().getSystemService("accessibility");
            i.setFocusable(true);
            if (androidx.core.view.j0.T(i) == 0) {
                androidx.core.view.j0.P1(i, 1);
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }
    
    private static Rect E(@j0 final View view, final int n, @j0 final Rect rect) {
        final int width = view.getWidth();
        final int height = view.getHeight();
        if (n != 17) {
            if (n != 33) {
                if (n != 66) {
                    if (n != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    rect.set(0, -1, width, -1);
                }
                else {
                    rect.set(-1, 0, -1, height);
                }
            }
            else {
                rect.set(0, height, width, height);
            }
        }
        else {
            rect.set(width, 0, width, height);
        }
        return rect;
    }
    
    private boolean I(final Rect rect) {
        boolean b2;
        final boolean b = b2 = false;
        if (rect != null) {
            if (rect.isEmpty()) {
                b2 = b;
            }
            else {
                if (this.i.getWindowVisibility() != 0) {
                    return false;
                }
                View i = this.i;
                View view;
                do {
                    final ViewParent parent = i.getParent();
                    if (parent instanceof View) {
                        view = (View)parent;
                        if (view.getAlpha() <= 0.0f) {
                            break;
                        }
                        i = view;
                    }
                    else {
                        b2 = b;
                        if (parent != null) {
                            b2 = true;
                            return b2;
                        }
                        return b2;
                    }
                } while (view.getVisibility() == 0);
                return false;
            }
        }
        return b2;
    }
    
    private static int J(final int n) {
        if (n == 19) {
            return 33;
        }
        if (n == 21) {
            return 17;
        }
        if (n != 22) {
            return 130;
        }
        return 66;
    }
    
    private boolean K(int r, @k0 final Rect rect) {
        final n<d> y = this.y();
        final int l = this.l;
        final int n = Integer.MIN_VALUE;
        d d;
        if (l == Integer.MIN_VALUE) {
            d = null;
        }
        else {
            d = y.j(l);
        }
        d d2;
        if (r != 1 && r != 2) {
            if (r != 17 && r != 33 && r != 66 && r != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            final Rect rect2 = new Rect();
            final int i = this.l;
            if (i != Integer.MIN_VALUE) {
                this.z(i, rect2);
            }
            else if (rect != null) {
                rect2.set(rect);
            }
            else {
                E(this.i, r, rect2);
            }
            d2 = androidx.customview.widget.b.c(y, a.s, a.r, d, rect2, r);
        }
        else {
            d2 = androidx.customview.widget.b.d(y, a.s, a.r, d, r, androidx.core.view.j0.X(this.i) == 1, false);
        }
        final d d3 = d2;
        if (d3 == null) {
            r = n;
        }
        else {
            r = y.r(y.n(d3));
        }
        return this.X(r);
    }
    
    private boolean U(final int n, final int n2, final Bundle bundle) {
        if (n2 == 1) {
            return this.X(n);
        }
        if (n2 == 2) {
            return this.o(n);
        }
        if (n2 == 64) {
            return this.W(n);
        }
        if (n2 != 128) {
            return this.N(n, n2, bundle);
        }
        return this.n(n);
    }
    
    private boolean V(final int n, final Bundle bundle) {
        return androidx.core.view.j0.j1(this.i, n, bundle);
    }
    
    private boolean W(final int k) {
        if (this.h.isEnabled()) {
            if (this.h.isTouchExplorationEnabled()) {
                final int i = this.k;
                if (i != k) {
                    if (i != Integer.MIN_VALUE) {
                        this.n(i);
                    }
                    this.k = k;
                    this.i.invalidate();
                    this.Y(k, 32768);
                    return true;
                }
            }
        }
        return false;
    }
    
    private void Z(final int m) {
        final int i = this.m;
        if (i == m) {
            return;
        }
        this.Y(this.m = m, 128);
        this.Y(i, 256);
    }
    
    private boolean n(final int n) {
        if (this.k == n) {
            this.k = Integer.MIN_VALUE;
            this.i.invalidate();
            this.Y(n, 65536);
            return true;
        }
        return false;
    }
    
    private boolean p() {
        final int l = this.l;
        return l != Integer.MIN_VALUE && this.N(l, 16, null);
    }
    
    private AccessibilityEvent q(final int n, final int n2) {
        if (n != -1) {
            return this.r(n, n2);
        }
        return this.s(n2);
    }
    
    private AccessibilityEvent r(final int n, final int n2) {
        final AccessibilityEvent obtain = AccessibilityEvent.obtain(n2);
        final d l = this.L(n);
        obtain.getText().add(l.T());
        obtain.setContentDescription(l.z());
        obtain.setScrollable(l.w0());
        obtain.setPassword(l.u0());
        obtain.setEnabled(l.n0());
        obtain.setChecked(l.h0());
        this.P(n, obtain);
        if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        obtain.setClassName(l.v());
        androidx.core.view.accessibility.f.Y((AccessibilityRecord)obtain, this.i, n);
        obtain.setPackageName((CharSequence)this.i.getContext().getPackageName());
        return obtain;
    }
    
    private AccessibilityEvent s(final int n) {
        final AccessibilityEvent obtain = AccessibilityEvent.obtain(n);
        this.i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }
    
    @j0
    private d t(int i) {
        final d b0 = androidx.core.view.accessibility.d.B0();
        b0.e1(true);
        b0.g1(true);
        b0.U0("android.view.View");
        final Rect q = a.q;
        b0.P0(q);
        b0.Q0(q);
        b0.x1(this.i);
        this.R(i, b0);
        if (b0.T() == null && b0.z() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        b0.r(this.e);
        if (this.e.equals((Object)q)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        final int p = b0.p();
        if ((p & 0x40) != 0x0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((p & 0x80) == 0x0) {
            b0.v1(this.i.getContext().getPackageName());
            b0.H1(this.i, i);
            if (this.k == i) {
                b0.N0(true);
                b0.a(128);
            }
            else {
                b0.N0(false);
                b0.a(64);
            }
            final boolean b2 = this.l == i;
            if (b2) {
                b0.a(2);
            }
            else if (b0.o0()) {
                b0.a(1);
            }
            b0.h1(b2);
            this.i.getLocationOnScreen(this.g);
            b0.s(this.d);
            if (this.d.equals((Object)q)) {
                b0.r(this.d);
                if (b0.b != -1) {
                    d b3;
                    Rect d;
                    Rect e;
                    for (b3 = androidx.core.view.accessibility.d.B0(), i = b0.b; i != -1; i = b3.b) {
                        b3.y1(this.i, -1);
                        b3.P0(a.q);
                        this.R(i, b3);
                        b3.r(this.e);
                        d = this.d;
                        e = this.e;
                        d.offset(e.left, e.top);
                    }
                    b3.H0();
                }
                this.d.offset(this.g[0] - this.i.getScrollX(), this.g[1] - this.i.getScrollY());
            }
            if (this.i.getLocalVisibleRect(this.f)) {
                this.f.offset(this.g[0] - this.i.getScrollX(), this.g[1] - this.i.getScrollY());
                if (this.d.intersect(this.f)) {
                    b0.Q0(this.d);
                    if (this.I(this.d)) {
                        b0.T1(true);
                    }
                }
            }
            return b0;
        }
        throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
    }
    
    @j0
    private d u() {
        final d c0 = androidx.core.view.accessibility.d.C0(this.i);
        androidx.core.view.j0.g1(this.i, c0);
        final ArrayList<Integer> list = new ArrayList<Integer>();
        this.D(list);
        if (c0.u() > 0 && list.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        for (int i = 0; i < list.size(); ++i) {
            c0.d(this.i, list.get(i));
        }
        return c0;
    }
    
    private n<d> y() {
        final ArrayList<Integer> list = new ArrayList<Integer>();
        this.D(list);
        final n<d> n = new n<d>();
        for (int i = 0; i < list.size(); ++i) {
            n.s((int)list.get(i), this.t((int)list.get(i)));
        }
        return n;
    }
    
    private void z(final int n, final Rect rect) {
        this.L(n).r(rect);
    }
    
    @Deprecated
    public int A() {
        return this.x();
    }
    
    public final int B() {
        return this.l;
    }
    
    protected abstract int C(final float p0, final float p1);
    
    protected abstract void D(final List<Integer> p0);
    
    public final void F() {
        this.H(-1, 1);
    }
    
    public final void G(final int n) {
        this.H(n, 0);
    }
    
    public final void H(final int n, final int n2) {
        if (n != Integer.MIN_VALUE && this.h.isEnabled()) {
            final ViewParent parent = this.i.getParent();
            if (parent != null) {
                final AccessibilityEvent q = this.q(n, 2048);
                androidx.core.view.accessibility.b.i(q, n2);
                parent.requestSendAccessibilityEvent(this.i, q);
            }
        }
    }
    
    @j0
    d L(final int n) {
        if (n == -1) {
            return this.u();
        }
        return this.t(n);
    }
    
    public final void M(final boolean b, final int n, @k0 final Rect rect) {
        final int l = this.l;
        if (l != Integer.MIN_VALUE) {
            this.o(l);
        }
        if (b) {
            this.K(n, rect);
        }
    }
    
    protected abstract boolean N(final int p0, final int p1, @k0 final Bundle p2);
    
    protected void O(@j0 final AccessibilityEvent accessibilityEvent) {
    }
    
    protected void P(final int n, @j0 final AccessibilityEvent accessibilityEvent) {
    }
    
    protected void Q(@j0 final d d) {
    }
    
    protected abstract void R(final int p0, @j0 final d p1);
    
    protected void S(final int n, final boolean b) {
    }
    
    boolean T(final int n, final int n2, final Bundle bundle) {
        if (n != -1) {
            return this.U(n, n2, bundle);
        }
        return this.V(n2, bundle);
    }
    
    public final boolean X(final int l) {
        if (!this.i.isFocused() && !this.i.requestFocus()) {
            return false;
        }
        final int i = this.l;
        if (i == l) {
            return false;
        }
        if (i != Integer.MIN_VALUE) {
            this.o(i);
        }
        if (l == Integer.MIN_VALUE) {
            return false;
        }
        this.S(this.l = l, true);
        this.Y(l, 8);
        return true;
    }
    
    public final boolean Y(final int n, final int n2) {
        if (n != Integer.MIN_VALUE && this.h.isEnabled()) {
            final ViewParent parent = this.i.getParent();
            return parent != null && parent.requestSendAccessibilityEvent(this.i, this.q(n, n2));
        }
        return false;
    }
    
    @Override
    public e b(final View view) {
        if (this.j == null) {
            this.j = new c();
        }
        return this.j;
    }
    
    @Override
    public void f(final View view, final AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        this.O(accessibilityEvent);
    }
    
    @Override
    public void g(final View view, final d d) {
        super.g(view, d);
        this.Q(d);
    }
    
    public final boolean o(final int n) {
        if (this.l != n) {
            return false;
        }
        this.l = Integer.MIN_VALUE;
        this.S(n, false);
        this.Y(n, 8);
        return true;
    }
    
    public final boolean v(@j0 final MotionEvent motionEvent) {
        final boolean enabled = this.h.isEnabled();
        boolean b2;
        final boolean b = b2 = false;
        if (enabled) {
            if (!this.h.isTouchExplorationEnabled()) {
                b2 = b;
            }
            else {
                final int action = motionEvent.getAction();
                if (action != 7 && action != 9) {
                    if (action != 10) {
                        return false;
                    }
                    if (this.m != Integer.MIN_VALUE) {
                        this.Z(Integer.MIN_VALUE);
                        return true;
                    }
                    return false;
                }
                else {
                    final int c = this.C(motionEvent.getX(), motionEvent.getY());
                    this.Z(c);
                    b2 = b;
                    if (c != Integer.MIN_VALUE) {
                        b2 = true;
                    }
                }
            }
        }
        return b2;
    }
    
    public final boolean w(@j0 final KeyEvent keyEvent) {
        final int action = keyEvent.getAction();
        final boolean b = false;
        int n = 0;
        boolean b2 = b;
        if (action != 1) {
            final int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                if (keyCode != 66) {
                    switch (keyCode) {
                        default: {
                            b2 = b;
                            return b2;
                        }
                        case 19:
                        case 20:
                        case 21:
                        case 22: {
                            b2 = b;
                            if (keyEvent.hasNoModifiers()) {
                                final int j = J(keyCode);
                                final int repeatCount = keyEvent.getRepeatCount();
                                b2 = false;
                                while (n < repeatCount + 1 && this.K(j, null)) {
                                    ++n;
                                    b2 = true;
                                }
                                return b2;
                            }
                            return b2;
                        }
                        case 23: {
                            break;
                        }
                    }
                }
                b2 = b;
                if (keyEvent.hasNoModifiers()) {
                    b2 = b;
                    if (keyEvent.getRepeatCount() == 0) {
                        this.p();
                        b2 = true;
                    }
                }
            }
            else if (keyEvent.hasNoModifiers()) {
                b2 = this.K(2, null);
            }
            else {
                b2 = b;
                if (keyEvent.hasModifiers(1)) {
                    b2 = this.K(1, null);
                }
            }
        }
        return b2;
    }
    
    public final int x() {
        return this.k;
    }
    
    private class c extends e
    {
        c() {
        }
        
        @Override
        public d b(final int n) {
            return androidx.core.view.accessibility.d.E0(a.this.L(n));
        }
        
        @Override
        public d d(int n) {
            if (n == 2) {
                n = a.this.k;
            }
            else {
                n = a.this.l;
            }
            if (n == Integer.MIN_VALUE) {
                return null;
            }
            return this.b(n);
        }
        
        @Override
        public boolean f(final int n, final int n2, final Bundle bundle) {
            return a.this.T(n, n2, bundle);
        }
    }
}
