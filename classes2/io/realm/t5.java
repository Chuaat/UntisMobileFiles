// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Set;
import io.realm.internal.r;
import java.util.Iterator;
import io.realm.internal.Table;
import io.realm.internal.OsObject;
import android.annotation.TargetApi;
import java.io.IOException;
import android.util.JsonToken;
import android.util.JsonReader;
import org.json.JSONException;
import java.util.Collections;
import org.json.JSONObject;
import java.util.Map;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.p;
import b5.c;

public class t5 extends c implements p, u5
{
    private static final String O = "";
    private static final OsObjectSchemaInfo P;
    private b M;
    private c0<c> N;
    
    static {
        P = C8();
    }
    
    t5() {
        this.N.p();
    }
    
    public static b A8(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static c B8(final c c, final int a, final int n, final Map<n0, p.a<n0>> map) {
        if (a <= n && c != null) {
            final p.a a2 = map.get(c);
            c c3;
            if (a2 == null) {
                final c c2 = new c();
                map.put(c, (p.a<n0>)new p.a(a, c2));
                c3 = c2;
            }
            else {
                if (a >= a2.a) {
                    return (c)a2.b;
                }
                c3 = (c)a2.b;
                a2.a = a;
            }
            c3.e(c.g());
            c3.h(c.d());
            c3.i(c.c());
            return c3;
        }
        return null;
    }
    
    private static OsObjectSchemaInfo C8() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmTimeGridUnit", false, 3, 0);
        b.c("", "name", RealmFieldType.STRING, false, false, true);
        final RealmFieldType integer = RealmFieldType.INTEGER;
        b.c("", "start", integer, false, false, true);
        b.c("", "end", integer, false, false, true);
        return b.e();
    }
    
    public static c D8(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final c c = f0.q1(c.class, true, Collections.emptyList());
        if (jsonObject.has("name")) {
            String string;
            if (jsonObject.isNull("name")) {
                string = null;
            }
            else {
                string = jsonObject.getString("name");
            }
            c.e(string);
        }
        if (jsonObject.has("start")) {
            if (jsonObject.isNull("start")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'start' to null.");
            }
            c.h(jsonObject.getLong("start"));
        }
        if (jsonObject.has("end")) {
            if (jsonObject.isNull("end")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'end' to null.");
            }
            c.i(jsonObject.getLong("end"));
        }
        return c;
    }
    
