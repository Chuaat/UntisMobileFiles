// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.Objects;
import c6.h;
import android.content.Context;

final class e6 extends a7
{
    private final Context a;
    private final k7<h7<q6>> b;
    
    e6(final Context context, @h final k7<h7<q6>> b) {
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
    final k7<h7<q6>> b() {
        return this.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof a7) {
            final a7 a7 = (a7)o;
            if (this.a.equals(a7.a())) {
                final k7<h7<q6>> b = this.b;
                final k7<h7<q6>> b2 = a7.b();
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
        final k7<h7<q6>> b = this.b;
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
