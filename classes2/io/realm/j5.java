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
import z4.b;

public class j5 extends z4.b implements p, k5
{
    private static final String T = "";
    private static final OsObjectSchemaInfo U;
    private b R;
    private c0<z4.b> S;
    
    static {
        U = M8();
    }
    
    j5() {
        this.S.p();
    }
    
    public static z4.b I8(final f0 f0, final b b, final z4.b b2, final boolean b3, final Map<n0, p> map, final Set<q> set) {
        final j5 j5 = map.get(b2);
        if (j5 != null) {
            return j5;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(z4.b.class), set);
        osObjectBuilder.L(b.e, b2.a());
        osObjectBuilder.n(b.f, b2.v2());
        osObjectBuilder.n(b.g, b2.b6());
        osObjectBuilder.n(b.h, b2.D5());
        osObjectBuilder.L(b.i, b2.m5());
        osObjectBuilder.L(b.j, b2.W1());
        osObjectBuilder.K(b.k, b2.z3());
        osObjectBuilder.d0(b.l, b2.P1());
        final j5 v8 = V8(f0, osObjectBuilder.f0());
        map.put(b2, v8);
        return v8;
    }
    
    public static z4.b J8(final f0 f0, final b b, final z4.b b2, final boolean b3, final Map<n0, p> map, final Set<q> set) {
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
            return (z4.b)p7;
        }
        final p p8 = null;
        Object x2 = null;
        boolean b4 = false;
        Label_0232: {
            if (b3) {
                x2 = f0.x2(z4.b.class);
                final long r = ((Table)x2).r(b.e, b2.a());
                if (r == -1L) {
                    b4 = false;
                    x2 = p8;
                    break Label_0232;
                }
                try {
                    h.g(f0, ((Table)x2).R(r), b, false, Collections.emptyList());
                    x2 = new j5();
                    map.put(b2, (p)x2);
                }
                finally {
                    h.a();
                }
            }
            b4 = b3;
        }
        z4.b b5;
        if (b4) {
            b5 = W8(f0, b, (z4.b)x2, b2, map, set);
        }
        else {
            b5 = I8(f0, b, b2, b3, map, set);
        }
        return b5;
    }
    
    public static b K8(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static z4.b L8(final z4.b b, final int a, final int n, final Map<n0, p.a<n0>> map) {
        if (a <= n && b != null) {
            final p.a a2 = map.get(b);
            z4.b b3;
            if (a2 == null) {
                final z4.b b2 = new z4.b();
                map.put(b, (p.a<n0>)new p.a(a, b2));
                b3 = b2;
            }
            else {
                if (a >= a2.a) {
                    return (z4.b)a2.b;
                }
                b3 = (z4.b)a2.b;
                a2.a = a;
            }
            b3.b(b.a());
            b3.k7(b.v2());
            b3.M4(b.b6());
            b3.X6(b.D5());
            b3.b5(b.m5());
            b3.n7(b.W1());
            b3.q2(b.z3());
            b3.V1(b.P1());
            return b3;
        }
        return null;
    }
    
    private static OsObjectSchemaInfo M8() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmClassbookSettings", false, 8, 0);
        final RealmFieldType integer = RealmFieldType.INTEGER;
        b.c("", "id", integer, true, false, true);
        final RealmFieldType boolean1 = RealmFieldType.BOOLEAN;
        b.c("", "showAbsenceReason", boolean1, false, false, true);
        b.c("", "showAbsenceText", boolean1, false, false, true);
        b.c("", "absenceCheckRequired", boolean1, false, false, true);
        b.c("", "defaultAbsenceReasonId", integer, false, false, true);
        b.c("", "defaultLatenessReasonId", integer, false, false, true);
        b.c("", "defaultAbsenceEndTimeType", integer, false, false, true);
        b.c("", "customAbsenceEndTime", RealmFieldType.STRING, false, false, false);
        return b.e();
    }
    
    public static z4.b N8(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final List<String> emptyList = Collections.emptyList();
        Object x2 = null;
        Label_0141: {
            if (b) {
                x2 = f0.x2(z4.b.class);
                final long e = ((b)f0.H().j(z4.b.class)).e;
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
                        h.g(f0, ((Table)x2).R(r), f0.H().j(z4.b.class), false, Collections.emptyList());
                        x2 = new j5();
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
            j5 j5;
            if (jsonObject.isNull("id")) {
                j5 = f0.p1((Class<j5>)z4.b.class, null, true, emptyList);
            }
            else {
                j5 = f0.p1((Class<j5>)z4.b.class, jsonObject.getLong("id"), true, emptyList);
            }
            o = j5;
        }
        if (jsonObject.has("showAbsenceReason")) {
            if (jsonObject.isNull("showAbsenceReason")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'showAbsenceReason' to null.");
            }
            ((k5)o).k7(jsonObject.getBoolean("showAbsenceReason"));
        }
        if (jsonObject.has("showAbsenceText")) {
            if (jsonObject.isNull("showAbsenceText")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'showAbsenceText' to null.");
            }
            ((k5)o).M4(jsonObject.getBoolean("showAbsenceText"));
        }
        if (jsonObject.has("absenceCheckRequired")) {
            if (jsonObject.isNull("absenceCheckRequired")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'absenceCheckRequired' to null.");
            }
            ((k5)o).X6(jsonObject.getBoolean("absenceCheckRequired"));
        }
        if (jsonObject.has("defaultAbsenceReasonId")) {
            if (jsonObject.isNull("defaultAbsenceReasonId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'defaultAbsenceReasonId' to null.");
            }
            ((k5)o).b5(jsonObject.getLong("defaultAbsenceReasonId"));
        }
        if (jsonObject.has("defaultLatenessReasonId")) {
            if (jsonObject.isNull("defaultLatenessReasonId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'defaultLatenessReasonId' to null.");
            }
            ((k5)o).n7(jsonObject.getLong("defaultLatenessReasonId"));
        }
        if (jsonObject.has("defaultAbsenceEndTimeType")) {
            if (jsonObject.isNull("defaultAbsenceEndTimeType")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'defaultAbsenceEndTimeType' to null.");
            }
            ((k5)o).q2(jsonObject.getInt("defaultAbsenceEndTimeType"));
        }
        if (jsonObject.has("customAbsenceEndTime")) {
            if (jsonObject.isNull("customAbsenceEndTime")) {
                ((k5)o).V1(null);
            }
            else {
                ((k5)o).V1(jsonObject.getString("customAbsenceEndTime"));
            }
        }
        return (z4.b)o;
    }
    
    @TargetApi(11)
    public static z4.b O8(final f0 f0, final JsonReader jsonReader) throws IOException {
        final z4.b b = new z4.b();
        jsonReader.beginObject();
        boolean b2 = false;
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
                b.b(jsonReader.nextLong());
                b2 = true;
            }
            else if (nextName.equals("showAbsenceReason")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'showAbsenceReason' to null.");
                }
                b.k7(jsonReader.nextBoolean());
            }
            else if (nextName.equals("showAbsenceText")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'showAbsenceText' to null.");
                }
                b.M4(jsonReader.nextBoolean());
            }
            else if (nextName.equals("absenceCheckRequired")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'absenceCheckRequired' to null.");
                }
                b.X6(jsonReader.nextBoolean());
            }
            else if (nextName.equals("defaultAbsenceReasonId")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'defaultAbsenceReasonId' to null.");
                }
                b.b5(jsonReader.nextLong());
            }
            else if (nextName.equals("defaultLatenessReasonId")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'defaultLatenessReasonId' to null.");
                }
                b.n7(jsonReader.nextLong());
            }
            else if (nextName.equals("defaultAbsenceEndTimeType")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'defaultAbsenceEndTimeType' to null.");
                }
                b.q2(jsonReader.nextInt());
            }
            else if (nextName.equals("customAbsenceEndTime")) {
                String nextString;
                if (jsonReader.peek() != JsonToken.NULL) {
                    nextString = jsonReader.nextString();
                }
                else {
                    jsonReader.skipValue();
                    nextString = null;
                }
                b.V1(nextString);
            }
            else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (b2) {
            return f0.G0(b, new q[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }
    
    public static OsObjectSchemaInfo P8() {
        return j5.U;
    }
    
    public static String Q8() {
        return "RealmClassbookSettings";
    }
    
    public static long R8(final f0 f0, final z4.b b, final Map<n0, Long> map) {
        if (b instanceof p && !p0.h8(b)) {
            final p p3 = (p)b;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(z4.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b2 = (b)f0.H().j(z4.b.class);
        final long e = b2.e;
        final Long value = b.a();
        long l;
        if (value != null) {
            l = Table.nativeFindFirstInt(nativePtr, e, b.a());
        }
        else {
            l = -1L;
        }
        if (l == -1L) {
            l = OsObject.createRowWithPrimaryKey(x2, e, b.a());
        }
        else {
            Table.v0(value);
        }
        map.put(b, l);
        Table.nativeSetBoolean(nativePtr, b2.f, l, b.v2(), false);
        Table.nativeSetBoolean(nativePtr, b2.g, l, b.b6(), false);
        Table.nativeSetBoolean(nativePtr, b2.h, l, b.D5(), false);
        Table.nativeSetLong(nativePtr, b2.i, l, b.m5(), false);
        Table.nativeSetLong(nativePtr, b2.j, l, b.W1(), false);
        Table.nativeSetLong(nativePtr, b2.k, l, b.z3(), false);
        final String p4 = b.P1();
        if (p4 != null) {
            Table.nativeSetString(nativePtr, b2.l, l, p4, false);
        }
        return l;
    }
    
    public static void S8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(z4.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(z4.b.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final z4.b b2 = (z4.b)iterator.next();
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
            final Long value = b2.a();
            long l;
            if (value != null) {
                l = Table.nativeFindFirstInt(nativePtr, e, b2.a());
            }
            else {
                l = -1L;
            }
            if (l == -1L) {
                l = OsObject.createRowWithPrimaryKey(x2, e, b2.a());
            }
            else {
                Table.v0(value);
            }
            map.put(b2, l);
            Table.nativeSetBoolean(nativePtr, b.f, l, b2.v2(), false);
            Table.nativeSetBoolean(nativePtr, b.g, l, b2.b6(), false);
            Table.nativeSetBoolean(nativePtr, b.h, l, b2.D5(), false);
            Table.nativeSetLong(nativePtr, b.i, l, b2.m5(), false);
            Table.nativeSetLong(nativePtr, b.j, l, b2.W1(), false);
            Table.nativeSetLong(nativePtr, b.k, l, b2.z3(), false);
            final String p4 = b2.P1();
            if (p4 == null) {
                continue;
            }
            Table.nativeSetString(nativePtr, b.l, l, p4, false);
        }
    }
    
    public static long T8(final f0 f0, final z4.b b, final Map<n0, Long> map) {
        if (b instanceof p && !p0.h8(b)) {
            final p p3 = (p)b;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(z4.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b2 = (b)f0.H().j(z4.b.class);
        final long e = b2.e;
        long nativeFindFirstInt;
        if (Long.valueOf(b.a()) != null) {
            nativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, e, b.a());
        }
        else {
            nativeFindFirstInt = -1L;
        }
        long rowWithPrimaryKey = nativeFindFirstInt;
        if (nativeFindFirstInt == -1L) {
            rowWithPrimaryKey = OsObject.createRowWithPrimaryKey(x2, e, b.a());
        }
        map.put(b, rowWithPrimaryKey);
        Table.nativeSetBoolean(nativePtr, b2.f, rowWithPrimaryKey, b.v2(), false);
        Table.nativeSetBoolean(nativePtr, b2.g, rowWithPrimaryKey, b.b6(), false);
        Table.nativeSetBoolean(nativePtr, b2.h, rowWithPrimaryKey, b.D5(), false);
        Table.nativeSetLong(nativePtr, b2.i, rowWithPrimaryKey, b.m5(), false);
        Table.nativeSetLong(nativePtr, b2.j, rowWithPrimaryKey, b.W1(), false);
        Table.nativeSetLong(nativePtr, b2.k, rowWithPrimaryKey, b.z3(), false);
        final String p4 = b.P1();
        final long l = b2.l;
        if (p4 != null) {
            Table.nativeSetString(nativePtr, l, rowWithPrimaryKey, p4, false);
        }
        else {
            Table.nativeSetNull(nativePtr, l, rowWithPrimaryKey, false);
        }
        return rowWithPrimaryKey;
    }
    
    public static void U8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(z4.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(z4.b.class);
        final long e = b.e;
        while (iterator.hasNext()) {
            final z4.b b2 = (z4.b)iterator.next();
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
            long nativeFindFirstInt;
            if (Long.valueOf(b2.a()) != null) {
                nativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, e, b2.a());
            }
            else {
                nativeFindFirstInt = -1L;
            }
            long rowWithPrimaryKey = nativeFindFirstInt;
            if (nativeFindFirstInt == -1L) {
                rowWithPrimaryKey = OsObject.createRowWithPrimaryKey(x2, e, b2.a());
            }
            map.put(b2, rowWithPrimaryKey);
            Table.nativeSetBoolean(nativePtr, b.f, rowWithPrimaryKey, b2.v2(), false);
            Table.nativeSetBoolean(nativePtr, b.g, rowWithPrimaryKey, b2.b6(), false);
            Table.nativeSetBoolean(nativePtr, b.h, rowWithPrimaryKey, b2.D5(), false);
            Table.nativeSetLong(nativePtr, b.i, rowWithPrimaryKey, b2.m5(), false);
            Table.nativeSetLong(nativePtr, b.j, rowWithPrimaryKey, b2.W1(), false);
            Table.nativeSetLong(nativePtr, b.k, rowWithPrimaryKey, b2.z3(), false);
            final String p4 = b2.P1();
            final long l = b.l;
            if (p4 != null) {
                Table.nativeSetString(nativePtr, l, rowWithPrimaryKey, p4, false);
            }
            else {
                Table.nativeSetNull(nativePtr, l, rowWithPrimaryKey, false);
            }
        }
    }
    
    static j5 V8(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(z4.b.class), false, Collections.emptyList());
        final j5 j5 = new j5();
        h.a();
        return j5;
    }
    
    static z4.b W8(final f0 f0, final b b, final z4.b b2, final z4.b b3, final Map<n0, p> map, final Set<q> set) {
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(z4.b.class), set);
        osObjectBuilder.L(b.e, b3.a());
        osObjectBuilder.n(b.f, b3.v2());
        osObjectBuilder.n(b.g, b3.b6());
        osObjectBuilder.n(b.h, b3.D5());
        osObjectBuilder.L(b.i, b3.m5());
        osObjectBuilder.L(b.j, b3.W1());
        osObjectBuilder.K(b.k, b3.z3());
        osObjectBuilder.d0(b.l, b3.P1());
        osObjectBuilder.i0();
        return b2;
    }
    
    @Override
    public boolean D5() {
        this.S.f().h();
        return this.S.g().l(this.R.h);
    }
    
    @Override
    public void M4(final boolean b) {
        if (!this.S.i()) {
            this.S.f().h();
            this.S.g().i(this.R.g, b);
            return;
        }
        if (!this.S.d()) {
            return;
        }
        final r g = this.S.g();
        g.g().j0(this.R.g, g.l0(), b, true);
    }
    
    @Override
    public String P1() {
        this.S.f().h();
        return this.S.g().U(this.R.l);
    }
    
    @Override
    public c0<?> S6() {
        return this.S;
    }
    
    @Override
    public void V1(final String s) {
        if (this.S.i()) {
            if (!this.S.d()) {
                return;
            }
            final r g = this.S.g();
            if (s == null) {
                g.g().r0(this.R.l, g.l0(), true);
                return;
            }
            g.g().t0(this.R.l, g.l0(), s, true);
        }
        else {
            this.S.f().h();
            if (s == null) {
                this.S.g().I(this.R.l);
                return;
            }
            this.S.g().d(this.R.l, s);
        }
    }
    
    @Override
    public long W1() {
        this.S.f().h();
        return this.S.g().m(this.R.j);
    }
    
    @Override
    public void X6(final boolean b) {
        if (!this.S.i()) {
            this.S.f().h();
            this.S.g().i(this.R.h, b);
            return;
        }
        if (!this.S.d()) {
            return;
        }
        final r g = this.S.g();
        g.g().j0(this.R.h, g.l0(), b, true);
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
    public void b5(final long n) {
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
    public boolean b6() {
        this.S.f().h();
        return this.S.g().l(this.R.g);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final j5 j5 = (j5)o;
        final io.realm.a f = this.S.f();
        final io.realm.a f2 = j5.S.f();
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
        final String i = j5.S.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.S.g().l0() == j5.S.g().l0();
            }
        }
        else if (i == null) {
            return this.S.g().l0() == j5.S.g().l0();
        }
        return false;
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
    public void k7(final boolean b) {
        if (!this.S.i()) {
            this.S.f().h();
            this.S.g().i(this.R.f, b);
            return;
        }
        if (!this.S.d()) {
            return;
        }
        final r g = this.S.g();
        g.g().j0(this.R.f, g.l0(), b, true);
    }
    
    @Override
    public long m5() {
        this.S.f().h();
        return this.S.g().m(this.R.i);
    }
    
    @Override
    public void n7(final long n) {
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
    public void q2(final int n) {
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
    public String toString() {
        if (!p0.k8(this)) {
            return "Invalid object";
        }
        final StringBuilder sb = new StringBuilder("RealmClassbookSettings = proxy[");
        sb.append("{id:");
        sb.append(this.a());
        sb.append("}");
        sb.append(",");
        sb.append("{showAbsenceReason:");
        sb.append(this.v2());
        sb.append("}");
        sb.append(",");
        sb.append("{showAbsenceText:");
        sb.append(this.b6());
        sb.append("}");
        sb.append(",");
        sb.append("{absenceCheckRequired:");
        sb.append(this.D5());
        sb.append("}");
        sb.append(",");
        sb.append("{defaultAbsenceReasonId:");
        sb.append(this.m5());
        sb.append("}");
        sb.append(",");
        sb.append("{defaultLatenessReasonId:");
        sb.append(this.W1());
        sb.append("}");
        sb.append(",");
        sb.append("{defaultAbsenceEndTimeType:");
        sb.append(this.z3());
        sb.append("}");
        sb.append(",");
        sb.append("{customAbsenceEndTime:");
        String p1;
        if (this.P1() != null) {
            p1 = this.P1();
        }
        else {
            p1 = "null";
        }
        sb.append(p1);
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
    
    @Override
    public boolean v2() {
        this.S.f().h();
        return this.S.g().l(this.R.f);
    }
    
    @Override
    public void y4() {
        if (this.S != null) {
            return;
        }
        final io.realm.a.h h = io.realm.a.W.get();
        this.R = (b)h.c();
        (this.S = new c0<z4.b>(this)).r(h.e());
        this.S.s(h.f());
        this.S.o(h.b());
        this.S.q(h.d());
    }
    
    @Override
    public int z3() {
        this.S.f().h();
        return (int)this.S.g().m(this.R.k);
    }
    
    public static final class a
    {
        public static final String a = "RealmClassbookSettings";
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
            final OsObjectSchemaInfo b = osSchemaInfo.b("RealmClassbookSettings");
            this.e = this.b("id", "id", b);
            this.f = this.b("showAbsenceReason", "showAbsenceReason", b);
            this.g = this.b("showAbsenceText", "showAbsenceText", b);
            this.h = this.b("absenceCheckRequired", "absenceCheckRequired", b);
            this.i = this.b("defaultAbsenceReasonId", "defaultAbsenceReasonId", b);
            this.j = this.b("defaultLatenessReasonId", "defaultLatenessReasonId", b);
            this.k = this.b("defaultAbsenceEndTimeType", "defaultAbsenceEndTimeType", b);
            this.l = this.b("customAbsenceEndTime", "customAbsenceEndTime", b);
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
