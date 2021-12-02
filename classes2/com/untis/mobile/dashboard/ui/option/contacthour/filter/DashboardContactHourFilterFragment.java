// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.ui.option.contacthour.filter;

import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.l0;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatImageView;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import org.joda.time.n0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import android.content.DialogInterface;
import android.widget.DatePicker;
import org.joda.time.t;
import android.content.DialogInterface$OnClickListener;
import com.untis.mobile.utils.v;
import android.app.DatePickerDialog$OnDateSetListener;
import android.app.DatePickerDialog;
import androidx.lifecycle.y;
import kotlinx.coroutines.u0;
import kotlin.coroutines.g;
import kotlinx.coroutines.h;
import com.untis.mobile.utils.extension.q;
import com.untis.mobile.c;
import kotlin.c1;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.j2;
import kotlinx.coroutines.r0;
import n6.p;
import androidx.lifecycle.z;
import java.util.List;
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
import org.jetbrains.annotations.e;
import kotlin.b0;
import kotlin.Metadata;
import com.untis.mobile.ui.fragments.common.UmFragment;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\u0006H\u0002J&\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016R\u001d\u0010\u0016\u001a\u00020\u00128B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019" }, d2 = { "Lcom/untis/mobile/dashboard/ui/option/contacthour/filter/DashboardContactHourFilterFragment;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "Landroid/view/View;", "view", "Lorg/joda/time/t;", "date", "Lkotlin/j2;", "K", "J", "G", "F", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "Lcom/untis/mobile/dashboard/ui/option/contacthour/e;", "Lkotlin/b0;", "z", "()Lcom/untis/mobile/dashboard/ui/option/contacthour/e;", "model", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class DashboardContactHourFilterFragment extends UmFragment
{
    @e
    private final b0 G;
    
    public DashboardContactHourFilterFragment() {
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
    
    private static final void A(final DashboardContactHourFilterFragment dashboardContactHourFilterFragment, final View view) {
        k0.p(dashboardContactHourFilterFragment, "this$0");
        dashboardContactHourFilterFragment.onBackPressed();
    }
    
    private static final void B(final DashboardContactHourFilterFragment dashboardContactHourFilterFragment, final View view) {
        k0.p(dashboardContactHourFilterFragment, "this$0");
        dashboardContactHourFilterFragment.F();
    }
    
    private static final void C(final DashboardContactHourFilterFragment dashboardContactHourFilterFragment, final View view, final View view2) {
        k0.p(dashboardContactHourFilterFragment, "this$0");
        k0.p(view, "$view");
        dashboardContactHourFilterFragment.G(view);
    }
    
    private static final void D(final DashboardContactHourFilterFragment dashboardContactHourFilterFragment, final View view) {
        k0.p(dashboardContactHourFilterFragment, "this$0");
        dashboardContactHourFilterFragment.J();
    }
    
    private static final void E(final DashboardContactHourFilterFragment dashboardContactHourFilterFragment, final View view, final List list) {
        k0.p(dashboardContactHourFilterFragment, "this$0");
        k0.p(view, "$view");
        final y viewLifecycleOwner = dashboardContactHourFilterFragment.getViewLifecycleOwner();
        k0.o(viewLifecycleOwner, "viewLifecycleOwner");
        h.f((r0)z.a(viewLifecycleOwner), (g)null, (u0)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            Object G;
            int H;
            final /* synthetic */ View I;
            final /* synthetic */ DashboardContactHourFilterFragment J;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    Object G;
                    int H;
                    final /* synthetic */ View I = this.I;
                    final /* synthetic */ DashboardContactHourFilterFragment J = this.J;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((DashboardContactHourFilterFragment$b)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                final Object h = b.h();
                final int h2 = this.H;
                AppCompatTextView appCompatTextView;
                Object m;
                if (h2 != 0) {
                    if (h2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    appCompatTextView = (AppCompatTextView)this.G;
                    c1.n(o);
                    m = o;
                }
                else {
                    c1.n(o);
                    ((TextView)this.I.findViewById(c.i.Wp)).setText((CharSequence)DashboardContactHourFilterFragment.this.z().n());
                    final AppCompatTextView g = (AppCompatTextView)this.I.findViewById(c.i.Tp);
                    final com.untis.mobile.dashboard.ui.option.contacthour.e y = DashboardContactHourFilterFragment.this.z();
                    this.G = g;
                    this.H = 1;
                    m = y.m(this);
                    if (m == h) {
                        return h;
                    }
                    appCompatTextView = g;
                }
                ((TextView)appCompatTextView).setText((CharSequence)m);
                final AppCompatTextView appCompatTextView2 = (AppCompatTextView)this.I.findViewById(c.i.Tp);
                k0.o(appCompatTextView2, "view.fragment_dashboard_filter_contacthour_class_title");
                q.e(appCompatTextView2, null, 0, 3, null);
                return j2.a;
            }
        }, 3, (Object)null);
    }
    
    private final void F() {
        this.z().w(this.getErrorHandler());
    }
    
    private final void G(final View view) {
        final t q = this.z().q();
        final DatePickerDialog datePickerDialog = new DatePickerDialog(this.requireContext(), 2131952209, (DatePickerDialog$OnDateSetListener)new com.untis.mobile.dashboard.ui.option.contacthour.filter.a(this, view), q.k2(), q.f3() - 1, q.X3());
        datePickerDialog.getDatePicker().setMinDate(((org.joda.time.base.g)v.a.g().F0()).n());
        datePickerDialog.setButton(-3, (CharSequence)this.getString(2131886789), (DialogInterface$OnClickListener)new com.untis.mobile.dashboard.ui.option.contacthour.filter.b(this, view));
        datePickerDialog.show();
    }
    
    private static final void H(final DashboardContactHourFilterFragment dashboardContactHourFilterFragment, final View view, final DatePicker datePicker, final int n, final int n2, final int n3) {
        k0.p(dashboardContactHourFilterFragment, "this$0");
        k0.p(view, "$view");
        final t t = new t(n, n2 + 1, n3);
        dashboardContactHourFilterFragment.z().y(dashboardContactHourFilterFragment.getErrorHandler(), t);
        dashboardContactHourFilterFragment.K(view, t);
    }
    
    private static final void I(final DashboardContactHourFilterFragment dashboardContactHourFilterFragment, final View view, final DialogInterface dialogInterface, final int n) {
        k0.p(dashboardContactHourFilterFragment, "this$0");
        k0.p(view, "$view");
        final com.untis.mobile.dashboard.ui.option.contacthour.e z = dashboardContactHourFilterFragment.z();
        final CoroutineExceptionHandler errorHandler = dashboardContactHourFilterFragment.getErrorHandler();
        final v a = v.a;
        z.y(errorHandler, a.g());
        dashboardContactHourFilterFragment.K(view, a.g());
    }
    
    private final void J() {
        new DashboardFilterClassSelectionDialog().L(this.getChildFragmentManager(), "dashboard-filter-class-selection");
    }
    
    private final void K(final View view, final t t) {
        final AppCompatTextView appCompatTextView = (AppCompatTextView)view.findViewById(c.i.Wp);
        String text;
        if (((org.joda.time.base.e)t).p((n0)v.a.g())) {
            text = this.getString(2131886789);
        }
        else {
            text = com.untis.mobile.utils.d0.m(t);
        }
        ((TextView)appCompatTextView).setText((CharSequence)text);
    }
    
    private final com.untis.mobile.dashboard.ui.option.contacthour.e z() {
        return this.G.getValue();
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @org.jetbrains.annotations.f
    public View onCreateView(@e final LayoutInflater layoutInflater, @org.jetbrains.annotations.f final ViewGroup viewGroup, @org.jetbrains.annotations.f final Bundle bundle) {
        k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131493096, viewGroup, false);
        if (inflate == null) {
            return null;
        }
        ((ImageView)inflate.findViewById(c.i.Yp)).setOnClickListener((View$OnClickListener)new com.untis.mobile.dashboard.ui.option.contacthour.filter.c(this));
        ((TextView)inflate.findViewById(c.i.Zp)).setOnClickListener((View$OnClickListener)new com.untis.mobile.dashboard.ui.option.contacthour.filter.e(this));
        ((FrameLayout)inflate.findViewById(c.i.Vp)).setVisibility(0);
        ((FrameLayout)inflate.findViewById(c.i.Sp)).setVisibility(0);
        this.K(inflate, this.z().q());
        final y viewLifecycleOwner = this.getViewLifecycleOwner();
        k0.o(viewLifecycleOwner, "viewLifecycleOwner");
        h.f((r0)z.a(viewLifecycleOwner), (g)null, (u0)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            Object G;
            int H;
            final /* synthetic */ View I;
            final /* synthetic */ DashboardContactHourFilterFragment J;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    Object G;
                    int H;
                    final /* synthetic */ View I = this.I;
                    final /* synthetic */ DashboardContactHourFilterFragment J = this.J;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((DashboardContactHourFilterFragment$a)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                final Object h = b.h();
                final int h2 = this.H;
                AppCompatTextView appCompatTextView;
                Object m;
                if (h2 != 0) {
                    if (h2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    appCompatTextView = (AppCompatTextView)this.G;
                    c1.n(o);
                    m = o;
                }
                else {
                    c1.n(o);
                    ((TextView)this.I.findViewById(c.i.Wp)).setText((CharSequence)DashboardContactHourFilterFragment.this.z().n());
                    final AppCompatTextView g = (AppCompatTextView)this.I.findViewById(c.i.Tp);
                    final com.untis.mobile.dashboard.ui.option.contacthour.e y = DashboardContactHourFilterFragment.this.z();
                    this.G = g;
                    this.H = 1;
                    m = y.m(this);
                    if (m == h) {
                        return h;
                    }
                    appCompatTextView = g;
                }
                ((TextView)appCompatTextView).setText((CharSequence)m);
                final AppCompatTextView appCompatTextView2 = (AppCompatTextView)this.I.findViewById(c.i.Tp);
                k0.o(appCompatTextView2, "view.fragment_dashboard_filter_contacthour_class_title");
                q.e(appCompatTextView2, null, 0, 3, null);
                return j2.a;
            }
        }, 3, (Object)null);
        ((ViewGroup)inflate.findViewById(c.i.Up)).setOnClickListener((View$OnClickListener)new com.untis.mobile.dashboard.ui.option.contacthour.filter.f(this, inflate));
        ((ViewGroup)inflate.findViewById(c.i.Rp)).setOnClickListener((View$OnClickListener)new com.untis.mobile.dashboard.ui.option.contacthour.filter.d(this));
        this.z().r().j(this.getViewLifecycleOwner(), (l0)new com.untis.mobile.dashboard.ui.option.contacthour.filter.g(this, inflate));
        return inflate;
    }
}
