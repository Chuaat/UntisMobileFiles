// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.x;
import android.os.Bundle;
import java.util.ArrayList;
import com.google.android.gms.internal.measurement.i1;

final class m8 implements Runnable
{
    final /* synthetic */ String G;
    final /* synthetic */ String H;
    final /* synthetic */ na I;
    final /* synthetic */ i1 J;
    final /* synthetic */ u8 K;
    
    m8(final u8 k, final String g, final String h, final na i, final i1 j) {
        this.K = k;
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    @Override
    public final void run() {
        ArrayList<Bundle> r;
        final ArrayList<Bundle> list = r = new ArrayList<Bundle>();
        while (true) {
            try {
                try {
                    final d3 e = u8.E(this.K);
                    ArrayList<Bundle> list2;
                    if (e == null) {
                        r = list;
                        this.K.a.c().o().c("Failed to get conditional properties; not connected to service", this.G, this.H);
                        list2 = list;
                    }
                    else {
                        r = list;
                        x.k(this.I);
                        r = list;
                        final ArrayList<Bundle> list3 = r = ga.r(e.W0(this.G, this.H, this.I));
                        u8.M(this.K);
                        list2 = list3;
                    }
                    this.K.a.M().A(this.J, list2);
                    return;
                }
                finally {}
            }
            catch (RemoteException ex) {
                final ArrayList<Bundle> list2;
                r = list2;
                this.K.a.c().o().d("Failed to get conditional properties; remote exception", this.G, this.H, ex);
                continue;
            }
            break;
        }
        this.K.a.M().A(this.J, r);
    }
}
