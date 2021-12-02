// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.ui.send.recipient.viewmodel;

import kotlinx.coroutines.flow.l;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.n;
import n6.p;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.h;
import kotlin.coroutines.d;
import androidx.lifecycle.x0;
import kotlinx.coroutines.k2;
import kotlin.coroutines.g;
import com.untis.mobile.messages.util.SendMessageTypes;
import com.untis.mobile.messages.data.repository.send.SendMessageRepository;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.jetbrains.annotations.e;
import com.untis.mobile.messages.data.model.Group;
import java.util.List;
import com.untis.mobile.messages.util.RecipientSectionTypes;
import java.util.Map;
import com.untis.mobile.messages.base.Result;
import androidx.lifecycle.k0;
import kotlinx.coroutines.z1;
import kotlin.Metadata;
import androidx.lifecycle.w0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR3\u0010\u0016\u001a\"\u0012\u001e\u0012\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0011\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00120\u00100\u000f0\u000e8F@\u0006¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R6\u0010\u0018\u001a\"\u0012\u001e\u0012\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0011\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00120\u00100\u000f0\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00178\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f" }, d2 = { "Lcom/untis/mobile/messages/ui/send/recipient/viewmodel/RecipientsViewModel;", "Landroidx/lifecycle/w0;", "Lcom/untis/mobile/messages/util/SendMessageTypes;", "recipientsOption", "Lkotlinx/coroutines/k2;", "getRecipientGroups", "Lkotlin/j2;", "observeSendMessageType", "Lcom/untis/mobile/messages/data/repository/send/SendMessageRepository;", "sendMessageRepository", "Lcom/untis/mobile/messages/data/repository/send/SendMessageRepository;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "apiErrorHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Landroidx/lifecycle/LiveData;", "Lcom/untis/mobile/messages/base/Result;", "", "Lcom/untis/mobile/messages/util/RecipientSectionTypes;", "", "Lcom/untis/mobile/messages/data/model/Group;", "getRecipientsLiveData", "()Landroidx/lifecycle/LiveData;", "recipientsLiveData", "Landroidx/lifecycle/k0;", "_recipientsLiveData", "Landroidx/lifecycle/k0;", "sendMessageType", "getSendMessageType", "()Landroidx/lifecycle/k0;", "<init>", "(Lcom/untis/mobile/messages/data/repository/send/SendMessageRepository;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
@z1
public final class RecipientsViewModel extends w0
{
    @e
    private final k0<Result<Map<RecipientSectionTypes, List<Group>>>> _recipientsLiveData;
    @e
    private final CoroutineExceptionHandler apiErrorHandler;
    @e
    private final SendMessageRepository sendMessageRepository;
    @e
    private final k0<SendMessageTypes> sendMessageType;
    
    public RecipientsViewModel(@e final SendMessageRepository sendMessageRepository) {
        kotlin.jvm.internal.k0.p(sendMessageRepository, "sendMessageRepository");
        this.sendMessageRepository = sendMessageRepository;
        this._recipientsLiveData = (k0<Result<Map<RecipientSectionTypes, List<Group>>>>)new k0();
        this.apiErrorHandler = (CoroutineExceptionHandler)new RecipientsViewModel$special$$inlined$CoroutineExceptionHandler.RecipientsViewModel$special$$inlined$CoroutineExceptionHandler$1((g.c)CoroutineExceptionHandler.s, this);
        this.sendMessageType = (k0<SendMessageTypes>)new k0();
        this.observeSendMessageType();
    }
    
    private final k2 getRecipientGroups(final SendMessageTypes sendMessageTypes) {
        return h.f(x0.a((w0)this), (g)this.apiErrorHandler, (u0)null, (p)new RecipientsViewModel$getRecipientGroups.RecipientsViewModel$getRecipientGroups$1(this, sendMessageTypes, (d)null), 2, (Object)null);
    }
    
    private final void observeSendMessageType() {
        l.c1(l.e1(l.l0(n.a((LiveData)this.sendMessageType)), (p)new RecipientsViewModel$observeSendMessageType.RecipientsViewModel$observeSendMessageType$1(this, (d)null)), x0.a((w0)this));
    }
    
    @e
    public final LiveData<Result<Map<RecipientSectionTypes, List<Group>>>> getRecipientsLiveData() {
        return (LiveData<Result<Map<RecipientSectionTypes, List<Group>>>>)this._recipientsLiveData;
    }
    
    @e
    public final k0<SendMessageTypes> getSendMessageType() {
        return this.sendMessageType;
    }
}
