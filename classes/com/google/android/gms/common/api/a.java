// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api;

import android.os.IBinder;
import android.content.Intent;
import androidx.annotation.RecentlyNullable;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.p;
import androidx.annotation.j0;
import java.util.Set;
import java.util.Collections;
import java.util.List;
import androidx.annotation.k0;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import android.accounts.Account;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.internal.g;
import android.os.Looper;
import android.content.Context;
import com.google.android.gms.common.util.d0;
import com.google.android.gms.common.internal.x;
import androidx.annotation.RecentlyNonNull;

public final class a<O extends d>
{
    private final a<?, O> a;
    private final g<?> b;
    private final String c;
    
    @a
    public <C extends f> a(@RecentlyNonNull final String c, @RecentlyNonNull final a<C, O> a, @RecentlyNonNull final g<C> b) {
        x.l(a, "Cannot construct an Api with a null ClientBuilder");
        x.l(b, "Cannot construct an Api with a null ClientKey");
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @RecentlyNonNull
    public final e<?, O> a() {
        return (e<?, O>)this.a;
    }
    
    @RecentlyNonNull
    public final a<?, O> b() {
        return this.a;
    }
    
    @RecentlyNonNull
    public final c<?> c() {
        return (c<?>)this.b;
    }
    
    @RecentlyNonNull
    public final String d() {
        return this.c;
    }
    
    @d0
    @f2.a
    public static class a<T extends com.google.android.gms.common.api.a.f, O> extends com.google.android.gms.common.api.a.e<T, O>
    {
        @Deprecated
        @RecentlyNonNull
        @f2.a
        public T c(@RecentlyNonNull final Context context, @RecentlyNonNull final Looper looper, @RecentlyNonNull final com.google.android.gms.common.internal.g g, @RecentlyNonNull final O o, @RecentlyNonNull final k.b b, @RecentlyNonNull final k.c c) {
            return this.d(context, looper, g, o, b, c);
        }
        
        @RecentlyNonNull
        @f2.a
        public T d(@RecentlyNonNull final Context context, @RecentlyNonNull final Looper looper, @RecentlyNonNull final com.google.android.gms.common.internal.g g, @RecentlyNonNull final O o, @RecentlyNonNull final f f, @RecentlyNonNull final q q) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }
    
    @a
    public interface b
    {
    }
    
    @a
    public static class c<C extends b>
    {
    }
    
    public interface d
    {
        @RecentlyNonNull
        public static final com.google.android.gms.common.api.a.d.d e = new com.google.android.gms.common.api.a.d.d(null);
        
        public interface a extends c, e
        {
            @RecentlyNonNull
            Account K();
        }
        
        public interface b extends c
        {
            @RecentlyNonNull
            GoogleSignInAccount o();
        }
        
        public interface c extends com.google.android.gms.common.api.a.d
        {
        }
        
        public static final class d implements e
        {
            private d() {
            }
        }
        
        public interface e extends com.google.android.gms.common.api.a.d
        {
        }
        
        public interface f extends c, e
        {
        }
    }
    
    @d0
    @a
    public static class e<T extends b, O>
    {
        @RecentlyNonNull
        @a
        public static final int a = 1;
        @RecentlyNonNull
        @a
        public static final int b = 2;
        @RecentlyNonNull
        @a
        public static final int c = Integer.MAX_VALUE;
        
        @RecentlyNonNull
        @a
        public List<Scope> a(@k0 final O o) {
            return Collections.emptyList();
        }
        
        @RecentlyNonNull
        @a
        public int b() {
            return Integer.MAX_VALUE;
        }
    }
    
    @a
    public interface f extends b
    {
        @RecentlyNonNull
        @a
        boolean a();
        
        @RecentlyNonNull
        @a
        boolean c();
        
        @a
        void d();
        
        @RecentlyNonNull
        @a
        boolean g();
        
        @j0
        @a
        Set<Scope> h();
        
        @a
        void i(@k0 final p p0, @k0 final Set<Scope> p1);
        
        @a
        void j(@RecentlyNonNull final String p0);
        
        @RecentlyNonNull
        @a
        boolean l();
        
        @RecentlyNonNull
        @a
        String m();
        
        @a
        void n(@RecentlyNonNull final e.c p0);
        
        @a
        void o(@RecentlyNonNull final e.e p0);
        
        @RecentlyNonNull
        @a
        com.google.android.gms.common.e[] p();
        
        @a
        void q(@RecentlyNonNull final String p0, @k0 final FileDescriptor p1, @RecentlyNonNull final PrintWriter p2, @k0 final String[] p3);
        
        @RecentlyNonNull
        @a
        boolean r();
        
        @RecentlyNonNull
        @a
        int s();
        
        @RecentlyNonNull
        @a
        com.google.android.gms.common.e[] t();
        
        @RecentlyNullable
        @a
        String u();
        
        @RecentlyNonNull
        @a
        Intent v();
        
        @RecentlyNonNull
        @a
        boolean w();
        
        @RecentlyNullable
        @a
        IBinder x();
    }
    
    @d0
    @a
    public static final class g<C extends f> extends c<C>
    {
    }
}
