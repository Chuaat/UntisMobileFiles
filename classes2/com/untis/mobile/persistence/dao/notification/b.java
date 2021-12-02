// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.dao.notification;

import org.joda.time.base.g;
import io.realm.q;
import com.untis.mobile.utils.j0;
import kotlin.jvm.internal.m0;
import kotlin.j2;
import n6.l;
import io.realm.RealmQuery;
import io.realm.f0;
import java.util.Iterator;
import io.realm.s0;
import java.util.ArrayList;
import kotlin.collections.v;
import java.util.List;
import org.jetbrains.annotations.f;
import java.io.Closeable;
import kotlin.io.c;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import com.untis.mobile.persistence.realm.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0016J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\bH\u0016J.\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0006H\u0016J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0006H\u0016R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001b¨\u0006\u001f" }, d2 = { "Lcom/untis/mobile/persistence/dao/notification/b;", "Lcom/untis/mobile/persistence/dao/notification/a;", "", "profileId", "", "id", "Lcom/untis/mobile/systemNotifications/a;", "a", "", "homeworkId", "", "b", "examId", "d", "periodId", "f", "Lorg/joda/time/c;", "start", "end", "", "includeDeleted", "c", "systemNotification", "Lkotlin/j2;", "e", "g", "Lcom/untis/mobile/persistence/realm/d;", "Lcom/untis/mobile/persistence/realm/d;", "realmService", "<init>", "(Lcom/untis/mobile/persistence/realm/d;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b implements a
{
    @e
    private final d a;
    
    public b(@e final d a) {
        k0.p(a, "realmService");
        this.a = a;
    }
    
    @f
    @Override
    public com.untis.mobile.systemNotifications.a a(@e String c, final int i) {
        k0.p(c, "profileId");
        c = (String)this.a.c(c);
        try {
            final a5.a a = ((f0)c).f3(a5.a.class).D("deleted", Boolean.FALSE).H("id", i).d0();
            if (a == null) {
                c.a((Closeable)c, null);
                return null;
            }
            final com.untis.mobile.systemNotifications.a b = c.a.b(a);
            c.a((Closeable)c, null);
            return b;
        }
        finally {
            try {}
            finally {
                final Throwable t;
                c.a((Closeable)c, t);
            }
        }
    }
    
    @e
    @Override
    public List<com.untis.mobile.systemNotifications.a> b(@e String c, final long l) {
        k0.p(c, "profileId");
        c = (String)this.a.c(c);
        try {
            final s0<a5.a> b0 = ((f0)c).f3(a5.a.class).H("type", com.untis.mobile.systemNotifications.e.L.d()).I("entityId", l).b0();
            k0.o(b0, "realm.where(RealmSystemNotification::class.java)\n                            .equalTo(\"type\", SystemNotificationType.HOMEWORK.value)\n                            .equalTo(\"entityId\", homeworkId)\n                            .findAll()");
            final ArrayList list = new ArrayList<com.untis.mobile.systemNotifications.a>(v.Y((Iterable<?>)b0, 10));
            for (final a5.a a : b0) {
                final com.untis.mobile.persistence.dao.notification.c a2 = c.a;
                k0.o(a, "it");
                list.add(a2.b(a));
            }
            c.a((Closeable)c, null);
            return (List<com.untis.mobile.systemNotifications.a>)list;
        }
        finally {
            try {}
            finally {
                final Throwable t;
                c.a((Closeable)c, t);
            }
        }
    }
    
    @e
    @Override
    public List<com.untis.mobile.systemNotifications.a> c(@e final String s, @e final org.joda.time.c c, @e final org.joda.time.c c2, final boolean b) {
        k0.p(s, "profileId");
        k0.p(c, "start");
        k0.p(c2, "end");
        final f0 c3 = this.a.c(s);
        try {
            RealmQuery<a5.a> realmQuery = c3.f3(a5.a.class).u0("target", ((g)c).n()).a1("target", ((g)c2).n());
            if (!b) {
                realmQuery = realmQuery.D("deleted", Boolean.FALSE);
            }
            final s0<a5.a> b2 = realmQuery.b0();
            k0.o(b2, "realmQuery\n                            .findAll()");
            final ArrayList list = new ArrayList<com.untis.mobile.systemNotifications.a>(v.Y((Iterable<?>)b2, 10));
            for (final a5.a a : b2) {
                final com.untis.mobile.persistence.dao.notification.c a2 = c.a;
                k0.o(a, "it");
                list.add(a2.b(a));
            }
            c.a(c3, null);
            return (List<com.untis.mobile.systemNotifications.a>)list;
        }
        finally {
            try {}
            finally {
                c.a(c3, (Throwable)s);
            }
        }
    }
    
    @e
    @Override
    public List<com.untis.mobile.systemNotifications.a> d(@e String c, final long l) {
        k0.p(c, "profileId");
        c = (String)this.a.c(c);
        try {
            final s0<a5.a> b0 = ((f0)c).f3(a5.a.class).H("type", com.untis.mobile.systemNotifications.e.I.d()).I("entityId", l).b0();
            k0.o(b0, "realm.where(RealmSystemNotification::class.java)\n                            .equalTo(\"type\", SystemNotificationType.EXAM.value)\n                            .equalTo(\"entityId\", examId)\n                            .findAll()");
            final ArrayList list = new ArrayList<com.untis.mobile.systemNotifications.a>(v.Y((Iterable<?>)b0, 10));
            for (final a5.a a : b0) {
                final com.untis.mobile.persistence.dao.notification.c a2 = c.a;
                k0.o(a, "it");
                list.add(a2.b(a));
            }
            c.a((Closeable)c, null);
            return (List<com.untis.mobile.systemNotifications.a>)list;
        }
        finally {
            try {}
            finally {
                final Throwable t;
                c.a((Closeable)c, t);
            }
        }
    }
    
    @Override
    public void e(@e final com.untis.mobile.systemNotifications.a a) {
        k0.p(a, "systemNotification");
        j0.b(this.a.c(a.m()), new l<f0, j2>() {
            public final void a(@e final f0 f0) {
                k0.p(f0, "realm");
                f0.f3(a5.a.class).H("id", a.e()).b0().T3();
            }
        });
    }
    
    @e
    @Override
    public List<com.untis.mobile.systemNotifications.a> f(@e String c, final long l) {
        k0.p(c, "profileId");
        c = (String)this.a.c(c);
        try {
            final s0<a5.a> b0 = ((f0)c).f3(a5.a.class).H("type", com.untis.mobile.systemNotifications.e.K.d()).I("entityId", l).b0();
            k0.o(b0, "realm.where(RealmSystemNotification::class.java)\n                            .equalTo(\"type\", SystemNotificationType.CUSTOM_PERIOD_DETAIL.value)\n                            .equalTo(\"entityId\", periodId)\n                            .findAll()");
            final ArrayList list = new ArrayList<com.untis.mobile.systemNotifications.a>(v.Y((Iterable<?>)b0, 10));
            for (final a5.a a : b0) {
                final com.untis.mobile.persistence.dao.notification.c a2 = c.a;
                k0.o(a, "it");
                list.add(a2.b(a));
            }
            c.a((Closeable)c, null);
            return (List<com.untis.mobile.systemNotifications.a>)list;
        }
        finally {
            try {}
            finally {
                final Throwable t;
                c.a((Closeable)c, t);
            }
        }
    }
    
    @Override
    public void g(@e final com.untis.mobile.systemNotifications.a a) {
        k0.p(a, "systemNotification");
        j0.b(this.a.c(a.m()), new l<f0, j2>() {
            public final void a(@e final f0 f0) {
                k0.p(f0, "realm");
                if (a.e() < 1) {
                    final Number h1 = f0.f3(a5.a.class).h1("id");
                    int intValue;
                    if (h1 == null) {
                        intValue = 0;
                    }
                    else {
                        intValue = h1.intValue();
                    }
                    a.x(intValue + 1);
                }
                f0.G0(com.untis.mobile.persistence.dao.notification.c.a.a(a), new q[0]);
            }
        });
    }
}
