// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.installations.remote;

import java.util.concurrent.TimeUnit;
import androidx.annotation.w;
import com.google.firebase.installations.s;

class e
{
    private static final long d;
    private static final long e;
    private final s a;
    @w("this")
    private long b;
    @w("this")
    private int c;
    
    static {
        d = TimeUnit.HOURS.toMillis(24L);
        e = TimeUnit.MINUTES.toMillis(30L);
    }
    
    e() {
        this.a = s.c();
    }
    
    e(final s a) {
        this.a = a;
    }
    
    private long a(final int n) {
        synchronized (this) {
            if (!c(n)) {
                return com.google.firebase.installations.remote.e.d;
            }
            return (long)Math.min(Math.pow(2.0, this.c) + this.a.e(), (double)com.google.firebase.installations.remote.e.e);
        }
    }
    
    private static boolean c(final int n) {
        return n == 429 || (n >= 500 && n < 600);
    }
    
    private static boolean d(final int n) {
        return (n >= 200 && n < 300) || n == 401 || n == 404;
    }
    
    private void e() {
        synchronized (this) {
            this.c = 0;
        }
    }
    
    public boolean b() {
        synchronized (this) {
            return this.c == 0 || this.a.a() > this.b;
        }
    }
    
    public void f(final int n) {
        synchronized (this) {
            if (d(n)) {
                this.e();
                return;
            }
            ++this.c;
            this.b = this.a.a() + this.a(n);
        }
    }
}
