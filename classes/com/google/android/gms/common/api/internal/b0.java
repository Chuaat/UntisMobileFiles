// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.c;
import com.google.android.gms.tasks.m;
import com.google.android.gms.common.api.b;
import androidx.annotation.k0;
import com.google.android.gms.tasks.n;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Status;
import f2.a;

@a
public class b0
{
    @a
    public static void a(@RecentlyNonNull final Status status, @RecentlyNonNull final n<Void> n) {
        b(status, null, (n<Object>)n);
    }
    
    @a
    public static <TResult> void b(@RecentlyNonNull final Status status, @k0 final TResult tResult, @RecentlyNonNull final n<TResult> n) {
        if (status.j3()) {
            n.c(tResult);
            return;
        }
        n.b(new b(status));
    }
    
    @Deprecated
    @RecentlyNonNull
    @a
    public static m<Void> c(@RecentlyNonNull final m<Boolean> m) {
        return m.m((c<Boolean, Void>)new o2());
    }
    
    @RecentlyNonNull
    @a
    public static <ResultT> boolean d(@RecentlyNonNull final Status status, @k0 final ResultT resultT, @RecentlyNonNull final n<ResultT> n) {
        if (status.j3()) {
            return n.e(resultT);
        }
        return n.d(new b(status));
    }
}
