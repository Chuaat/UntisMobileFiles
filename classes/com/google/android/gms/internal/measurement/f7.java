// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import c6.a;

final class f7<T> extends h7<T>
{
    static final f7<Object> G;
    
    static {
        G = new f7<Object>();
    }
    
    private f7() {
    }
    
    @Override
    public final T a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }
    
    @Override
    public final boolean b() {
        return false;
    }
    
    @Override
    public final boolean equals(@a final Object o) {
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
