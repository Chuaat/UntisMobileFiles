// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

public final class af implements ze
{
    public static final c7<Boolean> a;
    public static final c7<Double> b;
    public static final c7<Long> c;
    public static final c7<Long> d;
    public static final c7<String> e;
    
    static {
        final z6 z6 = new z6(s6.a("com.google.android.gms.measurement"));
        a = z6.e("measurement.test.boolean_flag", false);
        b = z6.b("measurement.test.double_flag", -3.0);
        c = z6.c("measurement.test.int_flag", -2L);
        d = z6.c("measurement.test.long_flag", -1L);
        e = z6.d("measurement.test.string_flag", "---");
    }
    
    @Override
    public final long a() {
        return af.d.b();
    }
    
    @Override
    public final String c() {
        return af.e.b();
    }
    
    @Override
    public final boolean e() {
        return af.a.b();
    }
    
    @Override
    public final double zza() {
        return af.b.b();
    }
    
    @Override
    public final long zzb() {
        return af.c.b();
    }
}
