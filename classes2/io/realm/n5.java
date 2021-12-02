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
import a5.a;

public class n5 extends a5.a implements p, o5
{
    private static final String Y = "";
    private static final OsObjectSchemaInfo Z;
    private b W;
    private c0<a5.a> X;
    
    static {
        Z = W8();
    }
    
    n5() {
        this.X.p();
    }
    
    public static a5.a S8(final f0 f0, final b b, final a5.a a, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        final n5 n5 = map.get(a);
        if (n5 != null) {
            return n5;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(a5.a.class), set);
        osObjectBuilder.K(b.e, a.a());
        osObjectBuilder.K(b.f, a.x4());
        osObjectBuilder.d0(b.g, a.X2());
        osObjectBuilder.L(b.h, a.V6());
        osObjectBuilder.d0(b.i, a.q6());
        osObjectBuilder.d0(b.j, a.k2());
        osObjectBuilder.d0(b.k, a.A4());
        osObjectBuilder.K(b.l, a.m0());
        osObjectBuilder.L(b.m, a.o());
        osObjectBuilder.n(b.n, a.i6());
        osObjectBuilder.d0(b.o, a.R7());
        osObjectBuilder.L(b.p, a.F7());
        osObjectBuilder.K(b.q, a.s3());
        final n5 f2 = f9(f0, osObjectBuilder.f0());
        map.put(a, f2);
        return f2;
    }
    
