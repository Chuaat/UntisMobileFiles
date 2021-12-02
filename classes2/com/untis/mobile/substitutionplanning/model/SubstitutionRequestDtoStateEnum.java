// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.model;

import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n" }, d2 = { "Lcom/untis/mobile/substitutionplanning/model/SubstitutionRequestDtoStateEnum;", "", "<init>", "(Ljava/lang/String;I)V", "ACCEPTED", "ABORTED", "DECLINED", "PENDING", "EXPIRED", "TAKEN", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public enum SubstitutionRequestDtoStateEnum
{
    ABORTED, 
    ACCEPTED, 
    DECLINED, 
    EXPIRED, 
    PENDING, 
    TAKEN;
    
    private static final /* synthetic */ SubstitutionRequestDtoStateEnum[] $values() {
        return new SubstitutionRequestDtoStateEnum[] { SubstitutionRequestDtoStateEnum.ACCEPTED, SubstitutionRequestDtoStateEnum.ABORTED, SubstitutionRequestDtoStateEnum.DECLINED, SubstitutionRequestDtoStateEnum.PENDING, SubstitutionRequestDtoStateEnum.EXPIRED, SubstitutionRequestDtoStateEnum.TAKEN };
    }
    
    static {
        $VALUES = $values();
    }
}
