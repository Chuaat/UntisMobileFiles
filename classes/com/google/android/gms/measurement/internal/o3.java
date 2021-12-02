// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import androidx.annotation.k0;
import android.os.Bundle;
import androidx.annotation.j0;

public final class o3
{
    @j0
    public final String a;
    @j0
    public final String b;
    public final long c;
    @j0
    public final Bundle d;
    
    public o3(@j0 final String a, @j0 final String b, @k0 final Bundle d, final long c) {
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = c;
    }
    
    public static o3 b(final u u) {
        return new o3(u.G, u.I, u.H.g1(), u.J);
    }
    
    public final u a() {
        return new u(this.a, new s(new Bundle(this.d)), this.b, this.c);
    }
    
    @Override
    public final String toString() {
        final String b = this.b;
        final String a = this.a;
        final String value = String.valueOf(this.d);
        final StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 21 + String.valueOf(a).length() + value.length());
        sb.append("origin=");
        sb.append(b);
        sb.append(",name=");
        sb.append(a);
        sb.append(",params=");
        sb.append(value);
        return sb.toString();
    }
}
