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
import w4.h;

public class j4 extends h implements p, k4
{
    private static final String S = "";
    private static final OsObjectSchemaInfo T;
    private b Q;
    private c0<h> R;
    
    static {
        T = K8();
    }
    
    j4() {
        this.R.p();
    }
    
    public static h G8(final f0 f0, final b b, final h h, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        final j4 j4 = map.get(h);
        if (j4 != null) {
            return j4;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(h.class), set);
        osObjectBuilder.L(b.e, h.a());
        osObjectBuilder.d0(b.f, h.g());
        osObjectBuilder.d0(b.g, h.n());
        osObjectBuilder.K(b.h, h.r());
        osObjectBuilder.K(b.i, h.u());
        osObjectBuilder.n(b.j, h.t());
        osObjectBuilder.n(b.k, h.L());
        final j4 t8 = T8(f0, osObjectBuilder.f0());
        map.put(h, t8);
        return t8;
    }
    
    public static h H8(final f0 f0, final b b, final h h, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        if (h instanceof p && !p0.h8(h)) {
            final p p6 = (p)h;
            if (p6.S6().f() != null) {
                final io.realm.a f2 = p6.S6().f();
                if (f2.H != f0.H) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
                if (f2.getPath().equals(f0.getPath())) {
                    return h;
                }
            }
        }
        final io.realm.a.h h2 = io.realm.a.W.get();
        final p p7 = map.get(h);
        if (p7 != null) {
            return (h)p7;
        }
        final p p8 = null;
        Object x2 = null;
        boolean b3 = false;
        Label_0232: {
            if (b2) {
                x2 = f0.x2(h.class);
                final long r = ((Table)x2).r(b.e, h.a());
                if (r == -1L) {
                    b3 = false;
                    x2 = p8;
                    break Label_0232;
                }
                try {
                    h2.g(f0, ((Table)x2).R(r), b, false, Collections.emptyList());
                    x2 = new j4();
                    map.put(h, (p)x2);
                }
                finally {
                    h2.a();
                }
            }
            b3 = b2;
        }
        h h3;
        if (b3) {
            h3 = U8(f0, b, (h)x2, h, map, set);
        }
        else {
            h3 = G8(f0, b, h, b2, map, set);
        }
        return h3;
    }
    
