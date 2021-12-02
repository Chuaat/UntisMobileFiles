// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.vision.clearcut;

import d6.a;

public final class b
{
    private final long a;
    private final Object b;
    @a("lock")
    private long c;
    
    public b(final double n) {
        this.b = new Object();
        this.c = Long.MIN_VALUE;
        this.a = Math.round(30000.0);
    }
    
    public final boolean a() {
        synchronized (this.b) {
            final long currentTimeMillis = System.currentTimeMillis();
            if (this.c + this.a > currentTimeMillis) {
                return false;
            }
            this.c = currentTimeMillis;
            return true;
        }
    }
}
