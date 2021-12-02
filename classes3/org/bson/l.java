// 
// Decompiled by Procyon v0.5.36
// 

package org.bson;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.reflect.Array;
import org.bson.types.h;
import java.util.Map;
import java.util.regex.Pattern;
import org.bson.types.ObjectId;
import org.bson.types.Decimal128;
import java.util.Date;
import org.bson.types.d;
import org.bson.io.e;
import java.util.Iterator;
import java.util.UUID;
import org.bson.types.a;
import org.bson.types.j;

public class l implements g
{
    private r a;
    private org.bson.io.g b;
    
    private static void G(final byte[] array, final int n, final long n2) {
        array[n] = (byte)(n2 & 0xFFL);
        array[n + 1] = (byte)(n2 >> 8 & 0xFFL);
        array[n + 2] = (byte)(n2 >> 16 & 0xFFL);
        array[n + 3] = (byte)(n2 >> 24 & 0xFFL);
        array[n + 4] = (byte)(n2 >> 32 & 0xFFL);
        array[n + 5] = (byte)(n2 >> 40 & 0xFFL);
        array[n + 6] = (byte)(n2 >> 48 & 0xFFL);
        array[n + 7] = (byte)(n2 >> 56 & 0xFFL);
    }
    
    private boolean h() {
        return this.a.K2().i() == null;
    }
    
    protected boolean A(final String s, final Object o) {
        return false;
    }
    
    protected void B(final String s, final String s2) {
        this.u(s);
        this.a.i(s2);
    }
    
    protected void C(final String s, final j j) {
        this.u(s);
        this.a.f0(j.a());
    }
    
    protected void D(final String s, final a a) {
        this.u(s);
        this.a.p0(new v0(a.f(), a.d()));
    }
    
    protected void E(final String s, final UUID uuid) {
        this.u(s);
        final byte[] array = new byte[16];
        G(array, 0, uuid.getMostSignificantBits());
        G(array, 8, uuid.getLeastSignificantBits());
        this.a.X(new o(q.K, array));
    }
    
    protected void F(final String s) {
        this.u(s);
        this.a.e1();
    }
    
    @Override
    public void a() {
        this.a.close();
        this.a = null;
    }
    
    @Override
    public int b(final i i) {
        final int position = this.g().getPosition();
        this.a.w0();
        if (this.h() && i.f("_id")) {
            this.e("_id", i.j("_id"));
        }
        for (final String s : i.keySet()) {
            if (this.h() && s.equals("_id")) {
                continue;
            }
            this.e(s, i.j(s));
        }
        this.a.N0();
        return this.g().getPosition() - position;
    }
    
    @Override
    public byte[] c(final i i) {
        final org.bson.io.a a = new org.bson.io.a();
        this.d(a);
        this.b(i);
        this.a();
        return a.d();
    }
    
    @Override
    public void d(final org.bson.io.g b) {
        if (this.a == null) {
            this.b = b;
            this.a = new r(b);
            return;
        }
        throw new IllegalStateException("Performing another operation at this moment");
    }
    
