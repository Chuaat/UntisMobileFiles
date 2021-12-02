// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.dagger.internal.p;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.r;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.n;
import b2.b;
import com.google.android.datatransport.runtime.scheduling.i;
import com.google.android.datatransport.runtime.scheduling.persistence.d0;
import com.google.android.datatransport.runtime.scheduling.persistence.h;
import com.google.android.datatransport.runtime.scheduling.persistence.j0;
import com.google.android.datatransport.runtime.time.a;
import com.google.android.datatransport.runtime.dagger.internal.j;
import com.google.android.datatransport.runtime.dagger.internal.f;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.q;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.m;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.s;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.g;
import com.google.android.datatransport.runtime.scheduling.persistence.c0;
import android.content.Context;
import java.util.concurrent.Executor;
import e6.c;

final class e extends u
{
    private c<Executor> G;
    private c<Context> H;
    private c I;
    private c J;
    private c K;
    private c<c0> L;
    private c<g> M;
    private c<s> N;
    private c<com.google.android.datatransport.runtime.scheduling.c> O;
    private c<m> P;
    private c<q> Q;
    private c<t> R;
    
    private e(final Context context) {
        this.d(context);
    }
    
    public static a c() {
        return new b();
    }
    
    private void d(final Context context) {
        this.G = f.b(k.a());
        final com.google.android.datatransport.runtime.dagger.internal.g<Context> a = j.a(context);
        this.H = (c<Context>)a;
        final com.google.android.datatransport.runtime.backends.k a2 = com.google.android.datatransport.runtime.backends.k.a((c<Context>)a, (c<com.google.android.datatransport.runtime.time.a>)com.google.android.datatransport.runtime.time.e.a(), (c<com.google.android.datatransport.runtime.time.a>)com.google.android.datatransport.runtime.time.f.a());
        this.I = (c)a2;
        this.J = f.b(com.google.android.datatransport.runtime.backends.m.a(this.H, (c<com.google.android.datatransport.runtime.backends.j>)a2));
        this.K = (c)j0.a(this.H, (c<String>)com.google.android.datatransport.runtime.scheduling.persistence.f.a(), (c<Integer>)com.google.android.datatransport.runtime.scheduling.persistence.g.a());
        this.L = f.b(d0.a((c<com.google.android.datatransport.runtime.time.a>)com.google.android.datatransport.runtime.time.e.a(), (c<com.google.android.datatransport.runtime.time.a>)com.google.android.datatransport.runtime.time.f.a(), (c<d>)h.a(), (c<i0>)this.K));
        final com.google.android.datatransport.runtime.scheduling.g b = com.google.android.datatransport.runtime.scheduling.g.b((c<com.google.android.datatransport.runtime.time.a>)com.google.android.datatransport.runtime.time.e.a());
        this.M = (c<g>)b;
        final i a3 = i.a(this.H, (c<com.google.android.datatransport.runtime.scheduling.persistence.c>)this.L, (c<g>)b, (c<com.google.android.datatransport.runtime.time.a>)com.google.android.datatransport.runtime.time.f.a());
        this.N = (c<s>)a3;
        final c<Executor> g = this.G;
        final c j = this.J;
        final c<c0> l = this.L;
        this.O = (c<com.google.android.datatransport.runtime.scheduling.c>)com.google.android.datatransport.runtime.scheduling.d.a(g, (c<com.google.android.datatransport.runtime.backends.e>)j, (c<s>)a3, (c<com.google.android.datatransport.runtime.scheduling.persistence.c>)l, (c<b2.b>)l);
        final c<Context> h = this.H;
        final c i = this.J;
        final c<c0> k = this.L;
        this.P = (c<m>)n.a(h, (c<com.google.android.datatransport.runtime.backends.e>)i, (c<com.google.android.datatransport.runtime.scheduling.persistence.c>)k, this.N, this.G, (c<b2.b>)k, (c<com.google.android.datatransport.runtime.time.a>)com.google.android.datatransport.runtime.time.e.a());
        final c<Executor> g2 = this.G;
        final c<c0> m = this.L;
        this.Q = (c<q>)r.a(g2, (c<com.google.android.datatransport.runtime.scheduling.persistence.c>)m, this.N, (c<b2.b>)m);
        this.R = f.b(v.a((c<com.google.android.datatransport.runtime.time.a>)com.google.android.datatransport.runtime.time.e.a(), (c<com.google.android.datatransport.runtime.time.a>)com.google.android.datatransport.runtime.time.f.a(), (c<com.google.android.datatransport.runtime.scheduling.e>)this.O, this.P, this.Q));
    }
    
    @Override
    com.google.android.datatransport.runtime.scheduling.persistence.c a() {
        return (com.google.android.datatransport.runtime.scheduling.persistence.c)this.L.get();
    }
    
    @Override
    t b() {
        return (t)this.R.get();
    }
    
    private static final class b implements a
    {
        private Context a;
        
        public b b(final Context context) {
            this.a = p.b(context);
            return this;
        }
        
        @Override
        public u h() {
            p.a(this.a, Context.class);
            return new e(this.a, null);
        }
    }
}
