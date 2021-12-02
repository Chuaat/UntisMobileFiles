// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.v;
import androidx.annotation.k0;
import com.google.android.gms.common.api.a;

public final class c<O extends a.d>
{
    private final boolean a;
    private final int b;
    private final a<O> c;
    @k0
    private final O d;
    
    private c(final a<O> c, @k0 final O d) {
        this.a = false;
        this.c = c;
        this.d = d;
        this.b = v.c(c, d);
    }
    
    @RecentlyNonNull
    public static <O extends a.d> c<O> c(@RecentlyNonNull final a<O> a, @k0 final O o) {
        return new c<O>(a, o);
    }
    
    @RecentlyNonNull
    public final String a() {
        return this.c.d();
    }
    
    @RecentlyNonNull
    public final a.c<?> b() {
        return this.c.c();
    }
    
    @RecentlyNonNull
    public final boolean d() {
        return false;
    }
    
    @RecentlyNonNull
    @Override
    public final boolean equals(@k0 final Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (!(o instanceof c)) {
            return false;
        }
        final c c = (c)o;
        return v.b(this.c, c.c) && v.b(this.d, c.d);
    }
    
    @RecentlyNonNull
    @Override
    public final int hashCode() {
        return this.b;
    }
}
