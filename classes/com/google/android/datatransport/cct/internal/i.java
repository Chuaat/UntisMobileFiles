// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.cct.internal;

import androidx.annotation.k0;

final class i extends o
{
    private final c a;
    private final o.b b;
    
    private i(@k0 final c a, @k0 final o.b b) {
        this.a = a;
        this.b = b;
    }
    
    @k0
    @Override
    public o.b b() {
        return this.b;
    }
    
    @k0
    @Override
    public c c() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof o) {
            final o o2 = (o)o;
            final c a = this.a;
            if (a == null) {
                if (o2.c() != null) {
                    return false;
                }
            }
            else if (!a.equals(o2.c())) {
                return false;
            }
            final o.b b2 = this.b;
            final o.b b3 = o2.b();
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
        final c a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final o.b b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return (hashCode2 ^ 0xF4243) * 1000003 ^ hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("NetworkConnectionInfo{networkType=");
        sb.append(this.a);
        sb.append(", mobileSubtype=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
    
    static final class b extends a
    {
        private c a;
        private o.b b;
        
        @Override
        public o a() {
            return new i(this.a, this.b, null);
        }
        
        @Override
        public a b(@k0 final o.b b) {
            this.b = b;
            return this;
        }
        
        @Override
        public a c(@k0 final c a) {
            this.a = a;
            return this;
        }
    }
}
