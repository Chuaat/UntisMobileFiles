// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.protobuf;

public final class z
{
    static final int a;
    static final int b;
    static final int c;
    static final int d;
    
    static {
        a = c(1, 3);
        b = c(1, 4);
        c = c(2, 0);
        d = c(3, 2);
    }
    
    public static int a(final int n) {
        return n >>> 3;
    }
    
    static int b(final int n) {
        return n & 0x7;
    }
    
    static int c(final int n, final int n2) {
        return n << 3 | n2;
    }
    
    public enum b
    {
        I(z.c.K, 1), 
        J(z.c.J, 5), 
        K(i, 0), 
        L(i, 0), 
        M(h, 0), 
        N(i, 1), 
        O(h, 5), 
        P(z.c.L, 0), 
        Q(z.c.M, 2) {
            @Override
            public boolean f() {
                return false;
            }
        }, 
        R(p, 3) {
            @Override
            public boolean f() {
                return false;
            }
        }, 
        S(p, 2) {
            @Override
            public boolean f() {
                return false;
            }
        }, 
        T(z.c.N, 2) {
            @Override
            public boolean f() {
                return false;
            }
        }, 
        U(h, 0), 
        V(z.c.O, 0), 
        W(h, 5), 
        X(i, 1), 
        Y(h, 0), 
        Z(i, 0);
        
        private final c G;
        private final int H;
        
        static {
            final c i = z.c.I;
            final c h = z.c.H;
            final c p = z.c.P;
        }
        
        private b(final c g, final int h) {
            this.G = g;
            this.H = h;
        }
        
        public c b() {
            return this.G;
        }
        
        public int d() {
            return this.H;
        }
        
        public boolean f() {
            return true;
        }
    }
    
    public enum c
    {
        H((Object)0), 
        I((Object)0L), 
        J((Object)0.0f), 
        K((Object)0.0), 
        L((Object)Boolean.FALSE), 
        M((Object)""), 
        N((Object)kotlin.reflect.jvm.internal.impl.protobuf.d.G), 
        O((Object)null), 
        P((Object)null);
        
        private final Object G;
        
        private c(final Object g) {
            this.G = g;
        }
    }
}
