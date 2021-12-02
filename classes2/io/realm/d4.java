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
import w4.e;

public class d4 extends e implements p, e4
{
    private static final String S = "";
    private static final OsObjectSchemaInfo T;
    private b Q;
    private c0<e> R;
    
    static {
        T = K8();
    }
    
    d4() {
        this.R.p();
    }
    
    public static e G8(final f0 f0, final b b, final e e, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        final d4 d4 = map.get(e);
        if (d4 != null) {
            return d4;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(e.class), set);
        osObjectBuilder.L(b.e, e.a());
        osObjectBuilder.d0(b.f, e.g());
        osObjectBuilder.d0(b.g, e.n());
        osObjectBuilder.K(b.h, e.r());
        osObjectBuilder.K(b.i, e.u());
        osObjectBuilder.n(b.j, e.t());
        osObjectBuilder.n(b.k, e.L());
        final d4 t8 = T8(f0, osObjectBuilder.f0());
        map.put(e, t8);
        return t8;
    }
    
    public static e H8(final f0 f0, final b b, final e e, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        if (e instanceof p && !p0.h8(e)) {
            final p p6 = (p)e;
            if (p6.S6().f() != null) {
                final io.realm.a f2 = p6.S6().f();
                if (f2.H != f0.H) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
                if (f2.getPath().equals(f0.getPath())) {
                    return e;
                }
            }
        }
        final io.realm.a.h h = io.realm.a.W.get();
        final p p7 = map.get(e);
        if (p7 != null) {
            return (e)p7;
        }
        final p p8 = null;
        Object x2 = null;
        boolean b3 = false;
        Label_0232: {
            if (b2) {
                x2 = f0.x2(e.class);
                final long r = ((Table)x2).r(b.e, e.a());
                if (r == -1L) {
                    b3 = false;
                    x2 = p8;
                    break Label_0232;
                }
                try {
                    h.g(f0, ((Table)x2).R(r), b, false, Collections.emptyList());
                    x2 = new d4();
                    map.put(e, (p)x2);
                }
                finally {
                    h.a();
                }
            }
            b3 = b2;
        }
        e e2;
        if (b3) {
            e2 = U8(f0, b, (e)x2, e, map, set);
        }
        else {
            e2 = G8(f0, b, e, b2, map, set);
        }
        return e2;
    }
    
    public static b I8(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static e J8(final e e, final int a, final int n, final Map<n0, p.a<n0>> map) {
        if (a <= n && e != null) {
            final p.a a2 = map.get(e);
            e e3;
            if (a2 == null) {
                final e e2 = new e();
                map.put(e, (p.a<n0>)new p.a(a, e2));
                e3 = e2;
            }
            else {
                if (a >= a2.a) {
                    return (e)a2.b;
                }
                e3 = (e)a2.b;
                a2.a = a;
            }
            e3.b(e.a());
            e3.e(e.g());
            e3.m(e.n());
            e3.q(e.r());
            e3.w(e.u());
            e3.s(e.t());
            e3.Q(e.L());
            return e3;
        }
        return null;
    }
    
    private static OsObjectSchemaInfo K8() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmRoom", false, 7, 0);
        final RealmFieldType integer = RealmFieldType.INTEGER;
        b.c("", "id", integer, true, false, true);
        final RealmFieldType string = RealmFieldType.STRING;
        b.c("", "name", string, false, false, true);
        b.c("", "longName", string, false, false, true);
        b.c("", "textColor", integer, false, false, true);
        b.c("", "backColor", integer, false, false, true);
        final RealmFieldType boolean1 = RealmFieldType.BOOLEAN;
        b.c("", "active", boolean1, false, false, true);
        b.c("", "displayable", boolean1, false, false, true);
        return b.e();
    }
    
