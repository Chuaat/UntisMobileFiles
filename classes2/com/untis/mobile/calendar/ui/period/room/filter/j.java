// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.ui.period.room.filter;

import java.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import org.jetbrains.annotations.f;
import android.os.Parcelable;
import m6.k;
import android.os.Bundle;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import com.untis.mobile.calendar.network.model.period.room.CalendarPeriodRoomDepartment;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import androidx.navigation.l;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \t2\u00020\u0001:\u0001\u0006B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0003¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001¢\u0006\u0004\b\t\u0010\nJ\t\u0010\f\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\rH\u00d6\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003R\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007¨\u0006\u0017" }, d2 = { "Lcom/untis/mobile/calendar/ui/period/room/filter/j;", "Landroidx/navigation/l;", "Landroid/os/Bundle;", "e", "", "Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomDepartment;", "a", "()[Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomDepartment;", "departments", "b", "([Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomDepartment;)Lcom/untis/mobile/calendar/ui/period/room/filter/j;", "", "toString", "", "hashCode", "", "other", "", "equals", "[Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomDepartment;", "d", "<init>", "([Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomDepartment;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class j implements l
{
    @e
    public static final a b;
    @e
    private final CalendarPeriodRoomDepartment[] a;
    
    static {
        b = new a(null);
    }
    
    public j(@e final CalendarPeriodRoomDepartment[] a) {
        k0.p(a, "departments");
        this.a = a;
    }
    
    @k
    @e
    public static final j fromBundle(@e final Bundle bundle) {
        return j.b.a(bundle);
    }
    
    @e
    public final CalendarPeriodRoomDepartment[] a() {
        return this.a;
    }
    
    @e
    public final j b(@e final CalendarPeriodRoomDepartment[] array) {
        k0.p(array, "departments");
        return new j(array);
    }
    
    @e
    public final CalendarPeriodRoomDepartment[] d() {
        return this.a;
    }
    
    @e
    public final Bundle e() {
        final Bundle bundle = new Bundle();
        bundle.putParcelableArray("departments", (Parcelable[])this.a);
        return bundle;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        return this == o || (o instanceof j && k0.g(this.a, ((j)o).a));
    }
    
    @Override
    public int hashCode() {
        return Arrays.hashCode(this.a);
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CalendarPeriodRoomDepartmentFragmentArgs(departments=");
        sb.append(Arrays.toString(this.a));
        sb.append(')');
        return sb.toString();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b" }, d2 = { "com/untis/mobile/calendar/ui/period/room/filter/j$a", "", "Landroid/os/Bundle;", "bundle", "Lcom/untis/mobile/calendar/ui/period/room/filter/j;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @k
        @e
        public final j a(@e final Bundle bundle) {
            k0.p(bundle, "bundle");
            bundle.setClassLoader(j.class.getClassLoader());
            if (!bundle.containsKey("departments")) {
                throw new IllegalArgumentException("Required argument \"departments\" is missing and does not have an android:defaultValue");
            }
            final Parcelable[] parcelableArray = bundle.getParcelableArray("departments");
            CalendarPeriodRoomDepartment[] array;
            if (parcelableArray == null) {
                array = null;
            }
            else {
                final ArrayList list = new ArrayList<CalendarPeriodRoomDepartment>(parcelableArray.length);
                for (final Parcelable obj : parcelableArray) {
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type com.untis.mobile.calendar.network.model.period.room.CalendarPeriodRoomDepartment");
                    list.add((CalendarPeriodRoomDepartment)obj);
                }
                final CalendarPeriodRoomDepartment[] array2 = list.toArray(new CalendarPeriodRoomDepartment[0]);
                Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
                array = array2;
            }
            if (array != null) {
                return new j(array);
            }
            throw new IllegalArgumentException("Argument \"departments\" is marked as non-null but was passed a null value.");
        }
    }
}
