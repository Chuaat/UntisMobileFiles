// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Scope;
import android.os.Bundle;
import com.google.android.gms.common.internal.v;
import android.app.PendingIntent;
import com.google.android.gms.common.util.b;
import android.os.RemoteException;
import android.os.DeadObjectException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import com.google.android.gms.common.api.k;
import java.util.Collection;
import androidx.annotation.j0;
import java.util.Iterator;
import android.app.Application;
import android.util.Log;
import android.os.Message;
import com.google.android.gms.tasks.m;
import androidx.annotation.c1;
import com.google.android.gms.common.api.j;
import android.os.HandlerThread;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.common.util.l;
import com.google.android.gms.common.h;
import com.google.android.gms.internal.base.p;
import java.util.concurrent.ConcurrentHashMap;
import android.os.Looper;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import android.os.Handler;
import java.util.Set;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import com.google.android.gms.common.internal.n0;
import com.google.android.gms.common.g;
import android.content.Context;
import androidx.annotation.k0;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Status;
import f2.a;
import android.os.Handler$Callback;

@f2.a
public class i implements Handler$Callback
{
    @RecentlyNonNull
    public static final Status q;
    private static final Status r;
    private static final Object s;
    @k0
    @d6.a("lock")
    private static i t;
    private long c;
    private long d;
    private long e;
    private final Context f;
    private final g g;
    private final n0 h;
    private final AtomicInteger i;
    private final AtomicInteger j;
    private final Map<com.google.android.gms.common.api.internal.c<?>, a<?>> k;
    @k0
    @d6.a("lock")
    private p3 l;
    @d6.a("lock")
    private final Set<com.google.android.gms.common.api.internal.c<?>> m;
    private final Set<com.google.android.gms.common.api.internal.c<?>> n;
    @NotOnlyInitialized
    private final Handler o;
    private volatile boolean p;
    
    static {
        q = new Status(4, "Sign-out occurred while this API call was in progress.");
        r = new Status(4, "The user must be signed in to make this API call.");
        s = new Object();
    }
    
    @f2.a
    private i(final Context f, final Looper looper, final g g) {
        this.c = 5000L;
        this.d = 120000L;
        this.e = 10000L;
        this.i = new AtomicInteger(1);
        this.j = new AtomicInteger(0);
        this.k = new ConcurrentHashMap<com.google.android.gms.common.api.internal.c<?>, a<?>>(5, 0.75f, 1);
        this.l = null;
        this.m = new androidx.collection.c<com.google.android.gms.common.api.internal.c<?>>();
        this.n = new androidx.collection.c<com.google.android.gms.common.api.internal.c<?>>();
        this.p = true;
        this.f = f;
        final p o = new p(looper, (Handler$Callback)this);
        this.o = o;
        this.g = g;
        this.h = new n0(g);
        if (com.google.android.gms.common.util.l.a(f)) {
            this.p = false;
        }
        o.sendMessage(o.obtainMessage(6));
    }
    
    @f2.a
    public static void a() {
        synchronized (i.s) {
            final i t = i.t;
            if (t != null) {
                t.j.incrementAndGet();
                final Handler o = t.o;
                o.sendMessageAtFrontOfQueue(o.obtainMessage(10));
            }
        }
    }
    
    @RecentlyNonNull
    public static i d() {
        synchronized (i.s) {
            x.l(i.t, "Must guarantee manager is non-null before using getInstance");
            return i.t;
        }
    }
    
    @RecentlyNonNull
    public static i e(@RecentlyNonNull final Context context) {
        synchronized (i.s) {
            if (i.t == null) {
                final HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                i.t = new i(context.getApplicationContext(), handlerThread.getLooper(), g.y());
            }
            return i.t;
        }
    }
    
