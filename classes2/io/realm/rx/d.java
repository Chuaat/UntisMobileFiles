// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.rx;

import io.reactivex.k0;
import io.realm.RealmQuery;
import io.reactivex.b0;
import io.realm.k;
import io.realm.n0;
import io.realm.s0;
import io.realm.j;
import io.reactivex.l;
import io.realm.l0;
import io.realm.f0;

public interface d
{
     <E> l<l0<E>> a(final f0 p0, final l0<E> p1);
    
     <E> l<l0<E>> b(final j p0, final l0<E> p1);
    
     <E> l<s0<E>> c(final f0 p0, final s0<E> p1);
    
     <E extends n0> l<E> d(final f0 p0, final E p1);
    
    l<j> e(final j p0);
    
    l<f0> f(final f0 p0);
    
     <E> l<s0<E>> g(final j p0, final s0<E> p1);
    
    l<k> h(final j p0, final k p1);
    
     <E> b0<a<s0<E>>> i(final j p0, final s0<E> p1);
    
     <E> b0<a<l0<E>>> j(final f0 p0, final l0<E> p1);
    
     <E> k0<RealmQuery<E>> k(final f0 p0, final RealmQuery<E> p1);
    
    b0<b<k>> l(final j p0, final k p1);
    
     <E> b0<a<l0<E>>> m(final j p0, final l0<E> p1);
    
     <E> k0<RealmQuery<E>> n(final j p0, final RealmQuery<E> p1);
    
     <E> b0<a<s0<E>>> o(final f0 p0, final s0<E> p1);
    
     <E extends n0> b0<b<E>> p(final f0 p0, final E p1);
}
