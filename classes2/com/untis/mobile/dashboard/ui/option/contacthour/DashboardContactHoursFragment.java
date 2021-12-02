// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.ui.option.contacthour;

import android.widget.ImageView;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.EditText;
import androidx.lifecycle.l0;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatImageView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import org.jetbrains.annotations.f;
import android.os.Bundle;
import kotlin.jvm.internal.w;
import java.util.Iterator;
import java.util.ArrayList;
import androidx.recyclerview.widget.RecyclerView$h;
import kotlin.text.s;
import androidx.cardview.widget.CardView;
import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView;
import com.untis.mobile.utils.extension.h;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.untis.mobile.utils.extension.q;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.untis.mobile.utils.z;
import com.untis.mobile.c;
import androidx.appcompat.widget.AppCompatEditText;
import android.view.View;
import com.untis.mobile.persistence.models.EntityType;
import java.util.List;
import android.content.Context;
import com.untis.mobile.dashboard.persistence.model.contacthour.DashboardContactHour;
import kotlin.j2;
import n6.l;
import kotlin.jvm.internal.k0;
import kotlin.collections.v;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import androidx.fragment.app.d;
import kotlin.p1;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.m0;
import androidx.lifecycle.d1;
import n6.a;
import android.graphics.drawable.Drawable;
import org.jetbrains.annotations.e;
import kotlin.b0;
import kotlin.Metadata;
import com.untis.mobile.ui.fragments.common.UmFragment;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b/\u00100J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\nH\u0002J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u0006H\u0002J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\nH\u0002J \u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0015H\u0002J\u0018\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\"\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u0018H\u0002J\u0012\u0010\u001f\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016J&\u0010$\u001a\u0004\u0018\u00010\u00042\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016R\u0016\u0010'\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010&R\u001d\u0010-\u001a\u00020(8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0016\u0010.\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010&¨\u00061" }, d2 = { "Lcom/untis/mobile/dashboard/ui/option/contacthour/DashboardContactHoursFragment;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "Lcom/untis/mobile/dashboard/ui/option/contacthour/k;", "A", "Landroid/view/View;", "view", "Lkotlin/j2;", "C", "Lcom/untis/mobile/dashboard/ui/option/contacthour/d;", "z", "", "mail", "H", "phone", "I", "Lcom/untis/mobile/dashboard/persistence/model/contacthour/DashboardContactHour;", "contactHour", "J", "K", "filter", "N", "", "contactHours", "P", "", "show", "O", "searchActive", "L", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Drawable;", "drawableSearchIcon", "Lcom/untis/mobile/dashboard/ui/option/contacthour/e;", "G", "Lkotlin/b0;", "B", "()Lcom/untis/mobile/dashboard/ui/option/contacthour/e;", "model", "drawableContactHourIcon", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class DashboardContactHoursFragment extends UmFragment
{
    @e
    private final b0 G;
    private Drawable H;
    private Drawable I;
    
    public DashboardContactHoursFragment() {
        this.G = d0.c((a<?>)new a<com.untis.mobile.dashboard.ui.option.contacthour.e>() {
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
    
    private final k A() {
        final Context requireContext = this.requireContext();
        final List<DashboardContactHour> e = v.E();
        final com.untis.mobile.services.masterdata.a s = this.B().s();
        final EntityType u = this.B().u();
        k0.o(requireContext, "requireContext()");
        return new k(requireContext, s, e, u, new l<String, j2>() {
            public final void invoke(@e final String s) {
                k0.p(s, "it");
                DashboardContactHoursFragment.this.H(s);
            }
        }, new l<String, j2>() {
            public final void invoke(@e final String s) {
                k0.p(s, "it");
                DashboardContactHoursFragment.this.I(s);
            }
        }, new l<DashboardContactHour, j2>() {
            public final void a(@e final DashboardContactHour dashboardContactHour) {
                k0.p(dashboardContactHour, "it");
                DashboardContactHoursFragment.this.J(dashboardContactHour);
            }
        });
    }
    
    private final com.untis.mobile.dashboard.ui.option.contacthour.e B() {
        return this.G.getValue();
    }
    
    private final void C(final View view) {
        ((EditText)view.findViewById(c.i.Ep)).setText((CharSequence)"");
    }
    
    private static final void D(final DashboardContactHoursFragment dashboardContactHoursFragment, final View view, final View view2) {
        k0.p(dashboardContactHoursFragment, "this$0");
        k0.p(view, "$view");
        dashboardContactHoursFragment.C(view);
    }
    
    private static final void E(final DashboardContactHoursFragment dashboardContactHoursFragment, final View view) {
        k0.p(dashboardContactHoursFragment, "this$0");
        dashboardContactHoursFragment.onBackPressed();
    }
    
    private static final void F(final DashboardContactHoursFragment dashboardContactHoursFragment, final View view) {
        k0.p(dashboardContactHoursFragment, "this$0");
        dashboardContactHoursFragment.K();
    }
    
    private static final void G(final DashboardContactHoursFragment dashboardContactHoursFragment, final View view, final List list) {
        k0.p(dashboardContactHoursFragment, "this$0");
        k0.p(view, "$view");
        dashboardContactHoursFragment.P(view, list);
    }
    
    private final void H(final String s) {
        final z a = z.a;
        final Context requireContext = this.requireContext();
        k0.o(requireContext, "requireContext()");
        a.l(requireContext, s);
    }
    
    private final void I(final String s) {
        final z a = z.a;
        final Context requireContext = this.requireContext();
        k0.o(requireContext, "requireContext()");
        a.d(requireContext, s);
    }
    
    private final void J(final DashboardContactHour dashboardContactHour) {
        androidx.navigation.fragment.c.a((Fragment)this).D(j.a.a(dashboardContactHour.getWuId()));
    }
    
    private final void K() {
        androidx.navigation.fragment.c.a((Fragment)this).D(j.a.b());
    }
    
    private final void L(final View view, final boolean b, final boolean b2) {
        if (b2) {
            final FloatingActionButton floatingActionButton = (FloatingActionButton)view.findViewById(c.i.SD);
            final Drawable h = this.H;
            if (h == null) {
                k0.S("drawableSearchIcon");
                throw null;
            }
            floatingActionButton.setImageDrawable(h);
            ((TextView)view.findViewById(c.i.VD)).setText(2131886743);
            ((TextView)view.findViewById(c.i.UD)).setText(2131886742);
        }
        else {
            final FloatingActionButton floatingActionButton2 = (FloatingActionButton)view.findViewById(c.i.SD);
            final Drawable i = this.I;
            if (i == null) {
                k0.S("drawableContactHourIcon");
                throw null;
            }
            floatingActionButton2.setImageDrawable(i);
            ((TextView)view.findViewById(c.i.VD)).setText(2131886316);
            ((TextView)view.findViewById(c.i.UD)).setText((CharSequence)"");
        }
        final AppCompatTextView appCompatTextView = (AppCompatTextView)view.findViewById(c.i.UD);
        k0.o(appCompatTextView, "view.layout_empty_view_subtitle");
        q.e(appCompatTextView, ((AppCompatTextView)view.findViewById(c.i.VD)).getText().toString(), 0, 2, null);
        ((ViewGroup)view.findViewById(c.i.TD)).setVisibility(h.U(b, 0, 1, null));
    }
    
    static /* synthetic */ void M(final DashboardContactHoursFragment dashboardContactHoursFragment, final View view, final boolean b, boolean b2, final int n, final Object o) {
        if ((n & 0x4) != 0x0) {
            b2 = false;
        }
        dashboardContactHoursFragment.L(view, b, b2);
    }
    
    private final void N(final View view, final String s) {
        final RecyclerView$h adapter = ((RecyclerView)view.findViewById(c.i.zp)).getAdapter();
        Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.untis.mobile.dashboard.ui.option.contacthour.DashboardContactHourAdapter");
        final boolean l = ((com.untis.mobile.dashboard.ui.option.contacthour.d)adapter).l(s);
        final CardView cardView = (CardView)view.findViewById(c.i.Ap);
        final boolean b = false;
        ((FrameLayout)cardView).setVisibility(h.U(l, 0, 1, null));
        ((TextView)view.findViewById(c.i.Bp)).setVisibility(h.U(l, 0, 1, null));
        final RecyclerView$h adapter2 = ((RecyclerView)view.findViewById(c.i.yp)).getAdapter();
        Objects.requireNonNull(adapter2, "null cannot be cast to non-null type com.untis.mobile.dashboard.ui.option.contacthour.DashboardSectionContactHourAdapter");
        final boolean j = ((k)adapter2).j(s);
        boolean b2 = b;
        if (!l) {
            b2 = b;
            if (!j) {
                b2 = true;
            }
        }
        this.L(view, b2, s.U1((CharSequence)s) ^ true);
    }
    
    private final void O(final View view, final boolean b) {
        ((ViewGroup)view.findViewById(c.i.XD)).setVisibility(h.U(b, 0, 1, null));
    }
    
    private final void P(final View view, final List<DashboardContactHour> list) {
        List<Object> e;
        if (list == null) {
            e = v.E();
        }
        else {
            e = (List<Object>)list;
        }
        final ArrayList<DashboardContactHour> list2 = new ArrayList<DashboardContactHour>();
        for (final DashboardContactHour next : e) {
            if (next.getRegistered()) {
                list2.add(next);
            }
        }
        final RecyclerView$h adapter = ((RecyclerView)view.findViewById(c.i.zp)).getAdapter();
        Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.untis.mobile.dashboard.ui.option.contacthour.DashboardContactHourAdapter");
        final boolean t = ((com.untis.mobile.dashboard.ui.option.contacthour.d)adapter).t(list2);
        final boolean b = false;
        final int u = h.U(t, 0, 1, null);
        ((FrameLayout)view.findViewById(c.i.Ap)).setVisibility(u);
        ((TextView)view.findViewById(c.i.Bp)).setVisibility(u);
        final ArrayList<DashboardContactHour> list3 = new ArrayList<DashboardContactHour>();
        for (final DashboardContactHour next2 : e) {
            if (next2.getRegistered() ^ true) {
                list3.add(next2);
            }
        }
        final RecyclerView$h adapter2 = ((RecyclerView)view.findViewById(c.i.yp)).getAdapter();
        Objects.requireNonNull(adapter2, "null cannot be cast to non-null type com.untis.mobile.dashboard.ui.option.contacthour.DashboardSectionContactHourAdapter");
        ((k)adapter2).m(list3);
        M(this, view, list != null && list2.isEmpty() && list3.isEmpty(), false, 4, null);
        boolean b2 = b;
        if (list == null) {
            b2 = true;
        }
        this.O(view, b2);
    }
    
    private final com.untis.mobile.dashboard.ui.option.contacthour.d z() {
        final Context requireContext = this.requireContext();
        k0.o(requireContext, "requireContext()");
        return new com.untis.mobile.dashboard.ui.option.contacthour.d(requireContext, v.E(), this.B().u(), null, new l<String, j2>() {
            public final void invoke(@e final String s) {
                k0.p(s, "it");
                DashboardContactHoursFragment.this.H(s);
            }
        }, new l<String, j2>() {
            public final void invoke(@e final String s) {
                k0.p(s, "it");
                DashboardContactHoursFragment.this.I(s);
            }
        }, new l<DashboardContactHour, j2>() {
            public final void a(@e final DashboardContactHour dashboardContactHour) {
                k0.p(dashboardContactHour, "it");
                DashboardContactHoursFragment.this.J(dashboardContactHour);
            }
        }, 8, null);
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    public void onCreate(@f final Bundle bundle) {
        super.onCreate(bundle);
        final Drawable i = androidx.core.content.d.i(this.requireContext(), 2131231148);
        if (i == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        this.H = i;
        final Drawable j = androidx.core.content.d.i(this.requireContext(), 2131231098);
        if (j != null) {
            this.I = j;
            this.B().A();
            this.B().v(this.getErrorHandler());
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
    
    @f
    public View onCreateView(@e final LayoutInflater layoutInflater, @f final ViewGroup viewGroup, @f final Bundle bundle) {
        k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131493091, viewGroup, false);
        if (inflate == null) {
            return null;
        }
        this.O(inflate, true);
        ((TextView)inflate.findViewById(c.i.wp)).setText((CharSequence)this.B().t());
        ((ImageView)inflate.findViewById(c.i.Dp)).setOnClickListener((View$OnClickListener)new com.untis.mobile.dashboard.ui.option.contacthour.h(this, inflate));
        ((ImageView)inflate.findViewById(c.i.up)).setOnClickListener((View$OnClickListener)new g(this));
        ((ImageView)inflate.findViewById(c.i.vp)).setOnClickListener((View$OnClickListener)new com.untis.mobile.dashboard.ui.option.contacthour.f(this));
        final AppCompatEditText appCompatEditText = (AppCompatEditText)inflate.findViewById(c.i.Ep);
        k0.o(appCompatEditText, "view.fragment_dashboard_contacthours_search_edit");
        h.A(appCompatEditText, new l<String, j2>() {
            public final void invoke(@e final String s) {
                k0.p(s, "it");
                DashboardContactHoursFragment.this.N(inflate, s);
            }
        });
        this.B().r().j(this.getViewLifecycleOwner(), (l0)new i(this, inflate));
        ((RecyclerView)inflate.findViewById(c.i.zp)).setAdapter((RecyclerView$h)this.z());
        ((RecyclerView)inflate.findViewById(c.i.yp)).setAdapter((RecyclerView$h)this.A());
        return inflate;
    }
}
