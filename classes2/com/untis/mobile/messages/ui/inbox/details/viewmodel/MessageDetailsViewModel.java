// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.ui.inbox.details.viewmodel;

import java.io.OutputStream;
import kotlinx.coroutines.flow.l;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.n;
import n6.p;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.h;
import kotlin.coroutines.d;
import androidx.lifecycle.x0;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.CoroutineExceptionHandler$b;
import kotlin.coroutines.g;
import com.untis.mobile.messages.data.repository.inbox.MessagesRepository;
import com.untis.mobile.utils.a;
import kotlinx.coroutines.CoroutineExceptionHandler;
import com.untis.mobile.messages.data.model.Message;
import com.untis.mobile.messages.base.Result;
import org.jetbrains.annotations.e;
import androidx.lifecycle.k0;
import kotlinx.coroutines.z1;
import kotlin.Metadata;
import androidx.lifecycle.w0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b4\u00105J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0006\u0010\t\u001a\u00020\bJ\u0016\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0002J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0002R\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0016R\u0019\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8F@\u0006¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u001f\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0\u001c8F@\u0006¢\u0006\u0006\u001a\u0004\b#\u0010\u001fR\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0013R\u001f\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0!0\u001c8F@\u0006¢\u0006\u0006\u001a\u0004\b'\u0010\u001fR\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\"\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0!0\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0013R\u0019\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00110\u001c8F@\u0006¢\u0006\u0006\u001a\u0004\b-\u0010\u001fR\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010\u0016R\"\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010\u0013¨\u00066" }, d2 = { "Lcom/untis/mobile/messages/ui/inbox/details/viewmodel/MessageDetailsViewModel;", "Landroidx/lifecycle/w0;", "", "messageId", "Lkotlinx/coroutines/k2;", "getMessageDetails", "Lkotlin/j2;", "observeMessageIdLiveData", "", "currentUserId", "Ljava/io/OutputStream;", "attachmentFileOutputStream", "downloadMessageBlobAttachment", "id", "confirmReadMessage", "deleteMessage", "Landroidx/lifecycle/k0;", "Lcom/untis/mobile/messages/ui/inbox/details/viewmodel/ConfirmReadMessageState;", "_confirmReadMessageStateLiveData", "Landroidx/lifecycle/k0;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "apiErrorHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "confirmReadMessageErrorHandler", "messageIdLiveData", "getMessageIdLiveData", "()Landroidx/lifecycle/k0;", "deleteMessageErrorHandler", "Landroidx/lifecycle/LiveData;", "Lcom/untis/mobile/messages/ui/inbox/details/viewmodel/DownloadAttachmentState;", "getDownloadAttachmentStateLiveData", "()Landroidx/lifecycle/LiveData;", "downloadAttachmentStateLiveData", "Lcom/untis/mobile/messages/base/Result;", "", "getDeleteMessageLiveData", "deleteMessageLiveData", "_downloadAttachmentStateLiveData", "Lcom/untis/mobile/messages/data/model/Message;", "getMessageDetailsLiveData", "messageDetailsLiveData", "Lcom/untis/mobile/utils/a;", "appSettings", "Lcom/untis/mobile/utils/a;", "_messageDetailsLiveData", "getConfirmReadMessageStateLiveData", "confirmReadMessageStateLiveData", "Lcom/untis/mobile/messages/data/repository/inbox/MessagesRepository;", "messagesRepository", "Lcom/untis/mobile/messages/data/repository/inbox/MessagesRepository;", "downloadErrorHandler", "_deleteMessageLiveData", "<init>", "(Lcom/untis/mobile/messages/data/repository/inbox/MessagesRepository;Lcom/untis/mobile/utils/a;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
@z1
public final class MessageDetailsViewModel extends w0
{
    @e
    private final k0<ConfirmReadMessageState> _confirmReadMessageStateLiveData;
    @e
    private final k0<Result<Boolean>> _deleteMessageLiveData;
    @e
    private final k0<DownloadAttachmentState> _downloadAttachmentStateLiveData;
    @e
    private final k0<Result<Message>> _messageDetailsLiveData;
    @e
    private final CoroutineExceptionHandler apiErrorHandler;
    @e
    private final a appSettings;
    @e
    private final CoroutineExceptionHandler confirmReadMessageErrorHandler;
    @e
    private final CoroutineExceptionHandler deleteMessageErrorHandler;
    @e
    private final CoroutineExceptionHandler downloadErrorHandler;
    @e
    private final k0<String> messageIdLiveData;
    @e
    private final MessagesRepository messagesRepository;
    
