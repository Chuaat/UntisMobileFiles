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
import i4.b;

public class h1 extends i4.b implements p, i1
{
    private static final String W = "";
    private static final OsObjectSchemaInfo X;
    private b U;
    private c0<i4.b> V;
    
    static {
        X = S8();
    }
    
    h1() {
        this.V.p();
    }
    
    public static i4.b O8(final f0 f0, final b b, final i4.b b2, final boolean b3, final Map<n0, p> map, final Set<q> set) {
        final h1 h1 = map.get(b2);
        if (h1 != null) {
            return h1;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(i4.b.class), set);
        osObjectBuilder.L(b.e, b2.a());
        osObjectBuilder.L(b.f, b2.d0());
        osObjectBuilder.L(b.g, b2.K());
        osObjectBuilder.d0(b.h, b2.a2());
        osObjectBuilder.d0(b.i, b2.g6());
        osObjectBuilder.L(b.j, b2.f3());
        osObjectBuilder.L(b.k, b2.d6());
        osObjectBuilder.L(b.l, b2.E2());
        osObjectBuilder.L(b.m, b2.J6());
        osObjectBuilder.K(b.n, b2.b3());
        osObjectBuilder.d0(b.o, b2.f());
        final h1 b4 = b9(f0, osObjectBuilder.f0());
        map.put(b2, b4);
        return b4;
    }
    
