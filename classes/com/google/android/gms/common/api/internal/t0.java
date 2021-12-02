// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.api.t;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.TimeUnit;
import com.google.android.gms.common.c;
import java.io.FileDescriptor;
import java.io.Writer;
import java.io.PrintWriter;
import java.io.StringWriter;
import android.os.Bundle;
import android.util.Log;
import android.app.Activity;
import androidx.fragment.app.d;
import androidx.annotation.j0;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.u;
import com.google.android.gms.common.h;
import java.util.Iterator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import com.google.android.gms.common.api.a;
import java.util.Map;
import com.google.android.gms.common.g;
import com.google.android.gms.common.util.d0;
import java.util.Queue;
import android.os.Looper;
import android.content.Context;
import androidx.annotation.k0;
import com.google.android.gms.common.internal.l0;
import java.util.concurrent.locks.Lock;
import com.google.android.gms.common.internal.o0;
import com.google.android.gms.common.api.k;

public final class t0 extends k implements r1
{
    final r2 A;
    private final o0 B;
    private final Lock e;
    private final l0 f;
    @k0
    private s1 g;
    private final int h;
    private final Context i;
    private final Looper j;
    @d0
    final Queue<e.a<?, ?>> k;
    private volatile boolean l;
    private long m;
    private long n;
    private final a1 o;
    private final g p;
    @k0
    @d0
    private o1 q;
    final Map<com.google.android.gms.common.api.a.c<?>, com.google.android.gms.common.api.a.f> r;
    Set<Scope> s;
    private final com.google.android.gms.common.internal.g t;
    private final Map<com.google.android.gms.common.api.a<?>, Boolean> u;
    private final com.google.android.gms.common.api.a.a<? extends com.google.android.gms.signin.e, com.google.android.gms.signin.a> v;
    private final o w;
    private final ArrayList<h3> x;
    private Integer y;
    @k0
    Set<q2> z;
    
    public t0(final Context i, final Lock e, final Looper j, final com.google.android.gms.common.internal.g t, final g p13, final com.google.android.gms.common.api.a.a<? extends com.google.android.gms.signin.e, com.google.android.gms.signin.a> v, final Map<com.google.android.gms.common.api.a<?>, Boolean> u, final List<b> list, final List<c> list2, final Map<com.google.android.gms.common.api.a.c<?>, com.google.android.gms.common.api.a.f> r, final int h, final int k, final ArrayList<h3> x) {
        this.g = null;
        this.k = new LinkedList<e.a<?, ?>>();
        long m;
        if (com.google.android.gms.common.util.e.b()) {
            m = 10000L;
        }
        else {
            m = 120000L;
        }
        this.m = m;
        this.n = 5000L;
        this.s = new HashSet<Scope>();
        this.w = new o();
        this.y = null;
        this.z = null;
        final w0 b = new w0(this);
        this.B = b;
        this.i = i;
        this.e = e;
        this.f = new l0(j, b);
        this.j = j;
        this.o = new a1(this, j);
        this.p = p13;
        this.h = h;
        if (h >= 0) {
            this.y = k;
        }
        this.u = u;
        this.r = r;
        this.x = x;
        this.A = new r2();
        final Iterator<b> iterator = list.iterator();
        while (iterator.hasNext()) {
            this.f.e(iterator.next());
        }
        final Iterator<c> iterator2 = list2.iterator();
        while (iterator2.hasNext()) {
            this.f.f(iterator2.next());
        }
        this.t = t;
        this.v = v;
    }
    
    public static int K(final Iterable<com.google.android.gms.common.api.a.f> iterable, final boolean b) {
        final Iterator<com.google.android.gms.common.api.a.f> iterator = iterable.iterator();
        int n = 0;
        boolean b2 = false;
        while (iterator.hasNext()) {
            final com.google.android.gms.common.api.a.f f = iterator.next();
            int n2 = n;
            if (f.w()) {
                n2 = 1;
            }
            n = n2;
            if (f.g()) {
                b2 = true;
                n = n2;
            }
        }
        if (n == 0) {
            return 3;
        }
        if (b2 && b) {
            return 2;
        }
        return 1;
    }
    
