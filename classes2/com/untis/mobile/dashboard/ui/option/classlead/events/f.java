// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.ui.option.classlead.events;

import java.util.Arrays;
import m6.k;
import android.os.Bundle;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import androidx.navigation.l;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00072\u00020\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0004H\u00c6\u0001J\t\u0010\t\u001a\u00020\bH\u00d6\u0001J\t\u0010\u000b\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u00d6\u0003R\u0019\u0010\u0006\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015" }, d2 = { "Lcom/untis/mobile/dashboard/ui/option/classlead/events/f;", "Landroidx/navigation/l;", "Landroid/os/Bundle;", "e", "", "a", "classLeadIds", "b", "", "toString", "", "hashCode", "", "other", "", "equals", "[J", "d", "()[J", "<init>", "([J)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class f implements l
{
    @e
    public static final a b;
    @e
    private final long[] a;
    
    static {
        b = new a(null);
    }
    
    public f(@e final long[] a) {
        k0.p(a, "classLeadIds");
        this.a = a;
    }
    
    @k
    @e
    public static final f fromBundle(@e final Bundle bundle) {
        return f.b.a(bundle);
    }
    
    @e
    public final long[] a() {
        return this.a;
    }
    
    @e
    public final f b(@e final long[] array) {
        k0.p(array, "classLeadIds");
        return new f(array);
    }
    
    @e
    public final long[] d() {
        return this.a;
    }
    
    @e
    public final Bundle e() {
        final Bundle bundle = new Bundle();
        bundle.putLongArray("classLeadIds", this.a);
        return bundle;
    }
    
    @Override
    public boolean equals(@org.jetbrains.annotations.f final Object o) {
        return this == o || (o instanceof f && k0.g(this.a, ((f)o).a));
    }
    
    @Override
    public int hashCode() {
        return Arrays.hashCode(this.a);
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("DashboardClassLeadEventsFragmentArgs(classLeadIds=");
        sb.append(Arrays.toString(this.a));
        sb.append(')');
        return sb.toString();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b" }, d2 = { "com/untis/mobile/dashboard/ui/option/classlead/events/f$a", "", "Landroid/os/Bundle;", "bundle", "Lcom/untis/mobile/dashboard/ui/option/classlead/events/f;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @k
        @e
        public final f a(@e final Bundle bundle) {
            k0.p(bundle, "bundle");
            bundle.setClassLoader(f.class.getClassLoader());
            if (!bundle.containsKey("classLeadIds")) {
                throw new IllegalArgumentException("Required argument \"classLeadIds\" is missing and does not have an android:defaultValue");
            }
            final long[] longArray = bundle.getLongArray("classLeadIds");
            if (longArray != null) {
                return new f(longArray);
            }
            throw new IllegalArgumentException("Argument \"classLeadIds\" is marked as non-null but was passed a null value.");
        }
    }
}
