// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.network.model;

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

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u0000 '2\u00020\u0001:\u0001'B'\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b$\u0010%B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b$\u0010&J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\t\u0010\u000b\u001a\u00020\tH\u00c6\u0003J\t\u0010\f\u001a\u00020\tH\u00c6\u0003J\t\u0010\r\u001a\u00020\tH\u00c6\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\tH\u00c6\u0001J\t\u0010\u0013\u001a\u00020\tH\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0004H\u00d6\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u0011\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0019\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR\"\u0010\u000e\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR\"\u0010\u000f\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001d¨\u0006(" }, d2 = { "Lcom/untis/mobile/calendar/network/model/CalendarApiError;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/j2;", "writeToParcel", "describeContents", "", "component1", "component2", "component3", "component4", "errorCode", "errorMessage", "requestId", "traceId", "copy", "toString", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getRequestId", "()Ljava/lang/String;", "setRequestId", "(Ljava/lang/String;)V", "getTraceId", "setTraceId", "getErrorCode", "setErrorCode", "getErrorMessage", "setErrorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "(Landroid/os/Parcel;)V", "CREATOR", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class CalendarApiError implements Parcelable
{
    @e
    public static final CREATOR CREATOR;
    @SerializedName("errorCode")
    @e
    private String errorCode;
    @SerializedName("errorMessage")
    @e
    private String errorMessage;
    @SerializedName("requestId")
    @e
    private String requestId;
    @SerializedName("traceId")
    @e
    private String traceId;
    
    static {
        CREATOR = new CREATOR(null);
    }
    
    public CalendarApiError(@e final Parcel parcel) {
        k0.p(parcel, "parcel");
        this(j.h(parcel), j.h(parcel), j.h(parcel), j.h(parcel));
    }
    
    public CalendarApiError(@e final String errorCode, @e final String errorMessage, @e final String requestId, @e final String traceId) {
        k0.p(errorCode, "errorCode");
        k0.p(errorMessage, "errorMessage");
        k0.p(requestId, "requestId");
        k0.p(traceId, "traceId");
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.requestId = requestId;
        this.traceId = traceId;
    }
    
    @e
    public final String component1() {
        return this.errorCode;
    }
    
    @e
    public final String component2() {
        return this.errorMessage;
    }
    
    @e
    public final String component3() {
        return this.requestId;
    }
    
    @e
    public final String component4() {
        return this.traceId;
    }
    
    @e
    public final CalendarApiError copy(@e final String s, @e final String s2, @e final String s3, @e final String s4) {
        k0.p(s, "errorCode");
        k0.p(s2, "errorMessage");
        k0.p(s3, "requestId");
        k0.p(s4, "traceId");
        return new CalendarApiError(s, s2, s3, s4);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CalendarApiError)) {
            return false;
        }
        final CalendarApiError calendarApiError = (CalendarApiError)o;
        return k0.g(this.errorCode, calendarApiError.errorCode) && k0.g(this.errorMessage, calendarApiError.errorMessage) && k0.g(this.requestId, calendarApiError.requestId) && k0.g(this.traceId, calendarApiError.traceId);
    }
    
    @e
    public final String getErrorCode() {
        return this.errorCode;
    }
    
    @e
    public final String getErrorMessage() {
        return this.errorMessage;
    }
    
    @e
    public final String getRequestId() {
        return this.requestId;
    }
    
    @e
    public final String getTraceId() {
        return this.traceId;
    }
    
    @Override
    public int hashCode() {
        return ((this.errorCode.hashCode() * 31 + this.errorMessage.hashCode()) * 31 + this.requestId.hashCode()) * 31 + this.traceId.hashCode();
    }
    
    public final void setErrorCode(@e final String errorCode) {
        k0.p(errorCode, "<set-?>");
        this.errorCode = errorCode;
    }
    
    public final void setErrorMessage(@e final String errorMessage) {
        k0.p(errorMessage, "<set-?>");
        this.errorMessage = errorMessage;
    }
    
    public final void setRequestId(@e final String requestId) {
        k0.p(requestId, "<set-?>");
        this.requestId = requestId;
    }
    
    public final void setTraceId(@e final String traceId) {
        k0.p(traceId, "<set-?>");
        this.traceId = traceId;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CalendarApiError(errorCode=");
        sb.append(this.errorCode);
        sb.append(", errorMessage=");
        sb.append(this.errorMessage);
        sb.append(", requestId=");
        sb.append(this.requestId);
        sb.append(", traceId=");
        sb.append(this.traceId);
        sb.append(')');
        return sb.toString();
    }
    
    public void writeToParcel(@e final Parcel parcel, final int n) {
        k0.p(parcel, "parcel");
        parcel.writeString(this.errorCode);
        parcel.writeString(this.errorMessage);
        parcel.writeString(this.requestId);
        parcel.writeString(this.traceId);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r" }, d2 = { "Lcom/untis/mobile/calendar/network/model/CalendarApiError$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/untis/mobile/calendar/network/model/CalendarApiError;", "Landroid/os/Parcel;", "parcel", "createFromParcel", "", "size", "", "newArray", "(I)[Lcom/untis/mobile/calendar/network/model/CalendarApiError;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class CREATOR implements Parcelable$Creator<CalendarApiError>
    {
        private CREATOR() {
        }
        
        @e
        public CalendarApiError createFromParcel(@e final Parcel parcel) {
            k0.p(parcel, "parcel");
            return new CalendarApiError(parcel);
        }
        
        @e
        public CalendarApiError[] newArray(final int n) {
            return new CalendarApiError[n];
        }
    }
}
