// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.constraints;

import androidx.work.impl.model.r;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import androidx.annotation.b1;
import androidx.work.impl.constraints.controllers.e;
import androidx.work.impl.constraints.controllers.f;
import androidx.work.impl.constraints.controllers.g;
import androidx.work.impl.constraints.controllers.h;
import androidx.work.impl.constraints.controllers.b;
import androidx.work.impl.utils.taskexecutor.a;
import androidx.annotation.j0;
import android.content.Context;
import androidx.work.q;
import androidx.annotation.k0;
import androidx.work.impl.constraints.controllers.c;

public class d implements a
{
    private static final String d;
    @k0
    private final androidx.work.impl.constraints.c a;
    private final c<?>[] b;
    private final Object c;
    
    static {
        d = q.f("WorkConstraintsTracker");
    }
    
    public d(@j0 Context applicationContext, @j0 final androidx.work.impl.utils.taskexecutor.a a, @k0 final androidx.work.impl.constraints.c a2) {
        applicationContext = applicationContext.getApplicationContext();
        this.a = a2;
        this.b = (c<?>[])new c[] { new androidx.work.impl.constraints.controllers.a(applicationContext, a), new b(applicationContext, a), new h(applicationContext, a), new androidx.work.impl.constraints.controllers.d(applicationContext, a), new g(applicationContext, a), new f(applicationContext, a), new e(applicationContext, a) };
        this.c = new Object();
    }
    
    @b1
    d(@k0 final androidx.work.impl.constraints.c a, final c<?>[] b) {
        this.a = a;
        this.b = b;
        this.c = new Object();
    }
    
    @Override
    public void a(@j0 final List<String> list) {
        synchronized (this.c) {
            final ArrayList<String> list2 = new ArrayList<String>();
            for (final String s : list) {
                if (this.c(s)) {
                    q.c().a(androidx.work.impl.constraints.d.d, String.format("Constraints met for %s", s), new Throwable[0]);
                    list2.add(s);
                }
            }
            final androidx.work.impl.constraints.c a = this.a;
            if (a != null) {
                a.f(list2);
            }
        }
    }
    
    @Override
    public void b(@j0 final List<String> list) {
        synchronized (this.c) {
            final androidx.work.impl.constraints.c a = this.a;
            if (a != null) {
                a.b(list);
            }
        }
    }
    
    public boolean c(@j0 final String s) {
        synchronized (this.c) {
            for (final c<?> c : this.b) {
                if (c.d(s)) {
                    q.c().a(androidx.work.impl.constraints.d.d, String.format("Work %s constrained by %s", s, c.getClass().getSimpleName()), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }
    
    public void d(@j0 final Iterable<r> iterable) {
        synchronized (this.c) {
            final c<?>[] b = this.b;
            final int length = b.length;
            final int n = 0;
            for (int i = 0; i < length; ++i) {
                b[i].g(null);
            }
            final c<?>[] b2 = this.b;
            for (int length2 = b2.length, j = 0; j < length2; ++j) {
                b2[j].e(iterable);
            }
            final c<?>[] b3 = this.b;
            for (int length3 = b3.length, k = n; k < length3; ++k) {
                b3[k].g((c.a)this);
            }
        }
    }
    
    public void e() {
        synchronized (this.c) {
            final c<?>[] b = this.b;
            for (int length = b.length, i = 0; i < length; ++i) {
                b[i].f();
            }
        }
    }
}
