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
import i4.c;
import com.untis.mobile.persistence.realm.b;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.p;
import i4.a;

public class f1 extends i4.a implements p, g1
{
    private static final String c0 = "";
    private static final OsObjectSchemaInfo d0;
    private b T;
    private c0<i4.a> U;
    private l0<com.untis.mobile.persistence.realm.b> V;
    private l0<com.untis.mobile.persistence.realm.b> W;
    private l0<com.untis.mobile.persistence.realm.b> X;
    private l0<com.untis.mobile.persistence.realm.b> Y;
    private l0<c> Z;
    private l0<com.untis.mobile.persistence.realm.b> a0;
    private l0<k4.a> b0;
    
    static {
        d0 = Q8();
    }
    
    f1() {
        this.U.p();
    }
    
    public static i4.a M8(final f0 f0, final b b, final i4.a a, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        final f1 f2 = map.get(a);
        if (f2 != null) {
            return f2;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(i4.a.class), set);
        osObjectBuilder.L(b.e, a.a());
        osObjectBuilder.n(b.l, a.o3());
        osObjectBuilder.n(b.m, a.A());
        final f1 z8 = Z8(f0, osObjectBuilder.f0());
        map.put(a, z8);
        final l0<com.untis.mobile.persistence.realm.b> p6 = a.p0();
        final int n = 0;
        if (p6 != null) {
            final l0<com.untis.mobile.persistence.realm.b> p7 = z8.p0();
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
        final l0<com.untis.mobile.persistence.realm.b> v9 = a.V();
        if (v9 != null) {
            final l0<com.untis.mobile.persistence.realm.b> v10 = z8.V();
            v10.clear();
            for (int j = 0; j < v9.size(); ++j) {
                final com.untis.mobile.persistence.realm.b b4 = v9.get(j);
                com.untis.mobile.persistence.realm.b v11 = (com.untis.mobile.persistence.realm.b)map.get(b4);
                if (v11 == null) {
                    v11 = z0.v8(f0, (z0.b)f0.H().j(com.untis.mobile.persistence.realm.b.class), b4, b2, map, set);
                }
                v10.add(v11);
            }
        }
        final l0<com.untis.mobile.persistence.realm.b> x = a.X();
        if (x != null) {
            final l0<com.untis.mobile.persistence.realm.b> x2 = z8.X();
            x2.clear();
            for (int k = 0; k < x.size(); ++k) {
                final com.untis.mobile.persistence.realm.b b5 = x.get(k);
                com.untis.mobile.persistence.realm.b v12 = (com.untis.mobile.persistence.realm.b)map.get(b5);
                if (v12 == null) {
                    v12 = z0.v8(f0, (z0.b)f0.H().j(com.untis.mobile.persistence.realm.b.class), b5, b2, map, set);
                }
                x2.add(v12);
            }
        }
        final l0<com.untis.mobile.persistence.realm.b> r7 = a.r7();
        if (r7 != null) {
            final l0<com.untis.mobile.persistence.realm.b> r8 = z8.r7();
            r8.clear();
            for (int l = 0; l < r7.size(); ++l) {
                final com.untis.mobile.persistence.realm.b b6 = r7.get(l);
                com.untis.mobile.persistence.realm.b v13 = (com.untis.mobile.persistence.realm.b)map.get(b6);
                if (v13 == null) {
                    v13 = z0.v8(f0, (z0.b)f0.H().j(com.untis.mobile.persistence.realm.b.class), b6, b2, map, set);
                }
                r8.add(v13);
            }
        }
        final l0<c> r9 = a.R2();
        if (r9 != null) {
            final l0<c> r10 = z8.R2();
            r10.clear();
            for (int n2 = 0; n2 < r9.size(); ++n2) {
                final c c = r9.get(n2);
                c j2 = (c)map.get(c);
                if (j2 == null) {
                    j2 = j1.J8(f0, (j1.b)f0.H().j(c.class), c, b2, map, set);
                }
                r10.add(j2);
            }
        }
        final l0<com.untis.mobile.persistence.realm.b> p8 = a.p1();
        if (p8 != null) {
            final l0<com.untis.mobile.persistence.realm.b> p9 = z8.p1();
            p9.clear();
            for (int n3 = 0; n3 < p8.size(); ++n3) {
                final com.untis.mobile.persistence.realm.b b7 = p8.get(n3);
                com.untis.mobile.persistence.realm.b v14 = (com.untis.mobile.persistence.realm.b)map.get(b7);
                if (v14 == null) {
                    v14 = z0.v8(f0, (z0.b)f0.H().j(com.untis.mobile.persistence.realm.b.class), b7, b2, map, set);
                }
                p9.add(v14);
            }
        }
        final l0<k4.a> q7 = a.Q7();
        if (q7 != null) {
            final l0<k4.a> q8 = z8.Q7();
            q8.clear();
            for (int n4 = n; n4 < q7.size(); ++n4) {
                final k4.a a2 = q7.get(n4);
                k4.a f3 = (k4.a)map.get(a2);
                if (f3 == null) {
                    f3 = v1.F8(f0, (v1.b)f0.H().j(k4.a.class), a2, b2, map, set);
                }
                q8.add(f3);
            }
        }
        return z8;
    }
    
    public static i4.a N8(final f0 f0, final b b, final i4.a a, final boolean b2, final Map<n0, p> map, final Set<q> set) {
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
            return (i4.a)p7;
        }
        final p p8 = null;
        Object x2 = null;
        boolean b3 = false;
        Label_0232: {
            if (b2) {
                x2 = f0.x2(i4.a.class);
                final long r = ((Table)x2).r(b.e, a.a());
                if (r == -1L) {
                    b3 = false;
                    x2 = p8;
                    break Label_0232;
                }
                try {
                    h.g(f0, ((Table)x2).R(r), b, false, Collections.emptyList());
                    x2 = new f1();
                    map.put(a, (p)x2);
                }
                finally {
                    h.a();
                }
            }
            b3 = b2;
        }
        i4.a a2;
        if (b3) {
            a2 = a9(f0, b, (i4.a)x2, a, map, set);
        }
        else {
            a2 = M8(f0, b, a, b2, map, set);
        }
        return a2;
    }
    
