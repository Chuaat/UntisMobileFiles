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
import java.util.ArrayList;
import org.json.JSONObject;
import io.realm.internal.OsSchemaInfo;
import java.util.Collections;
import j4.d;
import io.realm.internal.r;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Set;
import java.util.Map;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.p;
import j4.c;

public class r1 extends c implements p, s1
{
    private static final String Q = "";
    private static final OsObjectSchemaInfo R;
    private b O;
    private c0<c> P;
    
    static {
        R = G8();
    }
    
    r1() {
        this.P.p();
    }
    
    public static c C8(final f0 f0, final b b, final c c, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        final r1 r1 = map.get(c);
        if (r1 != null) {
            return r1;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(c.class), set);
        osObjectBuilder.L(b.e, c.a());
        osObjectBuilder.d0(b.g, c.f());
        osObjectBuilder.L(b.h, c.r0());
        osObjectBuilder.L(b.i, c.H());
        final r1 p6 = P8(f0, osObjectBuilder.f0());
        map.put(c, p6);
        final d e2 = c.e2();
        d b3;
        if (e2 == null) {
            b3 = null;
        }
        else {
            final d d = (d)map.get(e2);
            if (d != null) {
                p6.C4(d);
                return p6;
            }
            b3 = t1.B8(f0, (t1.b)f0.H().j(d.class), e2, b2, map, set);
        }
        p6.C4(b3);
        return p6;
    }
    
    public static c D8(final f0 f0, final b b, final c c, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        if (c instanceof p && !p0.h8(c)) {
            final p p6 = (p)c;
            if (p6.S6().f() != null) {
                final io.realm.a f2 = p6.S6().f();
                if (f2.H != f0.H) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
                if (f2.getPath().equals(f0.getPath())) {
                    return c;
                }
            }
        }
        final io.realm.a.h h = io.realm.a.W.get();
        final p p7 = map.get(c);
        if (p7 != null) {
            return (c)p7;
        }
        final p p8 = null;
        Object x2 = null;
        boolean b3 = false;
        Label_0232: {
            if (b2) {
                x2 = f0.x2(c.class);
                final long r = ((Table)x2).r(b.e, c.a());
                if (r == -1L) {
                    b3 = false;
                    x2 = p8;
                    break Label_0232;
                }
                try {
                    h.g(f0, ((Table)x2).R(r), b, false, Collections.emptyList());
                    x2 = new r1();
                    map.put(c, (p)x2);
                }
                finally {
                    h.a();
                }
            }
            b3 = b2;
        }
        c c2;
        if (b3) {
            c2 = Q8(f0, b, (c)x2, c, map, set);
        }
        else {
            c2 = C8(f0, b, c, b2, map, set);
        }
        return c2;
    }
    
    public static b E8(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static c F8(final c c, final int a, final int n, final Map<n0, p.a<n0>> map) {
        if (a <= n && c != null) {
            final p.a a2 = map.get(c);
            c c2;
            if (a2 == null) {
                c2 = new c();
                map.put(c, (p.a<n0>)new p.a(a, c2));
            }
            else {
                if (a >= a2.a) {
                    return (c)a2.b;
                }
                c2 = (c)a2.b;
                a2.a = a;
            }
            c2.b(c.a());
            c2.C4(t1.D8(c.e2(), a + 1, n, map));
            c2.j(c.f());
            c2.n0(c.r0());
            c2.W(c.H());
            return c2;
        }
        return null;
    }
    
    private static OsObjectSchemaInfo G8() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmExcuse", false, 5, 0);
        final RealmFieldType integer = RealmFieldType.INTEGER;
        b.c("", "id", integer, true, false, true);
        b.b("", "excuseStatus", RealmFieldType.OBJECT, "RealmExcuseStatus");
        b.c("", "text", RealmFieldType.STRING, false, false, true);
        b.c("", "number", integer, false, false, true);
        b.c("", "date", integer, false, false, true);
        return b.e();
    }
    
