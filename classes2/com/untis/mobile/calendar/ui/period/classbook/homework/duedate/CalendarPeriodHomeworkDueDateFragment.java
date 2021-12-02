// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.ui.period.classbook.homework.duedate;

import android.widget.ImageView;
import kotlinx.coroutines.u0;
import kotlin.coroutines.g;
import kotlinx.coroutines.h;
import com.untis.mobile.persistence.models.classbook.homework.HomeWork;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView$h;
import androidx.recyclerview.widget.RecyclerView;
import n6.l;
import java.util.List;
import kotlin.c1;
import android.content.Context;
import kotlin.coroutines.jvm.internal.o;
import kotlin.j2;
import kotlinx.coroutines.r0;
import n6.p;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatImageView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import org.joda.time.t;
import android.app.DatePickerDialog$OnDateSetListener;
import android.app.DatePickerDialog;
import org.joda.time.n0;
import com.untis.mobile.utils.v;
import android.view.View;
import org.joda.time.c;
import android.widget.DatePicker;
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

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J&\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016R\u001d\u0010\u0016\u001a\u00020\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001c\u001a\u00020\u00178B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f" }, d2 = { "Lcom/untis/mobile/calendar/ui/period/classbook/homework/duedate/CalendarPeriodHomeworkDueDateFragment;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "Lorg/joda/time/c;", "dueDate", "Lkotlin/j2;", "C", "Lcom/untis/mobile/calendar/ui/period/classbook/homework/duedate/b;", "adapter", "z", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "Lcom/untis/mobile/calendar/ui/period/k0;", "H", "Lkotlin/b0;", "y", "()Lcom/untis/mobile/calendar/ui/period/k0;", "model", "Lcom/untis/mobile/calendar/ui/period/classbook/homework/duedate/f;", "G", "Landroidx/navigation/m;", "x", "()Lcom/untis/mobile/calendar/ui/period/classbook/homework/duedate/f;", "args", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class CalendarPeriodHomeworkDueDateFragment extends UmFragment
{
    @e
    private final m G;
    @e
    private final b0 H;
    
    public CalendarPeriodHomeworkDueDateFragment() {
        this.G = new m(k1.d(f.class), (a)new a<Bundle>() {
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
    
    private static final void A(final b b, final DatePicker datePicker, final int n, final int n2, final int n3) {
        kotlin.jvm.internal.k0.p(b, "$adapter");
        b.i(new c(n, n2 + 1, n3, 0, 0));
    }
    
    private static final void B(final CalendarPeriodHomeworkDueDateFragment calendarPeriodHomeworkDueDateFragment, final View view) {
        kotlin.jvm.internal.k0.p(calendarPeriodHomeworkDueDateFragment, "this$0");
        calendarPeriodHomeworkDueDateFragment.onBackPressed();
    }
    
    private final void C(final c c) {
        this.y().r0(c);
        this.onBackPressed();
    }
    
    private final f x() {
        return ((b0<f>)this.G).getValue();
    }
    
    private final k0 y() {
        return this.H.getValue();
    }
    
    private final void z(final b b) {
        t t;
        if (((org.joda.time.base.e)(t = v.a.g())).o((n0)this.x().f().getStart().h1())) {
            t = this.x().f().getStart().h1();
            kotlin.jvm.internal.k0.o(t, "args.homework.start.toLocalDate()");
        }
        final DatePickerDialog datePickerDialog = new DatePickerDialog(this.requireContext(), 2131952204, (DatePickerDialog$OnDateSetListener)new com.untis.mobile.calendar.ui.period.classbook.homework.duedate.c(b), t.k2(), t.f3() - 1, t.X3());
        datePickerDialog.getDatePicker().setMinDate(((org.joda.time.base.g)this.x().f().getStart()).n());
        datePickerDialog.show();
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @org.jetbrains.annotations.f
    public View onCreateView(@e final LayoutInflater layoutInflater, @org.jetbrains.annotations.f final ViewGroup viewGroup, @org.jetbrains.annotations.f final Bundle bundle) {
        kotlin.jvm.internal.k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131492983, viewGroup, false);
        if (inflate == null) {
            return null;
        }
        ((ImageView)inflate.findViewById(com.untis.mobile.c.i.Lf)).setOnClickListener((View$OnClickListener)new com.untis.mobile.calendar.ui.period.classbook.homework.duedate.d(this));
        ((ViewGroup)inflate.findViewById(com.untis.mobile.c.i.XD)).setVisibility(0);
        h.f(x0.a((w0)this.y()), (g)null, (u0)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            Object G;
            int H;
            final /* synthetic */ CalendarPeriodHomeworkDueDateFragment I;
            final /* synthetic */ View J;
            
            private static final void p(final CalendarPeriodHomeworkDueDateFragment calendarPeriodHomeworkDueDateFragment, final b b, final View view) {
                calendarPeriodHomeworkDueDateFragment.z(b);
            }
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    Object G;
                    int H;
                    final /* synthetic */ CalendarPeriodHomeworkDueDateFragment I = this.I;
                    final /* synthetic */ View J = this.J;
                    
                    private static final void p(final CalendarPeriodHomeworkDueDateFragment calendarPeriodHomeworkDueDateFragment, final b b, final View view) {
                        calendarPeriodHomeworkDueDateFragment.z(b);
                    }
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((CalendarPeriodHomeworkDueDateFragment$a)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object adapter) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int h2 = this.H;
                Context context;
                Object x;
                if (h2 != 0) {
                    if (h2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    context = (Context)this.G;
                    c1.n(adapter);
                    x = adapter;
                }
                else {
                    c1.n(adapter);
                    final Context requireContext = this.I.requireContext();
                    kotlin.jvm.internal.k0.o(requireContext, "requireContext()");
                    final k0 u = CalendarPeriodHomeworkDueDateFragment.this.y();
                    final HomeWork f = CalendarPeriodHomeworkDueDateFragment.this.x().f();
                    this.G = requireContext;
                    this.H = 1;
                    x = u.X(f, this);
                    if (x == h) {
                        return h;
                    }
                    context = requireContext;
                }
                adapter = new b(context, (List<c>)x, new l<c, j2>() {
                    final /* synthetic */ CalendarPeriodHomeworkDueDateFragment G = CalendarPeriodHomeworkDueDateFragment$a.this.I;
                    
                    public final void a(@org.jetbrains.annotations.e final c c) {
                        kotlin.jvm.internal.k0.p(c, "it");
                        this.G.C(c);
                    }
                });
                ((RecyclerView)this.J.findViewById(com.untis.mobile.c.i.Jf)).setAdapter((RecyclerView$h)adapter);
                ((ViewGroup)this.J.findViewById(com.untis.mobile.c.i.If)).setOnClickListener((View$OnClickListener)new com.untis.mobile.calendar.ui.period.classbook.homework.duedate.e(this.I, (b)adapter));
                ((ViewGroup)this.J.findViewById(com.untis.mobile.c.i.XD)).setVisibility(8);
                return j2.a;
            }
        }, 3, (Object)null);
        return inflate;
    }
}
