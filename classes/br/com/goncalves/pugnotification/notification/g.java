// 
// Decompiled by Procyon v0.5.36
// 

package br.com.goncalves.pugnotification.notification;

import n1.b;
import p1.c;
import androidx.annotation.w0;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.annotation.s;
import java.util.List;
import android.app.Notification;
import androidx.core.app.y;
import androidx.core.app.r;

public class g extends a
{
    private r.q f;
    private y g;
    
    public g(final r.g g, final int n, final String s) {
        super(g, n, s);
        this.f = new r.q();
    }
    
    @Override
    public void b() {
        super.c.o(this.f);
        super.b();
        super.c();
    }
    
    public g g(final Notification notification) {
        if (notification != null) {
            this.f.d(notification);
            return this;
        }
        throw new IllegalArgumentException("Notification Must Not Be Null.");
    }
    
    public g h(final List<Notification> list) {
        if (list != null && !list.isEmpty()) {
            this.f.e(list);
            return this;
        }
        throw new IllegalArgumentException("List Notitifcation Must Not Be Null And Empty!");
    }
    
    public g i(@s final int n) {
        if (n > 0) {
            this.f.D(BitmapFactory.decodeResource(br.com.goncalves.pugnotification.notification.e.d.a.getResources(), n));
            return this;
        }
        throw new IllegalArgumentException("Resource ID Background Should Not Be Less Than Or Equal To Zero!");
    }
    
    public g j(final Bitmap bitmap) {
        if (bitmap != null) {
            this.f.D(bitmap);
            return this;
        }
        throw new IllegalArgumentException("Bitmap Must Not Be Null.");
    }
    
    public g k(@s final int n, final String s, final PendingIntent pendingIntent) {
        if (n < 0) {
            throw new IllegalArgumentException("Resource ID Should Not Be Less Than Or Equal To Zero!");
        }
        if (s == null) {
            throw new IllegalStateException("Title Must Not Be Null!");
        }
        if (pendingIntent != null) {
            this.f.b(new r.b(n, s, pendingIntent));
            return this;
        }
        throw new IllegalArgumentException("PendingIntent Must Not Be Null.");
    }
    
    public g l(@s final int n) {
        this.f.G(n);
        return this;
    }
    
    public g m(final boolean b) {
        this.f.S(b);
        return this;
    }
    
    public g n(@s final int n, @w0 final int n2, final PendingIntent pendingIntent, final y y) {
        this.r(n, br.com.goncalves.pugnotification.notification.e.d.a.getString(n2), pendingIntent, y);
        return this;
    }
    
    public g o(@s final int n, @w0 final int n2, final PendingIntent pendingIntent, final String s, final String[] array) {
        return this.s(n, br.com.goncalves.pugnotification.notification.e.d.a.getString(n2), pendingIntent, s, array);
    }
    
    public g p(@s final int n, @w0 final int n2, final c c, final y y) {
        this.r(n, br.com.goncalves.pugnotification.notification.e.d.a.getString(n2), c.a(), y);
        return this;
    }
    
    public g q(@s final int n, final String s, final PendingIntent pendingIntent) {
        if (n <= 0) {
            throw new IllegalArgumentException("Resource ID Icon Should Not Be Less Than Or Equal To Zero!");
        }
        if (s == null) {
            throw new IllegalArgumentException("Title Must Not Be Null!");
        }
        if (pendingIntent != null) {
            this.g = new y.a(br.com.goncalves.pugnotification.notification.e.d.a.getString(n1.b.g.a)).h(br.com.goncalves.pugnotification.notification.e.d.a.getString(n1.b.g.b)).f(br.com.goncalves.pugnotification.notification.e.d.a.getResources().getStringArray(n1.b.a.a)).b();
            this.f.b(new r.b.a(n, s, pendingIntent).b(this.g).c());
            return this;
        }
        throw new IllegalArgumentException("PendingIntent Must Not Be Null!");
    }
    
    public g r(@s final int n, final String s, final PendingIntent pendingIntent, final y g) {
        if (n <= 0) {
            throw new IllegalArgumentException("Resource ID Icon Should Not Be Less Than Or Equal To Zero!");
        }
        if (s == null) {
            throw new IllegalArgumentException("Title Must Not Be Null!");
        }
        if (pendingIntent == null) {
            throw new IllegalArgumentException("PendingIntent Must Not Be Null!");
        }
        if (g != null) {
            this.g = g;
            this.f.b(new r.b.a(n, s, pendingIntent).b(g).c());
            return this;
        }
        throw new IllegalArgumentException("RemoteInput Must Not Be Null!");
    }
    
    public g s(@s final int n, final String s, final PendingIntent pendingIntent, final String s2, final String[] array) {
        if (n <= 0) {
            throw new IllegalArgumentException("Resource ID Icon Should Not Be Less Than Or Equal To Zero!");
        }
        if (s == null) {
            throw new IllegalArgumentException("Title Must Not Be Null!");
        }
        if (array == null) {
            throw new IllegalArgumentException("Reply Choices Must Not Be Null!");
        }
        if (pendingIntent == null) {
            throw new IllegalArgumentException("PendingIntent Must Not Be Null!");
        }
        if (s2 != null) {
            this.g = new y.a(br.com.goncalves.pugnotification.notification.e.d.a.getString(n1.b.g.a)).h(s2).f(array).b();
            this.f.b(new r.b.a(n, s, pendingIntent).b(this.g).c());
            return this;
        }
        throw new IllegalArgumentException("Reply Label Must Not Be Null!");
    }
    
    public g t(@s final int n, final String s, final c c, final y y) {
        this.r(n, s, c.a(), y);
        return this;
    }
    
    public g u(final boolean b) {
        this.f.V(b);
        return this;
    }
}
