// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.schoolsearch;

import android.os.Parcelable$Creator;
import kotlin.jvm.internal.k0;
import android.os.Parcel;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import android.os.Parcelable;
import java.io.Serializable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u000e\u0018\u0000 12\u00020\u00012\u00020\u0002:\u00011BW\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\b\b\u0002\u0010\u0014\u001a\u00020\n\u0012\b\b\u0002\u0010!\u001a\u00020\n\u0012\b\b\u0002\u0010\u0017\u001a\u00020\n\u0012\b\b\u0002\u0010%\u001a\u00020$\u0012\b\b\u0002\u0010+\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b.\u0010/B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b.\u00100J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\"\u0010\u0014\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\"\u0010\u0017\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\"\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010!\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\f\u001a\u0004\b\"\u0010\u000e\"\u0004\b#\u0010\u0010R\"\u0010%\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010+\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010\u001c\u001a\u0004\b,\u0010\u001e\"\u0004\b-\u0010 ¨\u00062" }, d2 = { "Lcom/untis/mobile/api/schoolsearch/SchoolSearchSchool;", "Ljava/io/Serializable;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/j2;", "writeToParcel", "describeContents", "", "address", "Ljava/lang/String;", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "server", "getServer", "setServer", "displayName", "getDisplayName", "setDisplayName", "mobileServiceUrl", "getMobileServiceUrl", "setMobileServiceUrl", "", "useMobileServiceUrlIos", "Z", "getUseMobileServiceUrlIos", "()Z", "setUseMobileServiceUrlIos", "(Z)V", "loginName", "getLoginName", "setLoginName", "", "schoolId", "J", "getSchoolId", "()J", "setSchoolId", "(J)V", "useMobileServiceUrlAndroid", "getUseMobileServiceUrlAndroid", "setUseMobileServiceUrlAndroid", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZZ)V", "(Landroid/os/Parcel;)V", "CREATOR", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class SchoolSearchSchool implements Serializable, Parcelable
{
    @e
    public static final CREATOR CREATOR;
    @e
    private String address;
    @e
    private String displayName;
    @e
    private String loginName;
    @e
    private String mobileServiceUrl;
    private long schoolId;
    @e
    private String server;
    private boolean useMobileServiceUrlAndroid;
    private boolean useMobileServiceUrlIos;
    
    static {
        CREATOR = new CREATOR(null);
    }
    
    public SchoolSearchSchool() {
        this(null, null, null, null, null, 0L, false, false, 255, null);
    }
    
    public SchoolSearchSchool(@e final Parcel parcel) {
        k0.p(parcel, "parcel");
        String string = parcel.readString();
        if (string == null) {
            string = "";
        }
        String string2 = parcel.readString();
        if (string2 == null) {
            string2 = "";
        }
        String string3 = parcel.readString();
        if (string3 == null) {
            string3 = "";
        }
        String string4 = parcel.readString();
        if (string4 == null) {
            string4 = "";
        }
        String string5 = parcel.readString();
        if (string5 == null) {
            string5 = "";
        }
        this(string, string2, string3, string4, string5, parcel.readLong(), parcel.readByte() != 0, parcel.readByte() != 0);
    }
    
    public SchoolSearchSchool(@e final String address, @e final String server, @e final String displayName, @e final String loginName, @e final String mobileServiceUrl, final long schoolId, final boolean useMobileServiceUrlAndroid, final boolean useMobileServiceUrlIos) {
        k0.p(address, "address");
        k0.p(server, "server");
        k0.p(displayName, "displayName");
        k0.p(loginName, "loginName");
        k0.p(mobileServiceUrl, "mobileServiceUrl");
        this.address = address;
        this.server = server;
        this.displayName = displayName;
        this.loginName = loginName;
        this.mobileServiceUrl = mobileServiceUrl;
        this.schoolId = schoolId;
        this.useMobileServiceUrlAndroid = useMobileServiceUrlAndroid;
        this.useMobileServiceUrlIos = useMobileServiceUrlIos;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @e
    public final String getAddress() {
        return this.address;
    }
    
    @e
    public final String getDisplayName() {
        return this.displayName;
    }
    
    @e
    public final String getLoginName() {
        return this.loginName;
    }
    
    @e
    public final String getMobileServiceUrl() {
        return this.mobileServiceUrl;
    }
    
    public final long getSchoolId() {
        return this.schoolId;
    }
    
    @e
    public final String getServer() {
        return this.server;
    }
    
    public final boolean getUseMobileServiceUrlAndroid() {
        return this.useMobileServiceUrlAndroid;
    }
    
    public final boolean getUseMobileServiceUrlIos() {
        return this.useMobileServiceUrlIos;
    }
    
    public final void setAddress(@e final String address) {
        k0.p(address, "<set-?>");
        this.address = address;
    }
    
    public final void setDisplayName(@e final String displayName) {
        k0.p(displayName, "<set-?>");
        this.displayName = displayName;
    }
    
    public final void setLoginName(@e final String loginName) {
        k0.p(loginName, "<set-?>");
        this.loginName = loginName;
    }
    
    public final void setMobileServiceUrl(@e final String mobileServiceUrl) {
        k0.p(mobileServiceUrl, "<set-?>");
        this.mobileServiceUrl = mobileServiceUrl;
    }
    
    public final void setSchoolId(final long schoolId) {
        this.schoolId = schoolId;
    }
    
    public final void setServer(@e final String server) {
        k0.p(server, "<set-?>");
        this.server = server;
    }
    
    public final void setUseMobileServiceUrlAndroid(final boolean useMobileServiceUrlAndroid) {
        this.useMobileServiceUrlAndroid = useMobileServiceUrlAndroid;
    }
    
    public final void setUseMobileServiceUrlIos(final boolean useMobileServiceUrlIos) {
        this.useMobileServiceUrlIos = useMobileServiceUrlIos;
    }
    
    public void writeToParcel(@e final Parcel parcel, final int n) {
        k0.p(parcel, "parcel");
        parcel.writeString(this.address);
        parcel.writeString(this.server);
        parcel.writeString(this.displayName);
        parcel.writeString(this.loginName);
        parcel.writeString(this.mobileServiceUrl);
        parcel.writeLong(this.schoolId);
        parcel.writeByte((byte)(byte)(this.useMobileServiceUrlAndroid ? 1 : 0));
        parcel.writeByte((byte)(byte)(this.useMobileServiceUrlIos ? 1 : 0));
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r" }, d2 = { "Lcom/untis/mobile/api/schoolsearch/SchoolSearchSchool$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/untis/mobile/api/schoolsearch/SchoolSearchSchool;", "Landroid/os/Parcel;", "parcel", "createFromParcel", "", "size", "", "newArray", "(I)[Lcom/untis/mobile/api/schoolsearch/SchoolSearchSchool;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class CREATOR implements Parcelable$Creator<SchoolSearchSchool>
    {
        private CREATOR() {
        }
        
        @e
        public SchoolSearchSchool createFromParcel(@e final Parcel parcel) {
            k0.p(parcel, "parcel");
            return new SchoolSearchSchool(parcel);
        }
        
        @e
        public SchoolSearchSchool[] newArray(final int n) {
            return new SchoolSearchSchool[n];
        }
    }
}
