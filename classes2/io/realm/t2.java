// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import io.realm.exceptions.RealmException;
import java.util.Iterator;
import io.realm.internal.OsObject;
import io.realm.internal.Table;
import android.annotation.TargetApi;
import java.io.IOException;
import android.util.JsonToken;
import android.util.JsonReader;
import org.json.JSONException;
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
import q4.b;

public class t2 extends q4.b implements p, u2
{
    private static final String V = "";
    private static final OsObjectSchemaInfo W;
    private b T;
    private c0<q4.b> U;
    
    static {
        W = Q8();
    }
    
    t2() {
        this.U.p();
    }
    
    public static q4.b M8(final f0 f0, final b b, final q4.b b2, final boolean b3, final Map<n0, p> map, final Set<q> set) {
        final t2 t2 = map.get(b2);
        if (t2 != null) {
            return t2;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(q4.b.class), set);
        osObjectBuilder.L(b.e, b2.a());
        osObjectBuilder.d0(b.f, b2.d());
        osObjectBuilder.d0(b.g, b2.c());
        osObjectBuilder.d0(b.h, b2.f());
        osObjectBuilder.L(b.i, b2.J());
        osObjectBuilder.L(b.j, b2.E0());
        osObjectBuilder.L(b.k, b2.V0());
        osObjectBuilder.n(b.l, b2.S());
        osObjectBuilder.n(b.m, b2.v1());
        final t2 z8 = Z8(f0, osObjectBuilder.f0());
        map.put(b2, z8);
        final q4.a w0 = b2.w0();
        q4.a d8;
        if (w0 == null) {
            d8 = null;
        }
        else {
            final q4.a a = (q4.a)map.get(w0);
            if (a != null) {
                z8.Z2(a);
                return z8;
            }
            d8 = r2.D8(f0, (r2.b)f0.H().j(q4.a.class), w0, b3, map, set);
        }
        z8.Z2(d8);
        return z8;
    }
    
    public static q4.b N8(final f0 f0, final b b, final q4.b b2, final boolean b3, final Map<n0, p> map, final Set<q> set) {
        if (b2 instanceof p && !p0.h8(b2)) {
            final p p6 = (p)b2;
            if (p6.S6().f() != null) {
                final io.realm.a f2 = p6.S6().f();
                if (f2.H != f0.H) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
                if (f2.getPath().equals(f0.getPath())) {
                    return b2;
                }
            }
        }
        final io.realm.a.h h = io.realm.a.W.get();
        final p p7 = map.get(b2);
        if (p7 != null) {
            return (q4.b)p7;
        }
        final p p8 = null;
        Object x2 = null;
        boolean b4 = false;
        Label_0232: {
            if (b3) {
                x2 = f0.x2(q4.b.class);
                final long r = ((Table)x2).r(b.e, b2.a());
                if (r == -1L) {
                    b4 = false;
                    x2 = p8;
                    break Label_0232;
                }
                try {
                    h.g(f0, ((Table)x2).R(r), b, false, Collections.emptyList());
                    x2 = new t2();
                    map.put(b2, (p)x2);
                }
                finally {
                    h.a();
                }
            }
            b4 = b3;
        }
        q4.b b5;
        if (b4) {
            b5 = a9(f0, b, (q4.b)x2, b2, map, set);
        }
        else {
            b5 = M8(f0, b, b2, b3, map, set);
        }
        return b5;
    }
    
