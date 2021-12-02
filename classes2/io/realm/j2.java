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
import n4.a;

public class j2 extends n4.a implements p, k2
{
    private static final String T = "";
    private static final OsObjectSchemaInfo U;
    private b Q;
    private c0<n4.a> R;
    private l0<o4.a> S;
    
    static {
        U = K8();
    }
    
    j2() {
        this.R.p();
    }
    
    public static n4.a G8(final f0 f0, final b b, final n4.a a, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        final j2 j2 = map.get(a);
        if (j2 != null) {
            return j2;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(n4.a.class), set);
        osObjectBuilder.L(b.e, a.a());
        osObjectBuilder.d0(b.f, a.H0());
        osObjectBuilder.d0(b.g, a.K0());
        osObjectBuilder.d0(b.h, a.i1());
        osObjectBuilder.d0(b.i, a.g0());
        osObjectBuilder.n(b.j, a.u2());
        final j2 t8 = T8(f0, osObjectBuilder.f0());
        map.put(a, t8);
        final l0<o4.a> e = a.E();
        if (e != null) {
            final l0<o4.a> e2 = t8.E();
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
        return t8;
    }
    
    public static n4.a H8(final f0 f0, final b b, final n4.a a, final boolean b2, final Map<n0, p> map, final Set<q> set) {
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
            return (n4.a)p7;
        }
        final p p8 = null;
        Object x2 = null;
        boolean b3 = false;
        Label_0232: {
            if (b2) {
                x2 = f0.x2(n4.a.class);
                final long r = ((Table)x2).r(b.e, a.a());
                if (r == -1L) {
                    b3 = false;
                    x2 = p8;
                    break Label_0232;
                }
                try {
                    h.g(f0, ((Table)x2).R(r), b, false, Collections.emptyList());
                    x2 = new j2();
                    map.put(a, (p)x2);
                }
                finally {
                    h.a();
                }
            }
            b3 = b2;
        }
        n4.a a2;
        if (b3) {
            a2 = U8(f0, b, (n4.a)x2, a, map, set);
        }
        else {
            a2 = G8(f0, b, a, b2, map, set);
        }
        return a2;
    }
    
