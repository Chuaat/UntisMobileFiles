// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections.unsigned;

import java.math.BigInteger;
import m6.g;
import kotlin.r0;
import java.math.BigDecimal;
import n6.l;
import kotlin.internal.f;
import kotlin.m2;
import kotlin.f2;
import kotlin.e2;
import kotlin.z1;
import kotlin.y1;
import kotlin.r1;
import kotlin.q1;
import kotlin.r;
import kotlin.e1;
import kotlin.collections.m;
import kotlin.v1;
import kotlin.collections.d;
import java.util.RandomAccess;
import kotlin.jvm.internal.k0;
import kotlin.u1;
import java.util.List;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\b\u001a\u00020\u0007*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\f\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u0010\u001a\u00020\u000f*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012*\u00020\u0000H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012*\u00020\u0006H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0012*\u00020\nH\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012*\u00020\u000eH\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a2\u0010\u001e\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00012\b\b\u0002\u0010\u001d\u001a\u00020\u0001H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a2\u0010 \u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00012\b\b\u0002\u0010\u001d\u001a\u00020\u0001H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b \u0010!\u001a2\u0010\"\u001a\u00020\u0001*\u00020\n2\u0006\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u00012\b\b\u0002\u0010\u001d\u001a\u00020\u0001H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a2\u0010$\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000f2\b\b\u0002\u0010\u001c\u001a\u00020\u00012\b\b\u0002\u0010\u001d\u001a\u00020\u0001H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b$\u0010%\u001a.\u0010)\u001a\u00020'*\u00020\u00002\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020'0&H\u0087\b\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b)\u0010*\u001a.\u0010+\u001a\u00020'*\u00020\u00062\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020'0&H\u0087\b\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b+\u0010,\u001a.\u0010-\u001a\u00020'*\u00020\n2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020'0&H\u0087\b\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b-\u0010.\u001a.\u0010/\u001a\u00020'*\u00020\u000e2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020'0&H\u0087\b\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b/\u00100\u001a.\u00102\u001a\u000201*\u00020\u00002\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002010&H\u0087\b\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b2\u00103\u001a.\u00104\u001a\u000201*\u00020\u00062\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002010&H\u0087\b\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b4\u00105\u001a.\u00106\u001a\u000201*\u00020\n2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u0002010&H\u0087\b\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b6\u00107\u001a.\u00108\u001a\u000201*\u00020\u000e2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u0002010&H\u0087\b\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b8\u00109\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006:" }, d2 = { "Lkotlin/v1;", "", "index", "Lkotlin/u1;", "o", "([II)I", "Lkotlin/z1;", "Lkotlin/y1;", "p", "([JI)J", "Lkotlin/r1;", "Lkotlin/q1;", "m", "([BI)B", "Lkotlin/f2;", "Lkotlin/e2;", "n", "([SI)S", "", "a", "([I)Ljava/util/List;", "c", "([J)Ljava/util/List;", "b", "([B)Ljava/util/List;", "d", "([S)Ljava/util/List;", "element", "fromIndex", "toIndex", "e", "([IIII)I", "i", "([JJII)I", "k", "([BBII)I", "g", "([SSII)I", "Lkotlin/Function1;", "Ljava/math/BigDecimal;", "selector", "r", "([ILn6/l;)Ljava/math/BigDecimal;", "s", "([JLn6/l;)Ljava/math/BigDecimal;", "q", "([BLn6/l;)Ljava/math/BigDecimal;", "t", "([SLn6/l;)Ljava/math/BigDecimal;", "Ljava/math/BigInteger;", "v", "([ILn6/l;)Ljava/math/BigInteger;", "w", "([JLn6/l;)Ljava/math/BigInteger;", "u", "([BLn6/l;)Ljava/math/BigInteger;", "x", "([SLn6/l;)Ljava/math/BigInteger;", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, pn = "kotlin.collections", xs = "kotlin/collections/unsigned/UArraysKt")
class b
{
    public b() {
    }
    
