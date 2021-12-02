// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Iterator;
import java.util.ArrayList;
import java.io.IOException;
import java.io.InputStream;

public final class e
{
    private final byte[] a;
    private final boolean b;
    private int c;
    private int d;
    private int e;
    private final InputStream f;
    private int g;
    private boolean h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private a n;
    
    private e(final InputStream f) {
        this.h = false;
        this.j = Integer.MAX_VALUE;
        this.l = 64;
        this.m = 67108864;
        this.n = null;
        this.a = new byte[4096];
        this.c = 0;
        this.e = 0;
        this.i = 0;
        this.f = f;
        this.b = false;
    }
    
    private e(final p p) {
        this.h = false;
        this.j = Integer.MAX_VALUE;
        this.l = 64;
        this.m = 67108864;
        this.n = null;
        this.a = p.I;
        final int h = p.H();
        this.e = h;
        this.c = h + p.size();
        this.i = -this.e;
        this.f = null;
        this.b = true;
    }
    
    public static int B(int read, final InputStream inputStream) throws IOException {
        if ((read & 0x80) == 0x0) {
            return read;
        }
        int n = read & 0x7F;
        read = 7;
        int i;
        while (true) {
            i = read;
            if (read >= 32) {
                break;
            }
            final int read2 = inputStream.read();
            if (read2 == -1) {
                throw k.k();
            }
            n |= (read2 & 0x7F) << read;
            if ((read2 & 0x80) == 0x0) {
                return n;
            }
            read += 7;
        }
        while (i < 64) {
            read = inputStream.read();
            if (read == -1) {
                throw k.k();
            }
            if ((read & 0x80) == 0x0) {
                return n;
            }
            i += 7;
        }
        throw k.f();
    }
    
    private void N() {
        final int c = this.c + this.d;
        this.c = c;
        final int n = this.i + c;
        final int j = this.j;
        if (n > j) {
            final int d = n - j;
            this.d = d;
            this.c = c - d;
        }
        else {
            this.d = 0;
        }
    }
    
    private void O(final int n) throws IOException {
        if (this.T(n)) {
            return;
        }
        throw kotlin.reflect.jvm.internal.impl.protobuf.k.k();
    }
    
    private void S(final int n) throws IOException {
        if (n < 0) {
            throw kotlin.reflect.jvm.internal.impl.protobuf.k.g();
        }
        final int i = this.i;
        final int e = this.e;
        final int j = this.j;
        if (i + e + n <= j) {
            final int c = this.c;
            int n2 = c - e;
            this.e = c;
            int e2;
            while (true) {
                this.O(1);
                e2 = n - n2;
                final int c2 = this.c;
                if (e2 <= c2) {
                    break;
                }
                n2 += c2;
                this.e = c2;
            }
            this.e = e2;
            return;
        }
        this.R(j - i - e);
        throw kotlin.reflect.jvm.internal.impl.protobuf.k.k();
    }
    
