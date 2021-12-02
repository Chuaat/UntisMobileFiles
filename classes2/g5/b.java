// 
// Decompiled by Procyon v0.5.36
// 

package g5;

import org.joda.time.v;
import com.untis.mobile.persistence.models.profile.AbsenceEndTime;
import java.util.ArrayList;
import org.joda.time.t;
import java.util.Set;
import com.untis.mobile.persistence.models.EntityType;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.profile.ClassbookSettings;
import com.untis.mobile.persistence.models.timegrid.TimeGrid;
import com.untis.mobile.persistence.models.masterdata.Schoolyear;
import com.untis.mobile.persistence.models.classbook.lessontopic.TeachingMethod;
import com.untis.mobile.persistence.models.masterdata.Teacher;
import com.untis.mobile.persistence.models.masterdata.Subject;
import com.untis.mobile.persistence.models.masterdata.Room;
import com.untis.mobile.persistence.models.masterdata.Klasse;
import com.untis.mobile.persistence.models.masterdata.Holiday;
import com.untis.mobile.persistence.models.classbook.absence.ExcuseStatus;
import com.untis.mobile.persistence.models.classbook.classregevent.EventReasonGroup;
import com.untis.mobile.persistence.models.classbook.classregevent.EventReason;
import com.untis.mobile.persistence.models.classbook.duty.Duty;
import com.untis.mobile.persistence.models.masterdata.Department;
import com.untis.mobile.persistence.models.classbook.absence.AbsenceReason;
import java.util.List;
import com.untis.mobile.persistence.models.profile.Profile;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u00fd\u0001\u0012\u0006\u0010R\u001a\u00020Q\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u0004\u0012\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u0004\u0012\u000e\b\u0002\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u0004\u0012\u000e\b\u0002\u00104\u001a\b\u0012\u0004\u0012\u0002030\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u00108\u001a\b\u0012\u0004\u0012\u0002070\u0004\u0012\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u0004\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004\u0012\u000e\b\u0002\u0010N\u001a\b\u0012\u0004\u0012\u00020M0\u0004\u0012\u000e\b\u0002\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\u0004\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\b\b\u0002\u0010@\u001a\u00020?\u0012\b\b\u0002\u0010G\u001a\u00020F¢\u0006\u0004\bX\u0010YJ\u0006\u0010\u0003\u001a\u00020\u0002R(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R(\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0007\u001a\u0004\b\u0015\u0010\t\"\u0004\b\u0016\u0010\u000bR(\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0007\u001a\u0004\b\u0019\u0010\t\"\u0004\b\u001a\u0010\u000bR(\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0007\u001a\u0004\b\u001d\u0010\t\"\u0004\b\u001e\u0010\u000bR(\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0007\u001a\u0004\b!\u0010\t\"\u0004\b\"\u0010\u000bR(\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0007\u001a\u0004\b%\u0010\t\"\u0004\b&\u0010\u000bR(\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0007\u001a\u0004\b)\u0010\t\"\u0004\b*\u0010\u000bR(\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u0007\u001a\u0004\b-\u0010\t\"\u0004\b.\u0010\u000bR(\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010\u0007\u001a\u0004\b1\u0010\t\"\u0004\b2\u0010\u000bR(\u00104\u001a\b\u0012\u0004\u0012\u0002030\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010\u0007\u001a\u0004\b5\u0010\t\"\u0004\b6\u0010\u000bR(\u00108\u001a\b\u0012\u0004\u0012\u0002070\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010\u0007\u001a\u0004\b9\u0010\t\"\u0004\b:\u0010\u000bR(\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010\u0007\u001a\u0004\b=\u0010\t\"\u0004\b>\u0010\u000bR\"\u0010@\u001a\u00020?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010G\u001a\u00020F8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR(\u0010N\u001a\b\u0012\u0004\u0012\u00020M0\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010\u0007\u001a\u0004\bO\u0010\t\"\u0004\bP\u0010\u000bR\"\u0010R\u001a\u00020Q8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010W¨\u0006Z" }, d2 = { "Lg5/b;", "", "", "r", "", "Lcom/untis/mobile/persistence/models/classbook/classregevent/EventReasonGroup;", "eventReasonGroups", "Ljava/util/List;", "e", "()Ljava/util/List;", "w", "(Ljava/util/List;)V", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Lcom/untis/mobile/persistence/models/profile/Profile;", "k", "()Lcom/untis/mobile/persistence/models/profile/Profile;", "C", "(Lcom/untis/mobile/persistence/models/profile/Profile;)V", "Lcom/untis/mobile/persistence/models/masterdata/Klasse;", "klassen", "i", "A", "Lcom/untis/mobile/persistence/models/masterdata/Room;", "rooms", "l", "D", "Lcom/untis/mobile/persistence/models/masterdata/Schoolyear;", "schoolyears", "m", "E", "Lcom/untis/mobile/persistence/models/masterdata/Subject;", "subjects", "n", "F", "Lcom/untis/mobile/persistence/models/masterdata/Department;", "departments", "c", "u", "Lcom/untis/mobile/persistence/models/masterdata/Holiday;", "holidays", "h", "z", "Lcom/untis/mobile/persistence/models/classbook/absence/AbsenceReason;", "absenceReasons", "a", "s", "Lcom/untis/mobile/persistence/models/classbook/duty/Duty;", "duties", "d", "v", "Lcom/untis/mobile/persistence/models/classbook/classregevent/EventReason;", "eventReasons", "f", "x", "Lcom/untis/mobile/persistence/models/classbook/absence/ExcuseStatus;", "excuseStates", "g", "y", "Lcom/untis/mobile/persistence/models/classbook/lessontopic/TeachingMethod;", "teachingMethods", "p", "H", "Lcom/untis/mobile/persistence/models/timegrid/TimeGrid;", "timeGrid", "Lcom/untis/mobile/persistence/models/timegrid/TimeGrid;", "q", "()Lcom/untis/mobile/persistence/models/timegrid/TimeGrid;", "I", "(Lcom/untis/mobile/persistence/models/timegrid/TimeGrid;)V", "Lcom/untis/mobile/persistence/models/profile/ClassbookSettings;", "classbookSettings", "Lcom/untis/mobile/persistence/models/profile/ClassbookSettings;", "b", "()Lcom/untis/mobile/persistence/models/profile/ClassbookSettings;", "t", "(Lcom/untis/mobile/persistence/models/profile/ClassbookSettings;)V", "Lcom/untis/mobile/persistence/models/masterdata/Teacher;", "teachers", "o", "G", "Lg5/a;", "parameter", "Lg5/a;", "j", "()Lg5/a;", "B", "(Lg5/a;)V", "<init>", "(Lg5/a;Lcom/untis/mobile/persistence/models/profile/Profile;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/untis/mobile/persistence/models/timegrid/TimeGrid;Lcom/untis/mobile/persistence/models/profile/ClassbookSettings;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b
{
    @e
    private a a;
    @e
    private Profile b;
    @e
    private List<AbsenceReason> c;
    @e
    private List<Department> d;
    @e
    private List<Duty> e;
    @e
    private List<EventReason> f;
    @e
    private List<EventReasonGroup> g;
    @e
    private List<ExcuseStatus> h;
    @e
    private List<Holiday> i;
    @e
    private List<Klasse> j;
    @e
    private List<Room> k;
    @e
    private List<Subject> l;
    @e
    private List<Teacher> m;
    @e
    private List<TeachingMethod> n;
    @e
    private List<Schoolyear> o;
    @e
    private TimeGrid p;
    @e
    private ClassbookSettings q;
    
    public b(@e final a a, @e final Profile b, @e final List<AbsenceReason> c, @e final List<Department> d, @e final List<Duty> e, @e final List<EventReason> f, @e final List<EventReasonGroup> g, @e final List<ExcuseStatus> h, @e final List<Holiday> i, @e final List<Klasse> j, @e final List<Room> k, @e final List<Subject> l, @e final List<Teacher> m, @e final List<TeachingMethod> n, @e final List<Schoolyear> o, @e final TimeGrid p17, @e final ClassbookSettings q) {
        k0.p(a, "parameter");
        k0.p(b, "profile");
        k0.p(c, "absenceReasons");
        k0.p(d, "departments");
        k0.p(e, "duties");
        k0.p(f, "eventReasons");
        k0.p(g, "eventReasonGroups");
        k0.p(h, "excuseStates");
        k0.p(i, "holidays");
        k0.p(j, "klassen");
        k0.p(k, "rooms");
        k0.p(l, "subjects");
        k0.p(m, "teachers");
        k0.p(n, "teachingMethods");
        k0.p(o, "schoolyears");
        k0.p(p17, "timeGrid");
        k0.p(q, "classbookSettings");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p17;
        this.q = q;
    }
    
    public final void A(@e final List<Klasse> j) {
        k0.p(j, "<set-?>");
        this.j = j;
    }
    
    public final void B(@e final a a) {
        k0.p(a, "<set-?>");
        this.a = a;
    }
    
    public final void C(@e final Profile b) {
        k0.p(b, "<set-?>");
        this.b = b;
    }
    
    public final void D(@e final List<Room> k) {
        k0.p(k, "<set-?>");
        this.k = k;
    }
    
    public final void E(@e final List<Schoolyear> o) {
        k0.p(o, "<set-?>");
        this.o = o;
    }
    
    public final void F(@e final List<Subject> l) {
        k0.p(l, "<set-?>");
        this.l = l;
    }
    
    public final void G(@e final List<Teacher> m) {
        k0.p(m, "<set-?>");
        this.m = m;
    }
    
    public final void H(@e final List<TeachingMethod> n) {
        k0.p(n, "<set-?>");
        this.n = n;
    }
    
    public final void I(@e final TimeGrid p) {
        k0.p(p, "<set-?>");
        this.p = p;
    }
    
    @e
    public final List<AbsenceReason> a() {
        return this.c;
    }
    
    @e
    public final ClassbookSettings b() {
        return this.q;
    }
    
    @e
    public final List<Department> c() {
        return this.d;
    }
    
    @e
    public final List<Duty> d() {
        return this.e;
    }
    
    @e
    public final List<EventReasonGroup> e() {
        return this.g;
    }
    
    @e
    public final List<EventReason> f() {
        return this.f;
    }
    
    @e
    public final List<ExcuseStatus> g() {
        return this.h;
    }
    
    @e
    public final List<Holiday> h() {
        return this.i;
    }
    
    @e
    public final List<Klasse> i() {
        return this.j;
    }
    
    @e
    public final a j() {
        return this.a;
    }
    
    @e
    public final Profile k() {
        return this.b;
    }
    
    @e
    public final List<Room> l() {
        return this.k;
    }
    
    @e
    public final List<Schoolyear> m() {
        return this.o;
    }
    
    @e
    public final List<Subject> n() {
        return this.l;
    }
    
    @e
    public final List<Teacher> o() {
        return this.m;
    }
    
    @e
    public final List<TeachingMethod> p() {
        return this.n;
    }
    
    @e
    public final TimeGrid q() {
        return this.p;
    }
    
    public final boolean r() {
        if (this.a.b() != null) {
            final Long b = this.a.b();
            if (b != null) {
                if (b == 0L) {
                    return false;
                }
            }
            final Long b2 = this.a.b();
            if (b2 != null) {
                if (b2 == 100L) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public final void s(@e final List<AbsenceReason> c) {
        k0.p(c, "<set-?>");
        this.c = c;
    }
    
    public final void t(@e final ClassbookSettings q) {
        k0.p(q, "<set-?>");
        this.q = q;
    }
    
    public final void u(@e final List<Department> d) {
        k0.p(d, "<set-?>");
        this.d = d;
    }
    
    public final void v(@e final List<Duty> e) {
        k0.p(e, "<set-?>");
        this.e = e;
    }
    
    public final void w(@e final List<EventReasonGroup> g) {
        k0.p(g, "<set-?>");
        this.g = g;
    }
    
    public final void x(@e final List<EventReason> f) {
        k0.p(f, "<set-?>");
        this.f = f;
    }
    
    public final void y(@e final List<ExcuseStatus> h) {
        k0.p(h, "<set-?>");
        this.h = h;
    }
    
    public final void z(@e final List<Holiday> i) {
        k0.p(i, "<set-?>");
        this.i = i;
    }
}
