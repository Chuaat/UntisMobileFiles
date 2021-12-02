// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.cloudmessaging;

import com.google.android.gms.tasks.l;
import com.google.android.gms.tasks.c;
import androidx.annotation.d;
import java.util.concurrent.ScheduledFuture;
import android.os.RemoteException;
import androidx.annotation.k0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import android.os.Message;
import android.os.Parcelable;
import android.content.Intent;
import com.google.android.gms.tasks.p;
import java.io.IOException;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.j0;
import android.os.Messenger;
import java.util.concurrent.ScheduledExecutorService;
import android.content.Context;
import d6.a;
import android.os.Bundle;
import com.google.android.gms.tasks.n;
import androidx.collection.m;
import java.util.concurrent.Executor;
import android.app.PendingIntent;

public class e
{
    private static int h;
    private static PendingIntent i;
    private static final Executor j;
    @a("responseCallbacks")
    private final m<String, n<Bundle>> a;
    private final Context b;
    private final w c;
    private final ScheduledExecutorService d;
    private Messenger e;
    private Messenger f;
    private f g;
    
    static {
        j = e0.G;
    }
    
    public e(@j0 final Context b) {
        this.a = new m<String, n<Bundle>>();
        this.b = b;
        this.c = new w(b);
        this.e = new Messenger((Handler)new d0(this, Looper.getMainLooper()));
        final ScheduledThreadPoolExecutor d = new ScheduledThreadPoolExecutor(1);
        d.setKeepAliveTime(60L, TimeUnit.SECONDS);
        d.allowCoreThreadTimeOut(true);
        this.d = d;
    }
    
    private static String e() {
        synchronized (e.class) {
            final int h = e.h;
            e.h = h + 1;
            return Integer.toString(h);
        }
    }
    
    private static void f(final Context context, final Intent intent) {
        synchronized (e.class) {
            if (e.i == null) {
                final Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                e.i = PendingIntent.getBroadcast(context, 0, intent2, 0);
            }
            intent.putExtra("app", (Parcelable)e.i);
        }
    }
    
    private final void g(Message a) {
        if (a != null) {
            final Object obj = a.obj;
            if (obj instanceof Intent) {
                final Intent intent = (Intent)obj;
                intent.setExtrasClassLoader((ClassLoader)new f.a());
                if (intent.hasExtra("google.messenger")) {
                    final Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof f) {
                        this.g = (f)parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        this.f = (Messenger)parcelableExtra;
                    }
                }
                final Intent intent2 = (Intent)a.obj;
                final String action = intent2.getAction();
                if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    if (Log.isLoggable("Rpc", 3)) {
                        final String value = String.valueOf(action);
                        String concat;
                        if (value.length() != 0) {
                            concat = "Unexpected response action: ".concat(value);
                        }
                        else {
                            concat = new String("Unexpected response action: ");
                        }
                        Log.d("Rpc", concat);
                    }
                    return;
                }
                String s;
                if ((s = intent2.getStringExtra("registration_id")) == null) {
                    s = intent2.getStringExtra("unregistered");
                }
                if (s == null) {
                    final String stringExtra = intent2.getStringExtra("error");
                    if (stringExtra == null) {
                        final String value2 = String.valueOf(intent2.getExtras());
                        final StringBuilder sb = new StringBuilder(value2.length() + 49);
                        sb.append("Unexpected response, no error or registration id ");
                        sb.append(value2);
                        Log.w("Rpc", sb.toString());
                        return;
                    }
                    if (Log.isLoggable("Rpc", 3)) {
                        String concat2;
                        if (stringExtra.length() != 0) {
                            concat2 = "Received InstanceID error ".concat(stringExtra);
                        }
                        else {
                            concat2 = new String("Received InstanceID error ");
                        }
                        Log.d("Rpc", concat2);
                    }
                    if (stringExtra.startsWith("|")) {
                        final String[] split = stringExtra.split("\\|");
                        if (split.length > 2 && "ID".equals(split[1])) {
                            final String s2 = split[2];
                            String substring;
                            final String s3 = substring = split[3];
                            if (s3.startsWith(":")) {
                                substring = s3.substring(1);
                            }
                            this.j(s2, intent2.putExtra("error", substring).getExtras());
                            return;
                        }
                        String concat3;
                        if (stringExtra.length() != 0) {
                            concat3 = "Unexpected structured response ".concat(stringExtra);
                        }
                        else {
                            concat3 = new String("Unexpected structured response ");
                        }
                        Log.w("Rpc", concat3);
                        return;
                    }
                    else {
                        a = (Message)this.a;
                        // monitorenter(a)
                        int i = 0;
                        try {
                            while (i < this.a.size()) {
                                this.j(this.a.i(i), intent2.getExtras());
                                ++i;
                            }
                            return;
                        }
                        finally {
                        }
                        // monitorexit(a)
                    }
                }
                final Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(s);
                if (!matcher.matches()) {
                    if (Log.isLoggable("Rpc", 3)) {
                        String concat4;
                        if (s.length() != 0) {
                            concat4 = "Unexpected response string: ".concat(s);
                        }
                        else {
                            concat4 = new String("Unexpected response string: ");
                        }
                        Log.d("Rpc", concat4);
                    }
                    return;
                }
                final String group = matcher.group(1);
                final String group2 = matcher.group(2);
                if (group != null) {
                    final Bundle extras = intent2.getExtras();
                    extras.putString("registration_id", group2);
                    this.j(group, extras);
                }
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }
    
