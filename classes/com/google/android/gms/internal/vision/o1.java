// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import java.io.Serializable;

public final class o1
{
    public static <T> l1<T> a(final l1<T> l1) {
        if (l1 instanceof q1 || l1 instanceof n1) {
            return l1;
        }
        if (l1 instanceof Serializable) {
            return new n1<T>(l1);
        }
        return new q1<T>(l1);
    }
    
    public static <T> l1<T> b(@NullableDecl final T t) {
        return new p1<T>(t);
    }
}
