// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.network.model.period.room;

import org.jetbrains.annotations.e;
import java.util.Iterator;
import kotlin.collections.v;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.f;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u0004\u0018\u00010\u0000¨\u0006\u0004" }, d2 = { "Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomResponse;", "", "Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomDetail;", "getAvailableRooms", "untismobile_5.1.0_release" }, k = 2, mv = { 1, 5, 1 })
public final class CalendarPeriodRoomResponseKt
{
    @e
    public static final List<CalendarPeriodRoomDetail> getAvailableRooms(@f final CalendarPeriodRoomResponse calendarPeriodRoomResponse) {
        ArrayList<CalendarPeriodRoomDetail> list;
        if (calendarPeriodRoomResponse == null) {
            list = null;
        }
        else {
            final List<CalendarPeriodRoomDetail> rooms = calendarPeriodRoomResponse.getRooms();
            list = new ArrayList<CalendarPeriodRoomDetail>();
            for (final CalendarPeriodRoomDetail next : rooms) {
                final CalendarPeriodRoomDetail calendarPeriodRoomDetail = next;
                if (calendarPeriodRoomDetail.getAvailability() == CalendarPeriodRoomAvailability.Bookable || calendarPeriodRoomDetail.getAvailability() == CalendarPeriodRoomAvailability.Reservable) {
                    list.add(next);
                }
            }
        }
        List<CalendarPeriodRoomDetail> e;
        if ((e = list) == null) {
            e = v.E();
        }
        return e;
    }
}
