// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

abstract class fa
{
    private static final fa a;
    private static final fa b;
    
    static {
        a = new ba((aa)null);
        b = new da((ca)null);
    }
    
    static fa c() {
        return fa.a;
    }
    
    static fa d() {
        return fa.b;
    }
    
    abstract void a(final Object p0, final long p1);
    
    abstract <L> void b(final Object p0, final Object p1, final long p2);
}
