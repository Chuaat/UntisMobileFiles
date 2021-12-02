// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.internal;

import androidx.collection.c;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.k;
import android.content.Context;
import java.util.Iterator;
import java.util.Collection;
import java.util.HashSet;
import java.util.Collections;
import androidx.annotation.RecentlyNonNull;
import android.view.View;
import java.util.Map;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import c6.h;
import android.accounts.Account;
import f2.a;
import com.google.android.gms.common.util.d0;

@d0
@f2.a
public final class g
{
    @h
    private final Account a;
    private final Set<Scope> b;
    private final Set<Scope> c;
    private final Map<com.google.android.gms.common.api.a<?>, b> d;
    private final int e;
    private final View f;
    private final String g;
    private final String h;
    private final com.google.android.gms.signin.a i;
    private final boolean j;
    private Integer k;
    
    @f2.a
    public g(@RecentlyNonNull final Account account, @RecentlyNonNull final Set<Scope> set, @RecentlyNonNull final Map<com.google.android.gms.common.api.a<?>, b> map, @RecentlyNonNull final int n, @RecentlyNonNull final View view, @RecentlyNonNull final String s, @RecentlyNonNull final String s2, @RecentlyNonNull final com.google.android.gms.signin.a a) {
        this(account, set, map, n, view, s, s2, a, false);
    }
    
    public g(@h final Account a, @RecentlyNonNull final Set<Scope> s, @RecentlyNonNull final Map<com.google.android.gms.common.api.a<?>, b> map, @RecentlyNonNull final int e, @RecentlyNonNull final View f, @RecentlyNonNull final String g, @RecentlyNonNull final String h, @RecentlyNonNull final com.google.android.gms.signin.a i, @RecentlyNonNull final boolean b) {
        this.a = a;
        Set<Object> set;
        if (s == null) {
            set = Collections.emptySet();
        }
        else {
            set = Collections.unmodifiableSet((Set<?>)s);
        }
        this.b = (Set<Scope>)set;
        Map<com.google.android.gms.common.api.a<?>, b> emptyMap = map;
        if (map == null) {
            emptyMap = Collections.emptyMap();
        }
        this.d = emptyMap;
        this.f = f;
        this.e = e;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = false;
        final HashSet s2 = new HashSet<Scope>((Collection<? extends Scope>)set);
        final Iterator<b> iterator = emptyMap.values().iterator();
        while (iterator.hasNext()) {
            s2.addAll((Collection<?>)iterator.next().a);
        }
        this.c = Collections.unmodifiableSet((Set<? extends Scope>)s2);
    }
    
    @RecentlyNonNull
    @f2.a
    public static g a(@RecentlyNonNull final Context context) {
        return new k.a(context).j();
    }
    
    @RecentlyNullable
    @f2.a
    public final Account b() {
        return this.a;
    }
    
    @Deprecated
    @RecentlyNullable
    @f2.a
    public final String c() {
        final Account a = this.a;
        if (a != null) {
            return a.name;
        }
        return null;
    }
    
    @RecentlyNonNull
    @f2.a
    public final Account d() {
        final Account a = this.a;
        if (a != null) {
            return a;
        }
        return new Account("<<default account>>", "com.google");
    }
    
    @RecentlyNonNull
    @f2.a
    public final Set<Scope> e() {
        return this.c;
    }
    
    @RecentlyNonNull
    @f2.a
    public final Set<Scope> f(@RecentlyNonNull final com.google.android.gms.common.api.a<?> a) {
        final b b = this.d.get(a);
        if (b != null && !b.a.isEmpty()) {
            final HashSet<Object> set = (HashSet<Object>)new HashSet<Scope>(this.b);
            set.addAll(b.a);
            return (Set<Scope>)set;
        }
        return this.b;
    }
    
    @RecentlyNonNull
    @f2.a
    public final int g() {
        return this.e;
    }
    
    @RecentlyNullable
    @f2.a
    public final String h() {
        return this.g;
    }
    
    @RecentlyNonNull
    @f2.a
    public final Set<Scope> i() {
        return this.b;
    }
    
    @RecentlyNullable
    @f2.a
    public final View j() {
        return this.f;
    }
    
    @RecentlyNonNull
    public final Map<com.google.android.gms.common.api.a<?>, b> k() {
        return this.d;
    }
    
    public final void l(@RecentlyNonNull final Integer k) {
        this.k = k;
    }
    
    @RecentlyNullable
    public final String m() {
        return this.h;
    }
    
    @RecentlyNonNull
    public final com.google.android.gms.signin.a n() {
        return this.i;
    }
    
    @RecentlyNullable
    public final Integer o() {
        return this.k;
    }
    
    @f2.a
    public static final class a
    {
        @h
        private Account a;
        private c<Scope> b;
        private int c;
        private String d;
        private String e;
        private com.google.android.gms.signin.a f;
        
        public a() {
            this.c = 0;
            this.f = com.google.android.gms.signin.a.P;
        }
        
        @RecentlyNonNull
        @f2.a
        public final g a() {
            return new g(this.a, this.b, null, 0, null, this.d, this.e, this.f, false);
        }
        
        @RecentlyNonNull
        @f2.a
        public final a b(@RecentlyNonNull final String d) {
            this.d = d;
            return this;
        }
        
        @RecentlyNonNull
        public final a c(@h final Account a) {
            this.a = a;
            return this;
        }
        
        @RecentlyNonNull
        public final a d(@RecentlyNonNull final String e) {
            this.e = e;
            return this;
        }
        
        @RecentlyNonNull
        public final a e(@RecentlyNonNull final Collection<Scope> collection) {
            if (this.b == null) {
                this.b = new c<Scope>();
            }
            this.b.addAll(collection);
            return this;
        }
    }
    
    public static final class b
    {
        public final Set<Scope> a;
        
        public b(final Set<Scope> s) {
            x.k(s);
            this.a = Collections.unmodifiableSet((Set<? extends Scope>)s);
        }
    }
}
