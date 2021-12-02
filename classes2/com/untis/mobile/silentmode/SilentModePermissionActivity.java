// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.silentmode;

import android.widget.Button;
import android.app.Activity;
import androidx.activity.ComponentActivity;
import android.content.Context;
import android.view.View$OnClickListener;
import com.untis.mobile.c;
import androidx.appcompat.widget.AppCompatButton;
import android.os.Bundle;
import org.jetbrains.annotations.f;
import android.content.Intent;
import android.os.Build$VERSION;
import kotlin.jvm.internal.k0;
import android.view.View;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import android.content.ComponentCallbacks;
import kotlin.jvm.internal.m0;
import n6.a;
import kotlin.jvm.internal.w;
import kotlin.b0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.activities.common.b;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014J\"\u0010\r\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014R\u001d\u0010\u0013\u001a\u00020\u000e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0018" }, d2 = { "Lcom/untis/mobile/silentmode/SilentModePermissionActivity;", "Lcom/untis/mobile/ui/activities/common/b;", "Lkotlin/j2;", "v", "w", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "Lcom/untis/mobile/silentmode/a;", "G", "Lkotlin/b0;", "s", "()Lcom/untis/mobile/silentmode/a;", "silentMode", "<init>", "()V", "H", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class SilentModePermissionActivity extends b
{
    @e
    public static final a H;
    @e
    private final b0 G;
    
    static {
        H = new a(null);
    }
    
    public SilentModePermissionActivity() {
        this.G = d0.c((n6.a<?>)new n6.a<com.untis.mobile.silentmode.a>() {
            final /* synthetic */ ComponentCallbacks G;
            
            @e
            @Override
            public final a invoke() {
                return (a)org.koin.android.ext.android.a.e(this.G).y().t(k1.d(a.class), null, null);
            }
        });
    }
    
    private final com.untis.mobile.silentmode.a s() {
        return this.G.getValue();
    }
    
    private static final void t(final SilentModePermissionActivity silentModePermissionActivity, final View view) {
        k0.p(silentModePermissionActivity, "this$0");
        silentModePermissionActivity.v();
    }
    
    private static final void u(final SilentModePermissionActivity silentModePermissionActivity, final View view) {
        k0.p(silentModePermissionActivity, "this$0");
        silentModePermissionActivity.w();
    }
    
    private final void v() {
        if (Build$VERSION.SDK_INT >= 23) {
            ((ComponentActivity)this).startActivityForResult(new Intent("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS"), 223);
        }
    }
    
    private final void w() {
        this.s().stop();
        ((Activity)this).finish();
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    protected void onActivityResult(final int n, final int n2, @f final Intent intent) {
        if (n == 223) {
            if (!this.s().d()) {
                this.w();
            }
            ((Activity)this).finish();
        }
        else {
            super.onActivityResult(n, n2, intent);
        }
    }
    
    @Override
    protected void onCreate(@f final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131492961);
        ((Activity)this).setTitle(2131886635);
        ((Button)this.findViewById(c.i.Jb)).setOnClickListener((View$OnClickListener)new com.untis.mobile.silentmode.e(this));
        ((Button)this.findViewById(c.i.Ib)).setOnClickListener((View$OnClickListener)new d(this));
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b" }, d2 = { "com/untis/mobile/silentmode/SilentModePermissionActivity$a", "", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final Intent a(@e final Context context) {
            k0.p(context, "context");
            return new Intent(context, (Class)SilentModePermissionActivity.class);
        }
    }
}
