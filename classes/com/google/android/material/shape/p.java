// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.shape;

import androidx.annotation.k0;
import android.graphics.Path$Direction;
import androidx.annotation.p0;
import androidx.annotation.t0;
import androidx.annotation.a1;
import android.graphics.RectF;
import android.graphics.Path$Op;
import android.os.Build$VERSION;
import androidx.annotation.j0;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Matrix;

public class p
{
    private final q[] a;
    private final Matrix[] b;
    private final Matrix[] c;
    private final PointF d;
    private final Path e;
    private final Path f;
    private final q g;
    private final float[] h;
    private final float[] i;
    private final Path j;
    private final Path k;
    private boolean l;
    
    public p() {
        this.a = new q[4];
        this.b = new Matrix[4];
        this.c = new Matrix[4];
        this.d = new PointF();
        this.e = new Path();
        this.f = new Path();
        this.g = new q();
        this.h = new float[2];
        this.i = new float[2];
        this.j = new Path();
        this.k = new Path();
        this.l = true;
        for (int i = 0; i < 4; ++i) {
            this.a[i] = new q();
            this.b[i] = new Matrix();
            this.c[i] = new Matrix();
        }
    }
    
    private float a(final int n) {
        return (float)((n + 1) * 90);
    }
    
    private void b(@j0 final c c, final int n) {
        this.h[0] = this.a[n].l();
        this.h[1] = this.a[n].m();
        this.b[n].mapPoints(this.h);
        final Path b = c.b;
        final float[] h = this.h;
        if (n == 0) {
            b.moveTo(h[0], h[1]);
        }
        else {
            b.lineTo(h[0], h[1]);
        }
        this.a[n].d(this.b[n], c.b);
        final b d = c.d;
        if (d != null) {
            d.a(this.a[n], this.b[n], n);
        }
    }
    
    private void c(@j0 final c c, final int n) {
        final int n2 = (n + 1) % 4;
        this.h[0] = this.a[n].j();
        this.h[1] = this.a[n].k();
        this.b[n].mapPoints(this.h);
        this.i[0] = this.a[n2].l();
        this.i[1] = this.a[n2].m();
        this.b[n2].mapPoints(this.i);
        final float[] h = this.h;
        final float n3 = h[0];
        final float[] i = this.i;
        final float max = Math.max((float)Math.hypot(n3 - i[0], h[1] - i[1]) - 0.001f, 0.0f);
        final float j = this.i(c.c, n);
        this.g.p(0.0f, 0.0f);
        final g k = this.j(n, c.a);
        k.b(max, j, c.e, this.g);
        this.j.reset();
        this.g.d(this.c[n], this.j);
        q q;
        Matrix matrix;
        Path path;
        if (this.l && Build$VERSION.SDK_INT >= 19 && (k.a() || this.l(this.j, n) || this.l(this.j, n2))) {
            final Path l = this.j;
            l.op(l, this.f, Path$Op.DIFFERENCE);
            this.h[0] = this.g.l();
            this.h[1] = this.g.m();
            this.c[n].mapPoints(this.h);
            final Path e = this.e;
            final float[] h2 = this.h;
            e.moveTo(h2[0], h2[1]);
            q = this.g;
            matrix = this.c[n];
            path = this.e;
        }
        else {
            q = this.g;
            matrix = this.c[n];
            path = c.b;
        }
        q.d(matrix, path);
        final b d = c.d;
        if (d != null) {
            d.b(this.g, this.c[n], n);
        }
    }
    
    private void f(final int n, @j0 final RectF rectF, @j0 final PointF pointF) {
        while (true) {
            Label_0062: {
                if (n == 1) {
                    final float n2 = rectF.right;
                    break Label_0062;
                }
                if (n == 2) {
                    final float n2 = rectF.left;
                    break Label_0062;
                }
                float n2;
                if (n != 3) {
                    n2 = rectF.right;
                }
                else {
                    n2 = rectF.left;
                }
                final float n3 = rectF.top;
                pointF.set(n2, n3);
                return;
            }
            final float n3 = rectF.bottom;
            continue;
        }
    }
    
    private d g(final int n, @j0 final o o) {
        if (n == 1) {
            return o.l();
        }
        if (n == 2) {
            return o.j();
        }
        if (n != 3) {
            return o.t();
        }
        return o.r();
    }
    
