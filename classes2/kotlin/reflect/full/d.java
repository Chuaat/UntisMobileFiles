// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.full;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.b0;
import kotlin.jvm.internal.j1;
import kotlin.reflect.n;
import java.util.Map;
import kotlin.e1;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.k1;
import kotlin.j2;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.o1;
import kotlin.reflect.i;
import java.util.Arrays;
import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import org.jetbrains.annotations.e;
import kotlin.reflect.c;
import m6.g;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\b\u001a\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a;\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0087@\u00f8\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a9\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000bH\u0087@\u00f8\u0001\u0000¢\u0006\u0004\b\f\u0010\r\"&\u0010\u0012\u001a\u0004\u0018\u00010\u0003*\u0006\u0012\u0002\b\u00030\u00008F@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\"*\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013*\u0006\u0012\u0002\b\u00030\u00008F@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015\"&\u0010\u001a\u001a\u0004\u0018\u00010\u0003*\u0006\u0012\u0002\b\u00030\u00008F@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u0018\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b" }, d2 = { "Lkotlin/reflect/c;", "", "name", "Lkotlin/reflect/n;", "c", "R", "", "", "args", "a", "(Lkotlin/reflect/c;[Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "b", "(Lkotlin/reflect/c;Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "f", "(Lkotlin/reflect/c;)Lkotlin/reflect/n;", "getInstanceParameter$annotations", "(Lkotlin/reflect/c;)V", "instanceParameter", "", "h", "(Lkotlin/reflect/c;)Ljava/util/List;", "getValueParameters$annotations", "valueParameters", "d", "getExtensionReceiverParameter$annotations", "extensionReceiverParameter", "kotlin-reflection" }, k = 2, mv = { 1, 4, 1 })
@g(name = "KCallables")
public final class d
{
    @e1(version = "1.3")
    @org.jetbrains.annotations.f
    public static final <R> Object a(@e c<? extends R> c, @e final Object[] array, @e final kotlin.coroutines.d<? super R> d) {
        kotlin.coroutines.jvm.internal.d d3 = null;
        Label_0049: {
            if (d instanceof d$a) {
                final kotlin.coroutines.jvm.internal.d d2 = (d$a)d;
                final int h = d2.H;
                if ((h & Integer.MIN_VALUE) != 0x0) {
                    d2.H = h + Integer.MIN_VALUE;
                    d3 = d2;
                    break Label_0049;
                }
            }
            d3 = new kotlin.coroutines.jvm.internal.d(d) {
                /* synthetic */ Object G;
                int H;
                Object I;
                Object J;
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@org.jetbrains.annotations.e final Object g) {
                    this.G = g;
                    this.H |= Integer.MIN_VALUE;
                    return d.a((c<?>)null, (Object[])null, (d<? super Object>)this);
                }
            };
        }
        final Object g = d3.G;
        final Object h2 = b.h();
        final int h3 = d3.H;
        Object o;
        if (h3 != 0) {
            if (h3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            final Object[] array2 = (Object[])d3.J;
            c = (c)d3.I;
            c1.n(g);
            o = g;
        }
        else {
            c1.n(g);
            if (!c.isSuspend()) {
                return c.call(Arrays.copyOf(array, array.length));
            }
            if (!(c instanceof i)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Cannot callSuspend on a property ");
                sb.append(c);
                sb.append(": suspend properties are not supported yet");
                throw new IllegalArgumentException(sb.toString());
            }
            d3.I = c;
            d3.J = array;
            d3.H = 1;
            final o1 o2 = new o1(2);
            o2.b(array);
            o2.a(d3);
            final R call = (R)c.call(o2.d(new Object[o2.c()]));
            if (call == b.h()) {
                h.c(d3);
            }
            if ((o = call) == h2) {
                return h2;
            }
        }
        if (k0.g(c.getReturnType().b(), k1.d(j2.class)) && !c.getReturnType().c()) {
            return j2.a;
        }
        return o;
    }
    
