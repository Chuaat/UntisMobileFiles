// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.persistence.dao;

import androidx.sqlite.db.e;
import org.joda.time.t;
import android.database.Cursor;
import java.util.ArrayList;
import android.os.CancellationSignal;
import androidx.sqlite.db.f;
import androidx.room.v2;
import androidx.room.j0;
import java.util.concurrent.Callable;
import kotlin.j2;
import kotlin.coroutines.d;
import java.util.Collections;
import java.util.List;
import androidx.room.a3;
import com.untis.mobile.utils.persistence.typeconverter.b;
import com.untis.mobile.utils.persistence.typeconverter.c;
import com.untis.mobile.dashboard.persistence.model.event.homework.DashboardHomework;
import androidx.room.u0;
import androidx.room.r2;

public final class h implements g
{
    private final r2 a;
    private final u0<DashboardHomework> b;
    private final c c;
    private final b d;
    private final a3 e;
    
    public h(final r2 a) {
        this.c = new c();
        this.d = new b();
        this.a = a;
        this.b = new u0<DashboardHomework>(a) {
            public void a(final androidx.sqlite.db.h h, final DashboardHomework dashboardHomework) {
                ((e)h).l2(1, dashboardHomework.getId());
                ((e)h).l2(2, dashboardHomework.getWuId());
                ((e)h).l2(3, dashboardHomework.getLessonId());
                final String e = h.this.c.e(dashboardHomework.getStart());
                if (e == null) {
                    ((e)h).c4(4);
                }
                else {
                    ((e)h).K0(4, e);
                }
                final String e2 = h.this.c.e(dashboardHomework.getEnd());
                if (e2 == null) {
                    ((e)h).c4(5);
                }
                else {
                    ((e)h).K0(5, e2);
                }
                if (dashboardHomework.getText() == null) {
                    ((e)h).c4(6);
                }
                else {
                    ((e)h).K0(6, dashboardHomework.getText());
                }
                if (dashboardHomework.getRemark() == null) {
                    ((e)h).c4(7);
                }
                else {
                    ((e)h).K0(7, dashboardHomework.getRemark());
                }
                ((e)h).l2(8, (long)(dashboardHomework.getCompleted() ? 1 : 0));
                final String a = h.this.d.a(dashboardHomework.getAttachments());
                if (a == null) {
                    ((e)h).c4(9);
                }
                else {
                    ((e)h).K0(9, a);
                }
                final Integer b = h.this.d.b(dashboardHomework.getEntityType());
                if (b == null) {
                    ((e)h).c4(10);
                }
                else {
                    ((e)h).l2(10, (long)b);
                }
                if (dashboardHomework.getEntityId() == null) {
                    ((e)h).c4(11);
                }
                else {
                    ((e)h).l2(11, (long)dashboardHomework.getEntityId());
                }
                if (dashboardHomework.getSubjectId() == null) {
                    ((e)h).c4(12);
                }
                else {
                    ((e)h).l2(12, (long)dashboardHomework.getSubjectId());
                }
            }
            
            public String createQuery() {
                return "INSERT OR REPLACE INTO `dashboard_homework` (`homework_id`,`homework_wu_id`,`lesson_id`,`start`,`end`,`text`,`remark`,`completed`,`attachments`,`entity_type`,`entity_id`,`subject_id`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?)";
            }
        };
        this.e = new a3(a) {
            public String createQuery() {
                return "DELETE FROM dashboard_homework";
            }
        };
    }
    
    public static List<Class<?>> i() {
        return Collections.emptyList();
    }
    
    @Override
    public Object a(final List<DashboardHomework> list, final d<? super j2> d) {
        return j0.c(this.a, true, (Callable)new Callable<j2>() {
            public j2 a() throws Exception {
                h.this.a.e();
                try {
                    h.this.b.insert((Iterable)list);
                    h.this.a.I();
                    return j2.a;
                }
                finally {
                    h.this.a.k();
                }
            }
        }, (d)d);
    }
    
