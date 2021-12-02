// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.services.infocenter;

import com.untis.mobile.persistence.models.officehour.OfficeHourRegistration;
import com.untis.mobile.services.classbook.b;
import org.joda.time.c;
import com.untis.mobile.persistence.models.exam.Exam;
import rx.g;
import com.untis.mobile.persistence.models.masterdata.Subject;
import com.untis.mobile.persistence.models.classbook.homework.HomeWork;
import org.joda.time.t;
import com.untis.mobile.persistence.models.profile.Profile;
import java.util.List;
import kotlin.j2;
import kotlin.coroutines.d;
import org.jetbrains.annotations.e;
import com.untis.mobile.persistence.models.classbook.absence.StudentAbsence;
import org.jetbrains.annotations.f;
import com.untis.mobile.persistence.models.officehour.OfficeHour;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001b\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH¦@\u00f8\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fH¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u00020\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0012J!\u0010\u0017\u001a\u00020\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u000fH¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0012J\u001b\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001d\u001a\u00020\b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fH¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0012J\u0012\u0010 \u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001f\u001a\u00020\u001eH&J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f2\u0006\u0010\"\u001a\u00020!H&J\u001c\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000f0&2\u0006\u0010%\u001a\u00020$H&J,\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000f0&2\u0006\u0010)\u001a\u00020(2\u0006\u0010%\u001a\u00020$2\u0006\u0010*\u001a\u00020$H&J,\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u000f0&2\u0006\u0010)\u001a\u00020(2\u0006\u0010%\u001a\u00020$2\u0006\u0010*\u001a\u00020$H&J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00180&2\u0006\u0010-\u001a\u00020\u001eH&J\u000e\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fH&J$\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000f0&2\u0006\u0010%\u001a\u00020$2\u0006\u0010*\u001a\u00020$H&J&\u00101\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010)\u001a\u00020(2\u0006\u0010%\u001a\u00020$2\u0006\u0010*\u001a\u00020$H&J&\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000f0&2\b\b\u0002\u00102\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020$H&J\u0016\u00104\u001a\b\u0012\u0004\u0012\u00020\u00060&2\u0006\u0010\u0007\u001a\u00020\u0006H&J,\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000f0&2\u0006\u0010)\u001a\u00020(2\u0006\u0010%\u001a\u00020$2\u0006\u0010*\u001a\u00020$H&J,\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u000f0&2\u0006\u0010)\u001a\u00020(2\u0006\u0010%\u001a\u00020$2\u0006\u0010*\u001a\u00020$H&J&\u00107\u001a\b\u0012\u0004\u0012\u00020\u00180&2\u0006\u00102\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020$2\u0006\u0010*\u001a\u00020$H&J$\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000f0&2\u0006\u0010%\u001a\u00020$2\u0006\u0010*\u001a\u00020$H&J\u0016\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00060&2\u0006\u0010:\u001a\u000209H&J\u0016\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00060&2\u0006\u0010:\u001a\u000209H&J\u0016\u0010=\u001a\b\u0012\u0004\u0012\u00020\u000b0&2\u0006\u0010\f\u001a\u00020\u000bH&J\u0016\u0010>\u001a\b\u0012\u0004\u0012\u00020\u000b0&2\u0006\u0010\f\u001a\u00020\u000bH&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006?" }, d2 = { "Lcom/untis/mobile/services/infocenter/a;", "", "Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;", "homeWork", "Lcom/untis/mobile/persistence/models/masterdata/Subject;", "d", "Lcom/untis/mobile/persistence/models/officehour/OfficeHour;", "officeHour", "Lkotlin/j2;", "y", "(Lcom/untis/mobile/persistence/models/officehour/OfficeHour;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/persistence/models/classbook/absence/StudentAbsence;", "studentAbsence", "a", "(Lcom/untis/mobile/persistence/models/classbook/absence/StudentAbsence;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "officeHours", "b", "(Ljava/util/List;Lkotlin/coroutines/d;)Ljava/lang/Object;", "homeWorks", "e", "Lcom/untis/mobile/persistence/models/exam/Exam;", "exams", "j", "Lcom/untis/mobile/services/classbook/b;", "data", "i", "(Lcom/untis/mobile/services/classbook/b;Lkotlin/coroutines/d;)Ljava/lang/Object;", "absences", "s", "", "id", "A", "Lorg/joda/time/c;", "startDateTime", "h", "Lorg/joda/time/t;", "start", "Lrx/g;", "z", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "end", "g", "w", "klasseId", "p", "o", "m", "c", "klassenId", "n", "r", "u", "f", "t", "v", "Lcom/untis/mobile/persistence/models/officehour/OfficeHourRegistration;", "officeHourRegistration", "q", "l", "x", "k", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public interface a
{
    @f
    OfficeHour A(final long p0);
    
    @f
    Object a(@e final StudentAbsence p0, @e final d<? super j2> p1);
    
    @f
    Object b(@e final List<OfficeHour> p0, @e final d<? super j2> p1);
    
    @e
    List<HomeWork> c(@e final Profile p0, @e final t p1, @e final t p2);
    
    @f
    Subject d(@e final HomeWork p0);
    
    @f
    Object e(@e final List<HomeWork> p0, @e final d<? super j2> p1);
    
    @e
    g<List<Exam>> f(@e final Profile p0, @e final t p1, @e final t p2);
    
    @e
    g<List<HomeWork>> g(@e final Profile p0, @e final t p1, @e final t p2);
    
    @e
    List<OfficeHour> h(@e final c p0);
    
    @f
    Object i(@e final b p0, @e final d<? super j2> p1);
    
    @f
    Object j(@e final List<Exam> p0, @e final d<? super j2> p1);
    
    @e
    g<StudentAbsence> k(@e final StudentAbsence p0);
    
    @e
    g<OfficeHour> l(@e final OfficeHourRegistration p0);
    
    @e
    g<List<StudentAbsence>> m(@e final t p0, @e final t p1);
    
    @e
    g<List<OfficeHour>> n(final long p0, @e final t p1);
    
    @e
    List<StudentAbsence> o();
    
    @e
    g<b> p(final long p0);
    
    @e
    g<OfficeHour> q(@e final OfficeHourRegistration p0);
    
    @e
    g<OfficeHour> r(@e final OfficeHour p0);
    
    @f
    Object s(@e final List<StudentAbsence> p0, @e final d<? super j2> p1);
    
    @e
    g<b> t(final long p0, @e final t p1, @e final t p2);
    
    @e
    g<List<HomeWork>> u(@e final Profile p0, @e final t p1, @e final t p2);
    
    @e
    g<List<StudentAbsence>> v(@e final t p0, @e final t p1);
    
    @e
    g<List<Exam>> w(@e final Profile p0, @e final t p1, @e final t p2);
    
    @e
    g<StudentAbsence> x(@e final StudentAbsence p0);
    
    @f
    Object y(@e final OfficeHour p0, @e final d<? super j2> p1);
    
    @e
    g<List<OfficeHour>> z(@e final t p0);
    
    @Metadata(bv = { 1, 0, 3 }, d1 = {}, d2 = {}, k = 3, mv = { 1, 5, 1 })
    public static final class a
    {
    }
}
