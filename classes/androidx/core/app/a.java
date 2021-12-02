// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.app;

import android.app.SharedElementCallback$OnSharedElementsReadyListener;
import java.util.Map;
import java.util.List;
import android.content.Context;
import android.os.Parcelable;
import android.graphics.RectF;
import android.graphics.Matrix;
import android.content.LocusId;
import androidx.annotation.p0;
import android.net.Uri;
import androidx.annotation.t0;
import android.content.IntentSender$SendIntentException;
import android.content.IntentSender;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.content.g;
import android.app.SharedElementCallback;
import android.view.View;
import androidx.annotation.y;
import android.content.pm.PackageManager;
import android.os.Looper;
import java.util.Arrays;
import android.text.TextUtils;
import androidx.annotation.b0;
import androidx.annotation.k0;
import androidx.core.view.f;
import android.view.DragEvent;
import android.os.Handler;
import android.os.Build$VERSION;
import androidx.annotation.j0;
import android.app.Activity;
import androidx.core.content.d;

public class a extends androidx.core.content.d
{
    private static e e;
    
    protected a() {
    }
    
    public static void A(@j0 final Activity activity) {
        if (Build$VERSION.SDK_INT >= 21) {
            activity.postponeEnterTransition();
        }
    }
    
    public static void B(@j0 final Activity activity) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT < 28) {
            if (sdk_INT <= 23) {
                new Handler(activity.getMainLooper()).post((Runnable)new Runnable() {
                    @Override
                    public void run() {
                        if (!activity.isFinishing() && !androidx.core.app.d.i(activity)) {
                            activity.recreate();
                        }
                    }
                });
                return;
            }
            if (androidx.core.app.d.i(activity)) {
                return;
            }
        }
        activity.recreate();
    }
    
    @k0
    public static androidx.core.view.f C(final Activity activity, final DragEvent dragEvent) {
        return androidx.core.view.f.b(activity, dragEvent);
    }
    
    public static void D(@j0 final Activity activity, @j0 final String[] a, @b0(from = 0L) final int n) {
        final e e = a.e;
        if (e != null && e.b(activity, a, n)) {
            return;
        }
        for (int length = a.length, i = 0; i < length; ++i) {
            if (TextUtils.isEmpty((CharSequence)a[i])) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Permission request for permissions ");
                sb.append(Arrays.toString(a));
                sb.append(" must not contain null or empty values");
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (Build$VERSION.SDK_INT >= 23) {
            if (activity instanceof f) {
                ((f)activity).validateRequestPermissionsRequestCode(n);
            }
            activity.requestPermissions(a, n);
        }
        else if (activity instanceof d) {
            new Handler(Looper.getMainLooper()).post((Runnable)new Runnable() {
                @Override
                public void run() {
                    final int[] array = new int[a.length];
                    final PackageManager packageManager = activity.getPackageManager();
                    final String packageName = activity.getPackageName();
                    for (int length = a.length, i = 0; i < length; ++i) {
                        array[i] = packageManager.checkPermission(a[i], packageName);
                    }
                    ((d)activity).onRequestPermissionsResult(n, a, array);
                }
            });
        }
    }
    
    @j0
    public static <T extends View> T E(@j0 final Activity activity, @y final int n) {
        if (Build$VERSION.SDK_INT >= 28) {
            return (T)activity.requireViewById(n);
        }
        final View viewById = activity.findViewById(n);
        if (viewById != null) {
            return (T)viewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Activity");
    }
    
    public static void F(@j0 final Activity activity, @k0 final androidx.core.app.b0 b0) {
        if (Build$VERSION.SDK_INT >= 21) {
            g enterSharedElementCallback;
            if (b0 != null) {
                enterSharedElementCallback = new g(b0);
            }
            else {
                enterSharedElementCallback = null;
            }
            activity.setEnterSharedElementCallback((SharedElementCallback)enterSharedElementCallback);
        }
    }
    
    public static void G(@j0 final Activity activity, @k0 final androidx.core.app.b0 b0) {
        if (Build$VERSION.SDK_INT >= 21) {
            g exitSharedElementCallback;
            if (b0 != null) {
                exitSharedElementCallback = new g(b0);
            }
            else {
                exitSharedElementCallback = null;
            }
            activity.setExitSharedElementCallback((SharedElementCallback)exitSharedElementCallback);
        }
    }
    
    public static void H(@j0 final Activity activity, @k0 final androidx.core.content.g g, @k0 final Bundle bundle) {
        if (Build$VERSION.SDK_INT >= 30) {
            c.a(activity, g, bundle);
        }
    }
    
    public static void I(@k0 final e e) {
        a.e = e;
    }
    
    public static boolean J(@j0 final Activity activity, @j0 final String s) {
        return Build$VERSION.SDK_INT >= 23 && activity.shouldShowRequestPermissionRationale(s);
    }
    
    public static void K(@j0 final Activity activity, @j0 final Intent intent, final int n, @k0 final Bundle bundle) {
        if (Build$VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, n, bundle);
        }
        else {
            activity.startActivityForResult(intent, n);
        }
    }
    
    public static void L(@j0 final Activity activity, @j0 final IntentSender intentSender, final int n, @k0 final Intent intent, final int n2, final int n3, final int n4, @k0 final Bundle bundle) throws IntentSender$SendIntentException {
        if (Build$VERSION.SDK_INT >= 16) {
            activity.startIntentSenderForResult(intentSender, n, intent, n2, n3, n4, bundle);
        }
        else {
            activity.startIntentSenderForResult(intentSender, n, intent, n2, n3, n4);
        }
    }
    
    public static void M(@j0 final Activity activity) {
        if (Build$VERSION.SDK_INT >= 21) {
            activity.startPostponedEnterTransition();
        }
    }
    
    public static void v(@j0 final Activity activity) {
        if (Build$VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        }
        else {
            activity.finish();
        }
    }
    
    public static void w(@j0 final Activity activity) {
        if (Build$VERSION.SDK_INT >= 21) {
            activity.finishAfterTransition();
        }
        else {
            activity.finish();
        }
    }
    
    @t0({ t0.a.I })
    public static e x() {
        return a.e;
    }
    
    @k0
    public static Uri y(@j0 final Activity activity) {
        if (Build$VERSION.SDK_INT >= 22) {
            return activity.getReferrer();
        }
        final Intent intent = activity.getIntent();
        final Uri uri = (Uri)intent.getParcelableExtra("android.intent.extra.REFERRER");
        if (uri != null) {
            return uri;
        }
        final String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if (stringExtra != null) {
            return Uri.parse(stringExtra);
        }
        return null;
    }
    
    @Deprecated
    public static boolean z(final Activity activity) {
        activity.invalidateOptionsMenu();
        return true;
    }
    
    @p0(30)
    static class c
    {
        private c() {
        }
        
        static void a(@j0 final Activity activity, @k0 final androidx.core.content.g g, @k0 final Bundle bundle) {
            LocusId c;
            if (g == null) {
                c = null;
            }
            else {
                c = g.c();
            }
            activity.setLocusContext(c, bundle);
        }
    }
    
    public interface d
    {
        void onRequestPermissionsResult(final int p0, @j0 final String[] p1, @j0 final int[] p2);
    }
    
    public interface e
    {
        boolean a(@j0 final Activity p0, @b0(from = 0L) final int p1, final int p2, @k0 final Intent p3);
        
        boolean b(@j0 final Activity p0, @j0 final String[] p1, @b0(from = 0L) final int p2);
    }
    
    @t0({ t0.a.I })
    public interface f
    {
        void validateRequestPermissionsRequestCode(final int p0);
    }
    
    @p0(21)
    private static class g extends SharedElementCallback
    {
        private final androidx.core.app.b0 a;
        
        g(final androidx.core.app.b0 a) {
            this.a = a;
        }
        
        public Parcelable onCaptureSharedElementSnapshot(final View view, final Matrix matrix, final RectF rectF) {
            return this.a.b(view, matrix, rectF);
        }
        
        public View onCreateSnapshotView(final Context context, final Parcelable parcelable) {
            return this.a.c(context, parcelable);
        }
        
        public void onMapSharedElements(final List<String> list, final Map<String, View> map) {
            this.a.d(list, map);
        }
        
        public void onRejectSharedElements(final List<View> list) {
            this.a.e(list);
        }
        
        public void onSharedElementEnd(final List<String> list, final List<View> list2, final List<View> list3) {
            this.a.f(list, list2, list3);
        }
        
        public void onSharedElementStart(final List<String> list, final List<View> list2, final List<View> list3) {
            this.a.g(list, list2, list3);
        }
        
        @p0(23)
        public void onSharedElementsArrived(final List<String> list, final List<View> list2, final SharedElementCallback$OnSharedElementsReadyListener sharedElementCallback$OnSharedElementsReadyListener) {
            this.a.h(list, list2, (androidx.core.app.b0.a)new androidx.core.app.b0.a() {
                @Override
                public void a() {
                    sharedElementCallback$OnSharedElementsReadyListener.onSharedElementsReady();
                }
            });
        }
    }
}
