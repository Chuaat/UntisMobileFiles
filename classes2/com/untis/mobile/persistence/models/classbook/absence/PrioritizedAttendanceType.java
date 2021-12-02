// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.classbook.absence;

import org.jetbrains.annotations.f;
import com.untis.mobile.api.enumeration.UMActivityType;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000b¨\u0006\f" }, d2 = { "Lcom/untis/mobile/persistence/models/classbook/absence/PrioritizedAttendanceType;", "", "", "value", "I", "getValue", "()I", "<init>", "(Ljava/lang/String;II)V", "Companion", "EXAM", "ACTIVITY", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public enum PrioritizedAttendanceType
{
    ACTIVITY(0);
    
    @e
    public static final Companion Companion;
    
    EXAM(1);
    
    private final int value;
    
    private static final /* synthetic */ PrioritizedAttendanceType[] $values() {
        return new PrioritizedAttendanceType[] { PrioritizedAttendanceType.EXAM, PrioritizedAttendanceType.ACTIVITY };
    }
    
    static {
        $VALUES = $values();
        Companion = new Companion(null);
    }
    
    private PrioritizedAttendanceType(final int value) {
        this.value = value;
    }
    
    public final int getValue() {
        return this.value;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¨\u0006\u000b" }, d2 = { "Lcom/untis/mobile/persistence/models/classbook/absence/PrioritizedAttendanceType$Companion;", "", "", "value", "Lcom/untis/mobile/persistence/models/classbook/absence/PrioritizedAttendanceType;", "fromValue", "Lcom/untis/mobile/api/enumeration/UMActivityType;", "umActivityType", "fromUMActivityType", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class Companion
    {
        private Companion() {
        }
        
        @e
        public final PrioritizedAttendanceType fromUMActivityType(@f final UMActivityType umActivityType) {
            int n;
            if (umActivityType == null) {
                n = -1;
            }
            else {
                n = WhenMappings.$EnumSwitchMapping$0[umActivityType.ordinal()];
            }
            PrioritizedAttendanceType prioritizedAttendanceType;
            if (n != 1) {
                prioritizedAttendanceType = PrioritizedAttendanceType.ACTIVITY;
            }
            else {
                prioritizedAttendanceType = PrioritizedAttendanceType.EXAM;
            }
            return prioritizedAttendanceType;
        }
        
        @e
        public final PrioritizedAttendanceType fromValue(final int n) {
            while (true) {
                for (final PrioritizedAttendanceType prioritizedAttendanceType : PrioritizedAttendanceType.values()) {
                    if (prioritizedAttendanceType.getValue() == n) {
                        PrioritizedAttendanceType activity = prioritizedAttendanceType;
                        if (prioritizedAttendanceType == null) {
                            activity = PrioritizedAttendanceType.ACTIVITY;
                        }
                        return activity;
                    }
                }
                PrioritizedAttendanceType prioritizedAttendanceType = null;
                continue;
            }
        }
    }
}
