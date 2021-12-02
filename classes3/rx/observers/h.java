// 
// Decompiled by Procyon v0.5.36
// 

package rx.observers;

import rx.functions.a;
import rx.exceptions.g;
import rx.n;
import rx.functions.b;

public final class h
{
    private h() {
        throw new IllegalStateException("No instances!");
    }
    
    public static <T> n<T> a(final b<? super T> b) {
        if (b != null) {
            return new n<T>() {
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
    
    public static <T> n<T> b(final b<? super T> b, final b<Throwable> b2) {
        if (b == null) {
            throw new IllegalArgumentException("onNext can not be null");
        }
        if (b2 != null) {
            return new n<T>() {
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
    
    public static <T> n<T> c(final b<? super T> b, final b<Throwable> b2, final a a) {
        if (b == null) {
            throw new IllegalArgumentException("onNext can not be null");
        }
        if (b2 == null) {
            throw new IllegalArgumentException("onError can not be null");
        }
        if (a != null) {
            return new n<T>() {
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
    
    public static <T> n<T> d() {
        return e(c.d());
    }
    
    public static <T> n<T> e(final rx.h<? super T> h) {
        return new n<T>() {
            @Override
            public void b(final Throwable t) {
                h.b(t);
            }
            
            @Override
            public void c() {
                h.c();
            }
            
            @Override
            public void m(final T t) {
                h.m(t);
            }
        };
    }
    
    public static <T> n<T> f(final n<? super T> n) {
        return new n<T>(n) {
            @Override
            public void b(final Throwable t) {
                n.b(t);
            }
            
            @Override
            public void c() {
                n.c();
            }
            
            @Override
            public void m(final T t) {
                n.m(t);
            }
        };
    }
}