    @e1(version = "1.3")
    @r
    @e
    public static final List<u1> a(@e final int[] array) {
        k0.p(array, "$this$asList");
        return new RandomAccess() {
            @Override
            public int b() {
                return v1.v(array);
            }
            
            @Override
            public final /* bridge */ boolean contains(final Object o) {
                return o instanceof u1 && this.f(((u1)o).R0());
            }
            
            public boolean f(final int n) {
                return v1.n(array, n);
            }
            
            public int h(final int n) {
                return v1.r(array, n);
            }
            
            public int i(final int n) {
                return m.df(array, n);
            }
            
            @Override
            public final /* bridge */ int indexOf(final Object o) {
                if (o instanceof u1) {
                    return this.i(((u1)o).R0());
                }
                return -1;
            }
            
            @Override
            public boolean isEmpty() {
                return v1.z(array);
            }
            
            public int k(final int n) {
                return m.hh(array, n);
            }
            
            @Override
            public final /* bridge */ int lastIndexOf(final Object o) {
                if (o instanceof u1) {
                    return this.k(((u1)o).R0());
                }
                return -1;
            }
        };
    }
    
    @e1(version = "1.3")
    @r
    @e
    public static final List<q1> b(@e final byte[] array) {
        k0.p(array, "$this$asList");
        return new RandomAccess() {
            @Override
            public int b() {
                return r1.v(array);
            }
            
            @Override
            public final /* bridge */ boolean contains(final Object o) {
                return o instanceof q1 && this.f(((q1)o).O0());
            }
            
            public boolean f(final byte b) {
                return r1.n(array, b);
            }
            
            public byte h(final int n) {
                return r1.r(array, n);
            }
            
            public int i(final byte b) {
                return m.Ze(array, b);
            }
            
            @Override
            public final /* bridge */ int indexOf(final Object o) {
                if (o instanceof q1) {
                    return this.i(((q1)o).O0());
                }
                return -1;
            }
            
            @Override
            public boolean isEmpty() {
                return r1.z(array);
            }
            
            public int k(final byte b) {
                return m.dh(array, b);
            }
            
            @Override
            public final /* bridge */ int lastIndexOf(final Object o) {
                if (o instanceof q1) {
                    return this.k(((q1)o).O0());
                }
                return -1;
            }
        };
    }
    
    @e1(version = "1.3")
    @r
    @e
    public static final List<y1> c(@e final long[] array) {
        k0.p(array, "$this$asList");
        return new RandomAccess() {
            @Override
            public int b() {
                return z1.v(array);
            }
            
            @Override
            public final /* bridge */ boolean contains(final Object o) {
                return o instanceof y1 && this.f(((y1)o).R0());
            }
            
            public boolean f(final long n) {
                return z1.n(array, n);
            }
            
            public long h(final int n) {
                return z1.r(array, n);
            }
            
            public int i(final long n) {
                return m.ef(array, n);
            }
            
            @Override
            public final /* bridge */ int indexOf(final Object o) {
                if (o instanceof y1) {
                    return this.i(((y1)o).R0());
                }
                return -1;
            }
            
            @Override
            public boolean isEmpty() {
                return z1.z(array);
            }
            
            public int k(final long n) {
                return m.ih(array, n);
            }
            
            @Override
            public final /* bridge */ int lastIndexOf(final Object o) {
                if (o instanceof y1) {
                    return this.k(((y1)o).R0());
                }
                return -1;
            }
        };
    }
    
    @e1(version = "1.3")
    @r
    @e
    public static final List<e2> d(@e final short[] array) {
        k0.p(array, "$this$asList");
        return new RandomAccess() {
            @Override
            public int b() {
                return f2.v(array);
            }
            
            @Override
            public final /* bridge */ boolean contains(final Object o) {
                return o instanceof e2 && this.f(((e2)o).O0());
            }
            
            public boolean f(final short n) {
                return f2.n(array, n);
            }
            
            public short h(final int n) {
                return f2.r(array, n);
            }
            
            public int i(final short n) {
                return m.gf(array, n);
            }
            
            @Override
            public final /* bridge */ int indexOf(final Object o) {
                if (o instanceof e2) {
                    return this.i(((e2)o).O0());
                }
                return -1;
            }
            
            @Override
            public boolean isEmpty() {
                return f2.z(array);
            }
            
            public int k(final short n) {
                return m.kh(array, n);
            }
            
            @Override
            public final /* bridge */ int lastIndexOf(final Object o) {
                if (o instanceof e2) {
                    return this.k(((e2)o).O0());
                }
                return -1;
            }
        };
    }
    
