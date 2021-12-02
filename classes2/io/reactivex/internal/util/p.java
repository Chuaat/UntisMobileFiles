// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.util;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import x5.c;

public final class p<T> implements c<List<T>, List<T>, List<T>>
{
    final Comparator<? super T> G;
    
    public p(final Comparator<? super T> g) {
        this.G = g;
    }
    
    public List<T> a(final List<T> list, final List<T> list2) throws Exception {
        final int initialCapacity = list.size() + list2.size();
        if (initialCapacity == 0) {
            return new ArrayList<T>();
        }
        final ArrayList list3 = new ArrayList<T>(initialCapacity);
        final Iterator<T> iterator = list.iterator();
        final Iterator<T> iterator2 = list2.iterator();
        T t;
        if (iterator.hasNext()) {
            t = iterator.next();
        }
        else {
            t = null;
        }
        T t2 = t;
        while (true) {
            Label_0099: {
                Label_0088: {
                    if (iterator2.hasNext()) {
                        break Label_0088;
                    }
                    break Label_0099;
                    final T next;
                    while (t != null && next != null) {
                        if (this.G.compare((Object)t, (Object)next) < 0) {
                            list3.add(t);
                            if (iterator.hasNext()) {
                                t = iterator.next();
                            }
                            else {
                                t = null;
                            }
                        }
                        else {
                            list3.add(next);
                            t2 = t;
                            if (iterator2.hasNext()) {
                                break Label_0088;
                            }
                            break Label_0099;
                        }
                    }
                    if (t != null) {
                        list3.add(t);
                        while (iterator.hasNext()) {
                            list3.add(iterator.next());
                        }
                    }
                    else {
                        list3.add(next);
                        while (iterator2.hasNext()) {
                            list3.add(iterator2.next());
                        }
                    }
                    return (List<T>)list3;
                }
                final T next = iterator2.next();
                continue;
            }
            final T next = null;
            t = t2;
            continue;
        }
    }
}
