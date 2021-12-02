// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.messenger;

import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView$p;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$h;
import android.content.Context;
import j5.b;
import kotlin.jvm.internal.m0;
import kotlin.j2;
import n6.l;
import com.untis.mobile.services.profile.legacy.j0;
import androidx.recyclerview.widget.RecyclerView;
import com.untis.mobile.c;
import kotlin.jvm.internal.k0;
import android.view.View;
import android.os.Bundle;
import org.jetbrains.annotations.f;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import androidx.fragment.app.d;
import com.untis.mobile.activities.messenger.AuthenticateActivity;
import com.untis.mobile.persistence.models.profile.Profile;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.fragments.common.UmFragment;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J&\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u0012" }, d2 = { "Lcom/untis/mobile/ui/activities/messenger/AuthenticateProfileSelectionFragment;", "Lcom/untis/mobile/ui/fragments/common/UmFragment;", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Lkotlin/j2;", "s", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "save", "Landroid/view/View;", "onCreateView", "<init>", "()V", "G", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class AuthenticateProfileSelectionFragment extends UmFragment
{
    @e
    public static final a G;
    
    static {
        G = new a(null);
    }
    
    private final void s(final Profile profile) {
        final d activity = this.getActivity();
        AuthenticateActivity authenticateActivity;
        if (activity instanceof AuthenticateActivity) {
            authenticateActivity = (AuthenticateActivity)activity;
        }
        else {
            authenticateActivity = null;
        }
        if (authenticateActivity == null) {
            return;
        }
        authenticateActivity.B(profile);
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @f
    public View onCreateView(@e final LayoutInflater layoutInflater, @f final ViewGroup viewGroup, @f final Bundle bundle) {
        k0.p(layoutInflater, "inflater");
        Object o;
        if ((o = this.getContext()) == null && (o = this.getActivity()) == null) {
            return null;
        }
        final View inflate = layoutInflater.inflate(2131493071, viewGroup, false);
        if (inflate == null) {
            return null;
        }
        final int dn = c.i.dn;
        ((RecyclerView)inflate.findViewById(dn)).setAdapter((RecyclerView$h)new b((Context)o, j0.G.s0(), new l<Profile, j2>() {
            public final void a(@e final Profile profile) {
                k0.p(profile, "it");
                AuthenticateProfileSelectionFragment.this.s(profile);
            }
        }));
        ((RecyclerView)inflate.findViewById(dn)).setLayoutManager((RecyclerView$p)new LinearLayoutManager((Context)o));
        ((RecyclerView)inflate.findViewById(dn)).n((RecyclerView$o)new androidx.recyclerview.widget.l((Context)o, 1));
        return inflate;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006" }, d2 = { "com/untis/mobile/ui/activities/messenger/AuthenticateProfileSelectionFragment$a", "", "Lcom/untis/mobile/ui/activities/messenger/AuthenticateProfileSelectionFragment;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final AuthenticateProfileSelectionFragment a() {
            return new AuthenticateProfileSelectionFragment();
        }
    }
}
