// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.persistence.model.common;

import android.os.Parcelable$Creator;
import a4.a;
import org.jetbrains.annotations.f;
import com.untis.mobile.utils.extension.j;
import android.os.Parcel;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u0000 #2\u00020\u0001:\u0001#B\u0017\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b \u0010!B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b \u0010\"J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\t\u0010\f\u001a\u00020\u000bH\u00c6\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000bH\u00c6\u0001J\t\u0010\u0010\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0004H\u00d6\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003R\"\u0010\r\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006$" }, d2 = { "Lcom/untis/mobile/calendar/persistence/model/common/CalendarOriginalPeriod;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/j2;", "writeToParcel", "describeContents", "", "component1", "", "component2", "originalCalendarEntryId", "calculatedTitle", "copy", "toString", "hashCode", "", "other", "", "equals", "J", "getOriginalCalendarEntryId", "()J", "setOriginalCalendarEntryId", "(J)V", "Ljava/lang/String;", "getCalculatedTitle", "()Ljava/lang/String;", "setCalculatedTitle", "(Ljava/lang/String;)V", "<init>", "(JLjava/lang/String;)V", "(Landroid/os/Parcel;)V", "CREATOR", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class CalendarOriginalPeriod implements Parcelable
{
    @e
    public static final CREATOR CREATOR;
    @SerializedName("calculatedTitle")
    @e
    private String calculatedTitle;
    @SerializedName("originalCalendarEntryId")
    private long originalCalendarEntryId;
    
    static {
        CREATOR = new CREATOR(null);
    }
    
    public CalendarOriginalPeriod(final long originalCalendarEntryId, @e final String calculatedTitle) {
        k0.p(calculatedTitle, "calculatedTitle");
        this.originalCalendarEntryId = originalCalendarEntryId;
        this.calculatedTitle = calculatedTitle;
    }
    
    public CalendarOriginalPeriod(@e final Parcel parcel) {
        k0.p(parcel, "parcel");
        this(parcel.readLong(), j.h(parcel));
    }
    
    public final long component1() {
        return this.originalCalendarEntryId;
    }
    
    @e
    public final String component2() {
        return this.calculatedTitle;
    }
    
    @e
    public final CalendarOriginalPeriod copy(final long n, @e final String s) {
        k0.p(s, "calculatedTitle");
        return new CalendarOriginalPeriod(n, s);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CalendarOriginalPeriod)) {
            return false;
        }
        final CalendarOriginalPeriod calendarOriginalPeriod = (CalendarOriginalPeriod)o;
        return this.originalCalendarEntryId == calendarOriginalPeriod.originalCalendarEntryId && k0.g(this.calculatedTitle, calendarOriginalPeriod.calculatedTitle);
    }
    
    @e
    public final String getCalculatedTitle() {
        return this.calculatedTitle;
    }
    
    public final long getOriginalCalendarEntryId() {
        return this.originalCalendarEntryId;
    }
    
    @Override
    public int hashCode() {
        return a.a(this.originalCalendarEntryId) * 31 + this.calculatedTitle.hashCode();
    }
    
    public final void setCalculatedTitle(@e final String calculatedTitle) {
        k0.p(calculatedTitle, "<set-?>");
        this.calculatedTitle = calculatedTitle;
    }
    
    public final void setOriginalCalendarEntryId(final long originalCalendarEntryId) {
        this.originalCalendarEntryId = originalCalendarEntryId;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CalendarOriginalPeriod(originalCalendarEntryId=");
        sb.append(this.originalCalendarEntryId);
        sb.append(", calculatedTitle=");
        sb.append(this.calculatedTitle);
        sb.append(')');
        return sb.toString();
    }
    
    public void writeToParcel(@e final Parcel parcel, final int n) {
        k0.p(parcel, "parcel");
        parcel.writeLong(this.originalCalendarEntryId);
        parcel.writeString(this.calculatedTitle);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r" }, d2 = { "Lcom/untis/mobile/calendar/persistence/model/common/CalendarOriginalPeriod$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/untis/mobile/calendar/persistence/model/common/CalendarOriginalPeriod;", "Landroid/os/Parcel;", "parcel", "createFromParcel", "", "size", "", "newArray", "(I)[Lcom/untis/mobile/calendar/persistence/model/common/CalendarOriginalPeriod;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class CREATOR implements Parcelable$Creator<CalendarOriginalPeriod>
    {
        private CREATOR() {
        }
        
        @e
        public CalendarOriginalPeriod createFromParcel(@e final Parcel parcel) {
            k0.p(parcel, "parcel");
            return new CalendarOriginalPeriod(parcel);
        }
        
        @e
        public CalendarOriginalPeriod[] newArray(final int n) {
            return new CalendarOriginalPeriod[n];
        }
    }
}
