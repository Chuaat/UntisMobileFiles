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
import j4.d;

public class t1 extends d implements p, u1
{
    private static final String P = "";
    private static final OsObjectSchemaInfo Q;
    private b N;
    private c0<d> O;
    
    static {
        Q = E8();
    }
    
    t1() {
        this.O.p();
    }
    
    public static d A8(final f0 f0, final b b, final d d, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        final t1 t1 = map.get(d);
        if (t1 != null) {
            return t1;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(d.class), set);
        osObjectBuilder.L(b.e, d.a());
        osObjectBuilder.d0(b.f, d.g());
        osObjectBuilder.d0(b.g, d.n());
        osObjectBuilder.n(b.h, d.S());
        final t1 n8 = N8(f0, osObjectBuilder.f0());
        map.put(d, n8);
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
                final long r = ((Table)x2).r(b.e, d.a());
                if (r == -1L) {
                    b3 = false;
                    x2 = p8;
                    break Label_0232;
                }
                try {
                    h.g(f0, ((Table)x2).R(r), b, false, Collections.emptyList());
                    x2 = new t1();
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
            d3.N(d.S());
            return d3;
        }
        return null;
    }
    
    private static OsObjectSchemaInfo E8() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmExcuseStatus", false, 4, 0);
        b.c("", "id", RealmFieldType.INTEGER, true, false, true);
        final RealmFieldType string = RealmFieldType.STRING;
        b.c("", "name", string, false, false, true);
        b.c("", "longName", string, false, false, true);
        b.c("", "excused", RealmFieldType.BOOLEAN, false, false, true);
        return b.e();
    }
    
    public static d F8(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final List<String> emptyList = Collections.emptyList();
        Object x2 = null;
        Label_0139: {
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
                        x2 = new t1();
                        break Label_0139;
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
            t1 t1;
            if (jsonObject.isNull("id")) {
                t1 = f0.p1((Class<t1>)d.class, null, true, emptyList);
            }
            else {
                t1 = f0.p1((Class<t1>)d.class, jsonObject.getLong("id"), true, emptyList);
            }
            o = t1;
        }
        if (jsonObject.has("name")) {
            if (jsonObject.isNull("name")) {
                ((u1)o).e(null);
            }
            else {
                ((u1)o).e(jsonObject.getString("name"));
            }
        }
        if (jsonObject.has("longName")) {
            if (jsonObject.isNull("longName")) {
                ((u1)o).m(null);
            }
            else {
                ((u1)o).m(jsonObject.getString("longName"));
            }
        }
        if (jsonObject.has("excused")) {
            if (jsonObject.isNull("excused")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'excused' to null.");
            }
            ((u1)o).N(jsonObject.getBoolean("excused"));
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
            else if (nextName.equals("excused")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'excused' to null.");
                }
                d.N(jsonReader.nextBoolean());
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
    
    public static OsObjectSchemaInfo H8() {
        return t1.Q;
    }
    
    public static String I8() {
        return "RealmExcuseStatus";
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
        Table.nativeSetBoolean(nativePtr, b.h, l, d.S(), false);
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
            Table.nativeSetBoolean(nativePtr, b.h, l, d.S(), false);
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
        Table.nativeSetBoolean(nativePtr, b.h, rowWithPrimaryKey, d.S(), false);
        return rowWithPrimaryKey;
    }
    
    public static void M8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
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
            Table.nativeSetBoolean(nativePtr, b.h, rowWithPrimaryKey, d.S(), false);
        }
    }
    
    static t1 N8(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(d.class), false, Collections.emptyList());
        final t1 t1 = new t1();
        h.a();
        return t1;
    }
    
    static d O8(final f0 f0, final b b, final d d, final d d2, final Map<n0, p> map, final Set<q> set) {
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(d.class), set);
        osObjectBuilder.L(b.e, d2.a());
        osObjectBuilder.d0(b.f, d2.g());
        osObjectBuilder.d0(b.g, d2.n());
        osObjectBuilder.n(b.h, d2.S());
        osObjectBuilder.i0();
        return d;
    }
    
    @Override
    public void N(final boolean b) {
        if (!this.O.i()) {
            this.O.f().h();
            this.O.g().i(this.N.h, b);
            return;
        }
        if (!this.O.d()) {
            return;
        }
        final r g = this.O.g();
        g.g().j0(this.N.h, g.l0(), b, true);
    }
    
    @Override
    public boolean S() {
        this.O.f().h();
        return this.O.g().l(this.N.h);
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
    public void b(final long n) {
        if (this.O.i()) {
            return;
        }
        this.O.f().h();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }
    
    @Override
    public void e(final String s) {
        if (this.O.i()) {
            if (!this.O.d()) {
                return;
            }
            final r g = this.O.g();
            if (s != null) {
                g.g().t0(this.N.f, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'name' to null.");
        }
        else {
            this.O.f().h();
            if (s != null) {
                this.O.g().d(this.N.f, s);
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
        final t1 t1 = (t1)o;
        final io.realm.a f = this.O.f();
        final io.realm.a f2 = t1.O.f();
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
        final String i = t1.O.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.O.g().l0() == t1.O.g().l0();
            }
        }
        else if (i == null) {
            return this.O.g().l0() == t1.O.g().l0();
        }
        return false;
    }
    
    @Override
    public String g() {
        this.O.f().h();
        return this.O.g().U(this.N.f);
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
    public void m(final String s) {
        if (this.O.i()) {
            if (!this.O.d()) {
                return;
            }
            final r g = this.O.g();
            if (s != null) {
                g.g().t0(this.N.g, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'longName' to null.");
        }
        else {
            this.O.f().h();
            if (s != null) {
                this.O.g().d(this.N.g, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'longName' to null.");
        }
    }
    
    @Override
    public String n() {
        this.O.f().h();
        return this.O.g().U(this.N.g);
    }
    
    @Override
    public String toString() {
        if (!p0.k8(this)) {
            return "Invalid object";
        }
        final StringBuilder sb = new StringBuilder("RealmExcuseStatus = proxy[");
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
        sb.append("{excused:");
        sb.append(this.S());
        sb.append("}");
        sb.append("]");
        return sb.toString();
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
        public static final String a = "RealmExcuseStatus";
    }
    
    static final class b extends c
    {
        long e;
        long f;
        long g;
        long h;
        
        b(final OsSchemaInfo osSchemaInfo) {
            super(4);
            final OsObjectSchemaInfo b = osSchemaInfo.b("RealmExcuseStatus");
            this.e = this.b("id", "id", b);
            this.f = this.b("name", "name", b);
            this.g = this.b("longName", "longName", b);
            this.h = this.b("excused", "excused", b);
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
