// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.data.repository.main;

import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import com.untis.mobile.messages.data.model.response.MessagePermissionsResponse;
import kotlin.coroutines.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\u00020\u0002H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005" }, d2 = { "Lcom/untis/mobile/messages/data/repository/main/MessagesMainRepository;", "", "Lcom/untis/mobile/messages/data/model/response/MessagePermissionsResponse;", "getMessagesPermissions", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public interface MessagesMainRepository
{
    @f
    Object getMessagesPermissions(@e final d<? super MessagePermissionsResponse> p0);
}
