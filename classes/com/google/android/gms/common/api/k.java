// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.common.api.internal.f;
import android.os.Handler;
import android.app.Activity;
import com.google.android.gms.common.util.d0;
import com.google.android.gms.common.api.internal.a3;
import java.util.concurrent.locks.Lock;
import com.google.android.gms.common.api.internal.t0;
import java.util.concurrent.locks.ReentrantLock;
import com.google.android.gms.common.api.internal.h3;
import java.util.List;
import java.util.Collection;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.signin.b;
import java.util.HashSet;
import java.util.ArrayList;
import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.common.internal.g;
import android.view.View;
import androidx.annotation.k0;
import android.accounts.Account;
import com.google.android.gms.common.api.internal.w;
import android.os.Looper;
import android.content.Context;
import androidx.annotation.j0;
import com.google.android.gms.common.api.internal.e;
import java.util.concurrent.TimeUnit;
import com.google.android.gms.common.c;
import com.google.android.gms.common.api.internal.q2;
import androidx.fragment.app.d;
import com.google.android.gms.common.api.internal.n;
import java.util.Iterator;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;
import java.util.Set;
import androidx.annotation.RecentlyNonNull;
import f2.a;

@Deprecated
@f2.a
public abstract class k
{
    @RecentlyNonNull
    @f2.a
    public static final String a = "<<default account>>";
    @d6.a("sAllClients")
    private static final Set<k> b;
    @RecentlyNonNull
    public static final int c = 1;
    @RecentlyNonNull
    public static final int d = 2;
    
    static {
        b = Collections.newSetFromMap(new WeakHashMap<k, Boolean>());
    }
    
    public static void j(@RecentlyNonNull final String s, @RecentlyNonNull final FileDescriptor fileDescriptor, @RecentlyNonNull final PrintWriter printWriter, @RecentlyNonNull final String[] array) {
        final Set<k> b = k.b;
        // monitorenter(b)
        int x = 0;
        try {
            final String concat = String.valueOf(s).concat("  ");
            for (final k k : b) {
                printWriter.append(s).append("GoogleApiClient#").println(x);
                k.i(concat, fileDescriptor, printWriter, array);
                ++x;
            }
        }
        finally {
        }
        // monitorexit(b)
    }
    
    @RecentlyNonNull
    @f2.a
    public static Set<k> m() {
        final Set<k> b = k.b;
        synchronized (b) {
            return b;
        }
    }
    
    public abstract void A(@RecentlyNonNull final b p0);
    
    public abstract void B(@RecentlyNonNull final c p0);
    
    @RecentlyNonNull
    @f2.a
    public <L> n<L> C(@RecentlyNonNull final L l) {
        throw new UnsupportedOperationException();
    }
    
    public abstract void D(@RecentlyNonNull final d p0);
    
    public abstract void E(@RecentlyNonNull final b p0);
    
    public abstract void F(@RecentlyNonNull final c p0);
    
    public void H(final q2 q2) {
        throw new UnsupportedOperationException();
    }
    
    public void I(final q2 q2) {
        throw new UnsupportedOperationException();
    }
    
    @RecentlyNonNull
    public abstract com.google.android.gms.common.c c();
    
    @RecentlyNonNull
    public abstract com.google.android.gms.common.c d(@RecentlyNonNull final long p0, @RecentlyNonNull final TimeUnit p1);
    
    @RecentlyNonNull
    public abstract com.google.android.gms.common.api.n<Status> e();
    
    public abstract void f();
    
    public void g(@RecentlyNonNull final int n) {
        throw new UnsupportedOperationException();
    }
    
    public abstract void h();
    
    public abstract void i(@RecentlyNonNull final String p0, @RecentlyNonNull final FileDescriptor p1, @RecentlyNonNull final PrintWriter p2, @RecentlyNonNull final String[] p3);
    
    @RecentlyNonNull
    @f2.a
    public <A extends com.google.android.gms.common.api.a.b, R extends t, T extends e.a<R, A>> T k(@RecentlyNonNull final T t) {
        throw new UnsupportedOperationException();
    }
    
