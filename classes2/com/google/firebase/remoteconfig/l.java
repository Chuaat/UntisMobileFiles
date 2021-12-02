// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.remoteconfig;

import java.util.Set;
import com.google.firebase.abt.a;
import com.google.firebase.remoteconfig.internal.q;
import androidx.annotation.d1;
import androidx.annotation.j0;
import androidx.annotation.b1;
import java.util.Iterator;
import org.json.JSONObject;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import com.google.android.gms.tasks.p;
import android.util.Log;
import com.google.firebase.remoteconfig.internal.g;
import com.google.android.gms.tasks.m;
import java.util.Map;
import com.google.firebase.installations.j;
import com.google.firebase.remoteconfig.internal.o;
import com.google.firebase.remoteconfig.internal.n;
import com.google.firebase.remoteconfig.internal.f;
import java.util.concurrent.Executor;
import androidx.annotation.k0;
import com.google.firebase.abt.d;
import com.google.firebase.e;
import android.content.Context;

public class l
{
    public static final String l = "";
    public static final long m = 0L;
    public static final double n = 0.0;
    public static final boolean o = false;
    public static final byte[] p;
    public static final int q = 0;
    public static final int r = 1;
    public static final int s = 2;
    public static final int t = -1;
    public static final int u = 0;
    public static final int v = 1;
    public static final int w = 2;
    public static final String x = "FirebaseRemoteConfig";
    private final Context a;
    private final e b;
    @k0
    private final d c;
    private final Executor d;
    private final f e;
    private final f f;
    private final f g;
    private final com.google.firebase.remoteconfig.internal.l h;
    private final n i;
    private final o j;
    private final j k;
    
    static {
        p = new byte[0];
    }
    
    l(final Context a, final e b, final j k, @k0 final d c, final Executor d, final f e, final f f, final f g, final com.google.firebase.remoteconfig.internal.l h, final n i, final o j) {
        this.a = a;
        this.b = b;
        this.k = k;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    private m<Void> E(final Map<String, String> map) {
        try {
            return (m<Void>)this.g.k(com.google.firebase.remoteconfig.internal.g.g().b(map).a()).w(com.google.firebase.remoteconfig.k.b());
        }
        catch (JSONException ex) {
            Log.e("FirebaseRemoteConfig", "The provided defaults map could not be processed.", (Throwable)ex);
            return (m<Void>)com.google.android.gms.tasks.p.g((Object)null);
        }
    }
    
    @b1
    static List<Map<String, String>> G(final JSONArray jsonArray) throws JSONException {
        final ArrayList<HashMap<String, String>> list = (ArrayList<HashMap<String, String>>)new ArrayList<Map<String, String>>();
        for (int i = 0; i < jsonArray.length(); ++i) {
            final HashMap<String, String> hashMap = new HashMap<String, String>();
            final JSONObject jsonObject = jsonArray.getJSONObject(i);
            final Iterator keys = jsonObject.keys();
            while (keys.hasNext()) {
                final String s = keys.next();
                hashMap.put(s, jsonObject.getString(s));
            }
            list.add(hashMap);
        }
        return (List<Map<String, String>>)list;
    }
    
    @j0
    public static l k() {
        return l(e.o());
    }
    
    @j0
    public static l l(@j0 final e e) {
        return ((w)e.k((Class)w.class)).d();
    }
    
    private static boolean q(final g g, @k0 final g g2) {
        return g2 == null || !g.e().equals(g2.e());
    }
    
    private boolean z(final m<g> m) {
        if (m.v()) {
            this.e.b();
            if (m.r() != null) {
                this.H(((g)m.r()).c());
            }
            else {
                Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            }
            return true;
        }
        return false;
    }
    
    @j0
    public m<Void> A() {
        return (m<Void>)com.google.android.gms.tasks.p.d(this.d, com.google.firebase.remoteconfig.j.a(this));
    }
    
    @j0
    public m<Void> B(@j0 final r r) {
        return (m<Void>)com.google.android.gms.tasks.p.d(this.d, com.google.firebase.remoteconfig.i.a(this, r));
    }
    
    @j0
    public m<Void> C(@d1 final int n) {
        return this.E(com.google.firebase.remoteconfig.internal.q.a(this.a, n));
    }
    
    @j0
    public m<Void> D(@j0 final Map<String, Object> map) {
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        for (final Map.Entry<String, Object> entry : map.entrySet()) {
            final byte[] value = entry.getValue();
            final boolean b = value instanceof byte[];
            final String s = entry.getKey();
            if (b) {
                hashMap.put(s, new String(value));
            }
            else {
                hashMap.put(s, value.toString());
            }
        }
        return this.E(hashMap);
    }
    
    void F() {
        this.f.d();
        this.g.d();
        this.e.d();
    }
    
    @b1
    void H(@j0 final JSONArray jsonArray) {
        if (this.c == null) {
            return;
        }
        try {
            this.c.l((List)G(jsonArray));
        }
        catch (a a) {
            Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", (Throwable)a);
        }
        catch (JSONException ex) {
            Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", (Throwable)ex);
        }
    }
    
    @j0
    public m<Boolean> b() {
        final m<g> d = this.e.d();
        final m<g> d2 = this.f.d();
        return (m<Boolean>)com.google.android.gms.tasks.p.k(new m[] { d, d2 }).p(this.d, com.google.firebase.remoteconfig.f.b(this, d, d2));
    }
    
    @j0
    public m<com.google.firebase.remoteconfig.p> c() {
        final m<g> d = this.f.d();
        final m<g> d2 = this.g.d();
        final m<g> d3 = this.e.d();
        final m d4 = com.google.android.gms.tasks.p.d(this.d, com.google.firebase.remoteconfig.c.a(this));
        return (m<com.google.firebase.remoteconfig.p>)com.google.android.gms.tasks.p.k(new m[] { d, d2, d3, d4, this.k.b(), this.k.a(false) }).n(this.d, com.google.firebase.remoteconfig.d.b(d4));
    }
    
    @j0
    public m<Void> d() {
        return (m<Void>)this.h.d().w(com.google.firebase.remoteconfig.g.b());
    }
    
    @j0
    public m<Void> e(final long n) {
        return (m<Void>)this.h.e(n).w(com.google.firebase.remoteconfig.h.b());
    }
    
    @j0
    public m<Boolean> f() {
        return (m<Boolean>)this.d().x(this.d, com.google.firebase.remoteconfig.e.b(this));
    }
    
    @j0
    public Map<String, s> g() {
        return this.i.c();
    }
    
    public boolean h(@j0 final String s) {
        return this.i.d(s);
    }
    
    public double i(@j0 final String s) {
        return this.i.g(s);
    }
    
    @j0
    public com.google.firebase.remoteconfig.p j() {
        return this.j.d();
    }
    
    @j0
    public Set<String> m(@j0 final String s) {
        return this.i.j(s);
    }
    
    public long n(@j0 final String s) {
        return this.i.l(s);
    }
    
    @j0
    public String o(@j0 final String s) {
        return this.i.n(s);
    }
    
    @j0
    public s p(@j0 final String s) {
        return this.i.p(s);
    }
}
