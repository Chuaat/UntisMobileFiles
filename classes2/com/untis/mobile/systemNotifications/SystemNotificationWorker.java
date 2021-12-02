// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.systemNotifications;

import androidx.work.f0$a;
import org.joda.time.base.g;
import androidx.work.ListenableWorker;
import androidx.work.f0;
import androidx.work.s;
import androidx.work.k;
import java.util.concurrent.TimeUnit;
import androidx.work.s$a;
import androidx.work.f$a;
import androidx.work.f;
import org.koin.core.c$a;
import com.untis.mobile.utils.c0;
import com.untis.mobile.utils.p0;
import androidx.work.ListenableWorker$a;
import com.untis.mobile.persistence.models.timetable.TimeTableEntity;
import com.untis.mobile.ui.activities.period.t;
import java.util.Collection;
import kotlin.collections.v;
import com.untis.mobile.ui.activities.period.PeriodDetailActivity;
import com.untis.mobile.ui.activities.InfoCenterActivity;
import kotlin.h0;
import android.os.Bundle;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.m0;
import n6.a;
import kotlin.jvm.internal.k0;
import androidx.work.WorkerParameters;
import kotlin.jvm.internal.w;
import kotlin.b0;
import android.content.Context;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import org.koin.core.c;
import androidx.work.Worker;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u0006B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\n\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0016\u001a\u00020\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001c" }, d2 = { "Lcom/untis/mobile/systemNotifications/SystemNotificationWorker;", "Landroidx/work/Worker;", "Lorg/koin/core/c;", "Lcom/untis/mobile/systemNotifications/a;", "systemNotification", "Landroid/os/Bundle;", "a", "c", "d", "e", "g", "Landroidx/work/ListenableWorker$a;", "doWork", "Landroid/content/Context;", "G", "Landroid/content/Context;", "context", "Lcom/untis/mobile/persistence/dao/notification/a;", "H", "Lkotlin/b0;", "h", "()Lcom/untis/mobile/persistence/dao/notification/a;", "systemNotificationDao", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "I", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class SystemNotificationWorker extends Worker implements c
{
    @e
    public static final a I;
    @e
    public static final String J = "system-notification";
    @e
    private static final String K = "system_notification_id";
    @e
    private static final String L = "profile_id";
    @e
    private final Context G;
    @e
    private final b0 H;
    
    static {
        I = new a(null);
    }
    
    public SystemNotificationWorker(@e final Context g, @e final WorkerParameters workerParameters) {
        k0.p(g, "context");
        k0.p(workerParameters, "workerParameters");
        super(g, workerParameters);
        this.G = g;
        this.H = d0.c((n6.a<?>)new n6.a<com.untis.mobile.persistence.dao.notification.a>() {
            final /* synthetic */ org.koin.core.scope.a G = ((c)this).getKoin().y();
            
            @Override
            public final com.untis.mobile.persistence.dao.notification.a invoke() {
                return (com.untis.mobile.persistence.dao.notification.a)this.G.t(k1.d(com.untis.mobile.persistence.dao.notification.a.class), null, null);
            }
        });
    }
    
    private final Bundle a(final com.untis.mobile.systemNotifications.a a) {
        final int n = b.a[a.r().ordinal()];
        Bundle bundle;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        if (n != 5) {
                            throw new h0();
                        }
                        bundle = new Bundle();
                    }
                    else {
                        bundle = new Bundle();
                    }
                }
                else {
                    bundle = this.e(a);
                }
            }
            else {
                bundle = this.d(a);
            }
        }
        else {
            bundle = this.c(a);
        }
        return bundle;
    }
    
    private final Bundle c(final com.untis.mobile.systemNotifications.a a) {
        final Bundle k = InfoCenterActivity.K(a.m(), true);
        k0.o(k, "infoCenterActivityArguments(systemNotification.profileId, true)");
        return k;
    }
    
    private final Bundle d(final com.untis.mobile.systemNotifications.a a) {
        final Bundle k = InfoCenterActivity.K(a.m(), false);
        k0.o(k, "infoCenterActivityArguments(systemNotification.profileId, false)");
        return k;
    }
    
    private final Bundle e(final com.untis.mobile.systemNotifications.a a) {
        final TimeTableEntity g = a.G();
        if (g == null) {
            return new Bundle();
        }
        return PeriodDetailActivity.a.f(PeriodDetailActivity.W, a.m(), g, v.k(a.c()), a.c(), null, 16, null);
    }
    
    private final com.untis.mobile.systemNotifications.a g() {
        final String u = ((ListenableWorker)this).getInputData().u("profile_id");
        if (u == null) {
            return null;
        }
        return this.h().a(u, ((ListenableWorker)this).getInputData().p("system_notification_id", 0));
    }
    
    private final com.untis.mobile.persistence.dao.notification.a h() {
        return this.H.getValue();
    }
    
    @e
    public ListenableWorker$a doWork() {
        final com.untis.mobile.systemNotifications.a g = this.g();
        ListenableWorker$a listenableWorker$a;
        String s;
        if (g == null) {
            listenableWorker$a = ListenableWorker$a.a();
            s = "failure()";
        }
        else {
            c0.f(this.G, new p0(g.q(), g.h(), 2131623937, 2131623936, com.untis.mobile.utils.time.a.d(), g.e(), g.l(), this.a(g)));
            if (g.r() == com.untis.mobile.systemNotifications.e.K) {
                g.u(true);
                this.h().g(g);
            }
            else {
                this.h().e(g);
            }
            listenableWorker$a = ListenableWorker$a.d();
            s = "success()";
        }
        k0.o(listenableWorker$a, s);
        return listenableWorker$a;
    }
    
    @e
    public org.koin.core.a getKoin() {
        return c$a.a((c)this);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e¨\u0006\u0013" }, d2 = { "com/untis/mobile/systemNotifications/SystemNotificationWorker$a", "", "Lcom/untis/mobile/systemNotifications/a;", "systemNotification", "Landroidx/work/f;", "a", "", "now", "Landroidx/work/d0;", "workManager", "Lkotlin/j2;", "b", "", "INTENT_DATA_PROFILE_ID", "Ljava/lang/String;", "INTENT_DATA_SYSTEM_NOTIFICATION_ID", "TAG_SYSTEM_NOTIFICATION", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        private final f a(final com.untis.mobile.systemNotifications.a a) {
            final f a2 = new f$a().q("profile_id", a.m()).m("system_notification_id", a.e()).a();
            k0.o(a2, "Builder()\n                    .putString(INTENT_DATA_PROFILE_ID, systemNotification.profileId)\n                    .putInt(INTENT_DATA_SYSTEM_NOTIFICATION_ID, systemNotification.id)\n                    .build()");
            return a2;
        }
        
        public final void b(long n, @e final androidx.work.d0 d0, @e final com.untis.mobile.systemNotifications.a a) {
            k0.p(d0, "workManager");
            k0.p(a, "systemNotification");
            if ((n = a.n() - n) < 0L) {
                n = 0L;
            }
            final f0 b = ((f0$a)((f0$a)((f0$a)((f0$a)new s$a((Class)SystemNotificationWorker.class)).j(n, TimeUnit.MILLISECONDS)).n(this.a(a))).a("system-notification")).b();
            k0.o(b, "OneTimeWorkRequestBuilder<SystemNotificationWorker>()\n                    .setInitialDelay(duration, TimeUnit.MILLISECONDS)\n                    .setInputData(createInputData(systemNotification))\n                    .addTag(TAG_SYSTEM_NOTIFICATION)\n                    .build()");
            d0.m(k0.C("system-notification-work-", a.e()), k.H, (s)b);
        }
    }
}
