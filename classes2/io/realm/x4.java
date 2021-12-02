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
import com.untis.mobile.persistence.realm.b;
import com.untis.mobile.persistence.realm.a;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.p;
import com.untis.mobile.persistence.realm.period.c;

public class x4 extends c implements p, y4
{
    private static final String j0 = "";
    private static final OsObjectSchemaInfo k0;
    private b b0;
    private c0<c> c0;
    private l0<com.untis.mobile.persistence.realm.a> d0;
    private l0<com.untis.mobile.persistence.realm.a> e0;
    private l0<com.untis.mobile.persistence.realm.period.a> f0;
    private l0<com.untis.mobile.persistence.realm.period.a> g0;
    private l0<com.untis.mobile.persistence.realm.period.a> h0;
    private l0<com.untis.mobile.persistence.realm.b> i0;
    
    static {
        k0 = g9();
    }
    
    x4() {
        this.c0.p();
    }
    
    public static c c9(final f0 f0, final b b, final c c, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        final x4 x4 = map.get(c);
        if (x4 != null) {
            return x4;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(c.class), set);
        osObjectBuilder.L(b.e, c.a());
        osObjectBuilder.L(b.f, c.C());
        osObjectBuilder.L(b.g, c.d());
        osObjectBuilder.L(b.h, c.c());
        osObjectBuilder.K(b.i, c.B6());
        osObjectBuilder.K(b.j, c.r());
        osObjectBuilder.K(b.k, c.O2());
        osObjectBuilder.K(b.l, c.Y2());
        osObjectBuilder.n(b.t, c.P5());
        osObjectBuilder.d0(b.u, c.A7());
        osObjectBuilder.n(b.v, c.O0());
        final x4 p6 = p9(f0, osObjectBuilder.f0());
        map.put(c, p6);
        final l0<com.untis.mobile.persistence.realm.a> l7 = c.l7();
        final int n = 0;
        if (l7 != null) {
            final l0<com.untis.mobile.persistence.realm.a> l8 = p6.l7();
            l8.clear();
            for (int i = 0; i < l7.size(); ++i) {
                final com.untis.mobile.persistence.realm.a a = l7.get(i);
                final com.untis.mobile.persistence.realm.a a2 = (com.untis.mobile.persistence.realm.a)map.get(a);
                if (a2 != null) {
                    l8.add(a2);
                }
                else {
                    l8.add(x0.v8(f0, (x0.b)f0.H().j(com.untis.mobile.persistence.realm.a.class), a, b2, map, set));
                }
            }
        }
        final l0<com.untis.mobile.persistence.realm.a> b3 = c.b1();
        if (b3 != null) {
            final l0<com.untis.mobile.persistence.realm.a> b4 = p6.b1();
            b4.clear();
            for (int j = 0; j < b3.size(); ++j) {
                final com.untis.mobile.persistence.realm.a a3 = b3.get(j);
                final com.untis.mobile.persistence.realm.a a4 = (com.untis.mobile.persistence.realm.a)map.get(a3);
                if (a4 != null) {
                    b4.add(a4);
                }
                else {
                    b4.add(x0.v8(f0, (x0.b)f0.H().j(com.untis.mobile.persistence.realm.a.class), a3, b2, map, set));
                }
            }
        }
        final com.untis.mobile.persistence.realm.period.a k = c.K();
        com.untis.mobile.persistence.realm.period.a z8;
        if (k == null) {
            z8 = null;
        }
        else {
            z8 = (com.untis.mobile.persistence.realm.period.a)map.get(k);
            if (z8 == null) {
                z8 = t4.z8(f0, (t4.b)f0.H().j(com.untis.mobile.persistence.realm.period.a.class), k, b2, map, set);
            }
        }
        p6.k5(z8);
        final l0<com.untis.mobile.persistence.realm.period.a> a5 = c.a1();
        if (a5 != null) {
            final l0<com.untis.mobile.persistence.realm.period.a> a6 = p6.a1();
            a6.clear();
            for (int n2 = 0; n2 < a5.size(); ++n2) {
                final com.untis.mobile.persistence.realm.period.a a7 = a5.get(n2);
                com.untis.mobile.persistence.realm.period.a z9 = (com.untis.mobile.persistence.realm.period.a)map.get(a7);
                if (z9 == null) {
                    z9 = t4.z8(f0, (t4.b)f0.H().j(com.untis.mobile.persistence.realm.period.a.class), a7, b2, map, set);
                }
                a6.add(z9);
            }
        }
        final l0<com.untis.mobile.persistence.realm.period.a> z10 = c.Z();
        if (z10 != null) {
            final l0<com.untis.mobile.persistence.realm.period.a> z11 = p6.Z();
            z11.clear();
            for (int n3 = 0; n3 < z10.size(); ++n3) {
                final com.untis.mobile.persistence.realm.period.a a8 = z10.get(n3);
                com.untis.mobile.persistence.realm.period.a z12 = (com.untis.mobile.persistence.realm.period.a)map.get(a8);
                if (z12 == null) {
                    z12 = t4.z8(f0, (t4.b)f0.H().j(com.untis.mobile.persistence.realm.period.a.class), a8, b2, map, set);
                }
                z11.add(z12);
            }
        }
        final l0<com.untis.mobile.persistence.realm.period.a> h0 = c.h0();
        if (h0 != null) {
            final l0<com.untis.mobile.persistence.realm.period.a> h2 = p6.h0();
            h2.clear();
            for (int n4 = 0; n4 < h0.size(); ++n4) {
                final com.untis.mobile.persistence.realm.period.a a9 = h0.get(n4);
                com.untis.mobile.persistence.realm.period.a z13 = (com.untis.mobile.persistence.realm.period.a)map.get(a9);
                if (z13 == null) {
                    z13 = t4.z8(f0, (t4.b)f0.H().j(com.untis.mobile.persistence.realm.period.a.class), a9, b2, map, set);
                }
                h2.add(z13);
            }
        }
        final l0<com.untis.mobile.persistence.realm.b> e6 = c.e6();
        if (e6 != null) {
            final l0<com.untis.mobile.persistence.realm.b> e7 = p6.e6();
            e7.clear();
            for (int n5 = n; n5 < e6.size(); ++n5) {
                final com.untis.mobile.persistence.realm.b b5 = e6.get(n5);
                com.untis.mobile.persistence.realm.b v8 = (com.untis.mobile.persistence.realm.b)map.get(b5);
                if (v8 == null) {
                    v8 = z0.v8(f0, (z0.b)f0.H().j(com.untis.mobile.persistence.realm.b.class), b5, b2, map, set);
                }
                e7.add(v8);
            }
        }
        return p6;
    }
    
