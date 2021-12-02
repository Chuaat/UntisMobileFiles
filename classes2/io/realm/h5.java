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
import z4.a;

public class h5 extends z4.a implements p, i5
{
    private static final String P = "";
    private static final OsObjectSchemaInfo Q;
    private b N;
    private c0<z4.a> O;
    
    static {
        Q = E8();
    }
    
    h5() {
        this.O.p();
    }
    
    public static z4.a A8(final f0 f0, final b b, final z4.a a, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        final h5 h5 = map.get(a);
        if (h5 != null) {
            return h5;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(z4.a.class), set);
        osObjectBuilder.L(b.e, a.a());
        osObjectBuilder.d0(b.f, a.B0());
        osObjectBuilder.d0(b.g, a.z0());
        osObjectBuilder.n(b.h, a.e5());
        final h5 n8 = N8(f0, osObjectBuilder.f0());
        map.put(a, n8);
        return n8;
    }
    
    public static z4.a B8(final f0 f0, final b b, final z4.a a, final boolean b2, final Map<n0, p> map, final Set<q> set) {
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
            return (z4.a)p7;
        }
        final p p8 = null;
        Object x2 = null;
        boolean b3 = false;
        Label_0232: {
            if (b2) {
                x2 = f0.x2(z4.a.class);
                final long r = ((Table)x2).r(b.e, a.a());
                if (r == -1L) {
                    b3 = false;
                    x2 = p8;
                    break Label_0232;
                }
                try {
                    h.g(f0, ((Table)x2).R(r), b, false, Collections.emptyList());
                    x2 = new h5();
                    map.put(a, (p)x2);
                }
                finally {
                    h.a();
                }
            }
            b3 = b2;
        }
        z4.a a2;
        if (b3) {
            a2 = O8(f0, b, (z4.a)x2, a, map, set);
        }
        else {
            a2 = A8(f0, b, a, b2, map, set);
        }
        return a2;
    }
    
    public static b C8(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static z4.a D8(final z4.a a, final int a2, final int n, final Map<n0, p.a<n0>> map) {
        if (a2 <= n && a != null) {
            final p.a a3 = map.get(a);
            z4.a a5;
            if (a3 == null) {
                final z4.a a4 = new z4.a();
                map.put(a, (p.a<n0>)new p.a(a2, a4));
                a5 = a4;
            }
            else {
                if (a2 >= a3.a) {
                    return (z4.a)a3.b;
                }
                a5 = (z4.a)a3.b;
                a3.a = a2;
            }
            a5.b(a.a());
            a5.v0(a.B0());
            a5.k0(a.z0());
            a5.c2(a.e5());
            return a5;
        }
        return null;
    }
    
    private static OsObjectSchemaInfo E8() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmChild", false, 4, 0);
        b.c("", "id", RealmFieldType.INTEGER, true, false, true);
        final RealmFieldType string = RealmFieldType.STRING;
        b.c("", "firstName", string, false, false, true);
        b.c("", "lastName", string, false, false, true);
        b.c("", "hasTimeTableAccess", RealmFieldType.BOOLEAN, false, false, true);
        return b.e();
    }
    
    public static z4.a F8(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final List<String> emptyList = Collections.emptyList();
        Object x2 = null;
        Label_0139: {
            if (b) {
                x2 = f0.x2(z4.a.class);
                final long e = ((b)f0.H().j(z4.a.class)).e;
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
                        h.g(f0, ((Table)x2).R(r), f0.H().j(z4.a.class), false, Collections.emptyList());
                        x2 = new h5();
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
            h5 h2;
            if (jsonObject.isNull("id")) {
                h2 = f0.p1((Class<h5>)z4.a.class, null, true, emptyList);
            }
            else {
                h2 = f0.p1((Class<h5>)z4.a.class, jsonObject.getLong("id"), true, emptyList);
            }
            o = h2;
        }
        if (jsonObject.has("firstName")) {
            if (jsonObject.isNull("firstName")) {
                ((i5)o).v0(null);
            }
            else {
                ((i5)o).v0(jsonObject.getString("firstName"));
            }
        }
        if (jsonObject.has("lastName")) {
            if (jsonObject.isNull("lastName")) {
                ((i5)o).k0(null);
            }
            else {
                ((i5)o).k0(jsonObject.getString("lastName"));
            }
        }
        if (jsonObject.has("hasTimeTableAccess")) {
            if (jsonObject.isNull("hasTimeTableAccess")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'hasTimeTableAccess' to null.");
            }
            ((i5)o).c2(jsonObject.getBoolean("hasTimeTableAccess"));
        }
        return (z4.a)o;
    }
    
    @TargetApi(11)
    public static z4.a G8(final f0 f0, final JsonReader jsonReader) throws IOException {
        final z4.a a = new z4.a();
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
            else if (nextName.equals("firstName")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    a.v0(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    a.v0(null);
                }
            }
            else if (nextName.equals("lastName")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    a.k0(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    a.k0(null);
                }
            }
            else if (nextName.equals("hasTimeTableAccess")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'hasTimeTableAccess' to null.");
                }
                a.c2(jsonReader.nextBoolean());
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
    
    public static OsObjectSchemaInfo H8() {
        return h5.Q;
    }
    
    public static String I8() {
        return "RealmChild";
    }
    
    public static long J8(final f0 f0, final z4.a a, final Map<n0, Long> map) {
        if (a instanceof p && !p0.h8(a)) {
            final p p3 = (p)a;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(z4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(z4.a.class);
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
        final String b2 = a.B0();
        if (b2 != null) {
            Table.nativeSetString(nativePtr, b.f, l, b2, false);
        }
        final String z0 = a.z0();
        if (z0 != null) {
            Table.nativeSetString(nativePtr, b.g, l, z0, false);
        }
        Table.nativeSetBoolean(nativePtr, b.h, l, a.e5(), false);
        return l;
    }
    
    public static void K8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(z4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(z4.a.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final z4.a a = (z4.a)iterator.next();
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
            final String b2 = a.B0();
            if (b2 != null) {
                Table.nativeSetString(nativePtr, b.f, l, b2, false);
            }
            final String z0 = a.z0();
            if (z0 != null) {
                Table.nativeSetString(nativePtr, b.g, l, z0, false);
            }
            Table.nativeSetBoolean(nativePtr, b.h, l, a.e5(), false);
        }
    }
    
    public static long L8(final f0 f0, final z4.a a, final Map<n0, Long> map) {
        if (a instanceof p && !p0.h8(a)) {
            final p p3 = (p)a;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(z4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(z4.a.class);
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
        final String b2 = a.B0();
        final long f2 = b.f;
        if (b2 != null) {
            Table.nativeSetString(nativePtr, f2, rowWithPrimaryKey, b2, false);
        }
        else {
            Table.nativeSetNull(nativePtr, f2, rowWithPrimaryKey, false);
        }
        final String z0 = a.z0();
        final long g = b.g;
        if (z0 != null) {
            Table.nativeSetString(nativePtr, g, rowWithPrimaryKey, z0, false);
        }
        else {
            Table.nativeSetNull(nativePtr, g, rowWithPrimaryKey, false);
        }
        Table.nativeSetBoolean(nativePtr, b.h, rowWithPrimaryKey, a.e5(), false);
        return rowWithPrimaryKey;
    }
    
    public static void M8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(z4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(z4.a.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final z4.a a = (z4.a)iterator.next();
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
            final String b2 = a.B0();
            if (b2 != null) {
                Table.nativeSetString(nativePtr, b.f, rowWithPrimaryKey, b2, false);
            }
            else {
                Table.nativeSetNull(nativePtr, b.f, rowWithPrimaryKey, false);
            }
            final String z0 = a.z0();
            final long g = b.g;
            if (z0 != null) {
                Table.nativeSetString(nativePtr, g, rowWithPrimaryKey, z0, false);
            }
            else {
                Table.nativeSetNull(nativePtr, g, rowWithPrimaryKey, false);
            }
            Table.nativeSetBoolean(nativePtr, b.h, rowWithPrimaryKey, a.e5(), false);
        }
    }
    
    static h5 N8(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(z4.a.class), false, Collections.emptyList());
        final h5 h2 = new h5();
        h.a();
        return h2;
    }
    
    static z4.a O8(final f0 f0, final b b, final z4.a a, final z4.a a2, final Map<n0, p> map, final Set<q> set) {
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(z4.a.class), set);
        osObjectBuilder.L(b.e, a2.a());
        osObjectBuilder.d0(b.f, a2.B0());
        osObjectBuilder.d0(b.g, a2.z0());
        osObjectBuilder.n(b.h, a2.e5());
        osObjectBuilder.i0();
        return a;
    }
    
    @Override
    public String B0() {
        this.O.f().h();
        return this.O.g().U(this.N.f);
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
    public void c2(final boolean b) {
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
    public boolean e5() {
        this.O.f().h();
        return this.O.g().l(this.N.h);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final h5 h5 = (h5)o;
        final io.realm.a f = this.O.f();
        final io.realm.a f2 = h5.O.f();
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
        final String i = h5.O.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.O.g().l0() == h5.O.g().l0();
            }
        }
        else if (i == null) {
            return this.O.g().l0() == h5.O.g().l0();
        }
        return false;
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
    public void k0(final String s) {
        if (this.O.i()) {
            if (!this.O.d()) {
                return;
            }
            final r g = this.O.g();
            if (s != null) {
                g.g().t0(this.N.g, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'lastName' to null.");
        }
        else {
            this.O.f().h();
            if (s != null) {
                this.O.g().d(this.N.g, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'lastName' to null.");
        }
    }
    
    @Override
    public String toString() {
        if (!p0.k8(this)) {
            return "Invalid object";
        }
        final StringBuilder sb = new StringBuilder("RealmChild = proxy[");
        sb.append("{id:");
        sb.append(this.a());
        sb.append("}");
        sb.append(",");
        sb.append("{firstName:");
        sb.append(this.B0());
        sb.append("}");
        sb.append(",");
        sb.append("{lastName:");
        sb.append(this.z0());
        sb.append("}");
        sb.append(",");
        sb.append("{hasTimeTableAccess:");
        sb.append(this.e5());
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
    
    @Override
    public void v0(final String s) {
        if (this.O.i()) {
            if (!this.O.d()) {
                return;
            }
            final r g = this.O.g();
            if (s != null) {
                g.g().t0(this.N.f, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'firstName' to null.");
        }
        else {
            this.O.f().h();
            if (s != null) {
                this.O.g().d(this.N.f, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'firstName' to null.");
        }
    }
    
    @Override
    public void y4() {
        if (this.O != null) {
            return;
        }
        final io.realm.a.h h = io.realm.a.W.get();
        this.N = (b)h.c();
        (this.O = new c0<z4.a>(this)).r(h.e());
        this.O.s(h.f());
        this.O.o(h.b());
        this.O.q(h.d());
    }
    
    @Override
    public String z0() {
        this.O.f().h();
        return this.O.g().U(this.N.g);
    }
    
    public static final class a
    {
        public static final String a = "RealmChild";
    }
    
    static final class b extends c
    {
        long e;
        long f;
        long g;
        long h;
        
        b(final OsSchemaInfo osSchemaInfo) {
            super(4);
            final OsObjectSchemaInfo b = osSchemaInfo.b("RealmChild");
            this.e = this.b("id", "id", b);
            this.f = this.b("firstName", "firstName", b);
            this.g = this.b("lastName", "lastName", b);
            this.h = this.b("hasTimeTableAccess", "hasTimeTableAccess", b);
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
