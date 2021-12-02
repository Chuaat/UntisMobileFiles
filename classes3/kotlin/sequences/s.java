// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.sequences;

import kotlin.n1;
import java.util.ArrayList;
import kotlin.s0;
import java.util.List;
import kotlin.e1;
import kotlin.jvm.internal.m0;
import kotlin.collections.v;
import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.k;
import kotlin.j2;
import kotlin.coroutines.d;
import n6.l;
import kotlin.jvm.internal.k0;
import kotlin.internal.f;
import org.jetbrains.annotations.e;
import java.util.Iterator;
import n6.a;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\u001a.\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\u0087\b\u00f8\u0001\u0000\u001a\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002\u001a-\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0007\"\u00028\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0012\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000\u001a!\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004H\u0087\b\u001a2\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0001H\u0007\u001a\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0004\u001a+\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00100\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001aE\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0013*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a@\u0010\u0019\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00180\u0017\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0013*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00170\u0004\u001a\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007\u001a&\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0007\u001ab\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u001e\"\u0004\b\u0002\u0010\u00132\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0018\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 2\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00020\u0014H\u0000\u001a\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0004\u001a&\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0000*\u00020%2\u000e\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001\u001a?\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0000*\u00020%2\b\u0010(\u001a\u0004\u0018\u00018\u00002\u0014\u0010&\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0014H\u0007¢\u0006\u0004\b)\u0010*\u001a<\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0000*\u00020%2\u000e\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00012\u0014\u0010&\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0014\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006-" }, d2 = { "T", "Lkotlin/Function0;", "", "iterator", "Lkotlin/sequences/m;", "g", "h", "", "elements", "t", "([Ljava/lang/Object;)Lkotlin/sequences/m;", "j", "s", "defaultValue", "r", "l", "", "n", "(Lkotlin/sequences/m;)Lkotlin/sequences/m;", "R", "Lkotlin/Function1;", "m", "(Lkotlin/sequences/m;Ln6/l;)Lkotlin/sequences/m;", "Lkotlin/s0;", "", "w", "u", "Lkotlin/random/f;", "random", "v", "C", "source", "Lkotlin/Function2;", "", "transform", "k", "i", "", "nextFunction", "p", "seed", "o", "(Ljava/lang/Object;Ln6/l;)Lkotlin/sequences/m;", "seedFunction", "q", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/sequences/SequencesKt")
class s extends r
{
    public s() {
    }
    
    @f
    private static final <T> m<T> g(final a<? extends Iterator<? extends T>> a) {
        return new m<T>() {
            @e
            @Override
            public Iterator<T> iterator() {
                return (Iterator<T>)a.invoke();
            }
        };
    }
    
    @e
    public static <T> m<T> h(@e final Iterator<? extends T> iterator) {
        k0.p((Object)iterator, "$this$asSequence");
        return p.i((m<? extends T>)new m<T>() {
            @e
            @Override
            public Iterator<T> iterator() {
                return (Iterator<T>)iterator;
            }
        });
    }
    
    @e
    public static <T> m<T> i(@e m<? extends T> a) {
        k0.p((Object)a, "$this$constrainOnce");
        if (!(a instanceof kotlin.sequences.a)) {
            a = new kotlin.sequences.a<Object>(a);
        }
        return (m<T>)a;
    }
    
    @e
    public static <T> m<T> j() {
        return (m<T>)g.a;
    }
    
    @e
    public static final <T, C, R> m<R> k(@e final m<? extends T> m, @e final n6.p<? super Integer, ? super T, ? extends C> p3, @e final l<? super C, ? extends Iterator<? extends R>> l) {
        k0.p((Object)m, "source");
        k0.p((Object)p3, "transform");
        k0.p((Object)l, "iterator");
        return p.e((n6.p<? super o<? super R>, ? super d<? super j2>, ?>)new n6.p<o<? super R>, d<? super j2>, Object>(null) {
            private /* synthetic */ Object H;
            Object I;
            int J;
            int K;
            final /* synthetic */ m L;
            final /* synthetic */ n6.p M;
            final /* synthetic */ l N;
            
            @e
            public final d<j2> create(@org.jetbrains.annotations.f final Object h, @e final d<?> d) {
                k0.p((Object)d, "completion");
                final n6.p<o<? super R>, d<? super j2>, Object> p2 = (n6.p<o<? super R>, d<? super j2>, Object>)new n6.p<o<? super R>, d<? super j2>, Object>(d) {
                    private /* synthetic */ Object H;
                    Object I;
                    int J;
                    int K;
                    final /* synthetic */ m L = this.L;
                    final /* synthetic */ n6.p M = this.M;
                    final /* synthetic */ l N = this.N;
                };
                p2.H = h;
                return (d<j2>)p2;
            }
            
            public final Object invoke(final Object o, final Object o2) {
                return ((s$c)this.create(o, (d<?>)o2)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@e final Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int k = this.K;
                int j;
                o h2;
                Iterator<Object> iterator2;
                if (k != 0) {
                    if (k != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = this.J;
                    final Iterator iterator = (Iterator)this.I;
                    h2 = (o)this.H;
                    c1.n(o);
                    iterator2 = (Iterator<Object>)iterator;
                }
                else {
                    c1.n(o);
                    h2 = (o)this.H;
                    j = 0;
                    iterator2 = this.L.iterator();
                }
                while (iterator2.hasNext()) {
                    final Object next = iterator2.next();
                    final n6.p m = this.M;
                    final int i = j + 1;
                    if (j < 0) {
                        v.W();
                    }
                    final Iterator iterator3 = (Iterator)this.N.invoke(m.invoke((Object)kotlin.coroutines.jvm.internal.b.f(j), next));
                    this.H = h2;
                    this.I = iterator2;
                    this.J = i;
                    this.K = 1;
                    if (h2.e(iterator3, (d)this) == h) {
                        return h;
                    }
                    j = i;
                }
                return j2.a;
            }
        });
    }
    
    @e
    public static final <T> m<T> l(@e final m<? extends m<? extends T>> m) {
        k0.p((Object)m, "$this$flatten");
        return m((m<?>)m, (n6.l<? super Object, ? extends Iterator<? extends T>>)s$d.G);
    }
    
    private static final <T, R> m<R> m(final m<? extends T> m, final l<? super T, ? extends Iterator<? extends R>> l) {
        if (m instanceof z) {
            return ((z<Object, Object>)m).e((n6.l<? super Object, ? extends Iterator<? extends R>>)l);
        }
        return new i<Object, Object, R>(m, (n6.l<?, ?>)s$f.G, l);
    }
    
    @m6.g(name = "flattenSequenceOfIterable")
    @e
    public static final <T> m<T> n(@e final m<? extends Iterable<? extends T>> m) {
        k0.p((Object)m, "$this$flatten");
        return m((m<?>)m, (n6.l<? super Object, ? extends Iterator<? extends T>>)s$e.G);
    }
    
    @kotlin.internal.g
    @e
    public static <T> m<T> o(@org.jetbrains.annotations.f final T t, @e final l<? super T, ? extends T> l) {
        k0.p((Object)l, "nextFunction");
        m a;
        if (t == null) {
            a = g.a;
        }
        else {
            a = new j<T>((a)new a<T>() {
                @org.jetbrains.annotations.f
                public final T invoke() {
                    return t;
                }
            }, l);
        }
        return (m<T>)a;
    }
    
    @e
    public static <T> m<T> p(@e final a<? extends T> a) {
        k0.p((Object)a, "nextFunction");
        return p.i((m<? extends T>)new j<T>(a, (n6.l<? super T, ? extends T>)new l<T, T>() {
            @org.jetbrains.annotations.f
            public final T invoke(@e final T t) {
                k0.p((Object)t, "it");
                return (T)a.invoke();
            }
        }));
    }
    
    @e
    public static <T> m<T> q(@e final a<? extends T> a, @e final l<? super T, ? extends T> l) {
        k0.p((Object)a, "seedFunction");
        k0.p((Object)l, "nextFunction");
        return new j<T>(a, l);
    }
    
    @e1(version = "1.3")
    @e
    public static final <T> m<T> r(@e final m<? extends T> m, @e final a<? extends m<? extends T>> a) {
        k0.p((Object)m, "$this$ifEmpty");
        k0.p((Object)a, "defaultValue");
        return p.e((n6.p<? super o<? super T>, ? super d<? super j2>, ?>)new n6.p<o<? super T>, d<? super j2>, Object>() {
            private /* synthetic */ Object H;
            int I;
            final /* synthetic */ m J;
            final /* synthetic */ a K;
            
            @e
            public final d<j2> create(@org.jetbrains.annotations.f final Object h, @e final d<?> d) {
                k0.p((Object)d, "completion");
                final n6.p<o<? super T>, d<? super j2>, Object> p2 = (n6.p<o<? super T>, d<? super j2>, Object>)new n6.p<o<? super T>, d<? super j2>, Object>() {
                    private /* synthetic */ Object H;
                    int I;
                    final /* synthetic */ m J = this.J;
                    final /* synthetic */ a K = this.K;
                };
                p2.H = h;
                return (d<j2>)p2;
            }
            
            public final Object invoke(final Object o, final Object o2) {
                return ((s$i)this.create(o, (d<?>)o2)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@e final Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int i = this.I;
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(o);
                }
                else {
                    c1.n(o);
                    final o o2 = (o)this.H;
                    final Iterator iterator = this.J.iterator();
                    if (iterator.hasNext()) {
                        this.I = 1;
                        if (o2.e(iterator, (d)this) == h) {
                            return h;
                        }
                    }
                    else {
                        final m m = (m)this.K.invoke();
                        this.I = 2;
                        if (o2.f(m, (d)this) == h) {
                            return h;
                        }
                    }
                }
                return j2.a;
            }
        });
    }
    
    @e1(version = "1.3")
    @f
    private static final <T> m<T> s(m<? extends T> j) {
        if (j == null) {
            j = p.j();
        }
        return j;
    }
    
    @e
    public static final <T> m<T> t(@e final T... array) {
        k0.p((Object)array, "elements");
        m<T> m;
        if (array.length == 0) {
            m = p.j();
        }
        else {
            m = (m<T>)kotlin.collections.m.h5((Object[])array);
        }
        return m;
    }
    
    @e1(version = "1.4")
    @e
    public static final <T> m<T> u(@e final m<? extends T> m) {
        k0.p((Object)m, "$this$shuffled");
        return v(m, (kotlin.random.f)kotlin.random.f.H);
    }
    
    @e1(version = "1.4")
    @e
    public static final <T> m<T> v(@e final m<? extends T> m, @e final kotlin.random.f f) {
        k0.p((Object)m, "$this$shuffled");
        k0.p((Object)f, "random");
        return p.e((n6.p<? super o<? super T>, ? super d<? super j2>, ?>)new n6.p<o<? super T>, d<? super j2>, Object>() {
            private /* synthetic */ Object H;
            Object I;
            int J;
            final /* synthetic */ m K;
            final /* synthetic */ kotlin.random.f L;
            
            @e
            public final d<j2> create(@org.jetbrains.annotations.f final Object h, @e final d<?> d) {
                k0.p((Object)d, "completion");
                final n6.p<o<? super T>, d<? super j2>, Object> p2 = (n6.p<o<? super T>, d<? super j2>, Object>)new n6.p<o<? super T>, d<? super j2>, Object>() {
                    private /* synthetic */ Object H;
                    Object I;
                    int J;
                    final /* synthetic */ m K = this.K;
                    final /* synthetic */ kotlin.random.f L = this.L;
                };
                p2.H = h;
                return (d<j2>)p2;
            }
            
            public final Object invoke(final Object o, final Object o2) {
                return ((s$j)this.create(o, (d<?>)o2)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@e final Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int j = this.J;
                o h2;
                List<Object> w2;
                if (j != 0) {
                    if (j != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    final List list = (List)this.I;
                    h2 = (o)this.H;
                    c1.n(o);
                    w2 = (List<Object>)list;
                }
                else {
                    c1.n(o);
                    h2 = (o)this.H;
                    w2 = p.W2((m<?>)this.K);
                }
                while (w2.isEmpty() ^ true) {
                    final int m = this.L.m(w2.size());
                    Object o2 = v.N0((List)w2);
                    if (m < w2.size()) {
                        o2 = w2.set(m, o2);
                    }
                    this.H = h2;
                    this.I = w2;
                    this.J = 1;
                    if (h2.b(o2, (d<? super j2>)this) == h) {
                        return h;
                    }
                }
                return j2.a;
            }
        });
    }
    
    @e
    public static final <T, R> s0<List<T>, List<R>> w(@e final m<? extends s0<? extends T, ? extends R>> m) {
        k0.p((Object)m, "$this$unzip");
        final ArrayList<Object> list = new ArrayList<Object>();
        final ArrayList<Object> list2 = new ArrayList<Object>();
        for (final s0 s0 : m) {
            list.add(s0.e());
            list2.add(s0.f());
        }
        return (s0<List<T>, List<R>>)n1.a((Object)list, (Object)list2);
    }
}
