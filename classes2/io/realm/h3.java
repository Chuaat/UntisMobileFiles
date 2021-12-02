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
import t4.b;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.p;
import t4.a;

public class h3 extends t4.a implements p, i3
{
    private static final String b0 = "";
    private static final OsObjectSchemaInfo c0;
    private b Y;
    private c0<t4.a> Z;
    private l0<t4.b> a0;
    
    static {
        c0 = a9();
    }
    
    h3() {
        this.Z.p();
    }
    
    public static t4.a W8(final f0 f0, final b b, final t4.a a, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        final h3 h3 = map.get(a);
        if (h3 != null) {
            return h3;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(t4.a.class), set);
        osObjectBuilder.L(b.e, a.z());
        osObjectBuilder.L(b.f, a.a());
        osObjectBuilder.d0(b.g, a.d());
        osObjectBuilder.d0(b.h, a.c());
        osObjectBuilder.L(b.i, a.y0());
        osObjectBuilder.L(b.j, a.g1());
        osObjectBuilder.d0(b.k, a.l1());
        osObjectBuilder.d0(b.l, a.K1());
        osObjectBuilder.d0(b.m, a.r6());
        osObjectBuilder.d0(b.n, a.x1());
        osObjectBuilder.n(b.o, a.c5());
        osObjectBuilder.n(b.p, a.A0());
        osObjectBuilder.d0(b.r, a.A1());
        osObjectBuilder.d0(b.s, a.w1());
        final h3 j9 = j9(f0, osObjectBuilder.f0());
        map.put(a, j9);
        final l0<t4.b> r5 = a.R5();
        if (r5 != null) {
            final l0<t4.b> r6 = j9.R5();
            r6.clear();
            for (int i = 0; i < r5.size(); ++i) {
                final t4.b b3 = r5.get(i);
                t4.b z8 = (t4.b)map.get(b3);
                if (z8 == null) {
                    z8 = j3.z8(f0, (j3.b)f0.H().j(t4.b.class), b3, b2, map, set);
                }
                r6.add(z8);
            }
        }
        return j9;
    }
    
