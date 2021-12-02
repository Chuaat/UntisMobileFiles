// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.ui.period.classbook.event;

import java.util.Arrays;
import java.io.Serializable;
import android.os.Parcelable;
import android.os.Bundle;
import kotlin.jvm.internal.k0;
import com.untis.mobile.calendar.persistence.model.CalendarPeriod;
import org.jetbrains.annotations.f;
import com.untis.mobile.persistence.models.classbook.classregevent.Event;
import androidx.navigation.d0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006" }, d2 = { "Lcom/untis/mobile/calendar/ui/period/classbook/event/q;", "", "<init>", "()V", "a", "b", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class q
{
    @e
    public static final b a;
    
    static {
        a = new b(null);
    }
    
    private q() {
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0082\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b&\u0010'J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\t\u0010\u0007\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\t\u0010\r\u001a\u00020\fH\u00c6\u0003J5\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0011\u001a\u00020\fH\u00c6\u0001J\t\u0010\u0014\u001a\u00020\bH\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0002H\u00d6\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003R\u0019\u0010\u0011\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u000e\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%¨\u0006(" }, d2 = { "com/untis/mobile/calendar/ui/period/classbook/event/q$a", "Landroidx/navigation/d0;", "", "getActionId", "Landroid/os/Bundle;", "getArguments", "Lcom/untis/mobile/persistence/models/classbook/classregevent/Event;", "a", "", "b", "", "c", "Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;", "d", "event", "entityType", "entityIds", "period", "Lcom/untis/mobile/calendar/ui/period/classbook/event/q$a;", "e", "toString", "hashCode", "", "other", "", "equals", "Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;", "j", "()Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "[J", "g", "()[J", "Lcom/untis/mobile/persistence/models/classbook/classregevent/Event;", "i", "()Lcom/untis/mobile/persistence/models/classbook/classregevent/Event;", "<init>", "(Lcom/untis/mobile/persistence/models/classbook/classregevent/Event;Ljava/lang/String;[JLcom/untis/mobile/calendar/persistence/model/CalendarPeriod;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    private static final class a implements d0
    {
        @e
        private final Event a;
        @f
        private final String b;
        @f
        private final long[] c;
        @e
        private final CalendarPeriod d;
        
        public a(@e final Event a, @f final String b, @f final long[] c, @e final CalendarPeriod d) {
            k0.p(a, "event");
            k0.p(d, "period");
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
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
        public final a e(@e final Event event, @f final String s, @f final long[] array, @e final CalendarPeriod calendarPeriod) {
            k0.p(event, "event");
            k0.p(calendarPeriod, "period");
            return new a(event, s, array, calendarPeriod);
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
            return k0.g(this.a, a.a) && k0.g(this.b, a.b) && k0.g(this.c, a.c) && k0.g(this.d, a.d);
        }
        
        @f
        public final long[] g() {
            return this.c;
        }
        
        public int getActionId() {
            return 2131296319;
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
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("ActionCalendarPeriodEventsFragmentToCalendarPeriodEventDetailFragment(event=");
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
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ*\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b¨\u0006\u000e" }, d2 = { "com/untis/mobile/calendar/ui/period/classbook/event/q$b", "", "Lcom/untis/mobile/persistence/models/classbook/classregevent/Event;", "event", "", "entityType", "", "entityIds", "Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;", "period", "Landroidx/navigation/d0;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class b
    {
        private b() {
        }
        
        @e
        public final d0 a(@e final Event event, @f final String s, @f final long[] array, @e final CalendarPeriod calendarPeriod) {
            k0.p(event, "event");
            k0.p(calendarPeriod, "period");
            return (d0)new a(event, s, array, calendarPeriod);
        }
    }
}
