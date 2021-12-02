// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.messenger;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006¨\u0006\r" }, d2 = { "Lcom/untis/mobile/persistence/models/messenger/MessengerChannelCandidate;", "", "", "channelId", "Ljava/lang/String;", "getChannelId", "()Ljava/lang/String;", "subtitle", "getSubtitle", "title", "getTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class MessengerChannelCandidate
{
    @e
    private final String channelId;
    @e
    private final String subtitle;
    @e
    private final String title;
    
    public MessengerChannelCandidate(@e final String title, @e final String subtitle, @e final String channelId) {
        k0.p(title, "title");
        k0.p(subtitle, "subtitle");
        k0.p(channelId, "channelId");
        this.title = title;
        this.subtitle = subtitle;
        this.channelId = channelId;
    }
    
    @e
    public final String getChannelId() {
        return this.channelId;
    }
    
    @e
    public final String getSubtitle() {
        return this.subtitle;
    }
    
    @e
    public final String getTitle() {
        return this.title;
    }
}
