// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.data.source.remote.main;

import org.jetbrains.annotations.f;
import com.untis.mobile.messages.data.model.response.MessagePermissionsResponse;
import kotlin.coroutines.d;
import kotlin.jvm.internal.k0;
import com.untis.mobile.messages.api.MessagesApiProvider;
import org.jetbrains.annotations.e;
import android.content.Context;
import kotlin.Metadata;
import com.untis.mobile.messages.data.source.base.MessagesMainDataSource;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r" }, d2 = { "Lcom/untis/mobile/messages/data/source/remote/main/MessagesMainRemoteDataSource;", "Lcom/untis/mobile/messages/data/source/base/MessagesMainDataSource;", "Lcom/untis/mobile/messages/data/model/response/MessagePermissionsResponse;", "getMessagesPermissions", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/messages/api/MessagesApiProvider;", "messagesApiProvider", "Lcom/untis/mobile/messages/api/MessagesApiProvider;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;Lcom/untis/mobile/messages/api/MessagesApiProvider;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class MessagesMainRemoteDataSource implements MessagesMainDataSource
{
    @e
    private final Context context;
    @e
    private final MessagesApiProvider messagesApiProvider;
    
    public MessagesMainRemoteDataSource(@e final Context context, @e final MessagesApiProvider messagesApiProvider) {
        k0.p(context, "context");
        k0.p(messagesApiProvider, "messagesApiProvider");
        this.context = context;
        this.messagesApiProvider = messagesApiProvider;
    }
    
    @f
    @Override
    public Object getMessagesPermissions(@e final d<? super MessagePermissionsResponse> d) {
        return this.messagesApiProvider.getMessagesApi(this.context).getMessagePermissions(d);
    }
}
