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
import java.util.Collections;
import io.realm.internal.r;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Set;
import java.util.Map;
import c5.c;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.p;
import c5.e;

public class d6 extends e implements p, e6
{
    private static final String X = "";
    private static final OsObjectSchemaInfo Y;
    private b T;
    private c0<e> U;
    private l0<c> V;
    private l0<c> W;
    
    static {
        Y = Q8();
    }
    
    d6() {
        this.U.p();
    }
    
    public static e M8(final f0 f0, final b b, final e e, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        final d6 d6 = map.get(e);
        if (d6 != null) {
            return d6;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(e.class), set);
        osObjectBuilder.K(b.e, e.l());
        osObjectBuilder.L(b.f, e.o());
        osObjectBuilder.L(b.g, e.H());
        osObjectBuilder.L(b.h, e.b0());
        osObjectBuilder.L(b.k, e.j7());
        osObjectBuilder.n(b.l, e.T2());
        osObjectBuilder.L(b.m, e.f7());
        osObjectBuilder.d0(b.n, e.a());
        final d6 z8 = Z8(f0, osObjectBuilder.f0());
        map.put(e, z8);
        final l0<c> j0 = e.J0();
        final int n = 0;
        if (j0 != null) {
            final l0<c> j2 = z8.J0();
            j2.clear();
            for (int i = 0; i < j0.size(); ++i) {
                final c c = j0.get(i);
                c z9 = (c)map.get(c);
                if (z9 == null) {
                    z9 = z5.z9(f0, (z5.b)f0.H().j(c.class), c, b2, map, set);
                }
                j2.add(z9);
            }
        }
        final l0<c> d7 = e.d5();
        if (d7 != null) {
            final l0<c> d8 = z8.d5();
            d8.clear();
            for (int k = n; k < d7.size(); ++k) {
                final c c2 = d7.get(k);
                c z10 = (c)map.get(c2);
                if (z10 == null) {
                    z10 = z5.z9(f0, (z5.b)f0.H().j(c.class), c2, b2, map, set);
                }
                d8.add(z10);
            }
        }
        return z8;
    }
    
    public static e N8(final f0 f0, final b b, final e e, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        if (e instanceof p && !p0.h8(e)) {
            final p p6 = (p)e;
            if (p6.S6().f() != null) {
                final io.realm.a f2 = p6.S6().f();
                if (f2.H != f0.H) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
                if (f2.getPath().equals(f0.getPath())) {
                    return e;
                }
            }
        }
        final io.realm.a.h h = io.realm.a.W.get();
        final p p7 = map.get(e);
        if (p7 != null) {
            return (e)p7;
        }
        final p p8 = null;
        Object x2 = null;
        boolean b3 = false;
        Label_0232: {
            if (b2) {
                x2 = f0.x2(e.class);
                final long u = ((Table)x2).u(b.n, e.a());
                if (u == -1L) {
                    b3 = false;
                    x2 = p8;
                    break Label_0232;
                }
                try {
                    h.g(f0, ((Table)x2).R(u), b, false, Collections.emptyList());
                    x2 = new d6();
                    map.put(e, (p)x2);
                }
                finally {
                    h.a();
                }
            }
            b3 = b2;
        }
        e e2;
        if (b3) {
            e2 = a9(f0, b, (e)x2, e, map, set);
        }
        else {
            e2 = M8(f0, b, e, b2, map, set);
        }
        return e2;
    }
    
