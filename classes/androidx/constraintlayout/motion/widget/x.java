// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.motion.widget;

import android.graphics.RectF;
import android.view.ViewGroup;
import android.view.MotionEvent;
import android.view.View;
import android.view.View$OnTouchListener;
import androidx.core.widget.NestedScrollView;
import android.util.Log;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.j;
import android.content.res.TypedArray;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import android.content.Context;

class x
{
    private static final String G = "TouchResponse";
    private static final boolean H = false;
    private static final int I = 1000;
    private static final float J = 1.0E-7f;
    private static final float[][] K;
    private static final float[][] L;
    private static final int M = 0;
    private static final int N = 1;
    private static final int O = 2;
    private static final int P = 3;
    private static final int Q = 4;
    private static final int R = 5;
    private static final int S = 0;
    private static final int T = 1;
    private static final int U = 2;
    private static final int V = 3;
    private static final int W = 4;
    private static final int X = 5;
    private static final int Y = 6;
    static final int Z = 1;
    static final int a0 = 2;
    static final int b0 = 4;
    public static final int c0 = 0;
    public static final int d0 = 1;
    private float A;
    private float B;
    private float C;
    private float D;
    private int E;
    private int F;
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private float g;
    private float h;
    float i;
    float j;
    private int k;
    boolean l;
    private float m;
    private float n;
    private boolean o;
    private float[] p;
    private int[] q;
    private float r;
    private float s;
    private final s t;
    private float u;
    private float v;
    private boolean w;
    private float x;
    private int y;
    private float z;
    
    static {
        K = new float[][] { { 0.5f, 0.0f }, { 0.0f, 0.5f }, { 1.0f, 0.5f }, { 0.5f, 1.0f }, { 0.5f, 0.5f }, { 0.0f, 0.5f }, { 1.0f, 0.5f } };
        L = new float[][] { { 0.0f, -1.0f }, { 0.0f, 1.0f }, { -1.0f, 0.0f }, { 1.0f, 0.0f }, { -1.0f, 0.0f }, { 1.0f, 0.0f } };
    }
    
    x(final Context context, final s t, final XmlPullParser xmlPullParser) {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.g = 0.5f;
        this.h = 0.5f;
        this.i = 0.5f;
        this.j = 0.5f;
        this.k = -1;
        this.l = false;
        this.m = 0.0f;
        this.n = 1.0f;
        this.o = false;
        this.p = new float[2];
        this.q = new int[2];
        this.u = 4.0f;
        this.v = 1.2f;
        this.w = true;
        this.x = 1.0f;
        this.y = 0;
        this.z = 10.0f;
        this.A = 10.0f;
        this.B = 1.0f;
        this.C = Float.NaN;
        this.D = Float.NaN;
        this.E = 0;
        this.F = 0;
        this.t = t;
        this.c(context, Xml.asAttributeSet(xmlPullParser));
    }
    
    public x(final s t, final v v) {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.g = 0.5f;
        this.h = 0.5f;
        this.i = 0.5f;
        this.j = 0.5f;
        this.k = -1;
        this.l = false;
        this.m = 0.0f;
        this.n = 1.0f;
        this.o = false;
        this.p = new float[2];
        this.q = new int[2];
        this.u = 4.0f;
        this.v = 1.2f;
        this.w = true;
        this.x = 1.0f;
        this.y = 0;
        this.z = 10.0f;
        this.A = 10.0f;
        this.B = 1.0f;
        this.C = Float.NaN;
        this.D = Float.NaN;
        this.E = 0;
        this.F = 0;
        this.t = t;
        this.d = v.q();
        final int r = v.r();
        this.a = r;
        if (r != -1) {
            final float[][] k = androidx.constraintlayout.motion.widget.x.K;
            this.h = k[r][0];
            this.g = k[r][1];
        }
        final int b = v.b();
        this.b = b;
        final float[][] l = androidx.constraintlayout.motion.widget.x.L;
        if (b < l.length) {
            this.m = l[b][0];
            this.n = l[b][1];
        }
        else {
            this.n = Float.NaN;
            this.m = Float.NaN;
            this.l = true;
        }
        this.u = v.g();
        this.v = v.f();
        this.w = v.h();
        this.x = v.c();
        this.z = v.d();
        this.e = v.s();
        this.c = v.j();
        this.y = v.i();
        this.f = v.e();
        this.k = v.k();
        this.E = v.l();
        this.A = v.m();
        this.B = v.n();
        this.C = v.o();
        this.D = v.p();
        this.F = v.a();
    }
    
