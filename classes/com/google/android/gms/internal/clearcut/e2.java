// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.util.RandomAccess;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

final class e2 extends b2
{
    private static final Class<?> c;
    
    static {
        c = Collections.unmodifiableList(Collections.emptyList()).getClass();
    }
    
    private e2() {
        super(null);
    }
    
    private static <E> List<E> e(final Object o, final long n) {
        return (List<E>)j4.M(o, n);
    }
    
    @Override
    final void a(final Object o, final long n) {
        final List list = (List)j4.M(o, n);
        List<Object> list2;
        if (list instanceof a2) {
            list2 = (List<Object>)((a2)list).c5();
        }
        else {
            if (e2.c.isAssignableFrom(list.getClass())) {
                return;
            }
            list2 = Collections.unmodifiableList((List<?>)list);
        }
        j4.i(o, n, list2);
    }
    
    @Override
    final <E> void b(final Object o, final Object o2, final long n) {
        List<?> e = e(o2, n);
        final int size = e.size();
        final List<Object> e2 = (List<Object>)e(o, n);
        RandomAccess randomAccess = null;
        Label_0163: {
            if (e2.isEmpty()) {
                if (e2 instanceof a2) {
                    randomAccess = new z1(size);
                }
                else {
                    randomAccess = new ArrayList<Object>(size);
                }
                j4.i(o, n, randomAccess);
            }
            else {
                if (com.google.android.gms.internal.clearcut.e2.c.isAssignableFrom(e2.getClass())) {
                    randomAccess = new ArrayList<Object>(e2.size() + size);
                    ((ArrayList<Object>)randomAccess).addAll(e2);
                }
                else {
                    randomAccess = (RandomAccess)e2;
                    if (!(e2 instanceof g4)) {
                        break Label_0163;
                    }
                    randomAccess = new z1(e2.size() + size);
                    ((w<Object>)randomAccess).addAll(e2);
                }
                j4.i(o, n, randomAccess);
            }
        }
        final int size2 = ((List)randomAccess).size();
        final int size3 = e.size();
        if (size2 > 0 && size3 > 0) {
            ((List<Object>)randomAccess).addAll(e);
        }
        if (size2 > 0) {
            e = (List<?>)randomAccess;
        }
        j4.i(o, n, e);
    }
}
