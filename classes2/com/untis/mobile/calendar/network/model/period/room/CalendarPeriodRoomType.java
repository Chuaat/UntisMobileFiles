// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.network.model.period.room;

import a4.a;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0006\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0007\u001a\u00020\u0002H\u00c6\u0003J1\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0002H\u00c6\u0001J\t\u0010\r\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017¨\u0006#" }, d2 = { "Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomType;", "", "", "component1", "", "component2", "component3", "component4", "displayName", "id", "longName", "shortName", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getDisplayName", "()Ljava/lang/String;", "setDisplayName", "(Ljava/lang/String;)V", "getLongName", "setLongName", "J", "getId", "()J", "setId", "(J)V", "getShortName", "setShortName", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class CalendarPeriodRoomType
{
    @SerializedName("displayName")
    @e
    private String displayName;
    @SerializedName("id")
    private long id;
    @SerializedName("longName")
    @e
    private String longName;
    @SerializedName("shortName")
    @e
    private String shortName;
    
    public CalendarPeriodRoomType(@e final String displayName, final long id, @e final String longName, @e final String shortName) {
        k0.p(displayName, "displayName");
        k0.p(longName, "longName");
        k0.p(shortName, "shortName");
        this.displayName = displayName;
        this.id = id;
        this.longName = longName;
        this.shortName = shortName;
    }
    
    @e
    public final String component1() {
        return this.displayName;
    }
    
    public final long component2() {
        return this.id;
    }
    
    @e
    public final String component3() {
        return this.longName;
    }
    
    @e
    public final String component4() {
        return this.shortName;
    }
    
    @e
    public final CalendarPeriodRoomType copy(@e final String s, final long n, @e final String s2, @e final String s3) {
        k0.p(s, "displayName");
        k0.p(s2, "longName");
        k0.p(s3, "shortName");
        return new CalendarPeriodRoomType(s, n, s2, s3);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CalendarPeriodRoomType)) {
            return false;
        }
        final CalendarPeriodRoomType calendarPeriodRoomType = (CalendarPeriodRoomType)o;
        return k0.g(this.displayName, calendarPeriodRoomType.displayName) && this.id == calendarPeriodRoomType.id && k0.g(this.longName, calendarPeriodRoomType.longName) && k0.g(this.shortName, calendarPeriodRoomType.shortName);
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
    
    @e
    public final String getShortName() {
        return this.shortName;
    }
    
    @Override
    public int hashCode() {
        return ((this.displayName.hashCode() * 31 + a.a(this.id)) * 31 + this.longName.hashCode()) * 31 + this.shortName.hashCode();
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
    
    public final void setShortName(@e final String shortName) {
        k0.p(shortName, "<set-?>");
        this.shortName = shortName;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CalendarPeriodRoomType(displayName=");
        sb.append(this.displayName);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", longName=");
        sb.append(this.longName);
        sb.append(", shortName=");
        sb.append(this.shortName);
        sb.append(')');
        return sb.toString();
    }
}
