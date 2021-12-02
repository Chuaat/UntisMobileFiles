// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections.builders;

import java.util.NoSuchElementException;
import java.util.Set;
import java.util.Arrays;
import kotlin.ranges.o;
import kotlin.collections.m;
import kotlin.jvm.internal.k0;
import java.util.Iterator;
import java.util.Collection;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import o6.g;
import java.util.Map;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u0000 u*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003:\u0006vwxyz{BG\b\u0002\u0012\f\u0010p\u001a\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u000e\u0010K\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\n\u0012\u0006\u0010_\u001a\u00020]\u0012\u0006\u0010i\u001a\u00020]\u0012\u0006\u0010h\u001a\u00020\u0004\u0012\u0006\u0010Q\u001a\u00020\u0004¢\u0006\u0004\bq\u0010rB\t\b\u0016¢\u0006\u0004\bq\u00107B\u0011\b\u0016\u0012\u0006\u0010s\u001a\u00020\u0004¢\u0006\u0004\bq\u0010tJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0002J\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0006H\u0002J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0004H\u0002J\u0010\u0010\u0001\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0004H\u0002J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u000fJ\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0017\u0010\u000fJ\u0010\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0010\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0004H\u0002J\u0018\u0010\u001e\u001a\u00020\u00142\u000e\u0010\u001d\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001cH\u0002J\u001c\u0010!\u001a\u00020\u00142\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001fH\u0002J\"\u0010$\u001a\u00020\u00142\u0018\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001f0\"H\u0002J\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001cJ\b\u0010&\u001a\u00020\u0014H\u0016J\u0017\u0010'\u001a\u00020\u00142\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0004\b)\u0010(J\u001a\u0010*\u001a\u0004\u0018\u00018\u00012\u0006\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b*\u0010+J!\u0010,\u001a\u0004\u0018\u00018\u00012\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0004\b,\u0010-J\u001e\u0010.\u001a\u00020\u00062\u0014\u0010#\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001cH\u0016J\u0019\u0010/\u001a\u0004\u0018\u00018\u00012\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b/\u0010+J\b\u00100\u001a\u00020\u0006H\u0016J\u0013\u00102\u001a\u00020\u00142\b\u0010\u001d\u001a\u0004\u0018\u000101H\u0096\u0002J\b\u00103\u001a\u00020\u0004H\u0016J\b\u00105\u001a\u000204H\u0016J\u000f\u00106\u001a\u00020\u0006H\u0000¢\u0006\u0004\b6\u00107J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u000fJ\u0017\u00108\u001a\u00020\u00042\u0006\u0010\r\u001a\u00028\u0000H\u0000¢\u0006\u0004\b8\u0010\u000fJ#\u00109\u001a\u00020\u00142\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001fH\u0000¢\u0006\u0004\b9\u0010:J\u001b\u0010<\u001a\u00020\u00142\n\u0010;\u001a\u0006\u0012\u0002\b\u00030\"H\u0000¢\u0006\u0004\b<\u0010=J#\u0010>\u001a\u00020\u00142\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001fH\u0000¢\u0006\u0004\b>\u0010:J\u0017\u0010@\u001a\u00020\u00142\u0006\u0010?\u001a\u00028\u0001H\u0000¢\u0006\u0004\b@\u0010(J\u001b\u0010B\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010AH\u0000¢\u0006\u0004\bB\u0010CJ\u001b\u0010E\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010DH\u0000¢\u0006\u0004\bE\u0010FJ\u001b\u0010H\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010GH\u0000¢\u0006\u0004\bH\u0010IR\u001e\u0010K\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010JR(\u0010P\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010M0L8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0016\u0010Q\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010$R$\u0010U\u001a\u00020\u00042\u0006\u0010R\u001a\u00020\u00048\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bB\u0010$\u001a\u0004\bS\u0010TR\u0016\u0010W\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010VR\u001e\u0010Z\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010YR\u0016\u0010\\\u001a\u00020\u00048B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b[\u0010TR\u0016\u0010_\u001a\u00020]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010^R\u0016\u0010`\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010$R\u001c\u0010d\u001a\b\u0012\u0004\u0012\u00028\u00010a8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bb\u0010cR$\u0010g\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010fR\u0016\u0010h\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010$R\u0016\u0010i\u001a\u00020]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010^R\u0016\u0010\b\u001a\u00020\u00048B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bj\u0010TR\u001e\u0010m\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010k8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010lR\u001c\u0010o\u001a\b\u0012\u0004\u0012\u00028\u00000L8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bn\u0010OR\u001c\u0010p\u001a\b\u0012\u0004\u0012\u00028\u00000\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010J¨\u0006|" }, d2 = { "Lkotlin/collections/builders/d;", "K", "V", "", "", "n", "Lkotlin/j2;", "w", "capacity", "v", "", "o", "()[Ljava/lang/Object;", "key", "G", "(Ljava/lang/Object;)I", "r", "newHashSize", "L", "i", "", "y", "value", "z", "index", "P", "removedHash", "N", "", "other", "u", "", "entry", "J", "", "from", "I", "p", "isEmpty", "containsKey", "(Ljava/lang/Object;)Z", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "remove", "clear", "", "equals", "hashCode", "", "toString", "q", "()V", "O", "t", "(Ljava/util/Map$Entry;)Z", "m", "s", "(Ljava/util/Collection;)Z", "M", "element", "Q", "Lkotlin/collections/builders/d$e;", "H", "()Lkotlin/collections/builders/d$e;", "Lkotlin/collections/builders/d$f;", "R", "()Lkotlin/collections/builders/d$f;", "Lkotlin/collections/builders/d$b;", "x", "()Lkotlin/collections/builders/d$b;", "[Ljava/lang/Object;", "valuesArray", "", "", "B", "()Ljava/util/Set;", "entries", "length", "<set-?>", "E", "()I", "size", "Z", "isReadOnly", "Lkotlin/collections/builders/g;", "Lkotlin/collections/builders/g;", "valuesView", "C", "hashSize", "", "[I", "presenceArray", "hashShift", "", "F", "()Ljava/util/Collection;", "values", "Lkotlin/collections/builders/e;", "Lkotlin/collections/builders/e;", "entriesView", "maxProbeDistance", "hashArray", "A", "Lkotlin/collections/builders/f;", "Lkotlin/collections/builders/f;", "keysView", "D", "keys", "keysArray", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;[I[III)V", "initialCapacity", "(I)V", "W", "a", "b", "c", "d", "e", "f", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public final class d<K, V> implements Map<K, V>, g
{
    @Deprecated
    private static final int S = -1640531527;
    @Deprecated
    private static final int T = 8;
    @Deprecated
    private static final int U = 2;
    @Deprecated
    private static final int V = -1;
    @org.jetbrains.annotations.e
    private static final a W;
    private int G;
    private int H;
    private kotlin.collections.builders.f<K> I;
    private kotlin.collections.builders.g<V> J;
    private kotlin.collections.builders.e<K, V> K;
    private boolean L;
    private K[] M;
    private V[] N;
    private int[] O;
    private int[] P;
    private int Q;
    private int R;
    
    static {
        W = new a(null);
    }
    
    public d() {
        this(8);
    }
    
    public d(final int n) {
        this(kotlin.collections.builders.c.d(n), null, new int[n], new int[d.W.c(n)], 2, 0);
    }
    
    private d(final K[] m, final V[] n, final int[] o, final int[] p6, final int q, final int r) {
        this.M = m;
        this.N = n;
        this.O = o;
        this.P = p6;
        this.Q = q;
        this.R = r;
        this.G = d.W.d(this.C());
    }
    
    private final int A() {
        return this.M.length;
    }
    
    private final int C() {
        return this.P.length;
    }
    
    private final int G(final K k) {
        int hashCode;
        if (k != null) {
            hashCode = k.hashCode();
        }
        else {
            hashCode = 0;
        }
        return hashCode * -1640531527 >>> this.G;
    }
    
    private final boolean I(final Collection<? extends Entry<? extends K, ? extends V>> collection) {
        final boolean empty = collection.isEmpty();
        boolean b = false;
        if (empty) {
            return false;
        }
        this.w(collection.size());
        final Iterator<? extends Entry<? extends K, ? extends V>> iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (this.J((Entry<? extends K, ? extends V>)iterator.next())) {
                b = true;
            }
        }
        return b;
    }
    
    private final boolean J(final Entry<? extends K, ? extends V> entry) {
        final int n = this.n(entry.getKey());
        final Object[] o = this.o();
        if (n >= 0) {
            o[n] = entry.getValue();
            return true;
        }
        final int n2 = -n - 1;
        if (k0.g(entry.getValue(), o[n2]) ^ true) {
            o[n2] = entry.getValue();
            return true;
        }
        return false;
    }
    
    private final boolean K(final int n) {
        int g = this.G(this.M[n]);
        int q = this.Q;
        while (true) {
            final int[] p = this.P;
            if (p[g] == 0) {
                p[g] = n + 1;
                this.O[n] = g;
                return true;
            }
            if (--q < 0) {
                return false;
            }
            if (g == 0) {
                g = this.C() - 1;
            }
            else {
                --g;
            }
        }
    }
    
    private final void L(int i) {
        if (this.R > this.size()) {
            this.r();
        }
        final int c = this.C();
        final int n = 0;
        if (i != c) {
            this.P = new int[i];
            this.G = d.W.d(i);
            i = n;
        }
        else {
            m.l2(this.P, 0, 0, this.C());
            i = n;
        }
        while (i < this.R) {
            if (!this.K(i)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            ++i;
        }
    }
    
    private final void N(int n) {
        int u = o.u(this.Q * 2, this.C() / 2);
        int n2 = 0;
        int n3 = n;
        int n4;
        int n8 = 0;
        do {
            if (n == 0) {
                n = this.C() - 1;
            }
            else {
                --n;
            }
            final int n5 = n2 + 1;
            if (n5 > this.Q) {
                this.P[n3] = 0;
                return;
            }
            final int[] p = this.P;
            final int n6 = p[n];
            if (n6 == 0) {
                p[n3] = 0;
                return;
            }
            Label_0167: {
                if (n6 < 0) {
                    p[n3] = -1;
                }
                else {
                    final K[] m = this.M;
                    final int n7 = n6 - 1;
                    n8 = n3;
                    if ((this.G(m[n7]) - n & this.C() - 1) < (n2 = n5)) {
                        break Label_0167;
                    }
                    this.P[n3] = n6;
                    this.O[n7] = n3;
                }
                n8 = n;
                n2 = 0;
            }
            n4 = u - 1;
            n3 = n8;
        } while ((u = n4) >= 0);
        this.P[n8] = -1;
    }
    
    private final void P(final int n) {
        kotlin.collections.builders.c.f(this.M, n);
        this.N(this.O[n]);
        this.O[n] = -1;
        this.H = this.size() - 1;
    }
    
    public static final /* synthetic */ Object[] b(final d d) {
        return d.M;
    }
    
    public static final /* synthetic */ int c(final d d) {
        return d.R;
    }
    
    public static final /* synthetic */ int[] d(final d d) {
        return d.O;
    }
    
    public static final /* synthetic */ Object[] e(final d d) {
        return d.N;
    }
    
    private final V[] o() {
        final V[] n = this.N;
        if (n != null) {
            return n;
        }
        return this.N = kotlin.collections.builders.c.d(this.A());
    }
    
    private final void r() {
        final V[] n = this.N;
        int n2 = 0;
        int r = 0;
        int r2;
        while (true) {
            r2 = this.R;
            if (n2 >= r2) {
                break;
            }
            int n3 = r;
            if (this.O[n2] >= 0) {
                final K[] m = this.M;
                m[r] = m[n2];
                if (n != null) {
                    n[r] = n[n2];
                }
                n3 = r + 1;
            }
            ++n2;
            r = n3;
        }
        kotlin.collections.builders.c.g(this.M, r, r2);
        if (n != null) {
            kotlin.collections.builders.c.g(n, r, this.R);
        }
        this.R = r;
    }
    
    private final boolean u(final Map<?, ?> map) {
        return this.size() == map.size() && this.s(map.entrySet());
    }
    
    private final void v(int newLength) {
        if (newLength > this.A()) {
            final int n = this.A() * 3 / 2;
            if (newLength <= n) {
                newLength = n;
            }
            this.M = kotlin.collections.builders.c.e(this.M, newLength);
            final V[] n2 = this.N;
            V[] e;
            if (n2 != null) {
                e = kotlin.collections.builders.c.e(n2, newLength);
            }
            else {
                e = null;
            }
            this.N = e;
            final int[] copy = Arrays.copyOf(this.O, newLength);
            k0.o(copy, "java.util.Arrays.copyOf(this, newSize)");
            this.O = copy;
            newLength = d.W.c(newLength);
            if (newLength <= this.C()) {
                return;
            }
        }
        else {
            if (this.R + newLength - this.size() <= this.A()) {
                return;
            }
            newLength = this.C();
        }
        this.L(newLength);
    }
    
    private final void w(final int n) {
        this.v(this.R + n);
    }
    
    private final int y(final K k) {
        int g = this.G(k);
        int q = this.Q;
        while (true) {
            int n = this.P[g];
            if (n == 0) {
                return -1;
            }
            if (n > 0) {
                final K[] m = this.M;
                --n;
                if (k0.g(m[n], k)) {
                    return n;
                }
            }
            if (--q < 0) {
                return -1;
            }
            if (g == 0) {
                g = this.C() - 1;
            }
            else {
                --g;
            }
        }
    }
    
    private final int z(final V v) {
        int r = this.R;
        while (true) {
            final int n = r - 1;
            if (n < 0) {
                return -1;
            }
            r = n;
            if (this.O[n] < 0) {
                continue;
            }
            final V[] n2 = this.N;
            k0.m(n2);
            r = n;
            if (k0.g(n2[n], v)) {
                return n;
            }
        }
    }
    
    @org.jetbrains.annotations.e
    public Set<Entry<K, V>> B() {
        kotlin.collections.builders.e<K, V> k;
        if ((k = this.K) == null) {
            k = new kotlin.collections.builders.e<K, V>((d<Object, Object>)this);
            this.K = k;
        }
        return (Set<Entry<K, V>>)k;
    }
    
    @org.jetbrains.annotations.e
    public Set<K> D() {
        kotlin.collections.builders.f<K> i;
        if ((i = this.I) == null) {
            i = new kotlin.collections.builders.f<K>(this);
            this.I = i;
        }
        return i;
    }
    
    public int E() {
        return this.H;
    }
    
    @org.jetbrains.annotations.e
    public Collection<V> F() {
        kotlin.collections.builders.g<V> j;
        if ((j = this.J) == null) {
            j = new kotlin.collections.builders.g<V>(this);
            this.J = j;
        }
        return j;
    }
    
    @org.jetbrains.annotations.e
    public final e<K, V> H() {
        return new e<K, V>(this);
    }
    
    public final boolean M(@org.jetbrains.annotations.e final Entry<? extends K, ? extends V> entry) {
        k0.p(entry, "entry");
        this.q();
        final int y = this.y(entry.getKey());
        if (y < 0) {
            return false;
        }
        final V[] n = this.N;
        k0.m(n);
        if (k0.g(n[y], entry.getValue()) ^ true) {
            return false;
        }
        this.P(y);
        return true;
    }
    
    public final int O(final K k) {
        this.q();
        final int y = this.y(k);
        if (y < 0) {
            return -1;
        }
        this.P(y);
        return y;
    }
    
    public final boolean Q(final V v) {
        this.q();
        final int z = this.z(v);
        if (z < 0) {
            return false;
        }
        this.P(z);
        return true;
    }
    
    @org.jetbrains.annotations.e
    public final f<K, V> R() {
        return new f<K, V>(this);
    }
    
    @Override
    public void clear() {
        this.q();
        final int n = this.R - 1;
        if (n >= 0) {
            int n2 = 0;
            while (true) {
                final int[] o = this.O;
                final int n3 = o[n2];
                if (n3 >= 0) {
                    this.P[n3] = 0;
                    o[n2] = -1;
                }
                if (n2 == n) {
                    break;
                }
                ++n2;
            }
        }
        kotlin.collections.builders.c.g(this.M, 0, this.R);
        final V[] n4 = this.N;
        if (n4 != null) {
            kotlin.collections.builders.c.g(n4, 0, this.R);
        }
        this.H = 0;
        this.R = 0;
    }
    
    @Override
    public boolean containsKey(final Object o) {
        return this.y(o) >= 0;
    }
    
    @Override
    public boolean containsValue(final Object o) {
        return this.z(o) >= 0;
    }
    
    @Override
    public final /* bridge */ Set<Entry<K, V>> entrySet() {
        return this.B();
    }
    
    @Override
    public boolean equals(@org.jetbrains.annotations.f final Object o) {
        return o == this || (o instanceof Map && this.u((Map<?, ?>)o));
    }
    
    @org.jetbrains.annotations.f
    @Override
    public V get(final Object o) {
        final int y = this.y(o);
        if (y < 0) {
            return null;
        }
        final V[] n = this.N;
        k0.m(n);
        return n[y];
    }
    
    @Override
    public int hashCode() {
        final b<K, V> x = this.x();
        int n = 0;
        while (x.hasNext()) {
            n += x.i();
        }
        return n;
    }
    
    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }
    
    @Override
    public final /* bridge */ Set<K> keySet() {
        return this.D();
    }
    
    public final int n(final K k) {
        this.q();
        while (true) {
            int g = this.G(k);
            final int u = o.u(this.Q * 2, this.C() / 2);
            int q = 0;
            while (true) {
                final int n = this.P[g];
                if (n <= 0) {
                    if (this.R >= this.A()) {
                        this.w(1);
                        break;
                    }
                    final int r = this.R;
                    final int r2 = r + 1;
                    this.R = r2;
                    this.M[r] = k;
                    this.O[r] = g;
                    this.P[g] = r2;
                    this.H = this.size() + 1;
                    if (q > this.Q) {
                        this.Q = q;
                    }
                    return r;
                }
                else {
                    if (k0.g(this.M[n - 1], k)) {
                        return -n;
                    }
                    if (++q > u) {
                        this.L(this.C() * 2);
                        break;
                    }
                    if (g == 0) {
                        g = this.C() - 1;
                    }
                    else {
                        --g;
                    }
                }
            }
        }
    }
    
    @org.jetbrains.annotations.e
    public final Map<K, V> p() {
        this.q();
        this.L = true;
        return this;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public V put(final K k, final V v) {
        this.q();
        final int n = this.n(k);
        final Object[] o = this.o();
        if (n < 0) {
            final int n2 = -n - 1;
            final Object o2 = o[n2];
            o[n2] = v;
            return (V)o2;
        }
        o[n] = v;
        return null;
    }
    
    @Override
    public void putAll(@org.jetbrains.annotations.e final Map<? extends K, ? extends V> map) {
        k0.p(map, "from");
        this.q();
        this.I((Collection<? extends Entry<? extends K, ? extends V>>)map.entrySet());
    }
    
    public final void q() {
        if (!this.L) {
            return;
        }
        throw new UnsupportedOperationException();
    }
    
    @org.jetbrains.annotations.f
    @Override
    public V remove(final Object o) {
        final int o2 = this.O(o);
        if (o2 < 0) {
            return null;
        }
        final V[] n = this.N;
        k0.m(n);
        final V v = n[o2];
        kotlin.collections.builders.c.f(n, o2);
        return v;
    }
    
    public final boolean s(@org.jetbrains.annotations.e final Collection<?> collection) {
        k0.p(collection, "m");
        final Iterator<?> iterator = collection.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                return true;
            }
            final Entry next = iterator.next();
            if (next == null) {
                return false;
            }
            try {
                if (!this.t(next)) {
                    return false;
                }
                continue;
            }
            catch (ClassCastException ex) {
                return false;
            }
        }
    }
    
    @Override
    public final /* bridge */ int size() {
        return this.E();
    }
    
    public final boolean t(@org.jetbrains.annotations.e final Entry<? extends K, ? extends V> entry) {
        k0.p(entry, "entry");
        final int y = this.y(entry.getKey());
        if (y < 0) {
            return false;
        }
        final V[] n = this.N;
        k0.m(n);
        return k0.g(n[y], entry.getValue());
    }
    
    @org.jetbrains.annotations.e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(this.size() * 3 + 2);
        sb.append("{");
        final b<K, V> x = this.x();
        int n = 0;
        while (x.hasNext()) {
            if (n > 0) {
                sb.append(", ");
            }
            x.h(sb);
            ++n;
        }
        sb.append("}");
        final String string = sb.toString();
        k0.o(string, "sb.toString()");
        return string;
    }
    
    @Override
    public final /* bridge */ Collection<V> values() {
        return this.F();
    }
    
    @org.jetbrains.annotations.e
    public final b<K, V> x() {
        return new b<K, V>(this);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\b¨\u0006\u000e" }, d2 = { "kotlin/collections/builders/d$a", "", "", "capacity", "c", "hashSize", "d", "INITIAL_CAPACITY", "I", "INITIAL_MAX_PROBE_DISTANCE", "MAGIC", "TOMBSTONE", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
    private static final class a
    {
        private final int c(final int n) {
            return Integer.highestOneBit(o.n(n, 1) * 3);
        }
        
        private final int d(final int i) {
            return Integer.numberOfLeadingZeros(i) + 1;
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00050\u0004B\u001b\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006H\u0096\u0002J\u000f\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u00060\u000bj\u0002`\f¨\u0006\u0014" }, d2 = { "kotlin/collections/builders/d$b", "K", "V", "Lkotlin/collections/builders/d$d;", "", "", "Lkotlin/collections/builders/d$c;", "g", "", "i", "()I", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "sb", "Lkotlin/j2;", "h", "Lkotlin/collections/builders/d;", "map", "<init>", "(Lkotlin/collections/builders/d;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
    public static final class b<K, V> extends d<K, V> implements Iterator<Entry<K, V>>, d
    {
        public b(@org.jetbrains.annotations.e final d<K, V> d) {
            k0.p(d, "map");
            super(d);
        }
        
        @org.jetbrains.annotations.e
        public c<K, V> g() {
            if (this.a() < d.c(this.c())) {
                final int a = this.a();
                this.e(a + 1);
                this.f(a);
                final c c = new c(this.c(), this.b());
                this.d();
                return (c<K, V>)c;
            }
            throw new NoSuchElementException();
        }
        
        public final void h(@org.jetbrains.annotations.e final StringBuilder sb) {
            k0.p(sb, "sb");
            if (this.a() < d.c(this.c())) {
                final int a = this.a();
                this.e(a + 1);
                this.f(a);
                final Object obj = d.b(this.c())[this.b()];
                if (k0.g(obj, this.c())) {
                    sb.append("(this Map)");
                }
                else {
                    sb.append(obj);
                }
                sb.append('=');
                final Object[] e = d.e(this.c());
                k0.m(e);
                final Object obj2 = e[this.b()];
                if (k0.g(obj2, this.c())) {
                    sb.append("(this Map)");
                }
                else {
                    sb.append(obj2);
                }
                this.d();
                return;
            }
            throw new NoSuchElementException();
        }
        
        public final int i() {
            if (this.a() < d.c(this.c())) {
                final int a = this.a();
                this.e(a + 1);
                this.f(a);
                final Object o = d.b(this.c())[this.b()];
                int hashCode = 0;
                int hashCode2;
                if (o != null) {
                    hashCode2 = o.hashCode();
                }
                else {
                    hashCode2 = 0;
                }
                final Object[] e = d.e(this.c());
                k0.m(e);
                final Object o2 = e[this.b()];
                if (o2 != null) {
                    hashCode = o2.hashCode();
                }
                this.d();
                return hashCode2 ^ hashCode;
            }
            throw new NoSuchElementException();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0002\b\u0003\n\u0002\u0010'\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003B#\u0012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0015\u0012\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u0005\u001a\u00028\u00032\u0006\u0010\u0004\u001a\u00028\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0016\u0010\u0011\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00028\u00028V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00028\u00038V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0013¨\u0006\u001d" }, d2 = { "kotlin/collections/builders/d$c", "K", "V", "", "newValue", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "other", "", "equals", "", "hashCode", "", "toString", "H", "I", "index", "getKey", "()Ljava/lang/Object;", "key", "Lkotlin/collections/builders/d;", "G", "Lkotlin/collections/builders/d;", "map", "getValue", "value", "<init>", "(Lkotlin/collections/builders/d;I)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
    public static final class c<K, V> implements Entry<K, V>, g.a
    {
        private final d<K, V> G;
        private final int H;
        
        public c(@org.jetbrains.annotations.e final d<K, V> g, final int h) {
            k0.p(g, "map");
            this.G = g;
            this.H = h;
        }
        
        @Override
        public boolean equals(@org.jetbrains.annotations.f final Object o) {
            if (o instanceof Entry) {
                final Entry entry = (Entry)o;
                if (k0.g(entry.getKey(), this.getKey()) && k0.g(entry.getValue(), this.getValue())) {
                    return true;
                }
            }
            return false;
        }
        
        @Override
        public K getKey() {
            return (K)d.b((d<Object, Object>)this.G)[this.H];
        }
        
        @Override
        public V getValue() {
            final Object[] e = d.e((d<Object, Object>)this.G);
            k0.m(e);
            return (V)e[this.H];
        }
        
        @Override
        public int hashCode() {
            final Object key = this.getKey();
            int hashCode = 0;
            int hashCode2;
            if (key != null) {
                hashCode2 = key.hashCode();
            }
            else {
                hashCode2 = 0;
            }
            final Object value = this.getValue();
            if (value != null) {
                hashCode = value.hashCode();
            }
            return hashCode2 ^ hashCode;
        }
        
        @Override
        public V setValue(final V v) {
            this.G.q();
            final Object[] a = ((d<Object, Object>)this.G).o();
            final int h = this.H;
            final Object o = a[h];
            a[h] = v;
            return (V)o;
        }
        
        @org.jetbrains.annotations.e
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.getKey());
            sb.append('=');
            sb.append(this.getValue());
            return sb.toString();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\b\u0010\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u001b\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\u0004R(\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0016\u001a\u00020\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001a\u001a\u00020\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015¨\u0006\u001d" }, d2 = { "kotlin/collections/builders/d$d", "K", "V", "", "Lkotlin/j2;", "d", "()V", "", "hasNext", "remove", "Lkotlin/collections/builders/d;", "I", "Lkotlin/collections/builders/d;", "c", "()Lkotlin/collections/builders/d;", "map", "", "H", "b", "()I", "f", "(I)V", "lastIndex", "G", "a", "e", "index", "<init>", "(Lkotlin/collections/builders/d;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
    public static class d<K, V>
    {
        private int G;
        private int H;
        @org.jetbrains.annotations.e
        private final kotlin.collections.builders.d<K, V> I;
        
        public d(@org.jetbrains.annotations.e final kotlin.collections.builders.d<K, V> i) {
            k0.p(i, "map");
            this.I = i;
            this.H = -1;
            this.d();
        }
        
        public final int a() {
            return this.G;
        }
        
        public final int b() {
            return this.H;
        }
        
        @org.jetbrains.annotations.e
        public final kotlin.collections.builders.d<K, V> c() {
            return this.I;
        }
        
        public final void d() {
            while (this.G < kotlin.collections.builders.d.c((kotlin.collections.builders.d<Object, Object>)this.I)) {
                final int[] d = kotlin.collections.builders.d.d((kotlin.collections.builders.d<Object, Object>)this.I);
                final int g = this.G;
                if (d[g] >= 0) {
                    break;
                }
                this.G = g + 1;
            }
        }
        
        public final void e(final int g) {
            this.G = g;
        }
        
        public final void f(final int h) {
            this.H = h;
        }
        
        public final boolean hasNext() {
            return this.G < kotlin.collections.builders.d.c((kotlin.collections.builders.d<Object, Object>)this.I);
        }
        
        public final void remove() {
            this.I.q();
            ((kotlin.collections.builders.d<Object, Object>)this.I).P(this.H);
            this.H = -1;
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B\u001b\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b" }, d2 = { "kotlin/collections/builders/d$e", "K", "V", "Lkotlin/collections/builders/d$d;", "", "next", "()Ljava/lang/Object;", "Lkotlin/collections/builders/d;", "map", "<init>", "(Lkotlin/collections/builders/d;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
    public static final class e<K, V> extends d<K, V> implements Iterator<K>, d
    {
        public e(@org.jetbrains.annotations.e final d<K, V> d) {
            k0.p(d, "map");
            super(d);
        }
        
        @Override
        public K next() {
            if (this.a() < d.c(this.c())) {
                final int a = this.a();
                this.e(a + 1);
                this.f(a);
                final Object o = d.b(this.c())[this.b()];
                this.d();
                return (K)o;
            }
            throw new NoSuchElementException();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\b\u0012\u0004\u0012\u00028\u00030\u0004B\u001b\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00028\u0003H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b" }, d2 = { "kotlin/collections/builders/d$f", "K", "V", "Lkotlin/collections/builders/d$d;", "", "next", "()Ljava/lang/Object;", "Lkotlin/collections/builders/d;", "map", "<init>", "(Lkotlin/collections/builders/d;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
    public static final class f<K, V> extends d<K, V> implements Iterator<V>, d
    {
        public f(@org.jetbrains.annotations.e final d<K, V> d) {
            k0.p(d, "map");
            super(d);
        }
        
        @Override
        public V next() {
            if (this.a() < d.c(this.c())) {
                final int a = this.a();
                this.e(a + 1);
                this.f(a);
                final Object[] e = d.e(this.c());
                k0.m(e);
                final Object o = e[this.b()];
                this.d();
                return (V)o;
            }
            throw new NoSuchElementException();
        }
    }
}
