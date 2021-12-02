// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.persistence.model.common;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f" }, d2 = { "Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodStatus;", "", "", "key", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "TakingPlace", "Cancelled", "Substitution", "Maybe", "Moved", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public enum CalendarPeriodStatus
{
    Cancelled("CANCELLED");
    
    @e
    public static final Companion Companion;
    
    Maybe("MAYBE"), 
    Moved("MOVED"), 
    Substitution("SUBSTITUTION"), 
    TakingPlace("TAKING_PLACE");
    
    @e
    private final String key;
    
    private static final /* synthetic */ CalendarPeriodStatus[] $values() {
        return new CalendarPeriodStatus[] { CalendarPeriodStatus.TakingPlace, CalendarPeriodStatus.Cancelled, CalendarPeriodStatus.Substitution, CalendarPeriodStatus.Maybe, CalendarPeriodStatus.Moved };
    }
    
    static {
        $VALUES = $values();
        Companion = new Companion(null);
    }
    
    private CalendarPeriodStatus(final String key) {
        this.key = key;
    }
    
    @e
    public final String getKey() {
        return this.key;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\b" }, d2 = { "Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodStatus$Companion;", "", "", "key", "Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodStatus;", "findByKey", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class Companion
    {
        private Companion() {
        }
        
        @f
        public final CalendarPeriodStatus findByKey(@f final String s) {
            for (final CalendarPeriodStatus calendarPeriodStatus : CalendarPeriodStatus.values()) {
                if (k0.g(calendarPeriodStatus.getKey(), s)) {
                    return calendarPeriodStatus;
                }
            }
            return null;
        }
    }
}
