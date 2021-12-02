// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.jvm.internal;

import n6.o;
import n6.n;
import n6.m;
import n6.k;
import n6.j;
import n6.i;
import n6.h;
import n6.g;
import n6.f;
import n6.e;
import n6.d;
import n6.c;
import n6.b;
import n6.w;
import n6.v;
import n6.u;
import n6.s;
import n6.r;
import n6.q;
import n6.p;
import n6.l;
import n6.a;
import java.io.Serializable;
import kotlin.t;

@Deprecated
@kotlin.i(level = kotlin.k.H, message = "This class is no longer supported, do not use it.")
public abstract class e0 implements t, Serializable, a, l, p, q, r, s, n6.t, u, v, w, b, c, d, e, f, g, h, i, j, k, m, n, o
{
    private void a(final int n) {
        if (this.getArity() != n) {
            this.c(n);
        }
    }
    
    private void c(final int i) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Wrong function arity, expected: ");
        sb.append(i);
        sb.append(", actual: ");
        sb.append(this.getArity());
        throw new IllegalStateException(sb.toString());
    }
    
    @Override
    public Object C(final Object o, final Object o2, final Object o3, final Object o4, final Object o5, final Object o6, final Object o7, final Object o8, final Object o9, final Object o10, final Object o11, final Object o12, final Object o13, final Object o14, final Object o15, final Object o16, final Object o17, final Object o18, final Object o19) {
        this.a(19);
        return this.b(o, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19);
    }
    
    @Override
    public Object G(final Object o, final Object o2, final Object o3, final Object o4, final Object o5, final Object o6, final Object o7, final Object o8, final Object o9, final Object o10, final Object o11, final Object o12, final Object o13, final Object o14, final Object o15, final Object o16) {
        this.a(16);
        return this.b(o, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16);
    }
    
    @Override
    public Object I(final Object o, final Object o2, final Object o3, final Object o4) {
        this.a(4);
        return this.b(o, o2, o3, o4);
    }
    
    @Override
    public Object K(final Object o, final Object o2, final Object o3, final Object o4, final Object o5, final Object o6, final Object o7, final Object o8) {
        this.a(8);
        return this.b(o, o2, o3, o4, o5, o6, o7, o8);
    }
    
    @Override
    public Object L(final Object o, final Object o2, final Object o3, final Object o4, final Object o5, final Object o6, final Object o7, final Object o8, final Object o9, final Object o10, final Object o11, final Object o12, final Object o13, final Object o14, final Object o15, final Object o16, final Object o17, final Object o18, final Object o19, final Object o20) {
        this.a(20);
        return this.b(o, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20);
    }
    
    @Override
    public Object N(final Object o, final Object o2, final Object o3, final Object o4, final Object o5, final Object o6, final Object o7, final Object o8, final Object o9, final Object o10, final Object o11, final Object o12, final Object o13, final Object o14, final Object o15, final Object o16, final Object o17, final Object o18, final Object o19, final Object o20, final Object o21, final Object o22) {
        this.a(22);
        return this.b(o, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21, o22);
    }
    
    @Override
    public Object O(final Object o, final Object o2, final Object o3, final Object o4, final Object o5, final Object o6, final Object o7, final Object o8, final Object o9, final Object o10, final Object o11, final Object o12, final Object o13) {
        this.a(13);
        return this.b(o, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13);
    }
    
    @Override
    public Object P(final Object o, final Object o2, final Object o3, final Object o4, final Object o5, final Object o6) {
        this.a(6);
        return this.b(o, o2, o3, o4, o5, o6);
    }
    
    @Override
    public Object Q(final Object o, final Object o2, final Object o3, final Object o4, final Object o5, final Object o6, final Object o7, final Object o8, final Object o9, final Object o10, final Object o11, final Object o12, final Object o13, final Object o14) {
        this.a(14);
        return this.b(o, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14);
    }
    
    @Override
    public Object R(final Object o, final Object o2, final Object o3, final Object o4, final Object o5, final Object o6, final Object o7, final Object o8, final Object o9, final Object o10, final Object o11, final Object o12, final Object o13, final Object o14, final Object o15, final Object o16, final Object o17) {
        this.a(17);
        return this.b(o, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17);
    }
    
    @Override
    public Object T(final Object o, final Object o2, final Object o3, final Object o4, final Object o5, final Object o6, final Object o7, final Object o8, final Object o9) {
        this.a(9);
        return this.b(o, o2, o3, o4, o5, o6, o7, o8, o9);
    }
    
    @Override
    public Object U(final Object o, final Object o2, final Object o3, final Object o4, final Object o5) {
        this.a(5);
        return this.b(o, o2, o3, o4, o5);
    }
    
    @Override
    public Object V(final Object o, final Object o2, final Object o3, final Object o4, final Object o5, final Object o6, final Object o7, final Object o8, final Object o9, final Object o10, final Object o11, final Object o12, final Object o13, final Object o14, final Object o15, final Object o16, final Object o17, final Object o18, final Object o19, final Object o20, final Object o21) {
        this.a(21);
        return this.b(o, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18, o19, o20, o21);
    }
    
    @Override
    public Object Y(final Object o, final Object o2, final Object o3, final Object o4, final Object o5, final Object o6, final Object o7) {
        this.a(7);
        return this.b(o, o2, o3, o4, o5, o6, o7);
    }
    
    @Override
    public Object a0(final Object o, final Object o2, final Object o3, final Object o4, final Object o5, final Object o6, final Object o7, final Object o8, final Object o9, final Object o10) {
        this.a(10);
        return this.b(o, o2, o3, o4, o5, o6, o7, o8, o9, o10);
    }
    
    public Object b(final Object... array) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public Object e0(final Object o, final Object o2, final Object o3, final Object o4, final Object o5, final Object o6, final Object o7, final Object o8, final Object o9, final Object o10, final Object o11, final Object o12, final Object o13, final Object o14, final Object o15) {
        this.a(15);
        return this.b(o, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15);
    }
    
    public abstract int getArity();
    
    @Override
    public Object invoke() {
        this.a(0);
        return this.b(new Object[0]);
    }
    
    @Override
    public Object invoke(final Object o) {
        this.a(1);
        return this.b(o);
    }
    
    @Override
    public Object invoke(final Object o, final Object o2) {
        this.a(2);
        return this.b(o, o2);
    }
    
    @Override
    public Object invoke(final Object o, final Object o2, final Object o3) {
        this.a(3);
        return this.b(o, o2, o3);
    }
    
    @Override
    public Object m(final Object o, final Object o2, final Object o3, final Object o4, final Object o5, final Object o6, final Object o7, final Object o8, final Object o9, final Object o10, final Object o11) {
        this.a(11);
        return this.b(o, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11);
    }
    
    @Override
    public Object r(final Object o, final Object o2, final Object o3, final Object o4, final Object o5, final Object o6, final Object o7, final Object o8, final Object o9, final Object o10, final Object o11, final Object o12, final Object o13, final Object o14, final Object o15, final Object o16, final Object o17, final Object o18) {
        this.a(18);
        return this.b(o, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14, o15, o16, o17, o18);
    }
    
    @Override
    public Object z(final Object o, final Object o2, final Object o3, final Object o4, final Object o5, final Object o6, final Object o7, final Object o8, final Object o9, final Object o10, final Object o11, final Object o12) {
        this.a(12);
        return this.b(o, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12);
    }
}
