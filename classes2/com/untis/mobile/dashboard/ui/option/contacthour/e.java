// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.ui.option.contacthour;

import java.net.ConnectException;
import com.untis.mobile.persistence.models.EntityType;
import androidx.lifecycle.LiveData;
import kotlin.collections.v;
import kotlin.text.s;
import com.untis.mobile.utils.d0;
import com.untis.mobile.persistence.models.masterdata.Klasse;
import java.util.Iterator;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.h;
import kotlin.jvm.internal.m0;
import n6.l;
import kotlinx.coroutines.i1;
import kotlin.coroutines.jvm.internal.o;
import kotlinx.coroutines.r0;
import n6.p;
import androidx.lifecycle.x0;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.CoroutineExceptionHandler;
import com.untis.mobile.services.profile.legacy.j0;
import com.untis.mobile.utils.settings.c;
import org.joda.time.t;
import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.j2;
import kotlin.coroutines.d;
import com.untis.mobile.dashboard.persistence.model.contacthour.DashboardContactHour;
import java.util.List;
import androidx.lifecycle.k0;
import com.untis.mobile.dashboard.service.a;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.utils.settings.g;
import android.content.Context;
import kotlin.Metadata;
import androidx.lifecycle.w0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u00102\u001a\u00020/\u0012\u0006\u0010*\u001a\u00020'¢\u0006\u0004\bC\u0010DJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0082@\u00f8\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u0002H\u0082@\u00f8\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0006\u0010\b\u001a\u00020\u0002J\u0014\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\tJ\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rJ\u0016\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0014\u001a\u00020\u0011J\u0016\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0006J\u0016\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0006J\u001e\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aJ\u0016\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u000bJ\u0006\u0010\u001f\u001a\u00020\u001eJ\u0019\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\nH\u0086@\u00f8\u0001\u0000¢\u0006\u0004\b!\u0010\u0004J\u0013\u0010\"\u001a\u00020\u001eH\u0086@\u00f8\u0001\u0000¢\u0006\u0004\b\"\u0010\u0004J\u0006\u0010#\u001a\u00020\u001eJ\u0006\u0010%\u001a\u00020$J\u000e\u0010&\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rR\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R$\u0010.\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0+8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u00105R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0016\u0010B\u001a\u00020?8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b@\u0010A\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006E" }, d2 = { "Lcom/untis/mobile/dashboard/ui/option/contacthour/e;", "Landroidx/lifecycle/w0;", "Lkotlin/j2;", "k", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "l", "", "p", "A", "Landroidx/lifecycle/LiveData;", "", "Lcom/untis/mobile/dashboard/persistence/model/contacthour/DashboardContactHour;", "r", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "errorHandler", "Lkotlinx/coroutines/k2;", "v", "Lorg/joda/time/t;", "date", "y", "q", "klassenId", "x", "webUntisId", "j", "contactHour", "", "position", "B", "i", "", "t", "Lcom/untis/mobile/persistence/models/masterdata/Klasse;", "o", "m", "n", "Lcom/untis/mobile/persistence/models/EntityType;", "u", "w", "Lcom/untis/mobile/utils/settings/g;", "b", "Lcom/untis/mobile/utils/settings/g;", "settings", "Landroidx/lifecycle/k0;", "f", "Landroidx/lifecycle/k0;", "contactHourLiveData", "Landroid/content/Context;", "a", "Landroid/content/Context;", "context", "Lcom/untis/mobile/persistence/models/profile/Profile;", "c", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Lcom/untis/mobile/services/masterdata/a;", "e", "Lcom/untis/mobile/services/masterdata/a;", "s", "()Lcom/untis/mobile/services/masterdata/a;", "z", "(Lcom/untis/mobile/services/masterdata/a;)V", "masterDataService", "Lcom/untis/mobile/dashboard/service/a;", "d", "Lcom/untis/mobile/dashboard/service/a;", "dashboardService", "<init>", "(Landroid/content/Context;Lcom/untis/mobile/utils/settings/g;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class e extends w0
{
    @org.jetbrains.annotations.e
    private final Context a;
    @org.jetbrains.annotations.e
    private final g b;
    private Profile c;
    private a d;
    public com.untis.mobile.services.masterdata.a e;
    @org.jetbrains.annotations.e
    private final k0<List<DashboardContactHour>> f;
    
    public e(@org.jetbrains.annotations.e final Context a, @org.jetbrains.annotations.e final g b) {
        kotlin.jvm.internal.k0.p(a, "context");
        kotlin.jvm.internal.k0.p(b, "settings");
        this.a = a;
        this.b = b;
        this.f = (k0<List<DashboardContactHour>>)new k0((Object)null);
    }
    
    public static final /* synthetic */ k0 c(final e e) {
        return e.f;
    }
    
    public static final /* synthetic */ Context d(final e e) {
        return e.a;
    }
    
    public static final /* synthetic */ a e(final e e) {
        return e.d;
    }
    
    public static final /* synthetic */ Profile g(final e e) {
        return e.c;
    }
    
    public static final /* synthetic */ g h(final e e) {
        return e.b;
    }
    
    private final Object k(final d<? super j2> d) {
        kotlin.coroutines.jvm.internal.d d3 = null;
        Label_0047: {
            if (d instanceof e$c) {
                final kotlin.coroutines.jvm.internal.d d2 = (e$c)d;
                final int j = d2.J;
                if ((j & Integer.MIN_VALUE) != 0x0) {
                    d2.J = j + Integer.MIN_VALUE;
                    d3 = d2;
                    break Label_0047;
                }
            }
            d3 = new kotlin.coroutines.jvm.internal.d(d) {
                Object G;
                /* synthetic */ Object H;
                int J;
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@e final Object h) {
                    this.H = h;
                    this.J |= Integer.MIN_VALUE;
                    return e.this.k(this);
                }
            };
        }
        Object h = d3.H;
        final Object h2 = kotlin.coroutines.intrinsics.b.h();
        final int i = d3.J;
        k0 k0;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k0 = (k0)d3.G;
            c1.n(h);
        }
        else {
            c1.n(h);
            final k0<List<DashboardContactHour>> f = this.f;
            final a d4 = this.d;
            if (d4 == null) {
                kotlin.jvm.internal.k0.S("dashboardService");
                throw null;
            }
            d3.G = f;
            d3.J = 1;
            final Object l = d4.i(d3);
            if (l == h2) {
                return h2;
            }
            k0 = f;
            h = l;
        }
        k0.q(h);
        return j2.a;
    }
    
    private final Object l(final d<? super j2> d) {
        kotlin.coroutines.jvm.internal.d d3 = null;
        Label_0047: {
            if (d instanceof e$d) {
                final kotlin.coroutines.jvm.internal.d d2 = (e$d)d;
                final int j = d2.J;
                if ((j & Integer.MIN_VALUE) != 0x0) {
                    d2.J = j + Integer.MIN_VALUE;
                    d3 = d2;
                    break Label_0047;
                }
            }
            d3 = new kotlin.coroutines.jvm.internal.d(d) {
                Object G;
                /* synthetic */ Object H;
                int J;
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@e final Object h) {
                    this.H = h;
                    this.J |= Integer.MIN_VALUE;
                    return e.this.l(this);
                }
            };
        }
        Object h = d3.H;
        final Object h2 = kotlin.coroutines.intrinsics.b.h();
        final int i = d3.J;
        k0 k0;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k0 = (k0)d3.G;
            c1.n(h);
        }
        else {
            c1.n(h);
            final k0<List<DashboardContactHour>> f = this.f;
            final a d4 = this.d;
            if (d4 == null) {
                kotlin.jvm.internal.k0.S("dashboardService");
                throw null;
            }
            final t q = this.q();
            final long p = this.p();
            d3.G = f;
            d3.J = 1;
            final Object b = d4.b(q, p, d3);
            if (b == h2) {
                return h2;
            }
            k0 = f;
            h = b;
        }
        k0.q(h);
        return j2.a;
    }
    
    private final long p() {
        final g b = this.b;
        final Profile c = this.c;
        if (c != null) {
            return com.untis.mobile.utils.settings.c.d(b, c.getId());
        }
        kotlin.jvm.internal.k0.S("profile");
        throw null;
    }
    
    public final void A() {
        final Profile n = j0.G.n();
        if (n == null) {
            throw new IllegalStateException("no profile");
        }
        this.c = n;
        final Context a = this.a;
        final Profile c = this.c;
        if (c == null) {
            kotlin.jvm.internal.k0.S("profile");
            throw null;
        }
        this.d = new com.untis.mobile.dashboard.service.b(a, c.getUniqueId());
        final com.untis.mobile.services.masterdata.b.a z = com.untis.mobile.services.masterdata.b.Z;
        final Profile c2 = this.c;
        if (c2 != null) {
            this.z(z.a(c2.getUniqueId()));
            return;
        }
        kotlin.jvm.internal.k0.S("profile");
        throw null;
    }
    
    @org.jetbrains.annotations.e
    public final k2 B(@org.jetbrains.annotations.e final CoroutineExceptionHandler coroutineExceptionHandler, @org.jetbrains.annotations.e final DashboardContactHour dashboardContactHour, final int n) throws y3.c {
        kotlin.jvm.internal.k0.p(coroutineExceptionHandler, "errorHandler");
        kotlin.jvm.internal.k0.p(dashboardContactHour, "contactHour");
        return h.f(x0.a((w0)this), (kotlin.coroutines.g)coroutineExceptionHandler, (u0)null, (p)new p<r0, d<? super j2>, Object>(null) {
            Object G;
            int H;
            final /* synthetic */ e I;
            final /* synthetic */ DashboardContactHour J;
            final /* synthetic */ int K;
            
            @e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>(d) {
                    Object G;
                    int H;
                    final /* synthetic */ e I = this.I;
                    final /* synthetic */ DashboardContactHour J = this.J;
                    final /* synthetic */ int K = this.K;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((e$k)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@e Object d) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int h2 = this.H;
                k0 k0 = null;
                Object i = null;
                Label_0179: {
                    if (h2 != 0) {
                        if (h2 != 1) {
                            if (h2 == 2) {
                                k0 = (k0)this.G;
                                c1.n(d);
                                i = d;
                                break Label_0179;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        else {
                            c1.n(d);
                        }
                    }
                    else {
                        c1.n(d);
                        final com.untis.mobile.dashboard.service.a e = com.untis.mobile.dashboard.ui.option.contacthour.e.e(this.I);
                        if (e == null) {
                            kotlin.jvm.internal.k0.S("dashboardService");
                            throw null;
                        }
                        final DashboardContactHour j = this.J;
                        final int l = this.K;
                        this.H = 1;
                        if ((d = e.d(j, l, this)) == h) {
                            return h;
                        }
                    }
                    final DashboardContactHour dashboardContactHour = (DashboardContactHour)d;
                    final k0 c = e.c(this.I);
                    final kotlinx.coroutines.m0 c2 = i1.c();
                    final p<r0, kotlin.coroutines.d<? super List<? extends DashboardContactHour>>, Object> p = new p<r0, kotlin.coroutines.d<? super List<? extends DashboardContactHour>>, Object>() {
                        int G;
                        final /* synthetic */ e H;
                        final /* synthetic */ DashboardContactHour I;
                        
                        @e
                        @Override
                        public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @e final kotlin.coroutines.d<?> d) {
                            return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super List<? extends DashboardContactHour>>, Object>() {
                                int G;
                                final /* synthetic */ e H = this.H;
                                final /* synthetic */ DashboardContactHour I = this.I;
                            };
                        }
                        
                        @org.jetbrains.annotations.f
                        @Override
                        public final Object invoke(@e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super List<DashboardContactHour>> d) {
                            return ((e$k$a)this.create(r0, d)).invokeSuspend(j2.a);
                        }
                        
                        @org.jetbrains.annotations.f
                        public final Object invokeSuspend(@e final Object o) {
                            kotlin.coroutines.intrinsics.b.h();
                            if (this.G == 0) {
                                c1.n(o);
                                final List list = (List)((LiveData)e.c(this.H)).f();
                                Object c;
                                if (list == null) {
                                    c = null;
                                }
                                else {
                                    final DashboardContactHour i = this.I;
                                    c = com.untis.mobile.utils.extension.c.c(list, i, new l<DashboardContactHour, Boolean>() {
                                        public final boolean a(@e final DashboardContactHour dashboardContactHour) {
                                            kotlin.jvm.internal.k0.p(dashboardContactHour, "it");
                                            return dashboardContactHour.getWuId() == i.getWuId();
                                        }
                                    });
                                }
                                return c;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    };
                    this.G = c;
                    this.H = 2;
                    i = kotlinx.coroutines.h.i((kotlin.coroutines.g)c2, (p)p, (kotlin.coroutines.d)this);
                    if (i == h) {
                        return h;
                    }
                    k0 = c;
                }
                k0.q(i);
                return j2.a;
            }
        }, 2, (Object)null);
    }
    
    @org.jetbrains.annotations.e
    public final k2 i(@org.jetbrains.annotations.e final CoroutineExceptionHandler coroutineExceptionHandler, @org.jetbrains.annotations.e final DashboardContactHour dashboardContactHour) {
        kotlin.jvm.internal.k0.p(coroutineExceptionHandler, "errorHandler");
        kotlin.jvm.internal.k0.p(dashboardContactHour, "contactHour");
        return h.f(x0.a((w0)this), (kotlin.coroutines.g)coroutineExceptionHandler, (u0)null, (p)new p<r0, d<? super j2>, Object>() {
            Object G;
            int H;
            final /* synthetic */ e I;
            final /* synthetic */ DashboardContactHour J;
            
            @e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    Object G;
                    int H;
                    final /* synthetic */ e I = this.I;
                    final /* synthetic */ DashboardContactHour J = this.J;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((e$a)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@e Object c) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int h2 = this.H;
                k0 k0 = null;
                Object i = null;
                Label_0172: {
                    if (h2 != 0) {
                        if (h2 != 1) {
                            if (h2 == 2) {
                                k0 = (k0)this.G;
                                c1.n(c);
                                i = c;
                                break Label_0172;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        else {
                            c1.n(c);
                        }
                    }
                    else {
                        c1.n(c);
                        final com.untis.mobile.dashboard.service.a e = com.untis.mobile.dashboard.ui.option.contacthour.e.e(this.I);
                        if (e == null) {
                            kotlin.jvm.internal.k0.S("dashboardService");
                            throw null;
                        }
                        final DashboardContactHour j = this.J;
                        this.H = 1;
                        if ((c = e.c(j, this)) == h) {
                            return h;
                        }
                    }
                    final DashboardContactHour dashboardContactHour = (DashboardContactHour)c;
                    final k0 c2 = e.c(this.I);
                    final kotlinx.coroutines.m0 c3 = i1.c();
                    final p<r0, kotlin.coroutines.d<? super List<? extends DashboardContactHour>>, Object> p = new p<r0, kotlin.coroutines.d<? super List<? extends DashboardContactHour>>, Object>() {
                        int G;
                        final /* synthetic */ e H;
                        final /* synthetic */ DashboardContactHour I;
                        
                        @e
                        @Override
                        public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @e final kotlin.coroutines.d<?> d) {
                            return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super List<? extends DashboardContactHour>>, Object>() {
                                int G;
                                final /* synthetic */ e H = this.H;
                                final /* synthetic */ DashboardContactHour I = this.I;
                            };
                        }
                        
                        @org.jetbrains.annotations.f
                        @Override
                        public final Object invoke(@e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super List<DashboardContactHour>> d) {
                            return ((e$a$a)this.create(r0, d)).invokeSuspend(j2.a);
                        }
                        
                        @org.jetbrains.annotations.f
                        public final Object invokeSuspend(@e final Object o) {
                            kotlin.coroutines.intrinsics.b.h();
                            if (this.G == 0) {
                                c1.n(o);
                                final List list = (List)((LiveData)e.c(this.H)).f();
                                Object c;
                                if (list == null) {
                                    c = null;
                                }
                                else {
                                    final DashboardContactHour i = this.I;
                                    c = com.untis.mobile.utils.extension.c.c(list, i, new l<DashboardContactHour, Boolean>() {
                                        public final boolean a(@e final DashboardContactHour dashboardContactHour) {
                                            kotlin.jvm.internal.k0.p(dashboardContactHour, "it");
                                            return dashboardContactHour.getWuId() == i.getWuId();
                                        }
                                    });
                                }
                                return c;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    };
                    this.G = c2;
                    this.H = 2;
                    i = kotlinx.coroutines.h.i((kotlin.coroutines.g)c3, (p)p, (kotlin.coroutines.d)this);
                    if (i == h) {
                        return h;
                    }
                    k0 = c2;
                }
                k0.q(i);
                return j2.a;
            }
        }, 2, (Object)null);
    }
    
    @org.jetbrains.annotations.e
    public final k2 j(@org.jetbrains.annotations.e final CoroutineExceptionHandler coroutineExceptionHandler, final long n) {
        kotlin.jvm.internal.k0.p(coroutineExceptionHandler, "errorHandler");
        return h.f(x0.a((w0)this), (kotlin.coroutines.g)coroutineExceptionHandler, (u0)null, (p)new p<r0, d<? super j2>, Object>() {
            Object G;
            int H;
            final /* synthetic */ e I;
            final /* synthetic */ long J;
            
            @e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    Object G;
                    int H;
                    final /* synthetic */ e I = this.I;
                    final /* synthetic */ long J = this.J;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((e$b)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@e Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int h2 = this.H;
                k0 k0 = null;
                Object i = null;
                Label_0287: {
                    if (h2 != 0) {
                        if (h2 != 1) {
                            if (h2 == 2) {
                                k0 = (k0)this.G;
                                c1.n(o);
                                i = o;
                                break Label_0287;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        else {
                            c1.n(o);
                        }
                    }
                    else {
                        c1.n(o);
                        final List list = (List)((LiveData)e.c(this.I)).f();
                        DashboardContactHour dashboardContactHour = null;
                        Label_0161: {
                            if (list != null) {
                                final long j = this.J;
                                final Iterator<Object> iterator = list.iterator();
                                while (true) {
                                    while (iterator.hasNext()) {
                                        o = iterator.next();
                                        if (kotlin.coroutines.jvm.internal.b.a(((DashboardContactHour)o).getWuId() == j)) {
                                            dashboardContactHour = (DashboardContactHour)o;
                                            break Label_0161;
                                        }
                                    }
                                    o = null;
                                    continue;
                                }
                            }
                            dashboardContactHour = null;
                        }
                        if (dashboardContactHour == null) {
                            throw new IllegalStateException("invalid webUntisId");
                        }
                        final com.untis.mobile.dashboard.service.a e = com.untis.mobile.dashboard.ui.option.contacthour.e.e(this.I);
                        if (e == null) {
                            kotlin.jvm.internal.k0.S("dashboardService");
                            throw null;
                        }
                        final long wuId = dashboardContactHour.getWuId();
                        final long teacherId = dashboardContactHour.getTeacherId();
                        this.H = 1;
                        if ((o = e.f(wuId, teacherId, this)) == h) {
                            return h;
                        }
                    }
                    final DashboardContactHour dashboardContactHour2 = (DashboardContactHour)o;
                    final k0 c = e.c(this.I);
                    final kotlinx.coroutines.m0 c2 = i1.c();
                    final p<r0, kotlin.coroutines.d<? super List<? extends DashboardContactHour>>, Object> p = new p<r0, kotlin.coroutines.d<? super List<? extends DashboardContactHour>>, Object>() {
                        int G;
                        final /* synthetic */ e H;
                        final /* synthetic */ DashboardContactHour I;
                        
                        @e
                        @Override
                        public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @e final kotlin.coroutines.d<?> d) {
                            return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super List<? extends DashboardContactHour>>, Object>() {
                                int G;
                                final /* synthetic */ e H = this.H;
                                final /* synthetic */ DashboardContactHour I = this.I;
                            };
                        }
                        
                        @org.jetbrains.annotations.f
                        @Override
                        public final Object invoke(@e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super List<DashboardContactHour>> d) {
                            return ((e$b$a)this.create(r0, d)).invokeSuspend(j2.a);
                        }
                        
                        @org.jetbrains.annotations.f
                        public final Object invokeSuspend(@e final Object o) {
                            kotlin.coroutines.intrinsics.b.h();
                            if (this.G == 0) {
                                c1.n(o);
                                final List list = (List)((LiveData)e.c(this.H)).f();
                                Object c;
                                if (list == null) {
                                    c = null;
                                }
                                else {
                                    final DashboardContactHour i = this.I;
                                    c = com.untis.mobile.utils.extension.c.c(list, i, new l<DashboardContactHour, Boolean>() {
                                        public final boolean a(@e final DashboardContactHour dashboardContactHour) {
                                            kotlin.jvm.internal.k0.p(dashboardContactHour, "it");
                                            return dashboardContactHour.getWuId() == i.getWuId();
                                        }
                                    });
                                }
                                return c;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    };
                    this.G = c;
                    this.H = 2;
                    i = kotlinx.coroutines.h.i((kotlin.coroutines.g)c2, (p)p, (kotlin.coroutines.d)this);
                    if (i == h) {
                        return h;
                    }
                    k0 = c;
                }
                k0.q(i);
                return j2.a;
            }
        }, 2, (Object)null);
    }
    
    @org.jetbrains.annotations.f
    public final Object m(@org.jetbrains.annotations.e final d<? super String> d) {
        return h.i((kotlin.coroutines.g)i1.c(), (p)new p<r0, d<? super String>, Object>() {
            int G;
            final /* synthetic */ e H;
            
            @e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super String>, Object>() {
                    int G;
                    final /* synthetic */ e H = this.H;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super String> d) {
                return ((e$e)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@e final Object o) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G == 0) {
                    c1.n(o);
                    final Klasse n = this.H.s().N(e.this.p());
                    String s = "";
                    if (n != null) {
                        final String displayableTitle = n.getDisplayableTitle();
                        if (displayableTitle != null) {
                            s = displayableTitle;
                        }
                    }
                    return s;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }, (d)d);
    }
    
    @org.jetbrains.annotations.e
    public final String n() {
        final String string = this.a.getString(2131886723);
        kotlin.jvm.internal.k0.o(string, "context.getString(R.string.shared_fromX_text)");
        final g b = this.b;
        final Profile c = this.c;
        if (c != null) {
            return s.k2(string, "{0}", d0.m(com.untis.mobile.utils.settings.c.e(b, c.getId())), false, 4, (Object)null);
        }
        kotlin.jvm.internal.k0.S("profile");
        throw null;
    }
    
    @org.jetbrains.annotations.f
    public final Object o(@org.jetbrains.annotations.e final d<? super List<Klasse>> d) {
        return h.i((kotlin.coroutines.g)i1.c(), (p)new p<r0, d<? super List<? extends Klasse>>, Object>() {
            int G;
            final /* synthetic */ e H;
            
            @e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super List<? extends Klasse>>, Object>() {
                    int G;
                    final /* synthetic */ e H = this.H;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super List<Klasse>> d) {
                return ((e$f)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@e final Object o) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G == 0) {
                    c1.n(o);
                    return v.d5((Iterable<? extends Comparable>)this.H.s().f(true));
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }, (d)d);
    }
    
    @org.jetbrains.annotations.e
    public final t q() {
        final g b = this.b;
        final Profile c = this.c;
        if (c != null) {
            return com.untis.mobile.utils.settings.c.e(b, c.getId());
        }
        kotlin.jvm.internal.k0.S("profile");
        throw null;
    }
    
    @org.jetbrains.annotations.e
    public final LiveData<List<DashboardContactHour>> r() {
        return (LiveData<List<DashboardContactHour>>)this.f;
    }
    
    @org.jetbrains.annotations.e
    public final com.untis.mobile.services.masterdata.a s() {
        final com.untis.mobile.services.masterdata.a e = this.e;
        if (e != null) {
            return e;
        }
        kotlin.jvm.internal.k0.S("masterDataService");
        throw null;
    }
    
    @org.jetbrains.annotations.e
    public final String t() {
        final com.untis.mobile.services.masterdata.a s = this.s();
        final g b = this.b;
        final Profile c = this.c;
        if (c == null) {
            kotlin.jvm.internal.k0.S("profile");
            throw null;
        }
        final Klasse n = s.N(com.untis.mobile.utils.settings.c.d(b, c.getId()));
        if (n != null) {
            final StringBuilder sb = new StringBuilder();
            final String string = this.a.getString(2131886723);
            kotlin.jvm.internal.k0.o(string, "context.getString(R.string.shared_fromX_text)");
            final g b2 = this.b;
            final Profile c2 = this.c;
            if (c2 != null) {
                sb.append(kotlin.text.s.k2(string, "{0}", d0.m(com.untis.mobile.utils.settings.c.e(b2, c2.getId())), false, 4, (Object)null));
                sb.append(", ");
                sb.append(n.getDisplayableTitle());
                return sb.toString();
            }
            kotlin.jvm.internal.k0.S("profile");
            throw null;
        }
        else {
            final String string2 = this.a.getString(2131886723);
            kotlin.jvm.internal.k0.o(string2, "context.getString(R.string.shared_fromX_text)");
            final g b3 = this.b;
            final Profile c3 = this.c;
            if (c3 != null) {
                return kotlin.text.s.k2(string2, "{0}", d0.m(com.untis.mobile.utils.settings.c.e(b3, c3.getId())), false, 4, (Object)null);
            }
            kotlin.jvm.internal.k0.S("profile");
            throw null;
        }
    }
    
    @org.jetbrains.annotations.e
    public final EntityType u() {
        final Profile c = this.c;
        if (c != null) {
            return c.getEntityType();
        }
        kotlin.jvm.internal.k0.S("profile");
        throw null;
    }
    
    @org.jetbrains.annotations.e
    public final k2 v(@org.jetbrains.annotations.e final CoroutineExceptionHandler coroutineExceptionHandler) {
        kotlin.jvm.internal.k0.p(coroutineExceptionHandler, "errorHandler");
        return h.f(x0.a((w0)this), (kotlin.coroutines.g)coroutineExceptionHandler, (u0)null, (p)new p<r0, d<? super j2>, Object>() {
            int G;
            final /* synthetic */ e H;
            
            @e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ e H = this.H;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((e$g)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@e final Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                if (g != 0) {
                    if (g != 1 && g != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(o);
                }
                else {
                    c1.n(o);
                    if (com.untis.mobile.utils.extension.h.g(e.d(this.H))) {
                        final e h2 = this.H;
                        this.G = 1;
                        if (h2.l(this) == h) {
                            return h;
                        }
                    }
                    else {
                        final e h3 = this.H;
                        this.G = 2;
                        if (h3.k(this) == h) {
                            return h;
                        }
                    }
                }
                return j2.a;
            }
        }, 2, (Object)null);
    }
    
    @org.jetbrains.annotations.e
    public final k2 w(@org.jetbrains.annotations.e final CoroutineExceptionHandler coroutineExceptionHandler) {
        kotlin.jvm.internal.k0.p(coroutineExceptionHandler, "errorHandler");
        return h.f(x0.a((w0)this), (kotlin.coroutines.g)coroutineExceptionHandler, (u0)null, (p)new p<r0, d<? super j2>, Object>() {
            int G;
            final /* synthetic */ e H;
            final /* synthetic */ CoroutineExceptionHandler I;
            
            @e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ e H = this.H;
                    final /* synthetic */ CoroutineExceptionHandler I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((e$h)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@e final Object o) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c1.n(o);
                final g h = e.h(this.H);
                final Profile g = e.g(this.H);
                if (g == null) {
                    kotlin.jvm.internal.k0.S("profile");
                    throw null;
                }
                com.untis.mobile.utils.settings.c.n(h, -1L, g.getId());
                final g h2 = e.h(this.H);
                final org.joda.time.t g2 = com.untis.mobile.utils.v.a.g();
                final Profile g3 = e.g(this.H);
                if (g3 != null) {
                    com.untis.mobile.utils.settings.c.o(h2, g2, g3.getId());
                    kotlinx.coroutines.h.f(x0.a((w0)this.H), (kotlin.coroutines.g)this.I, (u0)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                        int G;
                        final /* synthetic */ e H;
                        
                        @e
                        @Override
                        public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @e final kotlin.coroutines.d<?> d) {
                            return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                                int G;
                                final /* synthetic */ e H = this.H;
                            };
                        }
                        
                        @org.jetbrains.annotations.f
                        @Override
                        public final Object invoke(@e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                            return ((e$h$a)this.create(r0, d)).invokeSuspend(j2.a);
                        }
                        
                        @org.jetbrains.annotations.f
                        public final Object invokeSuspend(@e final Object o) {
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
                                if (!com.untis.mobile.utils.extension.h.g(e.d(this.H))) {
                                    throw new ConnectException();
                                }
                                final e h2 = this.H;
                                this.G = 1;
                                if (h2.l(this) == h) {
                                    return h;
                                }
                            }
                            return j2.a;
                        }
                    }, 2, (Object)null);
                    return j2.a;
                }
                kotlin.jvm.internal.k0.S("profile");
                throw null;
            }
        }, 2, (Object)null);
    }
    
    public final void x(@org.jetbrains.annotations.e final CoroutineExceptionHandler coroutineExceptionHandler, final long n) {
        kotlin.jvm.internal.k0.p(coroutineExceptionHandler, "errorHandler");
        final g b = this.b;
        final Profile c = this.c;
        if (c != null) {
            com.untis.mobile.utils.settings.c.n(b, n, c.getId());
            h.f(x0.a((w0)this), (kotlin.coroutines.g)coroutineExceptionHandler, (u0)null, (p)new p<r0, d<? super j2>, Object>() {
                int G;
                final /* synthetic */ e H;
                
                @e
                @Override
                public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @e final kotlin.coroutines.d<?> d) {
                    return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                        int G;
                        final /* synthetic */ e H = this.H;
                    };
                }
                
                @org.jetbrains.annotations.f
                @Override
                public final Object invoke(@e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                    return ((e$i)this.create(r0, d)).invokeSuspend(j2.a);
                }
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@e final Object o) {
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
                        if (!com.untis.mobile.utils.extension.h.g(e.d(this.H))) {
                            throw new ConnectException();
                        }
                        final e h2 = this.H;
                        this.G = 1;
                        if (h2.l(this) == h) {
                            return h;
                        }
                    }
                    return j2.a;
                }
            }, 2, (Object)null);
            return;
        }
        kotlin.jvm.internal.k0.S("profile");
        throw null;
    }
    
    public final void y(@org.jetbrains.annotations.e final CoroutineExceptionHandler coroutineExceptionHandler, @org.jetbrains.annotations.e final t t) {
        kotlin.jvm.internal.k0.p(coroutineExceptionHandler, "errorHandler");
        kotlin.jvm.internal.k0.p(t, "date");
        final g b = this.b;
        final Profile c = this.c;
        if (c != null) {
            com.untis.mobile.utils.settings.c.o(b, t, c.getId());
            h.f(x0.a((w0)this), (kotlin.coroutines.g)coroutineExceptionHandler, (u0)null, (p)new p<r0, d<? super j2>, Object>() {
                int G;
                final /* synthetic */ e H;
                
                @e
                @Override
                public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @e final kotlin.coroutines.d<?> d) {
                    return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                        int G;
                        final /* synthetic */ e H = this.H;
                    };
                }
                
                @org.jetbrains.annotations.f
                @Override
                public final Object invoke(@e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                    return ((e$j)this.create(r0, d)).invokeSuspend(j2.a);
                }
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@e final Object o) {
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
                        if (!com.untis.mobile.utils.extension.h.g(e.d(this.H))) {
                            throw new ConnectException();
                        }
                        final e h2 = this.H;
                        this.G = 1;
                        if (h2.l(this) == h) {
                            return h;
                        }
                    }
                    return j2.a;
                }
            }, 2, (Object)null);
            return;
        }
        kotlin.jvm.internal.k0.S("profile");
        throw null;
    }
    
    public final void z(@org.jetbrains.annotations.e final com.untis.mobile.services.masterdata.a e) {
        kotlin.jvm.internal.k0.p(e, "<set-?>");
        this.e = e;
    }
}
