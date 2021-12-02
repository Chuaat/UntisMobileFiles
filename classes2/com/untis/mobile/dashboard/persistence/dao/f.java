// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.persistence.dao;

import com.untis.mobile.dashboard.persistence.model.event.exam.DashboardExamInvigilator;
import android.database.Cursor;
import java.util.ArrayList;
import android.os.CancellationSignal;
import androidx.room.v2;
import androidx.room.j0;
import java.util.concurrent.Callable;
import kotlin.j2;
import kotlin.coroutines.d;
import java.util.Collections;
import java.util.List;
import androidx.sqlite.db.h;
import androidx.room.a3;
import com.untis.mobile.utils.persistence.typeconverter.a;
import com.untis.mobile.utils.persistence.typeconverter.b;
import com.untis.mobile.utils.persistence.typeconverter.c;
import com.untis.mobile.dashboard.persistence.model.event.exam.DashboardExam;
import androidx.room.u0;
import androidx.room.r2;

public final class f implements e
{
    private final r2 a;
    private final u0<DashboardExam> b;
    private final c c;
    private final b d;
    private final a e;
    private final a3 f;
    
    public f(final r2 a) {
        this.c = new c();
        this.d = new b();
        this.e = new a();
        this.a = a;
        this.b = new u0<DashboardExam>(a) {
            public void a(final h h, final DashboardExam dashboardExam) {
                ((androidx.sqlite.db.e)h).l2(1, dashboardExam.getId());
                ((androidx.sqlite.db.e)h).l2(2, dashboardExam.getWuId());
                if (dashboardExam.getExamType() == null) {
                    ((androidx.sqlite.db.e)h).c4(3);
                }
                else {
                    ((androidx.sqlite.db.e)h).K0(3, dashboardExam.getExamType());
                }
                final String a = com.untis.mobile.dashboard.persistence.dao.f.this.c.a(dashboardExam.getStart());
                if (a == null) {
                    ((androidx.sqlite.db.e)h).c4(4);
                }
                else {
                    ((androidx.sqlite.db.e)h).K0(4, a);
                }
                final String a2 = com.untis.mobile.dashboard.persistence.dao.f.this.c.a(dashboardExam.getEnd());
                if (a2 == null) {
                    ((androidx.sqlite.db.e)h).c4(5);
                }
                else {
                    ((androidx.sqlite.db.e)h).K0(5, a2);
                }
                ((androidx.sqlite.db.e)h).l2(6, dashboardExam.getDepartmentId());
                ((androidx.sqlite.db.e)h).l2(7, dashboardExam.getSubjectId());
                final String i = com.untis.mobile.dashboard.persistence.dao.f.this.d.i(dashboardExam.getKlassenIds());
                if (i == null) {
                    ((androidx.sqlite.db.e)h).c4(8);
                }
                else {
                    ((androidx.sqlite.db.e)h).K0(8, i);
                }
                final String j = com.untis.mobile.dashboard.persistence.dao.f.this.d.i(dashboardExam.getRoomIds());
                if (j == null) {
                    ((androidx.sqlite.db.e)h).c4(9);
                }
                else {
                    ((androidx.sqlite.db.e)h).K0(9, j);
                }
                final String k = com.untis.mobile.dashboard.persistence.dao.f.this.d.i(dashboardExam.getTeacherIds());
                if (k == null) {
                    ((androidx.sqlite.db.e)h).c4(10);
                }
                else {
                    ((androidx.sqlite.db.e)h).K0(10, k);
                }
                final String c = com.untis.mobile.dashboard.persistence.dao.f.this.e.c(dashboardExam.getInvigilators());
                if (c == null) {
                    ((androidx.sqlite.db.e)h).c4(11);
                }
                else {
                    ((androidx.sqlite.db.e)h).K0(11, c);
                }
                if (dashboardExam.getName() == null) {
                    ((androidx.sqlite.db.e)h).c4(12);
                }
                else {
                    ((androidx.sqlite.db.e)h).K0(12, dashboardExam.getName());
                }
                if (dashboardExam.getText() == null) {
                    ((androidx.sqlite.db.e)h).c4(13);
                }
                else {
                    ((androidx.sqlite.db.e)h).K0(13, dashboardExam.getText());
                }
                final Integer b = com.untis.mobile.dashboard.persistence.dao.f.this.d.b(dashboardExam.getEntityType());
                if (b == null) {
                    ((androidx.sqlite.db.e)h).c4(14);
                }
                else {
                    ((androidx.sqlite.db.e)h).l2(14, (long)b);
                }
                if (dashboardExam.getEntityId() == null) {
                    ((androidx.sqlite.db.e)h).c4(15);
                }
                else {
                    ((androidx.sqlite.db.e)h).l2(15, (long)dashboardExam.getEntityId());
                }
            }
            
            public String createQuery() {
                return "INSERT OR REPLACE INTO `dashboard_exam` (`exam_id`,`exam_wu_id`,`exam_type`,`start`,`end`,`department_id`,`subject_id`,`klassen_ids`,`room_ids`,`teacher_ids`,`invigilators`,`name`,`text`,`entity_type`,`entity_id`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }
        };
        this.f = new a3(a) {
            public String createQuery() {
                return "DELETE FROM dashboard_exam";
            }
        };
    }
    
    public static List<Class<?>> j() {
        return Collections.emptyList();
    }
    
    @Override
    public Object a(final List<DashboardExam> list, final d<? super j2> d) {
        return j0.c(this.a, true, (Callable)new Callable<j2>() {
            public j2 a() throws Exception {
                com.untis.mobile.dashboard.persistence.dao.f.this.a.e();
                try {
                    com.untis.mobile.dashboard.persistence.dao.f.this.b.insert((Iterable)list);
                    com.untis.mobile.dashboard.persistence.dao.f.this.a.I();
                    return j2.a;
                }
                finally {
                    com.untis.mobile.dashboard.persistence.dao.f.this.a.k();
                }
            }
        }, (d)d);
    }
    
    @Override
    public Object b(final d<? super j2> d) {
        return j0.c(this.a, true, (Callable)new Callable<j2>() {
            public j2 a() throws Exception {
                final h acquire = com.untis.mobile.dashboard.persistence.dao.f.this.f.acquire();
                com.untis.mobile.dashboard.persistence.dao.f.this.a.e();
                try {
                    acquire.c1();
                    com.untis.mobile.dashboard.persistence.dao.f.this.a.I();
                    return j2.a;
                }
                finally {
                    com.untis.mobile.dashboard.persistence.dao.f.this.a.k();
                    com.untis.mobile.dashboard.persistence.dao.f.this.f.release(acquire);
                }
            }
        }, (d)d);
    }
    
    @Override
    public Object c(final DashboardExam dashboardExam, final d<? super j2> d) {
        return j0.c(this.a, true, (Callable)new Callable<j2>() {
            public j2 a() throws Exception {
                com.untis.mobile.dashboard.persistence.dao.f.this.a.e();
                try {
                    com.untis.mobile.dashboard.persistence.dao.f.this.b.insert((Object)dashboardExam);
                    com.untis.mobile.dashboard.persistence.dao.f.this.a.I();
                    return j2.a;
                }
                finally {
                    com.untis.mobile.dashboard.persistence.dao.f.this.a.k();
                }
            }
        }, (d)d);
    }
    
    @Override
    public Object findAll(final d<? super List<DashboardExam>> d) {
        return j0.b(this.a, false, androidx.room.util.c.a(), (Callable)new Callable<List<DashboardExam>>() {
            final /* synthetic */ v2 G = v2.d("SELECT * FROM dashboard_exam", 0);
            
            public List<DashboardExam> a() throws Exception {
                final Cursor d = androidx.room.util.c.d(com.untis.mobile.dashboard.persistence.dao.f.this.a, (androidx.sqlite.db.f)this.G, false, (CancellationSignal)null);
                try {
                    final int e = androidx.room.util.b.e(d, "exam_id");
                    final int e2 = androidx.room.util.b.e(d, "exam_wu_id");
                    final int e3 = androidx.room.util.b.e(d, "exam_type");
                    final int e4 = androidx.room.util.b.e(d, "start");
                    final int e5 = androidx.room.util.b.e(d, "end");
                    final int e6 = androidx.room.util.b.e(d, "department_id");
                    final int e7 = androidx.room.util.b.e(d, "subject_id");
                    final int e8 = androidx.room.util.b.e(d, "klassen_ids");
                    final int e9 = androidx.room.util.b.e(d, "room_ids");
                    final int e10 = androidx.room.util.b.e(d, "teacher_ids");
                    final int e11 = androidx.room.util.b.e(d, "invigilators");
                    final int e12 = androidx.room.util.b.e(d, "name");
                    final int e13 = androidx.room.util.b.e(d, "text");
                    final int e14 = androidx.room.util.b.e(d, "entity_type");
                    final int e15 = androidx.room.util.b.e(d, "entity_id");
                    final ArrayList list = new ArrayList<DashboardExam>(d.getCount());
                    while (d.moveToNext()) {
                        final long long1 = d.getLong(e);
                        final long long2 = d.getLong(e2);
                        String string;
                        if (d.isNull(e3)) {
                            string = null;
                        }
                        else {
                            string = d.getString(e3);
                        }
                        String string2;
                        if (d.isNull(e4)) {
                            string2 = null;
                        }
                        else {
                            string2 = d.getString(e4);
                        }
                        final org.joda.time.c b = com.untis.mobile.dashboard.persistence.dao.f.this.c.b(string2);
                        String string3;
                        if (d.isNull(e5)) {
                            string3 = null;
                        }
                        else {
                            string3 = d.getString(e5);
                        }
                        final org.joda.time.c b2 = com.untis.mobile.dashboard.persistence.dao.f.this.c.b(string3);
                        final long long3 = d.getLong(e6);
                        final long long4 = d.getLong(e7);
                        String string4;
                        if (d.isNull(e8)) {
                            string4 = null;
                        }
                        else {
                            string4 = d.getString(e8);
                        }
                        final List<Long> h = com.untis.mobile.dashboard.persistence.dao.f.this.d.h(string4);
                        String string5;
                        if (d.isNull(e9)) {
                            string5 = null;
                        }
                        else {
                            string5 = d.getString(e9);
                        }
                        final List<Long> h2 = com.untis.mobile.dashboard.persistence.dao.f.this.d.h(string5);
                        String string6;
                        if (d.isNull(e10)) {
                            string6 = null;
                        }
                        else {
                            string6 = d.getString(e10);
                        }
                        final List<Long> h3 = com.untis.mobile.dashboard.persistence.dao.f.this.d.h(string6);
                        String string7;
                        if (d.isNull(e11)) {
                            string7 = null;
                        }
                        else {
                            string7 = d.getString(e11);
                        }
                        final List<DashboardExamInvigilator> h4 = com.untis.mobile.dashboard.persistence.dao.f.this.e.h(string7);
                        String string8;
                        if (d.isNull(e12)) {
                            string8 = null;
                        }
                        else {
                            string8 = d.getString(e12);
                        }
                        String string9;
                        if (d.isNull(e13)) {
                            string9 = null;
                        }
                        else {
                            string9 = d.getString(e13);
                        }
                        final DashboardExam dashboardExam = new DashboardExam(long1, long2, string, b, b2, long3, long4, h, h2, h3, h4, string8, string9);
                        Integer value;
                        if (d.isNull(e14)) {
                            value = null;
                        }
                        else {
                            value = d.getInt(e14);
                        }
                        dashboardExam.setEntityType(com.untis.mobile.dashboard.persistence.dao.f.this.d.d(value));
                        Long value2;
                        if (d.isNull(e15)) {
                            value2 = null;
                        }
                        else {
                            value2 = d.getLong(e15);
                        }
                        dashboardExam.setEntityId(value2);
                        list.add(dashboardExam);
                    }
                    return (List<DashboardExam>)list;
                }
                finally {
                    d.close();
                    this.G.release();
                }
            }
        }, (d)d);
    }
}
