// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.data.source.remote.inbox;

import com.untis.mobile.messages.data.model.response.UnreadMessagesCountResponse;
import kotlin.collections.y0;
import kotlin.n1;
import com.untis.mobile.messages.data.model.response.IncomingMessagesResponse;
import kotlin.s0;
import java.util.List;
import java.util.Map;
import com.untis.mobile.messages.data.model.Message;
import n6.l;
import org.jetbrains.annotations.f;
import com.untis.mobile.messages.api.MessagesApi;
import retrofit2.t;
import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.d;
import kotlin.j2;
import com.untis.mobile.messages.data.model.MessageRequestConfirmation;
import n6.p;
import kotlin.jvm.internal.k0;
import com.untis.mobile.messages.api.MessagesApiProvider;
import org.jetbrains.annotations.e;
import android.content.Context;
import kotlin.Metadata;
import com.untis.mobile.messages.data.source.base.MessagesDataSource;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\"\u0010#J%\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\bH\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\t\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0003H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJU\u0010\u0016\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u000328\u0010\u0015\u001a4\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rH\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J>\u0010\u001a\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u00032!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00140\u0018H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$" }, d2 = { "Lcom/untis/mobile/messages/data/source/remote/inbox/MessagesRemoteDataSource;", "Lcom/untis/mobile/messages/data/source/base/MessagesDataSource;", "", "", "", "Lcom/untis/mobile/messages/data/model/Message;", "getMessages", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "getUnreadMessagesCount", "id", "getMessageDetails", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Function2;", "", "Lkotlin/t0;", "name", "isReadConfirmedSuccessfully", "Lcom/untis/mobile/messages/data/model/MessageRequestConfirmation;", "confirmationResponse", "Lkotlin/j2;", "callback", "confirmReadMessage", "(Ljava/lang/String;Ln6/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Function1;", "isMessageDeletedSuccessfully", "deleteMessage", "(Ljava/lang/String;Ln6/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/messages/api/MessagesApiProvider;", "messagesApiProvider", "Lcom/untis/mobile/messages/api/MessagesApiProvider;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;Lcom/untis/mobile/messages/api/MessagesApiProvider;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class MessagesRemoteDataSource implements MessagesDataSource
{
    @e
    private final Context context;
    @e
    private final MessagesApiProvider messagesApiProvider;
    
    public MessagesRemoteDataSource(@e final Context context, @e final MessagesApiProvider messagesApiProvider) {
        k0.p(context, "context");
        k0.p(messagesApiProvider, "messagesApiProvider");
        this.context = context;
        this.messagesApiProvider = messagesApiProvider;
    }
    
    @f
    @Override
    public Object confirmReadMessage(@e final String s, @e p<? super Boolean, ? super MessageRequestConfirmation, j2> l$0, @e final d<? super j2> d) {
        Object o = null;
        Label_0054: {
            if (d instanceof MessagesRemoteDataSource$confirmReadMessage.MessagesRemoteDataSource$confirmReadMessage$1) {
                final MessagesRemoteDataSource$confirmReadMessage.MessagesRemoteDataSource$confirmReadMessage$1 messagesRemoteDataSource$confirmReadMessage$1 = (MessagesRemoteDataSource$confirmReadMessage.MessagesRemoteDataSource$confirmReadMessage$1)d;
                final int label = messagesRemoteDataSource$confirmReadMessage$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    messagesRemoteDataSource$confirmReadMessage$1.label = label + Integer.MIN_VALUE;
                    o = messagesRemoteDataSource$confirmReadMessage$1;
                    break Label_0054;
                }
            }
            o = new MessagesRemoteDataSource$confirmReadMessage.MessagesRemoteDataSource$confirmReadMessage$1(this, (d)d);
        }
        final Object result = ((MessagesRemoteDataSource$confirmReadMessage.MessagesRemoteDataSource$confirmReadMessage$1)o).result;
        final Object h = b.h();
        final int label2 = ((MessagesRemoteDataSource$confirmReadMessage.MessagesRemoteDataSource$confirmReadMessage$1)o).label;
        Object confirmReadMessage;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l$0 = (p)((MessagesRemoteDataSource$confirmReadMessage.MessagesRemoteDataSource$confirmReadMessage$1)o).L$0;
            c1.n(result);
            confirmReadMessage = result;
        }
        else {
            c1.n(result);
            final MessagesApi messagesApi = this.messagesApiProvider.getMessagesApi(this.context);
            ((MessagesRemoteDataSource$confirmReadMessage.MessagesRemoteDataSource$confirmReadMessage$1)o).L$0 = l$0;
            ((MessagesRemoteDataSource$confirmReadMessage.MessagesRemoteDataSource$confirmReadMessage$1)o).label = 1;
            if ((confirmReadMessage = messagesApi.confirmReadMessage(s, (d<? super t<MessageRequestConfirmation>>)o)) == h) {
                return h;
            }
        }
        final t t = (t)confirmReadMessage;
        Boolean b;
        Object a;
        if (t.g()) {
            b = kotlin.coroutines.jvm.internal.b.a(true);
            a = t.a();
        }
        else {
            b = kotlin.coroutines.jvm.internal.b.a(false);
            a = null;
        }
        l$0.invoke(b, a);
        return j2.a;
    }
    
    @f
    @Override
    public Object deleteMessage(@e final String s, @e l<? super Boolean, j2> l$0, @e final d<? super j2> d) {
        Object o = null;
        Label_0054: {
            if (d instanceof MessagesRemoteDataSource$deleteMessage.MessagesRemoteDataSource$deleteMessage$1) {
                final MessagesRemoteDataSource$deleteMessage.MessagesRemoteDataSource$deleteMessage$1 messagesRemoteDataSource$deleteMessage$1 = (MessagesRemoteDataSource$deleteMessage.MessagesRemoteDataSource$deleteMessage$1)d;
                final int label = messagesRemoteDataSource$deleteMessage$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    messagesRemoteDataSource$deleteMessage$1.label = label + Integer.MIN_VALUE;
                    o = messagesRemoteDataSource$deleteMessage$1;
                    break Label_0054;
                }
            }
            o = new MessagesRemoteDataSource$deleteMessage.MessagesRemoteDataSource$deleteMessage$1(this, (d)d);
        }
        final Object result = ((MessagesRemoteDataSource$deleteMessage.MessagesRemoteDataSource$deleteMessage$1)o).result;
        final Object h = b.h();
        final int label2 = ((MessagesRemoteDataSource$deleteMessage.MessagesRemoteDataSource$deleteMessage$1)o).label;
        Object deleteMessage;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l$0 = (l)((MessagesRemoteDataSource$deleteMessage.MessagesRemoteDataSource$deleteMessage$1)o).L$0;
            c1.n(result);
            deleteMessage = result;
        }
        else {
            c1.n(result);
            final MessagesApi messagesApi = this.messagesApiProvider.getMessagesApi(this.context);
            ((MessagesRemoteDataSource$deleteMessage.MessagesRemoteDataSource$deleteMessage$1)o).L$0 = l$0;
            ((MessagesRemoteDataSource$deleteMessage.MessagesRemoteDataSource$deleteMessage$1)o).label = 1;
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
    public Object getMessageDetails(@e final String s, @e final d<? super Message> d) {
        return this.messagesApiProvider.getMessagesApi(this.context).getMessageDetails(s, d);
    }
    
    @f
    @Override
    public Object getMessages(@e final d<? super Map<String, ? extends List<Message>>> d) {
        MessagesRemoteDataSource$getMessages.MessagesRemoteDataSource$getMessages$1 messagesRemoteDataSource$getMessages$1 = null;
        Label_0045: {
            if (d instanceof MessagesRemoteDataSource$getMessages.MessagesRemoteDataSource$getMessages$1) {
                messagesRemoteDataSource$getMessages$1 = (MessagesRemoteDataSource$getMessages.MessagesRemoteDataSource$getMessages$1)d;
                final int label = messagesRemoteDataSource$getMessages$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    messagesRemoteDataSource$getMessages$1.label = label + Integer.MIN_VALUE;
                    break Label_0045;
                }
            }
            messagesRemoteDataSource$getMessages$1 = new MessagesRemoteDataSource$getMessages.MessagesRemoteDataSource$getMessages$1(this, (d)d);
        }
        Object o = messagesRemoteDataSource$getMessages$1.result;
        final Object h = b.h();
        final int label2 = messagesRemoteDataSource$getMessages$1.label;
        final int n = 1;
        int i$0 = 0;
        s0[] array = null;
        s0[] array2 = null;
        String s2 = null;
        Label_0356: {
            int i$2;
            String s3;
            s0[] array3;
            MessagesRemoteDataSource messagesRemoteDataSource;
            if (label2 != 0) {
                if (label2 != 1) {
                    if (label2 == 2) {
                        i$0 = messagesRemoteDataSource$getMessages$1.I$0;
                        final String s = (String)messagesRemoteDataSource$getMessages$1.L$2;
                        array = (s0[])messagesRemoteDataSource$getMessages$1.L$1;
                        array2 = (s0[])messagesRemoteDataSource$getMessages$1.L$0;
                        c1.n(o);
                        s2 = s;
                        break Label_0356;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    i$2 = messagesRemoteDataSource$getMessages$1.I$0;
                    s3 = (String)messagesRemoteDataSource$getMessages$1.L$3;
                    array3 = (s0[])messagesRemoteDataSource$getMessages$1.L$2;
                    array2 = (s0[])messagesRemoteDataSource$getMessages$1.L$1;
                    messagesRemoteDataSource = (MessagesRemoteDataSource)messagesRemoteDataSource$getMessages$1.L$0;
                    c1.n(o);
                }
            }
            else {
                c1.n(o);
                array2 = new s0[2];
                i$2 = 0;
                s3 = "incoming_messages";
                final MessagesApi messagesApi = this.messagesApiProvider.getMessagesApi(this.context);
                messagesRemoteDataSource$getMessages$1.L$0 = this;
                messagesRemoteDataSource$getMessages$1.L$1 = array2;
                messagesRemoteDataSource$getMessages$1.L$2 = array2;
                messagesRemoteDataSource$getMessages$1.L$3 = "incoming_messages";
                messagesRemoteDataSource$getMessages$1.I$0 = 0;
                messagesRemoteDataSource$getMessages$1.label = 1;
                o = messagesApi.getAllMessages((d<? super IncomingMessagesResponse>)messagesRemoteDataSource$getMessages$1);
                if (o == h) {
                    return h;
                }
                messagesRemoteDataSource = this;
                array3 = array2;
            }
            array3[i$2] = n1.a(s3, ((IncomingMessagesResponse)o).getIncomeMessages());
            final MessagesApi messagesApi2 = messagesRemoteDataSource.messagesApiProvider.getMessagesApi(messagesRemoteDataSource.context);
            messagesRemoteDataSource$getMessages$1.L$0 = array2;
            messagesRemoteDataSource$getMessages$1.L$1 = array2;
            messagesRemoteDataSource$getMessages$1.L$2 = "read_confirmation_messages";
            messagesRemoteDataSource$getMessages$1.L$3 = null;
            messagesRemoteDataSource$getMessages$1.I$0 = 1;
            messagesRemoteDataSource$getMessages$1.label = 2;
            o = messagesApi2.getAllMessages((d<? super IncomingMessagesResponse>)messagesRemoteDataSource$getMessages$1);
            if (o == h) {
                return h;
            }
            s2 = "read_confirmation_messages";
            array = array2;
            i$0 = n;
        }
        array[i$0] = n1.a(s2, ((IncomingMessagesResponse)o).getReadConfirmationMessages());
        return y0.W((s0<?, ?>[])array2);
    }
    
    @f
    @Override
    public Object getUnreadMessagesCount(@e final d<? super Integer> d) {
        Object o = null;
        Label_0047: {
            if (d instanceof MessagesRemoteDataSource$getUnreadMessagesCount.MessagesRemoteDataSource$getUnreadMessagesCount$1) {
                final MessagesRemoteDataSource$getUnreadMessagesCount.MessagesRemoteDataSource$getUnreadMessagesCount$1 messagesRemoteDataSource$getUnreadMessagesCount$1 = (MessagesRemoteDataSource$getUnreadMessagesCount.MessagesRemoteDataSource$getUnreadMessagesCount$1)d;
                final int label = messagesRemoteDataSource$getUnreadMessagesCount$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    messagesRemoteDataSource$getUnreadMessagesCount$1.label = label + Integer.MIN_VALUE;
                    o = messagesRemoteDataSource$getUnreadMessagesCount$1;
                    break Label_0047;
                }
            }
            o = new MessagesRemoteDataSource$getUnreadMessagesCount.MessagesRemoteDataSource$getUnreadMessagesCount$1(this, (d)d);
        }
        final Object result = ((MessagesRemoteDataSource$getUnreadMessagesCount.MessagesRemoteDataSource$getUnreadMessagesCount$1)o).result;
        final Object h = b.h();
        final int label2 = ((MessagesRemoteDataSource$getUnreadMessagesCount.MessagesRemoteDataSource$getUnreadMessagesCount$1)o).label;
        Object unreadMessagesCount;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1.n(result);
            unreadMessagesCount = result;
        }
        else {
            c1.n(result);
            final MessagesApi messagesApi = this.messagesApiProvider.getMessagesApi(this.context);
            ((MessagesRemoteDataSource$getUnreadMessagesCount.MessagesRemoteDataSource$getUnreadMessagesCount$1)o).label = 1;
            if ((unreadMessagesCount = messagesApi.getUnreadMessagesCount((d<? super UnreadMessagesCountResponse>)o)) == h) {
                return h;
            }
        }
        return kotlin.coroutines.jvm.internal.b.f(((UnreadMessagesCountResponse)unreadMessagesCount).getUnreadMessagesCount());
    }
}
