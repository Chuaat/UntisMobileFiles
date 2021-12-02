// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.data.model;

import android.os.Parcel;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.e;
import android.os.Parcelable$Creator;
import b7.c;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b$\u0010%J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J7\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001J\t\u0010\f\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\u000e\u001a\u00020\rH\u00d6\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0013\u001a\u00020\rH\u00d6\u0001J\u0019\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\rH\u00d6\u0001R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0019\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001d¨\u0006&" }, d2 = { "Lcom/untis/mobile/messages/data/model/Sender;", "Landroid/os/Parcelable;", "", "component1", "component2", "component3", "component4", "displayName", "imageUrl", "userId", "className", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/j2;", "writeToParcel", "Ljava/lang/String;", "getClassName", "()Ljava/lang/String;", "setClassName", "(Ljava/lang/String;)V", "getImageUrl", "setImageUrl", "getDisplayName", "setDisplayName", "getUserId", "setUserId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
@c
public final class Sender implements Parcelable
{
    @e
    public static final Parcelable$Creator<Sender> CREATOR;
    @SerializedName("className")
    @f
    private String className;
    @SerializedName("displayName")
    @e
    private String displayName;
    @SerializedName("imageUrl")
    @f
    private String imageUrl;
    @SerializedName("userId")
    @f
    private String userId;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public Sender(@e final String displayName, @f final String imageUrl, @f final String userId, @f final String className) {
        k0.p(displayName, "displayName");
        this.displayName = displayName;
        this.imageUrl = imageUrl;
        this.userId = userId;
        this.className = className;
    }
    
    @e
    public final String component1() {
        return this.displayName;
    }
    
    @f
    public final String component2() {
        return this.imageUrl;
    }
    
    @f
    public final String component3() {
        return this.userId;
    }
    
    @f
    public final String component4() {
        return this.className;
    }
    
    @e
    public final Sender copy(@e final String s, @f final String s2, @f final String s3, @f final String s4) {
        k0.p(s, "displayName");
        return new Sender(s, s2, s3, s4);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Sender)) {
            return false;
        }
        final Sender sender = (Sender)o;
        return k0.g(this.displayName, sender.displayName) && k0.g(this.imageUrl, sender.imageUrl) && k0.g(this.userId, sender.userId) && k0.g(this.className, sender.className);
    }
    
    @f
    public final String getClassName() {
        return this.className;
    }
    
    @e
    public final String getDisplayName() {
        return this.displayName;
    }
    
    @f
    public final String getImageUrl() {
        return this.imageUrl;
    }
    
    @f
    public final String getUserId() {
        return this.userId;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.displayName.hashCode();
        final String imageUrl = this.imageUrl;
        int hashCode2 = 0;
        int hashCode3;
        if (imageUrl == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = imageUrl.hashCode();
        }
        final String userId = this.userId;
        int hashCode4;
        if (userId == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = userId.hashCode();
        }
        final String className = this.className;
        if (className != null) {
            hashCode2 = className.hashCode();
        }
        return ((hashCode * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode2;
    }
    
    public final void setClassName(@f final String className) {
        this.className = className;
    }
    
    public final void setDisplayName(@e final String displayName) {
        k0.p(displayName, "<set-?>");
        this.displayName = displayName;
    }
    
    public final void setImageUrl(@f final String imageUrl) {
        this.imageUrl = imageUrl;
    }
    
    public final void setUserId(@f final String userId) {
        this.userId = userId;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Sender(displayName=");
        sb.append(this.displayName);
        sb.append(", imageUrl=");
        sb.append((Object)this.imageUrl);
        sb.append(", userId=");
        sb.append((Object)this.userId);
        sb.append(", className=");
        sb.append((Object)this.className);
        sb.append(')');
        return sb.toString();
    }
    
    public void writeToParcel(@e final Parcel parcel, final int n) {
        k0.p(parcel, "out");
        parcel.writeString(this.displayName);
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.userId);
        parcel.writeString(this.className);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = {}, d2 = {}, k = 3, mv = { 1, 5, 1 })
    public static final class Creator implements Parcelable$Creator<Sender>
    {
        @e
        public final Sender createFromParcel(@e final Parcel parcel) {
            k0.p(parcel, "parcel");
            return new Sender(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }
        
        @e
        public final Sender[] newArray(final int n) {
            return new Sender[n];
        }
    }
}
