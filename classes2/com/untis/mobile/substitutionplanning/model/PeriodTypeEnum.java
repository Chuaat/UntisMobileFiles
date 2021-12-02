// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.model;

import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f" }, d2 = { "Lcom/untis/mobile/substitutionplanning/model/PeriodTypeEnum;", "", "<init>", "(Ljava/lang/String;I)V", "NORMAL_TEACHING_PERIOD", "ADDITIONAL_PERIOD", "EVENT", "MEETING", "STAND_BY_PERIOD", "OFFICE_HOUR", "EXAM", "BREAK_SUPERVISION", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public enum PeriodTypeEnum
{
    ADDITIONAL_PERIOD, 
    BREAK_SUPERVISION, 
    EVENT, 
    EXAM, 
    MEETING, 
    NORMAL_TEACHING_PERIOD, 
    OFFICE_HOUR, 
    STAND_BY_PERIOD;
    
    private static final /* synthetic */ PeriodTypeEnum[] $values() {
        return new PeriodTypeEnum[] { PeriodTypeEnum.NORMAL_TEACHING_PERIOD, PeriodTypeEnum.ADDITIONAL_PERIOD, PeriodTypeEnum.EVENT, PeriodTypeEnum.MEETING, PeriodTypeEnum.STAND_BY_PERIOD, PeriodTypeEnum.OFFICE_HOUR, PeriodTypeEnum.EXAM, PeriodTypeEnum.BREAK_SUPERVISION };
    }
    
    static {
        $VALUES = $values();
    }
}
