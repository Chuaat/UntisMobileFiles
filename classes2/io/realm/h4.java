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
import w4.g;

public class h4 extends g implements p, i4
{
    private static final String Q = "";
    private static final OsObjectSchemaInfo R;
    private b O;
    private c0<g> P;
    
    static {
        R = G8();
    }
    
    h4() {
        this.P.p();
    }
    
    public static g C8(final f0 f0, final b b, final g g, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        final h4 h4 = map.get(g);
        if (h4 != null) {
            return h4;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(g.class), set);
        osObjectBuilder.L(b.e, g.a());
        osObjectBuilder.d0(b.f, g.B0());
        osObjectBuilder.d0(b.g, g.z0());
        osObjectBuilder.L(b.h, g.d3());
        osObjectBuilder.L(b.i, g.t1());
        final h4 p6 = P8(f0, osObjectBuilder.f0());
        map.put(g, p6);
        return p6;
    }
    
    public static g D8(final f0 f0, final b b, final g g, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        if (g instanceof p && !p0.h8(g)) {
            final p p6 = (p)g;
            if (p6.S6().f() != null) {
                final io.realm.a f2 = p6.S6().f();
                if (f2.H != f0.H) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
                if (f2.getPath().equals(f0.getPath())) {
                    return g;
                }
            }
        }
        final io.realm.a.h h = io.realm.a.W.get();
        final p p7 = map.get(g);
        if (p7 != null) {
            return (g)p7;
        }
        final p p8 = null;
        Object x2 = null;
        boolean b3 = false;
        Label_0232: {
            if (b2) {
                x2 = f0.x2(g.class);
                final long r = ((Table)x2).r(b.e, g.a());
                if (r == -1L) {
                    b3 = false;
                    x2 = p8;
                    break Label_0232;
                }
                try {
                    h.g(f0, ((Table)x2).R(r), b, false, Collections.emptyList());
                    x2 = new h4();
                    map.put(g, (p)x2);
                }
                finally {
                    h.a();
                }
            }
            b3 = b2;
        }
        g g2;
        if (b3) {
            g2 = Q8(f0, b, (g)x2, g, map, set);
        }
        else {
            g2 = C8(f0, b, g, b2, map, set);
        }
        return g2;
    }
    
    public static b E8(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static g F8(final g g, final int a, final int n, final Map<n0, p.a<n0>> map) {
        if (a <= n && g != null) {
            final p.a a2 = map.get(g);
            g g3;
            if (a2 == null) {
                final g g2 = new g();
                map.put(g, (p.a<n0>)new p.a(a, g2));
                g3 = g2;
            }
            else {
                if (a >= a2.a) {
                    return (g)a2.b;
                }
                g3 = (g)a2.b;
                a2.a = a;
            }
            g3.b(g.a());
            g3.v0(g.B0());
            g3.k0(g.z0());
            g3.G4(g.d3());
            g3.y7(g.t1());
            return g3;
        }
        return null;
    }
    
    private static OsObjectSchemaInfo G8() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmStudent", false, 5, 0);
        final RealmFieldType integer = RealmFieldType.INTEGER;
        b.c("", "id", integer, true, false, true);
        final RealmFieldType string = RealmFieldType.STRING;
        b.c("", "firstName", string, false, false, true);
        b.c("", "lastName", string, false, false, true);
        b.c("", "birthday", integer, false, false, true);
        b.c("", "klasse", integer, false, false, true);
        return b.e();
    }
    
