// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.utils;

import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.annotation.b1;
import androidx.work.impl.e;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import androidx.work.f;
import androidx.work.impl.model.s;
import java.util.Iterator;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.l;
import androidx.work.impl.model.u;
import android.os.Build$VERSION;
import java.util.Collections;
import java.util.ArrayList;
import androidx.work.impl.model.r;
import android.text.TextUtils;
import androidx.work.c0;
import androidx.work.k;
import androidx.work.f0;
import java.util.List;
import androidx.work.impl.j;
import androidx.annotation.j0;
import androidx.work.q;
import androidx.work.impl.c;
import androidx.work.impl.g;
import androidx.annotation.t0;

@t0({ t0.a.H })
public class b implements Runnable
{
    private static final String I;
    private final g G;
    private final c H;
    
    static {
        I = q.f("EnqueueRunnable");
    }
    
    public b(@j0 final g g) {
        this.G = g;
        this.H = new c();
    }
    
    private static boolean b(@j0 final g g) {
        final boolean c = c(g.n(), g.m(), g.s(g).toArray(new String[0]), g.k(), g.i());
        g.r();
        return c;
    }
    
    private static boolean c(final j j, @j0 final List<? extends f0> list, String[] array, final String s, final k k) {
        final long currentTimeMillis = System.currentTimeMillis();
        final WorkDatabase m = j.M();
        int n;
        if (array != null && array.length > 0) {
            n = 1;
        }
        else {
            n = 0;
        }
        int n6;
        int n7;
        int n8;
        if (n != 0) {
            final int length = array.length;
            int n2 = 0;
            int n3 = 1;
            int n4 = 0;
            int n5 = 0;
            while (true) {
                n6 = n3;
                n7 = n4;
                n8 = n5;
                if (n2 >= length) {
                    break;
                }
                final String s2 = array[n2];
                final r t = m.U().t(s2);
                if (t == null) {
                    q.c().b(b.I, String.format("Prerequisite %s doesn't exist; not enqueuing", s2), new Throwable[0]);
                    return false;
                }
                final c0.a b = t.b;
                n3 &= ((b == c0.a.I) ? 1 : 0);
                int n9;
                if (b == c0.a.J) {
                    n9 = 1;
                }
                else {
                    n9 = n5;
                    if (b == c0.a.L) {
                        n4 = 1;
                        n9 = n5;
                    }
                }
                ++n2;
                n5 = n9;
            }
        }
        else {
            n6 = 1;
            n7 = 0;
            n8 = 0;
        }
        final boolean b2 = TextUtils.isEmpty((CharSequence)s) ^ true;
        final boolean b3 = b2 && n == 0;
        String[] array2 = array;
        int n10 = n;
        int n11 = n6;
        int n12 = n7;
        int n13 = n8;
        boolean b5 = false;
        Label_0764: {
            if (b3) {
                final List<r.b> e = m.U().e(s);
                array2 = array;
                n10 = n;
                n11 = n6;
                n12 = n7;
                n13 = n8;
                if (!e.isEmpty()) {
                    if (k != k.I && k != k.J) {
                        if (k == k.H) {
                            final Iterator<r.b> iterator = e.iterator();
                            while (iterator.hasNext()) {
                                final c0.a b4 = iterator.next().b;
                                if (b4 == c0.a.G || b4 == c0.a.H) {
                                    return false;
                                }
                            }
                        }
                        a.d(s, j, false).run();
                        final s u = m.U();
                        final Iterator<r.b> iterator2 = e.iterator();
                        while (iterator2.hasNext()) {
                            u.d(iterator2.next().a);
                        }
                        b5 = true;
                        break Label_0764;
                    }
                    final androidx.work.impl.model.b l = m.L();
                    final ArrayList<String> list2 = new ArrayList<String>();
                    for (final r.b b6 : e) {
                        int n15;
                        if (!l.d(b6.a)) {
                            final c0.a b7 = b6.b;
                            final boolean b8 = b7 == c0.a.I;
                            int n16;
                            if (b7 == c0.a.J) {
                                final int n14 = 1;
                                n15 = n7;
                                n16 = n14;
                            }
                            else {
                                n15 = n7;
                                n16 = n8;
                                if (b7 == c0.a.L) {
                                    n15 = 1;
                                    n16 = n8;
                                }
                            }
                            list2.add(b6.a);
                            n6 &= (b8 ? 1 : 0);
                            n8 = n16;
                        }
                        else {
                            n15 = n7;
                        }
                        n7 = n15;
                    }
                    Object emptyList;
                    if (k == k.J && (n7 != 0 || n8 != 0)) {
                        final s u2 = m.U();
                        final Iterator<r.b> iterator4 = u2.e(s).iterator();
                        while (iterator4.hasNext()) {
                            u2.d(iterator4.next().a);
                        }
                        emptyList = Collections.emptyList();
                        n8 = 0;
                        n7 = 0;
                    }
                    else {
                        emptyList = list2;
                    }
                    array2 = (String[])((List)emptyList).toArray(array);
                    if (array2.length > 0) {
                        n10 = 1;
                    }
                    else {
                        n10 = 0;
                    }
                    n13 = n8;
                    n12 = n7;
                    n11 = n6;
                }
            }
            b5 = false;
            n8 = n13;
            n7 = n12;
            n6 = n11;
            n = n10;
            array = array2;
        }
        for (final f0 f0 : list) {
            final r d = f0.d();
            if (n != 0 && n6 == 0) {
                c0.a b9;
                if (n8 != 0) {
                    b9 = c0.a.J;
                }
                else if (n7 != 0) {
                    b9 = c0.a.L;
                }
                else {
                    b9 = c0.a.K;
                }
                d.b = b9;
            }
            else if (!d.d()) {
                d.n = currentTimeMillis;
            }
            else {
                d.n = 0L;
            }
            final int sdk_INT = Build$VERSION.SDK_INT;
            if ((sdk_INT >= 23 && sdk_INT <= 25) || (sdk_INT <= 22 && h(j, "androidx.work.impl.background.gcm.GcmScheduler"))) {
                g(d);
            }
            if (d.b == c0.a.G) {
                b5 = true;
            }
            m.U().h(d);
            if (n != 0) {
                for (int length2 = array.length, i = 0; i < length2; ++i) {
                    m.L().a(new androidx.work.impl.model.a(f0.b(), array[i]));
                }
            }
            final Iterator<String> iterator6 = f0.c().iterator();
            while (iterator6.hasNext()) {
                m.V().a(new u(iterator6.next(), f0.b()));
            }
            if (b2) {
                m.S().a(new l(s, f0.b()));
            }
        }
        return b5;
    }
    
