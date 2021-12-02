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
import com.untis.mobile.persistence.realm.period.f;

public class d5 extends f implements p, e5
{
    private static final String N = "";
    private static final OsObjectSchemaInfo O;
    private b L;
    private c0<f> M;
    
    static {
        O = A8();
    }
    
    d5() {
        this.M.p();
    }
    
    private static OsObjectSchemaInfo A8() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmTeacherPair", false, 2, 0);
        final RealmFieldType integer = RealmFieldType.INTEGER;
        b.c("", "original", integer, false, false, true);
        b.c("", "current", integer, false, false, true);
        return b.e();
    }
    
    public static f B8(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final f f2 = f0.q1(f.class, true, Collections.emptyList());
        if (jsonObject.has("original")) {
            if (jsonObject.isNull("original")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'original' to null.");
            }
            f2.R(jsonObject.getLong("original"));
        }
        if (jsonObject.has("current")) {
            if (jsonObject.isNull("current")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'current' to null.");
            }
            f2.M(jsonObject.getLong("current"));
        }
        return f2;
    }
    
    @TargetApi(11)
    public static f C8(final f0 f0, final JsonReader jsonReader) throws IOException {
        final f f2 = new f();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            if (nextName.equals("original")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'original' to null.");
                }
                f2.R(jsonReader.nextLong());
            }
            else if (nextName.equals("current")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'current' to null.");
                }
                f2.M(jsonReader.nextLong());
            }
            else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return f0.y0(f2, new q[0]);
    }
    
    public static OsObjectSchemaInfo D8() {
        return d5.O;
    }
    
    public static String E8() {
        return "RealmTeacherPair";
    }
    
    public static long F8(final f0 f0, final f f2, final Map<n0, Long> map) {
        if (f2 instanceof p && !p0.h8(f2)) {
            final p p3 = (p)f2;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(f.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(f.class);
        final long row = OsObject.createRow(x2);
        map.put(f2, row);
        Table.nativeSetLong(nativePtr, b.e, row, f2.I(), false);
        Table.nativeSetLong(nativePtr, b.f, row, f2.O(), false);
        return row;
    }
    
    public static void G8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(f.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(f.class);
        while (iterator.hasNext()) {
            final f f2 = (f)iterator.next();
            if (map.containsKey(f2)) {
                continue;
            }
            if (f2 instanceof p && !p0.h8(f2)) {
                final p p3 = (p)f2;
                if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                    map.put(f2, p3.S6().g().l0());
                    continue;
                }
            }
            final long row = OsObject.createRow(x2);
            map.put(f2, row);
            Table.nativeSetLong(nativePtr, b.e, row, f2.I(), false);
            Table.nativeSetLong(nativePtr, b.f, row, f2.O(), false);
        }
    }
    
    public static long H8(final f0 f0, final f f2, final Map<n0, Long> map) {
        if (f2 instanceof p && !p0.h8(f2)) {
            final p p3 = (p)f2;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(f.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(f.class);
        final long row = OsObject.createRow(x2);
        map.put(f2, row);
        Table.nativeSetLong(nativePtr, b.e, row, f2.I(), false);
        Table.nativeSetLong(nativePtr, b.f, row, f2.O(), false);
        return row;
    }
    
    public static void I8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(f.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(f.class);
        while (iterator.hasNext()) {
            final f f2 = (f)iterator.next();
            if (map.containsKey(f2)) {
                continue;
            }
            if (f2 instanceof p && !p0.h8(f2)) {
                final p p3 = (p)f2;
                if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                    map.put(f2, p3.S6().g().l0());
                    continue;
                }
            }
            final long row = OsObject.createRow(x2);
            map.put(f2, row);
            Table.nativeSetLong(nativePtr, b.e, row, f2.I(), false);
            Table.nativeSetLong(nativePtr, b.f, row, f2.O(), false);
        }
    }
    
    static d5 J8(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(f.class), false, Collections.emptyList());
        final d5 d5 = new d5();
        h.a();
        return d5;
    }
    
    public static f w8(final f0 f0, final b b, final f f2, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        final d5 d5 = map.get(f2);
        if (d5 != null) {
            return d5;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(f.class), set);
        osObjectBuilder.L(b.e, f2.I());
        osObjectBuilder.L(b.f, f2.O());
        final d5 j8 = J8(f0, osObjectBuilder.f0());
        map.put(f2, j8);
        return j8;
    }
    
    public static f x8(final f0 f0, final b b, final f f2, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        if (f2 instanceof p && !p0.h8(f2)) {
            final p p6 = (p)f2;
            if (p6.S6().f() != null) {
                final io.realm.a f3 = p6.S6().f();
                if (f3.H != f0.H) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
                if (f3.getPath().equals(f0.getPath())) {
                    return f2;
                }
            }
        }
        final io.realm.a.h h = io.realm.a.W.get();
        final p p7 = map.get(f2);
        if (p7 != null) {
            return (f)p7;
        }
        return w8(f0, b, f2, b2, map, set);
    }
    
    public static b y8(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static f z8(final f f, final int a, final int n, final Map<n0, p.a<n0>> map) {
        if (a <= n && f != null) {
            final p.a a2 = map.get(f);
            f f3;
            if (a2 == null) {
                final f f2 = new f();
                map.put(f, (p.a<n0>)new p.a(a, f2));
                f3 = f2;
            }
            else {
                if (a >= a2.a) {
                    return (f)a2.b;
                }
                f3 = (f)a2.b;
                a2.a = a;
            }
            f3.R(f.I());
            f3.M(f.O());
            return f3;
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
        final d5 d5 = (d5)o;
        final io.realm.a f = this.M.f();
        final io.realm.a f2 = d5.M.f();
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
        final String i = d5.M.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.M.g().l0() == d5.M.g().l0();
            }
        }
        else if (i == null) {
            return this.M.g().l0() == d5.M.g().l0();
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
        final StringBuilder sb = new StringBuilder("RealmTeacherPair = proxy[");
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
        (this.M = new c0<f>(this)).r(h.e());
        this.M.s(h.f());
        this.M.o(h.b());
        this.M.q(h.d());
    }
    
    public static final class a
    {
        public static final String a = "RealmTeacherPair";
    }
    
    static final class b extends c
    {
        long e;
        long f;
        
        b(final OsSchemaInfo osSchemaInfo) {
            super(2);
            final OsObjectSchemaInfo b = osSchemaInfo.b("RealmTeacherPair");
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
