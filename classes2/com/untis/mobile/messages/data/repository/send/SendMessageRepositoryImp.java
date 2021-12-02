// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.data.repository.send;

import com.untis.mobile.messages.data.model.response.SendMessageResponse;
import com.untis.mobile.messages.data.model.request.SendMessageBody;
import kotlin.coroutines.intrinsics.b;
import kotlin.j2;
import com.untis.mobile.messages.data.model.request.MessageReplyRequestBody;
import com.untis.mobile.messages.data.model.Recipient;
import org.jetbrains.annotations.f;
import n6.l;
import com.untis.mobile.messages.util.CoroutinesUtilKt;
import com.untis.mobile.messages.data.model.Group;
import java.util.List;
import com.untis.mobile.messages.util.RecipientSectionTypes;
import java.util.Map;
import kotlin.coroutines.d;
import com.untis.mobile.messages.util.SendMessageTypes;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import com.untis.mobile.messages.data.source.base.SendMessageDataSource;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b#\u0010$J/\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013JF\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00152!\u0010\u001d\u001a\u001d\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u001c0\u0017H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%" }, d2 = { "Lcom/untis/mobile/messages/data/repository/send/SendMessageRepositoryImp;", "Lcom/untis/mobile/messages/data/repository/send/SendMessageRepository;", "Lcom/untis/mobile/messages/util/SendMessageTypes;", "type", "", "Lcom/untis/mobile/messages/util/RecipientSectionTypes;", "", "Lcom/untis/mobile/messages/data/model/Group;", "getRecipientGroups", "(Lcom/untis/mobile/messages/util/SendMessageTypes;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/messages/data/model/request/SendMessageBody;", "sendMessageBody", "Lcom/untis/mobile/messages/data/model/response/SendMessageResponse;", "sendMessage", "(Lcom/untis/mobile/messages/data/model/request/SendMessageBody;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "query", "Lcom/untis/mobile/messages/data/model/Recipient;", "recipientsSearch", "(Lcom/untis/mobile/messages/util/SendMessageTypes;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "messageId", "Lcom/untis/mobile/messages/data/model/request/MessageReplyRequestBody;", "messageReplyRequestBody", "Lkotlin/Function1;", "", "Lkotlin/t0;", "name", "success", "Lkotlin/j2;", "callback", "replyMessage", "(Ljava/lang/String;Lcom/untis/mobile/messages/data/model/request/MessageReplyRequestBody;Ln6/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/messages/data/source/base/SendMessageDataSource;", "sendMessageDataSource", "Lcom/untis/mobile/messages/data/source/base/SendMessageDataSource;", "<init>", "(Lcom/untis/mobile/messages/data/source/base/SendMessageDataSource;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class SendMessageRepositoryImp implements SendMessageRepository
{
    @e
    private final SendMessageDataSource sendMessageDataSource;
    
    public SendMessageRepositoryImp(@e final SendMessageDataSource sendMessageDataSource) {
        k0.p(sendMessageDataSource, "sendMessageDataSource");
        this.sendMessageDataSource = sendMessageDataSource;
    }
    
    @f
    @Override
    public Object getRecipientGroups(@e final SendMessageTypes sendMessageTypes, @e final d<? super Map<RecipientSectionTypes, ? extends List<Group>>> d) {
        return CoroutinesUtilKt.retryIO$default(3, 0L, 0L, 0.0, (l)new SendMessageRepositoryImp$getRecipientGroups.SendMessageRepositoryImp$getRecipientGroups$2(this, sendMessageTypes, (d)null), d, 14, null);
    }
    
    @f
    @Override
    public Object recipientsSearch(@e final SendMessageTypes sendMessageTypes, @e final String s, @e final d<? super List<Recipient>> d) {
        return CoroutinesUtilKt.retryIO$default(3, 0L, 0L, 0.0, (l)new SendMessageRepositoryImp$recipientsSearch.SendMessageRepositoryImp$recipientsSearch$2(this, sendMessageTypes, s, (d)null), d, 14, null);
    }
    
    @f
    @Override
    public Object replyMessage(@e final String s, @e final MessageReplyRequestBody messageReplyRequestBody, @e final l<? super Boolean, j2> l, @e final d<? super j2> d) {
        final Object retryIO$default = CoroutinesUtilKt.retryIO$default(3, 0L, 0L, 0.0, (l)new SendMessageRepositoryImp$replyMessage.SendMessageRepositoryImp$replyMessage$2(this, s, messageReplyRequestBody, (l)l, (d)null), d, 14, null);
        if (retryIO$default == b.h()) {
            return retryIO$default;
        }
        return j2.a;
    }
    
    @f
    @Override
    public Object sendMessage(@e final SendMessageBody sendMessageBody, @e final d<? super SendMessageResponse> d) {
        return CoroutinesUtilKt.retryIO$default(3, 0L, 0L, 0.0, (l)new SendMessageRepositoryImp$sendMessage.SendMessageRepositoryImp$sendMessage$2(this, sendMessageBody, (d)null), d, 14, null);
    }
}
