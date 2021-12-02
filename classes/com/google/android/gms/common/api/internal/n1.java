// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.c;

final class n1 implements Runnable
{
    private final /* synthetic */ c G;
    private final /* synthetic */ i.c H;
    
    n1(final i.c h, final c g) {
        this.H = h;
        this.G = g;
    }
    
    @Override
    public final void run() {
        final i.a a = this.H.f.k.get(this.H.b);
        if (a == null) {
            return;
        }
        if (this.G.j2()) {
            i.c.f(this.H, true);
            if (this.H.a.w()) {
                this.H.e();
                return;
            }
            try {
                this.H.a.i(null, this.H.a.h());
                return;
            }
            catch (SecurityException ex) {
                Log.e("GoogleApiManager", "Failed to get service from broker. ", (Throwable)ex);
                this.H.a.j("Failed to get service from broker.");
                a.onConnectionFailed(new c(10));
                return;
            }
        }
        a.onConnectionFailed(this.G);
    }
}
