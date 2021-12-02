// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.profile;

import org.jetbrains.annotations.f;
import com.untis.mobile.api.enumeration.DefaultAbsenceEndTime;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e" }, d2 = { "Lcom/untis/mobile/persistence/models/profile/AbsenceEndTime;", "", "", "value", "I", "getValue", "()I", "<init>", "(Ljava/lang/String;II)V", "Companion", "END_OF_PERIOD", "END_OF_DAY", "CUSTOM", "NONE", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public enum AbsenceEndTime
{
    CUSTOM(3);
    
    @e
    public static final Companion Companion;
    
    END_OF_DAY(2), 
    END_OF_PERIOD(1), 
    NONE(0);
    
    private final int value;
    
    private static final /* synthetic */ AbsenceEndTime[] $values() {
        return new AbsenceEndTime[] { AbsenceEndTime.END_OF_PERIOD, AbsenceEndTime.END_OF_DAY, AbsenceEndTime.CUSTOM, AbsenceEndTime.NONE };
    }
    
    static {
        $VALUES = $values();
        Companion = new Companion(null);
    }
    
    private AbsenceEndTime(final int value) {
        this.value = value;
    }
    
    public final int getValue() {
        return this.value;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¨\u0006\u000b" }, d2 = { "Lcom/untis/mobile/persistence/models/profile/AbsenceEndTime$Companion;", "", "", "value", "Lcom/untis/mobile/persistence/models/profile/AbsenceEndTime;", "fromValue", "Lcom/untis/mobile/api/enumeration/DefaultAbsenceEndTime;", "defaultAbsenceEndTime", "fromUmDefaultAbsenceEndTime", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class Companion
    {
        private Companion() {
        }
        
        @e
        public final AbsenceEndTime fromUmDefaultAbsenceEndTime(@f final DefaultAbsenceEndTime defaultAbsenceEndTime) {
            int n;
            if (defaultAbsenceEndTime == null) {
                n = -1;
            }
            else {
                n = WhenMappings.$EnumSwitchMapping$0[defaultAbsenceEndTime.ordinal()];
            }
            AbsenceEndTime absenceEndTime;
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        absenceEndTime = AbsenceEndTime.NONE;
                    }
                    else {
                        absenceEndTime = AbsenceEndTime.CUSTOM;
                    }
                }
                else {
                    absenceEndTime = AbsenceEndTime.END_OF_DAY;
                }
            }
            else {
                absenceEndTime = AbsenceEndTime.END_OF_PERIOD;
            }
            return absenceEndTime;
        }
        
        @e
        public final AbsenceEndTime fromValue(final int n) {
            while (true) {
                for (final AbsenceEndTime absenceEndTime : AbsenceEndTime.values()) {
                    if (absenceEndTime.getValue() == n) {
                        AbsenceEndTime none = absenceEndTime;
                        if (absenceEndTime == null) {
                            none = AbsenceEndTime.NONE;
                        }
                        return none;
                    }
                }
                AbsenceEndTime absenceEndTime = null;
                continue;
            }
        }
    }
}
