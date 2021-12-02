// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

public class h7
{
    private static final b6 d;
    private f5 a;
    private volatile z7 b;
    private volatile f5 c;
    
    static {
        d = b6.d();
    }
    
    private final z7 c(final z7 z7) {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    try {
                        this.b = z7;
                        this.c = f5.H;
                    }
                    catch (y6 y6) {
                        this.b = z7;
                        this.c = f5.H;
                    }
                }
            }
        }
        return this.b;
    }
    
    public final z7 a(final z7 b) {
        final z7 b2 = this.b;
        this.a = null;
        this.c = null;
        this.b = b;
        return b2;
    }
    
    public final int b() {
        if (this.c != null) {
            return this.c.f();
        }
        if (this.b != null) {
            return this.b.q();
        }
        return 0;
    }
    
    public final f5 d() {
        if (this.c != null) {
            return this.c;
        }
        synchronized (this) {
            if (this.c != null) {
                return this.c;
            }
            f5 c;
            if (this.b == null) {
                c = f5.H;
            }
            else {
                c = this.b.m();
            }
            return this.c = c;
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof h7)) {
            return false;
        }
        final h7 h7 = (h7)o;
        final z7 b = this.b;
        final z7 b2 = h7.b;
        if (b == null && b2 == null) {
            return this.d().equals(h7.d());
        }
        if (b != null && b2 != null) {
            return b.equals(b2);
        }
        if (b != null) {
            return b.equals(h7.c(b.l()));
        }
        return this.c(b2.l()).equals(b2);
    }
    
    @Override
    public int hashCode() {
        return 1;
    }
}
