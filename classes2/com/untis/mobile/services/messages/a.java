// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.services.messages;

import org.jetbrains.annotations.e;
import com.untis.mobile.persistence.models.MessageOfDay;
import java.util.List;
import rx.g;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H&J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H&¨\u0006\f" }, d2 = { "Lcom/untis/mobile/services/messages/a;", "", "Lrx/g;", "", "Lcom/untis/mobile/persistence/models/MessageOfDay;", "k", "", "unreadOnly", "l", "messageOfDay", "Lkotlin/j2;", "m", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public interface a
{
    @e
    g<List<MessageOfDay>> k();
    
    @e
    List<MessageOfDay> l(final boolean p0);
    
    void m(@e final MessageOfDay p0);
    
    @Metadata(bv = { 1, 0, 3 }, d1 = {}, d2 = {}, k = 3, mv = { 1, 5, 1 })
    public static final class a
    {
    }
}
