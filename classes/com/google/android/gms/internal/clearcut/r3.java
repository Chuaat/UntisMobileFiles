// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.util.Iterator;

final class r3
{
    private static final Iterator<Object> a;
    private static final Iterable<Object> b;
    
    static {
        a = new s3();
        b = new t3();
    }
    
    static <T> Iterable<T> a() {
        return (Iterable<T>)r3.b;
    }
}
