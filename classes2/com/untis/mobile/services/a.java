// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.services;

import org.jetbrains.annotations.f;
import com.untis.mobile.persistence.models.officehour.OfficeHour;
import com.untis.mobile.persistence.models.infocenter.InfoCenterContactHour;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.utils.z;
import com.untis.mobile.persistence.models.profile.Right;
import com.untis.mobile.utils.g0;
import com.untis.mobile.persistence.models.timetable.period.PeriodRight;
import android.content.Context;
import com.untis.mobile.UntisMobileApplication;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.persistence.models.classbook.homework.HomeWork;
import com.untis.mobile.persistence.models.timetable.period.Period;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b)\u0010*J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rJ\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u0016\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u0018\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u0016\u0010\u001b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019J\u000e\u0010\u001c\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u001d\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u001e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u001f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010 \u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010!\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\"\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010#\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010$\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010%\u001a\u00020\u0004J\u0016\u0010(\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010'\u001a\u00020&¨\u0006+" }, d2 = { "Lcom/untis/mobile/services/a;", "", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "period", "", "C", "v", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "B", "u", "z", "t", "Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;", "homeWork", "x", "A", "c", "g", "s", "w", "b", "r", "q", "f", "Lcom/untis/mobile/persistence/models/officehour/OfficeHour;", "officeHour", "e", "i", "h", "a", "j", "k", "p", "l", "o", "n", "m", "Lcom/untis/mobile/persistence/models/infocenter/InfoCenterContactHour;", "officehour", "d", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class a
{
    @e
    public static final a a;
    
    static {
        a = new a();
    }
    
    private a() {
    }
    
    public final boolean A(@e final Profile profile) {
        k0.p(profile, "profile");
        final UntisMobileApplication b = UntisMobileApplication.I.b();
        return b != null && com.untis.mobile.utils.a.a((Context)b).J(profile);
    }
    
    public final boolean B(@e final Profile profile) {
        k0.p(profile, "profile");
        final UntisMobileApplication b = UntisMobileApplication.I.b();
        return b != null && com.untis.mobile.utils.a.a((Context)b).I(profile);
    }
    
    public final boolean C(@e final Period period) {
        k0.p(period, "period");
        return period.getRights().contains(PeriodRight.WRITE_PERIODINFO);
    }
    
    public final boolean a(@e final Profile profile) {
        k0.p(profile, "profile");
        final UntisMobileApplication.a i = UntisMobileApplication.I;
        return g0.a((Context)i.b()) && !k0.g(i.a().get(profile.getUniqueId()), Boolean.TRUE) && !k0.g(profile.getUniqueId(), "herodemomobile") && profile.hasAnyRight(Right.CLASSREGISTER) && (!profile.getEntityType().isParentRole() && !profile.getEntityType().isStudentRole()) && (z.a.f() ^ true);
    }
    
    public final boolean b(@e final Profile profile) {
        k0.p(profile, "profile");
        return profile.hasAnyRole(EntityType.TEACHER) && profile.hasAnyRight(Right.CLASSREGISTER) && !profile.getUserClasses().isEmpty();
    }
    
    public final boolean c(@e final Profile profile) {
        k0.p(profile, "profile");
        return profile.hasAnyRight(Right.CLASSREGISTER);
    }
    
    public final boolean d(@e final Profile profile, @e final InfoCenterContactHour infoCenterContactHour) {
        k0.p(profile, "profile");
        k0.p(infoCenterContactHour, "officehour");
        return profile.getEntityType().isParentRole() && profile.getEntityType().isStudentRole() && infoCenterContactHour.getRegistrationPossible();
    }
    
    public final boolean e(@e final Profile profile, @e final OfficeHour officeHour) {
        k0.p(profile, "profile");
        k0.p(officeHour, "officeHour");
        final UntisMobileApplication b = UntisMobileApplication.I.b();
        return b != null && com.untis.mobile.utils.a.a((Context)b).I(profile) && officeHour.getRegistrationPossible();
    }
    
    public final boolean f(@e final Profile profile) {
        k0.p(profile, "profile");
        return profile.hasAnyRight(Right.READ_OFFICE_HOUR);
    }
    
    public final boolean g(@e final Profile profile) {
        k0.p(profile, "profile");
        final UntisMobileApplication b = UntisMobileApplication.I.b();
        return b != null && com.untis.mobile.utils.a.a((Context)b).J(profile);
    }
    
    public final boolean h(@e final Profile profile) {
        k0.p(profile, "profile");
        return profile.getEntityType().isParentRole() && profile.getEntityType().isStudentRole() && profile.hasAnyRight(Right.READ_MY_ABSENCES);
    }
    
    public final boolean i(@e final Profile profile) {
        k0.p(profile, "profile");
        final UntisMobileApplication b = UntisMobileApplication.I.b();
        return b != null && com.untis.mobile.utils.a.a((Context)b).J(profile);
    }
    
    public final boolean j(@e final Profile profile) {
        k0.p(profile, "profile");
        return !profile.isAnonymousUser() && !profile.getUserOriginalEntityType().isStudentRole() && !profile.getUserOriginalEntityType().isParentRole() && profile.getUserOriginalEntityType() != EntityType.CLASS;
    }
    
    public final boolean k(@e final Period period) {
        k0.p(period, "period");
        return period.getRights().contains(PeriodRight.READ_CLASSREGEVENT) || period.getRights().contains(PeriodRight.WRITE_CLASSREGEVENT);
    }
    
    public final boolean l(@e final Profile profile) {
        k0.p(profile, "profile");
        return profile.hasAnyRight(Right.READ_PARENTSDAY);
    }
    
    public final boolean m() {
        return true;
    }
    
    public final boolean n(@e final Profile profile) {
        k0.p(profile, "profile");
        return true;
    }
    
    public final boolean o(@e final Profile profile) {
        k0.p(profile, "profile");
        return !profile.getUserOriginalEntityType().isTimetableEntity() || profile.getUserHasTimeTableAccess();
    }
    
    public final boolean p(@e final Period period) {
        k0.p(period, "period");
        return period.getRights().contains(PeriodRight.WRITE_CLASSREGEVENT);
    }
    
    public final boolean q(@e final Profile profile) {
        k0.p(profile, "profile");
        return profile.getEntityType().isParentRole() && profile.getEntityType().isStudentRole() && (!profile.getEntityType().isParentRole() || !profile.getUserChildren().isEmpty()) && profile.hasAnyRight(Right.WRITE_OWN_ABSENCE);
    }
    
    public final boolean r(@e final Profile profile) {
        k0.p(profile, "profile");
        return profile.getEntityType().isParentRole() && profile.getEntityType().isStudentRole() && (!profile.getEntityType().isParentRole() || !profile.getUserChildren().isEmpty()) && profile.hasAnyRight(Right.WRITE_OWN_ABSENCE_REASON);
    }
    
    public final boolean s(@e final Profile profile) {
        k0.p(profile, "profile");
        return profile.hasAnyRight(Right.READ_EXCUSE);
    }
    
    public final boolean t(@e final Period period) {
        k0.p(period, "period");
        return period.getRights().contains(PeriodRight.READ_HOMEWORK);
    }
    
    public final boolean u(@e final Period period) {
        k0.p(period, "period");
        return period.getRights().contains(PeriodRight.READ_LESSONTOPIC);
    }
    
    public final boolean v(@e final Period period) {
        k0.p(period, "period");
        return period.getRights().contains(PeriodRight.READ_PERIODINFO);
    }
    
    public final boolean w(@e final Profile profile) {
        k0.p(profile, "profile");
        return profile.hasAnyRight(Right.WRITE_EXCUSE);
    }
    
    public final boolean x(@e final Period period, @f final HomeWork homeWork) {
        k0.p(period, "period");
        return (homeWork != null && homeWork.getLocal()) || period.getRights().contains(PeriodRight.WRITE_HOMEWORK);
    }
    
    public final boolean z(@e final Period period) {
        k0.p(period, "period");
        return period.getRights().contains(PeriodRight.WRITE_LESSONTOPIC);
    }
}
