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
import com.untis.mobile.persistence.realm.b;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.p;
import i4.d;

public class l1 extends d implements p, m1
{
    private static final String S = "";
    private static final OsObjectSchemaInfo T;
    private b N;
    private c0<d> O;
    private l0<com.untis.mobile.persistence.realm.b> P;
    private l0<com.untis.mobile.persistence.realm.b> Q;
    private l0<com.untis.mobile.persistence.realm.b> R;
    
    static {
        T = E8();
    }
    
    l1() {
        this.O.p();
    }
    
    public static d A8(final f0 f0, final b b, final d d, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        final l1 l1 = map.get(d);
        if (l1 != null) {
            return l1;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(d.class), set);
        osObjectBuilder.L(b.e, d.F1());
        final l1 n8 = N8(f0, osObjectBuilder.f0());
        map.put(d, n8);
        final l0<com.untis.mobile.persistence.realm.b> p6 = d.p0();
        final int n9 = 0;
        if (p6 != null) {
            final l0<com.untis.mobile.persistence.realm.b> p7 = n8.p0();
            p7.clear();
            for (int i = 0; i < p6.size(); ++i) {
                final com.untis.mobile.persistence.realm.b b3 = p6.get(i);
                com.untis.mobile.persistence.realm.b v8 = (com.untis.mobile.persistence.realm.b)map.get(b3);
                if (v8 == null) {
                    v8 = z0.v8(f0, (z0.b)f0.H().j(com.untis.mobile.persistence.realm.b.class), b3, b2, map, set);
                }
                p7.add(v8);
            }
        }
        final l0<com.untis.mobile.persistence.realm.b> x = d.X();
        if (x != null) {
            final l0<com.untis.mobile.persistence.realm.b> x2 = n8.X();
            x2.clear();
            for (int j = 0; j < x.size(); ++j) {
                final com.untis.mobile.persistence.realm.b b4 = x.get(j);
                com.untis.mobile.persistence.realm.b v9 = (com.untis.mobile.persistence.realm.b)map.get(b4);
                if (v9 == null) {
                    v9 = z0.v8(f0, (z0.b)f0.H().j(com.untis.mobile.persistence.realm.b.class), b4, b2, map, set);
                }
                x2.add(v9);
            }
        }
        final l0<com.untis.mobile.persistence.realm.b> v10 = d.V();
        if (v10 != null) {
            final l0<com.untis.mobile.persistence.realm.b> v11 = n8.V();
            v11.clear();
            for (int k = n9; k < v10.size(); ++k) {
                final com.untis.mobile.persistence.realm.b b5 = v10.get(k);
                com.untis.mobile.persistence.realm.b v12 = (com.untis.mobile.persistence.realm.b)map.get(b5);
                if (v12 == null) {
                    v12 = z0.v8(f0, (z0.b)f0.H().j(com.untis.mobile.persistence.realm.b.class), b5, b2, map, set);
                }
                v11.add(v12);
            }
        }
        return n8;
    }
    
    public static d B8(final f0 f0, final b b, final d d, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        if (d instanceof p && !p0.h8(d)) {
            final p p6 = (p)d;
            if (p6.S6().f() != null) {
                final io.realm.a f2 = p6.S6().f();
                if (f2.H != f0.H) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
                if (f2.getPath().equals(f0.getPath())) {
                    return d;
                }
            }
        }
        final io.realm.a.h h = io.realm.a.W.get();
        final p p7 = map.get(d);
        if (p7 != null) {
            return (d)p7;
        }
        final p p8 = null;
        Object x2 = null;
        boolean b3 = false;
        Label_0232: {
            if (b2) {
                x2 = f0.x2(d.class);
                final long r = ((Table)x2).r(b.e, d.F1());
                if (r == -1L) {
                    b3 = false;
                    x2 = p8;
                    break Label_0232;
                }
                try {
                    h.g(f0, ((Table)x2).R(r), b, false, Collections.emptyList());
                    x2 = new l1();
                    map.put(d, (p)x2);
                }
                finally {
                    h.a();
                }
            }
            b3 = b2;
        }
        d d2;
        if (b3) {
            d2 = O8(f0, b, (d)x2, d, map, set);
        }
        else {
            d2 = A8(f0, b, d, b2, map, set);
        }
        return d2;
    }
    
