// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.ui.option.classlead;

import android.widget.ImageView;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import android.widget.FrameLayout;
import androidx.lifecycle.l0;
import androidx.appcompat.widget.AppCompatImageView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.os.Bundle;
import androidx.lifecycle.y;
import com.google.android.material.tabs.TabLayout$f;
import java.util.Objects;
import com.google.android.material.tabs.TabLayout$i;
import n6.l;
import com.google.android.material.tabs.TabLayout;
import kotlinx.coroutines.u0;
import kotlin.coroutines.g;
import com.untis.mobile.utils.extension.q;
import kotlin.c1;
import kotlin.coroutines.jvm.internal.o;
import kotlin.j2;
import kotlinx.coroutines.r0;
import n6.p;
import androidx.lifecycle.z;
import androidx.appcompat.widget.AppCompatTextView;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.k0;
import android.view.View;
import java.util.Iterator;
import java.util.Collection;
import androidx.navigation.fragment.c;
import java.util.ArrayList;
import kotlin.collections.v;
import com.untis.mobile.dashboard.persistence.model.classlead.DashboardClassLead;
import java.util.List;
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

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0016\u0010\t\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0016\u0010\n\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\b\u0010\u000b\u001a\u00020\u0007H\u0002J\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002J\u0012\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J&\u0010\u0016\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\u001e\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004R\u001d\u0010\u001d\u001a\u00020\u00198B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006 " }, d2 = { "Lcom/untis/mobile/dashboard/ui/option/classlead/DashboardClassLeadsFragment;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "Landroid/view/View;", "view", "", "Lcom/untis/mobile/dashboard/persistence/model/classlead/DashboardClassLead;", "leads", "Lkotlin/j2;", "H", "z", "A", "E", "", "show", "F", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "classLeads", "G", "Lcom/untis/mobile/dashboard/ui/option/classlead/b;", "Lkotlin/b0;", "y", "()Lcom/untis/mobile/dashboard/ui/option/classlead/b;", "model", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class DashboardClassLeadsFragment extends UmFragment
{
    @e
    private final b0 G;
    
    public DashboardClassLeadsFragment() {
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
    
    private final void A(final List<DashboardClassLead> list) {
        final ArrayList<Iterable<? extends T>> list2 = new ArrayList<Iterable<? extends T>>(v.Y((Iterable<?>)list, 10));
        final Iterator<? extends T> iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(((DashboardClassLead)iterator.next()).getEvents());
        }
        if (v.c0((Iterable<? extends Iterable<?>>)list2).isEmpty() ^ true) {
            final ArrayList<Long> list3 = new ArrayList<Long>(v.Y((Iterable<?>)list, 10));
            final Iterator<? extends T> iterator2 = list.iterator();
            while (iterator2.hasNext()) {
                list3.add(((DashboardClassLead)iterator2.next()).getKlasse().getId());
            }
            c.a((Fragment)this).D(h.a.b(v.J5(list3)));
        }
    }
    
    private static final void B(final DashboardClassLeadsFragment dashboardClassLeadsFragment, final View view) {
        k0.p(dashboardClassLeadsFragment, "this$0");
        dashboardClassLeadsFragment.onBackPressed();
    }
    
    private static final void C(final DashboardClassLeadsFragment dashboardClassLeadsFragment, final View view) {
        k0.p(dashboardClassLeadsFragment, "this$0");
        dashboardClassLeadsFragment.E();
    }
    
    private static final void D(final DashboardClassLeadsFragment dashboardClassLeadsFragment, final View view, final List list) {
        k0.p(dashboardClassLeadsFragment, "this$0");
        k0.p(view, "$view");
        dashboardClassLeadsFragment.G(view, list);
    }
    
    private final void E() {
        c.a((Fragment)this).D(h.a.c());
    }
    
    private final void F(final View view, final boolean b) {
        ((ViewGroup)view.findViewById(com.untis.mobile.c.i.XD)).setVisibility(com.untis.mobile.utils.extension.h.U(b, 0, 1, null));
    }
    
    private final void H(final View view, final List<DashboardClassLead> list) {
        ((FrameLayout)view.findViewById(com.untis.mobile.c.i.bp)).setVisibility(0);
        ((ViewGroup)view.findViewById(com.untis.mobile.c.i.Zo)).setOnClickListener((View$OnClickListener)new f(this, list));
        ((TextView)view.findViewById(com.untis.mobile.c.i.ap)).setText((CharSequence)this.y().m(list));
        ((ViewGroup)view.findViewById(com.untis.mobile.c.i.cp)).setOnClickListener((View$OnClickListener)new com.untis.mobile.dashboard.ui.option.classlead.e(this, list));
        ((TextView)view.findViewById(com.untis.mobile.c.i.dp)).setText((CharSequence)this.y().q(list));
        this.F(view, false);
    }
    
    private static final void I(final DashboardClassLeadsFragment dashboardClassLeadsFragment, final List list, final View view) {
        k0.p(dashboardClassLeadsFragment, "this$0");
        k0.p(list, "$leads");
        dashboardClassLeadsFragment.z(list);
    }
    
    private static final void J(final DashboardClassLeadsFragment dashboardClassLeadsFragment, final List list, final View view) {
        k0.p(dashboardClassLeadsFragment, "this$0");
        k0.p(list, "$leads");
        dashboardClassLeadsFragment.A(list);
    }
    
    private final b y() {
        return this.G.getValue();
    }
    
    private final void z(final List<DashboardClassLead> list) {
        final ArrayList<Iterable<? extends T>> list2 = new ArrayList<Iterable<? extends T>>(v.Y((Iterable<?>)list, 10));
        final Iterator<? extends T> iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(((DashboardClassLead)iterator.next()).getAbsences());
        }
        if (v.c0((Iterable<? extends Iterable<?>>)list2).isEmpty() ^ true) {
            final ArrayList<Long> list3 = new ArrayList<Long>(v.Y((Iterable<?>)list, 10));
            final Iterator<? extends T> iterator2 = list.iterator();
            while (iterator2.hasNext()) {
                list3.add(((DashboardClassLead)iterator2.next()).getKlasse().getId());
            }
            c.a((Fragment)this).D(h.a.a(v.J5(list3)));
        }
    }
    
    public final void G(@e final View view, @org.jetbrains.annotations.f final List<DashboardClassLead> list) {
        k0.p(view, "view");
        final y viewLifecycleOwner = this.getViewLifecycleOwner();
        k0.o(viewLifecycleOwner, "viewLifecycleOwner");
        kotlinx.coroutines.h.f((r0)z.a(viewLifecycleOwner), (g)this.getErrorHandler(), (u0)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            Object G;
            int H;
            final /* synthetic */ View I;
            final /* synthetic */ DashboardClassLeadsFragment J;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    Object G;
                    int H;
                    final /* synthetic */ View I = this.I;
                    final /* synthetic */ DashboardClassLeadsFragment J = this.J;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((DashboardClassLeadsFragment$c)this.create(r0, d)).invokeSuspend(j2.a);
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
                    final AppCompatTextView g = (AppCompatTextView)this.I.findViewById(com.untis.mobile.c.i.hp);
                    final b w = DashboardClassLeadsFragment.this.y();
                    this.G = g;
                    this.H = 1;
                    t = w.t(this);
                    if (t == h) {
                        return h;
                    }
                    appCompatTextView = g;
                }
                ((TextView)appCompatTextView).setText((CharSequence)t);
                final AppCompatTextView appCompatTextView2 = (AppCompatTextView)this.I.findViewById(com.untis.mobile.c.i.hp);
                k0.o(appCompatTextView2, "view.fragment_dashboard_classleads_header_subtitle");
                q.e(appCompatTextView2, null, 0, 3, null);
                return j2.a;
            }
        }, 2, (Object)null);
        if (list == null) {
            return;
        }
        final TabLayout tabLayout = (TabLayout)view.findViewById(com.untis.mobile.c.i.ip);
        tabLayout.G();
        if (list.size() <= 1) {
            ((HorizontalScrollView)tabLayout).setVisibility(8);
        }
        else {
            tabLayout.e(tabLayout.D().C(2131886670).B((Object)list));
            for (final DashboardClassLead dashboardClassLead : list) {
                tabLayout.e(tabLayout.D().D((CharSequence)dashboardClassLead.getKlasse().getDisplayableTitle()).B((Object)v.k(dashboardClassLead)));
            }
            tabLayout.d((TabLayout$f)new com.untis.mobile.utils.m0(new l<TabLayout$i, j2>() {
                final /* synthetic */ DashboardClassLeadsFragment G;
                
                public final void a(@e final TabLayout$i tabLayout$i) {
                    k0.p(tabLayout$i, "tab");
                    final DashboardClassLeadsFragment g = this.G;
                    final View h = view;
                    final Object m = tabLayout$i.m();
                    Objects.requireNonNull(m, "null cannot be cast to non-null type kotlin.collections.List<com.untis.mobile.dashboard.persistence.model.classlead.DashboardClassLead>");
                    g.H(h, (List)m);
                }
            }));
        }
        this.H(view, list);
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    public void onCreate(@org.jetbrains.annotations.f final Bundle bundle) {
        super.onCreate(bundle);
        this.y().w();
        this.y().u(this.getErrorHandler());
    }
    
    @org.jetbrains.annotations.f
    public View onCreateView(@e final LayoutInflater layoutInflater, @org.jetbrains.annotations.f final ViewGroup viewGroup, @org.jetbrains.annotations.f final Bundle bundle) {
        k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131493087, viewGroup, false);
        if (inflate == null) {
            return null;
        }
        ((ImageView)inflate.findViewById(com.untis.mobile.c.i.fp)).setOnClickListener((View$OnClickListener)new com.untis.mobile.dashboard.ui.option.classlead.c(this));
        ((ImageView)inflate.findViewById(com.untis.mobile.c.i.gp)).setOnClickListener((View$OnClickListener)new com.untis.mobile.dashboard.ui.option.classlead.d(this));
        final AppCompatTextView appCompatTextView = (AppCompatTextView)inflate.findViewById(com.untis.mobile.c.i.hp);
        k0.o(appCompatTextView, "view.fragment_dashboard_classleads_header_subtitle");
        q.e(appCompatTextView, null, 0, 3, null);
        this.F(inflate, true);
        this.y().o().j(this.getViewLifecycleOwner(), (l0)new com.untis.mobile.dashboard.ui.option.classlead.g(this, inflate));
        return inflate;
    }
}
