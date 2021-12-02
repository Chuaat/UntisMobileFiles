// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.exam;

import a4.a;
import org.joda.time.l0;
import org.joda.time.r;
import java.util.Objects;
import android.os.Parcelable$Creator;
import android.os.Parcel;
import java.util.ArrayList;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import com.untis.mobile.persistence.models.masterdata.Teacher;
import com.untis.mobile.persistence.models.masterdata.Subject;
import com.untis.mobile.persistence.models.masterdata.Room;
import com.untis.mobile.persistence.models.masterdata.Klasse;
import java.util.List;
import com.untis.mobile.persistence.models.EntityType;
import org.joda.time.c;
import org.jetbrains.annotations.f;
import com.untis.mobile.persistence.models.masterdata.Department;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 _2\u00020\u0001:\u0001_B¯\u0001\u0012\b\b\u0002\u0010%\u001a\u00020$\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d\u0012\b\b\u0002\u00109\u001a\u00020\u001d\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000102\u0012\n\b\u0002\u0010V\u001a\u0004\u0018\u00010U\u0012\u000e\b\u0002\u0010H\u001a\b\u0012\u0004\u0012\u00020G0\u0015\u0012\u000e\b\u0002\u0010O\u001a\b\u0012\u0004\u0012\u00020N0\u0015\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u000e\b\u0002\u0010D\u001a\b\u0012\u0004\u0012\u00020C0\u0015\u0012\b\b\u0002\u0010R\u001a\u00020\u000e\u0012\b\b\u0002\u0010+\u001a\u00020\u000e\u0012\b\b\u0002\u0010=\u001a\u00020<\u0012\b\b\u0002\u0010K\u001a\u00020$¢\u0006\u0004\b\\\u0010]B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\\\u0010^J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\r\u001a\u00020\u0004H\u0016R\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R(\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001e\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010%\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010+\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010\u0010\u001a\u0004\b,\u0010\u0012\"\u0004\b-\u0010\u0014R\u0013\u00101\u001a\u00020.8F@\u0006¢\u0006\u0006\u001a\u0004\b/\u00100R$\u00103\u001a\u0004\u0018\u0001028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u00109\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010\u001f\u001a\u0004\b:\u0010!\"\u0004\b;\u0010#R\"\u0010=\u001a\u00020<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR(\u0010D\u001a\b\u0012\u0004\u0012\u00020C0\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010\u0018\u001a\u0004\bE\u0010\u001a\"\u0004\bF\u0010\u001cR(\u0010H\u001a\b\u0012\u0004\u0012\u00020G0\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010\u0018\u001a\u0004\bI\u0010\u001a\"\u0004\bJ\u0010\u001cR\"\u0010K\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010&\u001a\u0004\bL\u0010(\"\u0004\bM\u0010*R(\u0010O\u001a\b\u0012\u0004\u0012\u00020N0\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010\u0018\u001a\u0004\bP\u0010\u001a\"\u0004\bQ\u0010\u001cR\"\u0010R\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010\u0010\u001a\u0004\bS\u0010\u0012\"\u0004\bT\u0010\u0014R$\u0010V\u001a\u0004\u0018\u00010U8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[¨\u0006`" }, d2 = { "Lcom/untis/mobile/persistence/models/exam/Exam;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/j2;", "writeToParcel", "describeContents", "", "other", "", "equals", "hashCode", "", "examType", "Ljava/lang/String;", "getExamType", "()Ljava/lang/String;", "setExamType", "(Ljava/lang/String;)V", "", "Lcom/untis/mobile/persistence/models/masterdata/Teacher;", "teachers", "Ljava/util/List;", "getTeachers", "()Ljava/util/List;", "setTeachers", "(Ljava/util/List;)V", "Lorg/joda/time/c;", "start", "Lorg/joda/time/c;", "getStart", "()Lorg/joda/time/c;", "setStart", "(Lorg/joda/time/c;)V", "", "id", "J", "getId", "()J", "setId", "(J)V", "text", "getText", "setText", "Lorg/joda/time/r;", "getInterval", "()Lorg/joda/time/r;", "interval", "Lcom/untis/mobile/persistence/models/masterdata/Department;", "department", "Lcom/untis/mobile/persistence/models/masterdata/Department;", "getDepartment", "()Lcom/untis/mobile/persistence/models/masterdata/Department;", "setDepartment", "(Lcom/untis/mobile/persistence/models/masterdata/Department;)V", "end", "getEnd", "setEnd", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "Lcom/untis/mobile/persistence/models/EntityType;", "getEntityType", "()Lcom/untis/mobile/persistence/models/EntityType;", "setEntityType", "(Lcom/untis/mobile/persistence/models/EntityType;)V", "Lcom/untis/mobile/persistence/models/exam/Invigilator;", "invigilators", "getInvigilators", "setInvigilators", "Lcom/untis/mobile/persistence/models/masterdata/Klasse;", "klasses", "getKlasses", "setKlasses", "entityId", "getEntityId", "setEntityId", "Lcom/untis/mobile/persistence/models/masterdata/Room;", "rooms", "getRooms", "setRooms", "name", "getName", "setName", "Lcom/untis/mobile/persistence/models/masterdata/Subject;", "subject", "Lcom/untis/mobile/persistence/models/masterdata/Subject;", "getSubject", "()Lcom/untis/mobile/persistence/models/masterdata/Subject;", "setSubject", "(Lcom/untis/mobile/persistence/models/masterdata/Subject;)V", "<init>", "(JLjava/lang/String;Lorg/joda/time/c;Lorg/joda/time/c;Lcom/untis/mobile/persistence/models/masterdata/Department;Lcom/untis/mobile/persistence/models/masterdata/Subject;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/untis/mobile/persistence/models/EntityType;J)V", "(Landroid/os/Parcel;)V", "CREATOR", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class Exam implements Parcelable
{
    @e
    public static final CREATOR CREATOR;
    @f
    private Department department;
    @e
    private c end;
    private long entityId;
    @e
    private EntityType entityType;
    @e
    private String examType;
    private long id;
    @e
    private List<Invigilator> invigilators;
    @e
    private List<Klasse> klasses;
    @e
    private String name;
    @e
    private List<Room> rooms;
    @e
    private c start;
    @f
    private Subject subject;
    @e
    private List<Teacher> teachers;
    @e
    private String text;
    
    static {
        CREATOR = new CREATOR(null);
    }
    
    public Exam() {
        this(0L, null, null, null, null, null, null, null, null, null, null, null, null, 0L, 16383, null);
    }
    
    public Exam(final long id, @e final String examType, @e final c start, @e final c end, @f final Department department, @f final Subject subject, @e final List<Klasse> klasses, @e final List<Room> rooms, @e final List<Teacher> teachers, @e final List<Invigilator> invigilators, @e final String name, @e final String text, @e final EntityType entityType, final long entityId) {
        k0.p(examType, "examType");
        k0.p(start, "start");
        k0.p(end, "end");
        k0.p(klasses, "klasses");
        k0.p(rooms, "rooms");
        k0.p(teachers, "teachers");
        k0.p(invigilators, "invigilators");
        k0.p(name, "name");
        k0.p(text, "text");
        k0.p(entityType, "entityType");
        this.id = id;
        this.examType = examType;
        this.start = start;
        this.end = end;
        this.department = department;
        this.subject = subject;
        this.klasses = klasses;
        this.rooms = rooms;
        this.teachers = teachers;
        this.invigilators = invigilators;
        this.name = name;
        this.text = text;
        this.entityType = entityType;
        this.entityId = entityId;
    }
    
    public Exam(@e final Parcel parcel) {
        k0.p(parcel, "parcel");
        final long long1 = parcel.readLong();
        String string = parcel.readString();
        if (string == null) {
            string = "";
        }
        final c k0 = c.K0(parcel.readString());
        kotlin.jvm.internal.k0.o(k0, "parse(parcel.readString())");
        final c k2 = c.K0(parcel.readString());
        kotlin.jvm.internal.k0.o(k2, "parse(parcel.readString())");
        final Department department = (Department)parcel.readParcelable(Department.class.getClassLoader());
        final Subject subject = (Subject)parcel.readParcelable(Subject.class.getClassLoader());
        ArrayList<Klasse> typedArrayList;
        if ((typedArrayList = (ArrayList<Klasse>)parcel.createTypedArrayList((Parcelable$Creator)Klasse.CREATOR)) == null) {
            typedArrayList = new ArrayList<Klasse>();
        }
        ArrayList<Room> typedArrayList2;
        if ((typedArrayList2 = (ArrayList<Room>)parcel.createTypedArrayList((Parcelable$Creator)Room.CREATOR)) == null) {
            typedArrayList2 = new ArrayList<Room>();
        }
        ArrayList<Teacher> typedArrayList3;
        if ((typedArrayList3 = (ArrayList<Teacher>)parcel.createTypedArrayList((Parcelable$Creator)Teacher.CREATOR)) == null) {
            typedArrayList3 = new ArrayList<Teacher>();
        }
        ArrayList<Invigilator> typedArrayList4;
        if ((typedArrayList4 = (ArrayList<Invigilator>)parcel.createTypedArrayList((Parcelable$Creator)Invigilator.CREATOR)) == null) {
            typedArrayList4 = new ArrayList<Invigilator>();
        }
        String string2 = parcel.readString();
        if (string2 == null) {
            string2 = "";
        }
        String string3 = parcel.readString();
        if (string3 == null) {
            string3 = "";
        }
        this(long1, string, k0, k2, department, subject, typedArrayList, typedArrayList2, typedArrayList3, typedArrayList4, string2, string3, EntityType.Companion.findBy(parcel.readInt()), parcel.readLong());
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
        if (!k0.g(Exam.class, class1)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.untis.mobile.persistence.models.exam.Exam");
        return this.id == ((Exam)obj).id;
    }
    
    @f
    public final Department getDepartment() {
        return this.department;
    }
    
    @e
    public final c getEnd() {
        return this.end;
    }
    
    public final long getEntityId() {
        return this.entityId;
    }
    
    @e
    public final EntityType getEntityType() {
        return this.entityType;
    }
    
    @e
    public final String getExamType() {
        return this.examType;
    }
    
    public final long getId() {
        return this.id;
    }
    
    @e
    public final r getInterval() {
        return new r((l0)this.start, (l0)this.end);
    }
    
    @e
    public final List<Invigilator> getInvigilators() {
        return this.invigilators;
    }
    
    @e
    public final List<Klasse> getKlasses() {
        return this.klasses;
    }
    
    @e
    public final String getName() {
        return this.name;
    }
    
    @e
    public final List<Room> getRooms() {
        return this.rooms;
    }
    
    @e
    public final c getStart() {
        return this.start;
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
    public final String getText() {
        return this.text;
    }
    
    @Override
    public int hashCode() {
        return a.a(this.id);
    }
    
    public final void setDepartment(@f final Department department) {
        this.department = department;
    }
    
    public final void setEnd(@e final c end) {
        k0.p(end, "<set-?>");
        this.end = end;
    }
    
    public final void setEntityId(final long entityId) {
        this.entityId = entityId;
    }
    
    public final void setEntityType(@e final EntityType entityType) {
        k0.p(entityType, "<set-?>");
        this.entityType = entityType;
    }
    
    public final void setExamType(@e final String examType) {
        k0.p(examType, "<set-?>");
        this.examType = examType;
    }
    
    public final void setId(final long id) {
        this.id = id;
    }
    
    public final void setInvigilators(@e final List<Invigilator> invigilators) {
        k0.p(invigilators, "<set-?>");
        this.invigilators = invigilators;
    }
    
    public final void setKlasses(@e final List<Klasse> klasses) {
        k0.p(klasses, "<set-?>");
        this.klasses = klasses;
    }
    
    public final void setName(@e final String name) {
        k0.p(name, "<set-?>");
        this.name = name;
    }
    
    public final void setRooms(@e final List<Room> rooms) {
        k0.p(rooms, "<set-?>");
        this.rooms = rooms;
    }
    
    public final void setStart(@e final c start) {
        k0.p(start, "<set-?>");
        this.start = start;
    }
    
    public final void setSubject(@f final Subject subject) {
        this.subject = subject;
    }
    
    public final void setTeachers(@e final List<Teacher> teachers) {
        k0.p(teachers, "<set-?>");
        this.teachers = teachers;
    }
    
    public final void setText(@e final String text) {
        k0.p(text, "<set-?>");
        this.text = text;
    }
    
    public void writeToParcel(@e final Parcel parcel, final int n) {
        k0.p(parcel, "parcel");
        parcel.writeLong(this.id);
        parcel.writeString(this.examType);
        parcel.writeString(((org.joda.time.base.a)this.start).toString());
        parcel.writeString(((org.joda.time.base.a)this.end).toString());
        parcel.writeParcelable((Parcelable)this.department, n);
        parcel.writeParcelable((Parcelable)this.subject, n);
        parcel.writeTypedList((List)this.klasses);
        parcel.writeTypedList((List)this.rooms);
        parcel.writeTypedList((List)this.teachers);
        parcel.writeTypedList((List)this.invigilators);
        parcel.writeString(this.name);
        parcel.writeString(this.text);
        parcel.writeInt(this.entityType.getWebuntisId());
        parcel.writeLong(this.entityId);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r" }, d2 = { "Lcom/untis/mobile/persistence/models/exam/Exam$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/untis/mobile/persistence/models/exam/Exam;", "Landroid/os/Parcel;", "parcel", "createFromParcel", "", "size", "", "newArray", "(I)[Lcom/untis/mobile/persistence/models/exam/Exam;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class CREATOR implements Parcelable$Creator<Exam>
    {
        private CREATOR() {
        }
        
        @e
        public Exam createFromParcel(@e final Parcel parcel) {
            k0.p(parcel, "parcel");
            return new Exam(parcel);
        }
        
        @e
        public Exam[] newArray(final int n) {
            return new Exam[n];
        }
    }
}
