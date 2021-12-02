// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

final class ja implements eb
{
    private static final qa b;
    private final qa a;
    
    static {
        b = new ha();
    }
    
    public ja() {
        final e9 c = e9.c();
        qa b;
        try {
            b = (qa)Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", (Class<?>[])new Class[0]).invoke(null, new Object[0]);
        }
        catch (Exception ex) {
            b = ja.b;
        }
        final ia a = new ia(new qa[] { c, b });
        s9.f(a, "messageInfoFactory");
        this.a = a;
    }
    
    private static boolean b(final pa pa) {
        return pa.a() == 1;
    }
    
    @Override
    public final <T> db<T> a(final Class<T> clazz) {
        fb.g(clazz);
        final pa b = this.a.b(clazz);
        if (b.zzb()) {
            vb<?, ?> vb;
            w8<?> w8;
            if (j9.class.isAssignableFrom(clazz)) {
                vb = fb.b();
                w8 = y8.b();
            }
            else {
                vb = fb.b0();
                w8 = y8.a();
            }
            return (db<T>)wa.j(vb, w8, b.zza());
        }
        xa xa;
        fa d;
        vb<?, ?> b3;
        na na;
        w8<?> w9;
        if (j9.class.isAssignableFrom(clazz)) {
            final boolean b2 = b(b);
            xa = ya.b();
            d = fa.d();
            b3 = fb.b();
            w8<?> b4;
            if (b2) {
                b4 = y8.b();
            }
            else {
                b4 = null;
            }
            na = oa.b();
            w9 = b4;
        }
        else {
            final boolean b5 = b(b);
            xa = ya.a();
            final fa c = fa.c();
            vb<?, ?> vb2;
            w8<?> a;
            if (b5) {
                vb2 = fb.b0();
                a = y8.a();
            }
            else {
                vb2 = fb.a();
                a = null;
            }
            na = oa.a();
            w9 = a;
            b3 = vb2;
            d = c;
        }
        return va.F(clazz, b, xa, d, b3, w9, na);
    }
}
