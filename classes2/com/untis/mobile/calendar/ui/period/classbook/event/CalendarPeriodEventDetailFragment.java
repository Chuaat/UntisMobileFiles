// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.ui.period.classbook.event;

import android.widget.ImageView;
import android.widget.EditText;
import android.widget.TextView;
import androidx.lifecycle.l0;
import androidx.appcompat.widget.AppCompatImageView;
import com.untis.mobile.calendar.ui.period.x;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import java.util.List;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.persistence.models.EntityType;
import org.jetbrains.annotations.f;
import androidx.appcompat.widget.AppCompatEditText;
import com.untis.mobile.persistence.models.classbook.classregevent.EventReason;
import com.untis.mobile.utils.extension.q;
import androidx.appcompat.widget.AppCompatTextView;
import android.view.View$OnClickListener;
import com.untis.mobile.c;
import androidx.appcompat.widget.LinearLayoutCompat;
import android.content.Context;
import com.untis.mobile.utils.extension.h;
import com.untis.mobile.persistence.models.classbook.classregevent.Event;
import android.view.View;
import kotlin.d0;
import com.untis.mobile.calendar.ui.period.k0;
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

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b&\u0010'J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\f\u001a\u00020\u0004H\u0002J\b\u0010\r\u001a\u00020\u0004H\u0002J\u0012\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J&\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016R\u001d\u0010\u001a\u001a\u00020\u00168B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\rR\u001d\u0010 \u001a\u00020\u001d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010%\u001a\u00020!8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b#\u0010$¨\u0006(" }, d2 = { "Lcom/untis/mobile/calendar/ui/period/classbook/event/CalendarPeriodEventDetailFragment;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "Landroid/view/View;", "view", "Lkotlin/j2;", "L", "H", "Lcom/untis/mobile/persistence/models/classbook/classregevent/Event;", "event", "J", "B", "N", "G", "I", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "Lcom/untis/mobile/calendar/ui/period/k0;", "Lkotlin/b0;", "A", "()Lcom/untis/mobile/calendar/ui/period/k0;", "model", "", "separatorColor", "Lcom/untis/mobile/calendar/ui/period/classbook/event/l;", "z", "()Lcom/untis/mobile/calendar/ui/period/classbook/event/l;", "eventModel", "Lcom/untis/mobile/calendar/ui/period/classbook/event/j;", "Landroidx/navigation/m;", "y", "()Lcom/untis/mobile/calendar/ui/period/classbook/event/j;", "args", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class CalendarPeriodEventDetailFragment extends UmFragment
{
    @e
    private final m G;
    @e
    private final b0 H;
    @e
    private final b0 I;
    private int J;
    
    public CalendarPeriodEventDetailFragment() {
        this.G = new m(k1.d(j.class), (a)new a<Bundle>() {
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
        this.H = d0.c((a<?>)new a<k0>() {
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
            public final k0 invoke() {
                return (k0)org.koin.androidx.viewmodel.ext.android.a.a(this.G, k1.d(k0.class), null, this.I, null);
            }
        });
        this.I = d0.c((a<?>)new a<l>() {
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
            public final l invoke() {
                return (l)org.koin.androidx.viewmodel.ext.android.a.a(this.G, k1.d(l.class), null, this.I, null);
            }
        });
    }
    
    private final k0 A() {
        return this.H.getValue();
    }
    
    private final void B() {
    }
    
    private static final void C(final CalendarPeriodEventDetailFragment calendarPeriodEventDetailFragment, final View view) {
        kotlin.jvm.internal.k0.p(calendarPeriodEventDetailFragment, "this$0");
        calendarPeriodEventDetailFragment.onBackPressed();
    }
    
    private static final void D(final CalendarPeriodEventDetailFragment calendarPeriodEventDetailFragment, final View view) {
        kotlin.jvm.internal.k0.p(calendarPeriodEventDetailFragment, "this$0");
        calendarPeriodEventDetailFragment.G();
    }
    
    private static final void E(final CalendarPeriodEventDetailFragment calendarPeriodEventDetailFragment, final View view) {
        kotlin.jvm.internal.k0.p(calendarPeriodEventDetailFragment, "this$0");
        calendarPeriodEventDetailFragment.I();
    }
    
    private static final void F(final CalendarPeriodEventDetailFragment calendarPeriodEventDetailFragment, final View view, final Event event) {
        kotlin.jvm.internal.k0.p(calendarPeriodEventDetailFragment, "this$0");
        kotlin.jvm.internal.k0.p(view, "$view");
        kotlin.jvm.internal.k0.o(event, "event");
        calendarPeriodEventDetailFragment.J(view, event);
        calendarPeriodEventDetailFragment.N(view, event);
    }
    
    private final void G() {
        final Context requireContext = this.requireContext();
        kotlin.jvm.internal.k0.o(requireContext, "requireContext()");
        h.p(requireContext, "on delete");
    }
    
    private final void H() {
    }
    
    private final void I() {
        final Context requireContext = this.requireContext();
        kotlin.jvm.internal.k0.o(requireContext, "requireContext()");
        h.p(requireContext, "on submit");
    }
    
    private final void J(final View view, final Event event) {
        ((ViewGroup)view.findViewById(c.i.He)).setOnClickListener((View$OnClickListener)new g(this));
        final int je = c.i.Je;
        final AppCompatTextView appCompatTextView = (AppCompatTextView)view.findViewById(je);
        final EventReason eventReason = event.getEventReason();
        CharSequence displayableTitle;
        if (eventReason == null) {
            displayableTitle = null;
        }
        else {
            displayableTitle = eventReason.getDisplayableTitle();
        }
        ((TextView)appCompatTextView).setText(displayableTitle);
        final AppCompatTextView appCompatTextView2 = (AppCompatTextView)view.findViewById(je);
        kotlin.jvm.internal.k0.o(appCompatTextView2, "view.calendar_fragment_period_eventdetail_category_subtitle");
        q.e(appCompatTextView2, null, 0, 3, null);
    }
    
    private static final void K(final CalendarPeriodEventDetailFragment calendarPeriodEventDetailFragment, final View view) {
        kotlin.jvm.internal.k0.p(calendarPeriodEventDetailFragment, "this$0");
        calendarPeriodEventDetailFragment.B();
    }
    
    private final void L(final View view) {
        final AppCompatTextView appCompatTextView = (AppCompatTextView)view.findViewById(c.i.Ne);
        final l z = this.z();
        final Context requireContext = this.requireContext();
        kotlin.jvm.internal.k0.o(requireContext, "requireContext()");
        ((TextView)appCompatTextView).setText((CharSequence)z.i(requireContext));
        final AppCompatTextView appCompatTextView2 = (AppCompatTextView)view.findViewById(c.i.Me);
        final l z2 = this.z();
        final Context requireContext2 = this.requireContext();
        kotlin.jvm.internal.k0.o(requireContext2, "requireContext()");
        ((TextView)appCompatTextView2).setText((CharSequence)z2.h(requireContext2));
        ((ViewGroup)view.findViewById(c.i.Ke)).setOnClickListener((View$OnClickListener)new com.untis.mobile.calendar.ui.period.classbook.event.e(this));
    }
    
    private static final void M(final CalendarPeriodEventDetailFragment calendarPeriodEventDetailFragment, final View view) {
        kotlin.jvm.internal.k0.p(calendarPeriodEventDetailFragment, "this$0");
        calendarPeriodEventDetailFragment.H();
    }
    
    private final void N(final View view, final Event event) {
        ((ViewGroup)view.findViewById(c.i.Te)).setOnClickListener((View$OnClickListener)new com.untis.mobile.calendar.ui.period.classbook.event.c(view, this));
        ((EditText)view.findViewById(c.i.Ue)).setText((CharSequence)event.getText());
    }
    
    private static final void O(final View view, final CalendarPeriodEventDetailFragment calendarPeriodEventDetailFragment, final View view2) {
        kotlin.jvm.internal.k0.p(view, "$view");
        kotlin.jvm.internal.k0.p(calendarPeriodEventDetailFragment, "this$0");
        final int ue = c.i.Ue;
        ((EditText)view.findViewById(ue)).requestFocus();
        calendarPeriodEventDetailFragment.showKeyboard(view.findViewById(ue));
    }
    
    private final j y() {
        return ((b0<j>)this.G).getValue();
    }
    
    private final l z() {
        return this.I.getValue();
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    public void onCreate(@f final Bundle bundle) {
        super.onCreate(bundle);
        this.J = androidx.core.content.d.f(this.requireContext(), 2131099984);
        final l z = this.z();
        final Profile d0 = this.A().d0();
        final Event i = this.y().i();
        final EntityType by = EntityType.Companion.findBy(this.y().h());
        final long[] g = this.y().g();
        List<Long> dy;
        if (g == null) {
            dy = null;
        }
        else {
            dy = kotlin.collections.m.dy(g);
        }
        z.k(d0, i, by, dy);
    }
    
    @f
    public View onCreateView(@e final LayoutInflater layoutInflater, @f final ViewGroup viewGroup, @f final Bundle bundle) {
        kotlin.jvm.internal.k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131492978, viewGroup, false);
        if (inflate == null) {
            return null;
        }
        final boolean b = x.b(this.y().j()) ^ true;
        ((ImageView)inflate.findViewById(c.i.Pe)).setOnClickListener((View$OnClickListener)new com.untis.mobile.calendar.ui.period.classbook.event.h(this));
        final int re = c.i.Re;
        ((ImageView)inflate.findViewById(re)).setOnClickListener((View$OnClickListener)new com.untis.mobile.calendar.ui.period.classbook.event.d(this));
        ((ImageView)inflate.findViewById(re)).setVisibility(h.U(b && this.y().i().getId() > 0L, 0, 1, null));
        final int qe = c.i.Qe;
        ((ImageView)inflate.findViewById(qe)).setOnClickListener((View$OnClickListener)new com.untis.mobile.calendar.ui.period.classbook.event.f(this));
        ((ImageView)inflate.findViewById(qe)).setVisibility(h.U(b, 0, 1, null));
        final AppCompatTextView appCompatTextView = (AppCompatTextView)inflate.findViewById(c.i.Se);
        int text;
        if (this.y().i().getId() > 0L) {
            text = 2131886209;
        }
        else {
            text = 2131886206;
        }
        ((TextView)appCompatTextView).setText(text);
        this.L(inflate);
        if (this.A().U().r(true).isEmpty()) {
            ((ViewGroup)inflate.findViewById(c.i.He)).setVisibility(8);
            ((ImageView)inflate.findViewById(c.i.Ie)).setVisibility(8);
        }
        this.z().j().j(this.getViewLifecycleOwner(), (l0)new i(this, inflate));
        return inflate;
    }
}
