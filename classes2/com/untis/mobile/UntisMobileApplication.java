// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile;

import com.untis.mobile.utils.s;
import java.util.List;
import kotlin.collections.v;
import com.untis.mobile.messages.di.MessagesModuleKt;
import kotlin.jvm.internal.k0;
import n6.l;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.h;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.services.profile.legacy.j0;
import java.util.Iterator;
import android.util.Log;
import kotlinx.coroutines.i1;
import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.o;
import kotlin.j2;
import kotlinx.coroutines.r0;
import n6.p;
import kotlinx.coroutines.b2;
import kotlinx.coroutines.k2;
import com.untis.mobile.receivers.UmOnConnectionChangeReceiver;
import com.untis.mobile.receivers.UmOnScreenOnReceiver;
import com.untis.mobile.receivers.HourlyWorker;
import com.untis.mobile.receivers.DailyWorker;
import android.content.Context;
import com.untis.mobile.utils.settings.old.d;
import kotlin.jvm.internal.k1;
import android.content.ComponentCallbacks;
import kotlin.jvm.internal.m0;
import androidx.work.d0;
import n6.a;
import java.util.HashMap;
import kotlin.jvm.internal.w;
import kotlin.b0;
import java.util.Map;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import androidx.multidex.c;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u0006\u0010\b\u001a\u00020\u0007R\u001d\u0010\u000e\u001a\u00020\t8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001b" }, d2 = { "Lcom/untis/mobile/UntisMobileApplication;", "Landroidx/multidex/c;", "Lkotlin/j2;", "i", "k", "g", "onCreate", "Lkotlinx/coroutines/k2;", "m", "Landroidx/work/d0;", "G", "Lkotlin/b0;", "h", "()Landroidx/work/d0;", "workManager", "", "H", "Z", "j", "()Z", "l", "(Z)V", "isRunningInForeground", "<init>", "()V", "I", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class UntisMobileApplication extends c
{
    @e
    public static final a I;
    @f
    private static UntisMobileApplication J;
    @e
    private static final Map<String, Boolean> K;
    private static int L;
    @e
    private final b0 G;
    private boolean H;
    
    static {
        I = new a(null);
        K = new HashMap<String, Boolean>();
    }
    
    public UntisMobileApplication() {
        this.G = kotlin.d0.c((n6.a<?>)new n6.a<d0>() {
            final /* synthetic */ ComponentCallbacks G;
            
            @e
            @Override
            public final androidx.work.d0 invoke() {
                return (androidx.work.d0)org.koin.android.ext.android.a.e(this.G).y().t(k1.d(androidx.work.d0.class), null, null);
            }
        });
    }
    
    public static final /* synthetic */ Map a() {
        return UntisMobileApplication.K;
    }
    
    public static final /* synthetic */ UntisMobileApplication b() {
        return UntisMobileApplication.J;
    }
    
    public static final /* synthetic */ int c() {
        return UntisMobileApplication.L;
    }
    
    public static final /* synthetic */ void e(final UntisMobileApplication j) {
        UntisMobileApplication.J = j;
    }
    
    public static final /* synthetic */ void f(final int l) {
        UntisMobileApplication.L = l;
    }
    
    private final void g() {
        d.n((Context)this).m();
    }
    
    private final d0 h() {
        return this.G.getValue();
    }
    
    private final void i() {
        DailyWorker.Companion.init(this.h());
        HourlyWorker.Companion.init(this.h());
        this.k();
        this.g();
    }
    
    private final void k() {
        UmOnScreenOnReceiver.Companion.register((Context)this);
        UmOnConnectionChangeReceiver.Companion.register((Context)this);
    }
    
    public final boolean j() {
        return this.H;
    }
    
    public final void l(final boolean h) {
        this.H = h;
    }
    
    @e
    public final k2 m() {
        return h.f((r0)b2.G, (kotlin.coroutines.g)null, (u0)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>(null) {
            int G;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>(d) {
                    int G;
                };
            }
            
            @f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @f final kotlin.coroutines.d<? super j2> d) {
                return ((UntisMobileApplication$e)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                final Object h = b.h();
                final int g = this.G;
                if (g != 0) {
                    if (g != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(o);
                }
                else {
                    c1.n(o);
                    final kotlinx.coroutines.m0 c = i1.c();
                    final p<r0, kotlin.coroutines.d<? super j2>, Object> p = new p<r0, kotlin.coroutines.d<? super j2>, Object>(null) {
                        Object G;
                        int H;
                        
                        private static final void q(final Boolean b) {
                            Log.d("untis_log", "success on syncronize on app start");
                        }
                        
                        private static final void s(final Throwable t) {
                            Log.e("untis_log", "error on syncronize on app start", t);
                        }
                        
                        @org.jetbrains.annotations.e
                        @Override
                        public final kotlin.coroutines.d<j2> create(@f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                            return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>(d) {
                                Object G;
                                int H;
                                
                                private static final void q(final Boolean b) {
                                    Log.d("untis_log", "success on syncronize on app start");
                                }
                                
                                private static final void s(final Throwable t) {
                                    Log.e("untis_log", "error on syncronize on app start", t);
                                }
                            };
                        }
                        
                        @f
                        @Override
                        public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @f final kotlin.coroutines.d<? super j2> d) {
                            return ((UntisMobileApplication$e$a)this.create(r0, d)).invokeSuspend(j2.a);
                        }
                        
                        @f
                        public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                            final Object h = b.h();
                            final int h2 = this.H;
                            Iterator<Profile> iterator2;
                            if (h2 != 0) {
                                if (h2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                final Iterator iterator = (Iterator)this.G;
                                c1.n(o);
                                iterator2 = (Iterator<Profile>)iterator;
                            }
                            else {
                                c1.n(o);
                                Log.d("untis_log", "synchronizeClassbook");
                                iterator2 = j0.G.s0().iterator();
                            }
                            while (iterator2.hasNext()) {
                                final com.untis.mobile.services.classbook.a classBookService = iterator2.next().getClassBookService();
                                classBookService.I().C5((rx.functions.b)com.untis.mobile.f.G, (rx.functions.b)com.untis.mobile.g.G);
                                this.G = iterator2;
                                this.H = 1;
                                if (classBookService.t(this) == h) {
                                    return h;
                                }
                            }
                            return j2.a;
                        }
                    };
                    this.G = 1;
                    if (kotlinx.coroutines.h.i((kotlin.coroutines.g)c, (p)p, (kotlin.coroutines.d)this) == h) {
                        return h;
                    }
                }
                return j2.a;
            }
        }, 3, (Object)null);
    }
    
    public void onCreate() {
        super.onCreate();
        UntisMobileApplication.L = 0;
        UntisMobileApplication.J = this;
        org.koin.core.context.b.c((l)new l<org.koin.core.b, j2>() {
            final /* synthetic */ UntisMobileApplication G;
            
            public final void a(@e final org.koin.core.b b) {
                k0.p(b, "$this$startKoin");
                org.koin.android.ext.koin.a.a(b, (Context)this.G);
                b.n((List)v.L(com.untis.mobile.injection.a.c(), com.untis.mobile.injection.a.b(), com.untis.mobile.injection.a.a(), MessagesModuleKt.getMessagesModule()));
            }
        });
        com.untis.mobile.injection.component.d.a.d((Context)this);
        s.a.x(new n6.a<j2>() {
            public final void invoke() {
                UntisMobileApplication.this.i();
            }
        });
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR%\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019" }, d2 = { "com/untis/mobile/UntisMobileApplication$a", "", "Lcom/untis/mobile/UntisMobileApplication;", "application", "Lcom/untis/mobile/UntisMobileApplication;", "b", "()Lcom/untis/mobile/UntisMobileApplication;", "d", "(Lcom/untis/mobile/UntisMobileApplication;)V", "", "timetableLaunched", "I", "c", "()I", "e", "(I)V", "", "", "", "accessesChecked", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final Map<String, Boolean> a() {
            return (Map<String, Boolean>)UntisMobileApplication.a();
        }
        
        @f
        public final UntisMobileApplication b() {
            return UntisMobileApplication.b();
        }
        
        public final int c() {
            return UntisMobileApplication.c();
        }
        
        public final void d(@f final UntisMobileApplication untisMobileApplication) {
            UntisMobileApplication.e(untisMobileApplication);
        }
        
        public final void e(final int n) {
            UntisMobileApplication.f(n);
        }
    }
}
