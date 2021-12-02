// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.systemNotifications;

import org.joda.time.base.g;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.persistence.models.classbook.homework.HomeWorkKt;
import com.untis.mobile.persistence.models.classbook.homework.HomeWork;
import com.untis.mobile.persistence.models.EntityType;
import kotlin.jvm.internal.w;
import com.untis.mobile.utils.v;
import org.jetbrains.annotations.f;
import com.untis.mobile.persistence.models.timetable.period.PeriodElement;
import com.untis.mobile.persistence.models.timetable.period.Period;
import java.util.Iterator;
import com.untis.mobile.persistence.models.masterdata.Teacher;
import com.untis.mobile.persistence.models.officehour.OfficeHourTimeSlotState;
import com.untis.mobile.persistence.models.officehour.OfficeHourTimeSlot;
import java.util.ArrayList;
import com.untis.mobile.persistence.models.officehour.OfficeHour;
import kotlin.text.s;
import org.joda.time.l0;
import org.joda.time.j;
import com.untis.mobile.persistence.models.masterdata.Subject;
import java.util.List;
import com.untis.mobile.utils.extension.h;
import com.untis.mobile.persistence.models.exam.Exam;
import kotlin.jvm.internal.k0;
import androidx.work.d0;
import com.untis.mobile.persistence.dao.notification.a;
import org.jetbrains.annotations.e;
import android.content.Context;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010:\u001a\u000208\u0012\u0006\u0010C\u001a\u00020A\u0012\u0006\u0010@\u001a\u00020>\u0012\u0006\u0010=\u001a\u00020;\u0012\u0006\u0010E\u001a\u00020D¢\u0006\u0004\bF\u0010GJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0016\u001a\u00020\u0006H\u0016J\u0018\u0010\u0017\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0018\u001a\u00020\u0006H\u0016J\u0010\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J&\u0010\u001d\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00022\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u001bH\u0016J\u0010\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u001b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0002H\u0016J8\u0010&\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u0012H\u0016J\u001e\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040\u001b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0002H\u0016J\u001e\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040\u001b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u0002H\u0016J \u0010.\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,H\u0016J \u0010/\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010-\u001a\u00020,H\u0016J \u00100\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,H\u0016J \u00101\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010-\u001a\u00020,H\u0016J\u0018\u00102\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u00103\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u001a\u00105\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u00104\u001a\u00020,H\u0016J\u0018\u00106\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0018\u00107\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010+\u001a\u00020*H\u0016R\u0016\u0010:\u001a\u0002088\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00109R\u0016\u0010=\u001a\u00020;8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010<R\u0016\u0010@\u001a\u00020>8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010?R\u0016\u0010C\u001a\u00020A8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010B¨\u0006H" }, d2 = { "Lcom/untis/mobile/systemNotifications/c;", "Lcom/untis/mobile/systemNotifications/b;", "", "now", "Lcom/untis/mobile/systemNotifications/a;", "systemNotification", "Lkotlin/j2;", "v", "", "profileId", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "period", "u", "Lcom/untis/mobile/persistence/models/officehour/OfficeHour;", "officeHour", "t", "Lcom/untis/mobile/persistence/models/exam/Exam;", "exam", "Lorg/joda/time/c;", "dateTime", "s", "r", "start", "n", "stop", "p", "homeworkId", "", "systemNotifications", "i", "g", "periodId", "c", "Lcom/untis/mobile/persistence/models/EntityType;", "timetableEntityType", "timetableEntityId", "text", "target", "e", "k", "examId", "o", "Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;", "homeWork", "", "days", "m", "d", "h", "b", "f", "l", "id", "a", "q", "j", "Landroid/content/Context;", "Landroid/content/Context;", "context", "Lcom/untis/mobile/services/profile/legacy/a;", "Lcom/untis/mobile/services/profile/legacy/a;", "profileService", "Landroidx/work/d0;", "Landroidx/work/d0;", "workManager", "Lcom/untis/mobile/persistence/dao/notification/a;", "Lcom/untis/mobile/persistence/dao/notification/a;", "systemNotificationDao", "Lg4/a;", "officeHourDao", "<init>", "(Landroid/content/Context;Lcom/untis/mobile/persistence/dao/notification/a;Landroidx/work/d0;Lcom/untis/mobile/services/profile/legacy/a;Lg4/a;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class c implements b
{
    @e
    private final Context a;
    @e
    private final a b;
    @e
    private final d0 c;
    @e
    private final com.untis.mobile.services.profile.legacy.a d;
    @e
    private final g4.a e;
    
    public c(@e final Context a, @e final a b, @e final d0 c, @e final com.untis.mobile.services.profile.legacy.a d, @e final g4.a e) {
        k0.p(a, "context");
        k0.p(b, "systemNotificationDao");
        k0.p(c, "workManager");
        k0.p(d, "profileService");
        k0.p(e, "officeHourDao");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    private final String r(final Exam exam) {
        final StringBuilder sb = new StringBuilder();
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(exam.getExamType());
        sb2.append(" - ");
        sb2.append(exam.getName());
        sb2.append('\n');
        sb.append(sb2.toString());
        sb.append(k0.C(com.untis.mobile.utils.d0.k(exam.getInterval()), "\n"));
        final String v = h.V(2131886781, this.a);
        final Subject subject = exam.getSubject();
        String str = "";
        if (subject != null) {
            final String displayName = subject.getDisplayName();
            if (displayName != null) {
                str = displayName;
            }
        }
        final StringBuilder sb3 = new StringBuilder();
        sb3.append(v);
        sb3.append(": ");
        sb3.append(str);
        sb3.append('\n');
        sb.append(sb3.toString());
        final String v2 = h.V(2131886783, this.a);
        final String h = com.untis.mobile.utils.extension.h.H(exam.getTeachers(), null, false, 3, null);
        final StringBuilder sb4 = new StringBuilder();
        sb4.append(v2);
        sb4.append(": ");
        sb4.append(h);
        sb4.append('\n');
        sb.append(sb4.toString());
        final String v3 = com.untis.mobile.utils.extension.h.V(2131886680, this.a);
        final String h2 = com.untis.mobile.utils.extension.h.H(exam.getKlasses(), null, false, 3, null);
        final StringBuilder sb5 = new StringBuilder();
        sb5.append(v3);
        sb5.append(": ");
        sb5.append(h2);
        sb5.append('\n');
        sb.append(sb5.toString());
        final String v4 = com.untis.mobile.utils.extension.h.V(2131886767, this.a);
        final String h3 = com.untis.mobile.utils.extension.h.H(exam.getRooms(), null, false, 3, null);
        final StringBuilder sb6 = new StringBuilder();
        sb6.append(v4);
        sb6.append(": ");
        sb6.append(h3);
        sb6.append('\n');
        sb.append(sb6.toString());
        sb.append(k0.C(exam.getText(), "\n"));
        final String string = sb.toString();
        k0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
    
    private final String s(final Exam exam, final org.joda.time.c c) {
        final int c2 = j.U((l0)c, (l0)exam.getStart()).c0();
        int n;
        if (c2 != 1) {
            if (c2 != 7) {
                if (c2 != 14) {
                    return s.k2(h.V(2131886572, this.a), "{0}", String.valueOf(c2), false, 4, (Object)null);
                }
                return s.k2(h.V(2131886573, this.a), "{0}", "2", false, 4, (Object)null);
            }
            else {
                n = 2131886574;
            }
        }
        else {
            n = 2131886575;
        }
        return h.V(n, this.a);
    }
    
    private final String t(final OfficeHour officeHour) {
        final StringBuilder sb = new StringBuilder();
        final Teacher teacher = officeHour.getTeacher();
        Object displayName;
        if (teacher == null) {
            displayName = null;
        }
        else {
            displayName = teacher.getDisplayName();
        }
        if (displayName != null) {
            final String v = h.V(2131886782, this.a);
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(v);
            sb2.append(": ");
            sb2.append(displayName);
            sb2.append('\n');
            sb.append(sb2.toString());
        }
        final String v2 = h.V(2131886767, this.a);
        final StringBuilder sb3 = new StringBuilder();
        sb3.append(v2);
        sb3.append(": ");
        sb3.append(officeHour.getDisplayNameRooms());
        sb3.append('\n');
        sb.append(sb3.toString());
        sb.append(k0.C(h.V(2131886759, this.a), ":\n"));
        final List<OfficeHourTimeSlot> timeSlots = officeHour.getTimeSlots();
        final ArrayList<OfficeHourTimeSlot> list = new ArrayList<OfficeHourTimeSlot>();
        for (final OfficeHourTimeSlot next : timeSlots) {
            if (next.getState() == OfficeHourTimeSlotState.SELF) {
                list.add(next);
            }
        }
        final Iterator<Object> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            sb.append(k0.C(com.untis.mobile.utils.d0.s(iterator2.next().getInterval()), "\n"));
        }
        final String string = sb.toString();
        k0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
    
    private final String u(String displayName, final Period period) {
        final com.untis.mobile.services.masterdata.a a = com.untis.mobile.services.masterdata.b.Z.a(displayName);
        final PeriodElement subject = period.getSubject();
        final String s = null;
        Long value;
        if (subject == null) {
            value = null;
        }
        else {
            value = subject.getCurrentId();
        }
        if (value == null) {
            return "";
        }
        final Subject u = a.U(value);
        if (u == null) {
            displayName = s;
        }
        else {
            displayName = u.getDisplayName();
        }
        if (displayName == null) {
            return "";
        }
        return displayName;
    }
    
    private final void v(final long n, final com.untis.mobile.systemNotifications.a a) {
        SystemNotificationWorker.I.b(n, this.c, a);
    }
    
    @f
    @Override
    public com.untis.mobile.systemNotifications.a a(@e final String s, final int n) {
        k0.p(s, "profileId");
        return this.b.a(s, n);
    }
    
    @Override
    public void b(@e final String s, @e final Exam exam, final int n) {
        k0.p(s, "profileId");
        k0.p(exam, "exam");
        final com.untis.mobile.systemNotifications.a d = this.d(s, exam, n);
        this.b.g(d);
        this.v(((g)v.a.e()).n(), d);
    }
    
    @e
    @Override
    public List<com.untis.mobile.systemNotifications.a> c(@e final String s, final long n) {
        k0.p(s, "profileId");
        return this.b.f(s, n);
    }
    
    @e
    @Override
    public com.untis.mobile.systemNotifications.a d(@e final String s, @e final Exam exam, final int n) {
        k0.p(s, "profileId");
        k0.p(exam, "exam");
        final org.joda.time.c s2 = exam.getStart().s0(n);
        k0.o(s2, "target");
        final String s3 = this.s(exam, s2);
        final String r = this.r(exam);
        return new com.untis.mobile.systemNotifications.a(0, 0, s, 0L, s3, r, r, com.untis.mobile.systemNotifications.e.I, exam.getId(), false, null, ((g)s2).n(), 0, 5643, null);
    }
    
    @e
    @Override
    public com.untis.mobile.systemNotifications.a e(@e final String s, @e final EntityType entityType, final long lng, @e final Period period, @e final String s2, @e final org.joda.time.c c) {
        k0.p(s, "profileId");
        k0.p(entityType, "timetableEntityType");
        k0.p(period, "period");
        k0.p(s2, "text");
        k0.p(c, "target");
        final String u = this.u(s, period);
        final StringBuilder sb = new StringBuilder();
        sb.append(u);
        sb.append(" - ");
        sb.append(com.untis.mobile.utils.d0.k(period.getInterval()));
        final String string = sb.toString();
        final com.untis.mobile.systemNotifications.e k = com.untis.mobile.systemNotifications.e.K;
        final long id = period.getId();
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(entityType.getWebuntisId());
        sb2.append('@');
        sb2.append(lng);
        return new com.untis.mobile.systemNotifications.a(0, 0, s, 0L, string, s2, s2, k, id, false, sb2.toString(), ((g)c).n(), 0, 4619, null);
    }
    
    @e
    @Override
    public com.untis.mobile.systemNotifications.a f(@e final String s, @e final OfficeHour officeHour) {
        k0.p(s, "profileId");
        k0.p(officeHour, "officeHour");
        final String v = h.V(2131886587, this.a);
        final String t = this.t(officeHour);
        return new com.untis.mobile.systemNotifications.a(0, 0, s, 0L, v, t, t, com.untis.mobile.systemNotifications.e.J, officeHour.getId(), false, null, ((g)officeHour.getStart().a2()).n(), 0, 5643, null);
    }
    
    @Override
    public void g(@e final com.untis.mobile.systemNotifications.a a) {
        k0.p(a, "systemNotification");
        this.b.g(a);
        this.v(((g)v.a.e()).n(), a);
    }
    
    @e
    @Override
    public com.untis.mobile.systemNotifications.a h(@e final String s, @e final HomeWork homeWork, final int n) {
        k0.p(s, "profileId");
        k0.p(homeWork, "homeWork");
        final long n2 = ((g)homeWork.getEnd().s0(n)).n();
        final String v = h.V(2131886306, this.a);
        final String displayableDate = HomeWorkKt.getDisplayableDate(homeWork);
        final StringBuilder sb = new StringBuilder();
        sb.append(v);
        sb.append(" - ");
        sb.append(displayableDate);
        return new com.untis.mobile.systemNotifications.a(0, 0, s, 0L, sb.toString(), homeWork.getText(), homeWork.getText(), com.untis.mobile.systemNotifications.e.L, homeWork.getId(), false, null, n2, 0, 5643, null);
    }
    
    @Override
    public void i(@e final String s, long n, @e final List<com.untis.mobile.systemNotifications.a> list) {
        k0.p(s, "profileId");
        k0.p(list, "systemNotifications");
        for (final com.untis.mobile.systemNotifications.a a : this.b.b(s, n)) {
            this.c.g(k0.C("system-notification-", a.e()));
            this.b.e(a);
        }
        n = ((g)v.a.e()).n();
        for (final com.untis.mobile.systemNotifications.a a2 : list) {
            this.b.g(a2);
            this.v(n, a2);
        }
    }
    
    @Override
    public void j(@e final String s, @e final HomeWork homeWork) {
        k0.p(s, "profileId");
        k0.p(homeWork, "homeWork");
        for (final com.untis.mobile.systemNotifications.a a : this.b.b(s, homeWork.getId())) {
            this.c.g(k0.C("system-notification-work-", a.e()));
            this.b.e(a);
        }
    }
    
    @e
    @Override
    public List<com.untis.mobile.systemNotifications.a> k(@e final String s, final long n) {
        k0.p(s, "profileId");
        return this.b.b(s, n);
    }
    
    @Override
    public void l(@e final String s) {
        k0.p(s, "profileId");
        final v a = v.a;
        final long n = ((g)a.e()).n();
        this.c.f(com.untis.mobile.systemNotifications.e.J.f());
        final List<OfficeHour> a2 = this.e.a(s, a.g());
        final ArrayList list = new ArrayList<Object>(kotlin.collections.v.Y((Iterable<?>)a2, 10));
        final Iterator<Object> iterator = a2.iterator();
        while (iterator.hasNext()) {
            list.add(this.f(s, iterator.next()));
        }
        final Iterator<com.untis.mobile.systemNotifications.a> iterator2 = (Iterator<com.untis.mobile.systemNotifications.a>)list.iterator();
        while (iterator2.hasNext()) {
            this.v(n, iterator2.next());
        }
    }
    
    @Override
    public void m(@e final String s, @e final HomeWork homeWork, final int n) {
        k0.p(s, "profileId");
        k0.p(homeWork, "homeWork");
        final com.untis.mobile.systemNotifications.a h = this.h(s, homeWork, n);
        this.b.g(h);
        this.v(((g)v.a.e()).n(), h);
    }
    
    @Override
    public void n(@e final String s, @e final com.untis.mobile.systemNotifications.a a) {
        k0.p(s, "profileId");
        k0.p(a, "systemNotification");
        this.b.g(a);
        this.v(((g)v.a.e()).n(), a);
    }
    
    @e
    @Override
    public List<com.untis.mobile.systemNotifications.a> o(@e final String s, final long n) {
        k0.p(s, "profileId");
        return this.b.d(s, n);
    }
    
    @Override
    public void p(@e final com.untis.mobile.systemNotifications.a a) {
        k0.p(a, "systemNotification");
        this.c.g(k0.C("system-notification-", a.e()));
        this.b.e(a);
    }
    
    @Override
    public void q(@e final String s, @e final Exam exam) {
        k0.p(s, "profileId");
        k0.p(exam, "exam");
        for (final com.untis.mobile.systemNotifications.a a : this.b.d(s, exam.getId())) {
            this.c.g(k0.C("system-notification-work-", a.e()));
            this.b.e(a);
        }
    }
    
    @Override
    public void start() {
        final v a = v.a;
        final org.joda.time.c f0 = a.g().F0();
        final org.joda.time.c s0 = f0.S0(2);
        final long n = ((g)a.e()).n();
        for (final Profile profile : this.d.g()) {
            final a b = this.b;
            final String uniqueId = profile.getUniqueId();
            k0.o(f0, "start");
            k0.o(s0, "end");
            final Iterator iterator2 = com.untis.mobile.persistence.dao.notification.a.a.a(b, uniqueId, f0, s0, false, 8, null).iterator();
            while (iterator2.hasNext()) {
                this.v(n, iterator2.next());
            }
        }
    }
    
    @Override
    public void stop() {
        this.c.f("system-notification");
    }
}
