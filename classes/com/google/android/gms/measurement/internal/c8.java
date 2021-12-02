// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.x;
import android.os.Bundle;

final class c8 implements Runnable
{
    final /* synthetic */ na G;
    final /* synthetic */ Bundle H;
    final /* synthetic */ u8 I;
    
    c8(final u8 i, final na g, final Bundle h) {
        this.I = i;
        this.G = g;
        this.H = h;
    }
    
    @Override
    public final void run() {
        final d3 e = u8.E(this.I);
        if (e == null) {
            this.I.a.c().o().a("Failed to send default event parameters to service");
            return;
        }
        try {
            x.k(this.G);
            e.X(this.H, this.G);
        }
        catch (RemoteException ex) {
            this.I.a.c().o().b("Failed to send default event parameters to service", ex);
        }
    }
}
