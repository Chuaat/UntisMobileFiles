// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.b;
import com.google.android.gms.common.api.internal.h2;
import android.os.Handler;
import androidx.annotation.c1;
import com.google.android.gms.common.api.internal.o;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.common.api.internal.c0;
import java.util.Set;
import android.accounts.Account;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.Collections;
import java.util.Collection;
import com.google.android.gms.common.internal.g;
import java.lang.reflect.InvocationTargetException;
import com.google.android.gms.common.util.v;
import com.google.android.gms.tasks.n;
import com.google.android.gms.tasks.m;
import com.google.android.gms.common.api.internal.a0;
import com.google.android.gms.common.api.internal.e;
import androidx.annotation.j0;
import androidx.annotation.g0;
import com.google.android.gms.common.api.internal.p3;
import com.google.android.gms.common.api.internal.p1;
import com.google.android.gms.common.internal.x;
import androidx.annotation.RecentlyNonNull;
import android.app.Activity;
import com.google.android.gms.common.api.internal.i;
import com.google.android.gms.common.api.internal.y;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import android.os.Looper;
import com.google.android.gms.common.api.internal.c;
import androidx.annotation.k0;
import android.content.Context;

@f2.a
public class j<O extends com.google.android.gms.common.api.a.d> implements l<O>
{
    private final Context a;
    @k0
    private final String b;
    private final com.google.android.gms.common.api.a<O> c;
    private final O d;
    private final c<O> e;
    private final Looper f;
    private final int g;
    @NotOnlyInitialized
    private final k h;
    private final y i;
    private final i j;
    
    @Deprecated
    @f2.a
    public j(@RecentlyNonNull final Activity activity, @RecentlyNonNull final com.google.android.gms.common.api.a<O> a, @RecentlyNonNull final O o, @RecentlyNonNull final y y) {
        this(activity, (com.google.android.gms.common.api.a<com.google.android.gms.common.api.a.d>)a, o, new a.a().c(y).b(activity.getMainLooper()).a());
    }
    
