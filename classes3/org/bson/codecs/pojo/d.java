// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs.pojo;

import java.util.Iterator;
import org.bson.w0;
import org.bson.codecs.s0;
import org.bson.p0;
import org.bson.codecs.x0;
import org.bson.z0;
import org.bson.codecs.configuration.a;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collection;
import org.bson.codecs.n0;

final class d implements f0
{
    @Override
    public <T> n0<T> a(final q0<T> q0, final g0 g0) {
        if (Collection.class.isAssignableFrom(q0.a()) && q0.getTypeParameters().size() == 1) {
            return (n0<T>)new a((Class<Collection<Object>>)q0.a(), g0.a((q0<Object>)q0.getTypeParameters().get(0)));
        }
        return null;
    }
    
    private static class a<T> implements n0<Collection<T>>
    {
        private final Class<Collection<T>> a;
        private final n0<T> b;
        
        a(final Class<Collection<T>> a, final n0<T> b) {
            this.a = a;
            this.b = b;
        }
        
        private Collection<T> i() {
            if (this.a.isInterface()) {
                if (this.a.isAssignableFrom(ArrayList.class)) {
                    return new ArrayList<T>();
                }
                if (this.a.isAssignableFrom(HashSet.class)) {
                    return new HashSet<T>();
                }
                throw new org.bson.codecs.configuration.a(String.format("Unsupported Collection interface of %s!", this.a.getName()));
            }
            else {
                try {
                    return this.a.getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
                }
                catch (Exception ex) {
                    throw new org.bson.codecs.configuration.a(ex.getMessage(), ex);
                }
            }
        }
        
        public Collection<T> e(final p0 p2, final s0 s0) {
            final Collection<T> i = this.i();
            p2.h2();
            while (p2.o5() != org.bson.w0.H) {
                if (p2.O5() == org.bson.w0.R) {
                    i.add(null);
                    p2.H4();
                }
                else {
                    i.add(this.b.c(p2, s0));
                }
            }
            p2.P2();
            return i;
        }
        
        @Override
        public Class<Collection<T>> g() {
            return this.a;
        }
        
        public void h(final z0 z0, final Collection<T> collection, final x0 x0) {
            z0.R();
            for (final T next : collection) {
                if (next == null) {
                    z0.T();
                }
                else {
                    this.b.a(z0, next, x0);
                }
            }
            z0.o();
        }
    }
}
