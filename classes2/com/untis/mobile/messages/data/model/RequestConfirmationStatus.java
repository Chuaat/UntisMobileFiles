// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.data.model;

import kotlin.jvm.internal.k0;
import android.os.Parcel;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.w;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.e;
import android.os.Parcelable$Creator;
import b7.c;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0004\u001a\u00020\u0002H\u00c6\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002H\u00c6\u0001J\t\u0010\t\u001a\u00020\bH\u00d6\u0001J\t\u0010\n\u001a\u00020\u0002H\u00d6\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0002H\u00d6\u0001J\u0019\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0002H\u00d6\u0001R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019¨\u0006\u001e" }, d2 = { "Lcom/untis/mobile/messages/data/model/RequestConfirmationStatus;", "Landroid/os/Parcelable;", "", "component1", "component2", "confirmedRequestCount", "totalRequestCount", "copy", "", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/j2;", "writeToParcel", "I", "getTotalRequestCount", "()I", "setTotalRequestCount", "(I)V", "getConfirmedRequestCount", "setConfirmedRequestCount", "<init>", "(II)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
@c
public final class RequestConfirmationStatus implements Parcelable
{
    @e
    public static final Parcelable$Creator<RequestConfirmationStatus> CREATOR;
    @SerializedName("confirmedRequestCount")
    private int confirmedRequestCount;
    @SerializedName("totalRequestCount")
    private int totalRequestCount;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public RequestConfirmationStatus() {
        this(0, 0, 3, null);
    }
    
    public RequestConfirmationStatus(final int confirmedRequestCount, final int totalRequestCount) {
        this.confirmedRequestCount = confirmedRequestCount;
        this.totalRequestCount = totalRequestCount;
    }
    
    public final int component1() {
        return this.confirmedRequestCount;
    }
    
    public final int component2() {
        return this.totalRequestCount;
    }
    
    @e
    public final RequestConfirmationStatus copy(final int n, final int n2) {
        return new RequestConfirmationStatus(n, n2);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RequestConfirmationStatus)) {
            return false;
        }
        final RequestConfirmationStatus requestConfirmationStatus = (RequestConfirmationStatus)o;
        return this.confirmedRequestCount == requestConfirmationStatus.confirmedRequestCount && this.totalRequestCount == requestConfirmationStatus.totalRequestCount;
    }
    
    public final int getConfirmedRequestCount() {
        return this.confirmedRequestCount;
    }
    
    public final int getTotalRequestCount() {
        return this.totalRequestCount;
    }
    
    @Override
    public int hashCode() {
        return this.confirmedRequestCount * 31 + this.totalRequestCount;
    }
    
    public final void setConfirmedRequestCount(final int confirmedRequestCount) {
        this.confirmedRequestCount = confirmedRequestCount;
    }
    
    public final void setTotalRequestCount(final int totalRequestCount) {
        this.totalRequestCount = totalRequestCount;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("RequestConfirmationStatus(confirmedRequestCount=");
        sb.append(this.confirmedRequestCount);
        sb.append(", totalRequestCount=");
        sb.append(this.totalRequestCount);
        sb.append(')');
        return sb.toString();
    }
    
    public void writeToParcel(@e final Parcel parcel, final int n) {
        k0.p(parcel, "out");
        parcel.writeInt(this.confirmedRequestCount);
        parcel.writeInt(this.totalRequestCount);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = {}, d2 = {}, k = 3, mv = { 1, 5, 1 })
    public static final class Creator implements Parcelable$Creator<RequestConfirmationStatus>
    {
        @e
        public final RequestConfirmationStatus createFromParcel(@e final Parcel parcel) {
            k0.p(parcel, "parcel");
            return new RequestConfirmationStatus(parcel.readInt(), parcel.readInt());
        }
        
        @e
        public final RequestConfirmationStatus[] newArray(final int n) {
            return new RequestConfirmationStatus[n];
        }
    }
}
