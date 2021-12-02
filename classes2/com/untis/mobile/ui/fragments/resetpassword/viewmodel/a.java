// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.fragments.resetpassword.viewmodel;

import com.untis.mobile.utils.b0;
import rx.g;
import org.jetbrains.annotations.f;
import android.os.Bundle;
import org.joda.time.t;
import java.util.Set;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.persistence.models.profile.Profile;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import com.untis.mobile.api.ApiService;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import androidx.lifecycle.w0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\b\u0018\u0000 \u00032\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b'\u0010(J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\b\u001a\u00020\u0004J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u0006\u0010\f\u001a\u00020\nR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u001b\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\"\u0010\u001e\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\"\u0010 \u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001f\u0010\u0017R\"\u0010&\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\"\u001a\u0004\b\u000e\u0010#\"\u0004\b$\u0010%¨\u0006)" }, d2 = { "Lcom/untis/mobile/ui/fragments/resetpassword/viewmodel/a;", "Landroidx/lifecycle/w0;", "Lcom/untis/mobile/persistence/models/profile/Profile;", "g", "Landroid/os/Bundle;", "arguments", "Lkotlin/j2;", "f", "n", "Lrx/g;", "", "m", "o", "Lcom/untis/mobile/api/ApiService;", "a", "Lcom/untis/mobile/api/ApiService;", "apiService", "", "c", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "k", "(Ljava/lang/String;)V", "userEmail", "e", "j", "schoolUrl", "b", "l", "userLogin", "i", "schoolLogin", "", "J", "()J", "h", "(J)V", "schoolId", "<init>", "(Lcom/untis/mobile/api/ApiService;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class a extends w0
{
    @e
    public static final a g;
    @e
    private static final String h = "user_login";
    @e
    private static final String i = "user_email";
    @e
    private static final String j = "school_url";
    @e
    private static final String k = "school_id";
    @e
    private static final String l = "school_login";
    @e
    private final ApiService a;
    public String b;
    @e
    private String c;
    public String d;
    public String e;
    private long f;
    
    static {
        g = new a(null);
    }
    
    public a(@e final ApiService a) {
        k0.p(a, "apiService");
        this.a = a;
        this.c = "";
    }
    
    private final Profile g() {
        return new Profile(0L, this.e(), null, null, 0L, null, 0L, null, null, null, null, null, false, false, 0L, null, this.b(), null, this.f, this.c(), false, null, 0L, 0, null, null, false, false, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, null, 0L, false, null, null, null, null, null, null, 0L, false, 0L, -851971, 65535, null);
    }
    
    public final long a() {
        return this.f;
    }
    
    @e
    public final String b() {
        final String d = this.d;
        if (d != null) {
            return d;
        }
        k0.S("schoolLogin");
        throw null;
    }
    
    @e
    public final String c() {
        final String e = this.e;
        if (e != null) {
            return e;
        }
        k0.S("schoolUrl");
        throw null;
    }
    
    @e
    public final String d() {
        return this.c;
    }
    
    @e
    public final String e() {
        final String b = this.b;
        if (b != null) {
            return b;
        }
        k0.S("userLogin");
        throw null;
    }
    
    public final void f(@f final Bundle bundle) {
        if (bundle == null) {
            return;
        }
        final String string = bundle.getString("user_login", "");
        k0.o(string, "arguments.getString(BUNDLE_USER_LOGIN, \"\")");
        this.l(string);
        final String string2 = bundle.getString("user_email", "");
        k0.o(string2, "arguments.getString(BUNDLE_USER_EMAIL, \"\")");
        this.c = string2;
        final String string3 = bundle.getString("school_login", "");
        k0.o(string3, "arguments.getString(BUNDLE_SCHOOL_LOGIN, \"\")");
        this.i(string3);
        final String string4 = bundle.getString("school_url", "");
        k0.o(string4, "arguments.getString(BUNDLE_SCHOOL_URL, \"\")");
        this.j(string4);
        this.f = bundle.getLong("school_id", 0L);
    }
    
    public final void h(final long f) {
        this.f = f;
    }
    
    public final void i(@e final String d) {
        k0.p(d, "<set-?>");
        this.d = d;
    }
    
    public final void j(@e final String e) {
        k0.p(e, "<set-?>");
        this.e = e;
    }
    
    public final void k(@e final String c) {
        k0.p(c, "<set-?>");
        this.c = c;
    }
    
    public final void l(@e final String b) {
        k0.p(b, "<set-?>");
        this.b = b;
    }
    
    @e
    public final g<Boolean> m() {
        final g<Boolean> submitResetPassword = this.a.submitResetPassword(this.g(), this.c);
        k0.o(submitResetPassword, "apiService\n                .submitResetPassword(profile(), userEmail)");
        return submitResetPassword;
    }
    
    @e
    public final Bundle n() {
        return com.untis.mobile.ui.fragments.resetpassword.viewmodel.a.g.a(this.e(), this.c, this.b(), this.c(), this.f);
    }
    
    public final boolean o() {
        return this.e().length() != 0 && b0.a.a(this.c);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J0\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0013" }, d2 = { "com/untis/mobile/ui/fragments/resetpassword/viewmodel/a$a", "", "", "userLogin", "userEmail", "schoolLogin", "schoolUrl", "", "schoolId", "Landroid/os/Bundle;", "a", "BUNDLE_SCHOOL_ID", "Ljava/lang/String;", "BUNDLE_SCHOOL_LOGIN", "BUNDLE_SCHOOL_URL", "BUNDLE_USER_EMAIL", "BUNDLE_USER_LOGIN", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final Bundle a(@e final String s, @e final String s2, @e final String s3, @e final String s4, final long n) {
            k0.p(s, "userLogin");
            k0.p(s2, "userEmail");
            k0.p(s3, "schoolLogin");
            k0.p(s4, "schoolUrl");
            final Bundle bundle = new Bundle();
            bundle.putString("user_login", s);
            bundle.putString("user_email", s2);
            bundle.putString("school_url", s4);
            bundle.putLong("school_id", n);
            bundle.putString("school_login", s3);
            return bundle;
        }
    }
}
