// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.persistence.model.common;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r" }, d2 = { "Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodRoomStatus;", "", "", "key", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "Regular", "Substitution", "Removed", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public enum CalendarPeriodRoomStatus
{
    @e
    public static final Companion Companion;
    
    Regular("REGULAR"), 
    Removed("REMOVED"), 
    Substitution("SUBSTITUTION");
    
    @e
    private final String key;
    
    private static final /* synthetic */ CalendarPeriodRoomStatus[] $values() {
        return new CalendarPeriodRoomStatus[] { CalendarPeriodRoomStatus.Regular, CalendarPeriodRoomStatus.Substitution, CalendarPeriodRoomStatus.Removed };
    }
    
    static {
        $VALUES = $values();
        Companion = new Companion(null);
    }
    
    private CalendarPeriodRoomStatus(final String key) {
        this.key = key;
    }
    
    @e
    public final String getKey() {
        return this.key;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\b" }, d2 = { "Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodRoomStatus$Companion;", "", "", "key", "Lcom/untis/mobile/calendar/persistence/model/common/CalendarPeriodRoomStatus;", "findByKey", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class Companion
    {
        private Companion() {
        }
        
        @f
        public final CalendarPeriodRoomStatus findByKey(@f final String s) {
            for (final CalendarPeriodRoomStatus calendarPeriodRoomStatus : CalendarPeriodRoomStatus.values()) {
                if (k0.g(calendarPeriodRoomStatus.getKey(), s)) {
                    return calendarPeriodRoomStatus;
                }
            }
            return null;
        }
    }
}
