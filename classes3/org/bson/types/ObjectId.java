// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.types;

import java.util.Objects;
import e7.a;
import java.nio.ByteBuffer;
import java.util.Date;
import java.security.SecureRandom;
import java.util.concurrent.atomic.AtomicInteger;
import java.io.Serializable;

public final class ObjectId implements Comparable<ObjectId>, Serializable
{
    private static final long K = 3670079982654483072L;
    private static final int L = 12;
    private static final int M = 16777215;
    private static final int N;
    private static final short O;
    private static final AtomicInteger P;
    private static final char[] Q;
    private final int G;
    private final int H;
    private final int I;
    private final short J;
    
    static {
        P = new AtomicInteger(new SecureRandom().nextInt());
        Q = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
        try {
            final SecureRandom secureRandom = new SecureRandom();
            N = secureRandom.nextInt(16777216);
            O = (short)secureRandom.nextInt(32768);
        }
        catch (Exception cause) {
            throw new RuntimeException(cause);
        }
    }
    
    public ObjectId() {
        this(new Date());
    }
    
    public ObjectId(final int n, final int n2) {
        this(n, n2, true);
    }
    
    ObjectId(final int n, final int n2, final int n3) {
        this(G(n, n2, n3));
    }
    
    @Deprecated
    public ObjectId(final int n, final int n2, final short n3, final int n4) {
        this(n, n2, n3, n4, true);
    }
    
    private ObjectId(final int g, final int i, final short n, final int n2, final boolean b) {
        if ((i & 0xFF000000) != 0x0) {
            throw new IllegalArgumentException("The machine identifier must be between 0 and 16777215 (it must fit in three bytes).");
        }
        if (b && (n2 & 0xFF000000) != 0x0) {
            throw new IllegalArgumentException("The counter must be between 0 and 16777215 (it must fit in three bytes).");
        }
        this.G = g;
        this.H = (0xFFFFFF & n2);
        this.I = i;
        this.J = n;
    }
    
    private ObjectId(final int n, final int n2, final boolean b) {
        this(n, ObjectId.N, ObjectId.O, n2, b);
    }
    
    public ObjectId(final String s) {
        this(M(s));
    }
    
    public ObjectId(final ByteBuffer byteBuffer) {
        a.e("buffer", byteBuffer);
        a.d("buffer.remaining() >=12", byteBuffer.remaining() >= 12);
        this.G = I(byteBuffer.get(), byteBuffer.get(), byteBuffer.get(), byteBuffer.get());
        this.I = I((byte)0, byteBuffer.get(), byteBuffer.get(), byteBuffer.get());
        this.J = K(byteBuffer.get(), byteBuffer.get());
        this.H = I((byte)0, byteBuffer.get(), byteBuffer.get(), byteBuffer.get());
    }
    
    public ObjectId(final Date date) {
        this(f(date), ObjectId.P.getAndIncrement() & 0xFFFFFF, false);
    }
    
    public ObjectId(final Date date, final int n) {
        this(f(date), n, true);
    }
    
    @Deprecated
    public ObjectId(final Date date, final int n, final short n2, final int n3) {
        this(f(date), n, n2, n3);
    }
    
    public ObjectId(final byte[] array) {
        this(ByteBuffer.wrap(a.c("bytes has length of 12", array, a.e("bytes", array).length == 12)));
    }
    
    private static byte B(final int n) {
        return (byte)(n >> 24);
    }
    
