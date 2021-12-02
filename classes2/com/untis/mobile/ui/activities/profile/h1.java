// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.profile;

import com.untis.mobile.utils.z;
import android.content.Context;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.m0;
import kotlinx.coroutines.h;
import kotlinx.coroutines.d1;
import kotlin.c1;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.j2;
import kotlin.coroutines.d;
import kotlinx.coroutines.r0;
import n6.p;
import androidx.lifecycle.x0;
import androidx.lifecycle.LiveData;
import kotlinx.coroutines.k2;
import kotlin.text.s;
import kotlin.coroutines.g;
import kotlin.coroutines.a;
import kotlinx.coroutines.CoroutineExceptionHandler;
import java.util.List;
import kotlin.jvm.internal.w;
import org.joda.time.c;
import androidx.lifecycle.k0;
import com.untis.mobile.analytics.base.b;
import com.untis.mobile.api.ApiService;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import androidx.lifecycle.w0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00032\u00020\u0001:\u0001 B\u0017\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b)\u0010*J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\bJ\u0018\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\r\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0013\u001a\u00020\u0006R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010(\u001a\b\u0012\u0004\u0012\u00020\t0\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001a¨\u0006+" }, d2 = { "Lcom/untis/mobile/ui/activities/profile/h1;", "Landroidx/lifecycle/w0;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "g", "", "search", "Lkotlin/j2;", "h", "Landroidx/lifecycle/LiveData;", "Lcom/untis/mobile/ui/activities/profile/i1;", "k", "", "p", "coroutineExceptionHandler", "Lkotlinx/coroutines/k2;", "m", "Landroid/content/Context;", "context", "o", "l", "Lcom/untis/mobile/analytics/base/b;", "b", "Lcom/untis/mobile/analytics/base/b;", "analyticsTracker", "Landroidx/lifecycle/k0;", "d", "Landroidx/lifecycle/k0;", "mShowLoadingLiveData", "e", "Ljava/lang/String;", "lastSearch", "Lcom/untis/mobile/api/ApiService;", "a", "Lcom/untis/mobile/api/ApiService;", "apiService", "Lorg/joda/time/c;", "f", "Lorg/joda/time/c;", "lastSearchTimer", "c", "mLiveData", "<init>", "(Lcom/untis/mobile/api/ApiService;Lcom/untis/mobile/analytics/base/b;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class h1 extends w0
{
    @e
    public static final a g;
    private static final int h = 500;
    @e
    private final ApiService a;
    @e
    private final b b;
    @e
    private final k0<i1> c;
    @e
    private final k0<Boolean> d;
    @e
    private String e;
    @e
    private c f;
    
    static {
        g = new a(null);
    }
    
    public h1(@e final ApiService a, @e final b b) {
        kotlin.jvm.internal.k0.p(a, "apiService");
        kotlin.jvm.internal.k0.p(b, "analyticsTracker");
        this.a = a;
        this.b = b;
        this.c = (k0<i1>)new k0((Object)new i1(null, null, 3, null));
        this.d = (k0<Boolean>)new k0((Object)Boolean.FALSE);
        this.e = "";
        final c g0 = org.joda.time.c.G0();
        kotlin.jvm.internal.k0.o(g0, "now()");
        this.f = g0;
    }
    
    public static final /* synthetic */ k0 c(final h1 h1) {
        return h1.c;
    }
    
    public static final /* synthetic */ k0 d(final h1 h1) {
        return h1.d;
    }
    
    public static final /* synthetic */ void f(final h1 h1, final c f) {
        h1.f = f;
    }
    
    private final CoroutineExceptionHandler g() {
        return (CoroutineExceptionHandler)new CoroutineExceptionHandler(CoroutineExceptionHandler.s) {
            final /* synthetic */ h1 G;
            
            public void handleException(@e final g g, @e final Throwable t) {
                h1.c(this.G).n((Object)new i1(null, t, 1, null));
                h1.d(this.G).n((Object)Boolean.FALSE);
            }
        };
    }
    
    private final void h(final String e) {
        this.e = e;
        if (((org.joda.time.base.c)this.f.U0(500)).g()) {
            return;
        }
        if (!s.U1((CharSequence)e) && e.length() >= 3) {
            this.d.n((Object)Boolean.TRUE);
            this.a.searchSchool(e).C5((rx.functions.b)new g1(this), (rx.functions.b)new f1(this));
            return;
        }
        this.c.n((Object)new i1(null, null, 3, null));
    }
    
    private static final void i(final h1 h1, final List list) {
        kotlin.jvm.internal.k0.p(h1, "this$0");
        h1.c.n((Object)new i1(list, null, 2, null));
        h1.d.n((Object)Boolean.FALSE);
    }
    
    private static final void j(final h1 h1, final Throwable t) {
        kotlin.jvm.internal.k0.p(h1, "this$0");
        h1.c.n((Object)new i1(null, t, 1, null));
        h1.d.n((Object)Boolean.FALSE);
    }
    
    @e
    public final LiveData<i1> k() {
        return (LiveData<i1>)this.c;
    }
    
    public final void l() {
        this.b.c(com.untis.mobile.analytics.base.c.d.J);
    }
    
    @e
    public final k2 m(@e final CoroutineExceptionHandler coroutineExceptionHandler, @e final String s) {
        kotlin.jvm.internal.k0.p(coroutineExceptionHandler, "coroutineExceptionHandler");
        kotlin.jvm.internal.k0.p(s, "search");
        return kotlinx.coroutines.h.f(x0.a((w0)this), (g)coroutineExceptionHandler, (u0)null, (p)new p<r0, d<? super j2>, Object>() {
            int G;
            final /* synthetic */ h1 H;
            final /* synthetic */ String I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ h1 H = this.H;
                    final /* synthetic */ String I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((h1$c)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
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
                    final m0 c = kotlinx.coroutines.i1.c();
                    final p<r0, kotlin.coroutines.d<? super j2>, Object> p = new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                        int G;
                        final /* synthetic */ h1 H;
                        final /* synthetic */ String I;
                        
                        @org.jetbrains.annotations.e
                        @Override
                        public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                            return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                                int G;
                                final /* synthetic */ h1 H = this.H;
                                final /* synthetic */ String I = this.I;
                            };
                        }
                        
                        @org.jetbrains.annotations.f
                        @Override
                        public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                            return ((h1$c$a)this.create(r0, d)).invokeSuspend(j2.a);
                        }
                        
                        @org.jetbrains.annotations.f
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
                                final h1 h2 = this.H;
                                final c g2 = org.joda.time.c.G0();
                                kotlin.jvm.internal.k0.o(g2, "now()");
                                h1.f(h2, g2);
                                this.G = 1;
                                if (d1.b(501L, (kotlin.coroutines.d)this) == h) {
                                    return h;
                                }
                            }
                            this.H.h(this.I);
                            return j2.a;
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
    
    public final void o(@e final Context context) {
        kotlin.jvm.internal.k0.p(context, "context");
        final String string = context.getString(2131886907);
        kotlin.jvm.internal.k0.o(string, "context.getString(R.string.welcome_learn_more_link)");
        z.a.k(context, string);
    }
    
    @e
    public final LiveData<Boolean> p() {
        return (LiveData<Boolean>)this.d;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007" }, d2 = { "com/untis/mobile/ui/activities/profile/h1$a", "", "", "SEARCH_THRESHOLD_MILLIS", "I", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
    }
}
