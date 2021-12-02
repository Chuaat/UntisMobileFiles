// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs.pojo;

import java.util.Iterator;
import org.bson.codecs.configuration.a;
import java.util.Map;
import java.util.Collection;

final class j implements e
{
    private <T> boolean b(final Class<T> clazz) {
        return Collection.class.isAssignableFrom(clazz) || Map.class.isAssignableFrom(clazz);
    }
    
    private <T> void c(final k0<T> k0) {
        k0.p(new b<T>((e0)k0.f()));
    }
    
    @Override
    public void a(final c<?> c) {
        for (final k0<T> k0 : c.q()) {
            if (!(k0.f() instanceof e0)) {
                throw new a(String.format("The USE_GETTER_AS_SETTER_CONVENTION is not compatible with propertyModelBuilder instance that have custom implementations of org.bson.codecs.pojo.PropertyAccessor: %s", k0.f().getClass().getName()));
            }
            final i0 b = ((e0)k0.f()).b();
            if (b.o() || !b.q() || !this.b((Class<Object>)b.k().a())) {
                continue;
            }
            this.c(k0);
        }
    }
    
    private static final class b<T> implements d0<T>
    {
        private final e0<T> a;
        
        private b(final e0<T> a) {
            this.a = a;
        }
        
        private <S> void a(final S n, final Collection collection) {
            final Collection collection2 = this.get(n);
            String s;
            if (collection2 == null) {
                s = "The getter returned null.";
            }
            else {
                if (collection2.isEmpty()) {
                    try {
                        collection2.addAll(collection);
                    }
                    catch (Exception ex) {
                        this.c("collection#addAll failed.", ex);
                    }
                    return;
                }
                s = "The getter returned a non empty collection.";
            }
            this.c(s, null);
        }
        
        private <S> void b(final S n, final Map map) {
            final Map map2 = this.get(n);
            String s;
            if (map2 == null) {
                s = "The getter returned null.";
            }
            else {
                if (map2.isEmpty()) {
                    try {
                        map2.putAll(map);
                    }
                    catch (Exception ex) {
                        this.c("map#putAll failed.", ex);
                    }
                    return;
                }
                s = "The getter returned a non empty map.";
            }
            this.c(s, null);
        }
        
        private void c(final String s, final Exception ex) {
            throw new a(String.format("Cannot use getter in '%s' to set '%s'. %s", this.a.b().d(), this.a.b().h(), s), ex);
        }
        
        @Override
        public <S> void d(final S n, final T t) {
            if (t instanceof Collection) {
                this.a(n, (Collection)t);
            }
            else if (t instanceof Map) {
                this.b(n, (Map)t);
            }
            else {
                this.c(String.format("Unexpected type: '%s'", t.getClass()), null);
            }
        }
        
        @Override
        public <S> T get(final S n) {
            return this.a.get(n);
        }
    }
}
