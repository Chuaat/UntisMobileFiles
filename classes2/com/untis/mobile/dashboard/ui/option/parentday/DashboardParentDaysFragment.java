// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.ui.option.parentday;

import android.widget.ImageView;
import android.widget.TextView;
import android.content.Context;
import androidx.lifecycle.l0;
import kotlin.j2;
import n6.l;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatImageView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.os.Bundle;
import kotlin.jvm.internal.k0;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import androidx.recyclerview.widget.RecyclerView$h;
import kotlin.collections.v;
import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView;
import com.untis.mobile.dashboard.persistence.model.parentday.DashboardParentDay;
import java.util.List;
import com.untis.mobile.utils.extension.h;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.View;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import androidx.fragment.app.d;
import kotlin.p1;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.m0;
import androidx.lifecycle.d1;
import n6.a;
import org.jetbrains.annotations.e;
import kotlin.b0;
import kotlin.Metadata;
import com.untis.mobile.ui.fragments.common.UmFragment;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0007H\u0002J\u0012\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J&\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016R\u001d\u0010\u001d\u001a\u00020\u00188B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006 " }, d2 = { "Lcom/untis/mobile/dashboard/ui/option/parentday/DashboardParentDaysFragment;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "Landroid/view/View;", "view", "Lkotlin/j2;", "v", "", "Lcom/untis/mobile/dashboard/persistence/model/parentday/DashboardParentDay;", "parentDays", "B", "", "show", "z", "A", "parentDay", "y", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "Lcom/untis/mobile/dashboard/ui/option/parentday/c;", "G", "Lkotlin/b0;", "u", "()Lcom/untis/mobile/dashboard/ui/option/parentday/c;", "model", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class DashboardParentDaysFragment extends UmFragment
{
    @e
    private final b0 G;
    
    public DashboardParentDaysFragment() {
        this.G = d0.c((a<?>)new a<c>() {
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
    
    private final void A(final View view, final boolean b) {
        ((ViewGroup)view.findViewById(com.untis.mobile.c.i.XD)).setVisibility(h.U(b, 0, 1, null));
    }
    
    private final void B(final View view, final List<DashboardParentDay> list) {
        final RecyclerView$h adapter = ((RecyclerView)view.findViewById(com.untis.mobile.c.i.rq)).getAdapter();
        Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.untis.mobile.dashboard.ui.option.parentday.DashboardParentDayAdapter");
        final b b = (b)adapter;
        List<DashboardParentDay> e;
        if (list == null) {
            e = v.E();
        }
        else {
            e = list;
        }
        b.p(e);
        final boolean b2 = true;
        this.z(view, list != null && list.isEmpty());
        this.A(view, list == null && b2);
    }
    
    private final c u() {
        return this.G.getValue();
    }
    
    private final void v(final View view) {
        ((FloatingActionButton)view.findViewById(com.untis.mobile.c.i.SD)).setImageDrawable(androidx.core.content.d.i(this.requireContext(), 2131231137));
        ((TextView)view.findViewById(com.untis.mobile.c.i.VD)).setText((CharSequence)this.getString(2131886491));
        ((TextView)view.findViewById(com.untis.mobile.c.i.UD)).setText((CharSequence)this.getString(2131886490));
    }
    
    private static final void w(final DashboardParentDaysFragment dashboardParentDaysFragment, final View view) {
        k0.p(dashboardParentDaysFragment, "this$0");
        dashboardParentDaysFragment.onBackPressed();
    }
    
    private static final void x(final DashboardParentDaysFragment dashboardParentDaysFragment, final View view, final List list) {
        k0.p(dashboardParentDaysFragment, "this$0");
        k0.p(view, "$view");
        dashboardParentDaysFragment.B(view, list);
    }
    
    private final void y(final DashboardParentDay dashboardParentDay) {
        androidx.navigation.fragment.c.a((Fragment)this).D(f.a.a(dashboardParentDay.getId()));
    }
    
    private final void z(final View view, final boolean b) {
        ((ViewGroup)view.findViewById(com.untis.mobile.c.i.TD)).setVisibility(h.U(b, 0, 1, null));
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    public void onCreate(@org.jetbrains.annotations.f final Bundle bundle) {
        super.onCreate(bundle);
        this.u().k();
        this.u().j(this.getErrorHandler());
    }
    
    @org.jetbrains.annotations.f
    public View onCreateView(@e final LayoutInflater layoutInflater, @org.jetbrains.annotations.f final ViewGroup viewGroup, @org.jetbrains.annotations.f final Bundle bundle) {
        k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131493102, viewGroup, false);
        if (inflate == null) {
            return null;
        }
        ((ImageView)inflate.findViewById(com.untis.mobile.c.i.tq)).setOnClickListener((View$OnClickListener)new com.untis.mobile.dashboard.ui.option.parentday.d(this));
        this.A(inflate, true);
        this.v(inflate);
        this.z(inflate, false);
        final RecyclerView recyclerView = (RecyclerView)inflate.findViewById(com.untis.mobile.c.i.rq);
        final Context requireContext = this.requireContext();
        k0.o(requireContext, "requireContext()");
        recyclerView.setAdapter((RecyclerView$h)new b(requireContext, v.E(), this.u().i(), new l<DashboardParentDay, j2>() {
            public final void a(@e final DashboardParentDay dashboardParentDay) {
                k0.p(dashboardParentDay, "it");
                DashboardParentDaysFragment.this.y(dashboardParentDay);
            }
        }));
        this.u().g().j(this.getViewLifecycleOwner(), (l0)new com.untis.mobile.dashboard.ui.option.parentday.e(this, inflate));
        return inflate;
    }
}
