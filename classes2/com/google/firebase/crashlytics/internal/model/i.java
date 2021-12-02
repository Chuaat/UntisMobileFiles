// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.model;

import java.util.Objects;
import androidx.annotation.j0;

final class i extends a0.f.a.b
{
    private final String a;
    
    private i(final String a) {
        this.a = a;
    }
    
    @j0
    @Override
    public String b() {
        return this.a;
    }
    
    @Override
    protected a c() {
        return new b((a0.f.a.b)this);
    }
    
    @Override
    public boolean equals(final Object o) {
        return o == this || (o instanceof a0.f.a.b && this.a.equals(((a0.f.a.b)o).b()));
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode() ^ 0xF4243;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Organization{clsId=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
    
    static final class b extends a
    {
        private String a;
        
        b() {
        }
        
        private b(final a0.f.a.b b) {
            this.a = b.b();
        }
        
        @Override
        public a0.f.a.b a() {
            final String a = this.a;
            String string = "";
            if (a == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(" clsId");
                string = sb.toString();
            }
            if (string.isEmpty()) {
                return new i(this.a, null);
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Missing required properties:");
            sb2.append(string);
            throw new IllegalStateException(sb2.toString());
        }
        
        @Override
        public a b(final String s) {
            Objects.requireNonNull(s, "Null clsId");
            this.a = s;
            return this;
        }
    }
}
