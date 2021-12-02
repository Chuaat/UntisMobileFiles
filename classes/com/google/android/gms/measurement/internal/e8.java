// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.i1;

final class e8 implements Runnable
{
    final /* synthetic */ u G;
    final /* synthetic */ String H;
    final /* synthetic */ i1 I;
    final /* synthetic */ u8 J;
    
    e8(final u8 j, final u g, final String h, final i1 i) {
        this.J = j;
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    @Override
    public final void run() {
        final byte[] array = null;
        final byte[] array2 = null;
        byte[] l0 = array;
        while (true) {
            try {
                try {
                    final d3 e = u8.E(this.J);
                    byte[] array3;
                    if (e == null) {
                        l0 = array;
                        this.J.a.c().o().a("Discarding data. Failed to send event to service to bundle");
                        array3 = array2;
                    }
                    else {
                        l0 = array;
                        l0 = e.L0(this.G, this.H);
                        u8.M(this.J);
                        array3 = l0;
                    }
                    this.J.a.M().C(this.I, array3);
                    return;
                }
                finally {}
            }
            catch (RemoteException ex) {
                final byte[] array3;
                l0 = array3;
                this.J.a.c().o().b("Failed to send event to the service to bundle", ex);
                continue;
            }
            break;
        }
        this.J.a.M().C(this.I, l0);
    }
}
