// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import io.realm.exceptions.RealmException;
import java.util.Iterator;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.Table;
import android.annotation.TargetApi;
import java.io.IOException;
import android.util.JsonToken;
import android.util.JsonReader;
import org.json.JSONException;
import org.json.JSONArray;
import java.util.List;
import java.util.ArrayList;
import org.json.JSONObject;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.c;
import java.util.Collections;
import io.realm.internal.r;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Set;
import java.util.Map;
import com.untis.mobile.persistence.realm.b;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.p;
import p4.a;

public class n2 extends p4.a implements p, o2
{
    private static final String e0 = "";
    private static final OsObjectSchemaInfo f0;
    private b Y;
    private c0<p4.a> Z;
    private l0<com.untis.mobile.persistence.realm.b> a0;
    private l0<com.untis.mobile.persistence.realm.b> b0;
    private l0<com.untis.mobile.persistence.realm.b> c0;
    private l0<p4.b> d0;
    
    static {
        f0 = a9();
    }
    
    n2() {
        this.Z.p();
    }
    
    public static p4.a W8(final f0 f0, final b b, final p4.a a, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        final n2 n2 = map.get(a);
        if (n2 != null) {
            return n2;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(p4.a.class), set);
        osObjectBuilder.L(b.e, a.z());
        osObjectBuilder.L(b.f, a.a());
        osObjectBuilder.d0(b.g, a.M3());
        osObjectBuilder.L(b.h, a.d());
        osObjectBuilder.L(b.i, a.c());
        osObjectBuilder.L(b.j, a.G2());
        osObjectBuilder.d0(b.k, a.g());
        osObjectBuilder.d0(b.l, a.f());
        osObjectBuilder.K(b.m, a.l());
        osObjectBuilder.L(b.n, a.o());
        osObjectBuilder.L(b.o, a.a0());
        final n2 j9 = j9(f0, osObjectBuilder.f0());
        map.put(a, j9);
        final l0<com.untis.mobile.persistence.realm.b> g6 = a.G6();
        final int n3 = 0;
        if (g6 != null) {
            final l0<com.untis.mobile.persistence.realm.b> g7 = j9.G6();
            g7.clear();
            for (int i = 0; i < g6.size(); ++i) {
                final com.untis.mobile.persistence.realm.b b3 = g6.get(i);
                com.untis.mobile.persistence.realm.b v8 = (com.untis.mobile.persistence.realm.b)map.get(b3);
                if (v8 == null) {
                    v8 = z0.v8(f0, (z0.b)f0.H().j(com.untis.mobile.persistence.realm.b.class), b3, b2, map, set);
                }
                g7.add(v8);
            }
        }
        final l0<com.untis.mobile.persistence.realm.b> z = a.Z();
        if (z != null) {
            final l0<com.untis.mobile.persistence.realm.b> z2 = j9.Z();
            z2.clear();
            for (int k = 0; k < z.size(); ++k) {
                final com.untis.mobile.persistence.realm.b b4 = z.get(k);
                com.untis.mobile.persistence.realm.b v9 = (com.untis.mobile.persistence.realm.b)map.get(b4);
                if (v9 == null) {
                    v9 = z0.v8(f0, (z0.b)f0.H().j(com.untis.mobile.persistence.realm.b.class), b4, b2, map, set);
                }
                z2.add(v9);
            }
        }
        final l0<com.untis.mobile.persistence.realm.b> h0 = a.h0();
        if (h0 != null) {
            final l0<com.untis.mobile.persistence.realm.b> h2 = j9.h0();
            h2.clear();
            for (int l = 0; l < h0.size(); ++l) {
                final com.untis.mobile.persistence.realm.b b5 = h0.get(l);
                com.untis.mobile.persistence.realm.b v10 = (com.untis.mobile.persistence.realm.b)map.get(b5);
                if (v10 == null) {
                    v10 = z0.v8(f0, (z0.b)f0.H().j(com.untis.mobile.persistence.realm.b.class), b5, b2, map, set);
                }
                h2.add(v10);
            }
        }
        final l0<p4.b> m6 = a.M6();
        if (m6 != null) {
            final l0<p4.b> m7 = j9.M6();
            m7.clear();
            for (int n4 = n3; n4 < m6.size(); ++n4) {
                final p4.b b6 = m6.get(n4);
                p4.b z3 = (p4.b)map.get(b6);
                if (z3 == null) {
                    z3 = p2.z8(f0, (p2.b)f0.H().j(p4.b.class), b6, b2, map, set);
                }
                m7.add(z3);
            }
        }
        return j9;
    }
    
    public static p4.a X8(final f0 f0, final b b, final p4.a a, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        if (a instanceof p && !p0.h8(a)) {
            final p p6 = (p)a;
            if (p6.S6().f() != null) {
                final io.realm.a f2 = p6.S6().f();
                if (f2.H != f0.H) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
                if (f2.getPath().equals(f0.getPath())) {
                    return a;
                }
            }
        }
        final io.realm.a.h h = a.W.get();
        final p p7 = map.get(a);
        if (p7 != null) {
            return (p4.a)p7;
        }
        final p p8 = null;
        Object x2 = null;
        boolean b3 = false;
        Label_0233: {
            if (b2) {
                x2 = f0.x2(p4.a.class);
                final long r = ((Table)x2).r(b.e, a.z());
                if (r == -1L) {
                    b3 = false;
                    x2 = p8;
                    break Label_0233;
                }
                try {
                    h.g(f0, ((Table)x2).R(r), b, false, Collections.emptyList());
                    x2 = new n2();
                    map.put(a, (p)x2);
                }
                finally {
                    h.a();
                }
            }
            b3 = b2;
        }
        p4.a a2;
        if (b3) {
            a2 = k9(f0, b, (p4.a)x2, a, map, set);
        }
        else {
            a2 = W8(f0, b, a, b2, map, set);
        }
        return a2;
    }
    
