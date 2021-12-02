// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.random;

import java.io.Serializable;
import kotlin.jvm.internal.k0;
import kotlin.internal.l;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.e1;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0012\n\u0002\b\f\b'\u0018\u0000  2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\nH\u0016J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0010H\u0016J\u0018\u0010\u0013\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0010H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J$\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u0002H\u0016J\u0010\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0002H\u0016¨\u0006\"" }, d2 = { "Lkotlin/random/f;", "", "", "bitCount", "b", "l", "until", "m", "from", "n", "", "o", "p", "q", "", "c", "", "h", "i", "j", "", "k", "", "array", "fromIndex", "toIndex", "f", "e", "size", "d", "<init>", "()V", "H", "a", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@e1(version = "1.3")
public abstract class f
{
    private static final f G;
    @e
    public static final a H;
    
    static {
        H = new a(null);
        G = l.a.b();
    }
    
    public static final /* synthetic */ f a() {
        return f.G;
    }
    
    public abstract int b(final int p0);
    
    public boolean c() {
        boolean b = true;
        if (this.b(1) == 0) {
            b = false;
        }
        return b;
    }
    
    @e
    public byte[] d(final int n) {
        return this.e(new byte[n]);
    }
    
    @e
    public byte[] e(@e final byte[] array) {
        k0.p(array, "array");
        return this.f(array, 0, array.length);
    }
    
    @e
    public byte[] f(@e final byte[] array, int n, int i) {
        k0.p(array, "array");
        final int length = array.length;
        final int n2 = 0;
        final int n3 = 1;
        boolean b = false;
        Label_0055: {
            if (n >= 0) {
                if (length >= n) {
                    final int length2 = array.length;
                    if (i >= 0) {
                        if (length2 >= i) {
                            b = true;
                            break Label_0055;
                        }
                    }
                }
            }
            b = false;
        }
        if (!b) {
            final StringBuilder sb = new StringBuilder();
            sb.append("fromIndex (");
            sb.append(n);
            sb.append(") or toIndex (");
            sb.append(i);
            sb.append(") are out of range: 0..");
            sb.append(array.length);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString().toString());
        }
        int n4;
        if (n <= i) {
            n4 = n3;
        }
        else {
            n4 = 0;
        }
        if (n4 != 0) {
            for (int n5 = (i - n) / 4, j = 0; j < n5; ++j) {
                final int l = this.l();
                array[n] = (byte)l;
                array[n + 1] = (byte)(l >>> 8);
                array[n + 2] = (byte)(l >>> 16);
                array[n + 3] = (byte)(l >>> 24);
                n += 4;
            }
            final int n6 = i - n;
            final int b2 = this.b(n6 * 8);
            for (i = n2; i < n6; ++i) {
                array[n + i] = (byte)(b2 >>> i * 8);
            }
            return array;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("fromIndex (");
        sb2.append(n);
        sb2.append(") must be not greater than toIndex (");
        sb2.append(i);
        sb2.append(").");
        throw new IllegalArgumentException(sb2.toString().toString());
    }
    
    public double h() {
        return kotlin.random.e.d(this.b(26), this.b(27));
    }
    
    public double i(final double n) {
        return this.j(0.0, n);
    }
    
    public double j(double n, final double start) {
        g.d(n, start);
        final double v = start - n;
        Label_0127: {
            if (Double.isInfinite(v)) {
                final boolean infinite = Double.isInfinite(n);
                final int n2 = 1;
                if (!infinite && !Double.isNaN(n)) {
                    int n3;
                    if (!Double.isInfinite(start) && !Double.isNaN(start)) {
                        n3 = n2;
                    }
                    else {
                        n3 = 0;
                    }
                    if (n3 != 0) {
                        final double h = this.h();
                        final double n4 = 2;
                        final double n5 = h * (start / n4 - n / n4);
                        n = n + n5 + n5;
                        break Label_0127;
                    }
                }
            }
            n += this.h() * v;
        }
        double nextAfter = n;
        if (n >= start) {
            nextAfter = Math.nextAfter(start, Double.NEGATIVE_INFINITY);
        }
        return nextAfter;
    }
    
    public float k() {
        return this.b(24) / (float)16777216;
    }
    
    public int l() {
        return this.b(32);
    }
    
    public int m(final int n) {
        return this.n(0, n);
    }
    
