// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.foreground;

import java.util.List;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import android.os.Build$VERSION;
import android.app.Notification;
import androidx.annotation.g0;
import java.util.UUID;
import android.text.TextUtils;
import android.os.Parcelable;
import android.net.Uri;
import android.content.Intent;
import androidx.annotation.b1;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import androidx.annotation.j0;
import androidx.work.q;
import androidx.annotation.k0;
import androidx.work.impl.constraints.d;
import java.util.Set;
import androidx.work.impl.model.r;
import androidx.work.l;
import java.util.Map;
import androidx.work.impl.utils.taskexecutor.a;
import androidx.work.impl.j;
import android.content.Context;
import androidx.annotation.t0;
import androidx.work.impl.constraints.c;

@t0({ t0.a.H })
public class b implements c, b
{
    static final String Q;
    private static final String R = "KEY_NOTIFICATION";
    private static final String S = "KEY_NOTIFICATION_ID";
    private static final String T = "KEY_FOREGROUND_SERVICE_TYPE";
    private static final String U = "KEY_WORKSPEC_ID";
    private static final String V = "ACTION_START_FOREGROUND";
    private static final String W = "ACTION_NOTIFY";
    private static final String X = "ACTION_CANCEL_WORK";
    private static final String Y = "ACTION_STOP_FOREGROUND";
    private Context G;
    private j H;
    private final a I;
    final Object J;
    String K;
    final Map<String, l> L;
    final Map<String, r> M;
    final Set<r> N;
    final d O;
    @k0
    private b P;
    
    static {
        Q = q.f("SystemFgDispatcher");
    }
    
    b(@j0 final Context g) {
        this.G = g;
        this.J = new Object();
        final j h = j.H(g);
        this.H = h;
        final a o = h.O();
        this.I = o;
        this.K = null;
        this.L = new LinkedHashMap<String, l>();
        this.N = new HashSet<r>();
        this.M = new HashMap<String, r>();
        this.O = new d(this.G, o, this);
        this.H.J().c(this);
    }
    
    @b1
    b(@j0 final Context g, @j0 final j h, @j0 final d o) {
        this.G = g;
        this.J = new Object();
        this.H = h;
        this.I = h.O();
        this.K = null;
        this.L = new LinkedHashMap<String, l>();
        this.N = new HashSet<r>();
        this.M = new HashMap<String, r>();
        this.O = o;
        this.H.J().c(this);
    }
    
    @j0
    public static Intent a(@j0 final Context context, @j0 final String s) {
        final Intent intent = new Intent(context, (Class)SystemForegroundService.class);
        intent.setAction("ACTION_CANCEL_WORK");
        intent.setData(Uri.parse(String.format("workspec://%s", s)));
        intent.putExtra("KEY_WORKSPEC_ID", s);
        return intent;
    }
    
    @j0
    public static Intent c(@j0 final Context context, @j0 final String s, @j0 final l l) {
        final Intent intent = new Intent(context, (Class)SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", l.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", l.a());
        intent.putExtra("KEY_NOTIFICATION", (Parcelable)l.b());
        intent.putExtra("KEY_WORKSPEC_ID", s);
        return intent;
    }
    