    private final void j(String s, @k0 final Bundle bundle) {
        synchronized (this.a) {
            final n<Bundle> n = this.a.remove(s);
            if (n == null) {
                s = String.valueOf(s);
                if (s.length() != 0) {
                    s = "Missing callback for ".concat(s);
                }
                else {
                    s = new String("Missing callback for ");
                }
                Log.w("Rpc", s);
                return;
            }
            n.c(bundle);
        }
    }
    
    private static boolean l(final Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }
    
    @d
    private final com.google.android.gms.tasks.m<Bundle> m(final Bundle bundle) {
        final String e = e();
        final n<Bundle> n = new n<Bundle>();
        Object o = this.a;
        synchronized (o) {
            this.a.put(e, n);
            // monitorexit(o)
            final Intent obj = new Intent();
            obj.setPackage("com.google.android.gms");
            if (this.c.a() == 2) {
                o = "com.google.iid.TOKEN_REQUEST";
            }
            else {
                o = "com.google.android.c2dm.intent.REGISTER";
            }
            obj.setAction((String)o);
            obj.putExtras(bundle);
            f(this.b, obj);
            final StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 5);
            sb.append("|ID|");
            sb.append(e);
            sb.append("|");
            obj.putExtra("kid", sb.toString());
            if (Log.isLoggable("Rpc", 3)) {
                o = String.valueOf(obj.getExtras());
                final StringBuilder sb2 = new StringBuilder(((String)o).length() + 8);
                sb2.append("Sending ");
                sb2.append((String)o);
                Log.d("Rpc", sb2.toString());
            }
            obj.putExtra("google.messenger", (Parcelable)this.e);
            Label_0331: {
                if (this.f != null || this.g != null) {
                    final Message obtain = Message.obtain();
                    obtain.obj = obj;
                    try {
                        o = this.f;
                        if (o != null) {
                            ((Messenger)o).send(obtain);
                            break Label_0331;
                        }
                        this.g.b(obtain);
                        break Label_0331;
                    }
                    catch (RemoteException ex) {
                        if (Log.isLoggable("Rpc", 3)) {
                            Log.d("Rpc", "Messenger failed, fallback to startService");
                        }
                    }
                }
                if (this.c.a() == 2) {
                    this.b.sendBroadcast(obj);
                }
                else {
                    this.b.startService(obj);
                }
            }
            n.a().f(com.google.android.gms.cloudmessaging.e.j, new c0(this, e, this.d.schedule(new z(n), 30L, TimeUnit.SECONDS)));
            return n.a();
        }
    }
    
    @j0
    public com.google.android.gms.tasks.m<Bundle> a(@j0 final Bundle bundle) {
        final int c = this.c.c();
        boolean b = true;
        if (c >= 12000000) {
            return com.google.android.gms.cloudmessaging.j.c(this.b).f(1, bundle).n(com.google.android.gms.cloudmessaging.e.j, (c<Bundle, Bundle>)y.a);
        }
        if (this.c.a() == 0) {
            b = false;
        }
        if (!b) {
            return p.f(new IOException("MISSING_INSTANCEID_SERVICE"));
        }
        return this.m(bundle).p(com.google.android.gms.cloudmessaging.e.j, (c<Bundle, com.google.android.gms.tasks.m<Bundle>>)new a0(this, bundle));
    }
}
