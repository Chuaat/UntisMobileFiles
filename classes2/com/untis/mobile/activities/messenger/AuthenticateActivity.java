// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.activities.messenger;

import android.app.Activity;
import java.util.List;
import android.os.Bundle;
import android.content.DialogInterface$OnClickListener;
import android.content.Context;
import android.app.AlertDialog$Builder;
import rx.functions.p;
import kotlin.text.s;
import com.untis.mobile.persistence.models.profile.Right;
import com.untis.mobile.persistence.models.messenger.MessengerCredential;
import androidx.fragment.app.a0;
import com.untis.mobile.ui.activities.messenger.AuthenticateProfileSelectionFragment;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.services.profile.legacy.j0;
import android.content.DialogInterface;
import android.content.Intent;
import kotlin.jvm.internal.k0;
import android.util.Log;
import com.untis.mobile.persistence.models.booking.ValidationError;
import com.untis.mobile.api.common.JsonRpcErrorType;
import java.net.ConnectException;
import com.untis.mobile.api.error.JsonRpcError;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import android.content.ComponentCallbacks;
import kotlin.jvm.internal.m0;
import com.untis.mobile.api.ApiService;
import n6.a;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.f;
import androidx.fragment.app.Fragment;
import kotlin.b0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.ui.activities.common.b;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0012\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014J\u000e\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001b\u001a\u00020\u00178B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006!" }, d2 = { "Lcom/untis/mobile/activities/messenger/AuthenticateActivity;", "Lcom/untis/mobile/ui/activities/common/b;", "Lkotlin/j2;", "E", "F", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "w", "", "t", "A", "Lcom/untis/mobile/persistence/models/messenger/MessengerCredential;", "credential", "Lcom/untis/mobile/activities/messenger/AuthenticateActivity$a;", "G", "Landroid/os/Bundle;", "save", "onCreate", "B", "Landroidx/fragment/app/Fragment;", "H", "Landroidx/fragment/app/Fragment;", "fragment", "Lcom/untis/mobile/api/ApiService;", "Lkotlin/b0;", "v", "()Lcom/untis/mobile/api/ApiService;", "apiService", "<init>", "()V", "I", "a", "b", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class AuthenticateActivity extends com.untis.mobile.ui.activities.common.b
{
    @e
    public static final b I;
    @e
    private static final String J = "MESSENGER_AUTHENTICATION";
    @e
    private final b0 G;
    @f
    private Fragment H;
    
    static {
        I = new b(null);
    }
    
    public AuthenticateActivity() {
        this.G = d0.c((n6.a<?>)new n6.a<ApiService>() {
            final /* synthetic */ ComponentCallbacks G;
            
            @e
            @Override
            public final ApiService invoke() {
                return (ApiService)org.koin.android.ext.android.a.e(this.G).y().t(k1.d(ApiService.class), null, null);
            }
        });
    }
    
    private final void A(final Throwable t) {
        Throwable cause = t;
        if (t.getCause() instanceof JsonRpcError) {
            cause = t.getCause();
        }
        Intent intent = null;
        Label_0031: {
            if (cause instanceof ConnectException) {
                intent = com.untis.mobile.messenger.a.a.p();
            }
            else {
                final boolean b = cause instanceof JsonRpcError;
                if (b && ((JsonRpcError)cause).isAnyOf(JsonRpcErrorType.MethodNotFound)) {
                    intent = com.untis.mobile.messenger.a.a.k();
                }
                else {
                    if (!b || !((JsonRpcError)cause).isAnyOf(JsonRpcErrorType.MethodNotFound, JsonRpcErrorType.InvalidUserStatus)) {
                        if (cause instanceof f5.a) {
                            final f5.a a = (f5.a)cause;
                            if (a.a().isEmpty()) {
                                intent = com.untis.mobile.messenger.a.a.o(null, null);
                                break Label_0031;
                            }
                            final ValidationError validationError = a.a().get(0);
                            final StringBuilder sb = new StringBuilder();
                            sb.append("validation error on authentication with code ");
                            sb.append(validationError.code);
                            sb.append(" and message '");
                            sb.append(validationError.title);
                            sb.append('\'');
                            Log.e("untis_log", sb.toString());
                            final String code = validationError.code;
                            k0.o(code, "error.code");
                            final int hashCode = code.hashCode();
                            Intent intent2 = null;
                            Label_0341: {
                                if (hashCode != 52) {
                                    if (hashCode != 1598) {
                                        if (hashCode == 1599) {
                                            if (code.equals("21")) {
                                                intent2 = com.untis.mobile.messenger.a.a.n(validationError.getTitle());
                                                break Label_0341;
                                            }
                                        }
                                    }
                                    else if (code.equals("20")) {
                                        intent2 = com.untis.mobile.messenger.a.a.j(validationError.getTitle());
                                        break Label_0341;
                                    }
                                }
                                else if (code.equals("4")) {
                                    intent2 = com.untis.mobile.messenger.a.a.a(validationError.getTitle());
                                    break Label_0341;
                                }
                                intent2 = com.untis.mobile.messenger.a.a.o(code, validationError.getTitle());
                            }
                            ((Activity)this).setResult(0, intent2);
                        }
                        return;
                    }
                    intent = com.untis.mobile.messenger.a.a.g(null);
                }
            }
        }
        ((Activity)this).setResult(0, intent);
    }
    
    private static final void C(final AuthenticateActivity authenticateActivity, final DialogInterface dialogInterface, final int n) {
        k0.p(authenticateActivity, "this$0");
        if (j0.G.s0().size() == 1) {
            ((Activity)authenticateActivity).setResult(0);
            ((Activity)authenticateActivity).finish();
        }
        else {
            authenticateActivity.E();
        }
    }
    
    private static final void D(final AuthenticateActivity authenticateActivity, final Profile profile, final DialogInterface dialogInterface, final int n) {
        k0.p(authenticateActivity, "this$0");
        k0.p(profile, "$profile");
        authenticateActivity.w(profile);
    }
    
    private final void E() {
        final a0 r = ((androidx.fragment.app.d)this).getSupportFragmentManager().r();
        k0.o(r, "supportFragmentManager.beginTransaction()");
        final AuthenticateProfileSelectionFragment a = AuthenticateProfileSelectionFragment.G.a();
        r.g(2131296694, (Fragment)a);
        this.H = a;
        r.r();
    }
    
    private final void F() {
        final Fragment h = this.H;
        if (h == null) {
            return;
        }
        final a0 r = ((androidx.fragment.app.d)this).getSupportFragmentManager().r();
        k0.o(r, "supportFragmentManager.beginTransaction()");
        r.C(h);
        r.r();
    }
    
    private final a G(final Profile profile, final MessengerCredential messengerCredential) {
        final int length = messengerCredential.getServerUrl().length();
        final int n = 1;
        Label_0081: {
            if (length > 0) {
                int n2;
                if (messengerCredential.getOrganizationId().length() > 0) {
                    n2 = n;
                }
                else {
                    n2 = 0;
                }
                if (n2 != 0) {
                    profile.getUserRights().add(Right.MESSENGER);
                    break Label_0081;
                }
            }
            profile.getUserRights().remove(Right.MESSENGER);
        }
        profile.setMessengerServerUrl(s.k2(messengerCredential.getServerUrl(), "https://", "", false, 4, (Object)null));
        profile.setMessengerOrganizationId(messengerCredential.getOrganizationId());
        j0.G.d(profile);
        return new a(profile, messengerCredential.getToken());
    }
    
    private final ApiService v() {
        return this.G.getValue();
    }
    
    private final void w(final Profile profile) {
        this.v().getMessengerAuthenticationCredentials(profile).k3((p)new com.untis.mobile.activities.messenger.e(this, profile)).C5((rx.functions.b)new c(this), (rx.functions.b)new d(this));
    }
    
    private static final a x(final AuthenticateActivity authenticateActivity, final Profile profile, final MessengerCredential messengerCredential) {
        k0.p(authenticateActivity, "this$0");
        k0.p(profile, "$profile");
        k0.o(messengerCredential, "it");
        return authenticateActivity.G(profile, messengerCredential);
    }
    
    private static final void y(final AuthenticateActivity authenticateActivity, final a a) {
        k0.p(authenticateActivity, "this$0");
        final com.untis.mobile.messenger.a a2 = com.untis.mobile.messenger.a.a;
        if (!a2.e(a.a(), a.b())) {
            ((Activity)authenticateActivity).setResult(0, a2.f());
        }
        else {
            ((Activity)authenticateActivity).setResult(-1, a2.b(a.a(), a.b()));
        }
        ((Activity)authenticateActivity).finish();
    }
    
    private static final void z(final AuthenticateActivity authenticateActivity, final Throwable t) {
        k0.p(authenticateActivity, "this$0");
        k0.o(t, "throwable");
        authenticateActivity.A(t);
        ((Activity)authenticateActivity).finish();
    }
    
    public final void B(@e final Profile profile) {
        k0.p(profile, "profile");
        this.F();
        new AlertDialog$Builder((Context)this, 2131951624).setTitle(2131886431).setMessage(2131886430).setNegativeButton(2131886649, (DialogInterface$OnClickListener)new com.untis.mobile.activities.messenger.a(this)).setPositiveButton(2131886660, (DialogInterface$OnClickListener)new com.untis.mobile.activities.messenger.b(this, profile)).create().show();
    }
    
    @Override
    public void _$_clearFindViewByIdCache() {
    }
    
    @Override
    protected void onCreate(@f final Bundle bundle) {
        super.onCreate(bundle);
        if (!k0.g(((Activity)this).getIntent().getAction(), "MESSENGER_AUTHENTICATION")) {
            ((Activity)this).setResult(0, com.untis.mobile.messenger.a.a.o(null, null));
            ((Activity)this).finish();
            return;
        }
        this.setContentView(2131492934);
        final j0 g = j0.G;
        final List<Profile> s0 = g.s0();
        final Profile n = g.n();
        if (s0.size() > 1) {
            this.E();
            return;
        }
        if (s0.size() == 1) {
            this.B(s0.get(0));
            return;
        }
        if (n == null) {
            ((Activity)this).setResult(0, com.untis.mobile.messenger.a.a.l(((Activity)this).getString(2131886739)));
            ((Activity)this).finish();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0019\u0010\u000b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000e" }, d2 = { "com/untis/mobile/activities/messenger/AuthenticateActivity$a", "", "Lcom/untis/mobile/persistence/models/profile/Profile;", "a", "Lcom/untis/mobile/persistence/models/profile/Profile;", "()Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "token", "<init>", "(Lcom/untis/mobile/persistence/models/profile/Profile;Ljava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    private static final class a
    {
        @e
        private final Profile a;
        @e
        private final String b;
        
        public a(@e final Profile a, @e final String b) {
            k0.p(a, "profile");
            k0.p(b, "token");
            this.a = a;
            this.b = b;
        }
        
        @e
        public final Profile a() {
            return this.a;
        }
        
        @e
        public final String b() {
            return this.b;
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007" }, d2 = { "com/untis/mobile/activities/messenger/AuthenticateActivity$b", "", "", "MESSENGER_INTENT_ACTION", "Ljava/lang/String;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class b
    {
        private b() {
        }
    }
}
