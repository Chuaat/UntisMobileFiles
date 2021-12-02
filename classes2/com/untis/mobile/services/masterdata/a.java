// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.services.masterdata;

import java.util.ArrayList;
import com.untis.mobile.persistence.models.DisplayableEntity;
import com.untis.mobile.persistence.models.classbook.classregevent.EventReason;
import com.untis.mobile.api.common.masterdata.UMStudent;
import com.untis.mobile.api.common.UMMasterData;
import com.untis.mobile.api.common.UMPerson;
import java.util.Collection;
import com.untis.mobile.persistence.models.classbook.absence.ExcuseStatus;
import com.untis.mobile.persistence.models.masterdata.Student;
import com.untis.mobile.persistence.models.masterdata.Subject;
import com.untis.mobile.persistence.models.masterdata.Department;
import com.untis.mobile.persistence.models.masterdata.Teacher;
import com.untis.mobile.persistence.models.masterdata.Room;
import com.untis.mobile.persistence.models.timegrid.TimeGrid;
import org.joda.time.t;
import com.untis.mobile.persistence.models.masterdata.Schoolyear;
import com.untis.mobile.persistence.models.masterdata.CustomEntityColor;
import com.untis.mobile.persistence.models.classbook.lessontopic.TeachingMethod;
import com.untis.mobile.persistence.models.classbook.absence.AbsenceReason;
import kotlin.i;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.persistence.models.classbook.duty.Duty;
import com.untis.mobile.persistence.models.masterdata.Klasse;
import java.util.List;
import com.untis.mobile.persistence.models.classbook.classregevent.EventReasonGroup;
import com.untis.mobile.persistence.models.masterdata.Holiday;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.j2;
import kotlin.coroutines.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u00c2\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J5\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u000f\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\b\u001a\u00020\u0007H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\fH¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u0015H&J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0016\u001a\u00020\u0015H&J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0016\u001a\u00020\u0015H&J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0016\u001a\u00020\u0015H&J\u0012\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0016\u001a\u00020\u0015H&J\u0012\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010\u0016\u001a\u00020\u0015H&J\u0012\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\u0016\u001a\u00020\u0015H&J\u0012\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\u0016\u001a\u00020\u0015H&J\u0012\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010\u0016\u001a\u00020\u0015H&J\u0012\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010\u0016\u001a\u00020\u0015H&J\u0012\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010\u0016\u001a\u00020\u0015H&J\u0012\u0010.\u001a\u0004\u0018\u00010-2\u0006\u0010\u0016\u001a\u00020\u0015H&J\u0012\u00100\u001a\u0004\u0018\u00010/2\u0006\u0010\u0016\u001a\u00020\u0015H&J\u0012\u00102\u001a\u0004\u0018\u0001012\u0006\u0010\u0016\u001a\u00020\u0015H&J\u0012\u00104\u001a\u0004\u0018\u0001032\u0006\u0010\u0016\u001a\u00020\u0015H&J\u0018\u00107\u001a\b\u0012\u0004\u0012\u00020\u0017062\b\b\u0002\u00105\u001a\u00020\u0007H&J\u0018\u00108\u001a\b\u0012\u0004\u0012\u00020\u0019062\b\b\u0002\u00105\u001a\u00020\u0007H&J\u0018\u00109\u001a\b\u0012\u0004\u0012\u00020\u001b062\b\b\u0002\u00105\u001a\u00020\u0007H&J\"\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001d062\b\b\u0002\u00105\u001a\u00020\u00072\b\b\u0002\u0010:\u001a\u00020\u0004H&J\u000e\u0010<\u001a\b\u0012\u0004\u0012\u00020\u001f06H&J\u000e\u0010=\u001a\b\u0012\u0004\u0012\u00020!06H&J\u0018\u0010>\u001a\b\u0012\u0004\u0012\u00020#062\b\b\u0002\u00105\u001a\u00020\u0007H&J\u000e\u0010?\u001a\b\u0012\u0004\u0012\u00020%06H&J\u000e\u0010@\u001a\b\u0012\u0004\u0012\u00020'06H&J\u0018\u0010A\u001a\b\u0012\u0004\u0012\u00020)062\b\b\u0002\u00105\u001a\u00020\u0007H&J\u0018\u0010B\u001a\b\u0012\u0004\u0012\u00020+062\b\b\u0002\u00105\u001a\u00020\u0007H&J\u000e\u0010C\u001a\b\u0012\u0004\u0012\u00020-06H&J\u000e\u0010D\u001a\b\u0012\u0004\u0012\u00020/06H&J\u000e\u0010E\u001a\b\u0012\u0004\u0012\u00020106H&J\u000e\u0010F\u001a\b\u0012\u0004\u0012\u00020306H&J\u001e\u0010H\u001a\b\u0012\u0004\u0012\u00020\u0017062\u000e\b\u0002\u0010G\u001a\b\u0012\u0004\u0012\u00020\u001506H&J\u001e\u0010I\u001a\b\u0012\u0004\u0012\u00020\u001b062\u000e\b\u0002\u0010G\u001a\b\u0012\u0004\u0012\u00020\u001506H&J\u001e\u0010J\u001a\b\u0012\u0004\u0012\u00020\u001d062\u000e\b\u0002\u0010G\u001a\b\u0012\u0004\u0012\u00020\u001506H&J\u001e\u0010K\u001a\b\u0012\u0004\u0012\u00020\u0019062\u000e\b\u0002\u0010G\u001a\b\u0012\u0004\u0012\u00020\u001506H&J\u001e\u0010L\u001a\b\u0012\u0004\u0012\u00020\u001f062\u000e\b\u0002\u0010G\u001a\b\u0012\u0004\u0012\u00020\u001506H&J\u0012\u0010M\u001a\u0004\u0018\u0001032\u0006\u0010:\u001a\u00020\u0004H&J\u0012\u0010O\u001a\u0004\u0018\u0001012\u0006\u0010N\u001a\u000203H&J\u0012\u0010P\u001a\u0004\u0018\u0001012\u0006\u0010:\u001a\u00020\u0004H&J\u0012\u0010Q\u001a\u0004\u0018\u00010!2\u0006\u0010:\u001a\u00020\u0004H&J\u001b\u0010T\u001a\u00020\t2\u0006\u0010S\u001a\u00020RH¦@\u00f8\u0001\u0000¢\u0006\u0004\bT\u0010UJ\u001b\u0010V\u001a\u00020\t2\u0006\u0010S\u001a\u00020RH¦@\u00f8\u0001\u0000¢\u0006\u0004\bV\u0010UJ\u000e\u0010W\u001a\b\u0012\u0004\u0012\u00020R06H&J\u0013\u0010X\u001a\u00020\tH¦@\u00f8\u0001\u0000¢\u0006\u0004\bX\u0010YJ\u0018\u0010^\u001a\u00020]2\u0006\u0010[\u001a\u00020Z2\u0006\u0010\\\u001a\u00020\u0015H'J\u0018\u0010_\u001a\u00020]2\u0006\u0010[\u001a\u00020Z2\u0006\u0010\\\u001a\u00020\u0015H'J\u001a\u0010a\u001a\u0004\u0018\u00010`2\u0006\u0010[\u001a\u00020Z2\u0006\u0010\\\u001a\u00020\u0015H&J\u0013\u0010b\u001a\u00020\tH¦@\u00f8\u0001\u0000¢\u0006\u0004\bb\u0010YJ!\u0010d\u001a\u00020\t2\f\u0010c\u001a\b\u0012\u0004\u0012\u00020\u001f06H¦@\u00f8\u0001\u0000¢\u0006\u0004\bd\u0010e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006f" }, d2 = { "Lcom/untis/mobile/services/masterdata/a;", "", "Lcom/untis/mobile/api/common/UMMasterData;", "umMasterData", "Lorg/joda/time/t;", "start", "end", "", "deleteOldData", "Lkotlin/j2;", "j", "(Lcom/untis/mobile/api/common/UMMasterData;Lorg/joda/time/t;Lorg/joda/time/t;ZLkotlin/coroutines/d;)Ljava/lang/Object;", "", "Lcom/untis/mobile/api/common/masterdata/UMStudent;", "umStudents", "o", "(Ljava/util/Collection;ZLkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/api/common/UMPerson;", "umPersons", "Y", "(Ljava/util/Collection;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "id", "Lcom/untis/mobile/persistence/models/masterdata/Klasse;", "N", "Lcom/untis/mobile/persistence/models/masterdata/Subject;", "U", "Lcom/untis/mobile/persistence/models/masterdata/Room;", "P", "Lcom/untis/mobile/persistence/models/masterdata/Teacher;", "k", "Lcom/untis/mobile/persistence/models/masterdata/Student;", "V", "Lcom/untis/mobile/persistence/models/masterdata/Holiday;", "B", "Lcom/untis/mobile/persistence/models/classbook/absence/AbsenceReason;", "H", "Lcom/untis/mobile/persistence/models/masterdata/Department;", "g", "Lcom/untis/mobile/persistence/models/classbook/duty/Duty;", "u", "Lcom/untis/mobile/persistence/models/classbook/classregevent/EventReason;", "w", "Lcom/untis/mobile/persistence/models/classbook/classregevent/EventReasonGroup;", "C", "Lcom/untis/mobile/persistence/models/classbook/absence/ExcuseStatus;", "c", "Lcom/untis/mobile/persistence/models/classbook/lessontopic/TeachingMethod;", "W", "Lcom/untis/mobile/persistence/models/timegrid/TimeGrid;", "n", "Lcom/untis/mobile/persistence/models/masterdata/Schoolyear;", "z", "onlyDisplayable", "", "f", "x", "m", "date", "h", "s", "E", "d", "T", "F", "r", "i", "X", "I", "O", "K", "ids", "D", "R", "Q", "a", "e", "M", "schoolyear", "b", "y", "p", "Lcom/untis/mobile/persistence/models/masterdata/CustomEntityColor;", "customEntityColor", "q", "(Lcom/untis/mobile/persistence/models/masterdata/CustomEntityColor;Lkotlin/coroutines/d;)Ljava/lang/Object;", "J", "t", "L", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "entityId", "", "S", "G", "Lcom/untis/mobile/persistence/models/DisplayableEntity;", "v", "A", "students", "l", "(Ljava/util/List;Lkotlin/coroutines/d;)Ljava/lang/Object;", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public interface a
{
    @f
    Object A(@e final d<? super j2> p0);
    
    @f
    Holiday B(final long p0);
    
    @f
    EventReasonGroup C(final long p0);
    
    @e
    List<Klasse> D(@e final List<Long> p0);
    
    @e
    List<Holiday> E();
    
    @e
    List<Duty> F();
    
    @i(message = "don't use that shit. if you have to, you have done something wrong.")
    @e
    String G(@e final EntityType p0, final long p1);
    
    @f
    AbsenceReason H(final long p0);
    
    @e
    List<TeachingMethod> I();
    
    @f
    Object J(@e final CustomEntityColor p0, @e final d<? super j2> p1);
    
    @e
    List<Schoolyear> K();
    
    @f
    Object L(@e final d<? super j2> p0);
    
    @f
    Schoolyear M(@e final t p0);
    
    @f
    Klasse N(final long p0);
    
    @e
    List<TimeGrid> O();
    
    @f
    Room P(final long p0);
    
    @e
    List<Teacher> Q(@e final List<Long> p0);
    
    @e
    List<Room> R(@e final List<Long> p0);
    
    @i(message = "don't use that shit. that's only temporary")
    @e
    String S(@e final EntityType p0, final long p1);
    
    @e
    List<Department> T();
    
    @f
    Subject U(final long p0);
    
    @f
    Student V(final long p0);
    
    @f
    TeachingMethod W(final long p0);
    
    @e
    List<ExcuseStatus> X();
    
    @f
    Object Y(@e final Collection<? extends UMPerson> p0, @e final d<? super j2> p1);
    
    @e
    List<Subject> a(@e final List<Long> p0);
    
    @f
    TimeGrid b(@e final Schoolyear p0);
    
    @f
    ExcuseStatus c(final long p0);
    
    @e
    List<AbsenceReason> d(final boolean p0);
    
    @e
    List<Student> e(@e final List<Long> p0);
    
    @e
    List<Klasse> f(final boolean p0);
    
    @f
    Department g(final long p0);
    
    @e
    List<Teacher> h(final boolean p0, @e final t p1);
    
    @e
    List<EventReasonGroup> i(final boolean p0);
    
    @f
    Object j(@e final UMMasterData p0, @e final t p1, @e final t p2, final boolean p3, @e final d<? super j2> p4);
    
    @f
    Teacher k(final long p0);
    
    @f
    Object l(@e final List<Student> p0, @e final d<? super j2> p1);
    
    @e
    List<Room> m(final boolean p0);
    
    @f
    TimeGrid n(final long p0);
    
    @f
    Object o(@e final Collection<? extends UMStudent> p0, final boolean p1, @e final d<? super j2> p2);
    
    @f
    Holiday p(@e final t p0);
    
    @f
    Object q(@e final CustomEntityColor p0, @e final d<? super j2> p1);
    
    @e
    List<EventReason> r(final boolean p0);
    
    @e
    List<Student> s();
    
    @e
    List<CustomEntityColor> t();
    
    @f
    Duty u(final long p0);
    
    @f
    DisplayableEntity v(@e final EntityType p0, final long p1);
    
    @f
    EventReason w(final long p0);
    
    @e
    List<Subject> x(final boolean p0);
    
    @f
    TimeGrid y(@e final t p0);
    
    @f
    Schoolyear z(final long p0);
    
    @Metadata(bv = { 1, 0, 3 }, d1 = {}, d2 = {}, k = 3, mv = { 1, 5, 1 })
    public static final class a
    {
    }
}
