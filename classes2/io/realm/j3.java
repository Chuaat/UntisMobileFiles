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
import t4.b;

public class j3 extends t4.b implements p, k3
{
    private static final String O = "";
    private static final OsObjectSchemaInfo P;
    private b M;
    private c0<t4.b> N;
    
    static {
        P = C8();
    }
    
    j3() {
        this.N.p();
    }
    
    public static b A8(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static t4.b B8(final t4.b b, final int a, final int n, final Map<n0, p.a<n0>> map) {
        if (a <= n && b != null) {
            final p.a a2 = map.get(b);
            t4.b b3;
            if (a2 == null) {
                final t4.b b2 = new t4.b();
                map.put(b, (p.a<n0>)new p.a(a, b2));
                b3 = b2;
            }
            else {
                if (a >= a2.a) {
                    return (t4.b)a2.b;
                }
                b3 = (t4.b)a2.b;
                a2.a = a;
            }
            b3.v(b.d());
            b3.x(b.c());
            b3.D0(b.E1());
            return b3;
        }
        return null;
    }
    
    private static OsObjectSchemaInfo C8() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmInfoCenterContactHourTimeslot", false, 3, 0);
        final RealmFieldType string = RealmFieldType.STRING;
        b.c("", "start", string, false, false, true);
        b.c("", "end", string, false, false, true);
        b.c("", "state", RealmFieldType.INTEGER, false, false, true);
        return b.e();
    }
    
