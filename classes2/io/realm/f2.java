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
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.p;
import m4.a;

public class f2 extends m4.a implements p, g2
{
    private static final String a0 = "";
    private static final OsObjectSchemaInfo b0;
    private b X;
    private c0<m4.a> Y;
    private l0<o4.a> Z;
    
    static {
        b0 = Z8();
    }
    
    f2() {
        this.Y.p();
    }
    
    public static m4.a V8(final f0 f0, final b b, final m4.a a, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        final f2 f2 = map.get(a);
        if (f2 != null) {
            return f2;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(m4.a.class), set);
        osObjectBuilder.L(b.e, a.a());
        osObjectBuilder.L(b.f, a.C());
        osObjectBuilder.L(b.g, a.d());
        osObjectBuilder.L(b.h, a.c());
        osObjectBuilder.d0(b.i, a.f());
        osObjectBuilder.d0(b.j, a.j0());
        osObjectBuilder.n(b.k, a.i0());
        osObjectBuilder.K(b.l, a.l());
        osObjectBuilder.L(b.m, a.o());
        osObjectBuilder.n(b.n, a.A());
        osObjectBuilder.K(b.o, a.J2());
        osObjectBuilder.n(b.q, a.g0());
        osObjectBuilder.L(b.r, a.D());
        final f2 i9 = i9(f0, osObjectBuilder.f0());
        map.put(a, i9);
        final l0<o4.a> e = a.E();
        if (e != null) {
            final l0<o4.a> e2 = i9.E();
            e2.clear();
            for (int j = 0; j < e.size(); ++j) {
                final o4.a a2 = e.get(j);
                o4.a z8 = (o4.a)map.get(a2);
                if (z8 == null) {
                    z8 = l2.z8(f0, (l2.b)f0.H().j(o4.a.class), a2, b2, map, set);
                }
                e2.add(z8);
            }
        }
        return i9;
    }
    
