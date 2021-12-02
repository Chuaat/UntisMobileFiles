// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.data.source.remote.send;

import com.untis.mobile.messages.data.model.response.SendMessageResponse;
import com.untis.mobile.messages.data.model.request.SendMessageBody;
import retrofit2.t;
import kotlin.j2;
import n6.l;
import com.untis.mobile.messages.data.model.request.MessageReplyRequestBody;
import org.jetbrains.annotations.f;
import java.util.Iterator;
import com.untis.mobile.messages.api.SendMessageApi;
import kotlin.s0;
import kotlin.n1;
import com.untis.mobile.messages.ui.send.RecipientsTypes;
import com.untis.mobile.messages.data.model.Recipient;
import java.util.ArrayList;
import com.untis.mobile.messages.data.model.Section;
import com.untis.mobile.messages.data.model.response.RecipientSectionsResponse;
import kotlin.collections.y0;
import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import com.untis.mobile.messages.data.model.Group;
import java.util.List;
import com.untis.mobile.messages.util.RecipientSectionTypes;
import java.util.Map;
import kotlin.coroutines.d;
import com.untis.mobile.messages.util.SendMessageTypes;
import kotlin.jvm.internal.k0;
import com.untis.mobile.messages.api.MessagesApiProvider;
import org.jetbrains.annotations.e;
import android.content.Context;
import kotlin.Metadata;
import com.untis.mobile.messages.data.source.base.SendMessageDataSource;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b&\u0010'J/\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013JF\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00152!\u0010\u001d\u001a\u001d\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u001c0\u0017H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006(" }, d2 = { "Lcom/untis/mobile/messages/data/source/remote/send/SendMessageRemoteDataSource;", "Lcom/untis/mobile/messages/data/source/base/SendMessageDataSource;", "Lcom/untis/mobile/messages/util/SendMessageTypes;", "type", "", "Lcom/untis/mobile/messages/util/RecipientSectionTypes;", "", "Lcom/untis/mobile/messages/data/model/Group;", "getRecipientGroups", "(Lcom/untis/mobile/messages/util/SendMessageTypes;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/messages/data/model/request/SendMessageBody;", "sendMessageBody", "Lcom/untis/mobile/messages/data/model/response/SendMessageResponse;", "sendMessage", "(Lcom/untis/mobile/messages/data/model/request/SendMessageBody;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "query", "Lcom/untis/mobile/messages/data/model/Recipient;", "recipientsSearch", "(Lcom/untis/mobile/messages/util/SendMessageTypes;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "messageId", "Lcom/untis/mobile/messages/data/model/request/MessageReplyRequestBody;", "messageReplyRequestBody", "Lkotlin/Function1;", "", "Lkotlin/t0;", "name", "success", "Lkotlin/j2;", "callback", "replyMessage", "(Ljava/lang/String;Lcom/untis/mobile/messages/data/model/request/MessageReplyRequestBody;Ln6/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/messages/api/MessagesApiProvider;", "messagesApiProvider", "Lcom/untis/mobile/messages/api/MessagesApiProvider;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;Lcom/untis/mobile/messages/api/MessagesApiProvider;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class SendMessageRemoteDataSource implements SendMessageDataSource
{
    @e
    private final Context context;
    @e
    private final MessagesApiProvider messagesApiProvider;
    
    public SendMessageRemoteDataSource(@e final Context context, @e final MessagesApiProvider messagesApiProvider) {
        k0.p(context, "context");
        k0.p(messagesApiProvider, "messagesApiProvider");
        this.context = context;
        this.messagesApiProvider = messagesApiProvider;
    }
    
    @f
    @Override
    public Object getRecipientGroups(@e final SendMessageTypes sendMessageTypes, @e final d<? super Map<RecipientSectionTypes, ? extends List<Group>>> d) {
        Object o = null;
        Label_0050: {
            if (d instanceof SendMessageRemoteDataSource$getRecipientGroups.SendMessageRemoteDataSource$getRecipientGroups$1) {
                final SendMessageRemoteDataSource$getRecipientGroups.SendMessageRemoteDataSource$getRecipientGroups$1 sendMessageRemoteDataSource$getRecipientGroups$1 = (SendMessageRemoteDataSource$getRecipientGroups.SendMessageRemoteDataSource$getRecipientGroups$1)d;
                final int label = sendMessageRemoteDataSource$getRecipientGroups$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    sendMessageRemoteDataSource$getRecipientGroups$1.label = label + Integer.MIN_VALUE;
                    o = sendMessageRemoteDataSource$getRecipientGroups$1;
                    break Label_0050;
                }
            }
            o = new SendMessageRemoteDataSource$getRecipientGroups.SendMessageRemoteDataSource$getRecipientGroups$1(this, (d)d);
        }
        final Object result = ((SendMessageRemoteDataSource$getRecipientGroups.SendMessageRemoteDataSource$getRecipientGroups$1)o).result;
        final Object h = b.h();
        final int label2 = ((SendMessageRemoteDataSource$getRecipientGroups.SendMessageRemoteDataSource$getRecipientGroups$1)o).label;
        Object recipients = null;
        Label_0146: {
            if (label2 != 0) {
                if (label2 == 1) {
                    Label_0710: {
                        try {
                            c1.n(result);
                            recipients = result;
                            break Label_0146;
                        }
                        catch (Exception ex) {
                            break Label_0710;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    final Exception ex;
                    timber.log.b.f((Throwable)ex);
                    return y0.z();
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1.n(result);
            final SendMessageApi sendMessageApi = this.messagesApiProvider.getSendMessageApi(this.context);
            final String name = sendMessageTypes.name();
            ((SendMessageRemoteDataSource$getRecipientGroups.SendMessageRemoteDataSource$getRecipientGroups$1)o).label = 1;
            if ((recipients = sendMessageApi.getRecipients(name, (d<? super RecipientSectionsResponse>)o)) == h) {
                return h;
            }
        }
        final RecipientSectionsResponse recipientSectionsResponse = (RecipientSectionsResponse)recipients;
        if (recipientSectionsResponse.getSections().isEmpty() ^ true) {
            final Iterator<Object> iterator = recipientSectionsResponse.getSections().iterator();
            List<Group> list;
            while (true) {
                final boolean hasNext = iterator.hasNext();
                list = null;
                if (!hasNext) {
                    break;
                }
                for (final Group group : iterator.next().getGroups()) {
                    final ArrayList<Recipient> recipients2 = new ArrayList<Recipient>();
                    final ArrayList<Integer> personIds = group.getPersonIds();
                    if (personIds != null) {
                        final Iterator<Number> iterator3 = personIds.iterator();
                    Label_0263:
                        while (iterator3.hasNext()) {
                            final int intValue = iterator3.next().intValue();
                            while (true) {
                                for (final Recipient next : recipientSectionsResponse.getPersons()) {
                                    final Integer id = next.getId();
                                    boolean b = false;
                                    Label_0353: {
                                        if (id != null) {
                                            if (id == intValue) {
                                                b = true;
                                                break Label_0353;
                                            }
                                        }
                                        b = false;
                                    }
                                    if (kotlin.coroutines.jvm.internal.b.a(b)) {
                                        final Recipient e = next;
                                        if (e != null) {
                                            e.setPersonId(e.getId());
                                            e.setType(RecipientsTypes.RECIPIENT);
                                            recipients2.add(e);
                                            continue Label_0263;
                                        }
                                        continue Label_0263;
                                    }
                                }
                                Recipient next = null;
                                continue;
                            }
                        }
                    }
                    group.setRecipients(recipients2);
                }
            }
            final RecipientSectionTypes normal_LESSONS = RecipientSectionTypes.NORMAL_LESSONS;
            while (true) {
                for (final Section next2 : recipientSectionsResponse.getSections()) {
                    if (kotlin.coroutines.jvm.internal.b.a(k0.g(next2.getSectionType(), RecipientSectionTypes.NORMAL_LESSONS.name()))) {
                        final Section section = next2;
                        List<Group> groups;
                        if (section == null) {
                            groups = null;
                        }
                        else {
                            groups = section.getGroups();
                        }
                        final s0<RecipientSectionTypes, List<Group>> a = n1.a(normal_LESSONS, groups);
                        final RecipientSectionTypes substitutions = RecipientSectionTypes.SUBSTITUTIONS;
                        while (true) {
                            for (final Section next3 : recipientSectionsResponse.getSections()) {
                                if (kotlin.coroutines.jvm.internal.b.a(k0.g(next3.getSectionType(), RecipientSectionTypes.SUBSTITUTIONS.name()))) {
                                    final Section section2 = next3;
                                    List<Group> groups2;
                                    if (section2 == null) {
                                        groups2 = null;
                                    }
                                    else {
                                        groups2 = section2.getGroups();
                                    }
                                    final s0<RecipientSectionTypes, List<Group>> a2 = n1.a(substitutions, groups2);
                                    final RecipientSectionTypes classteacher = RecipientSectionTypes.CLASSTEACHER;
                                    while (true) {
                                        for (final Section next4 : recipientSectionsResponse.getSections()) {
                                            if (kotlin.coroutines.jvm.internal.b.a(k0.g(next4.getSectionType(), RecipientSectionTypes.CLASSTEACHER.name()))) {
                                                final Section section3 = next4;
                                                List<Group> groups3;
                                                if (section3 == null) {
                                                    groups3 = list;
                                                }
                                                else {
                                                    groups3 = section3.getGroups();
                                                }
                                                return y0.W(a, a2, n1.a(classteacher, groups3));
                                            }
                                        }
                                        Section next4 = null;
                                        continue;
                                    }
                                }
                            }
                            Section next3 = null;
                            continue;
                        }
                    }
                }
                Section next2 = null;
                continue;
            }
        }
        return y0.z();
    }
    
    @f
    @Override
    public Object recipientsSearch(@e final SendMessageTypes sendMessageTypes, @e final String s, @e final d<? super List<Recipient>> d) {
        return this.messagesApiProvider.getSendMessageApi(this.context).recipientsSearch(sendMessageTypes.name(), s, d);
    }
    
    @f
    @Override
    public Object replyMessage(@e final String s, @e final MessageReplyRequestBody messageReplyRequestBody, @e l<? super Boolean, j2> l$0, @e final d<? super j2> d) {
        Object o = null;
        Label_0059: {
            if (d instanceof SendMessageRemoteDataSource$replyMessage.SendMessageRemoteDataSource$replyMessage$1) {
                final SendMessageRemoteDataSource$replyMessage.SendMessageRemoteDataSource$replyMessage$1 sendMessageRemoteDataSource$replyMessage$1 = (SendMessageRemoteDataSource$replyMessage.SendMessageRemoteDataSource$replyMessage$1)d;
                final int label = sendMessageRemoteDataSource$replyMessage$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    sendMessageRemoteDataSource$replyMessage$1.label = label + Integer.MIN_VALUE;
                    o = sendMessageRemoteDataSource$replyMessage$1;
                    break Label_0059;
                }
            }
            o = new SendMessageRemoteDataSource$replyMessage.SendMessageRemoteDataSource$replyMessage$1(this, (d)d);
        }
        final Object result = ((SendMessageRemoteDataSource$replyMessage.SendMessageRemoteDataSource$replyMessage$1)o).result;
        final Object h = b.h();
        final int label2 = ((SendMessageRemoteDataSource$replyMessage.SendMessageRemoteDataSource$replyMessage$1)o).label;
        Object replyMessage;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l$0 = (l)((SendMessageRemoteDataSource$replyMessage.SendMessageRemoteDataSource$replyMessage$1)o).L$0;
            c1.n(result);
            replyMessage = result;
        }
        else {
            c1.n(result);
            final SendMessageApi sendMessageApi = this.messagesApiProvider.getSendMessageApi(this.context);
            ((SendMessageRemoteDataSource$replyMessage.SendMessageRemoteDataSource$replyMessage$1)o).L$0 = l$0;
            ((SendMessageRemoteDataSource$replyMessage.SendMessageRemoteDataSource$replyMessage$1)o).label = 1;
            if ((replyMessage = sendMessageApi.replyMessage(s, messageReplyRequestBody, (d<? super t<Void>>)o)) == h) {
                return h;
            }
        }
        Boolean b;
        if (((t)replyMessage).g()) {
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
    public Object sendMessage(@e final SendMessageBody sendMessageBody, @e final d<? super SendMessageResponse> d) {
        return this.messagesApiProvider.getSendMessageApi(this.context).sendMessage(sendMessageBody, d);
    }
}
