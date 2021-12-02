// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.b0;
import androidx.annotation.k0;
import android.os.Bundle;
import f2.a;

@a
public interface f
{
    @b0
    @a
    void onConnected(@k0 final Bundle p0);
    
    @b0
    @a
    void onConnectionSuspended(@RecentlyNonNull final int p0);
}
