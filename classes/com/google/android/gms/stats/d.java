// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.stats;

import java.util.concurrent.TimeUnit;
import com.google.android.gms.common.stats.c;
import java.util.List;
import android.text.TextUtils;
import android.annotation.SuppressLint;
import android.util.Log;
import com.google.android.gms.common.util.e0;
import android.os.PowerManager;
import com.google.android.gms.common.internal.x;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import androidx.annotation.k0;
import androidx.annotation.j0;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.Future;
import java.util.Set;
import java.util.Map;
import android.content.Context;
import android.os.WorkSource;
import android.os.PowerManager$WakeLock;
import java.util.concurrent.ScheduledExecutorService;
import f2.a;
import com.google.android.gms.common.internal.b0;

@b0
@d6.d
@f2.a
public class d
{
    private static ScheduledExecutorService n;
    private static volatile a o;
    private final Object a;
    private final PowerManager$WakeLock b;
    private WorkSource c;
    private final int d;
    private final String e;
    private final String f;
    private final String g;
    private final Context h;
    private boolean i;
    private final Map<String, Integer[]> j;
    private final Set<Future<?>> k;
    private int l;
    private AtomicInteger m;
    
    static {
        d.o = (a)new e();
    }
    
    @f2.a
    public d(@j0 final Context context, final int n, @j0 final String s) {
        String packageName;
        if (context == null) {
            packageName = null;
        }
        else {
            packageName = context.getPackageName();
        }
        this(context, n, s, null, packageName);
    }
    
    private d(@j0 final Context context, final int n, @j0 final String s, @k0 final String s2, @j0 final String s3) {
        this(context, n, s, null, s3, null);
    }
    
    @SuppressLint({ "UnwrappedWakeLock" })
    private d(@j0 Context c, final int d, @j0 String packageName, @k0 String s, @j0 final String s2, @k0 final String s3) {
        this.a = this;
        this.i = true;
        this.j = new HashMap<String, Integer[]>();
        this.k = Collections.synchronizedSet(new HashSet<Future<?>>());
        this.m = new AtomicInteger(0);
        x.l(c, "WakeLock: context must not be null");
        x.h(packageName, "WakeLock: wakeLockName must not be empty");
        this.d = d;
        this.f = null;
        this.g = null;
        final Context applicationContext = ((Context)c).getApplicationContext();
        this.h = applicationContext;
        if (!"com.google.android.gms".equals(((Context)c).getPackageName())) {
            s = String.valueOf(packageName);
            if (s.length() != 0) {
                s = "*gcore*:".concat(s);
            }
            else {
                s = new String("*gcore*:");
            }
            this.e = s;
        }
        else {
            this.e = packageName;
        }
        final PowerManager$WakeLock wakeLock = ((PowerManager)((Context)c).getSystemService("power")).newWakeLock(d, packageName);
        this.b = wakeLock;
        Label_0275: {
            if (e0.d((Context)c)) {
                packageName = s2;
                if (com.google.android.gms.common.util.b0.b(s2)) {
                    packageName = ((Context)c).getPackageName();
                }
                final WorkSource a = e0.a((Context)c, packageName);
                this.c = a;
                if (a != null && e0.d(applicationContext)) {
                    final WorkSource c2 = this.c;
                    if (c2 != null) {
                        c2.add(a);
                    }
                    else {
                        this.c = a;
                    }
                    c = (ArrayIndexOutOfBoundsException)this.c;
                    try {
                        wakeLock.setWorkSource((WorkSource)c);
                        break Label_0275;
                    }
                    catch (ArrayIndexOutOfBoundsException c) {}
                    catch (IllegalArgumentException ex) {}
                    Log.wtf("WakeLock", c.toString());
                }
            }
        }
        if (com.google.android.gms.stats.d.n == null) {
            com.google.android.gms.stats.d.n = com.google.android.gms.common.providers.a.a().a();
        }
    }
    
    private final String e(final String s) {
        if (!this.i) {
            return this.f;
        }
        if (!TextUtils.isEmpty((CharSequence)s)) {
            return s;
        }
        return this.f;
    }
    
    private final List<String> f() {
        return e0.c(this.c);
    }
    
    private final void g(final int n) {
        if (this.b.isHeld()) {
            try {
                this.b.release();
            }
            catch (RuntimeException ex) {
                if (!ex.getClass().equals(RuntimeException.class)) {
                    throw ex;
                }
                Log.e("WakeLock", String.valueOf(this.e).concat(" was already released!"), (Throwable)ex);
            }
            this.b.isHeld();
        }
    }
    
    @f2.a
    public void a(final long n) {
        this.m.incrementAndGet();
        final String e = this.e(null);
        synchronized (this.a) {
            final boolean empty = this.j.isEmpty();
            boolean b = false;
            if ((!empty || this.l > 0) && !this.b.isHeld()) {
                this.j.clear();
                this.l = 0;
            }
            Label_0208: {
                Label_0163: {
                    if (this.i) {
                        final Integer[] array = this.j.get(e);
                        if (array == null) {
                            this.j.put(e, new Integer[] { 1 });
                            b = true;
                        }
                        else {
                            ++array[0];
                        }
                        if (b) {
                            break Label_0163;
                        }
                    }
                    if (this.i || this.l != 0) {
                        break Label_0208;
                    }
                }
                com.google.android.gms.common.stats.d.a().e(this.h, com.google.android.gms.common.stats.c.b(this.b, e), 7, this.e, e, null, this.d, this.f(), n);
                ++this.l;
            }
            // monitorexit(this.a)
            this.b.acquire();
            if (n > 0L) {
                com.google.android.gms.stats.d.n.schedule(new f(this), n, TimeUnit.MILLISECONDS);
            }
        }
    }
    
    @f2.a
    public boolean b() {
        return this.b.isHeld();
    }
    
    @f2.a
    public void c() {
        if (this.m.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.e).concat(" release without a matched acquire!"));
        }
        final String e = this.e(null);
        synchronized (this.a) {
            Label_0181: {
                Label_0137: {
                    if (this.i) {
                        final Integer[] array = this.j.get(e);
                        boolean b = false;
                        Label_0117: {
                            if (array != null) {
                                if (array[0] == 1) {
                                    this.j.remove(e);
                                    b = true;
                                    break Label_0117;
                                }
                                --array[0];
                            }
                            b = false;
                        }
                        if (b) {
                            break Label_0137;
                        }
                    }
                    if (this.i || this.l != 1) {
                        break Label_0181;
                    }
                }
                com.google.android.gms.common.stats.d.a().d(this.h, com.google.android.gms.common.stats.c.b(this.b, e), 8, this.e, e, null, this.d, this.f());
                --this.l;
            }
            // monitorexit(this.a)
            this.g(0);
        }
    }
    
    @f2.a
    public void d(final boolean b) {
        this.b.setReferenceCounted(b);
        this.i = b;
    }
    
    public interface a
    {
    }
}
