// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

final class l3 implements Runnable
{
    private final /* synthetic */ i3 G;
    
    l3(final i3 g) {
        this.G = g;
    }
    
    @Override
    public final void run() {
        this.G.q.lock();
        try {
            this.G.B();
        }
        finally {
            this.G.q.unlock();
        }
    }
}
