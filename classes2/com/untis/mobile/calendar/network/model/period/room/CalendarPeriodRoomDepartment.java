// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.network.model.period.room;

import android.os.Parcelable$Creator;
import a4.a;
import org.jetbrains.annotations.f;
import com.untis.mobile.utils.extension.j;
import kotlin.jvm.internal.k0;
import android.os.Parcel;
import kotlin.jvm.internal.w;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u0000 +2\u00020\u0001:\u0001+B'\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b(\u0010)B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b(\u0010*J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\t\u0010\f\u001a\u00020\u000bH\u00c6\u0003J\t\u0010\r\u001a\u00020\tH\u00c6\u0003J\t\u0010\u000e\u001a\u00020\tH\u00c6\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\tH\u00c6\u0001J\t\u0010\u0014\u001a\u00020\tH\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0004H\u00d6\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003R\"\u0010\u0011\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u000f\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR\"\u0010\u0012\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u001a\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR\"\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006," }, d2 = { "Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomDepartment;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/j2;", "writeToParcel", "describeContents", "", "component1", "", "component2", "component3", "component4", "displayName", "id", "longName", "shortName", "copy", "toString", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getLongName", "()Ljava/lang/String;", "setLongName", "(Ljava/lang/String;)V", "getDisplayName", "setDisplayName", "getShortName", "setShortName", "J", "getId", "()J", "setId", "(J)V", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "(Landroid/os/Parcel;)V", "CREATOR", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class CalendarPeriodRoomDepartment implements Parcelable
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
    
    static {
        CREATOR = new CREATOR(null);
    }
    
    public CalendarPeriodRoomDepartment(@e final Parcel parcel) {
        k0.p(parcel, "parcel");
        this(j.h(parcel), parcel.readLong(), j.h(parcel), j.h(parcel));
    }
    
    public CalendarPeriodRoomDepartment(@e final String displayName, final long id, @e final String longName, @e final String shortName) {
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
    public final CalendarPeriodRoomDepartment copy(@e final String s, final long n, @e final String s2, @e final String s3) {
        k0.p(s, "displayName");
        k0.p(s2, "longName");
        k0.p(s3, "shortName");
        return new CalendarPeriodRoomDepartment(s, n, s2, s3);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CalendarPeriodRoomDepartment)) {
            return false;
        }
        final CalendarPeriodRoomDepartment calendarPeriodRoomDepartment = (CalendarPeriodRoomDepartment)o;
        return k0.g(this.displayName, calendarPeriodRoomDepartment.displayName) && this.id == calendarPeriodRoomDepartment.id && k0.g(this.longName, calendarPeriodRoomDepartment.longName) && k0.g(this.shortName, calendarPeriodRoomDepartment.shortName);
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
        sb.append("CalendarPeriodRoomDepartment(displayName=");
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
    
    public void writeToParcel(@e final Parcel parcel, final int n) {
        k0.p(parcel, "parcel");
        parcel.writeString(this.displayName);
        parcel.writeLong(this.id);
        parcel.writeString(this.longName);
        parcel.writeString(this.shortName);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r" }, d2 = { "Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomDepartment$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomDepartment;", "Landroid/os/Parcel;", "parcel", "createFromParcel", "", "size", "", "newArray", "(I)[Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomDepartment;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class CREATOR implements Parcelable$Creator<CalendarPeriodRoomDepartment>
    {
        private CREATOR() {
        }
        
        @e
        public CalendarPeriodRoomDepartment createFromParcel(@e final Parcel parcel) {
            k0.p(parcel, "parcel");
            return new CalendarPeriodRoomDepartment(parcel);
        }
        
        @e
        public CalendarPeriodRoomDepartment[] newArray(final int n) {
            return new CalendarPeriodRoomDepartment[n];
        }
    }
}
