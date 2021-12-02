// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.ui.period.classbook.event;

import com.untis.mobile.persistence.models.classbook.classregevent.Event;
import java.util.Arrays;
import java.io.Serializable;
import android.os.Parcelable;
import android.os.Bundle;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import com.untis.mobile.calendar.persistence.model.CalendarPeriod;
import androidx.navigation.d0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 \u00042\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007" }, d2 = { "Lcom/untis/mobile/calendar/ui/period/classbook/event/k;", "", "<init>", "()V", "a", "b", "c", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class k
{
    @e
    public static final c a;
    
    static {
        a = new c(null);
    }
    
    private k() {
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\t\u0010\u0007\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\t\u001a\u00020\bH\u00c6\u0003J\t\u0010\u000b\u001a\u00020\nH\u00c6\u0003J'\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\nH\u00c6\u0001J\t\u0010\u0011\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0002H\u00d6\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u000e\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\f\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\"" }, d2 = { "com/untis/mobile/calendar/ui/period/classbook/event/k$a", "Landroidx/navigation/d0;", "", "getActionId", "Landroid/os/Bundle;", "getArguments", "", "a", "", "b", "Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;", "c", "entityType", "entityIds", "period", "Lcom/untis/mobile/calendar/ui/period/classbook/event/k$a;", "d", "toString", "hashCode", "", "other", "", "equals", "[J", "f", "()[J", "Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;", "h", "()Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;[JLcom/untis/mobile/calendar/persistence/model/CalendarPeriod;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    private static final class a implements d0
    {
        @e
        private final String a;
        @e
        private final long[] b;
        @e
        private final CalendarPeriod c;
        
        public a(@e final String a, @e final long[] b, @e final CalendarPeriod c) {
            k0.p(a, "entityType");
            k0.p(b, "entityIds");
            k0.p(c, "period");
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        @e
        public final String a() {
            return this.a;
        }
        
        @e
        public final long[] b() {
            return this.b;
        }
        
        @e
        public final CalendarPeriod c() {
            return this.c;
        }
        
        @e
        public final a d(@e final String s, @e final long[] array, @e final CalendarPeriod calendarPeriod) {
            k0.p(s, "entityType");
            k0.p(array, "entityIds");
            k0.p(calendarPeriod, "period");
            return new a(s, array, calendarPeriod);
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
            return k0.g(this.a, a.a) && k0.g(this.b, a.b) && k0.g(this.c, a.c);
        }
        
        @e
        public final long[] f() {
            return this.b;
        }
        
        @e
        public final String g() {
            return this.a;
        }
        
        public int getActionId() {
            return 2131296317;
        }
        
        @e
        public Bundle getArguments() {
            final Bundle bundle = new Bundle();
            bundle.putString("entityType", this.a);
            bundle.putLongArray("entityIds", this.b);
            if (Parcelable.class.isAssignableFrom(CalendarPeriod.class)) {
                bundle.putParcelable("period", (Parcelable)this.c);
            }
            else {
                if (!Serializable.class.isAssignableFrom(CalendarPeriod.class)) {
                    throw new UnsupportedOperationException(k0.C(CalendarPeriod.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
                }
                bundle.putSerializable("period", (Serializable)this.c);
            }
            return bundle;
        }
        
        @e
        public final CalendarPeriod h() {
            return this.c;
        }
        
        @Override
        public int hashCode() {
            return (this.a.hashCode() * 31 + Arrays.hashCode(this.b)) * 31 + this.c.hashCode();
        }
        
        @e
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("ActionCalendarPeriodEventDetailFragmentToCalendarPeriodEventEntitiesFragment(entityType=");
            sb.append(this.a);
            sb.append(", entityIds=");
            sb.append(Arrays.toString(this.b));
            sb.append(", period=");
            sb.append(this.c);
            sb.append(')');
            return sb.toString();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\t\u0010\u0007\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\t\u001a\u00020\bH\u00c6\u0003J\u001d\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\bH\u00c6\u0001J\t\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0002H\u00d6\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003R\u0019\u0010\n\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u000b\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d" }, d2 = { "com/untis/mobile/calendar/ui/period/classbook/event/k$b", "Landroidx/navigation/d0;", "", "getActionId", "Landroid/os/Bundle;", "getArguments", "Lcom/untis/mobile/persistence/models/classbook/classregevent/Event;", "a", "Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;", "b", "event", "period", "Lcom/untis/mobile/calendar/ui/period/classbook/event/k$b;", "c", "", "toString", "hashCode", "", "other", "", "equals", "Lcom/untis/mobile/persistence/models/classbook/classregevent/Event;", "e", "()Lcom/untis/mobile/persistence/models/classbook/classregevent/Event;", "Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;", "f", "()Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;", "<init>", "(Lcom/untis/mobile/persistence/models/classbook/classregevent/Event;Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    private static final class b implements d0
    {
        @e
        private final Event a;
        @e
        private final CalendarPeriod b;
        
        public b(@e final Event a, @e final CalendarPeriod b) {
            k0.p(a, "event");
            k0.p(b, "period");
            this.a = a;
            this.b = b;
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
        public final b c(@e final Event event, @e final CalendarPeriod calendarPeriod) {
            k0.p(event, "event");
            k0.p(calendarPeriod, "period");
            return new b(event, calendarPeriod);
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
            if (!(o instanceof b)) {
                return false;
            }
            final b b = (b)o;
            return k0.g(this.a, b.a) && k0.g(this.b, b.b);
        }
        
        @e
        public final CalendarPeriod f() {
            return this.b;
        }
        
        public int getActionId() {
            return 2131296318;
        }
        
        @e
        public Bundle getArguments() {
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
            sb.append("ActionCalendarPeriodEventDetailFragmentToCalendarPeriodEventReasonFragment(event=");
            sb.append(this.a);
            sb.append(", period=");
            sb.append(this.b);
            sb.append(')');
            return sb.toString();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0016\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u000f" }, d2 = { "com/untis/mobile/calendar/ui/period/classbook/event/k$c", "", "", "entityType", "", "entityIds", "Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;", "period", "Landroidx/navigation/d0;", "a", "Lcom/untis/mobile/persistence/models/classbook/classregevent/Event;", "event", "b", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class c
    {
        private c() {
        }
        
        @e
        public final d0 a(@e final String s, @e final long[] array, @e final CalendarPeriod calendarPeriod) {
            k0.p(s, "entityType");
            k0.p(array, "entityIds");
            k0.p(calendarPeriod, "period");
            return (d0)new a(s, array, calendarPeriod);
        }
        
        @e
        public final d0 b(@e final Event event, @e final CalendarPeriod calendarPeriod) {
            k0.p(event, "event");
            k0.p(calendarPeriod, "period");
            return (d0)new b(event, calendarPeriod);
        }
    }
}
