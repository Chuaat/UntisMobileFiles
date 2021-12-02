// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import io.realm.internal.c;
import java.util.Iterator;
import io.realm.internal.Table;
import io.realm.internal.OsObject;
import android.annotation.TargetApi;
import java.io.IOException;
import android.util.JsonToken;
import android.util.JsonReader;
import org.json.JSONException;
import java.util.Collections;
import org.json.JSONObject;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.r;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Set;
import java.util.Map;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.p;
import c5.b;

public class x5 extends c5.b implements p, y5
{
    private static final String S = "";
    private static final OsObjectSchemaInfo T;
    private b Q;
    private c0<c5.b> R;
    
    static {
        T = K8();
    }
    
    x5() {
        this.R.p();
    }
    
    public static c5.b G8(final f0 f0, final b b, final c5.b b2, final boolean b3, final Map<n0, p> map, final Set<q> set) {
        final x5 x5 = map.get(b2);
        if (x5 != null) {
            return x5;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(c5.b.class), set);
        osObjectBuilder.K(b.e, b2.l());
        osObjectBuilder.L(b.f, b2.N0());
        osObjectBuilder.L(b.g, b2.J1());
        osObjectBuilder.d0(b.h, b2.l6());
        osObjectBuilder.d0(b.i, b2.U1());
        osObjectBuilder.K(b.j, b2.r());
        osObjectBuilder.K(b.k, b2.v3());
        final x5 t8 = T8(f0, osObjectBuilder.f0());
        map.put(b2, t8);
        return t8;
    }
    
