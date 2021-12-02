// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.lockscreen.worker;

import androidx.work.ListenableWorker;
import androidx.work.f$a;
import androidx.work.f;
import org.koin.core.c$a;
import android.app.Notification;
import com.untis.mobile.lockscreen.d;
import com.untis.mobile.lockscreen.b;
import androidx.core.app.r$g;
import com.untis.mobile.persistence.models.timetable.TimeTableEntity;
import androidx.work.ListenableWorker$a;
import org.joda.time.t;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.persistence.models.profile.Profile;
import java.util.Iterator;
import com.untis.mobile.persistence.models.timetable.period.ui.PeriodModel;
import com.untis.mobile.persistence.models.timetable.period.ui.TimeTableModel;
import android.app.NotificationManager;
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

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0001\u001aB\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u0007H\u0002J\b\u0010\r\u001a\u00020\fH\u0016R\u001d\u0010\u0013\u001a\u00020\u000e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001c\u001a\u00020\u00188B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010!\u001a\u00020\u001d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0010\u001a\u0004\b\u001f\u0010 ¨\u0006'" }, d2 = { "Lcom/untis/mobile/lockscreen/worker/ShowLockScreenWorker;", "Landroidx/work/Worker;", "Lorg/koin/core/c;", "Lcom/untis/mobile/persistence/models/profile/Profile;", "d", "", "profileId", "Lcom/untis/mobile/persistence/models/timetable/period/ui/TimeTableModel;", "e", "timeTableModel", "Lcom/untis/mobile/persistence/models/timetable/period/ui/PeriodModel;", "c", "Landroidx/work/ListenableWorker$a;", "doWork", "Lcom/untis/mobile/services/profile/legacy/a;", "H", "Lkotlin/b0;", "getProfileService", "()Lcom/untis/mobile/services/profile/legacy/a;", "profileService", "Landroid/content/Context;", "G", "Landroid/content/Context;", "context", "Landroid/app/NotificationManager;", "J", "a", "()Landroid/app/NotificationManager;", "notificationManager", "Lcom/untis/mobile/persistence/dao/timetable/c;", "I", "g", "()Lcom/untis/mobile/persistence/dao/timetable/c;", "timetableModelDao", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "K", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class ShowLockScreenWorker extends Worker implements c
{
    @e
    public static final a K;
    @e
    public static final String L = "lock-screen";
    @e
    private static final String M = "profile_id";
    @e
    private static final String N = "entity_type";
    @e
    private static final String O = "entity_id";
    @e
    private static final String P = "date_iso";
    @e
    private static final String Q = "period_id";
    @e
    private final Context G;
    @e
    private final b0 H;
    @e
    private final b0 I;
    @e
    private final b0 J;
    
    static {
        K = new a(null);
    }
    
    public ShowLockScreenWorker(@e final Context g, @e final WorkerParameters workerParameters) {
        k0.p(g, "context");
        k0.p(workerParameters, "workerParameters");
        super(g, workerParameters);
        this.G = g;
        this.H = d0.c((n6.a<?>)new n6.a<com.untis.mobile.services.profile.legacy.a>() {
            final /* synthetic */ org.koin.core.scope.a G = ((c)this).getKoin().y();
            
            @Override
            public final com.untis.mobile.services.profile.legacy.a invoke() {
                return (com.untis.mobile.services.profile.legacy.a)this.G.t(k1.d(com.untis.mobile.services.profile.legacy.a.class), null, null);
            }
        });
        this.I = d0.c((n6.a<?>)new n6.a<com.untis.mobile.persistence.dao.timetable.c>() {
            final /* synthetic */ org.koin.core.scope.a G = ((c)this).getKoin().y();
            
            @Override
            public final com.untis.mobile.persistence.dao.timetable.c invoke() {
                return (com.untis.mobile.persistence.dao.timetable.c)this.G.t(k1.d(com.untis.mobile.persistence.dao.timetable.c.class), null, null);
            }
        });
        this.J = d0.c((n6.a<?>)new n6.a<NotificationManager>() {
            final /* synthetic */ org.koin.core.scope.a G = ((c)this).getKoin().y();
            
            @Override
            public final NotificationManager invoke() {
                return (NotificationManager)this.G.t(k1.d(NotificationManager.class), null, null);
            }
        });
    }
    
    private final NotificationManager a() {
        return this.J.getValue();
    }
    
    private final PeriodModel c(final TimeTableModel timeTableModel) {
        final long s = ((ListenableWorker)this).getInputData().s("period_id", 0L);
        if (s == 0L) {
            return null;
        }
        while (true) {
            for (final PeriodModel next : timeTableModel.getPeriods()) {
                if (next.getId() == s) {
                    final PeriodModel periodModel = next;
                    if (periodModel == null) {
                        return null;
                    }
                    return periodModel;
                }
            }
            PeriodModel next = null;
            continue;
        }
    }
    
    private final Profile d() {
        final com.untis.mobile.services.profile.legacy.a profileService = this.getProfileService();
        final String u = ((ListenableWorker)this).getInputData().u("profile_id");
        if (u == null) {
            return null;
        }
        return profileService.l(u);
    }
    
    private final TimeTableModel e(final String s) {
        final EntityType by = EntityType.Companion.findBy(((ListenableWorker)this).getInputData().p("entity_type", 0));
        final long s2 = ((ListenableWorker)this).getInputData().s("entity_id", 0L);
        final t c0 = t.c0(((ListenableWorker)this).getInputData().u("date_iso"));
        final com.untis.mobile.persistence.dao.timetable.c g = this.g();
        k0.o(c0, "date");
        return g.b(s, by, s2, c0);
    }
    
    private final com.untis.mobile.persistence.dao.timetable.c g() {
        return this.I.getValue();
    }
    
    private final com.untis.mobile.services.profile.legacy.a getProfileService() {
        return this.H.getValue();
    }
    
    @e
    public ListenableWorker$a doWork() {
        final Profile d = this.d();
        if (d != null) {
            final TimeTableModel e = this.e(d.getUniqueId());
            if (e != null) {
                final PeriodModel c = this.c(e);
                if (c != null) {
                    final TimeTableEntity timeTableEntity = new TimeTableEntity(e.getEntityType(), e.getEntityId(), false, 0, 0L, null, 60, null);
                    final Notification h = new r$g(this.G, "untismobile_important").r0(2131230954).Q(new b(this.G, d, timeTableEntity, e, c).g()).P(new d(this.G, d, e, timeTableEntity, c).i()).E0(1).i0(1).G("untismobile_important").h();
                    k0.o(h, "Builder(context, Constant.Channel.CHANNEL_HIGH_ID)\n                .setSmallIcon(R.drawable.ic_untis_clock)\n                .setCustomContentView(viewCollapsed)\n                .setCustomBigContentView(viewExpanded)\n                .setVisibility(NotificationCompat.VISIBILITY_PUBLIC)\n                .setPriority(NotificationCompat.PRIORITY_HIGH)\n                .setChannelId(Constant.Channel.CHANNEL_HIGH_ID)\n                .build()");
                    this.a().notify("lock-screen", (int)c.getId(), h);
                    final ListenableWorker$a d2 = ListenableWorker$a.d();
                    k0.o(d2, "success()");
                    return d2;
                }
            }
        }
        final ListenableWorker$a a = ListenableWorker$a.a();
        k0.o(a, "failure()");
        return a;
    }
    
    @e
    public org.koin.core.a getKoin() {
        return c$a.a((c)this);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J.\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006R\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000e¨\u0006\u0016" }, d2 = { "com/untis/mobile/lockscreen/worker/ShowLockScreenWorker$a", "", "", "profileId", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "", "entityId", "Lorg/joda/time/t;", "date", "periodId", "Landroidx/work/f;", "a", "INPUT_DATA_DATE_ISO", "Ljava/lang/String;", "INPUT_DATA_ENTITY_ID", "INPUT_DATA_ENTITY_TYPE", "INPUT_DATA_PERIOD_ID", "INPUT_DATA_PROFILE_ID", "NOTIFICATION_TAG", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final f a(@e final String s, @e final EntityType entityType, final long n, @e final t t, final long n2) {
            k0.p(s, "profileId");
            k0.p(entityType, "entityType");
            k0.p(t, "date");
            final f a = new f$a().q("profile_id", s).m("entity_type", entityType.getWebuntisId()).o("entity_id", n).q("date_iso", t.toString()).o("period_id", n2).a();
            k0.o(a, "Builder()\n                    .putString(INPUT_DATA_PROFILE_ID, profileId)\n                    .putInt(INPUT_DATA_ENTITY_TYPE, entityType.webuntisId)\n                    .putLong(INPUT_DATA_ENTITY_ID, entityId)\n                    .putString(INPUT_DATA_DATE_ISO, date.toString())\n                    .putLong(INPUT_DATA_PERIOD_ID, periodId)\n                    .build()");
            return a;
        }
    }
}
