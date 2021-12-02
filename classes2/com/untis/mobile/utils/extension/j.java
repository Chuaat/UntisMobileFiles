// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.extension;

import kotlin.collections.v;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import org.jetbrains.annotations.f;
import org.joda.time.c;
import com.untis.mobile.calendar.persistence.model.common.CalendarPeriodType;
import com.untis.mobile.calendar.persistence.model.common.CalendarPeriodTeacherStatus;
import com.untis.mobile.calendar.persistence.model.common.CalendarPeriodStatus;
import com.untis.mobile.calendar.persistence.model.common.CalendarPeriodRoomStatus;
import java.util.Iterator;
import java.util.ArrayList;
import kotlin.jvm.internal.k0;
import com.untis.mobile.calendar.persistence.model.common.CalendarPeriodPermission;
import java.util.List;
import org.jetbrains.annotations.e;
import android.os.Parcel;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010\u0006\u001a\u00020\u0005*\u00020\u0000\u001a\u0010\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u0000\u001a\u0018\u0010\f\u001a\u00020\u000b*\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u001a\n\u0010\u000e\u001a\u00020\r*\u00020\u0000\u001a.\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0012j\b\u0012\u0004\u0012\u00028\u0000`\u0013\"\u0004\b\u0000\u0010\u000f*\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\u001a%\u0010\u0018\u001a\u00028\u0000\"\b\b\u0000\u0010\u000f*\u00020\u0015*\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001a\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0012j\b\u0012\u0004\u0012\u00020\u0001`\u0013*\u00020\u0000\u001a\n\u0010\u0011\u001a\u00020\u001b*\u00020\u0000\u001a\n\u0010\u001d\u001a\u00020\u001c*\u00020\u0000¨\u0006\u001e" }, d2 = { "Landroid/os/Parcel;", "", "h", "Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodTeacherStatus;", "d", "Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodRoomStatus;", "b", "", "Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodPermission;", "a", "permissions", "Lkotlin/j2;", "k", "Lorg/joda/time/c;", "f", "T", "Landroid/os/Parcelable$Creator;", "c", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "j", "Landroid/os/Parcelable;", "Ljava/lang/ClassLoader;", "loader", "g", "(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroid/os/Parcelable;", "i", "Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodStatus;", "Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodType;", "e", "untismobile_5.1.0_release" }, k = 2, mv = { 1, 5, 1 })
public final class j
{
    @e
    public static final List<CalendarPeriodPermission> a(@e final Parcel parcel) {
        k0.p(parcel, "<this>");
        final ArrayList list = new ArrayList<String>();
        parcel.readStringList((List)list);
        final ArrayList<CalendarPeriodPermission> list2 = new ArrayList<CalendarPeriodPermission>();
        final Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            final CalendarPeriodPermission byKey = CalendarPeriodPermission.Companion.findByKey(iterator.next());
            if (byKey != null) {
                list2.add(byKey);
            }
        }
        return list2;
    }
    
    @e
    public static final CalendarPeriodRoomStatus b(@e final Parcel parcel) {
        k0.p(parcel, "<this>");
        final CalendarPeriodRoomStatus byKey = CalendarPeriodRoomStatus.Companion.findByKey(parcel.readString());
        if (byKey != null) {
            return byKey;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
    
    @e
    public static final CalendarPeriodStatus c(@e final Parcel parcel) {
        k0.p(parcel, "<this>");
        final CalendarPeriodStatus byKey = CalendarPeriodStatus.Companion.findByKey(parcel.readString());
        if (byKey != null) {
            return byKey;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
    
    @e
    public static final CalendarPeriodTeacherStatus d(@e final Parcel parcel) {
        k0.p(parcel, "<this>");
        final CalendarPeriodTeacherStatus byKey = CalendarPeriodTeacherStatus.Companion.findByKey(h(parcel));
        if (byKey != null) {
            return byKey;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
    
    @e
    public static final CalendarPeriodType e(@e final Parcel parcel) {
        k0.p(parcel, "<this>");
        final CalendarPeriodType byKey = CalendarPeriodType.Companion.findByKey(parcel.readString());
        if (byKey != null) {
            return byKey;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
    
    @e
    public static final c f(@e final Parcel parcel) {
        k0.p(parcel, "<this>");
        return new c(parcel.readLong());
    }
    
    @e
    public static final <T extends Parcelable> T g(@e final Parcel parcel, @f final ClassLoader classLoader) {
        k0.p(parcel, "<this>");
        final Parcelable parcelable = parcel.readParcelable(classLoader);
        if (parcelable != null) {
            return (T)parcelable;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
    
    @e
    public static final String h(@e final Parcel parcel) {
        k0.p(parcel, "<this>");
        final String string = parcel.readString();
        if (string != null) {
            return string;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
    
    @e
    public static final ArrayList<String> i(@e final Parcel parcel) {
        k0.p(parcel, "<this>");
        final ArrayList stringArrayList = parcel.createStringArrayList();
        if (stringArrayList != null) {
            return (ArrayList<String>)stringArrayList;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
    
    @e
    public static final <T> ArrayList<T> j(@e final Parcel parcel, @e final Parcelable$Creator<T> parcelable$Creator) {
        k0.p(parcel, "<this>");
        k0.p(parcelable$Creator, "c");
        final ArrayList typedArrayList = parcel.createTypedArrayList((Parcelable$Creator)parcelable$Creator);
        if (typedArrayList != null) {
            return (ArrayList<T>)typedArrayList;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
    
    public static final void k(@e final Parcel parcel, @e final List<? extends CalendarPeriodPermission> list) {
        k0.p(parcel, "<this>");
        k0.p(list, "permissions");
        final ArrayList<String> list2 = new ArrayList<String>(v.Y((Iterable<?>)list, 10));
        final Iterator<? extends T> iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(((CalendarPeriodPermission)iterator.next()).getKey());
        }
        parcel.writeStringList((List)list2);
    }
}
