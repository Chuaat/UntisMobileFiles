// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.ui.inbox.viewmodel;

import kotlinx.coroutines.u0;
import kotlinx.coroutines.h;
import kotlinx.coroutines.k2;
import android.annotation.SuppressLint;
import androidx.lifecycle.x0;
import n6.p;
import kotlin.coroutines.d;
import kotlinx.coroutines.flow.l;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.n;
import kotlinx.coroutines.CoroutineExceptionHandler$b;
import kotlin.coroutines.g;
import com.untis.mobile.messages.data.repository.inbox.MessagesRepository;
import org.jetbrains.annotations.f;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.jetbrains.annotations.e;
import com.untis.mobile.messages.data.model.Message;
import java.util.List;
import java.util.Map;
import com.untis.mobile.messages.base.Result;
import androidx.lifecycle.k0;
import kotlinx.coroutines.z1;
import kotlin.Metadata;
import androidx.lifecycle.w0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b/\u00100J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR*\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\"\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR!\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00198\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u001f\u0010 R3\u0010%\u001a\"\u0012\u001e\u0012\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r0\"0\u001a0!8F@\u0006¢\u0006\u0006\u001a\u0004\b#\u0010$R*\u0010&\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0010\u001a\u0004\b'\u0010\u0012\"\u0004\b(\u0010\u0014R\u001f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00198\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010\u001d\u001a\u0004\b+\u0010 R\u001f\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0!8F@\u0006¢\u0006\u0006\u001a\u0004\b,\u0010$R6\u0010.\u001a\"\u0012\u001e\u0012\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r0\"0\u001a0\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\u001d¨\u00061" }, d2 = { "Lcom/untis/mobile/messages/ui/inbox/viewmodel/InboxViewModel;", "Landroidx/lifecycle/w0;", "Lkotlin/j2;", "observeLastReadConfirmedMessage", "observeMessageDeletion", "Lkotlinx/coroutines/k2;", "getAllIncomingMessages", "", "id", "deleteMessage", "Lcom/untis/mobile/messages/data/repository/inbox/MessagesRepository;", "messagesRepository", "Lcom/untis/mobile/messages/data/repository/inbox/MessagesRepository;", "", "Lcom/untis/mobile/messages/data/model/Message;", "readConfirmationMessages", "Ljava/util/List;", "getReadConfirmationMessages", "()Ljava/util/List;", "setReadConfirmationMessages", "(Ljava/util/List;)V", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "incomingMessagesErrorHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "deleteMessageErrorHandler", "Landroidx/lifecycle/k0;", "Lcom/untis/mobile/messages/base/Result;", "", "_deleteMessageLiveData", "Landroidx/lifecycle/k0;", "lastReadConfirmedMessage", "getLastReadConfirmedMessage", "()Landroidx/lifecycle/k0;", "Landroidx/lifecycle/LiveData;", "", "getAllIncomingMessagesLiveData", "()Landroidx/lifecycle/LiveData;", "allIncomingMessagesLiveData", "incomingMessages", "getIncomingMessages", "setIncomingMessages", "", "deletedMessagePosition", "getDeletedMessagePosition", "getDeleteMessageLiveData", "deleteMessageLiveData", "_allIncomingMessagesLiveData", "<init>", "(Lcom/untis/mobile/messages/data/repository/inbox/MessagesRepository;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
@z1
public final class InboxViewModel extends w0
{
    @e
    private final k0<Result<Map<String, List<Message>>>> _allIncomingMessagesLiveData;
    @e
    private final k0<Result<Boolean>> _deleteMessageLiveData;
    @e
    private final CoroutineExceptionHandler deleteMessageErrorHandler;
    @e
    private final k0<Integer> deletedMessagePosition;
    @f
    private List<Message> incomingMessages;
    @e
    private final CoroutineExceptionHandler incomingMessagesErrorHandler;
    @e
    private final k0<Message> lastReadConfirmedMessage;
    @e
    private final MessagesRepository messagesRepository;
    @f
    private List<Message> readConfirmationMessages;
    
    public InboxViewModel(@e final MessagesRepository messagesRepository) {
        kotlin.jvm.internal.k0.p(messagesRepository, "messagesRepository");
        this.messagesRepository = messagesRepository;
        this.deletedMessagePosition = (k0<Integer>)new k0();
        this.lastReadConfirmedMessage = (k0<Message>)new k0();
        this._allIncomingMessagesLiveData = (k0<Result<Map<String, List<Message>>>>)new k0();
        this._deleteMessageLiveData = (k0<Result<Boolean>>)new k0();
        final CoroutineExceptionHandler$b s = CoroutineExceptionHandler.s;
        this.incomingMessagesErrorHandler = (CoroutineExceptionHandler)new InboxViewModel$special$$inlined$CoroutineExceptionHandler.InboxViewModel$special$$inlined$CoroutineExceptionHandler$1((g.c)s, this);
        this.deleteMessageErrorHandler = (CoroutineExceptionHandler)new InboxViewModel$special$$inlined$CoroutineExceptionHandler.InboxViewModel$special$$inlined$CoroutineExceptionHandler$2((g.c)s, this);
        this.getAllIncomingMessages();
        this.observeLastReadConfirmedMessage();
        this.observeMessageDeletion();
    }
    
    @SuppressLint({ "NullSafeMutableLiveData" })
    private final void observeLastReadConfirmedMessage() {
        l.c1(l.e1(l.l0(n.a((LiveData)this.lastReadConfirmedMessage)), (p)new InboxViewModel$observeLastReadConfirmedMessage.InboxViewModel$observeLastReadConfirmedMessage$1(this, (d)null)), x0.a((w0)this));
    }
    
    private final void observeMessageDeletion() {
        l.c1(l.e1(l.l0(n.a((LiveData)this.deletedMessagePosition)), (p)new InboxViewModel$observeMessageDeletion.InboxViewModel$observeMessageDeletion$1(this, (d)null)), x0.a((w0)this));
    }
    
    @e
    public final k2 deleteMessage(@e final String s) {
        kotlin.jvm.internal.k0.p(s, "id");
        return h.f(x0.a((w0)this), (g)this.deleteMessageErrorHandler, (u0)null, (p)new InboxViewModel$deleteMessage.InboxViewModel$deleteMessage$1(this, s, (d)null), 2, (Object)null);
    }
    
    @e
    public final k2 getAllIncomingMessages() {
        return h.f(x0.a((w0)this), (g)this.incomingMessagesErrorHandler, (u0)null, (p)new InboxViewModel$getAllIncomingMessages.InboxViewModel$getAllIncomingMessages$1(this, (d)null), 2, (Object)null);
    }
    
    @e
    public final LiveData<Result<Map<String, List<Message>>>> getAllIncomingMessagesLiveData() {
        return (LiveData<Result<Map<String, List<Message>>>>)this._allIncomingMessagesLiveData;
    }
    
    @e
    public final LiveData<Result<Boolean>> getDeleteMessageLiveData() {
        return (LiveData<Result<Boolean>>)this._deleteMessageLiveData;
    }
    
    @e
    public final k0<Integer> getDeletedMessagePosition() {
        return this.deletedMessagePosition;
    }
    
    @f
    public final List<Message> getIncomingMessages() {
        return this.incomingMessages;
    }
    
    @e
    public final k0<Message> getLastReadConfirmedMessage() {
        return this.lastReadConfirmedMessage;
    }
    
    @f
    public final List<Message> getReadConfirmationMessages() {
        return this.readConfirmationMessages;
    }
    
    public final void setIncomingMessages(@f final List<Message> incomingMessages) {
        this.incomingMessages = incomingMessages;
    }
    
    public final void setReadConfirmationMessages(@f final List<Message> readConfirmationMessages) {
        this.readConfirmationMessages = readConfirmationMessages;
    }
}
