// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.ui.option.classlead;

import android.widget.ImageView;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$h;
import kotlin.j2;
import n6.l;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View$OnClickListener;
import com.untis.mobile.c;
import androidx.appcompat.widget.AppCompatImageView;
import android.os.Bundle;
import org.jetbrains.annotations.f;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import kotlin.jvm.internal.k0;
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

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J&\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016R\u001d\u0010\u0013\u001a\u00020\u000e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016" }, d2 = { "Lcom/untis/mobile/dashboard/ui/option/classlead/DashboardClassLeadFilterFragment;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "Lcom/untis/mobile/ui/adapters/infocenter/a;", "dateRange", "Lkotlin/j2;", "v", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "Lcom/untis/mobile/dashboard/ui/option/classlead/b;", "G", "Lkotlin/b0;", "t", "()Lcom/untis/mobile/dashboard/ui/option/classlead/b;", "model", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class DashboardClassLeadFilterFragment extends UmFragment
{
    @e
    private final b0 G;
    
    public DashboardClassLeadFilterFragment() {
        this.G = d0.c((a<?>)new a<b>() {
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
            public final b invoke() {
                return (b)org.koin.androidx.viewmodel.ext.android.a.a(this.G, k1.d(b.class), null, this.I, null);
            }
        });
    }
    
    private final b t() {
        return this.G.getValue();
    }
    
    private static final void u(final DashboardClassLeadFilterFragment dashboardClassLeadFilterFragment, final View view) {
        k0.p(dashboardClassLeadFilterFragment, "this$0");
        dashboardClassLeadFilterFragment.onBackPressed();
    }
    
    private final void v(final com.untis.mobile.ui.adapters.infocenter.a a) {
        this.t().v(this.getErrorHandler(), a);
        this.onBackPressed();
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @f
    public View onCreateView(@e final LayoutInflater layoutInflater, @f final ViewGroup viewGroup, @f final Bundle bundle) {
        k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131493095, viewGroup, false);
        if (inflate == null) {
            return null;
        }
        ((ImageView)inflate.findViewById(c.i.Kp)).setOnClickListener((View$OnClickListener)new com.untis.mobile.dashboard.ui.option.classlead.a(this));
        final RecyclerView recyclerView = (RecyclerView)inflate.findViewById(c.i.Ip);
        final Context requireContext = this.requireContext();
        k0.o(requireContext, "requireContext()");
        recyclerView.setAdapter((RecyclerView$h)new com.untis.mobile.dashboard.ui.option.absence.student.filter.b(requireContext, this.t().n(), new l<com.untis.mobile.ui.adapters.infocenter.a, j2>() {
            public final void a(@e final com.untis.mobile.ui.adapters.infocenter.a a) {
                k0.p(a, "it");
                DashboardClassLeadFilterFragment.this.v(a);
            }
        }));
        return inflate;
    }
}
