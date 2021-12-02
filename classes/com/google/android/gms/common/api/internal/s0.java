// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import androidx.annotation.j0;
import com.google.android.gms.common.c;
import com.google.android.gms.signin.internal.d;
import com.google.android.gms.signin.e;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.common.internal.g;
import android.os.Bundle;
import com.google.android.gms.common.api.k;

final class s0 implements b, c
{
    private final /* synthetic */ h0 e;
    
    private s0(final h0 e) {
        this.e = e;
    }
    
    @Override
    public final void onConnected(@androidx.annotation.k0 final Bundle bundle) {
        final g g = x.k(this.e.r);
        x.k(this.e.k).k(new q0(this.e));
    }
    
    @Override
    public final void onConnectionFailed(@j0 final com.google.android.gms.common.c c) {
        this.e.b.lock();
        try {
            if (this.e.j(c)) {
                this.e.z();
                this.e.u();
            }
            else {
                this.e.m(c);
            }
        }
        finally {
            this.e.b.unlock();
        }
    }
    
    @Override
    public final void onConnectionSuspended(final int n) {
    }
}
