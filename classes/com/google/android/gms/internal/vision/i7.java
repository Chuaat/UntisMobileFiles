// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.List;

abstract class i7
{
    private static final i7 a;
    private static final i7 b;
    
    static {
        a = new k7(null);
        b = new n7(null);
    }
    
    private i7() {
    }
    
    static i7 a() {
        return i7.a;
    }
    
    static i7 d() {
        return i7.b;
    }
    
    abstract <L> List<L> b(final Object p0, final long p1);
    
    abstract <L> void c(final Object p0, final Object p1, final long p2);
    
    abstract void e(final Object p0, final long p1);
}
