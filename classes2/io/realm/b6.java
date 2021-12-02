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
import c5.d;

public class b6 extends d implements p, c6
{
    private static final String R = "";
    private static final OsObjectSchemaInfo S;
    private b P;
    private c0<d> Q;
    
    static {
        S = I8();
    }
    
    b6() {
        this.Q.p();
    }
    
    public static d E8(final f0 f0, final b b, final d d, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        final b6 b3 = map.get(d);
        if (b3 != null) {
            return b3;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(d.class), set);
        osObjectBuilder.K(b.e, d.l());
        osObjectBuilder.L(b.f, d.o());
        osObjectBuilder.n(b.g, d.c6());
        osObjectBuilder.K(b.h, d.t6());
        osObjectBuilder.L(b.i, d.b0());
        osObjectBuilder.d0(b.j, d.a());
        final b6 r8 = R8(f0, osObjectBuilder.f0());
        map.put(d, r8);
        return r8;
    }
    
    public static d F8(final f0 f0, final b b, final d d, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        if (d instanceof p && !p0.h8(d)) {
            final p p6 = (p)d;
            if (p6.S6().f() != null) {
                final io.realm.a f2 = p6.S6().f();
                if (f2.H != f0.H) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
                if (f2.getPath().equals(f0.getPath())) {
                    return d;
                }
            }
        }
        final io.realm.a.h h = io.realm.a.W.get();
        final p p7 = map.get(d);
        if (p7 != null) {
            return (d)p7;
        }
        final p p8 = null;
        Object x2 = null;
        boolean b3 = false;
        Label_0232: {
            if (b2) {
                x2 = f0.x2(d.class);
                final long u = ((Table)x2).u(b.j, d.a());
                if (u == -1L) {
                    b3 = false;
                    x2 = p8;
                    break Label_0232;
                }
                try {
                    h.g(f0, ((Table)x2).R(u), b, false, Collections.emptyList());
                    x2 = new b6();
                    map.put(d, (p)x2);
                }
                finally {
                    h.a();
                }
            }
            b3 = b2;
        }
        d d2;
        if (b3) {
            d2 = S8(f0, b, (d)x2, d, map, set);
        }
        else {
            d2 = E8(f0, b, d, b2, map, set);
        }
        return d2;
    }
    
    public static b G8(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static d H8(final d d, final int a, final int n, final Map<n0, p.a<n0>> map) {
        if (a <= n && d != null) {
            final p.a a2 = map.get(d);
            d d3;
            if (a2 == null) {
                final d d2 = new d();
                map.put(d, (p.a<n0>)new p.a(a, d2));
                d3 = d2;
            }
            else {
                if (a >= a2.a) {
                    return (d)a2.b;
                }
                d3 = (d)a2.b;
                a2.a = a;
            }
            d3.k(d.l());
            d3.p(d.o());
            d3.R6(d.c6());
            d3.s7(d.t6());
            d3.s0(d.b0());
            d3.D1(d.a());
            return d3;
        }
        return null;
    }
    
    private static OsObjectSchemaInfo I8() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmTimeTableEntity", false, 6, 0);
        final RealmFieldType integer = RealmFieldType.INTEGER;
        b.c("", "entityType", integer, false, false, true);
        b.c("", "entityId", integer, false, false, true);
        b.c("", "favorite", RealmFieldType.BOOLEAN, false, false, true);
        b.c("", "counter", integer, false, false, true);
        b.c("", "timestamp", integer, false, false, true);
        b.c("", "id", RealmFieldType.STRING, true, false, true);
        return b.e();
    }
    
