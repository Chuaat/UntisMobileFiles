// 
// Decompiled by Procyon v0.5.36
// 

package retrofit2;

import kotlin.coroutines.d;
import c6.h;
import okhttp3.g0;
import java.lang.reflect.ParameterizedType;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.lang.reflect.Method;
import okhttp3.h0;
import okhttp3.e;

abstract class k<ResponseT, ReturnT> extends v<ReturnT>
{
    private final s a;
    private final e.a b;
    private final f<h0, ResponseT> c;
    
    k(final s a, final e.a b, final f<h0, ResponseT> c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    private static <ResponseT, ReturnT> retrofit2.c<ResponseT, ReturnT> d(final u u, final Method method, final Type type, final Annotation[] array) {
        try {
            return (retrofit2.c<ResponseT, ReturnT>)u.b(type, array);
        }
        catch (RuntimeException ex) {
            throw y.n(method, ex, "Unable to create call adapter for %s", type);
        }
    }
    
    private static <ResponseT> f<h0, ResponseT> e(final u u, final Method method, final Type type) {
        final Annotation[] annotations = method.getAnnotations();
        try {
            return (f<h0, ResponseT>)u.n(type, annotations);
        }
        catch (RuntimeException ex) {
            throw y.n(method, ex, "Unable to create converter for %s", type);
        }
    }
    
    static <ResponseT, ReturnT> k<ResponseT, ReturnT> f(final u u, final Method method, final s s) {
        final boolean k = s.k;
        Annotation[] array = method.getAnnotations();
        boolean b;
        Type genericReturnType;
        if (k) {
            final Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type type = y.f(0, (ParameterizedType)genericParameterTypes[genericParameterTypes.length - 1]);
            if (y.h(type) == t.class && type instanceof ParameterizedType) {
                type = y.g(0, (ParameterizedType)type);
                b = true;
            }
            else {
                b = false;
            }
            genericReturnType = new y.b(null, retrofit2.b.class, new Type[] { type });
            array = x.a(array);
        }
        else {
            genericReturnType = method.getGenericReturnType();
            b = false;
        }
        final retrofit2.c<Object, Object> d = d(u, method, genericReturnType, array);
        final Type a = d.a();
        if (a == g0.class) {
            final StringBuilder sb = new StringBuilder();
            sb.append("'");
            sb.append(y.h(a).getName());
            sb.append("' is not a valid response body type. Did you mean ResponseBody?");
            throw y.m(method, sb.toString(), new Object[0]);
        }
        if (a == t.class) {
            throw y.m(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        }
        if (s.c.equals("HEAD") && !Void.class.equals(a)) {
            throw y.m(method, "HEAD method must use Void as response type.", new Object[0]);
        }
        final f<h0, Object> e = e(u, method, a);
        final e.a b2 = u.b;
        if (!k) {
            return new a<ResponseT, ReturnT>(s, b2, e, d);
        }
        if (b) {
            return (k<ResponseT, ReturnT>)new c(s, b2, e, (retrofit2.c<Object, retrofit2.b<Object>>)d);
        }
        return (k<ResponseT, ReturnT>)new b(s, b2, e, (retrofit2.c<Object, retrofit2.b<Object>>)d, false);
    }
    
    @h
    @Override
    final ReturnT a(final Object[] array) {
        return this.c(new n<ResponseT>(this.a, array, this.b, this.c), array);
    }
    
    @h
    protected abstract ReturnT c(final retrofit2.b<ResponseT> p0, final Object[] p1);
    
    static final class a<ResponseT, ReturnT> extends k<ResponseT, ReturnT>
    {
        private final retrofit2.c<ResponseT, ReturnT> d;
        
        a(final s s, final e.a a, final f<h0, ResponseT> f, final retrofit2.c<ResponseT, ReturnT> d) {
            super(s, a, f);
            this.d = d;
        }
        
        @Override
        protected ReturnT c(final retrofit2.b<ResponseT> b, final Object[] array) {
            return this.d.b(b);
        }
    }
    
    static final class b<ResponseT> extends k<ResponseT, Object>
    {
        private final retrofit2.c<ResponseT, retrofit2.b<ResponseT>> d;
        private final boolean e;
        
        b(final s s, final e.a a, final f<h0, ResponseT> f, final retrofit2.c<ResponseT, retrofit2.b<ResponseT>> d, final boolean e) {
            super(s, a, f);
            this.d = d;
            this.e = e;
        }
        
        @Override
        protected Object c(final retrofit2.b<ResponseT> b, Object[] array) {
            final retrofit2.b<ResponseT> b2 = this.d.b(b);
            array = (Object[])array[array.length - 1];
            try {
                Object o;
                if (this.e) {
                    o = m.b(b2, (kotlin.coroutines.d<? super ResponseT>)array);
                }
                else {
                    o = m.a(b2, (kotlin.coroutines.d<? super ResponseT>)array);
                }
                return o;
            }
            catch (Exception ex) {
                return m.e(ex, (d<?>)array);
            }
        }
    }
    
    static final class c<ResponseT> extends k<ResponseT, Object>
    {
        private final retrofit2.c<ResponseT, retrofit2.b<ResponseT>> d;
        
        c(final s s, final e.a a, final f<h0, ResponseT> f, final retrofit2.c<ResponseT, retrofit2.b<ResponseT>> d) {
            super(s, a, f);
            this.d = d;
        }
        
        @Override
        protected Object c(retrofit2.b<ResponseT> d, final Object[] array) {
            final retrofit2.b<ResponseT> b = this.d.b((retrofit2.b<ResponseT>)d);
            d = (d)array[array.length - 1];
            try {
                return m.c(b, (kotlin.coroutines.d<? super t<ResponseT>>)d);
            }
            catch (Exception ex) {
                return m.e(ex, (d<?>)d);
            }
        }
    }
}
