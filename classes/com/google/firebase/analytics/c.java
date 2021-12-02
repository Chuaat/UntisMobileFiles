// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.analytics;

import com.google.android.gms.measurement.internal.a6;
import java.util.Map;
import android.os.Bundle;
import java.util.List;
import androidx.annotation.k0;
import com.google.android.gms.measurement.internal.b6;
import com.google.android.gms.internal.measurement.j3;
import com.google.android.gms.measurement.internal.f7;

final class c implements f7
{
    final /* synthetic */ j3 a;
    
    c(final j3 a) {
        this.a = a;
    }
    
    @Override
    public final int a(final String s) {
        return this.a.w(s);
    }
    
    @Override
    public final void b(final b6 b6) {
        this.a.o(b6);
    }
    
    @Override
    public final List<Bundle> c(@k0 final String s, @k0 final String s2) {
        return this.a.L(s, s2);
    }
    
    @Override
    public final Map<String, Object> d(@k0 final String s, @k0 final String s2, final boolean b) {
        return this.a.M(s, s2, b);
    }
    
    @Override
    public final void e(final String s, final String s2, final Bundle bundle, final long n) {
        this.a.V(s, s2, bundle, n);
    }
    
    @Override
    public final void f(final Bundle bundle) {
        this.a.d(bundle);
    }
    
    @k0
    @Override
    public final String g() {
        return this.a.H();
    }
    
    @Override
    public final void h(final String s, final String s2, final Bundle bundle) {
        this.a.U(s, s2, bundle);
    }
    
    @k0
    @Override
    public final String i() {
        return this.a.K();
    }
    
    @k0
    @Override
    public final Object i0(final int n) {
        return this.a.D(n);
    }
    
    @Override
    public final void j(final a6 a6) {
        this.a.j(a6);
    }
    
    @k0
    @Override
    public final String k() {
        return this.a.I();
    }
    
    @Override
    public final void l(final String s) {
        this.a.Q(s);
    }
    
    @Override
    public final void m(final String s, @k0 final String s2, @k0 final Bundle bundle) {
        this.a.R(s, s2, bundle);
    }
    
    @Override
    public final void n(final b6 b6) {
        this.a.b(b6);
    }
    
    @Override
    public final void o(final String s) {
        this.a.S(s);
    }
    
    @k0
    @Override
    public final String r() {
        return this.a.J();
    }
    
    @Override
    public final long zzb() {
        return this.a.x();
    }
}
