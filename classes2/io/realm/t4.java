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
import com.untis.mobile.persistence.realm.period.a;

public class t4 extends com.untis.mobile.persistence.realm.period.a implements p, u4
{
    private static final String O = "";
    private static final OsObjectSchemaInfo P;
    private b M;
    private c0<com.untis.mobile.persistence.realm.period.a> N;
    
    static {
        P = C8();
    }
    
    t4() {
        this.N.p();
    }
    
    public static b A8(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static com.untis.mobile.persistence.realm.period.a B8(final com.untis.mobile.persistence.realm.period.a a, final int a2, final int n, final Map<n0, p.a<n0>> map) {
        if (a2 <= n && a != null) {
            final p.a a3 = map.get(a);
            com.untis.mobile.persistence.realm.period.a a5;
            if (a3 == null) {
                final com.untis.mobile.persistence.realm.period.a a4 = new com.untis.mobile.persistence.realm.period.a();
                map.put(a, (p.a<n0>)new p.a(a2, a4));
                a5 = a4;
            }
            else {
                if (a2 >= a3.a) {
                    return (com.untis.mobile.persistence.realm.period.a)a3.b;
                }
                a5 = (com.untis.mobile.persistence.realm.period.a)a3.b;
                a3.a = a2;
            }
            a5.k(a.l());
            a5.I0(a.J1());
            a5.s1(a.N0());
            return a5;
        }
        return null;
    }
    
    private static OsObjectSchemaInfo C8() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmElementPair", false, 3, 0);
        final RealmFieldType integer = RealmFieldType.INTEGER;
        b.c("", "entityType", integer, false, false, true);
        b.c("", "originalId", integer, false, false, true);
        b.c("", "currentId", integer, false, false, true);
        return b.e();
    }
    
    public static com.untis.mobile.persistence.realm.period.a D8(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final com.untis.mobile.persistence.realm.period.a a = f0.q1(com.untis.mobile.persistence.realm.period.a.class, true, Collections.emptyList());
        if (jsonObject.has("entityType")) {
            if (jsonObject.isNull("entityType")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'entityType' to null.");
            }
            a.k(jsonObject.getInt("entityType"));
        }
        if (jsonObject.has("originalId")) {
            if (jsonObject.isNull("originalId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'originalId' to null.");
            }
            a.I0(jsonObject.getLong("originalId"));
        }
        if (jsonObject.has("currentId")) {
            if (jsonObject.isNull("currentId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'currentId' to null.");
            }
            a.s1(jsonObject.getLong("currentId"));
        }
        return a;
    }
    
