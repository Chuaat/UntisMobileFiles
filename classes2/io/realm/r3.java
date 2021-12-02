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
import v4.a;

public class r3 extends v4.a implements p, s3
{
    private static final String S = "";
    private static final OsObjectSchemaInfo T;
    private b P;
    private c0<v4.a> Q;
    private l0<o4.a> R;
    
    static {
        T = I8();
    }
    
    r3() {
        this.Q.p();
    }
    
    public static v4.a E8(final f0 f0, final b b, final v4.a a, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        final r3 r3 = map.get(a);
        if (r3 != null) {
            return r3;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(v4.a.class), set);
        osObjectBuilder.L(b.e, a.D());
        osObjectBuilder.d0(b.f, a.f());
        osObjectBuilder.L(b.g, a.d());
        osObjectBuilder.L(b.h, a.c());
        osObjectBuilder.n(b.j, a.A());
        final r3 r4 = R8(f0, osObjectBuilder.f0());
        map.put(a, r4);
        final l0<o4.a> e = a.E();
        if (e != null) {
            final l0<o4.a> e2 = r4.E();
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
        return r4;
    }
    
    public static v4.a F8(final f0 f0, final b b, final v4.a a, final boolean b2, final Map<n0, p> map, final Set<q> set) {
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
            return (v4.a)p7;
        }
        final p p8 = null;
        Object x2 = null;
        boolean b3 = false;
        Label_0232: {
            if (b2) {
                x2 = f0.x2(v4.a.class);
                final long r = ((Table)x2).r(b.e, a.D());
                if (r == -1L) {
                    b3 = false;
                    x2 = p8;
                    break Label_0232;
                }
                try {
                    h.g(f0, ((Table)x2).R(r), b, false, Collections.emptyList());
                    x2 = new r3();
                    map.put(a, (p)x2);
                }
                finally {
                    h.a();
                }
            }
            b3 = b2;
        }
        v4.a a2;
        if (b3) {
            a2 = S8(f0, b, (v4.a)x2, a, map, set);
        }
        else {
            a2 = E8(f0, b, a, b2, map, set);
        }
        return a2;
    }
    
    public static b G8(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static v4.a H8(final v4.a a, final int a2, final int n, final Map<n0, p.a<n0>> map) {
        if (a2 <= n && a != null) {
            final p.a a3 = map.get(a);
            v4.a a4;
            if (a3 == null) {
                a4 = new v4.a();
                map.put(a, (p.a<n0>)new p.a(a2, a4));
            }
            else {
                if (a2 >= a3.a) {
                    return (v4.a)a3.b;
                }
                a4 = (v4.a)a3.b;
                a3.a = a2;
            }
            a4.y(a.D());
            a4.j(a.f());
            a4.h(a.d());
            a4.i(a.c());
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
            a4.F(a.A());
            return a4;
        }
        return null;
    }
    
    private static OsObjectSchemaInfo I8() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmLessonTopic", false, 6, 0);
        final RealmFieldType integer = RealmFieldType.INTEGER;
        b.c("", "periodId", integer, true, false, true);
        b.c("", "text", RealmFieldType.STRING, false, false, true);
        b.c("", "start", integer, false, false, true);
        b.c("", "end", integer, false, false, true);
        b.b("", "driveAttachments", RealmFieldType.LIST, "RealmDriveAttachment");
        b.c("", "synced", RealmFieldType.BOOLEAN, false, false, true);
        return b.e();
    }
    
