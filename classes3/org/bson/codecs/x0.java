// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs;

import org.bson.z0;

public final class x0
{
    private static final x0 b;
    private final boolean a;
    
    static {
        b = a().b();
    }
    
    private x0(final b b) {
        this.a = b.a;
    }
    
    public static b a() {
        return new b();
    }
    
    public <T> void b(final w0<T> w0, final z0 z0, final T t) {
        w0.a(z0, t, x0.b);
    }
    
    public x0 c() {
        return x0.b;
    }
    
    public boolean d() {
        return this.a;
    }
    
    public static final class b
    {
        private boolean a;
        
        private b() {
        }
        
        public x0 b() {
            return new x0(this, null);
        }
        
        public b c(final boolean a) {
            this.a = a;
            return this;
        }
    }
}
