// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.timegrid;

import java.util.Iterator;
import java.util.Objects;
import org.jetbrains.annotations.f;
import java.util.ArrayList;
import kotlin.collections.v;
import android.os.Parcelable$Creator;
import kotlin.jvm.internal.k0;
import android.os.Parcel;
import kotlin.jvm.internal.w;
import com.untis.mobile.persistence.models.WeekDay;
import java.util.List;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000  2\u00020\u0001:\u0001 B!\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u001d\u0010\u001eB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016R(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006!" }, d2 = { "Lcom/untis/mobile/persistence/models/timegrid/TimeGridDay;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/j2;", "writeToParcel", "", "other", "", "equals", "hashCode", "describeContents", "", "Lcom/untis/mobile/persistence/models/timegrid/TimeGridUnit;", "units", "Ljava/util/List;", "getUnits", "()Ljava/util/List;", "setUnits", "(Ljava/util/List;)V", "Lcom/untis/mobile/persistence/models/WeekDay;", "weekDay", "Lcom/untis/mobile/persistence/models/WeekDay;", "getWeekDay", "()Lcom/untis/mobile/persistence/models/WeekDay;", "setWeekDay", "(Lcom/untis/mobile/persistence/models/WeekDay;)V", "<init>", "(Lcom/untis/mobile/persistence/models/WeekDay;Ljava/util/List;)V", "(Landroid/os/Parcel;)V", "CREATOR", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class TimeGridDay implements Parcelable
{
    @e
    public static final CREATOR CREATOR;
    @e
    private List<? extends TimeGridUnit> units;
    @e
    private WeekDay weekDay;
    
    static {
        CREATOR = new CREATOR(null);
    }
    
    public TimeGridDay() {
        this(null, null, 3, null);
    }
    
    public TimeGridDay(@e final Parcel parcel) {
        k0.p(parcel, "parcel");
        final WeekDay fromDateTimeConstant = WeekDay.fromDateTimeConstant(parcel.readInt());
        k0.o(fromDateTimeConstant, "fromDateTimeConstant(parcel.readInt())");
        List<? extends TimeGridUnit> list;
        if ((list = (List<? extends TimeGridUnit>)parcel.createTypedArrayList((Parcelable$Creator)TimeGridUnit.CREATOR)) == null) {
            list = v.E();
        }
        this(fromDateTimeConstant, list);
    }
    
    public TimeGridDay(@e final WeekDay weekDay, @e final List<? extends TimeGridUnit> units) {
        k0.p(weekDay, "weekDay");
        k0.p(units, "units");
        this.weekDay = weekDay;
        this.units = units;
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
        if (!k0.g(TimeGridDay.class, class1)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.untis.mobile.persistence.models.timegrid.TimeGridDay");
        final TimeGridDay timeGridDay = (TimeGridDay)obj;
        return this.weekDay == timeGridDay.weekDay && k0.g(this.units, timeGridDay.units);
    }
    
    @e
    public final List<TimeGridUnit> getUnits() {
        return (List<TimeGridUnit>)this.units;
    }
    
    @e
    public final WeekDay getWeekDay() {
        return this.weekDay;
    }
    
    @Override
    public int hashCode() {
        int hashCode = this.weekDay.hashCode();
        final Iterator<? extends TimeGridUnit> iterator = this.units.iterator();
        while (iterator.hasNext()) {
            hashCode = hashCode * 31 + ((TimeGridUnit)iterator.next()).hashCode();
        }
        return hashCode;
    }
    
    public final void setUnits(@e final List<? extends TimeGridUnit> units) {
        k0.p(units, "<set-?>");
        this.units = units;
    }
    
    public final void setWeekDay(@e final WeekDay weekDay) {
        k0.p(weekDay, "<set-?>");
        this.weekDay = weekDay;
    }
    
    public void writeToParcel(@e final Parcel parcel, final int n) {
        k0.p(parcel, "parcel");
        parcel.writeInt(this.weekDay.getDateTimeConstant());
        parcel.writeTypedList((List)this.units);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r" }, d2 = { "Lcom/untis/mobile/persistence/models/timegrid/TimeGridDay$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/untis/mobile/persistence/models/timegrid/TimeGridDay;", "Landroid/os/Parcel;", "parcel", "createFromParcel", "", "size", "", "newArray", "(I)[Lcom/untis/mobile/persistence/models/timegrid/TimeGridDay;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class CREATOR implements Parcelable$Creator<TimeGridDay>
    {
        private CREATOR() {
        }
        
        @e
        public TimeGridDay createFromParcel(@e final Parcel parcel) {
            k0.p(parcel, "parcel");
            return new TimeGridDay(parcel);
        }
        
        @e
        public TimeGridDay[] newArray(final int n) {
            return new TimeGridDay[n];
        }
    }
}
