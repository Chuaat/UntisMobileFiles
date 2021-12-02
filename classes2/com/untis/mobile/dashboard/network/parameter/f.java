// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.network.parameter;

import com.untis.mobile.api.common.JsonRpcRequest;
import com.untis.mobile.persistence.models.profile.Profile;
import kotlin.jvm.internal.k0;
import com.untis.mobile.api.common.UMAuthenticationToken;
import kotlin.jvm.internal.w;
import t5.d;
import org.joda.time.t;
import com.google.gson.annotations.SerializedName;
import t5.c;
import com.google.gson.annotations.JsonAdapter;
import com.untis.mobile.persistence.models.EntityType;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.api.dto.AuthenticatedRequest;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 !2\u00020\u0001:\u0001\u001aB/\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0019\u001a\u00020\u0012\u0012\u0006\u0010\u001c\u001a\u00020\u0012\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001c\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018¨\u0006\"" }, d2 = { "Lcom/untis/mobile/dashboard/network/parameter/f;", "Lcom/untis/mobile/api/dto/AuthenticatedRequest;", "Lcom/untis/mobile/persistence/models/EntityType;", "G", "Lcom/untis/mobile/persistence/models/EntityType;", "c", "()Lcom/untis/mobile/persistence/models/EntityType;", "g", "(Lcom/untis/mobile/persistence/models/EntityType;)V", "entityType", "", "H", "J", "b", "()J", "f", "(J)V", "entityId", "Lorg/joda/time/t;", "I", "Lorg/joda/time/t;", "d", "()Lorg/joda/time/t;", "h", "(Lorg/joda/time/t;)V", "start", "a", "e", "end", "Lcom/untis/mobile/api/common/UMAuthenticationToken;", "authenticationToken", "<init>", "(Lcom/untis/mobile/persistence/models/EntityType;JLorg/joda/time/t;Lorg/joda/time/t;Lcom/untis/mobile/api/common/UMAuthenticationToken;)V", "K", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class f extends AuthenticatedRequest
{
    @e
    public static final a K;
    @JsonAdapter(c.class)
    @SerializedName("type")
    @e
    private EntityType G;
    @SerializedName("id")
    private long H;
    @JsonAdapter(d.class)
    @SerializedName("startDate")
    @e
    private t I;
    @JsonAdapter(d.class)
    @SerializedName("endDate")
    @e
    private t J;
    
    static {
        K = new a(null);
    }
    
    public f(@e final EntityType g, final long h, @e final t i, @e final t j, @e final UMAuthenticationToken auth) {
        k0.p(g, "entityType");
        k0.p(i, "start");
        k0.p(j, "end");
        k0.p(auth, "authenticationToken");
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        super.auth = auth;
    }
    
    @e
    public final t a() {
        return this.J;
    }
    
    public final long b() {
        return this.H;
    }
    
    @e
    public final EntityType c() {
        return this.G;
    }
    
    @e
    public final t d() {
        return this.I;
    }
    
    public final void e(@e final t j) {
        k0.p(j, "<set-?>");
        this.J = j;
    }
    
    public final void f(final long h) {
        this.H = h;
    }
    
    public final void g(@e final EntityType g) {
        k0.p(g, "<set-?>");
        this.G = g;
    }
    
    public final void h(@e final t i) {
        k0.p(i, "<set-?>");
        this.I = i;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¨\u0006\u0010" }, d2 = { "com/untis/mobile/dashboard/network/parameter/f$a", "", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Lorg/joda/time/t;", "start", "end", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "", "entityId", "Lcom/untis/mobile/api/common/JsonRpcRequest;", "Lcom/untis/mobile/dashboard/network/parameter/f;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final JsonRpcRequest<f> a(@e final Profile profile, @e final t t, @e final t t2, @e final EntityType entityType, final long n) {
            k0.p(profile, "profile");
            k0.p(t, "start");
            k0.p(t2, "end");
            k0.p(entityType, "entityType");
            return new JsonRpcRequest<f>("getHomeWork2017", new f(entityType, n, t, t2, profile.createAuthenticationToken()));
        }
    }
}
