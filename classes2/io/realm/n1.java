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
import java.util.Collections;
import j4.c;
import j4.b;
import w4.d;
import w4.g;
import io.realm.internal.r;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Set;
import java.util.Map;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.p;
import j4.a;

public class n1 extends j4.a implements p, o1
{
    private static final String X = "";
    private static final OsObjectSchemaInfo Y;
    private b V;
    private c0<j4.a> W;
    
    static {
        Y = U8();
    }
    
    n1() {
        this.W.p();
    }
    
    public static j4.a Q8(final f0 f0, final b b, final j4.a a, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        final n1 n1 = map.get(a);
        if (n1 != null) {
            return n1;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(j4.a.class), set);
        osObjectBuilder.L(b.e, a.a());
        osObjectBuilder.L(b.f, a.d());
        osObjectBuilder.L(b.g, a.c());
        osObjectBuilder.d0(b.h, a.f());
        osObjectBuilder.n(b.l, a.S());
        osObjectBuilder.n(b.m, a.v1());
        osObjectBuilder.L(b.o, a.D());
        osObjectBuilder.n(b.p, a.A());
        final n1 d9 = d9(f0, osObjectBuilder.f0());
        map.put(a, d9);
        final g d10 = a.d0();
        if (d10 == null) {
            d9.B5(null);
        }
        else {
            g d11 = (g)map.get(d10);
            if (d11 == null) {
                d11 = h4.D8(f0, (h4.b)f0.H().j(g.class), d10, b2, map, set);
            }
            d9.B5(d11);
        }
        final d t1 = a.t1();
        if (t1 == null) {
            d9.F5(null);
        }
        else {
            d l8 = (d)map.get(t1);
            if (l8 == null) {
                l8 = b4.L8(f0, (b4.b)f0.H().j(d.class), t1, b2, map, set);
            }
            d9.F5(l8);
        }
        final j4.b x4 = a.X4();
        if (x4 == null) {
            d9.v5(null);
        }
        else {
            j4.b b3 = (j4.b)map.get(x4);
            if (b3 == null) {
                b3 = p1.B8(f0, (p1.b)f0.H().j(j4.b.class), x4, b2, map, set);
            }
            d9.v5(b3);
        }
        final c w0 = a.w0();
        if (w0 == null) {
            d9.y3(null);
        }
        else {
            final c c = (c)map.get(w0);
            c d12;
            if (c != null) {
                d12 = c;
            }
            else {
                d12 = r1.D8(f0, (r1.b)f0.H().j(c.class), w0, b2, map, set);
            }
            d9.y3(d12);
        }
        return d9;
    }
    
