// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.ui.period.room;

import kotlin.jvm.internal.k0;
import java.io.Serializable;
import android.os.Parcelable;
import m6.k;
import android.os.Bundle;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.f;
import com.untis.mobile.calendar.persistence.model.entity.CalendarPeriodRoom;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import androidx.navigation.l;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00072\u00020\u0001:\u0001\u0005B\u0013\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0003\u001a\u00020\u0002J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0015\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001J\t\u0010\t\u001a\u00020\bH\u00d6\u0001J\t\u0010\u000b\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u00d6\u0003R\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015" }, d2 = { "Lcom/untis/mobile/calendar/ui/period/room/m;", "Landroidx/navigation/l;", "Landroid/os/Bundle;", "e", "Lcom/untis/mobile/calendar/persistence/model/entity/CalendarPeriodRoom;", "a", "room", "b", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/untis/mobile/calendar/persistence/model/entity/CalendarPeriodRoom;", "d", "()Lcom/untis/mobile/calendar/persistence/model/entity/CalendarPeriodRoom;", "<init>", "(Lcom/untis/mobile/calendar/persistence/model/entity/CalendarPeriodRoom;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class m implements l
{
    @e
    public static final a b;
    @f
    private final CalendarPeriodRoom a;
    
    static {
        b = new a(null);
    }
    
    public m() {
        this(null, 1, null);
    }
    
    public m(@f final CalendarPeriodRoom a) {
        this.a = a;
    }
    
    @k
    @e
    public static final m fromBundle(@e final Bundle bundle) {
        return m.b.a(bundle);
    }
    
    @f
    public final CalendarPeriodRoom a() {
        return this.a;
    }
    
    @e
    public final m b(@f final CalendarPeriodRoom calendarPeriodRoom) {
        return new m(calendarPeriodRoom);
    }
    
    @f
    public final CalendarPeriodRoom d() {
        return this.a;
    }
    
    @e
    public final Bundle e() {
        final Bundle bundle = new Bundle();
        if (Parcelable.class.isAssignableFrom(CalendarPeriodRoom.class)) {
            bundle.putParcelable("room", (Parcelable)this.a);
        }
        else if (Serializable.class.isAssignableFrom(CalendarPeriodRoom.class)) {
            bundle.putSerializable("room", (Serializable)this.a);
        }
        return bundle;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        return this == o || (o instanceof m && k0.g(this.a, ((m)o).a));
    }
    
    @Override
    public int hashCode() {
        final CalendarPeriodRoom a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        return hashCode;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CalendarPeriodRoomFragmentArgs(room=");
        sb.append(this.a);
        sb.append(')');
        return sb.toString();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b" }, d2 = { "com/untis/mobile/calendar/ui/period/room/m$a", "", "Landroid/os/Bundle;", "bundle", "Lcom/untis/mobile/calendar/ui/period/room/m;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @k
        @e
        public final m a(@e final Bundle bundle) {
            k0.p(bundle, "bundle");
            bundle.setClassLoader(m.class.getClassLoader());
            CalendarPeriodRoom calendarPeriodRoom;
            if (bundle.containsKey("room")) {
                if (!Parcelable.class.isAssignableFrom(CalendarPeriodRoom.class) && !Serializable.class.isAssignableFrom(CalendarPeriodRoom.class)) {
                    throw new UnsupportedOperationException(k0.C(CalendarPeriodRoom.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
                }
                calendarPeriodRoom = (CalendarPeriodRoom)bundle.get("room");
            }
            else {
                calendarPeriodRoom = null;
            }
            return new m(calendarPeriodRoom);
        }
    }
}