    public static c5.b H8(final f0 f0, final b b, final c5.b b2, final boolean b3, final Map<n0, p> map, final Set<q> set) {
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
            return (c5.b)p7;
        }
        return G8(f0, b, b2, b3, map, set);
    }
    
    public static b I8(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static c5.b J8(final c5.b b, final int a, final int n, final Map<n0, p.a<n0>> map) {
        if (a <= n && b != null) {
            final p.a a2 = map.get(b);
            c5.b b3;
            if (a2 == null) {
                final c5.b b2 = new c5.b();
                map.put(b, (p.a<n0>)new p.a(a, b2));
                b3 = b2;
            }
            else {
                if (a >= a2.a) {
                    return (c5.b)a2.b;
                }
                b3 = (c5.b)a2.b;
                a2.a = a;
            }
            b3.k(b.l());
            b3.s1(b.N0());
            b3.I0(b.J1());
            b3.x7(b.l6());
            b3.X5(b.U1());
            b3.q(b.r());
            b3.e7(b.v3());
            return b3;
        }
        return null;
    }
    
    private static OsObjectSchemaInfo K8() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmPeriodElementModel", false, 7, 0);
        final RealmFieldType integer = RealmFieldType.INTEGER;
        b.c("", "entityType", integer, false, false, true);
        b.c("", "currentId", integer, false, false, true);
        b.c("", "originalId", integer, false, false, true);
        final RealmFieldType string = RealmFieldType.STRING;
        b.c("", "label", string, false, false, true);
        b.c("", "labelLong", string, false, false, true);
        b.c("", "textColor", integer, false, false, true);
        b.c("", "backGround", integer, false, false, true);
        return b.e();
    }
    
    public static c5.b L8(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final c5.b b2 = f0.q1(c5.b.class, true, Collections.emptyList());
        if (jsonObject.has("entityType")) {
            if (jsonObject.isNull("entityType")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'entityType' to null.");
            }
            b2.k(jsonObject.getInt("entityType"));
        }
        if (jsonObject.has("currentId")) {
            if (jsonObject.isNull("currentId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'currentId' to null.");
            }
            b2.s1(jsonObject.getLong("currentId"));
        }
        if (jsonObject.has("originalId")) {
            if (jsonObject.isNull("originalId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'originalId' to null.");
            }
            b2.I0(jsonObject.getLong("originalId"));
        }
        if (jsonObject.has("label")) {
            if (jsonObject.isNull("label")) {
                b2.x7(null);
            }
            else {
                b2.x7(jsonObject.getString("label"));
            }
        }
        if (jsonObject.has("labelLong")) {
            if (jsonObject.isNull("labelLong")) {
                b2.X5(null);
            }
            else {
                b2.X5(jsonObject.getString("labelLong"));
            }
        }
        if (jsonObject.has("textColor")) {
            if (jsonObject.isNull("textColor")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'textColor' to null.");
            }
            b2.q(jsonObject.getInt("textColor"));
        }
        if (jsonObject.has("backGround")) {
            if (jsonObject.isNull("backGround")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'backGround' to null.");
            }
            b2.e7(jsonObject.getInt("backGround"));
        }
        return b2;
    }
    
    @TargetApi(11)
    public static c5.b M8(final f0 f0, final JsonReader jsonReader) throws IOException {
        final c5.b b = new c5.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            if (nextName.equals("entityType")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'entityType' to null.");
                }
                b.k(jsonReader.nextInt());
            }
            else if (nextName.equals("currentId")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'currentId' to null.");
                }
                b.s1(jsonReader.nextLong());
            }
            else if (nextName.equals("originalId")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'originalId' to null.");
                }
                b.I0(jsonReader.nextLong());
            }
            else if (nextName.equals("label")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    b.x7(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    b.x7(null);
                }
            }
            else if (nextName.equals("labelLong")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    b.X5(jsonReader.nextString());
                }
                else {
                    jsonReader.skipValue();
                    b.X5(null);
                }
            }
            else if (nextName.equals("textColor")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'textColor' to null.");
                }
                b.q(jsonReader.nextInt());
            }
            else if (nextName.equals("backGround")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'backGround' to null.");
                }
                b.e7(jsonReader.nextInt());
            }
            else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return f0.y0(b, new q[0]);
    }
    
    public static OsObjectSchemaInfo N8() {
        return x5.T;
    }
    
    public static String O8() {
        return "RealmPeriodElementModel";
    }
    
    public static long P8(final f0 f0, final c5.b b, final Map<n0, Long> map) {
        if (b instanceof p && !p0.h8(b)) {
            final p p3 = (p)b;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(c5.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b2 = (b)f0.H().j(c5.b.class);
        final long row = OsObject.createRow(x2);
        map.put(b, row);
        Table.nativeSetLong(nativePtr, b2.e, row, b.l(), false);
        Table.nativeSetLong(nativePtr, b2.f, row, b.N0(), false);
        Table.nativeSetLong(nativePtr, b2.g, row, b.J1(), false);
        final String l6 = b.l6();
        if (l6 != null) {
            Table.nativeSetString(nativePtr, b2.h, row, l6, false);
        }
        final String u1 = b.U1();
        if (u1 != null) {
            Table.nativeSetString(nativePtr, b2.i, row, u1, false);
        }
        Table.nativeSetLong(nativePtr, b2.j, row, b.r(), false);
        Table.nativeSetLong(nativePtr, b2.k, row, b.v3(), false);
        return row;
    }
    
    public static void Q8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(c5.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(c5.b.class);
        while (iterator.hasNext()) {
            final c5.b b2 = (c5.b)iterator.next();
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
            Table.nativeSetLong(nativePtr, b.e, row, b2.l(), false);
            Table.nativeSetLong(nativePtr, b.f, row, b2.N0(), false);
            Table.nativeSetLong(nativePtr, b.g, row, b2.J1(), false);
            final String l6 = b2.l6();
            if (l6 != null) {
                Table.nativeSetString(nativePtr, b.h, row, l6, false);
            }
            final String u1 = b2.U1();
            if (u1 != null) {
                Table.nativeSetString(nativePtr, b.i, row, u1, false);
            }
            Table.nativeSetLong(nativePtr, b.j, row, b2.r(), false);
            Table.nativeSetLong(nativePtr, b.k, row, b2.v3(), false);
        }
    }
    
    public static long R8(final f0 f0, final c5.b b, final Map<n0, Long> map) {
        if (b instanceof p && !p0.h8(b)) {
            final p p3 = (p)b;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(c5.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b2 = (b)f0.H().j(c5.b.class);
        final long row = OsObject.createRow(x2);
        map.put(b, row);
        Table.nativeSetLong(nativePtr, b2.e, row, b.l(), false);
        Table.nativeSetLong(nativePtr, b2.f, row, b.N0(), false);
        Table.nativeSetLong(nativePtr, b2.g, row, b.J1(), false);
        final String l6 = b.l6();
        final long h = b2.h;
        if (l6 != null) {
            Table.nativeSetString(nativePtr, h, row, l6, false);
        }
        else {
            Table.nativeSetNull(nativePtr, h, row, false);
        }
        final String u1 = b.U1();
        final long i = b2.i;
        if (u1 != null) {
            Table.nativeSetString(nativePtr, i, row, u1, false);
        }
        else {
            Table.nativeSetNull(nativePtr, i, row, false);
        }
        Table.nativeSetLong(nativePtr, b2.j, row, b.r(), false);
        Table.nativeSetLong(nativePtr, b2.k, row, b.v3(), false);
        return row;
    }
    
    public static void S8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(c5.b.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(c5.b.class);
        while (iterator.hasNext()) {
            final c5.b b2 = (c5.b)iterator.next();
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
            Table.nativeSetLong(nativePtr, b.e, row, b2.l(), false);
            Table.nativeSetLong(nativePtr, b.f, row, b2.N0(), false);
            Table.nativeSetLong(nativePtr, b.g, row, b2.J1(), false);
            final String l6 = b2.l6();
            final long h = b.h;
            if (l6 != null) {
                Table.nativeSetString(nativePtr, h, row, l6, false);
            }
            else {
                Table.nativeSetNull(nativePtr, h, row, false);
            }
            final String u1 = b2.U1();
            final long i = b.i;
            if (u1 != null) {
                Table.nativeSetString(nativePtr, i, row, u1, false);
            }
            else {
                Table.nativeSetNull(nativePtr, i, row, false);
            }
            Table.nativeSetLong(nativePtr, b.j, row, b2.r(), false);
            Table.nativeSetLong(nativePtr, b.k, row, b2.v3(), false);
        }
    }
    
    static x5 T8(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(c5.b.class), false, Collections.emptyList());
        final x5 x5 = new x5();
        h.a();
        return x5;
    }
    
    @Override
    public void I0(final long n) {
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
    public long J1() {
        this.R.f().h();
        return this.R.g().m(this.Q.g);
    }
    
    @Override
    public long N0() {
        this.R.f().h();
        return this.R.g().m(this.Q.f);
    }
    
    @Override
    public c0<?> S6() {
        return this.R;
    }
    
    @Override
    public String U1() {
        this.R.f().h();
        return this.R.g().U(this.Q.i);
    }
    
    @Override
    public void X5(final String s) {
        if (this.R.i()) {
            if (!this.R.d()) {
                return;
            }
            final r g = this.R.g();
            if (s != null) {
                g.g().t0(this.Q.i, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'labelLong' to null.");
        }
        else {
            this.R.f().h();
            if (s != null) {
                this.R.g().d(this.Q.i, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'labelLong' to null.");
        }
    }
    
    @Override
    public void e7(final int n) {
        if (!this.R.i()) {
            this.R.f().h();
            this.R.g().s(this.Q.k, n);
            return;
        }
        if (!this.R.d()) {
            return;
        }
        final r g = this.R.g();
        g.g().q0(this.Q.k, g.l0(), n, true);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final x5 x5 = (x5)o;
        final io.realm.a f = this.R.f();
        final io.realm.a f2 = x5.R.f();
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
        final String i = x5.R.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.R.g().l0() == x5.R.g().l0();
            }
        }
        else if (i == null) {
            return this.R.g().l0() == x5.R.g().l0();
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
            this.R.g().s(this.Q.e, n);
            return;
        }
        if (!this.R.d()) {
            return;
        }
        final r g = this.R.g();
        g.g().q0(this.Q.e, g.l0(), n, true);
    }
    
    @Override
    public int l() {
        this.R.f().h();
        return (int)this.R.g().m(this.Q.e);
    }
    
    @Override
    public String l6() {
        this.R.f().h();
        return this.R.g().U(this.Q.h);
    }
    
    @Override
    public void q(final int n) {
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
    public int r() {
        this.R.f().h();
        return (int)this.R.g().m(this.Q.j);
    }
    
    @Override
    public void s1(final long n) {
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
    public String toString() {
        if (!p0.k8(this)) {
            return "Invalid object";
        }
        final StringBuilder sb = new StringBuilder("RealmPeriodElementModel = proxy[");
        sb.append("{entityType:");
        sb.append(this.l());
        sb.append("}");
        sb.append(",");
        sb.append("{currentId:");
        sb.append(this.N0());
        sb.append("}");
        sb.append(",");
        sb.append("{originalId:");
        sb.append(this.J1());
        sb.append("}");
        sb.append(",");
        sb.append("{label:");
        sb.append(this.l6());
        sb.append("}");
        sb.append(",");
        sb.append("{labelLong:");
        sb.append(this.U1());
        sb.append("}");
        sb.append(",");
        sb.append("{textColor:");
        sb.append(this.r());
        sb.append("}");
        sb.append(",");
        sb.append("{backGround:");
        sb.append(this.v3());
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
    
    @Override
    public int v3() {
        this.R.f().h();
        return (int)this.R.g().m(this.Q.k);
    }
    
    @Override
    public void x7(final String s) {
        if (this.R.i()) {
            if (!this.R.d()) {
                return;
            }
            final r g = this.R.g();
            if (s != null) {
                g.g().t0(this.Q.h, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'label' to null.");
        }
        else {
            this.R.f().h();
            if (s != null) {
                this.R.g().d(this.Q.h, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'label' to null.");
        }
    }
    
    @Override
    public void y4() {
        if (this.R != null) {
            return;
        }
        final io.realm.a.h h = io.realm.a.W.get();
        this.Q = (b)h.c();
        (this.R = new c0<c5.b>(this)).r(h.e());
        this.R.s(h.f());
        this.R.o(h.b());
        this.R.q(h.d());
    }
    
    public static final class a
    {
        public static final String a = "RealmPeriodElementModel";
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
            final OsObjectSchemaInfo b = osSchemaInfo.b("RealmPeriodElementModel");
            this.e = this.b("entityType", "entityType", b);
            this.f = this.b("currentId", "currentId", b);
            this.g = this.b("originalId", "originalId", b);
            this.h = this.b("label", "label", b);
            this.i = this.b("labelLong", "labelLong", b);
            this.j = this.b("textColor", "textColor", b);
            this.k = this.b("backGround", "backGround", b);
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
