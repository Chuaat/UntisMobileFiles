// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.ui.option.classlead.absences;

import android.widget.ImageView;
import androidx.lifecycle.l0;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatImageView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import java.util.Iterator;
import com.untis.mobile.dashboard.persistence.model.classlead.DashboardClassLead;
import androidx.lifecycle.y;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.h;
import androidx.recyclerview.widget.RecyclerView$h;
import java.util.List;
import com.untis.mobile.c;
import kotlin.c1;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.j2;
import kotlinx.coroutines.r0;
import n6.p;
import androidx.lifecycle.z;
import kotlin.jvm.internal.k0;
import android.view.View;
import com.untis.mobile.persistence.models.classbook.absence.ExcuseStatus;
import com.untis.mobile.dashboard.persistence.model.studentabsence.DashboardStudentAbsence;
import kotlin.d0;
import com.untis.mobile.dashboard.ui.option.classlead.b;
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

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010#J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002J\u001a\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0002J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0002J&\u0010\u0015\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016R\u001d\u0010\u001b\u001a\u00020\u00168B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010!\u001a\u00020\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006$" }, d2 = { "Lcom/untis/mobile/dashboard/ui/option/classlead/absences/DashboardClassLeadAbsenceExcuseFragment;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "", "Lcom/untis/mobile/dashboard/persistence/model/classlead/DashboardClassLead;", "leads", "Lcom/untis/mobile/dashboard/persistence/model/studentabsence/DashboardStudentAbsence;", "v", "Landroid/view/View;", "view", "absence", "Lkotlin/j2;", "B", "Lcom/untis/mobile/persistence/models/classbook/absence/ExcuseStatus;", "excuseStatus", "A", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "Lcom/untis/mobile/dashboard/ui/option/classlead/b;", "H", "Lkotlin/b0;", "x", "()Lcom/untis/mobile/dashboard/ui/option/classlead/b;", "model", "Lcom/untis/mobile/dashboard/ui/option/classlead/absences/g;", "G", "Landroidx/navigation/m;", "w", "()Lcom/untis/mobile/dashboard/ui/option/classlead/absences/g;", "args", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class DashboardClassLeadAbsenceExcuseFragment extends UmFragment
{
    @e
    private final m G;
    @e
    private final b0 H;
    
    public DashboardClassLeadAbsenceExcuseFragment() {
        this.G = new m(k1.d(g.class), (a)new a<Bundle>() {
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
        this.H = d0.c((a<?>)new a<b>() {
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
    
    private final void A(final DashboardStudentAbsence dashboardStudentAbsence, final ExcuseStatus excuseStatus) {
        this.x().x(this.getErrorHandler(), dashboardStudentAbsence, excuseStatus);
        this.onBackPressed();
    }
    
    private final void B(final View view, final DashboardStudentAbsence dashboardStudentAbsence) {
        if (dashboardStudentAbsence == null) {
            return;
        }
        final y viewLifecycleOwner = this.getViewLifecycleOwner();
        k0.o(viewLifecycleOwner, "viewLifecycleOwner");
        h.f((r0)z.a(viewLifecycleOwner), (kotlin.coroutines.g)this.getErrorHandler(), (u0)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>(null) {
            Object G;
            Object H;
            Object I;
            int J;
            final /* synthetic */ View K;
            final /* synthetic */ DashboardClassLeadAbsenceExcuseFragment L;
            final /* synthetic */ DashboardStudentAbsence M;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>(d) {
                    Object G;
                    Object H;
                    Object I;
                    int J;
                    final /* synthetic */ View K = this.K;
                    final /* synthetic */ DashboardClassLeadAbsenceExcuseFragment L = this.L;
                    final /* synthetic */ DashboardStudentAbsence M = this.M;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((DashboardClassLeadAbsenceExcuseFragment$d)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int j = this.J;
                DashboardStudentAbsence dashboardStudentAbsence;
                Context requireContext;
                RecyclerView g;
                Object r;
                if (j != 0) {
                    if (j != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dashboardStudentAbsence = (DashboardStudentAbsence)this.I;
                    requireContext = (Context)this.H;
                    g = (RecyclerView)this.G;
                    c1.n(o);
                    r = o;
                }
                else {
                    c1.n(o);
                    g = (RecyclerView)this.K.findViewById(c.i.Ao);
                    requireContext = this.L.requireContext();
                    k0.o(requireContext, "requireContext()");
                    final DashboardStudentAbsence m = this.M;
                    final b t = DashboardClassLeadAbsenceExcuseFragment.this.x();
                    this.G = g;
                    this.H = requireContext;
                    this.I = m;
                    this.J = 1;
                    r = t.r(this);
                    if (r == h) {
                        return h;
                    }
                    dashboardStudentAbsence = m;
                }
                g.setAdapter((RecyclerView$h)new com.untis.mobile.dashboard.ui.option.classlead.absences.d(requireContext, dashboardStudentAbsence, (List<ExcuseStatus>)r, new p<DashboardStudentAbsence, ExcuseStatus, j2>() {
                    final /* synthetic */ DashboardClassLeadAbsenceExcuseFragment G = DashboardClassLeadAbsenceExcuseFragment$d.this.L;
                    
                    public final void a(@org.jetbrains.annotations.e final DashboardStudentAbsence dashboardStudentAbsence, @org.jetbrains.annotations.e final ExcuseStatus excuseStatus) {
                        k0.p(dashboardStudentAbsence, "absence");
                        k0.p(excuseStatus, "status");
                        this.G.A(dashboardStudentAbsence, excuseStatus);
                    }
                }));
                return j2.a;
            }
        }, 2, (Object)null);
    }
    
    private final DashboardStudentAbsence v(final List<DashboardClassLead> list) {
        final DashboardStudentAbsence dashboardStudentAbsence = null;
        final DashboardStudentAbsence dashboardStudentAbsence2 = null;
        if (list != null) {
            while (true) {
                for (final DashboardClassLead next : list) {
                    if (next.getKlasse().getId() == this.w().f()) {
                        final DashboardClassLead dashboardClassLead = next;
                        if (dashboardClassLead == null) {
                            return dashboardStudentAbsence;
                        }
                        final List<DashboardStudentAbsence> absences = dashboardClassLead.getAbsences();
                        if (absences == null) {
                            return dashboardStudentAbsence;
                        }
                        final Iterator<Object> iterator2 = absences.iterator();
                        DashboardStudentAbsence next2;
                        do {
                            next2 = dashboardStudentAbsence2;
                            if (!iterator2.hasNext()) {
                                break;
                            }
                            next2 = iterator2.next();
                        } while (next2.getId() != this.w().e());
                        return next2;
                    }
                }
                DashboardClassLead next = null;
                continue;
            }
        }
        return dashboardStudentAbsence;
    }
    
    private final g w() {
        return ((b0<g>)this.G).getValue();
    }
    
    private final b x() {
        return this.H.getValue();
    }
    
    private static final void y(final DashboardClassLeadAbsenceExcuseFragment dashboardClassLeadAbsenceExcuseFragment, final View view) {
        k0.p(dashboardClassLeadAbsenceExcuseFragment, "this$0");
        dashboardClassLeadAbsenceExcuseFragment.onBackPressed();
    }
    
    private static final void z(final DashboardClassLeadAbsenceExcuseFragment dashboardClassLeadAbsenceExcuseFragment, final View view, final List list) {
        k0.p(dashboardClassLeadAbsenceExcuseFragment, "this$0");
        k0.p(view, "$view");
        dashboardClassLeadAbsenceExcuseFragment.B(view, dashboardClassLeadAbsenceExcuseFragment.v(list));
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @org.jetbrains.annotations.f
    public View onCreateView(@e final LayoutInflater layoutInflater, @org.jetbrains.annotations.f final ViewGroup viewGroup, @org.jetbrains.annotations.f final Bundle bundle) {
        k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131493086, viewGroup, false);
        if (inflate == null) {
            return null;
        }
        ((ImageView)inflate.findViewById(c.i.Co)).setOnClickListener((View$OnClickListener)new com.untis.mobile.dashboard.ui.option.classlead.absences.e(this));
        this.x().o().j(this.getViewLifecycleOwner(), (l0)new com.untis.mobile.dashboard.ui.option.classlead.absences.f(this, inflate));
        return inflate;
    }
}
