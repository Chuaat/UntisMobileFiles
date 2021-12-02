// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api;

import androidx.annotation.k0;
import com.google.android.gms.common.internal.b0;
import com.google.android.gms.common.internal.x;
import androidx.annotation.RecentlyNonNull;
import f2.a;

@a
public class g implements t
{
    private final Status G;
    private final boolean H;
    
    @b0
    @a
    public g(@RecentlyNonNull final Status status, @RecentlyNonNull final boolean h) {
        this.G = x.l(status, "Status must not be null");
        this.H = h;
    }
    
    @RecentlyNonNull
    @a
    public boolean a() {
        return this.H;
    }
    
    @RecentlyNonNull
    @a
    @Override
    public final boolean equals(@k0 final Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (!(o instanceof g)) {
            return false;
        }
        final g g = (g)o;
        return this.G.equals(g.G) && this.H == g.H;
    }
    
    @RecentlyNonNull
    @a
    @Override
    public Status h() {
        return this.G;
    }
    
    @RecentlyNonNull
    @a
    @Override
    public final int hashCode() {
        return (this.G.hashCode() + 527) * 31 + (this.H ? 1 : 0);
    }
}
