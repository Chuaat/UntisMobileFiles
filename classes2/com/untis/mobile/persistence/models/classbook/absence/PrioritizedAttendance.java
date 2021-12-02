// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.classbook.absence;

import a4.a;
import java.util.Objects;
import java.util.ArrayList;
import android.os.Parcelable$Creator;
import org.joda.time.t;
import kotlin.jvm.internal.k0;
import android.os.Parcel;
import kotlin.jvm.internal.w;
import com.untis.mobile.persistence.models.masterdata.Teacher;
import org.jetbrains.annotations.f;
import com.untis.mobile.persistence.models.masterdata.Subject;
import com.untis.mobile.persistence.models.masterdata.Student;
import com.untis.mobile.persistence.models.masterdata.Room;
import com.untis.mobile.persistence.models.masterdata.Klasse;
import java.util.List;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 @2\u00020\u0001:\u0001@Bk\u0012\b\b\u0002\u0010(\u001a\u00020'\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u000e\u0012\b\b\u0002\u0010/\u001a\u00020.\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u000e\b\u0002\u00106\u001a\b\u0012\u0004\u0012\u0002050\u001f\u0012\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f\u0012\u000e\b\u0002\u0010:\u001a\b\u0012\u0004\u0012\u0002090\u001f¢\u0006\u0004\b=\u0010>B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b=\u0010?J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016R\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001c\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0010\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014R(\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010(\u001a\u00020'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u0010/\u001a\u00020.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R(\u00106\u001a\b\u0012\u0004\u0012\u0002050\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010\"\u001a\u0004\b7\u0010$\"\u0004\b8\u0010&R(\u0010:\u001a\b\u0012\u0004\u0012\u0002090\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010\"\u001a\u0004\b;\u0010$\"\u0004\b<\u0010&¨\u0006A" }, d2 = { "Lcom/untis/mobile/persistence/models/classbook/absence/PrioritizedAttendance;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/j2;", "writeToParcel", "", "other", "", "equals", "hashCode", "describeContents", "", "periodId", "J", "getPeriodId", "()J", "setPeriodId", "(J)V", "Lcom/untis/mobile/persistence/models/masterdata/Subject;", "subject", "Lcom/untis/mobile/persistence/models/masterdata/Subject;", "getSubject", "()Lcom/untis/mobile/persistence/models/masterdata/Subject;", "setSubject", "(Lcom/untis/mobile/persistence/models/masterdata/Subject;)V", "parallelPeriodId", "getParallelPeriodId", "setParallelPeriodId", "", "Lcom/untis/mobile/persistence/models/masterdata/Klasse;", "klassen", "Ljava/util/List;", "getKlassen", "()Ljava/util/List;", "setKlassen", "(Ljava/util/List;)V", "Lcom/untis/mobile/persistence/models/masterdata/Student;", "student", "Lcom/untis/mobile/persistence/models/masterdata/Student;", "getStudent", "()Lcom/untis/mobile/persistence/models/masterdata/Student;", "setStudent", "(Lcom/untis/mobile/persistence/models/masterdata/Student;)V", "Lcom/untis/mobile/persistence/models/classbook/absence/PrioritizedAttendanceType;", "type", "Lcom/untis/mobile/persistence/models/classbook/absence/PrioritizedAttendanceType;", "getType", "()Lcom/untis/mobile/persistence/models/classbook/absence/PrioritizedAttendanceType;", "setType", "(Lcom/untis/mobile/persistence/models/classbook/absence/PrioritizedAttendanceType;)V", "Lcom/untis/mobile/persistence/models/masterdata/Teacher;", "teachers", "getTeachers", "setTeachers", "Lcom/untis/mobile/persistence/models/masterdata/Room;", "rooms", "getRooms", "setRooms", "<init>", "(Lcom/untis/mobile/persistence/models/masterdata/Student;JJLcom/untis/mobile/persistence/models/classbook/absence/PrioritizedAttendanceType;Lcom/untis/mobile/persistence/models/masterdata/Subject;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "(Landroid/os/Parcel;)V", "CREATOR", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class PrioritizedAttendance implements Parcelable
{
    @e
    public static final CREATOR CREATOR;
    @e
    private List<Klasse> klassen;
    private long parallelPeriodId;
    private long periodId;
    @e
    private List<Room> rooms;
    @e
    private Student student;
    @f
    private Subject subject;
    @e
    private List<Teacher> teachers;
    @e
    private PrioritizedAttendanceType type;
    
    static {
        CREATOR = new CREATOR(null);
    }
    
    public PrioritizedAttendance() {
        this(null, 0L, 0L, null, null, null, null, null, 255, null);
    }
    
    public PrioritizedAttendance(@e final Parcel parcel) {
        k0.p(parcel, "parcel");
        Student student;
        if ((student = (Student)parcel.readParcelable(Student.class.getClassLoader())) == null) {
            student = new Student(0L, null, null, null, null, 31, null);
        }
        final long long1 = parcel.readLong();
        final long long2 = parcel.readLong();
        final PrioritizedAttendanceType fromValue = PrioritizedAttendanceType.Companion.fromValue(parcel.readInt());
        final Subject subject = (Subject)parcel.readParcelable(Subject.class.getClassLoader());
        ArrayList<Teacher> typedArrayList;
        if ((typedArrayList = (ArrayList<Teacher>)parcel.createTypedArrayList((Parcelable$Creator)Teacher.CREATOR)) == null) {
            typedArrayList = new ArrayList<Teacher>();
        }
        ArrayList<Klasse> typedArrayList2;
        if ((typedArrayList2 = (ArrayList<Klasse>)parcel.createTypedArrayList((Parcelable$Creator)Klasse.CREATOR)) == null) {
            typedArrayList2 = new ArrayList<Klasse>();
        }
        ArrayList<Room> typedArrayList3;
        if ((typedArrayList3 = (ArrayList<Room>)parcel.createTypedArrayList((Parcelable$Creator)Room.CREATOR)) == null) {
            typedArrayList3 = new ArrayList<Room>();
        }
        this(student, long1, long2, fromValue, subject, typedArrayList, typedArrayList2, typedArrayList3);
    }
    
    public PrioritizedAttendance(@e final Student student, final long periodId, final long parallelPeriodId, @e final PrioritizedAttendanceType type, @f final Subject subject, @e final List<Teacher> teachers, @e final List<Klasse> klassen, @e final List<Room> rooms) {
        k0.p(student, "student");
        k0.p(type, "type");
        k0.p(teachers, "teachers");
        k0.p(klassen, "klassen");
        k0.p(rooms, "rooms");
        this.student = student;
        this.periodId = periodId;
        this.parallelPeriodId = parallelPeriodId;
        this.type = type;
        this.subject = subject;
        this.teachers = teachers;
        this.klassen = klassen;
        this.rooms = rooms;
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
        if (!k0.g(PrioritizedAttendance.class, class1)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.untis.mobile.persistence.models.classbook.absence.PrioritizedAttendance");
        final PrioritizedAttendance prioritizedAttendance = (PrioritizedAttendance)obj;
        return k0.g(this.student, prioritizedAttendance.student) && this.periodId == prioritizedAttendance.periodId && this.parallelPeriodId == prioritizedAttendance.parallelPeriodId;
    }
    
    @e
    public final List<Klasse> getKlassen() {
        return this.klassen;
    }
    
    public final long getParallelPeriodId() {
        return this.parallelPeriodId;
    }
    
    public final long getPeriodId() {
        return this.periodId;
    }
    
    @e
    public final List<Room> getRooms() {
        return this.rooms;
    }
    
    @e
    public final Student getStudent() {
        return this.student;
    }
    
    @f
    public final Subject getSubject() {
        return this.subject;
    }
    
    @e
    public final List<Teacher> getTeachers() {
        return this.teachers;
    }
    
    @e
    public final PrioritizedAttendanceType getType() {
        return this.type;
    }
    
    @Override
    public int hashCode() {
        return (this.student.hashCode() * 31 + a.a(this.periodId)) * 31 + a.a(this.parallelPeriodId);
    }
    
    public final void setKlassen(@e final List<Klasse> klassen) {
        k0.p(klassen, "<set-?>");
        this.klassen = klassen;
    }
    
    public final void setParallelPeriodId(final long parallelPeriodId) {
        this.parallelPeriodId = parallelPeriodId;
    }
    
    public final void setPeriodId(final long periodId) {
        this.periodId = periodId;
    }
    
    public final void setRooms(@e final List<Room> rooms) {
        k0.p(rooms, "<set-?>");
        this.rooms = rooms;
    }
    
    public final void setStudent(@e final Student student) {
        k0.p(student, "<set-?>");
        this.student = student;
    }
    
    public final void setSubject(@f final Subject subject) {
        this.subject = subject;
    }
    
    public final void setTeachers(@e final List<Teacher> teachers) {
        k0.p(teachers, "<set-?>");
        this.teachers = teachers;
    }
    
    public final void setType(@e final PrioritizedAttendanceType type) {
        k0.p(type, "<set-?>");
        this.type = type;
    }
    
    public void writeToParcel(@e final Parcel parcel, final int n) {
        k0.p(parcel, "parcel");
        parcel.writeParcelable((Parcelable)this.student, n);
        parcel.writeLong(this.periodId);
        parcel.writeLong(this.parallelPeriodId);
        parcel.writeInt(this.type.getValue());
        parcel.writeParcelable((Parcelable)this.subject, n);
        parcel.writeTypedList((List)this.teachers);
        parcel.writeTypedList((List)this.klassen);
        parcel.writeTypedList((List)this.rooms);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r" }, d2 = { "Lcom/untis/mobile/persistence/models/classbook/absence/PrioritizedAttendance$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/untis/mobile/persistence/models/classbook/absence/PrioritizedAttendance;", "Landroid/os/Parcel;", "parcel", "createFromParcel", "", "size", "", "newArray", "(I)[Lcom/untis/mobile/persistence/models/classbook/absence/PrioritizedAttendance;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class CREATOR implements Parcelable$Creator<PrioritizedAttendance>
    {
        private CREATOR() {
        }
        
        @e
        public PrioritizedAttendance createFromParcel(@e final Parcel parcel) {
            k0.p(parcel, "parcel");
            return new PrioritizedAttendance(parcel);
        }
        
        @e
        public PrioritizedAttendance[] newArray(final int n) {
            return new PrioritizedAttendance[n];
        }
    }
}
