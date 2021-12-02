// 
// Decompiled by Procyon v0.5.36
// 

package com.android.billingclient.api;

import java.util.Collection;
import java.util.ArrayList;
import androidx.annotation.j0;
import java.util.List;

public class p
{
    private String a;
    private List<String> b;
    
    @j0
    public static a c() {
        return new a(null);
    }
    
    @j0
    public String a() {
        return this.a;
    }
    
    @j0
    public List<String> b() {
        return this.b;
    }
    
    public static class a
    {
        private String a;
        private List<String> b;
        
        private a() {
        }
        
        @j0
        public p a() {
            if (this.a == null) {
                throw new IllegalArgumentException("SKU type must be set");
            }
            if (this.b != null) {
                final p p = new p();
                p.a = this.a;
                p.b = this.b;
                return p;
            }
            throw new IllegalArgumentException("SKU list or SkuWithOffer list must be set");
        }
        
        @j0
        public a b(@j0 final List<String> c) {
            this.b = new ArrayList<String>(c);
            return this;
        }
        
        @j0
        public a c(@j0 final String a) {
            this.a = a;
            return this;
        }
    }
}
