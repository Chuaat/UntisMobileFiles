// 
// Decompiled by Procyon v0.5.36
// 

package rx.observers;

import rx.functions.a;
import rx.functions.b;
import rx.exceptions.g;
import rx.h;

public final class c
{
    private static final h<Object> a;
    
    static {
        a = new h<Object>() {
            @Override
            public final void b(final Throwable t) {
                throw new g(t);
            }
            
            @Override
            public final void c() {
            }
            
            @Override
            public final void m(final Object o) {
            }
        };
    }
    
    private c() {
        throw new IllegalStateException("No instances!");
    }
    
    public static <T> h<T> a(final b<? super T> b) {
        if (b != null) {
            return new h<T>() {
                @Override
                public final void b(final Throwable t) {
                    throw new g(t);
                }
                
                @Override
                public final void c() {
                }
                
                @Override
                public final void m(final T t) {
                    b.h(t);
                }
            };
        }
        throw new IllegalArgumentException("onNext can not be null");
    }
    
    public static <T> h<T> b(final b<? super T> b, final b<Throwable> b2) {
        if (b == null) {
            throw new IllegalArgumentException("onNext can not be null");
        }
        if (b2 != null) {
            return new h<T>() {
                @Override
                public final void b(final Throwable t) {
                    b2.h(t);
                }
                
                @Override
                public final void c() {
                }
                
                @Override
                public final void m(final T t) {
                    b.h(t);
                }
            };
        }
        throw new IllegalArgumentException("onError can not be null");
    }
    
    public static <T> h<T> c(final b<? super T> b, final b<Throwable> b2, final a a) {
        if (b == null) {
            throw new IllegalArgumentException("onNext can not be null");
        }
        if (b2 == null) {
            throw new IllegalArgumentException("onError can not be null");
        }
        if (a != null) {
            return new h<T>() {
                @Override
                public final void b(final Throwable t) {
                    b2.h(t);
                }
                
                @Override
                public final void c() {
                    a.call();
                }
                
                @Override
                public final void m(final T t) {
                    b.h(t);
                }
            };
        }
        throw new IllegalArgumentException("onComplete can not be null");
    }
    
    public static <T> h<T> d() {
        return (h<T>)c.a;
    }
}
