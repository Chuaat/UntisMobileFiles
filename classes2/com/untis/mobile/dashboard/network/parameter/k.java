// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.network.parameter;

import com.untis.mobile.api.common.JsonRpcRequest;
import com.untis.mobile.dashboard.persistence.model.studentabsence.DashboardStudentAbsence;
import com.untis.mobile.persistence.models.profile.Profile;
import kotlin.jvm.internal.k0;
import com.untis.mobile.api.common.UMAuthenticationToken;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.f;
import t5.b;
import com.google.gson.annotations.JsonAdapter;
import org.joda.time.c;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.api.dto.AuthenticatedRequest;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 )2\u00020\u0001:\u0001\u0005BA\u0012\u0006\u0010$\u001a\u00020\n\u0012\u0006\u0010\u001c\u001a\u00020\n\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0003\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u001c\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0003\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\"\u0010 \u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u0006\"\u0004\b\u001f\u0010\bR\"\u0010$\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0003\u001a\u0004\b\"\u0010\r\"\u0004\b#\u0010\u000f¨\u0006*" }, d2 = { "Lcom/untis/mobile/dashboard/network/parameter/k;", "Lcom/untis/mobile/api/dto/AuthenticatedRequest;", "Lorg/joda/time/c;", "J", "Lorg/joda/time/c;", "a", "()Lorg/joda/time/c;", "g", "(Lorg/joda/time/c;)V", "end", "", "K", "d", "()J", "j", "(J)V", "reasonId", "", "L", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "i", "(Ljava/lang/String;)V", "note", "H", "f", "l", "studentId", "I", "e", "k", "start", "G", "b", "h", "id", "Lcom/untis/mobile/api/common/UMAuthenticationToken;", "authenticationToken", "<init>", "(JJLorg/joda/time/c;Lorg/joda/time/c;JLjava/lang/String;Lcom/untis/mobile/api/common/UMAuthenticationToken;)V", "M", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class k extends AuthenticatedRequest
{
    @e
    public static final a M;
    @SerializedName("absenceId")
    private long G;
    @SerializedName("studentId")
    private long H;
    @JsonAdapter(b.class)
    @SerializedName("startDateTime")
    @e
    private c I;
    @JsonAdapter(b.class)
    @SerializedName("endDateTime")
    @e
    private c J;
    @SerializedName("absenceReasonId")
    private long K;
    @SerializedName("text")
    @f
    private String L;
    
    static {
        M = new a(null);
    }
    
    public k(final long g, final long h, @e final c i, @e final c j, final long k, @f final String l, @e final UMAuthenticationToken auth) {
        k0.p(i, "start");
        k0.p(j, "end");
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
    
    public final long b() {
        return this.G;
    }
    
    @f
    public final String c() {
        return this.L;
    }
    
    public final long d() {
        return this.K;
    }
    
    @e
    public final c e() {
        return this.I;
    }
    
    public final long f() {
        return this.H;
    }
    
    public final void g(@e final c j) {
        k0.p(j, "<set-?>");
        this.J = j;
    }
    
    public final void h(final long g) {
        this.G = g;
    }
    
    public final void i(@f final String l) {
        this.L = l;
    }
    
    public final void j(final long k) {
        this.K = k;
    }
    
    public final void k(@e final c i) {
        k0.p(i, "<set-?>");
        this.I = i;
    }
    
    public final void l(final long h) {
        this.H = h;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u000b" }, d2 = { "com/untis/mobile/dashboard/network/parameter/k$a", "", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Lcom/untis/mobile/dashboard/persistence/model/studentabsence/DashboardStudentAbsence;", "studentAbsence", "Lcom/untis/mobile/api/common/JsonRpcRequest;", "Lcom/untis/mobile/dashboard/network/parameter/k;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final JsonRpcRequest<k> a(@e final Profile profile, @e final DashboardStudentAbsence dashboardStudentAbsence) {
            k0.p(profile, "profile");
            k0.p(dashboardStudentAbsence, "studentAbsence");
            return new JsonRpcRequest<k>("submitOwnAbsence2017", new k(dashboardStudentAbsence.getId(), dashboardStudentAbsence.getStudentId(), dashboardStudentAbsence.getStart(), dashboardStudentAbsence.getEnd(), dashboardStudentAbsence.getReasonId(), dashboardStudentAbsence.getText(), profile.createAuthenticationToken()));
        }
    }
}
