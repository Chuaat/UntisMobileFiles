// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.core.more;

import androidx.recyclerview.widget.RecyclerView$h;
import kotlin.jvm.internal.w;
import java.util.List;
import kotlin.jvm.internal.m0;
import n6.l;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.os.Bundle;
import org.jetbrains.annotations.f;
import android.view.ViewGroup;
import org.jetbrains.annotations.e;
import android.view.LayoutInflater;
import android.content.Intent;
import android.content.Context;
import com.untis.mobile.utils.extension.h;
import kotlin.j2;
import com.untis.mobile.ui.activities.profile.ProfilesActivity;
import com.untis.mobile.ui.activities.settings.SettingsActivity;
import kotlin.jvm.internal.k0;
import com.untis.mobile.ui.activities.settings.aboutus.AboutUsActivity;
import kotlin.h0;
import kotlin.Metadata;
import com.untis.mobile.ui.fragments.common.UmFragment;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J&\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u0010" }, d2 = { "Lcom/untis/mobile/ui/core/more/CoreMoreFragment;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "Lcom/untis/mobile/ui/core/more/a;", "moreOption", "Lkotlin/j2;", "s", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class CoreMoreFragment extends UmFragment
{
    private final void s(final com.untis.mobile.ui.core.more.a a) {
        final int n = CoreMoreFragment.a.a[a.ordinal()];
        Intent intent;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    throw new h0();
                }
                final AboutUsActivity.a j = AboutUsActivity.J;
                final Context requireContext = this.requireContext();
                k0.o(requireContext, "requireContext()");
                intent = j.a(requireContext);
            }
            else {
                final SettingsActivity.a o = SettingsActivity.O;
                final Context requireContext2 = this.requireContext();
                k0.o(requireContext2, "requireContext()");
                intent = o.a(requireContext2);
            }
        }
        else {
            final ProfilesActivity.a g = ProfilesActivity.G;
            final Context requireContext3 = this.requireContext();
            k0.o(requireContext3, "requireContext()");
            intent = g.a(requireContext3);
        }
        this.startActivity(intent);
        h.x(j2.a);
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @f
    public View onCreateView(@e final LayoutInflater layoutInflater, @f final ViewGroup viewGroup, @f final Bundle bundle) {
        k0.p(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(2131493008, viewGroup, false);
        if (inflate == null) {
            return null;
        }
        ((RecyclerView)inflate.findViewById(2131297332)).setAdapter((RecyclerView$h)new c(null, new l<com.untis.mobile.ui.core.more.a, j2>() {
            public final void a(@e final com.untis.mobile.ui.core.more.a a) {
                k0.p(a, "it");
                CoreMoreFragment.this.s(a);
            }
        }, 1, null));
        return inflate;
    }
}
