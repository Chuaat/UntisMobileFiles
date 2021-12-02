// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.classbook.absence;

import java.util.ArrayList;
import android.os.Parcelable$Creator;
import org.joda.time.t;
import kotlin.jvm.internal.k0;
import android.os.Parcel;
import kotlin.jvm.internal.w;
import com.untis.mobile.persistence.models.masterdata.Student;
import java.util.List;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 )2\u00020\u0001:\u0001)BK\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u0010\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b&\u0010'B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b&\u0010(J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R(\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\"\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R(\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0013\u001a\u0004\b$\u0010\u0015\"\u0004\b%\u0010\u0017¨\u0006*" }, d2 = { "Lcom/untis/mobile/persistence/models/classbook/absence/StudentAbsenceResult;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/j2;", "writeToParcel", "describeContents", "Lcom/untis/mobile/persistence/models/masterdata/Student;", "student", "Lcom/untis/mobile/persistence/models/masterdata/Student;", "getStudent", "()Lcom/untis/mobile/persistence/models/masterdata/Student;", "setStudent", "(Lcom/untis/mobile/persistence/models/masterdata/Student;)V", "", "Lcom/untis/mobile/persistence/models/classbook/absence/StudentAbsence;", "conflicts", "Ljava/util/List;", "getConflicts", "()Ljava/util/List;", "setConflicts", "(Ljava/util/List;)V", "absences", "getAbsences", "setAbsences", "", "separateSaveAllowed", "Z", "getSeparateSaveAllowed", "()Z", "setSeparateSaveAllowed", "(Z)V", "Lcom/untis/mobile/persistence/models/classbook/absence/StudentAttendance;", "attendances", "getAttendances", "setAttendances", "<init>", "(Lcom/untis/mobile/persistence/models/masterdata/Student;Ljava/util/List;Ljava/util/List;Ljava/util/List;Z)V", "(Landroid/os/Parcel;)V", "CREATOR", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class StudentAbsenceResult implements Parcelable
{
    @e
    public static final CREATOR CREATOR;
    @e
    private List<StudentAbsence> absences;
    @e
    private List<StudentAttendance> attendances;
    @e
    private List<StudentAbsence> conflicts;
    private boolean separateSaveAllowed;
    @e
    private Student student;
    
    static {
        CREATOR = new CREATOR(null);
    }
    
    public StudentAbsenceResult() {
        this(null, null, null, null, false, 31, null);
    }
    
    public StudentAbsenceResult(@e final Parcel parcel) {
        k0.p(parcel, "parcel");
        Student student;
        if ((student = (Student)parcel.readParcelable(Student.class.getClassLoader())) == null) {
            student = new Student(0L, null, null, null, null, 31, null);
        }
        final StudentAbsence.CREATOR creator = StudentAbsence.CREATOR;
        ArrayList<StudentAbsence> typedArrayList;
        if ((typedArrayList = (ArrayList<StudentAbsence>)parcel.createTypedArrayList((Parcelable$Creator)creator)) == null) {
            typedArrayList = new ArrayList<StudentAbsence>();
        }
        ArrayList<StudentAbsence> typedArrayList2;
        if ((typedArrayList2 = (ArrayList<StudentAbsence>)parcel.createTypedArrayList((Parcelable$Creator)creator)) == null) {
            typedArrayList2 = new ArrayList<StudentAbsence>();
        }
        ArrayList<StudentAttendance> typedArrayList3;
        if ((typedArrayList3 = (ArrayList<StudentAttendance>)parcel.createTypedArrayList((Parcelable$Creator)StudentAttendance.CREATOR)) == null) {
            typedArrayList3 = new ArrayList<StudentAttendance>();
        }
        this(student, typedArrayList, typedArrayList2, typedArrayList3, parcel.readByte() != 0);
    }
    
    public StudentAbsenceResult(@e final Student student, @e final List<StudentAbsence> absences, @e final List<StudentAbsence> conflicts, @e final List<StudentAttendance> attendances, final boolean separateSaveAllowed) {
        k0.p(student, "student");
        k0.p(absences, "absences");
        k0.p(conflicts, "conflicts");
        k0.p(attendances, "attendances");
        this.student = student;
        this.absences = absences;
        this.conflicts = conflicts;
        this.attendances = attendances;
        this.separateSaveAllowed = separateSaveAllowed;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @e
    public final List<StudentAbsence> getAbsences() {
        return this.absences;
    }
    
    @e
    public final List<StudentAttendance> getAttendances() {
        return this.attendances;
    }
    
    @e
    public final List<StudentAbsence> getConflicts() {
        return this.conflicts;
    }
    
    public final boolean getSeparateSaveAllowed() {
        return this.separateSaveAllowed;
    }
    
    @e
    public final Student getStudent() {
        return this.student;
    }
    
    public final void setAbsences(@e final List<StudentAbsence> absences) {
        k0.p(absences, "<set-?>");
        this.absences = absences;
    }
    
    public final void setAttendances(@e final List<StudentAttendance> attendances) {
        k0.p(attendances, "<set-?>");
        this.attendances = attendances;
    }
    
    public final void setConflicts(@e final List<StudentAbsence> conflicts) {
        k0.p(conflicts, "<set-?>");
        this.conflicts = conflicts;
    }
    
    public final void setSeparateSaveAllowed(final boolean separateSaveAllowed) {
        this.separateSaveAllowed = separateSaveAllowed;
    }
    
    public final void setStudent(@e final Student student) {
        k0.p(student, "<set-?>");
        this.student = student;
    }
    
    public void writeToParcel(@e final Parcel parcel, final int n) {
        k0.p(parcel, "parcel");
        parcel.writeParcelable((Parcelable)this.student, n);
        parcel.writeTypedList((List)this.absences);
        parcel.writeTypedList((List)this.conflicts);
        parcel.writeTypedList((List)this.attendances);
        parcel.writeByte((byte)(byte)(this.separateSaveAllowed ? 1 : 0));
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r" }, d2 = { "Lcom/untis/mobile/persistence/models/classbook/absence/StudentAbsenceResult$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/untis/mobile/persistence/models/classbook/absence/StudentAbsenceResult;", "Landroid/os/Parcel;", "parcel", "createFromParcel", "", "size", "", "newArray", "(I)[Lcom/untis/mobile/persistence/models/classbook/absence/StudentAbsenceResult;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class CREATOR implements Parcelable$Creator<StudentAbsenceResult>
    {
        private CREATOR() {
        }
        
        @e
        public StudentAbsenceResult createFromParcel(@e final Parcel parcel) {
            k0.p(parcel, "parcel");
            return new StudentAbsenceResult(parcel);
        }
        
        @e
        public StudentAbsenceResult[] newArray(final int n) {
            return new StudentAbsenceResult[n];
        }
    }
}
