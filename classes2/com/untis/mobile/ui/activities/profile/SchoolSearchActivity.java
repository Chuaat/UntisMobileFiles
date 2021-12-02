// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.profile;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.EditText;
import androidx.activity.ComponentActivity;
import android.app.Activity;
import android.view.ViewGroup;
import androidx.lifecycle.l0;
import androidx.appcompat.widget.AppCompatButton;
import android.widget.TextView$OnEditorActionListener;
import kotlin.j2;
import n6.l;
import androidx.appcompat.widget.AppCompatImageView;
import android.os.Bundle;
import org.jetbrains.annotations.f;
import androidx.recyclerview.widget.RecyclerView$h;
import java.util.List;
import com.untis.mobile.api.common.JsonRpcErrorType;
import com.untis.mobile.api.error.JsonRpcError;
import java.util.Objects;
import com.untis.mobile.utils.extension.h;
import android.text.Editable;
import kotlinx.coroutines.CoroutineExceptionHandler;
import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import android.app.AlertDialog$Builder;
import com.untis.mobile.ui.activities.qrcodereader.ScanQrCodeActivity;
import android.content.Intent;
import kotlin.text.s;
import kotlin.jvm.internal.k0;
import android.view.View;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import androidx.core.content.d;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import androidx.recyclerview.widget.RecyclerView;
import com.untis.mobile.api.schoolsearch.SchoolSearchSchool;
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

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00172\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\u0004H\u0002J\b\u0010\r\u001a\u00020\u0004H\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0002J\b\u0010\u000f\u001a\u00020\u0004H\u0002J\b\u0010\u0010\u001a\u00020\u0004H\u0002J\b\u0010\u0011\u001a\u00020\u0004H\u0002J\b\u0010\u0012\u001a\u00020\u0004H\u0002J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0012\u0010\u0017\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0016H\u0002J\u0012\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0014J\"\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0016H\u0014R\u001d\u0010#\u001a\u00020\u001f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"¨\u0006'" }, d2 = { "Lcom/untis/mobile/ui/activities/profile/SchoolSearchActivity;", "Lcom/untis/mobile/ui/activities/common/b;", "Lcom/untis/mobile/ui/activities/profile/i1;", "data", "Lkotlin/j2;", "W", "", "throwable", "E", "Lcom/untis/mobile/api/schoolsearch/SchoolSearchSchool;", "school", "U", "T", "S", "F", "B", "R", "D", "J", "", "showLoading", "V", "Landroid/content/Intent;", "H", "Landroid/os/Bundle;", "save", "onCreate", "", "requestCode", "resultCode", "onActivityResult", "Lcom/untis/mobile/ui/activities/profile/h1;", "G", "Lkotlin/b0;", "()Lcom/untis/mobile/ui/activities/profile/h1;", "viewModel", "<init>", "()V", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class SchoolSearchActivity extends b
{
    @e
    public static final a H;
    @e
    private final b0 G;
    
    static {
        H = new a(null);
    }
    
    public SchoolSearchActivity() {
        this.G = d0.c((n6.a<?>)new n6.a<h1>() {
            final /* synthetic */ y G;
            
            @e
            @Override
            public final h1 invoke() {
                return (h1)org.koin.androidx.viewmodel.ext.android.b.b(this.G, k1.d(h1.class), null, null);
            }
        });
    }
    
    private final void B() {
        ((ViewGroup)this.findViewById(2131296826)).setVisibility(8);
        this.findViewById(2131298381).setVisibility(0);
        ((FloatingActionButton)this.findViewById(2131298380)).setImageDrawable(d.i((Context)this, 2131230923));
        ((TextView)this.findViewById(2131298383)).setText((CharSequence)((Activity)this).getString(2131886599));
        ((TextView)this.findViewById(2131298382)).setText((CharSequence)((Activity)this).getString(2131886598));
        final AppCompatTextView appCompatTextView = (AppCompatTextView)this.findViewById(2131298379);
        ((TextView)appCompatTextView).setVisibility(0);
        ((TextView)appCompatTextView).setOnClickListener((View$OnClickListener)new y0(this));
    }
    
    private static final void C(final SchoolSearchActivity schoolSearchActivity, final View view) {
        k0.p(schoolSearchActivity, "this$0");
        schoolSearchActivity.R();
    }
    
    private final void D() {
        ((ViewGroup)this.findViewById(2131296826)).setVisibility(8);
        this.findViewById(2131298381).setVisibility(0);
        ((FloatingActionButton)this.findViewById(2131298380)).setImageDrawable(d.i((Context)this, 2131230923));
        ((TextView)this.findViewById(2131298383)).setText((CharSequence)((Activity)this).getString(2131886602));
        ((TextView)this.findViewById(2131298382)).setText((CharSequence)((Activity)this).getString(2131886601));
        ((TextView)this.findViewById(2131298379)).setVisibility(8);
    }
    
    private final void E(final Throwable t) {
        ((ViewGroup)this.findViewById(2131296826)).setVisibility(8);
        this.findViewById(2131298381).setVisibility(0);
        ((FloatingActionButton)this.findViewById(2131298380)).setImageDrawable(d.i((Context)this, 2131230923));
        ((TextView)this.findViewById(2131298383)).setText((CharSequence)((Activity)this).getString(2131886713));
        final AppCompatTextView appCompatTextView = (AppCompatTextView)this.findViewById(2131298382);
        final String string = ((Activity)this).getString(2131886693);
        k0.o(string, "getString(R.string.shared_error_default_text)");
        String message;
        if ((message = t.getMessage()) == null) {
            message = "\u0ca0_\u0ca0";
        }
        ((TextView)appCompatTextView).setText((CharSequence)s.k2(string, "{0}", message, false, 4, (Object)null));
        ((TextView)this.findViewById(2131298379)).setVisibility(8);
    }
    
    private final void F() {
        ((ViewGroup)this.findViewById(2131296826)).setVisibility(8);
        this.findViewById(2131298381).setVisibility(0);
        ((FloatingActionButton)this.findViewById(2131298380)).setImageDrawable(d.i((Context)this, 2131231148));
        ((TextView)this.findViewById(2131298383)).setText((CharSequence)((Activity)this).getString(2131886604));
        ((TextView)this.findViewById(2131298382)).setText((CharSequence)((Activity)this).getString(2131886603));
        ((TextView)this.findViewById(2131298379)).setVisibility(8);
    }
    
    private final h1 G() {
        return this.G.getValue();
    }
    
    private final void H(final Intent intent) {
        final v0 a = ScanQrCodeActivity.K.a(intent);
        if (a != null && a.e().length() != 0) {
            this.G().l();
            ((ComponentActivity)this).startActivityForResult(LoginManualActivity.a.b(LoginManualActivity.H, (Context)this, null, a, 2, null), 161);
            return;
        }
        new AlertDialog$Builder((Context)this).setMessage(2131886130).setNegativeButton(2131886660, (DialogInterface$OnClickListener)w0.G).create().show();
    }
    
    private static final void I(final DialogInterface dialogInterface, final int n) {
        dialogInterface.cancel();
    }
    
    private final void J() {
        this.findViewById(2131298381).setVisibility(8);
        ((ViewGroup)this.findViewById(2131296826)).setVisibility(0);
    }
    
    private static final void K(final SchoolSearchActivity schoolSearchActivity, final View view) {
        k0.p(schoolSearchActivity, "this$0");
        ((ComponentActivity)schoolSearchActivity).onBackPressed();
    }
    
    private static final boolean L(final SchoolSearchActivity schoolSearchActivity, final AppCompatEditText appCompatEditText, final TextView textView, final int n, final KeyEvent keyEvent) {
        k0.p(schoolSearchActivity, "this$0");
        if (n == 3) {
            final h1 g = schoolSearchActivity.G();
            final Editable text = appCompatEditText.getText();
            String string;
            if (text == null) {
                string = null;
            }
            else {
                string = text.toString();
            }
            if (string == null) {
                return true;
            }
            h1.n(g, null, string, 1, null);
        }
        return true;
    }
    
    private static final void M(final SchoolSearchActivity schoolSearchActivity, final View view) {
        k0.p(schoolSearchActivity, "this$0");
        ((EditText)schoolSearchActivity.findViewById(2131296824)).setText((CharSequence)"");
    }
    
    private static final void N(final SchoolSearchActivity schoolSearchActivity, final View view) {
        k0.p(schoolSearchActivity, "this$0");
        schoolSearchActivity.T();
    }
    
    private static final void O(final SchoolSearchActivity schoolSearchActivity, final View view) {
        k0.p(schoolSearchActivity, "this$0");
        schoolSearchActivity.S();
    }
    
    private static final void P(final SchoolSearchActivity schoolSearchActivity, final i1 i1) {
        k0.p(schoolSearchActivity, "this$0");
        k0.o(i1, "it");
        schoolSearchActivity.W(i1);
    }
    
    private static final void Q(final SchoolSearchActivity schoolSearchActivity, final Boolean b) {
        k0.p(schoolSearchActivity, "this$0");
        k0.o(b, "it");
        schoolSearchActivity.V(b);
    }
    
    private final void R() {
        this.G().o((Context)this);
    }
    
    private final void S() {
        ((ComponentActivity)this).startActivityForResult(LoginManualActivity.a.b(LoginManualActivity.H, (Context)this, null, null, 6, null), 161);
    }
    
    private final void T() {
        ((ComponentActivity)this).startActivityForResult(ScanQrCodeActivity.K.b((Context)this), 162);
    }
    
    private final void U(final SchoolSearchSchool schoolSearchSchool) {
        ((ComponentActivity)this).startActivityForResult(LoginActivity.H.a((Context)this, schoolSearchSchool), 161);
    }
    
    private final void V(final boolean b) {
        this.findViewById(2131298385).setVisibility(h.U(b, 0, 1, null));
    }
    
    private final void W(final i1 i1) {
        final List<SchoolSearchSchool> a = i1.a();
        final Throwable b = i1.b();
        Throwable cause;
        if (b == null) {
            cause = null;
        }
        else {
            cause = b.getCause();
        }
        Throwable b2 = cause;
        if (cause == null) {
            b2 = i1.b();
        }
        if (a == null && b2 == null) {
            this.F();
            return;
        }
        if (a != null && !a.isEmpty()) {
            final RecyclerView$h adapter = ((RecyclerView)this.findViewById(2131296826)).getAdapter();
            Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.untis.mobile.ui.activities.profile.adapter.SchoolSearchSchoolAdapter");
            ((l5.a)adapter).j(a);
            this.J();
            return;
        }
        if (b2 == null && (a != null && a.isEmpty())) {
            this.B();
            return;
        }
        if (b2 instanceof JsonRpcError && ((JsonRpcError)b2).isAnyOf(JsonRpcErrorType.TooManySchoolSearchResults)) {
            this.D();
            return;
        }
        if (b2 != null) {
            this.E(b2);
        }
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    protected void onActivityResult(final int n, final int n2, @f final Intent intent) {
        final boolean b = n2 == -1;
        if (n != 161) {
            if (n != 162) {
                super.onActivityResult(n, n2, intent);
            }
            else if (b) {
                this.H(intent);
            }
        }
        else if (b) {
            ((Activity)this).setResult(-1);
            ((Activity)this).finish();
        }
    }
    
    @Override
    protected void onCreate(@f final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131492898);
        ((ImageView)this.findViewById(2131296819)).setOnClickListener((View$OnClickListener)new a1(this));
        final AppCompatEditText appCompatEditText = (AppCompatEditText)this.findViewById(2131296824);
        k0.o(appCompatEditText, "");
        h.A(appCompatEditText, new l<String, j2>() {
            public final void invoke(@e final String s) {
                k0.p(s, "it");
                h1.n(SchoolSearchActivity.this.G(), null, s, 1, null);
            }
        });
        ((EditText)appCompatEditText).setOnEditorActionListener((TextView$OnEditorActionListener)new c1(this, appCompatEditText));
        ((ImageView)this.findViewById(2131296825)).setOnClickListener((View$OnClickListener)new b1(this));
        this.F();
        ((Button)this.findViewById(2131296822)).setOnClickListener((View$OnClickListener)new z0(this));
        ((Button)this.findViewById(2131296821)).setOnClickListener((View$OnClickListener)new x0(this));
        ((RecyclerView)this.findViewById(2131296826)).setAdapter((RecyclerView$h)new l5.a(null, new l<SchoolSearchSchool, j2>() {
            public final void a(@e final SchoolSearchSchool schoolSearchSchool) {
                k0.p(schoolSearchSchool, "it");
                SchoolSearchActivity.this.U(schoolSearchSchool);
            }
        }, 1, null));
        this.G().k().j((y)this, (l0)new d1(this));
        this.G().p().j((y)this, (l0)new e1(this));
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b" }, d2 = { "com/untis/mobile/ui/activities/profile/SchoolSearchActivity$a", "", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final Intent a(@e final Context context) {
            k0.p(context, "context");
            return new Intent(context, (Class)SchoolSearchActivity.class);
        }
    }
}
