// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.cct.internal;

import androidx.annotation.k0;

final class e extends k
{
    private final k.b a;
    private final com.google.android.datatransport.cct.internal.a b;
    
    private e(@k0 final k.b a, @k0 final com.google.android.datatransport.cct.internal.a b) {
        this.a = a;
        this.b = b;
    }
    
    @k0
    @Override
    public com.google.android.datatransport.cct.internal.a b() {
        return this.b;
    }
    
    @k0
    @Override
    public k.b c() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof k) {
            final k k = (k)o;
            final k.b a = this.a;
            if (a == null) {
                if (k.c() != null) {
                    return false;
                }
            }
            else if (!a.equals(k.c())) {
                return false;
            }
            final com.google.android.datatransport.cct.internal.a b2 = this.b;
            final com.google.android.datatransport.cct.internal.a b3 = k.b();
            if (b2 == null) {
                if (b3 == null) {
                    return b;
                }
            }
            else if (b2.equals(b3)) {
                return b;
            }
            b = false;
            return b;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final k.b a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final com.google.android.datatransport.cct.internal.a b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return (hashCode2 ^ 0xF4243) * 1000003 ^ hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ClientInfo{clientType=");
        sb.append(this.a);
        sb.append(", androidClientInfo=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
    
    static final class b extends a
    {
        private k.b a;
        private com.google.android.datatransport.cct.internal.a b;
        
        @Override
        public k a() {
            return new e(this.a, this.b, null);
        }
        
        @Override
        public a b(@k0 final com.google.android.datatransport.cct.internal.a b) {
            this.b = b;
            return this;
        }
        
        @Override
        public a c(@k0 final k.b a) {
            this.a = a;
            return this;
        }
    }
}
