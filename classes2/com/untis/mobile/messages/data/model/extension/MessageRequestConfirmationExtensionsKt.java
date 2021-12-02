// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.data.model.extension;

import org.joda.time.base.a;
import org.jetbrains.annotations.f;
import org.joda.time.c;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import com.untis.mobile.messages.data.model.MessageRequestConfirmation;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¨\u0006\u0003" }, d2 = { "Lcom/untis/mobile/messages/data/model/MessageRequestConfirmation;", "", "getFormattedConfirmDate", "untismobile_5.1.0_release" }, k = 2, mv = { 1, 5, 1 })
public final class MessageRequestConfirmationExtensionsKt
{
    @f
    public static final String getFormattedConfirmDate(@e final MessageRequestConfirmation messageRequestConfirmation) {
        k0.p(messageRequestConfirmation, "<this>");
        final c confirmationDate = messageRequestConfirmation.getConfirmationDate();
        String g4;
        if (confirmationDate == null) {
            g4 = null;
        }
        else {
            g4 = ((a)confirmationDate).g4("dd.MM.yyyy");
        }
        return g4;
    }
}