    private static boolean e(@j0 final g g) {
        final List<g> l = g.l();
        boolean b = false;
        if (l != null) {
            final Iterator<g> iterator = l.iterator();
            b = false;
            while (iterator.hasNext()) {
                final g g2 = iterator.next();
                if (!g2.q()) {
                    b |= e(g2);
                }
                else {
                    q.c().h(androidx.work.impl.utils.b.I, String.format("Already enqueued work ids (%s).", TextUtils.join((CharSequence)", ", (Iterable)g2.j())), new Throwable[0]);
                }
            }
        }
        return b(g) | b;
    }
    
    private static void g(final r r) {
        final androidx.work.c j = r.j;
        if (j.f() || j.i()) {
            final String c = r.c;
            final f.a a = new f.a();
            a.c(r.e).q("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", c);
            r.c = ConstraintTrackingWorker.class.getName();
            r.e = a.a();
        }
    }
    
    private static boolean h(@j0 final j j, @j0 final String className) {
        try {
            final Class<?> forName = Class.forName(className);
            final Iterator<e> iterator = j.L().iterator();
            while (iterator.hasNext()) {
                if (forName.isAssignableFrom(iterator.next().getClass())) {
                    return true;
                }
            }
            return false;
        }
        catch (ClassNotFoundException ex) {
            return false;
        }
    }
    
    @b1
    public boolean a() {
        final WorkDatabase m = this.G.n().M();
        m.e();
        try {
            final boolean e = e(this.G);
            m.I();
            return e;
        }
        finally {
            m.k();
        }
    }
    
    public androidx.work.u d() {
        return this.H;
    }
    
    @b1
    public void f() {
        final j n = this.G.n();
        androidx.work.impl.f.b(n.F(), n.M(), n.L());
    }
    
    @Override
    public void run() {
        try {
            if (this.G.o()) {
                throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", this.G));
            }
            if (this.a()) {
                androidx.work.impl.utils.e.c(this.G.n().E(), RescheduleReceiver.class, true);
                this.f();
            }
            this.H.b((androidx.work.u.b)androidx.work.u.a);
        }
        finally {
            final Throwable t;
            this.H.b((androidx.work.u.b)new androidx.work.u.b.a(t));
        }
    }
}
