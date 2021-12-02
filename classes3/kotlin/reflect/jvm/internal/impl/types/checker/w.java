// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.q;
import kotlin.reflect.jvm.internal.impl.types.n0;
import java.util.LinkedHashSet;
import kotlin.reflect.jvm.internal.impl.types.j1;
import kotlin.reflect.jvm.internal.impl.types.z;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.b0;
import kotlin.reflect.jvm.internal.impl.resolve.constants.n;
import kotlin.jvm.internal.k1;
import kotlin.reflect.h;
import kotlin.jvm.internal.f0;
import n6.l;
import kotlin.jvm.internal.m0;
import n6.a;
import kotlin.collections.v;
import java.util.Set;
import java.util.Iterator;
import java.util.ArrayList;
import n6.p;
import kotlin.reflect.jvm.internal.impl.types.k0;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.types.c0;
import org.jetbrains.annotations.e;

public final class w
{
    @e
    public static final w a;
    
    static {
        a = new w();
    }
    
    private w() {
    }
    
    private final Collection<k0> b(final Collection<? extends k0> c, final p<? super k0, ? super k0, Boolean> p2) {
        final ArrayList<k0> list = new ArrayList<k0>(c);
        final Iterator<k0> iterator = list.iterator();
        kotlin.jvm.internal.k0.o((Object)iterator, "filteredTypes.iterator()");
        while (iterator.hasNext()) {
            final k0 k0 = iterator.next();
            final boolean empty = list.isEmpty();
            final int n = 1;
            int n2 = 0;
            Label_0151: {
                if (!empty) {
                    for (final k0 k2 : list) {
                        boolean b = false;
                        Label_0142: {
                            if (k2 != k0) {
                                kotlin.jvm.internal.k0.o((Object)k2, "lower");
                                kotlin.jvm.internal.k0.o((Object)k0, "upper");
                                if (p2.invoke((Object)k2, (Object)k0)) {
                                    b = true;
                                    break Label_0142;
                                }
                            }
                            b = false;
                        }
                        if (b) {
                            n2 = n;
                            break Label_0151;
                        }
                    }
                }
                n2 = 0;
            }
            if (n2 != 0) {
                iterator.remove();
            }
        }
        return list;
    }
    
    private final k0 d(final Set<? extends k0> set) {
        if (set.size() == 1) {
            return (k0)v.S4((Iterable)set);
        }
        new n6.a<String>() {
            @e
            public final String a() {
                return kotlin.jvm.internal.k0.C("This collections cannot be empty! input types: ", (Object)v.Z2((Iterable)set, (CharSequence)null, (CharSequence)null, (CharSequence)null, 0, (CharSequence)null, (l)null, 63, (Object)null));
            }
        };
        final Collection<k0> b = this.b(set, (p<? super k0, ? super k0, Boolean>)new p<c0, c0, Boolean>(this));
        b.isEmpty();
        final k0 b2 = n.f.b(b);
        if (b2 != null) {
            return b2;
        }
        final Collection<k0> b3 = this.b(b, (p<? super k0, ? super k0, Boolean>)new p<c0, c0, Boolean>(kotlin.reflect.jvm.internal.impl.types.checker.l.b.a()));
        b3.isEmpty();
        if (b3.size() < 2) {
            return (k0)v.S4((Iterable)b3);
        }
        return new b0(set).f();
    }
    
    private final boolean e(final c0 c0, final c0 c2) {
        final m a = kotlin.reflect.jvm.internal.impl.types.checker.l.b.a();
        return a.d(c0, c2) && !a.d(c2, c0);
    }
    
    @e
    public final k0 c(@e final List<? extends k0> list) {
        kotlin.jvm.internal.k0.p((Object)list, "types");
        list.size();
        final ArrayList<k0> list2 = new ArrayList<k0>();
        for (final k0 e : list) {
            if (e.N0() instanceof b0) {
                final Collection<c0> k = e.N0().k();
                kotlin.jvm.internal.k0.o((Object)k, "type.constructor.supertypes");
                final ArrayList c = new ArrayList<k0>(v.Y((Iterable)k, 10));
                for (final c0 c2 : k) {
                    kotlin.jvm.internal.k0.o((Object)c2, "it");
                    k0 k2 = z.d(c2);
                    if (e.O0()) {
                        k2 = k2.U0(true);
                    }
                    c.add(k2);
                }
                list2.addAll((Collection<? extends k0>)c);
            }
            else {
                list2.add(e);
            }
        }
        a a = w.a.G;
        final Iterator<j1> iterator3 = list2.iterator();
        while (iterator3.hasNext()) {
            a = a.b(iterator3.next());
        }
        final LinkedHashSet<k0> set = new LinkedHashSet<k0>();
        for (k0 i : list2) {
            final k0 k3 = i;
            if (a == w.a.J) {
                k0 j = k3;
                if (k3 instanceof i) {
                    j = n0.k((i)k3);
                }
                i = n0.i(j, false, 1, null);
            }
            set.add(i);
        }
        return this.d(set);
    }
    
    private enum a
    {
        G, 
        H, 
        I, 
        J;
        
        @e
        public abstract w.a b(@e final j1 p0);
        
        @e
        protected final w.a d(@e final j1 j1) {
            kotlin.jvm.internal.k0.p((Object)j1, "<this>");
            w.a a;
            if (j1.O0()) {
                a = w.a.H;
            }
            else if (o.a.a(j1)) {
                a = w.a.J;
            }
            else {
                a = w.a.I;
            }
            return a;
        }
        
        static final class a extends w.a
        {
            a(final String s, final int n) {
                super(s, n, null);
            }
            
            @e
            @Override
            public w.a b(@e final j1 j1) {
                kotlin.jvm.internal.k0.p((Object)j1, "nextType");
                return this.d(j1);
            }
        }
        
        static final class b extends w.a
        {
            b(final String s, final int n) {
                super(s, n, null);
            }
            
            @e
            public b f(@e final j1 j1) {
                kotlin.jvm.internal.k0.p((Object)j1, "nextType");
                return this;
            }
        }
        
        static final class c extends w.a
        {
            c(final String s, final int n) {
                super(s, n, null);
            }
            
            @e
            @Override
            public w.a b(@e final j1 j1) {
                kotlin.jvm.internal.k0.p((Object)j1, "nextType");
                return this.d(j1);
            }
        }
        
        static final class d extends w.a
        {
            d(final String s, final int n) {
                super(s, n, null);
            }
            
            @e
            @Override
            public w.a b(@e final j1 j1) {
                kotlin.jvm.internal.k0.p((Object)j1, "nextType");
                w.a d;
                if ((d = this.d(j1)) == w.a.H) {
                    d = this;
                }
                return d;
            }
        }
    }
}
