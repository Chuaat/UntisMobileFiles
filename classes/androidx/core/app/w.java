// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.app;

import java.util.ArrayDeque;
import android.os.Message;
import android.content.pm.ServiceInfo;
import android.content.pm.ResolveInfo;
import android.os.DeadObjectException;
import android.util.Log;
import android.content.Intent;
import java.util.HashMap;
import java.util.Map;
import android.os.Handler;
import android.os.HandlerThread;
import android.content.ServiceConnection;
import android.os.Handler$Callback;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.app.a;
import java.util.Collection;
import android.app.NotificationChannelGroup;
import android.content.pm.ApplicationInfo;
import java.lang.reflect.InvocationTargetException;
import android.app.AppOpsManager;
import androidx.annotation.k0;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;
import android.os.Build$VERSION;
import android.app.NotificationChannel;
import java.util.List;
import android.content.ComponentName;
import android.provider.Settings$Secure;
import androidx.annotation.j0;
import android.os.Bundle;
import android.app.Notification;
import java.util.HashSet;
import android.app.NotificationManager;
import android.content.Context;
import java.util.Set;

public final class w
{
    private static final String c = "NotifManCompat";
    private static final String d = "checkOpNoThrow";
    private static final String e = "OP_POST_NOTIFICATION";
    public static final String f = "android.support.useSideChannel";
    public static final String g = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL";
    static final int h = 19;
    private static final int i = 1000;
    private static final int j = 6;
    private static final String k = "enabled_notification_listeners";
    private static final Object l;
    @androidx.annotation.w("sEnabledNotificationListenersLock")
    private static String m;
    @androidx.annotation.w("sEnabledNotificationListenersLock")
    private static Set<String> n;
    private static final Object o;
    @androidx.annotation.w("sLock")
    private static d p;
    public static final int q = -1000;
    public static final int r = 0;
    public static final int s = 1;
    public static final int t = 2;
    public static final int u = 3;
    public static final int v = 4;
    public static final int w = 5;
    private final Context a;
    private final NotificationManager b;
    
    static {
        l = new Object();
        androidx.core.app.w.n = new HashSet<String>();
        o = new Object();
    }
    
    private w(final Context a) {
        this.a = a;
        this.b = (NotificationManager)a.getSystemService("notification");
    }
    
    private void E(final e e) {
        synchronized (androidx.core.app.w.o) {
            if (androidx.core.app.w.p == null) {
                androidx.core.app.w.p = new d(this.a.getApplicationContext());
            }
            androidx.core.app.w.p.h(e);
        }
    }
    
    private static boolean F(final Notification notification) {
        final Bundle n = androidx.core.app.r.n(notification);
        return n != null && n.getBoolean("android.support.useSideChannel");
    }
    
    @j0
    public static w p(@j0 final Context context) {
        return new w(context);
    }
    
    @j0
    public static Set<String> q(@j0 Context l) {
        final String string = Settings$Secure.getString(l.getContentResolver(), "enabled_notification_listeners");
        l = (Context)androidx.core.app.w.l;
        // monitorenter(l)
        Label_0102: {
            if (string == null) {
                break Label_0102;
            }
            try {
                if (!string.equals(androidx.core.app.w.m)) {
                    final String[] split = string.split(":", -1);
                    final HashSet n = new HashSet<String>(split.length);
                    for (int length = split.length, i = 0; i < length; ++i) {
                        final ComponentName unflattenFromString = ComponentName.unflattenFromString(split[i]);
                        if (unflattenFromString != null) {
                            n.add(unflattenFromString.getPackageName());
                        }
                    }
                    androidx.core.app.w.n = (Set<String>)n;
                    androidx.core.app.w.m = string;
                }
                return androidx.core.app.w.n;
            }
            finally {
            }
            // monitorexit(l)
        }
    }
    
    @j0
    public List<NotificationChannel> A() {
        if (Build$VERSION.SDK_INT >= 26) {
            return (List<NotificationChannel>)this.b.getNotificationChannels();
        }
        return Collections.emptyList();
    }
    
