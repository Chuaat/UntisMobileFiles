// 
// Decompiled by Procyon v0.5.36
// 

package com.android.billingclient.api;

import androidx.annotation.j0;

public final class i
{
    private String a;
    
    private i() {
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
        public i a() {
            if (this.a != null) {
                final i i = new i(null);
                i.a = this.a;
                return i;
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
