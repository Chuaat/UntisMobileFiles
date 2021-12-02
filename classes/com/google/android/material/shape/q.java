// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.p0;
import androidx.annotation.j0;
import java.util.Iterator;
import android.graphics.Canvas;
import com.google.android.material.shadow.b;
import java.util.Collection;
import android.graphics.Path;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;

public class q
{
    private static final float j = 270.0f;
    protected static final float k = 180.0f;
    @Deprecated
    public float a;
    @Deprecated
    public float b;
    @Deprecated
    public float c;
    @Deprecated
    public float d;
    @Deprecated
    public float e;
    @Deprecated
    public float f;
    private final List<g> g;
    private final List<i> h;
    private boolean i;
    
    public q() {
        this.g = new ArrayList<g>();
        this.h = new ArrayList<i>();
        this.p(0.0f, 0.0f);
    }
    
    public q(final float n, final float n2) {
        this.g = new ArrayList<g>();
        this.h = new ArrayList<i>();
        this.p(n, n2);
    }
    
    private void b(final float n) {
        if (this.h() == n) {
            return;
        }
        final float n2 = (n - this.h() + 360.0f) % 360.0f;
        if (n2 > 180.0f) {
            return;
        }
        final d d = new d(this.j(), this.k(), this.j(), this.k());
        d.s(this.h());
        d.t(n2);
        this.h.add((i)new b(d));
        this.r(n);
    }
    
    private void c(final i i, final float n, final float n2) {
        this.b(n);
        this.h.add(i);
        this.r(n2);
    }
    
    private float h() {
        return this.e;
    }
    
    private float i() {
        return this.f;
    }
    
    private void r(final float e) {
        this.e = e;
    }
    
    private void s(final float f) {
        this.f = f;
    }
    
    private void t(final float c) {
        this.c = c;
    }
    
    private void u(final float d) {
        this.d = d;
    }
    
    private void v(final float a) {
        this.a = a;
    }
    
    private void w(final float b) {
        this.b = b;
    }
    
    public void a(final float n, final float n2, final float n3, final float n4, float n5, float n6) {
        final d d = new d(n, n2, n3, n4);
        d.s(n5);
        d.t(n6);
        this.g.add((g)d);
        final b b = new b(d);
        final float n7 = n5 + n6;
        final boolean b2 = n6 < 0.0f;
        n6 = n5;
        if (b2) {
            n6 = (n5 + 180.0f) % 360.0f;
        }
        if (b2) {
            n5 = (180.0f + n7) % 360.0f;
        }
        else {
            n5 = n7;
        }
        this.c((i)b, n6, n5);
        n5 = (n3 - n) / 2.0f;
        final double n8 = n7;
        this.t((n + n3) * 0.5f + n5 * (float)Math.cos(Math.toRadians(n8)));
        this.u((n2 + n4) * 0.5f + (n4 - n2) / 2.0f * (float)Math.sin(Math.toRadians(n8)));
    }
    
    public void d(final Matrix matrix, final Path path) {
        for (int size = this.g.size(), i = 0; i < size; ++i) {
            this.g.get(i).a(matrix, path);
        }
    }
    
    boolean e() {
        return this.i;
    }
    
    @j0
    i f(Matrix matrix) {
        this.b(this.i());
        matrix = new Matrix(matrix);
        return (i)new i() {
            final /* synthetic */ List b = new ArrayList(q.this.h);
            
            @Override
            public void a(final Matrix matrix, final com.google.android.material.shadow.b b, final int n, final Canvas canvas) {
                final Iterator<i> iterator = this.b.iterator();
                while (iterator.hasNext()) {
                    iterator.next().a(matrix, b, n, canvas);
                }
            }
        };
    }
    
    @p0(21)
    public void g(final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        this.g.add((g)new e(n, n2, n3, n4, n5, n6));
        this.i = true;
        this.t(n5);
        this.u(n6);
    }
    
    float j() {
        return this.c;
    }
    
    float k() {
        return this.d;
    }
    
    float l() {
        return this.a;
    }
    
    float m() {
        return this.b;
    }
    
    public void n(final float n, final float n2) {
        final f f = new f();
        f.b = n;
        f.c = n2;
        this.g.add((g)f);
        final c c = new c(f, this.j(), this.k());
        this.c((i)c, c.c() + 270.0f, c.c() + 270.0f);
        this.t(n);
        this.u(n2);
    }
    
    @p0(21)
    public void o(final float n, final float n2, final float n3, final float n4) {
        final h h = new h();
        h.j(n);
        h.k(n2);
        h.l(n3);
        h.m(n4);
        this.g.add((g)h);
        this.i = true;
        this.t(n3);
        this.u(n4);
    }
    
    public void p(final float n, final float n2) {
        this.q(n, n2, 270.0f, 0.0f);
    }
    
    public void q(final float n, final float n2, final float n3, final float n4) {
        this.v(n);
        this.w(n2);
        this.t(n);
        this.u(n2);
        this.r(n3);
        this.s((n3 + n4) % 360.0f);
        this.g.clear();
        this.h.clear();
        this.i = false;
    }
    
    static class b extends i
    {
        private final d b;
        
        public b(final d b) {
            this.b = b;
        }
        
        @Override
        public void a(final Matrix matrix, @j0 final com.google.android.material.shadow.b b, final int n, @j0 final Canvas canvas) {
            b.a(canvas, matrix, new RectF(this.b.k(), this.b.o(), this.b.l(), this.b.j()), n, this.b.m(), this.b.n());
        }
    }
    
