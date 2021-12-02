// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.ui.main.viewModel;

import androidx.lifecycle.LiveData;
import n6.p;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.h;
import kotlin.coroutines.d;
import androidx.lifecycle.x0;
import kotlinx.coroutines.k2;
import kotlin.coroutines.g;
import com.untis.mobile.messages.data.repository.main.MessagesMainRepository;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.jetbrains.annotations.e;
import com.untis.mobile.messages.data.model.response.MessagePermissionsResponse;
import com.untis.mobile.messages.base.Result;
import androidx.lifecycle.k0;
import kotlin.Metadata;
import androidx.lifecycle.w0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0002R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001f\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n8F@\u0006¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015" }, d2 = { "Lcom/untis/mobile/messages/ui/main/viewModel/MessagesMainViewModel;", "Landroidx/lifecycle/w0;", "Lkotlinx/coroutines/k2;", "getMessagesPermissions", "Lcom/untis/mobile/messages/data/repository/main/MessagesMainRepository;", "messagesMainRepository", "Lcom/untis/mobile/messages/data/repository/main/MessagesMainRepository;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "errorHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Landroidx/lifecycle/LiveData;", "Lcom/untis/mobile/messages/base/Result;", "Lcom/untis/mobile/messages/data/model/response/MessagePermissionsResponse;", "getMessagesPermissionsLiveData", "()Landroidx/lifecycle/LiveData;", "messagesPermissionsLiveData", "Landroidx/lifecycle/k0;", "_messagesPermissionsLiveData", "Landroidx/lifecycle/k0;", "<init>", "(Lcom/untis/mobile/messages/data/repository/main/MessagesMainRepository;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class MessagesMainViewModel extends w0
{
    @e
    private final k0<Result<MessagePermissionsResponse>> _messagesPermissionsLiveData;
    @e
    private final CoroutineExceptionHandler errorHandler;
    @e
    private final MessagesMainRepository messagesMainRepository;
    
    public MessagesMainViewModel(@e final MessagesMainRepository messagesMainRepository) {
        kotlin.jvm.internal.k0.p(messagesMainRepository, "messagesMainRepository");
        this.messagesMainRepository = messagesMainRepository;
        this._messagesPermissionsLiveData = (k0<Result<MessagePermissionsResponse>>)new k0();
        this.errorHandler = (CoroutineExceptionHandler)new MessagesMainViewModel$special$$inlined$CoroutineExceptionHandler.MessagesMainViewModel$special$$inlined$CoroutineExceptionHandler$1((g.c)CoroutineExceptionHandler.s, this);
        this.getMessagesPermissions();
    }
    
    private final k2 getMessagesPermissions() {
        return h.f(x0.a((w0)this), (g)this.errorHandler, (u0)null, (p)new MessagesMainViewModel$getMessagesPermissions.MessagesMainViewModel$getMessagesPermissions$1(this, (d)null), 2, (Object)null);
    }
    
    @e
    public final LiveData<Result<MessagePermissionsResponse>> getMessagesPermissionsLiveData() {
        return (LiveData<Result<MessagePermissionsResponse>>)this._messagesPermissionsLiveData;
    }
}
