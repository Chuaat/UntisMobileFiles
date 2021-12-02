// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.lockscreen;

import org.koin.core.c$a;
import android.content.Intent;
import com.untis.mobile.persistence.models.timetable.period.Period;
import com.untis.mobile.utils.s0;
import com.untis.mobile.ui.activities.period.PeriodDetailActivity;
import kotlin.collections.v;
import com.untis.mobile.calendar.ui.CalendarActivity;
import android.app.PendingIntent;
import android.text.SpannableString;
import android.text.style.StrikethroughSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.BackgroundColorSpan;
import android.text.SpannableStringBuilder;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.persistence.models.timetable.period.ui.PeriodElementModel;
import java.util.ArrayList;
import com.untis.mobile.utils.u;
import com.untis.mobile.ui.activities.period.t;
import android.widget.RemoteViews;
import java.util.Iterator;
import kotlin.text.s;
import java.util.Collection;
import java.util.List;
import androidx.core.content.d;
import com.untis.mobile.utils.settings.g;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.m0;
import n6.a;
import kotlin.jvm.internal.k0;
import kotlin.b0;
import com.untis.mobile.persistence.models.timetable.period.ui.PeriodModel;
import com.untis.mobile.persistence.models.timetable.period.ui.TimeTableModel;
import com.untis.mobile.persistence.models.timetable.TimeTableEntity;
import com.untis.mobile.persistence.models.profile.Profile;
import org.jetbrains.annotations.e;
import android.content.Context;
import kotlin.Metadata;
import org.koin.core.c;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010Q\u001a\u00020N\u0012\u0006\u0010M\u001a\u00020J\u0012\u0006\u0010X\u001a\u00020V\u0012\u0006\u0010G\u001a\u00020D\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\bY\u0010ZJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\tH\u0002J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\u0013\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\bH\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0016\u001a\u00020\u0014H\u0002J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u0010\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0014H\u0002J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J\u0006\u0010 \u001a\u00020\u0002R\u0016\u0010#\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u0016\u0010'\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\"R\u0016\u0010*\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\"R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00100\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010)R\u0016\u00102\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\"R\u0016\u00104\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010\"R\u001d\u0010:\u001a\u0002058B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001d\u0010?\u001a\u00020;8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u00107\u001a\u0004\b=\u0010>R\u0016\u0010A\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010)R\u0016\u0010C\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010)R\u0016\u0010G\u001a\u00020D8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010I\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010)R\u0016\u0010M\u001a\u00020J8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010Q\u001a\u00020N8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u001e\u0010U\u001a\n R*\u0004\u0018\u00010\u000e0\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010X\u001a\u00020V8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010W¨\u0006[" }, d2 = { "Lcom/untis/mobile/lockscreen/b;", "Lorg/koin/core/c;", "Landroid/widget/RemoteViews;", "remoteViews", "Lkotlin/j2;", "f", "d", "e", "", "Lcom/untis/mobile/persistence/models/timetable/period/ui/PeriodElementModel;", "elements", "", "h", "model", "", "m", "c", "homeworks", "", "a", "", "j", "b", "Lcom/untis/mobile/persistence/models/timetable/period/ui/PeriodModel;", "periodModel", "o", "minute", "k", "Lcom/untis/mobile/ui/activities/period/t;", "periodDetailMethod", "Landroid/app/PendingIntent;", "i", "g", "O", "Z", "useSubjectBackGroundColor", "V", "useFullTeacher", "U", "useElementBackgroundColor", "T", "I", "colorIrregular", "X", "useRooms", "K", "Lcom/untis/mobile/persistence/models/timetable/period/ui/PeriodModel;", "S", "colorExam", "Q", "useAlternateCancelledPeriods", "W", "useFullSubject", "Lcom/untis/mobile/utils/a;", "M", "Lkotlin/b0;", "l", "()Lcom/untis/mobile/utils/a;", "appSettings", "Lcom/untis/mobile/utils/settings/g;", "N", "n", "()Lcom/untis/mobile/utils/settings/g;", "settings", "P", "colorDefaultBackGround", "Y", "colorDefaultText", "Lcom/untis/mobile/persistence/models/timetable/period/ui/TimeTableModel;", "J", "Lcom/untis/mobile/persistence/models/timetable/period/ui/TimeTableModel;", "timeTableModel", "R", "colorCancelled", "Lcom/untis/mobile/persistence/models/profile/Profile;", "H", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Landroid/content/Context;", "G", "Landroid/content/Context;", "context", "kotlin.jvm.PlatformType", "L", "Ljava/lang/String;", "packageName", "Lcom/untis/mobile/persistence/models/timetable/TimeTableEntity;", "Lcom/untis/mobile/persistence/models/timetable/TimeTableEntity;", "timeTableEntity", "<init>", "(Landroid/content/Context;Lcom/untis/mobile/persistence/models/profile/Profile;Lcom/untis/mobile/persistence/models/timetable/TimeTableEntity;Lcom/untis/mobile/persistence/models/timetable/period/ui/TimeTableModel;Lcom/untis/mobile/persistence/models/timetable/period/ui/PeriodModel;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b implements c
{
    @e
    private final Context G;
    @e
    private final Profile H;
    @e
    private final TimeTableEntity I;
    @e
    private final TimeTableModel J;
    @e
    private final PeriodModel K;
    private final String L;
    @e
    private final b0 M;
    @e
    private final b0 N;
    private final boolean O;
    private final int P;
    private final boolean Q;
    private final int R;
    private final int S;
    private final int T;
    private final boolean U;
    private final boolean V;
    private final boolean W;
    private final boolean X;
    private final int Y;
    
    public b(@e final Context g, @e final Profile h, @e final TimeTableEntity i, @e final TimeTableModel j, @e final PeriodModel k) {
        k0.p(g, "context");
        k0.p(h, "profile");
        k0.p(i, "timeTableEntity");
        k0.p(j, "timeTableModel");
        k0.p(k, "periodModel");
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
        this.L = g.getPackageName();
        this.M = d0.c((a<?>)new a<com.untis.mobile.utils.a>() {
            final /* synthetic */ org.koin.core.scope.a G = ((c)this).getKoin().y();
            
            @Override
            public final com.untis.mobile.utils.a invoke() {
                return (com.untis.mobile.utils.a)this.G.t(k1.d(com.untis.mobile.utils.a.class), null, null);
            }
        });
        this.N = d0.c((a<?>)new a<g>() {
            final /* synthetic */ org.koin.core.scope.a G = ((c)this).getKoin().y();
            
            @Override
            public final g invoke() {
                return (g)this.G.t(k1.d(g.class), null, null);
            }
        });
        final boolean i2 = this.l().I1(h);
        this.O = i2;
        this.P = d.f(g, 2131099678);
        this.Q = (this.l().i1(h) || i2);
        this.R = this.l().g(h.getUniqueId()).getCancelled().backColor;
        this.S = this.l().g(h.getUniqueId()).getExam().backColor;
        this.T = this.l().g(h.getUniqueId()).getSubstitution().backColor;
        this.U = this.l().p1(h);
        this.V = this.l().r1();
        this.W = this.l().q1();
        this.X = this.l().B1(h);
        this.Y = this.o(k);
    }
    
    private final boolean a(final List<String> list) {
        final boolean b = list instanceof Collection;
        boolean b2 = false;
        if (!b || !list.isEmpty()) {
            final Iterator<String> iterator = list.iterator();
            while (iterator.hasNext()) {
                if (!s.u2((String)iterator.next(), "@completed@", false, 2, (Object)null)) {
                    return b2;
                }
            }
        }
        b2 = true;
        return b2;
    }
    
    private final int b() {
        if (this.K.getBackColorCustom() != 0 && this.O) {
            return this.K.getBackColorCustom();
        }
        if (this.K.getBackColorSubject() != 0 && this.O) {
            return this.K.getBackColorSubject();
        }
        if (this.K.getBackColor() != 0) {
            return this.K.getBackColor();
        }
        return this.P;
    }
    
    private final void c(final RemoteViews remoteViews) {
        final int length = this.K.getInfo().length();
        final int n = 0;
        if (length > 0 || this.K.getSubstitution().length() > 0) {
            remoteViews.setViewVisibility(2131298630, 0);
        }
        if (this.K.getLocal().length() > 0) {
            remoteViews.setViewVisibility(2131298631, 0);
        }
        if (this.K.getHasOfficeHourRegistrations()) {
            remoteViews.setViewVisibility(2131298632, 0);
        }
        if (this.K.isOnlinePeriod()) {
            remoteViews.setViewVisibility(2131298633, 0);
        }
        if (this.K.getHomeworks().isEmpty() ^ true) {
            remoteViews.setViewVisibility(2131298626, 0);
            int n2;
            if (this.a(this.K.getHomeworks())) {
                n2 = 0;
            }
            else {
                n2 = 8;
            }
            remoteViews.setViewVisibility(2131298627, n2);
        }
        if (this.K.getLocalhomeWorks().isEmpty() ^ true) {
            remoteViews.setViewVisibility(2131298628, 0);
            int n3;
            if (this.a(this.K.getLocalhomeWorks())) {
                n3 = n;
            }
            else {
                n3 = 8;
            }
            remoteViews.setViewVisibility(2131298629, n3);
        }
    }
    
    private final void d(final RemoteViews remoteViews) {
        remoteViews.setInt(2131298639, "setBackgroundColor", this.j());
        remoteViews.setInt(2131298634, "setBackgroundColor", this.b());
        remoteViews.setOnClickPendingIntent(2131298639, this.i(t.L));
    }
    
    private final void e(final RemoteViews remoteViews) {
        final EntityType[] a = u.m.a.a(this.I.getEntityType());
        final List<PeriodElementModel> elements = this.K.getElements();
        final ArrayList<PeriodElementModel> list = new ArrayList<PeriodElementModel>();
        final Iterator<Object> iterator = elements.iterator();
        while (true) {
            final boolean hasNext = iterator.hasNext();
            final boolean b = true;
            int n = 0;
            if (!hasNext) {
                break;
            }
            final PeriodElementModel next = iterator.next();
            final PeriodElementModel periodElementModel = next;
            if (this.X || periodElementModel.getEntityType() != EntityType.ROOM) {
                n = (b ? 1 : 0);
                if (this.I.getEntityType() == periodElementModel.getEntityType()) {
                    n = (b ? 1 : 0);
                    if (this.I.getEntityId() == periodElementModel.getCurrentId()) {
                        if (periodElementModel.getCurrentId() != periodElementModel.getOriginalId()) {
                            n = (b ? 1 : 0);
                        }
                        else {
                            n = 0;
                        }
                    }
                }
            }
            if (n == 0) {
                continue;
            }
            list.add(next);
        }
        final ArrayList<ArrayList<PeriodElementModel>> list2 = new ArrayList<ArrayList<PeriodElementModel>>();
        k0.o(a, "order");
        for (final EntityType entityType : a) {
            final ArrayList<PeriodElementModel> list3 = new ArrayList<PeriodElementModel>();
            for (final PeriodElementModel next2 : list) {
                if (next2.getEntityType() == entityType) {
                    list3.add(next2);
                }
            }
            if (list3.isEmpty() ^ true) {
                list2.add(list3);
            }
        }
        final int size = list2.size();
        if (size != 1) {
            Object o;
            if (size != 2) {
                if (size != 3) {
                    if (size != 4) {
                        return;
                    }
                    remoteViews.setTextViewText(2131298636, this.h((List<PeriodElementModel>)list2.get(0)));
                    remoteViews.setViewVisibility(2131298636, 0);
                    remoteViews.setTextViewText(2131298638, this.h((List<PeriodElementModel>)list2.get(1)));
                    remoteViews.setViewVisibility(2131298638, 0);
                    remoteViews.setTextViewText(2131298637, this.h((List<PeriodElementModel>)list2.get(2)));
                    remoteViews.setViewVisibility(2131298637, 0);
                    remoteViews.setTextViewText(2131298635, this.h((List<PeriodElementModel>)list2.get(3)));
                    remoteViews.setViewVisibility(2131298635, 0);
                    return;
                }
                else {
                    remoteViews.setTextViewText(2131298636, this.h((List<PeriodElementModel>)list2.get(0)));
                    remoteViews.setViewVisibility(2131298636, 0);
                    remoteViews.setTextViewText(2131298638, this.h((List<PeriodElementModel>)list2.get(1)));
                    remoteViews.setViewVisibility(2131298638, 0);
                    o = list2.get(2);
                }
            }
            else {
                remoteViews.setTextViewText(2131298636, this.h((List<PeriodElementModel>)list2.get(0)));
                remoteViews.setViewVisibility(2131298636, 0);
                o = list2.get(1);
            }
            remoteViews.setTextViewText(2131298637, this.h((List<PeriodElementModel>)o));
            remoteViews.setViewVisibility(2131298637, 0);
        }
        else {
            remoteViews.setTextViewText(2131298636, this.h((List<PeriodElementModel>)list2.get(0)));
            remoteViews.setViewVisibility(2131298636, 0);
        }
    }
    
    private final void f(final RemoteViews remoteViews) {
        remoteViews.setTextViewText(2131298641, (CharSequence)this.k(this.K.getStartMinute()));
        remoteViews.setTextViewText(2131298640, (CharSequence)this.k(this.K.getEndMinute()));
    }
    
    private final CharSequence h(final List<PeriodElementModel> list) {
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        final Iterator<Object> iterator = list.iterator();
        boolean b;
        while (true) {
            final boolean hasNext = iterator.hasNext();
            b = true;
            final int n = 1;
            if (!hasNext) {
                break;
            }
            final PeriodElementModel periodElementModel = iterator.next();
            if (((CharSequence)spannableStringBuilder).length() > 0) {
                spannableStringBuilder.append((CharSequence)", ");
            }
            final String m = this.m(periodElementModel);
            int n2;
            if (m.length() == 0) {
                n2 = n;
            }
            else {
                n2 = 0;
            }
            if (n2 != 0) {
                continue;
            }
            final int length = spannableStringBuilder.length();
            final int n3 = m.length() + length;
            spannableStringBuilder.append((CharSequence)m);
            ForegroundColorSpan foregroundColorSpan;
            if (this.U && periodElementModel.getBackGround() != 0) {
                spannableStringBuilder.setSpan((Object)new BackgroundColorSpan(periodElementModel.getBackGround()), length, n3, 256);
                foregroundColorSpan = new ForegroundColorSpan(periodElementModel.getTextColor());
            }
            else {
                foregroundColorSpan = new ForegroundColorSpan(this.Y);
            }
            spannableStringBuilder.setSpan((Object)foregroundColorSpan, length, n3, 256);
            if (periodElementModel.getOriginalId() >= 1L || periodElementModel.getCurrentId() <= 0L) {
                continue;
            }
            spannableStringBuilder.setSpan((Object)new StrikethroughSpan(), length, n3, 256);
        }
        if (this.K.getCancelled()) {
            if (((CharSequence)spannableStringBuilder).length() <= 0) {
                b = false;
            }
            if (b) {
                spannableStringBuilder.setSpan((Object)new StrikethroughSpan(), 0, spannableStringBuilder.length(), 256);
            }
        }
        final SpannableString value = SpannableString.valueOf((CharSequence)spannableStringBuilder);
        k0.o(value, "valueOf(builder)");
        return (CharSequence)value;
    }
    
    private final PendingIntent i(final t t) {
        final Collection<Long> overlapping = this.J.overlapping(this.K);
        final Period l = this.H.getTimeTableService().l(this.K.getId());
        if (l == null) {
            return null;
        }
        Intent intent;
        if (com.untis.mobile.b.G.b(this.H)) {
            intent = CalendarActivity.H.b(this.G, this.H.getUniqueId(), this.I.getEntityType(), this.I.getEntityId(), v.I5((Iterable<? extends Long>)overlapping), l.getId(), l.getStart(), l.getEnd());
        }
        else {
            intent = PeriodDetailActivity.W.b(this.G, this.H.getUniqueId(), this.I, overlapping, this.K.getId(), t);
        }
        intent.setFlags(268468224);
        return PendingIntent.getActivity(this.G, s0.a(), intent, 402653184);
    }
    
    private final int j() {
        if (this.K.getCancelled() && this.Q) {
            return this.R;
        }
        if (this.K.getExam() && this.O) {
            return this.S;
        }
        if (this.K.getIrregular() && this.O) {
            return this.T;
        }
        return this.b();
    }
    
    private final String k(final int n) {
        final String g4 = new org.joda.time.v(n / 60, n % 60).g4("H:mm");
        k0.o(g4, "LocalTime(minute / 60, minute % 60).toString(Constant.Time.DISPLAY_PATTERN_TIME)");
        return g4;
    }
    
    private final com.untis.mobile.utils.a l() {
        return this.M.getValue();
    }
    
    private final String m(final PeriodElementModel periodElementModel) {
        if (this.W && periodElementModel.getEntityType() == EntityType.SUBJECT) {
            return periodElementModel.getLabelLong();
        }
        if (this.V && periodElementModel.getEntityType() == EntityType.TEACHER) {
            return periodElementModel.getLabelLong();
        }
        return periodElementModel.getLabel();
    }
    
    private final g n() {
        return this.N.getValue();
    }
    
    private final int o(final PeriodModel periodModel) {
        if (periodModel.getTextColorCustom() != 0 && this.O) {
            return periodModel.getTextColorCustom();
        }
        if (periodModel.getTextColorSubject() != 0 && this.O) {
            return periodModel.getTextColorSubject();
        }
        return periodModel.getTextColor();
    }
    
    @e
    public final RemoteViews g() {
        final RemoteViews remoteViews = new RemoteViews(this.L, 2131493340);
        this.f(remoteViews);
        this.d(remoteViews);
        this.e(remoteViews);
        this.c(remoteViews);
        return remoteViews;
    }
    
    @e
    public org.koin.core.a getKoin() {
        return c$a.a((c)this);
    }
}