    @TargetApi(11)
    public static c E8(final f0 f0, final JsonReader jsonReader) throws IOException {
        final c c = new c();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                String nextString;
                if (jsonReader.peek() != JsonToken.NULL) {
                    nextString = jsonReader.nextString();
                }
                else {
                    jsonReader.skipValue();
                    nextString = null;
                }
                c.e(nextString);
            }
            else if (nextName.equals("start")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'start' to null.");
                }
                c.h(jsonReader.nextLong());
            }
            else if (nextName.equals("end")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'end' to null.");
                }
                c.i(jsonReader.nextLong());
            }
            else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return f0.y0(c, new q[0]);
    }
    
    public static OsObjectSchemaInfo F8() {
        return t5.P;
    }
    
    public static String G8() {
        return "RealmTimeGridUnit";
    }
    
    public static long H8(final f0 f0, final c c, final Map<n0, Long> map) {
        if (c instanceof p && !p0.h8(c)) {
            final p p3 = (p)c;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(c.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(c.class);
        final long row = OsObject.createRow(x2);
        map.put(c, row);
        final String g = c.g();
        if (g != null) {
            Table.nativeSetString(nativePtr, b.e, row, g, false);
        }
        Table.nativeSetLong(nativePtr, b.f, row, c.d(), false);
        Table.nativeSetLong(nativePtr, b.g, row, c.c(), false);
        return row;
    }
    
    public static void I8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(c.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(c.class);
        while (iterator.hasNext()) {
            final c c = (c)iterator.next();
            if (map.containsKey(c)) {
                continue;
            }
            if (c instanceof p && !p0.h8(c)) {
                final p p3 = (p)c;
                if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                    map.put(c, p3.S6().g().l0());
                    continue;
                }
            }
            final long row = OsObject.createRow(x2);
            map.put(c, row);
            final String g = c.g();
            if (g != null) {
                Table.nativeSetString(nativePtr, b.e, row, g, false);
            }
            Table.nativeSetLong(nativePtr, b.f, row, c.d(), false);
            Table.nativeSetLong(nativePtr, b.g, row, c.c(), false);
        }
    }
    
    public static long J8(final f0 f0, final c c, final Map<n0, Long> map) {
        if (c instanceof p && !p0.h8(c)) {
            final p p3 = (p)c;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(c.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(c.class);
        final long row = OsObject.createRow(x2);
        map.put(c, row);
        final String g = c.g();
        final long e = b.e;
        if (g != null) {
            Table.nativeSetString(nativePtr, e, row, g, false);
        }
        else {
            Table.nativeSetNull(nativePtr, e, row, false);
        }
        Table.nativeSetLong(nativePtr, b.f, row, c.d(), false);
        Table.nativeSetLong(nativePtr, b.g, row, c.c(), false);
        return row;
    }
    
    public static void K8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(c.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(c.class);
        while (iterator.hasNext()) {
            final c c = (c)iterator.next();
            if (map.containsKey(c)) {
                continue;
            }
            if (c instanceof p && !p0.h8(c)) {
                final p p3 = (p)c;
                if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                    map.put(c, p3.S6().g().l0());
                    continue;
                }
            }
            final long row = OsObject.createRow(x2);
            map.put(c, row);
            final String g = c.g();
            final long e = b.e;
            if (g != null) {
                Table.nativeSetString(nativePtr, e, row, g, false);
            }
            else {
                Table.nativeSetNull(nativePtr, e, row, false);
            }
            Table.nativeSetLong(nativePtr, b.f, row, c.d(), false);
            Table.nativeSetLong(nativePtr, b.g, row, c.c(), false);
        }
    }
    
    static t5 L8(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(c.class), false, Collections.emptyList());
        final t5 t5 = new t5();
        h.a();
        return t5;
    }
    
    public static c y8(final f0 f0, final b b, final c c, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        final t5 t5 = map.get(c);
        if (t5 != null) {
            return t5;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(c.class), set);
        osObjectBuilder.d0(b.e, c.g());
        osObjectBuilder.L(b.f, c.d());
        osObjectBuilder.L(b.g, c.c());
        final t5 l8 = L8(f0, osObjectBuilder.f0());
        map.put(c, l8);
        return l8;
    }
    
    public static c z8(final f0 f0, final b b, final c c, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        if (c instanceof p && !p0.h8(c)) {
            final p p6 = (p)c;
            if (p6.S6().f() != null) {
                final io.realm.a f2 = p6.S6().f();
                if (f2.H != f0.H) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
                if (f2.getPath().equals(f0.getPath())) {
                    return c;
                }
            }
        }
        final io.realm.a.h h = io.realm.a.W.get();
        final p p7 = map.get(c);
        if (p7 != null) {
            return (c)p7;
        }
        return y8(f0, b, c, b2, map, set);
    }
    
    @Override
    public c0<?> S6() {
        return this.N;
    }
    
    @Override
    public long c() {
        this.N.f().h();
        return this.N.g().m(this.M.g);
    }
    
    @Override
    public long d() {
        this.N.f().h();
        return this.N.g().m(this.M.f);
    }
    
    @Override
    public void e(final String s) {
        if (this.N.i()) {
            if (!this.N.d()) {
                return;
            }
            final r g = this.N.g();
            if (s != null) {
                g.g().t0(this.M.e, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'name' to null.");
        }
        else {
            this.N.f().h();
            if (s != null) {
                this.N.g().d(this.M.e, s);
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
        final t5 t5 = (t5)o;
        final io.realm.a f = this.N.f();
        final io.realm.a f2 = t5.N.f();
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
        final String i = t5.N.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.N.g().l0() == t5.N.g().l0();
            }
        }
        else if (i == null) {
            return this.N.g().l0() == t5.N.g().l0();
        }
        return false;
    }
    
    @Override
    public String g() {
        this.N.f().h();
        return this.N.g().U(this.M.e);
    }
    
    @Override
    public void h(final long n) {
        if (!this.N.i()) {
            this.N.f().h();
            this.N.g().s(this.M.f, n);
            return;
        }
        if (!this.N.d()) {
            return;
        }
        final r g = this.N.g();
        g.g().q0(this.M.f, g.l0(), n, true);
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
    public void i(final long n) {
        if (!this.N.i()) {
            this.N.f().h();
            this.N.g().s(this.M.g, n);
            return;
        }
        if (!this.N.d()) {
            return;
        }
        final r g = this.N.g();
        g.g().q0(this.M.g, g.l0(), n, true);
    }
    
    @Override
    public String toString() {
        if (!p0.k8(this)) {
            return "Invalid object";
        }
        final StringBuilder sb = new StringBuilder("RealmTimeGridUnit = proxy[");
        sb.append("{name:");
        sb.append(this.g());
        sb.append("}");
        sb.append(",");
        sb.append("{start:");
        sb.append(this.d());
        sb.append("}");
        sb.append(",");
        sb.append("{end:");
        sb.append(this.c());
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
    
    @Override
    public void y4() {
        if (this.N != null) {
            return;
        }
        final io.realm.a.h h = io.realm.a.W.get();
        this.M = (b)h.c();
        (this.N = new c0<c>(this)).r(h.e());
        this.N.s(h.f());
        this.N.o(h.b());
        this.N.q(h.d());
    }
    
    public static final class a
    {
        public static final String a = "RealmTimeGridUnit";
    }
    
    static final class b extends io.realm.internal.c
    {
        long e;
        long f;
        long g;
        
        b(final OsSchemaInfo osSchemaInfo) {
            super(3);
            final OsObjectSchemaInfo b = osSchemaInfo.b("RealmTimeGridUnit");
            this.e = this.b("name", "name", b);
            this.f = this.b("start", "start", b);
            this.g = this.b("end", "end", b);
        }
        
        b(final io.realm.internal.c c, final boolean b) {
            super(c, b);
            this.d(c, this);
        }
        
        @Override
        protected final io.realm.internal.c c(final boolean b) {
            return new b(this, b);
        }
        
        @Override
        protected final void d(final io.realm.internal.c c, final io.realm.internal.c c2) {
            final b b = (b)c;
            final b b2 = (b)c2;
            b2.e = b.e;
            b2.f = b.f;
            b2.g = b.g;
        }
    }
}
