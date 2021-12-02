// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.data.model.extension;

import java.util.Set;
import com.untis.mobile.messages.ui.send.RecipientsTypes;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import com.untis.mobile.messages.data.model.Recipient;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003" }, d2 = { "Lcom/untis/mobile/messages/data/model/Recipient;", "", "getPeopleCount", "untismobile_5.1.0_release" }, k = 2, mv = { 1, 5, 1 })
public final class RecipientExtKt
{
    public static final int getPeopleCount(@e final Recipient recipient) {
        k0.p(recipient, "<this>");
        int size;
        if (recipient.getType() == RecipientsTypes.GROUP) {
            final Set<Recipient> groupRecipients = recipient.getGroupRecipients();
            if (groupRecipients == null) {
                size = 0;
            }
            else {
                size = groupRecipients.size();
            }
        }
        else {
            size = 1;
        }
        return size;
    }
}
