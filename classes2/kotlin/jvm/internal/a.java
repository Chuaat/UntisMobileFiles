// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.jvm.internal;

import kotlin.reflect.h;
import kotlin.e1;
import java.io.Serializable;

@e1(version = "1.4")
public class a implements d0, Serializable
{
    protected final Object G;
    private final Class H;
    private final String I;
    private final String J;
    private final boolean K;
    private final int L;
    private final int M;
    
    public a(final int n, final Class clazz, final String s, final String s2, final int n2) {
        this(n, q.NO_RECEIVER, clazz, s, s2, n2);
    }
    
    public a(final int l, final Object g, final Class h, final String i, final String j, final int n) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = ((n & 0x1) == 0x1);
        this.L = l;
        this.M = n >> 1;
    }
    
    public h a() {
        final Class h = this.H;
        h h2;
        if (h == null) {
            h2 = null;
        }
        else if (this.K) {
            h2 = k1.g(h);
        }
        else {
            h2 = k1.d(h);
        }
        return h2;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof a)) {
            return false;
        }
        final a a = (a)o;
        if (this.K != a.K || this.L != a.L || this.M != a.M || !k0.g(this.G, a.G) || !k0.g(this.H, a.H) || !this.I.equals(a.I) || !this.J.equals(a.J)) {
            b = false;
        }
        return b;
    }
    
    @Override
    public int getArity() {
        return this.L;
    }
    
    @Override
    public int hashCode() {
        final Object g = this.G;
        int hashCode = 0;
        int hashCode2;
        if (g != null) {
            hashCode2 = g.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final Class h = this.H;
        if (h != null) {
            hashCode = h.hashCode();
        }
        final int hashCode3 = this.I.hashCode();
        final int hashCode4 = this.J.hashCode();
        int n;
        if (this.K) {
            n = 1231;
        }
        else {
            n = 1237;
        }
        return (((((hashCode2 * 31 + hashCode) * 31 + hashCode3) * 31 + hashCode4) * 31 + n) * 31 + this.L) * 31 + this.M;
    }
    
    @Override
    public String toString() {
        return k1.t(this);
    }
}
