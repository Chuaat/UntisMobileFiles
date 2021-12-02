// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import c6.h;
import java.util.List;

public interface OrderedRealmCollection<E> extends List<E>, RealmCollection<E>
{
    s0<E> B3(final String[] p0, final v0[] p1);
    
    @h
    E G3(@h final E p0);
    
    s0<E> R3(final String p0, final v0 p1, final String p2, final v0 p3);
    
    s0<E> W5(final String p0, final v0 p1);
    
    b0<E> Y3();
    
    void Z6(final int p0);
    
    boolean a5();
    
    @h
    E f1();
    
    boolean h5();
    
    s0<E> n4(final String p0);
    
    @h
    E o2();
    
    @h
    E w6(@h final E p0);
}
