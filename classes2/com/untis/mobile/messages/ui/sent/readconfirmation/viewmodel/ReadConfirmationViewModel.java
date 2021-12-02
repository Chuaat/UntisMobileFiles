// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.ui.sent.readconfirmation.viewmodel;

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
import com.untis.mobile.messages.data.repository.sent.SentMessagesRepository;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.jetbrains.annotations.e;
import com.untis.mobile.messages.data.model.ReadConfirmationStatus;
import java.util.List;
import com.untis.mobile.messages.base.Result;
import androidx.lifecycle.k0;
import kotlinx.coroutines.z1;
import kotlin.Metadata;
import androidx.lifecycle.w0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002R(\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR%\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\u000e8F@\u0006¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d" }, d2 = { "Lcom/untis/mobile/messages/ui/sent/readconfirmation/viewmodel/ReadConfirmationViewModel;", "Landroidx/lifecycle/w0;", "", "id", "Lkotlinx/coroutines/k2;", "getReadConfirmationStatus", "Lkotlin/j2;", "observeMessageId", "Landroidx/lifecycle/k0;", "Lcom/untis/mobile/messages/base/Result;", "", "Lcom/untis/mobile/messages/data/model/ReadConfirmationStatus;", "_readConfirmationStatusLiveData", "Landroidx/lifecycle/k0;", "Landroidx/lifecycle/LiveData;", "getReadConfirmationStatusLiveData", "()Landroidx/lifecycle/LiveData;", "readConfirmationStatusLiveData", "Lcom/untis/mobile/messages/data/repository/sent/SentMessagesRepository;", "sentMessagesRepository", "Lcom/untis/mobile/messages/data/repository/sent/SentMessagesRepository;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "errorHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "messageId", "getMessageId", "()Landroidx/lifecycle/k0;", "<init>", "(Lcom/untis/mobile/messages/data/repository/sent/SentMessagesRepository;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
@z1
public final class ReadConfirmationViewModel extends w0
{
    @e
    private final k0<Result<List<ReadConfirmationStatus>>> _readConfirmationStatusLiveData;
    @e
    private final CoroutineExceptionHandler errorHandler;
    @e
    private final k0<String> messageId;
    @e
    private final SentMessagesRepository sentMessagesRepository;
    
    public ReadConfirmationViewModel(@e final SentMessagesRepository sentMessagesRepository) {
        kotlin.jvm.internal.k0.p(sentMessagesRepository, "sentMessagesRepository");
        this.sentMessagesRepository = sentMessagesRepository;
        this._readConfirmationStatusLiveData = (k0<Result<List<ReadConfirmationStatus>>>)new k0();
        this.errorHandler = (CoroutineExceptionHandler)new ReadConfirmationViewModel$special$$inlined$CoroutineExceptionHandler.ReadConfirmationViewModel$special$$inlined$CoroutineExceptionHandler$1((g.c)CoroutineExceptionHandler.s, this);
        this.messageId = (k0<String>)new k0();
        this.observeMessageId();
    }
    
    private final k2 getReadConfirmationStatus(final String s) {
        return h.f(x0.a((w0)this), (g)this.errorHandler, (u0)null, (p)new ReadConfirmationViewModel$getReadConfirmationStatus.ReadConfirmationViewModel$getReadConfirmationStatus$1(this, s, (d)null), 2, (Object)null);
    }
    
    private final void observeMessageId() {
        l.c1(l.e1(l.l0(n.a((LiveData)this.messageId)), (p)new ReadConfirmationViewModel$observeMessageId.ReadConfirmationViewModel$observeMessageId$1(this, (d)null)), x0.a((w0)this));
    }
    
    @e
    public final k0<String> getMessageId() {
        return this.messageId;
    }
    
    @e
    public final LiveData<Result<List<ReadConfirmationStatus>>> getReadConfirmationStatusLiveData() {
        return (LiveData<Result<List<ReadConfirmationStatus>>>)this._readConfirmationStatusLiveData;
    }
}
