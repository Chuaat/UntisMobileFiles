// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import androidx.annotation.c1;

abstract class r0 implements Runnable
{
    private final /* synthetic */ h0 G;
    
    private r0(final h0 g) {
        this.G = g;
    }
    
    @c1
    protected abstract void a();
    
    @c1
    @Override
    public void run() {
        this.G.b.lock();
        while (true) {
            try {
                try {
                    if (!Thread.interrupted()) {
                        this.a();
                    }
                    this.G.b.unlock();
                    return;
                }
                finally {}
            }
            catch (RuntimeException ex) {
                this.G.a.n(ex);
                continue;
            }
            break;
        }
        this.G.b.unlock();
    }
}
