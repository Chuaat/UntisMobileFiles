// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

abstract class f1
{
    private final c1 a;
    
    protected f1(final c1 a) {
        this.a = a;
    }
    
    protected abstract void a();
    
    public final void b(final b1 b1) {
        b1.e.lock();
        try {
            if (b1.o == this.a) {
                this.a();
            }
        }
        finally {
            b1.e.unlock();
        }
    }
}
