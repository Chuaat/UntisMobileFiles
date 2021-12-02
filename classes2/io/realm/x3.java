// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import io.realm.exceptions.RealmException;
import io.realm.internal.c;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Set;
import java.util.Iterator;
import io.realm.internal.OsObject;
import io.realm.internal.Table;
import android.annotation.TargetApi;
import java.io.IOException;
import android.util.JsonToken;
import android.util.JsonReader;
import org.json.JSONException;
import java.util.List;
import io.realm.internal.r;
import java.util.Collections;
import org.json.JSONObject;
import java.util.Map;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.p;
import w4.b;

public class x3 extends w4.b implements p, y3
{
    private static final String O = "";
    private static final OsObjectSchemaInfo P;
    private b M;
    private c0<w4.b> N;
    
    static {
        P = C8();
    }
    
    x3() {
        this.N.p();
    }
    
    public static b A8(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static w4.b B8(final w4.b b, final int a, final int n, final Map<n0, p.a<n0>> map) {
        if (a <= n && b != null) {
            final p.a a2 = map.get(b);
            w4.b b3;
            if (a2 == null) {
                final w4.b b2 = new w4.b();
                map.put(b, (p.a<n0>)new p.a(a, b2));
                b3 = b2;
            }
            else {
                if (a >= a2.a) {
                    return (w4.b)a2.b;
                }
                b3 = (w4.b)a2.b;
                a2.a = a;
            }
            b3.b(b.a());
            b3.e(b.g());
            b3.m(b.n());
            return b3;
        }
        return null;
    }
    
    private static OsObjectSchemaInfo C8() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmDepartment", false, 3, 0);
        b.c("", "id", RealmFieldType.INTEGER, true, false, true);
        final RealmFieldType string = RealmFieldType.STRING;
        b.c("", "name", string, false, false, true);
        b.c("", "longName", string, false, false, true);
        return b.e();
    }
    
