// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.util.pool;

import androidx.annotation.j0;

public abstract class c
{
    private static final boolean a = false;
    
    private c() {
    }
    
    @j0
    public static c a() {
        return new c();
    }
    
    abstract void b(final boolean p0);
    
    public abstract void c();
    
    private static class b extends c
    {
        private volatile RuntimeException b;
        
        b() {
            super(null);
        }
        
        @Override
        void b(final boolean b) {
            RuntimeException b2;
            if (b) {
                b2 = new RuntimeException("Released");
            }
            else {
                b2 = null;
            }
            this.b = b2;
        }
        
        @Override
        public void c() {
            if (this.b == null) {
                return;
            }
            throw new IllegalStateException("Already released", this.b);
        }
    }
    
    private static class c extends com.bumptech.glide.util.pool.c
    {
        private volatile boolean b;
        
        c() {
            super(null);
        }
        
        public void b(final boolean b) {
            this.b = b;
        }
        
        @Override
        public void c() {
            if (!this.b) {
                return;
            }
            throw new IllegalStateException("Already released");
        }
    }
}