    public static b I8(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static h J8(final h h, final int a, final int n, final Map<n0, p.a<n0>> map) {
        if (a <= n && h != null) {
            final p.a a2 = map.get(h);
            h h3;
            if (a2 == null) {
                final h h2 = new h();
                map.put(h, (p.a<n0>)new p.a(a, h2));
                h3 = h2;
            }
            else {
                if (a >= a2.a) {
                    return (h)a2.b;
                }
                h3 = (h)a2.b;
                a2.a = a;
            }
            h3.b(h.a());
            h3.e(h.g());
            h3.m(h.n());
            h3.q(h.r());
            h3.w(h.u());
            h3.s(h.t());
            h3.Q(h.L());
            return h3;
        }
        return null;
    }
    
    private static OsObjectSchemaInfo K8() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmSubject", false, 7, 0);
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
    
    public static h L8(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final List<String> emptyList = Collections.emptyList();
        Object x2 = null;
        Label_0141: {
            if (b) {
                x2 = f0.x2(h.class);
                final long e = ((b)f0.H().j(h.class)).e;
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
                        h.g(f0, ((Table)x2).R(r), f0.H().j(h.class), false, Collections.emptyList());
                        x2 = new j4();
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
            j4 j4;
            if (jsonObject.isNull("id")) {
                j4 = f0.p1((Class<j4>)h.class, null, true, emptyList);
            }
            else {
                j4 = f0.p1((Class<j4>)h.class, jsonObject.getLong("id"), true, emptyList);
            }
            o = j4;
        }
        if (jsonObject.has("name")) {
            if (jsonObject.isNull("name")) {
                ((k4)o).e(null);
            }
            else {
                ((k4)o).e(jsonObject.getString("name"));
            }
        }
        if (jsonObject.has("longName")) {
            if (jsonObject.isNull("longName")) {
                ((k4)o).m(null);
            }
            else {
                ((k4)o).m(jsonObject.getString("longName"));
            }
        }
        if (jsonObject.has("textColor")) {
            if (jsonObject.isNull("textColor")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'textColor' to null.");
            }
            ((k4)o).q(jsonObject.getInt("textColor"));
        }
        if (jsonObject.has("backColor")) {
            if (jsonObject.isNull("backColor")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'backColor' to null.");
            }
            ((k4)o).w(jsonObject.getInt("backColor"));
        }
        if (jsonObject.has("active")) {
            if (jsonObject.isNull("active")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'active' to null.");
            }
            ((k4)o).s(jsonObject.getBoolean("active"));
        }
        if (jsonObject.has("displayable")) {
            if (jsonObject.isNull("displayable")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'displayable' to null.");
            }
            ((k4)o).Q(jsonObject.getBoolean("displayable"));
        }
        return (h)o;
    }
    
    @TargetApi(11)
    public static h M8(final f0 f0, final JsonReader jsonReader) throws IOException {
        final h h = new h();
        jsonReader.beginObject();
        boolean b = false;
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
                h.b(jsonReader.nextLong());
                b = true;
            }
            else if (nextName.equals("name")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    h.e(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    h.e(null);
                }
            }
            else if (nextName.equals("longName")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    h.m(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    h.m(null);
                }
            }
            else if (nextName.equals("textColor")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'textColor' to null.");
                }
                h.q(jsonReader.nextInt());
            }
            else if (nextName.equals("backColor")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'backColor' to null.");
                }
                h.w(jsonReader.nextInt());
            }
            else if (nextName.equals("active")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'active' to null.");
                }
                h.s(jsonReader.nextBoolean());
            }
            else if (nextName.equals("displayable")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'displayable' to null.");
                }
                h.Q(jsonReader.nextBoolean());
            }
            else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (b) {
            return f0.G0(h, new q[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }
    
    public static OsObjectSchemaInfo N8() {
        return j4.T;
    }
    
    public static String O8() {
        return "RealmSubject";
    }
    
    public static long P8(final f0 f0, final h h, final Map<n0, Long> map) {
        if (h instanceof p && !p0.h8(h)) {
            final p p3 = (p)h;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(h.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(h.class);
        final long e = b.e;
        final Long value = h.a();
        long l;
        if (value != null) {
            l = Table.nativeFindFirstInt(nativePtr, e, h.a());
        }
        else {
            l = -1L;
        }
        if (l == -1L) {
            l = OsObject.createRowWithPrimaryKey(x2, e, h.a());
        }
        else {
            Table.v0(value);
        }
        map.put(h, l);
        final String g = h.g();
        if (g != null) {
            Table.nativeSetString(nativePtr, b.f, l, g, false);
        }
        final String n = h.n();
        if (n != null) {
            Table.nativeSetString(nativePtr, b.g, l, n, false);
        }
        Table.nativeSetLong(nativePtr, b.h, l, h.r(), false);
        Table.nativeSetLong(nativePtr, b.i, l, h.u(), false);
        Table.nativeSetBoolean(nativePtr, b.j, l, h.t(), false);
        Table.nativeSetBoolean(nativePtr, b.k, l, h.L(), false);
        return l;
    }
    
    public static void Q8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(h.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(h.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final h h = (h)iterator.next();
            if (map.containsKey(h)) {
                continue;
            }
            if (h instanceof p && !p0.h8(h)) {
                final p p3 = (p)h;
                if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                    map.put(h, p3.S6().g().l0());
                    continue;
                }
            }
            final Long value = h.a();
            long l;
            if (value != null) {
                l = Table.nativeFindFirstInt(nativePtr, e, h.a());
            }
            else {
                l = -1L;
            }
            if (l == -1L) {
                l = OsObject.createRowWithPrimaryKey(x2, e, h.a());
            }
            else {
                Table.v0(value);
            }
            map.put(h, l);
            final String g = h.g();
            if (g != null) {
                Table.nativeSetString(nativePtr, b.f, l, g, false);
            }
            final String n = h.n();
            if (n != null) {
                Table.nativeSetString(nativePtr, b.g, l, n, false);
            }
            Table.nativeSetLong(nativePtr, b.h, l, h.r(), false);
            Table.nativeSetLong(nativePtr, b.i, l, h.u(), false);
            Table.nativeSetBoolean(nativePtr, b.j, l, h.t(), false);
            Table.nativeSetBoolean(nativePtr, b.k, l, h.L(), false);
        }
    }
    
    public static long R8(final f0 f0, final h h, final Map<n0, Long> map) {
        if (h instanceof p && !p0.h8(h)) {
            final p p3 = (p)h;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(h.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(h.class);
        final long e = b.e;
        long nativeFindFirstInt;
        if (Long.valueOf(h.a()) != null) {
            nativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, e, h.a());
        }
        else {
            nativeFindFirstInt = -1L;
        }
        long rowWithPrimaryKey = nativeFindFirstInt;
        if (nativeFindFirstInt == -1L) {
            rowWithPrimaryKey = OsObject.createRowWithPrimaryKey(x2, e, h.a());
        }
        map.put(h, rowWithPrimaryKey);
        final String g = h.g();
        final long f2 = b.f;
        if (g != null) {
            Table.nativeSetString(nativePtr, f2, rowWithPrimaryKey, g, false);
        }
        else {
            Table.nativeSetNull(nativePtr, f2, rowWithPrimaryKey, false);
        }
        final String n = h.n();
        final long g2 = b.g;
        if (n != null) {
            Table.nativeSetString(nativePtr, g2, rowWithPrimaryKey, n, false);
        }
        else {
            Table.nativeSetNull(nativePtr, g2, rowWithPrimaryKey, false);
        }
        Table.nativeSetLong(nativePtr, b.h, rowWithPrimaryKey, h.r(), false);
        Table.nativeSetLong(nativePtr, b.i, rowWithPrimaryKey, h.u(), false);
        Table.nativeSetBoolean(nativePtr, b.j, rowWithPrimaryKey, h.t(), false);
        Table.nativeSetBoolean(nativePtr, b.k, rowWithPrimaryKey, h.L(), false);
        return rowWithPrimaryKey;
    }
    
    public static void S8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(h.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(h.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final h h = (h)iterator.next();
            if (map.containsKey(h)) {
                continue;
            }
            if (h instanceof p && !p0.h8(h)) {
                final p p3 = (p)h;
                if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                    map.put(h, p3.S6().g().l0());
                    continue;
                }
            }
            long nativeFindFirstInt;
            if (Long.valueOf(h.a()) != null) {
                nativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, e, h.a());
            }
            else {
                nativeFindFirstInt = -1L;
            }
            long rowWithPrimaryKey = nativeFindFirstInt;
            if (nativeFindFirstInt == -1L) {
                rowWithPrimaryKey = OsObject.createRowWithPrimaryKey(x2, e, h.a());
            }
            map.put(h, rowWithPrimaryKey);
            final String g = h.g();
            if (g != null) {
                Table.nativeSetString(nativePtr, b.f, rowWithPrimaryKey, g, false);
            }
            else {
                Table.nativeSetNull(nativePtr, b.f, rowWithPrimaryKey, false);
            }
            final String n = h.n();
            final long g2 = b.g;
            if (n != null) {
                Table.nativeSetString(nativePtr, g2, rowWithPrimaryKey, n, false);
            }
            else {
                Table.nativeSetNull(nativePtr, g2, rowWithPrimaryKey, false);
            }
            Table.nativeSetLong(nativePtr, b.h, rowWithPrimaryKey, h.r(), false);
            Table.nativeSetLong(nativePtr, b.i, rowWithPrimaryKey, h.u(), false);
            Table.nativeSetBoolean(nativePtr, b.j, rowWithPrimaryKey, h.t(), false);
            Table.nativeSetBoolean(nativePtr, b.k, rowWithPrimaryKey, h.L(), false);
        }
    }
    
    static j4 T8(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(h.class), false, Collections.emptyList());
        final j4 j4 = new j4();
        h.a();
        return j4;
    }
    
    static h U8(final f0 f0, final b b, final h h, final h h2, final Map<n0, p> map, final Set<q> set) {
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(h.class), set);
        osObjectBuilder.L(b.e, h2.a());
        osObjectBuilder.d0(b.f, h2.g());
        osObjectBuilder.d0(b.g, h2.n());
        osObjectBuilder.K(b.h, h2.r());
        osObjectBuilder.K(b.i, h2.u());
        osObjectBuilder.n(b.j, h2.t());
        osObjectBuilder.n(b.k, h2.L());
        osObjectBuilder.i0();
        return h;
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
        final j4 j4 = (j4)o;
        final io.realm.a f = this.R.f();
        final io.realm.a f2 = j4.R.f();
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
        final String i = j4.R.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.R.g().l0() == j4.R.g().l0();
            }
        }
        else if (i == null) {
            return this.R.g().l0() == j4.R.g().l0();
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
        final StringBuilder sb = new StringBuilder("RealmSubject = proxy[");
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
        (this.R = new c0<h>(this)).r(h.e());
        this.R.s(h.f());
        this.R.o(h.b());
        this.R.q(h.d());
    }
    
    public static final class a
    {
        public static final String a = "RealmSubject";
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
            final OsObjectSchemaInfo b = osSchemaInfo.b("RealmSubject");
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