    public static t4.b D8(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final t4.b b2 = f0.q1(t4.b.class, true, Collections.emptyList());
        if (jsonObject.has("start")) {
            if (jsonObject.isNull("start")) {
                b2.v(null);
            }
            else {
                b2.v(jsonObject.getString("start"));
            }
        }
        if (jsonObject.has("end")) {
            if (jsonObject.isNull("end")) {
                b2.x(null);
            }
            else {
                b2.x(jsonObject.getString("end"));
            }
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
    public static t4.b E8(final f0 f0, final JsonReader jsonReader) throws IOException {
        final t4.b b = new t4.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            if (nextName.equals("start")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    b.v(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    b.v(null);
                }
            }
            else if (nextName.equals("end")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    b.x(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    b.x(null);
                }
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
        return j3.P;
    }
    
    public static String G8() {
        return "RealmInfoCenterContactHourTimeslot";
    }
    
    public static long H8(final f0 f0, final t4.b b, final Map<n0, Long> map) {
        if (b instanceof p && !p0.h8(b)) {
            final p p3 = (p)b;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(t4.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b2 = (b)f0.H().j(t4.b.class);
        final long row = OsObject.createRow(x2);
        map.put(b, row);
        final String d = b.d();
        if (d != null) {
            Table.nativeSetString(nativePtr, b2.e, row, d, false);
        }
        final String c = b.c();
        if (c != null) {
            Table.nativeSetString(nativePtr, b2.f, row, c, false);
        }
        Table.nativeSetLong(nativePtr, b2.g, row, b.E1(), false);
        return row;
    }
    
    public static void I8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(t4.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(t4.b.class);
        while (iterator.hasNext()) {
            final t4.b b2 = (t4.b)iterator.next();
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
            final String d = b2.d();
            if (d != null) {
                Table.nativeSetString(nativePtr, b.e, row, d, false);
            }
            final String c = b2.c();
            if (c != null) {
                Table.nativeSetString(nativePtr, b.f, row, c, false);
            }
            Table.nativeSetLong(nativePtr, b.g, row, b2.E1(), false);
        }
    }
    
    public static long J8(final f0 f0, final t4.b b, final Map<n0, Long> map) {
        if (b instanceof p && !p0.h8(b)) {
            final p p3 = (p)b;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(t4.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b2 = (b)f0.H().j(t4.b.class);
        final long row = OsObject.createRow(x2);
        map.put(b, row);
        final String d = b.d();
        final long e = b2.e;
        if (d != null) {
            Table.nativeSetString(nativePtr, e, row, d, false);
        }
        else {
            Table.nativeSetNull(nativePtr, e, row, false);
        }
        final String c = b.c();
        final long f2 = b2.f;
        if (c != null) {
            Table.nativeSetString(nativePtr, f2, row, c, false);
        }
        else {
            Table.nativeSetNull(nativePtr, f2, row, false);
        }
        Table.nativeSetLong(nativePtr, b2.g, row, b.E1(), false);
        return row;
    }
    
    public static void K8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(t4.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(t4.b.class);
        while (iterator.hasNext()) {
            final t4.b b2 = (t4.b)iterator.next();
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
            final String d = b2.d();
            final long e = b.e;
            if (d != null) {
                Table.nativeSetString(nativePtr, e, row, d, false);
            }
            else {
                Table.nativeSetNull(nativePtr, e, row, false);
            }
            final String c = b2.c();
            final long f2 = b.f;
            if (c != null) {
                Table.nativeSetString(nativePtr, f2, row, c, false);
            }
            else {
                Table.nativeSetNull(nativePtr, f2, row, false);
            }
            Table.nativeSetLong(nativePtr, b.g, row, b2.E1(), false);
        }
    }
    
    static j3 L8(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(t4.b.class), false, Collections.emptyList());
        final j3 j3 = new j3();
        h.a();
        return j3;
    }
    
    public static t4.b y8(final f0 f0, final b b, final t4.b b2, final boolean b3, final Map<n0, p> map, final Set<q> set) {
        final j3 j3 = map.get(b2);
        if (j3 != null) {
            return j3;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(t4.b.class), set);
        osObjectBuilder.d0(b.e, b2.d());
        osObjectBuilder.d0(b.f, b2.c());
        osObjectBuilder.K(b.g, b2.E1());
        final j3 l8 = L8(f0, osObjectBuilder.f0());
        map.put(b2, l8);
        return l8;
    }
    
    public static t4.b z8(final f0 f0, final b b, final t4.b b2, final boolean b3, final Map<n0, p> map, final Set<q> set) {
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
            return (t4.b)p7;
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
    public String c() {
        this.N.f().h();
        return this.N.g().U(this.M.f);
    }
    
    @Override
    public String d() {
        this.N.f().h();
        return this.N.g().U(this.M.e);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final j3 j3 = (j3)o;
        final io.realm.a f = this.N.f();
        final io.realm.a f2 = j3.N.f();
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
        final String i = j3.N.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.N.g().l0() == j3.N.g().l0();
            }
        }
        else if (i == null) {
            return this.N.g().l0() == j3.N.g().l0();
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
    public String toString() {
        if (!p0.k8(this)) {
            return "Invalid object";
        }
        final StringBuilder sb = new StringBuilder("RealmInfoCenterContactHourTimeslot = proxy[");
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
    public void v(final String s) {
        if (this.N.i()) {
            if (!this.N.d()) {
                return;
            }
            final r g = this.N.g();
            if (s != null) {
                g.g().t0(this.M.e, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'start' to null.");
        }
        else {
            this.N.f().h();
            if (s != null) {
                this.N.g().d(this.M.e, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'start' to null.");
        }
    }
    
    @Override
    public void x(final String s) {
        if (this.N.i()) {
            if (!this.N.d()) {
                return;
            }
            final r g = this.N.g();
            if (s != null) {
                g.g().t0(this.M.f, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'end' to null.");
        }
        else {
            this.N.f().h();
            if (s != null) {
                this.N.g().d(this.M.f, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'end' to null.");
        }
    }
    
    @Override
    public void y4() {
        if (this.N != null) {
            return;
        }
        final io.realm.a.h h = io.realm.a.W.get();
        this.M = (b)h.c();
        (this.N = new c0<t4.b>(this)).r(h.e());
        this.N.s(h.f());
        this.N.o(h.b());
        this.N.q(h.d());
    }
    
    public static final class a
    {
        public static final String a = "RealmInfoCenterContactHourTimeslot";
    }
    
    static final class b extends c
    {
        long e;
        long f;
        long g;
        
        b(final OsSchemaInfo osSchemaInfo) {
            super(3);
            final OsObjectSchemaInfo b = osSchemaInfo.b("RealmInfoCenterContactHourTimeslot");
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