    private final void L(int i) {
        final Integer y = this.y;
        if (y == null) {
            this.y = i;
        }
        else if (y != i) {
            final String p = P(i);
            final String p2 = P(this.y);
            final StringBuilder sb = new StringBuilder(String.valueOf(p).length() + 51 + String.valueOf(p2).length());
            sb.append("Cannot use sign-in mode: ");
            sb.append(p);
            sb.append(". Mode was already set to ");
            sb.append(p2);
            throw new IllegalStateException(sb.toString());
        }
        if (this.g != null) {
            return;
        }
        final Iterator<com.google.android.gms.common.api.a.f> iterator = this.r.values().iterator();
        int n = 0;
        i = 0;
        while (iterator.hasNext()) {
            final com.google.android.gms.common.api.a.f f = iterator.next();
            int n2 = n;
            if (f.w()) {
                n2 = 1;
            }
            n = n2;
            if (f.g()) {
                i = 1;
                n = n2;
            }
        }
        final int intValue = this.y;
        while (true) {
            Label_0195: {
                s1 l;
                if (intValue != 1) {
                    if (intValue != 2) {
                        break Label_0195;
                    }
                    if (n == 0) {
                        break Label_0195;
                    }
                    l = i3.l(this.i, this, this.e, this.j, this.p, this.r, this.t, this.u, this.v, this.x);
                }
                else {
                    if (n == 0) {
                        throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
                    }
                    if (i == 0) {
                        break Label_0195;
                    }
                    throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
                this.g = l;
                return;
            }
            s1 l = new b1(this.i, this, this.e, this.j, this.p, this.r, this.t, this.u, this.v, this.x, this);
            continue;
        }
    }
    
    private final void M(final k k, final z z, final boolean b) {
        com.google.android.gms.common.internal.service.a.d.a(k).h(new x0(this, z, b, k));
    }
    
    private static String P(final int n) {
        if (n == 1) {
            return "SIGN_IN_MODE_REQUIRED";
        }
        if (n == 2) {
            return "SIGN_IN_MODE_OPTIONAL";
        }
        if (n != 3) {
            return "UNKNOWN";
        }
        return "SIGN_IN_MODE_NONE";
    }
    
    @d6.a("mLock")
    private final void U() {
        this.f.g();
        com.google.android.gms.common.internal.x.k(this.g).b();
    }
    
    private final void V() {
        this.e.lock();
        try {
            if (this.l) {
                this.U();
            }
        }
        finally {
            this.e.unlock();
        }
    }
    
    private final void W() {
        this.e.lock();
        try {
            if (this.R()) {
                this.U();
            }
        }
        finally {
            this.e.unlock();
        }
    }
    
    private final boolean X() {
        this.e.lock();
        try {
            final Set<q2> z = this.z;
            if (z == null) {
                return false;
            }
            final boolean empty = z.isEmpty();
            this.e.unlock();
            return empty ^ true;
        }
        finally {
            this.e.unlock();
        }
    }
    
    @Override
    public final void A(@j0 final b b) {
        this.f.e(b);
    }
    
    @Override
    public final void B(@j0 final c c) {
        this.f.f(c);
    }
    
    @Override
    public final <L> n<L> C(@j0 final L l) {
        this.e.lock();
        try {
            return this.w.c(l, this.j, "NO_TYPE");
        }
        finally {
            this.e.unlock();
        }
    }
    
    @Override
    public final void D(@j0 final d d) {
        final l l = new l(d);
        if (this.h >= 0) {
            a3.r(l).s(this.h);
            return;
        }
        throw new IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
    }
    
    @Override
    public final void E(@j0 final b b) {
        this.f.j(b);
    }
    
    @Override
    public final void F(@j0 final c c) {
        this.f.k(c);
    }
    
    @Override
    public final void H(final q2 q2) {
        this.e.lock();
        try {
            if (this.z == null) {
                this.z = new HashSet<q2>();
            }
            this.z.add(q2);
        }
        finally {
            this.e.unlock();
        }
    }
    
    @Override
    public final void I(final q2 q2) {
        this.e.lock();
        try {
            final Set<q2> z = this.z;
            String s;
            Exception ex;
            if (z == null) {
                s = "Attempted to remove pending transform when no transforms are registered.";
                ex = new Exception();
            }
            else if (!z.remove(q2)) {
                s = "Failed to remove pending transform - this may lead to memory leaks!";
                ex = new Exception();
            }
            else {
                if (this.X()) {
                    return;
                }
                final s1 g = this.g;
                if (g != null) {
                    g.e();
                }
                return;
            }
            Log.wtf("GoogleApiClientImpl", s, (Throwable)ex);
        }
        finally {
            this.e.unlock();
        }
    }
    
    @d6.a("mLock")
    @Override
    public final void J(@k0 final Bundle bundle) {
        while (!this.k.isEmpty()) {
            this.l(this.k.remove());
        }
        this.f.c(bundle);
    }
    
    @d6.a("mLock")
    final boolean R() {
        if (!this.l) {
            return false;
        }
        this.l = false;
        this.o.removeMessages(2);
        this.o.removeMessages(1);
        final o1 q = this.q;
        if (q != null) {
            q.a();
            this.q = null;
        }
        return true;
    }
    
    final String T() {
        final StringWriter out = new StringWriter();
        this.i("", null, new PrintWriter(out), null);
        return out.toString();
    }
    
    @d6.a("mLock")
    @Override
    public final void a(final com.google.android.gms.common.c c) {
        if (!this.p.l(this.i, c.M())) {
            this.R();
        }
        if (!this.l) {
            this.f.d(c);
            this.f.a();
        }
    }
    
    @d6.a("mLock")
    @Override
    public final void b(final int n, final boolean b) {
        Label_0115: {
            if (n != 1 || b || this.l) {
                break Label_0115;
            }
            this.l = true;
            while (true) {
                if (this.q != null || com.google.android.gms.common.util.e.b()) {
                    break Label_0071;
                }
                try {
                    this.q = this.p.H(this.i.getApplicationContext(), new z0(this));
                    final a1 o = this.o;
                    o.sendMessageDelayed(o.obtainMessage(1), this.m);
                    final a1 o2 = this.o;
                    o2.sendMessageDelayed(o2.obtainMessage(2), this.n);
                    final Set<BasePendingResult<?>> a = this.A.a;
                    int i = 0;
                    for (BasePendingResult[] array = a.toArray(new BasePendingResult[0]); i < array.length; ++i) {
                        array[i].l(r2.c);
                    }
                    this.f.b(n);
                    this.f.a();
                    if (n == 2) {
                        this.U();
                    }
                }
                catch (SecurityException ex) {
                    continue;
                }
                break;
            }
        }
    }
    
    @Override
    public final com.google.android.gms.common.c c() {
        final Looper myLooper = Looper.myLooper();
        final Looper mainLooper = Looper.getMainLooper();
        final boolean b = true;
        com.google.android.gms.common.internal.x.r(myLooper != mainLooper, "blockingConnect must not be called on the UI thread");
        this.e.lock();
        try {
            if (this.h >= 0) {
                com.google.android.gms.common.internal.x.r(this.y != null && b, "Sign-in mode should have been set explicitly by auto-manage.");
            }
            else {
                final Integer y = this.y;
                if (y == null) {
                    this.y = K(this.r.values(), false);
                }
                else if (y == 2) {
                    throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            this.L(com.google.android.gms.common.internal.x.k(this.y));
            this.f.g();
            return com.google.android.gms.common.internal.x.k(this.g).f();
        }
        finally {
            this.e.unlock();
        }
    }
    
    @Override
    public final com.google.android.gms.common.c d(final long n, @j0 final TimeUnit timeUnit) {
        com.google.android.gms.common.internal.x.r(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        com.google.android.gms.common.internal.x.l(timeUnit, "TimeUnit must not be null");
        this.e.lock();
        try {
            final Integer y = this.y;
            if (y == null) {
                this.y = K(this.r.values(), false);
            }
            else if (y == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            this.L(com.google.android.gms.common.internal.x.k(this.y));
            this.f.g();
            return com.google.android.gms.common.internal.x.k(this.g).j(n, timeUnit);
        }
        finally {
            this.e.unlock();
        }
    }
    
    @Override
    public final com.google.android.gms.common.api.n<Status> e() {
        com.google.android.gms.common.internal.x.r(this.t(), "GoogleApiClient is not connected yet.");
        final Integer y = this.y;
        com.google.android.gms.common.internal.x.r(y == null || y != 2, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        final z z = new z(this);
        if (this.r.containsKey(com.google.android.gms.common.internal.service.a.a)) {
            this.M(this, z, false);
        }
        else {
            final AtomicReference<k> atomicReference = new AtomicReference<k>();
            final k i = new a(this.i).a(com.google.android.gms.common.internal.service.a.c).e(new v0(this, atomicReference, z)).f(new y0(this, z)).o(this.o).i();
            atomicReference.set(i);
            i.f();
        }
        return z;
    }
    
    @Override
    public final void f() {
        this.e.lock();
        try {
            final int h = this.h;
            boolean b = false;
            if (h >= 0) {
                if (this.y != null) {
                    b = true;
                }
                com.google.android.gms.common.internal.x.r(b, "Sign-in mode should have been set explicitly by auto-manage.");
            }
            else {
                final Integer y = this.y;
                if (y == null) {
                    this.y = K(this.r.values(), false);
                }
                else if (y == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            this.g(com.google.android.gms.common.internal.x.k(this.y));
        }
        finally {
            this.e.unlock();
        }
    }
    
    @Override
    public final void g(final int i) {
        this.e.lock();
        boolean b2;
        final boolean b = b2 = true;
        if (i != 3) {
            b2 = b;
            if (i != 1) {
                if (i == 2) {
                    b2 = b;
                }
                else {
                    b2 = false;
                }
            }
        }
        try {
            final StringBuilder sb = new StringBuilder(33);
            sb.append("Illegal sign-in mode: ");
            sb.append(i);
            com.google.android.gms.common.internal.x.b(b2, sb.toString());
            this.L(i);
            this.U();
        }
        finally {
            this.e.unlock();
        }
    }
    
    @Override
    public final void h() {
        this.e.lock();
        try {
            this.A.a();
            final s1 g = this.g;
            if (g != null) {
                g.I();
            }
            this.w.d();
            for (final e.a a : this.k) {
                a.s(null);
                a.f();
            }
            this.k.clear();
            if (this.g != null) {
                this.R();
                this.f.a();
            }
        }
        finally {
            this.e.unlock();
        }
    }
    
    @Override
    public final void i(final String s, @k0 final FileDescriptor fileDescriptor, final PrintWriter printWriter, @k0 final String[] array) {
        printWriter.append(s).append("mContext=").println(this.i);
        printWriter.append(s).append("mResuming=").print(this.l);
        printWriter.append(" mWorkQueue.size()=").print(this.k.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.A.a.size());
        final s1 g = this.g;
        if (g != null) {
            g.i(s, fileDescriptor, printWriter, array);
        }
    }
    
    @Override
    public final <A extends com.google.android.gms.common.api.a.b, R extends t, T extends e.a<R, A>> T k(@j0 T k) {
        final com.google.android.gms.common.api.a<?> z = ((e.a)k).z();
        final boolean containsKey = this.r.containsKey(k.A());
        String d;
        if (z != null) {
            d = z.d();
        }
        else {
            d = "the API";
        }
        final StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(d);
        sb.append(" required for this call.");
        com.google.android.gms.common.internal.x.b(containsKey, sb.toString());
        this.e.lock();
        try {
            final s1 g = this.g;
            if (g == null) {
                this.k.add(k);
            }
            else {
                k = (T)g.K((e.a<R, A>)k);
            }
            return k;
        }
        finally {
            this.e.unlock();
        }
    }
    
    @Override
    public final <A extends com.google.android.gms.common.api.a.b, T extends e.a<? extends t, A>> T l(@j0 final T t) {
        final com.google.android.gms.common.api.a<?> z = ((e.a)t).z();
        final boolean containsKey = this.r.containsKey(t.A());
        String d;
        if (z != null) {
            d = z.d();
        }
        else {
            d = "the API";
        }
        final StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(d);
        sb.append(" required for this call.");
        com.google.android.gms.common.internal.x.b(containsKey, sb.toString());
        this.e.lock();
        try {
            final s1 g = this.g;
            if (g != null) {
                e.a<? extends t, A> l;
                if (this.l) {
                    this.k.add(t);
                    while (true) {
                        l = t;
                        if (this.k.isEmpty()) {
                            break;
                        }
                        final e.a a = this.k.remove();
                        this.A.b(a);
                        a.a(Status.N);
                    }
                }
                else {
                    l = g.L(t);
                }
                return (T)l;
            }
            throw new IllegalStateException("GoogleApiClient is not connected yet.");
        }
        finally {
            this.e.unlock();
        }
    }
    
    @j0
    @Override
    public final <C extends com.google.android.gms.common.api.a.f> C n(@j0 final com.google.android.gms.common.api.a.c<C> c) {
        final com.google.android.gms.common.api.a.f f = this.r.get(c);
        com.google.android.gms.common.internal.x.l(f, "Appropriate Api was not requested.");
        return (C)f;
    }
    
    @j0
    @Override
    public final com.google.android.gms.common.c o(@j0 final com.google.android.gms.common.api.a<?> a) {
        this.e.lock();
        try {
            if (!this.t() && !this.l) {
                throw new IllegalStateException("Cannot invoke getConnectionResult unless GoogleApiClient is connected");
            }
            if (!this.r.containsKey(a.c())) {
                throw new IllegalArgumentException(String.valueOf(a.d()).concat(" was never registered with GoogleApiClient"));
            }
            final com.google.android.gms.common.c g = com.google.android.gms.common.internal.x.k(this.g).g(a);
            if (g == null) {
                com.google.android.gms.common.c h0;
                if (this.l) {
                    h0 = com.google.android.gms.common.c.h0;
                }
                else {
                    Log.w("GoogleApiClientImpl", this.T());
                    Log.wtf("GoogleApiClientImpl", String.valueOf(a.d()).concat(" requested in getConnectionResult is not connected but is not present in the failed  connections map"), (Throwable)new Exception());
                    h0 = new com.google.android.gms.common.c(8, null);
                }
                return h0;
            }
            return g;
        }
        finally {
            this.e.unlock();
        }
    }
    
    @Override
    public final Context p() {
        return this.i;
    }
    
    @Override
    public final Looper q() {
        return this.j;
    }
    
    @Override
    public final boolean r(@j0 final com.google.android.gms.common.api.a<?> a) {
        return this.r.containsKey(a.c());
    }
    
    @Override
    public final boolean s(@j0 final com.google.android.gms.common.api.a<?> a) {
        if (!this.t()) {
            return false;
        }
        final com.google.android.gms.common.api.a.f f = this.r.get(a.c());
        return f != null && f.a();
    }
    
    @Override
    public final boolean t() {
        final s1 g = this.g;
        return g != null && g.h();
    }
    
    @Override
    public final boolean u() {
        final s1 g = this.g;
        return g != null && g.d();
    }
    
    @Override
    public final boolean v(@j0 final b b) {
        return this.f.h(b);
    }
    
    @Override
    public final boolean w(@j0 final c c) {
        return this.f.i(c);
    }
    
    @Override
    public final boolean x(final w w) {
        final s1 g = this.g;
        return g != null && g.a(w);
    }
    
    @Override
    public final void y() {
        final s1 g = this.g;
        if (g != null) {
            g.c();
        }
    }
    
    @Override
    public final void z() {
        this.h();
        this.f();
    }
}
