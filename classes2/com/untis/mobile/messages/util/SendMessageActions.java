// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.util;

import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b" }, d2 = { "Lcom/untis/mobile/messages/util/SendMessageActions;", "", "", "name", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "REPLY_MESSAGE", "SEND_MESSAGE", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public enum SendMessageActions
{
    REPLY_MESSAGE("REPLY_MESSAGE"), 
    SEND_MESSAGE("SEND_MESSAGE");
    
    private static final /* synthetic */ SendMessageActions[] $values() {
        return new SendMessageActions[] { SendMessageActions.REPLY_MESSAGE, SendMessageActions.SEND_MESSAGE };
    }
    
    static {
        $VALUES = $values();
    }
    
    private SendMessageActions(final String s) {
    }
}
