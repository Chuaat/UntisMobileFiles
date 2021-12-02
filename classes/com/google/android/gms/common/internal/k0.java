// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.f;

final class k0 implements a
{
    private final /* synthetic */ com.google.android.gms.common.api.internal.f c;
    
    k0(final com.google.android.gms.common.api.internal.f c) {
        this.c = c;
    }
    
    @Override
    public final void onConnected(@androidx.annotation.k0 final Bundle bundle) {
        this.c.onConnected(bundle);
    }
    
    @Override
    public final void onConnectionSuspended(final int n) {
        this.c.onConnectionSuspended(n);
    }
}
