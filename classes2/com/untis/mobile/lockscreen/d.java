// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.lockscreen;

import org.koin.core.c$a;
import java.util.Objects;
import android.content.Intent;
import com.untis.mobile.utils.s0;
import com.untis.mobile.ui.activities.period.PeriodDetailActivity;
import kotlin.collections.v;
import com.untis.mobile.calendar.ui.CalendarActivity;
import com.untis.mobile.b;
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
import com.untis.mobile.persistence.models.timetable.period.PeriodRight;
import com.untis.mobile.persistence.models.timetable.period.PeriodState;
import android.widget.RemoteViews;
import java.util.Iterator;
import kotlin.text.s;
import java.util.Collection;
import java.util.List;
import com.untis.mobile.utils.settings.g;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.classbook.lessontopic.LessonTopic;
import com.untis.mobile.persistence.models.timetable.period.Classbook;
import org.jetbrains.annotations.f;
import com.untis.mobile.persistence.models.timetable.period.Period;
import kotlin.b0;
import com.untis.mobile.services.classbook.a;
import com.untis.mobile.services.timetable.placeholder.k;
import com.untis.mobile.persistence.models.timetable.period.ui.PeriodModel;
import com.untis.mobile.persistence.models.timetable.TimeTableEntity;
import com.untis.mobile.persistence.models.timetable.period.ui.TimeTableModel;
import com.untis.mobile.persistence.models.profile.Profile;
import org.jetbrains.annotations.e;
import android.content.Context;
import kotlin.Metadata;
import org.koin.core.c;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010T\u001a\u00020Q\u0012\u0006\u00100\u001a\u00020-\u0012\u0006\u0010_\u001a\u00020]\u0012\u0006\u0010g\u001a\u00020d\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\br\u0010sJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000bH\u0002J\b\u0010\u0012\u001a\u00020\u000bH\u0002J\b\u0010\u0013\u001a\u00020\u000bH\u0002J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u0016\u0010\u001b\u001a\u00020\u00102\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\nH\u0002J\u0010\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0019H\u0002J\b\u0010\u001f\u001a\u00020\u001eH\u0002J\b\u0010 \u001a\u00020\u001eH\u0002J\u0010\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u001eH\u0002J\u0010\u0010%\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020#H\u0002J\u0006\u0010&\u001a\u00020\u0002R\u001d\u0010,\u001a\u00020'8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00103\u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00106\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00108\u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00102R\u0016\u00109\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00105R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010?\u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00102R\u0016\u0010A\u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u00102R\u001d\u0010F\u001a\u00020B8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010)\u001a\u0004\bD\u0010ER\u0018\u0010J\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010L\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u00105R\u0016\u0010N\u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u00102R\u0016\u0010P\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u00105R\u0016\u0010T\u001a\u00020Q8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u001e\u0010X\u001a\n U*\u0004\u0018\u00010\u000b0\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010\\\u001a\u00020Y8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010_\u001a\u00020]8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010^R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010c\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u00105R\u0016\u0010g\u001a\u00020d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u0010i\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u00105R\u0018\u0010m\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0018\u0010q\u001a\u0004\u0018\u00010n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010p¨\u0006t" }, d2 = { "Lcom/untis/mobile/lockscreen/d;", "Lorg/koin/core/c;", "Landroid/widget/RemoteViews;", "remoteViews", "Lkotlin/j2;", "g", "h", "e", "f", "d", "", "", "homeWorks", "", "a", "text", "", "s", "q", "o", "c", "Lcom/untis/mobile/ui/activities/period/t;", "periodDetailMethod", "Landroid/app/PendingIntent;", "k", "Lcom/untis/mobile/persistence/models/timetable/period/ui/PeriodElementModel;", "elements", "j", "model", "p", "", "l", "b", "minute", "m", "Lcom/untis/mobile/persistence/models/timetable/period/ui/PeriodModel;", "periodModel", "t", "i", "Lcom/untis/mobile/utils/settings/g;", "P", "Lkotlin/b0;", "r", "()Lcom/untis/mobile/utils/settings/g;", "settings", "Lcom/untis/mobile/persistence/models/profile/Profile;", "H", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "R", "I", "colorDefaultBackGround", "W", "Z", "useElementBackgroundColor", "U", "colorExam", "useRooms", "Lcom/untis/mobile/services/timetable/placeholder/k;", "L", "Lcom/untis/mobile/services/timetable/placeholder/k;", "timetableService", "T", "colorCancelled", "d0", "colorDefaultText", "Lcom/untis/mobile/utils/a;", "O", "n", "()Lcom/untis/mobile/utils/a;", "appSettings", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "a0", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "period", "X", "useFullTeacher", "V", "colorIrregular", "Q", "useSubjectBackGroundColor", "Landroid/content/Context;", "G", "Landroid/content/Context;", "context", "kotlin.jvm.PlatformType", "N", "Ljava/lang/String;", "packageName", "Lcom/untis/mobile/services/classbook/a;", "M", "Lcom/untis/mobile/services/classbook/a;", "classbookService", "Lcom/untis/mobile/persistence/models/timetable/period/ui/TimeTableModel;", "Lcom/untis/mobile/persistence/models/timetable/period/ui/TimeTableModel;", "timeTableModel", "K", "Lcom/untis/mobile/persistence/models/timetable/period/ui/PeriodModel;", "S", "useAlternateCancelledPeriods", "Lcom/untis/mobile/persistence/models/timetable/TimeTableEntity;", "J", "Lcom/untis/mobile/persistence/models/timetable/TimeTableEntity;", "timeTableEntity", "Y", "useFullSubject", "Lcom/untis/mobile/persistence/models/classbook/lessontopic/LessonTopic;", "c0", "Lcom/untis/mobile/persistence/models/classbook/lessontopic/LessonTopic;", "lessonTopic", "Lcom/untis/mobile/persistence/models/timetable/period/Classbook;", "b0", "Lcom/untis/mobile/persistence/models/timetable/period/Classbook;", "classbook", "<init>", "(Landroid/content/Context;Lcom/untis/mobile/persistence/models/profile/Profile;Lcom/untis/mobile/persistence/models/timetable/period/ui/TimeTableModel;Lcom/untis/mobile/persistence/models/timetable/TimeTableEntity;Lcom/untis/mobile/persistence/models/timetable/period/ui/PeriodModel;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class d implements c
{
    @e
    private final Context G;
    @e
    private final Profile H;
    @e
    private final TimeTableModel I;
    @e
    private final TimeTableEntity J;
    @e
    private final PeriodModel K;
    @e
    private final k L;
    @e
    private final a M;
    private final String N;
    @e
    private final b0 O;
    @e
    private final b0 P;
    private final boolean Q;
    private final int R;
    private final boolean S;
    private final int T;
    private final int U;
    private final int V;
    private final boolean W;
    private final boolean X;
    private final boolean Y;
    private final boolean Z;
    @f
    private final Period a0;
    @f
    private final Classbook b0;
    @f
    private final LessonTopic c0;
    private final int d0;
    
    public d(@e final Context g, @e final Profile h, @e final TimeTableModel i, @e final TimeTableEntity j, @e final PeriodModel k) {
        k0.p(g, "context");
        k0.p(h, "profile");
        k0.p(i, "timeTableModel");
        k0.p(j, "timeTableEntity");
        k0.p(k, "periodModel");
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
        final k timeTableService = h.getTimeTableService();
        this.L = timeTableService;
        final a classBookService = h.getClassBookService();
        this.M = classBookService;
        this.N = g.getPackageName();
        this.O = kotlin.d0.c((n6.a<?>)new n6.a<com.untis.mobile.utils.a>() {
            final /* synthetic */ org.koin.core.scope.a G = ((c)this).getKoin().y();
            
            @Override
            public final com.untis.mobile.utils.a invoke() {
                return (com.untis.mobile.utils.a)this.G.t(k1.d(com.untis.mobile.utils.a.class), null, null);
            }
        });
        this.P = kotlin.d0.c((n6.a<?>)new n6.a<g>() {
            final /* synthetic */ org.koin.core.scope.a G = ((c)this).getKoin().y();
            
            @Override
            public final g invoke() {
                return (g)this.G.t(k1.d(g.class), null, null);
            }
        });
        final boolean i2 = this.n().I1(h);
        this.Q = i2;
        this.R = androidx.core.content.d.f(g, 2131099678);
        this.S = (this.n().i1(h) || i2);
        this.T = this.n().g(h.getUniqueId()).getCancelled().backColor;
        this.U = this.n().g(h.getUniqueId()).getExam().backColor;
        this.V = this.n().g(h.getUniqueId()).getSubstitution().backColor;
        this.W = this.n().p1(h);
        this.X = this.n().r1();
        this.Y = this.n().q1();
        this.Z = this.n().B1(h);
        this.a0 = timeTableService.l(k.getId());
        this.b0 = classBookService.S(k.getId());
        this.c0 = classBookService.D(k.getId());
        this.d0 = this.t(k);
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
        if (this.K.getBackColorCustom() != 0 && this.Q) {
            return this.K.getBackColorCustom();
        }
        if (this.K.getBackColorSubject() != 0 && this.Q) {
            return this.K.getBackColorSubject();
        }
        if (this.K.getBackColor() != 0) {
            return this.K.getBackColor();
        }
        return this.R;
    }
    
    private final void c(final RemoteViews remoteViews) {
        if (this.b0 != null) {
            final Period a0 = this.a0;
            if (a0 != null) {
                if (!a0.getStates().contains(PeriodState.BREAK_SUPERVISION) && !this.a0.getStates().contains(PeriodState.CANCELLED)) {
                    if (this.a0.getRights().contains(PeriodRight.READ_STUD_ABSENCE) || this.a0.getRights().contains(PeriodRight.WRITE_STUD_ABSENCE)) {
                        remoteViews.setViewVisibility(2131298617, 0);
                        if (this.b0.getAbsencesChecked()) {
                            remoteViews.setViewVisibility(2131298619, 0);
                        }
                        remoteViews.setOnClickPendingIntent(2131298618, this.k(t.I));
                    }
                    if (this.a0.getRights().contains(PeriodRight.READ_LESSONTOPIC)) {
                        remoteViews.setViewVisibility(2131298621, 0);
                        final LessonTopic c0 = this.c0;
                        if (c0 != null && c0.getText().length() != 0) {
                            remoteViews.setViewVisibility(2131298623, 0);
                            remoteViews.setViewVisibility(2131298622, 0);
                            remoteViews.setTextViewText(2131298625, (CharSequence)this.c0.getText());
                        }
                        else {
                            remoteViews.setViewVisibility(2131298624, 0);
                        }
                        if (this.a0.getRights().contains(PeriodRight.WRITE_LESSONTOPIC)) {
                            remoteViews.setOnClickPendingIntent(2131298621, this.k(t.J));
                        }
                    }
                    if (this.a0.getRights().contains(PeriodRight.READ_HOMEWORK)) {
                        remoteViews.setViewVisibility(2131298620, 0);
                        remoteViews.setOnClickPendingIntent(2131298620, this.k(t.K));
                    }
                    return;
                }
                remoteViews.setViewVisibility(2131298616, 8);
                return;
            }
        }
        remoteViews.setViewVisibility(2131298616, 8);
    }
    
    private final void d(final RemoteViews remoteViews) {
        final int length = this.K.getSubstitution().length();
        final int n = 1;
        final int n2 = 0;
        String s;
        if (length == 0) {
            s = this.K.getInfo();
        }
        else {
            s = this.K.getSubstitution();
        }
        if (s.length() > 0) {
            remoteViews.setViewVisibility(2131298650, 0);
            remoteViews.setTextViewText(2131298653, this.s(s));
        }
        if (this.K.getLocal().length() > 0) {
            remoteViews.setViewVisibility(2131298651, 0);
            remoteViews.setTextViewText(2131298652, this.s(this.K.getLocal()));
        }
        if (this.K.getHasOfficeHourRegistrations()) {
            remoteViews.setViewVisibility(2131298648, 0);
        }
        if (this.K.isOnlinePeriod()) {
            remoteViews.setViewVisibility(2131298649, 0);
        }
        final String o = this.o();
        if (o.length() > 0) {
            remoteViews.setViewVisibility(2131298642, 0);
            remoteViews.setTextViewText(2131298647, this.s(o));
            int n3;
            if (this.a(this.K.getHomeworks())) {
                n3 = 0;
            }
            else {
                n3 = 8;
            }
            remoteViews.setViewVisibility(2131298643, n3);
        }
        final String q = this.q();
        int n4;
        if (q.length() > 0) {
            n4 = n;
        }
        else {
            n4 = 0;
        }
        if (n4 != 0) {
            remoteViews.setViewVisibility(2131298644, 0);
            remoteViews.setTextViewText(2131298646, this.s(q));
            int n5;
            if (this.a(this.K.getLocalhomeWorks())) {
                n5 = n2;
            }
            else {
                n5 = 8;
            }
            remoteViews.setViewVisibility(2131298645, n5);
        }
    }
    
    private final void e(final RemoteViews remoteViews) {
        remoteViews.setInt(2131298659, "setBackgroundColor", this.l());
        remoteViews.setInt(2131298654, "setBackgroundColor", this.b());
        remoteViews.setOnClickPendingIntent(2131298659, this.k(t.L));
    }
    
    private final void f(final RemoteViews remoteViews) {
        final EntityType[] a = u.m.a.a(this.J.getEntityType());
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
            if (this.Z || periodElementModel.getEntityType() != EntityType.ROOM) {
                n = (b ? 1 : 0);
                if (this.J.getEntityType() == periodElementModel.getEntityType()) {
                    n = (b ? 1 : 0);
                    if (this.J.getEntityId() == periodElementModel.getCurrentId()) {
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
                    remoteViews.setTextViewText(2131298656, this.j((List<PeriodElementModel>)list2.get(0)));
                    remoteViews.setViewVisibility(2131298656, 0);
                    remoteViews.setTextViewText(2131298658, this.j((List<PeriodElementModel>)list2.get(1)));
                    remoteViews.setViewVisibility(2131298658, 0);
                    remoteViews.setTextViewText(2131298657, this.j((List<PeriodElementModel>)list2.get(2)));
                    remoteViews.setViewVisibility(2131298657, 0);
                    remoteViews.setTextViewText(2131298655, this.j((List<PeriodElementModel>)list2.get(3)));
                    remoteViews.setViewVisibility(2131298655, 0);
                    return;
                }
                else {
                    remoteViews.setTextViewText(2131298656, this.j((List<PeriodElementModel>)list2.get(0)));
                    remoteViews.setViewVisibility(2131298656, 0);
                    remoteViews.setTextViewText(2131298658, this.j((List<PeriodElementModel>)list2.get(1)));
                    remoteViews.setViewVisibility(2131298658, 0);
                    o = list2.get(2);
                }
            }
            else {
                remoteViews.setTextViewText(2131298656, this.j((List<PeriodElementModel>)list2.get(0)));
                remoteViews.setViewVisibility(2131298656, 0);
                o = list2.get(1);
            }
            remoteViews.setTextViewText(2131298657, this.j((List<PeriodElementModel>)o));
            remoteViews.setViewVisibility(2131298657, 0);
        }
        else {
            remoteViews.setTextViewText(2131298656, this.j((List<PeriodElementModel>)list2.get(0)));
            remoteViews.setViewVisibility(2131298656, 0);
        }
    }
    
    private final void g(final RemoteViews remoteViews) {
        remoteViews.setTextViewText(2131298660, (CharSequence)this.H.getDisplayName());
        remoteViews.setTextViewText(2131298661, (CharSequence)this.H.getSchoolDisplayName());
    }
    
    private final void h(final RemoteViews remoteViews) {
        remoteViews.setTextViewText(2131298663, (CharSequence)this.m(this.K.getStartMinute()));
        remoteViews.setTextViewText(2131298662, (CharSequence)this.m(this.K.getEndMinute()));
    }
    
    private final CharSequence j(final List<PeriodElementModel> list) {
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
            final String p = this.p(periodElementModel);
            int n2;
            if (p.length() == 0) {
                n2 = n;
            }
            else {
                n2 = 0;
            }
            if (n2 != 0) {
                continue;
            }
            final int length = spannableStringBuilder.length();
            final int n3 = p.length() + length;
            spannableStringBuilder.append((CharSequence)p);
            ForegroundColorSpan foregroundColorSpan;
            if (this.W && periodElementModel.getBackGround() != 0) {
                spannableStringBuilder.setSpan((Object)new BackgroundColorSpan(periodElementModel.getBackGround()), length, n3, 256);
                foregroundColorSpan = new ForegroundColorSpan(periodElementModel.getTextColor());
            }
            else {
                foregroundColorSpan = new ForegroundColorSpan(this.d0);
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
    
    private final PendingIntent k(final t t) {
        final Collection<Long> overlapping = this.I.overlapping(this.K);
        final Period a0 = this.a0;
        if (a0 == null) {
            return null;
        }
        Intent intent;
        if (b.G.b(this.H)) {
            intent = CalendarActivity.H.b(this.G, this.H.getUniqueId(), this.J.getEntityType(), this.J.getEntityId(), v.I5((Iterable<? extends Long>)overlapping), a0.getId(), a0.getStart(), a0.getEnd());
        }
        else {
            intent = PeriodDetailActivity.W.b(this.G, this.H.getUniqueId(), this.J, overlapping, this.K.getId(), t);
        }
        intent.setFlags(268468224);
        return PendingIntent.getActivity(this.G, s0.a(), intent, 402653184);
    }
    
    private final int l() {
        if (this.K.getCancelled() && this.S) {
            return this.T;
        }
        if (this.K.getExam() && this.Q) {
            return this.U;
        }
        if (this.K.getIrregular() && this.Q) {
            return this.V;
        }
        return this.b();
    }
    
    private final String m(final int n) {
        final String g4 = new org.joda.time.v(n / 60, n % 60).g4("H:mm");
        k0.o(g4, "LocalTime(minute / 60, minute % 60).toString(Constant.Time.DISPLAY_PATTERN_TIME)");
        return g4;
    }
    
    private final com.untis.mobile.utils.a n() {
        return this.O.getValue();
    }
    
    private final String o() {
        final int size = this.K.getHomeworks().size();
        String s;
        if (size != 0) {
            if (size != 1) {
                final String string = this.G.getString(2131886296);
                k0.o(string, "context.getString(R.string.homework_manyHomeworks_text)");
                s = kotlin.text.s.k2(string, "{0}", String.valueOf(this.K.getHomeworks().size()), false, 4, (Object)null);
            }
            else {
                final String k2 = kotlin.text.s.k2((String)this.K.getHomeworks().get(0), "@completed@", "", false, 4, (Object)null);
                Objects.requireNonNull(k2, "null cannot be cast to non-null type kotlin.CharSequence");
                s = kotlin.text.s.B5((CharSequence)k2).toString();
            }
        }
        else {
            s = "";
        }
        return s;
    }
    
    private final String p(final PeriodElementModel periodElementModel) {
        if (this.Y && periodElementModel.getEntityType() == EntityType.SUBJECT) {
            return periodElementModel.getLabelLong();
        }
        if (this.X && periodElementModel.getEntityType() == EntityType.TEACHER) {
            return periodElementModel.getLabelLong();
        }
        return periodElementModel.getLabel();
    }
    
    private final String q() {
        final int size = this.K.getLocalhomeWorks().size();
        String s;
        if (size != 0) {
            if (size != 1) {
                final String string = this.G.getString(2131886296);
                k0.o(string, "context.getString(R.string.homework_manyHomeworks_text)");
                s = kotlin.text.s.k2(string, "{0}", String.valueOf(this.K.getLocalhomeWorks().size()), false, 4, (Object)null);
            }
            else {
                final String k2 = kotlin.text.s.k2((String)this.K.getLocalhomeWorks().get(0), "@completed@", "", false, 4, (Object)null);
                Objects.requireNonNull(k2, "null cannot be cast to non-null type kotlin.CharSequence");
                s = kotlin.text.s.B5((CharSequence)k2).toString();
            }
        }
        else {
            s = "";
        }
        return s;
    }
    
    private final g r() {
        return this.P.getValue();
    }
    
    private final CharSequence s(final String s) {
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)s);
        spannableStringBuilder.setSpan((Object)new ForegroundColorSpan(this.d0), 0, s.length(), 256);
        final SpannableString value = SpannableString.valueOf((CharSequence)spannableStringBuilder);
        k0.o(value, "valueOf(builder)");
        return (CharSequence)value;
    }
    
    private final int t(final PeriodModel periodModel) {
        if (periodModel.getTextColorCustom() != 0 && this.Q) {
            return periodModel.getTextColorCustom();
        }
        if (periodModel.getTextColorSubject() != 0 && this.Q) {
            return periodModel.getTextColorSubject();
        }
        return periodModel.getTextColor();
    }
    
    @e
    public org.koin.core.a getKoin() {
        return c$a.a((c)this);
    }
    
    @e
    public final RemoteViews i() {
        final RemoteViews remoteViews = new RemoteViews(this.N, 2131493339);
        this.g(remoteViews);
        this.h(remoteViews);
        this.e(remoteViews);
        this.f(remoteViews);
        this.d(remoteViews);
        this.c(remoteViews);
        return remoteViews;
    }
}
