// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.settings;

import android.app.Dialog;
import androidx.activity.ComponentActivity;
import android.app.Activity;
import com.untis.mobile.ui.activities.settings.aboutus.AboutUsActivity;
import android.view.MenuItem;
import android.view.Menu;
import androidx.appcompat.widget.AppCompatImageView;
import com.untis.mobile.ui.activities.help.HelpActivity;
import android.os.Bundle;
import com.untis.mobile.ui.dialogs.ChooseTimetableEntityActivity;
import android.content.DialogInterface;
import android.annotation.SuppressLint;
import java.util.Iterator;
import android.content.DialogInterface$OnClickListener;
import androidx.appcompat.app.d$a;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import com.untis.mobile.persistence.models.Displayable;
import com.untis.mobile.ui.activities.profile.ProfileEntityActivity;
import android.widget.SeekBar$OnSeekBarChangeListener;
import android.widget.SeekBar;
import java.util.List;
import com.untis.mobile.services.profile.legacy.j0;
import kotlin.text.s;
import android.content.Intent;
import android.view.ViewParent;
import android.content.SharedPreferences;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.preference.PreferenceManager;
import com.untis.mobile.utils.u0;
import com.untis.mobile.ui.activities.customcolors.CustomSubjectColorsActivity;
import android.widget.ImageView;
import com.untis.mobile.c;
import android.widget.LinearLayout;
import com.untis.mobile.persistence.models.DisplayableEntity;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.persistence.models.silentmode.SilentModeSettings;
import com.untis.mobile.utils.u;
import kotlin.jvm.internal.k0;
import android.content.Context;
import androidx.core.content.d;
import android.widget.TextView;
import android.view.View$OnClickListener;
import java.util.Objects;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import android.content.ComponentCallbacks;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.w;
import kotlin.b0;
import com.untis.mobile.utils.a;
import org.jetbrains.annotations.f;
import android.view.View;
import com.untis.mobile.persistence.models.profile.Profile;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.dialogs.j;
import com.untis.mobile.ui.activities.common.b;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001AB\u0007¢\u0006\u0004\bZ\u0010[J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0005H\u0002J\b\u0010\t\u001a\u00020\u0005H\u0002J\u0012\u0010\f\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002J \u0010\u0012\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u001c\u0010\u0015\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002J\b\u0010\u0016\u001a\u00020\u0005H\u0002J\b\u0010\u0017\u001a\u00020\u0005H\u0002J\b\u0010\u0018\u001a\u00020\u0005H\u0002J\b\u0010\u0019\u001a\u00020\u0005H\u0002J\b\u0010\u001a\u001a\u00020\u0005H\u0002J\b\u0010\u001b\u001a\u00020\u0005H\u0002J\b\u0010\u001c\u001a\u00020\u0005H\u0002J\b\u0010\u001d\u001a\u00020\u0005H\u0002J\b\u0010\u001e\u001a\u00020\u0005H\u0002J\b\u0010\u001f\u001a\u00020\u0005H\u0002J0\u0010'\u001a\u00020\u00052\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020\u00032\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$H\u0002J\b\u0010(\u001a\u00020\u0005H\u0002J\u0010\u0010+\u001a\u00020 2\u0006\u0010*\u001a\u00020)H\u0002J\b\u0010,\u001a\u00020\u0005H\u0002J\b\u0010-\u001a\u00020\u0005H\u0002J\b\u0010.\u001a\u00020\u0005H\u0002J\b\u0010/\u001a\u00020\u0005H\u0003J\b\u00100\u001a\u00020\u0005H\u0002J\u0012\u00103\u001a\u00020\u00052\b\u00102\u001a\u0004\u0018\u000101H\u0014J\b\u00104\u001a\u00020\u0005H\u0014J\"\u00109\u001a\u00020\u00052\u0006\u00105\u001a\u00020 2\u0006\u00106\u001a\u00020 2\b\u00108\u001a\u0004\u0018\u000107H\u0014J\u0010\u0010<\u001a\u00020$2\u0006\u0010;\u001a\u00020:H\u0016J\u0010\u0010?\u001a\u00020$2\u0006\u0010>\u001a\u00020=H\u0016J\b\u0010@\u001a\u00020\u0005H\u0016J\b\u0010A\u001a\u00020\u0005H\u0016R\u0018\u0010E\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010FR\u0016\u0010I\u001a\u00020G8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010HR\u0016\u0010J\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010\u001fR\u001d\u0010P\u001a\u00020K8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0016\u0010R\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010\u001fR\u0018\u0010U\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010TR\u001d\u0010Y\u001a\u00020V8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010M\u001a\u0004\bW\u0010X¨\u0006\\" }, d2 = { "Lcom/untis/mobile/ui/activities/settings/SettingsActivity;", "Lcom/untis/mobile/ui/activities/common/b;", "Lcom/untis/mobile/ui/dialogs/j$a;", "", "m0", "Lkotlin/j2;", "Z", "U", "g0", "s0", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "q0", "profileId", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "", "entityId", "r0", "Lcom/untis/mobile/persistence/models/silentmode/SilentModeSettings;", "settings", "T", "e0", "M", "G", "f0", "O", "H", "W", "l0", "E", "I", "", "viewGroupId", "titleId", "KEY", "", "default_value", "isInPremium", "b0", "i0", "", "scheduleTextSize", "R", "Y", "K", "F", "n0", "t0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onResume", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "Landroid/view/Menu;", "menu", "onCreateOptionsMenu", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "onBackPressed", "a", "Lcom/untis/mobile/services/masterdata/a;", "L", "Lcom/untis/mobile/services/masterdata/a;", "masterDataService", "Lcom/untis/mobile/persistence/models/profile/Profile;", "Lcom/untis/mobile/utils/a;", "Lcom/untis/mobile/utils/a;", "appSettings", "paddingSide", "Lcom/untis/mobile/lockscreen/a;", "N", "Lkotlin/b0;", "Q", "()Lcom/untis/mobile/lockscreen/a;", "lockScreen", "J", "padding", "Landroid/view/View;", "Landroid/view/View;", "root", "Lcom/untis/mobile/silentmode/a;", "S", "()Lcom/untis/mobile/silentmode/a;", "silentMode", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class SettingsActivity extends b implements j.a
{
    @e
    public static final a O;
    private Profile G;
    @f
    private View H;
    private com.untis.mobile.utils.a I;
    private int J;
    private int K;
    @f
    private com.untis.mobile.services.masterdata.a L;
    @e
    private final b0 M;
    @e
    private final b0 N;
    
    static {
        O = new a(null);
    }
    
    public SettingsActivity() {
        this.M = d0.c((n6.a<?>)new n6.a<com.untis.mobile.silentmode.a>() {
            final /* synthetic */ ComponentCallbacks G;
            
            @e
            @Override
            public final com.untis.mobile.silentmode.a invoke() {
                return (com.untis.mobile.silentmode.a)org.koin.android.ext.android.a.e(this.G).y().t(k1.d(com.untis.mobile.silentmode.a.class), null, null);
            }
        });
        this.N = d0.c((n6.a<?>)new n6.a<com.untis.mobile.lockscreen.a>() {
            final /* synthetic */ ComponentCallbacks G;
            
            @e
            @Override
            public final com.untis.mobile.lockscreen.a invoke() {
                return (com.untis.mobile.lockscreen.a)org.koin.android.ext.android.a.e(this.G).y().t(k1.d(com.untis.mobile.lockscreen.a.class), null, null);
            }
        });
    }
    
    private final void E() {
        final ViewGroup viewGroup = (ViewGroup)this.findViewById(2131296840);
        final View child = viewGroup.getChildAt(1);
        Objects.requireNonNull(child, "null cannot be cast to non-null type androidx.appcompat.widget.SwitchCompat");
        final SwitchCompat switchCompat = (SwitchCompat)child;
        viewGroup.setOnClickListener((View$OnClickListener)null);
        switchCompat.setChecked(true);
        ((CompoundButton)switchCompat).setEnabled(false);
        final View viewById = this.findViewById(2131296844);
        Objects.requireNonNull(viewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView)viewById).setTextColor(d.f((Context)this, 2131099698));
        final View viewById2 = this.findViewById(2131296842);
        Objects.requireNonNull(viewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView)viewById2).setTextColor(d.f((Context)this, 2131099696));
    }
    
    private final void F() {
        this.findViewById(2131296864).setOnClickListener((View$OnClickListener)null);
        ((TextView)this.findViewById(2131296865)).setTextColor(d.f((Context)this, 2131099698));
        ((TextView)this.findViewById(2131296862)).setTextColor(d.f((Context)this, 2131099696));
    }
    
    private final void G() {
        ((ViewGroup)this.findViewById(2131296884)).setOnClickListener((View$OnClickListener)null);
        final View viewById = this.findViewById(2131296834);
        Objects.requireNonNull(viewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView)viewById).setTextColor(d.f((Context)this, 2131099698));
        final View viewById2 = this.findViewById(2131296833);
        Objects.requireNonNull(viewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView)viewById2).setTextColor(d.f((Context)this, 2131099696));
        final TextView textView = (TextView)this.findViewById(2131296894);
        textView.setOnClickListener((View$OnClickListener)null);
        textView.setEnabled(false);
        textView.setTextColor(d.f((Context)this, 2131099698));
    }
    
    private final void H() {
        final ViewGroup viewGroup = (ViewGroup)this.findViewById(2131296890);
        final SwitchCompat switchCompat = (SwitchCompat)this.findViewById(2131296893);
        viewGroup.setOnClickListener((View$OnClickListener)null);
        ((CompoundButton)switchCompat).setEnabled(false);
        final View viewById = this.findViewById(2131296836);
        Objects.requireNonNull(viewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView)viewById).setTextColor(d.f((Context)this, 2131099698));
        final View viewById2 = this.findViewById(2131296835);
        Objects.requireNonNull(viewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView)viewById2).setTextColor(d.f((Context)this, 2131099696));
    }
    
    private final void I() {
        final ViewGroup viewGroup = (ViewGroup)this.findViewById(2131296840);
        final View child = viewGroup.getChildAt(1);
        Objects.requireNonNull(child, "null cannot be cast to non-null type androidx.appcompat.widget.SwitchCompat");
        final SwitchCompat switchCompat = (SwitchCompat)child;
        viewGroup.setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.settings.f(switchCompat));
        ((CompoundButton)switchCompat).setEnabled(true);
        final View viewById = this.findViewById(2131296844);
        Objects.requireNonNull(viewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView)viewById).setTextColor(d.f((Context)this, 2131099697));
        final View viewById2 = this.findViewById(2131296842);
        Objects.requireNonNull(viewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView)viewById2).setTextColor(d.f((Context)this, 2131099695));
    }
    
    private static final void J(final SwitchCompat switchCompat, final View view) {
        k0.p(switchCompat, "$aSwitch");
        switchCompat.toggle();
    }
    
    private final void K() {
        this.findViewById(2131296864).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.settings.j(this));
        ((TextView)this.findViewById(2131296834)).setTextColor(d.f((Context)this, 2131099697));
        ((TextView)this.findViewById(2131296833)).setTextColor(d.f((Context)this, 2131099695));
        this.t0();
    }
    
    private static final void L(final SettingsActivity settingsActivity, final View view) {
        k0.p(settingsActivity, "this$0");
        settingsActivity.n0();
    }
    
    private final void M() {
        final View viewById = this.findViewById(2131296884);
        final View viewById2 = this.findViewById(2131296834);
        Objects.requireNonNull(viewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView)viewById2).setTextColor(d.f((Context)this, 2131099697));
        final View viewById3 = this.findViewById(2131296833);
        Objects.requireNonNull(viewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView)viewById3).setTextColor(d.f((Context)this, 2131099695));
        final TextView textView = (TextView)this.findViewById(2131296894);
        viewById.setOnClickListener((View$OnClickListener)new l(this));
        textView.setEnabled(true);
        textView.setTextColor(d.f((Context)this, 2131099677));
    }
    
    private static final void N(final SettingsActivity settingsActivity, final View view) {
        k0.p(settingsActivity, "this$0");
        j.c().show(((Activity)settingsActivity).getFragmentManager(), "silentSettingMuteOnBreakDialog");
    }
    
    private final void O() {
        final ViewGroup viewGroup = (ViewGroup)this.findViewById(2131296890);
        final SwitchCompat switchCompat = (SwitchCompat)this.findViewById(2131296893);
        viewGroup.setOnClickListener((View$OnClickListener)new m(this, switchCompat));
        ((CompoundButton)switchCompat).setEnabled(true);
        final View viewById = this.findViewById(2131296836);
        Objects.requireNonNull(viewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView)viewById).setTextColor(d.f((Context)this, 2131099697));
        final View viewById2 = this.findViewById(2131296835);
        Objects.requireNonNull(viewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView)viewById2).setTextColor(d.f((Context)this, 2131099695));
    }
    
    private static final void P(final SettingsActivity settingsActivity, final SwitchCompat switchCompat, final View view) {
        k0.p(settingsActivity, "this$0");
        final com.untis.mobile.utils.a i = settingsActivity.I;
        if (i == null) {
            k0.S("appSettings");
            throw null;
        }
        final boolean s = i.S();
        switchCompat.toggle();
        final com.untis.mobile.utils.a j = settingsActivity.I;
        if (j != null) {
            j.b1(s ^ true);
            return;
        }
        k0.S("appSettings");
        throw null;
    }
    
    private final com.untis.mobile.lockscreen.a Q() {
        return this.N.getValue();
    }
    
    private final int R(final float n) {
        final float a = u.m.b.a;
        int n2 = 1;
        final int n3 = 0;
        if (n == a) {
            return 0;
        }
        if (n == u.m.b.c) {
            return 2;
        }
        int n4 = n3;
        if (n == u.m.b.d) {
            n4 = 1;
        }
        if (n4 != 0) {
            n2 = 3;
        }
        return n2;
    }
    
    private final com.untis.mobile.silentmode.a S() {
        return this.M.getValue();
    }
    
    private final String T(final Profile profile, final SilentModeSettings silentModeSettings) {
        if (profile == null) {
            return "";
        }
        if (silentModeSettings == null) {
            return "";
        }
        final EntityType by = EntityType.Companion.findBy(silentModeSettings.entityType);
        String s2;
        final String s = s2 = k0.C(profile.getDisplayName(), " - ");
        if (by != EntityType.NONE) {
            final com.untis.mobile.services.masterdata.a l = this.L;
            k0.m(l);
            final DisplayableEntity v = l.v(by, silentModeSettings.entityId);
            s2 = s;
            if (v != null) {
                s2 = k0.C(s, v.getDisplayableTitle());
            }
        }
        return s2;
    }
    
    private final void U() {
        final Profile g = this.G;
        if (g == null) {
            k0.S("profile");
            throw null;
        }
        if (g.isEndOfPremium()) {
            ((LinearLayout)this.findViewById(c.i.xa)).setVisibility(8);
            ((ImageView)this.findViewById(c.i.za)).setVisibility(8);
            return;
        }
        final com.untis.mobile.utils.a a = com.untis.mobile.utils.a.a((Context)this);
        final Profile g2 = this.G;
        if (g2 != null) {
            if (a.L(g2)) {
                this.findViewById(2131296851).setOnClickListener((View$OnClickListener)new h(this));
            }
            else {
                final TextView textView = (TextView)this.findViewById(2131296854);
                final TextView textView2 = (TextView)this.findViewById(2131296852);
                textView.setTextColor(d.f((Context)this, 2131099698));
                textView2.setTextColor(d.f((Context)this, 2131099696));
            }
            return;
        }
        k0.S("profile");
        throw null;
    }
    
    private static final void V(final SettingsActivity settingsActivity, final View view) {
        k0.p(settingsActivity, "this$0");
        final Profile g = settingsActivity.G;
        if (g != null) {
            CustomSubjectColorsActivity.F(settingsActivity, g);
            return;
        }
        k0.S("profile");
        throw null;
    }
    
    private final void W() {
        final ViewGroup viewGroup = (ViewGroup)this.findViewById(2131296832);
        final ViewGroup viewGroup2 = (ViewGroup)this.findViewById(2131296859);
        final Profile g = this.G;
        if (g != null) {
            int visibility = 0;
            Label_0087: {
                if (g.hasEntity()) {
                    final Profile g2 = this.G;
                    if (g2 == null) {
                        k0.S("profile");
                        throw null;
                    }
                    if (g2.getUserOriginalEntityType() == EntityType.NONE) {
                        viewGroup2.setOnClickListener((View$OnClickListener)new g(this));
                        visibility = 0;
                        break Label_0087;
                    }
                }
                visibility = 8;
            }
            viewGroup.setVisibility(visibility);
            ((TextView)this.findViewById(2131296861)).setText((CharSequence)this.m0());
            return;
        }
        k0.S("profile");
        throw null;
    }
    
    private static final void X(final SettingsActivity settingsActivity, final View view) {
        k0.p(settingsActivity, "this$0");
        settingsActivity.l0();
    }
    
    private final void Y() {
        final com.untis.mobile.utils.a i = this.I;
        if (i == null) {
            k0.S("appSettings");
            throw null;
        }
        final Profile g = this.G;
        if (g != null) {
            if (i.M(g)) {
                this.K();
            }
            else {
                this.F();
            }
            return;
        }
        k0.S("profile");
        throw null;
    }
    
    private final void Z() {
        this.findViewById(2131296866).setOnClickListener((View$OnClickListener)new k(this));
    }
    
    private static final void a0(final SettingsActivity settingsActivity, final View view) {
        k0.p(settingsActivity, "this$0");
        com.untis.mobile.utils.a.a((Context)settingsActivity).X();
        u0.n(settingsActivity.H, ((Activity)settingsActivity).getString(2131886609));
    }
    
    private final void b0(final int n, final int n2, final String s, final boolean b, final boolean b2) {
        final ViewGroup viewGroup = (ViewGroup)this.findViewById(n);
        final View child = viewGroup.getChildAt(1);
        Objects.requireNonNull(child, "null cannot be cast to non-null type androidx.appcompat.widget.SwitchCompat");
        final SwitchCompat switchCompat = (SwitchCompat)child;
        final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences((Context)this);
        final TextView textView = (TextView)this.findViewById(n2);
        if (textView != null) {
            final com.untis.mobile.utils.a i = this.I;
            if (i == null) {
                k0.S("appSettings");
                throw null;
            }
            final Profile g = this.G;
            if (g == null) {
                k0.S("profile");
                throw null;
            }
            if (!i.L(g) && b2) {
                textView.setTextColor(d.f((Context)this, 2131099698));
            }
        }
        viewGroup.setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.settings.b(this, b2, switchCompat, n));
        switchCompat.setChecked(defaultSharedPreferences.getBoolean(s, b));
        final com.untis.mobile.utils.a j = this.I;
        if (j == null) {
            k0.S("appSettings");
            throw null;
        }
        final Profile g2 = this.G;
        if (g2 != null) {
            if (!j.L(g2) && b2) {
                ((CompoundButton)switchCompat).setEnabled(false);
                ((CompoundButton)switchCompat).setTextColor(d.f((Context)this, 2131099698));
                final ViewParent parent = ((CompoundButton)switchCompat).getParent();
                Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup)parent).setOnClickListener((View$OnClickListener)null);
            }
            else {
                ((CompoundButton)switchCompat).setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)new com.untis.mobile.ui.activities.settings.c(defaultSharedPreferences, s, this));
            }
            return;
        }
        k0.S("profile");
        throw null;
    }
    
    private static final void c0(final SharedPreferences sharedPreferences, final String s, final SettingsActivity settingsActivity, final CompoundButton compoundButton, final boolean b) {
        k0.p(s, "$KEY");
        k0.p(settingsActivity, "this$0");
        sharedPreferences.edit().putBoolean(s, b).apply();
        com.untis.mobile.services.widget.c.G.b((Context)settingsActivity);
        ((Activity)settingsActivity).setResult(-1, (Intent)null);
    }
    
    private static final void d0(final SettingsActivity settingsActivity, final boolean b, final SwitchCompat switchCompat, final int n, final View view) {
        k0.p(settingsActivity, "this$0");
        k0.p(switchCompat, "$aswitch");
        final com.untis.mobile.utils.a i = settingsActivity.I;
        if (i == null) {
            k0.S("appSettings");
            throw null;
        }
        final Profile g = settingsActivity.G;
        if (g != null) {
            if (i.L(g) || !b) {
                switchCompat.toggle();
                if (n != 2131296903) {
                    settingsActivity.Q().stop();
                    settingsActivity.Q().start();
                }
            }
            return;
        }
        k0.S("profile");
        throw null;
    }
    
    private final void e0() {
        final TextView textView = (TextView)this.findViewById(2131296894);
        final com.untis.mobile.utils.a i = this.I;
        if (i == null) {
            k0.S("appSettings");
            throw null;
        }
        textView.setText((CharSequence)s.k2("{0} min", "{0}", String.valueOf(i.B()), false, 4, (Object)null));
        final com.untis.mobile.utils.a j = this.I;
        if (j == null) {
            k0.S("appSettings");
            throw null;
        }
        final Profile g = this.G;
        if (g != null) {
            if (j.I(g)) {
                final com.untis.mobile.utils.a k = this.I;
                if (k == null) {
                    k0.S("appSettings");
                    throw null;
                }
                if (k.Q()) {
                    this.M();
                    return;
                }
            }
            this.G();
            return;
        }
        k0.S("profile");
        throw null;
    }
    
    private final void f0() {
        final SwitchCompat switchCompat = (SwitchCompat)this.findViewById(2131296893);
        final com.untis.mobile.utils.a i = this.I;
        if (i == null) {
            k0.S("appSettings");
            throw null;
        }
        switchCompat.setChecked(i.S());
        ((CompoundButton)switchCompat).setEnabled(true);
        final com.untis.mobile.utils.a j = this.I;
        if (j == null) {
            k0.S("appSettings");
            throw null;
        }
        final Profile g = this.G;
        if (g != null) {
            if (j.I(g)) {
                final com.untis.mobile.utils.a k = this.I;
                if (k == null) {
                    k0.S("appSettings");
                    throw null;
                }
                if (k.Q()) {
                    this.O();
                    return;
                }
            }
            this.H();
            return;
        }
        k0.S("profile");
        throw null;
    }
    
    private final void g0() {
        final Profile g = this.G;
        if (g == null) {
            k0.S("profile");
            throw null;
        }
        if (g.isEndOfPremium()) {
            ((LinearLayout)this.findViewById(c.i.ab)).setVisibility(8);
            ((LinearLayout)this.findViewById(c.i.kb)).setVisibility(8);
            ((LinearLayout)this.findViewById(c.i.eb)).setVisibility(8);
            ((ImageView)this.findViewById(c.i.db)).setVisibility(8);
            ((ImageView)this.findViewById(c.i.mb)).setVisibility(8);
            ((ImageView)this.findViewById(c.i.gb)).setVisibility(8);
            return;
        }
        ((ViewGroup)this.findViewById(2131296831)).setVisibility(0);
        final ViewGroup viewGroup = (ViewGroup)this.findViewById(2131296880);
        final SwitchCompat switchCompat = (SwitchCompat)this.findViewById(c.i.ib);
        final TextView textView = (TextView)this.findViewById(2131296889);
        final TextView textView2 = (TextView)this.findViewById(2131296882);
        final TextView textView3 = (TextView)this.findViewById(2131296887);
        final com.untis.mobile.utils.a i = this.I;
        if (i == null) {
            k0.S("appSettings");
            throw null;
        }
        final SilentModeSettings c = i.C();
        k0.o(c, "appSettings.silentModeSettings");
        final com.untis.mobile.utils.a j = this.I;
        if (j == null) {
            k0.S("appSettings");
            throw null;
        }
        switchCompat.setChecked(j.Q());
        final com.untis.mobile.utils.a a = com.untis.mobile.utils.a.a((Context)this);
        final Profile g2 = this.G;
        if (g2 == null) {
            k0.S("profile");
            throw null;
        }
        if (!a.I(g2)) {
            textView.setTextColor(d.f((Context)this, 2131099698));
            textView2.setTextColor(d.f((Context)this, 2131099696));
        }
        viewGroup.setOnClickListener((View$OnClickListener)new n(this, switchCompat));
        final j0 g3 = j0.G;
        final String profileId = c.profileId;
        k0.o(profileId, "settings.profileId");
        final Profile l = g3.l(profileId);
        final com.untis.mobile.utils.a k = this.I;
        if (k != null) {
            if (k.Q()) {
                final com.untis.mobile.utils.a m = this.I;
                if (m == null) {
                    k0.S("appSettings");
                    throw null;
                }
                final Profile g4 = this.G;
                if (g4 == null) {
                    k0.S("profile");
                    throw null;
                }
                if (m.I(g4)) {
                    textView3.setText((CharSequence)this.T(l, c));
                    textView3.setVisibility(0);
                    return;
                }
            }
            textView3.setText((CharSequence)"");
            textView3.setVisibility(8);
            return;
        }
        k0.S("appSettings");
        throw null;
    }
    
    private static final void h0(final SettingsActivity settingsActivity, final SwitchCompat switchCompat, final View view) {
        k0.p(settingsActivity, "this$0");
        final com.untis.mobile.utils.a i = settingsActivity.I;
        if (i == null) {
            k0.S("appSettings");
            throw null;
        }
        final Profile g = settingsActivity.G;
        if (g != null) {
            if (i.I(g)) {
                if (!settingsActivity.S().d()) {
                    settingsActivity.S().a((Context)settingsActivity);
                    return;
                }
                if (((CompoundButton)switchCompat).isChecked()) {
                    settingsActivity.s0();
                    final com.untis.mobile.utils.a j = settingsActivity.I;
                    if (j == null) {
                        k0.S("appSettings");
                        throw null;
                    }
                    j.X0(false);
                }
                else {
                    final List<Profile> s0 = j0.G.s0();
                    if (s0.size() == 1) {
                        settingsActivity.q0(s0.get(0));
                        final com.untis.mobile.utils.a k = settingsActivity.I;
                        if (k == null) {
                            k0.S("appSettings");
                            throw null;
                        }
                        k.X0(true);
                    }
                    else {
                        settingsActivity.q0(null);
                    }
                }
                switchCompat.toggle();
            }
            return;
        }
        k0.S("profile");
        throw null;
    }
    
    private final void i0() {
        this.findViewById(2131296871).setVisibility(0);
        final SeekBar seekBar = (SeekBar)this.findViewById(2131296873);
        final TextView textView = (TextView)this.findViewById(2131296872);
        final com.untis.mobile.utils.a a = com.untis.mobile.utils.a.a((Context)this);
        seekBar.setOnSeekBarChangeListener((SeekBar$OnSeekBarChangeListener)new SeekBar$OnSeekBarChangeListener() {
            final /* synthetic */ SettingsActivity c;
            
            public void onProgressChanged(@e final SeekBar seekBar, final int n, final boolean b) {
                k0.p(seekBar, "seekBar");
                com.untis.mobile.utils.a a = null;
                float n2 = 0.0f;
                Label_0113: {
                    if (n != 0) {
                        if (n != 1) {
                            if (n == 2) {
                                textView.setText(2131886672);
                                a = a;
                                n2 = u.m.b.c;
                                break Label_0113;
                            }
                            if (n == 3) {
                                textView.setText(2131886725);
                                a = a;
                                n2 = u.m.b.d;
                                break Label_0113;
                            }
                        }
                        textView.setText(2131886747);
                        a = a;
                        n2 = u.m.b.b;
                    }
                    else {
                        textView.setText(2131886777);
                        a = a;
                        n2 = u.m.b.a;
                    }
                }
                a.x0(n2);
                ((Activity)this.c).setResult(-1);
            }
            
            public void onStartTrackingTouch(@e final SeekBar seekBar) {
                k0.p(seekBar, "seekBar");
            }
            
            public void onStopTrackingTouch(@e final SeekBar seekBar) {
                k0.p(seekBar, "seekBar");
            }
        });
        seekBar.setProgress(this.R(a.x()));
    }
    
    private static final void j0(final SettingsActivity settingsActivity, final SwitchCompat switchCompat, final CompoundButton compoundButton, final boolean b) {
        k0.p(settingsActivity, "this$0");
        k0.p(switchCompat, "$colorModeSwitch");
        PreferenceManager.getDefaultSharedPreferences((Context)settingsActivity).edit().putBoolean("colormode", b).apply();
        com.untis.mobile.services.widget.c.G.b((Context)settingsActivity);
        ((Activity)settingsActivity).setResult(-1, (Intent)null);
        if (((CompoundButton)switchCompat).isChecked()) {
            settingsActivity.E();
        }
        else {
            settingsActivity.I();
        }
    }
    
    private static final void k0(final SettingsActivity settingsActivity, final View view) {
        k0.p(settingsActivity, "this$0");
        settingsActivity.onBackPressed();
    }
    
    private final void l0() {
        final ProfileEntityActivity.a i = ProfileEntityActivity.I;
        final Profile g = this.G;
        if (g != null) {
            ((ComponentActivity)this).startActivityForResult(i.a((Context)this, g.getUniqueId()), 160);
            return;
        }
        k0.S("profile");
        throw null;
    }
    
    private final String m0() {
        final com.untis.mobile.services.masterdata.a l = this.L;
        Displayable v = null;
        if (l != null) {
            final Profile g = this.G;
            if (g == null) {
                k0.S("profile");
                throw null;
            }
            final EntityType entityType = g.getEntityType();
            final Profile g2 = this.G;
            if (g2 == null) {
                k0.S("profile");
                throw null;
            }
            v = l.v(entityType, g2.getEntityId());
        }
        if (v == null) {
            return "";
        }
        return v.getDisplayableTitle();
    }
    
    @SuppressLint({ "InflateParams" })
    private final void n0() {
        final View inflate = ((Activity)this).getLayoutInflater().inflate(2131493044, (ViewGroup)null, false);
        Objects.requireNonNull(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        final LinearLayout linearLayout = (LinearLayout)inflate;
        final com.untis.mobile.utils.a a = com.untis.mobile.utils.a.a((Context)this);
        final int f = d.f((Context)this, 2131100063);
        for (final Profile profile : j0.G.s0()) {
            if (!a.M(profile)) {
                continue;
            }
            final SwitchCompat switchCompat = new SwitchCompat((Context)this);
            ((CompoundButton)switchCompat).setText((CharSequence)profile.getDisplayName());
            switchCompat.setChecked(profile.getLockScreen());
            ((CompoundButton)switchCompat).setTextColor(f);
            ((CompoundButton)switchCompat).setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)new com.untis.mobile.ui.activities.settings.d(profile));
            final int k = this.K;
            final int j = this.J;
            ((CompoundButton)switchCompat).setPadding(k, j, k, j);
            linearLayout.addView((View)switchCompat, (ViewGroup$LayoutParams)new LinearLayout$LayoutParams(-1, -2));
        }
        final d$a d$a = new d$a((Context)this, 2131952209);
        d$a.J(2131886612);
        d$a.M((View)linearLayout);
        d$a.B(2131886660, (DialogInterface$OnClickListener)new com.untis.mobile.ui.activities.settings.a(this));
        ((Dialog)d$a.a()).show();
    }
    
    private static final void o0(final Profile profile, final CompoundButton compoundButton, final boolean lockScreen) {
        k0.p(profile, "$profile");
        profile.setLockScreen(lockScreen);
        j0.G.d(profile);
    }
    
    private static final void p0(final SettingsActivity settingsActivity, final DialogInterface dialogInterface, final int n) {
        k0.p(settingsActivity, "this$0");
        settingsActivity.Q().stop();
        settingsActivity.Q().start();
        settingsActivity.t0();
        dialogInterface.dismiss();
    }
    
    private final void q0(final Profile profile) {
        Profile g = profile;
        if (profile == null) {
            g = this.G;
            if (g == null) {
                k0.S("profile");
                throw null;
            }
        }
        if (g.hasEntity()) {
            this.r0(g.getUniqueId(), g.getEntityType(), g.getEntityId());
            return;
        }
        ((ComponentActivity)this).startActivityForResult(ChooseTimetableEntityActivity.K.a((Context)this, g, EntityType.NONE), 224);
    }
    
    private final void r0(final String profileId, final EntityType entityType, final long entityId) {
        final com.untis.mobile.utils.a i = this.I;
        if (i == null) {
            k0.S("appSettings");
            throw null;
        }
        final SilentModeSettings c = i.C();
        k0.o(c, "appSettings.silentModeSettings");
        c.profileId = profileId;
        c.entityType = entityType.getWebuntisId();
        c.entityId = entityId;
        final com.untis.mobile.utils.a j = this.I;
        if (j == null) {
            k0.S("appSettings");
            throw null;
        }
        j.a1(c);
        this.S().a((Context)this);
        final TextView textView = (TextView)this.findViewById(2131296887);
        final j0 g = j0.G;
        final String profileId2 = c.profileId;
        k0.o(profileId2, "settings.profileId");
        final Profile l = g.l(profileId2);
        if (l == null) {
            return;
        }
        textView.setText((CharSequence)this.T(l, c));
        textView.setVisibility(0);
        final com.untis.mobile.utils.a k = this.I;
        if (k != null) {
            k.X0(true);
            this.O();
            this.M();
            this.S().c(profileId, entityType, entityId);
            return;
        }
        k0.S("appSettings");
        throw null;
    }
    
    private final void s0() {
        if (com.untis.mobile.utils.a.a((Context)this).Q()) {
            this.S().stop();
        }
        com.untis.mobile.utils.a.a((Context)this).X0(false);
        final TextView textView = (TextView)this.findViewById(2131296887);
        textView.setText((CharSequence)"");
        textView.setVisibility(8);
        this.H();
        this.G();
    }
    
    private final void t0() {
        ((TextView)this.findViewById(2131296862)).setText(2131886614);
        final StringBuilder sb = new StringBuilder();
        for (final Profile profile : j0.G.s0()) {
            if (!profile.getLockScreen()) {
                continue;
            }
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(profile.getDisplayName());
        }
        ((TextView)this.findViewById(2131296863)).setText((CharSequence)sb.toString());
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @Override
    public void a() {
        final Profile g = this.G;
        if (g != null) {
            this.q0(g);
            this.e0();
            return;
        }
        k0.S("profile");
        throw null;
    }
    
    protected void onActivityResult(final int n, int n2, @f final Intent intent) {
        super.onActivityResult(n, n2, intent);
        if (n2 == -1) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        if (n != 130) {
            if (n != 160) {
                if (n == 224) {
                    if (n2 != 0 && intent != null) {
                        final ChooseTimetableEntityActivity.a k = ChooseTimetableEntityActivity.K;
                        this.r0(k.e(intent), k.d(intent), k.c(intent));
                    }
                }
            }
            else if (n2 != 0) {
                this.W();
            }
        }
        else if (n2 != 0) {
            ((Activity)this).setResult(-1);
            com.untis.mobile.services.widget.c.G.b((Context)this);
        }
    }
    
    public void onBackPressed() {
        super.onBackPressed();
        ((Activity)this).overridePendingTransition(2130771996, 2130771998);
    }
    
    @Override
    protected void onCreate(@f final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131492959);
        final Profile n = j0.G.n();
        if (n == null) {
            throw new IllegalStateException("no current profile");
        }
        this.G = n;
        this.L = n.getMasterDataService();
        final int j = (int)this.getResources().getDimension(2131165277);
        this.J = j;
        this.K = (int)(j * 1.5f);
        final com.untis.mobile.utils.a a = com.untis.mobile.utils.a.a((Context)this);
        k0.o(a, "appSettings(this)");
        this.I = a;
        this.H = this.findViewById(2131296870);
        this.b0(2131296903, 0, "schedulemode", true, false);
        this.b0(2131296847, 2131296850, "colormode", true, false);
        this.b0(2131296840, 2131296844, "cancelled_periods_display", false, false);
        this.b0(2131296838, 2131296846, "cancelled_periods", true, false);
        this.b0(2131296876, 2131296879, "show_rooms", true, false);
        this.b0(2131296899, 2131296902, "teacher_full", true, false);
        this.b0(2131296895, 2131296898, "subjects_full", true, false);
        this.b0(2131296855, 2131296858, "element_color", true, false);
        this.i0();
        final View child = ((ViewGroup)this.findViewById(2131296847)).getChildAt(1);
        Objects.requireNonNull(child, "null cannot be cast to non-null type androidx.appcompat.widget.SwitchCompat");
        final SwitchCompat switchCompat = (SwitchCompat)child;
        ((CompoundButton)switchCompat).setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)new com.untis.mobile.ui.activities.settings.e(this, switchCompat));
        if (((CompoundButton)switchCompat).isChecked()) {
            this.E();
        }
        else {
            this.I();
        }
        this.Z();
        this.g0();
        this.e0();
        this.f0();
        this.W();
        this.U();
        final Profile g = this.G;
        if (g != null) {
            if (!g.isEndOfPremium()) {
                final HelpActivity.a i = HelpActivity.I;
                final View h = this.H;
                k0.m(h);
                i.t(this, h);
            }
            ((ImageView)this.findViewById(c.i.ja)).setOnClickListener((View$OnClickListener)new i(this));
            return;
        }
        k0.S("profile");
        throw null;
    }
    
    public boolean onCreateOptionsMenu(@e final Menu menu) {
        k0.p(menu, "menu");
        this.getMenuInflater().inflate(2131558409, menu);
        return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(@e final MenuItem menuItem) {
        k0.p(menuItem, "item");
        final int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            ((Activity)this).finish();
            ((Activity)this).overridePendingTransition(2130771996, 2130771998);
            return true;
        }
        if (itemId != 2131298579) {
            return super.onOptionsItemSelected(menuItem);
        }
        ((Activity)this).startActivity(AboutUsActivity.J.a((Context)this));
        return true;
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        this.g0();
        this.e0();
        this.f0();
        this.Y();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b" }, d2 = { "com/untis/mobile/ui/activities/settings/SettingsActivity$a", "", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final Intent a(@e final Context context) {
            k0.p(context, "context");
            return new Intent(context, (Class)SettingsActivity.class);
        }
    }
}
