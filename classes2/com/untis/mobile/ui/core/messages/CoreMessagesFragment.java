// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.core.messages;

import kotlin.jvm.internal.k0;
import android.view.View;
import android.os.Bundle;
import org.jetbrains.annotations.f;
import android.view.ViewGroup;
import android.view.LayoutInflater;
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

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u001d\u0010\u000f\u001a\u00020\n8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012" }, d2 = { "Lcom/untis/mobile/ui/core/messages/CoreMessagesFragment;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "Lcom/untis/mobile/ui/core/messages/a;", "G", "Lkotlin/b0;", "r", "()Lcom/untis/mobile/ui/core/messages/a;", "viewModel", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class CoreMessagesFragment extends UmFragment
{
    @e
    private final b0 G;
    
    public CoreMessagesFragment() {
        this.G = d0.c((a<?>)new a<com.untis.mobile.ui.core.messages.a>() {
            final /* synthetic */ y G;
            
            @e
            @Override
            public final com.untis.mobile.ui.core.messages.a invoke() {
                return (com.untis.mobile.ui.core.messages.a)b.b(this.G, k1.d(com.untis.mobile.ui.core.messages.a.class), null, null);
            }
        });
    }
    
    private final com.untis.mobile.ui.core.messages.a r() {
        return this.G.getValue();
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @f
    public View onCreateView(@e final LayoutInflater layoutInflater, @f final ViewGroup viewGroup, @f final Bundle bundle) {
        k0.p(layoutInflater, "inflater");
        View inflate;
        if ((inflate = layoutInflater.inflate(2131493006, viewGroup, false)) == null) {
            inflate = null;
        }
        return inflate;
    }
}
