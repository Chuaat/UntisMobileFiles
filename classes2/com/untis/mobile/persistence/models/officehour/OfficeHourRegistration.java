// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.officehour;

import android.os.Parcelable$Creator;
import a4.a;
import java.util.Objects;
import org.jetbrains.annotations.f;
import android.os.Parcel;
import org.joda.time.t;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import com.untis.mobile.persistence.models.masterdata.Teacher;
import org.joda.time.c;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000e\u0018\u0000 02\u00020\u0001:\u00010B9\u0012\b\b\u0002\u0010$\u001a\u00020#\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010*\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b-\u0010.B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b-\u0010/J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\r\u001a\u00020\u0004H\u0016R\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001d\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010$\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010*\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\u0017\u001a\u0004\b+\u0010\u0019\"\u0004\b,\u0010\u001b¨\u00061" }, d2 = { "Lcom/untis/mobile/persistence/models/officehour/OfficeHourRegistration;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/j2;", "writeToParcel", "describeContents", "", "other", "", "equals", "hashCode", "", "userText", "Ljava/lang/String;", "getUserText", "()Ljava/lang/String;", "setUserText", "(Ljava/lang/String;)V", "Lorg/joda/time/c;", "start", "Lorg/joda/time/c;", "getStart", "()Lorg/joda/time/c;", "setStart", "(Lorg/joda/time/c;)V", "Lcom/untis/mobile/persistence/models/masterdata/Teacher;", "teacher", "Lcom/untis/mobile/persistence/models/masterdata/Teacher;", "getTeacher", "()Lcom/untis/mobile/persistence/models/masterdata/Teacher;", "setTeacher", "(Lcom/untis/mobile/persistence/models/masterdata/Teacher;)V", "", "officeHourId", "J", "getOfficeHourId", "()J", "setOfficeHourId", "(J)V", "end", "getEnd", "setEnd", "<init>", "(JLcom/untis/mobile/persistence/models/masterdata/Teacher;Lorg/joda/time/c;Lorg/joda/time/c;Ljava/lang/String;)V", "(Landroid/os/Parcel;)V", "CREATOR", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class OfficeHourRegistration implements Parcelable
{
    @e
    public static final CREATOR CREATOR;
    @e
    private c end;
    private long officeHourId;
    @e
    private c start;
    @e
    private Teacher teacher;
    @e
    private String userText;
    
    static {
        CREATOR = new CREATOR(null);
    }
    
    public OfficeHourRegistration() {
        this(0L, null, null, null, null, 31, null);
    }
    
    public OfficeHourRegistration(final long officeHourId, @e final Teacher teacher, @e final c start, @e final c end, @e final String userText) {
        k0.p(teacher, "teacher");
        k0.p(start, "start");
        k0.p(end, "end");
        k0.p(userText, "userText");
        this.officeHourId = officeHourId;
        this.teacher = teacher;
        this.start = start;
        this.end = end;
        this.userText = userText;
    }
    
    public OfficeHourRegistration(@e final Parcel parcel) {
        k0.p(parcel, "parcel");
        final long long1 = parcel.readLong();
        Teacher teacher = (Teacher)parcel.readParcelable(Teacher.class.getClassLoader());
        if (teacher == null) {
            teacher = new Teacher(0L, null, null, null, null, null, 0, 0, false, false, 1023, null);
        }
        final c k0 = c.K0(parcel.readString());
        kotlin.jvm.internal.k0.o(k0, "parse(parcel.readString())");
        final c k2 = c.K0(parcel.readString());
        kotlin.jvm.internal.k0.o(k2, "parse(parcel.readString())");
        String string;
        if ((string = parcel.readString()) == null) {
            string = "";
        }
        this(long1, teacher, k0, k2, string);
    }
    
    public int describeContents() {
        return 0;
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
        if (!k0.g(OfficeHourRegistration.class, class1)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.untis.mobile.persistence.models.officehour.OfficeHourRegistration");
        final OfficeHourRegistration officeHourRegistration = (OfficeHourRegistration)obj;
        return this.officeHourId == officeHourRegistration.officeHourId && k0.g(this.teacher, officeHourRegistration.teacher) && k0.g(this.start, officeHourRegistration.start) && k0.g(this.end, officeHourRegistration.end);
    }
    
    @e
    public final c getEnd() {
        return this.end;
    }
    
    public final long getOfficeHourId() {
        return this.officeHourId;
    }
    
    @e
    public final c getStart() {
        return this.start;
    }
    
    @e
    public final Teacher getTeacher() {
        return this.teacher;
    }
    
    @e
    public final String getUserText() {
        return this.userText;
    }
    
    @Override
    public int hashCode() {
        return ((a.a(this.officeHourId) * 31 + this.teacher.hashCode()) * 31 + ((org.joda.time.base.c)this.start).hashCode()) * 31 + ((org.joda.time.base.c)this.end).hashCode();
    }
    
    public final void setEnd(@e final c end) {
        k0.p(end, "<set-?>");
        this.end = end;
    }
    
    public final void setOfficeHourId(final long officeHourId) {
        this.officeHourId = officeHourId;
    }
    
    public final void setStart(@e final c start) {
        k0.p(start, "<set-?>");
        this.start = start;
    }
    
    public final void setTeacher(@e final Teacher teacher) {
        k0.p(teacher, "<set-?>");
        this.teacher = teacher;
    }
    
    public final void setUserText(@e final String userText) {
        k0.p(userText, "<set-?>");
        this.userText = userText;
    }
    
    public void writeToParcel(@e final Parcel parcel, final int n) {
        k0.p(parcel, "parcel");
        parcel.writeLong(this.officeHourId);
        parcel.writeParcelable((Parcelable)this.teacher, n);
        parcel.writeString(((org.joda.time.base.a)this.start).toString());
        parcel.writeString(((org.joda.time.base.a)this.end).toString());
        parcel.writeString(this.userText);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r" }, d2 = { "Lcom/untis/mobile/persistence/models/officehour/OfficeHourRegistration$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/untis/mobile/persistence/models/officehour/OfficeHourRegistration;", "Landroid/os/Parcel;", "parcel", "createFromParcel", "", "size", "", "newArray", "(I)[Lcom/untis/mobile/persistence/models/officehour/OfficeHourRegistration;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class CREATOR implements Parcelable$Creator<OfficeHourRegistration>
    {
        private CREATOR() {
        }
        
        @e
        public OfficeHourRegistration createFromParcel(@e final Parcel parcel) {
            k0.p(parcel, "parcel");
            return new OfficeHourRegistration(parcel);
        }
        
        @e
        public OfficeHourRegistration[] newArray(final int n) {
            return new OfficeHourRegistration[n];
        }
    }
}
