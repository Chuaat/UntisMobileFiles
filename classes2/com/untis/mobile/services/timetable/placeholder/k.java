// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.services.timetable.placeholder;

import com.untis.mobile.persistence.models.classbook.homework.HomeWork;
import org.joda.time.r;
import com.untis.mobile.persistence.models.masterdata.CustomEntityColor;
import com.untis.mobile.persistence.models.timegrid.TimeGridUnit;
import com.untis.mobile.persistence.models.timetable.period.ui.TimeTableModel;
import java.util.Map;
import com.untis.mobile.persistence.models.classbook.info.PeriodInfo;
import com.untis.mobile.api.common.timetable.UMPeriod;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.persistence.models.timetable.period.Period;
import java.util.List;
import java.util.Set;
import com.untis.mobile.ui.activities.timetable.a;
import org.joda.time.t;
import com.untis.mobile.persistence.models.timetable.TimeTableEntity;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.j2;
import kotlin.coroutines.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0014\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u0004H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0019\u001a\u00020\u0018H&J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u001b\u001a\u00020\u0018H&J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u001e\u001a\u00020\u001dH&J\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180 H&J\u001b\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0012H¦@\u00f8\u0001\u0000¢\u0006\u0004\b$\u0010%J9\u0010,\u001a\u00020\u00042\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u00182\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u0011H¦@\u00f8\u0001\u0000¢\u0006\u0004\b,\u0010-J\u001b\u0010.\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH¦@\u00f8\u0001\u0000¢\u0006\u0004\b.\u0010/J\u001b\u00102\u001a\u00020\u00042\u0006\u00101\u001a\u000200H¦@\u00f8\u0001\u0000¢\u0006\u0004\b2\u00103J#\u00104\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u0018H¦@\u00f8\u0001\u0000¢\u0006\u0004\b4\u00105J\u001b\u00106\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0012H¦@\u00f8\u0001\u0000¢\u0006\u0004\b6\u0010%J\u0016\u0010:\u001a\b\u0012\u0004\u0012\u0002090\u00112\u0006\u00108\u001a\u000207H&J\u0010\u0010;\u001a\u00020\t2\u0006\u00108\u001a\u000207H&J\u000e\u0010<\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0011H&J\u001a\u0010=\u001a\u0004\u0018\u00010\u001d2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u0018H&J\u001b\u0010>\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH¦@\u00f8\u0001\u0000¢\u0006\u0004\b>\u0010/J\u0016\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\u00112\u0006\u0010\u001e\u001a\u00020\u001dH&J\u0010\u0010B\u001a\u00020A2\u0006\u0010\u001e\u001a\u00020\u001dH&J\u0010\u0010C\u001a\u00020A2\u0006\u0010\u001e\u001a\u00020\u001dH&J\u0010\u0010D\u001a\u00020A2\u0006\u00108\u001a\u000207H&J\u0010\u0010E\u001a\u00020A2\u0006\u00108\u001a\u000207H&J\u001a\u0010F\u001a\u0004\u0018\u0001002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u00108\u001a\u000207H&J \u0010I\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u00108\u001a\u0002072\u0006\u0010H\u001a\u00020GH&J\u0010\u0010J\u001a\u00020\u00042\u0006\u0010H\u001a\u00020GH&J\b\u0010K\u001a\u00020\u0004H&J\u0018\u0010L\u001a\u00020\t2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u0018H&J-\u0010N\u001a\u00020\u00042\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u00182\b\b\u0002\u0010M\u001a\u00020\tH¦@\u00f8\u0001\u0000¢\u0006\u0004\bN\u0010OJ(\u0010Q\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u00110P2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020*0\u0011H&J#\u0010T\u001a\u00020\u00042\u0006\u0010S\u001a\u00020R2\u0006\u0010\u001b\u001a\u00020\u0018H¦@\u00f8\u0001\u0000¢\u0006\u0004\bT\u0010UJ\u0013\u0010V\u001a\u00020\u0004H¦@\u00f8\u0001\u0000¢\u0006\u0004\bV\u0010\u0017J\u0013\u0010W\u001a\u00020\u0004H¦@\u00f8\u0001\u0000¢\u0006\u0004\bW\u0010\u0017J!\u0010Y\u001a\u00020\u00042\f\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00180\u0011H¦@\u00f8\u0001\u0000¢\u0006\u0004\bY\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Z" }, d2 = { "Lcom/untis/mobile/services/timetable/placeholder/k;", "", "Lcom/untis/mobile/persistence/models/classbook/info/PeriodInfo;", "periodInfo", "Lkotlin/j2;", "H", "(Lcom/untis/mobile/persistence/models/classbook/info/PeriodInfo;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;", "homeWork", "", "delete", "z", "(Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;ZLkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/persistence/models/masterdata/CustomEntityColor;", "customEntityColor", "u", "(Lcom/untis/mobile/persistence/models/masterdata/CustomEntityColor;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "periods", "b", "(Ljava/util/List;Lkotlin/coroutines/d;)Ljava/lang/Object;", "r", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "id", "l", "lessonId", "v", "Lcom/untis/mobile/persistence/models/timetable/TimeTableEntity;", "timeTableEntity", "y", "", "ids", "D", "period", "q", "(Lcom/untis/mobile/persistence/models/timetable/period/Period;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "entityId", "firstPeriodId", "Lcom/untis/mobile/api/common/timetable/UMPeriod;", "blockedUmPeriods", "E", "(Lcom/untis/mobile/persistence/models/EntityType;JJLjava/util/List;Lkotlin/coroutines/d;)Ljava/lang/Object;", "j", "(Lcom/untis/mobile/persistence/models/timetable/TimeTableEntity;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/persistence/models/timetable/period/ui/TimeTableModel;", "model", "e", "(Lcom/untis/mobile/persistence/models/timetable/period/ui/TimeTableModel;Lkotlin/coroutines/d;)Ljava/lang/Object;", "I", "(Lcom/untis/mobile/persistence/models/EntityType;JLkotlin/coroutines/d;)Ljava/lang/Object;", "k", "Lorg/joda/time/t;", "date", "Lcom/untis/mobile/persistence/models/timegrid/TimeGridUnit;", "n", "g", "t", "w", "J", "Lorg/joda/time/r;", "x", "", "o", "d", "f", "F", "h", "Lcom/untis/mobile/ui/activities/timetable/a;", "onTimeTableModelListener", "C", "m", "p", "i", "favorite", "c", "(Lcom/untis/mobile/persistence/models/EntityType;JZLkotlin/coroutines/d;)Ljava/lang/Object;", "", "a", "", "channelId", "G", "(Ljava/lang/String;JLkotlin/coroutines/d;)Ljava/lang/Object;", "A", "B", "periodIds", "s", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public interface k
{
    @f
    Object A(@e final d<? super j2> p0);
    
    @f
    Object B(@e final d<? super j2> p0);
    
    void C(@e final TimeTableEntity p0, @e final t p1, @e final com.untis.mobile.ui.activities.timetable.a p2);
    
    @e
    List<Period> D(@e final Set<Long> p0);
    
    @f
    Object E(@e final EntityType p0, final long p1, final long p2, @e final List<? extends UMPeriod> p3, @e final d<? super j2> p4);
    
    int F(@e final t p0);
    
    @f
    Object G(@e final String p0, final long p1, @e final d<? super j2> p2);
    
    @f
    Object H(@e final PeriodInfo p0, @e final d<? super j2> p1);
    
    @f
    Object I(@e final EntityType p0, final long p1, @e final d<? super TimeTableEntity> p2);
    
    @f
    Object J(@e final TimeTableEntity p0, @e final d<? super j2> p1);
    
    @e
    Map<Long, List<UMPeriod>> a(@e final List<? extends UMPeriod> p0);
    
    @f
    Object b(@e final List<Period> p0, @e final d<? super j2> p1);
    
    @f
    Object c(@e final EntityType p0, final long p1, final boolean p2, @e final d<? super j2> p3);
    
    int d(@e final TimeTableEntity p0);
    
    @f
    Object e(@e final TimeTableModel p0, @e final d<? super j2> p1);
    
    int f(@e final t p0);
    
    boolean g(@e final t p0);
    
    @f
    TimeTableModel h(@e final TimeTableEntity p0, @e final t p1);
    
    boolean i(@e final EntityType p0, final long p1);
    
    @f
    Object j(@e final TimeTableEntity p0, @e final d<? super j2> p1);
    
    @f
    Object k(@e final Period p0, @e final d<? super j2> p1);
    
    @f
    Period l(final long p0);
    
    void m(@e final com.untis.mobile.ui.activities.timetable.a p0);
    
    @e
    List<TimeGridUnit> n(@e final t p0);
    
    int o(@e final TimeTableEntity p0);
    
    void p();
    
    @f
    Object q(@e final Period p0, @e final d<? super j2> p1);
    
    @f
    Object r(@e final d<? super j2> p0);
    
    @f
    Object s(@e final List<Long> p0, @e final d<? super j2> p1);
    
    @e
    List<TimeTableEntity> t();
    
    @f
    Object u(@e final CustomEntityColor p0, @e final d<? super j2> p1);
    
    @e
    List<Period> v(final long p0);
    
    @f
    TimeTableEntity w(@e final EntityType p0, final long p1);
    
    @e
    List<r> x(@e final TimeTableEntity p0);
    
    @e
    List<Period> y(@e final TimeTableEntity p0);
    
    @f
    Object z(@e final HomeWork p0, final boolean p1, @e final d<? super j2> p2);
    
    @Metadata(bv = { 1, 0, 3 }, d1 = {}, d2 = {}, k = 3, mv = { 1, 5, 1 })
    public static final class a
    {
    }
}
