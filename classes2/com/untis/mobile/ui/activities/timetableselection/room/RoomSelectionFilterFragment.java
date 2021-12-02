// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.timetableselection.room;

import android.widget.ImageView;
import android.widget.TextView;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatImageView;
import android.os.Bundle;
import org.jetbrains.annotations.f;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import org.joda.time.v;
import org.joda.time.t;
import androidx.appcompat.widget.AppCompatTextView;
import android.widget.TimePicker;
import android.app.TimePickerDialog$OnTimeSetListener;
import android.app.TimePickerDialog;
import android.widget.DatePicker;
import org.joda.time.c;
import android.app.DatePickerDialog$OnDateSetListener;
import android.app.DatePickerDialog;
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
import kotlin.jvm.internal.w;
import kotlin.b0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.fragments.common.UmFragment;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J&\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016R\u001d\u0010\u0015\u001a\u00020\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001a" }, d2 = { "Lcom/untis/mobile/ui/activities/timetableselection/room/RoomSelectionFilterFragment;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "Landroid/view/View;", "view", "Lkotlin/j2;", "K", "M", "G", "I", "O", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "Lcom/untis/mobile/ui/activities/timetableselection/room/z;", "Lkotlin/b0;", "A", "()Lcom/untis/mobile/ui/activities/timetableselection/room/z;", "viewModel", "<init>", "()V", "H", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class RoomSelectionFilterFragment extends UmFragment
{
    @e
    public static final a H;
    @e
    private final b0 G;
    
    static {
        H = new a(null);
    }
    
    public RoomSelectionFilterFragment() {
        this.G = d0.c((n6.a<?>)new n6.a<z>() {
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
            public final z invoke() {
                return (z)org.koin.androidx.viewmodel.ext.android.a.a(this.G, k1.d(z.class), null, this.I, null);
            }
        });
    }
    
    private final z A() {
        return this.G.getValue();
    }
    
    private static final void B(final RoomSelectionFilterFragment roomSelectionFilterFragment, final View view) {
        k0.p(roomSelectionFilterFragment, "this$0");
        roomSelectionFilterFragment.onBackPressed();
    }
    
    private static final void C(final RoomSelectionFilterFragment roomSelectionFilterFragment, final View view, final View view2) {
        k0.p(roomSelectionFilterFragment, "this$0");
        k0.p(view, "$view");
        roomSelectionFilterFragment.K(view);
    }
    
    private static final void D(final RoomSelectionFilterFragment roomSelectionFilterFragment, final View view, final View view2) {
        k0.p(roomSelectionFilterFragment, "this$0");
        k0.p(view, "$view");
        roomSelectionFilterFragment.M(view);
    }
    
    private static final void E(final RoomSelectionFilterFragment roomSelectionFilterFragment, final View view, final View view2) {
        k0.p(roomSelectionFilterFragment, "this$0");
        k0.p(view, "$view");
        roomSelectionFilterFragment.G(view);
    }
    
    private static final void F(final RoomSelectionFilterFragment roomSelectionFilterFragment, final View view, final View view2) {
        k0.p(roomSelectionFilterFragment, "this$0");
        k0.p(view, "$view");
        roomSelectionFilterFragment.I(view);
    }
    
    private final void G(final View view) {
        final c k = this.A().k();
        new DatePickerDialog(this.requireContext(), (DatePickerDialog$OnDateSetListener)new k(this, k, view), ((org.joda.time.base.a)k).k2(), ((org.joda.time.base.a)k).f3() - 1, ((org.joda.time.base.a)k).X3()).show();
    }
    
    private static final void H(final RoomSelectionFilterFragment roomSelectionFilterFragment, c x1, final View view, final DatePicker datePicker, final int n, final int n2, final int n3) {
        k0.p(roomSelectionFilterFragment, "this$0");
        k0.p(x1, "$end");
        k0.p(view, "$view");
        final z a = roomSelectionFilterFragment.A();
        x1 = x1.e2(n).V1(n2 + 1).x1(n3);
        k0.o(x1, "end\n                        .withYear(newYear)\n                        .withMonthOfYear(newMonthJava + 1)\n                        .withDayOfMonth(newDayOfMonth)");
        a.p(x1);
        roomSelectionFilterFragment.O(view);
    }
    
    private final void I(final View view) {
        final c k = this.A().k();
        new TimePickerDialog(this.requireContext(), (TimePickerDialog$OnTimeSetListener)new m(this, k, view), ((org.joda.time.base.a)k).s4(), ((org.joda.time.base.a)k).k5(), true).show();
    }
    
    private static final void J(final RoomSelectionFilterFragment roomSelectionFilterFragment, c u1, final View view, final TimePicker timePicker, final int n, final int n2) {
        k0.p(roomSelectionFilterFragment, "this$0");
        k0.p(u1, "$end");
        k0.p(view, "$view");
        final z a = roomSelectionFilterFragment.A();
        u1 = u1.N1(n).U1(n2);
        k0.o(u1, "end\n                        .withHourOfDay(hourOfDay)\n                        .withMinuteOfHour(minute)");
        a.p(u1);
        roomSelectionFilterFragment.O(view);
    }
    
    private final void K(final View view) {
        final c k = this.A().k();
        new DatePickerDialog(this.requireContext(), (DatePickerDialog$OnDateSetListener)new j(this, k, view), ((org.joda.time.base.a)k).k2(), ((org.joda.time.base.a)k).f3() - 1, ((org.joda.time.base.a)k).X3()).show();
    }
    
    private static final void L(final RoomSelectionFilterFragment roomSelectionFilterFragment, c x1, final View view, final DatePicker datePicker, final int n, final int n2, final int n3) {
        k0.p(roomSelectionFilterFragment, "this$0");
        k0.p(x1, "$start");
        k0.p(view, "$view");
        final z a = roomSelectionFilterFragment.A();
        x1 = x1.e2(n).V1(n2 + 1).x1(n3);
        k0.o(x1, "start\n                        .withYear(newYear)\n                        .withMonthOfYear(newMonthJava + 1)\n                        .withDayOfMonth(newDayOfMonth)");
        a.q(x1);
        roomSelectionFilterFragment.O(view);
    }
    
    private final void M(final View view) {
        final c k = this.A().k();
        new TimePickerDialog(this.requireContext(), (TimePickerDialog$OnTimeSetListener)new l(this, k, view), ((org.joda.time.base.a)k).s4(), ((org.joda.time.base.a)k).k5(), true).show();
    }
    
    private static final void N(final RoomSelectionFilterFragment roomSelectionFilterFragment, c u1, final View view, final TimePicker timePicker, final int n, final int n2) {
        k0.p(roomSelectionFilterFragment, "this$0");
        k0.p(u1, "$start");
        k0.p(view, "$view");
        final z a = roomSelectionFilterFragment.A();
        u1 = u1.N1(n).U1(n2);
        k0.o(u1, "start\n                        .withHourOfDay(hourOfDay)\n                        .withMinuteOfHour(minute)");
        a.q(u1);
        roomSelectionFilterFragment.O(view);
    }
    
    private final void O(final View view) {
        final c k = this.A().k();
        final c j = this.A().j();
        final AppCompatTextView appCompatTextView = (AppCompatTextView)view.findViewById(2131297768);
        final t h1 = k.h1();
        k0.o(h1, "start.toLocalDate()");
        ((TextView)appCompatTextView).setText((CharSequence)com.untis.mobile.utils.d0.m(h1));
        final AppCompatTextView appCompatTextView2 = (AppCompatTextView)view.findViewById(2131297770);
        final v j2 = k.j1();
        k0.o(j2, "start.toLocalTime()");
        ((TextView)appCompatTextView2).setText((CharSequence)com.untis.mobile.utils.d0.r(j2));
        final AppCompatTextView appCompatTextView3 = (AppCompatTextView)view.findViewById(2131297764);
        final t h2 = j.h1();
        k0.o(h2, "end.toLocalDate()");
        ((TextView)appCompatTextView3).setText((CharSequence)com.untis.mobile.utils.d0.m(h2));
        final AppCompatTextView appCompatTextView4 = (AppCompatTextView)view.findViewById(2131297766);
        final v j3 = j.j1();
        k0.o(j3, "end.toLocalTime()");
        ((TextView)appCompatTextView4).setText((CharSequence)com.untis.mobile.utils.d0.r(j3));
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @f
    public View onCreateView(@e final LayoutInflater layoutInflater, @f final ViewGroup viewGroup, @f final Bundle bundle) {
        k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131493119, viewGroup, false);
        if (inflate == null) {
            return null;
        }
        ((ImageView)inflate.findViewById(2131297762)).setOnClickListener((View$OnClickListener)new n(this));
        inflate.findViewById(2131297767).setOnClickListener((View$OnClickListener)new q(this, inflate));
        inflate.findViewById(2131297769).setOnClickListener((View$OnClickListener)new p(this, inflate));
        inflate.findViewById(2131297763).setOnClickListener((View$OnClickListener)new r(this, inflate));
        inflate.findViewById(2131297765).setOnClickListener((View$OnClickListener)new o(this, inflate));
        this.O(inflate);
        return inflate;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006" }, d2 = { "com/untis/mobile/ui/activities/timetableselection/room/RoomSelectionFilterFragment$a", "", "Lcom/untis/mobile/ui/activities/timetableselection/room/RoomSelectionFilterFragment;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final RoomSelectionFilterFragment a() {
            return new RoomSelectionFilterFragment();
        }
    }
}
