// 
// Decompiled by Procyon v0.5.36
// 

package z5;

import io.realm.rx.b;
import io.realm.k;
import io.realm.n0;
import io.realm.s0;
import io.realm.j;
import kotlinx.coroutines.flow.i;
import io.realm.l0;
import c6.g;
import io.realm.f0;

public interface a
{
     <T> i<l0<T>> a(@g final f0 p0, @g final l0<T> p1);
    
     <T> i<l0<T>> b(@g final j p0, @g final l0<T> p1);
    
     <T> i<s0<T>> c(@g final f0 p0, @g final s0<T> p1);
    
     <T extends n0> i<T> d(@g final f0 p0, @g final T p1);
    
    i<j> e(@g final j p0);
    
    i<f0> f(@g final f0 p0);
    
     <T> i<s0<T>> g(@g final j p0, @g final s0<T> p1);
    
    i<k> h(@g final j p0, @g final k p1);
    
     <T extends n0> i<b<T>> i(@g final f0 p0, @g final T p1);
    
     <T> i<io.realm.rx.a<l0<T>>> j(@g final j p0, @g final l0<T> p1);
    
     <T> i<io.realm.rx.a<s0<T>>> k(@g final f0 p0, @g final s0<T> p1);
    
    i<b<k>> l(@g final j p0, @g final k p1);
    
     <T> i<io.realm.rx.a<s0<T>>> m(@g final j p0, @g final s0<T> p1);
    
     <T> i<io.realm.rx.a<l0<T>>> n(@g final f0 p0, @g final l0<T> p1);
}