    private e h(final int n, @j0 final o o) {
        if (n == 1) {
            return o.k();
        }
        if (n == 2) {
            return o.i();
        }
        if (n != 3) {
            return o.s();
        }
        return o.q();
    }
    
    private float i(@j0 final RectF rectF, final int n) {
        final float[] h = this.h;
        final q[] a = this.a;
        h[0] = a[n].c;
        h[1] = a[n].d;
        this.b[n].mapPoints(h);
        float n2;
        float n3;
        if (n != 1 && n != 3) {
            n2 = rectF.centerY();
            n3 = this.h[1];
        }
        else {
            n2 = rectF.centerX();
            n3 = this.h[0];
        }
        return Math.abs(n2 - n3);
    }
    
    private g j(final int n, @j0 final o o) {
        if (n == 1) {
            return o.h();
        }
        if (n == 2) {
            return o.n();
        }
        if (n != 3) {
            return o.o();
        }
        return o.p();
    }
    
    @a1
    @j0
    @t0({ t0.a.H })
    public static p k() {
        return a.a;
    }
    
    @p0(19)
    private boolean l(final Path path, final int n) {
        this.k.reset();
        this.a[n].d(this.b[n], this.k);
        final RectF rectF = new RectF();
        final boolean b = true;
        path.computeBounds(rectF, true);
        this.k.computeBounds(rectF, true);
        path.op(this.k, Path$Op.INTERSECT);
        path.computeBounds(rectF, true);
        boolean b2 = b;
        if (rectF.isEmpty()) {
            b2 = (rectF.width() > 1.0f && rectF.height() > 1.0f && b);
        }
        return b2;
    }
    
    private void m(@j0 final c c, final int n) {
        this.h(n, c.a).c(this.a[n], 90.0f, c.e, c.c, this.g(n, c.a));
        final float a = this.a(n);
        this.b[n].reset();
        this.f(n, c.c, this.d);
        final Matrix matrix = this.b[n];
        final PointF d = this.d;
        matrix.setTranslate(d.x, d.y);
        this.b[n].preRotate(a);
    }
    
    private void o(final int n) {
        this.h[0] = this.a[n].j();
        this.h[1] = this.a[n].k();
        this.b[n].mapPoints(this.h);
        final float a = this.a(n);
        this.c[n].reset();
        final Matrix matrix = this.c[n];
        final float[] h = this.h;
        matrix.setTranslate(h[0], h[1]);
        this.c[n].preRotate(a);
    }
    
    public void d(final o o, final float n, final RectF rectF, @j0 final Path path) {
        this.e(o, n, rectF, null, path);
    }
    
    @t0({ t0.a.H })
    public void e(final o o, final float n, final RectF rectF, final b b, @j0 final Path path) {
        path.rewind();
        this.e.rewind();
        this.f.rewind();
        this.f.addRect(rectF, Path$Direction.CW);
        final c c = new c(o, n, rectF, b, path);
        final int n2 = 0;
        int n3 = 0;
        int i;
        while (true) {
            i = n2;
            if (n3 >= 4) {
                break;
            }
            this.m(c, n3);
            this.o(n3);
            ++n3;
        }
        while (i < 4) {
            this.b(c, i);
            this.c(c, i);
            ++i;
        }
        path.close();
        this.e.close();
        if (Build$VERSION.SDK_INT >= 19 && !this.e.isEmpty()) {
            path.op(this.e, Path$Op.UNION);
        }
    }
    
    void n(final boolean l) {
        this.l = l;
    }
    
    private static class a
    {
        static final p a;
        
        static {
            a = new p();
        }
    }
    
    @t0({ t0.a.H })
    public interface b
    {
        void a(final q p0, final Matrix p1, final int p2);
        
        void b(final q p0, final Matrix p1, final int p2);
    }
    
    static final class c
    {
        @j0
        public final o a;
        @j0
        public final Path b;
        @j0
        public final RectF c;
        @k0
        public final b d;
        public final float e;
        
        c(@j0 final o a, final float e, final RectF c, @k0 final b d, final Path b) {
            this.d = d;
            this.a = a;
            this.e = e;
            this.c = c;
            this.b = b;
        }
    }
}
