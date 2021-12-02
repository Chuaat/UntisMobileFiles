// 
// Decompiled by Procyon v0.5.36
// 

package retrofit2;

import c6.h;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public interface c<R, T>
{
    Type a();
    
    T b(final b<R> p0);
    
    public abstract static class a
    {
        protected static Type b(final int n, final ParameterizedType parameterizedType) {
            return y.g(n, parameterizedType);
        }
        
        protected static Class<?> c(final Type type) {
            return y.h(type);
        }
        
        @h
        public abstract c<?, ?> a(final Type p0, final Annotation[] p1, final u p2);
    }
}
