// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.content;

import android.view.WindowManager;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pManager;
import android.app.WallpaperManager;
import android.os.Vibrator;
import android.hardware.usb.UsbManager;
import android.app.UiModeManager;
import android.view.textservice.TextServicesManager;
import android.telephony.TelephonyManager;
import android.os.storage.StorageManager;
import android.hardware.SensorManager;
import android.app.SearchManager;
import android.os.PowerManager;
import android.app.NotificationManager;
import android.nfc.NfcManager;
import android.location.LocationManager;
import android.view.LayoutInflater;
import android.app.KeyguardManager;
import android.view.inputmethod.InputMethodManager;
import android.os.DropBoxManager;
import android.app.DownloadManager;
import android.app.admin.DevicePolicyManager;
import android.net.ConnectivityManager;
import android.content.ClipboardManager;
import android.media.AudioManager;
import android.app.AlarmManager;
import android.app.ActivityManager;
import android.accounts.AccountManager;
import android.view.accessibility.AccessibilityManager;
import android.net.nsd.NsdManager;
import android.media.MediaRouter;
import android.hardware.input.InputManager;
import android.os.UserManager;
import android.hardware.display.DisplayManager;
import android.bluetooth.BluetoothManager;
import android.print.PrintManager;
import android.hardware.ConsumerIrManager;
import android.view.accessibility.CaptioningManager;
import android.app.AppOpsManager;
import android.media.tv.TvInputManager;
import android.telecom.TelecomManager;
import android.content.RestrictionsManager;
import android.media.session.MediaSessionManager;
import android.media.projection.MediaProjectionManager;
import android.content.pm.LauncherApps;
import android.app.job.JobScheduler;
import android.hardware.camera2.CameraManager;
import android.os.BatteryManager;
import android.appwidget.AppWidgetManager;
import android.app.usage.UsageStatsManager;
import android.telephony.SubscriptionManager;
import java.util.HashMap;
import android.content.ComponentName;
import androidx.annotation.r;
import androidx.annotation.p0;
import android.os.Bundle;
import android.content.Intent;
import androidx.core.os.f;
import android.os.Handler;
import java.util.concurrent.Executor;
import android.graphics.drawable.Drawable;
import androidx.annotation.s;
import androidx.core.content.res.g;
import android.content.res.ColorStateList;
import androidx.annotation.l;
import androidx.annotation.n;
import android.util.Log;
import java.io.File;
import androidx.annotation.k0;
import android.os.Build$VERSION;
import android.os.Process;
import androidx.annotation.j0;
import android.content.Context;
import android.util.TypedValue;

public class d
{
    private static final String a = "ContextCompat";
    private static final Object b;
    private static final Object c;
    private static TypedValue d;
    
    static {
        b = new Object();
        c = new Object();
    }
    
    protected d() {
    }
    
