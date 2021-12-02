// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide;

import com.bumptech.glide.request.target.r;
import android.widget.ImageView;
import androidx.annotation.s;
import androidx.annotation.o0;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;
import android.net.Uri;
import java.util.ArrayList;
import com.bumptech.glide.request.f;
import com.bumptech.glide.request.c;
import java.net.URL;
import java.util.Iterator;
import java.util.concurrent.Executor;
import com.bumptech.glide.request.e;
import com.bumptech.glide.request.target.p;
import android.annotation.SuppressLint;
import com.bumptech.glide.load.engine.j;
import java.util.List;
import androidx.annotation.k0;
import androidx.annotation.j0;
import android.content.Context;
import com.bumptech.glide.request.h;
import com.bumptech.glide.request.a;

public class k<TranscodeType> extends a<k<TranscodeType>> implements Cloneable, g<k<TranscodeType>>
{
    protected static final h P0;
    private final Context B0;
    private final l C0;
    private final Class<TranscodeType> D0;
    private final b E0;
    private final d F0;
    @j0
    private m<?, ? super TranscodeType> G0;
    @k0
    private Object H0;
    @k0
    private List<com.bumptech.glide.request.g<TranscodeType>> I0;
    @k0
    private k<TranscodeType> J0;
    @k0
    private k<TranscodeType> K0;
    @k0
    private Float L0;
    private boolean M0;
    private boolean N0;
    private boolean O0;
    
    static {
        P0 = new h().w(j.c).G0(com.bumptech.glide.h.J).O0(true);
    }
    
    @SuppressLint({ "CheckResult" })
    protected k(@j0 final b e0, final l c0, final Class<TranscodeType> d0, final Context b0) {
        this.M0 = true;
        this.E0 = e0;
        this.C0 = c0;
        this.D0 = d0;
        this.B0 = b0;
        this.G0 = c0.G(d0);
        this.F0 = e0.j();
        this.m1(c0.E());
        this.b1(c0.F());
    }
    
    @SuppressLint({ "CheckResult" })
    protected k(final Class<TranscodeType> clazz, final k<?> k) {
        this(k.E0, k.C0, clazz, k.B0);
        this.H0 = k.H0;
        this.N0 = k.N0;
        this.b1(k);
    }
    
    @j0
    private k<TranscodeType> E1(@k0 final Object h0) {
        this.H0 = h0;
        this.N0 = true;
        return this;
    }
    
    private com.bumptech.glide.request.d F1(final Object o, final p<TranscodeType> p10, final com.bumptech.glide.request.g<TranscodeType> g, final a<?> a, final e e, final m<?, ? super TranscodeType> m, final com.bumptech.glide.h h, final int n, final int n2, final Executor executor) {
        final Context b0 = this.B0;
        final d f0 = this.F0;
        return com.bumptech.glide.request.j.x(b0, f0, o, this.H0, this.D0, a, n, n2, h, p10, g, this.I0, e, f0.f(), m.c(), executor);
    }
    
    private com.bumptech.glide.request.d c1(final p<TranscodeType> p4, @k0 final com.bumptech.glide.request.g<TranscodeType> g, final a<?> a, final Executor executor) {
        return this.d1(new Object(), p4, g, null, this.G0, a.X(), a.U(), a.T(), a, executor);
    }
    
    private com.bumptech.glide.request.d d1(final Object o, final p<TranscodeType> p10, @k0 final com.bumptech.glide.request.g<TranscodeType> g, @k0 final e e, final m<?, ? super TranscodeType> m, final com.bumptech.glide.h h, final int n, final int n2, final a<?> a, final Executor executor) {
        com.bumptech.glide.request.b b;
        e e2;
        if (this.K0 != null) {
            e2 = (b = new com.bumptech.glide.request.b(o, e));
        }
        else {
            final com.bumptech.glide.request.b b2 = null;
            e2 = e;
            b = b2;
        }
        final com.bumptech.glide.request.d e3 = this.e1(o, p10, g, e2, m, h, n, n2, a, executor);
        if (b == null) {
            return e3;
        }
        final int u = this.K0.U();
        final int t = this.K0.T();
        int u2 = u;
        int t2 = t;
        if (com.bumptech.glide.util.m.v(n, n2)) {
            u2 = u;
            t2 = t;
            if (!this.K0.r0()) {
                u2 = a.U();
                t2 = a.T();
            }
        }
        final k<TranscodeType> k0 = this.K0;
        b.p(e3, k0.d1(o, p10, g, b, k0.G0, k0.X(), u2, t2, this.K0, executor));
        return b;
    }
    
