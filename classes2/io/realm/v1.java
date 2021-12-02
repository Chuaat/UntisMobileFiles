// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import io.realm.internal.c;
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
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.r;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Set;
import java.util.Map;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.p;
import k4.a;

public class v1 extends k4.a implements p, w1
{
    private static final String R = "";
    private static final OsObjectSchemaInfo S;
    private b P;
    private c0<k4.a> Q;
    
    static {
        S = I8();
    }
    
    v1() {
        this.Q.p();
    }
    
    public static k4.a E8(final f0 f0, final b b, final k4.a a, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        final v1 v1 = map.get(a);
        if (v1 != null) {
            return v1;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(k4.a.class), set);
        osObjectBuilder.L(b.e, a.J());
        osObjectBuilder.L(b.f, a.F1());
        osObjectBuilder.L(b.g, a.N6());
        osObjectBuilder.L(b.h, a.d());
        osObjectBuilder.L(b.i, a.c());
        osObjectBuilder.d0(b.j, a.f());
        final v1 r8 = R8(f0, osObjectBuilder.f0());
        map.put(a, r8);
        return r8;
    }
    
    public static k4.a F8(final f0 f0, final b b, final k4.a a, final boolean b2, final Map<n0, p> map, final Set<q> set) {
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
            return (k4.a)p7;
        }
        return E8(f0, b, a, b2, map, set);
    }
    
    public static b G8(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static k4.a H8(final k4.a a, final int a2, final int n, final Map<n0, p.a<n0>> map) {
        if (a2 <= n && a != null) {
            final p.a a3 = map.get(a);
            k4.a a5;
            if (a3 == null) {
                final k4.a a4 = new k4.a();
                map.put(a, (p.a<n0>)new p.a(a2, a4));
                a5 = a4;
            }
            else {
                if (a2 >= a3.a) {
                    return (k4.a)a3.b;
                }
                a5 = (k4.a)a3.b;
                a3.a = a2;
            }
            a5.P(a.J());
            a5.M0(a.F1());
            a5.n3(a.N6());
            a5.h(a.d());
            a5.i(a.c());
            a5.j(a.f());
            return a5;
        }
        return null;
    }
    
    private static OsObjectSchemaInfo I8() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmClassRole", false, 6, 0);
        final RealmFieldType integer = RealmFieldType.INTEGER;
        b.c("", "studentId", integer, false, false, true);
        b.c("", "klasseId", integer, false, false, true);
        b.c("", "dutyId", integer, false, false, true);
        b.c("", "start", integer, false, false, true);
        b.c("", "end", integer, false, false, true);
        b.c("", "text", RealmFieldType.STRING, false, false, true);
        return b.e();
    }
    
    public static k4.a J8(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final k4.a a = f0.q1(k4.a.class, true, Collections.emptyList());
        if (jsonObject.has("studentId")) {
            if (jsonObject.isNull("studentId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'studentId' to null.");
            }
            a.P(jsonObject.getLong("studentId"));
        }
        if (jsonObject.has("klasseId")) {
            if (jsonObject.isNull("klasseId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'klasseId' to null.");
            }
            a.M0(jsonObject.getLong("klasseId"));
        }
        if (jsonObject.has("dutyId")) {
            if (jsonObject.isNull("dutyId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'dutyId' to null.");
            }
            a.n3(jsonObject.getLong("dutyId"));
        }
        if (jsonObject.has("start")) {
            if (jsonObject.isNull("start")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'start' to null.");
            }
            a.h(jsonObject.getLong("start"));
        }
        if (jsonObject.has("end")) {
            if (jsonObject.isNull("end")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'end' to null.");
            }
            a.i(jsonObject.getLong("end"));
        }
        if (jsonObject.has("text")) {
            String string;
            if (jsonObject.isNull("text")) {
                string = null;
            }
            else {
                string = jsonObject.getString("text");
            }
            a.j(string);
        }
        return a;
    }
    
    @TargetApi(11)
    public static k4.a K8(final f0 f0, final JsonReader jsonReader) throws IOException {
        final k4.a a = new k4.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            if (nextName.equals("studentId")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'studentId' to null.");
                }
                a.P(jsonReader.nextLong());
            }
            else if (nextName.equals("klasseId")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'klasseId' to null.");
                }
                a.M0(jsonReader.nextLong());
            }
            else if (nextName.equals("dutyId")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'dutyId' to null.");
                }
                a.n3(jsonReader.nextLong());
            }
            else if (nextName.equals("start")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'start' to null.");
                }
                a.h(jsonReader.nextLong());
            }
            else if (nextName.equals("end")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'end' to null.");
                }
                a.i(jsonReader.nextLong());
            }
            else if (nextName.equals("text")) {
                String nextString;
                if (jsonReader.peek() != JsonToken.NULL) {
                    nextString = jsonReader.nextString();
                }
                else {
                    jsonReader.skipValue();
                    nextString = null;
                }
                a.j(nextString);
            }
            else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return f0.y0(a, new q[0]);
    }
    
    public static OsObjectSchemaInfo L8() {
        return v1.S;
    }
    
    public static String M8() {
        return "RealmClassRole";
    }
    
    public static long N8(final f0 f0, final k4.a a, final Map<n0, Long> map) {
        if (a instanceof p && !p0.h8(a)) {
            final p p3 = (p)a;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(k4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(k4.a.class);
        final long row = OsObject.createRow(x2);
        map.put(a, row);
        Table.nativeSetLong(nativePtr, b.e, row, a.J(), false);
        Table.nativeSetLong(nativePtr, b.f, row, a.F1(), false);
        Table.nativeSetLong(nativePtr, b.g, row, a.N6(), false);
        Table.nativeSetLong(nativePtr, b.h, row, a.d(), false);
        Table.nativeSetLong(nativePtr, b.i, row, a.c(), false);
        final String f2 = a.f();
        if (f2 != null) {
            Table.nativeSetString(nativePtr, b.j, row, f2, false);
        }
        return row;
    }
    
    public static void O8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(k4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(k4.a.class);
        while (iterator.hasNext()) {
            final k4.a a = (k4.a)iterator.next();
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
            Table.nativeSetLong(nativePtr, b.e, row, a.J(), false);
            Table.nativeSetLong(nativePtr, b.f, row, a.F1(), false);
            Table.nativeSetLong(nativePtr, b.g, row, a.N6(), false);
            Table.nativeSetLong(nativePtr, b.h, row, a.d(), false);
            Table.nativeSetLong(nativePtr, b.i, row, a.c(), false);
            final String f2 = a.f();
            if (f2 == null) {
                continue;
            }
            Table.nativeSetString(nativePtr, b.j, row, f2, false);
        }
    }
    
    public static long P8(final f0 f0, final k4.a a, final Map<n0, Long> map) {
        if (a instanceof p && !p0.h8(a)) {
            final p p3 = (p)a;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(k4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(k4.a.class);
        final long row = OsObject.createRow(x2);
        map.put(a, row);
        Table.nativeSetLong(nativePtr, b.e, row, a.J(), false);
        Table.nativeSetLong(nativePtr, b.f, row, a.F1(), false);
        Table.nativeSetLong(nativePtr, b.g, row, a.N6(), false);
        Table.nativeSetLong(nativePtr, b.h, row, a.d(), false);
        Table.nativeSetLong(nativePtr, b.i, row, a.c(), false);
        final String f2 = a.f();
        final long j = b.j;
        if (f2 != null) {
            Table.nativeSetString(nativePtr, j, row, f2, false);
        }
        else {
            Table.nativeSetNull(nativePtr, j, row, false);
        }
        return row;
    }
    
    public static void Q8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(k4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(k4.a.class);
        while (iterator.hasNext()) {
            final k4.a a = (k4.a)iterator.next();
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
            Table.nativeSetLong(nativePtr, b.e, row, a.J(), false);
            Table.nativeSetLong(nativePtr, b.f, row, a.F1(), false);
            Table.nativeSetLong(nativePtr, b.g, row, a.N6(), false);
            Table.nativeSetLong(nativePtr, b.h, row, a.d(), false);
            Table.nativeSetLong(nativePtr, b.i, row, a.c(), false);
            final String f2 = a.f();
            final long j = b.j;
            if (f2 != null) {
                Table.nativeSetString(nativePtr, j, row, f2, false);
            }
            else {
                Table.nativeSetNull(nativePtr, j, row, false);
            }
        }
    }
    
    static v1 R8(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(k4.a.class), false, Collections.emptyList());
        final v1 v1 = new v1();
        h.a();
        return v1;
    }
    
    @Override
    public long F1() {
        this.Q.f().h();
        return this.Q.g().m(this.P.f);
    }
    
    @Override
    public long J() {
        this.Q.f().h();
        return this.Q.g().m(this.P.e);
    }
    
    @Override
    public void M0(final long n) {
        if (!this.Q.i()) {
            this.Q.f().h();
            this.Q.g().s(this.P.f, n);
            return;
        }
        if (!this.Q.d()) {
            return;
        }
        final r g = this.Q.g();
        g.g().q0(this.P.f, g.l0(), n, true);
    }
    
    @Override
    public long N6() {
        this.Q.f().h();
        return this.Q.g().m(this.P.g);
    }
    
    @Override
    public void P(final long n) {
        if (!this.Q.i()) {
            this.Q.f().h();
            this.Q.g().s(this.P.e, n);
            return;
        }
        if (!this.Q.d()) {
            return;
        }
        final r g = this.Q.g();
        g.g().q0(this.P.e, g.l0(), n, true);
    }
    
    @Override
    public c0<?> S6() {
        return this.Q;
    }
    
    @Override
    public long c() {
        this.Q.f().h();
        return this.Q.g().m(this.P.i);
    }
    
    @Override
    public long d() {
        this.Q.f().h();
        return this.Q.g().m(this.P.h);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final v1 v1 = (v1)o;
        final io.realm.a f = this.Q.f();
        final io.realm.a f2 = v1.Q.f();
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
        final String m = this.Q.g().g().M();
        final String i = v1.Q.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.Q.g().l0() == v1.Q.g().l0();
            }
        }
        else if (i == null) {
            return this.Q.g().l0() == v1.Q.g().l0();
        }
        return false;
    }
    
    @Override
    public String f() {
        this.Q.f().h();
        return this.Q.g().U(this.P.j);
    }
    
    @Override
    public void h(final long n) {
        if (!this.Q.i()) {
            this.Q.f().h();
            this.Q.g().s(this.P.h, n);
            return;
        }
        if (!this.Q.d()) {
            return;
        }
        final r g = this.Q.g();
        g.g().q0(this.P.h, g.l0(), n, true);
    }
    
    @Override
    public int hashCode() {
        final String path = this.Q.f().getPath();
        final String m = this.Q.g().g().M();
        final long l0 = this.Q.g().l0();
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
        if (!this.Q.i()) {
            this.Q.f().h();
            this.Q.g().s(this.P.i, n);
            return;
        }
        if (!this.Q.d()) {
            return;
        }
        final r g = this.Q.g();
        g.g().q0(this.P.i, g.l0(), n, true);
    }
    
    @Override
    public void j(final String s) {
        if (this.Q.i()) {
            if (!this.Q.d()) {
                return;
            }
            final r g = this.Q.g();
            if (s != null) {
                g.g().t0(this.P.j, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'text' to null.");
        }
        else {
            this.Q.f().h();
            if (s != null) {
                this.Q.g().d(this.P.j, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'text' to null.");
        }
    }
    
    @Override
    public void n3(final long n) {
        if (!this.Q.i()) {
            this.Q.f().h();
            this.Q.g().s(this.P.g, n);
            return;
        }
        if (!this.Q.d()) {
            return;
        }
        final r g = this.Q.g();
        g.g().q0(this.P.g, g.l0(), n, true);
    }
    
    @Override
    public String toString() {
        if (!p0.k8(this)) {
            return "Invalid object";
        }
        final StringBuilder sb = new StringBuilder("RealmClassRole = proxy[");
        sb.append("{studentId:");
        sb.append(this.J());
        sb.append("}");
        sb.append(",");
        sb.append("{klasseId:");
        sb.append(this.F1());
        sb.append("}");
        sb.append(",");
        sb.append("{dutyId:");
        sb.append(this.N6());
        sb.append("}");
        sb.append(",");
        sb.append("{start:");
        sb.append(this.d());
        sb.append("}");
        sb.append(",");
        sb.append("{end:");
        sb.append(this.c());
        sb.append("}");
        sb.append(",");
        sb.append("{text:");
        sb.append(this.f());
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
    
    @Override
    public void y4() {
        if (this.Q != null) {
            return;
        }
        final io.realm.a.h h = io.realm.a.W.get();
        this.P = (b)h.c();
        (this.Q = new c0<k4.a>(this)).r(h.e());
        this.Q.s(h.f());
        this.Q.o(h.b());
        this.Q.q(h.d());
    }
    
    public static final class a
    {
        public static final String a = "RealmClassRole";
    }
    
    static final class b extends c
    {
        long e;
        long f;
        long g;
        long h;
        long i;
        long j;
        
        b(final OsSchemaInfo osSchemaInfo) {
            super(6);
            final OsObjectSchemaInfo b = osSchemaInfo.b("RealmClassRole");
            this.e = this.b("studentId", "studentId", b);
            this.f = this.b("klasseId", "klasseId", b);
            this.g = this.b("dutyId", "dutyId", b);
            this.h = this.b("start", "start", b);
            this.i = this.b("end", "end", b);
            this.j = this.b("text", "text", b);
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
            b2.h = b.h;
            b2.i = b.i;
            b2.j = b.j;
        }
    }
}