    @j0
    public List<p> B() {
        if (Build$VERSION.SDK_INT >= 26) {
            final List<NotificationChannel> a = this.A();
            if (!a.isEmpty()) {
                final ArrayList list = new ArrayList<p>(a.size());
                final Iterator<NotificationChannel> iterator = a.iterator();
                while (iterator.hasNext()) {
                    list.add(new p(iterator.next()));
                }
                return (List<p>)list;
            }
        }
        return Collections.emptyList();
    }
    
    public void C(final int n, @j0 final Notification notification) {
        this.D(null, n, notification);
    }
    
    public void D(@k0 final String s, final int n, @j0 final Notification notification) {
        if (F(notification)) {
            this.E((e)new b(this.a.getPackageName(), n, s, notification));
            this.b.cancel(s, n);
        }
        else {
            this.b.notify(s, n, notification);
        }
    }
    
    public boolean a() {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 24) {
            return this.b.areNotificationsEnabled();
        }
        boolean b2;
        final boolean b = b2 = true;
        if (sdk_INT < 19) {
            return b2;
        }
        final AppOpsManager obj = (AppOpsManager)this.a.getSystemService("appops");
        final ApplicationInfo applicationInfo = this.a.getApplicationInfo();
        final String packageName = this.a.getApplicationContext().getPackageName();
        final int uid = applicationInfo.uid;
        try {
            final Class<?> forName = Class.forName(AppOpsManager.class.getName());
            final Class<Integer> type = Integer.TYPE;
            b2 = ((int)forName.getMethod("checkOpNoThrow", type, type, String.class).invoke(obj, (int)forName.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class), uid, packageName) == 0 && b);
            return b2;
        }
        catch (ClassNotFoundException | NoSuchMethodException | NoSuchFieldException | InvocationTargetException | IllegalAccessException | RuntimeException ex) {
            b2 = b;
            return b2;
        }
    }
    
    public void b(final int n) {
        this.c(null, n);
    }
    
    public void c(@k0 final String s, final int n) {
        this.b.cancel(s, n);
        if (Build$VERSION.SDK_INT <= 19) {
            this.E((e)new a(this.a.getPackageName(), n, s));
        }
    }
    
    public void d() {
        this.b.cancelAll();
        if (Build$VERSION.SDK_INT <= 19) {
            this.E((e)new a(this.a.getPackageName()));
        }
    }
    
    public void e(@j0 final NotificationChannel notificationChannel) {
        if (Build$VERSION.SDK_INT >= 26) {
            this.b.createNotificationChannel(notificationChannel);
        }
    }
    
    public void f(@j0 final p p) {
        this.e(p.m());
    }
    
    public void g(@j0 final NotificationChannelGroup notificationChannelGroup) {
        if (Build$VERSION.SDK_INT >= 26) {
            this.b.createNotificationChannelGroup(notificationChannelGroup);
        }
    }
    
    public void h(@j0 final q q) {
        this.g(q.f());
    }
    
    public void i(@j0 final List<NotificationChannelGroup> list) {
        if (Build$VERSION.SDK_INT >= 26) {
            this.b.createNotificationChannelGroups((List)list);
        }
    }
    
    public void j(@j0 final List<q> list) {
        if (Build$VERSION.SDK_INT >= 26 && !list.isEmpty()) {
            final ArrayList<NotificationChannelGroup> list2 = new ArrayList<NotificationChannelGroup>(list.size());
            final Iterator<q> iterator = list.iterator();
            while (iterator.hasNext()) {
                list2.add(iterator.next().f());
            }
            this.b.createNotificationChannelGroups((List)list2);
        }
    }
    
    public void k(@j0 final List<NotificationChannel> list) {
        if (Build$VERSION.SDK_INT >= 26) {
            this.b.createNotificationChannels((List)list);
        }
    }
    
    public void l(@j0 final List<p> list) {
        if (Build$VERSION.SDK_INT >= 26 && !list.isEmpty()) {
            final ArrayList<NotificationChannel> list2 = new ArrayList<NotificationChannel>(list.size());
            final Iterator<p> iterator = list.iterator();
            while (iterator.hasNext()) {
                list2.add(iterator.next().m());
            }
            this.b.createNotificationChannels((List)list2);
        }
    }
    
    public void m(@j0 final String s) {
        if (Build$VERSION.SDK_INT >= 26) {
            this.b.deleteNotificationChannel(s);
        }
    }
    
    public void n(@j0 final String s) {
        if (Build$VERSION.SDK_INT >= 26) {
            this.b.deleteNotificationChannelGroup(s);
        }
    }
    
    public void o(@j0 final Collection<String> collection) {
        if (Build$VERSION.SDK_INT >= 26) {
            for (final NotificationChannel notificationChannel : this.b.getNotificationChannels()) {
                if (collection.contains(notificationChannel.getId())) {
                    continue;
                }
                if (Build$VERSION.SDK_INT >= 30 && collection.contains(notificationChannel.getParentChannelId())) {
                    continue;
                }
                this.b.deleteNotificationChannel(notificationChannel.getId());
            }
        }
    }
    
    public int r() {
        if (Build$VERSION.SDK_INT >= 24) {
            return this.b.getImportance();
        }
        return -1000;
    }
    
    @k0
    public NotificationChannel s(@j0 final String s) {
        if (Build$VERSION.SDK_INT >= 26) {
            return this.b.getNotificationChannel(s);
        }
        return null;
    }
    
    @k0
    public NotificationChannel t(@j0 final String s, @j0 final String s2) {
        if (Build$VERSION.SDK_INT >= 30) {
            return this.b.getNotificationChannel(s, s2);
        }
        return this.s(s);
    }
    
    @k0
    public p u(@j0 final String s) {
        if (Build$VERSION.SDK_INT >= 26) {
            final NotificationChannel s2 = this.s(s);
            if (s2 != null) {
                return new p(s2);
            }
        }
        return null;
    }
    
    @k0
    public p v(@j0 final String s, @j0 final String s2) {
        if (Build$VERSION.SDK_INT >= 26) {
            final NotificationChannel t = this.t(s, s2);
            if (t != null) {
                return new p(t);
            }
        }
        return null;
    }
    
    @k0
    public NotificationChannelGroup w(@j0 final String anObject) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 28) {
            return this.b.getNotificationChannelGroup(anObject);
        }
        if (sdk_INT >= 26) {
            for (final NotificationChannelGroup notificationChannelGroup : this.y()) {
                if (notificationChannelGroup.getId().equals(anObject)) {
                    return notificationChannelGroup;
                }
            }
        }
        return null;
    }
    
    @k0
    public q x(@j0 final String s) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 28) {
            final NotificationChannelGroup w = this.w(s);
            if (w != null) {
                return new q(w);
            }
        }
        else if (sdk_INT >= 26) {
            final NotificationChannelGroup w2 = this.w(s);
            if (w2 != null) {
                return new q(w2, this.A());
            }
        }
        return null;
    }
    
    @j0
    public List<NotificationChannelGroup> y() {
        if (Build$VERSION.SDK_INT >= 26) {
            return (List<NotificationChannelGroup>)this.b.getNotificationChannelGroups();
        }
        return Collections.emptyList();
    }
    
    @j0
    public List<q> z() {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 26) {
            final List<NotificationChannelGroup> y = this.y();
            if (!y.isEmpty()) {
                List<NotificationChannel> list;
                if (sdk_INT >= 28) {
                    list = Collections.emptyList();
                }
                else {
                    list = this.A();
                }
                final ArrayList list2 = new ArrayList<q>(y.size());
                for (final NotificationChannelGroup notificationChannelGroup : y) {
                    q q;
                    if (Build$VERSION.SDK_INT >= 28) {
                        q = new q(notificationChannelGroup);
                    }
                    else {
                        q = new q(notificationChannelGroup, list);
                    }
                    list2.add(q);
                }
                return (List<q>)list2;
            }
        }
        return Collections.emptyList();
    }
    
    private static class a implements e
    {
        final String a;
        final int b;
        final String c;
        final boolean d;
        
        a(final String a) {
            this.a = a;
            this.b = 0;
            this.c = null;
            this.d = true;
        }
        
        a(final String a, final int b, final String c) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = false;
        }
        
        @Override
        public void a(final android.support.v4.app.a a) throws RemoteException {
            if (this.d) {
                a.F0(this.a);
            }
            else {
                a.y1(this.a, this.b, this.c);
            }
        }
        
        @j0
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("CancelTask[");
            sb.append("packageName:");
            sb.append(this.a);
            sb.append(", id:");
            sb.append(this.b);
            sb.append(", tag:");
            sb.append(this.c);
            sb.append(", all:");
            sb.append(this.d);
            sb.append("]");
            return sb.toString();
        }
    }
    
    private static class b implements e
    {
        final String a;
        final int b;
        final String c;
        final Notification d;
        
        b(final String a, final int b, final String c, final Notification d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        
        @Override
        public void a(final a a) throws RemoteException {
            a.m2(this.a, this.b, this.c, this.d);
        }
        
        @j0
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("NotifyTask[");
            sb.append("packageName:");
            sb.append(this.a);
            sb.append(", id:");
            sb.append(this.b);
            sb.append(", tag:");
            sb.append(this.c);
            sb.append("]");
            return sb.toString();
        }
    }
    
    private static class c
    {
        final ComponentName a;
        final IBinder b;
        
        c(final ComponentName a, final IBinder b) {
            this.a = a;
            this.b = b;
        }
    }
    
    private static class d implements Handler$Callback, ServiceConnection
    {
        private static final int h = 0;
        private static final int i = 1;
        private static final int j = 2;
        private static final int k = 3;
        private final Context c;
        private final HandlerThread d;
        private final Handler e;
        private final Map<ComponentName, a> f;
        private Set<String> g;
        
        d(final Context c) {
            this.f = new HashMap<ComponentName, a>();
            this.g = new HashSet<String>();
            this.c = c;
            final HandlerThread d = new HandlerThread("NotificationManagerCompat");
            (this.d = d).start();
            this.e = new Handler(d.getLooper(), (Handler$Callback)this);
        }
        
        private boolean a(final a a) {
            if (a.b) {
                return true;
            }
            final boolean bindService = this.c.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(a.a), (ServiceConnection)this, 33);
            a.b = bindService;
            if (bindService) {
                a.e = 0;
            }
            else {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unable to bind to listener ");
                sb.append(a.a);
                Log.w("NotifManCompat", sb.toString());
                this.c.unbindService((ServiceConnection)this);
            }
            return a.b;
        }
        
        private void b(final a a) {
            if (a.b) {
                this.c.unbindService((ServiceConnection)this);
                a.b = false;
            }
            a.c = null;
        }
        
        private void c(final e e) {
            this.j();
            for (final a a : this.f.values()) {
                a.d.add(e);
                this.g(a);
            }
        }
        
        private void d(final ComponentName componentName) {
            final a a = this.f.get(componentName);
            if (a != null) {
                this.g(a);
            }
        }
        
        private void e(final ComponentName componentName, final IBinder binder) {
            final a a = this.f.get(componentName);
            if (a != null) {
                a.c = android.support.v4.app.a.b.H(binder);
                a.e = 0;
                this.g(a);
            }
        }
        
        private void f(final ComponentName componentName) {
            final a a = this.f.get(componentName);
            if (a != null) {
                this.b(a);
            }
        }
        
        private void g(final a a) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Processing component ");
                sb.append(a.a);
                sb.append(", ");
                sb.append(a.d.size());
                sb.append(" queued tasks");
                Log.d("NotifManCompat", sb.toString());
            }
            if (a.d.isEmpty()) {
                return;
            }
            if (this.a(a) && a.c != null) {
                while (true) {
                    final e obj = a.d.peek();
                    if (obj == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append("Sending task ");
                            sb2.append(obj);
                            Log.d("NotifManCompat", sb2.toString());
                        }
                        obj.a(a.c);
                        a.d.remove();
                        continue;
                    }
                    catch (RemoteException ex) {
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append("RemoteException communicating with ");
                        sb3.append(a.a);
                        Log.w("NotifManCompat", sb3.toString(), (Throwable)ex);
                    }
                    catch (DeadObjectException ex2) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            final StringBuilder sb4 = new StringBuilder();
                            sb4.append("Remote service has died: ");
                            sb4.append(a.a);
                            Log.d("NotifManCompat", sb4.toString());
                        }
                    }
                    break;
                }
                if (!a.d.isEmpty()) {
                    this.i(a);
                }
                return;
            }
            this.i(a);
        }
        
        private void i(final a a) {
            if (this.e.hasMessages(3, (Object)a.a)) {
                return;
            }
            final int e = a.e + 1;
            if ((a.e = e) > 6) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Giving up on delivering ");
                sb.append(a.d.size());
                sb.append(" tasks to ");
                sb.append(a.a);
                sb.append(" after ");
                sb.append(a.e);
                sb.append(" retries");
                Log.w("NotifManCompat", sb.toString());
                a.d.clear();
                return;
            }
            final int i = (1 << e - 1) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Scheduling retry for ");
                sb2.append(i);
                sb2.append(" ms");
                Log.d("NotifManCompat", sb2.toString());
            }
            this.e.sendMessageDelayed(this.e.obtainMessage(3, (Object)a.a), (long)i);
        }
        
        private void j() {
            final Set<String> q = androidx.core.app.w.q(this.c);
            if (q.equals(this.g)) {
                return;
            }
            this.g = q;
            final List queryIntentServices = this.c.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            final HashSet<ComponentName> set = new HashSet<ComponentName>();
            for (final ResolveInfo resolveInfo : queryIntentServices) {
                if (!q.contains(resolveInfo.serviceInfo.packageName)) {
                    continue;
                }
                final ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                final ComponentName obj = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                if (resolveInfo.serviceInfo.permission != null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Permission present on component ");
                    sb.append(obj);
                    sb.append(", not adding listener record.");
                    Log.w("NotifManCompat", sb.toString());
                }
                else {
                    set.add(obj);
                }
            }
            for (final ComponentName obj2 : set) {
                if (!this.f.containsKey(obj2)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("Adding listener record for ");
                        sb2.append(obj2);
                        Log.d("NotifManCompat", sb2.toString());
                    }
                    this.f.put(obj2, new a(obj2));
                }
            }
            final Iterator<Map.Entry<ComponentName, a>> iterator3 = this.f.entrySet().iterator();
            while (iterator3.hasNext()) {
                final Map.Entry<ComponentName, a> entry = iterator3.next();
                if (!set.contains(entry.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append("Removing listener record for ");
                        sb3.append(entry.getKey());
                        Log.d("NotifManCompat", sb3.toString());
                    }
                    this.b(entry.getValue());
                    iterator3.remove();
                }
            }
        }
        
        public void h(final e e) {
            this.e.obtainMessage(0, (Object)e).sendToTarget();
        }
        
        public boolean handleMessage(final Message message) {
            final int what = message.what;
            if (what == 0) {
                this.c((e)message.obj);
                return true;
            }
            if (what == 1) {
                final c c = (c)message.obj;
                this.e(c.a, c.b);
                return true;
            }
            if (what == 2) {
                this.f((ComponentName)message.obj);
                return true;
            }
            if (what != 3) {
                return false;
            }
            this.d((ComponentName)message.obj);
            return true;
        }
        
        public void onServiceConnected(final ComponentName obj, final IBinder binder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Connected to service ");
                sb.append(obj);
                Log.d("NotifManCompat", sb.toString());
            }
            this.e.obtainMessage(1, (Object)new c(obj, binder)).sendToTarget();
        }
        
        public void onServiceDisconnected(final ComponentName obj) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Disconnected from service ");
                sb.append(obj);
                Log.d("NotifManCompat", sb.toString());
            }
            this.e.obtainMessage(2, (Object)obj).sendToTarget();
        }
        
        private static class a
        {
            final ComponentName a;
            boolean b;
            android.support.v4.app.a c;
            ArrayDeque<e> d;
            int e;
            
            a(final ComponentName a) {
                this.b = false;
                this.d = new ArrayDeque<e>();
                this.e = 0;
                this.a = a;
            }
        }
    }
    
    private interface e
    {
        void a(final a p0) throws RemoteException;
    }
}
