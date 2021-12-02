// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import java.util.Collections;
import java.util.Iterator;
import io.realm.internal.OsList;
import io.realm.internal.Table;
import io.realm.internal.OsObject;
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
import io.realm.internal.r;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Set;
import java.util.Map;
import com.untis.mobile.persistence.realm.b;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.p;
import i4.c;

public class j1 extends c implements p, k1
{
    private static final String W = "";
    private static final OsObjectSchemaInfo X;
    private b R;
    private c0<c> S;
    private l0<com.untis.mobile.persistence.realm.b> T;
    private l0<com.untis.mobile.persistence.realm.b> U;
    private l0<com.untis.mobile.persistence.realm.b> V;
    
    static {
        X = M8();
    }
    
    j1() {
        this.S.p();
    }
    
    public static c I8(final f0 f0, final b b, final c c, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        final j1 j1 = map.get(c);
        if (j1 != null) {
            return j1;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(c.class), set);
        osObjectBuilder.L(b.e, c.d0());
        osObjectBuilder.L(b.f, c.D());
        osObjectBuilder.L(b.g, c.Q2());
        osObjectBuilder.K(b.h, c.m0());
        osObjectBuilder.L(b.i, c.K());
        final j1 v8 = V8(f0, osObjectBuilder.f0());
        map.put(c, v8);
        final l0<com.untis.mobile.persistence.realm.b> h0 = c.h0();
        final int n = 0;
        if (h0 != null) {
            final l0<com.untis.mobile.persistence.realm.b> h2 = v8.h0();
            h2.clear();
            for (int i = 0; i < h0.size(); ++i) {
                final com.untis.mobile.persistence.realm.b b3 = h0.get(i);
                com.untis.mobile.persistence.realm.b v9 = (com.untis.mobile.persistence.realm.b)map.get(b3);
                if (v9 == null) {
                    v9 = z0.v8(f0, (z0.b)f0.H().j(com.untis.mobile.persistence.realm.b.class), b3, b2, map, set);
                }
                h2.add(v9);
            }
        }
        final l0<com.untis.mobile.persistence.realm.b> a1 = c.a1();
        if (a1 != null) {
            final l0<com.untis.mobile.persistence.realm.b> a2 = v8.a1();
            a2.clear();
            for (int k = 0; k < a1.size(); ++k) {
                final com.untis.mobile.persistence.realm.b b4 = a1.get(k);
                com.untis.mobile.persistence.realm.b v10 = (com.untis.mobile.persistence.realm.b)map.get(b4);
                if (v10 == null) {
                    v10 = z0.v8(f0, (z0.b)f0.H().j(com.untis.mobile.persistence.realm.b.class), b4, b2, map, set);
                }
                a2.add(v10);
            }
        }
        final l0<com.untis.mobile.persistence.realm.b> z = c.Z();
        if (z != null) {
            final l0<com.untis.mobile.persistence.realm.b> z2 = v8.Z();
            z2.clear();
            for (int l = n; l < z.size(); ++l) {
                final com.untis.mobile.persistence.realm.b b5 = z.get(l);
                com.untis.mobile.persistence.realm.b v11 = (com.untis.mobile.persistence.realm.b)map.get(b5);
                if (v11 == null) {
                    v11 = z0.v8(f0, (z0.b)f0.H().j(com.untis.mobile.persistence.realm.b.class), b5, b2, map, set);
                }
                z2.add(v11);
            }
        }
        return v8;
    }
    
    public static c J8(final f0 f0, final b b, final c c, final boolean b2, final Map<n0, p> map, final Set<q> set) {
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
        return I8(f0, b, c, b2, map, set);
    }
    
