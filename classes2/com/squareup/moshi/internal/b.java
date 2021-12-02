// 
// Decompiled by Procyon v0.5.36
// 

package com.squareup.moshi.internal;

import com.squareup.moshi.t;
import java.io.IOException;
import com.squareup.moshi.m;
import com.squareup.moshi.h;

public final class b<T> extends h<T>
{
    private final h<T> a;
    
    public b(final h<T> a) {
        this.a = a;
    }
    
    @c6.h
    @Override
    public T b(final m m) throws IOException {
        if (m.w() == m.c.O) {
            return m.q();
        }
        return this.a.b(m);
    }
    
    @Override
    public void m(final t t, @c6.h final T t2) throws IOException {
        if (t2 == null) {
            t.q();
        }
        else {
            this.a.m(t, t2);
        }
    }
    
    public h<T> p() {
        return this.a;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(".nullSafe()");
        return sb.toString();
    }
}
