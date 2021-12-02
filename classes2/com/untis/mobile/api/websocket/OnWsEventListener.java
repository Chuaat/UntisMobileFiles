// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.websocket;

import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\t" }, d2 = { "Lcom/untis/mobile/api/websocket/OnWsEventListener;", "", "Lcom/untis/mobile/api/websocket/WsEvent;", "wsEvent", "Lkotlin/j2;", "onWsEvent", "", "code", "onClosingWs", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public interface OnWsEventListener
{
    void onClosingWs(final int p0);
    
    void onWsEvent(@e final WsEvent p0);
}
