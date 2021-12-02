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
import s4.a;

public class d3 extends s4.a implements p, e3
{
    private static final String X = "";
    private static final OsObjectSchemaInfo Y;
    private b U;
    private c0<s4.a> V;
    private l0<o4.a> W;
    
    static {
        Y = S8();
    }
    
    d3() {
        this.V.p();
    }
    
    public static s4.a O8(final f0 f0, final b b, final s4.a a, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        final d3 d3 = map.get(a);
        if (d3 != null) {
            return d3;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(s4.a.class), set);
        osObjectBuilder.L(b.e, a.z());
        osObjectBuilder.L(b.f, a.a());
        osObjectBuilder.L(b.g, a.C());
        osObjectBuilder.d0(b.h, a.d());
        osObjectBuilder.d0(b.i, a.c());
        osObjectBuilder.d0(b.j, a.f());
        osObjectBuilder.d0(b.k, a.j0());
        osObjectBuilder.n(b.l, a.i0());
        osObjectBuilder.K(b.m, a.l());
        osObjectBuilder.L(b.n, a.o());
        final d3 b3 = b9(f0, osObjectBuilder.f0());
        map.put(a, b3);
        final l0<o4.a> e = a.E();
        if (e != null) {
            final l0<o4.a> e2 = b3.E();
            e2.clear();
            for (int i = 0; i < e.size(); ++i) {
                final o4.a a2 = e.get(i);
                o4.a z8 = (o4.a)map.get(a2);
                if (z8 == null) {
                    z8 = l2.z8(f0, (l2.b)f0.H().j(o4.a.class), a2, b2, map, set);
                }
                e2.add(z8);
            }
        }
        return b3;
    }
    
