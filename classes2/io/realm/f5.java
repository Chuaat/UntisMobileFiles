// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import io.realm.exceptions.RealmException;
import java.util.Iterator;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.Table;
import android.annotation.TargetApi;
import java.io.IOException;
import android.util.JsonToken;
import android.util.JsonReader;
import org.json.JSONException;
import org.json.JSONArray;
import java.util.List;
import java.util.ArrayList;
import org.json.JSONObject;
import io.realm.internal.OsSchemaInfo;
import java.util.Collections;
import io.realm.internal.r;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Set;
import java.util.Map;
import com.untis.mobile.persistence.realm.period.c;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.p;
import com.untis.mobile.persistence.realm.period.g;

public class f5 extends g implements p, g5
{
    private static final String T = "";
    private static final OsObjectSchemaInfo U;
    private b Q;
    private c0<g> R;
    private l0<c> S;
    
    static {
        U = I8();
    }
    
    f5() {
        this.R.p();
    }
    
    public static g E8(final f0 f0, final b b, final g g, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        final f5 f2 = map.get(g);
        if (f2 != null) {
            return f2;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(g.class), set);
        osObjectBuilder.d0(b.e, g.z());
        osObjectBuilder.K(b.f, g.l());
        osObjectBuilder.L(b.g, g.o());
        osObjectBuilder.L(b.h, g.H());
        osObjectBuilder.L(b.j, g.b0());
        final f5 r8 = R8(f0, osObjectBuilder.f0());
        map.put(g, r8);
        final l0<c> j0 = g.J0();
        if (j0 != null) {
            final l0<c> j2 = r8.J0();
            j2.clear();
            for (int i = 0; i < j0.size(); ++i) {
                final c c = j0.get(i);
                c d9 = (c)map.get(c);
                if (d9 == null) {
                    d9 = x4.d9(f0, (x4.b)f0.H().j(c.class), c, b2, map, set);
                }
                j2.add(d9);
            }
        }
        return r8;
    }
    
    public static g F8(final f0 f0, final b b, final g g, final boolean b2, final Map<n0, p> map, final Set<q> set) {
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
                final long u = ((Table)x2).u(b.e, g.z());
                if (u == -1L) {
                    b3 = false;
                    x2 = p8;
                    break Label_0232;
                }
                try {
                    h.g(f0, ((Table)x2).R(u), b, false, Collections.emptyList());
                    x2 = new f5();
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
            g2 = S8(f0, b, (g)x2, g, map, set);
        }
        else {
            g2 = E8(f0, b, g, b2, map, set);
        }
        return g2;
    }
    
    public static b G8(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static g H8(final g g, final int a, final int n, final Map<n0, p.a<n0>> map) {
        if (a <= n && g != null) {
            final p.a a2 = map.get(g);
            g g2;
            if (a2 == null) {
                g2 = new g();
                map.put(g, (p.a<n0>)new p.a(a, g2));
            }
            else {
                if (a >= a2.a) {
                    return (g)a2.b;
                }
                g2 = (g)a2.b;
                a2.a = a;
            }
            g2.q1(g.z());
            g2.k(g.l());
            g2.p(g.o());
            g2.W(g.H());
            if (a == n) {
                g2.c1(null);
            }
            else {
                final l0<c> j0 = g.J0();
                final l0<c> l0 = new l0<c>();
                g2.c1(l0);
                for (int size = j0.size(), i = 0; i < size; ++i) {
                    l0.add(x4.f9(j0.get(i), a + 1, n, map));
                }
            }
            g2.s0(g.b0());
            return g2;
        }
        return null;
    }
    
    private static OsObjectSchemaInfo I8() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmTimeTable", false, 6, 0);
        b.c("", "key", RealmFieldType.STRING, true, false, true);
        final RealmFieldType integer = RealmFieldType.INTEGER;
        b.c("", "entityType", integer, false, false, true);
        b.c("", "entityId", integer, false, false, true);
        b.c("", "date", integer, false, false, true);
        b.b("", "periods", RealmFieldType.LIST, "RealmPeriod");
        b.c("", "timestamp", integer, false, false, true);
        return b.e();
    }
    
