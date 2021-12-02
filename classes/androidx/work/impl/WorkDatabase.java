// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl;

import androidx.work.impl.model.v;
import androidx.work.impl.model.s;
import androidx.work.impl.model.p;
import androidx.work.impl.model.m;
import androidx.work.impl.model.j;
import androidx.work.impl.model.g;
import androidx.work.impl.model.e;
import androidx.work.impl.model.b;
import androidx.sqlite.db.framework.c;
import androidx.room.o2;
import java.util.concurrent.Executor;
import androidx.annotation.j0;
import android.content.Context;
import java.util.concurrent.TimeUnit;
import androidx.work.impl.model.d;
import androidx.work.impl.model.o;
import androidx.work.impl.model.l;
import androidx.work.impl.model.i;
import androidx.work.impl.model.u;
import androidx.work.impl.model.r;
import androidx.work.impl.model.a;
import androidx.room.m0;
import androidx.work.impl.model.x;
import androidx.work.f;
import androidx.room.g3;
import androidx.annotation.t0;
import androidx.room.r2;

@t0({ t0.a.H })
@g3({ androidx.work.f.class, x.class })
@m0(entities = { androidx.work.impl.model.a.class, r.class, u.class, i.class, l.class, o.class, androidx.work.impl.model.d.class }, version = 11)
public abstract class WorkDatabase extends r2
{
    private static final String p = "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < ";
    private static final String q = " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    private static final long r;
    
    static {
        r = TimeUnit.DAYS.toMillis(1L);
    }
    
    @j0
    public static WorkDatabase K(@j0 final Context context, @j0 final Executor executor, final boolean b) {
        Object o;
        if (b) {
            o = o2.c(context, WorkDatabase.class).d();
        }
        else {
            o = o2.a(context, WorkDatabase.class, androidx.work.impl.i.d());
            ((a)o).p(new androidx.sqlite.db.d.c() {
                @j0
                @Override
                public androidx.sqlite.db.d a(@j0 final d.b b) {
                    final d.b.a a = d.b.a(context);
                    a.c(b.b).b(b.c).d(true);
                    return new c().a(a.a());
                }
            });
        }
        return (WorkDatabase)((a)o).t(executor).a(M()).b(new e1.c[] { h.w }).b(new e1.c[] { new h.g(context, 2, 3) }).b(new e1.c[] { h.x }).b(new e1.c[] { h.y }).b(new e1.c[] { new h.g(context, 5, 6) }).b(new e1.c[] { h.z }).b(new e1.c[] { h.A }).b(new e1.c[] { h.B }).b(new e1.c[] { new h.h(context) }).b(new e1.c[] { new h.g(context, 10, 11) }).m().e();
    }
    
    static b M() {
        return new b() {
            @Override
            public void c(@j0 final androidx.sqlite.db.c c) {
                super.c(c);
                c.beginTransaction();
                try {
                    c.J0(WorkDatabase.O());
                    c.n2();
                }
                finally {
                    c.p3();
                }
            }
        };
    }
    
    static long N() {
        return System.currentTimeMillis() - WorkDatabase.r;
    }
    
    @j0
    static String O() {
        final StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < ");
        sb.append(N());
        sb.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
        return sb.toString();
    }
    
    @j0
    public abstract androidx.work.impl.model.b L();
    
    @j0
    public abstract androidx.work.impl.model.e P();
    
    @j0
    public abstract g Q();
    
    @j0
    public abstract j R();
    
    @j0
    public abstract m S();
    
    @j0
    public abstract p T();
    
    @j0
    public abstract s U();
    
    @j0
    public abstract v V();
}
