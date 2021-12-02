// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs.pojo;

import org.bson.codecs.s0;
import org.bson.p0;
import org.bson.codecs.x0;
import org.bson.z0;
import org.bson.codecs.configuration.a;
import org.bson.codecs.n0;
import org.bson.codecs.configuration.d;

final class n implements f0
{
    private final d a;
    
    n(final d a) {
        this.a = a;
    }
    
    @Override
    public <T> n0<T> a(q0<T> a, final g0 g0) {
        a = ((q0<?>)a).a();
        if (Enum.class.isAssignableFrom(a)) {
            try {
                return this.a.a(a);
            }
            catch (org.bson.codecs.configuration.a a2) {
                return new a<T>((Class<T>)a);
            }
        }
        return null;
    }
    
    private static class a<T extends Enum<T>> implements n0<T>
    {
        private final Class<T> a;
        
        a(final Class<T> a) {
            this.a = a;
        }
        
        public T e(final p0 p2, final s0 s0) {
            return Enum.valueOf(this.a, p2.U());
        }
        
        @Override
        public Class<T> g() {
            return this.a;
        }
        
        public void h(final z0 z0, final T t, final x0 x0) {
            z0.i(t.name());
        }
    }
}
