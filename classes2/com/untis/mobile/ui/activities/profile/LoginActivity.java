// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.profile;

import android.widget.ImageView;
import android.widget.Button;
import android.widget.EditText;
import android.app.Activity;
import android.app.Dialog;
import androidx.activity.ComponentActivity;
import android.os.Parcelable;
import android.content.Intent;
import androidx.lifecycle.l0;
import okhttp3.internal.d;
import android.widget.TextView$OnEditorActionListener;
import kotlin.j2;
import n6.l;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.Objects;
import androidx.appcompat.widget.AppCompatTextView;
import org.jetbrains.annotations.f;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.api.common.JsonRpcErrorType;
import com.untis.mobile.api.error.JsonRpcError;
import com.untis.mobile.ui.activities.timetable.TimeTableActivity;
import androidx.appcompat.widget.AppCompatButton;
import com.google.android.material.textfield.TextInputEditText;
import android.annotation.SuppressLint;
import android.view.ViewGroup;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import androidx.appcompat.app.d$a;
import com.untis.mobile.ui.fragments.resetpassword.ResetPasswordActivity;
import android.view.KeyEvent;
import android.widget.TextView;
import kotlin.jvm.internal.k0;
import android.view.View;
import android.content.Context;
import com.untis.mobile.utils.extension.h;
import com.untis.mobile.api.schoolsearch.SchoolSearchSchool;
import android.os.Bundle;
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

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0002J\b\u0010\f\u001a\u00020\u0004H\u0003J\b\u0010\r\u001a\u00020\u0004H\u0002J\u0012\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002J\u0012\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0014R\u001d\u0010\u0018\u001a\u00020\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001d" }, d2 = { "Lcom/untis/mobile/ui/activities/profile/LoginActivity;", "Lcom/untis/mobile/ui/activities/common/b;", "", "showLoading", "Lkotlin/j2;", "O", "Lcom/untis/mobile/ui/activities/profile/s;", "data", "T", "N", "D", "P", "R", "M", "Landroid/os/Bundle;", "args", "C", "savedInstanceState", "onCreate", "Lcom/untis/mobile/ui/activities/profile/v;", "G", "Lkotlin/b0;", "B", "()Lcom/untis/mobile/ui/activities/profile/v;", "viewModel", "<init>", "()V", "H", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class LoginActivity extends b
{
    @e
    public static final a H;
    @e
    private static final String I = "school";
    private static final int J = 1234;
    @e
    private final b0 G;
    
    static {
        H = new a(null);
    }
    
    public LoginActivity() {
        this.G = d0.c((n6.a<?>)new n6.a<v>() {
            final /* synthetic */ y G;
            
            @e
            @Override
            public final v invoke() {
                return (v)org.koin.androidx.viewmodel.ext.android.b.b(this.G, k1.d(v.class), null, null);
            }
        });
    }
    
    private final v B() {
        return this.G.getValue();
    }
    
    private final void C(final Bundle bundle) {
        SchoolSearchSchool schoolSearchSchool;
        if (bundle == null) {
            schoolSearchSchool = null;
        }
        else {
            schoolSearchSchool = (SchoolSearchSchool)bundle.getParcelable("school");
        }
        if (schoolSearchSchool == null) {
            h.k((Context)this, "no school available");
            return;
        }
        this.B().p(schoolSearchSchool);
    }
    
    private final void D() {
        if (v.n(this.B(), "#anonymous#", null, 2, null)) {
            this.R();
            return;
        }
        this.B().t();
    }
    
    private static final void E(final LoginActivity loginActivity, final View view) {
        k0.p(loginActivity, "this$0");
        ((ComponentActivity)loginActivity).onBackPressed();
    }
    
    private static final void F(final LoginActivity loginActivity, final Boolean b) {
        k0.p(loginActivity, "this$0");
        k0.o(b, "it");
        loginActivity.O(b);
    }
    
    private static final boolean G(final LoginActivity loginActivity, final TextView textView, final int n, final KeyEvent keyEvent) {
        k0.p(loginActivity, "this$0");
        if (n == 6) {
            loginActivity.N();
            return true;
        }
        return false;
    }
    
    private static final boolean H(final LoginActivity loginActivity, final TextView textView, final int n, final KeyEvent keyEvent) {
        k0.p(loginActivity, "this$0");
        if (n == 6) {
            loginActivity.N();
            return true;
        }
        return false;
    }
    
    private static final void I(final LoginActivity loginActivity, final View view) {
        k0.p(loginActivity, "this$0");
        loginActivity.N();
    }
    
    private static final void J(final LoginActivity loginActivity, final View view) {
        k0.p(loginActivity, "this$0");
        loginActivity.D();
    }
    
    private static final void K(final LoginActivity loginActivity, final View view) {
        k0.p(loginActivity, "this$0");
        loginActivity.M();
    }
    
    private static final void L(final LoginActivity loginActivity, final s s) {
        k0.p(loginActivity, "this$0");
        k0.o(s, "it");
        loginActivity.T(s);
    }
    
    private final void M() {
        ((ComponentActivity)this).startActivityForResult(ResetPasswordActivity.K.a((Context)this, this.B().e().getServer(), this.B().e().getSchoolId(), this.B().e().getLoginName(), this.B().g()), 1234);
    }
    
    private final void N() {
        if (v.n(this.B(), null, null, 3, null)) {
            this.R();
            return;
        }
        this.B().u();
    }
    
    private final void O(final boolean b) {
        this.findViewById(2131298385).setVisibility(h.U(b, 0, 1, null));
    }
    
    private final void P() {
        ((Dialog)new d$a((Context)this).m(2131886705).B(2131886660, (DialogInterface$OnClickListener)i.G).a()).show();
    }
    
    private static final void Q(final DialogInterface dialogInterface, final int n) {
        dialogInterface.dismiss();
    }
    
    @SuppressLint({ "InflateParams" })
    private final void R() {
        ((Dialog)new d$a((Context)this).M(((Activity)this).getLayoutInflater().inflate(2131493048, (ViewGroup)null, false)).B(2131886660, (DialogInterface$OnClickListener)j.G).a()).show();
    }
    
    private static final void S(final DialogInterface dialogInterface, final int n) {
        dialogInterface.dismiss();
    }
    
    private final void T(final s s) {
        final View viewById = this.findViewById(2131296665);
        final boolean c = s.c();
        Throwable cause = null;
        viewById.setVisibility(h.U(c, 0, 1, null));
        final TextInputEditText textInputEditText = (TextInputEditText)this.findViewById(2131296664);
        if (!s.c()) {
            ((EditText)textInputEditText).setText((CharSequence)"");
        }
        ((Button)this.findViewById(2131296659)).setEnabled(s.a());
        final Profile b = s.b();
        if (b != null) {
            ((Activity)this).startActivity(TimeTableActivity.L.d((Context)this, b));
            ((Activity)this).setResult(-1);
            ((Activity)this).finish();
            return;
        }
        final Throwable d = s.d();
        if (d != null) {
            cause = d.getCause();
        }
        Throwable d2 = cause;
        if (cause == null) {
            d2 = s.d();
        }
        if (d2 != null) {
            if (d2 instanceof JsonRpcError && ((JsonRpcError)d2).isAnyOf(JsonRpcErrorType.NoPublicAccess)) {
                this.P();
                return;
            }
            Throwable d3 = s.d();
            if (d3 == null) {
                d3 = d2;
            }
            h.l((Context)this, d3);
        }
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @Override
    protected void onCreate(@f final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131492929);
        Bundle extras = bundle;
        if (bundle == null) {
            extras = ((Activity)this).getIntent().getExtras();
        }
        this.C(extras);
        final AppCompatTextView appCompatTextView = (AppCompatTextView)this.findViewById(2131296684);
        final String displayName = this.B().e().getDisplayName();
        Objects.requireNonNull(displayName, "null cannot be cast to non-null type kotlin.CharSequence");
        ((TextView)appCompatTextView).setText((CharSequence)kotlin.text.s.B5((CharSequence)displayName).toString());
        ((ImageView)this.findViewById(2131296657)).setOnClickListener((View$OnClickListener)new k(this));
        final TextInputEditText textInputEditText = (TextInputEditText)this.findViewById(2131296661);
        ((EditText)textInputEditText).requestFocus();
        k0.o(textInputEditText, "");
        h.B(textInputEditText, new l<String, j2>() {
            public final void invoke(@e final String s) {
                k0.p(s, "it");
                LoginActivity.this.B().r(s);
            }
        });
        final TextInputEditText textInputEditText2 = (TextInputEditText)this.findViewById(2131296663);
        k0.o(textInputEditText2, "");
        h.B(textInputEditText2, new l<String, j2>() {
            public final void invoke(@e final String s) {
                k0.p(s, "it");
                LoginActivity.this.B().o(s);
            }
        });
        ((EditText)textInputEditText2).setOnEditorActionListener((TextView$OnEditorActionListener)new o(this));
        final TextInputEditText textInputEditText3 = (TextInputEditText)this.findViewById(2131296664);
        k0.o(textInputEditText3, "");
        h.B(textInputEditText3, new l<String, j2>() {
            public final void invoke(@e final String s) {
                k0.p(s, "it");
                LoginActivity.this.B().q(d.e0(s, 0L));
            }
        });
        ((EditText)textInputEditText3).setOnEditorActionListener((TextView$OnEditorActionListener)new p(this));
        ((Button)this.findViewById(2131296659)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.profile.l(this));
        ((Button)this.findViewById(2131296656)).setOnClickListener((View$OnClickListener)new n(this));
        ((TextView)this.findViewById(2131296658)).setOnClickListener((View$OnClickListener)new m(this));
        this.B().k().j((y)this, (l0)new q(this));
        this.B().s().j((y)this, (l0)new r(this));
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010" }, d2 = { "com/untis/mobile/ui/activities/profile/LoginActivity$a", "", "Landroid/content/Context;", "context", "Lcom/untis/mobile/api/schoolsearch/SchoolSearchSchool;", "school", "Landroid/content/Intent;", "a", "", "BUNDLE_SCHOOL", "Ljava/lang/String;", "", "PROFILE_RESET_PASSWORD", "I", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final Intent a(@e final Context context, @e final SchoolSearchSchool schoolSearchSchool) {
            k0.p(context, "context");
            k0.p(schoolSearchSchool, "school");
            final Intent intent = new Intent(context, (Class)LoginActivity.class);
            final Bundle bundle = new Bundle();
            bundle.putParcelable("school", (Parcelable)schoolSearchSchool);
            intent.putExtras(bundle);
            return intent;
        }
    }
}
