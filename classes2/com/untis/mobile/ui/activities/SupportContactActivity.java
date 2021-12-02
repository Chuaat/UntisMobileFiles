// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities;

import androidx.activity.ComponentActivity;
import com.untis.mobile.persistence.models.EntityType;
import android.net.Uri;
import com.untis.mobile.UntisMobileApplication;
import android.content.Intent;
import android.os.Build;
import com.untis.mobile.utils.z;
import android.net.Uri$Builder;
import android.os.Build$VERSION;
import android.view.MenuItem;
import androidx.appcompat.app.a;
import kotlin.jvm.internal.k0;
import android.widget.ProgressBar;
import android.webkit.WebViewClient;
import android.content.Context;
import android.graphics.Paint;
import android.webkit.WebView;
import com.untis.mobile.c;
import com.untis.mobile.services.profile.legacy.j0;
import org.jetbrains.annotations.f;
import android.os.Bundle;
import kotlin.jvm.internal.w;
import com.untis.mobile.persistence.models.profile.Profile;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.activities.common.b;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012" }, d2 = { "Lcom/untis/mobile/ui/activities/SupportContactActivity;", "Lcom/untis/mobile/ui/activities/common/b;", "Landroid/os/Bundle;", "save", "Lkotlin/j2;", "onCreate", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "Lcom/untis/mobile/persistence/models/profile/Profile;", "G", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "<init>", "()V", "H", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class SupportContactActivity extends b
{
    @e
    public static final a H;
    private Profile G;
    
    static {
        H = new a(null);
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @Override
    protected void onCreate(@f final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131492965);
        final Profile n = j0.G.n();
        if (n == null) {
            return;
        }
        this.G = n;
        final int zc = c.i.zc;
        ((WebView)this.findViewById(zc)).setLayerType(1, (Paint)null);
        final WebView webView = (WebView)this.findViewById(zc);
        final a h = SupportContactActivity.H;
        final Profile g = this.G;
        if (g != null) {
            webView.loadUrl(h.a((Context)this, g));
            ((WebView)this.findViewById(zc)).setWebViewClient((WebViewClient)new WebViewClient() {
                final /* synthetic */ SupportContactActivity a;
                
                public void onPageFinished(@f final WebView webView, @f final String s) {
                    super.onPageFinished(webView, s);
                    ((ProgressBar)this.a.findViewById(c.i.xc)).setVisibility(8);
                }
            });
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
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u001a\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\n\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0006\u0010\f\u001a\u00020\u000bJ\u0018\u0010\r\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¨\u0006\u0011" }, d2 = { "com/untis/mobile/ui/activities/SupportContactActivity$a", "", "", "b", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "d", "Landroid/content/Context;", "context", "e", "c", "Landroid/content/Intent;", "f", "g", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        private final String b() {
            final int sdk_INT = Build$VERSION.SDK_INT;
            StringBuilder sb = null;
            Label_0081: {
                if (sdk_INT >= 23) {
                    final String base_OS = Build$VERSION.BASE_OS;
                    k0.o(base_OS, "BASE_OS");
                    if (base_OS.length() != 0) {
                        sb = new StringBuilder();
                        sb.append((Object)Build$VERSION.BASE_OS);
                        sb.append(" - ");
                        break Label_0081;
                    }
                }
                sb = new StringBuilder();
                sb.append("Android ");
            }
            sb.append((Object)Build$VERSION.RELEASE);
            sb.append(" (API ");
            sb.append(sdk_INT);
            sb.append(" - ");
            sb.append((Object)Build$VERSION.INCREMENTAL);
            sb.append(')');
            return sb.toString();
        }
        
        private final String c(final Profile profile) {
            final String s = "";
            if (profile == null) {
                return "";
            }
            final int n = SupportContactActivity.a.a.a[profile.getEntityType().ordinal()];
            String s2;
            if (n != 1) {
                if (n != 2) {
                    if (n != 3 && n != 4 && n != 5) {
                        s2 = s;
                    }
                    else {
                        s2 = "parent";
                    }
                }
                else {
                    s2 = "teacher";
                }
            }
            else {
                s2 = "student";
            }
            return s2;
        }
        
        private final String d(final Profile profile) {
            if (profile == null) {
                return "";
            }
            return profile.getSchoolLogin();
        }
        
        private final String e(final Context context, final Profile profile) {
            boolean b = false;
            if (profile != null) {
                if (profile.isAnonymousUser()) {
                    b = true;
                }
            }
            if (b) {
                final String string = context.getString(2131886345);
                k0.o(string, "context.getString(R.string.login_anonymous_text)");
                return string;
            }
            String s = "";
            if (profile != null) {
                final String userLogin = profile.getUserLogin();
                if (userLogin != null) {
                    s = userLogin;
                }
            }
            return s;
        }
        
        @e
        public final String a(@e final Context context, @f final Profile profile) {
            k0.p(context, "context");
            final Uri$Builder uri$Builder = new Uri$Builder();
            uri$Builder.scheme("https");
            uri$Builder.authority("platform.untis.at");
            uri$Builder.appendPath("HTML");
            String s;
            if (z.a.h(context)) {
                s = "appSupport.php";
            }
            else {
                s = "appSupportEn.php";
            }
            uri$Builder.appendPath(s);
            uri$Builder.appendQueryParameter("os", "android");
            boolean b = false;
            if (profile != null) {
                if (profile.isAnonymousUser()) {
                    b = true;
                }
            }
            if (!b) {
                uri$Builder.appendQueryParameter("personrole", this.c(profile));
            }
            uri$Builder.appendQueryParameter("user", this.e(context, profile));
            uri$Builder.appendQueryParameter("schoolname", this.d(profile));
            uri$Builder.appendQueryParameter("osversion", this.b());
            final StringBuilder sb = new StringBuilder();
            sb.append((Object)Build.BRAND);
            sb.append(' ');
            sb.append((Object)Build.DEVICE);
            uri$Builder.appendQueryParameter("device", sb.toString());
            uri$Builder.appendQueryParameter("appversion", "5.1.0");
            final String string = uri$Builder.toString();
            k0.o(string, "builder.toString()");
            return string;
        }
        
        @e
        public final Intent f() {
            return new Intent((Context)UntisMobileApplication.I.b(), (Class)SupportContactActivity.class);
        }
        
        @e
        public final Intent g(@e final Context context, @f final Profile profile) {
            k0.p(context, "context");
            return new Intent("android.intent.action.VIEW", Uri.parse(this.a(context, profile)));
        }
    }
}