    public static w4.b D8(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final List<String> emptyList = Collections.emptyList();
        Object x2 = null;
        Label_0139: {
            if (b) {
                x2 = f0.x2(w4.b.class);
                final long e = ((b)f0.H().j(w4.b.class)).e;
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
                        h.g(f0, ((Table)x2).R(r), f0.H().j(w4.b.class), false, Collections.emptyList());
                        x2 = new x3();
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
            x3 x3;
            if (jsonObject.isNull("id")) {
                x3 = f0.p1((Class<x3>)w4.b.class, null, true, emptyList);
            }
            else {
                x3 = f0.p1((Class<x3>)w4.b.class, jsonObject.getLong("id"), true, emptyList);
            }
            o = x3;
        }
        if (jsonObject.has("name")) {
            if (jsonObject.isNull("name")) {
                ((y3)o).e(null);
            }
            else {
                ((y3)o).e(jsonObject.getString("name"));
            }
        }
        if (jsonObject.has("longName")) {
            if (jsonObject.isNull("longName")) {
                ((y3)o).m(null);
            }
            else {
                ((y3)o).m(jsonObject.getString("longName"));
            }
        }
        return (w4.b)o;
    }
    
    @TargetApi(11)
    public static w4.b E8(final f0 f0, final JsonReader jsonReader) throws IOException {
        final w4.b b = new w4.b();
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
    
    public static OsObjectSchemaInfo F8() {
        return x3.P;
    }
    
    public static String G8() {
        return "RealmDepartment";
    }
    
    public static long H8(final f0 f0, final w4.b b, final Map<n0, Long> map) {
        if (b instanceof p && !p0.h8(b)) {
            final p p3 = (p)b;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(w4.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b2 = (b)f0.H().j(w4.b.class);
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
        return l;
    }
    
    public static void I8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(w4.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(w4.b.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final w4.b b2 = (w4.b)iterator.next();
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
            if (n == null) {
                continue;
            }
            Table.nativeSetString(nativePtr, b.g, l, n, false);
        }
    }
    
    public static long J8(final f0 f0, final w4.b b, final Map<n0, Long> map) {
        if (b instanceof p && !p0.h8(b)) {
            final p p3 = (p)b;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(w4.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b2 = (b)f0.H().j(w4.b.class);
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
        return rowWithPrimaryKey;
    }
    
    public static void K8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(w4.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(w4.b.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final w4.b b2 = (w4.b)iterator.next();
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
        }
    }
    
    static x3 L8(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(w4.b.class), false, Collections.emptyList());
        final x3 x3 = new x3();
        h.a();
        return x3;
    }
    
    static w4.b M8(final f0 f0, final b b, final w4.b b2, final w4.b b3, final Map<n0, p> map, final Set<q> set) {
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(w4.b.class), set);
        osObjectBuilder.L(b.e, b3.a());
        osObjectBuilder.d0(b.f, b3.g());
        osObjectBuilder.d0(b.g, b3.n());
        osObjectBuilder.i0();
        return b2;
    }
    
    public static w4.b y8(final f0 f0, final b b, final w4.b b2, final boolean b3, final Map<n0, p> map, final Set<q> set) {
        final x3 x3 = map.get(b2);
        if (x3 != null) {
            return x3;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(w4.b.class), set);
        osObjectBuilder.L(b.e, b2.a());
        osObjectBuilder.d0(b.f, b2.g());
        osObjectBuilder.d0(b.g, b2.n());
        final x3 l8 = L8(f0, osObjectBuilder.f0());
        map.put(b2, l8);
        return l8;
    }
    
    public static w4.b z8(final f0 f0, final b b, final w4.b b2, final boolean b3, final Map<n0, p> map, final Set<q> set) {
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
            return (w4.b)p7;
        }
        final p p8 = null;
        Object x2 = null;
        boolean b4 = false;
        Label_0233: {
            if (b3) {
                x2 = f0.x2(w4.b.class);
                final long r = ((Table)x2).r(b.e, b2.a());
                if (r == -1L) {
                    b4 = false;
                    x2 = p8;
                    break Label_0233;
                }
                try {
                    h.g(f0, ((Table)x2).R(r), b, false, Collections.emptyList());
                    x2 = new x3();
                    map.put(b2, (p)x2);
                }
                finally {
                    h.a();
                }
            }
            b4 = b3;
        }
        w4.b b5;
        if (b4) {
            b5 = M8(f0, b, (w4.b)x2, b2, map, set);
        }
        else {
            b5 = y8(f0, b, b2, b3, map, set);
        }
        return b5;
    }
    
    @Override
    public c0<?> S6() {
        return this.N;
    }
    
    @Override
    public long a() {
        this.N.f().h();
        return this.N.g().m(this.M.e);
    }
    
    @Override
    public void b(final long n) {
        if (this.N.i()) {
            return;
        }
        this.N.f().h();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }
    
    @Override
    public void e(final String s) {
        if (this.N.i()) {
            if (!this.N.d()) {
                return;
            }
            final r g = this.N.g();
            if (s != null) {
                g.g().t0(this.M.f, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'name' to null.");
        }
        else {
            this.N.f().h();
            if (s != null) {
                this.N.g().d(this.M.f, s);
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
        final x3 x3 = (x3)o;
        final io.realm.a f = this.N.f();
        final io.realm.a f2 = x3.N.f();
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
        final String i = x3.N.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.N.g().l0() == x3.N.g().l0();
            }
        }
        else if (i == null) {
            return this.N.g().l0() == x3.N.g().l0();
        }
        return false;
    }
    
    @Override
    public String g() {
        this.N.f().h();
        return this.N.g().U(this.M.f);
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
    public void m(final String s) {
        if (this.N.i()) {
            if (!this.N.d()) {
                return;
            }
            final r g = this.N.g();
            if (s != null) {
                g.g().t0(this.M.g, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'longName' to null.");
        }
        else {
            this.N.f().h();
            if (s != null) {
                this.N.g().d(this.M.g, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'longName' to null.");
        }
    }
    
    @Override
    public String n() {
        this.N.f().h();
        return this.N.g().U(this.M.g);
    }
    
    @Override
    public String toString() {
        if (!p0.k8(this)) {
            return "Invalid object";
        }
        final StringBuilder sb = new StringBuilder("RealmDepartment = proxy[");
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
        (this.N = new c0<w4.b>(this)).r(h.e());
        this.N.s(h.f());
        this.N.o(h.b());
        this.N.q(h.d());
    }
    
    public static final class a
    {
        public static final String a = "RealmDepartment";
    }
    
    static final class b extends c
    {
        long e;
        long f;
        long g;
        
        b(final OsSchemaInfo osSchemaInfo) {
            super(3);
            final OsObjectSchemaInfo b = osSchemaInfo.b("RealmDepartment");
            this.e = this.b("id", "id", b);
            this.f = this.b("name", "name", b);
            this.g = this.b("longName", "longName", b);
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
