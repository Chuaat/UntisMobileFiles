// 
// Decompiled by Procyon v0.5.36
// 

package androidx.room;

import android.util.Log;
import androidx.annotation.b1;
import java.io.IOException;
import androidx.room.util.f;
import android.os.SystemClock;
import android.os.Looper;
import java.util.concurrent.TimeUnit;
import androidx.sqlite.db.c;
import androidx.annotation.w;
import java.util.concurrent.Executor;
import androidx.annotation.j0;
import android.os.Handler;
import androidx.annotation.k0;
import androidx.sqlite.db.d;

final class a
{
    @k0
    private d a;
    @j0
    private final Handler b;
    @k0
    Runnable c;
    @j0
    final Object d;
    final long e;
    @j0
    final Executor f;
    @w("mLock")
    int g;
    @w("mLock")
    long h;
    @k0
    @w("mLock")
    c i;
    private boolean j;
    private final Runnable k;
    @j0
    final Runnable l;
    
    a(final long duration, @j0 final TimeUnit timeUnit, @j0 final Executor f) {
        this.a = null;
        this.b = new Handler(Looper.getMainLooper());
        this.c = null;
        this.d = new Object();
        this.g = 0;
        this.h = SystemClock.uptimeMillis();
        this.j = false;
        this.k = new Runnable() {
            @Override
            public void run() {
                final a g = androidx.room.a.this;
                g.f.execute(g.l);
            }
        };
        this.l = new Runnable() {
            @Override
            public void run() {
                synchronized (androidx.room.a.this.d) {
                    final long uptimeMillis = SystemClock.uptimeMillis();
                    final a g = androidx.room.a.this;
                    if (uptimeMillis - g.h < g.e) {
                        return;
                    }
                    if (g.g != 0) {
                        return;
                    }
                    final Runnable c = g.c;
                    if (c != null) {
                        c.run();
                        final c i = androidx.room.a.this.i;
                        if (i != null && i.isOpen()) {
                            try {
                                androidx.room.a.this.i.close();
                            }
                            catch (IOException ex) {
                                androidx.room.util.f.a(ex);
                            }
                            androidx.room.a.this.i = null;
                        }
                        return;
                    }
                    throw new IllegalStateException("mOnAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
                }
            }
        };
        this.e = timeUnit.toMillis(duration);
        this.f = f;
    }
    
    public void a() throws IOException {
        synchronized (this.d) {
            this.j = true;
            final c i = this.i;
            if (i != null) {
                i.close();
            }
            this.i = null;
        }
    }
    
    public void b() {
        synchronized (this.d) {
            int g = this.g;
            if (g > 0) {
                --g;
                if ((this.g = g) == 0) {
                    if (this.i == null) {
                        return;
                    }
                    this.b.postDelayed(this.k, this.e);
                }
                return;
            }
            throw new IllegalStateException("ref count is 0 or lower but we're supposed to decrement");
        }
    }
    
    @k0
    public <V> V c(@j0 final g.a<c, V> a) {
        try {
            return a.apply(this.f());
        }
        finally {
            this.b();
        }
    }
    
    @k0
    public c d() {
        synchronized (this.d) {
            return this.i;
        }
    }
    
    @b1
    public int e() {
        synchronized (this.d) {
            return this.g;
        }
    }
    
    @j0
    public c f() {
        synchronized (this.d) {
            this.b.removeCallbacks(this.k);
            ++this.g;
            if (this.j) {
                throw new IllegalStateException("Attempting to open already closed database.");
            }
            final c i = this.i;
            if (i != null && i.isOpen()) {
                return this.i;
            }
            final d a = this.a;
            if (a != null) {
                return this.i = a.T2();
            }
            throw new IllegalStateException("AutoCloser has not been initialized. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
        }
    }
    
    public void g(@j0 final d a) {
        if (this.a != null) {
            Log.e("ROOM", "AutoCloser initialized multiple times. Please file a bug against room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
            return;
        }
        this.a = a;
    }
    
    public boolean h() {
        return this.j ^ true;
    }
    
    public void i(final Runnable c) {
        this.c = c;
    }
}
