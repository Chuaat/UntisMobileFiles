// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.model;

import java.util.Objects;
import androidx.annotation.k0;

final class x extends a
{
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final int e;
    private final String f;
    
    x(final String s, final String s2, final String s3, final String s4, final int e, @k0 final String f) {
        Objects.requireNonNull(s, "Null appIdentifier");
        this.a = s;
        Objects.requireNonNull(s2, "Null versionCode");
        this.b = s2;
        Objects.requireNonNull(s3, "Null versionName");
        this.c = s3;
        Objects.requireNonNull(s4, "Null installUuid");
        this.d = s4;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public String a() {
        return this.a;
    }
    
    @Override
    public int c() {
        return this.e;
    }
    
    @Override
    public String d() {
        return this.d;
    }
    
    @k0
    @Override
    public String e() {
        return this.f;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof a) {
            final a a = (a)o;
            if (this.a.equals(a.a()) && this.b.equals(a.f()) && this.c.equals(a.g()) && this.d.equals(a.d()) && this.e == a.c()) {
                final String f = this.f;
                final String e = a.e();
                if (f == null) {
                    if (e == null) {
                        return b;
                    }
                }
                else if (f.equals(e)) {
                    return b;
                }
            }
            b = false;
            return b;
        }
        return false;
    }
    
    @Override
    public String f() {
        return this.b;
    }
    
    @Override
    public String g() {
        return this.c;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final int hashCode3 = this.c.hashCode();
        final int hashCode4 = this.d.hashCode();
        final int e = this.e;
        final String f = this.f;
        int hashCode5;
        if (f == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = f.hashCode();
        }
        return (((((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ e) * 1000003 ^ hashCode5;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("AppData{appIdentifier=");
        sb.append(this.a);
        sb.append(", versionCode=");
        sb.append(this.b);
        sb.append(", versionName=");
        sb.append(this.c);
        sb.append(", installUuid=");
        sb.append(this.d);
        sb.append(", deliveryMechanism=");
        sb.append(this.e);
        sb.append(", unityVersion=");
        sb.append(this.f);
        sb.append("}");
        return sb.toString();
    }
}
