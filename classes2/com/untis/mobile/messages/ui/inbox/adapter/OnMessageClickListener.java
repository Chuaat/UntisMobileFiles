// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.ui.inbox.adapter;

import org.jetbrains.annotations.e;
import com.untis.mobile.messages.data.model.Message;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H&¨\u0006\n" }, d2 = { "Lcom/untis/mobile/messages/ui/inbox/adapter/OnMessageClickListener;", "", "Lcom/untis/mobile/messages/data/model/Message;", "message", "", "position", "", "type", "Lkotlin/j2;", "onMessageClick", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public interface OnMessageClickListener
{
    void onMessageClick(@e final Message p0, final int p1, @e final String p2);
    
    @Metadata(bv = { 1, 0, 3 }, d1 = {}, d2 = {}, k = 3, mv = { 1, 5, 1 })
    public static final class DefaultImpls
    {
    }
}
