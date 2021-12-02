// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.io.Serializable;

public abstract class d1<T> implements Serializable
{
    d1() {
    }
    
    public static <T> d1<T> a(final T t) {
        return new j1<T>(k1.b(t));
    }
    
    public static <T> d1<T> d() {
        return (d1<T>)a1.G;
    }
    
    public abstract boolean b();
    
    public abstract T c();
}
