// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.model;

import a4.a;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import org.jetbrains.annotations.f;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b4\u00105J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\t\u0010\u0004\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0006\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0007\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\t\u001a\u00020\bH\u00c6\u0003J\t\u0010\u000b\u001a\u00020\nH\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003JS\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\n2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001J\t\u0010\u0015\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\bH\u00d6\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\"\u0010\u0011\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u000f\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010\u0012\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010$\u001a\u0004\b.\u0010&\"\u0004\b/\u0010(R$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010$\u001a\u0004\b0\u0010&\"\u0004\b1\u0010(R\"\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010$\u001a\u0004\b2\u0010&\"\u0004\b3\u0010(¨\u00066" }, d2 = { "Lcom/untis/mobile/substitutionplanning/model/RoomUnavailableDto;", "", "", "component1", "component2", "Lcom/untis/mobile/substitutionplanning/model/RoomRefDto;", "component3", "component4", "", "component5", "", "component6", "component7", "note", "startDateTime", "room", "endDateTime", "missedPeriods", "wuId", "created", "copy", "toString", "hashCode", "other", "", "equals", "I", "getMissedPeriods", "()I", "setMissedPeriods", "(I)V", "Lcom/untis/mobile/substitutionplanning/model/RoomRefDto;", "getRoom", "()Lcom/untis/mobile/substitutionplanning/model/RoomRefDto;", "setRoom", "(Lcom/untis/mobile/substitutionplanning/model/RoomRefDto;)V", "Ljava/lang/String;", "getCreated", "()Ljava/lang/String;", "setCreated", "(Ljava/lang/String;)V", "J", "getWuId", "()J", "setWuId", "(J)V", "getEndDateTime", "setEndDateTime", "getNote", "setNote", "getStartDateTime", "setStartDateTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/untis/mobile/substitutionplanning/model/RoomRefDto;Ljava/lang/String;IJLjava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class RoomUnavailableDto
{
    @f
    private String created;
    @e
    private String endDateTime;
    private int missedPeriods;
    @f
    private String note;
    @e
    private RoomRefDto room;
    @e
    private String startDateTime;
    private long wuId;
    
    public RoomUnavailableDto(@f final String note, @e final String startDateTime, @e final RoomRefDto room, @e final String endDateTime, final int missedPeriods, final long wuId, @f final String created) {
        k0.p(startDateTime, "startDateTime");
        k0.p(room, "room");
        k0.p(endDateTime, "endDateTime");
        this.note = note;
        this.startDateTime = startDateTime;
        this.room = room;
        this.endDateTime = endDateTime;
        this.missedPeriods = missedPeriods;
        this.wuId = wuId;
        this.created = created;
    }
    
    @f
    public final String component1() {
        return this.note;
    }
    
    @e
    public final String component2() {
        return this.startDateTime;
    }
    
    @e
    public final RoomRefDto component3() {
        return this.room;
    }
    
    @e
    public final String component4() {
        return this.endDateTime;
    }
    
    public final int component5() {
        return this.missedPeriods;
    }
    
    public final long component6() {
        return this.wuId;
    }
    
    @f
    public final String component7() {
        return this.created;
    }
    
    @e
    public final RoomUnavailableDto copy(@f final String s, @e final String s2, @e final RoomRefDto roomRefDto, @e final String s3, final int n, final long n2, @f final String s4) {
        k0.p(s2, "startDateTime");
        k0.p(roomRefDto, "room");
        k0.p(s3, "endDateTime");
        return new RoomUnavailableDto(s, s2, roomRefDto, s3, n, n2, s4);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RoomUnavailableDto)) {
            return false;
        }
        final RoomUnavailableDto roomUnavailableDto = (RoomUnavailableDto)o;
        return k0.g(this.note, roomUnavailableDto.note) && k0.g(this.startDateTime, roomUnavailableDto.startDateTime) && k0.g(this.room, roomUnavailableDto.room) && k0.g(this.endDateTime, roomUnavailableDto.endDateTime) && this.missedPeriods == roomUnavailableDto.missedPeriods && this.wuId == roomUnavailableDto.wuId && k0.g(this.created, roomUnavailableDto.created);
    }
    
    @f
    public final String getCreated() {
        return this.created;
    }
    
    @e
    public final String getEndDateTime() {
        return this.endDateTime;
    }
    
    public final int getMissedPeriods() {
        return this.missedPeriods;
    }
    
    @f
    public final String getNote() {
        return this.note;
    }
    
    @e
    public final RoomRefDto getRoom() {
        return this.room;
    }
    
    @e
    public final String getStartDateTime() {
        return this.startDateTime;
    }
    
    public final long getWuId() {
        return this.wuId;
    }
    
    @Override
    public int hashCode() {
        final String note = this.note;
        int hashCode = 0;
        int hashCode2;
        if (note == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = note.hashCode();
        }
        final int hashCode3 = this.startDateTime.hashCode();
        final int hashCode4 = this.room.hashCode();
        final int hashCode5 = this.endDateTime.hashCode();
        final int missedPeriods = this.missedPeriods;
        final int a = a4.a.a(this.wuId);
        final String created = this.created;
        if (created != null) {
            hashCode = created.hashCode();
        }
        return (((((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + missedPeriods) * 31 + a) * 31 + hashCode;
    }
    
    public final void setCreated(@f final String created) {
        this.created = created;
    }
    
    public final void setEndDateTime(@e final String endDateTime) {
        k0.p(endDateTime, "<set-?>");
        this.endDateTime = endDateTime;
    }
    
    public final void setMissedPeriods(final int missedPeriods) {
        this.missedPeriods = missedPeriods;
    }
    
    public final void setNote(@f final String note) {
        this.note = note;
    }
    
    public final void setRoom(@e final RoomRefDto room) {
        k0.p(room, "<set-?>");
        this.room = room;
    }
    
    public final void setStartDateTime(@e final String startDateTime) {
        k0.p(startDateTime, "<set-?>");
        this.startDateTime = startDateTime;
    }
    
    public final void setWuId(final long wuId) {
        this.wuId = wuId;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("RoomUnavailableDto(note=");
        sb.append((Object)this.note);
        sb.append(", startDateTime=");
        sb.append(this.startDateTime);
        sb.append(", room=");
        sb.append(this.room);
        sb.append(", endDateTime=");
        sb.append(this.endDateTime);
        sb.append(", missedPeriods=");
        sb.append(this.missedPeriods);
        sb.append(", wuId=");
        sb.append(this.wuId);
        sb.append(", created=");
        sb.append((Object)this.created);
        sb.append(')');
        return sb.toString();
    }
}
