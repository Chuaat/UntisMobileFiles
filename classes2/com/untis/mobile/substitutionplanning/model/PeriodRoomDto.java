// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.model;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import org.jetbrains.annotations.f;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001e\u0010\u001fJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u000e\u001a\u00020\rH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u0007\"\u0004\b\u001a\u0010\u001bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017¨\u0006 " }, d2 = { "Lcom/untis/mobile/substitutionplanning/model/PeriodRoomDto;", "", "Lcom/untis/mobile/substitutionplanning/model/RoomRefDto;", "component1", "component2", "", "component3", "()Ljava/lang/Boolean;", "currentRoom", "removedRoom", "hasOpenConflicts", "copy", "(Lcom/untis/mobile/substitutionplanning/model/RoomRefDto;Lcom/untis/mobile/substitutionplanning/model/RoomRefDto;Ljava/lang/Boolean;)Lcom/untis/mobile/substitutionplanning/model/PeriodRoomDto;", "", "toString", "", "hashCode", "other", "equals", "Lcom/untis/mobile/substitutionplanning/model/RoomRefDto;", "getCurrentRoom", "()Lcom/untis/mobile/substitutionplanning/model/RoomRefDto;", "setCurrentRoom", "(Lcom/untis/mobile/substitutionplanning/model/RoomRefDto;)V", "Ljava/lang/Boolean;", "getHasOpenConflicts", "setHasOpenConflicts", "(Ljava/lang/Boolean;)V", "getRemovedRoom", "setRemovedRoom", "<init>", "(Lcom/untis/mobile/substitutionplanning/model/RoomRefDto;Lcom/untis/mobile/substitutionplanning/model/RoomRefDto;Ljava/lang/Boolean;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class PeriodRoomDto
{
    @f
    private RoomRefDto currentRoom;
    @f
    private Boolean hasOpenConflicts;
    @f
    private RoomRefDto removedRoom;
    
    public PeriodRoomDto(@f final RoomRefDto currentRoom, @f final RoomRefDto removedRoom, @f final Boolean hasOpenConflicts) {
        this.currentRoom = currentRoom;
        this.removedRoom = removedRoom;
        this.hasOpenConflicts = hasOpenConflicts;
    }
    
    @f
    public final RoomRefDto component1() {
        return this.currentRoom;
    }
    
    @f
    public final RoomRefDto component2() {
        return this.removedRoom;
    }
    
    @f
    public final Boolean component3() {
        return this.hasOpenConflicts;
    }
    
    @e
    public final PeriodRoomDto copy(@f final RoomRefDto roomRefDto, @f final RoomRefDto roomRefDto2, @f final Boolean b) {
        return new PeriodRoomDto(roomRefDto, roomRefDto2, b);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PeriodRoomDto)) {
            return false;
        }
        final PeriodRoomDto periodRoomDto = (PeriodRoomDto)o;
        return k0.g(this.currentRoom, periodRoomDto.currentRoom) && k0.g(this.removedRoom, periodRoomDto.removedRoom) && k0.g(this.hasOpenConflicts, periodRoomDto.hasOpenConflicts);
    }
    
    @f
    public final RoomRefDto getCurrentRoom() {
        return this.currentRoom;
    }
    
    @f
    public final Boolean getHasOpenConflicts() {
        return this.hasOpenConflicts;
    }
    
    @f
    public final RoomRefDto getRemovedRoom() {
        return this.removedRoom;
    }
    
    @Override
    public int hashCode() {
        final RoomRefDto currentRoom = this.currentRoom;
        int hashCode = 0;
        int hashCode2;
        if (currentRoom == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = currentRoom.hashCode();
        }
        final RoomRefDto removedRoom = this.removedRoom;
        int hashCode3;
        if (removedRoom == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = removedRoom.hashCode();
        }
        final Boolean hasOpenConflicts = this.hasOpenConflicts;
        if (hasOpenConflicts != null) {
            hashCode = hasOpenConflicts.hashCode();
        }
        return (hashCode2 * 31 + hashCode3) * 31 + hashCode;
    }
    
    public final void setCurrentRoom(@f final RoomRefDto currentRoom) {
        this.currentRoom = currentRoom;
    }
    
    public final void setHasOpenConflicts(@f final Boolean hasOpenConflicts) {
        this.hasOpenConflicts = hasOpenConflicts;
    }
    
    public final void setRemovedRoom(@f final RoomRefDto removedRoom) {
        this.removedRoom = removedRoom;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("PeriodRoomDto(currentRoom=");
        sb.append(this.currentRoom);
        sb.append(", removedRoom=");
        sb.append(this.removedRoom);
        sb.append(", hasOpenConflicts=");
        sb.append(this.hasOpenConflicts);
        sb.append(')');
        return sb.toString();
    }
}
