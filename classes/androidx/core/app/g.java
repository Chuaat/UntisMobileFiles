// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.app;

import android.content.Intent;
import android.content.SharedPreferences;
import android.app.Activity;
import androidx.annotation.j0;
import android.content.Context;

public class g
{
    private static final String a = "android.support.AppLaunchChecker";
    private static final String b = "startedFromLauncher";
    
    @Deprecated
    public g() {
    }
    
    public static boolean a(@j0 final Context context) {
        return context.getSharedPreferences("android.support.AppLaunchChecker", 0).getBoolean("startedFromLauncher", false);
    }
    
    public static void b(@j0 final Activity activity) {
        final SharedPreferences sharedPreferences = activity.getSharedPreferences("android.support.AppLaunchChecker", 0);
        if (sharedPreferences.getBoolean("startedFromLauncher", false)) {
            return;
        }
        final Intent intent = activity.getIntent();
        if (intent == null) {
            return;
        }
        if ("android.intent.action.MAIN".equals(intent.getAction()) && (intent.hasCategory("android.intent.category.LAUNCHER") || intent.hasCategory("android.intent.category.LEANBACK_LAUNCHER"))) {
            sharedPreferences.edit().putBoolean("startedFromLauncher", true).apply();
        }
    }
}
