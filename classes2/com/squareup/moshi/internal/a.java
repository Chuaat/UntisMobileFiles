// 
// Decompiled by Procyon v0.5.36
// 

package com.squareup.moshi.internal;

import com.squareup.moshi.t;
import java.io.IOException;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.h;

public final class a<T> extends h<T>
{
    private final h<T> a;
    
    public a(final h<T> a) {
        this.a = a;
    }
    
    @c6.h
    @Override
    public T b(final m m) throws IOException {
        if (m.w() != m.c.O) {
            return this.a.b(m);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unexpected null at ");
        sb.append(m.getPath());
        throw new j(sb.toString());
    }
    
    @Override
    public void m(final t t, @c6.h final T t2) throws IOException {
        if (t2 != null) {
            this.a.m(t, t2);
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unexpected null at ");
        sb.append(t.getPath());
        throw new j(sb.toString());
    }
    
    public h<T> p() {
        return this.a;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(".nonNull()");
        return sb.toString();
    }
}
