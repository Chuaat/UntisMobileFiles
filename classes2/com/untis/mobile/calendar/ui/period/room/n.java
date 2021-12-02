// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.ui.period.room;

import com.untis.mobile.calendar.network.model.period.room.CalendarPeriodRoomDepartment;
import java.util.Arrays;
import android.os.Parcelable;
import android.os.Bundle;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import com.untis.mobile.calendar.network.model.period.room.CalendarPeriodRoomBuilding;
import androidx.navigation.d0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 \u00042\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007" }, d2 = { "Lcom/untis/mobile/calendar/ui/period/room/n;", "", "<init>", "()V", "a", "b", "c", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class n
{
    @e
    public static final c a;
    
    static {
        a = new c(null);
    }
    
    private n() {
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003¢\u0006\u0004\b\b\u0010\tJ \u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0001¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0002H\u00d6\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003R\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\t¨\u0006\u0019" }, d2 = { "com/untis/mobile/calendar/ui/period/room/n$a", "Landroidx/navigation/d0;", "", "getActionId", "Landroid/os/Bundle;", "getArguments", "", "Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomBuilding;", "a", "()[Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomBuilding;", "buildings", "Lcom/untis/mobile/calendar/ui/period/room/n$a;", "b", "([Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomBuilding;)Lcom/untis/mobile/calendar/ui/period/room/n$a;", "", "toString", "hashCode", "", "other", "", "equals", "[Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomBuilding;", "d", "<init>", "([Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomBuilding;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    private static final class a implements d0
    {
        @e
        private final CalendarPeriodRoomBuilding[] a;
        
        public a(@e final CalendarPeriodRoomBuilding[] a) {
            k0.p(a, "buildings");
            this.a = a;
        }
        
        @e
        public final CalendarPeriodRoomBuilding[] a() {
            return this.a;
        }
        
        @e
        public final a b(@e final CalendarPeriodRoomBuilding[] array) {
            k0.p(array, "buildings");
            return new a(array);
        }
        
        @e
        public final CalendarPeriodRoomBuilding[] d() {
            return this.a;
        }
        
        @Override
        public boolean equals(@f final Object o) {
            return this == o || (o instanceof a && k0.g(this.a, ((a)o).a));
        }
        
        public int getActionId() {
            return 2131296322;
        }
        
        @e
        public Bundle getArguments() {
            final Bundle bundle = new Bundle();
            bundle.putParcelableArray("buildings", (Parcelable[])this.a);
            return bundle;
        }
        
        @Override
        public int hashCode() {
            return Arrays.hashCode(this.a);
        }
        
        @e
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("ActionCalendarPeriodRoomFragmentToCalendarPeriodRoomBuildingFragment(buildings=");
            sb.append(Arrays.toString(this.a));
            sb.append(')');
            return sb.toString();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003¢\u0006\u0004\b\b\u0010\tJ \u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0001¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0002H\u00d6\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003R\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\t¨\u0006\u0019" }, d2 = { "com/untis/mobile/calendar/ui/period/room/n$b", "Landroidx/navigation/d0;", "", "getActionId", "Landroid/os/Bundle;", "getArguments", "", "Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomDepartment;", "a", "()[Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomDepartment;", "departments", "Lcom/untis/mobile/calendar/ui/period/room/n$b;", "b", "([Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomDepartment;)Lcom/untis/mobile/calendar/ui/period/room/n$b;", "", "toString", "hashCode", "", "other", "", "equals", "[Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomDepartment;", "d", "<init>", "([Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomDepartment;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    private static final class b implements d0
    {
        @e
        private final CalendarPeriodRoomDepartment[] a;
        
        public b(@e final CalendarPeriodRoomDepartment[] a) {
            k0.p(a, "departments");
            this.a = a;
        }
        
        @e
        public final CalendarPeriodRoomDepartment[] a() {
            return this.a;
        }
        
        @e
        public final b b(@e final CalendarPeriodRoomDepartment[] array) {
            k0.p(array, "departments");
            return new b(array);
        }
        
        @e
        public final CalendarPeriodRoomDepartment[] d() {
            return this.a;
        }
        
        @Override
        public boolean equals(@f final Object o) {
            return this == o || (o instanceof b && k0.g(this.a, ((b)o).a));
        }
        
        public int getActionId() {
            return 2131296323;
        }
        
        @e
        public Bundle getArguments() {
            final Bundle bundle = new Bundle();
            bundle.putParcelableArray("departments", (Parcelable[])this.a);
            return bundle;
        }
        
        @Override
        public int hashCode() {
            return Arrays.hashCode(this.a);
        }
        
        @e
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("ActionCalendarPeriodRoomFragmentToCalendarPeriodRoomDepartmentFragment(departments=");
            sb.append(Arrays.toString(this.a));
            sb.append(')');
            return sb.toString();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e" }, d2 = { "com/untis/mobile/calendar/ui/period/room/n$c", "", "", "Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomDepartment;", "departments", "Landroidx/navigation/d0;", "b", "([Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomDepartment;)Landroidx/navigation/d0;", "Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomBuilding;", "buildings", "a", "([Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomBuilding;)Landroidx/navigation/d0;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class c
    {
        private c() {
        }
        
        @e
        public final d0 a(@e final CalendarPeriodRoomBuilding[] array) {
            k0.p(array, "buildings");
            return (d0)new a(array);
        }
        
        @e
        public final d0 b(@e final CalendarPeriodRoomDepartment[] array) {
            k0.p(array, "departments");
            return (d0)new b(array);
        }
    }
}
