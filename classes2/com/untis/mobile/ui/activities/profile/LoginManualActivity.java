// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.profile;

import android.widget.ImageView;
import androidx.activity.ComponentActivity;
import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;
import android.os.Parcelable;
import android.content.Intent;
import androidx.lifecycle.l0;
import okhttp3.internal.d;
import kotlin.j2;
import n6.l;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatImageView;
import org.jetbrains.annotations.f;
import android.os.Bundle;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.ui.activities.timetable.TimeTableActivity;
import android.content.Context;
import androidx.appcompat.widget.AppCompatButton;
import com.untis.mobile.utils.extension.h;
import com.google.android.material.textfield.TextInputEditText;
import kotlin.jvm.internal.k0;
import android.view.View;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import androidx.lifecycle.y;
import kotlin.jvm.internal.m0;
import n6.a;
import kotlin.jvm.internal.w;
import kotlin.b0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.activities.common.b;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0014R\u001d\u0010\u0010\u001a\u00020\u000b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0015" }, d2 = { "Lcom/untis/mobile/ui/activities/profile/LoginManualActivity;", "Lcom/untis/mobile/ui/activities/common/b;", "Lcom/untis/mobile/ui/activities/profile/c0;", "data", "Lkotlin/j2;", "F", "Landroid/os/Bundle;", "args", "y", "savedInstanceState", "onCreate", "Lcom/untis/mobile/ui/activities/profile/f0;", "G", "Lkotlin/b0;", "x", "()Lcom/untis/mobile/ui/activities/profile/f0;", "viewModel", "<init>", "()V", "H", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class LoginManualActivity extends b
{
    @e
    public static final a H;
    @e
    private static final String I = "profile_id";
    @e
    private static final String J = "qr_code_data";
    @e
    private final b0 G;
    
    static {
        H = new a(null);
    }
    
    public LoginManualActivity() {
        this.G = d0.c((n6.a<?>)new n6.a<f0>() {
            final /* synthetic */ y G;
            
            @e
            @Override
            public final f0 invoke() {
                return (f0)org.koin.androidx.viewmodel.ext.android.b.b(this.G, k1.d(f0.class), null, null);
            }
        });
    }
    
    private static final void A(final LoginManualActivity loginManualActivity, final View view) {
        k0.p(loginManualActivity, "this$0");
        loginManualActivity.x().s();
    }
    
    private static final void B(final LoginManualActivity loginManualActivity, final Boolean b) {
        k0.p(loginManualActivity, "this$0");
        final TextInputEditText textInputEditText = (TextInputEditText)loginManualActivity.findViewById(2131296678);
        k0.o(b, "it");
        ((EditText)textInputEditText).setVisibility(h.U(b, 0, 1, null));
    }
    
    private static final void C(final LoginManualActivity loginManualActivity, final c0 c0) {
        k0.p(loginManualActivity, "this$0");
        k0.o(c0, "it");
        loginManualActivity.F(c0);
    }
    
    private static final void D(final LoginManualActivity loginManualActivity, final Boolean b) {
        k0.p(loginManualActivity, "this$0");
        final View viewById = loginManualActivity.findViewById(2131298385);
        k0.o(b, "it");
        viewById.setVisibility(h.U(b, 0, 1, null));
    }
    
    private static final void E(final LoginManualActivity loginManualActivity, final Boolean b) {
        k0.p(loginManualActivity, "this$0");
        final AppCompatButton appCompatButton = (AppCompatButton)loginManualActivity.findViewById(2131296668);
        k0.o(b, "it");
        ((Button)appCompatButton).setEnabled((boolean)b);
    }
    
    private final void F(final c0 c0) {
        final Throwable e = c0.e();
        Throwable cause;
        if (e == null) {
            cause = null;
        }
        else {
            cause = e.getCause();
        }
        Throwable e2 = cause;
        if (cause == null) {
            e2 = c0.e();
        }
        if (e2 != null) {
            h.l((Context)this, e2);
            return;
        }
        final Profile b = c0.b();
        if (b != null) {
            ((Activity)this).startActivity(TimeTableActivity.L.d((Context)this, b));
            ((Activity)this).setResult(-1);
            ((Activity)this).finish();
            return;
        }
        final TextInputEditText textInputEditText = (TextInputEditText)this.findViewById(2131296670);
        ((EditText)textInputEditText).setEnabled(c0.a() ^ true);
        ((EditText)textInputEditText).setText((CharSequence)c0.c());
        final TextInputEditText textInputEditText2 = (TextInputEditText)this.findViewById(2131296672);
        ((EditText)textInputEditText2).setEnabled(c0.a() ^ true);
        ((EditText)textInputEditText2).setText((CharSequence)c0.d());
        final TextInputEditText textInputEditText3 = (TextInputEditText)this.findViewById(2131296676);
        ((EditText)textInputEditText3).setEnabled(c0.a() ^ true);
        ((EditText)textInputEditText3).setText((CharSequence)c0.f());
        ((EditText)this.findViewById(2131296674)).setText((CharSequence)c0.g());
    }
    
    private final f0 x() {
        return this.G.getValue();
    }
    
    private final void y(final Bundle bundle) {
        final boolean b = false;
        if (bundle != null && bundle.containsKey("profile_id")) {
            this.x().t(bundle.getString("profile_id"));
        }
        int n;
        if (bundle == null) {
            n = (b ? 1 : 0);
        }
        else {
            n = (b ? 1 : 0);
            if (bundle.containsKey("qr_code_data")) {
                n = 1;
            }
        }
        if (n != 0) {
            this.x().u((v0)bundle.getParcelable("qr_code_data"));
        }
    }
    
    private static final void z(final LoginManualActivity loginManualActivity, final View view) {
        k0.p(loginManualActivity, "this$0");
        ((ComponentActivity)loginManualActivity).onBackPressed();
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @Override
    protected void onCreate(@f final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131492930);
        Bundle extras = bundle;
        if (bundle == null) {
            extras = ((Activity)this).getIntent().getExtras();
        }
        this.y(extras);
        ((ImageView)this.findViewById(2131296667)).setOnClickListener((View$OnClickListener)new x(this));
        ((Button)this.findViewById(2131296668)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.profile.w(this));
        final TextInputEditText textInputEditText = (TextInputEditText)this.findViewById(2131296670);
        k0.o(textInputEditText, "");
        h.B(textInputEditText, new l<String, j2>() {
            public final void invoke(@e final String s) {
                k0.p(s, "it");
                LoginManualActivity.this.x().v(s);
            }
        });
        final TextInputEditText textInputEditText2 = (TextInputEditText)this.findViewById(2131296672);
        ((EditText)textInputEditText2).requestFocus();
        k0.o(textInputEditText2, "");
        h.B(textInputEditText2, new l<String, j2>() {
            public final void invoke(@e final String s) {
                k0.p(s, "it");
                LoginManualActivity.this.x().w(s);
            }
        });
        final TextInputEditText textInputEditText3 = (TextInputEditText)this.findViewById(2131296676);
        k0.o(textInputEditText3, "");
        h.B(textInputEditText3, new l<String, j2>() {
            public final void invoke(@e final String s) {
                k0.p(s, "it");
                LoginManualActivity.this.x().x(s);
            }
        });
        final TextInputEditText textInputEditText4 = (TextInputEditText)this.findViewById(2131296674);
        k0.o(textInputEditText4, "");
        h.B(textInputEditText4, new l<String, j2>() {
            public final void invoke(@e final String s) {
                k0.p(s, "it");
                LoginManualActivity.this.x().y(s);
            }
        });
        final TextInputEditText textInputEditText5 = (TextInputEditText)this.findViewById(2131296678);
        k0.o(textInputEditText5, "");
        h.B(textInputEditText5, new l<String, j2>() {
            public final void invoke(@e final String s) {
                k0.p(s, "it");
                LoginManualActivity.this.x().z(d.e0(s, 0L));
            }
        });
        this.x().q().j((y)this, (l0)new com.untis.mobile.ui.activities.profile.y(this));
        this.x().A().j((y)this, (l0)new com.untis.mobile.ui.activities.profile.b0(this));
        this.x().k().j((y)this, (l0)new a0(this));
        this.x().B().j((y)this, (l0)new z(this));
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006R\u0016\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\u000f" }, d2 = { "com/untis/mobile/ui/activities/profile/LoginManualActivity$a", "", "Landroid/content/Context;", "context", "", "profileId", "Lcom/untis/mobile/ui/activities/profile/v0;", "qrCodeData", "Landroid/content/Intent;", "a", "ARGUMENT_PROFILE_ID", "Ljava/lang/String;", "ARGUMENT_QR_CODE_DATA", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final Intent a(@e final Context context, @f final String s, @f final v0 v0) {
            k0.p(context, "context");
            final Intent intent = new Intent(context, (Class)LoginManualActivity.class);
            final Bundle bundle = new Bundle();
            bundle.putString("profile_id", s);
            bundle.putParcelable("qr_code_data", (Parcelable)v0);
            intent.putExtras(bundle);
            return intent;
        }
    }
}
