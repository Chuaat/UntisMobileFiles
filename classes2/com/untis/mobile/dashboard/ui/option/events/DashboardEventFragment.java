// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.ui.option.events;

import android.widget.HorizontalScrollView;
import android.widget.TextView;
import android.widget.ImageView;
import java.util.Iterator;
import android.content.Context;
import androidx.lifecycle.l0;
import kotlin.collections.y0;
import com.google.android.material.tabs.TabLayout$f;
import kotlin.j2;
import com.google.android.material.tabs.TabLayout$i;
import n6.l;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import androidx.appcompat.widget.AppCompatTextView;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatImageView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import org.jetbrains.annotations.f;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView$h;
import androidx.recyclerview.widget.RecyclerView;
import com.untis.mobile.persistence.models.profile.Child;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.untis.mobile.dashboard.ui.option.events.reminder.DashboardEventReminderDialog;
import androidx.navigation.NavController;
import java.util.Objects;
import com.untis.mobile.dashboard.persistence.model.Attachment;
import androidx.navigation.fragment.c;
import com.untis.mobile.dashboard.persistence.model.event.DashboardEvent;
import java.util.List;
import org.joda.time.t;
import kotlin.jvm.internal.k0;
import java.util.Map;
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

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u001a\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0012\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J&\u0010\u0018\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016R\u001d\u0010\u001d\u001a\u00020\u00198B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006 " }, d2 = { "Lcom/untis/mobile/dashboard/ui/option/events/DashboardEventFragment;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "Lcom/untis/mobile/dashboard/persistence/model/event/DashboardEvent;", "event", "Lkotlin/j2;", "B", "C", "D", "Landroid/view/View;", "view", "Lcom/untis/mobile/persistence/models/profile/Child;", "child", "G", "", "show", "F", "E", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "Lcom/untis/mobile/dashboard/ui/option/events/j;", "Lkotlin/b0;", "x", "()Lcom/untis/mobile/dashboard/ui/option/events/j;", "model", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class DashboardEventFragment extends UmFragment
{
    @e
    private final b0 G;
    
    public DashboardEventFragment() {
        this.G = d0.c((a<?>)new a<j>() {
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
            public final j invoke() {
                return (j)org.koin.androidx.viewmodel.ext.android.a.a(this.G, k1.d(j.class), null, this.I, null);
            }
        });
    }
    
    private static final void A(final i i, final DashboardEventFragment dashboardEventFragment, final View view, final Map map) {
        k0.p(i, "$adapter");
        k0.p(dashboardEventFragment, "this$0");
        k0.p(view, "$view");
        i.k(map);
        final boolean b = true;
        dashboardEventFragment.F(view, map == null);
        boolean b2 = b;
        if (map != null) {
            b2 = (map.isEmpty() && b);
        }
        dashboardEventFragment.E(view, b2);
    }
    
    private final void B(final DashboardEvent dashboardEvent) {
        final NavController a = c.a((Fragment)this);
        final h.b a2 = h.a;
        final Attachment[] array = dashboardEvent.getAttachments().toArray(new Attachment[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        a.D(a2.a(array));
    }
    
    private final void C(final DashboardEvent dashboardEvent) {
        DashboardEventReminderDialog.k0.a(dashboardEvent).L(this.getChildFragmentManager(), "dashboard-event-notification-dialog");
    }
    
    private final void D() {
        c.a((Fragment)this).D(h.a.b());
    }
    
    private final void E(final View view, final boolean b) {
        ((ViewGroup)view.findViewById(com.untis.mobile.c.i.TD)).setVisibility(com.untis.mobile.utils.extension.h.U(b, 0, 1, null));
    }
    
    private final void F(final View view, final boolean b) {
        ((ViewGroup)view.findViewById(com.untis.mobile.c.i.XD)).setVisibility(com.untis.mobile.utils.extension.h.U(b, 0, 1, null));
    }
    
    private final void G(final View view, final Child child) {
        final RecyclerView$h adapter = ((RecyclerView)view.findViewById(com.untis.mobile.c.i.Bq)).getAdapter();
        Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.untis.mobile.dashboard.ui.option.events.DashboardEventSectionAdapter");
        final i i = (i)adapter;
        i.h(child);
        this.E(view, i.getItemCount() <= 0);
    }
    
    private final j x() {
        return this.G.getValue();
    }
    
    private static final void y(final DashboardEventFragment dashboardEventFragment, final View view) {
        k0.p(dashboardEventFragment, "this$0");
        dashboardEventFragment.onBackPressed();
    }
    
    private static final void z(final DashboardEventFragment dashboardEventFragment, final View view) {
        k0.p(dashboardEventFragment, "this$0");
        dashboardEventFragment.D();
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    public void onCreate(@f final Bundle bundle) {
        super.onCreate(bundle);
        this.x().x();
        this.x().v(this.getErrorHandler());
    }
    
    @f
    public View onCreateView(@e final LayoutInflater layoutInflater, @f final ViewGroup viewGroup, @f final Bundle bundle) {
        k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131493093, viewGroup, false);
        if (inflate == null) {
            return null;
        }
        this.F(inflate, true);
        ((ImageView)inflate.findViewById(com.untis.mobile.c.i.Dq)).setOnClickListener((View$OnClickListener)new com.untis.mobile.dashboard.ui.option.events.f(this));
        final AppCompatTextView appCompatTextView = (AppCompatTextView)inflate.findViewById(com.untis.mobile.c.i.Fq);
        final j x = this.x();
        final Context requireContext = this.requireContext();
        k0.o(requireContext, "requireContext()");
        ((TextView)appCompatTextView).setText((CharSequence)x.t(requireContext));
        ((ImageView)inflate.findViewById(com.untis.mobile.c.i.Eq)).setOnClickListener((View$OnClickListener)new com.untis.mobile.dashboard.ui.option.events.e(this));
        ((TextView)inflate.findViewById(com.untis.mobile.c.i.VD)).setText(2131886261);
        ((TextView)inflate.findViewById(com.untis.mobile.c.i.UD)).setText(2131886262);
        ((FloatingActionButton)inflate.findViewById(com.untis.mobile.c.i.SD)).setImageDrawable(androidx.core.content.d.i(this.requireContext(), 2131231127));
        final TabLayout tabLayout = (TabLayout)inflate.findViewById(com.untis.mobile.c.i.Gq);
        final List<Child> n = this.x().n();
        if (n.size() <= 2) {
            ((HorizontalScrollView)tabLayout).setVisibility(8);
        }
        else {
            for (final Child child : n) {
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
                    DashboardEventFragment.this.G(inflate, (Child)tabLayout$i.m());
                }
            }));
        }
        final i adapter = new i(this, y0.z(), this.x().u(), this.x().r().isEndOfPremium(), new l<DashboardEvent, j2>() {
            public final void a(@e final DashboardEvent dashboardEvent) {
                k0.p(dashboardEvent, "it");
                DashboardEventFragment.this.C(dashboardEvent);
            }
        }, new l<DashboardEvent, j2>() {
            public final void a(@e final DashboardEvent dashboardEvent) {
                k0.p(dashboardEvent, "it");
                DashboardEventFragment.this.B(dashboardEvent);
            }
        });
        ((RecyclerView)inflate.findViewById(com.untis.mobile.c.i.Bq)).setAdapter((RecyclerView$h)adapter);
        this.x().q().j(this.getViewLifecycleOwner(), (l0)new g(adapter, this, inflate));
        return inflate;
    }
}
