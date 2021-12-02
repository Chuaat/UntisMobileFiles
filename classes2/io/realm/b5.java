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
import com.untis.mobile.persistence.realm.period.e;

public class b5 extends e implements p, c5
{
    private static final String N = "";
    private static final OsObjectSchemaInfo O;
    private b L;
    private c0<e> M;
    
    static {
        O = A8();
    }
    
    b5() {
        this.M.p();
    }
    
    private static OsObjectSchemaInfo A8() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmSubjectPair", false, 2, 0);
        final RealmFieldType integer = RealmFieldType.INTEGER;
        b.c("", "original", integer, false, false, true);
        b.c("", "current", integer, false, false, true);
        return b.e();
    }
    
    public static e B8(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final e e = f0.q1(e.class, true, Collections.emptyList());
        if (jsonObject.has("original")) {
            if (jsonObject.isNull("original")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'original' to null.");
            }
            e.R(jsonObject.getLong("original"));
        }
        if (jsonObject.has("current")) {
            if (jsonObject.isNull("current")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'current' to null.");
            }
            e.M(jsonObject.getLong("current"));
        }
        return e;
    }
    
    @TargetApi(11)
    public static e C8(final f0 f0, final JsonReader jsonReader) throws IOException {
        final e e = new e();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            if (nextName.equals("original")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'original' to null.");
                }
                e.R(jsonReader.nextLong());
            }
            else if (nextName.equals("current")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'current' to null.");
                }
                e.M(jsonReader.nextLong());
            }
            else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return f0.y0(e, new q[0]);
    }
    
    public static OsObjectSchemaInfo D8() {
        return b5.O;
    }
    
    public static String E8() {
        return "RealmSubjectPair";
    }
    
    public static long F8(final f0 f0, final e e, final Map<n0, Long> map) {
        if (e instanceof p && !p0.h8(e)) {
            final p p3 = (p)e;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(e.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(e.class);
        final long row = OsObject.createRow(x2);
        map.put(e, row);
        Table.nativeSetLong(nativePtr, b.e, row, e.I(), false);
        Table.nativeSetLong(nativePtr, b.f, row, e.O(), false);
        return row;
    }
    
    public static void G8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(e.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(e.class);
        while (iterator.hasNext()) {
            final e e = (e)iterator.next();
            if (map.containsKey(e)) {
                continue;
            }
            if (e instanceof p && !p0.h8(e)) {
                final p p3 = (p)e;
                if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                    map.put(e, p3.S6().g().l0());
                    continue;
                }
            }
            final long row = OsObject.createRow(x2);
            map.put(e, row);
            Table.nativeSetLong(nativePtr, b.e, row, e.I(), false);
            Table.nativeSetLong(nativePtr, b.f, row, e.O(), false);
        }
    }
    
    public static long H8(final f0 f0, final e e, final Map<n0, Long> map) {
        if (e instanceof p && !p0.h8(e)) {
            final p p3 = (p)e;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(e.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(e.class);
        final long row = OsObject.createRow(x2);
        map.put(e, row);
        Table.nativeSetLong(nativePtr, b.e, row, e.I(), false);
        Table.nativeSetLong(nativePtr, b.f, row, e.O(), false);
        return row;
    }
    
    public static void I8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(e.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(e.class);
        while (iterator.hasNext()) {
            final e e = (e)iterator.next();
            if (map.containsKey(e)) {
                continue;
            }
            if (e instanceof p && !p0.h8(e)) {
                final p p3 = (p)e;
                if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                    map.put(e, p3.S6().g().l0());
                    continue;
                }
            }
            final long row = OsObject.createRow(x2);
            map.put(e, row);
            Table.nativeSetLong(nativePtr, b.e, row, e.I(), false);
            Table.nativeSetLong(nativePtr, b.f, row, e.O(), false);
        }
    }
    
    static b5 J8(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(e.class), false, Collections.emptyList());
        final b5 b5 = new b5();
        h.a();
        return b5;
    }
    
    public static e w8(final f0 f0, final b b, final e e, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        final b5 b3 = map.get(e);
        if (b3 != null) {
            return b3;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(e.class), set);
        osObjectBuilder.L(b.e, e.I());
        osObjectBuilder.L(b.f, e.O());
        final b5 j8 = J8(f0, osObjectBuilder.f0());
        map.put(e, j8);
        return j8;
    }
    
    public static e x8(final f0 f0, final b b, final e e, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        if (e instanceof p && !p0.h8(e)) {
            final p p6 = (p)e;
            if (p6.S6().f() != null) {
                final io.realm.a f2 = p6.S6().f();
                if (f2.H != f0.H) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
                if (f2.getPath().equals(f0.getPath())) {
                    return e;
                }
            }
        }
        final io.realm.a.h h = io.realm.a.W.get();
        final p p7 = map.get(e);
        if (p7 != null) {
            return (e)p7;
        }
        return w8(f0, b, e, b2, map, set);
    }
    
    public static b y8(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static e z8(final e e, final int a, final int n, final Map<n0, p.a<n0>> map) {
        if (a <= n && e != null) {
            final p.a a2 = map.get(e);
            e e3;
            if (a2 == null) {
                final e e2 = new e();
                map.put(e, (p.a<n0>)new p.a(a, e2));
                e3 = e2;
            }
            else {
                if (a >= a2.a) {
                    return (e)a2.b;
                }
                e3 = (e)a2.b;
                a2.a = a;
            }
            e3.R(e.I());
            e3.M(e.O());
            return e3;
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
        final b5 b5 = (b5)o;
        final io.realm.a f = this.M.f();
        final io.realm.a f2 = b5.M.f();
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
        final String i = b5.M.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.M.g().l0() == b5.M.g().l0();
            }
        }
        else if (i == null) {
            return this.M.g().l0() == b5.M.g().l0();
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
        final StringBuilder sb = new StringBuilder("RealmSubjectPair = proxy[");
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
        (this.M = new c0<e>(this)).r(h.e());
        this.M.s(h.f());
        this.M.o(h.b());
        this.M.q(h.d());
    }
    
    public static final class a
    {
        public static final String a = "RealmSubjectPair";
    }
    
    static final class b extends c
    {
        long e;
        long f;
        
        b(final OsSchemaInfo osSchemaInfo) {
            super(2);
            final OsObjectSchemaInfo b = osSchemaInfo.b("RealmSubjectPair");
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
