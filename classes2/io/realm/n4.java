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
import io.realm.internal.c;
import java.util.Collections;
import io.realm.internal.r;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Set;
import java.util.Map;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.p;
import x4.a;

public class n4 extends x4.a implements p, o4
{
    private static final String R = "";
    private static final OsObjectSchemaInfo S;
    private b O;
    private c0<x4.a> P;
    private l0<o4.a> Q;
    
    static {
        S = G8();
    }
    
    n4() {
        this.P.p();
    }
    
    public static x4.a C8(final f0 f0, final b b, final x4.a a, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        final n4 n4 = map.get(a);
        if (n4 != null) {
            return n4;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(x4.a.class), set);
        osObjectBuilder.L(b.e, a.a());
        osObjectBuilder.d0(b.f, a.K());
        osObjectBuilder.d0(b.g, a.f());
        osObjectBuilder.n(b.i, a.i5());
        final n4 p6 = P8(f0, osObjectBuilder.f0());
        map.put(a, p6);
        final l0<o4.a> e = a.E();
        if (e != null) {
            final l0<o4.a> e2 = p6.E();
            e2.clear();
            for (int i = 0; i < e.size(); ++i) {
                final o4.a a2 = e.get(i);
                o4.a z8 = (o4.a)map.get(a2);
                if (z8 == null) {
                    z8 = l2.z8(f0, (l2.b)f0.H().j(o4.a.class), a2, b2, map, set);
                }
                e2.add(z8);
            }
        }
        return p6;
    }
    
