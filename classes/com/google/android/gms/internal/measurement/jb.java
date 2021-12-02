// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.Iterator;

final class jb
{
    private static final Iterator<Object> a;
    private static final Iterable<Object> b;
    
    static {
        a = new hb();
        b = new ib();
    }
    
    static <T> Iterable<T> a() {
        return (Iterable<T>)jb.b;
    }
}
