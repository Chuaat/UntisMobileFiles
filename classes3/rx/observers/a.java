// 
// Decompiled by Procyon v0.5.36
// 

package rx.observers;

import rx.i;
import java.util.List;
import java.util.concurrent.TimeUnit;
import rx.o;
import rx.h;

public interface a<T> extends h<T>, o
{
    a<T> A0(final long p0, final TimeUnit p1);
    
    a<T> B();
    
    a<T> B0(final int p0, final long p1, final TimeUnit p2);
    
    a<T> C0();
    
    Thread E();
    
    a<T> I();
    
    a<T> O(final Throwable p0);
    
    a<T> P(final T p0);
    
    a<T> Q(final T p0, final T... p1);
    
    List<T> T();
    
    a<T> U(final int p0);
    
    a<T> V(final Class<? extends Throwable> p0);
    
    a<T> a0(final T... p0);
    
    a<T> b0();
    
    a<T> c0();
    
    void f();
    
    boolean g();
    
    void i();
    
    a<T> i0(final long p0, final TimeUnit p1);
    
    a<T> k0();
    
    List<Throwable> l0();
    
    a<T> n0(final T... p0);
    
    a<T> o0(final Class<? extends Throwable> p0, final T... p1);
    
    a<T> q0();
    
    int r0();
    
    void s0(final i p0);
    
    a<T> t0(final rx.functions.a p0);
    
    a<T> u0(final long p0);
    
    int v0();
    
    a<T> x0();
    
    a<T> z(final List<T> p0);
    
    a<T> z0(final Class<? extends Throwable> p0, final String p1, final T... p2);
}