    static class c extends i
    {
        private final f b;
        private final float c;
        private final float d;
        
        public c(final f b, final float c, final float d) {
            this.b = b;
            this.c = c;
            this.d = d;
        }
        
        @Override
        public void a(Matrix matrix, @j0 final com.google.android.material.shadow.b b, final int n, @j0 final Canvas canvas) {
            final RectF rectF = new RectF(0.0f, 0.0f, (float)Math.hypot(this.b.c - this.d, this.b.b - this.c), 0.0f);
            matrix = new Matrix(matrix);
            matrix.preTranslate(this.c, this.d);
            matrix.preRotate(this.c());
            b.b(canvas, matrix, rectF, n);
        }
        
        float c() {
            return (float)Math.toDegrees(Math.atan((this.b.c - this.d) / (this.b.b - this.c)));
        }
    }
    
    public static class d extends g
    {
        private static final RectF h;
        @Deprecated
        public float b;
        @Deprecated
        public float c;
        @Deprecated
        public float d;
        @Deprecated
        public float e;
        @Deprecated
        public float f;
        @Deprecated
        public float g;
        
        static {
            h = new RectF();
        }
        
        public d(final float n, final float n2, final float n3, final float n4) {
            this.q(n);
            this.u(n2);
            this.r(n3);
            this.p(n4);
        }
        
        private float j() {
            return this.e;
        }
        
        private float k() {
            return this.b;
        }
        
        private float l() {
            return this.d;
        }
        
        private float m() {
            return this.f;
        }
        
        private float n() {
            return this.g;
        }
        
        private float o() {
            return this.c;
        }
        
        private void p(final float e) {
            this.e = e;
        }
        
        private void q(final float b) {
            this.b = b;
        }
        
        private void r(final float d) {
            this.d = d;
        }
        
        private void s(final float f) {
            this.f = f;
        }
        
        private void t(final float g) {
            this.g = g;
        }
        
        private void u(final float c) {
            this.c = c;
        }
        
        @Override
        public void a(@j0 final Matrix matrix, @j0 final Path path) {
            final Matrix a = super.a;
            matrix.invert(a);
            path.transform(a);
            final RectF h = q.d.h;
            h.set(this.k(), this.o(), this.l(), this.j());
            path.arcTo(h, this.m(), this.n(), false);
            path.transform(matrix);
        }
    }
    
    public static class e extends g
    {
        private float b;
        private float c;
        private float d;
        private float e;
        private float f;
        private float g;
        
        public e(final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
            this.h(n);
            this.j(n2);
            this.i(n3);
            this.k(n4);
            this.l(n5);
            this.m(n6);
        }
        
        private float b() {
            return this.b;
        }
        
        private float c() {
            return this.d;
        }
        
        private float d() {
            return this.c;
        }
        
        private float e() {
            return this.c;
        }
        
        private float f() {
            return this.f;
        }
        
        private float g() {
            return this.g;
        }
        
        private void h(final float b) {
            this.b = b;
        }
        
        private void i(final float d) {
            this.d = d;
        }
        
        private void j(final float c) {
            this.c = c;
        }
        
        private void k(final float e) {
            this.e = e;
        }
        
        private void l(final float f) {
            this.f = f;
        }
        
        private void m(final float g) {
            this.g = g;
        }
        
        @Override
        public void a(@j0 final Matrix matrix, @j0 final Path path) {
            final Matrix a = super.a;
            matrix.invert(a);
            path.transform(a);
            path.cubicTo(this.b, this.c, this.d, this.e, this.f, this.g);
            path.transform(matrix);
        }
    }
    
    public static class f extends g
    {
        private float b;
        private float c;
        
        @Override
        public void a(@j0 final Matrix matrix, @j0 final Path path) {
            final Matrix a = super.a;
            matrix.invert(a);
            path.transform(a);
            path.lineTo(this.b, this.c);
            path.transform(matrix);
        }
    }
    
    public abstract static class g
    {
        protected final Matrix a;
        
        public g() {
            this.a = new Matrix();
        }
        
        public abstract void a(final Matrix p0, final Path p1);
    }
    
    public static class h extends g
    {
        @Deprecated
        public float b;
        @Deprecated
        public float c;
        @Deprecated
        public float d;
        @Deprecated
        public float e;
        
        private float f() {
            return this.b;
        }
        
        private float g() {
            return this.c;
        }
        
        private float h() {
            return this.d;
        }
        
        private float i() {
            return this.e;
        }
        
        private void j(final float b) {
            this.b = b;
        }
        
        private void k(final float c) {
            this.c = c;
        }
        
        private void l(final float d) {
            this.d = d;
        }
        
        private void m(final float e) {
            this.e = e;
        }
        
        @Override
        public void a(@j0 final Matrix matrix, @j0 final Path path) {
            final Matrix a = super.a;
            matrix.invert(a);
            path.transform(a);
            path.quadTo(this.f(), this.g(), this.h(), this.i());
            path.transform(matrix);
        }
    }
    
    abstract static class i
    {
        static final Matrix a;
        
        static {
            a = new Matrix();
        }
        
        public abstract void a(final Matrix p0, final com.google.android.material.shadow.b p1, final int p2, final Canvas p3);
        
        public final void b(final com.google.android.material.shadow.b b, final int n, final Canvas canvas) {
            this.a(i.a, b, n, canvas);
        }
    }
}
