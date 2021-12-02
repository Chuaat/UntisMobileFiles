// 
// Decompiled by Procyon v0.5.36
// 

package br.com.goncalves.pugnotification.notification;

import android.app.NotificationManager;
import android.content.Context;

public class e
{
    private static final String c = "e";
    public static e d;
    public final Context a;
    public boolean b;
    
    public e(final Context a) {
        this.a = a;
    }
    
    public static e e(final Context context) {
        if (e.d == null) {
            synchronized (e.class) {
                if (e.d == null) {
                    e.d = new a(context).a();
                }
            }
        }
        return e.d;
    }
    
    public void a(final int n) {
        ((NotificationManager)this.a.getSystemService("notification")).cancel(n);
    }
    
    public void b(final String s, final int n) {
        ((NotificationManager)this.a.getSystemService("notification")).cancel(s, n);
    }
    
    public c c() {
        return new c();
    }
    
    public void d() {
        if (this == e.d) {
            throw new UnsupportedOperationException("Default singleton instance cannot be shutdown.");
        }
        if (this.b) {
            return;
        }
        this.b = true;
    }
    
    private static class a
    {
        private final Context a;
        
        public a(final Context context) {
            if (context != null) {
                this.a = context.getApplicationContext();
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }
        
        public e a() {
            return new e(this.a);
        }
    }
}
