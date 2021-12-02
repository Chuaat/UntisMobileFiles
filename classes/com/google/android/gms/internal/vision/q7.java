// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

final class q7 implements v8
{
    private static final a8 b;
    private final a8 a;
    
    static {
        b = new p7();
    }
    
    public q7() {
        this(new s7(new a8[] { q6.c(), b() }));
    }
    
    private q7(final a8 a8) {
        this.a = t6.f(a8, "messageInfoFactory");
    }
    
    private static a8 b() {
        try {
            return (a8)Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", (Class<?>[])new Class[0]).invoke(null, new Object[0]);
        }
        catch (Exception ex) {
            return q7.b;
        }
    }
    
    private static boolean c(final x7 x7) {
        return x7.zza() == o8.a;
    }
    
    @Override
    public final <T> s8<T> a(final Class<T> clazz) {
        u8.p(clazz);
        final x7 b = this.a.b(clazz);
        if (b.zzb()) {
            if (p6.class.isAssignableFrom(clazz)) {
                return (s8<T>)f8.j(u8.B(), e6.a(), b.a());
            }
            return (s8<T>)f8.j(u8.f(), e6.b(), b.a());
        }
        else if (p6.class.isAssignableFrom(clazz)) {
            final boolean c = c(b);
            final h8 b2 = j8.b();
            final i7 d = i7.d();
            final k9<?, ?> b3 = u8.B();
            if (c) {
                return d8.q(clazz, b, b2, d, b3, e6.a(), y7.b());
            }
            return d8.q(clazz, b, b2, d, b3, null, y7.b());
        }
        else {
            final boolean c2 = c(b);
            final h8 a = j8.a();
            final i7 a2 = i7.a();
            if (c2) {
                return d8.q(clazz, b, a, a2, u8.f(), e6.b(), y7.a());
            }
            return d8.q(clazz, b, a, a2, u8.v(), null, y7.a());
        }
    }
}