    private void b(final TypedArray typedArray) {
        for (int indexCount = typedArray.getIndexCount(), i = 0; i < indexCount; ++i) {
            final int index = typedArray.getIndex(i);
            if (index == androidx.constraintlayout.widget.j.m.Ik) {
                this.d = typedArray.getResourceId(index, this.d);
            }
            else if (index == androidx.constraintlayout.widget.j.m.Jk) {
                final int int1 = typedArray.getInt(index, this.a);
                this.a = int1;
                final float[][] k = androidx.constraintlayout.motion.widget.x.K;
                this.h = k[int1][0];
                this.g = k[int1][1];
            }
            else if (index == androidx.constraintlayout.widget.j.m.tk) {
                final int int2 = typedArray.getInt(index, this.b);
                this.b = int2;
                final float[][] l = androidx.constraintlayout.motion.widget.x.L;
                if (int2 < l.length) {
                    this.m = l[int2][0];
                    this.n = l[int2][1];
                }
                else {
                    this.n = Float.NaN;
                    this.m = Float.NaN;
                    this.l = true;
                }
            }
            else if (index == androidx.constraintlayout.widget.j.m.yk) {
                this.u = typedArray.getFloat(index, this.u);
            }
            else if (index == androidx.constraintlayout.widget.j.m.xk) {
                this.v = typedArray.getFloat(index, this.v);
            }
            else if (index == androidx.constraintlayout.widget.j.m.zk) {
                this.w = typedArray.getBoolean(index, this.w);
            }
            else if (index == androidx.constraintlayout.widget.j.m.uk) {
                this.x = typedArray.getFloat(index, this.x);
            }
            else if (index == androidx.constraintlayout.widget.j.m.vk) {
                this.z = typedArray.getFloat(index, this.z);
            }
            else if (index == androidx.constraintlayout.widget.j.m.Kk) {
                this.e = typedArray.getResourceId(index, this.e);
            }
            else if (index == androidx.constraintlayout.widget.j.m.Bk) {
                this.c = typedArray.getInt(index, this.c);
            }
            else if (index == androidx.constraintlayout.widget.j.m.Ak) {
                this.y = typedArray.getInteger(index, 0);
            }
            else if (index == androidx.constraintlayout.widget.j.m.wk) {
                this.f = typedArray.getResourceId(index, 0);
            }
            else if (index == androidx.constraintlayout.widget.j.m.Ck) {
                this.k = typedArray.getResourceId(index, this.k);
            }
            else if (index == androidx.constraintlayout.widget.j.m.Ek) {
                this.A = typedArray.getFloat(index, this.A);
            }
            else if (index == androidx.constraintlayout.widget.j.m.Fk) {
                this.B = typedArray.getFloat(index, this.B);
            }
            else if (index == androidx.constraintlayout.widget.j.m.Gk) {
                this.C = typedArray.getFloat(index, this.C);
            }
            else if (index == androidx.constraintlayout.widget.j.m.Hk) {
                this.D = typedArray.getFloat(index, this.D);
            }
            else if (index == androidx.constraintlayout.widget.j.m.Dk) {
                this.E = typedArray.getInt(index, this.E);
            }
            else if (index == androidx.constraintlayout.widget.j.m.sk) {
                this.F = typedArray.getInt(index, this.F);
            }
        }
    }
    