    @RecentlyNonNull
    @f2.a
    public <A extends com.google.android.gms.common.api.a.b, T extends e.a<? extends t, A>> T l(@RecentlyNonNull final T t) {
        throw new UnsupportedOperationException();
    }
    
    @j0
    @f2.a
    public <C extends com.google.android.gms.common.api.a.f> C n(@RecentlyNonNull final com.google.android.gms.common.api.a.c<C> c) {
        throw new UnsupportedOperationException();
    }
    
    @j0
    public abstract com.google.android.gms.common.c o(@RecentlyNonNull final com.google.android.gms.common.api.a<?> p0);
    
    @RecentlyNonNull
    @f2.a
    public Context p() {
        throw new UnsupportedOperationException();
    }
    
    @RecentlyNonNull
    @f2.a
    public Looper q() {
        throw new UnsupportedOperationException();
    }
    
    @RecentlyNonNull
    @f2.a
    public boolean r(@RecentlyNonNull final com.google.android.gms.common.api.a<?> a) {
        throw new UnsupportedOperationException();
    }
    
    @RecentlyNonNull
    public abstract boolean s(@RecentlyNonNull final com.google.android.gms.common.api.a<?> p0);
    
    @RecentlyNonNull
    public abstract boolean t();
    
    @RecentlyNonNull
    public abstract boolean u();
    
    @RecentlyNonNull
    public abstract boolean v(@RecentlyNonNull final b p0);
    
    @RecentlyNonNull
    public abstract boolean w(@RecentlyNonNull final c p0);
    
    @RecentlyNonNull
    @f2.a
    public boolean x(@RecentlyNonNull final w w) {
        throw new UnsupportedOperationException();
    }
    
    @f2.a
    public void y() {
        throw new UnsupportedOperationException();
    }
    
    public abstract void z();
    
    @Deprecated
    @f2.a
    public static final class a
    {
        @k0
        private Account a;
        private final Set<Scope> b;
        private final Set<Scope> c;
        private int d;
        private View e;
        private String f;
        private String g;
        private final Map<com.google.android.gms.common.api.a<?>, g.b> h;
        private boolean i;
        private final Context j;
        private final Map<com.google.android.gms.common.api.a<?>, com.google.android.gms.common.api.a.d> k;
        private l l;
        private int m;
        @k0
        private c n;
        private Looper o;
        private com.google.android.gms.common.g p;
        private com.google.android.gms.common.api.a.a<? extends com.google.android.gms.signin.e, com.google.android.gms.signin.a> q;
        private final ArrayList<b> r;
        private final ArrayList<c> s;
        
        @f2.a
        public a(@RecentlyNonNull final Context j) {
            this.b = new HashSet<Scope>();
            this.c = new HashSet<Scope>();
            this.h = new androidx.collection.a<com.google.android.gms.common.api.a<?>, g.b>();
            this.i = false;
            this.k = new androidx.collection.a<com.google.android.gms.common.api.a<?>, com.google.android.gms.common.api.a.d>();
            this.m = -1;
            this.p = com.google.android.gms.common.g.y();
            this.q = com.google.android.gms.signin.b.c;
            this.r = new ArrayList<b>();
            this.s = new ArrayList<c>();
            this.j = j;
            this.o = j.getMainLooper();
            this.f = j.getPackageName();
            this.g = j.getClass().getName();
        }
        
        @f2.a
        public a(@RecentlyNonNull final Context context, @RecentlyNonNull final b e, @RecentlyNonNull final c e2) {
            this(context);
            x.l(e, "Must provide a connected listener");
            this.r.add(e);
            x.l(e2, "Must provide a connection failed listener");
            this.s.add(e2);
        }
        
        private final <O extends com.google.android.gms.common.api.a.d> void r(final com.google.android.gms.common.api.a<O> a, @k0 final O o, final Scope... array) {
            final HashSet<Scope> set = new HashSet<Scope>(x.l(a.a(), "Base client builder must not be null").a(o));
            for (int length = array.length, i = 0; i < length; ++i) {
                set.add(array[i]);
            }
            this.h.put(a, new g.b(set));
        }
        