    private boolean T(final int i) throws IOException {
        final int e = this.e;
        if (e + i <= this.c) {
            final StringBuilder sb = new StringBuilder(77);
            sb.append("refillBuffer() called when ");
            sb.append(i);
            sb.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb.toString());
        }
        if (this.i + e + i > this.j) {
            return false;
        }
        final a n = this.n;
        if (n != null) {
            n.a();
        }
        if (this.f != null) {
            final int e2 = this.e;
            if (e2 > 0) {
                final int c = this.c;
                if (c > e2) {
                    final byte[] a = this.a;
                    System.arraycopy(a, e2, a, 0, c - e2);
                }
                this.i += e2;
                this.c -= e2;
                this.e = 0;
            }
            final InputStream f = this.f;
            final byte[] a2 = this.a;
            final int c2 = this.c;
            final int read = f.read(a2, c2, a2.length - c2);
            if (read == 0 || read < -1 || read > this.a.length) {
                final StringBuilder sb2 = new StringBuilder(102);
                sb2.append("InputStream#read(byte[]) returned invalid result: ");
                sb2.append(read);
                sb2.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb2.toString());
            }
            if (read > 0) {
                this.c += read;
                if (this.i + i - this.m <= 0) {
                    this.N();
                    return this.c >= i || this.T(i);
                }
                throw kotlin.reflect.jvm.internal.impl.protobuf.k.j();
            }
        }
        return false;
    }
    
    public static int b(final int n) {
        return -(n & 0x1) ^ n >>> 1;
    }
    
    public static long c(final long n) {
        return -(n & 0x1L) ^ n >>> 1;
    }
    
    private void d(final int n) throws IOException {
        if (this.c - this.e < n) {
            this.O(n);
        }
    }
    
    public static e g(final InputStream inputStream) {
        return new e(inputStream);
    }
    
    static e h(final p p) {
        final e e = new e(p);
        try {
            e.j(p.size());
            return e;
        }
        catch (k cause) {
            throw new IllegalArgumentException(cause);
        }
    }
    
    private byte[] x(int e) throws IOException {
        if (e <= 0) {
            if (e == 0) {
                return kotlin.reflect.jvm.internal.impl.protobuf.j.a;
            }
            throw kotlin.reflect.jvm.internal.impl.protobuf.k.g();
        }
        else {
            final int i = this.i;
            final int e2 = this.e;
            final int j = this.j;
            if (i + e2 + e > j) {
                this.R(j - i - e2);
                throw kotlin.reflect.jvm.internal.impl.protobuf.k.k();
            }
            if (e < 4096) {
                final byte[] array = new byte[e];
                final int n = this.c - e2;
                System.arraycopy(this.a, e2, array, 0, n);
                this.e = this.c;
                e -= n;
                this.d(e);
                System.arraycopy(this.a, 0, array, n, e);
                this.e = e;
                return array;
            }
            final int c = this.c;
            this.i = i + c;
            this.e = 0;
            this.c = 0;
            final int n2 = c - e2;
            int k = e - n2;
            final ArrayList<byte[]> list = new ArrayList<byte[]>();
            while (k > 0) {
                final int min = Math.min(k, 4096);
                final byte[] b = new byte[min];
                int read;
                for (int l = 0; l < min; l += read) {
                    final InputStream f = this.f;
                    if (f == null) {
                        read = -1;
                    }
                    else {
                        read = f.read(b, l, min - l);
                    }
                    if (read == -1) {
                        throw kotlin.reflect.jvm.internal.impl.protobuf.k.k();
                    }
                    this.i += read;
                }
                k -= min;
                list.add(b);
            }
            final byte[] array2 = new byte[e];
            System.arraycopy(this.a, e2, array2, 0, n2);
            final Iterator<Object> iterator = list.iterator();
            e = n2;
            while (iterator.hasNext()) {
                final byte[] array3 = iterator.next();
                System.arraycopy(array3, 0, array2, e, array3.length);
                e += array3.length;
            }
            return array2;
        }
    }
    
    public int A() throws IOException {
        final int e = this.e;
        final int c = this.c;
        if (c != e) {
            final byte[] a = this.a;
            final int e2 = e + 1;
            final byte b = a[e];
            if (b >= 0) {
                this.e = e2;
                return b;
            }
            if (c - e2 >= 9) {
                final int n = e2 + 1;
                final int n2 = b ^ a[e2] << 7;
                long n3 = n2;
                int e3 = 0;
                int n6 = 0;
                Label_0308: {
                    long n9 = 0L;
                    Label_0090: {
                        if (n3 >= 0L) {
                            e3 = n + 1;
                            final int n4 = n2 ^ a[n] << 14;
                            final long n5 = n4;
                            if (n5 >= 0L) {
                                n6 = (int)(0x3F80L ^ n5);
                            }
                            else {
                                final int n7 = e3 + 1;
                                final int n8 = n4 ^ a[e3] << 21;
                                n3 = n8;
                                if (n3 < 0L) {
                                    n9 = -2080896L;
                                    e3 = n7;
                                    break Label_0090;
                                }
                                final int n10 = n7 + 1;
                                final byte b2 = a[n7];
                                final int n11 = n6 = (int)((long)(n8 ^ b2 << 28) ^ 0xFE03F80L);
                                e3 = n10;
                                if (b2 < 0) {
                                    final int n12 = n10 + 1;
                                    n6 = n11;
                                    e3 = n12;
                                    if (a[n10] < 0) {
                                        final int n13 = n12 + 1;
                                        n6 = n11;
                                        e3 = n13;
                                        if (a[n12] < 0) {
                                            final int n14 = n13 + 1;
                                            n6 = n11;
                                            e3 = n14;
                                            if (a[n13] < 0) {
                                                final int n15 = n14 + 1;
                                                n6 = n11;
                                                e3 = n15;
                                                if (a[n14] < 0) {
                                                    e3 = n15 + 1;
                                                    n6 = n11;
                                                    if (a[n15] < 0) {
                                                        return (int)this.D();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            break Label_0308;
                        }
                        n9 = -128L;
                        e3 = n;
                    }
                    n6 = (int)(n3 ^ n9);
                }
                this.e = e3;
                return n6;
            }
        }
        return (int)this.D();
    }
    
    public long C() throws IOException {
        final int e = this.e;
        final int c = this.c;
        if (c != e) {
            final byte[] a = this.a;
            final int e2 = e + 1;
            final byte b = a[e];
            if (b >= 0) {
                this.e = e2;
                return b;
            }
            if (c - e2 >= 9) {
                int e3 = e2 + 1;
                long n = b ^ a[e2] << 7;
                long n9 = 0L;
                Label_0358: {
                    long n5 = 0L;
                    Label_0086: {
                        if (n >= 0L) {
                            final int n2 = e3 + 1;
                            long n3 = n ^ (long)(a[e3] << 14);
                            long n4;
                            if (n3 >= 0L) {
                                n4 = 16256L;
                                e3 = n2;
                            }
                            else {
                                e3 = n2 + 1;
                                n = (n3 ^ (long)(a[n2] << 21));
                                if (n < 0L) {
                                    n5 = -2080896L;
                                    break Label_0086;
                                }
                                final int n6 = e3 + 1;
                                n3 = (n ^ (long)a[e3] << 28);
                                if (n3 >= 0L) {
                                    n4 = 266354560L;
                                    e3 = n6;
                                }
                                else {
                                    e3 = n6 + 1;
                                    n = (n3 ^ (long)a[n6] << 35);
                                    if (n < 0L) {
                                        n5 = -34093383808L;
                                        break Label_0086;
                                    }
                                    final int n7 = e3 + 1;
                                    n3 = (n ^ (long)a[e3] << 42);
                                    if (n3 >= 0L) {
                                        n4 = 4363953127296L;
                                        e3 = n7;
                                    }
                                    else {
                                        e3 = n7 + 1;
                                        n = (n3 ^ (long)a[n7] << 49);
                                        if (n < 0L) {
                                            n5 = -558586000294016L;
                                            break Label_0086;
                                        }
                                        final int n8 = e3 + 1;
                                        n9 = (n ^ (long)a[e3] << 56 ^ 0xFE03F80FE03F80L);
                                        if (n9 >= 0L) {
                                            e3 = n8;
                                            break Label_0358;
                                        }
                                        e3 = n8 + 1;
                                        if (a[n8] < 0L) {
                                            return this.D();
                                        }
                                        break Label_0358;
                                    }
                                }
                            }
                            n9 = (n3 ^ n4);
                            break Label_0358;
                        }
                        n5 = -128L;
                    }
                    n9 = (n ^ n5);
                }
                this.e = e3;
                return n9;
            }
        }
        return this.D();
    }
    
    long D() throws IOException {
        long n = 0L;
        for (int i = 0; i < 64; i += 7) {
            final byte w = this.w();
            n |= (long)(w & 0x7F) << i;
            if ((w & 0x80) == 0x0) {
                return n;
            }
        }
        throw kotlin.reflect.jvm.internal.impl.protobuf.k.f();
    }
    
    public int E() throws IOException {
        return this.y();
    }
    
    public long F() throws IOException {
        return this.z();
    }
    
    public int G() throws IOException {
        return b(this.A());
    }
    
    public long H() throws IOException {
        return c(this.C());
    }
    
    public String I() throws IOException {
        final int a = this.A();
        final int c = this.c;
        final int e = this.e;
        if (a <= c - e && a > 0) {
            final String s = new String(this.a, e, a, "UTF-8");
            this.e += a;
            return s;
        }
        if (a == 0) {
            return "";
        }
        return new String(this.x(a), "UTF-8");
    }
    
    public String J() throws IOException {
        final int a = this.A();
        int e = this.e;
        byte[] bytes;
        if (a <= this.c - e && a > 0) {
            bytes = this.a;
            this.e = e + a;
        }
        else {
            if (a == 0) {
                return "";
            }
            bytes = this.x(a);
            e = 0;
        }
        if (y.f(bytes, e, e + a)) {
            return new String(bytes, e, a, "UTF-8");
        }
        throw kotlin.reflect.jvm.internal.impl.protobuf.k.d();
    }
    
    public int K() throws IOException {
        if (this.f()) {
            return this.g = 0;
        }
        final int a = this.A();
        this.g = a;
        if (z.a(a) != 0) {
            return this.g;
        }
        throw kotlin.reflect.jvm.internal.impl.protobuf.k.c();
    }
    
    public int L() throws IOException {
        return this.A();
    }
    
    public long M() throws IOException {
        return this.C();
    }
    
    public boolean P(int c, final f f) throws IOException {
        final int b = z.b(c);
        if (b == 0) {
            final long t = this.t();
            f.o0(c);
            f.z0(t);
            return true;
        }
        if (b == 1) {
            final long z = this.z();
            f.o0(c);
            f.V(z);
            return true;
        }
        if (b == 2) {
            final d l = this.l();
            f.o0(c);
            f.P(l);
            return true;
        }
        if (b == 3) {
            f.o0(c);
            this.Q(f);
            c = z.c(z.a(c), 4);
            this.a(c);
            f.o0(c);
            return true;
        }
        if (b == 4) {
            return false;
        }
        if (b == 5) {
            final int y = this.y();
            f.o0(c);
            f.U(y);
            return true;
        }
        throw kotlin.reflect.jvm.internal.impl.protobuf.k.e();
    }
    
    public void Q(final f f) throws IOException {
        int k;
        do {
            k = this.K();
        } while (k != 0 && this.P(k, f));
    }
    
    public void R(final int n) throws IOException {
        final int c = this.c;
        final int e = this.e;
        if (n <= c - e && n >= 0) {
            this.e = e + n;
        }
        else {
            this.S(n);
        }
    }
    
    public void a(final int n) throws k {
        if (this.g == n) {
            return;
        }
        throw kotlin.reflect.jvm.internal.impl.protobuf.k.b();
    }
    
    public int e() {
        final int j = this.j;
        if (j == Integer.MAX_VALUE) {
            return -1;
        }
        return j - (this.i + this.e);
    }
    
    public boolean f() throws IOException {
        final int e = this.e;
        final int c = this.c;
        boolean b = true;
        if (e != c || this.T(1)) {
            b = false;
        }
        return b;
    }
    
    public void i(final int j) {
        this.j = j;
        this.N();
    }
    
    public int j(int j) throws k {
        if (j < 0) {
            throw kotlin.reflect.jvm.internal.impl.protobuf.k.g();
        }
        j += this.i + this.e;
        final int i = this.j;
        if (j <= i) {
            this.j = j;
            this.N();
            return i;
        }
        throw kotlin.reflect.jvm.internal.impl.protobuf.k.k();
    }
    
    public boolean k() throws IOException {
        return this.C() != 0L;
    }
    
    public d l() throws IOException {
        final int a = this.A();
        final int c = this.c;
        final int e = this.e;
        if (a <= c - e && a > 0) {
            d k;
            if (this.b && this.h) {
                k = new c(this.a, this.e, a);
            }
            else {
                k = kotlin.reflect.jvm.internal.impl.protobuf.d.k(this.a, e, a);
            }
            this.e += a;
            return k;
        }
        if (a == 0) {
            return kotlin.reflect.jvm.internal.impl.protobuf.d.G;
        }
        return new p(this.x(a));
    }
    
    public double m() throws IOException {
        return Double.longBitsToDouble(this.z());
    }
    
    public int n() throws IOException {
        return this.A();
    }
    
    public int o() throws IOException {
        return this.y();
    }
    
    public long p() throws IOException {
        return this.z();
    }
    
    public float q() throws IOException {
        return Float.intBitsToFloat(this.y());
    }
    
    public void r(final int n, final q.a a, final g g) throws IOException {
        final int k = this.k;
        if (k < this.l) {
            this.k = k + 1;
            a.Q1(this, g);
            this.a(z.c(n, 4));
            --this.k;
            return;
        }
        throw kotlin.reflect.jvm.internal.impl.protobuf.k.h();
    }
    
    public int s() throws IOException {
        return this.A();
    }
    
    public long t() throws IOException {
        return this.C();
    }
    
    public <T extends q> T u(final s<T> s, final g g) throws IOException {
        final int a = this.A();
        if (this.k < this.l) {
            final int j = this.j(a);
            ++this.k;
            final q q = s.b(this, g);
            this.a(0);
            --this.k;
            this.i(j);
            return (T)q;
        }
        throw kotlin.reflect.jvm.internal.impl.protobuf.k.h();
    }
    
    public void v(final q.a a, final g g) throws IOException {
        final int a2 = this.A();
        if (this.k < this.l) {
            final int j = this.j(a2);
            ++this.k;
            a.Q1(this, g);
            this.a(0);
            --this.k;
            this.i(j);
            return;
        }
        throw kotlin.reflect.jvm.internal.impl.protobuf.k.h();
    }
    
    public byte w() throws IOException {
        if (this.e == this.c) {
            this.O(1);
        }
        return this.a[this.e++];
    }
    
    public int y() throws IOException {
        int n;
        if (this.c - (n = this.e) < 4) {
            this.O(4);
            n = this.e;
        }
        final byte[] a = this.a;
        this.e = n + 4;
        return (a[n + 3] & 0xFF) << 24 | ((a[n] & 0xFF) | (a[n + 1] & 0xFF) << 8 | (a[n + 2] & 0xFF) << 16);
    }
    
    public long z() throws IOException {
        int n;
        if (this.c - (n = this.e) < 8) {
            this.O(8);
            n = this.e;
        }
        final byte[] a = this.a;
        this.e = n + 8;
        return ((long)a[n + 7] & 0xFFL) << 56 | (((long)a[n] & 0xFFL) | ((long)a[n + 1] & 0xFFL) << 8 | ((long)a[n + 2] & 0xFFL) << 16 | ((long)a[n + 3] & 0xFFL) << 24 | ((long)a[n + 4] & 0xFFL) << 32 | ((long)a[n + 5] & 0xFFL) << 40 | ((long)a[n + 6] & 0xFFL) << 48);
    }
    
    private interface a
    {
        void a();
    }
}
