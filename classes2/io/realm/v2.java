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
import r4.b;

public class v2 extends r4.b implements p, w2
{
    private static final String R = "";
    private static final OsObjectSchemaInfo S;
    private b P;
    private c0<r4.b> Q;
    
    static {
        S = I8();
    }
    
    v2() {
        this.Q.p();
    }
    
    public static r4.b E8(final f0 f0, final b b, final r4.b b2, final boolean b3, final Map<n0, p> map, final Set<q> set) {
        final v2 v2 = map.get(b2);
        if (v2 != null) {
            return v2;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(r4.b.class), set);
        osObjectBuilder.L(b.e, b2.a());
        osObjectBuilder.K(b.f, b2.l());
        osObjectBuilder.L(b.g, b2.o());
        osObjectBuilder.d0(b.h, b2.d1());
        osObjectBuilder.d0(b.i, b2.f());
        osObjectBuilder.L(b.j, b2.Q0());
        final v2 r8 = R8(f0, osObjectBuilder.f0());
        map.put(b2, r8);
        return r8;
    }
    
    public static r4.b F8(final f0 f0, final b b, final r4.b b2, final boolean b3, final Map<n0, p> map, final Set<q> set) {
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
            return (r4.b)p7;
        }
        final p p8 = null;
        Object x2 = null;
        boolean b4 = false;
        Label_0232: {
            if (b3) {
                x2 = f0.x2(r4.b.class);
                final long r = ((Table)x2).r(b.e, b2.a());
                if (r == -1L) {
                    b4 = false;
                    x2 = p8;
                    break Label_0232;
                }
                try {
                    h.g(f0, ((Table)x2).R(r), b, false, Collections.emptyList());
                    x2 = new v2();
                    map.put(b2, (p)x2);
                }
                finally {
                    h.a();
                }
            }
            b4 = b3;
        }
        r4.b b5;
        if (b4) {
            b5 = S8(f0, b, (r4.b)x2, b2, map, set);
        }
        else {
            b5 = E8(f0, b, b2, b3, map, set);
        }
        return b5;
    }
    
    public static b G8(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static r4.b H8(final r4.b b, final int a, final int n, final Map<n0, p.a<n0>> map) {
        if (a <= n && b != null) {
            final p.a a2 = map.get(b);
            r4.b b3;
            if (a2 == null) {
                final r4.b b2 = new r4.b();
                map.put(b, (p.a<n0>)new p.a(a, b2));
                b3 = b2;
            }
            else {
                if (a >= a2.a) {
                    return (r4.b)a2.b;
                }
                b3 = (r4.b)a2.b;
                a2.a = a;
            }
            b3.b(b.a());
            b3.k(b.l());
            b3.p(b.o());
            b3.W6(b.d1());
            b3.j(b.f());
            b3.U0(b.Q0());
            return b3;
        }
        return null;
    }
    
    private static OsObjectSchemaInfo I8() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmClassLeadEvent", false, 6, 0);
        final RealmFieldType integer = RealmFieldType.INTEGER;
        b.c("", "id", integer, true, false, true);
        b.c("", "entityType", integer, false, false, true);
        b.c("", "entityId", integer, false, false, true);
        final RealmFieldType string = RealmFieldType.STRING;
        b.c("", "dateTime", string, false, false, true);
        b.c("", "text", string, false, false, true);
        b.c("", "eventReasonId", integer, false, false, true);
        return b.e();
    }
    
    public static r4.b J8(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final List<String> emptyList = Collections.emptyList();
        Object x2 = null;
        Label_0141: {
            if (b) {
                x2 = f0.x2(r4.b.class);
                final long e = ((b)f0.H().j(r4.b.class)).e;
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
                        h.g(f0, ((Table)x2).R(r), f0.H().j(r4.b.class), false, Collections.emptyList());
                        x2 = new v2();
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
            v2 v2;
            if (jsonObject.isNull("id")) {
                v2 = f0.p1((Class<v2>)r4.b.class, null, true, emptyList);
            }
            else {
                v2 = f0.p1((Class<v2>)r4.b.class, jsonObject.getLong("id"), true, emptyList);
            }
            o = v2;
        }
        if (jsonObject.has("entityType")) {
            if (jsonObject.isNull("entityType")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'entityType' to null.");
            }
            ((w2)o).k(jsonObject.getInt("entityType"));
        }
        if (jsonObject.has("entityId")) {
            if (jsonObject.isNull("entityId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'entityId' to null.");
            }
            ((w2)o).p(jsonObject.getLong("entityId"));
        }
        if (jsonObject.has("dateTime")) {
            if (jsonObject.isNull("dateTime")) {
                ((w2)o).W6(null);
            }
            else {
                ((w2)o).W6(jsonObject.getString("dateTime"));
            }
        }
        if (jsonObject.has("text")) {
            if (jsonObject.isNull("text")) {
                ((w2)o).j(null);
            }
            else {
                ((w2)o).j(jsonObject.getString("text"));
            }
        }
        if (jsonObject.has("eventReasonId")) {
            if (jsonObject.isNull("eventReasonId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'eventReasonId' to null.");
            }
            ((w2)o).U0(jsonObject.getLong("eventReasonId"));
        }
        return (r4.b)o;
    }
    
    @TargetApi(11)
    public static r4.b K8(final f0 f0, final JsonReader jsonReader) throws IOException {
        final r4.b b = new r4.b();
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
            else if (nextName.equals("entityType")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'entityType' to null.");
                }
                b.k(jsonReader.nextInt());
            }
            else if (nextName.equals("entityId")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'entityId' to null.");
                }
                b.p(jsonReader.nextLong());
            }
            else if (nextName.equals("dateTime")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    b.W6(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    b.W6(null);
                }
            }
            else if (nextName.equals("text")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    b.j(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    b.j(null);
                }
            }
            else if (nextName.equals("eventReasonId")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'eventReasonId' to null.");
                }
                b.U0(jsonReader.nextLong());
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
        return v2.S;
    }
    
    public static String M8() {
        return "RealmClassLeadEvent";
    }
    
    public static long N8(final f0 f0, final r4.b b, final Map<n0, Long> map) {
        if (b instanceof p && !p0.h8(b)) {
            final p p3 = (p)b;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(r4.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b2 = (b)f0.H().j(r4.b.class);
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
        Table.nativeSetLong(nativePtr, b2.f, l, b.l(), false);
        Table.nativeSetLong(nativePtr, b2.g, l, b.o(), false);
        final String d1 = b.d1();
        if (d1 != null) {
            Table.nativeSetString(nativePtr, b2.h, l, d1, false);
        }
        final String f2 = b.f();
        if (f2 != null) {
            Table.nativeSetString(nativePtr, b2.i, l, f2, false);
        }
        Table.nativeSetLong(nativePtr, b2.j, l, b.Q0(), false);
        return l;
    }
    
    public static void O8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(r4.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(r4.b.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final r4.b b2 = (r4.b)iterator.next();
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
            Table.nativeSetLong(nativePtr, b.f, l, b2.l(), false);
            Table.nativeSetLong(nativePtr, b.g, l, b2.o(), false);
            final String d1 = b2.d1();
            if (d1 != null) {
                Table.nativeSetString(nativePtr, b.h, l, d1, false);
            }
            final String f2 = b2.f();
            if (f2 != null) {
                Table.nativeSetString(nativePtr, b.i, l, f2, false);
            }
            Table.nativeSetLong(nativePtr, b.j, l, b2.Q0(), false);
        }
    }
    
    public static long P8(final f0 f0, final r4.b b, final Map<n0, Long> map) {
        if (b instanceof p && !p0.h8(b)) {
            final p p3 = (p)b;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(r4.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b2 = (b)f0.H().j(r4.b.class);
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
        Table.nativeSetLong(nativePtr, b2.f, rowWithPrimaryKey, b.l(), false);
        Table.nativeSetLong(nativePtr, b2.g, rowWithPrimaryKey, b.o(), false);
        final String d1 = b.d1();
        final long h = b2.h;
        if (d1 != null) {
            Table.nativeSetString(nativePtr, h, rowWithPrimaryKey, d1, false);
        }
        else {
            Table.nativeSetNull(nativePtr, h, rowWithPrimaryKey, false);
        }
        final String f2 = b.f();
        final long i = b2.i;
        if (f2 != null) {
            Table.nativeSetString(nativePtr, i, rowWithPrimaryKey, f2, false);
        }
        else {
            Table.nativeSetNull(nativePtr, i, rowWithPrimaryKey, false);
        }
        Table.nativeSetLong(nativePtr, b2.j, rowWithPrimaryKey, b.Q0(), false);
        return rowWithPrimaryKey;
    }
    
    public static void Q8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(r4.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(r4.b.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final r4.b b2 = (r4.b)iterator.next();
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
            Table.nativeSetLong(nativePtr, b.f, rowWithPrimaryKey, b2.l(), false);
            Table.nativeSetLong(nativePtr, b.g, rowWithPrimaryKey, b2.o(), false);
            final String d1 = b2.d1();
            final long h = b.h;
            if (d1 != null) {
                Table.nativeSetString(nativePtr, h, rowWithPrimaryKey, d1, false);
            }
            else {
                Table.nativeSetNull(nativePtr, h, rowWithPrimaryKey, false);
            }
            final String f2 = b2.f();
            final long i = b.i;
            if (f2 != null) {
                Table.nativeSetString(nativePtr, i, rowWithPrimaryKey, f2, false);
            }
            else {
                Table.nativeSetNull(nativePtr, i, rowWithPrimaryKey, false);
            }
            Table.nativeSetLong(nativePtr, b.j, rowWithPrimaryKey, b2.Q0(), false);
        }
    }
    
    static v2 R8(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(r4.b.class), false, Collections.emptyList());
        final v2 v2 = new v2();
        h.a();
        return v2;
    }
    
    static r4.b S8(final f0 f0, final b b, final r4.b b2, final r4.b b3, final Map<n0, p> map, final Set<q> set) {
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(r4.b.class), set);
        osObjectBuilder.L(b.e, b3.a());
        osObjectBuilder.K(b.f, b3.l());
        osObjectBuilder.L(b.g, b3.o());
        osObjectBuilder.d0(b.h, b3.d1());
        osObjectBuilder.d0(b.i, b3.f());
        osObjectBuilder.L(b.j, b3.Q0());
        osObjectBuilder.i0();
        return b2;
    }
    
    @Override
    public long Q0() {
        this.Q.f().h();
        return this.Q.g().m(this.P.j);
    }
    
    @Override
    public c0<?> S6() {
        return this.Q;
    }
    
    @Override
    public void U0(final long n) {
        if (!this.Q.i()) {
            this.Q.f().h();
            this.Q.g().s(this.P.j, n);
            return;
        }
        if (!this.Q.d()) {
            return;
        }
        final r g = this.Q.g();
        g.g().q0(this.P.j, g.l0(), n, true);
    }
    
    @Override
    public void W6(final String s) {
        if (this.Q.i()) {
            if (!this.Q.d()) {
                return;
            }
            final r g = this.Q.g();
            if (s != null) {
                g.g().t0(this.P.h, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'dateTime' to null.");
        }
        else {
            this.Q.f().h();
            if (s != null) {
                this.Q.g().d(this.P.h, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'dateTime' to null.");
        }
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
    public String d1() {
        this.Q.f().h();
        return this.Q.g().U(this.P.h);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final v2 v2 = (v2)o;
        final io.realm.a f = this.Q.f();
        final io.realm.a f2 = v2.Q.f();
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
        final String i = v2.Q.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.Q.g().l0() == v2.Q.g().l0();
            }
        }
        else if (i == null) {
            return this.Q.g().l0() == v2.Q.g().l0();
        }
        return false;
    }
    
    @Override
    public String f() {
        this.Q.f().h();
        return this.Q.g().U(this.P.i);
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
    public void j(final String s) {
        if (this.Q.i()) {
            if (!this.Q.d()) {
                return;
            }
            final r g = this.Q.g();
            if (s != null) {
                g.g().t0(this.P.i, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'text' to null.");
        }
        else {
            this.Q.f().h();
            if (s != null) {
                this.Q.g().d(this.P.i, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'text' to null.");
        }
    }
    
    @Override
    public void k(final int n) {
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
    public int l() {
        this.Q.f().h();
        return (int)this.Q.g().m(this.P.f);
    }
    
    @Override
    public long o() {
        this.Q.f().h();
        return this.Q.g().m(this.P.g);
    }
    
    @Override
    public void p(final long n) {
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
        final StringBuilder sb = new StringBuilder("RealmClassLeadEvent = proxy[");
        sb.append("{id:");
        sb.append(this.a());
        sb.append("}");
        sb.append(",");
        sb.append("{entityType:");
        sb.append(this.l());
        sb.append("}");
        sb.append(",");
        sb.append("{entityId:");
        sb.append(this.o());
        sb.append("}");
        sb.append(",");
        sb.append("{dateTime:");
        sb.append(this.d1());
        sb.append("}");
        sb.append(",");
        sb.append("{text:");
        sb.append(this.f());
        sb.append("}");
        sb.append(",");
        sb.append("{eventReasonId:");
        sb.append(this.Q0());
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
        (this.Q = new c0<r4.b>(this)).r(h.e());
        this.Q.s(h.f());
        this.Q.o(h.b());
        this.Q.q(h.d());
    }
    
    public static final class a
    {
        public static final String a = "RealmClassLeadEvent";
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
            final OsObjectSchemaInfo b = osSchemaInfo.b("RealmClassLeadEvent");
            this.e = this.b("id", "id", b);
            this.f = this.b("entityType", "entityType", b);
            this.g = this.b("entityId", "entityId", b);
            this.h = this.b("dateTime", "dateTime", b);
            this.i = this.b("text", "text", b);
            this.j = this.b("eventReasonId", "eventReasonId", b);
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
