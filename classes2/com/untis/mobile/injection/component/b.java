// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.injection.component;

import okhttp3.h0;
import java.nio.charset.Charset;
import okhttp3.e0$a;
import kotlin.coroutines.g;
import kotlinx.coroutines.h;
import kotlin.c1;
import okhttp3.w;
import kotlin.j2;
import kotlinx.coroutines.r0;
import n6.p;
import okhttp3.e0;
import kotlin.jvm.internal.j1;
import okhttp3.g0;
import okhttp3.x$a;
import kotlin.ranges.k;
import java.util.Objects;
import kotlin.text.s;
import okio.n;
import okio.m;
import java.security.cert.X509Certificate;
import java.io.InputStream;
import okhttp3.tls.b$a;
import java.io.Closeable;
import okhttp3.internal.d;
import java.io.Reader;
import kotlin.io.z;
import java.io.InputStreamReader;
import kotlin.text.f;
import kotlin.jvm.internal.k0;
import com.facebook.stetho.okhttp3.StethoInterceptor;
import java.util.concurrent.TimeUnit;
import okhttp3.c0$a;
import okhttp3.x;
import com.untis.mobile.services.profile.legacy.a;
import com.google.gson.Gson;
import com.untis.mobile.persistence.models.profile.Profile;
import okhttp3.c0;
import android.content.Context;
import okhttp3.f0;
import kotlin.text.o;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\n\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001)B\t\b\u0002¢\u0006\u0004\b'\u0010(J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J*\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013J\u0016\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fJ\"\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u0004R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\n8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u001eR\u0016\u0010&\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u001e¨\u0006*" }, d2 = { "Lcom/untis/mobile/injection/component/b;", "", "Landroid/content/Context;", "context", "", "withOriginHeader", "Lokhttp3/c0$a;", "i", "Lokhttp3/f0;", "body", "", "k", "l", "Lokhttp3/x;", "h", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Lcom/google/gson/Gson;", "gson", "Lcom/untis/mobile/services/profile/legacy/a;", "profileService", "Lokhttp3/c0;", "e", "g", "withKeepAlivePing", "c", "Lkotlin/text/o;", "b", "Lkotlin/text/o;", "REGEX_METHOD", "Ljava/lang/String;", "HEADER_AUTHORIZATION", "", "f", "J", "PING_INTERVAL_SECONDS", "d", "HEADER_ANONYMOUS_AUTHORIZATION_ENCODED", "QUERY_PARAMETER_SCHOOL", "<init>", "()V", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b
{
    @e
    public static final b a;
    @e
    private static final o b;
    @e
    public static final String c = "Authorization";
    @e
    private static final String d = "anonymous-school-base64";
    @e
    private static final String e = "school";
    private static final long f = 45L;
    
    static {
        a = new b();
        b = new o("\"method\"*:*\"");
    }
    
    private b() {
    }
    
    private final x h() {
        return (x)new a("com.grupet.web.app");
    }
    
    private final c0$a i(final Context context, final boolean b) {
        final c0$a l0 = new c0$a().l0(true);
        final TimeUnit seconds = TimeUnit.SECONDS;
        final c0$a d = l0.k(10L, seconds).h(20L, seconds).d((x)new StethoInterceptor());
        if (b) {
            d.d(this.h());
        }
        try {
            final InputStream openRawResource = context.getResources().openRawResource(2131820544);
            k0.o(openRawResource, "context.resources.openRawResource(R.raw.isrgrootx1)");
            final X509Certificate b2 = okhttp3.tls.a.b(z.k(new InputStreamReader(openRawResource, kotlin.text.f.a)));
            okhttp3.internal.d.l((Closeable)openRawResource);
            final okhttp3.tls.b d2 = new b$a().c(b2).b().d();
            d.Q0(d2.e(), d2.f());
        }
        catch (Exception ex) {
            b.g((Throwable)ex, "could not init ssl certificates", new Object[0]);
        }
        return d;
    }
    
    static /* synthetic */ c0$a j(final b b, final Context context, boolean b2, final int n, final Object o) {
        if ((n & 0x2) != 0x0) {
            b2 = false;
        }
        return b.i(context, b2);
    }
    
    private final String k(final f0 f0) {
        final m m = new m();
        if (f0 != null) {
            f0.r((n)m);
        }
        return m.y4();
    }
    
    private final String l(String substring) {
        final o b = com.untis.mobile.injection.component.b.b;
        Integer t = null;
        final kotlin.text.m c = o.c(b, (CharSequence)substring, 0, 2, (Object)null);
        if (c != null) {
            final k d = c.d();
            if (d != null) {
                t = d.t();
            }
        }
        if (t != null) {
            final int beginIndex = t + 1;
            final int q3 = s.q3((CharSequence)substring, '\"', beginIndex, false, 4, (Object)null);
            Objects.requireNonNull(substring, "null cannot be cast to non-null type java.lang.String");
            substring = substring.substring(beginIndex, q3);
            k0.o(substring, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            return substring;
        }
        throw new IllegalArgumentException("no method field available");
    }
    
    @e
    public final c0 c(@e final Context context, final boolean b, final boolean b2) {
        k0.p(context, "context");
        final c0$a i = this.i(context, b);
        if (b2) {
            i.d0(45L, TimeUnit.SECONDS);
        }
        return i.f();
    }
    
    @e
    public final c0 e(@e final Context context, @e final Profile profile, @e final Gson gson, @org.jetbrains.annotations.f final com.untis.mobile.services.profile.legacy.a a) {
        k0.p(context, "context");
        k0.p(profile, "profile");
        k0.p(gson, "gson");
        final c0$a j = j(this, context, false, 2, null);
        j.c((x)new x() {
            @e
            public final g0 intercept(@e final x$a x$a) {
                k0.p(x$a, "chain");
                final e0 k = x$a.k();
                final w h = k.q().H().c("school", profile.getSchoolLogin()).h();
                final e0$a d = k.n().D(h);
                String obj;
                String s;
                if (profile.isAnonymousUser()) {
                    final String schoolLogin = profile.getSchoolLogin();
                    final Charset a = kotlin.text.f.a;
                    Objects.requireNonNull(schoolLogin, "null cannot be cast to non-null type java.lang.String");
                    final byte[] bytes = schoolLogin.getBytes(a);
                    k0.o(bytes, "(this as java.lang.String).getBytes(charset)");
                    obj = org.apache.commons.codec.binary.d.I(bytes);
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Encoded authorization header for school '");
                    sb.append(profile.getSchoolLogin());
                    sb.append("': '");
                    sb.append((Object)obj);
                    sb.append('\'');
                    timber.log.b.b(sb.toString(), new Object[0]);
                    k0.o(obj, "encoded");
                    s = "anonymous-school-base64";
                }
                else {
                    obj = k0.C("Bearer ", profile.getAuthenticationToken());
                    s = "Authorization";
                }
                d.a(s, obj);
                final j1.h h2 = new j1.h();
                h2.G = (T)d.b();
                final j1.h h3 = new j1.h();
                final g0 e = x$a.e((e0)h2.G);
                h3.G = (T)e;
                if (e.x() == 401) {
                    if (a != null) {
                        ((g0)h3.G).close();
                        kotlinx.coroutines.h.h((g)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>(k, null) {
                            int G;
                            final /* synthetic */ a H;
                            final /* synthetic */ Profile I;
                            final /* synthetic */ j1.h<e0> J;
                            final /* synthetic */ e0 K;
                            final /* synthetic */ w L;
                            final /* synthetic */ j1.h<g0> M;
                            final /* synthetic */ x$a N;
                            
                            @org.jetbrains.annotations.e
                            @Override
                            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>(d) {
                                    int G;
                                    final /* synthetic */ a H = this.H;
                                    final /* synthetic */ Profile I = this.I;
                                    final /* synthetic */ j1.h<e0> J = this.J;
                                    final /* synthetic */ e0 K = this.K;
                                    final /* synthetic */ w L = this.L;
                                    final /* synthetic */ j1.h<g0> M = this.M;
                                    final /* synthetic */ x$a N = this.N;
                                };
                            }
                            
                            @org.jetbrains.annotations.f
                            @Override
                            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                                return ((b$d)this.create(r0, d)).invokeSuspend(j2.a);
                            }
                            
                            @org.jetbrains.annotations.f
                            public final Object invokeSuspend(@org.jetbrains.annotations.e Object i) {
                                final Object h = kotlin.coroutines.intrinsics.b.h();
                                final int g = this.G;
                                if (g != 0) {
                                    if (g != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    c1.n(i);
                                }
                                else {
                                    c1.n(i);
                                    final a h2 = this.H;
                                    final Profile j = this.I;
                                    this.G = 1;
                                    if ((i = h2.i(j, this)) == h) {
                                        return h;
                                    }
                                }
                                this.J.G = this.K.n().D(this.L).a("Authorization", k0.C("Bearer ", ((Profile)i).getAuthenticationToken())).b();
                                this.M.G = this.N.e((e0)this.J.G);
                                return j2.a;
                            }
                        }, 1, (Object)null);
                    }
                }
                return (g0)h3.G;
            }
        });
        j.c((x)new x() {
            @e
            public final g0 intercept(@e final x$a x$a) {
                k0.p(x$a, "chain");
                final g0 e = x$a.e(x$a.k());
                if (e.x() == 403) {
                    final h0 r = e.r();
                    String string;
                    if (r == null) {
                        string = null;
                    }
                    else {
                        string = r.string();
                    }
                    throw com.untis.mobile.calendar.network.error.b.H.a(gson, string);
                }
                return e;
            }
        });
        return j.f();
    }
    
    @e
    public final c0 g(@e final Context context, @e final Profile profile) {
        k0.p(context, "context");
        k0.p(profile, "profile");
        final c0$a j = j(this, context, false, 2, null);
        j.c((x)new x() {
            @e
            public final g0 intercept(@e final x$a x$a) {
                k0.p(x$a, "chain");
                final e0 k = x$a.k();
                final b a = com.untis.mobile.injection.component.b.a;
                return x$a.e(k.n().D(k.q().H().c("school", profile.getSchoolLogin()).c("v", "a5.1.0").c("m", a.l(a.k(k.f()))).c("anonymous", String.valueOf(profile.isAnonymousUser())).c("server", profile.getSchoolServerUrl()).h()).a("anonymous", String.valueOf(profile.isAnonymousUser())).a("server", profile.getSchoolServerUrl()).b());
            }
        });
        return j.f();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f" }, d2 = { "com/untis/mobile/injection/component/b$a", "Lokhttp3/x;", "Lokhttp3/x$a;", "chain", "Lokhttp3/g0;", "intercept", "", "b", "Ljava/lang/String;", "origin", "<init>", "(Ljava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a implements x
    {
        @e
        private final String b;
        
        public a(@e final String b) {
            k0.p(b, "origin");
            this.b = b;
        }
        
        @e
        public g0 intercept(@e final x$a x$a) {
            k0.p(x$a, "chain");
            return x$a.e(x$a.k().n().a("Origin", this.b).b());
        }
    }
}
