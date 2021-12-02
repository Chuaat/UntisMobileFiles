// 
// Decompiled by Procyon v0.5.36
// 

package retrofit2;

import okhttp3.h0;
import okhttp3.f0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.lang.reflect.ParameterizedType;
import c6.h;
import java.io.IOException;

public interface f<F, T>
{
    @h
    T a(final F p0) throws IOException;
    
    public abstract static class a
    {
        protected static Type a(final int n, final ParameterizedType parameterizedType) {
            return y.g(n, parameterizedType);
        }
        
        protected static Class<?> b(final Type type) {
            return y.h(type);
        }
        
        @h
        public f<?, f0> c(final Type type, final Annotation[] array, final Annotation[] array2, final u u) {
            return null;
        }
        
        @h
        public f<h0, ?> d(final Type type, final Annotation[] array, final u u) {
            return null;
        }
        
        @h
        public f<?, String> e(final Type type, final Annotation[] array, final u u) {
            return null;
        }
    }
}
