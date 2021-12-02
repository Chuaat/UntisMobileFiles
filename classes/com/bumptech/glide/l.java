// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide;

import com.bumptech.glide.request.target.f;
import android.content.res.Configuration;
import java.util.Iterator;
import java.net.URL;
import androidx.annotation.s;
import androidx.annotation.o0;
import android.net.Uri;
import java.util.List;
import java.io.File;
import androidx.annotation.k0;
import android.view.View;
import com.bumptech.glide.request.a;
import com.bumptech.glide.request.target.p;
import java.util.Collection;
import android.os.Looper;
import com.bumptech.glide.manager.d;
import androidx.annotation.j0;
import com.bumptech.glide.load.engine.j;
import android.graphics.Bitmap;
import java.util.concurrent.CopyOnWriteArrayList;
import com.bumptech.glide.manager.c;
import android.os.Handler;
import com.bumptech.glide.manager.o;
import com.bumptech.glide.manager.m;
import androidx.annotation.w;
import com.bumptech.glide.manager.n;
import android.content.Context;
import com.bumptech.glide.request.h;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.manager.i;
import android.content.ComponentCallbacks2;

public class l implements ComponentCallbacks2, i, g<k<Drawable>>
{
    private static final h S;
    private static final h T;
    private static final h U;
    protected final com.bumptech.glide.b G;
    protected final Context H;
    final com.bumptech.glide.manager.h I;
    @w("this")
    private final n J;
    @w("this")
    private final m K;
    @w("this")
    private final o L;
    private final Runnable M;
    private final Handler N;
    private final com.bumptech.glide.manager.c O;
    private final CopyOnWriteArrayList<com.bumptech.glide.request.g<Object>> P;
    @w("this")
    private h Q;
    private boolean R;
    
    static {
        S = h.e1(Bitmap.class).s0();
        T = h.e1(com.bumptech.glide.load.resource.gif.c.class).s0();
        U = h.f1(j.c).G0(com.bumptech.glide.h.J).O0(true);
    }
    
    public l(@j0 final com.bumptech.glide.b b, @j0 final com.bumptech.glide.manager.h h, @j0 final m m, @j0 final Context context) {
        this(b, h, m, new n(), b.h(), context);
    }
    
    l(final com.bumptech.glide.b g, final com.bumptech.glide.manager.h i, final m k, final n j, final d d, final Context h) {
        this.L = new o();
        final Runnable m = new Runnable() {
            @Override
            public void run() {
                final l g = l.this;
                g.I.a(g);
            }
        };
        this.M = m;
        final Handler n = new Handler(Looper.getMainLooper());
        this.N = n;
        this.G = g;
        this.I = i;
        this.K = k;
        this.J = j;
        this.H = h;
        final com.bumptech.glide.manager.c a = d.a(h.getApplicationContext(), new c(j));
        this.O = a;
        if (com.bumptech.glide.util.m.s()) {
            n.post((Runnable)m);
        }
        else {
            i.a(this);
        }
        i.a(a);
        this.P = new CopyOnWriteArrayList<com.bumptech.glide.request.g<Object>>(g.j().c());
        this.Z(g.j().d());
        g.u(this);
    }
    
    private void c0(@j0 final p<?> p) {
        final boolean b0 = this.b0(p);
        final com.bumptech.glide.request.d o = p.o();
        if (!b0 && !this.G.v(p) && o != null) {
            p.e(null);
            o.clear();
        }
    }
    
    private void d0(@j0 final h h) {
        synchronized (this) {
            this.Q = this.Q.a(h);
        }
    }
    
    public void A(@j0 final View view) {
        this.B(new b(view));
    }
    
    public void B(@k0 final p<?> p) {
        if (p == null) {
            return;
        }
        this.c0(p);
    }
    
    @j0
    @androidx.annotation.j
    public k<File> C(@k0 final Object o) {
        return this.D().A1(o);
    }
    
    @j0
    @androidx.annotation.j
    public k<File> D() {
        return this.v(File.class).b1(l.U);
    }
    
    List<com.bumptech.glide.request.g<Object>> E() {
        return this.P;
    }
    
    h F() {
        synchronized (this) {
            return this.Q;
        }
    }
    
    @j0
     <T> com.bumptech.glide.m<?, T> G(final Class<T> clazz) {
        return this.G.j().e(clazz);
    }
    
    public boolean H() {
        synchronized (this) {
            return this.J.d();
        }
    }
    
    @j0
    @androidx.annotation.j
    public k<Drawable> I(@k0 final Bitmap bitmap) {
        return this.x().v1(bitmap);
    }
    
    @j0
    @androidx.annotation.j
    public k<Drawable> J(@k0 final Drawable drawable) {
        return this.x().w1(drawable);
    }
    
    @j0
    @androidx.annotation.j
    public k<Drawable> K(@k0 final Uri uri) {
        return this.x().x1(uri);
    }
    
    @j0
    @androidx.annotation.j
    public k<Drawable> L(@k0 final File file) {
        return this.x().y1(file);
    }
    
    @j0
    @androidx.annotation.j
    public k<Drawable> M(@k0 @o0 @s final Integer n) {
        return this.x().z1(n);
    }
    
