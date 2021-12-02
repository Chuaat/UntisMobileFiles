// 
// Decompiled by Procyon v0.5.36
// 

package com.squareup.moshi;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.lang.annotation.Annotation;
import java.util.Set;
import java.lang.reflect.Type;

final class b extends h<Object>
{
    public static final e c;
    private final Class<?> a;
    private final h<Object> b;
    
    static {
        c = new e() {
            @c6.h
            @Override
            public h<?> a(Type a, final Set<? extends Annotation> set, final x x) {
                a = a0.a(a);
                if (a == null) {
                    return null;
                }
                if (!set.isEmpty()) {
                    return null;
                }
                return new b(a0.j(a), x.d(a)).j();
            }
        };
    }
    
    b(final Class<?> a, final h<Object> b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public Object b(final m m) throws IOException {
        final ArrayList<Object> list = new ArrayList<Object>();
        m.a();
        while (m.f()) {
            list.add(this.b.b(m));
        }
        m.c();
        final Object instance = Array.newInstance(this.a, list.size());
        for (int i = 0; i < list.size(); ++i) {
            Array.set(instance, i, list.get(i));
        }
        return instance;
    }
    
    @Override
    public void m(final t t, final Object o) throws IOException {
        t.a();
        for (int length = Array.getLength(o), i = 0; i < length; ++i) {
            this.b.m(t, Array.get(o, i));
        }
        t.e();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append(".array()");
        return sb.toString();
    }
}
