// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.internal.x;
import androidx.annotation.k0;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;
import com.google.android.gms.common.api.k;

final class v0 implements b
{
    private final /* synthetic */ AtomicReference e;
    private final /* synthetic */ z f;
    private final /* synthetic */ t0 g;
    
    v0(final t0 g, final AtomicReference e, final z f) {
        this.g = g;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final void onConnected(@k0 final Bundle bundle) {
        t0.O(this.g, x.k(this.e.get()), this.f, true);
    }
    
    @Override
    public final void onConnectionSuspended(final int n) {
    }
}