        @RecentlyNonNull
        public final a a(@RecentlyNonNull final com.google.android.gms.common.api.a<? extends com.google.android.gms.common.api.a.d.e> a) {
            x.l(a, "Api must not be null");
            this.k.put(a, null);
            final List<Scope> a2 = x.l(a.a(), "Base client builder must not be null").a((com.google.android.gms.common.api.a.d.e)null);
            this.c.addAll(a2);
            this.b.addAll(a2);
            return this;
        }
        
        @RecentlyNonNull
        public final <O extends com.google.android.gms.common.api.a.d.c> a b(@RecentlyNonNull final com.google.android.gms.common.api.a<O> a, @RecentlyNonNull final O o) {
            x.l(a, "Api must not be null");
            x.l(o, "Null options are not permitted for this Api");
            this.k.put(a, (com.google.android.gms.common.api.a.d)o);
            final List<Scope> a2 = x.l(a.a(), "Base client builder must not be null").a(o);
            this.c.addAll(a2);
            this.b.addAll(a2);
            return this;
        }
        
        @RecentlyNonNull
        public final <O extends com.google.android.gms.common.api.a.d.c> a c(@RecentlyNonNull final com.google.android.gms.common.api.a<O> a, @RecentlyNonNull final O o, @RecentlyNonNull final Scope... array) {
            x.l(a, "Api must not be null");
            x.l(o, "Null options are not permitted for this Api");
            this.k.put(a, (com.google.android.gms.common.api.a.d)o);
            this.r(a, o, array);
            return this;
        }
        
        @RecentlyNonNull
        public final <T extends com.google.android.gms.common.api.a.d.e> a d(@RecentlyNonNull final com.google.android.gms.common.api.a<? extends com.google.android.gms.common.api.a.d.e> a, @RecentlyNonNull final Scope... array) {
            x.l(a, "Api must not be null");
            this.k.put(a, null);
            this.r((com.google.android.gms.common.api.a<com.google.android.gms.common.api.a.d>)a, null, array);
            return this;
        }
        
        @RecentlyNonNull
        public final a e(@RecentlyNonNull final b e) {
            x.l(e, "Listener must not be null");
            this.r.add(e);
            return this;
        }
        
        @RecentlyNonNull
        public final a f(@RecentlyNonNull final c e) {
            x.l(e, "Listener must not be null");
            this.s.add(e);
            return this;
        }
        
        @RecentlyNonNull
        public final a g(@RecentlyNonNull final Scope scope) {
            x.l(scope, "Scope must not be null");
            this.b.add(scope);
            return this;
        }
        
        @RecentlyNonNull
        @f2.a
        public final a h(@RecentlyNonNull final String[] array) {
            for (int i = 0; i < array.length; ++i) {
                this.b.add(new Scope(array[i]));
            }
            return this;
        }
        
