// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import io.realm.exceptions.RealmException;
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
import com.untis.mobile.persistence.realm.c;

public class b1 extends c implements p, c1
{
    private static final String O = "";
    private static final OsObjectSchemaInfo P;
    private b M;
    private c0<c> N;
    
    static {
        P = C8();
    }
    
    b1() {
        this.N.p();
    }
    
    public static b A8(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static c B8(final c c, final int a, final int n, final Map<n0, p.a<n0>> map) {
        if (a <= n && c != null) {
            final p.a a2 = map.get(c);
            c c3;
            if (a2 == null) {
                final c c2 = new c();
                map.put(c, (p.a<n0>)new p.a(a, c2));
                c3 = c2;
            }
            else {
                if (a >= a2.a) {
                    return (c)a2.b;
                }
                c3 = (c)a2.b;
                a2.a = a;
            }
            c3.c3(c.K7());
            c3.m7(c.f());
            c3.P3(c.t3());
            return c3;
        }
        return null;
    }
    
    private static OsObjectSchemaInfo C8() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmSchoolColor", false, 3, 0);
        final RealmFieldType integer = RealmFieldType.INTEGER;
        b.c("", "schoolColorTypeId", integer, true, false, true);
        b.c("", "text", integer, false, false, true);
        b.c("", "background", integer, false, false, true);
        return b.e();
    }
    
    public static c D8(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final List<String> emptyList = Collections.emptyList();
        Object x2 = null;
        Label_0139: {
            if (b) {
                x2 = f0.x2(c.class);
                final long e = ((b)f0.H().j(c.class)).e;
                long r;
                if (!jsonObject.isNull("schoolColorTypeId")) {
                    r = ((Table)x2).r(e, jsonObject.getLong("schoolColorTypeId"));
                }
                else {
                    r = -1L;
                }
                if (r != -1L) {
                    final io.realm.a.h h = io.realm.a.W.get();
                    try {
                        h.g(f0, ((Table)x2).R(r), f0.H().j(c.class), false, Collections.emptyList());
                        x2 = new b1();
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
            if (!jsonObject.has("schoolColorTypeId")) {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'schoolColorTypeId'.");
            }
            b1 b2;
            if (jsonObject.isNull("schoolColorTypeId")) {
                b2 = f0.p1((Class<b1>)c.class, null, true, emptyList);
            }
            else {
                b2 = f0.p1((Class<b1>)c.class, jsonObject.getInt("schoolColorTypeId"), true, emptyList);
            }
            o = b2;
        }
        if (jsonObject.has("text")) {
            if (jsonObject.isNull("text")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'text' to null.");
            }
            ((c1)o).m7(jsonObject.getInt("text"));
        }
        if (jsonObject.has("background")) {
            if (jsonObject.isNull("background")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'background' to null.");
            }
            ((c1)o).P3(jsonObject.getInt("background"));
        }
        return (c)o;
    }
    
    @TargetApi(11)
    public static c E8(final f0 f0, final JsonReader jsonReader) throws IOException {
        final c c = new c();
        jsonReader.beginObject();
        boolean b = false;
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            if (nextName.equals("schoolColorTypeId")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'schoolColorTypeId' to null.");
                }
                c.c3(jsonReader.nextInt());
                b = true;
            }
            else if (nextName.equals("text")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'text' to null.");
                }
                c.m7(jsonReader.nextInt());
            }
            else if (nextName.equals("background")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'background' to null.");
                }
                c.P3(jsonReader.nextInt());
            }
            else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (b) {
            return f0.G0(c, new q[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'schoolColorTypeId'.");
    }
    
    public static OsObjectSchemaInfo F8() {
        return b1.P;
    }
    
    public static String G8() {
        return "RealmSchoolColor";
    }
    
    public static long H8(final f0 f0, final c c, final Map<n0, Long> map) {
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
        final Integer value = c.K7();
        long l;
        if (value != null) {
            l = Table.nativeFindFirstInt(nativePtr, e, c.K7());
        }
        else {
            l = -1L;
        }
        if (l == -1L) {
            l = OsObject.createRowWithPrimaryKey(x2, e, c.K7());
        }
        else {
            Table.v0(value);
        }
        map.put(c, l);
        Table.nativeSetLong(nativePtr, b.f, l, c.f(), false);
        Table.nativeSetLong(nativePtr, b.g, l, c.t3(), false);
        return l;
    }
    
    public static void I8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
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
            final Integer value = c.K7();
            long l;
            if (value != null) {
                l = Table.nativeFindFirstInt(nativePtr, e, c.K7());
            }
            else {
                l = -1L;
            }
            if (l == -1L) {
                l = OsObject.createRowWithPrimaryKey(x2, e, c.K7());
            }
            else {
                Table.v0(value);
            }
            map.put(c, l);
            Table.nativeSetLong(nativePtr, b.f, l, c.f(), false);
            Table.nativeSetLong(nativePtr, b.g, l, c.t3(), false);
        }
    }
    
    public static long J8(final f0 f0, final c c, final Map<n0, Long> map) {
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
        if (Integer.valueOf(c.K7()) != null) {
            nativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, e, c.K7());
        }
        else {
            nativeFindFirstInt = -1L;
        }
        long rowWithPrimaryKey = nativeFindFirstInt;
        if (nativeFindFirstInt == -1L) {
            rowWithPrimaryKey = OsObject.createRowWithPrimaryKey(x2, e, c.K7());
        }
        map.put(c, rowWithPrimaryKey);
        Table.nativeSetLong(nativePtr, b.f, rowWithPrimaryKey, c.f(), false);
        Table.nativeSetLong(nativePtr, b.g, rowWithPrimaryKey, c.t3(), false);
        return rowWithPrimaryKey;
    }
    
