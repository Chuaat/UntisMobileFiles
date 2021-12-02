// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import io.realm.internal.OsSchemaInfo;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Set;
import java.util.Collections;
import io.realm.internal.r;
import java.util.Iterator;
import io.realm.internal.OsList;
import io.realm.internal.Table;
import io.realm.internal.OsObject;
import java.util.Map;
import android.annotation.TargetApi;
import java.io.IOException;
import android.util.JsonToken;
import android.util.JsonReader;
import org.json.JSONException;
import org.json.JSONArray;
import java.util.List;
import java.util.ArrayList;
import org.json.JSONObject;
import com.untis.mobile.persistence.realm.b;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.p;
import u4.c;

public class p3 extends c implements p, q3
{
    private static final String O = "";
    private static final OsObjectSchemaInfo P;
    private b L;
    private c0<c> M;
    private l0<com.untis.mobile.persistence.realm.b> N;
    
    static {
        P = A8();
    }
    
    p3() {
        this.M.p();
    }
    
    private static OsObjectSchemaInfo A8() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmParentDayStudent", false, 2, 0);
        b.c("", "studentId", RealmFieldType.INTEGER, false, false, true);
        b.b("", "subjectIds", RealmFieldType.LIST, "RealmLong");
        return b.e();
    }
    
    public static c B8(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final ArrayList<String> list = new ArrayList<String>(1);
        if (jsonObject.has("subjectIds")) {
            list.add("subjectIds");
        }
        final c c = f0.q1(c.class, true, list);
        if (jsonObject.has("studentId")) {
            if (jsonObject.isNull("studentId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'studentId' to null.");
            }
            c.P(jsonObject.getLong("studentId"));
        }
        if (jsonObject.has("subjectIds")) {
            if (jsonObject.isNull("subjectIds")) {
                c.v6(null);
            }
            else {
                c.w2().clear();
                final JSONArray jsonArray = jsonObject.getJSONArray("subjectIds");
                for (int i = 0; i < jsonArray.length(); ++i) {
                    c.w2().add(z0.z8(f0, jsonArray.getJSONObject(i), b));
                }
            }
        }
        return c;
    }
    
    @TargetApi(11)
    public static c C8(final f0 f0, final JsonReader jsonReader) throws IOException {
        final c c = new c();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            if (nextName.equals("studentId")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'studentId' to null.");
                }
                c.P(jsonReader.nextLong());
            }
            else if (nextName.equals("subjectIds")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    c.v6(null);
                }
                else {
                    c.v6(new l0<com.untis.mobile.persistence.realm.b>());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        c.w2().add(z0.A8(f0, jsonReader));
                    }
                    jsonReader.endArray();
                }
            }
            else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return f0.y0(c, new q[0]);
    }
    
    public static OsObjectSchemaInfo D8() {
        return p3.P;
    }
    
    public static String E8() {
        return "RealmParentDayStudent";
    }
    
    public static long F8(final f0 f0, final c c, final Map<n0, Long> map) {
        if (c instanceof p && !p0.h8(c)) {
            final p p3 = (p)c;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(c.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(c.class);
        final long row = OsObject.createRow(x2);
        map.put(c, row);
        Table.nativeSetLong(nativePtr, b.e, row, c.J(), false);
        final l0<com.untis.mobile.persistence.realm.b> w2 = c.w2();
        if (w2 != null) {
            final OsList list = new OsList(x2.R(row), b.f);
            for (final com.untis.mobile.persistence.realm.b b2 : w2) {
                Long value;
                if ((value = map.get(b2)) == null) {
                    value = z0.D8(f0, b2, map);
                }
                list.l(value);
            }
        }
        return row;
    }
    
    public static void G8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(c.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(c.class);
        while (iterator.hasNext()) {
            final c c = (c)iterator.next();
            if (map.containsKey(c)) {
                continue;
            }
            if (c instanceof p && !p0.h8(c)) {
                final p p3 = (p)c;
                if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                    map.put(c, p3.S6().g().l0());
                    continue;
                }
            }
            final long row = OsObject.createRow(x2);
            map.put(c, row);
            Table.nativeSetLong(nativePtr, b.e, row, c.J(), false);
            final l0<com.untis.mobile.persistence.realm.b> w2 = c.w2();
            if (w2 == null) {
                continue;
            }
            final OsList list = new OsList(x2.R(row), b.f);
            for (final com.untis.mobile.persistence.realm.b b2 : w2) {
                Long value;
                if ((value = map.get(b2)) == null) {
                    value = z0.D8(f0, b2, map);
                }
                list.l(value);
            }
        }
    }
    
    public static long H8(final f0 f0, final c c, final Map<n0, Long> map) {
        if (c instanceof p && !p0.h8(c)) {
            final p p3 = (p)c;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(c.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(c.class);
        final long row = OsObject.createRow(x2);
        map.put(c, row);
        Table.nativeSetLong(nativePtr, b.e, row, c.J(), false);
        final OsList list = new OsList(x2.R(row), b.f);
        final l0<com.untis.mobile.persistence.realm.b> w2 = c.w2();
        if (w2 != null && w2.size() == list.b0()) {
            for (int size = w2.size(), i = 0; i < size; ++i) {
                final com.untis.mobile.persistence.realm.b b2 = w2.get(i);
                Long value;
                if ((value = map.get(b2)) == null) {
                    value = z0.F8(f0, b2, map);
                }
                list.Z(i, value);
            }
        }
        else {
            list.M();
            if (w2 != null) {
                for (final com.untis.mobile.persistence.realm.b b3 : w2) {
                    Long value2;
                    if ((value2 = map.get(b3)) == null) {
                        value2 = z0.F8(f0, b3, map);
                    }
                    list.l(value2);
                }
            }
        }
        return row;
    }
    
    public static void I8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(c.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(c.class);
        while (iterator.hasNext()) {
            final c c = (c)iterator.next();
            if (map.containsKey(c)) {
                continue;
            }
            if (c instanceof p && !p0.h8(c)) {
                final p p3 = (p)c;
                if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                    map.put(c, p3.S6().g().l0());
                    continue;
                }
            }
            final long row = OsObject.createRow(x2);
            map.put(c, row);
            Table.nativeSetLong(nativePtr, b.e, row, c.J(), false);
            final OsList list = new OsList(x2.R(row), b.f);
            final l0<com.untis.mobile.persistence.realm.b> w2 = c.w2();
            if (w2 != null && w2.size() == list.b0()) {
                for (int size = w2.size(), i = 0; i < size; ++i) {
                    final com.untis.mobile.persistence.realm.b b2 = w2.get(i);
                    Long value;
                    if ((value = map.get(b2)) == null) {
                        value = z0.F8(f0, b2, map);
                    }
                    list.Z(i, value);
                }
            }
            else {
                list.M();
                if (w2 == null) {
                    continue;
                }
                for (final com.untis.mobile.persistence.realm.b b3 : w2) {
                    Long value2;
                    if ((value2 = map.get(b3)) == null) {
                        value2 = z0.F8(f0, b3, map);
                    }
                    list.l(value2);
                }
            }
        }
    }
    
    static p3 J8(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(c.class), false, Collections.emptyList());
        final p3 p2 = new p3();
        h.a();
        return p2;
    }
    
    public static c w8(final f0 f0, final b b, final c c, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        final p3 p6 = map.get(c);
        if (p6 != null) {
            return p6;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(c.class), set);
        osObjectBuilder.L(b.e, c.J());
        final p3 j8 = J8(f0, osObjectBuilder.f0());
        map.put(c, j8);
        final l0<com.untis.mobile.persistence.realm.b> w2 = c.w2();
        if (w2 != null) {
            final l0<com.untis.mobile.persistence.realm.b> w3 = j8.w2();
            w3.clear();
            for (int i = 0; i < w2.size(); ++i) {
                final com.untis.mobile.persistence.realm.b b3 = w2.get(i);
                com.untis.mobile.persistence.realm.b v8 = (com.untis.mobile.persistence.realm.b)map.get(b3);
                if (v8 == null) {
                    v8 = z0.v8(f0, (z0.b)f0.H().j(com.untis.mobile.persistence.realm.b.class), b3, b2, map, set);
                }
                w3.add(v8);
            }
        }
        return j8;
    }
    
    public static c x8(final f0 f0, final b b, final c c, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        if (c instanceof p && !p0.h8(c)) {
            final p p6 = (p)c;
            if (p6.S6().f() != null) {
                final io.realm.a f2 = p6.S6().f();
                if (f2.H != f0.H) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
                if (f2.getPath().equals(f0.getPath())) {
                    return c;
                }
            }
        }
        final io.realm.a.h h = io.realm.a.W.get();
        final p p7 = map.get(c);
        if (p7 != null) {
            return (c)p7;
        }
        return w8(f0, b, c, b2, map, set);
    }
    
    public static b y8(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static c z8(final c c, final int a, final int n, final Map<n0, p.a<n0>> map) {
        if (a <= n && c != null) {
            final p.a a2 = map.get(c);
            c c2;
            if (a2 == null) {
                c2 = new c();
                map.put(c, (p.a<n0>)new p.a(a, c2));
            }
            else {
                if (a >= a2.a) {
                    return (c)a2.b;
                }
                c2 = (c)a2.b;
                a2.a = a;
            }
            c2.P(c.J());
            if (a == n) {
                c2.v6(null);
            }
            else {
                final l0<com.untis.mobile.persistence.realm.b> w2 = c.w2();
                final l0<com.untis.mobile.persistence.realm.b> l0 = new l0<com.untis.mobile.persistence.realm.b>();
                c2.v6(l0);
                for (int size = w2.size(), i = 0; i < size; ++i) {
                    l0.add(z0.x8(w2.get(i), a + 1, n, map));
                }
            }
            return c2;
        }
        return null;
    }
    
    @Override
    public long J() {
        this.M.f().h();
        return this.M.g().m(this.L.e);
    }
    
    @Override
    public void P(final long n) {
        if (!this.M.i()) {
            this.M.f().h();
            this.M.g().s(this.L.e, n);
            return;
        }
        if (!this.M.d()) {
            return;
        }
        final r g = this.M.g();
        g.g().q0(this.L.e, g.l0(), n, true);
    }
    
    @Override
    public c0<?> S6() {
        return this.M;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final p3 p = (p3)o;
        final io.realm.a f = this.M.f();
        final io.realm.a f2 = p.M.f();
        final String path = f.getPath();
        final String path2 = f2.getPath();
        Label_0083: {
            if (path != null) {
                if (path.equals(path2)) {
                    break Label_0083;
                }
            }
            else if (path2 == null) {
                break Label_0083;
            }
            return false;
        }
        if (f.N() != f2.N()) {
            return false;
        }
        if (!f.K.getVersionID().equals(f2.K.getVersionID())) {
            return false;
        }
        final String m = this.M.g().g().M();
        final String i = p.M.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.M.g().l0() == p.M.g().l0();
            }
        }
        else if (i == null) {
            return this.M.g().l0() == p.M.g().l0();
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final String path = this.M.f().getPath();
        final String m = this.M.g().g().M();
        final long l0 = this.M.g().l0();
        int hashCode = 0;
        int hashCode2;
        if (path != null) {
            hashCode2 = path.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        if (m != null) {
            hashCode = m.hashCode();
        }
        return ((527 + hashCode2) * 31 + hashCode) * 31 + (int)(l0 >>> 32 ^ l0);
    }
    
    @Override
    public String toString() {
        if (!p0.k8(this)) {
            return "Invalid object";
        }
        final StringBuilder sb = new StringBuilder("RealmParentDayStudent = proxy[");
        sb.append("{studentId:");
        sb.append(this.J());
        sb.append("}");
        sb.append(",");
        sb.append("{subjectIds:");
        sb.append("RealmList<RealmLong>[");
        sb.append(this.w2().size());
        sb.append("]");
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
    
    @Override
    public void v6(final l0<com.untis.mobile.persistence.realm.b> l0) {
        final boolean i = this.M.i();
        final int n = 0;
        int j = 0;
        l0<com.untis.mobile.persistence.realm.b> l2 = l0;
        if (i) {
            if (!this.M.d()) {
                return;
            }
            if (this.M.e().contains("subjectIds")) {
                return;
            }
            if ((l2 = l0) != null) {
                l2 = l0;
                if (!l0.G0()) {
                    final f0 f0 = (f0)this.M.f();
                    l2 = new l0<com.untis.mobile.persistence.realm.b>();
                    for (final com.untis.mobile.persistence.realm.b b : l0) {
                        com.untis.mobile.persistence.realm.b b2;
                        if ((b2 = b) != null) {
                            if (p0.j8(b)) {
                                b2 = b;
                            }
                            else {
                                b2 = f0.y0(b, new q[0]);
                            }
                        }
                        l2.add(b2);
                    }
                }
            }
        }
        this.M.f().h();
        final OsList p = this.M.g().p(this.L.f);
        if (l2 != null && l2.size() == p.b0()) {
            while (j < l2.size()) {
                final com.untis.mobile.persistence.realm.b b3 = l2.get(j);
                this.M.c(b3);
                p.Z(j, ((p)b3).S6().g().l0());
                ++j;
            }
        }
        else {
            p.M();
            if (l2 == null) {
                return;
            }
            for (int size = l2.size(), k = n; k < size; ++k) {
                final com.untis.mobile.persistence.realm.b b4 = l2.get(k);
                this.M.c(b4);
                p.l(((p)b4).S6().g().l0());
            }
        }
    }
    
    @Override
    public l0<com.untis.mobile.persistence.realm.b> w2() {
        this.M.f().h();
        final l0<com.untis.mobile.persistence.realm.b> n = this.N;
        if (n != null) {
            return n;
        }
        return this.N = new l0<com.untis.mobile.persistence.realm.b>(com.untis.mobile.persistence.realm.b.class, this.M.g().p(this.L.f), this.M.f());
    }
    
    @Override
    public void y4() {
        if (this.M != null) {
            return;
        }
        final io.realm.a.h h = io.realm.a.W.get();
        this.L = (b)h.c();
        (this.M = new c0<c>(this)).r(h.e());
        this.M.s(h.f());
        this.M.o(h.b());
        this.M.q(h.d());
    }
    
    public static final class a
    {
        public static final String a = "RealmParentDayStudent";
    }
    
    static final class b extends io.realm.internal.c
    {
        long e;
        long f;
        
        b(final OsSchemaInfo osSchemaInfo) {
            super(2);
            final OsObjectSchemaInfo b = osSchemaInfo.b("RealmParentDayStudent");
            this.e = this.b("studentId", "studentId", b);
            this.f = this.b("subjectIds", "subjectIds", b);
        }
        
        b(final io.realm.internal.c c, final boolean b) {
            super(c, b);
            this.d(c, this);
        }
        
        @Override
        protected final io.realm.internal.c c(final boolean b) {
            return new b(this, b);
        }
        
        @Override
        protected final void d(final io.realm.internal.c c, final io.realm.internal.c c2) {
            final b b = (b)c;
            final b b2 = (b)c2;
            b2.e = b.e;
            b2.f = b.f;
        }
    }
}
