// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.ui.option;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014" }, d2 = { "Lcom/untis/mobile/dashboard/ui/option/a;", "", "", "G", "I", "d", "()I", "id", "<init>", "(Ljava/lang/String;II)V", "H", "a", "SubstitutionPlanning", "SubstitutionRequests", "PersonalAbsences", "AddPersonalAbsence", "UpcomingEvents", "ClassLeads", "ContactHours", "ParentDays", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public enum a
{
    @e
    public static final a H;
    
    I(0), 
    J(1), 
    K(2), 
    L(3), 
    M(5), 
    N(6), 
    O(4), 
    P(7);
    
    private final int G;
    
    static {
        Q = b();
        H = new a(null);
    }
    
    private a(final int g) {
        this.G = g;
    }
    
    private static final /* synthetic */ a[] b() {
        return new a[] { a.I, a.J, a.K, a.L, a.M, a.N, a.O, a.P };
    }
    
    public final int d() {
        return this.G;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b" }, d2 = { "com/untis/mobile/dashboard/ui/option/a$a", "", "", "id", "Lcom/untis/mobile/dashboard/ui/option/a;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final com.untis.mobile.dashboard.ui.option.a a(final int n) {
            for (final com.untis.mobile.dashboard.ui.option.a a : com.untis.mobile.dashboard.ui.option.a.values()) {
                if (a.d() == n) {
                    return a;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
    }
}
