// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.content.pm;

import androidx.annotation.t0;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import androidx.annotation.p0;
import android.content.IntentSender$SendIntentException;
import android.os.Handler;
import android.content.IntentSender$OnFinished;
import android.content.BroadcastReceiver;
import android.content.IntentSender;
import java.util.Arrays;
import android.text.TextUtils;
import java.util.Collections;
import android.os.Bundle;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import androidx.core.util.n;
import android.util.DisplayMetrics;
import android.app.ActivityManager;
import androidx.annotation.k0;
import android.content.Intent;
import java.util.Collection;
import android.graphics.Bitmap;
import java.io.InputStream;
import androidx.core.graphics.drawable.IconCompat;
import android.graphics.BitmapFactory;
import java.util.Iterator;
import android.content.pm.ShortcutManager;
import android.content.pm.ShortcutInfo;
import java.util.ArrayList;
import android.os.Build$VERSION;
import androidx.annotation.j0;
import android.content.Context;
import java.util.List;
import androidx.annotation.b1;

public class g
{
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 4;
    public static final int d = 8;
    @b1
    static final String e = "com.android.launcher.action.INSTALL_SHORTCUT";
    @b1
    static final String f = "com.android.launcher.permission.INSTALL_SHORTCUT";
    private static final int g = 96;
    private static final int h = 48;
    public static final String i = "android.intent.extra.shortcut.ID";
    private static volatile f<?> j;
    private static volatile List<d> k;
    private static final String l = "androidx.core.content.pm.SHORTCUT_LISTENER";
    private static final String m = "androidx.core.content.pm.shortcut_listener_impl";
    
    private g() {
    }
    
    @b1
    static void A(final f<Void> j) {
        androidx.core.content.pm.g.j = j;
    }
    