    public static x4.a D8(final f0 f0, final b b, final x4.a a, final boolean b2, final Map<n0, p> map, final Set<q> set) {
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
            return (x4.a)p7;
        }
        final p p8 = null;
        Object x2 = null;
        boolean b3 = false;
        Label_0232: {
            if (b2) {
                x2 = f0.x2(x4.a.class);
                final long r = ((Table)x2).r(b.e, a.a());
                if (r == -1L) {
                    b3 = false;
                    x2 = p8;
                    break Label_0232;
                }
                try {
                    h.g(f0, ((Table)x2).R(r), b, false, Collections.emptyList());
                    x2 = new n4();
                    map.put(a, (p)x2);
                }
                finally {
                    h.a();
                }
            }
            b3 = b2;
        }
        x4.a a2;
        if (b3) {
            a2 = Q8(f0, b, (x4.a)x2, a, map, set);
        }
        else {
            a2 = C8(f0, b, a, b2, map, set);
        }
        return a2;
    }
    
    public static b E8(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static x4.a F8(final x4.a a, final int a2, final int n, final Map<n0, p.a<n0>> map) {
        if (a2 <= n && a != null) {
            final p.a a3 = map.get(a);
            x4.a a4;
            if (a3 == null) {
                a4 = new x4.a();
                map.put(a, (p.a<n0>)new p.a(a2, a4));
            }
            else {
                if (a2 >= a3.a) {
                    return (x4.a)a3.b;
                }
                a4 = (x4.a)a3.b;
                a3.a = a2;
            }
            a4.b(a.a());
            a4.v4(a.K());
            a4.j(a.f());
            if (a2 == n) {
                a4.B(null);
            }
            else {
                final l0<o4.a> e = a.E();
                final l0<o4.a> l0 = new l0<o4.a>();
                a4.B(l0);
                for (int size = e.size(), i = 0; i < size; ++i) {
                    l0.add(l2.B8(e.get(i), a2 + 1, n, map));
                }
            }
            a4.E6(a.i5());
            return a4;
        }
        return null;
    }
    
    private static OsObjectSchemaInfo G8() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmMessageOfDay", false, 5, 0);
        b.c("", "id", RealmFieldType.INTEGER, true, false, true);
        final RealmFieldType string = RealmFieldType.STRING;
        b.c("", "subject", string, false, false, true);
        b.c("", "text", string, false, false, true);
        b.b("", "driveAttachments", RealmFieldType.LIST, "RealmDriveAttachment");
        b.c("", "read", RealmFieldType.BOOLEAN, false, false, true);
        return b.e();
    }
    
    public static x4.a H8(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final ArrayList<String> list = new ArrayList<String>(1);
        Object x2 = null;
        Label_0146: {
            if (b) {
                x2 = f0.x2(x4.a.class);
                final long e = ((b)f0.H().j(x4.a.class)).e;
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
                        h.g(f0, ((Table)x2).R(r), f0.H().j(x4.a.class), false, Collections.emptyList());
                        x2 = new n4();
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
            if (jsonObject.has("driveAttachments")) {
                list.add("driveAttachments");
            }
            if (!jsonObject.has("id")) {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
            n4 n4;
            if (jsonObject.isNull("id")) {
                n4 = f0.p1((Class<n4>)x4.a.class, null, true, list);
            }
            else {
                n4 = f0.p1((Class<n4>)x4.a.class, jsonObject.getLong("id"), true, list);
            }
            o = n4;
        }
        if (jsonObject.has("subject")) {
            if (jsonObject.isNull("subject")) {
                ((o4)o).v4(null);
            }
            else {
                ((o4)o).v4(jsonObject.getString("subject"));
            }
        }
        if (jsonObject.has("text")) {
            if (jsonObject.isNull("text")) {
                ((o4)o).j(null);
            }
            else {
                ((o4)o).j(jsonObject.getString("text"));
            }
        }
        if (jsonObject.has("driveAttachments")) {
            if (jsonObject.isNull("driveAttachments")) {
                ((o4)o).B(null);
            }
            else {
                ((o4)o).E().clear();
                final JSONArray jsonArray = jsonObject.getJSONArray("driveAttachments");
                for (int i = 0; i < jsonArray.length(); ++i) {
                    ((o4)o).E().add(l2.D8(f0, jsonArray.getJSONObject(i), b));
                }
            }
        }
        if (jsonObject.has("read")) {
            if (jsonObject.isNull("read")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'read' to null.");
            }
            ((o4)o).E6(jsonObject.getBoolean("read"));
        }
        return (x4.a)o;
    }
    
    @TargetApi(11)
    public static x4.a I8(final f0 f0, final JsonReader jsonReader) throws IOException {
        final x4.a a = new x4.a();
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
            else if (nextName.equals("subject")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    a.v4(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    a.v4(null);
                }
            }
            else if (nextName.equals("text")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    a.j(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    a.j(null);
                }
            }
            else if (nextName.equals("driveAttachments")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    a.B(null);
                }
                else {
                    a.B(new l0<o4.a>());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        a.E().add(l2.E8(f0, jsonReader));
                    }
                    jsonReader.endArray();
                }
            }
            else if (nextName.equals("read")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'read' to null.");
                }
                a.E6(jsonReader.nextBoolean());
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
    
    public static OsObjectSchemaInfo J8() {
        return n4.S;
    }
    
    public static String K8() {
        return "RealmMessageOfDay";
    }
    
    public static long L8(final f0 f0, final x4.a a, final Map<n0, Long> map) {
        if (a instanceof p && !p0.h8(a)) {
            final p p3 = (p)a;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(x4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(x4.a.class);
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
        final String k = a.K();
        if (k != null) {
            Table.nativeSetString(nativePtr, b.f, l, k, false);
        }
        final String f2 = a.f();
        if (f2 != null) {
            Table.nativeSetString(nativePtr, b.g, l, f2, false);
        }
        final l0<o4.a> e2 = a.E();
        if (e2 != null) {
            final OsList list = new OsList(x2.R(l), b.h);
            for (final o4.a a2 : e2) {
                Long value2;
                if ((value2 = map.get(a2)) == null) {
                    value2 = l2.H8(f0, a2, map);
                }
                list.l(value2);
            }
        }
        Table.nativeSetBoolean(nativePtr, b.i, l, a.i5(), false);
        return l;
    }
    
    public static void M8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(x4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(x4.a.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final x4.a a = (x4.a)iterator.next();
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
            final String k = a.K();
            if (k != null) {
                Table.nativeSetString(nativePtr, b.f, l, k, false);
            }
            final String f2 = a.f();
            if (f2 != null) {
                Table.nativeSetString(nativePtr, b.g, l, f2, false);
            }
            final l0<o4.a> e2 = a.E();
            if (e2 != null) {
                final OsList list = new OsList(x2.R(l), b.h);
                for (final o4.a a2 : e2) {
                    Long value2;
                    if ((value2 = map.get(a2)) == null) {
                        value2 = l2.H8(f0, a2, map);
                    }
                    list.l(value2);
                }
            }
            Table.nativeSetBoolean(nativePtr, b.i, l, a.i5(), false);
        }
    }
    
    public static long N8(final f0 f0, final x4.a a, final Map<n0, Long> map) {
        if (a instanceof p && !p0.h8(a)) {
            final p p3 = (p)a;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(x4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(x4.a.class);
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
        final String k = a.K();
        if (k != null) {
            Table.nativeSetString(nativePtr, b.f, rowWithPrimaryKey, k, false);
        }
        else {
            Table.nativeSetNull(nativePtr, b.f, rowWithPrimaryKey, false);
        }
        final String f2 = a.f();
        final long g = b.g;
        if (f2 != null) {
            Table.nativeSetString(nativePtr, g, rowWithPrimaryKey, f2, false);
        }
        else {
            Table.nativeSetNull(nativePtr, g, rowWithPrimaryKey, false);
        }
        final OsList list = new OsList(x2.R(rowWithPrimaryKey), b.h);
        final l0<o4.a> e2 = a.E();
        long n;
        if (e2 != null && e2.size() == list.b0()) {
            for (int size = e2.size(), i = 0; i < size; ++i) {
                final o4.a a2 = e2.get(i);
                Long value;
                if ((value = map.get(a2)) == null) {
                    value = l2.J8(f0, a2, map);
                }
                list.Z(i, value);
            }
            n = rowWithPrimaryKey;
        }
        else {
            list.M();
            n = rowWithPrimaryKey;
            if (e2 != null) {
                final Iterator<o4.a> iterator = e2.iterator();
                while (true) {
                    n = rowWithPrimaryKey;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    final o4.a a3 = iterator.next();
                    Long value2;
                    if ((value2 = map.get(a3)) == null) {
                        value2 = l2.J8(f0, a3, map);
                    }
                    list.l(value2);
                }
            }
        }
        Table.nativeSetBoolean(nativePtr, b.i, n, a.i5(), false);
        return n;
    }
    
    public static void O8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(x4.a.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(x4.a.class);
        long e = b.e;
        while (iterator.hasNext()) {
            final x4.a a = (x4.a)iterator.next();
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
            final String k = a.K();
            if (k != null) {
                Table.nativeSetString(nativePtr, b.f, rowWithPrimaryKey, k, false);
            }
            else {
                Table.nativeSetNull(nativePtr, b.f, rowWithPrimaryKey, false);
            }
            final long n = rowWithPrimaryKey;
            final String f2 = a.f();
            final long g = b.g;
            if (f2 != null) {
                Table.nativeSetString(nativePtr, g, n, f2, false);
            }
            else {
                Table.nativeSetNull(nativePtr, g, n, false);
            }
            final OsList list = new OsList(x2.R(n), b.h);
            final l0<o4.a> e2 = a.E();
            if (e2 != null && e2.size() == list.b0()) {
                for (int size = e2.size(), i = 0; i < size; ++i) {
                    final o4.a a2 = e2.get(i);
                    Long value;
                    if ((value = map.get(a2)) == null) {
                        value = l2.J8(f0, a2, map);
                    }
                    list.Z(i, value);
                }
            }
            else {
                final long n2 = e;
                list.M();
                e = n2;
                if (e2 != null) {
                    final Iterator<o4.a> iterator2 = e2.iterator();
                    while (true) {
                        e = n2;
                        if (!iterator2.hasNext()) {
                            break;
                        }
                        final o4.a a3 = iterator2.next();
                        Long value2;
                        if ((value2 = map.get(a3)) == null) {
                            value2 = l2.J8(f0, a3, map);
                        }
                        list.l(value2);
                    }
                }
            }
            Table.nativeSetBoolean(nativePtr, b.i, n, a.i5(), false);
        }
    }
    
    static n4 P8(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(x4.a.class), false, Collections.emptyList());
        final n4 n4 = new n4();
        h.a();
        return n4;
    }
    
    static x4.a Q8(final f0 f0, final b b, final x4.a a, final x4.a a2, final Map<n0, p> map, final Set<q> set) {
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(x4.a.class), set);
        osObjectBuilder.L(b.e, a2.a());
        osObjectBuilder.d0(b.f, a2.K());
        osObjectBuilder.d0(b.g, a2.f());
        final l0<o4.a> e = a2.E();
        if (e != null) {
            final l0<n0> l0 = new l0<n0>();
            for (int i = 0; i < e.size(); ++i) {
                final o4.a a3 = e.get(i);
                o4.a z8 = (o4.a)map.get(a3);
                if (z8 == null) {
                    z8 = l2.z8(f0, (l2.b)f0.H().j(o4.a.class), a3, true, map, set);
                }
                l0.add(z8);
            }
            osObjectBuilder.Z(b.h, l0);
        }
        else {
            osObjectBuilder.Z(b.h, new l0<n0>());
        }
        osObjectBuilder.n(b.i, a2.i5());
        osObjectBuilder.i0();
        return a;
    }
    
    @Override
    public void B(final l0<o4.a> l0) {
        final boolean i = this.P.i();
        final int n = 0;
        int j = 0;
        l0<o4.a> l2 = l0;
        if (i) {
            if (!this.P.d()) {
                return;
            }
            if (this.P.e().contains("driveAttachments")) {
                return;
            }
            if ((l2 = l0) != null) {
                l2 = l0;
                if (!l0.G0()) {
                    final f0 f0 = (f0)this.P.f();
                    l2 = new l0<o4.a>();
                    for (final o4.a a : l0) {
                        o4.a a2;
                        if ((a2 = a) != null) {
                            if (p0.j8(a)) {
                                a2 = a;
                            }
                            else {
                                a2 = f0.G0(a, new q[0]);
                            }
                        }
                        l2.add(a2);
                    }
                }
            }
        }
        this.P.f().h();
        final OsList p = this.P.g().p(this.O.h);
        if (l2 != null && l2.size() == p.b0()) {
            while (j < l2.size()) {
                final o4.a a3 = l2.get(j);
                this.P.c(a3);
                p.Z(j, ((p)a3).S6().g().l0());
                ++j;
            }
        }
        else {
            p.M();
            if (l2 == null) {
                return;
            }
            for (int size = l2.size(), k = n; k < size; ++k) {
                final o4.a a4 = l2.get(k);
                this.P.c(a4);
                p.l(((p)a4).S6().g().l0());
            }
        }
    }
    
    @Override
    public l0<o4.a> E() {
        this.P.f().h();
        final l0<o4.a> q = this.Q;
        if (q != null) {
            return q;
        }
        return this.Q = new l0<o4.a>(o4.a.class, this.P.g().p(this.O.h), this.P.f());
    }
    
    @Override
    public void E6(final boolean b) {
        if (!this.P.i()) {
            this.P.f().h();
            this.P.g().i(this.O.i, b);
            return;
        }
        if (!this.P.d()) {
            return;
        }
        final r g = this.P.g();
        g.g().j0(this.O.i, g.l0(), b, true);
    }
    
    @Override
    public String K() {
        this.P.f().h();
        return this.P.g().U(this.O.f);
    }
    
    @Override
    public c0<?> S6() {
        return this.P;
    }
    
    @Override
    public long a() {
        this.P.f().h();
        return this.P.g().m(this.O.e);
    }
    
    @Override
    public void b(final long n) {
        if (this.P.i()) {
            return;
        }
        this.P.f().h();
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
        final n4 n4 = (n4)o;
        final io.realm.a f = this.P.f();
        final io.realm.a f2 = n4.P.f();
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
        final String i = n4.P.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.P.g().l0() == n4.P.g().l0();
            }
        }
        else if (i == null) {
            return this.P.g().l0() == n4.P.g().l0();
        }
        return false;
    }
    
    @Override
    public String f() {
        this.P.f().h();
        return this.P.g().U(this.O.g);
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
    public boolean i5() {
        this.P.f().h();
        return this.P.g().l(this.O.i);
    }
    
    @Override
    public void j(final String s) {
        if (this.P.i()) {
            if (!this.P.d()) {
                return;
            }
            final r g = this.P.g();
            if (s != null) {
                g.g().t0(this.O.g, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'text' to null.");
        }
        else {
            this.P.f().h();
            if (s != null) {
                this.P.g().d(this.O.g, s);
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
        final StringBuilder sb = new StringBuilder("RealmMessageOfDay = proxy[");
        sb.append("{id:");
        sb.append(this.a());
        sb.append("}");
        sb.append(",");
        sb.append("{subject:");
        sb.append(this.K());
        sb.append("}");
        sb.append(",");
        sb.append("{text:");
        sb.append(this.f());
        sb.append("}");
        sb.append(",");
        sb.append("{driveAttachments:");
        sb.append("RealmList<RealmDriveAttachment>[");
        sb.append(this.E().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{read:");
        sb.append(this.i5());
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
    
    @Override
    public void v4(final String s) {
        if (this.P.i()) {
            if (!this.P.d()) {
                return;
            }
            final r g = this.P.g();
            if (s != null) {
                g.g().t0(this.O.f, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'subject' to null.");
        }
        else {
            this.P.f().h();
            if (s != null) {
                this.P.g().d(this.O.f, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'subject' to null.");
        }
    }
    
    @Override
    public void y4() {
        if (this.P != null) {
            return;
        }
        final io.realm.a.h h = io.realm.a.W.get();
        this.O = (b)h.c();
        (this.P = new c0<x4.a>(this)).r(h.e());
        this.P.s(h.f());
        this.P.o(h.b());
        this.P.q(h.d());
    }
    
    public static final class a
    {
        public static final String a = "RealmMessageOfDay";
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
            final OsObjectSchemaInfo b = osSchemaInfo.b("RealmMessageOfDay");
            this.e = this.b("id", "id", b);
            this.f = this.b("subject", "subject", b);
            this.g = this.b("text", "text", b);
            this.h = this.b("driveAttachments", "driveAttachments", b);
            this.i = this.b("read", "read", b);
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
