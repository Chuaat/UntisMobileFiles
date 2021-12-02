// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.exam;

import android.os.Parcelable$Creator;
import java.util.Objects;
import org.jetbrains.annotations.f;
import org.joda.time.t;
import kotlin.jvm.internal.k0;
import android.os.Parcel;
import kotlin.jvm.internal.w;
import com.untis.mobile.persistence.models.masterdata.Teacher;
import org.joda.time.v;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \"2\u00020\u0001:\u0001\"B%\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001f\u0010 B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010!J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016R\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006#" }, d2 = { "Lcom/untis/mobile/persistence/models/exam/Invigilator;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/j2;", "writeToParcel", "", "other", "", "equals", "hashCode", "describeContents", "Lorg/joda/time/v;", "end", "Lorg/joda/time/v;", "getEnd", "()Lorg/joda/time/v;", "setEnd", "(Lorg/joda/time/v;)V", "start", "getStart", "setStart", "Lcom/untis/mobile/persistence/models/masterdata/Teacher;", "teacher", "Lcom/untis/mobile/persistence/models/masterdata/Teacher;", "getTeacher", "()Lcom/untis/mobile/persistence/models/masterdata/Teacher;", "setTeacher", "(Lcom/untis/mobile/persistence/models/masterdata/Teacher;)V", "<init>", "(Lcom/untis/mobile/persistence/models/masterdata/Teacher;Lorg/joda/time/v;Lorg/joda/time/v;)V", "(Landroid/os/Parcel;)V", "CREATOR", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class Invigilator implements Parcelable
{
    @e
    public static final CREATOR CREATOR;
    @e
    private v end;
    @e
    private v start;
    @e
    private Teacher teacher;
    
    static {
        CREATOR = new CREATOR(null);
    }
    
    public Invigilator() {
        this(null, null, null, 7, null);
    }
    
    public Invigilator(@e final Parcel parcel) {
        k0.p(parcel, "parcel");
        Teacher teacher;
        if ((teacher = (Teacher)parcel.readParcelable(Teacher.class.getClassLoader())) == null) {
            teacher = new Teacher(0L, null, null, null, null, null, 0, 0, false, false, 1023, null);
        }
        final v c0 = v.c0(parcel.readString());
        k0.o(c0, "parse(parcel.readString())");
        final v c2 = v.c0(parcel.readString());
        k0.o(c2, "parse(parcel.readString())");
        this(teacher, c0, c2);
    }
    
    public Invigilator(@e final Teacher teacher, @e final v start, @e final v end) {
        k0.p(teacher, "teacher");
        k0.p(start, "start");
        k0.p(end, "end");
        this.teacher = teacher;
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
        if (!k0.g(Invigilator.class, class1)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.untis.mobile.persistence.models.exam.Invigilator");
        final Invigilator invigilator = (Invigilator)obj;
        return k0.g(this.teacher, invigilator.teacher) && k0.g(this.start, invigilator.start) && k0.g(this.end, invigilator.end);
    }
    
    @e
    public final v getEnd() {
        return this.end;
    }
    
    @e
    public final v getStart() {
        return this.start;
    }
    
    @e
    public final Teacher getTeacher() {
        return this.teacher;
    }
    
    @Override
    public int hashCode() {
        return (this.teacher.hashCode() * 31 + ((org.joda.time.base.e)this.start).hashCode()) * 31 + ((org.joda.time.base.e)this.end).hashCode();
    }
    
    public final void setEnd(@e final v end) {
        k0.p(end, "<set-?>");
        this.end = end;
    }
    
    public final void setStart(@e final v start) {
        k0.p(start, "<set-?>");
        this.start = start;
    }
    
    public final void setTeacher(@e final Teacher teacher) {
        k0.p(teacher, "<set-?>");
        this.teacher = teacher;
    }
    
    public void writeToParcel(@e final Parcel parcel, final int n) {
        k0.p(parcel, "parcel");
        parcel.writeParcelable((Parcelable)this.teacher, n);
        parcel.writeString(this.start.toString());
        parcel.writeString(this.end.toString());
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r" }, d2 = { "Lcom/untis/mobile/persistence/models/exam/Invigilator$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/untis/mobile/persistence/models/exam/Invigilator;", "Landroid/os/Parcel;", "parcel", "createFromParcel", "", "size", "", "newArray", "(I)[Lcom/untis/mobile/persistence/models/exam/Invigilator;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class CREATOR implements Parcelable$Creator<Invigilator>
    {
        private CREATOR() {
        }
        
        @e
        public Invigilator createFromParcel(@e final Parcel parcel) {
            k0.p(parcel, "parcel");
            return new Invigilator(parcel);
        }
        
        @e
        public Invigilator[] newArray(final int n) {
            return new Invigilator[n];
        }
    }
}
