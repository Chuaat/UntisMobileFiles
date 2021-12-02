// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import androidx.annotation.c1;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.common.api.w;
import com.google.android.gms.common.api.t;

final class p2 implements Runnable
{
    private final /* synthetic */ t G;
    private final /* synthetic */ q2 H;
    
    p2(final q2 h, final t g) {
        this.H = h;
        this.G = g;
    }
    
    @c1
    @Override
    public final void run() {
        try {
            try {
                final ThreadLocal<Boolean> p = BasePendingResult.p;
                p.set(Boolean.TRUE);
                this.H.h.sendMessage(this.H.h.obtainMessage(0, (Object)x.k(this.H.a).c(this.G)));
                p.set(Boolean.FALSE);
                q2.i(this.H, this.G);
                final k k = (k)this.H.g.get();
                if (k != null) {
                    k.I(this.H);
                }
            }
            finally {
                BasePendingResult.p.set(Boolean.FALSE);
                q2.i(this.H, this.G);
                final k i = (k)this.H.g.get();
                if (i != null) {
                    i.I(this.H);
                }
                final k j;
                j.I(this.H);
            }
        }
        catch (RuntimeException ex) {}
    }
}
