// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

public final class q
{
    public static final class a extends j1<q.a, q.a.a> implements u2
    {
        private static volatile d3<q.a> zzbg;
        private static final q.a zzes;
        private int zzbb;
        private int zzel;
        private int zzem;
        private int zzen;
        private int zzeo;
        private int zzep;
        private int zzeq;
        private int zzer;
        
        static {
            j1.o(q.a.class, zzes = new q.a());
        }
        
        private a() {
        }
        
        @Override
        protected final Object k(final int n, Object o, final Object o2) {
            switch (r.a[n - 1]) {
                default: {
                    throw new UnsupportedOperationException();
                }
                case 7: {
                    return null;
                }
                case 6: {
                    return 1;
                }
                case 5: {
                    final d3<q.a> zzbg;
                    if ((zzbg = q.a.zzbg) == null) {
                        synchronized (q.a.class) {
                            if (q.a.zzbg == null) {
                                o = (q.a.zzbg = (d3<q.a>)new j1.b(q.a.zzes));
                            }
                        }
                    }
                    return zzbg;
                }
                case 4: {
                    return q.a.zzes;
                }
                case 3: {
                    return j1.m(q.a.zzes, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\b\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\f\u0002\u0004\f\u0003\u0005\f\u0004\u0006\f\u0005\u0007\f\u0006", new Object[] { "zzbb", "zzel", b.b(), "zzem", b.b(), "zzen", b.b(), "zzeo", b.b(), "zzep", b.b(), "zzeq", b.b(), "zzer", b.b() });
                }
                case 2: {
                    return new q.a.a((r)null);
                }
                case 1: {
                    return new q.a();
                }
            }
        }
        
        public static final class a extends j1.a<q.a, a> implements u2
        {
            private a() {
                super(q.a.zzes);
            }
        }
        
        public enum b implements m1
        {
            H(0), 
            I(1), 
            J(2);
            
            private static final n1<b> K;
            private final int G;
            
            static {
                K = new s();
            }
            
            private b(final int g) {
                this.G = g;
            }
            
            public static n1<b> b() {
                return b.K;
            }
            
            public static b d(final int n) {
                if (n == 0) {
                    return b.H;
                }
                if (n == 1) {
                    return b.I;
                }
                if (n != 2) {
                    return null;
                }
                return b.J;
            }
            
            @Override
            public final int a() {
                return this.G;
            }
        }
    }
}