    @j0
    @androidx.annotation.j
    public k<Drawable> N(@k0 final Object o) {
        return this.x().A1(o);
    }
    
    @j0
    @androidx.annotation.j
    public k<Drawable> O(@k0 final String s) {
        return this.x().B1(s);
    }
    
    @Deprecated
    @androidx.annotation.j
    public k<Drawable> P(@k0 final URL url) {
        return this.x().C1(url);
    }
    
    @j0
    @androidx.annotation.j
    public k<Drawable> Q(@k0 final byte[] array) {
        return this.x().D1(array);
    }
    
    public void R() {
        synchronized (this) {
            this.J.e();
        }
    }
    
    public void S() {
        synchronized (this) {
            this.R();
            final Iterator<l> iterator = this.K.a().iterator();
            while (iterator.hasNext()) {
                iterator.next().R();
            }
        }
    }
    
    public void T() {
        synchronized (this) {
            this.J.f();
        }
    }
    
    public void U() {
        synchronized (this) {
            this.T();
            final Iterator<l> iterator = this.K.a().iterator();
            while (iterator.hasNext()) {
                iterator.next().T();
            }
        }
    }
    
    public void V() {
        synchronized (this) {
            this.J.h();
        }
    }
    
    public void W() {
        synchronized (this) {
            com.bumptech.glide.util.m.b();
            this.V();
            final Iterator<l> iterator = this.K.a().iterator();
            while (iterator.hasNext()) {
                iterator.next().V();
            }
        }
    }
    
    @j0
    public l X(@j0 final h h) {
        synchronized (this) {
            this.Z(h);
            return this;
        }
    }
    
    public void Y(final boolean r) {
        this.R = r;
    }
    
    protected void Z(@j0 final h h) {
        synchronized (this) {
            this.Q = h.t().b();
        }
    }
    
    public void a() {
        synchronized (this) {
            this.T();
            this.L.a();
        }
    }
    
    void a0(@j0 final p<?> p2, @j0 final com.bumptech.glide.request.d d) {
        synchronized (this) {
            this.L.i(p2);
            this.J.i(d);
        }
    }
    
    boolean b0(@j0 final p<?> p) {
        synchronized (this) {
            final com.bumptech.glide.request.d o = p.o();
            if (o == null) {
                return true;
            }
            if (this.J.b(o)) {
                this.L.j(p);
                p.e(null);
                return true;
            }
            return false;
        }
    }
    
    public void f() {
        synchronized (this) {
            this.V();
            this.L.f();
        }
    }
    
    public void onConfigurationChanged(final Configuration configuration) {
    }
    
    public void onDestroy() {
        synchronized (this) {
            this.L.onDestroy();
            final Iterator<p<?>> iterator = this.L.g().iterator();
            while (iterator.hasNext()) {
                this.B(iterator.next());
            }
            this.L.d();
            this.J.c();
            this.I.b(this);
            this.I.b(this.O);
            this.N.removeCallbacks(this.M);
            this.G.A(this);
        }
    }
    
    public void onLowMemory() {
    }
    
    public void onTrimMemory(final int n) {
        if (n == 60 && this.R) {
            this.S();
        }
    }
    
    public l t(final com.bumptech.glide.request.g<Object> e) {
        this.P.add(e);
        return this;
    }
    
    @Override
    public String toString() {
        synchronized (this) {
            final StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append("{tracker=");
            sb.append(this.J);
            sb.append(", treeNode=");
            sb.append(this.K);
            sb.append("}");
            return sb.toString();
        }
    }
    
    @j0
    public l u(@j0 final h h) {
        synchronized (this) {
            this.d0(h);
            return this;
        }
    }
    
    @j0
    @androidx.annotation.j
    public <ResourceType> k<ResourceType> v(@j0 final Class<ResourceType> clazz) {
        return new k<ResourceType>(this.G, this, clazz, this.H);
    }
    
    @j0
    @androidx.annotation.j
    public k<Bitmap> w() {
        return this.v(Bitmap.class).b1(l.S);
    }
    
    @j0
    @androidx.annotation.j
    public k<Drawable> x() {
        return this.v(Drawable.class);
    }
    
    @j0
    @androidx.annotation.j
    public k<File> y() {
        return this.v(File.class).b1(h.A1(true));
    }
    
    @j0
    @androidx.annotation.j
    public k<com.bumptech.glide.load.resource.gif.c> z() {
        return this.v(com.bumptech.glide.load.resource.gif.c.class).b1(l.T);
    }
    
    private static class b extends f<View, Object>
    {
        b(@j0 final View view) {
            super(view);
        }
        
        @Override
        public void c(@j0 final Object o, @k0 final com.bumptech.glide.request.transition.f<? super Object> f) {
        }
        
        @Override
        public void h(@k0 final Drawable drawable) {
        }
        
        @Override
        protected void m(@k0 final Drawable drawable) {
        }
    }
    
    private class c implements a
    {
        @w("RequestManager.this")
        private final n a;
        
        c(final n a) {
            this.a = a;
        }
        
        @Override
        public void a(final boolean b) {
            if (b) {
                synchronized (l.this) {
                    this.a.g();
                }
            }
        }
    }
}
