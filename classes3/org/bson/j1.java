// 
// Decompiled by Procyon v0.5.36
// 

package org.bson;

import org.bson.codecs.s0;
import org.bson.codecs.s1;
import java.util.Date;
import java.util.regex.Pattern;
import org.bson.types.d;
import org.bson.types.j;
import org.bson.types.e;
import org.bson.types.a;
import org.bson.types.h;
import org.bson.types.g;
import java.io.IOException;
import java.nio.channels.Channels;
import java.io.OutputStream;
import org.bson.io.c;
import org.bson.io.f;
import java.util.LinkedHashSet;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;

public class j1 implements i
{
    private final byte[] G;
    private final int H;
    private final g1 I;
    
    public j1(final byte[] g, final int h, final g1 i) {
        this.G = g;
        this.I = i;
        this.H = h;
    }
    
    public j1(final byte[] array, final g1 g1) {
        this(array, 0, g1);
    }
    
    private ByteBuffer m() {
        final byte[] g = this.G;
        final int h = this.H;
        final ByteBuffer slice = ByteBuffer.wrap(g, h, g.length - h).slice();
        slice.order(ByteOrder.LITTLE_ENDIAN);
        slice.limit(slice.getInt());
        slice.rewind();
        return slice;
    }
    
    private Object v(final p p) {
        final int position = p.s0().getPosition();
        p.skipValue();
        return this.I.C(this.G, this.H + position);
    }
    
    private Object w(final p p) {
        final int position = p.s0().getPosition();
        p.skipValue();
        return this.I.E(this.G, this.H + position);
    }
    
    private Object x(final p p) {
        final int position = p.s0().getPosition();
        p.b4();
        while (p.o5() != w0.H) {
            p.C1();
            p.skipValue();
        }
        p.K3();
        return this.I.E(this.G, this.H + position);
    }
    