    public static void K8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
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
            if (Integer.valueOf(c.K7()) != null) {
                nativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, e, c.K7());
            }
            else {
                nativeFindFirstInt = -1L;
            }
            long rowWithPrimaryKey = nativeFindFirstInt;
            if (nativeFindFirstInt == -1L) {
                rowWithPrimaryKey = OsObject.createRowWithPrimaryKey(x2, e, c.K7());
            }
            map.put(c, rowWithPrimaryKey);
            Table.nativeSetLong(nativePtr, b.f, rowWithPrimaryKey, c.f(), false);
            Table.nativeSetLong(nativePtr, b.g, rowWithPrimaryKey, c.t3(), false);
        }
    }
    
    static b1 L8(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(c.class), false, Collections.emptyList());
        final b1 b1 = new b1();
        h.a();
        return b1;
    }
    
    static c M8(final f0 f0, final b b, final c c, final c c2, final Map<n0, p> map, final Set<q> set) {
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(c.class), set);
        osObjectBuilder.K(b.e, c2.K7());
        osObjectBuilder.K(b.f, c2.f());
        osObjectBuilder.K(b.g, c2.t3());
        osObjectBuilder.i0();
        return c;
    }
    
    public static c y8(final f0 f0, final b b, final c c, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        final b1 b3 = map.get(c);
        if (b3 != null) {
            return b3;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(c.class), set);
        osObjectBuilder.K(b.e, c.K7());
        osObjectBuilder.K(b.f, c.f());
        osObjectBuilder.K(b.g, c.t3());
        final b1 l8 = L8(f0, osObjectBuilder.f0());
        map.put(c, l8);
        return l8;
    }
    
    public static c z8(final f0 f0, final b b, final c c, final boolean b2, final Map<n0, p> map, final Set<q> set) {
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
        Label_0234: {
            if (b2) {
                x2 = f0.x2(c.class);
                final long r = ((Table)x2).r(b.e, c.K7());
                if (r == -1L) {
                    b3 = false;
                    x2 = p8;
                    break Label_0234;
                }
                try {
                    h.g(f0, ((Table)x2).R(r), b, false, Collections.emptyList());
                    x2 = new b1();
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
            c2 = M8(f0, b, (c)x2, c, map, set);
        }
        else {
            c2 = y8(f0, b, c, b2, map, set);
        }
        return c2;
    }
    
    @Override
    public int K7() {
        this.N.f().h();
        return (int)this.N.g().m(this.M.e);
    }
    
    @Override
    public void P3(final int n) {
        if (!this.N.i()) {
            this.N.f().h();
            this.N.g().s(this.M.g, n);
            return;
        }
        if (!this.N.d()) {
            return;
        }
        final r g = this.N.g();
        g.g().q0(this.M.g, g.l0(), n, true);
    }
    
    @Override
    public c0<?> S6() {
        return this.N;
    }
    
    @Override
    public void c3(final int n) {
        if (this.N.i()) {
            return;
        }
        this.N.f().h();
        throw new RealmException("Primary key field 'schoolColorTypeId' cannot be changed after object was created.");
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final b1 b1 = (b1)o;
        final io.realm.a f = this.N.f();
        final io.realm.a f2 = b1.N.f();
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
        final String i = b1.N.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.N.g().l0() == b1.N.g().l0();
            }
        }
        else if (i == null) {
            return this.N.g().l0() == b1.N.g().l0();
        }
        return false;
    }
    
    @Override
    public int f() {
        this.N.f().h();
        return (int)this.N.g().m(this.M.f);
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
    public void m7(final int n) {
        if (!this.N.i()) {
            this.N.f().h();
            this.N.g().s(this.M.f, n);
            return;
        }
        if (!this.N.d()) {
            return;
        }
        final r g = this.N.g();
        g.g().q0(this.M.f, g.l0(), n, true);
    }
    
    @Override
    public int t3() {
        this.N.f().h();
        return (int)this.N.g().m(this.M.g);
    }
    
    @Override
    public String toString() {
        if (!p0.k8(this)) {
            return "Invalid object";
        }
        final StringBuilder sb = new StringBuilder("RealmSchoolColor = proxy[");
        sb.append("{schoolColorTypeId:");
        sb.append(this.K7());
        sb.append("}");
        sb.append(",");
        sb.append("{text:");
        sb.append(this.f());
        sb.append("}");
        sb.append(",");
        sb.append("{background:");
        sb.append(this.t3());
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
        (this.N = new c0<c>(this)).r(h.e());
        this.N.s(h.f());
        this.N.o(h.b());
        this.N.q(h.d());
    }
    
    public static final class a
    {
        public static final String a = "RealmSchoolColor";
    }
    
    static final class b extends io.realm.internal.c
    {
        long e;
        long f;
        long g;
        
        b(final OsSchemaInfo osSchemaInfo) {
            super(3);
            final OsObjectSchemaInfo b = osSchemaInfo.b("RealmSchoolColor");
            this.e = this.b("schoolColorTypeId", "schoolColorTypeId", b);
            this.f = this.b("text", "text", b);
            this.g = this.b("background", "background", b);
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
        }
    }
}
