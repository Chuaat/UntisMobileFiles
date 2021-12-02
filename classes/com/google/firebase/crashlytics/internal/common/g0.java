// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.common;

import java.util.Collection;
import java.util.concurrent.Executor;
import com.google.firebase.crashlytics.internal.model.a0$e;
import com.google.firebase.crashlytics.internal.model.a0$e$b;
import java.util.Iterator;
import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;
import androidx.annotation.j0;
import java.util.Map;
import java.io.File;
import com.google.firebase.crashlytics.internal.settings.e;
import c3.d;
import com.google.firebase.crashlytics.internal.persistence.h;
import android.content.Context;
import androidx.annotation.b1;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import androidx.annotation.k0;
import java.io.InputStream;
import androidx.annotation.p0;
import java.io.IOException;
import com.google.firebase.crashlytics.internal.model.a0$a;
import android.app.ApplicationExitInfo;
import com.google.firebase.crashlytics.internal.model.a0$f$d$b;
import java.util.List;
import com.google.firebase.crashlytics.internal.model.b0;
import com.google.firebase.crashlytics.internal.f;
import com.google.firebase.crashlytics.internal.model.a0$f$d$d;
import com.google.firebase.crashlytics.internal.model.a0$f$d;
import com.google.firebase.crashlytics.internal.model.a0$d;
import com.google.android.gms.tasks.m;
import com.google.firebase.crashlytics.internal.log.b;
import com.google.firebase.crashlytics.internal.send.c;
import com.google.firebase.crashlytics.internal.persistence.g;

public class g0 implements n
{
    private static final String f = "crash";
    private static final String g = "error";
    private static final int h = 4;
    private static final int i = 8;
    private final o a;
    private final g b;
    private final c c;
    private final b d;
    private final i0 e;
    