    private void c(final Context context, final AttributeSet set) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, androidx.constraintlayout.widget.j.m.rk);
        this.b(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }
    
    public void A(final float v) {
        this.v = v;
    }
    
    public void B(final float u) {
        this.u = u;
    }
    
    public void C(final boolean b) {
        if (b) {
            final float[][] l = androidx.constraintlayout.motion.widget.x.L;
            l[4] = l[3];
            l[5] = l[2];
            final float[][] k = androidx.constraintlayout.motion.widget.x.K;
            k[5] = k[2];
            k[6] = k[1];
        }
        else {
            final float[][] i = androidx.constraintlayout.motion.widget.x.L;
            i[4] = i[2];
            i[5] = i[3];
            final float[][] j = androidx.constraintlayout.motion.widget.x.K;
            j[5] = j[1];
            j[6] = j[2];
        }
        final float[][] m = androidx.constraintlayout.motion.widget.x.K;
        final int a = this.a;
        this.h = m[a][0];
        this.g = m[a][1];
        final int b2 = this.b;
        final float[][] l2 = androidx.constraintlayout.motion.widget.x.L;
        if (b2 >= l2.length) {
            return;
        }
        this.m = l2[b2][0];
        this.n = l2[b2][1];
    }
    
    public void D(final float h, final float g) {
        this.h = h;
        this.g = g;
    }
    
    public void E(final int c) {
        this.c = c;
    }
    
    void F(final float r, final float s) {
        this.r = r;
        this.s = s;
        this.o = false;
    }
    
    void G() {
        final int d = this.d;
        Object o;
        if (d != -1) {
            final View viewById = this.t.findViewById(d);
            if ((o = viewById) == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("cannot find TouchAnchorId @id/");
                sb.append(androidx.constraintlayout.motion.widget.c.i(this.t.getContext(), this.d));
                Log.e("TouchResponse", sb.toString());
                o = viewById;
            }
        }
        else {
            o = null;
        }
        if (o instanceof NestedScrollView) {
            final NestedScrollView nestedScrollView = (NestedScrollView)o;
            nestedScrollView.setOnTouchListener((View$OnTouchListener)new View$OnTouchListener() {
                public boolean onTouch(final View view, final MotionEvent motionEvent) {
                    return false;
                }
            });
            nestedScrollView.setOnScrollChangeListener((NestedScrollView.b)new NestedScrollView.b() {
                @Override
                public void a(final NestedScrollView nestedScrollView, final int n, final int n2, final int n3, final int n4) {
                }
            });
        }
    }
    
    float a(final float n, final float n2) {
        return n * this.m + n2 * this.n;
    }
    
    public int d() {
        return this.d;
    }
    
    public int e() {
        return this.F;
    }
    
    public int f() {
        return this.y;
    }
    
    RectF g(final ViewGroup viewGroup, final RectF rectF) {
        final int f = this.f;
        if (f == -1) {
            return null;
        }
        final View viewById = viewGroup.findViewById(f);
        if (viewById == null) {
            return null;
        }
        rectF.set((float)viewById.getLeft(), (float)viewById.getTop(), (float)viewById.getRight(), (float)viewById.getBottom());
        return rectF;
    }
    
    int h() {
        return this.f;
    }
    
    float i() {
        return this.v;
    }
    
    public float j() {
        return this.u;
    }
    
    boolean k() {
        return this.w;
    }
    
    float l(float n, final float n2) {
        this.t.E0(this.d, this.t.getProgress(), this.h, this.g, this.p);
        final float m = this.m;
        if (m != 0.0f) {
            final float[] p2 = this.p;
            if (p2[0] == 0.0f) {
                p2[0] = 1.0E-7f;
            }
            n = n * m / p2[0];
        }
        else {
            final float[] p3 = this.p;
            if (p3[1] == 0.0f) {
                p3[1] = 1.0E-7f;
            }
            n = n2 * this.n / p3[1];
        }
        return n;
    }
    
    public int m() {
        return this.E;
    }
    
    public float n() {
        return this.A;
    }
    
    public float o() {
        return this.B;
    }
    
    public float p() {
        return this.C;
    }
    
    public float q() {
        return this.D;
    }
    
    RectF r(final ViewGroup viewGroup, final RectF rectF) {
        final int e = this.e;
        if (e == -1) {
            return null;
        }
        final View viewById = viewGroup.findViewById(e);
        if (viewById == null) {
            return null;
        }
        rectF.set((float)viewById.getLeft(), (float)viewById.getTop(), (float)viewById.getRight(), (float)viewById.getBottom());
        return rectF;
    }
    
    int s() {
        return this.e;
    }
    
    void t(final MotionEvent motionEvent, final s.i i, int n, final u u) {
        if (this.l) {
            this.u(motionEvent, i, n, u);
            return;
        }
        i.e(motionEvent);
        n = motionEvent.getAction();
        if (n != 0) {
            if (n != 1) {
                if (n == 2) {
                    final float n2 = motionEvent.getRawY() - this.s;
                    final float n3 = motionEvent.getRawX() - this.r;
                    if (Math.abs(this.m * n3 + this.n * n2) > this.z || this.o) {
                        final float progress = this.t.getProgress();
                        if (!this.o) {
                            this.o = true;
                            this.t.setProgress(progress);
                        }
                        n = this.d;
                        if (n != -1) {
                            this.t.E0(n, progress, this.h, this.g, this.p);
                        }
                        else {
                            final float n4 = (float)Math.min(this.t.getWidth(), this.t.getHeight());
                            final float[] p4 = this.p;
                            p4[1] = this.n * n4;
                            p4[0] = n4 * this.m;
                        }
                        final float m = this.m;
                        final float[] p5 = this.p;
                        if (Math.abs((m * p5[0] + this.n * p5[1]) * this.x) < 0.01) {
                            final float[] p6 = this.p;
                            p6[1] = (p6[0] = 0.01f);
                        }
                        float n5;
                        if (this.m != 0.0f) {
                            n5 = n3 / this.p[0];
                        }
                        else {
                            n5 = n2 / this.p[1];
                        }
                        float a2;
                        final float a = a2 = Math.max(Math.min(progress + n5, 1.0f), 0.0f);
                        if (this.c == 6) {
                            a2 = Math.max(a, 0.01f);
                        }
                        float min = a2;
                        if (this.c == 7) {
                            min = Math.min(a2, 0.99f);
                        }
                        final float progress2 = this.t.getProgress();
                        if (min != progress2) {
                            n = fcmpl(progress2, 0.0f);
                            if (n == 0 || progress2 == 1.0f) {
                                this.t.x0(n == 0);
                            }
                            this.t.setProgress(min);
                            i.h(1000);
                            final float g = i.g();
                            final float f = i.f();
                            float u2;
                            if (this.m != 0.0f) {
                                u2 = g / this.p[0];
                            }
                            else {
                                u2 = f / this.p[1];
                            }
                            this.t.u0 = u2;
                        }
                        else {
                            this.t.u0 = 0.0f;
                        }
                        this.r = motionEvent.getRawX();
                        this.s = motionEvent.getRawY();
                    }
                }
            }
            else {
                this.o = false;
                i.h(1000);
                final float g2 = i.g();
                final float f2 = i.f();
                final float progress3 = this.t.getProgress();
                n = this.d;
                if (n != -1) {
                    this.t.E0(n, progress3, this.h, this.g, this.p);
                }
                else {
                    final float n6 = (float)Math.min(this.t.getWidth(), this.t.getHeight());
                    final float[] p7 = this.p;
                    p7[1] = this.n * n6;
                    p7[0] = n6 * this.m;
                }
                final float j = this.m;
                final float[] p8 = this.p;
                final float n7 = p8[0];
                final float n8 = p8[1];
                float n9;
                if (j != 0.0f) {
                    n9 = g2 / p8[0];
                }
                else {
                    n9 = f2 / p8[1];
                }
                float n10;
                if (!Float.isNaN(n9)) {
                    n10 = n9 / 3.0f + progress3;
                }
                else {
                    n10 = progress3;
                }
                Label_0893: {
                    if (n10 != 0.0f && n10 != 1.0f) {
                        n = this.c;
                        if (n != 3) {
                            float n11;
                            if (n10 < 0.5) {
                                n11 = 0.0f;
                            }
                            else {
                                n11 = 1.0f;
                            }
                            float abs = n9;
                            if (n == 6) {
                                abs = n9;
                                if (progress3 + n9 < 0.0f) {
                                    abs = Math.abs(n9);
                                }
                                n11 = 1.0f;
                            }
                            float n12 = abs;
                            if (this.c == 7) {
                                n12 = abs;
                                if (progress3 + abs > 1.0f) {
                                    n12 = -Math.abs(abs);
                                }
                                n11 = 0.0f;
                            }
                            this.t.f1(this.c, n11, n12);
                            if (0.0f >= progress3) {
                                break Label_0893;
                            }
                            if (1.0f <= progress3) {
                                break Label_0893;
                            }
                            return;
                        }
                    }
                    if (0.0f < n10 && 1.0f > n10) {
                        return;
                    }
                }
                this.t.setState(androidx.constraintlayout.motion.widget.s.m.J);
            }
        }
        else {
            this.r = motionEvent.getRawX();
            this.s = motionEvent.getRawY();
            this.o = false;
        }
    }
    
    @Override
    public String toString() {
        String string;
        if (Float.isNaN(this.m)) {
            string = "rotation";
        }
        else {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.m);
            sb.append(" , ");
            sb.append(this.n);
            string = sb.toString();
        }
        return string;
    }
    
    void u(final MotionEvent motionEvent, final s.i i, int n, final u u) {
        i.e(motionEvent);
        n = motionEvent.getAction();
        boolean b = false;
        if (n != 0) {
            if (n != 1) {
                if (n == 2) {
                    motionEvent.getRawY();
                    motionEvent.getRawX();
                    final float n2 = this.t.getWidth() / 2.0f;
                    final float n3 = this.t.getHeight() / 2.0f;
                    n = this.k;
                    float n6;
                    float n7;
                    if (n != -1) {
                        final View viewById = this.t.findViewById(n);
                        this.t.getLocationOnScreen(this.q);
                        final float n4 = (float)this.q[0];
                        final float n5 = (viewById.getLeft() + viewById.getRight()) / 2.0f;
                        n6 = (viewById.getTop() + viewById.getBottom()) / 2.0f + this.q[1];
                        n7 = n4 + n5;
                    }
                    else {
                        n = this.d;
                        n7 = n2;
                        n6 = n3;
                        if (n != -1) {
                            final View viewById2 = this.t.findViewById(this.t.I0(n).k());
                            if (viewById2 == null) {
                                Log.e("TouchResponse", "could not find view to animate to");
                                n7 = n2;
                                n6 = n3;
                            }
                            else {
                                this.t.getLocationOnScreen(this.q);
                                n7 = this.q[0] + (viewById2.getLeft() + viewById2.getRight()) / 2.0f;
                                n6 = this.q[1] + (viewById2.getTop() + viewById2.getBottom()) / 2.0f;
                            }
                        }
                    }
                    final float rawX = motionEvent.getRawX();
                    final float rawY = motionEvent.getRawY();
                    final double atan2 = Math.atan2(motionEvent.getRawY() - n6, motionEvent.getRawX() - n7);
                    final float n8 = (float)((atan2 - Math.atan2(this.s - n6, this.r - n7)) * 180.0 / 3.141592653589793);
                    float a;
                    if (n8 > 330.0f) {
                        a = n8 - 360.0f;
                    }
                    else {
                        a = n8;
                        if (n8 < -330.0f) {
                            a = n8 + 360.0f;
                        }
                    }
                    if (Math.abs(a) > 0.01 || this.o) {
                        final float progress = this.t.getProgress();
                        if (!this.o) {
                            this.o = true;
                            this.t.setProgress(progress);
                        }
                        n = this.d;
                        if (n != -1) {
                            this.t.E0(n, progress, this.h, this.g, this.p);
                            final float[] p4 = this.p;
                            p4[1] = (float)Math.toDegrees(p4[1]);
                        }
                        else {
                            this.p[1] = 360.0f;
                        }
                        final float max = Math.max(Math.min(progress + a * this.x / this.p[1], 1.0f), 0.0f);
                        final float progress2 = this.t.getProgress();
                        if (max != progress2) {
                            n = fcmpl(progress2, 0.0f);
                            if (n == 0 || progress2 == 1.0f) {
                                final s t = this.t;
                                if (n == 0) {
                                    b = true;
                                }
                                t.x0(b);
                            }
                            this.t.setProgress(max);
                            i.h(1000);
                            final float g = i.g();
                            final double n9 = i.f();
                            final double n10 = g;
                            this.t.u0 = (float)Math.toDegrees((float)(Math.hypot(n9, n10) * Math.sin(Math.atan2(n9, n10) - atan2) / Math.hypot(rawX - n7, rawY - n6)));
                        }
                        else {
                            this.t.u0 = 0.0f;
                        }
                        this.r = motionEvent.getRawX();
                        this.s = motionEvent.getRawY();
                    }
                }
            }
            else {
                this.o = false;
                i.h(16);
                final float g2 = i.g();
                final float f = i.f();
                final float progress3 = this.t.getProgress();
                float n11 = this.t.getWidth() / 2.0f;
                float n12 = this.t.getHeight() / 2.0f;
                n = this.k;
                Label_0925: {
                    View view;
                    if (n != -1) {
                        view = this.t.findViewById(n);
                        this.t.getLocationOnScreen(this.q);
                        n11 = this.q[0] + (view.getLeft() + view.getRight()) / 2.0f;
                        n = this.q[1];
                    }
                    else {
                        n = this.d;
                        if (n == -1) {
                            break Label_0925;
                        }
                        view = this.t.findViewById(this.t.I0(n).k());
                        this.t.getLocationOnScreen(this.q);
                        n11 = this.q[0] + (view.getLeft() + view.getRight()) / 2.0f;
                        n = this.q[1];
                    }
                    n12 = n + (view.getTop() + view.getBottom()) / 2.0f;
                }
                final float n13 = motionEvent.getRawX() - n11;
                final float n14 = motionEvent.getRawY() - n12;
                final double degrees = Math.toDegrees(Math.atan2(n14, n13));
                n = this.d;
                if (n != -1) {
                    this.t.E0(n, progress3, this.h, this.g, this.p);
                    final float[] p5 = this.p;
                    p5[1] = (float)Math.toDegrees(p5[1]);
                }
                else {
                    this.p[1] = 360.0f;
                }
                final float v = (float)(Math.toDegrees(Math.atan2(f + n14, g2 + n13)) - degrees) * 62.5f;
                float n15;
                if (!Float.isNaN(v)) {
                    n15 = v * 3.0f * this.x / this.p[1] + progress3;
                }
                else {
                    n15 = progress3;
                }
                Label_1272: {
                    if (n15 != 0.0f && n15 != 1.0f) {
                        n = this.c;
                        if (n != 3) {
                            final float a2 = v * this.x / this.p[1];
                            float n16;
                            if (n15 < 0.5) {
                                n16 = 0.0f;
                            }
                            else {
                                n16 = 1.0f;
                            }
                            float abs = a2;
                            if (n == 6) {
                                abs = a2;
                                if (progress3 + a2 < 0.0f) {
                                    abs = Math.abs(a2);
                                }
                                n16 = 1.0f;
                            }
                            float n17 = abs;
                            float n18 = n16;
                            if (this.c == 7) {
                                float n19 = abs;
                                if (progress3 + abs > 1.0f) {
                                    n19 = -Math.abs(abs);
                                }
                                n18 = 0.0f;
                                n17 = n19;
                            }
                            this.t.f1(this.c, n18, n17 * 3.0f);
                            if (0.0f >= progress3) {
                                break Label_1272;
                            }
                            if (1.0f <= progress3) {
                                break Label_1272;
                            }
                            return;
                        }
                    }
                    if (0.0f < n15 && 1.0f > n15) {
                        return;
                    }
                }
                this.t.setState(androidx.constraintlayout.motion.widget.s.m.J);
            }
        }
        else {
            this.r = motionEvent.getRawX();
            this.s = motionEvent.getRawY();
            this.o = false;
        }
    }
    
    void v(float max, final float n) {
        final float progress = this.t.getProgress();
        if (!this.o) {
            this.o = true;
            this.t.setProgress(progress);
        }
        this.t.E0(this.d, progress, this.h, this.g, this.p);
        final float m = this.m;
        final float[] p2 = this.p;
        if (Math.abs(m * p2[0] + this.n * p2[1]) < 0.01) {
            final float[] p3 = this.p;
            p3[1] = (p3[0] = 0.01f);
        }
        final float i = this.m;
        if (i != 0.0f) {
            max = max * i / this.p[0];
        }
        else {
            max = n * this.n / this.p[1];
        }
        max = Math.max(Math.min(progress + max, 1.0f), 0.0f);
        if (max != this.t.getProgress()) {
            this.t.setProgress(max);
        }
    }
    
    void w(float v, float n) {
        int n2 = 0;
        this.o = false;
        final float progress = this.t.getProgress();
        this.t.E0(this.d, progress, this.h, this.g, this.p);
        final float m = this.m;
        final float[] p2 = this.p;
        final float n3 = p2[0];
        final float n4 = this.n;
        final float n5 = p2[1];
        final float n6 = 0.0f;
        if (m != 0.0f) {
            v = v * m / p2[0];
        }
        else {
            v = n * n4 / p2[1];
        }
        n = progress;
        if (!Float.isNaN(v)) {
            n = progress + v / 3.0f;
        }
        if (n != 0.0f) {
            final boolean b = n != 1.0f;
            final int c = this.c;
            if (c != 3) {
                n2 = 1;
            }
            if ((n2 & (b ? 1 : 0)) != 0x0) {
                final s t = this.t;
                if (n < 0.5) {
                    n = n6;
                }
                else {
                    n = 1.0f;
                }
                t.f1(c, n, v);
            }
        }
    }
    
    public void x(final int d) {
        this.d = d;
    }
    
    void y(final int f) {
        this.F = f;
    }
    
    void z(final float r, final float s) {
        this.r = r;
        this.s = s;
    }
}