        @RecentlyNonNull
        public final k i() {
            x.b(this.k.isEmpty() ^ true, "must call addApi() to add at least one API");
            final g j = this.j();
            com.google.android.gms.common.api.a<?> a = null;
            final Map<com.google.android.gms.common.api.a<?>, g.b> k = j.k();
            final androidx.collection.a<com.google.android.gms.common.api.a<?>, Boolean> a2 = new androidx.collection.a<com.google.android.gms.common.api.a<?>, Boolean>();
            final androidx.collection.a<com.google.android.gms.common.api.a.c<?>, com.google.android.gms.common.api.a.f> a3 = new androidx.collection.a<com.google.android.gms.common.api.a.c<?>, com.google.android.gms.common.api.a.f>();
            final ArrayList<h3> list = new ArrayList<h3>();
            final Iterator<com.google.android.gms.common.api.a<?>> iterator = this.k.keySet().iterator();
            int n = 0;
            while (iterator.hasNext()) {
                final com.google.android.gms.common.api.a<?> a4 = iterator.next();
                final com.google.android.gms.common.api.a.d value = this.k.get(a4);
                final boolean b = k.get(a4) != null;
                a2.put(a4, b);
                final h3 e = new h3(a4, b);
                list.add(e);
                final com.google.android.gms.common.api.a.a<?, ?> a5 = x.k(a4.b());
                final Object c = a5.c(this.j, this.o, j, value, e, e);
                a3.put(a4.c(), (com.google.android.gms.common.api.a.f)c);
                int n2 = n;
                if (a5.b() == 1) {
                    if (value != null) {
                        n2 = 1;
                    }
                    else {
                        n2 = 0;
                    }
                }
                n = n2;
                if (((com.google.android.gms.common.api.a.f)c).g()) {
                    if (a != null) {
                        final String d = a4.d();
                        final String d2 = a.d();
                        final StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 21 + String.valueOf(d2).length());
                        sb.append(d);
                        sb.append(" cannot be used with ");
                        sb.append(d2);
                        throw new IllegalStateException(sb.toString());
                    }
                    a = a4;
                    n = n2;
                }
            }
            if (a != null) {
                if (n != 0) {
                    final String d3 = a.d();
                    final StringBuilder sb2 = new StringBuilder(String.valueOf(d3).length() + 82);
                    sb2.append("With using ");
                    sb2.append(d3);
                    sb2.append(", GamesOptions can only be specified within GoogleSignInOptions.Builder");
                    throw new IllegalStateException(sb2.toString());
                }
                x.s(this.a == null, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", a.d());
                x.s(this.b.equals(this.c), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", a.d());
            }
            final t0 t0 = new t0(this.j, new ReentrantLock(), this.o, j, this.p, this.q, a2, this.r, this.s, a3, this.m, com.google.android.gms.common.api.internal.t0.K((Iterable<com.google.android.gms.common.api.a.f>)a3.values(), true), list);
            synchronized (com.google.android.gms.common.api.k.b) {
                com.google.android.gms.common.api.k.b.add(t0);
                // monitorexit(k.G())
                if (this.m >= 0) {
                    com.google.android.gms.common.api.internal.a3.r(this.l).t(this.m, t0, this.n);
                }
                return t0;
            }
        }
        
        @RecentlyNonNull
        @d0
        @f2.a
        public final g j() {
            com.google.android.gms.signin.a p = com.google.android.gms.signin.a.P;
            final Map<com.google.android.gms.common.api.a<?>, com.google.android.gms.common.api.a.d> k = this.k;
            final com.google.android.gms.common.api.a<com.google.android.gms.signin.a> g = com.google.android.gms.signin.b.g;
            if (k.containsKey(g)) {
                p = (com.google.android.gms.signin.a)this.k.get(g);
            }
            return new g(this.a, this.b, this.h, this.d, this.e, this.f, this.g, p, false);
        }
        
        @RecentlyNonNull
        public final a k(@RecentlyNonNull final d d, @RecentlyNonNull final int m, @k0 final c n) {
            final l l = new l(d);
            x.b(m >= 0, "clientId must be non-negative");
            this.m = m;
            this.n = n;
            this.l = l;
            return this;
        }
        
        @RecentlyNonNull
        public final a l(@RecentlyNonNull final d d, @k0 final c c) {
            return this.k(d, 0, c);
        }
        
        @RecentlyNonNull
        public final a m(@RecentlyNonNull final String s) {
            Account a;
            if (s == null) {
                a = null;
            }
            else {
                a = new Account(s, "com.google");
            }
            this.a = a;
            return this;
        }
        
        @RecentlyNonNull
        public final a n(@RecentlyNonNull final int d) {
            this.d = d;
            return this;
        }
        
        @RecentlyNonNull
        public final a o(@RecentlyNonNull final Handler handler) {
            x.l(handler, "Handler must not be null");
            this.o = handler.getLooper();
            return this;
        }
        
        @RecentlyNonNull
        public final a p(@RecentlyNonNull final View e) {
            x.l(e, "View must not be null");
            this.e = e;
            return this;
        }
        
        @RecentlyNonNull
        public final a q() {
            return this.m("<<default account>>");
        }
    }
    
    @Deprecated
    public interface b extends f
    {
        @RecentlyNonNull
        public static final int c = 1;
        @RecentlyNonNull
        public static final int d = 2;
    }
    
    @Deprecated
    public interface c extends q
    {
    }
}
