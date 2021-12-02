// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.data.repository.sent;

import java.util.List;
import com.untis.mobile.messages.data.model.Message;
import com.untis.mobile.messages.data.model.ReadConfirmationStatus;
import java.util.ArrayList;
import org.jetbrains.annotations.f;
import kotlin.coroutines.intrinsics.b;
import com.untis.mobile.messages.util.CoroutinesUtilKt;
import kotlin.coroutines.d;
import kotlin.j2;
import n6.l;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import com.untis.mobile.messages.data.source.base.SentMessagesDataSource;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ+\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\r\u0010\tJ>\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00062!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\u000eH\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J>\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00062!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00130\u000eH\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e" }, d2 = { "Lcom/untis/mobile/messages/data/repository/sent/SentMessagesRepositoryImp;", "Lcom/untis/mobile/messages/data/repository/sent/SentMessagesRepository;", "", "Lcom/untis/mobile/messages/data/model/Message;", "getSentMessages", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "id", "getSentMessageDetails", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Ljava/util/ArrayList;", "Lcom/untis/mobile/messages/data/model/ReadConfirmationStatus;", "Lkotlin/collections/ArrayList;", "getReadConfirmationStatus", "Lkotlin/Function1;", "", "Lkotlin/t0;", "name", "isMessageDeletedSuccessfully", "Lkotlin/j2;", "callback", "deleteMessage", "(Ljava/lang/String;Ln6/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "isMessageRevokedSuccessfully", "revokeMessage", "Lcom/untis/mobile/messages/data/source/base/SentMessagesDataSource;", "sentMessagesDataSource", "Lcom/untis/mobile/messages/data/source/base/SentMessagesDataSource;", "<init>", "(Lcom/untis/mobile/messages/data/source/base/SentMessagesDataSource;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class SentMessagesRepositoryImp implements SentMessagesRepository
{
    @e
    private final SentMessagesDataSource sentMessagesDataSource;
    
    public SentMessagesRepositoryImp(@e final SentMessagesDataSource sentMessagesDataSource) {
        k0.p(sentMessagesDataSource, "sentMessagesDataSource");
        this.sentMessagesDataSource = sentMessagesDataSource;
    }
    
    @f
    @Override
    public Object deleteMessage(@e final String s, @e final l<? super Boolean, j2> l, @e final d<? super j2> d) {
        final Object retryIO$default = CoroutinesUtilKt.retryIO$default(3, 0L, 0L, 0.0, (l)new SentMessagesRepositoryImp$deleteMessage.SentMessagesRepositoryImp$deleteMessage$2(this, s, (l)l, (d)null), d, 14, null);
        if (retryIO$default == b.h()) {
            return retryIO$default;
        }
        return j2.a;
    }
    
    @f
    @Override
    public Object getReadConfirmationStatus(@e final String s, @e final d<? super ArrayList<ReadConfirmationStatus>> d) {
        return CoroutinesUtilKt.retryIO$default(3, 0L, 0L, 0.0, (l)new SentMessagesRepositoryImp$getReadConfirmationStatus.SentMessagesRepositoryImp$getReadConfirmationStatus$2(this, s, (d)null), d, 14, null);
    }
    
    @f
    @Override
    public Object getSentMessageDetails(@e final String s, @e final d<? super Message> d) {
        return CoroutinesUtilKt.retryIO$default(3, 0L, 0L, 0.0, (l)new SentMessagesRepositoryImp$getSentMessageDetails.SentMessagesRepositoryImp$getSentMessageDetails$2(this, s, (d)null), d, 14, null);
    }
    
    @f
    @Override
    public Object getSentMessages(@e final d<? super List<Message>> d) {
        return CoroutinesUtilKt.retryIO$default(3, 0L, 0L, 0.0, (l)new SentMessagesRepositoryImp$getSentMessages.SentMessagesRepositoryImp$getSentMessages$2(this, (d)null), d, 14, null);
    }
    
    @f
    @Override
    public Object revokeMessage(@e final String s, @e final l<? super Boolean, j2> l, @e final d<? super j2> d) {
        final Object retryIO$default = CoroutinesUtilKt.retryIO$default(3, 0L, 0L, 0.0, (l)new SentMessagesRepositoryImp$revokeMessage.SentMessagesRepositoryImp$revokeMessage$2(this, s, (l)l, (d)null), d, 14, null);
        if (retryIO$default == b.h()) {
            return retryIO$default;
        }
        return j2.a;
    }
}
