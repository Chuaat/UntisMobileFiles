// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.data.source.remote.sent;

import com.untis.mobile.messages.data.model.response.SentMessagesResponse;
import java.util.List;
import com.untis.mobile.messages.data.model.Message;
import com.untis.mobile.messages.data.model.ReadConfirmationStatus;
import java.util.ArrayList;
import org.jetbrains.annotations.f;
import com.untis.mobile.messages.api.MessagesApi;
import retrofit2.t;
import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.d;
import kotlin.j2;
import n6.l;
import kotlin.jvm.internal.k0;
import com.untis.mobile.messages.api.MessagesApiProvider;
import org.jetbrains.annotations.e;
import android.content.Context;
import kotlin.Metadata;
import com.untis.mobile.messages.data.source.base.SentMessagesDataSource;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ+\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\r\u0010\tJ>\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00062!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\u000eH\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J>\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00062!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00130\u000eH\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!" }, d2 = { "Lcom/untis/mobile/messages/data/source/remote/sent/SentMessagesRemoteDataSource;", "Lcom/untis/mobile/messages/data/source/base/SentMessagesDataSource;", "", "Lcom/untis/mobile/messages/data/model/Message;", "getSentMessages", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "id", "getSentMessageDetails", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Ljava/util/ArrayList;", "Lcom/untis/mobile/messages/data/model/ReadConfirmationStatus;", "Lkotlin/collections/ArrayList;", "getReadConfirmationStatus", "Lkotlin/Function1;", "", "Lkotlin/t0;", "name", "isMessageDeletedSuccessfully", "Lkotlin/j2;", "callback", "deleteMessage", "(Ljava/lang/String;Ln6/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "isMessageRevokedSuccessfully", "revokeMessage", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Lcom/untis/mobile/messages/api/MessagesApiProvider;", "messagesApiProvider", "Lcom/untis/mobile/messages/api/MessagesApiProvider;", "<init>", "(Landroid/content/Context;Lcom/untis/mobile/messages/api/MessagesApiProvider;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class SentMessagesRemoteDataSource implements SentMessagesDataSource
{
    @e
    private final Context context;
    @e
    private final MessagesApiProvider messagesApiProvider;
    
    public SentMessagesRemoteDataSource(@e final Context context, @e final MessagesApiProvider messagesApiProvider) {
        k0.p(context, "context");
        k0.p(messagesApiProvider, "messagesApiProvider");
        this.context = context;
        this.messagesApiProvider = messagesApiProvider;
    }
    
    @f
    @Override
    public Object deleteMessage(@e final String s, @e l<? super Boolean, j2> l$0, @e final d<? super j2> d) {
        Object o = null;
        Label_0054: {
            if (d instanceof SentMessagesRemoteDataSource$deleteMessage.SentMessagesRemoteDataSource$deleteMessage$1) {
                final SentMessagesRemoteDataSource$deleteMessage.SentMessagesRemoteDataSource$deleteMessage$1 sentMessagesRemoteDataSource$deleteMessage$1 = (SentMessagesRemoteDataSource$deleteMessage.SentMessagesRemoteDataSource$deleteMessage$1)d;
                final int label = sentMessagesRemoteDataSource$deleteMessage$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    sentMessagesRemoteDataSource$deleteMessage$1.label = label + Integer.MIN_VALUE;
                    o = sentMessagesRemoteDataSource$deleteMessage$1;
                    break Label_0054;
                }
            }
            o = new SentMessagesRemoteDataSource$deleteMessage.SentMessagesRemoteDataSource$deleteMessage$1(this, (d)d);
        }
        final Object result = ((SentMessagesRemoteDataSource$deleteMessage.SentMessagesRemoteDataSource$deleteMessage$1)o).result;
        final Object h = b.h();
        final int label2 = ((SentMessagesRemoteDataSource$deleteMessage.SentMessagesRemoteDataSource$deleteMessage$1)o).label;
        Object deleteMessage;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l$0 = (l)((SentMessagesRemoteDataSource$deleteMessage.SentMessagesRemoteDataSource$deleteMessage$1)o).L$0;
            c1.n(result);
            deleteMessage = result;
        }
        else {
            c1.n(result);
            final MessagesApi messagesApi = this.messagesApiProvider.getMessagesApi(this.context);
            ((SentMessagesRemoteDataSource$deleteMessage.SentMessagesRemoteDataSource$deleteMessage$1)o).L$0 = l$0;
            ((SentMessagesRemoteDataSource$deleteMessage.SentMessagesRemoteDataSource$deleteMessage$1)o).label = 1;
            if ((deleteMessage = messagesApi.deleteMessage(s, (d<? super t<Void>>)o)) == h) {
                return h;
            }
        }
        Boolean b;
        if (((t)deleteMessage).g()) {
            b = kotlin.coroutines.jvm.internal.b.a(true);
        }
        else {
            b = kotlin.coroutines.jvm.internal.b.a(false);
        }
        l$0.invoke(b);
        return j2.a;
    }
    
    @f
    @Override
    public Object getReadConfirmationStatus(@e final String s, @e final d<? super ArrayList<ReadConfirmationStatus>> d) {
        return this.messagesApiProvider.getMessagesApi(this.context).getReadConfirmationStatus(s, d);
    }
    
    @f
    @Override
    public Object getSentMessageDetails(@e final String s, @e final d<? super Message> d) {
        return this.messagesApiProvider.getMessagesApi(this.context).getSentMessageDetails(s, d);
    }
    
    @f
    @Override
    public Object getSentMessages(@e final d<? super List<Message>> d) {
        Object o = null;
        Label_0047: {
            if (d instanceof SentMessagesRemoteDataSource$getSentMessages.SentMessagesRemoteDataSource$getSentMessages$1) {
                final SentMessagesRemoteDataSource$getSentMessages.SentMessagesRemoteDataSource$getSentMessages$1 sentMessagesRemoteDataSource$getSentMessages$1 = (SentMessagesRemoteDataSource$getSentMessages.SentMessagesRemoteDataSource$getSentMessages$1)d;
                final int label = sentMessagesRemoteDataSource$getSentMessages$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    sentMessagesRemoteDataSource$getSentMessages$1.label = label + Integer.MIN_VALUE;
                    o = sentMessagesRemoteDataSource$getSentMessages$1;
                    break Label_0047;
                }
            }
            o = new SentMessagesRemoteDataSource$getSentMessages.SentMessagesRemoteDataSource$getSentMessages$1(this, (d)d);
        }
        final Object result = ((SentMessagesRemoteDataSource$getSentMessages.SentMessagesRemoteDataSource$getSentMessages$1)o).result;
        final Object h = b.h();
        final int label2 = ((SentMessagesRemoteDataSource$getSentMessages.SentMessagesRemoteDataSource$getSentMessages$1)o).label;
        Object sentMessages;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1.n(result);
            sentMessages = result;
        }
        else {
            c1.n(result);
            final MessagesApi messagesApi = this.messagesApiProvider.getMessagesApi(this.context);
            ((SentMessagesRemoteDataSource$getSentMessages.SentMessagesRemoteDataSource$getSentMessages$1)o).label = 1;
            if ((sentMessages = messagesApi.getSentMessages((d<? super SentMessagesResponse>)o)) == h) {
                return h;
            }
        }
        return ((SentMessagesResponse)sentMessages).getSentMessages();
    }
    
    @f
    @Override
    public Object revokeMessage(@e final String s, @e l<? super Boolean, j2> l$0, @e final d<? super j2> d) {
        Object o = null;
        Label_0054: {
            if (d instanceof SentMessagesRemoteDataSource$revokeMessage.SentMessagesRemoteDataSource$revokeMessage$1) {
                final SentMessagesRemoteDataSource$revokeMessage.SentMessagesRemoteDataSource$revokeMessage$1 sentMessagesRemoteDataSource$revokeMessage$1 = (SentMessagesRemoteDataSource$revokeMessage.SentMessagesRemoteDataSource$revokeMessage$1)d;
                final int label = sentMessagesRemoteDataSource$revokeMessage$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    sentMessagesRemoteDataSource$revokeMessage$1.label = label + Integer.MIN_VALUE;
                    o = sentMessagesRemoteDataSource$revokeMessage$1;
                    break Label_0054;
                }
            }
            o = new SentMessagesRemoteDataSource$revokeMessage.SentMessagesRemoteDataSource$revokeMessage$1(this, (d)d);
        }
        final Object result = ((SentMessagesRemoteDataSource$revokeMessage.SentMessagesRemoteDataSource$revokeMessage$1)o).result;
        final Object h = b.h();
        final int label2 = ((SentMessagesRemoteDataSource$revokeMessage.SentMessagesRemoteDataSource$revokeMessage$1)o).label;
        Object revokeMessage;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l$0 = (l)((SentMessagesRemoteDataSource$revokeMessage.SentMessagesRemoteDataSource$revokeMessage$1)o).L$0;
            c1.n(result);
            revokeMessage = result;
        }
        else {
            c1.n(result);
            final MessagesApi messagesApi = this.messagesApiProvider.getMessagesApi(this.context);
            ((SentMessagesRemoteDataSource$revokeMessage.SentMessagesRemoteDataSource$revokeMessage$1)o).L$0 = l$0;
            ((SentMessagesRemoteDataSource$revokeMessage.SentMessagesRemoteDataSource$revokeMessage$1)o).label = 1;
            if ((revokeMessage = messagesApi.revokeMessage(s, (d<? super t<Void>>)o)) == h) {
                return h;
            }
        }
        Boolean b;
        if (((t)revokeMessage).g()) {
            b = kotlin.coroutines.jvm.internal.b.a(true);
        }
        else {
            b = kotlin.coroutines.jvm.internal.b.a(false);
        }
        l$0.invoke(b);
        return j2.a;
    }
}
