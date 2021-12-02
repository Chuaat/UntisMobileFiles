// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import androidx.annotation.RecentlyNonNull;
import android.app.Activity;

@f2.a
public abstract class a
{
    @RecentlyNonNull
    @f2.a
    public static final a a(@RecentlyNonNull final Activity activity) {
        return new d0(activity);
    }
    
    @RecentlyNonNull
    @f2.a
    public abstract a b(@RecentlyNonNull final Runnable p0);
}