    public static c d9(final f0 f0, final b b, final c c, final boolean b2, final Map<n0, p> map, final Set<q> set) {
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
        Label_0233: {
            if (b2) {
                x2 = f0.x2(c.class);
                final long r = ((Table)x2).r(b.e, c.a());
                if (r == -1L) {
                    b3 = false;
                    x2 = p8;
                    break Label_0233;
                }
                try {
                    h.g(f0, ((Table)x2).R(r), b, false, Collections.emptyList());
                    x2 = new x4();
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
            c2 = q9(f0, b, (c)x2, c, map, set);
        }
        else {
            c2 = c9(f0, b, c, b2, map, set);
        }
        return c2;
    }
    
    public static b e9(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static c f9(final c c, int i, final int n, final Map<n0, p.a<n0>> map) {
        if (i <= n && c != null) {
            final p.a a = map.get(c);
            c c2;
            if (a == null) {
                c2 = new c();
                map.put(c, (p.a<n0>)new p.a(i, c2));
            }
            else {
                if (i >= a.a) {
                    return (c)a.b;
                }
                c2 = (c)a.b;
                a.a = i;
            }
            c2.b(c.a());
            c2.G(c.C());
            c2.h(c.d());
            c2.i(c.c());
            c2.L1(c.B6());
            c2.q(c.r());
            c2.S1(c.O2());
            c2.i7(c.Y2());
            final int n2 = 0;
            if (i == n) {
                c2.V3(null);
            }
            else {
                final l0<com.untis.mobile.persistence.realm.a> l7 = c.l7();
                final l0<com.untis.mobile.persistence.realm.a> l8 = new l0<com.untis.mobile.persistence.realm.a>();
                c2.V3(l8);
                for (int size = l7.size(), j = 0; j < size; ++j) {
                    l8.add(x0.x8(l7.get(j), i + 1, n, map));
                }
            }
            if (i == n) {
                c2.j1(null);
            }
            else {
                final l0<com.untis.mobile.persistence.realm.a> b1 = c.b1();
                final l0<com.untis.mobile.persistence.realm.a> l9 = new l0<com.untis.mobile.persistence.realm.a>();
                c2.j1(l9);
                for (int size2 = b1.size(), k = 0; k < size2; ++k) {
                    l9.add(x0.x8(b1.get(k), i + 1, n, map));
                }
            }
            final com.untis.mobile.persistence.realm.period.a m = c.K();
            final int n3 = i + 1;
            c2.k5(t4.B8(m, n3, n, map));
            if (i == n) {
                c2.n1(null);
            }
            else {
                final l0<com.untis.mobile.persistence.realm.period.a> a2 = c.a1();
                final l0<com.untis.mobile.persistence.realm.period.a> l10 = new l0<com.untis.mobile.persistence.realm.period.a>();
                c2.n1(l10);
                for (int size3 = a2.size(), n4 = 0; n4 < size3; ++n4) {
                    l10.add(t4.B8(a2.get(n4), n3, n, map));
                }
            }
            if (i == n) {
                c2.U(null);
            }
            else {
                final l0<com.untis.mobile.persistence.realm.period.a> z = c.Z();
                final l0<com.untis.mobile.persistence.realm.period.a> l11 = new l0<com.untis.mobile.persistence.realm.period.a>();
                c2.U(l11);
                for (int size4 = z.size(), n5 = 0; n5 < size4; ++n5) {
                    l11.add(t4.B8(z.get(n5), n3, n, map));
                }
            }
            if (i == n) {
                c2.t0(null);
            }
            else {
                final l0<com.untis.mobile.persistence.realm.period.a> h0 = c.h0();
                final l0<com.untis.mobile.persistence.realm.period.a> l12 = new l0<com.untis.mobile.persistence.realm.period.a>();
                c2.t0(l12);
                for (int size5 = h0.size(), n6 = 0; n6 < size5; ++n6) {
                    l12.add(t4.B8(h0.get(n6), n3, n, map));
                }
            }
            if (i == n) {
                c2.s2(null);
            }
            else {
                final l0<com.untis.mobile.persistence.realm.b> e6 = c.e6();
                final l0<com.untis.mobile.persistence.realm.b> l13 = new l0<com.untis.mobile.persistence.realm.b>();
                c2.s2(l13);
                int size6;
                for (size6 = e6.size(), i = n2; i < size6; ++i) {
                    l13.add(z0.x8(e6.get(i), n3, n, map));
                }
            }
            c2.q5(c.P5());
            c2.t7(c.A7());
            c2.H1(c.O0());
            return c2;
        }
        return null;
    }
    
    private static OsObjectSchemaInfo g9() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmPeriod", false, 18, 0);
        final RealmFieldType integer = RealmFieldType.INTEGER;
        b.c("", "id", integer, true, false, true);
        b.c("", "lessonId", integer, false, false, true);
        b.c("", "start", integer, false, false, true);
        b.c("", "end", integer, false, false, true);
        b.c("", "backgroundColor", integer, false, false, true);
        b.c("", "textColor", integer, false, false, true);
        b.c("", "innerBackgroundColor", integer, false, false, true);
        b.c("", "innerTextColor", integer, false, false, true);
        final RealmFieldType list = RealmFieldType.LIST;
        b.b("", "rights", list, "RealmInteger");
        b.b("", "states", list, "RealmInteger");
        b.b("", "subject", RealmFieldType.OBJECT, "RealmElementPair");
        b.b("", "klassen", list, "RealmElementPair");
        b.b("", "rooms", list, "RealmElementPair");
        b.b("", "teachers", list, "RealmElementPair");
        b.b("", "blockIds", list, "RealmLong");
        final RealmFieldType boolean1 = RealmFieldType.BOOLEAN;
        b.c("", "breakSuperVision", boolean1, false, false, true);
        b.c("", "channelId", RealmFieldType.STRING, false, false, false);
        b.c("", "isOnlinePeriod", boolean1, false, false, true);
        return b.e();
    }
    
    public static c h9(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final ArrayList<String> list = new ArrayList<String>(7);
        Object x2 = null;
        Label_0144: {
            if (b) {
                x2 = f0.x2(c.class);
                final long e = ((b)f0.H().j(c.class)).e;
                long r = -1L;
                if (!jsonObject.isNull("id")) {
                    r = ((Table)x2).r(e, jsonObject.getLong("id"));
                }
                if (r != -1L) {
                    final io.realm.a.h h = io.realm.a.W.get();
                    try {
                        h.g(f0, ((Table)x2).R(r), f0.H().j(c.class), false, Collections.emptyList());
                        x2 = new x4();
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
            if (jsonObject.has("rights")) {
                list.add("rights");
            }
            if (jsonObject.has("states")) {
                list.add("states");
            }
            if (jsonObject.has("subject")) {
                list.add("subject");
            }
            if (jsonObject.has("klassen")) {
                list.add("klassen");
            }
            if (jsonObject.has("rooms")) {
                list.add("rooms");
            }
            if (jsonObject.has("teachers")) {
                list.add("teachers");
            }
            if (jsonObject.has("blockIds")) {
                list.add("blockIds");
            }
            if (!jsonObject.has("id")) {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
            x4 x3;
            if (jsonObject.isNull("id")) {
                x3 = f0.p1((Class<x4>)c.class, null, true, list);
            }
            else {
                x3 = f0.p1((Class<x4>)c.class, jsonObject.getLong("id"), true, list);
            }
            o = x3;
        }
        if (jsonObject.has("lessonId")) {
            if (jsonObject.isNull("lessonId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'lessonId' to null.");
            }
            ((y4)o).G(jsonObject.getLong("lessonId"));
        }
        if (jsonObject.has("start")) {
            if (jsonObject.isNull("start")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'start' to null.");
            }
            ((y4)o).h(jsonObject.getLong("start"));
        }
        if (jsonObject.has("end")) {
            if (jsonObject.isNull("end")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'end' to null.");
            }
            ((y4)o).i(jsonObject.getLong("end"));
        }
        if (jsonObject.has("backgroundColor")) {
            if (jsonObject.isNull("backgroundColor")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'backgroundColor' to null.");
            }
            ((y4)o).L1(jsonObject.getInt("backgroundColor"));
        }
        if (jsonObject.has("textColor")) {
            if (jsonObject.isNull("textColor")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'textColor' to null.");
            }
            ((y4)o).q(jsonObject.getInt("textColor"));
        }
        if (jsonObject.has("innerBackgroundColor")) {
            if (jsonObject.isNull("innerBackgroundColor")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'innerBackgroundColor' to null.");
            }
            ((y4)o).S1(jsonObject.getInt("innerBackgroundColor"));
        }
        if (jsonObject.has("innerTextColor")) {
            if (jsonObject.isNull("innerTextColor")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'innerTextColor' to null.");
            }
            ((y4)o).i7(jsonObject.getInt("innerTextColor"));
        }
        final boolean has = jsonObject.has("rights");
        final int n = 0;
        if (has) {
            if (jsonObject.isNull("rights")) {
                ((y4)o).V3(null);
            }
            else {
                ((y4)o).l7().clear();
                final JSONArray jsonArray = jsonObject.getJSONArray("rights");
                for (int i = 0; i < jsonArray.length(); ++i) {
                    ((y4)o).l7().add(x0.z8(f0, jsonArray.getJSONObject(i), b));
                }
            }
        }
        if (jsonObject.has("states")) {
            if (jsonObject.isNull("states")) {
                ((y4)o).j1(null);
            }
            else {
                ((y4)o).b1().clear();
                final JSONArray jsonArray2 = jsonObject.getJSONArray("states");
                for (int j = 0; j < jsonArray2.length(); ++j) {
                    ((y4)o).b1().add(x0.z8(f0, jsonArray2.getJSONObject(j), b));
                }
            }
        }
        if (jsonObject.has("subject")) {
            if (jsonObject.isNull("subject")) {
                ((y4)o).k5(null);
            }
            else {
                ((y4)o).k5(t4.D8(f0, jsonObject.getJSONObject("subject"), b));
            }
        }
        if (jsonObject.has("klassen")) {
            if (jsonObject.isNull("klassen")) {
                ((y4)o).n1(null);
            }
            else {
                ((y4)o).a1().clear();
                final JSONArray jsonArray3 = jsonObject.getJSONArray("klassen");
                for (int k = 0; k < jsonArray3.length(); ++k) {
                    ((y4)o).a1().add(t4.D8(f0, jsonArray3.getJSONObject(k), b));
                }
            }
        }
        if (jsonObject.has("rooms")) {
            if (jsonObject.isNull("rooms")) {
                ((y4)o).U(null);
            }
            else {
                ((y4)o).Z().clear();
                final JSONArray jsonArray4 = jsonObject.getJSONArray("rooms");
                for (int l = 0; l < jsonArray4.length(); ++l) {
                    ((y4)o).Z().add(t4.D8(f0, jsonArray4.getJSONObject(l), b));
                }
            }
        }
        if (jsonObject.has("teachers")) {
            if (jsonObject.isNull("teachers")) {
                ((y4)o).t0(null);
            }
            else {
                ((y4)o).h0().clear();
                final JSONArray jsonArray5 = jsonObject.getJSONArray("teachers");
                for (int n2 = 0; n2 < jsonArray5.length(); ++n2) {
                    ((y4)o).h0().add(t4.D8(f0, jsonArray5.getJSONObject(n2), b));
                }
            }
        }
        if (jsonObject.has("blockIds")) {
            if (jsonObject.isNull("blockIds")) {
                ((y4)o).s2(null);
            }
            else {
                ((y4)o).e6().clear();
                final JSONArray jsonArray6 = jsonObject.getJSONArray("blockIds");
                for (int n3 = n; n3 < jsonArray6.length(); ++n3) {
                    ((y4)o).e6().add(z0.z8(f0, jsonArray6.getJSONObject(n3), b));
                }
            }
        }
        if (jsonObject.has("breakSuperVision")) {
            if (jsonObject.isNull("breakSuperVision")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'breakSuperVision' to null.");
            }
            ((y4)o).q5(jsonObject.getBoolean("breakSuperVision"));
        }
        if (jsonObject.has("channelId")) {
            if (jsonObject.isNull("channelId")) {
                ((y4)o).t7(null);
            }
            else {
                ((y4)o).t7(jsonObject.getString("channelId"));
            }
        }
        if (jsonObject.has("isOnlinePeriod")) {
            if (jsonObject.isNull("isOnlinePeriod")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'isOnlinePeriod' to null.");
            }
            ((y4)o).H1(jsonObject.getBoolean("isOnlinePeriod"));
        }
        return (c)o;
    }
    
    @TargetApi(11)
    public static c i9(final f0 f0, final JsonReader jsonReader) throws IOException {
        final c c = new c();
        jsonReader.beginObject();
        boolean b = false;
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
                c.b(jsonReader.nextLong());
                b = true;
            }
            else if (nextName.equals("lessonId")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'lessonId' to null.");
                }
                c.G(jsonReader.nextLong());
            }
            else if (nextName.equals("start")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'start' to null.");
                }
                c.h(jsonReader.nextLong());
            }
            else if (nextName.equals("end")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'end' to null.");
                }
                c.i(jsonReader.nextLong());
            }
            else if (nextName.equals("backgroundColor")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'backgroundColor' to null.");
                }
                c.L1(jsonReader.nextInt());
            }
            else if (nextName.equals("textColor")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'textColor' to null.");
                }
                c.q(jsonReader.nextInt());
            }
            else if (nextName.equals("innerBackgroundColor")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'innerBackgroundColor' to null.");
                }
                c.S1(jsonReader.nextInt());
            }
            else if (nextName.equals("innerTextColor")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'innerTextColor' to null.");
                }
                c.i7(jsonReader.nextInt());
            }
            else {
                if (nextName.equals("rights")) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.skipValue();
                        c.V3(null);
                        continue;
                    }
                    c.V3(new l0<com.untis.mobile.persistence.realm.a>());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        c.l7().add(x0.A8(f0, jsonReader));
                    }
                }
                else if (nextName.equals("states")) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.skipValue();
                        c.j1(null);
                        continue;
                    }
                    c.j1(new l0<com.untis.mobile.persistence.realm.a>());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        c.b1().add(x0.A8(f0, jsonReader));
                    }
                }
                else if (nextName.equals("subject")) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.skipValue();
                        c.k5(null);
                        continue;
                    }
                    c.k5(t4.E8(f0, jsonReader));
                    continue;
                }
                else if (nextName.equals("klassen")) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.skipValue();
                        c.n1(null);
                        continue;
                    }
                    c.n1(new l0<com.untis.mobile.persistence.realm.period.a>());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        c.a1().add(t4.E8(f0, jsonReader));
                    }
                }
                else if (nextName.equals("rooms")) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.skipValue();
                        c.U(null);
                        continue;
                    }
                    c.U(new l0<com.untis.mobile.persistence.realm.period.a>());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        c.Z().add(t4.E8(f0, jsonReader));
                    }
                }
                else if (nextName.equals("teachers")) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.skipValue();
                        c.t0(null);
                        continue;
                    }
                    c.t0(new l0<com.untis.mobile.persistence.realm.period.a>());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        c.h0().add(t4.E8(f0, jsonReader));
                    }
                }
                else if (nextName.equals("blockIds")) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.skipValue();
                        c.s2(null);
                        continue;
                    }
                    c.s2(new l0<com.untis.mobile.persistence.realm.b>());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        c.e6().add(z0.A8(f0, jsonReader));
                    }
                }
                else if (nextName.equals("breakSuperVision")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        c.q5(jsonReader.nextBoolean());
                        continue;
                    }
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'breakSuperVision' to null.");
                }
                else if (nextName.equals("channelId")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        c.t7(jsonReader.nextString());
                        continue;
                    }
                    jsonReader.skipValue();
                    c.t7(null);
                    continue;
                }
                else {
                    if (!nextName.equals("isOnlinePeriod")) {
                        jsonReader.skipValue();
                        continue;
                    }
                    if (jsonReader.peek() != JsonToken.NULL) {
                        c.H1(jsonReader.nextBoolean());
                        continue;
                    }
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'isOnlinePeriod' to null.");
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
        if (b) {
            return f0.G0(c, new q[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }
    
    public static OsObjectSchemaInfo j9() {
        return x4.k0;
    }
    
    public static String k9() {
        return "RealmPeriod";
    }
    
    public static long l9(final f0 f0, final c c, final Map<n0, Long> map) {
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
        final Long value = c.a();
        long l;
        if (value != null) {
            l = Table.nativeFindFirstInt(nativePtr, e, c.a());
        }
        else {
            l = -1L;
        }
        if (l == -1L) {
            l = OsObject.createRowWithPrimaryKey(x2, e, c.a());
        }
        else {
            Table.v0(value);
        }
        map.put(c, l);
        Table.nativeSetLong(nativePtr, b.f, l, c.C(), false);
        Table.nativeSetLong(nativePtr, b.g, l, c.d(), false);
        Table.nativeSetLong(nativePtr, b.h, l, c.c(), false);
        Table.nativeSetLong(nativePtr, b.i, l, c.B6(), false);
        Table.nativeSetLong(nativePtr, b.j, l, c.r(), false);
        Table.nativeSetLong(nativePtr, b.k, l, c.O2(), false);
        Table.nativeSetLong(nativePtr, b.l, l, c.Y2(), false);
        final l0<com.untis.mobile.persistence.realm.a> l2 = c.l7();
        if (l2 != null) {
            final OsList list = new OsList(x2.R(l), b.m);
            for (final com.untis.mobile.persistence.realm.a a : l2) {
                Long value2;
                if ((value2 = map.get(a)) == null) {
                    value2 = x0.D8(f0, a, map);
                }
                list.l(value2);
            }
        }
        final l0<com.untis.mobile.persistence.realm.a> b2 = c.b1();
        if (b2 != null) {
            final OsList list2 = new OsList(x2.R(l), b.n);
            for (final com.untis.mobile.persistence.realm.a a2 : b2) {
                Long value3;
                if ((value3 = map.get(a2)) == null) {
                    value3 = x0.D8(f0, a2, map);
                }
                list2.l(value3);
            }
        }
        final com.untis.mobile.persistence.realm.period.a k = c.K();
        if (k != null) {
            Long value4;
            if ((value4 = map.get(k)) == null) {
                value4 = t4.H8(f0, k, map);
            }
            Table.nativeSetLink(nativePtr, b.o, l, value4, false);
        }
        final l0<com.untis.mobile.persistence.realm.period.a> a3 = c.a1();
        if (a3 != null) {
            final OsList list3 = new OsList(x2.R(l), b.p);
            for (final com.untis.mobile.persistence.realm.period.a a4 : a3) {
                Long value5;
                if ((value5 = map.get(a4)) == null) {
                    value5 = t4.H8(f0, a4, map);
                }
                list3.l(value5);
            }
        }
        final l0<com.untis.mobile.persistence.realm.period.a> z = c.Z();
        if (z != null) {
            final OsList list4 = new OsList(x2.R(l), b.q);
            for (final com.untis.mobile.persistence.realm.period.a a5 : z) {
                Long value6;
                if ((value6 = map.get(a5)) == null) {
                    value6 = t4.H8(f0, a5, map);
                }
                list4.l(value6);
            }
        }
        final l0<com.untis.mobile.persistence.realm.period.a> h0 = c.h0();
        if (h0 != null) {
            final OsList list5 = new OsList(x2.R(l), b.r);
            for (final com.untis.mobile.persistence.realm.period.a a6 : h0) {
                Long value7;
                if ((value7 = map.get(a6)) == null) {
                    value7 = t4.H8(f0, a6, map);
                }
                list5.l(value7);
            }
        }
        final l0<com.untis.mobile.persistence.realm.b> e2 = c.e6();
        if (e2 != null) {
            final OsList list6 = new OsList(x2.R(l), b.s);
            for (final com.untis.mobile.persistence.realm.b b3 : e2) {
                Long value8;
                if ((value8 = map.get(b3)) == null) {
                    value8 = z0.D8(f0, b3, map);
                }
                list6.l(value8);
            }
        }
        Table.nativeSetBoolean(nativePtr, b.t, l, c.P5(), false);
        final String a7 = c.A7();
        if (a7 != null) {
            Table.nativeSetString(nativePtr, b.u, l, a7, false);
        }
        Table.nativeSetBoolean(nativePtr, b.v, l, c.O0(), false);
        return l;
    }
    
    public static void m9(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
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
            final Long value = c.a();
            long l;
            if (value != null) {
                l = Table.nativeFindFirstInt(nativePtr, e, c.a());
            }
            else {
                l = -1L;
            }
            if (l == -1L) {
                l = OsObject.createRowWithPrimaryKey(x2, e, c.a());
            }
            else {
                Table.v0(value);
            }
            map.put(c, l);
            Table.nativeSetLong(nativePtr, b.f, l, c.C(), false);
            Table.nativeSetLong(nativePtr, b.g, l, c.d(), false);
            Table.nativeSetLong(nativePtr, b.h, l, c.c(), false);
            Table.nativeSetLong(nativePtr, b.i, l, c.B6(), false);
            Table.nativeSetLong(nativePtr, b.j, l, c.r(), false);
            Table.nativeSetLong(nativePtr, b.k, l, c.O2(), false);
            Table.nativeSetLong(nativePtr, b.l, l, c.Y2(), false);
            final l0<com.untis.mobile.persistence.realm.a> l2 = c.l7();
            if (l2 != null) {
                final OsList list = new OsList(x2.R(l), b.m);
                for (final com.untis.mobile.persistence.realm.a a : l2) {
                    Long value2;
                    if ((value2 = map.get(a)) == null) {
                        value2 = x0.D8(f0, a, map);
                    }
                    list.l(value2);
                }
            }
            final l0<com.untis.mobile.persistence.realm.a> b2 = c.b1();
            if (b2 != null) {
                final OsList list2 = new OsList(x2.R(l), b.n);
                for (final com.untis.mobile.persistence.realm.a a2 : b2) {
                    Long value3;
                    if ((value3 = map.get(a2)) == null) {
                        value3 = x0.D8(f0, a2, map);
                    }
                    list2.l(value3);
                }
            }
            final com.untis.mobile.persistence.realm.period.a k = c.K();
            if (k != null) {
                Long value4;
                if ((value4 = map.get(k)) == null) {
                    value4 = t4.H8(f0, k, map);
                }
                x2.p0(b.o, l, value4, false);
            }
            final l0<com.untis.mobile.persistence.realm.period.a> a3 = c.a1();
            if (a3 != null) {
                final OsList list3 = new OsList(x2.R(l), b.p);
                for (final com.untis.mobile.persistence.realm.period.a a4 : a3) {
                    Long value5;
                    if ((value5 = map.get(a4)) == null) {
                        value5 = t4.H8(f0, a4, map);
                    }
                    list3.l(value5);
                }
            }
            final l0<com.untis.mobile.persistence.realm.period.a> z = c.Z();
            if (z != null) {
                final OsList list4 = new OsList(x2.R(l), b.q);
                for (final com.untis.mobile.persistence.realm.period.a a5 : z) {
                    Long value6;
                    if ((value6 = map.get(a5)) == null) {
                        value6 = t4.H8(f0, a5, map);
                    }
                    list4.l(value6);
                }
            }
            final l0<com.untis.mobile.persistence.realm.period.a> h0 = c.h0();
            if (h0 != null) {
                final OsList list5 = new OsList(x2.R(l), b.r);
                for (final com.untis.mobile.persistence.realm.period.a a6 : h0) {
                    Long value7;
                    if ((value7 = map.get(a6)) == null) {
                        value7 = t4.H8(f0, a6, map);
                    }
                    list5.l(value7);
                }
            }
            final l0<com.untis.mobile.persistence.realm.b> e2 = c.e6();
            if (e2 != null) {
                final OsList list6 = new OsList(x2.R(l), b.s);
                for (final com.untis.mobile.persistence.realm.b b3 : e2) {
                    Long value8;
                    if ((value8 = map.get(b3)) == null) {
                        value8 = z0.D8(f0, b3, map);
                    }
                    list6.l(value8);
                }
            }
            Table.nativeSetBoolean(nativePtr, b.t, l, c.P5(), false);
            final String a7 = c.A7();
            if (a7 != null) {
                Table.nativeSetString(nativePtr, b.u, l, a7, false);
            }
            Table.nativeSetBoolean(nativePtr, b.v, l, c.O0(), false);
        }
    }
    
    public static long n9(final f0 f0, final c c, final Map<n0, Long> map) {
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
        if (Long.valueOf(c.a()) != null) {
            nativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, e, c.a());
        }
        else {
            nativeFindFirstInt = -1L;
        }
        long rowWithPrimaryKey = nativeFindFirstInt;
        if (nativeFindFirstInt == -1L) {
            rowWithPrimaryKey = OsObject.createRowWithPrimaryKey(x2, e, c.a());
        }
        map.put(c, rowWithPrimaryKey);
        Table.nativeSetLong(nativePtr, b.f, rowWithPrimaryKey, c.C(), false);
        Table.nativeSetLong(nativePtr, b.g, rowWithPrimaryKey, c.d(), false);
        Table.nativeSetLong(nativePtr, b.h, rowWithPrimaryKey, c.c(), false);
        Table.nativeSetLong(nativePtr, b.i, rowWithPrimaryKey, c.B6(), false);
        Table.nativeSetLong(nativePtr, b.j, rowWithPrimaryKey, c.r(), false);
        Table.nativeSetLong(nativePtr, b.k, rowWithPrimaryKey, c.O2(), false);
        Table.nativeSetLong(nativePtr, b.l, rowWithPrimaryKey, c.Y2(), false);
        final OsList list = new OsList(x2.R(rowWithPrimaryKey), b.m);
        final l0<com.untis.mobile.persistence.realm.a> l7 = c.l7();
        long n;
        if (l7 != null && l7.size() == list.b0()) {
            final int size = l7.size();
            int i = 0;
            n = nativePtr;
            while (i < size) {
                final com.untis.mobile.persistence.realm.a a = l7.get(i);
                Long value;
                if ((value = map.get(a)) == null) {
                    value = x0.F8(f0, a, map);
                }
                list.Z(i, value);
                ++i;
            }
        }
        else {
            list.M();
            n = nativePtr;
            if (l7 != null) {
                final Iterator<com.untis.mobile.persistence.realm.a> iterator = l7.iterator();
                while (true) {
                    n = nativePtr;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    final com.untis.mobile.persistence.realm.a a2 = iterator.next();
                    Long value2;
                    if ((value2 = map.get(a2)) == null) {
                        value2 = x0.F8(f0, a2, map);
                    }
                    list.l(value2);
                }
            }
        }
        final OsList list2 = new OsList(x2.R(rowWithPrimaryKey), b.n);
        final l0<com.untis.mobile.persistence.realm.a> b2 = c.b1();
        if (b2 != null && b2.size() == list2.b0()) {
            for (int size2 = b2.size(), j = 0; j < size2; ++j) {
                final com.untis.mobile.persistence.realm.a a3 = b2.get(j);
                Long value3;
                if ((value3 = map.get(a3)) == null) {
                    value3 = x0.F8(f0, a3, map);
                }
                list2.Z(j, value3);
            }
        }
        else {
            list2.M();
            if (b2 != null) {
                for (final com.untis.mobile.persistence.realm.a a4 : b2) {
                    Long value4;
                    if ((value4 = map.get(a4)) == null) {
                        value4 = x0.F8(f0, a4, map);
                    }
                    list2.l(value4);
                }
            }
        }
        final com.untis.mobile.persistence.realm.period.a k = c.K();
        if (k != null) {
            Long value5;
            if ((value5 = map.get(k)) == null) {
                value5 = t4.J8(f0, k, map);
            }
            Table.nativeSetLink(n, b.o, rowWithPrimaryKey, value5, false);
        }
        else {
            Table.nativeNullifyLink(n, b.o, rowWithPrimaryKey);
        }
        final OsList list3 = new OsList(x2.R(rowWithPrimaryKey), b.p);
        final l0<com.untis.mobile.persistence.realm.period.a> a5 = c.a1();
        if (a5 != null && a5.size() == list3.b0()) {
            for (int size3 = a5.size(), n2 = 0; n2 < size3; ++n2) {
                final com.untis.mobile.persistence.realm.period.a a6 = a5.get(n2);
                Long value6;
                if ((value6 = map.get(a6)) == null) {
                    value6 = t4.J8(f0, a6, map);
                }
                list3.Z(n2, value6);
            }
        }
        else {
            list3.M();
            if (a5 != null) {
                for (final com.untis.mobile.persistence.realm.period.a a7 : a5) {
                    Long value7;
                    if ((value7 = map.get(a7)) == null) {
                        value7 = t4.J8(f0, a7, map);
                    }
                    list3.l(value7);
                }
            }
        }
        final OsList list4 = new OsList(x2.R(rowWithPrimaryKey), b.q);
        final l0<com.untis.mobile.persistence.realm.period.a> z = c.Z();
        if (z != null && z.size() == list4.b0()) {
            for (int size4 = z.size(), n3 = 0; n3 < size4; ++n3) {
                final com.untis.mobile.persistence.realm.period.a a8 = z.get(n3);
                Long value8;
                if ((value8 = map.get(a8)) == null) {
                    value8 = t4.J8(f0, a8, map);
                }
                list4.Z(n3, value8);
            }
        }
        else {
            list4.M();
            if (z != null) {
                for (final com.untis.mobile.persistence.realm.period.a a9 : z) {
                    Long value9;
                    if ((value9 = map.get(a9)) == null) {
                        value9 = t4.J8(f0, a9, map);
                    }
                    list4.l(value9);
                }
            }
        }
        final OsList list5 = new OsList(x2.R(rowWithPrimaryKey), b.r);
        final l0<com.untis.mobile.persistence.realm.period.a> h0 = c.h0();
        if (h0 != null && h0.size() == list5.b0()) {
            for (int size5 = h0.size(), n4 = 0; n4 < size5; ++n4) {
                final com.untis.mobile.persistence.realm.period.a a10 = h0.get(n4);
                Long value10;
                if ((value10 = map.get(a10)) == null) {
                    value10 = t4.J8(f0, a10, map);
                }
                list5.Z(n4, value10);
            }
        }
        else {
            list5.M();
            if (h0 != null) {
                for (final com.untis.mobile.persistence.realm.period.a a11 : h0) {
                    Long value11;
                    if ((value11 = map.get(a11)) == null) {
                        value11 = t4.J8(f0, a11, map);
                    }
                    list5.l(value11);
                }
            }
        }
        final OsList list6 = new OsList(x2.R(rowWithPrimaryKey), b.s);
        final l0<com.untis.mobile.persistence.realm.b> e2 = c.e6();
        if (e2 != null && e2.size() == list6.b0()) {
            for (int size6 = e2.size(), n5 = 0; n5 < size6; ++n5) {
                final com.untis.mobile.persistence.realm.b b3 = e2.get(n5);
                Long value12;
                if ((value12 = map.get(b3)) == null) {
                    value12 = z0.F8(f0, b3, map);
                }
                list6.Z(n5, value12);
            }
        }
        else {
            list6.M();
            if (e2 != null) {
                for (final com.untis.mobile.persistence.realm.b b4 : e2) {
                    Long value13;
                    if ((value13 = map.get(b4)) == null) {
                        value13 = z0.F8(f0, b4, map);
                    }
                    list6.l(value13);
                }
            }
        }
        Table.nativeSetBoolean(n, b.t, rowWithPrimaryKey, c.P5(), false);
        final String a12 = c.A7();
        final long u = b.u;
        if (a12 != null) {
            Table.nativeSetString(n, u, rowWithPrimaryKey, a12, false);
        }
        else {
            Table.nativeSetNull(n, u, rowWithPrimaryKey, false);
        }
        Table.nativeSetBoolean(n, b.v, rowWithPrimaryKey, c.O0(), false);
        return rowWithPrimaryKey;
    }
    
    public static void o9(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(c.class);
        long nativePtr = x2.getNativePtr();
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
            if (Long.valueOf(c.a()) != null) {
                nativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, e, c.a());
            }
            else {
                nativeFindFirstInt = -1L;
            }
            long rowWithPrimaryKey = nativeFindFirstInt;
            if (nativeFindFirstInt == -1L) {
                rowWithPrimaryKey = OsObject.createRowWithPrimaryKey(x2, e, c.a());
            }
            map.put(c, rowWithPrimaryKey);
            Table.nativeSetLong(nativePtr, b.f, rowWithPrimaryKey, c.C(), false);
            Table.nativeSetLong(nativePtr, b.g, rowWithPrimaryKey, c.d(), false);
            Table.nativeSetLong(nativePtr, b.h, rowWithPrimaryKey, c.c(), false);
            Table.nativeSetLong(nativePtr, b.i, rowWithPrimaryKey, c.B6(), false);
            Table.nativeSetLong(nativePtr, b.j, rowWithPrimaryKey, c.r(), false);
            Table.nativeSetLong(nativePtr, b.k, rowWithPrimaryKey, c.O2(), false);
            Table.nativeSetLong(nativePtr, b.l, rowWithPrimaryKey, c.Y2(), false);
            final OsList list = new OsList(x2.R(rowWithPrimaryKey), b.m);
            final l0<com.untis.mobile.persistence.realm.a> l7 = c.l7();
            if (l7 != null && l7.size() == list.b0()) {
                for (int size = l7.size(), i = 0; i < size; ++i) {
                    final com.untis.mobile.persistence.realm.a a = l7.get(i);
                    Long value;
                    if ((value = map.get(a)) == null) {
                        value = x0.F8(f0, a, map);
                    }
                    list.Z(i, value);
                }
            }
            else {
                final long n = nativePtr;
                list.M();
                nativePtr = n;
                if (l7 != null) {
                    final Iterator<com.untis.mobile.persistence.realm.a> iterator2 = l7.iterator();
                    while (true) {
                        nativePtr = n;
                        if (!iterator2.hasNext()) {
                            break;
                        }
                        final com.untis.mobile.persistence.realm.a a2 = iterator2.next();
                        Long value2;
                        if ((value2 = map.get(a2)) == null) {
                            value2 = x0.F8(f0, a2, map);
                        }
                        list.l(value2);
                    }
                }
            }
            final OsList list2 = new OsList(x2.R(rowWithPrimaryKey), b.n);
            final l0<com.untis.mobile.persistence.realm.a> b2 = c.b1();
            if (b2 != null && b2.size() == list2.b0()) {
                for (int size2 = b2.size(), j = 0; j < size2; ++j) {
                    final com.untis.mobile.persistence.realm.a a3 = b2.get(j);
                    Long value3;
                    if ((value3 = map.get(a3)) == null) {
                        value3 = x0.F8(f0, a3, map);
                    }
                    list2.Z(j, value3);
                }
            }
            else {
                list2.M();
                if (b2 != null) {
                    for (final com.untis.mobile.persistence.realm.a a4 : b2) {
                        Long value4;
                        if ((value4 = map.get(a4)) == null) {
                            value4 = x0.F8(f0, a4, map);
                        }
                        list2.l(value4);
                    }
                }
            }
            final com.untis.mobile.persistence.realm.period.a k = c.K();
            if (k != null) {
                Long value5;
                if ((value5 = map.get(k)) == null) {
                    value5 = t4.J8(f0, k, map);
                }
                Table.nativeSetLink(nativePtr, b.o, rowWithPrimaryKey, value5, false);
            }
            else {
                Table.nativeNullifyLink(nativePtr, b.o, rowWithPrimaryKey);
            }
            final OsList list3 = new OsList(x2.R(rowWithPrimaryKey), b.p);
            final l0<com.untis.mobile.persistence.realm.period.a> a5 = c.a1();
            if (a5 != null && a5.size() == list3.b0()) {
                for (int size3 = a5.size(), n2 = 0; n2 < size3; ++n2) {
                    final com.untis.mobile.persistence.realm.period.a a6 = a5.get(n2);
                    Long value6;
                    if ((value6 = map.get(a6)) == null) {
                        value6 = t4.J8(f0, a6, map);
                    }
                    list3.Z(n2, value6);
                }
            }
            else {
                list3.M();
                if (a5 != null) {
                    for (final com.untis.mobile.persistence.realm.period.a a7 : a5) {
                        Long value7;
                        if ((value7 = map.get(a7)) == null) {
                            value7 = t4.J8(f0, a7, map);
                        }
                        list3.l(value7);
                    }
                }
            }
            final OsList list4 = new OsList(x2.R(rowWithPrimaryKey), b.q);
            final l0<com.untis.mobile.persistence.realm.period.a> z = c.Z();
            if (z != null && z.size() == list4.b0()) {
                for (int size4 = z.size(), n3 = 0; n3 < size4; ++n3) {
                    final com.untis.mobile.persistence.realm.period.a a8 = z.get(n3);
                    Long value8;
                    if ((value8 = map.get(a8)) == null) {
                        value8 = t4.J8(f0, a8, map);
                    }
                    list4.Z(n3, value8);
                }
            }
            else {
                list4.M();
                if (z != null) {
                    for (final com.untis.mobile.persistence.realm.period.a a9 : z) {
                        Long value9;
                        if ((value9 = map.get(a9)) == null) {
                            value9 = t4.J8(f0, a9, map);
                        }
                        list4.l(value9);
                    }
                }
            }
            final OsList list5 = new OsList(x2.R(rowWithPrimaryKey), b.r);
            final l0<com.untis.mobile.persistence.realm.period.a> h0 = c.h0();
            if (h0 != null && h0.size() == list5.b0()) {
                for (int size5 = h0.size(), n4 = 0; n4 < size5; ++n4) {
                    final com.untis.mobile.persistence.realm.period.a a10 = h0.get(n4);
                    Long value10;
                    if ((value10 = map.get(a10)) == null) {
                        value10 = t4.J8(f0, a10, map);
                    }
                    list5.Z(n4, value10);
                }
            }
            else {
                list5.M();
                if (h0 != null) {
                    for (final com.untis.mobile.persistence.realm.period.a a11 : h0) {
                        Long value11;
                        if ((value11 = map.get(a11)) == null) {
                            value11 = t4.J8(f0, a11, map);
                        }
                        list5.l(value11);
                    }
                }
            }
            final OsList list6 = new OsList(x2.R(rowWithPrimaryKey), b.s);
            final l0<com.untis.mobile.persistence.realm.b> e2 = c.e6();
            if (e2 != null && e2.size() == list6.b0()) {
                for (int size6 = e2.size(), n5 = 0; n5 < size6; ++n5) {
                    final com.untis.mobile.persistence.realm.b b3 = e2.get(n5);
                    Long value12;
                    if ((value12 = map.get(b3)) == null) {
                        value12 = z0.F8(f0, b3, map);
                    }
                    list6.Z(n5, value12);
                }
            }
            else {
                list6.M();
                if (e2 != null) {
                    for (final com.untis.mobile.persistence.realm.b b4 : e2) {
                        Long value13;
                        if ((value13 = map.get(b4)) == null) {
                            value13 = z0.F8(f0, b4, map);
                        }
                        list6.l(value13);
                    }
                }
            }
            Table.nativeSetBoolean(nativePtr, b.t, rowWithPrimaryKey, c.P5(), false);
            final String a12 = c.A7();
            final long u = b.u;
            if (a12 != null) {
                Table.nativeSetString(nativePtr, u, rowWithPrimaryKey, a12, false);
            }
            else {
                Table.nativeSetNull(nativePtr, u, rowWithPrimaryKey, false);
            }
            Table.nativeSetBoolean(nativePtr, b.v, rowWithPrimaryKey, c.O0(), false);
        }
    }
    
    static x4 p9(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(c.class), false, Collections.emptyList());
        final x4 x4 = new x4();
        h.a();
        return x4;
    }
    
    static c q9(final f0 f0, final b b, final c c, final c c2, final Map<n0, p> map, final Set<q> set) {
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(c.class), set);
        osObjectBuilder.L(b.e, c2.a());
        osObjectBuilder.L(b.f, c2.C());
        osObjectBuilder.L(b.g, c2.d());
        osObjectBuilder.L(b.h, c2.c());
        osObjectBuilder.K(b.i, c2.B6());
        osObjectBuilder.K(b.j, c2.r());
        osObjectBuilder.K(b.k, c2.O2());
        osObjectBuilder.K(b.l, c2.Y2());
        final l0<com.untis.mobile.persistence.realm.a> l7 = c2.l7();
        if (l7 != null) {
            final l0<n0> l8 = new l0<n0>();
            for (int i = 0; i < l7.size(); ++i) {
                final com.untis.mobile.persistence.realm.a a = l7.get(i);
                final com.untis.mobile.persistence.realm.a a2 = (com.untis.mobile.persistence.realm.a)map.get(a);
                if (a2 != null) {
                    l8.add(a2);
                }
                else {
                    l8.add(x0.v8(f0, (x0.b)f0.H().j(com.untis.mobile.persistence.realm.a.class), a, true, map, set));
                }
            }
            osObjectBuilder.Z(b.m, l8);
        }
        else {
            osObjectBuilder.Z(b.m, new l0<n0>());
        }
        final l0<com.untis.mobile.persistence.realm.a> b2 = c2.b1();
        if (b2 != null) {
            final l0<n0> l9 = new l0<n0>();
            for (int j = 0; j < b2.size(); ++j) {
                final com.untis.mobile.persistence.realm.a a3 = b2.get(j);
                final com.untis.mobile.persistence.realm.a a4 = (com.untis.mobile.persistence.realm.a)map.get(a3);
                if (a4 != null) {
                    l9.add(a4);
                }
                else {
                    l9.add(x0.v8(f0, (x0.b)f0.H().j(com.untis.mobile.persistence.realm.a.class), a3, true, map, set));
                }
            }
            osObjectBuilder.Z(b.n, l9);
        }
        else {
            osObjectBuilder.Z(b.n, new l0<n0>());
        }
        final com.untis.mobile.persistence.realm.period.a k = c2.K();
        if (k == null) {
            osObjectBuilder.V(b.o);
        }
        else {
            final com.untis.mobile.persistence.realm.period.a a5 = (com.untis.mobile.persistence.realm.period.a)map.get(k);
            if (a5 != null) {
                osObjectBuilder.W(b.o, a5);
            }
            else {
                osObjectBuilder.W(b.o, t4.z8(f0, (t4.b)f0.H().j(com.untis.mobile.persistence.realm.period.a.class), k, true, map, set));
            }
        }
        final l0<com.untis.mobile.persistence.realm.period.a> a6 = c2.a1();
        if (a6 != null) {
            final l0<n0> l10 = new l0<n0>();
            for (int n = 0; n < a6.size(); ++n) {
                final com.untis.mobile.persistence.realm.period.a a7 = a6.get(n);
                com.untis.mobile.persistence.realm.period.a z8 = (com.untis.mobile.persistence.realm.period.a)map.get(a7);
                if (z8 == null) {
                    z8 = t4.z8(f0, (t4.b)f0.H().j(com.untis.mobile.persistence.realm.period.a.class), a7, true, map, set);
                }
                l10.add(z8);
            }
            osObjectBuilder.Z(b.p, l10);
        }
        else {
            osObjectBuilder.Z(b.p, new l0<n0>());
        }
        final l0<com.untis.mobile.persistence.realm.period.a> z9 = c2.Z();
        if (z9 != null) {
            final l0<n0> l11 = new l0<n0>();
            for (int n2 = 0; n2 < z9.size(); ++n2) {
                final com.untis.mobile.persistence.realm.period.a a8 = z9.get(n2);
                com.untis.mobile.persistence.realm.period.a z10 = (com.untis.mobile.persistence.realm.period.a)map.get(a8);
                if (z10 == null) {
                    z10 = t4.z8(f0, (t4.b)f0.H().j(com.untis.mobile.persistence.realm.period.a.class), a8, true, map, set);
                }
                l11.add(z10);
            }
            osObjectBuilder.Z(b.q, l11);
        }
        else {
            osObjectBuilder.Z(b.q, new l0<n0>());
        }
        final l0<com.untis.mobile.persistence.realm.period.a> h0 = c2.h0();
        if (h0 != null) {
            final l0<n0> l12 = new l0<n0>();
            for (int n3 = 0; n3 < h0.size(); ++n3) {
                final com.untis.mobile.persistence.realm.period.a a9 = h0.get(n3);
                com.untis.mobile.persistence.realm.period.a z11 = (com.untis.mobile.persistence.realm.period.a)map.get(a9);
                if (z11 == null) {
                    z11 = t4.z8(f0, (t4.b)f0.H().j(com.untis.mobile.persistence.realm.period.a.class), a9, true, map, set);
                }
                l12.add(z11);
            }
            osObjectBuilder.Z(b.r, l12);
        }
        else {
            osObjectBuilder.Z(b.r, new l0<n0>());
        }
        final l0<com.untis.mobile.persistence.realm.b> e6 = c2.e6();
        if (e6 != null) {
            final l0<n0> l13 = new l0<n0>();
            for (int n4 = 0; n4 < e6.size(); ++n4) {
                final com.untis.mobile.persistence.realm.b b3 = e6.get(n4);
                com.untis.mobile.persistence.realm.b v8 = (com.untis.mobile.persistence.realm.b)map.get(b3);
                if (v8 == null) {
                    v8 = z0.v8(f0, (z0.b)f0.H().j(com.untis.mobile.persistence.realm.b.class), b3, true, map, set);
                }
                l13.add(v8);
            }
            osObjectBuilder.Z(b.s, l13);
        }
        else {
            osObjectBuilder.Z(b.s, new l0<n0>());
        }
        osObjectBuilder.n(b.t, c2.P5());
        osObjectBuilder.d0(b.u, c2.A7());
        osObjectBuilder.n(b.v, c2.O0());
        osObjectBuilder.i0();
        return c;
    }
    
    @Override
    public String A7() {
        this.c0.f().h();
        return this.c0.g().U(this.b0.u);
    }
    
    @Override
    public int B6() {
        this.c0.f().h();
        return (int)this.c0.g().m(this.b0.i);
    }
    
    @Override
    public long C() {
        this.c0.f().h();
        return this.c0.g().m(this.b0.f);
    }
    
    @Override
    public void G(final long n) {
        if (!this.c0.i()) {
            this.c0.f().h();
            this.c0.g().s(this.b0.f, n);
            return;
        }
        if (!this.c0.d()) {
            return;
        }
        final r g = this.c0.g();
        g.g().q0(this.b0.f, g.l0(), n, true);
    }
    
    @Override
    public void H1(final boolean b) {
        if (!this.c0.i()) {
            this.c0.f().h();
            this.c0.g().i(this.b0.v, b);
            return;
        }
        if (!this.c0.d()) {
            return;
        }
        final r g = this.c0.g();
        g.g().j0(this.b0.v, g.l0(), b, true);
    }
    
    @Override
    public com.untis.mobile.persistence.realm.period.a K() {
        this.c0.f().h();
        if (this.c0.g().G(this.b0.o)) {
            return null;
        }
        return this.c0.f().x(com.untis.mobile.persistence.realm.period.a.class, this.c0.g().P(this.b0.o), false, Collections.emptyList());
    }
    
    @Override
    public void L1(final int n) {
        if (!this.c0.i()) {
            this.c0.f().h();
            this.c0.g().s(this.b0.i, n);
            return;
        }
        if (!this.c0.d()) {
            return;
        }
        final r g = this.c0.g();
        g.g().q0(this.b0.i, g.l0(), n, true);
    }
    
    @Override
    public boolean O0() {
        this.c0.f().h();
        return this.c0.g().l(this.b0.v);
    }
    
    @Override
    public int O2() {
        this.c0.f().h();
        return (int)this.c0.g().m(this.b0.k);
    }
    
    @Override
    public boolean P5() {
        this.c0.f().h();
        return this.c0.g().l(this.b0.t);
    }
    
    @Override
    public void S1(final int n) {
        if (!this.c0.i()) {
            this.c0.f().h();
            this.c0.g().s(this.b0.k, n);
            return;
        }
        if (!this.c0.d()) {
            return;
        }
        final r g = this.c0.g();
        g.g().q0(this.b0.k, g.l0(), n, true);
    }
    
    @Override
    public c0<?> S6() {
        return this.c0;
    }
    
    @Override
    public void U(final l0<com.untis.mobile.persistence.realm.period.a> l0) {
        final boolean i = this.c0.i();
        final int n = 0;
        int j = 0;
        l0<com.untis.mobile.persistence.realm.period.a> l2 = l0;
        if (i) {
            if (!this.c0.d()) {
                return;
            }
            if (this.c0.e().contains("rooms")) {
                return;
            }
            if ((l2 = l0) != null) {
                l2 = l0;
                if (!l0.G0()) {
                    final f0 f0 = (f0)this.c0.f();
                    l2 = new l0<com.untis.mobile.persistence.realm.period.a>();
                    for (final com.untis.mobile.persistence.realm.period.a a : l0) {
                        com.untis.mobile.persistence.realm.period.a a2;
                        if ((a2 = a) != null) {
                            if (p0.j8(a)) {
                                a2 = a;
                            }
                            else {
                                a2 = f0.y0(a, new q[0]);
                            }
                        }
                        l2.add(a2);
                    }
                }
            }
        }
        this.c0.f().h();
        final OsList p = this.c0.g().p(this.b0.q);
        if (l2 != null && l2.size() == p.b0()) {
            while (j < l2.size()) {
                final com.untis.mobile.persistence.realm.period.a a3 = l2.get(j);
                this.c0.c(a3);
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
                final com.untis.mobile.persistence.realm.period.a a4 = l2.get(k);
                this.c0.c(a4);
                p.l(((p)a4).S6().g().l0());
            }
        }
    }
    
    @Override
    public void V3(final l0<com.untis.mobile.persistence.realm.a> l0) {
        final boolean i = this.c0.i();
        final int n = 0;
        int j = 0;
        l0<com.untis.mobile.persistence.realm.a> l2 = l0;
        if (i) {
            if (!this.c0.d()) {
                return;
            }
            if (this.c0.e().contains("rights")) {
                return;
            }
            if ((l2 = l0) != null) {
                l2 = l0;
                if (!l0.G0()) {
                    final f0 f0 = (f0)this.c0.f();
                    l2 = new l0<com.untis.mobile.persistence.realm.a>();
                    for (final com.untis.mobile.persistence.realm.a a : l0) {
                        com.untis.mobile.persistence.realm.a a2;
                        if ((a2 = a) != null) {
                            if (p0.j8(a)) {
                                a2 = a;
                            }
                            else {
                                a2 = f0.y0(a, new q[0]);
                            }
                        }
                        l2.add(a2);
                    }
                }
            }
        }
        this.c0.f().h();
        final OsList p = this.c0.g().p(this.b0.m);
        if (l2 != null && l2.size() == p.b0()) {
            while (j < l2.size()) {
                final com.untis.mobile.persistence.realm.a a3 = l2.get(j);
                this.c0.c(a3);
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
                final com.untis.mobile.persistence.realm.a a4 = l2.get(k);
                this.c0.c(a4);
                p.l(((p)a4).S6().g().l0());
            }
        }
    }
    
    @Override
    public int Y2() {
        this.c0.f().h();
        return (int)this.c0.g().m(this.b0.l);
    }
    
    @Override
    public l0<com.untis.mobile.persistence.realm.period.a> Z() {
        this.c0.f().h();
        final l0<com.untis.mobile.persistence.realm.period.a> g0 = this.g0;
        if (g0 != null) {
            return g0;
        }
        return this.g0 = new l0<com.untis.mobile.persistence.realm.period.a>(com.untis.mobile.persistence.realm.period.a.class, this.c0.g().p(this.b0.q), this.c0.f());
    }
    
    @Override
    public long a() {
        this.c0.f().h();
        return this.c0.g().m(this.b0.e);
    }
    
    @Override
    public l0<com.untis.mobile.persistence.realm.period.a> a1() {
        this.c0.f().h();
        final l0<com.untis.mobile.persistence.realm.period.a> f0 = this.f0;
        if (f0 != null) {
            return f0;
        }
        return this.f0 = new l0<com.untis.mobile.persistence.realm.period.a>(com.untis.mobile.persistence.realm.period.a.class, this.c0.g().p(this.b0.p), this.c0.f());
    }
    
    @Override
    public void b(final long n) {
        if (this.c0.i()) {
            return;
        }
        this.c0.f().h();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }
    
    @Override
    public l0<com.untis.mobile.persistence.realm.a> b1() {
        this.c0.f().h();
        final l0<com.untis.mobile.persistence.realm.a> e0 = this.e0;
        if (e0 != null) {
            return e0;
        }
        return this.e0 = new l0<com.untis.mobile.persistence.realm.a>(com.untis.mobile.persistence.realm.a.class, this.c0.g().p(this.b0.n), this.c0.f());
    }
    
    @Override
    public long c() {
        this.c0.f().h();
        return this.c0.g().m(this.b0.h);
    }
    
    @Override
    public long d() {
        this.c0.f().h();
        return this.c0.g().m(this.b0.g);
    }
    
    @Override
    public l0<com.untis.mobile.persistence.realm.b> e6() {
        this.c0.f().h();
        final l0<com.untis.mobile.persistence.realm.b> i0 = this.i0;
        if (i0 != null) {
            return i0;
        }
        return this.i0 = new l0<com.untis.mobile.persistence.realm.b>(com.untis.mobile.persistence.realm.b.class, this.c0.g().p(this.b0.s), this.c0.f());
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final x4 x4 = (x4)o;
        final io.realm.a f = this.c0.f();
        final io.realm.a f2 = x4.c0.f();
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
        final String m = this.c0.g().g().M();
        final String i = x4.c0.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.c0.g().l0() == x4.c0.g().l0();
            }
        }
        else if (i == null) {
            return this.c0.g().l0() == x4.c0.g().l0();
        }
        return false;
    }
    
    @Override
    public void h(final long n) {
        if (!this.c0.i()) {
            this.c0.f().h();
            this.c0.g().s(this.b0.g, n);
            return;
        }
        if (!this.c0.d()) {
            return;
        }
        final r g = this.c0.g();
        g.g().q0(this.b0.g, g.l0(), n, true);
    }
    
    @Override
    public l0<com.untis.mobile.persistence.realm.period.a> h0() {
        this.c0.f().h();
        final l0<com.untis.mobile.persistence.realm.period.a> h0 = this.h0;
        if (h0 != null) {
            return h0;
        }
        return this.h0 = new l0<com.untis.mobile.persistence.realm.period.a>(com.untis.mobile.persistence.realm.period.a.class, this.c0.g().p(this.b0.r), this.c0.f());
    }
    
    @Override
    public int hashCode() {
        final String path = this.c0.f().getPath();
        final String m = this.c0.g().g().M();
        final long l0 = this.c0.g().l0();
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
    public void i(final long n) {
        if (!this.c0.i()) {
            this.c0.f().h();
            this.c0.g().s(this.b0.h, n);
            return;
        }
        if (!this.c0.d()) {
            return;
        }
        final r g = this.c0.g();
        g.g().q0(this.b0.h, g.l0(), n, true);
    }
    
    @Override
    public void i7(final int n) {
        if (!this.c0.i()) {
            this.c0.f().h();
            this.c0.g().s(this.b0.l, n);
            return;
        }
        if (!this.c0.d()) {
            return;
        }
        final r g = this.c0.g();
        g.g().q0(this.b0.l, g.l0(), n, true);
    }
    
    @Override
    public void j1(final l0<com.untis.mobile.persistence.realm.a> l0) {
        final boolean i = this.c0.i();
        final int n = 0;
        int j = 0;
        l0<com.untis.mobile.persistence.realm.a> l2 = l0;
        if (i) {
            if (!this.c0.d()) {
                return;
            }
            if (this.c0.e().contains("states")) {
                return;
            }
            if ((l2 = l0) != null) {
                l2 = l0;
                if (!l0.G0()) {
                    final f0 f0 = (f0)this.c0.f();
                    l2 = new l0<com.untis.mobile.persistence.realm.a>();
                    for (final com.untis.mobile.persistence.realm.a a : l0) {
                        com.untis.mobile.persistence.realm.a a2;
                        if ((a2 = a) != null) {
                            if (p0.j8(a)) {
                                a2 = a;
                            }
                            else {
                                a2 = f0.y0(a, new q[0]);
                            }
                        }
                        l2.add(a2);
                    }
                }
            }
        }
        this.c0.f().h();
        final OsList p = this.c0.g().p(this.b0.n);
        if (l2 != null && l2.size() == p.b0()) {
            while (j < l2.size()) {
                final com.untis.mobile.persistence.realm.a a3 = l2.get(j);
                this.c0.c(a3);
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
                final com.untis.mobile.persistence.realm.a a4 = l2.get(k);
                this.c0.c(a4);
                p.l(((p)a4).S6().g().l0());
            }
        }
    }
    
    @Override
    public void k5(final com.untis.mobile.persistence.realm.period.a a) {
        final f0 f0 = (f0)this.c0.f();
        if (this.c0.i()) {
            if (!this.c0.d()) {
                return;
            }
            if (this.c0.e().contains("subject")) {
                return;
            }
            com.untis.mobile.persistence.realm.period.a a2;
            if ((a2 = a) != null) {
                a2 = a;
                if (!p0.j8(a)) {
                    a2 = f0.y0(a, new q[0]);
                }
            }
            final r g = this.c0.g();
            if (a2 == null) {
                g.z(this.b0.o);
                return;
            }
            this.c0.c(a2);
            g.g().p0(this.b0.o, g.l0(), ((p)a2).S6().g().l0(), true);
        }
        else {
            this.c0.f().h();
            if (a == null) {
                this.c0.g().z(this.b0.o);
                return;
            }
            this.c0.c(a);
            this.c0.g().o(this.b0.o, ((p)a).S6().g().l0());
        }
    }
    
    @Override
    public l0<com.untis.mobile.persistence.realm.a> l7() {
        this.c0.f().h();
        final l0<com.untis.mobile.persistence.realm.a> d0 = this.d0;
        if (d0 != null) {
            return d0;
        }
        return this.d0 = new l0<com.untis.mobile.persistence.realm.a>(com.untis.mobile.persistence.realm.a.class, this.c0.g().p(this.b0.m), this.c0.f());
    }
    
    @Override
    public void n1(final l0<com.untis.mobile.persistence.realm.period.a> l0) {
        final boolean i = this.c0.i();
        final int n = 0;
        int j = 0;
        l0<com.untis.mobile.persistence.realm.period.a> l2 = l0;
        if (i) {
            if (!this.c0.d()) {
                return;
            }
            if (this.c0.e().contains("klassen")) {
                return;
            }
            if ((l2 = l0) != null) {
                l2 = l0;
                if (!l0.G0()) {
                    final f0 f0 = (f0)this.c0.f();
                    l2 = new l0<com.untis.mobile.persistence.realm.period.a>();
                    for (final com.untis.mobile.persistence.realm.period.a a : l0) {
                        com.untis.mobile.persistence.realm.period.a a2;
                        if ((a2 = a) != null) {
                            if (p0.j8(a)) {
                                a2 = a;
                            }
                            else {
                                a2 = f0.y0(a, new q[0]);
                            }
                        }
                        l2.add(a2);
                    }
                }
            }
        }
        this.c0.f().h();
        final OsList p = this.c0.g().p(this.b0.p);
        if (l2 != null && l2.size() == p.b0()) {
            while (j < l2.size()) {
                final com.untis.mobile.persistence.realm.period.a a3 = l2.get(j);
                this.c0.c(a3);
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
                final com.untis.mobile.persistence.realm.period.a a4 = l2.get(k);
                this.c0.c(a4);
                p.l(((p)a4).S6().g().l0());
            }
        }
    }
    
    @Override
    public void q(final int n) {
        if (!this.c0.i()) {
            this.c0.f().h();
            this.c0.g().s(this.b0.j, n);
            return;
        }
        if (!this.c0.d()) {
            return;
        }
        final r g = this.c0.g();
        g.g().q0(this.b0.j, g.l0(), n, true);
    }
    
    @Override
    public void q5(final boolean b) {
        if (!this.c0.i()) {
            this.c0.f().h();
            this.c0.g().i(this.b0.t, b);
            return;
        }
        if (!this.c0.d()) {
            return;
        }
        final r g = this.c0.g();
        g.g().j0(this.b0.t, g.l0(), b, true);
    }
    
    @Override
    public int r() {
        this.c0.f().h();
        return (int)this.c0.g().m(this.b0.j);
    }
    
    @Override
    public void s2(final l0<com.untis.mobile.persistence.realm.b> l0) {
        final boolean i = this.c0.i();
        final int n = 0;
        int j = 0;
        l0<com.untis.mobile.persistence.realm.b> l2 = l0;
        if (i) {
            if (!this.c0.d()) {
                return;
            }
            if (this.c0.e().contains("blockIds")) {
                return;
            }
            if ((l2 = l0) != null) {
                l2 = l0;
                if (!l0.G0()) {
                    final f0 f0 = (f0)this.c0.f();
                    l2 = new l0<com.untis.mobile.persistence.realm.b>();
                    for (final com.untis.mobile.persistence.realm.b b : l0) {
                        com.untis.mobile.persistence.realm.b b2;
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
        this.c0.f().h();
        final OsList p = this.c0.g().p(this.b0.s);
        if (l2 != null && l2.size() == p.b0()) {
            while (j < l2.size()) {
                final com.untis.mobile.persistence.realm.b b3 = l2.get(j);
                this.c0.c(b3);
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
                final com.untis.mobile.persistence.realm.b b4 = l2.get(k);
                this.c0.c(b4);
                p.l(((p)b4).S6().g().l0());
            }
        }
    }
    
    @Override
    public void t0(final l0<com.untis.mobile.persistence.realm.period.a> l0) {
        final boolean i = this.c0.i();
        final int n = 0;
        int j = 0;
        l0<com.untis.mobile.persistence.realm.period.a> l2 = l0;
        if (i) {
            if (!this.c0.d()) {
                return;
            }
            if (this.c0.e().contains("teachers")) {
                return;
            }
            if ((l2 = l0) != null) {
                l2 = l0;
                if (!l0.G0()) {
                    final f0 f0 = (f0)this.c0.f();
                    l2 = new l0<com.untis.mobile.persistence.realm.period.a>();
                    for (final com.untis.mobile.persistence.realm.period.a a : l0) {
                        com.untis.mobile.persistence.realm.period.a a2;
                        if ((a2 = a) != null) {
                            if (p0.j8(a)) {
                                a2 = a;
                            }
                            else {
                                a2 = f0.y0(a, new q[0]);
                            }
                        }
                        l2.add(a2);
                    }
                }
            }
        }
        this.c0.f().h();
        final OsList p = this.c0.g().p(this.b0.r);
        if (l2 != null && l2.size() == p.b0()) {
            while (j < l2.size()) {
                final com.untis.mobile.persistence.realm.period.a a3 = l2.get(j);
                this.c0.c(a3);
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
                final com.untis.mobile.persistence.realm.period.a a4 = l2.get(k);
                this.c0.c(a4);
                p.l(((p)a4).S6().g().l0());
            }
        }
    }
    
    @Override
    public void t7(final String s) {
        if (this.c0.i()) {
            if (!this.c0.d()) {
                return;
            }
            final r g = this.c0.g();
            if (s == null) {
                g.g().r0(this.b0.u, g.l0(), true);
                return;
            }
            g.g().t0(this.b0.u, g.l0(), s, true);
        }
        else {
            this.c0.f().h();
            if (s == null) {
                this.c0.g().I(this.b0.u);
                return;
            }
            this.c0.g().d(this.b0.u, s);
        }
    }
    
    @Override
    public String toString() {
        if (!p0.k8(this)) {
            return "Invalid object";
        }
        final StringBuilder sb = new StringBuilder("RealmPeriod = proxy[");
        sb.append("{id:");
        sb.append(this.a());
        sb.append("}");
        sb.append(",");
        sb.append("{lessonId:");
        sb.append(this.C());
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
        sb.append("{backgroundColor:");
        sb.append(this.B6());
        sb.append("}");
        sb.append(",");
        sb.append("{textColor:");
        sb.append(this.r());
        sb.append("}");
        sb.append(",");
        sb.append("{innerBackgroundColor:");
        sb.append(this.O2());
        sb.append("}");
        sb.append(",");
        sb.append("{innerTextColor:");
        sb.append(this.Y2());
        sb.append("}");
        sb.append(",");
        sb.append("{rights:");
        sb.append("RealmList<RealmInteger>[");
        sb.append(this.l7().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{states:");
        sb.append("RealmList<RealmInteger>[");
        sb.append(this.b1().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{subject:");
        final com.untis.mobile.persistence.realm.period.a k = this.K();
        final String s = "null";
        String str;
        if (k != null) {
            str = "RealmElementPair";
        }
        else {
            str = "null";
        }
        sb.append(str);
        sb.append("}");
        sb.append(",");
        sb.append("{klassen:");
        sb.append("RealmList<RealmElementPair>[");
        sb.append(this.a1().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{rooms:");
        sb.append("RealmList<RealmElementPair>[");
        sb.append(this.Z().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{teachers:");
        sb.append("RealmList<RealmElementPair>[");
        sb.append(this.h0().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{blockIds:");
        sb.append("RealmList<RealmLong>[");
        sb.append(this.e6().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{breakSuperVision:");
        sb.append(this.P5());
        sb.append("}");
        sb.append(",");
        sb.append("{channelId:");
        String a7 = s;
        if (this.A7() != null) {
            a7 = this.A7();
        }
        sb.append(a7);
        sb.append("}");
        sb.append(",");
        sb.append("{isOnlinePeriod:");
        sb.append(this.O0());
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
    
    @Override
    public void y4() {
        if (this.c0 != null) {
            return;
        }
        final io.realm.a.h h = io.realm.a.W.get();
        this.b0 = (b)h.c();
        (this.c0 = new c0<c>(this)).r(h.e());
        this.c0.s(h.f());
        this.c0.o(h.b());
        this.c0.q(h.d());
    }
    
    public static final class a
    {
        public static final String a = "RealmPeriod";
    }
    
    static final class b extends io.realm.internal.c
    {
        long e;
        long f;
        long g;
        long h;
        long i;
        long j;
        long k;
        long l;
        long m;
        long n;
        long o;
        long p;
        long q;
        long r;
        long s;
        long t;
        long u;
        long v;
        
        b(final OsSchemaInfo osSchemaInfo) {
            super(18);
            final OsObjectSchemaInfo b = osSchemaInfo.b("RealmPeriod");
            this.e = this.b("id", "id", b);
            this.f = this.b("lessonId", "lessonId", b);
            this.g = this.b("start", "start", b);
            this.h = this.b("end", "end", b);
            this.i = this.b("backgroundColor", "backgroundColor", b);
            this.j = this.b("textColor", "textColor", b);
            this.k = this.b("innerBackgroundColor", "innerBackgroundColor", b);
            this.l = this.b("innerTextColor", "innerTextColor", b);
            this.m = this.b("rights", "rights", b);
            this.n = this.b("states", "states", b);
            this.o = this.b("subject", "subject", b);
            this.p = this.b("klassen", "klassen", b);
            this.q = this.b("rooms", "rooms", b);
            this.r = this.b("teachers", "teachers", b);
            this.s = this.b("blockIds", "blockIds", b);
            this.t = this.b("breakSuperVision", "breakSuperVision", b);
            this.u = this.b("channelId", "channelId", b);
            this.v = this.b("isOnlinePeriod", "isOnlinePeriod", b);
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
            b2.h = b.h;
            b2.i = b.i;
            b2.j = b.j;
            b2.k = b.k;
            b2.l = b.l;
            b2.m = b.m;
            b2.n = b.n;
            b2.o = b.o;
            b2.p = b.p;
            b2.q = b.q;
            b2.r = b.r;
            b2.s = b.s;
            b2.t = b.t;
            b2.u = b.u;
            b2.v = b.v;
        }
    }
}
