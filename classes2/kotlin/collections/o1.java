// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections;

import kotlin.sequences.m;
import java.util.RandomAccess;
import java.util.Collection;
import java.util.ArrayList;
import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.j2;
import kotlin.coroutines.d;
import kotlin.sequences.o;
import n6.p;
import kotlin.jvm.internal.k0;
import java.util.List;
import org.jetbrains.annotations.e;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010(\n\u0002\b\u0003\u001a\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\u001aD\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\u0006\"\u0004\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0000\u001aH\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\f\"\u0004\b\u0000\u0010\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0000¨\u0006\u000f" }, d2 = { "", "size", "step", "Lkotlin/j2;", "a", "T", "Lkotlin/sequences/m;", "", "partialWindows", "reuseBuffer", "", "c", "", "iterator", "b", "kotlin-stdlib" }, k = 2, mv = { 1, 5, 1 })
public final class o1
{
    public static final void a(final int n, final int i) {
        if (n <= 0 || i <= 0) {
            String s;
            if (n != i) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Both size ");
                sb.append(n);
                sb.append(" and step ");
                sb.append(i);
                sb.append(" must be greater than zero.");
                s = sb.toString();
            }
            else {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("size ");
                sb2.append(n);
                sb2.append(" must be greater than zero.");
                s = sb2.toString();
            }
            throw new IllegalArgumentException(s.toString());
        }
    }
    
    @e
    public static final <T> Iterator<List<T>> b(@e final Iterator<? extends T> iterator, final int n, final int n2, final boolean b, final boolean b2) {
        k0.p(iterator, "iterator");
        if (!iterator.hasNext()) {
            return (Iterator<List<T>>)h0.G;
        }
        return (Iterator<List<T>>)kotlin.sequences.p.d((p)new p<o<? super List<? extends T>>, d<? super j2>, Object>(b2) {
            private /* synthetic */ Object H;
            Object I;
            Object J;
            int K;
            int L;
            final /* synthetic */ int M;
            final /* synthetic */ int N;
            final /* synthetic */ Iterator O;
            final /* synthetic */ boolean P;
            final /* synthetic */ boolean Q;
            
            @org.jetbrains.annotations.e
            @Override
            public final d<j2> create(@org.jetbrains.annotations.f final Object h, @org.jetbrains.annotations.e final d<?> d) {
                k0.p(d, "completion");
                final p<o<? super List<? extends T>>, d<? super j2>, Object> p2 = new p<o<? super List<? extends T>>, d<? super j2>, Object>() {
                    private /* synthetic */ Object H;
                    Object I;
                    Object J;
                    int K;
                    int L;
                    final /* synthetic */ int M = this.M;
                    final /* synthetic */ int N = this.N;
                    final /* synthetic */ Iterator O = this.O;
                    final /* synthetic */ boolean P = this.P;
                    final /* synthetic */ boolean Q = this.Q;
                };
                p2.H = h;
                return (d<j2>)p2;
            }
            
            @Override
            public final Object invoke(final Object o, final Object o2) {
                return ((o1$a)this.create(o, (d<?>)o2)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object i) {
                final Object h = b.h();
                final int l = this.L;
            Label_0618:
                while (true) {
                    i1<Object> r = null;
                    o o3 = null;
                    p<o<? super List<? extends T>>, d<? super j2>, Object> p2 = null;
                    Label_0702: {
                        o o5 = null;
                        p<o<? super List<? extends T>>, d<? super j2>, Object> p4 = null;
                    Label_0235_Outer:
                        while (true) {
                            o o2 = null;
                            p<o<? super List<? extends T>>, d<? super j2>, Object> p = null;
                            Label_0590: {
                                while (true) {
                                    int k = 0;
                                    p<o<? super List<? extends T>>, d<? super j2>, Object> p3 = null;
                                    Label_0330: {
                                        Iterator o4;
                                        o h2;
                                        int n;
                                        if (l != 0) {
                                            if (l != 1) {
                                                if (l != 2) {
                                                    if (l == 3) {
                                                        final Iterator o = (Iterator)this.J;
                                                        final i1 i2 = (i1)this.I;
                                                        o2 = (o)this.H;
                                                        c1.n(i);
                                                        p = this;
                                                        r = (i1<Object>)i2;
                                                        break Label_0590;
                                                    }
                                                    if (l == 4) {
                                                        final i1 i3 = (i1)this.I;
                                                        o3 = (o)this.H;
                                                        c1.n(i);
                                                        p2 = this;
                                                        r = (i1<Object>)i3;
                                                        break Label_0702;
                                                    }
                                                    if (l != 5) {
                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    }
                                                }
                                                c1.n(i);
                                                return j2.a;
                                            }
                                            k = this.K;
                                            o4 = (Iterator)this.J;
                                            final ArrayList list = (ArrayList)this.I;
                                            h2 = (o)this.H;
                                            c1.n(i);
                                            p3 = this;
                                            i = list;
                                            break Label_0330;
                                        }
                                        else {
                                            c1.n(i);
                                            h2 = (o)this.H;
                                            final int u = kotlin.ranges.o.u(this.M, 1024);
                                            k = this.N - this.M;
                                            if (k < 0) {
                                                r = new i1<Object>(u);
                                                final Iterator o = this.O;
                                                o5 = h2;
                                                p4 = this;
                                                break Label_0462;
                                            }
                                            i = new ArrayList(u);
                                            n = 0;
                                            o4 = this.O;
                                            p3 = this;
                                        }
                                        while (o4.hasNext()) {
                                            final Object next = o4.next();
                                            if (n > 0) {
                                                --n;
                                            }
                                            else {
                                                ((ArrayList<Object>)i).add(next);
                                                if (((ArrayList)i).size() != p3.M) {
                                                    continue Label_0235_Outer;
                                                }
                                                p3.H = h2;
                                                p3.I = i;
                                                p3.J = o4;
                                                p3.K = k;
                                                p3.L = 1;
                                                if (h2.b(i, (d)p3) == h) {
                                                    return h;
                                                }
                                                break Label_0330;
                                            }
                                        }
                                        if (!(((Collection)i).isEmpty() ^ true) || (!p3.Q && ((ArrayList)i).size() != p3.M)) {
                                            return j2.a;
                                        }
                                        p3.H = null;
                                        p3.I = null;
                                        p3.J = null;
                                        p3.L = 2;
                                        if (h2.b(i, (d)p3) == h) {
                                            return h;
                                        }
                                        return j2.a;
                                        Iterator o = null;
                                        while (o.hasNext()) {
                                            r.q(o.next());
                                            if (r.v()) {
                                                final int size = r.size();
                                                final int m = p4.M;
                                                if (size < m) {
                                                    r = r.r(m);
                                                }
                                                else {
                                                    RandomAccess randomAccess;
                                                    if (p4.P) {
                                                        randomAccess = r;
                                                    }
                                                    else {
                                                        randomAccess = new ArrayList<Object>(r);
                                                    }
                                                    p4.H = o5;
                                                    p4.I = r;
                                                    p4.J = o;
                                                    p4.L = 3;
                                                    o2 = o5;
                                                    p = p4;
                                                    if (o5.b((Object)randomAccess, (d)p4) == h) {
                                                        return h;
                                                    }
                                                    break Label_0590;
                                                }
                                            }
                                        }
                                        if (p4.Q) {
                                            break Label_0618;
                                        }
                                        return j2.a;
                                    }
                                    if (p3.P) {
                                        ((ArrayList)i).clear();
                                    }
                                    else {
                                        i = new ArrayList(p3.M);
                                    }
                                    final int n2 = k;
                                    int n = k;
                                    k = n2;
                                    continue;
                                }
                            }
                            r.w(p.N);
                            o5 = o2;
                            p4 = p;
                            continue;
                        }
                        if (r.size() > p4.N) {
                            RandomAccess randomAccess2;
                            if (p4.P) {
                                randomAccess2 = r;
                            }
                            else {
                                randomAccess2 = new ArrayList<Object>(r);
                            }
                            p4.H = o5;
                            p4.I = r;
                            p4.J = null;
                            p4.L = 4;
                            o3 = o5;
                            p2 = p4;
                            if (o5.b((Object)randomAccess2, (d)p4) == h) {
                                return h;
                            }
                        }
                        else {
                            if (!(r.isEmpty() ^ true)) {
                                return j2.a;
                            }
                            p4.H = null;
                            p4.I = null;
                            p4.J = null;
                            p4.L = 5;
                            if (o5.b((Object)r, (d)p4) == h) {
                                return h;
                            }
                            return j2.a;
                        }
                    }
                    r.w(p2.N);
                    o o5 = o3;
                    p<o<? super List<? extends T>>, d<? super j2>, Object> p4 = p2;
                    continue Label_0618;
                }
            }
        });
    }
    
    @e
    public static final <T> m<List<T>> c(@e final m<? extends T> m, final int n, final int n2, final boolean b, final boolean b2) {
        k0.p(m, "$this$windowedSequence");
        a(n, n2);
        return (m<List<T>>)new m<List<? extends T>>() {
            @e
            public Iterator<List<? extends T>> iterator() {
                return o1.b((Iterator<? extends T>)m.iterator(), n, n2, b, b2);
            }
        };
    }
}
