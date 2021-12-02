// 
// Decompiled by Procyon v0.5.36
// 

package org.bson;

import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import org.bson.io.e;
import java.util.Collection;
import java.util.Set;
import org.bson.codecs.configuration.d;
import org.bson.codecs.x0;
import java.io.Writer;
import java.io.StringWriter;
import org.bson.json.f0;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import org.bson.codecs.s0;
import org.bson.json.w;
import org.bson.codecs.o;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedHashMap;
import java.io.Serializable;
import g7.a;
import java.util.Map;

public class y extends y0 implements Map<String, y0>, Cloneable, a, Serializable
{
    private static final long H = 1L;
    private final Map<String, y0> G;
    
    public y() {
        this.G = new LinkedHashMap<String, y0>();
    }
    
    public y(final String s, final y0 y0) {
        this.G = new LinkedHashMap<String, y0>();
        this.C2(s, y0);
    }
    
    public y(final List<d0> list) {
        this.G = new LinkedHashMap<String, y0>();
        for (final d0 d0 : list) {
            this.C2(d0.a(), d0.b());
        }
    }
    
    public static y B2(final String s) {
        return new o().h(new w(s), s0.a().a());
    }
    
    private void D2(final ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Proxy required");
    }
    
    private void F2(final Object obj) {
        if (this.containsKey(obj)) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Document does not contain key ");
        sb.append(obj);
        throw new g0(sb.toString());
    }
    
    private Object J2() {
        return new b(this);
    }
    
    public c0 A1(final Object o, final c0 c0) {
        if (!this.containsKey(o)) {
            return c0;
        }
        return this.b1(o).O();
    }
    
    public String C1() {
        return this.keySet().iterator().next();
    }
    
    public y0 C2(final String s, final y0 y0) {
        if (y0 == null) {
            throw new IllegalArgumentException(String.format("The value for key %s can not be null", s));
        }
        if (!s.contains("\u0000")) {
            return this.G.put(s, y0);
        }
        throw new h(String.format("BSON cstring '%s' is not valid because it contains a null character at index %d", s, s.indexOf(0)));
    }
    
    public e0 D1(final Object o) {
        this.F2(o);
        return this.b1(o).P();
    }
    
    public y0 E2(final Object o) {
        return this.G.remove(o);
    }
    
    public String H2() {
        return this.I2(new f0());
    }
    
    public e0 I1(final Object o, final e0 e0) {
        if (!this.containsKey(o)) {
            return e0;
        }
        return this.b1(o).P();
    }
    
    public String I2(final f0 f0) {
        final StringWriter stringWriter = new StringWriter();
        new o().j(new org.bson.json.e0(stringWriter, f0), this, x0.a().b());
        return stringWriter.toString();
    }
    
    public org.bson.f0 K1(final Object o) {
        this.F2(o);
        return this.b1(o).U();
    }
    
    public org.bson.f0 N1(final Object o, final org.bson.f0 f0) {
        if (!this.containsKey(o)) {
            return f0;
        }
        return this.b1(o).U();
    }
    
    public n0 R1(final Object o) {
        this.F2(o);
        return this.b1(o).k0();
    }
    
    public n0 S1(final Object o, final n0 n0) {
        if (!this.containsKey(o)) {
            return n0;
        }
        return this.b1(o).k0();
    }
    
    public o0 T1(final Object o) {
        this.F2(o);
        return this.b1(o).l0();
    }
    
    public o0 U1(final Object o, final o0 o2) {
        if (!this.containsKey(o)) {
            return o2;
        }
        return this.b1(o).l0();
    }
    
    public r0 V1(final Object o) {
        this.F2(o);
        return this.b1(o).n0();
    }
    
    public r0 W1(final Object o, final r0 r0) {
        if (!this.containsKey(o)) {
            return r0;
        }
        return this.b1(o).n0();
    }
    
    public y X0(final String s, final y0 y0) {
        this.C2(s, y0);
        return this;
    }
    
    public t0 X1(final Object o) {
        this.F2(o);
        return this.b1(o).o0();
    }
    
    public p0 Y0() {
        return new z(this);
    }
    
    public t0 Y1(final Object o, final t0 t0) {
        if (!this.containsKey(o)) {
            return t0;
        }
        return this.b1(o).o0();
    }
    