    public static boolean B(@j0 final Context context, @j0 final List<e> list) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT <= 29) {
            c(context, list);
        }
        if (sdk_INT >= 25) {
            final ArrayList<ShortcutInfo> list2 = new ArrayList<ShortcutInfo>();
            final Iterator<e> iterator = list.iterator();
            while (iterator.hasNext()) {
                list2.add(iterator.next().E());
            }
            if (!((ShortcutManager)context.getSystemService((Class)ShortcutManager.class)).updateShortcuts((List)list2)) {
                return false;
            }
        }
        o(context).a(list);
        final Iterator<d> iterator2 = n(context).iterator();
        while (iterator2.hasNext()) {
            iterator2.next().d(list);
        }
        return true;
    }
    
    public static boolean a(@j0 final Context context, @j0 final List<e> list) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT <= 29) {
            c(context, list);
        }
        if (sdk_INT >= 25) {
            final ArrayList<ShortcutInfo> list2 = new ArrayList<ShortcutInfo>();
            final Iterator<e> iterator = list.iterator();
            while (iterator.hasNext()) {
                list2.add(iterator.next().E());
            }
            if (!((ShortcutManager)context.getSystemService((Class)ShortcutManager.class)).addDynamicShortcuts((List)list2)) {
                return false;
            }
        }
        o(context).a(list);
        final Iterator<d> iterator2 = n(context).iterator();
        while (iterator2.hasNext()) {
            iterator2.next().b(list);
        }
        return true;
    }
    
    @b1
    static boolean b(@j0 final Context context, @j0 final e e) {
        final IconCompat i = e.i;
        if (i == null) {
            return false;
        }
        final int a = i.a;
        if (a != 6 && a != 4) {
            return true;
        }
        final InputStream j = i.J(context);
        if (j == null) {
            return false;
        }
        final Bitmap decodeStream = BitmapFactory.decodeStream(j);
        if (decodeStream == null) {
            return false;
        }
        IconCompat k;
        if (a == 6) {
            k = IconCompat.p(decodeStream);
        }
        else {
            k = IconCompat.s(decodeStream);
        }
        e.i = k;
        return true;
    }
    
    @b1
    static void c(@j0 final Context context, @j0 final List<e> c) {
        for (final e e : new ArrayList<Object>(c)) {
            if (!b(context, e)) {
                c.remove(e);
            }
        }
    }
    
    @j0
    public static Intent d(@j0 final Context context, @j0 final e e) {
        Intent shortcutResultIntent;
        if (Build$VERSION.SDK_INT >= 26) {
            shortcutResultIntent = ((ShortcutManager)context.getSystemService((Class)ShortcutManager.class)).createShortcutResultIntent(e.E());
        }
        else {
            shortcutResultIntent = null;
        }
        Intent intent = shortcutResultIntent;
        if (shortcutResultIntent == null) {
            intent = new Intent();
        }
        return e.a(intent);
    }
    
    public static void e(@j0 final Context context, @j0 final List<String> list, @k0 final CharSequence charSequence) {
        if (Build$VERSION.SDK_INT >= 25) {
            ((ShortcutManager)context.getSystemService((Class)ShortcutManager.class)).disableShortcuts((List)list, charSequence);
        }
        o(context).d(list);
        final Iterator<d> iterator = n(context).iterator();
        while (iterator.hasNext()) {
            iterator.next().c(list);
        }
    }
    
    public static void f(@j0 final Context context, @j0 final List<e> list) {
        if (Build$VERSION.SDK_INT >= 25) {
            final ArrayList<String> list2 = new ArrayList<String>(list.size());
            final Iterator<e> iterator = list.iterator();
            while (iterator.hasNext()) {
                list2.add(iterator.next().b);
            }
            ((ShortcutManager)context.getSystemService((Class)ShortcutManager.class)).enableShortcuts((List)list2);
        }
        o(context).a(list);
        final Iterator<d> iterator2 = n(context).iterator();
        while (iterator2.hasNext()) {
            iterator2.next().b(list);
        }
    }
    
    @j0
    public static List<e> g(@j0 final Context context) {
        if (Build$VERSION.SDK_INT >= 25) {
            final List dynamicShortcuts = ((ShortcutManager)context.getSystemService((Class)ShortcutManager.class)).getDynamicShortcuts();
            final ArrayList list = new ArrayList<e>(dynamicShortcuts.size());
            final Iterator<ShortcutInfo> iterator = dynamicShortcuts.iterator();
            while (iterator.hasNext()) {
                list.add(new e.a(context, iterator.next()).c());
            }
            return (List<e>)list;
        }
        try {
            return o(context).b();
        }
        catch (Exception ex) {
            return new ArrayList<e>();
        }
    }
    
    private static int h(@j0 final Context context, final boolean b) {
        final ActivityManager activityManager = (ActivityManager)context.getSystemService("activity");
        int b2;
        if (Build$VERSION.SDK_INT < 19 || activityManager == null || activityManager.isLowRamDevice()) {
            b2 = 48;
        }
        else {
            b2 = 96;
        }
        final int max = Math.max(1, b2);
        final DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float n;
        if (b) {
            n = displayMetrics.xdpi;
        }
        else {
            n = displayMetrics.ydpi;
        }
        return (int)(max * (n / 160.0f));
    }
    
    public static int i(@j0 final Context context) {
        n.g(context);
        if (Build$VERSION.SDK_INT >= 25) {
            return ((ShortcutManager)context.getSystemService((Class)ShortcutManager.class)).getIconMaxHeight();
        }
        return h(context, false);
    }
    
    public static int j(@j0 final Context context) {
        n.g(context);
        if (Build$VERSION.SDK_INT >= 25) {
            return ((ShortcutManager)context.getSystemService((Class)ShortcutManager.class)).getIconMaxWidth();
        }
        return h(context, true);
    }
    
    public static int k(@j0 final Context context) {
        n.g(context);
        if (Build$VERSION.SDK_INT >= 25) {
            return ((ShortcutManager)context.getSystemService((Class)ShortcutManager.class)).getMaxShortcutCountPerActivity();
        }
        return 5;
    }
    
    @b1
    static List<d> l() {
        return androidx.core.content.pm.g.k;
    }
    
    private static String m(@j0 final List<e> list) {
        final Iterator<e> iterator = list.iterator();
        int u = -1;
        String j = null;
        while (iterator.hasNext()) {
            final e e = iterator.next();
            if (e.u() > u) {
                j = e.j();
                u = e.u();
            }
        }
        return j;
    }
    
    private static List<d> n(final Context context) {
        if (androidx.core.content.pm.g.k == null) {
            final ArrayList<d> k = new ArrayList<d>();
            if (Build$VERSION.SDK_INT >= 21) {
                final PackageManager packageManager = context.getPackageManager();
                final Intent intent = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
                intent.setPackage(context.getPackageName());
                final Iterator iterator = packageManager.queryIntentActivities(intent, 128).iterator();
                while (iterator.hasNext()) {
                    final ActivityInfo activityInfo = iterator.next().activityInfo;
                    if (activityInfo == null) {
                        continue;
                    }
                    final Bundle metaData = activityInfo.metaData;
                    if (metaData == null) {
                        continue;
                    }
                    final String string = metaData.getString("androidx.core.content.pm.shortcut_listener_impl");
                    if (string == null) {
                        continue;
                    }
                    try {
                        k.add((d)Class.forName(string, false, g.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context));
                    }
                    catch (Exception ex) {}
                }
            }
            if (androidx.core.content.pm.g.k == null) {
                androidx.core.content.pm.g.k = k;
            }
        }
        return androidx.core.content.pm.g.k;
    }
    
    private static f<?> o(final Context context) {
        if (androidx.core.content.pm.g.j == null) {
            if (Build$VERSION.SDK_INT >= 23) {
                try {
                    androidx.core.content.pm.g.j = (f<?>)Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, g.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
                }
                catch (Exception ex) {}
            }
            if (androidx.core.content.pm.g.j == null) {
                androidx.core.content.pm.g.j = new f.a();
            }
        }
        return androidx.core.content.pm.g.j;
    }
    
    @j0
    public static List<e> p(@j0 final Context context, final int n) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 30) {
            return androidx.core.content.pm.e.c(context, ((ShortcutManager)context.getSystemService((Class)ShortcutManager.class)).getShortcuts(n));
        }
        if (sdk_INT >= 25) {
            final ShortcutManager shortcutManager = (ShortcutManager)context.getSystemService((Class)ShortcutManager.class);
            final ArrayList<Object> list = new ArrayList<Object>();
            if ((n & 0x1) != 0x0) {
                list.addAll(shortcutManager.getManifestShortcuts());
            }
            if ((n & 0x2) != 0x0) {
                list.addAll(shortcutManager.getDynamicShortcuts());
            }
            if ((n & 0x4) != 0x0) {
                list.addAll(shortcutManager.getPinnedShortcuts());
            }
            return androidx.core.content.pm.e.c(context, (List<ShortcutInfo>)list);
        }
        Label_0130: {
            if ((n & 0x2) == 0x0) {
                break Label_0130;
            }
            try {
                return o(context).b();
                return Collections.emptyList();
            }
            catch (Exception ex) {
                return Collections.emptyList();
            }
        }
    }
    
    public static boolean q(@j0 final Context context) {
        n.g(context);
        if (Build$VERSION.SDK_INT >= 25) {
            return ((ShortcutManager)context.getSystemService((Class)ShortcutManager.class)).isRateLimitingActive();
        }
        return p(context, 3).size() == k(context);
    }
    
    public static boolean r(@j0 final Context context) {
        if (Build$VERSION.SDK_INT >= 26) {
            return ((ShortcutManager)context.getSystemService((Class)ShortcutManager.class)).isRequestPinShortcutSupported();
        }
        if (androidx.core.content.d.a(context, "com.android.launcher.permission.INSTALL_SHORTCUT") != 0) {
            return false;
        }
        final Iterator<ResolveInfo> iterator = context.getPackageManager().queryBroadcastReceivers(new Intent("com.android.launcher.action.INSTALL_SHORTCUT"), 0).iterator();
        while (iterator.hasNext()) {
            final String permission = iterator.next().activityInfo.permission;
            if (TextUtils.isEmpty((CharSequence)permission) || "com.android.launcher.permission.INSTALL_SHORTCUT".equals(permission)) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean s(@j0 final Context context, @j0 final e o) {
        n.g(context);
        n.g(o);
        final int k = k(context);
        if (k == 0) {
            return false;
        }
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT <= 29) {
            b(context, o);
        }
        if (sdk_INT >= 30) {
            ((ShortcutManager)context.getSystemService((Class)ShortcutManager.class)).pushDynamicShortcut(o.E());
        }
        else if (sdk_INT >= 25) {
            final ShortcutManager shortcutManager = (ShortcutManager)context.getSystemService((Class)ShortcutManager.class);
            if (shortcutManager.isRateLimitingActive()) {
                return false;
            }
            final List dynamicShortcuts = shortcutManager.getDynamicShortcuts();
            if (dynamicShortcuts.size() >= k) {
                shortcutManager.removeDynamicShortcuts((List)Arrays.asList(androidx.core.content.pm.g.b.a(dynamicShortcuts)));
            }
            shortcutManager.addDynamicShortcuts((List)Arrays.asList(o.E()));
        }
        final f<?> o2 = o(context);
        try {
            final List b = o2.b();
            if (b.size() >= k) {
                o2.d(Arrays.asList(m(b)));
            }
            o2.a(Arrays.asList(o));
            return true;
        }
        catch (Exception ex) {
            return false;
        }
        finally {
            final Iterator<d> iterator = n(context).iterator();
            while (iterator.hasNext()) {
                iterator.next().b(Collections.singletonList(o));
            }
            w(context, o.j());
        }
    }
    
    public static void t(@j0 final Context context) {
        if (Build$VERSION.SDK_INT >= 25) {
            ((ShortcutManager)context.getSystemService((Class)ShortcutManager.class)).removeAllDynamicShortcuts();
        }
        o(context).c();
        final Iterator<d> iterator = n(context).iterator();
        while (iterator.hasNext()) {
            iterator.next().a();
        }
    }
    
    public static void u(@j0 final Context context, @j0 final List<String> list) {
        if (Build$VERSION.SDK_INT >= 25) {
            ((ShortcutManager)context.getSystemService((Class)ShortcutManager.class)).removeDynamicShortcuts((List)list);
        }
        o(context).d(list);
        final Iterator<d> iterator = n(context).iterator();
        while (iterator.hasNext()) {
            iterator.next().c(list);
        }
    }
    
    public static void v(@j0 final Context context, @j0 final List<String> list) {
        if (Build$VERSION.SDK_INT < 30) {
            u(context, list);
            return;
        }
        ((ShortcutManager)context.getSystemService((Class)ShortcutManager.class)).removeLongLivedShortcuts((List)list);
        o(context).d(list);
        final Iterator<d> iterator = n(context).iterator();
        while (iterator.hasNext()) {
            iterator.next().c(list);
        }
    }
    
    public static void w(@j0 final Context context, @j0 final String o) {
        n.g(context);
        n.g(o);
        if (Build$VERSION.SDK_INT >= 25) {
            ((ShortcutManager)context.getSystemService((Class)ShortcutManager.class)).reportShortcutUsed(o);
        }
        final Iterator<d> iterator = n(context).iterator();
        while (iterator.hasNext()) {
            iterator.next().e(Collections.singletonList(o));
        }
    }
    
    public static boolean x(@j0 final Context context, @j0 final e e, @k0 final IntentSender intentSender) {
        if (Build$VERSION.SDK_INT >= 26) {
            return ((ShortcutManager)context.getSystemService((Class)ShortcutManager.class)).requestPinShortcut(e.E(), intentSender);
        }
        if (!r(context)) {
            return false;
        }
        final Intent a = e.a(new Intent("com.android.launcher.action.INSTALL_SHORTCUT"));
        if (intentSender == null) {
            context.sendBroadcast(a);
            return true;
        }
        context.sendOrderedBroadcast(a, (String)null, (BroadcastReceiver)new BroadcastReceiver() {
            public void onReceive(final Context context, final Intent intent) {
                try {
                    intentSender.sendIntent(context, 0, (Intent)null, (IntentSender$OnFinished)null, (Handler)null);
                }
                catch (IntentSender$SendIntentException ex) {}
            }
        }, (Handler)null, -1, (String)null, (Bundle)null);
        return true;
    }
    
    public static boolean y(@j0 final Context context, @j0 final List<e> list) {
        n.g(context);
        n.g(list);
        if (Build$VERSION.SDK_INT >= 25) {
            final ArrayList<ShortcutInfo> dynamicShortcuts = new ArrayList<ShortcutInfo>(list.size());
            final Iterator<e> iterator = list.iterator();
            while (iterator.hasNext()) {
                dynamicShortcuts.add(iterator.next().E());
            }
            if (!((ShortcutManager)context.getSystemService((Class)ShortcutManager.class)).setDynamicShortcuts((List)dynamicShortcuts)) {
                return false;
            }
        }
        o(context).c();
        o(context).a(list);
        for (final d d : n(context)) {
            d.a();
            d.b(list);
        }
        return true;
    }
    
    @b1
    static void z(final List<d> k) {
        androidx.core.content.pm.g.k = k;
    }
    
    @p0(25)
    private static class b
    {
        static String a(@j0 final List<ShortcutInfo> list) {
            final Iterator<ShortcutInfo> iterator = list.iterator();
            int rank = -1;
            String id = null;
            while (iterator.hasNext()) {
                final ShortcutInfo shortcutInfo = iterator.next();
                if (shortcutInfo.getRank() > rank) {
                    id = shortcutInfo.getId();
                    rank = shortcutInfo.getRank();
                }
            }
            return id;
        }
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ t0.a.I })
    public @interface c {
    }
}
