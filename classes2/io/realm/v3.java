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
import w4.a;

public class v3 extends w4.a implements p, w3
{
    private static final String Q = "";
    private static final OsObjectSchemaInfo R;
    private b O;
    private c0<w4.a> P;
    
    static {
        R = G8();
    }
    
    v3() {
        this.P.p();
    }
    
    public static w4.a C8(final f0 f0, final b b, final w4.a a, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        final v3 v3 = map.get(a);
        if (v3 != null) {
            return v3;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(w4.a.class), set);
        osObjectBuilder.K(b.e, a.l());
        osObjectBuilder.L(b.f, a.o());
        osObjectBuilder.K(b.g, a.r());
        osObjectBuilder.K(b.h, a.u());
        osObjectBuilder.d0(b.i, a.z());
        final v3 p6 = P8(f0, osObjectBuilder.f0());
        map.put(a, p6);
        return p6;
    }
    
    public static w4.a D8(final f0 f0, final b b, final w4.a a, final boolean b2, final Map<n0, p> map, final Set<q> set) {
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
            return (w4.a)p7;
        }
        final p p8 = null;
        Object x2 = null;
        boolean b3 = false;
        Label_0232: {
            if (b2) {
                x2 = f0.x2(w4.a.class);
                final long u = ((Table)x2).u(b.i, a.z());
                if (u == -1L) {
                    b3 = false;
                    x2 = p8;
                    break Label_0232;
                }
                try {
                    h.g(f0, ((Table)x2).R(u), b, false, Collections.emptyList());
                    x2 = new v3();
                    map.put(a, (p)x2);
                }
                finally {
                    h.a();
                }
            }
            b3 = b2;
        }
        w4.a a2;
        if (b3) {
            a2 = Q8(f0, b, (w4.a)x2, a, map, set);
        }
        else {
            a2 = C8(f0, b, a, b2, map, set);
        }
        return a2;
    }
    
    public static b E8(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static w4.a F8(final w4.a a, final int a2, final int n, final Map<n0, p.a<n0>> map) {
        if (a2 <= n && a != null) {
            final p.a a3 = map.get(a);
            w4.a a5;
            if (a3 == null) {
                final w4.a a4 = new w4.a();
                map.put(a, (p.a<n0>)new p.a(a2, a4));
                a5 = a4;
            }
            else {
                if (a2 >= a3.a) {
                    return (w4.a)a3.b;
                }
                a5 = (w4.a)a3.b;
                a3.a = a2;
            }
            a5.k(a.l());
            a5.p(a.o());
            a5.q(a.r());
            a5.w(a.u());
            a5.q1(a.z());
            return a5;
        }
        return null;
    }
    
    private static OsObjectSchemaInfo G8() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmCustomEntityColor", false, 5, 0);
        final RealmFieldType integer = RealmFieldType.INTEGER;
        b.c("", "entityType", integer, false, false, true);
        b.c("", "entityId", integer, false, false, true);
        b.c("", "textColor", integer, false, false, true);
        b.c("", "backColor", integer, false, false, true);
        b.c("", "key", RealmFieldType.STRING, true, false, true);
        return b.e();
    }
    
    public static w4.a H8(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final List<String> emptyList = Collections.emptyList();
        Object x2 = null;
        Label_0141: {
            if (b) {
                x2 = f0.x2(w4.a.class);
                final long i = ((b)f0.H().j(w4.a.class)).i;
                long u;
                if (!jsonObject.isNull("key")) {
                    u = ((Table)x2).u(i, jsonObject.getString("key"));
                }
                else {
                    u = -1L;
                }
                if (u != -1L) {
                    final io.realm.a.h h = io.realm.a.W.get();
                    try {
                        h.g(f0, ((Table)x2).R(u), f0.H().j(w4.a.class), false, Collections.emptyList());
                        x2 = new v3();
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
            if (!jsonObject.has("key")) {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'key'.");
            }
            v3 v3;
            if (jsonObject.isNull("key")) {
                v3 = f0.p1((Class<v3>)w4.a.class, null, true, emptyList);
            }
            else {
                v3 = f0.p1((Class<v3>)w4.a.class, jsonObject.getString("key"), true, emptyList);
            }
            o = v3;
        }
        if (jsonObject.has("entityType")) {
            if (jsonObject.isNull("entityType")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'entityType' to null.");
            }
            ((w3)o).k(jsonObject.getInt("entityType"));
        }
        if (jsonObject.has("entityId")) {
            if (jsonObject.isNull("entityId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'entityId' to null.");
            }
            ((w3)o).p(jsonObject.getLong("entityId"));
        }
        if (jsonObject.has("textColor")) {
            if (jsonObject.isNull("textColor")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'textColor' to null.");
            }
            ((w3)o).q(jsonObject.getInt("textColor"));
        }
        if (jsonObject.has("backColor")) {
            if (jsonObject.isNull("backColor")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'backColor' to null.");
            }
            ((w3)o).w(jsonObject.getInt("backColor"));
        }
        return (w4.a)o;
    }
    
    @TargetApi(11)
    public static w4.a I8(final f0 f0, final JsonReader jsonReader) throws IOException {
        final w4.a a = new w4.a();
        jsonReader.beginObject();
        boolean b = false;
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            if (nextName.equals("entityType")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'entityType' to null.");
                }
                a.k(jsonReader.nextInt());
            }
            else if (nextName.equals("entityId")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'entityId' to null.");
                }
                a.p(jsonReader.nextLong());
            }
            else if (nextName.equals("textColor")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'textColor' to null.");
                }
                a.q(jsonReader.nextInt());
            }
            else if (nextName.equals("backColor")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'backColor' to null.");
                }
                a.w(jsonReader.nextInt());
            }
            else if (nextName.equals("key")) {
                String nextString;
                if (jsonReader.peek() != JsonToken.NULL) {
                    nextString = jsonReader.nextString();
                }
                else {
                    jsonReader.skipValue();
                    nextString = null;
                }
                a.q1(nextString);
                b = true;
            }
            else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (b) {
            return f0.G0(a, new q[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'key'.");
    }
    
    public static OsObjectSchemaInfo J8() {
        return v3.R;
    }
    
    public static String K8() {
        return "RealmCustomEntityColor";
    }
    
    public static long L8(final f0 f0, final w4.a a, final Map<n0, Long> map) {
        if (a instanceof p && !p0.h8(a)) {
            final p p3 = (p)a;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(w4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(w4.a.class);
        final long i = b.i;
        final String z = a.z();
        long l;
        if (z != null) {
            l = Table.nativeFindFirstString(nativePtr, i, z);
        }
        else {
            l = -1L;
        }
        if (l == -1L) {
            l = OsObject.createRowWithPrimaryKey(x2, i, z);
        }
        else {
            Table.v0(z);
        }
        map.put(a, l);
        Table.nativeSetLong(nativePtr, b.e, l, a.l(), false);
        Table.nativeSetLong(nativePtr, b.f, l, a.o(), false);
        Table.nativeSetLong(nativePtr, b.g, l, a.r(), false);
        Table.nativeSetLong(nativePtr, b.h, l, a.u(), false);
        return l;
    }
    
    public static void M8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(w4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(w4.a.class);
        final long i = b.i;
        while (iterator.hasNext()) {
            final w4.a a = (w4.a)iterator.next();
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
            final String z = a.z();
            long l;
            if (z != null) {
                l = Table.nativeFindFirstString(nativePtr, i, z);
            }
            else {
                l = -1L;
            }
            if (l == -1L) {
                l = OsObject.createRowWithPrimaryKey(x2, i, z);
            }
            else {
                Table.v0(z);
            }
            map.put(a, l);
            Table.nativeSetLong(nativePtr, b.e, l, a.l(), false);
            Table.nativeSetLong(nativePtr, b.f, l, a.o(), false);
            Table.nativeSetLong(nativePtr, b.g, l, a.r(), false);
            Table.nativeSetLong(nativePtr, b.h, l, a.u(), false);
        }
    }
    
    public static long N8(final f0 f0, final w4.a a, final Map<n0, Long> map) {
        if (a instanceof p && !p0.h8(a)) {
            final p p3 = (p)a;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(w4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(w4.a.class);
        final long i = b.i;
        final String z = a.z();
        long nativeFindFirstString;
        if (z != null) {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, i, z);
        }
        else {
            nativeFindFirstString = -1L;
        }
        long rowWithPrimaryKey = nativeFindFirstString;
        if (nativeFindFirstString == -1L) {
            rowWithPrimaryKey = OsObject.createRowWithPrimaryKey(x2, i, z);
        }
        map.put(a, rowWithPrimaryKey);
        Table.nativeSetLong(nativePtr, b.e, rowWithPrimaryKey, a.l(), false);
        Table.nativeSetLong(nativePtr, b.f, rowWithPrimaryKey, a.o(), false);
        Table.nativeSetLong(nativePtr, b.g, rowWithPrimaryKey, a.r(), false);
        Table.nativeSetLong(nativePtr, b.h, rowWithPrimaryKey, a.u(), false);
        return rowWithPrimaryKey;
    }
    
    public static void O8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(w4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(w4.a.class);
        final long i = b.i;
        while (iterator.hasNext()) {
            final w4.a a = (w4.a)iterator.next();
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
            final String z = a.z();
            long l;
            if (z != null) {
                l = Table.nativeFindFirstString(nativePtr, i, z);
            }
            else {
                l = -1L;
            }
            if (l == -1L) {
                l = OsObject.createRowWithPrimaryKey(x2, i, z);
            }
            map.put(a, l);
            Table.nativeSetLong(nativePtr, b.e, l, a.l(), false);
            Table.nativeSetLong(nativePtr, b.f, l, a.o(), false);
            Table.nativeSetLong(nativePtr, b.g, l, a.r(), false);
            Table.nativeSetLong(nativePtr, b.h, l, a.u(), false);
        }
    }
    
    static v3 P8(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(w4.a.class), false, Collections.emptyList());
        final v3 v3 = new v3();
        h.a();
        return v3;
    }
    
    static w4.a Q8(final f0 f0, final b b, final w4.a a, final w4.a a2, final Map<n0, p> map, final Set<q> set) {
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(w4.a.class), set);
        osObjectBuilder.K(b.e, a2.l());
        osObjectBuilder.L(b.f, a2.o());
        osObjectBuilder.K(b.g, a2.r());
        osObjectBuilder.K(b.h, a2.u());
        osObjectBuilder.d0(b.i, a2.z());
        osObjectBuilder.i0();
        return a;
    }
    
    @Override
    public c0<?> S6() {
        return this.P;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final v3 v3 = (v3)o;
        final io.realm.a f = this.P.f();
        final io.realm.a f2 = v3.P.f();
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
        final String i = v3.P.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.P.g().l0() == v3.P.g().l0();
            }
        }
        else if (i == null) {
            return this.P.g().l0() == v3.P.g().l0();
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
    public void k(final int n) {
        if (!this.P.i()) {
            this.P.f().h();
            this.P.g().s(this.O.e, n);
            return;
        }
        if (!this.P.d()) {
            return;
        }
        final r g = this.P.g();
        g.g().q0(this.O.e, g.l0(), n, true);
    }
    
    @Override
    public int l() {
        this.P.f().h();
        return (int)this.P.g().m(this.O.e);
    }
    
    @Override
    public long o() {
        this.P.f().h();
        return this.P.g().m(this.O.f);
    }
    
    @Override
    public void p(final long n) {
        if (!this.P.i()) {
            this.P.f().h();
            this.P.g().s(this.O.f, n);
            return;
        }
        if (!this.P.d()) {
            return;
        }
        final r g = this.P.g();
        g.g().q0(this.O.f, g.l0(), n, true);
    }
    
    @Override
    public void q(final int n) {
        if (!this.P.i()) {
            this.P.f().h();
            this.P.g().s(this.O.g, n);
            return;
        }
        if (!this.P.d()) {
            return;
        }
        final r g = this.P.g();
        g.g().q0(this.O.g, g.l0(), n, true);
    }
    
    @Override
    public void q1(final String s) {
        if (this.P.i()) {
            return;
        }
        this.P.f().h();
        throw new RealmException("Primary key field 'key' cannot be changed after object was created.");
    }
    
    @Override
    public int r() {
        this.P.f().h();
        return (int)this.P.g().m(this.O.g);
    }
    
    @Override
    public String toString() {
        if (!p0.k8(this)) {
            return "Invalid object";
        }
        final StringBuilder sb = new StringBuilder("RealmCustomEntityColor = proxy[");
        sb.append("{entityType:");
        sb.append(this.l());
        sb.append("}");
        sb.append(",");
        sb.append("{entityId:");
        sb.append(this.o());
        sb.append("}");
        sb.append(",");
        sb.append("{textColor:");
        sb.append(this.r());
        sb.append("}");
        sb.append(",");
        sb.append("{backColor:");
        sb.append(this.u());
        sb.append("}");
        sb.append(",");
        sb.append("{key:");
        sb.append(this.z());
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
    
    @Override
    public int u() {
        this.P.f().h();
        return (int)this.P.g().m(this.O.h);
    }
    
    @Override
    public void w(final int n) {
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
    public void y4() {
        if (this.P != null) {
            return;
        }
        final io.realm.a.h h = io.realm.a.W.get();
        this.O = (b)h.c();
        (this.P = new c0<w4.a>(this)).r(h.e());
        this.P.s(h.f());
        this.P.o(h.b());
        this.P.q(h.d());
    }
    
    @Override
    public String z() {
        this.P.f().h();
        return this.P.g().U(this.O.i);
    }
    
    public static final class a
    {
        public static final String a = "RealmCustomEntityColor";
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
            final OsObjectSchemaInfo b = osSchemaInfo.b("RealmCustomEntityColor");
            this.e = this.b("entityType", "entityType", b);
            this.f = this.b("entityId", "entityId", b);
            this.g = this.b("textColor", "textColor", b);
            this.h = this.b("backColor", "backColor", b);
            this.i = this.b("key", "key", b);
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