    @g0
    @f2.a
    public j(@RecentlyNonNull final Activity activity, @RecentlyNonNull final com.google.android.gms.common.api.a<O> c, @RecentlyNonNull final O d, @RecentlyNonNull final a a) {
        x.l(activity, "Null activity is not permitted.");
        x.l(c, "Api must not be null.");
        x.l(a, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        final Context applicationContext = activity.getApplicationContext();
        this.a = applicationContext;
        this.b = z(activity);
        this.c = c;
        this.d = d;
        this.f = a.b;
        final c<O> c2 = com.google.android.gms.common.api.internal.c.c(c, d);
        this.e = c2;
        this.h = new p1<Object>(this);
        final i e = com.google.android.gms.common.api.internal.i.e(applicationContext);
        this.j = e;
        this.g = e.n();
        this.i = a.a;
        if (!(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            p3.r(activity, e, c2);
        }
        e.i(this);
    }
    
    @Deprecated
    @f2.a
    public j(@RecentlyNonNull final Context context, @RecentlyNonNull final com.google.android.gms.common.api.a<O> a, @RecentlyNonNull final O o, @RecentlyNonNull final Looper looper, @RecentlyNonNull final y y) {
        this(context, (com.google.android.gms.common.api.a<com.google.android.gms.common.api.a.d>)a, o, new a.a().b(looper).c(y).a());
    }
    
    @Deprecated
    @f2.a
    public j(@RecentlyNonNull final Context context, @RecentlyNonNull final com.google.android.gms.common.api.a<O> a, @RecentlyNonNull final O o, @RecentlyNonNull final y y) {
        this(context, (com.google.android.gms.common.api.a<com.google.android.gms.common.api.a.d>)a, o, new a.a().c(y).a());
    }
    
    @f2.a
    public j(@RecentlyNonNull final Context context, @RecentlyNonNull final com.google.android.gms.common.api.a<O> c, @RecentlyNonNull final O d, @RecentlyNonNull final a a) {
        x.l(context, "Null context is not permitted.");
        x.l(c, "Api must not be null.");
        x.l(a, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        final Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = z(context);
        this.c = c;
        this.d = d;
        this.f = a.b;
        this.e = com.google.android.gms.common.api.internal.c.c(c, d);
        this.h = new p1<Object>(this);
        final i e = com.google.android.gms.common.api.internal.i.e(applicationContext);
        this.j = e;
        this.g = e.n();
        this.i = a.a;
        e.i(this);
    }
    
    private final <A extends com.google.android.gms.common.api.a.b, T extends e.a<? extends t, A>> T w(final int n, @j0 final T t) {
        t.v();
        this.j.j((j<com.google.android.gms.common.api.a.d>)this, n, (e.a<? extends t, com.google.android.gms.common.api.a.b>)t);
        return t;
    }
    
    private final <TResult, A extends com.google.android.gms.common.api.a.b> m<TResult> y(final int n, @j0 final a0<A, TResult> a0) {
        final n<TResult> n2 = new n<TResult>();
        this.j.k((j<com.google.android.gms.common.api.a.d>)this, n, (a0<com.google.android.gms.common.api.a.b, TResult>)a0, n2, this.i);
        return n2.a();
    }
    
    @k0
    private static String z(final Object obj) {
        Label_0031: {
            if (!v.q()) {
                break Label_0031;
            }
            try {
                return (String)Context.class.getMethod("getAttributionTag", (Class<?>[])new Class[0]).invoke(obj, new Object[0]);
                return null;
            }
            catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException ex) {
                return null;
            }
        }
    }
    
    @RecentlyNonNull
    @Override
    public c<O> b() {
        return this.e;
    }
    
    @RecentlyNonNull
    @f2.a
    public k c() {
        return this.h;
    }
    
    @RecentlyNonNull
    @f2.a
    protected g.a d() {
        final g.a a = new g.a();
        final com.google.android.gms.common.api.a.d d = this.d;
        Account account = null;
        Label_0069: {
            if (d instanceof com.google.android.gms.common.api.a.d.b) {
                final GoogleSignInAccount o = ((com.google.android.gms.common.api.a.d.b)d).o();
                if (o != null) {
                    account = o.K();
                    break Label_0069;
                }
            }
            final com.google.android.gms.common.api.a.d d2 = this.d;
            if (d2 instanceof com.google.android.gms.common.api.a.d.a) {
                account = ((com.google.android.gms.common.api.a.d.a)d2).K();
            }
            else {
                account = null;
            }
        }
        final g.a c = a.c(account);
        final com.google.android.gms.common.api.a.d d3 = this.d;
        if (d3 instanceof com.google.android.gms.common.api.a.d.b) {
            final GoogleSignInAccount o2 = ((com.google.android.gms.common.api.a.d.b)d3).o();
            if (o2 != null) {
                final Set<Scope> set = o2.U3();
                return c.e(set).d(this.a.getClass().getName()).b(this.a.getPackageName());
            }
        }
        final Set<Scope> set = Collections.emptySet();
        return c.e(set).d(this.a.getClass().getName()).b(this.a.getPackageName());
    }
    
    @RecentlyNonNull
    @f2.a
    protected m<Boolean> e() {
        return this.j.q(this);
    }
    
    @RecentlyNonNull
    @f2.a
    public <A extends com.google.android.gms.common.api.a.b, T extends e.a<? extends t, A>> T f(@RecentlyNonNull final T t) {
        return this.w(2, t);
    }
    
    @RecentlyNonNull
    @f2.a
    public <TResult, A extends com.google.android.gms.common.api.a.b> m<TResult> g(@RecentlyNonNull final a0<A, TResult> a0) {
        return this.y(2, a0);
    }
    
    @RecentlyNonNull
    @f2.a
    public <A extends com.google.android.gms.common.api.a.b, T extends e.a<? extends t, A>> T h(@RecentlyNonNull final T t) {
        return this.w(0, t);
    }
    
    @RecentlyNonNull
    @f2.a
    public <TResult, A extends com.google.android.gms.common.api.a.b> m<TResult> i(@RecentlyNonNull final a0<A, TResult> a0) {
        return this.y(0, a0);
    }
    
    @Deprecated
    @RecentlyNonNull
    @f2.a
    public <A extends com.google.android.gms.common.api.a.b, T extends com.google.android.gms.common.api.internal.t<A, ?>, U extends c0<A, ?>> m<Void> j(@RecentlyNonNull final T t, @RecentlyNonNull final U u) {
        x.k(t);
        x.k(u);
        x.l(((com.google.android.gms.common.api.internal.t<A, ?>)t).b(), "Listener has already been released.");
        x.l(((c0<A, ?>)u).a(), "Listener has already been released.");
        x.b(com.google.android.gms.common.internal.v.b(t.b(), u.a()), "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
        return this.j.g((j<com.google.android.gms.common.api.a.d>)this, (com.google.android.gms.common.api.internal.t<com.google.android.gms.common.api.a.b, ?>)t, (c0<com.google.android.gms.common.api.a.b, ?>)u, com.google.android.gms.common.api.c0.G);
    }
    
    @RecentlyNonNull
    @f2.a
    public <A extends com.google.android.gms.common.api.a.b> m<Void> k(@RecentlyNonNull final u<A, ?> u) {
        x.k(u);
        x.l(u.a.b(), "Listener has already been released.");
        x.l(u.b.a(), "Listener has already been released.");
        return this.j.g((j<com.google.android.gms.common.api.a.d>)this, (com.google.android.gms.common.api.internal.t<com.google.android.gms.common.api.a.b, ?>)u.a, (c0<com.google.android.gms.common.api.a.b, ?>)u.b, u.c);
    }
    
    @RecentlyNonNull
    @f2.a
    public m<Boolean> l(@RecentlyNonNull final com.google.android.gms.common.api.internal.n.a<?> a) {
        x.l(a, "Listener key cannot be null.");
        return this.j.f((j<com.google.android.gms.common.api.a.d>)this, a);
    }
    
    @RecentlyNonNull
    @f2.a
    public <A extends com.google.android.gms.common.api.a.b, T extends e.a<? extends t, A>> T m(@RecentlyNonNull final T t) {
        return this.w(1, t);
    }
    
    @RecentlyNonNull
    @f2.a
    public <TResult, A extends com.google.android.gms.common.api.a.b> m<TResult> n(@RecentlyNonNull final a0<A, TResult> a0) {
        return this.y(1, a0);
    }
    
    @RecentlyNonNull
    @f2.a
    public O o() {
        return this.d;
    }
    
    @RecentlyNonNull
    @f2.a
    public Context p() {
        return this.a;
    }
    
    @RecentlyNullable
    @f2.a
    protected String q() {
        return this.b;
    }
    
    @Deprecated
    @RecentlyNullable
    @f2.a
    protected String r() {
        return this.b;
    }
    
    @RecentlyNonNull
    @f2.a
    public Looper s() {
        return this.f;
    }
    
    @RecentlyNonNull
    @f2.a
    public <L> com.google.android.gms.common.api.internal.n<L> t(@RecentlyNonNull final L l, @RecentlyNonNull final String s) {
        return o.a(l, this.f, s);
    }
    
    @RecentlyNonNull
    public final int u() {
        return this.g;
    }
    
    @c1
    public final com.google.android.gms.common.api.a.f v(final Looper looper, final i.a<O> a) {
        return (com.google.android.gms.common.api.a.f)x.k(this.c.b()).c(this.a, looper, this.d().a(), this.d, a, a);
    }
    
    public final h2 x(final Context context, final Handler handler) {
        return new h2(context, handler, this.d().a());
    }
    
    @f2.a
    public static class a
    {
        @RecentlyNonNull
        @f2.a
        public static final j.a c;
        @RecentlyNonNull
        public final y a;
        @RecentlyNonNull
        public final Looper b;
        
        static {
            c = new j.a.a().a();
        }
        
        @f2.a
        private a(final y a, final Account account, final Looper b) {
            this.a = a;
            this.b = b;
        }
        
        @f2.a
        public static class a
        {
            private y a;
            private Looper b;
            
            @f2.a
            public a() {
            }
            
            @RecentlyNonNull
            @f2.a
            public j.a a() {
                if (this.a == null) {
                    this.a = new b();
                }
                if (this.b == null) {
                    this.b = Looper.getMainLooper();
                }
                return new j.a(this.a, null, this.b, null);
            }
            
            @RecentlyNonNull
            @f2.a
            public a b(@RecentlyNonNull final Looper b) {
                x.l(b, "Looper must not be null.");
                this.b = b;
                return this;
            }
            
            @RecentlyNonNull
            @f2.a
            public a c(@RecentlyNonNull final y a) {
                x.l(a, "StatusExceptionMapper must not be null.");
                this.a = a;
                return this;
            }
        }
    }
}
