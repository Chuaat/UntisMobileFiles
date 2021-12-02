// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

public final class v6
{
    public static final class a extends j1<v6.a, v6.a.a> implements u2
    {
        private static final v6.a zzbf;
        private static volatile d3<v6.a> zzbg;
        private int zzbb;
        private int zzbc;
        private int zzbd;
        private int zzbe;
        
        static {
            j1.o(v6.a.class, zzbf = new v6.a());
        }
        
        private a() {
        }
        
        @Override
        protected final Object k(final int n, Object o, final Object o2) {
            switch (w6.a[n - 1]) {
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
                    final d3<v6.a> zzbg;
                    if ((zzbg = v6.a.zzbg) == null) {
                        synchronized (v6.a.class) {
                            if (v6.a.zzbg == null) {
                                o = (v6.a.zzbg = (d3<v6.a>)new j1.b(v6.a.zzbf));
                            }
                        }
                    }
                    return zzbg;
                }
                case 4: {
                    return v6.a.zzbf;
                }
                case 3: {
                    return j1.m(v6.a.zzbf, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0004\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\f\u0002", new Object[] { "zzbb", "zzbc", c.d(), "zzbd", b.d(), "zzbe", d.b() });
                }
                case 2: {
                    return new v6.a.a((w6)null);
                }
                case 1: {
                    return new v6.a();
                }
            }
        }
        
        public static final class a extends j1.a<v6.a, a> implements u2
        {
            private a() {
                super(v6.a.zzbf);
            }
        }
        
        public enum b implements m1
        {
            H(0), 
            I(1), 
            J(2), 
            K(4), 
            L(5), 
            M(6), 
            N(7), 
            O(8), 
            P(9);
            
            private static final n1<b> Q;
            private final int G;
            
            static {
                Q = new x6();
            }
            
            private b(final int g) {
                this.G = g;
            }
            
            public static b b(final int n) {
                switch (n) {
                    default: {
                        return null;
                    }
                    case 9: {
                        return b.P;
                    }
                    case 8: {
                        return b.O;
                    }
                    case 7: {
                        return b.N;
                    }
                    case 6: {
                        return b.M;
                    }
                    case 5: {
                        return b.L;
                    }
                    case 4: {
                        return b.K;
                    }
                    case 2: {
                        return b.J;
                    }
                    case 1: {
                        return b.I;
                    }
                    case 0: {
                        return b.H;
                    }
                }
            }
            
            public static n1<b> d() {
                return b.Q;
            }
            
            @Override
            public final int a() {
                return this.G;
            }
        }
        
        public enum c implements m1
        {
            H(0), 
            I(1), 
            J(2), 
            K(3), 
            L(4), 
            M(5), 
            N(6), 
            O(7), 
            P(8), 
            Q(9), 
            R(10), 
            S(11);
            
            private static final n1<c> T;
            private final int G;
            
            static {
                T = new y6();
            }
            
            private c(final int g) {
                this.G = g;
            }
            
            public static c b(final int n) {
                switch (n) {
                    default: {
                        return null;
                    }
                    case 11: {
                        return c.S;
                    }
                    case 10: {
                        return c.R;
                    }
                    case 9: {
                        return c.Q;
                    }
                    case 8: {
                        return c.P;
                    }
                    case 7: {
                        return c.O;
                    }
                    case 6: {
                        return c.N;
                    }
                    case 5: {
                        return c.M;
                    }
                    case 4: {
                        return c.L;
                    }
                    case 3: {
                        return c.K;
                    }
                    case 2: {
                        return c.J;
                    }
                    case 1: {
                        return c.I;
                    }
                    case 0: {
                        return c.H;
                    }
                }
            }
            
            public static n1<c> d() {
                return c.T;
            }
            
            @Override
            public final int a() {
                return this.G;
            }
        }
        
        public enum d implements m1
        {
            H(0), 
            I(1), 
            J(2), 
            K(3), 
            L(4), 
            M(5), 
            N(7), 
            O(8), 
            P(9), 
            Q(10);
            
            private static final n1<d> R;
            private final int G;
            
            static {
                R = new z6();
            }
            
            private d(final int g) {
                this.G = g;
            }
            
            public static n1<d> b() {
                return d.R;
            }
            
            public static d d(final int n) {
                switch (n) {
                    default: {
                        return null;
                    }
                    case 10: {
                        return d.Q;
                    }
                    case 9: {
                        return d.P;
                    }
                    case 8: {
                        return d.O;
                    }
                    case 7: {
                        return d.N;
                    }
                    case 5: {
                        return d.M;
                    }
                    case 4: {
                        return d.L;
                    }
                    case 3: {
                        return d.K;
                    }
                    case 2: {
                        return d.J;
                    }
                    case 1: {
                        return d.I;
                    }
                    case 0: {
                        return d.H;
                    }
                }
            }
            
            @Override
            public final int a() {
                return this.G;
            }
        }
    }
}
