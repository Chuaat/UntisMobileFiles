// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Message;
import androidx.annotation.g;
import android.content.Intent;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import androidx.annotation.c1;
import android.os.RemoteException;
import android.app.PendingIntent;
import androidx.annotation.i;
import androidx.annotation.j0;
import android.os.DeadObjectException;
import java.util.Collections;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import android.accounts.Account;
import androidx.annotation.RecentlyNullable;
import android.os.IBinder;
import android.text.TextUtils;
import android.os.Bundle;
import android.content.ServiceConnection;
import android.util.Log;
import java.util.ArrayList;
import android.os.Handler;
import com.google.android.gms.common.h;
import android.os.Looper;
import android.content.Context;
import com.google.android.gms.common.util.d0;
import java.util.concurrent.atomic.AtomicInteger;
import androidx.annotation.k0;
import com.google.android.gms.common.c;
import androidx.annotation.RecentlyNonNull;
import f2.a;
import android.os.IInterface;

@f2.a
public abstract class e<T extends IInterface>
{
    @RecentlyNonNull
    @f2.a
    public static final int E = 1;
    @RecentlyNonNull
    @f2.a
    public static final int F = 4;
    @RecentlyNonNull
    @f2.a
    public static final int G = 5;
    private static final e[] H;
    @RecentlyNonNull
    @f2.a
    public static final String I = "pendingIntent";
    @RecentlyNonNull
    @f2.a
    public static final String J = "<<default account>>";
    @RecentlyNonNull
    @f2.a
    public static final String[] K;
    @k0
    private com.google.android.gms.common.c A;
    private boolean B;
    @k0
    private volatile f1 C;
    @RecentlyNonNull
    @d0
    protected AtomicInteger D;
    private int c;
    private long d;
    private long e;
    private int f;
    private long g;
    @k0
    private volatile String h;
    @d0
    private o1 i;
    private final Context j;
    private final Looper k;
    private final m l;
    private final com.google.android.gms.common.h m;
    final Handler n;
    private final Object o;
    private final Object p;
    @k0
    @d6.a("mServiceBrokerLock")
    private s q;
    @RecentlyNonNull
    @d0
    protected c r;
    @k0
    @d6.a("mLock")
    private T s;
    private final ArrayList<h<?>> t;
    @k0
    @d6.a("mLock")
    private i u;
    @d6.a("mLock")
    private int v;
    @k0
    private final a w;
    @k0
    private final b x;
    private final int y;
    @k0
    private final String z;
    
    static {
        H = new e[0];
        K = new String[] { "service_esmobile", "service_googleme" };
    }
    
    @d0
    @f2.a
    protected e(@RecentlyNonNull final Context context, @RecentlyNonNull final Handler handler, @RecentlyNonNull final m m, @RecentlyNonNull final com.google.android.gms.common.h h, @RecentlyNonNull final int y, @k0 final a w, @k0 final b x) {
        this.h = null;
        this.o = new Object();
        this.p = new Object();
        this.t = new ArrayList<h<?>>();
        this.v = 1;
        this.A = null;
        this.B = false;
        this.C = null;
        this.D = new AtomicInteger(0);
        this.j = com.google.android.gms.common.internal.x.l(context, "Context must not be null");
        this.n = com.google.android.gms.common.internal.x.l(handler, "Handler must not be null");
        this.k = handler.getLooper();
        this.l = com.google.android.gms.common.internal.x.l(m, "Supervisor must not be null");
        this.m = com.google.android.gms.common.internal.x.l(h, "API availability must not be null");
        this.y = y;
        this.w = w;
        this.x = x;
        this.z = null;
    }
    
    @f2.a
    protected e(@RecentlyNonNull final Context context, @RecentlyNonNull final Looper looper, @RecentlyNonNull final int n, @RecentlyNonNull final a a, @RecentlyNonNull final b b, @RecentlyNonNull final String s) {
        this(context, looper, com.google.android.gms.common.internal.m.d(context), com.google.android.gms.common.h.i(), n, com.google.android.gms.common.internal.x.k(a), com.google.android.gms.common.internal.x.k(b), s);
    }
    
