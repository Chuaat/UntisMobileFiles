// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.server.response;

import java.util.List;
import android.os.Parcelable;
import h2.c;
import android.os.Parcel;
import java.util.Iterator;
import com.google.android.gms.common.internal.x;
import androidx.annotation.k0;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import android.os.Parcelable$Creator;
import h2.d;
import com.google.android.gms.common.internal.b0;
import h2.a;

@b0
@h2.d.a(creator = "FieldMappingDictionaryCreator")
public final class p extends a
{
    public static final Parcelable$Creator<p> CREATOR;
    @g(id = 1)
    private final int G;
    private final HashMap<String, Map<String, com.google.android.gms.common.server.response.a.a<?, ?>>> H;
    @k0
    @c(getter = "getSerializedDictionary", id = 2)
    private final ArrayList<o> I;
    @c(getter = "getRootClassName", id = 3)
    private final String J;
    
    static {
        CREATOR = (Parcelable$Creator)new q();
    }
    
    @b
    p(@e(id = 1) int i, @e(id = 2) final ArrayList<o> list, @e(id = 3) final String s) {
        this.G = i;
        this.I = null;
        final HashMap<String, Map<String, com.google.android.gms.common.server.response.a.a<?, ?>>> h = new HashMap<String, Map<String, com.google.android.gms.common.server.response.a.a<?, ?>>>();
        int size;
        o o;
        String h2;
        HashMap<String, com.google.android.gms.common.server.response.a.a<?, ?>> value;
        int size2;
        int j;
        r r;
        for (size = list.size(), i = 0; i < size; ++i) {
            o = list.get(i);
            h2 = o.H;
            value = new HashMap<String, com.google.android.gms.common.server.response.a.a<?, ?>>();
            for (size2 = x.k(o.I).size(), j = 0; j < size2; ++j) {
                r = o.I.get(j);
                value.put(r.H, r.I);
            }
            h.put(h2, value);
        }
        this.H = h;
        this.J = x.k(s);
        this.g1();
    }
    
    public p(final Class<? extends com.google.android.gms.common.server.response.a> clazz) {
        this.G = 1;
        this.I = null;
        this.H = new HashMap<String, Map<String, com.google.android.gms.common.server.response.a.a<?, ?>>>();
        this.J = x.k(clazz.getCanonicalName());
    }
    
    @k0
    public final Map<String, com.google.android.gms.common.server.response.a.a<?, ?>> M(final String key) {
        return this.H.get(key);
    }
    
    public final String N2() {
        return this.J;
    }
    
    public final boolean Q1(final Class<? extends com.google.android.gms.common.server.response.a> clazz) {
        return this.H.containsKey(x.k(clazz.getCanonicalName()));
    }
    
    public final void g1() {
        final Iterator<String> iterator = this.H.keySet().iterator();
        while (iterator.hasNext()) {
            final Map<String, com.google.android.gms.common.server.response.a.a<?, ?>> map = this.H.get(iterator.next());
            final Iterator<String> iterator2 = map.keySet().iterator();
            while (iterator2.hasNext()) {
                ((com.google.android.gms.common.server.response.a.a)map.get(iterator2.next())).S5(this);
            }
        }
    }
    
    public final void j2() {
        for (final String s : this.H.keySet()) {
            final Map<String, com.google.android.gms.common.server.response.a.a<?, ?>> map = this.H.get(s);
            final HashMap<String, com.google.android.gms.common.server.response.a.a<?, ?>> value = new HashMap<String, com.google.android.gms.common.server.response.a.a<?, ?>>();
            for (final String key : map.keySet()) {
                value.put(key, map.get(key).Q5());
            }
            this.H.put(s, value);
        }
    }
    
    public final void q1(final Class<? extends com.google.android.gms.common.server.response.a> clazz, final Map<String, com.google.android.gms.common.server.response.a.a<?, ?>> value) {
        this.H.put(x.k(clazz.getCanonicalName()), value);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        for (final String s : this.H.keySet()) {
            sb.append(s);
            sb.append(":\n");
            final Map<String, com.google.android.gms.common.server.response.a.a<?, ?>> map = this.H.get(s);
            for (final String str : map.keySet()) {
                sb.append("  ");
                sb.append(str);
                sb.append(": ");
                sb.append(map.get(str));
            }
        }
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int a) {
        a = h2.c.a(parcel);
        h2.c.F(parcel, 1, this.G);
        final ArrayList<Parcelable> list = new ArrayList<Parcelable>();
        for (final String key : this.H.keySet()) {
            list.add((Parcelable)new o(key, this.H.get(key)));
        }
        h2.c.c0(parcel, 2, list, false);
        h2.c.X(parcel, 3, this.J, false);
        h2.c.b(parcel, a);
    }
}
