// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.persistence.dao;

import androidx.sqlite.db.e;
import com.untis.mobile.dashboard.persistence.model.studentabsence.DashboardExcuse;
import android.database.Cursor;
import java.util.ArrayList;
import androidx.room.util.b;
import android.os.CancellationSignal;
import androidx.sqlite.db.f;
import androidx.room.v2;
import androidx.room.j0;
import java.util.concurrent.Callable;
import kotlin.j2;
import kotlin.coroutines.d;
import java.util.Collections;
import java.util.List;
import androidx.sqlite.db.h;
import androidx.room.a3;
import androidx.room.t0;
import com.untis.mobile.utils.persistence.typeconverter.a;
import com.untis.mobile.utils.persistence.typeconverter.c;
import com.untis.mobile.dashboard.persistence.model.studentabsence.DashboardStudentAbsence;
import androidx.room.u0;
import androidx.room.r2;

public final class l implements k
{
    private final r2 a;
    private final u0<DashboardStudentAbsence> b;
    private final c c;
    private final a d;
    private final t0<DashboardStudentAbsence> e;
    private final a3 f;
    
    public l(final r2 a) {
        this.c = new c();
        this.d = new a();
        this.a = a;
        this.b = new u0<DashboardStudentAbsence>(a) {
            public void a(final h h, final DashboardStudentAbsence dashboardStudentAbsence) {
                ((e)h).l2(1, dashboardStudentAbsence.getId());
                ((e)h).l2(2, dashboardStudentAbsence.getStudentId());
                ((e)h).l2(3, dashboardStudentAbsence.getKlassenId());
                final String a = l.this.c.a(dashboardStudentAbsence.getStart());
                if (a == null) {
                    ((e)h).c4(4);
                }
                else {
                    ((e)h).K0(4, a);
                }
                final String a2 = l.this.c.a(dashboardStudentAbsence.getEnd());
                if (a2 == null) {
                    ((e)h).c4(5);
                }
                else {
                    ((e)h).K0(5, a2);
                }
                ((e)h).l2(6, (long)(dashboardStudentAbsence.getOwner() ? 1 : 0));
                ((e)h).l2(7, (long)(dashboardStudentAbsence.getExcused() ? 1 : 0));
                final String b = l.this.d.b(dashboardStudentAbsence.getExcuse());
                if (b == null) {
                    ((e)h).c4(8);
                }
                else {
                    ((e)h).K0(8, b);
                }
                ((e)h).l2(9, dashboardStudentAbsence.getReasonId());
                if (dashboardStudentAbsence.getReasonTitle() == null) {
                    ((e)h).c4(10);
                }
                else {
                    ((e)h).K0(10, dashboardStudentAbsence.getReasonTitle());
                }
                if (dashboardStudentAbsence.getText() == null) {
                    ((e)h).c4(11);
                }
                else {
                    ((e)h).K0(11, dashboardStudentAbsence.getText());
                }
            }
            
            public String createQuery() {
                return "INSERT OR REPLACE INTO `dashboard_student_absence` (`absence_id`,`student_id`,`klassen_id`,`start`,`end`,`owner`,`excused`,`excuse`,`reason_id`,`reason_title`,`text`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            }
        };
        this.e = new t0<DashboardStudentAbsence>(a) {
            public void a(final h h, final DashboardStudentAbsence dashboardStudentAbsence) {
                ((e)h).l2(1, dashboardStudentAbsence.getId());
            }
            
            public String createQuery() {
                return "DELETE FROM `dashboard_student_absence` WHERE `absence_id` = ?";
            }
        };
        this.f = new a3(a) {
            public String createQuery() {
                return "DELETE FROM dashboard_student_absence";
            }
        };
    }
    
    public static List<Class<?>> k() {
        return Collections.emptyList();
    }
    
    @Override
    public Object a(final List<DashboardStudentAbsence> list, final d<? super j2> d) {
        return j0.c(this.a, true, (Callable)new Callable<j2>() {
            public j2 a() throws Exception {
                l.this.a.e();
                try {
                    l.this.b.insert((Iterable)list);
                    l.this.a.I();
                    return j2.a;
                }
                finally {
                    l.this.a.k();
                }
            }
        }, (d)d);
    }
    
    @Override
    public Object b(final d<? super j2> d) {
        return j0.c(this.a, true, (Callable)new Callable<j2>() {
            public j2 a() throws Exception {
                final h acquire = l.this.f.acquire();
                l.this.a.e();
                try {
                    acquire.c1();
                    l.this.a.I();
                    return j2.a;
                }
                finally {
                    l.this.a.k();
                    l.this.f.release(acquire);
                }
            }
        }, (d)d);
    }
    
    @Override
    public Object c(final DashboardStudentAbsence dashboardStudentAbsence, final d<? super j2> d) {
        return j0.c(this.a, true, (Callable)new Callable<j2>() {
            public j2 a() throws Exception {
                l.this.a.e();
                try {
                    l.this.b.insert((Object)dashboardStudentAbsence);
                    l.this.a.I();
                    return j2.a;
                }
                finally {
                    l.this.a.k();
                }
            }
        }, (d)d);
    }
    
    @Override
    public Object d(final DashboardStudentAbsence dashboardStudentAbsence, final d<? super j2> d) {
        return j0.c(this.a, true, (Callable)new Callable<j2>() {
            public j2 a() throws Exception {
                l.this.a.e();
                try {
                    l.this.e.handle((Object)dashboardStudentAbsence);
                    l.this.a.I();
                    return j2.a;
                }
                finally {
                    l.this.a.k();
                }
            }
        }, (d)d);
    }
    
    @Override
    public Object findAll(final d<? super List<DashboardStudentAbsence>> d) {
        return j0.b(this.a, false, androidx.room.util.c.a(), (Callable)new Callable<List<DashboardStudentAbsence>>() {
            final /* synthetic */ v2 G = v2.d("SELECT * FROM dashboard_student_absence", 0);
            
            public List<DashboardStudentAbsence> a() throws Exception {
                final Cursor d = androidx.room.util.c.d(l.this.a, (f)this.G, false, (CancellationSignal)null);
                try {
                    final int e = androidx.room.util.b.e(d, "absence_id");
                    final int e2 = androidx.room.util.b.e(d, "student_id");
                    final int e3 = androidx.room.util.b.e(d, "klassen_id");
                    final int e4 = androidx.room.util.b.e(d, "start");
                    final int e5 = androidx.room.util.b.e(d, "end");
                    final int e6 = androidx.room.util.b.e(d, "owner");
                    final int e7 = androidx.room.util.b.e(d, "excused");
                    final int e8 = androidx.room.util.b.e(d, "excuse");
                    final int e9 = androidx.room.util.b.e(d, "reason_id");
                    final int e10 = androidx.room.util.b.e(d, "reason_title");
                    final int e11 = androidx.room.util.b.e(d, "text");
                    final ArrayList list = new ArrayList<DashboardStudentAbsence>(d.getCount());
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
                        final org.joda.time.c b = l.this.c.b(string);
                        String string2;
                        if (d.isNull(e5)) {
                            string2 = null;
                        }
                        else {
                            string2 = d.getString(e5);
                        }
                        final org.joda.time.c b2 = l.this.c.b(string2);
                        final boolean b3 = d.getInt(e6) != 0;
                        final boolean b4 = d.getInt(e7) != 0;
                        String string3;
                        if (d.isNull(e8)) {
                            string3 = null;
                        }
                        else {
                            string3 = d.getString(e8);
                        }
                        final DashboardExcuse g = l.this.d.g(string3);
                        final long long4 = d.getLong(e9);
                        String string4;
                        if (d.isNull(e10)) {
                            string4 = null;
                        }
                        else {
                            string4 = d.getString(e10);
                        }
                        String string5;
                        if (d.isNull(e11)) {
                            string5 = null;
                        }
                        else {
                            string5 = d.getString(e11);
                        }
                        list.add(new DashboardStudentAbsence(long1, long2, long3, b, b2, b3, b4, g, long4, string4, string5));
                    }
                    return (List<DashboardStudentAbsence>)list;
                }
                finally {
                    d.close();
                    this.G.release();
                }
            }
        }, (d)d);
    }
    
