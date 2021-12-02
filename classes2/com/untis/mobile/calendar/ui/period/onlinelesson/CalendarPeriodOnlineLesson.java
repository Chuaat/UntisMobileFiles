// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.ui.period.onlinelesson;

import android.widget.EditText;
import android.widget.ImageView;
import android.content.Context;
import com.untis.mobile.utils.extension.h;
import kotlin.text.s;
import com.untis.mobile.calendar.persistence.model.CalendarPeriod;
import kotlin.j2;
import n6.l;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatImageView;
import org.jetbrains.annotations.f;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.untis.mobile.calendar.persistence.model.entity.CalendarPeriodVideoCall;
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

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J&\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016R\u001d\u0010\u0012\u001a\u00020\r8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0018\u001a\u00020\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b" }, d2 = { "Lcom/untis/mobile/calendar/ui/period/onlinelesson/CalendarPeriodOnlineLesson;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "Landroid/view/View;", "view", "Lkotlin/j2;", "x", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "Lcom/untis/mobile/calendar/ui/period/k0;", "H", "Lkotlin/b0;", "u", "()Lcom/untis/mobile/calendar/ui/period/k0;", "model", "Lcom/untis/mobile/calendar/ui/period/onlinelesson/c;", "G", "Landroidx/navigation/m;", "t", "()Lcom/untis/mobile/calendar/ui/period/onlinelesson/c;", "args", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class CalendarPeriodOnlineLesson extends UmFragment
{
    @e
    private final m G;
    @e
    private final b0 H;
    
    public CalendarPeriodOnlineLesson() {
        this.G = new m(k1.d(c.class), (a)new a<Bundle>() {
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
    
    private final c t() {
        return ((b0<c>)this.G).getValue();
    }
    
    private final k0 u() {
        return this.H.getValue();
    }
    
    private static final void v(final CalendarPeriodOnlineLesson calendarPeriodOnlineLesson, final View view) {
        kotlin.jvm.internal.k0.p(calendarPeriodOnlineLesson, "this$0");
        calendarPeriodOnlineLesson.onBackPressed();
    }
    
    private static final void w(final CalendarPeriodOnlineLesson calendarPeriodOnlineLesson, final View view, final View view2) {
        kotlin.jvm.internal.k0.p(calendarPeriodOnlineLesson, "this$0");
        kotlin.jvm.internal.k0.o(view, "view");
        calendarPeriodOnlineLesson.x(view);
    }
    
    private final void x(final View view) {
        this.u().y0(this.getErrorHandler(), new CalendarPeriodVideoCall(true, String.valueOf(((AppCompatEditText)view.findViewById(com.untis.mobile.c.i.Kg)).getText())));
        this.onBackPressed();
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @f
    public View onCreateView(@e final LayoutInflater layoutInflater, @f final ViewGroup viewGroup, @f final Bundle bundle) {
        kotlin.jvm.internal.k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131492987, viewGroup, false);
        ((ImageView)inflate.findViewById(com.untis.mobile.c.i.Mg)).setOnClickListener((View$OnClickListener)new com.untis.mobile.calendar.ui.period.onlinelesson.a(this));
        ((ImageView)inflate.findViewById(com.untis.mobile.c.i.Ng)).setOnClickListener((View$OnClickListener)new b(this, inflate));
        final CalendarPeriod d = this.t().d();
        if (d != null) {
            final CalendarPeriodVideoCall videoCall = d.getVideoCall();
            if (videoCall != null) {
                ((EditText)inflate.findViewById(com.untis.mobile.c.i.Kg)).setText((CharSequence)videoCall.getVideoCallUrl());
            }
        }
        final int kg = com.untis.mobile.c.i.Kg;
        final AppCompatEditText appCompatEditText = (AppCompatEditText)inflate.findViewById(kg);
        kotlin.jvm.internal.k0.o(appCompatEditText, "view.calendar_fragment_period_onlinelesson_edit2");
        h.A(appCompatEditText, new l<String, j2>() {
            final /* synthetic */ CalendarPeriodOnlineLesson I;
            
            public final void invoke(@e final String s) {
                kotlin.jvm.internal.k0.p(s, "it");
                final CalendarPeriod g = d;
                String videoCallUrl = null;
                if (g != null) {
                    final CalendarPeriodVideoCall videoCall = g.getVideoCall();
                    if (videoCall != null) {
                        videoCallUrl = videoCall.getVideoCallUrl();
                    }
                }
                boolean clickable = true;
                AppCompatImageView appCompatImageView;
                if (s.K1(s, videoCallUrl, true)) {
                    final View h = inflate;
                    final int ng = com.untis.mobile.c.i.Ng;
                    ((ImageView)h.findViewById(ng)).setColorFilter(androidx.core.content.d.f(this.I.requireContext(), 2131099992));
                    appCompatImageView = (AppCompatImageView)inflate.findViewById(ng);
                    clickable = false;
                }
                else {
                    final View h2 = inflate;
                    final int ng2 = com.untis.mobile.c.i.Ng;
                    ((ImageView)h2.findViewById(ng2)).setColorFilter(androidx.core.content.d.f(this.I.requireContext(), 2131100003));
                    appCompatImageView = (AppCompatImageView)inflate.findViewById(ng2);
                }
                ((ImageView)appCompatImageView).setClickable(clickable);
            }
        });
        ((EditText)inflate.findViewById(kg)).requestFocus();
        final Context requireContext = this.requireContext();
        kotlin.jvm.internal.k0.o(requireContext, "requireContext()");
        com.untis.mobile.utils.extension.e.j(requireContext);
        return inflate;
    }
}
