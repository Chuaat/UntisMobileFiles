// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.comparisons;

import n6.p;
import java.util.Objects;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.jvm.functions.Function1;
import kotlin.internal.f;
import java.util.Comparator;
import n6.l;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000:\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\b\u001a[\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u000026\u0010\u0006\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u00040\u0003\"\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0004¢\u0006\u0004\b\b\u0010\t\u001aG\u0010\n\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002 \u0010\u0006\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u00040\u0003H\u0002¢\u0006\u0004\b\n\u0010\t\u001aC\u0010\f\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0004H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a_\u0010\u0012\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u000e2\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u001a\u0010\u0011\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00010\u000fj\n\u0012\u0006\b\u0000\u0012\u00028\u0001`\u00102\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a/\u0010\u0014\u001a\u00020\u0007\"\f\b\u0000\u0010\u0000*\u0006\u0012\u0002\b\u00030\u00052\b\u0010\u0001\u001a\u0004\u0018\u00018\u00002\b\u0010\u0002\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a[\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u0010\"\u0004\b\u0000\u0010\u000026\u0010\u0006\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u00040\u0003\"\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0016\u0010\u0017\u001a>\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u0010\"\u0004\b\u0000\u0010\u00002\u001a\b\u0004\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0004H\u0087\b\u00f8\u0001\u0000\u001aZ\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u0010\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u000e2\u001a\u0010\u0011\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00010\u000fj\n\u0012\u0006\b\u0000\u0012\u00028\u0001`\u00102\u0014\b\u0004\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0087\b\u00f8\u0001\u0000\u001a>\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u0010\"\u0004\b\u0000\u0010\u00002\u001a\b\u0004\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0004H\u0087\b\u00f8\u0001\u0000\u001aZ\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u0010\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u000e2\u001a\u0010\u0011\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00010\u000fj\n\u0012\u0006\b\u0000\u0012\u00028\u0001`\u00102\u0014\b\u0004\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0087\b\u00f8\u0001\u0000\u001aR\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u0010\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u00102\u001a\b\u0004\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0004H\u0087\b\u00f8\u0001\u0000\u001an\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u0010\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u000e*\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u00102\u001a\u0010\u0011\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00010\u000fj\n\u0012\u0006\b\u0000\u0012\u00028\u0001`\u00102\u0014\b\u0004\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0087\b\u00f8\u0001\u0000\u001aR\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u0010\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u00102\u001a\b\u0004\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0004H\u0087\b\u00f8\u0001\u0000\u001an\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u0010\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u000e*\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u00102\u001a\u0010\u0011\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00010\u000fj\n\u0012\u0006\b\u0000\u0012\u00028\u0001`\u00102\u0014\b\u0004\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0087\b\u00f8\u0001\u0000\u001ap\u0010#\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u0010\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u001028\b\u0004\u0010\"\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u0002\u0012\u0004\u0012\u00020\u00070\u001fH\u0087\b\u00f8\u0001\u0000\u001aO\u0010$\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u0010\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u00102\u001a\u0010\u0011\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u000fj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0010H\u0086\u0004\u001aO\u0010%\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u0010\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u00102\u001a\u0010\u0011\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u000fj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0010H\u0086\u0004\u001a@\u0010'\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000fj\n\u0012\u0006\u0012\u0004\u0018\u00018\u0000`\u0010\"\b\b\u0000\u0010\u0000*\u00020&2\u001a\u0010\u0011\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u000fj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0010\u001a-\u0010(\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000fj\n\u0012\u0006\u0012\u0004\u0018\u00018\u0000`\u0010\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0087\b\u001a@\u0010)\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000fj\n\u0012\u0006\u0012\u0004\u0018\u00018\u0000`\u0010\"\b\b\u0000\u0010\u0000*\u00020&2\u001a\u0010\u0011\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u000fj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0010\u001a-\u0010*\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000fj\n\u0012\u0006\u0012\u0004\u0018\u00018\u0000`\u0010\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0087\b\u001a&\u0010+\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u0010\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0005\u001a&\u0010,\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u0010\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0005\u001a0\u0010-\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u0010\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u0010\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006." }, d2 = { "T", "a", "b", "", "Lkotlin/Function1;", "", "selectors", "", "j", "(Ljava/lang/Object;Ljava/lang/Object;[Ln6/l;)I", "k", "selector", "i", "(Ljava/lang/Object;Ljava/lang/Object;Ln6/l;)I", "K", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "h", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;Ln6/l;)I", "g", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)I", "d", "([Ln6/l;)Ljava/util/Comparator;", "c", "f", "e", "u", "t", "w", "v", "Lkotlin/Function2;", "Lkotlin/t0;", "name", "comparison", "x", "s", "y", "", "n", "m", "p", "o", "l", "q", "r", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/comparisons/ComparisonsKt")
class b
{
    public b() {
    }
    
