// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

final class h2 implements l3
{
    private static final r2 b;
    private final r2 a;
    
    static {
        b = new i2();
    }
    
    public h2() {
        this(new j2(new r2[] { i1.c(), c() }));
    }
    
    private h2(final r2 r2) {
        this.a = l1.e(r2, "messageInfoFactory");
    }
    
    private static boolean b(final q2 q2) {
        return q2.a() == j1.g.i;
    }
    
    private static r2 c() {
        try {
            return (r2)Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", (Class<?>[])new Class[0]).invoke(null, new Object[0]);
        }
        catch (Exception ex) {
            return h2.b;
        }
    }
    
    @Override
    public final <T> k3<T> a(final Class<T> clazz) {
        m3.I(clazz);
        final q2 b = this.a.b(clazz);
        if (b.b()) {
            if (j1.class.isAssignableFrom(clazz)) {
                return (k3<T>)y2.a(m3.B(), z0.b(), b.c());
            }
            return (k3<T>)y2.a(m3.z(), z0.c(), b.c());
        }
        else if (j1.class.isAssignableFrom(clazz)) {
            final boolean b2 = b(b);
            final a3 b3 = c3.b();
            final b2 d = com.google.android.gms.internal.clearcut.b2.d();
            final c4<?, ?> b4 = m3.B();
            if (b2) {
                return w2.s(clazz, b, b3, d, b4, z0.b(), p2.b());
            }
            return w2.s(clazz, b, b3, d, b4, null, p2.b());
        }
        else {
            final boolean b5 = b(b);
            final a3 a = c3.a();
            final b2 c = b2.c();
            if (b5) {
                return w2.s(clazz, b, a, c, m3.z(), z0.c(), p2.a());
            }
            return w2.s(clazz, b, a, c, m3.A(), null, p2.a());
        }
    }
}
