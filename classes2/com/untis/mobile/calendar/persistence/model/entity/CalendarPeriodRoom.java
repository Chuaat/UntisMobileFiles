// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.persistence.model.entity;

import android.os.Parcelable$Creator;
import a4.a;
import org.jetbrains.annotations.f;
import com.untis.mobile.utils.extension.j;
import android.os.Parcel;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import com.untis.mobile.utils.jsonadapter.d;
import com.google.gson.annotations.JsonAdapter;
import com.untis.mobile.calendar.persistence.model.common.CalendarPeriodRoomStatus;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0086\b\u0018\u0000 32\u00020\u0001:\u00013B/\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u000f¢\u0006\u0004\b0\u00101B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b0\u00102J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\t\u0010\f\u001a\u00020\u000bH\u00c6\u0003J\t\u0010\r\u001a\u00020\u000bH\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u000bH\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u000fH\u00c6\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000fH\u00c6\u0001J\t\u0010\u0017\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0004H\u00d6\u0001J\u0013\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u00d6\u0003R\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\u0013\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u001d\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010!R\"\u0010\u0011\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010\u0014\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u001d\u001a\u0004\b)\u0010\u001f\"\u0004\b*\u0010!R\"\u0010\u0015\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00064" }, d2 = { "Lcom/untis/mobile/calendar/persistence/model/entity/CalendarPeriodRoom;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/j2;", "writeToParcel", "describeContents", "", "component1", "", "component2", "component3", "component4", "Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodRoomStatus;", "component5", "id", "displayName", "longName", "shortName", "status", "copy", "toString", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getDisplayName", "()Ljava/lang/String;", "setDisplayName", "(Ljava/lang/String;)V", "getLongName", "setLongName", "J", "getId", "()J", "setId", "(J)V", "getShortName", "setShortName", "Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodRoomStatus;", "getStatus", "()Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodRoomStatus;", "setStatus", "(Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodRoomStatus;)V", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodRoomStatus;)V", "(Landroid/os/Parcel;)V", "CREATOR", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class CalendarPeriodRoom implements Parcelable
{
    @e
    public static final CREATOR CREATOR;
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
    @JsonAdapter(d.class)
    @SerializedName("status")
    @e
    private CalendarPeriodRoomStatus status;
    
    static {
        CREATOR = new CREATOR(null);
    }
    
    public CalendarPeriodRoom(final long id, @e final String displayName, @e final String longName, @e final String shortName, @e final CalendarPeriodRoomStatus status) {
        k0.p(displayName, "displayName");
        k0.p(longName, "longName");
        k0.p(shortName, "shortName");
        k0.p(status, "status");
        this.id = id;
        this.displayName = displayName;
        this.longName = longName;
        this.shortName = shortName;
        this.status = status;
    }
    
    public CalendarPeriodRoom(@e final Parcel parcel) {
        k0.p(parcel, "parcel");
        this(parcel.readLong(), j.h(parcel), j.h(parcel), j.h(parcel), j.b(parcel));
    }
    
    public final long component1() {
        return this.id;
    }
    
    @e
    public final String component2() {
        return this.displayName;
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
    public final CalendarPeriodRoomStatus component5() {
        return this.status;
    }
    
    @e
    public final CalendarPeriodRoom copy(final long n, @e final String s, @e final String s2, @e final String s3, @e final CalendarPeriodRoomStatus calendarPeriodRoomStatus) {
        k0.p(s, "displayName");
        k0.p(s2, "longName");
        k0.p(s3, "shortName");
        k0.p(calendarPeriodRoomStatus, "status");
        return new CalendarPeriodRoom(n, s, s2, s3, calendarPeriodRoomStatus);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CalendarPeriodRoom)) {
            return false;
        }
        final CalendarPeriodRoom calendarPeriodRoom = (CalendarPeriodRoom)o;
        return this.id == calendarPeriodRoom.id && k0.g(this.displayName, calendarPeriodRoom.displayName) && k0.g(this.longName, calendarPeriodRoom.longName) && k0.g(this.shortName, calendarPeriodRoom.shortName) && this.status == calendarPeriodRoom.status;
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
    
    @e
    public final CalendarPeriodRoomStatus getStatus() {
        return this.status;
    }
    
    @Override
    public int hashCode() {
        return (((a.a(this.id) * 31 + this.displayName.hashCode()) * 31 + this.longName.hashCode()) * 31 + this.shortName.hashCode()) * 31 + this.status.hashCode();
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
    
    public final void setStatus(@e final CalendarPeriodRoomStatus status) {
        k0.p(status, "<set-?>");
        this.status = status;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CalendarPeriodRoom(id=");
        sb.append(this.id);
        sb.append(", displayName=");
        sb.append(this.displayName);
        sb.append(", longName=");
        sb.append(this.longName);
        sb.append(", shortName=");
        sb.append(this.shortName);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(')');
        return sb.toString();
    }
    
    public void writeToParcel(@e final Parcel parcel, final int n) {
        k0.p(parcel, "parcel");
        parcel.writeLong(this.id);
        parcel.writeString(this.displayName);
        parcel.writeString(this.longName);
        parcel.writeString(this.shortName);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r" }, d2 = { "Lcom/untis/mobile/calendar/persistence/model/entity/CalendarPeriodRoom$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/untis/mobile/calendar/persistence/model/entity/CalendarPeriodRoom;", "Landroid/os/Parcel;", "parcel", "createFromParcel", "", "size", "", "newArray", "(I)[Lcom/untis/mobile/calendar/persistence/model/entity/CalendarPeriodRoom;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class CREATOR implements Parcelable$Creator<CalendarPeriodRoom>
    {
        private CREATOR() {
        }
        
        @e
        public CalendarPeriodRoom createFromParcel(@e final Parcel parcel) {
            k0.p(parcel, "parcel");
            return new CalendarPeriodRoom(parcel);
        }
        
        @e
        public CalendarPeriodRoom[] newArray(final int n) {
            return new CalendarPeriodRoom[n];
        }
    }
}
