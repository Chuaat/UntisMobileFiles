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
import m4.b;

public class h2 extends m4.b implements p, i2
{
    private static final String S = "";
    private static final OsObjectSchemaInfo T;
    private b Q;
    private c0<m4.b> R;
    
    static {
        T = K8();
    }
    
    h2() {
        this.R.p();
    }
    
    public static m4.b G8(final f0 f0, final b b, final m4.b b2, final boolean b3, final Map<n0, p> map, final Set<q> set) {
        final h2 h2 = map.get(b2);
        if (h2 != null) {
            return h2;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(m4.b.class), set);
        osObjectBuilder.L(b.e, b2.a());
        osObjectBuilder.L(b.f, b2.C());
        osObjectBuilder.d0(b.g, b2.d());
        osObjectBuilder.d0(b.h, b2.c());
        osObjectBuilder.d0(b.i, b2.f());
        osObjectBuilder.d0(b.j, b2.j0());
        osObjectBuilder.n(b.k, b2.i0());
        final h2 t8 = T8(f0, osObjectBuilder.f0());
        map.put(b2, t8);
        return t8;
    }
    
    public static m4.b H8(final f0 f0, final b b, final m4.b b2, final boolean b3, final Map<n0, p> map, final Set<q> set) {
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
            return (m4.b)p7;
        }
        final p p8 = null;
        Object x2 = null;
        boolean b4 = false;
        Label_0232: {
            if (b3) {
                x2 = f0.x2(m4.b.class);
                final long r = ((Table)x2).r(b.e, b2.a());
                if (r == -1L) {
                    b4 = false;
                    x2 = p8;
                    break Label_0232;
                }
                try {
                    h.g(f0, ((Table)x2).R(r), b, false, Collections.emptyList());
                    x2 = new h2();
                    map.put(b2, (p)x2);
                }
                finally {
                    h.a();
                }
            }
            b4 = b3;
        }
        m4.b b5;
        if (b4) {
            b5 = U8(f0, b, (m4.b)x2, b2, map, set);
        }
        else {
            b5 = G8(f0, b, b2, b3, map, set);
        }
        return b5;
    }
    
    public static b I8(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static m4.b J8(final m4.b b, final int a, final int n, final Map<n0, p.a<n0>> map) {
        if (a <= n && b != null) {
            final p.a a2 = map.get(b);
            m4.b b3;
            if (a2 == null) {
                final m4.b b2 = new m4.b();
                map.put(b, (p.a<n0>)new p.a(a, b2));
                b3 = b2;
            }
            else {
                if (a >= a2.a) {
                    return (m4.b)a2.b;
                }
                b3 = (m4.b)a2.b;
                a2.a = a;
            }
            b3.b(b.a());
            b3.G(b.C());
            b3.v(b.d());
            b3.x(b.c());
            b3.j(b.f());
            b3.e0(b.j0());
            b3.c0(b.i0());
            return b3;
        }
        return null;
    }
    
    private static OsObjectSchemaInfo K8() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmLocalHomework", false, 7, 0);
        final RealmFieldType integer = RealmFieldType.INTEGER;
        b.c("", "id", integer, true, false, true);
        b.c("", "lessonId", integer, false, false, true);
        final RealmFieldType string = RealmFieldType.STRING;
        b.c("", "start", string, false, false, true);
        b.c("", "end", string, false, false, true);
        b.c("", "text", string, false, false, true);
        b.c("", "remark", string, false, false, true);
        b.c("", "completed", RealmFieldType.BOOLEAN, false, false, true);
        return b.e();
    }
    
    public static m4.b L8(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final List<String> emptyList = Collections.emptyList();
        Object x2 = null;
        Label_0141: {
            if (b) {
                x2 = f0.x2(m4.b.class);
                final long e = ((b)f0.H().j(m4.b.class)).e;
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
                        h.g(f0, ((Table)x2).R(r), f0.H().j(m4.b.class), false, Collections.emptyList());
                        x2 = new h2();
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
            h2 h2;
            if (jsonObject.isNull("id")) {
                h2 = f0.p1((Class<h2>)m4.b.class, null, true, emptyList);
            }
            else {
                h2 = f0.p1((Class<h2>)m4.b.class, jsonObject.getLong("id"), true, emptyList);
            }
            o = h2;
        }
        if (jsonObject.has("lessonId")) {
            if (jsonObject.isNull("lessonId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'lessonId' to null.");
            }
            ((i2)o).G(jsonObject.getLong("lessonId"));
        }
        if (jsonObject.has("start")) {
            if (jsonObject.isNull("start")) {
                ((i2)o).v(null);
            }
            else {
                ((i2)o).v(jsonObject.getString("start"));
            }
        }
        if (jsonObject.has("end")) {
            if (jsonObject.isNull("end")) {
                ((i2)o).x(null);
            }
            else {
                ((i2)o).x(jsonObject.getString("end"));
            }
        }
        if (jsonObject.has("text")) {
            if (jsonObject.isNull("text")) {
                ((i2)o).j(null);
            }
            else {
                ((i2)o).j(jsonObject.getString("text"));
            }
        }
        if (jsonObject.has("remark")) {
            if (jsonObject.isNull("remark")) {
                ((i2)o).e0(null);
            }
            else {
                ((i2)o).e0(jsonObject.getString("remark"));
            }
        }
        if (jsonObject.has("completed")) {
            if (jsonObject.isNull("completed")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'completed' to null.");
            }
            ((i2)o).c0(jsonObject.getBoolean("completed"));
        }
        return (m4.b)o;
    }
    
    @TargetApi(11)
    public static m4.b M8(final f0 f0, final JsonReader jsonReader) throws IOException {
        final m4.b b = new m4.b();
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
            else if (nextName.equals("lessonId")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'lessonId' to null.");
                }
                b.G(jsonReader.nextLong());
            }
            else if (nextName.equals("start")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    b.v(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    b.v(null);
                }
            }
            else if (nextName.equals("end")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    b.x(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    b.x(null);
                }
            }
            else if (nextName.equals("text")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    b.j(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    b.j(null);
                }
            }
            else if (nextName.equals("remark")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    b.e0(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    b.e0(null);
                }
            }
            else if (nextName.equals("completed")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'completed' to null.");
                }
                b.c0(jsonReader.nextBoolean());
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
        return h2.T;
    }
    
    public static String O8() {
        return "RealmLocalHomework";
    }
    
    public static long P8(final f0 f0, final m4.b b, final Map<n0, Long> map) {
        if (b instanceof p && !p0.h8(b)) {
            final p p3 = (p)b;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(m4.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b2 = (b)f0.H().j(m4.b.class);
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
        Table.nativeSetLong(nativePtr, b2.f, l, b.C(), false);
        final String d = b.d();
        if (d != null) {
            Table.nativeSetString(nativePtr, b2.g, l, d, false);
        }
        final String c = b.c();
        if (c != null) {
            Table.nativeSetString(nativePtr, b2.h, l, c, false);
        }
        final String f2 = b.f();
        if (f2 != null) {
            Table.nativeSetString(nativePtr, b2.i, l, f2, false);
        }
        final String j0 = b.j0();
        if (j0 != null) {
            Table.nativeSetString(nativePtr, b2.j, l, j0, false);
        }
        Table.nativeSetBoolean(nativePtr, b2.k, l, b.i0(), false);
        return l;
    }
    
    public static void Q8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(m4.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(m4.b.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final m4.b b2 = (m4.b)iterator.next();
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
            Table.nativeSetLong(nativePtr, b.f, l, b2.C(), false);
            final String d = b2.d();
            if (d != null) {
                Table.nativeSetString(nativePtr, b.g, l, d, false);
            }
            final String c = b2.c();
            if (c != null) {
                Table.nativeSetString(nativePtr, b.h, l, c, false);
            }
            final String f2 = b2.f();
            if (f2 != null) {
                Table.nativeSetString(nativePtr, b.i, l, f2, false);
            }
            final String j0 = b2.j0();
            if (j0 != null) {
                Table.nativeSetString(nativePtr, b.j, l, j0, false);
            }
            Table.nativeSetBoolean(nativePtr, b.k, l, b2.i0(), false);
        }
    }
    
    public static long R8(final f0 f0, final m4.b b, final Map<n0, Long> map) {
        if (b instanceof p && !p0.h8(b)) {
            final p p3 = (p)b;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(m4.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b2 = (b)f0.H().j(m4.b.class);
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
        Table.nativeSetLong(nativePtr, b2.f, rowWithPrimaryKey, b.C(), false);
        final String d = b.d();
        final long g = b2.g;
        if (d != null) {
            Table.nativeSetString(nativePtr, g, rowWithPrimaryKey, d, false);
        }
        else {
            Table.nativeSetNull(nativePtr, g, rowWithPrimaryKey, false);
        }
        final String c = b.c();
        final long h = b2.h;
        if (c != null) {
            Table.nativeSetString(nativePtr, h, rowWithPrimaryKey, c, false);
        }
        else {
            Table.nativeSetNull(nativePtr, h, rowWithPrimaryKey, false);
        }
        final String f2 = b.f();
        final long i = b2.i;
        if (f2 != null) {
            Table.nativeSetString(nativePtr, i, rowWithPrimaryKey, f2, false);
        }
        else {
            Table.nativeSetNull(nativePtr, i, rowWithPrimaryKey, false);
        }
        final String j0 = b.j0();
        final long k = b2.j;
        if (j0 != null) {
            Table.nativeSetString(nativePtr, k, rowWithPrimaryKey, j0, false);
        }
        else {
            Table.nativeSetNull(nativePtr, k, rowWithPrimaryKey, false);
        }
        Table.nativeSetBoolean(nativePtr, b2.k, rowWithPrimaryKey, b.i0(), false);
        return rowWithPrimaryKey;
    }
    
    public static void S8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(m4.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(m4.b.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final m4.b b2 = (m4.b)iterator.next();
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
            Table.nativeSetLong(nativePtr, b.f, rowWithPrimaryKey, b2.C(), false);
            final String d = b2.d();
            final long g = b.g;
            if (d != null) {
                Table.nativeSetString(nativePtr, g, rowWithPrimaryKey, d, false);
            }
            else {
                Table.nativeSetNull(nativePtr, g, rowWithPrimaryKey, false);
            }
            final String c = b2.c();
            final long h = b.h;
            if (c != null) {
                Table.nativeSetString(nativePtr, h, rowWithPrimaryKey, c, false);
            }
            else {
                Table.nativeSetNull(nativePtr, h, rowWithPrimaryKey, false);
            }
            final String f2 = b2.f();
            final long i = b.i;
            if (f2 != null) {
                Table.nativeSetString(nativePtr, i, rowWithPrimaryKey, f2, false);
            }
            else {
                Table.nativeSetNull(nativePtr, i, rowWithPrimaryKey, false);
            }
            final String j0 = b2.j0();
            final long k = b.j;
            if (j0 != null) {
                Table.nativeSetString(nativePtr, k, rowWithPrimaryKey, j0, false);
            }
            else {
                Table.nativeSetNull(nativePtr, k, rowWithPrimaryKey, false);
            }
            Table.nativeSetBoolean(nativePtr, b.k, rowWithPrimaryKey, b2.i0(), false);
        }
    }
    
    static h2 T8(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(m4.b.class), false, Collections.emptyList());
        final h2 h2 = new h2();
        h.a();
        return h2;
    }
    
    static m4.b U8(final f0 f0, final b b, final m4.b b2, final m4.b b3, final Map<n0, p> map, final Set<q> set) {
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(m4.b.class), set);
        osObjectBuilder.L(b.e, b3.a());
        osObjectBuilder.L(b.f, b3.C());
        osObjectBuilder.d0(b.g, b3.d());
        osObjectBuilder.d0(b.h, b3.c());
        osObjectBuilder.d0(b.i, b3.f());
        osObjectBuilder.d0(b.j, b3.j0());
        osObjectBuilder.n(b.k, b3.i0());
        osObjectBuilder.i0();
        return b2;
    }
    
    @Override
    public long C() {
        this.R.f().h();
        return this.R.g().m(this.Q.f);
    }
    
    @Override
    public void G(final long n) {
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
    public c0<?> S6() {
        return this.R;
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
    public String c() {
        this.R.f().h();
        return this.R.g().U(this.Q.h);
    }
    
    @Override
    public void c0(final boolean b) {
        if (!this.R.i()) {
            this.R.f().h();
            this.R.g().i(this.Q.k, b);
            return;
        }
        if (!this.R.d()) {
            return;
        }
        final r g = this.R.g();
        g.g().j0(this.Q.k, g.l0(), b, true);
    }
    
    @Override
    public String d() {
        this.R.f().h();
        return this.R.g().U(this.Q.g);
    }
    
    @Override
    public void e0(final String s) {
        if (this.R.i()) {
            if (!this.R.d()) {
                return;
            }
            final r g = this.R.g();
            if (s != null) {
                g.g().t0(this.Q.j, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'remark' to null.");
        }
        else {
            this.R.f().h();
            if (s != null) {
                this.R.g().d(this.Q.j, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'remark' to null.");
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
        final h2 h2 = (h2)o;
        final io.realm.a f = this.R.f();
        final io.realm.a f2 = h2.R.f();
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
        final String i = h2.R.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.R.g().l0() == h2.R.g().l0();
            }
        }
        else if (i == null) {
            return this.R.g().l0() == h2.R.g().l0();
        }
        return false;
    }
    
    @Override
    public String f() {
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
    public boolean i0() {
        this.R.f().h();
        return this.R.g().l(this.Q.k);
    }
    
    @Override
    public void j(final String s) {
        if (this.R.i()) {
            if (!this.R.d()) {
                return;
            }
            final r g = this.R.g();
            if (s != null) {
                g.g().t0(this.Q.i, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'text' to null.");
        }
        else {
            this.R.f().h();
            if (s != null) {
                this.R.g().d(this.Q.i, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'text' to null.");
        }
    }
    
    @Override
    public String j0() {
        this.R.f().h();
        return this.R.g().U(this.Q.j);
    }
    
    @Override
    public String toString() {
        if (!p0.k8(this)) {
            return "Invalid object";
        }
        final StringBuilder sb = new StringBuilder("RealmLocalHomework = proxy[");
        sb.append("{id:");
        sb.append(this.a());
        sb.append("}");
        sb.append(",");
        sb.append("{lessonId:");
        sb.append(this.C());
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
        sb.append("{text:");
        sb.append(this.f());
        sb.append("}");
        sb.append(",");
        sb.append("{remark:");
        sb.append(this.j0());
        sb.append("}");
        sb.append(",");
        sb.append("{completed:");
        sb.append(this.i0());
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
    
    @Override
    public void v(final String s) {
        if (this.R.i()) {
            if (!this.R.d()) {
                return;
            }
            final r g = this.R.g();
            if (s != null) {
                g.g().t0(this.Q.g, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'start' to null.");
        }
        else {
            this.R.f().h();
            if (s != null) {
                this.R.g().d(this.Q.g, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'start' to null.");
        }
    }
    
    @Override
    public void x(final String s) {
        if (this.R.i()) {
            if (!this.R.d()) {
                return;
            }
            final r g = this.R.g();
            if (s != null) {
                g.g().t0(this.Q.h, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'end' to null.");
        }
        else {
            this.R.f().h();
            if (s != null) {
                this.R.g().d(this.Q.h, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'end' to null.");
        }
    }
    
    @Override
    public void y4() {
        if (this.R != null) {
            return;
        }
        final io.realm.a.h h = io.realm.a.W.get();
        this.Q = (b)h.c();
        (this.R = new c0<m4.b>(this)).r(h.e());
        this.R.s(h.f());
        this.R.o(h.b());
        this.R.q(h.d());
    }
    
    public static final class a
    {
        public static final String a = "RealmLocalHomework";
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
            final OsObjectSchemaInfo b = osSchemaInfo.b("RealmLocalHomework");
            this.e = this.b("id", "id", b);
            this.f = this.b("lessonId", "lessonId", b);
            this.g = this.b("start", "start", b);
            this.h = this.b("end", "end", b);
            this.i = this.b("text", "text", b);
            this.j = this.b("remark", "remark", b);
            this.k = this.b("completed", "completed", b);
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
