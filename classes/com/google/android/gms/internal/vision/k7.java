// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.RandomAccess;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

final class k7 extends i7
{
    private static final Class<?> c;
    
    static {
        c = Collections.unmodifiableList(Collections.emptyList()).getClass();
    }
    
    private k7() {
        super(null);
    }
    
    private static <L> List<L> f(final Object o, final long n, final int initialCapacity) {
        final List<Object> g = g(o, n);
        RandomAccess randomAccess = null;
        Label_0080: {
            if (!g.isEmpty()) {
                if (k7.c.isAssignableFrom(g.getClass())) {
                    randomAccess = new ArrayList<Object>(g.size() + initialCapacity);
                    ((ArrayList)randomAccess).addAll(g);
                }
                else if (g instanceof p9) {
                    randomAccess = new g7(g.size() + initialCapacity);
                    ((v4)randomAccess).addAll(g);
                }
                else {
                    randomAccess = (RandomAccess)g;
                    if (!(g instanceof l8)) {
                        return (List<L>)randomAccess;
                    }
                    randomAccess = (RandomAccess)g;
                    if (!(g instanceof z6)) {
                        return (List<L>)randomAccess;
                    }
                    final v4<Object> v4 = (v4<Object>)g;
                    randomAccess = (RandomAccess)g;
                    if (!v4.zza()) {
                        randomAccess = v4.d(g.size() + initialCapacity);
                        break Label_0080;
                    }
                    return (List<L>)randomAccess;
                }
                r9.j(o, n, randomAccess);
                return (List<L>)randomAccess;
            }
            if (g instanceof j7) {
                randomAccess = new g7(initialCapacity);
            }
            else if (g instanceof l8 && g instanceof z6) {
                randomAccess = ((v4<Object>)g).d(initialCapacity);
            }
            else {
                randomAccess = new ArrayList(initialCapacity);
            }
        }
        r9.j(o, n, randomAccess);
        return (List<L>)randomAccess;
    }
    
    private static <E> List<E> g(final Object o, final long n) {
        return (List<E>)r9.F(o, n);
    }
    
    @Override
    final <L> List<L> b(final Object o, final long n) {
        return f(o, n, 10);
    }
    
    @Override
    final <E> void c(final Object o, final Object o2, final long n) {
        List<?> g = g(o2, n);
        final List<Object> f = f(o, n, g.size());
        final int size = f.size();
        final int size2 = g.size();
        if (size > 0 && size2 > 0) {
            f.addAll(g);
        }
        if (size > 0) {
            g = f;
        }
        r9.j(o, n, g);
    }
    
    @Override
    final void e(final Object o, final long n) {
        final List list = (List)r9.F(o, n);
        List<Object> list2;
        if (list instanceof j7) {
            list2 = (List<Object>)((j7)list).e();
        }
        else {
            if (k7.c.isAssignableFrom(((z6<? extends T>)list).getClass())) {
                return;
            }
            if (list instanceof l8 && list instanceof z6) {
                final z6<? extends T> z6 = (z6<? extends T>)list;
                if (z6.zza()) {
                    z6.zzb();
                }
                return;
            }
            list2 = Collections.unmodifiableList((List<?>)list);
        }
        r9.j(o, n, list2);
    }
}
