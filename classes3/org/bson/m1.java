// 
// Decompiled by Procyon v0.5.36
// 

package org.bson;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import org.bson.codecs.r0;
import java.io.Writer;
import org.bson.json.e0;
import java.io.StringWriter;
import org.bson.json.f0;
import java.util.NoSuchElementException;
import org.bson.codecs.o;
import org.bson.codecs.s0;
import org.bson.json.w;
import org.bson.codecs.o1;
import org.bson.io.c;
import org.bson.io.f;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import org.bson.codecs.x0;
import org.bson.io.e;
import e7.a;
import org.bson.codecs.n0;

public final class m1 extends y
{
    private static final long L = 1L;
    private static final int M = 5;
    private final byte[] I;
    private final int J;
    private final int K;
    
    public <T> m1(final T t, final n0<T> n0) {
        e7.a.e("document", t);
        e7.a.e("codec", n0);
        final org.bson.io.a a = new org.bson.io.a();
        final r r = new r(a);
        try {
            n0.a(r, t, x0.a().b());
            this.I = a.n();
            this.J = 0;
            this.K = a.getPosition();
        }
        finally {
            r.close();
        }
    }
    
    public m1(final byte[] array) {
        this(e7.a.e("bytes", array), 0, array.length);
    }
    
    public m1(final byte[] i, final int j, final int k) {
        e7.a.e("bytes", i);
        final boolean b = true;
        e7.a.d("offset >= 0", j >= 0);
        e7.a.d("offset < bytes.length", j < i.length);
        e7.a.d("length <= bytes.length - offset", k <= i.length - j);
        e7.a.d("length >= 5", k >= 5 && b);
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    private void D2(final ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Proxy required");
    }
    
    private Object J2() {
        return new a(this.I, this.J, this.K);
    }
    
    private p L2() {
        return new p(new f(this.Q2()));
    }
    
    public static m1 R2(final String s) {
        e7.a.e("json", s);
        return new o1().e(new w(s), s0.a().a());
    }
    
    private y T2() {
        final p l2 = this.L2();
        try {
            return new o().h(l2, s0.a().a());
        }
        finally {
            l2.close();
        }
    }
    
    @Override
    public String C1() {
        final p l2 = this.L2();
        try {
            l2.b4();
            try {
                return l2.F4();
            }
            catch (g0 g0) {
                throw new NoSuchElementException();
            }
        }
        finally {
            l2.close();
        }
    }
    
    @Override
    public y0 C2(final String s, final y0 y0) {
        throw new UnsupportedOperationException("RawBsonDocument instances are immutable");
    }
    
    @Override
    public y0 E2(final Object o) {
        throw new UnsupportedOperationException("RawBsonDocument instances are immutable");
    }
    
    @Override
    public String H2() {
        return this.I2(new f0());
    }
    
    @Override
    public String I2(final f0 f0) {
        final StringWriter stringWriter = new StringWriter();
        new o1().h(new e0(stringWriter, f0), this, x0.a().b());
        return stringWriter.toString();
    }
    
    public <T> T M2(final n0<T> n0) {
        return this.P2(n0);
    }
    
    public <T> T P2(final r0<T> r0) {
        final p l2 = this.L2();
        try {
            return r0.c(l2, s0.a().a());
        }
        finally {
            l2.close();
        }
    }
    
    public b1 Q2() {
        final ByteBuffer wrap = ByteBuffer.wrap(this.I, this.J, this.K);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return new c1(wrap);
    }
    
    @Override
    public y X0(final String s, final y0 y0) {
        throw new UnsupportedOperationException("RawBsonDocument instances are immutable");
    }
    
    @Override
    public y Z0() {
        return new m1(this.I.clone(), this.J, this.K);
    }
    
    @Override
    public y0 b1(final Object anObject) {
        e7.a.e("key", anObject);
        final p l2 = this.L2();
        try {
            l2.b4();
            while (l2.o5() != w0.H) {
                if (l2.F4().equals(anObject)) {
                    return n1.a(this.I, l2);
                }
                l2.skipValue();
            }
            l2.K3();
            return null;
        }
        finally {
            l2.close();
        }
    }
    
    @Override
    public void clear() {
        throw new UnsupportedOperationException("RawBsonDocument instances are immutable");
    }
    
    @Override
    public boolean containsKey(final Object anObject) {
        if (anObject != null) {
            final p l2 = this.L2();
            try {
                l2.b4();
                while (l2.o5() != w0.H) {
                    if (l2.F4().equals(anObject)) {
                        return true;
                    }
                    l2.skipValue();
                }
                l2.K3();
                return false;
            }
            finally {
                l2.close();
            }
        }
        throw new IllegalArgumentException("key can not be null");
    }
    
    @Override
    public boolean containsValue(final Object obj) {
        final p l2 = this.L2();
        try {
            l2.b4();
            while (l2.o5() != w0.H) {
                l2.C1();
                if (n1.a(this.I, l2).equals(obj)) {
                    return true;
                }
            }
            l2.K3();
            return false;
        }
        finally {
            l2.close();
        }
    }
    
    @Override
    public Set<Entry<String, y0>> entrySet() {
        return this.T2().entrySet();
    }
    
    @Override
    public boolean equals(final Object o) {
        return this.T2().equals(o);
    }
    
    @Override
    public int hashCode() {
        return this.T2().hashCode();
    }
    
    @Override
    public boolean isEmpty() {
        final p l2 = this.L2();
        try {
            l2.b4();
            if (l2.o5() != w0.H) {
                return false;
            }
            l2.K3();
            return true;
        }
        finally {
            l2.close();
        }
    }
    
    @Override
    public Set<String> keySet() {
        return this.T2().keySet();
    }
    
    @Override
    public void putAll(final Map<? extends String, ? extends y0> map) {
        throw new UnsupportedOperationException("RawBsonDocument instances are immutable");
    }
    
    @Override
    public int size() {
        final p l2 = this.L2();
        try {
            l2.b4();
            int n = 0;
            while (l2.o5() != w0.H) {
                ++n;
                l2.F4();
                l2.skipValue();
            }
            l2.K3();
            return n;
        }
        finally {
            l2.close();
        }
    }
    
    @Override
    public Collection<y0> values() {
        return this.T2().values();
    }
    
    private static class a implements Serializable
    {
        private static final long H = 1L;
        private final byte[] G;
        
        a(final byte[] g, final int n, final int n2) {
            if (g.length == n2) {
                this.G = g;
            }
            else {
                System.arraycopy(g, n, this.G = new byte[n2], 0, n2);
            }
        }
        
        private Object a() {
            return new m1(this.G);
        }
    }
}
