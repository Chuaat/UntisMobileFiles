// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.messenger;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u0011" }, d2 = { "Lcom/untis/mobile/persistence/models/messenger/MessengerCredential;", "", "", "serverUrl", "Ljava/lang/String;", "getServerUrl", "()Ljava/lang/String;", "setServerUrl", "(Ljava/lang/String;)V", "organizationId", "getOrganizationId", "setOrganizationId", "token", "getToken", "setToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class MessengerCredential
{
    @e
    private String organizationId;
    @e
    private String serverUrl;
    @e
    private String token;
    
    public MessengerCredential(@e final String token, @e final String serverUrl, @e final String organizationId) {
        k0.p(token, "token");
        k0.p(serverUrl, "serverUrl");
        k0.p(organizationId, "organizationId");
        this.token = token;
        this.serverUrl = serverUrl;
        this.organizationId = organizationId;
    }
    
    @e
    public final String getOrganizationId() {
        return this.organizationId;
    }
    
    @e
    public final String getServerUrl() {
        return this.serverUrl;
    }
    
    @e
    public final String getToken() {
        return this.token;
    }
    
    public final void setOrganizationId(@e final String organizationId) {
        k0.p(organizationId, "<set-?>");
        this.organizationId = organizationId;
    }
    
    public final void setServerUrl(@e final String serverUrl) {
        k0.p(serverUrl, "<set-?>");
        this.serverUrl = serverUrl;
    }
    
    public final void setToken(@e final String token) {
        k0.p(token, "<set-?>");
        this.token = token;
    }
}