    @Override
    public Object b(final String s, final Object o) {
        throw new UnsupportedOperationException("Object is read only");
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (this.getClass() == o.getClass()) {
                final j1 j1 = (j1)o;
                final byte[] g = this.G;
                final byte[] g2 = j1.G;
                if (g == g2 && this.H == j1.H) {
                    return true;
                }
                if (g != null) {
                    if (g2 != null) {
                        if (g.length != 0) {
                            if (g2.length != 0) {
                                final byte b = g[this.H];
                                if (g2[j1.H] != b) {
                                    return false;
                                }
                                for (byte b2 = 0; b2 < b; ++b2) {
                                    if (this.G[this.H + b2] != j1.G[j1.H + b2]) {
                                        return false;
                                    }
                                }
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public boolean f(final String anObject) {
        final p l = this.l();
        try {
            l.b4();
            while (l.o5() != w0.H) {
                if (l.F4().equals(anObject)) {
                    return true;
                }
                l.skipValue();
            }
            return false;
        }
        finally {
            l.close();
        }
    }
    
    public Set<Map.Entry<String, Object>> h() {
        final ArrayList<AbstractMap.SimpleImmutableEntry<String, Object>> list = new ArrayList<AbstractMap.SimpleImmutableEntry<String, Object>>();
        final p l = this.l();
        try {
            l.b4();
            while (l.o5() != w0.H) {
                list.add(new AbstractMap.SimpleImmutableEntry<String, Object>(l.F4(), this.z(l)));
            }
            l.K3();
            l.close();
            return new Set<Map.Entry<String, Object>>() {
                @Override
                public boolean addAll(final Collection<? extends Map.Entry<String, Object>> collection) {
                    throw new UnsupportedOperationException();
                }
                
                public boolean b(final Map.Entry<String, Object> entry) {
                    throw new UnsupportedOperationException();
                }
                
                @Override
                public void clear() {
                    throw new UnsupportedOperationException();
                }
                
                @Override
                public boolean contains(final Object o) {
                    return list.contains(o);
                }
                
                @Override
                public boolean containsAll(final Collection<?> collection) {
                    return list.containsAll(collection);
                }
                
                @Override
                public boolean isEmpty() {
                    return list.isEmpty();
                }
                
                @Override
                public Iterator<Map.Entry<String, Object>> iterator() {
                    return list.iterator();
                }
                
                @Override
                public boolean remove(final Object o) {
                    throw new UnsupportedOperationException();
                }
                
                @Override
                public boolean removeAll(final Collection<?> collection) {
                    throw new UnsupportedOperationException();
                }
                
                @Override
                public boolean retainAll(final Collection<?> collection) {
                    throw new UnsupportedOperationException();
                }
                
                @Override
                public int size() {
                    return list.size();
                }
                
                @Override
                public Object[] toArray() {
                    return list.toArray();
                }
                
                @Override
                public <T> T[] toArray(final T[] array) {
                    return list.toArray(array);
                }
            };
        }
        finally {
            l.close();
        }
    }
    
    @Override
    public int hashCode() {
        final int k = this.k();
        int i = this.H;
        int n = 1;
        while (i < this.H + k) {
            n = n * 31 + this.G[i];
            ++i;
        }
        return n;
    }
    
    @Override
    public Map i() {
        final LinkedHashMap<Object, Object> m = new LinkedHashMap<Object, Object>();
        for (final Map.Entry<Object, V> entry : this.h()) {
            m.put(entry.getKey(), entry.getValue());
        }
        return Collections.unmodifiableMap((Map<?, ?>)m);
    }
    
    public boolean isEmpty() {
        return this.keySet().size() == 0;
    }
    
    @Override
    public Object j(final String s) {
        final p l = this.l();
        try {
            l.b4();
            final Object o = null;
            Object z;
            while (true) {
                z = o;
                if (l.o5() == w0.H) {
                    break;
                }
                if (s.equals(l.F4())) {
                    z = this.z(l);
                    break;
                }
                l.skipValue();
            }
            return z;
        }
        finally {
            l.close();
        }
    }
    
    public int k() {
        return this.m().getInt();
    }
    
    @Override
    public Set<String> keySet() {
        final LinkedHashSet<String> s = new LinkedHashSet<String>();
        final p l = this.l();
        try {
            l.b4();
            while (l.o5() != w0.H) {
                s.add(l.F4());
                l.skipValue();
            }
            l.K3();
            l.close();
            return (Set<String>)Collections.unmodifiableSet((Set<?>)s);
        }
        finally {
            l.close();
        }
    }
    
    p l() {
        return new p(new f(new c1(this.m())));
    }
    
    @Override
    public void n(final i i) {
        throw new UnsupportedOperationException("Object is read only");
    }
    
    protected byte[] o() {
        return this.G;
    }
    
    protected int p() {
        return this.H;
    }
    
    @Override
    public void putAll(final Map map) {
        throw new UnsupportedOperationException("Object is read only");
    }
    
    @Deprecated
    @Override
    public boolean q(final String s) {
        return this.f(s);
    }
    
    @Override
    public Object r(final String s) {
        throw new UnsupportedOperationException("Object is read only");
    }
    
    public int t(final OutputStream out) throws IOException {
        return Channels.newChannel(out).write(this.m());
    }
    
    Object z(final p p) {
        switch (j1$b.a[p.O5().ordinal()]) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append("unhandled BSON type: ");
                sb.append(p.O5());
                throw new IllegalArgumentException(sb.toString());
            }
            case 21: {
                p.J2();
                return new g();
            }
            case 20: {
                p.X0();
                return new h();
            }
            case 19: {
                return p.q0();
            }
            case 18: {
                return p.k0();
            }
            case 17: {
                final v0 r0 = p.R0();
                return new a(r0.Z0(), r0.Y0());
            }
            case 16: {
                return p.b0();
            }
            case 15: {
                return new e(p.F2(), (i)this.x(p));
            }
            case 14: {
                return new j(p.m1());
            }
            case 13: {
                return new d(p.H3());
            }
            case 12: {
                final w o0 = p.O0();
                return this.I.D(o0.Y0(), o0.X0());
            }
            case 11: {
                final r0 c4 = p.C4();
                return Pattern.compile(c4.Y0(), org.bson.c.o(c4.X0()));
            }
            case 10: {
                return new Date(p.U1());
            }
            case 9: {
                return p.readBoolean();
            }
            case 8: {
                return p.E();
            }
            case 7: {
                p.W3();
                return null;
            }
            case 6: {
                p.H4();
                return null;
            }
            case 5: {
                final byte a4 = p.a4();
                if (q.d(a4) && p.I5() == 16) {
                    return new s1(q1.J).h(p, s0.a().a());
                }
                final o o2 = p.o0();
                if (a4 != q.H.b() && a4 != q.J.b()) {
                    return new org.bson.types.c(o2.c1(), o2.b1());
                }
                return o2.b1();
            }
            case 4: {
                return p.U();
            }
            case 3: {
                return p.readDouble();
            }
            case 2: {
                return this.v(p);
            }
            case 1: {
                return this.w(p);
            }
        }
    }
}