    public static j4.a R8(final f0 f0, final b b, final j4.a a, final boolean b2, final Map<n0, p> map, final Set<q> set) {
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
            return (j4.a)p7;
        }
        final p p8 = null;
        Object x2 = null;
        boolean b3 = false;
        Label_0233: {
            if (b2) {
                x2 = f0.x2(j4.a.class);
                final long r = ((Table)x2).r(b.e, a.a());
                if (r == -1L) {
                    b3 = false;
                    x2 = p8;
                    break Label_0233;
                }
                try {
                    h.g(f0, ((Table)x2).R(r), b, false, Collections.emptyList());
                    x2 = new n1();
                    map.put(a, (p)x2);
                }
                finally {
                    h.a();
                }
            }
            b3 = b2;
        }
        j4.a a2;
        if (b3) {
            a2 = e9(f0, b, (j4.a)x2, a, map, set);
        }
        else {
            a2 = Q8(f0, b, a, b2, map, set);
        }
        return a2;
    }
    
    public static b S8(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static j4.a T8(final j4.a a, int a2, final int n, final Map<n0, p.a<n0>> map) {
        if (a2 <= n && a != null) {
            final p.a a3 = map.get(a);
            j4.a a4;
            if (a3 == null) {
                a4 = new j4.a();
                map.put(a, (p.a<n0>)new p.a(a2, a4));
            }
            else {
                if (a2 >= a3.a) {
                    return (j4.a)a3.b;
                }
                a4 = (j4.a)a3.b;
                a3.a = a2;
            }
            a4.b(a.a());
            a4.h(a.d());
            a4.i(a.c());
            a4.j(a.f());
            final g d0 = a.d0();
            ++a2;
            a4.B5(h4.F8(d0, a2, n, map));
            a4.F5(b4.N8(a.t1(), a2, n, map));
            a4.v5(p1.D8(a.X4(), a2, n, map));
            a4.N(a.S());
            a4.L0(a.v1());
            a4.y3(r1.F8(a.w0(), a2, n, map));
            a4.y(a.D());
            a4.F(a.A());
            return a4;
        }
        return null;
    }
    
    private static OsObjectSchemaInfo U8() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmAbsence", false, 12, 0);
        final RealmFieldType integer = RealmFieldType.INTEGER;
        b.c("", "id", integer, true, false, true);
        b.c("", "start", integer, false, false, true);
        b.c("", "end", integer, false, false, true);
        b.c("", "text", RealmFieldType.STRING, false, false, true);
        final RealmFieldType object = RealmFieldType.OBJECT;
        b.b("", "student", object, "RealmStudent");
        b.b("", "klasse", object, "RealmKlasse");
        b.b("", "absenceReason", object, "RealmAbsenceReason");
        final RealmFieldType boolean1 = RealmFieldType.BOOLEAN;
        b.c("", "excused", boolean1, false, false, true);
        b.c("", "owner", boolean1, false, false, true);
        b.b("", "excuse", object, "RealmExcuse");
        b.c("", "periodId", integer, false, false, true);
        b.c("", "synced", boolean1, false, false, true);
        return b.e();
    }
    
    public static j4.a V8(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final ArrayList<String> list = new ArrayList<String>(4);
        Object x2 = null;
        Label_0146: {
            if (b) {
                x2 = f0.x2(j4.a.class);
                final long e = ((b)f0.H().j(j4.a.class)).e;
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
                        h.g(f0, ((Table)x2).R(r), f0.H().j(j4.a.class), false, Collections.emptyList());
                        x2 = new n1();
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
            if (jsonObject.has("student")) {
                list.add("student");
            }
            if (jsonObject.has("klasse")) {
                list.add("klasse");
            }
            if (jsonObject.has("absenceReason")) {
                list.add("absenceReason");
            }
            if (jsonObject.has("excuse")) {
                list.add("excuse");
            }
            if (!jsonObject.has("id")) {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
            n1 n1;
            if (jsonObject.isNull("id")) {
                n1 = f0.p1((Class<n1>)j4.a.class, null, true, list);
            }
            else {
                n1 = f0.p1((Class<n1>)j4.a.class, jsonObject.getLong("id"), true, list);
            }
            o = n1;
        }
        if (jsonObject.has("start")) {
            if (jsonObject.isNull("start")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'start' to null.");
            }
            ((o1)o).h(jsonObject.getLong("start"));
        }
        if (jsonObject.has("end")) {
            if (jsonObject.isNull("end")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'end' to null.");
            }
            ((o1)o).i(jsonObject.getLong("end"));
        }
        if (jsonObject.has("text")) {
            if (jsonObject.isNull("text")) {
                ((o1)o).j(null);
            }
            else {
                ((o1)o).j(jsonObject.getString("text"));
            }
        }
        if (jsonObject.has("student")) {
            if (jsonObject.isNull("student")) {
                ((o1)o).B5(null);
            }
            else {
                ((o1)o).B5(h4.H8(f0, jsonObject.getJSONObject("student"), b));
            }
        }
        if (jsonObject.has("klasse")) {
            if (jsonObject.isNull("klasse")) {
                ((o1)o).F5(null);
            }
            else {
                ((o1)o).F5(b4.P8(f0, jsonObject.getJSONObject("klasse"), b));
            }
        }
        if (jsonObject.has("absenceReason")) {
            if (jsonObject.isNull("absenceReason")) {
                ((o1)o).v5(null);
            }
            else {
                ((o1)o).v5(p1.F8(f0, jsonObject.getJSONObject("absenceReason"), b));
            }
        }
        if (jsonObject.has("excused")) {
            if (jsonObject.isNull("excused")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'excused' to null.");
            }
            ((o1)o).N(jsonObject.getBoolean("excused"));
        }
        if (jsonObject.has("owner")) {
            if (jsonObject.isNull("owner")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'owner' to null.");
            }
            ((o1)o).L0(jsonObject.getBoolean("owner"));
        }
        if (jsonObject.has("excuse")) {
            if (jsonObject.isNull("excuse")) {
                ((o1)o).y3(null);
            }
            else {
                ((o1)o).y3(r1.H8(f0, jsonObject.getJSONObject("excuse"), b));
            }
        }
        if (jsonObject.has("periodId")) {
            if (jsonObject.isNull("periodId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'periodId' to null.");
            }
            ((o1)o).y(jsonObject.getLong("periodId"));
        }
        if (jsonObject.has("synced")) {
            if (jsonObject.isNull("synced")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'synced' to null.");
            }
            ((o1)o).F(jsonObject.getBoolean("synced"));
        }
        return (j4.a)o;
    }
    
    @TargetApi(11)
    public static j4.a W8(final f0 f0, final JsonReader jsonReader) throws IOException {
        final j4.a a = new j4.a();
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
            else if (nextName.equals("text")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    a.j(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    a.j(null);
                }
            }
            else if (nextName.equals("student")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    a.B5(null);
                }
                else {
                    a.B5(h4.I8(f0, jsonReader));
                }
            }
            else if (nextName.equals("klasse")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    a.F5(null);
                }
                else {
                    a.F5(b4.Q8(f0, jsonReader));
                }
            }
            else if (nextName.equals("absenceReason")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    a.v5(null);
                }
                else {
                    a.v5(p1.G8(f0, jsonReader));
                }
            }
            else if (nextName.equals("excused")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'excused' to null.");
                }
                a.N(jsonReader.nextBoolean());
            }
            else if (nextName.equals("owner")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'owner' to null.");
                }
                a.L0(jsonReader.nextBoolean());
            }
            else if (nextName.equals("excuse")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    a.y3(null);
                }
                else {
                    a.y3(r1.I8(f0, jsonReader));
                }
            }
            else if (nextName.equals("periodId")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'periodId' to null.");
                }
                a.y(jsonReader.nextLong());
            }
            else if (nextName.equals("synced")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'synced' to null.");
                }
                a.F(jsonReader.nextBoolean());
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
    
    public static OsObjectSchemaInfo X8() {
        return n1.Y;
    }
    
    public static String Y8() {
        return "RealmAbsence";
    }
    
    public static long Z8(final f0 f0, final j4.a a, final Map<n0, Long> map) {
        if (a instanceof p && !p0.h8(a)) {
            final p p3 = (p)a;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(j4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(j4.a.class);
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
        final String f2 = a.f();
        if (f2 != null) {
            Table.nativeSetString(nativePtr, b.h, l, f2, false);
        }
        final g d0 = a.d0();
        if (d0 != null) {
            Long value2;
            if ((value2 = map.get(d0)) == null) {
                value2 = h4.L8(f0, d0, map);
            }
            Table.nativeSetLink(nativePtr, b.i, l, value2, false);
        }
        final d t1 = a.t1();
        if (t1 != null) {
            Long value3;
            if ((value3 = map.get(t1)) == null) {
                value3 = b4.T8(f0, t1, map);
            }
            Table.nativeSetLink(nativePtr, b.j, l, value3, false);
        }
        final j4.b x3 = a.X4();
        if (x3 != null) {
            Long value4;
            if ((value4 = map.get(x3)) == null) {
                value4 = p1.J8(f0, x3, map);
            }
            Table.nativeSetLink(nativePtr, b.k, l, value4, false);
        }
        Table.nativeSetBoolean(nativePtr, b.l, l, a.S(), false);
        Table.nativeSetBoolean(nativePtr, b.m, l, a.v1(), false);
        final c w0 = a.w0();
        if (w0 != null) {
            Long value5;
            if ((value5 = map.get(w0)) == null) {
                value5 = r1.L8(f0, w0, map);
            }
            Table.nativeSetLink(nativePtr, b.n, l, value5, false);
        }
        Table.nativeSetLong(nativePtr, b.o, l, a.D(), false);
        Table.nativeSetBoolean(nativePtr, b.p, l, a.A(), false);
        return l;
    }
    
    public static void a9(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(j4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(j4.a.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final j4.a a = (j4.a)iterator.next();
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
            final String f2 = a.f();
            if (f2 != null) {
                Table.nativeSetString(nativePtr, b.h, l, f2, false);
            }
            final g d0 = a.d0();
            if (d0 != null) {
                Long value2;
                if ((value2 = map.get(d0)) == null) {
                    value2 = h4.L8(f0, d0, map);
                }
                x2.p0(b.i, l, value2, false);
            }
            final d t1 = a.t1();
            if (t1 != null) {
                Long value3;
                if ((value3 = map.get(t1)) == null) {
                    value3 = b4.T8(f0, t1, map);
                }
                x2.p0(b.j, l, value3, false);
            }
            final j4.b x3 = a.X4();
            if (x3 != null) {
                Long value4;
                if ((value4 = map.get(x3)) == null) {
                    value4 = p1.J8(f0, x3, map);
                }
                x2.p0(b.k, l, value4, false);
            }
            Table.nativeSetBoolean(nativePtr, b.l, l, a.S(), false);
            Table.nativeSetBoolean(nativePtr, b.m, l, a.v1(), false);
            final c w0 = a.w0();
            if (w0 != null) {
                Long value5;
                if ((value5 = map.get(w0)) == null) {
                    value5 = r1.L8(f0, w0, map);
                }
                x2.p0(b.n, l, value5, false);
            }
            Table.nativeSetLong(nativePtr, b.o, l, a.D(), false);
            Table.nativeSetBoolean(nativePtr, b.p, l, a.A(), false);
        }
    }
    
    public static long b9(final f0 f0, final j4.a a, final Map<n0, Long> map) {
        if (a instanceof p && !p0.h8(a)) {
            final p p3 = (p)a;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(j4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(j4.a.class);
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
        final String f2 = a.f();
        final long h = b.h;
        if (f2 != null) {
            Table.nativeSetString(nativePtr, h, rowWithPrimaryKey, f2, false);
        }
        else {
            Table.nativeSetNull(nativePtr, h, rowWithPrimaryKey, false);
        }
        final g d0 = a.d0();
        if (d0 != null) {
            Long value;
            if ((value = map.get(d0)) == null) {
                value = h4.N8(f0, d0, map);
            }
            Table.nativeSetLink(nativePtr, b.i, rowWithPrimaryKey, value, false);
        }
        else {
            Table.nativeNullifyLink(nativePtr, b.i, rowWithPrimaryKey);
        }
        final d t1 = a.t1();
        if (t1 != null) {
            Long value2;
            if ((value2 = map.get(t1)) == null) {
                value2 = b4.V8(f0, t1, map);
            }
            Table.nativeSetLink(nativePtr, b.j, rowWithPrimaryKey, value2, false);
        }
        else {
            Table.nativeNullifyLink(nativePtr, b.j, rowWithPrimaryKey);
        }
        final j4.b x3 = a.X4();
        if (x3 != null) {
            Long value3;
            if ((value3 = map.get(x3)) == null) {
                value3 = p1.L8(f0, x3, map);
            }
            Table.nativeSetLink(nativePtr, b.k, rowWithPrimaryKey, value3, false);
        }
        else {
            Table.nativeNullifyLink(nativePtr, b.k, rowWithPrimaryKey);
        }
        Table.nativeSetBoolean(nativePtr, b.l, rowWithPrimaryKey, a.S(), false);
        Table.nativeSetBoolean(nativePtr, b.m, rowWithPrimaryKey, a.v1(), false);
        final c w0 = a.w0();
        if (w0 != null) {
            Long value4;
            if ((value4 = map.get(w0)) == null) {
                value4 = r1.N8(f0, w0, map);
            }
            Table.nativeSetLink(nativePtr, b.n, rowWithPrimaryKey, value4, false);
        }
        else {
            Table.nativeNullifyLink(nativePtr, b.n, rowWithPrimaryKey);
        }
        Table.nativeSetLong(nativePtr, b.o, rowWithPrimaryKey, a.D(), false);
        Table.nativeSetBoolean(nativePtr, b.p, rowWithPrimaryKey, a.A(), false);
        return rowWithPrimaryKey;
    }
    
    public static void c9(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(j4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(j4.a.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final j4.a a = (j4.a)iterator.next();
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
            final String f2 = a.f();
            final long h = b.h;
            if (f2 != null) {
                Table.nativeSetString(nativePtr, h, rowWithPrimaryKey, f2, false);
            }
            else {
                Table.nativeSetNull(nativePtr, h, rowWithPrimaryKey, false);
            }
            final g d0 = a.d0();
            if (d0 != null) {
                Long value;
                if ((value = map.get(d0)) == null) {
                    value = h4.N8(f0, d0, map);
                }
                Table.nativeSetLink(nativePtr, b.i, rowWithPrimaryKey, value, false);
            }
            else {
                Table.nativeNullifyLink(nativePtr, b.i, rowWithPrimaryKey);
            }
            final d t1 = a.t1();
            if (t1 != null) {
                Long value2;
                if ((value2 = map.get(t1)) == null) {
                    value2 = b4.V8(f0, t1, map);
                }
                Table.nativeSetLink(nativePtr, b.j, rowWithPrimaryKey, value2, false);
            }
            else {
                Table.nativeNullifyLink(nativePtr, b.j, rowWithPrimaryKey);
            }
            final j4.b x3 = a.X4();
            if (x3 != null) {
                Long value3;
                if ((value3 = map.get(x3)) == null) {
                    value3 = p1.L8(f0, x3, map);
                }
                Table.nativeSetLink(nativePtr, b.k, rowWithPrimaryKey, value3, false);
            }
            else {
                Table.nativeNullifyLink(nativePtr, b.k, rowWithPrimaryKey);
            }
            Table.nativeSetBoolean(nativePtr, b.l, rowWithPrimaryKey, a.S(), false);
            Table.nativeSetBoolean(nativePtr, b.m, rowWithPrimaryKey, a.v1(), false);
            final c w0 = a.w0();
            if (w0 != null) {
                Long value4;
                if ((value4 = map.get(w0)) == null) {
                    value4 = r1.N8(f0, w0, map);
                }
                Table.nativeSetLink(nativePtr, b.n, rowWithPrimaryKey, value4, false);
            }
            else {
                Table.nativeNullifyLink(nativePtr, b.n, rowWithPrimaryKey);
            }
            Table.nativeSetLong(nativePtr, b.o, rowWithPrimaryKey, a.D(), false);
            Table.nativeSetBoolean(nativePtr, b.p, rowWithPrimaryKey, a.A(), false);
        }
    }
    
    static n1 d9(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(j4.a.class), false, Collections.emptyList());
        final n1 n1 = new n1();
        h.a();
        return n1;
    }
    
    static j4.a e9(final f0 f0, final b b, final j4.a a, final j4.a a2, final Map<n0, p> map, final Set<q> set) {
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(j4.a.class), set);
        osObjectBuilder.L(b.e, a2.a());
        osObjectBuilder.L(b.f, a2.d());
        osObjectBuilder.L(b.g, a2.c());
        osObjectBuilder.d0(b.h, a2.f());
        final g d0 = a2.d0();
        if (d0 == null) {
            osObjectBuilder.V(b.i);
        }
        else {
            g d2 = (g)map.get(d0);
            final long i = b.i;
            if (d2 == null) {
                d2 = h4.D8(f0, (h4.b)f0.H().j(g.class), d0, true, map, set);
            }
            osObjectBuilder.W(i, d2);
        }
        final d t1 = a2.t1();
        if (t1 == null) {
            osObjectBuilder.V(b.j);
        }
        else {
            d l8 = (d)map.get(t1);
            final long j = b.j;
            if (l8 == null) {
                l8 = b4.L8(f0, (b4.b)f0.H().j(d.class), t1, true, map, set);
            }
            osObjectBuilder.W(j, l8);
        }
        final j4.b x4 = a2.X4();
        if (x4 == null) {
            osObjectBuilder.V(b.k);
        }
        else {
            j4.b b2 = (j4.b)map.get(x4);
            final long k = b.k;
            if (b2 == null) {
                b2 = p1.B8(f0, (p1.b)f0.H().j(j4.b.class), x4, true, map, set);
            }
            osObjectBuilder.W(k, b2);
        }
        osObjectBuilder.n(b.l, a2.S());
        osObjectBuilder.n(b.m, a2.v1());
        final c w0 = a2.w0();
        if (w0 == null) {
            osObjectBuilder.V(b.n);
        }
        else {
            final c c = (c)map.get(w0);
            if (c != null) {
                osObjectBuilder.W(b.n, c);
            }
            else {
                osObjectBuilder.W(b.n, r1.D8(f0, (r1.b)f0.H().j(c.class), w0, true, map, set));
            }
        }
        osObjectBuilder.L(b.o, a2.D());
        osObjectBuilder.n(b.p, a2.A());
        osObjectBuilder.i0();
        return a;
    }
    
    @Override
    public boolean A() {
        this.W.f().h();
        return this.W.g().l(this.V.p);
    }
    
    @Override
    public void B5(final g g) {
        final f0 f0 = (f0)this.W.f();
        if (this.W.i()) {
            if (!this.W.d()) {
                return;
            }
            if (this.W.e().contains("student")) {
                return;
            }
            g g2;
            if ((g2 = g) != null) {
                g2 = g;
                if (!p0.j8(g)) {
                    g2 = f0.G0(g, new q[0]);
                }
            }
            final r g3 = this.W.g();
            if (g2 == null) {
                g3.z(this.V.i);
                return;
            }
            this.W.c(g2);
            g3.g().p0(this.V.i, g3.l0(), ((p)g2).S6().g().l0(), true);
        }
        else {
            this.W.f().h();
            if (g == null) {
                this.W.g().z(this.V.i);
                return;
            }
            this.W.c(g);
            this.W.g().o(this.V.i, ((p)g).S6().g().l0());
        }
    }
    
    @Override
    public long D() {
        this.W.f().h();
        return this.W.g().m(this.V.o);
    }
    
    @Override
    public void F(final boolean b) {
        if (!this.W.i()) {
            this.W.f().h();
            this.W.g().i(this.V.p, b);
            return;
        }
        if (!this.W.d()) {
            return;
        }
        final r g = this.W.g();
        g.g().j0(this.V.p, g.l0(), b, true);
    }
    
    @Override
    public void F5(final d d) {
        final f0 f0 = (f0)this.W.f();
        if (this.W.i()) {
            if (!this.W.d()) {
                return;
            }
            if (this.W.e().contains("klasse")) {
                return;
            }
            d d2;
            if ((d2 = d) != null) {
                d2 = d;
                if (!p0.j8(d)) {
                    d2 = f0.G0(d, new q[0]);
                }
            }
            final r g = this.W.g();
            if (d2 == null) {
                g.z(this.V.j);
                return;
            }
            this.W.c(d2);
            g.g().p0(this.V.j, g.l0(), ((p)d2).S6().g().l0(), true);
        }
        else {
            this.W.f().h();
            if (d == null) {
                this.W.g().z(this.V.j);
                return;
            }
            this.W.c(d);
            this.W.g().o(this.V.j, ((p)d).S6().g().l0());
        }
    }
    
    @Override
    public void L0(final boolean b) {
        if (!this.W.i()) {
            this.W.f().h();
            this.W.g().i(this.V.m, b);
            return;
        }
        if (!this.W.d()) {
            return;
        }
        final r g = this.W.g();
        g.g().j0(this.V.m, g.l0(), b, true);
    }
    
    @Override
    public void N(final boolean b) {
        if (!this.W.i()) {
            this.W.f().h();
            this.W.g().i(this.V.l, b);
            return;
        }
        if (!this.W.d()) {
            return;
        }
        final r g = this.W.g();
        g.g().j0(this.V.l, g.l0(), b, true);
    }
    
    @Override
    public boolean S() {
        this.W.f().h();
        return this.W.g().l(this.V.l);
    }
    
    @Override
    public c0<?> S6() {
        return this.W;
    }
    
    @Override
    public j4.b X4() {
        this.W.f().h();
        if (this.W.g().G(this.V.k)) {
            return null;
        }
        return this.W.f().x(j4.b.class, this.W.g().P(this.V.k), false, Collections.emptyList());
    }
    
    @Override
    public long a() {
        this.W.f().h();
        return this.W.g().m(this.V.e);
    }
    
    @Override
    public void b(final long n) {
        if (this.W.i()) {
            return;
        }
        this.W.f().h();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }
    
    @Override
    public long c() {
        this.W.f().h();
        return this.W.g().m(this.V.g);
    }
    
    @Override
    public long d() {
        this.W.f().h();
        return this.W.g().m(this.V.f);
    }
    
    @Override
    public g d0() {
        this.W.f().h();
        if (this.W.g().G(this.V.i)) {
            return null;
        }
        return this.W.f().x(g.class, this.W.g().P(this.V.i), false, Collections.emptyList());
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final n1 n1 = (n1)o;
        final io.realm.a f = this.W.f();
        final io.realm.a f2 = n1.W.f();
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
        final String m = this.W.g().g().M();
        final String i = n1.W.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.W.g().l0() == n1.W.g().l0();
            }
        }
        else if (i == null) {
            return this.W.g().l0() == n1.W.g().l0();
        }
        return false;
    }
    
    @Override
    public String f() {
        this.W.f().h();
        return this.W.g().U(this.V.h);
    }
    
    @Override
    public void h(final long n) {
        if (!this.W.i()) {
            this.W.f().h();
            this.W.g().s(this.V.f, n);
            return;
        }
        if (!this.W.d()) {
            return;
        }
        final r g = this.W.g();
        g.g().q0(this.V.f, g.l0(), n, true);
    }
    
    @Override
    public int hashCode() {
        final String path = this.W.f().getPath();
        final String m = this.W.g().g().M();
        final long l0 = this.W.g().l0();
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
        if (!this.W.i()) {
            this.W.f().h();
            this.W.g().s(this.V.g, n);
            return;
        }
        if (!this.W.d()) {
            return;
        }
        final r g = this.W.g();
        g.g().q0(this.V.g, g.l0(), n, true);
    }
    
    @Override
    public void j(final String s) {
        if (this.W.i()) {
            if (!this.W.d()) {
                return;
            }
            final r g = this.W.g();
            if (s != null) {
                g.g().t0(this.V.h, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'text' to null.");
        }
        else {
            this.W.f().h();
            if (s != null) {
                this.W.g().d(this.V.h, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'text' to null.");
        }
    }
    
    @Override
    public d t1() {
        this.W.f().h();
        if (this.W.g().G(this.V.j)) {
            return null;
        }
        return this.W.f().x(d.class, this.W.g().P(this.V.j), false, Collections.emptyList());
    }
    
    @Override
    public String toString() {
        if (!p0.k8(this)) {
            return "Invalid object";
        }
        final StringBuilder sb = new StringBuilder("RealmAbsence = proxy[");
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
        sb.append("{student:");
        final g d0 = this.d0();
        final String s = "null";
        String str;
        if (d0 != null) {
            str = "RealmStudent";
        }
        else {
            str = "null";
        }
        sb.append(str);
        sb.append("}");
        sb.append(",");
        sb.append("{klasse:");
        String str2;
        if (this.t1() != null) {
            str2 = "RealmKlasse";
        }
        else {
            str2 = "null";
        }
        sb.append(str2);
        sb.append("}");
        sb.append(",");
        sb.append("{absenceReason:");
        String str3;
        if (this.X4() != null) {
            str3 = "RealmAbsenceReason";
        }
        else {
            str3 = "null";
        }
        sb.append(str3);
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
        String str4 = s;
        if (this.w0() != null) {
            str4 = "RealmExcuse";
        }
        sb.append(str4);
        sb.append("}");
        sb.append(",");
        sb.append("{periodId:");
        sb.append(this.D());
        sb.append("}");
        sb.append(",");
        sb.append("{synced:");
        sb.append(this.A());
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
    
    @Override
    public boolean v1() {
        this.W.f().h();
        return this.W.g().l(this.V.m);
    }
    
    @Override
    public void v5(final j4.b b) {
        final f0 f0 = (f0)this.W.f();
        if (this.W.i()) {
            if (!this.W.d()) {
                return;
            }
            if (this.W.e().contains("absenceReason")) {
                return;
            }
            j4.b b2;
            if ((b2 = b) != null) {
                b2 = b;
                if (!p0.j8(b)) {
                    b2 = f0.G0(b, new q[0]);
                }
            }
            final r g = this.W.g();
            if (b2 == null) {
                g.z(this.V.k);
                return;
            }
            this.W.c(b2);
            g.g().p0(this.V.k, g.l0(), ((p)b2).S6().g().l0(), true);
        }
        else {
            this.W.f().h();
            if (b == null) {
                this.W.g().z(this.V.k);
                return;
            }
            this.W.c(b);
            this.W.g().o(this.V.k, ((p)b).S6().g().l0());
        }
    }
    
    @Override
    public c w0() {
        this.W.f().h();
        if (this.W.g().G(this.V.n)) {
            return null;
        }
        return this.W.f().x(c.class, this.W.g().P(this.V.n), false, Collections.emptyList());
    }
    
    @Override
    public void y(final long n) {
        if (!this.W.i()) {
            this.W.f().h();
            this.W.g().s(this.V.o, n);
            return;
        }
        if (!this.W.d()) {
            return;
        }
        final r g = this.W.g();
        g.g().q0(this.V.o, g.l0(), n, true);
    }
    
    @Override
    public void y3(final c c) {
        final f0 f0 = (f0)this.W.f();
        if (this.W.i()) {
            if (!this.W.d()) {
                return;
            }
            if (this.W.e().contains("excuse")) {
                return;
            }
            c c2;
            if ((c2 = c) != null) {
                c2 = c;
                if (!p0.j8(c)) {
                    c2 = f0.G0(c, new q[0]);
                }
            }
            final r g = this.W.g();
            if (c2 == null) {
                g.z(this.V.n);
                return;
            }
            this.W.c(c2);
            g.g().p0(this.V.n, g.l0(), ((p)c2).S6().g().l0(), true);
        }
        else {
            this.W.f().h();
            if (c == null) {
                this.W.g().z(this.V.n);
                return;
            }
            this.W.c(c);
            this.W.g().o(this.V.n, ((p)c).S6().g().l0());
        }
    }
    
    @Override
    public void y4() {
        if (this.W != null) {
            return;
        }
        final io.realm.a.h h = io.realm.a.W.get();
        this.V = (b)h.c();
        (this.W = new c0<j4.a>(this)).r(h.e());
        this.W.s(h.f());
        this.W.o(h.b());
        this.W.q(h.d());
    }
    
    public static final class a
    {
        public static final String a = "RealmAbsence";
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
        
        b(final OsSchemaInfo osSchemaInfo) {
            super(12);
            final OsObjectSchemaInfo b = osSchemaInfo.b("RealmAbsence");
            this.e = this.b("id", "id", b);
            this.f = this.b("start", "start", b);
            this.g = this.b("end", "end", b);
            this.h = this.b("text", "text", b);
            this.i = this.b("student", "student", b);
            this.j = this.b("klasse", "klasse", b);
            this.k = this.b("absenceReason", "absenceReason", b);
            this.l = this.b("excused", "excused", b);
            this.m = this.b("owner", "owner", b);
            this.n = this.b("excuse", "excuse", b);
            this.o = this.b("periodId", "periodId", b);
            this.p = this.b("synced", "synced", b);
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
        }
    }
}
