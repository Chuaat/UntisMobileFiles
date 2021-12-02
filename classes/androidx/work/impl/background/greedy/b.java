// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.background.greedy;

import java.util.List;
import java.util.Collection;
import android.text.TextUtils;
import android.os.Build$VERSION;
import androidx.work.c0;
import java.util.Iterator;
import androidx.work.impl.utils.g;
import androidx.annotation.b1;
import java.util.HashSet;
import androidx.annotation.j0;
import androidx.work.q;
import androidx.work.impl.model.r;
import java.util.Set;
import androidx.work.impl.constraints.d;
import androidx.work.impl.j;
import android.content.Context;
import androidx.annotation.t0;
import androidx.work.impl.constraints.c;
import androidx.work.impl.e;

@t0({ t0.a.H })
public class b implements e, c, androidx.work.impl.b
{
    private static final String O;
    private final Context G;
    private final j H;
    private final d I;
    private final Set<r> J;
    private a K;
    private boolean L;
    private final Object M;
    Boolean N;
    
    static {
        O = q.f("GreedyScheduler");
    }
    
    public b(@j0 final Context g, @j0 final androidx.work.b b, @j0 final androidx.work.impl.utils.taskexecutor.a a, @j0 final j h) {
        this.J = new HashSet<r>();
        this.G = g;
        this.H = h;
        this.I = new d(g, a, this);
        this.K = new a(this, b.j());
        this.M = new Object();
    }
    
    @b1
    public b(@j0 final Context g, @j0 final j h, @j0 final d i) {
        this.J = new HashSet<r>();
        this.G = g;
        this.H = h;
        this.I = i;
        this.M = new Object();
    }
    
    private void g() {
        this.N = g.b(this.G, this.H.F());
    }
    
    private void h() {
        if (!this.L) {
            this.H.J().c(this);
            this.L = true;
        }
    }
    
    private void i(@j0 final String anObject) {
        synchronized (this.M) {
            for (final r r : this.J) {
                if (r.a.equals(anObject)) {
                    q.c().a(b.O, String.format("Stopping tracking for %s", anObject), new Throwable[0]);
                    this.J.remove(r);
                    this.I.d(this.J);
                    break;
                }
            }
        }
    }
    
    @Override
    public void a(@j0 final r... array) {
        if (this.N == null) {
            this.g();
        }
        if (!this.N) {
            q.c().d(b.O, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        this.h();
        final HashSet<r> set = new HashSet<r>();
        final HashSet<String> set2 = new HashSet<String>();
        for (final r r : array) {
            final long a = r.a();
            final long currentTimeMillis = System.currentTimeMillis();
            if (r.b == c0.a.G) {
                if (currentTimeMillis < a) {
                    final a k = this.K;
                    if (k != null) {
                        k.a(r);
                    }
                }
                else if (r.b()) {
                    final int sdk_INT = Build$VERSION.SDK_INT;
                    if (sdk_INT >= 23 && r.j.h()) {
                        q.c().a(b.O, String.format("Ignoring WorkSpec %s, Requires device idle.", r), new Throwable[0]);
                    }
                    else if (sdk_INT >= 24 && r.j.e()) {
                        q.c().a(b.O, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", r), new Throwable[0]);
                    }
                    else {
                        set.add(r);
                        set2.add(r.a);
                    }
                }
                else {
                    q.c().a(b.O, String.format("Starting work for %s", r.a), new Throwable[0]);
                    this.H.U(r.a);
                }
            }
        }
        synchronized (this.M) {
            if (!set.isEmpty()) {
                q.c().a(b.O, String.format("Starting tracking for [%s]", TextUtils.join((CharSequence)",", (Iterable)set2)), new Throwable[0]);
                this.J.addAll(set);
                this.I.d(this.J);
            }
        }
    }
    
    @Override
    public void b(@j0 final List<String> list) {
        for (final String s : list) {
            q.c().a(b.O, String.format("Constraints not met: Cancelling work ID %s", s), new Throwable[0]);
            this.H.X(s);
        }
    }
    
    @Override
    public boolean c() {
        return false;
    }
    
    @Override
    public void d(@j0 final String s, final boolean b) {
        this.i(s);
    }
    
    @Override
    public void e(@j0 final String s) {
        if (this.N == null) {
            this.g();
        }
        if (!this.N) {
            q.c().d(b.O, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        this.h();
        q.c().a(b.O, String.format("Cancelling work ID %s", s), new Throwable[0]);
        final a k = this.K;
        if (k != null) {
            k.b(s);
        }
        this.H.X(s);
    }
    
    @Override
    public void f(@j0 final List<String> list) {
        for (final String s : list) {
            q.c().a(b.O, String.format("Constraints met: Scheduling work ID %s", s), new Throwable[0]);
            this.H.U(s);
        }
    }
    
    @b1
    public void j(@j0 final a k) {
        this.K = k;
    }
}
