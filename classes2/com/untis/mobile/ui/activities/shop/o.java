// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.shop;

import kotlinx.coroutines.u0;
import kotlin.coroutines.g;
import kotlinx.coroutines.h;
import android.app.Activity;
import com.untis.mobile.services.billing.i;
import kotlin.c1;
import kotlin.j2;
import kotlin.coroutines.d;
import kotlinx.coroutines.r0;
import n6.p;
import androidx.lifecycle.x0;
import kotlinx.coroutines.k2;
import androidx.lifecycle.LiveData;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.utils.z;
import android.content.Context;
import kotlin.collections.v;
import com.untis.mobile.utils.billing.f;
import java.util.List;
import androidx.lifecycle.k0;
import com.untis.mobile.services.billing.b;
import com.untis.mobile.persistence.models.profile.Profile;
import org.jetbrains.annotations.e;
import com.untis.mobile.services.profile.legacy.a;
import kotlin.Metadata;
import androidx.lifecycle.w0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010#\u001a\u00020 ¢\u0006\u0004\b*\u0010+J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002J\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\u0002J\u0010\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u000e\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u0010\u001a\u00020\bJ\u000e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011J\b\u0010\u0015\u001a\u00020\nH\u0014J\u000e\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0004R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\"\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001e¨\u0006," }, d2 = { "Lcom/untis/mobile/ui/activities/shop/o;", "Landroidx/lifecycle/w0;", "Landroidx/lifecycle/LiveData;", "", "Lcom/untis/mobile/services/billing/a;", "h", "Lcom/untis/mobile/utils/billing/f;", "i", "", "profileId", "Lkotlin/j2;", "k", "Landroid/content/Context;", "context", "g", "f", "j", "Lcom/untis/mobile/ui/activities/shop/ShopActivity;", "activity", "Lkotlinx/coroutines/k2;", "l", "onCleared", "product", "m", "Lcom/untis/mobile/persistence/models/profile/Profile;", "b", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Landroidx/lifecycle/k0;", "d", "Landroidx/lifecycle/k0;", "productsLiveData", "Lcom/untis/mobile/services/profile/legacy/a;", "a", "Lcom/untis/mobile/services/profile/legacy/a;", "profileService", "Lcom/untis/mobile/services/billing/b;", "c", "Lcom/untis/mobile/services/billing/b;", "purchaseService", "e", "purchasesLiveData", "<init>", "(Lcom/untis/mobile/services/profile/legacy/a;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class o extends w0
{
    @e
    private final a a;
    private Profile b;
    private b c;
    @e
    private final k0<List<com.untis.mobile.services.billing.a>> d;
    @e
    private final k0<List<f>> e;
    
    public o(@e final a a) {
        kotlin.jvm.internal.k0.p(a, "profileService");
        this.a = a;
        this.d = (k0<List<com.untis.mobile.services.billing.a>>)new k0((Object)v.E());
        this.e = (k0<List<f>>)new k0((Object)v.E());
    }
    
    public static final /* synthetic */ k0 c(final o o) {
        return o.d;
    }
    
    public static final /* synthetic */ k0 d(final o o) {
        return o.e;
    }
    
    public static final /* synthetic */ void e(final o o, final b c) {
        o.c = c;
    }
    
    private static final void n(final Boolean b) {
    }
    
    private static final void o(final Throwable t) {
        timber.log.b.e("error while purchasing subscription", new Object[0]);
    }
    
    @e
    public final String f(@e final Context context) {
        kotlin.jvm.internal.k0.p(context, "context");
        String s;
        if (z.a.h(context)) {
            s = "https://www.untis.at/warum-untis/ueber-das-produkt/datenschutz-und-sicherheit";
        }
        else {
            s = "https://www.untis.at/en/privacy-policy";
        }
        return s;
    }
    
    @e
    public final String g(@e final Context context) {
        kotlin.jvm.internal.k0.p(context, "context");
        final Profile b = this.b;
        if (b != null) {
            String s;
            String s2;
            if (b.hasAnyRole(EntityType.TEACHER)) {
                s = context.getString(2131886519);
                s2 = "{\n            context.getString(R.string.premium_features_list_link_teacher)\n        }";
            }
            else {
                s = context.getString(2131886518);
                s2 = "{\n            context.getString(R.string.premium_features_list_link)\n        }";
            }
            kotlin.jvm.internal.k0.o(s, s2);
            return s;
        }
        kotlin.jvm.internal.k0.S("profile");
        throw null;
    }
    
    @e
    public final LiveData<List<com.untis.mobile.services.billing.a>> h() {
        return (LiveData<List<com.untis.mobile.services.billing.a>>)this.d;
    }
    
    @e
    public final LiveData<List<f>> i() {
        return (LiveData<List<f>>)this.e;
    }
    
    @e
    public final String j() {
        return "https://www.untis.at/agb";
    }
    
    public final void k(@org.jetbrains.annotations.f final String s) {
        final a a = this.a;
        String s2 = s;
        if (s == null) {
            s2 = "";
        }
        Profile b;
        if ((b = a.l(s2)) == null) {
            b = this.a.n();
            if (b == null) {
                throw new IllegalStateException("no profile available");
            }
        }
        this.b = b;
    }
    
    @e
    public final k2 l(@e final ShopActivity shopActivity) {
        kotlin.jvm.internal.k0.p(shopActivity, "activity");
        return h.f(x0.a((w0)this), (g)null, (u0)null, (p)new p<r0, d<? super j2>, Object>() {
            int G;
            final /* synthetic */ o H;
            final /* synthetic */ ShopActivity I;
            
            private static final void J(final Throwable t) {
                timber.log.b.g(t, "error on preparing purchases in shop activity", new Object[0]);
            }
            
            private static final void M(final o o, final List list) {
                o.c(o).q((Object)list);
            }
            
            private static final void X(final Throwable t) {
                timber.log.b.g(t, "error on preparing product details in shop activity", new Object[0]);
            }
            
            private static final void w(final o o, final b b) {
                b.a().C5((rx.functions.b)new l(o), (rx.functions.b)com.untis.mobile.ui.activities.shop.n.G);
                b.d().C5((rx.functions.b)new k(o), (rx.functions.b)m.G);
            }
            
            private static final void x(final o o, final List list) {
                o.d(o).q((Object)list);
            }
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ o H = this.H;
                    final /* synthetic */ ShopActivity I = this.I;
                    
                    private static final void J(final Throwable t) {
                        timber.log.b.g(t, "error on preparing purchases in shop activity", new Object[0]);
                    }
                    
                    private static final void M(final o o, final List list) {
                        o.c(o).q((Object)list);
                    }
                    
                    private static final void X(final Throwable t) {
                        timber.log.b.g(t, "error on preparing product details in shop activity", new Object[0]);
                    }
                    
                    private static final void w(final o o, final b b) {
                        b.a().C5((rx.functions.b)new l(o), (rx.functions.b)com.untis.mobile.ui.activities.shop.n.G);
                        b.d().C5((rx.functions.b)new k(o), (rx.functions.b)m.G);
                    }
                    
                    private static final void x(final o o, final List list) {
                        o.d(o).q((Object)list);
                    }
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((o$a)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G == 0) {
                    c1.n(o);
                    o.e(this.H, new i((Activity)this.I, (i.b)new j(this.H)));
                    return j2.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }, 3, (Object)null);
    }
    
    public final void m(@e final com.untis.mobile.services.billing.a a) {
        kotlin.jvm.internal.k0.p(a, "product");
        if (!kotlin.jvm.internal.k0.g(a.c(), "subscription_premium_month_2")) {
            return;
        }
        final b c = this.c;
        if (c != null) {
            c.b(a.g(), a.c()).C5((rx.functions.b)com.untis.mobile.ui.activities.shop.h.G, (rx.functions.b)com.untis.mobile.ui.activities.shop.i.G);
            return;
        }
        kotlin.jvm.internal.k0.S("purchaseService");
        throw null;
    }
    
    protected void onCleared() {
        super.onCleared();
        final b c = this.c;
        if (c != null) {
            c.onDestroy();
            return;
        }
        kotlin.jvm.internal.k0.S("purchaseService");
        throw null;
    }
}
