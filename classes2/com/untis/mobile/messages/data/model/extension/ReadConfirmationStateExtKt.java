// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messages.data.model.extension;

import org.joda.time.base.a;
import org.jetbrains.annotations.f;
import org.joda.time.c;
import com.untis.mobile.utils.extension.h;
import kotlin.jvm.internal.k0;
import android.text.Spannable;
import org.jetbrains.annotations.e;
import com.untis.mobile.messages.data.model.ReadConfirmationState;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0005" }, d2 = { "Lcom/untis/mobile/messages/data/model/ReadConfirmationState;", "", "spanColor", "Landroid/text/Spannable;", "getConfirmationFormattedDate", "untismobile_5.1.0_release" }, k = 2, mv = { 1, 5, 1 })
public final class ReadConfirmationStateExtKt
{
    @f
    public static final Spannable getConfirmationFormattedDate(@e final ReadConfirmationState readConfirmationState, final int n) {
        k0.p(readConfirmationState, "<this>");
        final c date = readConfirmationState.getDate();
        Spannable n2 = null;
        if (date != null) {
            final String g4 = ((a)date).g4("dd.MM.yy | HH:mm");
            if (g4 != null) {
                n2 = h.N(g4, "|", n);
            }
        }
        return n2;
    }
}