    public static a5.a T8(final f0 f0, final b b, final a5.a a, final boolean b2, final Map<n0, p> map, final Set<q> set) {
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
            return (a5.a)p7;
        }
        final p p8 = null;
        Object x2 = null;
        boolean b3 = false;
        Label_0233: {
            if (b2) {
                x2 = f0.x2(a5.a.class);
                final long r = ((Table)x2).r(b.e, a.a());
                if (r == -1L) {
                    b3 = false;
                    x2 = p8;
                    break Label_0233;
                }
                try {
                    h.g(f0, ((Table)x2).R(r), b, false, Collections.emptyList());
                    x2 = new n5();
                    map.put(a, (p)x2);
                }
                finally {
                    h.a();
                }
            }
            b3 = b2;
        }
        a5.a a2;
        if (b3) {
            a2 = g9(f0, b, (a5.a)x2, a, map, set);
        }
        else {
            a2 = S8(f0, b, a, b2, map, set);
        }
        return a2;
    }
    
    public static b U8(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static a5.a V8(final a5.a a, final int a2, final int n, final Map<n0, p.a<n0>> map) {
        if (a2 <= n && a != null) {
            final p.a a3 = map.get(a);
            a5.a a5;
            if (a3 == null) {
                final a5.a a4 = new a5.a();
                map.put(a, (p.a<n0>)new p.a(a2, a4));
                a5 = a4;
            }
            else {
                if (a2 >= a3.a) {
                    return (a5.a)a3.b;
                }
                a5 = (a5.a)a3.b;
                a3.a = a2;
            }
            a5.h2(a.a());
            a5.I2(a.x4());
            a5.G7(a.X2());
            a5.n2(a.V6());
            a5.A3(a.q6());
            a5.n5(a.k2());
            a5.C3(a.A4());
            a5.q0(a.m0());
            a5.p(a.o());
            a5.D2(a.i6());
            a5.R4(a.R7());
            a5.H5(a.F7());
            a5.x3(a.s3());
            return a5;
        }
        return null;
    }
    
    private static OsObjectSchemaInfo W8() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmSystemNotification", false, 13, 0);
        final RealmFieldType integer = RealmFieldType.INTEGER;
        b.c("", "id", integer, true, false, true);
        b.c("", "jobId", integer, false, false, true);
        final RealmFieldType string = RealmFieldType.STRING;
        b.c("", "profileId", string, false, false, true);
        b.c("", "publishDateTime", integer, false, false, true);
        b.c("", "title", string, false, false, true);
        b.c("", "message", string, false, false, true);
        b.c("", "messageLong", string, false, false, true);
        b.c("", "type", integer, false, false, true);
        b.c("", "entityId", integer, false, false, true);
        b.c("", "deleted", RealmFieldType.BOOLEAN, false, false, true);
        b.c("", "extras", string, false, false, true);
        b.c("", "target", integer, false, false, true);
        b.c("", "offset", integer, false, false, true);
        return b.e();
    }
    
    public static a5.a X8(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final List<String> emptyList = Collections.emptyList();
        Object x2 = null;
        Label_0141: {
            if (b) {
                x2 = f0.x2(a5.a.class);
                final long e = ((b)f0.H().j(a5.a.class)).e;
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
                        h.g(f0, ((Table)x2).R(r), f0.H().j(a5.a.class), false, Collections.emptyList());
                        x2 = new n5();
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
            n5 n5;
            if (jsonObject.isNull("id")) {
                n5 = f0.p1((Class<n5>)a5.a.class, null, true, emptyList);
            }
            else {
                n5 = f0.p1((Class<n5>)a5.a.class, jsonObject.getInt("id"), true, emptyList);
            }
            o = n5;
        }
        if (jsonObject.has("jobId")) {
            if (jsonObject.isNull("jobId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'jobId' to null.");
            }
            ((o5)o).I2(jsonObject.getInt("jobId"));
        }
        if (jsonObject.has("profileId")) {
            if (jsonObject.isNull("profileId")) {
                ((o5)o).G7(null);
            }
            else {
                ((o5)o).G7(jsonObject.getString("profileId"));
            }
        }
        if (jsonObject.has("publishDateTime")) {
            if (jsonObject.isNull("publishDateTime")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'publishDateTime' to null.");
            }
            ((o5)o).n2(jsonObject.getLong("publishDateTime"));
        }
        if (jsonObject.has("title")) {
            if (jsonObject.isNull("title")) {
                ((o5)o).A3(null);
            }
            else {
                ((o5)o).A3(jsonObject.getString("title"));
            }
        }
        if (jsonObject.has("message")) {
            if (jsonObject.isNull("message")) {
                ((o5)o).n5(null);
            }
            else {
                ((o5)o).n5(jsonObject.getString("message"));
            }
        }
        if (jsonObject.has("messageLong")) {
            if (jsonObject.isNull("messageLong")) {
                ((o5)o).C3(null);
            }
            else {
                ((o5)o).C3(jsonObject.getString("messageLong"));
            }
        }
        if (jsonObject.has("type")) {
            if (jsonObject.isNull("type")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'type' to null.");
            }
            ((o5)o).q0(jsonObject.getInt("type"));
        }
        if (jsonObject.has("entityId")) {
            if (jsonObject.isNull("entityId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'entityId' to null.");
            }
            ((o5)o).p(jsonObject.getLong("entityId"));
        }
        if (jsonObject.has("deleted")) {
            if (jsonObject.isNull("deleted")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'deleted' to null.");
            }
            ((o5)o).D2(jsonObject.getBoolean("deleted"));
        }
        if (jsonObject.has("extras")) {
            if (jsonObject.isNull("extras")) {
                ((o5)o).R4(null);
            }
            else {
                ((o5)o).R4(jsonObject.getString("extras"));
            }
        }
        if (jsonObject.has("target")) {
            if (jsonObject.isNull("target")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'target' to null.");
            }
            ((o5)o).H5(jsonObject.getLong("target"));
        }
        if (jsonObject.has("offset")) {
            if (jsonObject.isNull("offset")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'offset' to null.");
            }
            ((o5)o).x3(jsonObject.getInt("offset"));
        }
        return (a5.a)o;
    }
    
    @TargetApi(11)
    public static a5.a Y8(final f0 f0, final JsonReader jsonReader) throws IOException {
        final a5.a a = new a5.a();
        jsonReader.beginObject();
        boolean b = false;
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
                a.h2(jsonReader.nextInt());
                b = true;
            }
            else if (nextName.equals("jobId")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'jobId' to null.");
                }
                a.I2(jsonReader.nextInt());
            }
            else if (nextName.equals("profileId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    a.G7(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    a.G7(null);
                }
            }
            else if (nextName.equals("publishDateTime")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'publishDateTime' to null.");
                }
                a.n2(jsonReader.nextLong());
            }
            else if (nextName.equals("title")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    a.A3(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    a.A3(null);
                }
            }
            else if (nextName.equals("message")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    a.n5(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    a.n5(null);
                }
            }
            else if (nextName.equals("messageLong")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    a.C3(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    a.C3(null);
                }
            }
            else if (nextName.equals("type")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'type' to null.");
                }
                a.q0(jsonReader.nextInt());
            }
            else if (nextName.equals("entityId")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'entityId' to null.");
                }
                a.p(jsonReader.nextLong());
            }
            else if (nextName.equals("deleted")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'deleted' to null.");
                }
                a.D2(jsonReader.nextBoolean());
            }
            else if (nextName.equals("extras")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    a.R4(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    a.R4(null);
                }
            }
            else if (nextName.equals("target")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'target' to null.");
                }
                a.H5(jsonReader.nextLong());
            }
            else if (nextName.equals("offset")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'offset' to null.");
                }
                a.x3(jsonReader.nextInt());
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
    
    public static OsObjectSchemaInfo Z8() {
        return n5.Z;
    }
    
    public static String a9() {
        return "RealmSystemNotification";
    }
    
    public static long b9(final f0 f0, final a5.a a, final Map<n0, Long> map) {
        if (a instanceof p && !p0.h8(a)) {
            final p p3 = (p)a;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(a5.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(a5.a.class);
        final long e = b.e;
        final Integer value = a.a();
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
        Table.nativeSetLong(nativePtr, b.f, l, a.x4(), false);
        final String x3 = a.X2();
        if (x3 != null) {
            Table.nativeSetString(nativePtr, b.g, l, x3, false);
        }
        Table.nativeSetLong(nativePtr, b.h, l, a.V6(), false);
        final String q6 = a.q6();
        if (q6 != null) {
            Table.nativeSetString(nativePtr, b.i, l, q6, false);
        }
        final String k2 = a.k2();
        if (k2 != null) {
            Table.nativeSetString(nativePtr, b.j, l, k2, false);
        }
        final String a2 = a.A4();
        if (a2 != null) {
            Table.nativeSetString(nativePtr, b.k, l, a2, false);
        }
        Table.nativeSetLong(nativePtr, b.l, l, a.m0(), false);
        Table.nativeSetLong(nativePtr, b.m, l, a.o(), false);
        Table.nativeSetBoolean(nativePtr, b.n, l, a.i6(), false);
        final String r7 = a.R7();
        if (r7 != null) {
            Table.nativeSetString(nativePtr, b.o, l, r7, false);
        }
        Table.nativeSetLong(nativePtr, b.p, l, a.F7(), false);
        Table.nativeSetLong(nativePtr, b.q, l, a.s3(), false);
        return l;
    }
    
    public static void c9(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(a5.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(a5.a.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final a5.a a = (a5.a)iterator.next();
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
            final Integer value = a.a();
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
            Table.nativeSetLong(nativePtr, b.f, l, a.x4(), false);
            final String x3 = a.X2();
            if (x3 != null) {
                Table.nativeSetString(nativePtr, b.g, l, x3, false);
            }
            Table.nativeSetLong(nativePtr, b.h, l, a.V6(), false);
            final String q6 = a.q6();
            if (q6 != null) {
                Table.nativeSetString(nativePtr, b.i, l, q6, false);
            }
            final String k2 = a.k2();
            if (k2 != null) {
                Table.nativeSetString(nativePtr, b.j, l, k2, false);
            }
            final String a2 = a.A4();
            if (a2 != null) {
                Table.nativeSetString(nativePtr, b.k, l, a2, false);
            }
            Table.nativeSetLong(nativePtr, b.l, l, a.m0(), false);
            Table.nativeSetLong(nativePtr, b.m, l, a.o(), false);
            Table.nativeSetBoolean(nativePtr, b.n, l, a.i6(), false);
            final String r7 = a.R7();
            if (r7 != null) {
                Table.nativeSetString(nativePtr, b.o, l, r7, false);
            }
            Table.nativeSetLong(nativePtr, b.p, l, a.F7(), false);
            Table.nativeSetLong(nativePtr, b.q, l, a.s3(), false);
        }
    }
    
    public static long d9(final f0 f0, final a5.a a, final Map<n0, Long> map) {
        if (a instanceof p && !p0.h8(a)) {
            final p p3 = (p)a;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(a5.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(a5.a.class);
        final long e = b.e;
        long nativeFindFirstInt;
        if (Integer.valueOf(a.a()) != null) {
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
        Table.nativeSetLong(nativePtr, b.f, rowWithPrimaryKey, a.x4(), false);
        final String x3 = a.X2();
        final long g = b.g;
        if (x3 != null) {
            Table.nativeSetString(nativePtr, g, rowWithPrimaryKey, x3, false);
        }
        else {
            Table.nativeSetNull(nativePtr, g, rowWithPrimaryKey, false);
        }
        Table.nativeSetLong(nativePtr, b.h, rowWithPrimaryKey, a.V6(), false);
        final String q6 = a.q6();
        final long i = b.i;
        if (q6 != null) {
            Table.nativeSetString(nativePtr, i, rowWithPrimaryKey, q6, false);
        }
        else {
            Table.nativeSetNull(nativePtr, i, rowWithPrimaryKey, false);
        }
        final String k2 = a.k2();
        final long j = b.j;
        if (k2 != null) {
            Table.nativeSetString(nativePtr, j, rowWithPrimaryKey, k2, false);
        }
        else {
            Table.nativeSetNull(nativePtr, j, rowWithPrimaryKey, false);
        }
        final String a2 = a.A4();
        final long l = b.k;
        if (a2 != null) {
            Table.nativeSetString(nativePtr, l, rowWithPrimaryKey, a2, false);
        }
        else {
            Table.nativeSetNull(nativePtr, l, rowWithPrimaryKey, false);
        }
        Table.nativeSetLong(nativePtr, b.l, rowWithPrimaryKey, a.m0(), false);
        Table.nativeSetLong(nativePtr, b.m, rowWithPrimaryKey, a.o(), false);
        Table.nativeSetBoolean(nativePtr, b.n, rowWithPrimaryKey, a.i6(), false);
        final String r7 = a.R7();
        final long o = b.o;
        if (r7 != null) {
            Table.nativeSetString(nativePtr, o, rowWithPrimaryKey, r7, false);
        }
        else {
            Table.nativeSetNull(nativePtr, o, rowWithPrimaryKey, false);
        }
        Table.nativeSetLong(nativePtr, b.p, rowWithPrimaryKey, a.F7(), false);
        Table.nativeSetLong(nativePtr, b.q, rowWithPrimaryKey, a.s3(), false);
        return rowWithPrimaryKey;
    }
    
    public static void e9(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(a5.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(a5.a.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final a5.a a = (a5.a)iterator.next();
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
            if (Integer.valueOf(a.a()) != null) {
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
            Table.nativeSetLong(nativePtr, b.f, rowWithPrimaryKey, a.x4(), false);
            final String x3 = a.X2();
            final long g = b.g;
            if (x3 != null) {
                Table.nativeSetString(nativePtr, g, rowWithPrimaryKey, x3, false);
            }
            else {
                Table.nativeSetNull(nativePtr, g, rowWithPrimaryKey, false);
            }
            Table.nativeSetLong(nativePtr, b.h, rowWithPrimaryKey, a.V6(), false);
            final String q6 = a.q6();
            final long i = b.i;
            if (q6 != null) {
                Table.nativeSetString(nativePtr, i, rowWithPrimaryKey, q6, false);
            }
            else {
                Table.nativeSetNull(nativePtr, i, rowWithPrimaryKey, false);
            }
            final String k2 = a.k2();
            final long j = b.j;
            if (k2 != null) {
                Table.nativeSetString(nativePtr, j, rowWithPrimaryKey, k2, false);
            }
            else {
                Table.nativeSetNull(nativePtr, j, rowWithPrimaryKey, false);
            }
            final String a2 = a.A4();
            final long l = b.k;
            if (a2 != null) {
                Table.nativeSetString(nativePtr, l, rowWithPrimaryKey, a2, false);
            }
            else {
                Table.nativeSetNull(nativePtr, l, rowWithPrimaryKey, false);
            }
            Table.nativeSetLong(nativePtr, b.l, rowWithPrimaryKey, a.m0(), false);
            Table.nativeSetLong(nativePtr, b.m, rowWithPrimaryKey, a.o(), false);
            Table.nativeSetBoolean(nativePtr, b.n, rowWithPrimaryKey, a.i6(), false);
            final String r7 = a.R7();
            final long o = b.o;
            if (r7 != null) {
                Table.nativeSetString(nativePtr, o, rowWithPrimaryKey, r7, false);
            }
            else {
                Table.nativeSetNull(nativePtr, o, rowWithPrimaryKey, false);
            }
            Table.nativeSetLong(nativePtr, b.p, rowWithPrimaryKey, a.F7(), false);
            Table.nativeSetLong(nativePtr, b.q, rowWithPrimaryKey, a.s3(), false);
        }
    }
    
    static n5 f9(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(a5.a.class), false, Collections.emptyList());
        final n5 n5 = new n5();
        h.a();
        return n5;
    }
    
    static a5.a g9(final f0 f0, final b b, final a5.a a, final a5.a a2, final Map<n0, p> map, final Set<q> set) {
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(a5.a.class), set);
        osObjectBuilder.K(b.e, a2.a());
        osObjectBuilder.K(b.f, a2.x4());
        osObjectBuilder.d0(b.g, a2.X2());
        osObjectBuilder.L(b.h, a2.V6());
        osObjectBuilder.d0(b.i, a2.q6());
        osObjectBuilder.d0(b.j, a2.k2());
        osObjectBuilder.d0(b.k, a2.A4());
        osObjectBuilder.K(b.l, a2.m0());
        osObjectBuilder.L(b.m, a2.o());
        osObjectBuilder.n(b.n, a2.i6());
        osObjectBuilder.d0(b.o, a2.R7());
        osObjectBuilder.L(b.p, a2.F7());
        osObjectBuilder.K(b.q, a2.s3());
        osObjectBuilder.i0();
        return a;
    }
    
    @Override
    public void A3(final String s) {
        if (this.X.i()) {
            if (!this.X.d()) {
                return;
            }
            final r g = this.X.g();
            if (s != null) {
                g.g().t0(this.W.i, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'title' to null.");
        }
        else {
            this.X.f().h();
            if (s != null) {
                this.X.g().d(this.W.i, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'title' to null.");
        }
    }
    
    @Override
    public String A4() {
        this.X.f().h();
        return this.X.g().U(this.W.k);
    }
    
    @Override
    public void C3(final String s) {
        if (this.X.i()) {
            if (!this.X.d()) {
                return;
            }
            final r g = this.X.g();
            if (s != null) {
                g.g().t0(this.W.k, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'messageLong' to null.");
        }
        else {
            this.X.f().h();
            if (s != null) {
                this.X.g().d(this.W.k, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'messageLong' to null.");
        }
    }
    
    @Override
    public void D2(final boolean b) {
        if (!this.X.i()) {
            this.X.f().h();
            this.X.g().i(this.W.n, b);
            return;
        }
        if (!this.X.d()) {
            return;
        }
        final r g = this.X.g();
        g.g().j0(this.W.n, g.l0(), b, true);
    }
    
    @Override
    public long F7() {
        this.X.f().h();
        return this.X.g().m(this.W.p);
    }
    
    @Override
    public void G7(final String s) {
        if (this.X.i()) {
            if (!this.X.d()) {
                return;
            }
            final r g = this.X.g();
            if (s != null) {
                g.g().t0(this.W.g, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'profileId' to null.");
        }
        else {
            this.X.f().h();
            if (s != null) {
                this.X.g().d(this.W.g, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'profileId' to null.");
        }
    }
    
    @Override
    public void H5(final long n) {
        if (!this.X.i()) {
            this.X.f().h();
            this.X.g().s(this.W.p, n);
            return;
        }
        if (!this.X.d()) {
            return;
        }
        final r g = this.X.g();
        g.g().q0(this.W.p, g.l0(), n, true);
    }
    
    @Override
    public void I2(final int n) {
        if (!this.X.i()) {
            this.X.f().h();
            this.X.g().s(this.W.f, n);
            return;
        }
        if (!this.X.d()) {
            return;
        }
        final r g = this.X.g();
        g.g().q0(this.W.f, g.l0(), n, true);
    }
    
    @Override
    public void R4(final String s) {
        if (this.X.i()) {
            if (!this.X.d()) {
                return;
            }
            final r g = this.X.g();
            if (s != null) {
                g.g().t0(this.W.o, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'extras' to null.");
        }
        else {
            this.X.f().h();
            if (s != null) {
                this.X.g().d(this.W.o, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'extras' to null.");
        }
    }
    
    @Override
    public String R7() {
        this.X.f().h();
        return this.X.g().U(this.W.o);
    }
    
    @Override
    public c0<?> S6() {
        return this.X;
    }
    
    @Override
    public long V6() {
        this.X.f().h();
        return this.X.g().m(this.W.h);
    }
    
    @Override
    public String X2() {
        this.X.f().h();
        return this.X.g().U(this.W.g);
    }
    
    @Override
    public int a() {
        this.X.f().h();
        return (int)this.X.g().m(this.W.e);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final n5 n5 = (n5)o;
        final io.realm.a f = this.X.f();
        final io.realm.a f2 = n5.X.f();
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
        final String m = this.X.g().g().M();
        final String i = n5.X.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.X.g().l0() == n5.X.g().l0();
            }
        }
        else if (i == null) {
            return this.X.g().l0() == n5.X.g().l0();
        }
        return false;
    }
    
    @Override
    public void h2(final int n) {
        if (this.X.i()) {
            return;
        }
        this.X.f().h();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }
    
    @Override
    public int hashCode() {
        final String path = this.X.f().getPath();
        final String m = this.X.g().g().M();
        final long l0 = this.X.g().l0();
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
    public boolean i6() {
        this.X.f().h();
        return this.X.g().l(this.W.n);
    }
    
    @Override
    public String k2() {
        this.X.f().h();
        return this.X.g().U(this.W.j);
    }
    
    @Override
    public int m0() {
        this.X.f().h();
        return (int)this.X.g().m(this.W.l);
    }
    
    @Override
    public void n2(final long n) {
        if (!this.X.i()) {
            this.X.f().h();
            this.X.g().s(this.W.h, n);
            return;
        }
        if (!this.X.d()) {
            return;
        }
        final r g = this.X.g();
        g.g().q0(this.W.h, g.l0(), n, true);
    }
    
    @Override
    public void n5(final String s) {
        if (this.X.i()) {
            if (!this.X.d()) {
                return;
            }
            final r g = this.X.g();
            if (s != null) {
                g.g().t0(this.W.j, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'message' to null.");
        }
        else {
            this.X.f().h();
            if (s != null) {
                this.X.g().d(this.W.j, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'message' to null.");
        }
    }
    
    @Override
    public long o() {
        this.X.f().h();
        return this.X.g().m(this.W.m);
    }
    
    @Override
    public void p(final long n) {
        if (!this.X.i()) {
            this.X.f().h();
            this.X.g().s(this.W.m, n);
            return;
        }
        if (!this.X.d()) {
            return;
        }
        final r g = this.X.g();
        g.g().q0(this.W.m, g.l0(), n, true);
    }
    
    @Override
    public void q0(final int n) {
        if (!this.X.i()) {
            this.X.f().h();
            this.X.g().s(this.W.l, n);
            return;
        }
        if (!this.X.d()) {
            return;
        }
        final r g = this.X.g();
        g.g().q0(this.W.l, g.l0(), n, true);
    }
    
    @Override
    public String q6() {
        this.X.f().h();
        return this.X.g().U(this.W.i);
    }
    
    @Override
    public int s3() {
        this.X.f().h();
        return (int)this.X.g().m(this.W.q);
    }
    
    @Override
    public String toString() {
        if (!p0.k8(this)) {
            return "Invalid object";
        }
        final StringBuilder sb = new StringBuilder("RealmSystemNotification = proxy[");
        sb.append("{id:");
        sb.append(this.a());
        sb.append("}");
        sb.append(",");
        sb.append("{jobId:");
        sb.append(this.x4());
        sb.append("}");
        sb.append(",");
        sb.append("{profileId:");
        sb.append(this.X2());
        sb.append("}");
        sb.append(",");
        sb.append("{publishDateTime:");
        sb.append(this.V6());
        sb.append("}");
        sb.append(",");
        sb.append("{title:");
        sb.append(this.q6());
        sb.append("}");
        sb.append(",");
        sb.append("{message:");
        sb.append(this.k2());
        sb.append("}");
        sb.append(",");
        sb.append("{messageLong:");
        sb.append(this.A4());
        sb.append("}");
        sb.append(",");
        sb.append("{type:");
        sb.append(this.m0());
        sb.append("}");
        sb.append(",");
        sb.append("{entityId:");
        sb.append(this.o());
        sb.append("}");
        sb.append(",");
        sb.append("{deleted:");
        sb.append(this.i6());
        sb.append("}");
        sb.append(",");
        sb.append("{extras:");
        sb.append(this.R7());
        sb.append("}");
        sb.append(",");
        sb.append("{target:");
        sb.append(this.F7());
        sb.append("}");
        sb.append(",");
        sb.append("{offset:");
        sb.append(this.s3());
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
    
    @Override
    public void x3(final int n) {
        if (!this.X.i()) {
            this.X.f().h();
            this.X.g().s(this.W.q, n);
            return;
        }
        if (!this.X.d()) {
            return;
        }
        final r g = this.X.g();
        g.g().q0(this.W.q, g.l0(), n, true);
    }
    
    @Override
    public int x4() {
        this.X.f().h();
        return (int)this.X.g().m(this.W.f);
    }
    
    @Override
    public void y4() {
        if (this.X != null) {
            return;
        }
        final io.realm.a.h h = io.realm.a.W.get();
        this.W = (b)h.c();
        (this.X = new c0<a5.a>(this)).r(h.e());
        this.X.s(h.f());
        this.X.o(h.b());
        this.X.q(h.d());
    }
    
    public static final class a
    {
        public static final String a = "RealmSystemNotification";
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
        
        b(final OsSchemaInfo osSchemaInfo) {
            super(13);
            final OsObjectSchemaInfo b = osSchemaInfo.b("RealmSystemNotification");
            this.e = this.b("id", "id", b);
            this.f = this.b("jobId", "jobId", b);
            this.g = this.b("profileId", "profileId", b);
            this.h = this.b("publishDateTime", "publishDateTime", b);
            this.i = this.b("title", "title", b);
            this.j = this.b("message", "message", b);
            this.k = this.b("messageLong", "messageLong", b);
            this.l = this.b("type", "type", b);
            this.m = this.b("entityId", "entityId", b);
            this.n = this.b("deleted", "deleted", b);
            this.o = this.b("extras", "extras", b);
            this.p = this.b("target", "target", b);
            this.q = this.b("offset", "offset", b);
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
        }
    }
}
