// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.services.classbook;

import java.util.ArrayList;
import com.untis.mobile.persistence.models.profile.AbsenceEndTime;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.api.common.timetable.UMPeriodData;
import org.joda.time.v;
import com.untis.mobile.api.common.UMSettings;
import com.untis.mobile.persistence.models.classbook.absence.StudentAbsenceResult;
import com.untis.mobile.api.enumeration.CreateAbsenceStrategy;
import com.untis.mobile.persistence.models.classbook.absence.Exemption;
import com.untis.mobile.persistence.models.timetable.period.Classbook;
import com.untis.mobile.persistence.models.masterdata.Student;
import com.untis.mobile.persistence.models.timetable.period.Period;
import com.untis.mobile.persistence.models.classbook.homework.HomeWork;
import com.untis.mobile.persistence.models.classbook.classregevent.Event;
import java.util.Collection;
import com.untis.mobile.persistence.models.classbook.lessontopic.LessonTopic;
import rx.g;
import com.untis.mobile.persistence.models.classbook.absence.StudentAbsence;
import java.util.List;
import com.untis.mobile.persistence.models.classbook.absence.AbsenceReason;
import org.jetbrains.annotations.f;
import kotlin.j2;
import kotlin.coroutines.d;
import org.jetbrains.annotations.e;
import com.untis.mobile.persistence.models.classbook.info.PeriodInfo;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u001e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH¦@\u00f8\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u000bH&J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u00102\u0006\u0010\u0015\u001a\u00020\u0014H&J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u0017\u001a\u00020\u0012H&J,\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00110\u00102\u0006\u0010\u001a\u001a\u00020\u00192\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011H&J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00102\u0006\u0010\u001e\u001a\u00020\u001dH&J*\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u000b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0011H&J%\u0010%\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010$\u001a\u00020#H¦@\u00f8\u0001\u0000¢\u0006\u0004\b%\u0010&J\u001b\u0010'\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H¦@\u00f8\u0001\u0000¢\u0006\u0004\b'\u0010(J\u001b\u0010)\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0012H¦@\u00f8\u0001\u0000¢\u0006\u0004\b)\u0010*J\u001b\u0010+\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H¦@\u00f8\u0001\u0000¢\u0006\u0004\b+\u0010,J\u001b\u0010-\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH¦@\u00f8\u0001\u0000¢\u0006\u0004\b-\u0010.J\u001b\u00100\u001a\u00020 2\u0006\u0010/\u001a\u00020 H¦@\u00f8\u0001\u0000¢\u0006\u0004\b0\u00101J\u001b\u00104\u001a\u0002022\u0006\u00103\u001a\u000202H¦@\u00f8\u0001\u0000¢\u0006\u0004\b4\u00105J\u001b\u00108\u001a\u00020\u00042\u0006\u00107\u001a\u000206H¦@\u00f8\u0001\u0000¢\u0006\u0004\b8\u00109J\u001b\u0010:\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H¦@\u00f8\u0001\u0000¢\u0006\u0004\b:\u0010(J\u001b\u0010;\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0012H¦@\u00f8\u0001\u0000¢\u0006\u0004\b;\u0010*J\u001b\u0010<\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H¦@\u00f8\u0001\u0000¢\u0006\u0004\b<\u0010,J\u001b\u0010=\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH¦@\u00f8\u0001\u0000¢\u0006\u0004\b=\u0010.J\u001b\u0010>\u001a\u00020\u00042\u0006\u0010/\u001a\u00020 H¦@\u00f8\u0001\u0000¢\u0006\u0004\b>\u00101J\u001b\u0010?\u001a\u00020\u00042\u0006\u00107\u001a\u000206H¦@\u00f8\u0001\u0000¢\u0006\u0004\b?\u00109J\u001b\u0010A\u001a\u00020\u00042\u0006\u0010@\u001a\u00020\u000bH¦@\u00f8\u0001\u0000¢\u0006\u0004\bA\u0010BJ\u001b\u0010C\u001a\u00020\u00042\u0006\u0010@\u001a\u00020\u000bH¦@\u00f8\u0001\u0000¢\u0006\u0004\bC\u0010BJ\u001b\u0010D\u001a\u00020\u00042\u0006\u0010@\u001a\u00020\u000bH¦@\u00f8\u0001\u0000¢\u0006\u0004\bD\u0010BJ!\u0010F\u001a\u00020\u00042\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011H¦@\u00f8\u0001\u0000¢\u0006\u0004\bF\u0010GJ\u001b\u0010H\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000bH¦@\u00f8\u0001\u0000¢\u0006\u0004\bH\u0010BJ\u0012\u0010I\u001a\u0004\u0018\u00010\u00142\u0006\u0010@\u001a\u00020\u000bH&J\u0012\u0010J\u001a\u0004\u0018\u00010\u00122\u0006\u0010@\u001a\u00020\u000bH&J\u0012\u0010K\u001a\u0004\u0018\u00010\u00192\u0006\u0010@\u001a\u00020\u000bH&J\u0012\u0010L\u001a\u0004\u0018\u00010\u001d2\u0006\u0010@\u001a\u00020\u000bH&J\u0012\u0010M\u001a\u0004\u0018\u00010 2\u0006\u0010@\u001a\u00020\u000bH&J\u0012\u0010N\u001a\u0004\u0018\u0001022\u0006\u0010@\u001a\u00020\u000bH&J\u0012\u0010O\u001a\u0004\u0018\u0001062\u0006\u0010@\u001a\u00020\u000bH&J\u001e\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00140\u00112\u000e\b\u0002\u0010E\u001a\b\u0012\u0004\u0012\u00020\u000b0PH&J\u000e\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00140\u0011H&J\u001e\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00190\u00112\u000e\b\u0002\u0010E\u001a\b\u0012\u0004\u0012\u00020\u000b0PH&J\u001e\u0010T\u001a\b\u0012\u0004\u0012\u00020 0\u00112\u000e\b\u0002\u0010E\u001a\b\u0012\u0004\u0012\u00020\u000b0PH&J\u000e\u0010U\u001a\b\u0012\u0004\u0012\u00020 0\u0011H&J\u001e\u0010V\u001a\b\u0012\u0004\u0012\u0002020\u00112\u000e\b\u0002\u0010E\u001a\b\u0012\u0004\u0012\u00020\u000b0PH&J\u0016\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00140\u00112\u0006\u0010\u000f\u001a\u00020\u000bH&J\u000e\u0010X\u001a\b\u0012\u0004\u0012\u00020#0\u0010H&J\u001c\u0010Z\u001a\b\u0012\u0004\u0012\u00020#0\u00102\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011H&J\u0013\u0010[\u001a\u00020\u0004H¦@\u00f8\u0001\u0000¢\u0006\u0004\b[\u0010\\J\b\u0010]\u001a\u00020#H&J\b\u0010^\u001a\u00020#H&J\b\u0010_\u001a\u00020#H&J\n\u0010a\u001a\u0004\u0018\u00010`H&J\n\u0010b\u001a\u0004\u0018\u00010`H&J\b\u0010d\u001a\u00020cH&J\n\u0010f\u001a\u0004\u0018\u00010eH&J\u0016\u0010i\u001a\b\u0012\u0004\u0012\u00020#0\u00102\u0006\u0010h\u001a\u00020gH&J$\u0010l\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00110\u00102\u0006\u0010h\u001a\u00020g2\u0006\u0010k\u001a\u00020jH&J$\u0010m\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00110\u00102\u0006\u0010h\u001a\u00020g2\u0006\u0010k\u001a\u00020jH&J.\u0010q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020p0\u00110\u00102\u0006\u0010h\u001a\u00020g2\u0006\u0010/\u001a\u00020 2\b\b\u0002\u0010o\u001a\u00020nH&J<\u0010s\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020p0\u00110\u00102\u0006\u0010h\u001a\u00020g2\u0006\u0010/\u001a\u00020 2\f\u0010r\u001a\b\u0012\u0004\u0012\u00020j0\u00112\b\b\u0002\u0010o\u001a\u00020nH&J(\u0010t\u001a\b\u0012\u0004\u0012\u00020p0\u00102\u0006\u0010h\u001a\u00020g2\u0006\u0010/\u001a\u00020 2\b\b\u0002\u0010o\u001a\u00020nH&J\u001e\u0010u\u001a\b\u0012\u0004\u0012\u00020#0\u00102\u0006\u0010h\u001a\u00020g2\u0006\u0010/\u001a\u00020 H&J\u0013\u0010v\u001a\u00020\u0004H¦@\u00f8\u0001\u0000¢\u0006\u0004\bv\u0010\\\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006w" }, d2 = { "Lcom/untis/mobile/services/classbook/a;", "", "Lcom/untis/mobile/api/common/UMSettings;", "umSettings", "Lkotlin/j2;", "c0", "(Lcom/untis/mobile/api/common/UMSettings;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/api/common/timetable/UMPeriodData;", "umPeriodData", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "", "entityId", "s", "(Lcom/untis/mobile/api/common/timetable/UMPeriodData;Lcom/untis/mobile/persistence/models/EntityType;JLkotlin/coroutines/d;)Ljava/lang/Object;", "periodId", "Lrx/g;", "", "Lcom/untis/mobile/persistence/models/classbook/lessontopic/LessonTopic;", "T", "Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;", "homeWork", "e0", "lessonTopic", "Y", "Lcom/untis/mobile/persistence/models/classbook/classregevent/Event;", "event", "additionalEntityIds", "r", "Lcom/untis/mobile/persistence/models/classbook/info/PeriodInfo;", "periodInfo", "p", "Lcom/untis/mobile/persistence/models/classbook/absence/StudentAbsence;", "basicStudentAbsences", "C", "", "saveWithClassbook", "j", "(Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;ZLkotlin/coroutines/d;)Ljava/lang/Object;", "z", "(Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Q", "(Lcom/untis/mobile/persistence/models/classbook/lessontopic/LessonTopic;Lkotlin/coroutines/d;)Ljava/lang/Object;", "q", "(Lcom/untis/mobile/persistence/models/classbook/classregevent/Event;Lkotlin/coroutines/d;)Ljava/lang/Object;", "R", "(Lcom/untis/mobile/persistence/models/classbook/info/PeriodInfo;Lkotlin/coroutines/d;)Ljava/lang/Object;", "studentAbsence", "a", "(Lcom/untis/mobile/persistence/models/classbook/absence/StudentAbsence;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/persistence/models/classbook/absence/Exemption;", "exemption", "W", "(Lcom/untis/mobile/persistence/models/classbook/absence/Exemption;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/persistence/models/timetable/period/Classbook;", "classbook", "a0", "(Lcom/untis/mobile/persistence/models/timetable/period/Classbook;Lkotlin/coroutines/d;)Ljava/lang/Object;", "f0", "G", "X", "A", "f", "l", "id", "V", "(JLkotlin/coroutines/d;)Ljava/lang/Object;", "F", "O", "ids", "o", "(Ljava/util/List;Lkotlin/coroutines/d;)Ljava/lang/Object;", "P", "U", "D", "v", "d", "Z", "m", "S", "", "H", "J", "E", "u", "k", "h", "b0", "I", "periodIds", "e", "t", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "g", "K", "N", "Lcom/untis/mobile/persistence/models/classbook/absence/AbsenceReason;", "B", "i", "Lcom/untis/mobile/persistence/models/profile/AbsenceEndTime;", "y", "Lorg/joda/time/v;", "d0", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "period", "n", "Lcom/untis/mobile/persistence/models/masterdata/Student;", "student", "L", "M", "Lcom/untis/mobile/api/enumeration/CreateAbsenceStrategy;", "strategy", "Lcom/untis/mobile/persistence/models/classbook/absence/StudentAbsenceResult;", "c", "students", "w", "b", "x", "g0", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public interface a
{
    @f
    Object A(@e final PeriodInfo p0, @e final d<? super j2> p1);
    
    @f
    AbsenceReason B();
    
    @e
    g<List<StudentAbsence>> C(final long p0, @e final List<StudentAbsence> p1);
    
    @f
    LessonTopic D(final long p0);
    
    @e
    List<Event> E(@e final Collection<Long> p0);
    
    @f
    Object F(final long p0, @e final d<? super j2> p1);
    
    @f
    Object G(@e final LessonTopic p0, @e final d<? super j2> p1);
    
    @e
    List<HomeWork> H(@e final Collection<Long> p0);
    
    @e
    g<Boolean> I();
    
    @e
    List<HomeWork> J();
    
    boolean K();
    
    @e
    g<List<StudentAbsence>> L(@e final Period p0, @e final Student p1);
    
    @e
    g<List<StudentAbsence>> M(@e final Period p0, @e final Student p1);
    
    boolean N();
    
    @f
    Object O(final long p0, @e final d<? super j2> p1);
    
    @f
    Object P(final long p0, @e final d<? super j2> p1);
    
    @f
    Object Q(@e final LessonTopic p0, @e final d<? super LessonTopic> p1);
    
    @f
    Object R(@e final PeriodInfo p0, @e final d<? super PeriodInfo> p1);
    
    @f
    Classbook S(final long p0);
    
    @e
    g<List<LessonTopic>> T(final long p0);
    
    @f
    HomeWork U(final long p0);
    
    @f
    Object V(final long p0, @e final d<? super j2> p1);
    
    @f
    Object W(@e final Exemption p0, @e final d<? super Exemption> p1);
    
    @f
    Object X(@e final Event p0, @e final d<? super j2> p1);
    
    @e
    g<LessonTopic> Y(@e final LessonTopic p0);
    
    @f
    StudentAbsence Z(final long p0);
    
    @f
    Object a(@e final StudentAbsence p0, @e final d<? super StudentAbsence> p1);
    
    @f
    Object a0(@e final Classbook p0, @e final d<? super j2> p1);
    
    @e
    g<StudentAbsenceResult> b(@e final Period p0, @e final StudentAbsence p1, @e final CreateAbsenceStrategy p2);
    
    @e
    List<HomeWork> b0(final long p0);
    
    @e
    g<List<StudentAbsenceResult>> c(@e final Period p0, @e final StudentAbsence p1, @e final CreateAbsenceStrategy p2);
    
    @f
    Object c0(@e final UMSettings p0, @e final d<? super j2> p1);
    
    @f
    PeriodInfo d(final long p0);
    
    @f
    v d0();
    
    @e
    g<Boolean> e(@e final List<Long> p0);
    
    @e
    g<HomeWork> e0(@e final HomeWork p0);
    
    @f
    Object f(@e final StudentAbsence p0, @e final d<? super j2> p1);
    
    @f
    Object f0(@e final HomeWork p0, @e final d<? super j2> p1);
    
    boolean g();
    
    @f
    Object g0(@e final d<? super j2> p0);
    
    @e
    List<Exemption> h(@e final Collection<Long> p0);
    
    @f
    AbsenceReason i();
    
    @f
    Object j(@e final HomeWork p0, final boolean p1, @e final d<? super HomeWork> p2);
    
    @e
    List<StudentAbsence> k();
    
    @f
    Object l(@e final Classbook p0, @e final d<? super j2> p1);
    
    @f
    Exemption m(final long p0);
    
    @e
    g<Boolean> n(@e final Period p0);
    
    @f
    Object o(@e final List<Long> p0, @e final d<? super j2> p1);
    
    @e
    g<PeriodInfo> p(@e final PeriodInfo p0);
    
    @f
    Object q(@e final Event p0, @e final d<? super Event> p1);
    
    @e
    g<List<Event>> r(@e final Event p0, @e final List<Long> p1);
    
    @f
    Object s(@e final UMPeriodData p0, @e final EntityType p1, final long p2, @e final d<? super j2> p3);
    
    @f
    Object t(@e final d<? super j2> p0);
    
    @e
    List<StudentAbsence> u(@e final Collection<Long> p0);
    
    @f
    Event v(final long p0);
    
    @e
    g<List<StudentAbsenceResult>> w(@e final Period p0, @e final StudentAbsence p1, @e final List<Student> p2, @e final CreateAbsenceStrategy p3);
    
    @e
    g<Boolean> x(@e final Period p0, @e final StudentAbsence p1);
    
    @e
    AbsenceEndTime y();
    
    @f
    Object z(@e final HomeWork p0, @e final d<? super j2> p1);
    
    @Metadata(bv = { 1, 0, 3 }, d1 = {}, d2 = {}, k = 3, mv = { 1, 5, 1 })
    public static final class a
    {
    }
}
