// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api;

import androidx.annotation.c1;
import androidx.annotation.RecentlyNullable;
import androidx.annotation.j0;
import com.google.android.gms.common.api.internal.e2;
import androidx.annotation.RecentlyNonNull;

public abstract class w<R extends t, S extends t>
{
    @j0
    public final n<S> a(@RecentlyNonNull final Status status) {
        return new e2<S>(status);
    }
    
    @j0
    public Status b(@RecentlyNonNull final Status status) {
        return status;
    }
    
    @RecentlyNullable
    @c1
    public abstract n<S> c(@RecentlyNonNull final R p0);
}
