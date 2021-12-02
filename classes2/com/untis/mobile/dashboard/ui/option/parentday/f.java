// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.ui.option.parentday;

import a4.a;
import android.os.Bundle;
import androidx.navigation.d0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006" }, d2 = { "Lcom/untis/mobile/dashboard/ui/option/parentday/f;", "", "<init>", "()V", "a", "b", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class f
{
    @e
    public static final b a;
    
    static {
        a = new b(null);
    }
    
    private f() {
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\t\u0010\u0007\u001a\u00020\u0006H\u00c6\u0003J\u0013\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\b\u001a\u00020\u0006H\u00c6\u0001J\t\u0010\f\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\r\u001a\u00020\u0002H\u00d6\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003R\u0019\u0010\b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017" }, d2 = { "com/untis/mobile/dashboard/ui/option/parentday/f$a", "Landroidx/navigation/d0;", "", "getActionId", "Landroid/os/Bundle;", "getArguments", "", "a", "parentdayId", "Lcom/untis/mobile/dashboard/ui/option/parentday/f$a;", "b", "", "toString", "hashCode", "", "other", "", "equals", "J", "d", "()J", "<init>", "(J)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    private static final class a implements d0
    {
        private final long a;
        
        public a(final long a) {
            this.a = a;
        }
        
        public final long a() {
            return this.a;
        }
        
        @e
        public final a b(final long n) {
            return new a(n);
        }
        
        public final long d() {
            return this.a;
        }
        
        @Override
        public boolean equals(@org.jetbrains.annotations.f final Object o) {
            return this == o || (o instanceof a && this.a == ((a)o).a);
        }
        
        public int getActionId() {
            return 2131296353;
        }
        
        @e
        public Bundle getArguments() {
            final Bundle bundle = new Bundle();
            bundle.putLong("parentdayId", this.a);
            return bundle;
        }
        
        @Override
        public int hashCode() {
            return a4.a.a(this.a);
        }
        
        @e
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("ActionDashboardParentDaysFragmentToDashboardParentDayFragment(parentdayId=");
            sb.append(this.a);
            sb.append(')');
            return sb.toString();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b" }, d2 = { "com/untis/mobile/dashboard/ui/option/parentday/f$b", "", "", "parentdayId", "Landroidx/navigation/d0;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class b
    {
        private b() {
        }
        
        @e
        public final d0 a(final long n) {
            return (d0)new a(n);
        }
    }
}
