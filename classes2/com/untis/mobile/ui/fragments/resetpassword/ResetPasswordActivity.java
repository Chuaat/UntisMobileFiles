// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.fragments.resetpassword;

import android.view.ViewGroup;
import androidx.fragment.app.d;
import android.app.Activity;
import android.content.Intent;
import android.content.Context;
import androidx.fragment.app.a0;
import androidx.fragment.app.Fragment;
import com.untis.mobile.c;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import android.os.Bundle;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.activities.common.b;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0014R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0016\u0010\u000f\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0011¨\u0006\u0017" }, d2 = { "Lcom/untis/mobile/ui/fragments/resetpassword/ResetPasswordActivity;", "Lcom/untis/mobile/ui/activities/common/b;", "Landroid/os/Bundle;", "arguments", "Lkotlin/j2;", "q", "save", "onCreate", "", "H", "Ljava/lang/String;", "schoolLogin", "G", "userLogin", "I", "schoolUrl", "", "J", "schoolId", "<init>", "()V", "K", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class ResetPasswordActivity extends b
{
    @e
    public static final a K;
    @e
    private static final String L = "user_login";
    @e
    private static final String M = "school_login";
    @e
    private static final String N = "school_url";
    @e
    private static final String O = "school_id";
    private String G;
    private String H;
    private String I;
    private long J;
    
    static {
        K = new a(null);
    }
    
    private final void q(final Bundle bundle) {
        final String s = "";
        String string;
        if (bundle == null || (string = bundle.getString("user_login", "")) == null) {
            string = "";
        }
        this.G = string;
        String string2;
        if (bundle == null || (string2 = bundle.getString("school_login", "")) == null) {
            string2 = "";
        }
        this.H = string2;
        String string3;
        if (bundle == null) {
            string3 = s;
        }
        else {
            string3 = bundle.getString("school_url", "");
            if (string3 == null) {
                string3 = s;
            }
        }
        this.I = string3;
        long long1 = 0L;
        if (bundle != null) {
            long1 = bundle.getLong("school_id", 0L);
        }
        this.J = long1;
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @Override
    protected void onCreate(@f final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131492951);
        Bundle extras = bundle;
        if (bundle == null) {
            extras = ((Activity)this).getIntent().getExtras();
        }
        this.q(extras);
        final a0 r = ((d)this).getSupportFragmentManager().r();
        k0.o(r, "supportFragmentManager.beginTransaction()");
        final int id = ((ViewGroup)this.findViewById(c.i.w9)).getId();
        final String g = this.G;
        if (g == null) {
            k0.S("userLogin");
            throw null;
        }
        final String h = this.H;
        if (h == null) {
            k0.S("schoolLogin");
            throw null;
        }
        final long j = this.J;
        final String i = this.I;
        if (i != null) {
            r.E(id, (Fragment)ResetPasswordFragment.H.a(i, j, h, g), "reset-password-fragment");
            r.r();
            return;
        }
        k0.S("schoolUrl");
        throw null;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J.\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004R\u0016\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\r¨\u0006\u0013" }, d2 = { "com/untis/mobile/ui/fragments/resetpassword/ResetPasswordActivity$a", "", "Landroid/content/Context;", "context", "", "schoolUrl", "", "schoolId", "schoolLogin", "userLogin", "Landroid/content/Intent;", "a", "BUNDLE_SCHOOL_ID", "Ljava/lang/String;", "BUNDLE_SCHOOL_LOGIN", "BUNDLE_SCHOOL_URL", "BUNDLE_USER_LOGIN", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final Intent a(@e final Context context, @e final String s, final long n, @e final String s2, @e final String s3) {
            k0.p(context, "context");
            k0.p(s, "schoolUrl");
            k0.p(s2, "schoolLogin");
            k0.p(s3, "userLogin");
            final Intent intent = new Intent(context.getApplicationContext(), (Class)ResetPasswordActivity.class);
            final Bundle bundle = new Bundle();
            bundle.putString("user_login", s3);
            bundle.putString("school_login", s2);
            bundle.putString("school_url", s);
            bundle.putLong("school_id", n);
            intent.putExtras(bundle);
            return intent;
        }
    }
}
