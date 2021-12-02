// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.ui.period.classbook.event;

import java.io.Serializable;
import android.os.Parcelable;
import java.util.Arrays;
import m6.k;
import android.os.Bundle;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import com.untis.mobile.calendar.persistence.model.CalendarPeriod;
import org.jetbrains.annotations.f;
import com.untis.mobile.persistence.models.classbook.classregevent.Event;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import androidx.navigation.l;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0005B+\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b$\u0010%J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\t\u0010\u000b\u001a\u00020\nH\u00c6\u0003J5\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000f\u001a\u00020\nH\u00c6\u0001J\t\u0010\u0011\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0012H\u00d6\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003R\u001b\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u000f\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001b\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#¨\u0006&" }, d2 = { "Lcom/untis/mobile/calendar/ui/period/classbook/event/j;", "Landroidx/navigation/l;", "Landroid/os/Bundle;", "k", "Lcom/untis/mobile/persistence/models/classbook/classregevent/Event;", "a", "", "b", "", "c", "Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;", "d", "event", "entityType", "entityIds", "period", "e", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "Lcom/untis/mobile/persistence/models/classbook/classregevent/Event;", "i", "()Lcom/untis/mobile/persistence/models/classbook/classregevent/Event;", "Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;", "j", "()Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;", "[J", "g", "()[J", "<init>", "(Lcom/untis/mobile/persistence/models/classbook/classregevent/Event;Ljava/lang/String;[JLcom/untis/mobile/calendar/persistence/model/CalendarPeriod;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class j implements l
{
    @e
    public static final a e;
    @e
    private final Event a;
    @f
    private final String b;
    @f
    private final long[] c;
    @e
    private final CalendarPeriod d;
    
    static {
        e = new a(null);
    }
    
    public j(@e final Event a, @f final String b, @f final long[] c, @e final CalendarPeriod d) {
        k0.p(a, "event");
        k0.p(d, "period");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @k
    @e
    public static final j fromBundle(@e final Bundle bundle) {
        return j.e.a(bundle);
    }
    
    @e
    public final Event a() {
        return this.a;
    }
    
    @f
    public final String b() {
        return this.b;
    }
    
    @f
    public final long[] c() {
        return this.c;
    }
    
    @e
    public final CalendarPeriod d() {
        return this.d;
    }
    
    @e
    public final j e(@e final Event event, @f final String s, @f final long[] array, @e final CalendarPeriod calendarPeriod) {
        k0.p(event, "event");
        k0.p(calendarPeriod, "period");
        return new j(event, s, array, calendarPeriod);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof j)) {
            return false;
        }
        final j j = (j)o;
        return k0.g(this.a, j.a) && k0.g(this.b, j.b) && k0.g(this.c, j.c) && k0.g(this.d, j.d);
    }
    
    @f
    public final long[] g() {
        return this.c;
    }
    
    @f
    public final String h() {
        return this.b;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.a.hashCode();
        final String b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final long[] c = this.c;
        if (c != null) {
            hashCode2 = Arrays.hashCode(c);
        }
        return ((hashCode * 31 + hashCode3) * 31 + hashCode2) * 31 + this.d.hashCode();
    }
    
    @e
    public final Event i() {
        return this.a;
    }
    
    @e
    public final CalendarPeriod j() {
        return this.d;
    }
    
    @e
    public final Bundle k() {
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
        bundle.putString("entityType", this.b);
        bundle.putLongArray("entityIds", this.c);
        if (Parcelable.class.isAssignableFrom(CalendarPeriod.class)) {
            bundle.putParcelable("period", (Parcelable)this.d);
        }
        else {
            if (!Serializable.class.isAssignableFrom(CalendarPeriod.class)) {
                throw new UnsupportedOperationException(k0.C(CalendarPeriod.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("period", (Serializable)this.d);
        }
        return bundle;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CalendarPeriodEventDetailFragmentArgs(event=");
        sb.append(this.a);
        sb.append(", entityType=");
        sb.append((Object)this.b);
        sb.append(", entityIds=");
        sb.append(Arrays.toString(this.c));
        sb.append(", period=");
        sb.append(this.d);
        sb.append(')');
        return sb.toString();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b" }, d2 = { "com/untis/mobile/calendar/ui/period/classbook/event/j$a", "", "Landroid/os/Bundle;", "bundle", "Lcom/untis/mobile/calendar/ui/period/classbook/event/j;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @k
        @e
        public final j a(@e final Bundle bundle) {
            k0.p(bundle, "bundle");
            bundle.setClassLoader(j.class.getClassLoader());
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
            if (!bundle.containsKey("entityType")) {
                throw new IllegalArgumentException("Required argument \"entityType\" is missing and does not have an android:defaultValue");
            }
            final String string = bundle.getString("entityType");
            if (!bundle.containsKey("entityIds")) {
                throw new IllegalArgumentException("Required argument \"entityIds\" is missing and does not have an android:defaultValue");
            }
            final long[] longArray = bundle.getLongArray("entityIds");
            if (!bundle.containsKey("period")) {
                throw new IllegalArgumentException("Required argument \"period\" is missing and does not have an android:defaultValue");
            }
            if (!Parcelable.class.isAssignableFrom(CalendarPeriod.class) && !Serializable.class.isAssignableFrom(CalendarPeriod.class)) {
                throw new UnsupportedOperationException(k0.C(CalendarPeriod.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
            }
            final CalendarPeriod calendarPeriod = (CalendarPeriod)bundle.get("period");
            if (calendarPeriod != null) {
                return new j(event, string, longArray, calendarPeriod);
            }
            throw new IllegalArgumentException("Argument \"period\" is marked as non-null but was passed a null value.");
        }
    }
}
