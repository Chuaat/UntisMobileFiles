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
import kotlin.Metadata;
import com.untis.mobile.api.dto.AuthenticatedRequest;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 !2\u00020\u0001:\u0001\u0005B/\u0012\u0006\u0010\u0018\u001a\u00020\u0011\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0003\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0004\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\b¨\u0006\"" }, d2 = { "Lcom/untis/mobile/dashboard/network/parameter/e;", "Lcom/untis/mobile/api/dto/AuthenticatedRequest;", "Lorg/joda/time/t;", "J", "Lorg/joda/time/t;", "a", "()Lorg/joda/time/t;", "e", "(Lorg/joda/time/t;)V", "end", "", "H", "b", "()J", "f", "(J)V", "entityId", "Lcom/untis/mobile/persistence/models/EntityType;", "G", "Lcom/untis/mobile/persistence/models/EntityType;", "c", "()Lcom/untis/mobile/persistence/models/EntityType;", "g", "(Lcom/untis/mobile/persistence/models/EntityType;)V", "entityType", "I", "d", "h", "start", "Lcom/untis/mobile/api/common/UMAuthenticationToken;", "authenticationToken", "<init>", "(Lcom/untis/mobile/persistence/models/EntityType;JLorg/joda/time/t;Lorg/joda/time/t;Lcom/untis/mobile/api/common/UMAuthenticationToken;)V", "K", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class e extends AuthenticatedRequest
{
    @org.jetbrains.annotations.e
    public static final a K;
    @JsonAdapter(c.class)
    @SerializedName("type")
    @org.jetbrains.annotations.e
    private EntityType G;
    @SerializedName("id")
    private long H;
    @JsonAdapter(d.class)
    @SerializedName("startDate")
    @org.jetbrains.annotations.e
    private t I;
    @JsonAdapter(d.class)
    @SerializedName("endDate")
    @org.jetbrains.annotations.e
    private t J;
    
    static {
        K = new a(null);
    }
    
    public e(@org.jetbrains.annotations.e final EntityType g, final long h, @org.jetbrains.annotations.e final t i, @org.jetbrains.annotations.e final t j, @org.jetbrains.annotations.e final UMAuthenticationToken auth) {
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
    
    @org.jetbrains.annotations.e
    public final t a() {
        return this.J;
    }
    
    public final long b() {
        return this.H;
    }
    
    @org.jetbrains.annotations.e
    public final EntityType c() {
        return this.G;
    }
    
    @org.jetbrains.annotations.e
    public final t d() {
        return this.I;
    }
    
    public final void e(@org.jetbrains.annotations.e final t j) {
        k0.p(j, "<set-?>");
        this.J = j;
    }
    
    public final void f(final long h) {
        this.H = h;
    }
    
    public final void g(@org.jetbrains.annotations.e final EntityType g) {
        k0.p(g, "<set-?>");
        this.G = g;
    }
    
    public final void h(@org.jetbrains.annotations.e final t i) {
        k0.p(i, "<set-?>");
        this.I = i;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¨\u0006\u0010" }, d2 = { "com/untis/mobile/dashboard/network/parameter/e$a", "", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Lorg/joda/time/t;", "start", "end", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "", "entityId", "Lcom/untis/mobile/api/common/JsonRpcRequest;", "Lcom/untis/mobile/dashboard/network/parameter/e;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @org.jetbrains.annotations.e
        public final JsonRpcRequest<e> a(@org.jetbrains.annotations.e final Profile profile, @org.jetbrains.annotations.e final t t, @org.jetbrains.annotations.e final t t2, @org.jetbrains.annotations.e final EntityType entityType, final long n) {
            k0.p(profile, "profile");
            k0.p(t, "start");
            k0.p(t2, "end");
            k0.p(entityType, "entityType");
            return new JsonRpcRequest<e>("getExams2017", new e(entityType, n, t, t2, profile.createAuthenticationToken()));
        }
    }
}
