// 
// Decompiled by Procyon v0.5.36
// 

package org.bson;

import java.util.Collection;
import org.bson.types.ObjectId;
import java.util.Date;
import java.util.Set;
import org.bson.codecs.configuration.d;
import org.bson.codecs.x0;
import java.io.Writer;
import org.bson.json.e0;
import java.io.StringWriter;
import org.bson.codecs.w0;
import org.bson.json.f0;
import org.bson.codecs.s0;
import org.bson.json.w;
import org.bson.codecs.r0;
import org.bson.codecs.t0;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedHashMap;
import g7.a;
import java.io.Serializable;
import java.util.Map;

public class d1 implements Map<String, Object>, Serializable, a
{
    private static final long H = 6297731997167536582L;
    private final LinkedHashMap<String, Object> G;
    
    public d1() {
        this.G = new LinkedHashMap<String, Object>();
    }
    
    public d1(final String key, final Object value) {
        (this.G = new LinkedHashMap<String, Object>()).put(key, value);
    }
    
    public d1(final Map<String, Object> m) {
        this.G = new LinkedHashMap<String, Object>(m);
    }
    
    private <T> List<T> c(final Object o, final Class<T> clazz, final List<T> list) {
        final List<Object> list2 = this.d(o, (Class<List<Object>>)List.class);
        if (list2 == null) {
            return list;
        }
        final Iterator<T> iterator = list2.iterator();
        while (iterator.hasNext()) {
            if (clazz.isAssignableFrom(iterator.next().getClass())) {
                continue;
            }
            throw new ClassCastException(String.format("List element cannot be cast to %s", clazz.getName()));
        }
        return (List<T>)list2;
    }
    
    private <T> T n(final List<?> list, final Class<T> clazz, final T t) {
        final Iterator<?> iterator = list.iterator();
        d1 value = this;
        while (iterator.hasNext()) {
            final Object next = iterator.next();
            final Object o = value = (d1)value.get(next);
            if (!(o instanceof d1)) {
                if (o == null) {
                    return t;
                }
                if (iterator.hasNext()) {
                    throw new ClassCastException(String.format("At key %s, the value is not a Document (%s)", next, ((d1)o).getClass().getName()));
                }
                value = (d1)o;
            }
        }
        T cast = (T)value;
        if (clazz != null) {
            cast = clazz.cast(value);
        }
        return cast;
    }
    
    public static d1 v(final String s) {
        return w(s, new t0());
    }
    
    public static d1 w(final String s, final r0<d1> r0) {
        e7.a.e("codec", r0);
        return r0.c(new w(s), s0.a().a());
    }
    
    public String B(final f0 f0) {
        return this.C(f0, new t0());
    }
    
    public String C(final f0 f0, final w0<d1> w0) {
        final e0 e0 = new e0(new StringWriter(), f0);
        w0.a(e0, this, x0.a().b());
        return e0.x2().toString();
    }
    
    public d1 a(final String key, final Object value) {
        this.G.put(key, value);
        return this;
    }
    
    @Override
    public <C> y b(final Class<C> clazz, final d d) {
        return new a0<Object>(this, d.a(d1.class));
    }
    
    @Override
    public void clear() {
        this.G.clear();
    }
    
    @Override
    public boolean containsKey(final Object key) {
        return this.G.containsKey(key);
    }
    
    @Override
    public boolean containsValue(final Object value) {
        return this.G.containsValue(value);
    }
    
    public <T> T d(final Object key, final Class<T> clazz) {
        e7.a.e("clazz", clazz);
        return clazz.cast(this.G.get(key));
    }
    
    public <T> T e(Object value, final T t) {
        e7.a.e("defaultValue", t);
        value = this.G.get(value);
        if (value == null) {
            value = t;
        }
        return (T)value;
    }
    
    @Override
    public Set<Entry<String, Object>> entrySet() {
        return this.G.entrySet();
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && this.G.equals(((d1)o).G));
    }
    
    public Boolean f(final Object o) {
        return (Boolean)this.get(o);
    }
    
    public boolean g(final Object o, final boolean b) {
        return this.e(o, b);
    }
    
    @Override
    public Object get(final Object key) {
        return this.G.get(key);
    }
    
    public Date h(final Object o) {
        return (Date)this.get(o);
    }
    
    @Override
    public int hashCode() {
        return this.G.hashCode();
    }
    
    public Double i(final Object o) {
        return (Double)this.get(o);
    }
    
    @Override
    public boolean isEmpty() {
        return this.G.isEmpty();
    }
    
    public <T> T j(final List<?> list, final Class<T> clazz) {
        e7.a.e("keys", list);
        e7.a.b("keys", list.isEmpty() ^ true);
        e7.a.e("clazz", clazz);
        return this.n(list, clazz, (T)null);
    }
    
    public <T> T k(final List<?> list, final T t) {
        e7.a.e("keys", list);
        e7.a.b("keys", list.isEmpty() ^ true);
        e7.a.e("defaultValue", t);
        return this.n(list, null, t);
    }
    
    @Override
    public Set<String> keySet() {
        return this.G.keySet();
    }
    
    public int o(final Object o, final int i) {
        return this.e(o, i);
    }
    
    public Integer p(final Object o) {
        return (Integer)this.get(o);
    }
    
    @Override
    public void putAll(final Map<? extends String, ?> m) {
        this.G.putAll((Map<?, ?>)m);
    }
    
    public <T> List<T> q(final Object o, final Class<T> clazz) {
        e7.a.e("clazz", clazz);
        return this.c(o, clazz, null);
    }
    
    public <T> List<T> r(final Object o, final Class<T> clazz, final List<T> list) {
        e7.a.e("defaultValue", list);
        e7.a.e("clazz", clazz);
        return (List<T>)this.c(o, (Class<Object>)clazz, (List<Object>)list);
    }
    
    @Override
    public Object remove(final Object key) {
        return this.G.remove(key);
    }
    
    public Long s(final Object o) {
        return (Long)this.get(o);
    }
    
    @Override
    public int size() {
        return this.G.size();
    }
    
    public ObjectId t(final Object o) {
        return (ObjectId)this.get(o);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Document{");
        sb.append(this.G);
        sb.append('}');
        return sb.toString();
    }
    
    public String u(final Object o) {
        return (String)this.get(o);
    }
    
    @Override
    public Collection<Object> values() {
        return this.G.values();
    }
    
    public Object x(final String key, final Object value) {
        return this.G.put(key, value);
    }
    
    public String y() {
        return this.B(new f0());
    }
    
    public String z(final w0<d1> w0) {
        return this.C(new f0(), w0);
    }
}
