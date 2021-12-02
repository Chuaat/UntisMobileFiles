// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Set;
import java.util.Collections;
import io.realm.internal.r;
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
import java.util.Map;
import io.realm.internal.OsSchemaInfo;
import com.untis.mobile.persistence.realm.e;
import c5.b;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.p;
import c5.c;

public class z5 extends c implements p, a6
{
    private static final String r0 = "";
    private static final OsObjectSchemaInfo s0;
    private b m0;
    private c0<c> n0;
    private l0<c5.b> o0;
    private l0<e> p0;
    private l0<e> q0;
    
    static {
        s0 = C9();
    }
    
    z5() {
        this.n0.p();
    }
    
    public static b A9(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static c B9(final c c, final int a, final int n, final Map<n0, p.a<n0>> map) {
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
            c2.b(c.a());
            c2.G(c.C());
            c2.u0(c.a0());
            c2.u7(c.j2());
            c2.t5(c.i4());
            c2.K2(c.x5());
            c2.M7(c.g2());
            c2.S5(c.E4());
            final int n2 = 0;
            if (a == n) {
                c2.J7(null);
            }
            else {
                final l0<c5.b> o5 = c.o5();
                final l0<c5.b> l0 = new l0<c5.b>();
                c2.J7(l0);
                for (int size = o5.size(), i = 0; i < size; ++i) {
                    l0.add(x5.J8(o5.get(i), a + 1, n, map));
                }
            }
            c2.q(c.r());
            c2.w(c.u());
            c2.F2(c.c4());
            c2.N7(c.G5());
            c2.a4(c.V4());
            c2.o6(c.j5());
            if (a == n) {
                c2.m1(null);
            }
            else {
                final l0<e> p4 = c.p1();
                final l0<e> l2 = new l0<e>();
                c2.m1(l2);
                for (int size2 = p4.size(), j = 0; j < size2; ++j) {
                    l2.add(d1.x8(p4.get(j), a + 1, n, map));
                }
            }
            if (a == n) {
                c2.c7(null);
            }
            else {
                final l0<e> b2 = c.b2();
                final l0<e> l3 = new l0<e>();
                c2.c7(l3);
                for (int size3 = b2.size(), k = n2; k < size3; ++k) {
                    l3.add(d1.x8(b2.get(k), a + 1, n, map));
                }
            }
            c2.Z0(c.H0());
            c2.S0(c.g0());
            c2.P0(c.i1());
            c2.G1(c.K0());
            c2.Z1(c.K6());
            c2.y1(c.k1());
            c2.I5(c.P2());
            c2.E3(c.y2());
            c2.K4(c.x6());
            c2.i3(c.a7());
            c2.y5(c.l4());
            c2.H1(c.O0());
            return c2;
        }
        return null;
    }
    
