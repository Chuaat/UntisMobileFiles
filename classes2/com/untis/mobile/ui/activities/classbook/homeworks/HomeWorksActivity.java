// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.classbook.homeworks;

import android.widget.ImageButton;
import android.app.Activity;
import androidx.activity.ComponentActivity;
import android.view.MenuItem;
import androidx.fragment.app.FragmentManager;
import android.view.View$OnClickListener;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout$i;
import com.google.android.material.tabs.TabLayout$f;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.untis.mobile.ui.activities.views.NonSwipeableViewPager;
import java.util.Set;
import com.untis.mobile.persistence.models.timetable.period.PeriodElement;
import org.joda.time.c;
import com.untis.mobile.services.profile.legacy.j0;
import android.os.Bundle;
import kotlin.coroutines.g;
import kotlinx.coroutines.h;
import kotlin.c1;
import kotlin.coroutines.jvm.internal.o;
import kotlin.j2;
import kotlin.coroutines.d;
import kotlinx.coroutines.r0;
import n6.p;
import org.jetbrains.annotations.f;
import android.content.Intent;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import com.untis.mobile.persistence.models.timetable.period.PeriodRight;
import com.untis.mobile.persistence.models.classbook.homework.HomeWork;
import android.content.Context;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.persistence.models.timetable.TimeTableEntity;
import kotlin.jvm.internal.k0;
import android.view.View;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import android.content.ComponentCallbacks;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.w;
import kotlin.b0;
import com.untis.mobile.services.classbook.a;
import com.untis.mobile.services.timetable.placeholder.k;
import com.untis.mobile.persistence.models.timetable.period.Classbook;
import com.untis.mobile.persistence.models.timetable.period.Period;
import com.untis.mobile.persistence.models.profile.Profile;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.activities.common.b;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 52\u00020\u0001:\u00016B\u0007¢\u0006\u0004\b3\u00104J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014J\b\u0010\f\u001a\u00020\nH\u0014J\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0004J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\"\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014J\u0010\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\bH\u0014J\u000e\u0010\u001a\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0004R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u001d\u0010*\u001a\u00020%8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101¨\u00067" }, d2 = { "Lcom/untis/mobile/ui/activities/classbook/homeworks/HomeWorksActivity;", "Lcom/untis/mobile/ui/activities/common/b;", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "period", "Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;", "homework", "", "C", "Landroid/os/Bundle;", "save", "Lkotlin/j2;", "onCreate", "onResume", "homeWork", "B", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "outState", "onSaveInstanceState", "w", "Lcom/untis/mobile/persistence/models/timetable/period/Classbook;", "I", "Lcom/untis/mobile/persistence/models/timetable/period/Classbook;", "classbook", "H", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "Lcom/untis/mobile/services/timetable/placeholder/k;", "J", "Lcom/untis/mobile/services/timetable/placeholder/k;", "timeTableService", "Lcom/untis/mobile/analytics/base/b;", "L", "Lkotlin/b0;", "z", "()Lcom/untis/mobile/analytics/base/b;", "analyticsTracker", "Lcom/untis/mobile/services/classbook/a;", "K", "Lcom/untis/mobile/services/classbook/a;", "classBookService", "Lcom/untis/mobile/persistence/models/profile/Profile;", "G", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "<init>", "()V", "M", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class HomeWorksActivity extends b
{
    @e
    public static final a M;
    @e
    private static final String N = "semmelwei\u00df";
    @e
    private static final String O = "ockerbraun";
    private Profile G;
    private Period H;
    private Classbook I;
    private k J;
    private com.untis.mobile.services.classbook.a K;
    @e
    private final b0 L;
    
    static {
        M = new a(null);
    }
    
    public HomeWorksActivity() {
        this.L = d0.c((n6.a<?>)new n6.a<com.untis.mobile.analytics.base.b>() {
            final /* synthetic */ ComponentCallbacks G;
            
            @e
            @Override
            public final com.untis.mobile.analytics.base.b invoke() {
                return (com.untis.mobile.analytics.base.b)org.koin.android.ext.android.a.e(this.G).y().t(k1.d(com.untis.mobile.analytics.base.b.class), null, null);
            }
        });
    }
    
    private static final void A(final HomeWorksActivity homeWorksActivity, final View view) {
        k0.p(homeWorksActivity, "this$0");
        final HomeWorkDetailActivity.a p2 = HomeWorkDetailActivity.P;
        final Profile g = homeWorksActivity.G;
        if (g == null) {
            k0.S("profile");
            throw null;
        }
        final String uniqueId = g.getUniqueId();
        final TimeTableEntity timeTableEntity = new TimeTableEntity(null, 0L, false, 0, 0L, null, 63, null);
        final Period h = homeWorksActivity.H;
        if (h != null) {
            ((ComponentActivity)homeWorksActivity).startActivityForResult(p2.e((Context)homeWorksActivity, uniqueId, timeTableEntity, h), 120);
            return;
        }
        k0.S("period");
        throw null;
    }
    
    private final boolean C(final Period period, final HomeWork homeWork) {
        if (homeWork.getId() < 0L) {
            final com.untis.mobile.utils.a a = com.untis.mobile.utils.a.a((Context)this);
            final Profile g = this.G;
            if (g == null) {
                k0.S("profile");
                throw null;
            }
            if (a.J(g)) {
                return true;
            }
        }
        return period.getRights().contains(PeriodRight.WRITE_HOMEWORK);
    }
    
    public static final /* synthetic */ com.untis.mobile.services.classbook.a t(final HomeWorksActivity homeWorksActivity) {
        return homeWorksActivity.K;
    }
    
    public static final /* synthetic */ Classbook u(final HomeWorksActivity homeWorksActivity) {
        return homeWorksActivity.I;
    }
    
    public static final /* synthetic */ k v(final HomeWorksActivity homeWorksActivity) {
        return homeWorksActivity.J;
    }
    
    private static final void x(final HomeWorksActivity homeWorksActivity, final HomeWork homeWork, final HomeWork homeWork2) {
        k0.p(homeWorksActivity, "this$0");
        k0.p(homeWork, "$homeWork");
        ((Activity)homeWorksActivity).setResult(-1, HomeWorkDetailActivity.P.f(homeWork, true));
        final List g0 = ((androidx.fragment.app.d)homeWorksActivity).getSupportFragmentManager().G0();
        k0.o(g0, "supportFragmentManager.fragments");
        final ArrayList<HomeWorkFragment> list = new ArrayList<HomeWorkFragment>();
        for (final HomeWorkFragment next : g0) {
            if (next instanceof HomeWorkFragment) {
                list.add(next);
            }
        }
        final Iterator<Object> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            iterator2.next().x(homeWork, true);
        }
    }
    
    private static final void y(final HomeWorksActivity homeWorksActivity, final HomeWork homeWork, final Throwable t) {
        k0.p(homeWorksActivity, "this$0");
        k0.p(homeWork, "$homeWork");
        ((Activity)homeWorksActivity).setResult(-1, HomeWorkDetailActivity.P.f(homeWork, true));
        final List g0 = ((androidx.fragment.app.d)homeWorksActivity).getSupportFragmentManager().G0();
        k0.o(g0, "supportFragmentManager.fragments");
        final ArrayList<HomeWorkFragment> list = new ArrayList<HomeWorkFragment>();
        for (final HomeWorkFragment next : g0) {
            if (next instanceof HomeWorkFragment) {
                list.add(next);
            }
        }
        final Iterator<Object> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            iterator2.next().x(homeWork, true);
        }
    }
    
    private final com.untis.mobile.analytics.base.b z() {
        return this.L.getValue();
    }
    
    public final void B(@e final HomeWork homeWork) {
        k0.p(homeWork, "homeWork");
        final HomeWorkDetailActivity.a p = HomeWorkDetailActivity.P;
        final Profile g = this.G;
        if (g == null) {
            k0.S("profile");
            throw null;
        }
        final String uniqueId = g.getUniqueId();
        final Period h = this.H;
        if (h != null) {
            ((ComponentActivity)this).startActivityForResult(p.d((Context)this, uniqueId, homeWork, this.C(h, homeWork) ^ true), 120);
            return;
        }
        k0.S("period");
        throw null;
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    protected void onActivityResult(final int n, final int n2, @f final Intent intent) {
        final boolean b = n2 == -1;
        if (n == 120) {
            if (b && intent != null) {
                final HomeWorkDetailActivity.a p3 = HomeWorkDetailActivity.P;
                final HomeWork c = p3.c(intent);
                final boolean b2 = p3.b(intent);
                if (c != null) {
                    if (c.getPeriodId() != 0L && !b2) {
                        final Classbook i = this.I;
                        if (i == null) {
                            k0.S("classbook");
                            throw null;
                        }
                        i.getHomeWorks().remove(c);
                        final Classbook j = this.I;
                        if (j == null) {
                            k0.S("classbook");
                            throw null;
                        }
                        j.getHomeWorks().add(c);
                    }
                    else {
                        final Classbook k = this.I;
                        if (k == null) {
                            k0.S("classbook");
                            throw null;
                        }
                        final Iterator<HomeWork> iterator = k.getHomeWorks().iterator();
                        while (iterator.hasNext()) {
                            if (iterator.next().getId() == c.getId()) {
                                iterator.remove();
                                break;
                            }
                        }
                    }
                }
                h.h((g)null, (p)new p<r0, d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ HomeWorksActivity H;
                    
                    @org.jetbrains.annotations.e
                    @Override
                    public final kotlin.coroutines.d<j2> create(@f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                        return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                            int G;
                            final /* synthetic */ HomeWorksActivity H = this.H;
                        };
                    }
                    
                    @f
                    @Override
                    public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @f final kotlin.coroutines.d<? super j2> d) {
                        return ((HomeWorksActivity$c)this.create(r0, d)).invokeSuspend(j2.a);
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
                            final a t = HomeWorksActivity.t(this.H);
                            if (t == null) {
                                k0.S("classBookService");
                                throw null;
                            }
                            final Classbook u = HomeWorksActivity.u(this.H);
                            if (u == null) {
                                k0.S("classbook");
                                throw null;
                            }
                            this.G = 1;
                            if (t.a0(u, this) == h) {
                                return h;
                            }
                        }
                        return j2.a;
                    }
                }, 1, (Object)null);
                final List g0 = ((androidx.fragment.app.d)this).getSupportFragmentManager().G0();
                k0.o(g0, "supportFragmentManager.fragments");
                final ArrayList<HomeWorkFragment> list = new ArrayList<HomeWorkFragment>();
                for (final HomeWorkFragment next : g0) {
                    if (next instanceof HomeWorkFragment) {
                        list.add(next);
                    }
                }
                final Iterator<Object> iterator3 = list.iterator();
                while (iterator3.hasNext()) {
                    iterator3.next().w();
                }
                ((Activity)this).setResult(-1, intent);
            }
        }
        else {
            super.onActivityResult(n, n2, intent);
        }
    }
    
    @Override
    protected void onCreate(@f Bundle extras) {
        super.onCreate(extras);
        final j0 g = j0.G;
        Bundle extras2;
        if (extras == null) {
            extras2 = ((Activity)this).getIntent().getExtras();
        }
        else {
            extras2 = extras;
        }
        final String s = "";
        String string;
        if (extras2 == null) {
            string = s;
        }
        else {
            string = extras2.getString("semmelwei\u00df", "");
            if (string == null) {
                string = s;
            }
        }
        Profile g2;
        if ((g2 = g.l(string)) == null) {
            g2 = g.n();
            if (g2 == null) {
                throw new IllegalStateException("profile must not be null");
            }
        }
        this.G = g2;
        this.J = g2.getTimeTableService();
        final Profile g3 = this.G;
        if (g3 == null) {
            k0.S("profile");
            throw null;
        }
        this.K = g3.getClassBookService();
        if (extras == null) {
            extras = ((Activity)this).getIntent().getExtras();
        }
        long long1;
        if (extras == null) {
            long1 = 0L;
        }
        else {
            long1 = extras.getLong("ockerbraun");
        }
        final k j = this.J;
        if (j == null) {
            k0.S("timeTableService");
            throw null;
        }
        Period l;
        if ((l = j.l(long1)) == null) {
            l = new Period(long1, 0L, null, null, null, null, null, null, 0, 0, 0, 0, null, null, null, false, null, 131070, null);
        }
        this.H = l;
        final com.untis.mobile.services.classbook.a k = this.K;
        if (k == null) {
            k0.S("classBookService");
            throw null;
        }
        Classbook s2;
        if ((s2 = k.S(long1)) == null) {
            s2 = new Classbook(long1, null, null, null, null, null, null, false, false, null, 1022, null);
        }
        this.I = s2;
        this.setContentView(2131492922);
        final int c6 = com.untis.mobile.c.i.c6;
        final NonSwipeableViewPager nonSwipeableViewPager = (NonSwipeableViewPager)this.findViewById(c6);
        final FragmentManager supportFragmentManager = ((androidx.fragment.app.d)this).getSupportFragmentManager();
        k0.o(supportFragmentManager, "supportFragmentManager");
        final Profile g4 = this.G;
        if (g4 == null) {
            k0.S("profile");
            throw null;
        }
        nonSwipeableViewPager.setAdapter((androidx.viewpager.widget.a)new com.untis.mobile.ui.activities.classbook.homeworks.k0(supportFragmentManager, g4.getUniqueId(), long1));
        final int b6 = com.untis.mobile.c.i.b6;
        ((TabLayout)this.findViewById(b6)).setupWithViewPager((ViewPager)this.findViewById(c6));
        final TabLayout tabLayout = (TabLayout)this.findViewById(b6);
        boolean b7 = false;
        final TabLayout$i z = tabLayout.z(0);
        k0.m(z);
        z.C(2131886670);
        final TabLayout$i z2 = ((TabLayout)this.findViewById(b6)).z(1);
        k0.m(z2);
        z2.C(2131886299);
        ((NonSwipeableViewPager)this.findViewById(c6)).setCurrentItem((int)(com.untis.mobile.utils.a.a((Context)this).G() ? 1 : 0));
        ((TabLayout)this.findViewById(b6)).d((TabLayout$f)new TabLayout$f() {
            final /* synthetic */ HomeWorksActivity G;
            
            public void g(@e final TabLayout$i tabLayout$i) {
                k0.p(tabLayout$i, "tab");
            }
            
            public void i(@e final TabLayout$i tabLayout$i) {
                k0.p(tabLayout$i, "tab");
                final com.untis.mobile.utils.a a = com.untis.mobile.utils.a.a((Context)this.G);
                final int k = tabLayout$i.k();
                boolean b = true;
                if (k != 1) {
                    b = false;
                }
                a.f0(b);
            }
            
            public void p(@e final TabLayout$i tabLayout$i) {
                k0.p(tabLayout$i, "tab");
            }
        });
        final androidx.appcompat.app.a supportActionBar = this.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.z0(2131886306);
        }
        final androidx.appcompat.app.a supportActionBar2 = this.getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.Y(true);
        }
        final Period h = this.H;
        if (h != null) {
            Label_0554: {
                if (!h.getRights().contains(PeriodRight.WRITE_HOMEWORK)) {
                    final com.untis.mobile.utils.a a = com.untis.mobile.utils.a.a((Context)this);
                    final Profile g5 = this.G;
                    if (g5 == null) {
                        k0.S("profile");
                        throw null;
                    }
                    if (!a.J(g5)) {
                        break Label_0554;
                    }
                }
                b7 = true;
            }
            final FloatingActionButton floatingActionButton = (FloatingActionButton)this.findViewById(com.untis.mobile.c.i.Z5);
            if (b7) {
                floatingActionButton.z();
            }
            else {
                floatingActionButton.n();
            }
            ((ImageButton)this.findViewById(com.untis.mobile.c.i.Z5)).setOnClickListener((View$OnClickListener)new l0(this));
            return;
        }
        k0.S("period");
        throw null;
    }
    
    @Override
    public boolean onOptionsItemSelected(@e final MenuItem menuItem) {
        k0.p(menuItem, "item");
        if (menuItem.getItemId() == 16908332) {
            ((ComponentActivity)this).onBackPressed();
            return true;
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
        bundle.putString("semmelwei\u00df", g.getUniqueId());
        final Period h = this.H;
        if (h != null) {
            bundle.putLong("ockerbraun", h.getId());
            return;
        }
        k0.S("period");
        throw null;
    }
    
    public final void w(@e final HomeWork homeWork) {
        k0.p(homeWork, "homeWork");
        this.z().c(com.untis.mobile.analytics.base.c.e.N);
        if (homeWork.getLocal()) {
            h.h((g)null, (p)new p<r0, d<? super j2>, Object>() {
                int G;
                final /* synthetic */ HomeWorksActivity H;
                final /* synthetic */ HomeWork I;
                
                @org.jetbrains.annotations.e
                @Override
                public final kotlin.coroutines.d<j2> create(@f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                    return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                        int G;
                        final /* synthetic */ HomeWorksActivity H = this.H;
                        final /* synthetic */ HomeWork I = this.I;
                    };
                }
                
                @f
                @Override
                public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @f final kotlin.coroutines.d<? super j2> d) {
                    return ((HomeWorksActivity$b)this.create(r0, d)).invokeSuspend(j2.a);
                }
                
                @f
                public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                    final Object h = kotlin.coroutines.intrinsics.b.h();
                    final int g = this.G;
                    if (g != 0) {
                        if (g != 1) {
                            if (g == 2) {
                                c1.n(o);
                                return j2.a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        else {
                            c1.n(o);
                        }
                    }
                    else {
                        c1.n(o);
                        final a t = HomeWorksActivity.t(this.H);
                        if (t == null) {
                            k0.S("classBookService");
                            throw null;
                        }
                        final HomeWork i = this.I;
                        this.G = 1;
                        if (t.f0(i, this) == h) {
                            return h;
                        }
                    }
                    final k v = HomeWorksActivity.v(this.H);
                    if (v == null) {
                        k0.S("timeTableService");
                        throw null;
                    }
                    final HomeWork j = this.I;
                    this.G = 2;
                    if (k.a.b(v, j, false, this, 2, null) == h) {
                        return h;
                    }
                    return j2.a;
                }
            }, 1, (Object)null);
            ((Activity)this).setResult(-1, HomeWorkDetailActivity.P.f(homeWork, true));
            final List g0 = ((androidx.fragment.app.d)this).getSupportFragmentManager().G0();
            k0.o(g0, "supportFragmentManager.fragments");
            final ArrayList<HomeWorkFragment> list = new ArrayList<HomeWorkFragment>();
            for (final HomeWorkFragment next : g0) {
                if (next instanceof HomeWorkFragment) {
                    list.add(next);
                }
            }
            final Iterator<Object> iterator2 = list.iterator();
            while (iterator2.hasNext()) {
                iterator2.next().x(homeWork, true);
            }
            return;
        }
        homeWork.setPeriodId(0L);
        homeWork.setSynced(false);
        final com.untis.mobile.services.classbook.a k = this.K;
        if (k != null) {
            k.e0(homeWork).C5((rx.functions.b)new com.untis.mobile.ui.activities.classbook.homeworks.m0(this, homeWork), (rx.functions.b)new n0(this, homeWork));
            return;
        }
        k0.S("classBookService");
        throw null;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0016\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\u000f" }, d2 = { "com/untis/mobile/ui/activities/classbook/homeworks/HomeWorksActivity$a", "", "Landroid/content/Context;", "context", "", "profileId", "", "periodId", "Landroid/content/Intent;", "a", "BUNDLE_PERIOD_ID", "Ljava/lang/String;", "BUNDLE_PROFILE_ID", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final Intent a(@e final Context context, @e final String s, final long n) {
            k0.p(context, "context");
            k0.p(s, "profileId");
            final Intent intent = new Intent(context, (Class)HomeWorksActivity.class);
            final Bundle bundle = new Bundle();
            bundle.putString("semmelwei\u00df", s);
            bundle.putLong("ockerbraun", n);
            intent.putExtras(bundle);
            return intent;
        }
    }
}
