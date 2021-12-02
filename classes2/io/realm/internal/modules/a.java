// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.internal.modules;

import java.util.List;
import io.realm.internal.r;
import java.util.Collection;
import io.realm.internal.OsObjectSchemaInfo;
import java.io.IOException;
import android.util.JsonReader;
import org.json.JSONException;
import org.json.JSONObject;
import io.realm.internal.c;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Util;
import java.util.Set;
import io.realm.internal.p;
import io.realm.f0;
import io.realm.exceptions.RealmException;
import java.util.Iterator;
import java.util.Collections;
import java.util.HashMap;
import io.realm.n0;
import java.util.Map;
import io.realm.internal.q;

public class a extends q
{
    private final Map<Class<? extends n0>, q> a;
    private final Map<String, Class<? extends n0>> b;
    
    public a(final q... array) {
        this.b = new HashMap<String, Class<? extends n0>>();
        final HashMap<Class<? extends n0>, q> m = new HashMap<Class<? extends n0>, q>();
        if (array != null) {
            for (final q value : array) {
                for (final Class<? extends n0> clazz : value.j()) {
                    final String l = value.l(clazz);
                    final Class<? extends n0> key = this.b.get(l);
                    if (key != null && !key.equals(clazz)) {
                        throw new IllegalStateException(String.format("It is not allowed for two different model classes to share the same internal name in Realm. The classes %s and %s are being included from the modules '%s' and '%s' and they share the same internal name '%s'.", key, clazz, m.get(key), value, l));
                    }
                    m.put(clazz, value);
                    this.b.put(l, clazz);
                }
            }
        }
        this.a = (Map<Class<? extends n0>, q>)Collections.unmodifiableMap((Map<?, ?>)m);
    }
    
    private q v(final Class<? extends n0> clazz) {
        final q q = this.a.get(clazz);
        if (q != null) {
            return q;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(clazz.getSimpleName());
        sb.append(" is not part of the schema for this Realm");
        throw new RealmException(sb.toString());
    }
    
    @Override
    public <E extends n0> E b(final f0 f0, final E e, final boolean b, final Map<n0, p> map, final Set<io.realm.q> set) {
        return this.v(Util.g(e.getClass())).b(f0, e, b, map, set);
    }
    
    @Override
    public c c(final Class<? extends n0> clazz, final OsSchemaInfo osSchemaInfo) {
        return this.v(clazz).c(clazz, osSchemaInfo);
    }
    
    @Override
    public <E extends n0> E d(final E e, final int n, final Map<n0, p.a<n0>> map) {
        return this.v(Util.g(e.getClass())).d(e, n, map);
    }
    
    @Override
    public <E extends n0> E e(final Class<E> clazz, final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        return this.v(clazz).e(clazz, f0, jsonObject, b);
    }
    
    @Override
    public <E extends n0> E f(final Class<E> clazz, final f0 f0, final JsonReader jsonReader) throws IOException {
        return this.v(clazz).f(clazz, f0, jsonReader);
    }
    
    @Override
    public Map<Class<? extends n0>, OsObjectSchemaInfo> g() {
        final HashMap<Object, Object> hashMap = (HashMap<Object, Object>)new HashMap<Class<? extends n0>, OsObjectSchemaInfo>();
        final Iterator<q> iterator = this.a.values().iterator();
        while (iterator.hasNext()) {
            hashMap.putAll(iterator.next().g());
        }
        return (Map<Class<? extends n0>, OsObjectSchemaInfo>)hashMap;
    }
    
    @Override
    public Set<Class<? extends n0>> j() {
        return this.a.keySet();
    }
    
    @Override
    protected String m(final Class<? extends n0> clazz) {
        return this.v(clazz).l(clazz);
    }
    
    @Override
    public void n(final f0 f0, final n0 n0, final Map<n0, Long> map) {
        this.v(Util.g(n0.getClass())).n(f0, n0, map);
    }
    
    @Override
    public void o(final f0 f0, final Collection<? extends n0> collection) {
        this.v(Util.g(Util.g(((n0)collection.iterator().next()).getClass()))).o(f0, collection);
    }
    
    @Override
    public void p(final f0 f0, final n0 n0, final Map<n0, Long> map) {
        this.v(Util.g(n0.getClass())).p(f0, n0, map);
    }
    
    @Override
    public void q(final f0 f0, final Collection<? extends n0> collection) {
        this.v(Util.g(Util.g(((n0)collection.iterator().next()).getClass()))).q(f0, collection);
    }
    
    @Override
    public <E extends n0> boolean r(final Class<E> clazz) {
        return this.v(Util.g(clazz)).r(clazz);
    }
    
    @Override
    public <E extends n0> E s(final Class<E> clazz, final Object o, final r r, final c c, final boolean b, final List<String> list) {
        return this.v(clazz).s(clazz, o, r, c, b, list);
    }
    
    @Override
    public boolean t() {
        final Iterator<Map.Entry<Class<? extends n0>, q>> iterator = this.a.entrySet().iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().getValue().t()) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public <E extends n0> void u(final f0 f0, final E e, final E e2, final Map<n0, p> map, final Set<io.realm.q> set) {
        this.v(Util.g(e2.getClass())).u(f0, e, e2, map, set);
    }
}
