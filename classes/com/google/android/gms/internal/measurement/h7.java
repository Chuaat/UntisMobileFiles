// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.io.Serializable;

public abstract class h7<T> implements Serializable
{
    h7() {
    }
    
    public static <T> h7<T> c() {
        return (h7<T>)f7.G;
    }
    
    public static <T> h7<T> d(final T t) {
        return new j7<T>(t);
    }
    
    public abstract T a();
    
    public abstract boolean b();
}
