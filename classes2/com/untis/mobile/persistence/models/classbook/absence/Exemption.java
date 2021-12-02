// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.classbook.absence;

import android.os.Parcelable$Creator;
import a4.a;
import java.util.Objects;
import com.untis.mobile.persistence.models.EntityType;
import android.os.Parcel;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import com.untis.mobile.persistence.models.WeekDay;
import org.jetbrains.annotations.f;
import com.untis.mobile.persistence.models.masterdata.Subject;
import com.untis.mobile.persistence.models.masterdata.Student;
import org.joda.time.v;
import org.joda.time.t;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.persistence.models.Entity;
import android.os.Parcelable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 R2\u00020\u00012\u00020\u0002:\u0001RBy\u0012\b\b\u0002\u0010+\u001a\u00020\u0003\u0012\b\b\u0002\u00102\u001a\u000201\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010H\u0012\b\b\u0002\u0010;\u001a\u00020\u0013\u0012\b\b\u0002\u00108\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010E\u001a\u00020\u001a\u0012\b\b\u0002\u0010(\u001a\u00020!\u0012\b\b\u0002\u0010\"\u001a\u00020!\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010>\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\bO\u0010PB\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\bO\u0010QJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\tH\u0016J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u0012\u001a\u00020\tH\u0016R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\"\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%\"\u0004\b*\u0010'R\"\u0010+\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00102\u001a\u0002018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u00108\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010\u0015\u001a\u0004\b9\u0010\u0017\"\u0004\b:\u0010\u0019R\"\u0010;\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010\u0015\u001a\u0004\b<\u0010\u0017\"\u0004\b=\u0010\u0019R$\u0010?\u001a\u0004\u0018\u00010>8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010E\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010\u001c\u001a\u0004\bF\u0010\u001e\"\u0004\bG\u0010 R$\u0010I\u001a\u0004\u0018\u00010H8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010N¨\u0006S" }, d2 = { "Lcom/untis/mobile/persistence/models/classbook/absence/Exemption;", "Landroid/os/Parcelable;", "Lcom/untis/mobile/persistence/models/Entity;", "", "entityId", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/j2;", "writeToParcel", "describeContents", "", "other", "", "equals", "hashCode", "", "text", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "Lorg/joda/time/t;", "startDate", "Lorg/joda/time/t;", "getStartDate", "()Lorg/joda/time/t;", "setStartDate", "(Lorg/joda/time/t;)V", "Lorg/joda/time/v;", "endTime", "Lorg/joda/time/v;", "getEndTime", "()Lorg/joda/time/v;", "setEndTime", "(Lorg/joda/time/v;)V", "startTime", "getStartTime", "setStartTime", "id", "J", "getId", "()J", "setId", "(J)V", "Lcom/untis/mobile/persistence/models/masterdata/Student;", "student", "Lcom/untis/mobile/persistence/models/masterdata/Student;", "getStudent", "()Lcom/untis/mobile/persistence/models/masterdata/Student;", "setStudent", "(Lcom/untis/mobile/persistence/models/masterdata/Student;)V", "exemptionReason", "getExemptionReason", "setExemptionReason", "subjectGroup", "getSubjectGroup", "setSubjectGroup", "Lcom/untis/mobile/persistence/models/WeekDay;", "weekDay", "Lcom/untis/mobile/persistence/models/WeekDay;", "getWeekDay", "()Lcom/untis/mobile/persistence/models/WeekDay;", "setWeekDay", "(Lcom/untis/mobile/persistence/models/WeekDay;)V", "endDate", "getEndDate", "setEndDate", "Lcom/untis/mobile/persistence/models/masterdata/Subject;", "subject", "Lcom/untis/mobile/persistence/models/masterdata/Subject;", "getSubject", "()Lcom/untis/mobile/persistence/models/masterdata/Subject;", "setSubject", "(Lcom/untis/mobile/persistence/models/masterdata/Subject;)V", "<init>", "(JLcom/untis/mobile/persistence/models/masterdata/Student;Lcom/untis/mobile/persistence/models/masterdata/Subject;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/t;Lorg/joda/time/t;Lorg/joda/time/v;Lorg/joda/time/v;Lcom/untis/mobile/persistence/models/WeekDay;Ljava/lang/String;)V", "(Landroid/os/Parcel;)V", "CREATOR", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class Exemption implements Parcelable, Entity
{
    @e
    public static final CREATOR CREATOR;
    @e
    private t endDate;
    @e
    private v endTime;
    @e
    private String exemptionReason;
    private long id;
    @e
    private t startDate;
    @e
    private v startTime;
    @e
    private Student student;
    @f
    private Subject subject;
    @e
    private String subjectGroup;
    @e
    private String text;
    @f
    private WeekDay weekDay;
    
    static {
        CREATOR = new CREATOR(null);
    }
    
    public Exemption() {
        this(0L, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }
    
    public Exemption(final long id, @e final Student student, @f final Subject subject, @e final String subjectGroup, @e final String exemptionReason, @e final t startDate, @e final t endDate, @e final v startTime, @e final v endTime, @f final WeekDay weekDay, @e final String text) {
        k0.p(student, "student");
        k0.p(subjectGroup, "subjectGroup");
        k0.p(exemptionReason, "exemptionReason");
        k0.p(startDate, "startDate");
        k0.p(endDate, "endDate");
        k0.p(startTime, "startTime");
        k0.p(endTime, "endTime");
        k0.p(text, "text");
        this.id = id;
        this.student = student;
        this.subject = subject;
        this.subjectGroup = subjectGroup;
        this.exemptionReason = exemptionReason;
        this.startDate = startDate;
        this.endDate = endDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.weekDay = weekDay;
        this.text = text;
    }
    
    public Exemption(@e final Parcel parcel) {
        k0.p(parcel, "parcel");
        final long long1 = parcel.readLong();
        Student student = (Student)parcel.readParcelable(Student.class.getClassLoader());
        if (student == null) {
            student = new Student(0L, null, null, null, null, 31, null);
        }
        final Subject subject = (Subject)parcel.readParcelable(Subject.class.getClassLoader());
        String string = parcel.readString();
        if (string == null) {
            string = "";
        }
        String string2 = parcel.readString();
        if (string2 == null) {
            string2 = "";
        }
        final t c0 = t.c0(parcel.readString());
        k0.o(c0, "parse(parcel.readString())");
        final t c2 = t.c0(parcel.readString());
        k0.o(c2, "parse(parcel.readString())");
        final v c3 = v.c0(parcel.readString());
        k0.o(c3, "parse(parcel.readString())");
        final v c4 = v.c0(parcel.readString());
        k0.o(c4, "parse(parcel.readString())");
        final WeekDay access$weekDayOrNull = Exemption.CREATOR.weekDayOrNull(parcel.readInt());
        String string3 = parcel.readString();
        if (string3 == null) {
            string3 = "";
        }
        this(long1, student, subject, string, string2, c0, c2, c3, c4, access$weekDayOrNull, string3);
    }
    
    public int describeContents() {
        return 0;
    }
    
    public long entityId() {
        return this.id;
    }
    
    @e
    public EntityType entityType() {
        return EntityType.EXEMPTION;
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
        if (!k0.g(Exemption.class, class1)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.untis.mobile.persistence.models.classbook.absence.Exemption");
        return this.id == ((Exemption)obj).id;
    }
    
    @e
    public final t getEndDate() {
        return this.endDate;
    }
    
    @e
    public final v getEndTime() {
        return this.endTime;
    }
    
    @e
    public final String getExemptionReason() {
        return this.exemptionReason;
    }
    
    public final long getId() {
        return this.id;
    }
    
    @e
    public final t getStartDate() {
        return this.startDate;
    }
    
    @e
    public final v getStartTime() {
        return this.startTime;
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
    public final String getSubjectGroup() {
        return this.subjectGroup;
    }
    
    @e
    public final String getText() {
        return this.text;
    }
    
    @f
    public final WeekDay getWeekDay() {
        return this.weekDay;
    }
    
    @Override
    public int hashCode() {
        return a.a(this.id);
    }
    
    public final void setEndDate(@e final t endDate) {
        k0.p(endDate, "<set-?>");
        this.endDate = endDate;
    }
    
    public final void setEndTime(@e final v endTime) {
        k0.p(endTime, "<set-?>");
        this.endTime = endTime;
    }
    
    public final void setExemptionReason(@e final String exemptionReason) {
        k0.p(exemptionReason, "<set-?>");
        this.exemptionReason = exemptionReason;
    }
    
    public final void setId(final long id) {
        this.id = id;
    }
    
    public final void setStartDate(@e final t startDate) {
        k0.p(startDate, "<set-?>");
        this.startDate = startDate;
    }
    
    public final void setStartTime(@e final v startTime) {
        k0.p(startTime, "<set-?>");
        this.startTime = startTime;
    }
    
    public final void setStudent(@e final Student student) {
        k0.p(student, "<set-?>");
        this.student = student;
    }
    
    public final void setSubject(@f final Subject subject) {
        this.subject = subject;
    }
    
    public final void setSubjectGroup(@e final String subjectGroup) {
        k0.p(subjectGroup, "<set-?>");
        this.subjectGroup = subjectGroup;
    }
    
    public final void setText(@e final String text) {
        k0.p(text, "<set-?>");
        this.text = text;
    }
    
    public final void setWeekDay(@f final WeekDay weekDay) {
        this.weekDay = weekDay;
    }
    
    public void writeToParcel(@e final Parcel parcel, int dateTimeConstant) {
        k0.p(parcel, "parcel");
        parcel.writeLong(this.id);
        parcel.writeParcelable((Parcelable)this.student, dateTimeConstant);
        parcel.writeParcelable((Parcelable)this.subject, dateTimeConstant);
        parcel.writeString(this.subjectGroup);
        parcel.writeString(this.exemptionReason);
        parcel.writeString(this.startDate.toString());
        parcel.writeString(this.endDate.toString());
        parcel.writeString(this.startTime.toString());
        parcel.writeString(this.endTime.toString());
        final WeekDay weekDay = this.weekDay;
        if (weekDay == null) {
            dateTimeConstant = -1;
        }
        else {
            dateTimeConstant = weekDay.getDateTimeConstant();
        }
        parcel.writeInt(dateTimeConstant);
        parcel.writeString(this.text);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010" }, d2 = { "Lcom/untis/mobile/persistence/models/classbook/absence/Exemption$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/untis/mobile/persistence/models/classbook/absence/Exemption;", "", "dateTimeConstant", "Lcom/untis/mobile/persistence/models/WeekDay;", "weekDayOrNull", "Landroid/os/Parcel;", "parcel", "createFromParcel", "size", "", "newArray", "(I)[Lcom/untis/mobile/persistence/models/classbook/absence/Exemption;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class CREATOR implements Parcelable$Creator<Exemption>
    {
        private CREATOR() {
        }
        
        private final WeekDay weekDayOrNull(final int n) {
            WeekDay fromDateTimeConstant;
            if (n == -1) {
                fromDateTimeConstant = null;
            }
            else {
                fromDateTimeConstant = WeekDay.fromDateTimeConstant(n);
            }
            return fromDateTimeConstant;
        }
        
        @e
        public Exemption createFromParcel(@e final Parcel parcel) {
            k0.p(parcel, "parcel");
            return new Exemption(parcel);
        }
        
        @e
        public Exemption[] newArray(final int n) {
            return new Exemption[n];
        }
    }
}
