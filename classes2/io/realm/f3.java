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
import s4.b;

public class f3 extends s4.b implements p, g3
{
    private static final String R = "";
    private static final OsObjectSchemaInfo S;
    private b N;
    private c0<s4.b> O;
    private l0<com.untis.mobile.persistence.realm.b> P;
    private l0<com.untis.mobile.persistence.realm.b> Q;
    
    static {
        S = E8();
    }
    
    f3() {
        this.O.p();
    }
    
    public static s4.b A8(final f0 f0, final b b, final s4.b b2, final boolean b3, final Map<n0, p> map, final Set<q> set) {
        final f3 f2 = map.get(b2);
        if (f2 != null) {
            return f2;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(s4.b.class), set);
        osObjectBuilder.L(b.e, b2.a());
        osObjectBuilder.L(b.f, b2.a0());
        final f3 n8 = N8(f0, osObjectBuilder.f0());
        map.put(b2, n8);
        final l0<com.untis.mobile.persistence.realm.b> n9 = b2.N1();
        final int n10 = 0;
        if (n9 != null) {
            final l0<com.untis.mobile.persistence.realm.b> n11 = n8.N1();
            n11.clear();
            for (int i = 0; i < n9.size(); ++i) {
                final com.untis.mobile.persistence.realm.b b4 = n9.get(i);
                com.untis.mobile.persistence.realm.b v8 = (com.untis.mobile.persistence.realm.b)map.get(b4);
                if (v8 == null) {
                    v8 = z0.v8(f0, (z0.b)f0.H().j(com.untis.mobile.persistence.realm.b.class), b4, b3, map, set);
                }
                n11.add(v8);
            }
        }
        final l0<com.untis.mobile.persistence.realm.b> p6 = b2.p5();
        if (p6 != null) {
            final l0<com.untis.mobile.persistence.realm.b> p7 = n8.p5();
            p7.clear();
            for (int j = n10; j < p6.size(); ++j) {
                final com.untis.mobile.persistence.realm.b b5 = p6.get(j);
                com.untis.mobile.persistence.realm.b v9 = (com.untis.mobile.persistence.realm.b)map.get(b5);
                if (v9 == null) {
                    v9 = z0.v8(f0, (z0.b)f0.H().j(com.untis.mobile.persistence.realm.b.class), b5, b3, map, set);
                }
                p7.add(v9);
            }
        }
        return n8;
    }
    
