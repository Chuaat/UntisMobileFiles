// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.core.timetable;

import android.widget.EditText;
import android.widget.ImageView;
import androidx.lifecycle.l0;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.os.Bundle;
import android.widget.TextView;
import kotlin.j2;
import n6.l;
import androidx.recyclerview.widget.RecyclerView$h;
import androidx.recyclerview.widget.RecyclerView;
import com.untis.mobile.persistence.models.DisplayableEntity;
import java.util.List;
import android.content.Context;
import com.untis.mobile.persistence.models.timetable.TimeTableEntity;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatEditText;
import kotlin.jvm.internal.k0;
import android.view.View$OnClickListener;
import com.untis.mobile.utils.extension.h;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.d;
import com.untis.mobile.c;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.AppCompatTextView;
import android.view.View;
import kotlin.d0;
import org.koin.androidx.viewmodel.ext.android.b;
import kotlin.jvm.internal.k1;
import androidx.lifecycle.y;
import kotlin.jvm.internal.m0;
import n6.a;
import org.jetbrains.annotations.e;
import kotlin.b0;
import kotlin.Metadata;
import com.untis.mobile.ui.fragments.common.UmFragment;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0012\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J&\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016R\u001d\u0010\u001a\u001a\u00020\u00158B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d" }, d2 = { "Lcom/untis/mobile/ui/core/timetable/CoreTimetableFragment;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "Landroid/view/View;", "view", "Lcom/untis/mobile/ui/core/timetable/e;", "data", "Lkotlin/j2;", "A", "B", "z", "Lcom/untis/mobile/persistence/models/timetable/TimeTableEntity;", "timeTableEntity", "w", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "Lcom/untis/mobile/ui/core/timetable/f;", "G", "Lkotlin/b0;", "x", "()Lcom/untis/mobile/ui/core/timetable/f;", "viewModel", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class CoreTimetableFragment extends UmFragment
{
    @e
    private final b0 G;
    
    public CoreTimetableFragment() {
        this.G = d0.c((a<?>)new a<f>() {
            final /* synthetic */ y G;
            
            @e
            @Override
            public final f invoke() {
                return (f)b.b(this.G, k1.d(f.class), null, null);
            }
        });
    }
    
    private final void A(final View view, final com.untis.mobile.ui.core.timetable.e e) {
        if (e == null) {
            return;
        }
        ((TextView)view.findViewById(2131297360)).setText((CharSequence)e.c());
        this.B(view, e);
    }
    
    private final void B(final View view, final com.untis.mobile.ui.core.timetable.e e) {
        ((ViewGroup)view.findViewById(c.i.dk)).setBackgroundColor(d.f(this.requireContext(), 2131100020));
        final AppCompatImageView appCompatImageView = (AppCompatImageView)view.findViewById(c.i.Xj);
        ((ImageView)appCompatImageView).setVisibility(h.U(e.d(), 0, 1, null));
        ((ImageView)appCompatImageView).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.core.timetable.c(this, view, e));
        ((ImageView)view.findViewById(c.i.ek)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.core.timetable.b(view, this));
        ((ImageView)view.findViewById(c.i.fk)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.core.timetable.a(view));
    }
    
    private static final void C(final CoreTimetableFragment coreTimetableFragment, final View view, final com.untis.mobile.ui.core.timetable.e e, final View view2) {
        k0.p(coreTimetableFragment, "this$0");
        k0.p(view, "$view");
        k0.p(e, "$data");
        coreTimetableFragment.z(view, e);
    }
    
    private static final void D(final View view, final CoreTimetableFragment coreTimetableFragment, final View view2) {
        k0.p(view, "$view");
        k0.p(coreTimetableFragment, "this$0");
        ((EditText)view.findViewById(c.i.lk)).setText((CharSequence)"");
        ((ViewGroup)view.findViewById(c.i.dk)).setVisibility(8);
        ((ViewGroup)view.findViewById(c.i.kk)).setVisibility(0);
        ((LinearLayout)view.findViewById(c.i.ca)).setVisibility(8);
        UmFragment.hideKeyboard$default(coreTimetableFragment, null, 1, null);
    }
    
    private static final void E(final View view, final View view2) {
        k0.p(view, "$view");
        ((EditText)view.findViewById(c.i.lk)).setText((CharSequence)"");
    }
    
    private final void w(final TimeTableEntity timeTableEntity) {
    }
    
    private final f x() {
        return this.G.getValue();
    }
    
    private static final void y(final CoreTimetableFragment coreTimetableFragment, final View view, final com.untis.mobile.ui.core.timetable.e e) {
        k0.p(coreTimetableFragment, "this$0");
        k0.p(view, "$view");
        coreTimetableFragment.A(view, e);
    }
    
    private final void z(final View view, final com.untis.mobile.ui.core.timetable.e e) {
        ((ViewGroup)view.findViewById(c.i.dk)).setVisibility(0);
        ((ViewGroup)view.findViewById(c.i.kk)).setVisibility(4);
        final com.untis.mobile.ui.adapters.search.d adapter = new com.untis.mobile.ui.adapters.search.d(this.requireContext(), e.b()) {
            final /* synthetic */ CoreTimetableFragment p;
            
            @Override
            public void s(@e final DisplayableEntity displayableEntity) {
                k0.p(displayableEntity, "displayableEntity");
                CoreTimetableFragment.this.x().j(displayableEntity.entityType(), displayableEntity.entityId());
            }
            
            @Override
            public void t(@e final DisplayableEntity displayableEntity) {
                k0.p(displayableEntity, "displayableEntity");
                CoreTimetableFragment.this.x().k(displayableEntity.entityType(), displayableEntity.entityId());
                ((LinearLayout)view.findViewById(com.untis.mobile.c.i.ca)).setVisibility(8);
                ((ViewGroup)view.findViewById(com.untis.mobile.c.i.dk)).setVisibility(8);
                ((ViewGroup)view.findViewById(com.untis.mobile.c.i.kk)).setVisibility(0);
                UmFragment.hideKeyboard$default(this.p, null, 1, null);
            }
        };
        ((RecyclerView)view.findViewById(c.i.ba)).setAdapter((RecyclerView$h)adapter);
        final AppCompatEditText appCompatEditText = (AppCompatEditText)view.findViewById(c.i.lk);
        k0.o(appCompatEditText, "view.core_fragment_timetable_toolbar_search");
        h.A(appCompatEditText, new l<String, j2>() {
            public final void invoke(@e final String s) {
                k0.p(s, "it");
                adapter.u(s);
                final LinearLayout linearLayout = (LinearLayout)view.findViewById(c.i.ca);
                final int length = s.length();
                final int n = 0;
                int visibility;
                if (length == 0) {
                    visibility = 8;
                }
                else {
                    visibility = 0;
                }
                linearLayout.setVisibility(visibility);
                final TextView textView = (TextView)view.findViewById(c.i.aa);
                int visibility2;
                if (adapter.getItemCount() == 0) {
                    visibility2 = n;
                }
                else {
                    visibility2 = 8;
                }
                textView.setVisibility(visibility2);
            }
        });
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    public void onCreate(@org.jetbrains.annotations.f final Bundle bundle) {
        super.onCreate(bundle);
        this.x().i(this.getErrorHandler());
    }
    
    @org.jetbrains.annotations.f
    public View onCreateView(@e final LayoutInflater layoutInflater, @org.jetbrains.annotations.f final ViewGroup viewGroup, @org.jetbrains.annotations.f final Bundle bundle) {
        k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131493010, viewGroup, false);
        if (inflate == null) {
            return null;
        }
        this.x().h().j(this.getViewLifecycleOwner(), (l0)new com.untis.mobile.ui.core.timetable.d(this, inflate));
        return inflate;
    }
}
