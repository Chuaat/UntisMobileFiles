// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

abstract class u5 extends t5
{
    private boolean b;
    
    u5(final z4 z4) {
        super(z4);
        super.a.f();
    }
    
    protected void f() {
    }
    
    protected abstract boolean g();
    
    protected final void h() {
        if (this.k()) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }
    
    public final void i() {
        if (!this.b) {
            if (!this.g()) {
                super.a.d();
                this.b = true;
            }
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
    
    public final void j() {
        if (!this.b) {
            this.f();
            super.a.d();
            this.b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
    
    final boolean k() {
        return this.b;
    }
}
