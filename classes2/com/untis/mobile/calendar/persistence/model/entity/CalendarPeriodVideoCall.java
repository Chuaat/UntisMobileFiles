// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.persistence.model.entity;

import android.os.Parcel;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.f;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.e;
import android.os.Parcelable$Creator;
import b7.c;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u001f\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001J\t\u0010\t\u001a\u00020\u0004H\u00d6\u0001J\t\u0010\u000b\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\nH\u00d6\u0001J\u0019\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\nH\u00d6\u0001R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0006\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006 " }, d2 = { "Lcom/untis/mobile/calendar/persistence/model/entity/CalendarPeriodVideoCall;", "Landroid/os/Parcelable;", "", "component1", "", "component2", "isActive", "videoCallUrl", "copy", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/j2;", "writeToParcel", "Z", "()Z", "setActive", "(Z)V", "Ljava/lang/String;", "getVideoCallUrl", "()Ljava/lang/String;", "setVideoCallUrl", "(Ljava/lang/String;)V", "<init>", "(ZLjava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
@c
public final class CalendarPeriodVideoCall implements Parcelable
{
    @e
    public static final Parcelable$Creator<CalendarPeriodVideoCall> CREATOR;
    @SerializedName("isActive")
    private boolean isActive;
    @SerializedName("videoCallUrl")
    @f
    private String videoCallUrl;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public CalendarPeriodVideoCall() {
        this(false, null, 3, null);
    }
    
    public CalendarPeriodVideoCall(final boolean isActive, @f final String videoCallUrl) {
        this.isActive = isActive;
        this.videoCallUrl = videoCallUrl;
    }
    
    public final boolean component1() {
        return this.isActive;
    }
    
    @f
    public final String component2() {
        return this.videoCallUrl;
    }
    
    @e
    public final CalendarPeriodVideoCall copy(final boolean b, @f final String s) {
        return new CalendarPeriodVideoCall(b, s);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CalendarPeriodVideoCall)) {
            return false;
        }
        final CalendarPeriodVideoCall calendarPeriodVideoCall = (CalendarPeriodVideoCall)o;
        return this.isActive == calendarPeriodVideoCall.isActive && k0.g(this.videoCallUrl, calendarPeriodVideoCall.videoCallUrl);
    }
    
    @f
    public final String getVideoCallUrl() {
        return this.videoCallUrl;
    }
    
    @Override
    public int hashCode() {
        int isActive;
        if ((isActive = (this.isActive ? 1 : 0)) != 0) {
            isActive = 1;
        }
        final String videoCallUrl = this.videoCallUrl;
        int hashCode;
        if (videoCallUrl == null) {
            hashCode = 0;
        }
        else {
            hashCode = videoCallUrl.hashCode();
        }
        return isActive * 31 + hashCode;
    }
    
    public final boolean isActive() {
        return this.isActive;
    }
    
    public final void setActive(final boolean isActive) {
        this.isActive = isActive;
    }
    
    public final void setVideoCallUrl(@f final String videoCallUrl) {
        this.videoCallUrl = videoCallUrl;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CalendarPeriodVideoCall(isActive=");
        sb.append(this.isActive);
        sb.append(", videoCallUrl=");
        sb.append((Object)this.videoCallUrl);
        sb.append(')');
        return sb.toString();
    }
    
    public void writeToParcel(@e final Parcel parcel, final int n) {
        k0.p(parcel, "out");
        parcel.writeInt((int)(this.isActive ? 1 : 0));
        parcel.writeString(this.videoCallUrl);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = {}, d2 = {}, k = 3, mv = { 1, 5, 1 })
    public static final class Creator implements Parcelable$Creator<CalendarPeriodVideoCall>
    {
        @e
        public final CalendarPeriodVideoCall createFromParcel(@e final Parcel parcel) {
            k0.p(parcel, "parcel");
            return new CalendarPeriodVideoCall(parcel.readInt() != 0, parcel.readString());
        }
        
        @e
        public final CalendarPeriodVideoCall[] newArray(final int n) {
            return new CalendarPeriodVideoCall[n];
        }
    }
}