    protected void e(final String str, Object d) {
        if ("_transientFields".equals(str)) {
            return;
        }
        if (!str.contains("\u0000")) {
            if ("$where".equals(str) && d instanceof String) {
                this.m(str, new d((String)d));
            }
            d = c.d(d);
            if (d == null) {
                this.v(str);
            }
            else if (d instanceof Date) {
                this.o(str, (Date)d);
            }
            else if (d instanceof Decimal128) {
                this.p(str, (Decimal128)d);
            }
            else if (d instanceof Number) {
                this.w(str, (Number)d);
            }
            else if (!(d instanceof Character) && !(d instanceof String)) {
                if (d instanceof ObjectId) {
                    this.y(str, (ObjectId)d);
                }
                else if (d instanceof Boolean) {
                    this.l(str, (Boolean)d);
                }
                else if (d instanceof Pattern) {
                    this.z(str, (Pattern)d);
                }
                else if (d instanceof Iterable) {
                    this.q(str, (Iterable)d);
                }
                else if (d instanceof i) {
                    this.x(str, (i)d);
                }
                else if (d instanceof Map) {
                    this.r(str, (Map)d);
                }
                else if (d instanceof byte[]) {
                    this.k(str, (byte[])d);
                }
                else if (d instanceof org.bson.types.c) {
                    this.j(str, (org.bson.types.c)d);
                }
                else if (d instanceof UUID) {
                    this.E(str, (UUID)d);
                }
                else if (d.getClass().isArray()) {
                    this.i(str, d);
                }
                else if (d instanceof j) {
                    this.C(str, (j)d);
                }
                else if (d instanceof a) {
                    this.D(str, (a)d);
                }
                else if (d instanceof org.bson.types.e) {
                    this.n(str, (org.bson.types.e)d);
                }
                else if (d instanceof d) {
                    this.m(str, (d)d);
                }
                else if (d instanceof h) {
                    this.t(str);
                }
                else if (d instanceof org.bson.types.g) {
                    this.s(str);
                }
                else if (!this.A(str, d)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Can't serialize ");
                    sb.append(d.getClass());
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            else {
                this.B(str, d.toString());
            }
            return;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Document field names can't have a NULL character. (Bad Key: '");
        sb2.append(str);
        sb2.append("')");
        throw new IllegalArgumentException(sb2.toString());
    }
    
    protected r f() {
        return this.a;
    }
    
    protected org.bson.io.g g() {
        return this.b;
    }
    
    protected void i(String s, final Object o) {
        this.u(s);
        this.a.R();
        final boolean b = o instanceof int[];
        final int n = 0;
        final int n2 = 0;
        final int n3 = 0;
        final int n4 = 0;
        final int n5 = 0;
        final int n6 = 0;
        final int n7 = 0;
        final int n8 = 0;
        int i = 0;
        if (b) {
            for (int[] array = (int[])o; i < array.length; ++i) {
                this.a.l(array[i]);
            }
        }
        else if (o instanceof long[]) {
            final long[] array2 = (long[])o;
            for (int length = array2.length, j = n; j < length; ++j) {
                this.a.I(array2[j]);
            }
        }
        else if (o instanceof float[]) {
            final float[] array3 = (float[])o;
            for (int length2 = array3.length, k = n2; k < length2; ++k) {
                this.a.P(array3[k]);
            }
        }
        else if (o instanceof short[]) {
            final short[] array4 = (short[])o;
            for (int length3 = array4.length, l = n3; l < length3; ++l) {
                this.a.l(array4[l]);
            }
        }
        else if (o instanceof byte[]) {
            final byte[] array5 = (byte[])o;
            for (int length4 = array5.length, n9 = n4; n9 < length4; ++n9) {
                this.a.l(array5[n9]);
            }
        }
        else if (o instanceof double[]) {
            final double[] array6 = (double[])o;
            for (int length5 = array6.length, n10 = n5; n10 < length5; ++n10) {
                this.a.P(array6[n10]);
            }
        }
        else if (o instanceof boolean[]) {
            final boolean[] array7 = (boolean[])o;
            for (int length6 = array7.length, n11 = n6; n11 < length6; ++n11) {
                this.a.Q(array7[n11]);
            }
        }
        else if (o instanceof String[]) {
            final String[] array8 = (String[])o;
            for (int length7 = array8.length, n12 = n7; n12 < length7; ++n12) {
                s = array8[n12];
                this.a.i(s);
            }
        }
        else {
            for (int length8 = Array.getLength(o), m = n8; m < length8; ++m) {
                this.e(String.valueOf(m), Array.get(o, m));
            }
        }
        this.a.o();
    }
    
    protected void j(final String s, final org.bson.types.c c) {
        this.u(s);
        this.a.X(new o(c.b(), c.a()));
    }
    
    protected void k(final String s, final byte[] array) {
        this.u(s);
        this.a.X(new o(array));
    }
    
    protected void l(final String s, final Boolean b) {
        this.u(s);
        this.a.Q(b);
    }
    
    protected void m(final String s, final d d) {
        this.u(s);
        this.a.y0(d.a());
    }
    
    protected void n(final String s, final org.bson.types.e e) {
        this.u(s);
        this.a.d1(e.a());
        this.b(e.b());
    }
    
    protected void o(final String s, final Date date) {
        this.u(s);
        this.a.D0(date.getTime());
    }
    
    protected void p(final String s, final Decimal128 decimal128) {
        this.u(s);
        this.a.g1(decimal128);
    }
    
    protected void q(final String s, final Iterable iterable) {
        this.u(s);
        this.a.R();
        final Iterator<Object> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            this.e(String.valueOf(0), iterator.next());
        }
        this.a.o();
    }
    
    protected void r(final String s, final Map map) {
        this.u(s);
        this.a.w0();
        for (final Map.Entry<String, V> entry : map.entrySet()) {
            this.e(entry.getKey(), entry.getValue());
        }
        this.a.N0();
    }
    
    protected void s(final String s) {
        this.u(s);
        this.a.W();
    }
    
    protected void t(final String s) {
        this.u(s);
        this.a.m0();
    }
    
    protected void u(final String s) {
        if (this.a.G1() == org.bson.b.d.H) {
            this.a.K(s);
        }
    }
    
    protected void v(final String s) {
        this.u(s);
        this.a.T();
    }
    
    protected void w(final String s, final Number n) {
        this.u(s);
        if (!(n instanceof Integer) && !(n instanceof Short) && !(n instanceof Byte) && !(n instanceof AtomicInteger)) {
            if (!(n instanceof Long) && !(n instanceof AtomicLong)) {
                if (!(n instanceof Float) && !(n instanceof Double)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Can't serialize ");
                    sb.append(n.getClass());
                    throw new IllegalArgumentException(sb.toString());
                }
                this.a.P(n.doubleValue());
            }
            else {
                this.a.I(n.longValue());
            }
        }
        else {
            this.a.l(n.intValue());
        }
    }
    
    protected int x(final String s, final i i) {
        this.u(s);
        return this.b(i);
    }
    
    protected void y(final String s, final ObjectId objectId) {
        this.u(s);
        this.a.B(objectId);
    }
    
    protected void z(final String s, final Pattern pattern) {
        this.u(s);
        this.a.Y(new r0(pattern.pattern(), c.p(pattern.flags())));
    }
}
