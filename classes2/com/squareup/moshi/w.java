// 
// Decompiled by Procyon v0.5.36
// 

package com.squareup.moshi;

import java.util.Iterator;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.Set;
import java.lang.reflect.Type;
import java.util.Map;

final class w<K, V> extends h<Map<K, V>>
{
    public static final e c;
    private final h<K> a;
    private final h<V> b;
    
    static {
        c = new e() {
            @c6.h
            @Override
            public h<?> a(final Type type, final Set<? extends Annotation> set, final x x) {
                if (!set.isEmpty()) {
                    return null;
                }
                final Class<?> j = a0.j(type);
                if (j != Map.class) {
                    return null;
                }
                final Type[] l = a0.l(type, j);
                return new w<Object, Object>(x, l[0], l[1]).j();
            }
        };
    }
    
    w(final x x, final Type type, final Type type2) {
        this.a = x.d(type);
        this.b = x.d(type2);
    }
    
    public Map<K, V> p(final m m) throws IOException {
        final v<K, V> v = new v<K, V>();
        m.b();
        while (m.f()) {
            m.y();
            final K b = this.a.b(m);
            final V b2 = this.b.b(m);
            final V put = v.put(b, b2);
            if (put == null) {
                continue;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Map key '");
            sb.append(b);
            sb.append("' has multiple values at path ");
            sb.append(m.getPath());
            sb.append(": ");
            sb.append(put);
            sb.append(" and ");
            sb.append(b2);
            throw new j(sb.toString());
        }
        m.d();
        return v;
    }
    
    public void q(final t t, final Map<K, V> map) throws IOException {
        t.c();
        for (final Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getKey() == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Map key is null at ");
                sb.append(t.getPath());
                throw new j(sb.toString());
            }
            t.t();
            this.a.m(t, entry.getKey());
            this.b.m(t, entry.getValue());
        }
        t.g();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("JsonAdapter(");
        sb.append(this.a);
        sb.append("=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