    public y Z0() {
        final y y = new y();
        for (final Entry<String, y0> entry : this.entrySet()) {
            final int n = y$a.a[entry.getValue().t0().ordinal()];
            String s;
            y0 y2;
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        if (n != 4) {
                            s = entry.getKey();
                            y2 = entry.getValue();
                        }
                        else {
                            s = entry.getKey();
                            y2 = i0.X0(entry.getValue().c0());
                        }
                    }
                    else {
                        s = entry.getKey();
                        y2 = org.bson.o.Z0(entry.getValue().i());
                    }
                }
                else {
                    s = entry.getKey();
                    y2 = entry.getValue().f().Z0();
                }
            }
            else {
                s = entry.getKey();
                y2 = entry.getValue().I().Z0();
            }
            y.C2(s, y2);
        }
        return y;
    }
    
    public v0 Z1(final Object o) {
        this.F2(o);
        return this.b1(o).r0();
    }
    
    public v0 a2(final Object o, final v0 v0) {
        if (!this.containsKey(o)) {
            return v0;
        }
        return this.b1(o).r0();
    }
    
    @Override
    public <C> y b(final Class<C> clazz, final d d) {
        return this;
    }
    
    public y0 b1(final Object o) {
        return this.G.get(o);
    }
    
    public boolean b2(final Object o) {
        return this.containsKey(o) && this.b1(o).u0();
    }
    
    public y0 c1(final Object o, y0 y0) {
        final y0 b1 = this.b1(o);
        if (b1 != null) {
            y0 = b1;
        }
        return y0;
    }
    
    @Override
    public void clear() {
        this.G.clear();
    }
    
    @Override
    public boolean containsKey(final Object o) {
        return this.G.containsKey(o);
    }
    
    @Override
    public boolean containsValue(final Object o) {
        return this.G.containsValue(o);
    }
    
    public boolean d2(final Object o) {
        return this.containsKey(o) && this.b1(o).v0();
    }
    
    public boolean e2(final Object o) {
        return this.containsKey(o) && this.b1(o).x0();
    }
    
    @Override
    public Set<Entry<String, y0>> entrySet() {
        return this.G.entrySet();
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof y && this.entrySet().equals(((y)o).entrySet()));
    }
    
    public boolean g2(final Object o) {
        return this.containsKey(o) && this.b1(o).A0();
    }
    
    public n h1(final Object o) {
        this.F2(o);
        return this.b1(o).f();
    }
    
    public boolean h2(final Object o) {
        return this.containsKey(o) && this.b1(o).B0();
    }
    
    @Override
    public int hashCode() {
        return this.entrySet().hashCode();
    }
    
    public n i1(final Object o, final n n) {
        if (!this.containsKey(o)) {
            return n;
        }
        return this.b1(o).f();
    }
    
    public boolean i2(final Object o) {
        return this.containsKey(o) && this.b1(o).C0();
    }
    
    @Override
    public boolean isEmpty() {
        return this.G.isEmpty();
    }
    
    public org.bson.o j1(final Object o) {
        this.F2(o);
        return this.b1(o).i();
    }
    
    @Override
    public Set<String> keySet() {
        return this.G.keySet();
    }
    
    public org.bson.o l1(final Object o, final org.bson.o o2) {
        if (!this.containsKey(o)) {
            return o2;
        }
        return this.b1(o).i();
    }
    
    public boolean l2(final Object o) {
        return this.containsKey(o) && this.b1(o).E0();
    }
    
    public t m1(final Object o) {
        this.F2(o);
        return this.b1(o).v();
    }
    
    public boolean m2(final Object o) {
        return this.containsKey(o) && this.b1(o).F0();
    }
    
    public t n1(final Object o, final t t) {
        if (!this.containsKey(o)) {
            return t;
        }
        return this.b1(o).v();
    }
    
    public boolean n2(final Object o) {
        return this.containsKey(o) && this.b1(o).I0();
    }
    
    public v o1(final Object o) {
        this.F2(o);
        return this.b1(o).B();
    }
    
    @Override
    public void putAll(final Map<? extends String, ? extends y0> map) {
        for (final Entry<String, y0> entry : map.entrySet()) {
            this.C2(entry.getKey(), entry.getValue());
        }
    }
    
    public v r1(final Object o, final v v) {
        if (!this.containsKey(o)) {
            return v;
        }
        return this.b1(o).B();
    }
    
    public x s1(final Object o) {
        this.F2(o);
        return this.b1(o).E();
    }
    
    public boolean s2(final Object o) {
        return this.containsKey(o) && this.b1(o).N0();
    }
    
    @Override
    public int size() {
        return this.G.size();
    }
    
    @Override
    public w0 t0() {
        return w0.K;
    }
    
    public boolean t2(final Object o) {
        return this.containsKey(o) && this.b1(o).O0();
    }
    
    @Override
    public String toString() {
        return this.H2();
    }
    
    public x u1(final Object o, final x x) {
        if (!this.containsKey(o)) {
            return x;
        }
        return this.b1(o).E();
    }
    
    public boolean v2(final Object o) {
        return this.containsKey(o) && this.b1(o).P0();
    }
    
    @Override
    public Collection<y0> values() {
        return this.G.values();
    }
    
    public y w1(final Object o) {
        this.F2(o);
        return this.b1(o).I();
    }
    
    public boolean w2(final Object o) {
        return this.containsKey(o) && this.b1(o).S0();
    }
    
    public y x1(final Object o, final y y) {
        if (!this.containsKey(o)) {
            return y;
        }
        return this.b1(o).I();
    }
    
    public c0 y1(final Object o) {
        this.F2(o);
        return this.b1(o).O();
    }
    
    public boolean y2(final Object o) {
        return this.containsKey(o) && this.b1(o).U0();
    }
    
    private static class b implements Serializable
    {
        private static final long H = 1L;
        private final byte[] G;
        
        b(final y y) {
            final org.bson.io.a a = new org.bson.io.a();
            new o().j(new r(a), y, x0.a().b());
            this.G = new byte[a.c()];
            final Iterator<b1> iterator = a.a().iterator();
            int n = 0;
            while (iterator.hasNext()) {
                final b1 b1 = iterator.next();
                System.arraycopy(b1.k0(), b1.i0(), this.G, n, b1.g0());
                n += b1.i0();
            }
        }
        
        private Object a() {
            return new o().h(new p(ByteBuffer.wrap(this.G).order(ByteOrder.LITTLE_ENDIAN)), s0.a().a());
        }
    }
}
