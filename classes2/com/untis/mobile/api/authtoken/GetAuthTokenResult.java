// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.authtoken;

import kotlin.jvm.internal.w;
import org.jetbrains.annotations.f;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\bR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n" }, d2 = { "Lcom/untis/mobile/api/authtoken/GetAuthTokenResult;", "", "", "token", "Ljava/lang/String;", "getToken", "()Ljava/lang/String;", "setToken", "(Ljava/lang/String;)V", "<init>", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class GetAuthTokenResult
{
    @f
    private String token;
    
    public GetAuthTokenResult() {
        this(null, 1, null);
    }
    
    public GetAuthTokenResult(@f final String token) {
        this.token = token;
    }
    
    @f
    public final String getToken() {
        return this.token;
    }
    
    public final void setToken(@f final String token) {
        this.token = token;
    }
}
