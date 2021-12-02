// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.data.repository.inbox;

import java.util.List;
import java.util.Map;
import com.untis.mobile.messages.data.model.Message;
import kotlin.coroutines.g;
import kotlinx.coroutines.h;
import kotlinx.coroutines.i1;
import n6.q;
import java.io.OutputStream;
import org.jetbrains.annotations.f;
import kotlin.coroutines.intrinsics.b;
import n6.l;
import com.untis.mobile.messages.util.CoroutinesUtilKt;
import kotlin.coroutines.d;
import kotlin.j2;
import com.untis.mobile.messages.data.model.MessageRequestConfirmation;
import n6.p;
import kotlin.jvm.internal.k0;
import com.untis.mobile.messages.data.source.base.MessagesDataSource;
import org.jetbrains.annotations.e;
import com.untis.mobile.utils.a;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b0\u00101J%\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\bH\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\t\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0003H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJp\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00032K\u0010\u0019\u001aG\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00180\u0010H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJU\u0010!\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u000328\u0010 \u001a4\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u001d\u0012\u0015\u0012\u0013\u0018\u00010\u001e¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00180\u001cH\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b!\u0010\"J>\u0010%\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u00032!\u0010 \u001a\u001d\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00180#H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/\u0082\u0002\u0004\n\u0002\b\u0019¨\u00062" }, d2 = { "Lcom/untis/mobile/messages/data/repository/inbox/MessagesRepositoryImp;", "Lcom/untis/mobile/messages/data/repository/inbox/MessagesRepository;", "", "", "", "Lcom/untis/mobile/messages/data/model/Message;", "getMessages", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "getUnreadMessagesCount", "id", "getMessageDetails", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Ljava/io/OutputStream;", "attachmentFileOutputStream", "messageId", "Lkotlin/Function3;", "", "Lkotlin/t0;", "name", "bytesRead", "contentLength", "", "isDone", "Lkotlin/j2;", "downloadProgress", "downloadMessageBlobAttachment", "(Ljava/io/OutputStream;Ljava/lang/String;Ln6/q;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Function2;", "isReadConfirmedSuccessfully", "Lcom/untis/mobile/messages/data/model/MessageRequestConfirmation;", "confirmationResponse", "callback", "confirmReadMessage", "(Ljava/lang/String;Ln6/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Function1;", "isMessageDeletedSuccessfully", "deleteMessage", "(Ljava/lang/String;Ln6/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/services/profile/legacy/a;", "profileService", "Lcom/untis/mobile/services/profile/legacy/a;", "Lcom/untis/mobile/utils/a;", "appSettings", "Lcom/untis/mobile/utils/a;", "Lcom/untis/mobile/messages/data/source/base/MessagesDataSource;", "messagesRemoteDataSource", "Lcom/untis/mobile/messages/data/source/base/MessagesDataSource;", "<init>", "(Lcom/untis/mobile/messages/data/source/base/MessagesDataSource;Lcom/untis/mobile/services/profile/legacy/a;Lcom/untis/mobile/utils/a;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class MessagesRepositoryImp implements MessagesRepository
{
    @e
    private final a appSettings;
    @e
    private final MessagesDataSource messagesRemoteDataSource;
    @e
    private final com.untis.mobile.services.profile.legacy.a profileService;
    
    public MessagesRepositoryImp(@e final MessagesDataSource messagesRemoteDataSource, @e final com.untis.mobile.services.profile.legacy.a profileService, @e final a appSettings) {
        k0.p(messagesRemoteDataSource, "messagesRemoteDataSource");
        k0.p(profileService, "profileService");
        k0.p(appSettings, "appSettings");
        this.messagesRemoteDataSource = messagesRemoteDataSource;
        this.profileService = profileService;
        this.appSettings = appSettings;
    }
    
    @f
    @Override
    public Object confirmReadMessage(@e final String s, @e final p<? super Boolean, ? super MessageRequestConfirmation, j2> p3, @e final d<? super j2> d) {
        final Object retryIO$default = CoroutinesUtilKt.retryIO$default(3, 0L, 0L, 0.0, (l)new MessagesRepositoryImp$confirmReadMessage.MessagesRepositoryImp$confirmReadMessage$2(this, s, (p)p3, (d)null), d, 14, null);
        if (retryIO$default == b.h()) {
            return retryIO$default;
        }
        return j2.a;
    }
    
    @f
    @Override
    public Object deleteMessage(@e final String s, @e final l<? super Boolean, j2> l, @e final d<? super j2> d) {
        final Object retryIO$default = CoroutinesUtilKt.retryIO$default(3, 0L, 0L, 0.0, (l)new MessagesRepositoryImp$deleteMessage.MessagesRepositoryImp$deleteMessage$2(this, s, (l)l, (d)null), d, 14, null);
        if (retryIO$default == b.h()) {
            return retryIO$default;
        }
        return j2.a;
    }
    
    @f
    @Override
    public Object downloadMessageBlobAttachment(@e final OutputStream outputStream, @e final String s, @e final q<? super Long, ? super Long, ? super Boolean, j2> q, @e final d<? super j2> d) {
        final Object i = h.i((g)i1.c(), (p)new MessagesRepositoryImp$downloadMessageBlobAttachment.MessagesRepositoryImp$downloadMessageBlobAttachment$2(this, s, outputStream, (q)q, (d)null), (d)d);
        if (i == b.h()) {
            return i;
        }
        return j2.a;
    }
    
    @f
    @Override
    public Object getMessageDetails(@e final String s, @e final d<? super Message> d) {
        return CoroutinesUtilKt.retryIO$default(3, 0L, 0L, 0.0, (l)new MessagesRepositoryImp$getMessageDetails.MessagesRepositoryImp$getMessageDetails$2(this, s, (d)null), d, 14, null);
    }
    
    @f
    @Override
    public Object getMessages(@e final d<? super Map<String, ? extends List<Message>>> d) {
        return CoroutinesUtilKt.retryIO$default(0, 0L, 0L, 0.0, (l)new MessagesRepositoryImp$getMessages.MessagesRepositoryImp$getMessages$2(this, (d)null), d, 15, null);
    }
    
    @f
    @Override
    public Object getUnreadMessagesCount(@e final d<? super Integer> d) {
        return CoroutinesUtilKt.retryIO$default(0, 0L, 0L, 0.0, (l)new MessagesRepositoryImp$getUnreadMessagesCount.MessagesRepositoryImp$getUnreadMessagesCount$2(this, (d)null), d, 15, null);
    }
}
