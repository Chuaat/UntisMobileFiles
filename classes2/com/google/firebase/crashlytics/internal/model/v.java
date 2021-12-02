// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.model;

import java.util.Objects;
import androidx.annotation.j0;

final class v extends f
{
    private final String a;
    
    private v(final String a) {
        this.a = a;
    }
    
    @j0
    @Override
    public String b() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o == this || (o instanceof f && this.a.equals(((f)o).b()));
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode() ^ 0xF4243;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("User{identifier=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
    
    static final class b extends a
    {
        private String a;
        
        @Override
        public f a() {
            final String a = this.a;
            String string = "";
            if (a == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(" identifier");
                string = sb.toString();
            }
            if (string.isEmpty()) {
                return new v(this.a, null);
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Missing required properties:");
            sb2.append(string);
            throw new IllegalStateException(sb2.toString());
        }
        
        @Override
        public a b(final String s) {
            Objects.requireNonNull(s, "Null identifier");
            this.a = s;
            return this;
        }
    }
}
