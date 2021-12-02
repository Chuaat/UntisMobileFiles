// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.websocket;

import java.util.List;
import kotlin.collections.v;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u0013B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0014" }, d2 = { "Lcom/untis/mobile/api/websocket/WsSubscription;", "", "", "action", "Ljava/lang/String;", "getAction", "()Ljava/lang/String;", "setAction", "(Ljava/lang/String;)V", "Lcom/untis/mobile/api/websocket/WsSubscription$WsSubscriptionData;", "data", "Lcom/untis/mobile/api/websocket/WsSubscription$WsSubscriptionData;", "getData", "()Lcom/untis/mobile/api/websocket/WsSubscription$WsSubscriptionData;", "setData", "(Lcom/untis/mobile/api/websocket/WsSubscription$WsSubscriptionData;)V", "<init>", "(Ljava/lang/String;Lcom/untis/mobile/api/websocket/WsSubscription$WsSubscriptionData;)V", "Companion", "WsSubscriptionData", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class WsSubscription
{
    @e
    public static final Companion Companion;
    @e
    private String action;
    @e
    private WsSubscriptionData data;
    
    static {
        Companion = new Companion(null);
    }
    
    public WsSubscription(@e final String action, @e final WsSubscriptionData data) {
        k0.p(action, "action");
        k0.p(data, "data");
        this.action = action;
        this.data = data;
    }
    
    @e
    public final String getAction() {
        return this.action;
    }
    
    @e
    public final WsSubscriptionData getData() {
        return this.data;
    }
    
    public final void setAction(@e final String action) {
        k0.p(action, "<set-?>");
        this.action = action;
    }
    
    public final void setData(@e final WsSubscriptionData data) {
        k0.p(data, "<set-?>");
        this.data = data;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\t" }, d2 = { "Lcom/untis/mobile/api/websocket/WsSubscription$Companion;", "", "Lcom/untis/mobile/api/websocket/WsTopic;", "wsTopic", "Lcom/untis/mobile/api/websocket/WsSubscription;", "subscribe", "unsubscribe", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class Companion
    {
        private Companion() {
        }
        
        @e
        public final WsSubscription subscribe(@e final WsTopic wsTopic) {
            k0.p(wsTopic, "wsTopic");
            return new WsSubscription("subscribe", new WsSubscriptionData(v.k(wsTopic.getCode())));
        }
        
        @e
        public final WsSubscription unsubscribe(@e final WsTopic wsTopic) {
            k0.p(wsTopic, "wsTopic");
            return new WsSubscription("unsubscribe", new WsSubscriptionData(v.k(wsTopic.getCode())));
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\n\u0010\tR(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000b" }, d2 = { "Lcom/untis/mobile/api/websocket/WsSubscription$WsSubscriptionData;", "", "", "", "topics", "Ljava/util/List;", "getTopics", "()Ljava/util/List;", "setTopics", "(Ljava/util/List;)V", "<init>", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class WsSubscriptionData
    {
        @e
        private List<String> topics;
        
        public WsSubscriptionData(@e final List<String> topics) {
            k0.p(topics, "topics");
            this.topics = topics;
        }
        
        @e
        public final List<String> getTopics() {
            return this.topics;
        }
        
        public final void setTopics(@e final List<String> topics) {
            k0.p(topics, "<set-?>");
            this.topics = topics;
        }
    }
}
