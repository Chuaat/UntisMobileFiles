// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.classbook.absence;

import org.joda.time.base.a;
import android.os.Parcelable$Creator;
import java.util.Objects;
import org.jetbrains.annotations.f;
import org.joda.time.t;
import kotlin.jvm.internal.k0;
import android.os.Parcel;
import kotlin.jvm.internal.w;
import com.untis.mobile.persistence.models.masterdata.Student;
import org.joda.time.c;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \"2\u00020\u0001:\u0001\"B%\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001f\u0010 B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010!J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\r\u001a\u00020\u0004H\u0016R\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001c\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0010\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014¨\u0006#" }, d2 = { "Lcom/untis/mobile/persistence/models/classbook/absence/StudentAttendance;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/j2;", "writeToParcel", "describeContents", "", "other", "", "equals", "hashCode", "Lorg/joda/time/c;", "end", "Lorg/joda/time/c;", "getEnd", "()Lorg/joda/time/c;", "setEnd", "(Lorg/joda/time/c;)V", "Lcom/untis/mobile/persistence/models/masterdata/Student;", "student", "Lcom/untis/mobile/persistence/models/masterdata/Student;", "getStudent", "()Lcom/untis/mobile/persistence/models/masterdata/Student;", "setStudent", "(Lcom/untis/mobile/persistence/models/masterdata/Student;)V", "start", "getStart", "setStart", "<init>", "(Lcom/untis/mobile/persistence/models/masterdata/Student;Lorg/joda/time/c;Lorg/joda/time/c;)V", "(Landroid/os/Parcel;)V", "CREATOR", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class StudentAttendance implements Parcelable
{
    @e
    public static final CREATOR CREATOR;
    @e
    private c end;
    @e
    private c start;
    @e
    private Student student;
    
    static {
        CREATOR = new CREATOR(null);
    }
    
    public StudentAttendance() {
        this(null, null, null, 7, null);
    }
    
    public StudentAttendance(@e final Parcel parcel) {
        k0.p(parcel, "parcel");
        Student student;
        if ((student = (Student)parcel.readParcelable(Student.class.getClassLoader())) == null) {
            student = new Student(0L, null, null, null, null, 31, null);
        }
        final c k0 = c.K0(parcel.readString());
        kotlin.jvm.internal.k0.o(k0, "parse(parcel.readString())");
        final c k2 = c.K0(parcel.readString());
        kotlin.jvm.internal.k0.o(k2, "parse(parcel.readString())");
        this(student, k0, k2);
    }
    
    public StudentAttendance(@e final Student student, @e final c start, @e final c end) {
        k0.p(student, "student");
        k0.p(start, "start");
        k0.p(end, "end");
        this.student = student;
        this.start = start;
        this.end = end;
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
        if (!k0.g(StudentAttendance.class, class1)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.untis.mobile.persistence.models.classbook.absence.StudentAttendance");
        final StudentAttendance studentAttendance = (StudentAttendance)obj;
        return k0.g(this.student, studentAttendance.student) && k0.g(this.start, studentAttendance.start) && k0.g(this.end, studentAttendance.end);
    }
    
    @e
    public final c getEnd() {
        return this.end;
    }
    
    @e
    public final c getStart() {
        return this.start;
    }
    
    @e
    public final Student getStudent() {
        return this.student;
    }
    
    @Override
    public int hashCode() {
        return (this.student.hashCode() * 31 + ((org.joda.time.base.c)this.start).hashCode()) * 31 + ((org.joda.time.base.c)this.end).hashCode();
    }
    
    public final void setEnd(@e final c end) {
        k0.p(end, "<set-?>");
        this.end = end;
    }
    
    public final void setStart(@e final c start) {
        k0.p(start, "<set-?>");
        this.start = start;
    }
    
    public final void setStudent(@e final Student student) {
        k0.p(student, "<set-?>");
        this.student = student;
    }
    
    public void writeToParcel(@e final Parcel parcel, final int n) {
        k0.p(parcel, "parcel");
        parcel.writeParcelable((Parcelable)this.student, n);
        parcel.writeString(((a)this.start).toString());
        parcel.writeString(((a)this.end).toString());
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r" }, d2 = { "Lcom/untis/mobile/persistence/models/classbook/absence/StudentAttendance$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/untis/mobile/persistence/models/classbook/absence/StudentAttendance;", "Landroid/os/Parcel;", "parcel", "createFromParcel", "", "size", "", "newArray", "(I)[Lcom/untis/mobile/persistence/models/classbook/absence/StudentAttendance;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class CREATOR implements Parcelable$Creator<StudentAttendance>
    {
        private CREATOR() {
        }
        
        @e
        public StudentAttendance createFromParcel(@e final Parcel parcel) {
            k0.p(parcel, "parcel");
            return new StudentAttendance(parcel);
        }
        
        @e
        public StudentAttendance[] newArray(final int n) {
            return new StudentAttendance[n];
        }
    }
}
