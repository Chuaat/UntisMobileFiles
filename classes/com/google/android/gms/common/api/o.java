// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api;

import androidx.annotation.k0;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.internal.x;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.internal.z;
import android.os.Looper;
import f2.a;

public final class o
{
    @f2.a
    private o() {
    }
    
    @RecentlyNonNull
    public static n<Status> a() {
        final z z = new z(Looper.getMainLooper());
        z.f();
        return z;
    }
    
    @RecentlyNonNull
    public static <R extends t> n<R> b(@RecentlyNonNull final R r) {
        x.l(r, "Result must not be null");
        x.b(r.h().q1() == 16, "Status code must be CommonStatusCodes.CANCELED");
        final b b = new b(r);
        b.f();
        return (n<R>)b;
    }
    
    @RecentlyNonNull
    @f2.a
    public static <R extends t> n<R> c(@RecentlyNonNull final R r, @RecentlyNonNull final k k) {
        x.l(r, "Result must not be null");
        x.b(r.h().j3() ^ true, "Status code must not be SUCCESS");
        final a<R> a = new a<R>(k, r);
        a.o(r);
        return a;
    }
    
    @RecentlyNonNull
    @f2.a
    public static <R extends t> m<R> d(@RecentlyNonNull final R r) {
        x.l(r, "Result must not be null");
        final c<t> c = new c<t>((k)null);
        c.o(r);
        return new r<R>((n<R>)c);
    }
    
    @RecentlyNonNull
    @f2.a
    public static <R extends t> m<R> e(@RecentlyNonNull final R r, @RecentlyNonNull final k k) {
        x.l(r, "Result must not be null");
        final c<t> c = new c<t>(k);
        c.o(r);
        return new r<R>((n<R>)c);
    }
    
    @RecentlyNonNull
    @f2.a
    public static n<Status> f(@RecentlyNonNull final Status status) {
        x.l(status, "Result must not be null");
        final z z = new z(Looper.getMainLooper());
        z.o(status);
        return z;
    }
    
    @RecentlyNonNull
    @f2.a
    public static n<Status> g(@RecentlyNonNull final Status status, @RecentlyNonNull final k k) {
        x.l(status, "Result must not be null");
        final z z = new z(k);
        z.o(status);
        return z;
    }
    
    private static final class a<R extends t> extends BasePendingResult<R>
    {
        private final R q;
        
        public a(final k k, final R q) {
            super(k);
            this.q = q;
        }
        
        @Override
        protected final R k(final Status status) {
            return this.q;
        }
    }
    
    private static final class b<R extends t> extends BasePendingResult<R>
    {
        private final R q;
        
        public b(final R q) {
            super(Looper.getMainLooper());
            this.q = q;
        }
        
        @Override
        protected final R k(final Status status) {
            if (status.q1() == this.q.h().q1()) {
                return this.q;
            }
            throw new UnsupportedOperationException("Creating failed results is not supported");
        }
    }
    
    private static final class c<R extends t> extends BasePendingResult<R>
    {
        public c(@k0 final k k) {
            super(k);
        }
        
        @Override
        protected final R k(final Status status) {
            throw new UnsupportedOperationException("Creating failed results is not supported");
        }
    }
}
