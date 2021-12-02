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
import l4.a;

public class z1 extends l4.a implements p, a2
{
    private static final String T = "";
    private static final OsObjectSchemaInfo U;
    private b R;
    private c0<l4.a> S;
    
    static {
        U = M8();
    }
    
    z1() {
        this.S.p();
    }
    
    public static l4.a I8(final f0 f0, final b b, final l4.a a, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        final z1 z1 = map.get(a);
        if (z1 != null) {
            return z1;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(l4.a.class), set);
        osObjectBuilder.L(b.e, a.a());
        osObjectBuilder.K(b.f, a.l());
        osObjectBuilder.L(b.g, a.o());
        osObjectBuilder.L(b.h, a.d1());
        osObjectBuilder.d0(b.i, a.f());
        osObjectBuilder.L(b.j, a.Q0());
        osObjectBuilder.L(b.k, a.D());
        osObjectBuilder.n(b.l, a.A());
        final z1 v8 = V8(f0, osObjectBuilder.f0());
        map.put(a, v8);
        return v8;
    }
    
    public static l4.a J8(final f0 f0, final b b, final l4.a a, final boolean b2, final Map<n0, p> map, final Set<q> set) {
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
            return (l4.a)p7;
        }
        final p p8 = null;
        Object x2 = null;
        boolean b3 = false;
        Label_0232: {
            if (b2) {
                x2 = f0.x2(l4.a.class);
                final long r = ((Table)x2).r(b.e, a.a());
                if (r == -1L) {
                    b3 = false;
                    x2 = p8;
                    break Label_0232;
                }
                try {
                    h.g(f0, ((Table)x2).R(r), b, false, Collections.emptyList());
                    x2 = new z1();
                    map.put(a, (p)x2);
                }
                finally {
                    h.a();
                }
            }
            b3 = b2;
        }
        l4.a a2;
        if (b3) {
            a2 = W8(f0, b, (l4.a)x2, a, map, set);
        }
        else {
            a2 = I8(f0, b, a, b2, map, set);
        }
        return a2;
    }
    
    public static b K8(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static l4.a L8(final l4.a a, final int a2, final int n, final Map<n0, p.a<n0>> map) {
        if (a2 <= n && a != null) {
            final p.a a3 = map.get(a);
            l4.a a5;
            if (a3 == null) {
                final l4.a a4 = new l4.a();
                map.put(a, (p.a<n0>)new p.a(a2, a4));
                a5 = a4;
            }
            else {
                if (a2 >= a3.a) {
                    return (l4.a)a3.b;
                }
                a5 = (l4.a)a3.b;
                a3.a = a2;
            }
            a5.b(a.a());
            a5.k(a.l());
            a5.p(a.o());
            a5.Q5(a.d1());
            a5.j(a.f());
            a5.U0(a.Q0());
            a5.y(a.D());
            a5.F(a.A());
            return a5;
        }
        return null;
    }
    
    private static OsObjectSchemaInfo M8() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmEvent", false, 8, 0);
        final RealmFieldType integer = RealmFieldType.INTEGER;
        b.c("", "id", integer, true, false, true);
        b.c("", "entityType", integer, false, false, true);
        b.c("", "entityId", integer, false, false, true);
        b.c("", "dateTime", integer, false, false, true);
        b.c("", "text", RealmFieldType.STRING, false, false, true);
        b.c("", "eventReasonId", integer, false, false, true);
        b.c("", "periodId", integer, false, false, true);
        b.c("", "synced", RealmFieldType.BOOLEAN, false, false, true);
        return b.e();
    }
    
    public static l4.a N8(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final List<String> emptyList = Collections.emptyList();
        Object x2 = null;
        Label_0141: {
            if (b) {
                x2 = f0.x2(l4.a.class);
                final long e = ((b)f0.H().j(l4.a.class)).e;
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
                        h.g(f0, ((Table)x2).R(r), f0.H().j(l4.a.class), false, Collections.emptyList());
                        x2 = new z1();
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
            z1 z1;
            if (jsonObject.isNull("id")) {
                z1 = f0.p1((Class<z1>)l4.a.class, null, true, emptyList);
            }
            else {
                z1 = f0.p1((Class<z1>)l4.a.class, jsonObject.getLong("id"), true, emptyList);
            }
            o = z1;
        }
        if (jsonObject.has("entityType")) {
            if (jsonObject.isNull("entityType")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'entityType' to null.");
            }
            ((a2)o).k(jsonObject.getInt("entityType"));
        }
        if (jsonObject.has("entityId")) {
            if (jsonObject.isNull("entityId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'entityId' to null.");
            }
            ((a2)o).p(jsonObject.getLong("entityId"));
        }
        if (jsonObject.has("dateTime")) {
            if (jsonObject.isNull("dateTime")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'dateTime' to null.");
            }
            ((a2)o).Q5(jsonObject.getLong("dateTime"));
        }
        if (jsonObject.has("text")) {
            if (jsonObject.isNull("text")) {
                ((a2)o).j(null);
            }
            else {
                ((a2)o).j(jsonObject.getString("text"));
            }
        }
        if (jsonObject.has("eventReasonId")) {
            if (jsonObject.isNull("eventReasonId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'eventReasonId' to null.");
            }
            ((a2)o).U0(jsonObject.getLong("eventReasonId"));
        }
        if (jsonObject.has("periodId")) {
            if (jsonObject.isNull("periodId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'periodId' to null.");
            }
            ((a2)o).y(jsonObject.getLong("periodId"));
        }
        if (jsonObject.has("synced")) {
            if (jsonObject.isNull("synced")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'synced' to null.");
            }
            ((a2)o).F(jsonObject.getBoolean("synced"));
        }
        return (l4.a)o;
    }
    
    @TargetApi(11)
    public static l4.a O8(final f0 f0, final JsonReader jsonReader) throws IOException {
        final l4.a a = new l4.a();
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
            else if (nextName.equals("entityType")) {
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
            else if (nextName.equals("dateTime")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'dateTime' to null.");
                }
                a.Q5(jsonReader.nextLong());
            }
            else if (nextName.equals("text")) {
                String nextString;
                if (jsonReader.peek() != JsonToken.NULL) {
                    nextString = jsonReader.nextString();
                }
                else {
                    jsonReader.skipValue();
                    nextString = null;
                }
                a.j(nextString);
            }
            else if (nextName.equals("eventReasonId")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'eventReasonId' to null.");
                }
                a.U0(jsonReader.nextLong());
            }
            else if (nextName.equals("periodId")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'periodId' to null.");
                }
                a.y(jsonReader.nextLong());
            }
            else if (nextName.equals("synced")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'synced' to null.");
                }
                a.F(jsonReader.nextBoolean());
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
    
    public static OsObjectSchemaInfo P8() {
        return z1.U;
    }
    
    public static String Q8() {
        return "RealmEvent";
    }
    
    public static long R8(final f0 f0, final l4.a a, final Map<n0, Long> map) {
        if (a instanceof p && !p0.h8(a)) {
            final p p3 = (p)a;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(l4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(l4.a.class);
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
        Table.nativeSetLong(nativePtr, b.f, l, a.l(), false);
        Table.nativeSetLong(nativePtr, b.g, l, a.o(), false);
        Table.nativeSetLong(nativePtr, b.h, l, a.d1(), false);
        final String f2 = a.f();
        if (f2 != null) {
            Table.nativeSetString(nativePtr, b.i, l, f2, false);
        }
        Table.nativeSetLong(nativePtr, b.j, l, a.Q0(), false);
        Table.nativeSetLong(nativePtr, b.k, l, a.D(), false);
        Table.nativeSetBoolean(nativePtr, b.l, l, a.A(), false);
        return l;
    }
    
    public static void S8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(l4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(l4.a.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final l4.a a = (l4.a)iterator.next();
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
            Table.nativeSetLong(nativePtr, b.f, l, a.l(), false);
            Table.nativeSetLong(nativePtr, b.g, l, a.o(), false);
            Table.nativeSetLong(nativePtr, b.h, l, a.d1(), false);
            final String f2 = a.f();
            if (f2 != null) {
                Table.nativeSetString(nativePtr, b.i, l, f2, false);
            }
            Table.nativeSetLong(nativePtr, b.j, l, a.Q0(), false);
            Table.nativeSetLong(nativePtr, b.k, l, a.D(), false);
            Table.nativeSetBoolean(nativePtr, b.l, l, a.A(), false);
        }
    }
    
    public static long T8(final f0 f0, final l4.a a, final Map<n0, Long> map) {
        if (a instanceof p && !p0.h8(a)) {
            final p p3 = (p)a;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(l4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(l4.a.class);
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
        Table.nativeSetLong(nativePtr, b.f, rowWithPrimaryKey, a.l(), false);
        Table.nativeSetLong(nativePtr, b.g, rowWithPrimaryKey, a.o(), false);
        Table.nativeSetLong(nativePtr, b.h, rowWithPrimaryKey, a.d1(), false);
        final String f2 = a.f();
        final long i = b.i;
        if (f2 != null) {
            Table.nativeSetString(nativePtr, i, rowWithPrimaryKey, f2, false);
        }
        else {
            Table.nativeSetNull(nativePtr, i, rowWithPrimaryKey, false);
        }
        Table.nativeSetLong(nativePtr, b.j, rowWithPrimaryKey, a.Q0(), false);
        Table.nativeSetLong(nativePtr, b.k, rowWithPrimaryKey, a.D(), false);
        Table.nativeSetBoolean(nativePtr, b.l, rowWithPrimaryKey, a.A(), false);
        return rowWithPrimaryKey;
    }
    
    public static void U8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(l4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(l4.a.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final l4.a a = (l4.a)iterator.next();
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
            Table.nativeSetLong(nativePtr, b.f, rowWithPrimaryKey, a.l(), false);
            Table.nativeSetLong(nativePtr, b.g, rowWithPrimaryKey, a.o(), false);
            Table.nativeSetLong(nativePtr, b.h, rowWithPrimaryKey, a.d1(), false);
            final String f2 = a.f();
            final long i = b.i;
            if (f2 != null) {
                Table.nativeSetString(nativePtr, i, rowWithPrimaryKey, f2, false);
            }
            else {
                Table.nativeSetNull(nativePtr, i, rowWithPrimaryKey, false);
            }
            Table.nativeSetLong(nativePtr, b.j, rowWithPrimaryKey, a.Q0(), false);
            Table.nativeSetLong(nativePtr, b.k, rowWithPrimaryKey, a.D(), false);
            Table.nativeSetBoolean(nativePtr, b.l, rowWithPrimaryKey, a.A(), false);
        }
    }
    
    static z1 V8(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(l4.a.class), false, Collections.emptyList());
        final z1 z1 = new z1();
        h.a();
        return z1;
    }
    
    static l4.a W8(final f0 f0, final b b, final l4.a a, final l4.a a2, final Map<n0, p> map, final Set<q> set) {
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(l4.a.class), set);
        osObjectBuilder.L(b.e, a2.a());
        osObjectBuilder.K(b.f, a2.l());
        osObjectBuilder.L(b.g, a2.o());
        osObjectBuilder.L(b.h, a2.d1());
        osObjectBuilder.d0(b.i, a2.f());
        osObjectBuilder.L(b.j, a2.Q0());
        osObjectBuilder.L(b.k, a2.D());
        osObjectBuilder.n(b.l, a2.A());
        osObjectBuilder.i0();
        return a;
    }
    
    @Override
    public boolean A() {
        this.S.f().h();
        return this.S.g().l(this.R.l);
    }
    
    @Override
    public long D() {
        this.S.f().h();
        return this.S.g().m(this.R.k);
    }
    
    @Override
    public void F(final boolean b) {
        if (!this.S.i()) {
            this.S.f().h();
            this.S.g().i(this.R.l, b);
            return;
        }
        if (!this.S.d()) {
            return;
        }
        final r g = this.S.g();
        g.g().j0(this.R.l, g.l0(), b, true);
    }
    
    @Override
    public long Q0() {
        this.S.f().h();
        return this.S.g().m(this.R.j);
    }
    
    @Override
    public void Q5(final long n) {
        if (!this.S.i()) {
            this.S.f().h();
            this.S.g().s(this.R.h, n);
            return;
        }
        if (!this.S.d()) {
            return;
        }
        final r g = this.S.g();
        g.g().q0(this.R.h, g.l0(), n, true);
    }
    
    @Override
    public c0<?> S6() {
        return this.S;
    }
    
    @Override
    public void U0(final long n) {
        if (!this.S.i()) {
            this.S.f().h();
            this.S.g().s(this.R.j, n);
            return;
        }
        if (!this.S.d()) {
            return;
        }
        final r g = this.S.g();
        g.g().q0(this.R.j, g.l0(), n, true);
    }
    
    @Override
    public long a() {
        this.S.f().h();
        return this.S.g().m(this.R.e);
    }
    
    @Override
    public void b(final long n) {
        if (this.S.i()) {
            return;
        }
        this.S.f().h();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }
    
    @Override
    public long d1() {
        this.S.f().h();
        return this.S.g().m(this.R.h);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final z1 z1 = (z1)o;
        final io.realm.a f = this.S.f();
        final io.realm.a f2 = z1.S.f();
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
        final String m = this.S.g().g().M();
        final String i = z1.S.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.S.g().l0() == z1.S.g().l0();
            }
        }
        else if (i == null) {
            return this.S.g().l0() == z1.S.g().l0();
        }
        return false;
    }
    
    @Override
    public String f() {
        this.S.f().h();
        return this.S.g().U(this.R.i);
    }
    
    @Override
    public int hashCode() {
        final String path = this.S.f().getPath();
        final String m = this.S.g().g().M();
        final long l0 = this.S.g().l0();
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
    public void j(final String s) {
        if (this.S.i()) {
            if (!this.S.d()) {
                return;
            }
            final r g = this.S.g();
            if (s != null) {
                g.g().t0(this.R.i, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'text' to null.");
        }
        else {
            this.S.f().h();
            if (s != null) {
                this.S.g().d(this.R.i, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'text' to null.");
        }
    }
    
    @Override
    public void k(final int n) {
        if (!this.S.i()) {
            this.S.f().h();
            this.S.g().s(this.R.f, n);
            return;
        }
        if (!this.S.d()) {
            return;
        }
        final r g = this.S.g();
        g.g().q0(this.R.f, g.l0(), n, true);
    }
    
    @Override
    public int l() {
        this.S.f().h();
        return (int)this.S.g().m(this.R.f);
    }
    
    @Override
    public long o() {
        this.S.f().h();
        return this.S.g().m(this.R.g);
    }
    
    @Override
    public void p(final long n) {
        if (!this.S.i()) {
            this.S.f().h();
            this.S.g().s(this.R.g, n);
            return;
        }
        if (!this.S.d()) {
            return;
        }
        final r g = this.S.g();
        g.g().q0(this.R.g, g.l0(), n, true);
    }
    
    @Override
    public String toString() {
        if (!p0.k8(this)) {
            return "Invalid object";
        }
        final StringBuilder sb = new StringBuilder("RealmEvent = proxy[");
        sb.append("{id:");
        sb.append(this.a());
        sb.append("}");
        sb.append(",");
        sb.append("{entityType:");
        sb.append(this.l());
        sb.append("}");
        sb.append(",");
        sb.append("{entityId:");
        sb.append(this.o());
        sb.append("}");
        sb.append(",");
        sb.append("{dateTime:");
        sb.append(this.d1());
        sb.append("}");
        sb.append(",");
        sb.append("{text:");
        sb.append(this.f());
        sb.append("}");
        sb.append(",");
        sb.append("{eventReasonId:");
        sb.append(this.Q0());
        sb.append("}");
        sb.append(",");
        sb.append("{periodId:");
        sb.append(this.D());
        sb.append("}");
        sb.append(",");
        sb.append("{synced:");
        sb.append(this.A());
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
    
    @Override
    public void y(final long n) {
        if (!this.S.i()) {
            this.S.f().h();
            this.S.g().s(this.R.k, n);
            return;
        }
        if (!this.S.d()) {
            return;
        }
        final r g = this.S.g();
        g.g().q0(this.R.k, g.l0(), n, true);
    }
    
    @Override
    public void y4() {
        if (this.S != null) {
            return;
        }
        final io.realm.a.h h = io.realm.a.W.get();
        this.R = (b)h.c();
        (this.S = new c0<l4.a>(this)).r(h.e());
        this.S.s(h.f());
        this.S.o(h.b());
        this.S.q(h.d());
    }
    
    public static final class a
    {
        public static final String a = "RealmEvent";
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
        long l;
        
        b(final OsSchemaInfo osSchemaInfo) {
            super(8);
            final OsObjectSchemaInfo b = osSchemaInfo.b("RealmEvent");
            this.e = this.b("id", "id", b);
            this.f = this.b("entityType", "entityType", b);
            this.g = this.b("entityId", "entityId", b);
            this.h = this.b("dateTime", "dateTime", b);
            this.i = this.b("text", "text", b);
            this.j = this.b("eventReasonId", "eventReasonId", b);
            this.k = this.b("periodId", "periodId", b);
            this.l = this.b("synced", "synced", b);
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
            b2.l = b.l;
        }
    }
}
