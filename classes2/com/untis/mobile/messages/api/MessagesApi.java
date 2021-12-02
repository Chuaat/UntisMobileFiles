// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.api;

import com.untis.mobile.messages.data.model.response.UnreadMessagesCountResponse;
import com.untis.mobile.messages.data.model.response.SentMessagesResponse;
import com.untis.mobile.messages.data.model.ReadConfirmationStatus;
import java.util.ArrayList;
import com.untis.mobile.messages.data.model.response.MessagePermissionsResponse;
import com.untis.mobile.messages.data.model.Message;
import com.untis.mobile.messages.data.model.response.IncomingMessagesResponse;
import p7.b;
import org.jetbrains.annotations.f;
import p7.o;
import com.untis.mobile.messages.data.model.MessageRequestConfirmation;
import retrofit2.t;
import kotlin.coroutines.d;
import org.jetbrains.annotations.e;
import p7.s;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\u00020\u0002H§@\u00f8\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\u00020\u0005H§@\u00f8\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0004J\u001d\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0007H§@\u00f8\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\fH§@\u00f8\u0001\u0000¢\u0006\u0004\b\r\u0010\u0004J\u0013\u0010\u000f\u001a\u00020\u000eH§@\u00f8\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0004J\u001d\u0010\u0010\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0007H§@\u00f8\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000bJ-\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u00132\b\b\u0001\u0010\b\u001a\u00020\u0007H§@\u00f8\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u000bJ#\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\b\u0001\u0010\b\u001a\u00020\u0007H§@\u00f8\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u000bJ#\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00152\b\b\u0001\u0010\b\u001a\u00020\u0007H§@\u00f8\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u000bJ#\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00152\b\b\u0001\u0010\b\u001a\u00020\u0007H§@\u00f8\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b" }, d2 = { "Lcom/untis/mobile/messages/api/MessagesApi;", "", "Lcom/untis/mobile/messages/data/model/response/IncomingMessagesResponse;", "getAllMessages", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/messages/data/model/response/UnreadMessagesCountResponse;", "getUnreadMessagesCount", "", "id", "Lcom/untis/mobile/messages/data/model/Message;", "getMessageDetails", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/messages/data/model/response/MessagePermissionsResponse;", "getMessagePermissions", "Lcom/untis/mobile/messages/data/model/response/SentMessagesResponse;", "getSentMessages", "getSentMessageDetails", "Ljava/util/ArrayList;", "Lcom/untis/mobile/messages/data/model/ReadConfirmationStatus;", "Lkotlin/collections/ArrayList;", "getReadConfirmationStatus", "Lretrofit2/t;", "Lcom/untis/mobile/messages/data/model/MessageRequestConfirmation;", "confirmReadMessage", "Ljava/lang/Void;", "deleteMessage", "revokeMessage", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public interface MessagesApi
{
    @o("view/v1/messages/{id}/read-confirmation")
    @f
    Object confirmReadMessage(@s("id") @e final String p0, @e final d<? super t<MessageRequestConfirmation>> p1);
    
    @b("view/v1/messages/{id}")
    @f
    Object deleteMessage(@s("id") @e final String p0, @e final d<? super t<Void>> p1);
    
    @p7.f("view/v1/messages")
    @f
    Object getAllMessages(@e final d<? super IncomingMessagesResponse> p0);
    
    @p7.f("view/v1/messages/{id}")
    @f
    Object getMessageDetails(@s("id") @e final String p0, @e final d<? super Message> p1);
    
    @p7.f("view/v1/messages/permissions")
    @f
    Object getMessagePermissions(@e final d<? super MessagePermissionsResponse> p0);
    
    @p7.f("view/v1/messages/sent/{id}/request-confirmation-status")
    @f
    Object getReadConfirmationStatus(@s("id") @e final String p0, @e final d<? super ArrayList<ReadConfirmationStatus>> p1);
    
    @p7.f("view/v1/messages/sent/{id}")
    @f
    Object getSentMessageDetails(@s("id") @e final String p0, @e final d<? super Message> p1);
    
    @p7.f("view/v1/messages/sent")
    @f
    Object getSentMessages(@e final d<? super SentMessagesResponse> p0);
    
    @p7.f("view/v1/messages/status")
    @f
    Object getUnreadMessagesCount(@e final d<? super UnreadMessagesCountResponse> p0);
    
    @o("view/v1/messages/{id}/revoke")
    @f
    Object revokeMessage(@s("id") @e final String p0, @e final d<? super t<Void>> p1);
}
