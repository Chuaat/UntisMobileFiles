// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.data.source.base;

import com.untis.mobile.messages.data.model.response.SendMessageResponse;
import com.untis.mobile.messages.data.model.request.SendMessageBody;
import kotlin.j2;
import n6.l;
import com.untis.mobile.messages.data.model.request.MessageReplyRequestBody;
import com.untis.mobile.messages.data.model.Recipient;
import org.jetbrains.annotations.f;
import com.untis.mobile.messages.data.model.Group;
import java.util.List;
import com.untis.mobile.messages.util.RecipientSectionTypes;
import java.util.Map;
import kotlin.coroutines.d;
import org.jetbrains.annotations.e;
import com.untis.mobile.messages.util.SendMessageTypes;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH¦@\u00f8\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013JF\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00152!\u0010\u001d\u001a\u001d\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u001c0\u0017H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 " }, d2 = { "Lcom/untis/mobile/messages/data/source/base/SendMessageDataSource;", "", "Lcom/untis/mobile/messages/util/SendMessageTypes;", "type", "", "Lcom/untis/mobile/messages/util/RecipientSectionTypes;", "", "Lcom/untis/mobile/messages/data/model/Group;", "getRecipientGroups", "(Lcom/untis/mobile/messages/util/SendMessageTypes;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/messages/data/model/request/SendMessageBody;", "sendMessageBody", "Lcom/untis/mobile/messages/data/model/response/SendMessageResponse;", "sendMessage", "(Lcom/untis/mobile/messages/data/model/request/SendMessageBody;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "query", "Lcom/untis/mobile/messages/data/model/Recipient;", "recipientsSearch", "(Lcom/untis/mobile/messages/util/SendMessageTypes;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "messageId", "Lcom/untis/mobile/messages/data/model/request/MessageReplyRequestBody;", "messageReplyRequestBody", "Lkotlin/Function1;", "", "Lkotlin/t0;", "name", "success", "Lkotlin/j2;", "callback", "replyMessage", "(Ljava/lang/String;Lcom/untis/mobile/messages/data/model/request/MessageReplyRequestBody;Ln6/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public interface SendMessageDataSource
{
    @f
    Object getRecipientGroups(@e final SendMessageTypes p0, @e final d<? super Map<RecipientSectionTypes, ? extends List<Group>>> p1);
    
    @f
    Object recipientsSearch(@e final SendMessageTypes p0, @e final String p1, @e final d<? super List<Recipient>> p2);
    
    @f
    Object replyMessage(@e final String p0, @e final MessageReplyRequestBody p1, @e final l<? super Boolean, j2> p2, @e final d<? super j2> p3);
    
    @f
    Object sendMessage(@e final SendMessageBody p0, @e final d<? super SendMessageResponse> p1);
}
