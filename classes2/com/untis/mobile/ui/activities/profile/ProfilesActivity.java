// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.profile;

import android.widget.ImageView;
import android.widget.ImageButton;
import android.app.Activity;
import androidx.activity.ComponentActivity;
import java.util.List;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.utils.extension.h;
import androidx.appcompat.widget.AppCompatImageView;
import android.view.View$OnClickListener;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ListAdapter;
import com.untis.mobile.services.profile.legacy.j0;
import java.util.Objects;
import com.untis.mobile.c;
import android.widget.ListView;
import org.jetbrains.annotations.f;
import android.content.Intent;
import kotlin.jvm.internal.k0;
import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.activities.common.b;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bJ\"\u0010\u0011\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¨\u0006\u0016" }, d2 = { "Lcom/untis/mobile/ui/activities/profile/ProfilesActivity;", "Lcom/untis/mobile/ui/activities/common/b;", "Lkotlin/j2;", "u", "x", "Landroid/os/Bundle;", "save", "onCreate", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "s", "t", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "<init>", "()V", "G", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class ProfilesActivity extends b
{
    @e
    public static final a G;
    
    static {
        G = new a(null);
    }
    
    private final void u() {
        ((ComponentActivity)this).startActivityForResult(SchoolSearchActivity.H.a((Context)this), 161);
    }
    
    private static final void v(final ProfilesActivity profilesActivity, final View view) {
        k0.p(profilesActivity, "this$0");
        profilesActivity.u();
    }
    
    private static final void w(final ProfilesActivity profilesActivity, final View view) {
        k0.p(profilesActivity, "this$0");
        ((ComponentActivity)profilesActivity).onBackPressed();
    }
    
    private final void x() {
        final Intent a = WelcomeActivity.G.a((Context)this);
        a.setFlags(805339136);
        ((Activity)this).startActivity(a);
        ((Activity)this).finish();
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    protected void onActivityResult(final int n, final int n2, @f final Intent intent) {
        final boolean b = n2 == -1;
        if (n != 160) {
            if (n != 161) {
                super.onActivityResult(n, n2, intent);
            }
            else if (b) {
                ((Activity)this).setResult(-1);
                ((Activity)this).finish();
            }
        }
        else if (b) {
            final ListAdapter adapter = ((ListView)this.findViewById(c.i.p9)).getAdapter();
            Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.untis.mobile.ui.adapters.profile.ProfileAdapter");
            ((o5.f)adapter).p(j0.G.s0());
        }
    }
    
    @Override
    protected void onCreate(@f final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131492949);
        final int p = c.i.p9;
        final ListView listView = (ListView)this.findViewById(p);
        final j0 g = j0.G;
        listView.setAdapter((ListAdapter)new o5.f(this, g.s0()));
        ((ListView)this.findViewById(p)).setDivider((Drawable)null);
        ((ImageButton)this.findViewById(c.i.o9)).setOnClickListener((View$OnClickListener)new t0(this));
        final int n9 = c.i.n9;
        ((ImageView)this.findViewById(n9)).setOnClickListener((View$OnClickListener)new u0(this));
        ((ImageView)this.findViewById(n9)).setVisibility(h.U(g.n() != null, 0, 1, null));
    }
    
    public final void s(@e final Profile profile) {
        k0.p(profile, "profile");
        final j0 g = j0.G;
        g.c(profile);
        final List<Profile> s0 = g.s0();
        if (s0.isEmpty()) {
            this.x();
            return;
        }
        g.h(s0.get(0));
        final ListAdapter adapter = ((ListView)this.findViewById(c.i.p9)).getAdapter();
        Objects.requireNonNull((o5.f)adapter, "null cannot be cast to non-null type com.untis.mobile.ui.adapters.profile.ProfileAdapter");
        ((o5.f)adapter).p(s0);
    }
    
    public final void t(@e final Profile profile) {
        k0.p(profile, "profile");
        ((ComponentActivity)this).startActivityForResult(LoginManualActivity.a.b(LoginManualActivity.H, (Context)this, profile.getUniqueId(), null, 4, null), 160);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b" }, d2 = { "com/untis/mobile/ui/activities/profile/ProfilesActivity$a", "", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final Intent a(@e final Context context) {
            k0.p(context, "context");
            return new Intent(context, (Class)ProfilesActivity.class);
        }
    }
}
