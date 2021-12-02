// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.persistence.dao;

import androidx.sqlite.db.e;
import java.util.ArrayList;
import android.database.Cursor;
import androidx.room.util.b;
import android.os.CancellationSignal;
import androidx.sqlite.db.f;
import androidx.room.v2;
import androidx.room.j0;
import java.util.concurrent.Callable;
import kotlin.j2;
import java.util.Collections;
import java.util.List;
import androidx.sqlite.db.h;
import androidx.room.a3;
import com.untis.mobile.utils.persistence.typeconverter.a;
import com.untis.mobile.dashboard.persistence.model.contacthour.DashboardContactHour;
import androidx.room.u0;
import androidx.room.r2;

public final class d implements c
{
    private final r2 a;
    private final u0<DashboardContactHour> b;
    private final com.untis.mobile.utils.persistence.typeconverter.c c;
    private final a d;
    private final a3 e;
    
    public d(final r2 a) {
        this.c = new com.untis.mobile.utils.persistence.typeconverter.c();
        this.d = new a();
        this.a = a;
        this.b = new u0<DashboardContactHour>(a) {
            public void a(final h h, final DashboardContactHour dashboardContactHour) {
                ((e)h).l2(1, dashboardContactHour.getId());
                ((e)h).l2(2, dashboardContactHour.getWuId());
                final String a = com.untis.mobile.dashboard.persistence.dao.d.this.c.a(dashboardContactHour.getStart());
                if (a == null) {
                    ((e)h).c4(3);
                }
                else {
                    ((e)h).K0(3, a);
                }
                final String a2 = com.untis.mobile.dashboard.persistence.dao.d.this.c.a(dashboardContactHour.getEnd());
                if (a2 == null) {
                    ((e)h).c4(4);
                }
                else {
                    ((e)h).K0(4, a2);
                }
                ((e)h).l2(5, dashboardContactHour.getTeacherId());
                if (dashboardContactHour.getEmail() == null) {
                    ((e)h).c4(6);
                }
                else {
                    ((e)h).K0(6, dashboardContactHour.getEmail());
                }
                if (dashboardContactHour.getPhone() == null) {
                    ((e)h).c4(7);
                }
                else {
                    ((e)h).K0(7, dashboardContactHour.getPhone());
                }
                if (dashboardContactHour.getDisplayRooms() == null) {
                    ((e)h).c4(8);
                }
                else {
                    ((e)h).K0(8, dashboardContactHour.getDisplayRooms());
                }
                if (dashboardContactHour.getDisplayTeacher() == null) {
                    ((e)h).c4(9);
                }
                else {
                    ((e)h).K0(9, dashboardContactHour.getDisplayTeacher());
                }
                ((e)h).l2(10, (long)(dashboardContactHour.getRegistrationPossible() ? 1 : 0));
                ((e)h).l2(11, (long)(dashboardContactHour.getRegistered() ? 1 : 0));
                if (dashboardContactHour.getUserText() == null) {
                    ((e)h).c4(12);
                }
                else {
                    ((e)h).K0(12, dashboardContactHour.getUserText());
                }
                if (dashboardContactHour.getTeacherText() == null) {
                    ((e)h).c4(13);
                }
                else {
                    ((e)h).K0(13, dashboardContactHour.getTeacherText());
                }
                final String a3 = com.untis.mobile.dashboard.persistence.dao.d.this.d.a(dashboardContactHour.getSlots());
                if (a3 == null) {
                    ((e)h).c4(14);
                }
                else {
                    ((e)h).K0(14, a3);
                }
            }
            
            public String createQuery() {
                return "INSERT OR REPLACE INTO `dashboard_contact_hour` (`contact_hour_id`,`contact_hour_wu_id`,`start`,`end`,`teacher_id`,`email`,`phone`,`display_rooms`,`display_teacher`,`registration_possible`,`registered`,`text_user`,`text_teacher`,`slots`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }
        };
        this.e = new a3(a) {
            public String createQuery() {
                return "DELETE FROM dashboard_contact_hour";
            }
        };
    }
    
    public static List<Class<?>> j() {
        return Collections.emptyList();
    }
    
    @Override
    public Object a(final List<DashboardContactHour> list, final kotlin.coroutines.d<? super j2> d) {
        return j0.c(this.a, true, (Callable)new Callable<j2>() {
            public j2 a() throws Exception {
                com.untis.mobile.dashboard.persistence.dao.d.this.a.e();
                try {
                    com.untis.mobile.dashboard.persistence.dao.d.this.b.insert((Iterable)list);
                    com.untis.mobile.dashboard.persistence.dao.d.this.a.I();
                    return j2.a;
                }
                finally {
                    com.untis.mobile.dashboard.persistence.dao.d.this.a.k();
                }
            }
        }, (kotlin.coroutines.d)d);
    }
    
    @Override
    public Object b(final kotlin.coroutines.d<? super j2> d) {
        return j0.c(this.a, true, (Callable)new Callable<j2>() {
            public j2 a() throws Exception {
                final h acquire = com.untis.mobile.dashboard.persistence.dao.d.this.e.acquire();
                com.untis.mobile.dashboard.persistence.dao.d.this.a.e();
                try {
                    acquire.c1();
                    com.untis.mobile.dashboard.persistence.dao.d.this.a.I();
                    return j2.a;
                }
                finally {
                    com.untis.mobile.dashboard.persistence.dao.d.this.a.k();
                    com.untis.mobile.dashboard.persistence.dao.d.this.e.release(acquire);
                }
            }
        }, (kotlin.coroutines.d)d);
    }
    
    @Override
    public Object c(final DashboardContactHour dashboardContactHour, final kotlin.coroutines.d<? super j2> d) {
        return j0.c(this.a, true, (Callable)new Callable<j2>() {
            public j2 a() throws Exception {
                com.untis.mobile.dashboard.persistence.dao.d.this.a.e();
                try {
                    com.untis.mobile.dashboard.persistence.dao.d.this.b.insert((Object)dashboardContactHour);
                    com.untis.mobile.dashboard.persistence.dao.d.this.a.I();
                    return j2.a;
                }
                finally {
                    com.untis.mobile.dashboard.persistence.dao.d.this.a.k();
                }
            }
        }, (kotlin.coroutines.d)d);
    }
    
    @Override
    public Object d(final long n, final kotlin.coroutines.d<? super DashboardContactHour> d) {
        final v2 d2 = v2.d("SELECT * FROM dashboard_contact_hour WHERE contact_hour_wu_id = ?", 1);
        d2.l2(1, n);
        return j0.b(this.a, false, androidx.room.util.c.a(), (Callable)new Callable<DashboardContactHour>() {
            public DashboardContactHour a() throws Exception {
                final Cursor d = androidx.room.util.c.d(com.untis.mobile.dashboard.persistence.dao.d.this.a, (f)d2, false, (CancellationSignal)null);
                try {
                    final int e = androidx.room.util.b.e(d, "contact_hour_id");
                    final int e2 = androidx.room.util.b.e(d, "contact_hour_wu_id");
                    final int e3 = androidx.room.util.b.e(d, "start");
                    final int e4 = androidx.room.util.b.e(d, "end");
                    final int e5 = androidx.room.util.b.e(d, "teacher_id");
                    final int e6 = androidx.room.util.b.e(d, "email");
                    final int e7 = androidx.room.util.b.e(d, "phone");
                    final int e8 = androidx.room.util.b.e(d, "display_rooms");
                    final int e9 = androidx.room.util.b.e(d, "display_teacher");
                    final int e10 = androidx.room.util.b.e(d, "registration_possible");
                    final int e11 = androidx.room.util.b.e(d, "registered");
                    final int e12 = androidx.room.util.b.e(d, "text_user");
                    final int e13 = androidx.room.util.b.e(d, "text_teacher");
                    final int e14 = androidx.room.util.b.e(d, "slots");
                    DashboardContactHour dashboardContactHour2;
                    if (d.moveToFirst()) {
                        final long long1 = d.getLong(e);
                        final long long2 = d.getLong(e2);
                        String string;
                        if (d.isNull(e3)) {
                            string = null;
                        }
                        else {
                            string = d.getString(e3);
                        }
                        final org.joda.time.c b = com.untis.mobile.dashboard.persistence.dao.d.this.c.b(string);
                        String string2;
                        if (d.isNull(e4)) {
                            string2 = null;
                        }
                        else {
                            string2 = d.getString(e4);
                        }
                        final org.joda.time.c b2 = com.untis.mobile.dashboard.persistence.dao.d.this.c.b(string2);
                        final long long3 = d.getLong(e5);
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
                        String string5;
                        if (d.isNull(e8)) {
                            string5 = null;
                        }
                        else {
                            string5 = d.getString(e8);
                        }
                        String string6;
                        if (d.isNull(e9)) {
                            string6 = null;
                        }
                        else {
                            string6 = d.getString(e9);
                        }
                        final DashboardContactHour dashboardContactHour = new DashboardContactHour(long1, long2, b, b2, long3, string3, string4, string5, string6, d.getInt(e10) != 0, d.getInt(e11) != 0);
                        String string7;
                        if (d.isNull(e12)) {
                            string7 = null;
                        }
                        else {
                            string7 = d.getString(e12);
                        }
                        dashboardContactHour.setUserText(string7);
                        String string8;
                        if (d.isNull(e13)) {
                            string8 = null;
                        }
                        else {
                            string8 = d.getString(e13);
                        }
                        dashboardContactHour.setTeacherText(string8);
                        String string9;
                        if (d.isNull(e14)) {
                            string9 = null;
                        }
                        else {
                            string9 = d.getString(e14);
                        }
                        dashboardContactHour.setSlots(com.untis.mobile.dashboard.persistence.dao.d.this.d.f(string9));
                        dashboardContactHour2 = dashboardContactHour;
                    }
                    else {
                        dashboardContactHour2 = null;
                    }
                    return dashboardContactHour2;
                }
                finally {
                    d.close();
                    d2.release();
                }
            }
        }, (kotlin.coroutines.d)d);
    }
    
    @Override
    public Object findAll(final kotlin.coroutines.d<? super List<DashboardContactHour>> d) {
        return j0.b(this.a, false, androidx.room.util.c.a(), (Callable)new Callable<List<DashboardContactHour>>() {
            final /* synthetic */ v2 G = v2.d("SELECT * FROM dashboard_contact_hour", 0);
            
            public List<DashboardContactHour> a() throws Exception {
                final Cursor d = androidx.room.util.c.d(com.untis.mobile.dashboard.persistence.dao.d.this.a, (f)this.G, false, (CancellationSignal)null);
                try {
                    final int e = androidx.room.util.b.e(d, "contact_hour_id");
                    final int e2 = androidx.room.util.b.e(d, "contact_hour_wu_id");
                    final int e3 = androidx.room.util.b.e(d, "start");
                    final int e4 = androidx.room.util.b.e(d, "end");
                    final int e5 = androidx.room.util.b.e(d, "teacher_id");
                    final int e6 = androidx.room.util.b.e(d, "email");
                    final int e7 = androidx.room.util.b.e(d, "phone");
                    final int e8 = androidx.room.util.b.e(d, "display_rooms");
                    final int e9 = androidx.room.util.b.e(d, "display_teacher");
                    final int e10 = androidx.room.util.b.e(d, "registration_possible");
                    final int e11 = androidx.room.util.b.e(d, "registered");
                    final int e12 = androidx.room.util.b.e(d, "text_user");
                    final int e13 = androidx.room.util.b.e(d, "text_teacher");
                    final int e14 = androidx.room.util.b.e(d, "slots");
                    final ArrayList list = new ArrayList<DashboardContactHour>(d.getCount());
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
                        final org.joda.time.c b = com.untis.mobile.dashboard.persistence.dao.d.this.c.b(string);
                        String string2;
                        if (d.isNull(e4)) {
                            string2 = null;
                        }
                        else {
                            string2 = d.getString(e4);
                        }
                        final org.joda.time.c b2 = com.untis.mobile.dashboard.persistence.dao.d.this.c.b(string2);
                        final long long3 = d.getLong(e5);
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
                        String string5;
                        if (d.isNull(e8)) {
                            string5 = null;
                        }
                        else {
                            string5 = d.getString(e8);
                        }
                        String string6;
                        if (d.isNull(e9)) {
                            string6 = null;
                        }
                        else {
                            string6 = d.getString(e9);
                        }
                        final DashboardContactHour dashboardContactHour = new DashboardContactHour(long1, long2, b, b2, long3, string3, string4, string5, string6, d.getInt(e10) != 0, d.getInt(e11) != 0);
                        String string7;
                        if (d.isNull(e12)) {
                            string7 = null;
                        }
                        else {
                            string7 = d.getString(e12);
                        }
                        dashboardContactHour.setUserText(string7);
                        String string8;
                        if (d.isNull(e13)) {
                            string8 = null;
                        }
                        else {
                            string8 = d.getString(e13);
                        }
                        dashboardContactHour.setTeacherText(string8);
                        String string9;
                        if (d.isNull(e14)) {
                            string9 = null;
                        }
                        else {
                            string9 = d.getString(e14);
                        }
                        dashboardContactHour.setSlots(com.untis.mobile.dashboard.persistence.dao.d.this.d.f(string9));
                        list.add(dashboardContactHour);
                    }
                    return (List<DashboardContactHour>)list;
                }
                finally {
                    d.close();
                    this.G.release();
                }
            }
        }, (kotlin.coroutines.d)d);
    }
}