    @e1(version = "1.3")
    @org.jetbrains.annotations.f
    public static final <R> Object b(@e c<? extends R> i, @e final Map<n, ?> j, @e final kotlin.coroutines.d<? super R> d) {
        kotlin.coroutines.jvm.internal.d d3 = null;
        Label_0049: {
            if (d instanceof d$b) {
                final kotlin.coroutines.jvm.internal.d d2 = (d$b)d;
                final int h = d2.H;
                if ((h & Integer.MIN_VALUE) != 0x0) {
                    d2.H = h + Integer.MIN_VALUE;
                    d3 = d2;
                    break Label_0049;
                }
            }
            d3 = new kotlin.coroutines.jvm.internal.d(d) {
                /* synthetic */ Object G;
                int H;
                Object I;
                Object J;
                Object K;
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@org.jetbrains.annotations.e final Object g) {
                    this.G = g;
                    this.H |= Integer.MIN_VALUE;
                    return d.b((c<?>)null, (Map<n, ?>)null, (d<? super Object>)this);
                }
            };
        }
        final Object g = d3.G;
        final Object h2 = b.h();
        final int h3 = d3.H;
        Object o;
        if (h3 != 0) {
            if (h3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            final j1.h h4 = (j1.h)d3.K;
            final Map map = (Map)d3.J;
            i = (c)d3.I;
            c1.n(g);
            o = g;
        }
        else {
            c1.n(g);
            if (!i.isSuspend()) {
                return i.callBy(j);
            }
            if (!(i instanceof i)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Cannot callSuspendBy on a property ");
                sb.append(i);
                sb.append(": suspend properties are not supported yet");
                throw new IllegalArgumentException(sb.toString());
            }
            final j1.h k = new j1.h();
            final kotlin.reflect.jvm.internal.f<?> a = kotlin.reflect.jvm.internal.k0.a(i);
            if (a == null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("This callable does not support a default call: ");
                sb2.append(i);
                throw new b0(sb2.toString());
            }
            k.G = (T)a;
            d3.I = i;
            d3.J = j;
            d3.K = k;
            d3.H = 1;
            final Object f0 = ((kotlin.reflect.jvm.internal.f<Object>)a).f0(j, d3);
            if (f0 == b.h()) {
                h.c(d3);
            }
            if ((o = f0) == h2) {
                return h2;
            }
        }
        if (k0.g(i.getReturnType().b(), k1.d(j2.class)) && !i.getReturnType().c()) {
            return j2.a;
        }
        return o;
    }
    
    @e1(version = "1.1")
    @org.jetbrains.annotations.f
    public static final n c(@e final c<?> c, @e final String s) {
        k0.p(c, "$this$findParameterByName");
        k0.p(s, "name");
        final Iterator iterator = c.getParameters().iterator();
        final n n = null;
        int n2 = 0;
        n n3 = null;
        while (iterator.hasNext()) {
            final n next = iterator.next();
            if (k0.g(next.getName(), s)) {
                if (n2 != 0) {
                    n3 = n;
                    return n3;
                }
                n2 = 1;
                n3 = next;
            }
        }
        if (n2 == 0) {
            n3 = n;
            return n3;
        }
        return n3;
    }
    
    @org.jetbrains.annotations.f
    public static final n d(@e final c<?> c) {
        k0.p(c, "$this$extensionReceiverParameter");
        final Iterator iterator = c.getParameters().iterator();
        final n n = null;
        n n2 = null;
        int n3 = 0;
        while (iterator.hasNext()) {
            final n next = iterator.next();
            if (next.n() == kotlin.reflect.n.b.H) {
                if (n3 != 0) {
                    n2 = n;
                    return n2;
                }
                n2 = next;
                n3 = 1;
            }
        }
        if (n3 == 0) {
            n2 = n;
            return n2;
        }
        return n2;
    }
    
    @org.jetbrains.annotations.f
    public static final n f(@e final c<?> c) {
        k0.p(c, "$this$instanceParameter");
        final Iterator iterator = c.getParameters().iterator();
        final n n = null;
        n n2 = null;
        int n3 = 0;
        while (iterator.hasNext()) {
            final n next = iterator.next();
            if (next.n() == kotlin.reflect.n.b.G) {
                if (n3 != 0) {
                    n2 = n;
                    return n2;
                }
                n2 = next;
                n3 = 1;
            }
        }
        if (n3 == 0) {
            n2 = n;
            return n2;
        }
        return n2;
    }
    
    @e
    public static final List<n> h(@e final c<?> c) {
        k0.p(c, "$this$valueParameters");
        final List parameters = c.getParameters();
        final ArrayList<n> list = new ArrayList<n>();
        for (final n next : parameters) {
            if (next.n() == n.b.I) {
                list.add(next);
            }
        }
        return list;
    }
}
