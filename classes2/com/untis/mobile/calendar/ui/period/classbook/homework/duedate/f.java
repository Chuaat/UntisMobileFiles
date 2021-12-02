// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.ui.period.classbook.homework.duedate;

import java.util.Arrays;
import java.io.Serializable;
import android.os.Parcelable;
import m6.k;
import android.os.Bundle;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import com.untis.mobile.persistence.models.classbook.homework.HomeWork;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import androidx.navigation.l;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u0000 \n2\u00020\u0001:\u0001\u0005B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0007\u001a\u00020\u0006H\u00c6\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0006H\u00c6\u0001J\t\u0010\f\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\rH\u00d6\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003R\u0019\u0010\t\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b" }, d2 = { "Lcom/untis/mobile/calendar/ui/period/classbook/homework/duedate/f;", "Landroidx/navigation/l;", "Landroid/os/Bundle;", "g", "Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;", "a", "", "b", "homework", "dueDates", "c", "", "toString", "", "hashCode", "", "other", "", "equals", "[J", "e", "()[J", "Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;", "f", "()Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;", "<init>", "(Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;[J)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class f implements l
{
    @e
    public static final a c;
    @e
    private final HomeWork a;
    @e
    private final long[] b;
    
    static {
        c = new a(null);
    }
    
    public f(@e final HomeWork a, @e final long[] b) {
        k0.p(a, "homework");
        k0.p(b, "dueDates");
        this.a = a;
        this.b = b;
    }
    
    @k
    @e
    public static final f fromBundle(@e final Bundle bundle) {
        return f.c.a(bundle);
    }
    
    @e
    public final HomeWork a() {
        return this.a;
    }
    
    @e
    public final long[] b() {
        return this.b;
    }
    
    @e
    public final f c(@e final HomeWork homeWork, @e final long[] array) {
        k0.p(homeWork, "homework");
        k0.p(array, "dueDates");
        return new f(homeWork, array);
    }
    
    @e
    public final long[] e() {
        return this.b;
    }
    
    @Override
    public boolean equals(@org.jetbrains.annotations.f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof f)) {
            return false;
        }
        final f f = (f)o;
        return k0.g(this.a, f.a) && k0.g(this.b, f.b);
    }
    
    @e
    public final HomeWork f() {
        return this.a;
    }
    
    @e
    public final Bundle g() {
        final Bundle bundle = new Bundle();
        if (Parcelable.class.isAssignableFrom(HomeWork.class)) {
            bundle.putParcelable("homework", (Parcelable)this.a);
        }
        else {
            if (!Serializable.class.isAssignableFrom(HomeWork.class)) {
                throw new UnsupportedOperationException(k0.C(HomeWork.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("homework", (Serializable)this.a);
        }
        bundle.putLongArray("dueDates", this.b);
        return bundle;
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode() * 31 + Arrays.hashCode(this.b);
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CalendarPeriodHomeworkDueDateFragmentArgs(homework=");
        sb.append(this.a);
        sb.append(", dueDates=");
        sb.append(Arrays.toString(this.b));
        sb.append(')');
        return sb.toString();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b" }, d2 = { "com/untis/mobile/calendar/ui/period/classbook/homework/duedate/f$a", "", "Landroid/os/Bundle;", "bundle", "Lcom/untis/mobile/calendar/ui/period/classbook/homework/duedate/f;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @k
        @e
        public final f a(@e final Bundle bundle) {
            k0.p(bundle, "bundle");
            bundle.setClassLoader(f.class.getClassLoader());
            if (!bundle.containsKey("homework")) {
                throw new IllegalArgumentException("Required argument \"homework\" is missing and does not have an android:defaultValue");
            }
            if (!Parcelable.class.isAssignableFrom(HomeWork.class) && !Serializable.class.isAssignableFrom(HomeWork.class)) {
                throw new UnsupportedOperationException(k0.C(HomeWork.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
            }
            final HomeWork homeWork = (HomeWork)bundle.get("homework");
            if (homeWork == null) {
                throw new IllegalArgumentException("Argument \"homework\" is marked as non-null but was passed a null value.");
            }
            if (!bundle.containsKey("dueDates")) {
                throw new IllegalArgumentException("Required argument \"dueDates\" is missing and does not have an android:defaultValue");
            }
            final long[] longArray = bundle.getLongArray("dueDates");
            if (longArray != null) {
                return new f(homeWork, longArray);
            }
            throw new IllegalArgumentException("Argument \"dueDates\" is marked as non-null but was passed a null value.");
        }
    }
}
