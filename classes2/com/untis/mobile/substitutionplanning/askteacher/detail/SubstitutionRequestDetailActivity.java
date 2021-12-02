// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.askteacher.detail;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import android.app.Activity;
import android.content.Intent;
import androidx.appcompat.widget.AppCompatButton;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.AppCompatImageView;
import org.jetbrains.annotations.f;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.DialogInterface$OnClickListener;
import android.app.AlertDialog$Builder;
import android.view.View;
import android.content.Context;
import com.untis.mobile.utils.extension.h;
import retrofit2.t;
import rx.g;
import com.untis.mobile.persistence.models.profile.Profile;
import kotlin.jvm.internal.k0;
import com.untis.mobile.substitutionplanning.model.SubstitutionRequestDto;
import com.untis.mobile.services.profile.legacy.j0;
import android.os.Bundle;
import android.content.DialogInterface;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import androidx.lifecycle.y;
import kotlin.jvm.internal.m0;
import n6.a;
import com.google.gson.GsonBuilder;
import kotlin.jvm.internal.w;
import kotlin.b0;
import com.google.gson.Gson;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.activities.common.b;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0012\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u0012\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0014R\u001d\u0010\u0012\u001a\u00020\r8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017" }, d2 = { "Lcom/untis/mobile/substitutionplanning/askteacher/detail/SubstitutionRequestDetailActivity;", "Lcom/untis/mobile/ui/activities/common/b;", "Lkotlin/j2;", "Q", "N", "K", "E", "T", "Landroid/os/Bundle;", "arguments", "D", "savedInstanceState", "onCreate", "Lcom/untis/mobile/substitutionplanning/askteacher/detail/l;", "G", "Lkotlin/b0;", "C", "()Lcom/untis/mobile/substitutionplanning/askteacher/detail/l;", "viewModel", "<init>", "()V", "H", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class SubstitutionRequestDetailActivity extends b
{
    @e
    public static final a H;
    @e
    private static final String I = "profile_id";
    @e
    private static final String J = "dto_json";
    private static final Gson K;
    @e
    private final b0 G;
    
    static {
        H = new a(null);
        K = new GsonBuilder().create();
    }
    
    public SubstitutionRequestDetailActivity() {
        this.G = d0.c((n6.a<?>)new n6.a<l>() {
            final /* synthetic */ y G;
            
            @e
            @Override
            public final l invoke() {
                return (l)org.koin.androidx.viewmodel.ext.android.b.b(this.G, k1.d(l.class), null, null);
            }
        });
    }
    
    public static final /* synthetic */ Gson B() {
        return SubstitutionRequestDetailActivity.K;
    }
    
    private final l C() {
        return this.G.getValue();
    }
    
    private final void D(final Bundle bundle) {
        String string;
        if (bundle == null) {
            string = null;
        }
        else {
            string = bundle.getString("profile_id");
        }
        if (string == null) {
            ((Activity)this).finish();
            return;
        }
        final Profile l = j0.G.l(string);
        if (l == null) {
            ((Activity)this).finish();
            return;
        }
        final SubstitutionRequestDto substitutionRequestDto = SubstitutionRequestDetailActivity.K.fromJson(bundle.getString("dto_json"), SubstitutionRequestDto.class);
        final l c = this.C();
        k0.o(substitutionRequestDto, "dto");
        c.i(l, substitutionRequestDto);
    }
    
    private final void E() {
        final g<t<Void>> a = this.C().a();
        if (a != null) {
            a.C5((rx.functions.b)new k(this), (rx.functions.b)new j(this));
        }
    }
    
    private static final void F(final SubstitutionRequestDetailActivity substitutionRequestDetailActivity, final Throwable t) {
        k0.p(substitutionRequestDetailActivity, "this$0");
        k0.o(t, "it");
        h.l((Context)substitutionRequestDetailActivity, t);
    }
    
    private static final void G(final SubstitutionRequestDetailActivity substitutionRequestDetailActivity, final t t) {
        k0.p(substitutionRequestDetailActivity, "this$0");
        ((Activity)substitutionRequestDetailActivity).setResult(-1);
        ((Activity)substitutionRequestDetailActivity).finish();
    }
    
    private static final void H(final SubstitutionRequestDetailActivity substitutionRequestDetailActivity, final View view) {
        k0.p(substitutionRequestDetailActivity, "this$0");
        ((ComponentActivity)substitutionRequestDetailActivity).onBackPressed();
    }
    
    private static final void I(final SubstitutionRequestDetailActivity substitutionRequestDetailActivity, final View view) {
        k0.p(substitutionRequestDetailActivity, "this$0");
        substitutionRequestDetailActivity.N();
    }
    
    private static final void J(final SubstitutionRequestDetailActivity substitutionRequestDetailActivity, final View view) {
        k0.p(substitutionRequestDetailActivity, "this$0");
        substitutionRequestDetailActivity.Q();
    }
    
    private final void K() {
        final g<t<Void>> b = this.C().b();
        if (b != null) {
            b.C5((rx.functions.b)new com.untis.mobile.substitutionplanning.askteacher.detail.b(this), (rx.functions.b)new i(this));
        }
    }
    
    private static final void L(final SubstitutionRequestDetailActivity substitutionRequestDetailActivity, final t t) {
        k0.p(substitutionRequestDetailActivity, "this$0");
        ((Activity)substitutionRequestDetailActivity).setResult(-1);
        ((Activity)substitutionRequestDetailActivity).finish();
    }
    
    private static final void M(final SubstitutionRequestDetailActivity substitutionRequestDetailActivity, final Throwable t) {
        k0.p(substitutionRequestDetailActivity, "this$0");
        k0.o(t, "it");
        h.l((Context)substitutionRequestDetailActivity, t);
    }
    
    private final void N() {
        new AlertDialog$Builder((Context)this).setMessage(2131886145).setNegativeButton(2131886649, (DialogInterface$OnClickListener)d.G).setPositiveButton(2131886143, (DialogInterface$OnClickListener)new c(this)).create().show();
    }
    
    private static final void O(final DialogInterface dialogInterface, final int n) {
    }
    
    private static final void P(final SubstitutionRequestDetailActivity substitutionRequestDetailActivity, final DialogInterface dialogInterface, final int n) {
        k0.p(substitutionRequestDetailActivity, "this$0");
        substitutionRequestDetailActivity.E();
    }
    
    private final void Q() {
        new AlertDialog$Builder((Context)this).setMessage(2131886150).setNegativeButton(2131886649, (DialogInterface$OnClickListener)com.untis.mobile.substitutionplanning.askteacher.detail.e.G).setPositiveButton(2131886154, (DialogInterface$OnClickListener)new com.untis.mobile.substitutionplanning.askteacher.detail.a(this)).create().show();
    }
    
    private static final void R(final DialogInterface dialogInterface, final int n) {
    }
    
    private static final void S(final SubstitutionRequestDetailActivity substitutionRequestDetailActivity, final DialogInterface dialogInterface, final int n) {
        k0.p(substitutionRequestDetailActivity, "this$0");
        substitutionRequestDetailActivity.K();
    }
    
    private final void T() {
        ((TextView)this.findViewById(com.untis.mobile.c.i.kc)).setText((CharSequence)this.C().d());
        final int lc = com.untis.mobile.c.i.lc;
        ((TextView)this.findViewById(lc)).setText((CharSequence)this.C().e());
        final AppCompatTextView appCompatTextView = (AppCompatTextView)this.findViewById(lc);
        k0.o(appCompatTextView, "activity_substitution_request_detail_header_date_subtitle");
        h.X(appCompatTextView);
        ((TextView)this.findViewById(com.untis.mobile.c.i.hc)).setText((CharSequence)this.C().c((Context)this));
        ((TextView)this.findViewById(com.untis.mobile.c.i.nc)).setText((CharSequence)this.C().g());
        ((TextView)this.findViewById(com.untis.mobile.c.i.mc)).setText((CharSequence)this.C().f());
        ((TextView)this.findViewById(com.untis.mobile.c.i.oc)).setText((CharSequence)this.C().h());
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @Override
    protected void onCreate(@f Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131492963);
        final Bundle extras = ((Activity)this).getIntent().getExtras();
        if (extras != null) {
            bundle = extras;
        }
        this.D(bundle);
        this.T();
        ((ImageView)this.findViewById(com.untis.mobile.c.i.jc)).setOnClickListener((View$OnClickListener)new com.untis.mobile.substitutionplanning.askteacher.detail.g(this));
        ((Button)this.findViewById(com.untis.mobile.c.i.pc)).setOnClickListener((View$OnClickListener)new com.untis.mobile.substitutionplanning.askteacher.detail.f(this));
        ((Button)this.findViewById(com.untis.mobile.c.i.rc)).setOnClickListener((View$OnClickListener)new com.untis.mobile.substitutionplanning.askteacher.detail.h(this));
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0016\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u001e\u0010\u000f\u001a\n \u000e*\u0004\u0018\u00010\r0\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013" }, d2 = { "com/untis/mobile/substitutionplanning/askteacher/detail/SubstitutionRequestDetailActivity$a", "", "Landroid/content/Context;", "context", "", "profileId", "Lcom/untis/mobile/substitutionplanning/model/SubstitutionRequestDto;", "dto", "Landroid/content/Intent;", "a", "ARGUMENT_DTO_JSON", "Ljava/lang/String;", "ARGUMENT_PROFILE_ID", "Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "gson", "Lcom/google/gson/Gson;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final Intent a(@e final Context context, @e final String s, @e final SubstitutionRequestDto substitutionRequestDto) {
            k0.p(context, "context");
            k0.p(s, "profileId");
            k0.p(substitutionRequestDto, "dto");
            final Intent intent = new Intent(context, (Class)SubstitutionRequestDetailActivity.class);
            final Bundle bundle = new Bundle();
            bundle.putString("profile_id", s);
            bundle.putString("dto_json", SubstitutionRequestDetailActivity.B().toJson(substitutionRequestDto));
            intent.putExtras(bundle);
            return intent;
        }
    }
}
