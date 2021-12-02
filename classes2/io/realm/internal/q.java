// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.internal;

import java.util.List;
import java.util.Collection;
import java.io.IOException;
import android.util.JsonReader;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.Set;
import java.util.Map;
import io.realm.f0;
import io.realm.exceptions.RealmException;
import java.util.Objects;
import io.realm.n0;

public abstract class q
{
    protected static void a(final Class<? extends n0> obj) {
        Objects.requireNonNull(obj, "A class extending RealmObject must be provided");
    }
    
    protected static RealmException h(final Class<? extends n0> clazz) {
        return new RealmException(String.format("'%s' is not part of the schema for this Realm.", clazz.toString()));
    }
    
    protected static RealmException i(final String s) {
        return new RealmException(String.format("'%s' is not part of the schema for this Realm.", s));
    }
    
    protected static IllegalStateException k(final String str) {
        final StringBuilder sb = new StringBuilder();
        sb.append("This class is not marked embedded: ");
        sb.append(str);
        return new IllegalStateException(sb.toString());
    }
    
    public abstract <E extends n0> E b(final f0 p0, final E p1, final boolean p2, final Map<n0, p> p3, final Set<io.realm.q> p4);
    
    public abstract c c(final Class<? extends n0> p0, final OsSchemaInfo p1);
    
    public abstract <E extends n0> E d(final E p0, final int p1, final Map<n0, p.a<n0>> p2);
    
    public abstract <E extends n0> E e(final Class<E> p0, final f0 p1, final JSONObject p2, final boolean p3) throws JSONException;
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof q && this.j().equals(((q)o).j());
    }
    
    public abstract <E extends n0> E f(final Class<E> p0, final f0 p1, final JsonReader p2) throws IOException;
    
    public abstract Map<Class<? extends n0>, OsObjectSchemaInfo> g();
    
    @Override
    public int hashCode() {
        return this.j().hashCode();
    }
    
    public abstract Set<Class<? extends n0>> j();
    
    public final String l(final Class<? extends n0> clazz) {
        return this.m(Util.g(clazz));
    }
    
    protected abstract String m(final Class<? extends n0> p0);
    
    public abstract void n(final f0 p0, final n0 p1, final Map<n0, Long> p2);
    
    public abstract void o(final f0 p0, final Collection<? extends n0> p1);
    
    public abstract void p(final f0 p0, final n0 p1, final Map<n0, Long> p2);
    
    public abstract void q(final f0 p0, final Collection<? extends n0> p1);
    
    public abstract <E extends n0> boolean r(final Class<E> p0);
    
    public abstract <E extends n0> E s(final Class<E> p0, final Object p1, final r p2, final c p3, final boolean p4, final List<String> p5);
    
    public boolean t() {
        return false;
    }
    
    public abstract <E extends n0> void u(final f0 p0, final E p1, final E p2, final Map<n0, p> p3, final Set<io.realm.q> p4);
}
