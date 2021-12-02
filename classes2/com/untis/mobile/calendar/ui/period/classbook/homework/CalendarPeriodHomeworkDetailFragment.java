// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.ui.period.classbook.homework;

import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import kotlin.text.s;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.RecyclerView$h;
import android.content.Context;
import com.untis.mobile.calendar.ui.period.x;
import androidx.recyclerview.widget.RecyclerView;
import com.untis.mobile.persistence.models.classbook.homework.HomeWorkStatus;
import android.widget.CompoundButton$OnCheckedChangeListener;
import androidx.appcompat.widget.SwitchCompat;
import androidx.lifecycle.l0;
import androidx.appcompat.widget.AppCompatEditText;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.untis.mobile.persistence.models.classbook.homework.HomeWork;
import kotlinx.coroutines.u0;
import kotlin.coroutines.g;
import kotlinx.coroutines.h;
import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlinx.coroutines.r0;
import n6.p;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import kotlinx.coroutines.k2;
import kotlin.j2;
import com.untis.mobile.c;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.View;
import java.util.Iterator;
import com.untis.mobile.persistence.models.drive.DriveAttachment;
import java.util.ArrayList;
import kotlin.collections.v;
import com.untis.mobile.calendar.network.model.period.update.CalendarPeriodAttachment;
import java.util.List;
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

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b,\u0010-J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016J&\u0010\u0019\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001aH\u0014R\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001eR\u001d\u0010%\u001a\u00020 8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010+\u001a\u00020&8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006." }, d2 = { "Lcom/untis/mobile/calendar/ui/period/classbook/homework/CalendarPeriodHomeworkDetailFragment;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "Landroid/view/View;", "view", "Lcom/untis/mobile/persistence/models/classbook/homework/HomeWork;", "homework", "Lkotlin/j2;", "M", "N", "", "Lcom/untis/mobile/calendar/network/model/period/update/CalendarPeriodAttachment;", "D", "Lkotlinx/coroutines/k2;", "K", "J", "L", "", "U", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "", "throwable", "beforeErrorHandler", "", "I", "doneColor", "Lcom/untis/mobile/calendar/ui/period/k0;", "H", "Lkotlin/b0;", "F", "()Lcom/untis/mobile/calendar/ui/period/k0;", "model", "Lcom/untis/mobile/calendar/ui/period/classbook/homework/l;", "G", "Landroidx/navigation/m;", "E", "()Lcom/untis/mobile/calendar/ui/period/classbook/homework/l;", "args", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class CalendarPeriodHomeworkDetailFragment extends UmFragment
{
    @e
    private final m G;
    @e
    private final b0 H;
    private int I;
    
    public CalendarPeriodHomeworkDetailFragment() {
        this.G = new m(k1.d(l.class), (a)new a<Bundle>() {
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
    
    public static final /* synthetic */ int B(final CalendarPeriodHomeworkDetailFragment calendarPeriodHomeworkDetailFragment) {
        return calendarPeriodHomeworkDetailFragment.I;
    }
    
    private final List<CalendarPeriodAttachment> D() {
        final List<DriveAttachment> driveAttachments = this.E().g().getDriveAttachments();
        final ArrayList list = new ArrayList<CalendarPeriodAttachment>(v.Y((Iterable<?>)driveAttachments, 10));
        for (final DriveAttachment driveAttachment : driveAttachments) {
            list.add(new CalendarPeriodAttachment(driveAttachment.getUrl(), String.valueOf(driveAttachment.getId()), driveAttachment.getName()));
        }
        return (List<CalendarPeriodAttachment>)list;
    }
    
    private final l E() {
        return ((b0<l>)this.G).getValue();
    }
    
    private final k0 F() {
        return this.H.getValue();
    }
    
    private static final void G(final CalendarPeriodHomeworkDetailFragment calendarPeriodHomeworkDetailFragment, final View view) {
        kotlin.jvm.internal.k0.p(calendarPeriodHomeworkDetailFragment, "this$0");
        calendarPeriodHomeworkDetailFragment.onBackPressed();
    }
    
    private static final void H(final CalendarPeriodHomeworkDetailFragment calendarPeriodHomeworkDetailFragment, final View view, final View view2) {
        kotlin.jvm.internal.k0.p(calendarPeriodHomeworkDetailFragment, "this$0");
        kotlin.jvm.internal.k0.p(view, "$view");
        calendarPeriodHomeworkDetailFragment.J(view);
    }
    
    private static final void I(final CalendarPeriodHomeworkDetailFragment calendarPeriodHomeworkDetailFragment, final View view, final View view2) {
        kotlin.jvm.internal.k0.p(calendarPeriodHomeworkDetailFragment, "this$0");
        kotlin.jvm.internal.k0.p(view, "$view");
        calendarPeriodHomeworkDetailFragment.L(view);
    }
    
    private final void J(final View view) {
        ((ViewGroup)view.findViewById(c.i.XD)).setVisibility(0);
        this.F().D(this.getErrorHandler(), this.E().g(), new a<j2>() {
            public final void invoke() {
                UmFragment.this.onBackPressed();
            }
        });
    }
    
    private final k2 K(final View view) {
        return h.f(x0.a((w0)this.F()), (g)this.getErrorHandler(), (u0)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            int G;
            final /* synthetic */ CalendarPeriodHomeworkDetailFragment H;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ CalendarPeriodHomeworkDetailFragment H = this.H;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((CalendarPeriodHomeworkDetailFragment$b)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                b.h();
                if (this.G == 0) {
                    c1.n(o);
                    androidx.navigation.fragment.c.a((Fragment)this.H).D(com.untis.mobile.calendar.ui.period.classbook.homework.m.a.a(CalendarPeriodHomeworkDetailFragment.this.E().g(), CalendarPeriodHomeworkDetailFragment.this.E().f()));
                    return j2.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }, 2, (Object)null);
    }
    
    private final void L(final View view) {
        if (!this.U(view)) {
            return;
        }
        ((ViewGroup)view.findViewById(c.i.XD)).setVisibility(0);
        this.F().u0(this.getErrorHandler(), this.E().g(), new a<j2>() {
            public final void invoke() {
                UmFragment.this.onBackPressed();
            }
        });
    }
    
    private final void M(final View view, final HomeWork homeWork) {
        if (homeWork.getId() == 0L) {
            ((TextView)view.findViewById(c.i.Cf)).setText(2131886286);
            ((ImageView)view.findViewById(c.i.Af)).setVisibility(8);
        }
        else {
            ((TextView)view.findViewById(c.i.Cf)).setText(2131886295);
        }
    }
    
    private final void N(final View view, final HomeWork homeWork) {
        ((ViewGroup)view.findViewById(c.i.Gf)).setOnClickListener((View$OnClickListener)new com.untis.mobile.calendar.ui.period.classbook.homework.e(view, this));
        final int hf = c.i.Hf;
        ((EditText)view.findViewById(hf)).setText((CharSequence)this.E().g().getText());
        final AppCompatEditText appCompatEditText = (AppCompatEditText)view.findViewById(hf);
        kotlin.jvm.internal.k0.o(appCompatEditText, "view.calendar_fragment_period_homework_detail_text_edit");
        com.untis.mobile.utils.extension.h.A(appCompatEditText, new n6.l<String, j2>() {
            final /* synthetic */ CalendarPeriodHomeworkDetailFragment G;
            
            public final void invoke(@e final String text) {
                kotlin.jvm.internal.k0.p(text, "it");
                CalendarPeriodHomeworkDetailFragment.this.E().g().setText(text);
                ((ImageView)view.findViewById(c.i.Bf)).setColorFilter(CalendarPeriodHomeworkDetailFragment.B(this.G));
            }
        });
        ((EditText)view.findViewById(hf)).setEnabled(this.E().h() ^ true);
        final int df = c.i.Df;
        ((ViewGroup)view.findViewById(df)).setOnClickListener((View$OnClickListener)new com.untis.mobile.calendar.ui.period.classbook.homework.c(view, this));
        final int ef = c.i.Ef;
        ((EditText)view.findViewById(ef)).setText((CharSequence)this.E().g().getRemark());
        final AppCompatEditText appCompatEditText2 = (AppCompatEditText)view.findViewById(ef);
        kotlin.jvm.internal.k0.o(appCompatEditText2, "view.calendar_fragment_period_homework_detail_remark_edit");
        com.untis.mobile.utils.extension.h.A(appCompatEditText2, new n6.l<String, j2>() {
            final /* synthetic */ CalendarPeriodHomeworkDetailFragment G;
            
            public final void invoke(@e final String remark) {
                kotlin.jvm.internal.k0.p(remark, "it");
                CalendarPeriodHomeworkDetailFragment.this.E().g().setRemark(remark);
                ((ImageView)view.findViewById(c.i.Bf)).setColorFilter(CalendarPeriodHomeworkDetailFragment.B(this.G));
            }
        });
        ((EditText)view.findViewById(ef)).setEnabled(this.E().h() ^ true);
        ((ViewGroup)view.findViewById(df)).setVisibility(com.untis.mobile.utils.extension.h.U(this.F().e0(this.E().g(), this.E().h()), 0, 1, null));
        ((ViewGroup)view.findViewById(c.i.Ff)).setVisibility(com.untis.mobile.utils.extension.h.U(this.E().g().getLocal() ^ true, 0, 1, null));
        if (!this.E().h()) {
            ((ViewGroup)view.findViewById(c.i.wf)).setOnClickListener((View$OnClickListener)new com.untis.mobile.calendar.ui.period.classbook.homework.g(this, view));
        }
        else {
            ((ViewGroup)view.findViewById(c.i.wf)).setOnClickListener((View$OnClickListener)null);
        }
        this.F().W().j(this.getViewLifecycleOwner(), (l0)new k(this, view));
        final int vf = c.i.vf;
        ((SwitchCompat)view.findViewById(vf)).setChecked(this.E().g().getCompletedStatus());
        ((ViewGroup)view.findViewById(c.i.tf)).setOnClickListener((View$OnClickListener)new com.untis.mobile.calendar.ui.period.classbook.homework.d(view, this));
        ((CompoundButton)view.findViewById(vf)).setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)new j(this, view, homeWork));
        ((TextView)view.findViewById(c.i.uf)).setVisibility(com.untis.mobile.utils.extension.h.U(homeWork.getStatus() != HomeWorkStatus.NO_STATEMENT, 0, 1, null));
        ((ImageView)view.findViewById(c.i.sf)).setVisibility(com.untis.mobile.utils.extension.h.U(homeWork.getDriveAttachments().isEmpty() ^ true, 0, 1, null));
        final RecyclerView recyclerView = (RecyclerView)view.findViewById(c.i.rf);
        final Context requireContext = this.requireContext();
        kotlin.jvm.internal.k0.o(requireContext, "requireContext()");
        recyclerView.setAdapter((RecyclerView$h)new w3.b(requireContext, this.D(), new n6.l<CalendarPeriodAttachment, j2>() {
            final /* synthetic */ CalendarPeriodHomeworkDetailFragment G;
            
            public final void a(@e final CalendarPeriodAttachment calendarPeriodAttachment) {
                kotlin.jvm.internal.k0.p(calendarPeriodAttachment, "it");
                final Context requireContext = this.G.requireContext();
                kotlin.jvm.internal.k0.o(requireContext, "requireContext()");
                x.K(calendarPeriodAttachment, requireContext);
            }
        }));
    }
    
    private static final void O(final View view, final CalendarPeriodHomeworkDetailFragment calendarPeriodHomeworkDetailFragment, final View view2) {
        kotlin.jvm.internal.k0.p(view, "$view");
        kotlin.jvm.internal.k0.p(calendarPeriodHomeworkDetailFragment, "this$0");
        final int hf = c.i.Hf;
        ((EditText)view.findViewById(hf)).requestFocus();
        calendarPeriodHomeworkDetailFragment.showKeyboard(view.findViewById(hf));
    }
    
    private static final void P(final View view, final CalendarPeriodHomeworkDetailFragment calendarPeriodHomeworkDetailFragment, final View view2) {
        kotlin.jvm.internal.k0.p(view, "$view");
        kotlin.jvm.internal.k0.p(calendarPeriodHomeworkDetailFragment, "this$0");
        final int ef = c.i.Ef;
        ((EditText)view.findViewById(ef)).requestFocus();
        calendarPeriodHomeworkDetailFragment.showKeyboard(view.findViewById(ef));
    }
    
    private static final void Q(final CalendarPeriodHomeworkDetailFragment calendarPeriodHomeworkDetailFragment, final View view, final View view2) {
        kotlin.jvm.internal.k0.p(calendarPeriodHomeworkDetailFragment, "this$0");
        kotlin.jvm.internal.k0.p(view, "$view");
        calendarPeriodHomeworkDetailFragment.K(view);
    }
    
    private static final void R(final CalendarPeriodHomeworkDetailFragment calendarPeriodHomeworkDetailFragment, final View view, final org.joda.time.c end) {
        kotlin.jvm.internal.k0.p(calendarPeriodHomeworkDetailFragment, "this$0");
        kotlin.jvm.internal.k0.p(view, "$view");
        if (!((org.joda.time.base.c)calendarPeriodHomeworkDetailFragment.E().g().getEnd()).X4((org.joda.time.l0)end)) {
            ((ImageView)view.findViewById(c.i.Bf)).setColorFilter(calendarPeriodHomeworkDetailFragment.I);
        }
        final HomeWork g = calendarPeriodHomeworkDetailFragment.E().g();
        kotlin.jvm.internal.k0.o(end, "it");
        g.setEnd(end);
        ((TextView)view.findViewById(c.i.xf)).setText((CharSequence)com.untis.mobile.utils.d0.l(end));
    }
    
    private static final void S(final View view, final CalendarPeriodHomeworkDetailFragment calendarPeriodHomeworkDetailFragment, final View view2) {
        kotlin.jvm.internal.k0.p(view, "$view");
        kotlin.jvm.internal.k0.p(calendarPeriodHomeworkDetailFragment, "this$0");
        ((SwitchCompat)view.findViewById(c.i.vf)).setChecked(calendarPeriodHomeworkDetailFragment.E().g().getCompletedStatus() ^ true);
    }
    
    private static final void T(final CalendarPeriodHomeworkDetailFragment calendarPeriodHomeworkDetailFragment, final View view, final HomeWork homeWork, final CompoundButton compoundButton, final boolean completed) {
        kotlin.jvm.internal.k0.p(calendarPeriodHomeworkDetailFragment, "this$0");
        kotlin.jvm.internal.k0.p(view, "$view");
        kotlin.jvm.internal.k0.p(homeWork, "$homework");
        if (calendarPeriodHomeworkDetailFragment.E().h()) {
            calendarPeriodHomeworkDetailFragment.F().n0(calendarPeriodHomeworkDetailFragment.E().g(), completed);
            ((TextView)view.findViewById(c.i.uf)).setVisibility(com.untis.mobile.utils.extension.h.U(homeWork.getStatus() != HomeWorkStatus.NO_STATEMENT, 0, 1, null));
        }
        else {
            calendarPeriodHomeworkDetailFragment.E().g().setCompleted(completed);
            ((ImageView)view.findViewById(c.i.Bf)).setColorFilter(calendarPeriodHomeworkDetailFragment.I);
        }
    }
    
    private final boolean U(final View view) {
        if (s.U1((CharSequence)this.E().g().getText())) {
            ((EditText)view.findViewById(c.i.Hf)).setError((CharSequence)"#must not be blank");
            return false;
        }
        return true;
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @Override
    protected boolean beforeErrorHandler(@e final Throwable t) {
        kotlin.jvm.internal.k0.p(t, "throwable");
        final View view = this.getView();
        Object o;
        if (view == null) {
            o = null;
        }
        else {
            o = view.findViewById(c.i.XD);
        }
        if (o != null) {
            ((ViewGroup)o).setVisibility(8);
        }
        return super.beforeErrorHandler(t);
    }
    
    public void onCreate(@org.jetbrains.annotations.f final Bundle bundle) {
        super.onCreate(bundle);
        this.I = androidx.core.content.d.f(this.requireContext(), 2131100003);
        this.F().r0(this.E().g().getEnd());
    }
    
    @org.jetbrains.annotations.f
    public View onCreateView(@e final LayoutInflater layoutInflater, @org.jetbrains.annotations.f final ViewGroup viewGroup, @org.jetbrains.annotations.f final Bundle bundle) {
        kotlin.jvm.internal.k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131492982, viewGroup, false);
        if (inflate == null) {
            return null;
        }
        ((ImageView)inflate.findViewById(c.i.zf)).setOnClickListener((View$OnClickListener)new com.untis.mobile.calendar.ui.period.classbook.homework.f(this));
        final int af = c.i.Af;
        ((ImageView)inflate.findViewById(af)).setOnClickListener((View$OnClickListener)new com.untis.mobile.calendar.ui.period.classbook.homework.h(this, inflate));
        ((ImageView)inflate.findViewById(af)).setVisibility(com.untis.mobile.utils.extension.h.U(this.E().h() ^ true, 0, 1, null));
        final int bf = c.i.Bf;
        ((ImageView)inflate.findViewById(bf)).setOnClickListener((View$OnClickListener)new i(this, inflate));
        ((ImageView)inflate.findViewById(bf)).setVisibility(com.untis.mobile.utils.extension.h.U(this.E().h() ^ true, 0, 1, null));
        this.M(inflate, this.E().g());
        this.N(inflate, this.E().g());
        return inflate;
    }
}