    @TargetApi(11)
    public static com.untis.mobile.persistence.realm.period.a E8(final f0 f0, final JsonReader jsonReader) throws IOException {
        final com.untis.mobile.persistence.realm.period.a a = new com.untis.mobile.persistence.realm.period.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            if (nextName.equals("entityType")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'entityType' to null.");
                }
                a.k(jsonReader.nextInt());
            }
            else if (nextName.equals("originalId")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'originalId' to null.");
                }
                a.I0(jsonReader.nextLong());
            }
            else if (nextName.equals("currentId")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'currentId' to null.");
                }
                a.s1(jsonReader.nextLong());
            }
            else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return f0.y0(a, new q[0]);
    }
    
    public static OsObjectSchemaInfo F8() {
        return t4.P;
    }
    
    public static String G8() {
        return "RealmElementPair";
    }
    
    public static long H8(final f0 f0, final com.untis.mobile.persistence.realm.period.a a, final Map<n0, Long> map) {
        if (a instanceof p && !p0.h8(a)) {
            final p p3 = (p)a;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(com.untis.mobile.persistence.realm.period.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(com.untis.mobile.persistence.realm.period.a.class);
        final long row = OsObject.createRow(x2);
        map.put(a, row);
        Table.nativeSetLong(nativePtr, b.e, row, a.l(), false);
        Table.nativeSetLong(nativePtr, b.f, row, a.J1(), false);
        Table.nativeSetLong(nativePtr, b.g, row, a.N0(), false);
        return row;
    }
    
    public static void I8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(com.untis.mobile.persistence.realm.period.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(com.untis.mobile.persistence.realm.period.a.class);
        while (iterator.hasNext()) {
            final com.untis.mobile.persistence.realm.period.a a = (com.untis.mobile.persistence.realm.period.a)iterator.next();
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
            Table.nativeSetLong(nativePtr, b.e, row, a.l(), false);
            Table.nativeSetLong(nativePtr, b.f, row, a.J1(), false);
            Table.nativeSetLong(nativePtr, b.g, row, a.N0(), false);
        }
    }
    
    public static long J8(final f0 f0, final com.untis.mobile.persistence.realm.period.a a, final Map<n0, Long> map) {
        if (a instanceof p && !p0.h8(a)) {
            final p p3 = (p)a;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(com.untis.mobile.persistence.realm.period.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(com.untis.mobile.persistence.realm.period.a.class);
        final long row = OsObject.createRow(x2);
        map.put(a, row);
        Table.nativeSetLong(nativePtr, b.e, row, a.l(), false);
        Table.nativeSetLong(nativePtr, b.f, row, a.J1(), false);
        Table.nativeSetLong(nativePtr, b.g, row, a.N0(), false);
        return row;
    }
    
    public static void K8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(com.untis.mobile.persistence.realm.period.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(com.untis.mobile.persistence.realm.period.a.class);
        while (iterator.hasNext()) {
            final com.untis.mobile.persistence.realm.period.a a = (com.untis.mobile.persistence.realm.period.a)iterator.next();
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
            Table.nativeSetLong(nativePtr, b.e, row, a.l(), false);
            Table.nativeSetLong(nativePtr, b.f, row, a.J1(), false);
            Table.nativeSetLong(nativePtr, b.g, row, a.N0(), false);
        }
    }
    
    static t4 L8(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(com.untis.mobile.persistence.realm.period.a.class), false, Collections.emptyList());
        final t4 t4 = new t4();
        h.a();
        return t4;
    }
    
    public static com.untis.mobile.persistence.realm.period.a y8(final f0 f0, final b b, final com.untis.mobile.persistence.realm.period.a a, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        final t4 t4 = map.get(a);
        if (t4 != null) {
            return t4;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(com.untis.mobile.persistence.realm.period.a.class), set);
        osObjectBuilder.K(b.e, a.l());
        osObjectBuilder.L(b.f, a.J1());
        osObjectBuilder.L(b.g, a.N0());
        final t4 l8 = L8(f0, osObjectBuilder.f0());
        map.put(a, l8);
        return l8;
    }
    
    public static com.untis.mobile.persistence.realm.period.a z8(final f0 f0, final b b, final com.untis.mobile.persistence.realm.period.a a, final boolean b2, final Map<n0, p> map, final Set<q> set) {
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
            return (com.untis.mobile.persistence.realm.period.a)p7;
        }
        return y8(f0, b, a, b2, map, set);
    }
    
    @Override
    public void I0(final long n) {
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
    public long J1() {
        this.N.f().h();
        return this.N.g().m(this.M.f);
    }
    
    @Override
    public long N0() {
        this.N.f().h();
        return this.N.g().m(this.M.g);
    }
    
    @Override
    public c0<?> S6() {
        return this.N;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final t4 t4 = (t4)o;
        final io.realm.a f = this.N.f();
        final io.realm.a f2 = t4.N.f();
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
        final String i = t4.N.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.N.g().l0() == t4.N.g().l0();
            }
        }
        else if (i == null) {
            return this.N.g().l0() == t4.N.g().l0();
        }
        return false;
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
    public void k(final int n) {
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
    public int l() {
        this.N.f().h();
        return (int)this.N.g().m(this.M.e);
    }
    
    @Override
    public void s1(final long n) {
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
        final StringBuilder sb = new StringBuilder("RealmElementPair = proxy[");
        sb.append("{entityType:");
        sb.append(this.l());
        sb.append("}");
        sb.append(",");
        sb.append("{originalId:");
        sb.append(this.J1());
        sb.append("}");
        sb.append(",");
        sb.append("{currentId:");
        sb.append(this.N0());
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
        (this.N = new c0<com.untis.mobile.persistence.realm.period.a>(this)).r(h.e());
        this.N.s(h.f());
        this.N.o(h.b());
        this.N.q(h.d());
    }
    
    public static final class a
    {
        public static final String a = "RealmElementPair";
    }
    
    static final class b extends c
    {
        long e;
        long f;
        long g;
        
        b(final OsSchemaInfo osSchemaInfo) {
            super(3);
            final OsObjectSchemaInfo b = osSchemaInfo.b("RealmElementPair");
            this.e = this.b("entityType", "entityType", b);
            this.f = this.b("originalId", "originalId", b);
            this.g = this.b("currentId", "currentId", b);
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