    public static b Y8(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static p4.a Z8(final p4.a a, final int a2, final int n, final Map<n0, p.a<n0>> map) {
        if (a2 <= n && a != null) {
            final p.a a3 = map.get(a);
            p4.a a4;
            if (a3 == null) {
                a4 = new p4.a();
                map.put(a, (p.a<n0>)new p.a(a2, a4));
            }
            else {
                if (a2 >= a3.a) {
                    return (p4.a)a3.b;
                }
                a4 = (p4.a)a3.b;
                a3.a = a2;
            }
            a4.f0(a.z());
            a4.b(a.a());
            a4.D7(a.M3());
            a4.h(a.d());
            a4.i(a.c());
            a4.z5(a.G2());
            a4.e(a.g());
            a4.j(a.f());
            a4.k(a.l());
            a4.p(a.o());
            a4.u0(a.a0());
            final int n2 = 0;
            if (a2 == n) {
                a4.T4(null);
            }
            else {
                final l0<com.untis.mobile.persistence.realm.b> g6 = a.G6();
                final l0<com.untis.mobile.persistence.realm.b> l0 = new l0<com.untis.mobile.persistence.realm.b>();
                a4.T4(l0);
                for (int size = g6.size(), i = 0; i < size; ++i) {
                    l0.add(z0.x8(g6.get(i), a2 + 1, n, map));
                }
            }
            if (a2 == n) {
                a4.U(null);
            }
            else {
                final l0<com.untis.mobile.persistence.realm.b> z = a.Z();
                final l0<com.untis.mobile.persistence.realm.b> l2 = new l0<com.untis.mobile.persistence.realm.b>();
                a4.U(l2);
                for (int size2 = z.size(), j = 0; j < size2; ++j) {
                    l2.add(z0.x8(z.get(j), a2 + 1, n, map));
                }
            }
            if (a2 == n) {
                a4.t0(null);
            }
            else {
                final l0<com.untis.mobile.persistence.realm.b> h0 = a.h0();
                final l0<com.untis.mobile.persistence.realm.b> l3 = new l0<com.untis.mobile.persistence.realm.b>();
                a4.t0(l3);
                for (int size3 = h0.size(), k = 0; k < size3; ++k) {
                    l3.add(z0.x8(h0.get(k), a2 + 1, n, map));
                }
            }
            if (a2 == n) {
                a4.s6(null);
            }
            else {
                final l0<p4.b> m6 = a.M6();
                final l0<p4.b> l4 = new l0<p4.b>();
                a4.s6(l4);
                for (int size4 = m6.size(), n3 = n2; n3 < size4; ++n3) {
                    l4.add(p2.B8(m6.get(n3), a2 + 1, n, map));
                }
            }
            return a4;
        }
        return null;
    }
    
    private static OsObjectSchemaInfo a9() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmInfoCenterExam", false, 15, 0);
        final RealmFieldType integer = RealmFieldType.INTEGER;
        b.c("", "key", integer, true, false, true);
        b.c("", "id", integer, false, false, true);
        final RealmFieldType string = RealmFieldType.STRING;
        b.c("", "examType", string, false, false, true);
        b.c("", "start", integer, false, false, true);
        b.c("", "end", integer, false, false, true);
        b.c("", "departmentId", integer, false, false, true);
        b.c("", "name", string, false, false, true);
        b.c("", "text", string, false, false, true);
        b.c("", "entityType", integer, false, false, true);
        b.c("", "entityId", integer, false, false, true);
        b.c("", "subjectId", integer, false, false, true);
        final RealmFieldType list = RealmFieldType.LIST;
        b.b("", "classes", list, "RealmLong");
        b.b("", "rooms", list, "RealmLong");
        b.b("", "teachers", list, "RealmLong");
        b.b("", "invigilator", list, "RealmInvigilator");
        return b.e();
    }
    
    public static p4.a b9(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final ArrayList<String> list = new ArrayList<String>(4);
        Object x2 = null;
        Label_0146: {
            if (b) {
                x2 = f0.x2(p4.a.class);
                final long e = ((b)f0.H().j(p4.a.class)).e;
                long r;
                if (!jsonObject.isNull("key")) {
                    r = ((Table)x2).r(e, jsonObject.getLong("key"));
                }
                else {
                    r = -1L;
                }
                if (r != -1L) {
                    final io.realm.a.h h = io.realm.a.W.get();
                    try {
                        h.g(f0, ((Table)x2).R(r), f0.H().j(p4.a.class), false, Collections.emptyList());
                        x2 = new n2();
                        break Label_0146;
                    }
                    finally {
                        h.a();
                    }
                }
            }
            x2 = null;
        }
        Object o = x2;
        if (x2 == null) {
            if (jsonObject.has("classes")) {
                list.add("classes");
            }
            if (jsonObject.has("rooms")) {
                list.add("rooms");
            }
            if (jsonObject.has("teachers")) {
                list.add("teachers");
            }
            if (jsonObject.has("invigilator")) {
                list.add("invigilator");
            }
            if (!jsonObject.has("key")) {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'key'.");
            }
            n2 n2;
            if (jsonObject.isNull("key")) {
                n2 = f0.p1((Class<n2>)p4.a.class, null, true, list);
            }
            else {
                n2 = f0.p1((Class<n2>)p4.a.class, jsonObject.getLong("key"), true, list);
            }
            o = n2;
        }
        if (jsonObject.has("id")) {
            if (jsonObject.isNull("id")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
            }
            ((o2)o).b(jsonObject.getLong("id"));
        }
        if (jsonObject.has("examType")) {
            if (jsonObject.isNull("examType")) {
                ((o2)o).D7(null);
            }
            else {
                ((o2)o).D7(jsonObject.getString("examType"));
            }
        }
        if (jsonObject.has("start")) {
            if (jsonObject.isNull("start")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'start' to null.");
            }
            ((o2)o).h(jsonObject.getLong("start"));
        }
        if (jsonObject.has("end")) {
            if (jsonObject.isNull("end")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'end' to null.");
            }
            ((o2)o).i(jsonObject.getLong("end"));
        }
        if (jsonObject.has("departmentId")) {
            if (jsonObject.isNull("departmentId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'departmentId' to null.");
            }
            ((o2)o).z5(jsonObject.getLong("departmentId"));
        }
        if (jsonObject.has("name")) {
            if (jsonObject.isNull("name")) {
                ((o2)o).e(null);
            }
            else {
                ((o2)o).e(jsonObject.getString("name"));
            }
        }
        if (jsonObject.has("text")) {
            if (jsonObject.isNull("text")) {
                ((o2)o).j(null);
            }
            else {
                ((o2)o).j(jsonObject.getString("text"));
            }
        }
        if (jsonObject.has("entityType")) {
            if (jsonObject.isNull("entityType")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'entityType' to null.");
            }
            ((o2)o).k(jsonObject.getInt("entityType"));
        }
        if (jsonObject.has("entityId")) {
            if (jsonObject.isNull("entityId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'entityId' to null.");
            }
            ((o2)o).p(jsonObject.getLong("entityId"));
        }
        if (jsonObject.has("subjectId")) {
            if (jsonObject.isNull("subjectId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'subjectId' to null.");
            }
            ((o2)o).u0(jsonObject.getLong("subjectId"));
        }
        final boolean has = jsonObject.has("classes");
        final int n3 = 0;
        if (has) {
            if (jsonObject.isNull("classes")) {
                ((o2)o).T4(null);
            }
            else {
                ((o2)o).G6().clear();
                final JSONArray jsonArray = jsonObject.getJSONArray("classes");
                for (int i = 0; i < jsonArray.length(); ++i) {
                    ((o2)o).G6().add(z0.z8(f0, jsonArray.getJSONObject(i), b));
                }
            }
        }
        if (jsonObject.has("rooms")) {
            if (jsonObject.isNull("rooms")) {
                ((o2)o).U(null);
            }
            else {
                ((o2)o).Z().clear();
                final JSONArray jsonArray2 = jsonObject.getJSONArray("rooms");
                for (int j = 0; j < jsonArray2.length(); ++j) {
                    ((o2)o).Z().add(z0.z8(f0, jsonArray2.getJSONObject(j), b));
                }
            }
        }
        if (jsonObject.has("teachers")) {
            if (jsonObject.isNull("teachers")) {
                ((o2)o).t0(null);
            }
            else {
                ((o2)o).h0().clear();
                final JSONArray jsonArray3 = jsonObject.getJSONArray("teachers");
                for (int k = 0; k < jsonArray3.length(); ++k) {
                    ((o2)o).h0().add(z0.z8(f0, jsonArray3.getJSONObject(k), b));
                }
            }
        }
        if (jsonObject.has("invigilator")) {
            if (jsonObject.isNull("invigilator")) {
                ((o2)o).s6(null);
            }
            else {
                ((o2)o).M6().clear();
                final JSONArray jsonArray4 = jsonObject.getJSONArray("invigilator");
                for (int l = n3; l < jsonArray4.length(); ++l) {
                    ((o2)o).M6().add(p2.D8(f0, jsonArray4.getJSONObject(l), b));
                }
            }
        }
        return (p4.a)o;
    }
    