    public static b K8(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static c L8(final c c, final int a, final int n, final Map<n0, p.a<n0>> map) {
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
            c2.W0(c.d0());
            c2.y(c.D());
            c2.O6(c.Q2());
            c2.q0(c.m0());
            c2.R0(c.K());
            final int n2 = 0;
            if (a == n) {
                c2.t0(null);
            }
            else {
                final l0<com.untis.mobile.persistence.realm.b> h0 = c.h0();
                final l0<com.untis.mobile.persistence.realm.b> l0 = new l0<com.untis.mobile.persistence.realm.b>();
                c2.t0(l0);
                for (int size = h0.size(), i = 0; i < size; ++i) {
                    l0.add(z0.x8(h0.get(i), a + 1, n, map));
                }
            }
            if (a == n) {
                c2.n1(null);
            }
            else {
                final l0<com.untis.mobile.persistence.realm.b> a3 = c.a1();
                final l0<com.untis.mobile.persistence.realm.b> l2 = new l0<com.untis.mobile.persistence.realm.b>();
                c2.n1(l2);
                for (int size2 = a3.size(), j = 0; j < size2; ++j) {
                    l2.add(z0.x8(a3.get(j), a + 1, n, map));
                }
            }
            if (a == n) {
                c2.U(null);
            }
            else {
                final l0<com.untis.mobile.persistence.realm.b> z = c.Z();
                final l0<com.untis.mobile.persistence.realm.b> l3 = new l0<com.untis.mobile.persistence.realm.b>();
                c2.U(l3);
                for (int size3 = z.size(), k = n2; k < size3; ++k) {
                    l3.add(z0.x8(z.get(k), a + 1, n, map));
                }
            }
            return c2;
        }
        return null;
    }
    