    public static v4.a J8(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final ArrayList<String> list = new ArrayList<String>(1);
        Object x2 = null;
        Label_0146: {
            if (b) {
                x2 = f0.x2(v4.a.class);
                final long e = ((b)f0.H().j(v4.a.class)).e;
                long r;
                if (!jsonObject.isNull("periodId")) {
                    r = ((Table)x2).r(e, jsonObject.getLong("periodId"));
                }
                else {
                    r = -1L;
                }
                if (r != -1L) {
                    final io.realm.a.h h = io.realm.a.W.get();
                    try {
                        h.g(f0, ((Table)x2).R(r), f0.H().j(v4.a.class), false, Collections.emptyList());
                        x2 = new r3();
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
            if (!jsonObject.has("periodId")) {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'periodId'.");
            }
            r3 r2;
            if (jsonObject.isNull("periodId")) {
                r2 = f0.p1((Class<r3>)v4.a.class, null, true, list);
            }
            else {
                r2 = f0.p1((Class<r3>)v4.a.class, jsonObject.getLong("periodId"), true, list);
            }
            o = r2;
        }
        if (jsonObject.has("text")) {
            if (jsonObject.isNull("text")) {
                ((s3)o).j(null);
            }
            else {
                ((s3)o).j(jsonObject.getString("text"));
            }
        }
        if (jsonObject.has("start")) {
            if (jsonObject.isNull("start")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'start' to null.");
            }
            ((s3)o).h(jsonObject.getLong("start"));
        }
        if (jsonObject.has("end")) {
            if (jsonObject.isNull("end")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'end' to null.");
            }
            ((s3)o).i(jsonObject.getLong("end"));
        }
        if (jsonObject.has("driveAttachments")) {
            if (jsonObject.isNull("driveAttachments")) {
                ((s3)o).B(null);
            }
            else {
                ((s3)o).E().clear();
                final JSONArray jsonArray = jsonObject.getJSONArray("driveAttachments");
                for (int i = 0; i < jsonArray.length(); ++i) {
                    ((s3)o).E().add(l2.D8(f0, jsonArray.getJSONObject(i), b));
                }
            }
        }
        if (jsonObject.has("synced")) {
            if (jsonObject.isNull("synced")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'synced' to null.");
            }
            ((s3)o).F(jsonObject.getBoolean("synced"));
        }
        return (v4.a)o;
    }
    
    @TargetApi(11)
    public static v4.a K8(final f0 f0, final JsonReader jsonReader) throws IOException {
        final v4.a a = new v4.a();
        jsonReader.beginObject();
        boolean b = false;
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            if (nextName.equals("periodId")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'periodId' to null.");
                }
                a.y(jsonReader.nextLong());
                b = true;
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
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'periodId'.");
    }
    
    public static OsObjectSchemaInfo L8() {
        return r3.T;
    }
    
    public static String M8() {
        return "RealmLessonTopic";
    }
    
    public static long N8(final f0 f0, final v4.a a, final Map<n0, Long> map) {
        if (a instanceof p && !p0.h8(a)) {
            final p p3 = (p)a;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(v4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(v4.a.class);
        final long e = b.e;
        final Long value = a.D();
        long l;
        if (value != null) {
            l = Table.nativeFindFirstInt(nativePtr, e, a.D());
        }
        else {
            l = -1L;
        }
        if (l == -1L) {
            l = OsObject.createRowWithPrimaryKey(x2, e, a.D());
        }
        else {
            Table.v0(value);
        }
        map.put(a, l);
        final String f2 = a.f();
        if (f2 != null) {
            Table.nativeSetString(nativePtr, b.f, l, f2, false);
        }
        Table.nativeSetLong(nativePtr, b.g, l, a.d(), false);
        Table.nativeSetLong(nativePtr, b.h, l, a.c(), false);
        final l0<o4.a> e2 = a.E();
        if (e2 != null) {
            final OsList list = new OsList(x2.R(l), b.i);
            for (final o4.a a2 : e2) {
                Long value2;
                if ((value2 = map.get(a2)) == null) {
                    value2 = l2.H8(f0, a2, map);
                }
                list.l(value2);
            }
        }
        Table.nativeSetBoolean(nativePtr, b.j, l, a.A(), false);
        return l;
    }
    
    public static void O8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(v4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(v4.a.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final v4.a a = (v4.a)iterator.next();
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
            final Long value = a.D();
            long l;
            if (value != null) {
                l = Table.nativeFindFirstInt(nativePtr, e, a.D());
            }
            else {
                l = -1L;
            }
            if (l == -1L) {
                l = OsObject.createRowWithPrimaryKey(x2, e, a.D());
            }
            else {
                Table.v0(value);
            }
            map.put(a, l);
            final String f2 = a.f();
            if (f2 != null) {
                Table.nativeSetString(nativePtr, b.f, l, f2, false);
            }
            Table.nativeSetLong(nativePtr, b.g, l, a.d(), false);
            Table.nativeSetLong(nativePtr, b.h, l, a.c(), false);
            final l0<o4.a> e2 = a.E();
            if (e2 != null) {
                final OsList list = new OsList(x2.R(l), b.i);
                for (final o4.a a2 : e2) {
                    Long value2;
                    if ((value2 = map.get(a2)) == null) {
                        value2 = l2.H8(f0, a2, map);
                    }
                    list.l(value2);
                }
            }
            Table.nativeSetBoolean(nativePtr, b.j, l, a.A(), false);
        }
    }
    
    public static long P8(final f0 f0, final v4.a a, final Map<n0, Long> map) {
        if (a instanceof p && !p0.h8(a)) {
            final p p3 = (p)a;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(v4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(v4.a.class);
        final long e = b.e;
        long nativeFindFirstInt;
        if (Long.valueOf(a.D()) != null) {
            nativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, e, a.D());
        }
        else {
            nativeFindFirstInt = -1L;
        }
        long rowWithPrimaryKey = nativeFindFirstInt;
        if (nativeFindFirstInt == -1L) {
            rowWithPrimaryKey = OsObject.createRowWithPrimaryKey(x2, e, a.D());
        }
        map.put(a, rowWithPrimaryKey);
        final String f2 = a.f();
        if (f2 != null) {
            Table.nativeSetString(nativePtr, b.f, rowWithPrimaryKey, f2, false);
        }
        else {
            Table.nativeSetNull(nativePtr, b.f, rowWithPrimaryKey, false);
        }
        Table.nativeSetLong(nativePtr, b.g, rowWithPrimaryKey, a.d(), false);
        Table.nativeSetLong(nativePtr, b.h, rowWithPrimaryKey, a.c(), false);
        final OsList list = new OsList(x2.R(rowWithPrimaryKey), b.i);
        final l0<o4.a> e2 = a.E();
        if (e2 != null && e2.size() == list.b0()) {
            for (int size = e2.size(), i = 0; i < size; ++i) {
                final o4.a a2 = e2.get(i);
                Long value;
                if ((value = map.get(a2)) == null) {
                    value = l2.J8(f0, a2, map);
                }
                list.Z(i, value);
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
        Table.nativeSetBoolean(nativePtr, b.j, rowWithPrimaryKey, a.A(), false);
        return rowWithPrimaryKey;
    }
    
    public static void Q8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(v4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(v4.a.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final v4.a a = (v4.a)iterator.next();
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
            if (Long.valueOf(a.D()) != null) {
                nativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, e, a.D());
            }
            else {
                nativeFindFirstInt = -1L;
            }
            long rowWithPrimaryKey = nativeFindFirstInt;
            if (nativeFindFirstInt == -1L) {
                rowWithPrimaryKey = OsObject.createRowWithPrimaryKey(x2, e, a.D());
            }
            map.put(a, rowWithPrimaryKey);
            final String f2 = a.f();
            if (f2 != null) {
                Table.nativeSetString(nativePtr, b.f, rowWithPrimaryKey, f2, false);
            }
            else {
                Table.nativeSetNull(nativePtr, b.f, rowWithPrimaryKey, false);
            }
            Table.nativeSetLong(nativePtr, b.g, rowWithPrimaryKey, a.d(), false);
            Table.nativeSetLong(nativePtr, b.h, rowWithPrimaryKey, a.c(), false);
            final OsList list = new OsList(x2.R(rowWithPrimaryKey), b.i);
            final l0<o4.a> e2 = a.E();
            if (e2 != null && e2.size() == list.b0()) {
                for (int size = e2.size(), i = 0; i < size; ++i) {
                    final o4.a a2 = e2.get(i);
                    Long value;
                    if ((value = map.get(a2)) == null) {
                        value = l2.J8(f0, a2, map);
                    }
                    list.Z(i, value);
                }
            }
            else {
                final long n = rowWithPrimaryKey;
                list.M();
                rowWithPrimaryKey = n;
                if (e2 != null) {
                    final Iterator<o4.a> iterator2 = e2.iterator();
                    while (true) {
                        rowWithPrimaryKey = n;
                        if (!iterator2.hasNext()) {
                            break;
                        }
                        final o4.a a3 = iterator2.next();
                        Long value2;
                        if ((value2 = map.get(a3)) == null) {
                            value2 = l2.J8(f0, a3, map);
                        }
                        list.l(value2);
                    }
                }
            }
            Table.nativeSetBoolean(nativePtr, b.j, rowWithPrimaryKey, a.A(), false);
        }
    }
    
    static r3 R8(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(v4.a.class), false, Collections.emptyList());
        final r3 r2 = new r3();
        h.a();
        return r2;
    }
    
    static v4.a S8(final f0 f0, final b b, final v4.a a, final v4.a a2, final Map<n0, p> map, final Set<q> set) {
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(v4.a.class), set);
        osObjectBuilder.L(b.e, a2.D());
        osObjectBuilder.d0(b.f, a2.f());
        osObjectBuilder.L(b.g, a2.d());
        osObjectBuilder.L(b.h, a2.c());
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
            osObjectBuilder.Z(b.i, l0);
        }
        else {
            osObjectBuilder.Z(b.i, new l0<n0>());
        }
        osObjectBuilder.n(b.j, a2.A());
        osObjectBuilder.i0();
        return a;
    }
    
    @Override
    public boolean A() {
        this.Q.f().h();
        return this.Q.g().l(this.P.j);
    }
    
    @Override
    public void B(final l0<o4.a> l0) {
        final boolean i = this.Q.i();
        final int n = 0;
        int j = 0;
        l0<o4.a> l2 = l0;
        if (i) {
            if (!this.Q.d()) {
                return;
            }
            if (this.Q.e().contains("driveAttachments")) {
                return;
            }
            if ((l2 = l0) != null) {
                l2 = l0;
                if (!l0.G0()) {
                    final f0 f0 = (f0)this.Q.f();
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
        this.Q.f().h();
        final OsList p = this.Q.g().p(this.P.i);
        if (l2 != null && l2.size() == p.b0()) {
            while (j < l2.size()) {
                final o4.a a3 = l2.get(j);
                this.Q.c(a3);
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
                this.Q.c(a4);
                p.l(((p)a4).S6().g().l0());
            }
        }
    }
    
    @Override
    public long D() {
        this.Q.f().h();
        return this.Q.g().m(this.P.e);
    }
    
    @Override
    public l0<o4.a> E() {
        this.Q.f().h();
        final l0<o4.a> r = this.R;
        if (r != null) {
            return r;
        }
        return this.R = new l0<o4.a>(o4.a.class, this.Q.g().p(this.P.i), this.Q.f());
    }
    
    @Override
    public void F(final boolean b) {
        if (!this.Q.i()) {
            this.Q.f().h();
            this.Q.g().i(this.P.j, b);
            return;
        }
        if (!this.Q.d()) {
            return;
        }
        final r g = this.Q.g();
        g.g().j0(this.P.j, g.l0(), b, true);
    }
    
    @Override
    public c0<?> S6() {
        return this.Q;
    }
    
    @Override
    public long c() {
        this.Q.f().h();
        return this.Q.g().m(this.P.h);
    }
    
    @Override
    public long d() {
        this.Q.f().h();
        return this.Q.g().m(this.P.g);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final r3 r3 = (r3)o;
        final io.realm.a f = this.Q.f();
        final io.realm.a f2 = r3.Q.f();
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
        final String m = this.Q.g().g().M();
        final String i = r3.Q.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.Q.g().l0() == r3.Q.g().l0();
            }
        }
        else if (i == null) {
            return this.Q.g().l0() == r3.Q.g().l0();
        }
        return false;
    }
    
    @Override
    public String f() {
        this.Q.f().h();
        return this.Q.g().U(this.P.f);
    }
    
    @Override
    public void h(final long n) {
        if (!this.Q.i()) {
            this.Q.f().h();
            this.Q.g().s(this.P.g, n);
            return;
        }
        if (!this.Q.d()) {
            return;
        }
        final r g = this.Q.g();
        g.g().q0(this.P.g, g.l0(), n, true);
    }
    
    @Override
    public int hashCode() {
        final String path = this.Q.f().getPath();
        final String m = this.Q.g().g().M();
        final long l0 = this.Q.g().l0();
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
        if (!this.Q.i()) {
            this.Q.f().h();
            this.Q.g().s(this.P.h, n);
            return;
        }
        if (!this.Q.d()) {
            return;
        }
        final r g = this.Q.g();
        g.g().q0(this.P.h, g.l0(), n, true);
    }
    
    @Override
    public void j(final String s) {
        if (this.Q.i()) {
            if (!this.Q.d()) {
                return;
            }
            final r g = this.Q.g();
            if (s != null) {
                g.g().t0(this.P.f, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'text' to null.");
        }
        else {
            this.Q.f().h();
            if (s != null) {
                this.Q.g().d(this.P.f, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'text' to null.");
        }
    }
    
    @Override
    public String toString() {
        if (!p0.k8(this)) {
            return "Invalid object";
        }
        final StringBuilder sb = new StringBuilder("RealmLessonTopic = proxy[");
        sb.append("{periodId:");
        sb.append(this.D());
        sb.append("}");
        sb.append(",");
        sb.append("{text:");
        sb.append(this.f());
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
        sb.append("{driveAttachments:");
        sb.append("RealmList<RealmDriveAttachment>[");
        sb.append(this.E().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{synced:");
        sb.append(this.A());
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
    
    @Override
    public void y(final long n) {
        if (this.Q.i()) {
            return;
        }
        this.Q.f().h();
        throw new RealmException("Primary key field 'periodId' cannot be changed after object was created.");
    }
    
    @Override
    public void y4() {
        if (this.Q != null) {
            return;
        }
        final io.realm.a.h h = io.realm.a.W.get();
        this.P = (b)h.c();
        (this.Q = new c0<v4.a>(this)).r(h.e());
        this.Q.s(h.f());
        this.Q.o(h.b());
        this.Q.q(h.d());
    }
    
    public static final class a
    {
        public static final String a = "RealmLessonTopic";
    }
    
    static final class b extends c
    {
        long e;
        long f;
        long g;
        long h;
        long i;
        long j;
        
        b(final OsSchemaInfo osSchemaInfo) {
            super(6);
            final OsObjectSchemaInfo b = osSchemaInfo.b("RealmLessonTopic");
            this.e = this.b("periodId", "periodId", b);
            this.f = this.b("text", "text", b);
            this.g = this.b("start", "start", b);
            this.h = this.b("end", "end", b);
            this.i = this.b("driveAttachments", "driveAttachments", b);
            this.j = this.b("synced", "synced", b);
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
        }
    }
}
