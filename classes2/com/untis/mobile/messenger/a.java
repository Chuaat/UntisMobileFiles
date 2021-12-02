// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.messenger;

import kotlin.text.s;
import android.widget.Toast;
import android.util.Log;
import android.net.Uri;
import android.content.Context;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.profile.Profile;
import org.jetbrains.annotations.f;
import android.content.Intent;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b*\u0010+J(\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0002J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bJ\u0016\u0010\u0013\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0002J\u0006\u0010\u0014\u001a\u00020\u0006J\u0006\u0010\u0015\u001a\u00020\u0006J\u0010\u0010\u0016\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0017\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0018\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u0019\u001a\u00020\u0006J\u001a\u0010\u001a\u001a\u00020\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u001b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u001c\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002J\u0016\u0010\u001d\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0002R\u0016\u0010\u001f\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001eR\u0016\u0010 \u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u0016\u0010\"\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u001eR\u0016\u0010#\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u001eR\u0016\u0010$\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u001eR\u0016\u0010%\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR\u0016\u0010&\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u001eR\u0016\u0010'\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u001eR\u0016\u0010(\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001eR\u0016\u0010)\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006," }, d2 = { "Lcom/untis/mobile/messenger/a;", "", "", "type", "code", "message", "Landroid/content/Intent;", "c", "Landroid/content/Context;", "context", "", "h", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "channelId", "Lkotlin/j2;", "m", "i", "token", "b", "p", "f", "j", "a", "n", "k", "o", "l", "g", "e", "Ljava/lang/String;", "KEY_ERROR_CODE", "PACKAGE_NAME_DEBUG", "d", "STORE_PACKAGE_NAME", "KEY_ORGANIZATION_ID", "PACKAGE_NAME", "KEY_AUTHENTICATION_TOKEN", "KEY_ERROR_TYPE", "KEY_ERROR_MESSAGE", "KEY_CHANNEL_ID", "KEY_SERVER_URL_WITHOUT_HTTPS", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class a
{
    @e
    public static final a a;
    @e
    private static final String b = "com.untis.chat";
    @e
    private static final String c = "com.untis.chat.debug";
    @e
    private static final String d = "com.untis.chat";
    @e
    private static final String e = "SERVER_URL_WITHOUT_HTTPS";
    @e
    private static final String f = "ORGANIZATION_ID";
    @e
    private static final String g = "CHANNEL_ID";
    @e
    private static final String h = "TOKEN";
    @e
    private static final String i = "ERROR_TYPE";
    @e
    private static final String j = "ERROR_MESSAGE";
    @e
    private static final String k = "ERROR_CODE";
    
    static {
        a = new a();
    }
    
    private a() {
    }
    
    private final Intent c(String s, final String s2, final String s3) {
        final Intent intent = new Intent();
        intent.putExtra("ERROR_TYPE", s);
        if (s2 != null) {
            intent.putExtra("ERROR_CODE", s2);
        }
        if ((s = s3) == null) {
            s = "";
        }
        intent.putExtra("ERROR_MESSAGE", s);
        return intent;
    }
    
    static /* synthetic */ Intent d(final a a, final String s, String s2, String s3, final int n, final Object o) {
        if ((n & 0x2) != 0x0) {
            s2 = null;
        }
        if ((n & 0x4) != 0x0) {
            s3 = null;
        }
        return a.c(s, s2, s3);
    }
    
    @e
    public final Intent a(@f final String s) {
        return d(this, "accountMissing", null, s, 2, null);
    }
    
    @e
    public final Intent b(@e final Profile profile, @e final String s) {
        k0.p(profile, "profile");
        k0.p(s, "token");
        final Intent intent = new Intent();
        intent.putExtra("SERVER_URL_WITHOUT_HTTPS", profile.getMessengerServerUrl());
        intent.putExtra("ORGANIZATION_ID", Integer.parseInt(profile.getMessengerOrganizationId()));
        intent.putExtra("TOKEN", s);
        return intent;
    }
    
    public final boolean e(@e final Profile profile, @e final String s) {
        k0.p(profile, "profile");
        k0.p(s, "token");
        return profile.getMessengerOrganizationId().length() != 0 && profile.getMessengerServerUrl().length() != 0 && s.length() != 0;
    }
    
    @e
    public final Intent f() {
        return d(this, "incompleteData", null, null, 6, null);
    }
    
    @e
    public final Intent g(@f final String s) {
        return this.c("invalidUserStatus", null, s);
    }
    
    public final boolean h(@e final Context context) {
        k0.p(context, "context");
        boolean b = false;
        try {
            if (context.getPackageManager().getLaunchIntentForPackage("com.untis.chat") != null || context.getPackageManager().getLaunchIntentForPackage("com.untis.chat.debug") != null) {
                b = true;
            }
            return b;
        }
        catch (Exception ex) {
            return b;
        }
    }
    
    public final void i(@e final Context context) {
        k0.p(context, "context");
        try {
            final Intent intent = new Intent("android.intent.action.VIEW");
            intent.addFlags(268435456);
            intent.setData(Uri.parse("market://details?id=com.untis.chat"));
            context.startActivity(intent);
        }
        catch (Exception ex) {
            Log.e("untis_log", "could not open market", (Throwable)ex);
            Toast.makeText(context, (CharSequence)"no google play store", 1).show();
        }
    }
    
    @e
    public final Intent j(@f final String s) {
        return d(this, "messengerDisabled", null, s, 2, null);
    }
    
    @e
    public final Intent k() {
        return d(this, "messengerNotAvailable", null, null, 6, null);
    }
    
    @e
    public final Intent l(@f final String s) {
        return this.c("noProfile", null, s);
    }
    
    public final void m(@e final Context context, @e final Profile profile, @f final String s) {
        k0.p(context, "context");
        k0.p(profile, "profile");
        if (s.U1((CharSequence)profile.getMessengerOrganizationId())) {
            return;
        }
        if (s.U1((CharSequence)profile.getMessengerServerUrl())) {
            return;
        }
        try {
            Intent intent;
            if ((intent = context.getPackageManager().getLaunchIntentForPackage("com.untis.chat")) == null && (intent = context.getPackageManager().getLaunchIntentForPackage("com.untis.chat.debug")) == null) {
                return;
            }
            intent.addFlags(268435456);
            intent.addFlags(67108864);
            intent.putExtra("SERVER_URL_WITHOUT_HTTPS", profile.getMessengerServerUrl());
            intent.putExtra("ORGANIZATION_ID", Integer.parseInt(profile.getMessengerOrganizationId()));
            if (s != null) {
                intent.putExtra("CHANNEL_ID", Integer.parseInt(s));
            }
            context.startActivity(intent);
        }
        catch (Exception ex) {
            Log.e("untis_log", "error on open channel", (Throwable)ex);
        }
    }
    
    @e
    public final Intent n(@f final String s) {
        return d(this, "organizationMissing", null, s, 2, null);
    }
    
    @e
    public final Intent o(@f final String s, @f final String s2) {
        return this.c("other", s, s2);
    }
    
    @e
    public final Intent p() {
        return d(this, "requestNotPossible", null, null, 6, null);
    }
}
