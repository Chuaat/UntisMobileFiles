// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.ui.period.classbook.homework;

import java.util.Arrays;
import java.io.Serializable;
import android.os.Parcelable;
import android.os.Bundle;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.classbook.homework.HomeWork;
import androidx.navigation.d0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006" }, d2 = { "Lcom/untis/mobile/calendar/ui/period/classbook/homework/r;", "", "<init>", "()V", "a", "b", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class r
{
    @e
    public static final b a;
    
    static {
        a = new b(null);
    }
    
    private r() {
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\t\u0010\u0007\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\t\u001a\u00020\bH\u00c6\u0003J\t\u0010\u000b\u001a\u00020\nH\u00c6\u0003J'\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\nH\u00c6\u0001J\t\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003R\u0019\u0010\u000e\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\f\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\"" }, d2 = { "com/untis/mobile/calendar/ui/period/classbook/homework/r$a", "Landroidx/navigation/d0;", "", "getActionId", "Landroid/os/Bundle;", "getArguments", "Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;", "a", "", "b", "", "c", "homework", "readOnly", "dueDates", "Lcom/untis/mobile/calendar/ui/period/classbook/homework/r$a;", "d", "", "toString", "hashCode", "", "other", "equals", "[J", "f", "()[J", "Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;", "g", "()Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;", "Z", "h", "()Z", "<init>", "(Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;Z[J)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    private static final class a implements d0
    {
        @e
        private final HomeWork a;
        private final boolean b;
        @e
        private final long[] c;
        
        public a(@e final HomeWork a, final boolean b, @e final long[] c) {
            k0.p(a, "homework");
            k0.p(c, "dueDates");
            this.a = a;
            this.b = b;
            this.c = c;
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
        public final a d(@e final HomeWork homeWork, final boolean b, @e final long[] array) {
            k0.p(homeWork, "homework");
            k0.p(array, "dueDates");
            return new a(homeWork, b, array);
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
            return k0.g(this.a, a.a) && this.b == a.b && k0.g(this.c, a.c);
        }
        
        @e
        public final long[] f() {
            return this.c;
        }
        
        @e
        public final HomeWork g() {
            return this.a;
        }
        
        public int getActionId() {
            return 2131296321;
        }
        
        @e
        public Bundle getArguments() {
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
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("ActionCalendarPeriodHomeworkFragmentToCalendarPeriodHomeworkDetailFragment(homework=");
            sb.append(this.a);
            sb.append(", readOnly=");
            sb.append(this.b);
            sb.append(", dueDates=");
            sb.append(Arrays.toString(this.c));
            sb.append(')');
            return sb.toString();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\f" }, d2 = { "com/untis/mobile/calendar/ui/period/classbook/homework/r$b", "", "Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;", "homework", "", "readOnly", "", "dueDates", "Landroidx/navigation/d0;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class b
    {
        private b() {
        }
        
        @e
        public final d0 a(@e final HomeWork homeWork, final boolean b, @e final long[] array) {
            k0.p(homeWork, "homework");
            k0.p(array, "dueDates");
            return (d0)new a(homeWork, b, array);
        }
    }
}
