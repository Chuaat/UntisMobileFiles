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
import t5.d;
import com.google.gson.annotations.JsonAdapter;
import org.joda.time.t;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.api.dto.AuthenticatedRequest;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001e2\u00020\u0001:\u0001\u0017B3\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0019\u001a\u00020\n\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\"\u0010\u0019\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010¨\u0006\u001f" }, d2 = { "Lcom/untis/mobile/dashboard/network/parameter/h;", "Lcom/untis/mobile/api/dto/AuthenticatedRequest;", "", "J", "Z", "c", "()Z", "g", "(Z)V", "includeUnExcused", "Lorg/joda/time/t;", "G", "Lorg/joda/time/t;", "d", "()Lorg/joda/time/t;", "h", "(Lorg/joda/time/t;)V", "start", "I", "b", "f", "includeExcused", "H", "a", "e", "end", "Lcom/untis/mobile/api/common/UMAuthenticationToken;", "authenticationToken", "<init>", "(Lorg/joda/time/t;Lorg/joda/time/t;ZZLcom/untis/mobile/api/common/UMAuthenticationToken;)V", "K", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class h extends AuthenticatedRequest
{
    @e
    public static final a K;
    @JsonAdapter(d.class)
    @SerializedName("startDate")
    @e
    private t G;
    @JsonAdapter(d.class)
    @SerializedName("endDate")
    @e
    private t H;
    @SerializedName("includeExcused")
    private boolean I;
    @SerializedName("includeUnExcused")
    private boolean J;
    
    static {
        K = new a(null);
    }
    
    public h(@e final t g, @e final t h, final boolean i, final boolean j, @e final UMAuthenticationToken auth) {
        k0.p(g, "start");
        k0.p(h, "end");
        k0.p(auth, "authenticationToken");
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        super.auth = auth;
    }
    
    @e
    public final t a() {
        return this.H;
    }
    
    public final boolean b() {
        return this.I;
    }
    
    public final boolean c() {
        return this.J;
    }
    
    @e
    public final t d() {
        return this.G;
    }
    
    public final void e(@e final t h) {
        k0.p(h, "<set-?>");
        this.H = h;
    }
    
    public final void f(final boolean i) {
        this.I = i;
    }
    
    public final void g(final boolean j) {
        this.J = j;
    }
    
    public final void h(@e final t g) {
        k0.p(g, "<set-?>");
        this.G = g;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¨\u0006\f" }, d2 = { "com/untis/mobile/dashboard/network/parameter/h$a", "", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Lorg/joda/time/t;", "start", "end", "Lcom/untis/mobile/api/common/JsonRpcRequest;", "Lcom/untis/mobile/dashboard/network/parameter/h;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final JsonRpcRequest<h> a(@e final Profile profile, @e final t t, @e final t t2) {
            k0.p(profile, "profile");
            k0.p(t, "start");
            k0.p(t2, "end");
            return new JsonRpcRequest<h>("getStudentAbsences2017", new h(t, t2, false, false, profile.createAuthenticationToken(), 12, null));
        }
    }
}
