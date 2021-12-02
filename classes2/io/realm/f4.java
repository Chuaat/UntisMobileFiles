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
import w4.f;

public class f4 extends f implements p, g4
{
    private static final String P = "";
    private static final OsObjectSchemaInfo Q;
    private b N;
    private c0<f> O;
    
    static {
        Q = E8();
    }
    
    f4() {
        this.O.p();
    }
    
    public static f A8(final f0 f0, final b b, final f f2, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        final f4 f3 = map.get(f2);
        if (f3 != null) {
            return f3;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(f.class), set);
        osObjectBuilder.L(b.e, f2.a());
        osObjectBuilder.d0(b.f, f2.g());
        osObjectBuilder.L(b.g, f2.d());
        osObjectBuilder.L(b.h, f2.c());
        final f4 n8 = N8(f0, osObjectBuilder.f0());
        map.put(f2, n8);
        return n8;
    }
    
    public static f B8(final f0 f0, final b b, final f f2, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        if (f2 instanceof p && !p0.h8(f2)) {
            final p p6 = (p)f2;
            if (p6.S6().f() != null) {
                final io.realm.a f3 = p6.S6().f();
                if (f3.H != f0.H) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
                if (f3.getPath().equals(f0.getPath())) {
                    return f2;
                }
            }
        }
        final io.realm.a.h h = io.realm.a.W.get();
        final p p7 = map.get(f2);
        if (p7 != null) {
            return (f)p7;
        }
        final p p8 = null;
        Object x2 = null;
        boolean b3 = false;
        Label_0232: {
            if (b2) {
                x2 = f0.x2(f.class);
                final long r = ((Table)x2).r(b.e, f2.a());
                if (r == -1L) {
                    b3 = false;
                    x2 = p8;
                    break Label_0232;
                }
                try {
                    h.g(f0, ((Table)x2).R(r), b, false, Collections.emptyList());
                    x2 = new f4();
                    map.put(f2, (p)x2);
                }
                finally {
                    h.a();
                }
            }
            b3 = b2;
        }
        f f4;
        if (b3) {
            f4 = O8(f0, b, (f)x2, f2, map, set);
        }
        else {
            f4 = A8(f0, b, f2, b2, map, set);
        }
        return f4;
    }
    
    public static b C8(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static f D8(final f f, final int a, final int n, final Map<n0, p.a<n0>> map) {
        if (a <= n && f != null) {
            final p.a a2 = map.get(f);
            f f3;
            if (a2 == null) {
                final f f2 = new f();
                map.put(f, (p.a<n0>)new p.a(a, f2));
                f3 = f2;
            }
            else {
                if (a >= a2.a) {
                    return (f)a2.b;
                }
                f3 = (f)a2.b;
                a2.a = a;
            }
            f3.b(f.a());
            f3.e(f.g());
            f3.h(f.d());
            f3.i(f.c());
            return f3;
        }
        return null;
    }
    
    private static OsObjectSchemaInfo E8() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmSchoolyear", false, 4, 0);
        final RealmFieldType integer = RealmFieldType.INTEGER;
        b.c("", "id", integer, true, false, true);
        b.c("", "name", RealmFieldType.STRING, false, false, true);
        b.c("", "start", integer, false, false, true);
        b.c("", "end", integer, false, false, true);
        return b.e();
    }
    
