// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.ui.period.room.filter;

import android.widget.TextView;
import android.widget.ImageView;
import android.widget.EditText;
import android.content.Context;
import com.untis.mobile.utils.extension.h;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView$h;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.j2;
import n6.l;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatImageView;
import org.jetbrains.annotations.f;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.untis.mobile.c;
import androidx.appcompat.widget.AppCompatEditText;
import com.untis.mobile.calendar.network.model.period.room.CalendarPeriodRoomBuilding;
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

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J&\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016R\u001d\u0010\u0013\u001a\u00020\u000e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0019\u001a\u00020\u00148B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c" }, d2 = { "Lcom/untis/mobile/calendar/ui/period/room/filter/CalendarPeriodRoomBuildingFragment;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomBuilding;", "building", "Lkotlin/j2;", "w", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "Lcom/untis/mobile/calendar/ui/period/room/filter/g;", "G", "Landroidx/navigation/m;", "u", "()Lcom/untis/mobile/calendar/ui/period/room/filter/g;", "args", "Lcom/untis/mobile/calendar/ui/period/k0;", "H", "Lkotlin/b0;", "v", "()Lcom/untis/mobile/calendar/ui/period/k0;", "model", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class CalendarPeriodRoomBuildingFragment extends UmFragment
{
    @e
    private final m G;
    @e
    private final b0 H;
    
    public CalendarPeriodRoomBuildingFragment() {
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
    }
    
    private final g u() {
        return ((b0<g>)this.G).getValue();
    }
    
    private final k0 v() {
        return this.H.getValue();
    }
    
    private final void w(final CalendarPeriodRoomBuilding calendarPeriodRoomBuilding) {
        this.v().p0(calendarPeriodRoomBuilding);
        this.onBackPressed();
    }
    
    private static final void x(final CalendarPeriodRoomBuildingFragment calendarPeriodRoomBuildingFragment, final View view) {
        kotlin.jvm.internal.k0.p(calendarPeriodRoomBuildingFragment, "this$0");
        calendarPeriodRoomBuildingFragment.onBackPressed();
    }
    
    private static final void y(final View view, final View view2) {
        kotlin.jvm.internal.k0.p(view, "$view");
        ((EditText)view.findViewById(c.i.Vg)).setText((CharSequence)"");
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @f
    public View onCreateView(@e final LayoutInflater layoutInflater, @f final ViewGroup viewGroup, @f final Bundle bundle) {
        kotlin.jvm.internal.k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131492989, viewGroup, false);
        if (inflate == null) {
            return null;
        }
        ((ImageView)inflate.findViewById(c.i.Qg)).setOnClickListener((View$OnClickListener)new com.untis.mobile.calendar.ui.period.room.filter.f(this));
        ((FloatingActionButton)inflate.findViewById(c.i.SD)).setImageDrawable(androidx.core.content.d.i(this.requireContext(), 2131231148));
        ((TextView)inflate.findViewById(c.i.VD)).setText(2131886743);
        ((TextView)inflate.findViewById(c.i.UD)).setText(2131886742);
        final Context requireContext = this.requireContext();
        kotlin.jvm.internal.k0.o(requireContext, "requireContext()");
        final b adapter = new b(requireContext, kotlin.collections.m.ey(this.u().d()), new l<CalendarPeriodRoomBuilding, j2>() {
            public final void a(@e final CalendarPeriodRoomBuilding calendarPeriodRoomBuilding) {
                kotlin.jvm.internal.k0.p(calendarPeriodRoomBuilding, "it");
                CalendarPeriodRoomBuildingFragment.this.w(calendarPeriodRoomBuilding);
            }
        });
        ((RecyclerView)inflate.findViewById(c.i.Sg)).setAdapter((RecyclerView$h)adapter);
        final AppCompatEditText appCompatEditText = (AppCompatEditText)inflate.findViewById(c.i.Vg);
        kotlin.jvm.internal.k0.o(appCompatEditText, "view.calendar_fragment_period_room_filter_building_search_edit");
        h.A(appCompatEditText, new l<String, j2>() {
            public final void invoke(@e final String s) {
                kotlin.jvm.internal.k0.p(s, "it");
                adapter.j(s);
                ((ViewGroup)inflate.findViewById(c.i.TD)).setVisibility(h.U(adapter.k(), 0, 1, null));
            }
        });
        ((ImageView)inflate.findViewById(c.i.Ug)).setOnClickListener((View$OnClickListener)new com.untis.mobile.calendar.ui.period.room.filter.e(inflate));
        return inflate;
    }
}
