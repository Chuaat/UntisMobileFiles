// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.network.parameter;

import com.untis.mobile.api.common.JsonRpcRequest;
import com.untis.mobile.persistence.models.profile.Profile;
import kotlin.jvm.internal.k0;
import com.untis.mobile.api.common.UMAuthenticationToken;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.f;
import t5.d;
import com.google.gson.annotations.JsonAdapter;
import org.joda.time.t;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.api.dto.AuthenticatedRequest;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 !2\u00020\u0001:\u0001\u0014B7\u0012\u0006\u0010\u0018\u001a\u00020\u0012\u0012\u0006\u0010\u001c\u001a\u00020\u0012\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0018\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u001c\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017¨\u0006\"" }, d2 = { "Lcom/untis/mobile/dashboard/network/parameter/i;", "Lcom/untis/mobile/api/dto/AuthenticatedRequest;", "Lorg/joda/time/t;", "I", "Lorg/joda/time/t;", "b", "()Lorg/joda/time/t;", "f", "(Lorg/joda/time/t;)V", "date", "", "J", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "h", "(Ljava/lang/String;)V", "text", "", "G", "a", "()J", "e", "(J)V", "absenceId", "H", "c", "g", "excuseStatusId", "Lcom/untis/mobile/api/common/UMAuthenticationToken;", "authenticationToken", "<init>", "(JJLorg/joda/time/t;Ljava/lang/String;Lcom/untis/mobile/api/common/UMAuthenticationToken;)V", "K", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class i extends AuthenticatedRequest
{
    @e
    public static final a K;
    @SerializedName("absenceId")
    private long G;
    @SerializedName("excuseStatusId")
    private long H;
    @JsonAdapter(d.class)
    @SerializedName("date")
    @f
    private t I;
    @SerializedName("text")
    @f
    private String J;
    
    static {
        K = new a(null);
    }
    
    public i(final long g, final long h, @f final t i, @f final String j, @e final UMAuthenticationToken auth) {
        k0.p(auth, "authenticationToken");
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        super.auth = auth;
    }
    
    public final long a() {
        return this.G;
    }
    
    @f
    public final t b() {
        return this.I;
    }
    
    public final long c() {
        return this.H;
    }
    
    @f
    public final String d() {
        return this.J;
    }
    
    public final void e(final long g) {
        this.G = g;
    }
    
    public final void f(@f final t i) {
        this.I = i;
    }
    
    public final void g(final long h) {
        this.H = h;
    }
    
    public final void h(@f final String j) {
        this.J = j;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¨\u0006\f" }, d2 = { "com/untis/mobile/dashboard/network/parameter/i$a", "", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "", "absenceId", "excuseStatusId", "Lcom/untis/mobile/api/common/JsonRpcRequest;", "Lcom/untis/mobile/dashboard/network/parameter/i;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final JsonRpcRequest<i> a(@e final Profile profile, final long n, final long n2) {
            k0.p(profile, "profile");
            return new JsonRpcRequest<i>("submitExcuse2017", new i(n, n2, null, null, profile.createAuthenticationToken(), 12, null));
        }
    }
}
