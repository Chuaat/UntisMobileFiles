// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

public class y1
{
    private static final v0 d;
    private d0 a;
    private volatile s2 b;
    private volatile d0 c;
    
    static {
        d = v0.b();
    }
    
    private final s2 b(final s2 s2) {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    try {
                        this.b = s2;
                        this.c = d0.H;
                    }
                    catch (r1 r1) {
                        this.b = s2;
                        this.c = d0.H;
                    }
                }
            }
        }
        return this.b;
    }
    
    public final int a() {
        if (this.c != null) {
            return this.c.size();
        }
        if (this.b != null) {
            return this.b.f();
        }
        return 0;
    }
    
    public final s2 c(final s2 b) {
        final s2 b2 = this.b;
        this.a = null;
        this.c = null;
        this.b = b;
        return b2;
    }
    
    public final d0 d() {
        if (this.c != null) {
            return this.c;
        }
        synchronized (this) {
            if (this.c != null) {
                return this.c;
            }
            d0 c;
            if (this.b == null) {
                c = d0.H;
            }
            else {
                c = this.b.l();
            }
            return this.c = c;
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof y1)) {
            return false;
        }
        final y1 y1 = (y1)o;
        final s2 b = this.b;
        final s2 b2 = y1.b;
        if (b == null && b2 == null) {
            return this.d().equals(y1.d());
        }
        if (b != null && b2 != null) {
            return b.equals(b2);
        }
        if (b != null) {
            return b.equals(y1.b(b.g()));
        }
        return this.b(b2.g()).equals(b2);
    }
    
    @Override
    public int hashCode() {
        return 1;
    }
}
