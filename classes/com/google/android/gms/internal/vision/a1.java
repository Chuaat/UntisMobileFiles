// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class a1<T> extends d1<T>
{
    static final a1<Object> G;
    
    static {
        G = new a1<Object>();
    }
    
    private a1() {
    }
    
    @Override
    public final boolean b() {
        return false;
    }
    
    @Override
    public final T c() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }
    
    @Override
    public final boolean equals(@NullableDecl final Object o) {
        return o == this;
    }
    
    @Override
    public final int hashCode() {
        return 2040732332;
    }
    
    @Override
    public final String toString() {
        return "Optional.absent()";
    }
}
