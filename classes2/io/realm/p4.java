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
import w4.i;
import io.realm.internal.r;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Set;
import java.util.Map;
import y4.b;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.p;
import y4.a;

public class p4 extends y4.a implements p, q4
{
    private static final String a0 = "";
    private static final OsObjectSchemaInfo b0;
    private b X;
    private c0<y4.a> Y;
    private l0<y4.b> Z;
    
    static {
        b0 = Y8();
    }
    
    p4() {
        this.Y.p();
    }
    
    public static y4.a U8(final f0 f0, final b b, final y4.a a, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        final p4 p6 = map.get(a);
        if (p6 != null) {
            return p6;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(y4.a.class), set);
        osObjectBuilder.L(b.e, a.a());
        osObjectBuilder.L(b.f, a.d());
        osObjectBuilder.L(b.g, a.c());
        osObjectBuilder.L(b.i, a.g1());
        osObjectBuilder.d0(b.j, a.l1());
        osObjectBuilder.d0(b.k, a.K1());
        osObjectBuilder.d0(b.l, a.b4());
        osObjectBuilder.d0(b.m, a.u4());
        osObjectBuilder.n(b.n, a.p7());
        osObjectBuilder.n(b.o, a.A0());
        osObjectBuilder.d0(b.q, a.A1());
        osObjectBuilder.d0(b.r, a.w1());
        final p4 h9 = h9(f0, osObjectBuilder.f0());
        map.put(a, h9);
        final w4.i x1 = a.x1();
        w4.i n8;
        if (x1 == null) {
            n8 = null;
        }
        else {
            n8 = (w4.i)map.get(x1);
            if (n8 == null) {
                n8 = l4.N8(f0, (l4.b)f0.H().j(w4.i.class), x1, b2, map, set);
            }
        }
        h9.Q4(n8);
        final l0<y4.b> t2 = a.t2();
        if (t2 != null) {
            final l0<y4.b> t3 = h9.t2();
            t3.clear();
            for (int i = 0; i < t2.size(); ++i) {
                final y4.b b3 = t2.get(i);
                y4.b z8 = (y4.b)map.get(b3);
                if (z8 == null) {
                    z8 = r4.z8(f0, (r4.b)f0.H().j(y4.b.class), b3, b2, map, set);
                }
                t3.add(z8);
            }
        }
        return h9;
    }
    