    public static int a(@j0 final Context context, @j0 final String s) {
        if (s != null) {
            return context.checkPermission(s, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }
    
    @k0
    public static Context b(@j0 final Context context) {
        if (Build$VERSION.SDK_INT >= 24) {
            return e.a(context);
        }
        return null;
    }
    
    private static File c(final File file) {
        synchronized (androidx.core.content.d.c) {
            if (!file.exists()) {
                if (file.mkdirs()) {
                    return file;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Unable to create files subdir ");
                sb.append(file.getPath());
                Log.w("ContextCompat", sb.toString());
            }
            return file;
        }
    }
    
    @k0
    public static String d(@j0 final Context context) {
        if (Build$VERSION.SDK_INT >= 30) {
            return h.a(context);
        }
        return null;
    }
    
    public static File e(@j0 final Context context) {
        if (Build$VERSION.SDK_INT >= 21) {
            return androidx.core.content.d.c.a(context);
        }
        return c(new File(context.getApplicationInfo().dataDir, "code_cache"));
    }
    
    @l
    public static int f(@j0 final Context context, @n final int n) {
        if (Build$VERSION.SDK_INT >= 23) {
            return androidx.core.content.d.d.a(context, n);
        }
        return context.getResources().getColor(n);
    }
    
    @k0
    public static ColorStateList g(@j0 final Context context, @n final int n) {
        return androidx.core.content.res.g.e(context.getResources(), n, context.getTheme());
    }
    
    @k0
    public static File h(@j0 final Context context) {
        if (Build$VERSION.SDK_INT >= 24) {
            return e.b(context);
        }
        final String dataDir = context.getApplicationInfo().dataDir;
        File file;
        if (dataDir != null) {
            file = new File(dataDir);
        }
        else {
            file = null;
        }
        return file;
    }
    
    @k0
    public static Drawable i(@j0 final Context context, @s int resourceId) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 21) {
            return androidx.core.content.d.c.b(context, resourceId);
        }
        if (sdk_INT < 16) {
            synchronized (androidx.core.content.d.b) {
                if (androidx.core.content.d.d == null) {
                    androidx.core.content.d.d = new TypedValue();
                }
                context.getResources().getValue(resourceId, androidx.core.content.d.d, true);
                resourceId = androidx.core.content.d.d.resourceId;
            }
        }
        return context.getResources().getDrawable(resourceId);
    }
    
    @j0
    public static File[] j(@j0 final Context context) {
        if (Build$VERSION.SDK_INT >= 19) {
            return androidx.core.content.d.b.a(context);
        }
        return new File[] { context.getExternalCacheDir() };
    }
    
    @j0
    public static File[] k(@j0 final Context context, @k0 final String s) {
        if (Build$VERSION.SDK_INT >= 19) {
            return androidx.core.content.d.b.b(context, s);
        }
        return new File[] { context.getExternalFilesDir(s) };
    }
    
    public static Executor l(final Context context) {
        if (Build$VERSION.SDK_INT >= 28) {
            return g.a(context);
        }
        return androidx.core.os.f.a(new Handler(context.getMainLooper()));
    }
    
    @k0
    public static File m(@j0 final Context context) {
        if (Build$VERSION.SDK_INT >= 21) {
            return androidx.core.content.d.c.c(context);
        }
        return c(new File(context.getApplicationInfo().dataDir, "no_backup"));
    }
    
    @j0
    public static File[] n(@j0 final Context context) {
        if (Build$VERSION.SDK_INT >= 19) {
            return androidx.core.content.d.b.c(context);
        }
        return new File[] { context.getObbDir() };
    }
    
    @k0
    public static <T> T o(@j0 final Context context, @j0 final Class<T> clazz) {
        if (Build$VERSION.SDK_INT >= 23) {
            return androidx.core.content.d.d.c(context, clazz);
        }
        final String p2 = p(context, clazz);
        Object systemService;
        if (p2 != null) {
            systemService = context.getSystemService(p2);
        }
        else {
            systemService = null;
        }
        return (T)systemService;
    }
    
    @k0
    public static String p(@j0 final Context context, @j0 final Class<?> key) {
        if (Build$VERSION.SDK_INT >= 23) {
            return androidx.core.content.d.d.d(context, key);
        }
        return i.a.get(key);
    }
    
    public static boolean q(@j0 final Context context) {
        return Build$VERSION.SDK_INT >= 24 && e.c(context);
    }
    
    public static boolean r(@j0 final Context context, @j0 final Intent[] array) {
        return s(context, array, null);
    }
    
    public static boolean s(@j0 final Context context, @j0 final Intent[] array, @k0 final Bundle bundle) {
        if (Build$VERSION.SDK_INT >= 16) {
            androidx.core.content.d.a.a(context, array, bundle);
        }
        else {
            context.startActivities(array);
        }
        return true;
    }
    
    public static void t(@j0 final Context context, @j0 final Intent intent, @k0 final Bundle bundle) {
        if (Build$VERSION.SDK_INT >= 16) {
            androidx.core.content.d.a.b(context, intent, bundle);
        }
        else {
            context.startActivity(intent);
        }
    }
    
    public static void u(@j0 final Context context, @j0 final Intent intent) {
        if (Build$VERSION.SDK_INT >= 26) {
            f.a(context, intent);
        }
        else {
            context.startService(intent);
        }
    }
    
    @p0(16)
    static class a
    {
        private a() {
        }
        
        @r
        static void a(final Context context, final Intent[] array, final Bundle bundle) {
            context.startActivities(array, bundle);
        }
        
        @r
        static void b(final Context context, final Intent intent, final Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }
    
    @p0(19)
    static class b
    {
        private b() {
        }
        
        @r
        static File[] a(final Context context) {
            return context.getExternalCacheDirs();
        }
        
        @r
        static File[] b(final Context context, final String s) {
            return context.getExternalFilesDirs(s);
        }
        
        @r
        static File[] c(final Context context) {
            return context.getObbDirs();
        }
    }
    
    @p0(21)
    static class c
    {
        private c() {
        }
        
        @r
        static File a(final Context context) {
            return context.getCodeCacheDir();
        }
        
        @r
        static Drawable b(final Context context, final int n) {
            return context.getDrawable(n);
        }
        
        @r
        static File c(final Context context) {
            return context.getNoBackupFilesDir();
        }
    }
    
    @p0(23)
    static class d
    {
        private d() {
        }
        
        @r
        static int a(final Context context, final int n) {
            return context.getColor(n);
        }
        
        @r
        static ColorStateList b(final Context context, final int n) {
            return context.getColorStateList(n);
        }
        
        @r
        static <T> T c(final Context context, final Class<T> clazz) {
            return (T)context.getSystemService((Class)clazz);
        }
        
        @r
        static String d(final Context context, final Class<?> clazz) {
            return context.getSystemServiceName((Class)clazz);
        }
    }
    
    @p0(24)
    static class e
    {
        private e() {
        }
        
        @r
        static Context a(final Context context) {
            return context.createDeviceProtectedStorageContext();
        }
        
        @r
        static File b(final Context context) {
            return context.getDataDir();
        }
        
        @r
        static boolean c(final Context context) {
            return context.isDeviceProtectedStorage();
        }
    }
    
    @p0(26)
    static class f
    {
        private f() {
        }
        
        @r
        static ComponentName a(final Context context, final Intent intent) {
            return context.startForegroundService(intent);
        }
    }
    
    @p0(28)
    static class g
    {
        private g() {
        }
        
        @r
        static Executor a(final Context context) {
            return context.getMainExecutor();
        }
    }
    
    @p0(30)
    static class h
    {
        private h() {
        }
        
        @r
        static String a(final Context context) {
            return context.getAttributionTag();
        }
    }
    
    private static final class i
    {
        static final HashMap<Class<?>, String> a;
        
        static {
            final HashMap<Class<?>, String> hashMap = (HashMap<Class<?>, String>)(a = new HashMap<Class<?>, String>());
            final int sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT >= 22) {
                hashMap.put(SubscriptionManager.class, "telephony_subscription_service");
                hashMap.put(UsageStatsManager.class, "usagestats");
            }
            if (sdk_INT >= 21) {
                hashMap.put(AppWidgetManager.class, "appwidget");
                hashMap.put(BatteryManager.class, "batterymanager");
                hashMap.put(CameraManager.class, "camera");
                hashMap.put(JobScheduler.class, "jobscheduler");
                hashMap.put(LauncherApps.class, "launcherapps");
                hashMap.put(MediaProjectionManager.class, "media_projection");
                hashMap.put(MediaSessionManager.class, "media_session");
                hashMap.put(RestrictionsManager.class, "restrictions");
                hashMap.put(TelecomManager.class, "telecom");
                hashMap.put(TvInputManager.class, "tv_input");
            }
            if (sdk_INT >= 19) {
                hashMap.put(AppOpsManager.class, "appops");
                hashMap.put(CaptioningManager.class, "captioning");
                hashMap.put(ConsumerIrManager.class, "consumer_ir");
                hashMap.put(PrintManager.class, "print");
            }
            if (sdk_INT >= 18) {
                hashMap.put(BluetoothManager.class, "bluetooth");
            }
            if (sdk_INT >= 17) {
                hashMap.put(DisplayManager.class, "display");
                hashMap.put(UserManager.class, "user");
            }
            if (sdk_INT >= 16) {
                hashMap.put(InputManager.class, "input");
                hashMap.put(MediaRouter.class, "media_router");
                hashMap.put(NsdManager.class, "servicediscovery");
            }
            hashMap.put(AccessibilityManager.class, "accessibility");
            hashMap.put(AccountManager.class, "account");
            hashMap.put(ActivityManager.class, "activity");
            hashMap.put(AlarmManager.class, "alarm");
            hashMap.put(AudioManager.class, "audio");
            hashMap.put(ClipboardManager.class, "clipboard");
            hashMap.put(ConnectivityManager.class, "connectivity");
            hashMap.put(DevicePolicyManager.class, "device_policy");
            hashMap.put(DownloadManager.class, "download");
            hashMap.put(DropBoxManager.class, "dropbox");
            hashMap.put(InputMethodManager.class, "input_method");
            hashMap.put(KeyguardManager.class, "keyguard");
            hashMap.put(LayoutInflater.class, "layout_inflater");
            hashMap.put(LocationManager.class, "location");
            hashMap.put(NfcManager.class, "nfc");
            hashMap.put(NotificationManager.class, "notification");
            hashMap.put(PowerManager.class, "power");
            hashMap.put(SearchManager.class, "search");
            hashMap.put(SensorManager.class, "sensor");
            hashMap.put(StorageManager.class, "storage");
            hashMap.put(TelephonyManager.class, "phone");
            hashMap.put(TextServicesManager.class, "textservices");
            hashMap.put(UiModeManager.class, "uimode");
            hashMap.put(UsbManager.class, "usb");
            hashMap.put(Vibrator.class, "vibrator");
            hashMap.put(WallpaperManager.class, "wallpaper");
            hashMap.put(WifiP2pManager.class, "wifip2p");
            hashMap.put(WifiManager.class, "wifi");
            hashMap.put(WindowManager.class, "window");
        }
    }
}
