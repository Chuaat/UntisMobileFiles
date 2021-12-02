// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

public class x9
{
    private static final v8 c;
    protected volatile sa a;
    private volatile h8 b;
    
    static {
        c = v8.a();
    }
    
    public final int a() {
        if (this.b != null) {
            return ((e8)this.b).K.length;
        }
        if (this.a != null) {
            return this.a.y();
        }
        return 0;
    }
    
    public final h8 b() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b != null) {
                return this.b;
            }
            h8 b;
            if (this.a == null) {
                b = h8.H;
            }
            else {
                b = this.a.b();
            }
            return this.b = b;
        }
    }
    
    protected final void c(final sa sa) {
        if (this.a != null) {
            return;
        }
        synchronized (this) {
            if (this.a == null) {
                try {
                    this.a = sa;
                    this.b = h8.H;
                }
                catch (u9 u9) {
                    this.a = sa;
                    this.b = h8.H;
                }
            }
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof x9)) {
            return false;
        }
        final x9 x9 = (x9)o;
        final sa a = this.a;
        final sa a2 = x9.a;
        if (a == null && a2 == null) {
            return this.b().equals(x9.b());
        }
        if (a != null && a2 != null) {
            return a.equals(a2);
        }
        if (a != null) {
            x9.c(a.d());
            return a.equals(x9.a);
        }
        this.c(a2.d());
        return this.a.equals(a2);
    }
    
    @Override
    public int hashCode() {
        return 1;
    }
}
