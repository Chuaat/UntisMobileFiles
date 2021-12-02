// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.persistence.model.common;

import android.os.Parcelable$Creator;
import a4.a;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import android.os.Parcel;
import kotlin.jvm.internal.w;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 B\u0017\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u001d\u0010\u001eB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\t\u0010\u000b\u001a\u00020\tH\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\tH\u00c6\u0001J\t\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0004H\u00d6\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003R\"\u0010\f\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\r\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001a¨\u0006!" }, d2 = { "Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodLesson;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/j2;", "writeToParcel", "describeContents", "", "component1", "component2", "lessonId", "lessonNumber", "copy", "", "toString", "hashCode", "", "other", "", "equals", "J", "getLessonId", "()J", "setLessonId", "(J)V", "getLessonNumber", "setLessonNumber", "<init>", "(JJ)V", "(Landroid/os/Parcel;)V", "CREATOR", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class CalendarPeriodLesson implements Parcelable
{
    @e
    public static final CREATOR CREATOR;
    @SerializedName("lessonId")
    private long lessonId;
    @SerializedName("lessonNumber")
    private long lessonNumber;
    
    static {
        CREATOR = new CREATOR(null);
    }
    
    public CalendarPeriodLesson(final long lessonId, final long lessonNumber) {
        this.lessonId = lessonId;
        this.lessonNumber = lessonNumber;
    }
    
    public CalendarPeriodLesson(@e final Parcel parcel) {
        k0.p(parcel, "parcel");
        this(parcel.readLong(), parcel.readLong());
    }
    
    public final long component1() {
        return this.lessonId;
    }
    
    public final long component2() {
        return this.lessonNumber;
    }
    
    @e
    public final CalendarPeriodLesson copy(final long n, final long n2) {
        return new CalendarPeriodLesson(n, n2);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CalendarPeriodLesson)) {
            return false;
        }
        final CalendarPeriodLesson calendarPeriodLesson = (CalendarPeriodLesson)o;
        return this.lessonId == calendarPeriodLesson.lessonId && this.lessonNumber == calendarPeriodLesson.lessonNumber;
    }
    
    public final long getLessonId() {
        return this.lessonId;
    }
    
    public final long getLessonNumber() {
        return this.lessonNumber;
    }
    
    @Override
    public int hashCode() {
        return a.a(this.lessonId) * 31 + a.a(this.lessonNumber);
    }
    
    public final void setLessonId(final long lessonId) {
        this.lessonId = lessonId;
    }
    
    public final void setLessonNumber(final long lessonNumber) {
        this.lessonNumber = lessonNumber;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CalendarPeriodLesson(lessonId=");
        sb.append(this.lessonId);
        sb.append(", lessonNumber=");
        sb.append(this.lessonNumber);
        sb.append(')');
        return sb.toString();
    }
    
    public void writeToParcel(@e final Parcel parcel, final int n) {
        k0.p(parcel, "parcel");
        parcel.writeLong(this.lessonId);
        parcel.writeLong(this.lessonNumber);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r" }, d2 = { "Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodLesson$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodLesson;", "Landroid/os/Parcel;", "parcel", "createFromParcel", "", "size", "", "newArray", "(I)[Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodLesson;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class CREATOR implements Parcelable$Creator<CalendarPeriodLesson>
    {
        private CREATOR() {
        }
        
        @e
        public CalendarPeriodLesson createFromParcel(@e final Parcel parcel) {
            k0.p(parcel, "parcel");
            return new CalendarPeriodLesson(parcel);
        }
        
        @e
        public CalendarPeriodLesson[] newArray(final int n) {
            return new CalendarPeriodLesson[n];
        }
    }
}
