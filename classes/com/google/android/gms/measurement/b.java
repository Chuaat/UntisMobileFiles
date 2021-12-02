// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement;

import java.util.Iterator;
import com.google.android.gms.measurement.internal.ca;
import androidx.collection.a;
import com.google.android.gms.measurement.internal.a6;
import java.util.Map;
import android.os.Bundle;
import java.util.List;
import com.google.android.gms.measurement.internal.b6;
import com.google.android.gms.common.internal.x;
import androidx.annotation.j0;
import com.google.android.gms.measurement.internal.e7;
import com.google.android.gms.measurement.internal.z4;

final class b extends e
{
    private final z4 a;
    private final e7 b;
    
    public b(@j0 final z4 a) {
        super(null);
        x.k(a);
        this.a = a;
        this.b = a.G();
    }
    
    @Override
    public final int a(final String s) {
        this.b.O(s);
        return 25;
    }
    
    @Override
    public final void b(final b6 b6) {
        this.b.K(b6);
    }
    
    @Override
    public final List<Bundle> c(final String s, final String s2) {
        return this.b.Y(s, s2);
    }
    
    @Override
    public final Map<String, Object> d(final String s, final String s2, final boolean b) {
        return this.b.a0(s, s2, b);
    }
    
    @Override
    public final void e(final String s, final String s2, final Bundle bundle, final long n) {
        this.b.o(s, s2, bundle, true, false, n);
    }
    
    @Override
    public final void f(final Bundle bundle) {
        this.b.z(bundle);
    }
    
    @Override
    public final String g() {
        return this.b.T();
    }
    
    @Override
    public final void h(final String s, final String s2, final Bundle bundle) {
        this.b.n(s, s2, bundle);
    }
    
    @Override
    public final String i() {
        return this.b.T();
    }
    
    @Override
    public final Object i0(final int n) {
        if (n == 0) {
            return this.b.W();
        }
        if (n == 1) {
            return this.b.S();
        }
        if (n == 2) {
            return this.b.Q();
        }
        if (n != 3) {
            return this.b.P();
        }
        return this.b.R();
    }
    
    @Override
    public final void j(final a6 a6) {
        this.b.D(a6);
    }
    
    @Override
    public final String k() {
        return this.b.U();
    }
    
    @Override
    public final void l(final String s) {
        this.a.v().i(s, this.a.F().d());
    }
    
    @Override
    public final void m(final String s, final String s2, final Bundle bundle) {
        this.a.G().f0(s, s2, bundle);
    }
    
    @Override
    public final void n(final b6 b6) {
        this.b.t(b6);
    }
    
    @Override
    public final void o(final String s) {
        this.a.v().j(s, this.a.F().d());
    }
    
    public final Boolean p() {
        return this.b.P();
    }
    
    public final Double q() {
        return this.b.Q();
    }
    
    @Override
    public final String r() {
        return this.b.V();
    }
    
    public final Integer s() {
        return this.b.R();
    }
    
    public final Long t() {
        return this.b.S();
    }
    
    public final String u() {
        return this.b.W();
    }
    
    public final Map<String, Object> v(final boolean b) {
        final List<ca> z = this.b.Z(b);
        final a a = new a<String, Object>(z.size());
        for (final ca ca : z) {
            final Object m = ca.M();
            if (m != null) {
                a.put(ca.H, m);
            }
        }
        return (Map<String, Object>)a;
    }
    
    @Override
    public final long zzb() {
        return this.a.M().r0();
    }
}
