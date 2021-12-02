// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.profile;

import kotlinx.coroutines.u0;
import kotlinx.coroutines.m0;
import kotlinx.coroutines.h;
import org.joda.time.t;
import java.util.Set;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.api.common.JsonRpcErrorType;
import com.untis.mobile.api.error.JsonRpcError;
import kotlinx.coroutines.i1;
import kotlin.c1;
import kotlin.coroutines.jvm.internal.o;
import kotlin.j2;
import kotlin.coroutines.d;
import kotlinx.coroutines.r0;
import n6.p;
import androidx.lifecycle.x0;
import kotlinx.coroutines.k2;
import androidx.lifecycle.LiveData;
import com.untis.mobile.analytics.base.c;
import kotlin.text.s;
import kotlin.jvm.internal.w;
import kotlin.coroutines.g;
import kotlinx.coroutines.CoroutineExceptionHandler;
import androidx.lifecycle.k0;
import org.jetbrains.annotations.f;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.analytics.base.b;
import org.jetbrains.annotations.e;
import com.untis.mobile.services.profile.legacy.a;
import kotlin.Metadata;
import androidx.lifecycle.w0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010=\u001a\u00020:\u0012\u0006\u0010+\u001a\u00020(¢\u0006\u0004\bH\u0010IJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006J\u0010\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fJ\u0010\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010J\u0006\u0010\u0013\u001a\u00020\u000eR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00070#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001c\u00100\u001a\b\u0012\u0004\u0012\u00020\u00020#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010%R\u001c\u00102\u001a\b\u0012\u0004\u0012\u00020\u00020#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010%R*\u00109\u001a\u00020\f2\u0006\u00103\u001a\u00020\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b-\u00106\"\u0004\b7\u00108R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\"\u0010A\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u00105\u001a\u0004\b?\u00106\"\u0004\b@\u00108R*\u0010D\u001a\u00020\f2\u0006\u00103\u001a\u00020\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bB\u00105\u001a\u0004\b1\u00106\"\u0004\bC\u00108R*\u0010G\u001a\u00020\f2\u0006\u00103\u001a\u00020\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bE\u00105\u001a\u0004\b$\u00106\"\u0004\bF\u00108¨\u0006J" }, d2 = { "Lcom/untis/mobile/ui/activities/profile/f0;", "Landroidx/lifecycle/w0;", "", "j", "Lkotlin/j2;", "r", "Landroidx/lifecycle/LiveData;", "Lcom/untis/mobile/ui/activities/profile/c0;", "q", "A", "k", "B", "", "profileId", "Lkotlinx/coroutines/k2;", "t", "Lcom/untis/mobile/ui/activities/profile/v0;", "data", "u", "s", "Lcom/untis/mobile/persistence/models/profile/Profile;", "c", "Lcom/untis/mobile/persistence/models/profile/Profile;", "mProfile", "d", "Lcom/untis/mobile/ui/activities/profile/v0;", "mQrCodeData", "", "i", "J", "p", "()J", "z", "(J)V", "userToken", "Landroidx/lifecycle/k0;", "m", "Landroidx/lifecycle/k0;", "mShowTokenLiveData", "mLiveData", "Lcom/untis/mobile/analytics/base/b;", "b", "Lcom/untis/mobile/analytics/base/b;", "analyticsTracker", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "n", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "errorHandler", "mShowLoadingLiveData", "l", "mEnableLoginLiveData", "value", "g", "Ljava/lang/String;", "()Ljava/lang/String;", "x", "(Ljava/lang/String;)V", "userLogin", "Lcom/untis/mobile/services/profile/legacy/a;", "a", "Lcom/untis/mobile/services/profile/legacy/a;", "profileService", "h", "o", "y", "userSecret", "e", "v", "schoolLogin", "f", "w", "schoolUrl", "<init>", "(Lcom/untis/mobile/services/profile/legacy/a;Lcom/untis/mobile/analytics/base/b;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class f0 extends w0
{
    @e
    private final a a;
    @e
    private final b b;
    @f
    private Profile c;
    @f
    private v0 d;
    @e
    private String e;
    @e
    private String f;
    @e
    private String g;
    @e
    private String h;
    private long i;
    @e
    private final k0<c0> j;
    @e
    private final k0<Boolean> k;
    @e
    private final k0<Boolean> l;
    @e
    private final k0<Boolean> m;
    @e
    private final CoroutineExceptionHandler n;
    
    public f0(@e final a a, @e final b b) {
        kotlin.jvm.internal.k0.p(a, "profileService");
        kotlin.jvm.internal.k0.p(b, "analyticsTracker");
        this.a = a;
        this.b = b;
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.j = (k0<c0>)new k0();
        final Boolean false = Boolean.FALSE;
        this.k = (k0<Boolean>)new k0((Object)false);
        this.l = (k0<Boolean>)new k0((Object)false);
        this.m = (k0<Boolean>)new k0((Object)false);
        this.n = (CoroutineExceptionHandler)new CoroutineExceptionHandler(CoroutineExceptionHandler.s) {
            final /* synthetic */ f0 G;
            
            public void handleException(@e final g g, @e final Throwable t) {
                f0.a(this.G).n((Object)new c0(null, false, null, null, null, null, t, 63, null));
            }
        };
    }
    
    public static final /* synthetic */ k0 a(final f0 f0) {
        return f0.j;
    }
    
    public static final /* synthetic */ Profile b(final f0 f0) {
        return f0.c;
    }
    
    public static final /* synthetic */ v0 c(final f0 f0) {
        return f0.d;
    }
    
    public static final /* synthetic */ k0 d(final f0 f0) {
        return f0.k;
    }
    
    public static final /* synthetic */ k0 e(final f0 f0) {
        return f0.m;
    }
    
    public static final /* synthetic */ a f(final f0 f0) {
        return f0.a;
    }
    
    public static final /* synthetic */ void h(final f0 f0, final Profile c) {
        f0.c = c;
    }
    
    public static final /* synthetic */ void i(final f0 f0, final v0 d) {
        f0.d = d;
    }
    
    private final boolean j() {
        return !s.U1((CharSequence)this.e) && !s.U1((CharSequence)this.f) && !s.U1((CharSequence)this.g);
    }
    
    private final void r() {
        final v0 d = this.d;
        b b;
        c.d d2;
        if (d != null) {
            b = this.b;
            d2 = com.untis.mobile.analytics.base.c.d.J;
        }
        else {
            if (this.c != null || d != null) {
                return;
            }
            b = this.b;
            d2 = com.untis.mobile.analytics.base.c.d.I;
        }
        b.c(d2);
    }
    
    @e
    public final LiveData<Boolean> A() {
        return (LiveData<Boolean>)this.k;
    }
    
    @e
    public final LiveData<Boolean> B() {
        return (LiveData<Boolean>)this.m;
    }
    
    @e
    public final LiveData<Boolean> k() {
        return (LiveData<Boolean>)this.l;
    }
    
    @e
    public final String l() {
        return this.e;
    }
    
    @e
    public final String m() {
        return this.f;
    }
    
    @e
    public final String n() {
        return this.g;
    }
    
    @e
    public final String o() {
        return this.h;
    }
    
    public final long p() {
        return this.i;
    }
    
    @e
    public final LiveData<c0> q() {
        return (LiveData<c0>)this.j;
    }
    
    @e
    public final k2 s() {
        return kotlinx.coroutines.h.f(x0.a((w0)this), (g)this.n, (u0)null, (p)new p<r0, d<? super j2>, Object>() {
            int G;
            final /* synthetic */ f0 H;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ f0 H = this.H;
                };
            }
            
            @f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @f final kotlin.coroutines.d<? super j2> d) {
                return ((f0$a)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                if (g != 0) {
                    if (g != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(o);
                }
                else {
                    c1.n(o);
                    final m0 c = i1.c();
                    final p<r0, kotlin.coroutines.d<? super j2>, Object> p = new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                        int G;
                        final /* synthetic */ f0 H;
                        
                        private static final void q(final f0 f0, final Profile profile) {
                            final com.untis.mobile.services.profile.legacy.a f2 = f0.f(f0);
                            kotlin.jvm.internal.k0.o(profile, "profile");
                            f2.h(profile);
                            f0.a(f0).n((Object)new c0(profile, false, null, null, null, null, null, 126, null));
                            f0.d(f0).n((Object)Boolean.FALSE);
                        }
                        
                        private static final void s(final f0 f0, final Throwable t) {
                            f0.d(f0).n((Object)Boolean.FALSE);
                            if (t instanceof JsonRpcError && ((JsonRpcError)t).isAnyOf(JsonRpcErrorType.Require2FactorAuthenticationToken)) {
                                f0.e(f0).n((Object)Boolean.TRUE);
                                return;
                            }
                            f0.a(f0).n((Object)new c0(null, false, null, null, null, null, t, 63, null));
                        }
                        
                        @org.jetbrains.annotations.e
                        @Override
                        public final kotlin.coroutines.d<j2> create(@f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                            return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                                int G;
                                final /* synthetic */ f0 H = this.H;
                                
                                private static final void q(final f0 f0, final Profile profile) {
                                    final com.untis.mobile.services.profile.legacy.a f2 = f0.f(f0);
                                    kotlin.jvm.internal.k0.o(profile, "profile");
                                    f2.h(profile);
                                    f0.a(f0).n((Object)new c0(profile, false, null, null, null, null, null, 126, null));
                                    f0.d(f0).n((Object)Boolean.FALSE);
                                }
                                
                                private static final void s(final f0 f0, final Throwable t) {
                                    f0.d(f0).n((Object)Boolean.FALSE);
                                    if (t instanceof JsonRpcError && ((JsonRpcError)t).isAnyOf(JsonRpcErrorType.Require2FactorAuthenticationToken)) {
                                        f0.e(f0).n((Object)Boolean.TRUE);
                                        return;
                                    }
                                    f0.a(f0).n((Object)new c0(null, false, null, null, null, null, t, 63, null));
                                }
                            };
                        }
                        
                        @f
                        @Override
                        public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @f final kotlin.coroutines.d<? super j2> d) {
                            return ((f0$a$a)this.create(r0, d)).invokeSuspend(j2.a);
                        }
                        
                        @f
                        public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                            kotlin.coroutines.intrinsics.b.h();
                            if (this.G == 0) {
                                c1.n(o);
                                Profile b;
                                if ((b = f0.b(this.H)) == null) {
                                    b = new Profile(0L, null, null, null, 0L, null, 0L, null, null, null, null, null, false, false, 0L, null, null, null, 0L, null, false, null, 0L, 0, null, null, false, false, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, null, 0L, false, null, null, null, null, null, null, 0L, false, 0L, -1, 65535, null);
                                }
                                b.setSchoolLogin(this.H.l());
                                b.setSchoolServerUrl(this.H.m());
                                b.setUserLogin(this.H.n());
                                b.setUserAppSharedSecret(this.H.o());
                                f0.d(this.H).n((Object)kotlin.coroutines.jvm.internal.b.a(true));
                                this.H.r();
                                f0.f(this.H).m(b, this.H.o(), this.H.p(), f0.c(this.H) != null).C5((rx.functions.b)new com.untis.mobile.ui.activities.profile.d0(this.H), (rx.functions.b)new e0(this.H));
                                return j2.a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    };
                    this.G = 1;
                    if (kotlinx.coroutines.h.i((g)c, (p)p, (kotlin.coroutines.d)this) == h) {
                        return h;
                    }
                }
                return j2.a;
            }
        }, 2, (Object)null);
    }
    
    @e
    public final k2 t(@f final String s) {
        return kotlinx.coroutines.h.f(x0.a((w0)this), (g)null, (u0)null, (p)new p<r0, d<? super j2>, Object>() {
            int G;
            final /* synthetic */ String H;
            final /* synthetic */ f0 I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ String H = this.H;
                    final /* synthetic */ f0 I = this.I;
                };
            }
            
            @f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @f final kotlin.coroutines.d<? super j2> d) {
                return ((f0$b)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c1.n(o);
                final String h = this.H;
                if (h == null || s.U1((CharSequence)h)) {
                    return j2.a;
                }
                f0.d(this.I).n((Object)kotlin.coroutines.jvm.internal.b.a(true));
                final Profile l = f0.f(this.I).l(this.H);
                f0.h(this.I, l);
                final f0 i = this.I;
                String schoolLogin;
                if (l == null || (schoolLogin = l.getSchoolLogin()) == null) {
                    schoolLogin = "";
                }
                i.v(schoolLogin);
                final f0 j = this.I;
                String schoolServerUrl;
                if (l == null || (schoolServerUrl = l.getSchoolServerUrl()) == null) {
                    schoolServerUrl = "";
                }
                j.w(schoolServerUrl);
                final f0 k = this.I;
                String userLogin;
                if (l == null || (userLogin = l.getUserLogin()) == null) {
                    userLogin = "";
                }
                k.x(userLogin);
                final f0 m = this.I;
                String userAppSharedSecret;
                if (l == null || (userAppSharedSecret = l.getUserAppSharedSecret()) == null) {
                    userAppSharedSecret = "";
                }
                m.y(userAppSharedSecret);
                final k0 a = f0.a(this.I);
                String schoolLogin2 = null;
                Label_0275: {
                    if (l != null) {
                        schoolLogin2 = l.getSchoolLogin();
                        if (schoolLogin2 != null) {
                            break Label_0275;
                        }
                    }
                    schoolLogin2 = "";
                }
                String schoolServerUrl2 = null;
                Label_0300: {
                    if (l != null) {
                        schoolServerUrl2 = l.getSchoolServerUrl();
                        if (schoolServerUrl2 != null) {
                            break Label_0300;
                        }
                    }
                    schoolServerUrl2 = "";
                }
                String userLogin2 = null;
                Label_0325: {
                    if (l != null) {
                        userLogin2 = l.getUserLogin();
                        if (userLogin2 != null) {
                            break Label_0325;
                        }
                    }
                    userLogin2 = "";
                }
                String userAppSharedSecret2 = null;
                Label_0347: {
                    if (l != null) {
                        userAppSharedSecret2 = l.getUserAppSharedSecret();
                        if (userAppSharedSecret2 != null) {
                            break Label_0347;
                        }
                    }
                    userAppSharedSecret2 = "";
                }
                a.n((Object)new c0(null, true, schoolLogin2, schoolServerUrl2, userLogin2, userAppSharedSecret2, null, 65, null));
                f0.d(this.I).n((Object)kotlin.coroutines.jvm.internal.b.a(false));
                return j2.a;
            }
        }, 3, (Object)null);
    }
    
    @e
    public final k2 u(@f final v0 v0) {
        return kotlinx.coroutines.h.f(x0.a((w0)this), (g)null, (u0)null, (p)new p<r0, d<? super j2>, Object>() {
            int G;
            final /* synthetic */ f0 H;
            final /* synthetic */ v0 I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ f0 H = this.H;
                    final /* synthetic */ v0 I = this.I;
                };
            }
            
            @f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @f final kotlin.coroutines.d<? super j2> d) {
                return ((f0$c)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c1.n(o);
                f0.i(this.H, this.I);
                if (this.I == null) {
                    return j2.a;
                }
                f0.d(this.H).n((Object)kotlin.coroutines.jvm.internal.b.a(true));
                this.H.v(this.I.b());
                this.H.w(this.I.c());
                this.H.x(this.I.e());
                this.H.y(this.I.d());
                f0.a(this.H).n((Object)new c0(null, false, this.I.b(), this.I.c(), this.I.e(), this.I.d(), null, 67, null));
                f0.d(this.H).n((Object)kotlin.coroutines.jvm.internal.b.a(false));
                return j2.a;
            }
        }, 3, (Object)null);
    }
    
    public final void v(@e final String e) {
        kotlin.jvm.internal.k0.p(e, "value");
        this.e = e;
        this.l.n((Object)this.j());
    }
    
    public final void w(@e final String f) {
        kotlin.jvm.internal.k0.p(f, "value");
        this.f = f;
        this.l.n((Object)this.j());
    }
    
    public final void x(@e final String g) {
        kotlin.jvm.internal.k0.p(g, "value");
        this.g = g;
        this.l.n((Object)this.j());
    }
    
    public final void y(@e final String h) {
        kotlin.jvm.internal.k0.p(h, "<set-?>");
        this.h = h;
    }
    
    public final void z(final long i) {
        this.i = i;
    }
}
