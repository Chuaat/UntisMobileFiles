// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.officehour;

import kotlin.jvm.internal.k0;
import com.untis.mobile.api.enumeration.UMOfficeHourRegistrationTimeSlotState;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r" }, d2 = { "Lcom/untis/mobile/persistence/models/officehour/OfficeHourTimeSlotState;", "", "", "value", "I", "getValue", "()I", "<init>", "(Ljava/lang/String;II)V", "Companion", "FREE", "OTHER", "SELF", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public enum OfficeHourTimeSlotState
{
    @e
    public static final Companion Companion;
    
    FREE(0), 
    OTHER(1), 
    SELF(2);
    
    private final int value;
    
    private static final /* synthetic */ OfficeHourTimeSlotState[] $values() {
        return new OfficeHourTimeSlotState[] { OfficeHourTimeSlotState.FREE, OfficeHourTimeSlotState.OTHER, OfficeHourTimeSlotState.SELF };
    }
    
    static {
        $VALUES = $values();
        Companion = new Companion(null);
    }
    
    private OfficeHourTimeSlotState(final int value) {
        this.value = value;
    }
    
    public final int getValue() {
        return this.value;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u000b" }, d2 = { "Lcom/untis/mobile/persistence/models/officehour/OfficeHourTimeSlotState$Companion;", "", "Lcom/untis/mobile/api/enumeration/UMOfficeHourRegistrationTimeSlotState;", "umState", "Lcom/untis/mobile/persistence/models/officehour/OfficeHourTimeSlotState;", "fromUmOfficeHourTimeSlotState", "", "value", "fromValue", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class Companion
    {
        private Companion() {
        }
        
        @e
        public final OfficeHourTimeSlotState fromUmOfficeHourTimeSlotState(@e final UMOfficeHourRegistrationTimeSlotState umOfficeHourRegistrationTimeSlotState) {
            k0.p(umOfficeHourRegistrationTimeSlotState, "umState");
            final int n = WhenMappings.$EnumSwitchMapping$0[umOfficeHourRegistrationTimeSlotState.ordinal()];
            OfficeHourTimeSlotState officeHourTimeSlotState;
            if (n != 1) {
                if (n != 2) {
                    officeHourTimeSlotState = OfficeHourTimeSlotState.OTHER;
                }
                else {
                    officeHourTimeSlotState = OfficeHourTimeSlotState.SELF;
                }
            }
            else {
                officeHourTimeSlotState = OfficeHourTimeSlotState.FREE;
            }
            return officeHourTimeSlotState;
        }
        
        @e
        public final OfficeHourTimeSlotState fromValue(final int n) {
            while (true) {
                for (final OfficeHourTimeSlotState officeHourTimeSlotState : OfficeHourTimeSlotState.values()) {
                    if (n == officeHourTimeSlotState.getValue()) {
                        OfficeHourTimeSlotState other = officeHourTimeSlotState;
                        if (officeHourTimeSlotState == null) {
                            other = OfficeHourTimeSlotState.OTHER;
                        }
                        return other;
                    }
                }
                OfficeHourTimeSlotState officeHourTimeSlotState = null;
                continue;
            }
        }
    }
}
