// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.util.d;
import com.google.android.gms.common.internal.x;
import androidx.annotation.RecentlyNullable;
import android.os.RemoteException;
import com.google.android.gms.tasks.n;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.k0;
import com.google.android.gms.common.e;
import com.google.android.gms.common.api.a;

@f2.a
public abstract class a0<A extends com.google.android.gms.common.api.a.b, ResultT>
{
    @k0
    private final e[] a;
    private final boolean b;
    private final int c;
    
    @Deprecated
    @f2.a
    public a0() {
        this.a = null;
        this.b = false;
        this.c = 0;
    }
    
    @f2.a
    private a0(final e[] a, final boolean b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @RecentlyNonNull
    @f2.a
    public static <A extends com.google.android.gms.common.api.a.b, ResultT> a<A, ResultT> a() {
        return new a<A, ResultT>(null);
    }
    
    @f2.a
    protected abstract void b(@RecentlyNonNull final A p0, @RecentlyNonNull final n<ResultT> p1) throws RemoteException;
    
    @RecentlyNonNull
    @f2.a
    public boolean c() {
        return this.b;
    }
    
    @RecentlyNullable
    public final e[] d() {
        return this.a;
    }
    
    @f2.a
    public static class a<A extends com.google.android.gms.common.api.a.b, ResultT>
    {
        private v<A, n<ResultT>> a;
        private boolean b;
        private e[] c;
        private int d;
        
        private a() {
            this.b = true;
            this.d = 0;
        }
        
        @RecentlyNonNull
        @f2.a
        public a0<A, ResultT> a() {
            x.b(this.a != null, "execute parameter required");
            return (a0<A, ResultT>)new m2(this, this.c, this.b, this.d);
        }
        
        @Deprecated
        @RecentlyNonNull
        @f2.a
        public a<A, ResultT> b(@RecentlyNonNull final d<A, n<ResultT>> d) {
            this.a = (v<A, n<ResultT>>)new n2(d);
            return this;
        }
        
        @RecentlyNonNull
        @f2.a
        public a<A, ResultT> c(@RecentlyNonNull final v<A, n<ResultT>> a) {
            this.a = a;
            return this;
        }
        
        @RecentlyNonNull
        @f2.a
        public a<A, ResultT> d(@RecentlyNonNull final boolean b) {
            this.b = b;
            return this;
        }
        
        @RecentlyNonNull
        @f2.a
        public a<A, ResultT> e(@RecentlyNonNull final e... c) {
            this.c = c;
            return this;
        }
        
        @RecentlyNonNull
        @f2.a
        public a<A, ResultT> f(@RecentlyNonNull final int d) {
            x.a(d != 0);
            this.d = d;
            return this;
        }
    }
}