    public static i4.b P8(final f0 f0, final b b, final i4.b b2, final boolean b3, final Map<n0, p> map, final Set<q> set) {
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
            return (i4.b)p7;
        }
        final p p8 = null;
        Object x2 = null;
        boolean b4 = false;
        Label_0232: {
            if (b3) {
                x2 = f0.x2(i4.b.class);
                final long r = ((Table)x2).r(b.e, b2.a());
                if (r == -1L) {
                    b4 = false;
                    x2 = p8;
                    break Label_0232;
                }
                try {
                    h.g(f0, ((Table)x2).R(r), b, false, Collections.emptyList());
                    x2 = new h1();
                    map.put(b2, (p)x2);
                }
                finally {
                    h.a();
                }
            }
            b4 = b3;
        }
        i4.b b5;
        if (b4) {
            b5 = c9(f0, b, (i4.b)x2, b2, map, set);
        }
        else {
            b5 = O8(f0, b, b2, b3, map, set);
        }
        return b5;
    }
    
    public static b Q8(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static i4.b R8(final i4.b b, final int a, final int n, final Map<n0, p.a<n0>> map) {
        if (a <= n && b != null) {
            final p.a a2 = map.get(b);
            i4.b b3;
            if (a2 == null) {
                final i4.b b2 = new i4.b();
                map.put(b, (p.a<n0>)new p.a(a, b2));
                b3 = b2;
            }
            else {
                if (a >= a2.a) {
                    return (i4.b)a2.b;
                }
                b3 = (i4.b)a2.b;
                a2.a = a;
            }
            b3.b(b.a());
            b3.W0(b.d0());
            b3.R0(b.K());
            b3.w5(b.a2());
            b3.U5(b.g6());
            b3.k6(b.f3());
            b3.D4(b.d6());
            b3.Z4(b.E2());
            b3.T6(b.J6());
            b3.L7(b.b3());
            b3.j(b.f());
            return b3;
        }
        return null;
    }
    
    private static OsObjectSchemaInfo S8() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmExemption", false, 11, 0);
        final RealmFieldType integer = RealmFieldType.INTEGER;
        b.c("", "id", integer, true, false, true);
        b.c("", "student", integer, false, false, true);
        b.c("", "subject", integer, false, false, true);
        final RealmFieldType string = RealmFieldType.STRING;
        b.c("", "subjectGroup", string, false, false, true);
        b.c("", "exemptionReason", string, false, false, true);
        b.c("", "startDate", integer, false, false, true);
        b.c("", "endDate", integer, false, false, true);
        b.c("", "startTime", integer, false, false, true);
        b.c("", "endTime", integer, false, false, true);
        b.c("", "weekDay", integer, false, false, true);
        b.c("", "text", string, false, false, true);
        return b.e();
    }
    
    public static i4.b T8(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final List<String> emptyList = Collections.emptyList();
        Object x2 = null;
        Label_0141: {
            if (b) {
                x2 = f0.x2(i4.b.class);
                final long e = ((b)f0.H().j(i4.b.class)).e;
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
                        h.g(f0, ((Table)x2).R(r), f0.H().j(i4.b.class), false, Collections.emptyList());
                        x2 = new h1();
                        break Label_0141;
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
            if (!jsonObject.has("id")) {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
            h1 h2;
            if (jsonObject.isNull("id")) {
                h2 = f0.p1((Class<h1>)i4.b.class, null, true, emptyList);
            }
            else {
                h2 = f0.p1((Class<h1>)i4.b.class, jsonObject.getLong("id"), true, emptyList);
            }
            o = h2;
        }
        if (jsonObject.has("student")) {
            if (jsonObject.isNull("student")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'student' to null.");
            }
            ((i1)o).W0(jsonObject.getLong("student"));
        }
        if (jsonObject.has("subject")) {
            if (jsonObject.isNull("subject")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'subject' to null.");
            }
            ((i1)o).R0(jsonObject.getLong("subject"));
        }
        if (jsonObject.has("subjectGroup")) {
            if (jsonObject.isNull("subjectGroup")) {
                ((i1)o).w5(null);
            }
            else {
                ((i1)o).w5(jsonObject.getString("subjectGroup"));
            }
        }
        if (jsonObject.has("exemptionReason")) {
            if (jsonObject.isNull("exemptionReason")) {
                ((i1)o).U5(null);
            }
            else {
                ((i1)o).U5(jsonObject.getString("exemptionReason"));
            }
        }
        if (jsonObject.has("startDate")) {
            if (jsonObject.isNull("startDate")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'startDate' to null.");
            }
            ((i1)o).k6(jsonObject.getLong("startDate"));
        }
        if (jsonObject.has("endDate")) {
            if (jsonObject.isNull("endDate")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'endDate' to null.");
            }
            ((i1)o).D4(jsonObject.getLong("endDate"));
        }
        if (jsonObject.has("startTime")) {
            if (jsonObject.isNull("startTime")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'startTime' to null.");
            }
            ((i1)o).Z4(jsonObject.getLong("startTime"));
        }
        if (jsonObject.has("endTime")) {
            if (jsonObject.isNull("endTime")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'endTime' to null.");
            }
            ((i1)o).T6(jsonObject.getLong("endTime"));
        }
        if (jsonObject.has("weekDay")) {
            if (jsonObject.isNull("weekDay")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'weekDay' to null.");
            }
            ((i1)o).L7(jsonObject.getInt("weekDay"));
        }
        if (jsonObject.has("text")) {
            if (jsonObject.isNull("text")) {
                ((i1)o).j(null);
            }
            else {
                ((i1)o).j(jsonObject.getString("text"));
            }
        }
        return (i4.b)o;
    }
    
    @TargetApi(11)
    public static i4.b U8(final f0 f0, final JsonReader jsonReader) throws IOException {
        final i4.b b = new i4.b();
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
            else if (nextName.equals("student")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'student' to null.");
                }
                b.W0(jsonReader.nextLong());
            }
            else if (nextName.equals("subject")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'subject' to null.");
                }
                b.R0(jsonReader.nextLong());
            }
            else if (nextName.equals("subjectGroup")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    b.w5(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    b.w5(null);
                }
            }
            else if (nextName.equals("exemptionReason")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    b.U5(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    b.U5(null);
                }
            }
            else if (nextName.equals("startDate")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'startDate' to null.");
                }
                b.k6(jsonReader.nextLong());
            }
            else if (nextName.equals("endDate")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'endDate' to null.");
                }
                b.D4(jsonReader.nextLong());
            }
            else if (nextName.equals("startTime")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'startTime' to null.");
                }
                b.Z4(jsonReader.nextLong());
            }
            else if (nextName.equals("endTime")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'endTime' to null.");
                }
                b.T6(jsonReader.nextLong());
            }
            else if (nextName.equals("weekDay")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'weekDay' to null.");
                }
                b.L7(jsonReader.nextInt());
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
    
    public static OsObjectSchemaInfo V8() {
        return h1.X;
    }
    
    public static String W8() {
        return "RealmExemption";
    }
    
    public static long X8(final f0 f0, final i4.b b, final Map<n0, Long> map) {
        if (b instanceof p && !p0.h8(b)) {
            final p p3 = (p)b;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(i4.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b2 = (b)f0.H().j(i4.b.class);
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
        Table.nativeSetLong(nativePtr, b2.f, l, b.d0(), false);
        Table.nativeSetLong(nativePtr, b2.g, l, b.K(), false);
        final String a2 = b.a2();
        if (a2 != null) {
            Table.nativeSetString(nativePtr, b2.h, l, a2, false);
        }
        final String g6 = b.g6();
        if (g6 != null) {
            Table.nativeSetString(nativePtr, b2.i, l, g6, false);
        }
        Table.nativeSetLong(nativePtr, b2.j, l, b.f3(), false);
        Table.nativeSetLong(nativePtr, b2.k, l, b.d6(), false);
        Table.nativeSetLong(nativePtr, b2.l, l, b.E2(), false);
        Table.nativeSetLong(nativePtr, b2.m, l, b.J6(), false);
        Table.nativeSetLong(nativePtr, b2.n, l, b.b3(), false);
        final String f2 = b.f();
        if (f2 != null) {
            Table.nativeSetString(nativePtr, b2.o, l, f2, false);
        }
        return l;
    }
    
    public static void Y8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(i4.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(i4.b.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final i4.b b2 = (i4.b)iterator.next();
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
            Table.nativeSetLong(nativePtr, b.f, l, b2.d0(), false);
            Table.nativeSetLong(nativePtr, b.g, l, b2.K(), false);
            final String a2 = b2.a2();
            if (a2 != null) {
                Table.nativeSetString(nativePtr, b.h, l, a2, false);
            }
            final String g6 = b2.g6();
            if (g6 != null) {
                Table.nativeSetString(nativePtr, b.i, l, g6, false);
            }
            Table.nativeSetLong(nativePtr, b.j, l, b2.f3(), false);
            Table.nativeSetLong(nativePtr, b.k, l, b2.d6(), false);
            Table.nativeSetLong(nativePtr, b.l, l, b2.E2(), false);
            Table.nativeSetLong(nativePtr, b.m, l, b2.J6(), false);
            Table.nativeSetLong(nativePtr, b.n, l, b2.b3(), false);
            final String f2 = b2.f();
            if (f2 == null) {
                continue;
            }
            Table.nativeSetString(nativePtr, b.o, l, f2, false);
        }
    }
    
    public static long Z8(final f0 f0, final i4.b b, final Map<n0, Long> map) {
        if (b instanceof p && !p0.h8(b)) {
            final p p3 = (p)b;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(i4.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b2 = (b)f0.H().j(i4.b.class);
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
        Table.nativeSetLong(nativePtr, b2.f, rowWithPrimaryKey, b.d0(), false);
        Table.nativeSetLong(nativePtr, b2.g, rowWithPrimaryKey, b.K(), false);
        final String a2 = b.a2();
        final long h = b2.h;
        if (a2 != null) {
            Table.nativeSetString(nativePtr, h, rowWithPrimaryKey, a2, false);
        }
        else {
            Table.nativeSetNull(nativePtr, h, rowWithPrimaryKey, false);
        }
        final String g6 = b.g6();
        final long i = b2.i;
        if (g6 != null) {
            Table.nativeSetString(nativePtr, i, rowWithPrimaryKey, g6, false);
        }
        else {
            Table.nativeSetNull(nativePtr, i, rowWithPrimaryKey, false);
        }
        Table.nativeSetLong(nativePtr, b2.j, rowWithPrimaryKey, b.f3(), false);
        Table.nativeSetLong(nativePtr, b2.k, rowWithPrimaryKey, b.d6(), false);
        Table.nativeSetLong(nativePtr, b2.l, rowWithPrimaryKey, b.E2(), false);
        Table.nativeSetLong(nativePtr, b2.m, rowWithPrimaryKey, b.J6(), false);
        Table.nativeSetLong(nativePtr, b2.n, rowWithPrimaryKey, b.b3(), false);
        final String f2 = b.f();
        final long o = b2.o;
        if (f2 != null) {
            Table.nativeSetString(nativePtr, o, rowWithPrimaryKey, f2, false);
        }
        else {
            Table.nativeSetNull(nativePtr, o, rowWithPrimaryKey, false);
        }
        return rowWithPrimaryKey;
    }
    
    public static void a9(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(i4.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(i4.b.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final i4.b b2 = (i4.b)iterator.next();
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
            Table.nativeSetLong(nativePtr, b.f, rowWithPrimaryKey, b2.d0(), false);
            Table.nativeSetLong(nativePtr, b.g, rowWithPrimaryKey, b2.K(), false);
            final String a2 = b2.a2();
            final long h = b.h;
            if (a2 != null) {
                Table.nativeSetString(nativePtr, h, rowWithPrimaryKey, a2, false);
            }
            else {
                Table.nativeSetNull(nativePtr, h, rowWithPrimaryKey, false);
            }
            final String g6 = b2.g6();
            final long i = b.i;
            if (g6 != null) {
                Table.nativeSetString(nativePtr, i, rowWithPrimaryKey, g6, false);
            }
            else {
                Table.nativeSetNull(nativePtr, i, rowWithPrimaryKey, false);
            }
            Table.nativeSetLong(nativePtr, b.j, rowWithPrimaryKey, b2.f3(), false);
            Table.nativeSetLong(nativePtr, b.k, rowWithPrimaryKey, b2.d6(), false);
            Table.nativeSetLong(nativePtr, b.l, rowWithPrimaryKey, b2.E2(), false);
            Table.nativeSetLong(nativePtr, b.m, rowWithPrimaryKey, b2.J6(), false);
            Table.nativeSetLong(nativePtr, b.n, rowWithPrimaryKey, b2.b3(), false);
            final String f2 = b2.f();
            final long o = b.o;
            if (f2 != null) {
                Table.nativeSetString(nativePtr, o, rowWithPrimaryKey, f2, false);
            }
            else {
                Table.nativeSetNull(nativePtr, o, rowWithPrimaryKey, false);
            }
        }
    }
    
    static h1 b9(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(i4.b.class), false, Collections.emptyList());
        final h1 h2 = new h1();
        h.a();
        return h2;
    }
    
    static i4.b c9(final f0 f0, final b b, final i4.b b2, final i4.b b3, final Map<n0, p> map, final Set<q> set) {
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(i4.b.class), set);
        osObjectBuilder.L(b.e, b3.a());
        osObjectBuilder.L(b.f, b3.d0());
        osObjectBuilder.L(b.g, b3.K());
        osObjectBuilder.d0(b.h, b3.a2());
        osObjectBuilder.d0(b.i, b3.g6());
        osObjectBuilder.L(b.j, b3.f3());
        osObjectBuilder.L(b.k, b3.d6());
        osObjectBuilder.L(b.l, b3.E2());
        osObjectBuilder.L(b.m, b3.J6());
        osObjectBuilder.K(b.n, b3.b3());
        osObjectBuilder.d0(b.o, b3.f());
        osObjectBuilder.i0();
        return b2;
    }
    
    @Override
    public void D4(final long n) {
        if (!this.V.i()) {
            this.V.f().h();
            this.V.g().s(this.U.k, n);
            return;
        }
        if (!this.V.d()) {
            return;
        }
        final r g = this.V.g();
        g.g().q0(this.U.k, g.l0(), n, true);
    }
    
    @Override
    public long E2() {
        this.V.f().h();
        return this.V.g().m(this.U.l);
    }
    
    @Override
    public long J6() {
        this.V.f().h();
        return this.V.g().m(this.U.m);
    }
    
    @Override
    public long K() {
        this.V.f().h();
        return this.V.g().m(this.U.g);
    }
    
    @Override
    public void L7(final int n) {
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
    public void R0(final long n) {
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
    public void T6(final long n) {
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
    public void U5(final String s) {
        if (this.V.i()) {
            if (!this.V.d()) {
                return;
            }
            final r g = this.V.g();
            if (s != null) {
                g.g().t0(this.U.i, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'exemptionReason' to null.");
        }
        else {
            this.V.f().h();
            if (s != null) {
                this.V.g().d(this.U.i, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'exemptionReason' to null.");
        }
    }
    
    @Override
    public void W0(final long n) {
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
    public void Z4(final long n) {
        if (!this.V.i()) {
            this.V.f().h();
            this.V.g().s(this.U.l, n);
            return;
        }
        if (!this.V.d()) {
            return;
        }
        final r g = this.V.g();
        g.g().q0(this.U.l, g.l0(), n, true);
    }
    
    @Override
    public long a() {
        this.V.f().h();
        return this.V.g().m(this.U.e);
    }
    
    @Override
    public String a2() {
        this.V.f().h();
        return this.V.g().U(this.U.h);
    }
    
    @Override
    public void b(final long n) {
        if (this.V.i()) {
            return;
        }
        this.V.f().h();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }
    
    @Override
    public int b3() {
        this.V.f().h();
        return (int)this.V.g().m(this.U.n);
    }
    
    @Override
    public long d0() {
        this.V.f().h();
        return this.V.g().m(this.U.f);
    }
    
    @Override
    public long d6() {
        this.V.f().h();
        return this.V.g().m(this.U.k);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final h1 h1 = (h1)o;
        final io.realm.a f = this.V.f();
        final io.realm.a f2 = h1.V.f();
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
        final String i = h1.V.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.V.g().l0() == h1.V.g().l0();
            }
        }
        else if (i == null) {
            return this.V.g().l0() == h1.V.g().l0();
        }
        return false;
    }
    
    @Override
    public String f() {
        this.V.f().h();
        return this.V.g().U(this.U.o);
    }
    
    @Override
    public long f3() {
        this.V.f().h();
        return this.V.g().m(this.U.j);
    }
    
    @Override
    public String g6() {
        this.V.f().h();
        return this.V.g().U(this.U.i);
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
    public void j(final String s) {
        if (this.V.i()) {
            if (!this.V.d()) {
                return;
            }
            final r g = this.V.g();
            if (s != null) {
                g.g().t0(this.U.o, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'text' to null.");
        }
        else {
            this.V.f().h();
            if (s != null) {
                this.V.g().d(this.U.o, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'text' to null.");
        }
    }
    
    @Override
    public void k6(final long n) {
        if (!this.V.i()) {
            this.V.f().h();
            this.V.g().s(this.U.j, n);
            return;
        }
        if (!this.V.d()) {
            return;
        }
        final r g = this.V.g();
        g.g().q0(this.U.j, g.l0(), n, true);
    }
    
    @Override
    public String toString() {
        if (!p0.k8(this)) {
            return "Invalid object";
        }
        final StringBuilder sb = new StringBuilder("RealmExemption = proxy[");
        sb.append("{id:");
        sb.append(this.a());
        sb.append("}");
        sb.append(",");
        sb.append("{student:");
        sb.append(this.d0());
        sb.append("}");
        sb.append(",");
        sb.append("{subject:");
        sb.append(this.K());
        sb.append("}");
        sb.append(",");
        sb.append("{subjectGroup:");
        sb.append(this.a2());
        sb.append("}");
        sb.append(",");
        sb.append("{exemptionReason:");
        sb.append(this.g6());
        sb.append("}");
        sb.append(",");
        sb.append("{startDate:");
        sb.append(this.f3());
        sb.append("}");
        sb.append(",");
        sb.append("{endDate:");
        sb.append(this.d6());
        sb.append("}");
        sb.append(",");
        sb.append("{startTime:");
        sb.append(this.E2());
        sb.append("}");
        sb.append(",");
        sb.append("{endTime:");
        sb.append(this.J6());
        sb.append("}");
        sb.append(",");
        sb.append("{weekDay:");
        sb.append(this.b3());
        sb.append("}");
        sb.append(",");
        sb.append("{text:");
        sb.append(this.f());
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
    
    @Override
    public void w5(final String s) {
        if (this.V.i()) {
            if (!this.V.d()) {
                return;
            }
            final r g = this.V.g();
            if (s != null) {
                g.g().t0(this.U.h, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'subjectGroup' to null.");
        }
        else {
            this.V.f().h();
            if (s != null) {
                this.V.g().d(this.U.h, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'subjectGroup' to null.");
        }
    }
    
    @Override
    public void y4() {
        if (this.V != null) {
            return;
        }
        final io.realm.a.h h = io.realm.a.W.get();
        this.U = (b)h.c();
        (this.V = new c0<i4.b>(this)).r(h.e());
        this.V.s(h.f());
        this.V.o(h.b());
        this.V.q(h.d());
    }
    
    public static final class a
    {
        public static final String a = "RealmExemption";
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
            final OsObjectSchemaInfo b = osSchemaInfo.b("RealmExemption");
            this.e = this.b("id", "id", b);
            this.f = this.b("student", "student", b);
            this.g = this.b("subject", "subject", b);
            this.h = this.b("subjectGroup", "subjectGroup", b);
            this.i = this.b("exemptionReason", "exemptionReason", b);
            this.j = this.b("startDate", "startDate", b);
            this.k = this.b("endDate", "endDate", b);
            this.l = this.b("startTime", "startTime", b);
            this.m = this.b("endTime", "endTime", b);
            this.n = this.b("weekDay", "weekDay", b);
            this.o = this.b("text", "text", b);
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
