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
import l4.b;

public class d2 extends l4.b implements p, e2
{
    private static final String R = "";
    private static final OsObjectSchemaInfo S;
    private b P;
    private c0<l4.b> Q;
    
    static {
        S = I8();
    }
    
    d2() {
        this.Q.p();
    }
    
    public static l4.b E8(final f0 f0, final b b, final l4.b b2, final boolean b3, final Map<n0, p> map, final Set<q> set) {
        final d2 d2 = map.get(b2);
        if (d2 != null) {
            return d2;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(l4.b.class), set);
        osObjectBuilder.L(b.e, b2.a());
        osObjectBuilder.d0(b.f, b2.g());
        osObjectBuilder.d0(b.g, b2.n());
        osObjectBuilder.K(b.h, b2.l());
        osObjectBuilder.L(b.i, b2.I4());
        osObjectBuilder.n(b.j, b2.t());
        final d2 r8 = R8(f0, osObjectBuilder.f0());
        map.put(b2, r8);
        return r8;
    }
    
    public static l4.b F8(final f0 f0, final b b, final l4.b b2, final boolean b3, final Map<n0, p> map, final Set<q> set) {
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
            return (l4.b)p7;
        }
        final p p8 = null;
        Object x2 = null;
        boolean b4 = false;
        Label_0232: {
            if (b3) {
                x2 = f0.x2(l4.b.class);
                final long r = ((Table)x2).r(b.e, b2.a());
                if (r == -1L) {
                    b4 = false;
                    x2 = p8;
                    break Label_0232;
                }
                try {
                    h.g(f0, ((Table)x2).R(r), b, false, Collections.emptyList());
                    x2 = new d2();
                    map.put(b2, (p)x2);
                }
                finally {
                    h.a();
                }
            }
            b4 = b3;
        }
        l4.b b5;
        if (b4) {
            b5 = S8(f0, b, (l4.b)x2, b2, map, set);
        }
        else {
            b5 = E8(f0, b, b2, b3, map, set);
        }
        return b5;
    }
    
    public static b G8(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static l4.b H8(final l4.b b, final int a, final int n, final Map<n0, p.a<n0>> map) {
        if (a <= n && b != null) {
            final p.a a2 = map.get(b);
            l4.b b3;
            if (a2 == null) {
                final l4.b b2 = new l4.b();
                map.put(b, (p.a<n0>)new p.a(a, b2));
                b3 = b2;
            }
            else {
                if (a >= a2.a) {
                    return (l4.b)a2.b;
                }
                b3 = (l4.b)a2.b;
                a2.a = a;
            }
            b3.b(b.a());
            b3.e(b.g());
            b3.m(b.n());
            b3.k(b.l());
            b3.M2(b.I4());
            b3.s(b.t());
            return b3;
        }
        return null;
    }
    
    private static OsObjectSchemaInfo I8() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmEventReason", false, 6, 0);
        final RealmFieldType integer = RealmFieldType.INTEGER;
        b.c("", "id", integer, true, false, true);
        final RealmFieldType string = RealmFieldType.STRING;
        b.c("", "name", string, false, false, true);
        b.c("", "longName", string, false, false, true);
        b.c("", "entityType", integer, false, false, true);
        b.c("", "groupId", integer, false, false, true);
        b.c("", "active", RealmFieldType.BOOLEAN, false, false, true);
        return b.e();
    }
    
    public static l4.b J8(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final List<String> emptyList = Collections.emptyList();
        Object x2 = null;
        Label_0141: {
            if (b) {
                x2 = f0.x2(l4.b.class);
                final long e = ((b)f0.H().j(l4.b.class)).e;
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
                        h.g(f0, ((Table)x2).R(r), f0.H().j(l4.b.class), false, Collections.emptyList());
                        x2 = new d2();
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
            d2 d2;
            if (jsonObject.isNull("id")) {
                d2 = f0.p1((Class<d2>)l4.b.class, null, true, emptyList);
            }
            else {
                d2 = f0.p1((Class<d2>)l4.b.class, jsonObject.getLong("id"), true, emptyList);
            }
            o = d2;
        }
        if (jsonObject.has("name")) {
            if (jsonObject.isNull("name")) {
                ((e2)o).e(null);
            }
            else {
                ((e2)o).e(jsonObject.getString("name"));
            }
        }
        if (jsonObject.has("longName")) {
            if (jsonObject.isNull("longName")) {
                ((e2)o).m(null);
            }
            else {
                ((e2)o).m(jsonObject.getString("longName"));
            }
        }
        if (jsonObject.has("entityType")) {
            if (jsonObject.isNull("entityType")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'entityType' to null.");
            }
            ((e2)o).k(jsonObject.getInt("entityType"));
        }
        if (jsonObject.has("groupId")) {
            if (jsonObject.isNull("groupId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'groupId' to null.");
            }
            ((e2)o).M2(jsonObject.getLong("groupId"));
        }
        if (jsonObject.has("active")) {
            if (jsonObject.isNull("active")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'active' to null.");
            }
            ((e2)o).s(jsonObject.getBoolean("active"));
        }
        return (l4.b)o;
    }
    
    @TargetApi(11)
    public static l4.b K8(final f0 f0, final JsonReader jsonReader) throws IOException {
        final l4.b b = new l4.b();
        jsonReader.beginObject();
        boolean b2 = false;
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
                b.b(jsonReader.nextLong());
                b2 = true;
            }
            else if (nextName.equals("name")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    b.e(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    b.e(null);
                }
            }
            else if (nextName.equals("longName")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    b.m(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    b.m(null);
                }
            }
            else if (nextName.equals("entityType")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'entityType' to null.");
                }
                b.k(jsonReader.nextInt());
            }
            else if (nextName.equals("groupId")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'groupId' to null.");
                }
                b.M2(jsonReader.nextLong());
            }
            else if (nextName.equals("active")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'active' to null.");
                }
                b.s(jsonReader.nextBoolean());
            }
            else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (b2) {
            return f0.G0(b, new q[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }
    
    public static OsObjectSchemaInfo L8() {
        return d2.S;
    }
    
    public static String M8() {
        return "RealmEventReason";
    }
    
    public static long N8(final f0 f0, final l4.b b, final Map<n0, Long> map) {
        if (b instanceof p && !p0.h8(b)) {
            final p p3 = (p)b;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(l4.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b2 = (b)f0.H().j(l4.b.class);
        final long e = b2.e;
        final Long value = b.a();
        long l;
        if (value != null) {
            l = Table.nativeFindFirstInt(nativePtr, e, b.a());
        }
        else {
            l = -1L;
        }
        if (l == -1L) {
            l = OsObject.createRowWithPrimaryKey(x2, e, b.a());
        }
        else {
            Table.v0(value);
        }
        map.put(b, l);
        final String g = b.g();
        if (g != null) {
            Table.nativeSetString(nativePtr, b2.f, l, g, false);
        }
        final String n = b.n();
        if (n != null) {
            Table.nativeSetString(nativePtr, b2.g, l, n, false);
        }
        Table.nativeSetLong(nativePtr, b2.h, l, b.l(), false);
        Table.nativeSetLong(nativePtr, b2.i, l, b.I4(), false);
        Table.nativeSetBoolean(nativePtr, b2.j, l, b.t(), false);
        return l;
    }
    
    public static void O8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(l4.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(l4.b.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final l4.b b2 = (l4.b)iterator.next();
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
            final Long value = b2.a();
            long l;
            if (value != null) {
                l = Table.nativeFindFirstInt(nativePtr, e, b2.a());
            }
            else {
                l = -1L;
            }
            if (l == -1L) {
                l = OsObject.createRowWithPrimaryKey(x2, e, b2.a());
            }
            else {
                Table.v0(value);
            }
            map.put(b2, l);
            final String g = b2.g();
            if (g != null) {
                Table.nativeSetString(nativePtr, b.f, l, g, false);
            }
            final String n = b2.n();
            if (n != null) {
                Table.nativeSetString(nativePtr, b.g, l, n, false);
            }
            Table.nativeSetLong(nativePtr, b.h, l, b2.l(), false);
            Table.nativeSetLong(nativePtr, b.i, l, b2.I4(), false);
            Table.nativeSetBoolean(nativePtr, b.j, l, b2.t(), false);
        }
    }
    
    public static long P8(final f0 f0, final l4.b b, final Map<n0, Long> map) {
        if (b instanceof p && !p0.h8(b)) {
            final p p3 = (p)b;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(l4.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b2 = (b)f0.H().j(l4.b.class);
        final long e = b2.e;
        long nativeFindFirstInt;
        if (Long.valueOf(b.a()) != null) {
            nativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, e, b.a());
        }
        else {
            nativeFindFirstInt = -1L;
        }
        long rowWithPrimaryKey = nativeFindFirstInt;
        if (nativeFindFirstInt == -1L) {
            rowWithPrimaryKey = OsObject.createRowWithPrimaryKey(x2, e, b.a());
        }
        map.put(b, rowWithPrimaryKey);
        final String g = b.g();
        final long f2 = b2.f;
        if (g != null) {
            Table.nativeSetString(nativePtr, f2, rowWithPrimaryKey, g, false);
        }
        else {
            Table.nativeSetNull(nativePtr, f2, rowWithPrimaryKey, false);
        }
        final String n = b.n();
        final long g2 = b2.g;
        if (n != null) {
            Table.nativeSetString(nativePtr, g2, rowWithPrimaryKey, n, false);
        }
        else {
            Table.nativeSetNull(nativePtr, g2, rowWithPrimaryKey, false);
        }
        Table.nativeSetLong(nativePtr, b2.h, rowWithPrimaryKey, b.l(), false);
        Table.nativeSetLong(nativePtr, b2.i, rowWithPrimaryKey, b.I4(), false);
        Table.nativeSetBoolean(nativePtr, b2.j, rowWithPrimaryKey, b.t(), false);
        return rowWithPrimaryKey;
    }
    
    public static void Q8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(l4.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(l4.b.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final l4.b b2 = (l4.b)iterator.next();
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
            long nativeFindFirstInt;
            if (Long.valueOf(b2.a()) != null) {
                nativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, e, b2.a());
            }
            else {
                nativeFindFirstInt = -1L;
            }
            long rowWithPrimaryKey = nativeFindFirstInt;
            if (nativeFindFirstInt == -1L) {
                rowWithPrimaryKey = OsObject.createRowWithPrimaryKey(x2, e, b2.a());
            }
            map.put(b2, rowWithPrimaryKey);
            final String g = b2.g();
            if (g != null) {
                Table.nativeSetString(nativePtr, b.f, rowWithPrimaryKey, g, false);
            }
            else {
                Table.nativeSetNull(nativePtr, b.f, rowWithPrimaryKey, false);
            }
            final String n = b2.n();
            final long g2 = b.g;
            if (n != null) {
                Table.nativeSetString(nativePtr, g2, rowWithPrimaryKey, n, false);
            }
            else {
                Table.nativeSetNull(nativePtr, g2, rowWithPrimaryKey, false);
            }
            Table.nativeSetLong(nativePtr, b.h, rowWithPrimaryKey, b2.l(), false);
            Table.nativeSetLong(nativePtr, b.i, rowWithPrimaryKey, b2.I4(), false);
            Table.nativeSetBoolean(nativePtr, b.j, rowWithPrimaryKey, b2.t(), false);
        }
    }
    
    static d2 R8(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(l4.b.class), false, Collections.emptyList());
        final d2 d2 = new d2();
        h.a();
        return d2;
    }
    
    static l4.b S8(final f0 f0, final b b, final l4.b b2, final l4.b b3, final Map<n0, p> map, final Set<q> set) {
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(l4.b.class), set);
        osObjectBuilder.L(b.e, b3.a());
        osObjectBuilder.d0(b.f, b3.g());
        osObjectBuilder.d0(b.g, b3.n());
        osObjectBuilder.K(b.h, b3.l());
        osObjectBuilder.L(b.i, b3.I4());
        osObjectBuilder.n(b.j, b3.t());
        osObjectBuilder.i0();
        return b2;
    }
    
    @Override
    public long I4() {
        this.Q.f().h();
        return this.Q.g().m(this.P.i);
    }
    
    @Override
    public void M2(final long n) {
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
    public c0<?> S6() {
        return this.Q;
    }
    
    @Override
    public long a() {
        this.Q.f().h();
        return this.Q.g().m(this.P.e);
    }
    
    @Override
    public void b(final long n) {
        if (this.Q.i()) {
            return;
        }
        this.Q.f().h();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }
    
    @Override
    public void e(final String s) {
        if (this.Q.i()) {
            if (!this.Q.d()) {
                return;
            }
            final r g = this.Q.g();
            if (s != null) {
                g.g().t0(this.P.f, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'name' to null.");
        }
        else {
            this.Q.f().h();
            if (s != null) {
                this.Q.g().d(this.P.f, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'name' to null.");
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final d2 d2 = (d2)o;
        final io.realm.a f = this.Q.f();
        final io.realm.a f2 = d2.Q.f();
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
        final String i = d2.Q.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.Q.g().l0() == d2.Q.g().l0();
            }
        }
        else if (i == null) {
            return this.Q.g().l0() == d2.Q.g().l0();
        }
        return false;
    }
    
    @Override
    public String g() {
        this.Q.f().h();
        return this.Q.g().U(this.P.f);
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
    public int l() {
        this.Q.f().h();
        return (int)this.Q.g().m(this.P.h);
    }
    
    @Override
    public void m(final String s) {
        if (this.Q.i()) {
            if (!this.Q.d()) {
                return;
            }
            final r g = this.Q.g();
            if (s != null) {
                g.g().t0(this.P.g, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'longName' to null.");
        }
        else {
            this.Q.f().h();
            if (s != null) {
                this.Q.g().d(this.P.g, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'longName' to null.");
        }
    }
    
    @Override
    public String n() {
        this.Q.f().h();
        return this.Q.g().U(this.P.g);
    }
    
    @Override
    public void s(final boolean b) {
        if (!this.Q.i()) {
            this.Q.f().h();
            this.Q.g().i(this.P.j, b);
            return;
        }
        if (!this.Q.d()) {
            return;
        }
        final r g = this.Q.g();
        g.g().j0(this.P.j, g.l0(), b, true);
    }
    
    @Override
    public boolean t() {
        this.Q.f().h();
        return this.Q.g().l(this.P.j);
    }
    
    @Override
    public String toString() {
        if (!p0.k8(this)) {
            return "Invalid object";
        }
        final StringBuilder sb = new StringBuilder("RealmEventReason = proxy[");
        sb.append("{id:");
        sb.append(this.a());
        sb.append("}");
        sb.append(",");
        sb.append("{name:");
        sb.append(this.g());
        sb.append("}");
        sb.append(",");
        sb.append("{longName:");
        sb.append(this.n());
        sb.append("}");
        sb.append(",");
        sb.append("{entityType:");
        sb.append(this.l());
        sb.append("}");
        sb.append(",");
        sb.append("{groupId:");
        sb.append(this.I4());
        sb.append("}");
        sb.append(",");
        sb.append("{active:");
        sb.append(this.t());
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
        (this.Q = new c0<l4.b>(this)).r(h.e());
        this.Q.s(h.f());
        this.Q.o(h.b());
        this.Q.q(h.d());
    }
    
    public static final class a
    {
        public static final String a = "RealmEventReason";
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
            final OsObjectSchemaInfo b = osSchemaInfo.b("RealmEventReason");
            this.e = this.b("id", "id", b);
            this.f = this.b("name", "name", b);
            this.g = this.b("longName", "longName", b);
            this.h = this.b("entityType", "entityType", b);
            this.i = this.b("groupId", "groupId", b);
            this.j = this.b("active", "active", b);
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
