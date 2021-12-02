// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.ui.option.addabsence;

import kotlin.jvm.internal.k0;
import a4.a;
import org.jetbrains.annotations.f;
import m6.k;
import android.os.Bundle;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import androidx.navigation.l;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u0000 \t2\u00020\u0001:\u0001\u0005B\u001b\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0006\u001a\u00020\u0004H\u00c6\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u00c6\u0001J\t\u0010\u000b\u001a\u00020\nH\u00d6\u0001J\t\u0010\r\u001a\u00020\fH\u00d6\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0018" }, d2 = { "Lcom/untis/mobile/dashboard/ui/option/addabsence/n;", "Landroidx/navigation/l;", "Landroid/os/Bundle;", "g", "", "a", "b", "studentId", "absenceId", "c", "", "toString", "", "hashCode", "", "other", "", "equals", "J", "f", "()J", "e", "<init>", "(JJ)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class n implements l
{
    @e
    public static final a c;
    private final long a;
    private final long b;
    
    static {
        c = new a(null);
    }
    
    public n() {
        this(0L, 0L, 3, null);
    }
    
    public n(final long a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    @k
    @e
    public static final n fromBundle(@e final Bundle bundle) {
        return n.c.a(bundle);
    }
    
    public final long a() {
        return this.a;
    }
    
    public final long b() {
        return this.b;
    }
    
    @e
    public final n c(final long n, final long n2) {
        return new n(n, n2);
    }
    
    public final long e() {
        return this.b;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof n)) {
            return false;
        }
        final n n = (n)o;
        return this.a == n.a && this.b == n.b;
    }
    
    public final long f() {
        return this.a;
    }
    
    @e
    public final Bundle g() {
        final Bundle bundle = new Bundle();
        bundle.putLong("studentId", this.a);
        bundle.putLong("absenceId", this.b);
        return bundle;
    }
    
    @Override
    public int hashCode() {
        return a4.a.a(this.a) * 31 + a4.a.a(this.b);
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("AddStudentAbsenceFragmentArgs(studentId=");
        sb.append(this.a);
        sb.append(", absenceId=");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b" }, d2 = { "com/untis/mobile/dashboard/ui/option/addabsence/n$a", "", "Landroid/os/Bundle;", "bundle", "Lcom/untis/mobile/dashboard/ui/option/addabsence/n;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @k
        @e
        public final n a(@e final Bundle bundle) {
            k0.p(bundle, "bundle");
            bundle.setClassLoader(n.class.getClassLoader());
            final boolean containsKey = bundle.containsKey("studentId");
            long long1 = 0L;
            long long2;
            if (containsKey) {
                long2 = bundle.getLong("studentId");
            }
            else {
                long2 = 0L;
            }
            if (bundle.containsKey("absenceId")) {
                long1 = bundle.getLong("absenceId");
            }
            return new n(long2, long1);
        }
    }
}
