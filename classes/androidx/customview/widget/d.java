// 
// Decompiled by Procyon v0.5.36
// 

package androidx.customview.widget;

import androidx.annotation.b0;
import androidx.annotation.k0;
import androidx.annotation.n0;
import java.util.Arrays;
import android.view.MotionEvent;
import android.util.Log;
import android.view.ViewConfiguration;
import androidx.annotation.j0;
import android.content.Context;
import android.view.ViewGroup;
import android.view.View;
import android.widget.OverScroller;
import android.view.VelocityTracker;
import android.view.animation.Interpolator;

public class d
{
    public static final int A = 1;
    public static final int B = 2;
    public static final int C = 1;
    public static final int D = 2;
    public static final int E = 4;
    public static final int F = 8;
    public static final int G = 15;
    public static final int H = 1;
    public static final int I = 2;
    public static final int J = 3;
    private static final int K = 20;
    private static final int L = 256;
    private static final int M = 600;
    private static final Interpolator N;
    private static final String x = "ViewDragHelper";
    public static final int y = -1;
    public static final int z = 0;
    private int a;
    private int b;
    private int c;
    private float[] d;
    private float[] e;
    private float[] f;
    private float[] g;
    private int[] h;
    private int[] i;
    private int[] j;
    private int k;
    private VelocityTracker l;
    private float m;
    private float n;
    private int o;
    private final int p;
    private int q;
    private OverScroller r;
    private final c s;
    private View t;
    private boolean u;
    private final ViewGroup v;
    private final Runnable w;
    
    static {
        N = (Interpolator)new Interpolator() {
            public float getInterpolation(float n) {
                --n;
                return n * n * n * n * n + 1.0f;
            }
        };
    }
    
