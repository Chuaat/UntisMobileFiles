// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.data.model;

import java.util.ArrayList;
import java.util.Iterator;
import android.os.Parcel;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.jetbrains.annotations.e;
import android.os.Parcelable$Creator;
import b7.c;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b.\u0010/J\u0011\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0012\u0010\t\u001a\u0004\u0018\u00010\bH\u00c6\u0003¢\u0006\u0004\b\t\u0010\nJF\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\bH\u00c6\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0011\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0012H\u00d6\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0012H\u00d6\u0001J\u0019\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0012H\u00d6\u0001R$\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001e\u001a\u0004\b(\u0010 \"\u0004\b)\u0010\"R$\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010*\u001a\u0004\b+\u0010\n\"\u0004\b,\u0010-¨\u00060" }, d2 = { "Lcom/untis/mobile/messages/data/model/ReadConfirmationStatus;", "Landroid/os/Parcelable;", "", "Lcom/untis/mobile/messages/data/model/ReadConfirmationState;", "component1", "", "component2", "component3", "", "component4", "()Ljava/lang/Long;", "readConfirmationStates", "recipientClassName", "recipientDisplayName", "recipientId", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/untis/mobile/messages/data/model/ReadConfirmationStatus;", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/j2;", "writeToParcel", "Ljava/lang/String;", "getRecipientClassName", "()Ljava/lang/String;", "setRecipientClassName", "(Ljava/lang/String;)V", "Ljava/util/List;", "getReadConfirmationStates", "()Ljava/util/List;", "setReadConfirmationStates", "(Ljava/util/List;)V", "getRecipientDisplayName", "setRecipientDisplayName", "Ljava/lang/Long;", "getRecipientId", "setRecipientId", "(Ljava/lang/Long;)V", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
@c
public final class ReadConfirmationStatus implements Parcelable
{
    @e
    public static final Parcelable$Creator<ReadConfirmationStatus> CREATOR;
    @SerializedName("confirmationStates")
    @f
    private List<ReadConfirmationState> readConfirmationStates;
    @SerializedName("recipientClassName")
    @f
    private String recipientClassName;
    @SerializedName("recipientDisplayName")
    @f
    private String recipientDisplayName;
    @SerializedName("recipientId")
    @f
    private Long recipientId;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public ReadConfirmationStatus(@f final List<ReadConfirmationState> readConfirmationStates, @f final String recipientClassName, @f final String recipientDisplayName, @f final Long recipientId) {
        this.readConfirmationStates = readConfirmationStates;
        this.recipientClassName = recipientClassName;
        this.recipientDisplayName = recipientDisplayName;
        this.recipientId = recipientId;
    }
    
    @f
    public final List<ReadConfirmationState> component1() {
        return this.readConfirmationStates;
    }
    
    @f
    public final String component2() {
        return this.recipientClassName;
    }
    
    @f
    public final String component3() {
        return this.recipientDisplayName;
    }
    
    @f
    public final Long component4() {
        return this.recipientId;
    }
    
    @e
    public final ReadConfirmationStatus copy(@f final List<ReadConfirmationState> list, @f final String s, @f final String s2, @f final Long n) {
        return new ReadConfirmationStatus(list, s, s2, n);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ReadConfirmationStatus)) {
            return false;
        }
        final ReadConfirmationStatus readConfirmationStatus = (ReadConfirmationStatus)o;
        return k0.g(this.readConfirmationStates, readConfirmationStatus.readConfirmationStates) && k0.g(this.recipientClassName, readConfirmationStatus.recipientClassName) && k0.g(this.recipientDisplayName, readConfirmationStatus.recipientDisplayName) && k0.g(this.recipientId, readConfirmationStatus.recipientId);
    }
    
    @f
    public final List<ReadConfirmationState> getReadConfirmationStates() {
        return this.readConfirmationStates;
    }
    
    @f
    public final String getRecipientClassName() {
        return this.recipientClassName;
    }
    
    @f
    public final String getRecipientDisplayName() {
        return this.recipientDisplayName;
    }
    
    @f
    public final Long getRecipientId() {
        return this.recipientId;
    }
    
    @Override
    public int hashCode() {
        final List<ReadConfirmationState> readConfirmationStates = this.readConfirmationStates;
        int hashCode = 0;
        int hashCode2;
        if (readConfirmationStates == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = readConfirmationStates.hashCode();
        }
        final String recipientClassName = this.recipientClassName;
        int hashCode3;
        if (recipientClassName == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = recipientClassName.hashCode();
        }
        final String recipientDisplayName = this.recipientDisplayName;
        int hashCode4;
        if (recipientDisplayName == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = recipientDisplayName.hashCode();
        }
        final Long recipientId = this.recipientId;
        if (recipientId != null) {
            hashCode = recipientId.hashCode();
        }
        return ((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode;
    }
    
    public final void setReadConfirmationStates(@f final List<ReadConfirmationState> readConfirmationStates) {
        this.readConfirmationStates = readConfirmationStates;
    }
    
    public final void setRecipientClassName(@f final String recipientClassName) {
        this.recipientClassName = recipientClassName;
    }
    
    public final void setRecipientDisplayName(@f final String recipientDisplayName) {
        this.recipientDisplayName = recipientDisplayName;
    }
    
    public final void setRecipientId(@f final Long recipientId) {
        this.recipientId = recipientId;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ReadConfirmationStatus(readConfirmationStates=");
        sb.append(this.readConfirmationStates);
        sb.append(", recipientClassName=");
        sb.append((Object)this.recipientClassName);
        sb.append(", recipientDisplayName=");
        sb.append((Object)this.recipientDisplayName);
        sb.append(", recipientId=");
        sb.append(this.recipientId);
        sb.append(')');
        return sb.toString();
    }
    
    public void writeToParcel(@e final Parcel parcel, final int n) {
        k0.p(parcel, "out");
        final List<ReadConfirmationState> readConfirmationStates = this.readConfirmationStates;
        if (readConfirmationStates == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            parcel.writeInt(readConfirmationStates.size());
            final Iterator<ReadConfirmationState> iterator = readConfirmationStates.iterator();
            while (iterator.hasNext()) {
                iterator.next().writeToParcel(parcel, n);
            }
        }
        parcel.writeString(this.recipientClassName);
        parcel.writeString(this.recipientDisplayName);
        final Long recipientId = this.recipientId;
        if (recipientId == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            parcel.writeLong((long)recipientId);
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = {}, d2 = {}, k = 3, mv = { 1, 5, 1 })
    public static final class Creator implements Parcelable$Creator<ReadConfirmationStatus>
    {
        @e
        public final ReadConfirmationStatus createFromParcel(@e final Parcel parcel) {
            k0.p(parcel, "parcel");
            final int int1 = parcel.readInt();
            final Long n = null;
            List<ReadConfirmationState> list;
            if (int1 == 0) {
                list = null;
            }
            else {
                final int int2 = parcel.readInt();
                final ArrayList list2 = new ArrayList<ReadConfirmationState>(int2);
                int n2 = 0;
                while (true) {
                    list = (List<ReadConfirmationState>)list2;
                    if (n2 == int2) {
                        break;
                    }
                    list2.add((ReadConfirmationState)ReadConfirmationState.CREATOR.createFromParcel(parcel));
                    ++n2;
                }
            }
            final String string = parcel.readString();
            final String string2 = parcel.readString();
            Long value;
            if (parcel.readInt() == 0) {
                value = n;
            }
            else {
                value = parcel.readLong();
            }
            return new ReadConfirmationStatus(list, string, string2, value);
        }
        
        @e
        public final ReadConfirmationStatus[] newArray(final int n) {
            return new ReadConfirmationStatus[n];
        }
    }
}
