// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.classbook.homeworks;

import kotlin.coroutines.g;
import kotlinx.coroutines.h;
import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.o;
import kotlinx.coroutines.r0;
import n6.p;
import java.util.Iterator;
import android.widget.ListAdapter;
import android.widget.ListView;
import kotlin.jvm.internal.m0;
import kotlin.j2;
import n6.l;
import java.util.ArrayList;
import java.util.Objects;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import java.util.Set;
import java.util.List;
import com.untis.mobile.persistence.models.timetable.period.PeriodElement;
import org.joda.time.c;
import com.untis.mobile.services.profile.legacy.j0;
import android.os.Bundle;
import androidx.fragment.app.d;
import org.joda.time.t;
import org.joda.time.n0;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.classbook.homework.HomeWork;
import kotlin.jvm.internal.w;
import com.untis.mobile.services.classbook.a;
import com.untis.mobile.services.timetable.placeholder.k;
import com.untis.mobile.persistence.models.timetable.period.Classbook;
import com.untis.mobile.persistence.models.timetable.period.Period;
import com.untis.mobile.persistence.models.profile.Profile;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.fragments.common.UmFragment;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 42\u00020\u0001:\u00015B\u0007¢\u0006\u0004\b2\u00103J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J&\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\tH\u0016J\u0006\u0010\u0014\u001a\u00020\u0004J\u0018\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u0007R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00101\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u00066" }, d2 = { "Lcom/untis/mobile/ui/activities/classbook/homeworks/HomeWorkFragment;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;", "homework", "Lkotlin/j2;", "v", "homeWork", "", "u", "Landroid/os/Bundle;", "save", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "outState", "onSaveInstanceState", "w", "delete", "x", "Lcom/untis/mobile/services/timetable/placeholder/k;", "L", "Lcom/untis/mobile/services/timetable/placeholder/k;", "timeTableService", "Lcom/untis/mobile/services/classbook/a;", "M", "Lcom/untis/mobile/services/classbook/a;", "classBookService", "Lcom/untis/mobile/ui/activities/classbook/homeworks/f;", "K", "Lcom/untis/mobile/ui/activities/classbook/homeworks/f;", "adapter", "Lcom/untis/mobile/persistence/models/profile/Profile;", "G", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Lcom/untis/mobile/persistence/models/timetable/period/Classbook;", "I", "Lcom/untis/mobile/persistence/models/timetable/period/Classbook;", "classbook", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "H", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "period", "J", "Z", "onlyUncompleted", "<init>", "()V", "N", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class HomeWorkFragment extends UmFragment
{
    @e
    public static final a N;
    @e
    private static final String O = "krabben";
    @e
    private static final String P = "spinnen";
    @e
    private static final String Q = "acht";
    private Profile G;
    private Period H;
    private Classbook I;
    private boolean J;
    private f K;
    private k L;
    private com.untis.mobile.services.classbook.a M;
    
    static {
        N = new a(null);
    }
    
    public static final /* synthetic */ com.untis.mobile.services.classbook.a r(final HomeWorkFragment homeWorkFragment) {
        return homeWorkFragment.M;
    }
    
    public static final /* synthetic */ Classbook s(final HomeWorkFragment homeWorkFragment) {
        return homeWorkFragment.I;
    }
    
    private final boolean u(final HomeWork homeWork) {
        if (!this.J) {
            final t h1 = homeWork.getEnd().h1();
            final Period h2 = this.H;
            if (h2 == null) {
                k0.S("period");
                throw null;
            }
            if (((org.joda.time.base.e)h1).o((n0)h2.getStart().h1())) {
                return false;
            }
            final t h3 = homeWork.getStart().h1();
            final Period h4 = this.H;
            if (h4 == null) {
                k0.S("period");
                throw null;
            }
            if (((org.joda.time.base.e)h3).m((n0)h4.getEnd().h1())) {
                return false;
            }
        }
        return !this.J || (homeWork.getCompletedStatus() ^ true);
    }
    
    private final void v(final HomeWork homeWork) {
        final d activity = this.getActivity();
        HomeWorksActivity homeWorksActivity;
        if (activity instanceof HomeWorksActivity) {
            homeWorksActivity = (HomeWorksActivity)activity;
        }
        else {
            homeWorksActivity = null;
        }
        if (homeWorksActivity != null) {
            homeWorksActivity.B(homeWork);
        }
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    public void onCreate(@org.jetbrains.annotations.f Bundle arguments) {
        super.onCreate(arguments);
        Bundle arguments2;
        if (arguments == null) {
            arguments2 = this.getArguments();
        }
        else {
            arguments2 = arguments;
        }
        final String s = "";
        String string;
        if (arguments2 == null) {
            string = s;
        }
        else {
            string = arguments2.getString("spinnen", "");
            if (string == null) {
                string = s;
            }
        }
        final j0 g = j0.G;
        Profile g2;
        if ((g2 = g.l(string)) == null) {
            g2 = g.n();
            if (g2 == null) {
                throw new IllegalStateException("profile must not be null");
            }
        }
        this.G = g2;
        this.L = g2.getTimeTableService();
        final Profile g3 = this.G;
        if (g3 == null) {
            k0.S("profile");
            throw null;
        }
        this.M = g3.getClassBookService();
        Bundle arguments3;
        if (arguments == null) {
            arguments3 = this.getArguments();
        }
        else {
            arguments3 = arguments;
        }
        Long value;
        if (arguments3 == null) {
            value = null;
        }
        else {
            value = arguments3.getLong("krabben");
        }
        if (value == null) {
            throw new IllegalArgumentException("period id must not be null");
        }
        final long longValue = value;
        final k l = this.L;
        if (l == null) {
            k0.S("timeTableService");
            throw null;
        }
        Period i = l.l(longValue);
        if (i == null) {
            i = new Period(longValue, 0L, null, null, null, null, null, null, 0, 0, 0, 0, null, null, null, false, null, 131070, null);
        }
        this.H = i;
        final com.untis.mobile.services.classbook.a m = this.M;
        if (m != null) {
            Classbook s2;
            if ((s2 = m.S(longValue)) == null) {
                s2 = new Classbook(longValue, null, null, null, null, null, null, false, false, null, 1022, null);
            }
            this.I = s2;
            if (arguments == null) {
                arguments = this.getArguments();
            }
            k0.m(arguments);
            this.J = arguments.getBoolean("acht");
            return;
        }
        k0.S("classBookService");
        throw null;
    }
    
    @org.jetbrains.annotations.f
    public View onCreateView(@e final LayoutInflater layoutInflater, @org.jetbrains.annotations.f final ViewGroup viewGroup, @org.jetbrains.annotations.f final Bundle bundle) {
        k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131493106, viewGroup, false);
        final d activity = this.getActivity();
        Objects.requireNonNull(activity, "null cannot be cast to non-null type com.untis.mobile.ui.activities.classbook.homeworks.HomeWorksActivity");
        final HomeWorksActivity homeWorksActivity = (HomeWorksActivity)activity;
        final Profile g = this.G;
        if (g == null) {
            k0.S("profile");
            throw null;
        }
        final String uniqueId = g.getUniqueId();
        final Period h = this.H;
        if (h == null) {
            k0.S("period");
            throw null;
        }
        final Classbook i = this.I;
        if (i == null) {
            k0.S("classbook");
            throw null;
        }
        final Set<HomeWork> homeWorks = i.getHomeWorks();
        final ArrayList<HomeWork> list = new ArrayList<HomeWork>();
        for (final HomeWork next : homeWorks) {
            if (this.u(next)) {
                list.add(next);
            }
        }
        this.K = new f(homeWorksActivity, uniqueId, h, list, new l<HomeWork, j2>() {
            public final void a(@e final HomeWork homeWork) {
                k0.p(homeWork, "it");
                HomeWorkFragment.this.v(homeWork);
            }
        });
        final ListView listView = (ListView)inflate.findViewById(com.untis.mobile.c.i.Iq);
        final f k = this.K;
        if (k != null) {
            listView.setAdapter((ListAdapter)k);
            return inflate;
        }
        k0.S("adapter");
        throw null;
    }
    
    public void onSaveInstanceState(@e final Bundle bundle) {
        k0.p(bundle, "outState");
        super.onSaveInstanceState(bundle);
        final Profile g = this.G;
        if (g == null) {
            k0.S("profile");
            throw null;
        }
        bundle.putString("spinnen", g.getUniqueId());
        final Period h = this.H;
        if (h != null) {
            bundle.putLong("krabben", h.getId());
            bundle.putBoolean("acht", this.J);
            return;
        }
        k0.S("period");
        throw null;
    }
    
    public final void w() {
        final k l = this.L;
        if (l == null) {
            k0.S("timeTableService");
            throw null;
        }
        final Period h = this.H;
        if (h == null) {
            k0.S("period");
            throw null;
        }
        Period i;
        if ((i = l.l(h.getId())) == null) {
            final Period h2 = this.H;
            if (h2 == null) {
                k0.S("period");
                throw null;
            }
            i = new Period(h2.getId(), 0L, null, null, null, null, null, null, 0, 0, 0, 0, null, null, null, false, null, 131070, null);
        }
        this.H = i;
        final com.untis.mobile.services.classbook.a m = this.M;
        if (m == null) {
            k0.S("classBookService");
            throw null;
        }
        Classbook j;
        if ((j = m.S(i.getId())) == null) {
            j = this.I;
            if (j == null) {
                k0.S("classbook");
                throw null;
            }
        }
        this.I = j;
        final f k = this.K;
        if (k != null) {
            final Set<HomeWork> homeWorks = j.getHomeWorks();
            final ArrayList<HomeWork> list = new ArrayList<HomeWork>();
            for (final HomeWork next : homeWorks) {
                if (this.u(next)) {
                    list.add(next);
                }
            }
            k.p(list);
            return;
        }
        k0.S("adapter");
        throw null;
    }
    
    public final void x(@e final HomeWork homeWork, final boolean b) {
        k0.p(homeWork, "homeWork");
        final Period h = this.H;
        if (h == null) {
            k0.S("period");
            throw null;
        }
        if (h.getId() == homeWork.getPeriodId()) {
            final Classbook i = this.I;
            if (b) {
                if (i == null) {
                    k0.S("classbook");
                    throw null;
                }
                i.getHomeWorks().remove(homeWork);
            }
            else {
                if (i == null) {
                    k0.S("classbook");
                    throw null;
                }
                i.getHomeWorks().add(homeWork);
            }
        }
        if (homeWork.getPeriodId() == 0L || b) {
            final Classbook j = this.I;
            if (j == null) {
                k0.S("classbook");
                throw null;
            }
            final Iterator<HomeWork> iterator = j.getHomeWorks().iterator();
            while (iterator.hasNext()) {
                if (iterator.next().getId() == homeWork.getId()) {
                    iterator.remove();
                }
            }
        }
        kotlinx.coroutines.h.h((g)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            int G;
            final /* synthetic */ HomeWorkFragment H;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ HomeWorkFragment H = this.H;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((HomeWorkFragment$c)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
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
                    final a r = HomeWorkFragment.r(this.H);
                    if (r == null) {
                        k0.S("classBookService");
                        throw null;
                    }
                    final Classbook s = HomeWorkFragment.s(this.H);
                    if (s == null) {
                        k0.S("classbook");
                        throw null;
                    }
                    this.G = 1;
                    if (r.a0(s, this) == h) {
                        return h;
                    }
                }
                return j2.a;
            }
        }, 1, (Object)null);
        final f k = this.K;
        if (k == null) {
            k0.S("adapter");
            throw null;
        }
        final Classbook l = this.I;
        if (l != null) {
            final Set<HomeWork> homeWorks = l.getHomeWorks();
            final ArrayList<HomeWork> list = new ArrayList<HomeWork>();
            for (final HomeWork next : homeWorks) {
                if (this.u(next)) {
                    list.add(next);
                }
            }
            k.p(list);
            return;
        }
        k0.S("classbook");
        throw null;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u0010" }, d2 = { "com/untis/mobile/ui/activities/classbook/homeworks/HomeWorkFragment$a", "", "", "profileId", "", "periodId", "", "onlyUncompleted", "Lcom/untis/mobile/ui/activities/classbook/homeworks/HomeWorkFragment;", "a", "BUNDLE_ONLY_UNCOMPLETED", "Ljava/lang/String;", "BUNDLE_PERIOD_ID", "BUNDLE_PROFILE_ID", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final HomeWorkFragment a(@e final String s, final long n, final boolean b) {
            k0.p(s, "profileId");
            final HomeWorkFragment homeWorkFragment = new HomeWorkFragment();
            final Bundle arguments = new Bundle();
            arguments.putString("spinnen", s);
            arguments.putLong("krabben", n);
            arguments.putBoolean("acht", b);
            homeWorkFragment.setArguments(arguments);
            return homeWorkFragment;
        }
    }
}