    private d(@j0 final Context context, @j0 final ViewGroup v, @j0 final c s) {
        this.c = -1;
        this.w = new Runnable() {
            @Override
            public void run() {
                androidx.customview.widget.d.this.R(0);
            }
        };
        if (v == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (s != null) {
            this.v = v;
            this.s = s;
            final ViewConfiguration value = ViewConfiguration.get(context);
            final int n = (int)(context.getResources().getDisplayMetrics().density * 20.0f + 0.5f);
            this.p = n;
            this.o = n;
            this.b = value.getScaledTouchSlop();
            this.m = (float)value.getScaledMaximumFlingVelocity();
            this.n = (float)value.getScaledMinimumFlingVelocity();
            this.r = new OverScroller(context, androidx.customview.widget.d.N);
            return;
        }
        throw new IllegalArgumentException("Callback may not be null");
    }
    
    private int C(int n, final int n2) {
        int n3;
        final boolean b = (n3 = ((n < this.v.getLeft() + this.o) ? 1 : 0)) != 0;
        if (n2 < this.v.getTop() + this.o) {
            n3 = ((b ? 1 : 0) | 0x4);
        }
        int n4 = n3;
        if (n > this.v.getRight() - this.o) {
            n4 = (n3 | 0x2);
        }
        n = n4;
        if (n2 > this.v.getBottom() - this.o) {
            n = (n4 | 0x8);
        }
        return n;
    }
    
    private boolean K(final int i) {
        if (!this.J(i)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Ignoring pointerId=");
            sb.append(i);
            sb.append(" because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
            Log.e("ViewDragHelper", sb.toString());
            return false;
        }
        return true;
    }
    
    private void N() {
        this.l.computeCurrentVelocity(1000, this.m);
        this.r(this.i(this.l.getXVelocity(this.c), this.n, this.m), this.i(this.l.getYVelocity(this.c), this.n, this.m));
    }
    
    private void O(final float n, final float n2, final int n3) {
        int e;
        final boolean b = (e = (this.e(n, n2, n3, 1) ? 1 : 0)) != 0;
        if (this.e(n2, n, n3, 4)) {
            e = ((b ? 1 : 0) | 0x4);
        }
        int n4 = e;
        if (this.e(n, n2, n3, 2)) {
            n4 = (e | 0x2);
        }
        int n5 = n4;
        if (this.e(n2, n, n3, 8)) {
            n5 = (n4 | 0x8);
        }
        if (n5 != 0) {
            final int[] i = this.i;
            i[n3] |= n5;
            this.s.onEdgeDragStarted(n5, n3);
        }
    }
    
    private void P(final float n, final float n2, final int n3) {
        this.u(n3);
        this.d[n3] = (this.f[n3] = n);
        this.e[n3] = (this.g[n3] = n2);
        this.h[n3] = this.C((int)n, (int)n2);
        this.k |= 1 << n3;
    }
    
    private void Q(final MotionEvent motionEvent) {
        for (int pointerCount = motionEvent.getPointerCount(), i = 0; i < pointerCount; ++i) {
            final int pointerId = motionEvent.getPointerId(i);
            if (this.K(pointerId)) {
                final float x = motionEvent.getX(i);
                final float y = motionEvent.getY(i);
                this.f[pointerId] = x;
                this.g[pointerId] = y;
            }
        }
    }
    
    private boolean e(float abs, float abs2, final int n, final int n2) {
        abs = Math.abs(abs);
        abs2 = Math.abs(abs2);
        final int n3 = this.h[n];
        boolean b2;
        final boolean b = b2 = false;
        if ((n3 & n2) == n2) {
            b2 = b;
            if ((this.q & n2) != 0x0) {
                b2 = b;
                if ((this.j[n] & n2) != n2) {
                    b2 = b;
                    if ((this.i[n] & n2) != n2) {
                        final int b3 = this.b;
                        if (abs <= b3 && abs2 <= b3) {
                            b2 = b;
                        }
                        else {
                            if (abs < abs2 * 0.5f && this.s.onEdgeLock(n2)) {
                                final int[] j = this.j;
                                j[n] |= n2;
                                return false;
                            }
                            b2 = b;
                            if ((this.i[n] & n2) == 0x0) {
                                b2 = b;
                                if (abs > this.b) {
                                    b2 = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return b2;
    }
    
    private boolean h(final View view, final float a, final float a2) {
        final boolean b = false;
        final boolean b2 = false;
        boolean b3 = false;
        if (view == null) {
            return false;
        }
        final boolean b4 = this.s.getViewHorizontalDragRange(view) > 0;
        final boolean b5 = this.s.getViewVerticalDragRange(view) > 0;
        if (b4 && b5) {
            final int b6 = this.b;
            if (a * a + a2 * a2 > b6 * b6) {
                b3 = true;
            }
            return b3;
        }
        if (b4) {
            boolean b7 = b;
            if (Math.abs(a) > this.b) {
                b7 = true;
            }
            return b7;
        }
        boolean b8 = b2;
        if (b5) {
            b8 = b2;
            if (Math.abs(a2) > this.b) {
                b8 = true;
            }
        }
        return b8;
    }
    
    private float i(final float a, final float n, float n2) {
        final float abs = Math.abs(a);
        if (abs < n) {
            return 0.0f;
        }
        if (abs > n2) {
            if (a <= 0.0f) {
                n2 = -n2;
            }
            return n2;
        }
        return a;
    }
    
    private int j(final int a, final int n, int n2) {
        final int abs = Math.abs(a);
        if (abs < n) {
            return 0;
        }
        if (abs > n2) {
            if (a <= 0) {
                n2 = -n2;
            }
            return n2;
        }
        return a;
    }
    
    private void k() {
        final float[] d = this.d;
        if (d == null) {
            return;
        }
        Arrays.fill(d, 0.0f);
        Arrays.fill(this.e, 0.0f);
        Arrays.fill(this.f, 0.0f);
        Arrays.fill(this.g, 0.0f);
        Arrays.fill(this.h, 0);
        Arrays.fill(this.i, 0);
        Arrays.fill(this.j, 0);
        this.k = 0;
    }
    
    private void l(final int n) {
        if (this.d != null) {
            if (this.J(n)) {
                this.d[n] = 0.0f;
                this.e[n] = 0.0f;
                this.f[n] = 0.0f;
                this.g[n] = 0.0f;
                this.h[n] = 0;
                this.i[n] = 0;
                this.j[n] = 0;
                this.k &= ~(1 << n);
            }
        }
    }
    
    private int m(int a, int abs, final int n) {
        if (a == 0) {
            return 0;
        }
        final int width = this.v.getWidth();
        final int n2 = width / 2;
        final float min = Math.min(1.0f, Math.abs(a) / (float)width);
        final float n3 = (float)n2;
        final float s = this.s(min);
        abs = Math.abs(abs);
        if (abs > 0) {
            a = Math.round(Math.abs((n3 + s * n3) / abs) * 1000.0f) * 4;
        }
        else {
            a = (int)((Math.abs(a) / (float)n + 1.0f) * 256.0f);
        }
        return Math.min(a, 600);
    }
    
    private int n(final View view, int m, int i, int j, int k) {
        j = this.j(j, (int)this.n, (int)this.m);
        k = this.j(k, (int)this.n, (int)this.m);
        final int abs = Math.abs(m);
        final int abs2 = Math.abs(i);
        final int abs3 = Math.abs(j);
        final int abs4 = Math.abs(k);
        final int n = abs3 + abs4;
        final int n2 = abs + abs2;
        float n3;
        float n4;
        if (j != 0) {
            n3 = (float)abs3;
            n4 = (float)n;
        }
        else {
            n3 = (float)abs;
            n4 = (float)n2;
        }
        final float n5 = n3 / n4;
        float n6;
        float n7;
        if (k != 0) {
            n6 = (float)abs4;
            n7 = (float)n;
        }
        else {
            n6 = (float)abs2;
            n7 = (float)n2;
        }
        final float n8 = n6 / n7;
        m = this.m(m, j, this.s.getViewHorizontalDragRange(view));
        i = this.m(i, k, this.s.getViewVerticalDragRange(view));
        return (int)(m * n5 + i * n8);
    }
    
    public static d p(@j0 final ViewGroup viewGroup, final float n, @j0 final c c) {
        final d q = q(viewGroup, c);
        q.b *= (int)(1.0f / n);
        return q;
    }
    
    public static d q(@j0 final ViewGroup viewGroup, @j0 final c c) {
        return new d(viewGroup.getContext(), viewGroup, c);
    }
    
    private void r(final float n, final float n2) {
        this.u = true;
        this.s.onViewReleased(this.t, n, n2);
        this.u = false;
        if (this.a == 1) {
            this.R(0);
        }
    }
    
    private float s(final float n) {
        return (float)Math.sin((n - 0.5f) * 0.47123894f);
    }
    
    private void t(int clampViewPositionVertical, final int n, final int n2, final int n3) {
        final int left = this.t.getLeft();
        final int top = this.t.getTop();
        int clampViewPositionHorizontal = clampViewPositionVertical;
        if (n2 != 0) {
            clampViewPositionHorizontal = this.s.clampViewPositionHorizontal(this.t, clampViewPositionVertical, n2);
            androidx.core.view.j0.c1(this.t, clampViewPositionHorizontal - left);
        }
        clampViewPositionVertical = n;
        if (n3 != 0) {
            clampViewPositionVertical = this.s.clampViewPositionVertical(this.t, n, n3);
            androidx.core.view.j0.d1(this.t, clampViewPositionVertical - top);
        }
        if (n2 != 0 || n3 != 0) {
            this.s.onViewPositionChanged(this.t, clampViewPositionHorizontal, clampViewPositionVertical, clampViewPositionHorizontal - left, clampViewPositionVertical - top);
        }
    }
    
    private void u(int n) {
        final float[] d = this.d;
        if (d == null || d.length <= n) {
            final float[] d2 = new float[++n];
            final float[] e = new float[n];
            final float[] f = new float[n];
            final float[] g = new float[n];
            final int[] h = new int[n];
            final int[] i = new int[n];
            final int[] j = new int[n];
            if (d != null) {
                System.arraycopy(d, 0, d2, 0, d.length);
                final float[] e2 = this.e;
                System.arraycopy(e2, 0, e, 0, e2.length);
                final float[] f2 = this.f;
                System.arraycopy(f2, 0, f, 0, f2.length);
                final float[] g2 = this.g;
                System.arraycopy(g2, 0, g, 0, g2.length);
                final int[] h2 = this.h;
                System.arraycopy(h2, 0, h, 0, h2.length);
                final int[] k = this.i;
                System.arraycopy(k, 0, i, 0, k.length);
                final int[] l = this.j;
                System.arraycopy(l, 0, j, 0, l.length);
            }
            this.d = d2;
            this.e = e;
            this.f = f;
            this.g = g;
            this.h = h;
            this.i = i;
            this.j = j;
        }
    }
    
    private boolean x(int n, int n2, int n3, final int n4) {
        final int left = this.t.getLeft();
        final int top = this.t.getTop();
        n -= left;
        n2 -= top;
        if (n == 0 && n2 == 0) {
            this.r.abortAnimation();
            this.R(0);
            return false;
        }
        n3 = this.n(this.t, n, n2, n3, n4);
        this.r.startScroll(left, top, n, n2, n3);
        this.R(2);
        return true;
    }
    
    @n0
    public int A() {
        return this.p;
    }
    
    @n0
    public int B() {
        return this.o;
    }
    
    public float D() {
        return this.n;
    }
    
    @n0
    public int E() {
        return this.b;
    }
    
    public int F() {
        return this.a;
    }
    
    public boolean G(final int n, final int n2) {
        return this.L(this.t, n, n2);
    }
    
    public boolean H(final int n) {
        for (int length = this.h.length, i = 0; i < length; ++i) {
            if (this.I(n, i)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean I(final int n, final int n2) {
        return this.J(n2) && (n & this.h[n2]) != 0x0;
    }
    
    public boolean J(final int n) {
        final int k = this.k;
        boolean b = true;
        if ((1 << n & k) == 0x0) {
            b = false;
        }
        return b;
    }
    
    public boolean L(@k0 final View view, final int n, final int n2) {
        final boolean b = false;
        if (view == null) {
            return false;
        }
        boolean b2 = b;
        if (n >= view.getLeft()) {
            b2 = b;
            if (n < view.getRight()) {
                b2 = b;
                if (n2 >= view.getTop()) {
                    b2 = b;
                    if (n2 < view.getBottom()) {
                        b2 = true;
                    }
                }
            }
        }
        return b2;
    }
    
    public void M(@j0 final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        final int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            this.c();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
        final int n = 0;
        int i = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.a == 1) {
                        if (!this.K(this.c)) {
                            return;
                        }
                        final int pointerIndex = motionEvent.findPointerIndex(this.c);
                        final float x = motionEvent.getX(pointerIndex);
                        final float y = motionEvent.getY(pointerIndex);
                        final float[] f = this.f;
                        final int c = this.c;
                        final int n2 = (int)(x - f[c]);
                        final int n3 = (int)(y - this.g[c]);
                        this.t(this.t.getLeft() + n2, this.t.getTop() + n3, n2, n3);
                    }
                    else {
                        for (int pointerCount = motionEvent.getPointerCount(), j = n; j < pointerCount; ++j) {
                            final int pointerId = motionEvent.getPointerId(j);
                            if (this.K(pointerId)) {
                                final float x2 = motionEvent.getX(j);
                                final float y2 = motionEvent.getY(j);
                                final float n4 = x2 - this.d[pointerId];
                                final float n5 = y2 - this.e[pointerId];
                                this.O(n4, n5, pointerId);
                                if (this.a == 1) {
                                    break;
                                }
                                final View v = this.v((int)x2, (int)y2);
                                if (this.h(v, n4, n5) && this.Y(v, pointerId)) {
                                    break;
                                }
                            }
                        }
                    }
                    this.Q(motionEvent);
                    return;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 5) {
                        if (actionMasked != 6) {
                            return;
                        }
                        final int pointerId2 = motionEvent.getPointerId(actionIndex);
                        Label_0211: {
                            if (this.a == 1 && pointerId2 == this.c) {
                                while (true) {
                                    while (i < motionEvent.getPointerCount()) {
                                        final int pointerId3 = motionEvent.getPointerId(i);
                                        if (pointerId3 != this.c) {
                                            final View v2 = this.v((int)motionEvent.getX(i), (int)motionEvent.getY(i));
                                            final View t = this.t;
                                            if (v2 == t && this.Y(t, pointerId3)) {
                                                final int c2 = this.c;
                                                if (c2 == -1) {
                                                    this.N();
                                                }
                                                break Label_0211;
                                            }
                                        }
                                        ++i;
                                    }
                                    final int c2 = -1;
                                    continue;
                                }
                            }
                        }
                        this.l(pointerId2);
                        return;
                    }
                    else {
                        final int pointerId4 = motionEvent.getPointerId(actionIndex);
                        final float x3 = motionEvent.getX(actionIndex);
                        final float y3 = motionEvent.getY(actionIndex);
                        this.P(x3, y3, pointerId4);
                        if (this.a == 0) {
                            this.Y(this.v((int)x3, (int)y3), pointerId4);
                            final int n6 = this.h[pointerId4];
                            final int q = this.q;
                            if ((n6 & q) != 0x0) {
                                this.s.onEdgeTouched(n6 & q, pointerId4);
                            }
                            return;
                        }
                        else {
                            if (this.G((int)x3, (int)y3)) {
                                this.Y(this.t, pointerId4);
                            }
                            return;
                        }
                    }
                }
                else if (this.a == 1) {
                    this.r(0.0f, 0.0f);
                }
            }
            else if (this.a == 1) {
                this.N();
            }
            this.c();
        }
        else {
            final float x4 = motionEvent.getX();
            final float y4 = motionEvent.getY();
            final int pointerId5 = motionEvent.getPointerId(0);
            final View v3 = this.v((int)x4, (int)y4);
            this.P(x4, y4, pointerId5);
            this.Y(v3, pointerId5);
            final int n7 = this.h[pointerId5];
            final int q2 = this.q;
            if ((n7 & q2) != 0x0) {
                this.s.onEdgeTouched(n7 & q2, pointerId5);
            }
        }
    }
    
    void R(final int a) {
        this.v.removeCallbacks(this.w);
        if (this.a != a) {
            this.a = a;
            this.s.onViewDragStateChanged(a);
            if (this.a == 0) {
                this.t = null;
            }
        }
    }
    
    public void S(@b0(from = 0L) @n0 final int o) {
        this.o = o;
    }
    
    public void T(final int q) {
        this.q = q;
    }
    
    public void U(final float n) {
        this.n = n;
    }
    
    public boolean V(final int n, final int n2) {
        if (this.u) {
            return this.x(n, n2, (int)this.l.getXVelocity(this.c), (int)this.l.getYVelocity(this.c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }
    
    public boolean W(@j0 final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        final int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            this.c();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
        Label_0595: {
            if (actionMasked != 0) {
                Label_0493: {
                    if (actionMasked == 1) {
                        break Label_0493;
                    }
                    if (actionMasked != 2) {
                        if (actionMasked == 3) {
                            break Label_0493;
                        }
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                this.l(motionEvent.getPointerId(actionIndex));
                            }
                        }
                        else {
                            final int pointerId = motionEvent.getPointerId(actionIndex);
                            final float x = motionEvent.getX(actionIndex);
                            final float y = motionEvent.getY(actionIndex);
                            this.P(x, y, pointerId);
                            final int a = this.a;
                            if (a == 0) {
                                final int n = this.h[pointerId];
                                final int q = this.q;
                                if ((n & q) != 0x0) {
                                    this.s.onEdgeTouched(n & q, pointerId);
                                }
                            }
                            else if (a == 2) {
                                final View v = this.v((int)x, (int)y);
                                if (v == this.t) {
                                    this.Y(v, pointerId);
                                }
                            }
                        }
                    }
                    else if (this.d != null) {
                        if (this.e != null) {
                            for (int pointerCount = motionEvent.getPointerCount(), i = 0; i < pointerCount; ++i) {
                                final int pointerId2 = motionEvent.getPointerId(i);
                                if (this.K(pointerId2)) {
                                    final float x2 = motionEvent.getX(i);
                                    final float y2 = motionEvent.getY(i);
                                    final float n2 = x2 - this.d[pointerId2];
                                    final float n3 = y2 - this.e[pointerId2];
                                    final View v2 = this.v((int)x2, (int)y2);
                                    final boolean b = v2 != null && this.h(v2, n2, n3);
                                    if (b) {
                                        final int left = v2.getLeft();
                                        final int n4 = (int)n2;
                                        final int clampViewPositionHorizontal = this.s.clampViewPositionHorizontal(v2, left + n4, n4);
                                        final int top = v2.getTop();
                                        final int n5 = (int)n3;
                                        final int clampViewPositionVertical = this.s.clampViewPositionVertical(v2, top + n5, n5);
                                        final int viewHorizontalDragRange = this.s.getViewHorizontalDragRange(v2);
                                        final int viewVerticalDragRange = this.s.getViewVerticalDragRange(v2);
                                        if (viewHorizontalDragRange == 0 || (viewHorizontalDragRange > 0 && clampViewPositionHorizontal == left)) {
                                            if (viewVerticalDragRange == 0) {
                                                break;
                                            }
                                            if (viewVerticalDragRange > 0 && clampViewPositionVertical == top) {
                                                break;
                                            }
                                        }
                                    }
                                    this.O(n2, n3, pointerId2);
                                    if (this.a == 1) {
                                        break;
                                    }
                                    if (b && this.Y(v2, pointerId2)) {
                                        break;
                                    }
                                }
                            }
                            this.Q(motionEvent);
                        }
                    }
                    break Label_0595;
                }
                this.c();
            }
            else {
                final float x3 = motionEvent.getX();
                final float y3 = motionEvent.getY();
                final int pointerId3 = motionEvent.getPointerId(0);
                this.P(x3, y3, pointerId3);
                final View v3 = this.v((int)x3, (int)y3);
                if (v3 == this.t && this.a == 2) {
                    this.Y(v3, pointerId3);
                }
                final int n6 = this.h[pointerId3];
                final int q2 = this.q;
                if ((n6 & q2) != 0x0) {
                    this.s.onEdgeTouched(n6 & q2, pointerId3);
                }
            }
        }
        boolean b2 = false;
        if (this.a == 1) {
            b2 = true;
        }
        return b2;
    }
    
    public boolean X(@j0 final View t, final int n, final int n2) {
        this.t = t;
        this.c = -1;
        final boolean x = this.x(n, n2, 0, 0);
        if (!x && this.a == 0 && this.t != null) {
            this.t = null;
        }
        return x;
    }
    
    boolean Y(final View view, final int c) {
        if (view == this.t && this.c == c) {
            return true;
        }
        if (view != null && this.s.tryCaptureView(view, c)) {
            this.d(view, this.c = c);
            return true;
        }
        return false;
    }
    
    public void a() {
        this.c();
        if (this.a == 2) {
            final int currX = this.r.getCurrX();
            final int currY = this.r.getCurrY();
            this.r.abortAnimation();
            final int currX2 = this.r.getCurrX();
            final int currY2 = this.r.getCurrY();
            this.s.onViewPositionChanged(this.t, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        this.R(0);
    }
    
    protected boolean b(@j0 final View view, final boolean b, final int n, final int n2, final int n3, final int n4) {
        final boolean b2 = view instanceof ViewGroup;
        final boolean b3 = true;
        if (b2) {
            final ViewGroup viewGroup = (ViewGroup)view;
            final int scrollX = view.getScrollX();
            final int scrollY = view.getScrollY();
            for (int i = viewGroup.getChildCount() - 1; i >= 0; --i) {
                final View child = viewGroup.getChildAt(i);
                final int n5 = n3 + scrollX;
                if (n5 >= child.getLeft() && n5 < child.getRight()) {
                    final int n6 = n4 + scrollY;
                    if (n6 >= child.getTop() && n6 < child.getBottom() && this.b(child, true, n, n2, n5 - child.getLeft(), n6 - child.getTop())) {
                        return true;
                    }
                }
            }
        }
        if (b) {
            boolean b4 = b3;
            if (view.canScrollHorizontally(-n)) {
                return b4;
            }
            if (view.canScrollVertically(-n2)) {
                b4 = b3;
                return b4;
            }
        }
        return false;
    }
    
    public void c() {
        this.c = -1;
        this.k();
        final VelocityTracker l = this.l;
        if (l != null) {
            l.recycle();
            this.l = null;
        }
    }
    
    public void d(@j0 final View t, final int c) {
        if (t.getParent() == this.v) {
            this.t = t;
            this.c = c;
            this.s.onViewCaptured(t, c);
            this.R(1);
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        sb.append(this.v);
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public boolean f(final int n) {
        for (int length = this.d.length, i = 0; i < length; ++i) {
            if (this.g(n, i)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean g(int b, final int n) {
        final boolean j = this.J(n);
        final boolean b2 = false;
        final boolean b3 = false;
        boolean b4 = false;
        if (!j) {
            return false;
        }
        final boolean b5 = (b & 0x1) == 0x1;
        if ((b & 0x2) == 0x2) {
            b = 1;
        }
        else {
            b = 0;
        }
        final float a = this.f[n] - this.d[n];
        final float a2 = this.g[n] - this.e[n];
        if (b5 && b != 0) {
            b = this.b;
            if (a * a + a2 * a2 > b * b) {
                b4 = true;
            }
            return b4;
        }
        if (b5) {
            boolean b6 = b2;
            if (Math.abs(a) > this.b) {
                b6 = true;
            }
            return b6;
        }
        boolean b7 = b3;
        if (b != 0) {
            b7 = b3;
            if (Math.abs(a2) > this.b) {
                b7 = true;
            }
        }
        return b7;
    }
    
    public boolean o(final boolean b) {
        final int a = this.a;
        final boolean b2 = false;
        if (a == 2) {
            final boolean computeScrollOffset = this.r.computeScrollOffset();
            final int currX = this.r.getCurrX();
            final int currY = this.r.getCurrY();
            final int n = currX - this.t.getLeft();
            final int n2 = currY - this.t.getTop();
            if (n != 0) {
                androidx.core.view.j0.c1(this.t, n);
            }
            if (n2 != 0) {
                androidx.core.view.j0.d1(this.t, n2);
            }
            if (n != 0 || n2 != 0) {
                this.s.onViewPositionChanged(this.t, currX, currY, n, n2);
            }
            boolean b3 = computeScrollOffset;
            if (computeScrollOffset) {
                b3 = computeScrollOffset;
                if (currX == this.r.getFinalX()) {
                    b3 = computeScrollOffset;
                    if (currY == this.r.getFinalY()) {
                        this.r.abortAnimation();
                        b3 = false;
                    }
                }
            }
            if (!b3) {
                if (b) {
                    this.v.post(this.w);
                }
                else {
                    this.R(0);
                }
            }
        }
        boolean b4 = b2;
        if (this.a == 2) {
            b4 = true;
        }
        return b4;
    }
    
    @k0
    public View v(final int n, final int n2) {
        for (int i = this.v.getChildCount() - 1; i >= 0; --i) {
            final View child = this.v.getChildAt(this.s.getOrderedChildIndex(i));
            if (n >= child.getLeft() && n < child.getRight() && n2 >= child.getTop() && n2 < child.getBottom()) {
                return child;
            }
        }
        return null;
    }
    
    public void w(final int n, final int n2, final int n3, final int n4) {
        if (this.u) {
            this.r.fling(this.t.getLeft(), this.t.getTop(), (int)this.l.getXVelocity(this.c), (int)this.l.getYVelocity(this.c), n, n3, n2, n4);
            this.R(2);
            return;
        }
        throw new IllegalStateException("Cannot flingCapturedView outside of a call to Callback#onViewReleased");
    }
    
    public int y() {
        return this.c;
    }
    
    @k0
    public View z() {
        return this.t;
    }
    
    public abstract static class c
    {
        public int clampViewPositionHorizontal(@j0 final View view, final int n, final int n2) {
            return 0;
        }
        
        public int clampViewPositionVertical(@j0 final View view, final int n, final int n2) {
            return 0;
        }
        
        public int getOrderedChildIndex(final int n) {
            return n;
        }
        
        public int getViewHorizontalDragRange(@j0 final View view) {
            return 0;
        }
        
        public int getViewVerticalDragRange(@j0 final View view) {
            return 0;
        }
        
        public void onEdgeDragStarted(final int n, final int n2) {
        }
        
        public boolean onEdgeLock(final int n) {
            return false;
        }
        
        public void onEdgeTouched(final int n, final int n2) {
        }
        
        public void onViewCaptured(@j0 final View view, final int n) {
        }
        
        public void onViewDragStateChanged(final int n) {
        }
        
        public void onViewPositionChanged(@j0 final View view, final int n, final int n2, @n0 final int n3, @n0 final int n4) {
        }
        
        public void onViewReleased(@j0 final View view, final float n, final float n2) {
        }
        
        public abstract boolean tryCaptureView(@j0 final View p0, final int p1);
    }
}
