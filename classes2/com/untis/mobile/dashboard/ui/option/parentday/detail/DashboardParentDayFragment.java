// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.ui.option.parentday.detail;

import android.widget.HorizontalScrollView;
import android.widget.TextView;
import android.widget.ImageView;
import java.util.Iterator;
import android.content.Context;
import java.util.List;
import com.untis.mobile.dashboard.persistence.model.parentday.DashboardParentDay;
import com.google.android.material.tabs.TabLayout$f;
import kotlin.j2;
import com.google.android.material.tabs.TabLayout$i;
import n6.l;
import com.untis.mobile.utils.extension.h;
import com.google.android.material.tabs.TabLayout;
import androidx.appcompat.widget.AppCompatTextView;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatImageView;
import com.untis.mobile.dashboard.persistence.model.parentday.DashboardParentDayKt;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import org.jetbrains.annotations.f;
import androidx.recyclerview.widget.RecyclerView$h;
import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.k0;
import org.joda.time.t;
import android.view.View;
import kotlin.d0;
import com.untis.mobile.dashboard.ui.option.parentday.c;
import androidx.fragment.app.d;
import kotlin.p1;
import androidx.lifecycle.d1;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.m0;
import android.os.Bundle;
import n6.a;
import kotlin.jvm.internal.k1;
import kotlin.b0;
import org.jetbrains.annotations.e;
import androidx.navigation.m;
import kotlin.Metadata;
import com.untis.mobile.ui.fragments.common.UmFragment;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J&\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016R\u001d\u0010\u0015\u001a\u00020\u00108B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u001b\u001a\u00020\u00168B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e" }, d2 = { "Lcom/untis/mobile/dashboard/ui/option/parentday/detail/DashboardParentDayFragment;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "Landroid/view/View;", "view", "Lorg/joda/time/t;", "date", "Lkotlin/j2;", "w", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "Lcom/untis/mobile/dashboard/ui/option/parentday/c;", "H", "Lkotlin/b0;", "u", "()Lcom/untis/mobile/dashboard/ui/option/parentday/c;", "model", "Lcom/untis/mobile/dashboard/ui/option/parentday/detail/e;", "G", "Landroidx/navigation/m;", "t", "()Lcom/untis/mobile/dashboard/ui/option/parentday/detail/e;", "args", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class DashboardParentDayFragment extends UmFragment
{
    @e
    private final m G;
    @e
    private final b0 H;
    
    public DashboardParentDayFragment() {
        this.G = new m(k1.d(com.untis.mobile.dashboard.ui.option.parentday.detail.e.class), (a)new a<Bundle>() {
            final /* synthetic */ Fragment G;
            
            @e
            @Override
            public final Bundle invoke() {
                final Bundle arguments = this.G.getArguments();
                if (arguments != null) {
                    return arguments;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Fragment ");
                sb.append(this.G);
                sb.append(" has null arguments");
                throw new IllegalStateException(sb.toString());
            }
        });
        this.H = d0.c((a<?>)new a<c>() {
            final /* synthetic */ Fragment G;
            final /* synthetic */ a I = new a<d1>(this) {
                final /* synthetic */ Fragment G;
                
                @e
                @Override
                public final d1 invoke() {
                    final d activity = this.G.getActivity();
                    if (activity != null) {
                        return (d1)activity;
                    }
                    throw new p1("null cannot be cast to non-null type androidx.lifecycle.ViewModelStoreOwner");
                }
            };
            
            @e
            @Override
            public final c invoke() {
                return (c)org.koin.androidx.viewmodel.ext.android.a.a(this.G, k1.d(c.class), null, this.I, null);
            }
        });
    }
    
    private final com.untis.mobile.dashboard.ui.option.parentday.detail.e t() {
        return ((b0<com.untis.mobile.dashboard.ui.option.parentday.detail.e>)this.G).getValue();
    }
    
    private final c u() {
        return this.H.getValue();
    }
    
    private static final void v(final DashboardParentDayFragment dashboardParentDayFragment, final View view) {
        k0.p(dashboardParentDayFragment, "this$0");
        dashboardParentDayFragment.onBackPressed();
    }
    
    private final void w(final View view, final t t) {
        final RecyclerView$h adapter = ((RecyclerView)view.findViewById(com.untis.mobile.c.i.lq)).getAdapter();
        Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.untis.mobile.dashboard.ui.option.parentday.detail.DashboardParentDayAppointmentBlockAdapter");
        ((b)adapter).h(t);
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    public void onCreate(@f final Bundle bundle) {
        super.onCreate(bundle);
        this.u().k();
        this.u().j(this.getErrorHandler());
    }
    
    @f
    public View onCreateView(@e final LayoutInflater layoutInflater, @f final ViewGroup viewGroup, @f final Bundle bundle) {
        k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131493101, viewGroup, false);
        if (inflate == null) {
            return null;
        }
        final DashboardParentDay h = this.u().h(this.t().d());
        final List<t> localDates = DashboardParentDayKt.getLocalDates(h);
        ((ImageView)inflate.findViewById(com.untis.mobile.c.i.nq)).setOnClickListener((View$OnClickListener)new com.untis.mobile.dashboard.ui.option.parentday.detail.d(this));
        ((TextView)inflate.findViewById(com.untis.mobile.c.i.pq)).setText((CharSequence)h.getName());
        ((TextView)inflate.findViewById(com.untis.mobile.c.i.oq)).setText((CharSequence)com.untis.mobile.utils.d0.n(DashboardParentDayKt.interval(h)));
        final RecyclerView recyclerView = (RecyclerView)inflate.findViewById(com.untis.mobile.c.i.lq);
        final Context requireContext = this.requireContext();
        k0.o(requireContext, "requireContext()");
        recyclerView.setAdapter((RecyclerView$h)new b(requireContext, h, localDates.get(0), this.u().f()));
        final TabLayout tabLayout = (TabLayout)inflate.findViewById(com.untis.mobile.c.i.qq);
        ((HorizontalScrollView)tabLayout).setVisibility(com.untis.mobile.utils.extension.h.U(localDates.size() > 1, 0, 1, null));
        for (final t t : localDates) {
            tabLayout.e(tabLayout.D().D((CharSequence)com.untis.mobile.utils.d0.m(t)).B((Object)t));
        }
        tabLayout.d((TabLayout$f)new com.untis.mobile.utils.m0(new l<TabLayout$i, j2>() {
            final /* synthetic */ DashboardParentDayFragment G;
            
            public final void a(@e final TabLayout$i tabLayout$i) {
                k0.p(tabLayout$i, "tab");
                final DashboardParentDayFragment g = this.G;
                final View h = inflate;
                final Object m = tabLayout$i.m();
                Objects.requireNonNull(m, "null cannot be cast to non-null type org.joda.time.LocalDate");
                g.w(h, (org.joda.time.t)m);
            }
        }));
        return inflate;
    }
}