    @Override
    public Object b(final d<? super j2> d) {
        return j0.c(this.a, true, (Callable)new Callable<j2>() {
            public j2 a() throws Exception {
                final androidx.sqlite.db.h acquire = h.this.e.acquire();
                h.this.a.e();
                try {
                    acquire.c1();
                    h.this.a.I();
                    return j2.a;
                }
                finally {
                    h.this.a.k();
                    h.this.e.release(acquire);
                }
            }
        }, (d)d);
    }
    
    @Override
    public Object c(final DashboardHomework dashboardHomework, final d<? super j2> d) {
        return j0.c(this.a, true, (Callable)new Callable<j2>() {
            public j2 a() throws Exception {
                h.this.a.e();
                try {
                    h.this.b.insert((Object)dashboardHomework);
                    h.this.a.I();
                    return j2.a;
                }
                finally {
                    h.this.a.k();
                }
            }
        }, (d)d);
    }
    
    @Override
    public Object findAll(final d<? super List<DashboardHomework>> d) {
        return j0.b(this.a, false, androidx.room.util.c.a(), (Callable)new Callable<List<DashboardHomework>>() {
            final /* synthetic */ v2 G = v2.d("SELECT * FROM dashboard_homework", 0);
            
            public List<DashboardHomework> a() throws Exception {
                final Cursor d = androidx.room.util.c.d(h.this.a, (f)this.G, false, (CancellationSignal)null);
                try {
                    final int e = androidx.room.util.b.e(d, "homework_id");
                    final int e2 = androidx.room.util.b.e(d, "homework_wu_id");
                    final int e3 = androidx.room.util.b.e(d, "lesson_id");
                    final int e4 = androidx.room.util.b.e(d, "start");
                    final int e5 = androidx.room.util.b.e(d, "end");
                    final int e6 = androidx.room.util.b.e(d, "text");
                    final int e7 = androidx.room.util.b.e(d, "remark");
                    final int e8 = androidx.room.util.b.e(d, "completed");
                    final int e9 = androidx.room.util.b.e(d, "attachments");
                    final int e10 = androidx.room.util.b.e(d, "entity_type");
                    final int e11 = androidx.room.util.b.e(d, "entity_id");
                    final int e12 = androidx.room.util.b.e(d, "subject_id");
                    final ArrayList list = new ArrayList<DashboardHomework>(d.getCount());
                    while (d.moveToNext()) {
                        final long long1 = d.getLong(e);
                        final long long2 = d.getLong(e2);
                        final long long3 = d.getLong(e3);
                        String string;
                        if (d.isNull(e4)) {
                            string = null;
                        }
                        else {
                            string = d.getString(e4);
                        }
                        final t c = h.this.c.c(string);
                        String string2;
                        if (d.isNull(e5)) {
                            string2 = null;
                        }
                        else {
                            string2 = d.getString(e5);
                        }
                        final t c2 = h.this.c.c(string2);
                        String string3;
                        if (d.isNull(e6)) {
                            string3 = null;
                        }
                        else {
                            string3 = d.getString(e6);
                        }
                        String string4;
                        if (d.isNull(e7)) {
                            string4 = null;
                        }
                        else {
                            string4 = d.getString(e7);
                        }
                        final boolean b = d.getInt(e8) != 0;
                        String string5;
                        if (d.isNull(e9)) {
                            string5 = null;
                        }
                        else {
                            string5 = d.getString(e9);
                        }
                        final DashboardHomework dashboardHomework = new DashboardHomework(long1, long2, long3, c, c2, string3, string4, b, h.this.d.g(string5));
                        Integer value;
                        if (d.isNull(e10)) {
                            value = null;
                        }
                        else {
                            value = d.getInt(e10);
                        }
                        dashboardHomework.setEntityType(h.this.d.d(value));
                        Long value2;
                        if (d.isNull(e11)) {
                            value2 = null;
                        }
                        else {
                            value2 = d.getLong(e11);
                        }
                        dashboardHomework.setEntityId(value2);
                        Long value3;
                        if (d.isNull(e12)) {
                            value3 = null;
                        }
                        else {
                            value3 = d.getLong(e12);
                        }
                        dashboardHomework.setSubjectId(value3);
                        list.add(dashboardHomework);
                    }
                    return (List<DashboardHomework>)list;
                }
                finally {
                    d.close();
                    this.G.release();
                }
            }
        }, (d)d);
    }
}
