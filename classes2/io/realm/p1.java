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
import j4.b;

public class p1 extends j4.b implements p, q1
{
    private static final String P = "";
    private static final OsObjectSchemaInfo Q;
    private b N;
    private c0<j4.b> O;
    
    static {
        Q = E8();
    }
    
    p1() {
        this.O.p();
    }
    
    public static j4.b A8(final f0 f0, final b b, final j4.b b2, final boolean b3, final Map<n0, p> map, final Set<q> set) {
        final p1 p6 = map.get(b2);
        if (p6 != null) {
            return p6;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(j4.b.class), set);
        osObjectBuilder.L(b.e, b2.a());
        osObjectBuilder.d0(b.f, b2.g());
        osObjectBuilder.d0(b.g, b2.n());
        osObjectBuilder.n(b.h, b2.t());
        final p1 n8 = N8(f0, osObjectBuilder.f0());
        map.put(b2, n8);
        return n8;
    }
    
    public static j4.b B8(final f0 f0, final b b, final j4.b b2, final boolean b3, final Map<n0, p> map, final Set<q> set) {
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
            return (j4.b)p7;
        }
        final p p8 = null;
        Object x2 = null;
        boolean b4 = false;
        Label_0232: {
            if (b3) {
                x2 = f0.x2(j4.b.class);
                final long r = ((Table)x2).r(b.e, b2.a());
                if (r == -1L) {
                    b4 = false;
                    x2 = p8;
                    break Label_0232;
                }
                try {
                    h.g(f0, ((Table)x2).R(r), b, false, Collections.emptyList());
                    x2 = new p1();
                    map.put(b2, (p)x2);
                }
                finally {
                    h.a();
                }
            }
            b4 = b3;
        }
        j4.b b5;
        if (b4) {
            b5 = O8(f0, b, (j4.b)x2, b2, map, set);
        }
        else {
            b5 = A8(f0, b, b2, b3, map, set);
        }
        return b5;
    }
    
    public static b C8(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static j4.b D8(final j4.b b, final int a, final int n, final Map<n0, p.a<n0>> map) {
        if (a <= n && b != null) {
            final p.a a2 = map.get(b);
            j4.b b3;
            if (a2 == null) {
                final j4.b b2 = new j4.b();
                map.put(b, (p.a<n0>)new p.a(a, b2));
                b3 = b2;
            }
            else {
                if (a >= a2.a) {
                    return (j4.b)a2.b;
                }
                b3 = (j4.b)a2.b;
                a2.a = a;
            }
            b3.b(b.a());
            b3.e(b.g());
            b3.m(b.n());
            b3.s(b.t());
            return b3;
        }
        return null;
    }
    
    private static OsObjectSchemaInfo E8() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmAbsenceReason", false, 4, 0);
        b.c("", "id", RealmFieldType.INTEGER, true, false, true);
        final RealmFieldType string = RealmFieldType.STRING;
        b.c("", "name", string, false, false, true);
        b.c("", "longName", string, false, false, true);
        b.c("", "active", RealmFieldType.BOOLEAN, false, false, true);
        return b.e();
    }
    
    public static j4.b F8(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final List<String> emptyList = Collections.emptyList();
        Object x2 = null;
        Label_0139: {
            if (b) {
                x2 = f0.x2(j4.b.class);
                final long e = ((b)f0.H().j(j4.b.class)).e;
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
                        h.g(f0, ((Table)x2).R(r), f0.H().j(j4.b.class), false, Collections.emptyList());
                        x2 = new p1();
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
            p1 p3;
            if (jsonObject.isNull("id")) {
                p3 = f0.p1((Class<p1>)j4.b.class, null, true, emptyList);
            }
            else {
                p3 = f0.p1((Class<p1>)j4.b.class, jsonObject.getLong("id"), true, emptyList);
            }
            o = p3;
        }
        if (jsonObject.has("name")) {
            if (jsonObject.isNull("name")) {
                ((q1)o).e(null);
            }
            else {
                ((q1)o).e(jsonObject.getString("name"));
            }
        }
        if (jsonObject.has("longName")) {
            if (jsonObject.isNull("longName")) {
                ((q1)o).m(null);
            }
            else {
                ((q1)o).m(jsonObject.getString("longName"));
            }
        }
        if (jsonObject.has("active")) {
            if (jsonObject.isNull("active")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'active' to null.");
            }
            ((q1)o).s(jsonObject.getBoolean("active"));
        }
        return (j4.b)o;
    }
    
    @TargetApi(11)
    public static j4.b G8(final f0 f0, final JsonReader jsonReader) throws IOException {
        final j4.b b = new j4.b();
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
    
    public static OsObjectSchemaInfo H8() {
        return p1.Q;
    }
    
    public static String I8() {
        return "RealmAbsenceReason";
    }
    
    public static long J8(final f0 f0, final j4.b b, final Map<n0, Long> map) {
        if (b instanceof p && !p0.h8(b)) {
            final p p3 = (p)b;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(j4.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b2 = (b)f0.H().j(j4.b.class);
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
        Table.nativeSetBoolean(nativePtr, b2.h, l, b.t(), false);
        return l;
    }
    
    public static void K8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(j4.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(j4.b.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final j4.b b2 = (j4.b)iterator.next();
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
            Table.nativeSetBoolean(nativePtr, b.h, l, b2.t(), false);
        }
    }
    
    public static long L8(final f0 f0, final j4.b b, final Map<n0, Long> map) {
        if (b instanceof p && !p0.h8(b)) {
            final p p3 = (p)b;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(j4.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b2 = (b)f0.H().j(j4.b.class);
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
        Table.nativeSetBoolean(nativePtr, b2.h, rowWithPrimaryKey, b.t(), false);
        return rowWithPrimaryKey;
    }
    
    public static void M8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(j4.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(j4.b.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final j4.b b2 = (j4.b)iterator.next();
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
            Table.nativeSetBoolean(nativePtr, b.h, rowWithPrimaryKey, b2.t(), false);
        }
    }
    
    static p1 N8(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(j4.b.class), false, Collections.emptyList());
        final p1 p2 = new p1();
        h.a();
        return p2;
    }
    
    static j4.b O8(final f0 f0, final b b, final j4.b b2, final j4.b b3, final Map<n0, p> map, final Set<q> set) {
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(j4.b.class), set);
        osObjectBuilder.L(b.e, b3.a());
        osObjectBuilder.d0(b.f, b3.g());
        osObjectBuilder.d0(b.g, b3.n());
        osObjectBuilder.n(b.h, b3.t());
        osObjectBuilder.i0();
        return b2;
    }
    
    @Override
    public c0<?> S6() {
        return this.O;
    }
    
    @Override
    public long a() {
        this.O.f().h();
        return this.O.g().m(this.N.e);
    }
    
    @Override
    public void b(final long n) {
        if (this.O.i()) {
            return;
        }
        this.O.f().h();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }
    
    @Override
    public void e(final String s) {
        if (this.O.i()) {
            if (!this.O.d()) {
                return;
            }
            final r g = this.O.g();
            if (s != null) {
                g.g().t0(this.N.f, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'name' to null.");
        }
        else {
            this.O.f().h();
            if (s != null) {
                this.O.g().d(this.N.f, s);
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
        final p1 p = (p1)o;
        final io.realm.a f = this.O.f();
        final io.realm.a f2 = p.O.f();
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
        final String m = this.O.g().g().M();
        final String i = p.O.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.O.g().l0() == p.O.g().l0();
            }
        }
        else if (i == null) {
            return this.O.g().l0() == p.O.g().l0();
        }
        return false;
    }
    
    @Override
    public String g() {
        this.O.f().h();
        return this.O.g().U(this.N.f);
    }
    
    @Override
    public int hashCode() {
        final String path = this.O.f().getPath();
        final String m = this.O.g().g().M();
        final long l0 = this.O.g().l0();
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
    public void m(final String s) {
        if (this.O.i()) {
            if (!this.O.d()) {
                return;
            }
            final r g = this.O.g();
            if (s != null) {
                g.g().t0(this.N.g, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'longName' to null.");
        }
        else {
            this.O.f().h();
            if (s != null) {
                this.O.g().d(this.N.g, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'longName' to null.");
        }
    }
    
    @Override
    public String n() {
        this.O.f().h();
        return this.O.g().U(this.N.g);
    }
    
    @Override
    public void s(final boolean b) {
        if (!this.O.i()) {
            this.O.f().h();
            this.O.g().i(this.N.h, b);
            return;
        }
        if (!this.O.d()) {
            return;
        }
        final r g = this.O.g();
        g.g().j0(this.N.h, g.l0(), b, true);
    }
    
    @Override
    public boolean t() {
        this.O.f().h();
        return this.O.g().l(this.N.h);
    }
    
    @Override
    public String toString() {
        if (!p0.k8(this)) {
            return "Invalid object";
        }
        final StringBuilder sb = new StringBuilder("RealmAbsenceReason = proxy[");
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
        sb.append("{active:");
        sb.append(this.t());
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
    
    @Override
    public void y4() {
        if (this.O != null) {
            return;
        }
        final io.realm.a.h h = io.realm.a.W.get();
        this.N = (b)h.c();
        (this.O = new c0<j4.b>(this)).r(h.e());
        this.O.s(h.f());
        this.O.o(h.b());
        this.O.q(h.d());
    }
    
    public static final class a
    {
        public static final String a = "RealmAbsenceReason";
    }
    
    static final class b extends c
    {
        long e;
        long f;
        long g;
        long h;
        
        b(final OsSchemaInfo osSchemaInfo) {
            super(4);
            final OsObjectSchemaInfo b = osSchemaInfo.b("RealmAbsenceReason");
            this.e = this.b("id", "id", b);
            this.f = this.b("name", "name", b);
            this.g = this.b("longName", "longName", b);
            this.h = this.b("active", "active", b);
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
        }
    }
}
