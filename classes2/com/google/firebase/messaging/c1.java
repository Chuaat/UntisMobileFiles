// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.messaging;

import android.os.Build$VERSION;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutionException;
import java.io.IOException;
import java.util.concurrent.TimeoutException;
import com.google.android.gms.tasks.p;
import com.google.android.gms.tasks.m;
import androidx.collection.a;
import androidx.annotation.j0;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledExecutorService;
import androidx.annotation.w;
import com.google.android.gms.tasks.n;
import java.util.ArrayDeque;
import java.util.Map;
import com.google.firebase.installations.j;
import android.content.Context;

class c1
{
    private static final long j;
    private final Context a;
    private final m0 b;
    private final h0 c;
    private final FirebaseMessaging d;
    private final j e;
    @w("pendingOperations")
    private final Map<String, ArrayDeque<n<Void>>> f;
    private final ScheduledExecutorService g;
    @w("this")
    private boolean h;
    private final a1 i;
    
    static {
        j = TimeUnit.HOURS.toSeconds(8L);
    }
    
    private c1(final FirebaseMessaging d, final j e, final m0 b, final a1 i, final h0 c, final Context a, @j0 final ScheduledExecutorService g) {
        this.f = (Map<String, ArrayDeque<n<Void>>>)new a();
        this.h = false;
        this.d = d;
        this.e = e;
        this.b = b;
        this.i = i;
        this.c = c;
        this.a = a;
        this.g = g;
    }
    
    private void a(final z0 z0, final n<Void> e) {
        synchronized (this.f) {
            final String e2 = z0.e();
            ArrayDeque<n<Void>> arrayDeque;
            if (this.f.containsKey(e2)) {
                arrayDeque = this.f.get(e2);
            }
            else {
                arrayDeque = new ArrayDeque<n<Void>>();
                this.f.put(e2, arrayDeque);
            }
            arrayDeque.add(e);
        }
    }
    
    @androidx.annotation.c1
    private static <T> T b(m<T> b) throws IOException {
        try {
            b = p.b((m)b, 30L, TimeUnit.SECONDS);
            return (T)b;
        }
        catch (TimeoutException b) {
            goto Label_0018;
        }
        catch (InterruptedException ex) {}
        catch (ExecutionException cause2) {
            final Throwable cause = cause2.getCause();
            if (cause instanceof IOException) {
                throw (IOException)cause;
            }
            if (cause instanceof RuntimeException) {
                throw (RuntimeException)cause;
            }
            throw new IOException(cause2);
        }
    }
    
    @androidx.annotation.c1
    private void c(final String s) throws IOException {
        b(this.c.k(b(this.e.b()), this.d.c(), s));
    }
    
    @androidx.annotation.c1
    private void d(final String s) throws IOException {
        b(this.c.l(b(this.e.b()), this.d.c(), s));
    }
    
    @androidx.annotation.b1
    static m<c1> e(final FirebaseMessaging firebaseMessaging, final j j, final m0 m0, final h0 h0, final Context context, @j0 final ScheduledExecutorService scheduledExecutorService) {
        return (m<c1>)p.d((Executor)scheduledExecutorService, (Callable)new b1(context, scheduledExecutorService, firebaseMessaging, j, m0, h0));
    }
    
    static boolean g() {
        final boolean loggable = Log.isLoggable("FirebaseMessaging", 3);
        boolean b = false;
        if (!loggable) {
            if (Build$VERSION.SDK_INT != 23) {
                return b;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return false;
            }
        }
        b = true;
        return b;
    }
    
    private void j(final z0 z0) {
        synchronized (this.f) {
            final String e = z0.e();
            if (!this.f.containsKey(e)) {
                return;
            }
            final ArrayDeque<n<Void>> arrayDeque = this.f.get(e);
            final n<Void> n = arrayDeque.poll();
            if (n != null) {
                n.c((Object)null);
            }
            if (arrayDeque.isEmpty()) {
                this.f.remove(e);
            }
        }
    }
    