    public static b O8(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static q4.b P8(final q4.b b, final int a, final int n, final Map<n0, p.a<n0>> map) {
        if (a <= n && b != null) {
            final p.a a2 = map.get(b);
            q4.b b2;
            if (a2 == null) {
                b2 = new q4.b();
                map.put(b, (p.a<n0>)new p.a(a, b2));
            }
            else {
                if (a >= a2.a) {
                    return (q4.b)a2.b;
                }
                b2 = (q4.b)a2.b;
                a2.a = a;
            }
            b2.b(b.a());
            b2.v(b.d());
            b2.x(b.c());
            b2.j(b.f());
            b2.P(b.J());
            b2.h1(b.E0());
            b2.T0(b.V0());
            b2.N(b.S());
            b2.L0(b.v1());
            b2.Z2(r2.F8(b.w0(), a + 1, n, map));
            return b2;
        }
        return null;
    }
    
    private static OsObjectSchemaInfo Q8() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmInfoCenterStudentAbsence", false, 10, 0);
        final RealmFieldType integer = RealmFieldType.INTEGER;
        b.c("", "id", integer, true, false, true);
        final RealmFieldType string = RealmFieldType.STRING;
        b.c("", "start", string, false, false, true);
        b.c("", "end", string, false, false, true);
        b.c("", "text", string, false, false, true);
        b.c("", "studentId", integer, false, false, true);
        b.c("", "klassenId", integer, false, false, true);
        b.c("", "absenceReasonId", integer, false, false, true);
        final RealmFieldType boolean1 = RealmFieldType.BOOLEAN;
        b.c("", "excused", boolean1, false, false, true);
        b.c("", "owner", boolean1, false, false, true);
        b.b("", "excuse", RealmFieldType.OBJECT, "RealmInfoCenterExcuse");
        return b.e();
    }
    
