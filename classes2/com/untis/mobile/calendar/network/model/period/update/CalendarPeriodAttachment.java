// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.network.model.period.update;

import android.os.Parcelable$Creator;
import org.jetbrains.annotations.f;
import com.untis.mobile.utils.extension.j;
import kotlin.jvm.internal.k0;
import android.os.Parcel;
import kotlin.jvm.internal.w;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u0000 #2\u00020\u0001:\u0001#B\u001f\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b \u0010!B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b \u0010\"J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\t\u0010\u000b\u001a\u00020\tH\u00c6\u0003J\t\u0010\f\u001a\u00020\tH\u00c6\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\tH\u00c6\u0001J\t\u0010\u0011\u001a\u00020\tH\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0004H\u00d6\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003R\"\u0010\u000e\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\r\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\"\u0010\u000f\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001b¨\u0006$" }, d2 = { "Lcom/untis/mobile/calendar/network/model/period/update/CalendarPeriodAttachment;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/j2;", "writeToParcel", "describeContents", "", "component1", "component2", "component3", "downloadUrl", "id", "name", "copy", "toString", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getDownloadUrl", "setDownloadUrl", "getName", "setName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "(Landroid/os/Parcel;)V", "CREATOR", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class CalendarPeriodAttachment implements Parcelable
{
    @e
    public static final CREATOR CREATOR;
    @SerializedName("downloadUrl")
    @e
    private String downloadUrl;
    @SerializedName("id")
    @e
    private String id;
    @SerializedName("name")
    @e
    private String name;
    
    static {
        CREATOR = new CREATOR(null);
    }
    
    public CalendarPeriodAttachment(@e final Parcel parcel) {
        k0.p(parcel, "parcel");
        this(j.h(parcel), j.h(parcel), j.h(parcel));
    }
    
    public CalendarPeriodAttachment(@e final String downloadUrl, @e final String id, @e final String name) {
        k0.p(downloadUrl, "downloadUrl");
        k0.p(id, "id");
        k0.p(name, "name");
        this.downloadUrl = downloadUrl;
        this.id = id;
        this.name = name;
    }
    
    @e
    public final String component1() {
        return this.downloadUrl;
    }
    
    @e
    public final String component2() {
        return this.id;
    }
    
    @e
    public final String component3() {
        return this.name;
    }
    
    @e
    public final CalendarPeriodAttachment copy(@e final String s, @e final String s2, @e final String s3) {
        k0.p(s, "downloadUrl");
        k0.p(s2, "id");
        k0.p(s3, "name");
        return new CalendarPeriodAttachment(s, s2, s3);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CalendarPeriodAttachment)) {
            return false;
        }
        final CalendarPeriodAttachment calendarPeriodAttachment = (CalendarPeriodAttachment)o;
        return k0.g(this.downloadUrl, calendarPeriodAttachment.downloadUrl) && k0.g(this.id, calendarPeriodAttachment.id) && k0.g(this.name, calendarPeriodAttachment.name);
    }
    
    @e
    public final String getDownloadUrl() {
        return this.downloadUrl;
    }
    
    @e
    public final String getId() {
        return this.id;
    }
    
    @e
    public final String getName() {
        return this.name;
    }
    
    @Override
    public int hashCode() {
        return (this.downloadUrl.hashCode() * 31 + this.id.hashCode()) * 31 + this.name.hashCode();
    }
    
    public final void setDownloadUrl(@e final String downloadUrl) {
        k0.p(downloadUrl, "<set-?>");
        this.downloadUrl = downloadUrl;
    }
    
    public final void setId(@e final String id) {
        k0.p(id, "<set-?>");
        this.id = id;
    }
    
    public final void setName(@e final String name) {
        k0.p(name, "<set-?>");
        this.name = name;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CalendarPeriodAttachment(downloadUrl=");
        sb.append(this.downloadUrl);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(')');
        return sb.toString();
    }
    
    public void writeToParcel(@e final Parcel parcel, final int n) {
        k0.p(parcel, "parcel");
        parcel.writeString(this.downloadUrl);
        parcel.writeString(this.id);
        parcel.writeString(this.name);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r" }, d2 = { "Lcom/untis/mobile/calendar/network/model/period/update/CalendarPeriodAttachment$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/untis/mobile/calendar/network/model/period/update/CalendarPeriodAttachment;", "Landroid/os/Parcel;", "parcel", "createFromParcel", "", "size", "", "newArray", "(I)[Lcom/untis/mobile/calendar/network/model/period/update/CalendarPeriodAttachment;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class CREATOR implements Parcelable$Creator<CalendarPeriodAttachment>
    {
        private CREATOR() {
        }
        
        @e
        public CalendarPeriodAttachment createFromParcel(@e final Parcel parcel) {
            k0.p(parcel, "parcel");
            return new CalendarPeriodAttachment(parcel);
        }
        
        @e
        public CalendarPeriodAttachment[] newArray(final int n) {
            return new CalendarPeriodAttachment[n];
        }
    }
}
