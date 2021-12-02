// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.ui.sent.viewmodel;

import kotlin.j2;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.h;
import kotlinx.coroutines.k2;
import androidx.lifecycle.x0;
import n6.p;
import kotlin.coroutines.d;
import kotlinx.coroutines.flow.l;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.n;
import kotlinx.coroutines.CoroutineExceptionHandler$b;
import kotlin.coroutines.g;
import com.untis.mobile.messages.data.repository.sent.SentMessagesRepository;
import org.jetbrains.annotations.f;
import kotlinx.coroutines.CoroutineExceptionHandler;
import com.untis.mobile.messages.data.model.Message;
import java.util.List;
import org.jetbrains.annotations.e;
import com.untis.mobile.messages.util.AlertDialogTypes;
import com.untis.mobile.messages.base.Result;
import androidx.lifecycle.k0;
import kotlinx.coroutines.z1;
import kotlin.Metadata;
import androidx.lifecycle.w0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b0\u00101J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J1\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00020\tR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R*\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR*\u0010\u001e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u001d0\u001c0\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\"\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001c0\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u001f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u001b8\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001f\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001c0)8F@\u0006¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0016\u0010-\u001a\u00020&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010(R'\u0010/\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u001d0\u001c0)8F@\u0006¢\u0006\u0006\u001a\u0004\b.\u0010+¨\u00062" }, d2 = { "Lcom/untis/mobile/messages/ui/sent/viewmodel/SentMessagesViewModel;", "Landroidx/lifecycle/w0;", "Lkotlin/j2;", "observeMessageDeletionFromDetails", "Lkotlinx/coroutines/k2;", "getSentMessages", "", "id", "deleteMessage", "Lkotlin/Function1;", "", "Lkotlin/t0;", "name", "value", "isSuccess", "revokeMessage", "Lcom/untis/mobile/messages/data/repository/sent/SentMessagesRepository;", "sentMessagesRepository", "Lcom/untis/mobile/messages/data/repository/sent/SentMessagesRepository;", "", "Lcom/untis/mobile/messages/data/model/Message;", "sentMessagesList", "Ljava/util/List;", "getSentMessagesList", "()Ljava/util/List;", "setSentMessagesList", "(Ljava/util/List;)V", "Landroidx/lifecycle/k0;", "Lcom/untis/mobile/messages/base/Result;", "", "_sentMessagesLiveData", "Landroidx/lifecycle/k0;", "Lcom/untis/mobile/messages/util/AlertDialogTypes;", "_deleteOrRevokeMessageLiveData", "", "deletedMessageFromDetailsPosition", "getDeletedMessageFromDetailsPosition", "()Landroidx/lifecycle/k0;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "errorHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Landroidx/lifecycle/LiveData;", "getDeleteOrRevokeMessageLiveData", "()Landroidx/lifecycle/LiveData;", "deleteOrRevokeMessageLiveData", "deleteOrRevokeMessageErrorHandler", "getSentMessagesLiveData", "sentMessagesLiveData", "<init>", "(Lcom/untis/mobile/messages/data/repository/sent/SentMessagesRepository;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
@z1
public final class SentMessagesViewModel extends w0
{
    @e
    private final k0<Result<AlertDialogTypes>> _deleteOrRevokeMessageLiveData;
    @e
    private final k0<Result<List<Message>>> _sentMessagesLiveData;
    @e
    private final CoroutineExceptionHandler deleteOrRevokeMessageErrorHandler;
    @e
    private final k0<Integer> deletedMessageFromDetailsPosition;
    @e
    private final CoroutineExceptionHandler errorHandler;
    @f
    private List<Message> sentMessagesList;
    @e
    private final SentMessagesRepository sentMessagesRepository;
    
    public SentMessagesViewModel(@e final SentMessagesRepository sentMessagesRepository) {
        kotlin.jvm.internal.k0.p(sentMessagesRepository, "sentMessagesRepository");
        this.sentMessagesRepository = sentMessagesRepository;
        this.deletedMessageFromDetailsPosition = (k0<Integer>)new k0();
        this._sentMessagesLiveData = (k0<Result<List<Message>>>)new k0();
        this._deleteOrRevokeMessageLiveData = (k0<Result<AlertDialogTypes>>)new k0();
        final CoroutineExceptionHandler$b s = CoroutineExceptionHandler.s;
        this.errorHandler = (CoroutineExceptionHandler)new SentMessagesViewModel$special$$inlined$CoroutineExceptionHandler.SentMessagesViewModel$special$$inlined$CoroutineExceptionHandler$1((g.c)s, this);
        this.deleteOrRevokeMessageErrorHandler = (CoroutineExceptionHandler)new SentMessagesViewModel$special$$inlined$CoroutineExceptionHandler.SentMessagesViewModel$special$$inlined$CoroutineExceptionHandler$2((g.c)s, this);
        this.getSentMessages();
        this.observeMessageDeletionFromDetails();
    }
    
    private final void observeMessageDeletionFromDetails() {
        l.c1(l.e1(l.l0(n.a((LiveData)this.deletedMessageFromDetailsPosition)), (p)new SentMessagesViewModel$observeMessageDeletionFromDetails.SentMessagesViewModel$observeMessageDeletionFromDetails$1(this, (d)null)), x0.a((w0)this));
    }
    
    @e
    public final k2 deleteMessage(@e final String s) {
        kotlin.jvm.internal.k0.p(s, "id");
        return h.f(x0.a((w0)this), (g)this.deleteOrRevokeMessageErrorHandler, (u0)null, (p)new SentMessagesViewModel$deleteMessage.SentMessagesViewModel$deleteMessage$1(this, s, (d)null), 2, (Object)null);
    }
    
    @e
    public final LiveData<Result<AlertDialogTypes>> getDeleteOrRevokeMessageLiveData() {
        return (LiveData<Result<AlertDialogTypes>>)this._deleteOrRevokeMessageLiveData;
    }
    
    @e
    public final k0<Integer> getDeletedMessageFromDetailsPosition() {
        return this.deletedMessageFromDetailsPosition;
    }
    
    @e
    public final k2 getSentMessages() {
        return h.f(x0.a((w0)this), (g)this.errorHandler, (u0)null, (p)new SentMessagesViewModel$getSentMessages.SentMessagesViewModel$getSentMessages$1(this, (d)null), 2, (Object)null);
    }
    
    @f
    public final List<Message> getSentMessagesList() {
        return this.sentMessagesList;
    }
    
    @e
    public final LiveData<Result<List<Message>>> getSentMessagesLiveData() {
        return (LiveData<Result<List<Message>>>)this._sentMessagesLiveData;
    }
    
    public final void revokeMessage(@e final String s, @e final n6.l<? super Boolean, j2> l) {
        kotlin.jvm.internal.k0.p(s, "id");
        kotlin.jvm.internal.k0.p(l, "isSuccess");
        h.f(x0.a((w0)this), (g)this.deleteOrRevokeMessageErrorHandler, (u0)null, (p)new SentMessagesViewModel$revokeMessage.SentMessagesViewModel$revokeMessage$1(this, s, (n6.l)l, (d)null), 2, (Object)null);
    }
    
    public final void setSentMessagesList(@f final List<Message> sentMessagesList) {
        this.sentMessagesList = sentMessagesList;
    }
}
