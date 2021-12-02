// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.model;

import java.util.Objects;
import androidx.annotation.j0;

final class t extends d
{
    private final String a;
    
    private t(final String a) {
        this.a = a;
    }
    
    @j0
    @Override
    public String b() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o == this || (o instanceof d && this.a.equals(((d)o).b()));
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode() ^ 0xF4243;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Log{content=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
    
    static final class b extends a
    {
        private String a;
        
        @Override
        public d a() {
            final String a = this.a;
            String string = "";
            if (a == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(" content");
                string = sb.toString();
            }
            if (string.isEmpty()) {
                return new t(this.a, null);
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Missing required properties:");
            sb2.append(string);
            throw new IllegalStateException(sb2.toString());
        }
        
        @Override
        public a b(final String s) {
            Objects.requireNonNull(s, "Null content");
            this.a = s;
            return this;
        }
    }
}
