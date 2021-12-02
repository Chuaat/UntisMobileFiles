// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.components;

import java.util.Iterator;
import java.util.Map;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.Set;
import n3.b;

class a0<T> implements b<Set<T>>
{
    private volatile Set<b<T>> a;
    private volatile Set<T> b;
    
    a0(final Collection<b<T>> collection) {
        this.b = null;
        (this.a = Collections.newSetFromMap(new ConcurrentHashMap<b<T>, Boolean>())).addAll(collection);
    }
    
    static a0<?> b(final Collection<b<?>> collection) {
        return new a0<Object>(collection);
    }
    
    private void d() {
        synchronized (this) {
            final Iterator<b<T>> iterator = this.a.iterator();
            while (iterator.hasNext()) {
                this.b.add((T)iterator.next().get());
            }
            this.a = null;
        }
    }
    
    void a(final b<T> b) {
        synchronized (this) {
            b<T> b2;
            Set<b<T>> set;
            if (this.b == null) {
                final Set<b<T>> a = this.a;
                b2 = b;
                set = a;
            }
            else {
                final Set<T> b3 = this.b;
                final Object value = b.get();
                set = (Set<b<T>>)b3;
                b2 = (b<T>)value;
            }
            set.add(b2);
        }
    }
    
    public Set<T> c() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    this.b = Collections.newSetFromMap(new ConcurrentHashMap<T, Boolean>());
                    this.d();
                }
            }
        }
        return Collections.unmodifiableSet((Set<? extends T>)this.b);
    }
}
