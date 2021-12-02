// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.profile;

import kotlinx.coroutines.u0;
import kotlin.coroutines.g;
import kotlinx.coroutines.h;
import kotlin.c1;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.j2;
import kotlin.coroutines.d;
import kotlinx.coroutines.r0;
import n6.p;
import androidx.lifecycle.x0;
import kotlinx.coroutines.k2;
import java.util.Set;
import com.untis.mobile.persistence.models.EntityType;
import androidx.lifecycle.LiveData;
import com.untis.mobile.analytics.base.c;
import com.untis.mobile.api.common.JsonRpcErrorType;
import com.untis.mobile.api.error.JsonRpcError;
import kotlin.jvm.internal.w;
import com.untis.mobile.persistence.models.profile.Profile;
import androidx.lifecycle.k0;
import com.untis.mobile.api.schoolsearch.SchoolSearchSchool;
import com.untis.mobile.analytics.base.b;
import org.jetbrains.annotations.e;
import com.untis.mobile.services.profile.legacy.a;
import kotlin.Metadata;
import androidx.lifecycle.w0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u0010!\u001a\u00020\u001e¢\u0006\u0004\b8\u00109J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007J\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000e\u001a\u00020\fJ\u001a\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000fR\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\"\u0010(\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%\"\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\"\u00102\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R*\u00106\u001a\u00020\u000f2\u0006\u00103\u001a\u00020\u000f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010-\u001a\u0004\b4\u0010/\"\u0004\b5\u00101R\u001c\u00107\u001a\b\u0012\u0004\u0012\u00020\b0\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010\u0014¨\u0006:" }, d2 = { "Lcom/untis/mobile/ui/activities/profile/v;", "Landroidx/lifecycle/w0;", "Lcom/untis/mobile/persistence/models/profile/Profile;", "prototype", "Lkotlin/j2;", "h", "l", "Landroidx/lifecycle/LiveData;", "Lcom/untis/mobile/ui/activities/profile/s;", "k", "", "s", "Lkotlinx/coroutines/k2;", "u", "t", "", "userLogin", "schoolLogin", "m", "Landroidx/lifecycle/k0;", "Landroidx/lifecycle/k0;", "mShowLoadingLiveData", "Lcom/untis/mobile/api/schoolsearch/SchoolSearchSchool;", "c", "Lcom/untis/mobile/api/schoolsearch/SchoolSearchSchool;", "e", "()Lcom/untis/mobile/api/schoolsearch/SchoolSearchSchool;", "p", "(Lcom/untis/mobile/api/schoolsearch/SchoolSearchSchool;)V", "school", "Lcom/untis/mobile/analytics/base/b;", "b", "Lcom/untis/mobile/analytics/base/b;", "analyticsTracker", "", "f", "J", "()J", "q", "(J)V", "token", "Lcom/untis/mobile/services/profile/legacy/a;", "a", "Lcom/untis/mobile/services/profile/legacy/a;", "profileService", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "o", "(Ljava/lang/String;)V", "pwd", "value", "g", "r", "userName", "mLiveData", "<init>", "(Lcom/untis/mobile/services/profile/legacy/a;Lcom/untis/mobile/analytics/base/b;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class v extends w0
{
    @e
    private final a a;
    @e
    private final b b;
    public SchoolSearchSchool c;
    @e
    private String d;
    @e
    private String e;
    private long f;
    @e
    private final k0<s> g;
    @e
    private final k0<Boolean> h;
    
    public v(@e final a a, @e final b b) {
        kotlin.jvm.internal.k0.p(a, "profileService");
        kotlin.jvm.internal.k0.p(b, "analyticsTracker");
        this.a = a;
        this.b = b;
        this.d = "";
        this.e = "";
        this.g = (k0<s>)new k0((Object)new s(null, null, false, false, 15, null));
        this.h = (k0<Boolean>)new k0((Object)Boolean.FALSE);
    }
    
    private final void h(final Profile profile) {
        this.h.n((Object)Boolean.TRUE);
        this.l();
        com.untis.mobile.services.profile.legacy.a.a.a(this.a, profile, this.e, this.f, false, 8, null).Q3(rx.android.schedulers.a.c()).C5((rx.functions.b)new t(this), (rx.functions.b)new u(this));
    }
    
    private static final void i(final v v, final Profile profile) {
        kotlin.jvm.internal.k0.p(v, "this$0");
        final a a = v.a;
        kotlin.jvm.internal.k0.o(profile, "profile");
        a.h(profile);
        final k0<s> g = v.g;
        final s s = (s)((LiveData)g).f();
        final boolean b = s != null && s.c();
        final s s2 = (s)((LiveData)v.g).f();
        g.n((Object)new s(profile, null, b, s2 != null && s2.a(), 2, null));
    }
    
    private static final void j(final v v, final Throwable t) {
        kotlin.jvm.internal.k0.p(v, "this$0");
        Throwable cause;
        if ((cause = t.getCause()) == null) {
            cause = t;
        }
        if (cause instanceof JsonRpcError && ((JsonRpcError)cause).isAnyOf(JsonRpcErrorType.Require2FactorAuthenticationToken)) {
            final k0<s> g = v.g;
            final s s = (s)((LiveData)g).f();
            g.n((Object)new s(null, null, true, s != null && s.a(), 3, null));
        }
        else {
            final k0<s> g2 = v.g;
            final s s2 = (s)((LiveData)g2).f();
            final boolean b = s2 != null && s2.c();
            final s s3 = (s)((LiveData)v.g).f();
            g2.n((Object)new s(null, t, b, s3 != null && s3.a(), 1, null));
        }
        v.h.n((Object)Boolean.FALSE);
    }
    
    private final void l() {
        this.b.c(com.untis.mobile.analytics.base.c.d.H);
    }
    
    @e
    public final String d() {
        return this.e;
    }
    
    @e
    public final SchoolSearchSchool e() {
        final SchoolSearchSchool c = this.c;
        if (c != null) {
            return c;
        }
        kotlin.jvm.internal.k0.S("school");
        throw null;
    }
    
    public final long f() {
        return this.f;
    }
    
    @e
    public final String g() {
        return this.d;
    }
    
    @e
    public final LiveData<s> k() {
        return (LiveData<s>)this.g;
    }
    
    public final boolean m(@e final String s, @e final String s2) {
        kotlin.jvm.internal.k0.p(s, "userLogin");
        kotlin.jvm.internal.k0.p(s2, "schoolLogin");
        return this.a.p(new Profile(0L, s, null, null, 0L, null, 0L, null, null, null, null, null, false, false, 0L, null, s2, null, 0L, null, false, null, 0L, 0, null, null, false, false, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, null, 0L, false, null, null, null, null, null, null, 0L, false, 0L, -65539, 65535, null));
    }
    
    public final void o(@e final String e) {
        kotlin.jvm.internal.k0.p(e, "<set-?>");
        this.e = e;
    }
    
    public final void p(@e final SchoolSearchSchool c) {
        kotlin.jvm.internal.k0.p(c, "<set-?>");
        this.c = c;
    }
    
    public final void q(final long f) {
        this.f = f;
    }
    
    public final void r(@e final String d) {
        kotlin.jvm.internal.k0.p(d, "value");
        this.d = d;
        final k0<s> g = this.g;
        final s s = (s)((LiveData)g).f();
        g.n((Object)new s(null, null, s != null && s.c(), kotlin.text.s.U1((CharSequence)d) ^ true, 3, null));
    }
    
    @e
    public final LiveData<Boolean> s() {
        return (LiveData<Boolean>)this.h;
    }
    
    @e
    public final k2 t() {
        return kotlinx.coroutines.h.f(x0.a((w0)this), (g)null, (u0)null, (p)new p<r0, d<? super j2>, Object>() {
            int G;
            final /* synthetic */ v H;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ v H = this.H;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((v$a)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G == 0) {
                    c1.n(o);
                    final Profile profile = new Profile(0L, null, null, null, 0L, null, 0L, null, null, null, null, null, false, false, 0L, null, null, null, 0L, null, false, null, 0L, 0, null, null, false, false, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, null, 0L, false, null, null, null, null, null, null, 0L, false, 0L, -1, 65535, null);
                    profile.setUserLogin("#anonymous#");
                    profile.setSchoolLogin(this.H.e().getLoginName());
                    profile.setSchoolUseMobileService(false);
                    profile.setSchoolServerUrl(this.H.e().getServer());
                    profile.setSchoolDisplayName(this.H.e().getDisplayName());
                    v.this.h(profile);
                    return j2.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }, 3, (Object)null);
    }
    
    @e
    public final k2 u() {
        return kotlinx.coroutines.h.f(x0.a((w0)this), (g)null, (u0)null, (p)new p<r0, d<? super j2>, Object>() {
            int G;
            final /* synthetic */ v H;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ v H = this.H;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((v$b)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G == 0) {
                    c1.n(o);
                    final Profile profile = new Profile(0L, null, null, null, 0L, null, 0L, null, null, null, null, null, false, false, 0L, null, null, null, 0L, null, false, null, 0L, 0, null, null, false, false, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, null, 0L, false, null, null, null, null, null, null, 0L, false, 0L, -1, 65535, null);
                    profile.setUserLogin(this.H.g());
                    profile.setSchoolLogin(this.H.e().getLoginName());
                    profile.setSchoolUseMobileService(false);
                    profile.setSchoolServerUrl(this.H.e().getServer());
                    profile.setSchoolDisplayName(this.H.e().getDisplayName());
                    v.this.h(profile);
                    return j2.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }, 3, (Object)null);
    }
}