    public static b O8(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static i4.a P8(final i4.a a, final int a2, final int n, final Map<n0, p.a<n0>> map) {
        if (a2 <= n && a != null) {
            final p.a a3 = map.get(a);
            i4.a a4;
            if (a3 == null) {
                a4 = new i4.a();
                map.put(a, (p.a<n0>)new p.a(a2, a4));
            }
            else {
                if (a2 >= a3.a) {
                    return (i4.a)a3.b;
                }
                a4 = (i4.a)a3.b;
                a3.a = a2;
            }
            a4.b(a.a());
            final int n2 = 0;
            if (a2 == n) {
                a4.C0(null);
            }
            else {
                final l0<com.untis.mobile.persistence.realm.b> p4 = a.p0();
                final l0<com.untis.mobile.persistence.realm.b> l0 = new l0<com.untis.mobile.persistence.realm.b>();
                a4.C0(l0);
                for (int size = p4.size(), i = 0; i < size; ++i) {
                    l0.add(z0.x8(p4.get(i), a2 + 1, n, map));
                }
            }
            if (a2 == n) {
                a4.x0(null);
            }
            else {
                final l0<com.untis.mobile.persistence.realm.b> v = a.V();
                final l0<com.untis.mobile.persistence.realm.b> l2 = new l0<com.untis.mobile.persistence.realm.b>();
                a4.x0(l2);
                for (int size2 = v.size(), j = 0; j < size2; ++j) {
                    l2.add(z0.x8(v.get(j), a2 + 1, n, map));
                }
            }
            if (a2 == n) {
                a4.o0(null);
            }
            else {
                final l0<com.untis.mobile.persistence.realm.b> x = a.X();
                final l0<com.untis.mobile.persistence.realm.b> l3 = new l0<com.untis.mobile.persistence.realm.b>();
                a4.o0(l3);
                for (int size3 = x.size(), k = 0; k < size3; ++k) {
                    l3.add(z0.x8(x.get(k), a2 + 1, n, map));
                }
            }
            if (a2 == n) {
                a4.u3(null);
            }
            else {
                final l0<com.untis.mobile.persistence.realm.b> r7 = a.r7();
                final l0<com.untis.mobile.persistence.realm.b> l4 = new l0<com.untis.mobile.persistence.realm.b>();
                a4.u3(l4);
                for (int size4 = r7.size(), n3 = 0; n3 < size4; ++n3) {
                    l4.add(z0.x8(r7.get(n3), a2 + 1, n, map));
                }
            }
            if (a2 == n) {
                a4.b7(null);
            }
            else {
                final l0<c> r8 = a.R2();
                final l0<c> l5 = new l0<c>();
                a4.b7(l5);
                for (int size5 = r8.size(), n4 = 0; n4 < size5; ++n4) {
                    l5.add(j1.L8(r8.get(n4), a2 + 1, n, map));
                }
            }
            if (a2 == n) {
                a4.m1(null);
            }
            else {
                final l0<com.untis.mobile.persistence.realm.b> p5 = a.p1();
                final l0<com.untis.mobile.persistence.realm.b> l6 = new l0<com.untis.mobile.persistence.realm.b>();
                a4.m1(l6);
                for (int size6 = p5.size(), n5 = 0; n5 < size6; ++n5) {
                    l6.add(z0.x8(p5.get(n5), a2 + 1, n, map));
                }
            }
            a4.S7(a.o3());
            a4.F(a.A());
            if (a2 == n) {
                a4.O3(null);
            }
            else {
                final l0<k4.a> q7 = a.Q7();
                final l0<k4.a> l7 = new l0<k4.a>();
                a4.O3(l7);
                for (int size7 = q7.size(), n6 = n2; n6 < size7; ++n6) {
                    l7.add(v1.H8(q7.get(n6), a2 + 1, n, map));
                }
            }
            return a4;
        }
        return null;
    }
    
    private static OsObjectSchemaInfo Q8() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmClassbook", false, 10, 0);
        b.c("", "id", RealmFieldType.INTEGER, true, false, true);
        final RealmFieldType list = RealmFieldType.LIST;
        b.b("", "students", list, "RealmLong");
        b.b("", "absences", list, "RealmLong");
        b.b("", "events", list, "RealmLong");
        b.b("", "exemptions", list, "RealmLong");
        b.b("", "prioritizedAttendances", list, "RealmPrioritizedAttendance");
        b.b("", "homeWorks", list, "RealmLong");
        final RealmFieldType boolean1 = RealmFieldType.BOOLEAN;
        b.c("", "absencesChecked", boolean1, false, false, true);
        b.c("", "synced", boolean1, false, false, true);
        b.b("", "classRoles", list, "RealmClassRole");
        return b.e();
    }
    
