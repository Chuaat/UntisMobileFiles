// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.data.repository.inbox;

import java.util.List;
import java.util.Map;
import com.untis.mobile.messages.data.model.Message;
import n6.q;
import java.io.OutputStream;
import n6.l;
import org.jetbrains.annotations.f;
import kotlin.coroutines.d;
import kotlin.j2;
import com.untis.mobile.messages.data.model.MessageRequestConfirmation;
import n6.p;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J%\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\bH¦@\u00f8\u0001\u0000¢\u0006\u0004\b\t\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0003H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJp\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00032K\u0010\u0019\u001aG\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00180\u0010H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJU\u0010!\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u000328\u0010 \u001a4\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u001d\u0012\u0015\u0012\u0013\u0018\u00010\u001e¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00180\u001cH¦@\u00f8\u0001\u0000¢\u0006\u0004\b!\u0010\"J>\u0010%\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u00032!\u0010 \u001a\u001d\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00180#H¦@\u00f8\u0001\u0000¢\u0006\u0004\b%\u0010&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'" }, d2 = { "Lcom/untis/mobile/messages/data/repository/inbox/MessagesRepository;", "", "", "", "", "Lcom/untis/mobile/messages/data/model/Message;", "getMessages", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "getUnreadMessagesCount", "id", "getMessageDetails", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Ljava/io/OutputStream;", "attachmentFileOutputStream", "messageId", "Lkotlin/Function3;", "", "Lkotlin/t0;", "name", "bytesRead", "contentLength", "", "isDone", "Lkotlin/j2;", "downloadProgress", "downloadMessageBlobAttachment", "(Ljava/io/OutputStream;Ljava/lang/String;Ln6/q;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Function2;", "isReadConfirmedSuccessfully", "Lcom/untis/mobile/messages/data/model/MessageRequestConfirmation;", "confirmationResponse", "callback", "confirmReadMessage", "(Ljava/lang/String;Ln6/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Function1;", "isMessageDeletedSuccessfully", "deleteMessage", "(Ljava/lang/String;Ln6/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public interface MessagesRepository
{
    @f
    Object confirmReadMessage(@e final String p0, @e final p<? super Boolean, ? super MessageRequestConfirmation, j2> p1, @e final d<? super j2> p2) throws Throwable;
    
    @f
    Object deleteMessage(@e final String p0, @e final l<? super Boolean, j2> p1, @e final d<? super j2> p2) throws Throwable;
    
    @f
    Object downloadMessageBlobAttachment(@e final OutputStream p0, @e final String p1, @e final q<? super Long, ? super Long, ? super Boolean, j2> p2, @e final d<? super j2> p3);
    
    @f
    Object getMessageDetails(@e final String p0, @e final d<? super Message> p1) throws Throwable;
    
    @f
    Object getMessages(@e final d<? super Map<String, ? extends List<Message>>> p0) throws Throwable;
    
    @f
    Object getUnreadMessagesCount(@e final d<? super Integer> p0);
}
