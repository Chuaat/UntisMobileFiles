// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

public final class u0
{
    private final boolean a;
    
    public u0(final x0 x0) {
        k1.c(x0, "BuildInfo must be non-null");
        this.a = (x0.zza() ^ true);
    }
    
    public final boolean a(final String s) {
        k1.c(s, "flagName must not be null");
        return !this.a || w0.a.zza().a(s);
    }
}
