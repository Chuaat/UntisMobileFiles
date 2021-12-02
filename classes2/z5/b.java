// 
// Decompiled by Procyon v0.5.36
// 

package z5;

import io.realm.k;
import io.realm.n0;
import io.realm.s0;
import io.realm.j;
import kotlinx.coroutines.flow.i;
import io.realm.l0;
import c6.g;
import io.realm.f0;

public class b implements a
{
    private final io.realm.internal.coroutines.a a;
    
    public b(final Boolean b) {
        this.a = new io.realm.internal.coroutines.a(b);
    }
    
    @Override
    public <T> i<l0<T>> a(@g final f0 f0, @g final l0<T> l0) {
        return this.a.a(f0, l0);
    }
    
    @Override
    public <T> i<l0<T>> b(@g final j j, @g final l0<T> l0) {
        return this.a.b(j, l0);
    }
    
    @Override
    public <T> i<s0<T>> c(@g final f0 f0, @g final s0<T> s0) {
        return this.a.c(f0, s0);
    }
    
    @Override
    public <T extends n0> i<T> d(@g final f0 f0, @g final T t) {
        return this.a.d(f0, t);
    }
    
    @Override
    public i<j> e(@g final j j) {
        return this.a.e(j);
    }
    
    @Override
    public i<f0> f(@g final f0 f0) {
        return this.a.f(f0);
    }
    
    @Override
    public <T> i<s0<T>> g(@g final j j, @g final s0<T> s0) {
        return this.a.g(j, s0);
    }
    
    @Override
    public i<k> h(@g final j j, @g final k k) {
        return this.a.h(j, k);
    }
    
    @Override
    public <T extends n0> i<io.realm.rx.b<T>> i(@g final f0 f0, @g final T t) {
        return this.a.i(f0, t);
    }
    
    @Override
    public <T> i<io.realm.rx.a<l0<T>>> j(@g final j j, @g final l0<T> l0) {
        return this.a.j(j, l0);
    }
    
    @Override
    public <T> i<io.realm.rx.a<s0<T>>> k(@g final f0 f0, @g final s0<T> s0) {
        return this.a.k(f0, s0);
    }
    
    @Override
    public i<io.realm.rx.b<k>> l(@g final j j, @g final k k) {
        return this.a.l(j, k);
    }
    
    @Override
    public <T> i<io.realm.rx.a<s0<T>>> m(@g final j j, @g final s0<T> s0) {
        return this.a.m(j, s0);
    }
    
    @Override
    public <T> i<io.realm.rx.a<l0<T>>> n(@g final f0 f0, @g final l0<T> l0) {
        return this.a.n(f0, l0);
    }
}
