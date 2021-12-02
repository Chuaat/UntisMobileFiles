// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import io.realm.exceptions.RealmException;
import io.realm.internal.c;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Set;
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
import io.realm.internal.r;
import java.util.Collections;
import java.util.ArrayList;
import org.json.JSONObject;
import java.util.Map;
import io.realm.internal.OsSchemaInfo;
import r4.d;
import r4.b;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.p;
import r4.a;

public class z2 extends r4.a implements p, a3
{
    private static final String Q = "";
    private static final OsObjectSchemaInfo R;
    private b M;
    private c0<r4.a> N;
    private l0<r4.b> O;
    private l0<d> P;
    
    static {
        R = C8();
    }
    
    z2() {
        this.N.p();
    }
    
    public static b A8(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static r4.a B8(final r4.a a, final int a2, final int n, final Map<n0, p.a<n0>> map) {
        if (a2 <= n && a != null) {
            final p.a a3 = map.get(a);
            r4.a a4;
            if (a3 == null) {
                a4 = new r4.a();
                map.put(a, (p.a<n0>)new p.a(a2, a4));
            }
            else {
                if (a2 >= a3.a) {
                    return (r4.a)a3.b;
                }
                a4 = (r4.a)a3.b;
                a3.a = a2;
            }
            a4.h1(a.E0());
            final int n2 = 0;
            if (a2 == n) {
                a4.o0(null);
            }
            else {
                final l0<r4.b> x = a.X();
                final l0<r4.b> l0 = new l0<r4.b>();
                a4.o0(l0);
                for (int size = x.size(), i = 0; i < size; ++i) {
                    l0.add(v2.H8(x.get(i), a2 + 1, n, map));
                }
            }
            if (a2 == n) {
                a4.x0(null);
            }
            else {
                final l0<d> v = a.V();
                final l0<d> l2 = new l0<d>();
                a4.x0(l2);
                for (int size2 = v.size(), j = n2; j < size2; ++j) {
                    l2.add(b3.L8(v.get(j), a2 + 1, n, map));
                }
            }
            return a4;
        }
        return null;
    }
    
    private static OsObjectSchemaInfo C8() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmClassLead", false, 3, 0);
        b.c("", "klassenId", RealmFieldType.INTEGER, true, false, true);
        final RealmFieldType list = RealmFieldType.LIST;
        b.b("", "events", list, "RealmClassLeadEvent");
        b.b("", "absences", list, "RealmClassLeadStudentAbsence");
        return b.e();
    }
    
