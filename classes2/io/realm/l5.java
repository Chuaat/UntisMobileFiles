// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import java.lang.constant.Constable;
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
import z4.c;

public class l5 extends c implements p, m5
{
    private static final String M0 = "";
    private static final OsObjectSchemaInfo N0;
    private b F0;
    private c0<c> G0;
    private l0<com.untis.mobile.persistence.realm.a> H0;
    private l0<z4.a> I0;
    private l0<com.untis.mobile.persistence.realm.b> J0;
    private l0<com.untis.mobile.persistence.realm.a> K0;
    private l0<com.untis.mobile.persistence.realm.a> L0;
    
    static {
        N0 = oa();
    }
    
    l5() {
        this.G0.p();
    }
    
    public static c ka(final f0 f0, final b b, final c c, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        final l5 l5 = map.get(c);
        if (l5 != null) {
            return l5;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(c.class), set);
        osObjectBuilder.L(b.e, c.a());
        osObjectBuilder.d0(b.f, c.K5());
        osObjectBuilder.d0(b.g, c.t4());
        osObjectBuilder.d0(b.h, c.L3());
        osObjectBuilder.L(b.i, c.Q6());
        osObjectBuilder.K(b.j, c.I6());
        osObjectBuilder.L(b.k, c.U3());
        osObjectBuilder.K(b.l, c.J3());
        osObjectBuilder.L(b.m, c.F6());
        osObjectBuilder.n(b.q, c.E7());
        osObjectBuilder.n(b.r, c.l5());
        osObjectBuilder.d0(b.s, c.g7());
        osObjectBuilder.L(b.t, c.f4());
        osObjectBuilder.d0(b.u, c.z7());
        osObjectBuilder.d0(b.v, c.O7());
        osObjectBuilder.L(b.w, c.C2());
        osObjectBuilder.d0(b.x, c.l2());
        osObjectBuilder.n(b.y, c.X3());
        osObjectBuilder.d0(b.z, c.Y5());
        osObjectBuilder.L(b.A, c.p4());
        osObjectBuilder.K(b.B, c.S4());
        osObjectBuilder.d0(b.C, c.q4());
        osObjectBuilder.d0(b.D, c.N5());
        osObjectBuilder.n(b.E, c.V5());
        osObjectBuilder.n(b.F, c.H2());
        osObjectBuilder.L(b.G, c.D3());
        osObjectBuilder.L(b.H, c.S3());
        osObjectBuilder.L(b.I, c.U6());
        osObjectBuilder.L(b.J, c.V2());
        osObjectBuilder.L(b.K, c.j6());
        osObjectBuilder.L(b.L, c.S2());
        osObjectBuilder.K(b.M, c.h4());
        osObjectBuilder.L(b.N, c.g5());
        osObjectBuilder.L(b.P, c.m3());
        osObjectBuilder.n(b.Q, c.g4());
        osObjectBuilder.d0(b.S, c.k4());
        osObjectBuilder.d0(b.T, c.L5());
        osObjectBuilder.d0(b.U, c.N4());
        osObjectBuilder.d0(b.V, c.m4());
        osObjectBuilder.d0(b.W, c.O4());
        osObjectBuilder.L(b.X, c.P6());
        osObjectBuilder.n(b.Y, c.J4());
        osObjectBuilder.L(b.Z, c.A0());
        final l5 xa = xa(f0, osObjectBuilder.f0());
        map.put(c, xa);
        final l0<com.untis.mobile.persistence.realm.a> u2 = c.U2();
        final int n = 0;
        if (u2 != null) {
            final l0<com.untis.mobile.persistence.realm.a> u3 = xa.U2();
            u3.clear();
            for (int i = 0; i < u2.size(); ++i) {
                final com.untis.mobile.persistence.realm.a a = u2.get(i);
                com.untis.mobile.persistence.realm.a v8 = (com.untis.mobile.persistence.realm.a)map.get(a);
                if (v8 == null) {
                    v8 = x0.v8(f0, (x0.b)f0.H().j(com.untis.mobile.persistence.realm.a.class), a, b2, map, set);
                }
                u3.add(v8);
            }
        }
        final l0<z4.a> i2 = c.I3();
        if (i2 != null) {
            final l0<z4.a> i3 = xa.I3();
            i3.clear();
            for (int j = 0; j < i2.size(); ++j) {
                final z4.a a2 = i2.get(j);
                z4.a b3 = (z4.a)map.get(a2);
                if (b3 == null) {
                    b3 = h5.B8(f0, (h5.b)f0.H().j(z4.a.class), a2, b2, map, set);
                }
                i3.add(b3);
            }
        }
        final l0<com.untis.mobile.persistence.realm.b> y6 = c.y6();
        if (y6 != null) {
            final l0<com.untis.mobile.persistence.realm.b> y7 = xa.y6();
            y7.clear();
            for (int k = 0; k < y6.size(); ++k) {
                final com.untis.mobile.persistence.realm.b b4 = y6.get(k);
                com.untis.mobile.persistence.realm.b v9 = (com.untis.mobile.persistence.realm.b)map.get(b4);
                if (v9 == null) {
                    v9 = z0.v8(f0, (z0.b)f0.H().j(com.untis.mobile.persistence.realm.b.class), b4, b2, map, set);
                }
                y7.add(v9);
            }
        }
        final l0<com.untis.mobile.persistence.realm.a> b5 = c.b1();
        if (b5 != null) {
            final l0<com.untis.mobile.persistence.realm.a> b6 = xa.b1();
            b6.clear();
            for (int n2 = 0; n2 < b5.size(); ++n2) {
                final com.untis.mobile.persistence.realm.a a3 = b5.get(n2);
                com.untis.mobile.persistence.realm.a v10 = (com.untis.mobile.persistence.realm.a)map.get(a3);
                if (v10 == null) {
                    v10 = x0.v8(f0, (x0.b)f0.H().j(com.untis.mobile.persistence.realm.a.class), a3, b2, map, set);
                }
                b6.add(v10);
            }
        }
        final l0<com.untis.mobile.persistence.realm.a> q7 = c.q7();
        if (q7 != null) {
            final l0<com.untis.mobile.persistence.realm.a> q8 = xa.q7();
            q8.clear();
            for (int n3 = n; n3 < q7.size(); ++n3) {
                final com.untis.mobile.persistence.realm.a a4 = q7.get(n3);
                com.untis.mobile.persistence.realm.a v11 = (com.untis.mobile.persistence.realm.a)map.get(a4);
                if (v11 == null) {
                    v11 = x0.v8(f0, (x0.b)f0.H().j(com.untis.mobile.persistence.realm.a.class), a4, b2, map, set);
                }
                q8.add(v11);
            }
        }
        return xa;
    }
    
