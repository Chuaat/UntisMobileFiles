// 
// Decompiled by Procyon v0.5.36
// 

package androidx.recyclerview.widget;

import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.animation.Animator$AnimatorListener;
import android.view.GestureDetector$SimpleOnGestureListener;
import android.view.animation.Interpolator;
import android.content.res.Resources;
import c1.a;
import android.graphics.Canvas;
import android.util.Log;
import android.view.ViewParent;
import android.animation.Animator;
import androidx.annotation.k0;
import android.os.Build$VERSION;
import android.view.GestureDetector$OnGestureListener;
import android.view.ViewConfiguration;
import android.view.MotionEvent;
import java.util.ArrayList;
import androidx.core.view.h;
import android.view.VelocityTracker;
import androidx.annotation.b1;
import androidx.annotation.j0;
import android.view.View;
import java.util.List;
import android.graphics.Rect;

public class o extends RecyclerView.o implements r
{
    public static final int E = 1;
    public static final int F = 2;
    public static final int G = 4;
    public static final int H = 8;
    public static final int I = 16;
    public static final int J = 32;
    public static final int K = 0;
    public static final int L = 1;
    public static final int M = 2;
    public static final int N = 2;
    public static final int O = 4;
    public static final int P = 8;
    private static final String Q = "ItemTouchHelper";
    private static final boolean R = false;
    private static final int S = -1;
    static final int T = 8;
    private static final int U = 255;
    static final int V = 65280;
    static final int W = 16711680;
    private static final int X = 1000;
    private g A;
    private final t B;
    private Rect C;
    private long D;
    final List<View> a;
    private final float[] b;
    g0 c;
    float d;
    float e;
    private float f;
    private float g;
    float h;
    float i;
    private float j;
    private float k;
    int l;
    @j0
    f m;
    private int n;
    int o;
    @b1
    List<h> p;
    private int q;
    RecyclerView r;
    final Runnable s;
    VelocityTracker t;
    private List<g0> u;
    private List<Integer> v;
    private k w;
    View x;
    int y;
    androidx.core.view.h z;
    