    public static r4.a D8(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final ArrayList<String> list = new ArrayList<String>(2);
        Object x2 = null;
        Label_0144: {
            if (b) {
                x2 = f0.x2(r4.a.class);
                final long e = ((b)f0.H().j(r4.a.class)).e;
                long r;
                if (!jsonObject.isNull("klassenId")) {
                    r = ((Table)x2).r(e, jsonObject.getLong("klassenId"));
                }
                else {
                    r = -1L;
                }
                if (r != -1L) {
                    final io.realm.a.h h = io.realm.a.W.get();
                    try {
                        h.g(f0, ((Table)x2).R(r), f0.H().j(r4.a.class), false, Collections.emptyList());
                        x2 = new z2();
                        break Label_0144;
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
            if (jsonObject.has("events")) {
                list.add("events");
            }
            if (jsonObject.has("absences")) {
                list.add("absences");
            }
            if (!jsonObject.has("klassenId")) {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'klassenId'.");
            }
            z2 z2;
            if (jsonObject.isNull("klassenId")) {
                z2 = f0.p1((Class<z2>)r4.a.class, null, true, list);
            }
            else {
                z2 = f0.p1((Class<z2>)r4.a.class, jsonObject.getLong("klassenId"), true, list);
            }
            o = z2;
        }
        final boolean has = jsonObject.has("events");
        final int n = 0;
        if (has) {
            if (jsonObject.isNull("events")) {
                ((a3)o).o0(null);
            }
            else {
                ((a3)o).X().clear();
                final JSONArray jsonArray = jsonObject.getJSONArray("events");
                for (int i = 0; i < jsonArray.length(); ++i) {
                    ((a3)o).X().add(v2.J8(f0, jsonArray.getJSONObject(i), b));
                }
            }
        }
        if (jsonObject.has("absences")) {
            if (jsonObject.isNull("absences")) {
                ((a3)o).x0(null);
            }
            else {
                ((a3)o).V().clear();
                final JSONArray jsonArray2 = jsonObject.getJSONArray("absences");
                for (int j = n; j < jsonArray2.length(); ++j) {
                    ((a3)o).V().add(b3.N8(f0, jsonArray2.getJSONObject(j), b));
                }
            }
        }
        return (r4.a)o;
    }
    
    @TargetApi(11)
    public static r4.a E8(final f0 f0, final JsonReader jsonReader) throws IOException {
        final r4.a a = new r4.a();
        jsonReader.beginObject();
        boolean b = false;
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            if (nextName.equals("klassenId")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'klassenId' to null.");
                }
                a.h1(jsonReader.nextLong());
                b = true;
            }
            else {
                if (nextName.equals("events")) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.skipValue();
                        a.o0(null);
                        continue;
                    }
                    a.o0(new l0<r4.b>());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        a.X().add(v2.K8(f0, jsonReader));
                    }
                }
                else {
                    if (!nextName.equals("absences")) {
                        jsonReader.skipValue();
                        continue;
                    }
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.skipValue();
                        a.x0(null);
                        continue;
                    }
                    a.x0(new l0<d>());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        a.V().add(b3.O8(f0, jsonReader));
                    }
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
        if (b) {
            return f0.G0(a, new q[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'klassenId'.");
    }
    
    public static OsObjectSchemaInfo F8() {
        return z2.R;
    }
    
    public static String G8() {
        return "RealmClassLead";
    }
    
    public static long H8(final f0 f0, final r4.a a, final Map<n0, Long> map) {
        if (a instanceof p && !p0.h8(a)) {
            final p p3 = (p)a;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(r4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(r4.a.class);
        final long e = b.e;
        final Long value = a.E0();
        long l;
        if (value != null) {
            l = Table.nativeFindFirstInt(nativePtr, e, a.E0());
        }
        else {
            l = -1L;
        }
        if (l == -1L) {
            l = OsObject.createRowWithPrimaryKey(x2, e, a.E0());
        }
        else {
            Table.v0(value);
        }
        map.put(a, l);
        final l0<r4.b> x3 = a.X();
        if (x3 != null) {
            final OsList list = new OsList(x2.R(l), b.f);
            for (final r4.b b2 : x3) {
                Long value2;
                if ((value2 = map.get(b2)) == null) {
                    value2 = v2.N8(f0, b2, map);
                }
                list.l(value2);
            }
        }
        final l0<d> v = a.V();
        if (v != null) {
            final OsList list2 = new OsList(x2.R(l), b.g);
            for (final d d : v) {
                Long value3;
                if ((value3 = map.get(d)) == null) {
                    value3 = b3.R8(f0, d, map);
                }
                list2.l(value3);
            }
        }
        return l;
    }
    
    public static void I8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(r4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(r4.a.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final r4.a a = (r4.a)iterator.next();
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
            final Long value = a.E0();
            long l;
            if (value != null) {
                l = Table.nativeFindFirstInt(nativePtr, e, a.E0());
            }
            else {
                l = -1L;
            }
            if (l == -1L) {
                l = OsObject.createRowWithPrimaryKey(x2, e, a.E0());
            }
            else {
                Table.v0(value);
            }
            map.put(a, l);
            final l0<r4.b> x3 = a.X();
            if (x3 != null) {
                final OsList list = new OsList(x2.R(l), b.f);
                for (final r4.b b2 : x3) {
                    Long value2;
                    if ((value2 = map.get(b2)) == null) {
                        value2 = v2.N8(f0, b2, map);
                    }
                    list.l(value2);
                }
            }
            final l0<d> v = a.V();
            if (v == null) {
                continue;
            }
            final OsList list2 = new OsList(x2.R(l), b.g);
            for (final d d : v) {
                Long value3;
                if ((value3 = map.get(d)) == null) {
                    value3 = b3.R8(f0, d, map);
                }
                list2.l(value3);
            }
        }
    }
    
    public static long J8(final f0 f0, final r4.a a, final Map<n0, Long> map) {
        if (a instanceof p && !p0.h8(a)) {
            final p p3 = (p)a;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(r4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(r4.a.class);
        final long e = b.e;
        long nativeFindFirstInt;
        if (Long.valueOf(a.E0()) != null) {
            nativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, e, a.E0());
        }
        else {
            nativeFindFirstInt = -1L;
        }
        long rowWithPrimaryKey = nativeFindFirstInt;
        if (nativeFindFirstInt == -1L) {
            rowWithPrimaryKey = OsObject.createRowWithPrimaryKey(x2, e, a.E0());
        }
        map.put(a, rowWithPrimaryKey);
        final OsList list = new OsList(x2.R(rowWithPrimaryKey), b.f);
        final l0<r4.b> x3 = a.X();
        final int n = 0;
        if (x3 != null && x3.size() == list.b0()) {
            for (int size = x3.size(), i = 0; i < size; ++i) {
                final r4.b b2 = x3.get(i);
                Long value;
                if ((value = map.get(b2)) == null) {
                    value = v2.P8(f0, b2, map);
                }
                list.Z(i, value);
            }
        }
        else {
            list.M();
            if (x3 != null) {
                for (final r4.b b3 : x3) {
                    Long value2;
                    if ((value2 = map.get(b3)) == null) {
                        value2 = v2.P8(f0, b3, map);
                    }
                    list.l(value2);
                }
            }
        }
        final OsList list2 = new OsList(x2.R(rowWithPrimaryKey), b.g);
        final l0<d> v = a.V();
        if (v != null && v.size() == list2.b0()) {
            for (int size2 = v.size(), j = n; j < size2; ++j) {
                final d d = v.get(j);
                Long value3;
                if ((value3 = map.get(d)) == null) {
                    value3 = b3.T8(f0, d, map);
                }
                list2.Z(j, value3);
            }
        }
        else {
            list2.M();
            if (v != null) {
                for (final d d2 : v) {
                    Long value4;
                    if ((value4 = map.get(d2)) == null) {
                        value4 = b3.T8(f0, d2, map);
                    }
                    list2.l(value4);
                }
            }
        }
        return rowWithPrimaryKey;
    }
    
    public static void K8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(r4.a.class);
        long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(r4.a.class);
        long e = b.e;
        while (iterator.hasNext()) {
            final r4.a a = (r4.a)iterator.next();
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
            if (Long.valueOf(a.E0()) != null) {
                nativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, e, a.E0());
            }
            else {
                nativeFindFirstInt = -1L;
            }
            long rowWithPrimaryKey = nativeFindFirstInt;
            if (nativeFindFirstInt == -1L) {
                rowWithPrimaryKey = OsObject.createRowWithPrimaryKey(x2, e, a.E0());
            }
            map.put(a, rowWithPrimaryKey);
            final OsList list = new OsList(x2.R(rowWithPrimaryKey), b.f);
            final l0<r4.b> x3 = a.X();
            if (x3 != null && x3.size() == list.b0()) {
                for (int size = x3.size(), i = 0; i < size; ++i) {
                    final r4.b b2 = x3.get(i);
                    Long value;
                    if ((value = map.get(b2)) == null) {
                        value = v2.P8(f0, b2, map);
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
                if (x3 != null) {
                    final Iterator<r4.b> iterator2 = x3.iterator();
                    while (true) {
                        nativePtr = n;
                        e = n2;
                        if (!iterator2.hasNext()) {
                            break;
                        }
                        final r4.b b3 = iterator2.next();
                        Long value2;
                        if ((value2 = map.get(b3)) == null) {
                            value2 = v2.P8(f0, b3, map);
                        }
                        list.l(value2);
                    }
                }
            }
            final OsList list2 = new OsList(x2.R(rowWithPrimaryKey), b.g);
            final l0<d> v = a.V();
            if (v != null && v.size() == list2.b0()) {
                for (int size2 = v.size(), j = 0; j < size2; ++j) {
                    final d d = v.get(j);
                    Long value3;
                    if ((value3 = map.get(d)) == null) {
                        value3 = b3.T8(f0, d, map);
                    }
                    list2.Z(j, value3);
                }
            }
            else {
                list2.M();
                if (v == null) {
                    continue;
                }
                for (final d d2 : v) {
                    Long value4;
                    if ((value4 = map.get(d2)) == null) {
                        value4 = b3.T8(f0, d2, map);
                    }
                    list2.l(value4);
                }
            }
        }
    }
    
    static z2 L8(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(r4.a.class), false, Collections.emptyList());
        final z2 z2 = new z2();
        h.a();
        return z2;
    }
    
    static r4.a M8(final f0 f0, final b b, final r4.a a, final r4.a a2, final Map<n0, p> map, final Set<q> set) {
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(r4.a.class), set);
        osObjectBuilder.L(b.e, a2.E0());
        final l0<r4.b> x = a2.X();
        final int n = 0;
        if (x != null) {
            final l0<n0> l0 = new l0<n0>();
            for (int i = 0; i < x.size(); ++i) {
                final r4.b b2 = x.get(i);
                r4.b f2 = (r4.b)map.get(b2);
                if (f2 == null) {
                    f2 = v2.F8(f0, (v2.b)f0.H().j(r4.b.class), b2, true, map, set);
                }
                l0.add(f2);
            }
            osObjectBuilder.Z(b.f, l0);
        }
        else {
            osObjectBuilder.Z(b.f, new l0<n0>());
        }
        final l0<d> v = a2.V();
        if (v != null) {
            final l0<n0> l2 = new l0<n0>();
            for (int j = n; j < v.size(); ++j) {
                final d d = v.get(j);
                d j2 = (d)map.get(d);
                if (j2 == null) {
                    j2 = b3.J8(f0, (b3.b)f0.H().j(d.class), d, true, map, set);
                }
                l2.add(j2);
            }
            osObjectBuilder.Z(b.g, l2);
        }
        else {
            osObjectBuilder.Z(b.g, new l0<n0>());
        }
        osObjectBuilder.i0();
        return a;
    }
    
    public static r4.a y8(final f0 f0, final b b, final r4.a a, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        final z2 z2 = map.get(a);
        if (z2 != null) {
            return z2;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(r4.a.class), set);
        osObjectBuilder.L(b.e, a.E0());
        final z2 l8 = L8(f0, osObjectBuilder.f0());
        map.put(a, l8);
        final l0<r4.b> x = a.X();
        final int n = 0;
        if (x != null) {
            final l0<r4.b> x2 = l8.X();
            x2.clear();
            for (int i = 0; i < x.size(); ++i) {
                final r4.b b3 = x.get(i);
                r4.b f2 = (r4.b)map.get(b3);
                if (f2 == null) {
                    f2 = v2.F8(f0, (v2.b)f0.H().j(r4.b.class), b3, b2, map, set);
                }
                x2.add(f2);
            }
        }
        final l0<d> v = a.V();
        if (v != null) {
            final l0<d> v2 = l8.V();
            v2.clear();
            for (int j = n; j < v.size(); ++j) {
                final d d = v.get(j);
                d j2 = (d)map.get(d);
                if (j2 == null) {
                    j2 = b3.J8(f0, (b3.b)f0.H().j(d.class), d, b2, map, set);
                }
                v2.add(j2);
            }
        }
        return l8;
    }
    
    public static r4.a z8(final f0 f0, final b b, final r4.a a, final boolean b2, final Map<n0, p> map, final Set<q> set) {
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
            return (r4.a)p7;
        }
        final p p8 = null;
        Object x2 = null;
        boolean b3 = false;
        Label_0233: {
            if (b2) {
                x2 = f0.x2(r4.a.class);
                final long r = ((Table)x2).r(b.e, a.E0());
                if (r == -1L) {
                    b3 = false;
                    x2 = p8;
                    break Label_0233;
                }
                try {
                    h.g(f0, ((Table)x2).R(r), b, false, Collections.emptyList());
                    x2 = new z2();
                    map.put(a, (p)x2);
                }
                finally {
                    h.a();
                }
            }
            b3 = b2;
        }
        r4.a a2;
        if (b3) {
            a2 = M8(f0, b, (r4.a)x2, a, map, set);
        }
        else {
            a2 = y8(f0, b, a, b2, map, set);
        }
        return a2;
    }
    
    @Override
    public long E0() {
        this.N.f().h();
        return this.N.g().m(this.M.e);
    }
    
    @Override
    public c0<?> S6() {
        return this.N;
    }
    
    @Override
    public l0<d> V() {
        this.N.f().h();
        final l0<d> p = this.P;
        if (p != null) {
            return p;
        }
        return this.P = new l0<d>(d.class, this.N.g().p(this.M.g), this.N.f());
    }
    
    @Override
    public l0<r4.b> X() {
        this.N.f().h();
        final l0<r4.b> o = this.O;
        if (o != null) {
            return o;
        }
        return this.O = new l0<r4.b>(r4.b.class, this.N.g().p(this.M.f), this.N.f());
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final z2 z2 = (z2)o;
        final io.realm.a f = this.N.f();
        final io.realm.a f2 = z2.N.f();
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
        final String m = this.N.g().g().M();
        final String i = z2.N.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.N.g().l0() == z2.N.g().l0();
            }
        }
        else if (i == null) {
            return this.N.g().l0() == z2.N.g().l0();
        }
        return false;
    }
    
