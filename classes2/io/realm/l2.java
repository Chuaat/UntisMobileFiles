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
import o4.a;

public class l2 extends o4.a implements p, m2
{
    private static final String O = "";
    private static final OsObjectSchemaInfo P;
    private b M;
    private c0<o4.a> N;
    
    static {
        P = C8();
    }
    
    l2() {
        this.N.p();
    }
    
    public static b A8(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static o4.a B8(final o4.a a, final int a2, final int n, final Map<n0, p.a<n0>> map) {
        if (a2 <= n && a != null) {
            final p.a a3 = map.get(a);
            o4.a a5;
            if (a3 == null) {
                final o4.a a4 = new o4.a();
                map.put(a, (p.a<n0>)new p.a(a2, a4));
                a5 = a4;
            }
            else {
                if (a2 >= a3.a) {
                    return (o4.a)a3.b;
                }
                a5 = (o4.a)a3.b;
                a3.a = a2;
            }
            a5.b(a.a());
            a5.e(a.g());
            a5.s5(a.Q1());
            return a5;
        }
        return null;
    }
    
    private static OsObjectSchemaInfo C8() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmDriveAttachment", false, 3, 0);
        b.c("", "id", RealmFieldType.INTEGER, true, false, true);
        final RealmFieldType string = RealmFieldType.STRING;
        b.c("", "name", string, false, false, true);
        b.c("", "url", string, false, false, true);
        return b.e();
    }
    
