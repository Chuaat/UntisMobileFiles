// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import androidx.annotation.j0;
import com.google.android.gms.common.c;
import android.os.Bundle;
import com.google.android.gms.common.internal.x;
import androidx.annotation.k0;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.k;

public final class h3 implements b, c
{
    public final com.google.android.gms.common.api.a<?> e;
    private final boolean f;
    @k0
    private j3 g;
    
    public h3(final com.google.android.gms.common.api.a<?> e, final boolean f) {
        this.e = e;
        this.f = f;
    }
    
    private final j3 a() {
        x.l(this.g, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        return this.g;
    }
    
    public final void b(final j3 g) {
        this.g = g;
    }
    
    @Override
    public final void onConnected(@k0 final Bundle bundle) {
        this.a().onConnected(bundle);
    }
    
    @Override
    public final void onConnectionFailed(@j0 final com.google.android.gms.common.c c) {
        this.a().H(c, this.e, this.f);
    }
    
    @Override
    public final void onConnectionSuspended(final int n) {
        this.a().onConnectionSuspended(n);
    }
}
