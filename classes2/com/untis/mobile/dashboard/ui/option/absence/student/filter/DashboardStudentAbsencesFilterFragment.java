// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.ui.option.absence.student.filter;

import android.widget.ImageView;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$h;
import kotlin.j2;
import n6.l;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.SwitchCompat;
import android.os.Bundle;
import org.jetbrains.annotations.f;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import kotlin.jvm.internal.k0;
import android.widget.CompoundButton;
import android.view.View;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import com.untis.mobile.dashboard.ui.option.absence.student.c;
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

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J&\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016R\u001d\u0010\u0016\u001a\u00020\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019" }, d2 = { "Lcom/untis/mobile/dashboard/ui/option/absence/student/filter/DashboardStudentAbsencesFilterFragment;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "", "show", "Lkotlin/j2;", "y", "Lcom/untis/mobile/ui/adapters/infocenter/a;", "dateRange", "x", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "Lcom/untis/mobile/dashboard/ui/option/absence/student/c;", "G", "Lkotlin/b0;", "u", "()Lcom/untis/mobile/dashboard/ui/option/absence/student/c;", "model", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class DashboardStudentAbsencesFilterFragment extends UmFragment
{
    @e
    private final b0 G;
    
    public DashboardStudentAbsencesFilterFragment() {
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
    
    private final c u() {
        return this.G.getValue();
    }
    
    private static final void v(final DashboardStudentAbsencesFilterFragment dashboardStudentAbsencesFilterFragment, final View view) {
        k0.p(dashboardStudentAbsencesFilterFragment, "this$0");
        dashboardStudentAbsencesFilterFragment.onBackPressed();
    }
    
    private static final void w(final DashboardStudentAbsencesFilterFragment dashboardStudentAbsencesFilterFragment, final CompoundButton compoundButton, final boolean b) {
        k0.p(dashboardStudentAbsencesFilterFragment, "this$0");
        dashboardStudentAbsencesFilterFragment.y(b);
    }
    
    private final void x(final com.untis.mobile.ui.adapters.infocenter.a a) {
        this.u().N(this.getErrorHandler(), a);
    }
    
    private final void y(final boolean b) {
        this.u().L(b);
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @f
    public View onCreateView(@e final LayoutInflater layoutInflater, @f final ViewGroup viewGroup, @f final Bundle bundle) {
        k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131493098, viewGroup, false);
        if (inflate == null) {
            return null;
        }
        final int gq = com.untis.mobile.c.i.gq;
        ((SwitchCompat)inflate.findViewById(gq)).setChecked(this.u().x());
        ((ImageView)inflate.findViewById(com.untis.mobile.c.i.iq)).setOnClickListener((View$OnClickListener)new com.untis.mobile.dashboard.ui.option.absence.student.filter.c(this));
        ((CompoundButton)inflate.findViewById(gq)).setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)new com.untis.mobile.dashboard.ui.option.absence.student.filter.d(this));
        final RecyclerView recyclerView = (RecyclerView)inflate.findViewById(com.untis.mobile.c.i.fq);
        final Context requireContext = this.requireContext();
        k0.o(requireContext, "requireContext()");
        recyclerView.setAdapter((RecyclerView$h)new b(requireContext, this.u().z(), new l<com.untis.mobile.ui.adapters.infocenter.a, j2>() {
            public final void a(@e final com.untis.mobile.ui.adapters.infocenter.a a) {
                k0.p(a, "it");
                DashboardStudentAbsencesFilterFragment.this.x(a);
            }
        }));
        return inflate;
    }
}
