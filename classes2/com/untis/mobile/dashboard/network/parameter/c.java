// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.network.parameter;

import com.untis.mobile.api.common.JsonRpcRequest;
import com.untis.mobile.persistence.models.profile.Profile;
import kotlin.jvm.internal.k0;
import com.untis.mobile.api.common.UMAuthenticationToken;
import kotlin.jvm.internal.w;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.api.dto.AuthenticatedRequest;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u0001:\u0001\u000bB\u001f\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\b¨\u0006\u0013" }, d2 = { "Lcom/untis/mobile/dashboard/network/parameter/c;", "Lcom/untis/mobile/api/dto/AuthenticatedRequest;", "", "H", "J", "b", "()J", "d", "(J)V", "teacherId", "G", "a", "c", "contactHourId", "Lcom/untis/mobile/api/common/UMAuthenticationToken;", "authenticationToken", "<init>", "(JJLcom/untis/mobile/api/common/UMAuthenticationToken;)V", "I", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class c extends AuthenticatedRequest
{
    @e
    public static final a I;
    @SerializedName("periodId")
    private long G;
    @SerializedName("teacherId")
    private long H;
    
    static {
        I = new a(null);
    }
    
    public c(final long g, final long h, @e final UMAuthenticationToken auth) {
        k0.p(auth, "authenticationToken");
        this.G = g;
        this.H = h;
        super.auth = auth;
    }
    
    public final long a() {
        return this.G;
    }
    
    public final long b() {
        return this.H;
    }
    
    public final void c(final long g) {
        this.G = g;
    }
    
    public final void d(final long h) {
        this.H = h;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¨\u0006\f" }, d2 = { "com/untis/mobile/dashboard/network/parameter/c$a", "", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "", "contactHourId", "teacherId", "Lcom/untis/mobile/api/common/JsonRpcRequest;", "Lcom/untis/mobile/dashboard/network/parameter/c;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final JsonRpcRequest<c> a(@e final Profile profile, final long n, final long n2) {
            k0.p(profile, "profile");
            return new JsonRpcRequest<c>("getOfficeHourRegistrations2017", new c(n, n2, profile.createAuthenticationToken()));
        }
    }
}
