// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.classbook;

import android.widget.TextView;
import android.app.Activity;
import org.joda.time.base.g;
import java.util.HashSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import org.jetbrains.annotations.f;
import android.os.Bundle;
import java.util.Set;
import java.util.List;
import com.untis.mobile.persistence.models.timetable.period.PeriodElement;
import androidx.fragment.app.d;
import android.widget.RelativeLayout;
import com.untis.mobile.ui.activities.common.b;
import com.untis.mobile.ui.activities.help.HelpActivity;
import com.untis.mobile.utils.extension.h;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView$p;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$h;
import androidx.recyclerview.widget.RecyclerView;
import com.untis.mobile.c;
import kotlin.jvm.internal.k0;
import java.util.Objects;
import android.util.Log;
import com.untis.mobile.utils.v;
import android.view.View;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import android.content.ComponentCallbacks;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.w;
import com.untis.mobile.services.timetable.placeholder.k;
import com.untis.mobile.services.classbook.a;
import com.untis.mobile.persistence.models.timetable.period.Classbook;
import com.untis.mobile.persistence.models.timetable.period.Period;
import com.untis.mobile.persistence.models.profile.Profile;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.fragments.common.UmFragment;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 =2\u00020\u0001:\u0001>B\u0007¢\u0006\u0004\b;\u0010<J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J&\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\bH\u0016J\u001e\u0010\u001c\u001a\u00020\u00042\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00190\u0018j\b\u0012\u0004\u0012\u00020\u0019`\u001aR\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103R\u001d\u0010:\u001a\u0002058B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109¨\u0006?" }, d2 = { "Lcom/untis/mobile/ui/activities/classbook/ClassbookPageFragment;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "Landroid/view/View;", "view", "Lkotlin/j2;", "r", "", "t", "Landroid/os/Bundle;", "save", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "savedInstanceState", "onCreateView", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "period", "Lcom/untis/mobile/persistence/models/timetable/period/Classbook;", "classbook", "u", "outState", "onSaveInstanceState", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "selectedStudentIds", "w", "I", "Lcom/untis/mobile/persistence/models/timetable/period/Classbook;", "Lcom/untis/mobile/ui/activities/classbook/b0;", "K", "Lcom/untis/mobile/ui/activities/classbook/b0;", "adapter", "Lcom/untis/mobile/ui/activities/classbook/i;", "J", "Lcom/untis/mobile/ui/activities/classbook/i;", "pageType", "Lcom/untis/mobile/persistence/models/profile/Profile;", "G", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "H", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "Lcom/untis/mobile/services/timetable/placeholder/k;", "M", "Lcom/untis/mobile/services/timetable/placeholder/k;", "timetableService", "Lcom/untis/mobile/services/classbook/a;", "L", "Lcom/untis/mobile/services/classbook/a;", "classbookService", "Lcom/untis/mobile/services/profile/legacy/a;", "N", "Lkotlin/b0;", "s", "()Lcom/untis/mobile/services/profile/legacy/a;", "profileService", "<init>", "()V", "O", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class ClassbookPageFragment extends UmFragment
{
    @e
    public static final a O;
    @e
    private static final String P = "thalia";
    @e
    private static final String Q = "kirke";
    @e
    private static final String R = "aoide";
    private Profile G;
    private Period H;
    private Classbook I;
    private i J;
    private b0 K;
    private com.untis.mobile.services.classbook.a L;
    private k M;
    @e
    private final kotlin.b0 N;
    
    static {
        O = new a(null);
    }
    
    public ClassbookPageFragment() {
        this.N = d0.c((n6.a<?>)new n6.a<com.untis.mobile.services.profile.legacy.a>() {
            final /* synthetic */ ComponentCallbacks G;
            
            @e
            @Override
            public final com.untis.mobile.services.profile.legacy.a invoke() {
                return (com.untis.mobile.services.profile.legacy.a)org.koin.android.ext.android.a.e(this.G).y().t(k1.d(com.untis.mobile.services.profile.legacy.a.class), null, null);
            }
        });
    }
    
    private final void r(final View view) {
        final v a = v.a;
        final long n = ((g)a.e()).n();
        Log.i("untis_log", "kairo starting bind biew");
        final d activity = this.getActivity();
        Objects.requireNonNull(activity, "null cannot be cast to non-null type com.untis.mobile.ui.activities.classbook.ClassbookActivity");
        final ClassbookActivity classbookActivity = (ClassbookActivity)activity;
        final Profile g = this.G;
        if (g == null) {
            k0.S("profile");
            throw null;
        }
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
        final i j = this.J;
        if (j == null) {
            k0.S("pageType");
            throw null;
        }
        this.K = new b0(classbookActivity, g, h, i, j);
        final int on = c.i.On;
        final RecyclerView recyclerView = (RecyclerView)view.findViewById(on);
        final b0 k = this.K;
        if (k == null) {
            k0.S("adapter");
            throw null;
        }
        recyclerView.setAdapter((RecyclerView$h)k);
        ((RecyclerView)view.findViewById(on)).setLayoutManager((RecyclerView$p)new LinearLayoutManager(this.getContext()));
        final d activity2 = this.getActivity();
        Objects.requireNonNull(activity2, "null cannot be cast to non-null type com.untis.mobile.ui.activities.classbook.ClassbookActivity");
        final ClassbookActivity classbookActivity2 = (ClassbookActivity)activity2;
        final RecyclerView recyclerView2 = (RecyclerView)view.findViewById(on);
        k0.o(recyclerView2, "view.fragment_classbook_page_recyclerview");
        final b0 l = this.K;
        if (l == null) {
            k0.S("adapter");
            throw null;
        }
        final Period h2 = this.H;
        if (h2 == null) {
            k0.S("period");
            throw null;
        }
        new i0(classbookActivity2, recyclerView2, l, h2);
        final ConstraintLayout constraintLayout = (ConstraintLayout)view.findViewById(c.i.TD);
        final b0 m = this.K;
        if (m == null) {
            k0.S("adapter");
            throw null;
        }
        ((ViewGroup)constraintLayout).setVisibility(com.untis.mobile.utils.extension.h.U(m.X().isEmpty(), 0, 1, null));
        final i j2 = this.J;
        if (j2 == null) {
            k0.S("pageType");
            throw null;
        }
        if (j2 == com.untis.mobile.ui.activities.classbook.i.I) {
            final HelpActivity.a i2 = HelpActivity.I;
            final d activity3 = this.getActivity();
            Objects.requireNonNull(activity3, "null cannot be cast to non-null type com.untis.mobile.ui.activities.common.UmActivity");
            final b b = (b)activity3;
            final RelativeLayout relativeLayout = (RelativeLayout)((Activity)this.requireActivity()).findViewById(c.i.U3);
            k0.o(relativeLayout, "requireActivity().activity_classbook_root");
            i2.m(b, (View)relativeLayout, this.t());
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("kairo finish bind view for page with type :");
        final i j3 = this.J;
        if (j3 != null) {
            sb.append(j3);
            sb.append(" after ");
            sb.append(((g)a.e()).n() - n);
            sb.append("ms");
            Log.i("untis_log", sb.toString());
            return;
        }
        k0.S("pageType");
        throw null;
    }
    
    private final com.untis.mobile.services.profile.legacy.a s() {
        return this.N.getValue();
    }
    
    private final boolean t() {
        final Classbook i = this.I;
        if (i != null) {
            return i.getClassRoles().isEmpty() ^ true;
        }
        k0.S("classbook");
        throw null;
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    public void onCreate(@f Bundle arguments) {
        Log.i("untis_log", "kairo oncreate start");
        final v a = v.a;
        final long n = ((g)a.e()).n();
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
            string = arguments2.getString("thalia", "");
            if (string == null) {
                string = s;
            }
        }
        Profile g;
        if ((g = this.s().l(string)) == null) {
            g = this.s().n();
            if (g == null) {
                throw new IllegalStateException("no valid profile");
            }
        }
        this.G = g;
        this.L = g.getClassBookService();
        final Profile g2 = this.G;
        if (g2 == null) {
            k0.S("profile");
            throw null;
        }
        this.M = g2.getTimeTableService();
        Bundle arguments3;
        if (arguments == null) {
            arguments3 = this.getArguments();
        }
        else {
            arguments3 = arguments;
        }
        k0.m(arguments3);
        final long long1 = arguments3.getLong("kirke");
        final k m = this.M;
        if (m == null) {
            k0.S("timetableService");
            throw null;
        }
        Period l = m.l(long1);
        if (l == null) {
            l = new Period(long1, 0L, null, null, null, null, null, null, 0, 0, 0, 0, null, null, null, false, null, 131070, null);
        }
        this.H = l;
        final com.untis.mobile.services.classbook.a i = this.L;
        if (i != null) {
            Classbook s2;
            if ((s2 = i.S(long1)) == null) {
                s2 = new Classbook(long1, null, null, null, null, null, null, false, false, null, 1022, null);
            }
            this.I = s2;
            final i.a h = com.untis.mobile.ui.activities.classbook.i.H;
            if (arguments == null) {
                arguments = this.getArguments();
            }
            k0.m(arguments);
            this.J = h.a(arguments.getInt("aoide"));
            final StringBuilder sb = new StringBuilder();
            sb.append("kairo finish oncreate after ");
            sb.append(((g)a.e()).n() - n);
            sb.append("ms");
            Log.i("untis_log", sb.toString());
            return;
        }
        k0.S("classbookService");
        throw null;
    }
    
    @f
    public View onCreateView(@e final LayoutInflater layoutInflater, @f final ViewGroup viewGroup, @f final Bundle bundle) {
        k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131493080, viewGroup, false);
        if (inflate == null) {
            return null;
        }
        this.r(inflate);
        ((FloatingActionButton)inflate.findViewById(c.i.SD)).setImageDrawable(androidx.core.content.d.i(this.requireContext(), 2131231155));
        ((TextView)inflate.findViewById(c.i.VD)).setText(2131886746);
        ((TextView)inflate.findViewById(c.i.UD)).setText(2131886750);
        return inflate;
    }
    
    public void onSaveInstanceState(@e final Bundle bundle) {
        k0.p(bundle, "outState");
        super.onSaveInstanceState(bundle);
        final Profile g = this.G;
        if (g == null) {
            k0.S("profile");
            throw null;
        }
        bundle.putString("thalia", g.getUniqueId());
        final Period h = this.H;
        if (h == null) {
            k0.S("period");
            throw null;
        }
        bundle.putLong("kirke", h.getId());
        final i j = this.J;
        if (j != null) {
            bundle.putInt("aoide", j.d());
            return;
        }
        k0.S("pageType");
        throw null;
    }
    
    public final void u(@e final Period h, @e final Classbook i) {
        k0.p(h, "period");
        k0.p(i, "classbook");
        Log.i("untis_log", "kairo starting update adapter");
        final v a = v.a;
        final long n = ((g)a.e()).n();
        this.H = h;
        this.I = i;
        final b0 k = this.K;
        if (k == null) {
            k0.S("adapter");
            throw null;
        }
        k.a1(h, i);
        final View view = this.getView();
        if (view == null) {
            return;
        }
        final d activity = this.getActivity();
        Objects.requireNonNull(activity, "null cannot be cast to non-null type com.untis.mobile.ui.activities.classbook.ClassbookActivity");
        final ClassbookActivity classbookActivity = (ClassbookActivity)activity;
        final RecyclerView recyclerView = (RecyclerView)view.findViewById(c.i.On);
        k0.o(recyclerView, "view.fragment_classbook_page_recyclerview");
        final b0 j = this.K;
        if (j == null) {
            k0.S("adapter");
            throw null;
        }
        new i0(classbookActivity, recyclerView, j, h);
        final ConstraintLayout constraintLayout = (ConstraintLayout)view.findViewById(c.i.TD);
        final b0 l = this.K;
        if (l != null) {
            ((ViewGroup)constraintLayout).setVisibility(h.U(l.X().isEmpty(), 0, 1, null));
            final StringBuilder sb = new StringBuilder();
            sb.append("kairo finish update adapter after ");
            sb.append(((g)a.e()).n() - n);
            sb.append("ms");
            Log.i("untis_log", sb.toString());
            return;
        }
        k0.S("adapter");
        throw null;
    }
    
    public final void w(@e final HashSet<Long> set) {
        k0.p(set, "selectedStudentIds");
        final v a = v.a;
        final long n = ((g)a.e()).n();
        Log.i("untis_log", "kairo updateSelection starting");
        final b0 k = this.K;
        if (k != null) {
            k.d1(set);
            final StringBuilder sb = new StringBuilder();
            sb.append("kairo updateSelecton finishing after ");
            sb.append(((g)a.e()).n() - n);
            sb.append("ms");
            Log.i("untis_log", sb.toString());
            return;
        }
        k0.S("adapter");
        throw null;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u0010" }, d2 = { "com/untis/mobile/ui/activities/classbook/ClassbookPageFragment$a", "", "", "profileId", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "period", "Lcom/untis/mobile/ui/activities/classbook/i;", "pageType", "Lcom/untis/mobile/ui/activities/classbook/ClassbookPageFragment;", "a", "BUNDLE_PAGE_TYPE", "Ljava/lang/String;", "BUNDLE_PERIOD_ID", "BUNDLE_PROFILE_ID", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final ClassbookPageFragment a(@e final String s, @e final Period period, @e final i i) {
            k0.p(s, "profileId");
            k0.p(period, "period");
            k0.p(i, "pageType");
            final ClassbookPageFragment classbookPageFragment = new ClassbookPageFragment();
            final Bundle arguments = new Bundle();
            arguments.putString("thalia", s);
            arguments.putLong("kirke", period.getId());
            arguments.putInt("aoide", i.d());
            classbookPageFragment.setArguments(arguments);
            return classbookPageFragment;
        }
    }
}
