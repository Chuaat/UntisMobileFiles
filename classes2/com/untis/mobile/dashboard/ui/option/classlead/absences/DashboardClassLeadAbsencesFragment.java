// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.ui.option.classlead.absences;

import android.widget.ImageView;
import android.widget.TextView;
import android.widget.EditText;
import androidx.lifecycle.l0;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatImageView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import androidx.lifecycle.y;
import java.util.Collection;
import kotlinx.coroutines.u0;
import kotlin.coroutines.g;
import kotlinx.coroutines.h;
import kotlin.c1;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.j2;
import kotlinx.coroutines.r0;
import n6.p;
import androidx.lifecycle.z;
import kotlin.collections.v;
import androidx.recyclerview.widget.RecyclerView$h;
import com.untis.mobile.utils.extension.q;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import androidx.appcompat.widget.AppCompatEditText;
import kotlin.jvm.internal.k0;
import android.view.View;
import androidx.navigation.fragment.c;
import com.untis.mobile.dashboard.persistence.model.studentabsence.DashboardStudentAbsence;
import com.untis.mobile.dashboard.persistence.model.classlead.DashboardClassLead;
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

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b#\u0010$J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J \u0010\u000f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\rH\u0002J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u0011\u001a\u00020\u0006H\u0002J&\u0010\u0018\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016R\u001d\u0010\u001d\u001a\u00020\u00198B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\"\u001a\u00020\u001e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b \u0010!¨\u0006%" }, d2 = { "Lcom/untis/mobile/dashboard/ui/option/classlead/absences/DashboardClassLeadAbsencesFragment;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "Lcom/untis/mobile/dashboard/persistence/model/classlead/DashboardClassLead;", "lead", "Lcom/untis/mobile/dashboard/persistence/model/studentabsence/DashboardStudentAbsence;", "absence", "Lkotlin/j2;", "B", "Landroid/view/View;", "view", "", "filter", "y", "", "leads", "I", "H", "G", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "Lcom/untis/mobile/dashboard/ui/option/classlead/absences/l;", "Landroidx/navigation/m;", "z", "()Lcom/untis/mobile/dashboard/ui/option/classlead/absences/l;", "args", "Lcom/untis/mobile/dashboard/ui/option/classlead/b;", "Lkotlin/b0;", "A", "()Lcom/untis/mobile/dashboard/ui/option/classlead/b;", "model", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class DashboardClassLeadAbsencesFragment extends UmFragment
{
    @e
    private final m G;
    @e
    private final b0 H;
    
    public DashboardClassLeadAbsencesFragment() {
        this.G = new m(k1.d(l.class), (a)new a<Bundle>() {
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
    
    private final b A() {
        return this.H.getValue();
    }
    
    private final void B(final DashboardClassLead dashboardClassLead, final DashboardStudentAbsence dashboardStudentAbsence) {
        c.a((Fragment)this).D(com.untis.mobile.dashboard.ui.option.classlead.absences.m.a.a(dashboardClassLead.getKlasse().getId(), dashboardStudentAbsence.getId()));
    }
    
    private static final void C(final DashboardClassLeadAbsencesFragment dashboardClassLeadAbsencesFragment, final View view) {
        k0.p(dashboardClassLeadAbsencesFragment, "this$0");
        dashboardClassLeadAbsencesFragment.onBackPressed();
    }
    
    private static final void D(final DashboardClassLeadAbsencesFragment dashboardClassLeadAbsencesFragment, final View view) {
        k0.p(dashboardClassLeadAbsencesFragment, "this$0");
        dashboardClassLeadAbsencesFragment.G();
    }
    
    private static final void E(final View view, final View view2) {
        k0.p(view, "$view");
        ((EditText)view.findViewById(com.untis.mobile.c.i.Lo)).setText((CharSequence)"");
    }
    
    private static final void F(final DashboardClassLeadAbsencesFragment dashboardClassLeadAbsencesFragment, final View view, final List list) {
        k0.p(dashboardClassLeadAbsencesFragment, "this$0");
        k0.p(view, "$view");
        List<DashboardClassLead> list2;
        if (list == null) {
            list2 = null;
        }
        else {
            final ArrayList<DashboardClassLead> list3 = new ArrayList<DashboardClassLead>();
            for (final DashboardClassLead next : list) {
                if (kotlin.collections.m.O7(dashboardClassLeadAbsencesFragment.z().d(), next.getKlasse().getId())) {
                    list3.add(next);
                }
            }
            list2 = list3;
        }
        dashboardClassLeadAbsencesFragment.I(view, list2);
    }
    
    private final void G() {
        c.a((Fragment)this).D(com.untis.mobile.dashboard.ui.option.classlead.absences.m.a.b());
    }
    
    private final void H(final View view) {
        final RecyclerView$h adapter = ((RecyclerView)view.findViewById(com.untis.mobile.c.i.Do)).getAdapter();
        com.untis.mobile.dashboard.ui.option.classlead.absences.b b;
        if (adapter instanceof com.untis.mobile.dashboard.ui.option.classlead.absences.b) {
            b = (com.untis.mobile.dashboard.ui.option.classlead.absences.b)adapter;
        }
        else {
            b = null;
        }
        if (b == null) {
            return;
        }
        final RecyclerView$h adapter2 = ((RecyclerView)view.findViewById(com.untis.mobile.c.i.Mo)).getAdapter();
        com.untis.mobile.dashboard.ui.option.classlead.absences.b b2;
        if (adapter2 instanceof com.untis.mobile.dashboard.ui.option.classlead.absences.b) {
            b2 = (com.untis.mobile.dashboard.ui.option.classlead.absences.b)adapter2;
        }
        else {
            b2 = null;
        }
        if (b2 == null) {
            return;
        }
        int n;
        AppCompatTextView appCompatTextView;
        int text;
        if (b.s() && b2.s()) {
            ((ViewGroup)view.findViewById(com.untis.mobile.c.i.TD)).setVisibility(0);
            ((FloatingActionButton)view.findViewById(com.untis.mobile.c.i.SD)).setImageDrawable(androidx.core.content.d.i(this.requireContext(), 2131231148));
            ((TextView)view.findViewById(com.untis.mobile.c.i.VD)).setText(2131886743);
            n = com.untis.mobile.c.i.UD;
            appCompatTextView = (AppCompatTextView)view.findViewById(n);
            text = 2131886742;
        }
        else {
            if (b.getItemCount() + b2.getItemCount() != 0) {
                ((ViewGroup)view.findViewById(com.untis.mobile.c.i.TD)).setVisibility(8);
                return;
            }
            ((ViewGroup)view.findViewById(com.untis.mobile.c.i.TD)).setVisibility(0);
            ((FloatingActionButton)view.findViewById(com.untis.mobile.c.i.SD)).setImageDrawable(androidx.core.content.d.i(this.requireContext(), 2131231067));
            ((TextView)view.findViewById(com.untis.mobile.c.i.VD)).setText(2131886321);
            n = com.untis.mobile.c.i.UD;
            appCompatTextView = (AppCompatTextView)view.findViewById(n);
            text = 2131886310;
        }
        ((TextView)appCompatTextView).setText(text);
        final AppCompatTextView appCompatTextView2 = (AppCompatTextView)view.findViewById(n);
        k0.o(appCompatTextView2, "view.layout_empty_view_subtitle");
        q.e(appCompatTextView2, null, 0, 3, null);
    }
    
    private final void I(final View view, final List<DashboardClassLead> list) {
        Collection<Object> c0;
        if (list == null) {
            c0 = null;
        }
        else {
            final ArrayList<Iterable<? extends T>> list2 = new ArrayList<Iterable<? extends T>>(v.Y((Iterable<?>)list, 10));
            final Iterator<DashboardClassLead> iterator = list.iterator();
            while (iterator.hasNext()) {
                list2.add(iterator.next().getAbsences());
            }
            c0 = v.c0((Iterable<? extends Iterable<?>>)list2);
        }
        if (c0 == null || c0.isEmpty()) {
            this.H(view);
            return;
        }
        final y viewLifecycleOwner = this.getViewLifecycleOwner();
        k0.o(viewLifecycleOwner, "viewLifecycleOwner");
        h.f((r0)z.a(viewLifecycleOwner), (g)null, (u0)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            Object G;
            int H;
            final /* synthetic */ View I;
            final /* synthetic */ DashboardClassLeadAbsencesFragment J;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    Object G;
                    int H;
                    final /* synthetic */ View I = this.I;
                    final /* synthetic */ DashboardClassLeadAbsencesFragment J = this.J;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((DashboardClassLeadAbsencesFragment$f)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int h2 = this.H;
                AppCompatTextView appCompatTextView;
                Object t;
                if (h2 != 0) {
                    if (h2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    appCompatTextView = (AppCompatTextView)this.G;
                    c1.n(o);
                    t = o;
                }
                else {
                    c1.n(o);
                    final AppCompatTextView g = (AppCompatTextView)this.I.findViewById(com.untis.mobile.c.i.Io);
                    final b w = DashboardClassLeadAbsencesFragment.this.A();
                    this.G = g;
                    this.H = 1;
                    t = w.t(this);
                    if (t == h) {
                        return h;
                    }
                    appCompatTextView = g;
                }
                ((TextView)appCompatTextView).setText((CharSequence)t);
                return j2.a;
            }
        }, 3, (Object)null);
        final Context requireContext = this.requireContext();
        k0.o(requireContext, "requireContext()");
        final com.untis.mobile.dashboard.ui.option.classlead.absences.b adapter = new com.untis.mobile.dashboard.ui.option.classlead.absences.b(requireContext, list, false, new p<DashboardClassLead, DashboardStudentAbsence, j2>() {
            public final void a(@e final DashboardClassLead dashboardClassLead, @e final DashboardStudentAbsence dashboardStudentAbsence) {
                k0.p(dashboardClassLead, "lead");
                k0.p(dashboardStudentAbsence, "absence");
                DashboardClassLeadAbsencesFragment.this.B(dashboardClassLead, dashboardStudentAbsence);
            }
        });
        ((RecyclerView)view.findViewById(com.untis.mobile.c.i.Mo)).setAdapter((RecyclerView$h)adapter);
        ((TextView)view.findViewById(com.untis.mobile.c.i.No)).setVisibility(com.untis.mobile.utils.extension.h.U(adapter.getItemCount() > 0, 0, 1, null));
        final Context requireContext2 = this.requireContext();
        k0.o(requireContext2, "requireContext()");
        final com.untis.mobile.dashboard.ui.option.classlead.absences.b adapter2 = new com.untis.mobile.dashboard.ui.option.classlead.absences.b(requireContext2, list, true, new p<DashboardClassLead, DashboardStudentAbsence, j2>() {
            public final void a(@e final DashboardClassLead dashboardClassLead, @e final DashboardStudentAbsence dashboardStudentAbsence) {
                k0.p(dashboardClassLead, "lead");
                k0.p(dashboardStudentAbsence, "absence");
                DashboardClassLeadAbsencesFragment.this.B(dashboardClassLead, dashboardStudentAbsence);
            }
        });
        ((RecyclerView)view.findViewById(com.untis.mobile.c.i.Do)).setAdapter((RecyclerView$h)adapter2);
        ((TextView)view.findViewById(com.untis.mobile.c.i.Eo)).setVisibility(com.untis.mobile.utils.extension.h.U(adapter2.getItemCount() > 0, 0, 1, null));
        this.H(view);
    }
    
    private final void y(final View view, final String s) {
        final RecyclerView$h adapter = ((RecyclerView)view.findViewById(com.untis.mobile.c.i.Do)).getAdapter();
        com.untis.mobile.dashboard.ui.option.classlead.absences.b b;
        if (adapter instanceof com.untis.mobile.dashboard.ui.option.classlead.absences.b) {
            b = (com.untis.mobile.dashboard.ui.option.classlead.absences.b)adapter;
        }
        else {
            b = null;
        }
        if (b != null) {
            b.k(s);
            ((TextView)view.findViewById(com.untis.mobile.c.i.Eo)).setVisibility(com.untis.mobile.utils.extension.h.U(b.getItemCount() > 0, 0, 1, null));
        }
        final RecyclerView$h adapter2 = ((RecyclerView)view.findViewById(com.untis.mobile.c.i.Mo)).getAdapter();
        com.untis.mobile.dashboard.ui.option.classlead.absences.b b2;
        if (adapter2 instanceof com.untis.mobile.dashboard.ui.option.classlead.absences.b) {
            b2 = (com.untis.mobile.dashboard.ui.option.classlead.absences.b)adapter2;
        }
        else {
            b2 = null;
        }
        if (b2 != null) {
            b2.k(s);
            ((TextView)view.findViewById(com.untis.mobile.c.i.No)).setVisibility(com.untis.mobile.utils.extension.h.U(b2.getItemCount() > 0, 0, 1, null));
        }
        this.H(view);
    }
    
    private final l z() {
        return ((b0<l>)this.G).getValue();
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @org.jetbrains.annotations.f
    public View onCreateView(@e final LayoutInflater layoutInflater, @org.jetbrains.annotations.f final ViewGroup viewGroup, @org.jetbrains.annotations.f final Bundle bundle) {
        k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131493088, viewGroup, false);
        if (inflate == null) {
            return null;
        }
        final y viewLifecycleOwner = this.getViewLifecycleOwner();
        k0.o(viewLifecycleOwner, "viewLifecycleOwner");
        h.f((r0)z.a(viewLifecycleOwner), (g)null, (u0)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            Object G;
            int H;
            final /* synthetic */ View I;
            final /* synthetic */ DashboardClassLeadAbsencesFragment J;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    Object G;
                    int H;
                    final /* synthetic */ View I = this.I;
                    final /* synthetic */ DashboardClassLeadAbsencesFragment J = this.J;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((DashboardClassLeadAbsencesFragment$a)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int h2 = this.H;
                AppCompatTextView appCompatTextView;
                Object t;
                if (h2 != 0) {
                    if (h2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    appCompatTextView = (AppCompatTextView)this.G;
                    c1.n(o);
                    t = o;
                }
                else {
                    c1.n(o);
                    final AppCompatTextView g = (AppCompatTextView)this.I.findViewById(com.untis.mobile.c.i.Io);
                    final b w = DashboardClassLeadAbsencesFragment.this.A();
                    this.G = g;
                    this.H = 1;
                    t = w.t(this);
                    if (t == h) {
                        return h;
                    }
                    appCompatTextView = g;
                }
                ((TextView)appCompatTextView).setText((CharSequence)t);
                return j2.a;
            }
        }, 3, (Object)null);
        ((ImageView)inflate.findViewById(com.untis.mobile.c.i.Go)).setOnClickListener((View$OnClickListener)new i(this));
        ((ImageView)inflate.findViewById(com.untis.mobile.c.i.Ho)).setOnClickListener((View$OnClickListener)new j(this));
        ((ImageView)inflate.findViewById(com.untis.mobile.c.i.Ko)).setOnClickListener((View$OnClickListener)new com.untis.mobile.dashboard.ui.option.classlead.absences.h(inflate));
        final AppCompatEditText appCompatEditText = (AppCompatEditText)inflate.findViewById(com.untis.mobile.c.i.Lo);
        k0.o(appCompatEditText, "view.fragment_dashboard_classlead_absences_search_edit");
        com.untis.mobile.utils.extension.h.A(appCompatEditText, new n6.l<String, j2>() {
            public final void invoke(@e final String s) {
                k0.p(s, "it");
                DashboardClassLeadAbsencesFragment.this.y(inflate, s);
            }
        });
        this.A().o().j(this.getViewLifecycleOwner(), (l0)new k(this, inflate));
        return inflate;
    }
}