    public static y4.a V8(final f0 f0, final b b, final y4.a a, final boolean b2, final Map<n0, p> map, final Set<q> set) {
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
            return (y4.a)p7;
        }
        final p p8 = null;
        Object x2 = null;
        boolean b3 = false;
        Label_0233: {
            if (b2) {
                x2 = f0.x2(y4.a.class);
                final long r = ((Table)x2).r(b.e, a.a());
                if (r == -1L) {
                    b3 = false;
                    x2 = p8;
                    break Label_0233;
                }
                try {
                    h.g(f0, ((Table)x2).R(r), b, false, Collections.emptyList());
                    x2 = new p4();
                    map.put(a, (p)x2);
                }
                finally {
                    h.a();
                }
            }
            b3 = b2;
        }
        y4.a a2;
        if (b3) {
            a2 = i9(f0, b, (y4.a)x2, a, map, set);
        }
        else {
            a2 = U8(f0, b, a, b2, map, set);
        }
        return a2;
    }
    
    public static b W8(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static y4.a X8(final y4.a a, int i, final int n, final Map<n0, p.a<n0>> map) {
        if (i <= n && a != null) {
            final p.a a2 = map.get(a);
            y4.a a3;
            if (a2 == null) {
                a3 = new y4.a();
                map.put(a, (p.a<n0>)new p.a(i, a3));
            }
            else {
                if (i >= a2.a) {
                    return (y4.a)a2.b;
                }
                a3 = (y4.a)a2.b;
                a2.a = i;
            }
            a3.b(a.a());
            a3.h(a.d());
            a3.i(a.c());
            final w4.i x1 = a.x1();
            final int n2 = i + 1;
            a3.Q4(l4.P8(x1, n2, n, map));
            a3.I1(a.g1());
            a3.C1(a.l1());
            a3.o1(a.K1());
            a3.F3(a.b4());
            a3.h7(a.u4());
            a3.u5(a.p7());
            a3.r1(a.A0());
            if (i == n) {
                a3.r4(null);
            }
            else {
                final l0<y4.b> t2 = a.t2();
                final l0<y4.b> l0 = new l0<y4.b>();
                a3.r4(l0);
                int size;
                for (size = t2.size(), i = 0; i < size; ++i) {
                    l0.add(r4.B8(t2.get(i), n2, n, map));
                }
            }
            a3.Y0(a.A1());
            a3.u1(a.w1());
            return a3;
        }
        return null;
    }
    
    private static OsObjectSchemaInfo Y8() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmOfficeHour", false, 14, 0);
        final RealmFieldType integer = RealmFieldType.INTEGER;
        b.c("", "id", integer, true, false, true);
        b.c("", "start", integer, false, false, true);
        b.c("", "end", integer, false, false, true);
        b.b("", "teacher", RealmFieldType.OBJECT, "RealmTeacher");
        b.c("", "imageId", integer, false, false, true);
        final RealmFieldType string = RealmFieldType.STRING;
        b.c("", "email", string, false, false, true);
        b.c("", "phone", string, false, false, true);
        b.c("", "displayNameRooms", string, false, false, true);
        b.c("", "displayNameTeacher", string, false, false, true);
        final RealmFieldType boolean1 = RealmFieldType.BOOLEAN;
        b.c("", "registrationPossible", boolean1, false, false, true);
        b.c("", "registered", boolean1, false, false, true);
        b.b("", "timeSlots", RealmFieldType.LIST, "RealmOfficeHourTimeSlot");
        b.c("", "userText", string, false, false, true);
        b.c("", "teacherText", string, false, false, true);
        return b.e();
    }
    
    public static y4.a Z8(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final ArrayList<String> list = new ArrayList<String>(2);
        Object x2 = null;
        Label_0146: {
            if (b) {
                x2 = f0.x2(y4.a.class);
                final long e = ((b)f0.H().j(y4.a.class)).e;
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
                        h.g(f0, ((Table)x2).R(r), f0.H().j(y4.a.class), false, Collections.emptyList());
                        x2 = new p4();
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
            if (jsonObject.has("teacher")) {
                list.add("teacher");
            }
            if (jsonObject.has("timeSlots")) {
                list.add("timeSlots");
            }
            if (!jsonObject.has("id")) {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
            p4 p3;
            if (jsonObject.isNull("id")) {
                p3 = f0.p1((Class<p4>)y4.a.class, null, true, list);
            }
            else {
                p3 = f0.p1((Class<p4>)y4.a.class, jsonObject.getLong("id"), true, list);
            }
            o = p3;
        }
        if (jsonObject.has("start")) {
            if (jsonObject.isNull("start")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'start' to null.");
            }
            ((q4)o).h(jsonObject.getLong("start"));
        }
        if (jsonObject.has("end")) {
            if (jsonObject.isNull("end")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'end' to null.");
            }
            ((q4)o).i(jsonObject.getLong("end"));
        }
        if (jsonObject.has("teacher")) {
            if (jsonObject.isNull("teacher")) {
                ((q4)o).Q4(null);
            }
            else {
                ((q4)o).Q4(l4.R8(f0, jsonObject.getJSONObject("teacher"), b));
            }
        }
        if (jsonObject.has("imageId")) {
            if (jsonObject.isNull("imageId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'imageId' to null.");
            }
            ((q4)o).I1(jsonObject.getLong("imageId"));
        }
        if (jsonObject.has("email")) {
            if (jsonObject.isNull("email")) {
                ((q4)o).C1(null);
            }
            else {
                ((q4)o).C1(jsonObject.getString("email"));
            }
        }
        if (jsonObject.has("phone")) {
            if (jsonObject.isNull("phone")) {
                ((q4)o).o1(null);
            }
            else {
                ((q4)o).o1(jsonObject.getString("phone"));
            }
        }
        if (jsonObject.has("displayNameRooms")) {
            if (jsonObject.isNull("displayNameRooms")) {
                ((q4)o).F3(null);
            }
            else {
                ((q4)o).F3(jsonObject.getString("displayNameRooms"));
            }
        }
        if (jsonObject.has("displayNameTeacher")) {
            if (jsonObject.isNull("displayNameTeacher")) {
                ((q4)o).h7(null);
            }
            else {
                ((q4)o).h7(jsonObject.getString("displayNameTeacher"));
            }
        }
        if (jsonObject.has("registrationPossible")) {
            if (jsonObject.isNull("registrationPossible")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'registrationPossible' to null.");
            }
            ((q4)o).u5(jsonObject.getBoolean("registrationPossible"));
        }
        if (jsonObject.has("registered")) {
            if (jsonObject.isNull("registered")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'registered' to null.");
            }
            ((q4)o).r1(jsonObject.getBoolean("registered"));
        }
        if (jsonObject.has("timeSlots")) {
            if (jsonObject.isNull("timeSlots")) {
                ((q4)o).r4(null);
            }
            else {
                ((q4)o).t2().clear();
                final JSONArray jsonArray = jsonObject.getJSONArray("timeSlots");
                for (int i = 0; i < jsonArray.length(); ++i) {
                    ((q4)o).t2().add(r4.D8(f0, jsonArray.getJSONObject(i), b));
                }
            }
        }
        if (jsonObject.has("userText")) {
            if (jsonObject.isNull("userText")) {
                ((q4)o).Y0(null);
            }
            else {
                ((q4)o).Y0(jsonObject.getString("userText"));
            }
        }
        if (jsonObject.has("teacherText")) {
            if (jsonObject.isNull("teacherText")) {
                ((q4)o).u1(null);
            }
            else {
                ((q4)o).u1(jsonObject.getString("teacherText"));
            }
        }
        return (y4.a)o;
    }
    
    @TargetApi(11)
    public static y4.a a9(final f0 f0, final JsonReader jsonReader) throws IOException {
        final y4.a a = new y4.a();
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
            else if (nextName.equals("teacher")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    a.Q4(null);
                }
                else {
                    a.Q4(l4.S8(f0, jsonReader));
                }
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
            else if (nextName.equals("displayNameRooms")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    a.F3(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    a.F3(null);
                }
            }
            else if (nextName.equals("displayNameTeacher")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    a.h7(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    a.h7(null);
                }
            }
            else if (nextName.equals("registrationPossible")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'registrationPossible' to null.");
                }
                a.u5(jsonReader.nextBoolean());
            }
            else if (nextName.equals("registered")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'registered' to null.");
                }
                a.r1(jsonReader.nextBoolean());
            }
            else if (nextName.equals("timeSlots")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    a.r4(null);
                }
                else {
                    a.r4(new l0<y4.b>());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        a.t2().add(r4.E8(f0, jsonReader));
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
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }
    
    public static OsObjectSchemaInfo b9() {
        return p4.b0;
    }
    
    public static String c9() {
        return "RealmOfficeHour";
    }
    
    public static long d9(final f0 f0, final y4.a a, final Map<n0, Long> map) {
        if (a instanceof p && !p0.h8(a)) {
            final p p3 = (p)a;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(y4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(y4.a.class);
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
        Table.nativeSetLong(nativePtr, b.f, l, a.d(), false);
        Table.nativeSetLong(nativePtr, b.g, l, a.c(), false);
        final w4.i x3 = a.x1();
        if (x3 != null) {
            Long value2;
            if ((value2 = map.get(x3)) == null) {
                value2 = l4.V8(f0, x3, map);
            }
            Table.nativeSetLink(nativePtr, b.h, l, value2, false);
        }
        Table.nativeSetLong(nativePtr, b.i, l, a.g1(), false);
        final String l2 = a.l1();
        if (l2 != null) {
            Table.nativeSetString(nativePtr, b.j, l, l2, false);
        }
        final String k1 = a.K1();
        if (k1 != null) {
            Table.nativeSetString(nativePtr, b.k, l, k1, false);
        }
        final String b2 = a.b4();
        if (b2 != null) {
            Table.nativeSetString(nativePtr, b.l, l, b2, false);
        }
        final String u4 = a.u4();
        if (u4 != null) {
            Table.nativeSetString(nativePtr, b.m, l, u4, false);
        }
        Table.nativeSetBoolean(nativePtr, b.n, l, a.p7(), false);
        Table.nativeSetBoolean(nativePtr, b.o, l, a.A0(), false);
        final l0<y4.b> t2 = a.t2();
        if (t2 != null) {
            final OsList list = new OsList(x2.R(l), b.p);
            for (final y4.b b3 : t2) {
                Long value3;
                if ((value3 = map.get(b3)) == null) {
                    value3 = r4.H8(f0, b3, map);
                }
                list.l(value3);
            }
        }
        final String a2 = a.A1();
        if (a2 != null) {
            Table.nativeSetString(nativePtr, b.q, l, a2, false);
        }
        final String w1 = a.w1();
        if (w1 != null) {
            Table.nativeSetString(nativePtr, b.r, l, w1, false);
        }
        return l;
    }
    
    public static void e9(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(y4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(y4.a.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final y4.a a = (y4.a)iterator.next();
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
            Table.nativeSetLong(nativePtr, b.f, l, a.d(), false);
            Table.nativeSetLong(nativePtr, b.g, l, a.c(), false);
            final w4.i x3 = a.x1();
            if (x3 != null) {
                Long value2;
                if ((value2 = map.get(x3)) == null) {
                    value2 = l4.V8(f0, x3, map);
                }
                x2.p0(b.h, l, value2, false);
            }
            Table.nativeSetLong(nativePtr, b.i, l, a.g1(), false);
            final String l2 = a.l1();
            if (l2 != null) {
                Table.nativeSetString(nativePtr, b.j, l, l2, false);
            }
            final String k1 = a.K1();
            if (k1 != null) {
                Table.nativeSetString(nativePtr, b.k, l, k1, false);
            }
            final String b2 = a.b4();
            if (b2 != null) {
                Table.nativeSetString(nativePtr, b.l, l, b2, false);
            }
            final String u4 = a.u4();
            if (u4 != null) {
                Table.nativeSetString(nativePtr, b.m, l, u4, false);
            }
            Table.nativeSetBoolean(nativePtr, b.n, l, a.p7(), false);
            Table.nativeSetBoolean(nativePtr, b.o, l, a.A0(), false);
            final l0<y4.b> t2 = a.t2();
            if (t2 != null) {
                final OsList list = new OsList(x2.R(l), b.p);
                for (final y4.b b3 : t2) {
                    Long value3;
                    if ((value3 = map.get(b3)) == null) {
                        value3 = r4.H8(f0, b3, map);
                    }
                    list.l(value3);
                }
            }
            final String a2 = a.A1();
            if (a2 != null) {
                Table.nativeSetString(nativePtr, b.q, l, a2, false);
            }
            final String w1 = a.w1();
            if (w1 == null) {
                continue;
            }
            Table.nativeSetString(nativePtr, b.r, l, w1, false);
        }
    }
    
    public static long f9(final f0 f0, final y4.a a, final Map<n0, Long> map) {
        if (a instanceof p && !p0.h8(a)) {
            final p p3 = (p)a;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(y4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(y4.a.class);
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
        Table.nativeSetLong(nativePtr, b.f, rowWithPrimaryKey, a.d(), false);
        Table.nativeSetLong(nativePtr, b.g, rowWithPrimaryKey, a.c(), false);
        final w4.i x3 = a.x1();
        if (x3 != null) {
            Long value;
            if ((value = map.get(x3)) == null) {
                value = l4.X8(f0, x3, map);
            }
            Table.nativeSetLink(nativePtr, b.h, rowWithPrimaryKey, value, false);
        }
        else {
            Table.nativeNullifyLink(nativePtr, b.h, rowWithPrimaryKey);
        }
        Table.nativeSetLong(nativePtr, b.i, rowWithPrimaryKey, a.g1(), false);
        final String l1 = a.l1();
        final long j = b.j;
        if (l1 != null) {
            Table.nativeSetString(nativePtr, j, rowWithPrimaryKey, l1, false);
        }
        else {
            Table.nativeSetNull(nativePtr, j, rowWithPrimaryKey, false);
        }
        final String k1 = a.K1();
        final long i = b.k;
        if (k1 != null) {
            Table.nativeSetString(nativePtr, i, rowWithPrimaryKey, k1, false);
        }
        else {
            Table.nativeSetNull(nativePtr, i, rowWithPrimaryKey, false);
        }
        final String b2 = a.b4();
        final long m = b.l;
        if (b2 != null) {
            Table.nativeSetString(nativePtr, m, rowWithPrimaryKey, b2, false);
        }
        else {
            Table.nativeSetNull(nativePtr, m, rowWithPrimaryKey, false);
        }
        final String u4 = a.u4();
        final long m2 = b.m;
        if (u4 != null) {
            Table.nativeSetString(nativePtr, m2, rowWithPrimaryKey, u4, false);
        }
        else {
            Table.nativeSetNull(nativePtr, m2, rowWithPrimaryKey, false);
        }
        Table.nativeSetBoolean(nativePtr, b.n, rowWithPrimaryKey, a.p7(), false);
        Table.nativeSetBoolean(nativePtr, b.o, rowWithPrimaryKey, a.A0(), false);
        final OsList list = new OsList(x2.R(rowWithPrimaryKey), b.p);
        final l0<y4.b> t2 = a.t2();
        if (t2 != null && t2.size() == list.b0()) {
            for (int size = t2.size(), n = 0; n < size; ++n) {
                final y4.b b3 = t2.get(n);
                Long value2;
                if ((value2 = map.get(b3)) == null) {
                    value2 = r4.J8(f0, b3, map);
                }
                list.Z(n, value2);
            }
        }
        else {
            list.M();
            if (t2 != null) {
                for (final y4.b b4 : t2) {
                    Long value3;
                    if ((value3 = map.get(b4)) == null) {
                        value3 = r4.J8(f0, b4, map);
                    }
                    list.l(value3);
                }
            }
        }
        final String a2 = a.A1();
        if (a2 != null) {
            Table.nativeSetString(nativePtr, b.q, rowWithPrimaryKey, a2, false);
        }
        else {
            Table.nativeSetNull(nativePtr, b.q, rowWithPrimaryKey, false);
        }
        final String w1 = a.w1();
        final long r = b.r;
        if (w1 != null) {
            Table.nativeSetString(nativePtr, r, rowWithPrimaryKey, w1, false);
        }
        else {
            Table.nativeSetNull(nativePtr, r, rowWithPrimaryKey, false);
        }
        return rowWithPrimaryKey;
    }
    
    public static void g9(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(y4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(y4.a.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final y4.a a = (y4.a)iterator.next();
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
            Table.nativeSetLong(nativePtr, b.f, rowWithPrimaryKey, a.d(), false);
            Table.nativeSetLong(nativePtr, b.g, rowWithPrimaryKey, a.c(), false);
            final w4.i x3 = a.x1();
            if (x3 != null) {
                Long value;
                if ((value = map.get(x3)) == null) {
                    value = l4.X8(f0, x3, map);
                }
                Table.nativeSetLink(nativePtr, b.h, rowWithPrimaryKey, value, false);
            }
            else {
                Table.nativeNullifyLink(nativePtr, b.h, rowWithPrimaryKey);
            }
            Table.nativeSetLong(nativePtr, b.i, rowWithPrimaryKey, a.g1(), false);
            final String l1 = a.l1();
            final long j = b.j;
            if (l1 != null) {
                Table.nativeSetString(nativePtr, j, rowWithPrimaryKey, l1, false);
            }
            else {
                Table.nativeSetNull(nativePtr, j, rowWithPrimaryKey, false);
            }
            final String k1 = a.K1();
            final long i = b.k;
            if (k1 != null) {
                Table.nativeSetString(nativePtr, i, rowWithPrimaryKey, k1, false);
            }
            else {
                Table.nativeSetNull(nativePtr, i, rowWithPrimaryKey, false);
            }
            final String b2 = a.b4();
            final long m = b.l;
            if (b2 != null) {
                Table.nativeSetString(nativePtr, m, rowWithPrimaryKey, b2, false);
            }
            else {
                Table.nativeSetNull(nativePtr, m, rowWithPrimaryKey, false);
            }
            final String u4 = a.u4();
            final long m2 = b.m;
            if (u4 != null) {
                Table.nativeSetString(nativePtr, m2, rowWithPrimaryKey, u4, false);
            }
            else {
                Table.nativeSetNull(nativePtr, m2, rowWithPrimaryKey, false);
            }
            Table.nativeSetBoolean(nativePtr, b.n, rowWithPrimaryKey, a.p7(), false);
            Table.nativeSetBoolean(nativePtr, b.o, rowWithPrimaryKey, a.A0(), false);
            final OsList list = new OsList(x2.R(rowWithPrimaryKey), b.p);
            final l0<y4.b> t2 = a.t2();
            if (t2 != null && t2.size() == list.b0()) {
                for (int size = t2.size(), n = 0; n < size; ++n) {
                    final y4.b b3 = t2.get(n);
                    Long value2;
                    if ((value2 = map.get(b3)) == null) {
                        value2 = r4.J8(f0, b3, map);
                    }
                    list.Z(n, value2);
                }
            }
            else {
                final long n2 = rowWithPrimaryKey;
                list.M();
                rowWithPrimaryKey = n2;
                if (t2 != null) {
                    final Iterator<y4.b> iterator2 = t2.iterator();
                    while (true) {
                        rowWithPrimaryKey = n2;
                        if (!iterator2.hasNext()) {
                            break;
                        }
                        final y4.b b4 = iterator2.next();
                        Long value3;
                        if ((value3 = map.get(b4)) == null) {
                            value3 = r4.J8(f0, b4, map);
                        }
                        list.l(value3);
                    }
                }
            }
            final String a2 = a.A1();
            if (a2 != null) {
                Table.nativeSetString(nativePtr, b.q, rowWithPrimaryKey, a2, false);
            }
            else {
                Table.nativeSetNull(nativePtr, b.q, rowWithPrimaryKey, false);
            }
            final String w1 = a.w1();
            final long r = b.r;
            if (w1 != null) {
                Table.nativeSetString(nativePtr, r, rowWithPrimaryKey, w1, false);
            }
            else {
                Table.nativeSetNull(nativePtr, r, rowWithPrimaryKey, false);
            }
        }
    }
    
    static p4 h9(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(y4.a.class), false, Collections.emptyList());
        final p4 p2 = new p4();
        h.a();
        return p2;
    }
    
    static y4.a i9(final f0 f0, final b b, final y4.a a, final y4.a a2, final Map<n0, p> map, final Set<q> set) {
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(y4.a.class), set);
        osObjectBuilder.L(b.e, a2.a());
        osObjectBuilder.L(b.f, a2.d());
        osObjectBuilder.L(b.g, a2.c());
        final w4.i x1 = a2.x1();
        if (x1 == null) {
            osObjectBuilder.V(b.h);
        }
        else {
            final w4.i i = (w4.i)map.get(x1);
            if (i != null) {
                osObjectBuilder.W(b.h, i);
            }
            else {
                osObjectBuilder.W(b.h, l4.N8(f0, (l4.b)f0.H().j(w4.i.class), x1, true, map, set));
            }
        }
        osObjectBuilder.L(b.i, a2.g1());
        osObjectBuilder.d0(b.j, a2.l1());
        osObjectBuilder.d0(b.k, a2.K1());
        osObjectBuilder.d0(b.l, a2.b4());
        osObjectBuilder.d0(b.m, a2.u4());
        osObjectBuilder.n(b.n, a2.p7());
        osObjectBuilder.n(b.o, a2.A0());
        final l0<y4.b> t2 = a2.t2();
        if (t2 != null) {
            final l0<n0> l0 = new l0<n0>();
            for (int j = 0; j < t2.size(); ++j) {
                final y4.b b2 = t2.get(j);
                y4.b z8 = (y4.b)map.get(b2);
                if (z8 == null) {
                    z8 = r4.z8(f0, (r4.b)f0.H().j(y4.b.class), b2, true, map, set);
                }
                l0.add(z8);
            }
            osObjectBuilder.Z(b.p, l0);
        }
        else {
            osObjectBuilder.Z(b.p, new l0<n0>());
        }
        osObjectBuilder.d0(b.q, a2.A1());
        osObjectBuilder.d0(b.r, a2.w1());
        osObjectBuilder.i0();
        return a;
    }
    
    @Override
    public boolean A0() {
        this.Y.f().h();
        return this.Y.g().l(this.X.o);
    }
    
    @Override
    public String A1() {
        this.Y.f().h();
        return this.Y.g().U(this.X.q);
    }
    
    @Override
    public void C1(final String s) {
        if (this.Y.i()) {
            if (!this.Y.d()) {
                return;
            }
            final r g = this.Y.g();
            if (s != null) {
                g.g().t0(this.X.j, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'email' to null.");
        }
        else {
            this.Y.f().h();
            if (s != null) {
                this.Y.g().d(this.X.j, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'email' to null.");
        }
    }
    
    @Override
    public void F3(final String s) {
        if (this.Y.i()) {
            if (!this.Y.d()) {
                return;
            }
            final r g = this.Y.g();
            if (s != null) {
                g.g().t0(this.X.l, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'displayNameRooms' to null.");
        }
        else {
            this.Y.f().h();
            if (s != null) {
                this.Y.g().d(this.X.l, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'displayNameRooms' to null.");
        }
    }
    
    @Override
    public void I1(final long n) {
        if (!this.Y.i()) {
            this.Y.f().h();
            this.Y.g().s(this.X.i, n);
            return;
        }
        if (!this.Y.d()) {
            return;
        }
        final r g = this.Y.g();
        g.g().q0(this.X.i, g.l0(), n, true);
    }
    
    @Override
    public String K1() {
        this.Y.f().h();
        return this.Y.g().U(this.X.k);
    }
    
    @Override
    public void Q4(final w4.i i) {
        final f0 f0 = (f0)this.Y.f();
        if (this.Y.i()) {
            if (!this.Y.d()) {
                return;
            }
            if (this.Y.e().contains("teacher")) {
                return;
            }
            w4.i j;
            if ((j = i) != null) {
                j = i;
                if (!p0.j8(i)) {
                    j = f0.G0(i, new q[0]);
                }
            }
            final r g = this.Y.g();
            if (j == null) {
                g.z(this.X.h);
                return;
            }
            this.Y.c(j);
            g.g().p0(this.X.h, g.l0(), ((p)j).S6().g().l0(), true);
        }
        else {
            this.Y.f().h();
            if (i == null) {
                this.Y.g().z(this.X.h);
                return;
            }
            this.Y.c(i);
            this.Y.g().o(this.X.h, ((p)i).S6().g().l0());
        }
    }
    
    @Override
    public c0<?> S6() {
        return this.Y;
    }
    
    @Override
    public void Y0(final String s) {
        if (this.Y.i()) {
            if (!this.Y.d()) {
                return;
            }
            final r g = this.Y.g();
            if (s != null) {
                g.g().t0(this.X.q, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'userText' to null.");
        }
        else {
            this.Y.f().h();
            if (s != null) {
                this.Y.g().d(this.X.q, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'userText' to null.");
        }
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
    public String b4() {
        this.Y.f().h();
        return this.Y.g().U(this.X.l);
    }
    
    @Override
    public long c() {
        this.Y.f().h();
        return this.Y.g().m(this.X.g);
    }
    
    @Override
    public long d() {
        this.Y.f().h();
        return this.Y.g().m(this.X.f);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final p4 p = (p4)o;
        final io.realm.a f = this.Y.f();
        final io.realm.a f2 = p.Y.f();
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
        final String m = this.Y.g().g().M();
        final String i = p.Y.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.Y.g().l0() == p.Y.g().l0();
            }
        }
        else if (i == null) {
            return this.Y.g().l0() == p.Y.g().l0();
        }
        return false;
    }
    
    @Override
    public long g1() {
        this.Y.f().h();
        return this.Y.g().m(this.X.i);
    }
    
    @Override
    public void h(final long n) {
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
    public void h7(final String s) {
        if (this.Y.i()) {
            if (!this.Y.d()) {
                return;
            }
            final r g = this.Y.g();
            if (s != null) {
                g.g().t0(this.X.m, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'displayNameTeacher' to null.");
        }
        else {
            this.Y.f().h();
            if (s != null) {
                this.Y.g().d(this.X.m, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'displayNameTeacher' to null.");
        }
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
    public String l1() {
        this.Y.f().h();
        return this.Y.g().U(this.X.j);
    }
    
    @Override
    public void o1(final String s) {
        if (this.Y.i()) {
            if (!this.Y.d()) {
                return;
            }
            final r g = this.Y.g();
            if (s != null) {
                g.g().t0(this.X.k, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'phone' to null.");
        }
        else {
            this.Y.f().h();
            if (s != null) {
                this.Y.g().d(this.X.k, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'phone' to null.");
        }
    }
    
    @Override
    public boolean p7() {
        this.Y.f().h();
        return this.Y.g().l(this.X.n);
    }
    
    @Override
    public void r1(final boolean b) {
        if (!this.Y.i()) {
            this.Y.f().h();
            this.Y.g().i(this.X.o, b);
            return;
        }
        if (!this.Y.d()) {
            return;
        }
        final r g = this.Y.g();
        g.g().j0(this.X.o, g.l0(), b, true);
    }
    
    @Override
    public void r4(final l0<y4.b> l0) {
        final boolean i = this.Y.i();
        final int n = 0;
        int j = 0;
        l0<y4.b> l2 = l0;
        if (i) {
            if (!this.Y.d()) {
                return;
            }
            if (this.Y.e().contains("timeSlots")) {
                return;
            }
            if ((l2 = l0) != null) {
                l2 = l0;
                if (!l0.G0()) {
                    final f0 f0 = (f0)this.Y.f();
                    l2 = new l0<y4.b>();
                    for (final y4.b b : l0) {
                        y4.b b2;
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
        this.Y.f().h();
        final OsList p = this.Y.g().p(this.X.p);
        if (l2 != null && l2.size() == p.b0()) {
            while (j < l2.size()) {
                final y4.b b3 = l2.get(j);
                this.Y.c(b3);
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
                final y4.b b4 = l2.get(k);
                this.Y.c(b4);
                p.l(((p)b4).S6().g().l0());
            }
        }
    }
    
    @Override
    public l0<y4.b> t2() {
        this.Y.f().h();
        final l0<y4.b> z = this.Z;
        if (z != null) {
            return z;
        }
        return this.Z = new l0<y4.b>(y4.b.class, this.Y.g().p(this.X.p), this.Y.f());
    }
    
    @Override
    public String toString() {
        if (!p0.k8(this)) {
            return "Invalid object";
        }
        final StringBuilder sb = new StringBuilder("RealmOfficeHour = proxy[");
        sb.append("{id:");
        sb.append(this.a());
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
        sb.append("{teacher:");
        String str;
        if (this.x1() != null) {
            str = "RealmTeacher";
        }
        else {
            str = "null";
        }
        sb.append(str);
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
        sb.append("{displayNameRooms:");
        sb.append(this.b4());
        sb.append("}");
        sb.append(",");
        sb.append("{displayNameTeacher:");
        sb.append(this.u4());
        sb.append("}");
        sb.append(",");
        sb.append("{registrationPossible:");
        sb.append(this.p7());
        sb.append("}");
        sb.append(",");
        sb.append("{registered:");
        sb.append(this.A0());
        sb.append("}");
        sb.append(",");
        sb.append("{timeSlots:");
        sb.append("RealmList<RealmOfficeHourTimeSlot>[");
        sb.append(this.t2().size());
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
        if (this.Y.i()) {
            if (!this.Y.d()) {
                return;
            }
            final r g = this.Y.g();
            if (s != null) {
                g.g().t0(this.X.r, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'teacherText' to null.");
        }
        else {
            this.Y.f().h();
            if (s != null) {
                this.Y.g().d(this.X.r, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'teacherText' to null.");
        }
    }
    
    @Override
    public String u4() {
        this.Y.f().h();
        return this.Y.g().U(this.X.m);
    }
    
    @Override
    public void u5(final boolean b) {
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
    public String w1() {
        this.Y.f().h();
        return this.Y.g().U(this.X.r);
    }
    
    @Override
    public w4.i x1() {
        this.Y.f().h();
        if (this.Y.g().G(this.X.h)) {
            return null;
        }
        return this.Y.f().x(w4.i.class, this.Y.g().P(this.X.h), false, Collections.emptyList());
    }
    
    @Override
    public void y4() {
        if (this.Y != null) {
            return;
        }
        final io.realm.a.h h = io.realm.a.W.get();
        this.X = (b)h.c();
        (this.Y = new c0<y4.a>(this)).r(h.e());
        this.Y.s(h.f());
        this.Y.o(h.b());
        this.Y.q(h.d());
    }
    
    public static final class a
    {
        public static final String a = "RealmOfficeHour";
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
            final OsObjectSchemaInfo b = osSchemaInfo.b("RealmOfficeHour");
            this.e = this.b("id", "id", b);
            this.f = this.b("start", "start", b);
            this.g = this.b("end", "end", b);
            this.h = this.b("teacher", "teacher", b);
            this.i = this.b("imageId", "imageId", b);
            this.j = this.b("email", "email", b);
            this.k = this.b("phone", "phone", b);
            this.l = this.b("displayNameRooms", "displayNameRooms", b);
            this.m = this.b("displayNameTeacher", "displayNameTeacher", b);
            this.n = this.b("registrationPossible", "registrationPossible", b);
            this.o = this.b("registered", "registered", b);
            this.p = this.b("timeSlots", "timeSlots", b);
            this.q = this.b("userText", "userText", b);
            this.r = this.b("teacherText", "teacherText", b);
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
