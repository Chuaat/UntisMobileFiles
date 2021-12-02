// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.parentday;

import a4.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import org.jetbrains.annotations.f;
import java.util.ArrayList;
import android.os.Parcelable$Creator;
import android.os.Parcel;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import java.util.List;
import org.joda.time.c;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u001a\u0018\u0000 82\u00020\u0001:\u00018BQ\u0012\b\b\u0002\u0010&\u001a\u00020\u001f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010)\u001a\u00020\u0012\u0012\b\b\u0002\u0010 \u001a\u00020\u001f\u0012\b\b\u0002\u00102\u001a\u00020\u001f\u0012\b\b\u0002\u0010,\u001a\u00020\u000b\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b5\u00106B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b5\u00107J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\r\u001a\u00020\u0004H\u0016J\u0006\u0010\u000e\u001a\u00020\u000bJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fR\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R(\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010 \u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%R\"\u0010)\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0014\u001a\u0004\b*\u0010\u0016\"\u0004\b+\u0010\u0018R\"\u0010,\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00102\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010!\u001a\u0004\b3\u0010#\"\u0004\b4\u0010%¨\u00069" }, d2 = { "Lcom/untis/mobile/persistence/models/parentday/ParentDayAppointment;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/j2;", "writeToParcel", "describeContents", "", "other", "", "equals", "hashCode", "hasStudentsWithSubject", "", "Lcom/untis/mobile/persistence/models/parentday/ParentDayStudent;", "getStudentsWithSubjects", "Lorg/joda/time/c;", "start", "Lorg/joda/time/c;", "getStart", "()Lorg/joda/time/c;", "setStart", "(Lorg/joda/time/c;)V", "students", "Ljava/util/List;", "getStudents", "()Ljava/util/List;", "setStudents", "(Ljava/util/List;)V", "", "teacherId", "J", "getTeacherId", "()J", "setTeacherId", "(J)V", "id", "getId", "setId", "end", "getEnd", "setEnd", "cancelled", "Z", "getCancelled", "()Z", "setCancelled", "(Z)V", "roomId", "getRoomId", "setRoomId", "<init>", "(JLorg/joda/time/c;Lorg/joda/time/c;JJZLjava/util/List;)V", "(Landroid/os/Parcel;)V", "CREATOR", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class ParentDayAppointment implements Parcelable
{
    @e
    public static final CREATOR CREATOR;
    private boolean cancelled;
    @e
    private c end;
    private long id;
    private long roomId;
    @e
    private c start;
    @e
    private List<ParentDayStudent> students;
    private long teacherId;
    
    static {
        CREATOR = new CREATOR(null);
    }
    
    public ParentDayAppointment(final long id, @e final c start, @e final c end, final long teacherId, final long roomId, final boolean cancelled, @e final List<ParentDayStudent> students) {
        k0.p(start, "start");
        k0.p(end, "end");
        k0.p(students, "students");
        this.id = id;
        this.start = start;
        this.end = end;
        this.teacherId = teacherId;
        this.roomId = roomId;
        this.cancelled = cancelled;
        this.students = students;
    }
    
    public ParentDayAppointment(@e final Parcel parcel) {
        k0.p(parcel, "parcel");
        final long long1 = parcel.readLong();
        final c k0 = c.K0(parcel.readString());
        kotlin.jvm.internal.k0.o(k0, "parse(parcel.readString())");
        final c k2 = c.K0(parcel.readString());
        kotlin.jvm.internal.k0.o(k2, "parse(parcel.readString())");
        final long long2 = parcel.readLong();
        final long long3 = parcel.readLong();
        final boolean b = parcel.readByte() != 0;
        ArrayList<ParentDayStudent> typedArrayList;
        if ((typedArrayList = (ArrayList<ParentDayStudent>)parcel.createTypedArrayList((Parcelable$Creator)ParentDayStudent.CREATOR)) == null) {
            typedArrayList = new ArrayList<ParentDayStudent>();
        }
        this(long1, k0, k2, long2, long3, b, typedArrayList);
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
        if (!k0.g(ParentDayAppointment.class, class1)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.untis.mobile.persistence.models.parentday.ParentDayAppointment");
        return this.id == ((ParentDayAppointment)obj).id;
    }
    
    public final boolean getCancelled() {
        return this.cancelled;
    }
    
    @e
    public final c getEnd() {
        return this.end;
    }
    
    public final long getId() {
        return this.id;
    }
    
    public final long getRoomId() {
        return this.roomId;
    }
    
    @e
    public final c getStart() {
        return this.start;
    }
    
    @e
    public final List<ParentDayStudent> getStudents() {
        return this.students;
    }
    
    @e
    public final List<ParentDayStudent> getStudentsWithSubjects() {
        final List<ParentDayStudent> students = this.students;
        final ArrayList<ParentDayStudent> list = new ArrayList<ParentDayStudent>();
        for (final ParentDayStudent next : students) {
            if (next.getSubjectIds().isEmpty() ^ true) {
                list.add(next);
            }
        }
        return list;
    }
    
    public final long getTeacherId() {
        return this.teacherId;
    }
    
    public final boolean hasStudentsWithSubject() {
        final List<ParentDayStudent> students = this.students;
        final boolean b = students instanceof Collection;
        boolean b2 = true;
        if (!b || !students.isEmpty()) {
            final Iterator<Object> iterator = students.iterator();
            while (iterator.hasNext()) {
                if (iterator.next().getSubjectIds().isEmpty() ^ true) {
                    return b2;
                }
            }
        }
        b2 = false;
        return b2;
    }
    
    @Override
    public int hashCode() {
        return a.a(this.id);
    }
    
    public final void setCancelled(final boolean cancelled) {
        this.cancelled = cancelled;
    }
    
    public final void setEnd(@e final c end) {
        k0.p(end, "<set-?>");
        this.end = end;
    }
    
    public final void setId(final long id) {
        this.id = id;
    }
    
    public final void setRoomId(final long roomId) {
        this.roomId = roomId;
    }
    
    public final void setStart(@e final c start) {
        k0.p(start, "<set-?>");
        this.start = start;
    }
    
    public final void setStudents(@e final List<ParentDayStudent> students) {
        k0.p(students, "<set-?>");
        this.students = students;
    }
    
    public final void setTeacherId(final long teacherId) {
        this.teacherId = teacherId;
    }
    
    public void writeToParcel(@e final Parcel parcel, final int n) {
        k0.p(parcel, "parcel");
        parcel.writeLong(this.id);
        parcel.writeString(((org.joda.time.base.a)this.start).toString());
        parcel.writeString(((org.joda.time.base.a)this.end).toString());
        parcel.writeLong(this.teacherId);
        parcel.writeLong(this.roomId);
        parcel.writeByte((byte)(byte)(this.cancelled ? 1 : 0));
        parcel.writeTypedList((List)this.students);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r" }, d2 = { "Lcom/untis/mobile/persistence/models/parentday/ParentDayAppointment$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/untis/mobile/persistence/models/parentday/ParentDayAppointment;", "Landroid/os/Parcel;", "parcel", "createFromParcel", "", "size", "", "newArray", "(I)[Lcom/untis/mobile/persistence/models/parentday/ParentDayAppointment;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class CREATOR implements Parcelable$Creator<ParentDayAppointment>
    {
        private CREATOR() {
        }
        
        @e
        public ParentDayAppointment createFromParcel(@e final Parcel parcel) {
            k0.p(parcel, "parcel");
            return new ParentDayAppointment(parcel);
        }
        
        @e
        public ParentDayAppointment[] newArray(final int n) {
            return new ParentDayAppointment[n];
        }
    }
}
