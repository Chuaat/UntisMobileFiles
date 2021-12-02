// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.background.systemalarm;

import androidx.annotation.c1;
import android.content.Intent;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import androidx.work.impl.model.r;
import androidx.annotation.j0;
import androidx.work.q;
import androidx.work.impl.constraints.d;
import android.content.Context;
import androidx.annotation.t0;

@t0({ t0.a.H })
class c
{
    private static final String e;
    private final Context a;
    private final int b;
    private final e c;
    private final d d;
    
    static {
        e = q.f("ConstraintsCmdHandler");
    }
    
    c(@j0 final Context a, final int b, @j0 final e c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = new d(a, c.f(), null);
    }
    
    @c1
    void a() {
        final List<r> i = this.c.g().M().U().i();
        ConstraintProxy.a(this.a, i);
        this.d.d(i);
        final ArrayList list = new ArrayList<r>(i.size());
        final long currentTimeMillis = System.currentTimeMillis();
        for (final r r : i) {
            final String a = r.a;
            if (currentTimeMillis >= r.a() && (!r.b() || this.d.c(a))) {
                list.add(r);
            }
        }
        final Iterator<r> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            final String a2 = iterator2.next().a;
            final Intent b = androidx.work.impl.background.systemalarm.b.b(this.a, a2);
            q.c().a(androidx.work.impl.background.systemalarm.c.e, String.format("Creating a delay_met command for workSpec with id (%s)", a2), new Throwable[0]);
            final e c = this.c;
            c.k(new e.b(c, b, this.b));
        }
        this.d.e();
    }
}
