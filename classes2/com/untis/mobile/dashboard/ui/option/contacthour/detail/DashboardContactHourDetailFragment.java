// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.ui.option.contacthour.detail;

import android.widget.ImageView;
import androidx.activity.ComponentActivity;
import android.widget.TextView;
import android.app.Dialog;
import android.content.Context;
import kotlin.jvm.internal.w;
import n6.l;
import kotlin.jvm.internal.g0;
import kotlin.j2;
import n6.p;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatImageView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import org.jetbrains.annotations.f;
import androidx.recyclerview.widget.RecyclerView$h;
import org.joda.time.t;
import java.util.Iterator;
import androidx.recyclerview.widget.RecyclerView;
import com.untis.mobile.utils.extension.h;
import kotlin.text.s;
import org.joda.time.l0;
import org.joda.time.r;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.untis.mobile.c;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import androidx.appcompat.app.d$a;
import com.untis.mobile.dashboard.persistence.model.contacthour.DashboardContactHour;
import kotlin.jvm.internal.k0;
import java.util.List;
import android.view.View;
import kotlin.d0;
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

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J \u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000bH\u0002J\u0012\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J&\u0010\u0015\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016R\u001d\u0010\u001b\u001a\u00020\u00168B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010!\u001a\u00020\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006$" }, d2 = { "Lcom/untis/mobile/dashboard/ui/option/contacthour/detail/DashboardContactHourDetailFragment;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "Lcom/untis/mobile/dashboard/persistence/model/contacthour/DashboardContactHour;", "contactHour", "Lkotlin/j2;", "C", "", "position", "B", "Landroid/view/View;", "view", "", "contactHours", "F", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "Lcom/untis/mobile/dashboard/ui/option/contacthour/detail/e;", "G", "Landroidx/navigation/m;", "x", "()Lcom/untis/mobile/dashboard/ui/option/contacthour/detail/e;", "args", "Lcom/untis/mobile/dashboard/ui/option/contacthour/e;", "H", "Lkotlin/b0;", "y", "()Lcom/untis/mobile/dashboard/ui/option/contacthour/e;", "model", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class DashboardContactHourDetailFragment extends UmFragment
{
    @e
    private final m G;
    @e
    private final b0 H;
    
    public DashboardContactHourDetailFragment() {
        this.G = new m(k1.d(com.untis.mobile.dashboard.ui.option.contacthour.detail.e.class), (a)new a<Bundle>() {
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
        this.H = d0.c((a<?>)new a<com.untis.mobile.dashboard.ui.option.contacthour.e>() {
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
            public final com.untis.mobile.dashboard.ui.option.contacthour.e invoke() {
                return (com.untis.mobile.dashboard.ui.option.contacthour.e)org.koin.androidx.viewmodel.ext.android.a.a(this.G, k1.d(com.untis.mobile.dashboard.ui.option.contacthour.e.class), null, this.I, null);
            }
        });
    }
    
    private static final void A(final DashboardContactHourDetailFragment dashboardContactHourDetailFragment, final View view, final List list) {
        k0.p(dashboardContactHourDetailFragment, "this$0");
        k0.p(view, "$view");
        dashboardContactHourDetailFragment.F(view, list);
    }
    
    private final void B(final DashboardContactHour dashboardContactHour, final int n) {
        this.y().B(this.getErrorHandler(), dashboardContactHour, n);
    }
    
    private final void C(final DashboardContactHour dashboardContactHour) {
        ((Dialog)new d$a(this.requireContext()).m(2131886245).r(2131886649, (DialogInterface$OnClickListener)b.G).B(2131886792, (DialogInterface$OnClickListener)new com.untis.mobile.dashboard.ui.option.contacthour.detail.a(this, dashboardContactHour)).a()).show();
    }
    
    private static final void D(final DialogInterface dialogInterface, final int n) {
    }
    
    private static final void E(final DashboardContactHourDetailFragment dashboardContactHourDetailFragment, final DashboardContactHour dashboardContactHour, final DialogInterface dialogInterface, final int n) {
        k0.p(dashboardContactHourDetailFragment, "this$0");
        k0.p(dashboardContactHour, "$contactHour");
        dashboardContactHourDetailFragment.y().i(dashboardContactHourDetailFragment.getErrorHandler(), dashboardContactHour);
    }
    
    private final void F(final View view, final List<DashboardContactHour> list) {
        final com.untis.mobile.dashboard.ui.option.contacthour.detail.h h = null;
        DashboardContactHour dashboardContactHour = null;
        Label_0079: {
            if (list != null) {
                while (true) {
                    for (final DashboardContactHour next : list) {
                        if (next.getWuId() == this.x().d()) {
                            dashboardContactHour = next;
                            break Label_0079;
                        }
                    }
                    DashboardContactHour next = null;
                    continue;
                }
            }
            dashboardContactHour = null;
        }
        if (dashboardContactHour == null) {
            return;
        }
        ((TextView)view.findViewById(c.i.qp)).setText((CharSequence)dashboardContactHour.getDisplayTeacher());
        final org.joda.time.c start = dashboardContactHour.getStart();
        final org.joda.time.c end = dashboardContactHour.getEnd();
        if (start != null && end != null) {
            final AppCompatTextView appCompatTextView = (AppCompatTextView)view.findViewById(c.i.kp);
            final t h2 = start.h1();
            k0.o(h2, "start.toLocalDate()");
            ((TextView)appCompatTextView).setText((CharSequence)com.untis.mobile.utils.d0.m(h2));
            ((ViewGroup)view.findViewById(c.i.jp)).setVisibility(0);
            ((TextView)view.findViewById(c.i.sp)).setText((CharSequence)com.untis.mobile.utils.d0.s(new r((l0)start, (l0)end)));
            ((ViewGroup)view.findViewById(c.i.rp)).setVisibility(0);
        }
        else {
            ((ViewGroup)view.findViewById(c.i.jp)).setVisibility(8);
            ((ViewGroup)view.findViewById(c.i.rp)).setVisibility(8);
        }
        ((ViewGroup)view.findViewById(c.i.np)).setVisibility(com.untis.mobile.utils.extension.h.U(s.U1((CharSequence)dashboardContactHour.getDisplayRooms()) ^ true, 0, 1, null));
        ((TextView)view.findViewById(c.i.op)).setText((CharSequence)dashboardContactHour.getDisplayRooms());
        final RecyclerView$h adapter = ((RecyclerView)view.findViewById(c.i.pp)).getAdapter();
        com.untis.mobile.dashboard.ui.option.contacthour.detail.h h3 = h;
        if (adapter instanceof com.untis.mobile.dashboard.ui.option.contacthour.detail.h) {
            h3 = (com.untis.mobile.dashboard.ui.option.contacthour.detail.h)adapter;
        }
        if (h3 != null) {
            h3.n(dashboardContactHour);
        }
    }
    
    private final com.untis.mobile.dashboard.ui.option.contacthour.detail.e x() {
        return ((b0<com.untis.mobile.dashboard.ui.option.contacthour.detail.e>)this.G).getValue();
    }
    
    private final com.untis.mobile.dashboard.ui.option.contacthour.e y() {
        return this.H.getValue();
    }
    
    private static final void z(final DashboardContactHourDetailFragment dashboardContactHourDetailFragment, final View view) {
        k0.p(dashboardContactHourDetailFragment, "this$0");
        final d activity = dashboardContactHourDetailFragment.getActivity();
        if (activity != null) {
            ((ComponentActivity)activity).onBackPressed();
        }
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    public void onCreate(@f final Bundle bundle) {
        super.onCreate(bundle);
        this.y().j(this.getErrorHandler(), this.x().d());
    }
    
    @f
    public View onCreateView(@e final LayoutInflater layoutInflater, @f final ViewGroup viewGroup, @f final Bundle bundle) {
        k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131493090, viewGroup, false);
        if (inflate == null) {
            return null;
        }
        ((ImageView)inflate.findViewById(c.i.mp)).setOnClickListener((View$OnClickListener)new com.untis.mobile.dashboard.ui.option.contacthour.detail.c(this));
        final RecyclerView recyclerView = (RecyclerView)inflate.findViewById(c.i.pp);
        final Context requireContext = this.requireContext();
        k0.o(requireContext, "requireContext()");
        recyclerView.setAdapter((RecyclerView$h)new com.untis.mobile.dashboard.ui.option.contacthour.detail.h(requireContext, null, new p<DashboardContactHour, Integer, j2>(this), new l<DashboardContactHour, j2>(this), 2, null));
        this.y().r().j(this.getViewLifecycleOwner(), (androidx.lifecycle.l0)new com.untis.mobile.dashboard.ui.option.contacthour.detail.d(this, inflate));
        return inflate;
    }
}