    public static t4.a X8(final f0 f0, final b b, final t4.a a, final boolean b2, final Map<n0, p> map, final Set<q> set) {
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
            return (t4.a)p7;
        }
        final p p8 = null;
        Object x2 = null;
        boolean b3 = false;
        Label_0233: {
            if (b2) {
                x2 = f0.x2(t4.a.class);
                final long r = ((Table)x2).r(b.e, a.z());
                if (r == -1L) {
                    b3 = false;
                    x2 = p8;
                    break Label_0233;
                }
                try {
                    h.g(f0, ((Table)x2).R(r), b, false, Collections.emptyList());
                    x2 = new h3();
                    map.put(a, (p)x2);
                }
                finally {
                    h.a();
                }
            }
            b3 = b2;
        }
        t4.a a2;
        if (b3) {
            a2 = k9(f0, b, (t4.a)x2, a, map, set);
        }
        else {
            a2 = W8(f0, b, a, b2, map, set);
        }
        return a2;
    }
    
    public static b Y8(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static t4.a Z8(final t4.a a, final int a2, final int n, final Map<n0, p.a<n0>> map) {
        if (a2 <= n && a != null) {
            final p.a a3 = map.get(a);
            t4.a a4;
            if (a3 == null) {
                a4 = new t4.a();
                map.put(a, (p.a<n0>)new p.a(a2, a4));
            }
            else {
                if (a2 >= a3.a) {
                    return (t4.a)a3.b;
                }
                a4 = (t4.a)a3.b;
                a3.a = a2;
            }
            a4.f0(a.z());
            a4.b(a.a());
            a4.v(a.d());
            a4.x(a.c());
            a4.Y(a.y0());
            a4.I1(a.g1());
            a4.C1(a.l1());
            a4.o1(a.K1());
            a4.m2(a.r6());
            a4.z6(a.x1());
            a4.C6(a.c5());
            a4.r1(a.A0());
            if (a2 == n) {
                a4.H3(null);
            }
            else {
                final l0<t4.b> r5 = a.R5();
                final l0<t4.b> l0 = new l0<t4.b>();
                a4.H3(l0);
                for (int size = r5.size(), i = 0; i < size; ++i) {
                    l0.add(j3.B8(r5.get(i), a2 + 1, n, map));
                }
            }
            a4.Y0(a.A1());
            a4.u1(a.w1());
            return a4;
        }
        return null;
    }
    
    private static OsObjectSchemaInfo a9() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmInfoCenterContactHour", false, 15, 0);
        final RealmFieldType integer = RealmFieldType.INTEGER;
        b.c("", "key", integer, true, false, true);
        b.c("", "id", integer, false, false, true);
        final RealmFieldType string = RealmFieldType.STRING;
        b.c("", "start", string, false, false, false);
        b.c("", "end", string, false, false, false);
        b.c("", "teacherId", integer, false, false, true);
        b.c("", "imageId", integer, false, false, true);
        b.c("", "email", string, false, false, true);
        b.c("", "phone", string, false, false, true);
        b.c("", "room", string, false, false, true);
        b.c("", "teacher", string, false, false, true);
        final RealmFieldType boolean1 = RealmFieldType.BOOLEAN;
        b.c("", "registrationAllowed", boolean1, false, false, true);
        b.c("", "registered", boolean1, false, false, true);
        b.b("", "timeslots", RealmFieldType.LIST, "RealmInfoCenterContactHourTimeslot");
        b.c("", "userText", string, false, false, true);
        b.c("", "teacherText", string, false, false, true);
        return b.e();
    }
    
    public static t4.a b9(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final ArrayList<String> list = new ArrayList<String>(1);
        Object x2 = null;
        Label_0146: {
            if (b) {
                x2 = f0.x2(t4.a.class);
                final long e = ((b)f0.H().j(t4.a.class)).e;
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
                        h.g(f0, ((Table)x2).R(r), f0.H().j(t4.a.class), false, Collections.emptyList());
                        x2 = new h3();
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
            if (jsonObject.has("timeslots")) {
                list.add("timeslots");
            }
            if (!jsonObject.has("key")) {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'key'.");
            }
            h3 h2;
            if (jsonObject.isNull("key")) {
                h2 = f0.p1((Class<h3>)t4.a.class, null, true, list);
            }
            else {
                h2 = f0.p1((Class<h3>)t4.a.class, jsonObject.getLong("key"), true, list);
            }
            o = h2;
        }
        if (jsonObject.has("id")) {
            if (jsonObject.isNull("id")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
            }
            ((i3)o).b(jsonObject.getLong("id"));
        }
        if (jsonObject.has("start")) {
            if (jsonObject.isNull("start")) {
                ((i3)o).v(null);
            }
            else {
                ((i3)o).v(jsonObject.getString("start"));
            }
        }
        if (jsonObject.has("end")) {
            if (jsonObject.isNull("end")) {
                ((i3)o).x(null);
            }
            else {
                ((i3)o).x(jsonObject.getString("end"));
            }
        }
        if (jsonObject.has("teacherId")) {
            if (jsonObject.isNull("teacherId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'teacherId' to null.");
            }
            ((i3)o).Y(jsonObject.getLong("teacherId"));
        }
        if (jsonObject.has("imageId")) {
            if (jsonObject.isNull("imageId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'imageId' to null.");
            }
            ((i3)o).I1(jsonObject.getLong("imageId"));
        }
        if (jsonObject.has("email")) {
            if (jsonObject.isNull("email")) {
                ((i3)o).C1(null);
            }
            else {
                ((i3)o).C1(jsonObject.getString("email"));
            }
        }
        if (jsonObject.has("phone")) {
            if (jsonObject.isNull("phone")) {
                ((i3)o).o1(null);
            }
            else {
                ((i3)o).o1(jsonObject.getString("phone"));
            }
        }
        if (jsonObject.has("room")) {
            if (jsonObject.isNull("room")) {
                ((i3)o).m2(null);
            }
            else {
                ((i3)o).m2(jsonObject.getString("room"));
            }
        }
        if (jsonObject.has("teacher")) {
            if (jsonObject.isNull("teacher")) {
                ((i3)o).z6(null);
            }
            else {
                ((i3)o).z6(jsonObject.getString("teacher"));
            }
        }
        if (jsonObject.has("registrationAllowed")) {
            if (jsonObject.isNull("registrationAllowed")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'registrationAllowed' to null.");
            }
            ((i3)o).C6(jsonObject.getBoolean("registrationAllowed"));
        }
        if (jsonObject.has("registered")) {
            if (jsonObject.isNull("registered")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'registered' to null.");
            }
            ((i3)o).r1(jsonObject.getBoolean("registered"));
        }
        if (jsonObject.has("timeslots")) {
            if (jsonObject.isNull("timeslots")) {
                ((i3)o).H3(null);
            }
            else {
                ((i3)o).R5().clear();
                final JSONArray jsonArray = jsonObject.getJSONArray("timeslots");
                for (int i = 0; i < jsonArray.length(); ++i) {
                    ((i3)o).R5().add(j3.D8(f0, jsonArray.getJSONObject(i), b));
                }
            }
        }
        if (jsonObject.has("userText")) {
            if (jsonObject.isNull("userText")) {
                ((i3)o).Y0(null);
            }
            else {
                ((i3)o).Y0(jsonObject.getString("userText"));
            }
        }
        if (jsonObject.has("teacherText")) {
            if (jsonObject.isNull("teacherText")) {
                ((i3)o).u1(null);
            }
            else {
                ((i3)o).u1(jsonObject.getString("teacherText"));
            }
        }
        return (t4.a)o;
    }
    
    @TargetApi(11)
    public static t4.a c9(final f0 f0, final JsonReader jsonReader) throws IOException {
        final t4.a a = new t4.a();
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
            else if (nextName.equals("teacherId")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'teacherId' to null.");
                }
                a.Y(jsonReader.nextLong());
            }
            else if (nextName.equals("imageId")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'imageId' to null.");
                }
                a.I1(jsonReader.nextLong());
            }
            else if (nextName.equals("email")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    a.C1(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    a.C1(null);
                }
            }
            else if (nextName.equals("phone")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    a.o1(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    a.o1(null);
                }
            }
            else if (nextName.equals("room")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    a.m2(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    a.m2(null);
                }
            }
            else if (nextName.equals("teacher")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    a.z6(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    a.z6(null);
                }
            }
            else if (nextName.equals("registrationAllowed")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'registrationAllowed' to null.");
                }
                a.C6(jsonReader.nextBoolean());
            }
            else if (nextName.equals("registered")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'registered' to null.");
                }
                a.r1(jsonReader.nextBoolean());
            }
            else if (nextName.equals("timeslots")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    a.H3(null);
                }
                else {
                    a.H3(new l0<t4.b>());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        a.R5().add(j3.E8(f0, jsonReader));
                    }
                    jsonReader.endArray();
                }
            }
            else if (nextName.equals("userText")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    a.Y0(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    a.Y0(null);
                }
            }
            else if (nextName.equals("teacherText")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    a.u1(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    a.u1(null);
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
    
    public static OsObjectSchemaInfo d9() {
        return h3.c0;
    }
    
    public static String e9() {
        return "RealmInfoCenterContactHour";
    }
    
    public static long f9(final f0 f0, final t4.a a, final Map<n0, Long> map) {
        if (a instanceof p && !p0.h8(a)) {
            final p p3 = (p)a;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(t4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(t4.a.class);
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
        final String d = a.d();
        if (d != null) {
            Table.nativeSetString(nativePtr, b.g, l, d, false);
        }
        final String c = a.c();
        if (c != null) {
            Table.nativeSetString(nativePtr, b.h, l, c, false);
        }
        Table.nativeSetLong(nativePtr, b.i, l, a.y0(), false);
        Table.nativeSetLong(nativePtr, b.j, l, a.g1(), false);
        final String l2 = a.l1();
        if (l2 != null) {
            Table.nativeSetString(nativePtr, b.k, l, l2, false);
        }
        final String k1 = a.K1();
        if (k1 != null) {
            Table.nativeSetString(nativePtr, b.l, l, k1, false);
        }
        final String r6 = a.r6();
        if (r6 != null) {
            Table.nativeSetString(nativePtr, b.m, l, r6, false);
        }
        final String x3 = a.x1();
        if (x3 != null) {
            Table.nativeSetString(nativePtr, b.n, l, x3, false);
        }
        Table.nativeSetBoolean(nativePtr, b.o, l, a.c5(), false);
        Table.nativeSetBoolean(nativePtr, b.p, l, a.A0(), false);
        final l0<t4.b> r7 = a.R5();
        if (r7 != null) {
            final OsList list = new OsList(x2.R(l), b.q);
            for (final t4.b b2 : r7) {
                Long value2;
                if ((value2 = map.get(b2)) == null) {
                    value2 = j3.H8(f0, b2, map);
                }
                list.l(value2);
            }
        }
        final String a2 = a.A1();
        if (a2 != null) {
            Table.nativeSetString(nativePtr, b.r, l, a2, false);
        }
        final String w1 = a.w1();
        if (w1 != null) {
            Table.nativeSetString(nativePtr, b.s, l, w1, false);
        }
        return l;
    }
    
    public static void g9(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(t4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(t4.a.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final t4.a a = (t4.a)iterator.next();
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
            final String d = a.d();
            if (d != null) {
                Table.nativeSetString(nativePtr, b.g, l, d, false);
            }
            final String c = a.c();
            if (c != null) {
                Table.nativeSetString(nativePtr, b.h, l, c, false);
            }
            Table.nativeSetLong(nativePtr, b.i, l, a.y0(), false);
            Table.nativeSetLong(nativePtr, b.j, l, a.g1(), false);
            final String l2 = a.l1();
            if (l2 != null) {
                Table.nativeSetString(nativePtr, b.k, l, l2, false);
            }
            final String k1 = a.K1();
            if (k1 != null) {
                Table.nativeSetString(nativePtr, b.l, l, k1, false);
            }
            final String r6 = a.r6();
            if (r6 != null) {
                Table.nativeSetString(nativePtr, b.m, l, r6, false);
            }
            final String x3 = a.x1();
            if (x3 != null) {
                Table.nativeSetString(nativePtr, b.n, l, x3, false);
            }
            Table.nativeSetBoolean(nativePtr, b.o, l, a.c5(), false);
            Table.nativeSetBoolean(nativePtr, b.p, l, a.A0(), false);
            final l0<t4.b> r7 = a.R5();
            if (r7 != null) {
                final OsList list = new OsList(x2.R(l), b.q);
                for (final t4.b b2 : r7) {
                    Long value2;
                    if ((value2 = map.get(b2)) == null) {
                        value2 = j3.H8(f0, b2, map);
                    }
                    list.l(value2);
                }
            }
            final String a2 = a.A1();
            if (a2 != null) {
                Table.nativeSetString(nativePtr, b.r, l, a2, false);
            }
            final String w1 = a.w1();
            if (w1 == null) {
                continue;
            }
            Table.nativeSetString(nativePtr, b.s, l, w1, false);
        }
    }
    
    public static long h9(final f0 f0, final t4.a a, final Map<n0, Long> map) {
        if (a instanceof p && !p0.h8(a)) {
            final p p3 = (p)a;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(t4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(t4.a.class);
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
        final String d = a.d();
        final long g = b.g;
        if (d != null) {
            Table.nativeSetString(nativePtr, g, rowWithPrimaryKey, d, false);
        }
        else {
            Table.nativeSetNull(nativePtr, g, rowWithPrimaryKey, false);
        }
        final String c = a.c();
        final long h = b.h;
        if (c != null) {
            Table.nativeSetString(nativePtr, h, rowWithPrimaryKey, c, false);
        }
        else {
            Table.nativeSetNull(nativePtr, h, rowWithPrimaryKey, false);
        }
        Table.nativeSetLong(nativePtr, b.i, rowWithPrimaryKey, a.y0(), false);
        Table.nativeSetLong(nativePtr, b.j, rowWithPrimaryKey, a.g1(), false);
        final String l1 = a.l1();
        final long k = b.k;
        if (l1 != null) {
            Table.nativeSetString(nativePtr, k, rowWithPrimaryKey, l1, false);
        }
        else {
            Table.nativeSetNull(nativePtr, k, rowWithPrimaryKey, false);
        }
        final String k2 = a.K1();
        final long i = b.l;
        if (k2 != null) {
            Table.nativeSetString(nativePtr, i, rowWithPrimaryKey, k2, false);
        }
        else {
            Table.nativeSetNull(nativePtr, i, rowWithPrimaryKey, false);
        }
        final String r6 = a.r6();
        final long m = b.m;
        if (r6 != null) {
            Table.nativeSetString(nativePtr, m, rowWithPrimaryKey, r6, false);
        }
        else {
            Table.nativeSetNull(nativePtr, m, rowWithPrimaryKey, false);
        }
        final String x3 = a.x1();
        final long n = b.n;
        if (x3 != null) {
            Table.nativeSetString(nativePtr, n, rowWithPrimaryKey, x3, false);
        }
        else {
            Table.nativeSetNull(nativePtr, n, rowWithPrimaryKey, false);
        }
        Table.nativeSetBoolean(nativePtr, b.o, rowWithPrimaryKey, a.c5(), false);
        Table.nativeSetBoolean(nativePtr, b.p, rowWithPrimaryKey, a.A0(), false);
        final OsList list = new OsList(x2.R(rowWithPrimaryKey), b.q);
        final l0<t4.b> r7 = a.R5();
        if (r7 != null && r7.size() == list.b0()) {
            for (int size = r7.size(), j = 0; j < size; ++j) {
                final t4.b b2 = r7.get(j);
                Long value;
                if ((value = map.get(b2)) == null) {
                    value = j3.J8(f0, b2, map);
                }
                list.Z(j, value);
            }
        }
        else {
            list.M();
            if (r7 != null) {
                for (final t4.b b3 : r7) {
                    Long value2;
                    if ((value2 = map.get(b3)) == null) {
                        value2 = j3.J8(f0, b3, map);
                    }
                    list.l(value2);
                }
            }
        }
        final String a2 = a.A1();
        if (a2 != null) {
            Table.nativeSetString(nativePtr, b.r, rowWithPrimaryKey, a2, false);
        }
        else {
            Table.nativeSetNull(nativePtr, b.r, rowWithPrimaryKey, false);
        }
        final String w1 = a.w1();
        final long s = b.s;
        if (w1 != null) {
            Table.nativeSetString(nativePtr, s, rowWithPrimaryKey, w1, false);
        }
        else {
            Table.nativeSetNull(nativePtr, s, rowWithPrimaryKey, false);
        }
        return rowWithPrimaryKey;
    }
    
    public static void i9(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(t4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(t4.a.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final t4.a a = (t4.a)iterator.next();
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
            final String d = a.d();
            final long g = b.g;
            if (d != null) {
                Table.nativeSetString(nativePtr, g, rowWithPrimaryKey, d, false);
            }
            else {
                Table.nativeSetNull(nativePtr, g, rowWithPrimaryKey, false);
            }
            final String c = a.c();
            final long h = b.h;
            if (c != null) {
                Table.nativeSetString(nativePtr, h, rowWithPrimaryKey, c, false);
            }
            else {
                Table.nativeSetNull(nativePtr, h, rowWithPrimaryKey, false);
            }
            Table.nativeSetLong(nativePtr, b.i, rowWithPrimaryKey, a.y0(), false);
            Table.nativeSetLong(nativePtr, b.j, rowWithPrimaryKey, a.g1(), false);
            final String l1 = a.l1();
            final long k = b.k;
            if (l1 != null) {
                Table.nativeSetString(nativePtr, k, rowWithPrimaryKey, l1, false);
            }
            else {
                Table.nativeSetNull(nativePtr, k, rowWithPrimaryKey, false);
            }
            final String k2 = a.K1();
            final long i = b.l;
            if (k2 != null) {
                Table.nativeSetString(nativePtr, i, rowWithPrimaryKey, k2, false);
            }
            else {
                Table.nativeSetNull(nativePtr, i, rowWithPrimaryKey, false);
            }
            final String r6 = a.r6();
            final long m = b.m;
            if (r6 != null) {
                Table.nativeSetString(nativePtr, m, rowWithPrimaryKey, r6, false);
            }
            else {
                Table.nativeSetNull(nativePtr, m, rowWithPrimaryKey, false);
            }
            final String x3 = a.x1();
            final long n = b.n;
            if (x3 != null) {
                Table.nativeSetString(nativePtr, n, rowWithPrimaryKey, x3, false);
            }
            else {
                Table.nativeSetNull(nativePtr, n, rowWithPrimaryKey, false);
            }
            Table.nativeSetBoolean(nativePtr, b.o, rowWithPrimaryKey, a.c5(), false);
            Table.nativeSetBoolean(nativePtr, b.p, rowWithPrimaryKey, a.A0(), false);
            final OsList list = new OsList(x2.R(rowWithPrimaryKey), b.q);
            final l0<t4.b> r7 = a.R5();
            if (r7 != null && r7.size() == list.b0()) {
                for (int size = r7.size(), j = 0; j < size; ++j) {
                    final t4.b b2 = r7.get(j);
                    Long value;
                    if ((value = map.get(b2)) == null) {
                        value = j3.J8(f0, b2, map);
                    }
                    list.Z(j, value);
                }
            }
            else {
                final long n2 = rowWithPrimaryKey;
                list.M();
                rowWithPrimaryKey = n2;
                if (r7 != null) {
                    final Iterator<t4.b> iterator2 = r7.iterator();
                    while (true) {
                        rowWithPrimaryKey = n2;
                        if (!iterator2.hasNext()) {
                            break;
                        }
                        final t4.b b3 = iterator2.next();
                        Long value2;
                        if ((value2 = map.get(b3)) == null) {
                            value2 = j3.J8(f0, b3, map);
                        }
                        list.l(value2);
                    }
                }
            }
            final String a2 = a.A1();
            if (a2 != null) {
                Table.nativeSetString(nativePtr, b.r, rowWithPrimaryKey, a2, false);
            }
            else {
                Table.nativeSetNull(nativePtr, b.r, rowWithPrimaryKey, false);
            }
            final String w1 = a.w1();
            final long s = b.s;
            if (w1 != null) {
                Table.nativeSetString(nativePtr, s, rowWithPrimaryKey, w1, false);
            }
            else {
                Table.nativeSetNull(nativePtr, s, rowWithPrimaryKey, false);
            }
        }
    }
    
    static h3 j9(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(t4.a.class), false, Collections.emptyList());
        final h3 h2 = new h3();
        h.a();
        return h2;
    }
    
    static t4.a k9(final f0 f0, final b b, final t4.a a, final t4.a a2, final Map<n0, p> map, final Set<q> set) {
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(t4.a.class), set);
        osObjectBuilder.L(b.e, a2.z());
        osObjectBuilder.L(b.f, a2.a());
        osObjectBuilder.d0(b.g, a2.d());
        osObjectBuilder.d0(b.h, a2.c());
        osObjectBuilder.L(b.i, a2.y0());
        osObjectBuilder.L(b.j, a2.g1());
        osObjectBuilder.d0(b.k, a2.l1());
        osObjectBuilder.d0(b.l, a2.K1());
        osObjectBuilder.d0(b.m, a2.r6());
        osObjectBuilder.d0(b.n, a2.x1());
        osObjectBuilder.n(b.o, a2.c5());
        osObjectBuilder.n(b.p, a2.A0());
        final l0<t4.b> r5 = a2.R5();
        if (r5 != null) {
            final l0<n0> l0 = new l0<n0>();
            for (int i = 0; i < r5.size(); ++i) {
                final t4.b b2 = r5.get(i);
                t4.b z8 = (t4.b)map.get(b2);
                if (z8 == null) {
                    z8 = j3.z8(f0, (j3.b)f0.H().j(t4.b.class), b2, true, map, set);
                }
                l0.add(z8);
            }
            osObjectBuilder.Z(b.q, l0);
        }
        else {
            osObjectBuilder.Z(b.q, new l0<n0>());
        }
        osObjectBuilder.d0(b.r, a2.A1());
        osObjectBuilder.d0(b.s, a2.w1());
        osObjectBuilder.i0();
        return a;
    }
    
    @Override
    public boolean A0() {
        this.Z.f().h();
        return this.Z.g().l(this.Y.p);
    }
    
    @Override
    public String A1() {
        this.Z.f().h();
        return this.Z.g().U(this.Y.r);
    }
    
    @Override
    public void C1(final String s) {
        if (this.Z.i()) {
            if (!this.Z.d()) {
                return;
            }
            final r g = this.Z.g();
            if (s != null) {
                g.g().t0(this.Y.k, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'email' to null.");
        }
        else {
            this.Z.f().h();
            if (s != null) {
                this.Z.g().d(this.Y.k, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'email' to null.");
        }
    }
    
    @Override
    public void C6(final boolean b) {
        if (!this.Z.i()) {
            this.Z.f().h();
            this.Z.g().i(this.Y.o, b);
            return;
        }
        if (!this.Z.d()) {
            return;
        }
        final r g = this.Z.g();
        g.g().j0(this.Y.o, g.l0(), b, true);
    }
    
    @Override
    public void H3(final l0<t4.b> l0) {
        final boolean i = this.Z.i();
        final int n = 0;
        int j = 0;
        l0<t4.b> l2 = l0;
        if (i) {
            if (!this.Z.d()) {
                return;
            }
            if (this.Z.e().contains("timeslots")) {
                return;
            }
            if ((l2 = l0) != null) {
                l2 = l0;
                if (!l0.G0()) {
                    final f0 f0 = (f0)this.Z.f();
                    l2 = new l0<t4.b>();
                    for (final t4.b b : l0) {
                        t4.b b2;
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
                final t4.b b3 = l2.get(j);
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
                final t4.b b4 = l2.get(k);
                this.Z.c(b4);
                p.l(((p)b4).S6().g().l0());
            }
        }
    }
    
    @Override
    public void I1(final long n) {
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
    
    @Override
    public String K1() {
        this.Z.f().h();
        return this.Z.g().U(this.Y.l);
    }
    
    @Override
    public l0<t4.b> R5() {
        this.Z.f().h();
        final l0<t4.b> a0 = this.a0;
        if (a0 != null) {
            return a0;
        }
        return this.a0 = new l0<t4.b>(t4.b.class, this.Z.g().p(this.Y.q), this.Z.f());
    }
    
    @Override
    public c0<?> S6() {
        return this.Z;
    }
    
    @Override
    public void Y(final long n) {
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
    public void Y0(final String s) {
        if (this.Z.i()) {
            if (!this.Z.d()) {
                return;
            }
            final r g = this.Z.g();
            if (s != null) {
                g.g().t0(this.Y.r, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'userText' to null.");
        }
        else {
            this.Z.f().h();
            if (s != null) {
                this.Z.g().d(this.Y.r, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'userText' to null.");
        }
    }
    
    @Override
    public long a() {
        this.Z.f().h();
        return this.Z.g().m(this.Y.f);
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
    public String c() {
        this.Z.f().h();
        return this.Z.g().U(this.Y.h);
    }
    
    @Override
    public boolean c5() {
        this.Z.f().h();
        return this.Z.g().l(this.Y.o);
    }
    
    @Override
    public String d() {
        this.Z.f().h();
        return this.Z.g().U(this.Y.g);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final h3 h3 = (h3)o;
        final io.realm.a f = this.Z.f();
        final io.realm.a f2 = h3.Z.f();
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
        final String i = h3.Z.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.Z.g().l0() == h3.Z.g().l0();
            }
        }
        else if (i == null) {
            return this.Z.g().l0() == h3.Z.g().l0();
        }
        return false;
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
    public long g1() {
        this.Z.f().h();
        return this.Z.g().m(this.Y.j);
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
    public String l1() {
        this.Z.f().h();
        return this.Z.g().U(this.Y.k);
    }
    
    @Override
    public void m2(final String s) {
        if (this.Z.i()) {
            if (!this.Z.d()) {
                return;
            }
            final r g = this.Z.g();
            if (s != null) {
                g.g().t0(this.Y.m, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'room' to null.");
        }
        else {
            this.Z.f().h();
            if (s != null) {
                this.Z.g().d(this.Y.m, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'room' to null.");
        }
    }
    
    @Override
    public void o1(final String s) {
        if (this.Z.i()) {
            if (!this.Z.d()) {
                return;
            }
            final r g = this.Z.g();
            if (s != null) {
                g.g().t0(this.Y.l, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'phone' to null.");
        }
        else {
            this.Z.f().h();
            if (s != null) {
                this.Z.g().d(this.Y.l, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'phone' to null.");
        }
    }
    
    @Override
    public void r1(final boolean b) {
        if (!this.Z.i()) {
            this.Z.f().h();
            this.Z.g().i(this.Y.p, b);
            return;
        }
        if (!this.Z.d()) {
            return;
        }
        final r g = this.Z.g();
        g.g().j0(this.Y.p, g.l0(), b, true);
    }
    
    @Override
    public String r6() {
        this.Z.f().h();
        return this.Z.g().U(this.Y.m);
    }
    
    @Override
    public String toString() {
        if (!p0.k8(this)) {
            return "Invalid object";
        }
        final StringBuilder sb = new StringBuilder("RealmInfoCenterContactHour = proxy[");
        sb.append("{key:");
        sb.append(this.z());
        sb.append("}");
        sb.append(",");
        sb.append("{id:");
        sb.append(this.a());
        sb.append("}");
        sb.append(",");
        sb.append("{start:");
        final String d = this.d();
        final String s = "null";
        String d2;
        if (d != null) {
            d2 = this.d();
        }
        else {
            d2 = "null";
        }
        sb.append(d2);
        sb.append("}");
        sb.append(",");
        sb.append("{end:");
        String c = s;
        if (this.c() != null) {
            c = this.c();
        }
        sb.append(c);
        sb.append("}");
        sb.append(",");
        sb.append("{teacherId:");
        sb.append(this.y0());
        sb.append("}");
        sb.append(",");
        sb.append("{imageId:");
        sb.append(this.g1());
        sb.append("}");
        sb.append(",");
        sb.append("{email:");
        sb.append(this.l1());
        sb.append("}");
        sb.append(",");
        sb.append("{phone:");
        sb.append(this.K1());
        sb.append("}");
        sb.append(",");
        sb.append("{room:");
        sb.append(this.r6());
        sb.append("}");
        sb.append(",");
        sb.append("{teacher:");
        sb.append(this.x1());
        sb.append("}");
        sb.append(",");
        sb.append("{registrationAllowed:");
        sb.append(this.c5());
        sb.append("}");
        sb.append(",");
        sb.append("{registered:");
        sb.append(this.A0());
        sb.append("}");
        sb.append(",");
        sb.append("{timeslots:");
        sb.append("RealmList<RealmInfoCenterContactHourTimeslot>[");
        sb.append(this.R5().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{userText:");
        sb.append(this.A1());
        sb.append("}");
        sb.append(",");
        sb.append("{teacherText:");
        sb.append(this.w1());
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
    
    @Override
    public void u1(final String s) {
        if (this.Z.i()) {
            if (!this.Z.d()) {
                return;
            }
            final r g = this.Z.g();
            if (s != null) {
                g.g().t0(this.Y.s, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'teacherText' to null.");
        }
        else {
            this.Z.f().h();
            if (s != null) {
                this.Z.g().d(this.Y.s, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'teacherText' to null.");
        }
    }
    
    @Override
    public void v(final String s) {
        if (this.Z.i()) {
            if (!this.Z.d()) {
                return;
            }
            final r g = this.Z.g();
            if (s == null) {
                g.g().r0(this.Y.g, g.l0(), true);
                return;
            }
            g.g().t0(this.Y.g, g.l0(), s, true);
        }
        else {
            this.Z.f().h();
            if (s == null) {
                this.Z.g().I(this.Y.g);
                return;
            }
            this.Z.g().d(this.Y.g, s);
        }
    }
    
    @Override
    public String w1() {
        this.Z.f().h();
        return this.Z.g().U(this.Y.s);
    }
    
    @Override
    public void x(final String s) {
        if (this.Z.i()) {
            if (!this.Z.d()) {
                return;
            }
            final r g = this.Z.g();
            if (s == null) {
                g.g().r0(this.Y.h, g.l0(), true);
                return;
            }
            g.g().t0(this.Y.h, g.l0(), s, true);
        }
        else {
            this.Z.f().h();
            if (s == null) {
                this.Z.g().I(this.Y.h);
                return;
            }
            this.Z.g().d(this.Y.h, s);
        }
    }
    
    @Override
    public String x1() {
        this.Z.f().h();
        return this.Z.g().U(this.Y.n);
    }
    
    @Override
    public long y0() {
        this.Z.f().h();
        return this.Z.g().m(this.Y.i);
    }
    
    @Override
    public void y4() {
        if (this.Z != null) {
            return;
        }
        final io.realm.a.h h = io.realm.a.W.get();
        this.Y = (b)h.c();
        (this.Z = new c0<t4.a>(this)).r(h.e());
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
    public void z6(final String s) {
        if (this.Z.i()) {
            if (!this.Z.d()) {
                return;
            }
            final r g = this.Z.g();
            if (s != null) {
                g.g().t0(this.Y.n, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'teacher' to null.");
        }
        else {
            this.Z.f().h();
            if (s != null) {
                this.Z.g().d(this.Y.n, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'teacher' to null.");
        }
    }
    
    public static final class a
    {
        public static final String a = "RealmInfoCenterContactHour";
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
            final OsObjectSchemaInfo b = osSchemaInfo.b("RealmInfoCenterContactHour");
            this.e = this.b("key", "key", b);
            this.f = this.b("id", "id", b);
            this.g = this.b("start", "start", b);
            this.h = this.b("end", "end", b);
            this.i = this.b("teacherId", "teacherId", b);
            this.j = this.b("imageId", "imageId", b);
            this.k = this.b("email", "email", b);
            this.l = this.b("phone", "phone", b);
            this.m = this.b("room", "room", b);
            this.n = this.b("teacher", "teacher", b);
            this.o = this.b("registrationAllowed", "registrationAllowed", b);
            this.p = this.b("registered", "registered", b);
            this.q = this.b("timeslots", "timeslots", b);
            this.r = this.b("userText", "userText", b);
            this.s = this.b("teacherText", "teacherText", b);
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
