// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.ui.option.classlead;

import androidx.navigation.a;
import java.util.Arrays;
import android.os.Bundle;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import androidx.navigation.d0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 \u00042\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007" }, d2 = { "Lcom/untis/mobile/dashboard/ui/option/classlead/h;", "", "<init>", "()V", "a", "b", "c", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class h
{
    @e
    public static final c a;
    
    static {
        a = new c(null);
    }
    
    private h() {
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\t\u0010\u0007\u001a\u00020\u0006H\u00c6\u0003J\u0013\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\b\u001a\u00020\u0006H\u00c6\u0001J\t\u0010\f\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\r\u001a\u00020\u0002H\u00d6\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003R\u0019\u0010\b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017" }, d2 = { "com/untis/mobile/dashboard/ui/option/classlead/h$a", "Landroidx/navigation/d0;", "", "getActionId", "Landroid/os/Bundle;", "getArguments", "", "a", "classLeadIds", "Lcom/untis/mobile/dashboard/ui/option/classlead/h$a;", "b", "", "toString", "hashCode", "", "other", "", "equals", "[J", "d", "()[J", "<init>", "([J)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    private static final class a implements d0
    {
        @e
        private final long[] a;
        
        public a(@e final long[] a) {
            k0.p(a, "classLeadIds");
            this.a = a;
        }
        
        @e
        public final long[] a() {
            return this.a;
        }
        
        @e
        public final a b(@e final long[] array) {
            k0.p(array, "classLeadIds");
            return new a(array);
        }
        
        @e
        public final long[] d() {
            return this.a;
        }
        
        @Override
        public boolean equals(@f final Object o) {
            return this == o || (o instanceof a && k0.g(this.a, ((a)o).a));
        }
        
        public int getActionId() {
            return 2131296342;
        }
        
        @e
        public Bundle getArguments() {
            final Bundle bundle = new Bundle();
            bundle.putLongArray("classLeadIds", this.a);
            return bundle;
        }
        
        @Override
        public int hashCode() {
            return Arrays.hashCode(this.a);
        }
        
        @e
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("ActionDashboardClassLeadsFragmentToDashboardClassLeadAbsencesFragment(classLeadIds=");
            sb.append(Arrays.toString(this.a));
            sb.append(')');
            return sb.toString();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\t\u0010\u0007\u001a\u00020\u0006H\u00c6\u0003J\u0013\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\b\u001a\u00020\u0006H\u00c6\u0001J\t\u0010\f\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\r\u001a\u00020\u0002H\u00d6\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003R\u0019\u0010\b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017" }, d2 = { "com/untis/mobile/dashboard/ui/option/classlead/h$b", "Landroidx/navigation/d0;", "", "getActionId", "Landroid/os/Bundle;", "getArguments", "", "a", "classLeadIds", "Lcom/untis/mobile/dashboard/ui/option/classlead/h$b;", "b", "", "toString", "hashCode", "", "other", "", "equals", "[J", "d", "()[J", "<init>", "([J)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    private static final class b implements d0
    {
        @e
        private final long[] a;
        
        public b(@e final long[] a) {
            k0.p(a, "classLeadIds");
            this.a = a;
        }
        
        @e
        public final long[] a() {
            return this.a;
        }
        
        @e
        public final b b(@e final long[] array) {
            k0.p(array, "classLeadIds");
            return new b(array);
        }
        
        @e
        public final long[] d() {
            return this.a;
        }
        
        @Override
        public boolean equals(@f final Object o) {
            return this == o || (o instanceof b && k0.g(this.a, ((b)o).a));
        }
        
        public int getActionId() {
            return 2131296343;
        }
        
        @e
        public Bundle getArguments() {
            final Bundle bundle = new Bundle();
            bundle.putLongArray("classLeadIds", this.a);
            return bundle;
        }
        
        @Override
        public int hashCode() {
            return Arrays.hashCode(this.a);
        }
        
        @e
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("ActionDashboardClassLeadsFragmentToDashboardClassLeadEventsFragment(classLeadIds=");
            sb.append(Arrays.toString(this.a));
            sb.append(')');
            return sb.toString();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n" }, d2 = { "com/untis/mobile/dashboard/ui/option/classlead/h$c", "", "Landroidx/navigation/d0;", "c", "", "classLeadIds", "a", "b", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class c
    {
        private c() {
        }
        
        @e
        public final d0 a(@e final long[] array) {
            k0.p(array, "classLeadIds");
            return (d0)new a(array);
        }
        
        @e
        public final d0 b(@e final long[] array) {
            k0.p(array, "classLeadIds");
            return (d0)new b(array);
        }
        
        @e
        public final d0 c() {
            return (d0)new androidx.navigation.a(2131296344);
        }
    }
}
