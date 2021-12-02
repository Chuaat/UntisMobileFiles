// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.internal.modules;

import java.util.List;
import io.realm.internal.r;
import java.util.HashMap;
import io.realm.internal.OsObjectSchemaInfo;
import java.io.IOException;
import android.util.JsonReader;
import org.json.JSONException;
import org.json.JSONObject;
import io.realm.internal.c;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Util;
import io.realm.internal.p;
import java.util.Map;
import io.realm.f0;
import java.util.Iterator;
import java.util.Collections;
import java.util.HashSet;
import java.util.Collection;
import io.realm.n0;
import java.util.Set;
import io.realm.internal.q;

public class b extends q
{
    private final q a;
    private final Set<Class<? extends n0>> b;
    
    public b(final q a, final Collection<Class<? extends n0>> collection) {
        this.a = a;
        final HashSet<Class<? extends n0>> s = new HashSet<Class<? extends n0>>();
        if (a != null) {
            final Set<Class<? extends n0>> j = a.j();
            for (final Class<? extends n0> clazz : collection) {
                if (j.contains(clazz)) {
                    s.add(clazz);
                }
            }
        }
        this.b = (Set<Class<? extends n0>>)Collections.unmodifiableSet((Set<?>)s);
    }
    
    private void v(final Class<? extends n0> clazz) {
        if (this.b.contains(clazz)) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(clazz.getSimpleName());
        sb.append(" is not part of the schema for this Realm");
        throw new IllegalArgumentException(sb.toString());
    }
    
    @Override
    public <E extends n0> E b(final f0 f0, final E e, final boolean b, final Map<n0, p> map, final Set<io.realm.q> set) {
        this.v(Util.g(e.getClass()));
        return this.a.b(f0, e, b, map, set);
    }
    
    @Override
    public c c(final Class<? extends n0> clazz, final OsSchemaInfo osSchemaInfo) {
        this.v(clazz);
        return this.a.c(clazz, osSchemaInfo);
    }
    
    @Override
    public <E extends n0> E d(final E e, final int n, final Map<n0, p.a<n0>> map) {
        this.v(Util.g(e.getClass()));
        return this.a.d(e, n, map);
    }
    
    @Override
    public <E extends n0> E e(final Class<E> clazz, final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        this.v(clazz);
        return this.a.e(clazz, f0, jsonObject, b);
    }
    
    @Override
    public <E extends n0> E f(final Class<E> clazz, final f0 f0, final JsonReader jsonReader) throws IOException {
        this.v(clazz);
        return this.a.f(clazz, f0, jsonReader);
    }
    
    @Override
    public Map<Class<? extends n0>, OsObjectSchemaInfo> g() {
        final HashMap<Class<? extends n0>, OsObjectSchemaInfo> hashMap = new HashMap<Class<? extends n0>, OsObjectSchemaInfo>();
        for (final Map.Entry<Class<? extends n0>, OsObjectSchemaInfo> entry : this.a.g().entrySet()) {
            if (this.b.contains(entry.getKey())) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return hashMap;
    }
    
    @Override
    public Set<Class<? extends n0>> j() {
        return this.b;
    }
    
    @Override
    protected String m(final Class<? extends n0> clazz) {
        this.v(clazz);
        return this.a.l(clazz);
    }
    
    @Override
    public void n(final f0 f0, final n0 n0, final Map<n0, Long> map) {
        this.v(Util.g(n0.getClass()));
        this.a.n(f0, n0, map);
    }
    
    @Override
    public void o(final f0 f0, final Collection<? extends n0> collection) {
        this.v(Util.g(((n0)collection.iterator().next()).getClass()));
        this.a.o(f0, collection);
    }
    
    @Override
    public void p(final f0 f0, final n0 n0, final Map<n0, Long> map) {
        this.v(Util.g(n0.getClass()));
        this.a.p(f0, n0, map);
    }
    
    @Override
    public void q(final f0 f0, final Collection<? extends n0> collection) {
        this.v(Util.g(((n0)collection.iterator().next()).getClass()));
        this.a.q(f0, collection);
    }
    
    @Override
    public <E extends n0> boolean r(final Class<E> clazz) {
        this.v(Util.g(clazz));
        return this.a.r(clazz);
    }
    
    @Override
    public <E extends n0> E s(final Class<E> clazz, final Object o, final r r, final c c, final boolean b, final List<String> list) {
        this.v(clazz);
        return this.a.s(clazz, o, r, c, b, list);
    }
    
    @Override
    public boolean t() {
        final q a = this.a;
        return a == null || a.t();
    }
    
    @Override
    public <E extends n0> void u(final f0 f0, final E e, final E e2, final Map<n0, p> map, final Set<io.realm.q> set) {
        this.v(Util.g(e2.getClass()));
        this.a.u(f0, e, e2, map, set);
    }
}