    public static g J8(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final ArrayList<String> list = new ArrayList<String>(1);
        Object x2 = null;
        Label_0146: {
            if (b) {
                x2 = f0.x2(g.class);
                final long e = ((b)f0.H().j(g.class)).e;
                long u;
                if (!jsonObject.isNull("key")) {
                    u = ((Table)x2).u(e, jsonObject.getString("key"));
                }
                else {
                    u = -1L;
                }
                if (u != -1L) {
                    final io.realm.a.h h = io.realm.a.W.get();
                    try {
                        h.g(f0, ((Table)x2).R(u), f0.H().j(g.class), false, Collections.emptyList());
                        x2 = new f5();
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
            if (jsonObject.has("periods")) {
                list.add("periods");
            }
            if (!jsonObject.has("key")) {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'key'.");
            }
            f5 f2;
            if (jsonObject.isNull("key")) {
                f2 = f0.p1((Class<f5>)g.class, null, true, list);
            }
            else {
                f2 = f0.p1((Class<f5>)g.class, jsonObject.getString("key"), true, list);
            }
            o = f2;
        }
        if (jsonObject.has("entityType")) {
            if (jsonObject.isNull("entityType")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'entityType' to null.");
            }
            ((g5)o).k(jsonObject.getInt("entityType"));
        }
        if (jsonObject.has("entityId")) {
            if (jsonObject.isNull("entityId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'entityId' to null.");
            }
            ((g5)o).p(jsonObject.getLong("entityId"));
        }
        if (jsonObject.has("date")) {
            if (jsonObject.isNull("date")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'date' to null.");
            }
            ((g5)o).W(jsonObject.getLong("date"));
        }
        if (jsonObject.has("periods")) {
            if (jsonObject.isNull("periods")) {
                ((g5)o).c1(null);
            }
            else {
                ((g5)o).J0().clear();
                final JSONArray jsonArray = jsonObject.getJSONArray("periods");
                for (int i = 0; i < jsonArray.length(); ++i) {
                    ((g5)o).J0().add(x4.h9(f0, jsonArray.getJSONObject(i), b));
                }
            }
        }
        if (jsonObject.has("timestamp")) {
            if (jsonObject.isNull("timestamp")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'timestamp' to null.");
            }
            ((g5)o).s0(jsonObject.getLong("timestamp"));
        }
        return (g)o;
    }
    
    @TargetApi(11)
    public static g K8(final f0 f0, final JsonReader jsonReader) throws IOException {
        final g g = new g();
        jsonReader.beginObject();
        boolean b = false;
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            if (nextName.equals("key")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    g.q1(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    g.q1(null);
                }
                b = true;
            }
            else if (nextName.equals("entityType")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'entityType' to null.");
                }
                g.k(jsonReader.nextInt());
            }
            else if (nextName.equals("entityId")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'entityId' to null.");
                }
                g.p(jsonReader.nextLong());
            }
            else if (nextName.equals("date")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'date' to null.");
                }
                g.W(jsonReader.nextLong());
            }
            else if (nextName.equals("periods")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    g.c1(null);
                }
                else {
                    g.c1(new l0<c>());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        g.J0().add(x4.i9(f0, jsonReader));
                    }
                    jsonReader.endArray();
                }
            }
            else if (nextName.equals("timestamp")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'timestamp' to null.");
                }
                g.s0(jsonReader.nextLong());
            }
            else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (b) {
            return f0.G0(g, new q[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'key'.");
    }
    
    public static OsObjectSchemaInfo L8() {
        return f5.U;
    }
    
    public static String M8() {
        return "RealmTimeTable";
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
        final String z = g.z();
        long l;
        if (z != null) {
            l = Table.nativeFindFirstString(nativePtr, e, z);
        }
        else {
            l = -1L;
        }
        if (l == -1L) {
            l = OsObject.createRowWithPrimaryKey(x2, e, z);
        }
        else {
            Table.v0(z);
        }
        map.put(g, l);
        Table.nativeSetLong(nativePtr, b.f, l, g.l(), false);
        Table.nativeSetLong(nativePtr, b.g, l, g.o(), false);
        Table.nativeSetLong(nativePtr, b.h, l, g.H(), false);
        final l0<c> j0 = g.J0();
        if (j0 != null) {
            final OsList list = new OsList(x2.R(l), b.i);
            for (final c c : j0) {
                Long value;
                if ((value = map.get(c)) == null) {
                    value = x4.l9(f0, c, map);
                }
                list.l(value);
            }
        }
        Table.nativeSetLong(nativePtr, b.j, l, g.b0(), false);
        return l;
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
            final String z = g.z();
            long l;
            if (z != null) {
                l = Table.nativeFindFirstString(nativePtr, e, z);
            }
            else {
                l = -1L;
            }
            if (l == -1L) {
                l = OsObject.createRowWithPrimaryKey(x2, e, z);
            }
            else {
                Table.v0(z);
            }
            map.put(g, l);
            Table.nativeSetLong(nativePtr, b.f, l, g.l(), false);
            Table.nativeSetLong(nativePtr, b.g, l, g.o(), false);
            Table.nativeSetLong(nativePtr, b.h, l, g.H(), false);
            final l0<c> j0 = g.J0();
            if (j0 != null) {
                final OsList list = new OsList(x2.R(l), b.i);
                for (final c c : j0) {
                    Long value;
                    if ((value = map.get(c)) == null) {
                        value = x4.l9(f0, c, map);
                    }
                    list.l(value);
                }
            }
            Table.nativeSetLong(nativePtr, b.j, l, g.b0(), false);
        }
    }
    
    public static long P8(final f0 f0, final g g, final Map<n0, Long> map) {
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
        final String z = g.z();
        long nativeFindFirstString;
        if (z != null) {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, e, z);
        }
        else {
            nativeFindFirstString = -1L;
        }
        long rowWithPrimaryKey = nativeFindFirstString;
        if (nativeFindFirstString == -1L) {
            rowWithPrimaryKey = OsObject.createRowWithPrimaryKey(x2, e, z);
        }
        map.put(g, rowWithPrimaryKey);
        Table.nativeSetLong(nativePtr, b.f, rowWithPrimaryKey, g.l(), false);
        Table.nativeSetLong(nativePtr, b.g, rowWithPrimaryKey, g.o(), false);
        Table.nativeSetLong(nativePtr, b.h, rowWithPrimaryKey, g.H(), false);
        final OsList list = new OsList(x2.R(rowWithPrimaryKey), b.i);
        final l0<c> j0 = g.J0();
        long n;
        if (j0 != null && j0.size() == list.b0()) {
            for (int size = j0.size(), i = 0; i < size; ++i) {
                final c c = j0.get(i);
                Long value;
                if ((value = map.get(c)) == null) {
                    value = x4.n9(f0, c, map);
                }
                list.Z(i, value);
            }
            n = rowWithPrimaryKey;
        }
        else {
            list.M();
            n = rowWithPrimaryKey;
            if (j0 != null) {
                final Iterator<c> iterator = j0.iterator();
                while (true) {
                    n = rowWithPrimaryKey;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    final c c2 = iterator.next();
                    Long value2;
                    if ((value2 = map.get(c2)) == null) {
                        value2 = x4.n9(f0, c2, map);
                    }
                    list.l(value2);
                }
            }
        }
        Table.nativeSetLong(nativePtr, b.j, n, g.b0(), false);
        return n;
    }
    
    public static void Q8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
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
            final String z = g.z();
            long l;
            if (z != null) {
                l = Table.nativeFindFirstString(nativePtr, e, z);
            }
            else {
                l = -1L;
            }
            if (l == -1L) {
                l = OsObject.createRowWithPrimaryKey(x2, e, z);
            }
            map.put(g, l);
            Table.nativeSetLong(nativePtr, b.f, l, g.l(), false);
            Table.nativeSetLong(nativePtr, b.g, l, g.o(), false);
            Table.nativeSetLong(nativePtr, b.h, l, g.H(), false);
            final OsList list = new OsList(x2.R(l), b.i);
            final l0<c> j0 = g.J0();
            if (j0 != null && j0.size() == list.b0()) {
                for (int size = j0.size(), i = 0; i < size; ++i) {
                    final c c = j0.get(i);
                    Long value;
                    if ((value = map.get(c)) == null) {
                        value = x4.n9(f0, c, map);
                    }
                    list.Z(i, value);
                }
            }
            else {
                final long n = l;
                list.M();
                l = n;
                if (j0 != null) {
                    final Iterator<c> iterator2 = j0.iterator();
                    while (true) {
                        l = n;
                        if (!iterator2.hasNext()) {
                            break;
                        }
                        final c c2 = iterator2.next();
                        Long value2;
                        if ((value2 = map.get(c2)) == null) {
                            value2 = x4.n9(f0, c2, map);
                        }
                        list.l(value2);
                    }
                }
            }
            Table.nativeSetLong(nativePtr, b.j, l, g.b0(), false);
        }
    }
    
    static f5 R8(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(g.class), false, Collections.emptyList());
        final f5 f5 = new f5();
        h.a();
        return f5;
    }
    
    static g S8(final f0 f0, final b b, final g g, final g g2, final Map<n0, p> map, final Set<q> set) {
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(g.class), set);
        osObjectBuilder.d0(b.e, g2.z());
        osObjectBuilder.K(b.f, g2.l());
        osObjectBuilder.L(b.g, g2.o());
        osObjectBuilder.L(b.h, g2.H());
        final l0<c> j0 = g2.J0();
        if (j0 != null) {
            final l0<n0> l0 = new l0<n0>();
            for (int i = 0; i < j0.size(); ++i) {
                final c c = j0.get(i);
                c d9 = (c)map.get(c);
                if (d9 == null) {
                    d9 = x4.d9(f0, (x4.b)f0.H().j(c.class), c, true, map, set);
                }
                l0.add(d9);
            }
            osObjectBuilder.Z(b.i, l0);
        }
        else {
            osObjectBuilder.Z(b.i, new l0<n0>());
        }
        osObjectBuilder.L(b.j, g2.b0());
        osObjectBuilder.i0();
        return g;
    }
    
    @Override
    public long H() {
        this.R.f().h();
        return this.R.g().m(this.Q.h);
    }
    
    @Override
    public l0<c> J0() {
        this.R.f().h();
        final l0<c> s = this.S;
        if (s != null) {
            return s;
        }
        return this.S = new l0<c>(c.class, this.R.g().p(this.Q.i), this.R.f());
    }
    
    @Override
    public c0<?> S6() {
        return this.R;
    }
    
    @Override
    public void W(final long n) {
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
    public long b0() {
        this.R.f().h();
        return this.R.g().m(this.Q.j);
    }
    
    @Override
    public void c1(final l0<c> l0) {
        final boolean i = this.R.i();
        final int n = 0;
        int j = 0;
        l0<c> l2 = l0;
        if (i) {
            if (!this.R.d()) {
                return;
            }
            if (this.R.e().contains("periods")) {
                return;
            }
            if ((l2 = l0) != null) {
                l2 = l0;
                if (!l0.G0()) {
                    final f0 f0 = (f0)this.R.f();
                    l2 = new l0<c>();
                    for (final c c : l0) {
                        c c2;
                        if ((c2 = c) != null) {
                            if (p0.j8(c)) {
                                c2 = c;
                            }
                            else {
                                c2 = f0.G0(c, new q[0]);
                            }
                        }
                        l2.add(c2);
                    }
                }
            }
        }
        this.R.f().h();
        final OsList p = this.R.g().p(this.Q.i);
        if (l2 != null && l2.size() == p.b0()) {
            while (j < l2.size()) {
                final c c3 = l2.get(j);
                this.R.c(c3);
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
                this.R.c(c4);
                p.l(((p)c4).S6().g().l0());
            }
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
        final f5 f5 = (f5)o;
        final io.realm.a f6 = this.R.f();
        final io.realm.a f7 = f5.R.f();
        final String path = f6.getPath();
        final String path2 = f7.getPath();
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
        if (f6.N() != f7.N()) {
            return false;
        }
        if (!f6.K.getVersionID().equals(f7.K.getVersionID())) {
            return false;
        }
        final String m = this.R.g().g().M();
        final String i = f5.R.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.R.g().l0() == f5.R.g().l0();
            }
        }
        else if (i == null) {
            return this.R.g().l0() == f5.R.g().l0();
        }
        return false;
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
    public void k(final int n) {
        if (!this.R.i()) {
            this.R.f().h();
            this.R.g().s(this.Q.f, n);
            return;
        }
        if (!this.R.d()) {
            return;
        }
        final r g = this.R.g();
        g.g().q0(this.Q.f, g.l0(), n, true);
    }
    
    @Override
    public int l() {
        this.R.f().h();
        return (int)this.R.g().m(this.Q.f);
    }
    
    @Override
    public long o() {
        this.R.f().h();
        return this.R.g().m(this.Q.g);
    }
    
    @Override
    public void p(final long n) {
        if (!this.R.i()) {
            this.R.f().h();
            this.R.g().s(this.Q.g, n);
            return;
        }
        if (!this.R.d()) {
            return;
        }
        final r g = this.R.g();
        g.g().q0(this.Q.g, g.l0(), n, true);
    }
    
    @Override
    public void q1(final String s) {
        if (this.R.i()) {
            return;
        }
        this.R.f().h();
        throw new RealmException("Primary key field 'key' cannot be changed after object was created.");
    }
    
    @Override
    public void s0(final long n) {
        if (!this.R.i()) {
            this.R.f().h();
            this.R.g().s(this.Q.j, n);
            return;
        }
        if (!this.R.d()) {
            return;
        }
        final r g = this.R.g();
        g.g().q0(this.Q.j, g.l0(), n, true);
    }
    
    @Override
    public String toString() {
        if (!p0.k8(this)) {
            return "Invalid object";
        }
        final StringBuilder sb = new StringBuilder("RealmTimeTable = proxy[");
        sb.append("{key:");
        sb.append(this.z());
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
        sb.append("{date:");
        sb.append(this.H());
        sb.append("}");
        sb.append(",");
        sb.append("{periods:");
        sb.append("RealmList<RealmPeriod>[");
        sb.append(this.J0().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{timestamp:");
        sb.append(this.b0());
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
    
    @Override
    public void y4() {
        if (this.R != null) {
            return;
        }
        final io.realm.a.h h = io.realm.a.W.get();
        this.Q = (b)h.c();
        (this.R = new c0<g>(this)).r(h.e());
        this.R.s(h.f());
        this.R.o(h.b());
        this.R.q(h.d());
    }
    
    @Override
    public String z() {
        this.R.f().h();
        return this.R.g().U(this.Q.e);
    }
    
    public static final class a
    {
        public static final String a = "RealmTimeTable";
    }
    
    static final class b extends c
    {
        long e;
        long f;
        long g;
        long h;
        long i;
        long j;
        
        b(final OsSchemaInfo osSchemaInfo) {
            super(6);
            final OsObjectSchemaInfo b = osSchemaInfo.b("RealmTimeTable");
            this.e = this.b("key", "key", b);
            this.f = this.b("entityType", "entityType", b);
            this.g = this.b("entityId", "entityId", b);
            this.h = this.b("date", "date", b);
            this.i = this.b("periods", "periods", b);
            this.j = this.b("timestamp", "timestamp", b);
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
        }
    }
}
