// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import h2.a;
import com.google.android.gms.common.internal.x;

final class a8 implements Runnable
{
    final /* synthetic */ na G;
    final /* synthetic */ u8 H;
    
    a8(final u8 h, final na g) {
        this.H = h;
        this.G = g;
    }
    
    @Override
    public final void run() {
        final d3 e = u8.E(this.H);
        if (e == null) {
            this.H.a.c().o().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            x.k(this.G);
            e.U0(this.G);
            this.H.a.z().q();
            this.H.o(e, null, this.G);
            u8.M(this.H);
        }
        catch (RemoteException ex) {
            this.H.a.c().o().b("Failed to send app launch to the service", ex);
        }
    }
}
