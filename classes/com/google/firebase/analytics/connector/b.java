// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.analytics.connector;

import java.util.Set;
import com.google.firebase.analytics.connector.internal.g;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import androidx.annotation.u0;
import com.google.firebase.analytics.connector.internal.c;
import androidx.annotation.c1;
import androidx.annotation.s0;
import com.google.android.gms.internal.measurement.j3;
import java.util.concurrent.Executor;
import android.os.Bundle;
import j3.d;
import android.content.Context;
import androidx.annotation.j0;
import com.google.firebase.e;
import java.util.concurrent.ConcurrentHashMap;
import com.google.android.gms.common.internal.x;
import java.util.Map;
import com.google.android.gms.common.util.d0;

public class b implements a
{
    private static volatile a c;
    @d0
    final j2.a a;
    @d0
    final Map<String, com.google.firebase.analytics.connector.internal.a> b;
    
    b(final j2.a a) {
        x.k(a);
        this.a = a;
        this.b = new ConcurrentHashMap<String, com.google.firebase.analytics.connector.internal.a>();
    }
    
    @j0
    @f2.a
    public static a h() {
        return i(e.o());
    }
    
    @j0
    @f2.a
    public static a i(@j0 final e e) {
        return e.k(a.class);
    }
    
    @j0
    @s0(allOf = { "android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK" })
    @f2.a
    public static a j(@j0 final e e, @j0 final Context context, @j0 final d d) {
        x.k(e);
        x.k(context);
        x.k(d);
        x.k(context.getApplicationContext());
        if (b.c == null) {
            synchronized (b.class) {
                if (b.c == null) {
                    final Bundle bundle = new Bundle(1);
                    if (e.A()) {
                        d.b((Class)com.google.firebase.b.class, (Executor)e.G, (j3.b)d.a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", e.z());
                    }
                    b.c = new b(j3.C(context, null, null, null, bundle).z());
                }
            }
        }
        return b.c;
    }
    
    private final boolean m(@j0 final String s) {
        return !s.isEmpty() && this.b.containsKey(s) && this.b.get(s) != null;
    }
    
    @c1
    @j0
    @f2.a
    @Override
    public Map<String, Object> a(final boolean b) {
        return this.a.n(null, null, b);
    }
    
    @f2.a
    @Override
    public void b(@j0 final c c) {
        if (!c.i(c)) {
            return;
        }
        this.a.t(c.a(c));
    }
    
    @f2.a
    @Override
    public void c(@j0 final String s, @j0 final String s2, @j0 final Bundle bundle) {
        Bundle bundle2 = bundle;
        if (bundle == null) {
            bundle2 = new Bundle();
        }
        if (!com.google.firebase.analytics.connector.internal.c.l(s)) {
            return;
        }
        if (!com.google.firebase.analytics.connector.internal.c.j(s2, bundle2)) {
            return;
        }
        if (!com.google.firebase.analytics.connector.internal.c.h(s, s2, bundle2)) {
            return;
        }
        com.google.firebase.analytics.connector.internal.c.e(s, s2, bundle2);
        this.a.o(s, s2, bundle2);
    }
    
    @f2.a
    @Override
    public void clearConditionalUserProperty(@j0 @u0(max = 24L, min = 1L) final String s, @j0 final String s2, @j0 final Bundle bundle) {
        if (s2 != null && !com.google.firebase.analytics.connector.internal.c.j(s2, bundle)) {
            return;
        }
        this.a.b(s, s2, bundle);
    }
    
    @c1
    @f2.a
    @Override
    public int d(@j0 @u0(min = 1L) final String s) {
        return this.a.m(s);
    }
    
    @c1
    @j0
    @f2.a
    @Override
    public List<c> e(@j0 final String s, @j0 @u0(max = 23L, min = 1L) final String s2) {
        final ArrayList<c> list = new ArrayList<c>();
        final Iterator<Bundle> iterator = this.a.g(s, s2).iterator();
        while (iterator.hasNext()) {
            list.add(com.google.firebase.analytics.connector.internal.c.b(iterator.next()));
        }
        return list;
    }
    
    @f2.a
    @Override
    public void f(@j0 final String s, @j0 final String s2, @j0 final Object o) {
        if (!com.google.firebase.analytics.connector.internal.c.l(s)) {
            return;
        }
        if (!com.google.firebase.analytics.connector.internal.c.m(s, s2)) {
            return;
        }
        this.a.z(s, s2, o);
    }
    
    @c1
    @j0
    @f2.a
    @Override
    public a g(@j0 final String anObject, @j0 final com.google.firebase.analytics.connector.a.b b) {
        x.k(b);
        if (!com.google.firebase.analytics.connector.internal.c.l(anObject)) {
            return null;
        }
        if (this.m(anObject)) {
            return null;
        }
        final j2.a a = this.a;
        com.google.firebase.analytics.connector.internal.a a2;
        if ("fiam".equals(anObject)) {
            a2 = new com.google.firebase.analytics.connector.internal.e(a, b);
        }
        else if (!"crash".equals(anObject) && !"clx".equals(anObject)) {
            a2 = null;
        }
        else {
            a2 = new g(a, b);
        }
        if (a2 != null) {
            this.b.put(anObject, a2);
            return new a() {
                @Override
                public final void a() {
                    if (!com.google.firebase.analytics.connector.b.this.m(anObject)) {
                        return;
                    }
                    final b zza = com.google.firebase.analytics.connector.b.this.b.get(anObject).zza();
                    if (zza != null) {
                        zza.a(0, null);
                    }
                    com.google.firebase.analytics.connector.b.this.b.remove(anObject);
                }
                
                @f2.a
                @Override
                public void b() {
                    if (com.google.firebase.analytics.connector.b.this.m(anObject)) {
                        if (anObject.equals("fiam")) {
                            com.google.firebase.analytics.connector.b.this.b.get(anObject).a();
                        }
                    }
                }
                
                @f2.a
                @Override
                public void c(final Set<String> set) {
                    if (com.google.firebase.analytics.connector.b.this.m(anObject) && anObject.equals("fiam") && set != null) {
                        if (!set.isEmpty()) {
                            com.google.firebase.analytics.connector.b.this.b.get(anObject).b(set);
                        }
                    }
                }
            };
        }
        return null;
    }
}
