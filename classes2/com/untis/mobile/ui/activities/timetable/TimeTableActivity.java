// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.timetable;

import org.joda.time.base.g;
import android.app.PendingIntent;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.persistence.models.EntityType;
import android.annotation.SuppressLint;
import android.content.Context;
import kotlin.n1;
import kotlin.s0;
import com.untis.mobile.utils.g0;
import com.untis.mobile.UntisMobileApplication;
import kotlin.jvm.internal.k0;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.untis.mobile.utils.u0;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.untis.mobile.c;
import com.untis.mobile.persistence.models.timetable.TimeTableEntity;
import android.content.Intent;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import android.content.ComponentCallbacks;
import kotlin.jvm.internal.m0;
import com.untis.mobile.firebase.b;
import n6.a;
import kotlin.jvm.internal.w;
import kotlin.b0;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.fragments.common.UmFragment;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 .2\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b,\u0010-J\u000f\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0003\u0010\u0004J&\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\rH\u0016J\"\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\tH\u0016J\b\u0010\u0018\u001a\u00020\rH\u0014R\u001d\u0010\u001e\u001a\u00020\u00198B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010!R\u001d\u0010+\u001a\u00020'8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u001b\u001a\u0004\b)\u0010*¨\u00060" }, d2 = { "Lcom/untis/mobile/ui/activities/timetable/TimeTableActivity;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "Lcom/untis/mobile/ui/activities/timetable/v;", "t", "()Lcom/untis/mobile/ui/activities/timetable/v;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "Lkotlin/j2;", "onResume", "onPause", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "outState", "onSaveInstanceState", "onBackPressed", "Lcom/untis/mobile/firebase/b;", "H", "Lkotlin/b0;", "s", "()Lcom/untis/mobile/firebase/b;", "firebaseHelper", "", "K", "J", "backPressedThreshold", "G", "Lcom/untis/mobile/ui/activities/timetable/v;", "_timeTableActivityService", "backPressedTimestamp", "Lcom/untis/mobile/analytics/base/b;", "I", "r", "()Lcom/untis/mobile/analytics/base/b;", "analyticsTracker", "<init>", "()V", "L", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class TimeTableActivity extends UmFragment
{
    @e
    public static final a L;
    @f
    private v G;
    @e
    private final b0 H;
    @e
    private final b0 I;
    private long J;
    private long K;
    
    static {
        L = new a(null);
    }
    
    public TimeTableActivity() {
        this.H = d0.c((n6.a<?>)new n6.a<b>() {
            final /* synthetic */ ComponentCallbacks G;
            
            @e
            @Override
            public final b invoke() {
                return (b)org.koin.android.ext.android.a.e(this.G).y().t(k1.d(b.class), null, null);
            }
        });
        this.I = d0.c((n6.a<?>)new n6.a<com.untis.mobile.analytics.base.b>() {
            final /* synthetic */ ComponentCallbacks G;
            
            @e
            @Override
            public final com.untis.mobile.analytics.base.b invoke() {
                return (com.untis.mobile.analytics.base.b)org.koin.android.ext.android.a.e(this.G).y().t(k1.d(com.untis.mobile.analytics.base.b.class), null, null);
            }
        });
        this.K = 3000L;
    }
    
    private final com.untis.mobile.analytics.base.b r() {
        return this.I.getValue();
    }
    
    private final b s() {
        return this.H.getValue();
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    public void onActivityResult(final int n, final int n2, @f final Intent intent) {
        final boolean b = n2 == -1;
        if (n != 160) {
            if (n != 400) {
                if (n != 600) {
                    if (n != 1500) {
                        super.onActivityResult(n, n2, intent);
                    }
                    else {
                        this.t().A2();
                    }
                }
                else {
                    this.t().C2();
                }
            }
            else if (b && intent != null) {
                final a l = TimeTableActivity.L;
                this.t().k2(new TimeTableEntity(l.c(intent), l.b(intent), false, 0, 0L, null, 60, null));
            }
        }
        else {
            this.t().g2();
        }
    }
    
    @Override
    protected void onBackPressed() {
        final View view = this.getView();
        final View view2 = null;
        Object viewById;
        if (view == null) {
            viewById = null;
        }
        else {
            viewById = view.findViewById(c.i.Lc);
        }
        if (((ViewGroup)viewById).getVisibility() == 0) {
            final View view3 = this.getView();
            Object viewById2;
            if (view3 == null) {
                viewById2 = null;
            }
            else {
                viewById2 = view3.findViewById(c.i.Lc);
            }
            ((ViewGroup)viewById2).setVisibility(8);
            final View view4 = this.getView();
            Object viewById3;
            if (view4 == null) {
                viewById3 = null;
            }
            else {
                viewById3 = view4.findViewById(c.i.Sc);
            }
            ((ViewGroup)viewById3).setVisibility(0);
            UmFragment.hideKeyboard$default(this, null, 1, null);
            return;
        }
        final long d = com.untis.mobile.utils.time.a.d();
        if (this.J + this.K > d) {
            super.onBackPressed();
        }
        else {
            this.J = d;
            final View view5 = this.getView();
            View viewById4;
            if (view5 == null) {
                viewById4 = view2;
            }
            else {
                viewById4 = view5.findViewById(c.i.Kc);
            }
            u0.g(viewById4, this.getString(2131886877));
        }
    }
    
    @f
    public View onCreateView(@e final LayoutInflater layoutInflater, @f final ViewGroup viewGroup, @f final Bundle bundle) {
        k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131492966, viewGroup, false);
        if (inflate == null) {
            return null;
        }
        n5.e.e(this, inflate);
        n5.e.g(this, inflate);
        this.t().M2(inflate);
        final v t = this.t();
        Bundle arguments;
        if ((arguments = bundle) == null) {
            arguments = this.getArguments();
        }
        t.z0(arguments);
        final UntisMobileApplication.a i = UntisMobileApplication.I;
        final UntisMobileApplication b = i.b();
        if (b != null) {
            b.m();
        }
        if (i.c() == 0) {
            if (g0.a(this.requireContext())) {
                this.r().c(com.untis.mobile.analytics.base.c.e.H);
            }
            else {
                this.r().d(com.untis.mobile.analytics.base.c.e.H, androidx.core.os.b.a(new s0[] { n1.a(com.untis.mobile.analytics.base.c.b.H.d(), Boolean.TRUE) }));
            }
            i.e(1);
        }
        return inflate;
    }
    
    @Override
    public void onPause() {
        super.onPause();
        this.t().Q1();
    }
    
    @Override
    public void onResume() {
        super.onResume();
        this.t().T1();
        final com.untis.mobile.services.widget.c g = com.untis.mobile.services.widget.c.G;
        final Context requireContext = this.requireContext();
        k0.o(requireContext, "requireContext()");
        g.b(requireContext);
        this.s().c();
    }
    
    public void onSaveInstanceState(@e final Bundle bundle) {
        k0.p(bundle, "outState");
        super.onSaveInstanceState(bundle);
        this.t().V1(bundle);
    }
    
    @SuppressLint({ "LogNotTimber" })
    @e
    public final v t() {
        v g;
        if ((g = this.G) == null) {
            ((g)com.untis.mobile.utils.v.a.e()).n();
            g = new v(this);
            g.o1(this.getArguments());
            this.G = g;
        }
        return g;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000>\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006J\u0016\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rJ\u001e\u0010\u0012\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010J.\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006¨\u0006\u0019" }, d2 = { "com/untis/mobile/ui/activities/timetable/TimeTableActivity$a", "", "Landroid/content/Intent;", "data", "Lcom/untis/mobile/persistence/models/EntityType;", "c", "", "b", "entityType", "entityId", "a", "Landroid/content/Context;", "context", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "d", "Lcom/untis/mobile/persistence/models/timetable/TimeTableEntity;", "timeTableEntity", "e", "", "appWidgetId", "Landroid/app/PendingIntent;", "f", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final Intent a(@e final EntityType entityType, final long n) {
            k0.p(entityType, "entityType");
            return v.b0.b(entityType, n);
        }
        
        public final long b(@e final Intent intent) {
            k0.p(intent, "data");
            return v.b0.c(intent);
        }
        
        @e
        public final EntityType c(@e final Intent intent) {
            k0.p(intent, "data");
            return v.b0.d(intent);
        }
        
        @e
        public final Intent d(@e final Context context, @e final Profile profile) {
            k0.p(context, "context");
            k0.p(profile, "profile");
            return v.b0.r(context, profile);
        }
        
        @e
        public final Intent e(@e final Context context, @e final Profile profile, @e final TimeTableEntity timeTableEntity) {
            k0.p(context, "context");
            k0.p(profile, "profile");
            k0.p(timeTableEntity, "timeTableEntity");
            return v.b0.s(context, profile, timeTableEntity);
        }
        
        @e
        public final PendingIntent f(@e final Context context, final int n, @e final Profile profile, @e final EntityType entityType, final long n2) {
            k0.p(context, "context");
            k0.p(profile, "profile");
            k0.p(entityType, "entityType");
            return v.b0.t(context, n, profile, entityType, n2);
        }
    }
}
