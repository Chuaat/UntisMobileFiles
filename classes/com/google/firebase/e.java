// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase;

import android.content.Intent;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.os.Looper;
import android.os.Handler;
import android.app.Application;
import java.util.concurrent.atomic.AtomicReference;
import android.annotation.TargetApi;
import androidx.annotation.t0;
import com.google.android.gms.common.internal.v;
import androidx.annotation.k0;
import androidx.core.os.w;
import java.nio.charset.Charset;
import android.text.TextUtils;
import java.util.Collections;
import java.util.ArrayList;
import androidx.annotation.b1;
import java.util.Iterator;
import android.util.Log;
import j3.c;
import com.google.firebase.components.k;
import n3.b;
import java.util.Collection;
import android.app.Service;
import com.google.firebase.components.i;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.android.gms.common.internal.x;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;
import com.google.firebase.components.z;
import java.util.concurrent.atomic.AtomicBoolean;
import com.google.firebase.components.q;
import android.content.Context;
import d6.a;
import java.util.Map;
import java.util.concurrent.Executor;
import androidx.annotation.j0;

public class e
{
    private static final String j = "FirebaseApp";
    @j0
    public static final String k = "[DEFAULT]";
    private static final Object l;
    private static final Executor m;
    @a("LOCK")
    static final Map<String, e> n;
    private static final String o = "fire-android";
    private static final String p = "fire-core";
    private static final String q = "kotlin";
    private final Context a;
    private final String b;
    private final o c;
    private final q d;
    private final AtomicBoolean e;
    private final AtomicBoolean f;
    private final z<r3.a> g;
    private final List<b> h;
    private final List<f> i;
    
    static {
        l = new Object();
        m = new d();
        n = new androidx.collection.a<String, e>();
    }
    
    protected e(final Context context, final String s, final o o) {
        this.e = new AtomicBoolean(false);
        this.f = new AtomicBoolean();
        this.h = new CopyOnWriteArrayList<b>();
        this.i = new CopyOnWriteArrayList<f>();
        this.a = x.k(context);
        this.b = x.g(s);
        this.c = x.k(o);
        this.d = com.google.firebase.components.q.k(com.google.firebase.e.m).d(com.google.firebase.components.i.d(context, ComponentDiscoveryService.class).c()).c(new FirebaseCommonRegistrar()).b(com.google.firebase.components.f.t(context, Context.class, (Class<? super Context>[])new Class[0])).b(com.google.firebase.components.f.t(this, e.class, (Class<? super e>[])new Class[0])).b(com.google.firebase.components.f.t(o, o.class, (Class<? super o>[])new Class[0])).e();
        this.g = new z<r3.a>((n3.b<r3.a>)new com.google.firebase.d(this, context));
    }
    
    private static String C(@j0 final String s) {
        return s.trim();
    }
    