    public static e L8(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final List<String> emptyList = Collections.emptyList();
        Object x2 = null;
        Label_0141: {
            if (b) {
                x2 = f0.x2(e.class);
                final long e = ((b)f0.H().j(e.class)).e;
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
                        h.g(f0, ((Table)x2).R(r), f0.H().j(e.class), false, Collections.emptyList());
                        x2 = new d4();
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
            d4 d4;
            if (jsonObject.isNull("id")) {
                d4 = f0.p1((Class<d4>)e.class, null, true, emptyList);
            }
            else {
                d4 = f0.p1((Class<d4>)e.class, jsonObject.getLong("id"), true, emptyList);
            }
            o = d4;
        }
        if (jsonObject.has("name")) {
            if (jsonObject.isNull("name")) {
                ((e4)o).e(null);
            }
            else {
                ((e4)o).e(jsonObject.getString("name"));
            }
        }
        if (jsonObject.has("longName")) {
            if (jsonObject.isNull("longName")) {
                ((e4)o).m(null);
            }
            else {
                ((e4)o).m(jsonObject.getString("longName"));
            }
        }
        if (jsonObject.has("textColor")) {
            if (jsonObject.isNull("textColor")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'textColor' to null.");
            }
            ((e4)o).q(jsonObject.getInt("textColor"));
        }
        if (jsonObject.has("backColor")) {
            if (jsonObject.isNull("backColor")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'backColor' to null.");
            }
            ((e4)o).w(jsonObject.getInt("backColor"));
        }
        if (jsonObject.has("active")) {
            if (jsonObject.isNull("active")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'active' to null.");
            }
            ((e4)o).s(jsonObject.getBoolean("active"));
        }
        if (jsonObject.has("displayable")) {
            if (jsonObject.isNull("displayable")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'displayable' to null.");
            }
            ((e4)o).Q(jsonObject.getBoolean("displayable"));
        }
        return (e)o;
    }
    
    @TargetApi(11)
    public static e M8(final f0 f0, final JsonReader jsonReader) throws IOException {
        final e e = new e();
        jsonReader.beginObject();
        boolean b = false;
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
                e.b(jsonReader.nextLong());
                b = true;
            }
            else if (nextName.equals("name")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    e.e(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    e.e(null);
                }
            }
            else if (nextName.equals("longName")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    e.m(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    e.m(null);
                }
            }
            else if (nextName.equals("textColor")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'textColor' to null.");
                }
                e.q(jsonReader.nextInt());
            }
            else if (nextName.equals("backColor")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'backColor' to null.");
                }
                e.w(jsonReader.nextInt());
            }
            else if (nextName.equals("active")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'active' to null.");
                }
                e.s(jsonReader.nextBoolean());
            }
            else if (nextName.equals("displayable")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'displayable' to null.");
                }
                e.Q(jsonReader.nextBoolean());
            }
            else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (b) {
            return f0.G0(e, new q[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }
    
    public static OsObjectSchemaInfo N8() {
        return d4.T;
    }
    
    public static String O8() {
        return "RealmRoom";
    }
    
    public static long P8(final f0 f0, final e e, final Map<n0, Long> map) {
        if (e instanceof p && !p0.h8(e)) {
            final p p3 = (p)e;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(e.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(e.class);
        final long e2 = b.e;
        final Long value = e.a();
        long l;
        if (value != null) {
            l = Table.nativeFindFirstInt(nativePtr, e2, e.a());
        }
        else {
            l = -1L;
        }
        if (l == -1L) {
            l = OsObject.createRowWithPrimaryKey(x2, e2, e.a());
        }
        else {
            Table.v0(value);
        }
        map.put(e, l);
        final String g = e.g();
        if (g != null) {
            Table.nativeSetString(nativePtr, b.f, l, g, false);
        }
        final String n = e.n();
        if (n != null) {
            Table.nativeSetString(nativePtr, b.g, l, n, false);
        }
        Table.nativeSetLong(nativePtr, b.h, l, e.r(), false);
        Table.nativeSetLong(nativePtr, b.i, l, e.u(), false);
        Table.nativeSetBoolean(nativePtr, b.j, l, e.t(), false);
        Table.nativeSetBoolean(nativePtr, b.k, l, e.L(), false);
        return l;
    }
    
    public static void Q8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(e.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(e.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final e e2 = (e)iterator.next();
            if (map.containsKey(e2)) {
                continue;
            }
            if (e2 instanceof p && !p0.h8(e2)) {
                final p p3 = (p)e2;
                if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                    map.put(e2, p3.S6().g().l0());
                    continue;
                }
            }
            final Long value = e2.a();
            long l;
            if (value != null) {
                l = Table.nativeFindFirstInt(nativePtr, e, e2.a());
            }
            else {
                l = -1L;
            }
            if (l == -1L) {
                l = OsObject.createRowWithPrimaryKey(x2, e, e2.a());
            }
            else {
                Table.v0(value);
            }
            map.put(e2, l);
            final String g = e2.g();
            if (g != null) {
                Table.nativeSetString(nativePtr, b.f, l, g, false);
            }
            final String n = e2.n();
            if (n != null) {
                Table.nativeSetString(nativePtr, b.g, l, n, false);
            }
            Table.nativeSetLong(nativePtr, b.h, l, e2.r(), false);
            Table.nativeSetLong(nativePtr, b.i, l, e2.u(), false);
            Table.nativeSetBoolean(nativePtr, b.j, l, e2.t(), false);
            Table.nativeSetBoolean(nativePtr, b.k, l, e2.L(), false);
        }
    }
    
    public static long R8(final f0 f0, final e e, final Map<n0, Long> map) {
        if (e instanceof p && !p0.h8(e)) {
            final p p3 = (p)e;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(e.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(e.class);
        final long e2 = b.e;
        long nativeFindFirstInt;
        if (Long.valueOf(e.a()) != null) {
            nativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, e2, e.a());
        }
        else {
            nativeFindFirstInt = -1L;
        }
        long rowWithPrimaryKey = nativeFindFirstInt;
        if (nativeFindFirstInt == -1L) {
            rowWithPrimaryKey = OsObject.createRowWithPrimaryKey(x2, e2, e.a());
        }
        map.put(e, rowWithPrimaryKey);
        final String g = e.g();
        final long f2 = b.f;
        if (g != null) {
            Table.nativeSetString(nativePtr, f2, rowWithPrimaryKey, g, false);
        }
        else {
            Table.nativeSetNull(nativePtr, f2, rowWithPrimaryKey, false);
        }
        final String n = e.n();
        final long g2 = b.g;
        if (n != null) {
            Table.nativeSetString(nativePtr, g2, rowWithPrimaryKey, n, false);
        }
        else {
            Table.nativeSetNull(nativePtr, g2, rowWithPrimaryKey, false);
        }
        Table.nativeSetLong(nativePtr, b.h, rowWithPrimaryKey, e.r(), false);
        Table.nativeSetLong(nativePtr, b.i, rowWithPrimaryKey, e.u(), false);
        Table.nativeSetBoolean(nativePtr, b.j, rowWithPrimaryKey, e.t(), false);
        Table.nativeSetBoolean(nativePtr, b.k, rowWithPrimaryKey, e.L(), false);
        return rowWithPrimaryKey;
    }
    
    public static void S8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(e.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(e.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final e e2 = (e)iterator.next();
            if (map.containsKey(e2)) {
                continue;
            }
            if (e2 instanceof p && !p0.h8(e2)) {
                final p p3 = (p)e2;
                if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                    map.put(e2, p3.S6().g().l0());
                    continue;
                }
            }
            long nativeFindFirstInt;
            if (Long.valueOf(e2.a()) != null) {
                nativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, e, e2.a());
            }
            else {
                nativeFindFirstInt = -1L;
            }
            long rowWithPrimaryKey = nativeFindFirstInt;
            if (nativeFindFirstInt == -1L) {
                rowWithPrimaryKey = OsObject.createRowWithPrimaryKey(x2, e, e2.a());
            }
            map.put(e2, rowWithPrimaryKey);
            final String g = e2.g();
            if (g != null) {
                Table.nativeSetString(nativePtr, b.f, rowWithPrimaryKey, g, false);
            }
            else {
                Table.nativeSetNull(nativePtr, b.f, rowWithPrimaryKey, false);
            }
            final String n = e2.n();
            final long g2 = b.g;
            if (n != null) {
                Table.nativeSetString(nativePtr, g2, rowWithPrimaryKey, n, false);
            }
            else {
                Table.nativeSetNull(nativePtr, g2, rowWithPrimaryKey, false);
            }
            Table.nativeSetLong(nativePtr, b.h, rowWithPrimaryKey, e2.r(), false);
            Table.nativeSetLong(nativePtr, b.i, rowWithPrimaryKey, e2.u(), false);
            Table.nativeSetBoolean(nativePtr, b.j, rowWithPrimaryKey, e2.t(), false);
            Table.nativeSetBoolean(nativePtr, b.k, rowWithPrimaryKey, e2.L(), false);
        }
    }
    
    static d4 T8(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(e.class), false, Collections.emptyList());
        final d4 d4 = new d4();
        h.a();
        return d4;
    }
    
    static e U8(final f0 f0, final b b, final e e, final e e2, final Map<n0, p> map, final Set<q> set) {
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(e.class), set);
        osObjectBuilder.L(b.e, e2.a());
        osObjectBuilder.d0(b.f, e2.g());
        osObjectBuilder.d0(b.g, e2.n());
        osObjectBuilder.K(b.h, e2.r());
        osObjectBuilder.K(b.i, e2.u());
        osObjectBuilder.n(b.j, e2.t());
        osObjectBuilder.n(b.k, e2.L());
        osObjectBuilder.i0();
        return e;
    }
    
    @Override
    public boolean L() {
        this.R.f().h();
        return this.R.g().l(this.Q.k);
    }
    
    @Override
    public void Q(final boolean b) {
        if (!this.R.i()) {
            this.R.f().h();
            this.R.g().i(this.Q.k, b);
            return;
        }
        if (!this.R.d()) {
            return;
        }
        final r g = this.R.g();
        g.g().j0(this.Q.k, g.l0(), b, true);
    }
    
    @Override
    public c0<?> S6() {
        return this.R;
    }
    
    @Override
    public long a() {
        this.R.f().h();
        return this.R.g().m(this.Q.e);
    }
    
    @Override
    public void b(final long n) {
        if (this.R.i()) {
            return;
        }
        this.R.f().h();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }
    
    @Override
    public void e(final String s) {
        if (this.R.i()) {
            if (!this.R.d()) {
                return;
            }
            final r g = this.R.g();
            if (s != null) {
                g.g().t0(this.Q.f, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'name' to null.");
        }
        else {
            this.R.f().h();
            if (s != null) {
                this.R.g().d(this.Q.f, s);
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
        final d4 d4 = (d4)o;
        final io.realm.a f = this.R.f();
        final io.realm.a f2 = d4.R.f();
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
        final String m = this.R.g().g().M();
        final String i = d4.R.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.R.g().l0() == d4.R.g().l0();
            }
        }
        else if (i == null) {
            return this.R.g().l0() == d4.R.g().l0();
        }
        return false;
    }
    
    @Override
    public String g() {
        this.R.f().h();
        return this.R.g().U(this.Q.f);
    }
    
    @Override
    public int hashCode() {
        final String path = this.R.f().getPath();
        final String m = this.R.g().g().M();
        final long l0 = this.R.g().l0();
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
        if (this.R.i()) {
            if (!this.R.d()) {
                return;
            }
            final r g = this.R.g();
            if (s != null) {
                g.g().t0(this.Q.g, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'longName' to null.");
        }
        else {
            this.R.f().h();
            if (s != null) {
                this.R.g().d(this.Q.g, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'longName' to null.");
        }
    }
    
    @Override
    public String n() {
        this.R.f().h();
        return this.R.g().U(this.Q.g);
    }
    
    @Override
    public void q(final int n) {
        if (!this.R.i()) {
            this.R.f().h();
            this.R.g().s(this.Q.h, n);
            return;
        }
        if (!this.R.d()) {
            return;
        }
        final r g = this.R.g();
        g.g().q0(this.Q.h, g.l0(), n, true);
    }
    
    @Override
    public int r() {
        this.R.f().h();
        return (int)this.R.g().m(this.Q.h);
    }
    
    @Override
    public void s(final boolean b) {
        if (!this.R.i()) {
            this.R.f().h();
            this.R.g().i(this.Q.j, b);
            return;
        }
        if (!this.R.d()) {
            return;
        }
        final r g = this.R.g();
        g.g().j0(this.Q.j, g.l0(), b, true);
    }
    
    @Override
    public boolean t() {
        this.R.f().h();
        return this.R.g().l(this.Q.j);
    }
    
    @Override
    public String toString() {
        if (!p0.k8(this)) {
            return "Invalid object";
        }
        final StringBuilder sb = new StringBuilder("RealmRoom = proxy[");
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
        sb.append("{textColor:");
        sb.append(this.r());
        sb.append("}");
        sb.append(",");
        sb.append("{backColor:");
        sb.append(this.u());
        sb.append("}");
        sb.append(",");
        sb.append("{active:");
        sb.append(this.t());
        sb.append("}");
        sb.append(",");
        sb.append("{displayable:");
        sb.append(this.L());
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
    
    @Override
    public int u() {
        this.R.f().h();
        return (int)this.R.g().m(this.Q.i);
    }
    
    @Override
    public void w(final int n) {
        if (!this.R.i()) {
            this.R.f().h();
            this.R.g().s(this.Q.i, n);
            return;
        }
        if (!this.R.d()) {
            return;
        }
        final r g = this.R.g();
        g.g().q0(this.Q.i, g.l0(), n, true);
    }
    
    @Override
    public void y4() {
        if (this.R != null) {
            return;
        }
        final io.realm.a.h h = io.realm.a.W.get();
        this.Q = (b)h.c();
        (this.R = new c0<e>(this)).r(h.e());
        this.R.s(h.f());
        this.R.o(h.b());
        this.R.q(h.d());
    }
    
    public static final class a
    {
        public static final String a = "RealmRoom";
    }
    
    static final class b extends c
    {
        long e;
        long f;
        long g;
        long h;
        long i;
        long j;
        long k;
        
        b(final OsSchemaInfo osSchemaInfo) {
            super(7);
            final OsObjectSchemaInfo b = osSchemaInfo.b("RealmRoom");
            this.e = this.b("id", "id", b);
            this.f = this.b("name", "name", b);
            this.g = this.b("longName", "longName", b);
            this.h = this.b("textColor", "textColor", b);
            this.i = this.b("backColor", "backColor", b);
            this.j = this.b("active", "active", b);
            this.k = this.b("displayable", "displayable", b);
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
            b2.k = b.k;
        }
    }
}