    public static q4.b R8(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final ArrayList<String> list = new ArrayList<String>(1);
        Object x2 = null;
        Label_0146: {
            if (b) {
                x2 = f0.x2(q4.b.class);
                final long e = ((b)f0.H().j(q4.b.class)).e;
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
                        h.g(f0, ((Table)x2).R(r), f0.H().j(q4.b.class), false, Collections.emptyList());
                        x2 = new t2();
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
            if (jsonObject.has("excuse")) {
                list.add("excuse");
            }
            if (!jsonObject.has("id")) {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
            t2 t2;
            if (jsonObject.isNull("id")) {
                t2 = f0.p1((Class<t2>)q4.b.class, null, true, list);
            }
            else {
                t2 = f0.p1((Class<t2>)q4.b.class, jsonObject.getLong("id"), true, list);
            }
            o = t2;
        }
        if (jsonObject.has("start")) {
            if (jsonObject.isNull("start")) {
                ((u2)o).v(null);
            }
            else {
                ((u2)o).v(jsonObject.getString("start"));
            }
        }
        if (jsonObject.has("end")) {
            if (jsonObject.isNull("end")) {
                ((u2)o).x(null);
            }
            else {
                ((u2)o).x(jsonObject.getString("end"));
            }
        }
        if (jsonObject.has("text")) {
            if (jsonObject.isNull("text")) {
                ((u2)o).j(null);
            }
            else {
                ((u2)o).j(jsonObject.getString("text"));
            }
        }
        if (jsonObject.has("studentId")) {
            if (jsonObject.isNull("studentId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'studentId' to null.");
            }
            ((u2)o).P(jsonObject.getLong("studentId"));
        }
        if (jsonObject.has("klassenId")) {
            if (jsonObject.isNull("klassenId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'klassenId' to null.");
            }
            ((u2)o).h1(jsonObject.getLong("klassenId"));
        }
        if (jsonObject.has("absenceReasonId")) {
            if (jsonObject.isNull("absenceReasonId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'absenceReasonId' to null.");
            }
            ((u2)o).T0(jsonObject.getLong("absenceReasonId"));
        }
        if (jsonObject.has("excused")) {
            if (jsonObject.isNull("excused")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'excused' to null.");
            }
            ((u2)o).N(jsonObject.getBoolean("excused"));
        }
        if (jsonObject.has("owner")) {
            if (jsonObject.isNull("owner")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'owner' to null.");
            }
            ((u2)o).L0(jsonObject.getBoolean("owner"));
        }
        if (jsonObject.has("excuse")) {
            if (jsonObject.isNull("excuse")) {
                ((u2)o).Z2(null);
            }
            else {
                ((u2)o).Z2(r2.H8(f0, jsonObject.getJSONObject("excuse"), b));
            }
        }
        return (q4.b)o;
    }
    
    @TargetApi(11)
    public static q4.b S8(final f0 f0, final JsonReader jsonReader) throws IOException {
        final q4.b b = new q4.b();
        jsonReader.beginObject();
        boolean b2 = false;
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
                b.b(jsonReader.nextLong());
                b2 = true;
            }
            else if (nextName.equals("start")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    b.v(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    b.v(null);
                }
            }
            else if (nextName.equals("end")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    b.x(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    b.x(null);
                }
            }
            else if (nextName.equals("text")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    b.j(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    b.j(null);
                }
            }
            else if (nextName.equals("studentId")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'studentId' to null.");
                }
                b.P(jsonReader.nextLong());
            }
            else if (nextName.equals("klassenId")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'klassenId' to null.");
                }
                b.h1(jsonReader.nextLong());
            }
            else if (nextName.equals("absenceReasonId")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'absenceReasonId' to null.");
                }
                b.T0(jsonReader.nextLong());
            }
            else if (nextName.equals("excused")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'excused' to null.");
                }
                b.N(jsonReader.nextBoolean());
            }
            else if (nextName.equals("owner")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'owner' to null.");
                }
                b.L0(jsonReader.nextBoolean());
            }
            else if (nextName.equals("excuse")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    b.Z2(null);
                }
                else {
                    b.Z2(r2.I8(f0, jsonReader));
                }
            }
            else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (b2) {
            return f0.G0(b, new q[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }
    
    public static OsObjectSchemaInfo T8() {
        return t2.W;
    }
    
    public static String U8() {
        return "RealmInfoCenterStudentAbsence";
    }
    
    public static long V8(final f0 f0, final q4.b b, final Map<n0, Long> map) {
        if (b instanceof p && !p0.h8(b)) {
            final p p3 = (p)b;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(q4.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b2 = (b)f0.H().j(q4.b.class);
        final long e = b2.e;
        final Long value = b.a();
        long l;
        if (value != null) {
            l = Table.nativeFindFirstInt(nativePtr, e, b.a());
        }
        else {
            l = -1L;
        }
        if (l == -1L) {
            l = OsObject.createRowWithPrimaryKey(x2, e, b.a());
        }
        else {
            Table.v0(value);
        }
        map.put(b, l);
        final String d = b.d();
        if (d != null) {
            Table.nativeSetString(nativePtr, b2.f, l, d, false);
        }
        final String c = b.c();
        if (c != null) {
            Table.nativeSetString(nativePtr, b2.g, l, c, false);
        }
        final String f2 = b.f();
        if (f2 != null) {
            Table.nativeSetString(nativePtr, b2.h, l, f2, false);
        }
        Table.nativeSetLong(nativePtr, b2.i, l, b.J(), false);
        Table.nativeSetLong(nativePtr, b2.j, l, b.E0(), false);
        Table.nativeSetLong(nativePtr, b2.k, l, b.V0(), false);
        Table.nativeSetBoolean(nativePtr, b2.l, l, b.S(), false);
        Table.nativeSetBoolean(nativePtr, b2.m, l, b.v1(), false);
        final q4.a w0 = b.w0();
        if (w0 != null) {
            Long value2;
            if ((value2 = map.get(w0)) == null) {
                value2 = r2.L8(f0, w0, map);
            }
            Table.nativeSetLink(nativePtr, b2.n, l, value2, false);
        }
        return l;
    }
    
    public static void W8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(q4.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(q4.b.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final q4.b b2 = (q4.b)iterator.next();
            if (map.containsKey(b2)) {
                continue;
            }
            if (b2 instanceof p && !p0.h8(b2)) {
                final p p3 = (p)b2;
                if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                    map.put(b2, p3.S6().g().l0());
                    continue;
                }
            }
            final Long value = b2.a();
            long l;
            if (value != null) {
                l = Table.nativeFindFirstInt(nativePtr, e, b2.a());
            }
            else {
                l = -1L;
            }
            if (l == -1L) {
                l = OsObject.createRowWithPrimaryKey(x2, e, b2.a());
            }
            else {
                Table.v0(value);
            }
            map.put(b2, l);
            final String d = b2.d();
            if (d != null) {
                Table.nativeSetString(nativePtr, b.f, l, d, false);
            }
            final String c = b2.c();
            if (c != null) {
                Table.nativeSetString(nativePtr, b.g, l, c, false);
            }
            final String f2 = b2.f();
            if (f2 != null) {
                Table.nativeSetString(nativePtr, b.h, l, f2, false);
            }
            Table.nativeSetLong(nativePtr, b.i, l, b2.J(), false);
            Table.nativeSetLong(nativePtr, b.j, l, b2.E0(), false);
            Table.nativeSetLong(nativePtr, b.k, l, b2.V0(), false);
            Table.nativeSetBoolean(nativePtr, b.l, l, b2.S(), false);
            Table.nativeSetBoolean(nativePtr, b.m, l, b2.v1(), false);
            final q4.a w0 = b2.w0();
            if (w0 == null) {
                continue;
            }
            Long value2;
            if ((value2 = map.get(w0)) == null) {
                value2 = r2.L8(f0, w0, map);
            }
            x2.p0(b.n, l, value2, false);
        }
    }
    
    public static long X8(final f0 f0, final q4.b b, final Map<n0, Long> map) {
        if (b instanceof p && !p0.h8(b)) {
            final p p3 = (p)b;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(q4.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b2 = (b)f0.H().j(q4.b.class);
        final long e = b2.e;
        long nativeFindFirstInt;
        if (Long.valueOf(b.a()) != null) {
            nativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, e, b.a());
        }
        else {
            nativeFindFirstInt = -1L;
        }
        long rowWithPrimaryKey = nativeFindFirstInt;
        if (nativeFindFirstInt == -1L) {
            rowWithPrimaryKey = OsObject.createRowWithPrimaryKey(x2, e, b.a());
        }
        map.put(b, rowWithPrimaryKey);
        final String d = b.d();
        final long f2 = b2.f;
        if (d != null) {
            Table.nativeSetString(nativePtr, f2, rowWithPrimaryKey, d, false);
        }
        else {
            Table.nativeSetNull(nativePtr, f2, rowWithPrimaryKey, false);
        }
        final String c = b.c();
        final long g = b2.g;
        if (c != null) {
            Table.nativeSetString(nativePtr, g, rowWithPrimaryKey, c, false);
        }
        else {
            Table.nativeSetNull(nativePtr, g, rowWithPrimaryKey, false);
        }
        final String f3 = b.f();
        final long h = b2.h;
        if (f3 != null) {
            Table.nativeSetString(nativePtr, h, rowWithPrimaryKey, f3, false);
        }
        else {
            Table.nativeSetNull(nativePtr, h, rowWithPrimaryKey, false);
        }
        Table.nativeSetLong(nativePtr, b2.i, rowWithPrimaryKey, b.J(), false);
        Table.nativeSetLong(nativePtr, b2.j, rowWithPrimaryKey, b.E0(), false);
        Table.nativeSetLong(nativePtr, b2.k, rowWithPrimaryKey, b.V0(), false);
        Table.nativeSetBoolean(nativePtr, b2.l, rowWithPrimaryKey, b.S(), false);
        Table.nativeSetBoolean(nativePtr, b2.m, rowWithPrimaryKey, b.v1(), false);
        final q4.a w0 = b.w0();
        if (w0 != null) {
            Long value;
            if ((value = map.get(w0)) == null) {
                value = r2.N8(f0, w0, map);
            }
            Table.nativeSetLink(nativePtr, b2.n, rowWithPrimaryKey, value, false);
        }
        else {
            Table.nativeNullifyLink(nativePtr, b2.n, rowWithPrimaryKey);
        }
        return rowWithPrimaryKey;
    }
    
    public static void Y8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(q4.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(q4.b.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final q4.b b2 = (q4.b)iterator.next();
            if (map.containsKey(b2)) {
                continue;
            }
            if (b2 instanceof p && !p0.h8(b2)) {
                final p p3 = (p)b2;
                if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                    map.put(b2, p3.S6().g().l0());
                    continue;
                }
            }
            long nativeFindFirstInt;
            if (Long.valueOf(b2.a()) != null) {
                nativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, e, b2.a());
            }
            else {
                nativeFindFirstInt = -1L;
            }
            long rowWithPrimaryKey = nativeFindFirstInt;
            if (nativeFindFirstInt == -1L) {
                rowWithPrimaryKey = OsObject.createRowWithPrimaryKey(x2, e, b2.a());
            }
            map.put(b2, rowWithPrimaryKey);
            final String d = b2.d();
            if (d != null) {
                Table.nativeSetString(nativePtr, b.f, rowWithPrimaryKey, d, false);
            }
            else {
                Table.nativeSetNull(nativePtr, b.f, rowWithPrimaryKey, false);
            }
            final String c = b2.c();
            final long g = b.g;
            if (c != null) {
                Table.nativeSetString(nativePtr, g, rowWithPrimaryKey, c, false);
            }
            else {
                Table.nativeSetNull(nativePtr, g, rowWithPrimaryKey, false);
            }
            final String f2 = b2.f();
            final long h = b.h;
            if (f2 != null) {
                Table.nativeSetString(nativePtr, h, rowWithPrimaryKey, f2, false);
            }
            else {
                Table.nativeSetNull(nativePtr, h, rowWithPrimaryKey, false);
            }
            Table.nativeSetLong(nativePtr, b.i, rowWithPrimaryKey, b2.J(), false);
            Table.nativeSetLong(nativePtr, b.j, rowWithPrimaryKey, b2.E0(), false);
            Table.nativeSetLong(nativePtr, b.k, rowWithPrimaryKey, b2.V0(), false);
            Table.nativeSetBoolean(nativePtr, b.l, rowWithPrimaryKey, b2.S(), false);
            Table.nativeSetBoolean(nativePtr, b.m, rowWithPrimaryKey, b2.v1(), false);
            final q4.a w0 = b2.w0();
            if (w0 != null) {
                Long value;
                if ((value = map.get(w0)) == null) {
                    value = r2.N8(f0, w0, map);
                }
                Table.nativeSetLink(nativePtr, b.n, rowWithPrimaryKey, value, false);
            }
            else {
                Table.nativeNullifyLink(nativePtr, b.n, rowWithPrimaryKey);
            }
        }
    }
    
    static t2 Z8(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(q4.b.class), false, Collections.emptyList());
        final t2 t2 = new t2();
        h.a();
        return t2;
    }
    
    static q4.b a9(final f0 f0, final b b, final q4.b b2, final q4.b b3, final Map<n0, p> map, final Set<q> set) {
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(q4.b.class), set);
        osObjectBuilder.L(b.e, b3.a());
        osObjectBuilder.d0(b.f, b3.d());
        osObjectBuilder.d0(b.g, b3.c());
        osObjectBuilder.d0(b.h, b3.f());
        osObjectBuilder.L(b.i, b3.J());
        osObjectBuilder.L(b.j, b3.E0());
        osObjectBuilder.L(b.k, b3.V0());
        osObjectBuilder.n(b.l, b3.S());
        osObjectBuilder.n(b.m, b3.v1());
        final q4.a w0 = b3.w0();
        if (w0 == null) {
            osObjectBuilder.V(b.n);
        }
        else {
            final q4.a a = (q4.a)map.get(w0);
            if (a != null) {
                osObjectBuilder.W(b.n, a);
            }
            else {
                osObjectBuilder.W(b.n, r2.D8(f0, (r2.b)f0.H().j(q4.a.class), w0, true, map, set));
            }
        }
        osObjectBuilder.i0();
        return b2;
    }
    
    @Override
    public long E0() {
        this.U.f().h();
        return this.U.g().m(this.T.j);
    }
    
    @Override
    public long J() {
        this.U.f().h();
        return this.U.g().m(this.T.i);
    }
    
    @Override
    public void L0(final boolean b) {
        if (!this.U.i()) {
            this.U.f().h();
            this.U.g().i(this.T.m, b);
            return;
        }
        if (!this.U.d()) {
            return;
        }
        final r g = this.U.g();
        g.g().j0(this.T.m, g.l0(), b, true);
    }
    
    @Override
    public void N(final boolean b) {
        if (!this.U.i()) {
            this.U.f().h();
            this.U.g().i(this.T.l, b);
            return;
        }
        if (!this.U.d()) {
            return;
        }
        final r g = this.U.g();
        g.g().j0(this.T.l, g.l0(), b, true);
    }
    
    @Override
    public void P(final long n) {
        if (!this.U.i()) {
            this.U.f().h();
            this.U.g().s(this.T.i, n);
            return;
        }
        if (!this.U.d()) {
            return;
        }
        final r g = this.U.g();
        g.g().q0(this.T.i, g.l0(), n, true);
    }
    
    @Override
    public boolean S() {
        this.U.f().h();
        return this.U.g().l(this.T.l);
    }
    
    @Override
    public c0<?> S6() {
        return this.U;
    }
    
    @Override
    public void T0(final long n) {
        if (!this.U.i()) {
            this.U.f().h();
            this.U.g().s(this.T.k, n);
            return;
        }
        if (!this.U.d()) {
            return;
        }
        final r g = this.U.g();
        g.g().q0(this.T.k, g.l0(), n, true);
    }
    
    @Override
    public long V0() {
        this.U.f().h();
        return this.U.g().m(this.T.k);
    }
    
    @Override
    public void Z2(final q4.a a) {
        final f0 f0 = (f0)this.U.f();
        if (this.U.i()) {
            if (!this.U.d()) {
                return;
            }
            if (this.U.e().contains("excuse")) {
                return;
            }
            q4.a a2;
            if ((a2 = a) != null) {
                a2 = a;
                if (!p0.j8(a)) {
                    a2 = f0.G0(a, new q[0]);
                }
            }
            final r g = this.U.g();
            if (a2 == null) {
                g.z(this.T.n);
                return;
            }
            this.U.c(a2);
            g.g().p0(this.T.n, g.l0(), ((p)a2).S6().g().l0(), true);
        }
        else {
            this.U.f().h();
            if (a == null) {
                this.U.g().z(this.T.n);
                return;
            }
            this.U.c(a);
            this.U.g().o(this.T.n, ((p)a).S6().g().l0());
        }
    }
    
    @Override
    public long a() {
        this.U.f().h();
        return this.U.g().m(this.T.e);
    }
    
    @Override
    public void b(final long n) {
        if (this.U.i()) {
            return;
        }
        this.U.f().h();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }
    
    @Override
    public String c() {
        this.U.f().h();
        return this.U.g().U(this.T.g);
    }
    
    @Override
    public String d() {
        this.U.f().h();
        return this.U.g().U(this.T.f);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final t2 t2 = (t2)o;
        final io.realm.a f = this.U.f();
        final io.realm.a f2 = t2.U.f();
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
        final String m = this.U.g().g().M();
        final String i = t2.U.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.U.g().l0() == t2.U.g().l0();
            }
        }
        else if (i == null) {
            return this.U.g().l0() == t2.U.g().l0();
        }
        return false;
    }
    
    @Override
    public String f() {
        this.U.f().h();
        return this.U.g().U(this.T.h);
    }
    
    @Override
    public void h1(final long n) {
        if (!this.U.i()) {
            this.U.f().h();
            this.U.g().s(this.T.j, n);
            return;
        }
        if (!this.U.d()) {
            return;
        }
        final r g = this.U.g();
        g.g().q0(this.T.j, g.l0(), n, true);
    }
    
    @Override
    public int hashCode() {
        final String path = this.U.f().getPath();
        final String m = this.U.g().g().M();
        final long l0 = this.U.g().l0();
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
    public void j(final String s) {
        if (this.U.i()) {
            if (!this.U.d()) {
                return;
            }
            final r g = this.U.g();
            if (s != null) {
                g.g().t0(this.T.h, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'text' to null.");
        }
        else {
            this.U.f().h();
            if (s != null) {
                this.U.g().d(this.T.h, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'text' to null.");
        }
    }
    
    @Override
    public String toString() {
        if (!p0.k8(this)) {
            return "Invalid object";
        }
        final StringBuilder sb = new StringBuilder("RealmInfoCenterStudentAbsence = proxy[");
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
        sb.append("{text:");
        sb.append(this.f());
        sb.append("}");
        sb.append(",");
        sb.append("{studentId:");
        sb.append(this.J());
        sb.append("}");
        sb.append(",");
        sb.append("{klassenId:");
        sb.append(this.E0());
        sb.append("}");
        sb.append(",");
        sb.append("{absenceReasonId:");
        sb.append(this.V0());
        sb.append("}");
        sb.append(",");
        sb.append("{excused:");
        sb.append(this.S());
        sb.append("}");
        sb.append(",");
        sb.append("{owner:");
        sb.append(this.v1());
        sb.append("}");
        sb.append(",");
        sb.append("{excuse:");
        String str;
        if (this.w0() != null) {
            str = "RealmInfoCenterExcuse";
        }
        else {
            str = "null";
        }
        sb.append(str);
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
    
    @Override
    public void v(final String s) {
        if (this.U.i()) {
            if (!this.U.d()) {
                return;
            }
            final r g = this.U.g();
            if (s != null) {
                g.g().t0(this.T.f, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'start' to null.");
        }
        else {
            this.U.f().h();
            if (s != null) {
                this.U.g().d(this.T.f, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'start' to null.");
        }
    }
    
    @Override
    public boolean v1() {
        this.U.f().h();
        return this.U.g().l(this.T.m);
    }
    
    @Override
    public q4.a w0() {
        this.U.f().h();
        if (this.U.g().G(this.T.n)) {
            return null;
        }
        return this.U.f().x(q4.a.class, this.U.g().P(this.T.n), false, Collections.emptyList());
    }
    
    @Override
    public void x(final String s) {
        if (this.U.i()) {
            if (!this.U.d()) {
                return;
            }
            final r g = this.U.g();
            if (s != null) {
                g.g().t0(this.T.g, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'end' to null.");
        }
        else {
            this.U.f().h();
            if (s != null) {
                this.U.g().d(this.T.g, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'end' to null.");
        }
    }
    
    @Override
    public void y4() {
        if (this.U != null) {
            return;
        }
        final io.realm.a.h h = io.realm.a.W.get();
        this.T = (b)h.c();
        (this.U = new c0<q4.b>(this)).r(h.e());
        this.U.s(h.f());
        this.U.o(h.b());
        this.U.q(h.d());
    }
    
    public static final class a
    {
        public static final String a = "RealmInfoCenterStudentAbsence";
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
        
        b(final OsSchemaInfo osSchemaInfo) {
            super(10);
            final OsObjectSchemaInfo b = osSchemaInfo.b("RealmInfoCenterStudentAbsence");
            this.e = this.b("id", "id", b);
            this.f = this.b("start", "start", b);
            this.g = this.b("end", "end", b);
            this.h = this.b("text", "text", b);
            this.i = this.b("studentId", "studentId", b);
            this.j = this.b("klassenId", "klassenId", b);
            this.k = this.b("absenceReasonId", "absenceReasonId", b);
            this.l = this.b("excused", "excused", b);
            this.m = this.b("owner", "owner", b);
            this.n = this.b("excuse", "excuse", b);
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
        }
    }
}
