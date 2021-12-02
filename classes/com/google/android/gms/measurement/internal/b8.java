// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.RemoteException;

final class b8 implements Runnable
{
    final /* synthetic */ m7 G;
    final /* synthetic */ u8 H;
    
    b8(final u8 h, final m7 g) {
        this.H = h;
        this.G = g;
    }
    
    @Override
    public final void run() {
        final d3 e = u8.E(this.H);
        if (e == null) {
            this.H.a.c().o().a("Failed to send current screen to service");
            return;
        }
        try {
            final m7 g = this.G;
            long c;
            String a;
            String b;
            String s;
            if (g == null) {
                final Context x = this.H.a.X();
                c = 0L;
                a = null;
                b = null;
                s = x.getPackageName();
            }
            else {
                c = g.c;
                a = g.a;
                b = g.b;
                s = this.H.a.X().getPackageName();
            }
            e.s1(c, a, b, s);
            u8.M(this.H);
        }
        catch (RemoteException ex) {
            this.H.a.c().o().b("Failed to send current screen to the service", ex);
        }
    }
}
