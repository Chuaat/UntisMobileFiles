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
import u4.c;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.p;
import u4.b;

public class l3 extends u4.b implements p, m3
{
    private static final String T = "";
    private static final OsObjectSchemaInfo U;
    private b Q;
    private c0<u4.b> R;
    private l0<c> S;
    
    static {
        U = K8();
    }
    
    l3() {
        this.R.p();
    }
    
    public static u4.b G8(final f0 f0, final b b, final u4.b b2, final boolean b3, final Map<n0, p> map, final Set<q> set) {
        final l3 l3 = map.get(b2);
        if (l3 != null) {
            return l3;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(u4.b.class), set);
        osObjectBuilder.L(b.e, b2.a());
        osObjectBuilder.L(b.f, b2.d());
        osObjectBuilder.L(b.g, b2.c());
        osObjectBuilder.L(b.h, b2.y0());
        osObjectBuilder.L(b.i, b2.v7());
        osObjectBuilder.n(b.j, b2.k1());
        final l3 t8 = T8(f0, osObjectBuilder.f0());
        map.put(b2, t8);
        final l0<c> p6 = b2.p0();
        if (p6 != null) {
            final l0<c> p7 = t8.p0();
            p7.clear();
            for (int i = 0; i < p6.size(); ++i) {
                final c c = p6.get(i);
                c x8 = (c)map.get(c);
                if (x8 == null) {
                    x8 = p3.x8(f0, (p3.b)f0.H().j(c.class), c, b3, map, set);
                }
                p7.add(x8);
            }
        }
        return t8;
    }
    
