// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import java.util.Iterator;
import kotlin.j2;
import java.util.Objects;
import kotlin.collections.v;
import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import java.util.List;
import org.jetbrains.annotations.e;
import java.util.Collection;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u001e\u0010\u0003\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001\"\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@\u00f8\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a/\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0007H\u0086@\u00f8\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\r\u001a\u00020\f2\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u0001\"\u00020\nH\u0086@\u00f8\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001d\u0010\u000f\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\n0\u0007H\u0086@\u00f8\u0001\u0000¢\u0006\u0004\b\u000f\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010" }, d2 = { "T", "", "Lkotlinx/coroutines/a1;", "deferreds", "", "b", "([Lkotlinx/coroutines/a1;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "a", "(Ljava/util/Collection;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/k2;", "jobs", "Lkotlin/j2;", "d", "([Lkotlinx/coroutines/k2;Lkotlin/coroutines/d;)Ljava/lang/Object;", "c", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class d
{
    @org.jetbrains.annotations.f
    public static final <T> Object a(@e final Collection<? extends a1<? extends T>> collection, @e final kotlin.coroutines.d<? super List<? extends T>> d) {
        Object o = null;
        Label_0046: {
            if (d instanceof d$b) {
                final kotlin.coroutines.jvm.internal.d d2 = (d$b)d;
                final int h = d2.H;
                if ((h & Integer.MIN_VALUE) != 0x0) {
                    d2.H = h + Integer.MIN_VALUE;
                    o = d2;
                    break Label_0046;
                }
            }
            o = new kotlin.coroutines.jvm.internal.d(d) {
                /* synthetic */ Object G;
                int H;
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@e final Object g) {
                    this.G = g;
                    this.H |= Integer.MIN_VALUE;
                    return d.a((Collection<? extends a1<?>>)null, (kotlin.coroutines.d<? super List<?>>)this);
                }
            };
        }
        final Object g = ((d$b)o).G;
        final Object h2 = b.h();
        final int h3 = ((d$b)o).H;
        Object b;
        if (h3 != 0) {
            if (h3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1.n(g);
            b = g;
        }
        else {
            c1.n(g);
            if (collection.isEmpty()) {
                return v.E();
            }
            final a1<?>[] array = collection.toArray(new a1[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            final c c = new c(array);
            ((d$b)o).H = 1;
            if ((b = c.b((kotlin.coroutines.d)o)) == h2) {
                return h2;
            }
        }
        return (List)b;
    }
    
    @org.jetbrains.annotations.f
    public static final <T> Object b(@e final a1<? extends T>[] array, @e final kotlin.coroutines.d<? super List<? extends T>> d) {
        Object o = null;
        Label_0046: {
            if (d instanceof d$a) {
                final kotlin.coroutines.jvm.internal.d d2 = (d$a)d;
                final int h = d2.H;
                if ((h & Integer.MIN_VALUE) != 0x0) {
                    d2.H = h + Integer.MIN_VALUE;
                    o = d2;
                    break Label_0046;
                }
            }
            o = new kotlin.coroutines.jvm.internal.d(d) {
                /* synthetic */ Object G;
                int H;
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@e final Object g) {
                    this.G = g;
                    this.H |= Integer.MIN_VALUE;
                    return d.b((a1<?>[])null, (kotlin.coroutines.d<? super List<?>>)this);
                }
            };
        }
        final Object g = ((d$a)o).G;
        final Object h2 = b.h();
        final int h3 = ((d$a)o).H;
        Object b;
        if (h3 != 0) {
            if (h3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1.n(g);
            b = g;
        }
        else {
            c1.n(g);
            if (array.length == 0) {
                return v.E();
            }
            final c c = new c(array);
            ((d$a)o).H = 1;
            if ((b = c.b((kotlin.coroutines.d)o)) == h2) {
                return h2;
            }
        }
        return (List)b;
    }
    
    @org.jetbrains.annotations.f
    public static final Object c(@e final Collection<? extends k2> collection, @e final kotlin.coroutines.d<? super j2> d) {
        kotlin.coroutines.jvm.internal.d d3 = null;
        Label_0046: {
            if (d instanceof d$d) {
                final kotlin.coroutines.jvm.internal.d d2 = (d$d)d;
                final int h = d2.H;
                if ((h & Integer.MIN_VALUE) != 0x0) {
                    d2.H = h + Integer.MIN_VALUE;
                    d3 = d2;
                    break Label_0046;
                }
            }
            d3 = new kotlin.coroutines.jvm.internal.d(d) {
                /* synthetic */ Object G;
                int H;
                Object I;
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@e final Object g) {
                    this.G = g;
                    this.H |= Integer.MIN_VALUE;
                    return d.c(null, (kotlin.coroutines.d<? super j2>)this);
                }
            };
        }
        final Object g = d3.G;
        final Object h2 = b.h();
        final int h3 = d3.H;
        Iterator<k2> iterator;
        if (h3 != 0) {
            if (h3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iterator = (Iterator<k2>)d3.I;
            c1.n(g);
        }
        else {
            c1.n(g);
            iterator = collection.iterator();
        }
        while (iterator.hasNext()) {
            final k2 k2 = iterator.next();
            d3.I = iterator;
            d3.H = 1;
            if (k2.s((kotlin.coroutines.d<? super j2>)d3) == h2) {
                return h2;
            }
        }
        return j2.a;
    }
    
    @org.jetbrains.annotations.f
    public static final Object d(@e final k2[] array, @e final kotlin.coroutines.d<? super j2> d) {
        kotlin.coroutines.jvm.internal.d d3 = null;
        Label_0046: {
            if (d instanceof d$c) {
                final kotlin.coroutines.jvm.internal.d d2 = (d$c)d;
                final int h = d2.H;
                if ((h & Integer.MIN_VALUE) != 0x0) {
                    d2.H = h + Integer.MIN_VALUE;
                    d3 = d2;
                    break Label_0046;
                }
            }
            d3 = new kotlin.coroutines.jvm.internal.d(d) {
                /* synthetic */ Object G;
                int H;
                Object I;
                int J;
                int K;
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@e final Object g) {
                    this.G = g;
                    this.H |= Integer.MIN_VALUE;
                    return d.d(null, (kotlin.coroutines.d<? super j2>)this);
                }
            };
        }
        final Object g = d3.G;
        final Object h2 = b.h();
        final int h3 = d3.H;
        while (true) {
            int k = 0;
            Label_0173: {
                int j;
                k2[] i;
                kotlin.coroutines.jvm.internal.d d4;
                if (h3 != 0) {
                    if (h3 == 1) {
                        k = d3.K;
                        j = d3.J;
                        i = (k2[])d3.I;
                        c1.n(g);
                        break Label_0173;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    c1.n(g);
                    j = array.length;
                    k = 0;
                    i = array;
                    d4 = d3;
                }
                if (k >= j) {
                    return j2.a;
                }
                final k2 k2 = i[k];
                d4.I = i;
                d4.J = j;
                d4.K = k;
                d4.H = 1;
                d3 = d4;
                if (k2.s((kotlin.coroutines.d<? super j2>)d4) == h2) {
                    return h2;
                }
            }
            ++k;
            kotlin.coroutines.jvm.internal.d d4 = d3;
            continue;
        }
    }
}
