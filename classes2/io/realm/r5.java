// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import io.realm.exceptions.RealmException;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.c;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Set;
import java.util.Iterator;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.Table;
import java.util.Map;
import android.annotation.TargetApi;
import java.io.IOException;
import android.util.JsonToken;
import android.util.JsonReader;
import org.json.JSONException;
import org.json.JSONArray;
import java.util.List;
import io.realm.internal.r;
import java.util.Collections;
import java.util.ArrayList;
import org.json.JSONObject;
import b5.b;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.p;
import b5.a;

public class r5 extends b5.a implements p, s5
{
    private static final String O = "";
    private static final OsObjectSchemaInfo P;
    private b L;
    private c0<b5.a> M;
    private l0<b5.b> N;
    
    static {
        P = A8();
    }
    
    r5() {
        this.M.p();
    }
    
    private static OsObjectSchemaInfo A8() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmTimeGrid", false, 2, 0);
        b.c("", "id", RealmFieldType.INTEGER, true, false, true);
        b.b("", "days", RealmFieldType.LIST, "RealmTimeGridDay");
        return b.e();
    }
    
    public static b5.a B8(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final ArrayList<String> list = new ArrayList<String>(1);
        Object x2 = null;
        Label_0144: {
            if (b) {
                x2 = f0.x2(b5.a.class);
                final long e = ((b)f0.H().j(b5.a.class)).e;
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
                        h.g(f0, ((Table)x2).R(r), f0.H().j(b5.a.class), false, Collections.emptyList());
                        x2 = new r5();
                        break Label_0144;
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
            if (jsonObject.has("days")) {
                list.add("days");
            }
            if (!jsonObject.has("id")) {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
            r5 r2;
            if (jsonObject.isNull("id")) {
                r2 = f0.p1((Class<r5>)b5.a.class, null, true, list);
            }
            else {
                r2 = f0.p1((Class<r5>)b5.a.class, jsonObject.getLong("id"), true, list);
            }
            o = r2;
        }
        if (jsonObject.has("days")) {
            if (jsonObject.isNull("days")) {
                ((s5)o).p2(null);
            }
            else {
                ((s5)o).P7().clear();
                final JSONArray jsonArray = jsonObject.getJSONArray("days");
                for (int i = 0; i < jsonArray.length(); ++i) {
                    ((s5)o).P7().add(p5.B8(f0, jsonArray.getJSONObject(i), b));
                }
            }
        }
        return (b5.a)o;
    }
    
    @TargetApi(11)
    public static b5.a C8(final f0 f0, final JsonReader jsonReader) throws IOException {
        final b5.a a = new b5.a();
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
            else if (nextName.equals("days")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    a.p2(null);
                }
                else {
                    a.p2(new l0<b5.b>());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        a.P7().add(p5.C8(f0, jsonReader));
                    }
                    jsonReader.endArray();
                }
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
    
    public static OsObjectSchemaInfo D8() {
        return r5.P;
    }
    
    public static String E8() {
        return "RealmTimeGrid";
    }
    
    public static long F8(final f0 f0, final b5.a a, final Map<n0, Long> map) {
        if (a instanceof p && !p0.h8(a)) {
            final p p3 = (p)a;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(b5.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(b5.a.class);
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
        final l0<b5.b> p4 = a.P7();
        if (p4 != null) {
            final OsList list = new OsList(x2.R(l), b.f);
            for (final b5.b b2 : p4) {
                Long value2;
                if ((value2 = map.get(b2)) == null) {
                    value2 = p5.F8(f0, b2, map);
                }
                list.l(value2);
            }
        }
        return l;
    }
    
    public static void G8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(b5.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(b5.a.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final b5.a a = (b5.a)iterator.next();
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
            final l0<b5.b> p4 = a.P7();
            if (p4 == null) {
                continue;
            }
            final OsList list = new OsList(x2.R(l), b.f);
            for (final b5.b b2 : p4) {
                Long value2;
                if ((value2 = map.get(b2)) == null) {
                    value2 = p5.F8(f0, b2, map);
                }
                list.l(value2);
            }
        }
    }
    
    public static long H8(final f0 f0, final b5.a a, final Map<n0, Long> map) {
        if (a instanceof p && !p0.h8(a)) {
            final p p3 = (p)a;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(b5.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(b5.a.class);
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
        final OsList list = new OsList(x2.R(rowWithPrimaryKey), b.f);
        final l0<b5.b> p4 = a.P7();
        if (p4 != null && p4.size() == list.b0()) {
            for (int size = p4.size(), i = 0; i < size; ++i) {
                final b5.b b2 = p4.get(i);
                Long value;
                if ((value = map.get(b2)) == null) {
                    value = p5.H8(f0, b2, map);
                }
                list.Z(i, value);
            }
        }
        else {
            list.M();
            if (p4 != null) {
                for (final b5.b b3 : p4) {
                    Long value2;
                    if ((value2 = map.get(b3)) == null) {
                        value2 = p5.H8(f0, b3, map);
                    }
                    list.l(value2);
                }
            }
        }
        return rowWithPrimaryKey;
    }
    
    public static void I8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(b5.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(b5.a.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final b5.a a = (b5.a)iterator.next();
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
            final OsList list = new OsList(x2.R(rowWithPrimaryKey), b.f);
            final l0<b5.b> p4 = a.P7();
            if (p4 != null && p4.size() == list.b0()) {
                for (int size = p4.size(), i = 0; i < size; ++i) {
                    final b5.b b2 = p4.get(i);
                    Long value;
                    if ((value = map.get(b2)) == null) {
                        value = p5.H8(f0, b2, map);
                    }
                    list.Z(i, value);
                }
            }
            else {
                list.M();
                if (p4 == null) {
                    continue;
                }
                for (final b5.b b3 : p4) {
                    Long value2;
                    if ((value2 = map.get(b3)) == null) {
                        value2 = p5.H8(f0, b3, map);
                    }
                    list.l(value2);
                }
            }
        }
    }
    
    static r5 J8(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(b5.a.class), false, Collections.emptyList());
        final r5 r2 = new r5();
        h.a();
        return r2;
    }
    
    static b5.a K8(final f0 f0, final b b, final b5.a a, final b5.a a2, final Map<n0, p> map, final Set<q> set) {
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(b5.a.class), set);
        osObjectBuilder.L(b.e, a2.a());
        final l0<b5.b> p6 = a2.P7();
        if (p6 != null) {
            final l0<n0> l0 = new l0<n0>();
            for (int i = 0; i < p6.size(); ++i) {
                final b5.b b2 = p6.get(i);
                b5.b x8 = (b5.b)map.get(b2);
                if (x8 == null) {
                    x8 = p5.x8(f0, (p5.b)f0.H().j(b5.b.class), b2, true, map, set);
                }
                l0.add(x8);
            }
            osObjectBuilder.Z(b.f, l0);
        }
        else {
            osObjectBuilder.Z(b.f, new l0<n0>());
        }
        osObjectBuilder.i0();
        return a;
    }
    
    public static b5.a w8(final f0 f0, final b b, final b5.a a, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        final r5 r5 = map.get(a);
        if (r5 != null) {
            return r5;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(b5.a.class), set);
        osObjectBuilder.L(b.e, a.a());
        final r5 j8 = J8(f0, osObjectBuilder.f0());
        map.put(a, j8);
        final l0<b5.b> p6 = a.P7();
        if (p6 != null) {
            final l0<b5.b> p7 = j8.P7();
            p7.clear();
            for (int i = 0; i < p6.size(); ++i) {
                final b5.b b3 = p6.get(i);
                b5.b x8 = (b5.b)map.get(b3);
                if (x8 == null) {
                    x8 = p5.x8(f0, (p5.b)f0.H().j(b5.b.class), b3, b2, map, set);
                }
                p7.add(x8);
            }
        }
        return j8;
    }
    
    public static b5.a x8(final f0 f0, final b b, final b5.a a, final boolean b2, final Map<n0, p> map, final Set<q> set) {
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
            return (b5.a)p7;
        }
        final p p8 = null;
        Object x2 = null;
        boolean b3 = false;
        Label_0233: {
            if (b2) {
                x2 = f0.x2(b5.a.class);
                final long r = ((Table)x2).r(b.e, a.a());
                if (r == -1L) {
                    b3 = false;
                    x2 = p8;
                    break Label_0233;
                }
                try {
                    h.g(f0, ((Table)x2).R(r), b, false, Collections.emptyList());
                    x2 = new r5();
                    map.put(a, (p)x2);
                }
                finally {
                    h.a();
                }
            }
            b3 = b2;
        }
        b5.a a2;
        if (b3) {
            a2 = K8(f0, b, (b5.a)x2, a, map, set);
        }
        else {
            a2 = w8(f0, b, a, b2, map, set);
        }
        return a2;
    }
    
    public static b y8(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static b5.a z8(final b5.a a, final int a2, final int n, final Map<n0, p.a<n0>> map) {
        if (a2 <= n && a != null) {
            final p.a a3 = map.get(a);
            b5.a a4;
            if (a3 == null) {
                a4 = new b5.a();
                map.put(a, (p.a<n0>)new p.a(a2, a4));
            }
            else {
                if (a2 >= a3.a) {
                    return (b5.a)a3.b;
                }
                a4 = (b5.a)a3.b;
                a3.a = a2;
            }
            a4.b(a.a());
            if (a2 == n) {
                a4.p2(null);
            }
            else {
                final l0<b5.b> p4 = a.P7();
                final l0<b5.b> l0 = new l0<b5.b>();
                a4.p2(l0);
                for (int size = p4.size(), i = 0; i < size; ++i) {
                    l0.add(p5.z8(p4.get(i), a2 + 1, n, map));
                }
            }
            return a4;
        }
        return null;
    }
    
    @Override
    public l0<b5.b> P7() {
        this.M.f().h();
        final l0<b5.b> n = this.N;
        if (n != null) {
            return n;
        }
        return this.N = new l0<b5.b>(b5.b.class, this.M.g().p(this.L.f), this.M.f());
    }
    
    @Override
    public c0<?> S6() {
        return this.M;
    }
    
    @Override
    public long a() {
        this.M.f().h();
        return this.M.g().m(this.L.e);
    }
    
    @Override
    public void b(final long n) {
        if (this.M.i()) {
            return;
        }
        this.M.f().h();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final r5 r5 = (r5)o;
        final io.realm.a f = this.M.f();
        final io.realm.a f2 = r5.M.f();
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
        final String i = r5.M.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.M.g().l0() == r5.M.g().l0();
            }
        }
        else if (i == null) {
            return this.M.g().l0() == r5.M.g().l0();
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
    public void p2(final l0<b5.b> l0) {
        final boolean i = this.M.i();
        final int n = 0;
        int j = 0;
        l0<b5.b> l2 = l0;
        if (i) {
            if (!this.M.d()) {
                return;
            }
            if (this.M.e().contains("days")) {
                return;
            }
            if ((l2 = l0) != null) {
                l2 = l0;
                if (!l0.G0()) {
                    final f0 f0 = (f0)this.M.f();
                    l2 = new l0<b5.b>();
                    for (final b5.b b : l0) {
                        b5.b b2;
                        if ((b2 = b) != null) {
                            if (p0.j8(b)) {
                                b2 = b;
                            }
                            else {
                                b2 = f0.y0(b, new q[0]);
                            }
                        }
                        l2.add(b2);
                    }
                }
            }
        }
        this.M.f().h();
        final OsList p = this.M.g().p(this.L.f);
        if (l2 != null && l2.size() == p.b0()) {
            while (j < l2.size()) {
                final b5.b b3 = l2.get(j);
                this.M.c(b3);
                p.Z(j, ((p)b3).S6().g().l0());
                ++j;
            }
        }
        else {
            p.M();
            if (l2 == null) {
                return;
            }
            for (int size = l2.size(), k = n; k < size; ++k) {
                final b5.b b4 = l2.get(k);
                this.M.c(b4);
                p.l(((p)b4).S6().g().l0());
            }
        }
    }
    
    @Override
    public String toString() {
        if (!p0.k8(this)) {
            return "Invalid object";
        }
        final StringBuilder sb = new StringBuilder("RealmTimeGrid = proxy[");
        sb.append("{id:");
        sb.append(this.a());
        sb.append("}");
        sb.append(",");
        sb.append("{days:");
        sb.append("RealmList<RealmTimeGridDay>[");
        sb.append(this.P7().size());
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
        (this.M = new c0<b5.a>(this)).r(h.e());
        this.M.s(h.f());
        this.M.o(h.b());
        this.M.q(h.d());
    }
    
    public static final class a
    {
        public static final String a = "RealmTimeGrid";
    }
    
    static final class b extends c
    {
        long e;
        long f;
        
        b(final OsSchemaInfo osSchemaInfo) {
            super(2);
            final OsObjectSchemaInfo b = osSchemaInfo.b("RealmTimeGrid");
            this.e = this.b("id", "id", b);
            this.f = this.b("days", "days", b);
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
