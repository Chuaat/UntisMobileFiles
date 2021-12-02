// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

final class d8 extends n
{
    final /* synthetic */ u8 e;
    
    d8(final u8 e, final v5 v5) {
        this.e = e;
        super(v5);
    }
    
    @Override
    public final void c() {
        final u8 e = this.e;
        e.e();
        if (!e.w()) {
            return;
        }
        e.a.c().s().a("Inactivity, disconnecting from the service");
        e.P();
    }
}
