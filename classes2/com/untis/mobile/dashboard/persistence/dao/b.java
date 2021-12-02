// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.persistence.dao;

import androidx.sqlite.db.e;
import com.untis.mobile.persistence.models.EntityType;
import android.database.Cursor;
import java.util.ArrayList;
import android.os.CancellationSignal;
import androidx.sqlite.db.f;
import androidx.room.v2;
import java.util.Collections;
import java.util.List;
import androidx.sqlite.db.h;
import androidx.room.a3;
import androidx.room.t0;
import com.untis.mobile.utils.persistence.typeconverter.c;
import com.untis.mobile.dashboard.persistence.model.classlead.DashboardClassbookEvent;
import androidx.room.u0;
import androidx.room.r2;

public final class b implements a
{
    private final r2 a;
    private final u0<DashboardClassbookEvent> b;
    private final com.untis.mobile.utils.persistence.typeconverter.b c;
    private final c d;
    private final t0<DashboardClassbookEvent> e;
    private final a3 f;
    
    public b(final r2 a) {
        this.c = new com.untis.mobile.utils.persistence.typeconverter.b();
        this.d = new c();
        this.a = a;
        this.b = new u0<DashboardClassbookEvent>(a) {
            public void a(final h h, final DashboardClassbookEvent dashboardClassbookEvent) {
                ((e)h).l2(1, dashboardClassbookEvent.getId());
                final Integer b = com.untis.mobile.dashboard.persistence.dao.b.this.c.b(dashboardClassbookEvent.getEntityType());
                if (b == null) {
                    ((e)h).c4(2);
                }
                else {
                    ((e)h).l2(2, (long)b);
                }
                ((e)h).l2(3, dashboardClassbookEvent.getEntityId());
                final String a = com.untis.mobile.dashboard.persistence.dao.b.this.d.a(dashboardClassbookEvent.getDateTime());
                if (a == null) {
                    ((e)h).c4(4);
                }
                else {
                    ((e)h).K0(4, a);
                }
                if (dashboardClassbookEvent.getText() == null) {
                    ((e)h).c4(5);
                }
                else {
                    ((e)h).K0(5, dashboardClassbookEvent.getText());
                }
                ((e)h).l2(6, dashboardClassbookEvent.getReasonId());
                if (dashboardClassbookEvent.getKlassenId() == null) {
                    ((e)h).c4(7);
                }
                else {
                    ((e)h).l2(7, (long)dashboardClassbookEvent.getKlassenId());
                }
            }
            
            public String createQuery() {
                return "INSERT OR REPLACE INTO `dashboard_classbook_event` (`event_id`,`entity_type`,`entity_Id`,`date_time`,`text`,`reason_id`,`klassen_id`) VALUES (?,?,?,?,?,?,?)";
            }
        };
        this.e = new t0<DashboardClassbookEvent>(a) {
            public void a(final h h, final DashboardClassbookEvent dashboardClassbookEvent) {
                ((e)h).l2(1, dashboardClassbookEvent.getId());
            }
            
            public String createQuery() {
                return "DELETE FROM `dashboard_classbook_event` WHERE `event_id` = ?";
            }
        };
        this.f = new a3(a) {
            public String createQuery() {
                return "DELETE FROM dashboard_classbook_event";
            }
        };
    }
    
    public static List<Class<?>> h() {
        return Collections.emptyList();
    }
    
    @Override
    public List<DashboardClassbookEvent> a() {
        final v2 d = v2.d("SELECT * FROM dashboard_classbook_event", 0);
        this.a.d();
        final Cursor d2 = androidx.room.util.c.d(this.a, (f)d, false, (CancellationSignal)null);
        try {
            final int e = androidx.room.util.b.e(d2, "event_id");
            final int e2 = androidx.room.util.b.e(d2, "entity_type");
            final int e3 = androidx.room.util.b.e(d2, "entity_Id");
            final int e4 = androidx.room.util.b.e(d2, "date_time");
            final int e5 = androidx.room.util.b.e(d2, "text");
            final int e6 = androidx.room.util.b.e(d2, "reason_id");
            final int e7 = androidx.room.util.b.e(d2, "klassen_id");
            final ArrayList list = new ArrayList<DashboardClassbookEvent>(d2.getCount());
            while (d2.moveToNext()) {
                final long long1 = d2.getLong(e);
                Integer value;
                if (d2.isNull(e2)) {
                    value = null;
                }
                else {
                    value = d2.getInt(e2);
                }
                final EntityType d3 = this.c.d(value);
                final long long2 = d2.getLong(e3);
                String string;
                if (d2.isNull(e4)) {
                    string = null;
                }
                else {
                    string = d2.getString(e4);
                }
                final org.joda.time.c b = this.d.b(string);
                String string2;
                if (d2.isNull(e5)) {
                    string2 = null;
                }
                else {
                    string2 = d2.getString(e5);
                }
                final DashboardClassbookEvent dashboardClassbookEvent = new DashboardClassbookEvent(long1, d3, long2, b, string2, d2.getLong(e6));
                Long value2;
                if (d2.isNull(e7)) {
                    value2 = null;
                }
                else {
                    value2 = d2.getLong(e7);
                }
                dashboardClassbookEvent.setKlassenId(value2);
                list.add(dashboardClassbookEvent);
            }
            return (List<DashboardClassbookEvent>)list;
        }
        finally {
            d2.close();
            d.release();
        }
    }
    
    @Override
    public void b(final List<DashboardClassbookEvent> list) {
        this.a.d();
        this.a.e();
        try {
            this.b.insert((Iterable)list);
            this.a.I();
        }
        finally {
            this.a.k();
        }
    }
    
    @Override
    public long c(final DashboardClassbookEvent dashboardClassbookEvent) {
        this.a.d();
        this.a.e();
        try {
            final long insertAndReturnId = this.b.insertAndReturnId((Object)dashboardClassbookEvent);
            this.a.I();
            return insertAndReturnId;
        }
        finally {
            this.a.k();
        }
    }
    
    @Override
    public void d(final DashboardClassbookEvent dashboardClassbookEvent) {
        this.a.d();
        this.a.e();
        try {
            this.e.handle((Object)dashboardClassbookEvent);
            this.a.I();
        }
        finally {
            this.a.k();
        }
    }
    
    @Override
    public void e() {
        this.a.d();
        final h acquire = this.f.acquire();
        this.a.e();
        try {
            acquire.c1();
            this.a.I();
        }
        finally {
            this.a.k();
            this.f.release(acquire);
        }
    }
}
