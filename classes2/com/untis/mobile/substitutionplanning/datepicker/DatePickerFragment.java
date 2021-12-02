// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.datepicker;

import android.widget.TextView;
import com.untis.mobile.utils.d0;
import kotlin.jvm.internal.m0;
import kotlin.j2;
import n6.l;
import org.joda.time.l0;
import org.joda.time.r;
import android.view.ViewGroup$LayoutParams;
import android.os.Bundle;
import rx.g;
import rx.android.schedulers.a;
import com.untis.mobile.utils.g0;
import android.graphics.drawable.Drawable;
import androidx.core.content.d;
import android.os.Build$VERSION;
import android.view.View$OnClickListener;
import android.content.Context;
import com.untis.mobile.utils.extension.h;
import java.util.Iterator;
import kotlin.ranges.k;
import kotlin.collections.t0;
import java.util.ArrayList;
import kotlin.ranges.o;
import com.untis.mobile.c;
import android.widget.LinearLayout;
import com.untis.mobile.substitutionplanning.model.DayStateDto;
import java.util.List;
import kotlin.jvm.internal.k0;
import com.untis.mobile.utils.v;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.Objects;
import org.joda.time.t;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout$LayoutParams;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.fragments.common.UmFragment;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 02\u00020\u0001:\u00011B\u0007¢\u0006\u0004\b.\u0010/J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u000b\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u000f\u001a\u00020\rH\u0002J\"\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\tH\u0002J\u0018\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0012\u0010\u001b\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J&\u0010\u001c\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J\u000e\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0002J\u0010\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0019H\u0016J\u0010\u0010\"\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 H\u0016J\u0006\u0010#\u001a\u00020\u0007R\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010\u001dR\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u001dR\u0018\u0010*\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010)R\u0016\u0010+\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001dR\u0016\u0010-\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010\u001d¨\u00062" }, d2 = { "Lcom/untis/mobile/substitutionplanning/datepicker/DatePickerFragment;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "Landroid/view/View;", "root", "", "Lcom/untis/mobile/substitutionplanning/model/DayStateDto;", "dayStates", "Lkotlin/j2;", "H", "Lorg/joda/time/t;", "F", "E", "C", "Landroid/widget/LinearLayout$LayoutParams;", "B", "A", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "date", "D", "Landroidx/appcompat/widget/AppCompatTextView;", "view", "y", "Landroid/os/Bundle;", "save", "onCreate", "onCreateView", "I", "outState", "onSaveInstanceState", "Landroid/content/Context;", "context", "onAttach", "G", "", "K", "openColor", "position", "Lcom/untis/mobile/substitutionplanning/datepicker/b;", "Lcom/untis/mobile/substitutionplanning/datepicker/b;", "delegate", "doneColor", "J", "weekendColor", "<init>", "()V", "L", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class DatePickerFragment extends UmFragment
{
    @e
    public static final a L;
    @e
    private static final String M = "a";
    private int G;
    @f
    private com.untis.mobile.substitutionplanning.datepicker.b H;
    private int I;
    private int J;
    private int K;
    
    static {
        L = new a(null);
    }
    
    public DatePickerFragment() {
        this.G = 50;
        this.I = -12303292;
        this.J = -12303292;
        this.K = -12303292;
    }
    
    private final LinearLayout$LayoutParams A() {
        return new LinearLayout$LayoutParams(-2, -2);
    }
    
    private final LinearLayout$LayoutParams B() {
        final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams(0, -2);
        linearLayout$LayoutParams.weight = 1.0f;
        return linearLayout$LayoutParams;
    }
    
    private final View C() {
        return new View(this.getContext());
    }
    
    private final View D(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final t t) {
        final View inflate = layoutInflater.inflate(2131493195, viewGroup, false);
        Objects.requireNonNull(inflate, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatTextView");
        final AppCompatTextView appCompatTextView = (AppCompatTextView)inflate;
        ((TextView)appCompatTextView).setTag((Object)t.toString());
        this.y(t, appCompatTextView);
        return (View)appCompatTextView;
    }
    
    private final t E() {
        final com.untis.mobile.substitutionplanning.datepicker.b h = this.H;
        t c;
        if (h == null) {
            c = null;
        }
        else {
            c = h.c(this.G);
        }
        t l0 = c;
        if (c == null) {
            l0 = v.a.g().l0(6);
            k0.o(l0, "Date.today().plusDays(6)");
        }
        return l0;
    }
    
    private final t F() {
        final com.untis.mobile.substitutionplanning.datepicker.b h = this.H;
        t a;
        if (h == null) {
            a = null;
        }
        else {
            a = h.a(this.G);
        }
        t g = a;
        if (a == null) {
            g = v.a.g();
        }
        return g;
    }
    
    private final void H(final View view, final List<DayStateDto> list) {
        if (list.isEmpty()) {
            return;
        }
        final int childCount = ((LinearLayout)view.findViewById(c.i.Kx)).getChildCount();
        int n = 0;
        final k n2 = o.n1(0, childCount);
        final ArrayList list2 = new ArrayList<View>(kotlin.collections.v.Y((Iterable<?>)n2, 10));
        final Iterator<? extends T> iterator = ((Iterable<? extends T>)n2).iterator();
        while (iterator.hasNext()) {
            list2.add(((LinearLayout)view.findViewById(c.i.Kx)).getChildAt(((t0)iterator).b()));
        }
        for (final AppCompatTextView next : kotlin.collections.v.c1(list2, AppCompatTextView.class)) {
            if (n < 0) {
                kotlin.collections.v.W();
            }
            final AppCompatTextView appCompatTextView = next;
            if (n >= list.size()) {
                return;
            }
            final DayStateDto dayStateDto = list.get(n);
            if (!k0.g(dayStateDto.getDisplayName(), appCompatTextView.getText())) {
                ((TextView)appCompatTextView).setText((CharSequence)dayStateDto.getDisplayName());
            }
            final DayStateDto.StateEnum state = dayStateDto.getState();
            int n3;
            if (state == null) {
                n3 = -1;
            }
            else {
                n3 = b.a[state.ordinal()];
            }
            int textColor;
            if (n3 != 1) {
                if (n3 != 2) {
                    textColor = this.I;
                }
                else {
                    textColor = this.J;
                }
            }
            else {
                textColor = this.K;
            }
            ((TextView)appCompatTextView).setTextColor(textColor);
            ++n;
        }
    }
    
    private static final void J(final DatePickerFragment datePickerFragment, final View view, final List list) {
        k0.p(datePickerFragment, "this$0");
        k0.p(view, "$view");
        k0.o(list, "it");
        datePickerFragment.H(view, list);
    }
    
    private static final void K(final DatePickerFragment datePickerFragment, final Throwable t) {
        k0.p(datePickerFragment, "this$0");
        final Context context = datePickerFragment.getContext();
        if (context != null) {
            k0.o(t, "it");
            h.l(context, t);
        }
    }
    
    private final void y(final t t, final AppCompatTextView appCompatTextView) {
        ((TextView)appCompatTextView).setText((CharSequence)t.g4("d"));
        final com.untis.mobile.substitutionplanning.datepicker.b h = this.H;
        if (h != null) {
            ((TextView)appCompatTextView).setOnClickListener((View$OnClickListener)new com.untis.mobile.substitutionplanning.datepicker.c(h, t));
            ((TextView)appCompatTextView).setFocusable(true);
            ((TextView)appCompatTextView).setClickable(true);
            if (Build$VERSION.SDK_INT >= 23) {
                ((TextView)appCompatTextView).setForeground(d.i(((TextView)appCompatTextView).getContext(), 2131231047));
            }
            Drawable i;
            if (h.d(t)) {
                i = d.i(((TextView)appCompatTextView).getContext(), 2131230812);
            }
            else {
                i = null;
            }
            ((TextView)appCompatTextView).setBackground(i);
        }
    }
    
    private static final void z(final com.untis.mobile.substitutionplanning.datepicker.b b, final t t, final View view) {
        k0.p(b, "$delegate");
        k0.p(t, "$date");
        b.b(t);
    }
    
    public final void G() {
        final Context context = this.getContext();
        if (context == null) {
            return;
        }
        final View view = this.getView();
        if (view == null) {
            return;
        }
        final com.untis.mobile.substitutionplanning.datepicker.b h = this.H;
        if (h == null) {
            return;
        }
        final k n1 = o.n1(0, ((LinearLayout)view.findViewById(c.i.Kx)).getChildCount());
        final ArrayList list = new ArrayList<View>(kotlin.collections.v.Y((Iterable<?>)n1, 10));
        final Iterator<? extends T> iterator = ((Iterable<? extends T>)n1).iterator();
        while (iterator.hasNext()) {
            list.add(((LinearLayout)view.findViewById(c.i.Kx)).getChildAt(((t0)iterator).b()));
        }
        for (final AppCompatTextView appCompatTextView : kotlin.collections.v.c1(list, AppCompatTextView.class)) {
            final Object tag = ((TextView)appCompatTextView).getTag();
            Objects.requireNonNull(tag, "null cannot be cast to non-null type kotlin.String");
            final t c0 = t.c0((String)tag);
            k0.o(c0, "textViewDate");
            Drawable i;
            if (h.d(c0)) {
                i = d.i(context, 2131230812);
            }
            else {
                i = null;
            }
            ((TextView)appCompatTextView).setBackground(i);
        }
    }
    
    public final void I(@e final View view) {
        k0.p(view, "view");
        if (!g0.a(this.getContext())) {
            return;
        }
        final com.untis.mobile.substitutionplanning.datepicker.b h = this.H;
        if (h != null) {
            final g<List<DayStateDto>> e = h.e(this.G);
            if (e != null) {
                final g q3 = e.Q3(rx.android.schedulers.a.c());
                if (q3 != null) {
                    q3.C5((rx.functions.b)new com.untis.mobile.substitutionplanning.datepicker.e(this, view), (rx.functions.b)new com.untis.mobile.substitutionplanning.datepicker.d(this));
                }
            }
        }
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    public void onAttach(@e final Context context) {
        k0.p(context, "context");
        super.onAttach(context);
        com.untis.mobile.substitutionplanning.datepicker.b h;
        if (context instanceof com.untis.mobile.substitutionplanning.datepicker.b) {
            h = (com.untis.mobile.substitutionplanning.datepicker.b)context;
        }
        else {
            h = null;
        }
        this.H = h;
    }
    
    public void onCreate(@f final Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = bundle;
        if (bundle == null) {
            arguments = this.getArguments();
        }
        Integer value;
        if (arguments == null) {
            value = null;
        }
        else {
            value = arguments.getInt("a");
        }
        int g;
        if (value == null) {
            g = this.G;
        }
        else {
            g = value;
        }
        this.G = g;
        Object o;
        if ((o = this.getContext()) == null && (o = this.getActivity()) == null) {
            return;
        }
        this.I = d.f((Context)o, 2131099941);
        this.J = d.f((Context)o, 2131099944);
        this.K = d.f((Context)o, 2131099946);
    }
    
    @f
    public View onCreateView(@e final LayoutInflater layoutInflater, @f final ViewGroup viewGroup, @f final Bundle bundle) {
        k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131493194, viewGroup, false);
        if (inflate == null) {
            return null;
        }
        ((LinearLayout)inflate.findViewById(c.i.Kx)).addView(this.C(), (ViewGroup$LayoutParams)this.B());
        d0.a(new r((l0)this.F().F0(), (l0)this.E().F0()), new l<t, j2>() {
            public final void a(@e final org.joda.time.t t) {
                k0.p(t, "date");
                final View g = inflate;
                final int kx = c.i.Kx;
                ((LinearLayout)g.findViewById(kx)).addView(DatePickerFragment.this.D(layoutInflater, viewGroup, t), (ViewGroup$LayoutParams)DatePickerFragment.this.A());
                ((LinearLayout)inflate.findViewById(kx)).addView(DatePickerFragment.this.C(), (ViewGroup$LayoutParams)DatePickerFragment.this.B());
            }
        });
        this.I(inflate);
        return inflate;
    }
    
    public void onSaveInstanceState(@e final Bundle bundle) {
        k0.p(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putInt("a", this.G);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b" }, d2 = { "com/untis/mobile/substitutionplanning/datepicker/DatePickerFragment$a", "", "", "position", "Lcom/untis/mobile/substitutionplanning/datepicker/DatePickerFragment;", "a", "", "BUNDLE_POSITION", "Ljava/lang/String;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final DatePickerFragment a(final int n) {
            final DatePickerFragment datePickerFragment = new DatePickerFragment();
            final Bundle arguments = new Bundle();
            arguments.putInt("a", n);
            datePickerFragment.setArguments(arguments);
            return datePickerFragment;
        }
    }
}