    @TargetApi(11)
    public static p4.a c9(final f0 f0, final JsonReader jsonReader) throws IOException {
        final p4.a a = new p4.a();
        jsonReader.beginObject();
        boolean b = false;
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            if (nextName.equals("key")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'key' to null.");
                }
                a.f0(jsonReader.nextLong());
                b = true;
            }
            else if (nextName.equals("id")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
                a.b(jsonReader.nextLong());
            }
            else if (nextName.equals("examType")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    a.D7(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    a.D7(null);
                }
            }
            else if (nextName.equals("start")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'start' to null.");
                }
                a.h(jsonReader.nextLong());
            }
            else if (nextName.equals("end")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'end' to null.");
                }
                a.i(jsonReader.nextLong());
            }
            else if (nextName.equals("departmentId")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'departmentId' to null.");
                }
                a.z5(jsonReader.nextLong());
            }
            else if (nextName.equals("name")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    a.e(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    a.e(null);
                }
            }
            else if (nextName.equals("text")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    a.j(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    a.j(null);
                }
            }
            else if (nextName.equals("entityType")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'entityType' to null.");
                }
                a.k(jsonReader.nextInt());
            }
            else if (nextName.equals("entityId")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'entityId' to null.");
                }
                a.p(jsonReader.nextLong());
            }
            else if (nextName.equals("subjectId")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'subjectId' to null.");
                }
                a.u0(jsonReader.nextLong());
            }
            else {
                if (nextName.equals("classes")) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.skipValue();
                        a.T4(null);
                        continue;
                    }
                    a.T4(new l0<com.untis.mobile.persistence.realm.b>());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        a.G6().add(z0.A8(f0, jsonReader));
                    }
                }
                else if (nextName.equals("rooms")) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.skipValue();
                        a.U(null);
                        continue;
                    }
                    a.U(new l0<com.untis.mobile.persistence.realm.b>());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        a.Z().add(z0.A8(f0, jsonReader));
                    }
                }
                else if (nextName.equals("teachers")) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.skipValue();
                        a.t0(null);
                        continue;
                    }
                    a.t0(new l0<com.untis.mobile.persistence.realm.b>());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        a.h0().add(z0.A8(f0, jsonReader));
                    }
                }
                else {
                    if (!nextName.equals("invigilator")) {
                        jsonReader.skipValue();
                        continue;
                    }
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.skipValue();
                        a.s6(null);
                        continue;
                    }
                    a.s6(new l0<p4.b>());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        a.M6().add(p2.E8(f0, jsonReader));
                    }
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
        if (b) {
            return f0.G0(a, new q[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'key'.");
    }
    
    public static OsObjectSchemaInfo d9() {
        return n2.f0;
    }
    
    public static String e9() {
        return "RealmInfoCenterExam";
    }
    
    public static long f9(final f0 f0, final p4.a a, final Map<n0, Long> map) {
        if (a instanceof p && !p0.h8(a)) {
            final p p3 = (p)a;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(p4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(p4.a.class);
        final long e = b.e;
        final Long value = a.z();
        long l;
        if (value != null) {
            l = Table.nativeFindFirstInt(nativePtr, e, a.z());
        }
        else {
            l = -1L;
        }
        if (l == -1L) {
            l = OsObject.createRowWithPrimaryKey(x2, e, a.z());
        }
        else {
            Table.v0(value);
        }
        map.put(a, l);
        Table.nativeSetLong(nativePtr, b.f, l, a.a(), false);
        final String m3 = a.M3();
        if (m3 != null) {
            Table.nativeSetString(nativePtr, b.g, l, m3, false);
        }
        Table.nativeSetLong(nativePtr, b.h, l, a.d(), false);
        Table.nativeSetLong(nativePtr, b.i, l, a.c(), false);
        Table.nativeSetLong(nativePtr, b.j, l, a.G2(), false);
        final String g = a.g();
        if (g != null) {
            Table.nativeSetString(nativePtr, b.k, l, g, false);
        }
        final String f2 = a.f();
        if (f2 != null) {
            Table.nativeSetString(nativePtr, b.l, l, f2, false);
        }
        Table.nativeSetLong(nativePtr, b.m, l, a.l(), false);
        Table.nativeSetLong(nativePtr, b.n, l, a.o(), false);
        Table.nativeSetLong(nativePtr, b.o, l, a.a0(), false);
        final l0<com.untis.mobile.persistence.realm.b> g2 = a.G6();
        if (g2 != null) {
            final OsList list = new OsList(x2.R(l), b.p);
            for (final com.untis.mobile.persistence.realm.b b2 : g2) {
                Long value2;
                if ((value2 = map.get(b2)) == null) {
                    value2 = z0.D8(f0, b2, map);
                }
                list.l(value2);
            }
        }
        final l0<com.untis.mobile.persistence.realm.b> z = a.Z();
        if (z != null) {
            final OsList list2 = new OsList(x2.R(l), b.q);
            for (final com.untis.mobile.persistence.realm.b b3 : z) {
                Long value3;
                if ((value3 = map.get(b3)) == null) {
                    value3 = z0.D8(f0, b3, map);
                }
                list2.l(value3);
            }
        }
        final l0<com.untis.mobile.persistence.realm.b> h0 = a.h0();
        if (h0 != null) {
            final OsList list3 = new OsList(x2.R(l), b.r);
            for (final com.untis.mobile.persistence.realm.b b4 : h0) {
                Long value4;
                if ((value4 = map.get(b4)) == null) {
                    value4 = z0.D8(f0, b4, map);
                }
                list3.l(value4);
            }
        }
        final l0<p4.b> m4 = a.M6();
        if (m4 != null) {
            final OsList list4 = new OsList(x2.R(l), b.s);
            for (final p4.b b5 : m4) {
                Long value5;
                if ((value5 = map.get(b5)) == null) {
                    value5 = p2.H8(f0, b5, map);
                }
                list4.l(value5);
            }
        }
        return l;
    }
    
    public static void g9(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(p4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(p4.a.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final p4.a a = (p4.a)iterator.next();
            if (map.containsKey(a)) {
                continue;
            }
            if (a instanceof p && !p0.h8(a)) {
                final p p3 = (p)a;
                if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                    map.put(a, p3.S6().g().l0());
                    continue;
                }
            }
            final Long value = a.z();
            long l;
            if (value != null) {
                l = Table.nativeFindFirstInt(nativePtr, e, a.z());
            }
            else {
                l = -1L;
            }
            if (l == -1L) {
                l = OsObject.createRowWithPrimaryKey(x2, e, a.z());
            }
            else {
                Table.v0(value);
            }
            map.put(a, l);
            Table.nativeSetLong(nativePtr, b.f, l, a.a(), false);
            final String m3 = a.M3();
            if (m3 != null) {
                Table.nativeSetString(nativePtr, b.g, l, m3, false);
            }
            Table.nativeSetLong(nativePtr, b.h, l, a.d(), false);
            Table.nativeSetLong(nativePtr, b.i, l, a.c(), false);
            Table.nativeSetLong(nativePtr, b.j, l, a.G2(), false);
            final String g = a.g();
            if (g != null) {
                Table.nativeSetString(nativePtr, b.k, l, g, false);
            }
            final String f2 = a.f();
            if (f2 != null) {
                Table.nativeSetString(nativePtr, b.l, l, f2, false);
            }
            Table.nativeSetLong(nativePtr, b.m, l, a.l(), false);
            Table.nativeSetLong(nativePtr, b.n, l, a.o(), false);
            Table.nativeSetLong(nativePtr, b.o, l, a.a0(), false);
            final l0<com.untis.mobile.persistence.realm.b> g2 = a.G6();
            if (g2 != null) {
                final OsList list = new OsList(x2.R(l), b.p);
                for (final com.untis.mobile.persistence.realm.b b2 : g2) {
                    Long value2;
                    if ((value2 = map.get(b2)) == null) {
                        value2 = z0.D8(f0, b2, map);
                    }
                    list.l(value2);
                }
            }
            final l0<com.untis.mobile.persistence.realm.b> z = a.Z();
            if (z != null) {
                final OsList list2 = new OsList(x2.R(l), b.q);
                for (final com.untis.mobile.persistence.realm.b b3 : z) {
                    Long value3;
                    if ((value3 = map.get(b3)) == null) {
                        value3 = z0.D8(f0, b3, map);
                    }
                    list2.l(value3);
                }
            }
            final l0<com.untis.mobile.persistence.realm.b> h0 = a.h0();
            if (h0 != null) {
                final OsList list3 = new OsList(x2.R(l), b.r);
                for (final com.untis.mobile.persistence.realm.b b4 : h0) {
                    Long value4;
                    if ((value4 = map.get(b4)) == null) {
                        value4 = z0.D8(f0, b4, map);
                    }
                    list3.l(value4);
                }
            }
            final l0<p4.b> m4 = a.M6();
            if (m4 == null) {
                continue;
            }
            final OsList list4 = new OsList(x2.R(l), b.s);
            for (final p4.b b5 : m4) {
                Long value5;
                if ((value5 = map.get(b5)) == null) {
                    value5 = p2.H8(f0, b5, map);
                }
                list4.l(value5);
            }
        }
    }
    
    public static long h9(final f0 f0, final p4.a a, final Map<n0, Long> map) {
        if (a instanceof p && !p0.h8(a)) {
            final p p3 = (p)a;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(p4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(p4.a.class);
        final long e = b.e;
        long nativeFindFirstInt;
        if (Long.valueOf(a.z()) != null) {
            nativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, e, a.z());
        }
        else {
            nativeFindFirstInt = -1L;
        }
        long rowWithPrimaryKey = nativeFindFirstInt;
        if (nativeFindFirstInt == -1L) {
            rowWithPrimaryKey = OsObject.createRowWithPrimaryKey(x2, e, a.z());
        }
        map.put(a, rowWithPrimaryKey);
        Table.nativeSetLong(nativePtr, b.f, rowWithPrimaryKey, a.a(), false);
        final String m3 = a.M3();
        final long g = b.g;
        if (m3 != null) {
            Table.nativeSetString(nativePtr, g, rowWithPrimaryKey, m3, false);
        }
        else {
            Table.nativeSetNull(nativePtr, g, rowWithPrimaryKey, false);
        }
        Table.nativeSetLong(nativePtr, b.h, rowWithPrimaryKey, a.d(), false);
        Table.nativeSetLong(nativePtr, b.i, rowWithPrimaryKey, a.c(), false);
        Table.nativeSetLong(nativePtr, b.j, rowWithPrimaryKey, a.G2(), false);
        final String g2 = a.g();
        final long k = b.k;
        if (g2 != null) {
            Table.nativeSetString(nativePtr, k, rowWithPrimaryKey, g2, false);
        }
        else {
            Table.nativeSetNull(nativePtr, k, rowWithPrimaryKey, false);
        }
        final String f2 = a.f();
        final long l = b.l;
        if (f2 != null) {
            Table.nativeSetString(nativePtr, l, rowWithPrimaryKey, f2, false);
        }
        else {
            Table.nativeSetNull(nativePtr, l, rowWithPrimaryKey, false);
        }
        Table.nativeSetLong(nativePtr, b.m, rowWithPrimaryKey, a.l(), false);
        Table.nativeSetLong(nativePtr, b.n, rowWithPrimaryKey, a.o(), false);
        Table.nativeSetLong(nativePtr, b.o, rowWithPrimaryKey, a.a0(), false);
        final OsList list = new OsList(x2.R(rowWithPrimaryKey), b.p);
        final l0<com.untis.mobile.persistence.realm.b> g3 = a.G6();
        final int n = 0;
        if (g3 != null && g3.size() == list.b0()) {
            for (int size = g3.size(), i = 0; i < size; ++i) {
                final com.untis.mobile.persistence.realm.b b2 = g3.get(i);
                Long value;
                if ((value = map.get(b2)) == null) {
                    value = z0.F8(f0, b2, map);
                }
                list.Z(i, value);
            }
        }
        else {
            list.M();
            if (g3 != null) {
                for (final com.untis.mobile.persistence.realm.b b3 : g3) {
                    Long value2;
                    if ((value2 = map.get(b3)) == null) {
                        value2 = z0.F8(f0, b3, map);
                    }
                    list.l(value2);
                }
            }
        }
        final OsList list2 = new OsList(x2.R(rowWithPrimaryKey), b.q);
        final l0<com.untis.mobile.persistence.realm.b> z = a.Z();
        if (z != null && z.size() == list2.b0()) {
            for (int size2 = z.size(), j = 0; j < size2; ++j) {
                final com.untis.mobile.persistence.realm.b b4 = z.get(j);
                Long value3;
                if ((value3 = map.get(b4)) == null) {
                    value3 = z0.F8(f0, b4, map);
                }
                list2.Z(j, value3);
            }
        }
        else {
            list2.M();
            if (z != null) {
                for (final com.untis.mobile.persistence.realm.b b5 : z) {
                    Long value4;
                    if ((value4 = map.get(b5)) == null) {
                        value4 = z0.F8(f0, b5, map);
                    }
                    list2.l(value4);
                }
            }
        }
        final OsList list3 = new OsList(x2.R(rowWithPrimaryKey), b.r);
        final l0<com.untis.mobile.persistence.realm.b> h0 = a.h0();
        if (h0 != null && h0.size() == list3.b0()) {
            for (int size3 = h0.size(), n2 = 0; n2 < size3; ++n2) {
                final com.untis.mobile.persistence.realm.b b6 = h0.get(n2);
                Long value5;
                if ((value5 = map.get(b6)) == null) {
                    value5 = z0.F8(f0, b6, map);
                }
                list3.Z(n2, value5);
            }
        }
        else {
            list3.M();
            if (h0 != null) {
                for (final com.untis.mobile.persistence.realm.b b7 : h0) {
                    Long value6;
                    if ((value6 = map.get(b7)) == null) {
                        value6 = z0.F8(f0, b7, map);
                    }
                    list3.l(value6);
                }
            }
        }
        final OsList list4 = new OsList(x2.R(rowWithPrimaryKey), b.s);
        final l0<p4.b> m4 = a.M6();
        if (m4 != null && m4.size() == list4.b0()) {
            for (int size4 = m4.size(), n3 = n; n3 < size4; ++n3) {
                final p4.b b8 = m4.get(n3);
                Long value7;
                if ((value7 = map.get(b8)) == null) {
                    value7 = p2.J8(f0, b8, map);
                }
                list4.Z(n3, value7);
            }
        }
        else {
            list4.M();
            if (m4 != null) {
                for (final p4.b b9 : m4) {
                    Long value8;
                    if ((value8 = map.get(b9)) == null) {
                        value8 = p2.J8(f0, b9, map);
                    }
                    list4.l(value8);
                }
            }
        }
        return rowWithPrimaryKey;
    }
    
    public static void i9(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(p4.a.class);
        long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(p4.a.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final p4.a a = (p4.a)iterator.next();
            if (map.containsKey(a)) {
                continue;
            }
            if (a instanceof p && !p0.h8(a)) {
                final p p3 = (p)a;
                if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                    map.put(a, p3.S6().g().l0());
                    continue;
                }
            }
            long nativeFindFirstInt;
            if (Long.valueOf(a.z()) != null) {
                nativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, e, a.z());
            }
            else {
                nativeFindFirstInt = -1L;
            }
            long rowWithPrimaryKey = nativeFindFirstInt;
            if (nativeFindFirstInt == -1L) {
                rowWithPrimaryKey = OsObject.createRowWithPrimaryKey(x2, e, a.z());
            }
            map.put(a, rowWithPrimaryKey);
            Table.nativeSetLong(nativePtr, b.f, rowWithPrimaryKey, a.a(), false);
            final String m3 = a.M3();
            final long g = b.g;
            if (m3 != null) {
                Table.nativeSetString(nativePtr, g, rowWithPrimaryKey, m3, false);
            }
            else {
                Table.nativeSetNull(nativePtr, g, rowWithPrimaryKey, false);
            }
            Table.nativeSetLong(nativePtr, b.h, rowWithPrimaryKey, a.d(), false);
            Table.nativeSetLong(nativePtr, b.i, rowWithPrimaryKey, a.c(), false);
            Table.nativeSetLong(nativePtr, b.j, rowWithPrimaryKey, a.G2(), false);
            final String g2 = a.g();
            final long k = b.k;
            if (g2 != null) {
                Table.nativeSetString(nativePtr, k, rowWithPrimaryKey, g2, false);
            }
            else {
                Table.nativeSetNull(nativePtr, k, rowWithPrimaryKey, false);
            }
            final String f2 = a.f();
            final long l = b.l;
            if (f2 != null) {
                Table.nativeSetString(nativePtr, l, rowWithPrimaryKey, f2, false);
            }
            else {
                Table.nativeSetNull(nativePtr, l, rowWithPrimaryKey, false);
            }
            Table.nativeSetLong(nativePtr, b.m, rowWithPrimaryKey, a.l(), false);
            Table.nativeSetLong(nativePtr, b.n, rowWithPrimaryKey, a.o(), false);
            Table.nativeSetLong(nativePtr, b.o, rowWithPrimaryKey, a.a0(), false);
            final OsList list = new OsList(x2.R(rowWithPrimaryKey), b.p);
            final l0<com.untis.mobile.persistence.realm.b> g3 = a.G6();
            if (g3 != null && g3.size() == list.b0()) {
                for (int size = g3.size(), i = 0; i < size; ++i) {
                    final com.untis.mobile.persistence.realm.b b2 = g3.get(i);
                    Long value;
                    if ((value = map.get(b2)) == null) {
                        value = z0.F8(f0, b2, map);
                    }
                    list.Z(i, value);
                }
            }
            else {
                list.M();
                if (g3 != null) {
                    for (final com.untis.mobile.persistence.realm.b b3 : g3) {
                        Long value2;
                        if ((value2 = map.get(b3)) == null) {
                            value2 = z0.F8(f0, b3, map);
                        }
                        list.l(value2);
                    }
                }
            }
            final OsList list2 = new OsList(x2.R(rowWithPrimaryKey), b.q);
            final l0<com.untis.mobile.persistence.realm.b> z = a.Z();
            if (z != null && z.size() == list2.b0()) {
                for (int size2 = z.size(), j = 0; j < size2; ++j) {
                    final com.untis.mobile.persistence.realm.b b4 = z.get(j);
                    Long value3;
                    if ((value3 = map.get(b4)) == null) {
                        value3 = z0.F8(f0, b4, map);
                    }
                    list2.Z(j, value3);
                }
            }
            else {
                final long n = nativePtr;
                list2.M();
                nativePtr = n;
                if (z != null) {
                    final Iterator<com.untis.mobile.persistence.realm.b> iterator3 = z.iterator();
                    while (true) {
                        nativePtr = n;
                        if (!iterator3.hasNext()) {
                            break;
                        }
                        final com.untis.mobile.persistence.realm.b b5 = iterator3.next();
                        Long value4;
                        if ((value4 = map.get(b5)) == null) {
                            value4 = z0.F8(f0, b5, map);
                        }
                        list2.l(value4);
                    }
                }
            }
            final OsList list3 = new OsList(x2.R(rowWithPrimaryKey), b.r);
            final l0<com.untis.mobile.persistence.realm.b> h0 = a.h0();
            if (h0 != null && h0.size() == list3.b0()) {
                for (int size3 = h0.size(), n2 = 0; n2 < size3; ++n2) {
                    final com.untis.mobile.persistence.realm.b b6 = h0.get(n2);
                    Long value5;
                    if ((value5 = map.get(b6)) == null) {
                        value5 = z0.F8(f0, b6, map);
                    }
                    list3.Z(n2, value5);
                }
            }
            else {
                list3.M();
                if (h0 != null) {
                    for (final com.untis.mobile.persistence.realm.b b7 : h0) {
                        Long value6;
                        if ((value6 = map.get(b7)) == null) {
                            value6 = z0.F8(f0, b7, map);
                        }
                        list3.l(value6);
                    }
                }
            }
            final OsList list4 = new OsList(x2.R(rowWithPrimaryKey), b.s);
            final l0<p4.b> m4 = a.M6();
            if (m4 != null && m4.size() == list4.b0()) {
                for (int size4 = m4.size(), n3 = 0; n3 < size4; ++n3) {
                    final p4.b b8 = m4.get(n3);
                    Long value7;
                    if ((value7 = map.get(b8)) == null) {
                        value7 = p2.J8(f0, b8, map);
                    }
                    list4.Z(n3, value7);
                }
            }
            else {
                list4.M();
                if (m4 == null) {
                    continue;
                }
                for (final p4.b b9 : m4) {
                    Long value8;
                    if ((value8 = map.get(b9)) == null) {
                        value8 = p2.J8(f0, b9, map);
                    }
                    list4.l(value8);
                }
            }
        }
    }
    
    static n2 j9(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(p4.a.class), false, Collections.emptyList());
        final n2 n2 = new n2();
        h.a();
        return n2;
    }
    
    static p4.a k9(final f0 f0, final b b, final p4.a a, final p4.a a2, final Map<n0, p> map, final Set<q> set) {
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(p4.a.class), set);
        osObjectBuilder.L(b.e, a2.z());
        osObjectBuilder.L(b.f, a2.a());
        osObjectBuilder.d0(b.g, a2.M3());
        osObjectBuilder.L(b.h, a2.d());
        osObjectBuilder.L(b.i, a2.c());
        osObjectBuilder.L(b.j, a2.G2());
        osObjectBuilder.d0(b.k, a2.g());
        osObjectBuilder.d0(b.l, a2.f());
        osObjectBuilder.K(b.m, a2.l());
        osObjectBuilder.L(b.n, a2.o());
        osObjectBuilder.L(b.o, a2.a0());
        final l0<com.untis.mobile.persistence.realm.b> g6 = a2.G6();
        final int n = 0;
        if (g6 != null) {
            final l0<n0> l0 = new l0<n0>();
            for (int i = 0; i < g6.size(); ++i) {
                final com.untis.mobile.persistence.realm.b b2 = g6.get(i);
                com.untis.mobile.persistence.realm.b v8 = (com.untis.mobile.persistence.realm.b)map.get(b2);
                if (v8 == null) {
                    v8 = z0.v8(f0, (z0.b)f0.H().j(com.untis.mobile.persistence.realm.b.class), b2, true, map, set);
                }
                l0.add(v8);
            }
            osObjectBuilder.Z(b.p, l0);
        }
        else {
            osObjectBuilder.Z(b.p, new l0<n0>());
        }
        final l0<com.untis.mobile.persistence.realm.b> z = a2.Z();
        if (z != null) {
            final l0<n0> l2 = new l0<n0>();
            for (int j = 0; j < z.size(); ++j) {
                final com.untis.mobile.persistence.realm.b b3 = z.get(j);
                com.untis.mobile.persistence.realm.b v9 = (com.untis.mobile.persistence.realm.b)map.get(b3);
                if (v9 == null) {
                    v9 = z0.v8(f0, (z0.b)f0.H().j(com.untis.mobile.persistence.realm.b.class), b3, true, map, set);
                }
                l2.add(v9);
            }
            osObjectBuilder.Z(b.q, l2);
        }
        else {
            osObjectBuilder.Z(b.q, new l0<n0>());
        }
        final l0<com.untis.mobile.persistence.realm.b> h0 = a2.h0();
        if (h0 != null) {
            final l0<n0> l3 = new l0<n0>();
            for (int k = 0; k < h0.size(); ++k) {
                final com.untis.mobile.persistence.realm.b b4 = h0.get(k);
                com.untis.mobile.persistence.realm.b v10 = (com.untis.mobile.persistence.realm.b)map.get(b4);
                if (v10 == null) {
                    v10 = z0.v8(f0, (z0.b)f0.H().j(com.untis.mobile.persistence.realm.b.class), b4, true, map, set);
                }
                l3.add(v10);
            }
            osObjectBuilder.Z(b.r, l3);
        }
        else {
            osObjectBuilder.Z(b.r, new l0<n0>());
        }
        final l0<p4.b> m6 = a2.M6();
        if (m6 != null) {
            final l0<n0> l4 = new l0<n0>();
            for (int n2 = n; n2 < m6.size(); ++n2) {
                final p4.b b5 = m6.get(n2);
                p4.b z2 = (p4.b)map.get(b5);
                if (z2 == null) {
                    z2 = p2.z8(f0, (p2.b)f0.H().j(p4.b.class), b5, true, map, set);
                }
                l4.add(z2);
            }
            osObjectBuilder.Z(b.s, l4);
        }
        else {
            osObjectBuilder.Z(b.s, new l0<n0>());
        }
        osObjectBuilder.i0();
        return a;
    }
    
    @Override
    public void D7(final String s) {
        if (this.Z.i()) {
            if (!this.Z.d()) {
                return;
            }
            final r g = this.Z.g();
            if (s != null) {
                g.g().t0(this.Y.g, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'examType' to null.");
        }
        else {
            this.Z.f().h();
            if (s != null) {
                this.Z.g().d(this.Y.g, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'examType' to null.");
        }
    }
    
    @Override
    public long G2() {
        this.Z.f().h();
        return this.Z.g().m(this.Y.j);
    }
    
    @Override
    public l0<com.untis.mobile.persistence.realm.b> G6() {
        this.Z.f().h();
        final l0<com.untis.mobile.persistence.realm.b> a0 = this.a0;
        if (a0 != null) {
            return a0;
        }
        return this.a0 = new l0<com.untis.mobile.persistence.realm.b>(com.untis.mobile.persistence.realm.b.class, this.Z.g().p(this.Y.p), this.Z.f());
    }
    
    @Override
    public String M3() {
        this.Z.f().h();
        return this.Z.g().U(this.Y.g);
    }
    
    @Override
    public l0<p4.b> M6() {
        this.Z.f().h();
        final l0<p4.b> d0 = this.d0;
        if (d0 != null) {
            return d0;
        }
        return this.d0 = new l0<p4.b>(p4.b.class, this.Z.g().p(this.Y.s), this.Z.f());
    }
    
    @Override
    public c0<?> S6() {
        return this.Z;
    }
    
    @Override
    public void T4(final l0<com.untis.mobile.persistence.realm.b> l0) {
        final boolean i = this.Z.i();
        final int n = 0;
        int j = 0;
        l0<com.untis.mobile.persistence.realm.b> l2 = l0;
        if (i) {
            if (!this.Z.d()) {
                return;
            }
            if (this.Z.e().contains("classes")) {
                return;
            }
            if ((l2 = l0) != null) {
                l2 = l0;
                if (!l0.G0()) {
                    final f0 f0 = (f0)this.Z.f();
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
        this.Z.f().h();
        final OsList p = this.Z.g().p(this.Y.p);
        if (l2 != null && l2.size() == p.b0()) {
            while (j < l2.size()) {
                final com.untis.mobile.persistence.realm.b b3 = l2.get(j);
                this.Z.c(b3);
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
                this.Z.c(b4);
                p.l(((p)b4).S6().g().l0());
            }
        }
    }
    
    @Override
    public void U(final l0<com.untis.mobile.persistence.realm.b> l0) {
        final boolean i = this.Z.i();
        final int n = 0;
        int j = 0;
        l0<com.untis.mobile.persistence.realm.b> l2 = l0;
        if (i) {
            if (!this.Z.d()) {
                return;
            }
            if (this.Z.e().contains("rooms")) {
                return;
            }
            if ((l2 = l0) != null) {
                l2 = l0;
                if (!l0.G0()) {
                    final f0 f0 = (f0)this.Z.f();
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
        this.Z.f().h();
        final OsList p = this.Z.g().p(this.Y.q);
        if (l2 != null && l2.size() == p.b0()) {
            while (j < l2.size()) {
                final com.untis.mobile.persistence.realm.b b3 = l2.get(j);
                this.Z.c(b3);
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
                this.Z.c(b4);
                p.l(((p)b4).S6().g().l0());
            }
        }
    }
    
    @Override
    public l0<com.untis.mobile.persistence.realm.b> Z() {
        this.Z.f().h();
        final l0<com.untis.mobile.persistence.realm.b> b0 = this.b0;
        if (b0 != null) {
            return b0;
        }
        return this.b0 = new l0<com.untis.mobile.persistence.realm.b>(com.untis.mobile.persistence.realm.b.class, this.Z.g().p(this.Y.q), this.Z.f());
    }
    
    @Override
    public long a() {
        this.Z.f().h();
        return this.Z.g().m(this.Y.f);
    }
    
    @Override
    public long a0() {
        this.Z.f().h();
        return this.Z.g().m(this.Y.o);
    }
    
    @Override
    public void b(final long n) {
        if (!this.Z.i()) {
            this.Z.f().h();
            this.Z.g().s(this.Y.f, n);
            return;
        }
        if (!this.Z.d()) {
            return;
        }
        final r g = this.Z.g();
        g.g().q0(this.Y.f, g.l0(), n, true);
    }
    
    @Override
    public long c() {
        this.Z.f().h();
        return this.Z.g().m(this.Y.i);
    }
    
    @Override
    public long d() {
        this.Z.f().h();
        return this.Z.g().m(this.Y.h);
    }
    
    @Override
    public void e(final String s) {
        if (this.Z.i()) {
            if (!this.Z.d()) {
                return;
            }
            final r g = this.Z.g();
            if (s != null) {
                g.g().t0(this.Y.k, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'name' to null.");
        }
        else {
            this.Z.f().h();
            if (s != null) {
                this.Z.g().d(this.Y.k, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'name' to null.");
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final n2 n2 = (n2)o;
        final io.realm.a f = this.Z.f();
        final io.realm.a f2 = n2.Z.f();
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
        final String m = this.Z.g().g().M();
        final String i = n2.Z.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.Z.g().l0() == n2.Z.g().l0();
            }
        }
        else if (i == null) {
            return this.Z.g().l0() == n2.Z.g().l0();
        }
        return false;
    }
    
    @Override
    public String f() {
        this.Z.f().h();
        return this.Z.g().U(this.Y.l);
    }
    
    @Override
    public void f0(final long n) {
        if (this.Z.i()) {
            return;
        }
        this.Z.f().h();
        throw new RealmException("Primary key field 'key' cannot be changed after object was created.");
    }
    
    @Override
    public String g() {
        this.Z.f().h();
        return this.Z.g().U(this.Y.k);
    }
    
    @Override
    public void h(final long n) {
        if (!this.Z.i()) {
            this.Z.f().h();
            this.Z.g().s(this.Y.h, n);
            return;
        }
        if (!this.Z.d()) {
            return;
        }
        final r g = this.Z.g();
        g.g().q0(this.Y.h, g.l0(), n, true);
    }
    
    @Override
    public l0<com.untis.mobile.persistence.realm.b> h0() {
        this.Z.f().h();
        final l0<com.untis.mobile.persistence.realm.b> c0 = this.c0;
        if (c0 != null) {
            return c0;
        }
        return this.c0 = new l0<com.untis.mobile.persistence.realm.b>(com.untis.mobile.persistence.realm.b.class, this.Z.g().p(this.Y.r), this.Z.f());
    }
    
    @Override
    public int hashCode() {
        final String path = this.Z.f().getPath();
        final String m = this.Z.g().g().M();
        final long l0 = this.Z.g().l0();
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
    public void i(final long n) {
        if (!this.Z.i()) {
            this.Z.f().h();
            this.Z.g().s(this.Y.i, n);
            return;
        }
        if (!this.Z.d()) {
            return;
        }
        final r g = this.Z.g();
        g.g().q0(this.Y.i, g.l0(), n, true);
    }
    
    @Override
    public void j(final String s) {
        if (this.Z.i()) {
            if (!this.Z.d()) {
                return;
            }
            final r g = this.Z.g();
            if (s != null) {
                g.g().t0(this.Y.l, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'text' to null.");
        }
        else {
            this.Z.f().h();
            if (s != null) {
                this.Z.g().d(this.Y.l, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'text' to null.");
        }
    }
    
    @Override
    public void k(final int n) {
        if (!this.Z.i()) {
            this.Z.f().h();
            this.Z.g().s(this.Y.m, n);
            return;
        }
        if (!this.Z.d()) {
            return;
        }
        final r g = this.Z.g();
        g.g().q0(this.Y.m, g.l0(), n, true);
    }
    
    @Override
    public int l() {
        this.Z.f().h();
        return (int)this.Z.g().m(this.Y.m);
    }
    
    @Override
    public long o() {
        this.Z.f().h();
        return this.Z.g().m(this.Y.n);
    }
    
    @Override
    public void p(final long n) {
        if (!this.Z.i()) {
            this.Z.f().h();
            this.Z.g().s(this.Y.n, n);
            return;
        }
        if (!this.Z.d()) {
            return;
        }
        final r g = this.Z.g();
        g.g().q0(this.Y.n, g.l0(), n, true);
    }
    
    @Override
    public void s6(final l0<p4.b> l0) {
        final boolean i = this.Z.i();
        final int n = 0;
        int j = 0;
        l0<p4.b> l2 = l0;
        if (i) {
            if (!this.Z.d()) {
                return;
            }
            if (this.Z.e().contains("invigilator")) {
                return;
            }
            if ((l2 = l0) != null) {
                l2 = l0;
                if (!l0.G0()) {
                    final f0 f0 = (f0)this.Z.f();
                    l2 = new l0<p4.b>();
                    for (final p4.b b : l0) {
                        p4.b b2;
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
        this.Z.f().h();
        final OsList p = this.Z.g().p(this.Y.s);
        if (l2 != null && l2.size() == p.b0()) {
            while (j < l2.size()) {
                final p4.b b3 = l2.get(j);
                this.Z.c(b3);
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
                final p4.b b4 = l2.get(k);
                this.Z.c(b4);
                p.l(((p)b4).S6().g().l0());
            }
        }
    }
    
    @Override
    public void t0(final l0<com.untis.mobile.persistence.realm.b> l0) {
        final boolean i = this.Z.i();
        final int n = 0;
        int j = 0;
        l0<com.untis.mobile.persistence.realm.b> l2 = l0;
        if (i) {
            if (!this.Z.d()) {
                return;
            }
            if (this.Z.e().contains("teachers")) {
                return;
            }
            if ((l2 = l0) != null) {
                l2 = l0;
                if (!l0.G0()) {
                    final f0 f0 = (f0)this.Z.f();
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
        this.Z.f().h();
        final OsList p = this.Z.g().p(this.Y.r);
        if (l2 != null && l2.size() == p.b0()) {
            while (j < l2.size()) {
                final com.untis.mobile.persistence.realm.b b3 = l2.get(j);
                this.Z.c(b3);
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
                this.Z.c(b4);
                p.l(((p)b4).S6().g().l0());
            }
        }
    }
    
    @Override
    public String toString() {
        if (!p0.k8(this)) {
            return "Invalid object";
        }
        final StringBuilder sb = new StringBuilder("RealmInfoCenterExam = proxy[");
        sb.append("{key:");
        sb.append(this.z());
        sb.append("}");
        sb.append(",");
        sb.append("{id:");
        sb.append(this.a());
        sb.append("}");
        sb.append(",");
        sb.append("{examType:");
        sb.append(this.M3());
        sb.append("}");
        sb.append(",");
        sb.append("{start:");
        sb.append(this.d());
        sb.append("}");
        sb.append(",");
        sb.append("{end:");
        sb.append(this.c());
        sb.append("}");
        sb.append(",");
        sb.append("{departmentId:");
        sb.append(this.G2());
        sb.append("}");
        sb.append(",");
        sb.append("{name:");
        sb.append(this.g());
        sb.append("}");
        sb.append(",");
        sb.append("{text:");
        sb.append(this.f());
        sb.append("}");
        sb.append(",");
        sb.append("{entityType:");
        sb.append(this.l());
        sb.append("}");
        sb.append(",");
        sb.append("{entityId:");
        sb.append(this.o());
        sb.append("}");
        sb.append(",");
        sb.append("{subjectId:");
        sb.append(this.a0());
        sb.append("}");
        sb.append(",");
        sb.append("{classes:");
        sb.append("RealmList<RealmLong>[");
        sb.append(this.G6().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{rooms:");
        sb.append("RealmList<RealmLong>[");
        sb.append(this.Z().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{teachers:");
        sb.append("RealmList<RealmLong>[");
        sb.append(this.h0().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{invigilator:");
        sb.append("RealmList<RealmInvigilator>[");
        sb.append(this.M6().size());
        sb.append("]");
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
    
    @Override
    public void u0(final long n) {
        if (!this.Z.i()) {
            this.Z.f().h();
            this.Z.g().s(this.Y.o, n);
            return;
        }
        if (!this.Z.d()) {
            return;
        }
        final r g = this.Z.g();
        g.g().q0(this.Y.o, g.l0(), n, true);
    }
    
    @Override
    public void y4() {
        if (this.Z != null) {
            return;
        }
        final io.realm.a.h h = io.realm.a.W.get();
        this.Y = (b)h.c();
        (this.Z = new c0<p4.a>(this)).r(h.e());
        this.Z.s(h.f());
        this.Z.o(h.b());
        this.Z.q(h.d());
    }
    
    @Override
    public long z() {
        this.Z.f().h();
        return this.Z.g().m(this.Y.e);
    }
    
    @Override
    public void z5(final long n) {
        if (!this.Z.i()) {
            this.Z.f().h();
            this.Z.g().s(this.Y.j, n);
            return;
        }
        if (!this.Z.d()) {
            return;
        }
        final r g = this.Z.g();
        g.g().q0(this.Y.j, g.l0(), n, true);
    }
    
    public static final class a
    {
        public static final String a = "RealmInfoCenterExam";
    }
    
    static final class b extends c
    {
        long e;
        long f;
        long g;
        long h;
        long i;
        long j;
        long k;
        long l;
        long m;
        long n;
        long o;
        long p;
        long q;
        long r;
        long s;
        
        b(final OsSchemaInfo osSchemaInfo) {
            super(15);
            final OsObjectSchemaInfo b = osSchemaInfo.b("RealmInfoCenterExam");
            this.e = this.b("key", "key", b);
            this.f = this.b("id", "id", b);
            this.g = this.b("examType", "examType", b);
            this.h = this.b("start", "start", b);
            this.i = this.b("end", "end", b);
            this.j = this.b("departmentId", "departmentId", b);
            this.k = this.b("name", "name", b);
            this.l = this.b("text", "text", b);
            this.m = this.b("entityType", "entityType", b);
            this.n = this.b("entityId", "entityId", b);
            this.o = this.b("subjectId", "subjectId", b);
            this.p = this.b("classes", "classes", b);
            this.q = this.b("rooms", "rooms", b);
            this.r = this.b("teachers", "teachers", b);
            this.s = this.b("invigilator", "invigilator", b);
        }
        
        b(final c c, final boolean b) {
            super(c, b);
            this.d(c, this);
        }
        
        @Override
        protected final c c(final boolean b) {
            return new b(this, b);
        }
        
        @Override
        protected final void d(final c c, final c c2) {
            final b b = (b)c;
            final b b2 = (b)c2;
            b2.e = b.e;
            b2.f = b.f;
            b2.g = b.g;
            b2.h = b.h;
            b2.i = b.i;
            b2.j = b.j;
            b2.k = b.k;
            b2.l = b.l;
            b2.m = b.m;
            b2.n = b.n;
            b2.o = b.o;
            b2.p = b.p;
            b2.q = b.q;
            b2.r = b.r;
            b2.s = b.s;
        }
    }
}
