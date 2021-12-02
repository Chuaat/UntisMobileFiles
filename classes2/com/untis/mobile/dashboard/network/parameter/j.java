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
import t5.b;
import com.google.gson.annotations.JsonAdapter;
import org.joda.time.c;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.api.dto.AuthenticatedRequest;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 )2\u00020\u0001:\u0001\u001eB?\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010$\u001a\u00020\n\u0012\u0006\u0010\u001d\u001a\u00020\u0016\u0012\u0006\u0010 \u001a\u00020\u0016\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010 \u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\"\u0010$\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\f\u001a\u0004\b\"\u0010\u000e\"\u0004\b#\u0010\u0010¨\u0006*" }, d2 = { "Lcom/untis/mobile/dashboard/network/parameter/j;", "Lcom/untis/mobile/api/dto/AuthenticatedRequest;", "", "K", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "j", "(Ljava/lang/String;)V", "teacherText", "", "G", "J", "f", "()J", "l", "(J)V", "wuId", "L", "e", "k", "userText", "Lorg/joda/time/c;", "I", "Lorg/joda/time/c;", "b", "()Lorg/joda/time/c;", "h", "(Lorg/joda/time/c;)V", "start", "a", "g", "end", "H", "c", "i", "teacherId", "Lcom/untis/mobile/api/common/UMAuthenticationToken;", "authenticationToken", "<init>", "(JJLorg/joda/time/c;Lorg/joda/time/c;Ljava/lang/String;Ljava/lang/String;Lcom/untis/mobile/api/common/UMAuthenticationToken;)V", "M", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class j extends AuthenticatedRequest
{
    @e
    public static final a M;
    @SerializedName("periodId")
    private long G;
    @SerializedName("teacherId")
    private long H;
    @JsonAdapter(b.class)
    @SerializedName("startDateTime")
    @e
    private c I;
    @JsonAdapter(b.class)
    @SerializedName("endDateTime")
    @e
    private c J;
    @SerializedName("teacherText")
    @e
    private String K;
    @SerializedName("userText")
    @e
    private String L;
    
    static {
        M = new a(null);
    }
    
    public j(final long g, final long h, @e final c i, @e final c j, @e final String k, @e final String l, @e final UMAuthenticationToken auth) {
        k0.p(i, "start");
        k0.p(j, "end");
        k0.p(k, "teacherText");
        k0.p(l, "userText");
        k0.p(auth, "authenticationToken");
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
        this.L = l;
        super.auth = auth;
    }
    
    @e
    public final c a() {
        return this.J;
    }
    
    @e
    public final c b() {
        return this.I;
    }
    
    public final long c() {
        return this.H;
    }
    
    @e
    public final String d() {
        return this.K;
    }
    
    @e
    public final String e() {
        return this.L;
    }
    
    public final long f() {
        return this.G;
    }
    
    public final void g(@e final c j) {
        k0.p(j, "<set-?>");
        this.J = j;
    }
    
    public final void h(@e final c i) {
        k0.p(i, "<set-?>");
        this.I = i;
    }
    
    public final void i(final long h) {
        this.H = h;
    }
    
    public final void j(@e final String k) {
        k0.p(k, "<set-?>");
        this.K = k;
    }
    
    public final void k(@e final String l) {
        k0.p(l, "<set-?>");
        this.L = l;
    }
    
    public final void l(final long g) {
        this.G = g;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\r" }, d2 = { "com/untis/mobile/dashboard/network/parameter/j$a", "", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Lcom/untis/mobile/dashboard/persistence/model/contacthour/DashboardContactHour;", "contactHour", "", "position", "Lcom/untis/mobile/api/common/JsonRpcRequest;", "Lcom/untis/mobile/dashboard/network/parameter/j;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final JsonRpcRequest<j> a(@e final Profile profile, @e final DashboardContactHour dashboardContactHour, final int n) {
            k0.p(profile, "profile");
            k0.p(dashboardContactHour, "contactHour");
            final UMAuthenticationToken authenticationToken = profile.createAuthenticationToken();
            final long wuId = dashboardContactHour.getWuId();
            final long teacherId = dashboardContactHour.getTeacherId();
            final c slotStart = dashboardContactHour.getSlotStart(n);
            if (slotStart == null) {
                throw new IllegalArgumentException("no valid slot start");
            }
            final c slotEnd = dashboardContactHour.getSlotEnd(n);
            if (slotEnd != null) {
                String userText = dashboardContactHour.getUserText();
                if (userText == null) {
                    userText = "";
                }
                String teacherText = dashboardContactHour.getTeacherText();
                if (teacherText == null) {
                    teacherText = "";
                }
                return new JsonRpcRequest<j>("submitOfficeHourRegistration2017", new j(wuId, teacherId, slotStart, slotEnd, teacherText, userText, authenticationToken));
            }
            throw new IllegalArgumentException("no valid slot end");
        }
    }
}
