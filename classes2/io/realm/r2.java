// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import io.realm.exceptions.RealmException;
import java.util.Iterator;
import io.realm.internal.OsObject;
import io.realm.internal.Table;
import android.annotation.TargetApi;
import java.io.IOException;
import android.util.JsonToken;
import android.util.JsonReader;
import org.json.JSONException;
import java.util.List;
import org.json.JSONObject;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.c;
import java.util.Collections;
import io.realm.internal.r;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Set;
import java.util.Map;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.p;
import q4.a;

public class r2 extends q4.a implements p, s2
{
    private static final String Q = "";
    private static final OsObjectSchemaInfo R;
    private b O;
    private c0<q4.a> P;
    
    static {
        R = G8();
    }
    
    r2() {
        this.P.p();
    }
    
    public static q4.a C8(final f0 f0, final b b, final q4.a a, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        final r2 r2 = map.get(a);
        if (r2 != null) {
            return r2;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(q4.a.class), set);
        osObjectBuilder.L(b.e, a.a());
        osObjectBuilder.L(b.f, a.z1());
        osObjectBuilder.d0(b.g, a.f());
        osObjectBuilder.L(b.h, a.r0());
        osObjectBuilder.d0(b.i, a.H());
        final r2 p6 = P8(f0, osObjectBuilder.f0());
        map.put(a, p6);
        return p6;
    }
    
