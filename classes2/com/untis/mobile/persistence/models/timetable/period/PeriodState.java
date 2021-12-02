// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.timetable.period;

import org.jetbrains.annotations.f;
import com.untis.mobile.api.enumeration.UMPeriodState;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012" }, d2 = { "Lcom/untis/mobile/persistence/models/timetable/period/PeriodState;", "", "", "value", "I", "getValue", "()I", "<init>", "(Ljava/lang/String;II)V", "Companion", "REGULAR", "IRREGULAR", "CANCELLED", "EXAM", "BREAK_SUPERVISION", "OFFICE_HOUR", "OFFICE_HOUR_REGISTRATION", "NONE", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public enum PeriodState
{
    BREAK_SUPERVISION(5), 
    CANCELLED(3);
    
    @e
    public static final Companion Companion;
    
    EXAM(4), 
    IRREGULAR(2), 
    NONE(0), 
    OFFICE_HOUR(6), 
    OFFICE_HOUR_REGISTRATION(7), 
    REGULAR(1);
    
    private final int value;
    
    private static final /* synthetic */ PeriodState[] $values() {
        return new PeriodState[] { PeriodState.REGULAR, PeriodState.IRREGULAR, PeriodState.CANCELLED, PeriodState.EXAM, PeriodState.BREAK_SUPERVISION, PeriodState.OFFICE_HOUR, PeriodState.OFFICE_HOUR_REGISTRATION, PeriodState.NONE };
    }
    
    static {
        $VALUES = $values();
        Companion = new Companion(null);
    }
    
    private PeriodState(final int value) {
        this.value = value;
    }
    
    public final int getValue() {
        return this.value;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¨\u0006\u000b" }, d2 = { "Lcom/untis/mobile/persistence/models/timetable/period/PeriodState$Companion;", "", "", "value", "Lcom/untis/mobile/persistence/models/timetable/period/PeriodState;", "fromValue", "Lcom/untis/mobile/api/enumeration/UMPeriodState;", "umPeriodState", "fromUmPeriodState", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class Companion
    {
        private Companion() {
        }
        
        @e
        public final PeriodState fromUmPeriodState(@f final UMPeriodState umPeriodState) {
            int n;
            if (umPeriodState == null) {
                n = -1;
            }
            else {
                n = WhenMappings.$EnumSwitchMapping$0[umPeriodState.ordinal()];
            }
            PeriodState periodState = null;
            switch (n) {
                default: {
                    periodState = PeriodState.NONE;
                    break;
                }
                case 7: {
                    periodState = PeriodState.OFFICE_HOUR_REGISTRATION;
                    break;
                }
                case 6: {
                    periodState = PeriodState.OFFICE_HOUR;
                    break;
                }
                case 5: {
                    periodState = PeriodState.BREAK_SUPERVISION;
                    break;
                }
                case 4: {
                    periodState = PeriodState.EXAM;
                    break;
                }
                case 3: {
                    periodState = PeriodState.CANCELLED;
                    break;
                }
                case 2: {
                    periodState = PeriodState.IRREGULAR;
                    break;
                }
                case 1: {
                    periodState = PeriodState.REGULAR;
                    break;
                }
            }
            return periodState;
        }
        
        @e
        public final PeriodState fromValue(final int n) {
            while (true) {
                for (final PeriodState periodState : PeriodState.values()) {
                    if (periodState.getValue() == n) {
                        PeriodState none = periodState;
                        if (periodState == null) {
                            none = PeriodState.NONE;
                        }
                        return none;
                    }
                }
                PeriodState periodState = null;
                continue;
            }
        }
    }
}
