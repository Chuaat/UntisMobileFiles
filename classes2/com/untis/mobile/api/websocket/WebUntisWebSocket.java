// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.websocket;

import java.util.HashSet;
import okhttp3.e0$a;
import okio.p;
import java.io.EOFException;
import okhttp3.g0;
import java.util.Iterator;
import java.util.HashMap;
import timber.log.b;
import java.util.EnumMap;
import kotlin.jvm.internal.w;
import okhttp3.k0;
import org.jetbrains.annotations.f;
import com.untis.mobile.persistence.models.profile.Profile;
import okhttp3.c0;
import java.util.Set;
import java.util.Map;
import com.google.gson.Gson;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import okhttp3.l0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0017\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b*\u0010+J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J \u0010\u001a\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0015H\u0016J\"\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016R(\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u001f0\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010%R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010)¨\u0006-" }, d2 = { "Lcom/untis/mobile/api/websocket/WebUntisWebSocket;", "Lokhttp3/l0;", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Lkotlin/j2;", "start", "stop", "Lcom/untis/mobile/api/websocket/WsTopic;", "topic", "Lcom/untis/mobile/api/websocket/OnWsEventListener;", "listener", "subscribe", "unsubscribe", "Lokhttp3/k0;", "webSocket", "Lokhttp3/g0;", "response", "onOpen", "Lokio/p;", "bytes", "onMessage", "", "text", "", "code", "reason", "onClosing", "", "t", "onFailure", "", "", "listeners", "Ljava/util/Map;", "Lcom/google/gson/Gson;", "gson", "Lcom/google/gson/Gson;", "Lokhttp3/k0;", "Lokhttp3/c0;", "okHttpClient", "Lokhttp3/c0;", "Lcom/untis/mobile/persistence/models/profile/Profile;", "<init>", "(Lokhttp3/c0;Lcom/google/gson/Gson;)V", "Companion", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class WebUntisWebSocket extends l0
{
    public static final int CLOSE_STATUS_AFK = 1001;
    public static final int CLOSE_STATUS_NORMAL = 1000;
    public static final int CLOSE_STATUS_PROTOCOL_ERROR = 1002;
    @e
    public static final Companion Companion;
    @e
    private final Gson gson;
    @e
    private final Map<WsTopic, Set<OnWsEventListener>> listeners;
    @e
    private final c0 okHttpClient;
    @f
    private Profile profile;
    @f
    private k0 webSocket;
    
    static {
        Companion = new Companion(null);
    }
    
    public WebUntisWebSocket(@e final c0 okHttpClient, @e final Gson gson) {
        kotlin.jvm.internal.k0.p(okHttpClient, "okHttpClient");
        kotlin.jvm.internal.k0.p(gson, "gson");
        this.okHttpClient = okHttpClient;
        this.gson = gson;
        this.listeners = new EnumMap<WsTopic, Set<OnWsEventListener>>(WsTopic.class);
    }
    
    public void onClosing(@e final k0 k0, final int i, @e final String str) {
        kotlin.jvm.internal.k0.p(k0, "webSocket");
        kotlin.jvm.internal.k0.p(str, "reason");
        final StringBuilder sb = new StringBuilder();
        sb.append("onClosing with code: ");
        sb.append(i);
        sb.append(" and reason: ");
        sb.append(str);
        b.b(sb.toString(), new Object[0]);
        final HashMap<WsTopic, Set<OnWsEventListener>> hashMap = new HashMap<WsTopic, Set<OnWsEventListener>>(this.listeners);
        this.profile = null;
        this.webSocket = null;
        this.listeners.clear();
        final Set<WsTopic> keySet = hashMap.keySet();
        kotlin.jvm.internal.k0.o(keySet, "listeners.keys");
        final Iterator<Object> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            final Set<OnWsEventListener> set = hashMap.get(iterator.next());
            if (set == null) {
                continue;
            }
            final Iterator<Object> iterator2 = set.iterator();
            while (iterator2.hasNext()) {
                iterator2.next().onClosingWs(i);
            }
        }
    }
    
    public void onFailure(@e final k0 k0, @e final Throwable t, @f final g0 g0) {
        kotlin.jvm.internal.k0.p(k0, "webSocket");
        kotlin.jvm.internal.k0.p(t, "t");
        b.g(t, kotlin.jvm.internal.k0.C("onFailure with response: ", g0), new Object[0]);
        final boolean b = t instanceof EOFException;
        int n;
        String s;
        if (!b && !b) {
            n = 1002;
            s = "ungraceful failure";
        }
        else {
            n = 1001;
            s = "ungraceful disconnect";
        }
        this.onClosing(k0, n, s);
    }
    
    public void onMessage(@e final k0 k0, @e final String s) {
        kotlin.jvm.internal.k0.p(k0, "webSocket");
        kotlin.jvm.internal.k0.p(s, "text");
        b.b(kotlin.jvm.internal.k0.C("onMessage with text: ", s), new Object[0]);
        final WsEvent wsEvent = this.gson.fromJson(s, WsEvent.class);
        final Set<OnWsEventListener> set = this.listeners.get(wsEvent.getWsTopic());
        if (set != null) {
            for (final OnWsEventListener onWsEventListener : set) {
                kotlin.jvm.internal.k0.o(wsEvent, "wsEvent");
                onWsEventListener.onWsEvent(wsEvent);
            }
        }
    }
    
    public void onMessage(@e final k0 k0, @e final p p2) {
        kotlin.jvm.internal.k0.p(k0, "webSocket");
        kotlin.jvm.internal.k0.p(p2, "bytes");
        b.b("onMessage with bytes", new Object[0]);
    }
    
    public void onOpen(@e final k0 k0, @e final g0 g0) {
        kotlin.jvm.internal.k0.p(k0, "webSocket");
        kotlin.jvm.internal.k0.p(g0, "response");
        b.b(kotlin.jvm.internal.k0.C("onOpen with response: ", g0), new Object[0]);
    }
    
    public final void start(@e final Profile profile) {
        kotlin.jvm.internal.k0.p(profile, "profile");
        b.b("start", new Object[0]);
        this.profile = profile;
        if (this.webSocket != null) {
            return;
        }
        this.webSocket = this.okHttpClient.b(new e0$a().B(profile.getWssUrl()).n("Authorization", kotlin.jvm.internal.k0.C("Bearer ", profile.getAuthenticationToken())).b(), (l0)this);
    }
    
    public final void stop() {
        b.b("stop", new Object[0]);
        this.listeners.clear();
        final k0 webSocket = this.webSocket;
        if (webSocket != null) {
            webSocket.close(1000, "normal closure, purpose fulfilled");
        }
        this.webSocket = null;
        this.profile = null;
    }
    
    public final void subscribe(@e final WsTopic wsTopic, @e final OnWsEventListener onWsEventListener) {
        kotlin.jvm.internal.k0.p(wsTopic, "topic");
        kotlin.jvm.internal.k0.p(onWsEventListener, "listener");
        b.b("subscribe", new Object[0]);
        Set<OnWsEventListener> set;
        if ((set = this.listeners.get(wsTopic)) == null) {
            final k0 webSocket = this.webSocket;
            if (webSocket != null) {
                WebSocketExtensionKt.subscribe(webSocket, this.gson, wsTopic);
            }
            set = new HashSet<OnWsEventListener>();
            this.listeners.put(wsTopic, set);
        }
        set.add(onWsEventListener);
    }
    
    public final void unsubscribe(@e final WsTopic wsTopic) {
        kotlin.jvm.internal.k0.p(wsTopic, "topic");
        b.b("unsubscribe", new Object[0]);
        this.listeners.remove(wsTopic);
        final k0 webSocket = this.webSocket;
        if (webSocket != null) {
            WebSocketExtensionKt.unsubscribe(webSocket, this.gson, wsTopic);
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t" }, d2 = { "Lcom/untis/mobile/api/websocket/WebUntisWebSocket$Companion;", "", "", "CLOSE_STATUS_AFK", "I", "CLOSE_STATUS_NORMAL", "CLOSE_STATUS_PROTOCOL_ERROR", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class Companion
    {
        private Companion() {
        }
    }
}
