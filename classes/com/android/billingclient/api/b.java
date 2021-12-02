// 
// Decompiled by Procyon v0.5.36
// 

package com.android.billingclient.api;

import androidx.annotation.j0;

public final class b
{
    private String a;
    
    private b() {
    }
    
    @j0
    public static a b() {
        return new a(null);
    }
    
    @j0
    public String a() {
        return this.a;
    }
    
    public static final class a
    {
        private String a;
        
        private a() {
        }
        
        @j0
        public b a() {
            if (this.a != null) {
                final b b = new b(null);
                b.a = this.a;
                return b;
            }
            throw new IllegalArgumentException("Purchase token must be set");
        }
        
        @j0
        public a b(@j0 final String a) {
            this.a = a;
            return this;
        }
    }
}