    private void D(final boolean b) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        final Iterator<b> iterator = this.h.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(b);
        }
    }
    
    private void E() {
        final Iterator<f> iterator = this.i.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(this.b, this.c);
        }
    }
    
    private void h() {
        x.r(this.f.get() ^ true, "FirebaseApp was deleted");
    }
    
    @b1
    public static void i() {
        synchronized (e.l) {
            e.n.clear();
        }
    }
    
    private static List<String> l() {
        final ArrayList<String> list = (ArrayList<String>)new ArrayList<Comparable>();
        synchronized (e.l) {
            final Iterator<e> iterator = e.n.values().iterator();
            while (iterator.hasNext()) {
                list.add(iterator.next().q());
            }
            // monitorexit(e.l)
            Collections.sort((List<Comparable>)list);
            return list;
        }
    }
    
    @j0
    public static List<e> n(@j0 final Context context) {
        synchronized (e.l) {
            return new ArrayList<e>(e.n.values());
        }
    }
    
    @j0
    public static e o() {
        synchronized (e.l) {
            final e e = com.google.firebase.e.n.get("[DEFAULT]");
            if (e != null) {
                return e;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Default FirebaseApp is not initialized in this process ");
            sb.append(com.google.android.gms.common.util.x.a());
            sb.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
            throw new IllegalStateException(sb.toString());
        }
    }
    
    @j0
    public static e p(@j0 String format) {
        synchronized (e.l) {
            final e e = com.google.firebase.e.n.get(C(format));
            if (e != null) {
                return e;
            }
            final List<String> l = l();
            String string;
            if (l.isEmpty()) {
                string = "";
            }
            else {
                final StringBuilder sb = new StringBuilder();
                sb.append("Available app names: ");
                sb.append(TextUtils.join((CharSequence)", ", (Iterable)l));
                string = sb.toString();
            }
            format = String.format("FirebaseApp with name %s doesn't exist. %s", format, string);
            throw new IllegalStateException(format);
        }
    }
    
    @f2.a
    public static String t(final String s, final o o) {
        final StringBuilder sb = new StringBuilder();
        sb.append(com.google.android.gms.common.util.c.f(s.getBytes(Charset.defaultCharset())));
        sb.append("+");
        sb.append(com.google.android.gms.common.util.c.f(o.j().getBytes(Charset.defaultCharset())));
        return sb.toString();
    }
    
    private void u() {
        if (w.a(this.a) ^ true) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            sb.append(this.q());
            Log.i("FirebaseApp", sb.toString());
            b(this.a);
        }
        else {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Device unlocked: initializing all Firebase APIs for app ");
            sb2.append(this.q());
            Log.i("FirebaseApp", sb2.toString());
            this.d.o(this.A());
        }
    }
    
    @k0
    public static e w(@j0 final Context context) {
        synchronized (e.l) {
            if (e.n.containsKey("[DEFAULT]")) {
                return o();
            }
            final o h = com.google.firebase.o.h(context);
            if (h == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            return x(context, h);
        }
    }
    
    @j0
    public static e x(@j0 final Context context, @j0 final o o) {
        return y(context, o, "[DEFAULT]");
    }
    
    @j0
    public static e y(@j0 Context applicationContext, @j0 final o o, @j0 String c) {
        c(applicationContext);
        c = C(c);
        if (applicationContext.getApplicationContext() != null) {
            applicationContext = applicationContext.getApplicationContext();
        }
        synchronized (e.l) {
            final Map<String, e> n = e.n;
            final boolean b = !n.containsKey(c);
            final StringBuilder sb = new StringBuilder();
            sb.append("FirebaseApp name ");
            sb.append(c);
            sb.append(" already exists!");
            x.r(b, sb.toString());
            x.l(applicationContext, "Application context cannot be null.");
            final e e = new e(applicationContext, c, o);
            n.put(c, e);
            // monitorexit(e.l)
            e.u();
            return e;
        }
    }
    
    @b1
    @f2.a
    public boolean A() {
        return "[DEFAULT]".equals(this.q());
    }
    
    @f2.a
    public void F(final b b) {
        this.h();
        this.h.remove(b);
    }
    
    @f2.a
    public void G(@j0 final f f) {
        this.h();
        x.k(f);
        this.i.remove(f);
    }
    
    public void H(final boolean newValue) {
        this.h();
        if (this.e.compareAndSet(newValue ^ true, newValue)) {
            final boolean d = com.google.android.gms.common.api.internal.d.b().d();
            boolean b;
            if (newValue && d) {
                b = true;
            }
            else {
                if (newValue || !d) {
                    return;
                }
                b = false;
            }
            this.D(b);
        }
    }
    
    @f2.a
    public void I(final Boolean b) {
        this.h();
        this.g.get().e(b);
    }
    
    @Deprecated
    @f2.a
    public void J(final boolean b) {
        this.I(b);
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof e && this.b.equals(((e)o).q());
    }
    
    @f2.a
    public void f(final b b) {
        this.h();
        if (this.e.get() && com.google.android.gms.common.api.internal.d.b().d()) {
            b.a(true);
        }
        this.h.add(b);
    }
    
    @f2.a
    public void g(@j0 final f f) {
        this.h();
        x.k(f);
        this.i.add(f);
    }
    
    @Override
    public int hashCode() {
        return this.b.hashCode();
    }
    
    public void j() {
        if (!this.f.compareAndSet(false, true)) {
            return;
        }
        synchronized (com.google.firebase.e.l) {
            com.google.firebase.e.n.remove(this.b);
            // monitorexit(e.l)
            this.E();
        }
    }
    
    @f2.a
    public <T> T k(final Class<T> clazz) {
        this.h();
        return (T)this.d.a(clazz);
    }
    
    @j0
    public Context m() {
        this.h();
        return this.a;
    }
    
    @j0
    public String q() {
        this.h();
        return this.b;
    }
    
    @j0
    public o r() {
        this.h();
        return this.c;
    }
    
    @f2.a
    public String s() {
        final StringBuilder sb = new StringBuilder();
        sb.append(com.google.android.gms.common.util.c.f(this.q().getBytes(Charset.defaultCharset())));
        sb.append("+");
        sb.append(com.google.android.gms.common.util.c.f(this.r().j().getBytes(Charset.defaultCharset())));
        return sb.toString();
    }
    
    @Override
    public String toString() {
        return v.d(this).a("name", this.b).a("options", this.c).toString();
    }
    
    @b1
    @t0({ t0.a.K })
    void v() {
        this.d.n();
    }
    
    @f2.a
    public boolean z() {
        this.h();
        return this.g.get().b();
    }
    
    @f2.a
    public interface b
    {
        @f2.a
        void a(final boolean p0);
    }
    
    @TargetApi(14)
    private static class c implements a
    {
        private static AtomicReference<c> a;
        
        static {
            c.a = new AtomicReference<c>();
        }
        
        private static void c(final Context context) {
            if (com.google.android.gms.common.util.v.c()) {
                if (context.getApplicationContext() instanceof Application) {
                    final Application application = (Application)context.getApplicationContext();
                    if (c.a.get() == null) {
                        final c newValue = new c();
                        if (c.a.compareAndSet(null, newValue)) {
                            com.google.android.gms.common.api.internal.d.c(application);
                            com.google.android.gms.common.api.internal.d.b().a((a)newValue);
                        }
                    }
                }
            }
        }
        
        @Override
        public void a(final boolean b) {
            synchronized (com.google.firebase.e.l) {
                for (final e e : new ArrayList<e>(com.google.firebase.e.n.values())) {
                    if (e.e.get()) {
                        e.D(b);
                    }
                }
            }
        }
    }
    
    private static class d implements Executor
    {
        private static final Handler G;
        
        static {
            G = new Handler(Looper.getMainLooper());
        }
        
        @Override
        public void execute(@j0 final Runnable runnable) {
            d.G.post(runnable);
        }
    }
    
    @TargetApi(24)
    private static class e extends BroadcastReceiver
    {
        private static AtomicReference<e> b;
        private final Context a;
        
        static {
            e.b = new AtomicReference<e>();
        }
        
        public e(final Context a) {
            this.a = a;
        }
        
        private static void b(final Context context) {
            if (e.b.get() == null) {
                final e newValue = new e(context);
                if (e.b.compareAndSet(null, newValue)) {
                    context.registerReceiver((BroadcastReceiver)newValue, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }
        
        public void c() {
            this.a.unregisterReceiver((BroadcastReceiver)this);
        }
        
        public void onReceive(final Context context, final Intent intent) {
            synchronized (com.google.firebase.e.l) {
                final Iterator<com.google.firebase.e> iterator = com.google.firebase.e.n.values().iterator();
                while (iterator.hasNext()) {
                    iterator.next().u();
                }
                // monitorexit(e.b())
                this.c();
            }
        }
    }
}
