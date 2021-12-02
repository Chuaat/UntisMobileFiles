// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.Objects;
import c6.h;
import android.content.Context;

final class w extends t0
{
    private final Context a;
    private final l1<d1<g0>> b;
    
    w(final Context context, @h final l1<d1<g0>> b) {
        Objects.requireNonNull(context, "Null context");
        this.a = context;
        this.b = b;
    }
    
    @Override
    final Context a() {
        return this.a;
    }
    
    @h
    @Override
    final l1<d1<g0>> b() {
        return this.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof t0) {
            final t0 t0 = (t0)o;
            if (this.a.equals(t0.a())) {
                final l1<d1<g0>> b = this.b;
                final l1<d1<g0>> b2 = t0.b();
                if (b == null) {
                    if (b2 != null) {
                        return false;
                    }
                }
                else if (!b.equals(b2)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final l1<d1<g0>> b = this.b;
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
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder(value.length() + 46 + value2.length());
        sb.append("FlagsContext{context=");
        sb.append(value);
        sb.append(", hermeticFileOverrides=");
        sb.append(value2);
        sb.append("}");
        return sb.toString();
    }
}
