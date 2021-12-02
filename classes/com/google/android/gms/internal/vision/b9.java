// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.Iterator;

final class b9
{
    private static final Iterator<Object> a;
    private static final Iterable<Object> b;
    
    static {
        a = new a9();
        b = new d9();
    }
    
    static <T> Iterable<T> a() {
        return (Iterable<T>)b9.b;
    }
}
