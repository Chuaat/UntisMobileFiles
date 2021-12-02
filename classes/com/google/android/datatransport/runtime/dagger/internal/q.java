// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime.dagger.internal;

import x1.e;
import e6.c;

public final class q<T> implements c<e<T>>
{
    private final c<T> a;
    
    private q(final c<T> a) {
        this.a = a;
    }
    
    public static <T> c<e<T>> a(final c<T> c) {
        return (c<e<T>>)new q((e6.c<Object>)p.b(c));
    }
    
    public e<T> b() {
        return f.a(this.a);
    }
}
