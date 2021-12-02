// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.util.Objects;
import java.util.List;

public final class d6
{
    public static final class a extends j1<d6.a, d6.a.a> implements u2
    {
        private static volatile d3<d6.a> zzbg;
        private static final d6.a zzbir;
        private q1<b> zzbiq;
        
        static {
            j1.o(d6.a.class, zzbir = new d6.a());
        }
        
        private a() {
            this.zzbiq = j1.t();
        }
        
        public static d6.a w() {
            return d6.a.zzbir;
        }
        
        public static d6.a y(final byte[] array) throws r1 {
            return j1.r(d6.a.zzbir, array);
        }
        
        @Override
        protected final Object k(final int n, Object o, final Object o2) {
            switch (e6.a[n - 1]) {
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
                    final d3<d6.a> zzbg;
                    if ((zzbg = d6.a.zzbg) == null) {
                        synchronized (d6.a.class) {
                            if (d6.a.zzbg == null) {
                                o = (d6.a.zzbg = (d3<d6.a>)new j1.b(d6.a.zzbir));
                            }
                        }
                    }
                    return zzbg;
                }
                case 4: {
                    return d6.a.zzbir;
                }
                case 3: {
                    return j1.m(d6.a.zzbir, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0002\u0000\u0001\u0000\u0001\u001b", new Object[] { "zzbiq", b.class });
                }
                case 2: {
                    return new d6.a.a((e6)null);
                }
                case 1: {
                    return new d6.a();
                }
            }
        }
        
        public final List<b> v() {
            return this.zzbiq;
        }
        
        public static final class a extends j1.a<d6.a, a> implements u2
        {
            private a() {
                super(d6.a.zzbir);
            }
        }
        
        public static final class b extends j1<b, a> implements u2
        {
            private static volatile d3<b> zzbg;
            private static final b zzbiv;
            private int zzbb;
            private String zzbis;
            private long zzbit;
            private long zzbiu;
            private int zzya;
            
            static {
                j1.o(b.class, zzbiv = new b());
            }
            
            private b() {
                this.zzbis = "";
            }
            
            public static a D() {
                return (a)b.zzbiv.k(g.e, null, null);
            }
            
            private final void F(final String s) {
                Objects.requireNonNull(s);
                this.zzbb |= 0x2;
                this.zzbis = s;
            }
            
            private final void G(final long zzbit) {
                this.zzbb |= 0x4;
                this.zzbit = zzbit;
            }
            
            private final void H(final long zzbiu) {
                this.zzbb |= 0x8;
                this.zzbiu = zzbiu;
            }
            
            public final String A() {
                return this.zzbis;
            }
            
            public final long B() {
                return this.zzbit;
            }
            
            public final long C() {
                return this.zzbiu;
            }
            
            @Override
            protected final Object k(final int n, Object o, final Object o2) {
                switch (e6.a[n - 1]) {
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
                        final d3<b> zzbg;
                        if ((zzbg = b.zzbg) == null) {
                            synchronized (b.class) {
                                if (b.zzbg == null) {
                                    o = (b.zzbg = (d3<b>)new j1.b(b.zzbiv));
                                }
                            }
                        }
                        return zzbg;
                    }
                    case 4: {
                        return b.zzbiv;
                    }
                    case 3: {
                        return j1.m(b.zzbiv, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0005\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\u0002\u0002\u0004\u0002\u0003", new Object[] { "zzbb", "zzya", "zzbis", "zzbit", "zzbiu" });
                    }
                    case 2: {
                        return new a((e6)null);
                    }
                    case 1: {
                        return new b();
                    }
                }
            }
            
            public final int v() {
                return this.zzya;
            }
            
            public final boolean z() {
                return (this.zzbb & 0x1) == 0x1;
            }
            
            public static final class a extends j1.a<d6.a.b, a> implements u2
            {
                private a() {
                    super(d6.a.b.zzbiv);
                }
                
                public final a t(final String s) {
                    ((j1.a)this).q();
                    ((d6.a.b)super.H).F(s);
                    return this;
                }
                
                public final a u(final long n) {
                    ((j1.a)this).q();
                    ((d6.a.b)super.H).G(n);
                    return this;
                }
                
                public final a v(final long n) {
                    ((j1.a)this).q();
                    ((d6.a.b)super.H).H(n);
                    return this;
                }
            }
        }
    }
}
