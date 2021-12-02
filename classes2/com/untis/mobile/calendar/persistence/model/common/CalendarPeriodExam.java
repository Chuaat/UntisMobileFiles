// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.persistence.model.common;

import android.os.Parcelable$Creator;
import a4.a;
import kotlin.jvm.internal.k0;
import android.os.Parcel;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.f;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u0000 '2\u00020\u0001:\u0001'B#\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b$\u0010%B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b$\u0010&J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001J\t\u0010\u0012\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0004H\u00d6\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003R$\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u000e\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0018\u001a\u0004\b\"\u0010\u001a\"\u0004\b#\u0010\u001c¨\u0006(" }, d2 = { "Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodExam;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/j2;", "writeToParcel", "describeContents", "", "component1", "", "component2", "component3", "id", "description", "name", "copy", "toString", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "J", "getId", "()J", "setId", "(J)V", "getName", "setName", "<init>", "(JLjava/lang/String;Ljava/lang/String;)V", "(Landroid/os/Parcel;)V", "CREATOR", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class CalendarPeriodExam implements Parcelable
{
    @e
    public static final CREATOR CREATOR;
    @SerializedName("description")
    @f
    private String description;
    @SerializedName("id")
    private long id;
    @SerializedName("name")
    @f
    private String name;
    
    static {
        CREATOR = new CREATOR(null);
    }
    
    public CalendarPeriodExam(final long id, @f final String description, @f final String name) {
        this.id = id;
        this.description = description;
        this.name = name;
    }
    
    public CalendarPeriodExam(@e final Parcel parcel) {
        k0.p(parcel, "parcel");
        this(parcel.readLong(), parcel.readString(), parcel.readString());
    }
    
    public final long component1() {
        return this.id;
    }
    
    @f
    public final String component2() {
        return this.description;
    }
    
    @f
    public final String component3() {
        return this.name;
    }
    
    @e
    public final CalendarPeriodExam copy(final long n, @f final String s, @f final String s2) {
        return new CalendarPeriodExam(n, s, s2);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CalendarPeriodExam)) {
            return false;
        }
        final CalendarPeriodExam calendarPeriodExam = (CalendarPeriodExam)o;
        return this.id == calendarPeriodExam.id && k0.g(this.description, calendarPeriodExam.description) && k0.g(this.name, calendarPeriodExam.name);
    }
    
    @f
    public final String getDescription() {
        return this.description;
    }
    
    public final long getId() {
        return this.id;
    }
    
    @f
    public final String getName() {
        return this.name;
    }
    
    @Override
    public int hashCode() {
        final int a = a4.a.a(this.id);
        final String description = this.description;
        int hashCode = 0;
        int hashCode2;
        if (description == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = description.hashCode();
        }
        final String name = this.name;
        if (name != null) {
            hashCode = name.hashCode();
        }
        return (a * 31 + hashCode2) * 31 + hashCode;
    }
    
    public final void setDescription(@f final String description) {
        this.description = description;
    }
    
    public final void setId(final long id) {
        this.id = id;
    }
    
    public final void setName(@f final String name) {
        this.name = name;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CalendarPeriodExam(id=");
        sb.append(this.id);
        sb.append(", description=");
        sb.append((Object)this.description);
        sb.append(", name=");
        sb.append((Object)this.name);
        sb.append(')');
        return sb.toString();
    }
    
    public void writeToParcel(@e final Parcel parcel, final int n) {
        k0.p(parcel, "parcel");
        parcel.writeLong(this.id);
        parcel.writeString(this.description);
        parcel.writeString(this.name);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r" }, d2 = { "Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodExam$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodExam;", "Landroid/os/Parcel;", "parcel", "createFromParcel", "", "size", "", "newArray", "(I)[Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodExam;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class CREATOR implements Parcelable$Creator<CalendarPeriodExam>
    {
        private CREATOR() {
        }
        
        @e
        public CalendarPeriodExam createFromParcel(@e final Parcel parcel) {
            k0.p(parcel, "parcel");
            return new CalendarPeriodExam(parcel);
        }
        
        @e
        public CalendarPeriodExam[] newArray(final int n) {
            return new CalendarPeriodExam[n];
        }
    }
}