    public static i4.a R8(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final ArrayList<String> list = new ArrayList<String>(7);
        Object x2 = null;
        Label_0147: {
            if (b) {
                x2 = f0.x2(i4.a.class);
                final long e = ((b)f0.H().j(i4.a.class)).e;
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
                        h.g(f0, ((Table)x2).R(r), f0.H().j(i4.a.class), false, Collections.emptyList());
                        x2 = new f1();
                        break Label_0147;
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
            if (jsonObject.has("absences")) {
                list.add("absences");
            }
            if (jsonObject.has("events")) {
                list.add("events");
            }
            if (jsonObject.has("exemptions")) {
                list.add("exemptions");
            }
            if (jsonObject.has("prioritizedAttendances")) {
                list.add("prioritizedAttendances");
            }
            if (jsonObject.has("homeWorks")) {
                list.add("homeWorks");
            }
            if (jsonObject.has("classRoles")) {
                list.add("classRoles");
            }
            if (!jsonObject.has("id")) {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
            f1 f2;
            if (jsonObject.isNull("id")) {
                f2 = f0.p1((Class<f1>)i4.a.class, null, true, list);
            }
            else {
                f2 = f0.p1((Class<f1>)i4.a.class, jsonObject.getLong("id"), true, list);
            }
            o = f2;
        }
        final boolean has = jsonObject.has("students");
        final int n = 0;
        if (has) {
            if (jsonObject.isNull("students")) {
                ((g1)o).C0(null);
            }
            else {
                ((g1)o).p0().clear();
                final JSONArray jsonArray = jsonObject.getJSONArray("students");
                for (int i = 0; i < jsonArray.length(); ++i) {
                    ((g1)o).p0().add(z0.z8(f0, jsonArray.getJSONObject(i), b));
                }
            }
        }
        if (jsonObject.has("absences")) {
            if (jsonObject.isNull("absences")) {
                ((g1)o).x0(null);
            }
            else {
                ((g1)o).V().clear();
                final JSONArray jsonArray2 = jsonObject.getJSONArray("absences");
                for (int j = 0; j < jsonArray2.length(); ++j) {
                    ((g1)o).V().add(z0.z8(f0, jsonArray2.getJSONObject(j), b));
                }
            }
        }
        if (jsonObject.has("events")) {
            if (jsonObject.isNull("events")) {
                ((g1)o).o0(null);
            }
            else {
                ((g1)o).X().clear();
                final JSONArray jsonArray3 = jsonObject.getJSONArray("events");
                for (int k = 0; k < jsonArray3.length(); ++k) {
                    ((g1)o).X().add(z0.z8(f0, jsonArray3.getJSONObject(k), b));
                }
            }
        }
        if (jsonObject.has("exemptions")) {
            if (jsonObject.isNull("exemptions")) {
                ((g1)o).u3(null);
            }
            else {
                ((g1)o).r7().clear();
                final JSONArray jsonArray4 = jsonObject.getJSONArray("exemptions");
                for (int l = 0; l < jsonArray4.length(); ++l) {
                    ((g1)o).r7().add(z0.z8(f0, jsonArray4.getJSONObject(l), b));
                }
            }
        }
        if (jsonObject.has("prioritizedAttendances")) {
            if (jsonObject.isNull("prioritizedAttendances")) {
                ((g1)o).b7(null);
            }
            else {
                ((g1)o).R2().clear();
                final JSONArray jsonArray5 = jsonObject.getJSONArray("prioritizedAttendances");
                for (int n2 = 0; n2 < jsonArray5.length(); ++n2) {
                    ((g1)o).R2().add(j1.N8(f0, jsonArray5.getJSONObject(n2), b));
                }
            }
        }
        if (jsonObject.has("homeWorks")) {
            if (jsonObject.isNull("homeWorks")) {
                ((g1)o).m1(null);
            }
            else {
                ((g1)o).p1().clear();
                final JSONArray jsonArray6 = jsonObject.getJSONArray("homeWorks");
                for (int n3 = 0; n3 < jsonArray6.length(); ++n3) {
                    ((g1)o).p1().add(z0.z8(f0, jsonArray6.getJSONObject(n3), b));
                }
            }
        }
        if (jsonObject.has("absencesChecked")) {
            if (jsonObject.isNull("absencesChecked")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'absencesChecked' to null.");
            }
            ((g1)o).S7(jsonObject.getBoolean("absencesChecked"));
        }
        if (jsonObject.has("synced")) {
            if (jsonObject.isNull("synced")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'synced' to null.");
            }
            ((g1)o).F(jsonObject.getBoolean("synced"));
        }
        if (jsonObject.has("classRoles")) {
            if (jsonObject.isNull("classRoles")) {
                ((g1)o).O3(null);
            }
            else {
                ((g1)o).Q7().clear();
                final JSONArray jsonArray7 = jsonObject.getJSONArray("classRoles");
                for (int n4 = n; n4 < jsonArray7.length(); ++n4) {
                    ((g1)o).Q7().add(v1.J8(f0, jsonArray7.getJSONObject(n4), b));
                }
            }
        }
        return (i4.a)o;
    }
    
    @TargetApi(11)
    public static i4.a S8(final f0 f0, final JsonReader jsonReader) throws IOException {
        final i4.a a = new i4.a();
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
            else {
                if (nextName.equals("students")) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.skipValue();
                        a.C0(null);
                        continue;
                    }
                    a.C0(new l0<com.untis.mobile.persistence.realm.b>());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        a.p0().add(z0.A8(f0, jsonReader));
                    }
                }
                else if (nextName.equals("absences")) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.skipValue();
                        a.x0(null);
                        continue;
                    }
                    a.x0(new l0<com.untis.mobile.persistence.realm.b>());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        a.V().add(z0.A8(f0, jsonReader));
                    }
                }
                else if (nextName.equals("events")) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.skipValue();
                        a.o0(null);
                        continue;
                    }
                    a.o0(new l0<com.untis.mobile.persistence.realm.b>());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        a.X().add(z0.A8(f0, jsonReader));
                    }
                }
                else if (nextName.equals("exemptions")) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.skipValue();
                        a.u3(null);
                        continue;
                    }
                    a.u3(new l0<com.untis.mobile.persistence.realm.b>());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        a.r7().add(z0.A8(f0, jsonReader));
                    }
                }
                else if (nextName.equals("prioritizedAttendances")) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.skipValue();
                        a.b7(null);
                        continue;
                    }
                    a.b7(new l0<c>());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        a.R2().add(j1.O8(f0, jsonReader));
                    }
                }
                else if (nextName.equals("homeWorks")) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.skipValue();
                        a.m1(null);
                        continue;
                    }
                    a.m1(new l0<com.untis.mobile.persistence.realm.b>());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        a.p1().add(z0.A8(f0, jsonReader));
                    }
                }
                else if (nextName.equals("absencesChecked")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        a.S7(jsonReader.nextBoolean());
                        continue;
                    }
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'absencesChecked' to null.");
                }
                else if (nextName.equals("synced")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        a.F(jsonReader.nextBoolean());
                        continue;
                    }
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'synced' to null.");
                }
                else {
                    if (!nextName.equals("classRoles")) {
                        jsonReader.skipValue();
                        continue;
                    }
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.skipValue();
                        a.O3(null);
                        continue;
                    }
                    a.O3(new l0<k4.a>());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        a.Q7().add(v1.K8(f0, jsonReader));
                    }
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
        if (b) {
            return f0.G0(a, new q[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }
    
    public static OsObjectSchemaInfo T8() {
        return f1.d0;
    }
    
    public static String U8() {
        return "RealmClassbook";
    }
    
    public static long V8(final f0 f0, final i4.a a, final Map<n0, Long> map) {
        if (a instanceof p && !p0.h8(a)) {
            final p p3 = (p)a;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(i4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(i4.a.class);
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
        final l0<com.untis.mobile.persistence.realm.b> p4 = a.p0();
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
        final l0<com.untis.mobile.persistence.realm.b> v = a.V();
        if (v != null) {
            final OsList list2 = new OsList(x2.R(l), b.g);
            for (final com.untis.mobile.persistence.realm.b b3 : v) {
                Long value3;
                if ((value3 = map.get(b3)) == null) {
                    value3 = z0.D8(f0, b3, map);
                }
                list2.l(value3);
            }
        }
        final l0<com.untis.mobile.persistence.realm.b> x3 = a.X();
        if (x3 != null) {
            final OsList list3 = new OsList(x2.R(l), b.h);
            for (final com.untis.mobile.persistence.realm.b b4 : x3) {
                Long value4;
                if ((value4 = map.get(b4)) == null) {
                    value4 = z0.D8(f0, b4, map);
                }
                list3.l(value4);
            }
        }
        final l0<com.untis.mobile.persistence.realm.b> r7 = a.r7();
        if (r7 != null) {
            final OsList list4 = new OsList(x2.R(l), b.i);
            for (final com.untis.mobile.persistence.realm.b b5 : r7) {
                Long value5;
                if ((value5 = map.get(b5)) == null) {
                    value5 = z0.D8(f0, b5, map);
                }
                list4.l(value5);
            }
        }
        final l0<c> r8 = a.R2();
        if (r8 != null) {
            final OsList list5 = new OsList(x2.R(l), b.j);
            for (final c c : r8) {
                Long value6;
                if ((value6 = map.get(c)) == null) {
                    value6 = j1.R8(f0, c, map);
                }
                list5.l(value6);
            }
        }
        final l0<com.untis.mobile.persistence.realm.b> p5 = a.p1();
        if (p5 != null) {
            final OsList list6 = new OsList(x2.R(l), b.k);
            for (final com.untis.mobile.persistence.realm.b b6 : p5) {
                Long value7;
                if ((value7 = map.get(b6)) == null) {
                    value7 = z0.D8(f0, b6, map);
                }
                list6.l(value7);
            }
        }
        Table.nativeSetBoolean(nativePtr, b.l, l, a.o3(), false);
        Table.nativeSetBoolean(nativePtr, b.m, l, a.A(), false);
        final l0<k4.a> q7 = a.Q7();
        if (q7 != null) {
            final OsList list7 = new OsList(x2.R(l), b.n);
            for (final k4.a a2 : q7) {
                Long value8;
                if ((value8 = map.get(a2)) == null) {
                    value8 = v1.N8(f0, a2, map);
                }
                list7.l(value8);
            }
        }
        return l;
    }
    
    public static void W8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(i4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(i4.a.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final i4.a a = (i4.a)iterator.next();
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
            final l0<com.untis.mobile.persistence.realm.b> p4 = a.p0();
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
            final l0<com.untis.mobile.persistence.realm.b> v = a.V();
            if (v != null) {
                final OsList list2 = new OsList(x2.R(l), b.g);
                for (final com.untis.mobile.persistence.realm.b b3 : v) {
                    Long value3;
                    if ((value3 = map.get(b3)) == null) {
                        value3 = z0.D8(f0, b3, map);
                    }
                    list2.l(value3);
                }
            }
            final l0<com.untis.mobile.persistence.realm.b> x3 = a.X();
            if (x3 != null) {
                final OsList list3 = new OsList(x2.R(l), b.h);
                for (final com.untis.mobile.persistence.realm.b b4 : x3) {
                    Long value4;
                    if ((value4 = map.get(b4)) == null) {
                        value4 = z0.D8(f0, b4, map);
                    }
                    list3.l(value4);
                }
            }
            final l0<com.untis.mobile.persistence.realm.b> r7 = a.r7();
            if (r7 != null) {
                final OsList list4 = new OsList(x2.R(l), b.i);
                for (final com.untis.mobile.persistence.realm.b b5 : r7) {
                    Long value5;
                    if ((value5 = map.get(b5)) == null) {
                        value5 = z0.D8(f0, b5, map);
                    }
                    list4.l(value5);
                }
            }
            final l0<c> r8 = a.R2();
            if (r8 != null) {
                final OsList list5 = new OsList(x2.R(l), b.j);
                for (final c c : r8) {
                    Long value6;
                    if ((value6 = map.get(c)) == null) {
                        value6 = j1.R8(f0, c, map);
                    }
                    list5.l(value6);
                }
            }
            final l0<com.untis.mobile.persistence.realm.b> p5 = a.p1();
            if (p5 != null) {
                final OsList list6 = new OsList(x2.R(l), b.k);
                for (final com.untis.mobile.persistence.realm.b b6 : p5) {
                    Long value7;
                    if ((value7 = map.get(b6)) == null) {
                        value7 = z0.D8(f0, b6, map);
                    }
                    list6.l(value7);
                }
            }
            Table.nativeSetBoolean(nativePtr, b.l, l, a.o3(), false);
            Table.nativeSetBoolean(nativePtr, b.m, l, a.A(), false);
            final l0<k4.a> q7 = a.Q7();
            if (q7 == null) {
                continue;
            }
            final OsList list7 = new OsList(x2.R(l), b.n);
            for (final k4.a a2 : q7) {
                Long value8;
                if ((value8 = map.get(a2)) == null) {
                    value8 = v1.N8(f0, a2, map);
                }
                list7.l(value8);
            }
        }
    }
    
    public static long X8(final f0 f0, final i4.a a, final Map<n0, Long> map) {
        if (a instanceof p && !p0.h8(a)) {
            final p p3 = (p)a;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(i4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(i4.a.class);
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
        final OsList list = new OsList(x2.R(rowWithPrimaryKey), b.f);
        final l0<com.untis.mobile.persistence.realm.b> p4 = a.p0();
        final int n = 0;
        long n2;
        if (p4 != null && p4.size() == list.b0()) {
            final int size = p4.size();
            int i = 0;
            n2 = nativePtr;
            while (i < size) {
                final com.untis.mobile.persistence.realm.b b2 = p4.get(i);
                Long value;
                if ((value = map.get(b2)) == null) {
                    value = z0.F8(f0, b2, map);
                }
                list.Z(i, value);
                ++i;
            }
        }
        else {
            list.M();
            n2 = nativePtr;
            if (p4 != null) {
                final Iterator<com.untis.mobile.persistence.realm.b> iterator = p4.iterator();
                while (true) {
                    n2 = nativePtr;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    final com.untis.mobile.persistence.realm.b b3 = iterator.next();
                    Long value2;
                    if ((value2 = map.get(b3)) == null) {
                        value2 = z0.F8(f0, b3, map);
                    }
                    list.l(value2);
                }
            }
        }
        final OsList list2 = new OsList(x2.R(rowWithPrimaryKey), b.g);
        final l0<com.untis.mobile.persistence.realm.b> v = a.V();
        if (v != null && v.size() == list2.b0()) {
            for (int size2 = v.size(), j = 0; j < size2; ++j) {
                final com.untis.mobile.persistence.realm.b b4 = v.get(j);
                Long value3;
                if ((value3 = map.get(b4)) == null) {
                    value3 = z0.F8(f0, b4, map);
                }
                list2.Z(j, value3);
            }
        }
        else {
            list2.M();
            if (v != null) {
                for (final com.untis.mobile.persistence.realm.b b5 : v) {
                    Long value4;
                    if ((value4 = map.get(b5)) == null) {
                        value4 = z0.F8(f0, b5, map);
                    }
                    list2.l(value4);
                }
            }
        }
        final OsList list3 = new OsList(x2.R(rowWithPrimaryKey), b.h);
        final l0<com.untis.mobile.persistence.realm.b> x3 = a.X();
        if (x3 != null && x3.size() == list3.b0()) {
            for (int size3 = x3.size(), k = 0; k < size3; ++k) {
                final com.untis.mobile.persistence.realm.b b6 = x3.get(k);
                Long value5;
                if ((value5 = map.get(b6)) == null) {
                    value5 = z0.F8(f0, b6, map);
                }
                list3.Z(k, value5);
            }
        }
        else {
            list3.M();
            if (x3 != null) {
                for (final com.untis.mobile.persistence.realm.b b7 : x3) {
                    Long value6;
                    if ((value6 = map.get(b7)) == null) {
                        value6 = z0.F8(f0, b7, map);
                    }
                    list3.l(value6);
                }
            }
        }
        final OsList list4 = new OsList(x2.R(rowWithPrimaryKey), b.i);
        final l0<com.untis.mobile.persistence.realm.b> r7 = a.r7();
        if (r7 != null && r7.size() == list4.b0()) {
            for (int size4 = r7.size(), l = 0; l < size4; ++l) {
                final com.untis.mobile.persistence.realm.b b8 = r7.get(l);
                Long value7;
                if ((value7 = map.get(b8)) == null) {
                    value7 = z0.F8(f0, b8, map);
                }
                list4.Z(l, value7);
            }
        }
        else {
            list4.M();
            if (r7 != null) {
                for (final com.untis.mobile.persistence.realm.b b9 : r7) {
                    Long value8;
                    if ((value8 = map.get(b9)) == null) {
                        value8 = z0.F8(f0, b9, map);
                    }
                    list4.l(value8);
                }
            }
        }
        final OsList list5 = new OsList(x2.R(rowWithPrimaryKey), b.j);
        final l0<c> r8 = a.R2();
        if (r8 != null && r8.size() == list5.b0()) {
            for (int size5 = r8.size(), n3 = 0; n3 < size5; ++n3) {
                final c c = r8.get(n3);
                Long value9;
                if ((value9 = map.get(c)) == null) {
                    value9 = j1.T8(f0, c, map);
                }
                list5.Z(n3, value9);
            }
        }
        else {
            list5.M();
            if (r8 != null) {
                for (final c c2 : r8) {
                    Long value10;
                    if ((value10 = map.get(c2)) == null) {
                        value10 = j1.T8(f0, c2, map);
                    }
                    list5.l(value10);
                }
            }
        }
        final OsList list6 = new OsList(x2.R(rowWithPrimaryKey), b.k);
        final l0<com.untis.mobile.persistence.realm.b> p5 = a.p1();
        if (p5 != null && p5.size() == list6.b0()) {
            for (int size6 = p5.size(), n4 = 0; n4 < size6; ++n4) {
                final com.untis.mobile.persistence.realm.b b10 = p5.get(n4);
                Long value11;
                if ((value11 = map.get(b10)) == null) {
                    value11 = z0.F8(f0, b10, map);
                }
                list6.Z(n4, value11);
            }
        }
        else {
            list6.M();
            if (p5 != null) {
                for (final com.untis.mobile.persistence.realm.b b11 : p5) {
                    Long value12;
                    if ((value12 = map.get(b11)) == null) {
                        value12 = z0.F8(f0, b11, map);
                    }
                    list6.l(value12);
                }
            }
        }
        Table.nativeSetBoolean(n2, b.l, rowWithPrimaryKey, a.o3(), false);
        Table.nativeSetBoolean(n2, b.m, rowWithPrimaryKey, a.A(), false);
        final OsList list7 = new OsList(x2.R(rowWithPrimaryKey), b.n);
        final l0<k4.a> q7 = a.Q7();
        if (q7 != null && q7.size() == list7.b0()) {
            for (int size7 = q7.size(), n5 = n; n5 < size7; ++n5) {
                final k4.a a2 = q7.get(n5);
                Long value13;
                if ((value13 = map.get(a2)) == null) {
                    value13 = v1.P8(f0, a2, map);
                }
                list7.Z(n5, value13);
            }
        }
        else {
            list7.M();
            if (q7 != null) {
                for (final k4.a a3 : q7) {
                    Long value14;
                    if ((value14 = map.get(a3)) == null) {
                        value14 = v1.P8(f0, a3, map);
                    }
                    list7.l(value14);
                }
            }
        }
        return rowWithPrimaryKey;
    }
    
    public static void Y8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(i4.a.class);
        long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(i4.a.class);
        long e = b.e;
        while (iterator.hasNext()) {
            g1 g1 = (i4.a)iterator.next();
            if (map.containsKey(g1)) {
                continue;
            }
            if (g1 instanceof p && !p0.h8(g1)) {
                final p p3 = (p)g1;
                if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                    map.put((p)g1, p3.S6().g().l0());
                    continue;
                }
            }
            long nativeFindFirstInt;
            if (Long.valueOf(g1.a()) != null) {
                nativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, e, g1.a());
            }
            else {
                nativeFindFirstInt = -1L;
            }
            long rowWithPrimaryKey = nativeFindFirstInt;
            if (nativeFindFirstInt == -1L) {
                rowWithPrimaryKey = OsObject.createRowWithPrimaryKey(x2, e, g1.a());
            }
            map.put((p)g1, rowWithPrimaryKey);
            final OsList list = new OsList(x2.R(rowWithPrimaryKey), b.f);
            final l0<com.untis.mobile.persistence.realm.b> p4 = g1.p0();
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
                e = n2;
                nativePtr = n;
                if (p4 != null) {
                    final Iterator<com.untis.mobile.persistence.realm.b> iterator2 = p4.iterator();
                    while (true) {
                        e = n2;
                        nativePtr = n;
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
            final l0<com.untis.mobile.persistence.realm.b> v = g1.V();
            if (v != null && v.size() == list2.b0()) {
                for (int size2 = v.size(), j = 0; j < size2; ++j) {
                    final com.untis.mobile.persistence.realm.b b4 = v.get(j);
                    Long value3;
                    if ((value3 = map.get(b4)) == null) {
                        value3 = z0.F8(f0, b4, map);
                    }
                    list2.Z(j, value3);
                }
            }
            else {
                final g1 g2 = g1;
                list2.M();
                g1 = g2;
                if (v != null) {
                    final Iterator<com.untis.mobile.persistence.realm.b> iterator3 = v.iterator();
                    while (true) {
                        g1 = g2;
                        if (!iterator3.hasNext()) {
                            break;
                        }
                        final com.untis.mobile.persistence.realm.b b5 = iterator3.next();
                        Long value4;
                        if ((value4 = map.get(b5)) == null) {
                            value4 = z0.F8(f0, b5, map);
                        }
                        list2.l(value4);
                    }
                }
            }
            final OsList list3 = new OsList(x2.R(rowWithPrimaryKey), b.h);
            final l0<com.untis.mobile.persistence.realm.b> x3 = g1.X();
            if (x3 != null && x3.size() == list3.b0()) {
                for (int size3 = x3.size(), k = 0; k < size3; ++k) {
                    final com.untis.mobile.persistence.realm.b b6 = x3.get(k);
                    Long value5;
                    if ((value5 = map.get(b6)) == null) {
                        value5 = z0.F8(f0, b6, map);
                    }
                    list3.Z(k, value5);
                }
            }
            else {
                list3.M();
                if (x3 != null) {
                    for (final com.untis.mobile.persistence.realm.b b7 : x3) {
                        Long value6;
                        if ((value6 = map.get(b7)) == null) {
                            value6 = z0.F8(f0, b7, map);
                        }
                        list3.l(value6);
                    }
                }
            }
            final OsList list4 = new OsList(x2.R(rowWithPrimaryKey), b.i);
            final l0<com.untis.mobile.persistence.realm.b> r7 = g1.r7();
            if (r7 != null && r7.size() == list4.b0()) {
                for (int size4 = r7.size(), l = 0; l < size4; ++l) {
                    final com.untis.mobile.persistence.realm.b b8 = r7.get(l);
                    Long value7;
                    if ((value7 = map.get(b8)) == null) {
                        value7 = z0.F8(f0, b8, map);
                    }
                    list4.Z(l, value7);
                }
            }
            else {
                list4.M();
                if (r7 != null) {
                    for (final com.untis.mobile.persistence.realm.b b9 : r7) {
                        Long value8;
                        if ((value8 = map.get(b9)) == null) {
                            value8 = z0.F8(f0, b9, map);
                        }
                        list4.l(value8);
                    }
                }
            }
            final OsList list5 = new OsList(x2.R(rowWithPrimaryKey), b.j);
            final l0<c> r8 = g1.R2();
            if (r8 != null && r8.size() == list5.b0()) {
                for (int size5 = r8.size(), n3 = 0; n3 < size5; ++n3) {
                    final c c = r8.get(n3);
                    Long value9;
                    if ((value9 = map.get(c)) == null) {
                        value9 = j1.T8(f0, c, map);
                    }
                    list5.Z(n3, value9);
                }
            }
            else {
                list5.M();
                if (r8 != null) {
                    for (final c c2 : r8) {
                        Long value10;
                        if ((value10 = map.get(c2)) == null) {
                            value10 = j1.T8(f0, c2, map);
                        }
                        list5.l(value10);
                    }
                }
            }
            final OsList list6 = new OsList(x2.R(rowWithPrimaryKey), b.k);
            final l0<com.untis.mobile.persistence.realm.b> p5 = g1.p1();
            if (p5 != null && p5.size() == list6.b0()) {
                for (int size6 = p5.size(), n4 = 0; n4 < size6; ++n4) {
                    final com.untis.mobile.persistence.realm.b b10 = p5.get(n4);
                    Long value11;
                    if ((value11 = map.get(b10)) == null) {
                        value11 = z0.F8(f0, b10, map);
                    }
                    list6.Z(n4, value11);
                }
            }
            else {
                list6.M();
                if (p5 != null) {
                    for (final com.untis.mobile.persistence.realm.b b11 : p5) {
                        Long value12;
                        if ((value12 = map.get(b11)) == null) {
                            value12 = z0.F8(f0, b11, map);
                        }
                        list6.l(value12);
                    }
                }
            }
            Table.nativeSetBoolean(nativePtr, b.l, rowWithPrimaryKey, g1.o3(), false);
            Table.nativeSetBoolean(nativePtr, b.m, rowWithPrimaryKey, g1.A(), false);
            final OsList list7 = new OsList(x2.R(rowWithPrimaryKey), b.n);
            final l0<k4.a> q7 = g1.Q7();
            if (q7 != null && q7.size() == list7.b0()) {
                for (int size7 = q7.size(), n5 = 0; n5 < size7; ++n5) {
                    final k4.a a = q7.get(n5);
                    Long value13;
                    if ((value13 = map.get(a)) == null) {
                        value13 = v1.P8(f0, a, map);
                    }
                    list7.Z(n5, value13);
                }
            }
            else {
                list7.M();
                if (q7 == null) {
                    continue;
                }
                for (final k4.a a2 : q7) {
                    Long value14;
                    if ((value14 = map.get(a2)) == null) {
                        value14 = v1.P8(f0, a2, map);
                    }
                    list7.l(value14);
                }
            }
        }
    }
    
    static f1 Z8(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(i4.a.class), false, Collections.emptyList());
        final f1 f1 = new f1();
        h.a();
        return f1;
    }
    
    static i4.a a9(final f0 f0, final b b, final i4.a a, final i4.a a2, final Map<n0, p> map, final Set<q> set) {
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(i4.a.class), set);
        osObjectBuilder.L(b.e, a2.a());
        final l0<com.untis.mobile.persistence.realm.b> p6 = a2.p0();
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
        final l0<com.untis.mobile.persistence.realm.b> v9 = a2.V();
        if (v9 != null) {
            final l0<n0> l2 = new l0<n0>();
            for (int j = 0; j < v9.size(); ++j) {
                final com.untis.mobile.persistence.realm.b b3 = v9.get(j);
                com.untis.mobile.persistence.realm.b v10 = (com.untis.mobile.persistence.realm.b)map.get(b3);
                if (v10 == null) {
                    v10 = z0.v8(f0, (z0.b)f0.H().j(com.untis.mobile.persistence.realm.b.class), b3, true, map, set);
                }
                l2.add(v10);
            }
            osObjectBuilder.Z(b.g, l2);
        }
        else {
            osObjectBuilder.Z(b.g, new l0<n0>());
        }
        final l0<com.untis.mobile.persistence.realm.b> x = a2.X();
        if (x != null) {
            final l0<n0> l3 = new l0<n0>();
            for (int k = 0; k < x.size(); ++k) {
                final com.untis.mobile.persistence.realm.b b4 = x.get(k);
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
        final l0<com.untis.mobile.persistence.realm.b> r7 = a2.r7();
        if (r7 != null) {
            final l0<n0> l4 = new l0<n0>();
            for (int n2 = 0; n2 < r7.size(); ++n2) {
                final com.untis.mobile.persistence.realm.b b5 = r7.get(n2);
                com.untis.mobile.persistence.realm.b v12 = (com.untis.mobile.persistence.realm.b)map.get(b5);
                if (v12 == null) {
                    v12 = z0.v8(f0, (z0.b)f0.H().j(com.untis.mobile.persistence.realm.b.class), b5, true, map, set);
                }
                l4.add(v12);
            }
            osObjectBuilder.Z(b.i, l4);
        }
        else {
            osObjectBuilder.Z(b.i, new l0<n0>());
        }
        final l0<c> r8 = a2.R2();
        if (r8 != null) {
            final l0<n0> l5 = new l0<n0>();
            for (int n3 = 0; n3 < r8.size(); ++n3) {
                final c c = r8.get(n3);
                c j2 = (c)map.get(c);
                if (j2 == null) {
                    j2 = j1.J8(f0, (j1.b)f0.H().j(c.class), c, true, map, set);
                }
                l5.add(j2);
            }
            osObjectBuilder.Z(b.j, l5);
        }
        else {
            osObjectBuilder.Z(b.j, new l0<n0>());
        }
        final l0<com.untis.mobile.persistence.realm.b> p7 = a2.p1();
        if (p7 != null) {
            final l0<n0> l6 = new l0<n0>();
            for (int n4 = 0; n4 < p7.size(); ++n4) {
                final com.untis.mobile.persistence.realm.b b6 = p7.get(n4);
                com.untis.mobile.persistence.realm.b v13 = (com.untis.mobile.persistence.realm.b)map.get(b6);
                if (v13 == null) {
                    v13 = z0.v8(f0, (z0.b)f0.H().j(com.untis.mobile.persistence.realm.b.class), b6, true, map, set);
                }
                l6.add(v13);
            }
            osObjectBuilder.Z(b.k, l6);
        }
        else {
            osObjectBuilder.Z(b.k, new l0<n0>());
        }
        osObjectBuilder.n(b.l, a2.o3());
        osObjectBuilder.n(b.m, a2.A());
        final l0<k4.a> q7 = a2.Q7();
        if (q7 != null) {
            final l0<n0> l7 = new l0<n0>();
            for (int n5 = n; n5 < q7.size(); ++n5) {
                final k4.a a3 = q7.get(n5);
                k4.a f2 = (k4.a)map.get(a3);
                if (f2 == null) {
                    f2 = v1.F8(f0, (v1.b)f0.H().j(k4.a.class), a3, true, map, set);
                }
                l7.add(f2);
            }
            osObjectBuilder.Z(b.n, l7);
        }
        else {
            osObjectBuilder.Z(b.n, new l0<n0>());
        }
        osObjectBuilder.i0();
        return a;
    }
    
    @Override
    public boolean A() {
        this.U.f().h();
        return this.U.g().l(this.T.m);
    }
    
    @Override
    public void C0(final l0<com.untis.mobile.persistence.realm.b> l0) {
        final boolean i = this.U.i();
        final int n = 0;
        int j = 0;
        l0<com.untis.mobile.persistence.realm.b> l2 = l0;
        if (i) {
            if (!this.U.d()) {
                return;
            }
            if (this.U.e().contains("students")) {
                return;
            }
            if ((l2 = l0) != null) {
                l2 = l0;
                if (!l0.G0()) {
                    final f0 f0 = (f0)this.U.f();
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
        this.U.f().h();
        final OsList p = this.U.g().p(this.T.f);
        if (l2 != null && l2.size() == p.b0()) {
            while (j < l2.size()) {
                final com.untis.mobile.persistence.realm.b b3 = l2.get(j);
                this.U.c(b3);
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
                this.U.c(b4);
                p.l(((p)b4).S6().g().l0());
            }
        }
    }
    
    @Override
    public void F(final boolean b) {
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
    public void O3(final l0<k4.a> l0) {
        final boolean i = this.U.i();
        final int n = 0;
        int j = 0;
        l0<k4.a> l2 = l0;
        if (i) {
            if (!this.U.d()) {
                return;
            }
            if (this.U.e().contains("classRoles")) {
                return;
            }
            if ((l2 = l0) != null) {
                l2 = l0;
                if (!l0.G0()) {
                    final f0 f0 = (f0)this.U.f();
                    l2 = new l0<k4.a>();
                    for (final k4.a a : l0) {
                        k4.a a2;
                        if ((a2 = a) != null) {
                            if (p0.j8(a)) {
                                a2 = a;
                            }
                            else {
                                a2 = f0.y0(a, new q[0]);
                            }
                        }
                        l2.add(a2);
                    }
                }
            }
        }
        this.U.f().h();
        final OsList p = this.U.g().p(this.T.n);
        if (l2 != null && l2.size() == p.b0()) {
            while (j < l2.size()) {
                final k4.a a3 = l2.get(j);
                this.U.c(a3);
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
                final k4.a a4 = l2.get(k);
                this.U.c(a4);
                p.l(((p)a4).S6().g().l0());
            }
        }
    }
    
    @Override
    public l0<k4.a> Q7() {
        this.U.f().h();
        final l0<k4.a> b0 = this.b0;
        if (b0 != null) {
            return b0;
        }
        return this.b0 = new l0<k4.a>(k4.a.class, this.U.g().p(this.T.n), this.U.f());
    }
    
    @Override
    public l0<c> R2() {
        this.U.f().h();
        final l0<c> z = this.Z;
        if (z != null) {
            return z;
        }
        return this.Z = new l0<c>(c.class, this.U.g().p(this.T.j), this.U.f());
    }
    
    @Override
    public c0<?> S6() {
        return this.U;
    }
    
    @Override
    public void S7(final boolean b) {
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
    public l0<com.untis.mobile.persistence.realm.b> V() {
        this.U.f().h();
        final l0<com.untis.mobile.persistence.realm.b> w = this.W;
        if (w != null) {
            return w;
        }
        return this.W = new l0<com.untis.mobile.persistence.realm.b>(com.untis.mobile.persistence.realm.b.class, this.U.g().p(this.T.g), this.U.f());
    }
    
    @Override
    public l0<com.untis.mobile.persistence.realm.b> X() {
        this.U.f().h();
        final l0<com.untis.mobile.persistence.realm.b> x = this.X;
        if (x != null) {
            return x;
        }
        return this.X = new l0<com.untis.mobile.persistence.realm.b>(com.untis.mobile.persistence.realm.b.class, this.U.g().p(this.T.h), this.U.f());
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
    public void b7(final l0<c> l0) {
        final boolean i = this.U.i();
        final int n = 0;
        int j = 0;
        l0<c> l2 = l0;
        if (i) {
            if (!this.U.d()) {
                return;
            }
            if (this.U.e().contains("prioritizedAttendances")) {
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
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final f1 f1 = (f1)o;
        final io.realm.a f2 = this.U.f();
        final io.realm.a f3 = f1.U.f();
        final String path = f2.getPath();
        final String path2 = f3.getPath();
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
        if (f2.N() != f3.N()) {
            return false;
        }
        if (!f2.K.getVersionID().equals(f3.K.getVersionID())) {
            return false;
        }
        final String m = this.U.g().g().M();
        final String i = f1.U.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.U.g().l0() == f1.U.g().l0();
            }
        }
        else if (i == null) {
            return this.U.g().l0() == f1.U.g().l0();
        }
        return false;
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
    public void m1(final l0<com.untis.mobile.persistence.realm.b> l0) {
        final boolean i = this.U.i();
        final int n = 0;
        int j = 0;
        l0<com.untis.mobile.persistence.realm.b> l2 = l0;
        if (i) {
            if (!this.U.d()) {
                return;
            }
            if (this.U.e().contains("homeWorks")) {
                return;
            }
            if ((l2 = l0) != null) {
                l2 = l0;
                if (!l0.G0()) {
                    final f0 f0 = (f0)this.U.f();
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
        this.U.f().h();
        final OsList p = this.U.g().p(this.T.k);
        if (l2 != null && l2.size() == p.b0()) {
            while (j < l2.size()) {
                final com.untis.mobile.persistence.realm.b b3 = l2.get(j);
                this.U.c(b3);
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
                this.U.c(b4);
                p.l(((p)b4).S6().g().l0());
            }
        }
    }
    
    @Override
    public void o0(final l0<com.untis.mobile.persistence.realm.b> l0) {
        final boolean i = this.U.i();
        final int n = 0;
        int j = 0;
        l0<com.untis.mobile.persistence.realm.b> l2 = l0;
        if (i) {
            if (!this.U.d()) {
                return;
            }
            if (this.U.e().contains("events")) {
                return;
            }
            if ((l2 = l0) != null) {
                l2 = l0;
                if (!l0.G0()) {
                    final f0 f0 = (f0)this.U.f();
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
        this.U.f().h();
        final OsList p = this.U.g().p(this.T.h);
        if (l2 != null && l2.size() == p.b0()) {
            while (j < l2.size()) {
                final com.untis.mobile.persistence.realm.b b3 = l2.get(j);
                this.U.c(b3);
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
                this.U.c(b4);
                p.l(((p)b4).S6().g().l0());
            }
        }
    }
    
    @Override
    public boolean o3() {
        this.U.f().h();
        return this.U.g().l(this.T.l);
    }
    
    @Override
    public l0<com.untis.mobile.persistence.realm.b> p0() {
        this.U.f().h();
        final l0<com.untis.mobile.persistence.realm.b> v = this.V;
        if (v != null) {
            return v;
        }
        return this.V = new l0<com.untis.mobile.persistence.realm.b>(com.untis.mobile.persistence.realm.b.class, this.U.g().p(this.T.f), this.U.f());
    }
    
    @Override
    public l0<com.untis.mobile.persistence.realm.b> p1() {
        this.U.f().h();
        final l0<com.untis.mobile.persistence.realm.b> a0 = this.a0;
        if (a0 != null) {
            return a0;
        }
        return this.a0 = new l0<com.untis.mobile.persistence.realm.b>(com.untis.mobile.persistence.realm.b.class, this.U.g().p(this.T.k), this.U.f());
    }
    
    @Override
    public l0<com.untis.mobile.persistence.realm.b> r7() {
        this.U.f().h();
        final l0<com.untis.mobile.persistence.realm.b> y = this.Y;
        if (y != null) {
            return y;
        }
        return this.Y = new l0<com.untis.mobile.persistence.realm.b>(com.untis.mobile.persistence.realm.b.class, this.U.g().p(this.T.i), this.U.f());
    }
    
    @Override
    public String toString() {
        if (!p0.k8(this)) {
            return "Invalid object";
        }
        final StringBuilder sb = new StringBuilder("RealmClassbook = proxy[");
        sb.append("{id:");
        sb.append(this.a());
        sb.append("}");
        sb.append(",");
        sb.append("{students:");
        sb.append("RealmList<RealmLong>[");
        sb.append(this.p0().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{absences:");
        sb.append("RealmList<RealmLong>[");
        sb.append(this.V().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{events:");
        sb.append("RealmList<RealmLong>[");
        sb.append(this.X().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{exemptions:");
        sb.append("RealmList<RealmLong>[");
        sb.append(this.r7().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{prioritizedAttendances:");
        sb.append("RealmList<RealmPrioritizedAttendance>[");
        sb.append(this.R2().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{homeWorks:");
        sb.append("RealmList<RealmLong>[");
        sb.append(this.p1().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{absencesChecked:");
        sb.append(this.o3());
        sb.append("}");
        sb.append(",");
        sb.append("{synced:");
        sb.append(this.A());
        sb.append("}");
        sb.append(",");
        sb.append("{classRoles:");
        sb.append("RealmList<RealmClassRole>[");
        sb.append(this.Q7().size());
        sb.append("]");
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
    
    @Override
    public void u3(final l0<com.untis.mobile.persistence.realm.b> l0) {
        final boolean i = this.U.i();
        final int n = 0;
        int j = 0;
        l0<com.untis.mobile.persistence.realm.b> l2 = l0;
        if (i) {
            if (!this.U.d()) {
                return;
            }
            if (this.U.e().contains("exemptions")) {
                return;
            }
            if ((l2 = l0) != null) {
                l2 = l0;
                if (!l0.G0()) {
                    final f0 f0 = (f0)this.U.f();
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
        this.U.f().h();
        final OsList p = this.U.g().p(this.T.i);
        if (l2 != null && l2.size() == p.b0()) {
            while (j < l2.size()) {
                final com.untis.mobile.persistence.realm.b b3 = l2.get(j);
                this.U.c(b3);
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
                this.U.c(b4);
                p.l(((p)b4).S6().g().l0());
            }
        }
    }
    
    @Override
    public void x0(final l0<com.untis.mobile.persistence.realm.b> l0) {
        final boolean i = this.U.i();
        final int n = 0;
        int j = 0;
        l0<com.untis.mobile.persistence.realm.b> l2 = l0;
        if (i) {
            if (!this.U.d()) {
                return;
            }
            if (this.U.e().contains("absences")) {
                return;
            }
            if ((l2 = l0) != null) {
                l2 = l0;
                if (!l0.G0()) {
                    final f0 f0 = (f0)this.U.f();
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
        this.U.f().h();
        final OsList p = this.U.g().p(this.T.g);
        if (l2 != null && l2.size() == p.b0()) {
            while (j < l2.size()) {
                final com.untis.mobile.persistence.realm.b b3 = l2.get(j);
                this.U.c(b3);
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
                this.U.c(b4);
                p.l(((p)b4).S6().g().l0());
            }
        }
    }
    
    @Override
    public void y4() {
        if (this.U != null) {
            return;
        }
        final io.realm.a.h h = io.realm.a.W.get();
        this.T = (b)h.c();
        (this.U = new c0<i4.a>(this)).r(h.e());
        this.U.s(h.f());
        this.U.o(h.b());
        this.U.q(h.d());
    }
    
    public static final class a
    {
        public static final String a = "RealmClassbook";
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
            final OsObjectSchemaInfo b = osSchemaInfo.b("RealmClassbook");
            this.e = this.b("id", "id", b);
            this.f = this.b("students", "students", b);
            this.g = this.b("absences", "absences", b);
            this.h = this.b("events", "events", b);
            this.i = this.b("exemptions", "exemptions", b);
            this.j = this.b("prioritizedAttendances", "prioritizedAttendances", b);
            this.k = this.b("homeWorks", "homeWorks", b);
            this.l = this.b("absencesChecked", "absencesChecked", b);
            this.m = this.b("synced", "synced", b);
            this.n = this.b("classRoles", "classRoles", b);
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
