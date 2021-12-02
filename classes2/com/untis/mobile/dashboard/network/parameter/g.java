// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.network.parameter;

import com.untis.mobile.api.common.JsonRpcRequest;
import com.untis.mobile.persistence.models.profile.Profile;
import kotlin.jvm.internal.k0;
import com.untis.mobile.api.common.UMAuthenticationToken;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.api.dto.AuthenticatedRequest;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00062\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b" }, d2 = { "Lcom/untis/mobile/dashboard/network/parameter/g;", "Lcom/untis/mobile/api/dto/AuthenticatedRequest;", "Lcom/untis/mobile/api/common/UMAuthenticationToken;", "authenticationToken", "<init>", "(Lcom/untis/mobile/api/common/UMAuthenticationToken;)V", "G", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class g extends AuthenticatedRequest
{
    @e
    public static final a G;
    
    static {
        G = new a(null);
    }
    
    public g(@e final UMAuthenticationToken auth) {
        k0.p(auth, "authenticationToken");
        super.auth = auth;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\t" }, d2 = { "com/untis/mobile/dashboard/network/parameter/g$a", "", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Lcom/untis/mobile/api/common/JsonRpcRequest;", "Lcom/untis/mobile/dashboard/network/parameter/g;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final JsonRpcRequest<g> a(@e final Profile profile) {
            k0.p(profile, "profile");
            return new JsonRpcRequest<g>("getPDayAppointments", new g(profile.createAuthenticationToken()));
        }
    }
}
