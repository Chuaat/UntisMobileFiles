// 
// Decompiled by Procyon v0.5.36
// 

package com.android.billingclient.api;

import androidx.annotation.j0;

public class l
{
    private SkuDetails a;
    
    @j0
    public static a b() {
        return new a();
    }
    
    @j0
    public SkuDetails a() {
        return this.a;
    }
    
    public static class a
    {
        private SkuDetails a;
        
        @j0
        public l a() {
            if (this.a != null) {
                final l l = new l();
                l.a = this.a;
                return l;
            }
            throw new IllegalArgumentException("SkuDetails must be set");
        }
        
        @j0
        public a b(@j0 final SkuDetails a) {
            this.a = a;
            return this;
        }
    }
}
