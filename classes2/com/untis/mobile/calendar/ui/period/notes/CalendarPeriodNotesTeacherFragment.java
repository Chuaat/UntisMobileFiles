// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.ui.period.notes;

import android.widget.TextView;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView$h;
import w3.b;
import android.content.Context;
import com.untis.mobile.calendar.network.model.period.update.CalendarPeriodAttachment;
import androidx.recyclerview.widget.RecyclerView;
import com.untis.mobile.utils.extension.q;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.text.s;
import com.untis.mobile.calendar.persistence.model.CalendarPeriod;
import kotlin.j2;
import n6.l;
import com.untis.mobile.calendar.ui.period.x;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatImageView;
import org.jetbrains.annotations.f;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.untis.mobile.c;
import androidx.appcompat.widget.AppCompatEditText;
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

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u001d\u0010\u000f\u001a\u00020\n8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0015\u001a\u00020\u00108B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018" }, d2 = { "Lcom/untis/mobile/calendar/ui/period/notes/CalendarPeriodNotesTeacherFragment;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "Lcom/untis/mobile/calendar/ui/period/notes/h;", "G", "Landroidx/navigation/m;", "t", "()Lcom/untis/mobile/calendar/ui/period/notes/h;", "args", "Lcom/untis/mobile/calendar/ui/period/k0;", "H", "Lkotlin/b0;", "u", "()Lcom/untis/mobile/calendar/ui/period/k0;", "model", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class CalendarPeriodNotesTeacherFragment extends UmFragment
{
    @e
    private final m G;
    @e
    private final b0 H;
    
    public CalendarPeriodNotesTeacherFragment() {
        this.G = new m(k1.d(h.class), (a)new a<Bundle>() {
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
    
    private final h t() {
        return ((b0<h>)this.G).getValue();
    }
    
    private final k0 u() {
        return this.H.getValue();
    }
    
    private static final void v(final CalendarPeriodNotesTeacherFragment calendarPeriodNotesTeacherFragment, final View view) {
        kotlin.jvm.internal.k0.p(calendarPeriodNotesTeacherFragment, "this$0");
        calendarPeriodNotesTeacherFragment.onBackPressed();
    }
    
    private static final void w(final CalendarPeriodNotesTeacherFragment calendarPeriodNotesTeacherFragment, final View view, final View view2) {
        kotlin.jvm.internal.k0.p(calendarPeriodNotesTeacherFragment, "this$0");
        kotlin.jvm.internal.k0.p(view, "$view");
        calendarPeriodNotesTeacherFragment.u().x0(calendarPeriodNotesTeacherFragment.getErrorHandler(), String.valueOf(((AppCompatEditText)view.findViewById(c.i.yg)).getText()));
        calendarPeriodNotesTeacherFragment.onBackPressed();
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @f
    public View onCreateView(@e final LayoutInflater layoutInflater, @f final ViewGroup viewGroup, @f final Bundle bundle) {
        kotlin.jvm.internal.k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131492986, viewGroup, false);
        if (inflate == null) {
            return null;
        }
        ((ImageView)inflate.findViewById(c.i.Ag)).setOnClickListener((View$OnClickListener)new com.untis.mobile.calendar.ui.period.notes.f(this));
        final int bg = c.i.Bg;
        ((ImageView)inflate.findViewById(bg)).setOnClickListener((View$OnClickListener)new g(this, inflate));
        final CalendarPeriod d = this.t().d();
        if (x.h(d)) {
            final int yg = c.i.yg;
            ((EditText)inflate.findViewById(yg)).setText((CharSequence)d.getNotesStaff());
            final AppCompatEditText appCompatEditText = (AppCompatEditText)inflate.findViewById(yg);
            kotlin.jvm.internal.k0.o(appCompatEditText, "view.calendar_fragment_period_notesteacher_edit");
            com.untis.mobile.utils.extension.h.A(appCompatEditText, new l<String, j2>() {
                final /* synthetic */ CalendarPeriodNotesTeacherFragment I;
                
                public final void invoke(@e final String s) {
                    kotlin.jvm.internal.k0.p(s, "it");
                    if (s.K1(s, d.getNotesStaff(), true)) {
                        final View h = inflate;
                        final int bg = c.i.Bg;
                        ((ImageView)h.findViewById(bg)).setColorFilter(androidx.core.content.d.f(this.I.requireContext(), 2131099992));
                        ((ImageView)inflate.findViewById(bg)).setClickable(false);
                    }
                    else {
                        final View h2 = inflate;
                        final int bg2 = c.i.Bg;
                        ((ImageView)h2.findViewById(bg2)).setColorFilter(androidx.core.content.d.f(this.I.requireContext(), 2131100003));
                        ((ImageView)inflate.findViewById(bg2)).setClickable(true);
                    }
                }
            });
            ((EditText)inflate.findViewById(yg)).requestFocus();
            final Context requireContext = this.requireContext();
            kotlin.jvm.internal.k0.o(requireContext, "requireContext()");
            com.untis.mobile.utils.extension.e.j(requireContext);
            ((TextView)inflate.findViewById(c.i.Dg)).setVisibility(8);
        }
        else {
            ((EditText)inflate.findViewById(c.i.yg)).setVisibility(8);
            ((ImageView)inflate.findViewById(bg)).setVisibility(8);
            final int dg = c.i.Dg;
            ((TextView)inflate.findViewById(dg)).setText((CharSequence)d.getNotesStaff());
            final AppCompatTextView appCompatTextView = (AppCompatTextView)inflate.findViewById(dg);
            kotlin.jvm.internal.k0.o(appCompatTextView, "view.calendar_fragment_period_notesteacher_text");
            q.e(appCompatTextView, null, 0, 3, null);
        }
        if (d.getNotesStaffFiles().isEmpty() ^ true) {
            ((ImageView)inflate.findViewById(c.i.xg)).setVisibility(0);
            final RecyclerView recyclerView = (RecyclerView)inflate.findViewById(c.i.wg);
            final Context requireContext2 = this.requireContext();
            kotlin.jvm.internal.k0.o(requireContext2, "requireContext()");
            recyclerView.setAdapter((RecyclerView$h)new b(requireContext2, d.getNotesStaffFiles(), new l<CalendarPeriodAttachment, j2>() {
                final /* synthetic */ CalendarPeriodNotesTeacherFragment G;
                
                public final void a(@e final CalendarPeriodAttachment calendarPeriodAttachment) {
                    kotlin.jvm.internal.k0.p(calendarPeriodAttachment, "it");
                    final Context requireContext = this.G.requireContext();
                    kotlin.jvm.internal.k0.o(requireContext, "requireContext()");
                    x.K(calendarPeriodAttachment, requireContext);
                }
            }));
        }
        return inflate;
    }
}