    public static b O8(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static e P8(final e e, final int a, final int n, final Map<n0, p.a<n0>> map) {
        if (a <= n && e != null) {
            final p.a a2 = map.get(e);
            e e2;
            if (a2 == null) {
                e2 = new e();
                map.put(e, (p.a<n0>)new p.a(a, e2));
            }
            else {
                if (a >= a2.a) {
                    return (e)a2.b;
                }
                e2 = (e)a2.b;
                a2.a = a;
            }
            e2.k(e.l());
            e2.p(e.o());
            e2.W(e.H());
            e2.s0(e.b0());
            final int n2 = 0;
            if (a == n) {
                e2.c1(null);
            }
            else {
                final l0<c> j0 = e.J0();
                final l0<c> l0 = new l0<c>();
                e2.c1(l0);
                for (int size = j0.size(), i = 0; i < size; ++i) {
                    l0.add(z5.B9(j0.get(i), a + 1, n, map));
                }
            }
            if (a == n) {
                e2.M5(null);
            }
            else {
                final l0<c> d5 = e.d5();
                final l0<c> l2 = new l0<c>();
                e2.M5(l2);
                for (int size2 = d5.size(), k = n2; k < size2; ++k) {
                    l2.add(z5.B9(d5.get(k), a + 1, n, map));
                }
            }
            e2.A2(e.j7());
            e2.d4(e.T2());
            e2.W3(e.f7());
            e2.D1(e.a());
            return e2;
        }
        return null;
    }
    
    private static OsObjectSchemaInfo Q8() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmTimeTableModel", false, 10, 0);
        final RealmFieldType integer = RealmFieldType.INTEGER;
        b.c("", "entityType", integer, false, false, true);
        b.c("", "entityId", integer, false, false, true);
        b.c("", "date", integer, false, false, true);
        b.c("", "timestamp", integer, false, false, true);
        final RealmFieldType list = RealmFieldType.LIST;
        b.b("", "periods", list, "RealmPeriodModel");
        b.b("", "periodsWithOutCancelled", list, "RealmPeriodModel");
        b.c("", "holiday", integer, false, false, true);
        b.c("", "preLoadedPeriodData", RealmFieldType.BOOLEAN, false, false, true);
        b.c("", "lastRequestTimestamp", integer, false, false, true);
        b.c("", "id", RealmFieldType.STRING, true, false, true);
        return b.e();
    }
    
