// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.core.notifications;

import android.widget.TextView;
import com.untis.mobile.persistence.models.MessageOfDay;
import android.view.View$OnClickListener;
import androidx.recyclerview.widget.RecyclerView$h;
import kotlin.j2;
import n6.l;
import androidx.recyclerview.widget.RecyclerView;
import com.untis.mobile.utils.v;
import androidx.appcompat.widget.AppCompatTextView;
import android.os.Bundle;
import org.jetbrains.annotations.f;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import kotlin.jvm.internal.k0;
import com.untis.mobile.ui.activities.drive.DriveAttachmentListActivity;
import com.untis.mobile.persistence.models.drive.DriveAttachment;
import java.util.List;
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

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J&\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016R\u001d\u0010\u0014\u001a\u00020\u000f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017" }, d2 = { "Lcom/untis/mobile/ui/core/notifications/CoreMessagesOfDayFragment;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "", "Lcom/untis/mobile/persistence/models/drive/DriveAttachment;", "attachments", "Lkotlin/j2;", "u", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "Lcom/untis/mobile/ui/core/notifications/g;", "G", "Lkotlin/b0;", "t", "()Lcom/untis/mobile/ui/core/notifications/g;", "viewModel", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class CoreMessagesOfDayFragment extends UmFragment
{
    @e
    private final b0 G;
    
    public CoreMessagesOfDayFragment() {
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
    
    private final g t() {
        return this.G.getValue();
    }
    
    private final void u(final List<DriveAttachment> list) {
        DriveAttachmentListActivity.s(this.requireContext(), list);
    }
    
    private static final void v(final CoreMessagesOfDayFragment coreMessagesOfDayFragment, final View view) {
        k0.p(coreMessagesOfDayFragment, "this$0");
        coreMessagesOfDayFragment.onBackPressed();
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @f
    public View onCreateView(@e final LayoutInflater layoutInflater, @f final ViewGroup viewGroup, @f final Bundle bundle) {
        k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131493007, viewGroup, false);
        List<MessageOfDay> b = null;
        if (inflate == null) {
            return null;
        }
        ((TextView)inflate.findViewById(2131297331)).setText((CharSequence)com.untis.mobile.utils.d0.m(v.a.g()));
        final com.untis.mobile.ui.core.notifications.e e = (com.untis.mobile.ui.core.notifications.e)this.t().c().f();
        if (e != null) {
            b = e.b();
        }
        List<MessageOfDay> e2 = b;
        if (b == null) {
            e2 = kotlin.collections.v.E();
        }
        ((RecyclerView)inflate.findViewById(2131297329)).setAdapter((RecyclerView$h)new h(e2, new l<List<? extends DriveAttachment>, j2>() {
            public final void a(@e final List<DriveAttachment> list) {
                k0.p(list, "it");
                CoreMessagesOfDayFragment.this.u(list);
            }
        }));
        inflate.findViewById(2131297328).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.core.notifications.a(this));
        return inflate;
    }
}
