// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.snackbar;

import java.lang.ref.WeakReference;
import android.os.Message;
import android.os.Handler$Callback;
import android.os.Looper;
import androidx.annotation.k0;
import android.os.Handler;
import androidx.annotation.j0;

class b
{
    static final int e = 0;
    private static final int f = 1500;
    private static final int g = 2750;
    private static b h;
    @j0
    private final Object a;
    @j0
    private final Handler b;
    @k0
    private c c;
    @k0
    private c d;
    
    private b() {
        this.a = new Object();
        this.b = new Handler(Looper.getMainLooper(), (Handler$Callback)new Handler$Callback() {
            public boolean handleMessage(@j0 final Message message) {
                if (message.what != 0) {
                    return false;
                }
                com.google.android.material.snackbar.b.this.d((c)message.obj);
                return true;
            }
        });
    }
    
    private boolean a(@j0 final c c, final int n) {
        final b b = c.a.get();
        if (b != null) {
            this.b.removeCallbacksAndMessages((Object)c);
            b.b(n);
            return true;
        }
        return false;
    }
    
    static b c() {
        if (b.h == null) {
            b.h = new b();
        }
        return b.h;
    }
    
    private boolean g(final b b) {
        final c c = this.c;
        return c != null && c.a(b);
    }
    
    private boolean h(final b b) {
        final c d = this.d;
        return d != null && d.a(b);
    }
    
    private void m(@j0 final c c) {
        int b = c.b;
        if (b == -2) {
            return;
        }
        if (b <= 0) {
            if (b == -1) {
                b = 1500;
            }
            else {
                b = 2750;
            }
        }
        this.b.removeCallbacksAndMessages((Object)c);
        final Handler b2 = this.b;
        b2.sendMessageDelayed(Message.obtain(b2, 0, (Object)c), (long)b);
    }
    
    private void o() {
        final c d = this.d;
        if (d != null) {
            this.c = d;
            this.d = null;
            final b b = d.a.get();
            if (b != null) {
                b.a();
            }
            else {
                this.c = null;
            }
        }
    }
    
    public void b(final b b, final int n) {
        synchronized (this.a) {
            c c;
            if (this.g(b)) {
                c = this.c;
            }
            else {
                if (!this.h(b)) {
                    return;
                }
                c = this.d;
            }
            this.a(c, n);
        }
    }
    
    void d(@j0 final c c) {
        synchronized (this.a) {
            if (this.c == c || this.d == c) {
                this.a(c, 2);
            }
        }
    }
    
    public boolean e(final b b) {
        synchronized (this.a) {
            return this.g(b);
        }
    }
    
    public boolean f(final b b) {
        synchronized (this.a) {
            return this.g(b) || this.h(b);
        }
    }
    
    public void i(final b b) {
        synchronized (this.a) {
            if (this.g(b)) {
                this.c = null;
                if (this.d != null) {
                    this.o();
                }
            }
        }
    }
    
    public void j(final b b) {
        synchronized (this.a) {
            if (this.g(b)) {
                this.m(this.c);
            }
        }
    }
    
    public void k(final b b) {
        synchronized (this.a) {
            if (this.g(b)) {
                final c c = this.c;
                if (!c.c) {
                    c.c = true;
                    this.b.removeCallbacksAndMessages((Object)c);
                }
            }
        }
    }
    
    public void l(final b b) {
        synchronized (this.a) {
            if (this.g(b)) {
                final c c = this.c;
                if (c.c) {
                    c.c = false;
                    this.m(c);
                }
            }
        }
    }
    
    public void n(final int n, final b b) {
        synchronized (this.a) {
            if (this.g(b)) {
                final c c = this.c;
                c.b = n;
                this.b.removeCallbacksAndMessages((Object)c);
                this.m(this.c);
                return;
            }
            if (this.h(b)) {
                this.d.b = n;
            }
            else {
                this.d = new c(n, b);
            }
            final c c2 = this.c;
            if (c2 != null && this.a(c2, 4)) {
                return;
            }
            this.c = null;
            this.o();
        }
    }
    
    interface b
    {
        void a();
        
        void b(final int p0);
    }
    
    private static class c
    {
        @j0
        final WeakReference<b> a;
        int b;
        boolean c;
        
        c(final int b, final b referent) {
            this.a = new WeakReference<b>(referent);
            this.b = b;
        }
        
        boolean a(@k0 final b b) {
            return b != null && this.a.get() == b;
        }
    }
}