    private com.bumptech.glide.request.d e1(final Object o, final p<TranscodeType> p10, final com.bumptech.glide.request.g<TranscodeType> g, @k0 final e e, final m<?, ? super TranscodeType> m, final com.bumptech.glide.h h, final int n, final int n2, final a<?> a, final Executor executor) {
        final k<TranscodeType> j0 = this.J0;
        if (j0 != null) {
            if (!this.O0) {
                m<?, ? super TranscodeType> g2 = j0.G0;
                if (j0.M0) {
                    g2 = m;
                }
                com.bumptech.glide.h h2;
                if (j0.j0()) {
                    h2 = this.J0.X();
                }
                else {
                    h2 = this.l1(h);
                }
                final int u = this.J0.U();
                final int t = this.J0.T();
                int u2 = u;
                int t2 = t;
                if (com.bumptech.glide.util.m.v(n, n2)) {
                    u2 = u;
                    t2 = t;
                    if (!this.J0.r0()) {
                        u2 = a.U();
                        t2 = a.T();
                    }
                }
                final com.bumptech.glide.request.k k = new com.bumptech.glide.request.k(o, e);
                final com.bumptech.glide.request.d f1 = this.F1(o, p10, g, a, k, m, h, n, n2, executor);
                this.O0 = true;
                final k<TranscodeType> j2 = this.J0;
                final com.bumptech.glide.request.d d1 = j2.d1(o, (p<?>)p10, (com.bumptech.glide.request.g<?>)g, (e)k, (m<?, ?>)g2, h2, u2, t2, (a<?>)j2, executor);
                this.O0 = false;
                k.o(f1, d1);
                return k;
            }
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        else {
            if (this.L0 != null) {
                final com.bumptech.glide.request.k i = new com.bumptech.glide.request.k(o, e);
                i.o(this.F1(o, p10, g, a, i, m, h, n, n2, executor), this.F1(o, p10, g, ((a<a<?>>)a.t()).N0((float)this.L0), i, m, this.l1(h), n, n2, executor));
                return i;
            }
            return this.F1(o, p10, g, a, e, m, h, n, n2, executor);
        }
    }
    
    @j0
    private com.bumptech.glide.h l1(@j0 final com.bumptech.glide.h h) {
        final int n = k$a.b[h.ordinal()];
        if (n == 1) {
            return h.I;
        }
        if (n == 2) {
            return h.H;
        }
        if (n != 3 && n != 4) {
            final StringBuilder sb = new StringBuilder();
            sb.append("unknown priority: ");
            sb.append(this.X());
            throw new IllegalArgumentException(sb.toString());
        }
        return h.G;
    }
    
    @SuppressLint({ "CheckResult" })
    private void m1(final List<com.bumptech.glide.request.g<Object>> list) {
        final Iterator<com.bumptech.glide.request.g<Object>> iterator = list.iterator();
        while (iterator.hasNext()) {
            this.a1(iterator.next());
        }
    }
    
    private <Y extends p<TranscodeType>> Y p1(@j0 final Y y, @k0 final com.bumptech.glide.request.g<TranscodeType> g, final a<?> a, final Executor executor) {
        com.bumptech.glide.util.k.d(y);
        if (!this.N0) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        final com.bumptech.glide.request.d c1 = this.c1(y, g, a, executor);
        final com.bumptech.glide.request.d o = y.o();
        if (c1.e(o) && !this.t1(a, o)) {
            if (!com.bumptech.glide.util.k.d(o).isRunning()) {
                o.i();
            }
            return y;
        }
        this.C0.B(y);
        y.e(c1);
        this.C0.a0(y, c1);
        return y;
    }
    
    private boolean t1(final a<?> a, final com.bumptech.glide.request.d d) {
        return !a.i0() && d.d();
    }
    
    @j0
    @androidx.annotation.j
    public k<TranscodeType> A1(@k0 final Object o) {
        return this.E1(o);
    }
    
    @j0
    @androidx.annotation.j
    public k<TranscodeType> B1(@k0 final String s) {
        return this.E1(s);
    }
    
    @Deprecated
    @androidx.annotation.j
    public k<TranscodeType> C1(@k0 final URL url) {
        return this.E1(url);
    }
    
    @j0
    @androidx.annotation.j
    public k<TranscodeType> D1(@k0 final byte[] array) {
        k i;
        final k<TranscodeType> k = (k<TranscodeType>)(i = this.E1(array));
        if (!k.g0()) {
            i = k.b1(h.f1(j.b));
        }
        k b1 = i;
        if (!i.n0()) {
            b1 = i.b1(h.A1(true));
        }
        return (k<TranscodeType>)b1;
    }
    
    @j0
    public p<TranscodeType> G1() {
        return this.H1(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
    
    @j0
    public p<TranscodeType> H1(final int n, final int n2) {
        return this.o1((p<TranscodeType>)com.bumptech.glide.request.target.m.g(this.C0, n, n2));
    }
    
    @j0
    public c<TranscodeType> I1() {
        return this.J1(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
    
    @j0
    public c<TranscodeType> J1(final int n, final int n2) {
        final f<TranscodeType> f = new f<TranscodeType>(n, n2);
        return this.r1(f, f, com.bumptech.glide.util.e.a());
    }
    
    @j0
    @androidx.annotation.j
    public k<TranscodeType> K1(final float f) {
        if (f >= 0.0f && f <= 1.0f) {
            this.L0 = f;
            return this;
        }
        throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
    }
    
    @j0
    @androidx.annotation.j
    public k<TranscodeType> L1(@k0 final k<TranscodeType> j0) {
        this.J0 = j0;
        return this;
    }
    
    @j0
    @androidx.annotation.j
    public k<TranscodeType> M1(@k0 final k<TranscodeType>... array) {
        k<TranscodeType> l1 = null;
        if (array != null && array.length != 0) {
            for (int i = array.length - 1; i >= 0; --i) {
                final k<TranscodeType> k = array[i];
                if (k != null) {
                    if (l1 == null) {
                        l1 = k;
                    }
                    else {
                        l1 = (k<TranscodeType>)k.L1(l1);
                    }
                }
            }
            return this.L1(l1);
        }
        return this.L1(null);
    }
    
    @j0
    @androidx.annotation.j
    public k<TranscodeType> N1(@j0 final m<?, ? super TranscodeType> m) {
        this.G0 = com.bumptech.glide.util.k.d(m);
        this.M0 = false;
        return this;
    }
    
    @j0
    @androidx.annotation.j
    public k<TranscodeType> a1(@k0 final com.bumptech.glide.request.g<TranscodeType> g) {
        if (g != null) {
            if (this.I0 == null) {
                this.I0 = new ArrayList<com.bumptech.glide.request.g<TranscodeType>>();
            }
            this.I0.add(g);
        }
        return this;
    }
    
    @j0
    @androidx.annotation.j
    public k<TranscodeType> b1(@j0 final a<?> a) {
        com.bumptech.glide.util.k.d(a);
        return super.a(a);
    }
    
    @androidx.annotation.j
    public k<TranscodeType> f1() {
        final k k = super.t();
        k.G0 = (m<?, ? super TranscodeType>)k.G0.a();
        return (k<TranscodeType>)k;
    }
    
    @Deprecated
    @androidx.annotation.j
    public c<File> h1(final int n, final int n2) {
        return this.k1().J1(n, n2);
    }
    
    @Deprecated
    @androidx.annotation.j
    public <Y extends p<File>> Y i1(@j0 final Y y) {
        return (Y)this.k1().o1((p)y);
    }
    
    @j0
    public k<TranscodeType> j1(@k0 final k<TranscodeType> k0) {
        this.K0 = k0;
        return this;
    }
    
    @j0
    @androidx.annotation.j
    protected k<File> k1() {
        return new k<File>(File.class, this).b1(k.P0);
    }
    
    @Deprecated
    public c<TranscodeType> n1(final int n, final int n2) {
        return this.J1(n, n2);
    }
    
    @j0
    public <Y extends p<TranscodeType>> Y o1(@j0 final Y y) {
        return this.r1(y, null, com.bumptech.glide.util.e.b());
    }
    
    @j0
     <Y extends p<TranscodeType>> Y r1(@j0 final Y y, @k0 final com.bumptech.glide.request.g<TranscodeType> g, final Executor executor) {
        return this.p1(y, g, this, executor);
    }
    
    @j0
    public r<ImageView, TranscodeType> s1(@j0 final ImageView imageView) {
        com.bumptech.glide.util.m.b();
        com.bumptech.glide.util.k.d(imageView);
        if (!this.q0() && this.o0() && imageView.getScaleType() != null) {
            switch (k$a.a[imageView.getScaleType().ordinal()]) {
                case 3:
                case 4:
                case 5: {
                    final a<TranscodeType> a = this.t().x0();
                    return this.p1(this.F0.a(imageView, this.D0), null, a, com.bumptech.glide.util.e.b());
                }
                case 2:
                case 6: {
                    final a<TranscodeType> a = this.t().v0();
                    return this.p1(this.F0.a(imageView, this.D0), null, a, com.bumptech.glide.util.e.b());
                }
                case 1: {
                    final a<TranscodeType> a = this.t().u0();
                    return this.p1(this.F0.a(imageView, this.D0), null, a, com.bumptech.glide.util.e.b());
                }
            }
        }
        final a<TranscodeType> a = (a<TranscodeType>)this;
        return this.p1(this.F0.a(imageView, this.D0), null, a, com.bumptech.glide.util.e.b());
    }
    
    @j0
    @androidx.annotation.j
    public k<TranscodeType> u1(@k0 final com.bumptech.glide.request.g<TranscodeType> g) {
        this.I0 = null;
        return this.a1(g);
    }
    
    @j0
    @androidx.annotation.j
    public k<TranscodeType> v1(@k0 final Bitmap bitmap) {
        return this.E1(bitmap).b1(h.f1(j.b));
    }
    
    @j0
    @androidx.annotation.j
    public k<TranscodeType> w1(@k0 final Drawable drawable) {
        return this.E1(drawable).b1(h.f1(j.b));
    }
    
    @j0
    @androidx.annotation.j
    public k<TranscodeType> x1(@k0 final Uri uri) {
        return this.E1(uri);
    }
    
    @j0
    @androidx.annotation.j
    public k<TranscodeType> y1(@k0 final File file) {
        return this.E1(file);
    }
    
    @j0
    @androidx.annotation.j
    public k<TranscodeType> z1(@k0 @o0 @s final Integer n) {
        return this.E1(n).b1(h.y1(com.bumptech.glide.signature.a.c(this.B0)));
    }
}
