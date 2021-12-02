// 
// Decompiled by Procyon v0.5.36
// 

package okio;

import java.util.Arrays;
import java.util.Objects;
import java.util.ArrayList;
import kotlin.collections.v;
import kotlin.jvm.internal.k0;
import java.util.List;
import m6.k;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import java.util.RandomAccess;
import kotlin.collections.d;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\n\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004:\u0001\u001aB!\b\u0002\u0012\u000e\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0011\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002R\u001c\u0010\r\u001a\u00020\b8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u00020\u00058V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00118\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001b" }, d2 = { "Lokio/g0;", "Lkotlin/collections/d;", "Lokio/p;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "index", "h", "", "I", "[I", "k", "()[I", "trie", "b", "()I", "size", "", "H", "[Lokio/p;", "i", "()[Lokio/p;", "byteStrings", "<init>", "([Lokio/p;[I)V", "J", "a", "okio" }, k = 1, mv = { 1, 4, 1 })
public final class g0 extends d<p> implements RandomAccess
{
    @e
    public static final a J;
    @e
    private final p[] H;
    @e
    private final int[] I;
    
    static {
        J = new a(null);
    }
    
    private g0(final p[] h, final int[] i) {
        this.H = h;
        this.I = i;
    }
    
    @k
    @e
    public static final g0 p(@e final p... array) {
        return g0.J.d(array);
    }
    
    public int b() {
        return this.H.length;
    }
    
    public final /* bridge */ boolean contains(final Object o) {
        return o instanceof p && this.f((p)o);
    }
    
    public /* bridge */ boolean f(final p p) {
        return super.contains((Object)p);
    }
    
    @e
    public p h(final int n) {
        return this.H[n];
    }
    
    @e
    public final p[] i() {
        return this.H;
    }
    
    public final /* bridge */ int indexOf(final Object o) {
        if (o instanceof p) {
            return this.n((p)o);
        }
        return -1;
    }
    
    @e
    public final int[] k() {
        return this.I;
    }
    
    public final /* bridge */ int lastIndexOf(final Object o) {
        if (o instanceof p) {
            return this.o((p)o);
        }
        return -1;
    }
    
    public /* bridge */ int n(final p p) {
        return super.indexOf((Object)p);
    }
    
