// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Objects;
import java.util.NoSuchElementException;
import java.util.Arrays;
import java.util.Stack;
import java.io.InputStream;
import java.util.Iterator;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

class u extends kotlin.reflect.jvm.internal.impl.protobuf.d
{
    private static final int[] O;
    private final int I;
    private final kotlin.reflect.jvm.internal.impl.protobuf.d J;
    private final kotlin.reflect.jvm.internal.impl.protobuf.d K;
    private final int L;
    private final int M;
    private int N;
    
    static {
        final ArrayList<Integer> list = new ArrayList<Integer>();
        int i = 1;
        int n = 1;
        while (true) {
            final int n2 = n;
            if (i <= 0) {
                break;
            }
            list.add(i);
            n = i;
            i += n2;
        }
        list.add(Integer.MAX_VALUE);
        O = new int[list.size()];
        int n3 = 0;
        while (true) {
            final int[] o = u.O;
            if (n3 >= o.length) {
                break;
            }
            o[n3] = list.get(n3);
            ++n3;
        }
    }
    
    private u(final kotlin.reflect.jvm.internal.impl.protobuf.d j, final kotlin.reflect.jvm.internal.impl.protobuf.d k) {
        this.N = 0;
        this.J = j;
        this.K = k;
        final int size = j.size();
        this.L = size;
        this.I = size + k.size();
        this.M = Math.max(j.o(), k.o()) + 1;
    }
    
    static kotlin.reflect.jvm.internal.impl.protobuf.d I(kotlin.reflect.jvm.internal.impl.protobuf.d d, kotlin.reflect.jvm.internal.impl.protobuf.d d2) {
        u u;
        if (d instanceof u) {
            u = (u)d;
        }
        else {
            u = null;
        }
        if (d2.size() != 0) {
            if (d.size() != 0) {
                final int n = d.size() + d2.size();
                if (n < 128) {
                    d = J(d, d2);
                    return d;
                }
                if (u != null && u.K.size() + d2.size() < 128) {
                    d2 = new u(u.J, J(u.K, d2));
                }
                else if (u != null && u.J.o() > u.K.o() && u.o() > d2.o()) {
                    d2 = new u(u.J, new u(u.K, d2));
                }
                else {
                    if (n >= kotlin.reflect.jvm.internal.impl.protobuf.u.O[Math.max(d.o(), d2.o()) + 1]) {
                        d = new u(d, d2);
                        return d;
                    }
                    d = new b().b(d, d2);
                    return d;
                }
            }
            d = d2;
        }
        return d;
    }
    
    private static p J(final kotlin.reflect.jvm.internal.impl.protobuf.d d, final kotlin.reflect.jvm.internal.impl.protobuf.d d2) {
        final int size = d.size();
        final int size2 = d2.size();
        final byte[] array = new byte[size + size2];
        d.m(array, 0, 0, size);
        d2.m(array, 0, size, size2);
        return new p(array);
    }
    
    private boolean K(final kotlin.reflect.jvm.internal.impl.protobuf.d d) {
        final c c = new c((kotlin.reflect.jvm.internal.impl.protobuf.d)this);
        p p = c.next();
        final c c2 = new c(d);
        p p2 = c2.next();
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        while (true) {
            final int a = p.size() - n;
            final int b = p2.size() - n2;
            final int min = Math.min(a, b);
            boolean b2;
            if (n == 0) {
                b2 = p.G(p2, n2, min);
            }
            else {
                b2 = p2.G(p, n, min);
            }
            if (!b2) {
                return false;
            }
            n3 += min;
            final int i = this.I;
            if (n3 >= i) {
                if (n3 == i) {
                    return true;
                }
                throw new IllegalStateException();
            }
            else {
                if (min == a) {
                    p = c.next();
                    n = 0;
                }
                else {
                    n += min;
                }
                if (min == b) {
                    p2 = c2.next();
                    n2 = 0;
                }
                else {
                    n2 += min;
                }
            }
        }
    }
    
    @Override
    public String B(final String charsetName) throws UnsupportedEncodingException {
        return new String(this.A(), charsetName);
    }
    
