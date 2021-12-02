// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.request;

public interface e
{
    void a(final d p0);
    
    boolean b();
    
    e c();
    
    boolean f(final d p0);
    
    boolean h(final d p0);
    
    void j(final d p0);
    
    boolean k(final d p0);
    
    public enum a
    {
        H(false), 
        I(false), 
        J(false), 
        K(true), 
        L(true);
        
        private final boolean G;
        
        private a(final boolean g) {
            this.G = g;
        }
        
        boolean b() {
            return this.G;
        }
    }
}
