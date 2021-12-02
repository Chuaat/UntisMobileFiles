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
import com.untis.mobile.utils.extension.h;
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

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u001d\u0010\u000f\u001a\u00020\n8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0015\u001a\u00020\u00108B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018" }, d2 = { "Lcom/untis/mobile/calendar/ui/period/notes/CalendarPeriodNotesAllFragment;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "Lcom/untis/mobile/calendar/ui/period/k0;", "H", "Lkotlin/b0;", "u", "()Lcom/untis/mobile/calendar/ui/period/k0;", "model", "Lcom/untis/mobile/calendar/ui/period/notes/e;", "G", "Landroidx/navigation/m;", "t", "()Lcom/untis/mobile/calendar/ui/period/notes/e;", "args", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class CalendarPeriodNotesAllFragment extends UmFragment
{
    @e
    private final m G;
    @e
    private final b0 H;
    
    public CalendarPeriodNotesAllFragment() {
        this.G = new m(k1.d(com.untis.mobile.calendar.ui.period.notes.e.class), (a)new a<Bundle>() {
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
    
    private final com.untis.mobile.calendar.ui.period.notes.e t() {
        return ((b0<com.untis.mobile.calendar.ui.period.notes.e>)this.G).getValue();
    }
    
    private final k0 u() {
        return this.H.getValue();
    }
    
    private static final void v(final CalendarPeriodNotesAllFragment calendarPeriodNotesAllFragment, final View view) {
        kotlin.jvm.internal.k0.p(calendarPeriodNotesAllFragment, "this$0");
        calendarPeriodNotesAllFragment.onBackPressed();
    }
    
    private static final void w(final CalendarPeriodNotesAllFragment calendarPeriodNotesAllFragment, final View view, final View view2) {
        kotlin.jvm.internal.k0.p(calendarPeriodNotesAllFragment, "this$0");
        kotlin.jvm.internal.k0.p(view, "$view");
        calendarPeriodNotesAllFragment.u().w0(calendarPeriodNotesAllFragment.getErrorHandler(), String.valueOf(((AppCompatEditText)view.findViewById(c.i.qg)).getText()));
        calendarPeriodNotesAllFragment.onBackPressed();
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @f
    public View onCreateView(@e final LayoutInflater layoutInflater, @f final ViewGroup viewGroup, @f final Bundle bundle) {
        kotlin.jvm.internal.k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131492985, viewGroup, false);
        if (inflate == null) {
            return null;
        }
        ((ImageView)inflate.findViewById(c.i.sg)).setOnClickListener((View$OnClickListener)new com.untis.mobile.calendar.ui.period.notes.c(this));
        final int tg = c.i.tg;
        ((ImageView)inflate.findViewById(tg)).setOnClickListener((View$OnClickListener)new com.untis.mobile.calendar.ui.period.notes.d(this, inflate));
        final CalendarPeriod d = this.t().d();
        if (x.e(d)) {
            final int qg = c.i.qg;
            ((EditText)inflate.findViewById(qg)).setText((CharSequence)d.getNotesAll());
            final AppCompatEditText appCompatEditText = (AppCompatEditText)inflate.findViewById(qg);
            kotlin.jvm.internal.k0.o(appCompatEditText, "view.calendar_fragment_period_notesall_edit");
            h.A(appCompatEditText, new l<String, j2>() {
                final /* synthetic */ CalendarPeriodNotesAllFragment I;
                
                public final void invoke(@e final String s) {
                    kotlin.jvm.internal.k0.p(s, "it");
                    if (s.K1(s, d.getNotesAll(), true)) {
                        final View h = inflate;
                        final int tg = c.i.tg;
                        ((ImageView)h.findViewById(tg)).setColorFilter(androidx.core.content.d.f(this.I.requireContext(), 2131099992));
                        ((ImageView)inflate.findViewById(tg)).setClickable(false);
                    }
                    else {
                        final View h2 = inflate;
                        final int tg2 = c.i.tg;
                        ((ImageView)h2.findViewById(tg2)).setColorFilter(androidx.core.content.d.f(this.I.requireContext(), 2131100003));
                        ((ImageView)inflate.findViewById(tg2)).setClickable(true);
                    }
                }
            });
            ((EditText)inflate.findViewById(qg)).requestFocus();
            final Context requireContext = this.requireContext();
            kotlin.jvm.internal.k0.o(requireContext, "requireContext()");
            com.untis.mobile.utils.extension.e.j(requireContext);
            ((TextView)inflate.findViewById(c.i.vg)).setVisibility(8);
        }
        else {
            ((EditText)inflate.findViewById(c.i.qg)).setVisibility(8);
            ((ImageView)inflate.findViewById(tg)).setVisibility(8);
            final int vg = c.i.vg;
            ((TextView)inflate.findViewById(vg)).setText((CharSequence)d.getNotesAll());
            final AppCompatTextView appCompatTextView = (AppCompatTextView)inflate.findViewById(vg);
            kotlin.jvm.internal.k0.o(appCompatTextView, "view.calendar_fragment_period_notesall_text");
            q.e(appCompatTextView, null, 0, 3, null);
        }
        if (d.getNotesAllFiles().isEmpty() ^ true) {
            ((ImageView)inflate.findViewById(c.i.pg)).setVisibility(0);
            final RecyclerView recyclerView = (RecyclerView)inflate.findViewById(c.i.og);
            final Context requireContext2 = this.requireContext();
            kotlin.jvm.internal.k0.o(requireContext2, "requireContext()");
            recyclerView.setAdapter((RecyclerView$h)new b(requireContext2, d.getNotesAllFiles(), new l<CalendarPeriodAttachment, j2>() {
                final /* synthetic */ CalendarPeriodNotesAllFragment G;
                
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