    public static c la(final f0 f0, final b b, final c c, final boolean b2, final Map<n0, p> map, final Set<q> set) {
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
                    x2 = new l5();
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
            c2 = ya(f0, b, (c)x2, c, map, set);
        }
        else {
            c2 = ka(f0, b, c, b2, map, set);
        }
        return c2;
    }
    
    public static b ma(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static c na(final c c, final int a, final int n, final Map<n0, p.a<n0>> map) {
        if (a <= n && c != null) {
            final p.a a2 = map.get(c);
            c c2;
            if (a2 == null) {
                c2 = new c();
                map.put(c, (p.a<n0>)new p.a(a, c2));
            }
            else {
                if (a >= a2.a) {
                    return (c)a2.b;
                }
                c2 = (c)a2.b;
                a2.a = a;
            }
            c2.b(c.a());
            c2.C7(c.K5());
            c2.r5(c.t4());
            c2.Q3(c.L3());
            c2.m6(c.Q6());
            c2.e4(c.I6());
            c2.x2(c.U3());
            c2.R1(c.J3());
            c2.B2(c.F6());
            final int n2 = 0;
            if (a == n) {
                c2.W4(null);
            }
            else {
                final l0<com.untis.mobile.persistence.realm.a> u2 = c.U2();
                final l0<com.untis.mobile.persistence.realm.a> l0 = new l0<com.untis.mobile.persistence.realm.a>();
                c2.W4(l0);
                for (int size = u2.size(), i = 0; i < size; ++i) {
                    l0.add(x0.x8(u2.get(i), a + 1, n, map));
                }
            }
            if (a == n) {
                c2.T1(null);
            }
            else {
                final l0<z4.a> i2 = c.I3();
                final l0<z4.a> l2 = new l0<z4.a>();
                c2.T1(l2);
                for (int size2 = i2.size(), j = 0; j < size2; ++j) {
                    l2.add(h5.D8(i2.get(j), a + 1, n, map));
                }
            }
            if (a == n) {
                c2.U4(null);
            }
            else {
                final l0<com.untis.mobile.persistence.realm.b> y6 = c.y6();
                final l0<com.untis.mobile.persistence.realm.b> l3 = new l0<com.untis.mobile.persistence.realm.b>();
                c2.U4(l3);
                for (int size3 = y6.size(), k = 0; k < size3; ++k) {
                    l3.add(z0.x8(y6.get(k), a + 1, n, map));
                }
            }
            c2.o4(c.E7());
            c2.W2(c.l5());
            c2.L2(c.g7());
            c2.N2(c.f4());
            c2.l3(c.z7());
            c2.A5(c.O7());
            c2.j4(c.C2());
            c2.L6(c.l2());
            c2.D6(c.X3());
            c2.K3(c.Y5());
            c2.k3(c.p4());
            c2.f5(c.S4());
            c2.o7(c.q4());
            c2.d7(c.N5());
            c2.Y1(c.V5());
            c2.T5(c.H2());
            c2.f2(c.D3());
            c2.O5(c.S3());
            c2.L4(c.U6());
            c2.a6(c.V2());
            c2.u6(c.j6());
            c2.w4(c.S2());
            c2.A6(c.h4());
            c2.z2(c.g5());
            if (a == n) {
                c2.j1(null);
            }
            else {
                final l0<com.untis.mobile.persistence.realm.a> b1 = c.b1();
                final l0<com.untis.mobile.persistence.realm.a> l4 = new l0<com.untis.mobile.persistence.realm.a>();
                c2.j1(l4);
                for (int size4 = b1.size(), n3 = 0; n3 < size4; ++n3) {
                    l4.add(x0.x8(b1.get(n3), a + 1, n, map));
                }
            }
            c2.N3(c.m3());
            c2.e3(c.g4());
            if (a == n) {
                c2.F4(null);
            }
            else {
                final l0<com.untis.mobile.persistence.realm.a> q7 = c.q7();
                final l0<com.untis.mobile.persistence.realm.a> l5 = new l0<com.untis.mobile.persistence.realm.a>();
                c2.F4(l5);
                for (int size5 = q7.size(), n4 = n2; n4 < size5; ++n4) {
                    l5.add(x0.x8(q7.get(n4), a + 1, n, map));
                }
            }
            c2.H4(c.k4());
            c2.h3(c.L5());
            c2.B7(c.N4());
            c2.s4(c.m4());
            c2.I7(c.O4());
            c2.h6(c.P6());
            c2.p3(c.J4());
            c2.P4(c.A0());
            return c2;
        }
        return null;
    }
    
    private static OsObjectSchemaInfo oa() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmProfile", false, 48, 0);
        final RealmFieldType integer = RealmFieldType.INTEGER;
        b.c("", "id", integer, true, false, true);
        final RealmFieldType string = RealmFieldType.STRING;
        b.c("", "userLogin", string, false, false, true);
        b.c("", "userDisplayName", string, false, false, true);
        b.c("", "userAppSharedSecret", string, false, false, true);
        b.c("", "userDepartmentId", integer, false, false, true);
        b.c("", "userOriginalEntityType", integer, false, false, true);
        b.c("", "userOriginalEntityId", integer, false, false, true);
        b.c("", "userCustomEntityType", integer, false, false, false);
        b.c("", "userCustomEntityId", integer, false, false, false);
        final RealmFieldType list = RealmFieldType.LIST;
        b.b("", "userRights", list, "RealmInteger");
        b.b("", "userChildren", list, "RealmChild");
        b.b("", "userClasses", list, "RealmLong");
        final RealmFieldType boolean1 = RealmFieldType.BOOLEAN;
        b.c("", "userHasTimeTableAccess", boolean1, false, false, true);
        b.c("", "userJupiter", boolean1, false, false, true);
        b.c("", "userJupiterEclipse", string, false, false, false);
        b.c("", "userId", integer, false, false, true);
        b.c("", "schoolLogin", string, false, false, true);
        b.c("", "schoolDisplayName", string, false, false, true);
        b.c("", "schoolId", integer, false, false, true);
        b.c("", "schoolServerUrl", string, false, false, true);
        b.c("", "schoolUseMobileService", boolean1, false, false, true);
        b.c("", "schoolMobileServiceUrl", string, false, false, true);
        b.c("", "schoolServerDelta", integer, false, false, true);
        b.c("", "schoolApiVersion", integer, false, false, true);
        b.c("", "schoolSemanticWuVersion", string, false, false, true);
        b.c("", "schoolSemanticApiVersion", string, false, false, true);
        b.c("", "usable", boolean1, false, false, true);
        b.c("", "updated", boolean1, false, false, true);
        b.c("", "periodDataTimestamp", integer, false, false, true);
        b.c("", "masterDataTimestamp", integer, false, false, true);
        b.c("", "officeHourTimestamp", integer, false, false, true);
        b.c("", "parentDayTimestamp", integer, false, false, true);
        b.c("", "messagesOfDayTimestamp", integer, false, false, true);
        b.c("", "widgetTimestamp", integer, false, false, true);
        b.c("", "lastViewedEntityType", integer, false, false, true);
        b.c("", "lastViewedEntityId", integer, false, false, true);
        b.b("", "states", list, "RealmInteger");
        b.c("", "serverDownTimestamp", integer, false, false, true);
        b.c("", "lockScreen", boolean1, false, false, true);
        b.b("", "lockScreenIds", list, "RealmInteger");
        b.c("", "messengerServerUrl", string, false, false, true);
        b.c("", "messengerOrganizationId", string, false, false, true);
        b.c("", "substitutionPlanningUrl", string, false, false, true);
        b.c("", "registrationUrl", string, false, false, true);
        b.c("", "authenticationToken", string, false, false, true);
        b.c("", "infoCenterTimestamp", integer, false, false, true);
        b.c("", "showCalendarDetails", boolean1, false, false, true);
        b.c("", "registered", integer, false, false, true);
        return b.e();
    }
    
    public static c pa(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final ArrayList<String> list = new ArrayList<String>(5);
        Object x2 = null;
        Label_0143: {
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
                        x2 = new l5();
                        break Label_0143;
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
            if (jsonObject.has("userRights")) {
                list.add("userRights");
            }
            if (jsonObject.has("userChildren")) {
                list.add("userChildren");
            }
            if (jsonObject.has("userClasses")) {
                list.add("userClasses");
            }
            if (jsonObject.has("states")) {
                list.add("states");
            }
            if (jsonObject.has("lockScreenIds")) {
                list.add("lockScreenIds");
            }
            if (!jsonObject.has("id")) {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
            l5 l5;
            if (jsonObject.isNull("id")) {
                l5 = f0.p1((Class<l5>)c.class, null, true, list);
            }
            else {
                l5 = f0.p1((Class<l5>)c.class, jsonObject.getLong("id"), true, list);
            }
            o = l5;
        }
        if (jsonObject.has("userLogin")) {
            if (jsonObject.isNull("userLogin")) {
                ((m5)o).C7(null);
            }
            else {
                ((m5)o).C7(jsonObject.getString("userLogin"));
            }
        }
        if (jsonObject.has("userDisplayName")) {
            if (jsonObject.isNull("userDisplayName")) {
                ((m5)o).r5(null);
            }
            else {
                ((m5)o).r5(jsonObject.getString("userDisplayName"));
            }
        }
        if (jsonObject.has("userAppSharedSecret")) {
            if (jsonObject.isNull("userAppSharedSecret")) {
                ((m5)o).Q3(null);
            }
            else {
                ((m5)o).Q3(jsonObject.getString("userAppSharedSecret"));
            }
        }
        if (jsonObject.has("userDepartmentId")) {
            if (jsonObject.isNull("userDepartmentId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'userDepartmentId' to null.");
            }
            ((m5)o).m6(jsonObject.getLong("userDepartmentId"));
        }
        if (jsonObject.has("userOriginalEntityType")) {
            if (jsonObject.isNull("userOriginalEntityType")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'userOriginalEntityType' to null.");
            }
            ((m5)o).e4(jsonObject.getInt("userOriginalEntityType"));
        }
        if (jsonObject.has("userOriginalEntityId")) {
            if (jsonObject.isNull("userOriginalEntityId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'userOriginalEntityId' to null.");
            }
            ((m5)o).x2(jsonObject.getLong("userOriginalEntityId"));
        }
        if (jsonObject.has("userCustomEntityType")) {
            if (jsonObject.isNull("userCustomEntityType")) {
                ((m5)o).R1(null);
            }
            else {
                ((m5)o).R1(Integer.valueOf(jsonObject.getInt("userCustomEntityType")));
            }
        }
        if (jsonObject.has("userCustomEntityId")) {
            if (jsonObject.isNull("userCustomEntityId")) {
                ((m5)o).B2(null);
            }
            else {
                ((m5)o).B2(Long.valueOf(jsonObject.getLong("userCustomEntityId")));
            }
        }
        final boolean has = jsonObject.has("userRights");
        final int n = 0;
        if (has) {
            if (jsonObject.isNull("userRights")) {
                ((m5)o).W4(null);
            }
            else {
                ((m5)o).U2().clear();
                final JSONArray jsonArray = jsonObject.getJSONArray("userRights");
                for (int i = 0; i < jsonArray.length(); ++i) {
                    ((m5)o).U2().add(x0.z8(f0, jsonArray.getJSONObject(i), b));
                }
            }
        }
        if (jsonObject.has("userChildren")) {
            if (jsonObject.isNull("userChildren")) {
                ((m5)o).T1(null);
            }
            else {
                ((m5)o).I3().clear();
                final JSONArray jsonArray2 = jsonObject.getJSONArray("userChildren");
                for (int j = 0; j < jsonArray2.length(); ++j) {
                    ((m5)o).I3().add(h5.F8(f0, jsonArray2.getJSONObject(j), b));
                }
            }
        }
        if (jsonObject.has("userClasses")) {
            if (jsonObject.isNull("userClasses")) {
                ((m5)o).U4(null);
            }
            else {
                ((m5)o).y6().clear();
                final JSONArray jsonArray3 = jsonObject.getJSONArray("userClasses");
                for (int k = 0; k < jsonArray3.length(); ++k) {
                    ((m5)o).y6().add(z0.z8(f0, jsonArray3.getJSONObject(k), b));
                }
            }
        }
        if (jsonObject.has("userHasTimeTableAccess")) {
            if (jsonObject.isNull("userHasTimeTableAccess")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'userHasTimeTableAccess' to null.");
            }
            ((m5)o).o4(jsonObject.getBoolean("userHasTimeTableAccess"));
        }
        if (jsonObject.has("userJupiter")) {
            if (jsonObject.isNull("userJupiter")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'userJupiter' to null.");
            }
            ((m5)o).W2(jsonObject.getBoolean("userJupiter"));
        }
        if (jsonObject.has("userJupiterEclipse")) {
            if (jsonObject.isNull("userJupiterEclipse")) {
                ((m5)o).L2(null);
            }
            else {
                ((m5)o).L2(jsonObject.getString("userJupiterEclipse"));
            }
        }
        if (jsonObject.has("userId")) {
            if (jsonObject.isNull("userId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'userId' to null.");
            }
            ((m5)o).N2(jsonObject.getLong("userId"));
        }
        if (jsonObject.has("schoolLogin")) {
            if (jsonObject.isNull("schoolLogin")) {
                ((m5)o).l3(null);
            }
            else {
                ((m5)o).l3(jsonObject.getString("schoolLogin"));
            }
        }
        if (jsonObject.has("schoolDisplayName")) {
            if (jsonObject.isNull("schoolDisplayName")) {
                ((m5)o).A5(null);
            }
            else {
                ((m5)o).A5(jsonObject.getString("schoolDisplayName"));
            }
        }
        if (jsonObject.has("schoolId")) {
            if (jsonObject.isNull("schoolId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'schoolId' to null.");
            }
            ((m5)o).j4(jsonObject.getLong("schoolId"));
        }
        if (jsonObject.has("schoolServerUrl")) {
            if (jsonObject.isNull("schoolServerUrl")) {
                ((m5)o).L6(null);
            }
            else {
                ((m5)o).L6(jsonObject.getString("schoolServerUrl"));
            }
        }
        if (jsonObject.has("schoolUseMobileService")) {
            if (jsonObject.isNull("schoolUseMobileService")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'schoolUseMobileService' to null.");
            }
            ((m5)o).D6(jsonObject.getBoolean("schoolUseMobileService"));
        }
        if (jsonObject.has("schoolMobileServiceUrl")) {
            if (jsonObject.isNull("schoolMobileServiceUrl")) {
                ((m5)o).K3(null);
            }
            else {
                ((m5)o).K3(jsonObject.getString("schoolMobileServiceUrl"));
            }
        }
        if (jsonObject.has("schoolServerDelta")) {
            if (jsonObject.isNull("schoolServerDelta")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'schoolServerDelta' to null.");
            }
            ((m5)o).k3(jsonObject.getLong("schoolServerDelta"));
        }
        if (jsonObject.has("schoolApiVersion")) {
            if (jsonObject.isNull("schoolApiVersion")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'schoolApiVersion' to null.");
            }
            ((m5)o).f5(jsonObject.getInt("schoolApiVersion"));
        }
        if (jsonObject.has("schoolSemanticWuVersion")) {
            if (jsonObject.isNull("schoolSemanticWuVersion")) {
                ((m5)o).o7(null);
            }
            else {
                ((m5)o).o7(jsonObject.getString("schoolSemanticWuVersion"));
            }
        }
        if (jsonObject.has("schoolSemanticApiVersion")) {
            if (jsonObject.isNull("schoolSemanticApiVersion")) {
                ((m5)o).d7(null);
            }
            else {
                ((m5)o).d7(jsonObject.getString("schoolSemanticApiVersion"));
            }
        }
        if (jsonObject.has("usable")) {
            if (jsonObject.isNull("usable")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'usable' to null.");
            }
            ((m5)o).Y1(jsonObject.getBoolean("usable"));
        }
        if (jsonObject.has("updated")) {
            if (jsonObject.isNull("updated")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'updated' to null.");
            }
            ((m5)o).T5(jsonObject.getBoolean("updated"));
        }
        if (jsonObject.has("periodDataTimestamp")) {
            if (jsonObject.isNull("periodDataTimestamp")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'periodDataTimestamp' to null.");
            }
            ((m5)o).f2(jsonObject.getLong("periodDataTimestamp"));
        }
        if (jsonObject.has("masterDataTimestamp")) {
            if (jsonObject.isNull("masterDataTimestamp")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'masterDataTimestamp' to null.");
            }
            ((m5)o).O5(jsonObject.getLong("masterDataTimestamp"));
        }
        if (jsonObject.has("officeHourTimestamp")) {
            if (jsonObject.isNull("officeHourTimestamp")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'officeHourTimestamp' to null.");
            }
            ((m5)o).L4(jsonObject.getLong("officeHourTimestamp"));
        }
        if (jsonObject.has("parentDayTimestamp")) {
            if (jsonObject.isNull("parentDayTimestamp")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'parentDayTimestamp' to null.");
            }
            ((m5)o).a6(jsonObject.getLong("parentDayTimestamp"));
        }
        if (jsonObject.has("messagesOfDayTimestamp")) {
            if (jsonObject.isNull("messagesOfDayTimestamp")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'messagesOfDayTimestamp' to null.");
            }
            ((m5)o).u6(jsonObject.getLong("messagesOfDayTimestamp"));
        }
        if (jsonObject.has("widgetTimestamp")) {
            if (jsonObject.isNull("widgetTimestamp")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'widgetTimestamp' to null.");
            }
            ((m5)o).w4(jsonObject.getLong("widgetTimestamp"));
        }
        if (jsonObject.has("lastViewedEntityType")) {
            if (jsonObject.isNull("lastViewedEntityType")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'lastViewedEntityType' to null.");
            }
            ((m5)o).A6(jsonObject.getInt("lastViewedEntityType"));
        }
        if (jsonObject.has("lastViewedEntityId")) {
            if (jsonObject.isNull("lastViewedEntityId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'lastViewedEntityId' to null.");
            }
            ((m5)o).z2(jsonObject.getLong("lastViewedEntityId"));
        }
        if (jsonObject.has("states")) {
            if (jsonObject.isNull("states")) {
                ((m5)o).j1(null);
            }
            else {
                ((m5)o).b1().clear();
                final JSONArray jsonArray4 = jsonObject.getJSONArray("states");
                for (int n2 = 0; n2 < jsonArray4.length(); ++n2) {
                    ((m5)o).b1().add(x0.z8(f0, jsonArray4.getJSONObject(n2), b));
                }
            }
        }
        if (jsonObject.has("serverDownTimestamp")) {
            if (jsonObject.isNull("serverDownTimestamp")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'serverDownTimestamp' to null.");
            }
            ((m5)o).N3(jsonObject.getLong("serverDownTimestamp"));
        }
        if (jsonObject.has("lockScreen")) {
            if (jsonObject.isNull("lockScreen")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'lockScreen' to null.");
            }
            ((m5)o).e3(jsonObject.getBoolean("lockScreen"));
        }
        if (jsonObject.has("lockScreenIds")) {
            if (jsonObject.isNull("lockScreenIds")) {
                ((m5)o).F4(null);
            }
            else {
                ((m5)o).q7().clear();
                final JSONArray jsonArray5 = jsonObject.getJSONArray("lockScreenIds");
                for (int n3 = n; n3 < jsonArray5.length(); ++n3) {
                    ((m5)o).q7().add(x0.z8(f0, jsonArray5.getJSONObject(n3), b));
                }
            }
        }
        if (jsonObject.has("messengerServerUrl")) {
            if (jsonObject.isNull("messengerServerUrl")) {
                ((m5)o).H4(null);
            }
            else {
                ((m5)o).H4(jsonObject.getString("messengerServerUrl"));
            }
        }
        if (jsonObject.has("messengerOrganizationId")) {
            if (jsonObject.isNull("messengerOrganizationId")) {
                ((m5)o).h3(null);
            }
            else {
                ((m5)o).h3(jsonObject.getString("messengerOrganizationId"));
            }
        }
        if (jsonObject.has("substitutionPlanningUrl")) {
            if (jsonObject.isNull("substitutionPlanningUrl")) {
                ((m5)o).B7(null);
            }
            else {
                ((m5)o).B7(jsonObject.getString("substitutionPlanningUrl"));
            }
        }
        if (jsonObject.has("registrationUrl")) {
            if (jsonObject.isNull("registrationUrl")) {
                ((m5)o).s4(null);
            }
            else {
                ((m5)o).s4(jsonObject.getString("registrationUrl"));
            }
        }
        if (jsonObject.has("authenticationToken")) {
            if (jsonObject.isNull("authenticationToken")) {
                ((m5)o).I7(null);
            }
            else {
                ((m5)o).I7(jsonObject.getString("authenticationToken"));
            }
        }
        if (jsonObject.has("infoCenterTimestamp")) {
            if (jsonObject.isNull("infoCenterTimestamp")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'infoCenterTimestamp' to null.");
            }
            ((m5)o).h6(jsonObject.getLong("infoCenterTimestamp"));
        }
        if (jsonObject.has("showCalendarDetails")) {
            if (jsonObject.isNull("showCalendarDetails")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'showCalendarDetails' to null.");
            }
            ((m5)o).p3(jsonObject.getBoolean("showCalendarDetails"));
        }
        if (jsonObject.has("registered")) {
            if (jsonObject.isNull("registered")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'registered' to null.");
            }
            ((m5)o).P4(jsonObject.getLong("registered"));
        }
        return (c)o;
    }
    
    @TargetApi(11)
    public static c qa(final f0 f0, final JsonReader jsonReader) throws IOException {
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
            else if (nextName.equals("userLogin")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    c.C7(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    c.C7(null);
                }
            }
            else if (nextName.equals("userDisplayName")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    c.r5(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    c.r5(null);
                }
            }
            else if (nextName.equals("userAppSharedSecret")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    c.Q3(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    c.Q3(null);
                }
            }
            else if (nextName.equals("userDepartmentId")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'userDepartmentId' to null.");
                }
                c.m6(jsonReader.nextLong());
            }
            else if (nextName.equals("userOriginalEntityType")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'userOriginalEntityType' to null.");
                }
                c.e4(jsonReader.nextInt());
            }
            else if (nextName.equals("userOriginalEntityId")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'userOriginalEntityId' to null.");
                }
                c.x2(jsonReader.nextLong());
            }
            else if (nextName.equals("userCustomEntityType")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    c.R1(jsonReader.nextInt());
                }
                else {
                    jsonReader.skipValue();
                    c.R1(null);
                }
            }
            else if (nextName.equals("userCustomEntityId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    c.B2(jsonReader.nextLong());
                }
                else {
                    jsonReader.skipValue();
                    c.B2(null);
                }
            }
            else {
                if (nextName.equals("userRights")) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.skipValue();
                        c.W4(null);
                        continue;
                    }
                    c.W4(new l0<com.untis.mobile.persistence.realm.a>());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        c.U2().add(x0.A8(f0, jsonReader));
                    }
                }
                else if (nextName.equals("userChildren")) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.skipValue();
                        c.T1(null);
                        continue;
                    }
                    c.T1(new l0<z4.a>());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        c.I3().add(h5.G8(f0, jsonReader));
                    }
                }
                else if (nextName.equals("userClasses")) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.skipValue();
                        c.U4(null);
                        continue;
                    }
                    c.U4(new l0<com.untis.mobile.persistence.realm.b>());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        c.y6().add(z0.A8(f0, jsonReader));
                    }
                }
                else if (nextName.equals("userHasTimeTableAccess")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        c.o4(jsonReader.nextBoolean());
                        continue;
                    }
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'userHasTimeTableAccess' to null.");
                }
                else if (nextName.equals("userJupiter")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        c.W2(jsonReader.nextBoolean());
                        continue;
                    }
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'userJupiter' to null.");
                }
                else if (nextName.equals("userJupiterEclipse")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        c.L2(jsonReader.nextString());
                        continue;
                    }
                    jsonReader.skipValue();
                    c.L2(null);
                    continue;
                }
                else if (nextName.equals("userId")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        c.N2(jsonReader.nextLong());
                        continue;
                    }
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'userId' to null.");
                }
                else if (nextName.equals("schoolLogin")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        c.l3(jsonReader.nextString());
                        continue;
                    }
                    jsonReader.skipValue();
                    c.l3(null);
                    continue;
                }
                else if (nextName.equals("schoolDisplayName")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        c.A5(jsonReader.nextString());
                        continue;
                    }
                    jsonReader.skipValue();
                    c.A5(null);
                    continue;
                }
                else if (nextName.equals("schoolId")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        c.j4(jsonReader.nextLong());
                        continue;
                    }
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'schoolId' to null.");
                }
                else if (nextName.equals("schoolServerUrl")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        c.L6(jsonReader.nextString());
                        continue;
                    }
                    jsonReader.skipValue();
                    c.L6(null);
                    continue;
                }
                else if (nextName.equals("schoolUseMobileService")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        c.D6(jsonReader.nextBoolean());
                        continue;
                    }
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'schoolUseMobileService' to null.");
                }
                else if (nextName.equals("schoolMobileServiceUrl")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        c.K3(jsonReader.nextString());
                        continue;
                    }
                    jsonReader.skipValue();
                    c.K3(null);
                    continue;
                }
                else if (nextName.equals("schoolServerDelta")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        c.k3(jsonReader.nextLong());
                        continue;
                    }
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'schoolServerDelta' to null.");
                }
                else if (nextName.equals("schoolApiVersion")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        c.f5(jsonReader.nextInt());
                        continue;
                    }
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'schoolApiVersion' to null.");
                }
                else if (nextName.equals("schoolSemanticWuVersion")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        c.o7(jsonReader.nextString());
                        continue;
                    }
                    jsonReader.skipValue();
                    c.o7(null);
                    continue;
                }
                else if (nextName.equals("schoolSemanticApiVersion")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        c.d7(jsonReader.nextString());
                        continue;
                    }
                    jsonReader.skipValue();
                    c.d7(null);
                    continue;
                }
                else if (nextName.equals("usable")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        c.Y1(jsonReader.nextBoolean());
                        continue;
                    }
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'usable' to null.");
                }
                else if (nextName.equals("updated")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        c.T5(jsonReader.nextBoolean());
                        continue;
                    }
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'updated' to null.");
                }
                else if (nextName.equals("periodDataTimestamp")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        c.f2(jsonReader.nextLong());
                        continue;
                    }
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'periodDataTimestamp' to null.");
                }
                else if (nextName.equals("masterDataTimestamp")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        c.O5(jsonReader.nextLong());
                        continue;
                    }
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'masterDataTimestamp' to null.");
                }
                else if (nextName.equals("officeHourTimestamp")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        c.L4(jsonReader.nextLong());
                        continue;
                    }
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'officeHourTimestamp' to null.");
                }
                else if (nextName.equals("parentDayTimestamp")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        c.a6(jsonReader.nextLong());
                        continue;
                    }
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'parentDayTimestamp' to null.");
                }
                else if (nextName.equals("messagesOfDayTimestamp")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        c.u6(jsonReader.nextLong());
                        continue;
                    }
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'messagesOfDayTimestamp' to null.");
                }
                else if (nextName.equals("widgetTimestamp")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        c.w4(jsonReader.nextLong());
                        continue;
                    }
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'widgetTimestamp' to null.");
                }
                else if (nextName.equals("lastViewedEntityType")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        c.A6(jsonReader.nextInt());
                        continue;
                    }
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'lastViewedEntityType' to null.");
                }
                else if (nextName.equals("lastViewedEntityId")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        c.z2(jsonReader.nextLong());
                        continue;
                    }
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'lastViewedEntityId' to null.");
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
                else if (nextName.equals("serverDownTimestamp")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        c.N3(jsonReader.nextLong());
                        continue;
                    }
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'serverDownTimestamp' to null.");
                }
                else if (nextName.equals("lockScreen")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        c.e3(jsonReader.nextBoolean());
                        continue;
                    }
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'lockScreen' to null.");
                }
                else if (nextName.equals("lockScreenIds")) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.skipValue();
                        c.F4(null);
                        continue;
                    }
                    c.F4(new l0<com.untis.mobile.persistence.realm.a>());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        c.q7().add(x0.A8(f0, jsonReader));
                    }
                }
                else if (nextName.equals("messengerServerUrl")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        c.H4(jsonReader.nextString());
                        continue;
                    }
                    jsonReader.skipValue();
                    c.H4(null);
                    continue;
                }
                else if (nextName.equals("messengerOrganizationId")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        c.h3(jsonReader.nextString());
                        continue;
                    }
                    jsonReader.skipValue();
                    c.h3(null);
                    continue;
                }
                else if (nextName.equals("substitutionPlanningUrl")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        c.B7(jsonReader.nextString());
                        continue;
                    }
                    jsonReader.skipValue();
                    c.B7(null);
                    continue;
                }
                else if (nextName.equals("registrationUrl")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        c.s4(jsonReader.nextString());
                        continue;
                    }
                    jsonReader.skipValue();
                    c.s4(null);
                    continue;
                }
                else if (nextName.equals("authenticationToken")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        c.I7(jsonReader.nextString());
                        continue;
                    }
                    jsonReader.skipValue();
                    c.I7(null);
                    continue;
                }
                else if (nextName.equals("infoCenterTimestamp")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        c.h6(jsonReader.nextLong());
                        continue;
                    }
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'infoCenterTimestamp' to null.");
                }
                else if (nextName.equals("showCalendarDetails")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        c.p3(jsonReader.nextBoolean());
                        continue;
                    }
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'showCalendarDetails' to null.");
                }
                else {
                    if (!nextName.equals("registered")) {
                        jsonReader.skipValue();
                        continue;
                    }
                    if (jsonReader.peek() != JsonToken.NULL) {
                        c.P4(jsonReader.nextLong());
                        continue;
                    }
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'registered' to null.");
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
    
    public static OsObjectSchemaInfo ra() {
        return l5.N0;
    }
    
    public static String sa() {
        return "RealmProfile";
    }
    
    public static long ta(final f0 f0, final c c, final Map<n0, Long> map) {
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
        final String k5 = c.K5();
        if (k5 != null) {
            Table.nativeSetString(nativePtr, b.f, l, k5, false);
        }
        final String t4 = c.t4();
        if (t4 != null) {
            Table.nativeSetString(nativePtr, b.g, l, t4, false);
        }
        final String l2 = c.L3();
        if (l2 != null) {
            Table.nativeSetString(nativePtr, b.h, l, l2, false);
        }
        Table.nativeSetLong(nativePtr, b.i, l, c.Q6(), false);
        Table.nativeSetLong(nativePtr, b.j, l, c.I6(), false);
        Table.nativeSetLong(nativePtr, b.k, l, c.U3(), false);
        final Integer j3 = c.J3();
        if (j3 != null) {
            Table.nativeSetLong(nativePtr, b.l, l, j3.longValue(), false);
        }
        final Long f2 = c.F6();
        if (f2 != null) {
            Table.nativeSetLong(nativePtr, b.m, l, f2.longValue(), false);
        }
        final l0<com.untis.mobile.persistence.realm.a> u2 = c.U2();
        if (u2 != null) {
            final OsList list = new OsList(x2.R(l), b.n);
            for (final com.untis.mobile.persistence.realm.a a : u2) {
                Long value2;
                if ((value2 = map.get(a)) == null) {
                    value2 = x0.D8(f0, a, map);
                }
                list.l(value2);
            }
        }
        final l0<z4.a> i3 = c.I3();
        if (i3 != null) {
            final OsList list2 = new OsList(x2.R(l), b.o);
            for (final z4.a a2 : i3) {
                Long value3;
                if ((value3 = map.get(a2)) == null) {
                    value3 = h5.J8(f0, a2, map);
                }
                list2.l(value3);
            }
        }
        final l0<com.untis.mobile.persistence.realm.b> y6 = c.y6();
        if (y6 != null) {
            final OsList list3 = new OsList(x2.R(l), b.p);
            for (final com.untis.mobile.persistence.realm.b b2 : y6) {
                Long value4;
                if ((value4 = map.get(b2)) == null) {
                    value4 = z0.D8(f0, b2, map);
                }
                list3.l(value4);
            }
        }
        Table.nativeSetBoolean(nativePtr, b.q, l, c.E7(), false);
        Table.nativeSetBoolean(nativePtr, b.r, l, c.l5(), false);
        final String g7 = c.g7();
        if (g7 != null) {
            Table.nativeSetString(nativePtr, b.s, l, g7, false);
        }
        Table.nativeSetLong(nativePtr, b.t, l, c.f4(), false);
        final String z7 = c.z7();
        if (z7 != null) {
            Table.nativeSetString(nativePtr, b.u, l, z7, false);
        }
        final String o7 = c.O7();
        if (o7 != null) {
            Table.nativeSetString(nativePtr, b.v, l, o7, false);
        }
        Table.nativeSetLong(nativePtr, b.w, l, c.C2(), false);
        final String l3 = c.l2();
        if (l3 != null) {
            Table.nativeSetString(nativePtr, b.x, l, l3, false);
        }
        Table.nativeSetBoolean(nativePtr, b.y, l, c.X3(), false);
        final String y7 = c.Y5();
        if (y7 != null) {
            Table.nativeSetString(nativePtr, b.z, l, y7, false);
        }
        Table.nativeSetLong(nativePtr, b.A, l, c.p4(), false);
        Table.nativeSetLong(nativePtr, b.B, l, c.S4(), false);
        final String q4 = c.q4();
        if (q4 != null) {
            Table.nativeSetString(nativePtr, b.C, l, q4, false);
        }
        final String n5 = c.N5();
        if (n5 != null) {
            Table.nativeSetString(nativePtr, b.D, l, n5, false);
        }
        Table.nativeSetBoolean(nativePtr, b.E, l, c.V5(), false);
        Table.nativeSetBoolean(nativePtr, b.F, l, c.H2(), false);
        Table.nativeSetLong(nativePtr, b.G, l, c.D3(), false);
        Table.nativeSetLong(nativePtr, b.H, l, c.S3(), false);
        Table.nativeSetLong(nativePtr, b.I, l, c.U6(), false);
        Table.nativeSetLong(nativePtr, b.J, l, c.V2(), false);
        Table.nativeSetLong(nativePtr, b.K, l, c.j6(), false);
        Table.nativeSetLong(nativePtr, b.L, l, c.S2(), false);
        Table.nativeSetLong(nativePtr, b.M, l, c.h4(), false);
        Table.nativeSetLong(nativePtr, b.N, l, c.g5(), false);
        final l0<com.untis.mobile.persistence.realm.a> b3 = c.b1();
        if (b3 != null) {
            final OsList list4 = new OsList(x2.R(l), b.O);
            for (final com.untis.mobile.persistence.realm.a a3 : b3) {
                Long value5;
                if ((value5 = map.get(a3)) == null) {
                    value5 = x0.D8(f0, a3, map);
                }
                list4.l(value5);
            }
        }
        Table.nativeSetLong(nativePtr, b.P, l, c.m3(), false);
        Table.nativeSetBoolean(nativePtr, b.Q, l, c.g4(), false);
        final l0<com.untis.mobile.persistence.realm.a> q5 = c.q7();
        if (q5 != null) {
            final OsList list5 = new OsList(x2.R(l), b.R);
            for (final com.untis.mobile.persistence.realm.a a4 : q5) {
                Long value6;
                if ((value6 = map.get(a4)) == null) {
                    value6 = x0.D8(f0, a4, map);
                }
                list5.l(value6);
            }
        }
        final String k6 = c.k4();
        if (k6 != null) {
            Table.nativeSetString(nativePtr, b.S, l, k6, false);
        }
        final String l4 = c.L5();
        if (l4 != null) {
            Table.nativeSetString(nativePtr, b.T, l, l4, false);
        }
        final String n6 = c.N4();
        if (n6 != null) {
            Table.nativeSetString(nativePtr, b.U, l, n6, false);
        }
        final String m4 = c.m4();
        if (m4 != null) {
            Table.nativeSetString(nativePtr, b.V, l, m4, false);
        }
        final String o8 = c.O4();
        if (o8 != null) {
            Table.nativeSetString(nativePtr, b.W, l, o8, false);
        }
        Table.nativeSetLong(nativePtr, b.X, l, c.P6(), false);
        Table.nativeSetBoolean(nativePtr, b.Y, l, c.J4(), false);
        Table.nativeSetLong(nativePtr, b.Z, l, c.A0(), false);
        return l;
    }
    
    public static void ua(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
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
            final String k5 = c.K5();
            if (k5 != null) {
                Table.nativeSetString(nativePtr, b.f, l, k5, false);
            }
            final String t4 = c.t4();
            if (t4 != null) {
                Table.nativeSetString(nativePtr, b.g, l, t4, false);
            }
            final String l2 = c.L3();
            if (l2 != null) {
                Table.nativeSetString(nativePtr, b.h, l, l2, false);
            }
            Table.nativeSetLong(nativePtr, b.i, l, c.Q6(), false);
            Table.nativeSetLong(nativePtr, b.j, l, c.I6(), false);
            Table.nativeSetLong(nativePtr, b.k, l, c.U3(), false);
            final Integer j3 = c.J3();
            if (j3 != null) {
                Table.nativeSetLong(nativePtr, b.l, l, j3.longValue(), false);
            }
            final Long f2 = c.F6();
            if (f2 != null) {
                Table.nativeSetLong(nativePtr, b.m, l, f2.longValue(), false);
            }
            final l0<com.untis.mobile.persistence.realm.a> u2 = c.U2();
            if (u2 != null) {
                final OsList list = new OsList(x2.R(l), b.n);
                for (final com.untis.mobile.persistence.realm.a a : u2) {
                    Long value2;
                    if ((value2 = map.get(a)) == null) {
                        value2 = x0.D8(f0, a, map);
                    }
                    list.l(value2);
                }
            }
            final l0<z4.a> i3 = c.I3();
            if (i3 != null) {
                final OsList list2 = new OsList(x2.R(l), b.o);
                for (final z4.a a2 : i3) {
                    Long value3;
                    if ((value3 = map.get(a2)) == null) {
                        value3 = h5.J8(f0, a2, map);
                    }
                    list2.l(value3);
                }
            }
            final l0<com.untis.mobile.persistence.realm.b> y6 = c.y6();
            if (y6 != null) {
                final OsList list3 = new OsList(x2.R(l), b.p);
                for (final com.untis.mobile.persistence.realm.b b2 : y6) {
                    Long value4;
                    if ((value4 = map.get(b2)) == null) {
                        value4 = z0.D8(f0, b2, map);
                    }
                    list3.l(value4);
                }
            }
            Table.nativeSetBoolean(nativePtr, b.q, l, c.E7(), false);
            Table.nativeSetBoolean(nativePtr, b.r, l, c.l5(), false);
            final String g7 = c.g7();
            if (g7 != null) {
                Table.nativeSetString(nativePtr, b.s, l, g7, false);
            }
            Table.nativeSetLong(nativePtr, b.t, l, c.f4(), false);
            final String z7 = c.z7();
            if (z7 != null) {
                Table.nativeSetString(nativePtr, b.u, l, z7, false);
            }
            final String o7 = c.O7();
            if (o7 != null) {
                Table.nativeSetString(nativePtr, b.v, l, o7, false);
            }
            Table.nativeSetLong(nativePtr, b.w, l, c.C2(), false);
            final String l3 = c.l2();
            if (l3 != null) {
                Table.nativeSetString(nativePtr, b.x, l, l3, false);
            }
            Table.nativeSetBoolean(nativePtr, b.y, l, c.X3(), false);
            final String y7 = c.Y5();
            if (y7 != null) {
                Table.nativeSetString(nativePtr, b.z, l, y7, false);
            }
            Table.nativeSetLong(nativePtr, b.A, l, c.p4(), false);
            Table.nativeSetLong(nativePtr, b.B, l, c.S4(), false);
            final String q4 = c.q4();
            if (q4 != null) {
                Table.nativeSetString(nativePtr, b.C, l, q4, false);
            }
            final String n5 = c.N5();
            if (n5 != null) {
                Table.nativeSetString(nativePtr, b.D, l, n5, false);
            }
            Table.nativeSetBoolean(nativePtr, b.E, l, c.V5(), false);
            Table.nativeSetBoolean(nativePtr, b.F, l, c.H2(), false);
            Table.nativeSetLong(nativePtr, b.G, l, c.D3(), false);
            Table.nativeSetLong(nativePtr, b.H, l, c.S3(), false);
            Table.nativeSetLong(nativePtr, b.I, l, c.U6(), false);
            Table.nativeSetLong(nativePtr, b.J, l, c.V2(), false);
            Table.nativeSetLong(nativePtr, b.K, l, c.j6(), false);
            Table.nativeSetLong(nativePtr, b.L, l, c.S2(), false);
            Table.nativeSetLong(nativePtr, b.M, l, c.h4(), false);
            Table.nativeSetLong(nativePtr, b.N, l, c.g5(), false);
            final l0<com.untis.mobile.persistence.realm.a> b3 = c.b1();
            if (b3 != null) {
                final OsList list4 = new OsList(x2.R(l), b.O);
                for (final com.untis.mobile.persistence.realm.a a3 : b3) {
                    Long value5;
                    if ((value5 = map.get(a3)) == null) {
                        value5 = x0.D8(f0, a3, map);
                    }
                    list4.l(value5);
                }
            }
            Table.nativeSetLong(nativePtr, b.P, l, c.m3(), false);
            Table.nativeSetBoolean(nativePtr, b.Q, l, c.g4(), false);
            final l0<com.untis.mobile.persistence.realm.a> q5 = c.q7();
            if (q5 != null) {
                final OsList list5 = new OsList(x2.R(l), b.R);
                for (final com.untis.mobile.persistence.realm.a a4 : q5) {
                    Long value6;
                    if ((value6 = map.get(a4)) == null) {
                        value6 = x0.D8(f0, a4, map);
                    }
                    list5.l(value6);
                }
            }
            final String k6 = c.k4();
            if (k6 != null) {
                Table.nativeSetString(nativePtr, b.S, l, k6, false);
            }
            final String l4 = c.L5();
            if (l4 != null) {
                Table.nativeSetString(nativePtr, b.T, l, l4, false);
            }
            final String n6 = c.N4();
            if (n6 != null) {
                Table.nativeSetString(nativePtr, b.U, l, n6, false);
            }
            final String m4 = c.m4();
            if (m4 != null) {
                Table.nativeSetString(nativePtr, b.V, l, m4, false);
            }
            final String o8 = c.O4();
            if (o8 != null) {
                Table.nativeSetString(nativePtr, b.W, l, o8, false);
            }
            Table.nativeSetLong(nativePtr, b.X, l, c.P6(), false);
            Table.nativeSetBoolean(nativePtr, b.Y, l, c.J4(), false);
            Table.nativeSetLong(nativePtr, b.Z, l, c.A0(), false);
        }
    }
    
    public static long va(final f0 f0, final c c, final Map<n0, Long> map) {
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
        final String k5 = c.K5();
        if (k5 != null) {
            Table.nativeSetString(nativePtr, b.f, rowWithPrimaryKey, k5, false);
        }
        else {
            Table.nativeSetNull(nativePtr, b.f, rowWithPrimaryKey, false);
        }
        final long n = rowWithPrimaryKey;
        final String t4 = c.t4();
        final long g = b.g;
        if (t4 != null) {
            Table.nativeSetString(nativePtr, g, n, t4, false);
        }
        else {
            Table.nativeSetNull(nativePtr, g, n, false);
        }
        final String l3 = c.L3();
        final long h = b.h;
        if (l3 != null) {
            Table.nativeSetString(nativePtr, h, n, l3, false);
        }
        else {
            Table.nativeSetNull(nativePtr, h, n, false);
        }
        Table.nativeSetLong(nativePtr, b.i, n, c.Q6(), false);
        Table.nativeSetLong(nativePtr, b.j, n, c.I6(), false);
        Table.nativeSetLong(nativePtr, b.k, n, c.U3(), false);
        final Integer j3 = c.J3();
        final long i = b.l;
        if (j3 != null) {
            Table.nativeSetLong(nativePtr, i, n, j3.longValue(), false);
        }
        else {
            Table.nativeSetNull(nativePtr, i, n, false);
        }
        final Long f2 = c.F6();
        final long m = b.m;
        if (f2 != null) {
            Table.nativeSetLong(nativePtr, m, n, f2.longValue(), false);
        }
        else {
            Table.nativeSetNull(nativePtr, m, n, false);
        }
        final OsList list = new OsList(x2.R(n), b.n);
        final l0<com.untis.mobile.persistence.realm.a> u2 = c.U2();
        long n3;
        if (u2 != null && u2.size() == list.b0()) {
            final int size = u2.size();
            int n2 = 0;
            n3 = nativePtr;
            while (n2 < size) {
                final com.untis.mobile.persistence.realm.a a = u2.get(n2);
                Long value;
                if ((value = map.get(a)) == null) {
                    value = x0.F8(f0, a, map);
                }
                list.Z(n2, value);
                ++n2;
            }
        }
        else {
            list.M();
            n3 = nativePtr;
            if (u2 != null) {
                final Iterator<com.untis.mobile.persistence.realm.a> iterator = u2.iterator();
                while (true) {
                    n3 = nativePtr;
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
        final OsList list2 = new OsList(x2.R(n), b.o);
        final l0<z4.a> i2 = c.I3();
        if (i2 != null && i2.size() == list2.b0()) {
            for (int size2 = i2.size(), n4 = 0; n4 < size2; ++n4) {
                final z4.a a3 = i2.get(n4);
                Long value3;
                if ((value3 = map.get(a3)) == null) {
                    value3 = h5.L8(f0, a3, map);
                }
                list2.Z(n4, value3);
            }
        }
        else {
            list2.M();
            if (i2 != null) {
                for (final z4.a a4 : i2) {
                    Long value4;
                    if ((value4 = map.get(a4)) == null) {
                        value4 = h5.L8(f0, a4, map);
                    }
                    list2.l(value4);
                }
            }
        }
        final OsList list3 = new OsList(x2.R(n), b.p);
        final l0<com.untis.mobile.persistence.realm.b> y6 = c.y6();
        if (y6 != null && y6.size() == list3.b0()) {
            for (int size3 = y6.size(), n5 = 0; n5 < size3; ++n5) {
                final com.untis.mobile.persistence.realm.b b2 = y6.get(n5);
                Long value5;
                if ((value5 = map.get(b2)) == null) {
                    value5 = z0.F8(f0, b2, map);
                }
                list3.Z(n5, value5);
            }
        }
        else {
            list3.M();
            if (y6 != null) {
                for (final com.untis.mobile.persistence.realm.b b3 : y6) {
                    Long value6;
                    if ((value6 = map.get(b3)) == null) {
                        value6 = z0.F8(f0, b3, map);
                    }
                    list3.l(value6);
                }
            }
        }
        Table.nativeSetBoolean(n3, b.q, n, c.E7(), false);
        Table.nativeSetBoolean(n3, b.r, n, c.l5(), false);
        final String g2 = c.g7();
        final long s = b.s;
        if (g2 != null) {
            Table.nativeSetString(n3, s, n, g2, false);
        }
        else {
            Table.nativeSetNull(n3, s, n, false);
        }
        Table.nativeSetLong(n3, b.t, n, c.f4(), false);
        final String z7 = c.z7();
        final long u3 = b.u;
        if (z7 != null) {
            Table.nativeSetString(n3, u3, n, z7, false);
        }
        else {
            Table.nativeSetNull(n3, u3, n, false);
        }
        final String o7 = c.O7();
        final long v = b.v;
        if (o7 != null) {
            Table.nativeSetString(n3, v, n, o7, false);
        }
        else {
            Table.nativeSetNull(n3, v, n, false);
        }
        Table.nativeSetLong(n3, b.w, n, c.C2(), false);
        final String l4 = c.l2();
        final long x3 = b.x;
        if (l4 != null) {
            Table.nativeSetString(n3, x3, n, l4, false);
        }
        else {
            Table.nativeSetNull(n3, x3, n, false);
        }
        Table.nativeSetBoolean(n3, b.y, n, c.X3(), false);
        final String y7 = c.Y5();
        final long z8 = b.z;
        if (y7 != null) {
            Table.nativeSetString(n3, z8, n, y7, false);
        }
        else {
            Table.nativeSetNull(n3, z8, n, false);
        }
        Table.nativeSetLong(n3, b.A, n, c.p4(), false);
        Table.nativeSetLong(n3, b.B, n, c.S4(), false);
        final String q4 = c.q4();
        final long c2 = b.C;
        if (q4 != null) {
            Table.nativeSetString(n3, c2, n, q4, false);
        }
        else {
            Table.nativeSetNull(n3, c2, n, false);
        }
        final String n6 = c.N5();
        final long d = b.D;
        if (n6 != null) {
            Table.nativeSetString(n3, d, n, n6, false);
        }
        else {
            Table.nativeSetNull(n3, d, n, false);
        }
        Table.nativeSetBoolean(n3, b.E, n, c.V5(), false);
        Table.nativeSetBoolean(n3, b.F, n, c.H2(), false);
        Table.nativeSetLong(n3, b.G, n, c.D3(), false);
        Table.nativeSetLong(n3, b.H, n, c.S3(), false);
        Table.nativeSetLong(n3, b.I, n, c.U6(), false);
        Table.nativeSetLong(n3, b.J, n, c.V2(), false);
        Table.nativeSetLong(n3, b.K, n, c.j6(), false);
        Table.nativeSetLong(n3, b.L, n, c.S2(), false);
        Table.nativeSetLong(n3, b.M, n, c.h4(), false);
        Table.nativeSetLong(n3, b.N, n, c.g5(), false);
        final OsList list4 = new OsList(x2.R(n), b.O);
        final l0<com.untis.mobile.persistence.realm.a> b4 = c.b1();
        if (b4 != null && b4.size() == list4.b0()) {
            for (int size4 = b4.size(), n7 = 0; n7 < size4; ++n7) {
                final com.untis.mobile.persistence.realm.a a5 = b4.get(n7);
                Long value7;
                if ((value7 = map.get(a5)) == null) {
                    value7 = x0.F8(f0, a5, map);
                }
                list4.Z(n7, value7);
            }
        }
        else {
            list4.M();
            if (b4 != null) {
                for (final com.untis.mobile.persistence.realm.a a6 : b4) {
                    Long value8;
                    if ((value8 = map.get(a6)) == null) {
                        value8 = x0.F8(f0, a6, map);
                    }
                    list4.l(value8);
                }
            }
        }
        Table.nativeSetLong(n3, b.P, n, c.m3(), false);
        Table.nativeSetBoolean(n3, b.Q, n, c.g4(), false);
        final OsList list5 = new OsList(x2.R(n), b.R);
        final l0<com.untis.mobile.persistence.realm.a> q5 = c.q7();
        if (q5 != null && q5.size() == list5.b0()) {
            for (int size5 = q5.size(), n8 = 0; n8 < size5; ++n8) {
                final com.untis.mobile.persistence.realm.a a7 = q5.get(n8);
                Long value9;
                if ((value9 = map.get(a7)) == null) {
                    value9 = x0.F8(f0, a7, map);
                }
                list5.Z(n8, value9);
            }
        }
        else {
            list5.M();
            if (q5 != null) {
                for (final com.untis.mobile.persistence.realm.a a8 : q5) {
                    Long value10;
                    if ((value10 = map.get(a8)) == null) {
                        value10 = x0.F8(f0, a8, map);
                    }
                    list5.l(value10);
                }
            }
        }
        final String k6 = c.k4();
        final long s2 = b.S;
        if (k6 != null) {
            Table.nativeSetString(n3, s2, n, k6, false);
        }
        else {
            Table.nativeSetNull(n3, s2, n, false);
        }
        final String l5 = c.L5();
        final long t5 = b.T;
        if (l5 != null) {
            Table.nativeSetString(n3, t5, n, l5, false);
        }
        else {
            Table.nativeSetNull(n3, t5, n, false);
        }
        final String n9 = c.N4();
        final long u4 = b.U;
        if (n9 != null) {
            Table.nativeSetString(n3, u4, n, n9, false);
        }
        else {
            Table.nativeSetNull(n3, u4, n, false);
        }
        final String m2 = c.m4();
        final long v2 = b.V;
        if (m2 != null) {
            Table.nativeSetString(n3, v2, n, m2, false);
        }
        else {
            Table.nativeSetNull(n3, v2, n, false);
        }
        final String o8 = c.O4();
        final long w = b.W;
        if (o8 != null) {
            Table.nativeSetString(n3, w, n, o8, false);
        }
        else {
            Table.nativeSetNull(n3, w, n, false);
        }
        Table.nativeSetLong(n3, b.X, n, c.P6(), false);
        Table.nativeSetBoolean(n3, b.Y, n, c.J4(), false);
        Table.nativeSetLong(n3, b.Z, n, c.A0(), false);
        return n;
    }
    
    public static void wa(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
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
            final String k5 = c.K5();
            if (k5 != null) {
                Table.nativeSetString(nativePtr, b.f, rowWithPrimaryKey, k5, false);
            }
            else {
                Table.nativeSetNull(nativePtr, b.f, rowWithPrimaryKey, false);
            }
            final long n = rowWithPrimaryKey;
            final String t4 = c.t4();
            final long g = b.g;
            if (t4 != null) {
                Table.nativeSetString(nativePtr, g, n, t4, false);
            }
            else {
                Table.nativeSetNull(nativePtr, g, n, false);
            }
            final String l3 = c.L3();
            final long h = b.h;
            if (l3 != null) {
                Table.nativeSetString(nativePtr, h, n, l3, false);
            }
            else {
                Table.nativeSetNull(nativePtr, h, n, false);
            }
            Table.nativeSetLong(nativePtr, b.i, n, c.Q6(), false);
            Table.nativeSetLong(nativePtr, b.j, n, c.I6(), false);
            Table.nativeSetLong(nativePtr, b.k, n, c.U3(), false);
            final Integer j3 = c.J3();
            final long i = b.l;
            if (j3 != null) {
                Table.nativeSetLong(nativePtr, i, n, j3.longValue(), false);
            }
            else {
                Table.nativeSetNull(nativePtr, i, n, false);
            }
            final Long f2 = c.F6();
            final long m = b.m;
            if (f2 != null) {
                Table.nativeSetLong(nativePtr, m, n, f2.longValue(), false);
            }
            else {
                Table.nativeSetNull(nativePtr, m, n, false);
            }
            final OsList list = new OsList(x2.R(n), b.n);
            final l0<com.untis.mobile.persistence.realm.a> u2 = c.U2();
            if (u2 != null && u2.size() == list.b0()) {
                for (int size = u2.size(), n2 = 0; n2 < size; ++n2) {
                    final com.untis.mobile.persistence.realm.a a = u2.get(n2);
                    Long value;
                    if ((value = map.get(a)) == null) {
                        value = x0.F8(f0, a, map);
                    }
                    list.Z(n2, value);
                }
            }
            else {
                final long n3 = nativePtr;
                list.M();
                nativePtr = n3;
                if (u2 != null) {
                    final Iterator<com.untis.mobile.persistence.realm.a> iterator2 = u2.iterator();
                    while (true) {
                        nativePtr = n3;
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
            final OsList list2 = new OsList(x2.R(n), b.o);
            final l0<z4.a> i2 = c.I3();
            if (i2 != null && i2.size() == list2.b0()) {
                for (int size2 = i2.size(), n4 = 0; n4 < size2; ++n4) {
                    final z4.a a3 = i2.get(n4);
                    Long value3;
                    if ((value3 = map.get(a3)) == null) {
                        value3 = h5.L8(f0, a3, map);
                    }
                    list2.Z(n4, value3);
                }
            }
            else {
                list2.M();
                if (i2 != null) {
                    for (final z4.a a4 : i2) {
                        Long value4;
                        if ((value4 = map.get(a4)) == null) {
                            value4 = h5.L8(f0, a4, map);
                        }
                        list2.l(value4);
                    }
                }
            }
            final OsList list3 = new OsList(x2.R(n), b.p);
            final l0<com.untis.mobile.persistence.realm.b> y6 = c.y6();
            if (y6 != null && y6.size() == list3.b0()) {
                for (int size3 = y6.size(), n5 = 0; n5 < size3; ++n5) {
                    final com.untis.mobile.persistence.realm.b b2 = y6.get(n5);
                    Long value5;
                    if ((value5 = map.get(b2)) == null) {
                        value5 = z0.F8(f0, b2, map);
                    }
                    list3.Z(n5, value5);
                }
            }
            else {
                list3.M();
                if (y6 != null) {
                    for (final com.untis.mobile.persistence.realm.b b3 : y6) {
                        Long value6;
                        if ((value6 = map.get(b3)) == null) {
                            value6 = z0.F8(f0, b3, map);
                        }
                        list3.l(value6);
                    }
                }
            }
            Table.nativeSetBoolean(nativePtr, b.q, n, c.E7(), false);
            Table.nativeSetBoolean(nativePtr, b.r, n, c.l5(), false);
            final String g2 = c.g7();
            final long s = b.s;
            if (g2 != null) {
                Table.nativeSetString(nativePtr, s, n, g2, false);
            }
            else {
                Table.nativeSetNull(nativePtr, s, n, false);
            }
            Table.nativeSetLong(nativePtr, b.t, n, c.f4(), false);
            final String z7 = c.z7();
            final long u3 = b.u;
            if (z7 != null) {
                Table.nativeSetString(nativePtr, u3, n, z7, false);
            }
            else {
                Table.nativeSetNull(nativePtr, u3, n, false);
            }
            final String o7 = c.O7();
            final long v = b.v;
            if (o7 != null) {
                Table.nativeSetString(nativePtr, v, n, o7, false);
            }
            else {
                Table.nativeSetNull(nativePtr, v, n, false);
            }
            Table.nativeSetLong(nativePtr, b.w, n, c.C2(), false);
            final String l4 = c.l2();
            final long x3 = b.x;
            if (l4 != null) {
                Table.nativeSetString(nativePtr, x3, n, l4, false);
            }
            else {
                Table.nativeSetNull(nativePtr, x3, n, false);
            }
            Table.nativeSetBoolean(nativePtr, b.y, n, c.X3(), false);
            final String y7 = c.Y5();
            final long z8 = b.z;
            if (y7 != null) {
                Table.nativeSetString(nativePtr, z8, n, y7, false);
            }
            else {
                Table.nativeSetNull(nativePtr, z8, n, false);
            }
            Table.nativeSetLong(nativePtr, b.A, n, c.p4(), false);
            Table.nativeSetLong(nativePtr, b.B, n, c.S4(), false);
            final String q4 = c.q4();
            final long c2 = b.C;
            if (q4 != null) {
                Table.nativeSetString(nativePtr, c2, n, q4, false);
            }
            else {
                Table.nativeSetNull(nativePtr, c2, n, false);
            }
            final String n6 = c.N5();
            final long d = b.D;
            if (n6 != null) {
                Table.nativeSetString(nativePtr, d, n, n6, false);
            }
            else {
                Table.nativeSetNull(nativePtr, d, n, false);
            }
            Table.nativeSetBoolean(nativePtr, b.E, n, c.V5(), false);
            Table.nativeSetBoolean(nativePtr, b.F, n, c.H2(), false);
            Table.nativeSetLong(nativePtr, b.G, n, c.D3(), false);
            Table.nativeSetLong(nativePtr, b.H, n, c.S3(), false);
            Table.nativeSetLong(nativePtr, b.I, n, c.U6(), false);
            Table.nativeSetLong(nativePtr, b.J, n, c.V2(), false);
            Table.nativeSetLong(nativePtr, b.K, n, c.j6(), false);
            Table.nativeSetLong(nativePtr, b.L, n, c.S2(), false);
            Table.nativeSetLong(nativePtr, b.M, n, c.h4(), false);
            Table.nativeSetLong(nativePtr, b.N, n, c.g5(), false);
            final OsList list4 = new OsList(x2.R(n), b.O);
            final l0<com.untis.mobile.persistence.realm.a> b4 = c.b1();
            if (b4 != null && b4.size() == list4.b0()) {
                for (int size4 = b4.size(), n7 = 0; n7 < size4; ++n7) {
                    final com.untis.mobile.persistence.realm.a a5 = b4.get(n7);
                    Long value7;
                    if ((value7 = map.get(a5)) == null) {
                        value7 = x0.F8(f0, a5, map);
                    }
                    list4.Z(n7, value7);
                }
            }
            else {
                list4.M();
                if (b4 != null) {
                    for (final com.untis.mobile.persistence.realm.a a6 : b4) {
                        Long value8;
                        if ((value8 = map.get(a6)) == null) {
                            value8 = x0.F8(f0, a6, map);
                        }
                        list4.l(value8);
                    }
                }
            }
            Table.nativeSetLong(nativePtr, b.P, n, c.m3(), false);
            Table.nativeSetBoolean(nativePtr, b.Q, n, c.g4(), false);
            final OsList list5 = new OsList(x2.R(n), b.R);
            final l0<com.untis.mobile.persistence.realm.a> q5 = c.q7();
            if (q5 != null && q5.size() == list5.b0()) {
                for (int size5 = q5.size(), n8 = 0; n8 < size5; ++n8) {
                    final com.untis.mobile.persistence.realm.a a7 = q5.get(n8);
                    Long value9;
                    if ((value9 = map.get(a7)) == null) {
                        value9 = x0.F8(f0, a7, map);
                    }
                    list5.Z(n8, value9);
                }
            }
            else {
                list5.M();
                if (q5 != null) {
                    for (final com.untis.mobile.persistence.realm.a a8 : q5) {
                        Long value10;
                        if ((value10 = map.get(a8)) == null) {
                            value10 = x0.F8(f0, a8, map);
                        }
                        list5.l(value10);
                    }
                }
            }
            final String k6 = c.k4();
            final long s2 = b.S;
            if (k6 != null) {
                Table.nativeSetString(nativePtr, s2, n, k6, false);
            }
            else {
                Table.nativeSetNull(nativePtr, s2, n, false);
            }
            final String l5 = c.L5();
            final long t5 = b.T;
            if (l5 != null) {
                Table.nativeSetString(nativePtr, t5, n, l5, false);
            }
            else {
                Table.nativeSetNull(nativePtr, t5, n, false);
            }
            final String n9 = c.N4();
            final long u4 = b.U;
            if (n9 != null) {
                Table.nativeSetString(nativePtr, u4, n, n9, false);
            }
            else {
                Table.nativeSetNull(nativePtr, u4, n, false);
            }
            final String m2 = c.m4();
            final long v2 = b.V;
            if (m2 != null) {
                Table.nativeSetString(nativePtr, v2, n, m2, false);
            }
            else {
                Table.nativeSetNull(nativePtr, v2, n, false);
            }
            final String o8 = c.O4();
            final long w = b.W;
            if (o8 != null) {
                Table.nativeSetString(nativePtr, w, n, o8, false);
            }
            else {
                Table.nativeSetNull(nativePtr, w, n, false);
            }
            Table.nativeSetLong(nativePtr, b.X, n, c.P6(), false);
            Table.nativeSetBoolean(nativePtr, b.Y, n, c.J4(), false);
            Table.nativeSetLong(nativePtr, b.Z, n, c.A0(), false);
        }
    }
    
    static l5 xa(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(c.class), false, Collections.emptyList());
        final l5 l5 = new l5();
        h.a();
        return l5;
    }
    
    static c ya(final f0 f0, final b b, final c c, final c c2, final Map<n0, p> map, final Set<q> set) {
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(c.class), set);
        osObjectBuilder.L(b.e, c2.a());
        osObjectBuilder.d0(b.f, c2.K5());
        osObjectBuilder.d0(b.g, c2.t4());
        osObjectBuilder.d0(b.h, c2.L3());
        osObjectBuilder.L(b.i, c2.Q6());
        osObjectBuilder.K(b.j, c2.I6());
        osObjectBuilder.L(b.k, c2.U3());
        osObjectBuilder.K(b.l, c2.J3());
        osObjectBuilder.L(b.m, c2.F6());
        final l0<com.untis.mobile.persistence.realm.a> u2 = c2.U2();
        final int n = 0;
        if (u2 != null) {
            final l0<n0> l0 = new l0<n0>();
            for (int i = 0; i < u2.size(); ++i) {
                final com.untis.mobile.persistence.realm.a a = u2.get(i);
                com.untis.mobile.persistence.realm.a v8 = (com.untis.mobile.persistence.realm.a)map.get(a);
                if (v8 == null) {
                    v8 = x0.v8(f0, (x0.b)f0.H().j(com.untis.mobile.persistence.realm.a.class), a, true, map, set);
                }
                l0.add(v8);
            }
            osObjectBuilder.Z(b.n, l0);
        }
        else {
            osObjectBuilder.Z(b.n, new l0<n0>());
        }
        final l0<z4.a> i2 = c2.I3();
        if (i2 != null) {
            final l0<n0> l2 = new l0<n0>();
            for (int j = 0; j < i2.size(); ++j) {
                final z4.a a2 = i2.get(j);
                z4.a b2 = (z4.a)map.get(a2);
                if (b2 == null) {
                    b2 = h5.B8(f0, (h5.b)f0.H().j(z4.a.class), a2, true, map, set);
                }
                l2.add(b2);
            }
            osObjectBuilder.Z(b.o, l2);
        }
        else {
            osObjectBuilder.Z(b.o, new l0<n0>());
        }
        final l0<com.untis.mobile.persistence.realm.b> y6 = c2.y6();
        if (y6 != null) {
            final l0<n0> l3 = new l0<n0>();
            for (int k = 0; k < y6.size(); ++k) {
                final com.untis.mobile.persistence.realm.b b3 = y6.get(k);
                com.untis.mobile.persistence.realm.b v9 = (com.untis.mobile.persistence.realm.b)map.get(b3);
                if (v9 == null) {
                    v9 = z0.v8(f0, (z0.b)f0.H().j(com.untis.mobile.persistence.realm.b.class), b3, true, map, set);
                }
                l3.add(v9);
            }
            osObjectBuilder.Z(b.p, l3);
        }
        else {
            osObjectBuilder.Z(b.p, new l0<n0>());
        }
        osObjectBuilder.n(b.q, c2.E7());
        osObjectBuilder.n(b.r, c2.l5());
        osObjectBuilder.d0(b.s, c2.g7());
        osObjectBuilder.L(b.t, c2.f4());
        osObjectBuilder.d0(b.u, c2.z7());
        osObjectBuilder.d0(b.v, c2.O7());
        osObjectBuilder.L(b.w, c2.C2());
        osObjectBuilder.d0(b.x, c2.l2());
        osObjectBuilder.n(b.y, c2.X3());
        osObjectBuilder.d0(b.z, c2.Y5());
        osObjectBuilder.L(b.A, c2.p4());
        osObjectBuilder.K(b.B, c2.S4());
        osObjectBuilder.d0(b.C, c2.q4());
        osObjectBuilder.d0(b.D, c2.N5());
        osObjectBuilder.n(b.E, c2.V5());
        osObjectBuilder.n(b.F, c2.H2());
        osObjectBuilder.L(b.G, c2.D3());
        osObjectBuilder.L(b.H, c2.S3());
        osObjectBuilder.L(b.I, c2.U6());
        osObjectBuilder.L(b.J, c2.V2());
        osObjectBuilder.L(b.K, c2.j6());
        osObjectBuilder.L(b.L, c2.S2());
        osObjectBuilder.K(b.M, c2.h4());
        osObjectBuilder.L(b.N, c2.g5());
        final l0<com.untis.mobile.persistence.realm.a> b4 = c2.b1();
        if (b4 != null) {
            final l0<n0> l4 = new l0<n0>();
            for (int n2 = 0; n2 < b4.size(); ++n2) {
                final com.untis.mobile.persistence.realm.a a3 = b4.get(n2);
                com.untis.mobile.persistence.realm.a v10 = (com.untis.mobile.persistence.realm.a)map.get(a3);
                if (v10 == null) {
                    v10 = x0.v8(f0, (x0.b)f0.H().j(com.untis.mobile.persistence.realm.a.class), a3, true, map, set);
                }
                l4.add(v10);
            }
            osObjectBuilder.Z(b.O, l4);
        }
        else {
            osObjectBuilder.Z(b.O, new l0<n0>());
        }
        osObjectBuilder.L(b.P, c2.m3());
        osObjectBuilder.n(b.Q, c2.g4());
        final l0<com.untis.mobile.persistence.realm.a> q7 = c2.q7();
        if (q7 != null) {
            final l0<n0> l5 = new l0<n0>();
            for (int n3 = n; n3 < q7.size(); ++n3) {
                final com.untis.mobile.persistence.realm.a a4 = q7.get(n3);
                com.untis.mobile.persistence.realm.a v11 = (com.untis.mobile.persistence.realm.a)map.get(a4);
                if (v11 == null) {
                    v11 = x0.v8(f0, (x0.b)f0.H().j(com.untis.mobile.persistence.realm.a.class), a4, true, map, set);
                }
                l5.add(v11);
            }
            osObjectBuilder.Z(b.R, l5);
        }
        else {
            osObjectBuilder.Z(b.R, new l0<n0>());
        }
        osObjectBuilder.d0(b.S, c2.k4());
        osObjectBuilder.d0(b.T, c2.L5());
        osObjectBuilder.d0(b.U, c2.N4());
        osObjectBuilder.d0(b.V, c2.m4());
        osObjectBuilder.d0(b.W, c2.O4());
        osObjectBuilder.L(b.X, c2.P6());
        osObjectBuilder.n(b.Y, c2.J4());
        osObjectBuilder.L(b.Z, c2.A0());
        osObjectBuilder.i0();
        return c;
    }
    
    @Override
    public long A0() {
        this.G0.f().h();
        return this.G0.g().m(this.F0.Z);
    }
    
    @Override
    public void A5(final String s) {
        if (this.G0.i()) {
            if (!this.G0.d()) {
                return;
            }
            final r g = this.G0.g();
            if (s != null) {
                g.g().t0(this.F0.v, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'schoolDisplayName' to null.");
        }
        else {
            this.G0.f().h();
            if (s != null) {
                this.G0.g().d(this.F0.v, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'schoolDisplayName' to null.");
        }
    }
    
    @Override
    public void A6(final int n) {
        if (!this.G0.i()) {
            this.G0.f().h();
            this.G0.g().s(this.F0.M, n);
            return;
        }
        if (!this.G0.d()) {
            return;
        }
        final r g = this.G0.g();
        g.g().q0(this.F0.M, g.l0(), n, true);
    }
    
    @Override
    public void B2(final Long n) {
        if (this.G0.i()) {
            if (!this.G0.d()) {
                return;
            }
            final r g = this.G0.g();
            if (n == null) {
                g.g().r0(this.F0.m, g.l0(), true);
                return;
            }
            g.g().q0(this.F0.m, g.l0(), n, true);
        }
        else {
            this.G0.f().h();
            final r g2 = this.G0.g();
            final long m = this.F0.m;
            if (n == null) {
                g2.I(m);
                return;
            }
            g2.s(m, n);
        }
    }
    
    @Override
    public void B7(final String s) {
        if (this.G0.i()) {
            if (!this.G0.d()) {
                return;
            }
            final r g = this.G0.g();
            if (s != null) {
                g.g().t0(this.F0.U, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'substitutionPlanningUrl' to null.");
        }
        else {
            this.G0.f().h();
            if (s != null) {
                this.G0.g().d(this.F0.U, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'substitutionPlanningUrl' to null.");
        }
    }
    
    @Override
    public long C2() {
        this.G0.f().h();
        return this.G0.g().m(this.F0.w);
    }
    
    @Override
    public void C7(final String s) {
        if (this.G0.i()) {
            if (!this.G0.d()) {
                return;
            }
            final r g = this.G0.g();
            if (s != null) {
                g.g().t0(this.F0.f, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'userLogin' to null.");
        }
        else {
            this.G0.f().h();
            if (s != null) {
                this.G0.g().d(this.F0.f, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'userLogin' to null.");
        }
    }
    
    @Override
    public long D3() {
        this.G0.f().h();
        return this.G0.g().m(this.F0.G);
    }
    
    @Override
    public void D6(final boolean b) {
        if (!this.G0.i()) {
            this.G0.f().h();
            this.G0.g().i(this.F0.y, b);
            return;
        }
        if (!this.G0.d()) {
            return;
        }
        final r g = this.G0.g();
        g.g().j0(this.F0.y, g.l0(), b, true);
    }
    
    @Override
    public boolean E7() {
        this.G0.f().h();
        return this.G0.g().l(this.F0.q);
    }
    
    @Override
    public void F4(final l0<com.untis.mobile.persistence.realm.a> l0) {
        final boolean i = this.G0.i();
        final int n = 0;
        int j = 0;
        l0<com.untis.mobile.persistence.realm.a> l2 = l0;
        if (i) {
            if (!this.G0.d()) {
                return;
            }
            if (this.G0.e().contains("lockScreenIds")) {
                return;
            }
            if ((l2 = l0) != null) {
                l2 = l0;
                if (!l0.G0()) {
                    final f0 f0 = (f0)this.G0.f();
                    l2 = new l0<com.untis.mobile.persistence.realm.a>();
                    for (final com.untis.mobile.persistence.realm.a a : l0) {
                        com.untis.mobile.persistence.realm.a a2;
                        if ((a2 = a) != null) {
                            if (io.realm.p0.j8(a)) {
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
        this.G0.f().h();
        final OsList p = this.G0.g().p(this.F0.R);
        if (l2 != null && l2.size() == p.b0()) {
            while (j < l2.size()) {
                final com.untis.mobile.persistence.realm.a a3 = l2.get(j);
                this.G0.c(a3);
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
                this.G0.c(a4);
                p.l(((p)a4).S6().g().l0());
            }
        }
    }
    
    @Override
    public Long F6() {
        this.G0.f().h();
        if (this.G0.g().y(this.F0.m)) {
            return null;
        }
        return this.G0.g().m(this.F0.m);
    }
    
    @Override
    public boolean H2() {
        this.G0.f().h();
        return this.G0.g().l(this.F0.F);
    }
    
    @Override
    public void H4(final String s) {
        if (this.G0.i()) {
            if (!this.G0.d()) {
                return;
            }
            final r g = this.G0.g();
            if (s != null) {
                g.g().t0(this.F0.S, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'messengerServerUrl' to null.");
        }
        else {
            this.G0.f().h();
            if (s != null) {
                this.G0.g().d(this.F0.S, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'messengerServerUrl' to null.");
        }
    }
    
    @Override
    public l0<z4.a> I3() {
        this.G0.f().h();
        final l0<z4.a> i0 = this.I0;
        if (i0 != null) {
            return i0;
        }
        return this.I0 = new l0<z4.a>(z4.a.class, this.G0.g().p(this.F0.o), this.G0.f());
    }
    
    @Override
    public int I6() {
        this.G0.f().h();
        return (int)this.G0.g().m(this.F0.j);
    }
    
    @Override
    public void I7(final String s) {
        if (this.G0.i()) {
            if (!this.G0.d()) {
                return;
            }
            final r g = this.G0.g();
            if (s != null) {
                g.g().t0(this.F0.W, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'authenticationToken' to null.");
        }
        else {
            this.G0.f().h();
            if (s != null) {
                this.G0.g().d(this.F0.W, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'authenticationToken' to null.");
        }
    }
    
    @Override
    public Integer J3() {
        this.G0.f().h();
        if (this.G0.g().y(this.F0.l)) {
            return null;
        }
        return (int)this.G0.g().m(this.F0.l);
    }
    
    @Override
    public boolean J4() {
        this.G0.f().h();
        return this.G0.g().l(this.F0.Y);
    }
    
    @Override
    public void K3(final String s) {
        if (this.G0.i()) {
            if (!this.G0.d()) {
                return;
            }
            final r g = this.G0.g();
            if (s != null) {
                g.g().t0(this.F0.z, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'schoolMobileServiceUrl' to null.");
        }
        else {
            this.G0.f().h();
            if (s != null) {
                this.G0.g().d(this.F0.z, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'schoolMobileServiceUrl' to null.");
        }
    }
    
    @Override
    public String K5() {
        this.G0.f().h();
        return this.G0.g().U(this.F0.f);
    }
    
    @Override
    public void L2(final String s) {
        if (this.G0.i()) {
            if (!this.G0.d()) {
                return;
            }
            final r g = this.G0.g();
            if (s == null) {
                g.g().r0(this.F0.s, g.l0(), true);
                return;
            }
            g.g().t0(this.F0.s, g.l0(), s, true);
        }
        else {
            this.G0.f().h();
            if (s == null) {
                this.G0.g().I(this.F0.s);
                return;
            }
            this.G0.g().d(this.F0.s, s);
        }
    }
    
    @Override
    public String L3() {
        this.G0.f().h();
        return this.G0.g().U(this.F0.h);
    }
    
    @Override
    public void L4(final long n) {
        if (!this.G0.i()) {
            this.G0.f().h();
            this.G0.g().s(this.F0.I, n);
            return;
        }
        if (!this.G0.d()) {
            return;
        }
        final r g = this.G0.g();
        g.g().q0(this.F0.I, g.l0(), n, true);
    }
    
    @Override
    public String L5() {
        this.G0.f().h();
        return this.G0.g().U(this.F0.T);
    }
    
    @Override
    public void L6(final String s) {
        if (this.G0.i()) {
            if (!this.G0.d()) {
                return;
            }
            final r g = this.G0.g();
            if (s != null) {
                g.g().t0(this.F0.x, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'schoolServerUrl' to null.");
        }
        else {
            this.G0.f().h();
            if (s != null) {
                this.G0.g().d(this.F0.x, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'schoolServerUrl' to null.");
        }
    }
    
    @Override
    public void N2(final long n) {
        if (!this.G0.i()) {
            this.G0.f().h();
            this.G0.g().s(this.F0.t, n);
            return;
        }
        if (!this.G0.d()) {
            return;
        }
        final r g = this.G0.g();
        g.g().q0(this.F0.t, g.l0(), n, true);
    }
    
    @Override
    public void N3(final long n) {
        if (!this.G0.i()) {
            this.G0.f().h();
            this.G0.g().s(this.F0.P, n);
            return;
        }
        if (!this.G0.d()) {
            return;
        }
        final r g = this.G0.g();
        g.g().q0(this.F0.P, g.l0(), n, true);
    }
    
    @Override
    public String N4() {
        this.G0.f().h();
        return this.G0.g().U(this.F0.U);
    }
    
    @Override
    public String N5() {
        this.G0.f().h();
        return this.G0.g().U(this.F0.D);
    }
    
    @Override
    public String O4() {
        this.G0.f().h();
        return this.G0.g().U(this.F0.W);
    }
    
    @Override
    public void O5(final long n) {
        if (!this.G0.i()) {
            this.G0.f().h();
            this.G0.g().s(this.F0.H, n);
            return;
        }
        if (!this.G0.d()) {
            return;
        }
        final r g = this.G0.g();
        g.g().q0(this.F0.H, g.l0(), n, true);
    }
    
    @Override
    public String O7() {
        this.G0.f().h();
        return this.G0.g().U(this.F0.v);
    }
    
    @Override
    public void P4(final long n) {
        if (!this.G0.i()) {
            this.G0.f().h();
            this.G0.g().s(this.F0.Z, n);
            return;
        }
        if (!this.G0.d()) {
            return;
        }
        final r g = this.G0.g();
        g.g().q0(this.F0.Z, g.l0(), n, true);
    }
    
    @Override
    public long P6() {
        this.G0.f().h();
        return this.G0.g().m(this.F0.X);
    }
    
    @Override
    public void Q3(final String s) {
        if (this.G0.i()) {
            if (!this.G0.d()) {
                return;
            }
            final r g = this.G0.g();
            if (s != null) {
                g.g().t0(this.F0.h, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'userAppSharedSecret' to null.");
        }
        else {
            this.G0.f().h();
            if (s != null) {
                this.G0.g().d(this.F0.h, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'userAppSharedSecret' to null.");
        }
    }
    
    @Override
    public long Q6() {
        this.G0.f().h();
        return this.G0.g().m(this.F0.i);
    }
    
    @Override
    public void R1(final Integer n) {
        if (this.G0.i()) {
            if (!this.G0.d()) {
                return;
            }
            final r g = this.G0.g();
            if (n == null) {
                g.g().r0(this.F0.l, g.l0(), true);
                return;
            }
            g.g().q0(this.F0.l, g.l0(), n, true);
        }
        else {
            this.G0.f().h();
            final r g2 = this.G0.g();
            final long l = this.F0.l;
            if (n == null) {
                g2.I(l);
                return;
            }
            g2.s(l, n);
        }
    }
    
    @Override
    public long S2() {
        this.G0.f().h();
        return this.G0.g().m(this.F0.L);
    }
    
    @Override
    public long S3() {
        this.G0.f().h();
        return this.G0.g().m(this.F0.H);
    }
    
    @Override
    public int S4() {
        this.G0.f().h();
        return (int)this.G0.g().m(this.F0.B);
    }
    
    @Override
    public c0<?> S6() {
        return this.G0;
    }
    
    @Override
    public void T1(final l0<z4.a> l0) {
        final boolean i = this.G0.i();
        final int n = 0;
        int j = 0;
        l0<z4.a> l2 = l0;
        if (i) {
            if (!this.G0.d()) {
                return;
            }
            if (this.G0.e().contains("userChildren")) {
                return;
            }
            if ((l2 = l0) != null) {
                l2 = l0;
                if (!l0.G0()) {
                    final f0 f0 = (f0)this.G0.f();
                    l2 = new l0<z4.a>();
                    for (final z4.a a : l0) {
                        z4.a a2;
                        if ((a2 = a) != null) {
                            if (io.realm.p0.j8(a)) {
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
        this.G0.f().h();
        final OsList p = this.G0.g().p(this.F0.o);
        if (l2 != null && l2.size() == p.b0()) {
            while (j < l2.size()) {
                final z4.a a3 = l2.get(j);
                this.G0.c(a3);
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
                final z4.a a4 = l2.get(k);
                this.G0.c(a4);
                p.l(((p)a4).S6().g().l0());
            }
        }
    }
    
    @Override
    public void T5(final boolean b) {
        if (!this.G0.i()) {
            this.G0.f().h();
            this.G0.g().i(this.F0.F, b);
            return;
        }
        if (!this.G0.d()) {
            return;
        }
        final r g = this.G0.g();
        g.g().j0(this.F0.F, g.l0(), b, true);
    }
    
    @Override
    public l0<com.untis.mobile.persistence.realm.a> U2() {
        this.G0.f().h();
        final l0<com.untis.mobile.persistence.realm.a> h0 = this.H0;
        if (h0 != null) {
            return h0;
        }
        return this.H0 = new l0<com.untis.mobile.persistence.realm.a>(com.untis.mobile.persistence.realm.a.class, this.G0.g().p(this.F0.n), this.G0.f());
    }
    
    @Override
    public long U3() {
        this.G0.f().h();
        return this.G0.g().m(this.F0.k);
    }
    
    @Override
    public void U4(final l0<com.untis.mobile.persistence.realm.b> l0) {
        final boolean i = this.G0.i();
        final int n = 0;
        int j = 0;
        l0<com.untis.mobile.persistence.realm.b> l2 = l0;
        if (i) {
            if (!this.G0.d()) {
                return;
            }
            if (this.G0.e().contains("userClasses")) {
                return;
            }
            if ((l2 = l0) != null) {
                l2 = l0;
                if (!l0.G0()) {
                    final f0 f0 = (f0)this.G0.f();
                    l2 = new l0<com.untis.mobile.persistence.realm.b>();
                    for (final com.untis.mobile.persistence.realm.b b : l0) {
                        com.untis.mobile.persistence.realm.b b2;
                        if ((b2 = b) != null) {
                            if (io.realm.p0.j8(b)) {
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
        this.G0.f().h();
        final OsList p = this.G0.g().p(this.F0.p);
        if (l2 != null && l2.size() == p.b0()) {
            while (j < l2.size()) {
                final com.untis.mobile.persistence.realm.b b3 = l2.get(j);
                this.G0.c(b3);
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
                this.G0.c(b4);
                p.l(((p)b4).S6().g().l0());
            }
        }
    }
    
    @Override
    public long U6() {
        this.G0.f().h();
        return this.G0.g().m(this.F0.I);
    }
    
    @Override
    public long V2() {
        this.G0.f().h();
        return this.G0.g().m(this.F0.J);
    }
    
    @Override
    public boolean V5() {
        this.G0.f().h();
        return this.G0.g().l(this.F0.E);
    }
    
    @Override
    public void W2(final boolean b) {
        if (!this.G0.i()) {
            this.G0.f().h();
            this.G0.g().i(this.F0.r, b);
            return;
        }
        if (!this.G0.d()) {
            return;
        }
        final r g = this.G0.g();
        g.g().j0(this.F0.r, g.l0(), b, true);
    }
    
    @Override
    public void W4(final l0<com.untis.mobile.persistence.realm.a> l0) {
        final boolean i = this.G0.i();
        final int n = 0;
        int j = 0;
        l0<com.untis.mobile.persistence.realm.a> l2 = l0;
        if (i) {
            if (!this.G0.d()) {
                return;
            }
            if (this.G0.e().contains("userRights")) {
                return;
            }
            if ((l2 = l0) != null) {
                l2 = l0;
                if (!l0.G0()) {
                    final f0 f0 = (f0)this.G0.f();
                    l2 = new l0<com.untis.mobile.persistence.realm.a>();
                    for (final com.untis.mobile.persistence.realm.a a : l0) {
                        com.untis.mobile.persistence.realm.a a2;
                        if ((a2 = a) != null) {
                            if (io.realm.p0.j8(a)) {
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
        this.G0.f().h();
        final OsList p = this.G0.g().p(this.F0.n);
        if (l2 != null && l2.size() == p.b0()) {
            while (j < l2.size()) {
                final com.untis.mobile.persistence.realm.a a3 = l2.get(j);
                this.G0.c(a3);
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
                this.G0.c(a4);
                p.l(((p)a4).S6().g().l0());
            }
        }
    }
    
    @Override
    public boolean X3() {
        this.G0.f().h();
        return this.G0.g().l(this.F0.y);
    }
    
    @Override
    public void Y1(final boolean b) {
        if (!this.G0.i()) {
            this.G0.f().h();
            this.G0.g().i(this.F0.E, b);
            return;
        }
        if (!this.G0.d()) {
            return;
        }
        final r g = this.G0.g();
        g.g().j0(this.F0.E, g.l0(), b, true);
    }
    
    @Override
    public String Y5() {
        this.G0.f().h();
        return this.G0.g().U(this.F0.z);
    }
    
    @Override
    public long a() {
        this.G0.f().h();
        return this.G0.g().m(this.F0.e);
    }
    
    @Override
    public void a6(final long n) {
        if (!this.G0.i()) {
            this.G0.f().h();
            this.G0.g().s(this.F0.J, n);
            return;
        }
        if (!this.G0.d()) {
            return;
        }
        final r g = this.G0.g();
        g.g().q0(this.F0.J, g.l0(), n, true);
    }
    
    @Override
    public void b(final long n) {
        if (this.G0.i()) {
            return;
        }
        this.G0.f().h();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }
    
    @Override
    public l0<com.untis.mobile.persistence.realm.a> b1() {
        this.G0.f().h();
        final l0<com.untis.mobile.persistence.realm.a> k0 = this.K0;
        if (k0 != null) {
            return k0;
        }
        return this.K0 = new l0<com.untis.mobile.persistence.realm.a>(com.untis.mobile.persistence.realm.a.class, this.G0.g().p(this.F0.O), this.G0.f());
    }
    
    @Override
    public void d7(final String s) {
        if (this.G0.i()) {
            if (!this.G0.d()) {
                return;
            }
            final r g = this.G0.g();
            if (s != null) {
                g.g().t0(this.F0.D, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'schoolSemanticApiVersion' to null.");
        }
        else {
            this.G0.f().h();
            if (s != null) {
                this.G0.g().d(this.F0.D, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'schoolSemanticApiVersion' to null.");
        }
    }
    
    @Override
    public void e3(final boolean b) {
        if (!this.G0.i()) {
            this.G0.f().h();
            this.G0.g().i(this.F0.Q, b);
            return;
        }
        if (!this.G0.d()) {
            return;
        }
        final r g = this.G0.g();
        g.g().j0(this.F0.Q, g.l0(), b, true);
    }
    
    @Override
    public void e4(final int n) {
        if (!this.G0.i()) {
            this.G0.f().h();
            this.G0.g().s(this.F0.j, n);
            return;
        }
        if (!this.G0.d()) {
            return;
        }
        final r g = this.G0.g();
        g.g().q0(this.F0.j, g.l0(), n, true);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final l5 l5 = (l5)o;
        final io.realm.a f = this.G0.f();
        final io.realm.a f2 = l5.G0.f();
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
        final String m = this.G0.g().g().M();
        final String i = l5.G0.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.G0.g().l0() == l5.G0.g().l0();
            }
        }
        else if (i == null) {
            return this.G0.g().l0() == l5.G0.g().l0();
        }
        return false;
    }
    
    @Override
    public void f2(final long n) {
        if (!this.G0.i()) {
            this.G0.f().h();
            this.G0.g().s(this.F0.G, n);
            return;
        }
        if (!this.G0.d()) {
            return;
        }
        final r g = this.G0.g();
        g.g().q0(this.F0.G, g.l0(), n, true);
    }
    
    @Override
    public long f4() {
        this.G0.f().h();
        return this.G0.g().m(this.F0.t);
    }
    
    @Override
    public void f5(final int n) {
        if (!this.G0.i()) {
            this.G0.f().h();
            this.G0.g().s(this.F0.B, n);
            return;
        }
        if (!this.G0.d()) {
            return;
        }
        final r g = this.G0.g();
        g.g().q0(this.F0.B, g.l0(), n, true);
    }
    
    @Override
    public boolean g4() {
        this.G0.f().h();
        return this.G0.g().l(this.F0.Q);
    }
    
    @Override
    public long g5() {
        this.G0.f().h();
        return this.G0.g().m(this.F0.N);
    }
    
    @Override
    public String g7() {
        this.G0.f().h();
        return this.G0.g().U(this.F0.s);
    }
    
    @Override
    public void h3(final String s) {
        if (this.G0.i()) {
            if (!this.G0.d()) {
                return;
            }
            final r g = this.G0.g();
            if (s != null) {
                g.g().t0(this.F0.T, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'messengerOrganizationId' to null.");
        }
        else {
            this.G0.f().h();
            if (s != null) {
                this.G0.g().d(this.F0.T, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'messengerOrganizationId' to null.");
        }
    }
    
    @Override
    public int h4() {
        this.G0.f().h();
        return (int)this.G0.g().m(this.F0.M);
    }
    
    @Override
    public void h6(final long n) {
        if (!this.G0.i()) {
            this.G0.f().h();
            this.G0.g().s(this.F0.X, n);
            return;
        }
        if (!this.G0.d()) {
            return;
        }
        final r g = this.G0.g();
        g.g().q0(this.F0.X, g.l0(), n, true);
    }
    
    @Override
    public int hashCode() {
        final String path = this.G0.f().getPath();
        final String m = this.G0.g().g().M();
        final long l0 = this.G0.g().l0();
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
    public void j1(final l0<com.untis.mobile.persistence.realm.a> l0) {
        final boolean i = this.G0.i();
        final int n = 0;
        int j = 0;
        l0<com.untis.mobile.persistence.realm.a> l2 = l0;
        if (i) {
            if (!this.G0.d()) {
                return;
            }
            if (this.G0.e().contains("states")) {
                return;
            }
            if ((l2 = l0) != null) {
                l2 = l0;
                if (!l0.G0()) {
                    final f0 f0 = (f0)this.G0.f();
                    l2 = new l0<com.untis.mobile.persistence.realm.a>();
                    for (final com.untis.mobile.persistence.realm.a a : l0) {
                        com.untis.mobile.persistence.realm.a a2;
                        if ((a2 = a) != null) {
                            if (io.realm.p0.j8(a)) {
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
        this.G0.f().h();
        final OsList p = this.G0.g().p(this.F0.O);
        if (l2 != null && l2.size() == p.b0()) {
            while (j < l2.size()) {
                final com.untis.mobile.persistence.realm.a a3 = l2.get(j);
                this.G0.c(a3);
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
                this.G0.c(a4);
                p.l(((p)a4).S6().g().l0());
            }
        }
    }
    
    @Override
    public void j4(final long n) {
        if (!this.G0.i()) {
            this.G0.f().h();
            this.G0.g().s(this.F0.w, n);
            return;
        }
        if (!this.G0.d()) {
            return;
        }
        final r g = this.G0.g();
        g.g().q0(this.F0.w, g.l0(), n, true);
    }
    
    @Override
    public long j6() {
        this.G0.f().h();
        return this.G0.g().m(this.F0.K);
    }
    
    @Override
    public void k3(final long n) {
        if (!this.G0.i()) {
            this.G0.f().h();
            this.G0.g().s(this.F0.A, n);
            return;
        }
        if (!this.G0.d()) {
            return;
        }
        final r g = this.G0.g();
        g.g().q0(this.F0.A, g.l0(), n, true);
    }
    
    @Override
    public String k4() {
        this.G0.f().h();
        return this.G0.g().U(this.F0.S);
    }
    
    @Override
    public String l2() {
        this.G0.f().h();
        return this.G0.g().U(this.F0.x);
    }
    
    @Override
    public void l3(final String s) {
        if (this.G0.i()) {
            if (!this.G0.d()) {
                return;
            }
            final r g = this.G0.g();
            if (s != null) {
                g.g().t0(this.F0.u, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'schoolLogin' to null.");
        }
        else {
            this.G0.f().h();
            if (s != null) {
                this.G0.g().d(this.F0.u, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'schoolLogin' to null.");
        }
    }
    
    @Override
    public boolean l5() {
        this.G0.f().h();
        return this.G0.g().l(this.F0.r);
    }
    
    @Override
    public long m3() {
        this.G0.f().h();
        return this.G0.g().m(this.F0.P);
    }
    
    @Override
    public String m4() {
        this.G0.f().h();
        return this.G0.g().U(this.F0.V);
    }
    
    @Override
    public void m6(final long n) {
        if (!this.G0.i()) {
            this.G0.f().h();
            this.G0.g().s(this.F0.i, n);
            return;
        }
        if (!this.G0.d()) {
            return;
        }
        final r g = this.G0.g();
        g.g().q0(this.F0.i, g.l0(), n, true);
    }
    
    @Override
    public void o4(final boolean b) {
        if (!this.G0.i()) {
            this.G0.f().h();
            this.G0.g().i(this.F0.q, b);
            return;
        }
        if (!this.G0.d()) {
            return;
        }
        final r g = this.G0.g();
        g.g().j0(this.F0.q, g.l0(), b, true);
    }
    
    @Override
    public void o7(final String s) {
        if (this.G0.i()) {
            if (!this.G0.d()) {
                return;
            }
            final r g = this.G0.g();
            if (s != null) {
                g.g().t0(this.F0.C, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'schoolSemanticWuVersion' to null.");
        }
        else {
            this.G0.f().h();
            if (s != null) {
                this.G0.g().d(this.F0.C, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'schoolSemanticWuVersion' to null.");
        }
    }
    
    @Override
    public void p3(final boolean b) {
        if (!this.G0.i()) {
            this.G0.f().h();
            this.G0.g().i(this.F0.Y, b);
            return;
        }
        if (!this.G0.d()) {
            return;
        }
        final r g = this.G0.g();
        g.g().j0(this.F0.Y, g.l0(), b, true);
    }
    
    @Override
    public long p4() {
        this.G0.f().h();
        return this.G0.g().m(this.F0.A);
    }
    
    @Override
    public String q4() {
        this.G0.f().h();
        return this.G0.g().U(this.F0.C);
    }
    
    @Override
    public l0<com.untis.mobile.persistence.realm.a> q7() {
        this.G0.f().h();
        final l0<com.untis.mobile.persistence.realm.a> l0 = this.L0;
        if (l0 != null) {
            return l0;
        }
        return this.L0 = new l0<com.untis.mobile.persistence.realm.a>(com.untis.mobile.persistence.realm.a.class, this.G0.g().p(this.F0.R), this.G0.f());
    }
    
    @Override
    public void r5(final String s) {
        if (this.G0.i()) {
            if (!this.G0.d()) {
                return;
            }
            final r g = this.G0.g();
            if (s != null) {
                g.g().t0(this.F0.g, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'userDisplayName' to null.");
        }
        else {
            this.G0.f().h();
            if (s != null) {
                this.G0.g().d(this.F0.g, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'userDisplayName' to null.");
        }
    }
    
    @Override
    public void s4(final String s) {
        if (this.G0.i()) {
            if (!this.G0.d()) {
                return;
            }
            final r g = this.G0.g();
            if (s != null) {
                g.g().t0(this.F0.V, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'registrationUrl' to null.");
        }
        else {
            this.G0.f().h();
            if (s != null) {
                this.G0.g().d(this.F0.V, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'registrationUrl' to null.");
        }
    }
    
    @Override
    public String t4() {
        this.G0.f().h();
        return this.G0.g().U(this.F0.g);
    }
    
    @Override
    public String toString() {
        if (!io.realm.p0.k8(this)) {
            return "Invalid object";
        }
        final StringBuilder sb = new StringBuilder("RealmProfile = proxy[");
        sb.append("{id:");
        sb.append(this.a());
        sb.append("}");
        sb.append(",");
        sb.append("{userLogin:");
        sb.append(this.K5());
        sb.append("}");
        sb.append(",");
        sb.append("{userDisplayName:");
        sb.append(this.t4());
        sb.append("}");
        sb.append(",");
        sb.append("{userAppSharedSecret:");
        sb.append(this.L3());
        sb.append("}");
        sb.append(",");
        sb.append("{userDepartmentId:");
        sb.append(this.Q6());
        sb.append("}");
        sb.append(",");
        sb.append("{userOriginalEntityType:");
        sb.append(this.I6());
        sb.append("}");
        sb.append(",");
        sb.append("{userOriginalEntityId:");
        sb.append(this.U3());
        sb.append("}");
        sb.append(",");
        sb.append("{userCustomEntityType:");
        final Integer j3 = this.J3();
        final String s = "null";
        Constable j4;
        if (j3 != null) {
            j4 = this.J3();
        }
        else {
            j4 = "null";
        }
        sb.append(j4);
        sb.append("}");
        sb.append(",");
        sb.append("{userCustomEntityId:");
        Constable f6;
        if (this.F6() != null) {
            f6 = this.F6();
        }
        else {
            f6 = "null";
        }
        sb.append(f6);
        sb.append("}");
        sb.append(",");
        sb.append("{userRights:");
        sb.append("RealmList<RealmInteger>[");
        sb.append(this.U2().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{userChildren:");
        sb.append("RealmList<RealmChild>[");
        sb.append(this.I3().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{userClasses:");
        sb.append("RealmList<RealmLong>[");
        sb.append(this.y6().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{userHasTimeTableAccess:");
        sb.append(this.E7());
        sb.append("}");
        sb.append(",");
        sb.append("{userJupiter:");
        sb.append(this.l5());
        sb.append("}");
        sb.append(",");
        sb.append("{userJupiterEclipse:");
        String g7 = s;
        if (this.g7() != null) {
            g7 = this.g7();
        }
        sb.append(g7);
        sb.append("}");
        sb.append(",");
        sb.append("{userId:");
        sb.append(this.f4());
        sb.append("}");
        sb.append(",");
        sb.append("{schoolLogin:");
        sb.append(this.z7());
        sb.append("}");
        sb.append(",");
        sb.append("{schoolDisplayName:");
        sb.append(this.O7());
        sb.append("}");
        sb.append(",");
        sb.append("{schoolId:");
        sb.append(this.C2());
        sb.append("}");
        sb.append(",");
        sb.append("{schoolServerUrl:");
        sb.append(this.l2());
        sb.append("}");
        sb.append(",");
        sb.append("{schoolUseMobileService:");
        sb.append(this.X3());
        sb.append("}");
        sb.append(",");
        sb.append("{schoolMobileServiceUrl:");
        sb.append(this.Y5());
        sb.append("}");
        sb.append(",");
        sb.append("{schoolServerDelta:");
        sb.append(this.p4());
        sb.append("}");
        sb.append(",");
        sb.append("{schoolApiVersion:");
        sb.append(this.S4());
        sb.append("}");
        sb.append(",");
        sb.append("{schoolSemanticWuVersion:");
        sb.append(this.q4());
        sb.append("}");
        sb.append(",");
        sb.append("{schoolSemanticApiVersion:");
        sb.append(this.N5());
        sb.append("}");
        sb.append(",");
        sb.append("{usable:");
        sb.append(this.V5());
        sb.append("}");
        sb.append(",");
        sb.append("{updated:");
        sb.append(this.H2());
        sb.append("}");
        sb.append(",");
        sb.append("{periodDataTimestamp:");
        sb.append(this.D3());
        sb.append("}");
        sb.append(",");
        sb.append("{masterDataTimestamp:");
        sb.append(this.S3());
        sb.append("}");
        sb.append(",");
        sb.append("{officeHourTimestamp:");
        sb.append(this.U6());
        sb.append("}");
        sb.append(",");
        sb.append("{parentDayTimestamp:");
        sb.append(this.V2());
        sb.append("}");
        sb.append(",");
        sb.append("{messagesOfDayTimestamp:");
        sb.append(this.j6());
        sb.append("}");
        sb.append(",");
        sb.append("{widgetTimestamp:");
        sb.append(this.S2());
        sb.append("}");
        sb.append(",");
        sb.append("{lastViewedEntityType:");
        sb.append(this.h4());
        sb.append("}");
        sb.append(",");
        sb.append("{lastViewedEntityId:");
        sb.append(this.g5());
        sb.append("}");
        sb.append(",");
        sb.append("{states:");
        sb.append("RealmList<RealmInteger>[");
        sb.append(this.b1().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{serverDownTimestamp:");
        sb.append(this.m3());
        sb.append("}");
        sb.append(",");
        sb.append("{lockScreen:");
        sb.append(this.g4());
        sb.append("}");
        sb.append(",");
        sb.append("{lockScreenIds:");
        sb.append("RealmList<RealmInteger>[");
        sb.append(this.q7().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{messengerServerUrl:");
        sb.append(this.k4());
        sb.append("}");
        sb.append(",");
        sb.append("{messengerOrganizationId:");
        sb.append(this.L5());
        sb.append("}");
        sb.append(",");
        sb.append("{substitutionPlanningUrl:");
        sb.append(this.N4());
        sb.append("}");
        sb.append(",");
        sb.append("{registrationUrl:");
        sb.append(this.m4());
        sb.append("}");
        sb.append(",");
        sb.append("{authenticationToken:");
        sb.append(this.O4());
        sb.append("}");
        sb.append(",");
        sb.append("{infoCenterTimestamp:");
        sb.append(this.P6());
        sb.append("}");
        sb.append(",");
        sb.append("{showCalendarDetails:");
        sb.append(this.J4());
        sb.append("}");
        sb.append(",");
        sb.append("{registered:");
        sb.append(this.A0());
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
    
    @Override
    public void u6(final long n) {
        if (!this.G0.i()) {
            this.G0.f().h();
            this.G0.g().s(this.F0.K, n);
            return;
        }
        if (!this.G0.d()) {
            return;
        }
        final r g = this.G0.g();
        g.g().q0(this.F0.K, g.l0(), n, true);
    }
    
    @Override
    public void w4(final long n) {
        if (!this.G0.i()) {
            this.G0.f().h();
            this.G0.g().s(this.F0.L, n);
            return;
        }
        if (!this.G0.d()) {
            return;
        }
        final r g = this.G0.g();
        g.g().q0(this.F0.L, g.l0(), n, true);
    }
    
    @Override
    public void x2(final long n) {
        if (!this.G0.i()) {
            this.G0.f().h();
            this.G0.g().s(this.F0.k, n);
            return;
        }
        if (!this.G0.d()) {
            return;
        }
        final r g = this.G0.g();
        g.g().q0(this.F0.k, g.l0(), n, true);
    }
    
    @Override
    public void y4() {
        if (this.G0 != null) {
            return;
        }
        final io.realm.a.h h = io.realm.a.W.get();
        this.F0 = (b)h.c();
        (this.G0 = new c0<c>(this)).r(h.e());
        this.G0.s(h.f());
        this.G0.o(h.b());
        this.G0.q(h.d());
    }
    
    @Override
    public l0<com.untis.mobile.persistence.realm.b> y6() {
        this.G0.f().h();
        final l0<com.untis.mobile.persistence.realm.b> j0 = this.J0;
        if (j0 != null) {
            return j0;
        }
        return this.J0 = new l0<com.untis.mobile.persistence.realm.b>(com.untis.mobile.persistence.realm.b.class, this.G0.g().p(this.F0.p), this.G0.f());
    }
    
    @Override
    public void z2(final long n) {
        if (!this.G0.i()) {
            this.G0.f().h();
            this.G0.g().s(this.F0.N, n);
            return;
        }
        if (!this.G0.d()) {
            return;
        }
        final r g = this.G0.g();
        g.g().q0(this.F0.N, g.l0(), n, true);
    }
    
    @Override
    public String z7() {
        this.G0.f().h();
        return this.G0.g().U(this.F0.u);
    }
    
    public static final class a
    {
        public static final String a = "RealmProfile";
    }
    
    static final class b extends io.realm.internal.c
    {
        long A;
        long B;
        long C;
        long D;
        long E;
        long F;
        long G;
        long H;
        long I;
        long J;
        long K;
        long L;
        long M;
        long N;
        long O;
        long P;
        long Q;
        long R;
        long S;
        long T;
        long U;
        long V;
        long W;
        long X;
        long Y;
        long Z;
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
        long w;
        long x;
        long y;
        long z;
        
        b(final OsSchemaInfo osSchemaInfo) {
            super(48);
            final OsObjectSchemaInfo b = osSchemaInfo.b("RealmProfile");
            this.e = this.b("id", "id", b);
            this.f = this.b("userLogin", "userLogin", b);
            this.g = this.b("userDisplayName", "userDisplayName", b);
            this.h = this.b("userAppSharedSecret", "userAppSharedSecret", b);
            this.i = this.b("userDepartmentId", "userDepartmentId", b);
            this.j = this.b("userOriginalEntityType", "userOriginalEntityType", b);
            this.k = this.b("userOriginalEntityId", "userOriginalEntityId", b);
            this.l = this.b("userCustomEntityType", "userCustomEntityType", b);
            this.m = this.b("userCustomEntityId", "userCustomEntityId", b);
            this.n = this.b("userRights", "userRights", b);
            this.o = this.b("userChildren", "userChildren", b);
            this.p = this.b("userClasses", "userClasses", b);
            this.q = this.b("userHasTimeTableAccess", "userHasTimeTableAccess", b);
            this.r = this.b("userJupiter", "userJupiter", b);
            this.s = this.b("userJupiterEclipse", "userJupiterEclipse", b);
            this.t = this.b("userId", "userId", b);
            this.u = this.b("schoolLogin", "schoolLogin", b);
            this.v = this.b("schoolDisplayName", "schoolDisplayName", b);
            this.w = this.b("schoolId", "schoolId", b);
            this.x = this.b("schoolServerUrl", "schoolServerUrl", b);
            this.y = this.b("schoolUseMobileService", "schoolUseMobileService", b);
            this.z = this.b("schoolMobileServiceUrl", "schoolMobileServiceUrl", b);
            this.A = this.b("schoolServerDelta", "schoolServerDelta", b);
            this.B = this.b("schoolApiVersion", "schoolApiVersion", b);
            this.C = this.b("schoolSemanticWuVersion", "schoolSemanticWuVersion", b);
            this.D = this.b("schoolSemanticApiVersion", "schoolSemanticApiVersion", b);
            this.E = this.b("usable", "usable", b);
            this.F = this.b("updated", "updated", b);
            this.G = this.b("periodDataTimestamp", "periodDataTimestamp", b);
            this.H = this.b("masterDataTimestamp", "masterDataTimestamp", b);
            this.I = this.b("officeHourTimestamp", "officeHourTimestamp", b);
            this.J = this.b("parentDayTimestamp", "parentDayTimestamp", b);
            this.K = this.b("messagesOfDayTimestamp", "messagesOfDayTimestamp", b);
            this.L = this.b("widgetTimestamp", "widgetTimestamp", b);
            this.M = this.b("lastViewedEntityType", "lastViewedEntityType", b);
            this.N = this.b("lastViewedEntityId", "lastViewedEntityId", b);
            this.O = this.b("states", "states", b);
            this.P = this.b("serverDownTimestamp", "serverDownTimestamp", b);
            this.Q = this.b("lockScreen", "lockScreen", b);
            this.R = this.b("lockScreenIds", "lockScreenIds", b);
            this.S = this.b("messengerServerUrl", "messengerServerUrl", b);
            this.T = this.b("messengerOrganizationId", "messengerOrganizationId", b);
            this.U = this.b("substitutionPlanningUrl", "substitutionPlanningUrl", b);
            this.V = this.b("registrationUrl", "registrationUrl", b);
            this.W = this.b("authenticationToken", "authenticationToken", b);
            this.X = this.b("infoCenterTimestamp", "infoCenterTimestamp", b);
            this.Y = this.b("showCalendarDetails", "showCalendarDetails", b);
            this.Z = this.b("registered", "registered", b);
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
            b2.w = b.w;
            b2.x = b.x;
            b2.y = b.y;
            b2.z = b.z;
            b2.A = b.A;
            b2.B = b.B;
            b2.C = b.C;
            b2.D = b.D;
            b2.E = b.E;
            b2.F = b.F;
            b2.G = b.G;
            b2.H = b.H;
            b2.I = b.I;
            b2.J = b.J;
            b2.K = b.K;
            b2.L = b.L;
            b2.M = b.M;
            b2.N = b.N;
            b2.O = b.O;
            b2.P = b.P;
            b2.Q = b.Q;
            b2.R = b.R;
            b2.S = b.S;
            b2.T = b.T;
            b2.U = b.U;
            b2.V = b.V;
            b2.W = b.W;
            b2.X = b.X;
            b2.Y = b.Y;
            b2.Z = b.Z;
        }
    }
}
