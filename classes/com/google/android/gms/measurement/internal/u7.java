// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import java.util.Iterator;
import java.util.List;
import android.os.RemoteException;
import com.google.android.gms.common.internal.x;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.i1;

final class u7 implements Runnable
{
    final /* synthetic */ String G;
    final /* synthetic */ String H;
    final /* synthetic */ na I;
    final /* synthetic */ boolean J;
    final /* synthetic */ i1 K;
    final /* synthetic */ u8 L;
    
    u7(final u8 l, final String g, final String h, final na i, final boolean j, final i1 k) {
        this.L = l;
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    @Override
    public final void run() {
        Bundle bundle = new Bundle();
        Label_0306: {
            Bundle bundle2;
            try {
                final d3 e = u8.E(this.L);
                if (e == null) {
                    this.L.a.c().o().c("Failed to get user properties; not connected to service", this.G, this.H);
                    this.L.a.M().B(this.K, bundle);
                    return;
                }
                x.k(this.I);
                final List<ca> u1 = e.u1(this.G, this.H, this.J, this.I);
                bundle2 = new Bundle();
                if (u1 != null) {
                    for (final ca ca : u1) {
                        final String k = ca.K;
                        if (k != null) {
                            bundle2.putString(ca.H, k);
                        }
                        else {
                            final Long j = ca.J;
                            if (j != null) {
                                bundle2.putLong(ca.H, (long)j);
                            }
                            else {
                                final Double m = ca.M;
                                if (m == null) {
                                    continue;
                                }
                                bundle2.putDouble(ca.H, (double)m);
                            }
                        }
                    }
                }
                bundle = bundle2;
                try {
                    final u7 u2 = this;
                    final u8 u3 = u2.L;
                    u8.M(u3);
                    final u7 u4 = this;
                    final u8 u5 = u4.L;
                    final z4 z4 = u5.a;
                    final ga ga = z4.M();
                    final u7 u6 = this;
                    final i1 i1 = u6.K;
                    final Bundle bundle3 = bundle2;
                    ga.B(i1, bundle3);
                    return;
                }
                catch (RemoteException ex) {}
            }
            catch (RemoteException ex) {
                bundle2 = bundle;
            }
            finally {
                break Label_0306;
            }
            try {
                final u7 u2 = this;
                final u8 u3 = u2.L;
                u8.M(u3);
                final u7 u4 = this;
                final u8 u5 = u4.L;
                final z4 z4 = u5.a;
                final ga ga = z4.M();
                final u7 u6 = this;
                final i1 i1 = u6.K;
                final Bundle bundle3 = bundle2;
                ga.B(i1, bundle3);
                return;
                bundle = bundle2;
                final RemoteException ex;
                this.L.a.c().o().c("Failed to get user properties; remote exception", this.G, ex);
                this.L.a.M().B(this.K, bundle2);
                return;
            }
            finally {}
        }
        this.L.a.M().B(this.K, bundle);
    }
}