    public static c H8(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final ArrayList<String> list = new ArrayList<String>(1);
        Object x2 = null;
        Label_0146: {
            if (b) {
                x2 = f0.x2(c.class);
                final long e = ((b)f0.H().j(c.class)).e;
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
                        h.g(f0, ((Table)x2).R(r), f0.H().j(c.class), false, Collections.emptyList());
                        x2 = new r1();
                        break Label_0146;
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
            if (jsonObject.has("excuseStatus")) {
                list.add("excuseStatus");
            }
            if (!jsonObject.has("id")) {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
            r1 r2;
            if (jsonObject.isNull("id")) {
                r2 = f0.p1((Class<r1>)c.class, null, true, list);
            }
            else {
                r2 = f0.p1((Class<r1>)c.class, jsonObject.getLong("id"), true, list);
            }
            o = r2;
        }
        if (jsonObject.has("excuseStatus")) {
            if (jsonObject.isNull("excuseStatus")) {
                ((s1)o).C4(null);
            }
            else {
                ((s1)o).C4(t1.F8(f0, jsonObject.getJSONObject("excuseStatus"), b));
            }
        }
        if (jsonObject.has("text")) {
            if (jsonObject.isNull("text")) {
                ((s1)o).j(null);
            }
            else {
                ((s1)o).j(jsonObject.getString("text"));
            }
        }
        if (jsonObject.has("number")) {
            if (jsonObject.isNull("number")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'number' to null.");
            }
            ((s1)o).n0(jsonObject.getLong("number"));
        }
        if (jsonObject.has("date")) {
            if (jsonObject.isNull("date")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'date' to null.");
            }
            ((s1)o).W(jsonObject.getLong("date"));
        }
        return (c)o;
    }
    
    @TargetApi(11)
    public static c I8(final f0 f0, final JsonReader jsonReader) throws IOException {
        final c c = new c();
        jsonReader.beginObject();
        boolean b = false;
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
                c.b(jsonReader.nextLong());
                b = true;
            }
            else if (nextName.equals("excuseStatus")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    c.C4(null);
                }
                else {
                    c.C4(t1.G8(f0, jsonReader));
                }
            }
            else if (nextName.equals("text")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    c.j(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    c.j(null);
                }
            }
            else if (nextName.equals("number")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'number' to null.");
                }
                c.n0(jsonReader.nextLong());
            }
            else if (nextName.equals("date")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'date' to null.");
                }
                c.W(jsonReader.nextLong());
            }
            else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (b) {
            return f0.G0(c, new q[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }
    
    public static OsObjectSchemaInfo J8() {
        return r1.R;
    }
    
    public static String K8() {
        return "RealmExcuse";
    }
    
    public static long L8(final f0 f0, final c c, final Map<n0, Long> map) {
        if (c instanceof p && !p0.h8(c)) {
            final p p3 = (p)c;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(c.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(c.class);
        final long e = b.e;
        final Long value = c.a();
        long l;
        if (value != null) {
            l = Table.nativeFindFirstInt(nativePtr, e, c.a());
        }
        else {
            l = -1L;
        }
        if (l == -1L) {
            l = OsObject.createRowWithPrimaryKey(x2, e, c.a());
        }
        else {
            Table.v0(value);
        }
        map.put(c, l);
        final d e2 = c.e2();
        if (e2 != null) {
            Long value2;
            if ((value2 = map.get(e2)) == null) {
                value2 = t1.J8(f0, e2, map);
            }
            Table.nativeSetLink(nativePtr, b.f, l, value2, false);
        }
        final String f2 = c.f();
        if (f2 != null) {
            Table.nativeSetString(nativePtr, b.g, l, f2, false);
        }
        Table.nativeSetLong(nativePtr, b.h, l, c.r0(), false);
        Table.nativeSetLong(nativePtr, b.i, l, c.H(), false);
        return l;
    }
    
    public static void M8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(c.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(c.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final c c = (c)iterator.next();
            if (map.containsKey(c)) {
                continue;
            }
            if (c instanceof p && !p0.h8(c)) {
                final p p3 = (p)c;
                if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                    map.put(c, p3.S6().g().l0());
                    continue;
                }
            }
            final Long value = c.a();
            long l;
            if (value != null) {
                l = Table.nativeFindFirstInt(nativePtr, e, c.a());
            }
            else {
                l = -1L;
            }
            if (l == -1L) {
                l = OsObject.createRowWithPrimaryKey(x2, e, c.a());
            }
            else {
                Table.v0(value);
            }
            map.put(c, l);
            final d e2 = c.e2();
            if (e2 != null) {
                Long value2;
                if ((value2 = map.get(e2)) == null) {
                    value2 = t1.J8(f0, e2, map);
                }
                x2.p0(b.f, l, value2, false);
            }
            final String f2 = c.f();
            if (f2 != null) {
                Table.nativeSetString(nativePtr, b.g, l, f2, false);
            }
            Table.nativeSetLong(nativePtr, b.h, l, c.r0(), false);
            Table.nativeSetLong(nativePtr, b.i, l, c.H(), false);
        }
    }
    
    public static long N8(final f0 f0, final c c, final Map<n0, Long> map) {
        if (c instanceof p && !p0.h8(c)) {
            final p p3 = (p)c;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(c.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(c.class);
        final long e = b.e;
        long nativeFindFirstInt;
        if (Long.valueOf(c.a()) != null) {
            nativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, e, c.a());
        }
        else {
            nativeFindFirstInt = -1L;
        }
        long rowWithPrimaryKey = nativeFindFirstInt;
        if (nativeFindFirstInt == -1L) {
            rowWithPrimaryKey = OsObject.createRowWithPrimaryKey(x2, e, c.a());
        }
        map.put(c, rowWithPrimaryKey);
        final d e2 = c.e2();
        if (e2 != null) {
            Long value;
            if ((value = map.get(e2)) == null) {
                value = t1.L8(f0, e2, map);
            }
            Table.nativeSetLink(nativePtr, b.f, rowWithPrimaryKey, value, false);
        }
        else {
            Table.nativeNullifyLink(nativePtr, b.f, rowWithPrimaryKey);
        }
        final String f2 = c.f();
        final long g = b.g;
        if (f2 != null) {
            Table.nativeSetString(nativePtr, g, rowWithPrimaryKey, f2, false);
        }
        else {
            Table.nativeSetNull(nativePtr, g, rowWithPrimaryKey, false);
        }
        Table.nativeSetLong(nativePtr, b.h, rowWithPrimaryKey, c.r0(), false);
        Table.nativeSetLong(nativePtr, b.i, rowWithPrimaryKey, c.H(), false);
        return rowWithPrimaryKey;
    }
    
    public static void O8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(c.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(c.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final c c = (c)iterator.next();
            if (map.containsKey(c)) {
                continue;
            }
            if (c instanceof p && !p0.h8(c)) {
                final p p3 = (p)c;
                if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                    map.put(c, p3.S6().g().l0());
                    continue;
                }
            }
            long nativeFindFirstInt;
            if (Long.valueOf(c.a()) != null) {
                nativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, e, c.a());
            }
            else {
                nativeFindFirstInt = -1L;
            }
            long rowWithPrimaryKey = nativeFindFirstInt;
            if (nativeFindFirstInt == -1L) {
                rowWithPrimaryKey = OsObject.createRowWithPrimaryKey(x2, e, c.a());
            }
            map.put(c, rowWithPrimaryKey);
            final d e2 = c.e2();
            if (e2 != null) {
                Long value;
                if ((value = map.get(e2)) == null) {
                    value = t1.L8(f0, e2, map);
                }
                Table.nativeSetLink(nativePtr, b.f, rowWithPrimaryKey, value, false);
            }
            else {
                Table.nativeNullifyLink(nativePtr, b.f, rowWithPrimaryKey);
            }
            final String f2 = c.f();
            final long g = b.g;
            if (f2 != null) {
                Table.nativeSetString(nativePtr, g, rowWithPrimaryKey, f2, false);
            }
            else {
                Table.nativeSetNull(nativePtr, g, rowWithPrimaryKey, false);
            }
            Table.nativeSetLong(nativePtr, b.h, rowWithPrimaryKey, c.r0(), false);
            Table.nativeSetLong(nativePtr, b.i, rowWithPrimaryKey, c.H(), false);
        }
    }
    
    static r1 P8(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(c.class), false, Collections.emptyList());
        final r1 r2 = new r1();
        h.a();
        return r2;
    }
    
    static c Q8(final f0 f0, final b b, final c c, final c c2, final Map<n0, p> map, final Set<q> set) {
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(c.class), set);
        osObjectBuilder.L(b.e, c2.a());
        final d e2 = c2.e2();
        if (e2 == null) {
            osObjectBuilder.V(b.f);
        }
        else {
            final d d = (d)map.get(e2);
            if (d != null) {
                osObjectBuilder.W(b.f, d);
            }
            else {
                osObjectBuilder.W(b.f, t1.B8(f0, (t1.b)f0.H().j(d.class), e2, true, map, set));
            }
        }
        osObjectBuilder.d0(b.g, c2.f());
        osObjectBuilder.L(b.h, c2.r0());
        osObjectBuilder.L(b.i, c2.H());
        osObjectBuilder.i0();
        return c;
    }
    
    @Override
    public void C4(final d d) {
        final f0 f0 = (f0)this.P.f();
        if (this.P.i()) {
            if (!this.P.d()) {
                return;
            }
            if (this.P.e().contains("excuseStatus")) {
                return;
            }
            d d2;
            if ((d2 = d) != null) {
                d2 = d;
                if (!p0.j8(d)) {
                    d2 = f0.G0(d, new q[0]);
                }
            }
            final r g = this.P.g();
            if (d2 == null) {
                g.z(this.O.f);
                return;
            }
            this.P.c(d2);
            g.g().p0(this.O.f, g.l0(), ((p)d2).S6().g().l0(), true);
        }
        else {
            this.P.f().h();
            if (d == null) {
                this.P.g().z(this.O.f);
                return;
            }
            this.P.c(d);
            this.P.g().o(this.O.f, ((p)d).S6().g().l0());
        }
    }
    
    @Override
    public long H() {
        this.P.f().h();
        return this.P.g().m(this.O.i);
    }
    
    @Override
    public c0<?> S6() {
        return this.P;
    }
    
    @Override
    public void W(final long n) {
        if (!this.P.i()) {
            this.P.f().h();
            this.P.g().s(this.O.i, n);
            return;
        }
        if (!this.P.d()) {
            return;
        }
        final r g = this.P.g();
        g.g().q0(this.O.i, g.l0(), n, true);
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
    public d e2() {
        this.P.f().h();
        if (this.P.g().G(this.O.f)) {
            return null;
        }
        return this.P.f().x(d.class, this.P.g().P(this.O.f), false, Collections.emptyList());
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final r1 r1 = (r1)o;
        final io.realm.a f = this.P.f();
        final io.realm.a f2 = r1.P.f();
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
        final String i = r1.P.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.P.g().l0() == r1.P.g().l0();
            }
        }
        else if (i == null) {
            return this.P.g().l0() == r1.P.g().l0();
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
        final StringBuilder sb = new StringBuilder("RealmExcuse = proxy[");
        sb.append("{id:");
        sb.append(this.a());
        sb.append("}");
        sb.append(",");
        sb.append("{excuseStatus:");
        String str;
        if (this.e2() != null) {
            str = "RealmExcuseStatus";
        }
        else {
            str = "null";
        }
        sb.append(str);
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
        (this.P = new c0<c>(this)).r(h.e());
        this.P.s(h.f());
        this.P.o(h.b());
        this.P.q(h.d());
    }
    
    public static final class a
    {
        public static final String a = "RealmExcuse";
    }
    
    static final class b extends io.realm.internal.c
    {
        long e;
        long f;
        long g;
        long h;
        long i;
        
        b(final OsSchemaInfo osSchemaInfo) {
            super(5);
            final OsObjectSchemaInfo b = osSchemaInfo.b("RealmExcuse");
            this.e = this.b("id", "id", b);
            this.f = this.b("excuseStatus", "excuseStatus", b);
            this.g = this.b("text", "text", b);
            this.h = this.b("number", "number", b);
            this.i = this.b("date", "date", b);
        }
        
        b(final io.realm.internal.c c, final boolean b) {
            super(c, b);
            this.d(c, this);
        }
        
        @Override
        protected final io.realm.internal.c c(final boolean b) {
            return new b(this, b);
        }
        
        @Override
        protected final void d(final io.realm.internal.c c, final io.realm.internal.c c2) {
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
