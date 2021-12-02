// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.persistence.model.reminder;

import org.jetbrains.annotations.f;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\t\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011" }, d2 = { "Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderType;", "", "", "id", "J", "getId", "()J", "setId", "(J)V", "<init>", "(Ljava/lang/String;IJ)V", "Companion", "DashboardUpcomingHomework", "DashboardUpcomingLocalHomework", "DashboardUpcomingExam", "DashboardContactHourRegistration", "Period", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public enum ReminderType
{
    @e
    public static final Companion Companion;
    
    DashboardContactHourRegistration(4L), 
    DashboardUpcomingExam(3L), 
    DashboardUpcomingHomework(1L), 
    DashboardUpcomingLocalHomework(2L), 
    Period(5L);
    
    private long id;
    
    private static final /* synthetic */ ReminderType[] $values() {
        return new ReminderType[] { ReminderType.DashboardUpcomingHomework, ReminderType.DashboardUpcomingLocalHomework, ReminderType.DashboardUpcomingExam, ReminderType.DashboardContactHourRegistration, ReminderType.Period };
    }
    
    static {
        $VALUES = $values();
        Companion = new Companion(null);
    }
    
    private ReminderType(final long id) {
        this.id = id;
    }
    
    public final long getId() {
        return this.id;
    }
    
    public final void setId(final long id) {
        this.id = id;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t" }, d2 = { "Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderType$Companion;", "", "", "id", "Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderType;", "findById", "(Ljava/lang/Long;)Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderType;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class Companion
    {
        private Companion() {
        }
        
        @f
        public final ReminderType findById(@f final Long n) {
            for (final ReminderType reminderType : ReminderType.values()) {
                final long id = reminderType.getId();
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
                    return reminderType;
                }
            }
            return null;
        }
    }
}
