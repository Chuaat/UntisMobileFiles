// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.flags;

import f2.a;

@a
public final class e
{
    private static e c;
    private final b a;
    private final g b;
    
    static {
        final e c = new e();
        synchronized (e.class) {
            e.c = c;
        }
    }
    
    private e() {
        this.a = new b();
        this.b = new g();
    }
    
    @a
    public static b a() {
        return b().a;
    }
    
    private static e b() {
        synchronized (e.class) {
            return e.c;
        }
    }
    
    public static g c() {
        return b().b;
    }
}
