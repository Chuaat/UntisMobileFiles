// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.persistence.model.reminder;

import org.jetbrains.annotations.f;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\t\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f" }, d2 = { "Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderSubtype;", "", "", "id", "J", "getId", "()J", "<init>", "(Ljava/lang/String;IJ)V", "Companion", "Custom", "OneDay", "ThreeDays", "OneWeek", "TwoWeeks", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public enum ReminderSubtype
{
    @e
    public static final Companion Companion;
    
    Custom(1L), 
    OneDay(2L), 
    OneWeek(4L), 
    ThreeDays(3L), 
    TwoWeeks(5L);
    
    private final long id;
    
    private static final /* synthetic */ ReminderSubtype[] $values() {
        return new ReminderSubtype[] { ReminderSubtype.Custom, ReminderSubtype.OneDay, ReminderSubtype.ThreeDays, ReminderSubtype.OneWeek, ReminderSubtype.TwoWeeks };
    }
    
    static {
        $VALUES = $values();
        Companion = new Companion(null);
    }
    
    private ReminderSubtype(final long id) {
        this.id = id;
    }
    
    public final long getId() {
        return this.id;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t" }, d2 = { "Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderSubtype$Companion;", "", "", "id", "Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderSubtype;", "findById", "(Ljava/lang/Long;)Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderSubtype;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class Companion
    {
        private Companion() {
        }
        
        @f
        public final ReminderSubtype findById(@f final Long n) {
            for (final ReminderSubtype reminderSubtype : ReminderSubtype.values()) {
                final long id = reminderSubtype.getId();
                boolean b = false;
                Label_0055: {
                    if (n != null) {
                        if (id == n) {
                            b = true;
                            break Label_0055;
                        }
                    }
                    b = false;
                }
                if (b) {
                    return reminderSubtype;
                }
            }
            return null;
        }
    }
}
