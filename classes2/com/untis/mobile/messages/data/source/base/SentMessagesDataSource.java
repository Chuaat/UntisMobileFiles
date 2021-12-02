// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.data.source.base;

import java.util.List;
import com.untis.mobile.messages.data.model.Message;
import com.untis.mobile.messages.data.model.ReadConfirmationStatus;
import java.util.ArrayList;
import org.jetbrains.annotations.f;
import kotlin.coroutines.d;
import kotlin.j2;
import n6.l;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ+\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f2\u0006\u0010\u0007\u001a\u00020\u0006H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\r\u0010\tJ>\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00062!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\u000eH¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J>\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00062!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00130\u000eH¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019" }, d2 = { "Lcom/untis/mobile/messages/data/source/base/SentMessagesDataSource;", "", "", "Lcom/untis/mobile/messages/data/model/Message;", "getSentMessages", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "id", "getSentMessageDetails", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Ljava/util/ArrayList;", "Lcom/untis/mobile/messages/data/model/ReadConfirmationStatus;", "Lkotlin/collections/ArrayList;", "getReadConfirmationStatus", "Lkotlin/Function1;", "", "Lkotlin/t0;", "name", "isMessageDeletedSuccessfully", "Lkotlin/j2;", "callback", "deleteMessage", "(Ljava/lang/String;Ln6/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "isMessageRevokedSuccessfully", "revokeMessage", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public interface SentMessagesDataSource
{
    @f
    Object deleteMessage(@e final String p0, @e final l<? super Boolean, j2> p1, @e final d<? super j2> p2);
    
    @f
    Object getReadConfirmationStatus(@e final String p0, @e final d<? super ArrayList<ReadConfirmationStatus>> p1);
    
    @f
    Object getSentMessageDetails(@e final String p0, @e final d<? super Message> p1);
    
    @f
    Object getSentMessages(@e final d<? super List<Message>> p0);
    
    @f
    Object revokeMessage(@e final String p0, @e final l<? super Boolean, j2> p1, @e final d<? super j2> p2);
}
