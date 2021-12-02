// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.ui;

import android.os.Bundle;
import org.jetbrains.annotations.f;
import androidx.navigation.d0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006" }, d2 = { "Lcom/untis/mobile/dashboard/ui/a;", "", "<init>", "()V", "a", "b", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class a
{
    @e
    public static final b a;
    
    static {
        a = new b(null);
    }
    
    private a() {
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\t\u0010\u0007\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\b\u001a\u00020\u0006H\u00c6\u0003J\u001d\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0006H\u00c6\u0001J\t\u0010\u000e\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0002H\u00d6\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003R\u0019\u0010\t\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\n\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u001a" }, d2 = { "com/untis/mobile/dashboard/ui/a$a", "Landroidx/navigation/d0;", "", "getActionId", "Landroid/os/Bundle;", "getArguments", "", "a", "b", "studentId", "absenceId", "Lcom/untis/mobile/dashboard/ui/a$a;", "c", "", "toString", "hashCode", "", "other", "", "equals", "J", "f", "()J", "e", "<init>", "(JJ)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    private static final class a implements d0
    {
        private final long a;
        private final long b;
        
        public a() {
            this(0L, 0L, 3, null);
        }
        
        public a(final long a, final long b) {
            this.a = a;
            this.b = b;
        }
        
        public final long a() {
            return this.a;
        }
        
        public final long b() {
            return this.b;
        }
        
        @e
        public final a c(final long n, final long n2) {
            return new a(n, n2);
        }
        
        public final long e() {
            return this.b;
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
            return this.a == a.a && this.b == a.b;
        }
        
        public final long f() {
            return this.a;
        }
        
        public int getActionId() {
            return 2131296345;
        }
        
        @e
        public Bundle getArguments() {
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
            sb.append("ActionDashboardFragmentToAddStudentAbsenceFragment(studentId=");
            sb.append(this.a);
            sb.append(", absenceId=");
            sb.append(this.b);
            sb.append(')');
            return sb.toString();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u001a\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\u0002J\u0006\u0010\n\u001a\u00020\u0002J\u0006\u0010\u000b\u001a\u00020\u0002J\u0006\u0010\f\u001a\u00020\u0002J\u0006\u0010\r\u001a\u00020\u0002¨\u0006\u0010" }, d2 = { "com/untis/mobile/dashboard/ui/a$b", "", "Landroidx/navigation/d0;", "d", "i", "", "studentId", "absenceId", "a", "c", "g", "h", "e", "f", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class b
    {
        private b() {
        }
        
        @e
        public final d0 a(final long n, final long n2) {
            return (d0)new a(n, n2);
        }
        
        @e
        public final d0 c() {
            return (d0)new androidx.navigation.a(2131296346);
        }
        
        @e
        public final d0 d() {
            return (d0)new androidx.navigation.a(2131296347);
        }
        
        @e
        public final d0 e() {
            return (d0)new androidx.navigation.a(2131296348);
        }
        
        @e
        public final d0 f() {
            return (d0)new androidx.navigation.a(2131296349);
        }
        
        @e
        public final d0 g() {
            return (d0)new androidx.navigation.a(2131296350);
        }
        
        @e
        public final d0 h() {
            return (d0)new androidx.navigation.a(2131296351);
        }
        
        @e
        public final d0 i() {
            return (d0)new androidx.navigation.a(2131296352);
        }
    }
}
