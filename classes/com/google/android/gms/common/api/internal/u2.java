// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

final class u2 implements t2
{
    private final /* synthetic */ r2 a;
    
    u2(final r2 a) {
        this.a = a;
    }
    
    @Override
    public final void a(final BasePendingResult<?> basePendingResult) {
        this.a.a.remove(basePendingResult);
    }
}
