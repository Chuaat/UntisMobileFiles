// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.util;

import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n" }, d2 = { "Lcom/untis/mobile/messages/util/SendMessageTypes;", "", "", "name", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "STUDENTS", "PARENTS", "STAFF", "REPLY", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public enum SendMessageTypes
{
    PARENTS("PARENTS"), 
    REPLY("REPLY"), 
    STAFF("STAFF"), 
    STUDENTS("STUDENTS");
    
    private static final /* synthetic */ SendMessageTypes[] $values() {
        return new SendMessageTypes[] { SendMessageTypes.STUDENTS, SendMessageTypes.PARENTS, SendMessageTypes.STAFF, SendMessageTypes.REPLY };
    }
    
    static {
        $VALUES = $values();
    }
    
    private SendMessageTypes(final String s) {
    }
}
