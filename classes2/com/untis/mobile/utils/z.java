// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils;

import android.app.Dialog;
import android.app.Application;
import kotlin.text.s;
import android.os.Build$VERSION;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface$OnClickListener;
import androidx.appcompat.app.d$a;
import android.content.Intent;
import android.net.Uri;
import android.content.ContentResolver;
import android.provider.Settings$SettingNotFoundException;
import android.provider.Settings$Secure;
import android.annotation.TargetApi;
import android.app.KeyguardManager;
import com.untis.mobile.UntisMobileApplication;
import kotlin.jvm.internal.k0;
import android.util.Log;
import android.widget.Toast;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.content.Context;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0003J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0016\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\bJ\u0006\u0010\u000e\u001a\u00020\u0002J\u0016\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\bJ\u0016\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\bJ\u000e\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u0016" }, d2 = { "Lcom/untis/mobile/utils/z;", "", "", "j", "i", "g", "Landroid/content/Context;", "context", "", "text", "Lkotlin/j2;", "c", "url", "k", "f", "number", "d", "email", "l", "h", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class z
{
    @e
    public static final z a;
    
    static {
        a = new z();
    }
    
    private z() {
    }
    
    private final void c(final Context context, final String str) {
        try {
            final Object systemService = context.getSystemService("clipboard");
            ClipboardManager clipboardManager;
            if (systemService instanceof ClipboardManager) {
                clipboardManager = (ClipboardManager)systemService;
            }
            else {
                clipboardManager = null;
            }
            if (clipboardManager == null) {
                return;
            }
            clipboardManager.setPrimaryClip(ClipData.newPlainText((CharSequence)str, (CharSequence)str));
            Toast.makeText(context, 2131886651, 0).show();
        }
        catch (Exception ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append("could not copy '");
            sb.append(str);
            sb.append("' to clipboard");
            Log.e("untis_log", sb.toString(), (Throwable)ex);
        }
    }
    
    private static final void e(final Context context, final String s, final DialogInterface dialogInterface, final int n) {
        k0.p(context, "$context");
        k0.p(s, "$number");
        z.a.c(context, s);
    }
    
    @TargetApi(23)
    private final boolean g() {
        final UntisMobileApplication b = UntisMobileApplication.I.b();
        Object systemService;
        if (b == null) {
            systemService = null;
        }
        else {
            systemService = ((Application)b).getSystemService("keyguard");
        }
        final KeyguardManager keyguardManager = (KeyguardManager)systemService;
        boolean b2 = false;
        if (keyguardManager != null) {
            if (keyguardManager.isDeviceSecure()) {
                b2 = true;
            }
        }
        return b2;
    }
    
    private final boolean i() {
        final UntisMobileApplication b = UntisMobileApplication.I.b();
        Object systemService;
        if (b == null) {
            systemService = null;
        }
        else {
            systemService = ((Application)b).getSystemService("keyguard");
        }
        final KeyguardManager keyguardManager = (KeyguardManager)systemService;
        boolean b2 = false;
        if (keyguardManager != null) {
            if (keyguardManager.isKeyguardSecure()) {
                b2 = true;
            }
        }
        return b2;
    }
    
    private final boolean j() {
        boolean b = false;
        try {
            final UntisMobileApplication b2 = UntisMobileApplication.I.b();
            ContentResolver contentResolver;
            if (b2 == null) {
                contentResolver = null;
            }
            else {
                contentResolver = ((Application)b2).getContentResolver();
            }
            if (Settings$Secure.getInt(contentResolver, "lock_pattern_autolock") == 1) {
                b = true;
            }
            return b;
        }
        catch (Settings$SettingNotFoundException ex) {
            return b;
        }
    }
    
    private static final void m(final Context context, final String s, final DialogInterface dialogInterface, final int n) {
        k0.p(context, "$context");
        k0.p(s, "$email");
        z.a.c(context, s);
    }
    
    public final void d(@e final Context context, @e final String s) {
        k0.p(context, "context");
        k0.p(s, "number");
        try {
            context.startActivity(new Intent("android.intent.action.DIAL", Uri.fromParts("tel", s, (String)null)));
        }
        catch (ActivityNotFoundException ex) {
            ((Dialog)new d$a(context).n((CharSequence)s).u(2131886652, (DialogInterface$OnClickListener)new y(context, s)).a()).show();
        }
    }
    
    public final boolean f() {
        boolean g;
        if (Build$VERSION.SDK_INT >= 23) {
            g = this.g();
        }
        else {
            g = (this.j() || this.i());
        }
        return g;
    }
    
    public final boolean h(@e final Context context) {
        k0.p(context, "context");
        final String iso3Language = context.getResources().getConfiguration().locale.getISO3Language();
        k0.o(iso3Language, "context.resources.configuration.locale.isO3Language");
        return s.s2(iso3Language, "de", true);
    }
    
    public final void k(@e final Context context, @e final String s) {
        k0.p(context, "context");
        k0.p(s, "url");
        final Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(s));
        intent.addFlags(268435456);
        context.startActivity(intent);
    }
    
    public final void l(@e final Context context, @e final String s) {
        k0.p(context, "context");
        k0.p(s, "email");
        try {
            final Intent intent = new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", s, (String)null));
            intent.putExtra("android.intent.extra.EMAIL", new String[] { s });
            context.startActivity(Intent.createChooser(intent, (CharSequence)s));
        }
        catch (ActivityNotFoundException ex) {
            ((Dialog)new d$a(context).n((CharSequence)s).u(2131886652, (DialogInterface$OnClickListener)new x(context, s)).a()).show();
        }
    }
}