    @e1(version = "1.3")
    @r
    public static final int e(@e final int[] array, final int n, int i, int n2) {
        k0.p(array, "$this$binarySearch");
        d.G.d(i, n2, v1.v(array));
        --n2;
        while (i <= n2) {
            final int n3 = i + n2 >>> 1;
            final int c = m2.c(array[n3], n);
            if (c < 0) {
                i = n3 + 1;
            }
            else {
                if (c <= 0) {
                    return n3;
                }
                n2 = n3 - 1;
            }
        }
        return -(i + 1);
    }
    
    @e1(version = "1.3")
    @r
    public static final int g(@e final short[] array, final short n, int i, int n2) {
        k0.p(array, "$this$binarySearch");
        d.G.d(i, n2, f2.v(array));
        --n2;
        while (i <= n2) {
            final int n3 = i + n2 >>> 1;
            final int c = m2.c(array[n3], n & 0xFFFF);
            if (c < 0) {
                i = n3 + 1;
            }
            else {
                if (c <= 0) {
                    return n3;
                }
                n2 = n3 - 1;
            }
        }
        return -(i + 1);
    }
    
    @e1(version = "1.3")
    @r
    public static final int i(@e final long[] array, final long n, int i, int n2) {
        k0.p(array, "$this$binarySearch");
        d.G.d(i, n2, z1.v(array));
        --n2;
        while (i <= n2) {
            final int n3 = i + n2 >>> 1;
            final int g = m2.g(array[n3], n);
            if (g < 0) {
                i = n3 + 1;
            }
            else {
                if (g <= 0) {
                    return n3;
                }
                n2 = n3 - 1;
            }
        }
        return -(i + 1);
    }
    
    @e1(version = "1.3")
    @r
    public static final int k(@e final byte[] array, final byte b, int i, int n) {
        k0.p(array, "$this$binarySearch");
        d.G.d(i, n, r1.v(array));
        --n;
        while (i <= n) {
            final int n2 = i + n >>> 1;
            final int c = m2.c(array[n2], b & 0xFF);
            if (c < 0) {
                i = n2 + 1;
            }
            else {
                if (c <= 0) {
                    return n2;
                }
                n = n2 - 1;
            }
        }
        return -(i + 1);
    }
    
    @e1(version = "1.3")
    @f
    @r
    private static final byte m(final byte[] array, final int n) {
        return r1.r(array, n);
    }
    
    @e1(version = "1.3")
    @f
    @r
    private static final short n(final short[] array, final int n) {
        return f2.r(array, n);
    }
    
    @e1(version = "1.3")
    @f
    @r
    private static final int o(final int[] array, final int n) {
        return v1.r(array, n);
    }
    
    @e1(version = "1.3")
    @f
    @r
    private static final long p(final long[] array, final int n) {
        return z1.r(array, n);
    }
    
    @e1(version = "1.4")
    @f
    @r0
    @r
    @g(name = "sumOfBigDecimal")
    private static final BigDecimal q(final byte[] array, final l<? super q1, ? extends BigDecimal> l) {
        int i = 0;
        BigDecimal bigDecimal = BigDecimal.valueOf(0);
        k0.o(bigDecimal, "BigDecimal.valueOf(this.toLong())");
        while (i < array.length) {
            bigDecimal = bigDecimal.add((BigDecimal)l.invoke(q1.d(array[i])));
            k0.o(bigDecimal, "this.add(other)");
            ++i;
        }
        return bigDecimal;
    }
    
