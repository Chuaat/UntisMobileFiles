// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.ui.option.absence.student;

import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Iterator;
import android.content.Context;
import com.google.android.material.tabs.TabLayout$f;
import com.google.android.material.tabs.TabLayout$i;
import com.google.android.material.tabs.TabLayout;
import androidx.lifecycle.l0;
import kotlin.jvm.internal.w;
import kotlin.j2;
import n6.l;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import org.jetbrains.annotations.f;
import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView$h;
import androidx.recyclerview.widget.RecyclerView;
import com.untis.mobile.persistence.models.profile.Child;
import com.untis.mobile.dashboard.persistence.model.studentabsence.DashboardStudentAbsence;
import java.util.List;
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

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010#J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J \u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0002J\b\u0010\f\u001a\u00020\u0006H\u0002J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0018\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0012\u0010\u0017\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J&\u0010\u001c\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016R\u001d\u0010!\u001a\u00020\u001d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006$" }, d2 = { "Lcom/untis/mobile/dashboard/ui/option/absence/student/DashboardStudentAbsencesFragment;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "Landroid/view/View;", "view", "Lcom/untis/mobile/persistence/models/profile/Child;", "child", "Lkotlin/j2;", "F", "", "Lcom/untis/mobile/dashboard/persistence/model/studentabsence/DashboardStudentAbsence;", "studentAbsences", "I", "E", "y", "", "absenceId", "D", "", "show", "H", "G", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "Lcom/untis/mobile/dashboard/ui/option/absence/student/c;", "Lkotlin/b0;", "x", "()Lcom/untis/mobile/dashboard/ui/option/absence/student/c;", "model", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class DashboardStudentAbsencesFragment extends UmFragment
{
    @e
    private final b0 G;
    
    public DashboardStudentAbsencesFragment() {
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
    
    private static final void A(final DashboardStudentAbsencesFragment dashboardStudentAbsencesFragment, final View view) {
        k0.p(dashboardStudentAbsencesFragment, "this$0");
        dashboardStudentAbsencesFragment.E();
    }
    
    private static final void B(final DashboardStudentAbsencesFragment dashboardStudentAbsencesFragment, final View view, final View view2) {
        k0.p(dashboardStudentAbsencesFragment, "this$0");
        k0.p(view, "$view");
        dashboardStudentAbsencesFragment.y(view);
    }
    
    private static final void C(final DashboardStudentAbsencesFragment dashboardStudentAbsencesFragment, final View view, final List list) {
        k0.p(dashboardStudentAbsencesFragment, "this$0");
        k0.p(view, "$view");
        dashboardStudentAbsencesFragment.I(view, list);
    }
    
    private final void D(final long n) {
        androidx.navigation.fragment.c.a((Fragment)this).D(h.b.b(h.a, 0L, n, 1, null));
    }
    
    private final void E() {
        androidx.navigation.fragment.c.a((Fragment)this).D(h.a.c());
    }
    
    private final void F(final View view, final Child child) {
        final RecyclerView$h adapter = ((RecyclerView)view.findViewById(com.untis.mobile.c.i.uq)).getAdapter();
        b b;
        if (adapter instanceof b) {
            b = (b)adapter;
        }
        else {
            b = null;
        }
        if (b != null) {
            b.q(child);
        }
    }
    
    private final void G(final View view, final boolean b) {
        ((ViewGroup)view.findViewById(com.untis.mobile.c.i.TD)).setVisibility(com.untis.mobile.utils.extension.h.U(b, 0, 1, null));
    }
    
    private final void H(final View view, final boolean b) {
        ((ViewGroup)view.findViewById(com.untis.mobile.c.i.XD)).setVisibility(com.untis.mobile.utils.extension.h.U(b, 0, 1, null));
    }
    
    private final void I(final View view, final List<DashboardStudentAbsence> list) {
        final RecyclerView$h adapter = ((RecyclerView)view.findViewById(com.untis.mobile.c.i.uq)).getAdapter();
        b b;
        if (adapter instanceof b) {
            b = (b)adapter;
        }
        else {
            b = null;
        }
        if (b != null) {
            b.r(list);
        }
        final boolean b2 = true;
        this.H(view, list == null);
        this.G(view, list != null && list.isEmpty() && b2);
    }
    
    private final c x() {
        return this.G.getValue();
    }
    
    private final void y(final View view) {
        final RecyclerView$h adapter = ((RecyclerView)view.findViewById(com.untis.mobile.c.i.uq)).getAdapter();
        b b;
        if (adapter instanceof b) {
            b = (b)adapter;
        }
        else {
            b = null;
        }
        if (b == null) {
            return;
        }
        androidx.navigation.fragment.c.a((Fragment)this).D(h.b.b(h.a, b.j(), 0L, 2, null));
    }
    
    private static final void z(final DashboardStudentAbsencesFragment dashboardStudentAbsencesFragment, final View view) {
        k0.p(dashboardStudentAbsencesFragment, "this$0");
        dashboardStudentAbsencesFragment.onBackPressed();
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    public void onCreate(@f final Bundle bundle) {
        super.onCreate(bundle);
        this.x().K();
        this.x().H(this.getErrorHandler());
    }
    
    @f
    public View onCreateView(@e final LayoutInflater layoutInflater, @f final ViewGroup viewGroup, @f final Bundle bundle) {
        k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131493103, viewGroup, false);
        if (inflate == null) {
            return null;
        }
        this.H(inflate, true);
        ((FloatingActionButton)inflate.findViewById(com.untis.mobile.c.i.SD)).setImageDrawable(androidx.core.content.d.i(this.requireContext(), 2131231126));
        ((TextView)inflate.findViewById(com.untis.mobile.c.i.VD)).setText(2131886736);
        ((TextView)inflate.findViewById(com.untis.mobile.c.i.UD)).setText(2131886735);
        ((ImageView)inflate.findViewById(com.untis.mobile.c.i.xq)).setOnClickListener((View$OnClickListener)new com.untis.mobile.dashboard.ui.option.absence.student.e(this));
        ((TextView)inflate.findViewById(com.untis.mobile.c.i.zq)).setText((CharSequence)this.x().B());
        ((ImageView)inflate.findViewById(com.untis.mobile.c.i.yq)).setOnClickListener((View$OnClickListener)new com.untis.mobile.dashboard.ui.option.absence.student.d(this));
        final int wq = com.untis.mobile.c.i.wq;
        ((ImageView)inflate.findViewById(wq)).setOnClickListener((View$OnClickListener)new com.untis.mobile.dashboard.ui.option.absence.student.f(this, inflate));
        ((ImageView)inflate.findViewById(wq)).setVisibility(com.untis.mobile.utils.extension.h.U(this.x().E(), 0, 1, null));
        final RecyclerView recyclerView = (RecyclerView)inflate.findViewById(com.untis.mobile.c.i.uq);
        final Context requireContext = this.requireContext();
        k0.o(requireContext, "requireContext()");
        recyclerView.setAdapter((RecyclerView$h)new b(requireContext, this.x().w(), null, this.x().C(), new l<DashboardStudentAbsence, j2>() {
            public final void a(@e final DashboardStudentAbsence dashboardStudentAbsence) {
                k0.p(dashboardStudentAbsence, "it");
                DashboardStudentAbsencesFragment.this.D(dashboardStudentAbsence.getId());
            }
        }, 4, null));
        this.x().v().j(this.getViewLifecycleOwner(), (l0)new g(this, inflate));
        final TabLayout tabLayout = (TabLayout)inflate.findViewById(com.untis.mobile.c.i.Aq);
        final List<Child> t = this.x().t();
        if (t.size() <= 2) {
            ((HorizontalScrollView)tabLayout).setVisibility(8);
        }
        else {
            for (final Child child : t) {
                final TabLayout$i d = tabLayout.D();
                String displayableTitle;
                if (child == null) {
                    displayableTitle = null;
                }
                else {
                    displayableTitle = child.displayableTitle();
                }
                String string = displayableTitle;
                if (displayableTitle == null) {
                    string = this.getString(2131886670);
                    k0.o(string, "getString(R.string.shared_all_text)");
                }
                tabLayout.e(d.D((CharSequence)string).B((Object)child));
            }
            tabLayout.d((TabLayout$f)new com.untis.mobile.utils.m0(new l<TabLayout$i, j2>() {
                public final void a(@e final TabLayout$i tabLayout$i) {
                    k0.p(tabLayout$i, "tab");
                    DashboardStudentAbsencesFragment.this.F(inflate, (Child)tabLayout$i.m());
                }
            }));
        }
        return inflate;
    }
}
