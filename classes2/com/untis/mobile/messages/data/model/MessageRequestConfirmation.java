// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.data.model;

import java.io.Serializable;
import android.os.Parcel;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.f;
import com.untis.mobile.utils.jsonadapter.h;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.e;
import android.os.Parcelable$Creator;
import b7.c;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b2\u00103J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010\t\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0002H\u00c6\u0003JK\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0002H\u00c6\u0001J\t\u0010\u0012\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0013H\u00d6\u0001J\u0013\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0013H\u00d6\u0001J\u0019\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0013H\u00d6\u0001R\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b\u0010\u0010\u001f\"\u0004\b \u0010!R\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010!R$\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b.\u0010\u001f\"\u0004\b/\u0010!R$\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010$\u001a\u0004\b0\u0010&\"\u0004\b1\u0010(¨\u00064" }, d2 = { "Lcom/untis/mobile/messages/data/model/MessageRequestConfirmation;", "Landroid/os/Parcelable;", "", "component1", "Lorg/joda/time/c;", "component2", "", "component3", "component4", "component5", "component6", "allowSendRequestConfirmation", "confirmationDate", "confirmerUserDisplayName", "confirmerUserId", "allowMessageDeletion", "isReplyAllowed", "copy", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/j2;", "writeToParcel", "Z", "()Z", "setReplyAllowed", "(Z)V", "getAllowMessageDeletion", "setAllowMessageDeletion", "Ljava/lang/String;", "getConfirmerUserId", "()Ljava/lang/String;", "setConfirmerUserId", "(Ljava/lang/String;)V", "Lorg/joda/time/c;", "getConfirmationDate", "()Lorg/joda/time/c;", "setConfirmationDate", "(Lorg/joda/time/c;)V", "getAllowSendRequestConfirmation", "setAllowSendRequestConfirmation", "getConfirmerUserDisplayName", "setConfirmerUserDisplayName", "<init>", "(ZLorg/joda/time/c;Ljava/lang/String;Ljava/lang/String;ZZ)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
@c
public final class MessageRequestConfirmation implements Parcelable
{
    @e
    public static final Parcelable$Creator<MessageRequestConfirmation> CREATOR;
    @SerializedName("allowMessageDeletion")
    private boolean allowMessageDeletion;
    @SerializedName("allowSendRequestConfirmation")
    private boolean allowSendRequestConfirmation;
    @JsonAdapter(h.class)
    @SerializedName("confirmationDate")
    @f
    private org.joda.time.c confirmationDate;
    @SerializedName("confirmerUserDisplayName")
    @f
    private String confirmerUserDisplayName;
    @SerializedName("confirmerUserId")
    @f
    private String confirmerUserId;
    @SerializedName("isReplyAllowed")
    private boolean isReplyAllowed;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public MessageRequestConfirmation(final boolean allowSendRequestConfirmation, @f final org.joda.time.c confirmationDate, @f final String confirmerUserDisplayName, @f final String confirmerUserId, final boolean allowMessageDeletion, final boolean isReplyAllowed) {
        this.allowSendRequestConfirmation = allowSendRequestConfirmation;
        this.confirmationDate = confirmationDate;
        this.confirmerUserDisplayName = confirmerUserDisplayName;
        this.confirmerUserId = confirmerUserId;
        this.allowMessageDeletion = allowMessageDeletion;
        this.isReplyAllowed = isReplyAllowed;
    }
    
    public final boolean component1() {
        return this.allowSendRequestConfirmation;
    }
    
    @f
    public final org.joda.time.c component2() {
        return this.confirmationDate;
    }
    
    @f
    public final String component3() {
        return this.confirmerUserDisplayName;
    }
    
    @f
    public final String component4() {
        return this.confirmerUserId;
    }
    
    public final boolean component5() {
        return this.allowMessageDeletion;
    }
    
    public final boolean component6() {
        return this.isReplyAllowed;
    }
    
    @e
    public final MessageRequestConfirmation copy(final boolean b, @f final org.joda.time.c c, @f final String s, @f final String s2, final boolean b2, final boolean b3) {
        return new MessageRequestConfirmation(b, c, s, s2, b2, b3);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MessageRequestConfirmation)) {
            return false;
        }
        final MessageRequestConfirmation messageRequestConfirmation = (MessageRequestConfirmation)o;
        return this.allowSendRequestConfirmation == messageRequestConfirmation.allowSendRequestConfirmation && k0.g(this.confirmationDate, messageRequestConfirmation.confirmationDate) && k0.g(this.confirmerUserDisplayName, messageRequestConfirmation.confirmerUserDisplayName) && k0.g(this.confirmerUserId, messageRequestConfirmation.confirmerUserId) && this.allowMessageDeletion == messageRequestConfirmation.allowMessageDeletion && this.isReplyAllowed == messageRequestConfirmation.isReplyAllowed;
    }
    
    public final boolean getAllowMessageDeletion() {
        return this.allowMessageDeletion;
    }
    
    public final boolean getAllowSendRequestConfirmation() {
        return this.allowSendRequestConfirmation;
    }
    
    @f
    public final org.joda.time.c getConfirmationDate() {
        return this.confirmationDate;
    }
    
    @f
    public final String getConfirmerUserDisplayName() {
        return this.confirmerUserDisplayName;
    }
    
    @f
    public final String getConfirmerUserId() {
        return this.confirmerUserId;
    }
    
    @Override
    public int hashCode() {
        final int allowSendRequestConfirmation = this.allowSendRequestConfirmation ? 1 : 0;
        int n = 1;
        int n2 = allowSendRequestConfirmation;
        if (allowSendRequestConfirmation != 0) {
            n2 = 1;
        }
        final org.joda.time.c confirmationDate = this.confirmationDate;
        int hashCode = 0;
        int hashCode2;
        if (confirmationDate == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = ((org.joda.time.base.c)confirmationDate).hashCode();
        }
        final String confirmerUserDisplayName = this.confirmerUserDisplayName;
        int hashCode3;
        if (confirmerUserDisplayName == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = confirmerUserDisplayName.hashCode();
        }
        final String confirmerUserId = this.confirmerUserId;
        if (confirmerUserId != null) {
            hashCode = confirmerUserId.hashCode();
        }
        int allowMessageDeletion;
        if ((allowMessageDeletion = (this.allowMessageDeletion ? 1 : 0)) != 0) {
            allowMessageDeletion = 1;
        }
        final int isReplyAllowed = this.isReplyAllowed ? 1 : 0;
        if (isReplyAllowed == 0) {
            n = isReplyAllowed;
        }
        return ((((n2 * 31 + hashCode2) * 31 + hashCode3) * 31 + hashCode) * 31 + allowMessageDeletion) * 31 + n;
    }
    
    public final boolean isReplyAllowed() {
        return this.isReplyAllowed;
    }
    
    public final void setAllowMessageDeletion(final boolean allowMessageDeletion) {
        this.allowMessageDeletion = allowMessageDeletion;
    }
    
    public final void setAllowSendRequestConfirmation(final boolean allowSendRequestConfirmation) {
        this.allowSendRequestConfirmation = allowSendRequestConfirmation;
    }
    
    public final void setConfirmationDate(@f final org.joda.time.c confirmationDate) {
        this.confirmationDate = confirmationDate;
    }
    
    public final void setConfirmerUserDisplayName(@f final String confirmerUserDisplayName) {
        this.confirmerUserDisplayName = confirmerUserDisplayName;
    }
    
    public final void setConfirmerUserId(@f final String confirmerUserId) {
        this.confirmerUserId = confirmerUserId;
    }
    
    public final void setReplyAllowed(final boolean isReplyAllowed) {
        this.isReplyAllowed = isReplyAllowed;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("MessageRequestConfirmation(allowSendRequestConfirmation=");
        sb.append(this.allowSendRequestConfirmation);
        sb.append(", confirmationDate=");
        sb.append(this.confirmationDate);
        sb.append(", confirmerUserDisplayName=");
        sb.append((Object)this.confirmerUserDisplayName);
        sb.append(", confirmerUserId=");
        sb.append((Object)this.confirmerUserId);
        sb.append(", allowMessageDeletion=");
        sb.append(this.allowMessageDeletion);
        sb.append(", isReplyAllowed=");
        sb.append(this.isReplyAllowed);
        sb.append(')');
        return sb.toString();
    }
    
    public void writeToParcel(@e final Parcel parcel, final int n) {
        k0.p(parcel, "out");
        parcel.writeInt((int)(this.allowSendRequestConfirmation ? 1 : 0));
        parcel.writeSerializable((Serializable)this.confirmationDate);
        parcel.writeString(this.confirmerUserDisplayName);
        parcel.writeString(this.confirmerUserId);
        parcel.writeInt((int)(this.allowMessageDeletion ? 1 : 0));
        parcel.writeInt((int)(this.isReplyAllowed ? 1 : 0));
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = {}, d2 = {}, k = 3, mv = { 1, 5, 1 })
    public static final class Creator implements Parcelable$Creator<MessageRequestConfirmation>
    {
        @e
        public final MessageRequestConfirmation createFromParcel(@e final Parcel parcel) {
            k0.p(parcel, "parcel");
            return new MessageRequestConfirmation(parcel.readInt() != 0, (org.joda.time.c)parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }
        
        @e
        public final MessageRequestConfirmation[] newArray(final int n) {
            return new MessageRequestConfirmation[n];
        }
    }
}