    @j0
    public static Intent e(@j0 final Context context, @j0 final String s, @j0 final l l) {
        final Intent intent = new Intent(context, (Class)SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", s);
        intent.putExtra("KEY_NOTIFICATION_ID", l.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", l.a());
        intent.putExtra("KEY_NOTIFICATION", (Parcelable)l.b());
        intent.putExtra("KEY_WORKSPEC_ID", s);
        return intent;
    }
    
    @j0
    public static Intent g(@j0 final Context context) {
        final Intent intent = new Intent(context, (Class)SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }
    
    @g0
    private void i(@j0 final Intent intent) {
        q.c().d(b.Q, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
        final String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra != null && !TextUtils.isEmpty((CharSequence)stringExtra)) {
            this.H.h(UUID.fromString(stringExtra));
        }
    }
    
    @g0
    private void j(@j0 final Intent intent) {
        int n = 0;
        final int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        final int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        final String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        final Notification notification = (Notification)intent.getParcelableExtra("KEY_NOTIFICATION");
        q.c().a(b.Q, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", intExtra, stringExtra, intExtra2), new Throwable[0]);
        if (notification != null && this.P != null) {
            this.L.put(stringExtra, new l(intExtra, notification, intExtra2));
            if (TextUtils.isEmpty((CharSequence)this.K)) {
                this.K = stringExtra;
                this.P.b(intExtra, intExtra2, notification);
            }
            else {
                this.P.c(intExtra, notification);
                if (intExtra2 != 0 && Build$VERSION.SDK_INT >= 29) {
                    final Iterator<Map.Entry<String, l>> iterator = this.L.entrySet().iterator();
                    while (iterator.hasNext()) {
                        n |= iterator.next().getValue().a();
                    }
                    final l l = this.L.get(this.K);
                    if (l != null) {
                        this.P.b(l.c(), n, l.b());
                    }
                }
            }
        }
    }
    
    @g0
    private void k(@j0 final Intent intent) {
        q.c().d(b.Q, String.format("Started foreground service %s", intent), new Throwable[0]);
        this.I.c(new Runnable() {
            final /* synthetic */ WorkDatabase G = b.this.H.M();
            final /* synthetic */ String H = intent.getStringExtra("KEY_WORKSPEC_ID");
            
            @Override
            public void run() {
                final r t = this.G.U().t(this.H);
                if (t != null && t.b()) {
                    synchronized (b.this.J) {
                        b.this.M.put(this.H, t);
                        b.this.N.add(t);
                        final b i = b.this;
                        i.O.d(i.N);
                    }
                }
            }
        });
    }
    
    @Override
    public void b(@j0 final List<String> list) {
        if (!list.isEmpty()) {
            for (final String s : list) {
                q.c().a(b.Q, String.format("Constraints unmet for WorkSpec %s", s), new Throwable[0]);
                this.H.W(s);
            }
        }
    }
    
    @g0
    @Override
    public void d(@j0 final String s, final boolean b) {
        Object j = this.J;
        synchronized (j) {
            final r r = this.M.remove(s);
            if (r != null && this.N.remove(r)) {
                this.O.d(this.N);
            }
            // monitorexit(j)
            j = this.L.remove(s);
            if (s.equals(this.K) && this.L.size() > 0) {
                final Iterator<Map.Entry<String, l>> iterator = this.L.entrySet().iterator();
                Map.Entry<String, l> entry;
                do {
                    entry = iterator.next();
                } while (iterator.hasNext());
                this.K = entry.getKey();
                if (this.P != null) {
                    final l l = entry.getValue();
                    this.P.b(l.c(), l.a(), l.b());
                    this.P.d(l.c());
                }
            }
            final b p2 = this.P;
            if (j != null && p2 != null) {
                q.c().a(b.Q, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", ((l)j).c(), s, ((l)j).a()), new Throwable[0]);
                p2.d(((l)j).c());
            }
        }
    }
    
    @Override
    public void f(@j0 final List<String> list) {
    }
    
    j h() {
        return this.H;
    }
    
    @g0
    void l(@j0 final Intent intent) {
        q.c().d(b.Q, "Stopping foreground service", new Throwable[0]);
        final b p = this.P;
        if (p != null) {
            p.stop();
        }
    }
    
    @g0
    void m() {
        this.P = null;
        synchronized (this.J) {
            this.O.e();
            // monitorexit(this.J)
            this.H.J().j(this);
        }
    }
    
    void n(@j0 final Intent intent) {
        final String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            this.k(intent);
        }
        else if (!"ACTION_NOTIFY".equals(action)) {
            if ("ACTION_CANCEL_WORK".equals(action)) {
                this.i(intent);
                return;
            }
            if ("ACTION_STOP_FOREGROUND".equals(action)) {
                this.l(intent);
            }
            return;
        }
        this.j(intent);
    }
    
    @g0
    void o(@j0 final b p) {
        if (this.P != null) {
            q.c().b(b.Q, "A callback already exists.", new Throwable[0]);
            return;
        }
        this.P = p;
    }
    
    interface b
    {
        void b(final int p0, final int p1, @j0 final Notification p2);
        
        void c(final int p0, @j0 final Notification p1);
        
        void d(final int p0);
        
        void stop();
    }
}
