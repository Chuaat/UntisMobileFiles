// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import io.realm.internal.OsSchemaInfo;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Set;
import java.util.Collections;
import io.realm.internal.r;
import java.util.Iterator;
import io.realm.internal.OsList;
import io.realm.internal.Table;
import io.realm.internal.OsObject;
import java.util.Map;
import android.annotation.TargetApi;
import java.io.IOException;
import android.util.JsonToken;
import android.util.JsonReader;
import org.json.JSONException;
import org.json.JSONArray;
import java.util.List;
import java.util.ArrayList;
import org.json.JSONObject;
import b5.c;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.p;
import b5.b;

public class p5 extends b5.b implements p, q5
{
    private static final String O = "";
    private static final OsObjectSchemaInfo P;
    private b L;
    private c0<b5.b> M;
    private l0<c> N;
    
    static {
        P = A8();
    }
    
    p5() {
        this.M.p();
    }
    
    private static OsObjectSchemaInfo A8() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmTimeGridDay", false, 2, 0);
        b.c("", "weekday", RealmFieldType.INTEGER, false, false, true);
        b.b("", "units", RealmFieldType.LIST, "RealmTimeGridUnit");
        return b.e();
    }
    
    public static b5.b B8(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final ArrayList<String> list = new ArrayList<String>(1);
        if (jsonObject.has("units")) {
            list.add("units");
        }
        final b5.b b2 = f0.q1(b5.b.class, true, list);
        if (jsonObject.has("weekday")) {
            if (jsonObject.isNull("weekday")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'weekday' to null.");
            }
            b2.d2(jsonObject.getInt("weekday"));
        }
        if (jsonObject.has("units")) {
            if (jsonObject.isNull("units")) {
                b2.i2(null);
            }
            else {
                b2.O1().clear();
                final JSONArray jsonArray = jsonObject.getJSONArray("units");
                for (int i = 0; i < jsonArray.length(); ++i) {
                    b2.O1().add(t5.D8(f0, jsonArray.getJSONObject(i), b));
                }
            }
        }
        return b2;
    }
    
    @TargetApi(11)
    public static b5.b C8(final f0 f0, final JsonReader jsonReader) throws IOException {
        final b5.b b = new b5.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            if (nextName.equals("weekday")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'weekday' to null.");
                }
                b.d2(jsonReader.nextInt());
            }
            else if (nextName.equals("units")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    b.i2(null);
                }
                else {
                    b.i2(new l0<c>());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        b.O1().add(t5.E8(f0, jsonReader));
                    }
                    jsonReader.endArray();
                }
            }
            else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return f0.y0(b, new q[0]);
    }
    
    public static OsObjectSchemaInfo D8() {
        return p5.P;
    }
    
    public static String E8() {
        return "RealmTimeGridDay";
    }
    
    public static long F8(final f0 f0, final b5.b b, final Map<n0, Long> map) {
        if (b instanceof p && !p0.h8(b)) {
            final p p3 = (p)b;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(b5.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b2 = (b)f0.H().j(b5.b.class);
        final long row = OsObject.createRow(x2);
        map.put(b, row);
        Table.nativeSetLong(nativePtr, b2.e, row, b.E5(), false);
        final l0<c> o1 = b.O1();
        if (o1 != null) {
            final OsList list = new OsList(x2.R(row), b2.f);
            for (final c c : o1) {
                Long value;
                if ((value = map.get(c)) == null) {
                    value = t5.H8(f0, c, map);
                }
                list.l(value);
            }
        }
        return row;
    }
    
    public static void G8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(b5.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(b5.b.class);
        while (iterator.hasNext()) {
            final b5.b b2 = (b5.b)iterator.next();
            if (map.containsKey(b2)) {
                continue;
            }
            if (b2 instanceof p && !p0.h8(b2)) {
                final p p3 = (p)b2;
                if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                    map.put(b2, p3.S6().g().l0());
                    continue;
                }
            }
            final long row = OsObject.createRow(x2);
            map.put(b2, row);
            Table.nativeSetLong(nativePtr, b.e, row, b2.E5(), false);
            final l0<c> o1 = b2.O1();
            if (o1 == null) {
                continue;
            }
            final OsList list = new OsList(x2.R(row), b.f);
            for (final c c : o1) {
                Long value;
                if ((value = map.get(c)) == null) {
                    value = t5.H8(f0, c, map);
                }
                list.l(value);
            }
        }
    }
    
    public static long H8(final f0 f0, final b5.b b, final Map<n0, Long> map) {
        if (b instanceof p && !p0.h8(b)) {
            final p p3 = (p)b;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(b5.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b2 = (b)f0.H().j(b5.b.class);
        final long row = OsObject.createRow(x2);
        map.put(b, row);
        Table.nativeSetLong(nativePtr, b2.e, row, b.E5(), false);
        final OsList list = new OsList(x2.R(row), b2.f);
        final l0<c> o1 = b.O1();
        if (o1 != null && o1.size() == list.b0()) {
            for (int size = o1.size(), i = 0; i < size; ++i) {
                final c c = o1.get(i);
                Long value;
                if ((value = map.get(c)) == null) {
                    value = t5.J8(f0, c, map);
                }
                list.Z(i, value);
            }
        }
        else {
            list.M();
            if (o1 != null) {
                for (final c c2 : o1) {
                    Long value2;
                    if ((value2 = map.get(c2)) == null) {
                        value2 = t5.J8(f0, c2, map);
                    }
                    list.l(value2);
                }
            }
        }
        return row;
    }
    
    public static void I8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(b5.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(b5.b.class);
        while (iterator.hasNext()) {
            final b5.b b2 = (b5.b)iterator.next();
            if (map.containsKey(b2)) {
                continue;
            }
            if (b2 instanceof p && !p0.h8(b2)) {
                final p p3 = (p)b2;
                if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                    map.put(b2, p3.S6().g().l0());
                    continue;
                }
            }
            final long row = OsObject.createRow(x2);
            map.put(b2, row);
            Table.nativeSetLong(nativePtr, b.e, row, b2.E5(), false);
            final OsList list = new OsList(x2.R(row), b.f);
            final l0<c> o1 = b2.O1();
            if (o1 != null && o1.size() == list.b0()) {
                for (int size = o1.size(), i = 0; i < size; ++i) {
                    final c c = o1.get(i);
                    Long value;
                    if ((value = map.get(c)) == null) {
                        value = t5.J8(f0, c, map);
                    }
                    list.Z(i, value);
                }
            }
            else {
                list.M();
                if (o1 == null) {
                    continue;
                }
                for (final c c2 : o1) {
                    Long value2;
                    if ((value2 = map.get(c2)) == null) {
                        value2 = t5.J8(f0, c2, map);
                    }
                    list.l(value2);
                }
            }
        }
    }
    
    static p5 J8(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(b5.b.class), false, Collections.emptyList());
        final p5 p2 = new p5();
        h.a();
        return p2;
    }
    
    public static b5.b w8(final f0 f0, final b b, final b5.b b2, final boolean b3, final Map<n0, p> map, final Set<q> set) {
        final p5 p6 = map.get(b2);
        if (p6 != null) {
            return p6;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(b5.b.class), set);
        osObjectBuilder.K(b.e, b2.E5());
        final p5 j8 = J8(f0, osObjectBuilder.f0());
        map.put(b2, j8);
        final l0<c> o1 = b2.O1();
        if (o1 != null) {
            final l0<c> o2 = j8.O1();
            o2.clear();
            for (int i = 0; i < o1.size(); ++i) {
                final c c = o1.get(i);
                c z8 = (c)map.get(c);
                if (z8 == null) {
                    z8 = t5.z8(f0, (t5.b)f0.H().j(c.class), c, b3, map, set);
                }
                o2.add(z8);
            }
        }
        return j8;
    }
    
    public static b5.b x8(final f0 f0, final b b, final b5.b b2, final boolean b3, final Map<n0, p> map, final Set<q> set) {
        if (b2 instanceof p && !p0.h8(b2)) {
            final p p6 = (p)b2;
            if (p6.S6().f() != null) {
                final io.realm.a f2 = p6.S6().f();
                if (f2.H != f0.H) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
                if (f2.getPath().equals(f0.getPath())) {
                    return b2;
                }
            }
        }
        final io.realm.a.h h = io.realm.a.W.get();
        final p p7 = map.get(b2);
        if (p7 != null) {
            return (b5.b)p7;
        }
        return w8(f0, b, b2, b3, map, set);
    }
    
    public static b y8(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static b5.b z8(final b5.b b, final int a, final int n, final Map<n0, p.a<n0>> map) {
        if (a <= n && b != null) {
            final p.a a2 = map.get(b);
            b5.b b2;
            if (a2 == null) {
                b2 = new b5.b();
                map.put(b, (p.a<n0>)new p.a(a, b2));
            }
            else {
                if (a >= a2.a) {
                    return (b5.b)a2.b;
                }
                b2 = (b5.b)a2.b;
                a2.a = a;
            }
            b2.d2(b.E5());
            if (a == n) {
                b2.i2(null);
            }
            else {
                final l0<c> o1 = b.O1();
                final l0<c> l0 = new l0<c>();
                b2.i2(l0);
                for (int size = o1.size(), i = 0; i < size; ++i) {
                    l0.add(t5.B8(o1.get(i), a + 1, n, map));
                }
            }
            return b2;
        }
        return null;
    }
    
    @Override
    public int E5() {
        this.M.f().h();
        return (int)this.M.g().m(this.L.e);
    }
    
    @Override
    public l0<c> O1() {
        this.M.f().h();
        final l0<c> n = this.N;
        if (n != null) {
            return n;
        }
        return this.N = new l0<c>(c.class, this.M.g().p(this.L.f), this.M.f());
    }
    
    @Override
    public c0<?> S6() {
        return this.M;
    }
    
    @Override
    public void d2(final int n) {
        if (!this.M.i()) {
            this.M.f().h();
            this.M.g().s(this.L.e, n);
            return;
        }
        if (!this.M.d()) {
            return;
        }
        final r g = this.M.g();
        g.g().q0(this.L.e, g.l0(), n, true);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final p5 p = (p5)o;
        final io.realm.a f = this.M.f();
        final io.realm.a f2 = p.M.f();
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
        final String m = this.M.g().g().M();
        final String i = p.M.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.M.g().l0() == p.M.g().l0();
            }
        }
        else if (i == null) {
            return this.M.g().l0() == p.M.g().l0();
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final String path = this.M.f().getPath();
        final String m = this.M.g().g().M();
        final long l0 = this.M.g().l0();
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
    public void i2(final l0<c> l0) {
        final boolean i = this.M.i();
        final int n = 0;
        int j = 0;
        l0<c> l2 = l0;
        if (i) {
            if (!this.M.d()) {
                return;
            }
            if (this.M.e().contains("units")) {
                return;
            }
            if ((l2 = l0) != null) {
                l2 = l0;
                if (!l0.G0()) {
                    final f0 f0 = (f0)this.M.f();
                    l2 = new l0<c>();
                    for (final c c : l0) {
                        c c2;
                        if ((c2 = c) != null) {
                            if (p0.j8(c)) {
                                c2 = c;
                            }
                            else {
                                c2 = f0.y0(c, new q[0]);
                            }
                        }
                        l2.add(c2);
                    }
                }
            }
        }
        this.M.f().h();
        final OsList p = this.M.g().p(this.L.f);
        if (l2 != null && l2.size() == p.b0()) {
            while (j < l2.size()) {
                final c c3 = l2.get(j);
                this.M.c(c3);
                p.Z(j, ((p)c3).S6().g().l0());
                ++j;
            }
        }
        else {
            p.M();
            if (l2 == null) {
                return;
            }
            for (int size = l2.size(), k = n; k < size; ++k) {
                final c c4 = l2.get(k);
                this.M.c(c4);
                p.l(((p)c4).S6().g().l0());
            }
        }
    }
    
    @Override
    public String toString() {
        if (!p0.k8(this)) {
            return "Invalid object";
        }
        final StringBuilder sb = new StringBuilder("RealmTimeGridDay = proxy[");
        sb.append("{weekday:");
        sb.append(this.E5());
        sb.append("}");
        sb.append(",");
        sb.append("{units:");
        sb.append("RealmList<RealmTimeGridUnit>[");
        sb.append(this.O1().size());
        sb.append("]");
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
    
    @Override
    public void y4() {
        if (this.M != null) {
            return;
        }
        final io.realm.a.h h = io.realm.a.W.get();
        this.L = (b)h.c();
        (this.M = new c0<b5.b>(this)).r(h.e());
        this.M.s(h.f());
        this.M.o(h.b());
        this.M.q(h.d());
    }
    
    public static final class a
    {
        public static final String a = "RealmTimeGridDay";
    }
    
    static final class b extends c
    {
        long e;
        long f;
        
        b(final OsSchemaInfo osSchemaInfo) {
            super(2);
            final OsObjectSchemaInfo b = osSchemaInfo.b("RealmTimeGridDay");
            this.e = this.b("weekday", "weekday", b);
            this.f = this.b("units", "units", b);
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
        }
    }
}
