// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.ui.option.events.attachment;

import android.widget.ImageView;
import kotlin.b0;
import androidx.recyclerview.widget.RecyclerView$h;
import kotlin.j2;
import n6.l;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View$OnClickListener;
import com.untis.mobile.c;
import androidx.appcompat.widget.AppCompatImageView;
import org.jetbrains.annotations.f;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import kotlin.jvm.internal.k0;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.untis.mobile.dashboard.persistence.model.Attachment;
import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.m0;
import android.os.Bundle;
import n6.a;
import kotlin.jvm.internal.k1;
import org.jetbrains.annotations.e;
import androidx.navigation.m;
import kotlin.Metadata;
import com.untis.mobile.ui.fragments.common.UmFragment;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J&\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016R\u001d\u0010\u0013\u001a\u00020\u000e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016" }, d2 = { "Lcom/untis/mobile/dashboard/ui/option/events/attachment/DashboardAttachmentFragment;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "Lcom/untis/mobile/dashboard/persistence/model/Attachment;", "attachment", "Lkotlin/j2;", "u", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "Lcom/untis/mobile/dashboard/ui/option/events/attachment/d;", "G", "Landroidx/navigation/m;", "t", "()Lcom/untis/mobile/dashboard/ui/option/events/attachment/d;", "args", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class DashboardAttachmentFragment extends UmFragment
{
    @e
    private final m G;
    
    public DashboardAttachmentFragment() {
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
    }
    
    private final d t() {
        return ((b0<d>)this.G).getValue();
    }
    
    private final void u(final Attachment attachment) {
        final Context context = this.getContext();
        if (context != null) {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(attachment.getUrl())));
        }
    }
    
    private static final void v(final DashboardAttachmentFragment dashboardAttachmentFragment, final View view) {
        k0.p(dashboardAttachmentFragment, "this$0");
        dashboardAttachmentFragment.onBackPressed();
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @f
    public View onCreateView(@e final LayoutInflater layoutInflater, @f final ViewGroup viewGroup, @f final Bundle bundle) {
        k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131493085, viewGroup, false);
        if (inflate == null) {
            return null;
        }
        ((ImageView)inflate.findViewById(c.i.yo)).setOnClickListener((View$OnClickListener)new com.untis.mobile.dashboard.ui.option.events.attachment.c(this));
        final RecyclerView recyclerView = (RecyclerView)inflate.findViewById(c.i.wo);
        final Context requireContext = this.requireContext();
        k0.o(requireContext, "requireContext()");
        recyclerView.setAdapter((RecyclerView$h)new b(requireContext, kotlin.collections.m.ey(this.t().d()), new l<Attachment, j2>() {
            public final void a(@e final Attachment attachment) {
                k0.p(attachment, "it");
                DashboardAttachmentFragment.this.u(attachment);
            }
        }));
        return inflate;
    }
}
