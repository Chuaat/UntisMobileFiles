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
import w4.i;

public class l4 extends i implements p, m4
{
    private static final String V = "";
    private static final OsObjectSchemaInfo W;
    private b T;
    private c0<i> U;
    
    static {
        W = Q8();
    }
    
    l4() {
        this.U.p();
    }
    
    public static i M8(final f0 f0, final b b, final i i, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        final l4 l4 = map.get(i);
        if (l4 != null) {
            return l4;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(i.class), set);
        osObjectBuilder.L(b.e, i.a());
        osObjectBuilder.d0(b.f, i.g());
        osObjectBuilder.d0(b.g, i.B0());
        osObjectBuilder.d0(b.h, i.z0());
        osObjectBuilder.L(b.i, i.d());
        osObjectBuilder.L(b.j, i.c());
        osObjectBuilder.K(b.k, i.r());
        osObjectBuilder.K(b.l, i.u());
        osObjectBuilder.n(b.m, i.t());
        osObjectBuilder.n(b.n, i.L());
        final l4 z8 = Z8(f0, osObjectBuilder.f0());
        map.put(i, z8);
        return z8;
    }
    
    public static i N8(final f0 f0, final b b, final i i, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        if (i instanceof p && !p0.h8(i)) {
            final p p6 = (p)i;
            if (p6.S6().f() != null) {
                final io.realm.a f2 = p6.S6().f();
                if (f2.H != f0.H) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
                if (f2.getPath().equals(f0.getPath())) {
                    return i;
                }
            }
        }
        final io.realm.a.h h = io.realm.a.W.get();
        final p p7 = map.get(i);
        if (p7 != null) {
            return (i)p7;
        }
        final p p8 = null;
        Object x2 = null;
        boolean b3 = false;
        Label_0232: {
            if (b2) {
                x2 = f0.x2(i.class);
                final long r = ((Table)x2).r(b.e, i.a());
                if (r == -1L) {
                    b3 = false;
                    x2 = p8;
                    break Label_0232;
                }
                try {
                    h.g(f0, ((Table)x2).R(r), b, false, Collections.emptyList());
                    x2 = new l4();
                    map.put(i, (p)x2);
                }
                finally {
                    h.a();
                }
            }
            b3 = b2;
        }
        i j;
        if (b3) {
            j = a9(f0, b, (i)x2, i, map, set);
        }
        else {
            j = M8(f0, b, i, b2, map, set);
        }
        return j;
    }
    
    public static b O8(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static i P8(final i i, final int a, final int n, final Map<n0, p.a<n0>> map) {
        if (a <= n && i != null) {
            final p.a a2 = map.get(i);
            i k;
            if (a2 == null) {
                final i j = new i();
                map.put(i, (p.a<n0>)new p.a(a, j));
                k = j;
            }
            else {
                if (a >= a2.a) {
                    return (i)a2.b;
                }
                k = (i)a2.b;
                a2.a = a;
            }
            k.b(i.a());
            k.e(i.g());
            k.v0(i.B0());
            k.k0(i.z0());
            k.h(i.d());
            k.i(i.c());
            k.q(i.r());
            k.w(i.u());
            k.s(i.t());
            k.Q(i.L());
            return k;
        }
        return null;
    }
    
    private static OsObjectSchemaInfo Q8() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmTeacher", false, 10, 0);
        final RealmFieldType integer = RealmFieldType.INTEGER;
        b.c("", "id", integer, true, false, true);
        final RealmFieldType string = RealmFieldType.STRING;
        b.c("", "name", string, false, false, true);
        b.c("", "firstName", string, false, false, true);
        b.c("", "lastName", string, false, false, true);
        b.c("", "start", integer, false, false, true);
        b.c("", "end", integer, false, false, true);
        b.c("", "textColor", integer, false, false, true);
        b.c("", "backColor", integer, false, false, true);
        final RealmFieldType boolean1 = RealmFieldType.BOOLEAN;
        b.c("", "active", boolean1, false, false, true);
        b.c("", "displayable", boolean1, false, false, true);
        return b.e();
    }
    
