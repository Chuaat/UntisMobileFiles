// 
// Decompiled by Procyon v0.5.36
// 

package s7;

import rx.i;
import java.util.List;
import java.util.concurrent.TimeUnit;
import rx.o;
import rx.observers.j;
import rx.n;

public class a<T> extends n<T> implements rx.observers.a<T>
{
    private final j<T> L;
    
    public a(final j<T> l) {
        this.L = l;
    }
    
    public static <T> a<T> w(final long n) {
        final j<T> j = (j<T>)new j<Object>(n);
        final a a = new a<T>((j<Object>)j);
        a.r(j);
        return (a<T>)a;
    }
    
    @Override
    public rx.observers.a<T> A0(final long n, final TimeUnit timeUnit) {
        this.L.Z(n, timeUnit);
        return this;
    }
    
    @Override
    public rx.observers.a<T> B() {
        this.L.X();
        return this;
    }
    
    @Override
    public final rx.observers.a<T> B0(final int i, final long n, final TimeUnit timeUnit) {
        if (this.L.d0(i, n, timeUnit)) {
            return this;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Did not receive enough values in time. Expected: ");
        sb.append(i);
        sb.append(", Actual: ");
        sb.append(this.L.v0());
        throw new AssertionError((Object)sb.toString());
    }
    
    @Override
    public rx.observers.a<T> C0() {
        this.L.H();
        return this;
    }
    
    @Override
    public Thread E() {
        return this.L.E();
    }
    
    @Override
    public rx.observers.a<T> I() {
        this.L.F();
        return this;
    }
    
    @Override
    public rx.observers.a<T> O(final Throwable t) {
        this.L.A(t);
        return this;
    }
    
    @Override
    public rx.observers.a<T> P(final T t) {
        this.L.M(t);
        return this;
    }
    
    @Override
    public final rx.observers.a<T> Q(final T t, final T... array) {
        this.L.S(t, array);
        return this;
    }
    
    @Override
    public List<T> T() {
        return this.L.T();
    }
    
    @Override
    public rx.observers.a<T> U(final int n) {
        this.L.N(n);
        return this;
    }
    
    @Override
    public rx.observers.a<T> V(final Class<? extends Throwable> clazz) {
        this.L.x(clazz);
        return this;
    }
    
    @Override
    public final rx.observers.a<T> a0(final T... array) {
        this.L.R(array);
        this.L.D();
        this.L.w();
        return this;
    }
    
    @Override
    public void b(final Throwable t) {
        this.L.b(t);
    }
    
    @Override
    public rx.observers.a<T> b0() {
        this.L.L();
        return this;
    }
    
    @Override
    public void c() {
        this.L.c();
    }
    
    @Override
    public rx.observers.a<T> c0() {
        this.L.K();
        return this;
    }
    
    @Override
    public void f() {
        this.L.f();
    }
    
    @Override
    public rx.observers.a<T> i0(final long n, final TimeUnit timeUnit) {
        this.L.Y(n, timeUnit);
        return this;
    }
    
    @Override
    public rx.observers.a<T> k0() {
        this.L.D();
        return this;
    }
    
    @Override
    public List<Throwable> l0() {
        return this.L.l0();
    }
    
    @Override
    public void m(final T t) {
        this.L.m(t);
    }
    
    @Override
    public rx.observers.a<T> n0(final T... array) {
        this.L.R(array);
        return this;
    }
    
    @Override
    public final rx.observers.a<T> o0(final Class<? extends Throwable> clazz, final T... array) {
        this.L.R(array);
        this.L.x(clazz);
        this.L.H();
        return this;
    }
    
    @Override
    public rx.observers.a<T> q0() {
        this.L.G();
        return this;
    }
    
    @Override
    public final int r0() {
        return this.L.r0();
    }
    
    @Override
    public void s0(final i i) {
        this.L.s0(i);
    }
    
    @Override
    public final rx.observers.a<T> t0(final rx.functions.a a) {
        a.call();
        return this;
    }
    
    @Override
    public String toString() {
        return this.L.toString();
    }
    
    @Override
    public rx.observers.a<T> u0(final long n) {
        this.L.p0(n);
        return this;
    }
    
    @Override
    public final int v0() {
        return this.L.v0();
    }
    
    @Override
    public rx.observers.a<T> x0() {
        this.L.w();
        return this;
    }
    
    @Override
    public rx.observers.a<T> z(final List<T> list) {
        this.L.J(list);
        return this;
    }
    
    @Override
    public final rx.observers.a<T> z0(final Class<? extends Throwable> clazz, final String str, final T... array) {
        this.L.R(array);
        this.L.x(clazz);
        this.L.H();
        final String message = this.L.l0().get(0).getMessage();
        if (message != str && (str == null || !str.equals(message))) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Error message differs. Expected: '");
            sb.append(str);
            sb.append("', Received: '");
            sb.append(message);
            sb.append("'");
            throw new AssertionError((Object)sb.toString());
        }
        return this;
    }
}
