// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.profile;

import android.widget.Button;
import android.app.Activity;
import androidx.activity.ComponentActivity;
import android.annotation.SuppressLint;
import android.widget.TextView;
import android.view.View$OnClickListener;
import com.untis.mobile.c;
import androidx.appcompat.widget.AppCompatButton;
import android.os.Bundle;
import com.untis.mobile.services.profile.legacy.j0;
import org.jetbrains.annotations.f;
import android.net.Uri;
import android.content.Intent;
import kotlin.jvm.internal.k0;
import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.activities.common.b;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0015J\"\u0010\f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014¨\u0006\u0011" }, d2 = { "Lcom/untis/mobile/ui/activities/profile/WelcomeActivity;", "Lcom/untis/mobile/ui/activities/common/b;", "Lkotlin/j2;", "s", "Landroid/os/Bundle;", "save", "onCreate", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "<init>", "()V", "G", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class WelcomeActivity extends b
{
    @e
    public static final a G;
    
    static {
        G = new a(null);
    }
    
    private final void s() {
        ((ComponentActivity)this).startActivityForResult(SchoolSearchActivity.H.a((Context)this), 161);
    }
    
    private static final void t(final WelcomeActivity welcomeActivity, final View view) {
        k0.p(welcomeActivity, "this$0");
        welcomeActivity.s();
    }
    
    private static final void u(final WelcomeActivity welcomeActivity, final View view) {
        k0.p(welcomeActivity, "this$0");
        final Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(((Activity)welcomeActivity).getString(2131886907)));
        ((Activity)welcomeActivity).startActivity(intent);
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    protected void onActivityResult(final int n, final int n2, @f final Intent intent) {
        final boolean b = n2 == -1;
        if (n == 161) {
            if (b) {
                ((Activity)this).setResult(-1);
                ((Activity)this).finish();
                return;
            }
            if (j0.G.e()) {
                ((Activity)this).finish();
            }
        }
        else {
            super.onActivityResult(n, n2, intent);
        }
    }
    
    @SuppressLint({ "SetTextI18n" })
    @Override
    protected void onCreate(@f final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131492968);
        ((Button)this.findViewById(c.i.bd)).setOnClickListener((View$OnClickListener)new k1(this));
        if (j0.G.e()) {
            this.s();
        }
        ((TextView)this.findViewById(c.i.hO)).setOnClickListener((View$OnClickListener)new j1(this));
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b" }, d2 = { "com/untis/mobile/ui/activities/profile/WelcomeActivity$a", "", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final Intent a(@e final Context context) {
            k0.p(context, "context");
            return new Intent(context, (Class)WelcomeActivity.class);
        }
    }
}
