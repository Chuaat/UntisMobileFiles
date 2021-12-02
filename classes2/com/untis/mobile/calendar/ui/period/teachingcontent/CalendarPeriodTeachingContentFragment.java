// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.ui.period.teachingcontent;

import android.widget.TextView;
import android.widget.ImageView;
import android.widget.EditText;
import android.content.Context;
import com.untis.mobile.calendar.network.model.period.update.CalendarPeriodAttachment;
import kotlin.collections.v;
import kotlin.text.s;
import com.untis.mobile.calendar.persistence.model.CalendarPeriod;
import androidx.appcompat.widget.AppCompatTextView;
import com.untis.mobile.calendar.ui.period.x;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.l0;
import kotlin.jvm.internal.w;
import kotlin.j2;
import n6.l;
import org.jetbrains.annotations.f;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import androidx.recyclerview.widget.RecyclerView$h;
import java.util.List;
import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView;
import com.untis.mobile.utils.extension.h;
import com.untis.mobile.calendar.network.model.CalendarTeachingContentsResponse;
import com.untis.mobile.c;
import androidx.appcompat.widget.AppCompatEditText;
import com.untis.mobile.calendar.network.model.CalendarTeachingContentDto;
import android.view.View;
import kotlin.d0;
import com.untis.mobile.calendar.ui.period.k0;
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

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001a\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J&\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016R\u001d\u0010\u0018\u001a\u00020\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001e\u001a\u00020\u00198B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006!" }, d2 = { "Lcom/untis/mobile/calendar/ui/period/teachingcontent/CalendarPeriodTeachingContentFragment;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "Landroid/view/View;", "view", "Lcom/untis/mobile/calendar/network/model/CalendarTeachingContentDto;", "lessonContent", "Lkotlin/j2;", "B", "Lcom/untis/mobile/calendar/network/model/CalendarTeachingContentsResponse;", "content", "D", "C", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "Lcom/untis/mobile/calendar/ui/period/teachingcontent/d;", "G", "Landroidx/navigation/m;", "w", "()Lcom/untis/mobile/calendar/ui/period/teachingcontent/d;", "args", "Lcom/untis/mobile/calendar/ui/period/k0;", "H", "Lkotlin/b0;", "x", "()Lcom/untis/mobile/calendar/ui/period/k0;", "viewModel", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class CalendarPeriodTeachingContentFragment extends UmFragment
{
    @e
    private final m G;
    @e
    private final b0 H;
    
    public CalendarPeriodTeachingContentFragment() {
        this.G = new m(k1.d(d.class), (a)new a<Bundle>() {
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
                    final androidx.fragment.app.d activity = this.G.getActivity();
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
    
    private static final void A(final CalendarPeriodTeachingContentFragment calendarPeriodTeachingContentFragment, final View view, final View view2) {
        kotlin.jvm.internal.k0.p(calendarPeriodTeachingContentFragment, "this$0");
        kotlin.jvm.internal.k0.p(view, "$view");
        calendarPeriodTeachingContentFragment.C(view);
    }
    
    private final void B(final View view, final CalendarTeachingContentDto calendarTeachingContentDto) {
        final AppCompatEditText appCompatEditText = (AppCompatEditText)view.findViewById(2131297238);
        ((EditText)appCompatEditText).setText((CharSequence)calendarTeachingContentDto.getText());
        this.showKeyboard((View)appCompatEditText);
        ((EditText)appCompatEditText).setSelection(calendarTeachingContentDto.getText().length());
    }
    
    private final void C(final View view) {
        this.x().v0(this.getErrorHandler(), String.valueOf(((AppCompatEditText)view.findViewById(c.i.Uh)).getText()));
        this.onBackPressed();
    }
    
    private final void D(final View view, final CalendarTeachingContentsResponse calendarTeachingContentsResponse) {
        if (calendarTeachingContentsResponse == null) {
            return;
        }
        final View viewById = view.findViewById(2131297244);
        final List<CalendarTeachingContentDto> teachingContents = calendarTeachingContentsResponse.getTeachingContents();
        viewById.setVisibility(h.U((teachingContents == null || teachingContents.isEmpty()) ^ true, 0, 1, null));
        final RecyclerView$h adapter = ((RecyclerView)view.findViewById(2131297243)).getAdapter();
        Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.untis.mobile.calendar.ui.period.teachingcontent.PreviousLessonContentAdapter");
        ((com.untis.mobile.calendar.ui.period.teachingcontent.e)adapter).j(calendarTeachingContentsResponse);
    }
    
    private final d w() {
        return ((b0<d>)this.G).getValue();
    }
    
    private final k0 x() {
        return this.H.getValue();
    }
    
    private static final void y(final CalendarPeriodTeachingContentFragment calendarPeriodTeachingContentFragment, final View view, final CalendarTeachingContentsResponse calendarTeachingContentsResponse) {
        kotlin.jvm.internal.k0.p(calendarPeriodTeachingContentFragment, "this$0");
        kotlin.jvm.internal.k0.p(view, "$view");
        calendarPeriodTeachingContentFragment.D(view, calendarTeachingContentsResponse);
    }
    
    private static final void z(final CalendarPeriodTeachingContentFragment calendarPeriodTeachingContentFragment, final View view) {
        kotlin.jvm.internal.k0.p(calendarPeriodTeachingContentFragment, "this$0");
        calendarPeriodTeachingContentFragment.onBackPressed();
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @f
    public View onCreateView(@e final LayoutInflater layoutInflater, @f final ViewGroup viewGroup, @f final Bundle bundle) {
        kotlin.jvm.internal.k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131492992, viewGroup, false);
        if (inflate == null) {
            return null;
        }
        final CalendarPeriod d = this.w().d();
        final boolean c = this.x().C(d);
        final boolean b = true;
        if (c) {
            final k0 x = this.x();
            final Context requireContext = this.requireContext();
            kotlin.jvm.internal.k0.o(requireContext, "requireContext()");
            x.k0(requireContext, d);
            final RecyclerView recyclerView = (RecyclerView)inflate.findViewById(2131297243);
            ((ViewGroup)recyclerView).setVisibility(0);
            recyclerView.setAdapter((RecyclerView$h)new com.untis.mobile.calendar.ui.period.teachingcontent.e(null, new l<CalendarTeachingContentDto, j2>() {
                public final void a(@e final CalendarTeachingContentDto calendarTeachingContentDto) {
                    kotlin.jvm.internal.k0.p(calendarTeachingContentDto, "it");
                    CalendarPeriodTeachingContentFragment.this.B(inflate, calendarTeachingContentDto);
                }
            }, 1, null));
        }
        this.x().l0().j(this.getViewLifecycleOwner(), (l0)new com.untis.mobile.calendar.ui.period.teachingcontent.c(this, inflate));
        ((ImageView)inflate.findViewById(com.untis.mobile.c.i.Wh)).setOnClickListener((View$OnClickListener)new com.untis.mobile.calendar.ui.period.teachingcontent.a(this));
        final int xh = com.untis.mobile.c.i.Xh;
        ((ImageView)inflate.findViewById(xh)).setOnClickListener((View$OnClickListener)new b(this, inflate));
        if (x.d(this.w().d())) {
            final int uh = com.untis.mobile.c.i.Uh;
            ((EditText)inflate.findViewById(uh)).setVisibility(0);
            ((TextView)inflate.findViewById(com.untis.mobile.c.i.bi)).setVisibility(8);
            ((EditText)inflate.findViewById(uh)).setText((CharSequence)this.w().d().getTeachingContent());
            final AppCompatEditText appCompatEditText = (AppCompatEditText)inflate.findViewById(uh);
            kotlin.jvm.internal.k0.o(appCompatEditText, "view.calendar_fragment_period_teachingcontent_edit");
            h.A(appCompatEditText, new l<String, j2>() {
                final /* synthetic */ CalendarPeriodTeachingContentFragment I;
                
                public final void invoke(@e final String s) {
                    kotlin.jvm.internal.k0.p(s, "it");
                    if (s.K1(s, d.getTeachingContent(), true)) {
                        final View h = inflate;
                        final int xh = com.untis.mobile.c.i.Xh;
                        ((ImageView)h.findViewById(xh)).setColorFilter(androidx.core.content.d.f(this.I.requireContext(), 2131099992));
                        ((ImageView)inflate.findViewById(xh)).setClickable(false);
                    }
                    else {
                        final View h2 = inflate;
                        final int xh2 = com.untis.mobile.c.i.Xh;
                        ((ImageView)h2.findViewById(xh2)).setColorFilter(androidx.core.content.d.f(this.I.requireContext(), 2131100003));
                        ((ImageView)inflate.findViewById(xh2)).setClickable(true);
                    }
                }
            });
            ((EditText)inflate.findViewById(uh)).requestFocus();
            final Context requireContext2 = this.requireContext();
            kotlin.jvm.internal.k0.o(requireContext2, "requireContext()");
            com.untis.mobile.utils.extension.e.j(requireContext2);
        }
        else {
            ((EditText)inflate.findViewById(com.untis.mobile.c.i.Uh)).setVisibility(8);
            ((ImageView)inflate.findViewById(xh)).setVisibility(8);
            final int bi = com.untis.mobile.c.i.bi;
            ((TextView)inflate.findViewById(bi)).setVisibility(0);
            ((TextView)inflate.findViewById(bi)).setText((CharSequence)this.w().d().getTeachingContent());
        }
        final List<CalendarPeriodAttachment> teachingContentFiles = d.getTeachingContentFiles();
        int n = b ? 1 : 0;
        if (teachingContentFiles != null) {
            if (teachingContentFiles.isEmpty()) {
                n = (b ? 1 : 0);
            }
            else {
                n = 0;
            }
        }
        if (n == 0) {
            ((ImageView)inflate.findViewById(com.untis.mobile.c.i.Th)).setVisibility(0);
            final RecyclerView recyclerView2 = (RecyclerView)inflate.findViewById(com.untis.mobile.c.i.Sh);
            final Context requireContext3 = this.requireContext();
            kotlin.jvm.internal.k0.o(requireContext3, "requireContext()");
            List<CalendarPeriodAttachment> list;
            if ((list = d.getTeachingContentFiles()) == null) {
                list = v.E();
            }
            recyclerView2.setAdapter((RecyclerView$h)new w3.b(requireContext3, list, new l<CalendarPeriodAttachment, j2>() {
                final /* synthetic */ CalendarPeriodTeachingContentFragment G;
                
                public final void a(@e final CalendarPeriodAttachment calendarPeriodAttachment) {
                    kotlin.jvm.internal.k0.p(calendarPeriodAttachment, "it");
                    final Context requireContext = this.G.requireContext();
                    kotlin.jvm.internal.k0.o(requireContext, "requireContext()");
                    x.K(calendarPeriodAttachment, requireContext);
                }
            }));
        }
        this.setOnNetworkChangeListener(new l<Boolean, j2>() {
            public final void invoke(final boolean b) {
                if (b) {
                    CalendarPeriodTeachingContentFragment.this.x().z0();
                }
            }
        });
        return inflate;
    }
}
