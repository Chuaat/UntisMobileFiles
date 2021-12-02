// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.core;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.content.Intent;
import com.untis.mobile.persistence.models.EntityType;
import com.google.android.material.bottomnavigation.BottomNavigationView$a;
import android.app.Activity;
import androidx.lifecycle.l0;
import org.jetbrains.annotations.f;
import com.untis.mobile.utils.extension.h;
import android.view.View;
import org.joda.time.t;
import com.untis.mobile.ui.dialogs.rateus.RateUsDialog;
import android.content.Context;
import com.untis.mobile.ui.activities.timetable.v;
import kotlin.jvm.internal.k0;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import android.os.Bundle;
import android.view.MenuItem;
import kotlin.coroutines.g;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import androidx.lifecycle.y;
import kotlin.jvm.internal.m0;
import n6.a;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlin.b0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.activities.common.b;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 $2\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\u0012\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0014J\b\u0010\u000e\u001a\u00020\u0002H\u0014J\b\u0010\u000f\u001a\u00020\u0002H\u0014J\b\u0010\u0010\u001a\u00020\u0002H\u0016J\u000e\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\nR\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001c\u001a\u00020\u00178B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0015R\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006&" }, d2 = { "Lcom/untis/mobile/ui/core/CoreActivity;", "Lcom/untis/mobile/ui/activities/common/b;", "Lkotlin/j2;", "y", "Lcom/untis/mobile/ui/core/c;", "data", "z", "Landroid/os/Bundle;", "arguments", "t", "", "u", "savedInstanceState", "onCreate", "onResume", "onPause", "onBackPressed", "show", "x", "", "H", "I", "badgeColor", "Lcom/untis/mobile/ui/core/d;", "G", "Lkotlin/b0;", "s", "()Lcom/untis/mobile/ui/core/d;", "viewModel", "badgePadding", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "J", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "silentErrorHandler", "<init>", "()V", "K", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class CoreActivity extends b
{
    @e
    public static final a K;
    @e
    public static final String L = "profile_id";
    @e
    public static final String M = "entity_type";
    @e
    public static final String N = "entity_id";
    @e
    private final b0 G;
    private int H;
    private int I;
    @e
    private final CoroutineExceptionHandler J;
    
    static {
        K = new a(null);
    }
    
    public CoreActivity() {
        this.G = d0.c((n6.a<?>)new n6.a<d>() {
            final /* synthetic */ y G;
            
            @e
            @Override
            public final d invoke() {
                return (d)org.koin.androidx.viewmodel.ext.android.b.b(this.G, k1.d(d.class), null, null);
            }
        });
        this.H = -65536;
        this.J = (CoroutineExceptionHandler)new CoroutineExceptionHandler(CoroutineExceptionHandler.s) {
            public void handleException(@e final g g, @e final Throwable t) {
                timber.log.b.g(t, "error in preloading data for core activity", new Object[0]);
            }
        };
    }
    
    private final d s() {
        return this.G.getValue();
    }
    
    private final void t(final Bundle bundle) {
        if (bundle == null) {
            return;
        }
        this.s().q(com.untis.mobile.utils.extension.b.d(bundle, "profile_id"), com.untis.mobile.utils.extension.b.a(bundle, "entity_type"), com.untis.mobile.utils.extension.b.c(bundle, "entity_id"));
    }
    
    private final boolean u() {
        return ((com.google.android.material.navigation.e)this.findViewById(2131297326)).getSelectedItemId() == 2131297325;
    }
    
    private static final void v(final CoreActivity coreActivity, final c c) {
        k0.p(coreActivity, "this$0");
        coreActivity.z(c);
    }
    
    private static final void w(final MenuItem menuItem) {
        k0.p(menuItem, "item");
        if (menuItem.getItemId() == 2131297325) {
            final v e = v.b0.e();
            if (e != null) {
                e.J1();
            }
        }
    }
    
    private final void y() {
        if (com.untis.mobile.utils.settings.old.d.n((Context)this).b()) {
            RateUsDialog.h0.a().L(((androidx.fragment.app.d)this).getSupportFragmentManager(), "notEveryOneCanBeAHero");
        }
    }
    
    private final void z(final c c) {
        if (c == null) {
            return;
        }
        final BottomNavigationView bottomNavigationView = (BottomNavigationView)this.findViewById(2131297326);
        final MenuItem item = ((com.google.android.material.navigation.e)bottomNavigationView).getMenu().findItem(2131297325);
        final Context context = ((FrameLayout)bottomNavigationView).getContext();
        k0.o(context, "context");
        final boolean b = true;
        item.setIcon(com.untis.mobile.utils.extension.e.g(context, null, 1, null));
        ((com.google.android.material.navigation.e)bottomNavigationView).getMenu().findItem(2131297320).setVisible(c.h());
        ((com.google.android.material.navigation.e)bottomNavigationView).getMenu().findItem(2131297321).setVisible(c.i());
        final com.google.android.material.badge.a g = ((com.google.android.material.navigation.e)bottomNavigationView).g(2131297321);
        ((Drawable)g).setVisible(c.j() > 0, false);
        g.J(c.j());
        g.B(this.H);
        g.M(this.I);
        g.H(this.I);
        final com.google.android.material.badge.a g2 = ((com.google.android.material.navigation.e)bottomNavigationView).g(2131297324);
        ((Drawable)g2).setVisible(c.k() > 0 && b, false);
        g2.J(c.k());
        g2.B(androidx.core.content.d.f(((FrameLayout)bottomNavigationView).getContext(), 2131100038));
        g2.B(this.H);
        g2.M(this.I);
        g2.H(this.I);
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    public void onBackPressed() {
        b.hideKeyBoard$default(this, null, 1, null);
        if (this.u() && !this.s().p()) {
            h.m((Context)this, 2131886877);
        }
        else {
            super.onBackPressed();
        }
    }
    
    @Override
    protected void onCreate(@f final Bundle bundle) {
        super.onCreate(bundle);
        this.H = androidx.core.content.d.f((Context)this, 2131100038);
        this.I = (int)this.getResources().getDimension(2131165280);
        Bundle extras = bundle;
        if (bundle == null) {
            extras = ((Activity)this).getIntent().getExtras();
        }
        this.t(extras);
        this.s().l((Context)this, this.J);
        this.s().o((Context)this, this.J);
        this.s().n((Context)this, this.J);
        this.s().m(this.J);
        this.s().k((Context)this, this.J);
        this.setContentView(2131493004);
        this.s().g().j((y)this, (l0)new com.untis.mobile.ui.core.a(this));
        final View viewById = this.findViewById(2131297326);
        k0.o(viewById, "findViewById<BottomNavigationView>(R.id.core_activity_bottom_navigation)");
        androidx.navigation.ui.g.a((BottomNavigationView)viewById, androidx.navigation.b.a((Activity)this, 2131297327));
        ((BottomNavigationView)this.findViewById(2131297326)).setOnNavigationItemReselectedListener((BottomNavigationView$a)com.untis.mobile.ui.core.b.a);
        this.y();
    }
    
    @Override
    protected void onPause() {
        super.onPause();
        this.s().t();
        if (((Activity)this).isFinishing()) {
            v.b0.k(com.untis.mobile.utils.v.a.g());
        }
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        this.s().u((Context)this);
    }
    
    public final void x(final boolean b) {
        ((FrameLayout)this.findViewById(2131297326)).setVisibility(h.U(b, 0, 1, null));
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J9\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e¨\u0006\u0013" }, d2 = { "com/untis/mobile/ui/core/CoreActivity$a", "", "Landroid/content/Context;", "context", "", "profileId", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "", "entityId", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Ljava/lang/String;Lcom/untis/mobile/persistence/models/EntityType;Ljava/lang/Long;)Landroid/content/Intent;", "ARGUMENT_PROFILE_ID", "Ljava/lang/String;", "ARGUMENT_TIMETABLE_ENTITY_ID", "ARGUMENT_TIMETABLE_ENTITY_TYPE", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final Intent a(@e final Context context, @f final String s, @f final EntityType entityType, @f final Long n) {
            k0.p(context, "context");
            final Intent intent = new Intent(context, (Class)CoreActivity.class);
            final Bundle bundle = new Bundle();
            com.untis.mobile.utils.extension.b.h(bundle, "profile_id", s);
            com.untis.mobile.utils.extension.b.e(bundle, "entity_type", entityType);
            com.untis.mobile.utils.extension.b.g(bundle, "entity_id", n);
            intent.putExtras(bundle);
            return intent;
        }
    }
}
