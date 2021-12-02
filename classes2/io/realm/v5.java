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
import c5.a;

public class v5 extends c5.a implements p, w5
{
    private static final String M = "";
    private static final OsObjectSchemaInfo N;
    private b K;
    private c0<c5.a> L;
    
    static {
        N = y8();
    }
    
    v5() {
        this.L.p();
    }
    
    @TargetApi(11)
    public static c5.a A8(final f0 f0, final JsonReader jsonReader) throws IOException {
        final c5.a a = new c5.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("holidayId")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'holidayId' to null.");
                }
                a.B4(jsonReader.nextLong());
            }
            else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return f0.y0(a, new q[0]);
    }
    
    public static OsObjectSchemaInfo B8() {
        return v5.N;
    }
    
    public static String C8() {
        return "RealmHolidayModel";
    }
    
    public static long D8(final f0 f0, final c5.a a, final Map<n0, Long> map) {
        if (a instanceof p && !p0.h8(a)) {
            final p p3 = (p)a;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(c5.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(c5.a.class);
        final long row = OsObject.createRow(x2);
        map.put(a, row);
        Table.nativeSetLong(nativePtr, b.e, row, a.q3(), false);
        return row;
    }
    
    public static void E8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(c5.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(c5.a.class);
        while (iterator.hasNext()) {
            final c5.a a = (c5.a)iterator.next();
            if (map.containsKey(a)) {
                continue;
            }
            if (a instanceof p && !p0.h8(a)) {
                final p p3 = (p)a;
                if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                    map.put(a, p3.S6().g().l0());
                    continue;
                }
            }
            final long row = OsObject.createRow(x2);
            map.put(a, row);
            Table.nativeSetLong(nativePtr, b.e, row, a.q3(), false);
        }
    }
    
    public static long F8(final f0 f0, final c5.a a, final Map<n0, Long> map) {
        if (a instanceof p && !p0.h8(a)) {
            final p p3 = (p)a;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(c5.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(c5.a.class);
        final long row = OsObject.createRow(x2);
        map.put(a, row);
        Table.nativeSetLong(nativePtr, b.e, row, a.q3(), false);
        return row;
    }
    
    public static void G8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(c5.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(c5.a.class);
        while (iterator.hasNext()) {
            final c5.a a = (c5.a)iterator.next();
            if (map.containsKey(a)) {
                continue;
            }
            if (a instanceof p && !p0.h8(a)) {
                final p p3 = (p)a;
                if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                    map.put(a, p3.S6().g().l0());
                    continue;
                }
            }
            final long row = OsObject.createRow(x2);
            map.put(a, row);
            Table.nativeSetLong(nativePtr, b.e, row, a.q3(), false);
        }
    }
    
    static v5 H8(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(c5.a.class), false, Collections.emptyList());
        final v5 v5 = new v5();
        h.a();
        return v5;
    }
    
    public static c5.a u8(final f0 f0, final b b, final c5.a a, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        final v5 v5 = map.get(a);
        if (v5 != null) {
            return v5;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(c5.a.class), set);
        osObjectBuilder.L(b.e, a.q3());
        final v5 h8 = H8(f0, osObjectBuilder.f0());
        map.put(a, h8);
        return h8;
    }
    
    public static c5.a v8(final f0 f0, final b b, final c5.a a, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        if (a instanceof p && !p0.h8(a)) {
            final p p6 = (p)a;
            if (p6.S6().f() != null) {
                final io.realm.a f2 = p6.S6().f();
                if (f2.H != f0.H) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
                if (f2.getPath().equals(f0.getPath())) {
                    return a;
                }
            }
        }
        final io.realm.a.h h = a.W.get();
        final p p7 = map.get(a);
        if (p7 != null) {
            return (c5.a)p7;
        }
        return u8(f0, b, a, b2, map, set);
    }
    
    public static b w8(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static c5.a x8(final c5.a a, final int a2, final int n, final Map<n0, p.a<n0>> map) {
        if (a2 <= n && a != null) {
            final p.a a3 = map.get(a);
            c5.a a5;
            if (a3 == null) {
                final c5.a a4 = new c5.a();
                map.put(a, (p.a<n0>)new p.a(a2, a4));
                a5 = a4;
            }
            else {
                if (a2 >= a3.a) {
                    return (c5.a)a3.b;
                }
                a5 = (c5.a)a3.b;
                a3.a = a2;
            }
            a5.B4(a.q3());
            return a5;
        }
        return null;
    }
    
    private static OsObjectSchemaInfo y8() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmHolidayModel", false, 1, 0);
        b.c("", "holidayId", RealmFieldType.INTEGER, false, false, true);
        return b.e();
    }
    
    public static c5.a z8(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final c5.a a = f0.q1(c5.a.class, true, Collections.emptyList());
        if (jsonObject.has("holidayId")) {
            if (jsonObject.isNull("holidayId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'holidayId' to null.");
            }
            a.B4(jsonObject.getLong("holidayId"));
        }
        return a;
    }
    
    @Override
    public void B4(final long n) {
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
    public c0<?> S6() {
        return this.L;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final v5 v5 = (v5)o;
        final io.realm.a f = this.L.f();
        final io.realm.a f2 = v5.L.f();
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
        final String i = v5.L.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.L.g().l0() == v5.L.g().l0();
            }
        }
        else if (i == null) {
            return this.L.g().l0() == v5.L.g().l0();
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
    public long q3() {
        this.L.f().h();
        return this.L.g().m(this.K.e);
    }
    
    @Override
    public String toString() {
        if (!p0.k8(this)) {
            return "Invalid object";
        }
        final StringBuilder sb = new StringBuilder("RealmHolidayModel = proxy[");
        sb.append("{holidayId:");
        sb.append(this.q3());
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
        (this.L = new c0<c5.a>(this)).r(h.e());
        this.L.s(h.f());
        this.L.o(h.b());
        this.L.q(h.d());
    }
    
    public static final class a
    {
        public static final String a = "RealmHolidayModel";
    }
    
    static final class b extends c
    {
        long e;
        
        b(final OsSchemaInfo osSchemaInfo) {
            super(1);
            this.e = this.b("holidayId", "holidayId", osSchemaInfo.b("RealmHolidayModel"));
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
