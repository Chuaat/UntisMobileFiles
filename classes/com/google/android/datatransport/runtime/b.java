// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime;

import java.util.Objects;
import com.google.android.datatransport.c;
import com.google.android.datatransport.g;
import com.google.android.datatransport.d;

final class b extends n
{
    private final o a;
    private final String b;
    private final d<?> c;
    private final g<?, byte[]> d;
    private final c e;
    
    private b(final o a, final String b, final d<?> c, final g<?, byte[]> d, final c e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public c b() {
        return this.e;
    }
    
    @Override
    d<?> c() {
        return this.c;
    }
    
    @Override
    g<?, byte[]> e() {
        return this.d;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof n) {
            final n n = (n)o;
            if (!this.a.equals(n.f()) || !this.b.equals(n.g()) || !this.c.equals(n.c()) || !this.d.equals(n.e()) || !this.e.equals(n.b())) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public o f() {
        return this.a;
    }
    
    @Override
    public String g() {
        return this.b;
    }
    
    @Override
    public int hashCode() {
        return ((((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("SendRequest{transportContext=");
        sb.append(this.a);
        sb.append(", transportName=");
        sb.append(this.b);
        sb.append(", event=");
        sb.append(this.c);
        sb.append(", transformer=");
        sb.append(this.d);
        sb.append(", encoding=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }
    
    static final class b extends a
    {
        private o a;
        private String b;
        private d<?> c;
        private g<?, byte[]> d;
        private c e;
        
        @Override
        public n a() {
            final o a = this.a;
            String string = "";
            if (a == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(" transportContext");
                string = sb.toString();
            }
            String string2 = string;
            if (this.b == null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" transportName");
                string2 = sb2.toString();
            }
            String string3 = string2;
            if (this.c == null) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(string2);
                sb3.append(" event");
                string3 = sb3.toString();
            }
            String string4 = string3;
            if (this.d == null) {
                final StringBuilder sb4 = new StringBuilder();
                sb4.append(string3);
                sb4.append(" transformer");
                string4 = sb4.toString();
            }
            String string5 = string4;
            if (this.e == null) {
                final StringBuilder sb5 = new StringBuilder();
                sb5.append(string4);
                sb5.append(" encoding");
                string5 = sb5.toString();
            }
            if (string5.isEmpty()) {
                return new com.google.android.datatransport.runtime.b(this.a, this.b, this.c, this.d, this.e, null);
            }
            final StringBuilder sb6 = new StringBuilder();
            sb6.append("Missing required properties:");
            sb6.append(string5);
            throw new IllegalStateException(sb6.toString());
        }
        
        @Override
        a b(final c c) {
            Objects.requireNonNull(c, "Null encoding");
            this.e = c;
            return this;
        }
        
        @Override
        a c(final d<?> d) {
            Objects.requireNonNull(d, "Null event");
            this.c = d;
            return this;
        }
        
        @Override
        a e(final g<?, byte[]> g) {
            Objects.requireNonNull(g, "Null transformer");
            this.d = g;
            return this;
        }
        
        @Override
        public a f(final o o) {
            Objects.requireNonNull(o, "Null transportContext");
            this.a = o;
            return this;
        }
        
        @Override
        public a g(final String s) {
            Objects.requireNonNull(s, "Null transportName");
            this.b = s;
            return this;
        }
    }
}
