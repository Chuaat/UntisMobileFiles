// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.core.notifications;

import java.util.Collection;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.h;
import org.joda.time.t;
import org.joda.time.c;
import java.util.Iterator;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.persistence.models.MessageOfDay;
import org.joda.time.n0;
import com.untis.mobile.utils.v;
import java.util.ArrayList;
import com.untis.mobile.dashboard.persistence.model.contacthour.DashboardContactHour;
import java.util.List;
import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.j2;
import kotlin.coroutines.d;
import kotlinx.coroutines.r0;
import n6.p;
import androidx.lifecycle.x0;
import kotlinx.coroutines.k2;
import android.content.Context;
import kotlinx.coroutines.CoroutineExceptionHandler;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.k0;
import org.jetbrains.annotations.e;
import com.untis.mobile.services.profile.legacy.a;
import kotlin.Metadata;
import androidx.lifecycle.w0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015" }, d2 = { "Lcom/untis/mobile/ui/core/notifications/g;", "Landroidx/lifecycle/w0;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "coroutineExceptionHandler", "Landroid/content/Context;", "context", "Lkotlinx/coroutines/k2;", "d", "Landroidx/lifecycle/LiveData;", "Lcom/untis/mobile/ui/core/notifications/e;", "c", "Lcom/untis/mobile/services/profile/legacy/a;", "a", "Lcom/untis/mobile/services/profile/legacy/a;", "profileService", "Landroidx/lifecycle/k0;", "b", "Landroidx/lifecycle/k0;", "mLiveData", "<init>", "(Lcom/untis/mobile/services/profile/legacy/a;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class g extends w0
{
    @e
    private final a a;
    @e
    private final k0<com.untis.mobile.ui.core.notifications.e> b;
    
    public g(@e final a a) {
        kotlin.jvm.internal.k0.p(a, "profileService");
        this.a = a;
        this.b = (k0<com.untis.mobile.ui.core.notifications.e>)new k0((Object)null);
    }
    
    public static final /* synthetic */ k0 a(final g g) {
        return g.b;
    }
    
    public static final /* synthetic */ a b(final g g) {
        return g.a;
    }
    
    @e
    public final LiveData<com.untis.mobile.ui.core.notifications.e> c() {
        return (LiveData<com.untis.mobile.ui.core.notifications.e>)this.b;
    }
    
    @e
    public final k2 d(@e final CoroutineExceptionHandler coroutineExceptionHandler, @e final Context context) {
        kotlin.jvm.internal.k0.p(coroutineExceptionHandler, "coroutineExceptionHandler");
        kotlin.jvm.internal.k0.p(context, "context");
        return h.f(x0.a((w0)this), (kotlin.coroutines.g)coroutineExceptionHandler, (u0)null, (p)new p<r0, d<? super j2>, Object>() {
            Object G;
            int H;
            final /* synthetic */ g I;
            final /* synthetic */ Context J;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    Object G;
                    int H;
                    final /* synthetic */ g I = this.I;
                    final /* synthetic */ Context J = this.J;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((g$a)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int h2 = this.H;
                String s;
                Object i;
                if (h2 != 0) {
                    if (h2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s = (String)this.G;
                    c1.n(o);
                    i = o;
                }
                else {
                    c1.n(o);
                    final Profile n = g.b(this.I).n();
                    String uniqueId;
                    if (n == null) {
                        uniqueId = null;
                    }
                    else {
                        uniqueId = n.getUniqueId();
                    }
                    if (uniqueId == null) {
                        return j2.a;
                    }
                    final com.untis.mobile.dashboard.service.b b = new com.untis.mobile.dashboard.service.b(this.J, uniqueId);
                    this.G = uniqueId;
                    this.H = 1;
                    i = b.i(this);
                    if (i == h) {
                        return h;
                    }
                    s = uniqueId;
                }
                final Iterable<Object> iterable = (Iterable<Object>)i;
                o = new ArrayList();
                final Iterator<DashboardContactHour> iterator = iterable.iterator();
                while (true) {
                    final boolean hasNext = iterator.hasNext();
                    final boolean b2 = false;
                    if (!hasNext) {
                        break;
                    }
                    final DashboardContactHour next = iterator.next();
                    final DashboardContactHour dashboardContactHour = next;
                    boolean b3 = b2;
                    if (dashboardContactHour.getRegistered()) {
                        final c start = dashboardContactHour.getStart();
                        boolean b4 = false;
                        Label_0245: {
                            if (start != null) {
                                final org.joda.time.t h3 = start.h1();
                                if (h3 != null) {
                                    if (((org.joda.time.base.e)h3).p((n0)v.a.g())) {
                                        b4 = true;
                                        break Label_0245;
                                    }
                                }
                            }
                            b4 = false;
                        }
                        b3 = b2;
                        if (b4) {
                            b3 = true;
                        }
                    }
                    if (!kotlin.coroutines.jvm.internal.b.a(b3)) {
                        continue;
                    }
                    ((Collection<DashboardContactHour>)o).add(next);
                }
                g.a(this.I).n((Object)new com.untis.mobile.ui.core.notifications.e(a.a.a(new com.untis.mobile.services.messages.e(s), false, 1, null), (List<DashboardContactHour>)o));
                return j2.a;
            }
        }, 2, (Object)null);
    }
}
