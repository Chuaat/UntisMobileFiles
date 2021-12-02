// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.model;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import org.jetbrains.annotations.f;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\"\u0010#J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J-\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001J\t\u0010\r\u001a\u00020\fH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006$" }, d2 = { "Lcom/untis/mobile/substitutionplanning/model/GroupDto;", "", "Lcom/untis/mobile/substitutionplanning/model/OverbookingDto;", "component1", "Lcom/untis/mobile/substitutionplanning/model/TeacherAbsenceDto;", "component2", "Lcom/untis/mobile/substitutionplanning/model/RoomUnavailableDto;", "component3", "overbooking", "absence", "unavailableRoom", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/untis/mobile/substitutionplanning/model/OverbookingDto;", "getOverbooking", "()Lcom/untis/mobile/substitutionplanning/model/OverbookingDto;", "setOverbooking", "(Lcom/untis/mobile/substitutionplanning/model/OverbookingDto;)V", "Lcom/untis/mobile/substitutionplanning/model/RoomUnavailableDto;", "getUnavailableRoom", "()Lcom/untis/mobile/substitutionplanning/model/RoomUnavailableDto;", "setUnavailableRoom", "(Lcom/untis/mobile/substitutionplanning/model/RoomUnavailableDto;)V", "Lcom/untis/mobile/substitutionplanning/model/TeacherAbsenceDto;", "getAbsence", "()Lcom/untis/mobile/substitutionplanning/model/TeacherAbsenceDto;", "setAbsence", "(Lcom/untis/mobile/substitutionplanning/model/TeacherAbsenceDto;)V", "<init>", "(Lcom/untis/mobile/substitutionplanning/model/OverbookingDto;Lcom/untis/mobile/substitutionplanning/model/TeacherAbsenceDto;Lcom/untis/mobile/substitutionplanning/model/RoomUnavailableDto;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class GroupDto
{
    @f
    private TeacherAbsenceDto absence;
    @f
    private OverbookingDto overbooking;
    @f
    private RoomUnavailableDto unavailableRoom;
    
    public GroupDto(@f final OverbookingDto overbooking, @f final TeacherAbsenceDto absence, @f final RoomUnavailableDto unavailableRoom) {
        this.overbooking = overbooking;
        this.absence = absence;
        this.unavailableRoom = unavailableRoom;
    }
    
    @f
    public final OverbookingDto component1() {
        return this.overbooking;
    }
    
    @f
    public final TeacherAbsenceDto component2() {
        return this.absence;
    }
    
    @f
    public final RoomUnavailableDto component3() {
        return this.unavailableRoom;
    }
    
    @e
    public final GroupDto copy(@f final OverbookingDto overbookingDto, @f final TeacherAbsenceDto teacherAbsenceDto, @f final RoomUnavailableDto roomUnavailableDto) {
        return new GroupDto(overbookingDto, teacherAbsenceDto, roomUnavailableDto);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GroupDto)) {
            return false;
        }
        final GroupDto groupDto = (GroupDto)o;
        return k0.g(this.overbooking, groupDto.overbooking) && k0.g(this.absence, groupDto.absence) && k0.g(this.unavailableRoom, groupDto.unavailableRoom);
    }
    
    @f
    public final TeacherAbsenceDto getAbsence() {
        return this.absence;
    }
    
    @f
    public final OverbookingDto getOverbooking() {
        return this.overbooking;
    }
    
    @f
    public final RoomUnavailableDto getUnavailableRoom() {
        return this.unavailableRoom;
    }
    
    @Override
    public int hashCode() {
        final OverbookingDto overbooking = this.overbooking;
        int hashCode = 0;
        int hashCode2;
        if (overbooking == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = overbooking.hashCode();
        }
        final TeacherAbsenceDto absence = this.absence;
        int hashCode3;
        if (absence == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = absence.hashCode();
        }
        final RoomUnavailableDto unavailableRoom = this.unavailableRoom;
        if (unavailableRoom != null) {
            hashCode = unavailableRoom.hashCode();
        }
        return (hashCode2 * 31 + hashCode3) * 31 + hashCode;
    }
    
    public final void setAbsence(@f final TeacherAbsenceDto absence) {
        this.absence = absence;
    }
    
    public final void setOverbooking(@f final OverbookingDto overbooking) {
        this.overbooking = overbooking;
    }
    
    public final void setUnavailableRoom(@f final RoomUnavailableDto unavailableRoom) {
        this.unavailableRoom = unavailableRoom;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("GroupDto(overbooking=");
        sb.append(this.overbooking);
        sb.append(", absence=");
        sb.append(this.absence);
        sb.append(", unavailableRoom=");
        sb.append(this.unavailableRoom);
        sb.append(')');
        return sb.toString();
    }
}
