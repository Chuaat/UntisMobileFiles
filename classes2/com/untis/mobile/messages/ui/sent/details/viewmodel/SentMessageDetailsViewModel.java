// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.ui.sent.details.viewmodel;

import androidx.lifecycle.LiveData;
import java.io.OutputStream;
import n6.p;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.h;
import kotlin.coroutines.d;
import androidx.lifecycle.x0;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.CoroutineExceptionHandler$b;
import kotlin.coroutines.g;
import com.untis.mobile.messages.data.repository.sent.SentMessagesRepository;
import com.untis.mobile.messages.data.repository.inbox.MessagesRepository;
import com.untis.mobile.utils.a;
import kotlinx.coroutines.CoroutineExceptionHandler;
import com.untis.mobile.messages.data.model.Message;
import com.untis.mobile.messages.ui.inbox.details.viewmodel.DownloadAttachmentState;
import org.jetbrains.annotations.e;
import com.untis.mobile.messages.util.AlertDialogTypes;
import com.untis.mobile.messages.base.Result;
import androidx.lifecycle.k0;
import kotlin.Metadata;
import androidx.lifecycle.w0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b-\u0010.J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0004J\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0004R\"\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\"\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u000f0\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001f\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u000f0\u001d8F@\u0006¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001cR\u001f\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u001d8F@\u0006¢\u0006\u0006\u001a\u0004\b\"\u0010\u001fR\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001cR\u0019\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00130\u001d8F@\u0006¢\u0006\u0006\u001a\u0004\b(\u0010\u001fR\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006/" }, d2 = { "Lcom/untis/mobile/messages/ui/sent/details/viewmodel/SentMessageDetailsViewModel;", "Landroidx/lifecycle/w0;", "", "currentUserId", "", "messageId", "Lkotlinx/coroutines/k2;", "getSentMessageDetails", "Ljava/io/OutputStream;", "attachmentFileOutputStream", "downloadMessageBlobAttachment", "id", "deleteMessage", "revokeMessage", "Landroidx/lifecycle/k0;", "Lcom/untis/mobile/messages/base/Result;", "Lcom/untis/mobile/messages/data/model/Message;", "_sentMessageDetailsLiveData", "Landroidx/lifecycle/k0;", "Lcom/untis/mobile/messages/ui/inbox/details/viewmodel/DownloadAttachmentState;", "_downloadAttachmentStateLiveData", "Lcom/untis/mobile/messages/util/AlertDialogTypes;", "_deleteOrRevokeMessageLiveData", "Lcom/untis/mobile/messages/data/repository/inbox/MessagesRepository;", "messagesRepository", "Lcom/untis/mobile/messages/data/repository/inbox/MessagesRepository;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "apiErrorHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Landroidx/lifecycle/LiveData;", "getDeleteOrRevokeMessageLiveData", "()Landroidx/lifecycle/LiveData;", "deleteOrRevokeMessageLiveData", "deleteOrRevokeMessageErrorHandler", "getSentMessageDetailsLiveData", "sentMessageDetailsLiveData", "Lcom/untis/mobile/utils/a;", "appSettings", "Lcom/untis/mobile/utils/a;", "downloadErrorHandler", "getDownloadAttachmentStateLiveData", "downloadAttachmentStateLiveData", "Lcom/untis/mobile/messages/data/repository/sent/SentMessagesRepository;", "sentMessagesRepository", "Lcom/untis/mobile/messages/data/repository/sent/SentMessagesRepository;", "<init>", "(Lcom/untis/mobile/messages/data/repository/sent/SentMessagesRepository;Lcom/untis/mobile/messages/data/repository/inbox/MessagesRepository;Lcom/untis/mobile/utils/a;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class SentMessageDetailsViewModel extends w0
{
    @e
    private final k0<Result<AlertDialogTypes>> _deleteOrRevokeMessageLiveData;
    @e
    private final k0<DownloadAttachmentState> _downloadAttachmentStateLiveData;
    @e
    private final k0<Result<Message>> _sentMessageDetailsLiveData;
    @e
    private final CoroutineExceptionHandler apiErrorHandler;
    @e
    private final a appSettings;
    @e
    private final CoroutineExceptionHandler deleteOrRevokeMessageErrorHandler;
    @e
    private final CoroutineExceptionHandler downloadErrorHandler;
    @e
    private final MessagesRepository messagesRepository;
    @e
    private final SentMessagesRepository sentMessagesRepository;
    
    public SentMessageDetailsViewModel(@e final SentMessagesRepository sentMessagesRepository, @e final MessagesRepository messagesRepository, @e final a appSettings) {
        kotlin.jvm.internal.k0.p(sentMessagesRepository, "sentMessagesRepository");
        kotlin.jvm.internal.k0.p(messagesRepository, "messagesRepository");
        kotlin.jvm.internal.k0.p(appSettings, "appSettings");
        this.sentMessagesRepository = sentMessagesRepository;
        this.messagesRepository = messagesRepository;
        this.appSettings = appSettings;
        this._sentMessageDetailsLiveData = (k0<Result<Message>>)new k0();
        this._downloadAttachmentStateLiveData = (k0<DownloadAttachmentState>)new k0();
        this._deleteOrRevokeMessageLiveData = (k0<Result<AlertDialogTypes>>)new k0();
        final CoroutineExceptionHandler$b s = CoroutineExceptionHandler.s;
        this.apiErrorHandler = (CoroutineExceptionHandler)new SentMessageDetailsViewModel$special$$inlined$CoroutineExceptionHandler.SentMessageDetailsViewModel$special$$inlined$CoroutineExceptionHandler$1((g.c)s, this);
        this.downloadErrorHandler = (CoroutineExceptionHandler)new SentMessageDetailsViewModel$special$$inlined$CoroutineExceptionHandler.SentMessageDetailsViewModel$special$$inlined$CoroutineExceptionHandler$2((g.c)s, this);
        this.deleteOrRevokeMessageErrorHandler = (CoroutineExceptionHandler)new SentMessageDetailsViewModel$special$$inlined$CoroutineExceptionHandler.SentMessageDetailsViewModel$special$$inlined$CoroutineExceptionHandler$3((g.c)s, this);
    }
    
    public final long currentUserId() {
        return this.appSettings.i().getUserId();
    }
    
    @e
    public final k2 deleteMessage(@e final String s) {
        kotlin.jvm.internal.k0.p(s, "id");
        return h.f(x0.a((w0)this), (g)this.deleteOrRevokeMessageErrorHandler, (u0)null, (p)new SentMessageDetailsViewModel$deleteMessage.SentMessageDetailsViewModel$deleteMessage$1(this, s, (d)null), 2, (Object)null);
    }
    
    @e
    public final k2 downloadMessageBlobAttachment(@e final OutputStream outputStream, @e final String s) {
        kotlin.jvm.internal.k0.p(outputStream, "attachmentFileOutputStream");
        kotlin.jvm.internal.k0.p(s, "messageId");
        return h.f(x0.a((w0)this), (g)this.downloadErrorHandler, (u0)null, (p)new SentMessageDetailsViewModel$downloadMessageBlobAttachment.SentMessageDetailsViewModel$downloadMessageBlobAttachment$1(this, outputStream, s, (d)null), 2, (Object)null);
    }
    
    @e
    public final LiveData<Result<AlertDialogTypes>> getDeleteOrRevokeMessageLiveData() {
        return (LiveData<Result<AlertDialogTypes>>)this._deleteOrRevokeMessageLiveData;
    }
    
    @e
    public final LiveData<DownloadAttachmentState> getDownloadAttachmentStateLiveData() {
        return (LiveData<DownloadAttachmentState>)this._downloadAttachmentStateLiveData;
    }
    
    @e
    public final k2 getSentMessageDetails(@e final String s) {
        kotlin.jvm.internal.k0.p(s, "messageId");
        return h.f(x0.a((w0)this), (g)this.apiErrorHandler, (u0)null, (p)new SentMessageDetailsViewModel$getSentMessageDetails.SentMessageDetailsViewModel$getSentMessageDetails$1(this, s, (d)null), 2, (Object)null);
    }
    
    @e
    public final LiveData<Result<Message>> getSentMessageDetailsLiveData() {
        return (LiveData<Result<Message>>)this._sentMessageDetailsLiveData;
    }
    
    @e
    public final k2 revokeMessage(@e final String s) {
        kotlin.jvm.internal.k0.p(s, "id");
        return h.f(x0.a((w0)this), (g)this.deleteOrRevokeMessageErrorHandler, (u0)null, (p)new SentMessageDetailsViewModel$revokeMessage.SentMessageDetailsViewModel$revokeMessage$1(this, s, (d)null), 2, (Object)null);
    }
}
