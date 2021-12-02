// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.network;

import retrofit2.f$a;
import retrofit2.u$b;
import kotlin.text.s;
import okio.n;
import okhttp3.e0;
import kotlin.jvm.internal.k0;
import okhttp3.g0;
import okhttp3.x$a;
import okhttp3.x;
import okhttp3.c0$a;
import okhttp3.c0;
import com.untis.mobile.persistence.models.profile.Profile;
import okhttp3.logging.a$a;
import kotlin.jvm.internal.w;
import okhttp3.logging.a$b;
import okhttp3.f0;
import com.untis.mobile.api.dto.SubmitOfficeHourRegistrationRequest;
import com.untis.mobile.api.dto.GetHomeWorkRequest;
import com.untis.mobile.api.dto.GetExamsRequest;
import x3.m;
import com.untis.mobile.dashboard.network.parameter.k;
import com.untis.mobile.dashboard.network.parameter.g;
import com.untis.mobile.dashboard.network.parameter.h;
import com.untis.mobile.dashboard.network.parameter.c;
import org.jetbrains.annotations.f;
import p7.o;
import com.untis.mobile.api.common.JsonRpcResponse;
import kotlin.coroutines.d;
import p7.a;
import com.untis.mobile.dashboard.network.parameter.i;
import com.untis.mobile.api.common.JsonRpcRequest;
import p7.y;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 (2\u00020\u0001:\u0001(J3\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H§@\u00f8\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ3\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H§@\u00f8\u0001\u0000¢\u0006\u0004\b\r\u0010\nJ3\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004H§@\u00f8\u0001\u0000¢\u0006\u0004\b\u0010\u0010\nJ3\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004H§@\u00f8\u0001\u0000¢\u0006\u0004\b\u0013\u0010\nJ3\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004H§@\u00f8\u0001\u0000¢\u0006\u0004\b\u0016\u0010\nJ3\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004H§@\u00f8\u0001\u0000¢\u0006\u0004\b\u0019\u0010\nJ3\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0004H§@\u00f8\u0001\u0000¢\u0006\u0004\b\u001c\u0010\nJ3\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004H§@\u00f8\u0001\u0000¢\u0006\u0004\b\u001f\u0010\nJ3\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020 0\u0004H§@\u00f8\u0001\u0000¢\u0006\u0004\b\"\u0010\nJ3\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020#0\u0004H§@\u00f8\u0001\u0000¢\u0006\u0004\b%\u0010\nJ3\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020&0\u0004H§@\u00f8\u0001\u0000¢\u0006\u0004\b(\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)" }, d2 = { "Lcom/untis/mobile/dashboard/network/b;", "", "", "url", "Lcom/untis/mobile/api/common/JsonRpcRequest;", "Lcom/untis/mobile/dashboard/network/parameter/d;", "request", "Lcom/untis/mobile/api/common/JsonRpcResponse;", "Lx3/d;", "j", "(Ljava/lang/String;Lcom/untis/mobile/api/common/JsonRpcRequest;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/dashboard/network/parameter/c;", "Lx3/c;", "b", "Lcom/untis/mobile/api/dto/SubmitOfficeHourRegistrationRequest;", "Lx3/k;", "k", "Lcom/untis/mobile/dashboard/network/parameter/a;", "Lx3/a;", "g", "Lcom/untis/mobile/api/dto/GetHomeWorkRequest;", "Lx3/f;", "i", "Lcom/untis/mobile/api/dto/GetExamsRequest;", "Lx3/e;", "h", "Lcom/untis/mobile/dashboard/network/parameter/h;", "Lx3/h;", "c", "Lcom/untis/mobile/dashboard/network/parameter/k;", "Lx3/m;", "f", "Lcom/untis/mobile/dashboard/network/parameter/g;", "Lx3/g;", "d", "Lcom/untis/mobile/dashboard/network/parameter/b;", "Lx3/b;", "e", "Lcom/untis/mobile/dashboard/network/parameter/i;", "Lx3/i;", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public interface b
{
    @e
    public static final a a = b.a.a;
    
    @o
    @f
    Object a(@y @e final String p0, @p7.a @e final JsonRpcRequest<i> p1, @e final d<? super JsonRpcResponse<x3.i>> p2);
    
    @o
    @f
    Object b(@y @e final String p0, @p7.a @e final JsonRpcRequest<c> p1, @e final d<? super JsonRpcResponse<x3.c>> p2);
    
    @o
    @f
    Object c(@y @e final String p0, @p7.a @e final JsonRpcRequest<h> p1, @e final d<? super JsonRpcResponse<x3.h>> p2);
    
    @o
    @f
    Object d(@y @e final String p0, @p7.a @e final JsonRpcRequest<g> p1, @e final d<? super JsonRpcResponse<x3.g>> p2);
    
    @o
    @f
    Object e(@y @e final String p0, @p7.a @e final JsonRpcRequest<com.untis.mobile.dashboard.network.parameter.b> p1, @e final d<? super JsonRpcResponse<x3.b>> p2);
    
    @o
    @f
    Object f(@y @e final String p0, @p7.a @e final JsonRpcRequest<k> p1, @e final d<? super JsonRpcResponse<m>> p2);
    
    @o
    @f
    Object g(@y @e final String p0, @p7.a @e final JsonRpcRequest<com.untis.mobile.dashboard.network.parameter.a> p1, @e final d<? super JsonRpcResponse<x3.a>> p2);
    
    @o
    @f
    Object h(@y @e final String p0, @p7.a @e final JsonRpcRequest<GetExamsRequest> p1, @e final d<? super JsonRpcResponse<x3.e>> p2);
    
    @o
    @f
    Object i(@y @e final String p0, @p7.a @e final JsonRpcRequest<GetHomeWorkRequest> p1, @e final d<? super JsonRpcResponse<x3.f>> p2);
    
    @o
    @f
    Object j(@y @e final String p0, @p7.a @e final JsonRpcRequest<com.untis.mobile.dashboard.network.parameter.d> p1, @e final d<? super JsonRpcResponse<x3.d>> p2);
    
    @o
    @f
    Object k(@y @e final String p0, @p7.a @e final JsonRpcRequest<SubmitOfficeHourRegistrationRequest> p1, @e final d<? super JsonRpcResponse<x3.k>> p2);
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010¨\u0006\u0014" }, d2 = { "com/untis/mobile/dashboard/network/b$a", "", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Lokhttp3/c0;", "c", "Lokhttp3/f0;", "body", "", "d", "Lokhttp3/logging/a;", "b", "Lcom/untis/mobile/dashboard/network/b;", "f", "e", "Lkotlin/text/o;", "Lkotlin/text/o;", "REGEX_METHOD", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        static final /* synthetic */ a a;
        @e
        private static final kotlin.text.o b;
        
        static {
            a = new a();
            b = new kotlin.text.o("\"method\"*:*\"");
        }
        
        private a() {
        }
        
        private final okhttp3.logging.a b() {
            final okhttp3.logging.a a = new okhttp3.logging.a((a$b)null, 1, (w)null);
            a.d(a$a.J);
            return a;
        }
        
        private final c0 c(final Profile profile) {
            final c0$a c0$a = new c0$a();
            c0$a.c((x)new x() {
                @e
                public final g0 intercept(@e final x$a x$a) {
                    k0.p(x$a, "chain");
                    final e0 k = x$a.k();
                    final a a = com.untis.mobile.dashboard.network.b.a.a;
                    return x$a.e(k.n().D(k.q().H().c("school", profile.getSchoolLogin()).c("v", "a5.1.0").c("m", a.e(a.d(k.f()))).c("anonymous", String.valueOf(profile.isAnonymousUser())).c("server", profile.getSchoolServerUrl()).h()).a("anonymous", String.valueOf(profile.isAnonymousUser())).a("server", profile.getSchoolServerUrl()).b());
                }
            });
            return c0$a.f();
        }
        
        private final String d(final f0 f0) {
            final okio.m m = new okio.m();
            if (f0 != null) {
                f0.r((n)m);
            }
            return m.y4();
        }
        
        @e
        public final String e(@e String substring) {
            k0.p(substring, "body");
            final kotlin.text.o b = com.untis.mobile.dashboard.network.b.a.b;
            Integer t = null;
            final kotlin.text.m c = kotlin.text.o.c(b, (CharSequence)substring, 0, 2, (Object)null);
            if (c != null) {
                final kotlin.ranges.k d = c.d();
                if (d != null) {
                    t = d.t();
                }
            }
            if (t != null) {
                final int beginIndex = t + 1;
                substring = substring.substring(beginIndex, s.q3((CharSequence)substring, '\"', beginIndex, false, 4, (Object)null));
                k0.o(substring, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                return substring;
            }
            throw new IllegalArgumentException("no method field available");
        }
        
        @e
        public final b f(@e final Profile profile) {
            k0.p(profile, "profile");
            final Object g = new u$b().c("https://mobile.untis.at").b((f$a)retrofit2.converter.gson.a.f()).j(this.c(profile)).f().g((Class)b.class);
            k0.o(g, "Builder()\n                    .baseUrl(\"https://mobile.untis.at\")\n                    .addConverterFactory(GsonConverterFactory.create())\n                    .client(createOkHttpClient(profile))\n                    .build().create(DashboardApi::class.java)");
            return (b)g;
        }
    }
}
