// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.lockscreen;

import androidx.work.f0$a;
import org.joda.time.base.g;
import android.util.Log;
import com.untis.mobile.persistence.models.profile.Profile;
import org.joda.time.t;
import com.untis.mobile.lockscreen.worker.ShowLockScreenWorker;
import androidx.work.f0;
import androidx.work.s;
import java.util.concurrent.TimeUnit;
import com.untis.mobile.lockscreen.worker.HideLockScreenWorker;
import androidx.work.s$a;
import java.util.Iterator;
import com.untis.mobile.persistence.models.timetable.period.ui.TimeTableModel;
import com.untis.mobile.persistence.models.timetable.period.ui.PeriodModel;
import com.untis.mobile.utils.v;
import java.util.ArrayList;
import com.untis.mobile.persistence.models.timetable.period.Period;
import java.util.List;
import com.untis.mobile.persistence.models.EntityType;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import androidx.work.d0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 %2\u00020\u0001:\u0001\u0010B/\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\u0006\u0010\"\u001a\u00020 \u0012\u0006\u0010\u001f\u001a\u00020\u001d\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b#\u0010$J8\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0002J\u0018\u0010\u000e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006H\u0002J&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\n\u001a\u00020\fH\u0016J\b\u0010\u0011\u001a\u00020\fH\u0016R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001eR\u0016\u0010\"\u001a\u00020 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010!¨\u0006&" }, d2 = { "Lcom/untis/mobile/lockscreen/c;", "Lcom/untis/mobile/lockscreen/a;", "", "profileId", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "", "entityId", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "period", "start", "now", "Lkotlin/j2;", "c", "b", "", "a", "stop", "Lcom/untis/mobile/persistence/dao/profile/a;", "d", "Lcom/untis/mobile/persistence/dao/profile/a;", "profileDao", "Lcom/untis/mobile/utils/a;", "e", "Lcom/untis/mobile/utils/a;", "settings", "Landroidx/work/d0;", "Landroidx/work/d0;", "workManager", "Lcom/untis/mobile/persistence/dao/timetable/a;", "Lcom/untis/mobile/persistence/dao/timetable/a;", "periodDao", "Lcom/untis/mobile/persistence/dao/timetable/c;", "Lcom/untis/mobile/persistence/dao/timetable/c;", "timetableModelDao", "<init>", "(Landroidx/work/d0;Lcom/untis/mobile/persistence/dao/timetable/c;Lcom/untis/mobile/persistence/dao/timetable/a;Lcom/untis/mobile/persistence/dao/profile/a;Lcom/untis/mobile/utils/a;)V", "f", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class c implements com.untis.mobile.lockscreen.a
{
    @e
    public static final a f;
    @e
    private static final String g = "lock-screen-worker-show";
    @e
    private static final String h = "lock-screen-worker-hide";
    @e
    private final d0 a;
    @e
    private final com.untis.mobile.persistence.dao.timetable.c b;
    @e
    private final com.untis.mobile.persistence.dao.timetable.a c;
    @e
    private final com.untis.mobile.persistence.dao.profile.a d;
    @e
    private final com.untis.mobile.utils.a e;
    
    static {
        f = new a(null);
    }
    
    public c(@e final d0 a, @e final com.untis.mobile.persistence.dao.timetable.c b, @e final com.untis.mobile.persistence.dao.timetable.a c, @e final com.untis.mobile.persistence.dao.profile.a d, @e final com.untis.mobile.utils.a e) {
        k0.p(a, "workManager");
        k0.p(b, "timetableModelDao");
        k0.p(c, "periodDao");
        k0.p(d, "profileDao");
        k0.p(e, "settings");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    private final List<Period> a(final String s, final EntityType entityType, final long n) {
        final ArrayList<Long> list = new ArrayList<Long>();
        final TimeTableModel b = this.b.b(s, entityType, n, v.a.g());
        if (b != null) {
            final List<PeriodModel> periods = b.getPeriods();
            if (periods != null) {
                final Iterator<Object> iterator = periods.iterator();
                while (iterator.hasNext()) {
                    list.add(iterator.next().getId());
                }
            }
        }
        final TimeTableModel b2 = this.b.b(s, entityType, n, v.a.h());
        if (b2 != null) {
            final List<PeriodModel> periods2 = b2.getPeriods();
            if (periods2 != null) {
                final Iterator<Object> iterator2 = periods2.iterator();
                while (iterator2.hasNext()) {
                    list.add(iterator2.next().getId());
                }
            }
        }
        if (list.isEmpty()) {
            return kotlin.collections.v.E();
        }
        final List<Period> f = this.c.f(s, list);
        final ArrayList<Period> list2 = new ArrayList<Period>();
        for (final Period next : f) {
            if (((org.joda.time.base.c)next.getEnd()).g()) {
                list2.add(next);
            }
        }
        return (List<Period>)kotlin.collections.v.d5((Iterable<? extends Comparable>)list2);
    }
    
    private final void b(final Period period, long n) {
        if ((n = ((g)period.getEnd()).n() - n) < 0L) {
            n = 0L;
        }
        final f0 b = ((f0$a)((f0$a)((f0$a)((f0$a)new s$a((Class)HideLockScreenWorker.class)).j(n, TimeUnit.MILLISECONDS)).n(HideLockScreenWorker.H.a(period.getId()))).a("lock-screen-worker-hide")).b();
        k0.o(b, "OneTimeWorkRequestBuilder<HideLockScreenWorker>()\n                .setInitialDelay(duration, TimeUnit.MILLISECONDS)\n                .setInputData(HideLockScreenWorker.createInputData(period.id))\n                .addTag(TAG_LOCK_SCREEN_HIDE)\n                .build()");
        this.a.j((f0)b);
    }
    
    private final void c(final String s, final EntityType entityType, final long n, final Period period, long n2, long n3) {
        n3 = (n2 -= n3);
        if (n3 < 0L) {
            n2 = 0L;
        }
        final s$a s$a = (s$a)((f0$a)new s$a((Class)ShowLockScreenWorker.class)).j(n2, TimeUnit.MILLISECONDS);
        final ShowLockScreenWorker.a k = ShowLockScreenWorker.K;
        final t h1 = period.getStart().h1();
        k0.o(h1, "period.start.toLocalDate()");
        final f0 b = ((f0$a)((f0$a)((f0$a)s$a).n(k.a(s, entityType, n, h1, period.getId()))).a("lock-screen-worker-show")).b();
        k0.o(b, "OneTimeWorkRequestBuilder<ShowLockScreenWorker>()\n                .setInitialDelay(duration, TimeUnit.MILLISECONDS)\n                .setInputData(ShowLockScreenWorker.createInputData(profileId, entityType, entityId, period.start.toLocalDate(), period.id))\n                .addTag(TAG_LOCK_SCREEN_SHOW)\n                .build()");
        this.a.j((f0)b);
    }
    
    @Override
    public void start() {
        final long n = ((g)v.a.e()).n();
        final List<Profile> a = this.d.a();
        final ArrayList<Profile> list = new ArrayList<Profile>();
        for (final Profile next : a) {
            if (next.getLockScreen()) {
                list.add(next);
            }
        }
        final ArrayList<Profile> list2 = new ArrayList<Profile>();
        for (final Profile next2 : list) {
            if (this.e.M(next2)) {
                list2.add(next2);
            }
        }
        final ArrayList<Profile> list3 = new ArrayList<Profile>();
        for (final Profile next3 : list2) {
            if (next3.hasEntity()) {
                list3.add(next3);
            }
        }
        Object iterator4 = list3.iterator();
        while (((Iterator)iterator4).hasNext()) {
            final Profile profile = ((Iterator<Profile>)iterator4).next();
            final String uniqueId = profile.getUniqueId();
            final EntityType entityType = profile.getEntityType();
            final long entityId = profile.getEntityId();
            final List<Period> a2 = this.a(uniqueId, entityType, entityId);
            final StringBuilder sb = new StringBuilder();
            sb.append("creating lock screen worker for ");
            sb.append(a2.size());
            sb.append(" periods");
            Log.d("untis_log", sb.toString());
            final Iterator<Object> iterator5 = a2.iterator();
            Period period = null;
            final Iterator<Profile> iterator6 = (Iterator<Profile>)iterator4;
            while (true) {
                iterator4 = iterator6;
                if (!iterator5.hasNext()) {
                    break;
                }
                final Period period2 = iterator5.next();
                Object v0 = null;
                Label_0383: {
                    if (period != null) {
                        final org.joda.time.c end = period.getEnd();
                        if (end != null) {
                            v0 = end.V0(1);
                            break Label_0383;
                        }
                    }
                    v0 = null;
                }
                Object a3 = v0;
                if (v0 == null) {
                    a3 = period2.getStart().a2();
                }
                this.c(uniqueId, entityType, entityId, period2, ((g)a3).n(), n);
                this.b(period2, n);
                period = period2;
            }
        }
    }
    
    @Override
    public void stop() {
        this.a.f("lock-screen-worker-show");
        this.a.f("lock-screen-worker-hide");
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b" }, d2 = { "com/untis/mobile/lockscreen/c$a", "", "", "TAG_LOCK_SCREEN_HIDE", "Ljava/lang/String;", "TAG_LOCK_SCREEN_SHOW", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
    }
}
