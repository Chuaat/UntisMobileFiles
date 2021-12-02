// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.util.d;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.common.e;
import com.google.android.gms.tasks.n;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.a;

@f2.a
public class u<A extends com.google.android.gms.common.api.a.b, L>
{
    @RecentlyNonNull
    public final t<A, L> a;
    @RecentlyNonNull
    public final c0<A, L> b;
    @RecentlyNonNull
    public final Runnable c;
    
    private u(final t<A, L> a, final c0<A, L> b, final Runnable c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @RecentlyNonNull
    @f2.a
    public static <A extends com.google.android.gms.common.api.a.b, L> a<A, L> a() {
        return new a<A, L>(null);
    }
    
    @f2.a
    public static class a<A extends com.google.android.gms.common.api.a.b, L>
    {
        private v<A, n<Void>> a;
        private v<A, n<Boolean>> b;
        private Runnable c;
        private com.google.android.gms.common.api.internal.n<L> d;
        private e[] e;
        private boolean f;
        
        private a() {
            this.c = a2.G;
            this.f = true;
        }
        
        @RecentlyNonNull
        @f2.a
        public u<A, L> a() {
            final v<A, n<Void>> a = this.a;
            final boolean b = true;
            x.b(a != null, "Must set register function");
            x.b(this.b != null, "Must set unregister function");
            x.b(this.d != null && b, "Must set holder");
            return new u<A, L>(new b2(this, this.d, this.e, this.f), new d2(this, (com.google.android.gms.common.api.internal.n.a)x.l(this.d.b(), "Key must not be null")), this.c, null);
        }
        
        @RecentlyNonNull
        @f2.a
        public a<A, L> b(@RecentlyNonNull final Runnable c) {
            this.c = c;
            return this;
        }
        
        @RecentlyNonNull
        @f2.a
        public a<A, L> c(@RecentlyNonNull final v<A, n<Void>> a) {
            this.a = a;
            return this;
        }
        
        @Deprecated
        @RecentlyNonNull
        @f2.a
        public a<A, L> d(@RecentlyNonNull final d<A, n<Void>> d) {
            this.a = (v<A, n<Void>>)new z1(d);
            return this;
        }
        
        @RecentlyNonNull
        @f2.a
        public a<A, L> e(@RecentlyNonNull final boolean f) {
            this.f = f;
            return this;
        }
        
        @RecentlyNonNull
        @f2.a
        public a<A, L> f(@RecentlyNonNull final e... e) {
            this.e = e;
            return this;
        }
        
        @RecentlyNonNull
        @f2.a
        public a<A, L> g(@RecentlyNonNull final v<A, n<Boolean>> b) {
            this.b = b;
            return this;
        }
        
        @Deprecated
        @RecentlyNonNull
        @f2.a
        public a<A, L> h(@RecentlyNonNull final d<A, n<Boolean>> d) {
            this.a = (v<A, n<Void>>)new c2(this);
            return this;
        }
        
        @RecentlyNonNull
        @f2.a
        public a<A, L> i(@RecentlyNonNull final com.google.android.gms.common.api.internal.n<L> d) {
            this.d = d;
            return this;
        }
    }
}
