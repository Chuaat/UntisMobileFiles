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
import java.util.ArrayList;
import org.json.JSONObject;
import io.realm.internal.OsSchemaInfo;
import java.util.Collections;
import r4.c;
import io.realm.internal.r;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Set;
import java.util.Map;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.p;
import r4.d;

public class b3 extends d implements p, c3
{
    private static final String T = "";
    private static final OsObjectSchemaInfo U;
    private b R;
    private c0<d> S;
    
    static {
        U = M8();
    }
    
    b3() {
        this.S.p();
    }
    
    public static d I8(final f0 f0, final b b, final d d, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        final b3 b3 = map.get(d);
        if (b3 != null) {
            return b3;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(d.class), set);
        osObjectBuilder.L(b.e, d.a());
        osObjectBuilder.d0(b.f, d.d());
        osObjectBuilder.d0(b.g, d.c());
        osObjectBuilder.d0(b.h, d.f());
        osObjectBuilder.L(b.i, d.J());
        osObjectBuilder.L(b.j, d.V0());
        osObjectBuilder.n(b.k, d.S());
        final b3 v8 = V8(f0, osObjectBuilder.f0());
        map.put(d, v8);
        final c w0 = d.w0();
        c d2;
        if (w0 == null) {
            d2 = null;
        }
        else {
            final c c = (c)map.get(w0);
            if (c != null) {
                v8.X1(c);
                return v8;
            }
            d2 = x2.D8(f0, (x2.b)f0.H().j(c.class), w0, b2, map, set);
        }
        v8.X1(d2);
        return v8;
    }
    
    public static d J8(final f0 f0, final b b, final d d, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        if (d instanceof p && !p0.h8(d)) {
            final p p6 = (p)d;
            if (p6.S6().f() != null) {
                final io.realm.a f2 = p6.S6().f();
                if (f2.H != f0.H) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
                if (f2.getPath().equals(f0.getPath())) {
                    return d;
                }
            }
        }
        final io.realm.a.h h = io.realm.a.W.get();
        final p p7 = map.get(d);
        if (p7 != null) {
            return (d)p7;
        }
        final p p8 = null;
        Object x2 = null;
        boolean b3 = false;
        Label_0232: {
            if (b2) {
                x2 = f0.x2(d.class);
                final long r = ((Table)x2).r(b.e, d.a());
                if (r == -1L) {
                    b3 = false;
                    x2 = p8;
                    break Label_0232;
                }
                try {
                    h.g(f0, ((Table)x2).R(r), b, false, Collections.emptyList());
                    x2 = new b3();
                    map.put(d, (p)x2);
                }
                finally {
                    h.a();
                }
            }
            b3 = b2;
        }
        d d2;
        if (b3) {
            d2 = W8(f0, b, (d)x2, d, map, set);
        }
        else {
            d2 = I8(f0, b, d, b2, map, set);
        }
        return d2;
    }
    
    public static b K8(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static d L8(final d d, final int a, final int n, final Map<n0, p.a<n0>> map) {
        if (a <= n && d != null) {
            final p.a a2 = map.get(d);
            d d2;
            if (a2 == null) {
                d2 = new d();
                map.put(d, (p.a<n0>)new p.a(a, d2));
            }
            else {
                if (a >= a2.a) {
                    return (d)a2.b;
                }
                d2 = (d)a2.b;
                a2.a = a;
            }
            d2.b(d.a());
            d2.v(d.d());
            d2.x(d.c());
            d2.j(d.f());
            d2.P(d.J());
            d2.T0(d.V0());
            d2.N(d.S());
            d2.X1(x2.F8(d.w0(), a + 1, n, map));
            return d2;
        }
        return null;
    }
    
    private static OsObjectSchemaInfo M8() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmClassLeadStudentAbsence", false, 8, 0);
        final RealmFieldType integer = RealmFieldType.INTEGER;
        b.c("", "id", integer, true, false, true);
        final RealmFieldType string = RealmFieldType.STRING;
        b.c("", "start", string, false, false, true);
        b.c("", "end", string, false, false, true);
        b.c("", "text", string, false, false, true);
        b.c("", "studentId", integer, false, false, true);
        b.c("", "absenceReasonId", integer, false, false, true);
        b.c("", "excused", RealmFieldType.BOOLEAN, false, false, true);
        b.b("", "excuse", RealmFieldType.OBJECT, "RealmClassLeadExcuse");
        return b.e();
    }
    
