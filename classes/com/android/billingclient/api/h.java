// 
// Decompiled by Procyon v0.5.36
// 

package com.android.billingclient.api;

import androidx.annotation.j0;

public final class h
{
    private int a;
    private String b;
    
    @j0
    public static a c() {
        return new a(null);
    }
    
    @j0
    public String a() {
        return this.b;
    }
    
    public int b() {
        return this.a;
    }
    
    public static class a
    {
        private int a;
        private String b = "";
        
        private a() {
            this.b = "";
        }
        
        @j0
        public h a() {
            final h h = new h();
            h.a = this.a;
            h.b = this.b;
            return h;
        }
        
        @j0
        public a b(@j0 final String b) {
            this.b = b;
            return this;
        }
        
        @j0
        public a c(final int a) {
            this.a = a;
            return this;
        }
    }
}
