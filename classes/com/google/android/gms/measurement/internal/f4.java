// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

abstract class f4 extends e3
{
    private boolean b;
    
    f4(final z4 z4) {
        super(z4);
        super.a.f();
    }
    
    protected final void f() {
        if (this.j()) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }
    
    public final void g() {
        if (!this.b) {
            if (!this.k()) {
                super.a.d();
                this.b = true;
            }
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
    
    public final void h() {
        if (!this.b) {
            this.i();
            super.a.d();
            this.b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
    
    protected void i() {
    }
    
    final boolean j() {
        return this.b;
    }
    
    protected abstract boolean k();
}
