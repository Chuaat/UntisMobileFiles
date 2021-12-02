// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime;

import java.util.Objects;
import androidx.annotation.k0;
import java.util.Map;

final class a extends i
{
    private final String a;
    private final Integer b;
    private final h c;
    private final long d;
    private final long e;
    private final Map<String, String> f;
    
    private a(final String a, @k0 final Integer b, final h c, final long d, final long e, final Map<String, String> f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    protected Map<String, String> c() {
        return this.f;
    }
    
    @k0
    @Override
    public Integer d() {
        return this.b;
    }
    
    @Override
    public h e() {
        return this.c;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof i) {
            final i i = (i)o;
            if (this.a.equals(i.l())) {
                final Integer b2 = this.b;
                if (b2 == null) {
                    if (i.d() != null) {
                        return false;
                    }
                }
                else if (!b2.equals(i.d())) {
                    return false;
                }
                if (this.c.equals(i.e()) && this.d == i.f() && this.e == i.m() && this.f.equals(i.c())) {
                    return b;
                }
            }
            b = false;
            return b;
        }
        return false;
    }
    
    @Override
    public long f() {
        return this.d;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.a.hashCode();
        final Integer b = this.b;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        final int hashCode3 = this.c.hashCode();
        final long d = this.d;
        final int n = (int)(d ^ d >>> 32);
        final long e = this.e;
        return (((((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ hashCode3) * 1000003 ^ n) * 1000003 ^ (int)(e ^ e >>> 32)) * 1000003 ^ this.f.hashCode();
    }
    
    @Override
    public String l() {
        return this.a;
    }
    
    @Override
    public long m() {
        return this.e;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("EventInternal{transportName=");
        sb.append(this.a);
        sb.append(", code=");
        sb.append(this.b);
        sb.append(", encodedPayload=");
        sb.append(this.c);
        sb.append(", eventMillis=");
        sb.append(this.d);
        sb.append(", uptimeMillis=");
        sb.append(this.e);
        sb.append(", autoMetadata=");
        sb.append(this.f);
        sb.append("}");
        return sb.toString();
    }
    
    static final class b extends i.a
    {
        private String a;
        private Integer b;
        private h c;
        private Long d;
        private Long e;
        private Map<String, String> f;
        
        @Override
        public i d() {
            final String a = this.a;
            String string = "";
            if (a == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(" transportName");
                string = sb.toString();
            }
            String string2 = string;
            if (this.c == null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" encodedPayload");
                string2 = sb2.toString();
            }
            String string3 = string2;
            if (this.d == null) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(string2);
                sb3.append(" eventMillis");
                string3 = sb3.toString();
            }
            String string4 = string3;
            if (this.e == null) {
                final StringBuilder sb4 = new StringBuilder();
                sb4.append(string3);
                sb4.append(" uptimeMillis");
                string4 = sb4.toString();
            }
            String string5 = string4;
            if (this.f == null) {
                final StringBuilder sb5 = new StringBuilder();
                sb5.append(string4);
                sb5.append(" autoMetadata");
                string5 = sb5.toString();
            }
            if (string5.isEmpty()) {
                return new a(this.a, this.b, this.c, this.d, this.e, this.f, null);
            }
            final StringBuilder sb6 = new StringBuilder();
            sb6.append("Missing required properties:");
            sb6.append(string5);
            throw new IllegalStateException(sb6.toString());
        }
        
        @Override
        protected Map<String, String> e() {
            final Map<String, String> f = this.f;
            if (f != null) {
                return f;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        
        @Override
        protected i.a f(final Map<String, String> map) {
            Objects.requireNonNull(map, "Null autoMetadata");
            this.f = map;
            return this;
        }
        
        @Override
        public i.a g(final Integer b) {
            this.b = b;
            return this;
        }
        
        @Override
        public i.a h(final h h) {
            Objects.requireNonNull(h, "Null encodedPayload");
            this.c = h;
            return this;
        }
        
        @Override
        public i.a i(final long l) {
            this.d = l;
            return this;
        }
        
        @Override
        public i.a j(final String s) {
            Objects.requireNonNull(s, "Null transportName");
            this.a = s;
            return this;
        }
        
        @Override
        public i.a k(final long l) {
            this.e = l;
            return this;
        }
    }
}
