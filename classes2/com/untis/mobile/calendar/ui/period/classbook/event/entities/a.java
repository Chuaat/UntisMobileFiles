// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.ui.period.classbook.event.entities;

import java.io.Serializable;
import android.os.Parcelable;
import java.util.Arrays;
import org.jetbrains.annotations.f;
import m6.k;
import android.os.Bundle;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import com.untis.mobile.calendar.persistence.model.CalendarPeriod;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import androidx.navigation.l;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u0000 \r2\u00020\u0001:\u0001\u0005B\u001f\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0007\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\t\u001a\u00020\bH\u00c6\u0003J'\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\bH\u00c6\u0001J\t\u0010\u000e\u001a\u00020\u0004H\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003R\u0019\u0010\f\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 " }, d2 = { "Lcom/untis/mobile/calendar/ui/period/classbook/event/entities/a;", "Landroidx/navigation/l;", "Landroid/os/Bundle;", "i", "", "a", "", "b", "Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;", "c", "entityType", "entityIds", "period", "d", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;", "h", "()Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "[J", "f", "()[J", "<init>", "(Ljava/lang/String;[JLcom/untis/mobile/calendar/persistence/model/CalendarPeriod;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class a implements l
{
    @e
    public static final a d;
    @e
    private final String a;
    @e
    private final long[] b;
    @e
    private final CalendarPeriod c;
    
    static {
        d = new a(null);
    }
    
    public a(@e final String a, @e final long[] b, @e final CalendarPeriod c) {
        k0.p(a, "entityType");
        k0.p(b, "entityIds");
        k0.p(c, "period");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @k
    @e
    public static final a fromBundle(@e final Bundle bundle) {
        return a.d.a(bundle);
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
    
    @e
    public final CalendarPeriod h() {
        return this.c;
    }
    
    @Override
    public int hashCode() {
        return (this.a.hashCode() * 31 + Arrays.hashCode(this.b)) * 31 + this.c.hashCode();
    }
    
    @e
    public final Bundle i() {
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
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CalendarPeriodEventEntitiesFragmentArgs(entityType=");
        sb.append(this.a);
        sb.append(", entityIds=");
        sb.append(Arrays.toString(this.b));
        sb.append(", period=");
        sb.append(this.c);
        sb.append(')');
        return sb.toString();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b" }, d2 = { "com/untis/mobile/calendar/ui/period/classbook/event/entities/a$a", "", "Landroid/os/Bundle;", "bundle", "Lcom/untis/mobile/calendar/ui/period/classbook/event/entities/a;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @k
        @e
        public final com.untis.mobile.calendar.ui.period.classbook.event.entities.a a(@e final Bundle bundle) {
            k0.p(bundle, "bundle");
            bundle.setClassLoader(com.untis.mobile.calendar.ui.period.classbook.event.entities.a.class.getClassLoader());
            if (!bundle.containsKey("entityType")) {
                throw new IllegalArgumentException("Required argument \"entityType\" is missing and does not have an android:defaultValue");
            }
            final String string = bundle.getString("entityType");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"entityType\" is marked as non-null but was passed a null value.");
            }
            if (!bundle.containsKey("entityIds")) {
                throw new IllegalArgumentException("Required argument \"entityIds\" is missing and does not have an android:defaultValue");
            }
            final long[] longArray = bundle.getLongArray("entityIds");
            if (longArray == null) {
                throw new IllegalArgumentException("Argument \"entityIds\" is marked as non-null but was passed a null value.");
            }
            if (!bundle.containsKey("period")) {
                throw new IllegalArgumentException("Required argument \"period\" is missing and does not have an android:defaultValue");
            }
            if (!Parcelable.class.isAssignableFrom(CalendarPeriod.class) && !Serializable.class.isAssignableFrom(CalendarPeriod.class)) {
                throw new UnsupportedOperationException(k0.C(CalendarPeriod.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
            }
            final CalendarPeriod calendarPeriod = (CalendarPeriod)bundle.get("period");
            if (calendarPeriod != null) {
                return new com.untis.mobile.calendar.ui.period.classbook.event.entities.a(string, longArray, calendarPeriod);
            }
            throw new IllegalArgumentException("Argument \"period\" is marked as non-null but was passed a null value.");
        }
    }
}
