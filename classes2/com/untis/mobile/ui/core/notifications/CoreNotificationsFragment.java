// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.core.notifications;

import android.widget.TextView;
import androidx.lifecycle.l0;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import kotlinx.coroutines.CoroutineExceptionHandler;
import android.os.Bundle;
import androidx.navigation.o0;
import androidx.navigation.fragment.c;
import androidx.navigation.o0$a;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.v;
import com.untis.mobile.persistence.models.MessageOfDay;
import java.util.Collection;
import kotlin.text.s;
import kotlin.jvm.internal.k0;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
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

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0012\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J&\u0010\u0013\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016R\u001d\u0010\u0019\u001a\u00020\u00148B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c" }, d2 = { "Lcom/untis/mobile/ui/core/notifications/CoreNotificationsFragment;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "Landroid/view/View;", "view", "Lcom/untis/mobile/ui/core/notifications/e;", "data", "Lkotlin/j2;", "A", "", "skipThisView", "y", "z", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "Lcom/untis/mobile/ui/core/notifications/g;", "G", "Lkotlin/b0;", "u", "()Lcom/untis/mobile/ui/core/notifications/g;", "viewModel", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class CoreNotificationsFragment extends UmFragment
{
    @e
    private final b0 G;
    
    public CoreNotificationsFragment() {
        this.G = d0.c((a<?>)new a<g>() {
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
            public final g invoke() {
                return (g)org.koin.androidx.viewmodel.ext.android.a.a(this.G, k1.d(g.class), null, this.I, null);
            }
        });
    }
    
    private final void A(final View view, final com.untis.mobile.ui.core.notifications.e e) {
        if (e == null) {
            return;
        }
        if (e.a().isEmpty() && (e.b().isEmpty() ^ true)) {
            this.z(true);
            return;
        }
        if (e.b().isEmpty() && (e.a().isEmpty() ^ true)) {
            this.y(true);
            return;
        }
        view.findViewById(2131298385).setVisibility(8);
        if (e.b().isEmpty() && e.a().isEmpty()) {
            view.findViewById(2131298381).setVisibility(0);
            ((FloatingActionButton)view.findViewById(2131298380)).setImageDrawable(androidx.core.content.d.i(this.requireContext(), 2131231132));
            ((TextView)view.findViewById(2131298383)).setText((CharSequence)this.getString(2131886485));
            ((TextView)view.findViewById(2131298382)).setText((CharSequence)this.getString(2131886484));
            return;
        }
        if (e.a().isEmpty() ^ true) {
            final AppCompatTextView appCompatTextView = (AppCompatTextView)view.findViewById(2131297336);
            final String string = this.requireContext().getString(2131886588);
            k0.o(string, "requireContext().getString(R.string.reminder_xContactHourRegistrations_text)");
            ((TextView)appCompatTextView).setText((CharSequence)s.k2(string, "{0}", String.valueOf(e.a().size()), false, 4, (Object)null));
        }
        view.findViewById(2131297334).setVisibility(0);
        final List<MessageOfDay> b = e.b();
        int i;
        if (b instanceof Collection && b.isEmpty()) {
            i = 0;
        }
        else {
            final Iterator<Object> iterator = b.iterator();
            int n = 0;
            while (true) {
                i = n;
                if (!iterator.hasNext()) {
                    break;
                }
                if (!(iterator.next().getRead() ^ true)) {
                    continue;
                }
                final int n2 = n + 1;
                if ((n = n2) >= 0) {
                    continue;
                }
                v.V();
                n = n2;
            }
        }
        if (i > 0) {
            final AppCompatTextView appCompatTextView2 = (AppCompatTextView)view.findViewById(2131297339);
            final String string2 = this.requireContext().getString(2131886377);
            k0.o(string2, "requireContext().getString(R.string.messageOfDay_xUnreadMessagesOfDay_text)");
            ((TextView)appCompatTextView2).setText((CharSequence)s.k2(string2, "{0}", String.valueOf(i), false, 4, (Object)null));
        }
        else if (true ^ e.b().isEmpty()) {
            final AppCompatTextView appCompatTextView3 = (AppCompatTextView)view.findViewById(2131297339);
            final String string3 = this.requireContext().getString(2131886376);
            k0.o(string3, "requireContext().getString(R.string.messageOfDay_xCurrentMessagesOfDay_text)");
            ((TextView)appCompatTextView3).setText((CharSequence)s.k2(string3, "{0}", String.valueOf(e.b().size()), false, 4, (Object)null));
        }
        view.findViewById(2131297337).setVisibility(0);
    }
    
    private final g u() {
        return this.G.getValue();
    }
    
    private static final void v(final CoreNotificationsFragment coreNotificationsFragment, final View view) {
        k0.p(coreNotificationsFragment, "this$0");
        coreNotificationsFragment.y(false);
    }
    
    private static final void w(final CoreNotificationsFragment coreNotificationsFragment, final View view) {
        k0.p(coreNotificationsFragment, "this$0");
        coreNotificationsFragment.z(false);
    }
    
    private static final void x(final CoreNotificationsFragment coreNotificationsFragment, final View view, final com.untis.mobile.ui.core.notifications.e e) {
        k0.p(coreNotificationsFragment, "this$0");
        k0.p(view, "$view");
        coreNotificationsFragment.A(view, e);
    }
    
    private final void y(final boolean b) {
    }
    
    private final void z(final boolean b) {
        if (b) {
            final o0 a = new o0$a().g(2131297324, true).a();
            k0.o(a, "Builder().setPopUpTo(R.id.coreNotificationsFragment, true).build()");
            c.a((Fragment)this).E(f.a.a(), a);
        }
        else {
            c.a((Fragment)this).D(f.a.a());
        }
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    public void onCreate(@org.jetbrains.annotations.f final Bundle bundle) {
        super.onCreate(bundle);
        final g u = this.u();
        final CoroutineExceptionHandler errorHandler = this.getErrorHandler();
        final Context requireContext = this.requireContext();
        k0.o(requireContext, "requireContext()");
        u.d(errorHandler, requireContext);
    }
    
    @org.jetbrains.annotations.f
    public View onCreateView(@e final LayoutInflater layoutInflater, @org.jetbrains.annotations.f final ViewGroup viewGroup, @org.jetbrains.annotations.f final Bundle bundle) {
        k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131493009, viewGroup, false);
        if (inflate == null) {
            return null;
        }
        inflate.findViewById(2131297335).setOnClickListener((View$OnClickListener)new b(this));
        inflate.findViewById(2131297338).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.core.notifications.c(this));
        this.u().c().j(this.getViewLifecycleOwner(), (l0)new com.untis.mobile.ui.core.notifications.d(this, inflate));
        return inflate;
    }
}
