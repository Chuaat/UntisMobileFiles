// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models;

import kotlin.text.s;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0004" }, d2 = { "Lcom/untis/mobile/persistence/models/MessageOfDay;", "", "getEscapedSubject", "getEscapedText", "untismobile_5.1.0_release" }, k = 2, mv = { 1, 5, 1 })
public final class MessageOfDayKt
{
    @e
    public static final String getEscapedSubject(@e final MessageOfDay messageOfDay) {
        k0.p(messageOfDay, "<this>");
        return s.k2(messageOfDay.getSubject(), "#", "%23", false, 4, (Object)null);
    }
    
    @e
    public static final String getEscapedText(@e final MessageOfDay messageOfDay) {
        k0.p(messageOfDay, "<this>");
        return s.k2(messageOfDay.getText(), "#", "%23", false, 4, (Object)null);
    }
}