    @Override
    public Object findBy(final long n, final d<? super DashboardStudentAbsence> d) {
        final v2 d2 = v2.d("SELECT * FROM dashboard_student_absence WHERE absence_id = ?", 1);
        d2.l2(1, n);
        return j0.b(this.a, false, androidx.room.util.c.a(), (Callable)new Callable<DashboardStudentAbsence>() {
            public DashboardStudentAbsence a() throws Exception {
                final r2 g = l.this.a;
                final v2 g2 = d2;
                DashboardStudentAbsence dashboardStudentAbsence = null;
                String string = null;
                final Cursor d = androidx.room.util.c.d(g, (f)g2, false, (CancellationSignal)null);
                try {
                    final int e = androidx.room.util.b.e(d, "absence_id");
                    final int e2 = androidx.room.util.b.e(d, "student_id");
                    final int e3 = androidx.room.util.b.e(d, "klassen_id");
                    final int e4 = androidx.room.util.b.e(d, "start");
                    final int e5 = androidx.room.util.b.e(d, "end");
                    final int e6 = androidx.room.util.b.e(d, "owner");
                    final int e7 = androidx.room.util.b.e(d, "excused");
                    final int e8 = androidx.room.util.b.e(d, "excuse");
                    final int e9 = androidx.room.util.b.e(d, "reason_id");
                    final int e10 = androidx.room.util.b.e(d, "reason_title");
                    final int e11 = androidx.room.util.b.e(d, "text");
                    if (d.moveToFirst()) {
                        final long long1 = d.getLong(e);
                        final long long2 = d.getLong(e2);
                        final long long3 = d.getLong(e3);
                        String string2;
                        if (d.isNull(e4)) {
                            string2 = null;
                        }
                        else {
                            string2 = d.getString(e4);
                        }
                        final org.joda.time.c b = l.this.c.b(string2);
                        String string3;
                        if (d.isNull(e5)) {
                            string3 = null;
                        }
                        else {
                            string3 = d.getString(e5);
                        }
                        final org.joda.time.c b2 = l.this.c.b(string3);
                        final boolean b3 = d.getInt(e6) != 0;
                        final boolean b4 = d.getInt(e7) != 0;
                        String string4;
                        if (d.isNull(e8)) {
                            string4 = null;
                        }
                        else {
                            string4 = d.getString(e8);
                        }
                        final DashboardExcuse g3 = l.this.d.g(string4);
                        final long long4 = d.getLong(e9);
                        String string5;
                        if (d.isNull(e10)) {
                            string5 = null;
                        }
                        else {
                            string5 = d.getString(e10);
                        }
                        if (!d.isNull(e11)) {
                            string = d.getString(e11);
                        }
                        dashboardStudentAbsence = new DashboardStudentAbsence(long1, long2, long3, b, b2, b3, b4, g3, long4, string5, string);
                    }
                    return dashboardStudentAbsence;
                }
                finally {
                    d.close();
                    d2.release();
                }
            }
        }, (d)d);
    }
}