    g0(final o a, final g b, final c c, final b d, final i0 e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    private a0$f$d g(final a0$f$d a0$f$d) {
        return this.h(a0$f$d, this.d, this.e);
    }
    
    private a0$f$d h(final a0$f$d a0$f$d, final b b, final i0 i0) {
        final a0$f$d$b g = a0$f$d.g();
        final String d = b.d();
        if (d != null) {
            g.d(a0$f$d$d.a().b(d).a());
        }
        else {
            com.google.firebase.crashlytics.internal.f.f().k("No log data to include with this event.");
        }
        final List<a0$d> n = n(i0.a());
        final List<a0$d> n2 = n(i0.b());
        if (!n.isEmpty()) {
            g.b(a0$f$d.b().g().c(b0.b((List)n)).e(b0.b((List)n2)).a());
        }
        return g.a();
    }
    
    @p0(api = 30)
    private static a0$a i(final ApplicationExitInfo applicationExitInfo) {
        String j = null;
        try {
            j = j(applicationExitInfo.getTraceInputStream());
            return a0$a.a().b(applicationExitInfo.getImportance()).d(applicationExitInfo.getProcessName()).f(applicationExitInfo.getReason()).h(applicationExitInfo.getTimestamp()).c(applicationExitInfo.getPid()).e(applicationExitInfo.getPss()).g(applicationExitInfo.getRss()).i(j).a();
        }
        catch (NullPointerException j) {}
        catch (IOException ex) {}
        final f f = com.google.firebase.crashlytics.internal.f.f();
        final StringBuilder sb = new StringBuilder();
        sb.append("Could not get input trace in application exit info: ");
        sb.append(applicationExitInfo.toString());
        sb.append(" Error: ");
        sb.append((Object)j);
        f.m(sb.toString());
        j = null;
        return a0$a.a().b(applicationExitInfo.getImportance()).d(applicationExitInfo.getProcessName()).f(applicationExitInfo.getReason()).h(applicationExitInfo.getTimestamp()).c(applicationExitInfo.getPid()).e(applicationExitInfo.getPss()).g(applicationExitInfo.getRss()).i(j).a();
    }
    
    @b1
    @p0(api = 19)
    public static String j(@k0 InputStream in) throws IOException, NullPointerException {
        final StringBuilder sb = new StringBuilder();
        in = (InputStream)new BufferedReader(new InputStreamReader(in, Charset.forName(StandardCharsets.UTF_8.name())));
        try {
            while (true) {
                final int read = ((Reader)in).read();
                if (read == -1) {
                    break;
                }
                sb.append((char)read);
            }
            final String string = sb.toString();
            ((Reader)in).close();
            return string;
        }
        finally {
            try {
                ((Reader)in).close();
            }
            finally {
                final Throwable t;
                final Throwable exception;
                t.addSuppressed(exception);
            }
        }
    }
    
    public static g0 k(final Context context, final w w, final h h, final a a, final b b, final i0 i0, final d d, final e e) {
        return new g0(new o(context, w, a, d), new g(new File(h.a()), e), c.c(context), b, i0);
    }
    
    @j0
    private static List<a0$d> n(@j0 final Map<String, String> map) {
        final ArrayList<Object> list = new ArrayList<Object>();
        list.ensureCapacity(map.size());
        for (final Map.Entry<String, String> entry : map.entrySet()) {
            list.add(a0$d.a().b((String)entry.getKey()).c((String)entry.getValue()).a());
        }
        Collections.sort(list, f0.G);
        return (List<a0$d>)list;
    }
    
    private boolean r(@j0 final m<p> m) {
        if (m.v()) {
            final p p = m.r();
            final f f = com.google.firebase.crashlytics.internal.f.f();
            final StringBuilder sb = new StringBuilder();
            sb.append("Crashlytics report successfully enqueued to DataTransport: ");
            sb.append(p.c());
            f.b(sb.toString());
            this.b.m(p.c());
            return true;
        }
        com.google.firebase.crashlytics.internal.f.f().n("Crashlytics report could not be enqueued to DataTransport", m.q());
        return false;
    }
    
    private void t(@j0 final Throwable t, @j0 final Thread thread, @j0 final String s, @j0 final String s2, final long n, final boolean b) {
        this.b.J(this.g(this.a.c(t, thread, s2, n, 4, 8, b)), s, s2.equals("crash"));
    }
    
    @Override
    public void a(final String s, final String s2) {
        this.e.d(s, s2);
    }
    
    @Override
    public void b(@j0 final String s, final long n) {
        this.b.K(this.a.d(s, n));
    }
    
    @Override
    public void c(final long n, final String s) {
        this.d.i(n, s);
    }
    
    @Override
    public void d(final String s) {
        this.e.g(s);
    }
    
    public void l(@j0 final String s, @j0 final List<com.google.firebase.crashlytics.internal.common.b0> list) {
        final ArrayList<a0$e$b> list2 = new ArrayList<a0$e$b>();
        final Iterator<com.google.firebase.crashlytics.internal.common.b0> iterator = list.iterator();
        while (iterator.hasNext()) {
            final a0$e$b c = iterator.next().c();
            if (c != null) {
                list2.add(c);
            }
        }
        this.b.o(s, a0$e.a().b(b0.b((List)list2)).a());
    }
    
    public void m(final long n, @k0 final String s) {
        this.b.n(s, n);
    }
    
    public boolean o() {
        return this.b.x();
    }
    
    @j0
    public List<String> q() {
        return (List<String>)this.b.E();
    }
    
    @p0(api = 30)
    public void s(final String str, final ApplicationExitInfo applicationExitInfo, final b b, final i0 i0) {
        if (applicationExitInfo.getTimestamp() < this.b.w(str)) {
            return;
        }
        if (applicationExitInfo.getReason() != 6) {
            return;
        }
        final a0$f$d b2 = this.a.b(i(applicationExitInfo));
        final f f = com.google.firebase.crashlytics.internal.f.f();
        final StringBuilder sb = new StringBuilder();
        sb.append("Persisting anr for session ");
        sb.append(str);
        f.b(sb.toString());
        this.b.J(this.h(b2, b, i0), str, true);
    }
    
    public void u(@j0 final Throwable t, @j0 final Thread thread, @j0 final String str, final long n) {
        final f f = com.google.firebase.crashlytics.internal.f.f();
        final StringBuilder sb = new StringBuilder();
        sb.append("Persisting fatal event for session ");
        sb.append(str);
        f.k(sb.toString());
        this.t(t, thread, str, "crash", n, true);
    }
    
    public void v(@j0 final Throwable t, @j0 final Thread thread, @j0 final String str, final long n) {
        final f f = com.google.firebase.crashlytics.internal.f.f();
        final StringBuilder sb = new StringBuilder();
        sb.append("Persisting non-fatal event for session ");
        sb.append(str);
        f.k(sb.toString());
        this.t(t, thread, str, "error", n, false);
    }
    
    public void w(@j0 final String s) {
        final String c = this.e.c();
        if (c == null) {
            com.google.firebase.crashlytics.internal.f.f().k("Could not persist user ID; no user ID available");
            return;
        }
        this.b.L(c, s);
    }
    
    public void x() {
        this.b.l();
    }
    
    public m<Void> y(@j0 final Executor executor) {
        final List f = this.b.F();
        final ArrayList<m<?>> list = new ArrayList<m<?>>();
        final Iterator<p> iterator = f.iterator();
        while (iterator.hasNext()) {
            list.add(this.c.g((p)iterator.next()).n(executor, new e0(this)));
        }
        return com.google.android.gms.tasks.p.h(list);
    }
}
