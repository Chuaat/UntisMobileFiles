// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime;

import com.google.android.datatransport.j;
import androidx.annotation.t0;
import androidx.annotation.b1;
import java.util.concurrent.Callable;
import android.content.Context;
import java.util.Collections;
import com.google.android.datatransport.c;
import java.util.Set;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.q;
import com.google.android.datatransport.runtime.time.b;
import com.google.android.datatransport.runtime.time.h;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.m;
import com.google.android.datatransport.runtime.scheduling.e;
import com.google.android.datatransport.runtime.time.a;
import e6.f;

@f
public class t implements s
{
    private static volatile u e;
    private final a a;
    private final a b;
    private final e c;
    private final m d;
    
    @e6.a
    t(@h final a a, @b final a b, final e c, final m d, final q q) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        q.c();
    }
    
    private i b(final n n) {
        return i.a().i(this.a.a()).k(this.b.a()).j(n.g()).h(new com.google.android.datatransport.runtime.h(n.b(), n.d())).g(n.c().a()).d();
    }
    
    public static t c() {
        final u e = t.e;
        if (e != null) {
            return e.b();
        }
        throw new IllegalStateException("Not initialized!");
    }
    
    private static Set<c> d(final com.google.android.datatransport.runtime.f f) {
        if (f instanceof g) {
            return Collections.unmodifiableSet((Set<? extends c>)((g)f).a());
        }
        return Collections.singleton(c.b("proto"));
    }
    
    public static void f(final Context context) {
        if (t.e == null) {
            synchronized (t.class) {
                if (t.e == null) {
                    t.e = com.google.android.datatransport.runtime.e.c().a(context).h();
                }
            }
        }
    }
    
    @b1
    @t0({ t0.a.K })
    static void i(final u e, final Callable<Void> callable) throws Throwable {
        synchronized (t.class) {
            final u e2 = t.e;
            t.e = e;
            // monitorexit(t.class)
            try {
                callable.call();
                synchronized (t.class) {
                    t.e = e2;
                }
            }
            finally {
                synchronized (t.class) {
                    t.e = e2;
                }
                // monitorexit(t.class)
            }
        }
    }
    
    @Override
    public void a(final n n, final j j) {
        this.c.a(n.f().e(n.c().c()), this.b(n), j);
    }
    
    @t0({ t0.a.G })
    public m e() {
        return this.d;
    }
    
    public com.google.android.datatransport.i g(final com.google.android.datatransport.runtime.f f) {
        return new p(d(f), o.a().b(f.getName()).c(f.getExtras()).a(), this);
    }
    
    @Deprecated
    public com.google.android.datatransport.i h(final String s) {
        return new p(d(null), o.a().b(s).a(), this);
    }
}