    public o(@j0 final f m) {
        this.a = new ArrayList<View>();
        this.b = new float[2];
        this.c = null;
        this.l = -1;
        this.n = 0;
        this.p = new ArrayList<h>();
        this.s = new Runnable() {
            @Override
            public void run() {
                final o g = androidx.recyclerview.widget.o.this;
                if (g.c != null && g.E()) {
                    final o g2 = androidx.recyclerview.widget.o.this;
                    final g0 c = g2.c;
                    if (c != null) {
                        g2.z(c);
                    }
                    final o g3 = androidx.recyclerview.widget.o.this;
                    g3.r.removeCallbacks(g3.s);
                    androidx.core.view.j0.n1((View)androidx.recyclerview.widget.o.this.r, this);
                }
            }
        };
        this.w = null;
        this.x = null;
        this.y = -1;
        this.B = new t() {
            @Override
            public void a(@j0 final RecyclerView recyclerView, @j0 final MotionEvent motionEvent) {
                o.this.z.b(motionEvent);
                final VelocityTracker t = o.this.t;
                if (t != null) {
                    t.addMovement(motionEvent);
                }
                if (o.this.l == -1) {
                    return;
                }
                final int actionMasked = motionEvent.getActionMasked();
                final int pointerIndex = motionEvent.findPointerIndex(o.this.l);
                if (pointerIndex >= 0) {
                    o.this.o(actionMasked, motionEvent, pointerIndex);
                }
                final o a = o.this;
                final g0 c = a.c;
                if (c == null) {
                    return;
                }
                int n = 0;
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked != 6) {
                                return;
                            }
                            final int actionIndex = motionEvent.getActionIndex();
                            final int pointerId = motionEvent.getPointerId(actionIndex);
                            final o a2 = o.this;
                            if (pointerId == a2.l) {
                                if (actionIndex == 0) {
                                    n = 1;
                                }
                                a2.l = motionEvent.getPointerId(n);
                                final o a3 = o.this;
                                a3.M(motionEvent, a3.o, actionIndex);
                            }
                            return;
                        }
                        else {
                            final VelocityTracker t2 = a.t;
                            if (t2 != null) {
                                t2.clear();
                            }
                        }
                    }
                    else {
                        if (pointerIndex >= 0) {
                            a.M(motionEvent, a.o, pointerIndex);
                            o.this.z(c);
                            final o a4 = o.this;
                            a4.r.removeCallbacks(a4.s);
                            o.this.s.run();
                            o.this.r.invalidate();
                        }
                        return;
                    }
                }
                o.this.F(null, 0);
                o.this.l = -1;
            }
            
            @Override
            public boolean c(@j0 final RecyclerView recyclerView, @j0 final MotionEvent motionEvent) {
                o.this.z.b(motionEvent);
                final int actionMasked = motionEvent.getActionMasked();
                boolean b = true;
                if (actionMasked == 0) {
                    o.this.l = motionEvent.getPointerId(0);
                    o.this.d = motionEvent.getX();
                    o.this.e = motionEvent.getY();
                    o.this.A();
                    final o a = o.this;
                    if (a.c == null) {
                        final h s = a.s(motionEvent);
                        if (s != null) {
                            final o a2 = o.this;
                            a2.d -= s.j;
                            a2.e -= s.k;
                            a2.r(s.e, true);
                            if (o.this.a.remove(s.e.itemView)) {
                                final o a3 = o.this;
                                a3.m.c(a3.r, s.e);
                            }
                            o.this.F(s.e, s.f);
                            final o a4 = o.this;
                            a4.M(motionEvent, a4.o, 0);
                        }
                    }
                }
                else if (actionMasked != 3 && actionMasked != 1) {
                    final int l = o.this.l;
                    if (l != -1) {
                        final int pointerIndex = motionEvent.findPointerIndex(l);
                        if (pointerIndex >= 0) {
                            o.this.o(actionMasked, motionEvent, pointerIndex);
                        }
                    }
                }
                else {
                    final o a5 = o.this;
                    a5.l = -1;
                    a5.F(null, 0);
                }
                final VelocityTracker t = o.this.t;
                if (t != null) {
                    t.addMovement(motionEvent);
                }
                if (o.this.c == null) {
                    b = false;
                }
                return b;
            }
            
            @Override
            public void e(final boolean b) {
                if (!b) {
                    return;
                }
                o.this.F(null, 0);
            }
        };
        this.m = m;
    }
    
    private void C() {
        final VelocityTracker t = this.t;
        if (t != null) {
            t.recycle();
            this.t = null;
        }
    }
    
    private void G() {
        this.q = ViewConfiguration.get(this.r.getContext()).getScaledTouchSlop();
        this.r.n((RecyclerView.o)this);
        this.r.q(this.B);
        this.r.p((RecyclerView.r)this);
        this.I();
    }
    
    private void I() {
        this.A = new g();
        this.z = new androidx.core.view.h(this.r.getContext(), (GestureDetector$OnGestureListener)this.A);
    }
    
    private void K() {
        final g a = this.A;
        if (a != null) {
            a.a();
            this.A = null;
        }
        if (this.z != null) {
            this.z = null;
        }
    }
    
    private int L(final g0 g0) {
        if (this.n == 2) {
            return 0;
        }
        final int l = this.m.l(this.r, g0);
        final int n = (this.m.d(l, androidx.core.view.j0.X((View)this.r)) & 0xFF00) >> 8;
        if (n == 0) {
            return 0;
        }
        final int n2 = (l & 0xFF00) >> 8;
        if (Math.abs(this.h) > Math.abs(this.i)) {
            final int n3 = this.n(g0, n);
            if (n3 > 0) {
                if ((n2 & n3) == 0x0) {
                    return androidx.recyclerview.widget.o.f.e(n3, androidx.core.view.j0.X((View)this.r));
                }
                return n3;
            }
            else {
                final int p = this.p(g0, n);
                if (p > 0) {
                    return p;
                }
            }
        }
        else {
            final int p2 = this.p(g0, n);
            if (p2 > 0) {
                return p2;
            }
            final int n4 = this.n(g0, n);
            if (n4 > 0) {
                int e = n4;
                if ((n2 & n4) == 0x0) {
                    e = androidx.recyclerview.widget.o.f.e(n4, androidx.core.view.j0.X((View)this.r));
                }
                return e;
            }
        }
        return 0;
    }
    
    private void l() {
        if (Build$VERSION.SDK_INT >= 21) {
            return;
        }
        if (this.w == null) {
            this.w = new k() {
                @Override
                public int a(final int n, int n2) {
                    final o a = o.this;
                    final View x = a.x;
                    if (x == null) {
                        return n2;
                    }
                    int y;
                    if ((y = a.y) == -1) {
                        y = a.r.indexOfChild(x);
                        o.this.y = y;
                    }
                    if (n2 == n - 1) {
                        return y;
                    }
                    if (n2 >= y) {
                        ++n2;
                    }
                    return n2;
                }
            };
        }
        this.r.setChildDrawingOrderCallback(this.w);
    }
    
    private int n(final g0 g0, final int n) {
        if ((n & 0xC) != 0x0) {
            final float h = this.h;
            int n2 = 8;
            int n3;
            if (h > 0.0f) {
                n3 = 8;
            }
            else {
                n3 = 4;
            }
            final VelocityTracker t = this.t;
            if (t != null && this.l > -1) {
                t.computeCurrentVelocity(1000, this.m.o(this.g));
                final float xVelocity = this.t.getXVelocity(this.l);
                final float yVelocity = this.t.getYVelocity(this.l);
                if (xVelocity <= 0.0f) {
                    n2 = 4;
                }
                final float abs = Math.abs(xVelocity);
                if ((n2 & n) != 0x0 && n3 == n2 && abs >= this.m.m(this.f) && abs > Math.abs(yVelocity)) {
                    return n2;
                }
            }
            final float n4 = (float)this.r.getWidth();
            final float n5 = this.m.n(g0);
            if ((n & n3) != 0x0 && Math.abs(this.h) > n4 * n5) {
                return n3;
            }
        }
        return 0;
    }
    
    private int p(final g0 g0, final int n) {
        if ((n & 0x3) != 0x0) {
            final float i = this.i;
            int n2 = 2;
            int n3;
            if (i > 0.0f) {
                n3 = 2;
            }
            else {
                n3 = 1;
            }
            final VelocityTracker t = this.t;
            if (t != null && this.l > -1) {
                t.computeCurrentVelocity(1000, this.m.o(this.g));
                final float xVelocity = this.t.getXVelocity(this.l);
                final float yVelocity = this.t.getYVelocity(this.l);
                if (yVelocity <= 0.0f) {
                    n2 = 1;
                }
                final float abs = Math.abs(yVelocity);
                if ((n2 & n) != 0x0 && n2 == n3 && abs >= this.m.m(this.f) && abs > Math.abs(xVelocity)) {
                    return n2;
                }
            }
            final float n4 = (float)this.r.getHeight();
            final float n5 = this.m.n(g0);
            if ((n & n3) != 0x0 && Math.abs(this.i) > n4 * n5) {
                return n3;
            }
        }
        return 0;
    }
    
    private void q() {
        this.r.s1((RecyclerView.o)this);
        this.r.v1(this.B);
        this.r.u1((RecyclerView.r)this);
        for (int i = this.p.size() - 1; i >= 0; --i) {
            final h h = this.p.get(0);
            h.a();
            this.m.c(this.r, h.e);
        }
        this.p.clear();
        this.x = null;
        this.y = -1;
        this.C();
        this.K();
    }
    
    private List<g0> u(final g0 g0) {
        final List<g0> u = this.u;
        if (u == null) {
            this.u = new ArrayList<g0>();
            this.v = new ArrayList<Integer>();
        }
        else {
            u.clear();
            this.v.clear();
        }
        final int h = this.m.h();
        final int n = Math.round(this.j + this.h) - h;
        final int n2 = Math.round(this.k + this.i) - h;
        final int width = g0.itemView.getWidth();
        final int n3 = h * 2;
        final int n4 = width + n + n3;
        final int n5 = g0.itemView.getHeight() + n2 + n3;
        final int n6 = (n + n4) / 2;
        final int n7 = (n2 + n5) / 2;
        final RecyclerView.p layoutManager = this.r.getLayoutManager();
        for (int q = layoutManager.Q(), i = 0; i < q; ++i) {
            final View p = layoutManager.P(i);
            if (p != g0.itemView) {
                if (p.getBottom() >= n2 && p.getTop() <= n5 && p.getRight() >= n) {
                    if (p.getLeft() <= n4) {
                        final RecyclerView.g0 t0 = this.r.t0(p);
                        if (this.m.a(this.r, this.c, t0)) {
                            final int abs = Math.abs(n6 - (p.getLeft() + p.getRight()) / 2);
                            final int abs2 = Math.abs(n7 - (p.getTop() + p.getBottom()) / 2);
                            final int j = abs * abs + abs2 * abs2;
                            final int size = this.u.size();
                            int n8 = 0;
                            int n9 = 0;
                            while (n8 < size && j > this.v.get(n8)) {
                                ++n9;
                                ++n8;
                            }
                            this.u.add(n9, t0);
                            this.v.add(n9, j);
                        }
                    }
                }
            }
        }
        return this.u;
    }
    
    private g0 v(final MotionEvent motionEvent) {
        final RecyclerView.p layoutManager = this.r.getLayoutManager();
        final int l = this.l;
        if (l == -1) {
            return null;
        }
        final int pointerIndex = motionEvent.findPointerIndex(l);
        final float x = motionEvent.getX(pointerIndex);
        final float d = this.d;
        final float y = motionEvent.getY(pointerIndex);
        final float e = this.e;
        final float abs = Math.abs(x - d);
        final float abs2 = Math.abs(y - e);
        final int q = this.q;
        if (abs < q && abs2 < q) {
            return null;
        }
        if (abs > abs2 && layoutManager.n()) {
            return null;
        }
        if (abs2 > abs && layoutManager.o()) {
            return null;
        }
        final View t = this.t(motionEvent);
        if (t == null) {
            return null;
        }
        return this.r.t0(t);
    }
    
    private void w(final float[] array) {
        if ((this.o & 0xC) != 0x0) {
            array[0] = this.j + this.h - this.c.itemView.getLeft();
        }
        else {
            array[0] = this.c.itemView.getTranslationX();
        }
        if ((this.o & 0x3) != 0x0) {
            array[1] = this.k + this.i - this.c.itemView.getTop();
        }
        else {
            array[1] = this.c.itemView.getTranslationY();
        }
    }
    
    private static boolean y(final View view, final float n, final float n2, final float n3, final float n4) {
        return n >= n3 && n <= n3 + view.getWidth() && n2 >= n4 && n2 <= n4 + view.getHeight();
    }
    
    void A() {
        final VelocityTracker t = this.t;
        if (t != null) {
            t.recycle();
        }
        this.t = VelocityTracker.obtain();
    }
    
    void B(final h h, final int n) {
        this.r.post((Runnable)new Runnable() {
            @Override
            public void run() {
                final RecyclerView r = androidx.recyclerview.widget.o.this.r;
                if (r != null && r.isAttachedToWindow()) {
                    final h g = h;
                    if (!g.l && g.e.getAbsoluteAdapterPosition() != -1) {
                        final RecyclerView.m itemAnimator = androidx.recyclerview.widget.o.this.r.getItemAnimator();
                        if ((itemAnimator == null || !itemAnimator.r(null)) && !androidx.recyclerview.widget.o.this.x()) {
                            androidx.recyclerview.widget.o.this.m.D(h.e, n);
                        }
                        else {
                            androidx.recyclerview.widget.o.this.r.post((Runnable)this);
                        }
                    }
                }
            }
        });
    }
    
    void D(final View view) {
        if (view == this.x) {
            this.x = null;
            if (this.w != null) {
                this.r.setChildDrawingOrderCallback(null);
            }
        }
    }
    
    boolean E() {
        if (this.c == null) {
            this.D = Long.MIN_VALUE;
            return false;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        final long d = this.D;
        long n;
        if (d == Long.MIN_VALUE) {
            n = 0L;
        }
        else {
            n = currentTimeMillis - d;
        }
        final RecyclerView.p layoutManager = this.r.getLayoutManager();
        if (this.C == null) {
            this.C = new Rect();
        }
        layoutManager.m(this.c.itemView, this.C);
        int n3 = 0;
        Label_0203: {
            if (layoutManager.n()) {
                final int n2 = (int)(this.j + this.h);
                n3 = n2 - this.C.left - this.r.getPaddingLeft();
                final float h = this.h;
                if (h < 0.0f && n3 < 0) {
                    break Label_0203;
                }
                if (h > 0.0f) {
                    n3 = n2 + this.c.itemView.getWidth() + this.C.right - (this.r.getWidth() - this.r.getPaddingRight());
                    if (n3 > 0) {
                        break Label_0203;
                    }
                }
            }
            n3 = 0;
        }
        int r = 0;
        Label_0321: {
            if (layoutManager.o()) {
                final int n4 = (int)(this.k + this.i);
                r = n4 - this.C.top - this.r.getPaddingTop();
                final float i = this.i;
                if (i < 0.0f && r < 0) {
                    break Label_0321;
                }
                if (i > 0.0f) {
                    r = n4 + this.c.itemView.getHeight() + this.C.bottom - (this.r.getHeight() - this.r.getPaddingBottom());
                    if (r > 0) {
                        break Label_0321;
                    }
                }
            }
            r = 0;
        }
        int r2 = n3;
        if (n3 != 0) {
            r2 = this.m.r(this.r, this.c.itemView.getWidth(), n3, this.r.getWidth(), n);
        }
        if (r != 0) {
            r = this.m.r(this.r, this.c.itemView.getHeight(), r, this.r.getHeight(), n);
        }
        if (r2 == 0 && r == 0) {
            this.D = Long.MIN_VALUE;
            return false;
        }
        if (this.D == Long.MIN_VALUE) {
            this.D = currentTimeMillis;
        }
        this.r.scrollBy(r2, r);
        return true;
    }
    
    void F(@k0 final g0 c, final int n) {
        if (c == this.c && n == this.n) {
            return;
        }
        this.D = Long.MIN_VALUE;
        final int n2 = this.n;
        this.r(c, true);
        if ((this.n = n) == 2) {
            if (c == null) {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
            this.x = c.itemView;
            this.l();
        }
        final g0 c2 = this.c;
        boolean b2;
        if (c2 != null) {
            if (c2.itemView.getParent() != null) {
                int l;
                if (n2 == 2) {
                    l = 0;
                }
                else {
                    l = this.L(c2);
                }
                this.C();
                float n5;
                float n6;
                if (l != 1 && l != 2) {
                    float n3;
                    if (l != 4 && l != 8 && l != 16 && l != 32) {
                        n3 = 0.0f;
                    }
                    else {
                        n3 = Math.signum(this.h) * this.r.getWidth();
                    }
                    final float n4 = 0.0f;
                    n5 = n3;
                    n6 = n4;
                }
                else {
                    n6 = Math.signum(this.i) * this.r.getHeight();
                    n5 = 0.0f;
                }
                int n7;
                if (n2 == 2) {
                    n7 = 8;
                }
                else if (l > 0) {
                    n7 = 2;
                }
                else {
                    n7 = 4;
                }
                this.w(this.b);
                final float[] b = this.b;
                final float n8 = b[0];
                final float n9 = b[1];
                final h h = new h(c2, n7, n2, n8, n9, n5, n6) {
                    @Override
                    public void onAnimationEnd(final Animator animator) {
                        super.onAnimationEnd(animator);
                        if (super.l) {
                            return;
                        }
                        if (l <= 0) {
                            final o q = androidx.recyclerview.widget.o.this;
                            q.m.c(q.r, c2);
                        }
                        else {
                            androidx.recyclerview.widget.o.this.a.add(c2.itemView);
                            super.i = true;
                            final int o = l;
                            if (o > 0) {
                                androidx.recyclerview.widget.o.this.B((h)this, o);
                            }
                        }
                        final o q2 = androidx.recyclerview.widget.o.this;
                        final View x = q2.x;
                        final View itemView = c2.itemView;
                        if (x == itemView) {
                            q2.D(itemView);
                        }
                    }
                };
                ((h)h).b(this.m.g(this.r, n7, n5 - n8, n6 - n9));
                this.p.add((h)h);
                ((h)h).d();
                b2 = true;
            }
            else {
                this.D(c2.itemView);
                this.m.c(this.r, c2);
                b2 = false;
            }
            this.c = null;
        }
        else {
            b2 = false;
        }
        if (c != null) {
            this.o = (this.m.f(this.r, c) & (1 << n * 8 + 8) - 1) >> this.n * 8;
            this.j = (float)c.itemView.getLeft();
            this.k = (float)c.itemView.getTop();
            this.c = c;
            if (n == 2) {
                c.itemView.performHapticFeedback(0);
            }
        }
        final ViewParent parent = this.r.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(this.c != null);
        }
        if (!b2) {
            this.r.getLayoutManager().O1();
        }
        this.m.C(this.c, this.n);
        this.r.invalidate();
    }
    
    public void H(@j0 final g0 g0) {
        if (!this.m.p(this.r, g0)) {
            Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
            return;
        }
        if (g0.itemView.getParent() != this.r) {
            Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
            return;
        }
        this.A();
        this.i = 0.0f;
        this.h = 0.0f;
        this.F(g0, 2);
    }
    
    public void J(@j0 final g0 g0) {
        if (!this.m.q(this.r, g0)) {
            Log.e("ItemTouchHelper", "Start swipe has been called but swiping is not enabled");
            return;
        }
        if (g0.itemView.getParent() != this.r) {
            Log.e("ItemTouchHelper", "Start swipe has been called with a view holder which is not a child of the RecyclerView controlled by this ItemTouchHelper.");
            return;
        }
        this.A();
        this.i = 0.0f;
        this.h = 0.0f;
        this.F(g0, 1);
    }
    
    void M(final MotionEvent motionEvent, final int n, final int n2) {
        final float x = motionEvent.getX(n2);
        final float y = motionEvent.getY(n2);
        final float n3 = x - this.d;
        this.h = n3;
        this.i = y - this.e;
        if ((n & 0x4) == 0x0) {
            this.h = Math.max(0.0f, n3);
        }
        if ((n & 0x8) == 0x0) {
            this.h = Math.min(0.0f, this.h);
        }
        if ((n & 0x1) == 0x0) {
            this.i = Math.max(0.0f, this.i);
        }
        if ((n & 0x2) == 0x0) {
            this.i = Math.min(0.0f, this.i);
        }
    }
    
    @Override
    public void b(@j0 final View view) {
        this.D(view);
        final RecyclerView.g0 t0 = this.r.t0(view);
        if (t0 == null) {
            return;
        }
        final g0 c = this.c;
        if (c != null && t0 == c) {
            this.F(null, 0);
        }
        else {
            this.r(t0, false);
            if (this.a.remove(t0.itemView)) {
                this.m.c(this.r, t0);
            }
        }
    }
    
    @Override
    public void d(@j0 final View view) {
    }
    
    @Override
    public void g(final Rect rect, final View view, final RecyclerView recyclerView, final d0 d0) {
        rect.setEmpty();
    }
    
    @Override
    public void i(final Canvas canvas, final RecyclerView recyclerView, final d0 d0) {
        this.y = -1;
        float n;
        float n2;
        if (this.c != null) {
            this.w(this.b);
            final float[] b = this.b;
            n = b[0];
            n2 = b[1];
        }
        else {
            n = 0.0f;
            n2 = 0.0f;
        }
        this.m.y(canvas, recyclerView, this.c, this.p, this.n, n, n2);
    }
    
    @Override
    public void k(final Canvas canvas, final RecyclerView recyclerView, final d0 d0) {
        float n;
        float n2;
        if (this.c != null) {
            this.w(this.b);
            final float[] b = this.b;
            n = b[0];
            n2 = b[1];
        }
        else {
            n = 0.0f;
            n2 = 0.0f;
        }
        this.m.z(canvas, recyclerView, this.c, this.p, this.n, n, n2);
    }
    
    public void m(@k0 final RecyclerView r) {
        final RecyclerView r2 = this.r;
        if (r2 == r) {
            return;
        }
        if (r2 != null) {
            this.q();
        }
        if ((this.r = r) != null) {
            final Resources resources = r.getResources();
            this.f = resources.getDimension(c1.a.c.m);
            this.g = resources.getDimension(c1.a.c.l);
            this.G();
        }
    }
    
    void o(int n, final MotionEvent motionEvent, int q) {
        if (this.c == null && n == 2 && this.n != 2) {
            if (this.m.s()) {
                if (this.r.getScrollState() == 1) {
                    return;
                }
                final g0 v = this.v(motionEvent);
                if (v == null) {
                    return;
                }
                n = (this.m.f(this.r, v) & 0xFF00) >> 8;
                if (n == 0) {
                    return;
                }
                final float x = motionEvent.getX(q);
                final float y = motionEvent.getY(q);
                final float a = x - this.d;
                final float a2 = y - this.e;
                final float abs = Math.abs(a);
                final float abs2 = Math.abs(a2);
                q = this.q;
                if (abs < q && abs2 < q) {
                    return;
                }
                if (abs > abs2) {
                    if (a < 0.0f && (n & 0x4) == 0x0) {
                        return;
                    }
                    if (a > 0.0f && (n & 0x8) == 0x0) {
                        return;
                    }
                }
                else {
                    if (a2 < 0.0f && (n & 0x1) == 0x0) {
                        return;
                    }
                    if (a2 > 0.0f && (n & 0x2) == 0x0) {
                        return;
                    }
                }
                this.i = 0.0f;
                this.h = 0.0f;
                this.l = motionEvent.getPointerId(0);
                this.F(v, 1);
            }
        }
    }
    
    void r(final g0 g0, final boolean b) {
        for (int i = this.p.size() - 1; i >= 0; --i) {
            final h h = this.p.get(i);
            if (h.e == g0) {
                h.l |= b;
                if (!h.m) {
                    h.a();
                }
                this.p.remove(i);
                return;
            }
        }
    }
    
    h s(final MotionEvent motionEvent) {
        if (this.p.isEmpty()) {
            return null;
        }
        final View t = this.t(motionEvent);
        for (int i = this.p.size() - 1; i >= 0; --i) {
            final h h = this.p.get(i);
            if (h.e.itemView == t) {
                return h;
            }
        }
        return null;
    }
    
    View t(final MotionEvent motionEvent) {
        final float x = motionEvent.getX();
        final float y = motionEvent.getY();
        final g0 c = this.c;
        if (c != null) {
            final View itemView = c.itemView;
            if (y(itemView, x, y, this.j + this.h, this.k + this.i)) {
                return itemView;
            }
        }
        for (int i = this.p.size() - 1; i >= 0; --i) {
            final h h = this.p.get(i);
            final View itemView2 = h.e.itemView;
            if (y(itemView2, x, y, h.j, h.k)) {
                return itemView2;
            }
        }
        return this.r.a0(x, y);
    }
    
    boolean x() {
        for (int size = this.p.size(), i = 0; i < size; ++i) {
            if (!this.p.get(i).m) {
                return true;
            }
        }
        return false;
    }
    
    void z(final g0 g0) {
        if (this.r.isLayoutRequested()) {
            return;
        }
        if (this.n != 2) {
            return;
        }
        final float k = this.m.k(g0);
        final int n = (int)(this.j + this.h);
        final int n2 = (int)(this.k + this.i);
        if (Math.abs(n2 - g0.itemView.getTop()) < g0.itemView.getHeight() * k && Math.abs(n - g0.itemView.getLeft()) < g0.itemView.getWidth() * k) {
            return;
        }
        final List<g0> u = this.u(g0);
        if (u.size() == 0) {
            return;
        }
        final g0 b = this.m.b(g0, u, n, n2);
        if (b == null) {
            this.u.clear();
            this.v.clear();
            return;
        }
        final int absoluteAdapterPosition = b.getAbsoluteAdapterPosition();
        final int absoluteAdapterPosition2 = g0.getAbsoluteAdapterPosition();
        if (this.m.A(this.r, g0, b)) {
            this.m.B(this.r, g0, absoluteAdapterPosition2, b, absoluteAdapterPosition, n, n2);
        }
    }
    
    public abstract static class f
    {
        public static final int b = 200;
        public static final int c = 250;
        static final int d = 3158064;
        private static final int e = 789516;
        private static final Interpolator f;
        private static final Interpolator g;
        private static final long h = 2000L;
        private int a;
        
        static {
            f = (Interpolator)new Interpolator() {
                public float getInterpolation(final float n) {
                    return n * n * n * n * n;
                }
            };
            g = (Interpolator)new Interpolator() {
                public float getInterpolation(float n) {
                    --n;
                    return n * n * n * n * n + 1.0f;
                }
            };
        }
        
        public f() {
            this.a = -1;
        }
        
        public static int e(int n, int n2) {
            final int n3 = n & 0xC0C0C;
            if (n3 == 0) {
                return n;
            }
            n &= ~n3;
            if (n2 == 0) {
                n2 = n3 << 2;
            }
            else {
                n2 = n3 << 1;
                n |= (0xFFF3F3F3 & n2);
                n2 = (n2 & 0xC0C0C) << 2;
            }
            return n | n2;
        }
        
        @j0
        public static androidx.recyclerview.widget.p i() {
            return androidx.recyclerview.widget.q.a;
        }
        
        private int j(final RecyclerView recyclerView) {
            if (this.a == -1) {
                this.a = recyclerView.getResources().getDimensionPixelSize(c1.a.c.k);
            }
            return this.a;
        }
        
        public static int u(final int n, final int n2) {
            return n2 << n * 8;
        }
        
        public static int v(final int n, int u) {
            final int u2 = u(0, u | n);
            u = u(1, u);
            return u(2, n) | (u | u2);
        }
        
        public abstract boolean A(@j0 final RecyclerView p0, @j0 final g0 p1, @j0 final g0 p2);
        
        public void B(@j0 final RecyclerView recyclerView, @j0 final g0 g0, final int n, @j0 final g0 g2, final int n2, final int n3, final int n4) {
            final RecyclerView.p layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof j) {
                ((j)layoutManager).b(g0.itemView, g2.itemView, n3, n4);
                return;
            }
            if (layoutManager.n()) {
                if (layoutManager.Y(g2.itemView) <= recyclerView.getPaddingLeft()) {
                    recyclerView.G1(n2);
                }
                if (layoutManager.b0(g2.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.G1(n2);
                }
            }
            if (layoutManager.o()) {
                if (layoutManager.c0(g2.itemView) <= recyclerView.getPaddingTop()) {
                    recyclerView.G1(n2);
                }
                if (layoutManager.W(g2.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.G1(n2);
                }
            }
        }
        
        public void C(@k0 final g0 g0, final int n) {
            if (g0 != null) {
                androidx.recyclerview.widget.q.a.b(g0.itemView);
            }
        }
        
        public abstract void D(@j0 final g0 p0, final int p1);
        
        public boolean a(@j0 final RecyclerView recyclerView, @j0 final g0 g0, @j0 final g0 g2) {
            return true;
        }
        
        public g0 b(@j0 final g0 g0, @j0 final List<g0> list, final int n, final int n2) {
            final int width = g0.itemView.getWidth();
            final int height = g0.itemView.getHeight();
            final int n3 = n - g0.itemView.getLeft();
            final int n4 = n2 - g0.itemView.getTop();
            final int size = list.size();
            g0 g2 = null;
            int n5 = -1;
            for (int i = 0; i < size; ++i) {
                final g0 g3 = list.get(i);
                g0 g4 = g2;
                int n6 = n5;
                if (n3 > 0) {
                    final int a = g3.itemView.getRight() - (n + width);
                    g4 = g2;
                    n6 = n5;
                    if (a < 0) {
                        g4 = g2;
                        n6 = n5;
                        if (g3.itemView.getRight() > g0.itemView.getRight()) {
                            final int abs = Math.abs(a);
                            g4 = g2;
                            if (abs > (n6 = n5)) {
                                g4 = g3;
                                n6 = abs;
                            }
                        }
                    }
                }
                g0 g5 = g4;
                int n7 = n6;
                if (n3 < 0) {
                    final int a2 = g3.itemView.getLeft() - n;
                    g5 = g4;
                    n7 = n6;
                    if (a2 > 0) {
                        g5 = g4;
                        n7 = n6;
                        if (g3.itemView.getLeft() < g0.itemView.getLeft()) {
                            final int abs2 = Math.abs(a2);
                            g5 = g4;
                            if (abs2 > (n7 = n6)) {
                                g5 = g3;
                                n7 = abs2;
                            }
                        }
                    }
                }
                g0 g6 = g5;
                int n8 = n7;
                if (n4 < 0) {
                    final int a3 = g3.itemView.getTop() - n2;
                    g6 = g5;
                    n8 = n7;
                    if (a3 > 0) {
                        g6 = g5;
                        n8 = n7;
                        if (g3.itemView.getTop() < g0.itemView.getTop()) {
                            final int abs3 = Math.abs(a3);
                            g6 = g5;
                            if (abs3 > (n8 = n7)) {
                                g6 = g3;
                                n8 = abs3;
                            }
                        }
                    }
                }
                g2 = g6;
                n5 = n8;
                if (n4 > 0) {
                    final int a4 = g3.itemView.getBottom() - (n2 + height);
                    g2 = g6;
                    n5 = n8;
                    if (a4 < 0) {
                        g2 = g6;
                        n5 = n8;
                        if (g3.itemView.getBottom() > g0.itemView.getBottom()) {
                            final int abs4 = Math.abs(a4);
                            g2 = g6;
                            if (abs4 > (n5 = n8)) {
                                n5 = abs4;
                                g2 = g3;
                            }
                        }
                    }
                }
            }
            return g2;
        }
        
        public void c(@j0 final RecyclerView recyclerView, @j0 final g0 g0) {
            androidx.recyclerview.widget.q.a.a(g0.itemView);
        }
        
        public int d(int n, int n2) {
            final int n3 = n & 0x303030;
            if (n3 == 0) {
                return n;
            }
            final int n4 = n & ~n3;
            if (n2 == 0) {
                n = n3 >> 2;
                n2 = n4;
            }
            else {
                n = n3 >> 1;
                n2 = (n4 | (0xFFCFCFCF & n));
                n = (n & 0x303030) >> 2;
            }
            return n2 | n;
        }
        
        final int f(final RecyclerView recyclerView, final g0 g0) {
            return this.d(this.l(recyclerView, g0), androidx.core.view.j0.X((View)recyclerView));
        }
        
        public long g(@j0 final RecyclerView recyclerView, final int n, final float n2, final float n3) {
            final RecyclerView.m itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator == null) {
                long n4;
                if (n == 8) {
                    n4 = 200L;
                }
                else {
                    n4 = 250L;
                }
                return n4;
            }
            long n5;
            if (n == 8) {
                n5 = itemAnimator.o();
            }
            else {
                n5 = itemAnimator.p();
            }
            return n5;
        }
        
        public int h() {
            return 0;
        }
        
        public float k(@j0 final g0 g0) {
            return 0.5f;
        }
        
        public abstract int l(@j0 final RecyclerView p0, @j0 final g0 p1);
        
        public float m(final float n) {
            return n;
        }
        
        public float n(@j0 final g0 g0) {
            return 0.5f;
        }
        
        public float o(final float n) {
            return n;
        }
        
        boolean p(final RecyclerView recyclerView, final g0 g0) {
            return (this.f(recyclerView, g0) & 0xFF0000) != 0x0;
        }
        
        boolean q(final RecyclerView recyclerView, final g0 g0) {
            return (this.f(recyclerView, g0) & 0xFF00) != 0x0;
        }
        
        public int r(@j0 final RecyclerView recyclerView, int n, final int a, int j, final long n2) {
            j = this.j(recyclerView);
            final int abs = Math.abs(a);
            final int n3 = (int)Math.signum((float)a);
            final float n4 = (float)abs;
            float n5 = 1.0f;
            n = (int)(n3 * j * androidx.recyclerview.widget.o.f.g.getInterpolation(Math.min(1.0f, n4 * 1.0f / n)));
            if (n2 <= 2000L) {
                n5 = n2 / 2000.0f;
            }
            j = (n *= (int)androidx.recyclerview.widget.o.f.f.getInterpolation(n5));
            if (j == 0) {
                if (a > 0) {
                    n = 1;
                }
                else {
                    n = -1;
                }
            }
            return n;
        }
        
        public boolean s() {
            return true;
        }
        
        public boolean t() {
            return true;
        }
        
        public void w(@j0 final Canvas canvas, @j0 final RecyclerView recyclerView, @j0 final g0 g0, final float n, final float n2, final int n3, final boolean b) {
            androidx.recyclerview.widget.q.a.d(canvas, recyclerView, g0.itemView, n, n2, n3, b);
        }
        
        public void x(@j0 final Canvas canvas, @j0 final RecyclerView recyclerView, final g0 g0, final float n, final float n2, final int n3, final boolean b) {
            androidx.recyclerview.widget.q.a.c(canvas, recyclerView, g0.itemView, n, n2, n3, b);
        }
        
        void y(final Canvas canvas, final RecyclerView recyclerView, final g0 g0, final List<h> list, final int n, final float n2, final float n3) {
            for (int size = list.size(), i = 0; i < size; ++i) {
                final h h = list.get(i);
                h.e();
                final int save = canvas.save();
                this.w(canvas, recyclerView, h.e, h.j, h.k, h.f, false);
                canvas.restoreToCount(save);
            }
            if (g0 != null) {
                final int save2 = canvas.save();
                this.w(canvas, recyclerView, g0, n2, n3, n, true);
                canvas.restoreToCount(save2);
            }
        }
        
        void z(final Canvas canvas, final RecyclerView recyclerView, final g0 g0, final List<h> list, int i, final float n, final float n2) {
            final int size = list.size();
            final int n3 = 0;
            for (int j = 0; j < size; ++j) {
                final h h = list.get(j);
                final int save = canvas.save();
                this.x(canvas, recyclerView, h.e, h.j, h.k, h.f, false);
                canvas.restoreToCount(save);
            }
            if (g0 != null) {
                final int save2 = canvas.save();
                this.x(canvas, recyclerView, g0, n, n2, i, true);
                canvas.restoreToCount(save2);
            }
            i = size - 1;
            int n4 = n3;
            while (i >= 0) {
                final h h2 = list.get(i);
                final boolean m = h2.m;
                if (m && !h2.i) {
                    list.remove(i);
                }
                else if (!m) {
                    n4 = 1;
                }
                --i;
            }
            if (n4 != 0) {
                recyclerView.invalidate();
            }
        }
    }
    
    private class g extends GestureDetector$SimpleOnGestureListener
    {
        private boolean a;
        
        g() {
            this.a = true;
        }
        
        void a() {
            this.a = false;
        }
        
        public boolean onDown(final MotionEvent motionEvent) {
            return true;
        }
        
        public void onLongPress(final MotionEvent motionEvent) {
            if (!this.a) {
                return;
            }
            final View t = androidx.recyclerview.widget.o.this.t(motionEvent);
            if (t != null) {
                final RecyclerView.g0 t2 = androidx.recyclerview.widget.o.this.r.t0(t);
                if (t2 != null) {
                    final o b = androidx.recyclerview.widget.o.this;
                    if (!b.m.p(b.r, t2)) {
                        return;
                    }
                    final int pointerId = motionEvent.getPointerId(0);
                    final int l = androidx.recyclerview.widget.o.this.l;
                    if (pointerId == l) {
                        final int pointerIndex = motionEvent.findPointerIndex(l);
                        final float x = motionEvent.getX(pointerIndex);
                        final float y = motionEvent.getY(pointerIndex);
                        final o b2 = androidx.recyclerview.widget.o.this;
                        b2.d = x;
                        b2.e = y;
                        b2.i = 0.0f;
                        b2.h = 0.0f;
                        if (b2.m.t()) {
                            androidx.recyclerview.widget.o.this.F(t2, 2);
                        }
                    }
                }
            }
        }
    }
    
    @b1
    static class h implements Animator$AnimatorListener
    {
        final float a;
        final float b;
        final float c;
        final float d;
        final g0 e;
        final int f;
        @b1
        final ValueAnimator g;
        final int h;
        boolean i;
        float j;
        float k;
        boolean l;
        boolean m;
        private float n;
        
        h(final g0 e, final int h, final int f, final float a, final float b, final float c, final float d) {
            this.l = false;
            this.m = false;
            this.f = f;
            this.h = h;
            this.e = e;
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[] { 0.0f, 1.0f });
            (this.g = ofFloat).addUpdateListener((ValueAnimator$AnimatorUpdateListener)new ValueAnimator$AnimatorUpdateListener() {
                public void onAnimationUpdate(final ValueAnimator valueAnimator) {
                    androidx.recyclerview.widget.o.h.this.c(valueAnimator.getAnimatedFraction());
                }
            });
            ofFloat.setTarget((Object)e.itemView);
            ofFloat.addListener((Animator$AnimatorListener)this);
            this.c(0.0f);
        }
        
        public void a() {
            this.g.cancel();
        }
        
        public void b(final long duration) {
            this.g.setDuration(duration);
        }
        
        public void c(final float n) {
            this.n = n;
        }
        
        public void d() {
            this.e.setIsRecyclable(false);
            this.g.start();
        }
        
        public void e() {
            final float a = this.a;
            final float c = this.c;
            float translationX;
            if (a == c) {
                translationX = this.e.itemView.getTranslationX();
            }
            else {
                translationX = a + this.n * (c - a);
            }
            this.j = translationX;
            final float b = this.b;
            final float d = this.d;
            float translationY;
            if (b == d) {
                translationY = this.e.itemView.getTranslationY();
            }
            else {
                translationY = b + this.n * (d - b);
            }
            this.k = translationY;
        }
        
        public void onAnimationCancel(final Animator animator) {
            this.c(1.0f);
        }
        
        public void onAnimationEnd(final Animator animator) {
            if (!this.m) {
                this.e.setIsRecyclable(true);
            }
            this.m = true;
        }
        
        public void onAnimationRepeat(final Animator animator) {
        }
        
        public void onAnimationStart(final Animator animator) {
        }
    }
    
    public abstract static class i extends f
    {
        private int i;
        private int j;
        
        public i(final int j, final int i) {
            this.i = i;
            this.j = j;
        }
        
        public int E(@j0 final RecyclerView recyclerView, @j0 final g0 g0) {
            return this.j;
        }
        
        public int F(@j0 final RecyclerView recyclerView, @j0 final g0 g0) {
            return this.i;
        }
        
        public void G(final int j) {
            this.j = j;
        }
        
        public void H(final int i) {
            this.i = i;
        }
        
        @Override
        public int l(@j0 final RecyclerView recyclerView, @j0 final g0 g0) {
            return androidx.recyclerview.widget.o.f.v(this.E(recyclerView, g0), this.F(recyclerView, g0));
        }
    }
    
    public interface j
    {
        void b(@j0 final View p0, @j0 final View p1, final int p2, final int p3);
    }
}
