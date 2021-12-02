// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.ui.period.exam;

import org.jetbrains.annotations.f;
import java.io.Serializable;
import android.os.Parcelable;
import m6.k;
import android.os.Bundle;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import com.untis.mobile.calendar.persistence.model.common.CalendarPeriodExam;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import androidx.navigation.l;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00072\u00020\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0004H\u00c6\u0001J\t\u0010\t\u001a\u00020\bH\u00d6\u0001J\t\u0010\u000b\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u00d6\u0003R\u0019\u0010\u0006\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015" }, d2 = { "Lcom/untis/mobile/calendar/ui/period/exam/b;", "Landroidx/navigation/l;", "Landroid/os/Bundle;", "e", "Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodExam;", "a", "exam", "b", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodExam;", "d", "()Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodExam;", "<init>", "(Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodExam;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b implements l
{
    @e
    public static final a b;
    @e
    private final CalendarPeriodExam a;
    
    static {
        b = new a(null);
    }
    
    public b(@e final CalendarPeriodExam a) {
        k0.p(a, "exam");
        this.a = a;
    }
    
    @k
    @e
    public static final b fromBundle(@e final Bundle bundle) {
        return com.untis.mobile.calendar.ui.period.exam.b.b.a(bundle);
    }
    
    @e
    public final CalendarPeriodExam a() {
        return this.a;
    }
    
    @e
    public final b b(@e final CalendarPeriodExam calendarPeriodExam) {
        k0.p(calendarPeriodExam, "exam");
        return new b(calendarPeriodExam);
    }
    
    @e
    public final CalendarPeriodExam d() {
        return this.a;
    }
    
    @e
    public final Bundle e() {
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
    public boolean equals(@f final Object o) {
        return this == o || (o instanceof b && k0.g(this.a, ((b)o).a));
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CalendarPeriodExamFragmentArgs(exam=");
        sb.append(this.a);
        sb.append(')');
        return sb.toString();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b" }, d2 = { "com/untis/mobile/calendar/ui/period/exam/b$a", "", "Landroid/os/Bundle;", "bundle", "Lcom/untis/mobile/calendar/ui/period/exam/b;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @k
        @e
        public final b a(@e final Bundle bundle) {
            k0.p(bundle, "bundle");
            bundle.setClassLoader(b.class.getClassLoader());
            if (!bundle.containsKey("exam")) {
                throw new IllegalArgumentException("Required argument \"exam\" is missing and does not have an android:defaultValue");
            }
            if (!Parcelable.class.isAssignableFrom(CalendarPeriodExam.class) && !Serializable.class.isAssignableFrom(CalendarPeriodExam.class)) {
                throw new UnsupportedOperationException(k0.C(CalendarPeriodExam.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
            }
            final CalendarPeriodExam calendarPeriodExam = (CalendarPeriodExam)bundle.get("exam");
            if (calendarPeriodExam != null) {
                return new b(calendarPeriodExam);
            }
            throw new IllegalArgumentException("Argument \"exam\" is marked as non-null but was passed a null value.");
        }
    }
}