    public static m4.a W8(final f0 f0, final b b, final m4.a a, final boolean b2, final Map<n0, p> map, final Set<q> set) {
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
            return (m4.a)p7;
        }
        final p p8 = null;
        Object x2 = null;
        boolean b3 = false;
        Label_0233: {
            if (b2) {
                x2 = f0.x2(m4.a.class);
                final long r = ((Table)x2).r(b.e, a.a());
                if (r == -1L) {
                    b3 = false;
                    x2 = p8;
                    break Label_0233;
                }
                try {
                    h.g(f0, ((Table)x2).R(r), b, false, Collections.emptyList());
                    x2 = new f2();
                    map.put(a, (p)x2);
                }
                finally {
                    h.a();
                }
            }
            b3 = b2;
        }
        m4.a a2;
        if (b3) {
            a2 = j9(f0, b, (m4.a)x2, a, map, set);
        }
        else {
            a2 = V8(f0, b, a, b2, map, set);
        }
        return a2;
    }
    
    public static b X8(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static m4.a Y8(final m4.a a, final int a2, final int n, final Map<n0, p.a<n0>> map) {
        if (a2 <= n && a != null) {
            final p.a a3 = map.get(a);
            m4.a a4;
            if (a3 == null) {
                a4 = new m4.a();
                map.put(a, (p.a<n0>)new p.a(a2, a4));
            }
            else {
                if (a2 >= a3.a) {
                    return (m4.a)a3.b;
                }
                a4 = (m4.a)a3.b;
                a3.a = a2;
            }
            a4.b(a.a());
            a4.G(a.C());
            a4.h(a.d());
            a4.i(a.c());
            a4.j(a.f());
            a4.e0(a.j0());
            a4.c0(a.i0());
            a4.k(a.l());
            a4.p(a.o());
            a4.F(a.A());
            a4.w7(a.J2());
            if (a2 == n) {
                a4.B(null);
            }
            else {
                final l0<o4.a> e = a.E();
                final l0<o4.a> l0 = new l0<o4.a>();
                a4.B(l0);
                for (int size = e.size(), i = 0; i < size; ++i) {
                    l0.add(l2.B8(e.get(i), a2 + 1, n, map));
                }
            }
            a4.H6(a.g0());
            a4.y(a.D());
            return a4;
        }
        return null;
    }
    
    private static OsObjectSchemaInfo Z8() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmHomework", false, 14, 0);
        final RealmFieldType integer = RealmFieldType.INTEGER;
        b.c("", "id", integer, true, false, true);
        b.c("", "lessonId", integer, false, false, true);
        b.c("", "start", integer, false, false, true);
        b.c("", "end", integer, false, false, true);
        final RealmFieldType string = RealmFieldType.STRING;
        b.c("", "text", string, false, false, true);
        b.c("", "remark", string, false, false, true);
        final RealmFieldType boolean1 = RealmFieldType.BOOLEAN;
        b.c("", "completed", boolean1, false, false, true);
        b.c("", "entityType", integer, false, false, true);
        b.c("", "entityId", integer, false, false, true);
        b.c("", "synced", boolean1, false, false, true);
        b.c("", "status", integer, false, false, true);
        b.b("", "driveAttachments", RealmFieldType.LIST, "RealmDriveAttachment");
        b.c("", "local", boolean1, false, false, true);
        b.c("", "periodId", integer, false, false, true);
        return b.e();
    }
    
    public static m4.a a9(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final ArrayList<String> list = new ArrayList<String>(1);
        Object x2 = null;
        Label_0146: {
            if (b) {
                x2 = f0.x2(m4.a.class);
                final long e = ((b)f0.H().j(m4.a.class)).e;
                long r;
                if (!jsonObject.isNull("id")) {
                    r = ((Table)x2).r(e, jsonObject.getLong("id"));
                }
                else {
                    r = -1L;
                }
                if (r != -1L) {
                    final io.realm.a.h h = io.realm.a.W.get();
                    try {
                        h.g(f0, ((Table)x2).R(r), f0.H().j(m4.a.class), false, Collections.emptyList());
                        x2 = new f2();
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
            if (jsonObject.has("driveAttachments")) {
                list.add("driveAttachments");
            }
            if (!jsonObject.has("id")) {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
            f2 f2;
            if (jsonObject.isNull("id")) {
                f2 = f0.p1((Class<f2>)m4.a.class, null, true, list);
            }
            else {
                f2 = f0.p1((Class<f2>)m4.a.class, jsonObject.getLong("id"), true, list);
            }
            o = f2;
        }
        if (jsonObject.has("lessonId")) {
            if (jsonObject.isNull("lessonId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'lessonId' to null.");
            }
            ((g2)o).G(jsonObject.getLong("lessonId"));
        }
        if (jsonObject.has("start")) {
            if (jsonObject.isNull("start")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'start' to null.");
            }
            ((g2)o).h(jsonObject.getLong("start"));
        }
        if (jsonObject.has("end")) {
            if (jsonObject.isNull("end")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'end' to null.");
            }
            ((g2)o).i(jsonObject.getLong("end"));
        }
        if (jsonObject.has("text")) {
            if (jsonObject.isNull("text")) {
                ((g2)o).j(null);
            }
            else {
                ((g2)o).j(jsonObject.getString("text"));
            }
        }
        if (jsonObject.has("remark")) {
            if (jsonObject.isNull("remark")) {
                ((g2)o).e0(null);
            }
            else {
                ((g2)o).e0(jsonObject.getString("remark"));
            }
        }
        if (jsonObject.has("completed")) {
            if (jsonObject.isNull("completed")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'completed' to null.");
            }
            ((g2)o).c0(jsonObject.getBoolean("completed"));
        }
        if (jsonObject.has("entityType")) {
            if (jsonObject.isNull("entityType")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'entityType' to null.");
            }
            ((g2)o).k(jsonObject.getInt("entityType"));
        }
        if (jsonObject.has("entityId")) {
            if (jsonObject.isNull("entityId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'entityId' to null.");
            }
            ((g2)o).p(jsonObject.getLong("entityId"));
        }
        if (jsonObject.has("synced")) {
            if (jsonObject.isNull("synced")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'synced' to null.");
            }
            ((g2)o).F(jsonObject.getBoolean("synced"));
        }
        if (jsonObject.has("status")) {
            if (jsonObject.isNull("status")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'status' to null.");
            }
            ((g2)o).w7(jsonObject.getInt("status"));
        }
        if (jsonObject.has("driveAttachments")) {
            if (jsonObject.isNull("driveAttachments")) {
                ((g2)o).B(null);
            }
            else {
                ((g2)o).E().clear();
                final JSONArray jsonArray = jsonObject.getJSONArray("driveAttachments");
                for (int i = 0; i < jsonArray.length(); ++i) {
                    ((g2)o).E().add(l2.D8(f0, jsonArray.getJSONObject(i), b));
                }
            }
        }
        if (jsonObject.has("local")) {
            if (jsonObject.isNull("local")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'local' to null.");
            }
            ((g2)o).H6(jsonObject.getBoolean("local"));
        }
        if (jsonObject.has("periodId")) {
            if (jsonObject.isNull("periodId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'periodId' to null.");
            }
            ((g2)o).y(jsonObject.getLong("periodId"));
        }
        return (m4.a)o;
    }
    
    @TargetApi(11)
    public static m4.a b9(final f0 f0, final JsonReader jsonReader) throws IOException {
        final m4.a a = new m4.a();
        jsonReader.beginObject();
        boolean b = false;
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
                a.b(jsonReader.nextLong());
                b = true;
            }
            else if (nextName.equals("lessonId")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'lessonId' to null.");
                }
                a.G(jsonReader.nextLong());
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
            else if (nextName.equals("text")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    a.j(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    a.j(null);
                }
            }
            else if (nextName.equals("remark")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    a.e0(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    a.e0(null);
                }
            }
            else if (nextName.equals("completed")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'completed' to null.");
                }
                a.c0(jsonReader.nextBoolean());
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
            else if (nextName.equals("synced")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'synced' to null.");
                }
                a.F(jsonReader.nextBoolean());
            }
            else if (nextName.equals("status")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'status' to null.");
                }
                a.w7(jsonReader.nextInt());
            }
            else if (nextName.equals("driveAttachments")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    a.B(null);
                }
                else {
                    a.B(new l0<o4.a>());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        a.E().add(l2.E8(f0, jsonReader));
                    }
                    jsonReader.endArray();
                }
            }
            else if (nextName.equals("local")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'local' to null.");
                }
                a.H6(jsonReader.nextBoolean());
            }
            else if (nextName.equals("periodId")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'periodId' to null.");
                }
                a.y(jsonReader.nextLong());
            }
            else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (b) {
            return f0.G0(a, new q[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }
    
    public static OsObjectSchemaInfo c9() {
        return f2.b0;
    }
    
    public static String d9() {
        return "RealmHomework";
    }
    
    public static long e9(final f0 f0, final m4.a a, final Map<n0, Long> map) {
        if (a instanceof p && !p0.h8(a)) {
            final p p3 = (p)a;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(m4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(m4.a.class);
        final long e = b.e;
        final Long value = a.a();
        long l;
        if (value != null) {
            l = Table.nativeFindFirstInt(nativePtr, e, a.a());
        }
        else {
            l = -1L;
        }
        if (l == -1L) {
            l = OsObject.createRowWithPrimaryKey(x2, e, a.a());
        }
        else {
            Table.v0(value);
        }
        map.put(a, l);
        Table.nativeSetLong(nativePtr, b.f, l, a.C(), false);
        Table.nativeSetLong(nativePtr, b.g, l, a.d(), false);
        Table.nativeSetLong(nativePtr, b.h, l, a.c(), false);
        final String f2 = a.f();
        if (f2 != null) {
            Table.nativeSetString(nativePtr, b.i, l, f2, false);
        }
        final String j0 = a.j0();
        if (j0 != null) {
            Table.nativeSetString(nativePtr, b.j, l, j0, false);
        }
        Table.nativeSetBoolean(nativePtr, b.k, l, a.i0(), false);
        Table.nativeSetLong(nativePtr, b.l, l, a.l(), false);
        Table.nativeSetLong(nativePtr, b.m, l, a.o(), false);
        Table.nativeSetBoolean(nativePtr, b.n, l, a.A(), false);
        Table.nativeSetLong(nativePtr, b.o, l, a.J2(), false);
        final l0<o4.a> e2 = a.E();
        if (e2 != null) {
            final OsList list = new OsList(x2.R(l), b.p);
            for (final o4.a a2 : e2) {
                Long value2;
                if ((value2 = map.get(a2)) == null) {
                    value2 = l2.H8(f0, a2, map);
                }
                list.l(value2);
            }
        }
        Table.nativeSetBoolean(nativePtr, b.q, l, a.g0(), false);
        Table.nativeSetLong(nativePtr, b.r, l, a.D(), false);
        return l;
    }
    
    public static void f9(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(m4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(m4.a.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final m4.a a = (m4.a)iterator.next();
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
            final Long value = a.a();
            long l;
            if (value != null) {
                l = Table.nativeFindFirstInt(nativePtr, e, a.a());
            }
            else {
                l = -1L;
            }
            if (l == -1L) {
                l = OsObject.createRowWithPrimaryKey(x2, e, a.a());
            }
            else {
                Table.v0(value);
            }
            map.put(a, l);
            Table.nativeSetLong(nativePtr, b.f, l, a.C(), false);
            Table.nativeSetLong(nativePtr, b.g, l, a.d(), false);
            Table.nativeSetLong(nativePtr, b.h, l, a.c(), false);
            final String f2 = a.f();
            if (f2 != null) {
                Table.nativeSetString(nativePtr, b.i, l, f2, false);
            }
            final String j0 = a.j0();
            if (j0 != null) {
                Table.nativeSetString(nativePtr, b.j, l, j0, false);
            }
            Table.nativeSetBoolean(nativePtr, b.k, l, a.i0(), false);
            Table.nativeSetLong(nativePtr, b.l, l, a.l(), false);
            Table.nativeSetLong(nativePtr, b.m, l, a.o(), false);
            Table.nativeSetBoolean(nativePtr, b.n, l, a.A(), false);
            Table.nativeSetLong(nativePtr, b.o, l, a.J2(), false);
            final l0<o4.a> e2 = a.E();
            if (e2 != null) {
                final OsList list = new OsList(x2.R(l), b.p);
                for (final o4.a a2 : e2) {
                    Long value2;
                    if ((value2 = map.get(a2)) == null) {
                        value2 = l2.H8(f0, a2, map);
                    }
                    list.l(value2);
                }
            }
            Table.nativeSetBoolean(nativePtr, b.q, l, a.g0(), false);
            Table.nativeSetLong(nativePtr, b.r, l, a.D(), false);
        }
    }
    
    public static long g9(final f0 f0, final m4.a a, final Map<n0, Long> map) {
        if (a instanceof p && !p0.h8(a)) {
            final p p3 = (p)a;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(m4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(m4.a.class);
        final long e = b.e;
        long nativeFindFirstInt;
        if (Long.valueOf(a.a()) != null) {
            nativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, e, a.a());
        }
        else {
            nativeFindFirstInt = -1L;
        }
        long rowWithPrimaryKey = nativeFindFirstInt;
        if (nativeFindFirstInt == -1L) {
            rowWithPrimaryKey = OsObject.createRowWithPrimaryKey(x2, e, a.a());
        }
        map.put(a, rowWithPrimaryKey);
        Table.nativeSetLong(nativePtr, b.f, rowWithPrimaryKey, a.C(), false);
        Table.nativeSetLong(nativePtr, b.g, rowWithPrimaryKey, a.d(), false);
        Table.nativeSetLong(nativePtr, b.h, rowWithPrimaryKey, a.c(), false);
        final String f2 = a.f();
        final long i = b.i;
        if (f2 != null) {
            Table.nativeSetString(nativePtr, i, rowWithPrimaryKey, f2, false);
        }
        else {
            Table.nativeSetNull(nativePtr, i, rowWithPrimaryKey, false);
        }
        final String j0 = a.j0();
        final long k = b.j;
        if (j0 != null) {
            Table.nativeSetString(nativePtr, k, rowWithPrimaryKey, j0, false);
        }
        else {
            Table.nativeSetNull(nativePtr, k, rowWithPrimaryKey, false);
        }
        Table.nativeSetBoolean(nativePtr, b.k, rowWithPrimaryKey, a.i0(), false);
        Table.nativeSetLong(nativePtr, b.l, rowWithPrimaryKey, a.l(), false);
        Table.nativeSetLong(nativePtr, b.m, rowWithPrimaryKey, a.o(), false);
        Table.nativeSetBoolean(nativePtr, b.n, rowWithPrimaryKey, a.A(), false);
        Table.nativeSetLong(nativePtr, b.o, rowWithPrimaryKey, a.J2(), false);
        final OsList list = new OsList(x2.R(rowWithPrimaryKey), b.p);
        final l0<o4.a> e2 = a.E();
        if (e2 != null && e2.size() == list.b0()) {
            for (int size = e2.size(), l = 0; l < size; ++l) {
                final o4.a a2 = e2.get(l);
                Long value;
                if ((value = map.get(a2)) == null) {
                    value = l2.J8(f0, a2, map);
                }
                list.Z(l, value);
            }
        }
        else {
            list.M();
            if (e2 != null) {
                for (final o4.a a3 : e2) {
                    Long value2;
                    if ((value2 = map.get(a3)) == null) {
                        value2 = l2.J8(f0, a3, map);
                    }
                    list.l(value2);
                }
            }
        }
        Table.nativeSetBoolean(nativePtr, b.q, rowWithPrimaryKey, a.g0(), false);
        Table.nativeSetLong(nativePtr, b.r, rowWithPrimaryKey, a.D(), false);
        return rowWithPrimaryKey;
    }
    
    public static void h9(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(m4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(m4.a.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final m4.a a = (m4.a)iterator.next();
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
            if (Long.valueOf(a.a()) != null) {
                nativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, e, a.a());
            }
            else {
                nativeFindFirstInt = -1L;
            }
            long rowWithPrimaryKey = nativeFindFirstInt;
            if (nativeFindFirstInt == -1L) {
                rowWithPrimaryKey = OsObject.createRowWithPrimaryKey(x2, e, a.a());
            }
            map.put(a, rowWithPrimaryKey);
            Table.nativeSetLong(nativePtr, b.f, rowWithPrimaryKey, a.C(), false);
            Table.nativeSetLong(nativePtr, b.g, rowWithPrimaryKey, a.d(), false);
            Table.nativeSetLong(nativePtr, b.h, rowWithPrimaryKey, a.c(), false);
            final String f2 = a.f();
            final long i = b.i;
            if (f2 != null) {
                Table.nativeSetString(nativePtr, i, rowWithPrimaryKey, f2, false);
            }
            else {
                Table.nativeSetNull(nativePtr, i, rowWithPrimaryKey, false);
            }
            final String j0 = a.j0();
            final long k = b.j;
            if (j0 != null) {
                Table.nativeSetString(nativePtr, k, rowWithPrimaryKey, j0, false);
            }
            else {
                Table.nativeSetNull(nativePtr, k, rowWithPrimaryKey, false);
            }
            Table.nativeSetBoolean(nativePtr, b.k, rowWithPrimaryKey, a.i0(), false);
            Table.nativeSetLong(nativePtr, b.l, rowWithPrimaryKey, a.l(), false);
            Table.nativeSetLong(nativePtr, b.m, rowWithPrimaryKey, a.o(), false);
            Table.nativeSetBoolean(nativePtr, b.n, rowWithPrimaryKey, a.A(), false);
            Table.nativeSetLong(nativePtr, b.o, rowWithPrimaryKey, a.J2(), false);
            final OsList list = new OsList(x2.R(rowWithPrimaryKey), b.p);
            final l0<o4.a> e2 = a.E();
            long n;
            if (e2 != null && e2.size() == list.b0()) {
                for (int size = e2.size(), l = 0; l < size; ++l) {
                    final o4.a a2 = e2.get(l);
                    Long value;
                    if ((value = map.get(a2)) == null) {
                        value = l2.J8(f0, a2, map);
                    }
                    list.Z(l, value);
                }
                n = rowWithPrimaryKey;
            }
            else {
                list.M();
                n = rowWithPrimaryKey;
                if (e2 != null) {
                    final Iterator<o4.a> iterator2 = e2.iterator();
                    while (true) {
                        n = rowWithPrimaryKey;
                        if (!iterator2.hasNext()) {
                            break;
                        }
                        final o4.a a3 = iterator2.next();
                        Long value2;
                        if ((value2 = map.get(a3)) == null) {
                            value2 = l2.J8(f0, a3, map);
                        }
                        list.l(value2);
                    }
                }
            }
            Table.nativeSetBoolean(nativePtr, b.q, n, a.g0(), false);
            Table.nativeSetLong(nativePtr, b.r, n, a.D(), false);
        }
    }
    
    static f2 i9(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(m4.a.class), false, Collections.emptyList());
        final f2 f2 = new f2();
        h.a();
        return f2;
    }
    
    static m4.a j9(final f0 f0, final b b, final m4.a a, final m4.a a2, final Map<n0, p> map, final Set<q> set) {
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(m4.a.class), set);
        osObjectBuilder.L(b.e, a2.a());
        osObjectBuilder.L(b.f, a2.C());
        osObjectBuilder.L(b.g, a2.d());
        osObjectBuilder.L(b.h, a2.c());
        osObjectBuilder.d0(b.i, a2.f());
        osObjectBuilder.d0(b.j, a2.j0());
        osObjectBuilder.n(b.k, a2.i0());
        osObjectBuilder.K(b.l, a2.l());
        osObjectBuilder.L(b.m, a2.o());
        osObjectBuilder.n(b.n, a2.A());
        osObjectBuilder.K(b.o, a2.J2());
        final l0<o4.a> e = a2.E();
        if (e != null) {
            final l0<n0> l0 = new l0<n0>();
            for (int i = 0; i < e.size(); ++i) {
                final o4.a a3 = e.get(i);
                o4.a z8 = (o4.a)map.get(a3);
                if (z8 == null) {
                    z8 = l2.z8(f0, (l2.b)f0.H().j(o4.a.class), a3, true, map, set);
                }
                l0.add(z8);
            }
            osObjectBuilder.Z(b.p, l0);
        }
        else {
            osObjectBuilder.Z(b.p, new l0<n0>());
        }
        osObjectBuilder.n(b.q, a2.g0());
        osObjectBuilder.L(b.r, a2.D());
        osObjectBuilder.i0();
        return a;
    }
    
    @Override
    public boolean A() {
        this.Y.f().h();
        return this.Y.g().l(this.X.n);
    }
    
    @Override
    public void B(final l0<o4.a> l0) {
        final boolean i = this.Y.i();
        final int n = 0;
        int j = 0;
        l0<o4.a> l2 = l0;
        if (i) {
            if (!this.Y.d()) {
                return;
            }
            if (this.Y.e().contains("driveAttachments")) {
                return;
            }
            if ((l2 = l0) != null) {
                l2 = l0;
                if (!l0.G0()) {
                    final f0 f0 = (f0)this.Y.f();
                    l2 = new l0<o4.a>();
                    for (final o4.a a : l0) {
                        o4.a a2;
                        if ((a2 = a) != null) {
                            if (p0.j8(a)) {
                                a2 = a;
                            }
                            else {
                                a2 = f0.G0(a, new q[0]);
                            }
                        }
                        l2.add(a2);
                    }
                }
            }
        }
        this.Y.f().h();
        final OsList p = this.Y.g().p(this.X.p);
        if (l2 != null && l2.size() == p.b0()) {
            while (j < l2.size()) {
                final o4.a a3 = l2.get(j);
                this.Y.c(a3);
                p.Z(j, ((p)a3).S6().g().l0());
                ++j;
            }
        }
        else {
            p.M();
            if (l2 == null) {
                return;
            }
            for (int size = l2.size(), k = n; k < size; ++k) {
                final o4.a a4 = l2.get(k);
                this.Y.c(a4);
                p.l(((p)a4).S6().g().l0());
            }
        }
    }
    
    @Override
    public long C() {
        this.Y.f().h();
        return this.Y.g().m(this.X.f);
    }
    
    @Override
    public long D() {
        this.Y.f().h();
        return this.Y.g().m(this.X.r);
    }
    
    @Override
    public l0<o4.a> E() {
        this.Y.f().h();
        final l0<o4.a> z = this.Z;
        if (z != null) {
            return z;
        }
        return this.Z = new l0<o4.a>(o4.a.class, this.Y.g().p(this.X.p), this.Y.f());
    }
    
    @Override
    public void F(final boolean b) {
        if (!this.Y.i()) {
            this.Y.f().h();
            this.Y.g().i(this.X.n, b);
            return;
        }
        if (!this.Y.d()) {
            return;
        }
        final r g = this.Y.g();
        g.g().j0(this.X.n, g.l0(), b, true);
    }
    
    @Override
    public void G(final long n) {
        if (!this.Y.i()) {
            this.Y.f().h();
            this.Y.g().s(this.X.f, n);
            return;
        }
        if (!this.Y.d()) {
            return;
        }
        final r g = this.Y.g();
        g.g().q0(this.X.f, g.l0(), n, true);
    }
    
    @Override
    public void H6(final boolean b) {
        if (!this.Y.i()) {
            this.Y.f().h();
            this.Y.g().i(this.X.q, b);
            return;
        }
        if (!this.Y.d()) {
            return;
        }
        final r g = this.Y.g();
        g.g().j0(this.X.q, g.l0(), b, true);
    }
    
    @Override
    public int J2() {
        this.Y.f().h();
        return (int)this.Y.g().m(this.X.o);
    }
    
    @Override
    public c0<?> S6() {
        return this.Y;
    }
    
    @Override
    public long a() {
        this.Y.f().h();
        return this.Y.g().m(this.X.e);
    }
    
    @Override
    public void b(final long n) {
        if (this.Y.i()) {
            return;
        }
        this.Y.f().h();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }
    
    @Override
    public long c() {
        this.Y.f().h();
        return this.Y.g().m(this.X.h);
    }
    
    @Override
    public void c0(final boolean b) {
        if (!this.Y.i()) {
            this.Y.f().h();
            this.Y.g().i(this.X.k, b);
            return;
        }
        if (!this.Y.d()) {
            return;
        }
        final r g = this.Y.g();
        g.g().j0(this.X.k, g.l0(), b, true);
    }
    
    @Override
    public long d() {
        this.Y.f().h();
        return this.Y.g().m(this.X.g);
    }
    
    @Override
    public void e0(final String s) {
        if (this.Y.i()) {
            if (!this.Y.d()) {
                return;
            }
            final r g = this.Y.g();
            if (s != null) {
                g.g().t0(this.X.j, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'remark' to null.");
        }
        else {
            this.Y.f().h();
            if (s != null) {
                this.Y.g().d(this.X.j, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'remark' to null.");
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
        final f2 f2 = (f2)o;
        final io.realm.a f3 = this.Y.f();
        final io.realm.a f4 = f2.Y.f();
        final String path = f3.getPath();
        final String path2 = f4.getPath();
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
        if (f3.N() != f4.N()) {
            return false;
        }
        if (!f3.K.getVersionID().equals(f4.K.getVersionID())) {
            return false;
        }
        final String m = this.Y.g().g().M();
        final String i = f2.Y.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.Y.g().l0() == f2.Y.g().l0();
            }
        }
        else if (i == null) {
            return this.Y.g().l0() == f2.Y.g().l0();
        }
        return false;
    }
    
    @Override
    public String f() {
        this.Y.f().h();
        return this.Y.g().U(this.X.i);
    }
    
    @Override
    public boolean g0() {
        this.Y.f().h();
        return this.Y.g().l(this.X.q);
    }
    
    @Override
    public void h(final long n) {
        if (!this.Y.i()) {
            this.Y.f().h();
            this.Y.g().s(this.X.g, n);
            return;
        }
        if (!this.Y.d()) {
            return;
        }
        final r g = this.Y.g();
        g.g().q0(this.X.g, g.l0(), n, true);
    }
    
    @Override
    public int hashCode() {
        final String path = this.Y.f().getPath();
        final String m = this.Y.g().g().M();
        final long l0 = this.Y.g().l0();
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
        if (!this.Y.i()) {
            this.Y.f().h();
            this.Y.g().s(this.X.h, n);
            return;
        }
        if (!this.Y.d()) {
            return;
        }
        final r g = this.Y.g();
        g.g().q0(this.X.h, g.l0(), n, true);
    }
    
    @Override
    public boolean i0() {
        this.Y.f().h();
        return this.Y.g().l(this.X.k);
    }
    
    @Override
    public void j(final String s) {
        if (this.Y.i()) {
            if (!this.Y.d()) {
                return;
            }
            final r g = this.Y.g();
            if (s != null) {
                g.g().t0(this.X.i, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'text' to null.");
        }
        else {
            this.Y.f().h();
            if (s != null) {
                this.Y.g().d(this.X.i, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'text' to null.");
        }
    }
    
    @Override
    public String j0() {
        this.Y.f().h();
        return this.Y.g().U(this.X.j);
    }
    
    @Override
    public void k(final int n) {
        if (!this.Y.i()) {
            this.Y.f().h();
            this.Y.g().s(this.X.l, n);
            return;
        }
        if (!this.Y.d()) {
            return;
        }
        final r g = this.Y.g();
        g.g().q0(this.X.l, g.l0(), n, true);
    }
    
    @Override
    public int l() {
        this.Y.f().h();
        return (int)this.Y.g().m(this.X.l);
    }
    
    @Override
    public long o() {
        this.Y.f().h();
        return this.Y.g().m(this.X.m);
    }
    
    @Override
    public void p(final long n) {
        if (!this.Y.i()) {
            this.Y.f().h();
            this.Y.g().s(this.X.m, n);
            return;
        }
        if (!this.Y.d()) {
            return;
        }
        final r g = this.Y.g();
        g.g().q0(this.X.m, g.l0(), n, true);
    }
    
    @Override
    public String toString() {
        if (!p0.k8(this)) {
            return "Invalid object";
        }
        final StringBuilder sb = new StringBuilder("RealmHomework = proxy[");
        sb.append("{id:");
        sb.append(this.a());
        sb.append("}");
        sb.append(",");
        sb.append("{lessonId:");
        sb.append(this.C());
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
        sb.append("{text:");
        sb.append(this.f());
        sb.append("}");
        sb.append(",");
        sb.append("{remark:");
        sb.append(this.j0());
        sb.append("}");
        sb.append(",");
        sb.append("{completed:");
        sb.append(this.i0());
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
        sb.append("{synced:");
        sb.append(this.A());
        sb.append("}");
        sb.append(",");
        sb.append("{status:");
        sb.append(this.J2());
        sb.append("}");
        sb.append(",");
        sb.append("{driveAttachments:");
        sb.append("RealmList<RealmDriveAttachment>[");
        sb.append(this.E().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{local:");
        sb.append(this.g0());
        sb.append("}");
        sb.append(",");
        sb.append("{periodId:");
        sb.append(this.D());
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
    
    @Override
    public void w7(final int n) {
        if (!this.Y.i()) {
            this.Y.f().h();
            this.Y.g().s(this.X.o, n);
            return;
        }
        if (!this.Y.d()) {
            return;
        }
        final r g = this.Y.g();
        g.g().q0(this.X.o, g.l0(), n, true);
    }
    
    @Override
    public void y(final long n) {
        if (!this.Y.i()) {
            this.Y.f().h();
            this.Y.g().s(this.X.r, n);
            return;
        }
        if (!this.Y.d()) {
            return;
        }
        final r g = this.Y.g();
        g.g().q0(this.X.r, g.l0(), n, true);
    }
    
    @Override
    public void y4() {
        if (this.Y != null) {
            return;
        }
        final io.realm.a.h h = io.realm.a.W.get();
        this.X = (b)h.c();
        (this.Y = new c0<m4.a>(this)).r(h.e());
        this.Y.s(h.f());
        this.Y.o(h.b());
        this.Y.q(h.d());
    }
    
    public static final class a
    {
        public static final String a = "RealmHomework";
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
        
        b(final OsSchemaInfo osSchemaInfo) {
            super(14);
            final OsObjectSchemaInfo b = osSchemaInfo.b("RealmHomework");
            this.e = this.b("id", "id", b);
            this.f = this.b("lessonId", "lessonId", b);
            this.g = this.b("start", "start", b);
            this.h = this.b("end", "end", b);
            this.i = this.b("text", "text", b);
            this.j = this.b("remark", "remark", b);
            this.k = this.b("completed", "completed", b);
            this.l = this.b("entityType", "entityType", b);
            this.m = this.b("entityId", "entityId", b);
            this.n = this.b("synced", "synced", b);
            this.o = this.b("status", "status", b);
            this.p = this.b("driveAttachments", "driveAttachments", b);
            this.q = this.b("local", "local", b);
            this.r = this.b("periodId", "periodId", b);
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
        }
    }
}
