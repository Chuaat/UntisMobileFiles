// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.launcher;

import android.widget.TextView;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.untis.mobile.ui.activities.profile.WelcomeActivity;
import androidx.appcompat.widget.AppCompatTextView;
import android.annotation.SuppressLint;
import java.util.concurrent.TimeUnit;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.ui.core.CoreActivity;
import com.untis.mobile.ui.activities.profile.ProfilesActivity;
import android.util.Log;
import java.util.ArrayList;
import kotlin.jvm.internal.k0;
import rx.functions.o;
import rx.functions.p;
import rx.schedulers.c;
import rx.g;
import android.content.Context;
import com.untis.mobile.utils.g0;
import com.untis.mobile.persistence.models.profile.Profile;
import java.util.List;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import androidx.lifecycle.y;
import kotlin.jvm.internal.m0;
import n6.a;
import kotlin.jvm.internal.w;
import kotlin.b0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.activities.common.b;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\u0007\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0003J\u0018\u0010\t\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0005H\u0002J\u0012\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014R\u001d\u0010\u0016\u001a\u00020\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001b" }, d2 = { "Lcom/untis/mobile/ui/activities/launcher/LauncherActivity;", "Lcom/untis/mobile/ui/activities/common/b;", "Lkotlin/j2;", "C", "", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profiles", "y", "L", "A", "O", "J", "profile", "K", "Landroid/os/Bundle;", "save", "onCreate", "Lcom/untis/mobile/ui/activities/launcher/k;", "G", "Lkotlin/b0;", "z", "()Lcom/untis/mobile/ui/activities/launcher/k;", "viewModel", "<init>", "()V", "H", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class LauncherActivity extends b
{
    @e
    public static final a H;
    @e
    private final b0 G;
    
    static {
        H = new a(null);
    }
    
    public LauncherActivity() {
        this.G = d0.c((n6.a<?>)new n6.a<k>() {
            final /* synthetic */ y G;
            
            @e
            @Override
            public final k invoke() {
                return (k)org.koin.androidx.viewmodel.ext.android.b.b(this.G, k1.d(k.class), null, null);
            }
        });
    }
    
    private final void A(final List<Profile> list) {
        if (list.isEmpty()) {
            this.O();
            return;
        }
        final Profile i = this.z().i();
        if (i == null) {
            this.J();
            return;
        }
        this.K(i);
    }
    
    static /* synthetic */ void B(final LauncherActivity launcherActivity, List g, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            g = launcherActivity.z().g();
        }
        launcherActivity.A(g);
    }
    
    private final void C() {
        if (!g0.a((Context)this)) {
            B(this, null, 1, null);
            return;
        }
        g.C2((Iterable)this.z().g()).E5(c.f()).d2((p)new h(this.z().k(), this)).j2((p)new com.untis.mobile.ui.activities.launcher.g(this)).S((o)f.G, (rx.functions.c)com.untis.mobile.ui.activities.launcher.e.G).Q3(rx.android.schedulers.a.c()).C5((rx.functions.b)new com.untis.mobile.ui.activities.launcher.b(this), (rx.functions.b)d.G);
        this.z().u();
    }
    
    private static final Boolean D(final boolean b, final LauncherActivity launcherActivity, final Profile profile) {
        k0.p(launcherActivity, "this$0");
        return b || launcherActivity.z().m(profile);
    }
    
    private static final g E(final LauncherActivity launcherActivity, final Profile profile) {
        k0.p(launcherActivity, "this$0");
        final k z = launcherActivity.z();
        k0.o(profile, "it");
        return z.r(profile);
    }
    
    private static final ArrayList F() {
        return new ArrayList();
    }
    
    private static final void G(final ArrayList list, final Profile e) {
        list.add(e);
    }
    
    private static final void H(final LauncherActivity launcherActivity, final ArrayList list) {
        k0.p(launcherActivity, "this$0");
        k0.o(list, "it");
        launcherActivity.y(list);
    }
    
    private static final void I(final Throwable t) {
        Log.e("untis_log", "error on global profile updates", t);
    }
    
    private final void J() {
        final String string = ((Activity)this).getSharedPreferences((String)null, 0).getString("profile_id", (String)null);
        if (this.z().i() == null && string != null) {
            final Profile h = this.z().h(string);
            if (h != null) {
                this.z().p(h);
                this.K(h);
                return;
            }
        }
        ((Activity)this).startActivity(ProfilesActivity.G.a((Context)this));
        ((Activity)this).finish();
    }
    
    private final void K(final Profile profile) {
        ((Activity)this).startActivity(CoreActivity.a.b(CoreActivity.K, (Context)this, null, null, null, 14, null));
        ((Activity)this).finish();
    }
    
    @SuppressLint({ "SetTextI18n" })
    private final void L() {
        final rx.o c5 = g.Q2(1L, TimeUnit.SECONDS).E5(c.f()).Q3(rx.android.schedulers.a.c()).C5((rx.functions.b)new com.untis.mobile.ui.activities.launcher.a(this), (rx.functions.b)com.untis.mobile.ui.activities.launcher.c.G);
        k0.o(c5, "subscription");
        this.addSubscription(c5);
    }
    
    private static final void M(final LauncherActivity launcherActivity, final Long n) {
        k0.p(launcherActivity, "this$0");
        final AppCompatTextView appCompatTextView = (AppCompatTextView)launcherActivity.findViewById(com.untis.mobile.c.i.F6);
        final k z = launcherActivity.z();
        k0.o(n, "seconds");
        ((TextView)appCompatTextView).setText((CharSequence)z.j(n));
    }
    
    private static final void N(final Throwable t) {
        Log.e("untis_log", "error on startUiRenderProcess", t);
    }
    
    private final void O() {
        ((Activity)this).startActivity(WelcomeActivity.G.a((Context)this));
        ((Activity)this).finish();
    }
    
    private final void y(final List<Profile> list) {
        Log.d("untis_log", k0.C("profiles updated : ", list.size()));
        if (list.isEmpty() ^ true) {
            this.z().v();
        }
        B(this, null, 1, null);
    }
    
    private final k z() {
        return this.G.getValue();
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @Override
    protected void onCreate(@org.jetbrains.annotations.f final Bundle bundle) {
        super.onCreate(bundle);
        final k z = this.z();
        Bundle extras = bundle;
        if (bundle == null) {
            extras = ((Activity)this).getIntent().getExtras();
        }
        if (z.d((Context)this, extras)) {
            ((Activity)this).finish();
            return;
        }
        this.setContentView(2131492927);
        this.L();
        this.C();
        this.z().q();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b" }, d2 = { "com/untis/mobile/ui/activities/launcher/LauncherActivity$a", "", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final Intent a(@e final Context context) {
            k0.p(context, "context");
            return new Intent(context, (Class)LauncherActivity.class);
        }
    }
}
