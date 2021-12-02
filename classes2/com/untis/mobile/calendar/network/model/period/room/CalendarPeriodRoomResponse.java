// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.network.model.period.room;

import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u00c6\u0003J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H\u00c6\u0003J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002H\u00c6\u0003JI\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u0002H\u00c6\u0001J\t\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0012H\u00d6\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R(\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0017\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001b¨\u0006$" }, d2 = { "Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomResponse;", "", "", "Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomBuilding;", "component1", "Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomDepartment;", "component2", "Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomType;", "component3", "Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomDetail;", "component4", "buildings", "departments", "roomTypes", "rooms", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/List;", "getRoomTypes", "()Ljava/util/List;", "setRoomTypes", "(Ljava/util/List;)V", "getBuildings", "setBuildings", "getRooms", "setRooms", "getDepartments", "setDepartments", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class CalendarPeriodRoomResponse
{
    @SerializedName("buildings")
    @e
    private List<CalendarPeriodRoomBuilding> buildings;
    @SerializedName("departments")
    @e
    private List<CalendarPeriodRoomDepartment> departments;
    @SerializedName("roomTypes")
    @e
    private List<CalendarPeriodRoomType> roomTypes;
    @SerializedName("rooms")
    @e
    private List<CalendarPeriodRoomDetail> rooms;
    
    public CalendarPeriodRoomResponse(@e final List<CalendarPeriodRoomBuilding> buildings, @e final List<CalendarPeriodRoomDepartment> departments, @e final List<CalendarPeriodRoomType> roomTypes, @e final List<CalendarPeriodRoomDetail> rooms) {
        k0.p(buildings, "buildings");
        k0.p(departments, "departments");
        k0.p(roomTypes, "roomTypes");
        k0.p(rooms, "rooms");
        this.buildings = buildings;
        this.departments = departments;
        this.roomTypes = roomTypes;
        this.rooms = rooms;
    }
    
    @e
    public final List<CalendarPeriodRoomBuilding> component1() {
        return this.buildings;
    }
    
    @e
    public final List<CalendarPeriodRoomDepartment> component2() {
        return this.departments;
    }
    
    @e
    public final List<CalendarPeriodRoomType> component3() {
        return this.roomTypes;
    }
    
    @e
    public final List<CalendarPeriodRoomDetail> component4() {
        return this.rooms;
    }
    
    @e
    public final CalendarPeriodRoomResponse copy(@e final List<CalendarPeriodRoomBuilding> list, @e final List<CalendarPeriodRoomDepartment> list2, @e final List<CalendarPeriodRoomType> list3, @e final List<CalendarPeriodRoomDetail> list4) {
        k0.p(list, "buildings");
        k0.p(list2, "departments");
        k0.p(list3, "roomTypes");
        k0.p(list4, "rooms");
        return new CalendarPeriodRoomResponse(list, list2, list3, list4);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CalendarPeriodRoomResponse)) {
            return false;
        }
        final CalendarPeriodRoomResponse calendarPeriodRoomResponse = (CalendarPeriodRoomResponse)o;
        return k0.g(this.buildings, calendarPeriodRoomResponse.buildings) && k0.g(this.departments, calendarPeriodRoomResponse.departments) && k0.g(this.roomTypes, calendarPeriodRoomResponse.roomTypes) && k0.g(this.rooms, calendarPeriodRoomResponse.rooms);
    }
    
    @e
    public final List<CalendarPeriodRoomBuilding> getBuildings() {
        return this.buildings;
    }
    
    @e
    public final List<CalendarPeriodRoomDepartment> getDepartments() {
        return this.departments;
    }
    
    @e
    public final List<CalendarPeriodRoomType> getRoomTypes() {
        return this.roomTypes;
    }
    
    @e
    public final List<CalendarPeriodRoomDetail> getRooms() {
        return this.rooms;
    }
    
    @Override
    public int hashCode() {
        return ((this.buildings.hashCode() * 31 + this.departments.hashCode()) * 31 + this.roomTypes.hashCode()) * 31 + this.rooms.hashCode();
    }
    
    public final void setBuildings(@e final List<CalendarPeriodRoomBuilding> buildings) {
        k0.p(buildings, "<set-?>");
        this.buildings = buildings;
    }
    
    public final void setDepartments(@e final List<CalendarPeriodRoomDepartment> departments) {
        k0.p(departments, "<set-?>");
        this.departments = departments;
    }
    
    public final void setRoomTypes(@e final List<CalendarPeriodRoomType> roomTypes) {
        k0.p(roomTypes, "<set-?>");
        this.roomTypes = roomTypes;
    }
    
    public final void setRooms(@e final List<CalendarPeriodRoomDetail> rooms) {
        k0.p(rooms, "<set-?>");
        this.rooms = rooms;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CalendarPeriodRoomResponse(buildings=");
        sb.append(this.buildings);
        sb.append(", departments=");
        sb.append(this.departments);
        sb.append(", roomTypes=");
        sb.append(this.roomTypes);
        sb.append(", rooms=");
        sb.append(this.rooms);
        sb.append(')');
        return sb.toString();
    }
}
