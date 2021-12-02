// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.m;
import com.google.android.gms.common.api.s;
import com.google.android.gms.common.api.t;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.n;
import f2.a;

@f2.a
public class w
{
    private static final b a;
    
    static {
        a = (b)new r0();
    }
    
    @RecentlyNonNull
    @f2.a
    public static <R extends t, T extends s<R>> m<T> a(@RecentlyNonNull final n<R> n, @RecentlyNonNull final T t) {
        return b(n, (a<R, T>)new s0(t));
    }
    
    @RecentlyNonNull
    @f2.a
    public static <R extends t, T> m<T> b(@RecentlyNonNull final n<R> n, @RecentlyNonNull final a<R, T> a) {
        final b a2 = w.a;
        final com.google.android.gms.tasks.n<T> n2 = new com.google.android.gms.tasks.n<T>();
        n.c((n.a)new t0(n, n2, (a)a, a2));
        return n2.a();
    }
    
    @RecentlyNonNull
    @f2.a
    public static <R extends t> m<Void> c(@RecentlyNonNull final n<R> n) {
        return b(n, (a<R, Void>)new u0());
    }
    
    @f2.a
    public interface a<R extends t, T>
    {
        @RecentlyNonNull
        @f2.a
        T a(@RecentlyNonNull final R p0);
    }
    
    public interface b
    {
        com.google.android.gms.common.api.b N(final Status p0);
    }
}