    public MessageDetailsViewModel(@e final MessagesRepository messagesRepository, @e final a appSettings) {
        kotlin.jvm.internal.k0.p(messagesRepository, "messagesRepository");
        kotlin.jvm.internal.k0.p(appSettings, "appSettings");
        this.messagesRepository = messagesRepository;
        this.appSettings = appSettings;
        this.messageIdLiveData = (k0<String>)new k0();
        this.observeMessageIdLiveData();
        this._messageDetailsLiveData = (k0<Result<Message>>)new k0();
        this._downloadAttachmentStateLiveData = (k0<DownloadAttachmentState>)new k0();
        this._confirmReadMessageStateLiveData = (k0<ConfirmReadMessageState>)new k0();
        this._deleteMessageLiveData = (k0<Result<Boolean>>)new k0();
        final CoroutineExceptionHandler$b s = CoroutineExceptionHandler.s;
        this.apiErrorHandler = (CoroutineExceptionHandler)new MessageDetailsViewModel$special$$inlined$CoroutineExceptionHandler.MessageDetailsViewModel$special$$inlined$CoroutineExceptionHandler$1((g.c)s, this);
        this.downloadErrorHandler = (CoroutineExceptionHandler)new MessageDetailsViewModel$special$$inlined$CoroutineExceptionHandler.MessageDetailsViewModel$special$$inlined$CoroutineExceptionHandler$2((g.c)s, this);
        this.confirmReadMessageErrorHandler = (CoroutineExceptionHandler)new MessageDetailsViewModel$special$$inlined$CoroutineExceptionHandler.MessageDetailsViewModel$special$$inlined$CoroutineExceptionHandler$3((g.c)s, this);
        this.deleteMessageErrorHandler = (CoroutineExceptionHandler)new MessageDetailsViewModel$special$$inlined$CoroutineExceptionHandler.MessageDetailsViewModel$special$$inlined$CoroutineExceptionHandler$4((g.c)s, this);
    }
    
    private final k2 getMessageDetails(final String s) {
        return h.f(x0.a((w0)this), (g)this.apiErrorHandler, (u0)null, (p)new MessageDetailsViewModel$getMessageDetails.MessageDetailsViewModel$getMessageDetails$1(this, s, (d)null), 2, (Object)null);
    }
    
    private final void observeMessageIdLiveData() {
        l.c1(l.e1(l.l0(n.a((LiveData)this.messageIdLiveData)), (p)new MessageDetailsViewModel$observeMessageIdLiveData.MessageDetailsViewModel$observeMessageIdLiveData$1(this, (d)null)), x0.a((w0)this));
    }
    
    @e
    public final k2 confirmReadMessage(@e final String s) {
        kotlin.jvm.internal.k0.p(s, "id");
        return h.f(x0.a((w0)this), (g)this.confirmReadMessageErrorHandler, (u0)null, (p)new MessageDetailsViewModel$confirmReadMessage.MessageDetailsViewModel$confirmReadMessage$1(this, s, (d)null), 2, (Object)null);
    }
    
    public final long currentUserId() {
        return this.appSettings.i().getUserId();
    }
    
    @e
    public final k2 deleteMessage(@e final String s) {
        kotlin.jvm.internal.k0.p(s, "id");
        return h.f(x0.a((w0)this), (g)this.deleteMessageErrorHandler, (u0)null, (p)new MessageDetailsViewModel$deleteMessage.MessageDetailsViewModel$deleteMessage$1(this, s, (d)null), 2, (Object)null);
    }
    
    @e
    public final k2 downloadMessageBlobAttachment(@e final OutputStream outputStream, @e final String s) {
        kotlin.jvm.internal.k0.p(outputStream, "attachmentFileOutputStream");
        kotlin.jvm.internal.k0.p(s, "messageId");
        return h.f(x0.a((w0)this), (g)this.downloadErrorHandler, (u0)null, (p)new MessageDetailsViewModel$downloadMessageBlobAttachment.MessageDetailsViewModel$downloadMessageBlobAttachment$1(this, outputStream, s, (d)null), 2, (Object)null);
    }
    
    @e
    public final LiveData<ConfirmReadMessageState> getConfirmReadMessageStateLiveData() {
        return (LiveData<ConfirmReadMessageState>)this._confirmReadMessageStateLiveData;
    }
    
    @e
    public final LiveData<Result<Boolean>> getDeleteMessageLiveData() {
        return (LiveData<Result<Boolean>>)this._deleteMessageLiveData;
    }
    
    @e
    public final LiveData<DownloadAttachmentState> getDownloadAttachmentStateLiveData() {
        return (LiveData<DownloadAttachmentState>)this._downloadAttachmentStateLiveData;
    }
    
    @e
    public final LiveData<Result<Message>> getMessageDetailsLiveData() {
        return (LiveData<Result<Message>>)this._messageDetailsLiveData;
    }
    
    @e
    public final k0<String> getMessageIdLiveData() {
        return this.messageIdLiveData;
    }
}