    @e1(version = "1.4")
    @f
    @r0
    @r
    @g(name = "sumOfBigDecimal")
    private static final BigDecimal r(final int[] array, final l<? super u1, ? extends BigDecimal> l) {
        int i = 0;
        BigDecimal bigDecimal = BigDecimal.valueOf(0);
        k0.o(bigDecimal, "BigDecimal.valueOf(this.toLong())");
        while (i < array.length) {
            bigDecimal = bigDecimal.add((BigDecimal)l.invoke(u1.d(array[i])));
            k0.o(bigDecimal, "this.add(other)");
            ++i;
        }
        return bigDecimal;
    }
    
    @e1(version = "1.4")
    @f
    @r0
    @r
    @g(name = "sumOfBigDecimal")
    private static final BigDecimal s(final long[] array, final l<? super y1, ? extends BigDecimal> l) {
        int i = 0;
        BigDecimal bigDecimal = BigDecimal.valueOf(0);
        k0.o(bigDecimal, "BigDecimal.valueOf(this.toLong())");
        while (i < array.length) {
            bigDecimal = bigDecimal.add((BigDecimal)l.invoke(y1.d(array[i])));
            k0.o(bigDecimal, "this.add(other)");
            ++i;
        }
        return bigDecimal;
    }
    
    @e1(version = "1.4")
    @f
    @r0
    @r
    @g(name = "sumOfBigDecimal")
    private static final BigDecimal t(final short[] array, final l<? super e2, ? extends BigDecimal> l) {
        int i = 0;
        BigDecimal bigDecimal = BigDecimal.valueOf(0);
        k0.o(bigDecimal, "BigDecimal.valueOf(this.toLong())");
        while (i < array.length) {
            bigDecimal = bigDecimal.add((BigDecimal)l.invoke(e2.d(array[i])));
            k0.o(bigDecimal, "this.add(other)");
            ++i;
        }
        return bigDecimal;
    }
    
    @e1(version = "1.4")
    @f
    @r0
    @r
    @g(name = "sumOfBigInteger")
    private static final BigInteger u(final byte[] array, final l<? super q1, ? extends BigInteger> l) {
        int i = 0;
        BigInteger bigInteger = BigInteger.valueOf(0);
        k0.o(bigInteger, "BigInteger.valueOf(this.toLong())");
        while (i < array.length) {
            bigInteger = bigInteger.add((BigInteger)l.invoke(q1.d(array[i])));
            k0.o(bigInteger, "this.add(other)");
            ++i;
        }
        return bigInteger;
    }
    
    @e1(version = "1.4")
    @f
    @r0
    @r
    @g(name = "sumOfBigInteger")
    private static final BigInteger v(final int[] array, final l<? super u1, ? extends BigInteger> l) {
        int i = 0;
        BigInteger bigInteger = BigInteger.valueOf(0);
        k0.o(bigInteger, "BigInteger.valueOf(this.toLong())");
        while (i < array.length) {
            bigInteger = bigInteger.add((BigInteger)l.invoke(u1.d(array[i])));
            k0.o(bigInteger, "this.add(other)");
            ++i;
        }
        return bigInteger;
    }
    
    @e1(version = "1.4")
    @f
    @r0
    @r
    @g(name = "sumOfBigInteger")
    private static final BigInteger w(final long[] array, final l<? super y1, ? extends BigInteger> l) {
        int i = 0;
        BigInteger bigInteger = BigInteger.valueOf(0);
        k0.o(bigInteger, "BigInteger.valueOf(this.toLong())");
        while (i < array.length) {
            bigInteger = bigInteger.add((BigInteger)l.invoke(y1.d(array[i])));
            k0.o(bigInteger, "this.add(other)");
            ++i;
        }
        return bigInteger;
    }
    
    @e1(version = "1.4")
    @f
    @r0
    @r
    @g(name = "sumOfBigInteger")
    private static final BigInteger x(final short[] array, final l<? super e2, ? extends BigInteger> l) {
        int i = 0;
        BigInteger bigInteger = BigInteger.valueOf(0);
        k0.o(bigInteger, "BigInteger.valueOf(this.toLong())");
        while (i < array.length) {
            bigInteger = bigInteger.add((BigInteger)l.invoke(e2.d(array[i])));
            k0.o(bigInteger, "this.add(other)");
            ++i;
        }
        return bigInteger;
    }
}
