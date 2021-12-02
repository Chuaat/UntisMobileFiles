// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.ui.option.classlead.events;

import android.widget.ImageView;
import android.widget.TextView;
import android.widget.EditText;
import androidx.lifecycle.l0;
import n6.l;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatImageView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import androidx.lifecycle.y;
import com.untis.mobile.persistence.models.EntityType;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.h;
import kotlin.c1;
import kotlin.coroutines.jvm.internal.o;
import kotlin.j2;
import kotlinx.coroutines.r0;
import n6.p;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.RecyclerView$h;
import com.untis.mobile.utils.extension.q;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import com.untis.mobile.dashboard.persistence.model.classlead.DashboardClassLead;
import java.util.ArrayList;
import java.util.List;
import com.untis.mobile.c;
import androidx.appcompat.widget.AppCompatEditText;
import kotlin.jvm.internal.k0;
import android.view.View;
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

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J \u0010\f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0002J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J&\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016R\u001d\u0010\u0019\u001a\u00020\u00158B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001f\u001a\u00020\u001a8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\"" }, d2 = { "Lcom/untis/mobile/dashboard/ui/option/classlead/events/DashboardClassLeadEventsFragment;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "Lkotlin/j2;", "E", "Landroid/view/View;", "view", "", "filter", "x", "", "Lcom/untis/mobile/dashboard/persistence/model/classlead/DashboardClassLead;", "leads", "G", "F", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "Lcom/untis/mobile/dashboard/ui/option/classlead/events/f;", "Landroidx/navigation/m;", "y", "()Lcom/untis/mobile/dashboard/ui/option/classlead/events/f;", "args", "Lcom/untis/mobile/dashboard/ui/option/classlead/b;", "H", "Lkotlin/b0;", "z", "()Lcom/untis/mobile/dashboard/ui/option/classlead/b;", "model", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class DashboardClassLeadEventsFragment extends UmFragment
{
    @e
    private final m G;
    @e
    private final b0 H;
    
    public DashboardClassLeadEventsFragment() {
        this.G = new m(k1.d(f.class), (a)new a<Bundle>() {
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
    
    private static final void A(final DashboardClassLeadEventsFragment dashboardClassLeadEventsFragment, final View view) {
        k0.p(dashboardClassLeadEventsFragment, "this$0");
        dashboardClassLeadEventsFragment.onBackPressed();
    }
    
    private static final void B(final DashboardClassLeadEventsFragment dashboardClassLeadEventsFragment, final View view) {
        k0.p(dashboardClassLeadEventsFragment, "this$0");
        dashboardClassLeadEventsFragment.E();
    }
    
    private static final void C(final View view, final View view2) {
        k0.p(view, "$view");
        ((EditText)view.findViewById(c.i.Wo)).setText((CharSequence)"");
    }
    
    private static final void D(final DashboardClassLeadEventsFragment dashboardClassLeadEventsFragment, final View view, final List list) {
        k0.p(dashboardClassLeadEventsFragment, "this$0");
        k0.p(view, "$view");
        List<DashboardClassLead> list2;
        if (list == null) {
            list2 = null;
        }
        else {
            final ArrayList<DashboardClassLead> list3 = new ArrayList<DashboardClassLead>();
            for (final DashboardClassLead next : list) {
                if (kotlin.collections.m.O7(dashboardClassLeadEventsFragment.y().d(), next.getKlasse().getId())) {
                    list3.add(next);
                }
            }
            list2 = list3;
        }
        dashboardClassLeadEventsFragment.G(view, list2);
    }
    
    private final void E() {
        androidx.navigation.fragment.c.a((Fragment)this).D(g.a.a());
    }
    
    private final void F(final View view) {
        final RecyclerView$h adapter = ((RecyclerView)view.findViewById(c.i.Xo)).getAdapter();
        com.untis.mobile.dashboard.ui.option.classlead.events.a a;
        if (adapter instanceof com.untis.mobile.dashboard.ui.option.classlead.events.a) {
            a = (com.untis.mobile.dashboard.ui.option.classlead.events.a)adapter;
        }
        else {
            a = null;
        }
        if (a == null) {
            return;
        }
        final RecyclerView$h adapter2 = ((RecyclerView)view.findViewById(c.i.Oo)).getAdapter();
        com.untis.mobile.dashboard.ui.option.classlead.events.a a2;
        if (adapter2 instanceof com.untis.mobile.dashboard.ui.option.classlead.events.a) {
            a2 = (com.untis.mobile.dashboard.ui.option.classlead.events.a)adapter2;
        }
        else {
            a2 = null;
        }
        if (a2 == null) {
            return;
        }
        int n;
        AppCompatTextView appCompatTextView;
        int text;
        if (a.o() && a2.o()) {
            ((ViewGroup)view.findViewById(c.i.TD)).setVisibility(0);
            ((FloatingActionButton)view.findViewById(c.i.SD)).setImageDrawable(androidx.core.content.d.i(this.requireContext(), 2131231148));
            ((TextView)view.findViewById(c.i.VD)).setText(2131886743);
            n = c.i.UD;
            appCompatTextView = (AppCompatTextView)view.findViewById(n);
            text = 2131886742;
        }
        else {
            if (a.getItemCount() != 0 || a2.getItemCount() != 0) {
                ((ViewGroup)view.findViewById(c.i.TD)).setVisibility(8);
                return;
            }
            ((ViewGroup)view.findViewById(c.i.TD)).setVisibility(0);
            ((FloatingActionButton)view.findViewById(c.i.SD)).setImageDrawable(androidx.core.content.d.i(this.requireContext(), 2131231094));
            ((TextView)view.findViewById(c.i.VD)).setText(2131886312);
            n = c.i.UD;
            appCompatTextView = (AppCompatTextView)view.findViewById(n);
            text = 2131886311;
        }
        ((TextView)appCompatTextView).setText(text);
        final AppCompatTextView appCompatTextView2 = (AppCompatTextView)view.findViewById(n);
        k0.o(appCompatTextView2, "view.layout_empty_view_subtitle");
        q.e(appCompatTextView2, null, 0, 3, null);
    }
    
    private final void G(final View view, final List<DashboardClassLead> list) {
        final y viewLifecycleOwner = this.getViewLifecycleOwner();
        k0.o(viewLifecycleOwner, "viewLifecycleOwner");
        h.f((r0)z.a(viewLifecycleOwner), (kotlin.coroutines.g)null, (u0)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            Object G;
            int H;
            final /* synthetic */ View I;
            final /* synthetic */ DashboardClassLeadEventsFragment J;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    Object G;
                    int H;
                    final /* synthetic */ View I = this.I;
                    final /* synthetic */ DashboardClassLeadEventsFragment J = this.J;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((DashboardClassLeadEventsFragment$f)this.create(r0, d)).invokeSuspend(j2.a);
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
                    final AppCompatTextView g = (AppCompatTextView)this.I.findViewById(c.i.To);
                    final b w = DashboardClassLeadEventsFragment.this.z();
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
        final com.untis.mobile.dashboard.ui.option.classlead.events.a adapter = new com.untis.mobile.dashboard.ui.option.classlead.events.a(requireContext, EntityType.STUDENT, list);
        ((RecyclerView)view.findViewById(c.i.Xo)).setAdapter((RecyclerView$h)adapter);
        ((TextView)view.findViewById(c.i.Yo)).setVisibility(com.untis.mobile.utils.extension.h.U(adapter.getItemCount() > 0, 0, 1, null));
        final Context requireContext2 = this.requireContext();
        k0.o(requireContext2, "requireContext()");
        final com.untis.mobile.dashboard.ui.option.classlead.events.a adapter2 = new com.untis.mobile.dashboard.ui.option.classlead.events.a(requireContext2, EntityType.CLASS, list);
        ((RecyclerView)view.findViewById(c.i.Oo)).setAdapter((RecyclerView$h)adapter2);
        ((TextView)view.findViewById(c.i.Po)).setVisibility(com.untis.mobile.utils.extension.h.U(adapter2.getItemCount() > 0, 0, 1, null));
        this.F(view);
    }
    
    private final void x(final View view, final String s) {
        final RecyclerView$h adapter = ((RecyclerView)view.findViewById(c.i.Xo)).getAdapter();
        com.untis.mobile.dashboard.ui.option.classlead.events.a a;
        if (adapter instanceof com.untis.mobile.dashboard.ui.option.classlead.events.a) {
            a = (com.untis.mobile.dashboard.ui.option.classlead.events.a)adapter;
        }
        else {
            a = null;
        }
        if (a != null) {
            a.i(s);
            ((TextView)view.findViewById(c.i.Yo)).setVisibility(com.untis.mobile.utils.extension.h.U(a.getItemCount() > 0, 0, 1, null));
        }
        final RecyclerView$h adapter2 = ((RecyclerView)view.findViewById(c.i.Oo)).getAdapter();
        com.untis.mobile.dashboard.ui.option.classlead.events.a a2;
        if (adapter2 instanceof com.untis.mobile.dashboard.ui.option.classlead.events.a) {
            a2 = (com.untis.mobile.dashboard.ui.option.classlead.events.a)adapter2;
        }
        else {
            a2 = null;
        }
        if (a2 != null) {
            a2.i(s);
            ((TextView)view.findViewById(c.i.Po)).setVisibility(com.untis.mobile.utils.extension.h.U(a2.getItemCount() > 0, 0, 1, null));
        }
        this.F(view);
    }
    
    private final f y() {
        return ((b0<f>)this.G).getValue();
    }
    
    private final b z() {
        return this.H.getValue();
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @org.jetbrains.annotations.f
    public View onCreateView(@e final LayoutInflater layoutInflater, @org.jetbrains.annotations.f final ViewGroup viewGroup, @org.jetbrains.annotations.f final Bundle bundle) {
        k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131493089, viewGroup, false);
        if (inflate == null) {
            return null;
        }
        final y viewLifecycleOwner = this.getViewLifecycleOwner();
        k0.o(viewLifecycleOwner, "viewLifecycleOwner");
        h.f((r0)z.a(viewLifecycleOwner), (kotlin.coroutines.g)null, (u0)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            Object G;
            int H;
            final /* synthetic */ View I;
            final /* synthetic */ DashboardClassLeadEventsFragment J;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    Object G;
                    int H;
                    final /* synthetic */ View I = this.I;
                    final /* synthetic */ DashboardClassLeadEventsFragment J = this.J;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((DashboardClassLeadEventsFragment$a)this.create(r0, d)).invokeSuspend(j2.a);
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
                    final AppCompatTextView g = (AppCompatTextView)this.I.findViewById(c.i.To);
                    final b w = DashboardClassLeadEventsFragment.this.z();
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
        ((ImageView)inflate.findViewById(c.i.Ro)).setOnClickListener((View$OnClickListener)new com.untis.mobile.dashboard.ui.option.classlead.events.c(this));
        ((ImageView)inflate.findViewById(c.i.So)).setOnClickListener((View$OnClickListener)new com.untis.mobile.dashboard.ui.option.classlead.events.d(this));
        ((ImageView)inflate.findViewById(c.i.Vo)).setOnClickListener((View$OnClickListener)new com.untis.mobile.dashboard.ui.option.classlead.events.b(inflate));
        final AppCompatEditText appCompatEditText = (AppCompatEditText)inflate.findViewById(c.i.Wo);
        k0.o(appCompatEditText, "view.fragment_dashboard_classlead_events_search_edit");
        com.untis.mobile.utils.extension.h.A(appCompatEditText, new l<String, j2>() {
            public final void invoke(@e final String s) {
                k0.p(s, "it");
                DashboardClassLeadEventsFragment.this.x(inflate, s);
            }
        });
        this.z().o().j(this.getViewLifecycleOwner(), (l0)new com.untis.mobile.dashboard.ui.option.classlead.events.e(this, inflate));
        return inflate;
    }
}