    public static i R8(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final List<String> emptyList = Collections.emptyList();
        Object x2 = null;
        Label_0141: {
            if (b) {
                x2 = f0.x2(i.class);
                final long e = ((b)f0.H().j(i.class)).e;
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
                        h.g(f0, ((Table)x2).R(r), f0.H().j(i.class), false, Collections.emptyList());
                        x2 = new l4();
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
            l4 l4;
            if (jsonObject.isNull("id")) {
                l4 = f0.p1((Class<l4>)i.class, null, true, emptyList);
            }
            else {
                l4 = f0.p1((Class<l4>)i.class, jsonObject.getLong("id"), true, emptyList);
            }
            o = l4;
        }
        if (jsonObject.has("name")) {
            if (jsonObject.isNull("name")) {
                ((m4)o).e(null);
            }
            else {
                ((m4)o).e(jsonObject.getString("name"));
            }
        }
        if (jsonObject.has("firstName")) {
            if (jsonObject.isNull("firstName")) {
                ((m4)o).v0(null);
            }
            else {
                ((m4)o).v0(jsonObject.getString("firstName"));
            }
        }
        if (jsonObject.has("lastName")) {
            if (jsonObject.isNull("lastName")) {
                ((m4)o).k0(null);
            }
            else {
                ((m4)o).k0(jsonObject.getString("lastName"));
            }
        }
        if (jsonObject.has("start")) {
            if (jsonObject.isNull("start")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'start' to null.");
            }
            ((m4)o).h(jsonObject.getLong("start"));
        }
        if (jsonObject.has("end")) {
            if (jsonObject.isNull("end")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'end' to null.");
            }
            ((m4)o).i(jsonObject.getLong("end"));
        }
        if (jsonObject.has("textColor")) {
            if (jsonObject.isNull("textColor")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'textColor' to null.");
            }
            ((m4)o).q(jsonObject.getInt("textColor"));
        }
        if (jsonObject.has("backColor")) {
            if (jsonObject.isNull("backColor")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'backColor' to null.");
            }
            ((m4)o).w(jsonObject.getInt("backColor"));
        }
        if (jsonObject.has("active")) {
            if (jsonObject.isNull("active")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'active' to null.");
            }
            ((m4)o).s(jsonObject.getBoolean("active"));
        }
        if (jsonObject.has("displayable")) {
            if (jsonObject.isNull("displayable")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'displayable' to null.");
            }
            ((m4)o).Q(jsonObject.getBoolean("displayable"));
        }
        return (i)o;
    }
    
    @TargetApi(11)
    public static i S8(final f0 f0, final JsonReader jsonReader) throws IOException {
        final i i = new i();
        jsonReader.beginObject();
        boolean b = false;
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
                i.b(jsonReader.nextLong());
                b = true;
            }
            else if (nextName.equals("name")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    i.e(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    i.e(null);
                }
            }
            else if (nextName.equals("firstName")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    i.v0(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    i.v0(null);
                }
            }
            else if (nextName.equals("lastName")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    i.k0(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    i.k0(null);
                }
            }
            else if (nextName.equals("start")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'start' to null.");
                }
                i.h(jsonReader.nextLong());
            }
            else if (nextName.equals("end")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'end' to null.");
                }
                i.i(jsonReader.nextLong());
            }
            else if (nextName.equals("textColor")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'textColor' to null.");
                }
                i.q(jsonReader.nextInt());
            }
            else if (nextName.equals("backColor")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'backColor' to null.");
                }
                i.w(jsonReader.nextInt());
            }
            else if (nextName.equals("active")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'active' to null.");
                }
                i.s(jsonReader.nextBoolean());
            }
            else if (nextName.equals("displayable")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'displayable' to null.");
                }
                i.Q(jsonReader.nextBoolean());
            }
            else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (b) {
            return f0.G0(i, new q[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }
    
    public static OsObjectSchemaInfo T8() {
        return l4.W;
    }
    
    public static String U8() {
        return "RealmTeacher";
    }
    
    public static long V8(final f0 f0, final i i, final Map<n0, Long> map) {
        if (i instanceof p && !p0.h8(i)) {
            final p p3 = (p)i;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(i.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(i.class);
        final long e = b.e;
        final Long value = i.a();
        long l;
        if (value != null) {
            l = Table.nativeFindFirstInt(nativePtr, e, i.a());
        }
        else {
            l = -1L;
        }
        if (l == -1L) {
            l = OsObject.createRowWithPrimaryKey(x2, e, i.a());
        }
        else {
            Table.v0(value);
        }
        map.put(i, l);
        final String g = i.g();
        if (g != null) {
            Table.nativeSetString(nativePtr, b.f, l, g, false);
        }
        final String b2 = i.B0();
        if (b2 != null) {
            Table.nativeSetString(nativePtr, b.g, l, b2, false);
        }
        final String z0 = i.z0();
        if (z0 != null) {
            Table.nativeSetString(nativePtr, b.h, l, z0, false);
        }
        Table.nativeSetLong(nativePtr, b.i, l, i.d(), false);
        Table.nativeSetLong(nativePtr, b.j, l, i.c(), false);
        Table.nativeSetLong(nativePtr, b.k, l, i.r(), false);
        Table.nativeSetLong(nativePtr, b.l, l, i.u(), false);
        Table.nativeSetBoolean(nativePtr, b.m, l, i.t(), false);
        Table.nativeSetBoolean(nativePtr, b.n, l, i.L(), false);
        return l;
    }
    
    public static void W8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(i.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(i.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final i i = (i)iterator.next();
            if (map.containsKey(i)) {
                continue;
            }
            if (i instanceof p && !p0.h8(i)) {
                final p p3 = (p)i;
                if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                    map.put(i, p3.S6().g().l0());
                    continue;
                }
            }
            final Long value = i.a();
            long l;
            if (value != null) {
                l = Table.nativeFindFirstInt(nativePtr, e, i.a());
            }
            else {
                l = -1L;
            }
            if (l == -1L) {
                l = OsObject.createRowWithPrimaryKey(x2, e, i.a());
            }
            else {
                Table.v0(value);
            }
            map.put(i, l);
            final String g = i.g();
            if (g != null) {
                Table.nativeSetString(nativePtr, b.f, l, g, false);
            }
            final String b2 = i.B0();
            if (b2 != null) {
                Table.nativeSetString(nativePtr, b.g, l, b2, false);
            }
            final String z0 = i.z0();
            if (z0 != null) {
                Table.nativeSetString(nativePtr, b.h, l, z0, false);
            }
            Table.nativeSetLong(nativePtr, b.i, l, i.d(), false);
            Table.nativeSetLong(nativePtr, b.j, l, i.c(), false);
            Table.nativeSetLong(nativePtr, b.k, l, i.r(), false);
            Table.nativeSetLong(nativePtr, b.l, l, i.u(), false);
            Table.nativeSetBoolean(nativePtr, b.m, l, i.t(), false);
            Table.nativeSetBoolean(nativePtr, b.n, l, i.L(), false);
        }
    }
    
    public static long X8(final f0 f0, final i i, final Map<n0, Long> map) {
        if (i instanceof p && !p0.h8(i)) {
            final p p3 = (p)i;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(i.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(i.class);
        final long e = b.e;
        long nativeFindFirstInt;
        if (Long.valueOf(i.a()) != null) {
            nativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, e, i.a());
        }
        else {
            nativeFindFirstInt = -1L;
        }
        long rowWithPrimaryKey = nativeFindFirstInt;
        if (nativeFindFirstInt == -1L) {
            rowWithPrimaryKey = OsObject.createRowWithPrimaryKey(x2, e, i.a());
        }
        map.put(i, rowWithPrimaryKey);
        final String g = i.g();
        final long f2 = b.f;
        if (g != null) {
            Table.nativeSetString(nativePtr, f2, rowWithPrimaryKey, g, false);
        }
        else {
            Table.nativeSetNull(nativePtr, f2, rowWithPrimaryKey, false);
        }
        final String b2 = i.B0();
        final long g2 = b.g;
        if (b2 != null) {
            Table.nativeSetString(nativePtr, g2, rowWithPrimaryKey, b2, false);
        }
        else {
            Table.nativeSetNull(nativePtr, g2, rowWithPrimaryKey, false);
        }
        final String z0 = i.z0();
        final long h = b.h;
        if (z0 != null) {
            Table.nativeSetString(nativePtr, h, rowWithPrimaryKey, z0, false);
        }
        else {
            Table.nativeSetNull(nativePtr, h, rowWithPrimaryKey, false);
        }
        Table.nativeSetLong(nativePtr, b.i, rowWithPrimaryKey, i.d(), false);
        Table.nativeSetLong(nativePtr, b.j, rowWithPrimaryKey, i.c(), false);
        Table.nativeSetLong(nativePtr, b.k, rowWithPrimaryKey, i.r(), false);
        Table.nativeSetLong(nativePtr, b.l, rowWithPrimaryKey, i.u(), false);
        Table.nativeSetBoolean(nativePtr, b.m, rowWithPrimaryKey, i.t(), false);
        Table.nativeSetBoolean(nativePtr, b.n, rowWithPrimaryKey, i.L(), false);
        return rowWithPrimaryKey;
    }
    
    public static void Y8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(i.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(i.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final i i = (i)iterator.next();
            if (map.containsKey(i)) {
                continue;
            }
            if (i instanceof p && !p0.h8(i)) {
                final p p3 = (p)i;
                if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                    map.put(i, p3.S6().g().l0());
                    continue;
                }
            }
            long nativeFindFirstInt;
            if (Long.valueOf(i.a()) != null) {
                nativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, e, i.a());
            }
            else {
                nativeFindFirstInt = -1L;
            }
            long rowWithPrimaryKey = nativeFindFirstInt;
            if (nativeFindFirstInt == -1L) {
                rowWithPrimaryKey = OsObject.createRowWithPrimaryKey(x2, e, i.a());
            }
            map.put(i, rowWithPrimaryKey);
            final String g = i.g();
            if (g != null) {
                Table.nativeSetString(nativePtr, b.f, rowWithPrimaryKey, g, false);
            }
            else {
                Table.nativeSetNull(nativePtr, b.f, rowWithPrimaryKey, false);
            }
            final String b2 = i.B0();
            final long g2 = b.g;
            if (b2 != null) {
                Table.nativeSetString(nativePtr, g2, rowWithPrimaryKey, b2, false);
            }
            else {
                Table.nativeSetNull(nativePtr, g2, rowWithPrimaryKey, false);
            }
            final String z0 = i.z0();
            final long h = b.h;
            if (z0 != null) {
                Table.nativeSetString(nativePtr, h, rowWithPrimaryKey, z0, false);
            }
            else {
                Table.nativeSetNull(nativePtr, h, rowWithPrimaryKey, false);
            }
            Table.nativeSetLong(nativePtr, b.i, rowWithPrimaryKey, i.d(), false);
            Table.nativeSetLong(nativePtr, b.j, rowWithPrimaryKey, i.c(), false);
            Table.nativeSetLong(nativePtr, b.k, rowWithPrimaryKey, i.r(), false);
            Table.nativeSetLong(nativePtr, b.l, rowWithPrimaryKey, i.u(), false);
            Table.nativeSetBoolean(nativePtr, b.m, rowWithPrimaryKey, i.t(), false);
            Table.nativeSetBoolean(nativePtr, b.n, rowWithPrimaryKey, i.L(), false);
        }
    }
    
    static l4 Z8(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(i.class), false, Collections.emptyList());
        final l4 l4 = new l4();
        h.a();
        return l4;
    }
    
    static i a9(final f0 f0, final b b, final i i, final i j, final Map<n0, p> map, final Set<q> set) {
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(i.class), set);
        osObjectBuilder.L(b.e, j.a());
        osObjectBuilder.d0(b.f, j.g());
        osObjectBuilder.d0(b.g, j.B0());
        osObjectBuilder.d0(b.h, j.z0());
        osObjectBuilder.L(b.i, j.d());
        osObjectBuilder.L(b.j, j.c());
        osObjectBuilder.K(b.k, j.r());
        osObjectBuilder.K(b.l, j.u());
        osObjectBuilder.n(b.m, j.t());
        osObjectBuilder.n(b.n, j.L());
        osObjectBuilder.i0();
        return i;
    }
    
    @Override
    public String B0() {
        this.U.f().h();
        return this.U.g().U(this.T.g);
    }
    
    @Override
    public boolean L() {
        this.U.f().h();
        return this.U.g().l(this.T.n);
    }
    
    @Override
    public void Q(final boolean b) {
        if (!this.U.i()) {
            this.U.f().h();
            this.U.g().i(this.T.n, b);
            return;
        }
        if (!this.U.d()) {
            return;
        }
        final r g = this.U.g();
        g.g().j0(this.T.n, g.l0(), b, true);
    }
    
    @Override
    public c0<?> S6() {
        return this.U;
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
    public long c() {
        this.U.f().h();
        return this.U.g().m(this.T.j);
    }
    
    @Override
    public long d() {
        this.U.f().h();
        return this.U.g().m(this.T.i);
    }
    
    @Override
    public void e(final String s) {
        if (this.U.i()) {
            if (!this.U.d()) {
                return;
            }
            final r g = this.U.g();
            if (s != null) {
                g.g().t0(this.T.f, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'name' to null.");
        }
        else {
            this.U.f().h();
            if (s != null) {
                this.U.g().d(this.T.f, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'name' to null.");
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
        final l4 l4 = (l4)o;
        final io.realm.a f = this.U.f();
        final io.realm.a f2 = l4.U.f();
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
        final String i = l4.U.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.U.g().l0() == l4.U.g().l0();
            }
        }
        else if (i == null) {
            return this.U.g().l0() == l4.U.g().l0();
        }
        return false;
    }
    
    @Override
    public String g() {
        this.U.f().h();
        return this.U.g().U(this.T.f);
    }
    
    @Override
    public void h(final long n) {
        if (!this.U.i()) {
            this.U.f().h();
            this.U.g().s(this.T.i, n);
            return;
        }
        if (!this.U.d()) {
            return;
        }
        final r g = this.U.g();
        g.g().q0(this.T.i, g.l0(), n, true);
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
    public void i(final long n) {
        if (!this.U.i()) {
            this.U.f().h();
            this.U.g().s(this.T.j, n);
            return;
        }
        if (!this.U.d()) {
            return;
        }
        final r g = this.U.g();
        g.g().q0(this.T.j, g.l0(), n, true);
    }
    
    @Override
    public void k0(final String s) {
        if (this.U.i()) {
            if (!this.U.d()) {
                return;
            }
            final r g = this.U.g();
            if (s != null) {
                g.g().t0(this.T.h, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'lastName' to null.");
        }
        else {
            this.U.f().h();
            if (s != null) {
                this.U.g().d(this.T.h, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'lastName' to null.");
        }
    }
    
    @Override
    public void q(final int n) {
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
    public int r() {
        this.U.f().h();
        return (int)this.U.g().m(this.T.k);
    }
    
    @Override
    public void s(final boolean b) {
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
    public boolean t() {
        this.U.f().h();
        return this.U.g().l(this.T.m);
    }
    
    @Override
    public String toString() {
        if (!p0.k8(this)) {
            return "Invalid object";
        }
        final StringBuilder sb = new StringBuilder("RealmTeacher = proxy[");
        sb.append("{id:");
        sb.append(this.a());
        sb.append("}");
        sb.append(",");
        sb.append("{name:");
        sb.append(this.g());
        sb.append("}");
        sb.append(",");
        sb.append("{firstName:");
        sb.append(this.B0());
        sb.append("}");
        sb.append(",");
        sb.append("{lastName:");
        sb.append(this.z0());
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
        sb.append("{textColor:");
        sb.append(this.r());
        sb.append("}");
        sb.append(",");
        sb.append("{backColor:");
        sb.append(this.u());
        sb.append("}");
        sb.append(",");
        sb.append("{active:");
        sb.append(this.t());
        sb.append("}");
        sb.append(",");
        sb.append("{displayable:");
        sb.append(this.L());
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
    
    @Override
    public int u() {
        this.U.f().h();
        return (int)this.U.g().m(this.T.l);
    }
    
    @Override
    public void v0(final String s) {
        if (this.U.i()) {
            if (!this.U.d()) {
                return;
            }
            final r g = this.U.g();
            if (s != null) {
                g.g().t0(this.T.g, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'firstName' to null.");
        }
        else {
            this.U.f().h();
            if (s != null) {
                this.U.g().d(this.T.g, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'firstName' to null.");
        }
    }
    
    @Override
    public void w(final int n) {
        if (!this.U.i()) {
            this.U.f().h();
            this.U.g().s(this.T.l, n);
            return;
        }
        if (!this.U.d()) {
            return;
        }
        final r g = this.U.g();
        g.g().q0(this.T.l, g.l0(), n, true);
    }
    
    @Override
    public void y4() {
        if (this.U != null) {
            return;
        }
        final io.realm.a.h h = io.realm.a.W.get();
        this.T = (b)h.c();
        (this.U = new c0<i>(this)).r(h.e());
        this.U.s(h.f());
        this.U.o(h.b());
        this.U.q(h.d());
    }
    
    @Override
    public String z0() {
        this.U.f().h();
        return this.U.g().U(this.T.h);
    }
    
    public static final class a
    {
        public static final String a = "RealmTeacher";
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
            final OsObjectSchemaInfo b = osSchemaInfo.b("RealmTeacher");
            this.e = this.b("id", "id", b);
            this.f = this.b("name", "name", b);
            this.g = this.b("firstName", "firstName", b);
            this.h = this.b("lastName", "lastName", b);
            this.i = this.b("start", "start", b);
            this.j = this.b("end", "end", b);
            this.k = this.b("textColor", "textColor", b);
            this.l = this.b("backColor", "backColor", b);
            this.m = this.b("active", "active", b);
            this.n = this.b("displayable", "displayable", b);
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
