// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.network.parameter;

import com.untis.mobile.api.common.JsonRpcRequest;
import com.untis.mobile.dashboard.persistence.model.contacthour.DashboardContactHour;
import com.untis.mobile.persistence.models.profile.Profile;
import kotlin.jvm.internal.k0;
import com.untis.mobile.api.common.UMAuthenticationToken;
import kotlin.jvm.internal.w;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.api.dto.AuthenticatedRequest;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0013B'\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b¨\u0006\u001a" }, d2 = { "Lcom/untis/mobile/dashboard/network/parameter/a;", "Lcom/untis/mobile/api/dto/AuthenticatedRequest;", "", "G", "J", "c", "()J", "f", "(J)V", "wuId", "", "I", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "e", "(Ljava/lang/String;)V", "userText", "H", "a", "d", "teacherId", "Lcom/untis/mobile/api/common/UMAuthenticationToken;", "authenticationToken", "<init>", "(JJLjava/lang/String;Lcom/untis/mobile/api/common/UMAuthenticationToken;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class a extends AuthenticatedRequest
{
    @e
    public static final a J;
    @SerializedName("periodId")
    private long G;
    @SerializedName("teacherId")
    private long H;
    @SerializedName("userText")
    @e
    private String I;
    
    static {
        J = new a(null);
    }
    
    public a(final long g, final long h, @e final String i, @e final UMAuthenticationToken auth) {
        k0.p(i, "userText");
        k0.p(auth, "authenticationToken");
        this.G = g;
        this.H = h;
        this.I = i;
        super.auth = auth;
    }
    
    public final long a() {
        return this.H;
    }
    
    @e
    public final String b() {
        return this.I;
    }
    
    public final long c() {
        return this.G;
    }
    
    public final void d(final long h) {
        this.H = h;
    }
    
    public final void e(@e final String i) {
        k0.p(i, "<set-?>");
        this.I = i;
    }
    
    public final void f(final long g) {
        this.G = g;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u000b" }, d2 = { "com/untis/mobile/dashboard/network/parameter/a$a", "", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Lcom/untis/mobile/dashboard/persistence/model/contacthour/DashboardContactHour;", "contactHour", "Lcom/untis/mobile/api/common/JsonRpcRequest;", "Lcom/untis/mobile/dashboard/network/parameter/a;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final JsonRpcRequest<com.untis.mobile.dashboard.network.parameter.a> a(@e final Profile profile, @e final DashboardContactHour dashboardContactHour) {
            k0.p(profile, "profile");
            k0.p(dashboardContactHour, "contactHour");
            final UMAuthenticationToken authenticationToken = profile.createAuthenticationToken();
            final long wuId = dashboardContactHour.getWuId();
            final long teacherId = dashboardContactHour.getTeacherId();
            String userText;
            if ((userText = dashboardContactHour.getUserText()) == null) {
                userText = "";
            }
            return new JsonRpcRequest<com.untis.mobile.dashboard.network.parameter.a>("deleteOfficeHourRegistration2017", new com.untis.mobile.dashboard.network.parameter.a(wuId, teacherId, userText, authenticationToken));
        }
    }
}
