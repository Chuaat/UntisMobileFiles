// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.cct.internal;

import java.util.Arrays;
import androidx.annotation.k0;

final class f extends l
{
    private final long a;
    private final Integer b;
    private final long c;
    private final byte[] d;
    private final String e;
    private final long f;
    private final o g;
    
    private f(final long a, @k0 final Integer b, final long c, @k0 final byte[] d, @k0 final String e, final long f, @k0 final o g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    @k0
    @Override
    public Integer b() {
        return this.b;
    }
    
    @Override
    public long c() {
        return this.a;
    }
    
    @Override
    public long d() {
        return this.c;
    }
    
    @k0
    @Override
    public o e() {
        return this.g;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof l) {
            final l l = (l)o;
            if (this.a == l.c()) {
                final Integer b2 = this.b;
                if (b2 == null) {
                    if (l.b() != null) {
                        return false;
                    }
                }
                else if (!b2.equals(l.b())) {
                    return false;
                }
                if (this.c == l.d()) {
                    final byte[] d = this.d;
                    byte[] a2;
                    if (l instanceof f) {
                        a2 = ((f)l).d;
                    }
                    else {
                        a2 = l.f();
                    }
                    if (Arrays.equals(d, a2)) {
                        final String e = this.e;
                        if (e == null) {
                            if (l.g() != null) {
                                return false;
                            }
                        }
                        else if (!e.equals(l.g())) {
                            return false;
                        }
                        if (this.f == l.h()) {
                            final o g = this.g;
                            final o e2 = l.e();
                            if (g == null) {
                                if (e2 == null) {
                                    return b;
                                }
                            }
                            else if (g.equals(e2)) {
                                return b;
                            }
                        }
                    }
                }
            }
            b = false;
            return b;
        }
        return false;
    }
    
    @k0
    @Override
    public byte[] f() {
        return this.d;
    }
    
    @k0
    @Override
    public String g() {
        return this.e;
    }
    
    @Override
    public long h() {
        return this.f;
    }
    
    @Override
    public int hashCode() {
        final long a = this.a;
        final int n = (int)(a ^ a >>> 32);
        final Integer b = this.b;
        int hashCode = 0;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        final long c = this.c;
        final int n2 = (int)(c ^ c >>> 32);
        final int hashCode3 = Arrays.hashCode(this.d);
        final String e = this.e;
        int hashCode4;
        if (e == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = e.hashCode();
        }
        final long f = this.f;
        final int n3 = (int)(f >>> 32 ^ f);
        final o g = this.g;
        if (g != null) {
            hashCode = g.hashCode();
        }
        return ((((((n ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ n2) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ n3) * 1000003 ^ hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("LogEvent{eventTimeMs=");
        sb.append(this.a);
        sb.append(", eventCode=");
        sb.append(this.b);
        sb.append(", eventUptimeMs=");
        sb.append(this.c);
        sb.append(", sourceExtension=");
        sb.append(Arrays.toString(this.d));
        sb.append(", sourceExtensionJsonProto3=");
        sb.append(this.e);
        sb.append(", timezoneOffsetSeconds=");
        sb.append(this.f);
        sb.append(", networkConnectionInfo=");
        sb.append(this.g);
        sb.append("}");
        return sb.toString();
    }
    
    static final class b extends a
    {
        private Long a;
        private Integer b;
        private Long c;
        private byte[] d;
        private String e;
        private Long f;
        private o g;
        
        @Override
        public l a() {
            final Long a = this.a;
            String string = "";
            if (a == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(" eventTimeMs");
                string = sb.toString();
            }
            String string2 = string;
            if (this.c == null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" eventUptimeMs");
                string2 = sb2.toString();
            }
            String string3 = string2;
            if (this.f == null) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(string2);
                sb3.append(" timezoneOffsetSeconds");
                string3 = sb3.toString();
            }
            if (string3.isEmpty()) {
                return new f(this.a, this.b, this.c, this.d, this.e, this.f, this.g, null);
            }
            final StringBuilder sb4 = new StringBuilder();
            sb4.append("Missing required properties:");
            sb4.append(string3);
            throw new IllegalStateException(sb4.toString());
        }
        
        @Override
        public a b(@k0 final Integer b) {
            this.b = b;
            return this;
        }
        
        @Override
        public a c(final long l) {
            this.a = l;
            return this;
        }
        
        @Override
        public a d(final long l) {
            this.c = l;
            return this;
        }
        
        @Override
        public a e(@k0 final o g) {
            this.g = g;
            return this;
        }
        
        @Override
        a f(@k0 final byte[] d) {
            this.d = d;
            return this;
        }
        
        @Override
        a g(@k0 final String e) {
            this.e = e;
            return this;
        }
        
        @Override
        public a h(final long l) {
            this.f = l;
            return this;
        }
    }
}
