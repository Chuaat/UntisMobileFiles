// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.ui.send.editor.viewmodel;

import com.untis.mobile.messages.data.model.request.SendMessageBody;
import n6.p;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.h;
import kotlin.coroutines.d;
import androidx.lifecycle.x0;
import kotlinx.coroutines.k2;
import com.untis.mobile.messages.data.model.request.MessageReplyRequestBody;
import androidx.lifecycle.LiveData;
import kotlin.coroutines.g;
import com.untis.mobile.messages.data.repository.send.SendMessageRepository;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.jetbrains.annotations.e;
import com.untis.mobile.messages.data.model.response.SendMessageResponse;
import com.untis.mobile.messages.base.Result;
import androidx.lifecycle.k0;
import kotlin.Metadata;
import androidx.lifecycle.w0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b*\u0010+J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bR\u001f\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b8F@\u0006¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\"\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010'\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0013\u001a\u0004\b(\u0010\u0015\"\u0004\b)\u0010\u0017¨\u0006," }, d2 = { "Lcom/untis/mobile/messages/ui/send/editor/viewmodel/SendMessageViewModel;", "Landroidx/lifecycle/w0;", "Lcom/untis/mobile/messages/data/model/request/SendMessageBody;", "sendMessageBody", "Lkotlinx/coroutines/k2;", "sendMessage", "", "messageId", "Lcom/untis/mobile/messages/data/model/request/MessageReplyRequestBody;", "messageReplyRequestBody", "replyMessage", "Landroidx/lifecycle/LiveData;", "Lcom/untis/mobile/messages/base/Result;", "Lcom/untis/mobile/messages/data/model/response/SendMessageResponse;", "getSendMessageResponseLiveData", "()Landroidx/lifecycle/LiveData;", "sendMessageResponseLiveData", "", "requestReadConfirmation", "Z", "getRequestReadConfirmation", "()Z", "setRequestReadConfirmation", "(Z)V", "subtitleText", "Ljava/lang/String;", "getSubtitleText", "()Ljava/lang/String;", "setSubtitleText", "(Ljava/lang/String;)V", "Lcom/untis/mobile/messages/data/repository/send/SendMessageRepository;", "sendMessageRepository", "Lcom/untis/mobile/messages/data/repository/send/SendMessageRepository;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "apiErrorHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Landroidx/lifecycle/k0;", "_sendMessageResponseLiveData", "Landroidx/lifecycle/k0;", "copyToStudents", "getCopyToStudents", "setCopyToStudents", "<init>", "(Lcom/untis/mobile/messages/data/repository/send/SendMessageRepository;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class SendMessageViewModel extends w0
{
    @e
    private final k0<Result<SendMessageResponse>> _sendMessageResponseLiveData;
    @e
    private final CoroutineExceptionHandler apiErrorHandler;
    private boolean copyToStudents;
    private boolean requestReadConfirmation;
    @e
    private final SendMessageRepository sendMessageRepository;
    @e
    private String subtitleText;
    
    public SendMessageViewModel(@e final SendMessageRepository sendMessageRepository) {
        kotlin.jvm.internal.k0.p(sendMessageRepository, "sendMessageRepository");
        this.sendMessageRepository = sendMessageRepository;
        this.subtitleText = "";
        this._sendMessageResponseLiveData = (k0<Result<SendMessageResponse>>)new k0();
        this.apiErrorHandler = (CoroutineExceptionHandler)new SendMessageViewModel$special$$inlined$CoroutineExceptionHandler.SendMessageViewModel$special$$inlined$CoroutineExceptionHandler$1((g.c)CoroutineExceptionHandler.s, this);
    }
    
    public final boolean getCopyToStudents() {
        return this.copyToStudents;
    }
    
    public final boolean getRequestReadConfirmation() {
        return this.requestReadConfirmation;
    }
    
    @e
    public final LiveData<Result<SendMessageResponse>> getSendMessageResponseLiveData() {
        return (LiveData<Result<SendMessageResponse>>)this._sendMessageResponseLiveData;
    }
    
    @e
    public final String getSubtitleText() {
        return this.subtitleText;
    }
    
    @e
    public final k2 replyMessage(@e final String s, @e final MessageReplyRequestBody messageReplyRequestBody) {
        kotlin.jvm.internal.k0.p(s, "messageId");
        kotlin.jvm.internal.k0.p(messageReplyRequestBody, "messageReplyRequestBody");
        return h.f(x0.a((w0)this), (g)this.apiErrorHandler, (u0)null, (p)new SendMessageViewModel$replyMessage.SendMessageViewModel$replyMessage$1(this, s, messageReplyRequestBody, (d)null), 2, (Object)null);
    }
    
    @e
    public final k2 sendMessage(@e final SendMessageBody sendMessageBody) {
        kotlin.jvm.internal.k0.p(sendMessageBody, "sendMessageBody");
        return h.f(x0.a((w0)this), (g)this.apiErrorHandler, (u0)null, (p)new SendMessageViewModel$sendMessage.SendMessageViewModel$sendMessage$1(this, sendMessageBody, (d)null), 2, (Object)null);
    }
    
    public final void setCopyToStudents(final boolean copyToStudents) {
        this.copyToStudents = copyToStudents;
    }
    
    public final void setRequestReadConfirmation(final boolean requestReadConfirmation) {
        this.requestReadConfirmation = requestReadConfirmation;
    }
    
    public final void setSubtitleText(@e final String subtitleText) {
        kotlin.jvm.internal.k0.p(subtitleText, "<set-?>");
        this.subtitleText = subtitleText;
    }
}
