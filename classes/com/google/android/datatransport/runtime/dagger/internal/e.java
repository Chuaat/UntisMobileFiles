// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime.dagger.internal;

import e6.c;

public final class e<T> implements g<T>
{
    private c<T> a;
    
    public static <T> void b(final c<T> c, final c<T> a) {
        p.b(a);
        final e e = (e)c;
        if (e.a == null) {
            e.a = (c<T>)a;
            return;
        }
        throw new IllegalStateException();
    }
    
    c<T> a() {
        return p.b(this.a);
    }
    
    @Deprecated
    public void c(final c<T> c) {
        b((e6.c<Object>)this, (e6.c<Object>)c);
    }
    
    public T get() {
        final c<T> a = this.a;
        if (a != null) {
            return (T)a.get();
        }
        throw new IllegalStateException();
    }
}
