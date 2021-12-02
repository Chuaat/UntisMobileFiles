// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.classbook.duty;

import org.jetbrains.annotations.f;
import com.untis.mobile.api.enumeration.UMDutyType;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f" }, d2 = { "Lcom/untis/mobile/persistence/models/classbook/duty/DutyType;", "", "", "value", "I", "getValue", "()I", "<init>", "(Ljava/lang/String;II)V", "Companion", "STEWARD", "PREFECT", "PREFECT_SUBST", "CUSTOM", "NONE", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public enum DutyType
{
    CUSTOM(4);
    
    @e
    public static final Companion Companion;
    
    NONE(0), 
    PREFECT(2), 
    PREFECT_SUBST(3), 
    STEWARD(1);
    
    private final int value;
    
    private static final /* synthetic */ DutyType[] $values() {
        return new DutyType[] { DutyType.STEWARD, DutyType.PREFECT, DutyType.PREFECT_SUBST, DutyType.CUSTOM, DutyType.NONE };
    }
    
    static {
        $VALUES = $values();
        Companion = new Companion(null);
    }
    
    private DutyType(final int value) {
        this.value = value;
    }
    
    public final int getValue() {
        return this.value;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¨\u0006\u000b" }, d2 = { "Lcom/untis/mobile/persistence/models/classbook/duty/DutyType$Companion;", "", "", "value", "Lcom/untis/mobile/persistence/models/classbook/duty/DutyType;", "fromValue", "Lcom/untis/mobile/api/enumeration/UMDutyType;", "umDutyType", "fromUmDutyType", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class Companion
    {
        private Companion() {
        }
        
        @e
        public final DutyType fromUmDutyType(@f final UMDutyType umDutyType) {
            int n;
            if (umDutyType == null) {
                n = -1;
            }
            else {
                n = WhenMappings.$EnumSwitchMapping$0[umDutyType.ordinal()];
            }
            DutyType dutyType;
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        if (n != 4) {
                            dutyType = DutyType.NONE;
                        }
                        else {
                            dutyType = DutyType.CUSTOM;
                        }
                    }
                    else {
                        dutyType = DutyType.PREFECT_SUBST;
                    }
                }
                else {
                    dutyType = DutyType.PREFECT;
                }
            }
            else {
                dutyType = DutyType.STEWARD;
            }
            return dutyType;
        }
        
        @e
        public final DutyType fromValue(final int n) {
            while (true) {
                for (final DutyType dutyType : DutyType.values()) {
                    if (dutyType.getValue() == n) {
                        DutyType none = dutyType;
                        if (dutyType == null) {
                            none = DutyType.NONE;
                        }
                        return none;
                    }
                }
                DutyType dutyType = null;
                continue;
            }
        }
    }
}
