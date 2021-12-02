// 
// Decompiled by Procyon v0.5.36
// 

package androidx.media.session;

import android.support.v4.media.session.MediaControllerCompat;
import android.content.BroadcastReceiver$PendingResult;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import androidx.core.content.d;
import android.content.pm.ServiceInfo;
import android.content.pm.PackageManager;
import androidx.annotation.t0;
import android.content.pm.ActivityInfo;
import java.util.List;
import android.content.pm.ResolveInfo;
import android.annotation.SuppressLint;
import android.support.v4.media.session.MediaSessionCompat;
import android.os.Build$VERSION;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.content.Intent;
import android.support.v4.media.session.PlaybackStateCompat;
import android.content.ComponentName;
import android.util.Log;
import android.app.PendingIntent;
import android.content.Context;
import android.content.BroadcastReceiver;

public class a extends BroadcastReceiver
{
    private static final String a = "MediaButtonReceiver";
    
    public static PendingIntent a(final Context context, final long n) {
        final ComponentName c = c(context);
        if (c == null) {
            Log.w("MediaButtonReceiver", "A unique media button receiver could not be found in the given context, so couldn't build a pending intent.");
            return null;
        }
        return b(context, c, n);
    }
    
    @SuppressLint({ "WrongConstant" })
    public static PendingIntent b(final Context context, final ComponentName component, final long lng) {
        String string;
        if (component == null) {
            string = "The component name of media button receiver should be provided.";
        }
        else {
            final int o = PlaybackStateCompat.o(lng);
            if (o != 0) {
                final Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setComponent(component);
                intent.putExtra("android.intent.extra.KEY_EVENT", (Parcelable)new KeyEvent(0, o));
                if (Build$VERSION.SDK_INT >= 16) {
                    intent.addFlags(268435456);
                }
                return PendingIntent.getBroadcast(context, o, intent, MediaSessionCompat.e);
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot build a media button pending intent with the given action: ");
            sb.append(lng);
            string = sb.toString();
        }
        Log.w("MediaButtonReceiver", string);
        return null;
    }
    
    @t0({ t0.a.G })
    public static ComponentName c(final Context context) {
        final Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        final List queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers.size() == 1) {
            final ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
            return new ComponentName(activityInfo.packageName, activityInfo.name);
        }
        if (queryBroadcastReceivers.size() > 1) {
            Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
        }
        return null;
    }
    
    private static ComponentName d(final Context context, final String str) {
        final PackageManager packageManager = context.getPackageManager();
        final Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        final List queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices.size() == 1) {
            final ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        }
        if (queryIntentServices.isEmpty()) {
            return null;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Expected 1 service that handles ");
        sb.append(str);
        sb.append(", found ");
        sb.append(queryIntentServices.size());
        throw new IllegalStateException(sb.toString());
    }
    
    public static KeyEvent e(final MediaSessionCompat mediaSessionCompat, final Intent intent) {
        if (mediaSessionCompat != null && intent != null && "android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) && intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            final KeyEvent keyEvent = (KeyEvent)intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
            mediaSessionCompat.e().d(keyEvent);
            return keyEvent;
        }
        return null;
    }
    
    public void onReceive(Context applicationContext, final Intent obj) {
        if (obj == null || !"android.intent.action.MEDIA_BUTTON".equals(obj.getAction()) || !obj.hasExtra("android.intent.extra.KEY_EVENT")) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Ignore unsupported intent: ");
            sb.append(obj);
            Log.d("MediaButtonReceiver", sb.toString());
            return;
        }
        final ComponentName d = d(applicationContext, "android.intent.action.MEDIA_BUTTON");
        if (d != null) {
            obj.setComponent(d);
            androidx.core.content.d.u(applicationContext, obj);
            return;
        }
        final ComponentName d2 = d(applicationContext, "android.media.browse.MediaBrowserService");
        if (d2 != null) {
            final BroadcastReceiver$PendingResult goAsync = this.goAsync();
            applicationContext = applicationContext.getApplicationContext();
            final a a = new a(applicationContext, obj, goAsync);
            final MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, d2, (MediaBrowserCompat.c)a, null);
            a.f(mediaBrowserCompat);
            mediaBrowserCompat.a();
            return;
        }
        throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
    }
    
    private static class a extends c
    {
        private final Context c;
        private final Intent d;
        private final BroadcastReceiver$PendingResult e;
        private MediaBrowserCompat f;
        
        a(final Context c, final Intent d, final BroadcastReceiver$PendingResult e) {
            this.c = c;
            this.d = d;
            this.e = e;
        }
        
        private void e() {
            this.f.b();
            this.e.finish();
        }
        
        @Override
        public void a() {
            new MediaControllerCompat(this.c, this.f.h()).d((KeyEvent)this.d.getParcelableExtra("android.intent.extra.KEY_EVENT"));
            this.e();
        }
        
        @Override
        public void b() {
            this.e();
        }
        
        @Override
        public void c() {
            this.e();
        }
        
        void f(final MediaBrowserCompat f) {
            this.f = f;
        }
    }
}
