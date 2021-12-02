// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.api;

import com.untis.mobile.messages.data.model.response.SendMessageResponse;
import com.untis.mobile.messages.data.model.request.SendMessageBody;
import p7.o;
import p7.a;
import com.untis.mobile.messages.data.model.request.MessageReplyRequestBody;
import com.untis.mobile.messages.data.model.Recipient;
import java.util.List;
import p7.t;
import p7.f;
import com.untis.mobile.messages.data.model.response.RecipientSectionsResponse;
import kotlin.coroutines.d;
import org.jetbrains.annotations.e;
import p7.s;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@\u00f8\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0007H§@\u00f8\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\f\u001a\u00020\u0002H§@\u00f8\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\b\u0001\u0010\u0011\u001a\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u0012H§@\u00f8\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018" }, d2 = { "Lcom/untis/mobile/messages/api/SendMessageApi;", "", "", "recipientOption", "Lcom/untis/mobile/messages/data/model/response/RecipientSectionsResponse;", "getRecipients", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/messages/data/model/request/SendMessageBody;", "sendMessageBody", "Lcom/untis/mobile/messages/data/model/response/SendMessageResponse;", "sendMessage", "(Lcom/untis/mobile/messages/data/model/request/SendMessageBody;Lkotlin/coroutines/d;)Ljava/lang/Object;", "query", "", "Lcom/untis/mobile/messages/data/model/Recipient;", "recipientsSearch", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "messageId", "Lcom/untis/mobile/messages/data/model/request/MessageReplyRequestBody;", "messageReplyRequestBody", "Lretrofit2/t;", "Ljava/lang/Void;", "replyMessage", "(Ljava/lang/String;Lcom/untis/mobile/messages/data/model/request/MessageReplyRequestBody;Lkotlin/coroutines/d;)Ljava/lang/Object;", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public interface SendMessageApi
{
    @f("view/v1/messages/recipients/{recipientOption}")
    @org.jetbrains.annotations.f
    Object getRecipients(@s("recipientOption") @e final String p0, @e final d<? super RecipientSectionsResponse> p1);
    
    @f("view/v1/messages/recipients/{recipientOption}/search")
    @org.jetbrains.annotations.f
    Object recipientsSearch(@s("recipientOption") @e final String p0, @t("searchText") @e final String p1, @e final d<? super List<Recipient>> p2);
    
    @o("view/v1/messages/{id}/reply")
    @org.jetbrains.annotations.f
    Object replyMessage(@s("id") @e final String p0, @a @e final MessageReplyRequestBody p1, @e final d<? super retrofit2.t<Void>> p2);
    
    @o("view/v1/messages")
    @org.jetbrains.annotations.f
    Object sendMessage(@a @e final SendMessageBody p0, @e final d<? super SendMessageResponse> p1);
    
    @Metadata(bv = { 1, 0, 3 }, d1 = {}, d2 = {}, k = 3, mv = { 1, 5, 1 })
    public static final class DefaultImpls
    {
    }
}