    public static b I8(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static n4.a J8(final n4.a a, final int a2, final int n, final Map<n0, p.a<n0>> map) {
        if (a2 <= n && a != null) {
            final p.a a3 = map.get(a);
            n4.a a4;
            if (a3 == null) {
                a4 = new n4.a();
                map.put(a, (p.a<n0>)new p.a(a2, a4));
            }
            else {
                if (a2 >= a3.a) {
                    return (n4.a)a3.b;
                }
                a4 = (n4.a)a3.b;
                a3.a = a2;
            }
            a4.b(a.a());
            a4.Z0(a.H0());
            a4.G1(a.K0());
            a4.P0(a.i1());
            a4.S0(a.g0());
            a4.Z3(a.u2());
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
    
    private static OsObjectSchemaInfo K8() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmPeriodInfo", false, 7, 0);
        b.c("", "id", RealmFieldType.INTEGER, true, false, true);
        final RealmFieldType string = RealmFieldType.STRING;
        b.c("", "info", string, false, false, true);
        b.c("", "substitution", string, false, false, true);
        b.c("", "lesson", string, false, false, true);
        b.c("", "local", string, false, false, true);
        b.c("", "sync", RealmFieldType.BOOLEAN, false, false, true);
        b.b("", "driveAttachments", RealmFieldType.LIST, "RealmDriveAttachment");
        return b.e();
    }
    
    public static n4.a L8(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final ArrayList<String> list = new ArrayList<String>(1);
        Object x2 = null;
        Label_0146: {
            if (b) {
                x2 = f0.x2(n4.a.class);
                final long e = ((b)f0.H().j(n4.a.class)).e;
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
                        h.g(f0, ((Table)x2).R(r), f0.H().j(n4.a.class), false, Collections.emptyList());
                        x2 = new j2();
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
            j2 j2;
            if (jsonObject.isNull("id")) {
                j2 = f0.p1((Class<j2>)n4.a.class, null, true, list);
            }
            else {
                j2 = f0.p1((Class<j2>)n4.a.class, jsonObject.getLong("id"), true, list);
            }
            o = j2;
        }
        if (jsonObject.has("info")) {
            if (jsonObject.isNull("info")) {
                ((k2)o).Z0(null);
            }
            else {
                ((k2)o).Z0(jsonObject.getString("info"));
            }
        }
        if (jsonObject.has("substitution")) {
            if (jsonObject.isNull("substitution")) {
                ((k2)o).G1(null);
            }
            else {
                ((k2)o).G1(jsonObject.getString("substitution"));
            }
        }
        if (jsonObject.has("lesson")) {
            if (jsonObject.isNull("lesson")) {
                ((k2)o).P0(null);
            }
            else {
                ((k2)o).P0(jsonObject.getString("lesson"));
            }
        }
        if (jsonObject.has("local")) {
            if (jsonObject.isNull("local")) {
                ((k2)o).S0(null);
            }
            else {
                ((k2)o).S0(jsonObject.getString("local"));
            }
        }
        if (jsonObject.has("sync")) {
            if (jsonObject.isNull("sync")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'sync' to null.");
            }
            ((k2)o).Z3(jsonObject.getBoolean("sync"));
        }
        if (jsonObject.has("driveAttachments")) {
            if (jsonObject.isNull("driveAttachments")) {
                ((k2)o).B(null);
            }
            else {
                ((k2)o).E().clear();
                final JSONArray jsonArray = jsonObject.getJSONArray("driveAttachments");
                for (int i = 0; i < jsonArray.length(); ++i) {
                    ((k2)o).E().add(l2.D8(f0, jsonArray.getJSONObject(i), b));
                }
            }
        }
        return (n4.a)o;
    }
    
    @TargetApi(11)
    public static n4.a M8(final f0 f0, final JsonReader jsonReader) throws IOException {
        final n4.a a = new n4.a();
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
            else if (nextName.equals("info")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    a.Z0(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    a.Z0(null);
                }
            }
            else if (nextName.equals("substitution")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    a.G1(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    a.G1(null);
                }
            }
            else if (nextName.equals("lesson")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    a.P0(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    a.P0(null);
                }
            }
            else if (nextName.equals("local")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    a.S0(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    a.S0(null);
                }
            }
            else if (nextName.equals("sync")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'sync' to null.");
                }
                a.Z3(jsonReader.nextBoolean());
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
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }
    
    public static OsObjectSchemaInfo N8() {
        return j2.U;
    }
    
    public static String O8() {
        return "RealmPeriodInfo";
    }
    
    public static long P8(final f0 f0, final n4.a a, final Map<n0, Long> map) {
        if (a instanceof p && !p0.h8(a)) {
            final p p3 = (p)a;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(n4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(n4.a.class);
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
        final String h0 = a.H0();
        if (h0 != null) {
            Table.nativeSetString(nativePtr, b.f, l, h0, false);
        }
        final String k0 = a.K0();
        if (k0 != null) {
            Table.nativeSetString(nativePtr, b.g, l, k0, false);
        }
        final String i1 = a.i1();
        if (i1 != null) {
            Table.nativeSetString(nativePtr, b.h, l, i1, false);
        }
        final String g0 = a.g0();
        if (g0 != null) {
            Table.nativeSetString(nativePtr, b.i, l, g0, false);
        }
        Table.nativeSetBoolean(nativePtr, b.j, l, a.u2(), false);
        final l0<o4.a> e2 = a.E();
        if (e2 != null) {
            final OsList list = new OsList(x2.R(l), b.k);
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
    
    public static void Q8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(n4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(n4.a.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final n4.a a = (n4.a)iterator.next();
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
            final String h0 = a.H0();
            if (h0 != null) {
                Table.nativeSetString(nativePtr, b.f, l, h0, false);
            }
            final String k0 = a.K0();
            if (k0 != null) {
                Table.nativeSetString(nativePtr, b.g, l, k0, false);
            }
            final String i1 = a.i1();
            if (i1 != null) {
                Table.nativeSetString(nativePtr, b.h, l, i1, false);
            }
            final String g0 = a.g0();
            if (g0 != null) {
                Table.nativeSetString(nativePtr, b.i, l, g0, false);
            }
            Table.nativeSetBoolean(nativePtr, b.j, l, a.u2(), false);
            final l0<o4.a> e2 = a.E();
            if (e2 == null) {
                continue;
            }
            final OsList list = new OsList(x2.R(l), b.k);
            for (final o4.a a2 : e2) {
                Long value2;
                if ((value2 = map.get(a2)) == null) {
                    value2 = l2.H8(f0, a2, map);
                }
                list.l(value2);
            }
        }
    }
    
    public static long R8(final f0 f0, final n4.a a, final Map<n0, Long> map) {
        if (a instanceof p && !p0.h8(a)) {
            final p p3 = (p)a;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(n4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(n4.a.class);
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
        final String h0 = a.H0();
        if (h0 != null) {
            Table.nativeSetString(nativePtr, b.f, rowWithPrimaryKey, h0, false);
        }
        else {
            Table.nativeSetNull(nativePtr, b.f, rowWithPrimaryKey, false);
        }
        final String k0 = a.K0();
        final long g = b.g;
        if (k0 != null) {
            Table.nativeSetString(nativePtr, g, rowWithPrimaryKey, k0, false);
        }
        else {
            Table.nativeSetNull(nativePtr, g, rowWithPrimaryKey, false);
        }
        final String i1 = a.i1();
        final long h2 = b.h;
        if (i1 != null) {
            Table.nativeSetString(nativePtr, h2, rowWithPrimaryKey, i1, false);
        }
        else {
            Table.nativeSetNull(nativePtr, h2, rowWithPrimaryKey, false);
        }
        final String g2 = a.g0();
        final long j = b.i;
        if (g2 != null) {
            Table.nativeSetString(nativePtr, j, rowWithPrimaryKey, g2, false);
        }
        else {
            Table.nativeSetNull(nativePtr, j, rowWithPrimaryKey, false);
        }
        Table.nativeSetBoolean(nativePtr, b.j, rowWithPrimaryKey, a.u2(), false);
        final OsList list = new OsList(x2.R(rowWithPrimaryKey), b.k);
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
    
    public static void S8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(n4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(n4.a.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final n4.a a = (n4.a)iterator.next();
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
            final String h0 = a.H0();
            if (h0 != null) {
                Table.nativeSetString(nativePtr, b.f, rowWithPrimaryKey, h0, false);
            }
            else {
                Table.nativeSetNull(nativePtr, b.f, rowWithPrimaryKey, false);
            }
            final String k0 = a.K0();
            final long g = b.g;
            if (k0 != null) {
                Table.nativeSetString(nativePtr, g, rowWithPrimaryKey, k0, false);
            }
            else {
                Table.nativeSetNull(nativePtr, g, rowWithPrimaryKey, false);
            }
            final String i1 = a.i1();
            final long h2 = b.h;
            if (i1 != null) {
                Table.nativeSetString(nativePtr, h2, rowWithPrimaryKey, i1, false);
            }
            else {
                Table.nativeSetNull(nativePtr, h2, rowWithPrimaryKey, false);
            }
            final String g2 = a.g0();
            final long j = b.i;
            if (g2 != null) {
                Table.nativeSetString(nativePtr, j, rowWithPrimaryKey, g2, false);
            }
            else {
                Table.nativeSetNull(nativePtr, j, rowWithPrimaryKey, false);
            }
            Table.nativeSetBoolean(nativePtr, b.j, rowWithPrimaryKey, a.u2(), false);
            final OsList list = new OsList(x2.R(rowWithPrimaryKey), b.k);
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
    
    static j2 T8(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(n4.a.class), false, Collections.emptyList());
        final j2 j2 = new j2();
        h.a();
        return j2;
    }
    
    static n4.a U8(final f0 f0, final b b, final n4.a a, final n4.a a2, final Map<n0, p> map, final Set<q> set) {
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(n4.a.class), set);
        osObjectBuilder.L(b.e, a2.a());
        osObjectBuilder.d0(b.f, a2.H0());
        osObjectBuilder.d0(b.g, a2.K0());
        osObjectBuilder.d0(b.h, a2.i1());
        osObjectBuilder.d0(b.i, a2.g0());
        osObjectBuilder.n(b.j, a2.u2());
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
            osObjectBuilder.Z(b.k, l0);
        }
        else {
            osObjectBuilder.Z(b.k, new l0<n0>());
        }
        osObjectBuilder.i0();
        return a;
    }
    
    @Override
    public void B(final l0<o4.a> l0) {
        final boolean i = this.R.i();
        final int n = 0;
        int j = 0;
        l0<o4.a> l2 = l0;
        if (i) {
            if (!this.R.d()) {
                return;
            }
            if (this.R.e().contains("driveAttachments")) {
                return;
            }
            if ((l2 = l0) != null) {
                l2 = l0;
                if (!l0.G0()) {
                    final f0 f0 = (f0)this.R.f();
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
        this.R.f().h();
        final OsList p = this.R.g().p(this.Q.k);
        if (l2 != null && l2.size() == p.b0()) {
            while (j < l2.size()) {
                final o4.a a3 = l2.get(j);
                this.R.c(a3);
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
                this.R.c(a4);
                p.l(((p)a4).S6().g().l0());
            }
        }
    }
    
    @Override
    public l0<o4.a> E() {
        this.R.f().h();
        final l0<o4.a> s = this.S;
        if (s != null) {
            return s;
        }
        return this.S = new l0<o4.a>(o4.a.class, this.R.g().p(this.Q.k), this.R.f());
    }
    
    @Override
    public void G1(final String s) {
        if (this.R.i()) {
            if (!this.R.d()) {
                return;
            }
            final r g = this.R.g();
            if (s != null) {
                g.g().t0(this.Q.g, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'substitution' to null.");
        }
        else {
            this.R.f().h();
            if (s != null) {
                this.R.g().d(this.Q.g, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'substitution' to null.");
        }
    }
    
    @Override
    public String H0() {
        this.R.f().h();
        return this.R.g().U(this.Q.f);
    }
    
    @Override
    public String K0() {
        this.R.f().h();
        return this.R.g().U(this.Q.g);
    }
    
    @Override
    public void P0(final String s) {
        if (this.R.i()) {
            if (!this.R.d()) {
                return;
            }
            final r g = this.R.g();
            if (s != null) {
                g.g().t0(this.Q.h, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'lesson' to null.");
        }
        else {
            this.R.f().h();
            if (s != null) {
                this.R.g().d(this.Q.h, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'lesson' to null.");
        }
    }
    
    @Override
    public void S0(final String s) {
        if (this.R.i()) {
            if (!this.R.d()) {
                return;
            }
            final r g = this.R.g();
            if (s != null) {
                g.g().t0(this.Q.i, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'local' to null.");
        }
        else {
            this.R.f().h();
            if (s != null) {
                this.R.g().d(this.Q.i, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'local' to null.");
        }
    }
    
    @Override
    public c0<?> S6() {
        return this.R;
    }
    
    @Override
    public void Z0(final String s) {
        if (this.R.i()) {
            if (!this.R.d()) {
                return;
            }
            final r g = this.R.g();
            if (s != null) {
                g.g().t0(this.Q.f, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'info' to null.");
        }
        else {
            this.R.f().h();
            if (s != null) {
                this.R.g().d(this.Q.f, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'info' to null.");
        }
    }
    
    @Override
    public void Z3(final boolean b) {
        if (!this.R.i()) {
            this.R.f().h();
            this.R.g().i(this.Q.j, b);
            return;
        }
        if (!this.R.d()) {
            return;
        }
        final r g = this.R.g();
        g.g().j0(this.Q.j, g.l0(), b, true);
    }
    
    @Override
    public long a() {
        this.R.f().h();
        return this.R.g().m(this.Q.e);
    }
    
    @Override
    public void b(final long n) {
        if (this.R.i()) {
            return;
        }
        this.R.f().h();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final j2 j2 = (j2)o;
        final io.realm.a f = this.R.f();
        final io.realm.a f2 = j2.R.f();
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
        final String m = this.R.g().g().M();
        final String i = j2.R.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.R.g().l0() == j2.R.g().l0();
            }
        }
        else if (i == null) {
            return this.R.g().l0() == j2.R.g().l0();
        }
        return false;
    }
    
    @Override
    public String g0() {
        this.R.f().h();
        return this.R.g().U(this.Q.i);
    }
    
    @Override
    public int hashCode() {
        final String path = this.R.f().getPath();
        final String m = this.R.g().g().M();
        final long l0 = this.R.g().l0();
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
        this.R.f().h();
        return this.R.g().U(this.Q.h);
    }
    
    @Override
    public String toString() {
        if (!p0.k8(this)) {
            return "Invalid object";
        }
        final StringBuilder sb = new StringBuilder("RealmPeriodInfo = proxy[");
        sb.append("{id:");
        sb.append(this.a());
        sb.append("}");
        sb.append(",");
        sb.append("{info:");
        sb.append(this.H0());
        sb.append("}");
        sb.append(",");
        sb.append("{substitution:");
        sb.append(this.K0());
        sb.append("}");
        sb.append(",");
        sb.append("{lesson:");
        sb.append(this.i1());
        sb.append("}");
        sb.append(",");
        sb.append("{local:");
        sb.append(this.g0());
        sb.append("}");
        sb.append(",");
        sb.append("{sync:");
        sb.append(this.u2());
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
    public boolean u2() {
        this.R.f().h();
        return this.R.g().l(this.Q.j);
    }
    
    @Override
    public void y4() {
        if (this.R != null) {
            return;
        }
        final io.realm.a.h h = io.realm.a.W.get();
        this.Q = (b)h.c();
        (this.R = new c0<n4.a>(this)).r(h.e());
        this.R.s(h.f());
        this.R.o(h.b());
        this.R.q(h.d());
    }
    
    public static final class a
    {
        public static final String a = "RealmPeriodInfo";
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
        
        b(final OsSchemaInfo osSchemaInfo) {
            super(7);
            final OsObjectSchemaInfo b = osSchemaInfo.b("RealmPeriodInfo");
            this.e = this.b("id", "id", b);
            this.f = this.b("info", "info", b);
            this.g = this.b("substitution", "substitution", b);
            this.h = this.b("lesson", "lesson", b);
            this.i = this.b("local", "local", b);
            this.j = this.b("sync", "sync", b);
            this.k = this.b("driveAttachments", "driveAttachments", b);
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
        }
    }
}
