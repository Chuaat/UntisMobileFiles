// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.data.model;

import java.io.Serializable;
import android.os.Parcel;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import com.google.gson.annotations.SerializedName;
import com.untis.mobile.utils.jsonadapter.h;
import com.google.gson.annotations.JsonAdapter;
import org.jetbrains.annotations.e;
import android.os.Parcelable$Creator;
import b7.c;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b)\u0010*J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003¢\u0006\u0004\b\u0007\u0010\bJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u000e\u001a\u00020\u0004H\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u000fH\u00d6\u0001J\u0019\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000fH\u00d6\u0001R$\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\b\"\u0004\b\"\u0010#R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006+" }, d2 = { "Lcom/untis/mobile/messages/data/model/ReadConfirmationState;", "Landroid/os/Parcelable;", "Lorg/joda/time/c;", "component1", "", "component2", "", "component3", "()Ljava/lang/Long;", "date", "userDisplayName", "userId", "copy", "(Lorg/joda/time/c;Ljava/lang/String;Ljava/lang/Long;)Lcom/untis/mobile/messages/data/model/ReadConfirmationState;", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/j2;", "writeToParcel", "Ljava/lang/String;", "getUserDisplayName", "()Ljava/lang/String;", "setUserDisplayName", "(Ljava/lang/String;)V", "Ljava/lang/Long;", "getUserId", "setUserId", "(Ljava/lang/Long;)V", "Lorg/joda/time/c;", "getDate", "()Lorg/joda/time/c;", "setDate", "(Lorg/joda/time/c;)V", "<init>", "(Lorg/joda/time/c;Ljava/lang/String;Ljava/lang/Long;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
@c
public final class ReadConfirmationState implements Parcelable
{
    @e
    public static final Parcelable$Creator<ReadConfirmationState> CREATOR;
    @JsonAdapter(h.class)
    @SerializedName("date")
    @f
    private org.joda.time.c date;
    @SerializedName("userDisplayName")
    @f
    private String userDisplayName;
    @SerializedName("userId")
    @f
    private Long userId;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public ReadConfirmationState(@f final org.joda.time.c date, @f final String userDisplayName, @f final Long userId) {
        this.date = date;
        this.userDisplayName = userDisplayName;
        this.userId = userId;
    }
    
    @f
    public final org.joda.time.c component1() {
        return this.date;
    }
    
    @f
    public final String component2() {
        return this.userDisplayName;
    }
    
    @f
    public final Long component3() {
        return this.userId;
    }
    
    @e
    public final ReadConfirmationState copy(@f final org.joda.time.c c, @f final String s, @f final Long n) {
        return new ReadConfirmationState(c, s, n);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ReadConfirmationState)) {
            return false;
        }
        final ReadConfirmationState readConfirmationState = (ReadConfirmationState)o;
        return k0.g(this.date, readConfirmationState.date) && k0.g(this.userDisplayName, readConfirmationState.userDisplayName) && k0.g(this.userId, readConfirmationState.userId);
    }
    
    @f
    public final org.joda.time.c getDate() {
        return this.date;
    }
    
    @f
    public final String getUserDisplayName() {
        return this.userDisplayName;
    }
    
    @f
    public final Long getUserId() {
        return this.userId;
    }
    
    @Override
    public int hashCode() {
        final org.joda.time.c date = this.date;
        int hashCode = 0;
        int hashCode2;
        if (date == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = ((org.joda.time.base.c)date).hashCode();
        }
        final String userDisplayName = this.userDisplayName;
        int hashCode3;
        if (userDisplayName == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = userDisplayName.hashCode();
        }
        final Long userId = this.userId;
        if (userId != null) {
            hashCode = userId.hashCode();
        }
        return (hashCode2 * 31 + hashCode3) * 31 + hashCode;
    }
    
    public final void setDate(@f final org.joda.time.c date) {
        this.date = date;
    }
    
    public final void setUserDisplayName(@f final String userDisplayName) {
        this.userDisplayName = userDisplayName;
    }
    
    public final void setUserId(@f final Long userId) {
        this.userId = userId;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ReadConfirmationState(date=");
        sb.append(this.date);
        sb.append(", userDisplayName=");
        sb.append((Object)this.userDisplayName);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(')');
        return sb.toString();
    }
    
    public void writeToParcel(@e final Parcel parcel, final int n) {
        k0.p(parcel, "out");
        parcel.writeSerializable((Serializable)this.date);
        parcel.writeString(this.userDisplayName);
        final Long userId = this.userId;
        if (userId == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            parcel.writeLong((long)userId);
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = {}, d2 = {}, k = 3, mv = { 1, 5, 1 })
    public static final class Creator implements Parcelable$Creator<ReadConfirmationState>
    {
        @e
        public final ReadConfirmationState createFromParcel(@e final Parcel parcel) {
            k0.p(parcel, "parcel");
            final org.joda.time.c c = (org.joda.time.c)parcel.readSerializable();
            final String string = parcel.readString();
            Long value;
            if (parcel.readInt() == 0) {
                value = null;
            }
            else {
                value = parcel.readLong();
            }
            return new ReadConfirmationState(c, string, value);
        }
        
        @e
        public final ReadConfirmationState[] newArray(final int n) {
            return new ReadConfirmationState[n];
        }
    }
}