    public int n(final int n, int b) {
        g.e(n, b);
        final int n2 = b - n;
        if (n2 <= 0 && n2 != Integer.MIN_VALUE) {
            int l;
            while (true) {
                l = this.l();
                if (n > l) {
                    continue;
                }
                if (b > l) {
                    break;
                }
            }
            return l;
        }
        if ((-n2 & n2) == n2) {
            b = this.b(g.g(n2));
        }
        else {
            int n3;
            do {
                n3 = this.l() >>> 1;
                b = n3 % n2;
            } while (n3 - b + (n2 - 1) < 0);
        }
        return n + b;
    }
    
    public long o() {
        return ((long)this.l() << 32) + this.l();
    }
    
    public long p(final long n) {
        return this.q(0L, n);
    }
    
    public long q(final long n, long n2) {
        g.f(n, n2);
        final long n3 = n2 - n;
        if (n3 > 0L) {
            if ((-n3 & n3) == n3) {
                final int n4 = (int)n3;
                final int n5 = (int)(n3 >>> 32);
                int n6;
                if (n4 != 0) {
                    n6 = this.b(g.g(n4));
                }
                else {
                    if (n5 != 1) {
                        n2 = ((long)this.b(g.g(n5)) << 32) + this.l();
                        return n + n2;
                    }
                    n6 = this.l();
                }
                n2 = ((long)n6 & 0xFFFFFFFFL);
            }
            else {
                long n7;
                do {
                    n7 = this.o() >>> 1;
                    n2 = n7 % n3;
                } while (n7 - n2 + (n3 - 1L) < 0L);
            }
            return n + n2;
        }
        long o;
        while (true) {
            o = this.o();
            if (n > o) {
                continue;
            }
            if (n2 > o) {
                break;
            }
        }
        return o;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0012\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001&B\t\b\u0002¢\u0006\u0004\b$\u0010%J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000eH\u0016J\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000eH\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u0014H\u0016J\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u0014H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u0010\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0010\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u0006H\u0016J \u0010!\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0016R\u0016\u0010\"\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006'" }, d2 = { "kotlin/random/f$a", "Lkotlin/random/f;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "r", "", "bitCount", "b", "l", "until", "m", "from", "n", "", "o", "p", "q", "", "c", "", "h", "i", "j", "", "k", "", "array", "e", "size", "d", "fromIndex", "toIndex", "f", "defaultRandom", "Lkotlin/random/f;", "<init>", "()V", "a", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
    public static final class a extends f implements Serializable
    {
        private a() {
        }
        
        private final Object r() {
            return f.a.a.H;
        }
        
        @Override
        public int b(final int n) {
            return f.a().b(n);
        }
        
        @Override
        public boolean c() {
            return f.a().c();
        }
        
        @e
        @Override
        public byte[] d(final int n) {
            return f.a().d(n);
        }
        
        @e
        @Override
        public byte[] e(@e final byte[] array) {
            k0.p(array, "array");
            return f.a().e(array);
        }
        
        @e
        @Override
        public byte[] f(@e final byte[] array, final int n, final int n2) {
            k0.p(array, "array");
            return f.a().f(array, n, n2);
        }
        
        @Override
        public double h() {
            return f.a().h();
        }
        
        @Override
        public double i(final double n) {
            return f.a().i(n);
        }
        
        @Override
        public double j(final double n, final double n2) {
            return f.a().j(n, n2);
        }
        
        @Override
        public float k() {
            return f.a().k();
        }
        
        @Override
        public int l() {
            return f.a().l();
        }
        
        @Override
        public int m(final int n) {
            return f.a().m(n);
        }
        
        @Override
        public int n(final int n, final int n2) {
            return f.a().n(n, n2);
        }
        
        @Override
        public long o() {
            return f.a().o();
        }
        
        @Override
        public long p(final long n) {
            return f.a().p(n);
        }
        
        @Override
        public long q(final long n, final long n2) {
            return f.a().q(n, n2);
        }
        
        @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u00c2\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0004\u001a\u00020\u0003H\u0002R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b" }, d2 = { "kotlin/random/f$a$a", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "a", "", "G", "J", "serialVersionUID", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
        private static final class a implements Serializable
        {
            private static final long G = 0L;
            @e
            public static final a H;
            
            static {
                H = new a();
            }
            
            private final Object a() {
                return f.H;
            }
        }
    }
}
