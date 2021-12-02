// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.profile;

import android.widget.ImageButton;
import android.widget.FrameLayout;
import android.app.Dialog;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.activity.ComponentActivity;
import android.app.Activity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import android.view.View$OnClickListener;
import androidx.cardview.widget.CardView;
import android.widget.TextView$OnEditorActionListener;
import android.os.Bundle;
import org.jetbrains.annotations.f;
import android.content.DialogInterface$OnClickListener;
import androidx.appcompat.app.d$a;
import android.text.Editable;
import android.widget.Toast;
import android.util.Log;
import com.google.android.material.textfield.TextInputLayout;
import com.untis.mobile.api.common.JsonRpcErrorType;
import java.util.Objects;
import com.untis.mobile.api.error.JsonRpcError;
import kotlin.jvm.internal.m0;
import kotlin.j2;
import com.untis.mobile.utils.s;
import com.untis.mobile.services.profile.legacy.a;
import com.google.android.material.textfield.TextInputEditText;
import org.joda.time.t;
import java.util.Set;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.ui.activities.qrcodereader.ScanQrCodeActivity;
import android.content.Intent;
import com.untis.mobile.persistence.models.profile.Profile;
import android.content.Context;
import com.untis.mobile.ui.activities.timetable.TimeTableActivity;
import com.untis.mobile.services.profile.legacy.j0;
import com.untis.mobile.persistence.models.profile.ProfileState;
import android.view.View;
import kotlin.jvm.internal.k0;
import android.view.KeyEvent;
import android.widget.TextView;
import com.untis.mobile.c;
import android.widget.RelativeLayout;
import android.content.DialogInterface;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.activities.common.b;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u00052\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\u0012\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002J\u0012\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014J\"\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014J\u0010\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0012H\u0014R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\"" }, d2 = { "Lcom/untis/mobile/ui/activities/profile/InvalidApiKeyActivity;", "Lcom/untis/mobile/ui/activities/common/b;", "Lkotlin/j2;", "J", "I", "H", "L", "", "P", "Lcom/untis/mobile/persistence/models/profile/Profile;", "K", "", "Q", "O", "B", "Landroid/content/Intent;", "data", "z", "Landroid/os/Bundle;", "save", "onCreate", "", "requestCode", "resultCode", "onActivityResult", "outState", "onSaveInstanceState", "", "G", "Ljava/lang/String;", "profileId", "<init>", "()V", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class InvalidApiKeyActivity extends b
{
    @e
    public static final a H;
    @e
    private static final String I = "olga";
    private String G;
    
    static {
        H = new a(null);
    }
    
    private static final void A(final DialogInterface dialogInterface, final int n) {
        dialogInterface.cancel();
    }
    
    private final void B() {
        ((RelativeLayout)this.findViewById(c.i.nE)).setVisibility(8);
    }
    
    private static final boolean C(final InvalidApiKeyActivity invalidApiKeyActivity, final TextView textView, final int n, final KeyEvent keyEvent) {
        k0.p(invalidApiKeyActivity, "this$0");
        if (n == 6) {
            invalidApiKeyActivity.H();
            return true;
        }
        return false;
    }
    
    private static final boolean D(final InvalidApiKeyActivity invalidApiKeyActivity, final TextView textView, final int n, final KeyEvent keyEvent) {
        k0.p(invalidApiKeyActivity, "this$0");
        if (n == 6) {
            invalidApiKeyActivity.H();
            return true;
        }
        return false;
    }
    
    private static final void E(final InvalidApiKeyActivity invalidApiKeyActivity, final View view) {
        k0.p(invalidApiKeyActivity, "this$0");
        invalidApiKeyActivity.I();
    }
    
    private static final void F(final InvalidApiKeyActivity invalidApiKeyActivity, final View view) {
        k0.p(invalidApiKeyActivity, "this$0");
        invalidApiKeyActivity.J();
    }
    
    private static final void G(final InvalidApiKeyActivity invalidApiKeyActivity, final View view) {
        k0.p(invalidApiKeyActivity, "this$0");
        invalidApiKeyActivity.H();
    }
    
    private final void H() {
        if (this.Q()) {
            this.L();
        }
    }
    
    private final void I() {
        final Profile k = this.K();
        k.getStates().add(ProfileState.InvalidApiSharedSecret);
        j0.G.d(k);
        final Intent d = TimeTableActivity.L.d((Context)this, k);
        d.setFlags(268468224);
        ((Activity)this).startActivity(d);
        ((Activity)this).finish();
    }
    
    private final void J() {
        ((ComponentActivity)this).startActivityForResult(ScanQrCodeActivity.K.b((Context)this), 162);
    }
    
    private final Profile K() {
        final j0 g = j0.G;
        final String g2 = this.G;
        if (g2 != null) {
            Profile l;
            if ((l = g.l(g2)) == null) {
                l = new Profile(0L, null, null, null, 0L, null, 0L, null, null, null, null, null, false, false, 0L, null, null, null, 0L, null, false, null, 0L, 0, null, null, false, false, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, null, 0L, false, null, null, null, null, null, null, 0L, false, 0L, -1, 65535, null);
            }
            return l;
        }
        k0.S("profileId");
        throw null;
    }
    
    private final void L() {
        this.O();
        com.untis.mobile.services.profile.legacy.a.a.a(j0.G, this.K(), String.valueOf(((AppCompatEditText)this.findViewById(c.i.B6)).getText()), this.P(), false, 8, null).C5((rx.functions.b)new g(this), (rx.functions.b)new h(this));
    }
    
    private static final void M(final InvalidApiKeyActivity invalidApiKeyActivity, final Profile profile) {
        k0.p(invalidApiKeyActivity, "this$0");
        final j0 g = j0.G;
        k0.o(profile, "profile");
        g.h(profile);
        final Intent d = TimeTableActivity.L.d((Context)invalidApiKeyActivity, profile);
        d.setFlags(805339136);
        ((Activity)invalidApiKeyActivity).startActivity(d);
    }
    
    private static final void N(final InvalidApiKeyActivity invalidApiKeyActivity, final Throwable t) {
        k0.p(invalidApiKeyActivity, "this$0");
        s.a.N(new n6.a<j2>() {
            public final void invoke() {
                InvalidApiKeyActivity.this.B();
                if (t.getCause() instanceof JsonRpcError) {
                    final Throwable cause = t.getCause();
                    Objects.requireNonNull(cause, "null cannot be cast to non-null type com.untis.mobile.api.error.JsonRpcError");
                    if (((JsonRpcError)cause).isAnyOf(JsonRpcErrorType.Require2FactorAuthenticationToken)) {
                        final InvalidApiKeyActivity g = invalidApiKeyActivity;
                        final int e6 = c.i.E6;
                        ((LinearLayout)g.findViewById(e6)).setVisibility(0);
                        ((LinearLayout)invalidApiKeyActivity.findViewById(e6)).requestFocus();
                        return;
                    }
                }
                Log.e("untis_log", "error while updating profile", t);
                Toast.makeText((Context)invalidApiKeyActivity, (CharSequence)"error", 1).show();
            }
        });
    }
    
    private final void O() {
        ((RelativeLayout)this.findViewById(c.i.nE)).setVisibility(0);
    }
    
    private final long P() {
        long long1;
        try {
            long1 = Long.parseLong(String.valueOf(((AppCompatEditText)this.findViewById(c.i.D6)).getText()));
        }
        catch (Exception ex) {
            long1 = 0L;
        }
        return long1;
    }
    
    private final boolean Q() {
        final int e6 = c.i.E6;
        final int visibility = ((LinearLayout)this.findViewById(e6)).getVisibility();
        boolean b = false;
        if (visibility == 0) {
            final Editable text = ((AppCompatEditText)this.findViewById(c.i.D6)).getText();
            if (text != null && ((CharSequence)text).length() == 0) {
                ((TextInputLayout)this.findViewById(e6)).setError((CharSequence)((Activity)this).getString(2131886702));
                return b;
            }
        }
        b = true;
        return b;
    }
    
    private final void z(final Intent intent) {
        final v0 a = ScanQrCodeActivity.K.a(intent);
        if (a != null && a.e().length() != 0) {
            ((EditText)this.findViewById(c.i.B6)).setText((CharSequence)a.d());
            return;
        }
        ((Dialog)new d$a((Context)this).m(2131886130).r(2131886660, (DialogInterface$OnClickListener)com.untis.mobile.ui.activities.profile.a.G).a()).show();
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    protected void onActivityResult(final int n, final int n2, @f final Intent intent) {
        final boolean b = n2 == -1;
        if (n == 162) {
            if (b) {
                this.z(intent);
            }
        }
        else {
            super.onActivityResult(n, n2, intent);
        }
    }
    
    @Override
    protected void onCreate(@f final Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = bundle;
        if (bundle == null) {
            extras = ((Activity)this).getIntent().getExtras();
        }
        String g = "";
        if (extras != null) {
            final String string = extras.getString("olga", "");
            if (string != null) {
                g = string;
            }
        }
        this.G = g;
        this.setContentView(2131492926);
        ((EditText)this.findViewById(c.i.B6)).setOnEditorActionListener((TextView$OnEditorActionListener)new com.untis.mobile.ui.activities.profile.e(this));
        ((EditText)this.findViewById(c.i.D6)).setOnEditorActionListener((TextView$OnEditorActionListener)new com.untis.mobile.ui.activities.profile.f(this));
        ((FrameLayout)this.findViewById(c.i.x6)).setOnClickListener((View$OnClickListener)new d(this));
        ((FrameLayout)this.findViewById(c.i.y6)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.profile.b(this));
        ((ImageButton)this.findViewById(c.i.z6)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.profile.c(this));
        final androidx.appcompat.app.a supportActionBar = this.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0((CharSequence)this.K().getDisplayName());
        }
        final androidx.appcompat.app.a supportActionBar2 = this.getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.y0((CharSequence)this.K().getSchoolDisplayName());
        }
    }
    
    protected void onSaveInstanceState(@e final Bundle bundle) {
        k0.p(bundle, "outState");
        super.onSaveInstanceState(bundle);
        final String g = this.G;
        if (g != null) {
            bundle.putString("olga", g);
            return;
        }
        k0.S("profileId");
        throw null;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f" }, d2 = { "com/untis/mobile/ui/activities/profile/InvalidApiKeyActivity$a", "", "Landroid/content/Context;", "context", "", "profileId", "Landroid/content/Intent;", "a", "BUNDLE_PROFILE_ID", "Ljava/lang/String;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final Intent a(@e final Context context, @e final String s) {
            k0.p(context, "context");
            k0.p(s, "profileId");
            final Intent intent = new Intent(context, (Class)InvalidApiKeyActivity.class);
            final Bundle bundle = new Bundle();
            bundle.putString("olga", s);
            intent.putExtras(bundle);
            return intent;
        }
    }
}