    private static OsObjectSchemaInfo C9() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmPeriodModel", false, 29, 0);
        final RealmFieldType integer = RealmFieldType.INTEGER;
        b.c("", "id", integer, false, false, true);
        b.c("", "lessonId", integer, false, false, true);
        b.c("", "subjectId", integer, false, false, true);
        b.c("", "startMinute", integer, false, false, true);
        b.c("", "endMinute", integer, false, false, true);
        final RealmFieldType float1 = RealmFieldType.FLOAT;
        b.c("", "startX", float1, false, false, true);
        b.c("", "widthX", float1, false, false, true);
        b.c("", "totalX", integer, false, false, true);
        final RealmFieldType list = RealmFieldType.LIST;
        b.b("", "elements", list, "RealmPeriodElementModel");
        b.c("", "textColor", integer, false, false, true);
        b.c("", "backColor", integer, false, false, true);
        b.c("", "textColorSubject", integer, false, false, true);
        b.c("", "backColorSubject", integer, false, false, true);
        b.c("", "textColorCustom", integer, false, false, true);
        b.c("", "backColorCustom", integer, false, false, true);
        b.b("", "homeWorks", list, "RealmString");
        b.b("", "homeWorksLocal", list, "RealmString");
        final RealmFieldType string = RealmFieldType.STRING;
        b.c("", "info", string, false, false, true);
        b.c("", "local", string, false, false, true);
        b.c("", "lesson", string, false, false, true);
        b.c("", "substitution", string, false, false, true);
        final RealmFieldType boolean1 = RealmFieldType.BOOLEAN;
        b.c("", "hasOfficeHourRegistration", boolean1, false, false, true);
        b.c("", "cancelled", boolean1, false, false, true);
        b.c("", "exam", boolean1, false, false, true);
        b.c("", "irregular", boolean1, false, false, true);
        b.c("", "hide", boolean1, false, false, true);
        b.c("", "hideStartX", float1, false, false, true);
        b.c("", "hideWidthX", float1, false, false, true);
        b.c("", "isOnlinePeriod", boolean1, false, false, true);
        return b.e();
    }
    
    public static c D9(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final ArrayList<String> list = new ArrayList<String>(3);
        if (jsonObject.has("elements")) {
            list.add("elements");
        }
        if (jsonObject.has("homeWorks")) {
            list.add("homeWorks");
        }
        if (jsonObject.has("homeWorksLocal")) {
            list.add("homeWorksLocal");
        }
        final c c = f0.q1(c.class, true, list);
        if (jsonObject.has("id")) {
            if (jsonObject.isNull("id")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
            }
            c.b(jsonObject.getLong("id"));
        }
        if (jsonObject.has("lessonId")) {
            if (jsonObject.isNull("lessonId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'lessonId' to null.");
            }
            c.G(jsonObject.getLong("lessonId"));
        }
        if (jsonObject.has("subjectId")) {
            if (jsonObject.isNull("subjectId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'subjectId' to null.");
            }
            c.u0(jsonObject.getLong("subjectId"));
        }
        if (jsonObject.has("startMinute")) {
            if (jsonObject.isNull("startMinute")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'startMinute' to null.");
            }
            c.u7(jsonObject.getInt("startMinute"));
        }
        if (jsonObject.has("endMinute")) {
            if (jsonObject.isNull("endMinute")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'endMinute' to null.");
            }
            c.t5(jsonObject.getInt("endMinute"));
        }
        if (jsonObject.has("startX")) {
            if (jsonObject.isNull("startX")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'startX' to null.");
            }
            c.K2((float)jsonObject.getDouble("startX"));
        }
        if (jsonObject.has("widthX")) {
            if (jsonObject.isNull("widthX")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'widthX' to null.");
            }
            c.M7((float)jsonObject.getDouble("widthX"));
        }
        if (jsonObject.has("totalX")) {
            if (jsonObject.isNull("totalX")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'totalX' to null.");
            }
            c.S5(jsonObject.getInt("totalX"));
        }
        final boolean has = jsonObject.has("elements");
        final int n = 0;
        if (has) {
            if (jsonObject.isNull("elements")) {
                c.J7(null);
            }
            else {
                c.o5().clear();
                final JSONArray jsonArray = jsonObject.getJSONArray("elements");
                for (int i = 0; i < jsonArray.length(); ++i) {
                    c.o5().add(x5.L8(f0, jsonArray.getJSONObject(i), b));
                }
            }
        }
        if (jsonObject.has("textColor")) {
            if (jsonObject.isNull("textColor")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'textColor' to null.");
            }
            c.q(jsonObject.getInt("textColor"));
        }
        if (jsonObject.has("backColor")) {
            if (jsonObject.isNull("backColor")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'backColor' to null.");
            }
            c.w(jsonObject.getInt("backColor"));
        }
        if (jsonObject.has("textColorSubject")) {
            if (jsonObject.isNull("textColorSubject")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'textColorSubject' to null.");
            }
            c.F2(jsonObject.getInt("textColorSubject"));
        }
        if (jsonObject.has("backColorSubject")) {
            if (jsonObject.isNull("backColorSubject")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'backColorSubject' to null.");
            }
            c.N7(jsonObject.getInt("backColorSubject"));
        }
        if (jsonObject.has("textColorCustom")) {
            if (jsonObject.isNull("textColorCustom")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'textColorCustom' to null.");
            }
            c.a4(jsonObject.getInt("textColorCustom"));
        }
        if (jsonObject.has("backColorCustom")) {
            if (jsonObject.isNull("backColorCustom")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'backColorCustom' to null.");
            }
            c.o6(jsonObject.getInt("backColorCustom"));
        }
        if (jsonObject.has("homeWorks")) {
            if (jsonObject.isNull("homeWorks")) {
                c.m1(null);
            }
            else {
                c.p1().clear();
                final JSONArray jsonArray2 = jsonObject.getJSONArray("homeWorks");
                for (int j = 0; j < jsonArray2.length(); ++j) {
                    c.p1().add(d1.z8(f0, jsonArray2.getJSONObject(j), b));
                }
            }
        }
        if (jsonObject.has("homeWorksLocal")) {
            if (jsonObject.isNull("homeWorksLocal")) {
                c.c7(null);
            }
            else {
                c.b2().clear();
                final JSONArray jsonArray3 = jsonObject.getJSONArray("homeWorksLocal");
                for (int k = n; k < jsonArray3.length(); ++k) {
                    c.b2().add(d1.z8(f0, jsonArray3.getJSONObject(k), b));
                }
            }
        }
        if (jsonObject.has("info")) {
            if (jsonObject.isNull("info")) {
                c.Z0(null);
            }
            else {
                c.Z0(jsonObject.getString("info"));
            }
        }
        if (jsonObject.has("local")) {
            if (jsonObject.isNull("local")) {
                c.S0(null);
            }
            else {
                c.S0(jsonObject.getString("local"));
            }
        }
        if (jsonObject.has("lesson")) {
            if (jsonObject.isNull("lesson")) {
                c.P0(null);
            }
            else {
                c.P0(jsonObject.getString("lesson"));
            }
        }
        if (jsonObject.has("substitution")) {
            if (jsonObject.isNull("substitution")) {
                c.G1(null);
            }
            else {
                c.G1(jsonObject.getString("substitution"));
            }
        }
        if (jsonObject.has("hasOfficeHourRegistration")) {
            if (jsonObject.isNull("hasOfficeHourRegistration")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'hasOfficeHourRegistration' to null.");
            }
            c.Z1(jsonObject.getBoolean("hasOfficeHourRegistration"));
        }
        if (jsonObject.has("cancelled")) {
            if (jsonObject.isNull("cancelled")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'cancelled' to null.");
            }
            c.y1(jsonObject.getBoolean("cancelled"));
        }
        if (jsonObject.has("exam")) {
            if (jsonObject.isNull("exam")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'exam' to null.");
            }
            c.I5(jsonObject.getBoolean("exam"));
        }
        if (jsonObject.has("irregular")) {
            if (jsonObject.isNull("irregular")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'irregular' to null.");
            }
            c.E3(jsonObject.getBoolean("irregular"));
        }
        if (jsonObject.has("hide")) {
            if (jsonObject.isNull("hide")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'hide' to null.");
            }
            c.K4(jsonObject.getBoolean("hide"));
        }
        if (jsonObject.has("hideStartX")) {
            if (jsonObject.isNull("hideStartX")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'hideStartX' to null.");
            }
            c.i3((float)jsonObject.getDouble("hideStartX"));
        }
        if (jsonObject.has("hideWidthX")) {
            if (jsonObject.isNull("hideWidthX")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'hideWidthX' to null.");
            }
            c.y5((float)jsonObject.getDouble("hideWidthX"));
        }
        if (jsonObject.has("isOnlinePeriod")) {
            if (jsonObject.isNull("isOnlinePeriod")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'isOnlinePeriod' to null.");
            }
            c.H1(jsonObject.getBoolean("isOnlinePeriod"));
        }
        return c;
    }
    
    @TargetApi(11)
    public static c E9(final f0 f0, final JsonReader jsonReader) throws IOException {
        final c c = new c();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
                c.b(jsonReader.nextLong());
            }
            else if (nextName.equals("lessonId")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'lessonId' to null.");
                }
                c.G(jsonReader.nextLong());
            }
            else if (nextName.equals("subjectId")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'subjectId' to null.");
                }
                c.u0(jsonReader.nextLong());
            }
            else if (nextName.equals("startMinute")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'startMinute' to null.");
                }
                c.u7(jsonReader.nextInt());
            }
            else if (nextName.equals("endMinute")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'endMinute' to null.");
                }
                c.t5(jsonReader.nextInt());
            }
            else if (nextName.equals("startX")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'startX' to null.");
                }
                c.K2((float)jsonReader.nextDouble());
            }
            else if (nextName.equals("widthX")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'widthX' to null.");
                }
                c.M7((float)jsonReader.nextDouble());
            }
            else if (nextName.equals("totalX")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'totalX' to null.");
                }
                c.S5(jsonReader.nextInt());
            }
            else {
                if (nextName.equals("elements")) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.skipValue();
                        c.J7(null);
                        continue;
                    }
                    c.J7(new l0<c5.b>());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        c.o5().add(x5.M8(f0, jsonReader));
                    }
                }
                else if (nextName.equals("textColor")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        c.q(jsonReader.nextInt());
                        continue;
                    }
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'textColor' to null.");
                }
                else if (nextName.equals("backColor")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        c.w(jsonReader.nextInt());
                        continue;
                    }
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'backColor' to null.");
                }
                else if (nextName.equals("textColorSubject")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        c.F2(jsonReader.nextInt());
                        continue;
                    }
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'textColorSubject' to null.");
                }
                else if (nextName.equals("backColorSubject")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        c.N7(jsonReader.nextInt());
                        continue;
                    }
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'backColorSubject' to null.");
                }
                else if (nextName.equals("textColorCustom")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        c.a4(jsonReader.nextInt());
                        continue;
                    }
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'textColorCustom' to null.");
                }
                else if (nextName.equals("backColorCustom")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        c.o6(jsonReader.nextInt());
                        continue;
                    }
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'backColorCustom' to null.");
                }
                else if (nextName.equals("homeWorks")) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.skipValue();
                        c.m1(null);
                        continue;
                    }
                    c.m1(new l0<e>());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        c.p1().add(d1.A8(f0, jsonReader));
                    }
                }
                else if (nextName.equals("homeWorksLocal")) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.skipValue();
                        c.c7(null);
                        continue;
                    }
                    c.c7(new l0<e>());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        c.b2().add(d1.A8(f0, jsonReader));
                    }
                }
                else if (nextName.equals("info")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        c.Z0(jsonReader.nextString());
                        continue;
                    }
                    jsonReader.skipValue();
                    c.Z0(null);
                    continue;
                }
                else if (nextName.equals("local")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        c.S0(jsonReader.nextString());
                        continue;
                    }
                    jsonReader.skipValue();
                    c.S0(null);
                    continue;
                }
                else if (nextName.equals("lesson")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        c.P0(jsonReader.nextString());
                        continue;
                    }
                    jsonReader.skipValue();
                    c.P0(null);
                    continue;
                }
                else if (nextName.equals("substitution")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        c.G1(jsonReader.nextString());
                        continue;
                    }
                    jsonReader.skipValue();
                    c.G1(null);
                    continue;
                }
                else if (nextName.equals("hasOfficeHourRegistration")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        c.Z1(jsonReader.nextBoolean());
                        continue;
                    }
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'hasOfficeHourRegistration' to null.");
                }
                else if (nextName.equals("cancelled")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        c.y1(jsonReader.nextBoolean());
                        continue;
                    }
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'cancelled' to null.");
                }
                else if (nextName.equals("exam")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        c.I5(jsonReader.nextBoolean());
                        continue;
                    }
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'exam' to null.");
                }
                else if (nextName.equals("irregular")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        c.E3(jsonReader.nextBoolean());
                        continue;
                    }
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'irregular' to null.");
                }
                else if (nextName.equals("hide")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        c.K4(jsonReader.nextBoolean());
                        continue;
                    }
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'hide' to null.");
                }
                else if (nextName.equals("hideStartX")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        c.i3((float)jsonReader.nextDouble());
                        continue;
                    }
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'hideStartX' to null.");
                }
                else if (nextName.equals("hideWidthX")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        c.y5((float)jsonReader.nextDouble());
                        continue;
                    }
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'hideWidthX' to null.");
                }
                else {
                    if (!nextName.equals("isOnlinePeriod")) {
                        jsonReader.skipValue();
                        continue;
                    }
                    if (jsonReader.peek() != JsonToken.NULL) {
                        c.H1(jsonReader.nextBoolean());
                        continue;
                    }
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'isOnlinePeriod' to null.");
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
        return f0.y0(c, new q[0]);
    }
    
    public static OsObjectSchemaInfo F9() {
        return z5.s0;
    }
    
    public static String G9() {
        return "RealmPeriodModel";
    }
    
    public static long H9(final f0 f0, final c c, final Map<n0, Long> map) {
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
        Table.nativeSetLong(nativePtr, b.e, row, c.a(), false);
        Table.nativeSetLong(nativePtr, b.f, row, c.C(), false);
        Table.nativeSetLong(nativePtr, b.g, row, c.a0(), false);
        Table.nativeSetLong(nativePtr, b.h, row, c.j2(), false);
        Table.nativeSetLong(nativePtr, b.i, row, c.i4(), false);
        Table.nativeSetFloat(nativePtr, b.j, row, c.x5(), false);
        Table.nativeSetFloat(nativePtr, b.k, row, c.g2(), false);
        Table.nativeSetLong(nativePtr, b.l, row, c.E4(), false);
        final l0<c5.b> o5 = c.o5();
        if (o5 != null) {
            final OsList list = new OsList(x2.R(row), b.m);
            for (final c5.b b2 : o5) {
                Long value;
                if ((value = map.get(b2)) == null) {
                    value = x5.P8(f0, b2, map);
                }
                list.l(value);
            }
        }
        Table.nativeSetLong(nativePtr, b.n, row, c.r(), false);
        Table.nativeSetLong(nativePtr, b.o, row, c.u(), false);
        Table.nativeSetLong(nativePtr, b.p, row, c.c4(), false);
        Table.nativeSetLong(nativePtr, b.q, row, c.G5(), false);
        Table.nativeSetLong(nativePtr, b.r, row, c.V4(), false);
        Table.nativeSetLong(nativePtr, b.s, row, c.j5(), false);
        final l0<e> p4 = c.p1();
        if (p4 != null) {
            final OsList list2 = new OsList(x2.R(row), b.t);
            for (final e e : p4) {
                Long value2;
                if ((value2 = map.get(e)) == null) {
                    value2 = d1.D8(f0, e, map);
                }
                list2.l(value2);
            }
        }
        final l0<e> b3 = c.b2();
        if (b3 != null) {
            final OsList list3 = new OsList(x2.R(row), b.u);
            for (final e e2 : b3) {
                Long value3;
                if ((value3 = map.get(e2)) == null) {
                    value3 = d1.D8(f0, e2, map);
                }
                list3.l(value3);
            }
        }
        final String h0 = c.H0();
        if (h0 != null) {
            Table.nativeSetString(nativePtr, b.v, row, h0, false);
        }
        final String g0 = c.g0();
        if (g0 != null) {
            Table.nativeSetString(nativePtr, b.w, row, g0, false);
        }
        final String i1 = c.i1();
        if (i1 != null) {
            Table.nativeSetString(nativePtr, b.x, row, i1, false);
        }
        final String k0 = c.K0();
        if (k0 != null) {
            Table.nativeSetString(nativePtr, b.y, row, k0, false);
        }
        Table.nativeSetBoolean(nativePtr, b.z, row, c.K6(), false);
        Table.nativeSetBoolean(nativePtr, b.A, row, c.k1(), false);
        Table.nativeSetBoolean(nativePtr, b.B, row, c.P2(), false);
        Table.nativeSetBoolean(nativePtr, b.C, row, c.y2(), false);
        Table.nativeSetBoolean(nativePtr, b.D, row, c.x6(), false);
        Table.nativeSetFloat(nativePtr, b.E, row, c.a7(), false);
        Table.nativeSetFloat(nativePtr, b.F, row, c.l4(), false);
        Table.nativeSetBoolean(nativePtr, b.G, row, c.O0(), false);
        return row;
    }
    
    public static void I9(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
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
            Table.nativeSetLong(nativePtr, b.e, row, c.a(), false);
            Table.nativeSetLong(nativePtr, b.f, row, c.C(), false);
            Table.nativeSetLong(nativePtr, b.g, row, c.a0(), false);
            Table.nativeSetLong(nativePtr, b.h, row, c.j2(), false);
            Table.nativeSetLong(nativePtr, b.i, row, c.i4(), false);
            Table.nativeSetFloat(nativePtr, b.j, row, c.x5(), false);
            Table.nativeSetFloat(nativePtr, b.k, row, c.g2(), false);
            Table.nativeSetLong(nativePtr, b.l, row, c.E4(), false);
            final l0<c5.b> o5 = c.o5();
            if (o5 != null) {
                final OsList list = new OsList(x2.R(row), b.m);
                for (final c5.b b2 : o5) {
                    Long value;
                    if ((value = map.get(b2)) == null) {
                        value = x5.P8(f0, b2, map);
                    }
                    list.l(value);
                }
            }
            Table.nativeSetLong(nativePtr, b.n, row, c.r(), false);
            Table.nativeSetLong(nativePtr, b.o, row, c.u(), false);
            Table.nativeSetLong(nativePtr, b.p, row, c.c4(), false);
            Table.nativeSetLong(nativePtr, b.q, row, c.G5(), false);
            Table.nativeSetLong(nativePtr, b.r, row, c.V4(), false);
            Table.nativeSetLong(nativePtr, b.s, row, c.j5(), false);
            final l0<e> p4 = c.p1();
            if (p4 != null) {
                final OsList list2 = new OsList(x2.R(row), b.t);
                for (final e e : p4) {
                    Long value2;
                    if ((value2 = map.get(e)) == null) {
                        value2 = d1.D8(f0, e, map);
                    }
                    list2.l(value2);
                }
            }
            final l0<e> b3 = c.b2();
            if (b3 != null) {
                final OsList list3 = new OsList(x2.R(row), b.u);
                for (final e e2 : b3) {
                    Long value3;
                    if ((value3 = map.get(e2)) == null) {
                        value3 = d1.D8(f0, e2, map);
                    }
                    list3.l(value3);
                }
            }
            final String h0 = c.H0();
            if (h0 != null) {
                Table.nativeSetString(nativePtr, b.v, row, h0, false);
            }
            final String g0 = c.g0();
            if (g0 != null) {
                Table.nativeSetString(nativePtr, b.w, row, g0, false);
            }
            final String i1 = c.i1();
            if (i1 != null) {
                Table.nativeSetString(nativePtr, b.x, row, i1, false);
            }
            final String k0 = c.K0();
            if (k0 != null) {
                Table.nativeSetString(nativePtr, b.y, row, k0, false);
            }
            Table.nativeSetBoolean(nativePtr, b.z, row, c.K6(), false);
            Table.nativeSetBoolean(nativePtr, b.A, row, c.k1(), false);
            Table.nativeSetBoolean(nativePtr, b.B, row, c.P2(), false);
            Table.nativeSetBoolean(nativePtr, b.C, row, c.y2(), false);
            Table.nativeSetBoolean(nativePtr, b.D, row, c.x6(), false);
            Table.nativeSetFloat(nativePtr, b.E, row, c.a7(), false);
            Table.nativeSetFloat(nativePtr, b.F, row, c.l4(), false);
            Table.nativeSetBoolean(nativePtr, b.G, row, c.O0(), false);
        }
    }
    
    public static long J9(final f0 f0, final c c, final Map<n0, Long> map) {
        if (c instanceof p && !p0.h8(c)) {
            final p p3 = (p)c;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(c.class);
        long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(c.class);
        long row = OsObject.createRow(x2);
        map.put(c, row);
        Table.nativeSetLong(nativePtr, b.e, row, c.a(), false);
        Table.nativeSetLong(nativePtr, b.f, row, c.C(), false);
        Table.nativeSetLong(nativePtr, b.g, row, c.a0(), false);
        Table.nativeSetLong(nativePtr, b.h, row, c.j2(), false);
        Table.nativeSetLong(nativePtr, b.i, row, c.i4(), false);
        Table.nativeSetFloat(nativePtr, b.j, row, c.x5(), false);
        Table.nativeSetFloat(nativePtr, b.k, row, c.g2(), false);
        Table.nativeSetLong(nativePtr, b.l, row, c.E4(), false);
        final OsList list = new OsList(x2.R(row), b.m);
        final l0<c5.b> o5 = c.o5();
        if (o5 != null && o5.size() == list.b0()) {
            for (int size = o5.size(), i = 0; i < size; ++i) {
                final c5.b b2 = o5.get(i);
                Long value;
                if ((value = map.get(b2)) == null) {
                    value = x5.R8(f0, b2, map);
                }
                list.Z(i, value);
            }
        }
        else {
            final long n = row;
            list.M();
            row = n;
            if (o5 != null) {
                final Iterator<c5.b> iterator = o5.iterator();
                while (true) {
                    row = n;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    final c5.b b3 = iterator.next();
                    Long value2;
                    if ((value2 = map.get(b3)) == null) {
                        value2 = x5.R8(f0, b3, map);
                    }
                    list.l(value2);
                }
            }
        }
        Table.nativeSetLong(nativePtr, b.n, row, c.r(), false);
        Table.nativeSetLong(nativePtr, b.o, row, c.u(), false);
        Table.nativeSetLong(nativePtr, b.p, row, c.c4(), false);
        Table.nativeSetLong(nativePtr, b.q, row, c.G5(), false);
        Table.nativeSetLong(nativePtr, b.r, row, c.V4(), false);
        Table.nativeSetLong(nativePtr, b.s, row, c.j5(), false);
        final OsList list2 = new OsList(x2.R(row), b.t);
        final l0<e> p4 = c.p1();
        if (p4 != null && p4.size() == list2.b0()) {
            for (int size2 = p4.size(), j = 0; j < size2; ++j) {
                final e e = p4.get(j);
                Long value3;
                if ((value3 = map.get(e)) == null) {
                    value3 = d1.F8(f0, e, map);
                }
                list2.Z(j, value3);
            }
        }
        else {
            final long n2 = nativePtr;
            list2.M();
            nativePtr = n2;
            if (p4 != null) {
                final Iterator<e> iterator2 = p4.iterator();
                while (true) {
                    nativePtr = n2;
                    if (!iterator2.hasNext()) {
                        break;
                    }
                    final e e2 = iterator2.next();
                    Long value4;
                    if ((value4 = map.get(e2)) == null) {
                        value4 = d1.F8(f0, e2, map);
                    }
                    list2.l(value4);
                }
            }
        }
        final OsList list3 = new OsList(x2.R(row), b.u);
        final l0<e> b4 = c.b2();
        if (b4 != null && b4.size() == list3.b0()) {
            for (int size3 = b4.size(), k = 0; k < size3; ++k) {
                final e e3 = b4.get(k);
                Long value5;
                if ((value5 = map.get(e3)) == null) {
                    value5 = d1.F8(f0, e3, map);
                }
                list3.Z(k, value5);
            }
        }
        else {
            list3.M();
            if (b4 != null) {
                for (final e e4 : b4) {
                    Long value6;
                    if ((value6 = map.get(e4)) == null) {
                        value6 = d1.F8(f0, e4, map);
                    }
                    list3.l(value6);
                }
            }
        }
        final String h0 = c.H0();
        if (h0 != null) {
            Table.nativeSetString(nativePtr, b.v, row, h0, false);
        }
        else {
            Table.nativeSetNull(nativePtr, b.v, row, false);
        }
        final String g0 = c.g0();
        final long w = b.w;
        if (g0 != null) {
            Table.nativeSetString(nativePtr, w, row, g0, false);
        }
        else {
            Table.nativeSetNull(nativePtr, w, row, false);
        }
        final String i2 = c.i1();
        final long x3 = b.x;
        if (i2 != null) {
            Table.nativeSetString(nativePtr, x3, row, i2, false);
        }
        else {
            Table.nativeSetNull(nativePtr, x3, row, false);
        }
        final String k2 = c.K0();
        final long y = b.y;
        if (k2 != null) {
            Table.nativeSetString(nativePtr, y, row, k2, false);
        }
        else {
            Table.nativeSetNull(nativePtr, y, row, false);
        }
        Table.nativeSetBoolean(nativePtr, b.z, row, c.K6(), false);
        Table.nativeSetBoolean(nativePtr, b.A, row, c.k1(), false);
        Table.nativeSetBoolean(nativePtr, b.B, row, c.P2(), false);
        Table.nativeSetBoolean(nativePtr, b.C, row, c.y2(), false);
        Table.nativeSetBoolean(nativePtr, b.D, row, c.x6(), false);
        Table.nativeSetFloat(nativePtr, b.E, row, c.a7(), false);
        Table.nativeSetFloat(nativePtr, b.F, row, c.l4(), false);
        Table.nativeSetBoolean(nativePtr, b.G, row, c.O0(), false);
        return row;
    }
    
    public static void K9(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
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
            long row = OsObject.createRow(x2);
            map.put(c, row);
            Table.nativeSetLong(nativePtr, b.e, row, c.a(), false);
            Table.nativeSetLong(nativePtr, b.f, row, c.C(), false);
            Table.nativeSetLong(nativePtr, b.g, row, c.a0(), false);
            Table.nativeSetLong(nativePtr, b.h, row, c.j2(), false);
            Table.nativeSetLong(nativePtr, b.i, row, c.i4(), false);
            Table.nativeSetFloat(nativePtr, b.j, row, c.x5(), false);
            Table.nativeSetFloat(nativePtr, b.k, row, c.g2(), false);
            Table.nativeSetLong(nativePtr, b.l, row, c.E4(), false);
            final OsList list = new OsList(x2.R(row), b.m);
            final l0<c5.b> o5 = c.o5();
            if (o5 != null && o5.size() == list.b0()) {
                for (int size = o5.size(), i = 0; i < size; ++i) {
                    final c5.b b2 = o5.get(i);
                    Long value;
                    if ((value = map.get(b2)) == null) {
                        value = x5.R8(f0, b2, map);
                    }
                    list.Z(i, value);
                }
            }
            else {
                final long n = row;
                list.M();
                row = n;
                if (o5 != null) {
                    final Iterator<c5.b> iterator2 = o5.iterator();
                    while (true) {
                        row = n;
                        if (!iterator2.hasNext()) {
                            break;
                        }
                        final c5.b b3 = iterator2.next();
                        Long value2;
                        if ((value2 = map.get(b3)) == null) {
                            value2 = x5.R8(f0, b3, map);
                        }
                        list.l(value2);
                    }
                }
            }
            Table.nativeSetLong(nativePtr, b.n, row, c.r(), false);
            Table.nativeSetLong(nativePtr, b.o, row, c.u(), false);
            Table.nativeSetLong(nativePtr, b.p, row, c.c4(), false);
            Table.nativeSetLong(nativePtr, b.q, row, c.G5(), false);
            Table.nativeSetLong(nativePtr, b.r, row, c.V4(), false);
            Table.nativeSetLong(nativePtr, b.s, row, c.j5(), false);
            final OsList list2 = new OsList(x2.R(row), b.t);
            final l0<e> p4 = c.p1();
            if (p4 != null && p4.size() == list2.b0()) {
                for (int size2 = p4.size(), j = 0; j < size2; ++j) {
                    final e e = p4.get(j);
                    Long value3;
                    if ((value3 = map.get(e)) == null) {
                        value3 = d1.F8(f0, e, map);
                    }
                    list2.Z(j, value3);
                }
            }
            else {
                final long n2 = nativePtr;
                list2.M();
                nativePtr = n2;
                if (p4 != null) {
                    final Iterator<e> iterator3 = p4.iterator();
                    while (true) {
                        nativePtr = n2;
                        if (!iterator3.hasNext()) {
                            break;
                        }
                        final e e2 = iterator3.next();
                        Long value4;
                        if ((value4 = map.get(e2)) == null) {
                            value4 = d1.F8(f0, e2, map);
                        }
                        list2.l(value4);
                    }
                }
            }
            final OsList list3 = new OsList(x2.R(row), b.u);
            final l0<e> b4 = c.b2();
            if (b4 != null && b4.size() == list3.b0()) {
                for (int size3 = b4.size(), k = 0; k < size3; ++k) {
                    final e e3 = b4.get(k);
                    Long value5;
                    if ((value5 = map.get(e3)) == null) {
                        value5 = d1.F8(f0, e3, map);
                    }
                    list3.Z(k, value5);
                }
            }
            else {
                list3.M();
                if (b4 != null) {
                    for (final e e4 : b4) {
                        Long value6;
                        if ((value6 = map.get(e4)) == null) {
                            value6 = d1.F8(f0, e4, map);
                        }
                        list3.l(value6);
                    }
                }
            }
            final String h0 = c.H0();
            if (h0 != null) {
                Table.nativeSetString(nativePtr, b.v, row, h0, false);
            }
            else {
                Table.nativeSetNull(nativePtr, b.v, row, false);
            }
            final String g0 = c.g0();
            final long w = b.w;
            if (g0 != null) {
                Table.nativeSetString(nativePtr, w, row, g0, false);
            }
            else {
                Table.nativeSetNull(nativePtr, w, row, false);
            }
            final String i2 = c.i1();
            final long x3 = b.x;
            if (i2 != null) {
                Table.nativeSetString(nativePtr, x3, row, i2, false);
            }
            else {
                Table.nativeSetNull(nativePtr, x3, row, false);
            }
            final String k2 = c.K0();
            final long y = b.y;
            if (k2 != null) {
                Table.nativeSetString(nativePtr, y, row, k2, false);
            }
            else {
                Table.nativeSetNull(nativePtr, y, row, false);
            }
            Table.nativeSetBoolean(nativePtr, b.z, row, c.K6(), false);
            Table.nativeSetBoolean(nativePtr, b.A, row, c.k1(), false);
            Table.nativeSetBoolean(nativePtr, b.B, row, c.P2(), false);
            Table.nativeSetBoolean(nativePtr, b.C, row, c.y2(), false);
            Table.nativeSetBoolean(nativePtr, b.D, row, c.x6(), false);
            Table.nativeSetFloat(nativePtr, b.E, row, c.a7(), false);
            Table.nativeSetFloat(nativePtr, b.F, row, c.l4(), false);
            Table.nativeSetBoolean(nativePtr, b.G, row, c.O0(), false);
        }
    }
    
    static z5 L9(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(c.class), false, Collections.emptyList());
        final z5 z5 = new z5();
        h.a();
        return z5;
    }
    
    public static c y9(final f0 f0, final b b, final c c, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        final z5 z5 = map.get(c);
        if (z5 != null) {
            return z5;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(c.class), set);
        osObjectBuilder.L(b.e, c.a());
        osObjectBuilder.L(b.f, c.C());
        osObjectBuilder.L(b.g, c.a0());
        osObjectBuilder.K(b.h, c.j2());
        osObjectBuilder.K(b.i, c.i4());
        osObjectBuilder.G(b.j, c.x5());
        osObjectBuilder.G(b.k, c.g2());
        osObjectBuilder.K(b.l, c.E4());
        osObjectBuilder.K(b.n, c.r());
        osObjectBuilder.K(b.o, c.u());
        osObjectBuilder.K(b.p, c.c4());
        osObjectBuilder.K(b.q, c.G5());
        osObjectBuilder.K(b.r, c.V4());
        osObjectBuilder.K(b.s, c.j5());
        osObjectBuilder.d0(b.v, c.H0());
        osObjectBuilder.d0(b.w, c.g0());
        osObjectBuilder.d0(b.x, c.i1());
        osObjectBuilder.d0(b.y, c.K0());
        osObjectBuilder.n(b.z, c.K6());
        osObjectBuilder.n(b.A, c.k1());
        osObjectBuilder.n(b.B, c.P2());
        osObjectBuilder.n(b.C, c.y2());
        osObjectBuilder.n(b.D, c.x6());
        osObjectBuilder.G(b.E, c.a7());
        osObjectBuilder.G(b.F, c.l4());
        osObjectBuilder.n(b.G, c.O0());
        final z5 l9 = L9(f0, osObjectBuilder.f0());
        map.put(c, l9);
        final l0<c5.b> o5 = c.o5();
        final int n = 0;
        if (o5 != null) {
            final l0<c5.b> o6 = l9.o5();
            o6.clear();
            for (int i = 0; i < o5.size(); ++i) {
                final c5.b b3 = o5.get(i);
                c5.b h8 = (c5.b)map.get(b3);
                if (h8 == null) {
                    h8 = x5.H8(f0, (x5.b)f0.H().j(c5.b.class), b3, b2, map, set);
                }
                o6.add(h8);
            }
        }
        final l0<e> p6 = c.p1();
        if (p6 != null) {
            final l0<e> p7 = l9.p1();
            p7.clear();
            for (int j = 0; j < p6.size(); ++j) {
                final e e = p6.get(j);
                e v8 = (e)map.get(e);
                if (v8 == null) {
                    v8 = d1.v8(f0, (d1.b)f0.H().j(e.class), e, b2, map, set);
                }
                p7.add(v8);
            }
        }
        final l0<e> b4 = c.b2();
        if (b4 != null) {
            final l0<e> b5 = l9.b2();
            b5.clear();
            for (int k = n; k < b4.size(); ++k) {
                final e e2 = b4.get(k);
                e v9 = (e)map.get(e2);
                if (v9 == null) {
                    v9 = d1.v8(f0, (d1.b)f0.H().j(e.class), e2, b2, map, set);
                }
                b5.add(v9);
            }
        }
        return l9;
    }
    
    public static c z9(final f0 f0, final b b, final c c, final boolean b2, final Map<n0, p> map, final Set<q> set) {
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
        return y9(f0, b, c, b2, map, set);
    }
    
    @Override
    public long C() {
        this.n0.f().h();
        return this.n0.g().m(this.m0.f);
    }
    
    @Override
    public void E3(final boolean b) {
        if (!this.n0.i()) {
            this.n0.f().h();
            this.n0.g().i(this.m0.C, b);
            return;
        }
        if (!this.n0.d()) {
            return;
        }
        final r g = this.n0.g();
        g.g().j0(this.m0.C, g.l0(), b, true);
    }
    
    @Override
    public int E4() {
        this.n0.f().h();
        return (int)this.n0.g().m(this.m0.l);
    }
    
    @Override
    public void F2(final int n) {
        if (!this.n0.i()) {
            this.n0.f().h();
            this.n0.g().s(this.m0.p, n);
            return;
        }
        if (!this.n0.d()) {
            return;
        }
        final r g = this.n0.g();
        g.g().q0(this.m0.p, g.l0(), n, true);
    }
    
    @Override
    public void G(final long n) {
        if (!this.n0.i()) {
            this.n0.f().h();
            this.n0.g().s(this.m0.f, n);
            return;
        }
        if (!this.n0.d()) {
            return;
        }
        final r g = this.n0.g();
        g.g().q0(this.m0.f, g.l0(), n, true);
    }
    
    @Override
    public void G1(final String s) {
        if (this.n0.i()) {
            if (!this.n0.d()) {
                return;
            }
            final r g = this.n0.g();
            if (s != null) {
                g.g().t0(this.m0.y, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'substitution' to null.");
        }
        else {
            this.n0.f().h();
            if (s != null) {
                this.n0.g().d(this.m0.y, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'substitution' to null.");
        }
    }
    
    @Override
    public int G5() {
        this.n0.f().h();
        return (int)this.n0.g().m(this.m0.q);
    }
    
    @Override
    public String H0() {
        this.n0.f().h();
        return this.n0.g().U(this.m0.v);
    }
    
    @Override
    public void H1(final boolean b) {
        if (!this.n0.i()) {
            this.n0.f().h();
            this.n0.g().i(this.m0.G, b);
            return;
        }
        if (!this.n0.d()) {
            return;
        }
        final r g = this.n0.g();
        g.g().j0(this.m0.G, g.l0(), b, true);
    }
    
    @Override
    public void I5(final boolean b) {
        if (!this.n0.i()) {
            this.n0.f().h();
            this.n0.g().i(this.m0.B, b);
            return;
        }
        if (!this.n0.d()) {
            return;
        }
        final r g = this.n0.g();
        g.g().j0(this.m0.B, g.l0(), b, true);
    }
    
    @Override
    public void J7(final l0<c5.b> l0) {
        final boolean i = this.n0.i();
        final int n = 0;
        int j = 0;
        l0<c5.b> l2 = l0;
        if (i) {
            if (!this.n0.d()) {
                return;
            }
            if (this.n0.e().contains("elements")) {
                return;
            }
            if ((l2 = l0) != null) {
                l2 = l0;
                if (!l0.G0()) {
                    final f0 f0 = (f0)this.n0.f();
                    l2 = new l0<c5.b>();
                    for (final c5.b b : l0) {
                        c5.b b2;
                        if ((b2 = b) != null) {
                            if (io.realm.p0.j8(b)) {
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
        this.n0.f().h();
        final OsList p = this.n0.g().p(this.m0.m);
        if (l2 != null && l2.size() == p.b0()) {
            while (j < l2.size()) {
                final c5.b b3 = l2.get(j);
                this.n0.c(b3);
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
                final c5.b b4 = l2.get(k);
                this.n0.c(b4);
                p.l(((p)b4).S6().g().l0());
            }
        }
    }
    
    @Override
    public String K0() {
        this.n0.f().h();
        return this.n0.g().U(this.m0.y);
    }
    
    @Override
    public void K2(final float n) {
        if (!this.n0.i()) {
            this.n0.f().h();
            this.n0.g().f(this.m0.j, n);
            return;
        }
        if (!this.n0.d()) {
            return;
        }
        final r g = this.n0.g();
        g.g().o0(this.m0.j, g.l0(), n, true);
    }
    
    @Override
    public void K4(final boolean b) {
        if (!this.n0.i()) {
            this.n0.f().h();
            this.n0.g().i(this.m0.D, b);
            return;
        }
        if (!this.n0.d()) {
            return;
        }
        final r g = this.n0.g();
        g.g().j0(this.m0.D, g.l0(), b, true);
    }
    
    @Override
    public boolean K6() {
        this.n0.f().h();
        return this.n0.g().l(this.m0.z);
    }
    
    @Override
    public void M7(final float n) {
        if (!this.n0.i()) {
            this.n0.f().h();
            this.n0.g().f(this.m0.k, n);
            return;
        }
        if (!this.n0.d()) {
            return;
        }
        final r g = this.n0.g();
        g.g().o0(this.m0.k, g.l0(), n, true);
    }
    
    @Override
    public void N7(final int n) {
        if (!this.n0.i()) {
            this.n0.f().h();
            this.n0.g().s(this.m0.q, n);
            return;
        }
        if (!this.n0.d()) {
            return;
        }
        final r g = this.n0.g();
        g.g().q0(this.m0.q, g.l0(), n, true);
    }
    
    @Override
    public boolean O0() {
        this.n0.f().h();
        return this.n0.g().l(this.m0.G);
    }
    
    @Override
    public void P0(final String s) {
        if (this.n0.i()) {
            if (!this.n0.d()) {
                return;
            }
            final r g = this.n0.g();
            if (s != null) {
                g.g().t0(this.m0.x, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'lesson' to null.");
        }
        else {
            this.n0.f().h();
            if (s != null) {
                this.n0.g().d(this.m0.x, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'lesson' to null.");
        }
    }
    
    @Override
    public boolean P2() {
        this.n0.f().h();
        return this.n0.g().l(this.m0.B);
    }
    
    @Override
    public void S0(final String s) {
        if (this.n0.i()) {
            if (!this.n0.d()) {
                return;
            }
            final r g = this.n0.g();
            if (s != null) {
                g.g().t0(this.m0.w, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'local' to null.");
        }
        else {
            this.n0.f().h();
            if (s != null) {
                this.n0.g().d(this.m0.w, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'local' to null.");
        }
    }
    
    @Override
    public void S5(final int n) {
        if (!this.n0.i()) {
            this.n0.f().h();
            this.n0.g().s(this.m0.l, n);
            return;
        }
        if (!this.n0.d()) {
            return;
        }
        final r g = this.n0.g();
        g.g().q0(this.m0.l, g.l0(), n, true);
    }
    
    @Override
    public c0<?> S6() {
        return this.n0;
    }
    
    @Override
    public int V4() {
        this.n0.f().h();
        return (int)this.n0.g().m(this.m0.r);
    }
    
    @Override
    public void Z0(final String s) {
        if (this.n0.i()) {
            if (!this.n0.d()) {
                return;
            }
            final r g = this.n0.g();
            if (s != null) {
                g.g().t0(this.m0.v, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'info' to null.");
        }
        else {
            this.n0.f().h();
            if (s != null) {
                this.n0.g().d(this.m0.v, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'info' to null.");
        }
    }
    
    @Override
    public void Z1(final boolean b) {
        if (!this.n0.i()) {
            this.n0.f().h();
            this.n0.g().i(this.m0.z, b);
            return;
        }
        if (!this.n0.d()) {
            return;
        }
        final r g = this.n0.g();
        g.g().j0(this.m0.z, g.l0(), b, true);
    }
    
    @Override
    public long a() {
        this.n0.f().h();
        return this.n0.g().m(this.m0.e);
    }
    
    @Override
    public long a0() {
        this.n0.f().h();
        return this.n0.g().m(this.m0.g);
    }
    
    @Override
    public void a4(final int n) {
        if (!this.n0.i()) {
            this.n0.f().h();
            this.n0.g().s(this.m0.r, n);
            return;
        }
        if (!this.n0.d()) {
            return;
        }
        final r g = this.n0.g();
        g.g().q0(this.m0.r, g.l0(), n, true);
    }
    
    @Override
    public float a7() {
        this.n0.f().h();
        return this.n0.g().Q(this.m0.E);
    }
    
    @Override
    public void b(final long n) {
        if (!this.n0.i()) {
            this.n0.f().h();
            this.n0.g().s(this.m0.e, n);
            return;
        }
        if (!this.n0.d()) {
            return;
        }
        final r g = this.n0.g();
        g.g().q0(this.m0.e, g.l0(), n, true);
    }
    
    @Override
    public l0<e> b2() {
        this.n0.f().h();
        final l0<e> q0 = this.q0;
        if (q0 != null) {
            return q0;
        }
        return this.q0 = new l0<e>(e.class, this.n0.g().p(this.m0.u), this.n0.f());
    }
    
    @Override
    public int c4() {
        this.n0.f().h();
        return (int)this.n0.g().m(this.m0.p);
    }
    
    @Override
    public void c7(final l0<e> l0) {
        final boolean i = this.n0.i();
        final int n = 0;
        int j = 0;
        l0<e> l2 = l0;
        if (i) {
            if (!this.n0.d()) {
                return;
            }
            if (this.n0.e().contains("homeWorksLocal")) {
                return;
            }
            if ((l2 = l0) != null) {
                l2 = l0;
                if (!l0.G0()) {
                    final f0 f0 = (f0)this.n0.f();
                    l2 = new l0<e>();
                    for (final e e : l0) {
                        e e2;
                        if ((e2 = e) != null) {
                            if (io.realm.p0.j8(e)) {
                                e2 = e;
                            }
                            else {
                                e2 = f0.y0(e, new q[0]);
                            }
                        }
                        l2.add(e2);
                    }
                }
            }
        }
        this.n0.f().h();
        final OsList p = this.n0.g().p(this.m0.u);
        if (l2 != null && l2.size() == p.b0()) {
            while (j < l2.size()) {
                final e e3 = l2.get(j);
                this.n0.c(e3);
                p.Z(j, ((p)e3).S6().g().l0());
                ++j;
            }
        }
        else {
            p.M();
            if (l2 == null) {
                return;
            }
            for (int size = l2.size(), k = n; k < size; ++k) {
                final e e4 = l2.get(k);
                this.n0.c(e4);
                p.l(((p)e4).S6().g().l0());
            }
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
        final z5 z5 = (z5)o;
        final io.realm.a f = this.n0.f();
        final io.realm.a f2 = z5.n0.f();
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
        final String m = this.n0.g().g().M();
        final String i = z5.n0.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.n0.g().l0() == z5.n0.g().l0();
            }
        }
        else if (i == null) {
            return this.n0.g().l0() == z5.n0.g().l0();
        }
        return false;
    }
    
    @Override
    public String g0() {
        this.n0.f().h();
        return this.n0.g().U(this.m0.w);
    }
    
    @Override
    public float g2() {
        this.n0.f().h();
        return this.n0.g().Q(this.m0.k);
    }
    
    @Override
    public int hashCode() {
        final String path = this.n0.f().getPath();
        final String m = this.n0.g().g().M();
        final long l0 = this.n0.g().l0();
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
    public String i1() {
        this.n0.f().h();
        return this.n0.g().U(this.m0.x);
    }
    
    @Override
    public void i3(final float n) {
        if (!this.n0.i()) {
            this.n0.f().h();
            this.n0.g().f(this.m0.E, n);
            return;
        }
        if (!this.n0.d()) {
            return;
        }
        final r g = this.n0.g();
        g.g().o0(this.m0.E, g.l0(), n, true);
    }
    
    @Override
    public int i4() {
        this.n0.f().h();
        return (int)this.n0.g().m(this.m0.i);
    }
    
    @Override
    public int j2() {
        this.n0.f().h();
        return (int)this.n0.g().m(this.m0.h);
    }
    
    @Override
    public int j5() {
        this.n0.f().h();
        return (int)this.n0.g().m(this.m0.s);
    }
    
    @Override
    public boolean k1() {
        this.n0.f().h();
        return this.n0.g().l(this.m0.A);
    }
    
    @Override
    public float l4() {
        this.n0.f().h();
        return this.n0.g().Q(this.m0.F);
    }
    
    @Override
    public void m1(final l0<e> l0) {
        final boolean i = this.n0.i();
        final int n = 0;
        int j = 0;
        l0<e> l2 = l0;
        if (i) {
            if (!this.n0.d()) {
                return;
            }
            if (this.n0.e().contains("homeWorks")) {
                return;
            }
            if ((l2 = l0) != null) {
                l2 = l0;
                if (!l0.G0()) {
                    final f0 f0 = (f0)this.n0.f();
                    l2 = new l0<e>();
                    for (final e e : l0) {
                        e e2;
                        if ((e2 = e) != null) {
                            if (io.realm.p0.j8(e)) {
                                e2 = e;
                            }
                            else {
                                e2 = f0.y0(e, new q[0]);
                            }
                        }
                        l2.add(e2);
                    }
                }
            }
        }
        this.n0.f().h();
        final OsList p = this.n0.g().p(this.m0.t);
        if (l2 != null && l2.size() == p.b0()) {
            while (j < l2.size()) {
                final e e3 = l2.get(j);
                this.n0.c(e3);
                p.Z(j, ((p)e3).S6().g().l0());
                ++j;
            }
        }
        else {
            p.M();
            if (l2 == null) {
                return;
            }
            for (int size = l2.size(), k = n; k < size; ++k) {
                final e e4 = l2.get(k);
                this.n0.c(e4);
                p.l(((p)e4).S6().g().l0());
            }
        }
    }
    
    @Override
    public l0<c5.b> o5() {
        this.n0.f().h();
        final l0<c5.b> o0 = this.o0;
        if (o0 != null) {
            return o0;
        }
        return this.o0 = new l0<c5.b>(c5.b.class, this.n0.g().p(this.m0.m), this.n0.f());
    }
    
    @Override
    public void o6(final int n) {
        if (!this.n0.i()) {
            this.n0.f().h();
            this.n0.g().s(this.m0.s, n);
            return;
        }
        if (!this.n0.d()) {
            return;
        }
        final r g = this.n0.g();
        g.g().q0(this.m0.s, g.l0(), n, true);
    }
    
    @Override
    public l0<e> p1() {
        this.n0.f().h();
        final l0<e> p0 = this.p0;
        if (p0 != null) {
            return p0;
        }
        return this.p0 = new l0<e>(e.class, this.n0.g().p(this.m0.t), this.n0.f());
    }
    
    @Override
    public void q(final int n) {
        if (!this.n0.i()) {
            this.n0.f().h();
            this.n0.g().s(this.m0.n, n);
            return;
        }
        if (!this.n0.d()) {
            return;
        }
        final r g = this.n0.g();
        g.g().q0(this.m0.n, g.l0(), n, true);
    }
    
    @Override
    public int r() {
        this.n0.f().h();
        return (int)this.n0.g().m(this.m0.n);
    }
    
    @Override
    public void t5(final int n) {
        if (!this.n0.i()) {
            this.n0.f().h();
            this.n0.g().s(this.m0.i, n);
            return;
        }
        if (!this.n0.d()) {
            return;
        }
        final r g = this.n0.g();
        g.g().q0(this.m0.i, g.l0(), n, true);
    }
    
    @Override
    public String toString() {
        if (!io.realm.p0.k8(this)) {
            return "Invalid object";
        }
        final StringBuilder sb = new StringBuilder("RealmPeriodModel = proxy[");
        sb.append("{id:");
        sb.append(this.a());
        sb.append("}");
        sb.append(",");
        sb.append("{lessonId:");
        sb.append(this.C());
        sb.append("}");
        sb.append(",");
        sb.append("{subjectId:");
        sb.append(this.a0());
        sb.append("}");
        sb.append(",");
        sb.append("{startMinute:");
        sb.append(this.j2());
        sb.append("}");
        sb.append(",");
        sb.append("{endMinute:");
        sb.append(this.i4());
        sb.append("}");
        sb.append(",");
        sb.append("{startX:");
        sb.append(this.x5());
        sb.append("}");
        sb.append(",");
        sb.append("{widthX:");
        sb.append(this.g2());
        sb.append("}");
        sb.append(",");
        sb.append("{totalX:");
        sb.append(this.E4());
        sb.append("}");
        sb.append(",");
        sb.append("{elements:");
        sb.append("RealmList<RealmPeriodElementModel>[");
        sb.append(this.o5().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{textColor:");
        sb.append(this.r());
        sb.append("}");
        sb.append(",");
        sb.append("{backColor:");
        sb.append(this.u());
        sb.append("}");
        sb.append(",");
        sb.append("{textColorSubject:");
        sb.append(this.c4());
        sb.append("}");
        sb.append(",");
        sb.append("{backColorSubject:");
        sb.append(this.G5());
        sb.append("}");
        sb.append(",");
        sb.append("{textColorCustom:");
        sb.append(this.V4());
        sb.append("}");
        sb.append(",");
        sb.append("{backColorCustom:");
        sb.append(this.j5());
        sb.append("}");
        sb.append(",");
        sb.append("{homeWorks:");
        sb.append("RealmList<RealmString>[");
        sb.append(this.p1().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{homeWorksLocal:");
        sb.append("RealmList<RealmString>[");
        sb.append(this.b2().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{info:");
        sb.append(this.H0());
        sb.append("}");
        sb.append(",");
        sb.append("{local:");
        sb.append(this.g0());
        sb.append("}");
        sb.append(",");
        sb.append("{lesson:");
        sb.append(this.i1());
        sb.append("}");
        sb.append(",");
        sb.append("{substitution:");
        sb.append(this.K0());
        sb.append("}");
        sb.append(",");
        sb.append("{hasOfficeHourRegistration:");
        sb.append(this.K6());
        sb.append("}");
        sb.append(",");
        sb.append("{cancelled:");
        sb.append(this.k1());
        sb.append("}");
        sb.append(",");
        sb.append("{exam:");
        sb.append(this.P2());
        sb.append("}");
        sb.append(",");
        sb.append("{irregular:");
        sb.append(this.y2());
        sb.append("}");
        sb.append(",");
        sb.append("{hide:");
        sb.append(this.x6());
        sb.append("}");
        sb.append(",");
        sb.append("{hideStartX:");
        sb.append(this.a7());
        sb.append("}");
        sb.append(",");
        sb.append("{hideWidthX:");
        sb.append(this.l4());
        sb.append("}");
        sb.append(",");
        sb.append("{isOnlinePeriod:");
        sb.append(this.O0());
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
    
    @Override
    public int u() {
        this.n0.f().h();
        return (int)this.n0.g().m(this.m0.o);
    }
    
    @Override
    public void u0(final long n) {
        if (!this.n0.i()) {
            this.n0.f().h();
            this.n0.g().s(this.m0.g, n);
            return;
        }
        if (!this.n0.d()) {
            return;
        }
        final r g = this.n0.g();
        g.g().q0(this.m0.g, g.l0(), n, true);
    }
    
    @Override
    public void u7(final int n) {
        if (!this.n0.i()) {
            this.n0.f().h();
            this.n0.g().s(this.m0.h, n);
            return;
        }
        if (!this.n0.d()) {
            return;
        }
        final r g = this.n0.g();
        g.g().q0(this.m0.h, g.l0(), n, true);
    }
    
    @Override
    public void w(final int n) {
        if (!this.n0.i()) {
            this.n0.f().h();
            this.n0.g().s(this.m0.o, n);
            return;
        }
        if (!this.n0.d()) {
            return;
        }
        final r g = this.n0.g();
        g.g().q0(this.m0.o, g.l0(), n, true);
    }
    
    @Override
    public float x5() {
        this.n0.f().h();
        return this.n0.g().Q(this.m0.j);
    }
    
    @Override
    public boolean x6() {
        this.n0.f().h();
        return this.n0.g().l(this.m0.D);
    }
    
    @Override
    public void y1(final boolean b) {
        if (!this.n0.i()) {
            this.n0.f().h();
            this.n0.g().i(this.m0.A, b);
            return;
        }
        if (!this.n0.d()) {
            return;
        }
        final r g = this.n0.g();
        g.g().j0(this.m0.A, g.l0(), b, true);
    }
    
    @Override
    public boolean y2() {
        this.n0.f().h();
        return this.n0.g().l(this.m0.C);
    }
    
    @Override
    public void y4() {
        if (this.n0 != null) {
            return;
        }
        final io.realm.a.h h = io.realm.a.W.get();
        this.m0 = (b)h.c();
        (this.n0 = new c0<c>(this)).r(h.e());
        this.n0.s(h.f());
        this.n0.o(h.b());
        this.n0.q(h.d());
    }
    
    @Override
    public void y5(final float n) {
        if (!this.n0.i()) {
            this.n0.f().h();
            this.n0.g().f(this.m0.F, n);
            return;
        }
        if (!this.n0.d()) {
            return;
        }
        final r g = this.n0.g();
        g.g().o0(this.m0.F, g.l0(), n, true);
    }
    
    public static final class a
    {
        public static final String a = "RealmPeriodModel";
    }
    
    static final class b extends io.realm.internal.c
    {
        long A;
        long B;
        long C;
        long D;
        long E;
        long F;
        long G;
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
        long t;
        long u;
        long v;
        long w;
        long x;
        long y;
        long z;
        
        b(final OsSchemaInfo osSchemaInfo) {
            super(29);
            final OsObjectSchemaInfo b = osSchemaInfo.b("RealmPeriodModel");
            this.e = this.b("id", "id", b);
            this.f = this.b("lessonId", "lessonId", b);
            this.g = this.b("subjectId", "subjectId", b);
            this.h = this.b("startMinute", "startMinute", b);
            this.i = this.b("endMinute", "endMinute", b);
            this.j = this.b("startX", "startX", b);
            this.k = this.b("widthX", "widthX", b);
            this.l = this.b("totalX", "totalX", b);
            this.m = this.b("elements", "elements", b);
            this.n = this.b("textColor", "textColor", b);
            this.o = this.b("backColor", "backColor", b);
            this.p = this.b("textColorSubject", "textColorSubject", b);
            this.q = this.b("backColorSubject", "backColorSubject", b);
            this.r = this.b("textColorCustom", "textColorCustom", b);
            this.s = this.b("backColorCustom", "backColorCustom", b);
            this.t = this.b("homeWorks", "homeWorks", b);
            this.u = this.b("homeWorksLocal", "homeWorksLocal", b);
            this.v = this.b("info", "info", b);
            this.w = this.b("local", "local", b);
            this.x = this.b("lesson", "lesson", b);
            this.y = this.b("substitution", "substitution", b);
            this.z = this.b("hasOfficeHourRegistration", "hasOfficeHourRegistration", b);
            this.A = this.b("cancelled", "cancelled", b);
            this.B = this.b("exam", "exam", b);
            this.C = this.b("irregular", "irregular", b);
            this.D = this.b("hide", "hide", b);
            this.E = this.b("hideStartX", "hideStartX", b);
            this.F = this.b("hideWidthX", "hideWidthX", b);
            this.G = this.b("isOnlinePeriod", "isOnlinePeriod", b);
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
            b2.m = b.m;
            b2.n = b.n;
            b2.o = b.o;
            b2.p = b.p;
            b2.q = b.q;
            b2.r = b.r;
            b2.s = b.s;
            b2.t = b.t;
            b2.u = b.u;
            b2.v = b.v;
            b2.w = b.w;
            b2.x = b.x;
            b2.y = b.y;
            b2.z = b.z;
            b2.A = b.A;
            b2.B = b.B;
            b2.C = b.C;
            b2.D = b.D;
            b2.E = b.E;
            b2.F = b.F;
            b2.G = b.G;
        }
    }
}