    public static d N8(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final ArrayList<String> list = new ArrayList<String>(1);
        Object x2 = null;
        Label_0146: {
            if (b) {
                x2 = f0.x2(d.class);
                final long e = ((b)f0.H().j(d.class)).e;
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
                        h.g(f0, ((Table)x2).R(r), f0.H().j(d.class), false, Collections.emptyList());
                        x2 = new b3();
                        break Label_0146;
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
            if (jsonObject.has("excuse")) {
                list.add("excuse");
            }
            if (!jsonObject.has("id")) {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
            b3 b2;
            if (jsonObject.isNull("id")) {
                b2 = f0.p1((Class<b3>)d.class, null, true, list);
            }
            else {
                b2 = f0.p1((Class<b3>)d.class, jsonObject.getLong("id"), true, list);
            }
            o = b2;
        }
        if (jsonObject.has("start")) {
            if (jsonObject.isNull("start")) {
                ((c3)o).v(null);
            }
            else {
                ((c3)o).v(jsonObject.getString("start"));
            }
        }
        if (jsonObject.has("end")) {
            if (jsonObject.isNull("end")) {
                ((c3)o).x(null);
            }
            else {
                ((c3)o).x(jsonObject.getString("end"));
            }
        }
        if (jsonObject.has("text")) {
            if (jsonObject.isNull("text")) {
                ((c3)o).j(null);
            }
            else {
                ((c3)o).j(jsonObject.getString("text"));
            }
        }
        if (jsonObject.has("studentId")) {
            if (jsonObject.isNull("studentId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'studentId' to null.");
            }
            ((c3)o).P(jsonObject.getLong("studentId"));
        }
        if (jsonObject.has("absenceReasonId")) {
            if (jsonObject.isNull("absenceReasonId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'absenceReasonId' to null.");
            }
            ((c3)o).T0(jsonObject.getLong("absenceReasonId"));
        }
        if (jsonObject.has("excused")) {
            if (jsonObject.isNull("excused")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'excused' to null.");
            }
            ((c3)o).N(jsonObject.getBoolean("excused"));
        }
        if (jsonObject.has("excuse")) {
            if (jsonObject.isNull("excuse")) {
                ((c3)o).X1(null);
            }
            else {
                ((c3)o).X1(io.realm.x2.H8(f0, jsonObject.getJSONObject("excuse"), b));
            }
        }
        return (d)o;
    }
    
    @TargetApi(11)
    public static d O8(final f0 f0, final JsonReader jsonReader) throws IOException {
        final d d = new d();
        jsonReader.beginObject();
        boolean b = false;
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
                d.b(jsonReader.nextLong());
                b = true;
            }
            else if (nextName.equals("start")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    d.v(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    d.v(null);
                }
            }
            else if (nextName.equals("end")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    d.x(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    d.x(null);
                }
            }
            else if (nextName.equals("text")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    d.j(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    d.j(null);
                }
            }
            else if (nextName.equals("studentId")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'studentId' to null.");
                }
                d.P(jsonReader.nextLong());
            }
            else if (nextName.equals("absenceReasonId")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'absenceReasonId' to null.");
                }
                d.T0(jsonReader.nextLong());
            }
            else if (nextName.equals("excused")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'excused' to null.");
                }
                d.N(jsonReader.nextBoolean());
            }
            else if (nextName.equals("excuse")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    d.X1(null);
                }
                else {
                    d.X1(x2.I8(f0, jsonReader));
                }
            }
            else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (b) {
            return f0.G0(d, new q[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }
    
    public static OsObjectSchemaInfo P8() {
        return b3.U;
    }
    
    public static String Q8() {
        return "RealmClassLeadStudentAbsence";
    }
    
    public static long R8(final f0 f0, final d d, final Map<n0, Long> map) {
        if (d instanceof p && !p0.h8(d)) {
            final p p3 = (p)d;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(d.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(d.class);
        final long e = b.e;
        final Long value = d.a();
        long l;
        if (value != null) {
            l = Table.nativeFindFirstInt(nativePtr, e, d.a());
        }
        else {
            l = -1L;
        }
        if (l == -1L) {
            l = OsObject.createRowWithPrimaryKey(x2, e, d.a());
        }
        else {
            Table.v0(value);
        }
        map.put(d, l);
        final String d2 = d.d();
        if (d2 != null) {
            Table.nativeSetString(nativePtr, b.f, l, d2, false);
        }
        final String c = d.c();
        if (c != null) {
            Table.nativeSetString(nativePtr, b.g, l, c, false);
        }
        final String f2 = d.f();
        if (f2 != null) {
            Table.nativeSetString(nativePtr, b.h, l, f2, false);
        }
        Table.nativeSetLong(nativePtr, b.i, l, d.J(), false);
        Table.nativeSetLong(nativePtr, b.j, l, d.V0(), false);
        Table.nativeSetBoolean(nativePtr, b.k, l, d.S(), false);
        final c w0 = d.w0();
        if (w0 != null) {
            Long value2;
            if ((value2 = map.get(w0)) == null) {
                value2 = io.realm.x2.L8(f0, w0, map);
            }
            Table.nativeSetLink(nativePtr, b.l, l, value2, false);
        }
        return l;
    }
    
    public static void S8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(d.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(d.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final d d = (d)iterator.next();
            if (map.containsKey(d)) {
                continue;
            }
            if (d instanceof p && !p0.h8(d)) {
                final p p3 = (p)d;
                if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                    map.put(d, p3.S6().g().l0());
                    continue;
                }
            }
            final Long value = d.a();
            long l;
            if (value != null) {
                l = Table.nativeFindFirstInt(nativePtr, e, d.a());
            }
            else {
                l = -1L;
            }
            if (l == -1L) {
                l = OsObject.createRowWithPrimaryKey(x2, e, d.a());
            }
            else {
                Table.v0(value);
            }
            map.put(d, l);
            final String d2 = d.d();
            if (d2 != null) {
                Table.nativeSetString(nativePtr, b.f, l, d2, false);
            }
            final String c = d.c();
            if (c != null) {
                Table.nativeSetString(nativePtr, b.g, l, c, false);
            }
            final String f2 = d.f();
            if (f2 != null) {
                Table.nativeSetString(nativePtr, b.h, l, f2, false);
            }
            Table.nativeSetLong(nativePtr, b.i, l, d.J(), false);
            Table.nativeSetLong(nativePtr, b.j, l, d.V0(), false);
            Table.nativeSetBoolean(nativePtr, b.k, l, d.S(), false);
            final c w0 = d.w0();
            if (w0 == null) {
                continue;
            }
            Long value2;
            if ((value2 = map.get(w0)) == null) {
                value2 = io.realm.x2.L8(f0, w0, map);
            }
            x2.p0(b.l, l, value2, false);
        }
    }
    
    public static long T8(final f0 f0, final d d, final Map<n0, Long> map) {
        if (d instanceof p && !p0.h8(d)) {
            final p p3 = (p)d;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(d.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(d.class);
        final long e = b.e;
        long nativeFindFirstInt;
        if (Long.valueOf(d.a()) != null) {
            nativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, e, d.a());
        }
        else {
            nativeFindFirstInt = -1L;
        }
        long rowWithPrimaryKey = nativeFindFirstInt;
        if (nativeFindFirstInt == -1L) {
            rowWithPrimaryKey = OsObject.createRowWithPrimaryKey(x2, e, d.a());
        }
        map.put(d, rowWithPrimaryKey);
        final String d2 = d.d();
        final long f2 = b.f;
        if (d2 != null) {
            Table.nativeSetString(nativePtr, f2, rowWithPrimaryKey, d2, false);
        }
        else {
            Table.nativeSetNull(nativePtr, f2, rowWithPrimaryKey, false);
        }
        final String c = d.c();
        final long g = b.g;
        if (c != null) {
            Table.nativeSetString(nativePtr, g, rowWithPrimaryKey, c, false);
        }
        else {
            Table.nativeSetNull(nativePtr, g, rowWithPrimaryKey, false);
        }
        final String f3 = d.f();
        final long h = b.h;
        if (f3 != null) {
            Table.nativeSetString(nativePtr, h, rowWithPrimaryKey, f3, false);
        }
        else {
            Table.nativeSetNull(nativePtr, h, rowWithPrimaryKey, false);
        }
        Table.nativeSetLong(nativePtr, b.i, rowWithPrimaryKey, d.J(), false);
        Table.nativeSetLong(nativePtr, b.j, rowWithPrimaryKey, d.V0(), false);
        Table.nativeSetBoolean(nativePtr, b.k, rowWithPrimaryKey, d.S(), false);
        final c w0 = d.w0();
        if (w0 != null) {
            Long value;
            if ((value = map.get(w0)) == null) {
                value = io.realm.x2.N8(f0, w0, map);
            }
            Table.nativeSetLink(nativePtr, b.l, rowWithPrimaryKey, value, false);
        }
        else {
            Table.nativeNullifyLink(nativePtr, b.l, rowWithPrimaryKey);
        }
        return rowWithPrimaryKey;
    }
    
    public static void U8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(d.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(d.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final d d = (d)iterator.next();
            if (map.containsKey(d)) {
                continue;
            }
            if (d instanceof p && !p0.h8(d)) {
                final p p3 = (p)d;
                if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                    map.put(d, p3.S6().g().l0());
                    continue;
                }
            }
            long nativeFindFirstInt;
            if (Long.valueOf(d.a()) != null) {
                nativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, e, d.a());
            }
            else {
                nativeFindFirstInt = -1L;
            }
            long rowWithPrimaryKey = nativeFindFirstInt;
            if (nativeFindFirstInt == -1L) {
                rowWithPrimaryKey = OsObject.createRowWithPrimaryKey(x2, e, d.a());
            }
            map.put(d, rowWithPrimaryKey);
            final String d2 = d.d();
            if (d2 != null) {
                Table.nativeSetString(nativePtr, b.f, rowWithPrimaryKey, d2, false);
            }
            else {
                Table.nativeSetNull(nativePtr, b.f, rowWithPrimaryKey, false);
            }
            final String c = d.c();
            final long g = b.g;
            if (c != null) {
                Table.nativeSetString(nativePtr, g, rowWithPrimaryKey, c, false);
            }
            else {
                Table.nativeSetNull(nativePtr, g, rowWithPrimaryKey, false);
            }
            final String f2 = d.f();
            final long h = b.h;
            if (f2 != null) {
                Table.nativeSetString(nativePtr, h, rowWithPrimaryKey, f2, false);
            }
            else {
                Table.nativeSetNull(nativePtr, h, rowWithPrimaryKey, false);
            }
            Table.nativeSetLong(nativePtr, b.i, rowWithPrimaryKey, d.J(), false);
            Table.nativeSetLong(nativePtr, b.j, rowWithPrimaryKey, d.V0(), false);
            Table.nativeSetBoolean(nativePtr, b.k, rowWithPrimaryKey, d.S(), false);
            final c w0 = d.w0();
            if (w0 != null) {
                Long value;
                if ((value = map.get(w0)) == null) {
                    value = io.realm.x2.N8(f0, w0, map);
                }
                Table.nativeSetLink(nativePtr, b.l, rowWithPrimaryKey, value, false);
            }
            else {
                Table.nativeNullifyLink(nativePtr, b.l, rowWithPrimaryKey);
            }
        }
    }
    
    static b3 V8(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(d.class), false, Collections.emptyList());
        final b3 b3 = new b3();
        h.a();
        return b3;
    }
    
    static d W8(final f0 f0, final b b, final d d, final d d2, final Map<n0, p> map, final Set<q> set) {
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(d.class), set);
        osObjectBuilder.L(b.e, d2.a());
        osObjectBuilder.d0(b.f, d2.d());
        osObjectBuilder.d0(b.g, d2.c());
        osObjectBuilder.d0(b.h, d2.f());
        osObjectBuilder.L(b.i, d2.J());
        osObjectBuilder.L(b.j, d2.V0());
        osObjectBuilder.n(b.k, d2.S());
        final c w0 = d2.w0();
        if (w0 == null) {
            osObjectBuilder.V(b.l);
        }
        else {
            final c c = (c)map.get(w0);
            if (c != null) {
                osObjectBuilder.W(b.l, c);
            }
            else {
                osObjectBuilder.W(b.l, x2.D8(f0, (x2.b)f0.H().j(c.class), w0, true, map, set));
            }
        }
        osObjectBuilder.i0();
        return d;
    }
    
    @Override
    public long J() {
        this.S.f().h();
        return this.S.g().m(this.R.i);
    }
    
    @Override
    public void N(final boolean b) {
        if (!this.S.i()) {
            this.S.f().h();
            this.S.g().i(this.R.k, b);
            return;
        }
        if (!this.S.d()) {
            return;
        }
        final r g = this.S.g();
        g.g().j0(this.R.k, g.l0(), b, true);
    }
    
    @Override
    public void P(final long n) {
        if (!this.S.i()) {
            this.S.f().h();
            this.S.g().s(this.R.i, n);
            return;
        }
        if (!this.S.d()) {
            return;
        }
        final r g = this.S.g();
        g.g().q0(this.R.i, g.l0(), n, true);
    }
    
    @Override
    public boolean S() {
        this.S.f().h();
        return this.S.g().l(this.R.k);
    }
    
    @Override
    public c0<?> S6() {
        return this.S;
    }
    
    @Override
    public void T0(final long n) {
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
    public long V0() {
        this.S.f().h();
        return this.S.g().m(this.R.j);
    }
    
    @Override
    public void X1(final c c) {
        final f0 f0 = (f0)this.S.f();
        if (this.S.i()) {
            if (!this.S.d()) {
                return;
            }
            if (this.S.e().contains("excuse")) {
                return;
            }
            c c2;
            if ((c2 = c) != null) {
                c2 = c;
                if (!p0.j8(c)) {
                    c2 = f0.G0(c, new q[0]);
                }
            }
            final r g = this.S.g();
            if (c2 == null) {
                g.z(this.R.l);
                return;
            }
            this.S.c(c2);
            g.g().p0(this.R.l, g.l0(), ((p)c2).S6().g().l0(), true);
        }
        else {
            this.S.f().h();
            if (c == null) {
                this.S.g().z(this.R.l);
                return;
            }
            this.S.c(c);
            this.S.g().o(this.R.l, ((p)c).S6().g().l0());
        }
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
    public String c() {
        this.S.f().h();
        return this.S.g().U(this.R.g);
    }
    
    @Override
    public String d() {
        this.S.f().h();
        return this.S.g().U(this.R.f);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final b3 b3 = (b3)o;
        final io.realm.a f = this.S.f();
        final io.realm.a f2 = b3.S.f();
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
        final String i = b3.S.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.S.g().l0() == b3.S.g().l0();
            }
        }
        else if (i == null) {
            return this.S.g().l0() == b3.S.g().l0();
        }
        return false;
    }
    
    @Override
    public String f() {
        this.S.f().h();
        return this.S.g().U(this.R.h);
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
                g.g().t0(this.R.h, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'text' to null.");
        }
        else {
            this.S.f().h();
            if (s != null) {
                this.S.g().d(this.R.h, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'text' to null.");
        }
    }
    
    @Override
    public String toString() {
        if (!p0.k8(this)) {
            return "Invalid object";
        }
        final StringBuilder sb = new StringBuilder("RealmClassLeadStudentAbsence = proxy[");
        sb.append("{id:");
        sb.append(this.a());
        sb.append("}");
        sb.append(",");
        sb.append("{start:");
        sb.append(this.d());
        sb.append("}");
        sb.append(",");
        sb.append("{end:");
        sb.append(this.c());
        sb.append("}");
        sb.append(",");
        sb.append("{text:");
        sb.append(this.f());
        sb.append("}");
        sb.append(",");
        sb.append("{studentId:");
        sb.append(this.J());
        sb.append("}");
        sb.append(",");
        sb.append("{absenceReasonId:");
        sb.append(this.V0());
        sb.append("}");
        sb.append(",");
        sb.append("{excused:");
        sb.append(this.S());
        sb.append("}");
        sb.append(",");
        sb.append("{excuse:");
        String str;
        if (this.w0() != null) {
            str = "RealmClassLeadExcuse";
        }
        else {
            str = "null";
        }
        sb.append(str);
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
    
    @Override
    public void v(final String s) {
        if (this.S.i()) {
            if (!this.S.d()) {
                return;
            }
            final r g = this.S.g();
            if (s != null) {
                g.g().t0(this.R.f, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'start' to null.");
        }
        else {
            this.S.f().h();
            if (s != null) {
                this.S.g().d(this.R.f, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'start' to null.");
        }
    }
    
    @Override
    public c w0() {
        this.S.f().h();
        if (this.S.g().G(this.R.l)) {
            return null;
        }
        return this.S.f().x(c.class, this.S.g().P(this.R.l), false, Collections.emptyList());
    }
    
    @Override
    public void x(final String s) {
        if (this.S.i()) {
            if (!this.S.d()) {
                return;
            }
            final r g = this.S.g();
            if (s != null) {
                g.g().t0(this.R.g, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'end' to null.");
        }
        else {
            this.S.f().h();
            if (s != null) {
                this.S.g().d(this.R.g, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'end' to null.");
        }
    }
    
    @Override
    public void y4() {
        if (this.S != null) {
            return;
        }
        final io.realm.a.h h = io.realm.a.W.get();
        this.R = (b)h.c();
        (this.S = new c0<d>(this)).r(h.e());
        this.S.s(h.f());
        this.S.o(h.b());
        this.S.q(h.d());
    }
    
    public static final class a
    {
        public static final String a = "RealmClassLeadStudentAbsence";
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
            final OsObjectSchemaInfo b = osSchemaInfo.b("RealmClassLeadStudentAbsence");
            this.e = this.b("id", "id", b);
            this.f = this.b("start", "start", b);
            this.g = this.b("end", "end", b);
            this.h = this.b("text", "text", b);
            this.i = this.b("studentId", "studentId", b);
            this.j = this.b("absenceReasonId", "absenceReasonId", b);
            this.k = this.b("excused", "excused", b);
            this.l = this.b("excuse", "excuse", b);
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
