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
import com.google.gson.annotations.JsonAdapter;
import org.joda.time.t;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.api.dto.AuthenticatedRequest;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00102\u00020\u0001:\u0001\u0005B'\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001a" }, d2 = { "Lcom/untis/mobile/dashboard/network/parameter/b;", "Lcom/untis/mobile/api/dto/AuthenticatedRequest;", "Lorg/joda/time/t;", "I", "Lorg/joda/time/t;", "a", "()Lorg/joda/time/t;", "d", "(Lorg/joda/time/t;)V", "end", "H", "c", "f", "start", "", "G", "J", "b", "()J", "e", "(J)V", "klassenId", "Lcom/untis/mobile/api/common/UMAuthenticationToken;", "authenticationToken", "<init>", "(JLorg/joda/time/t;Lorg/joda/time/t;Lcom/untis/mobile/api/common/UMAuthenticationToken;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b extends AuthenticatedRequest
{
    @e
    public static final a J;
    @SerializedName("klasseId")
    private long G;
    @JsonAdapter(d.class)
    @SerializedName("startDate")
    @e
    private t H;
    @JsonAdapter(d.class)
    @SerializedName("endDate")
    @e
    private t I;
    
    static {
        J = new a(null);
    }
    
    public b(final long g, @e final t h, @e final t i, @e final UMAuthenticationToken auth) {
        k0.p(h, "start");
        k0.p(i, "end");
        k0.p(auth, "authenticationToken");
        this.G = g;
        this.H = h;
        this.I = i;
        super.auth = auth;
    }
    
    @e
    public final t a() {
        return this.I;
    }
    
    public final long b() {
        return this.G;
    }
    
    @e
    public final t c() {
        return this.H;
    }
    
    public final void d(@e final t i) {
        k0.p(i, "<set-?>");
        this.I = i;
    }
    
    public final void e(final long g) {
        this.G = g;
    }
    
    public final void f(@e final t h) {
        k0.p(h, "<set-?>");
        this.H = h;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ,\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¨\u0006\u000e" }, d2 = { "com/untis/mobile/dashboard/network/parameter/b$a", "", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "", "klassenId", "Lorg/joda/time/t;", "start", "end", "Lcom/untis/mobile/api/common/JsonRpcRequest;", "Lcom/untis/mobile/dashboard/network/parameter/b;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final JsonRpcRequest<b> a(@e final Profile profile, final long n, @e final t t, @e final t t2) {
            k0.p(profile, "profile");
            k0.p(t, "start");
            k0.p(t2, "end");
            return new JsonRpcRequest<b>("getClassregData2017", new b(n, t, t2, profile.createAuthenticationToken()));
        }
    }
}
