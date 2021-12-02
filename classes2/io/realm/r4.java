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
import y4.b;

public class r4 extends y4.b implements p, s4
{
    private static final String O = "";
    private static final OsObjectSchemaInfo P;
    private b M;
    private c0<y4.b> N;
    
    static {
        P = C8();
    }
    
    r4() {
        this.N.p();
    }
    
    public static b A8(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static y4.b B8(final y4.b b, final int a, final int n, final Map<n0, p.a<n0>> map) {
        if (a <= n && b != null) {
            final p.a a2 = map.get(b);
            y4.b b3;
            if (a2 == null) {
                final y4.b b2 = new y4.b();
                map.put(b, (p.a<n0>)new p.a(a, b2));
                b3 = b2;
            }
            else {
                if (a >= a2.a) {
                    return (y4.b)a2.b;
                }
                b3 = (y4.b)a2.b;
                a2.a = a;
            }
            b3.h(b.d());
            b3.i(b.c());
            b3.D0(b.E1());
            return b3;
        }
        return null;
    }
    
    private static OsObjectSchemaInfo C8() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmOfficeHourTimeSlot", false, 3, 0);
        final RealmFieldType integer = RealmFieldType.INTEGER;
        b.c("", "start", integer, false, false, true);
        b.c("", "end", integer, false, false, true);
        b.c("", "state", integer, false, false, true);
        return b.e();
    }
    
    public static y4.b D8(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final y4.b b2 = f0.q1(y4.b.class, true, Collections.emptyList());
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
        if (jsonObject.has("state")) {
            if (jsonObject.isNull("state")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'state' to null.");
            }
            b2.D0(jsonObject.getInt("state"));
        }
        return b2;
    }
    
    @TargetApi(11)
    public static y4.b E8(final f0 f0, final JsonReader jsonReader) throws IOException {
        final y4.b b = new y4.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            if (nextName.equals("start")) {
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
            else if (nextName.equals("state")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'state' to null.");
                }
                b.D0(jsonReader.nextInt());
            }
            else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return f0.y0(b, new q[0]);
    }
    
    public static OsObjectSchemaInfo F8() {
        return r4.P;
    }
    
    public static String G8() {
        return "RealmOfficeHourTimeSlot";
    }
    
    public static long H8(final f0 f0, final y4.b b, final Map<n0, Long> map) {
        if (b instanceof p && !p0.h8(b)) {
            final p p3 = (p)b;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(y4.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b2 = (b)f0.H().j(y4.b.class);
        final long row = OsObject.createRow(x2);
        map.put(b, row);
        Table.nativeSetLong(nativePtr, b2.e, row, b.d(), false);
        Table.nativeSetLong(nativePtr, b2.f, row, b.c(), false);
        Table.nativeSetLong(nativePtr, b2.g, row, b.E1(), false);
        return row;
    }
    
    public static void I8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(y4.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(y4.b.class);
        while (iterator.hasNext()) {
            final y4.b b2 = (y4.b)iterator.next();
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
            Table.nativeSetLong(nativePtr, b.e, row, b2.d(), false);
            Table.nativeSetLong(nativePtr, b.f, row, b2.c(), false);
            Table.nativeSetLong(nativePtr, b.g, row, b2.E1(), false);
        }
    }
    
    public static long J8(final f0 f0, final y4.b b, final Map<n0, Long> map) {
        if (b instanceof p && !p0.h8(b)) {
            final p p3 = (p)b;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(y4.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b2 = (b)f0.H().j(y4.b.class);
        final long row = OsObject.createRow(x2);
        map.put(b, row);
        Table.nativeSetLong(nativePtr, b2.e, row, b.d(), false);
        Table.nativeSetLong(nativePtr, b2.f, row, b.c(), false);
        Table.nativeSetLong(nativePtr, b2.g, row, b.E1(), false);
        return row;
    }
    
    public static void K8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(y4.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(y4.b.class);
        while (iterator.hasNext()) {
            final y4.b b2 = (y4.b)iterator.next();
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
            Table.nativeSetLong(nativePtr, b.e, row, b2.d(), false);
            Table.nativeSetLong(nativePtr, b.f, row, b2.c(), false);
            Table.nativeSetLong(nativePtr, b.g, row, b2.E1(), false);
        }
    }
    
    static r4 L8(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(y4.b.class), false, Collections.emptyList());
        final r4 r2 = new r4();
        h.a();
        return r2;
    }
    
    public static y4.b y8(final f0 f0, final b b, final y4.b b2, final boolean b3, final Map<n0, p> map, final Set<q> set) {
        final r4 r4 = map.get(b2);
        if (r4 != null) {
            return r4;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(y4.b.class), set);
        osObjectBuilder.L(b.e, b2.d());
        osObjectBuilder.L(b.f, b2.c());
        osObjectBuilder.K(b.g, b2.E1());
        final r4 l8 = L8(f0, osObjectBuilder.f0());
        map.put(b2, l8);
        return l8;
    }
    
    public static y4.b z8(final f0 f0, final b b, final y4.b b2, final boolean b3, final Map<n0, p> map, final Set<q> set) {
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
            return (y4.b)p7;
        }
        return y8(f0, b, b2, b3, map, set);
    }
    
    @Override
    public void D0(final int n) {
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
    public int E1() {
        this.N.f().h();
        return (int)this.N.g().m(this.M.g);
    }
    
    @Override
    public c0<?> S6() {
        return this.N;
    }
    
    @Override
    public long c() {
        this.N.f().h();
        return this.N.g().m(this.M.f);
    }
    
    @Override
    public long d() {
        this.N.f().h();
        return this.N.g().m(this.M.e);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final r4 r4 = (r4)o;
        final io.realm.a f = this.N.f();
        final io.realm.a f2 = r4.N.f();
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
        final String i = r4.N.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.N.g().l0() == r4.N.g().l0();
            }
        }
        else if (i == null) {
            return this.N.g().l0() == r4.N.g().l0();
        }
        return false;
    }
    
    @Override
    public void h(final long n) {
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
    public String toString() {
        if (!p0.k8(this)) {
            return "Invalid object";
        }
        final StringBuilder sb = new StringBuilder("RealmOfficeHourTimeSlot = proxy[");
        sb.append("{start:");
        sb.append(this.d());
        sb.append("}");
        sb.append(",");
        sb.append("{end:");
        sb.append(this.c());
        sb.append("}");
        sb.append(",");
        sb.append("{state:");
        sb.append(this.E1());
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
        (this.N = new c0<y4.b>(this)).r(h.e());
        this.N.s(h.f());
        this.N.o(h.b());
        this.N.q(h.d());
    }
    
    public static final class a
    {
        public static final String a = "RealmOfficeHourTimeSlot";
    }
    
    static final class b extends c
    {
        long e;
        long f;
        long g;
        
        b(final OsSchemaInfo osSchemaInfo) {
            super(3);
            final OsObjectSchemaInfo b = osSchemaInfo.b("RealmOfficeHourTimeSlot");
            this.e = this.b("start", "start", b);
            this.f = this.b("end", "end", b);
            this.g = this.b("state", "state", b);
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
