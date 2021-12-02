// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs;

import org.bson.b0;
import org.bson.y;
import org.bson.y0;
import java.util.Iterator;
import java.util.UUID;
import org.bson.w0;
import java.util.ArrayList;
import org.bson.p0;
import java.util.Map;
import e7.a;
import java.util.List;
import org.bson.codecs.configuration.c;
import java.util.Arrays;
import org.bson.codecs.configuration.b;
import org.bson.q1;
import org.bson.p1;
import org.bson.codecs.configuration.d;
import org.bson.d1;

public class t0 implements o0<d1>, l1<d1>
{
    private static final String f = "_id";
    private static final d g;
    private static final d0 h;
    private final e0 a;
    private final d b;
    private final z0 c;
    private final p1 d;
    private final q1 e;
    
    static {
        g = c.c(Arrays.asList(new v1(), new h0(), new u0()));
        h = new d0();
    }
    
    public t0() {
        this(t0.g);
    }
    
    public t0(final d d) {
        this(d, t0.h);
    }
    
    public t0(final d d, final d0 d2) {
        this(d, d2, null);
    }
    
    public t0(final d d, final d0 d2, final p1 p3) {
        this(d, new e0(e7.a.e("bsonTypeClassMap", d2), d), new k1(), p3, q1.J);
    }
    
    private t0(final d d, final e0 a, final z0 c, p1 d2, final q1 e) {
        this.b = e7.a.e("registry", d);
        this.a = a;
        this.c = c;
        if (d2 == null) {
            d2 = new p1() {
                @Override
                public Object a(final Object o) {
                    return o;
                }
            };
        }
        this.d = d2;
        this.e = e;
    }
    
    private void h(final org.bson.z0 z0, final x0 x0, final Map<String, Object> map) {
        if (x0.d() && map.containsKey("_id")) {
            z0.K("_id");
            this.s(z0, x0, map.get("_id"));
        }
    }
    
    private List<Object> n(final p0 p2, final s0 s0) {
        p2.h2();
        final ArrayList<Object> list = new ArrayList<Object>();
        while (p2.o5() != org.bson.w0.H) {
            list.add(this.o(p2, s0));
        }
        p2.P2();
        return list;
    }
    
    private Object o(final p0 p2, final s0 s0) {
        final org.bson.w0 o5 = p2.O5();
        if (o5 == org.bson.w0.R) {
            p2.H4();
            return null;
        }
        if (o5 == org.bson.w0.L) {
            return this.n(p2, s0);
        }
        n0<?> n2;
        final n0<?> n0 = n2 = this.a.a(o5);
        if (o5 == org.bson.w0.M) {
            n2 = n0;
            if (p2.I5() == 16) {
                final byte a4 = p2.a4();
                if (a4 != 3) {
                    if (a4 != 4) {
                        n2 = n0;
                        return this.d.a(n2.c(p2, s0));
                    }
                    final q1 e = this.e;
                    if (e != q1.J) {
                        n2 = n0;
                        if (e != q1.H) {
                            return this.d.a(n2.c(p2, s0));
                        }
                    }
                }
                else {
                    final q1 e2 = this.e;
                    if (e2 != q1.J && e2 != q1.I) {
                        n2 = n0;
                        if (e2 != q1.K) {
                            return this.d.a(n2.c(p2, s0));
                        }
                    }
                }
                n2 = this.b.a(UUID.class);
            }
        }
        return this.d.a(n2.c(p2, s0));
    }
    
    private boolean p(final x0 x0, final String s) {
        return x0.d() && s.equals("_id");
    }
    
    private void q(final org.bson.z0 z0, final Iterable<Object> iterable, final x0 x0) {
        z0.R();
        final Iterator<Object> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            this.s(z0, x0, iterator.next());
        }
        z0.o();
    }
    
    private void r(final org.bson.z0 z0, final Map<String, Object> map, final x0 x0) {
        z0.w0();
        this.h(z0, x0, map);
        for (final Map.Entry<String, Object> entry : map.entrySet()) {
            if (this.p(x0, entry.getKey())) {
                continue;
            }
            z0.K(entry.getKey());
            this.s(z0, x0, entry.getValue());
        }
        z0.N0();
    }
    
    private void s(final org.bson.z0 z0, final x0 x0, final Object o) {
        if (o == null) {
            z0.T();
        }
        else if (o instanceof Iterable) {
            this.q(z0, (Iterable<Object>)o, x0.c());
        }
        else if (o instanceof Map) {
            this.r(z0, (Map<String, Object>)o, x0.c());
        }
        else {
            x0.b(this.b.a(o.getClass()), z0, o);
        }
    }
    
    @Override
    public n0<d1> e(final q1 q1) {
        return new t0(this.b, this.a, this.c, this.d, q1);
    }
    
    @Override
    public Class<d1> g() {
        return d1.class;
    }
    
    public d1 i(final p0 p2, final s0 s0) {
        final d1 d1 = new d1();
        p2.b4();
        while (p2.o5() != org.bson.w0.H) {
            d1.x(p2.F4(), this.o(p2, s0));
        }
        p2.K3();
        return d1;
    }
    
    public boolean j(final d1 d1) {
        return d1.containsKey("_id");
    }
    
    public void k(final org.bson.z0 z0, final d1 d1, final x0 x0) {
        this.r(z0, d1, x0);
    }
    
    public d1 l(final d1 d1) {
        if (!this.j(d1)) {
            d1.x("_id", this.c.b());
        }
        return d1;
    }
    
    public y0 m(final d1 d1) {
        if (!this.j(d1)) {
            throw new IllegalStateException("The document does not contain an _id");
        }
        final Object value = d1.get("_id");
        if (value instanceof y0) {
            return (y0)value;
        }
        final y y = new y();
        final b0 b0 = new b0(y);
        b0.w0();
        b0.K("_id");
        this.s(b0, x0.a().b(), value);
        b0.N0();
        return y.b1("_id");
    }
}