    public static b C8(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static d D8(final d d, final int a, final int n, final Map<n0, p.a<n0>> map) {
        if (a <= n && d != null) {
            final p.a a2 = map.get(d);
            d d2;
            if (a2 == null) {
                d2 = new d();
                map.put(d, (p.a<n0>)new p.a(a, d2));
            }
            else {
                if (a >= a2.a) {
                    return (d)a2.b;
                }
                d2 = (d)a2.b;
                a2.a = a;
            }
            d2.M0(d.F1());
            final int n2 = 0;
            if (a == n) {
                d2.C0(null);
            }
            else {
                final l0<com.untis.mobile.persistence.realm.b> p4 = d.p0();
                final l0<com.untis.mobile.persistence.realm.b> l0 = new l0<com.untis.mobile.persistence.realm.b>();
                d2.C0(l0);
                for (int size = p4.size(), i = 0; i < size; ++i) {
                    l0.add(z0.x8(p4.get(i), a + 1, n, map));
                }
            }
            if (a == n) {
                d2.o0(null);
            }
            else {
                final l0<com.untis.mobile.persistence.realm.b> x = d.X();
                final l0<com.untis.mobile.persistence.realm.b> l2 = new l0<com.untis.mobile.persistence.realm.b>();
                d2.o0(l2);
                for (int size2 = x.size(), j = 0; j < size2; ++j) {
                    l2.add(z0.x8(x.get(j), a + 1, n, map));
                }
            }
            if (a == n) {
                d2.x0(null);
            }
            else {
                final l0<com.untis.mobile.persistence.realm.b> v = d.V();
                final l0<com.untis.mobile.persistence.realm.b> l3 = new l0<com.untis.mobile.persistence.realm.b>();
                d2.x0(l3);
                for (int size3 = v.size(), k = n2; k < size3; ++k) {
                    l3.add(z0.x8(v.get(k), a + 1, n, map));
                }
            }
            return d2;
        }
        return null;
    }
    
    private static OsObjectSchemaInfo E8() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmTeacherClassRegData", false, 4, 0);
        b.c("", "klasseId", RealmFieldType.INTEGER, true, false, true);
        final RealmFieldType list = RealmFieldType.LIST;
        b.b("", "students", list, "RealmLong");
        b.b("", "events", list, "RealmLong");
        b.b("", "absences", list, "RealmLong");
        return b.e();
    }
    
