// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import io.realm.internal.c;
import org.json.JSONException;
import org.json.JSONObject;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Set;
import java.util.Collections;
import io.realm.internal.r;
import java.util.Iterator;
import io.realm.internal.Table;
import io.realm.internal.OsObject;
import java.util.Map;
import android.annotation.TargetApi;
import java.io.IOException;
import android.util.JsonToken;
import android.util.JsonReader;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.p;
import com.untis.mobile.persistence.realm.b;

public class z0 extends com.untis.mobile.persistence.realm.b implements p, a1
{
    private static final String M = "";
    private static final OsObjectSchemaInfo N;
    private b K;
    private c0<com.untis.mobile.persistence.realm.b> L;
    
    static {
        N = y8();
    }
    
    z0() {
        this.L.p();
    }
    
    @TargetApi(11)
    public static com.untis.mobile.persistence.realm.b A8(final f0 f0, final JsonReader jsonReader) throws IOException {
        final com.untis.mobile.persistence.realm.b b = new com.untis.mobile.persistence.realm.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("value")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'value' to null.");
                }
                b.Z5(jsonReader.nextLong());
            }
            else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return f0.y0(b, new q[0]);
    }
    
    public static OsObjectSchemaInfo B8() {
        return z0.N;
    }
    
    public static String C8() {
        return "RealmLong";
    }
    
    public static long D8(final f0 f0, final com.untis.mobile.persistence.realm.b b, final Map<n0, Long> map) {
        if (b instanceof p && !p0.h8(b)) {
            final p p3 = (p)b;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(com.untis.mobile.persistence.realm.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b2 = (b)f0.H().j(com.untis.mobile.persistence.realm.b.class);
        final long row = OsObject.createRow(x2);
        map.put(b, row);
        Table.nativeSetLong(nativePtr, b2.e, row, b.l0(), false);
        return row;
    }
    
    public static void E8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(com.untis.mobile.persistence.realm.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(com.untis.mobile.persistence.realm.b.class);
        while (iterator.hasNext()) {
            final com.untis.mobile.persistence.realm.b b2 = (com.untis.mobile.persistence.realm.b)iterator.next();
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
            Table.nativeSetLong(nativePtr, b.e, row, b2.l0(), false);
        }
    }
    
    public static long F8(final f0 f0, final com.untis.mobile.persistence.realm.b b, final Map<n0, Long> map) {
        if (b instanceof p && !p0.h8(b)) {
            final p p3 = (p)b;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(com.untis.mobile.persistence.realm.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b2 = (b)f0.H().j(com.untis.mobile.persistence.realm.b.class);
        final long row = OsObject.createRow(x2);
        map.put(b, row);
        Table.nativeSetLong(nativePtr, b2.e, row, b.l0(), false);
        return row;
    }
    
    public static void G8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(com.untis.mobile.persistence.realm.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(com.untis.mobile.persistence.realm.b.class);
        while (iterator.hasNext()) {
            final com.untis.mobile.persistence.realm.b b2 = (com.untis.mobile.persistence.realm.b)iterator.next();
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
            Table.nativeSetLong(nativePtr, b.e, row, b2.l0(), false);
        }
    }
    
    static z0 H8(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(com.untis.mobile.persistence.realm.b.class), false, Collections.emptyList());
        final z0 z0 = new z0();
        h.a();
        return z0;
    }
    
    public static com.untis.mobile.persistence.realm.b u8(final f0 f0, final b b, final com.untis.mobile.persistence.realm.b b2, final boolean b3, final Map<n0, p> map, final Set<q> set) {
        final z0 z0 = map.get(b2);
        if (z0 != null) {
            return z0;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(com.untis.mobile.persistence.realm.b.class), set);
        osObjectBuilder.L(b.e, b2.l0());
        final z0 h8 = H8(f0, osObjectBuilder.f0());
        map.put(b2, h8);
        return h8;
    }
    
    public static com.untis.mobile.persistence.realm.b v8(final f0 f0, final b b, final com.untis.mobile.persistence.realm.b b2, final boolean b3, final Map<n0, p> map, final Set<q> set) {
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
            return (com.untis.mobile.persistence.realm.b)p7;
        }
        return u8(f0, b, b2, b3, map, set);
    }
    
    public static b w8(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static com.untis.mobile.persistence.realm.b x8(final com.untis.mobile.persistence.realm.b b, final int a, final int n, final Map<n0, p.a<n0>> map) {
        if (a <= n && b != null) {
            final p.a a2 = map.get(b);
            com.untis.mobile.persistence.realm.b b3;
            if (a2 == null) {
                final com.untis.mobile.persistence.realm.b b2 = new com.untis.mobile.persistence.realm.b();
                map.put(b, (p.a<n0>)new p.a(a, b2));
                b3 = b2;
            }
            else {
                if (a >= a2.a) {
                    return (com.untis.mobile.persistence.realm.b)a2.b;
                }
                b3 = (com.untis.mobile.persistence.realm.b)a2.b;
                a2.a = a;
            }
            b3.Z5(b.l0());
            return b3;
        }
        return null;
    }
    
    private static OsObjectSchemaInfo y8() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmLong", false, 1, 0);
        b.c("", "value", RealmFieldType.INTEGER, false, false, true);
        return b.e();
    }
    
    public static com.untis.mobile.persistence.realm.b z8(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final com.untis.mobile.persistence.realm.b b2 = f0.q1(com.untis.mobile.persistence.realm.b.class, true, Collections.emptyList());
        if (jsonObject.has("value")) {
            if (jsonObject.isNull("value")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'value' to null.");
            }
            b2.Z5(jsonObject.getLong("value"));
        }
        return b2;
    }
    
    @Override
    public c0<?> S6() {
        return this.L;
    }
    
    @Override
    public void Z5(final long n) {
        if (!this.L.i()) {
            this.L.f().h();
            this.L.g().s(this.K.e, n);
            return;
        }
        if (!this.L.d()) {
            return;
        }
        final r g = this.L.g();
        g.g().q0(this.K.e, g.l0(), n, true);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final z0 z0 = (z0)o;
        final io.realm.a f = this.L.f();
        final io.realm.a f2 = z0.L.f();
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
        final String m = this.L.g().g().M();
        final String i = z0.L.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.L.g().l0() == z0.L.g().l0();
            }
        }
        else if (i == null) {
            return this.L.g().l0() == z0.L.g().l0();
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final String path = this.L.f().getPath();
        final String m = this.L.g().g().M();
        final long l0 = this.L.g().l0();
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
    public long l0() {
        this.L.f().h();
        return this.L.g().m(this.K.e);
    }
    
    @Override
    public String toString() {
        if (!p0.k8(this)) {
            return "Invalid object";
        }
        final StringBuilder sb = new StringBuilder("RealmLong = proxy[");
        sb.append("{value:");
        sb.append(this.l0());
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
    
    @Override
    public void y4() {
        if (this.L != null) {
            return;
        }
        final io.realm.a.h h = io.realm.a.W.get();
        this.K = (b)h.c();
        (this.L = new c0<com.untis.mobile.persistence.realm.b>(this)).r(h.e());
        this.L.s(h.f());
        this.L.o(h.b());
        this.L.q(h.d());
    }
    
    public static final class a
    {
        public static final String a = "RealmLong";
    }
    
    static final class b extends c
    {
        long e;
        
        b(final OsSchemaInfo osSchemaInfo) {
            super(1);
            this.e = this.b("value", "value", osSchemaInfo.b("RealmLong"));
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
            ((b)c2).e = ((b)c).e;
        }
    }
}
