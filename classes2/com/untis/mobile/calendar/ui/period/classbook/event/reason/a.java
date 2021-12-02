// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.ui.period.classbook.event.reason;

import java.io.Serializable;
import android.os.Parcelable;
import org.jetbrains.annotations.f;
import m6.k;
import android.os.Bundle;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import com.untis.mobile.calendar.persistence.model.CalendarPeriod;
import com.untis.mobile.persistence.models.classbook.classregevent.Event;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import androidx.navigation.l;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u0000 \n2\u00020\u0001:\u0001\u0005B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0007\u001a\u00020\u0006H\u00c6\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0006H\u00c6\u0001J\t\u0010\f\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\rH\u00d6\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003R\u0019\u0010\t\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b" }, d2 = { "Lcom/untis/mobile/calendar/ui/period/classbook/event/reason/a;", "Landroidx/navigation/l;", "Landroid/os/Bundle;", "g", "Lcom/untis/mobile/persistence/models/classbook/classregevent/Event;", "a", "Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;", "b", "event", "period", "c", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;", "f", "()Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;", "Lcom/untis/mobile/persistence/models/classbook/classregevent/Event;", "e", "()Lcom/untis/mobile/persistence/models/classbook/classregevent/Event;", "<init>", "(Lcom/untis/mobile/persistence/models/classbook/classregevent/Event;Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class a implements l
{
    @e
    public static final a c;
    @e
    private final Event a;
    @e
    private final CalendarPeriod b;
    
    static {
        c = new a(null);
    }
    
    public a(@e final Event a, @e final CalendarPeriod b) {
        k0.p(a, "event");
        k0.p(b, "period");
        this.a = a;
        this.b = b;
    }
    
    @k
    @e
    public static final a fromBundle(@e final Bundle bundle) {
        return a.c.a(bundle);
    }
    
    @e
    public final Event a() {
        return this.a;
    }
    
    @e
    public final CalendarPeriod b() {
        return this.b;
    }
    
    @e
    public final a c(@e final Event event, @e final CalendarPeriod calendarPeriod) {
        k0.p(event, "event");
        k0.p(calendarPeriod, "period");
        return new a(event, calendarPeriod);
    }
    
    @e
    public final Event e() {
        return this.a;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof a)) {
            return false;
        }
        final a a = (a)o;
        return k0.g(this.a, a.a) && k0.g(this.b, a.b);
    }
    
    @e
    public final CalendarPeriod f() {
        return this.b;
    }
    
    @e
    public final Bundle g() {
        final Bundle bundle = new Bundle();
        if (Parcelable.class.isAssignableFrom(Event.class)) {
            bundle.putParcelable("event", (Parcelable)this.a);
        }
        else {
            if (!Serializable.class.isAssignableFrom(Event.class)) {
                throw new UnsupportedOperationException(k0.C(Event.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("event", (Serializable)this.a);
        }
        if (Parcelable.class.isAssignableFrom(CalendarPeriod.class)) {
            bundle.putParcelable("period", (Parcelable)this.b);
        }
        else {
            if (!Serializable.class.isAssignableFrom(CalendarPeriod.class)) {
                throw new UnsupportedOperationException(k0.C(CalendarPeriod.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("period", (Serializable)this.b);
        }
        return bundle;
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode() * 31 + this.b.hashCode();
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CalendarPeriodEventReasonFragmentArgs(event=");
        sb.append(this.a);
        sb.append(", period=");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b" }, d2 = { "com/untis/mobile/calendar/ui/period/classbook/event/reason/a$a", "", "Landroid/os/Bundle;", "bundle", "Lcom/untis/mobile/calendar/ui/period/classbook/event/reason/a;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @k
        @e
        public final com.untis.mobile.calendar.ui.period.classbook.event.reason.a a(@e final Bundle bundle) {
            k0.p(bundle, "bundle");
            bundle.setClassLoader(com.untis.mobile.calendar.ui.period.classbook.event.reason.a.class.getClassLoader());
            if (!bundle.containsKey("event")) {
                throw new IllegalArgumentException("Required argument \"event\" is missing and does not have an android:defaultValue");
            }
            if (!Parcelable.class.isAssignableFrom(Event.class) && !Serializable.class.isAssignableFrom(Event.class)) {
                throw new UnsupportedOperationException(k0.C(Event.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
            }
            final Event event = (Event)bundle.get("event");
            if (event == null) {
                throw new IllegalArgumentException("Argument \"event\" is marked as non-null but was passed a null value.");
            }
            if (!bundle.containsKey("period")) {
                throw new IllegalArgumentException("Required argument \"period\" is missing and does not have an android:defaultValue");
            }
            if (!Parcelable.class.isAssignableFrom(CalendarPeriod.class) && !Serializable.class.isAssignableFrom(CalendarPeriod.class)) {
                throw new UnsupportedOperationException(k0.C(CalendarPeriod.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
            }
            final CalendarPeriod calendarPeriod = (CalendarPeriod)bundle.get("period");
            if (calendarPeriod != null) {
                return new com.untis.mobile.calendar.ui.period.classbook.event.reason.a(event, calendarPeriod);
            }
            throw new IllegalArgumentException("Argument \"period\" is marked as non-null but was passed a null value.");
        }
    }
}