    public static q4.a D8(final f0 f0, final b b, final q4.a a, final boolean b2, final Map<n0, p> map, final Set<q> set) {
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
            return (q4.a)p7;
        }
        final p p8 = null;
        Object x2 = null;
        boolean b3 = false;
        Label_0232: {
            if (b2) {
                x2 = f0.x2(q4.a.class);
                final long r = ((Table)x2).r(b.e, a.a());
                if (r == -1L) {
                    b3 = false;
                    x2 = p8;
                    break Label_0232;
                }
                try {
                    h.g(f0, ((Table)x2).R(r), b, false, Collections.emptyList());
                    x2 = new r2();
                    map.put(a, (p)x2);
                }
                finally {
                    h.a();
                }
            }
            b3 = b2;
        }
        q4.a a2;
        if (b3) {
            a2 = Q8(f0, b, (q4.a)x2, a, map, set);
        }
        else {
            a2 = C8(f0, b, a, b2, map, set);
        }
        return a2;
    }
    
    public static b E8(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static q4.a F8(final q4.a a, final int a2, final int n, final Map<n0, p.a<n0>> map) {
        if (a2 <= n && a != null) {
            final p.a a3 = map.get(a);
            q4.a a5;
            if (a3 == null) {
                final q4.a a4 = new q4.a();
                map.put(a, (p.a<n0>)new p.a(a2, a4));
                a5 = a4;
            }
            else {
                if (a2 >= a3.a) {
                    return (q4.a)a3.b;
                }
                a5 = (q4.a)a3.b;
                a3.a = a2;
            }
            a5.b(a.a());
            a5.X0(a.z1());
            a5.j(a.f());
            a5.n0(a.r0());
            a5.F0(a.H());
            return a5;
        }
        return null;
    }
    
    private static OsObjectSchemaInfo G8() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmInfoCenterExcuse", false, 5, 0);
        final RealmFieldType integer = RealmFieldType.INTEGER;
        b.c("", "id", integer, true, false, true);
        b.c("", "excuseStatusId", integer, false, false, true);
        final RealmFieldType string = RealmFieldType.STRING;
        b.c("", "text", string, false, false, true);
        b.c("", "number", integer, false, false, true);
        b.c("", "date", string, false, false, true);
        return b.e();
    }
    
    public static q4.a H8(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final List<String> emptyList = Collections.emptyList();
        Object x2 = null;
        Label_0139: {
            if (b) {
                x2 = f0.x2(q4.a.class);
                final long e = ((b)f0.H().j(q4.a.class)).e;
                long r;
                if (!jsonObject.isNull("id")) {
                    r = ((Table)x2).r(e, jsonObject.getLong("id"));
                }
                else {
                    r = -1L;
                }
                if (r != -1L) {
                    final io.realm.a.h h = io.realm.a.W.get();
                    try {
                        h.g(f0, ((Table)x2).R(r), f0.H().j(q4.a.class), false, Collections.emptyList());
                        x2 = new r2();
                        break Label_0139;
                    }
                    finally {
                        h.a();
                    }
                }
            }
            x2 = null;
        }
        Object o = x2;
        if (x2 == null) {
            if (!jsonObject.has("id")) {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
            r2 r2;
            if (jsonObject.isNull("id")) {
                r2 = f0.p1((Class<r2>)q4.a.class, null, true, emptyList);
            }
            else {
                r2 = f0.p1((Class<r2>)q4.a.class, jsonObject.getLong("id"), true, emptyList);
            }
            o = r2;
        }
        if (jsonObject.has("excuseStatusId")) {
            if (jsonObject.isNull("excuseStatusId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'excuseStatusId' to null.");
            }
            ((s2)o).X0(jsonObject.getLong("excuseStatusId"));
        }
        if (jsonObject.has("text")) {
            if (jsonObject.isNull("text")) {
                ((s2)o).j(null);
            }
            else {
                ((s2)o).j(jsonObject.getString("text"));
            }
        }
        if (jsonObject.has("number")) {
            if (jsonObject.isNull("number")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'number' to null.");
            }
            ((s2)o).n0(jsonObject.getLong("number"));
        }
        if (jsonObject.has("date")) {
            if (jsonObject.isNull("date")) {
                ((s2)o).F0(null);
            }
            else {
                ((s2)o).F0(jsonObject.getString("date"));
            }
        }
        return (q4.a)o;
    }
    
    @TargetApi(11)
    public static q4.a I8(final f0 f0, final JsonReader jsonReader) throws IOException {
        final q4.a a = new q4.a();
        jsonReader.beginObject();
        boolean b = false;
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
                a.b(jsonReader.nextLong());
                b = true;
            }
            else if (nextName.equals("excuseStatusId")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'excuseStatusId' to null.");
                }
                a.X0(jsonReader.nextLong());
            }
            else if (nextName.equals("text")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    a.j(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    a.j(null);
                }
            }
            else if (nextName.equals("number")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'number' to null.");
                }
                a.n0(jsonReader.nextLong());
            }
            else if (nextName.equals("date")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    a.F0(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    a.F0(null);
                }
            }
            else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (b) {
            return f0.G0(a, new q[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }
    
    public static OsObjectSchemaInfo J8() {
        return r2.R;
    }
    
    public static String K8() {
        return "RealmInfoCenterExcuse";
    }
    
    public static long L8(final f0 f0, final q4.a a, final Map<n0, Long> map) {
        if (a instanceof p && !p0.h8(a)) {
            final p p3 = (p)a;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(q4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(q4.a.class);
        final long e = b.e;
        final Long value = a.a();
        long l;
        if (value != null) {
            l = Table.nativeFindFirstInt(nativePtr, e, a.a());
        }
        else {
            l = -1L;
        }
        if (l == -1L) {
            l = OsObject.createRowWithPrimaryKey(x2, e, a.a());
        }
        else {
            Table.v0(value);
        }
        map.put(a, l);
        Table.nativeSetLong(nativePtr, b.f, l, a.z1(), false);
        final String f2 = a.f();
        if (f2 != null) {
            Table.nativeSetString(nativePtr, b.g, l, f2, false);
        }
        Table.nativeSetLong(nativePtr, b.h, l, a.r0(), false);
        final String h = a.H();
        if (h != null) {
            Table.nativeSetString(nativePtr, b.i, l, h, false);
        }
        return l;
    }
    
    public static void M8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(q4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(q4.a.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final q4.a a = (q4.a)iterator.next();
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
            final Long value = a.a();
            long l;
            if (value != null) {
                l = Table.nativeFindFirstInt(nativePtr, e, a.a());
            }
            else {
                l = -1L;
            }
            if (l == -1L) {
                l = OsObject.createRowWithPrimaryKey(x2, e, a.a());
            }
            else {
                Table.v0(value);
            }
            map.put(a, l);
            Table.nativeSetLong(nativePtr, b.f, l, a.z1(), false);
            final String f2 = a.f();
            if (f2 != null) {
                Table.nativeSetString(nativePtr, b.g, l, f2, false);
            }
            Table.nativeSetLong(nativePtr, b.h, l, a.r0(), false);
            final String h = a.H();
            if (h == null) {
                continue;
            }
            Table.nativeSetString(nativePtr, b.i, l, h, false);
        }
    }
    
    public static long N8(final f0 f0, final q4.a a, final Map<n0, Long> map) {
        if (a instanceof p && !p0.h8(a)) {
            final p p3 = (p)a;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(q4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(q4.a.class);
        final long e = b.e;
        long nativeFindFirstInt;
        if (Long.valueOf(a.a()) != null) {
            nativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, e, a.a());
        }
        else {
            nativeFindFirstInt = -1L;
        }
        long rowWithPrimaryKey = nativeFindFirstInt;
        if (nativeFindFirstInt == -1L) {
            rowWithPrimaryKey = OsObject.createRowWithPrimaryKey(x2, e, a.a());
        }
        map.put(a, rowWithPrimaryKey);
        Table.nativeSetLong(nativePtr, b.f, rowWithPrimaryKey, a.z1(), false);
        final String f2 = a.f();
        final long g = b.g;
        if (f2 != null) {
            Table.nativeSetString(nativePtr, g, rowWithPrimaryKey, f2, false);
        }
        else {
            Table.nativeSetNull(nativePtr, g, rowWithPrimaryKey, false);
        }
        Table.nativeSetLong(nativePtr, b.h, rowWithPrimaryKey, a.r0(), false);
        final String h = a.H();
        final long i = b.i;
        if (h != null) {
            Table.nativeSetString(nativePtr, i, rowWithPrimaryKey, h, false);
        }
        else {
            Table.nativeSetNull(nativePtr, i, rowWithPrimaryKey, false);
        }
        return rowWithPrimaryKey;
    }
    
    public static void O8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(q4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(q4.a.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final q4.a a = (q4.a)iterator.next();
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
            long nativeFindFirstInt;
            if (Long.valueOf(a.a()) != null) {
                nativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, e, a.a());
            }
            else {
                nativeFindFirstInt = -1L;
            }
            long rowWithPrimaryKey = nativeFindFirstInt;
            if (nativeFindFirstInt == -1L) {
                rowWithPrimaryKey = OsObject.createRowWithPrimaryKey(x2, e, a.a());
            }
            map.put(a, rowWithPrimaryKey);
            Table.nativeSetLong(nativePtr, b.f, rowWithPrimaryKey, a.z1(), false);
            final String f2 = a.f();
            final long g = b.g;
            if (f2 != null) {
                Table.nativeSetString(nativePtr, g, rowWithPrimaryKey, f2, false);
            }
            else {
                Table.nativeSetNull(nativePtr, g, rowWithPrimaryKey, false);
            }
            Table.nativeSetLong(nativePtr, b.h, rowWithPrimaryKey, a.r0(), false);
            final String h = a.H();
            final long i = b.i;
            if (h != null) {
                Table.nativeSetString(nativePtr, i, rowWithPrimaryKey, h, false);
            }
            else {
                Table.nativeSetNull(nativePtr, i, rowWithPrimaryKey, false);
            }
        }
    }
    
    static r2 P8(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(q4.a.class), false, Collections.emptyList());
        final r2 r2 = new r2();
        h.a();
        return r2;
    }
    
    static q4.a Q8(final f0 f0, final b b, final q4.a a, final q4.a a2, final Map<n0, p> map, final Set<q> set) {
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(q4.a.class), set);
        osObjectBuilder.L(b.e, a2.a());
        osObjectBuilder.L(b.f, a2.z1());
        osObjectBuilder.d0(b.g, a2.f());
        osObjectBuilder.L(b.h, a2.r0());
        osObjectBuilder.d0(b.i, a2.H());
        osObjectBuilder.i0();
        return a;
    }
    
    @Override
    public void F0(final String s) {
        if (this.P.i()) {
            if (!this.P.d()) {
                return;
            }
            final r g = this.P.g();
            if (s != null) {
                g.g().t0(this.O.i, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'date' to null.");
        }
        else {
            this.P.f().h();
            if (s != null) {
                this.P.g().d(this.O.i, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'date' to null.");
        }
    }
    
    @Override
    public String H() {
        this.P.f().h();
        return this.P.g().U(this.O.i);
    }
    
    @Override
    public c0<?> S6() {
        return this.P;
    }
    
    @Override
    public void X0(final long n) {
        if (!this.P.i()) {
            this.P.f().h();
            this.P.g().s(this.O.f, n);
            return;
        }
        if (!this.P.d()) {
            return;
        }
        final r g = this.P.g();
        g.g().q0(this.O.f, g.l0(), n, true);
    }
    
    @Override
    public long a() {
        this.P.f().h();
        return this.P.g().m(this.O.e);
    }
    
    @Override
    public void b(final long n) {
        if (this.P.i()) {
            return;
        }
        this.P.f().h();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final r2 r2 = (r2)o;
        final io.realm.a f = this.P.f();
        final io.realm.a f2 = r2.P.f();
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
        final String m = this.P.g().g().M();
        final String i = r2.P.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.P.g().l0() == r2.P.g().l0();
            }
        }
        else if (i == null) {
            return this.P.g().l0() == r2.P.g().l0();
        }
        return false;
    }
    
    @Override
    public String f() {
        this.P.f().h();
        return this.P.g().U(this.O.g);
    }
    
    @Override
    public int hashCode() {
        final String path = this.P.f().getPath();
        final String m = this.P.g().g().M();
        final long l0 = this.P.g().l0();
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
    public void j(final String s) {
        if (this.P.i()) {
            if (!this.P.d()) {
                return;
            }
            final r g = this.P.g();
            if (s != null) {
                g.g().t0(this.O.g, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'text' to null.");
        }
        else {
            this.P.f().h();
            if (s != null) {
                this.P.g().d(this.O.g, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'text' to null.");
        }
    }
    
    @Override
    public void n0(final long n) {
        if (!this.P.i()) {
            this.P.f().h();
            this.P.g().s(this.O.h, n);
            return;
        }
        if (!this.P.d()) {
            return;
        }
        final r g = this.P.g();
        g.g().q0(this.O.h, g.l0(), n, true);
    }
    
    @Override
    public long r0() {
        this.P.f().h();
        return this.P.g().m(this.O.h);
    }
    
    @Override
    public String toString() {
        if (!p0.k8(this)) {
            return "Invalid object";
        }
        final StringBuilder sb = new StringBuilder("RealmInfoCenterExcuse = proxy[");
        sb.append("{id:");
        sb.append(this.a());
        sb.append("}");
        sb.append(",");
        sb.append("{excuseStatusId:");
        sb.append(this.z1());
        sb.append("}");
        sb.append(",");
        sb.append("{text:");
        sb.append(this.f());
        sb.append("}");
        sb.append(",");
        sb.append("{number:");
        sb.append(this.r0());
        sb.append("}");
        sb.append(",");
        sb.append("{date:");
        sb.append(this.H());
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
    
    @Override
    public void y4() {
        if (this.P != null) {
            return;
        }
        final io.realm.a.h h = io.realm.a.W.get();
        this.O = (b)h.c();
        (this.P = new c0<q4.a>(this)).r(h.e());
        this.P.s(h.f());
        this.P.o(h.b());
        this.P.q(h.d());
    }
    
    @Override
    public long z1() {
        this.P.f().h();
        return this.P.g().m(this.O.f);
    }
    
    public static final class a
    {
        public static final String a = "RealmInfoCenterExcuse";
    }
    
    static final class b extends c
    {
        long e;
        long f;
        long g;
        long h;
        long i;
        
        b(final OsSchemaInfo osSchemaInfo) {
            super(5);
            final OsObjectSchemaInfo b = osSchemaInfo.b("RealmInfoCenterExcuse");
            this.e = this.b("id", "id", b);
            this.f = this.b("excuseStatusId", "excuseStatusId", b);
            this.g = this.b("text", "text", b);
            this.h = this.b("number", "number", b);
            this.i = this.b("date", "date", b);
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
        }
    }
}
