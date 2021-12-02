// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.persistence.dao;

import androidx.sqlite.db.e;
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
import com.untis.mobile.utils.persistence.typeconverter.a;
import com.untis.mobile.utils.persistence.typeconverter.c;
import com.untis.mobile.dashboard.persistence.model.parentday.DashboardParentDay;
import androidx.room.u0;
import androidx.room.r2;

public final class j implements i
{
    private final r2 a;
    private final u0<DashboardParentDay> b;
    private final c c;
    private final a d;
    private final a3 e;
    
    public j(final r2 a) {
        this.c = new c();
        this.d = new a();
        this.a = a;
        this.b = new u0<DashboardParentDay>(a) {
            public void a(final h h, final DashboardParentDay dashboardParentDay) {
                ((e)h).l2(1, dashboardParentDay.getId());
                if (dashboardParentDay.getName() == null) {
                    ((e)h).c4(2);
                }
                else {
                    ((e)h).K0(2, dashboardParentDay.getName());
                }
                final String a = j.this.c.a(dashboardParentDay.getStart());
                if (a == null) {
                    ((e)h).c4(3);
                }
                else {
                    ((e)h).K0(3, a);
                }
                final String a2 = j.this.c.a(dashboardParentDay.getEnd());
                if (a2 == null) {
                    ((e)h).c4(4);
                }
                else {
                    ((e)h).K0(4, a2);
                }
                final String d = j.this.d.d(dashboardParentDay.getAppointments());
                if (d == null) {
                    ((e)h).c4(5);
                }
                else {
                    ((e)h).K0(5, d);
                }
            }
            
            public String createQuery() {
                return "INSERT OR REPLACE INTO `dashboard_parent_day` (`parent_day_id`,`name`,`start`,`end`,`appointments`) VALUES (?,?,?,?,?)";
            }
        };
        this.e = new a3(a) {
            public String createQuery() {
                return "DELETE FROM dashboard_parent_day";
            }
        };
    }
    
    public static List<Class<?>> h() {
        return Collections.emptyList();
    }
    
    @Override
    public Object a(final List<DashboardParentDay> list, final d<? super j2> d) {
        return j0.c(this.a, true, (Callable)new Callable<j2>() {
            public j2 a() throws Exception {
                j.this.a.e();
                try {
                    j.this.b.insert((Iterable)list);
                    j.this.a.I();
                    return j2.a;
                }
                finally {
                    j.this.a.k();
                }
            }
        }, (d)d);
    }
    
    @Override
    public Object b(final d<? super j2> d) {
        return j0.c(this.a, true, (Callable)new Callable<j2>() {
            public j2 a() throws Exception {
                final h acquire = j.this.e.acquire();
                j.this.a.e();
                try {
                    acquire.c1();
                    j.this.a.I();
                    return j2.a;
                }
                finally {
                    j.this.a.k();
                    j.this.e.release(acquire);
                }
            }
        }, (d)d);
    }
    
    @Override
    public Object findAll(final d<? super List<DashboardParentDay>> d) {
        return j0.b(this.a, false, androidx.room.util.c.a(), (Callable)new Callable<List<DashboardParentDay>>() {
            final /* synthetic */ v2 G = v2.d("SELECT * FROM dashboard_parent_day", 0);
            
            public List<DashboardParentDay> a() throws Exception {
                final Cursor d = androidx.room.util.c.d(j.this.a, (f)this.G, false, (CancellationSignal)null);
                try {
                    final int e = androidx.room.util.b.e(d, "parent_day_id");
                    final int e2 = androidx.room.util.b.e(d, "name");
                    final int e3 = androidx.room.util.b.e(d, "start");
                    final int e4 = androidx.room.util.b.e(d, "end");
                    final int e5 = androidx.room.util.b.e(d, "appointments");
                    final ArrayList list = new ArrayList<DashboardParentDay>(d.getCount());
                    while (d.moveToNext()) {
                        final long long1 = d.getLong(e);
                        String string;
                        if (d.isNull(e2)) {
                            string = null;
                        }
                        else {
                            string = d.getString(e2);
                        }
                        String string2;
                        if (d.isNull(e3)) {
                            string2 = null;
                        }
                        else {
                            string2 = d.getString(e3);
                        }
                        final org.joda.time.c b = j.this.c.b(string2);
                        String string3;
                        if (d.isNull(e4)) {
                            string3 = null;
                        }
                        else {
                            string3 = d.getString(e4);
                        }
                        final DashboardParentDay dashboardParentDay = new DashboardParentDay(long1, string, b, j.this.c.b(string3));
                        String string4;
                        if (d.isNull(e5)) {
                            string4 = null;
                        }
                        else {
                            string4 = d.getString(e5);
                        }
                        dashboardParentDay.setAppointments(j.this.d.i(string4));
                        list.add(dashboardParentDay);
                    }
                    return (List<DashboardParentDay>)list;
                }
                finally {
                    d.close();
                    this.G.release();
                }
            }
        }, (d)d);
    }
}