    private static Status p(final com.google.android.gms.common.api.internal.c<?> c, final com.google.android.gms.common.c obj) {
        final String a = c.a();
        final String value = String.valueOf(obj);
        final StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 63 + value.length());
        sb.append("API: ");
        sb.append(a);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(value);
        return new Status(obj, sb.toString());
    }
    
    @c1
    private final a<?> u(final j<?> j) {
        final com.google.android.gms.common.api.internal.c<O> b = j.b();
        a<?> a;
        if ((a = this.k.get(b)) == null) {
            a = new a<Object>(j);
            this.k.put(b, a);
        }
        if (a.J()) {
            this.n.add(b);
        }
        a.G();
        return a;
    }
    
    @RecentlyNonNull
    public final <O extends com.google.android.gms.common.api.a.d> m<Boolean> f(@RecentlyNonNull final j<O> j, @RecentlyNonNull final n.a<?> a) {
        final com.google.android.gms.tasks.n<Boolean> n = new com.google.android.gms.tasks.n<Boolean>();
        final z2 z2 = new z2(a, n);
        final Handler o = this.o;
        o.sendMessage(o.obtainMessage(13, (Object)new w1(z2, this.j.get(), j)));
        return n.a();
    }
    
    @RecentlyNonNull
    public final <O extends com.google.android.gms.common.api.a.d> m<Void> g(@RecentlyNonNull final j<O> j, @RecentlyNonNull final t<com.google.android.gms.common.api.a.b, ?> t, @RecentlyNonNull final c0<com.google.android.gms.common.api.a.b, ?> c0, @RecentlyNonNull final Runnable runnable) {
        final com.google.android.gms.tasks.n<Void> n = new com.google.android.gms.tasks.n<Void>();
        final y2 y2 = new y2(new x1(t, c0, runnable), n);
        final Handler o = this.o;
        o.sendMessage(o.obtainMessage(8, (Object)new w1(y2, this.j.get(), j)));
        return n.a();
    }
    
    @RecentlyNonNull
    public final m<Map<com.google.android.gms.common.api.internal.c<?>, String>> h(@RecentlyNonNull final Iterable<? extends com.google.android.gms.common.api.l<?>> iterable) {
        final b3 b3 = new b3(iterable);
        final Handler o = this.o;
        o.sendMessage(o.obtainMessage(2, (Object)b3));
        return b3.c();
    }
    
    @RecentlyNonNull
    @c1
    public boolean handleMessage(@RecentlyNonNull final Message message) {
        final int what = message.what;
        long e = 300000L;
        final a<com.google.android.gms.common.api.a.d> a = null;
        switch (what) {
            default: {
                final StringBuilder sb = new StringBuilder(31);
                sb.append("Unknown message id: ");
                sb.append(what);
                Log.w("GoogleApiManager", sb.toString());
                return false;
            }
            case 16: {
                final b b = (b)message.obj;
                if (this.k.containsKey(b.a)) {
                    ((a<com.google.android.gms.common.api.a.d>)this.k.get(b.a)).t(b);
                    break;
                }
                break;
            }
            case 15: {
                final b b2 = (b)message.obj;
                if (this.k.containsKey(b2.a)) {
                    ((a<com.google.android.gms.common.api.a.d>)this.k.get(b2.a)).l(b2);
                    break;
                }
                break;
            }
            case 14: {
                final e0 e2 = (e0)message.obj;
                final com.google.android.gms.common.api.internal.c<?> a2 = e2.a();
                com.google.android.gms.tasks.n<Boolean> n;
                Boolean b3;
                if (!this.k.containsKey(a2)) {
                    n = e2.b();
                    b3 = Boolean.FALSE;
                }
                else {
                    final boolean o = com.google.android.gms.common.api.internal.i.a.o((a<com.google.android.gms.common.api.a.d>)this.k.get(a2), false);
                    n = e2.b();
                    b3 = o;
                }
                n.c(b3);
                break;
            }
            case 12: {
                if (this.k.containsKey(message.obj)) {
                    this.k.get(message.obj).F();
                    break;
                }
                break;
            }
            case 11: {
                if (this.k.containsKey(message.obj)) {
                    this.k.get(message.obj).E();
                    break;
                }
                break;
            }
            case 10: {
                final Iterator<com.google.android.gms.common.api.internal.c<?>> iterator = this.n.iterator();
                while (iterator.hasNext()) {
                    final a<?> a3 = this.k.remove(iterator.next());
                    if (a3 != null) {
                        a3.c();
                    }
                }
                this.n.clear();
                break;
            }
            case 9: {
                if (this.k.containsKey(message.obj)) {
                    this.k.get(message.obj).D();
                    break;
                }
                break;
            }
            case 7: {
                this.u((j<?>)message.obj);
                break;
            }
            case 6: {
                if (!(this.f.getApplicationContext() instanceof Application)) {
                    break;
                }
                com.google.android.gms.common.api.internal.d.c((Application)this.f.getApplicationContext());
                com.google.android.gms.common.api.internal.d.b().a((d.a)new h1(this));
                if (!com.google.android.gms.common.api.internal.d.b().e(true)) {
                    this.e = 300000L;
                    break;
                }
                break;
            }
            case 5: {
                final int arg1 = message.arg1;
                final com.google.android.gms.common.c c = (com.google.android.gms.common.c)message.obj;
                final Iterator<a<com.google.android.gms.common.api.a.d>> iterator2 = this.k.values().iterator();
                a<com.google.android.gms.common.api.a.d> a4;
                do {
                    a4 = a;
                    if (!iterator2.hasNext()) {
                        break;
                    }
                    a4 = iterator2.next();
                } while (a4.K() != arg1);
                if (a4 == null) {
                    final StringBuilder sb2 = new StringBuilder(76);
                    sb2.append("Could not find API instance ");
                    sb2.append(arg1);
                    sb2.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb2.toString(), (Throwable)new Exception());
                    break;
                }
                if (c.M() == 13) {
                    final String h = this.g.h(c.M());
                    final String g1 = c.g1();
                    final StringBuilder sb3 = new StringBuilder(String.valueOf(h).length() + 69 + String.valueOf(g1).length());
                    sb3.append("Error resolution was canceled by the user, original error message: ");
                    sb3.append(h);
                    sb3.append(": ");
                    sb3.append(g1);
                    a4.g(new Status(17, sb3.toString()));
                    break;
                }
                a4.g(p(a4.g, c));
                break;
            }
            case 4:
            case 8:
            case 13: {
                final w1 w1 = (w1)message.obj;
                a<?> u;
                if ((u = this.k.get(w1.c.b())) == null) {
                    u = this.u(w1.c);
                }
                if (u.J() && this.j.get() != w1.b) {
                    w1.a.b(com.google.android.gms.common.api.internal.i.q);
                    u.c();
                    break;
                }
                u.m(w1.a);
                break;
            }
            case 3: {
                for (final a<?> a5 : this.k.values()) {
                    a5.B();
                    a5.G();
                }
                break;
            }
            case 2: {
                final b3 b4 = (b3)message.obj;
                for (final com.google.android.gms.common.api.internal.c<?> c2 : b4.a()) {
                    final a<?> a6 = this.k.get(c2);
                    if (a6 == null) {
                        b4.b(c2, new com.google.android.gms.common.c(13), null);
                        break;
                    }
                    if (a6.I()) {
                        b4.b(c2, com.google.android.gms.common.c.h0, a6.q().m());
                    }
                    else {
                        final com.google.android.gms.common.c c3 = a6.C();
                        if (c3 != null) {
                            b4.b(c2, c3, null);
                        }
                        else {
                            a6.n(b4);
                            a6.G();
                        }
                    }
                }
                break;
            }
            case 1: {
                if (message.obj) {
                    e = 10000L;
                }
                this.e = e;
                this.o.removeMessages(12);
                for (final com.google.android.gms.common.api.internal.c<?> c4 : this.k.keySet()) {
                    final Handler o2 = this.o;
                    o2.sendMessageDelayed(o2.obtainMessage(12, (Object)c4), this.e);
                }
                break;
            }
        }
        return true;
    }
    
    public final void i(@RecentlyNonNull final j<?> j) {
        final Handler o = this.o;
        o.sendMessage(o.obtainMessage(7, (Object)j));
    }
    
    public final <O extends com.google.android.gms.common.api.a.d> void j(@RecentlyNonNull final j<O> j, @RecentlyNonNull final int n, @RecentlyNonNull final e.a<? extends com.google.android.gms.common.api.t, com.google.android.gms.common.api.a.b> a) {
        final v2 v2 = new v2(n, (A)a);
        final Handler o = this.o;
        o.sendMessage(o.obtainMessage(4, (Object)new w1(v2, this.j.get(), j)));
    }
    
    public final <O extends com.google.android.gms.common.api.a.d, ResultT> void k(@RecentlyNonNull final j<O> j, @RecentlyNonNull final int n, @RecentlyNonNull final a0<com.google.android.gms.common.api.a.b, ResultT> a0, @RecentlyNonNull final com.google.android.gms.tasks.n<ResultT> n2, @RecentlyNonNull final y y) {
        final x2 x2 = new x2(n, (a0<com.google.android.gms.common.api.a.b, ResultT>)a0, (com.google.android.gms.tasks.n<ResultT>)n2, y);
        final Handler o = this.o;
        o.sendMessage(o.obtainMessage(4, (Object)new w1(x2, this.j.get(), j)));
    }
    
    public final void l(@j0 final p3 l) {
        synchronized (com.google.android.gms.common.api.internal.i.s) {
            if (this.l != l) {
                this.l = l;
                this.m.clear();
            }
            this.m.addAll(l.s());
        }
    }
    
    final boolean m(final com.google.android.gms.common.c c, final int n) {
        return this.g.P(this.f, c, n);
    }
    
    @RecentlyNonNull
    public final int n() {
        return this.i.getAndIncrement();
    }
    
    @RecentlyNonNull
    public final m<Boolean> q(@RecentlyNonNull final j<?> j) {
        final e0 e0 = new e0(j.b());
        final Handler o = this.o;
        o.sendMessage(o.obtainMessage(14, (Object)e0));
        return e0.b().a();
    }
    
    public final void r(@RecentlyNonNull final com.google.android.gms.common.c c, @RecentlyNonNull final int n) {
        if (!this.m(c, n)) {
            final Handler o = this.o;
            o.sendMessage(o.obtainMessage(5, n, 0, (Object)c));
        }
    }
    
    final void s(@j0 final p3 p) {
        synchronized (com.google.android.gms.common.api.internal.i.s) {
            if (this.l == p) {
                this.l = null;
                this.m.clear();
            }
        }
    }
    
    public final void v() {
        final Handler o = this.o;
        o.sendMessage(o.obtainMessage(3));
    }
    
    public final class a<O extends com.google.android.gms.common.api.a.d> implements k.b, k.c, j3
    {
        private final Queue<f2> e;
        @NotOnlyInitialized
        private final com.google.android.gms.common.api.a.f f;
        private final c<O> g;
        private final o3 h;
        private final Set<b3> i;
        private final Map<n.a<?>, x1> j;
        private final int k;
        @k0
        private final h2 l;
        private boolean m;
        private final List<i.b> n;
        @k0
        private com.google.android.gms.common.c o;
        
        @c1
        public a(final j<O> j) {
            this.e = new LinkedList<f2>();
            this.i = new HashSet<b3>();
            this.j = new HashMap<n.a<?>, x1>();
            this.n = new ArrayList<i.b>();
            this.o = null;
            final com.google.android.gms.common.api.a.f v = j.v(com.google.android.gms.common.api.internal.i.this.o.getLooper(), this);
            this.f = v;
            this.g = j.b();
            this.h = new o3();
            this.k = j.u();
            if (v.w()) {
                this.l = j.x(com.google.android.gms.common.api.internal.i.this.f, com.google.android.gms.common.api.internal.i.this.o);
                return;
            }
            this.l = null;
        }
        
        private final Status A(final com.google.android.gms.common.c c) {
            return p(this.g, c);
        }
        
        @c1
        private final void L() {
            this.B();
            this.y(com.google.android.gms.common.c.h0);
            this.N();
            final Iterator<x1> iterator = this.j.values().iterator();
            while (iterator.hasNext()) {
                final x1 x1 = iterator.next();
                if (this.a(x1.a.c()) == null) {
                    try {
                        x1.a.d(this.f, new com.google.android.gms.tasks.n<Void>());
                        continue;
                    }
                    catch (DeadObjectException ex) {
                        this.onConnectionSuspended(3);
                        this.f.j("DeadObjectException thrown while calling register listener method.");
                    }
                    catch (RemoteException ex2) {}
                }
                iterator.remove();
            }
            goto Label_0119;
        }
        
        @c1
        private final void M() {
            final ArrayList<f2> list = new ArrayList<f2>(this.e);
            final int size = list.size();
            int i = 0;
            while (i < size) {
                final f2 value = list.get(i);
                final int n = i + 1;
                final f2 f2 = value;
                if (!this.f.a()) {
                    break;
                }
                i = n;
                if (!this.v(f2)) {
                    continue;
                }
                this.e.remove(f2);
                i = n;
            }
        }
        
        @c1
        private final void N() {
            if (this.m) {
                com.google.android.gms.common.api.internal.i.this.o.removeMessages(11, (Object)this.g);
                com.google.android.gms.common.api.internal.i.this.o.removeMessages(9, (Object)this.g);
                this.m = false;
            }
        }
        
        private final void O() {
            com.google.android.gms.common.api.internal.i.this.o.removeMessages(12, (Object)this.g);
            com.google.android.gms.common.api.internal.i.this.o.sendMessageDelayed(com.google.android.gms.common.api.internal.i.this.o.obtainMessage(12, (Object)this.g), com.google.android.gms.common.api.internal.i.this.e);
        }
        
        @c1
        @k0
        private final com.google.android.gms.common.e a(@k0 final com.google.android.gms.common.e[] array) {
            if (array != null) {
                if (array.length != 0) {
                    final com.google.android.gms.common.e[] t = this.f.t();
                    final int n = 0;
                    com.google.android.gms.common.e[] array2;
                    if ((array2 = t) == null) {
                        array2 = new com.google.android.gms.common.e[0];
                    }
                    final androidx.collection.a a = new androidx.collection.a<Object, Long>(array2.length);
                    for (final com.google.android.gms.common.e e : array2) {
                        a.put(e.M(), Long.valueOf(e.g1()));
                    }
                    for (int length2 = array.length, j = n; j < length2; ++j) {
                        final com.google.android.gms.common.e e2 = array[j];
                        final Long n2 = a.get(e2.M());
                        if (n2 == null || n2 < e2.g1()) {
                            return e2;
                        }
                    }
                }
            }
            return null;
        }
        
        @c1
        private final void d(final int n) {
            this.B();
            this.m = true;
            this.h.b(n, this.f.u());
            com.google.android.gms.common.api.internal.i.this.o.sendMessageDelayed(Message.obtain(com.google.android.gms.common.api.internal.i.this.o, 9, (Object)this.g), com.google.android.gms.common.api.internal.i.this.c);
            com.google.android.gms.common.api.internal.i.this.o.sendMessageDelayed(Message.obtain(com.google.android.gms.common.api.internal.i.this.o, 11, (Object)this.g), com.google.android.gms.common.api.internal.i.this.d);
            com.google.android.gms.common.api.internal.i.this.h.b();
            final Iterator<x1> iterator = this.j.values().iterator();
            while (iterator.hasNext()) {
                iterator.next().c.run();
            }
        }
        
        @c1
        private final void f(@j0 final com.google.android.gms.common.c o, @k0 final Exception ex) {
            x.d(com.google.android.gms.common.api.internal.i.this.o);
            final h2 l = this.l;
            if (l != null) {
                l.z2();
            }
            this.B();
            com.google.android.gms.common.api.internal.i.this.h.b();
            this.y(o);
            if (o.M() == 4) {
                this.g(com.google.android.gms.common.api.internal.i.r);
                return;
            }
            if (this.e.isEmpty()) {
                this.o = o;
                return;
            }
            if (ex != null) {
                x.d(com.google.android.gms.common.api.internal.i.this.o);
                this.h(null, ex, false);
                return;
            }
            if (!com.google.android.gms.common.api.internal.i.this.p) {
                this.g(this.A(o));
                return;
            }
            this.h(this.A(o), null, true);
            if (this.e.isEmpty()) {
                return;
            }
            if (this.u(o)) {
                return;
            }
            if (!com.google.android.gms.common.api.internal.i.this.m(o, this.k)) {
                if (o.M() == 18) {
                    this.m = true;
                }
                if (this.m) {
                    com.google.android.gms.common.api.internal.i.this.o.sendMessageDelayed(Message.obtain(com.google.android.gms.common.api.internal.i.this.o, 9, (Object)this.g), com.google.android.gms.common.api.internal.i.this.c);
                    return;
                }
                this.g(this.A(o));
            }
        }
        
        @c1
        private final void g(final Status status) {
            x.d(com.google.android.gms.common.api.internal.i.this.o);
            this.h(status, null, false);
        }
        
        @c1
        private final void h(@k0 final Status status, @k0 final Exception ex, final boolean b) {
            x.d(com.google.android.gms.common.api.internal.i.this.o);
            int n = true ? 1 : 0;
            final boolean b2 = status == null;
            if (ex != null) {
                n = (false ? 1 : 0);
            }
            if ((b2 ? 1 : 0) != n) {
                final Iterator<Object> iterator = this.e.iterator();
                while (iterator.hasNext()) {
                    final f2 f2 = iterator.next();
                    if (!b || f2.a == 2) {
                        if (status != null) {
                            f2.b(status);
                        }
                        else {
                            f2.d(ex);
                        }
                        iterator.remove();
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        
        @c1
        private final void l(final i.b b) {
            if (!this.n.contains(b)) {
                return;
            }
            if (!this.m) {
                if (!this.f.a()) {
                    this.G();
                    return;
                }
                this.M();
            }
        }
        
        static /* synthetic */ boolean o(final a a, final boolean b) {
            return a.p(false);
        }
        
        @c1
        private final boolean p(final boolean b) {
            x.d(com.google.android.gms.common.api.internal.i.this.o);
            if (!this.f.a() || this.j.size() != 0) {
                return false;
            }
            if (this.h.f()) {
                if (b) {
                    this.O();
                }
                return false;
            }
            this.f.j("Timing out service connection.");
            return true;
        }
        
        @c1
        private final void t(final i.b b) {
            if (this.n.remove(b)) {
                com.google.android.gms.common.api.internal.i.this.o.removeMessages(15, (Object)b);
                com.google.android.gms.common.api.internal.i.this.o.removeMessages(16, (Object)b);
                final com.google.android.gms.common.e b2 = b.b;
                final ArrayList<e1> list = new ArrayList<e1>(this.e.size());
                for (final f2 e : this.e) {
                    if (e instanceof e1) {
                        final com.google.android.gms.common.e[] g = ((e1)e).g((a<?>)this);
                        if (g == null || !b.e(g, b2)) {
                            continue;
                        }
                        list.add((e1)e);
                    }
                }
                final int size = list.size();
                int i = 0;
                while (i < size) {
                    final e1 value = list.get(i);
                    ++i;
                    final e1 e2 = value;
                    this.e.remove(e2);
                    e2.d(new com.google.android.gms.common.api.y(b2));
                }
            }
        }
        
        @c1
        private final boolean u(@j0 final com.google.android.gms.common.c c) {
            synchronized (com.google.android.gms.common.api.internal.i.s) {
                if (com.google.android.gms.common.api.internal.i.this.l != null && com.google.android.gms.common.api.internal.i.this.m.contains(this.g)) {
                    com.google.android.gms.common.api.internal.i.this.l.q(c, this.k);
                    return true;
                }
                return false;
            }
        }
        
        @c1
        private final boolean v(final f2 f2) {
            if (!(f2 instanceof e1)) {
                this.z(f2);
                return true;
            }
            final e1 e1 = (e1)f2;
            final com.google.android.gms.common.e a = this.a(e1.g((a<?>)this));
            if (a == null) {
                this.z(f2);
                return true;
            }
            final String name = this.f.getClass().getName();
            final String m = a.M();
            final long g1 = a.g1();
            final StringBuilder sb = new StringBuilder(name.length() + 77 + String.valueOf(m).length());
            sb.append(name);
            sb.append(" could not execute call because it requires feature (");
            sb.append(m);
            sb.append(", ");
            sb.append(g1);
            sb.append(").");
            Log.w("GoogleApiManager", sb.toString());
            if (com.google.android.gms.common.api.internal.i.this.p && e1.h((a<?>)this)) {
                final i.b b = new i.b(this.g, a, null);
                final int index = this.n.indexOf(b);
                if (index >= 0) {
                    final i.b b2 = this.n.get(index);
                    com.google.android.gms.common.api.internal.i.this.o.removeMessages(15, (Object)b2);
                    com.google.android.gms.common.api.internal.i.this.o.sendMessageDelayed(Message.obtain(com.google.android.gms.common.api.internal.i.this.o, 15, (Object)b2), com.google.android.gms.common.api.internal.i.this.c);
                }
                else {
                    this.n.add(b);
                    com.google.android.gms.common.api.internal.i.this.o.sendMessageDelayed(Message.obtain(com.google.android.gms.common.api.internal.i.this.o, 15, (Object)b), com.google.android.gms.common.api.internal.i.this.c);
                    com.google.android.gms.common.api.internal.i.this.o.sendMessageDelayed(Message.obtain(com.google.android.gms.common.api.internal.i.this.o, 16, (Object)b), com.google.android.gms.common.api.internal.i.this.d);
                    final com.google.android.gms.common.c c = new com.google.android.gms.common.c(2, null);
                    if (!this.u(c)) {
                        com.google.android.gms.common.api.internal.i.this.m(c, this.k);
                    }
                }
                return false;
            }
            e1.d(new com.google.android.gms.common.api.y(a));
            return true;
        }
        
        @c1
        private final void y(final com.google.android.gms.common.c c) {
            for (final b3 b3 : this.i) {
                String m = null;
                if (v.b(c, com.google.android.gms.common.c.h0)) {
                    m = this.f.m();
                }
                b3.b(this.g, c, m);
            }
            this.i.clear();
        }
        
        @c1
        private final void z(final f2 f2) {
            f2.c(this.h, this.J());
            try {
                f2.f((a<?>)this);
            }
            catch (DeadObjectException ex) {
                this.onConnectionSuspended(1);
                this.f.j("DeadObjectException thrown while running ApiCallRunner.");
            }
            finally {
                final Throwable cause;
                throw new IllegalStateException(String.format("Error in GoogleApi implementation for client %s.", this.f.getClass().getName()), cause);
            }
        }
        
        @c1
        public final void B() {
            x.d(com.google.android.gms.common.api.internal.i.this.o);
            this.o = null;
        }
        
        @c1
        @k0
        public final com.google.android.gms.common.c C() {
            x.d(com.google.android.gms.common.api.internal.i.this.o);
            return this.o;
        }
        
        @c1
        public final void D() {
            x.d(com.google.android.gms.common.api.internal.i.this.o);
            if (this.m) {
                this.G();
            }
        }
        
        @c1
        public final void E() {
            x.d(com.google.android.gms.common.api.internal.i.this.o);
            if (this.m) {
                this.N();
                Status status;
                if (com.google.android.gms.common.api.internal.i.this.g.j(com.google.android.gms.common.api.internal.i.this.f) == 18) {
                    status = new Status(21, "Connection timed out waiting for Google Play services update to complete.");
                }
                else {
                    status = new Status(22, "API failed to connect while resuming due to an unknown error.");
                }
                this.g(status);
                this.f.j("Timing out connection while resuming.");
            }
        }
        
        @c1
        public final boolean F() {
            return this.p(true);
        }
        
        @c1
        public final void G() {
            x.d(com.google.android.gms.common.api.internal.i.this.o);
            if (!this.f.a()) {
                if (!this.f.l()) {
                    while (true) {
                        try {
                            final int a = com.google.android.gms.common.api.internal.i.this.h.a(com.google.android.gms.common.api.internal.i.this.f, this.f);
                            if (a != 0) {
                                final com.google.android.gms.common.c obj = new com.google.android.gms.common.c(a, null);
                                final String name = this.f.getClass().getName();
                                final String value = String.valueOf(obj);
                                final StringBuilder sb = new StringBuilder(name.length() + 35 + value.length());
                                sb.append("The service for ");
                                sb.append(name);
                                sb.append(" is not available: ");
                                sb.append(value);
                                Log.w("GoogleApiManager", sb.toString());
                                this.onConnectionFailed(obj);
                                return;
                            }
                            final i.c c = new i.c(this.f, this.g);
                            if (this.f.w()) {
                                x.k(this.l).B2(c);
                            }
                            com.google.android.gms.common.c c2;
                            try {
                                this.f.n(c);
                                return;
                            }
                            catch (SecurityException ex) {
                                c2 = new com.google.android.gms.common.c(10);
                            }
                            final SecurityException ex;
                            this.f(c2, ex);
                        }
                        catch (IllegalStateException ex) {
                            final com.google.android.gms.common.c c2 = new com.google.android.gms.common.c(10);
                            continue;
                        }
                        break;
                    }
                }
            }
        }
        
        @Override
        public final void H(final com.google.android.gms.common.c c, final com.google.android.gms.common.api.a<?> a, final boolean b) {
            if (Looper.myLooper() == com.google.android.gms.common.api.internal.i.this.o.getLooper()) {
                this.onConnectionFailed(c);
                return;
            }
            com.google.android.gms.common.api.internal.i.this.o.post((Runnable)new l1(this, c));
        }
        
        final boolean I() {
            return this.f.a();
        }
        
        public final boolean J() {
            return this.f.w();
        }
        
        public final int K() {
            return this.k;
        }
        
        @c1
        public final void c() {
            x.d(com.google.android.gms.common.api.internal.i.this.o);
            this.g(com.google.android.gms.common.api.internal.i.q);
            this.h.h();
            final Set<n.a<?>> keySet = this.j.keySet();
            int i = 0;
            for (n.a[] array = keySet.toArray((n.a[])new n.a[0]); i < array.length; ++i) {
                this.m(new z2(array[i], new com.google.android.gms.tasks.n<Boolean>()));
            }
            this.y(new com.google.android.gms.common.c(4));
            if (this.f.a()) {
                this.f.o(new k1(this));
            }
        }
        
        @c1
        public final void e(@j0 final com.google.android.gms.common.c obj) {
            x.d(com.google.android.gms.common.api.internal.i.this.o);
            final com.google.android.gms.common.api.a.f f = this.f;
            final String name = f.getClass().getName();
            final String value = String.valueOf(obj);
            final StringBuilder sb = new StringBuilder(name.length() + 25 + value.length());
            sb.append("onSignInFailed for ");
            sb.append(name);
            sb.append(" with ");
            sb.append(value);
            f.j(sb.toString());
            this.onConnectionFailed(obj);
        }
        
        @c1
        public final void m(final f2 f2) {
            x.d(com.google.android.gms.common.api.internal.i.this.o);
            if (this.f.a()) {
                if (this.v(f2)) {
                    this.O();
                    return;
                }
                this.e.add(f2);
            }
            else {
                this.e.add(f2);
                final com.google.android.gms.common.c o = this.o;
                if (o != null && o.Q1()) {
                    this.onConnectionFailed(this.o);
                    return;
                }
                this.G();
            }
        }
        
        @c1
        public final void n(final b3 b3) {
            x.d(com.google.android.gms.common.api.internal.i.this.o);
            this.i.add(b3);
        }
        
        @Override
        public final void onConnected(@k0 final Bundle bundle) {
            if (Looper.myLooper() == com.google.android.gms.common.api.internal.i.this.o.getLooper()) {
                this.L();
                return;
            }
            com.google.android.gms.common.api.internal.i.this.o.post((Runnable)new j1(this));
        }
        
        @c1
        @Override
        public final void onConnectionFailed(@j0 final com.google.android.gms.common.c c) {
            this.f(c, null);
        }
        
        @Override
        public final void onConnectionSuspended(final int n) {
            if (Looper.myLooper() == com.google.android.gms.common.api.internal.i.this.o.getLooper()) {
                this.d(n);
                return;
            }
            com.google.android.gms.common.api.internal.i.this.o.post((Runnable)new i1(this, n));
        }
        
        public final com.google.android.gms.common.api.a.f q() {
            return this.f;
        }
        
        public final Map<n.a<?>, x1> x() {
            return this.j;
        }
    }
    
    private static final class b
    {
        private final com.google.android.gms.common.api.internal.c<?> a;
        private final com.google.android.gms.common.e b;
        
        private b(final com.google.android.gms.common.api.internal.c<?> a, final com.google.android.gms.common.e b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(@k0 final Object o) {
            if (o != null && o instanceof b) {
                final b b = (b)o;
                if (v.b(this.a, b.a) && v.b(this.b, b.b)) {
                    return true;
                }
            }
            return false;
        }
        
        @Override
        public final int hashCode() {
            return v.c(this.a, this.b);
        }
        
        @Override
        public final String toString() {
            return v.d(this).a("key", this.a).a("feature", this.b).toString();
        }
    }
    
    private final class c implements k2, com.google.android.gms.common.internal.e.c
    {
        private final com.google.android.gms.common.api.a.f a;
        private final com.google.android.gms.common.api.internal.c<?> b;
        @k0
        private com.google.android.gms.common.internal.p c;
        @k0
        private Set<Scope> d;
        private boolean e;
        
        public c(final com.google.android.gms.common.api.a.f a, final com.google.android.gms.common.api.internal.c<?> b) {
            this.c = null;
            this.d = null;
            this.e = false;
            this.a = a;
            this.b = b;
        }
        
        @c1
        private final void e() {
            if (this.e) {
                final com.google.android.gms.common.internal.p c = this.c;
                if (c != null) {
                    this.a.i(c, this.d);
                }
            }
        }
        
        @c1
        @Override
        public final void a(final com.google.android.gms.common.c c) {
            final a a = i.this.k.get(this.b);
            if (a != null) {
                a.e(c);
            }
        }
        
        @Override
        public final void b(@j0 final com.google.android.gms.common.c c) {
            i.this.o.post((Runnable)new n1(this, c));
        }
        
        @c1
        @Override
        public final void c(@k0 final com.google.android.gms.common.internal.p c, @k0 final Set<Scope> d) {
            if (c != null && d != null) {
                this.c = c;
                this.d = d;
                this.e();
                return;
            }
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", (Throwable)new Exception());
            this.a(new com.google.android.gms.common.c(4));
        }
    }
}