    private static OsObjectSchemaInfo M8() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmPrioritizedAttendance", false, 8, 0);
        final RealmFieldType integer = RealmFieldType.INTEGER;
        b.c("", "student", integer, false, false, true);
        b.c("", "periodId", integer, false, false, true);
        b.c("", "parallelPeriodId", integer, false, false, true);
        b.c("", "type", integer, false, false, true);
        b.c("", "subject", integer, false, false, true);
        final RealmFieldType list = RealmFieldType.LIST;
        b.b("", "teachers", list, "RealmLong");
        b.b("", "klassen", list, "RealmLong");
        b.b("", "rooms", list, "RealmLong");
        return b.e();
    }
    
    public static c N8(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final ArrayList<String> list = new ArrayList<String>(3);
        if (jsonObject.has("teachers")) {
            list.add("teachers");
        }
        if (jsonObject.has("klassen")) {
            list.add("klassen");
        }
        if (jsonObject.has("rooms")) {
            list.add("rooms");
        }
        final c c = f0.q1(c.class, true, list);
        if (jsonObject.has("student")) {
            if (jsonObject.isNull("student")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'student' to null.");
            }
            c.W0(jsonObject.getLong("student"));
        }
        if (jsonObject.has("periodId")) {
            if (jsonObject.isNull("periodId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'periodId' to null.");
            }
            c.y(jsonObject.getLong("periodId"));
        }
        if (jsonObject.has("parallelPeriodId")) {
            if (jsonObject.isNull("parallelPeriodId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'parallelPeriodId' to null.");
            }
            c.O6(jsonObject.getLong("parallelPeriodId"));
        }
        if (jsonObject.has("type")) {
            if (jsonObject.isNull("type")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'type' to null.");
            }
            c.q0(jsonObject.getInt("type"));
        }
        if (jsonObject.has("subject")) {
            if (jsonObject.isNull("subject")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'subject' to null.");
            }
            c.R0(jsonObject.getLong("subject"));
        }
        final boolean has = jsonObject.has("teachers");
        final int n = 0;
        if (has) {
            if (jsonObject.isNull("teachers")) {
                c.t0(null);
            }
            else {
                c.h0().clear();
                final JSONArray jsonArray = jsonObject.getJSONArray("teachers");
                for (int i = 0; i < jsonArray.length(); ++i) {
                    c.h0().add(z0.z8(f0, jsonArray.getJSONObject(i), b));
                }
            }
        }
        if (jsonObject.has("klassen")) {
            if (jsonObject.isNull("klassen")) {
                c.n1(null);
            }
            else {
                c.a1().clear();
                final JSONArray jsonArray2 = jsonObject.getJSONArray("klassen");
                for (int j = 0; j < jsonArray2.length(); ++j) {
                    c.a1().add(z0.z8(f0, jsonArray2.getJSONObject(j), b));
                }
            }
        }
        if (jsonObject.has("rooms")) {
            if (jsonObject.isNull("rooms")) {
                c.U(null);
            }
            else {
                c.Z().clear();
                final JSONArray jsonArray3 = jsonObject.getJSONArray("rooms");
                for (int k = n; k < jsonArray3.length(); ++k) {
                    c.Z().add(z0.z8(f0, jsonArray3.getJSONObject(k), b));
                }
            }
        }
        return c;
    }
    
    @TargetApi(11)
    public static c O8(final f0 f0, final JsonReader jsonReader) throws IOException {
        final c c = new c();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            if (nextName.equals("student")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'student' to null.");
                }
                c.W0(jsonReader.nextLong());
            }
            else if (nextName.equals("periodId")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'periodId' to null.");
                }
                c.y(jsonReader.nextLong());
            }
            else if (nextName.equals("parallelPeriodId")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'parallelPeriodId' to null.");
                }
                c.O6(jsonReader.nextLong());
            }
            else if (nextName.equals("type")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'type' to null.");
                }
                c.q0(jsonReader.nextInt());
            }
            else if (nextName.equals("subject")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'subject' to null.");
                }
                c.R0(jsonReader.nextLong());
            }
            else {
                if (nextName.equals("teachers")) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.skipValue();
                        c.t0(null);
                        continue;
                    }
                    c.t0(new l0<com.untis.mobile.persistence.realm.b>());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        c.h0().add(z0.A8(f0, jsonReader));
                    }
                }
                else if (nextName.equals("klassen")) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.skipValue();
                        c.n1(null);
                        continue;
                    }
                    c.n1(new l0<com.untis.mobile.persistence.realm.b>());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        c.a1().add(z0.A8(f0, jsonReader));
                    }
                }
                else {
                    if (!nextName.equals("rooms")) {
                        jsonReader.skipValue();
                        continue;
                    }
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.skipValue();
                        c.U(null);
                        continue;
                    }
                    c.U(new l0<com.untis.mobile.persistence.realm.b>());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        c.Z().add(z0.A8(f0, jsonReader));
                    }
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
        return f0.y0(c, new q[0]);
    }
    
    public static OsObjectSchemaInfo P8() {
        return j1.X;
    }
    
    public static String Q8() {
        return "RealmPrioritizedAttendance";
    }
    
    public static long R8(final f0 f0, final c c, final Map<n0, Long> map) {
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
        Table.nativeSetLong(nativePtr, b.e, row, c.d0(), false);
        Table.nativeSetLong(nativePtr, b.f, row, c.D(), false);
        Table.nativeSetLong(nativePtr, b.g, row, c.Q2(), false);
        Table.nativeSetLong(nativePtr, b.h, row, c.m0(), false);
        Table.nativeSetLong(nativePtr, b.i, row, c.K(), false);
        final l0<com.untis.mobile.persistence.realm.b> h0 = c.h0();
        if (h0 != null) {
            final OsList list = new OsList(x2.R(row), b.j);
            for (final com.untis.mobile.persistence.realm.b b2 : h0) {
                Long value;
                if ((value = map.get(b2)) == null) {
                    value = z0.D8(f0, b2, map);
                }
                list.l(value);
            }
        }
        final l0<com.untis.mobile.persistence.realm.b> a1 = c.a1();
        if (a1 != null) {
            final OsList list2 = new OsList(x2.R(row), b.k);
            for (final com.untis.mobile.persistence.realm.b b3 : a1) {
                Long value2;
                if ((value2 = map.get(b3)) == null) {
                    value2 = z0.D8(f0, b3, map);
                }
                list2.l(value2);
            }
        }
        final l0<com.untis.mobile.persistence.realm.b> z = c.Z();
        if (z != null) {
            final OsList list3 = new OsList(x2.R(row), b.l);
            for (final com.untis.mobile.persistence.realm.b b4 : z) {
                Long value3;
                if ((value3 = map.get(b4)) == null) {
                    value3 = z0.D8(f0, b4, map);
                }
                list3.l(value3);
            }
        }
        return row;
    }
    
    public static void S8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
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
            Table.nativeSetLong(nativePtr, b.e, row, c.d0(), false);
            Table.nativeSetLong(nativePtr, b.f, row, c.D(), false);
            Table.nativeSetLong(nativePtr, b.g, row, c.Q2(), false);
            Table.nativeSetLong(nativePtr, b.h, row, c.m0(), false);
            Table.nativeSetLong(nativePtr, b.i, row, c.K(), false);
            final l0<com.untis.mobile.persistence.realm.b> h0 = c.h0();
            if (h0 != null) {
                final OsList list = new OsList(x2.R(row), b.j);
                for (final com.untis.mobile.persistence.realm.b b2 : h0) {
                    Long value;
                    if ((value = map.get(b2)) == null) {
                        value = z0.D8(f0, b2, map);
                    }
                    list.l(value);
                }
            }
            final l0<com.untis.mobile.persistence.realm.b> a1 = c.a1();
            if (a1 != null) {
                final OsList list2 = new OsList(x2.R(row), b.k);
                for (final com.untis.mobile.persistence.realm.b b3 : a1) {
                    Long value2;
                    if ((value2 = map.get(b3)) == null) {
                        value2 = z0.D8(f0, b3, map);
                    }
                    list2.l(value2);
                }
            }
            final l0<com.untis.mobile.persistence.realm.b> z = c.Z();
            if (z == null) {
                continue;
            }
            final OsList list3 = new OsList(x2.R(row), b.l);
            for (final com.untis.mobile.persistence.realm.b b4 : z) {
                Long value3;
                if ((value3 = map.get(b4)) == null) {
                    value3 = z0.D8(f0, b4, map);
                }
                list3.l(value3);
            }
        }
    }
    
    public static long T8(final f0 f0, final c c, final Map<n0, Long> map) {
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
        Table.nativeSetLong(nativePtr, b.e, row, c.d0(), false);
        Table.nativeSetLong(nativePtr, b.f, row, c.D(), false);
        Table.nativeSetLong(nativePtr, b.g, row, c.Q2(), false);
        Table.nativeSetLong(nativePtr, b.h, row, c.m0(), false);
        Table.nativeSetLong(nativePtr, b.i, row, c.K(), false);
        final OsList list = new OsList(x2.R(row), b.j);
        final l0<com.untis.mobile.persistence.realm.b> h0 = c.h0();
        final int n = 0;
        if (h0 != null && h0.size() == list.b0()) {
            for (int size = h0.size(), i = 0; i < size; ++i) {
                final com.untis.mobile.persistence.realm.b b2 = h0.get(i);
                Long value;
                if ((value = map.get(b2)) == null) {
                    value = z0.F8(f0, b2, map);
                }
                list.Z(i, value);
            }
        }
        else {
            list.M();
            if (h0 != null) {
                for (final com.untis.mobile.persistence.realm.b b3 : h0) {
                    Long value2;
                    if ((value2 = map.get(b3)) == null) {
                        value2 = z0.F8(f0, b3, map);
                    }
                    list.l(value2);
                }
            }
        }
        final OsList list2 = new OsList(x2.R(row), b.k);
        final l0<com.untis.mobile.persistence.realm.b> a1 = c.a1();
        if (a1 != null && a1.size() == list2.b0()) {
            for (int size2 = a1.size(), j = 0; j < size2; ++j) {
                final com.untis.mobile.persistence.realm.b b4 = a1.get(j);
                Long value3;
                if ((value3 = map.get(b4)) == null) {
                    value3 = z0.F8(f0, b4, map);
                }
                list2.Z(j, value3);
            }
        }
        else {
            list2.M();
            if (a1 != null) {
                for (final com.untis.mobile.persistence.realm.b b5 : a1) {
                    Long value4;
                    if ((value4 = map.get(b5)) == null) {
                        value4 = z0.F8(f0, b5, map);
                    }
                    list2.l(value4);
                }
            }
        }
        final OsList list3 = new OsList(x2.R(row), b.l);
        final l0<com.untis.mobile.persistence.realm.b> z = c.Z();
        if (z != null && z.size() == list3.b0()) {
            for (int size3 = z.size(), k = n; k < size3; ++k) {
                final com.untis.mobile.persistence.realm.b b6 = z.get(k);
                Long value5;
                if ((value5 = map.get(b6)) == null) {
                    value5 = z0.F8(f0, b6, map);
                }
                list3.Z(k, value5);
            }
        }
        else {
            list3.M();
            if (z != null) {
                for (final com.untis.mobile.persistence.realm.b b7 : z) {
                    Long value6;
                    if ((value6 = map.get(b7)) == null) {
                        value6 = z0.F8(f0, b7, map);
                    }
                    list3.l(value6);
                }
            }
        }
        return row;
    }
    
    public static void U8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(c.class);
        long nativePtr = x2.getNativePtr();
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
            Table.nativeSetLong(nativePtr, b.e, row, c.d0(), false);
            Table.nativeSetLong(nativePtr, b.f, row, c.D(), false);
            Table.nativeSetLong(nativePtr, b.g, row, c.Q2(), false);
            Table.nativeSetLong(nativePtr, b.h, row, c.m0(), false);
            Table.nativeSetLong(nativePtr, b.i, row, c.K(), false);
            final OsList list = new OsList(x2.R(row), b.j);
            final l0<com.untis.mobile.persistence.realm.b> h0 = c.h0();
            if (h0 != null && h0.size() == list.b0()) {
                for (int size = h0.size(), i = 0; i < size; ++i) {
                    final com.untis.mobile.persistence.realm.b b2 = h0.get(i);
                    Long value;
                    if ((value = map.get(b2)) == null) {
                        value = z0.F8(f0, b2, map);
                    }
                    list.Z(i, value);
                }
            }
            else {
                list.M();
                if (h0 != null) {
                    for (final com.untis.mobile.persistence.realm.b b3 : h0) {
                        Long value2;
                        if ((value2 = map.get(b3)) == null) {
                            value2 = z0.F8(f0, b3, map);
                        }
                        list.l(value2);
                    }
                }
            }
            final OsList list2 = new OsList(x2.R(row), b.k);
            final l0<com.untis.mobile.persistence.realm.b> a1 = c.a1();
            if (a1 != null && a1.size() == list2.b0()) {
                for (int size2 = a1.size(), j = 0; j < size2; ++j) {
                    final com.untis.mobile.persistence.realm.b b4 = a1.get(j);
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
                if (a1 != null) {
                    final Iterator<com.untis.mobile.persistence.realm.b> iterator3 = a1.iterator();
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
            final OsList list3 = new OsList(x2.R(row), b.l);
            final l0<com.untis.mobile.persistence.realm.b> z = c.Z();
            if (z != null && z.size() == list3.b0()) {
                for (int size3 = z.size(), k = 0; k < size3; ++k) {
                    final com.untis.mobile.persistence.realm.b b6 = z.get(k);
                    Long value5;
                    if ((value5 = map.get(b6)) == null) {
                        value5 = z0.F8(f0, b6, map);
                    }
                    list3.Z(k, value5);
                }
            }
            else {
                list3.M();
                if (z == null) {
                    continue;
                }
                for (final com.untis.mobile.persistence.realm.b b7 : z) {
                    Long value6;
                    if ((value6 = map.get(b7)) == null) {
                        value6 = z0.F8(f0, b7, map);
                    }
                    list3.l(value6);
                }
            }
        }
    }
    
    static j1 V8(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(c.class), false, Collections.emptyList());
        final j1 j1 = new j1();
        h.a();
        return j1;
    }
    
    @Override
    public long D() {
        this.S.f().h();
        return this.S.g().m(this.R.f);
    }
    
    @Override
    public long K() {
        this.S.f().h();
        return this.S.g().m(this.R.i);
    }
    
    @Override
    public void O6(final long n) {
        if (!this.S.i()) {
            this.S.f().h();
            this.S.g().s(this.R.g, n);
            return;
        }
        if (!this.S.d()) {
            return;
        }
        final r g = this.S.g();
        g.g().q0(this.R.g, g.l0(), n, true);
    }
    
    @Override
    public long Q2() {
        this.S.f().h();
        return this.S.g().m(this.R.g);
    }
    
    @Override
    public void R0(final long n) {
        if (!this.S.i()) {
            this.S.f().h();
            this.S.g().s(this.R.i, n);
            return;
        }
        if (!this.S.d()) {
            return;
        }
        final r g = this.S.g();
        g.g().q0(this.R.i, g.l0(), n, true);
    }
    
    @Override
    public c0<?> S6() {
        return this.S;
    }
    
    @Override
    public void U(final l0<com.untis.mobile.persistence.realm.b> l0) {
        final boolean i = this.S.i();
        final int n = 0;
        int j = 0;
        l0<com.untis.mobile.persistence.realm.b> l2 = l0;
        if (i) {
            if (!this.S.d()) {
                return;
            }
            if (this.S.e().contains("rooms")) {
                return;
            }
            if ((l2 = l0) != null) {
                l2 = l0;
                if (!l0.G0()) {
                    final f0 f0 = (f0)this.S.f();
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
        this.S.f().h();
        final OsList p = this.S.g().p(this.R.l);
        if (l2 != null && l2.size() == p.b0()) {
            while (j < l2.size()) {
                final com.untis.mobile.persistence.realm.b b3 = l2.get(j);
                this.S.c(b3);
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
                this.S.c(b4);
                p.l(((p)b4).S6().g().l0());
            }
        }
    }
    
    @Override
    public void W0(final long n) {
        if (!this.S.i()) {
            this.S.f().h();
            this.S.g().s(this.R.e, n);
            return;
        }
        if (!this.S.d()) {
            return;
        }
        final r g = this.S.g();
        g.g().q0(this.R.e, g.l0(), n, true);
    }
    
    @Override
    public l0<com.untis.mobile.persistence.realm.b> Z() {
        this.S.f().h();
        final l0<com.untis.mobile.persistence.realm.b> v = this.V;
        if (v != null) {
            return v;
        }
        return this.V = new l0<com.untis.mobile.persistence.realm.b>(com.untis.mobile.persistence.realm.b.class, this.S.g().p(this.R.l), this.S.f());
    }
    
    @Override
    public l0<com.untis.mobile.persistence.realm.b> a1() {
        this.S.f().h();
        final l0<com.untis.mobile.persistence.realm.b> u = this.U;
        if (u != null) {
            return u;
        }
        return this.U = new l0<com.untis.mobile.persistence.realm.b>(com.untis.mobile.persistence.realm.b.class, this.S.g().p(this.R.k), this.S.f());
    }
    
    @Override
    public long d0() {
        this.S.f().h();
        return this.S.g().m(this.R.e);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final j1 j1 = (j1)o;
        final io.realm.a f = this.S.f();
        final io.realm.a f2 = j1.S.f();
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
        final String m = this.S.g().g().M();
        final String i = j1.S.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.S.g().l0() == j1.S.g().l0();
            }
        }
        else if (i == null) {
            return this.S.g().l0() == j1.S.g().l0();
        }
        return false;
    }
    
    @Override
    public l0<com.untis.mobile.persistence.realm.b> h0() {
        this.S.f().h();
        final l0<com.untis.mobile.persistence.realm.b> t = this.T;
        if (t != null) {
            return t;
        }
        return this.T = new l0<com.untis.mobile.persistence.realm.b>(com.untis.mobile.persistence.realm.b.class, this.S.g().p(this.R.j), this.S.f());
    }
    
    @Override
    public int hashCode() {
        final String path = this.S.f().getPath();
        final String m = this.S.g().g().M();
        final long l0 = this.S.g().l0();
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
    public int m0() {
        this.S.f().h();
        return (int)this.S.g().m(this.R.h);
    }
    
    @Override
    public void n1(final l0<com.untis.mobile.persistence.realm.b> l0) {
        final boolean i = this.S.i();
        final int n = 0;
        int j = 0;
        l0<com.untis.mobile.persistence.realm.b> l2 = l0;
        if (i) {
            if (!this.S.d()) {
                return;
            }
            if (this.S.e().contains("klassen")) {
                return;
            }
            if ((l2 = l0) != null) {
                l2 = l0;
                if (!l0.G0()) {
                    final f0 f0 = (f0)this.S.f();
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
        this.S.f().h();
        final OsList p = this.S.g().p(this.R.k);
        if (l2 != null && l2.size() == p.b0()) {
            while (j < l2.size()) {
                final com.untis.mobile.persistence.realm.b b3 = l2.get(j);
                this.S.c(b3);
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
                this.S.c(b4);
                p.l(((p)b4).S6().g().l0());
            }
        }
    }
    
    @Override
    public void q0(final int n) {
        if (!this.S.i()) {
            this.S.f().h();
            this.S.g().s(this.R.h, n);
            return;
        }
        if (!this.S.d()) {
            return;
        }
        final r g = this.S.g();
        g.g().q0(this.R.h, g.l0(), n, true);
    }
    
    @Override
    public void t0(final l0<com.untis.mobile.persistence.realm.b> l0) {
        final boolean i = this.S.i();
        final int n = 0;
        int j = 0;
        l0<com.untis.mobile.persistence.realm.b> l2 = l0;
        if (i) {
            if (!this.S.d()) {
                return;
            }
            if (this.S.e().contains("teachers")) {
                return;
            }
            if ((l2 = l0) != null) {
                l2 = l0;
                if (!l0.G0()) {
                    final f0 f0 = (f0)this.S.f();
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
        this.S.f().h();
        final OsList p = this.S.g().p(this.R.j);
        if (l2 != null && l2.size() == p.b0()) {
            while (j < l2.size()) {
                final com.untis.mobile.persistence.realm.b b3 = l2.get(j);
                this.S.c(b3);
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
                this.S.c(b4);
                p.l(((p)b4).S6().g().l0());
            }
        }
    }
    
    @Override
    public String toString() {
        if (!p0.k8(this)) {
            return "Invalid object";
        }
        final StringBuilder sb = new StringBuilder("RealmPrioritizedAttendance = proxy[");
        sb.append("{student:");
        sb.append(this.d0());
        sb.append("}");
        sb.append(",");
        sb.append("{periodId:");
        sb.append(this.D());
        sb.append("}");
        sb.append(",");
        sb.append("{parallelPeriodId:");
        sb.append(this.Q2());
        sb.append("}");
        sb.append(",");
        sb.append("{type:");
        sb.append(this.m0());
        sb.append("}");
        sb.append(",");
        sb.append("{subject:");
        sb.append(this.K());
        sb.append("}");
        sb.append(",");
        sb.append("{teachers:");
        sb.append("RealmList<RealmLong>[");
        sb.append(this.h0().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{klassen:");
        sb.append("RealmList<RealmLong>[");
        sb.append(this.a1().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{rooms:");
        sb.append("RealmList<RealmLong>[");
        sb.append(this.Z().size());
        sb.append("]");
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
    
    @Override
    public void y(final long n) {
        if (!this.S.i()) {
            this.S.f().h();
            this.S.g().s(this.R.f, n);
            return;
        }
        if (!this.S.d()) {
            return;
        }
        final r g = this.S.g();
        g.g().q0(this.R.f, g.l0(), n, true);
    }
    
    @Override
    public void y4() {
        if (this.S != null) {
            return;
        }
        final io.realm.a.h h = io.realm.a.W.get();
        this.R = (b)h.c();
        (this.S = new c0<c>(this)).r(h.e());
        this.S.s(h.f());
        this.S.o(h.b());
        this.S.q(h.d());
    }
    
    public static final class a
    {
        public static final String a = "RealmPrioritizedAttendance";
    }
    
    static final class b extends io.realm.internal.c
    {
        long e;
        long f;
        long g;
        long h;
        long i;
        long j;
        long k;
        long l;
        
        b(final OsSchemaInfo osSchemaInfo) {
            super(8);
            final OsObjectSchemaInfo b = osSchemaInfo.b("RealmPrioritizedAttendance");
            this.e = this.b("student", "student", b);
            this.f = this.b("periodId", "periodId", b);
            this.g = this.b("parallelPeriodId", "parallelPeriodId", b);
            this.h = this.b("type", "type", b);
            this.i = this.b("subject", "subject", b);
            this.j = this.b("teachers", "teachers", b);
            this.k = this.b("klassen", "klassen", b);
            this.l = this.b("rooms", "rooms", b);
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
            b2.g = b.g;
            b2.h = b.h;
            b2.i = b.i;
            b2.j = b.j;
            b2.k = b.k;
            b2.l = b.l;
        }
    }
}
