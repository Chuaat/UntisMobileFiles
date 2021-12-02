// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import io.realm.internal.c;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Set;
import io.realm.internal.r;
import java.util.Iterator;
import io.realm.internal.Table;
import io.realm.internal.OsObject;
import java.util.Map;
import android.annotation.TargetApi;
import java.io.IOException;
import android.util.JsonToken;
import android.util.JsonReader;
import org.json.JSONException;
import java.util.Collections;
import org.json.JSONObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.p;
import com.untis.mobile.persistence.realm.period.d;

public class z4 extends d implements p, a5
{
    private static final String N = "";
    private static final OsObjectSchemaInfo O;
    private b L;
    private c0<d> M;
    
    static {
        O = A8();
    }
    
    z4() {
        this.M.p();
    }
    
    private static OsObjectSchemaInfo A8() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmRoomPair", false, 2, 0);
        final RealmFieldType integer = RealmFieldType.INTEGER;
        b.c("", "original", integer, false, false, true);
        b.c("", "current", integer, false, false, true);
        return b.e();
    }
    
    public static d B8(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final d d = f0.q1(d.class, true, Collections.emptyList());
        if (jsonObject.has("original")) {
            if (jsonObject.isNull("original")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'original' to null.");
            }
            d.R(jsonObject.getLong("original"));
        }
        if (jsonObject.has("current")) {
            if (jsonObject.isNull("current")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'current' to null.");
            }
            d.M(jsonObject.getLong("current"));
        }
        return d;
    }
    
    @TargetApi(11)
    public static d C8(final f0 f0, final JsonReader jsonReader) throws IOException {
        final d d = new d();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            if (nextName.equals("original")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'original' to null.");
                }
                d.R(jsonReader.nextLong());
            }
            else if (nextName.equals("current")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'current' to null.");
                }
                d.M(jsonReader.nextLong());
            }
            else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return f0.y0(d, new q[0]);
    }
    
    public static OsObjectSchemaInfo D8() {
        return z4.O;
    }
    
    public static String E8() {
        return "RealmRoomPair";
    }
    
    public static long F8(final f0 f0, final d d, final Map<n0, Long> map) {
        if (d instanceof p && !p0.h8(d)) {
            final p p3 = (p)d;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(d.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(d.class);
        final long row = OsObject.createRow(x2);
        map.put(d, row);
        Table.nativeSetLong(nativePtr, b.e, row, d.I(), false);
        Table.nativeSetLong(nativePtr, b.f, row, d.O(), false);
        return row;
    }
    
    public static void G8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(d.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(d.class);
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
            final long row = OsObject.createRow(x2);
            map.put(d, row);
            Table.nativeSetLong(nativePtr, b.e, row, d.I(), false);
            Table.nativeSetLong(nativePtr, b.f, row, d.O(), false);
        }
    }
    
    public static long H8(final f0 f0, final d d, final Map<n0, Long> map) {
        if (d instanceof p && !p0.h8(d)) {
            final p p3 = (p)d;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(d.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(d.class);
        final long row = OsObject.createRow(x2);
        map.put(d, row);
        Table.nativeSetLong(nativePtr, b.e, row, d.I(), false);
        Table.nativeSetLong(nativePtr, b.f, row, d.O(), false);
        return row;
    }
    
    public static void I8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(d.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(d.class);
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
            final long row = OsObject.createRow(x2);
            map.put(d, row);
            Table.nativeSetLong(nativePtr, b.e, row, d.I(), false);
            Table.nativeSetLong(nativePtr, b.f, row, d.O(), false);
        }
    }
    
    static z4 J8(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(d.class), false, Collections.emptyList());
        final z4 z4 = new z4();
        h.a();
        return z4;
    }
    
    public static d w8(final f0 f0, final b b, final d d, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        final z4 z4 = map.get(d);
        if (z4 != null) {
            return z4;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(d.class), set);
        osObjectBuilder.L(b.e, d.I());
        osObjectBuilder.L(b.f, d.O());
        final z4 j8 = J8(f0, osObjectBuilder.f0());
        map.put(d, j8);
        return j8;
    }
    
    public static d x8(final f0 f0, final b b, final d d, final boolean b2, final Map<n0, p> map, final Set<q> set) {
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
        return w8(f0, b, d, b2, map, set);
    }
    
    public static b y8(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static d z8(final d d, final int a, final int n, final Map<n0, p.a<n0>> map) {
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
            d3.R(d.I());
            d3.M(d.O());
            return d3;
        }
        return null;
    }
    
    @Override
    public long I() {
        this.M.f().h();
        return this.M.g().m(this.L.e);
    }
    
    @Override
    public void M(final long n) {
        if (!this.M.i()) {
            this.M.f().h();
            this.M.g().s(this.L.f, n);
            return;
        }
        if (!this.M.d()) {
            return;
        }
        final r g = this.M.g();
        g.g().q0(this.L.f, g.l0(), n, true);
    }
    
    @Override
    public long O() {
        this.M.f().h();
        return this.M.g().m(this.L.f);
    }
    
    @Override
    public void R(final long n) {
        if (!this.M.i()) {
            this.M.f().h();
            this.M.g().s(this.L.e, n);
            return;
        }
        if (!this.M.d()) {
            return;
        }
        final r g = this.M.g();
        g.g().q0(this.L.e, g.l0(), n, true);
    }
    
    @Override
    public c0<?> S6() {
        return this.M;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final z4 z4 = (z4)o;
        final io.realm.a f = this.M.f();
        final io.realm.a f2 = z4.M.f();
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
        final String m = this.M.g().g().M();
        final String i = z4.M.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.M.g().l0() == z4.M.g().l0();
            }
        }
        else if (i == null) {
            return this.M.g().l0() == z4.M.g().l0();
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final String path = this.M.f().getPath();
        final String m = this.M.g().g().M();
        final long l0 = this.M.g().l0();
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
    public String toString() {
        if (!p0.k8(this)) {
            return "Invalid object";
        }
        final StringBuilder sb = new StringBuilder("RealmRoomPair = proxy[");
        sb.append("{original:");
        sb.append(this.I());
        sb.append("}");
        sb.append(",");
        sb.append("{current:");
        sb.append(this.O());
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
    
    @Override
    public void y4() {
        if (this.M != null) {
            return;
        }
        final io.realm.a.h h = io.realm.a.W.get();
        this.L = (b)h.c();
        (this.M = new c0<d>(this)).r(h.e());
        this.M.s(h.f());
        this.M.o(h.b());
        this.M.q(h.d());
    }
    
    public static final class a
    {
        public static final String a = "RealmRoomPair";
    }
    
    static final class b extends c
    {
        long e;
        long f;
        
        b(final OsSchemaInfo osSchemaInfo) {
            super(2);
            final OsObjectSchemaInfo b = osSchemaInfo.b("RealmRoomPair");
            this.e = this.b("original", "original", b);
            this.f = this.b("current", "current", b);
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
        }
    }
}
