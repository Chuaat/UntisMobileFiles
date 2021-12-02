// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api;

import java.util.concurrent.TimeUnit;
import com.google.android.gms.common.internal.x;
import androidx.annotation.RecentlyNonNull;

public final class e implements t
{
    private final Status G;
    private final n<?>[] H;
    
    e(final Status g, final n<?>[] h) {
        this.G = g;
        this.H = h;
    }
    
    @RecentlyNonNull
    public final <R extends t> R a(@RecentlyNonNull final f<R> f) {
        x.b(f.a < this.H.length, "The result token does not belong to this batch");
        return (R)this.H[f.a].e(0L, TimeUnit.MILLISECONDS);
    }
    
    @RecentlyNonNull
    @Override
    public final Status h() {
        return this.G;
    }
}
