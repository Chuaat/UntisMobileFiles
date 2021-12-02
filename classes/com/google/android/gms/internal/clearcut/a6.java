// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

public final class a6
{
    public static final class a extends j1<a6.a, a6.a.a> implements u2
    {
        private static volatile d3<a6.a> zzbg;
        private static final a6.a zzbil;
        
        static {
            j1.o(a6.a.class, zzbil = new a6.a());
        }
        
        private a() {
        }
        
        @Override
        protected final Object k(final int n, Object o, final Object o2) {
            switch (b6.a[n - 1]) {
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
                    final d3<a6.a> zzbg;
                    if ((zzbg = a6.a.zzbg) == null) {
                        synchronized (a6.a.class) {
                            if (a6.a.zzbg == null) {
                                o = (a6.a.zzbg = (d3<a6.a>)new j1.b(a6.a.zzbil));
                            }
                        }
                    }
                    return zzbg;
                }
                case 4: {
                    return a6.a.zzbil;
                }
                case 3: {
                    return j1.m(a6.a.zzbil, "\u0001\u0000", null);
                }
                case 2: {
                    return new a6.a.a((b6)null);
                }
                case 1: {
                    return new a6.a();
                }
            }
        }
        
        public static final class a extends j1.a<a6.a, a> implements u2
        {
            private a() {
                super(a6.a.zzbil);
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
                K = new c6();
            }
            
            private b(final int g) {
                this.G = g;
            }
            
            public static b b(final int n) {
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
            
            public static n1<b> d() {
                return b.K;
            }
            
            @Override
            public final int a() {
                return this.G;
            }
        }
    }
}
