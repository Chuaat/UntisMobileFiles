// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections;

import java.util.Arrays;
import kotlin.ranges.o;
import java.util.Iterator;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import java.util.RandomAccess;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u001f\u0012\u000e\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000f\u0012\u0006\u0010(\u001a\u00020\u0005¢\u0006\u0004\b)\u0010*B\u0011\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u0005¢\u0006\u0004\b)\u0010+J\u0015\u0010\u0007\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0082\bJ\u0018\u0010\t\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\f\u001a\u00020\u000bJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0096\u0002J)\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f\"\u0004\b\u0001\u0010\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0014J\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0015\u001a\u00020\u0005J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00028\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u0005R\u0016\u0010\u001e\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR$\u0010#\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00058\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\"R\u001e\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001d¨\u0006," }, d2 = { "Lkotlin/collections/i1;", "T", "Lkotlin/collections/d;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "n", "t", "index", "get", "(I)Ljava/lang/Object;", "", "v", "", "iterator", "", "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "()[Ljava/lang/Object;", "maxCapacity", "r", "element", "Lkotlin/j2;", "q", "(Ljava/lang/Object;)V", "w", "H", "I", "capacity", "<set-?>", "J", "b", "()I", "size", "K", "[Ljava/lang/Object;", "buffer", "startIndex", "filledSize", "<init>", "([Ljava/lang/Object;I)V", "(I)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
final class i1<T> extends d<T> implements RandomAccess
{
    private final int H;
    private int I;
    private int J;
    private final Object[] K;
    
    public i1(final int n) {
        this(new Object[n], 0);
    }
    
    public i1(@e final Object[] k, final int i) {
        k0.p(k, "buffer");
        this.K = k;
        final int n = 1;
        if (i < 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("ring buffer filled size should not be negative but it is ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        int n2;
        if (i <= k.length) {
            n2 = n;
        }
        else {
            n2 = 0;
        }
        if (n2 != 0) {
            this.H = k.length;
            this.J = i;
            return;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("ring buffer filled size: ");
        sb2.append(i);
        sb2.append(" cannot be larger than the buffer size: ");
        sb2.append(k.length);
        throw new IllegalArgumentException(sb2.toString().toString());
    }
    
    public static final /* synthetic */ Object[] h(final i1 i1) {
        return i1.K;
    }
    
    public static final /* synthetic */ int i(final i1 i1) {
        return i1.H;
    }
    
    public static final /* synthetic */ int n(final i1 i1) {
        return i1.I;
    }
    
    private final int t(final int n, final int n2) {
        return (n + n2) % i(this);
    }
    
    @Override
    public int b() {
        return this.J;
    }
    
    @Override
    public T get(final int n) {
        d.G.b(n, this.size());
        return (T)this.K[(this.I + n) % i(this)];
    }
    
    @e
    @Override
    public Iterator<T> iterator() {
        return new kotlin.collections.c<T>() {
            private int I = i1.this.size();
            private int J = i1.n(i1.this);
            final /* synthetic */ i1 K;
            
            @Override
            protected void a() {
                if (this.I == 0) {
                    this.b();
                }
                else {
                    this.c((T)i1.h(this.K)[this.J]);
                    this.J = (this.J + 1) % i1.i(this.K);
                    --this.I;
                }
            }
        };
    }
    
    public final void q(final T t) {
        if (!this.v()) {
            this.K[(this.I + this.size()) % i(this)] = t;
            this.J = this.size() + 1;
            return;
        }
        throw new IllegalStateException("ring buffer is full");
    }
    
    @e
    public final i1<T> r(int u) {
        final int h = this.H;
        u = o.u(h + (h >> 1) + 1, u);
        Object[] array;
        if (this.I == 0) {
            array = Arrays.copyOf(this.K, u);
            k0.o(array, "java.util.Arrays.copyOf(this, newSize)");
        }
        else {
            array = this.toArray(new Object[u]);
        }
        return new i1<T>(array, this.size());
    }
    
    @e
    @Override
    public Object[] toArray() {
        return this.toArray(new Object[this.size()]);
    }
    
    @e
    @Override
    public <T> T[] toArray(@e final T[] original) {
        k0.p(original, "array");
        T[] copy = original;
        if (original.length < this.size()) {
            copy = Arrays.copyOf(original, this.size());
            k0.o(copy, "java.util.Arrays.copyOf(this, newSize)");
        }
        final int size = this.size();
        int i = this.I;
        final int n = 0;
        int n2 = 0;
        int n3;
        int j;
        while (true) {
            n3 = n;
            j = n2;
            if (n2 >= size) {
                break;
            }
            n3 = n;
            j = n2;
            if (i >= this.H) {
                break;
            }
            copy[n2] = (T)this.K[i];
            ++n2;
            ++i;
        }
        while (j < size) {
            copy[j] = (T)this.K[n3];
            ++j;
            ++n3;
        }
        if (copy.length > this.size()) {
            copy[this.size()] = null;
        }
        return copy;
    }
    
    public final boolean v() {
        return this.size() == this.H;
    }
    
    public final void w(final int n) {
        final int n2 = 1;
        if (n < 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("n shouldn't be negative but it is ");
            sb.append(n);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        int n3;
        if (n <= this.size()) {
            n3 = n2;
        }
        else {
            n3 = 0;
        }
        if (n3 != 0) {
            if (n > 0) {
                final int i = this.I;
                final int j = (i + n) % i(this);
                if (i > j) {
                    m.n2(this.K, null, i, this.H);
                    m.n2(this.K, null, 0, j);
                }
                else {
                    m.n2(this.K, null, i, j);
                }
                this.I = j;
                this.J = this.size() - n;
            }
            return;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("n shouldn't be greater than the buffer size: n = ");
        sb2.append(n);
        sb2.append(", size = ");
        sb2.append(this.size());
        throw new IllegalArgumentException(sb2.toString().toString());
    }
}
