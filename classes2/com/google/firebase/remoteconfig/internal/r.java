// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.remoteconfig.internal;

import com.google.firebase.remoteconfig.p;

public class r implements p
{
    private final long a;
    private final int b;
    private final com.google.firebase.remoteconfig.r c;
    
    private r(final long a, final int b, final com.google.firebase.remoteconfig.r c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    static b d() {
        return new b();
    }
    
    @Override
    public int a() {
        return this.b;
    }
    
    @Override
    public long b() {
        return this.a;
    }
    
    @Override
    public com.google.firebase.remoteconfig.r c() {
        return this.c;
    }
    
    public static class b
    {
        private long a;
        private int b;
        private com.google.firebase.remoteconfig.r c;
        
        private b() {
        }
        
        public r a() {
            return new r(this.a, this.b, this.c, null);
        }
        
        b b(final com.google.firebase.remoteconfig.r c) {
            this.c = c;
            return this;
        }
        
        b c(final int b) {
            this.b = b;
            return this;
        }
        
        public b d(final long a) {
            this.a = a;
            return this;
        }
    }
}
