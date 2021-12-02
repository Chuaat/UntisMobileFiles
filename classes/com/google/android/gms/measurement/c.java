// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement;

import com.google.android.gms.measurement.internal.a6;
import java.util.Map;
import android.os.Bundle;
import java.util.List;
import com.google.android.gms.measurement.internal.b6;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.measurement.internal.f7;

final class c extends e
{
    private final f7 a;
    
    public c(final f7 a) {
        super(null);
        x.k(a);
        this.a = a;
    }
    
    @Override
    public final int a(final String s) {
        return this.a.a(s);
    }
    
    @Override
    public final void b(final b6 b6) {
        this.a.b(b6);
    }
    
    @Override
    public final List<Bundle> c(final String s, final String s2) {
        return this.a.c(s, s2);
    }
    
    @Override
    public final Map<String, Object> d(final String s, final String s2, final boolean b) {
        return this.a.d(s, s2, b);
    }
    
    @Override
    public final void e(final String s, final String s2, final Bundle bundle, final long n) {
        this.a.e(s, s2, bundle, n);
    }
    
    @Override
    public final void f(final Bundle bundle) {
        this.a.f(bundle);
    }
    
    @Override
    public final String g() {
        return this.a.g();
    }
    
    @Override
    public final void h(final String s, final String s2, final Bundle bundle) {
        this.a.h(s, s2, bundle);
    }
    
    @Override
    public final String i() {
        return this.a.i();
    }
    
    @Override
    public final Object i0(final int n) {
        return this.a.i0(n);
    }
    
    @Override
    public final void j(final a6 a6) {
        this.a.j(a6);
    }
    
    @Override
    public final String k() {
        return this.a.k();
    }
    
    @Override
    public final void l(final String s) {
        this.a.l(s);
    }
    
    @Override
    public final void m(final String s, final String s2, final Bundle bundle) {
        this.a.m(s, s2, bundle);
    }
    
    @Override
    public final void n(final b6 b6) {
        this.a.n(b6);
    }
    
    @Override
    public final void o(final String s) {
        this.a.o(s);
    }
    
    public final Boolean p() {
        return (Boolean)this.a.i0(4);
    }
    
    public final Double q() {
        return (Double)this.a.i0(2);
    }
    
    @Override
    public final String r() {
        return this.a.r();
    }
    
    public final Integer s() {
        return (Integer)this.a.i0(3);
    }
    
    public final Long t() {
        return (Long)this.a.i0(1);
    }
    
    public final String u() {
        return (String)this.a.i0(0);
    }
    
    public final Map<String, Object> v(final boolean b) {
        return this.a.d(null, null, b);
    }
    
    @Override
    public final long zzb() {
        return this.a.zzb();
    }
}