    public static s4.a P8(final f0 f0, final b b, final s4.a a, final boolean b2, final Map<n0, p> map, final Set<q> set) {
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
            return (s4.a)p7;
        }
        final p p8 = null;
        Object x2 = null;
        boolean b3 = false;
        Label_0232: {
            if (b2) {
                x2 = f0.x2(s4.a.class);
                final long r = ((Table)x2).r(b.e, a.z());
                if (r == -1L) {
                    b3 = false;
                    x2 = p8;
                    break Label_0232;
                }
                try {
                    h.g(f0, ((Table)x2).R(r), b, false, Collections.emptyList());
                    x2 = new d3();
                    map.put(a, (p)x2);
                }
                finally {
                    h.a();
                }
            }
            b3 = b2;
        }
        s4.a a2;
        if (b3) {
            a2 = c9(f0, b, (s4.a)x2, a, map, set);
        }
        else {
            a2 = O8(f0, b, a, b2, map, set);
        }
        return a2;
    }
    
    public static b Q8(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static s4.a R8(final s4.a a, final int a2, final int n, final Map<n0, p.a<n0>> map) {
        if (a2 <= n && a != null) {
            final p.a a3 = map.get(a);
            s4.a a4;
            if (a3 == null) {
                a4 = new s4.a();
                map.put(a, (p.a<n0>)new p.a(a2, a4));
            }
            else {
                if (a2 >= a3.a) {
                    return (s4.a)a3.b;
                }
                a4 = (s4.a)a3.b;
                a3.a = a2;
            }
            a4.f0(a.z());
            a4.b(a.a());
            a4.G(a.C());
            a4.v(a.d());
            a4.x(a.c());
            a4.j(a.f());
            a4.e0(a.j0());
            a4.c0(a.i0());
            a4.k(a.l());
            a4.p(a.o());
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
            return a4;
        }
        return null;
    }
    
    private static OsObjectSchemaInfo S8() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmInfoCenterHomework", false, 11, 0);
        final RealmFieldType integer = RealmFieldType.INTEGER;
        b.c("", "key", integer, true, false, true);
        b.c("", "id", integer, false, false, true);
        b.c("", "lessonId", integer, false, false, true);
        final RealmFieldType string = RealmFieldType.STRING;
        b.c("", "start", string, false, false, true);
        b.c("", "end", string, false, false, true);
        b.c("", "text", string, false, false, true);
        b.c("", "remark", string, false, false, true);
        b.c("", "completed", RealmFieldType.BOOLEAN, false, false, true);
        b.c("", "entityType", integer, false, false, true);
        b.c("", "entityId", integer, false, false, true);
        b.b("", "driveAttachments", RealmFieldType.LIST, "RealmDriveAttachment");
        return b.e();
    }
    
    public static s4.a T8(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final ArrayList<String> list = new ArrayList<String>(1);
        Object x2 = null;
        Label_0146: {
            if (b) {
                x2 = f0.x2(s4.a.class);
                final long e = ((b)f0.H().j(s4.a.class)).e;
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
                        h.g(f0, ((Table)x2).R(r), f0.H().j(s4.a.class), false, Collections.emptyList());
                        x2 = new d3();
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
            if (!jsonObject.has("key")) {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'key'.");
            }
            d3 d3;
            if (jsonObject.isNull("key")) {
                d3 = f0.p1((Class<d3>)s4.a.class, null, true, list);
            }
            else {
                d3 = f0.p1((Class<d3>)s4.a.class, jsonObject.getLong("key"), true, list);
            }
            o = d3;
        }
        if (jsonObject.has("id")) {
            if (jsonObject.isNull("id")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
            }
            ((e3)o).b(jsonObject.getLong("id"));
        }
        if (jsonObject.has("lessonId")) {
            if (jsonObject.isNull("lessonId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'lessonId' to null.");
            }
            ((e3)o).G(jsonObject.getLong("lessonId"));
        }
        if (jsonObject.has("start")) {
            if (jsonObject.isNull("start")) {
                ((e3)o).v(null);
            }
            else {
                ((e3)o).v(jsonObject.getString("start"));
            }
        }
        if (jsonObject.has("end")) {
            if (jsonObject.isNull("end")) {
                ((e3)o).x(null);
            }
            else {
                ((e3)o).x(jsonObject.getString("end"));
            }
        }
        if (jsonObject.has("text")) {
            if (jsonObject.isNull("text")) {
                ((e3)o).j(null);
            }
            else {
                ((e3)o).j(jsonObject.getString("text"));
            }
        }
        if (jsonObject.has("remark")) {
            if (jsonObject.isNull("remark")) {
                ((e3)o).e0(null);
            }
            else {
                ((e3)o).e0(jsonObject.getString("remark"));
            }
        }
        if (jsonObject.has("completed")) {
            if (jsonObject.isNull("completed")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'completed' to null.");
            }
            ((e3)o).c0(jsonObject.getBoolean("completed"));
        }
        if (jsonObject.has("entityType")) {
            if (jsonObject.isNull("entityType")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'entityType' to null.");
            }
            ((e3)o).k(jsonObject.getInt("entityType"));
        }
        if (jsonObject.has("entityId")) {
            if (jsonObject.isNull("entityId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'entityId' to null.");
            }
            ((e3)o).p(jsonObject.getLong("entityId"));
        }
        if (jsonObject.has("driveAttachments")) {
            if (jsonObject.isNull("driveAttachments")) {
                ((e3)o).B(null);
            }
            else {
                ((e3)o).E().clear();
                final JSONArray jsonArray = jsonObject.getJSONArray("driveAttachments");
                for (int i = 0; i < jsonArray.length(); ++i) {
                    ((e3)o).E().add(l2.D8(f0, jsonArray.getJSONObject(i), b));
                }
            }
        }
        return (s4.a)o;
    }
    
    @TargetApi(11)
    public static s4.a U8(final f0 f0, final JsonReader jsonReader) throws IOException {
        final s4.a a = new s4.a();
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
            else if (nextName.equals("lessonId")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'lessonId' to null.");
                }
                a.G(jsonReader.nextLong());
            }
            else if (nextName.equals("start")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    a.v(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    a.v(null);
                }
            }
            else if (nextName.equals("end")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    a.x(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    a.x(null);
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
            else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (b) {
            return f0.G0(a, new q[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'key'.");
    }
    
    public static OsObjectSchemaInfo V8() {
        return d3.Y;
    }
    
    public static String W8() {
        return "RealmInfoCenterHomework";
    }
    
    public static long X8(final f0 f0, final s4.a a, final Map<n0, Long> map) {
        if (a instanceof p && !p0.h8(a)) {
            final p p3 = (p)a;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(s4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(s4.a.class);
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
        Table.nativeSetLong(nativePtr, b.g, l, a.C(), false);
        final String d = a.d();
        if (d != null) {
            Table.nativeSetString(nativePtr, b.h, l, d, false);
        }
        final String c = a.c();
        if (c != null) {
            Table.nativeSetString(nativePtr, b.i, l, c, false);
        }
        final String f2 = a.f();
        if (f2 != null) {
            Table.nativeSetString(nativePtr, b.j, l, f2, false);
        }
        final String j0 = a.j0();
        if (j0 != null) {
            Table.nativeSetString(nativePtr, b.k, l, j0, false);
        }
        Table.nativeSetBoolean(nativePtr, b.l, l, a.i0(), false);
        Table.nativeSetLong(nativePtr, b.m, l, a.l(), false);
        Table.nativeSetLong(nativePtr, b.n, l, a.o(), false);
        final l0<o4.a> e2 = a.E();
        if (e2 != null) {
            final OsList list = new OsList(x2.R(l), b.o);
            for (final o4.a a2 : e2) {
                Long value2;
                if ((value2 = map.get(a2)) == null) {
                    value2 = l2.H8(f0, a2, map);
                }
                list.l(value2);
            }
        }
        return l;
    }
    
    public static void Y8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(s4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(s4.a.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final s4.a a = (s4.a)iterator.next();
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
            Table.nativeSetLong(nativePtr, b.g, l, a.C(), false);
            final String d = a.d();
            if (d != null) {
                Table.nativeSetString(nativePtr, b.h, l, d, false);
            }
            final String c = a.c();
            if (c != null) {
                Table.nativeSetString(nativePtr, b.i, l, c, false);
            }
            final String f2 = a.f();
            if (f2 != null) {
                Table.nativeSetString(nativePtr, b.j, l, f2, false);
            }
            final String j0 = a.j0();
            if (j0 != null) {
                Table.nativeSetString(nativePtr, b.k, l, j0, false);
            }
            Table.nativeSetBoolean(nativePtr, b.l, l, a.i0(), false);
            Table.nativeSetLong(nativePtr, b.m, l, a.l(), false);
            Table.nativeSetLong(nativePtr, b.n, l, a.o(), false);
            final l0<o4.a> e2 = a.E();
            if (e2 == null) {
                continue;
            }
            final OsList list = new OsList(x2.R(l), b.o);
            for (final o4.a a2 : e2) {
                Long value2;
                if ((value2 = map.get(a2)) == null) {
                    value2 = l2.H8(f0, a2, map);
                }
                list.l(value2);
            }
        }
    }
    
    public static long Z8(final f0 f0, final s4.a a, final Map<n0, Long> map) {
        if (a instanceof p && !p0.h8(a)) {
            final p p3 = (p)a;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(s4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(s4.a.class);
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
        Table.nativeSetLong(nativePtr, b.g, rowWithPrimaryKey, a.C(), false);
        final String d = a.d();
        final long h = b.h;
        if (d != null) {
            Table.nativeSetString(nativePtr, h, rowWithPrimaryKey, d, false);
        }
        else {
            Table.nativeSetNull(nativePtr, h, rowWithPrimaryKey, false);
        }
        final String c = a.c();
        final long i = b.i;
        if (c != null) {
            Table.nativeSetString(nativePtr, i, rowWithPrimaryKey, c, false);
        }
        else {
            Table.nativeSetNull(nativePtr, i, rowWithPrimaryKey, false);
        }
        final String f2 = a.f();
        final long j = b.j;
        if (f2 != null) {
            Table.nativeSetString(nativePtr, j, rowWithPrimaryKey, f2, false);
        }
        else {
            Table.nativeSetNull(nativePtr, j, rowWithPrimaryKey, false);
        }
        final String j2 = a.j0();
        final long k = b.k;
        if (j2 != null) {
            Table.nativeSetString(nativePtr, k, rowWithPrimaryKey, j2, false);
        }
        else {
            Table.nativeSetNull(nativePtr, k, rowWithPrimaryKey, false);
        }
        Table.nativeSetBoolean(nativePtr, b.l, rowWithPrimaryKey, a.i0(), false);
        Table.nativeSetLong(nativePtr, b.m, rowWithPrimaryKey, a.l(), false);
        Table.nativeSetLong(nativePtr, b.n, rowWithPrimaryKey, a.o(), false);
        final OsList list = new OsList(x2.R(rowWithPrimaryKey), b.o);
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
        return rowWithPrimaryKey;
    }
    
    public static void a9(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(s4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(s4.a.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final s4.a a = (s4.a)iterator.next();
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
            Table.nativeSetLong(nativePtr, b.g, rowWithPrimaryKey, a.C(), false);
            final String d = a.d();
            final long h = b.h;
            if (d != null) {
                Table.nativeSetString(nativePtr, h, rowWithPrimaryKey, d, false);
            }
            else {
                Table.nativeSetNull(nativePtr, h, rowWithPrimaryKey, false);
            }
            final String c = a.c();
            final long i = b.i;
            if (c != null) {
                Table.nativeSetString(nativePtr, i, rowWithPrimaryKey, c, false);
            }
            else {
                Table.nativeSetNull(nativePtr, i, rowWithPrimaryKey, false);
            }
            final String f2 = a.f();
            final long j = b.j;
            if (f2 != null) {
                Table.nativeSetString(nativePtr, j, rowWithPrimaryKey, f2, false);
            }
            else {
                Table.nativeSetNull(nativePtr, j, rowWithPrimaryKey, false);
            }
            final String j2 = a.j0();
            final long k = b.k;
            if (j2 != null) {
                Table.nativeSetString(nativePtr, k, rowWithPrimaryKey, j2, false);
            }
            else {
                Table.nativeSetNull(nativePtr, k, rowWithPrimaryKey, false);
            }
            Table.nativeSetBoolean(nativePtr, b.l, rowWithPrimaryKey, a.i0(), false);
            Table.nativeSetLong(nativePtr, b.m, rowWithPrimaryKey, a.l(), false);
            Table.nativeSetLong(nativePtr, b.n, rowWithPrimaryKey, a.o(), false);
            final OsList list = new OsList(x2.R(rowWithPrimaryKey), b.o);
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
                if (e2 == null) {
                    continue;
                }
                for (final o4.a a3 : e2) {
                    Long value2;
                    if ((value2 = map.get(a3)) == null) {
                        value2 = l2.J8(f0, a3, map);
                    }
                    list.l(value2);
                }
            }
        }
    }
    
    static d3 b9(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(s4.a.class), false, Collections.emptyList());
        final d3 d3 = new d3();
        h.a();
        return d3;
    }
    
    static s4.a c9(final f0 f0, final b b, final s4.a a, final s4.a a2, final Map<n0, p> map, final Set<q> set) {
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(s4.a.class), set);
        osObjectBuilder.L(b.e, a2.z());
        osObjectBuilder.L(b.f, a2.a());
        osObjectBuilder.L(b.g, a2.C());
        osObjectBuilder.d0(b.h, a2.d());
        osObjectBuilder.d0(b.i, a2.c());
        osObjectBuilder.d0(b.j, a2.f());
        osObjectBuilder.d0(b.k, a2.j0());
        osObjectBuilder.n(b.l, a2.i0());
        osObjectBuilder.K(b.m, a2.l());
        osObjectBuilder.L(b.n, a2.o());
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
            osObjectBuilder.Z(b.o, l0);
        }
        else {
            osObjectBuilder.Z(b.o, new l0<n0>());
        }
        osObjectBuilder.i0();
        return a;
    }
    
    @Override
    public void B(final l0<o4.a> l0) {
        final boolean i = this.V.i();
        final int n = 0;
        int j = 0;
        l0<o4.a> l2 = l0;
        if (i) {
            if (!this.V.d()) {
                return;
            }
            if (this.V.e().contains("driveAttachments")) {
                return;
            }
            if ((l2 = l0) != null) {
                l2 = l0;
                if (!l0.G0()) {
                    final f0 f0 = (f0)this.V.f();
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
        this.V.f().h();
        final OsList p = this.V.g().p(this.U.o);
        if (l2 != null && l2.size() == p.b0()) {
            while (j < l2.size()) {
                final o4.a a3 = l2.get(j);
                this.V.c(a3);
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
                this.V.c(a4);
                p.l(((p)a4).S6().g().l0());
            }
        }
    }
    
    @Override
    public long C() {
        this.V.f().h();
        return this.V.g().m(this.U.g);
    }
    
    @Override
    public l0<o4.a> E() {
        this.V.f().h();
        final l0<o4.a> w = this.W;
        if (w != null) {
            return w;
        }
        return this.W = new l0<o4.a>(o4.a.class, this.V.g().p(this.U.o), this.V.f());
    }
    
    @Override
    public void G(final long n) {
        if (!this.V.i()) {
            this.V.f().h();
            this.V.g().s(this.U.g, n);
            return;
        }
        if (!this.V.d()) {
            return;
        }
        final r g = this.V.g();
        g.g().q0(this.U.g, g.l0(), n, true);
    }
    
    @Override
    public c0<?> S6() {
        return this.V;
    }
    
    @Override
    public long a() {
        this.V.f().h();
        return this.V.g().m(this.U.f);
    }
    
    @Override
    public void b(final long n) {
        if (!this.V.i()) {
            this.V.f().h();
            this.V.g().s(this.U.f, n);
            return;
        }
        if (!this.V.d()) {
            return;
        }
        final r g = this.V.g();
        g.g().q0(this.U.f, g.l0(), n, true);
    }
    
    @Override
    public String c() {
        this.V.f().h();
        return this.V.g().U(this.U.i);
    }
    
    @Override
    public void c0(final boolean b) {
        if (!this.V.i()) {
            this.V.f().h();
            this.V.g().i(this.U.l, b);
            return;
        }
        if (!this.V.d()) {
            return;
        }
        final r g = this.V.g();
        g.g().j0(this.U.l, g.l0(), b, true);
    }
    
    @Override
    public String d() {
        this.V.f().h();
        return this.V.g().U(this.U.h);
    }
    
    @Override
    public void e0(final String s) {
        if (this.V.i()) {
            if (!this.V.d()) {
                return;
            }
            final r g = this.V.g();
            if (s != null) {
                g.g().t0(this.U.k, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'remark' to null.");
        }
        else {
            this.V.f().h();
            if (s != null) {
                this.V.g().d(this.U.k, s);
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
        final d3 d3 = (d3)o;
        final io.realm.a f = this.V.f();
        final io.realm.a f2 = d3.V.f();
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
        final String m = this.V.g().g().M();
        final String i = d3.V.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.V.g().l0() == d3.V.g().l0();
            }
        }
        else if (i == null) {
            return this.V.g().l0() == d3.V.g().l0();
        }
        return false;
    }
    
    @Override
    public String f() {
        this.V.f().h();
        return this.V.g().U(this.U.j);
    }
    
    @Override
    public void f0(final long n) {
        if (this.V.i()) {
            return;
        }
        this.V.f().h();
        throw new RealmException("Primary key field 'key' cannot be changed after object was created.");
    }
    
    @Override
    public int hashCode() {
        final String path = this.V.f().getPath();
        final String m = this.V.g().g().M();
        final long l0 = this.V.g().l0();
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
    public boolean i0() {
        this.V.f().h();
        return this.V.g().l(this.U.l);
    }
    
    @Override
    public void j(final String s) {
        if (this.V.i()) {
            if (!this.V.d()) {
                return;
            }
            final r g = this.V.g();
            if (s != null) {
                g.g().t0(this.U.j, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'text' to null.");
        }
        else {
            this.V.f().h();
            if (s != null) {
                this.V.g().d(this.U.j, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'text' to null.");
        }
    }
    
    @Override
    public String j0() {
        this.V.f().h();
        return this.V.g().U(this.U.k);
    }
    
    @Override
    public void k(final int n) {
        if (!this.V.i()) {
            this.V.f().h();
            this.V.g().s(this.U.m, n);
            return;
        }
        if (!this.V.d()) {
            return;
        }
        final r g = this.V.g();
        g.g().q0(this.U.m, g.l0(), n, true);
    }
    
    @Override
    public int l() {
        this.V.f().h();
        return (int)this.V.g().m(this.U.m);
    }
    
    @Override
    public long o() {
        this.V.f().h();
        return this.V.g().m(this.U.n);
    }
    
    @Override
    public void p(final long n) {
        if (!this.V.i()) {
            this.V.f().h();
            this.V.g().s(this.U.n, n);
            return;
        }
        if (!this.V.d()) {
            return;
        }
        final r g = this.V.g();
        g.g().q0(this.U.n, g.l0(), n, true);
    }
    
    @Override
    public String toString() {
        if (!p0.k8(this)) {
            return "Invalid object";
        }
        final StringBuilder sb = new StringBuilder("RealmInfoCenterHomework = proxy[");
        sb.append("{key:");
        sb.append(this.z());
        sb.append("}");
        sb.append(",");
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
        sb.append("{driveAttachments:");
        sb.append("RealmList<RealmDriveAttachment>[");
        sb.append(this.E().size());
        sb.append("]");
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
    
    @Override
    public void v(final String s) {
        if (this.V.i()) {
            if (!this.V.d()) {
                return;
            }
            final r g = this.V.g();
            if (s != null) {
                g.g().t0(this.U.h, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'start' to null.");
        }
        else {
            this.V.f().h();
            if (s != null) {
                this.V.g().d(this.U.h, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'start' to null.");
        }
    }
    
    @Override
    public void x(final String s) {
        if (this.V.i()) {
            if (!this.V.d()) {
                return;
            }
            final r g = this.V.g();
            if (s != null) {
                g.g().t0(this.U.i, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'end' to null.");
        }
        else {
            this.V.f().h();
            if (s != null) {
                this.V.g().d(this.U.i, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'end' to null.");
        }
    }
    
    @Override
    public void y4() {
        if (this.V != null) {
            return;
        }
        final io.realm.a.h h = io.realm.a.W.get();
        this.U = (b)h.c();
        (this.V = new c0<s4.a>(this)).r(h.e());
        this.V.s(h.f());
        this.V.o(h.b());
        this.V.q(h.d());
    }
    
    @Override
    public long z() {
        this.V.f().h();
        return this.V.g().m(this.U.e);
    }
    
    public static final class a
    {
        public static final String a = "RealmInfoCenterHomework";
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
        
        b(final OsSchemaInfo osSchemaInfo) {
            super(11);
            final OsObjectSchemaInfo b = osSchemaInfo.b("RealmInfoCenterHomework");
            this.e = this.b("key", "key", b);
            this.f = this.b("id", "id", b);
            this.g = this.b("lessonId", "lessonId", b);
            this.h = this.b("start", "start", b);
            this.i = this.b("end", "end", b);
            this.j = this.b("text", "text", b);
            this.k = this.b("remark", "remark", b);
            this.l = this.b("completed", "completed", b);
            this.m = this.b("entityType", "entityType", b);
            this.n = this.b("entityId", "entityId", b);
            this.o = this.b("driveAttachments", "driveAttachments", b);
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
        }
    }
}