    public static final /* synthetic */ int a(final Object o, final Object o2, final l[] array) {
        return k(o, o2, array);
    }
    
    @f
    private static final <T, K> Comparator<T> b(final Comparator<? super K> comparator, final l<? super T, ? extends K> l) {
        return (Comparator<T>)new Comparator<T>() {
            @Override
            public final int compare(final T t, final T t2) {
                return comparator.compare(l.invoke(t), l.invoke(t2));
            }
        };
    }
    
    @f
    private static final <T> Comparator<T> c(final l<? super T, ? extends Comparable<?>> l) {
        return (Comparator<T>)new Comparator<T>() {
            @Override
            public final int compare(final T t, final T t2) {
                return a.g(l.invoke(t), (Comparable)l.invoke(t2));
            }
        };
    }
    
    @e
    public static <T> Comparator<T> d(@e final Function1<? super T, ? extends Comparable<?>>... array) {
        k0.p(array, "selectors");
        if (array.length > 0) {
            return (Comparator<T>)new Comparator<T>() {
                @Override
                public final int compare(final T t, final T t2) {
                    return b.a(t, t2, array);
                }
            };
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
    
    @f
    private static final <T, K> Comparator<T> e(final Comparator<? super K> comparator, final l<? super T, ? extends K> l) {
        return (Comparator<T>)new Comparator<T>() {
            @Override
            public final int compare(final T t, final T t2) {
                return comparator.compare(l.invoke(t2), l.invoke(t));
            }
        };
    }
    
    @f
    private static final <T> Comparator<T> f(final l<? super T, ? extends Comparable<?>> l) {
        return (Comparator<T>)new Comparator<T>() {
            @Override
            public final int compare(final T t, final T t2) {
                return a.g(l.invoke(t2), (Comparable)l.invoke(t));
            }
        };
    }
    
    public static <T extends Comparable<?>> int g(@org.jetbrains.annotations.f final T t, @org.jetbrains.annotations.f final T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }
    
    @f
    private static final <T, K> int h(final T t, final T t2, final Comparator<? super K> comparator, final l<? super T, ? extends K> l) {
        return comparator.compare((Object)l.invoke(t), (Object)l.invoke(t2));
    }
    
    @f
    private static final <T> int i(final T t, final T t2, final l<? super T, ? extends Comparable<?>> l) {
        return a.g((Comparable)l.invoke(t), (Comparable)l.invoke(t2));
    }
    
    public static final <T> int j(final T t, final T t2, @e final Function1<? super T, ? extends Comparable<?>>... array) {
        k0.p(array, "selectors");
        if (array.length > 0) {
            return k((Object)t, (Object)t2, (l[])array);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
    
    private static final <T> int k(final T t, final T t2, final Function1<? super T, ? extends Comparable<?>>[] array) {
        for (final Function1<? super T, ? extends Comparable<?>> function1 : array) {
            final int g = a.g(((l<T, T>)function1).invoke(t), (Comparable)((l<T, T>)function1).invoke(t2));
            if (g != 0) {
                return g;
            }
        }
        return 0;
    }
    
    @e
    public static <T extends Comparable<? super T>> Comparator<T> l() {
        final kotlin.comparisons.e g = kotlin.comparisons.e.G;
        Objects.requireNonNull(g, "null cannot be cast to non-null type kotlin.Comparator<T> /* = java.util.Comparator<T> */");
        return (Comparator<T>)g;
    }
    
    @f
    private static final <T extends Comparable<? super T>> Comparator<T> m() {
        return n(a.l());
    }
    
    @e
    public static final <T> Comparator<T> n(@e final Comparator<? super T> comparator) {
        k0.p(comparator, "comparator");
        return (Comparator<T>)new Comparator<T>() {
            @Override
            public final int compare(@org.jetbrains.annotations.f final T t, @org.jetbrains.annotations.f final T t2) {
                int compare;
                if (t == t2) {
                    compare = 0;
                }
                else if (t == null) {
                    compare = -1;
                }
                else if (t2 == null) {
                    compare = 1;
                }
                else {
                    compare = comparator.compare(t, t2);
                }
                return compare;
            }
        };
    }
    
    @f
    private static final <T extends Comparable<? super T>> Comparator<T> o() {
        return p(a.l());
    }
    
    @e
    public static final <T> Comparator<T> p(@e final Comparator<? super T> comparator) {
        k0.p(comparator, "comparator");
        return (Comparator<T>)new Comparator<T>() {
            @Override
            public final int compare(@org.jetbrains.annotations.f final T t, @org.jetbrains.annotations.f final T t2) {
                int compare;
                if (t == t2) {
                    compare = 0;
                }
                else if (t == null) {
                    compare = 1;
                }
                else if (t2 == null) {
                    compare = -1;
                }
                else {
                    compare = comparator.compare(t, t2);
                }
                return compare;
            }
        };
    }
    
    @e
    public static <T extends Comparable<? super T>> Comparator<T> q() {
        final kotlin.comparisons.f g = kotlin.comparisons.f.G;
        Objects.requireNonNull(g, "null cannot be cast to non-null type kotlin.Comparator<T> /* = java.util.Comparator<T> */");
        return (Comparator<T>)g;
    }
    
    @e
    public static final <T> Comparator<T> r(@e final Comparator<T> comparator) {
        k0.p(comparator, "$this$reversed");
        Object obj;
        if (comparator instanceof g) {
            obj = ((g<T>)comparator).a();
        }
        else {
            final kotlin.comparisons.e g = kotlin.comparisons.e.G;
            if (k0.g(comparator, g)) {
                obj = kotlin.comparisons.f.G;
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Comparator<T> /* = java.util.Comparator<T> */");
            }
            else if (k0.g(comparator, kotlin.comparisons.f.G)) {
                Objects.requireNonNull(g, "null cannot be cast to non-null type kotlin.Comparator<T> /* = java.util.Comparator<T> */");
                obj = g;
            }
            else {
                obj = new g<T>(comparator);
            }
        }
        return (Comparator<T>)obj;
    }
    
    @e
    public static final <T> Comparator<T> s(@e final Comparator<T> comparator, @e final Comparator<? super T> comparator2) {
        k0.p(comparator, "$this$then");
        k0.p(comparator2, "comparator");
        return (Comparator<T>)new Comparator<T>() {
            @Override
            public final int compare(final T t, final T t2) {
                int n = comparator.compare(t, t2);
                if (n == 0) {
                    n = comparator2.compare(t, t2);
                }
                return n;
            }
        };
    }
    
    @f
    private static final <T, K> Comparator<T> t(final Comparator<T> comparator, final Comparator<? super K> comparator2, final l<? super T, ? extends K> l) {
        return (Comparator<T>)new Comparator<T>() {
            @Override
            public final int compare(final T t, final T t2) {
                int n = comparator.compare(t, t2);
                if (n == 0) {
                    n = comparator2.compare(l.invoke(t), l.invoke(t2));
                }
                return n;
            }
        };
    }
    
    @f
    private static final <T> Comparator<T> u(final Comparator<T> comparator, final l<? super T, ? extends Comparable<?>> l) {
        return (Comparator<T>)new Comparator<T>() {
            @Override
            public final int compare(final T t, final T t2) {
                int n = comparator.compare(t, t2);
                if (n == 0) {
                    n = a.g(l.invoke(t), (Comparable)l.invoke(t2));
                }
                return n;
            }
        };
    }
    
    @f
    private static final <T, K> Comparator<T> v(final Comparator<T> comparator, final Comparator<? super K> comparator2, final l<? super T, ? extends K> l) {
        return (Comparator<T>)new Comparator<T>() {
            @Override
            public final int compare(final T t, final T t2) {
                int n = comparator.compare(t, t2);
                if (n == 0) {
                    n = comparator2.compare(l.invoke(t2), l.invoke(t));
                }
                return n;
            }
        };
    }
    
    @f
    private static final <T> Comparator<T> w(final Comparator<T> comparator, final l<? super T, ? extends Comparable<?>> l) {
        return (Comparator<T>)new Comparator<T>() {
            @Override
            public final int compare(final T t, final T t2) {
                int n = comparator.compare(t, t2);
                if (n == 0) {
                    n = a.g(l.invoke(t2), (Comparable)l.invoke(t));
                }
                return n;
            }
        };
    }
    
    @f
    private static final <T> Comparator<T> x(final Comparator<T> comparator, final p<? super T, ? super T, Integer> p2) {
        return (Comparator<T>)new Comparator<T>() {
            @Override
            public final int compare(final T t, final T t2) {
                int n = comparator.compare(t, t2);
                if (n == 0) {
                    n = p2.invoke(t, t2).intValue();
                }
                return n;
            }
        };
    }
    
    @e
    public static final <T> Comparator<T> y(@e final Comparator<T> comparator, @e final Comparator<? super T> comparator2) {
        k0.p(comparator, "$this$thenDescending");
        k0.p(comparator2, "comparator");
        return (Comparator<T>)new Comparator<T>() {
            @Override
            public final int compare(final T t, final T t2) {
                int n = comparator.compare(t, t2);
                if (n == 0) {
                    n = comparator2.compare(t2, t);
                }
                return n;
            }
        };
    }
}
