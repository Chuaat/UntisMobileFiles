// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

abstract class b2
{
    private static final b2 a;
    private static final b2 b;
    
    static {
        a = new e2(null);
        b = new f2(null);
    }
    
    private b2() {
    }
    
    static b2 c() {
        return b2.a;
    }
    
    static b2 d() {
        return b2.b;
    }
    
    abstract void a(final Object p0, final long p1);
    
    abstract <L> void b(final Object p0, final Object p1, final long p2);
}
