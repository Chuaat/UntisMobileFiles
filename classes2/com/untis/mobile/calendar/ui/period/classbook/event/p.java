// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.ui.period.classbook.event;

import java.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
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

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000 \f2\u00020\u0001:\u0001\u0006B\u001d\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\t\u001a\u00020\bH\u00c6\u0003J*\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u000b\u001a\u00020\bH\u00c6\u0001¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003R\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007R\u0019\u0010\u000b\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d" }, d2 = { "Lcom/untis/mobile/calendar/ui/period/classbook/event/p;", "Landroidx/navigation/l;", "Landroid/os/Bundle;", "g", "", "Lcom/untis/mobile/persistence/models/classbook/classregevent/Event;", "a", "()[Lcom/untis/mobile/persistence/models/classbook/classregevent/Event;", "Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;", "b", "events", "period", "c", "([Lcom/untis/mobile/persistence/models/classbook/classregevent/Event;Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;)Lcom/untis/mobile/calendar/ui/period/classbook/event/p;", "", "toString", "", "hashCode", "", "other", "", "equals", "[Lcom/untis/mobile/persistence/models/classbook/classregevent/Event;", "e", "Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;", "f", "()Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;", "<init>", "([Lcom/untis/mobile/persistence/models/classbook/classregevent/Event;Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class p implements l
{
    @e
    public static final a c;
    @e
    private final Event[] a;
    @e
    private final CalendarPeriod b;
    
    static {
        c = new a(null);
    }
    
    public p(@e final Event[] a, @e final CalendarPeriod b) {
        k0.p(a, "events");
        k0.p(b, "period");
        this.a = a;
        this.b = b;
    }
    
    @k
    @e
    public static final p fromBundle(@e final Bundle bundle) {
        return p.c.a(bundle);
    }
    
    @e
    public final Event[] a() {
        return this.a;
    }
    
    @e
    public final CalendarPeriod b() {
        return this.b;
    }
    
    @e
    public final p c(@e final Event[] array, @e final CalendarPeriod calendarPeriod) {
        k0.p(array, "events");
        k0.p(calendarPeriod, "period");
        return new p(array, calendarPeriod);
    }
    
    @e
    public final Event[] e() {
        return this.a;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof p)) {
            return false;
        }
        final p p = (p)o;
        return k0.g(this.a, p.a) && k0.g(this.b, p.b);
    }
    
    @e
    public final CalendarPeriod f() {
        return this.b;
    }
    
    @e
    public final Bundle g() {
        final Bundle bundle = new Bundle();
        bundle.putParcelableArray("events", (Parcelable[])this.a);
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
        return Arrays.hashCode(this.a) * 31 + this.b.hashCode();
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CalendarPeriodEventsFragmentArgs(events=");
        sb.append(Arrays.toString(this.a));
        sb.append(", period=");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b" }, d2 = { "com/untis/mobile/calendar/ui/period/classbook/event/p$a", "", "Landroid/os/Bundle;", "bundle", "Lcom/untis/mobile/calendar/ui/period/classbook/event/p;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @k
        @e
        public final p a(@e final Bundle bundle) {
            k0.p(bundle, "bundle");
            bundle.setClassLoader(p.class.getClassLoader());
            if (!bundle.containsKey("events")) {
                throw new IllegalArgumentException("Required argument \"events\" is missing and does not have an android:defaultValue");
            }
            final Parcelable[] parcelableArray = bundle.getParcelableArray("events");
            Event[] array;
            if (parcelableArray == null) {
                array = null;
            }
            else {
                final ArrayList list = new ArrayList<Event>(parcelableArray.length);
                for (final Parcelable obj : parcelableArray) {
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type com.untis.mobile.persistence.models.classbook.classregevent.Event");
                    list.add((Event)obj);
                }
                final Event[] array2 = list.toArray(new Event[0]);
                Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
                array = array2;
            }
            if (array == null) {
                throw new IllegalArgumentException("Argument \"events\" is marked as non-null but was passed a null value.");
            }
            if (!bundle.containsKey("period")) {
                throw new IllegalArgumentException("Required argument \"period\" is missing and does not have an android:defaultValue");
            }
            if (!Parcelable.class.isAssignableFrom(CalendarPeriod.class) && !Serializable.class.isAssignableFrom(CalendarPeriod.class)) {
                throw new UnsupportedOperationException(k0.C(CalendarPeriod.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
            }
            final CalendarPeriod calendarPeriod = (CalendarPeriod)bundle.get("period");
            if (calendarPeriod != null) {
                return new p(array, calendarPeriod);
            }
            throw new IllegalArgumentException("Argument \"period\" is marked as non-null but was passed a null value.");
        }
    }
}