    public static d F8(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final ArrayList<String> list = new ArrayList<String>(3);
        Object x2 = null;
        Label_0146: {
            if (b) {
                x2 = f0.x2(d.class);
                final long e = ((b)f0.H().j(d.class)).e;
                long r;
                if (!jsonObject.isNull("klasseId")) {
                    r = ((Table)x2).r(e, jsonObject.getLong("klasseId"));
                }
                else {
                    r = -1L;
                }
                if (r != -1L) {
                    final io.realm.a.h h = io.realm.a.W.get();
                    try {
                        h.g(f0, ((Table)x2).R(r), f0.H().j(d.class), false, Collections.emptyList());
                        x2 = new l1();
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
            if (jsonObject.has("students")) {
                list.add("students");
            }
            if (jsonObject.has("events")) {
                list.add("events");
            }
            if (jsonObject.has("absences")) {
                list.add("absences");
            }
            if (!jsonObject.has("klasseId")) {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'klasseId'.");
            }
            l1 l1;
            if (jsonObject.isNull("klasseId")) {
                l1 = f0.p1((Class<l1>)d.class, null, true, list);
            }
            else {
                l1 = f0.p1((Class<l1>)d.class, jsonObject.getLong("klasseId"), true, list);
            }
            o = l1;
        }
        final boolean has = jsonObject.has("students");
        final int n = 0;
        if (has) {
            if (jsonObject.isNull("students")) {
                ((m1)o).C0(null);
            }
            else {
                ((m1)o).p0().clear();
                final JSONArray jsonArray = jsonObject.getJSONArray("students");
                for (int i = 0; i < jsonArray.length(); ++i) {
                    ((m1)o).p0().add(z0.z8(f0, jsonArray.getJSONObject(i), b));
                }
            }
        }
        if (jsonObject.has("events")) {
            if (jsonObject.isNull("events")) {
                ((m1)o).o0(null);
            }
            else {
                ((m1)o).X().clear();
                final JSONArray jsonArray2 = jsonObject.getJSONArray("events");
                for (int j = 0; j < jsonArray2.length(); ++j) {
                    ((m1)o).X().add(z0.z8(f0, jsonArray2.getJSONObject(j), b));
                }
            }
        }
        if (jsonObject.has("absences")) {
            if (jsonObject.isNull("absences")) {
                ((m1)o).x0(null);
            }
            else {
                ((m1)o).V().clear();
                final JSONArray jsonArray3 = jsonObject.getJSONArray("absences");
                for (int k = n; k < jsonArray3.length(); ++k) {
                    ((m1)o).V().add(z0.z8(f0, jsonArray3.getJSONObject(k), b));
                }
            }
        }
        return (d)o;
    }
    
    @TargetApi(11)
    public static d G8(final f0 f0, final JsonReader jsonReader) throws IOException {
        final d d = new d();
        jsonReader.beginObject();
        boolean b = false;
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            if (nextName.equals("klasseId")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'klasseId' to null.");
                }
                d.M0(jsonReader.nextLong());
                b = true;
            }
            else {
                if (nextName.equals("students")) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.skipValue();
                        d.C0(null);
                        continue;
                    }
                    d.C0(new l0<com.untis.mobile.persistence.realm.b>());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        d.p0().add(z0.A8(f0, jsonReader));
                    }
                }
                else if (nextName.equals("events")) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.skipValue();
                        d.o0(null);
                        continue;
                    }
                    d.o0(new l0<com.untis.mobile.persistence.realm.b>());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        d.X().add(z0.A8(f0, jsonReader));
                    }
                }
                else {
                    if (!nextName.equals("absences")) {
                        jsonReader.skipValue();
                        continue;
                    }
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.skipValue();
                        d.x0(null);
                        continue;
                    }
                    d.x0(new l0<com.untis.mobile.persistence.realm.b>());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        d.V().add(z0.A8(f0, jsonReader));
                    }
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
        if (b) {
            return f0.G0(d, new q[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'klasseId'.");
    }
    
    public static OsObjectSchemaInfo H8() {
        return l1.T;
    }
    
    public static String I8() {
        return "RealmTeacherClassRegData";
    }
    
    public static long J8(final f0 f0, final d d, final Map<n0, Long> map) {
        if (d instanceof p && !p0.h8(d)) {
            final p p3 = (p)d;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(d.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(d.class);
        final long e = b.e;
        final Long value = d.F1();
        long l;
        if (value != null) {
            l = Table.nativeFindFirstInt(nativePtr, e, d.F1());
        }
        else {
            l = -1L;
        }
        if (l == -1L) {
            l = OsObject.createRowWithPrimaryKey(x2, e, d.F1());
        }
        else {
            Table.v0(value);
        }
        map.put(d, l);
        final l0<com.untis.mobile.persistence.realm.b> p4 = d.p0();
        if (p4 != null) {
            final OsList list = new OsList(x2.R(l), b.f);
            for (final com.untis.mobile.persistence.realm.b b2 : p4) {
                Long value2;
                if ((value2 = map.get(b2)) == null) {
                    value2 = z0.D8(f0, b2, map);
                }
                list.l(value2);
            }
        }
        final l0<com.untis.mobile.persistence.realm.b> x3 = d.X();
        if (x3 != null) {
            final OsList list2 = new OsList(x2.R(l), b.g);
            for (final com.untis.mobile.persistence.realm.b b3 : x3) {
                Long value3;
                if ((value3 = map.get(b3)) == null) {
                    value3 = z0.D8(f0, b3, map);
                }
                list2.l(value3);
            }
        }
        final l0<com.untis.mobile.persistence.realm.b> v = d.V();
        if (v != null) {
            final OsList list3 = new OsList(x2.R(l), b.h);
            for (final com.untis.mobile.persistence.realm.b b4 : v) {
                Long value4;
                if ((value4 = map.get(b4)) == null) {
                    value4 = z0.D8(f0, b4, map);
                }
                list3.l(value4);
            }
        }
        return l;
    }
    
    public static void K8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(d.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(d.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final d d = (d)iterator.next();
            if (map.containsKey(d)) {
                continue;
            }
            if (d instanceof p && !p0.h8(d)) {
                final p p3 = (p)d;
                if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                    map.put(d, p3.S6().g().l0());
                    continue;
                }
            }
            final Long value = d.F1();
            long l;
            if (value != null) {
                l = Table.nativeFindFirstInt(nativePtr, e, d.F1());
            }
            else {
                l = -1L;
            }
            if (l == -1L) {
                l = OsObject.createRowWithPrimaryKey(x2, e, d.F1());
            }
            else {
                Table.v0(value);
            }
            map.put(d, l);
            final l0<com.untis.mobile.persistence.realm.b> p4 = d.p0();
            if (p4 != null) {
                final OsList list = new OsList(x2.R(l), b.f);
                for (final com.untis.mobile.persistence.realm.b b2 : p4) {
                    Long value2;
                    if ((value2 = map.get(b2)) == null) {
                        value2 = z0.D8(f0, b2, map);
                    }
                    list.l(value2);
                }
            }
            final l0<com.untis.mobile.persistence.realm.b> x3 = d.X();
            if (x3 != null) {
                final OsList list2 = new OsList(x2.R(l), b.g);
                for (final com.untis.mobile.persistence.realm.b b3 : x3) {
                    Long value3;
                    if ((value3 = map.get(b3)) == null) {
                        value3 = z0.D8(f0, b3, map);
                    }
                    list2.l(value3);
                }
            }
            final l0<com.untis.mobile.persistence.realm.b> v = d.V();
            if (v == null) {
                continue;
            }
            final OsList list3 = new OsList(x2.R(l), b.h);
            for (final com.untis.mobile.persistence.realm.b b4 : v) {
                Long value4;
                if ((value4 = map.get(b4)) == null) {
                    value4 = z0.D8(f0, b4, map);
                }
                list3.l(value4);
            }
        }
    }
    
    public static long L8(final f0 f0, final d d, final Map<n0, Long> map) {
        if (d instanceof p && !p0.h8(d)) {
            final p p3 = (p)d;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(d.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(d.class);
        final long e = b.e;
        long nativeFindFirstInt;
        if (Long.valueOf(d.F1()) != null) {
            nativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, e, d.F1());
        }
        else {
            nativeFindFirstInt = -1L;
        }
        long rowWithPrimaryKey = nativeFindFirstInt;
        if (nativeFindFirstInt == -1L) {
            rowWithPrimaryKey = OsObject.createRowWithPrimaryKey(x2, e, d.F1());
        }
        map.put(d, rowWithPrimaryKey);
        final OsList list = new OsList(x2.R(rowWithPrimaryKey), b.f);
        final l0<com.untis.mobile.persistence.realm.b> p4 = d.p0();
        final int n = 0;
        if (p4 != null && p4.size() == list.b0()) {
            for (int size = p4.size(), i = 0; i < size; ++i) {
                final com.untis.mobile.persistence.realm.b b2 = p4.get(i);
                Long value;
                if ((value = map.get(b2)) == null) {
                    value = z0.F8(f0, b2, map);
                }
                list.Z(i, value);
            }
        }
        else {
            list.M();
            if (p4 != null) {
                for (final com.untis.mobile.persistence.realm.b b3 : p4) {
                    Long value2;
                    if ((value2 = map.get(b3)) == null) {
                        value2 = z0.F8(f0, b3, map);
                    }
                    list.l(value2);
                }
            }
        }
        final OsList list2 = new OsList(x2.R(rowWithPrimaryKey), b.g);
        final l0<com.untis.mobile.persistence.realm.b> x3 = d.X();
        if (x3 != null && x3.size() == list2.b0()) {
            for (int size2 = x3.size(), j = 0; j < size2; ++j) {
                final com.untis.mobile.persistence.realm.b b4 = x3.get(j);
                Long value3;
                if ((value3 = map.get(b4)) == null) {
                    value3 = z0.F8(f0, b4, map);
                }
                list2.Z(j, value3);
            }
        }
        else {
            list2.M();
            if (x3 != null) {
                for (final com.untis.mobile.persistence.realm.b b5 : x3) {
                    Long value4;
                    if ((value4 = map.get(b5)) == null) {
                        value4 = z0.F8(f0, b5, map);
                    }
                    list2.l(value4);
                }
            }
        }
        final OsList list3 = new OsList(x2.R(rowWithPrimaryKey), b.h);
        final l0<com.untis.mobile.persistence.realm.b> v = d.V();
        if (v != null && v.size() == list3.b0()) {
            for (int size3 = v.size(), k = n; k < size3; ++k) {
                final com.untis.mobile.persistence.realm.b b6 = v.get(k);
                Long value5;
                if ((value5 = map.get(b6)) == null) {
                    value5 = z0.F8(f0, b6, map);
                }
                list3.Z(k, value5);
            }
        }
        else {
            list3.M();
            if (v != null) {
                for (final com.untis.mobile.persistence.realm.b b7 : v) {
                    Long value6;
                    if ((value6 = map.get(b7)) == null) {
                        value6 = z0.F8(f0, b7, map);
                    }
                    list3.l(value6);
                }
            }
        }
        return rowWithPrimaryKey;
    }
    
    public static void M8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(d.class);
        long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(d.class);
        long e = b.e;
        while (iterator.hasNext()) {
            final d d = (d)iterator.next();
            if (map.containsKey(d)) {
                continue;
            }
            if (d instanceof p && !p0.h8(d)) {
                final p p3 = (p)d;
                if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                    map.put(d, p3.S6().g().l0());
                    continue;
                }
            }
            long nativeFindFirstInt;
            if (Long.valueOf(d.F1()) != null) {
                nativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, e, d.F1());
            }
            else {
                nativeFindFirstInt = -1L;
            }
            long rowWithPrimaryKey = nativeFindFirstInt;
            if (nativeFindFirstInt == -1L) {
                rowWithPrimaryKey = OsObject.createRowWithPrimaryKey(x2, e, d.F1());
            }
            map.put(d, rowWithPrimaryKey);
            final OsList list = new OsList(x2.R(rowWithPrimaryKey), b.f);
            final l0<com.untis.mobile.persistence.realm.b> p4 = d.p0();
            if (p4 != null && p4.size() == list.b0()) {
                for (int size = p4.size(), i = 0; i < size; ++i) {
                    final com.untis.mobile.persistence.realm.b b2 = p4.get(i);
                    Long value;
                    if ((value = map.get(b2)) == null) {
                        value = z0.F8(f0, b2, map);
                    }
                    list.Z(i, value);
                }
            }
            else {
                final long n = nativePtr;
                final long n2 = e;
                list.M();
                nativePtr = n;
                e = n2;
                if (p4 != null) {
                    final Iterator<com.untis.mobile.persistence.realm.b> iterator2 = p4.iterator();
                    while (true) {
                        nativePtr = n;
                        e = n2;
                        if (!iterator2.hasNext()) {
                            break;
                        }
                        final com.untis.mobile.persistence.realm.b b3 = iterator2.next();
                        Long value2;
                        if ((value2 = map.get(b3)) == null) {
                            value2 = z0.F8(f0, b3, map);
                        }
                        list.l(value2);
                    }
                }
            }
            final OsList list2 = new OsList(x2.R(rowWithPrimaryKey), b.g);
            final l0<com.untis.mobile.persistence.realm.b> x3 = d.X();
            if (x3 != null && x3.size() == list2.b0()) {
                for (int size2 = x3.size(), j = 0; j < size2; ++j) {
                    final com.untis.mobile.persistence.realm.b b4 = x3.get(j);
                    Long value3;
                    if ((value3 = map.get(b4)) == null) {
                        value3 = z0.F8(f0, b4, map);
                    }
                    list2.Z(j, value3);
                }
            }
            else {
                list2.M();
                if (x3 != null) {
                    for (final com.untis.mobile.persistence.realm.b b5 : x3) {
                        Long value4;
                        if ((value4 = map.get(b5)) == null) {
                            value4 = z0.F8(f0, b5, map);
                        }
                        list2.l(value4);
                    }
                }
            }
            final OsList list3 = new OsList(x2.R(rowWithPrimaryKey), b.h);
            final l0<com.untis.mobile.persistence.realm.b> v = d.V();
            if (v != null && v.size() == list3.b0()) {
                for (int size3 = v.size(), k = 0; k < size3; ++k) {
                    final com.untis.mobile.persistence.realm.b b6 = v.get(k);
                    Long value5;
                    if ((value5 = map.get(b6)) == null) {
                        value5 = z0.F8(f0, b6, map);
                    }
                    list3.Z(k, value5);
                }
            }
            else {
                list3.M();
                if (v == null) {
                    continue;
                }
                for (final com.untis.mobile.persistence.realm.b b7 : v) {
                    Long value6;
                    if ((value6 = map.get(b7)) == null) {
                        value6 = z0.F8(f0, b7, map);
                    }
                    list3.l(value6);
                }
            }
        }
    }
    
    static l1 N8(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(d.class), false, Collections.emptyList());
        final l1 l1 = new l1();
        h.a();
        return l1;
    }
    
    static d O8(final f0 f0, final b b, final d d, final d d2, final Map<n0, p> map, final Set<q> set) {
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(d.class), set);
        osObjectBuilder.L(b.e, d2.F1());
        final l0<com.untis.mobile.persistence.realm.b> p6 = d2.p0();
        final int n = 0;
        if (p6 != null) {
            final l0<n0> l0 = new l0<n0>();
            for (int i = 0; i < p6.size(); ++i) {
                final com.untis.mobile.persistence.realm.b b2 = p6.get(i);
                com.untis.mobile.persistence.realm.b v8 = (com.untis.mobile.persistence.realm.b)map.get(b2);
                if (v8 == null) {
                    v8 = z0.v8(f0, (z0.b)f0.H().j(com.untis.mobile.persistence.realm.b.class), b2, true, map, set);
                }
                l0.add(v8);
            }
            osObjectBuilder.Z(b.f, l0);
        }
        else {
            osObjectBuilder.Z(b.f, new l0<n0>());
        }
        final l0<com.untis.mobile.persistence.realm.b> x = d2.X();
        if (x != null) {
            final l0<n0> l2 = new l0<n0>();
            for (int j = 0; j < x.size(); ++j) {
                final com.untis.mobile.persistence.realm.b b3 = x.get(j);
                com.untis.mobile.persistence.realm.b v9 = (com.untis.mobile.persistence.realm.b)map.get(b3);
                if (v9 == null) {
                    v9 = z0.v8(f0, (z0.b)f0.H().j(com.untis.mobile.persistence.realm.b.class), b3, true, map, set);
                }
                l2.add(v9);
            }
            osObjectBuilder.Z(b.g, l2);
        }
        else {
            osObjectBuilder.Z(b.g, new l0<n0>());
        }
        final l0<com.untis.mobile.persistence.realm.b> v10 = d2.V();
        if (v10 != null) {
            final l0<n0> l3 = new l0<n0>();
            for (int k = n; k < v10.size(); ++k) {
                final com.untis.mobile.persistence.realm.b b4 = v10.get(k);
                com.untis.mobile.persistence.realm.b v11 = (com.untis.mobile.persistence.realm.b)map.get(b4);
                if (v11 == null) {
                    v11 = z0.v8(f0, (z0.b)f0.H().j(com.untis.mobile.persistence.realm.b.class), b4, true, map, set);
                }
                l3.add(v11);
            }
            osObjectBuilder.Z(b.h, l3);
        }
        else {
            osObjectBuilder.Z(b.h, new l0<n0>());
        }
        osObjectBuilder.i0();
        return d;
    }
    
    @Override
    public void C0(final l0<com.untis.mobile.persistence.realm.b> l0) {
        final boolean i = this.O.i();
        final int n = 0;
        int j = 0;
        l0<com.untis.mobile.persistence.realm.b> l2 = l0;
        if (i) {
            if (!this.O.d()) {
                return;
            }
            if (this.O.e().contains("students")) {
                return;
            }
            if ((l2 = l0) != null) {
                l2 = l0;
                if (!l0.G0()) {
                    final f0 f0 = (f0)this.O.f();
                    l2 = new l0<com.untis.mobile.persistence.realm.b>();
                    for (final com.untis.mobile.persistence.realm.b b : l0) {
                        com.untis.mobile.persistence.realm.b b2;
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
        this.O.f().h();
        final OsList p = this.O.g().p(this.N.f);
        if (l2 != null && l2.size() == p.b0()) {
            while (j < l2.size()) {
                final com.untis.mobile.persistence.realm.b b3 = l2.get(j);
                this.O.c(b3);
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
                final com.untis.mobile.persistence.realm.b b4 = l2.get(k);
                this.O.c(b4);
                p.l(((p)b4).S6().g().l0());
            }
        }
    }
    
    @Override
    public long F1() {
        this.O.f().h();
        return this.O.g().m(this.N.e);
    }
    
    @Override
    public void M0(final long n) {
        if (this.O.i()) {
            return;
        }
        this.O.f().h();
        throw new RealmException("Primary key field 'klasseId' cannot be changed after object was created.");
    }
    
    @Override
    public c0<?> S6() {
        return this.O;
    }
    
    @Override
    public l0<com.untis.mobile.persistence.realm.b> V() {
        this.O.f().h();
        final l0<com.untis.mobile.persistence.realm.b> r = this.R;
        if (r != null) {
            return r;
        }
        return this.R = new l0<com.untis.mobile.persistence.realm.b>(com.untis.mobile.persistence.realm.b.class, this.O.g().p(this.N.h), this.O.f());
    }
    
    @Override
    public l0<com.untis.mobile.persistence.realm.b> X() {
        this.O.f().h();
        final l0<com.untis.mobile.persistence.realm.b> q = this.Q;
        if (q != null) {
            return q;
        }
        return this.Q = new l0<com.untis.mobile.persistence.realm.b>(com.untis.mobile.persistence.realm.b.class, this.O.g().p(this.N.g), this.O.f());
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final l1 l1 = (l1)o;
        final io.realm.a f = this.O.f();
        final io.realm.a f2 = l1.O.f();
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
        final String m = this.O.g().g().M();
        final String i = l1.O.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.O.g().l0() == l1.O.g().l0();
            }
        }
        else if (i == null) {
            return this.O.g().l0() == l1.O.g().l0();
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final String path = this.O.f().getPath();
        final String m = this.O.g().g().M();
        final long l0 = this.O.g().l0();
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
    public void o0(final l0<com.untis.mobile.persistence.realm.b> l0) {
        final boolean i = this.O.i();
        final int n = 0;
        int j = 0;
        l0<com.untis.mobile.persistence.realm.b> l2 = l0;
        if (i) {
            if (!this.O.d()) {
                return;
            }
            if (this.O.e().contains("events")) {
                return;
            }
            if ((l2 = l0) != null) {
                l2 = l0;
                if (!l0.G0()) {
                    final f0 f0 = (f0)this.O.f();
                    l2 = new l0<com.untis.mobile.persistence.realm.b>();
                    for (final com.untis.mobile.persistence.realm.b b : l0) {
                        com.untis.mobile.persistence.realm.b b2;
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
        this.O.f().h();
        final OsList p = this.O.g().p(this.N.g);
        if (l2 != null && l2.size() == p.b0()) {
            while (j < l2.size()) {
                final com.untis.mobile.persistence.realm.b b3 = l2.get(j);
                this.O.c(b3);
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
                final com.untis.mobile.persistence.realm.b b4 = l2.get(k);
                this.O.c(b4);
                p.l(((p)b4).S6().g().l0());
            }
        }
    }
    
    @Override
    public l0<com.untis.mobile.persistence.realm.b> p0() {
        this.O.f().h();
        final l0<com.untis.mobile.persistence.realm.b> p = this.P;
        if (p != null) {
            return p;
        }
        return this.P = new l0<com.untis.mobile.persistence.realm.b>(com.untis.mobile.persistence.realm.b.class, this.O.g().p(this.N.f), this.O.f());
    }
    
    @Override
    public String toString() {
        if (!p0.k8(this)) {
            return "Invalid object";
        }
        final StringBuilder sb = new StringBuilder("RealmTeacherClassRegData = proxy[");
        sb.append("{klasseId:");
        sb.append(this.F1());
        sb.append("}");
        sb.append(",");
        sb.append("{students:");
        sb.append("RealmList<RealmLong>[");
        sb.append(this.p0().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{events:");
        sb.append("RealmList<RealmLong>[");
        sb.append(this.X().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{absences:");
        sb.append("RealmList<RealmLong>[");
        sb.append(this.V().size());
        sb.append("]");
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
    
    @Override
    public void x0(final l0<com.untis.mobile.persistence.realm.b> l0) {
        final boolean i = this.O.i();
        final int n = 0;
        int j = 0;
        l0<com.untis.mobile.persistence.realm.b> l2 = l0;
        if (i) {
            if (!this.O.d()) {
                return;
            }
            if (this.O.e().contains("absences")) {
                return;
            }
            if ((l2 = l0) != null) {
                l2 = l0;
                if (!l0.G0()) {
                    final f0 f0 = (f0)this.O.f();
                    l2 = new l0<com.untis.mobile.persistence.realm.b>();
                    for (final com.untis.mobile.persistence.realm.b b : l0) {
                        com.untis.mobile.persistence.realm.b b2;
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
        this.O.f().h();
        final OsList p = this.O.g().p(this.N.h);
        if (l2 != null && l2.size() == p.b0()) {
            while (j < l2.size()) {
                final com.untis.mobile.persistence.realm.b b3 = l2.get(j);
                this.O.c(b3);
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
                final com.untis.mobile.persistence.realm.b b4 = l2.get(k);
                this.O.c(b4);
                p.l(((p)b4).S6().g().l0());
            }
        }
    }
    
    @Override
    public void y4() {
        if (this.O != null) {
            return;
        }
        final io.realm.a.h h = io.realm.a.W.get();
        this.N = (b)h.c();
        (this.O = new c0<d>(this)).r(h.e());
        this.O.s(h.f());
        this.O.o(h.b());
        this.O.q(h.d());
    }
    
    public static final class a
    {
        public static final String a = "RealmTeacherClassRegData";
    }
    
    static final class b extends c
    {
        long e;
        long f;
        long g;
        long h;
        
        b(final OsSchemaInfo osSchemaInfo) {
            super(4);
            final OsObjectSchemaInfo b = osSchemaInfo.b("RealmTeacherClassRegData");
            this.e = this.b("klasseId", "klasseId", b);
            this.f = this.b("students", "students", b);
            this.g = this.b("events", "events", b);
            this.h = this.b("absences", "absences", b);
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
        }
    }
}
