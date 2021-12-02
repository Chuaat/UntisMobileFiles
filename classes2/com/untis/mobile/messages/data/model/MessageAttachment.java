// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.data.model;

import android.os.Parcel;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.e;
import android.os.Parcelable$Creator;
import b7.c;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0004\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0002H\u00c6\u0003J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002H\u00c6\u0001J\t\u0010\n\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\f\u001a\u00020\u000bH\u00d6\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u000bH\u00d6\u0001J\u0019\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000bH\u00d6\u0001R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001b¨\u0006\"" }, d2 = { "Lcom/untis/mobile/messages/data/model/MessageAttachment;", "Landroid/os/Parcelable;", "", "component1", "component2", "component3", "id", "name", "downloadUrl", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/j2;", "writeToParcel", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getId", "setId", "getDownloadUrl", "setDownloadUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
@c
public final class MessageAttachment implements Parcelable
{
    @e
    public static final Parcelable$Creator<MessageAttachment> CREATOR;
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
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public MessageAttachment(@e final String id, @e final String name, @e final String downloadUrl) {
        k0.p(id, "id");
        k0.p(name, "name");
        k0.p(downloadUrl, "downloadUrl");
        this.id = id;
        this.name = name;
        this.downloadUrl = downloadUrl;
    }
    
    @e
    public final String component1() {
        return this.id;
    }
    
    @e
    public final String component2() {
        return this.name;
    }
    
    @e
    public final String component3() {
        return this.downloadUrl;
    }
    
    @e
    public final MessageAttachment copy(@e final String s, @e final String s2, @e final String s3) {
        k0.p(s, "id");
        k0.p(s2, "name");
        k0.p(s3, "downloadUrl");
        return new MessageAttachment(s, s2, s3);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MessageAttachment)) {
            return false;
        }
        final MessageAttachment messageAttachment = (MessageAttachment)o;
        return k0.g(this.id, messageAttachment.id) && k0.g(this.name, messageAttachment.name) && k0.g(this.downloadUrl, messageAttachment.downloadUrl);
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
        return (this.id.hashCode() * 31 + this.name.hashCode()) * 31 + this.downloadUrl.hashCode();
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
        sb.append("MessageAttachment(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", downloadUrl=");
        sb.append(this.downloadUrl);
        sb.append(')');
        return sb.toString();
    }
    
    public void writeToParcel(@e final Parcel parcel, final int n) {
        k0.p(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.downloadUrl);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = {}, d2 = {}, k = 3, mv = { 1, 5, 1 })
    public static final class Creator implements Parcelable$Creator<MessageAttachment>
    {
        @e
        public final MessageAttachment createFromParcel(@e final Parcel parcel) {
            k0.p(parcel, "parcel");
            return new MessageAttachment(parcel.readString(), parcel.readString(), parcel.readString());
        }
        
        @e
        public final MessageAttachment[] newArray(final int n) {
            return new MessageAttachment[n];
        }
    }
}
