// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.ui.send.search.viewmodel;

import kotlinx.coroutines.u0;
import kotlinx.coroutines.h;
import androidx.lifecycle.x0;
import n6.p;
import kotlin.coroutines.d;
import kotlinx.coroutines.flow.l;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.n;
import kotlinx.coroutines.k2;
import kotlin.coroutines.g;
import com.untis.mobile.messages.util.SendMessageTypes;
import com.untis.mobile.messages.data.repository.send.SendMessageRepository;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.jetbrains.annotations.e;
import com.untis.mobile.messages.data.model.Recipient;
import java.util.List;
import com.untis.mobile.messages.base.Result;
import androidx.lifecycle.k0;
import kotlinx.coroutines.z1;
import kotlinx.coroutines.a2;
import kotlin.Metadata;
import androidx.lifecycle.w0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002R%\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f0\u000b8F@\u0006¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R(\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f0\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00158\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00158\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\"" }, d2 = { "Lcom/untis/mobile/messages/ui/send/search/viewmodel/SearchRecipientViewModel;", "Landroidx/lifecycle/w0;", "Lkotlin/j2;", "observeSearchQuery", "observeSendMessageType", "Lcom/untis/mobile/messages/util/SendMessageTypes;", "type", "", "query", "Lkotlinx/coroutines/k2;", "recipientSearch", "Landroidx/lifecycle/LiveData;", "Lcom/untis/mobile/messages/base/Result;", "", "Lcom/untis/mobile/messages/data/model/Recipient;", "getRecipientsLiveData", "()Landroidx/lifecycle/LiveData;", "recipientsLiveData", "Lcom/untis/mobile/messages/data/repository/send/SendMessageRepository;", "sendMessageRepository", "Lcom/untis/mobile/messages/data/repository/send/SendMessageRepository;", "Landroidx/lifecycle/k0;", "_recipientsLiveData", "Landroidx/lifecycle/k0;", "searchQuery", "getSearchQuery", "()Landroidx/lifecycle/k0;", "sendMessageType", "getSendMessageType", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "apiErrorHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "<init>", "(Lcom/untis/mobile/messages/data/repository/send/SendMessageRepository;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
@a2
@z1
public final class SearchRecipientViewModel extends w0
{
    @e
    private final k0<Result<List<Recipient>>> _recipientsLiveData;
    @e
    private final CoroutineExceptionHandler apiErrorHandler;
    @e
    private final k0<String> searchQuery;
    @e
    private final SendMessageRepository sendMessageRepository;
    @e
    private final k0<SendMessageTypes> sendMessageType;
    
    public SearchRecipientViewModel(@e final SendMessageRepository sendMessageRepository) {
        kotlin.jvm.internal.k0.p(sendMessageRepository, "sendMessageRepository");
        this.sendMessageRepository = sendMessageRepository;
        this.searchQuery = (k0<String>)new k0();
        this.sendMessageType = (k0<SendMessageTypes>)new k0();
        this._recipientsLiveData = (k0<Result<List<Recipient>>>)new k0();
        this.apiErrorHandler = (CoroutineExceptionHandler)new SearchRecipientViewModel$special$$inlined$CoroutineExceptionHandler.SearchRecipientViewModel$special$$inlined$CoroutineExceptionHandler$1((g.c)CoroutineExceptionHandler.s, this);
        this.observeSearchQuery();
        this.observeSendMessageType();
    }
    
    private final void observeSearchQuery() {
        l.c1(l.e1(l.l0(l.f0(n.a((LiveData)this.searchQuery), 500L)), (p)new SearchRecipientViewModel$observeSearchQuery.SearchRecipientViewModel$observeSearchQuery$1(this, (d)null)), x0.a((w0)this));
    }
    
    private final void observeSendMessageType() {
        l.c1(l.e1(l.l0(n.a((LiveData)this.sendMessageType)), (p)new SearchRecipientViewModel$observeSendMessageType.SearchRecipientViewModel$observeSendMessageType$1(this, (d)null)), x0.a((w0)this));
    }
    
    private final k2 recipientSearch(final SendMessageTypes sendMessageTypes, final String s) {
        return h.f(x0.a((w0)this), (g)this.apiErrorHandler, (u0)null, (p)new SearchRecipientViewModel$recipientSearch.SearchRecipientViewModel$recipientSearch$1(this, sendMessageTypes, s, (d)null), 2, (Object)null);
    }
    
    @e
    public final LiveData<Result<List<Recipient>>> getRecipientsLiveData() {
        return (LiveData<Result<List<Recipient>>>)this._recipientsLiveData;
    }
    
    @e
    public final k0<String> getSearchQuery() {
        return this.searchQuery;
    }
    
    @e
    public final k0<SendMessageTypes> getSendMessageType() {
        return this.sendMessageType;
    }
}
