// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.service;

import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.calendar.network.model.CalendarTeachingContentsResponse;
import com.untis.mobile.calendar.network.model.period.room.CalendarPeriodRoomResponse;
import org.joda.time.c;
import kotlin.j2;
import com.untis.mobile.calendar.persistence.model.entity.CalendarPeriodVideoCall;
import java.util.List;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import com.untis.mobile.calendar.persistence.model.CalendarPeriod;
import kotlin.coroutines.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0006J'\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH¦@\u00f8\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0002H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0002H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001aJ+\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010!\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fH¦@\u00f8\u0001\u0000¢\u0006\u0004\b!\u0010\"J#\u0010$\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u001fH¦@\u00f8\u0001\u0000¢\u0006\u0004\b$\u0010\"J#\u0010&\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u001fH¦@\u00f8\u0001\u0000¢\u0006\u0004\b&\u0010\"J#\u0010)\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'H¦@\u00f8\u0001\u0000¢\u0006\u0004\b)\u0010*J\u001b\u0010,\u001a\u00020+2\u0006\u0010\u0017\u001a\u00020\u0004H¦@\u00f8\u0001\u0000¢\u0006\u0004\b,\u0010-J\u0013\u0010/\u001a\u00020.H¦@\u00f8\u0001\u0000¢\u0006\u0004\b/\u00100\u0082\u0002\u0004\n\u0002\b\u0019¨\u00061" }, d2 = { "Lcom/untis/mobile/calendar/service/a;", "", "", "id", "Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;", "h", "(JLkotlin/coroutines/d;)Ljava/lang/Object;", "a", "", "ids", "b", "(Ljava/util/List;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "entityId", "Lorg/joda/time/c;", "start", "end", "n", "(Lcom/untis/mobile/persistence/models/EntityType;JLorg/joda/time/c;Lorg/joda/time/c;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomResponse;", "g", "(Lorg/joda/time/c;Lorg/joda/time/c;Lkotlin/coroutines/d;)Ljava/lang/Object;", "period", "roomId", "k", "(Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;JLkotlin/coroutines/d;)Ljava/lang/Object;", "c", "originalRoomId", "l", "(Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;JJLkotlin/coroutines/d;)Ljava/lang/Object;", "", "notesAll", "i", "(Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "content", "e", "notesTeacher", "m", "Lcom/untis/mobile/calendar/persistence/model/entity/CalendarPeriodVideoCall;", "onlineLessonLink", "d", "(Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;Lcom/untis/mobile/calendar/persistence/model/entity/CalendarPeriodVideoCall;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/calendar/network/model/CalendarTeachingContentsResponse;", "j", "(Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/j2;", "f", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public interface a
{
    @f
    Object a(final long p0, @e final d<? super CalendarPeriod> p1) throws Exception;
    
    @f
    Object b(@e final List<Long> p0, @e final d<? super List<CalendarPeriod>> p1) throws Exception;
    
    @f
    Object c(@e final CalendarPeriod p0, final long p1, @e final d<? super CalendarPeriod> p2) throws Exception;
    
    @f
    Object d(@e final CalendarPeriod p0, @e final CalendarPeriodVideoCall p1, @e final d<? super CalendarPeriod> p2) throws Exception;
    
    @f
    Object e(@e final CalendarPeriod p0, @e final String p1, @e final d<? super CalendarPeriod> p2) throws Exception;
    
    @f
    Object f(@e final d<? super j2> p0) throws Exception;
    
    @f
    Object g(@e final c p0, @e final c p1, @e final d<? super CalendarPeriodRoomResponse> p2) throws Exception;
    
    @f
    Object h(final long p0, @e final d<? super CalendarPeriod> p1) throws Exception;
    
    @f
    Object i(@e final CalendarPeriod p0, @e final String p1, @e final d<? super CalendarPeriod> p2) throws Exception;
    
    @f
    Object j(@e final CalendarPeriod p0, @e final d<? super CalendarTeachingContentsResponse> p1) throws Exception;
    
    @f
    Object k(@e final CalendarPeriod p0, final long p1, @e final d<? super CalendarPeriod> p2) throws Exception;
    
    @f
    Object l(@e final CalendarPeriod p0, final long p1, final long p2, @e final d<? super CalendarPeriod> p3) throws Exception;
    
    @f
    Object m(@e final CalendarPeriod p0, @e final String p1, @e final d<? super CalendarPeriod> p2) throws Exception;
    
    @f
    Object n(@e final EntityType p0, final long p1, @e final c p2, @e final c p3, @e final d<? super List<CalendarPeriod>> p4) throws Exception;
}
