// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.messenger;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n" }, d2 = { "Lcom/untis/mobile/persistence/models/messenger/MessengerChannel;", "", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "<init>", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class MessengerChannel
{
    @e
    private String id;
    
    public MessengerChannel(@e final String id) {
        k0.p(id, "id");
        this.id = id;
    }
    
    @e
    public final String getId() {
        return this.id;
    }
    
    public final void setId(@e final String id) {
        k0.p(id, "<set-?>");
        this.id = id;
    }
}
