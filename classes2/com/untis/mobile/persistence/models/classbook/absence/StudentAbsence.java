// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.classbook.absence;

import org.joda.time.base.g;
import android.os.Parcelable$Creator;
import a4.a;
import java.util.Objects;
import android.os.Parcel;
import org.joda.time.t;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import com.untis.mobile.persistence.models.masterdata.Student;
import com.untis.mobile.persistence.models.masterdata.Klasse;
import org.joda.time.c;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 T2\u00020\u0001:\u0001TB\u0085\u0001\u0012\b\b\u0002\u0010N\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010H\u001a\u00020G\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\b\b\u0002\u00101\u001a\u000200\u0012\b\b\u0002\u00107\u001a\u000200\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010D\u001a\u00020\n\u0012\b\b\u0002\u0010;\u001a\u00020:\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\b\u0002\u0010A\u001a\u00020\n¢\u0006\u0004\bQ\u0010RB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\bQ\u0010SJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016R\"\u0010\u000e\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010#\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010*\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00101\u001a\u0002008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u00107\u001a\u0002008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00102\u001a\u0004\b8\u00104\"\u0004\b9\u00106R\"\u0010;\u001a\u00020:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010A\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010\u000f\u001a\u0004\bB\u0010\u0011\"\u0004\bC\u0010\u0013R\"\u0010D\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010\u000f\u001a\u0004\bE\u0010\u0011\"\u0004\bF\u0010\u0013R\"\u0010H\u001a\u00020G8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010N\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010\u0016\u001a\u0004\bO\u0010\u0018\"\u0004\bP\u0010\u001a¨\u0006U" }, d2 = { "Lcom/untis/mobile/persistence/models/classbook/absence/StudentAbsence;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/j2;", "writeToParcel", "", "other", "", "equals", "hashCode", "describeContents", "excused", "Z", "getExcused", "()Z", "setExcused", "(Z)V", "", "periodId", "J", "getPeriodId", "()J", "setPeriodId", "(J)V", "Lcom/untis/mobile/persistence/models/classbook/absence/AbsenceReason;", "absenceReason", "Lcom/untis/mobile/persistence/models/classbook/absence/AbsenceReason;", "getAbsenceReason", "()Lcom/untis/mobile/persistence/models/classbook/absence/AbsenceReason;", "setAbsenceReason", "(Lcom/untis/mobile/persistence/models/classbook/absence/AbsenceReason;)V", "Lcom/untis/mobile/persistence/models/classbook/absence/Excuse;", "excuse", "Lcom/untis/mobile/persistence/models/classbook/absence/Excuse;", "getExcuse", "()Lcom/untis/mobile/persistence/models/classbook/absence/Excuse;", "setExcuse", "(Lcom/untis/mobile/persistence/models/classbook/absence/Excuse;)V", "Lcom/untis/mobile/persistence/models/masterdata/Klasse;", "klasse", "Lcom/untis/mobile/persistence/models/masterdata/Klasse;", "getKlasse", "()Lcom/untis/mobile/persistence/models/masterdata/Klasse;", "setKlasse", "(Lcom/untis/mobile/persistence/models/masterdata/Klasse;)V", "Lorg/joda/time/c;", "start", "Lorg/joda/time/c;", "getStart", "()Lorg/joda/time/c;", "setStart", "(Lorg/joda/time/c;)V", "end", "getEnd", "setEnd", "", "text", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "synced", "getSynced", "setSynced", "owner", "getOwner", "setOwner", "Lcom/untis/mobile/persistence/models/masterdata/Student;", "student", "Lcom/untis/mobile/persistence/models/masterdata/Student;", "getStudent", "()Lcom/untis/mobile/persistence/models/masterdata/Student;", "setStudent", "(Lcom/untis/mobile/persistence/models/masterdata/Student;)V", "id", "getId", "setId", "<init>", "(JJLcom/untis/mobile/persistence/models/masterdata/Student;Lcom/untis/mobile/persistence/models/masterdata/Klasse;Lorg/joda/time/c;Lorg/joda/time/c;ZLcom/untis/mobile/persistence/models/classbook/absence/AbsenceReason;ZLjava/lang/String;Lcom/untis/mobile/persistence/models/classbook/absence/Excuse;Z)V", "(Landroid/os/Parcel;)V", "CREATOR", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class StudentAbsence implements Parcelable
{
    @e
    public static final CREATOR CREATOR;
    @f
    private AbsenceReason absenceReason;
    @e
    private c end;
    @f
    private Excuse excuse;
    private boolean excused;
    private long id;
    @f
    private Klasse klasse;
    private boolean owner;
    private long periodId;
    @e
    private c start;
    @e
    private Student student;
    private boolean synced;
    @e
    private String text;
    
    static {
        CREATOR = new CREATOR(null);
    }
    
    public StudentAbsence() {
        this(0L, 0L, null, null, null, null, false, null, false, null, null, false, 4095, null);
    }
    
    public StudentAbsence(final long id, final long periodId, @e final Student student, @f final Klasse klasse, @e final c start, @e final c end, final boolean excused, @f final AbsenceReason absenceReason, final boolean owner, @e final String text, @f final Excuse excuse, final boolean synced) {
        k0.p(student, "student");
        k0.p(start, "start");
        k0.p(end, "end");
        k0.p(text, "text");
        this.id = id;
        this.periodId = periodId;
        this.student = student;
        this.klasse = klasse;
        this.start = start;
        this.end = end;
        this.excused = excused;
        this.absenceReason = absenceReason;
        this.owner = owner;
        this.text = text;
        this.excuse = excuse;
        this.synced = synced;
    }
    
    public StudentAbsence(@e final Parcel parcel) {
        k0.p(parcel, "parcel");
        final long long1 = parcel.readLong();
        final long long2 = parcel.readLong();
        Student student = (Student)parcel.readParcelable(Student.class.getClassLoader());
        if (student == null) {
            student = new Student(0L, null, null, null, null, 31, null);
        }
        final Klasse klasse = (Klasse)parcel.readParcelable(Klasse.class.getClassLoader());
        final c c = new c(parcel.readLong());
        final c c2 = new c(parcel.readLong());
        final boolean b = parcel.readByte() != 0;
        final AbsenceReason absenceReason = (AbsenceReason)parcel.readParcelable(AbsenceReason.class.getClassLoader());
        final boolean b2 = parcel.readByte() != 0;
        String string;
        if ((string = parcel.readString()) == null) {
            string = "";
        }
        this(long1, long2, student, klasse, c, c2, b, absenceReason, b2, string, (Excuse)parcel.readParcelable(Excuse.class.getClassLoader()), parcel.readByte() != 0);
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
        if (!k0.g(StudentAbsence.class, class1)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.untis.mobile.persistence.models.classbook.absence.StudentAbsence");
        return this.id == ((StudentAbsence)obj).id;
    }
    
    @f
    public final AbsenceReason getAbsenceReason() {
        return this.absenceReason;
    }
    
    @e
    public final c getEnd() {
        return this.end;
    }
    
    @f
    public final Excuse getExcuse() {
        return this.excuse;
    }
    
    public final boolean getExcused() {
        return this.excused;
    }
    
    public final long getId() {
        return this.id;
    }
    
    @f
    public final Klasse getKlasse() {
        return this.klasse;
    }
    
    public final boolean getOwner() {
        return this.owner;
    }
    
    public final long getPeriodId() {
        return this.periodId;
    }
    
    @e
    public final c getStart() {
        return this.start;
    }
    
    @e
    public final Student getStudent() {
        return this.student;
    }
    
    public final boolean getSynced() {
        return this.synced;
    }
    
    @e
    public final String getText() {
        return this.text;
    }
    
    @Override
    public int hashCode() {
        return a.a(this.id);
    }
    
    public final void setAbsenceReason(@f final AbsenceReason absenceReason) {
        this.absenceReason = absenceReason;
    }
    
    public final void setEnd(@e final c end) {
        k0.p(end, "<set-?>");
        this.end = end;
    }
    
    public final void setExcuse(@f final Excuse excuse) {
        this.excuse = excuse;
    }
    
    public final void setExcused(final boolean excused) {
        this.excused = excused;
    }
    
    public final void setId(final long id) {
        this.id = id;
    }
    
    public final void setKlasse(@f final Klasse klasse) {
        this.klasse = klasse;
    }
    
    public final void setOwner(final boolean owner) {
        this.owner = owner;
    }
    
    public final void setPeriodId(final long periodId) {
        this.periodId = periodId;
    }
    
    public final void setStart(@e final c start) {
        k0.p(start, "<set-?>");
        this.start = start;
    }
    
    public final void setStudent(@e final Student student) {
        k0.p(student, "<set-?>");
        this.student = student;
    }
    
    public final void setSynced(final boolean synced) {
        this.synced = synced;
    }
    
    public final void setText(@e final String text) {
        k0.p(text, "<set-?>");
        this.text = text;
    }
    
    public void writeToParcel(@e final Parcel parcel, final int n) {
        k0.p(parcel, "parcel");
        parcel.writeLong(this.id);
        parcel.writeLong(this.periodId);
        parcel.writeParcelable((Parcelable)this.student, n);
        parcel.writeParcelable((Parcelable)this.klasse, n);
        parcel.writeLong(((g)this.start).n());
        parcel.writeLong(((g)this.end).n());
        parcel.writeByte((byte)(byte)(this.excused ? 1 : 0));
        parcel.writeParcelable((Parcelable)this.absenceReason, n);
        parcel.writeByte((byte)(byte)(this.owner ? 1 : 0));
        parcel.writeString(this.text);
        parcel.writeParcelable((Parcelable)this.excuse, n);
        parcel.writeByte((byte)(byte)(this.synced ? 1 : 0));
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r" }, d2 = { "Lcom/untis/mobile/persistence/models/classbook/absence/StudentAbsence$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/untis/mobile/persistence/models/classbook/absence/StudentAbsence;", "Landroid/os/Parcel;", "parcel", "createFromParcel", "", "size", "", "newArray", "(I)[Lcom/untis/mobile/persistence/models/classbook/absence/StudentAbsence;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class CREATOR implements Parcelable$Creator<StudentAbsence>
    {
        private CREATOR() {
        }
        
        @e
        public StudentAbsence createFromParcel(@e final Parcel parcel) {
            k0.p(parcel, "parcel");
            return new StudentAbsence(parcel);
        }
        
        @e
        public StudentAbsence[] newArray(final int n) {
            return new StudentAbsence[n];
        }
    }
}
