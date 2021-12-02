// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.ui.period.classbook.homework;

import java.io.Serializable;
import android.os.Parcelable;
import java.util.Arrays;
import org.jetbrains.annotations.f;
import m6.k;
import android.os.Bundle;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import com.untis.mobile.persistence.models.classbook.homework.HomeWork;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0086\b\u0018\u0000 \r2\u00020\u0001:\u0001\u0005B\u001f\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0007\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\t\u001a\u00020\bH\u00c6\u0003J'\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\bH\u00c6\u0001J\t\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003R\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\f\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 " }, d2 = { "Lcom/untis/mobile/calendar/ui/period/classbook/homework/l;", "Landroidx/navigation/l;", "Landroid/os/Bundle;", "i", "Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;", "a", "", "b", "", "c", "homework", "readOnly", "dueDates", "d", "", "toString", "", "hashCode", "", "other", "equals", "Z", "h", "()Z", "Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;", "g", "()Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;", "[J", "f", "()[J", "<init>", "(Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;Z[J)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class l implements androidx.navigation.l
{
    @e
    public static final a d;
    @e
    private final HomeWork a;
    private final boolean b;
    @e
    private final long[] c;
    
    static {
        d = new a(null);
    }
    
    public l(@e final HomeWork a, final boolean b, @e final long[] c) {
        k0.p(a, "homework");
        k0.p(c, "dueDates");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @k
    @e
    public static final l fromBundle(@e final Bundle bundle) {
        return l.d.a(bundle);
    }
    
    @e
    public final HomeWork a() {
        return this.a;
    }
    
    public final boolean b() {
        return this.b;
    }
    
    @e
    public final long[] c() {
        return this.c;
    }
    
    @e
    public final l d(@e final HomeWork homeWork, final boolean b, @e final long[] array) {
        k0.p(homeWork, "homework");
        k0.p(array, "dueDates");
        return new l(homeWork, b, array);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof l)) {
            return false;
        }
        final l l = (l)o;
        return k0.g(this.a, l.a) && this.b == l.b && k0.g(this.c, l.c);
    }
    
    @e
    public final long[] f() {
        return this.c;
    }
    
    @e
    public final HomeWork g() {
        return this.a;
    }
    
    public final boolean h() {
        return this.b;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.a.hashCode();
        int b;
        if ((b = (this.b ? 1 : 0)) != 0) {
            b = 1;
        }
        return (hashCode * 31 + b) * 31 + Arrays.hashCode(this.c);
    }
    
    @e
    public final Bundle i() {
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
        bundle.putBoolean("readOnly", this.b);
        bundle.putLongArray("dueDates", this.c);
        return bundle;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CalendarPeriodHomeworkDetailFragmentArgs(homework=");
        sb.append(this.a);
        sb.append(", readOnly=");
        sb.append(this.b);
        sb.append(", dueDates=");
        sb.append(Arrays.toString(this.c));
        sb.append(')');
        return sb.toString();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b" }, d2 = { "com/untis/mobile/calendar/ui/period/classbook/homework/l$a", "", "Landroid/os/Bundle;", "bundle", "Lcom/untis/mobile/calendar/ui/period/classbook/homework/l;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @k
        @e
        public final l a(@e final Bundle bundle) {
            k0.p(bundle, "bundle");
            bundle.setClassLoader(l.class.getClassLoader());
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
            if (!bundle.containsKey("readOnly")) {
                throw new IllegalArgumentException("Required argument \"readOnly\" is missing and does not have an android:defaultValue");
            }
            final boolean boolean1 = bundle.getBoolean("readOnly");
            if (!bundle.containsKey("dueDates")) {
                throw new IllegalArgumentException("Required argument \"dueDates\" is missing and does not have an android:defaultValue");
            }
            final long[] longArray = bundle.getLongArray("dueDates");
            if (longArray != null) {
                return new l(homeWork, boolean1, longArray);
            }
            throw new IllegalArgumentException("Argument \"dueDates\" is marked as non-null but was passed a null value.");
        }
    }
}