    @d0
    @f2.a
    protected e(@RecentlyNonNull final Context context, @RecentlyNonNull final Looper looper, @RecentlyNonNull final m m, @RecentlyNonNull final com.google.android.gms.common.h h, @RecentlyNonNull final int y, @k0 final a w, @k0 final b x, @k0 final String z) {
        this.h = null;
        this.o = new Object();
        this.p = new Object();
        this.t = new ArrayList<h<?>>();
        this.v = 1;
        this.A = null;
        this.B = false;
        this.C = null;
        this.D = new AtomicInteger(0);
        this.j = com.google.android.gms.common.internal.x.l(context, "Context must not be null");
        this.k = com.google.android.gms.common.internal.x.l(looper, "Looper must not be null");
        this.l = com.google.android.gms.common.internal.x.l(m, "Supervisor must not be null");
        this.m = com.google.android.gms.common.internal.x.l(h, "API availability must not be null");
        this.n = new g(looper);
        this.y = y;
        this.w = w;
        this.x = x;
        this.z = z;
    }
    
    private final String a0() {
        String s;
        if ((s = this.z) == null) {
            s = this.j.getClass().getName();
        }
        return s;
    }
    
    private final void b0(int n) {
        if (this.k0()) {
            n = 5;
            this.B = true;
        }
        else {
            n = 4;
        }
        final Handler n2 = this.n;
        n2.sendMessage(n2.obtainMessage(n, this.D.get(), 16));
    }
    
