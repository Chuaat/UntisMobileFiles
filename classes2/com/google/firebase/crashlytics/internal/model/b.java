// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.model;

import java.util.Objects;
import androidx.annotation.j0;
import androidx.annotation.k0;

final class b extends a0
{
    private final String c;
    private final String d;
    private final int e;
    private final String f;
    private final String g;
    private final String h;
    private final a0.f i;
    private final a0.e j;
    
    private b(final String c, final String d, final int e, final String f, final String g, final String h, @k0 final a0.f i, @k0 final a0.e j) {
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    @j0
    @Override
    public String c() {
        return this.g;
    }
    
    @j0
    @Override
    public String d() {
        return this.h;
    }
    
    @j0
    @Override
    public String e() {
        return this.d;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof a0) {
            final a0 a0 = (a0)o;
            if (this.c.equals(a0.i()) && this.d.equals(a0.e()) && this.e == a0.h() && this.f.equals(a0.f()) && this.g.equals(a0.c()) && this.h.equals(a0.d())) {
                final a0.f i = this.i;
                if (i == null) {
                    if (a0.j() != null) {
                        return false;
                    }
                }
                else if (!i.equals(a0.j())) {
                    return false;
                }
                final a0.e j = this.j;
                final a0.e g = a0.g();
                if (j == null) {
                    if (g == null) {
                        return b;
                    }
                }
                else if (j.equals(g)) {
                    return b;
                }
            }
            b = false;
            return b;
        }
        return false;
    }
    
    @j0
    @Override
    public String f() {
        return this.f;
    }
    
    @k0
    @Override
    public a0.e g() {
        return this.j;
    }
    
    @Override
    public int h() {
        return this.e;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.c.hashCode();
        final int hashCode2 = this.d.hashCode();
        final int e = this.e;
        final int hashCode3 = this.f.hashCode();
        final int hashCode4 = this.g.hashCode();
        final int hashCode5 = this.h.hashCode();
        final a0.f i = this.i;
        int hashCode6 = 0;
        int hashCode7;
        if (i == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = i.hashCode();
        }
        final a0.e j = this.j;
        if (j != null) {
            hashCode6 = j.hashCode();
        }
        return (((((((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ e) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ hashCode5) * 1000003 ^ hashCode7) * 1000003 ^ hashCode6;
    }
    
    @j0
    @Override
    public String i() {
        return this.c;
    }
    
    @k0
    @Override
    public a0.f j() {
        return this.i;
    }
    
    @Override
    protected a0.c l() {
        return new b((a0)this);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CrashlyticsReport{sdkVersion=");
        sb.append(this.c);
        sb.append(", gmpAppId=");
        sb.append(this.d);
        sb.append(", platform=");
        sb.append(this.e);
        sb.append(", installationUuid=");
        sb.append(this.f);
        sb.append(", buildVersion=");
        sb.append(this.g);
        sb.append(", displayVersion=");
        sb.append(this.h);
        sb.append(", session=");
        sb.append(this.i);
        sb.append(", ndkPayload=");
        sb.append(this.j);
        sb.append("}");
        return sb.toString();
    }
    
    static final class b extends a0.c
    {
        private String a;
        private String b;
        private Integer c;
        private String d;
        private String e;
        private String f;
        private a0.f g;
        private a0.e h;
        
        b() {
        }
        
        private b(final a0 a0) {
            this.a = a0.i();
            this.b = a0.e();
            this.c = a0.h();
            this.d = a0.f();
            this.e = a0.c();
            this.f = a0.d();
            this.g = a0.j();
            this.h = a0.g();
        }
        
        @Override
        public a0 a() {
            final String a = this.a;
            String string = "";
            if (a == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(" sdkVersion");
                string = sb.toString();
            }
            String string2 = string;
            if (this.b == null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" gmpAppId");
                string2 = sb2.toString();
            }
            String string3 = string2;
            if (this.c == null) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(string2);
                sb3.append(" platform");
                string3 = sb3.toString();
            }
            String string4 = string3;
            if (this.d == null) {
                final StringBuilder sb4 = new StringBuilder();
                sb4.append(string3);
                sb4.append(" installationUuid");
                string4 = sb4.toString();
            }
            String string5 = string4;
            if (this.e == null) {
                final StringBuilder sb5 = new StringBuilder();
                sb5.append(string4);
                sb5.append(" buildVersion");
                string5 = sb5.toString();
            }
            String string6 = string5;
            if (this.f == null) {
                final StringBuilder sb6 = new StringBuilder();
                sb6.append(string5);
                sb6.append(" displayVersion");
                string6 = sb6.toString();
            }
            if (string6.isEmpty()) {
                return new com.google.firebase.crashlytics.internal.model.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, null);
            }
            final StringBuilder sb7 = new StringBuilder();
            sb7.append("Missing required properties:");
            sb7.append(string6);
            throw new IllegalStateException(sb7.toString());
        }
        
        @Override
        public a0.c b(final String s) {
            Objects.requireNonNull(s, "Null buildVersion");
            this.e = s;
            return this;
        }
        
        @Override
        public a0.c c(final String s) {
            Objects.requireNonNull(s, "Null displayVersion");
            this.f = s;
            return this;
        }
        
        @Override
        public a0.c d(final String s) {
            Objects.requireNonNull(s, "Null gmpAppId");
            this.b = s;
            return this;
        }
        
        @Override
        public a0.c e(final String s) {
            Objects.requireNonNull(s, "Null installationUuid");
            this.d = s;
            return this;
        }
        
        @Override
        public a0.c f(final a0.e h) {
            this.h = h;
            return this;
        }
        
        @Override
        public a0.c g(final int i) {
            this.c = i;
            return this;
        }
        
        @Override
        public a0.c h(final String s) {
            Objects.requireNonNull(s, "Null sdkVersion");
            this.a = s;
            return this;
        }
        
        @Override
        public a0.c i(final a0.f g) {
            this.g = g;
            return this;
        }
    }
}
