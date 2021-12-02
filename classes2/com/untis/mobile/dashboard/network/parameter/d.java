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
import com.google.gson.annotations.JsonAdapter;
import org.joda.time.t;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.api.dto.AuthenticatedRequest;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00162\u00020\u0001:\u0001\rB\u001f\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0017" }, d2 = { "Lcom/untis/mobile/dashboard/network/parameter/d;", "Lcom/untis/mobile/api/dto/AuthenticatedRequest;", "Lorg/joda/time/t;", "G", "Lorg/joda/time/t;", "b", "()Lorg/joda/time/t;", "d", "(Lorg/joda/time/t;)V", "start", "", "H", "J", "a", "()J", "c", "(J)V", "klasseId", "Lcom/untis/mobile/api/common/UMAuthenticationToken;", "authenticationToken", "<init>", "(Lorg/joda/time/t;JLcom/untis/mobile/api/common/UMAuthenticationToken;)V", "I", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class d extends AuthenticatedRequest
{
    @e
    public static final a I;
    @JsonAdapter(t5.d.class)
    @SerializedName("startDate")
    @e
    private t G;
    @SerializedName("klasseId")
    private long H;
    
    static {
        I = new a(null);
    }
    
    public d(@e final t g, final long h, @e final UMAuthenticationToken auth) {
        k0.p(g, "start");
        k0.p(auth, "authenticationToken");
        this.G = g;
        this.H = h;
        super.auth = auth;
    }
    
    public final long a() {
        return this.H;
    }
    
    @e
    public final t b() {
        return this.G;
    }
    
    public final void c(final long h) {
        this.H = h;
    }
    
    public final void d(@e final t g) {
        k0.p(g, "<set-?>");
        this.G = g;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\r" }, d2 = { "com/untis/mobile/dashboard/network/parameter/d$a", "", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Lorg/joda/time/t;", "start", "", "klasseId", "Lcom/untis/mobile/api/common/JsonRpcRequest;", "Lcom/untis/mobile/dashboard/network/parameter/d;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final JsonRpcRequest<d> a(@e final Profile profile, @e final t t, final long n) {
            k0.p(profile, "profile");
            k0.p(t, "start");
            return new JsonRpcRequest<d>("getOfficeHours2017", new d(t, n, profile.createAuthenticationToken()));
        }
    }
}
