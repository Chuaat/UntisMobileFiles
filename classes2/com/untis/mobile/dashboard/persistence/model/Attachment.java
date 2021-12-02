// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.persistence.model;

import android.os.Parcelable$Creator;
import a4.a;
import org.jetbrains.annotations.f;
import android.os.Parcel;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u0000 '2\u00020\u0001:\u0001'B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b$\u0010%B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b$\u0010&J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\t\u0010\f\u001a\u00020\u000bH\u00c6\u0003J\t\u0010\r\u001a\u00020\u000bH\u00c6\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000bH\u00c6\u0001J\t\u0010\u0012\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0004H\u00d6\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003R\"\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u000e\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\u000f\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b\"\u0010\u001a\"\u0004\b#\u0010\u001c¨\u0006(" }, d2 = { "Lcom/untis/mobile/dashboard/persistence/model/Attachment;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/j2;", "writeToParcel", "describeContents", "", "component1", "", "component2", "component3", "id", "name", "url", "copy", "toString", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "J", "getId", "()J", "setId", "(J)V", "getName", "setName", "<init>", "(JLjava/lang/String;Ljava/lang/String;)V", "(Landroid/os/Parcel;)V", "CREATOR", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class Attachment implements Parcelable
{
    @e
    public static final CREATOR CREATOR;
    @SerializedName("id")
    private long id;
    @SerializedName("name")
    @e
    private String name;
    @SerializedName("url")
    @e
    private String url;
    
    static {
        CREATOR = new CREATOR(null);
    }
    
    public Attachment(final long id, @e final String name, @e final String url) {
        k0.p(name, "name");
        k0.p(url, "url");
        this.id = id;
        this.name = name;
        this.url = url;
    }
    
    public Attachment(@e final Parcel parcel) {
        k0.p(parcel, "parcel");
        final long long1 = parcel.readLong();
        final String string = parcel.readString();
        final String s = "";
        String s2 = string;
        if (string == null) {
            s2 = "";
        }
        String string2 = parcel.readString();
        if (string2 == null) {
            string2 = s;
        }
        this(long1, s2, string2);
    }
    
    public final long component1() {
        return this.id;
    }
    
    @e
    public final String component2() {
        return this.name;
    }
    
    @e
    public final String component3() {
        return this.url;
    }
    
    @e
    public final Attachment copy(final long n, @e final String s, @e final String s2) {
        k0.p(s, "name");
        k0.p(s2, "url");
        return new Attachment(n, s, s2);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Attachment)) {
            return false;
        }
        final Attachment attachment = (Attachment)o;
        return this.id == attachment.id && k0.g(this.name, attachment.name) && k0.g(this.url, attachment.url);
    }
    
    public final long getId() {
        return this.id;
    }
    
    @e
    public final String getName() {
        return this.name;
    }
    
    @e
    public final String getUrl() {
        return this.url;
    }
    
    @Override
    public int hashCode() {
        return (a.a(this.id) * 31 + this.name.hashCode()) * 31 + this.url.hashCode();
    }
    
    public final void setId(final long id) {
        this.id = id;
    }
    
    public final void setName(@e final String name) {
        k0.p(name, "<set-?>");
        this.name = name;
    }
    
    public final void setUrl(@e final String url) {
        k0.p(url, "<set-?>");
        this.url = url;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Attachment(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(')');
        return sb.toString();
    }
    
    public void writeToParcel(@e final Parcel parcel, final int n) {
        k0.p(parcel, "parcel");
        parcel.writeLong(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.url);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r" }, d2 = { "Lcom/untis/mobile/dashboard/persistence/model/Attachment$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/untis/mobile/dashboard/persistence/model/Attachment;", "Landroid/os/Parcel;", "parcel", "createFromParcel", "", "size", "", "newArray", "(I)[Lcom/untis/mobile/dashboard/persistence/model/Attachment;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class CREATOR implements Parcelable$Creator<Attachment>
    {
        private CREATOR() {
        }
        
        @e
        public Attachment createFromParcel(@e final Parcel parcel) {
            k0.p(parcel, "parcel");
            return new Attachment(parcel);
        }
        
        @e
        public Attachment[] newArray(final int n) {
            return new Attachment[n];
        }
    }
}
