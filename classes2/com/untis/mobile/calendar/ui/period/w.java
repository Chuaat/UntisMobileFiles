// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.ui.period;

import androidx.navigation.a;
import com.untis.mobile.calendar.persistence.model.entity.CalendarPeriodRoom;
import com.untis.mobile.persistence.models.classbook.homework.HomeWork;
import com.untis.mobile.calendar.persistence.model.common.CalendarPeriodExam;
import java.util.Arrays;
import java.io.Serializable;
import android.os.Parcelable;
import android.os.Bundle;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import com.untis.mobile.calendar.persistence.model.CalendarPeriod;
import com.untis.mobile.persistence.models.classbook.classregevent.Event;
import androidx.navigation.d0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\u0018\u0000 \u00042\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u000e" }, d2 = { "Lcom/untis/mobile/calendar/ui/period/w;", "", "<init>", "()V", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class w
{
    @org.jetbrains.annotations.e
    public static final j a;
    
    static {
        a = new j(null);
    }
    
    private w() {
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000b\u001a\u00020\nH\u00c6\u0003J*\u0010\u000f\u001a\u00020\u000e2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\r\u001a\u00020\nH\u00c6\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003R\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0019\u0010\r\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f" }, d2 = { "com/untis/mobile/calendar/ui/period/w$a", "Landroidx/navigation/d0;", "", "getActionId", "Landroid/os/Bundle;", "getArguments", "", "Lcom/untis/mobile/persistence/models/classbook/classregevent/Event;", "a", "()[Lcom/untis/mobile/persistence/models/classbook/classregevent/Event;", "Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;", "b", "events", "period", "Lcom/untis/mobile/calendar/ui/period/w$a;", "c", "([Lcom/untis/mobile/persistence/models/classbook/classregevent/Event;Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;)Lcom/untis/mobile/calendar/ui/period/w$a;", "", "toString", "hashCode", "", "other", "", "equals", "[Lcom/untis/mobile/persistence/models/classbook/classregevent/Event;", "e", "Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;", "f", "()Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;", "<init>", "([Lcom/untis/mobile/persistence/models/classbook/classregevent/Event;Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    private static final class a implements d0
    {
        @org.jetbrains.annotations.e
        private final Event[] a;
        @org.jetbrains.annotations.e
        private final CalendarPeriod b;
        
        public a(@org.jetbrains.annotations.e final Event[] a, @org.jetbrains.annotations.e final CalendarPeriod b) {
            k0.p(a, "events");
            k0.p(b, "period");
            this.a = a;
            this.b = b;
        }
        
        @org.jetbrains.annotations.e
        public final Event[] a() {
            return this.a;
        }
        
        @org.jetbrains.annotations.e
        public final CalendarPeriod b() {
            return this.b;
        }
        
        @org.jetbrains.annotations.e
        public final a c(@org.jetbrains.annotations.e final Event[] array, @org.jetbrains.annotations.e final CalendarPeriod calendarPeriod) {
            k0.p(array, "events");
            k0.p(calendarPeriod, "period");
            return new a(array, calendarPeriod);
        }
        
        @org.jetbrains.annotations.e
        public final Event[] e() {
            return this.a;
        }
        
        @Override
        public boolean equals(@org.jetbrains.annotations.f final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof a)) {
                return false;
            }
            final a a = (a)o;
            return k0.g(this.a, a.a) && k0.g(this.b, a.b);
        }
        
        @org.jetbrains.annotations.e
        public final CalendarPeriod f() {
            return this.b;
        }
        
        public int getActionId() {
            return 2131296325;
        }
        
        @org.jetbrains.annotations.e
        public Bundle getArguments() {
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
        
        @org.jetbrains.annotations.e
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("ActionCalenderPeriodFragmentToCalendarPeriodEventsFragment(events=");
            sb.append(Arrays.toString(this.a));
            sb.append(", period=");
            sb.append(this.b);
            sb.append(')');
            return sb.toString();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\t\u0010\u0007\u001a\u00020\u0006H\u00c6\u0003J\u0013\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\b\u001a\u00020\u0006H\u00c6\u0001J\t\u0010\f\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\r\u001a\u00020\u0002H\u00d6\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003R\u0019\u0010\b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017" }, d2 = { "com/untis/mobile/calendar/ui/period/w$b", "Landroidx/navigation/d0;", "", "getActionId", "Landroid/os/Bundle;", "getArguments", "Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodExam;", "a", "exam", "Lcom/untis/mobile/calendar/ui/period/w$b;", "b", "", "toString", "hashCode", "", "other", "", "equals", "Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodExam;", "d", "()Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodExam;", "<init>", "(Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodExam;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    private static final class b implements d0
    {
        @org.jetbrains.annotations.e
        private final CalendarPeriodExam a;
        
        public b(@org.jetbrains.annotations.e final CalendarPeriodExam a) {
            k0.p(a, "exam");
            this.a = a;
        }
        
        @org.jetbrains.annotations.e
        public final CalendarPeriodExam a() {
            return this.a;
        }
        
        @org.jetbrains.annotations.e
        public final b b(@org.jetbrains.annotations.e final CalendarPeriodExam calendarPeriodExam) {
            k0.p(calendarPeriodExam, "exam");
            return new b(calendarPeriodExam);
        }
        
        @org.jetbrains.annotations.e
        public final CalendarPeriodExam d() {
            return this.a;
        }
        
        @Override
        public boolean equals(@org.jetbrains.annotations.f final Object o) {
            return this == o || (o instanceof b && k0.g(this.a, ((b)o).a));
        }
        
        public int getActionId() {
            return 2131296326;
        }
        
        @org.jetbrains.annotations.e
        public Bundle getArguments() {
            final Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(CalendarPeriodExam.class)) {
                bundle.putParcelable("exam", (Parcelable)this.a);
            }
            else {
                if (!Serializable.class.isAssignableFrom(CalendarPeriodExam.class)) {
                    throw new UnsupportedOperationException(k0.C(CalendarPeriodExam.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
                }
                bundle.putSerializable("exam", (Serializable)this.a);
            }
            return bundle;
        }
        
        @Override
        public int hashCode() {
            return this.a.hashCode();
        }
        
        @org.jetbrains.annotations.e
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("ActionCalenderPeriodFragmentToCalendarPeriodExamFragment(exam=");
            sb.append(this.a);
            sb.append(')');
            return sb.toString();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000b\u001a\u00020\nH\u00c6\u0003J*\u0010\u000f\u001a\u00020\u000e2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\r\u001a\u00020\nH\u00c6\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003R\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0019\u0010\r\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f" }, d2 = { "com/untis/mobile/calendar/ui/period/w$c", "Landroidx/navigation/d0;", "", "getActionId", "Landroid/os/Bundle;", "getArguments", "", "Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;", "a", "()[Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;", "Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;", "b", "homework", "period", "Lcom/untis/mobile/calendar/ui/period/w$c;", "c", "([Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;)Lcom/untis/mobile/calendar/ui/period/w$c;", "", "toString", "hashCode", "", "other", "", "equals", "[Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;", "e", "Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;", "f", "()Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;", "<init>", "([Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    private static final class c implements d0
    {
        @org.jetbrains.annotations.e
        private final HomeWork[] a;
        @org.jetbrains.annotations.e
        private final CalendarPeriod b;
        
        public c(@org.jetbrains.annotations.e final HomeWork[] a, @org.jetbrains.annotations.e final CalendarPeriod b) {
            k0.p(a, "homework");
            k0.p(b, "period");
            this.a = a;
            this.b = b;
        }
        
        @org.jetbrains.annotations.e
        public final HomeWork[] a() {
            return this.a;
        }
        
        @org.jetbrains.annotations.e
        public final CalendarPeriod b() {
            return this.b;
        }
        
        @org.jetbrains.annotations.e
        public final c c(@org.jetbrains.annotations.e final HomeWork[] array, @org.jetbrains.annotations.e final CalendarPeriod calendarPeriod) {
            k0.p(array, "homework");
            k0.p(calendarPeriod, "period");
            return new c(array, calendarPeriod);
        }
        
        @org.jetbrains.annotations.e
        public final HomeWork[] e() {
            return this.a;
        }
        
        @Override
        public boolean equals(@org.jetbrains.annotations.f final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof c)) {
                return false;
            }
            final c c = (c)o;
            return k0.g(this.a, c.a) && k0.g(this.b, c.b);
        }
        
        @org.jetbrains.annotations.e
        public final CalendarPeriod f() {
            return this.b;
        }
        
        public int getActionId() {
            return 2131296327;
        }
        
        @org.jetbrains.annotations.e
        public Bundle getArguments() {
            final Bundle bundle = new Bundle();
            bundle.putParcelableArray("homework", (Parcelable[])this.a);
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
        
        @org.jetbrains.annotations.e
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("ActionCalenderPeriodFragmentToCalendarPeriodHomeworkFragment(homework=");
            sb.append(Arrays.toString(this.a));
            sb.append(", period=");
            sb.append(this.b);
            sb.append(')');
            return sb.toString();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\t\u0010\u0007\u001a\u00020\u0006H\u00c6\u0003J\u0013\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\b\u001a\u00020\u0006H\u00c6\u0001J\t\u0010\u000b\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\f\u001a\u00020\u0002H\u00d6\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u00d6\u0003R\u0019\u0010\b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016" }, d2 = { "com/untis/mobile/calendar/ui/period/w$d", "Landroidx/navigation/d0;", "", "getActionId", "Landroid/os/Bundle;", "getArguments", "", "a", "information", "Lcom/untis/mobile/calendar/ui/period/w$d;", "b", "toString", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    private static final class d implements d0
    {
        @org.jetbrains.annotations.e
        private final String a;
        
        public d(@org.jetbrains.annotations.e final String a) {
            k0.p(a, "information");
            this.a = a;
        }
        
        @org.jetbrains.annotations.e
        public final String a() {
            return this.a;
        }
        
        @org.jetbrains.annotations.e
        public final d b(@org.jetbrains.annotations.e final String s) {
            k0.p(s, "information");
            return new d(s);
        }
        
        @org.jetbrains.annotations.e
        public final String d() {
            return this.a;
        }
        
        @Override
        public boolean equals(@org.jetbrains.annotations.f final Object o) {
            return this == o || (o instanceof d && k0.g(this.a, ((d)o).a));
        }
        
        public int getActionId() {
            return 2131296328;
        }
        
        @org.jetbrains.annotations.e
        public Bundle getArguments() {
            final Bundle bundle = new Bundle();
            bundle.putString("information", this.a);
            return bundle;
        }
        
        @Override
        public int hashCode() {
            return this.a.hashCode();
        }
        
        @org.jetbrains.annotations.e
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("ActionCalenderPeriodFragmentToCalendarPeriodLessonInfoFragment(information=");
            sb.append(this.a);
            sb.append(')');
            return sb.toString();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\t\u0010\u0007\u001a\u00020\u0006H\u00c6\u0003J\u0013\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\b\u001a\u00020\u0006H\u00c6\u0001J\t\u0010\f\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\r\u001a\u00020\u0002H\u00d6\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003R\u0019\u0010\b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017" }, d2 = { "com/untis/mobile/calendar/ui/period/w$e", "Landroidx/navigation/d0;", "", "getActionId", "Landroid/os/Bundle;", "getArguments", "Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;", "a", "period", "Lcom/untis/mobile/calendar/ui/period/w$e;", "b", "", "toString", "hashCode", "", "other", "", "equals", "Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;", "d", "()Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;", "<init>", "(Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    private static final class e implements d0
    {
        @org.jetbrains.annotations.e
        private final CalendarPeriod a;
        
        public e(@org.jetbrains.annotations.e final CalendarPeriod a) {
            k0.p(a, "period");
            this.a = a;
        }
        
        @org.jetbrains.annotations.e
        public final CalendarPeriod a() {
            return this.a;
        }
        
        @org.jetbrains.annotations.e
        public final e b(@org.jetbrains.annotations.e final CalendarPeriod calendarPeriod) {
            k0.p(calendarPeriod, "period");
            return new e(calendarPeriod);
        }
        
        @org.jetbrains.annotations.e
        public final CalendarPeriod d() {
            return this.a;
        }
        
        @Override
        public boolean equals(@org.jetbrains.annotations.f final Object o) {
            return this == o || (o instanceof e && k0.g(this.a, ((e)o).a));
        }
        
        public int getActionId() {
            return 2131296329;
        }
        
        @org.jetbrains.annotations.e
        public Bundle getArguments() {
            final Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(CalendarPeriod.class)) {
                bundle.putParcelable("period", (Parcelable)this.a);
            }
            else {
                if (!Serializable.class.isAssignableFrom(CalendarPeriod.class)) {
                    throw new UnsupportedOperationException(k0.C(CalendarPeriod.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
                }
                bundle.putSerializable("period", (Serializable)this.a);
            }
            return bundle;
        }
        
        @Override
        public int hashCode() {
            return this.a.hashCode();
        }
        
        @org.jetbrains.annotations.e
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("ActionCalenderPeriodFragmentToCalendarPeriodNotesAllFragment(period=");
            sb.append(this.a);
            sb.append(')');
            return sb.toString();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\t\u0010\u0007\u001a\u00020\u0006H\u00c6\u0003J\u0013\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\b\u001a\u00020\u0006H\u00c6\u0001J\t\u0010\f\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\r\u001a\u00020\u0002H\u00d6\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003R\u0019\u0010\b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017" }, d2 = { "com/untis/mobile/calendar/ui/period/w$f", "Landroidx/navigation/d0;", "", "getActionId", "Landroid/os/Bundle;", "getArguments", "Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;", "a", "period", "Lcom/untis/mobile/calendar/ui/period/w$f;", "b", "", "toString", "hashCode", "", "other", "", "equals", "Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;", "d", "()Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;", "<init>", "(Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    private static final class f implements d0
    {
        @org.jetbrains.annotations.e
        private final CalendarPeriod a;
        
        public f(@org.jetbrains.annotations.e final CalendarPeriod a) {
            k0.p(a, "period");
            this.a = a;
        }
        
        @org.jetbrains.annotations.e
        public final CalendarPeriod a() {
            return this.a;
        }
        
        @org.jetbrains.annotations.e
        public final f b(@org.jetbrains.annotations.e final CalendarPeriod calendarPeriod) {
            k0.p(calendarPeriod, "period");
            return new f(calendarPeriod);
        }
        
        @org.jetbrains.annotations.e
        public final CalendarPeriod d() {
            return this.a;
        }
        
        @Override
        public boolean equals(@org.jetbrains.annotations.f final Object o) {
            return this == o || (o instanceof f && k0.g(this.a, ((f)o).a));
        }
        
        public int getActionId() {
            return 2131296330;
        }
        
        @org.jetbrains.annotations.e
        public Bundle getArguments() {
            final Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(CalendarPeriod.class)) {
                bundle.putParcelable("period", (Parcelable)this.a);
            }
            else {
                if (!Serializable.class.isAssignableFrom(CalendarPeriod.class)) {
                    throw new UnsupportedOperationException(k0.C(CalendarPeriod.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
                }
                bundle.putSerializable("period", (Serializable)this.a);
            }
            return bundle;
        }
        
        @Override
        public int hashCode() {
            return this.a.hashCode();
        }
        
        @org.jetbrains.annotations.e
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("ActionCalenderPeriodFragmentToCalendarPeriodNotesTeacherFragment(period=");
            sb.append(this.a);
            sb.append(')');
            return sb.toString();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0015\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001J\t\u0010\f\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\r\u001a\u00020\u0002H\u00d6\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003R\u001b\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017" }, d2 = { "com/untis/mobile/calendar/ui/period/w$g", "Landroidx/navigation/d0;", "", "getActionId", "Landroid/os/Bundle;", "getArguments", "Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;", "a", "period", "Lcom/untis/mobile/calendar/ui/period/w$g;", "b", "", "toString", "hashCode", "", "other", "", "equals", "Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;", "d", "()Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;", "<init>", "(Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    private static final class g implements d0
    {
        @org.jetbrains.annotations.f
        private final CalendarPeriod a;
        
        public g() {
            this(null, 1, null);
        }
        
        public g(@org.jetbrains.annotations.f final CalendarPeriod a) {
            this.a = a;
        }
        
        @org.jetbrains.annotations.f
        public final CalendarPeriod a() {
            return this.a;
        }
        
        @org.jetbrains.annotations.e
        public final g b(@org.jetbrains.annotations.f final CalendarPeriod calendarPeriod) {
            return new g(calendarPeriod);
        }
        
        @org.jetbrains.annotations.f
        public final CalendarPeriod d() {
            return this.a;
        }
        
        @Override
        public boolean equals(@org.jetbrains.annotations.f final Object o) {
            return this == o || (o instanceof g && k0.g(this.a, ((g)o).a));
        }
        
        public int getActionId() {
            return 2131296331;
        }
        
        @org.jetbrains.annotations.e
        public Bundle getArguments() {
            final Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(CalendarPeriod.class)) {
                bundle.putParcelable("period", (Parcelable)this.a);
            }
            else if (Serializable.class.isAssignableFrom(CalendarPeriod.class)) {
                bundle.putSerializable("period", (Serializable)this.a);
            }
            return bundle;
        }
        
        @Override
        public int hashCode() {
            final CalendarPeriod a = this.a;
            int hashCode;
            if (a == null) {
                hashCode = 0;
            }
            else {
                hashCode = a.hashCode();
            }
            return hashCode;
        }
        
        @org.jetbrains.annotations.e
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("ActionCalenderPeriodFragmentToCalendarPeriodOnlineLesson(period=");
            sb.append(this.a);
            sb.append(')');
            return sb.toString();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0015\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001J\t\u0010\f\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\r\u001a\u00020\u0002H\u00d6\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003R\u001b\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017" }, d2 = { "com/untis/mobile/calendar/ui/period/w$h", "Landroidx/navigation/d0;", "", "getActionId", "Landroid/os/Bundle;", "getArguments", "Lcom/untis/mobile/calendar/persistence/model/entity/CalendarPeriodRoom;", "a", "room", "Lcom/untis/mobile/calendar/ui/period/w$h;", "b", "", "toString", "hashCode", "", "other", "", "equals", "Lcom/untis/mobile/calendar/persistence/model/entity/CalendarPeriodRoom;", "d", "()Lcom/untis/mobile/calendar/persistence/model/entity/CalendarPeriodRoom;", "<init>", "(Lcom/untis/mobile/calendar/persistence/model/entity/CalendarPeriodRoom;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    private static final class h implements d0
    {
        @org.jetbrains.annotations.f
        private final CalendarPeriodRoom a;
        
        public h() {
            this(null, 1, null);
        }
        
        public h(@org.jetbrains.annotations.f final CalendarPeriodRoom a) {
            this.a = a;
        }
        
        @org.jetbrains.annotations.f
        public final CalendarPeriodRoom a() {
            return this.a;
        }
        
        @org.jetbrains.annotations.e
        public final h b(@org.jetbrains.annotations.f final CalendarPeriodRoom calendarPeriodRoom) {
            return new h(calendarPeriodRoom);
        }
        
        @org.jetbrains.annotations.f
        public final CalendarPeriodRoom d() {
            return this.a;
        }
        
        @Override
        public boolean equals(@org.jetbrains.annotations.f final Object o) {
            return this == o || (o instanceof h && k0.g(this.a, ((h)o).a));
        }
        
        public int getActionId() {
            return 2131296332;
        }
        
        @org.jetbrains.annotations.e
        public Bundle getArguments() {
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
        
        @org.jetbrains.annotations.e
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("ActionCalenderPeriodFragmentToCalendarPeriodRoomFragment(room=");
            sb.append(this.a);
            sb.append(')');
            return sb.toString();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\t\u0010\u0007\u001a\u00020\u0006H\u00c6\u0003J\u0013\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\b\u001a\u00020\u0006H\u00c6\u0001J\t\u0010\f\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\r\u001a\u00020\u0002H\u00d6\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003R\u0019\u0010\b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017" }, d2 = { "com/untis/mobile/calendar/ui/period/w$i", "Landroidx/navigation/d0;", "", "getActionId", "Landroid/os/Bundle;", "getArguments", "Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;", "a", "period", "Lcom/untis/mobile/calendar/ui/period/w$i;", "b", "", "toString", "hashCode", "", "other", "", "equals", "Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;", "d", "()Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;", "<init>", "(Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    private static final class i implements d0
    {
        @org.jetbrains.annotations.e
        private final CalendarPeriod a;
        
        public i(@org.jetbrains.annotations.e final CalendarPeriod a) {
            k0.p(a, "period");
            this.a = a;
        }
        
        @org.jetbrains.annotations.e
        public final CalendarPeriod a() {
            return this.a;
        }
        
        @org.jetbrains.annotations.e
        public final i b(@org.jetbrains.annotations.e final CalendarPeriod calendarPeriod) {
            k0.p(calendarPeriod, "period");
            return new i(calendarPeriod);
        }
        
        @org.jetbrains.annotations.e
        public final CalendarPeriod d() {
            return this.a;
        }
        
        @Override
        public boolean equals(@org.jetbrains.annotations.f final Object o) {
            return this == o || (o instanceof i && k0.g(this.a, ((i)o).a));
        }
        
        public int getActionId() {
            return 2131296333;
        }
        
        @org.jetbrains.annotations.e
        public Bundle getArguments() {
            final Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(CalendarPeriod.class)) {
                bundle.putParcelable("period", (Parcelable)this.a);
            }
            else {
                if (!Serializable.class.isAssignableFrom(CalendarPeriod.class)) {
                    throw new UnsupportedOperationException(k0.C(CalendarPeriod.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
                }
                bundle.putSerializable("period", (Serializable)this.a);
            }
            return bundle;
        }
        
        @Override
        public int hashCode() {
            return this.a.hashCode();
        }
        
        @org.jetbrains.annotations.e
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("ActionCalenderPeriodFragmentToCalendarPeriodTeachingContentFragment(period=");
            sb.append(this.a);
            sb.append(')');
            return sb.toString();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000>\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\u000e\u001a\u00020\u0004J#\u0010\u0012\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0016\u001a\u00020\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000f2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019¨\u0006\u001e" }, d2 = { "com/untis/mobile/calendar/ui/period/w$j", "", "Lcom/untis/mobile/calendar/persistence/model/entity/CalendarPeriodRoom;", "room", "Landroidx/navigation/d0;", "j", "Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;", "period", "f", "Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodExam;", "exam", "c", "l", "g", "a", "", "Lcom/untis/mobile/persistence/models/classbook/classregevent/Event;", "events", "b", "([Lcom/untis/mobile/persistence/models/classbook/classregevent/Event;Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;)Landroidx/navigation/d0;", "Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;", "homework", "d", "([Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;)Landroidx/navigation/d0;", "h", "", "information", "e", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class j
    {
        private j() {
        }
        
        @org.jetbrains.annotations.e
        public final d0 a() {
            return (d0)new androidx.navigation.a(2131296324);
        }
        
        @org.jetbrains.annotations.e
        public final d0 b(@org.jetbrains.annotations.e final Event[] array, @org.jetbrains.annotations.e final CalendarPeriod calendarPeriod) {
            k0.p(array, "events");
            k0.p(calendarPeriod, "period");
            return (d0)new a(array, calendarPeriod);
        }
        
        @org.jetbrains.annotations.e
        public final d0 c(@org.jetbrains.annotations.e final CalendarPeriodExam calendarPeriodExam) {
            k0.p(calendarPeriodExam, "exam");
            return (d0)new b(calendarPeriodExam);
        }
        
        @org.jetbrains.annotations.e
        public final d0 d(@org.jetbrains.annotations.e final HomeWork[] array, @org.jetbrains.annotations.e final CalendarPeriod calendarPeriod) {
            k0.p(array, "homework");
            k0.p(calendarPeriod, "period");
            return (d0)new c(array, calendarPeriod);
        }
        
        @org.jetbrains.annotations.e
        public final d0 e(@org.jetbrains.annotations.e final String s) {
            k0.p(s, "information");
            return (d0)new d(s);
        }
        
        @org.jetbrains.annotations.e
        public final d0 f(@org.jetbrains.annotations.e final CalendarPeriod calendarPeriod) {
            k0.p(calendarPeriod, "period");
            return (d0)new e(calendarPeriod);
        }
        
        @org.jetbrains.annotations.e
        public final d0 g(@org.jetbrains.annotations.e final CalendarPeriod calendarPeriod) {
            k0.p(calendarPeriod, "period");
            return (d0)new f(calendarPeriod);
        }
        
        @org.jetbrains.annotations.e
        public final d0 h(@org.jetbrains.annotations.f final CalendarPeriod calendarPeriod) {
            return (d0)new g(calendarPeriod);
        }
        
        @org.jetbrains.annotations.e
        public final d0 j(@org.jetbrains.annotations.f final CalendarPeriodRoom calendarPeriodRoom) {
            return (d0)new h(calendarPeriodRoom);
        }
        
        @org.jetbrains.annotations.e
        public final d0 l(@org.jetbrains.annotations.e final CalendarPeriod calendarPeriod) {
            k0.p(calendarPeriod, "period");
            return (d0)new i(calendarPeriod);
        }
    }
}