    public static f F8(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final List<String> emptyList = Collections.emptyList();
        Object x2 = null;
        Label_0139: {
            if (b) {
                x2 = f0.x2(f.class);
                final long e = ((b)f0.H().j(f.class)).e;
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
                        h.g(f0, ((Table)x2).R(r), f0.H().j(f.class), false, Collections.emptyList());
                        x2 = new f4();
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
            f4 f2;
            if (jsonObject.isNull("id")) {
                f2 = f0.p1((Class<f4>)f.class, null, true, emptyList);
            }
            else {
                f2 = f0.p1((Class<f4>)f.class, jsonObject.getLong("id"), true, emptyList);
            }
            o = f2;
        }
        if (jsonObject.has("name")) {
            if (jsonObject.isNull("name")) {
                ((g4)o).e(null);
            }
            else {
                ((g4)o).e(jsonObject.getString("name"));
            }
        }
        if (jsonObject.has("start")) {
            if (jsonObject.isNull("start")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'start' to null.");
            }
            ((g4)o).h(jsonObject.getLong("start"));
        }
        if (jsonObject.has("end")) {
            if (jsonObject.isNull("end")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'end' to null.");
            }
            ((g4)o).i(jsonObject.getLong("end"));
        }
        return (f)o;
    }
    
    @TargetApi(11)
    public static f G8(final f0 f0, final JsonReader jsonReader) throws IOException {
        final f f2 = new f();
        jsonReader.beginObject();
        boolean b = false;
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
                f2.b(jsonReader.nextLong());
                b = true;
            }
            else if (nextName.equals("name")) {
                String nextString;
                if (jsonReader.peek() != JsonToken.NULL) {
                    nextString = jsonReader.nextString();
                }
                else {
                    jsonReader.skipValue();
                    nextString = null;
                }
                f2.e(nextString);
            }
            else if (nextName.equals("start")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'start' to null.");
                }
                f2.h(jsonReader.nextLong());
            }
            else if (nextName.equals("end")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'end' to null.");
                }
                f2.i(jsonReader.nextLong());
            }
            else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (b) {
            return f0.G0(f2, new q[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }
    
    public static OsObjectSchemaInfo H8() {
        return f4.Q;
    }
    
    public static String I8() {
        return "RealmSchoolyear";
    }
    
    public static long J8(final f0 f0, final f f2, final Map<n0, Long> map) {
        if (f2 instanceof p && !p0.h8(f2)) {
            final p p3 = (p)f2;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(f.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(f.class);
        final long e = b.e;
        final Long value = f2.a();
        long l;
        if (value != null) {
            l = Table.nativeFindFirstInt(nativePtr, e, f2.a());
        }
        else {
            l = -1L;
        }
        if (l == -1L) {
            l = OsObject.createRowWithPrimaryKey(x2, e, f2.a());
        }
        else {
            Table.v0(value);
        }
        map.put(f2, l);
        final String g = f2.g();
        if (g != null) {
            Table.nativeSetString(nativePtr, b.f, l, g, false);
        }
        Table.nativeSetLong(nativePtr, b.g, l, f2.d(), false);
        Table.nativeSetLong(nativePtr, b.h, l, f2.c(), false);
        return l;
    }
    
    public static void K8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(f.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(f.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final f f2 = (f)iterator.next();
            if (map.containsKey(f2)) {
                continue;
            }
            if (f2 instanceof p && !p0.h8(f2)) {
                final p p3 = (p)f2;
                if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                    map.put(f2, p3.S6().g().l0());
                    continue;
                }
            }
            final Long value = f2.a();
            long l;
            if (value != null) {
                l = Table.nativeFindFirstInt(nativePtr, e, f2.a());
            }
            else {
                l = -1L;
            }
            if (l == -1L) {
                l = OsObject.createRowWithPrimaryKey(x2, e, f2.a());
            }
            else {
                Table.v0(value);
            }
            map.put(f2, l);
            final String g = f2.g();
            if (g != null) {
                Table.nativeSetString(nativePtr, b.f, l, g, false);
            }
            Table.nativeSetLong(nativePtr, b.g, l, f2.d(), false);
            Table.nativeSetLong(nativePtr, b.h, l, f2.c(), false);
        }
    }
    
    public static long L8(final f0 f0, final f f2, final Map<n0, Long> map) {
        if (f2 instanceof p && !p0.h8(f2)) {
            final p p3 = (p)f2;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(f.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(f.class);
        final long e = b.e;
        long nativeFindFirstInt;
        if (Long.valueOf(f2.a()) != null) {
            nativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, e, f2.a());
        }
        else {
            nativeFindFirstInt = -1L;
        }
        long rowWithPrimaryKey = nativeFindFirstInt;
        if (nativeFindFirstInt == -1L) {
            rowWithPrimaryKey = OsObject.createRowWithPrimaryKey(x2, e, f2.a());
        }
        map.put(f2, rowWithPrimaryKey);
        final String g = f2.g();
        final long f3 = b.f;
        if (g != null) {
            Table.nativeSetString(nativePtr, f3, rowWithPrimaryKey, g, false);
        }
        else {
            Table.nativeSetNull(nativePtr, f3, rowWithPrimaryKey, false);
        }
        Table.nativeSetLong(nativePtr, b.g, rowWithPrimaryKey, f2.d(), false);
        Table.nativeSetLong(nativePtr, b.h, rowWithPrimaryKey, f2.c(), false);
        return rowWithPrimaryKey;
    }
    
    public static void M8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(f.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(f.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final f f2 = (f)iterator.next();
            if (map.containsKey(f2)) {
                continue;
            }
            if (f2 instanceof p && !p0.h8(f2)) {
                final p p3 = (p)f2;
                if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                    map.put(f2, p3.S6().g().l0());
                    continue;
                }
            }
            long nativeFindFirstInt;
            if (Long.valueOf(f2.a()) != null) {
                nativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, e, f2.a());
            }
            else {
                nativeFindFirstInt = -1L;
            }
            long rowWithPrimaryKey = nativeFindFirstInt;
            if (nativeFindFirstInt == -1L) {
                rowWithPrimaryKey = OsObject.createRowWithPrimaryKey(x2, e, f2.a());
            }
            map.put(f2, rowWithPrimaryKey);
            final String g = f2.g();
            if (g != null) {
                Table.nativeSetString(nativePtr, b.f, rowWithPrimaryKey, g, false);
            }
            else {
                Table.nativeSetNull(nativePtr, b.f, rowWithPrimaryKey, false);
            }
            Table.nativeSetLong(nativePtr, b.g, rowWithPrimaryKey, f2.d(), false);
            Table.nativeSetLong(nativePtr, b.h, rowWithPrimaryKey, f2.c(), false);
        }
    }
    
    static f4 N8(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(f.class), false, Collections.emptyList());
        final f4 f4 = new f4();
        h.a();
        return f4;
    }
    
    static f O8(final f0 f0, final b b, final f f2, final f f3, final Map<n0, p> map, final Set<q> set) {
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(f.class), set);
        osObjectBuilder.L(b.e, f3.a());
        osObjectBuilder.d0(b.f, f3.g());
        osObjectBuilder.L(b.g, f3.d());
        osObjectBuilder.L(b.h, f3.c());
        osObjectBuilder.i0();
        return f2;
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
    public long c() {
        this.O.f().h();
        return this.O.g().m(this.N.h);
    }
    
    @Override
    public long d() {
        this.O.f().h();
        return this.O.g().m(this.N.g);
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
        final f4 f4 = (f4)o;
        final io.realm.a f5 = this.O.f();
        final io.realm.a f6 = f4.O.f();
        final String path = f5.getPath();
        final String path2 = f6.getPath();
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
        if (f5.N() != f6.N()) {
            return false;
        }
        if (!f5.K.getVersionID().equals(f6.K.getVersionID())) {
            return false;
        }
        final String m = this.O.g().g().M();
        final String i = f4.O.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.O.g().l0() == f4.O.g().l0();
            }
        }
        else if (i == null) {
            return this.O.g().l0() == f4.O.g().l0();
        }
        return false;
    }
    
    @Override
    public String g() {
        this.O.f().h();
        return this.O.g().U(this.N.f);
    }
    
    @Override
    public void h(final long n) {
        if (!this.O.i()) {
            this.O.f().h();
            this.O.g().s(this.N.g, n);
            return;
        }
        if (!this.O.d()) {
            return;
        }
        final r g = this.O.g();
        g.g().q0(this.N.g, g.l0(), n, true);
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
    public void i(final long n) {
        if (!this.O.i()) {
            this.O.f().h();
            this.O.g().s(this.N.h, n);
            return;
        }
        if (!this.O.d()) {
            return;
        }
        final r g = this.O.g();
        g.g().q0(this.N.h, g.l0(), n, true);
    }
    
    @Override
    public String toString() {
        if (!p0.k8(this)) {
            return "Invalid object";
        }
        final StringBuilder sb = new StringBuilder("RealmSchoolyear = proxy[");
        sb.append("{id:");
        sb.append(this.a());
        sb.append("}");
        sb.append(",");
        sb.append("{name:");
        sb.append(this.g());
        sb.append("}");
        sb.append(",");
        sb.append("{start:");
        sb.append(this.d());
        sb.append("}");
        sb.append(",");
        sb.append("{end:");
        sb.append(this.c());
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
        (this.O = new c0<f>(this)).r(h.e());
        this.O.s(h.f());
        this.O.o(h.b());
        this.O.q(h.d());
    }
    
    public static final class a
    {
        public static final String a = "RealmSchoolyear";
    }
    
    static final class b extends c
    {
        long e;
        long f;
        long g;
        long h;
        
        b(final OsSchemaInfo osSchemaInfo) {
            super(4);
            final OsObjectSchemaInfo b = osSchemaInfo.b("RealmSchoolyear");
            this.e = this.b("id", "id", b);
            this.f = this.b("name", "name", b);
            this.g = this.b("start", "start", b);
            this.h = this.b("end", "end", b);
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
