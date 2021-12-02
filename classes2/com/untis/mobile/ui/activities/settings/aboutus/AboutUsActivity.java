// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.settings.aboutus;

import android.widget.ImageView;
import androidx.activity.ComponentActivity;
import android.widget.FrameLayout;
import android.view.MenuItem;
import android.annotation.SuppressLint;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.text.s;
import android.widget.TextView;
import android.os.Bundle;
import android.app.Activity;
import androidx.core.app.a0$b;
import android.content.ActivityNotFoundException;
import android.util.Log;
import com.untis.mobile.utils.u0;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.untis.mobile.utils.z;
import com.untis.mobile.ui.activities.settings.opensource.OpenSourceActivity;
import android.view.View$OnClickListener;
import kotlin.jvm.internal.k0;
import com.untis.mobile.ui.activities.SupportContactActivity;
import android.content.Intent;
import android.net.Uri;
import com.untis.mobile.c;
import androidx.cardview.widget.CardView;
import com.untis.mobile.services.profile.legacy.j0;
import android.content.Context;
import com.untis.mobile.utils.a;
import android.view.View;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.f;
import android.widget.Toast;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.activities.common.b;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00032\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b#\u0010$J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0002J\b\u0010\u0012\u001a\u00020\u0002H\u0002J\b\u0010\u0013\u001a\u00020\u0002H\u0002J\b\u0010\u0014\u001a\u00020\u0002H\u0002J\u0012\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0015J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\b\u0010\u001b\u001a\u00020\u0002H\u0014R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0016\u0010\u001f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010!¨\u0006&" }, d2 = { "Lcom/untis/mobile/ui/activities/settings/aboutus/AboutUsActivity;", "Lcom/untis/mobile/ui/activities/common/b;", "Lkotlin/j2;", "J", "", "i0", "I", "h0", "c0", "H", "g0", "E", "b0", "Y", "f0", "K", "e0", "d0", "a0", "G", "F", "Landroid/os/Bundle;", "save", "onCreate", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "onResume", "", "developerModeCounter", "Z", "clickedSomething", "Landroid/widget/Toast;", "Landroid/widget/Toast;", "currentToast", "<init>", "()V", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class AboutUsActivity extends b
{
    @e
    public static final a J;
    private boolean G;
    private int H;
    @f
    private Toast I;
    
    static {
        J = new a(null);
    }
    
    private final boolean E() {
        return com.untis.mobile.utils.a.a((Context)this).I(j0.G.n());
    }
    
    private final void F() {
        this.G = true;
        ((FrameLayout)this.findViewById(c.i.F1)).setEnabled(false);
        ((FrameLayout)this.findViewById(c.i.I1)).setEnabled(false);
        ((FrameLayout)this.findViewById(c.i.J1)).setEnabled(false);
        ((FrameLayout)this.findViewById(c.i.L1)).setEnabled(false);
        ((FrameLayout)this.findViewById(c.i.K1)).setEnabled(false);
    }
    
    private final void G() {
        this.G = false;
        ((FrameLayout)this.findViewById(c.i.F1)).setEnabled(true);
        ((FrameLayout)this.findViewById(c.i.I1)).setEnabled(true);
        ((FrameLayout)this.findViewById(c.i.J1)).setEnabled(true);
        ((FrameLayout)this.findViewById(c.i.L1)).setEnabled(true);
        ((FrameLayout)this.findViewById(c.i.K1)).setEnabled(true);
    }
    
    private final void H() {
        this.F();
        ((Activity)this).startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.untis.at/agb")));
    }
    
    private final void I() {
        if (com.untis.mobile.utils.a.a((Context)this).K()) {
            this.h0();
        }
    }
    
    private final void J() {
        this.F();
        ((Activity)this).startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://help.untis.at/hc/articles/360008379600")));
    }
    
    private final void K() {
        this.F();
        ((Activity)this).startActivity(SupportContactActivity.H.g((Context)this, j0.G.n()));
    }
    
    private static final void L(final AboutUsActivity aboutUsActivity, final View view) {
        k0.p(aboutUsActivity, "this$0");
        aboutUsActivity.Y();
    }
    
    private static final void M(final AboutUsActivity aboutUsActivity, final View view) {
        k0.p(aboutUsActivity, "this$0");
        aboutUsActivity.I();
    }
    
    private static final void N(final AboutUsActivity aboutUsActivity, final View view) {
        k0.p(aboutUsActivity, "this$0");
        aboutUsActivity.b0();
    }
    
    private static final void O(final AboutUsActivity aboutUsActivity, final View view) {
        k0.p(aboutUsActivity, "this$0");
        aboutUsActivity.a0();
    }
    
    private static final void P(final AboutUsActivity aboutUsActivity, final View view) {
        k0.p(aboutUsActivity, "this$0");
        ((ComponentActivity)aboutUsActivity).onBackPressed();
    }
    
    private static final void Q(final AboutUsActivity aboutUsActivity, final View view) {
        k0.p(aboutUsActivity, "this$0");
        aboutUsActivity.J();
    }
    
    private static final void R(final AboutUsActivity aboutUsActivity, final View view) {
        k0.p(aboutUsActivity, "this$0");
        aboutUsActivity.c0();
    }
    
    private static final void S(final AboutUsActivity aboutUsActivity, final View view) {
        k0.p(aboutUsActivity, "this$0");
        aboutUsActivity.H();
    }
    
    private static final void T(final AboutUsActivity aboutUsActivity, final View view) {
        k0.p(aboutUsActivity, "this$0");
        aboutUsActivity.g0();
    }
    
    private static final void U(final AboutUsActivity aboutUsActivity, final View view) {
        k0.p(aboutUsActivity, "this$0");
        aboutUsActivity.K();
    }
    
    private static final void V(final AboutUsActivity aboutUsActivity, final View view) {
        k0.p(aboutUsActivity, "this$0");
        aboutUsActivity.e0();
    }
    
    private static final void W(final AboutUsActivity aboutUsActivity, final View view) {
        k0.p(aboutUsActivity, "this$0");
        aboutUsActivity.d0();
    }
    
    private static final void X(final AboutUsActivity aboutUsActivity, final View view) {
        k0.p(aboutUsActivity, "this$0");
        aboutUsActivity.f0();
    }
    
    private final void Y() {
        final com.untis.mobile.utils.settings.old.c c = com.untis.mobile.utils.settings.old.c.c;
        if (!c.g()) {
            if (com.untis.mobile.utils.a.a((Context)this).K() || this.E()) {
                final int h = this.H + 1;
                if ((this.H = h) >= 10) {
                    c.k(true);
                    ((FrameLayout)this.findViewById(com.untis.mobile.c.i.C1)).setOnClickListener((View$OnClickListener)com.untis.mobile.ui.activities.settings.aboutus.e.G);
                    final Toast i = this.I;
                    if (i != null) {
                        i.cancel();
                    }
                    final Toast text = Toast.makeText((Context)this, (CharSequence)"you are now a developer", 0);
                    this.I = text;
                    if (text != null) {
                        text.show();
                    }
                    this.H = 0;
                    return;
                }
                if (h >= 7) {
                    final Toast j = this.I;
                    if (j != null) {
                        j.cancel();
                    }
                    final StringBuilder sb = new StringBuilder();
                    sb.append("just ");
                    sb.append(10 - this.H);
                    sb.append(" more clicks for developer mode");
                    final Toast text2 = Toast.makeText((Context)this, (CharSequence)sb.toString(), 0);
                    this.I = text2;
                    if (text2 != null) {
                        text2.show();
                    }
                }
            }
        }
    }
    
    private static final void Z(final View view) {
    }
    
    private final void a0() {
        this.F();
        ((Activity)this).startActivity(OpenSourceActivity.G.a((Context)this));
    }
    
    private final void b0() {
        z.a.d((Context)this, "+43226662241");
    }
    
    private final void c0() {
        this.F();
        Intent intent;
        if (z.a.h((Context)this)) {
            intent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.untis.at/warum-untis/ueber-das-produkt/datenschutz-und-sicherheit"));
        }
        else {
            intent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.untis.at/en/privacy-policy"));
        }
        ((Activity)this).startActivity(intent);
    }
    
    private final void d0() {
        this.F();
        try {
            ((Activity)this).startActivity(new Intent("android.intent.action.VIEW", Uri.parse(k0.C("market://details?id=", ((Activity)this).getPackageName()))));
        }
        catch (ActivityNotFoundException ex) {
            u0.c(this.findViewById(c.i.N1), "Sorry, no Google Play Store available");
            Log.e("untis_log", "could not open market for untis mobile", (Throwable)ex);
        }
    }
    
    private final void e0() {
        this.F();
        a0$b.k((Activity)this).w("text/plain").n(2131886140).v((CharSequence)"https://play.google.com/store/apps/details?id=com.grupet.web.app").x();
    }
    
    private final void f0() {
        this.F();
        final boolean h = z.a.h((Context)this);
        String c = "https://www.untis.at";
        if (!h) {
            c = k0.C("https://www.untis.at", "/en");
        }
        ((Activity)this).startActivity(new Intent("android.intent.action.VIEW", Uri.parse(c)));
    }
    
    private final void g0() {
        this.F();
        ((Activity)this).startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://jobs.untis.at")));
    }
    
    private final void h0() {
        ((Activity)this).startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://support.google.com/googleplay/answer/7018481")));
    }
    
    private final boolean i0() {
        return com.untis.mobile.utils.a.a((Context)this).K();
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @SuppressLint({ "SetTextI18n" })
    @Override
    protected void onCreate(@f final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131492892);
        if (!com.untis.mobile.utils.settings.old.c.c.g() && (com.untis.mobile.utils.a.a((Context)this).K() || this.E())) {
            ((FrameLayout)this.findViewById(c.i.C1)).setOnClickListener((View$OnClickListener)new k(this));
        }
        final int d1 = c.i.D1;
        final CardView cardView = (CardView)this.findViewById(d1);
        int visibility;
        if (this.i0()) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((FrameLayout)cardView).setVisibility(visibility);
        ((FrameLayout)this.findViewById(d1)).setOnClickListener((View$OnClickListener)new l(this));
        ((FrameLayout)this.findViewById(c.i.B1)).setOnClickListener((View$OnClickListener)new m(this));
        ((FrameLayout)this.findViewById(c.i.H1)).setOnClickListener((View$OnClickListener)new d(this));
        ((FrameLayout)this.findViewById(c.i.z1)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.settings.aboutus.f(this));
        ((FrameLayout)this.findViewById(c.i.E1)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.settings.aboutus.b(this));
        ((FrameLayout)this.findViewById(c.i.K1)).setOnClickListener((View$OnClickListener)new j(this));
        ((FrameLayout)this.findViewById(c.i.J1)).setOnClickListener((View$OnClickListener)new n(this));
        ((FrameLayout)this.findViewById(c.i.I1)).setOnClickListener((View$OnClickListener)new h(this));
        ((FrameLayout)this.findViewById(c.i.L1)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.settings.aboutus.c(this));
        ((FrameLayout)this.findViewById(c.i.G1)).setOnClickListener((View$OnClickListener)new g(this));
        ((FrameLayout)this.findViewById(c.i.F1)).setOnClickListener((View$OnClickListener)new com.untis.mobile.ui.activities.settings.aboutus.a(this));
        ((TextView)this.findViewById(c.i.P1)).setText((CharSequence)"v5.1.0");
        final TextView textView = (TextView)this.findViewById(c.i.M1);
        final String string = ((Activity)this).getString(2131886107);
        k0.o(string, "getString(R.string.about_copyRight_text)");
        textView.setText((CharSequence)s.k2(string, "{0}", String.valueOf(((org.joda.time.base.a)com.untis.mobile.utils.time.a.a()).k2()), false, 4, (Object)null));
        ((ImageView)this.findViewById(c.i.A1)).setOnClickListener((View$OnClickListener)new i(this));
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
    
    @Override
    protected void onResume() {
        super.onResume();
        this.G();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b" }, d2 = { "com/untis/mobile/ui/activities/settings/aboutus/AboutUsActivity$a", "", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final Intent a(@e final Context context) {
            k0.p(context, "context");
            return new Intent(context, (Class)AboutUsActivity.class);
        }
    }
}