    private void o() {
        if (!this.h()) {
            this.s(0L);
        }
    }
    
    boolean f() {
        return this.i.c() != null;
    }
    
    boolean h() {
        synchronized (this) {
            return this.h;
        }
    }
    
    @androidx.annotation.c1
    boolean k(final z0 obj) throws IOException {
        try {
            final String b = obj.b();
            final int hashCode = b.hashCode();
            int n = 0;
            Label_0055: {
                if (hashCode != 83) {
                    if (hashCode == 85) {
                        if (b.equals("U")) {
                            n = 1;
                            break Label_0055;
                        }
                    }
                }
                else if (b.equals("S")) {
                    n = 0;
                    break Label_0055;
                }
                n = -1;
            }
            String s;
            if (n != 0) {
                if (n != 1) {
                    if (!g()) {
                        return true;
                    }
                    final String value = String.valueOf(obj);
                    final StringBuilder sb = new StringBuilder(value.length() + 24);
                    sb.append("Unknown topic operation");
                    sb.append(value);
                    sb.append(".");
                    s = sb.toString();
                }
                else {
                    this.d(obj.c());
                    if (!g()) {
                        return true;
                    }
                    final String c = obj.c();
                    final StringBuilder sb2 = new StringBuilder(String.valueOf(c).length() + 35);
                    sb2.append("Unsubscribe from topic: ");
                    sb2.append(c);
                    sb2.append(" succeeded.");
                    s = sb2.toString();
                }
            }
            else {
                this.c(obj.c());
                if (!g()) {
                    return true;
                }
                final String c2 = obj.c();
                final StringBuilder sb3 = new StringBuilder(String.valueOf(c2).length() + 31);
                sb3.append("Subscribe to topic: ");
                sb3.append(c2);
                sb3.append(" succeeded.");
                s = sb3.toString();
            }
            Log.d("FirebaseMessaging", s);
            return true;
        }
        catch (IOException ex) {
            String string;
            if (!"SERVICE_NOT_AVAILABLE".equals(ex.getMessage()) && !"INTERNAL_SERVER_ERROR".equals(ex.getMessage())) {
                if (ex.getMessage() != null) {
                    throw ex;
                }
                string = "Topic operation failed without exception message. Will retry Topic operation.";
            }
            else {
                final String message = ex.getMessage();
                final StringBuilder sb4 = new StringBuilder(String.valueOf(message).length() + 53);
                sb4.append("Topic operation failed: ");
                sb4.append(message);
                sb4.append(". Will retry Topic operation.");
                string = sb4.toString();
            }
            Log.e("FirebaseMessaging", string);
            return false;
        }
    }
    
    void l(final Runnable runnable, final long n) {
        this.g.schedule(runnable, n, TimeUnit.SECONDS);
    }
    
    @androidx.annotation.b1
    m<Void> m(final z0 z0) {
        this.i.a(z0);
        final n n = new n();
        this.a(z0, (n<Void>)n);
        return (m<Void>)n.a();
    }
    
    void n(final boolean h) {
        synchronized (this) {
            this.h = h;
        }
    }
    
    void p() {
        if (this.f()) {
            this.o();
        }
    }
    
    m<Void> q(final String s) {
        final m<Void> m = this.m(z0.f(s));
        this.p();
        return m;
    }
    
    @androidx.annotation.c1
    boolean r() throws IOException {
        while (true) {
            synchronized (this) {
                final z0 c = this.i.c();
                if (c == null) {
                    if (g()) {
                        Log.d("FirebaseMessaging", "topic sync succeeded");
                    }
                    return true;
                }
                // monitorexit(this)
                if (!this.k(c)) {
                    return false;
                }
                this.i.e(c);
                this.j(c);
            }
        }
    }
    
    void s(final long n) {
        this.l(new d1(this, this.a, this.b, Math.min(Math.max(30L, n + n), c1.j)), n);
        this.n(true);
    }
    
    m<Void> t(final String s) {
        final m<Void> m = this.m(z0.g(s));
        this.p();
        return m;
    }
}
