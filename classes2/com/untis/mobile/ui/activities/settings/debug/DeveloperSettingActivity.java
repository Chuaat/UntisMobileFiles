// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.settings.debug;

import androidx.activity.ComponentActivity;
import android.widget.Button;
import android.widget.FrameLayout;
import android.app.Activity;
import android.widget.CompoundButton;
import com.untis.mobile.UntisMobileApplication;
import android.content.Intent;
import android.view.MenuItem;
import androidx.appcompat.widget.AppCompatButton;
import android.view.View$OnClickListener;
import android.content.Context;
import com.untis.mobile.utils.a;
import org.joda.time.t;
import java.util.Set;
import com.untis.mobile.persistence.models.EntityType;
import org.jetbrains.annotations.f;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import java.util.Iterator;
import java.util.List;
import com.untis.mobile.utils.u0;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import kotlin.collections.v;
import com.untis.mobile.services.profile.legacy.j0;
import com.untis.mobile.ui.dialogs.ConfirmationDialog;
import androidx.appcompat.widget.SwitchCompat;
import com.untis.mobile.utils.settings.old.c;
import kotlin.jvm.internal.k0;
import android.view.View;
import kotlin.jvm.internal.w;
import com.untis.mobile.persistence.models.profile.Profile;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.activities.common.b;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\u0012\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\tH\u0014R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0019" }, d2 = { "Lcom/untis/mobile/ui/activities/settings/debug/DeveloperSettingActivity;", "Lcom/untis/mobile/ui/activities/common/b;", "Lkotlin/j2;", "N", "O", "", "visible", "P", "M", "Landroid/os/Bundle;", "save", "onCreate", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "outState", "onSaveInstanceState", "Lcom/untis/mobile/persistence/models/profile/Profile;", "G", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "<init>", "()V", "H", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class DeveloperSettingActivity extends b
{
    @e
    public static final a H;
    @e
    private static final String I = "ceasar";
    private Profile G;
    
    static {
        H = new a(null);
    }
    
    private static final void B(final DeveloperSettingActivity developerSettingActivity, final View view) {
        k0.p(developerSettingActivity, "this$0");
        c.c.o(((CompoundButton)developerSettingActivity.findViewById(com.untis.mobile.c.i.O4)).isChecked());
    }
    
    private static final void C(final DeveloperSettingActivity developerSettingActivity, final View view) {
        k0.p(developerSettingActivity, "this$0");
        c.c.h(((CompoundButton)developerSettingActivity.findViewById(com.untis.mobile.c.i.K4)).isChecked());
    }
    
    private static final void D(final DeveloperSettingActivity developerSettingActivity, final View view) {
        k0.p(developerSettingActivity, "this$0");
        developerSettingActivity.M();
    }
    
    private static final void E(final DeveloperSettingActivity developerSettingActivity, final View view) {
        k0.p(developerSettingActivity, "this$0");
        c.c.m(((CompoundButton)developerSettingActivity.findViewById(com.untis.mobile.c.i.Q4)).isChecked());
    }
    
    private static final void F(final DeveloperSettingActivity developerSettingActivity, final View view) {
        k0.p(developerSettingActivity, "this$0");
        c.c.n(((CompoundButton)developerSettingActivity.findViewById(com.untis.mobile.c.i.P4)).isChecked());
    }
    
    private static final void G(final DeveloperSettingActivity developerSettingActivity, final View view) {
        k0.p(developerSettingActivity, "this$0");
        c.c.b(((CompoundButton)developerSettingActivity.findViewById(com.untis.mobile.c.i.M4)).isChecked());
    }
    
    private static final void H(final DeveloperSettingActivity developerSettingActivity, final View view) {
        k0.p(developerSettingActivity, "this$0");
        c.c.p(((CompoundButton)developerSettingActivity.findViewById(com.untis.mobile.c.i.L4)).isChecked());
    }
    
    private static final void I(final DeveloperSettingActivity developerSettingActivity, final View view) {
        k0.p(developerSettingActivity, "this$0");
        developerSettingActivity.N();
    }
    
    private static final void J(final DeveloperSettingActivity developerSettingActivity, final View view) {
        k0.p(developerSettingActivity, "this$0");
        developerSettingActivity.O();
    }
    
    private static final void K(final DeveloperSettingActivity developerSettingActivity, final View view) {
        k0.p(developerSettingActivity, "this$0");
        c.c.r(((CompoundButton)developerSettingActivity.findViewById(com.untis.mobile.c.i.N4)).isChecked());
    }
    
    private static final void L(final DeveloperSettingActivity developerSettingActivity, final View view) {
        k0.p(developerSettingActivity, "this$0");
        developerSettingActivity.P(c.c.f() ^ true);
    }
    
    private final void M() {
        ConfirmationDialog.Q((ConfirmationDialog.c)new ConfirmationDialog.c() {
            final /* synthetic */ DeveloperSettingActivity a;
            
            @Override
            public void a() {
                com.untis.mobile.utils.settings.old.c.c.k(false);
                ((Activity)this.a).finish();
            }
            
            @Override
            public void onCancel() {
            }
        }).L(((androidx.fragment.app.d)this).getSupportFragmentManager(), "disablegondor");
    }
    
    private final void N() {
        final List<Profile> s0 = j0.G.s0();
        final ArrayList list = new ArrayList<Profile>(v.Y((Iterable<?>)s0, 10));
        for (final Profile profile : s0) {
            profile.setSchoolUseMobileService(true);
            list.add(j0.G.d(profile));
        }
        u0.n(this.findViewById(com.untis.mobile.c.i.B4), "profiles set on ms");
    }
    
    private final void O() {
        final List<Profile> s0 = j0.G.s0();
        final ArrayList list = new ArrayList<Profile>(v.Y((Iterable<?>)s0, 10));
        for (final Profile profile : s0) {
            profile.setSchoolUseMobileService(false);
            list.add(j0.G.d(profile));
        }
        u0.n(this.findViewById(com.untis.mobile.c.i.B4), "profiles set on wu");
    }
    
    private final void P(final boolean b) {
        c.c.a(b);
        CardView cardView;
        int n;
        if (b) {
            cardView = (CardView)this.findViewById(com.untis.mobile.c.i.H4);
            n = 0;
        }
        else {
            cardView = (CardView)this.findViewById(com.untis.mobile.c.i.H4);
            n = 8;
        }
        ((FrameLayout)cardView).setVisibility(n);
        ((FrameLayout)this.findViewById(com.untis.mobile.c.i.I4)).setVisibility(n);
        ((FrameLayout)this.findViewById(com.untis.mobile.c.i.G4)).setVisibility(n);
        ((FrameLayout)this.findViewById(com.untis.mobile.c.i.J4)).setVisibility(n);
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @Override
    protected void onCreate(@f Bundle extras) {
        super.onCreate(extras);
        this.setContentView(2131492908);
        final j0 g = j0.G;
        if (extras == null) {
            extras = ((Activity)this).getIntent().getExtras();
        }
        final String s = "";
        String string;
        if (extras == null) {
            string = s;
        }
        else {
            string = extras.getString("ceasar", "");
            if (string == null) {
                string = s;
            }
        }
        Profile l;
        if ((l = g.l(string)) == null) {
            l = new Profile(0L, null, null, null, 0L, null, 0L, null, null, null, null, null, false, false, 0L, null, null, null, 0L, null, false, null, 0L, 0, null, null, false, false, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, null, 0L, false, null, null, null, null, null, null, 0L, false, 0L, -1, 65535, null);
        }
        this.G = l;
        final com.untis.mobile.utils.a a = com.untis.mobile.utils.a.a((Context)this);
        final int o4 = com.untis.mobile.c.i.O4;
        final SwitchCompat switchCompat = (SwitchCompat)this.findViewById(o4);
        final Profile g2 = this.G;
        if (g2 == null) {
            k0.S("profile");
            throw null;
        }
        ((CompoundButton)switchCompat).setEnabled(a.I(g2) || c.c.j());
        final int k4 = com.untis.mobile.c.i.K4;
        final SwitchCompat switchCompat2 = (SwitchCompat)this.findViewById(k4);
        final Profile g3 = this.G;
        if (g3 == null) {
            k0.S("profile");
            throw null;
        }
        ((CompoundButton)switchCompat2).setEnabled(a.J(g3) || c.c.e());
        final int q4 = com.untis.mobile.c.i.Q4;
        final SwitchCompat switchCompat3 = (SwitchCompat)this.findViewById(q4);
        final Profile g4 = this.G;
        if (g4 == null) {
            k0.S("profile");
            throw null;
        }
        ((CompoundButton)switchCompat3).setEnabled(a.M(g4) || c.c.i());
        final int p = com.untis.mobile.c.i.P4;
        final SwitchCompat switchCompat4 = (SwitchCompat)this.findViewById(p);
        final Profile g5 = this.G;
        if (g5 != null) {
            ((CompoundButton)switchCompat4).setEnabled(a.L(g5) || c.c.c());
            final int l2 = com.untis.mobile.c.i.L4;
            ((CompoundButton)this.findViewById(l2)).setEnabled(false);
            final int n4 = com.untis.mobile.c.i.N4;
            ((CompoundButton)this.findViewById(n4)).setEnabled(false);
            final SwitchCompat switchCompat5 = (SwitchCompat)this.findViewById(o4);
            final c c = com.untis.mobile.utils.settings.old.c.c;
            switchCompat5.setChecked(c.j());
            ((SwitchCompat)this.findViewById(k4)).setChecked(c.e());
            ((SwitchCompat)this.findViewById(q4)).setChecked(c.i());
            ((SwitchCompat)this.findViewById(p)).setChecked(c.c());
            final int m4 = com.untis.mobile.c.i.M4;
            ((SwitchCompat)this.findViewById(m4)).setChecked(c.q());
            ((SwitchCompat)this.findViewById(l2)).setChecked(c.l());
            ((SwitchCompat)this.findViewById(n4)).setChecked(c.d());
            ((CompoundButton)this.findViewById(o4)).setOnClickListener((View$OnClickListener)new k(this));
            ((CompoundButton)this.findViewById(k4)).setOnClickListener((View$OnClickListener)new g(this));
            ((CompoundButton)this.findViewById(q4)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.settings.debug.e(this));
            ((CompoundButton)this.findViewById(p)).setOnClickListener((View$OnClickListener)new j(this));
            ((CompoundButton)this.findViewById(m4)).setOnClickListener((View$OnClickListener)new d(this));
            ((CompoundButton)this.findViewById(l2)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.settings.debug.c(this));
            ((Button)this.findViewById(com.untis.mobile.c.i.E4)).setOnClickListener((View$OnClickListener)new h(this));
            ((Button)this.findViewById(com.untis.mobile.c.i.F4)).setOnClickListener((View$OnClickListener)new i(this));
            ((CompoundButton)this.findViewById(n4)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.settings.debug.f(this));
            ((Button)this.findViewById(com.untis.mobile.c.i.C4)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.settings.debug.b(this));
            this.P(c.f());
            ((Button)this.findViewById(com.untis.mobile.c.i.D4)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.settings.debug.a(this));
            final androidx.appcompat.app.a supportActionBar = this.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.Y(true);
            }
            return;
        }
        k0.S("profile");
        throw null;
    }
    
    @Override
    public boolean onOptionsItemSelected(@e final MenuItem menuItem) {
        k0.p(menuItem, "item");
        boolean onOptionsItemSelected;
        if (menuItem.getItemId() == 16908332) {
            ((ComponentActivity)this).onBackPressed();
            onOptionsItemSelected = true;
        }
        else {
            onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
        }
        return onOptionsItemSelected;
    }
    
    protected void onSaveInstanceState(@e final Bundle bundle) {
        k0.p(bundle, "outState");
        super.onSaveInstanceState(bundle);
        final Profile g = this.G;
        if (g != null) {
            bundle.putString("ceasar", g.getUniqueId());
            return;
        }
        k0.S("profile");
        throw null;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b" }, d2 = { "com/untis/mobile/ui/activities/settings/debug/DeveloperSettingActivity$a", "", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Landroid/content/Intent;", "a", "", "BUNDLE_PROFILE_ID", "Ljava/lang/String;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final Intent a(@e final Profile profile) {
            k0.p(profile, "profile");
            final Intent intent = new Intent((Context)UntisMobileApplication.I.b(), (Class)DeveloperSettingActivity.class);
            final Bundle bundle = new Bundle();
            bundle.putString("ceasar", profile.getUniqueId());
            intent.putExtras(bundle);
            return intent;
        }
    }
}
