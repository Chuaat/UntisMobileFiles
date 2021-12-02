// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs;

import java.util.Iterator;
import java.util.ArrayList;
import org.bson.z0;
import java.util.UUID;
import org.bson.w0;
import org.bson.p0;
import e7.a;
import org.bson.q1;
import org.bson.p1;
import org.bson.codecs.configuration.d;

public class b1 implements n0<Iterable>, l1<Iterable>
{
    private final d a;
    private final e0 b;
    private final p1 c;
    private final q1 d;
    
    public b1(final d d, final d0 d2) {
        this(d, d2, null);
    }
    
    public b1(final d d, final d0 d2, final p1 p3) {
        this(d, new e0(e7.a.e("bsonTypeClassMap", d2), d), p3, q1.J);
    }
    
    private b1(final d d, final e0 b, p1 c, final q1 d2) {
        this.a = e7.a.e("registry", d);
        this.b = b;
        if (c == null) {
            c = new p1() {
                @Override
                public Object a(final Object o) {
                    return o;
                }
            };
        }
        this.c = c;
        this.d = d2;
    }
    
    private Object j(final p0 p2, final s0 s0) {
        final org.bson.w0 o5 = p2.O5();
        if (o5 == org.bson.w0.R) {
            p2.H4();
            return null;
        }
        n0<?> n2;
        final n0<?> n0 = n2 = this.b.a(o5);
        if (o5 == org.bson.w0.M) {
            n2 = n0;
            if (p2.I5() == 16) {
                final byte a4 = p2.a4();
                if (a4 != 3) {
                    if (a4 != 4) {
                        n2 = n0;
                        return this.c.a(n2.c(p2, s0));
                    }
                    final q1 d = this.d;
                    if (d != q1.J) {
                        n2 = n0;
                        if (d != q1.H) {
                            return this.c.a(n2.c(p2, s0));
                        }
                    }
                }
                else {
                    final q1 d2 = this.d;
                    if (d2 != q1.J && d2 != q1.I) {
                        n2 = n0;
                        if (d2 != q1.K) {
                            return this.c.a(n2.c(p2, s0));
                        }
                    }
                }
                n2 = this.a.a(UUID.class);
            }
        }
        return this.c.a(n2.c(p2, s0));
    }
    
    private void k(final z0 z0, final x0 x0, final Object o) {
        if (o == null) {
            z0.T();
        }
        else {
            x0.b(this.a.a(o.getClass()), z0, o);
        }
    }
    
    @Override
    public n0<Iterable> e(final q1 q1) {
        return new b1(this.a, this.b, this.c, q1);
    }
    
    @Override
    public Class<Iterable> g() {
        return Iterable.class;
    }
    
    public Iterable h(final p0 p2, final s0 s0) {
        p2.h2();
        final ArrayList<Object> list = new ArrayList<Object>();
        while (p2.o5() != org.bson.w0.H) {
            list.add(this.j(p2, s0));
        }
        p2.P2();
        return list;
    }
    
    public void i(final z0 z0, final Iterable iterable, final x0 x0) {
        z0.R();
        final Iterator<Object> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            this.k(z0, x0, iterator.next());
        }
        z0.o();
    }
}
