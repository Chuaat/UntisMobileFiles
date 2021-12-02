// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import io.realm.internal.c;
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
import p4.b;

public class p2 extends p4.b implements p, q2
{
    private static final String O = "";
    private static final OsObjectSchemaInfo P;
    private b M;
    private c0<p4.b> N;
    
    static {
        P = C8();
    }
    
    p2() {
        this.N.p();
    }
    
    public static b A8(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static p4.b B8(final p4.b b, final int a, final int n, final Map<n0, p.a<n0>> map) {
        if (a <= n && b != null) {
            final p.a a2 = map.get(b);
            p4.b b3;
            if (a2 == null) {
                final p4.b b2 = new p4.b();
                map.put(b, (p.a<n0>)new p.a(a, b2));
                b3 = b2;
            }
            else {
                if (a >= a2.a) {
                    return (p4.b)a2.b;
                }
                b3 = (p4.b)a2.b;
                a2.a = a;
            }
            b3.Y(b.y0());
            b3.h(b.d());
            b3.i(b.c());
            return b3;
        }
        return null;
    }
    
    private static OsObjectSchemaInfo C8() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmInvigilator", false, 3, 0);
        final RealmFieldType integer = RealmFieldType.INTEGER;
        b.c("", "teacherId", integer, false, false, true);
        b.c("", "start", integer, false, false, true);
        b.c("", "end", integer, false, false, true);
        return b.e();
    }
    
    public static p4.b D8(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final p4.b b2 = f0.q1(p4.b.class, true, Collections.emptyList());
        if (jsonObject.has("teacherId")) {
            if (jsonObject.isNull("teacherId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'teacherId' to null.");
            }
            b2.Y(jsonObject.getLong("teacherId"));
        }
        if (jsonObject.has("start")) {
            if (jsonObject.isNull("start")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'start' to null.");
            }
            b2.h(jsonObject.getLong("start"));
        }
        if (jsonObject.has("end")) {
            if (jsonObject.isNull("end")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'end' to null.");
            }
            b2.i(jsonObject.getLong("end"));
        }
        return b2;
    }
    
    @TargetApi(11)
    public static p4.b E8(final f0 f0, final JsonReader jsonReader) throws IOException {
        final p4.b b = new p4.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            if (nextName.equals("teacherId")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'teacherId' to null.");
                }
                b.Y(jsonReader.nextLong());
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
            else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return f0.y0(b, new q[0]);
    }
    
    public static OsObjectSchemaInfo F8() {
        return p2.P;
    }
    
    public static String G8() {
        return "RealmInvigilator";
    }
    
    public static long H8(final f0 f0, final p4.b b, final Map<n0, Long> map) {
        if (b instanceof p && !p0.h8(b)) {
            final p p3 = (p)b;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(p4.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b2 = (b)f0.H().j(p4.b.class);
        final long row = OsObject.createRow(x2);
        map.put(b, row);
        Table.nativeSetLong(nativePtr, b2.e, row, b.y0(), false);
        Table.nativeSetLong(nativePtr, b2.f, row, b.d(), false);
        Table.nativeSetLong(nativePtr, b2.g, row, b.c(), false);
        return row;
    }
    
    public static void I8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(p4.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(p4.b.class);
        while (iterator.hasNext()) {
            final p4.b b2 = (p4.b)iterator.next();
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
            final long row = OsObject.createRow(x2);
            map.put(b2, row);
            Table.nativeSetLong(nativePtr, b.e, row, b2.y0(), false);
            Table.nativeSetLong(nativePtr, b.f, row, b2.d(), false);
            Table.nativeSetLong(nativePtr, b.g, row, b2.c(), false);
        }
    }
    
    public static long J8(final f0 f0, final p4.b b, final Map<n0, Long> map) {
        if (b instanceof p && !p0.h8(b)) {
            final p p3 = (p)b;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(p4.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b2 = (b)f0.H().j(p4.b.class);
        final long row = OsObject.createRow(x2);
        map.put(b, row);
        Table.nativeSetLong(nativePtr, b2.e, row, b.y0(), false);
        Table.nativeSetLong(nativePtr, b2.f, row, b.d(), false);
        Table.nativeSetLong(nativePtr, b2.g, row, b.c(), false);
        return row;
    }
    
    public static void K8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(p4.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(p4.b.class);
        while (iterator.hasNext()) {
            final p4.b b2 = (p4.b)iterator.next();
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
            final long row = OsObject.createRow(x2);
            map.put(b2, row);
            Table.nativeSetLong(nativePtr, b.e, row, b2.y0(), false);
            Table.nativeSetLong(nativePtr, b.f, row, b2.d(), false);
            Table.nativeSetLong(nativePtr, b.g, row, b2.c(), false);
        }
    }
    
    static p2 L8(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(p4.b.class), false, Collections.emptyList());
        final p2 p2 = new p2();
        h.a();
        return p2;
    }
    
    public static p4.b y8(final f0 f0, final b b, final p4.b b2, final boolean b3, final Map<n0, p> map, final Set<q> set) {
        final p2 p6 = map.get(b2);
        if (p6 != null) {
            return p6;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(p4.b.class), set);
        osObjectBuilder.L(b.e, b2.y0());
        osObjectBuilder.L(b.f, b2.d());
        osObjectBuilder.L(b.g, b2.c());
        final p2 l8 = L8(f0, osObjectBuilder.f0());
        map.put(b2, l8);
        return l8;
    }
    
    public static p4.b z8(final f0 f0, final b b, final p4.b b2, final boolean b3, final Map<n0, p> map, final Set<q> set) {
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
            return (p4.b)p7;
        }
        return y8(f0, b, b2, b3, map, set);
    }
    
    @Override
    public c0<?> S6() {
        return this.N;
    }
    
    @Override
    public void Y(final long n) {
        if (!this.N.i()) {
            this.N.f().h();
            this.N.g().s(this.M.e, n);
            return;
        }
        if (!this.N.d()) {
            return;
        }
        final r g = this.N.g();
        g.g().q0(this.M.e, g.l0(), n, true);
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
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final p2 p = (p2)o;
        final io.realm.a f = this.N.f();
        final io.realm.a f2 = p.N.f();
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
        final String i = p.N.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.N.g().l0() == p.N.g().l0();
            }
        }
        else if (i == null) {
            return this.N.g().l0() == p.N.g().l0();
        }
        return false;
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
        final StringBuilder sb = new StringBuilder("RealmInvigilator = proxy[");
        sb.append("{teacherId:");
        sb.append(this.y0());
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
    public long y0() {
        this.N.f().h();
        return this.N.g().m(this.M.e);
    }
    
    @Override
    public void y4() {
        if (this.N != null) {
            return;
        }
        final io.realm.a.h h = io.realm.a.W.get();
        this.M = (b)h.c();
        (this.N = new c0<p4.b>(this)).r(h.e());
        this.N.s(h.f());
        this.N.o(h.b());
        this.N.q(h.d());
    }
    
    public static final class a
    {
        public static final String a = "RealmInvigilator";
    }
    
    static final class b extends c
    {
        long e;
        long f;
        long g;
        
        b(final OsSchemaInfo osSchemaInfo) {
            super(3);
            final OsObjectSchemaInfo b = osSchemaInfo.b("RealmInvigilator");
            this.e = this.b("teacherId", "teacherId", b);
            this.f = this.b("start", "start", b);
            this.g = this.b("end", "end", b);
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
