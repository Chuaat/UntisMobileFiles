// 
// Decompiled by Procyon v0.5.36
// 

package br.com.goncalves.pugnotification.notification;

import android.util.Log;
import android.os.Build$VERSION;
import android.widget.RemoteViews;
import androidx.core.app.w;
import androidx.core.app.r;
import android.app.Notification;

public abstract class a
{
    private static final String e = "a";
    protected String a;
    protected Notification b;
    protected r.g c;
    protected int d;
    
    public a(final r.g c, final int d, final String a) {
        this.c = c;
        this.d = d;
        this.a = a;
    }
    
    public void b() {
        this.b = this.c.h();
    }
    
    protected Notification c() {
        final String a = this.a;
        if (a != null) {
            return this.e(a, this.d);
        }
        return this.d(this.d);
    }
    
    protected Notification d(final int n) {
        w.p(br.com.goncalves.pugnotification.notification.e.d.a).C(n, this.b);
        return this.b;
    }
    
    protected Notification e(final String s, final int n) {
        w.p(br.com.goncalves.pugnotification.notification.e.d.a).D(s, n, this.b);
        return this.b;
    }
    
    public void f(final RemoteViews bigContentView) {
        if (Build$VERSION.SDK_INT >= 16) {
            this.b.bigContentView = bigContentView;
            return;
        }
        Log.w(br.com.goncalves.pugnotification.notification.a.e, "Version does not support big content view");
    }
}