    @Override
    void E(final OutputStream outputStream, int n, final int n2) throws IOException {
        final int l = this.L;
        kotlin.reflect.jvm.internal.impl.protobuf.d d;
        if (n + n2 <= l) {
            d = this.J;
        }
        else {
            if (n < l) {
                final int n3 = l - n;
                this.J.E(outputStream, n, n3);
                this.K.E(outputStream, 0, n2 - n3);
                return;
            }
            d = this.K;
            n -= l;
        }
        d.E(outputStream, n, n2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof kotlin.reflect.jvm.internal.impl.protobuf.d)) {
            return false;
        }
        final kotlin.reflect.jvm.internal.impl.protobuf.d d = (kotlin.reflect.jvm.internal.impl.protobuf.d)o;
        if (this.I != d.size()) {
            return false;
        }
        if (this.I == 0) {
            return true;
        }
        if (this.N != 0) {
            final int z = d.z();
            if (z != 0 && this.N != z) {
                return false;
            }
        }
        return this.K(d);
    }
    
    @Override
    public int hashCode() {
        int n;
        if ((n = this.N) == 0) {
            final int i = this.I;
            if ((n = this.w(i, 0, i)) == 0) {
                n = 1;
            }
            this.N = n;
        }
        return n;
    }
    
    @Override
    protected void n(final byte[] array, int n, final int n2, final int n3) {
        final int l = this.L;
        kotlin.reflect.jvm.internal.impl.protobuf.d d;
        if (n + n3 <= l) {
            d = this.J;
        }
        else {
            if (n < l) {
                final int n4 = l - n;
                this.J.n(array, n, n2, n4);
                this.K.n(array, 0, n2 + n4, n3 - n4);
                return;
            }
            d = this.K;
            n -= l;
        }
        d.n(array, n, n2, n3);
    }
    
    @Override
    protected int o() {
        return this.M;
    }
    
    @Override
    protected boolean p() {
        return this.I >= u.O[this.M];
    }
    
    @Override
    public boolean q() {
        final kotlin.reflect.jvm.internal.impl.protobuf.d j = this.J;
        final int l = this.L;
        boolean b = false;
        final int x = j.x(0, 0, l);
        final kotlin.reflect.jvm.internal.impl.protobuf.d k = this.K;
        if (k.x(x, 0, k.size()) == 0) {
            b = true;
        }
        return b;
    }
    
    @Override
    public a r() {
        return new d();
    }
    
    @Override
    public int size() {
        return this.I;
    }
    
    @Override
    public kotlin.reflect.jvm.internal.impl.protobuf.e t() {
        return kotlin.reflect.jvm.internal.impl.protobuf.e.g(new e());
    }
    
    @Override
    protected int w(int w, final int n, final int n2) {
        final int l = this.L;
        if (n + n2 <= l) {
            return this.J.w(w, n, n2);
        }
        if (n >= l) {
            return this.K.w(w, n - l, n2);
        }
        final int n3 = l - n;
        w = this.J.w(w, n, n3);
        return this.K.w(w, 0, n2 - n3);
    }
    
    @Override
    protected int x(int x, final int n, final int n2) {
        final int l = this.L;
        if (n + n2 <= l) {
            return this.J.x(x, n, n2);
        }
        if (n >= l) {
            return this.K.x(x, n - l, n2);
        }
        final int n3 = l - n;
        x = this.J.x(x, n, n3);
        return this.K.x(x, 0, n2 - n3);
    }
    
    @Override
    protected int z() {
        return this.N;
    }
    
    private static class b
    {
        private final Stack<kotlin.reflect.jvm.internal.impl.protobuf.d> a;
        
        private b() {
            this.a = new Stack<kotlin.reflect.jvm.internal.impl.protobuf.d>();
        }
        
        private kotlin.reflect.jvm.internal.impl.protobuf.d b(kotlin.reflect.jvm.internal.impl.protobuf.d o, final kotlin.reflect.jvm.internal.impl.protobuf.d d) {
            this.c((kotlin.reflect.jvm.internal.impl.protobuf.d)o);
            this.c(d);
            o = this.a.pop();
            while (!this.a.isEmpty()) {
                o = new u(this.a.pop(), (kotlin.reflect.jvm.internal.impl.protobuf.d)o, null);
            }
            return (kotlin.reflect.jvm.internal.impl.protobuf.d)o;
        }
        
        private void c(final kotlin.reflect.jvm.internal.impl.protobuf.d d) {
            if (d.p()) {
                this.e(d);
            }
            else {
                if (!(d instanceof u)) {
                    final String value = String.valueOf(d.getClass());
                    final StringBuilder sb = new StringBuilder(value.length() + 49);
                    sb.append("Has a new type of ByteString been created? Found ");
                    sb.append(value);
                    throw new IllegalArgumentException(sb.toString());
                }
                final u u = (u)d;
                this.c(u.J);
                this.c(u.K);
            }
        }
        
        private int d(int binarySearch) {
            final int n = binarySearch = Arrays.binarySearch(u.O, binarySearch);
            if (n < 0) {
                binarySearch = -(n + 1) - 1;
            }
            return binarySearch;
        }
        
        private void e(final kotlin.reflect.jvm.internal.impl.protobuf.d item) {
            final int d = this.d(item.size());
            final int n = u.O[d + 1];
            if (!this.a.isEmpty() && this.a.peek().size() < n) {
                final int n2 = u.O[d];
                kotlin.reflect.jvm.internal.impl.protobuf.d d2 = this.a.pop();
                while (!this.a.isEmpty() && this.a.peek().size() < n2) {
                    d2 = new u(this.a.pop(), d2, null);
                }
                u item2;
                for (item2 = new u(d2, item, null); !this.a.isEmpty() && this.a.peek().size() < u.O[this.d(item2.size()) + 1]; item2 = new u(this.a.pop(), item2, null)) {}
                this.a.push(item2);
            }
            else {
                this.a.push(item);
            }
        }
    }
    
    private static class c implements Iterator<p>
    {
        private final Stack<u> G;
        private p H;
        
        private c(final kotlin.reflect.jvm.internal.impl.protobuf.d d) {
            this.G = new Stack<u>();
            this.H = this.a(d);
        }
        
        private p a(kotlin.reflect.jvm.internal.impl.protobuf.d f) {
            while (f instanceof u) {
                final u item = (u)f;
                this.G.push(item);
                f = item.J;
            }
            return (p)f;
        }
        
        private p b() {
            while (!this.G.isEmpty()) {
                final p a = this.a(this.G.pop().K);
                if (!a.isEmpty()) {
                    return a;
                }
            }
            return null;
        }
        
        public p c() {
            final p h = this.H;
            if (h != null) {
                this.H = this.b();
                return h;
            }
            throw new NoSuchElementException();
        }
        
        @Override
        public boolean hasNext() {
            return this.H != null;
        }
        
        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
    
    private class d implements a
    {
        private final c G;
        private a H;
        int I;
        
        private d() {
            final c g = new c((kotlin.reflect.jvm.internal.impl.protobuf.d)u.this);
            this.G = g;
            this.H = g.c().r();
            this.I = u.this.size();
        }
        
        public Byte a() {
            return this.n();
        }
        
        @Override
        public boolean hasNext() {
            return this.I > 0;
        }
        
        @Override
        public byte n() {
            if (!this.H.hasNext()) {
                this.H = this.G.c().r();
            }
            --this.I;
            return this.H.n();
        }
        
        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
    
    private class e extends InputStream
    {
        private c G;
        private p H;
        private int I;
        private int J;
        private int K;
        private int L;
        
        public e() {
            this.b();
        }
        
        private void a() {
            if (this.H != null) {
                final int j = this.J;
                final int i = this.I;
                if (j == i) {
                    this.K += i;
                    int size = 0;
                    this.J = 0;
                    if (this.G.hasNext()) {
                        final p c = this.G.c();
                        this.H = c;
                        size = c.size();
                    }
                    else {
                        this.H = null;
                    }
                    this.I = size;
                }
            }
        }
        
        private void b() {
            final c g = new c((kotlin.reflect.jvm.internal.impl.protobuf.d)u.this);
            this.G = g;
            final p c = g.c();
            this.H = c;
            this.I = c.size();
            this.J = 0;
            this.K = 0;
        }
        
        private int c(final byte[] array, int n, final int n2) {
            int i = n2;
            int n3 = n;
            while (i > 0) {
                this.a();
                if (this.H == null) {
                    if (i == n2) {
                        return -1;
                    }
                    break;
                }
                else {
                    final int min = Math.min(this.I - this.J, i);
                    n = n3;
                    if (array != null) {
                        this.H.m(array, this.J, n3, min);
                        n = n3 + min;
                    }
                    this.J += min;
                    i -= min;
                    n3 = n;
                }
            }
            return n2 - i;
        }
        
        @Override
        public int available() throws IOException {
            return u.this.size() - (this.K + this.J);
        }
        
        @Override
        public void mark(final int n) {
            this.L = this.K + this.J;
        }
        
        @Override
        public boolean markSupported() {
            return true;
        }
        
        @Override
        public int read() throws IOException {
            this.a();
            final p h = this.H;
            if (h == null) {
                return -1;
            }
            return h.F(this.J++) & 0xFF;
        }
        
        @Override
        public int read(final byte[] obj, final int n, final int n2) {
            Objects.requireNonNull(obj);
            if (n >= 0 && n2 >= 0 && n2 <= obj.length - n) {
                return this.c(obj, n, n2);
            }
            throw new IndexOutOfBoundsException();
        }
        
        @Override
        public void reset() {
            synchronized (this) {
                this.b();
                this.c(null, 0, this.L);
            }
        }
        
        @Override
        public long skip(final long n) {
            if (n >= 0L) {
                long n2 = n;
                if (n > 2147483647L) {
                    n2 = 2147483647L;
                }
                return this.c(null, 0, (int)n2);
            }
            throw new IndexOutOfBoundsException();
        }
    }
}
