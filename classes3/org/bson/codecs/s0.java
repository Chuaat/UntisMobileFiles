// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs;

import org.bson.p0;

public final class s0
{
    private static final s0 b;
    private final boolean a;
    
    static {
        b = a().a();
    }
    
    private s0(final b b) {
        this.a = b.c();
    }
    
    public static b a() {
        return new b();
    }
    
    public <T> T b(final r0<T> r0, final p0 p2) {
        return r0.c(p2, s0.b);
    }
    
    public boolean c() {
        return this.a;
    }
    
    public static final class b
    {
        private boolean a;
        
        private b() {
        }
        
        public s0 a() {
            return new s0(this, null);
        }
        
        public b b(final boolean a) {
            this.a = a;
            return this;
        }
        
        public boolean c() {
            return this.a;
        }
    }
}
