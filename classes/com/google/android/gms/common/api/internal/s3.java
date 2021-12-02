// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import android.os.Bundle;

final class s3 implements Runnable
{
    private final /* synthetic */ LifecycleCallback G;
    private final /* synthetic */ String H;
    private final /* synthetic */ t3 I;
    
    s3(final t3 i, final LifecycleCallback g, final String h) {
        this.I = i;
        this.G = g;
        this.H = h;
    }
    
    @Override
    public final void run() {
        if (this.I.H > 0) {
            final LifecycleCallback g = this.G;
            Bundle bundle;
            if (this.I.I != null) {
                bundle = this.I.I.getBundle(this.H);
            }
            else {
                bundle = null;
            }
            g.g(bundle);
        }
        if (this.I.H >= 2) {
            this.G.k();
        }
        if (this.I.H >= 3) {
            this.G.i();
        }
        if (this.I.H >= 4) {
            this.G.l();
        }
        if (this.I.H >= 5) {
            this.G.h();
        }
    }
}