    public static boolean E(final String s) {
        if (s == null) {
            throw new IllegalArgumentException();
        }
        final int length = s.length();
        if (length != 24) {
            return false;
        }
        for (int i = 0; i < length; ++i) {
            final char char1 = s.charAt(i);
            if (char1 < '0' || char1 > '9') {
                if (char1 < 'a' || char1 > 'f') {
                    if (char1 < 'A' || char1 > 'F') {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    private static byte[] G(final int n, final int n2, final int n3) {
        return new byte[] { B(n), z(n), y(n), v(n), B(n2), z(n2), y(n2), v(n2), B(n3), z(n3), y(n3), v(n3) };
    }
    
    private static int I(final byte b, final byte b2, final byte b3, final byte b4) {
        return b << 24 | (b2 & 0xFF) << 16 | (b3 & 0xFF) << 8 | (b4 & 0xFF);
    }
    
    private static short K(final byte b, final byte b2) {
        return (short)((b & 0xFF) << 8 | (b2 & 0xFF));
    }
    
    private static byte[] M(final String str) {
        if (E(str)) {
            final byte[] array = new byte[12];
            for (int i = 0; i < 12; ++i) {
                final int beginIndex = i * 2;
                array[i] = (byte)Integer.parseInt(str.substring(beginIndex, beginIndex + 2), 16);
            }
            return array;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("invalid hexadecimal representation of an ObjectId: [");
        sb.append(str);
        sb.append("]");
        throw new IllegalArgumentException(sb.toString());
    }
    
    private static byte P(final short n) {
        return (byte)n;
    }
    
    private static byte Q(final short n) {
        return (byte)(n >> 8);
    }
    
    @Deprecated
    public static ObjectId d(final int n, final int n2, final int n3) {
        return new ObjectId(n, n2, n3);
    }
    
    private static int f(final Date date) {
        return (int)(date.getTime() / 1000L);
    }
    
    public static ObjectId g() {
        return new ObjectId();
    }
    
    @Deprecated
    public static int i() {
        return ObjectId.P.get() & 0xFFFFFF;
    }
    
    @Deprecated
    public static int k() {
        return ObjectId.N;
    }
    
    @Deprecated
    public static int l() {
        return ObjectId.O;
    }
    
    private static byte v(final int n) {
        return (byte)n;
    }
    
    private static byte y(final int n) {
        return (byte)(n >> 8);
    }
    
    private static byte z(final int n) {
        return (byte)(n >> 16);
    }
    
    public void O(final ByteBuffer byteBuffer) {
        a.e("buffer", byteBuffer);
        a.d("buffer.remaining() >=12", byteBuffer.remaining() >= 12);
        byteBuffer.put(B(this.G));
        byteBuffer.put(z(this.G));
        byteBuffer.put(y(this.G));
        byteBuffer.put(v(this.G));
        byteBuffer.put(z(this.I));
        byteBuffer.put(y(this.I));
        byteBuffer.put(v(this.I));
        byteBuffer.put(Q(this.J));
        byteBuffer.put(P(this.J));
        byteBuffer.put(z(this.H));
        byteBuffer.put(y(this.H));
        byteBuffer.put(v(this.H));
    }
    
    public byte[] T() {
        final ByteBuffer allocate = ByteBuffer.allocate(12);
        this.O(allocate);
        return allocate.array();
    }
    
    public String U() {
        final char[] value = new char[24];
        final byte[] t = this.T();
        final int length = t.length;
        int i = 0;
        int n = 0;
        while (i < length) {
            final byte b = t[i];
            final int n2 = n + 1;
            final char[] q = ObjectId.Q;
            value[n] = q[b >> 4 & 0xF];
            n = n2 + 1;
            value[n2] = q[b & 0xF];
            ++i;
        }
        return new String(value);
    }
    
    @Deprecated
    public String V() {
        return this.U();
    }
    
    public int b(final ObjectId obj) {
        Objects.requireNonNull(obj);
        final byte[] t = this.T();
        final byte[] t2 = obj.T();
        for (int i = 0; i < 12; ++i) {
            if (t[i] != t2[i]) {
                int n;
                if ((t[i] & 0xFF) < (t2[i] & 0xFF)) {
                    n = -1;
                }
                else {
                    n = 1;
                }
                return n;
            }
        }
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && ObjectId.class == o.getClass()) {
            final ObjectId objectId = (ObjectId)o;
            return this.H == objectId.H && this.G == objectId.G && this.I == objectId.I && this.J == objectId.J;
        }
        return false;
    }
    
    @Deprecated
    public int h() {
        return this.H;
    }
    
    @Override
    public int hashCode() {
        return ((this.G * 31 + this.H) * 31 + this.I) * 31 + this.J;
    }
    
    public Date j() {
        return new Date(((long)this.G & 0xFFFFFFFFL) * 1000L);
    }
    
    @Deprecated
    public int m() {
        return this.I;
    }
    
    @Deprecated
    public short o() {
        return this.J;
    }
    
    @Deprecated
    public long p() {
        return ((long)this.G & 0xFFFFFFFFL) * 1000L;
    }
    
    @Deprecated
    public int s() {
        return this.G;
    }
    
    @Override
    public String toString() {
        return this.U();
    }
    
    public int u() {
        return this.G;
    }
}
