// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.cloudmessaging;

import android.os.Parcelable;
import android.content.BroadcastReceiver$PendingResult;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import com.google.android.gms.tasks.m;
import java.util.concurrent.TimeUnit;
import com.google.android.gms.tasks.p;
import android.text.TextUtils;
import androidx.annotation.c1;
import android.os.Bundle;
import android.app.PendingIntent$CanceledException;
import android.util.Log;
import android.app.PendingIntent;
import android.content.Intent;
import androidx.annotation.j0;
import android.content.Context;
import java.util.concurrent.ThreadFactory;
import com.google.android.gms.internal.cloudmessaging.f;
import com.google.android.gms.internal.cloudmessaging.a;
import java.util.concurrent.ExecutorService;
import android.content.BroadcastReceiver;

public abstract class b extends BroadcastReceiver
{
    private final ExecutorService a;
    
    public b() {
        this.a = com.google.android.gms.internal.cloudmessaging.a.a().b(new b("firebase-iid-executor"), f.a);
    }
    
    @c1
    private final int e(@j0 final Context context, @j0 final Intent intent) {
        final PendingIntent pendingIntent = (PendingIntent)intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            }
            catch (PendingIntent$CanceledException ex) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        }
        else {
            extras = new Bundle();
        }
        if ("com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            this.d(context, extras);
        }
        else {
            if (!"com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(intent.getAction())) {
                Log.e("CloudMessagingReceiver", "Unknown notification action");
                return 500;
            }
            this.c(context, extras);
        }
        return -1;
    }
    
    @c1
    private final int g(@j0 final Context obj, @j0 final Intent intent) {
        if (intent.getExtras() == null) {
            return 500;
        }
        final String stringExtra = intent.getStringExtra("google.message_id");
        Object o;
        if (TextUtils.isEmpty((CharSequence)stringExtra)) {
            o = p.g((TResult)null);
        }
        else {
            final Bundle bundle = new Bundle();
            bundle.putString("google.message_id", stringExtra);
            o = j.c((Context)obj).d(2, bundle);
        }
        final int b = this.b((Context)obj, new com.google.android.gms.cloudmessaging.a(intent));
        try {
            p.b((m<Object>)o, TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS);
            return b;
        }
        catch (TimeoutException obj) {}
        catch (InterruptedException obj) {}
        catch (ExecutionException ex) {}
        final String value = String.valueOf(obj);
        final StringBuilder sb = new StringBuilder(value.length() + 20);
        sb.append("Message ack failed: ");
        sb.append(value);
        Log.w("CloudMessagingReceiver", sb.toString());
        return b;
    }
    
    @j0
    protected Executor a() {
        return this.a;
    }
    
    @c1
    protected abstract int b(@j0 final Context p0, @j0 final com.google.android.gms.cloudmessaging.a p1);
    
    @c1
    protected void c(@j0 final Context context, @j0 final Bundle bundle) {
    }
    
    @c1
    protected void d(@j0 final Context context, @j0 final Bundle bundle) {
    }
    
    public final void onReceive(@j0 final Context context, @j0 final Intent intent) {
        if (intent == null) {
            return;
        }
        this.a().execute(new i(this, intent, context, this.isOrderedBroadcast(), this.goAsync()));
    }
    
    public static final class a
    {
        @j0
        public static final String a = "com.google.firebase.messaging.NOTIFICATION_OPEN";
        @j0
        public static final String b = "com.google.firebase.messaging.NOTIFICATION_DISMISS";
        
        private a() {
        }
    }
    
    public static final class b
    {
        @j0
        public static final String a = "pending_intent";
        @j0
        public static final String b = "wrapped_intent";
        
        private b() {
        }
    }
}