    public /* bridge */ int o(final p p) {
        return super.lastIndexOf((Object)p);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018JT\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0002J#\u0010\u0012\u001a\u00020\u00112\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\u0010\"\u00020\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\u0002*\u00020\u00048B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019" }, d2 = { "okio/g0$a", "", "", "nodeOffset", "Lokio/m;", "node", "", "byteStringOffset", "", "Lokio/p;", "byteStrings", "fromIndex", "toIndex", "indexes", "Lkotlin/j2;", "a", "", "Lokio/g0;", "d", "([Lokio/p;)Lokio/g0;", "c", "(Lokio/m;)J", "intCount", "<init>", "()V", "okio" }, k = 1, mv = { 1, 4, 1 })
    public static final class a
    {
        private a() {
        }
        
        private final void a(long n, final m m, int i, final List<? extends p> list, int j, final int n2, final List<Integer> list2) {
            int k = i;
            if (j < n2) {
                i = 1;
            }
            else {
                i = 0;
            }
            if (i != 0) {
                for (i = j; i < n2; ++i) {
                    if (((p)list.get(i)).size() < k) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                }
                p p7 = (p)list.get(j);
                final p p8 = (p)list.get(n2 - 1);
                if (k == p7.size()) {
                    final int intValue = list2.get(j).intValue();
                    i = j + 1;
                    p7 = (p)list.get(i);
                    j = intValue;
                }
                else {
                    i = j;
                    j = -1;
                }
                if (p7.u(k) != p8.u(k)) {
                    int l = i + 1;
                    int n3 = 1;
                    while (l < n2) {
                        int n4 = n3;
                        if (((p)list.get(l - 1)).u(k) != ((p)list.get(l)).u(k)) {
                            n4 = n3 + 1;
                        }
                        ++l;
                        n3 = n4;
                    }
                    n = n + this.c(m) + 2 + n3 * 2;
                    m.M0(n3);
                    m.M0(j);
                    byte u;
                    for (j = i; j < n2; ++j) {
                        u = ((p)list.get(j)).u(k);
                        if (j == i || u != ((p)list.get(j - 1)).u(k)) {
                            m.M0(u & 0xFF);
                        }
                    }
                    final m m2 = new m();
                    j = i;
                Label_0394:
                    while (j < n2) {
                        final byte u2 = ((p)list.get(j)).u(k);
                        while (true) {
                            for (int n5 = i = j + 1; i < n2; ++i) {
                                if (u2 != ((p)list.get(i)).u(k)) {
                                    if (n5 == i && k + 1 == ((p)list.get(j)).size()) {
                                        m.M0(list2.get(j).intValue());
                                    }
                                    else {
                                        m.M0((int)(n + this.c(m2)) * -1);
                                        this.a(n, m2, k + 1, list, j, i, list2);
                                    }
                                    j = i;
                                    continue Label_0394;
                                }
                            }
                            i = n2;
                            continue;
                        }
                    }
                    m.z3(m2);
                }
                else {
                    final int min = Math.min(p7.size(), p8.size());
                    int n6 = k;
                    int n7 = 0;
                    while (n6 < min && p7.u(n6) == p8.u(n6)) {
                        ++n7;
                        ++n6;
                    }
                    n = n + this.c(m) + 2 + n7 + 1L;
                    m.M0(-n7);
                    m.M0(j);
                    for (j = k + n7; k < j; ++k) {
                        m.M0(p7.u(k) & 0xFF);
                    }
                    if (i + 1 == n2) {
                        if (j == ((p)list.get(i)).size()) {
                            j = 1;
                        }
                        else {
                            j = 0;
                        }
                        if (j == 0) {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                        m.M0(list2.get(i).intValue());
                    }
                    else {
                        final m m3 = new m();
                        m.M0((int)(this.c(m3) + n) * -1);
                        this.a(n, m3, j, list, i, n2, list2);
                        m.z3(m3);
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        
        static /* synthetic */ void b(final a a, long n, final m m, int n2, final List list, int n3, int size, final List list2, final int n4, final Object o) {
            if ((n4 & 0x1) != 0x0) {
                n = 0L;
            }
            if ((n4 & 0x4) != 0x0) {
                n2 = 0;
            }
            if ((n4 & 0x10) != 0x0) {
                n3 = 0;
            }
            if ((n4 & 0x20) != 0x0) {
                size = list.size();
            }
            a.a(n, m, n2, list, n3, size, list2);
        }
        
        private final long c(final m m) {
            return m.h0() / 4;
        }
        
        @k
        @e
        public final g0 d(@e final p... original) {
            k0.p((Object)original, "byteStrings");
            final int length = original.length;
            final int n = 0;
            if (length == 0) {
                return new g0(new p[0], new int[] { 0, -1 }, null);
            }
            final List oy = kotlin.collections.m.oy((Object[])original);
            v.m0(oy);
            final ArrayList<Integer> list = new ArrayList<Integer>(original.length);
            for (final p p : original) {
                list.add(-1);
            }
            final Integer[] array = list.toArray(new Integer[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            final Integer[] original2 = array;
            final List p2 = v.P((Object[])Arrays.copyOf(original2, original2.length));
            for (int length3 = original.length, j = 0, k = 0; j < length3; ++j, ++k) {
                p2.set(v.x(oy, (Comparable)original[j], 0, 0, 6, (Object)null), k);
            }
            if (oy.get(0).size() > 0) {
                int n2;
                for (int l = 0; l < oy.size(); l = n2) {
                    final p p3 = oy.get(l);
                    int n3;
                    n2 = (n3 = l + 1);
                    while (n3 < oy.size()) {
                        final p obj = oy.get(n3);
                        if (!obj.G0(p3)) {
                            break;
                        }
                        if (obj.size() == p3.size()) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("duplicate option: ");
                            sb.append(obj);
                            throw new IllegalArgumentException(sb.toString().toString());
                        }
                        if (p2.get(n3).intValue() > p2.get(l).intValue()) {
                            oy.remove(n3);
                            p2.remove(n3);
                        }
                        else {
                            ++n3;
                        }
                    }
                }
                final m m = new m();
                b(this, 0L, m, 0, oy, 0, 0, p2, 53, null);
                final int[] array2 = new int[(int)this.c(m)];
                int n4 = n;
                while (!m.D1()) {
                    array2[n4] = m.readInt();
                    ++n4;
                }
                final p[] copy = Arrays.copyOf(original, original.length);
                k0.o((Object)copy, "java.util.Arrays.copyOf(this, size)");
                return new g0(copy, array2, null);
            }
            throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
        }
    }
}
