// 
// Decompiled by Procyon v0.5.36
// 

package retrofit2;

import okio.t0;
import okhttp3.e0;
import java.io.IOException;
import java.util.Objects;
import java.lang.reflect.ParameterizedType;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import c6.h;
import java.util.concurrent.Executor;

final class g extends a
{
    @h
    private final Executor a;
    
    g(@h final Executor a) {
        this.a = a;
    }
    
    @h
    @Override
    public c<?, ?> a(final Type type, final Annotation[] array, final u u) {
        final Class<?> c = retrofit2.c.a.c(type);
        final Executor executor = null;
        if (c != retrofit2.b.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            final Type g = y.g(0, (ParameterizedType)type);
            Executor a;
            if (y.l(array, w.class)) {
                a = executor;
            }
            else {
                a = this.a;
            }
            return new c<Object, retrofit2.b<?>>() {
                @Override
                public Type a() {
                    return g;
                }
                
                public retrofit2.b<Object> c(retrofit2.b<Object> b) {
                    final Executor b2 = a;
                    if (b2 != null) {
                        b = new b<Object>(b2, (retrofit2.b<Object>)b);
                    }
                    return (retrofit2.b<Object>)b;
                }
            };
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
    
    static final class b<T> implements retrofit2.b<T>
    {
        final Executor G;
        final retrofit2.b<T> H;
        
        b(final Executor g, final retrofit2.b<T> h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public boolean G() {
            return this.H.G();
        }
        
        @Override
        public boolean K() {
            return this.H.K();
        }
        
        @Override
        public retrofit2.b<T> M() {
            return new b(this.G, (retrofit2.b<Object>)this.H.M());
        }
        
        @Override
        public void N2(final d<T> obj) {
            Objects.requireNonNull(obj, "callback == null");
            this.H.N2(new d<T>() {
                @Override
                public void a(final retrofit2.b<T> b, final Throwable t) {
                    g.b.this.G.execute(new retrofit2.h(this, obj, t));
                }
                
                @Override
                public void b(final retrofit2.b<T> b, final t<T> t) {
                    g.b.this.G.execute(new i(this, obj, t));
                }
            });
        }
        
        @Override
        public void cancel() {
            this.H.cancel();
        }
        
        @Override
        public e0 k() {
            return this.H.k();
        }
        
        @Override
        public t<T> p() throws IOException {
            return this.H.p();
        }
        
        @Override
        public t0 timeout() {
            return this.H.timeout();
        }
    }
}
