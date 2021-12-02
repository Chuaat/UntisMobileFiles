// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.period;

import android.app.Activity;
import androidx.activity.ComponentActivity;
import android.os.Parcelable;
import java.util.Collection;
import kotlin.text.s;
import android.view.Menu;
import androidx.fragment.app.FragmentManager;
import com.viewpagerindicator.CirclePageIndicator;
import androidx.viewpager.widget.ViewPager;
import android.view.View$OnClickListener;
import com.untis.mobile.persistence.models.profile.ProfileState;
import androidx.appcompat.widget.Toolbar;
import java.util.Comparator;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.ui.activities.timetable.TimeTableActivity;
import com.untis.mobile.persistence.models.classbook.homework.HomeWork;
import com.untis.mobile.ui.activities.classbook.homeworks.HomeWorkDetailActivity;
import com.untis.mobile.ui.activities.period.messenger.CreateMessengerChannelFragment;
import android.content.Intent;
import com.untis.mobile.persistence.models.masterdata.Subject;
import com.untis.mobile.persistence.models.timetable.period.PeriodElement;
import com.untis.mobile.persistence.models.timetable.period.PeriodRight;
import com.untis.mobile.persistence.models.messenger.MessengerCredential;
import com.untis.mobile.ui.activities.period.messenger.CreateMessengerChannelActivity;
import org.joda.time.l0;
import com.untis.mobile.ui.activities.period.adapter.PeriodDetailFragment;
import android.view.View;
import com.untis.mobile.utils.u0;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.untis.mobile.api.common.JsonRpcErrorType;
import com.untis.mobile.api.error.JsonRpcError;
import android.widget.RelativeLayout;
import com.untis.mobile.services.profile.legacy.j0;
import android.os.Bundle;
import android.util.Log;
import java.util.Iterator;
import kotlin.jvm.internal.k0;
import java.util.List;
import rx.schedulers.c;
import kotlin.collections.v;
import com.untis.mobile.persistence.models.timetable.period.PeriodState;
import android.content.Context;
import com.untis.mobile.utils.g0;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import android.content.ComponentCallbacks;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.w;
import kotlin.b0;
import com.untis.mobile.services.timetable.placeholder.k;
import org.jetbrains.annotations.f;
import android.view.MenuItem;
import com.untis.mobile.ui.activities.period.adapter.a;
import com.untis.mobile.persistence.models.timetable.period.Period;
import java.util.ArrayList;
import com.untis.mobile.persistence.models.timetable.TimeTableEntity;
import com.untis.mobile.persistence.models.profile.Profile;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import androidx.viewpager.widget.ViewPager$j;
import com.untis.mobile.ui.activities.common.b;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 i2\u00020\u00012\u00020\u0002:\u0001jB\u0007¢\u0006\u0004\bg\u0010hJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0007H\u0002J\u0016\u0010\u000e\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u0012\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u0007H\u0002J\b\u0010\u0013\u001a\u00020\u0007H\u0002J\u0012\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0007H\u0002J\b\u0010\u0018\u001a\u00020\u000fH\u0002J\u0012\u0010\u001a\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u0014J\b\u0010\u001b\u001a\u00020\u0007H\u0014J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\b\u0010 \u001a\u00020\u0007H\u0016J\u0010\u0010\"\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0003H\u0014J\"\u0010'\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00142\b\u0010&\u001a\u0004\u0018\u00010%H\u0014J\u0012\u0010*\u001a\u00020\u001e2\b\u0010)\u001a\u0004\u0018\u00010(H\u0016J\u0010\u0010,\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u0014H\u0016J \u00101\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u00142\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u0014H\u0016J\u0010\u00102\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u0014H\u0016R\u0016\u00104\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u00103R\u0018\u00107\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010:\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010;\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u00103R\u0016\u0010=\u001a\u00020\u00058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010<R\u0016\u0010A\u001a\u00020>8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010D\u001a\u00020B8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\b\u0010CR\u0016\u0010G\u001a\u00020E8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010FR\u001d\u0010M\u001a\u00020H8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0016\u0010P\u001a\u00020N8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010OR\u001d\u0010U\u001a\u00020Q8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010J\u001a\u0004\bS\u0010TR\u0016\u0010Y\u001a\u00020V8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010\\\u001a\u00020Z8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010[R&\u0010`\u001a\u0012\u0012\u0004\u0012\u00020\u000f0]j\b\u0012\u0004\u0012\u00020\u000f`^8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010_R\u0016\u0010d\u001a\u00020a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bb\u0010cR\u0018\u0010f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u00106¨\u0006k" }, d2 = { "Lcom/untis/mobile/ui/activities/period/PeriodDetailActivity;", "Lcom/untis/mobile/ui/activities/common/b;", "Landroidx/viewpager/widget/ViewPager$j;", "Landroid/os/Bundle;", "arguments", "Lcom/untis/mobile/persistence/models/profile/Profile;", "D", "Lkotlin/j2;", "L", "F", "A", "", "", "periodIds", "G", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "period", "T", "N", "M", "", "basicTextColor", "R", "Q", "y", "save", "onCreate", "onResume", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "onBackPressed", "outState", "onSaveInstanceState", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "Landroid/view/Menu;", "menu", "onCreateOptionsMenu", "state", "k", "position", "", "positionOffset", "positionOffsetPixels", "b", "l", "Z", "loadPeriodData", "O", "Landroid/view/MenuItem;", "menuItemNotifications", "I", "J", "selectedId", "useSubjectColor", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Lcom/untis/mobile/persistence/models/timetable/TimeTableEntity;", "H", "Lcom/untis/mobile/persistence/models/timetable/TimeTableEntity;", "timeTableEntity", "Lcom/untis/mobile/ui/activities/period/t;", "Lcom/untis/mobile/ui/activities/period/t;", "periodDetailMethod", "Lcom/untis/mobile/services/classbook/a;", "Lcom/untis/mobile/services/classbook/a;", "classBookService", "Lcom/untis/mobile/analytics/base/b;", "V", "Lkotlin/b0;", "z", "()Lcom/untis/mobile/analytics/base/b;", "analyticsTracker", "Lcom/untis/mobile/services/masterdata/a;", "Lcom/untis/mobile/services/masterdata/a;", "masterDataService", "Lcom/untis/mobile/systemNotifications/b;", "S", "E", "()Lcom/untis/mobile/systemNotifications/b;", "systemNotificationService", "Lcom/untis/mobile/services/messenger/a;", "U", "Lcom/untis/mobile/services/messenger/a;", "messengerService", "Lcom/untis/mobile/services/timetable/placeholder/k;", "Lcom/untis/mobile/services/timetable/placeholder/k;", "timeTableService", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "periods", "Lcom/untis/mobile/ui/activities/period/adapter/a;", "K", "Lcom/untis/mobile/ui/activities/period/adapter/a;", "periodDetailAdapter", "P", "menuItemChannel", "<init>", "()V", "W", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class PeriodDetailActivity extends b implements ViewPager$j
{
    @e
    public static final a W;
    @e
    private static final String X = "lilie";
    @e
    private static final String Y = "rosen";
    @e
    private static final String Z = "gaensebluemchen";
    @e
    private static final String a0 = "loewenmaeulchen";
    @e
    private static final String b0 = "sonnenblume";
    @e
    private static final String c0 = "tomato";
    private Profile G;
    private TimeTableEntity H;
    private long I;
    @e
    private final ArrayList<Period> J;
    private com.untis.mobile.ui.activities.period.adapter.a K;
    private t L;
    private boolean M;
    private boolean N;
    @f
    private MenuItem O;
    @f
    private MenuItem P;
    private k Q;
    private com.untis.mobile.services.classbook.a R;
    @e
    private final b0 S;
    private com.untis.mobile.services.masterdata.a T;
    private com.untis.mobile.services.messenger.a U;
    @e
    private final b0 V;
    
    static {
        W = new a(null);
    }
    
    public PeriodDetailActivity() {
        this.J = new ArrayList<Period>();
        this.N = true;
        this.S = d0.c((n6.a<?>)new n6.a<com.untis.mobile.systemNotifications.b>() {
            final /* synthetic */ ComponentCallbacks G;
            
            @e
            @Override
            public final com.untis.mobile.systemNotifications.b invoke() {
                return (com.untis.mobile.systemNotifications.b)org.koin.android.ext.android.a.e(this.G).y().t(k1.d(com.untis.mobile.systemNotifications.b.class), null, null);
            }
        });
        this.V = d0.c((n6.a<?>)new n6.a<com.untis.mobile.analytics.base.b>() {
            final /* synthetic */ ComponentCallbacks G;
            
            @e
            @Override
            public final com.untis.mobile.analytics.base.b invoke() {
                return (com.untis.mobile.analytics.base.b)org.koin.android.ext.android.a.e(this.G).y().t(k1.d(com.untis.mobile.analytics.base.b.class), null, null);
            }
        });
    }
    
    private final void A() {
        if (!this.N) {
            return;
        }
        if (!g0.a((Context)this)) {
            return;
        }
        final ArrayList<Period> j = this.J;
        final ArrayList<Period> list = new ArrayList<Period>();
        for (final Period next : j) {
            final Period period = next;
            if (!period.getStates().contains(PeriodState.BREAK_SUPERVISION) && !period.getStates().contains(PeriodState.CANCELLED)) {
                list.add(next);
            }
        }
        final ArrayList list2 = new ArrayList<Long>(v.Y((Iterable<?>)list, 10));
        final Iterator<Object> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            list2.add(Long.valueOf(iterator2.next().getId()));
        }
        if (list2.isEmpty()) {
            return;
        }
        this.L();
        final com.untis.mobile.services.classbook.a r = this.R;
        if (r != null) {
            r.I().Q3(c.f()).C5((rx.functions.b)new g(this, list2), (rx.functions.b)new h(this, list2));
            return;
        }
        k0.S("classBookService");
        throw null;
    }
    
    private static final void B(final PeriodDetailActivity periodDetailActivity, final List list, final Boolean b) {
        k0.p(periodDetailActivity, "this$0");
        k0.p(list, "$periodIds");
        Log.d("untis_log", "success on syncronize in perioddetails");
        periodDetailActivity.G(list);
    }
    
    private static final void C(final PeriodDetailActivity periodDetailActivity, final List list, final Throwable t) {
        k0.p(periodDetailActivity, "this$0");
        k0.p(list, "$periodIds");
        Log.e("untis_log", "error on syncronize in perioddetails", t);
        periodDetailActivity.G(list);
    }
    
    private final Profile D(final Bundle bundle) {
        final String s = "";
        String string;
        if (bundle == null) {
            string = s;
        }
        else {
            string = bundle.getString("lilie");
            if (string == null) {
                string = s;
            }
        }
        final j0 g = j0.G;
        Profile profile;
        if ((profile = g.l(string)) == null) {
            profile = g.n();
            if (profile == null) {
                throw new IllegalStateException("profile must not be null");
            }
        }
        return profile;
    }
    
    private final com.untis.mobile.systemNotifications.b E() {
        return this.S.getValue();
    }
    
    private final void F() {
        ((RelativeLayout)this.findViewById(com.untis.mobile.c.i.nE)).setVisibility(8);
    }
    
    private final void G(final List<Long> list) {
        final com.untis.mobile.services.classbook.a r = this.R;
        if (r != null) {
            r.e(list).C5((rx.functions.b)new com.untis.mobile.ui.activities.period.c(this), (rx.functions.b)new com.untis.mobile.ui.activities.period.e(this));
            return;
        }
        k0.S("classBookService");
        throw null;
    }
    
    private static final void H(final PeriodDetailActivity periodDetailActivity, final Throwable t) {
        k0.p(periodDetailActivity, "this$0");
        final Throwable cause = t.getCause();
        if (cause == null || !(cause instanceof JsonRpcError) || !((JsonRpcError)cause).isAnyOf(JsonRpcErrorType.NoRight)) {
            u0.d(periodDetailActivity.findViewById(com.untis.mobile.c.i.W8), t);
        }
        Log.e("untis_log", "could not load period data", t);
        periodDetailActivity.N = false;
        periodDetailActivity.F();
    }
    
    private static final void I(final PeriodDetailActivity periodDetailActivity, final Boolean b) {
        k0.p(periodDetailActivity, "this$0");
        final List g0 = ((androidx.fragment.app.d)periodDetailActivity).getSupportFragmentManager().G0();
        k0.o(g0, "supportFragmentManager.fragments");
        final ArrayList<PeriodDetailFragment> list = new ArrayList<PeriodDetailFragment>();
        for (final PeriodDetailFragment next : g0) {
            if (next instanceof PeriodDetailFragment) {
                list.add(next);
            }
        }
        final Iterator<Object> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            iterator2.next().l1();
        }
        periodDetailActivity.N = false;
        periodDetailActivity.F();
    }
    
    private static final int J(final Period period, final Period period2) {
        int n;
        if ((n = ((org.joda.time.base.c)period.getStart()).b((l0)period2.getStart())) == 0 && (n = ((org.joda.time.base.c)period.getEnd()).b((l0)period2.getEnd())) == 0) {
            n = (int)(period.getId() - period2.getId());
        }
        return n;
    }
    
    private static final void K(final PeriodDetailActivity periodDetailActivity, final View view) {
        k0.p(periodDetailActivity, "this$0");
        final Profile g = periodDetailActivity.G;
        if (g != null) {
            periodDetailActivity.onOfflineMessageClick(g);
            return;
        }
        k0.S("profile");
        throw null;
    }
    
    private final void L() {
        ((RelativeLayout)this.findViewById(com.untis.mobile.c.i.nE)).setVisibility(0);
    }
    
    private final void M() {
        final CreateMessengerChannelActivity.a i = CreateMessengerChannelActivity.I;
        final Profile g = this.G;
        if (g != null) {
            ((ComponentActivity)this).startActivityForResult(i.a((Context)this, g.getUniqueId(), this.y().getLessonId()), 1800);
            return;
        }
        k0.S("profile");
        throw null;
    }
    
    private final void N() {
        final com.untis.mobile.messenger.a a = com.untis.mobile.messenger.a.a;
        if (a.h((Context)this)) {
            String channelId;
            if ((channelId = this.y().getChannelId()) == null) {
                channelId = "";
            }
            final Profile g = this.G;
            if (g == null) {
                k0.S("profile");
                throw null;
            }
            final int length = g.getMessengerServerUrl().length();
            final int n = 1;
            if (length != 0) {
                final Profile g2 = this.G;
                if (g2 == null) {
                    k0.S("profile");
                    throw null;
                }
                int n2;
                if (g2.getMessengerOrganizationId().length() == 0) {
                    n2 = n;
                }
                else {
                    n2 = 0;
                }
                if (n2 == 0) {
                    final Profile g3 = this.G;
                    if (g3 != null) {
                        a.m((Context)this, g3, channelId);
                        return;
                    }
                    k0.S("profile");
                    throw null;
                }
            }
            final com.untis.mobile.services.messenger.a u = this.U;
            if (u == null) {
                k0.S("messengerService");
                throw null;
            }
            u.b().C5((rx.functions.b)new com.untis.mobile.ui.activities.period.f(this, channelId), (rx.functions.b)new d(this));
        }
        else {
            a.i((Context)this);
        }
    }
    
    private static final void O(final PeriodDetailActivity periodDetailActivity, final String s, final MessengerCredential messengerCredential) {
        k0.p(periodDetailActivity, "this$0");
        k0.p(s, "$channelId");
        final Profile g = periodDetailActivity.G;
        if (g == null) {
            k0.S("profile");
            throw null;
        }
        g.setMessengerOrganizationId(messengerCredential.getOrganizationId());
        final Profile g2 = periodDetailActivity.G;
        if (g2 == null) {
            k0.S("profile");
            throw null;
        }
        g2.setMessengerServerUrl(messengerCredential.getServerUrl());
        final j0 g3 = j0.G;
        final Profile g4 = periodDetailActivity.G;
        if (g4 == null) {
            k0.S("profile");
            throw null;
        }
        g3.d(g4);
        final com.untis.mobile.messenger.a a = com.untis.mobile.messenger.a.a;
        final Profile g5 = periodDetailActivity.G;
        if (g5 != null) {
            a.m((Context)periodDetailActivity, g5, s);
            return;
        }
        k0.S("profile");
        throw null;
    }
    
    private static final void P(final PeriodDetailActivity periodDetailActivity, final Throwable t) {
        k0.p(periodDetailActivity, "this$0");
        u0.d(periodDetailActivity.findViewById(com.untis.mobile.c.i.W8), t);
    }
    
    private final void Q() {
        final MenuItem p = this.P;
        if (p == null) {
            return;
        }
        final Period y = this.y();
        final String channelId = y.getChannelId();
        if (channelId != null && channelId.length() != 0) {
            p.setVisible(true);
            return;
        }
        p.setVisible(y.getRights().contains(PeriodRight.WRITE_CHANNEL));
    }
    
    private final void R(int n) {
        final MenuItem o = this.O;
        if (o == null) {
            return;
        }
        final com.untis.mobile.systemNotifications.b e = this.E();
        final Profile g = this.G;
        if (g != null) {
            if (e.c(g.getUniqueId(), this.I).isEmpty()) {
                n = 2131231069;
            }
            else {
                n = 2131231132;
            }
            o.setIcon(androidx.core.content.d.i((Context)this, n));
            this.Q();
            return;
        }
        k0.S("profile");
        throw null;
    }
    
    static /* synthetic */ void S(final PeriodDetailActivity periodDetailActivity, int n, final int n2, final Object o) {
        if ((n2 & 0x1) != 0x0) {
            n = 0;
        }
        periodDetailActivity.R(n);
    }
    
    private final void T(final Period period) {
        if (period == null) {
            return;
        }
        final com.untis.mobile.services.masterdata.a t = this.T;
        if (t != null) {
            final PeriodElement subject = period.getSubject();
            long currentId;
            if (subject == null) {
                currentId = 0L;
            }
            else {
                currentId = subject.getCurrentId();
            }
            final Subject u = t.U(currentId);
            String str = "";
            if (u != null) {
                final String displayableTitle = u.getDisplayableTitle();
                if (displayableTitle != null) {
                    str = displayableTitle;
                }
            }
            String s;
            if (period.getStates().contains(PeriodState.BREAK_SUPERVISION)) {
                s = ((Activity)this).getString(2131886673);
            }
            else {
                s = str;
                if (period.getStates().contains(PeriodState.EXAM)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(((Activity)this).getString(2131886271));
                    sb.append(" - ");
                    sb.append(str);
                    s = sb.toString();
                }
            }
            k0.o(s, "when {\n            period.states.contains(PeriodState.BREAK_SUPERVISION) -> getString(R.string.shared_breakSupervision_text)\n            period.states.contains(PeriodState.EXAM) -> \"${getString(R.string.exam_title)} - $subject\"\n            else -> subject\n        }");
            S(this, 0, 1, null);
            final String c = com.untis.mobile.utils.time.b.c(period.getStart(), period.getEnd());
            k0.o(c, "toDisplayable(period.start, period.end)");
            this.setUpTopActionBar(s, c);
            return;
        }
        k0.S("masterDataService");
        throw null;
    }
    
    private final Period y() {
        while (true) {
            for (final Period next : this.J) {
                if (next.getId() == this.I) {
                    Period period;
                    if ((period = next) == null) {
                        final Period value = this.J.get(0);
                        k0.o(value, "periods[0]");
                        period = value;
                    }
                    return period;
                }
            }
            Period next = null;
            continue;
        }
    }
    
    private final com.untis.mobile.analytics.base.b z() {
        return this.V.getValue();
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    public void b(final int n, final float n2, final int n3) {
    }
    
    public void k(final int n) {
    }
    
    public void l(final int n) {
        final com.untis.mobile.ui.activities.period.adapter.a k = this.K;
        if (k != null) {
            this.T(k.b(n));
            S(this, 0, 1, null);
            return;
        }
        k0.S("periodDetailAdapter");
        throw null;
    }
    
    protected void onActivityResult(final int n, final int n2, @f final Intent intent) {
        final boolean b = n2 == -1;
        if (n != 110) {
            if (n != 120) {
                if (n != 300) {
                    if (n != 1000) {
                        if (n != 1700) {
                            if (n != 1800) {
                                super.onActivityResult(n, n2, intent);
                            }
                            else if (b) {
                                final String a = CreateMessengerChannelFragment.I.a(intent);
                                if (a == null) {
                                    return;
                                }
                                this.y().setChannelId(a);
                                S(this, 0, 1, null);
                            }
                        }
                        else if (!b) {
                            ((Activity)this).finish();
                        }
                    }
                    else {
                        S(this, 0, 1, null);
                        final List g0 = ((androidx.fragment.app.d)this).getSupportFragmentManager().G0();
                        k0.o(g0, "supportFragmentManager.fragments");
                        final ArrayList<PeriodDetailFragment> list = new ArrayList<PeriodDetailFragment>();
                        for (final PeriodDetailFragment next : g0) {
                            if (next instanceof PeriodDetailFragment) {
                                list.add(next);
                            }
                        }
                        final Iterator<Object> iterator2 = list.iterator();
                        while (iterator2.hasNext()) {
                            iterator2.next().l1();
                        }
                    }
                }
                else if (b) {
                    final List g2 = ((androidx.fragment.app.d)this).getSupportFragmentManager().G0();
                    k0.o(g2, "supportFragmentManager.fragments");
                    final ArrayList<PeriodDetailFragment> list2 = new ArrayList<PeriodDetailFragment>();
                    for (final PeriodDetailFragment next2 : g2) {
                        if (next2 instanceof PeriodDetailFragment) {
                            list2.add(next2);
                        }
                    }
                    final Iterator<Object> iterator4 = list2.iterator();
                    while (iterator4.hasNext()) {
                        iterator4.next().l1();
                    }
                }
            }
            else if (b && intent != null) {
                final HomeWorkDetailActivity.a p3 = HomeWorkDetailActivity.P;
                final HomeWork c = p3.c(intent);
                final boolean b2 = p3.b(intent);
                if (c != null) {
                    final List g3 = ((androidx.fragment.app.d)this).getSupportFragmentManager().G0();
                    k0.o(g3, "supportFragmentManager.fragments");
                    final ArrayList<PeriodDetailFragment> list3 = new ArrayList<PeriodDetailFragment>();
                    for (final PeriodDetailFragment next3 : g3) {
                        if (next3 instanceof PeriodDetailFragment) {
                            list3.add(next3);
                        }
                    }
                    final Iterator<Object> iterator6 = list3.iterator();
                    while (iterator6.hasNext()) {
                        iterator6.next().o1(c, b2);
                    }
                }
            }
        }
        else if (b) {
            final List g4 = ((androidx.fragment.app.d)this).getSupportFragmentManager().G0();
            k0.o(g4, "supportFragmentManager.fragments");
            final ArrayList<PeriodDetailFragment> list4 = new ArrayList<PeriodDetailFragment>();
            for (final PeriodDetailFragment next4 : g4) {
                if (next4 instanceof PeriodDetailFragment) {
                    list4.add(next4);
                }
            }
            final Iterator<Object> iterator8 = list4.iterator();
            while (iterator8.hasNext()) {
                iterator8.next().l1();
            }
        }
    }
    
    public void onBackPressed() {
        if (((Activity)this).isTaskRoot()) {
            final TimeTableActivity.a l = TimeTableActivity.L;
            final Profile g = this.G;
            if (g == null) {
                k0.S("profile");
                throw null;
            }
            final TimeTableEntity h = this.H;
            if (h == null) {
                k0.S("timeTableEntity");
                throw null;
            }
            final Intent e = l.e((Context)this, g, h);
            e.setFlags(805339136);
            ((Activity)this).startActivity(e);
        }
        else {
            super.onBackPressed();
        }
    }
    
    @Override
    protected void onCreate(@f final Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras;
        if (bundle == null) {
            extras = ((Activity)this).getIntent().getExtras();
        }
        else {
            extras = bundle;
        }
        final Profile d = this.D(extras);
        this.G = d;
        final Period period = null;
        if (d == null) {
            k0.S("profile");
            throw null;
        }
        this.Q = d.getTimeTableService();
        final Profile g = this.G;
        if (g == null) {
            k0.S("profile");
            throw null;
        }
        this.R = g.getClassBookService();
        final Profile g2 = this.G;
        if (g2 == null) {
            k0.S("profile");
            throw null;
        }
        this.T = g2.getMasterDataService();
        final Profile g3 = this.G;
        if (g3 == null) {
            k0.S("profile");
            throw null;
        }
        this.U = new com.untis.mobile.services.messenger.e(g3.getUniqueId());
        final j0 g4 = j0.G;
        final Profile n = g4.n();
        Object uniqueId;
        if (n == null) {
            uniqueId = null;
        }
        else {
            uniqueId = n.getUniqueId();
        }
        final Profile g5 = this.G;
        if (g5 == null) {
            k0.S("profile");
            throw null;
        }
        if (!k0.g(uniqueId, g5.getUniqueId())) {
            final Profile g6 = this.G;
            if (g6 == null) {
                k0.S("profile");
                throw null;
            }
            g4.h(g6);
        }
        Bundle extras2;
        if (bundle == null) {
            extras2 = ((Activity)this).getIntent().getExtras();
        }
        else {
            extras2 = bundle;
        }
        TimeTableEntity timeTableEntity;
        if (extras2 == null) {
            timeTableEntity = null;
        }
        else {
            timeTableEntity = (TimeTableEntity)extras2.getParcelable("loewenmaeulchen");
        }
        TimeTableEntity h = timeTableEntity;
        if (timeTableEntity == null) {
            h = new TimeTableEntity(null, 0L, false, 0, 0L, null, 63, null);
        }
        this.H = h;
        Bundle extras3;
        if (bundle == null) {
            extras3 = ((Activity)this).getIntent().getExtras();
        }
        else {
            extras3 = bundle;
        }
        this.N = (extras3 != null && extras3.getBoolean("sonnenblume", true));
        final t.a h2 = t.H;
        Bundle extras4;
        if (bundle == null) {
            extras4 = ((Activity)this).getIntent().getExtras();
        }
        else {
            extras4 = bundle;
        }
        int int1;
        if (extras4 == null) {
            int1 = 0;
        }
        else {
            int1 = extras4.getInt("tomato", 0);
        }
        this.L = h2.a(int1);
        final com.untis.mobile.utils.a a = com.untis.mobile.utils.a.a((Context)this);
        final Profile g7 = this.G;
        if (g7 == null) {
            k0.S("profile");
            throw null;
        }
        this.M = a.I1(g7);
        Bundle extras5;
        if (bundle == null) {
            extras5 = ((Activity)this).getIntent().getExtras();
        }
        else {
            extras5 = bundle;
        }
        long[] longArray;
        if (extras5 == null) {
            longArray = null;
        }
        else {
            longArray = extras5.getLongArray("rosen");
        }
        if (longArray != null) {
            for (final long n2 : longArray) {
                final k q = this.Q;
                if (q == null) {
                    k0.S("timeTableService");
                    throw null;
                }
                final Period l = q.l(n2);
                if (l == null) {
                    ((Activity)this).finish();
                    return;
                }
                this.J.add(l);
            }
        }
        v.p0(this.J, com.untis.mobile.ui.activities.period.b.G);
        Bundle extras6;
        if ((extras6 = bundle) == null) {
            extras6 = ((Activity)this).getIntent().getExtras();
        }
        long long1;
        if (extras6 == null) {
            long1 = 0L;
        }
        else {
            long1 = extras6.getLong("gaensebluemchen");
        }
        this.I = long1;
        this.setContentView(2131492944);
        this.setSupportActionBar((Toolbar)this.findViewById(com.untis.mobile.c.i.X8));
        final boolean a2 = g0.a((Context)this);
        int visibility = 8;
        Label_0660: {
            if (a2) {
                final Profile g8 = this.G;
                if (g8 == null) {
                    k0.S("profile");
                    throw null;
                }
                if (!g8.hasAnyState(ProfileState.InvalidApiSharedSecret)) {
                    ((RelativeLayout)this.findViewById(com.untis.mobile.c.i.V8)).setVisibility(8);
                    break Label_0660;
                }
            }
            final int v8 = com.untis.mobile.c.i.V8;
            ((RelativeLayout)this.findViewById(v8)).setVisibility(0);
            ((RelativeLayout)this.findViewById(v8)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.period.a(this));
        }
        final FragmentManager supportFragmentManager = ((androidx.fragment.app.d)this).getSupportFragmentManager();
        k0.o(supportFragmentManager, "supportFragmentManager");
        final Profile g9 = this.G;
        if (g9 == null) {
            k0.S("profile");
            throw null;
        }
        final TimeTableEntity h3 = this.H;
        if (h3 == null) {
            k0.S("timeTableEntity");
            throw null;
        }
        final ArrayList<Period> j = this.J;
        final long k = this.I;
        final t m = this.L;
        if (m == null) {
            k0.S("periodDetailMethod");
            throw null;
        }
        this.K = new com.untis.mobile.ui.activities.period.adapter.a(supportFragmentManager, g9, h3, j, k, m);
        final int y8 = com.untis.mobile.c.i.Y8;
        final ViewPager viewPager = (ViewPager)this.findViewById(y8);
        final com.untis.mobile.ui.activities.period.adapter.a k2 = this.K;
        if (k2 == null) {
            k0.S("periodDetailAdapter");
            throw null;
        }
        viewPager.setAdapter((androidx.viewpager.widget.a)k2);
        final ViewPager viewPager2 = (ViewPager)this.findViewById(y8);
        final com.untis.mobile.ui.activities.period.adapter.a k3 = this.K;
        if (k3 != null) {
            viewPager2.setCurrentItem(k3.c(this.I));
            ((ViewPager)this.findViewById(y8)).addOnPageChangeListener((ViewPager$j)this);
            final int u8 = com.untis.mobile.c.i.U8;
            ((CirclePageIndicator)this.findViewById(u8)).setViewPager((ViewPager)this.findViewById(y8));
            final CirclePageIndicator circlePageIndicator = (CirclePageIndicator)this.findViewById(u8);
            if (this.J.size() != 1) {
                visibility = 0;
            }
            circlePageIndicator.setVisibility(visibility);
            ((CirclePageIndicator)this.findViewById(u8)).setFillColor(androidx.core.content.d.f((Context)this, 2131099692));
            ((CirclePageIndicator)this.findViewById(u8)).setStrokeColor(androidx.core.content.d.f((Context)this, 2131099677));
            final androidx.appcompat.app.a supportActionBar = this.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.Y(true);
            }
            final Iterator<Object> iterator = this.J.iterator();
            Period next;
            do {
                next = period;
                if (!iterator.hasNext()) {
                    break;
                }
                next = iterator.next();
            } while (next.getId() != this.I);
            this.T(next);
            this.A();
            return;
        }
        k0.S("periodDetailAdapter");
        throw null;
    }
    
    public boolean onCreateOptionsMenu(@f final Menu menu) {
        this.getMenuInflater().inflate(2131558408, menu);
        MenuItem item;
        if (menu == null) {
            item = null;
        }
        else {
            item = menu.findItem(2131298439);
        }
        if (item == null) {
            return false;
        }
        this.O = item;
        final MenuItem item2 = menu.findItem(2131298438);
        if (item2 == null) {
            return false;
        }
        this.P = item2;
        S(this, 0, 1, null);
        return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(@e final MenuItem menuItem) {
        k0.p(menuItem, "item");
        final int itemId = menuItem.getItemId();
        final boolean b = true;
        switch (itemId) {
            case 2131298439: {
                final com.untis.mobile.utils.a a = com.untis.mobile.utils.a.a((Context)this);
                final Profile g = this.G;
                if (g == null) {
                    k0.S("profile");
                    throw null;
                }
                if (!a.I(g)) {
                    break;
                }
                final com.untis.mobile.ui.activities.period.adapter.a k = this.K;
                if (k == null) {
                    k0.S("periodDetailAdapter");
                    throw null;
                }
                final Period b2 = k.b(((ViewPager)this.findViewById(com.untis.mobile.c.i.Y8)).getCurrentItem());
                final Profile g2 = this.G;
                if (g2 == null) {
                    k0.S("profile");
                    throw null;
                }
                final long id = b2.getId();
                final long n = ((org.joda.time.base.g)b2.getStart()).n();
                final long n2 = ((org.joda.time.base.g)b2.getEnd()).n();
                final TimeTableEntity h = this.H;
                if (h == null) {
                    k0.S("timeTableEntity");
                    throw null;
                }
                final EntityType entityType = h.getEntityType();
                final TimeTableEntity h2 = this.H;
                if (h2 != null) {
                    ((ComponentActivity)this).startActivityForResult(PeriodDetailCustomNotificationListActivity.x((Context)this, g2, id, n, n2, entityType, h2.getEntityId()), 1000);
                    break;
                }
                k0.S("timeTableEntity");
                throw null;
            }
            case 2131298438: {
                final String channelId = this.y().getChannelId();
                int n3 = b ? 1 : 0;
                if (channelId != null) {
                    if (s.U1((CharSequence)channelId)) {
                        n3 = (b ? 1 : 0);
                    }
                    else {
                        n3 = 0;
                    }
                }
                if (n3 != 0) {
                    this.M();
                    break;
                }
                this.N();
                break;
            }
            case 16908332: {
                this.onBackPressed();
                return true;
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        b.setUpTopActionBar$default(this, null, null, 3, null);
    }
    
    protected void onSaveInstanceState(@e final Bundle bundle) {
        k0.p(bundle, "outState");
        super.onSaveInstanceState(bundle);
        final Profile g = this.G;
        if (g == null) {
            k0.S("profile");
            throw null;
        }
        bundle.putString("lilie", g.getUniqueId());
        final ArrayList<Period> j = this.J;
        final ArrayList list = new ArrayList<Long>(v.Y((Iterable<?>)j, 10));
        final Iterator<Object> iterator = j.iterator();
        while (iterator.hasNext()) {
            list.add(Long.valueOf(iterator.next().getId()));
        }
        bundle.putLongArray("rosen", v.J5((Collection<Long>)list));
        bundle.putLong("gaensebluemchen", this.I);
        final TimeTableEntity h = this.H;
        if (h != null) {
            bundle.putParcelable("loewenmaeulchen", (Parcelable)h);
            bundle.putBoolean("sonnenblume", this.N);
            return;
        }
        k0.S("timeTableEntity");
        throw null;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00008\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ@\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007J8\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007R\u0016\u0010\u0012\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013¨\u0006\u001b" }, d2 = { "com/untis/mobile/ui/activities/period/PeriodDetailActivity$a", "", "Landroid/content/Context;", "context", "", "profileId", "Lcom/untis/mobile/persistence/models/timetable/TimeTableEntity;", "timeTableEntity", "", "", "periodIds", "selectedPeriodId", "Lcom/untis/mobile/ui/activities/period/t;", "periodDetailMethod", "Landroid/content/Intent;", "b", "Landroid/os/Bundle;", "e", "BUNDLE_LOAD_PERIOD_DATA", "Ljava/lang/String;", "BUNDLE_PERIOD_DETAIL_METHOD_VALUE", "BUNDLE_PERIOD_IDS", "BUNDLE_PROFILE_ID", "BUNDLE_SELECTED_PERIOD_ID", "BUNDLE_TIMETABLE_ENTITY", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        public static /* synthetic */ Intent c(final a a, final Context context, final String s, final TimeTableEntity timeTableEntity, final Collection collection, final long n, t l, final int n2, final Object o) {
            if ((n2 & 0x20) != 0x0) {
                l = t.L;
            }
            return a.b(context, s, timeTableEntity, collection, n, l);
        }
        
        public static /* synthetic */ Bundle f(final a a, final String s, final TimeTableEntity timeTableEntity, final Collection collection, final long n, t l, final int n2, final Object o) {
            if ((n2 & 0x10) != 0x0) {
                l = t.L;
            }
            return a.e(s, timeTableEntity, collection, n, l);
        }
        
        @m6.h
        @e
        public final Intent a(@e final Context context, @e final String s, @e final TimeTableEntity timeTableEntity, @e final Collection<Long> collection, final long n) {
            k0.p(context, "context");
            k0.p(s, "profileId");
            k0.p(timeTableEntity, "timeTableEntity");
            k0.p(collection, "periodIds");
            return c(this, context, s, timeTableEntity, collection, n, null, 32, null);
        }
        
        @m6.h
        @e
        public final Intent b(@e final Context context, @e final String s, @e final TimeTableEntity timeTableEntity, @e final Collection<Long> collection, final long n, @e final t t) {
            k0.p(context, "context");
            k0.p(s, "profileId");
            k0.p(timeTableEntity, "timeTableEntity");
            k0.p(collection, "periodIds");
            k0.p(t, "periodDetailMethod");
            final Intent intent = new Intent(context, (Class)PeriodDetailActivity.class);
            intent.putExtras(this.e(s, timeTableEntity, collection, n, t));
            return intent;
        }
        
        @m6.h
        @e
        public final Bundle d(@e final String s, @e final TimeTableEntity timeTableEntity, @e final Collection<Long> collection, final long n) {
            k0.p(s, "profileId");
            k0.p(timeTableEntity, "timeTableEntity");
            k0.p(collection, "periodIds");
            return f(this, s, timeTableEntity, collection, n, null, 16, null);
        }
        
        @m6.h
        @e
        public final Bundle e(@e final String s, @e final TimeTableEntity timeTableEntity, @e final Collection<Long> collection, final long n, @e final t t) {
            k0.p(s, "profileId");
            k0.p(timeTableEntity, "timeTableEntity");
            k0.p(collection, "periodIds");
            k0.p(t, "periodDetailMethod");
            final Bundle bundle = new Bundle();
            bundle.putParcelable("loewenmaeulchen", (Parcelable)timeTableEntity);
            bundle.putString("lilie", s);
            bundle.putLongArray("rosen", v.J5(collection));
            bundle.putLong("gaensebluemchen", n);
            bundle.putInt("tomato", t.d());
            return bundle;
        }
    }
}
