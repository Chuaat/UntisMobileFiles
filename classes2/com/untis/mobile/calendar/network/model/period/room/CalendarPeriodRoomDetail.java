// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.network.model.period.room;

import a4.a;
import kotlin.text.s;
import kotlin.jvm.internal.k0;
import com.untis.mobile.utils.jsonadapter.d;
import com.untis.mobile.calendar.persistence.model.common.CalendarPeriodRoomStatus;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import com.google.gson.annotations.SerializedName;
import com.untis.mobile.utils.jsonadapter.c;
import com.google.gson.annotations.JsonAdapter;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b/\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B_\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u001b\u001a\u00020\r\u0012\u0006\u0010\u001c\u001a\u00020\u000f\u0012\u0006\u0010\u001d\u001a\u00020\r\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u001f\u001a\u00020\r\u0012\u0006\u0010 \u001a\u00020\u0015¢\u0006\u0004\bS\u0010TJ\u0011\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0096\u0002J\t\u0010\u0006\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0012\u0010\t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\t\u0010\u000e\u001a\u00020\rH\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u000fH\u00c6\u0003J\t\u0010\u0011\u001a\u00020\rH\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\rH\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0015H\u00c6\u0003J|\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u001c\u001a\u00020\u000f2\b\b\u0002\u0010\u001d\u001a\u00020\r2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u001f\u001a\u00020\r2\b\b\u0002\u0010 \u001a\u00020\u0015H\u00c6\u0001¢\u0006\u0004\b!\u0010\"J\t\u0010#\u001a\u00020\rH\u00d6\u0001J\t\u0010$\u001a\u00020\u0003H\u00d6\u0001J\u0013\u0010'\u001a\u00020&2\b\u0010\u0002\u001a\u0004\u0018\u00010%H\u00d6\u0003R\"\u0010\u001b\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010\u001c\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u0010\u001a\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010\u001d\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010(\u001a\u0004\b7\u0010*\"\u0004\b8\u0010,R\"\u0010\u001f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010(\u001a\u0004\b9\u0010*\"\u0004\b:\u0010,R\"\u0010 \u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010\u0018\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010\u0017\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010J\u001a\u0004\bK\u0010\n\"\u0004\bL\u0010MR$\u0010\u001e\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010R¨\u0006U" }, d2 = { "Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomDetail;", "", "other", "", "compareTo", "Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomAvailability;", "component1", "Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomBuilding;", "component2", "component3", "()Ljava/lang/Integer;", "Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomDepartment;", "component4", "", "component5", "", "component6", "component7", "Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomType;", "component8", "component9", "Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodRoomStatus;", "component10", "availability", "building", "capacity", "department", "displayName", "id", "longName", "roomType", "shortName", "status", "copy", "(Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomAvailability;Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomBuilding;Ljava/lang/Integer;Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomDepartment;Ljava/lang/String;JLjava/lang/String;Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomType;Ljava/lang/String;Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodRoomStatus;)Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomDetail;", "toString", "hashCode", "", "", "equals", "Ljava/lang/String;", "getDisplayName", "()Ljava/lang/String;", "setDisplayName", "(Ljava/lang/String;)V", "J", "getId", "()J", "setId", "(J)V", "Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomDepartment;", "getDepartment", "()Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomDepartment;", "setDepartment", "(Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomDepartment;)V", "getLongName", "setLongName", "getShortName", "setShortName", "Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodRoomStatus;", "getStatus", "()Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodRoomStatus;", "setStatus", "(Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodRoomStatus;)V", "Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomBuilding;", "getBuilding", "()Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomBuilding;", "setBuilding", "(Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomBuilding;)V", "Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomAvailability;", "getAvailability", "()Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomAvailability;", "setAvailability", "(Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomAvailability;)V", "Ljava/lang/Integer;", "getCapacity", "setCapacity", "(Ljava/lang/Integer;)V", "Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomType;", "getRoomType", "()Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomType;", "setRoomType", "(Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomType;)V", "<init>", "(Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomAvailability;Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomBuilding;Ljava/lang/Integer;Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomDepartment;Ljava/lang/String;JLjava/lang/String;Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomType;Ljava/lang/String;Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodRoomStatus;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class CalendarPeriodRoomDetail implements Comparable<CalendarPeriodRoomDetail>
{
    @JsonAdapter(c.class)
    @SerializedName("availability")
    @e
    private CalendarPeriodRoomAvailability availability;
    @SerializedName("building")
    @f
    private CalendarPeriodRoomBuilding building;
    @SerializedName("capacity")
    @f
    private Integer capacity;
    @SerializedName("department")
    @f
    private CalendarPeriodRoomDepartment department;
    @SerializedName("displayName")
    @e
    private String displayName;
    @SerializedName("id")
    private long id;
    @SerializedName("longName")
    @e
    private String longName;
    @SerializedName("roomType")
    @f
    private CalendarPeriodRoomType roomType;
    @SerializedName("shortName")
    @e
    private String shortName;
    @JsonAdapter(d.class)
    @SerializedName("status")
    @e
    private CalendarPeriodRoomStatus status;
    
    public CalendarPeriodRoomDetail(@e final CalendarPeriodRoomAvailability availability, @f final CalendarPeriodRoomBuilding building, @f final Integer capacity, @f final CalendarPeriodRoomDepartment department, @e final String displayName, final long id, @e final String longName, @f final CalendarPeriodRoomType roomType, @e final String shortName, @e final CalendarPeriodRoomStatus status) {
        k0.p(availability, "availability");
        k0.p(displayName, "displayName");
        k0.p(longName, "longName");
        k0.p(shortName, "shortName");
        k0.p(status, "status");
        this.availability = availability;
        this.building = building;
        this.capacity = capacity;
        this.department = department;
        this.displayName = displayName;
        this.id = id;
        this.longName = longName;
        this.roomType = roomType;
        this.shortName = shortName;
        this.status = status;
    }
    
    @Override
    public int compareTo(@e final CalendarPeriodRoomDetail calendarPeriodRoomDetail) {
        k0.p(calendarPeriodRoomDetail, "other");
        return s.r1(this.displayName, calendarPeriodRoomDetail.displayName, true);
    }
    
    @e
    public final CalendarPeriodRoomAvailability component1() {
        return this.availability;
    }
    
    @e
    public final CalendarPeriodRoomStatus component10() {
        return this.status;
    }
    
    @f
    public final CalendarPeriodRoomBuilding component2() {
        return this.building;
    }
    
    @f
    public final Integer component3() {
        return this.capacity;
    }
    
    @f
    public final CalendarPeriodRoomDepartment component4() {
        return this.department;
    }
    
    @e
    public final String component5() {
        return this.displayName;
    }
    
    public final long component6() {
        return this.id;
    }
    
    @e
    public final String component7() {
        return this.longName;
    }
    
    @f
    public final CalendarPeriodRoomType component8() {
        return this.roomType;
    }
    
    @e
    public final String component9() {
        return this.shortName;
    }
    
    @e
    public final CalendarPeriodRoomDetail copy(@e final CalendarPeriodRoomAvailability calendarPeriodRoomAvailability, @f final CalendarPeriodRoomBuilding calendarPeriodRoomBuilding, @f final Integer n, @f final CalendarPeriodRoomDepartment calendarPeriodRoomDepartment, @e final String s, final long n2, @e final String s2, @f final CalendarPeriodRoomType calendarPeriodRoomType, @e final String s3, @e final CalendarPeriodRoomStatus calendarPeriodRoomStatus) {
        k0.p(calendarPeriodRoomAvailability, "availability");
        k0.p(s, "displayName");
        k0.p(s2, "longName");
        k0.p(s3, "shortName");
        k0.p(calendarPeriodRoomStatus, "status");
        return new CalendarPeriodRoomDetail(calendarPeriodRoomAvailability, calendarPeriodRoomBuilding, n, calendarPeriodRoomDepartment, s, n2, s2, calendarPeriodRoomType, s3, calendarPeriodRoomStatus);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CalendarPeriodRoomDetail)) {
            return false;
        }
        final CalendarPeriodRoomDetail calendarPeriodRoomDetail = (CalendarPeriodRoomDetail)o;
        return this.availability == calendarPeriodRoomDetail.availability && k0.g(this.building, calendarPeriodRoomDetail.building) && k0.g(this.capacity, calendarPeriodRoomDetail.capacity) && k0.g(this.department, calendarPeriodRoomDetail.department) && k0.g(this.displayName, calendarPeriodRoomDetail.displayName) && this.id == calendarPeriodRoomDetail.id && k0.g(this.longName, calendarPeriodRoomDetail.longName) && k0.g(this.roomType, calendarPeriodRoomDetail.roomType) && k0.g(this.shortName, calendarPeriodRoomDetail.shortName) && this.status == calendarPeriodRoomDetail.status;
    }
    
    @e
    public final CalendarPeriodRoomAvailability getAvailability() {
        return this.availability;
    }
    
    @f
    public final CalendarPeriodRoomBuilding getBuilding() {
        return this.building;
    }
    
    @f
    public final Integer getCapacity() {
        return this.capacity;
    }
    
    @f
    public final CalendarPeriodRoomDepartment getDepartment() {
        return this.department;
    }
    
    @e
    public final String getDisplayName() {
        return this.displayName;
    }
    
    public final long getId() {
        return this.id;
    }
    
    @e
    public final String getLongName() {
        return this.longName;
    }
    
    @f
    public final CalendarPeriodRoomType getRoomType() {
        return this.roomType;
    }
    
    @e
    public final String getShortName() {
        return this.shortName;
    }
    
    @e
    public final CalendarPeriodRoomStatus getStatus() {
        return this.status;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.availability.hashCode();
        final CalendarPeriodRoomBuilding building = this.building;
        int hashCode2 = 0;
        int hashCode3;
        if (building == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = building.hashCode();
        }
        final Integer capacity = this.capacity;
        int hashCode4;
        if (capacity == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = capacity.hashCode();
        }
        final CalendarPeriodRoomDepartment department = this.department;
        int hashCode5;
        if (department == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = department.hashCode();
        }
        final int hashCode6 = this.displayName.hashCode();
        final int a = a4.a.a(this.id);
        final int hashCode7 = this.longName.hashCode();
        final CalendarPeriodRoomType roomType = this.roomType;
        if (roomType != null) {
            hashCode2 = roomType.hashCode();
        }
        return ((((((((hashCode * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + a) * 31 + hashCode7) * 31 + hashCode2) * 31 + this.shortName.hashCode()) * 31 + this.status.hashCode();
    }
    
    public final void setAvailability(@e final CalendarPeriodRoomAvailability availability) {
        k0.p(availability, "<set-?>");
        this.availability = availability;
    }
    
    public final void setBuilding(@f final CalendarPeriodRoomBuilding building) {
        this.building = building;
    }
    
    public final void setCapacity(@f final Integer capacity) {
        this.capacity = capacity;
    }
    
    public final void setDepartment(@f final CalendarPeriodRoomDepartment department) {
        this.department = department;
    }
    
    public final void setDisplayName(@e final String displayName) {
        k0.p(displayName, "<set-?>");
        this.displayName = displayName;
    }
    
    public final void setId(final long id) {
        this.id = id;
    }
    
    public final void setLongName(@e final String longName) {
        k0.p(longName, "<set-?>");
        this.longName = longName;
    }
    
    public final void setRoomType(@f final CalendarPeriodRoomType roomType) {
        this.roomType = roomType;
    }
    
    public final void setShortName(@e final String shortName) {
        k0.p(shortName, "<set-?>");
        this.shortName = shortName;
    }
    
    public final void setStatus(@e final CalendarPeriodRoomStatus status) {
        k0.p(status, "<set-?>");
        this.status = status;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CalendarPeriodRoomDetail(availability=");
        sb.append(this.availability);
        sb.append(", building=");
        sb.append(this.building);
        sb.append(", capacity=");
        sb.append(this.capacity);
        sb.append(", department=");
        sb.append(this.department);
        sb.append(", displayName=");
        sb.append(this.displayName);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", longName=");
        sb.append(this.longName);
        sb.append(", roomType=");
        sb.append(this.roomType);
        sb.append(", shortName=");
        sb.append(this.shortName);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(')');
        return sb.toString();
    }
}
