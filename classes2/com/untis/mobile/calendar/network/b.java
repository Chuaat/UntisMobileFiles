// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.network;

import java.util.List;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.calendar.network.model.CalendarTeachingContentsResponse;
import com.untis.mobile.calendar.network.model.period.room.CalendarPeriodRoomResponse;
import org.joda.time.c;
import com.untis.mobile.calendar.persistence.model.entity.CalendarPeriodVideoCall;
import org.jetbrains.annotations.f;
import kotlin.coroutines.d;
import org.jetbrains.annotations.e;
import com.untis.mobile.calendar.persistence.model.CalendarPeriod;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJC\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u0005\u001a\u00020\u0004H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u0005\u001a\u00020\u0004H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0018J5\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u0005\u001a\u00020\u0004H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J-\u0010\"\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u001d2\b\b\u0002\u0010\u0005\u001a\u00020\u0004H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\"\u0010 J-\u0010$\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u001d2\b\b\u0002\u0010\u0005\u001a\u00020\u0004H¦@\u00f8\u0001\u0000¢\u0006\u0004\b$\u0010 J-\u0010'\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%2\b\b\u0002\u0010\u0005\u001a\u00020\u0004H¦@\u00f8\u0001\u0000¢\u0006\u0004\b'\u0010(J%\u0010*\u001a\u00020)2\u0006\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H¦@\u00f8\u0001\u0000¢\u0006\u0004\b*\u0010+\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006," }, d2 = { "Lcom/untis/mobile/calendar/network/b;", "", "", "id", "", "firstRun", "Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;", "b", "(JZLkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "entityId", "Lorg/joda/time/c;", "start", "end", "", "i", "(Lcom/untis/mobile/persistence/models/EntityType;JLorg/joda/time/c;Lorg/joda/time/c;ZLkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomResponse;", "d", "(Lorg/joda/time/c;Lorg/joda/time/c;ZLkotlin/coroutines/d;)Ljava/lang/Object;", "period", "originalRoomId", "f", "(Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;JZLkotlin/coroutines/d;)Ljava/lang/Object;", "roomId", "a", "k", "(Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;JJZLkotlin/coroutines/d;)Ljava/lang/Object;", "", "notesAll", "g", "(Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;Ljava/lang/String;ZLkotlin/coroutines/d;)Ljava/lang/Object;", "content", "j", "notesTeacher", "e", "Lcom/untis/mobile/calendar/persistence/model/entity/CalendarPeriodVideoCall;", "onlineLessonLink", "c", "(Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;Lcom/untis/mobile/calendar/persistence/model/entity/CalendarPeriodVideoCall;ZLkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/calendar/network/model/CalendarTeachingContentsResponse;", "h", "(Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;ZLkotlin/coroutines/d;)Ljava/lang/Object;", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public interface b
{
    @f
    Object a(@e final CalendarPeriod p0, final long p1, final boolean p2, @e final d<? super CalendarPeriod> p3) throws Exception;
    
    @f
    Object b(final long p0, final boolean p1, @e final d<? super CalendarPeriod> p2) throws Exception;
    
    @f
    Object c(@e final CalendarPeriod p0, @e final CalendarPeriodVideoCall p1, final boolean p2, @e final d<? super CalendarPeriod> p3) throws Exception;
    
    @f
    Object d(@e final c p0, @e final c p1, final boolean p2, @e final d<? super CalendarPeriodRoomResponse> p3) throws Exception;
    
    @f
    Object e(@e final CalendarPeriod p0, @e final String p1, final boolean p2, @e final d<? super CalendarPeriod> p3) throws Exception;
    
    @f
    Object f(@e final CalendarPeriod p0, final long p1, final boolean p2, @e final d<? super CalendarPeriod> p3) throws Exception;
    
    @f
    Object g(@e final CalendarPeriod p0, @e final String p1, final boolean p2, @e final d<? super CalendarPeriod> p3) throws Exception;
    
    @f
    Object h(@e final CalendarPeriod p0, final boolean p1, @e final d<? super CalendarTeachingContentsResponse> p2) throws Exception;
    
    @f
    Object i(@e final EntityType p0, final long p1, @e final c p2, @e final c p3, final boolean p4, @e final d<? super List<CalendarPeriod>> p5) throws Exception;
    
    @f
    Object j(@e final CalendarPeriod p0, @e final String p1, final boolean p2, @e final d<? super CalendarPeriod> p3) throws Exception;
    
    @f
    Object k(@e final CalendarPeriod p0, final long p1, final long p2, final boolean p3, @e final d<? super CalendarPeriod> p4) throws Exception;
    
    @Metadata(bv = { 1, 0, 3 }, d1 = {}, d2 = {}, k = 3, mv = { 1, 5, 1 })
    public static final class a
    {
    }
}