    public static d J8(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final List<String> emptyList = Collections.emptyList();
        Object x2 = null;
        Label_0141: {
            if (b) {
                x2 = f0.x2(d.class);
                final long j = ((b)f0.H().j(d.class)).j;
                long u;
                if (!jsonObject.isNull("id")) {
                    u = ((Table)x2).u(j, jsonObject.getString("id"));
                }
                else {
                    u = -1L;
                }
                if (u != -1L) {
                    final io.realm.a.h h = io.realm.a.W.get();
                    try {
                        h.g(f0, ((Table)x2).R(u), f0.H().j(d.class), false, Collections.emptyList());
                        x2 = new b6();
                        break Label_0141;
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
            b6 b2;
            if (jsonObject.isNull("id")) {
                b2 = f0.p1((Class<b6>)d.class, null, true, emptyList);
            }
            else {
                b2 = f0.p1((Class<b6>)d.class, jsonObject.getString("id"), true, emptyList);
            }
            o = b2;
        }
        if (jsonObject.has("entityType")) {
            if (jsonObject.isNull("entityType")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'entityType' to null.");
            }
            ((c6)o).k(jsonObject.getInt("entityType"));
        }
        if (jsonObject.has("entityId")) {
            if (jsonObject.isNull("entityId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'entityId' to null.");
            }
            ((c6)o).p(jsonObject.getLong("entityId"));
        }
        if (jsonObject.has("favorite")) {
            if (jsonObject.isNull("favorite")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'favorite' to null.");
            }
            ((c6)o).R6(jsonObject.getBoolean("favorite"));
        }
        if (jsonObject.has("counter")) {
            if (jsonObject.isNull("counter")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'counter' to null.");
            }
            ((c6)o).s7(jsonObject.getInt("counter"));
        }
        if (jsonObject.has("timestamp")) {
            if (jsonObject.isNull("timestamp")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'timestamp' to null.");
            }
            ((c6)o).s0(jsonObject.getLong("timestamp"));
        }
        return (d)o;
    }
    
    @TargetApi(11)
    public static d K8(final f0 f0, final JsonReader jsonReader) throws IOException {
        final d d = new d();
        jsonReader.beginObject();
        boolean b = false;
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            if (nextName.equals("entityType")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'entityType' to null.");
                }
                d.k(jsonReader.nextInt());
            }
            else if (nextName.equals("entityId")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'entityId' to null.");
                }
                d.p(jsonReader.nextLong());
            }
            else if (nextName.equals("favorite")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'favorite' to null.");
                }
                d.R6(jsonReader.nextBoolean());
            }
            else if (nextName.equals("counter")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'counter' to null.");
                }
                d.s7(jsonReader.nextInt());
            }
            else if (nextName.equals("timestamp")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'timestamp' to null.");
                }
                d.s0(jsonReader.nextLong());
            }
            else if (nextName.equals("id")) {
                String nextString;
                if (jsonReader.peek() != JsonToken.NULL) {
                    nextString = jsonReader.nextString();
                }
                else {
                    jsonReader.skipValue();
                    nextString = null;
                }
                d.D1(nextString);
                b = true;
            }
            else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (b) {
            return f0.G0(d, new q[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }
    
    public static OsObjectSchemaInfo L8() {
        return b6.S;
    }
    
    public static String M8() {
        return "RealmTimeTableEntity";
    }
    
    public static long N8(final f0 f0, final d d, final Map<n0, Long> map) {
        if (d instanceof p && !p0.h8(d)) {
            final p p3 = (p)d;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(d.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(d.class);
        final long j = b.j;
        final String a = d.a();
        long l;
        if (a != null) {
            l = Table.nativeFindFirstString(nativePtr, j, a);
        }
        else {
            l = -1L;
        }
        if (l == -1L) {
            l = OsObject.createRowWithPrimaryKey(x2, j, a);
        }
        else {
            Table.v0(a);
        }
        map.put(d, l);
        Table.nativeSetLong(nativePtr, b.e, l, d.l(), false);
        Table.nativeSetLong(nativePtr, b.f, l, d.o(), false);
        Table.nativeSetBoolean(nativePtr, b.g, l, d.c6(), false);
        Table.nativeSetLong(nativePtr, b.h, l, d.t6(), false);
        Table.nativeSetLong(nativePtr, b.i, l, d.b0(), false);
        return l;
    }
    
    public static void O8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(d.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(d.class);
        final long j = b.j;
        while (iterator.hasNext()) {
            final d d = (d)iterator.next();
            if (map.containsKey(d)) {
                continue;
            }
            if (d instanceof p && !p0.h8(d)) {
                final p p3 = (p)d;
                if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                    map.put(d, p3.S6().g().l0());
                    continue;
                }
            }
            final String a = d.a();
            long l;
            if (a != null) {
                l = Table.nativeFindFirstString(nativePtr, j, a);
            }
            else {
                l = -1L;
            }
            if (l == -1L) {
                l = OsObject.createRowWithPrimaryKey(x2, j, a);
            }
            else {
                Table.v0(a);
            }
            map.put(d, l);
            Table.nativeSetLong(nativePtr, b.e, l, d.l(), false);
            Table.nativeSetLong(nativePtr, b.f, l, d.o(), false);
            Table.nativeSetBoolean(nativePtr, b.g, l, d.c6(), false);
            Table.nativeSetLong(nativePtr, b.h, l, d.t6(), false);
            Table.nativeSetLong(nativePtr, b.i, l, d.b0(), false);
        }
    }
    
    public static long P8(final f0 f0, final d d, final Map<n0, Long> map) {
        if (d instanceof p && !p0.h8(d)) {
            final p p3 = (p)d;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(d.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(d.class);
        final long j = b.j;
        final String a = d.a();
        long nativeFindFirstString;
        if (a != null) {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j, a);
        }
        else {
            nativeFindFirstString = -1L;
        }
        long rowWithPrimaryKey = nativeFindFirstString;
        if (nativeFindFirstString == -1L) {
            rowWithPrimaryKey = OsObject.createRowWithPrimaryKey(x2, j, a);
        }
        map.put(d, rowWithPrimaryKey);
        Table.nativeSetLong(nativePtr, b.e, rowWithPrimaryKey, d.l(), false);
        Table.nativeSetLong(nativePtr, b.f, rowWithPrimaryKey, d.o(), false);
        Table.nativeSetBoolean(nativePtr, b.g, rowWithPrimaryKey, d.c6(), false);
        Table.nativeSetLong(nativePtr, b.h, rowWithPrimaryKey, d.t6(), false);
        Table.nativeSetLong(nativePtr, b.i, rowWithPrimaryKey, d.b0(), false);
        return rowWithPrimaryKey;
    }
    
    public static void Q8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(d.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(d.class);
        final long j = b.j;
        while (iterator.hasNext()) {
            final d d = (d)iterator.next();
            if (map.containsKey(d)) {
                continue;
            }
            if (d instanceof p && !p0.h8(d)) {
                final p p3 = (p)d;
                if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                    map.put(d, p3.S6().g().l0());
                    continue;
                }
            }
            final String a = d.a();
            long l;
            if (a != null) {
                l = Table.nativeFindFirstString(nativePtr, j, a);
            }
            else {
                l = -1L;
            }
            if (l == -1L) {
                l = OsObject.createRowWithPrimaryKey(x2, j, a);
            }
            map.put(d, l);
            Table.nativeSetLong(nativePtr, b.e, l, d.l(), false);
            Table.nativeSetLong(nativePtr, b.f, l, d.o(), false);
            Table.nativeSetBoolean(nativePtr, b.g, l, d.c6(), false);
            Table.nativeSetLong(nativePtr, b.h, l, d.t6(), false);
            Table.nativeSetLong(nativePtr, b.i, l, d.b0(), false);
        }
    }
    
    static b6 R8(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(d.class), false, Collections.emptyList());
        final b6 b6 = new b6();
        h.a();
        return b6;
    }
    
    static d S8(final f0 f0, final b b, final d d, final d d2, final Map<n0, p> map, final Set<q> set) {
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(d.class), set);
        osObjectBuilder.K(b.e, d2.l());
        osObjectBuilder.L(b.f, d2.o());
        osObjectBuilder.n(b.g, d2.c6());
        osObjectBuilder.K(b.h, d2.t6());
        osObjectBuilder.L(b.i, d2.b0());
        osObjectBuilder.d0(b.j, d2.a());
        osObjectBuilder.i0();
        return d;
    }
    
    @Override
    public void D1(final String s) {
        if (this.Q.i()) {
            return;
        }
        this.Q.f().h();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }
    
    @Override
    public void R6(final boolean b) {
        if (!this.Q.i()) {
            this.Q.f().h();
            this.Q.g().i(this.P.g, b);
            return;
        }
        if (!this.Q.d()) {
            return;
        }
        final r g = this.Q.g();
        g.g().j0(this.P.g, g.l0(), b, true);
    }
    
    @Override
    public c0<?> S6() {
        return this.Q;
    }
    
    @Override
    public String a() {
        this.Q.f().h();
        return this.Q.g().U(this.P.j);
    }
    
    @Override
    public long b0() {
        this.Q.f().h();
        return this.Q.g().m(this.P.i);
    }
    
    @Override
    public boolean c6() {
        this.Q.f().h();
        return this.Q.g().l(this.P.g);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final b6 b6 = (b6)o;
        final io.realm.a f = this.Q.f();
        final io.realm.a f2 = b6.Q.f();
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
        final String i = b6.Q.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.Q.g().l0() == b6.Q.g().l0();
            }
        }
        else if (i == null) {
            return this.Q.g().l0() == b6.Q.g().l0();
        }
        return false;
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
    public void k(final int n) {
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
    public int l() {
        this.Q.f().h();
        return (int)this.Q.g().m(this.P.e);
    }
    
    @Override
    public long o() {
        this.Q.f().h();
        return this.Q.g().m(this.P.f);
    }
    
    @Override
    public void p(final long n) {
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
    public void s0(final long n) {
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
    public void s7(final int n) {
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
    public int t6() {
        this.Q.f().h();
        return (int)this.Q.g().m(this.P.h);
    }
    
    @Override
    public String toString() {
        if (!p0.k8(this)) {
            return "Invalid object";
        }
        final StringBuilder sb = new StringBuilder("RealmTimeTableEntity = proxy[");
        sb.append("{entityType:");
        sb.append(this.l());
        sb.append("}");
        sb.append(",");
        sb.append("{entityId:");
        sb.append(this.o());
        sb.append("}");
        sb.append(",");
        sb.append("{favorite:");
        sb.append(this.c6());
        sb.append("}");
        sb.append(",");
        sb.append("{counter:");
        sb.append(this.t6());
        sb.append("}");
        sb.append(",");
        sb.append("{timestamp:");
        sb.append(this.b0());
        sb.append("}");
        sb.append(",");
        sb.append("{id:");
        sb.append(this.a());
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
        (this.Q = new c0<d>(this)).r(h.e());
        this.Q.s(h.f());
        this.Q.o(h.b());
        this.Q.q(h.d());
    }
    
    public static final class a
    {
        public static final String a = "RealmTimeTableEntity";
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
            final OsObjectSchemaInfo b = osSchemaInfo.b("RealmTimeTableEntity");
            this.e = this.b("entityType", "entityType", b);
            this.f = this.b("entityId", "entityId", b);
            this.g = this.b("favorite", "favorite", b);
            this.h = this.b("counter", "counter", b);
            this.i = this.b("timestamp", "timestamp", b);
            this.j = this.b("id", "id", b);
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
