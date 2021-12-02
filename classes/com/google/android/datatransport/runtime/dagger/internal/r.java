// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime.dagger.internal;

import java.util.HashSet;
import java.util.Collections;
import java.util.Set;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public final class r<T>
{
    private static final String b = "Set contributions cannot be null";
    private final List<T> a;
    
    private r(final int initialCapacity) {
        this.a = new ArrayList<T>(initialCapacity);
    }
    
    public static <T> r<T> d(final int n) {
        return new r<T>(n);
    }
    
    public r<T> a(final T t) {
        this.a.add(p.c(t, "Set contributions cannot be null"));
        return this;
    }
    
    public r<T> b(final Collection<? extends T> collection) {
        final Iterator<? extends T> iterator = collection.iterator();
        while (iterator.hasNext()) {
            p.c((Object)iterator.next(), "Set contributions cannot be null");
        }
        this.a.addAll(collection);
        return this;
    }
    
    public Set<T> c() {
        final int size = this.a.size();
        if (size == 0) {
            return Collections.emptySet();
        }
        if (size != 1) {
            return Collections.unmodifiableSet((Set<? extends T>)new HashSet<T>((Collection<? extends T>)this.a));
        }
        return Collections.singleton(this.a.get(0));
    }
}
