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
import w4.d;

public class b4 extends d implements p, c4
{
    private static final String U = "";
    private static final OsObjectSchemaInfo V;
    private b S;
    private c0<d> T;
    
    static {
        V = O8();
    }
    
    b4() {
        this.T.p();
    }
    
    public static d K8(final f0 f0, final b b, final d d, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        final b4 b3 = map.get(d);
        if (b3 != null) {
            return b3;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(d.class), set);
        osObjectBuilder.L(b.e, d.a());
        osObjectBuilder.d0(b.f, d.g());
        osObjectBuilder.d0(b.g, d.n());
        osObjectBuilder.L(b.h, d.d());
        osObjectBuilder.L(b.i, d.c());
        osObjectBuilder.K(b.j, d.r());
        osObjectBuilder.K(b.k, d.u());
        osObjectBuilder.n(b.l, d.t());
        osObjectBuilder.n(b.m, d.L());
        final b4 x8 = X8(f0, osObjectBuilder.f0());
        map.put(d, x8);
        return x8;
    }
    
    public static d L8(final f0 f0, final b b, final d d, final boolean b2, final Map<n0, p> map, final Set<q> set) {
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
                final long r = ((Table)x2).r(b.e, d.a());
                if (r == -1L) {
                    b3 = false;
                    x2 = p8;
                    break Label_0232;
                }
                try {
                    h.g(f0, ((Table)x2).R(r), b, false, Collections.emptyList());
                    x2 = new b4();
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
            d2 = Y8(f0, b, (d)x2, d, map, set);
        }
        else {
            d2 = K8(f0, b, d, b2, map, set);
        }
        return d2;
    }
    
    public static b M8(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static d N8(final d d, final int a, final int n, final Map<n0, p.a<n0>> map) {
        if (a <= n && d != null) {
            final p.a a2 = map.get(d);
            d d3;
            if (a2 == null) {
                final d d2 = new d();
                map.put(d, (p.a<n0>)new p.a(a, d2));
                d3 = d2;
            }
            else {
                if (a >= a2.a) {
                    return (d)a2.b;
                }
                d3 = (d)a2.b;
                a2.a = a;
            }
            d3.b(d.a());
            d3.e(d.g());
            d3.m(d.n());
            d3.h(d.d());
            d3.i(d.c());
            d3.q(d.r());
            d3.w(d.u());
            d3.s(d.t());
            d3.Q(d.L());
            return d3;
        }
        return null;
    }
    
    private static OsObjectSchemaInfo O8() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmKlasse", false, 9, 0);
        final RealmFieldType integer = RealmFieldType.INTEGER;
        b.c("", "id", integer, true, false, true);
        final RealmFieldType string = RealmFieldType.STRING;
        b.c("", "name", string, false, false, true);
        b.c("", "longName", string, false, false, true);
        b.c("", "start", integer, false, false, true);
        b.c("", "end", integer, false, false, true);
        b.c("", "textColor", integer, false, false, true);
        b.c("", "backColor", integer, false, false, true);
        final RealmFieldType boolean1 = RealmFieldType.BOOLEAN;
        b.c("", "active", boolean1, false, false, true);
        b.c("", "displayable", boolean1, false, false, true);
        return b.e();
    }
    
