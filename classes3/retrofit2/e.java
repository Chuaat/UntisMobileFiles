// 
// Decompiled by Procyon v0.5.36
// 

package retrofit2;

import c6.h;
import java.lang.reflect.ParameterizedType;
import java.util.concurrent.CompletableFuture;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@IgnoreJRERequirement
final class e extends retrofit2.c.a
{
    static final retrofit2.c.a a;
    
    static {
        a = new e();
    }
    
    @h
    @Override
    public retrofit2.c<?, ?> a(Type b, final Annotation[] array, final u u) {
        if (retrofit2.c.a.c(b) != CompletableFuture.class) {
            return null;
        }
        if (!(b instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        b = retrofit2.c.a.b(0, (ParameterizedType)b);
        if (retrofit2.c.a.c(b) != t.class) {
            return new a<Object>(b);
        }
        if (b instanceof ParameterizedType) {
            return new c<Object>(retrofit2.c.a.b(0, (ParameterizedType)b));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
    
    @IgnoreJRERequirement
    private static final class a<R> implements c<R, CompletableFuture<R>>
    {
        private final Type a;
        
        a(final Type a) {
            this.a = a;
        }
        
        @Override
        public Type a() {
            return this.a;
        }
        
        public CompletableFuture<R> c(final retrofit2.b<R> b) {
            final b<R> b2 = new b<R>(b);
            b.N2(new e.a.a(b2));
            return b2;
        }
        
        @IgnoreJRERequirement
        private class a implements d<R>
        {
            private final CompletableFuture<R> a;
            
            public a(final CompletableFuture<R> a) {
                this.a = a;
            }
            
            @Override
            public void a(final retrofit2.b<R> b, final Throwable ex) {
                this.a.completeExceptionally(ex);
            }
            
            @Override
            public void b(final retrofit2.b<R> b, final t<R> t) {
                if (t.g()) {
                    this.a.complete(t.a());
                }
                else {
                    this.a.completeExceptionally(new j(t));
                }
            }
        }
    }
    
    @IgnoreJRERequirement
    private static final class b<T> extends CompletableFuture<T>
    {
        private final retrofit2.b<?> G;
        
        b(final retrofit2.b<?> g) {
            this.G = g;
        }
        
        @Override
        public boolean cancel(final boolean mayInterruptIfRunning) {
            if (mayInterruptIfRunning) {
                this.G.cancel();
            }
            return super.cancel(mayInterruptIfRunning);
        }
    }
    
    @IgnoreJRERequirement
    private static final class c<R> implements retrofit2.c<R, CompletableFuture<t<R>>>
    {
        private final Type a;
        
        c(final Type a) {
            this.a = a;
        }
        
        @Override
        public Type a() {
            return this.a;
        }
        
        public CompletableFuture<t<R>> c(final retrofit2.b<R> b) {
            final b<t<R>> b2 = new b<t<R>>(b);
            b.N2(new a(b2));
            return b2;
        }
        
        @IgnoreJRERequirement
        private class a implements d<R>
        {
            private final CompletableFuture<t<R>> a;
            
            public a(final CompletableFuture<t<R>> a) {
                this.a = a;
            }
            
            @Override
            public void a(final retrofit2.b<R> b, final Throwable ex) {
                this.a.completeExceptionally(ex);
            }
            
            @Override
            public void b(final retrofit2.b<R> b, final t<R> value) {
                this.a.complete(value);
            }
        }
    }
}
