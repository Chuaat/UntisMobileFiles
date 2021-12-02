// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\u000e" }, d2 = { "Lcom/untis/mobile/api/AppInfo;", "", "", "api", "Ljava/lang/String;", "getApi", "()Ljava/lang/String;", "setApi", "(Ljava/lang/String;)V", "webuntis", "getWebuntis", "setWebuntis", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class AppInfo
{
    @e
    private String api;
    @e
    private String webuntis;
    
    public AppInfo(@e final String webuntis, @e final String api) {
        k0.p(webuntis, "webuntis");
        k0.p(api, "api");
        this.webuntis = webuntis;
        this.api = api;
    }
    
    @e
    public final String getApi() {
        return this.api;
    }
    
    @e
    public final String getWebuntis() {
        return this.webuntis;
    }
    
    public final void setApi(@e final String api) {
        k0.p(api, "<set-?>");
        this.api = api;
    }
    
    public final void setWebuntis(@e final String webuntis) {
        k0.p(webuntis, "<set-?>");
        this.webuntis = webuntis;
    }
}
