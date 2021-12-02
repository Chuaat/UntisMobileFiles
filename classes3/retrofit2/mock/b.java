// 
// Decompiled by Procyon v0.5.36
// 

package retrofit2.mock;

import c6.h;
import java.lang.reflect.Proxy;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.ExecutorService;
import retrofit2.u;

public final class b<T>
{
    final u a;
    private final f b;
    private final ExecutorService c;
    private final Class<T> d;
    
    b(final u a, final f b, final ExecutorService c, final Class<T> d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public <R> T a(final retrofit2.b<R> b) {
        return (T)Proxy.newProxyInstance(this.d.getClassLoader(), new Class[] { this.d }, new InvocationHandler() {
            final /* synthetic */ retrofit2.b a = new a(retrofit2.mock.b.this.b, retrofit2.mock.b.this.c, b);
            
            @Override
            public T invoke(final Object o, final Method method, final Object[] array) throws Throwable {
                return (T)retrofit2.mock.b.this.a.b(method.getGenericReturnType(), method.getAnnotations()).b(this.a);
            }
        });
    }
    
    public T b(@h final Object o) {
        return this.a((retrofit2.b<Object>)retrofit2.mock.c.c(o));
    }
}