    @Override
    public void h1(final long n) {
        if (this.N.i()) {
            return;
        }
        this.N.f().h();
        throw new RealmException("Primary key field 'klassenId' cannot be changed after object was created.");
    }
    
    @Override
    public int hashCode() {
        final String path = this.N.f().getPath();
        final String m = this.N.g().g().M();
        final long l0 = this.N.g().l0();
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
    public void o0(final l0<r4.b> l0) {
        final boolean i = this.N.i();
        final int n = 0;
        int j = 0;
        l0<r4.b> l2 = l0;
        if (i) {
            if (!this.N.d()) {
                return;
            }
            if (this.N.e().contains("events")) {
                return;
            }
            if ((l2 = l0) != null) {
                l2 = l0;
                if (!l0.G0()) {
                    final f0 f0 = (f0)this.N.f();
                    l2 = new l0<r4.b>();
                    for (final r4.b b : l0) {
                        r4.b b2;
                        if ((b2 = b) != null) {
                            if (p0.j8(b)) {
                                b2 = b;
                            }
                            else {
                                b2 = f0.G0(b, new q[0]);
                            }
                        }
                        l2.add(b2);
                    }
                }
            }
        }
        this.N.f().h();
        final OsList p = this.N.g().p(this.M.f);
        if (l2 != null && l2.size() == p.b0()) {
            while (j < l2.size()) {
                final r4.b b3 = l2.get(j);
                this.N.c(b3);
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
                final r4.b b4 = l2.get(k);
                this.N.c(b4);
                p.l(((p)b4).S6().g().l0());
            }
        }
    }
    
    @Override
    public String toString() {
        if (!p0.k8(this)) {
            return "Invalid object";
        }
        final StringBuilder sb = new StringBuilder("RealmClassLead = proxy[");
        sb.append("{klassenId:");
        sb.append(this.E0());
        sb.append("}");
        sb.append(",");
        sb.append("{events:");
        sb.append("RealmList<RealmClassLeadEvent>[");
        sb.append(this.X().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{absences:");
        sb.append("RealmList<RealmClassLeadStudentAbsence>[");
        sb.append(this.V().size());
        sb.append("]");
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
    
    @Override
    public void x0(final l0<d> l0) {
        final boolean i = this.N.i();
        final int n = 0;
        int j = 0;
        l0<d> l2 = l0;
        if (i) {
            if (!this.N.d()) {
                return;
            }
            if (this.N.e().contains("absences")) {
                return;
            }
            if ((l2 = l0) != null) {
                l2 = l0;
                if (!l0.G0()) {
                    final f0 f0 = (f0)this.N.f();
                    l2 = new l0<d>();
                    for (final d d : l0) {
                        d d2;
                        if ((d2 = d) != null) {
                            if (p0.j8(d)) {
                                d2 = d;
                            }
                            else {
                                d2 = f0.G0(d, new q[0]);
                            }
                        }
                        l2.add(d2);
                    }
                }
            }
        }
        this.N.f().h();
        final OsList p = this.N.g().p(this.M.g);
        if (l2 != null && l2.size() == p.b0()) {
            while (j < l2.size()) {
                final d d3 = l2.get(j);
                this.N.c(d3);
                p.Z(j, ((p)d3).S6().g().l0());
                ++j;
            }
        }
        else {
            p.M();
            if (l2 == null) {
                return;
            }
            for (int size = l2.size(), k = n; k < size; ++k) {
                final d d4 = l2.get(k);
                this.N.c(d4);
                p.l(((p)d4).S6().g().l0());
            }
        }
    }
    
    @Override
    public void y4() {
        if (this.N != null) {
            return;
        }
        final io.realm.a.h h = io.realm.a.W.get();
        this.M = (b)h.c();
        (this.N = new c0<r4.a>(this)).r(h.e());
        this.N.s(h.f());
        this.N.o(h.b());
        this.N.q(h.d());
    }
    
    public static final class a
    {
        public static final String a = "RealmClassLead";
    }
    
    static final class b extends c
    {
        long e;
        long f;
        long g;
        
        b(final OsSchemaInfo osSchemaInfo) {
            super(3);
            final OsObjectSchemaInfo b = osSchemaInfo.b("RealmClassLead");
            this.e = this.b("klassenId", "klassenId", b);
            this.f = this.b("events", "events", b);
            this.g = this.b("absences", "absences", b);
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
        }
    }
}
