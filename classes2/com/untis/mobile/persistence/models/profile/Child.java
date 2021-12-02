// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.profile;

import android.os.Parcelable$Creator;
import a4.a;
import org.jetbrains.annotations.f;
import kotlin.text.s;
import java.util.Objects;
import android.os.Parcel;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001a\u0018\u0000 )2\u00020\u0001:\u0001)B/\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0002\u0012\b\b\u0002\u0010 \u001a\u00020\u0006¢\u0006\u0004\b&\u0010'B\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b&\u0010(J\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\bH\u0016J\b\u0010\u000f\u001a\u00020\bH\u0016R\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001d\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\"\u0010 \u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006*" }, d2 = { "Lcom/untis/mobile/persistence/models/profile/Child;", "Landroid/os/Parcelable;", "", "displayableTitle", "", "other", "", "equals", "", "hashCode", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/j2;", "writeToParcel", "describeContents", "", "id", "J", "getId", "()J", "setId", "(J)V", "firstName", "Ljava/lang/String;", "getFirstName", "()Ljava/lang/String;", "setFirstName", "(Ljava/lang/String;)V", "lastName", "getLastName", "setLastName", "hasTimeTableAccess", "Z", "getHasTimeTableAccess", "()Z", "setHasTimeTableAccess", "(Z)V", "<init>", "(JLjava/lang/String;Ljava/lang/String;Z)V", "(Landroid/os/Parcel;)V", "CREATOR", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class Child implements Parcelable
{
    @e
    public static final CREATOR CREATOR;
    @e
    private String firstName;
    private boolean hasTimeTableAccess;
    private long id;
    @e
    private String lastName;
    
    static {
        CREATOR = new CREATOR(null);
    }
    
    public Child() {
        this(0L, null, null, false, 15, null);
    }
    
    public Child(final long id, @e final String firstName, @e final String lastName, final boolean hasTimeTableAccess) {
        k0.p(firstName, "firstName");
        k0.p(lastName, "lastName");
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hasTimeTableAccess = hasTimeTableAccess;
    }
    
    public Child(@e final Parcel parcel) {
        k0.p(parcel, "parcel");
        final long long1 = parcel.readLong();
        String string = parcel.readString();
        if (string == null) {
            string = "";
        }
        String string2 = parcel.readString();
        if (string2 == null) {
            string2 = "";
        }
        this(long1, string, string2, parcel.readByte() != 0);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @e
    public final String displayableTitle() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.firstName);
        sb.append(' ');
        sb.append(this.lastName);
        final String string = sb.toString();
        Objects.requireNonNull(string, "null cannot be cast to non-null type kotlin.CharSequence");
        return s.B5((CharSequence)string).toString();
    }
    
    @Override
    public boolean equals(@f final Object obj) {
        if (this == obj) {
            return true;
        }
        Object class1;
        if (obj == null) {
            class1 = null;
        }
        else {
            class1 = obj.getClass();
        }
        if (!k0.g(Child.class, class1)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.untis.mobile.persistence.models.profile.Child");
        return this.id == ((Child)obj).id;
    }
    
    @e
    public final String getFirstName() {
        return this.firstName;
    }
    
    public final boolean getHasTimeTableAccess() {
        return this.hasTimeTableAccess;
    }
    
    public final long getId() {
        return this.id;
    }
    
    @e
    public final String getLastName() {
        return this.lastName;
    }
    
    @Override
    public int hashCode() {
        return a.a(this.id);
    }
    
    public final void setFirstName(@e final String firstName) {
        k0.p(firstName, "<set-?>");
        this.firstName = firstName;
    }
    
    public final void setHasTimeTableAccess(final boolean hasTimeTableAccess) {
        this.hasTimeTableAccess = hasTimeTableAccess;
    }
    
    public final void setId(final long id) {
        this.id = id;
    }
    
    public final void setLastName(@e final String lastName) {
        k0.p(lastName, "<set-?>");
        this.lastName = lastName;
    }
    
    public void writeToParcel(@e final Parcel parcel, final int n) {
        k0.p(parcel, "parcel");
        parcel.writeLong(this.id);
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        parcel.writeByte((byte)(byte)(this.hasTimeTableAccess ? 1 : 0));
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r" }, d2 = { "Lcom/untis/mobile/persistence/models/profile/Child$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/untis/mobile/persistence/models/profile/Child;", "Landroid/os/Parcel;", "parcel", "createFromParcel", "", "size", "", "newArray", "(I)[Lcom/untis/mobile/persistence/models/profile/Child;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class CREATOR implements Parcelable$Creator<Child>
    {
        private CREATOR() {
        }
        
        @e
        public Child createFromParcel(@e final Parcel parcel) {
            k0.p(parcel, "parcel");
            return new Child(parcel);
        }
        
        @e
        public Child[] newArray(final int n) {
            return new Child[n];
        }
    }
}