    public static u4.b H8(final f0 f0, final b b, final u4.b b2, final boolean b3, final Map<n0, p> map, final Set<q> set) {
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
            return (u4.b)p7;
        }
        final p p8 = null;
        Object x2 = null;
        boolean b4 = false;
        Label_0232: {
            if (b3) {
                x2 = f0.x2(u4.b.class);
                final long r = ((Table)x2).r(b.e, b2.a());
                if (r == -1L) {
                    b4 = false;
                    x2 = p8;
                    break Label_0232;
                }
                try {
                    h.g(f0, ((Table)x2).R(r), b, false, Collections.emptyList());
                    x2 = new l3();
                    map.put(b2, (p)x2);
                }
                finally {
                    h.a();
                }
            }
            b4 = b3;
        }
        u4.b b5;
        if (b4) {
            b5 = U8(f0, b, (u4.b)x2, b2, map, set);
        }
        else {
            b5 = G8(f0, b, b2, b3, map, set);
        }
        return b5;
    }
    
    public static b I8(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static u4.b J8(final u4.b b, final int a, final int n, final Map<n0, p.a<n0>> map) {
        if (a <= n && b != null) {
            final p.a a2 = map.get(b);
            u4.b b2;
            if (a2 == null) {
                b2 = new u4.b();
                map.put(b, (p.a<n0>)new p.a(a, b2));
            }
            else {
                if (a >= a2.a) {
                    return (u4.b)a2.b;
                }
                b2 = (u4.b)a2.b;
                a2.a = a;
            }
            b2.b(b.a());
            b2.h(b.d());
            b2.i(b.c());
            b2.Y(b.y0());
            b2.C5(b.v7());
            b2.y1(b.k1());
            if (a == n) {
                b2.C0(null);
            }
            else {
                final l0<c> p4 = b.p0();
                final l0<c> l0 = new l0<c>();
                b2.C0(l0);
                for (int size = p4.size(), i = 0; i < size; ++i) {
                    l0.add(p3.z8(p4.get(i), a + 1, n, map));
                }
            }
            return b2;
        }
        return null;
    }
    
    private static OsObjectSchemaInfo K8() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmParentDayAppointment", false, 7, 0);
        final RealmFieldType integer = RealmFieldType.INTEGER;
        b.c("", "id", integer, true, false, true);
        b.c("", "start", integer, false, false, true);
        b.c("", "end", integer, false, false, true);
        b.c("", "teacherId", integer, false, false, true);
        b.c("", "roomId", integer, false, false, true);
        b.c("", "cancelled", RealmFieldType.BOOLEAN, false, false, true);
        b.b("", "students", RealmFieldType.LIST, "RealmParentDayStudent");
        return b.e();
    }
    
    public static u4.b L8(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final ArrayList<String> list = new ArrayList<String>(1);
        Object x2 = null;
        Label_0146: {
            if (b) {
                x2 = f0.x2(u4.b.class);
                final long e = ((b)f0.H().j(u4.b.class)).e;
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
                        h.g(f0, ((Table)x2).R(r), f0.H().j(u4.b.class), false, Collections.emptyList());
                        x2 = new l3();
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
            if (!jsonObject.has("id")) {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
            l3 l3;
            if (jsonObject.isNull("id")) {
                l3 = f0.p1((Class<l3>)u4.b.class, null, true, list);
            }
            else {
                l3 = f0.p1((Class<l3>)u4.b.class, jsonObject.getLong("id"), true, list);
            }
            o = l3;
        }
        if (jsonObject.has("start")) {
            if (jsonObject.isNull("start")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'start' to null.");
            }
            ((m3)o).h(jsonObject.getLong("start"));
        }
        if (jsonObject.has("end")) {
            if (jsonObject.isNull("end")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'end' to null.");
            }
            ((m3)o).i(jsonObject.getLong("end"));
        }
        if (jsonObject.has("teacherId")) {
            if (jsonObject.isNull("teacherId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'teacherId' to null.");
            }
            ((m3)o).Y(jsonObject.getLong("teacherId"));
        }
        if (jsonObject.has("roomId")) {
            if (jsonObject.isNull("roomId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'roomId' to null.");
            }
            ((m3)o).C5(jsonObject.getLong("roomId"));
        }
        if (jsonObject.has("cancelled")) {
            if (jsonObject.isNull("cancelled")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'cancelled' to null.");
            }
            ((m3)o).y1(jsonObject.getBoolean("cancelled"));
        }
        if (jsonObject.has("students")) {
            if (jsonObject.isNull("students")) {
                ((m3)o).C0(null);
            }
            else {
                ((m3)o).p0().clear();
                final JSONArray jsonArray = jsonObject.getJSONArray("students");
                for (int i = 0; i < jsonArray.length(); ++i) {
                    ((m3)o).p0().add(p3.B8(f0, jsonArray.getJSONObject(i), b));
                }
            }
        }
        return (u4.b)o;
    }
    
    @TargetApi(11)
    public static u4.b M8(final f0 f0, final JsonReader jsonReader) throws IOException {
        final u4.b b = new u4.b();
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
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'start' to null.");
                }
                b.h(jsonReader.nextLong());
            }
            else if (nextName.equals("end")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'end' to null.");
                }
                b.i(jsonReader.nextLong());
            }
            else if (nextName.equals("teacherId")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'teacherId' to null.");
                }
                b.Y(jsonReader.nextLong());
            }
            else if (nextName.equals("roomId")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'roomId' to null.");
                }
                b.C5(jsonReader.nextLong());
            }
            else if (nextName.equals("cancelled")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'cancelled' to null.");
                }
                b.y1(jsonReader.nextBoolean());
            }
            else if (nextName.equals("students")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    b.C0(null);
                }
                else {
                    b.C0(new l0<c>());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        b.p0().add(p3.C8(f0, jsonReader));
                    }
                    jsonReader.endArray();
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
    
    public static OsObjectSchemaInfo N8() {
        return l3.U;
    }
    
    public static String O8() {
        return "RealmParentDayAppointment";
    }
    
    public static long P8(final f0 f0, final u4.b b, final Map<n0, Long> map) {
        if (b instanceof p && !p0.h8(b)) {
            final p p3 = (p)b;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(u4.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b2 = (b)f0.H().j(u4.b.class);
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
        Table.nativeSetLong(nativePtr, b2.f, l, b.d(), false);
        Table.nativeSetLong(nativePtr, b2.g, l, b.c(), false);
        Table.nativeSetLong(nativePtr, b2.h, l, b.y0(), false);
        Table.nativeSetLong(nativePtr, b2.i, l, b.v7(), false);
        Table.nativeSetBoolean(nativePtr, b2.j, l, b.k1(), false);
        final l0<c> p4 = b.p0();
        if (p4 != null) {
            final OsList list = new OsList(x2.R(l), b2.k);
            for (final c c : p4) {
                Long value2;
                if ((value2 = map.get(c)) == null) {
                    value2 = p3.F8(f0, c, map);
                }
                list.l(value2);
            }
        }
        return l;
    }
    
    public static void Q8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(u4.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(u4.b.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final u4.b b2 = (u4.b)iterator.next();
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
            Table.nativeSetLong(nativePtr, b.f, l, b2.d(), false);
            Table.nativeSetLong(nativePtr, b.g, l, b2.c(), false);
            Table.nativeSetLong(nativePtr, b.h, l, b2.y0(), false);
            Table.nativeSetLong(nativePtr, b.i, l, b2.v7(), false);
            Table.nativeSetBoolean(nativePtr, b.j, l, b2.k1(), false);
            final l0<c> p4 = b2.p0();
            if (p4 == null) {
                continue;
            }
            final OsList list = new OsList(x2.R(l), b.k);
            for (final c c : p4) {
                Long value2;
                if ((value2 = map.get(c)) == null) {
                    value2 = p3.F8(f0, c, map);
                }
                list.l(value2);
            }
        }
    }
    
    public static long R8(final f0 f0, final u4.b b, final Map<n0, Long> map) {
        if (b instanceof p && !p0.h8(b)) {
            final p p3 = (p)b;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(u4.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b2 = (b)f0.H().j(u4.b.class);
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
        Table.nativeSetLong(nativePtr, b2.f, rowWithPrimaryKey, b.d(), false);
        Table.nativeSetLong(nativePtr, b2.g, rowWithPrimaryKey, b.c(), false);
        Table.nativeSetLong(nativePtr, b2.h, rowWithPrimaryKey, b.y0(), false);
        Table.nativeSetLong(nativePtr, b2.i, rowWithPrimaryKey, b.v7(), false);
        Table.nativeSetBoolean(nativePtr, b2.j, rowWithPrimaryKey, b.k1(), false);
        final OsList list = new OsList(x2.R(rowWithPrimaryKey), b2.k);
        final l0<c> p4 = b.p0();
        if (p4 != null && p4.size() == list.b0()) {
            for (int size = p4.size(), i = 0; i < size; ++i) {
                final c c = p4.get(i);
                Long value;
                if ((value = map.get(c)) == null) {
                    value = p3.H8(f0, c, map);
                }
                list.Z(i, value);
            }
        }
        else {
            list.M();
            if (p4 != null) {
                for (final c c2 : p4) {
                    Long value2;
                    if ((value2 = map.get(c2)) == null) {
                        value2 = p3.H8(f0, c2, map);
                    }
                    list.l(value2);
                }
            }
        }
        return rowWithPrimaryKey;
    }
    
    public static void S8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(u4.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(u4.b.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final u4.b b2 = (u4.b)iterator.next();
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
            Table.nativeSetLong(nativePtr, b.f, rowWithPrimaryKey, b2.d(), false);
            Table.nativeSetLong(nativePtr, b.g, rowWithPrimaryKey, b2.c(), false);
            Table.nativeSetLong(nativePtr, b.h, rowWithPrimaryKey, b2.y0(), false);
            Table.nativeSetLong(nativePtr, b.i, rowWithPrimaryKey, b2.v7(), false);
            Table.nativeSetBoolean(nativePtr, b.j, rowWithPrimaryKey, b2.k1(), false);
            final OsList list = new OsList(x2.R(rowWithPrimaryKey), b.k);
            final l0<c> p4 = b2.p0();
            if (p4 != null && p4.size() == list.b0()) {
                for (int size = p4.size(), i = 0; i < size; ++i) {
                    final c c = p4.get(i);
                    Long value;
                    if ((value = map.get(c)) == null) {
                        value = p3.H8(f0, c, map);
                    }
                    list.Z(i, value);
                }
            }
            else {
                list.M();
                if (p4 == null) {
                    continue;
                }
                for (final c c2 : p4) {
                    Long value2;
                    if ((value2 = map.get(c2)) == null) {
                        value2 = p3.H8(f0, c2, map);
                    }
                    list.l(value2);
                }
            }
        }
    }
    
    static l3 T8(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(u4.b.class), false, Collections.emptyList());
        final l3 l3 = new l3();
        h.a();
        return l3;
    }
    
    static u4.b U8(final f0 f0, final b b, final u4.b b2, final u4.b b3, final Map<n0, p> map, final Set<q> set) {
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(u4.b.class), set);
        osObjectBuilder.L(b.e, b3.a());
        osObjectBuilder.L(b.f, b3.d());
        osObjectBuilder.L(b.g, b3.c());
        osObjectBuilder.L(b.h, b3.y0());
        osObjectBuilder.L(b.i, b3.v7());
        osObjectBuilder.n(b.j, b3.k1());
        final l0<c> p6 = b3.p0();
        if (p6 != null) {
            final l0<n0> l0 = new l0<n0>();
            for (int i = 0; i < p6.size(); ++i) {
                final c c = p6.get(i);
                c x8 = (c)map.get(c);
                if (x8 == null) {
                    x8 = p3.x8(f0, (p3.b)f0.H().j(c.class), c, true, map, set);
                }
                l0.add(x8);
            }
            osObjectBuilder.Z(b.k, l0);
        }
        else {
            osObjectBuilder.Z(b.k, new l0<n0>());
        }
        osObjectBuilder.i0();
        return b2;
    }
    
    @Override
    public void C0(final l0<c> l0) {
        final boolean i = this.R.i();
        final int n = 0;
        int j = 0;
        l0<c> l2 = l0;
        if (i) {
            if (!this.R.d()) {
                return;
            }
            if (this.R.e().contains("students")) {
                return;
            }
            if ((l2 = l0) != null) {
                l2 = l0;
                if (!l0.G0()) {
                    final f0 f0 = (f0)this.R.f();
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
        this.R.f().h();
        final OsList p = this.R.g().p(this.Q.k);
        if (l2 != null && l2.size() == p.b0()) {
            while (j < l2.size()) {
                final c c3 = l2.get(j);
                this.R.c(c3);
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
                this.R.c(c4);
                p.l(((p)c4).S6().g().l0());
            }
        }
    }
    
    @Override
    public void C5(final long n) {
        if (!this.R.i()) {
            this.R.f().h();
            this.R.g().s(this.Q.i, n);
            return;
        }
        if (!this.R.d()) {
            return;
        }
        final r g = this.R.g();
        g.g().q0(this.Q.i, g.l0(), n, true);
    }
    
    @Override
    public c0<?> S6() {
        return this.R;
    }
    
    @Override
    public void Y(final long n) {
        if (!this.R.i()) {
            this.R.f().h();
            this.R.g().s(this.Q.h, n);
            return;
        }
        if (!this.R.d()) {
            return;
        }
        final r g = this.R.g();
        g.g().q0(this.Q.h, g.l0(), n, true);
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
    public long c() {
        this.R.f().h();
        return this.R.g().m(this.Q.g);
    }
    
    @Override
    public long d() {
        this.R.f().h();
        return this.R.g().m(this.Q.f);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final l3 l3 = (l3)o;
        final io.realm.a f = this.R.f();
        final io.realm.a f2 = l3.R.f();
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
        final String i = l3.R.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.R.g().l0() == l3.R.g().l0();
            }
        }
        else if (i == null) {
            return this.R.g().l0() == l3.R.g().l0();
        }
        return false;
    }
    
    @Override
    public void h(final long n) {
        if (!this.R.i()) {
            this.R.f().h();
            this.R.g().s(this.Q.f, n);
            return;
        }
        if (!this.R.d()) {
            return;
        }
        final r g = this.R.g();
        g.g().q0(this.Q.f, g.l0(), n, true);
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
    public void i(final long n) {
        if (!this.R.i()) {
            this.R.f().h();
            this.R.g().s(this.Q.g, n);
            return;
        }
        if (!this.R.d()) {
            return;
        }
        final r g = this.R.g();
        g.g().q0(this.Q.g, g.l0(), n, true);
    }
    
    @Override
    public boolean k1() {
        this.R.f().h();
        return this.R.g().l(this.Q.j);
    }
    
    @Override
    public l0<c> p0() {
        this.R.f().h();
        final l0<c> s = this.S;
        if (s != null) {
            return s;
        }
        return this.S = new l0<c>(c.class, this.R.g().p(this.Q.k), this.R.f());
    }
    
    @Override
    public String toString() {
        if (!p0.k8(this)) {
            return "Invalid object";
        }
        final StringBuilder sb = new StringBuilder("RealmParentDayAppointment = proxy[");
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
        sb.append("{teacherId:");
        sb.append(this.y0());
        sb.append("}");
        sb.append(",");
        sb.append("{roomId:");
        sb.append(this.v7());
        sb.append("}");
        sb.append(",");
        sb.append("{cancelled:");
        sb.append(this.k1());
        sb.append("}");
        sb.append(",");
        sb.append("{students:");
        sb.append("RealmList<RealmParentDayStudent>[");
        sb.append(this.p0().size());
        sb.append("]");
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
    
    @Override
    public long v7() {
        this.R.f().h();
        return this.R.g().m(this.Q.i);
    }
    
    @Override
    public long y0() {
        this.R.f().h();
        return this.R.g().m(this.Q.h);
    }
    
    @Override
    public void y1(final boolean b) {
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
    public void y4() {
        if (this.R != null) {
            return;
        }
        final io.realm.a.h h = io.realm.a.W.get();
        this.Q = (b)h.c();
        (this.R = new c0<u4.b>(this)).r(h.e());
        this.R.s(h.f());
        this.R.o(h.b());
        this.R.q(h.d());
    }
    
    public static final class a
    {
        public static final String a = "RealmParentDayAppointment";
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
            final OsObjectSchemaInfo b = osSchemaInfo.b("RealmParentDayAppointment");
            this.e = this.b("id", "id", b);
            this.f = this.b("start", "start", b);
            this.g = this.b("end", "end", b);
            this.h = this.b("teacherId", "teacherId", b);
            this.i = this.b("roomId", "roomId", b);
            this.j = this.b("cancelled", "cancelled", b);
            this.k = this.b("students", "students", b);
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
