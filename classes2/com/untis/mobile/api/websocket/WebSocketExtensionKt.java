// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.websocket;

import com.google.gson.Gson;
import org.jetbrains.annotations.e;
import okhttp3.k0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001a\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u001a\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¨\u0006\b" }, d2 = { "Lokhttp3/k0;", "Lcom/google/gson/Gson;", "gson", "Lcom/untis/mobile/api/websocket/WsTopic;", "subscriptionEventTopic", "", "subscribe", "unsubscribe", "untismobile_5.1.0_release" }, k = 2, mv = { 1, 5, 1 })
public final class WebSocketExtensionKt
{
    public static final boolean subscribe(@e final k0 k0, @e final Gson gson, @e final WsTopic wsTopic) {
        kotlin.jvm.internal.k0.p(k0, "<this>");
        kotlin.jvm.internal.k0.p(gson, "gson");
        kotlin.jvm.internal.k0.p(wsTopic, "subscriptionEventTopic");
        final String json = gson.toJson(WsSubscription.Companion.subscribe(wsTopic));
        kotlin.jvm.internal.k0.o(json, "gson.toJson(WsSubscription.subscribe(subscriptionEventTopic))");
        return k0.b(json);
    }
    
    public static final boolean unsubscribe(@e final k0 k0, @e final Gson gson, @e final WsTopic wsTopic) {
        kotlin.jvm.internal.k0.p(k0, "<this>");
        kotlin.jvm.internal.k0.p(gson, "gson");
        kotlin.jvm.internal.k0.p(wsTopic, "subscriptionEventTopic");
        final String json = gson.toJson(WsSubscription.Companion.unsubscribe(wsTopic));
        kotlin.jvm.internal.k0.o(json, "gson.toJson(WsSubscription.unsubscribe(subscriptionEventTopic))");
        return k0.b(json);
    }
}
