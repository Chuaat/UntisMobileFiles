// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime.dagger.internal;

import java.util.Iterator;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Collection;
import e6.c;
import java.util.List;
import java.util.Set;

public final class s<T> implements g<Set<T>>
{
    private static final g<Set<Object>> c;
    private final List<c<T>> a;
    private final List<c<Collection<T>>> b;
    
    static {
        c = j.a(Collections.emptySet());
    }
    
    private s(final List<c<T>> a, final List<c<Collection<T>>> b) {
        this.a = a;
        this.b = b;
    }
    
    public static <T> b<T> a(final int n, final int n2) {
        return new b<T>(n, n2);
    }
    
    public static <T> g<Set<T>> b() {
        return (g<Set<T>>)s.c;
    }
    
    public Set<T> c() {
        int size = this.a.size();
        final ArrayList<Collection<T>> list = new ArrayList<Collection<T>>(this.b.size());
        final int size2 = this.b.size();
        final int n = 0;
        for (int i = 0; i < size2; ++i) {
            final Collection collection = (Collection)this.b.get(i).get();
            size += collection.size();
            list.add(collection);
        }
        final HashSet<Object> c = d.c(size);
        for (int size3 = this.a.size(), j = 0; j < size3; ++j) {
            c.add(p.b(this.a.get(j).get()));
        }
        for (int size4 = list.size(), k = n; k < size4; ++k) {
            final Iterator<T> iterator = list.get(k).iterator();
            while (iterator.hasNext()) {
                c.add(p.b((Object)iterator.next()));
            }
        }
        return Collections.unmodifiableSet((Set<? extends T>)c);
    }
    
    public static final class b<T>
    {
        private final List<c<T>> a;
        private final List<c<Collection<T>>> b;
        
        private b(final int n, final int n2) {
            this.a = d.e(n);
            this.b = d.e(n2);
        }
        
        public b<T> a(final c<? extends Collection<? extends T>> c) {
            this.b.add((c<Collection<T>>)c);
            return this;
        }
        
        public b<T> b(final c<? extends T> c) {
            this.a.add((c<T>)c);
            return this;
        }
        
        public s<T> c() {
            return new s<T>(this.a, this.b, null);
        }
    }
}
