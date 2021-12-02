// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.silentmode;

import androidx.work.f0$a;
import org.joda.time.base.g;
import androidx.core.content.d;
import com.untis.mobile.utils.c0;
import com.untis.mobile.persistence.models.silentmode.SilentModeSettings;
import kotlin.jvm.internal.m0;
import kotlin.j2;
import android.annotation.SuppressLint;
import android.os.VibrationEffect;
import android.os.Build$VERSION;
import androidx.work.f0;
import androidx.work.s;
import java.util.concurrent.TimeUnit;
import androidx.work.s$a;
import com.untis.mobile.persistence.models.timetable.period.PeriodElement;
import java.util.Collection;
import java.util.Iterator;
import com.untis.mobile.persistence.models.timetable.period.ui.TimeTableModel;
import java.util.Comparator;
import org.joda.time.l0;
import com.untis.mobile.persistence.models.timetable.period.ui.PeriodModel;
import com.untis.mobile.utils.v;
import java.util.ArrayList;
import org.joda.time.r;
import java.util.List;
import com.untis.mobile.persistence.models.EntityType;
import android.os.Bundle;
import com.untis.mobile.ui.activities.common.b;
import com.untis.mobile.ui.core.CoreActivity;
import com.untis.mobile.utils.p0;
import com.untis.mobile.persistence.models.timetable.period.Period;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import android.os.Vibrator;
import androidx.work.d0;
import android.app.NotificationManager;
import android.media.AudioManager;
import android.content.Context;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 A2\u00020\u0001:\u0001!BG\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010(\u001a\u00020&\u0012\u0006\u0010>\u001a\u00020<\u0012\u0006\u0010+\u001a\u00020)\u0012\u0006\u0010.\u001a\u00020,\u0012\u0006\u00106\u001a\u000203\u0012\u0006\u0010:\u001a\u000207\u0012\u0006\u00102\u001a\u00020/¢\u0006\u0004\b?\u0010@J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004H\u0002J&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002J$\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000fH\u0002J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0002H\u0002J\b\u0010\u001c\u001a\u00020\u001bH\u0002J\b\u0010\u001d\u001a\u00020\u0006H\u0003J\b\u0010\u001e\u001a\u00020\u0019H\u0016J\u0010\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0016J \u0010\"\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\b\u0010#\u001a\u00020\u0006H\u0016J\b\u0010$\u001a\u00020\u0006H\u0016J\b\u0010%\u001a\u00020\u0006H\u0016R\u0016\u0010(\u001a\u00020&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010'R\u0016\u0010+\u001a\u00020)8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010*R\u0016\u0010.\u001a\u00020,8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010;R\u0016\u0010>\u001a\u00020<8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010=¨\u0006B" }, d2 = { "Lcom/untis/mobile/silentmode/c;", "Lcom/untis/mobile/silentmode/a;", "", "now", "Lorg/joda/time/c;", "start", "Lkotlin/j2;", "p", "end", "o", "", "profileId", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "entityId", "", "Lorg/joda/time/r;", "k", "", "breakThreshold", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "periods", "n", "period", "teacherId", "", "m", "Lcom/untis/mobile/utils/p0;", "j", "q", "d", "Landroid/content/Context;", "context", "a", "c", "stop", "e", "b", "Landroid/media/AudioManager;", "Landroid/media/AudioManager;", "audioManager", "Landroidx/work/d0;", "Landroidx/work/d0;", "workManager", "Lcom/untis/mobile/persistence/dao/timetable/a;", "Lcom/untis/mobile/persistence/dao/timetable/a;", "periodDao", "Landroid/os/Vibrator;", "h", "Landroid/os/Vibrator;", "vibrator", "Lcom/untis/mobile/persistence/dao/timetable/c;", "f", "Lcom/untis/mobile/persistence/dao/timetable/c;", "timetableModelDao", "Lcom/untis/mobile/utils/a;", "g", "Lcom/untis/mobile/utils/a;", "settings", "Landroid/content/Context;", "Landroid/app/NotificationManager;", "Landroid/app/NotificationManager;", "notificationManager", "<init>", "(Landroid/content/Context;Landroid/media/AudioManager;Landroid/app/NotificationManager;Landroidx/work/d0;Lcom/untis/mobile/persistence/dao/timetable/a;Lcom/untis/mobile/persistence/dao/timetable/c;Lcom/untis/mobile/utils/a;Landroid/os/Vibrator;)V", "i", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class c implements com.untis.mobile.silentmode.a
{
    @e
    public static final a i;
    @e
    private static final String j = "silent-mode-start";
    @e
    private static final String k = "silent-mode-end";
    private static final int l = 999;
    private static final long m = 60000L;
    @e
    private final Context a;
    @e
    private final AudioManager b;
    @e
    private final NotificationManager c;
    @e
    private final d0 d;
    @e
    private final com.untis.mobile.persistence.dao.timetable.a e;
    @e
    private final com.untis.mobile.persistence.dao.timetable.c f;
    @e
    private final com.untis.mobile.utils.a g;
    @e
    private final Vibrator h;
    
    static {
        i = new a(null);
    }
    
    public c(@e final Context a, @e final AudioManager b, @e final NotificationManager c, @e final d0 d, @e final com.untis.mobile.persistence.dao.timetable.a e, @e final com.untis.mobile.persistence.dao.timetable.c f, @e final com.untis.mobile.utils.a g, @e final Vibrator h) {
        k0.p(a, "context");
        k0.p(b, "audioManager");
        k0.p(c, "notificationManager");
        k0.p(d, "workManager");
        k0.p(e, "periodDao");
        k0.p(f, "timetableModelDao");
        k0.p(g, "settings");
        k0.p(h, "vibrator");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public static final /* synthetic */ AudioManager g(final c c) {
        return c.b;
    }
    
    public static final /* synthetic */ NotificationManager h(final c c) {
        return c.c;
    }
    
    public static final /* synthetic */ com.untis.mobile.utils.a i(final c c) {
        return c.g;
    }
    
    private final p0 j() {
        final String string = this.a.getString(2131886586);
        k0.o(string, "context.getString(R.string.reminder_silentModeTitle_text)");
        final String string2 = this.a.getString(2131886585);
        k0.o(string2, "context.getString(R.string.reminder_silentModeRunning_text)");
        return new p0(string, string2, 2131230862, 2131623936, com.untis.mobile.utils.time.a.d(), 999, CoreActivity.class, null);
    }
    
    private final List<r> k(final String s, final EntityType entityType, final long n) {
        final ArrayList<Long> list = new ArrayList<Long>();
        final TimeTableModel b = this.f.b(s, entityType, n, v.a.g());
        if (b != null) {
            final List<PeriodModel> periodsWithOutCancelled = b.getPeriodsWithOutCancelled();
            if (periodsWithOutCancelled != null) {
                final Iterator<Object> iterator = periodsWithOutCancelled.iterator();
                while (iterator.hasNext()) {
                    list.add(iterator.next().getId());
                }
            }
        }
        final TimeTableModel b2 = this.f.b(s, entityType, n, v.a.h());
        if (b2 != null) {
            final List<PeriodModel> periodsWithOutCancelled2 = b2.getPeriodsWithOutCancelled();
            if (periodsWithOutCancelled2 != null) {
                final Iterator<Object> iterator2 = periodsWithOutCancelled2.iterator();
                while (iterator2.hasNext()) {
                    list.add(iterator2.next().getId());
                }
            }
        }
        if (list.isEmpty()) {
            return kotlin.collections.v.E();
        }
        final int n2 = (int)(this.g.C().muteOnBreak * 60000L);
        final org.joda.time.c u0 = v.a.e().u0(n2);
        final List<Period> f = this.e.f(s, list);
        final ArrayList<Period> list2 = new ArrayList<Period>();
        for (final Period next : f) {
            if (((org.joda.time.base.c)next.getEnd()).R((l0)u0)) {
                list2.add(next);
            }
        }
        ArrayList<Period> list3 = list2;
        if (entityType == EntityType.TEACHER) {
            list3 = new ArrayList<Period>();
            for (final Period next2 : list2) {
                if (this.m(next2, n) ^ true) {
                    list3.add(next2);
                }
            }
        }
        return this.n(n2, (List<Period>)kotlin.collections.v.h5((Iterable<?>)list3, (Comparator<? super Object>)com.untis.mobile.silentmode.b.G));
    }
    
    private static final int l(final Period period, final Period period2) {
        k0.o(period2, "p2");
        return period.compareTo(period2);
    }
    
    private final boolean m(final Period period, final long n) {
        final List<PeriodElement> teachers = period.getTeachers();
        final boolean b = teachers instanceof Collection;
        boolean b2 = true;
        if (!b || !teachers.isEmpty()) {
            for (final PeriodElement periodElement : teachers) {
                if (periodElement.getOriginalId() == n && periodElement.getCurrentId() != periodElement.getOriginalId()) {
                    return b2;
                }
            }
        }
        b2 = false;
        return b2;
    }
    
    private final List<r> n(final int n, final List<Period> list) {
        if (n == 0) {
            final ArrayList<r> list2 = new ArrayList<r>(kotlin.collections.v.Y((Iterable<?>)list, 10));
            for (final Period period : list) {
                list2.add(new r((l0)period.getStart(), (l0)period.getEnd()));
            }
            return list2;
        }
        final ArrayList<r> list3 = new ArrayList<r>();
        for (final Period period2 : list) {
            r r;
            if (list3.isEmpty()) {
                r = new r((l0)period2.getStart(), (l0)period2.getEnd());
            }
            else {
                final r r2 = kotlin.collections.v.c3((List<? extends r>)list3);
                if (((org.joda.time.base.c)period2.getStart()).C((l0)((org.joda.time.base.d)r2).s().U0(n))) {
                    final int g = kotlin.collections.v.G((List<?>)list3);
                    final r e0 = r2.e0((l0)period2.getEnd());
                    k0.o(e0, "interval.withEnd(period.end)");
                    list3.add(g, e0);
                    continue;
                }
                r = new r((l0)period2.getStart(), (l0)period2.getEnd());
            }
            list3.add(r);
        }
        return list3;
    }
    
    private final void o(long n, final org.joda.time.c c) {
        if ((n = ((g)c).n() - n) < 0L) {
            n = 0L;
        }
        final f0 b = ((f0$a)((f0$a)((f0$a)new s$a((Class)UnmuteWorker.class)).j(n, TimeUnit.MILLISECONDS)).a("silent-mode-end")).b();
        k0.o(b, "OneTimeWorkRequestBuilder<UnmuteWorker>()\n                .setInitialDelay(duration, TimeUnit.MILLISECONDS)\n                .addTag(TAG_END)\n                .build()");
        this.d.j((f0)b);
    }
    
    private final void p(long n, final org.joda.time.c c) {
        if ((n = ((g)c).n() - n) < 0L) {
            n = 0L;
        }
        final f0 b = ((f0$a)((f0$a)((f0$a)new s$a((Class)MuteWorker.class)).j(n, TimeUnit.MILLISECONDS)).a("silent-mode-start")).b();
        k0.o(b, "OneTimeWorkRequestBuilder<MuteWorker>()\n                .setInitialDelay(duration, TimeUnit.MILLISECONDS)\n                .addTag(TAG_START)\n                .build()");
        this.d.j((f0)b);
    }
    
    @SuppressLint({ "NewApi" })
    private final void q() {
        if (this.g.C().isVibrate) {
            if (Build$VERSION.SDK_INT >= 26) {
                this.h.vibrate(VibrationEffect.createOneShot(1000L, -1));
            }
            else {
                this.h.vibrate(1000L);
            }
        }
    }
    
    @Override
    public void a(@e final Context context) {
        k0.p(context, "context");
        if (!this.d()) {
            context.startActivity(SilentModePermissionActivity.H.a(context));
        }
    }
    
    @Override
    public void b() {
        final SilentModeSettings c = this.g.C();
        k0.o(c, "settings.silentModeSettings");
        if (!this.g.R()) {
            c.userRingerMode = this.b.getRingerMode();
            if (Build$VERSION.SDK_INT >= 23) {
                c.notificationMode = this.c.getCurrentInterruptionFilter();
            }
            this.g.a1(c);
            return;
        }
        this.b.setRingerMode(c.userRingerMode);
        if (Build$VERSION.SDK_INT >= 23) {
            this.c.setInterruptionFilter(c.notificationMode);
        }
        com.untis.mobile.utils.s.a.r(new n6.a<j2>() {
            final /* synthetic */ c G;
            
            public final void invoke() {
                if (Build$VERSION.SDK_INT >= 23) {
                    com.untis.mobile.silentmode.c.h(this.G).setInterruptionFilter(c.notificationMode);
                }
                com.untis.mobile.silentmode.c.g(this.G).setRingerMode(c.userRingerMode);
            }
        });
        if (this.g.R()) {
            c0.a(this.a, 999);
            this.q();
            this.g.Z0(false);
        }
    }
    
    @Override
    public void c(@e final String s, @e final EntityType entityType, final long n) {
        k0.p(s, "profileId");
        k0.p(entityType, "entityType");
        if (!this.d()) {
            this.stop();
            return;
        }
        final long n2 = ((g)v.a.e()).n();
        for (final r r : this.k(s, entityType, n)) {
            final org.joda.time.c b = ((org.joda.time.base.d)r).b();
            k0.o(b, "interval.start");
            this.p(n2, b);
            final org.joda.time.c s2 = ((org.joda.time.base.d)r).s();
            k0.o(s2, "interval.end");
            this.o(n2, s2);
        }
    }
    
    @Override
    public boolean d() {
        final int sdk_INT = Build$VERSION.SDK_INT;
        boolean b = true;
        if (sdk_INT >= 23) {
            b = (androidx.core.content.d.a(this.a, "android.permission.ACCESS_NOTIFICATION_POLICY") == 0 && this.c.isNotificationPolicyAccessGranted() && b);
        }
        return b;
    }
    
    @Override
    public void e() {
        if (!this.d()) {
            this.stop();
            return;
        }
        if (this.g.R()) {
            return;
        }
        this.g.Z0(true);
        c0.f(this.a, this.j());
        this.q();
        final SilentModeSettings c = this.g.C();
        k0.o(c, "settings.silentModeSettings");
        c.userRingerMode = this.b.getRingerMode();
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 23) {
            c.notificationMode = this.c.getCurrentInterruptionFilter();
        }
        this.g.a1(c);
        if (sdk_INT >= 23) {
            this.c.setInterruptionFilter(3);
        }
        this.b.setRingerMode((int)(this.g.S() ? 1 : 0));
        com.untis.mobile.utils.s.a.r(new n6.a<j2>() {
            final /* synthetic */ c G;
            
            public final void invoke() {
                if (Build$VERSION.SDK_INT >= 23) {
                    com.untis.mobile.silentmode.c.h(this.G).setInterruptionFilter(3);
                }
                com.untis.mobile.silentmode.c.g(this.G).setRingerMode((int)(com.untis.mobile.silentmode.c.i(this.G).S() ? 1 : 0));
            }
        });
    }
    
    @Override
    public void stop() {
        this.d.f("silent-mode-start");
        this.d.f("silent-mode-end");
        this.b();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\u000e" }, d2 = { "com/untis/mobile/silentmode/c$a", "", "", "IDENTIFIER_NOTIFICATION", "I", "", "MINUTES_TO_MILLIS", "J", "", "TAG_END", "Ljava/lang/String;", "TAG_START", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
    }
}