    public static g H8(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final List<String> emptyList = Collections.emptyList();
        Object x2 = null;
        Label_0139: {
            if (b) {
                x2 = f0.x2(g.class);
                final long e = ((b)f0.H().j(g.class)).e;
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
                        h.g(f0, ((Table)x2).R(r), f0.H().j(g.class), false, Collections.emptyList());
                        x2 = new h4();
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
            h4 h2;
            if (jsonObject.isNull("id")) {
                h2 = f0.p1((Class<h4>)g.class, null, true, emptyList);
            }
            else {
                h2 = f0.p1((Class<h4>)g.class, jsonObject.getLong("id"), true, emptyList);
            }
            o = h2;
        }
        if (jsonObject.has("firstName")) {
            if (jsonObject.isNull("firstName")) {
                ((i4)o).v0(null);
            }
            else {
                ((i4)o).v0(jsonObject.getString("firstName"));
            }
        }
        if (jsonObject.has("lastName")) {
            if (jsonObject.isNull("lastName")) {
                ((i4)o).k0(null);
            }
            else {
                ((i4)o).k0(jsonObject.getString("lastName"));
            }
        }
        if (jsonObject.has("birthday")) {
            if (jsonObject.isNull("birthday")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'birthday' to null.");
            }
            ((i4)o).G4(jsonObject.getLong("birthday"));
        }
        if (jsonObject.has("klasse")) {
            if (jsonObject.isNull("klasse")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'klasse' to null.");
            }
            ((i4)o).y7(jsonObject.getLong("klasse"));
        }
        return (g)o;
    }
    
    @TargetApi(11)
    public static g I8(final f0 f0, final JsonReader jsonReader) throws IOException {
        final g g = new g();
        jsonReader.beginObject();
        boolean b = false;
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
                g.b(jsonReader.nextLong());
                b = true;
            }
            else if (nextName.equals("firstName")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    g.v0(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    g.v0(null);
                }
            }
            else if (nextName.equals("lastName")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    g.k0(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    g.k0(null);
                }
            }
            else if (nextName.equals("birthday")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'birthday' to null.");
                }
                g.G4(jsonReader.nextLong());
            }
            else if (nextName.equals("klasse")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'klasse' to null.");
                }
                g.y7(jsonReader.nextLong());
            }
            else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (b) {
            return f0.G0(g, new q[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }
    
    public static OsObjectSchemaInfo J8() {
        return h4.R;
    }
    
    public static String K8() {
        return "RealmStudent";
    }
    
    public static long L8(final f0 f0, final g g, final Map<n0, Long> map) {
        if (g instanceof p && !p0.h8(g)) {
            final p p3 = (p)g;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(g.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(g.class);
        final long e = b.e;
        final Long value = g.a();
        long l;
        if (value != null) {
            l = Table.nativeFindFirstInt(nativePtr, e, g.a());
        }
        else {
            l = -1L;
        }
        if (l == -1L) {
            l = OsObject.createRowWithPrimaryKey(x2, e, g.a());
        }
        else {
            Table.v0(value);
        }
        map.put(g, l);
        final String b2 = g.B0();
        if (b2 != null) {
            Table.nativeSetString(nativePtr, b.f, l, b2, false);
        }
        final String z0 = g.z0();
        if (z0 != null) {
            Table.nativeSetString(nativePtr, b.g, l, z0, false);
        }
        Table.nativeSetLong(nativePtr, b.h, l, g.d3(), false);
        Table.nativeSetLong(nativePtr, b.i, l, g.t1(), false);
        return l;
    }
    
    public static void M8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(g.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(g.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final g g = (g)iterator.next();
            if (map.containsKey(g)) {
                continue;
            }
            if (g instanceof p && !p0.h8(g)) {
                final p p3 = (p)g;
                if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                    map.put(g, p3.S6().g().l0());
                    continue;
                }
            }
            final Long value = g.a();
            long l;
            if (value != null) {
                l = Table.nativeFindFirstInt(nativePtr, e, g.a());
            }
            else {
                l = -1L;
            }
            if (l == -1L) {
                l = OsObject.createRowWithPrimaryKey(x2, e, g.a());
            }
            else {
                Table.v0(value);
            }
            map.put(g, l);
            final String b2 = g.B0();
            if (b2 != null) {
                Table.nativeSetString(nativePtr, b.f, l, b2, false);
            }
            final String z0 = g.z0();
            if (z0 != null) {
                Table.nativeSetString(nativePtr, b.g, l, z0, false);
            }
            Table.nativeSetLong(nativePtr, b.h, l, g.d3(), false);
            Table.nativeSetLong(nativePtr, b.i, l, g.t1(), false);
        }
    }
    
    public static long N8(final f0 f0, final g g, final Map<n0, Long> map) {
        if (g instanceof p && !p0.h8(g)) {
            final p p3 = (p)g;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(g.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(g.class);
        final long e = b.e;
        long nativeFindFirstInt;
        if (Long.valueOf(g.a()) != null) {
            nativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, e, g.a());
        }
        else {
            nativeFindFirstInt = -1L;
        }
        long rowWithPrimaryKey = nativeFindFirstInt;
        if (nativeFindFirstInt == -1L) {
            rowWithPrimaryKey = OsObject.createRowWithPrimaryKey(x2, e, g.a());
        }
        map.put(g, rowWithPrimaryKey);
        final String b2 = g.B0();
        final long f2 = b.f;
        if (b2 != null) {
            Table.nativeSetString(nativePtr, f2, rowWithPrimaryKey, b2, false);
        }
        else {
            Table.nativeSetNull(nativePtr, f2, rowWithPrimaryKey, false);
        }
        final String z0 = g.z0();
        final long g2 = b.g;
        if (z0 != null) {
            Table.nativeSetString(nativePtr, g2, rowWithPrimaryKey, z0, false);
        }
        else {
            Table.nativeSetNull(nativePtr, g2, rowWithPrimaryKey, false);
        }
        Table.nativeSetLong(nativePtr, b.h, rowWithPrimaryKey, g.d3(), false);
        Table.nativeSetLong(nativePtr, b.i, rowWithPrimaryKey, g.t1(), false);
        return rowWithPrimaryKey;
    }
    
    public static void O8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(g.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(g.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final g g = (g)iterator.next();
            if (map.containsKey(g)) {
                continue;
            }
            if (g instanceof p && !p0.h8(g)) {
                final p p3 = (p)g;
                if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                    map.put(g, p3.S6().g().l0());
                    continue;
                }
            }
            long nativeFindFirstInt;
            if (Long.valueOf(g.a()) != null) {
                nativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, e, g.a());
            }
            else {
                nativeFindFirstInt = -1L;
            }
            long rowWithPrimaryKey = nativeFindFirstInt;
            if (nativeFindFirstInt == -1L) {
                rowWithPrimaryKey = OsObject.createRowWithPrimaryKey(x2, e, g.a());
            }
            map.put(g, rowWithPrimaryKey);
            final String b2 = g.B0();
            if (b2 != null) {
                Table.nativeSetString(nativePtr, b.f, rowWithPrimaryKey, b2, false);
            }
            else {
                Table.nativeSetNull(nativePtr, b.f, rowWithPrimaryKey, false);
            }
            final String z0 = g.z0();
            final long g2 = b.g;
            if (z0 != null) {
                Table.nativeSetString(nativePtr, g2, rowWithPrimaryKey, z0, false);
            }
            else {
                Table.nativeSetNull(nativePtr, g2, rowWithPrimaryKey, false);
            }
            Table.nativeSetLong(nativePtr, b.h, rowWithPrimaryKey, g.d3(), false);
            Table.nativeSetLong(nativePtr, b.i, rowWithPrimaryKey, g.t1(), false);
        }
    }
    
    static h4 P8(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(g.class), false, Collections.emptyList());
        final h4 h2 = new h4();
        h.a();
        return h2;
    }
    
    static g Q8(final f0 f0, final b b, final g g, final g g2, final Map<n0, p> map, final Set<q> set) {
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(g.class), set);
        osObjectBuilder.L(b.e, g2.a());
        osObjectBuilder.d0(b.f, g2.B0());
        osObjectBuilder.d0(b.g, g2.z0());
        osObjectBuilder.L(b.h, g2.d3());
        osObjectBuilder.L(b.i, g2.t1());
        osObjectBuilder.i0();
        return g;
    }
    
    @Override
    public String B0() {
        this.P.f().h();
        return this.P.g().U(this.O.f);
    }
    
    @Override
    public void G4(final long n) {
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
    public c0<?> S6() {
        return this.P;
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
    public long d3() {
        this.P.f().h();
        return this.P.g().m(this.O.h);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final h4 h4 = (h4)o;
        final io.realm.a f = this.P.f();
        final io.realm.a f2 = h4.P.f();
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
        final String i = h4.P.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.P.g().l0() == h4.P.g().l0();
            }
        }
        else if (i == null) {
            return this.P.g().l0() == h4.P.g().l0();
        }
        return false;
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
    public void k0(final String s) {
        if (this.P.i()) {
            if (!this.P.d()) {
                return;
            }
            final r g = this.P.g();
            if (s != null) {
                g.g().t0(this.O.g, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'lastName' to null.");
        }
        else {
            this.P.f().h();
            if (s != null) {
                this.P.g().d(this.O.g, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'lastName' to null.");
        }
    }
    
    @Override
    public long t1() {
        this.P.f().h();
        return this.P.g().m(this.O.i);
    }
    
    @Override
    public String toString() {
        if (!p0.k8(this)) {
            return "Invalid object";
        }
        final StringBuilder sb = new StringBuilder("RealmStudent = proxy[");
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
        sb.append("{birthday:");
        sb.append(this.d3());
        sb.append("}");
        sb.append(",");
        sb.append("{klasse:");
        sb.append(this.t1());
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
    
    @Override
    public void v0(final String s) {
        if (this.P.i()) {
            if (!this.P.d()) {
                return;
            }
            final r g = this.P.g();
            if (s != null) {
                g.g().t0(this.O.f, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'firstName' to null.");
        }
        else {
            this.P.f().h();
            if (s != null) {
                this.P.g().d(this.O.f, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'firstName' to null.");
        }
    }
    
    @Override
    public void y4() {
        if (this.P != null) {
            return;
        }
        final io.realm.a.h h = io.realm.a.W.get();
        this.O = (b)h.c();
        (this.P = new c0<g>(this)).r(h.e());
        this.P.s(h.f());
        this.P.o(h.b());
        this.P.q(h.d());
    }
    
    @Override
    public void y7(final long n) {
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
    public String z0() {
        this.P.f().h();
        return this.P.g().U(this.O.g);
    }
    
    public static final class a
    {
        public static final String a = "RealmStudent";
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
            final OsObjectSchemaInfo b = osSchemaInfo.b("RealmStudent");
            this.e = this.b("id", "id", b);
            this.f = this.b("firstName", "firstName", b);
            this.g = this.b("lastName", "lastName", b);
            this.h = this.b("birthday", "birthday", b);
            this.i = this.b("klasse", "klasse", b);
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