    public static s4.b B8(final f0 f0, final b b, final s4.b b2, final boolean b3, final Map<n0, p> map, final Set<q> set) {
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
            return (s4.b)p7;
        }
        final p p8 = null;
        Object x2 = null;
        boolean b4 = false;
        Label_0232: {
            if (b3) {
                x2 = f0.x2(s4.b.class);
                final long r = ((Table)x2).r(b.e, b2.a());
                if (r == -1L) {
                    b4 = false;
                    x2 = p8;
                    break Label_0232;
                }
                try {
                    h.g(f0, ((Table)x2).R(r), b, false, Collections.emptyList());
                    x2 = new f3();
                    map.put(b2, (p)x2);
                }
                finally {
                    h.a();
                }
            }
            b4 = b3;
        }
        s4.b b5;
        if (b4) {
            b5 = O8(f0, b, (s4.b)x2, b2, map, set);
        }
        else {
            b5 = A8(f0, b, b2, b3, map, set);
        }
        return b5;
    }
    
    public static b C8(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static s4.b D8(final s4.b b, final int a, final int n, final Map<n0, p.a<n0>> map) {
        if (a <= n && b != null) {
            final p.a a2 = map.get(b);
            s4.b b2;
            if (a2 == null) {
                b2 = new s4.b();
                map.put(b, (p.a<n0>)new p.a(a, b2));
            }
            else {
                if (a >= a2.a) {
                    return (s4.b)a2.b;
                }
                b2 = (s4.b)a2.b;
                a2.a = a;
            }
            b2.b(b.a());
            b2.u0(b.a0());
            final int n2 = 0;
            if (a == n) {
                b2.p6(null);
            }
            else {
                final l0<com.untis.mobile.persistence.realm.b> n3 = b.N1();
                final l0<com.untis.mobile.persistence.realm.b> l0 = new l0<com.untis.mobile.persistence.realm.b>();
                b2.p6(l0);
                for (int size = n3.size(), i = 0; i < size; ++i) {
                    l0.add(z0.x8(n3.get(i), a + 1, n, map));
                }
            }
            if (a == n) {
                b2.j3(null);
            }
            else {
                final l0<com.untis.mobile.persistence.realm.b> p4 = b.p5();
                final l0<com.untis.mobile.persistence.realm.b> l2 = new l0<com.untis.mobile.persistence.realm.b>();
                b2.j3(l2);
                for (int size2 = p4.size(), j = n2; j < size2; ++j) {
                    l2.add(z0.x8(p4.get(j), a + 1, n, map));
                }
            }
            return b2;
        }
        return null;
    }
    
    private static OsObjectSchemaInfo E8() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmInfoCenterLesson", false, 4, 0);
        final RealmFieldType integer = RealmFieldType.INTEGER;
        b.c("", "id", integer, true, false, true);
        b.c("", "subjectId", integer, false, false, true);
        final RealmFieldType list = RealmFieldType.LIST;
        b.b("", "klassenIds", list, "RealmLong");
        b.b("", "teacherIds", list, "RealmLong");
        return b.e();
    }
    
    public static s4.b F8(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final ArrayList<String> list = new ArrayList<String>(2);
        Object x2 = null;
        Label_0146: {
            if (b) {
                x2 = f0.x2(s4.b.class);
                final long e = ((b)f0.H().j(s4.b.class)).e;
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
                        h.g(f0, ((Table)x2).R(r), f0.H().j(s4.b.class), false, Collections.emptyList());
                        x2 = new f3();
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
            if (jsonObject.has("klassenIds")) {
                list.add("klassenIds");
            }
            if (jsonObject.has("teacherIds")) {
                list.add("teacherIds");
            }
            if (!jsonObject.has("id")) {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
            f3 f2;
            if (jsonObject.isNull("id")) {
                f2 = f0.p1((Class<f3>)s4.b.class, null, true, list);
            }
            else {
                f2 = f0.p1((Class<f3>)s4.b.class, jsonObject.getLong("id"), true, list);
            }
            o = f2;
        }
        if (jsonObject.has("subjectId")) {
            if (jsonObject.isNull("subjectId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'subjectId' to null.");
            }
            ((g3)o).u0(jsonObject.getLong("subjectId"));
        }
        final boolean has = jsonObject.has("klassenIds");
        final int n = 0;
        if (has) {
            if (jsonObject.isNull("klassenIds")) {
                ((g3)o).p6(null);
            }
            else {
                ((g3)o).N1().clear();
                final JSONArray jsonArray = jsonObject.getJSONArray("klassenIds");
                for (int i = 0; i < jsonArray.length(); ++i) {
                    ((g3)o).N1().add(z0.z8(f0, jsonArray.getJSONObject(i), b));
                }
            }
        }
        if (jsonObject.has("teacherIds")) {
            if (jsonObject.isNull("teacherIds")) {
                ((g3)o).j3(null);
            }
            else {
                ((g3)o).p5().clear();
                final JSONArray jsonArray2 = jsonObject.getJSONArray("teacherIds");
                for (int j = n; j < jsonArray2.length(); ++j) {
                    ((g3)o).p5().add(z0.z8(f0, jsonArray2.getJSONObject(j), b));
                }
            }
        }
        return (s4.b)o;
    }
    
    @TargetApi(11)
    public static s4.b G8(final f0 f0, final JsonReader jsonReader) throws IOException {
        final s4.b b = new s4.b();
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
            else if (nextName.equals("subjectId")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'subjectId' to null.");
                }
                b.u0(jsonReader.nextLong());
            }
            else {
                if (nextName.equals("klassenIds")) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.skipValue();
                        b.p6(null);
                        continue;
                    }
                    b.p6(new l0<com.untis.mobile.persistence.realm.b>());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        b.N1().add(z0.A8(f0, jsonReader));
                    }
                }
                else {
                    if (!nextName.equals("teacherIds")) {
                        jsonReader.skipValue();
                        continue;
                    }
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.skipValue();
                        b.j3(null);
                        continue;
                    }
                    b.j3(new l0<com.untis.mobile.persistence.realm.b>());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        b.p5().add(z0.A8(f0, jsonReader));
                    }
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
        if (b2) {
            return f0.G0(b, new q[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }
    
    public static OsObjectSchemaInfo H8() {
        return f3.S;
    }
    
    public static String I8() {
        return "RealmInfoCenterLesson";
    }
    
    public static long J8(final f0 f0, final s4.b b, final Map<n0, Long> map) {
        if (b instanceof p && !p0.h8(b)) {
            final p p3 = (p)b;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(s4.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b2 = (b)f0.H().j(s4.b.class);
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
        Table.nativeSetLong(nativePtr, b2.f, l, b.a0(), false);
        final l0<com.untis.mobile.persistence.realm.b> n1 = b.N1();
        if (n1 != null) {
            final OsList list = new OsList(x2.R(l), b2.g);
            for (final com.untis.mobile.persistence.realm.b b3 : n1) {
                Long value2;
                if ((value2 = map.get(b3)) == null) {
                    value2 = z0.D8(f0, b3, map);
                }
                list.l(value2);
            }
        }
        final l0<com.untis.mobile.persistence.realm.b> p4 = b.p5();
        if (p4 != null) {
            final OsList list2 = new OsList(x2.R(l), b2.h);
            for (final com.untis.mobile.persistence.realm.b b4 : p4) {
                Long value3;
                if ((value3 = map.get(b4)) == null) {
                    value3 = z0.D8(f0, b4, map);
                }
                list2.l(value3);
            }
        }
        return l;
    }
    
    public static void K8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(s4.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(s4.b.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final s4.b b2 = (s4.b)iterator.next();
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
            Table.nativeSetLong(nativePtr, b.f, l, b2.a0(), false);
            final l0<com.untis.mobile.persistence.realm.b> n1 = b2.N1();
            if (n1 != null) {
                final OsList list = new OsList(x2.R(l), b.g);
                for (final com.untis.mobile.persistence.realm.b b3 : n1) {
                    Long value2;
                    if ((value2 = map.get(b3)) == null) {
                        value2 = z0.D8(f0, b3, map);
                    }
                    list.l(value2);
                }
            }
            final l0<com.untis.mobile.persistence.realm.b> p4 = b2.p5();
            if (p4 == null) {
                continue;
            }
            final OsList list2 = new OsList(x2.R(l), b.h);
            for (final com.untis.mobile.persistence.realm.b b4 : p4) {
                Long value3;
                if ((value3 = map.get(b4)) == null) {
                    value3 = z0.D8(f0, b4, map);
                }
                list2.l(value3);
            }
        }
    }
    
    public static long L8(final f0 f0, final s4.b b, final Map<n0, Long> map) {
        if (b instanceof p && !p0.h8(b)) {
            final p p3 = (p)b;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(s4.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b2 = (b)f0.H().j(s4.b.class);
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
        Table.nativeSetLong(nativePtr, b2.f, rowWithPrimaryKey, b.a0(), false);
        final OsList list = new OsList(x2.R(rowWithPrimaryKey), b2.g);
        final l0<com.untis.mobile.persistence.realm.b> n1 = b.N1();
        final int n2 = 0;
        if (n1 != null && n1.size() == list.b0()) {
            for (int size = n1.size(), i = 0; i < size; ++i) {
                final com.untis.mobile.persistence.realm.b b3 = n1.get(i);
                Long value;
                if ((value = map.get(b3)) == null) {
                    value = z0.F8(f0, b3, map);
                }
                list.Z(i, value);
            }
        }
        else {
            list.M();
            if (n1 != null) {
                for (final com.untis.mobile.persistence.realm.b b4 : n1) {
                    Long value2;
                    if ((value2 = map.get(b4)) == null) {
                        value2 = z0.F8(f0, b4, map);
                    }
                    list.l(value2);
                }
            }
        }
        final OsList list2 = new OsList(x2.R(rowWithPrimaryKey), b2.h);
        final l0<com.untis.mobile.persistence.realm.b> p4 = b.p5();
        if (p4 != null && p4.size() == list2.b0()) {
            for (int size2 = p4.size(), j = n2; j < size2; ++j) {
                final com.untis.mobile.persistence.realm.b b5 = p4.get(j);
                Long value3;
                if ((value3 = map.get(b5)) == null) {
                    value3 = z0.F8(f0, b5, map);
                }
                list2.Z(j, value3);
            }
        }
        else {
            list2.M();
            if (p4 != null) {
                for (final com.untis.mobile.persistence.realm.b b6 : p4) {
                    Long value4;
                    if ((value4 = map.get(b6)) == null) {
                        value4 = z0.F8(f0, b6, map);
                    }
                    list2.l(value4);
                }
            }
        }
        return rowWithPrimaryKey;
    }
    
    public static void M8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        Table x2 = f0.x2(s4.b.class);
        final long nativePtr = x2.getNativePtr();
        b b = (b)f0.H().j(s4.b.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final s4.b b2 = (s4.b)iterator.next();
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
            Table.nativeSetLong(nativePtr, b.f, rowWithPrimaryKey, b2.a0(), false);
            final OsList list = new OsList(x2.R(rowWithPrimaryKey), b.g);
            final l0<com.untis.mobile.persistence.realm.b> n1 = b2.N1();
            if (n1 != null && n1.size() == list.b0()) {
                for (int size = n1.size(), i = 0; i < size; ++i) {
                    final com.untis.mobile.persistence.realm.b b3 = n1.get(i);
                    Long value;
                    if ((value = map.get(b3)) == null) {
                        value = z0.F8(f0, b3, map);
                    }
                    list.Z(i, value);
                }
            }
            else {
                list.M();
                if (n1 != null) {
                    for (final com.untis.mobile.persistence.realm.b b4 : n1) {
                        Long value2;
                        if ((value2 = map.get(b4)) == null) {
                            value2 = z0.F8(f0, b4, map);
                        }
                        list.l(value2);
                    }
                }
            }
            final OsList list2 = new OsList(x2.R(rowWithPrimaryKey), b.h);
            final l0<com.untis.mobile.persistence.realm.b> p4 = b2.p5();
            if (p4 != null && p4.size() == list2.b0()) {
                for (int size2 = p4.size(), j = 0; j < size2; ++j) {
                    final com.untis.mobile.persistence.realm.b b5 = p4.get(j);
                    Long value3;
                    if ((value3 = map.get(b5)) == null) {
                        value3 = z0.F8(f0, b5, map);
                    }
                    list2.Z(j, value3);
                }
            }
            else {
                final b b6 = b;
                final Table table = x2;
                list2.M();
                x2 = table;
                b = b6;
                if (p4 == null) {
                    continue;
                }
                final Iterator<com.untis.mobile.persistence.realm.b> iterator3 = p4.iterator();
                while (true) {
                    x2 = table;
                    b = b6;
                    if (!iterator3.hasNext()) {
                        break;
                    }
                    final com.untis.mobile.persistence.realm.b b7 = iterator3.next();
                    Long value4;
                    if ((value4 = map.get(b7)) == null) {
                        value4 = z0.F8(f0, b7, map);
                    }
                    list2.l(value4);
                }
            }
        }
    }
    
    static f3 N8(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(s4.b.class), false, Collections.emptyList());
        final f3 f3 = new f3();
        h.a();
        return f3;
    }
    
    static s4.b O8(final f0 f0, final b b, final s4.b b2, final s4.b b3, final Map<n0, p> map, final Set<q> set) {
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(s4.b.class), set);
        osObjectBuilder.L(b.e, b3.a());
        osObjectBuilder.L(b.f, b3.a0());
        final l0<com.untis.mobile.persistence.realm.b> n1 = b3.N1();
        final int n2 = 0;
        if (n1 != null) {
            final l0<n0> l0 = new l0<n0>();
            for (int i = 0; i < n1.size(); ++i) {
                final com.untis.mobile.persistence.realm.b b4 = n1.get(i);
                com.untis.mobile.persistence.realm.b v8 = (com.untis.mobile.persistence.realm.b)map.get(b4);
                if (v8 == null) {
                    v8 = z0.v8(f0, (z0.b)f0.H().j(com.untis.mobile.persistence.realm.b.class), b4, true, map, set);
                }
                l0.add(v8);
            }
            osObjectBuilder.Z(b.g, l0);
        }
        else {
            osObjectBuilder.Z(b.g, new l0<n0>());
        }
        final l0<com.untis.mobile.persistence.realm.b> p6 = b3.p5();
        if (p6 != null) {
            final l0<n0> l2 = new l0<n0>();
            for (int j = n2; j < p6.size(); ++j) {
                final com.untis.mobile.persistence.realm.b b5 = p6.get(j);
                com.untis.mobile.persistence.realm.b v9 = (com.untis.mobile.persistence.realm.b)map.get(b5);
                if (v9 == null) {
                    v9 = z0.v8(f0, (z0.b)f0.H().j(com.untis.mobile.persistence.realm.b.class), b5, true, map, set);
                }
                l2.add(v9);
            }
            osObjectBuilder.Z(b.h, l2);
        }
        else {
            osObjectBuilder.Z(b.h, new l0<n0>());
        }
        osObjectBuilder.i0();
        return b2;
    }
    
    @Override
    public l0<com.untis.mobile.persistence.realm.b> N1() {
        this.O.f().h();
        final l0<com.untis.mobile.persistence.realm.b> p = this.P;
        if (p != null) {
            return p;
        }
        return this.P = new l0<com.untis.mobile.persistence.realm.b>(com.untis.mobile.persistence.realm.b.class, this.O.g().p(this.N.g), this.O.f());
    }
    
    @Override
    public c0<?> S6() {
        return this.O;
    }
    
    @Override
    public long a() {
        this.O.f().h();
        return this.O.g().m(this.N.e);
    }
    
    @Override
    public long a0() {
        this.O.f().h();
        return this.O.g().m(this.N.f);
    }
    
    @Override
    public void b(final long n) {
        if (this.O.i()) {
            return;
        }
        this.O.f().h();
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
        final f3 f3 = (f3)o;
        final io.realm.a f4 = this.O.f();
        final io.realm.a f5 = f3.O.f();
        final String path = f4.getPath();
        final String path2 = f5.getPath();
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
        if (f4.N() != f5.N()) {
            return false;
        }
        if (!f4.K.getVersionID().equals(f5.K.getVersionID())) {
            return false;
        }
        final String m = this.O.g().g().M();
        final String i = f3.O.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.O.g().l0() == f3.O.g().l0();
            }
        }
        else if (i == null) {
            return this.O.g().l0() == f3.O.g().l0();
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
    public void j3(final l0<com.untis.mobile.persistence.realm.b> l0) {
        final boolean i = this.O.i();
        final int n = 0;
        int j = 0;
        l0<com.untis.mobile.persistence.realm.b> l2 = l0;
        if (i) {
            if (!this.O.d()) {
                return;
            }
            if (this.O.e().contains("teacherIds")) {
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
    public l0<com.untis.mobile.persistence.realm.b> p5() {
        this.O.f().h();
        final l0<com.untis.mobile.persistence.realm.b> q = this.Q;
        if (q != null) {
            return q;
        }
        return this.Q = new l0<com.untis.mobile.persistence.realm.b>(com.untis.mobile.persistence.realm.b.class, this.O.g().p(this.N.h), this.O.f());
    }
    
    @Override
    public void p6(final l0<com.untis.mobile.persistence.realm.b> l0) {
        final boolean i = this.O.i();
        final int n = 0;
        int j = 0;
        l0<com.untis.mobile.persistence.realm.b> l2 = l0;
        if (i) {
            if (!this.O.d()) {
                return;
            }
            if (this.O.e().contains("klassenIds")) {
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
    public String toString() {
        if (!p0.k8(this)) {
            return "Invalid object";
        }
        final StringBuilder sb = new StringBuilder("RealmInfoCenterLesson = proxy[");
        sb.append("{id:");
        sb.append(this.a());
        sb.append("}");
        sb.append(",");
        sb.append("{subjectId:");
        sb.append(this.a0());
        sb.append("}");
        sb.append(",");
        sb.append("{klassenIds:");
        sb.append("RealmList<RealmLong>[");
        sb.append(this.N1().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{teacherIds:");
        sb.append("RealmList<RealmLong>[");
        sb.append(this.p5().size());
        sb.append("]");
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
    
    @Override
    public void u0(final long n) {
        if (!this.O.i()) {
            this.O.f().h();
            this.O.g().s(this.N.f, n);
            return;
        }
        if (!this.O.d()) {
            return;
        }
        final r g = this.O.g();
        g.g().q0(this.N.f, g.l0(), n, true);
    }
    
    @Override
    public void y4() {
        if (this.O != null) {
            return;
        }
        final io.realm.a.h h = io.realm.a.W.get();
        this.N = (b)h.c();
        (this.O = new c0<s4.b>(this)).r(h.e());
        this.O.s(h.f());
        this.O.o(h.b());
        this.O.q(h.d());
    }
    
    public static final class a
    {
        public static final String a = "RealmInfoCenterLesson";
    }
    
    static final class b extends c
    {
        long e;
        long f;
        long g;
        long h;
        
        b(final OsSchemaInfo osSchemaInfo) {
            super(4);
            final OsObjectSchemaInfo b = osSchemaInfo.b("RealmInfoCenterLesson");
            this.e = this.b("id", "id", b);
            this.f = this.b("subjectId", "subjectId", b);
            this.g = this.b("klassenIds", "klassenIds", b);
            this.h = this.b("teacherIds", "teacherIds", b);
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