    private final void d0(int v, @k0 final T s) {
        boolean b = false;
        if (v == 4 == (s != null)) {
            b = true;
        }
        com.google.android.gms.common.internal.x.a(b);
        synchronized (this.o) {
            this.v = v;
            this.s = s;
            if (v != 1) {
                if (v != 2 && v != 3) {
                    if (v == 4) {
                        this.Q(com.google.android.gms.common.internal.x.k(s));
                    }
                }
                else {
                    final i u = this.u;
                    if (u != null) {
                        final o1 i = this.i;
                        if (i != null) {
                            final String a = i.a();
                            final String b2 = this.i.b();
                            final int length = String.valueOf(a).length();
                            v = String.valueOf(b2).length();
                            final StringBuilder sb = new StringBuilder(length + 70 + v);
                            sb.append("Calling connect() while still connected, missing disconnect() for ");
                            sb.append(a);
                            sb.append(" on ");
                            sb.append(b2);
                            Log.e("GmsClient", sb.toString());
                            this.l.g(com.google.android.gms.common.internal.x.k(this.i.a()), this.i.b(), this.i.c(), (ServiceConnection)u, this.a0(), this.i.d());
                            this.D.incrementAndGet();
                        }
                    }
                    final i u2 = new i(this.D.get());
                    this.u = u2;
                    o1 j;
                    if (this.v == 3 && this.H() != null) {
                        j = new o1(this.F().getPackageName(), this.H(), true, com.google.android.gms.common.internal.m.c(), false);
                    }
                    else {
                        j = new o1(this.N(), this.M(), false, com.google.android.gms.common.internal.m.c(), this.P());
                    }
                    this.i = j;
                    if (j.d() && this.s() < 17895000) {
                        final String value = String.valueOf(this.i.a());
                        String concat;
                        if (value.length() != 0) {
                            concat = "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(value);
                        }
                        else {
                            concat = new String("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ");
                        }
                        throw new IllegalStateException(concat);
                    }
                    final m l = this.l;
                    final String s2 = com.google.android.gms.common.internal.x.k(this.i.a());
                    final String b3 = this.i.b();
                    v = this.i.c();
                    if (!l.h(new m.a(s2, b3, v, this.i.d()), (ServiceConnection)u2, this.a0())) {
                        final String a2 = this.i.a();
                        final String b4 = this.i.b();
                        v = String.valueOf(a2).length();
                        final StringBuilder sb2 = new StringBuilder(v + 34 + String.valueOf(b4).length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(a2);
                        sb2.append(" on ");
                        sb2.append(b4);
                        Log.e("GmsClient", sb2.toString());
                        this.c0(16, null, this.D.get());
                    }
                }
            }
            else {
                final i u3 = this.u;
                if (u3 != null) {
                    this.l.g(com.google.android.gms.common.internal.x.k(this.i.a()), this.i.b(), this.i.c(), (ServiceConnection)u3, this.a0(), this.i.d());
                    this.u = null;
                }
            }
        }
    }
    
    static /* synthetic */ void e0(final e e, final int n) {
        e.b0(16);
    }
    
    static /* synthetic */ void f0(final e e, final int n, final IInterface interface1) {
        e.d0(n, null);
    }
    
    private final void h0(final f1 c) {
        this.C = c;
    }
    
    private final boolean i0(final int n, final int n2, @k0 final T t) {
        synchronized (this.o) {
            if (this.v != n) {
                return false;
            }
            this.d0(n2, t);
            return true;
        }
    }
    
    private final boolean k0() {
        synchronized (this.o) {
            return this.v == 3;
        }
    }
    
    private final boolean m0() {
        if (this.B) {
            return false;
        }
        if (TextUtils.isEmpty((CharSequence)this.L())) {
            return false;
        }
        if (TextUtils.isEmpty((CharSequence)this.H())) {
            return false;
        }
        try {
            Class.forName(this.L());
            return true;
        }
        catch (ClassNotFoundException ex) {
            return false;
        }
    }
    
    @f2.a
    protected final void A() {
        if (this.a()) {
            return;
        }
        throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
    }
    
    @RecentlyNullable
    @f2.a
    protected abstract T B(@RecentlyNonNull final IBinder p0);
    
    @RecentlyNonNull
    @f2.a
    protected boolean C() {
        return false;
    }
    
    @RecentlyNullable
    @f2.a
    public Account D() {
        return null;
    }
    
    @RecentlyNonNull
    @f2.a
    public e[] E() {
        return com.google.android.gms.common.internal.e.H;
    }
    
    @RecentlyNonNull
    @f2.a
    public final Context F() {
        return this.j;
    }
    
    @RecentlyNonNull
    @f2.a
    protected Bundle G() {
        return new Bundle();
    }
    
    @RecentlyNullable
    @f2.a
    protected String H() {
        return null;
    }
    
    @RecentlyNonNull
    @f2.a
    public final Looper I() {
        return this.k;
    }
    
    @RecentlyNonNull
    @f2.a
    protected Set<Scope> J() {
        return Collections.emptySet();
    }
    
    @RecentlyNonNull
    @f2.a
    public final T K() throws DeadObjectException {
        synchronized (this.o) {
            if (this.v != 5) {
                this.A();
                return com.google.android.gms.common.internal.x.l(this.s, "Client is connected but service is null");
            }
            throw new DeadObjectException();
        }
    }
    
    @j0
    @f2.a
    protected abstract String L();
    
    @j0
    @f2.a
    protected abstract String M();
    
    @RecentlyNonNull
    @f2.a
    protected String N() {
        return "com.google.android.gms";
    }
    
    @RecentlyNullable
    @f2.a
    public com.google.android.gms.common.internal.h O() {
        return null;
    }
    
    @RecentlyNonNull
    @f2.a
    protected boolean P() {
        return false;
    }
    
    @androidx.annotation.i
    @f2.a
    protected void Q(@RecentlyNonNull final T t) {
        this.e = System.currentTimeMillis();
    }
    
    @androidx.annotation.i
    @f2.a
    protected void R(@RecentlyNonNull final com.google.android.gms.common.c c) {
        this.f = c.M();
        this.g = System.currentTimeMillis();
    }
    
    @androidx.annotation.i
    @f2.a
    protected void S(@RecentlyNonNull final int c) {
        this.c = c;
        this.d = System.currentTimeMillis();
    }
    
    @f2.a
    protected void T(@RecentlyNonNull final int n, @k0 final IBinder binder, @k0 final Bundle bundle, @RecentlyNonNull final int n2) {
        final Handler n3 = this.n;
        n3.sendMessage(n3.obtainMessage(1, n2, -1, (Object)new k(n, binder, bundle)));
    }
    
    @f2.a
    public void U(@RecentlyNonNull final int n) {
        final Handler n2 = this.n;
        n2.sendMessage(n2.obtainMessage(6, this.D.get(), n));
    }
    
    @d0
    @f2.a
    protected void V(@RecentlyNonNull final c c, @RecentlyNonNull final int n, @k0 final PendingIntent pendingIntent) {
        this.r = com.google.android.gms.common.internal.x.l(c, "Connection progress callbacks cannot be null.");
        final Handler n2 = this.n;
        n2.sendMessage(n2.obtainMessage(3, this.D.get(), n, (Object)pendingIntent));
    }
    
    @RecentlyNonNull
    @f2.a
    public boolean W() {
        return false;
    }
    
    @RecentlyNonNull
    @f2.a
    public boolean a() {
        synchronized (this.o) {
            return this.v == 4;
        }
    }
    
    @RecentlyNonNull
    @f2.a
    public boolean c() {
        return false;
    }
    
    protected final void c0(@RecentlyNonNull final int n, @k0 final Bundle bundle, @RecentlyNonNull final int n2) {
        final Handler n3 = this.n;
        n3.sendMessage(n3.obtainMessage(7, n2, -1, (Object)new l(n, null)));
    }
    
    @f2.a
    public void d() {
        this.D.incrementAndGet();
        synchronized (this.t) {
            for (int size = this.t.size(), i = 0; i < size; ++i) {
                this.t.get(i).e();
            }
            this.t.clear();
            // monitorexit(this.t)
            final Object p = this.p;
            synchronized (this.t) {
                this.q = null;
                // monitorexit(this.t)
                this.d0(1, null);
            }
        }
    }
    
    @RecentlyNonNull
    @f2.a
    public boolean g() {
        return false;
    }
    
    @c1
    @f2.a
    public void i(@k0 final p ex, @RecentlyNonNull final Set<Scope> set) {
        final Bundle g = this.G();
        final com.google.android.gms.common.internal.k k = new com.google.android.gms.common.internal.k(this.y);
        k.J = this.j.getPackageName();
        k.M = g;
        if (set != null) {
            k.L = (Scope[])set.toArray((Object[])new Scope[set.size()]);
        }
        if (this.w()) {
            Account d = this.D();
            if (d == null) {
                d = new Account("<<default account>>", "com.google");
            }
            k.N = d;
            if (ex != null) {
                k.K = ((IInterface)ex).asBinder();
            }
        }
        else if (this.c()) {
            k.N = this.D();
        }
        k.O = com.google.android.gms.common.internal.e.H;
        k.P = this.E();
        if (this.W()) {
            k.S = true;
        }
        try {
            synchronized (this.p) {
                final s q = this.q;
                if (q != null) {
                    q.y0(new j(this, this.D.get()), k);
                }
                else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        }
        catch (RuntimeException ex) {
            goto Label_0232;
        }
        catch (RemoteException ex4) {}
        catch (SecurityException ex2) {
            throw ex2;
        }
        catch (DeadObjectException ex3) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", (Throwable)ex3);
            this.U(3);
        }
    }
    
    @f2.a
    public void j(@RecentlyNonNull final String h) {
        this.h = h;
        this.d();
    }
    
    @RecentlyNonNull
    @f2.a
    public boolean l() {
        synchronized (this.o) {
            final int v = this.v;
            return v == 2 || v == 3;
        }
    }
    
    @RecentlyNonNull
    @f2.a
    public String m() {
        if (this.a()) {
            final o1 i = this.i;
            if (i != null) {
                return i.b();
            }
        }
        throw new RuntimeException("Failed to connect when checking package");
    }
    
    @f2.a
    public void n(@RecentlyNonNull final c c) {
        this.r = com.google.android.gms.common.internal.x.l(c, "Connection progress callbacks cannot be null.");
        this.d0(2, null);
    }
    
    @f2.a
    public void o(@RecentlyNonNull final e e) {
        e.a();
    }
    
    @f2.a
    public void q(@RecentlyNonNull final String s, @RecentlyNonNull FileDescriptor fileDescriptor, @RecentlyNonNull final PrintWriter printWriter, @RecentlyNonNull final String[] array) {
        fileDescriptor = (FileDescriptor)this.o;
        synchronized (fileDescriptor) {
            final int v = this.v;
            final IInterface s2 = this.s;
            // monitorexit(fileDescriptor)
            fileDescriptor = (FileDescriptor)this.p;
            synchronized (fileDescriptor) {
                final s q = this.q;
                // monitorexit(fileDescriptor)
                printWriter.append(s).append("mConnectState=");
                if (v != 1) {
                    if (v != 2) {
                        if (v != 3) {
                            if (v != 4) {
                                if (v != 5) {
                                    fileDescriptor = (FileDescriptor)"UNKNOWN";
                                }
                                else {
                                    fileDescriptor = (FileDescriptor)"DISCONNECTING";
                                }
                            }
                            else {
                                fileDescriptor = (FileDescriptor)"CONNECTED";
                            }
                        }
                        else {
                            fileDescriptor = (FileDescriptor)"LOCAL_CONNECTING";
                        }
                    }
                    else {
                        fileDescriptor = (FileDescriptor)"REMOTE_CONNECTING";
                    }
                }
                else {
                    fileDescriptor = (FileDescriptor)"DISCONNECTED";
                }
                printWriter.print((String)fileDescriptor);
                printWriter.append(" mService=");
                if (s2 == null) {
                    printWriter.append("null");
                }
                else {
                    printWriter.append(this.L()).append("@").append(Integer.toHexString(System.identityHashCode(s2.asBinder())));
                }
                printWriter.append(" mServiceBroker=");
                if (q == null) {
                    printWriter.println("null");
                }
                else {
                    printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(((IInterface)q).asBinder())));
                }
                final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
                if (this.e > 0L) {
                    final PrintWriter append = printWriter.append(s).append("lastConnectedTime=");
                    final long e = this.e;
                    fileDescriptor = (FileDescriptor)simpleDateFormat.format(new Date(this.e));
                    final StringBuilder sb = new StringBuilder(String.valueOf(fileDescriptor).length() + 21);
                    sb.append(e);
                    sb.append(" ");
                    sb.append((String)fileDescriptor);
                    append.println(sb.toString());
                }
                if (this.d > 0L) {
                    printWriter.append(s).append("lastSuspendedCause=");
                    final int c = this.c;
                    if (c != 1) {
                        if (c != 2) {
                            if (c != 3) {
                                fileDescriptor = (FileDescriptor)String.valueOf(c);
                            }
                            else {
                                fileDescriptor = (FileDescriptor)"CAUSE_DEAD_OBJECT_EXCEPTION";
                            }
                        }
                        else {
                            fileDescriptor = (FileDescriptor)"CAUSE_NETWORK_LOST";
                        }
                    }
                    else {
                        fileDescriptor = (FileDescriptor)"CAUSE_SERVICE_DISCONNECTED";
                    }
                    printWriter.append((CharSequence)fileDescriptor);
                    final PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
                    final long d = this.d;
                    fileDescriptor = (FileDescriptor)simpleDateFormat.format(new Date(this.d));
                    final StringBuilder sb2 = new StringBuilder(String.valueOf(fileDescriptor).length() + 21);
                    sb2.append(d);
                    sb2.append(" ");
                    sb2.append((String)fileDescriptor);
                    append2.println(sb2.toString());
                }
                if (this.g > 0L) {
                    printWriter.append(s).append("lastFailedStatus=").append(com.google.android.gms.common.api.h.a(this.f));
                    final PrintWriter append3 = printWriter.append(" lastFailedTime=");
                    final long g = this.g;
                    fileDescriptor = (FileDescriptor)simpleDateFormat.format(new Date(this.g));
                    final StringBuilder sb3 = new StringBuilder(String.valueOf(fileDescriptor).length() + 21);
                    sb3.append(g);
                    sb3.append(" ");
                    sb3.append((String)fileDescriptor);
                    append3.println(sb3.toString());
                }
            }
        }
    }
    
    @RecentlyNonNull
    @f2.a
    public boolean r() {
        return true;
    }
    
    @RecentlyNonNull
    @f2.a
    public int s() {
        return com.google.android.gms.common.h.a;
    }
    
    @RecentlyNullable
    @f2.a
    public final e[] t() {
        final f1 c = this.C;
        if (c == null) {
            return null;
        }
        return c.H;
    }
    
    @RecentlyNullable
    @f2.a
    public String u() {
        return this.h;
    }
    
    @RecentlyNonNull
    @f2.a
    public Intent v() {
        throw new UnsupportedOperationException("Not a sign in API");
    }
    
    @RecentlyNonNull
    @f2.a
    public boolean w() {
        return false;
    }
    
    @RecentlyNullable
    @f2.a
    public IBinder x() {
        synchronized (this.p) {
            final s q = this.q;
            if (q == null) {
                return null;
            }
            return ((IInterface)q).asBinder();
        }
    }
    
    @RecentlyNullable
    @f2.a
    public Bundle y() {
        return null;
    }
    
    @f2.a
    public void z() {
        final int k = this.m.k(this.j, this.s());
        if (k != 0) {
            this.d0(1, null);
            this.V((c)new d(), k, null);
            return;
        }
        this.n((c)new d());
    }
    
    @f2.a
    public interface a
    {
        @RecentlyNonNull
        @f2.a
        public static final int a = 1;
        @RecentlyNonNull
        @f2.a
        public static final int b = 3;
        
        @f2.a
        void onConnected(@k0 final Bundle p0);
        
        @f2.a
        void onConnectionSuspended(@RecentlyNonNull final int p0);
    }
    
    @f2.a
    public interface b
    {
        @f2.a
        void onConnectionFailed(@RecentlyNonNull final com.google.android.gms.common.c p0);
    }
    
    @f2.a
    public interface c
    {
        @f2.a
        void b(@RecentlyNonNull final com.google.android.gms.common.c p0);
    }
    
    protected class d implements c
    {
        @f2.a
        public d() {
        }
        
        @Override
        public void b(@RecentlyNonNull final com.google.android.gms.common.c c) {
            if (c.j2()) {
                final e a = com.google.android.gms.common.internal.e.this;
                a.i(null, a.J());
                return;
            }
            if (com.google.android.gms.common.internal.e.this.x != null) {
                com.google.android.gms.common.internal.e.this.x.onConnectionFailed(c);
            }
        }
    }
    
    @f2.a
    public interface e
    {
        @f2.a
        void a();
    }
    
    private abstract class f extends h<Boolean>
    {
        private final int d;
        @k0
        private final Bundle e;
        
        @androidx.annotation.g
        protected f(@k0 final int d, final Bundle e) {
            super(Boolean.TRUE);
            this.d = d;
            this.e = e;
        }
        
        @Override
        protected final void b() {
        }
        
        protected abstract void f(final com.google.android.gms.common.c p0);
        
        protected abstract boolean g();
    }
    
    final class g extends com.google.android.gms.internal.common.i
    {
        public g(final Looper looper) {
            super(looper);
        }
        
        private static void a(final Message message) {
            final h h = (h)message.obj;
            h.b();
            h.d();
        }
        
        private static boolean b(final Message message) {
            final int what = message.what;
            return what == 2 || what == 1 || what == 7;
        }
        
        public final void handleMessage(final Message message) {
            if (com.google.android.gms.common.internal.e.this.D.get() != message.arg1) {
                if (b(message)) {
                    a(message);
                }
                return;
            }
            final int what = message.what;
            if ((what == 1 || what == 7 || (what == 4 && !com.google.android.gms.common.internal.e.this.C()) || message.what == 5) && !com.google.android.gms.common.internal.e.this.l()) {
                a(message);
                return;
            }
            final int what2 = message.what;
            PendingIntent pendingIntent = null;
            if (what2 == 4) {
                com.google.android.gms.common.internal.e.this.A = new com.google.android.gms.common.c(message.arg2);
                if (com.google.android.gms.common.internal.e.this.m0() && !com.google.android.gms.common.internal.e.this.B) {
                    com.google.android.gms.common.internal.e.f0(com.google.android.gms.common.internal.e.this, 3, null);
                    return;
                }
                com.google.android.gms.common.c o0;
                if (com.google.android.gms.common.internal.e.this.A != null) {
                    o0 = com.google.android.gms.common.internal.e.this.A;
                }
                else {
                    o0 = new com.google.android.gms.common.c(8);
                }
                com.google.android.gms.common.internal.e.this.r.b(o0);
                com.google.android.gms.common.internal.e.this.R(o0);
            }
            else {
                if (what2 == 5) {
                    com.google.android.gms.common.c o2;
                    if (com.google.android.gms.common.internal.e.this.A != null) {
                        o2 = com.google.android.gms.common.internal.e.this.A;
                    }
                    else {
                        o2 = new com.google.android.gms.common.c(8);
                    }
                    com.google.android.gms.common.internal.e.this.r.b(o2);
                    com.google.android.gms.common.internal.e.this.R(o2);
                    return;
                }
                if (what2 == 3) {
                    final Object obj = message.obj;
                    if (obj instanceof PendingIntent) {
                        pendingIntent = (PendingIntent)obj;
                    }
                    final com.google.android.gms.common.c c = new com.google.android.gms.common.c(message.arg2, pendingIntent);
                    com.google.android.gms.common.internal.e.this.r.b(c);
                    com.google.android.gms.common.internal.e.this.R(c);
                    return;
                }
                if (what2 == 6) {
                    com.google.android.gms.common.internal.e.f0(com.google.android.gms.common.internal.e.this, 5, null);
                    if (com.google.android.gms.common.internal.e.this.w != null) {
                        com.google.android.gms.common.internal.e.this.w.onConnectionSuspended(message.arg2);
                    }
                    com.google.android.gms.common.internal.e.this.S(message.arg2);
                    com.google.android.gms.common.internal.e.this.i0(5, 1, null);
                    return;
                }
                if (what2 == 2 && !com.google.android.gms.common.internal.e.this.a()) {
                    a(message);
                    return;
                }
                if (b(message)) {
                    ((h)message.obj).c();
                    return;
                }
                final int what3 = message.what;
                final StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(what3);
                Log.wtf("GmsClient", sb.toString(), (Throwable)new Exception());
            }
        }
    }
    
    protected abstract class h<TListener>
    {
        @k0
        private TListener a;
        private boolean b;
        
        public h(final TListener a) {
            this.a = a;
            this.b = false;
        }
        
        protected abstract void a(final TListener p0);
        
        protected abstract void b();
        
        public final void c() {
            synchronized (this) {
                final TListener a = this.a;
                if (this.b) {
                    final String value = String.valueOf(this);
                    final StringBuilder sb = new StringBuilder(value.length() + 47);
                    sb.append("Callback proxy ");
                    sb.append(value);
                    sb.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb.toString());
                }
                // monitorexit(this)
                Label_0097: {
                    if (a != null) {
                        try {
                            this.a(a);
                            break Label_0097;
                        }
                        catch (RuntimeException ex) {
                            this.b();
                            throw ex;
                        }
                    }
                    this.b();
                }
                synchronized (this) {
                    this.b = true;
                    // monitorexit(this)
                    this.d();
                }
            }
        }
        
        public final void d() {
            this.e();
            synchronized (com.google.android.gms.common.internal.e.this.t) {
                com.google.android.gms.common.internal.e.this.t.remove(this);
            }
        }
        
        public final void e() {
            synchronized (this) {
                this.a = null;
            }
        }
    }
    
    @d0
    public final class i implements ServiceConnection
    {
        private final int c;
        
        public i(final int c) {
            this.c = c;
        }
        
        public final void onServiceConnected(final ComponentName componentName, final IBinder binder) {
            final e d = com.google.android.gms.common.internal.e.this;
            if (binder == null) {
                com.google.android.gms.common.internal.e.e0(d, 16);
                return;
            }
            synchronized (d.p) {
                final e d2 = com.google.android.gms.common.internal.e.this;
                final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                s s;
                if (queryLocalInterface != null && queryLocalInterface instanceof s) {
                    s = (s)queryLocalInterface;
                }
                else {
                    s = new s.a.a(binder);
                }
                d2.q = s;
                // monitorexit(e.Z(d))
                com.google.android.gms.common.internal.e.this.c0(0, null, this.c);
            }
        }
        
        public final void onServiceDisconnected(final ComponentName componentName) {
            synchronized (com.google.android.gms.common.internal.e.this.p) {
                com.google.android.gms.common.internal.e.this.q = null;
                // monitorexit(e.Z(this.d))
                final Handler n = com.google.android.gms.common.internal.e.this.n;
                n.sendMessage(n.obtainMessage(6, this.c, 1));
            }
        }
    }
    
    @d0
    public static final class j extends r.a
    {
        @k0
        private e f;
        private final int g;
        
        public j(@j0 final e f, final int g) {
            this.f = f;
            this.g = g;
        }
        
        @androidx.annotation.g
        @Override
        public final void R1(final int n, @j0 final IBinder binder, @j0 final f1 f1) {
            final e f2 = this.f;
            com.google.android.gms.common.internal.x.l(f2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            com.google.android.gms.common.internal.x.k(f1);
            f2.h0(f1);
            this.j1(n, binder, f1.G);
        }
        
        @androidx.annotation.g
        @Override
        public final void c1(final int n, @k0 final Bundle bundle) {
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", (Throwable)new Exception());
        }
        
        @androidx.annotation.g
        @Override
        public final void j1(final int n, @j0 final IBinder binder, @k0 final Bundle bundle) {
            com.google.android.gms.common.internal.x.l(this.f, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f.T(n, binder, bundle, this.g);
            this.f = null;
        }
    }
    
    protected final class k extends f
    {
        @k0
        private final IBinder g;
        
        @androidx.annotation.g
        public k(@k0 final int n, @k0 final IBinder g, final Bundle bundle) {
            super(n, bundle);
            this.g = g;
        }
        
        @Override
        protected final void f(final com.google.android.gms.common.c c) {
            if (e.this.x != null) {
                e.this.x.onConnectionFailed(c);
            }
            e.this.R(c);
        }
        
        @Override
        protected final boolean g() {
            try {
                final String interfaceDescriptor = com.google.android.gms.common.internal.x.k(this.g).getInterfaceDescriptor();
                if (!e.this.L().equals(interfaceDescriptor)) {
                    final String l = e.this.L();
                    final StringBuilder sb = new StringBuilder(String.valueOf(l).length() + 34 + String.valueOf(interfaceDescriptor).length());
                    sb.append("service descriptor mismatch: ");
                    sb.append(l);
                    sb.append(" vs. ");
                    sb.append(interfaceDescriptor);
                    Log.e("GmsClient", sb.toString());
                    return false;
                }
                final IInterface b = e.this.B(this.g);
                if (b != null && (e.this.i0(2, 4, b) || e.this.i0(3, 4, b))) {
                    e.this.A = null;
                    final Bundle y = e.this.y();
                    if (e.this.w != null) {
                        e.this.w.onConnected(y);
                    }
                    return true;
                }
                return false;
            }
            catch (RemoteException ex) {
                Log.w("GmsClient", "service probably died");
                return false;
            }
        }
    }
    
    protected final class l extends f
    {
        @androidx.annotation.g
        public l(@k0 final int n, final Bundle bundle) {
            super(n, null);
        }
        
        @Override
        protected final void f(final com.google.android.gms.common.c c) {
            if (e.this.C() && e.this.m0()) {
                e.e0(e.this, 16);
                return;
            }
            e.this.r.b(c);
            e.this.R(c);
        }
        
        @Override
        protected final boolean g() {
            e.this.r.b(c.h0);
            return true;
        }
    }
}
