// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

abstract class p9 extends o9
{
    private boolean c;
    
    p9(final z9 z9) {
        super(z9);
        super.b.n();
    }
    
    protected final void f() {
        if (this.h()) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }
    
    public final void g() {
        if (!this.c) {
            this.i();
            super.b.i();
            this.c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
    
    final boolean h() {
        return this.c;
    }
    
    protected abstract boolean i();
}
