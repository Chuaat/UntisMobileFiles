// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs;

import java.util.Iterator;
import java.util.HashMap;
import org.bson.z0;
import java.util.UUID;
import org.bson.w0;
import org.bson.p0;
import e7.a;
import java.util.List;
import org.bson.codecs.configuration.c;
import java.util.Arrays;
import org.bson.codecs.configuration.b;
import org.bson.q1;
import org.bson.p1;
import org.bson.codecs.configuration.d;
import java.util.Map;

public class e1 implements n0<Map<String, Object>>, l1<Map<String, Object>>
{
    private static final d e;
    private static final d0 f;
    private final e0 a;
    private final d b;
    private final p1 c;
    private final q1 d;
    
    static {
        e = c.c(Arrays.asList(new v1(), new h0(), new u0(), new c1(), new f1()));
        f = new d0();
    }
    
    public e1() {
        this(e1.e);
    }
    
    public e1(final d d) {
        this(d, e1.f);
    }
    
    public e1(final d d, final d0 d2) {
        this(d, d2, null);
    }
    
    public e1(final d d, final d0 d2, final p1 p3) {
        this(d, new e0(e7.a.e("bsonTypeClassMap", d2), d), p3, q1.J);
    }
    
    private e1(final d d, final e0 a, p1 c, final q1 d2) {
        this.b = e7.a.e("registry", d);
        this.a = a;
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
        if (o5 == org.bson.w0.L) {
            return s0.b(this.b.a(List.class), p2);
        }
        if (o5 == org.bson.w0.M && p2.I5() == 16) {
            n0<?> n0 = this.a.a(o5);
            final byte a4 = p2.a4();
            if (a4 != 3) {
                if (a4 != 4) {
                    return s0.b(n0, p2);
                }
                final q1 d = this.d;
                if (d != q1.J) {
                    if (d != q1.H) {
                        return s0.b(n0, p2);
                    }
                }
            }
            else {
                final q1 d2 = this.d;
                if (d2 != q1.J && d2 != q1.I && d2 != q1.K) {
                    return s0.b(n0, p2);
                }
            }
            n0 = this.b.a(UUID.class);
            return s0.b(n0, p2);
        }
        return this.c.a(this.a.a(o5).c(p2, s0));
    }
    
    private void k(final z0 z0, final x0 x0, final Object o) {
        if (o == null) {
            z0.T();
        }
        else {
            x0.b(this.b.a(o.getClass()), z0, o);
        }
    }
    
    @Override
    public n0<Map<String, Object>> e(final q1 q1) {
        return new e1(this.b, this.a, this.c, q1);
    }
    
    @Override
    public Class<Map<String, Object>> g() {
        return (Class<Map<String, Object>>)Map.class;
    }
    
    public Map<String, Object> h(final p0 p2, final s0 s0) {
        final HashMap<String, Object> hashMap = new HashMap<String, Object>();
        p2.b4();
        while (p2.o5() != org.bson.w0.H) {
            hashMap.put(p2.F4(), this.j(p2, s0));
        }
        p2.K3();
        return hashMap;
    }
    
    public void i(final z0 z0, final Map<String, Object> map, final x0 x0) {
        z0.w0();
        for (final Map.Entry<String, Object> entry : map.entrySet()) {
            z0.K(entry.getKey());
            this.k(z0, x0, entry.getValue());
        }
        z0.N0();
    }
}
