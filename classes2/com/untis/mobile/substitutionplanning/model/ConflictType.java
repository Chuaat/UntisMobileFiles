// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.model;

import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b" }, d2 = { "Lcom/untis/mobile/substitutionplanning/model/ConflictType;", "", "<init>", "(Ljava/lang/String;I)V", "NO_CONFLICT", "OPEN_CONFLICT", "TEACHER_SUPERVISION", "ROOM_SHARING", "SUBSTITUTION", "NO_SUBSTITUTION", "ASK_TEACHER", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public enum ConflictType
{
    ASK_TEACHER, 
    NO_CONFLICT, 
    NO_SUBSTITUTION, 
    OPEN_CONFLICT, 
    ROOM_SHARING, 
    SUBSTITUTION, 
    TEACHER_SUPERVISION;
    
    private static final /* synthetic */ ConflictType[] $values() {
        return new ConflictType[] { ConflictType.NO_CONFLICT, ConflictType.OPEN_CONFLICT, ConflictType.TEACHER_SUPERVISION, ConflictType.ROOM_SHARING, ConflictType.SUBSTITUTION, ConflictType.NO_SUBSTITUTION, ConflictType.ASK_TEACHER };
    }
    
    static {
        $VALUES = $values();
    }
}
