// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.internal.measurement.i1;

final class z7 implements Runnable
{
    final /* synthetic */ na G;
    final /* synthetic */ i1 H;
    final /* synthetic */ u8 I;
    
    z7(final u8 i, final na g, final i1 h) {
        this.I = i;
        this.G = g;
        this.H = h;
    }
    
    @Override
    public final void run() {
        final String s = null;
        final String s2 = null;
        String s3 = s;
        while (true) {
            try {
                try {
                    String s4;
                    if (!this.I.a.C().n().k()) {
                        s3 = s;
                        this.I.a.c().u().a("Analytics storage consent denied; will not get app instance id");
                        s3 = s;
                        this.I.a.G().y(null);
                        s3 = s;
                        this.I.a.C().g.b(null);
                        s4 = s2;
                    }
                    else {
                        s3 = s;
                        final d3 e = u8.E(this.I);
                        if (e == null) {
                            s3 = s;
                            this.I.a.c().o().a("Failed to get app instance id");
                            s4 = s2;
                        }
                        else {
                            s3 = s;
                            x.k(this.G);
                            s3 = s;
                            final String x0 = e.x0(this.G);
                            if (x0 != null) {
                                s3 = x0;
                                this.I.a.G().y(x0);
                                s3 = x0;
                                this.I.a.C().g.b(x0);
                            }
                            s3 = x0;
                            u8.M(this.I);
                            s4 = x0;
                        }
                    }
                    this.I.a.M().G(this.H, s4);
                    return;
                }
                finally {}
            }
            catch (RemoteException ex) {
                final String s4;
                s3 = s4;
                this.I.a.c().o().b("Failed to get app instance id", ex);
                continue;
            }
            break;
        }
        this.I.a.M().G(this.H, s3);
    }
}
