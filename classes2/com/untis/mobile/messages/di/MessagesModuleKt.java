// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.di;

import kotlinx.coroutines.z1;
import kotlinx.coroutines.a2;
import n6.l;
import org.koin.dsl.c;
import org.jetbrains.annotations.e;
import org.koin.core.module.a;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0007\"\"\u0010\u0001\u001a\u00020\u00008\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0001\u0010\u0002\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0007" }, d2 = { "Lorg/koin/core/module/a;", "messagesModule", "Lorg/koin/core/module/a;", "getMessagesModule", "()Lorg/koin/core/module/a;", "getMessagesModule$annotations", "()V", "untismobile_5.1.0_release" }, k = 2, mv = { 1, 5, 1 })
public final class MessagesModuleKt
{
    @e
    private static final a messagesModule;
    
    static {
        messagesModule = c.b(false, false, (l)MessagesModuleKt$messagesModule.MessagesModuleKt$messagesModule$1.INSTANCE, 3, (Object)null);
    }
    
    @e
    public static final a getMessagesModule() {
        return MessagesModuleKt.messagesModule;
    }
}
