// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.data.repository.main;

import org.jetbrains.annotations.f;
import n6.l;
import com.untis.mobile.messages.util.CoroutinesUtilKt;
import com.untis.mobile.messages.data.model.response.MessagePermissionsResponse;
import kotlin.coroutines.d;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import com.untis.mobile.messages.data.source.base.MessagesMainDataSource;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n" }, d2 = { "Lcom/untis/mobile/messages/data/repository/main/MessagesMainRepositoryImp;", "Lcom/untis/mobile/messages/data/repository/main/MessagesMainRepository;", "Lcom/untis/mobile/messages/data/model/response/MessagePermissionsResponse;", "getMessagesPermissions", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/messages/data/source/base/MessagesMainDataSource;", "messagesMainRemoteDataSource", "Lcom/untis/mobile/messages/data/source/base/MessagesMainDataSource;", "<init>", "(Lcom/untis/mobile/messages/data/source/base/MessagesMainDataSource;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class MessagesMainRepositoryImp implements MessagesMainRepository
{
    @e
    private final MessagesMainDataSource messagesMainRemoteDataSource;
    
    public MessagesMainRepositoryImp(@e final MessagesMainDataSource messagesMainRemoteDataSource) {
        k0.p(messagesMainRemoteDataSource, "messagesMainRemoteDataSource");
        this.messagesMainRemoteDataSource = messagesMainRemoteDataSource;
    }
    
    @f
    @Override
    public Object getMessagesPermissions(@e final d<? super MessagePermissionsResponse> d) {
        return CoroutinesUtilKt.retryIO$default(3, 0L, 0L, 0.0, (l)new MessagesMainRepositoryImp$getMessagesPermissions.MessagesMainRepositoryImp$getMessagesPermissions$2(this, (d)null), d, 14, null);
    }
}
