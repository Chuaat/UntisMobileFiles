// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.io.Serializable;

public final class o7
{
    public static <T> k7<T> a(final k7<T> k7) {
        if (!(k7 instanceof m7) && !(k7 instanceof l7)) {
            k7 k8;
            if (k7 instanceof Serializable) {
                k8 = new l7(k7);
            }
            else {
                k8 = new m7<T>(k7);
            }
            return (k7<T>)k8;
        }
        return k7;
    }
    
    public static <T> k7<T> b(final T t) {
        return (k7<T>)new n7(t);
    }
}
