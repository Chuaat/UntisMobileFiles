// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.parentday;

import android.os.Parcelable$Creator;
import java.util.Collection;
import a4.a;
import java.util.Objects;
import org.jetbrains.annotations.f;
import kotlin.collections.v;
import kotlin.collections.m;
import android.os.Parcel;
import java.util.ArrayList;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import java.util.List;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u000b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB!\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0015¢\u0006\u0004\b\u001c\u0010\u001dB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\r\u001a\u00020\u0004H\u0016R\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R(\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006 " }, d2 = { "Lcom/untis/mobile/persistence/models/parentday/ParentDayStudent;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/j2;", "writeToParcel", "describeContents", "", "other", "", "equals", "hashCode", "", "studentId", "J", "getStudentId", "()J", "setStudentId", "(J)V", "", "subjectIds", "Ljava/util/List;", "getSubjectIds", "()Ljava/util/List;", "setSubjectIds", "(Ljava/util/List;)V", "<init>", "(JLjava/util/List;)V", "(Landroid/os/Parcel;)V", "CREATOR", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class ParentDayStudent implements Parcelable
{
    @e
    public static final CREATOR CREATOR;
    private long studentId;
    @e
    private List<Long> subjectIds;
    
    static {
        CREATOR = new CREATOR(null);
    }
    
    public ParentDayStudent() {
        this(0L, null, 3, null);
    }
    
    public ParentDayStudent(final long studentId, @e final List<Long> subjectIds) {
        k0.p(subjectIds, "subjectIds");
        this.studentId = studentId;
        this.subjectIds = subjectIds;
    }
    
    public ParentDayStudent(@e final Parcel parcel) {
        k0.p(parcel, "parcel");
        final long long1 = parcel.readLong();
        final long[] longArray = parcel.createLongArray();
        List<Long> dy;
        if (longArray == null) {
            dy = null;
        }
        else {
            dy = m.dy(longArray);
        }
        List<Long> e = dy;
        if (dy == null) {
            e = v.E();
        }
        this(long1, e);
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
        if (!k0.g(ParentDayStudent.class, class1)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.untis.mobile.persistence.models.parentday.ParentDayStudent");
        return this.studentId == ((ParentDayStudent)obj).studentId;
    }
    
    public final long getStudentId() {
        return this.studentId;
    }
    
    @e
    public final List<Long> getSubjectIds() {
        return this.subjectIds;
    }
    
    @Override
    public int hashCode() {
        return a.a(this.studentId);
    }
    
    public final void setStudentId(final long studentId) {
        this.studentId = studentId;
    }
    
    public final void setSubjectIds(@e final List<Long> subjectIds) {
        k0.p(subjectIds, "<set-?>");
        this.subjectIds = subjectIds;
    }
    
    public void writeToParcel(@e final Parcel parcel, final int n) {
        k0.p(parcel, "parcel");
        parcel.writeLong(this.studentId);
        parcel.writeLongArray(v.J5(this.subjectIds));
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r" }, d2 = { "Lcom/untis/mobile/persistence/models/parentday/ParentDayStudent$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/untis/mobile/persistence/models/parentday/ParentDayStudent;", "Landroid/os/Parcel;", "parcel", "createFromParcel", "", "size", "", "newArray", "(I)[Lcom/untis/mobile/persistence/models/parentday/ParentDayStudent;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class CREATOR implements Parcelable$Creator<ParentDayStudent>
    {
        private CREATOR() {
        }
        
        @e
        public ParentDayStudent createFromParcel(@e final Parcel parcel) {
            k0.p(parcel, "parcel");
            return new ParentDayStudent(parcel);
        }
        
        @e
        public ParentDayStudent[] newArray(final int n) {
            return new ParentDayStudent[n];
        }
    }
}
