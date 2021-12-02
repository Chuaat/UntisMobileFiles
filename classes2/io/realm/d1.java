// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import io.realm.internal.c;
import org.json.JSONException;
import org.json.JSONObject;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Set;
import java.util.Collections;
import io.realm.internal.r;
import java.util.Iterator;
import io.realm.internal.Table;
import io.realm.internal.OsObject;
import java.util.Map;
import android.annotation.TargetApi;
import java.io.IOException;
import android.util.JsonToken;
import android.util.JsonReader;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.p;
import com.untis.mobile.persistence.realm.e;

public class d1 extends e implements p, e1
{
    private static final String M = "";
    private static final OsObjectSchemaInfo N;
    private b K;
    private c0<e> L;
    
    static {
        N = y8();
    }
    
    d1() {
        this.L.p();
    }
    
    @TargetApi(11)
    public static e A8(final f0 f0, final JsonReader jsonReader) throws IOException {
        final e e = new e();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("value")) {
                String nextString;
                if (jsonReader.peek() != JsonToken.NULL) {
                    nextString = jsonReader.nextString();
                }
                else {
                    jsonReader.skipValue();
                    nextString = null;
                }
                e.w3(nextString);
            }
            else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return f0.y0(e, new q[0]);
    }
    
    public static OsObjectSchemaInfo B8() {
        return d1.N;
    }
    
    public static String C8() {
        return "RealmString";
    }
    
    public static long D8(final f0 f0, final e e, final Map<n0, Long> map) {
        if (e instanceof p && !p0.h8(e)) {
            final p p3 = (p)e;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(e.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(e.class);
        final long row = OsObject.createRow(x2);
        map.put(e, row);
        final String l0 = e.l0();
        if (l0 != null) {
            Table.nativeSetString(nativePtr, b.e, row, l0, false);
        }
        return row;
    }
    
    public static void E8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(e.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(e.class);
        while (iterator.hasNext()) {
            final e e = (e)iterator.next();
            if (map.containsKey(e)) {
                continue;
            }
            if (e instanceof p && !p0.h8(e)) {
                final p p3 = (p)e;
                if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                    map.put(e, p3.S6().g().l0());
                    continue;
                }
            }
            final long row = OsObject.createRow(x2);
            map.put(e, row);
            final String l0 = e.l0();
            if (l0 == null) {
                continue;
            }
            Table.nativeSetString(nativePtr, b.e, row, l0, false);
        }
    }
    
    public static long F8(final f0 f0, final e e, final Map<n0, Long> map) {
        if (e instanceof p && !p0.h8(e)) {
            final p p3 = (p)e;
            if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                return p3.S6().g().l0();
            }
        }
        final Table x2 = f0.x2(e.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(e.class);
        final long row = OsObject.createRow(x2);
        map.put(e, row);
        final String l0 = e.l0();
        final long e2 = b.e;
        if (l0 != null) {
            Table.nativeSetString(nativePtr, e2, row, l0, false);
        }
        else {
            Table.nativeSetNull(nativePtr, e2, row, false);
        }
        return row;
    }
    
    public static void G8(final f0 f0, final Iterator<? extends n0> iterator, final Map<n0, Long> map) {
        final Table x2 = f0.x2(e.class);
        final long nativePtr = x2.getNativePtr();
        final b b = (b)f0.H().j(e.class);
        while (iterator.hasNext()) {
            final e e = (e)iterator.next();
            if (map.containsKey(e)) {
                continue;
            }
            if (e instanceof p && !p0.h8(e)) {
                final p p3 = (p)e;
                if (p3.S6().f() != null && p3.S6().f().getPath().equals(f0.getPath())) {
                    map.put(e, p3.S6().g().l0());
                    continue;
                }
            }
            final long row = OsObject.createRow(x2);
            map.put(e, row);
            final String l0 = e.l0();
            final long e2 = b.e;
            if (l0 != null) {
                Table.nativeSetString(nativePtr, e2, row, l0, false);
            }
            else {
                Table.nativeSetNull(nativePtr, e2, row, false);
            }
        }
    }
    
    static d1 H8(final io.realm.a a, final r r) {
        final io.realm.a.h h = a.W.get();
        h.g(a, r, a.H().j(e.class), false, Collections.emptyList());
        final d1 d1 = new d1();
        h.a();
        return d1;
    }
    
    public static e u8(final f0 f0, final b b, final e e, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        final d1 d1 = map.get(e);
        if (d1 != null) {
            return d1;
        }
        final OsObjectBuilder osObjectBuilder = new OsObjectBuilder(f0.x2(e.class), set);
        osObjectBuilder.d0(b.e, e.l0());
        final d1 h8 = H8(f0, osObjectBuilder.f0());
        map.put(e, h8);
        return h8;
    }
    
    public static e v8(final f0 f0, final b b, final e e, final boolean b2, final Map<n0, p> map, final Set<q> set) {
        if (e instanceof p && !p0.h8(e)) {
            final p p6 = (p)e;
            if (p6.S6().f() != null) {
                final io.realm.a f2 = p6.S6().f();
                if (f2.H != f0.H) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
                if (f2.getPath().equals(f0.getPath())) {
                    return e;
                }
            }
        }
        final io.realm.a.h h = io.realm.a.W.get();
        final p p7 = map.get(e);
        if (p7 != null) {
            return (e)p7;
        }
        return u8(f0, b, e, b2, map, set);
    }
    
    public static b w8(final OsSchemaInfo osSchemaInfo) {
        return new b(osSchemaInfo);
    }
    
    public static e x8(final e e, final int a, final int n, final Map<n0, p.a<n0>> map) {
        if (a <= n && e != null) {
            final p.a a2 = map.get(e);
            e e3;
            if (a2 == null) {
                final e e2 = new e();
                map.put(e, (p.a<n0>)new p.a(a, e2));
                e3 = e2;
            }
            else {
                if (a >= a2.a) {
                    return (e)a2.b;
                }
                e3 = (e)a2.b;
                a2.a = a;
            }
            e3.w3(e.l0());
            return e3;
        }
        return null;
    }
    
    private static OsObjectSchemaInfo y8() {
        final OsObjectSchemaInfo.b b = new OsObjectSchemaInfo.b("", "RealmString", false, 1, 0);
        b.c("", "value", RealmFieldType.STRING, false, false, true);
        return b.e();
    }
    
    public static e z8(final f0 f0, final JSONObject jsonObject, final boolean b) throws JSONException {
        final e e = f0.q1(e.class, true, Collections.emptyList());
        if (jsonObject.has("value")) {
            String string;
            if (jsonObject.isNull("value")) {
                string = null;
            }
            else {
                string = jsonObject.getString("value");
            }
            e.w3(string);
        }
        return e;
    }
    
    @Override
    public c0<?> S6() {
        return this.L;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final d1 d1 = (d1)o;
        final io.realm.a f = this.L.f();
        final io.realm.a f2 = d1.L.f();
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
        final String m = this.L.g().g().M();
        final String i = d1.L.g().g().M();
        if (m != null) {
            if (m.equals(i)) {
                return this.L.g().l0() == d1.L.g().l0();
            }
        }
        else if (i == null) {
            return this.L.g().l0() == d1.L.g().l0();
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final String path = this.L.f().getPath();
        final String m = this.L.g().g().M();
        final long l0 = this.L.g().l0();
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
    public String l0() {
        this.L.f().h();
        return this.L.g().U(this.K.e);
    }
    
    @Override
    public String toString() {
        if (!p0.k8(this)) {
            return "Invalid object";
        }
        final StringBuilder sb = new StringBuilder("RealmString = proxy[");
        sb.append("{value:");
        sb.append(this.l0());
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
    
    @Override
    public void w3(final String s) {
        if (this.L.i()) {
            if (!this.L.d()) {
                return;
            }
            final r g = this.L.g();
            if (s != null) {
                g.g().t0(this.K.e, g.l0(), s, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'value' to null.");
        }
        else {
            this.L.f().h();
            if (s != null) {
                this.L.g().d(this.K.e, s);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'value' to null.");
        }
    }
    
    @Override
    public void y4() {
        if (this.L != null) {
            return;
        }
        final io.realm.a.h h = io.realm.a.W.get();
        this.K = (b)h.c();
        (this.L = new c0<e>(this)).r(h.e());
        this.L.s(h.f());
        this.L.o(h.b());
        this.L.q(h.d());
    }
    
    public static final class a
    {
        public static final String a = "RealmString";
    }
    
    static final class b extends c
    {
        long e;
        
        b(final OsSchemaInfo osSchemaInfo) {
            super(1);
            this.e = this.b("value", "value", osSchemaInfo.b("RealmString"));
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
            ((b)c2).e = ((b)c).e;
        }
    }
}
