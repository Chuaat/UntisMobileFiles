// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs.pojo;

import java.util.Iterator;
import java.lang.reflect.Modifier;
import org.bson.codecs.configuration.a;

final class i implements e
{
    private <T> void b(final k0<T> k0) {
        k0.p(new b<T>((e0)k0.f()));
    }
    
    @Override
    public void a(final c<?> c) {
        for (final k0<T> k0 : c.q()) {
            if (!(k0.f() instanceof e0)) {
                throw new a(String.format("The SET_PRIVATE_FIELDS_CONVENTION is not compatible with propertyModelBuilder instance that have custom implementations of org.bson.codecs.pojo.PropertyAccessor: %s", k0.f().getClass().getName()));
            }
            final i0 b = ((e0)k0.f()).b();
            if (b.o() || b.f() == null || !Modifier.isPrivate(b.f().getModifiers())) {
                continue;
            }
            this.b((k0<Object>)k0);
        }
    }
    
    private static final class b<T> implements d0<T>
    {
        private final e0<T> a;
        
        private b(final e0<T> a) {
            this.a = a;
            try {
                a.b().f().setAccessible(true);
            }
            catch (Exception ex) {
                throw new a(String.format("Unable to make private field accessible '%s' in %s", a.b().h(), a.b().d()), ex);
            }
        }
        
        @Override
        public <S> void d(final S obj, final T value) {
            try {
                this.a.b().f().set(obj, value);
            }
            catch (Exception ex) {
                throw new a(String.format("Unable to set value for property '%s' in %s", this.a.b().h(), this.a.b().d()), ex);
            }
        }
        
        @Override
        public <S> T get(final S n) {
            return this.a.get(n);
        }
    }
}