    public static e R8(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final ArrayList<String> list = new ArrayList<String>(2);
        Object x2 = null;
        Label_0146: {
            if (b) {
                x2 = f0.x2(e.class);
                final long n = ((b)f0.H().j(e.class)).n;
                long u;
                if (!jsonObject.isNull("id")) {
                    u = ((Table)x2).u(n, jsonObject.getString("id"));
                }
                else {
                    u = -1L;
                }
                if (u != -1L) {
                    final io.realm.a.h h = io.realm.a.W.get();
                    try {
                        h.g(f0, ((Table)x2).R(u), f0.H().j(e.class), false, Collections.emptyList());
                        x2 = new d6();
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
            if (jsonObject.has("periods")) {
                list.add("periods");
            }
            if (jsonObject.has("periodsWithOutCancelled")) {
                list.add("periodsWithOutCancelled");
            }
            if (!jsonObject.has("id")) {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
            d6 d6;
            if (jsonObject.isNull("id")) {
                d6 = f0.p1((Class<d6>)e.class, null, true, list);
            }
            else {
                d6 = f0.p1((Class<d6>)e.class, jsonObject.getString("id"), true, list);
            }
            o = d6;
        }
        if (jsonObject.has("entityType")) {
            if (jsonObject.isNull("entityType")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'entityType' to null.");
            }
            ((e6)o).k(jsonObject.getInt("entityType"));
        }
        if (jsonObject.has("entityId")) {
            if (jsonObject.isNull("entityId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'entityId' to null.");
            }
            ((e6)o).p(jsonObject.getLong("entityId"));
        }
        if (jsonObject.has("date")) {
            if (jsonObject.isNull("date")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'date' to null.");
            }
            ((e6)o).W(jsonObject.getLong("date"));
        }
        if (jsonObject.has("timestamp")) {
            if (jsonObject.isNull("timestamp")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'timestamp' to null.");
            }
            ((e6)o).s0(jsonObject.getLong("timestamp"));
        }
        final boolean has = jsonObject.has("periods");
        final int n2 = 0;
        if (has) {
            if (jsonObject.isNull("periods")) {
                ((e6)o).c1(null);
            }
            else {
                ((e6)o).J0().clear();
                final JSONArray jsonArray = jsonObject.getJSONArray("periods");
                for (int i = 0; i < jsonArray.length(); ++i) {
                    ((e6)o).J0().add(z5.D9(f0, jsonArray.getJSONObject(i), b));
                }
            }
        }
        if (jsonObject.has("periodsWithOutCancelled")) {
            if (jsonObject.isNull("periodsWithOutCancelled")) {
                ((e6)o).M5(null);
            }
            else {
                ((e6)o).d5().clear();
                final JSONArray jsonArray2 = jsonObject.getJSONArray("periodsWithOutCancelled");
                for (int j = n2; j < jsonArray2.length(); ++j) {
                    ((e6)o).d5().add(z5.D9(f0, jsonArray2.getJSONObject(j), b));
                }
            }
        }
        if (jsonObject.has("holiday")) {
            if (jsonObject.isNull("holiday")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'holiday' to null.");
            }
            ((e6)o).A2(jsonObject.getLong("holiday"));
        }
        if (jsonObject.has("preLoadedPeriodData")) {
            if (jsonObject.isNull("preLoadedPeriodData")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'preLoadedPeriodData' to null.");
            }
            ((e6)o).d4(jsonObject.getBoolean("preLoadedPeriodData"));
        }
        if (jsonObject.has("lastRequestTimestamp")) {
            if (jsonObject.isNull("lastRequestTimestamp")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'lastRequestTimestamp' to null.");
            }
            ((e6)o).W3(jsonObject.getLong("lastRequestTimestamp"));
        }
        return (e)o;
    }
    
    @TargetApi(11)
    public static e S8(final f0 f0, final JsonReader jsonReader) throws IOException {
        final e e = new e();
        jsonReader.beginObject();
        boolean b = false;
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            if (nextName.equals("entityType")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'entityType' to null.");
                }
                e.k(jsonReader.nextInt());
            }
            else if (nextName.equals("entityId")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'entityId' to null.");
                }
                e.p(jsonReader.nextLong());
            }
            else if (nextName.equals("date")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'date' to null.");
                }
                e.W(jsonReader.nextLong());
            }
            else if (nextName.equals("timestamp")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'timestamp' to null.");
                }
                e.s0(jsonReader.nextLong());
            }
            else {
                if (nextName.equals("periods")) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.skipValue();
                        e.c1(null);
                        continue;
                    }
                    e.c1(new l0<c>());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        e.J0().add(z5.E9(f0, jsonReader));
                    }
                }
                else if (nextName.equals("periodsWithOutCancelled")) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.skipValue();
                        e.M5(null);
                        continue;
                    }
                    e.M5(new l0<c>());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        e.d5().add(z5.E9(f0, jsonReader));
                    }
                }
                else if (nextName.equals("holiday")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        e.A2(jsonReader.nextLong());
                        continue;
                    }
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'holiday' to null.");
                }
                else if (nextName.equals("preLoadedPeriodData")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        e.d4(jsonReader.nextBoolean());
                        continue;
                    }
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'preLoadedPeriodData' to null.");
                }
                else if (nextName.equals("lastRequestTimestamp")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        e.W3(jsonReader.nextLong());
                        continue;
                    }
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'lastRequestTimestamp' to null.");
                }
                else {
                    if (nextName.equals("id")) {
                        if (jsonReader.peek() != JsonToken.NULL) {
                            e.D1(jsonReader.nextString());
                        }
                        else {
                            jsonReader.skipValue();
                            e.D1(null);
                        }
                        b = true;
                        continue;
                    }
                    jsonReader.skipValue();
                    continue;
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
        if (b) {
            return f0.G0(e, new q[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }
    
    public static OsObjectSchemaInfo T8() {
        return d6.Y;
    }
    
    public static String U8() {
        return "RealmTimeTableModel";
    }
    
    public static long V8(final f0 f0, final e e, final Map<n0, Long> map) {
        if (e instanceof p && !p0.h8(e)) {
            final p p3 = (p)e;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(e.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(e.class);
        final long n = b.n;
        final String a = e.a();
        long l;
        if (a != null) {
            l = Table.nativeFindFirstString(nativePtr, n, a);
        }
        else {
            l = -1L;
        }
        if (l == -1L) {
            l = OsObject.createRowWithPrimaryKey(x2, n, a);
        }
        else {
            Table.v0(a);
        }
        map.put(e, l);
        Table.nativeSetLong(nativePtr, b.e, l, e.l(), false);
        Table.nativeSetLong(nativePtr, b.f, l, e.o(), false);
        Table.nativeSetLong(nativePtr, b.g, l, e.H(), false);
        Table.nativeSetLong(nativePtr, b.h, l, e.b0(), false);
        final l0<c> j0 = e.J0();
        if (j0 != null) {
            final OsList list = new OsList(x2.R(l), b.i);
            for (final c c : j0) {
                Long value;
                if ((value = map.get(c)) == null) {
                    value = z5.H9(f0, c, map);
                }
                list.l(value);
            }
        }
        final l0<c> d5 = e.d5();
        if (d5 != null) {
            final OsList list2 = new OsList(x2.R(l), b.j);
            for (final c c2 : d5) {
                Long value2;
                if ((value2 = map.get(c2)) == null) {
                    value2 = z5.H9(f0, c2, map);
                }
                list2.l(value2);
            }
        }
        Table.nativeSetLong(nativePtr, b.k, l, e.j7(), false);
        Table.nativeSetBoolean(nativePtr, b.l, l, e.T2(), false);
        Table.nativeSetLong(nativePtr, b.m, l, e.f7(), false);
        return l;
    }
    
    public static void W8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(e.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(e.class);
        final long n = b.n;
        while (iterator.hasNext()) {
            final e e = (e)iterator.next();
            if (map.containsKey(e)) {
                continue;
            }
            if (e instanceof p && !p0.h8(e)) {
                final p p3 = (p)e;
                if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                    map.put(e, p3.S6().g().l0());
                    continue;
                }
            }
            final String a = e.a();
            long l;
            if (a != null) {
                l = Table.nativeFindFirstString(nativePtr, n, a);
            }
            else {
                l = -1L;
            }
            if (l == -1L) {
                l = OsObject.createRowWithPrimaryKey(x2, n, a);
            }
            else {
                Table.v0(a);
            }
            map.put(e, l);
            Table.nativeSetLong(nativePtr, b.e, l, e.l(), false);
            Table.nativeSetLong(nativePtr, b.f, l, e.o(), false);
            Table.nativeSetLong(nativePtr, b.g, l, e.H(), false);
            Table.nativeSetLong(nativePtr, b.h, l, e.b0(), false);
            final l0<c> j0 = e.J0();
            if (j0 != null) {
                final OsList list = new OsList(x2.R(l), b.i);
                for (final c c : j0) {
                    Long value;
                    if ((value = map.get(c)) == null) {
                        value = z5.H9(f0, c, map);
                    }
                    list.l(value);
                }
            }
            final l0<c> d5 = e.d5();
            if (d5 != null) {
                final OsList list2 = new OsList(x2.R(l), b.j);
                for (final c c2 : d5) {
                    Long value2;
                    if ((value2 = map.get(c2)) == null) {
                        value2 = z5.H9(f0, c2, map);
                    }
                    list2.l(value2);
                }
            }
            Table.nativeSetLong(nativePtr, b.k, l, e.j7(), false);
            Table.nativeSetBoolean(nativePtr, b.l, l, e.T2(), false);
            Table.nativeSetLong(nativePtr, b.m, l, e.f7(), false);
        }
    }
    
    public static long X8(final f0 f0, final e e, final Map<n0, Long> map) {
        if (e instanceof p && !p0.h8(e)) {
            final p p3 = (p)e;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(e.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(e.class);
        final long n = b.n;
        final String a = e.a();
        long nativeFindFirstString;
        if (a != null) {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, n, a);
        }
        else {
            nativeFindFirstString = -1L;
        }
        long rowWithPrimaryKey = nativeFindFirstString;
        if (nativeFindFirstString == -1L) {
            rowWithPrimaryKey = OsObject.createRowWithPrimaryKey(x2, n, a);
        }
        map.put(e, rowWithPrimaryKey);
        Table.nativeSetLong(nativePtr, b.e, rowWithPrimaryKey, e.l(), false);
        Table.nativeSetLong(nativePtr, b.f, rowWithPrimaryKey, e.o(), false);
        Table.nativeSetLong(nativePtr, b.g, rowWithPrimaryKey, e.H(), false);
        Table.nativeSetLong(nativePtr, b.h, rowWithPrimaryKey, e.b0(), false);
        long n2 = rowWithPrimaryKey;
        final OsList list = new OsList(x2.R(n2), b.i);
        final l0<c> j0 = e.J0();
        if (j0 != null && j0.size() == list.b0()) {
            for (int size = j0.size(), i = 0; i < size; ++i) {
                final c c = j0.get(i);
                Long value;
                if ((value = map.get(c)) == null) {
                    value = z5.J9(f0, c, map);
                }
                list.Z(i, value);
            }
        }
        else {
            final long n3 = n2;
            list.M();
            n2 = n3;
            if (j0 != null) {
                final Iterator<c> iterator = j0.iterator();
                while (true) {
                    n2 = n3;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    final c c2 = iterator.next();
                    Long value2;
                    if ((value2 = map.get(c2)) == null) {
                        value2 = z5.J9(f0, c2, map);
                    }
                    list.l(value2);
                }
            }
        }
        final OsList list2 = new OsList(x2.R(n2), b.j);
        final l0<c> d5 = e.d5();
        long n4;
        if (d5 != null && d5.size() == list2.b0()) {
            for (int size2 = d5.size(), k = 0; k < size2; ++k) {
                final c c3 = d5.get(k);
                Long value3;
                if ((value3 = map.get(c3)) == null) {
                    value3 = z5.J9(f0, c3, map);
                }
                list2.Z(k, value3);
            }
            n4 = n2;
        }
        else {
            list2.M();
            n4 = n2;
            if (d5 != null) {
                final Iterator<c> iterator2 = d5.iterator();
                while (true) {
                    n4 = n2;
                    if (!iterator2.hasNext()) {
                        break;
                    }
                    final c c4 = iterator2.next();
                    Long value4;
                    if ((value4 = map.get(c4)) == null) {
                        value4 = z5.J9(f0, c4, map);
                    }
                    list2.l(value4);
                }
            }
        }
        Table.nativeSetLong(nativePtr, b.k, n4, e.j7(), false);
        Table.nativeSetBoolean(nativePtr, b.l, n4, e.T2(), false);
        Table.nativeSetLong(nativePtr, b.m, n4, e.f7(), false);
        return n4;
    }
    
    public static void Y8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(e.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(e.class);
        final long n = b.n;
        while (iterator.hasNext()) {
            final e e = (e)iterator.next();
            if (map.containsKey(e)) {
                continue;
            }
            if (e instanceof p && !p0.h8(e)) {
                final p p3 = (p)e;
                if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                    map.put(e, p3.S6().g().l0());
                    continue;
                }
            }
            final String a = e.a();
            long l;
            if (a != null) {
                l = Table.nativeFindFirstString(nativePtr, n, a);
            }
            else {
                l = -1L;
            }
            if (l == -1L) {
                l = OsObject.createRowWithPrimaryKey(x2, n, a);
            }
            map.put(e, l);
            Table.nativeSetLong(nativePtr, b.e, l, e.l(), false);
            Table.nativeSetLong(nativePtr, b.f, l, e.o(), false);
            Table.nativeSetLong(nativePtr, b.g, l, e.H(), false);
            Table.nativeSetLong(nativePtr, b.h, l, e.b0(), false);
            final OsList list = new OsList(x2.R(l), b.i);
            final l0<c> j0 = e.J0();
            if (j0 != null && j0.size() == list.b0()) {
                for (int size = j0.size(), i = 0; i < size; ++i) {
                    final c c = j0.get(i);
                    Long value;
                    if ((value = map.get(c)) == null) {
                        value = z5.J9(f0, c, map);
                    }
                    list.Z(i, value);
                }
            }
            else {
                final long n2 = l;
                list.M();
                l = n2;
                if (j0 != null) {
                    final Iterator<c> iterator2 = j0.iterator();
                    while (true) {
                        l = n2;
                        if (!iterator2.hasNext()) {
                            break;
                        }
                        final c c2 = iterator2.next();
                        Long value2;
                        if ((value2 = map.get(c2)) == null) {
                            value2 = z5.J9(f0, c2, map);
                        }
                        list.l(value2);
                    }
                }
            }
            final OsList list2 = new OsList(x2.R(l), b.j);
            final l0<c> d5 = e.d5();
            long n3;
            if (d5 != null && d5.size() == list2.b0()) {
                for (int size2 = d5.size(), k = 0; k < size2; ++k) {
                    final c c3 = d5.get(k);
                    Long value3;
                    if ((value3 = map.get(c3)) == null) {
                        value3 = z5.J9(f0, c3, map);
                    }
                    list2.Z(k, value3);
                }
                n3 = l;
            }
            else {
                list2.M();
                n3 = l;
                if (d5 != null) {
                    final Iterator<c> iterator3 = d5.iterator();
                    while (true) {
                        n3 = l;
                        if (!iterator3.hasNext()) {
                            break;
                        }
                        final c c4 = iterator3.next();
                        Long value4;
                        if ((value4 = map.get(c4)) == null) {
                            value4 = z5.J9(f0, c4, map);
                        }
                        list2.l(value4);
                    }
                }
            }
            Table.nativeSetLong(nativePtr, b.k, n3, e.j7(), false);
            Table.nativeSetBoolean(nativePtr, b.l, n3, e.T2(), false);
            Table.nativeSetLong(nativePtr, b.m, n3, e.f7(), false);
        }
    }
    
    static d6 Z8(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(e.class), false, Collections.emptyList());
        final d6 d6 = new d6();
        h.a();
        return d6;
    }
    
    static e a9(final f0 f0, final b b, final e e, final e e2, final Map<n0, p> map, final Set<q> set) {
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(e.class), set);
        osObjectBuilder.K(b.e, e2.l());
        osObjectBuilder.L(b.f, e2.o());
        osObjectBuilder.L(b.g, e2.H());
        osObjectBuilder.L(b.h, e2.b0());
        final l0<c> j0 = e2.J0();
        final int n = 0;
        if (j0 != null) {
            final l0<n0> l0 = new l0<n0>();
            for (int i = 0; i < j0.size(); ++i) {
                final c c = j0.get(i);
                c z9 = (c)map.get(c);
                if (z9 == null) {
                    z9 = z5.z9(f0, (z5.b)f0.H().j(c.class), c, true, map, set);
                }
                l0.add(z9);
            }
            osObjectBuilder.Z(b.i, l0);
        }
        else {
            osObjectBuilder.Z(b.i, new l0<n0>());
        }
        final l0<c> d5 = e2.d5();
        if (d5 != null) {
            final l0<n0> l2 = new l0<n0>();
            for (int k = n; k < d5.size(); ++k) {
                final c c2 = d5.get(k);
                c z10 = (c)map.get(c2);
                if (z10 == null) {
                    z10 = z5.z9(f0, (z5.b)f0.H().j(c.class), c2, true, map, set);
                }
                l2.add(z10);
            }
            osObjectBuilder.Z(b.j, l2);
        }
        else {
            osObjectBuilder.Z(b.j, new l0<n0>());
        }
        osObjectBuilder.L(b.k, e2.j7());
        osObjectBuilder.n(b.l, e2.T2());
        osObjectBuilder.L(b.m, e2.f7());
        osObjectBuilder.d0(b.n, e2.a());
        osObjectBuilder.i0();
        return e;
    }
    
    @Override
    public void A2(final long n) {
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
    public void D1(final String s) {
        if (this.U.i()) {
            return;
        }
        this.U.f().h();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }
    
    @Override
    public long H() {
        this.U.f().h();
        return this.U.g().m(this.T.g);
    }
    
    @Override
    public l0<c> J0() {
        this.U.f().h();
        final l0<c> v = this.V;
        if (v != null) {
            return v;
        }
        return this.V = new l0<c>(c.class, this.U.g().p(this.T.i), this.U.f());
    }
    
    @Override
    public void M5(final l0<c> l0) {
        final boolean i = this.U.i();
        final int n = 0;
        int j = 0;
        l0<c> l2 = l0;
        if (i) {
            if (!this.U.d()) {
                return;
            }
            if (this.U.e().contains("periodsWithOutCancelled")) {
                return;
            }
            if ((l2 = l0) != null) {
                l2 = l0;
                if (!l0.G0()) {
                    final f0 f0 = (f0)this.U.f();
                    l2 = new l0<c>();
                    for (final c c : l0) {
                        c c2;
                        if ((c2 = c) != null) {
                            if (p0.j8(c)) {
                                c2 = c;
                            }
                            else {
                                c2 = f0.y0(c, new q[0]);
                            }
                        }
                        l2.add(c2);
                    }
                }
            }
        }
        this.U.f().h();
        final OsList p = this.U.g().p(this.T.j);
        if (l2 != null && l2.size() == p.b0()) {
            while (j < l2.size()) {
                final c c3 = l2.get(j);
                this.U.c(c3);
                p.Z(j, ((p)c3).S6().g().l0());
                ++j;
            }
        }
        else {
            p.M();
            if (l2 == null) {
                return;
            }
            for (int size = l2.size(), k = n; k < size; ++k) {
                final c c4 = l2.get(k);
                this.U.c(c4);
                p.l(((p)c4).S6().g().l0());
            }
        }
    }
    
    @Override
    public c0<?> S6() {
        return this.U;
    }
    
    @Override
    public boolean T2() {
        this.U.f().h();
        return this.U.g().l(this.T.l);
    }
    
    @Override
    public void W(final long n) {
        if (!this.U.i()) {
            this.U.f().h();
            this.U.g().s(this.T.g, n);
            return;
        }
        if (!this.U.d()) {
            return;
        }
        final r g = this.U.g();
        g.g().q0(this.T.g, g.l0(), n, true);
    }
    
    @Override
    public void W3(final long n) {
        if (!this.U.i()) {
            this.U.f().h();
            this.U.g().s(this.T.m, n);
            return;
        }
        if (!this.U.d()) {
            return;
        }
        final r g = this.U.g();
        g.g().q0(this.T.m, g.l0(), n, true);
    }
    
    @Override
    public String a() {
        this.U.f().h();
        return this.U.g().U(this.T.n);
    }
    
    @Override
    public long b0() {
        this.U.f().h();
        return this.U.g().m(this.T.h);
    }
    
    @Override
    public void c1(final l0<c> l0) {
        final boolean i = this.U.i();
        final int n = 0;
        int j = 0;
        l0<c> l2 = l0;
        if (i) {
            if (!this.U.d()) {
                return;
            }
            if (this.U.e().contains("periods")) {
                return;
            }
            if ((l2 = l0) != null) {
                l2 = l0;
                if (!l0.G0()) {
                    final f0 f0 = (f0)this.U.f();
                    l2 = new l0<c>();
                    for (final c c : l0) {
                        c c2;
                        if ((c2 = c) != null) {
                            if (p0.j8(c)) {
                                c2 = c;
                            }
                            else {
                                c2 = f0.y0(c, new q[0]);
                            }
                        }
                        l2.add(c2);
                    }
                }
            }
        }
        this.U.f().h();
        final OsList p = this.U.g().p(this.T.i);
        if (l2 != null && l2.size() == p.b0()) {
            while (j < l2.size()) {
                final c c3 = l2.get(j);
                this.U.c(c3);
                p.Z(j, ((p)c3).S6().g().l0());
                ++j;
            }
        }
        else {
            p.M();
            if (l2 == null) {
                return;
            }
            for (int size = l2.size(), k = n; k < size; ++k) {
                final c c4 = l2.get(k);
                this.U.c(c4);
                p.l(((p)c4).S6().g().l0());
            }
        }
    }
    
    @Override
    public void d4(final boolean b) {
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
    public l0<c> d5() {
        this.U.f().h();
        final l0<c> w = this.W;
        if (w != null) {
            return w;
        }
        return this.W = new l0<c>(c.class, this.U.g().p(this.T.j), this.U.f());
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final d6 d6 = (d6)o;
        final io.realm.a f = this.U.f();
        final io.realm.a f2 = d6.U.f();
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
        final String i = d6.U.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.U.g().l0() == d6.U.g().l0();
            }
        }
        else if (i == null) {
            return this.U.g().l0() == d6.U.g().l0();
        }
        return false;
    }
    
    @Override
    public long f7() {
        this.U.f().h();
        return this.U.g().m(this.T.m);
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
    public long j7() {
        this.U.f().h();
        return this.U.g().m(this.T.k);
    }
    
    @Override
    public void k(final int n) {
        if (!this.U.i()) {
            this.U.f().h();
            this.U.g().s(this.T.e, n);
            return;
        }
        if (!this.U.d()) {
            return;
        }
        final r g = this.U.g();
        g.g().q0(this.T.e, g.l0(), n, true);
    }
    
    @Override
    public int l() {
        this.U.f().h();
        return (int)this.U.g().m(this.T.e);
    }
    
    @Override
    public long o() {
        this.U.f().h();
        return this.U.g().m(this.T.f);
    }
    
    @Override
    public void p(final long n) {
        if (!this.U.i()) {
            this.U.f().h();
            this.U.g().s(this.T.f, n);
            return;
        }
        if (!this.U.d()) {
            return;
        }
        final r g = this.U.g();
        g.g().q0(this.T.f, g.l0(), n, true);
    }
    
    @Override
    public void s0(final long n) {
        if (!this.U.i()) {
            this.U.f().h();
            this.U.g().s(this.T.h, n);
            return;
        }
        if (!this.U.d()) {
            return;
        }
        final r g = this.U.g();
        g.g().q0(this.T.h, g.l0(), n, true);
    }
    
    @Override
    public String toString() {
        if (!p0.k8(this)) {
            return "Invalid object";
        }
        final StringBuilder sb = new StringBuilder("RealmTimeTableModel = proxy[");
        sb.append("{entityType:");
        sb.append(this.l());
        sb.append("}");
        sb.append(",");
        sb.append("{entityId:");
        sb.append(this.o());
        sb.append("}");
        sb.append(",");
        sb.append("{date:");
        sb.append(this.H());
        sb.append("}");
        sb.append(",");
        sb.append("{timestamp:");
        sb.append(this.b0());
        sb.append("}");
        sb.append(",");
        sb.append("{periods:");
        sb.append("RealmList<RealmPeriodModel>[");
        sb.append(this.J0().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{periodsWithOutCancelled:");
        sb.append("RealmList<RealmPeriodModel>[");
        sb.append(this.d5().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{holiday:");
        sb.append(this.j7());
        sb.append("}");
        sb.append(",");
        sb.append("{preLoadedPeriodData:");
        sb.append(this.T2());
        sb.append("}");
        sb.append(",");
        sb.append("{lastRequestTimestamp:");
        sb.append(this.f7());
        sb.append("}");
        sb.append(",");
        sb.append("{id:");
        sb.append(this.a());
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
    
    @Override
    public void y4() {
        if (this.U != null) {
            return;
        }
        final io.realm.a.h h = io.realm.a.W.get();
        this.T = (b)h.c();
        (this.U = new c0<e>(this)).r(h.e());
        this.U.s(h.f());
        this.U.o(h.b());
        this.U.q(h.d());
    }
    
    public static final class a
    {
        public static final String a = "RealmTimeTableModel";
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
            final OsObjectSchemaInfo b = osSchemaInfo.b("RealmTimeTableModel");
            this.e = this.b("entityType", "entityType", b);
            this.f = this.b("entityId", "entityId", b);
            this.g = this.b("date", "date", b);
            this.h = this.b("timestamp", "timestamp", b);
            this.i = this.b("periods", "periods", b);
            this.j = this.b("periodsWithOutCancelled", "periodsWithOutCancelled", b);
            this.k = this.b("holiday", "holiday", b);
            this.l = this.b("preLoadedPeriodData", "preLoadedPeriodData", b);
            this.m = this.b("lastRequestTimestamp", "lastRequestTimestamp", b);
            this.n = this.b("id", "id", b);
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