    public static d P8(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final List<String> emptyList = Collections.emptyList();
        Object x2 = null;
        Label_0141: {
            if (b) {
                x2 = f0.x2(d.class);
                final long e = ((b)f0.H().j(d.class)).e;
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
                        h.g(f0, ((Table)x2).R(r), f0.H().j(d.class), false, Collections.emptyList());
                        x2 = new b4();
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
            b4 b2;
            if (jsonObject.isNull("id")) {
                b2 = f0.p1((Class<b4>)d.class, null, true, emptyList);
            }
            else {
                b2 = f0.p1((Class<b4>)d.class, jsonObject.getLong("id"), true, emptyList);
            }
            o = b2;
        }
        if (jsonObject.has("name")) {
            if (jsonObject.isNull("name")) {
                ((c4)o).e(null);
            }
            else {
                ((c4)o).e(jsonObject.getString("name"));
            }
        }
        if (jsonObject.has("longName")) {
            if (jsonObject.isNull("longName")) {
                ((c4)o).m(null);
            }
            else {
                ((c4)o).m(jsonObject.getString("longName"));
            }
        }
        if (jsonObject.has("start")) {
            if (jsonObject.isNull("start")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'start' to null.");
            }
            ((c4)o).h(jsonObject.getLong("start"));
        }
        if (jsonObject.has("end")) {
            if (jsonObject.isNull("end")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'end' to null.");
            }
            ((c4)o).i(jsonObject.getLong("end"));
        }
        if (jsonObject.has("textColor")) {
            if (jsonObject.isNull("textColor")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'textColor' to null.");
            }
            ((c4)o).q(jsonObject.getInt("textColor"));
        }
        if (jsonObject.has("backColor")) {
            if (jsonObject.isNull("backColor")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'backColor' to null.");
            }
            ((c4)o).w(jsonObject.getInt("backColor"));
        }
        if (jsonObject.has("active")) {
            if (jsonObject.isNull("active")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'active' to null.");
            }
            ((c4)o).s(jsonObject.getBoolean("active"));
        }
        if (jsonObject.has("displayable")) {
            if (jsonObject.isNull("displayable")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'displayable' to null.");
            }
            ((c4)o).Q(jsonObject.getBoolean("displayable"));
        }
        return (d)o;
    }
    
    @TargetApi(11)
    public static d Q8(final f0 f0, final JsonReader jsonReader) throws IOException {
        final d d = new d();
        jsonReader.beginObject();
        boolean b = false;
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
                d.b(jsonReader.nextLong());
                b = true;
            }
            else if (nextName.equals("name")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    d.e(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    d.e(null);
                }
            }
            else if (nextName.equals("longName")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    d.m(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    d.m(null);
                }
            }
            else if (nextName.equals("start")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'start' to null.");
                }
                d.h(jsonReader.nextLong());
            }
            else if (nextName.equals("end")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'end' to null.");
                }
                d.i(jsonReader.nextLong());
            }
            else if (nextName.equals("textColor")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'textColor' to null.");
                }
                d.q(jsonReader.nextInt());
            }
            else if (nextName.equals("backColor")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'backColor' to null.");
                }
                d.w(jsonReader.nextInt());
            }
            else if (nextName.equals("active")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'active' to null.");
                }
                d.s(jsonReader.nextBoolean());
            }
            else if (nextName.equals("displayable")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'displayable' to null.");
                }
                d.Q(jsonReader.nextBoolean());
            }
            else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (b) {
            return f0.G0(d, new q[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }
    
    public static OsObjectSchemaInfo R8() {
        return b4.V;
    }
    
    public static String S8() {
        return "RealmKlasse";
    }
    
    public static long T8(final f0 f0, final d d, final Map<n0, Long> map) {
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
        final Long value = d.a();
        long l;
        if (value != null) {
            l = Table.nativeFindFirstInt(nativePtr, e, d.a());
        }
        else {
            l = -1L;
        }
        if (l == -1L) {
            l = OsObject.createRowWithPrimaryKey(x2, e, d.a());
        }
        else {
            Table.v0(value);
        }
        map.put(d, l);
        final String g = d.g();
        if (g != null) {
            Table.nativeSetString(nativePtr, b.f, l, g, false);
        }
        final String n = d.n();
        if (n != null) {
            Table.nativeSetString(nativePtr, b.g, l, n, false);
        }
        Table.nativeSetLong(nativePtr, b.h, l, d.d(), false);
        Table.nativeSetLong(nativePtr, b.i, l, d.c(), false);
        Table.nativeSetLong(nativePtr, b.j, l, d.r(), false);
        Table.nativeSetLong(nativePtr, b.k, l, d.u(), false);
        Table.nativeSetBoolean(nativePtr, b.l, l, d.t(), false);
        Table.nativeSetBoolean(nativePtr, b.m, l, d.L(), false);
        return l;
    }
    
    public static void U8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
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
            final Long value = d.a();
            long l;
            if (value != null) {
                l = Table.nativeFindFirstInt(nativePtr, e, d.a());
            }
            else {
                l = -1L;
            }
            if (l == -1L) {
                l = OsObject.createRowWithPrimaryKey(x2, e, d.a());
            }
            else {
                Table.v0(value);
            }
            map.put(d, l);
            final String g = d.g();
            if (g != null) {
                Table.nativeSetString(nativePtr, b.f, l, g, false);
            }
            final String n = d.n();
            if (n != null) {
                Table.nativeSetString(nativePtr, b.g, l, n, false);
            }
            Table.nativeSetLong(nativePtr, b.h, l, d.d(), false);
            Table.nativeSetLong(nativePtr, b.i, l, d.c(), false);
            Table.nativeSetLong(nativePtr, b.j, l, d.r(), false);
            Table.nativeSetLong(nativePtr, b.k, l, d.u(), false);
            Table.nativeSetBoolean(nativePtr, b.l, l, d.t(), false);
            Table.nativeSetBoolean(nativePtr, b.m, l, d.L(), false);
        }
    }
    
    public static long V8(final f0 f0, final d d, final Map<n0, Long> map) {
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
        if (Long.valueOf(d.a()) != null) {
            nativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, e, d.a());
        }
        else {
            nativeFindFirstInt = -1L;
        }
        long rowWithPrimaryKey = nativeFindFirstInt;
        if (nativeFindFirstInt == -1L) {
            rowWithPrimaryKey = OsObject.createRowWithPrimaryKey(x2, e, d.a());
        }
        map.put(d, rowWithPrimaryKey);
        final String g = d.g();
        final long f2 = b.f;
        if (g != null) {
            Table.nativeSetString(nativePtr, f2, rowWithPrimaryKey, g, false);
        }
        else {
            Table.nativeSetNull(nativePtr, f2, rowWithPrimaryKey, false);
        }
        final String n = d.n();
        final long g2 = b.g;
        if (n != null) {
            Table.nativeSetString(nativePtr, g2, rowWithPrimaryKey, n, false);
        }
        else {
            Table.nativeSetNull(nativePtr, g2, rowWithPrimaryKey, false);
        }
        Table.nativeSetLong(nativePtr, b.h, rowWithPrimaryKey, d.d(), false);
        Table.nativeSetLong(nativePtr, b.i, rowWithPrimaryKey, d.c(), false);
        Table.nativeSetLong(nativePtr, b.j, rowWithPrimaryKey, d.r(), false);
        Table.nativeSetLong(nativePtr, b.k, rowWithPrimaryKey, d.u(), false);
        Table.nativeSetBoolean(nativePtr, b.l, rowWithPrimaryKey, d.t(), false);
        Table.nativeSetBoolean(nativePtr, b.m, rowWithPrimaryKey, d.L(), false);
        return rowWithPrimaryKey;
    }
    
    public static void W8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
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
            long nativeFindFirstInt;
            if (Long.valueOf(d.a()) != null) {
                nativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, e, d.a());
            }
            else {
                nativeFindFirstInt = -1L;
            }
            long rowWithPrimaryKey = nativeFindFirstInt;
            if (nativeFindFirstInt == -1L) {
                rowWithPrimaryKey = OsObject.createRowWithPrimaryKey(x2, e, d.a());
            }
            map.put(d, rowWithPrimaryKey);
            final String g = d.g();
            if (g != null) {
                Table.nativeSetString(nativePtr, b.f, rowWithPrimaryKey, g, false);
            }
            else {
                Table.nativeSetNull(nativePtr, b.f, rowWithPrimaryKey, false);
            }
            final String n = d.n();
            final long g2 = b.g;
            if (n != null) {
                Table.nativeSetString(nativePtr, g2, rowWithPrimaryKey, n, false);
            }
            else {
                Table.nativeSetNull(nativePtr, g2, rowWithPrimaryKey, false);
            }
            Table.nativeSetLong(nativePtr, b.h, rowWithPrimaryKey, d.d(), false);
            Table.nativeSetLong(nativePtr, b.i, rowWithPrimaryKey, d.c(), false);
            Table.nativeSetLong(nativePtr, b.j, rowWithPrimaryKey, d.r(), false);
            Table.nativeSetLong(nativePtr, b.k, rowWithPrimaryKey, d.u(), false);
            Table.nativeSetBoolean(nativePtr, b.l, rowWithPrimaryKey, d.t(), false);
            Table.nativeSetBoolean(nativePtr, b.m, rowWithPrimaryKey, d.L(), false);
        }
    }
    
    static b4 X8(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(d.class), false, Collections.emptyList());
        final b4 b4 = new b4();
        h.a();
        return b4;
    }
    
    static d Y8(final f0 f0, final b b, final d d, final d d2, final Map<n0, p> map, final Set<q> set) {
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(d.class), set);
        osObjectBuilder.L(b.e, d2.a());
        osObjectBuilder.d0(b.f, d2.g());
        osObjectBuilder.d0(b.g, d2.n());
        osObjectBuilder.L(b.h, d2.d());
        osObjectBuilder.L(b.i, d2.c());
        osObjectBuilder.K(b.j, d2.r());
        osObjectBuilder.K(b.k, d2.u());
        osObjectBuilder.n(b.l, d2.t());
        osObjectBuilder.n(b.m, d2.L());
        osObjectBuilder.i0();
        return d;
    }
    
    @Override
    public boolean L() {
        this.T.f().h();
        return this.T.g().l(this.S.m);
    }
    
    @Override
    public void Q(final boolean b) {
        if (!this.T.i()) {
            this.T.f().h();
            this.T.g().i(this.S.m, b);
            return;
        }
        if (!this.T.d()) {
            return;
        }
        final r g = this.T.g();
        g.g().j0(this.S.m, g.l0(), b, true);
    }
    
    @Override
    public c0<?> S6() {
        return this.T;
    }
    
    @Override
    public long a() {
        this.T.f().h();
        return this.T.g().m(this.S.e);
    }
    
    @Override
    public void b(final long n) {
        if (this.T.i()) {
            return;
        }
        this.T.f().h();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }
    
    @Override
    public long c() {
        this.T.f().h();
        return this.T.g().m(this.S.i);
    }
    
    @Override
    public long d() {
        this.T.f().h();
        return this.T.g().m(this.S.h);
    }
    
    @Override
    public void e(final String s) {
        if (this.T.i()) {
            if (!this.T.d()) {
                return;
            }
            final r g = this.T.g();
            if (s != null) {
                g.g().t0(this.S.f, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'name' to null.");
        }
        else {
            this.T.f().h();
            if (s != null) {
                this.T.g().d(this.S.f, s);
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
        final b4 b4 = (b4)o;
        final io.realm.a f = this.T.f();
        final io.realm.a f2 = b4.T.f();
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
        final String m = this.T.g().g().M();
        final String i = b4.T.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.T.g().l0() == b4.T.g().l0();
            }
        }
        else if (i == null) {
            return this.T.g().l0() == b4.T.g().l0();
        }
        return false;
    }
    
    @Override
    public String g() {
        this.T.f().h();
        return this.T.g().U(this.S.f);
    }
    
    @Override
    public void h(final long n) {
        if (!this.T.i()) {
            this.T.f().h();
            this.T.g().s(this.S.h, n);
            return;
        }
        if (!this.T.d()) {
            return;
        }
        final r g = this.T.g();
        g.g().q0(this.S.h, g.l0(), n, true);
    }
    
    @Override
    public int hashCode() {
        final String path = this.T.f().getPath();
        final String m = this.T.g().g().M();
        final long l0 = this.T.g().l0();
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
        if (!this.T.i()) {
            this.T.f().h();
            this.T.g().s(this.S.i, n);
            return;
        }
        if (!this.T.d()) {
            return;
        }
        final r g = this.T.g();
        g.g().q0(this.S.i, g.l0(), n, true);
    }
    
    @Override
    public void m(final String s) {
        if (this.T.i()) {
            if (!this.T.d()) {
                return;
            }
            final r g = this.T.g();
            if (s != null) {
                g.g().t0(this.S.g, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'longName' to null.");
        }
        else {
            this.T.f().h();
            if (s != null) {
                this.T.g().d(this.S.g, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'longName' to null.");
        }
    }
    
    @Override
    public String n() {
        this.T.f().h();
        return this.T.g().U(this.S.g);
    }
    
    @Override
    public void q(final int n) {
        if (!this.T.i()) {
            this.T.f().h();
            this.T.g().s(this.S.j, n);
            return;
        }
        if (!this.T.d()) {
            return;
        }
        final r g = this.T.g();
        g.g().q0(this.S.j, g.l0(), n, true);
    }
    
    @Override
    public int r() {
        this.T.f().h();
        return (int)this.T.g().m(this.S.j);
    }
    
    @Override
    public void s(final boolean b) {
        if (!this.T.i()) {
            this.T.f().h();
            this.T.g().i(this.S.l, b);
            return;
        }
        if (!this.T.d()) {
            return;
        }
        final r g = this.T.g();
        g.g().j0(this.S.l, g.l0(), b, true);
    }
    
    @Override
    public boolean t() {
        this.T.f().h();
        return this.T.g().l(this.S.l);
    }
    
    @Override
    public String toString() {
        if (!p0.k8(this)) {
            return "Invalid object";
        }
        final StringBuilder sb = new StringBuilder("RealmKlasse = proxy[");
        sb.append("{id:");
        sb.append(this.a());
        sb.append("}");
        sb.append(",");
        sb.append("{name:");
        sb.append(this.g());
        sb.append("}");
        sb.append(",");
        sb.append("{longName:");
        sb.append(this.n());
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
        this.T.f().h();
        return (int)this.T.g().m(this.S.k);
    }
    
    @Override
    public void w(final int n) {
        if (!this.T.i()) {
            this.T.f().h();
            this.T.g().s(this.S.k, n);
            return;
        }
        if (!this.T.d()) {
            return;
        }
        final r g = this.T.g();
        g.g().q0(this.S.k, g.l0(), n, true);
    }
    
    @Override
    public void y4() {
        if (this.T != null) {
            return;
        }
        final io.realm.a.h h = io.realm.a.W.get();
        this.S = (b)h.c();
        (this.T = new c0<d>(this)).r(h.e());
        this.T.s(h.f());
        this.T.o(h.b());
        this.T.q(h.d());
    }
    
    public static final class a
    {
        public static final String a = "RealmKlasse";
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
        
        b(final OsSchemaInfo osSchemaInfo) {
            super(9);
            final OsObjectSchemaInfo b = osSchemaInfo.b("RealmKlasse");
            this.e = this.b("id", "id", b);
            this.f = this.b("name", "name", b);
            this.g = this.b("longName", "longName", b);
            this.h = this.b("start", "start", b);
            this.i = this.b("end", "end", b);
            this.j = this.b("textColor", "textColor", b);
            this.k = this.b("backColor", "backColor", b);
            this.l = this.b("active", "active", b);
            this.m = this.b("displayable", "displayable", b);
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
        }
    }
}
