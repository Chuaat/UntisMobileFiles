// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import java.util.Date;
import c6.h;
import io.realm.internal.i;
import java.util.Collection;

public interface RealmCollection<E> extends Collection<E>, i
{
    RealmCollection<E> B1();
    
    boolean G0();
    
    @h
    Number M1(final String p0);
    
    boolean T();
    
    boolean T3();
    
    boolean Y4();
    
    Number Y6(final String p0);
    
    RealmQuery<E> a3();
    
    boolean contains(@h final Object p0);
    
    boolean e1();
    
    @h
    Number g3(final String p0);
    
    @h
    Date r2(final String p0);
    
    double r3(final String p0);
    
    @h
    Date z4(final String p0);
}
