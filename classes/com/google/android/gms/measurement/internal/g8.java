// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.x;

final class g8 implements Runnable
{
    final /* synthetic */ na G;
    final /* synthetic */ u8 H;
    
    g8(final u8 h, final na g) {
        this.H = h;
        this.G = g;
    }
    
    @Override
    public final void run() {
        final d3 e = u8.E(this.H);
        if (e == null) {
            this.H.a.c().o().a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            x.k(this.G);
            e.b1(this.G);
            u8.M(this.H);
        }
        catch (RemoteException ex) {
            this.H.a.c().o().b("Failed to send measurementEnabled to the service", ex);
        }
    }
}