    public static o4.a D8(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final List<String> emptyList = Collections.emptyList();
        Object x2 = null;
        Label_0139: {
            if (b) {
                x2 = f0.x2(o4.a.class);
                final long e = ((b)f0.H().j(o4.a.class)).e;
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
                        h.g(f0, ((Table)x2).R(r), f0.H().j(o4.a.class), false, Collections.emptyList());
                        x2 = new l2();
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
            l2 l2;
            if (jsonObject.isNull("id")) {
                l2 = f0.p1((Class<l2>)o4.a.class, null, true, emptyList);
            }
            else {
                l2 = f0.p1((Class<l2>)o4.a.class, jsonObject.getLong("id"), true, emptyList);
            }
            o = l2;
        }
        if (jsonObject.has("name")) {
            if (jsonObject.isNull("name")) {
                ((m2)o).e(null);
            }
            else {
                ((m2)o).e(jsonObject.getString("name"));
            }
        }
        if (jsonObject.has("url")) {
            if (jsonObject.isNull("url")) {
                ((m2)o).s5(null);
            }
            else {
                ((m2)o).s5(jsonObject.getString("url"));
            }
        }
        return (o4.a)o;
    }
    
    @TargetApi(11)
    public static o4.a E8(final f0 f0, final JsonReader jsonReader) throws IOException {
        final o4.a a = new o4.a();
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
            else if (nextName.equals("name")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    a.e(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    a.e(null);
                }
            }
            else if (nextName.equals("url")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    a.s5(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    a.s5(null);
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
    
    public static OsObjectSchemaInfo F8() {
        return l2.P;
    }
    
    public static String G8() {
        return "RealmDriveAttachment";
    }
    
    public static long H8(final f0 f0, final o4.a a, final Map<n0, Long> map) {
        if (a instanceof p && !p0.h8(a)) {
            final p p3 = (p)a;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(o4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(o4.a.class);
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
        final String g = a.g();
        if (g != null) {
            Table.nativeSetString(nativePtr, b.f, l, g, false);
        }
        final String q1 = a.Q1();
        if (q1 != null) {
            Table.nativeSetString(nativePtr, b.g, l, q1, false);
        }
        return l;
    }
    
    public static void I8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(o4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(o4.a.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final o4.a a = (o4.a)iterator.next();
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
            final String g = a.g();
            if (g != null) {
                Table.nativeSetString(nativePtr, b.f, l, g, false);
            }
            final String q1 = a.Q1();
            if (q1 == null) {
                continue;
            }
            Table.nativeSetString(nativePtr, b.g, l, q1, false);
        }
    }
    
    public static long J8(final f0 f0, final o4.a a, final Map<n0, Long> map) {
        if (a instanceof p && !p0.h8(a)) {
            final p p3 = (p)a;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(o4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(o4.a.class);
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
        final String g = a.g();
        final long f2 = b.f;
        if (g != null) {
            Table.nativeSetString(nativePtr, f2, rowWithPrimaryKey, g, false);
        }
        else {
            Table.nativeSetNull(nativePtr, f2, rowWithPrimaryKey, false);
        }
        final String q1 = a.Q1();
        final long g2 = b.g;
        if (q1 != null) {
            Table.nativeSetString(nativePtr, g2, rowWithPrimaryKey, q1, false);
        }
        else {
            Table.nativeSetNull(nativePtr, g2, rowWithPrimaryKey, false);
        }
        return rowWithPrimaryKey;
    }
    
    public static void K8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(o4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(o4.a.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final o4.a a = (o4.a)iterator.next();
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
            final String g = a.g();
            if (g != null) {
                Table.nativeSetString(nativePtr, b.f, rowWithPrimaryKey, g, false);
            }
            else {
                Table.nativeSetNull(nativePtr, b.f, rowWithPrimaryKey, false);
            }
            final String q1 = a.Q1();
            final long g2 = b.g;
            if (q1 != null) {
                Table.nativeSetString(nativePtr, g2, rowWithPrimaryKey, q1, false);
            }
            else {
                Table.nativeSetNull(nativePtr, g2, rowWithPrimaryKey, false);
            }
        }
    }
    
    static l2 L8(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(o4.a.class), false, Collections.emptyList());
        final l2 l2 = new l2();
        h.a();
        return l2;
    }
    
    static o4.a M8(final f0 f0, final b b, final o4.a a, final o4.a a2, final Map<n0, p> map, final Set<q> set) {
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(o4.a.class), set);
        osObjectBuilder.L(b.e, a2.a());
        osObjectBuilder.d0(b.f, a2.g());
        osObjectBuilder.d0(b.g, a2.Q1());
        osObjectBuilder.i0();
        return a;
    }
    
    public static o4.a y8(final f0 f0, final b b, final o4.a a, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        final l2 l2 = map.get(a);
        if (l2 != null) {
            return l2;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(o4.a.class), set);
        osObjectBuilder.L(b.e, a.a());
        osObjectBuilder.d0(b.f, a.g());
        osObjectBuilder.d0(b.g, a.Q1());
        final l2 l3 = L8(f0, osObjectBuilder.f0());
        map.put(a, l3);
        return l3;
    }
    
    public static o4.a z8(final f0 f0, final b b, final o4.a a, final boolean b2, final Map<n0, p> map, final Set<q> set) {
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
            return (o4.a)p7;
        }
        final p p8 = null;
        Object x2 = null;
        boolean b3 = false;
        Label_0233: {
            if (b2) {
                x2 = f0.x2(o4.a.class);
                final long r = ((Table)x2).r(b.e, a.a());
                if (r == -1L) {
                    b3 = false;
                    x2 = p8;
                    break Label_0233;
                }
                try {
                    h.g(f0, ((Table)x2).R(r), b, false, Collections.emptyList());
                    x2 = new l2();
                    map.put(a, (p)x2);
                }
                finally {
                    h.a();
                }
            }
            b3 = b2;
        }
        o4.a a2;
        if (b3) {
            a2 = M8(f0, b, (o4.a)x2, a, map, set);
        }
        else {
            a2 = y8(f0, b, a, b2, map, set);
        }
        return a2;
    }
    
    @Override
    public String Q1() {
        this.N.f().h();
        return this.N.g().U(this.M.g);
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
        final l2 l2 = (l2)o;
        final io.realm.a f = this.N.f();
        final io.realm.a f2 = l2.N.f();
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
        final String i = l2.N.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.N.g().l0() == l2.N.g().l0();
            }
        }
        else if (i == null) {
            return this.N.g().l0() == l2.N.g().l0();
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
    public void s5(final String s) {
        if (this.N.i()) {
            if (!this.N.d()) {
                return;
            }
            final r g = this.N.g();
            if (s != null) {
                g.g().t0(this.M.g, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'url' to null.");
        }
        else {
            this.N.f().h();
            if (s != null) {
                this.N.g().d(this.M.g, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'url' to null.");
        }
    }
    
    @Override
    public String toString() {
        if (!p0.k8(this)) {
            return "Invalid object";
        }
        final StringBuilder sb = new StringBuilder("RealmDriveAttachment = proxy[");
        sb.append("{id:");
        sb.append(this.a());
        sb.append("}");
        sb.append(",");
        sb.append("{name:");
        sb.append(this.g());
        sb.append("}");
        sb.append(",");
        sb.append("{url:");
        sb.append(this.Q1());
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
        (this.N = new c0<o4.a>(this)).r(h.e());
        this.N.s(h.f());
        this.N.o(h.b());
        this.N.q(h.d());
    }
    
    public static final class a
    {
        public static final String a = "RealmDriveAttachment";
    }
    
    static final class b extends c
    {
        long e;
        long f;
        long g;
        
        b(final OsSchemaInfo osSchemaInfo) {
            super(3);
            final OsObjectSchemaInfo b = osSchemaInfo.b("RealmDriveAttachment");
            this.e = this.b("id", "id", b);
            this.f = this.b("name", "name", b);
            this.g = this.b("url", "url", b);
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
