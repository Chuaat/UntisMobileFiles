// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.websocket;

import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\f¨\u0006\u0012" }, d2 = { "Lcom/untis/mobile/api/websocket/WsEvent;", "", "Lcom/untis/mobile/api/websocket/WsTopic;", "getWsTopic", "Lcom/untis/mobile/api/websocket/WsEventType;", "getWsEventType", "", "type", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "topic", "getTopic", "setTopic", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class WsEvent
{
    @e
    private String topic;
    @e
    private String type;
    
    public WsEvent() {
        this(null, null, 3, null);
    }
    
    public WsEvent(@e final String topic, @e final String type) {
        k0.p(topic, "topic");
        k0.p(type, "type");
        this.topic = topic;
        this.type = type;
    }
    
    @e
    public final String getTopic() {
        return this.topic;
    }
    
    @e
    public final String getType() {
        return this.type;
    }
    
    @f
    public final WsEventType getWsEventType() {
        return WsEventType.Companion.findBy(this.type);
    }
    
    @f
    public final WsTopic getWsTopic() {
        return WsTopic.Companion.findBy(this.topic);
    }
    
    public final void setTopic(@e final String topic) {
        k0.p(topic, "<set-?>");
        this.topic = topic;
    }
    
    public final void setType(@e final String type) {
        k0.p(type, "<set-?>");
        this.type = type;
    }
}
