// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.model;

import java.util.Objects;
import androidx.annotation.j0;
import androidx.annotation.k0;

final class e extends a0.e
{
    private final b0<a0.e.b> a;
    private final String b;
    
    private e(final b0<a0.e.b> a, @k0 final String b) {
        this.a = a;
        this.b = b;
    }
    
    @j0
    @Override
    public b0<a0.e.b> b() {
        return this.a;
    }
    
    @k0
    @Override
    public String c() {
        return this.b;
    }
    
    @Override
    a0.e.a d() {
        return new b((a0.e)this);
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof a0.e) {
            final a0.e e = (a0.e)o;
            if (this.a.equals(e.b())) {
                final String b2 = this.b;
                final String c = e.c();
                if (b2 == null) {
                    if (c == null) {
                        return b;
                    }
                }
                else if (b2.equals(c)) {
                    return b;
                }
            }
            b = false;
            return b;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.a.hashCode();
        final String b = this.b;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        return (hashCode ^ 0xF4243) * 1000003 ^ hashCode2;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("FilesPayload{files=");
        sb.append(this.a);
        sb.append(", orgId=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
    
    static final class b extends a0.e.a
    {
        private b0<a0.e.b> a;
        private String b;
        
        b() {
        }
        
        private b(final a0.e e) {
            this.a = e.b();
            this.b = e.c();
        }
        
        @Override
        public a0.e a() {
            final b0<a0.e.b> a = this.a;
            String string = "";
            if (a == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(" files");
                string = sb.toString();
            }
            if (string.isEmpty()) {
                return new e(this.a, this.b, null);
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Missing required properties:");
            sb2.append(string);
            throw new IllegalStateException(sb2.toString());
        }
        
        @Override
        public a0.e.a b(final b0<a0.e.b> b0) {
            Objects.requireNonNull(b0, "Null files");
            this.a = b0;
            return this;
        }
        
        @Override
        public a0.e.a c(final String b) {
            this.b = b;
            return this;
        }
    }
}
