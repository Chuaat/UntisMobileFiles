// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.app;

import android.os.Bundle;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import androidx.annotation.k0;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import android.content.Context;
import android.content.ComponentName;
import android.os.Build$VERSION;
import android.content.Intent;
import androidx.annotation.j0;
import android.app.Activity;

public final class n
{
    private static final String a = "NavUtils";
    public static final String b = "android.support.PARENT_ACTIVITY";
    
    private n() {
    }
    
    @k0
    public static Intent a(@j0 final Activity activity) {
        if (Build$VERSION.SDK_INT >= 16) {
            final Intent parentActivityIntent = activity.getParentActivityIntent();
            if (parentActivityIntent != null) {
                return parentActivityIntent;
            }
        }
        final String d = d(activity);
        if (d == null) {
            return null;
        }
        final ComponentName component = new ComponentName((Context)activity, d);
        try {
            Intent intent;
            if (e((Context)activity, component) == null) {
                intent = Intent.makeMainActivity(component);
            }
            else {
                intent = new Intent().setComponent(component);
            }
            return intent;
        }
        catch (PackageManager$NameNotFoundException ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append("getParentActivityIntent: bad parentActivityName '");
            sb.append(d);
            sb.append("' in manifest");
            Log.e("NavUtils", sb.toString());
            return null;
        }
    }
    
    @k0
    public static Intent b(@j0 final Context context, @j0 ComponentName component) throws PackageManager$NameNotFoundException {
        final String e = e(context, component);
        if (e == null) {
            return null;
        }
        component = new ComponentName(component.getPackageName(), e);
        Intent intent;
        if (e(context, component) == null) {
            intent = Intent.makeMainActivity(component);
        }
        else {
            intent = new Intent().setComponent(component);
        }
        return intent;
    }
    
    @k0
    public static Intent c(@j0 final Context context, @j0 final Class<?> clazz) throws PackageManager$NameNotFoundException {
        final String e = e(context, new ComponentName(context, (Class)clazz));
        if (e == null) {
            return null;
        }
        final ComponentName component = new ComponentName(context, e);
        Intent intent;
        if (e(context, component) == null) {
            intent = Intent.makeMainActivity(component);
        }
        else {
            intent = new Intent().setComponent(component);
        }
        return intent;
    }
    
    @k0
    public static String d(@j0 final Activity activity) {
        try {
            return e((Context)activity, activity.getComponentName());
        }
        catch (PackageManager$NameNotFoundException cause) {
            throw new IllegalArgumentException((Throwable)cause);
        }
    }
    
    @k0
    public static String e(@j0 final Context context, @j0 final ComponentName componentName) throws PackageManager$NameNotFoundException {
        final PackageManager packageManager = context.getPackageManager();
        final int sdk_INT = Build$VERSION.SDK_INT;
        int n = 640;
        if (sdk_INT >= 29) {
            n = 269222528;
        }
        else if (sdk_INT >= 24) {
            n = 787072;
        }
        final ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, n);
        if (sdk_INT >= 16) {
            final String parentActivityName = activityInfo.parentActivityName;
            if (parentActivityName != null) {
                return parentActivityName;
            }
        }
        final Bundle metaData = activityInfo.metaData;
        if (metaData == null) {
            return null;
        }
        final String string = metaData.getString("android.support.PARENT_ACTIVITY");
        if (string == null) {
            return null;
        }
        String string2 = string;
        if (string.charAt(0) == '.') {
            final StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append(string);
            string2 = sb.toString();
        }
        return string2;
    }
    
    public static void f(@j0 final Activity activity) {
        final Intent a = a(activity);
        if (a != null) {
            g(activity, a);
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Activity ");
        sb.append(activity.getClass().getSimpleName());
        sb.append(" does not have a parent activity name specified. (Did you forget to add the android.support.PARENT_ACTIVITY <meta-data>  element in your manifest?)");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static void g(@j0 final Activity activity, @j0 final Intent intent) {
        if (Build$VERSION.SDK_INT >= 16) {
            activity.navigateUpTo(intent);
        }
        else {
            intent.addFlags(67108864);
            activity.startActivity(intent);
            activity.finish();
        }
    }
    
    public static boolean h(@j0 final Activity activity, @j0 final Intent intent) {
        if (Build$VERSION.SDK_INT >= 16) {
            return activity.shouldUpRecreateTask(intent);
        }
        final String action = activity.getIntent().getAction();
        return action != null && !action.equals("android.intent.action.MAIN");
    }
}
