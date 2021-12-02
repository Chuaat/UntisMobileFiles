// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.io.IOException;

public class f5
{
    protected volatile int G;
    
    public f5() {
        this.G = -1;
    }
    
    public static final void b(final f5 f5, final byte[] array, final int n, final int n2) {
        try {
            final y4 t = y4.t(array, 0, n2);
            f5.a(t);
            t.p();
        }
        catch (IOException cause) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", cause);
        }
    }
    
    public void a(final y4 y4) throws IOException {
    }
    
    public final int c() {
        return this.G = this.d();
    }
    
    protected int d() {
        return 0;
    }
    
    public f5 f() throws CloneNotSupportedException {
        return (f5)super.clone();
    }
    
    @Override
    public String toString() {
        return h5.a(this);
    }
}
