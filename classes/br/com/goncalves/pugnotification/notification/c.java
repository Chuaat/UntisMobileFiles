// 
// Decompiled by Procyon v0.5.36
// 

package br.com.goncalves.pugnotification.notification;

import android.content.Context;
import android.os.Build$VERSION;
import androidx.annotation.n;
import r1.a;
import r1.b;
import android.os.Bundle;
import android.net.Uri;
import androidx.annotation.w0;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.annotation.s;
import androidx.annotation.j0;
import android.app.PendingIntent;
import android.content.Intent;
import android.text.Spanned;
import androidx.core.app.r;

public class c
{
    private static final String h = "Pugnotification.Load";
    private r.g a;
    private String b;
    private String c;
    private Spanned d;
    private String e;
    private int f;
    private int g;
    
    public c() {
        (this.a = new r.g(br.com.goncalves.pugnotification.notification.e.d.a)).M(PendingIntent.getBroadcast(br.com.goncalves.pugnotification.notification.e.d.a, 0, new Intent(), 134217728));
    }
    
    private void H() {
        if (this.g > 0) {
            return;
        }
        throw new IllegalArgumentException("This is required. Notifications with an invalid icon resource will not be shown.");
    }
    
    public c A(@j0 final String[] array, @j0 final String s, final String s2) {
        if (array.length <= 0) {
            throw new IllegalArgumentException("Inbox Lines Must Have At Least One Text!");
        }
        if (s.trim().length() != 0) {
            final r.l l = new r.l();
            for (int length = array.length, i = 0; i < length; ++i) {
                l.A(array[i]);
            }
            l.B(s);
            if (s2 != null) {
                l.C(s2);
            }
            this.a.x0(l);
            return this;
        }
        throw new IllegalArgumentException("Title Must Not Be Empty!");
    }
    
    public c B(@s final int n) {
        if (n > 0) {
            this.a.a0(BitmapFactory.decodeResource(br.com.goncalves.pugnotification.notification.e.d.a.getResources(), n));
            return this;
        }
        throw new IllegalArgumentException("Resource ID Should Not Be Less Than Or Equal To Zero!");
    }
    
    public c C(@j0 final Bitmap bitmap) {
        this.a.a0(bitmap);
        return this;
    }
    
    public c D(final int n, final int n2, final int n3) {
        if (n2 < 0) {
            throw new IllegalStateException("Led On Milliseconds Invalid!");
        }
        if (n3 >= 0) {
            this.a.b0(n, n2, n3);
            return this;
        }
        throw new IllegalStateException("Led Off Milliseconds Invalid!");
    }
    
    public c E(@w0 final int n) {
        if (n > 0) {
            final String string = br.com.goncalves.pugnotification.notification.e.d.a.getResources().getString(n);
            this.c = string;
            this.a.N(string);
            return this;
        }
        throw new IllegalArgumentException("Resource ID Should Not Be Less Than Or Equal To Zero!");
    }
    
    public c F(@j0 final Spanned d) {
        if (d.length() != 0) {
            this.d = d;
            this.a.N((CharSequence)d);
            return this;
        }
        throw new IllegalArgumentException("Message Must Not Be Empty!");
    }
    
    public c G(@j0 final String c) {
        if (c.trim().length() != 0) {
            this.c = c;
            this.a.N(c);
            return this;
        }
        throw new IllegalArgumentException("Message Must Not Be Empty!");
    }
    
    public c I(final int n) {
        this.a.f0(n);
        return this;
    }
    
    public c J(final boolean b) {
        this.a.g0(b);
        return this;
    }
    
    public c K(final boolean b) {
        this.a.h0(b);
        return this;
    }
    
    public c L(final int n) {
        if (n > 0) {
            this.a.i0(n);
            return this;
        }
        throw new IllegalArgumentException("Priority Should Not Be Less Than Or Equal To Zero!");
    }
    
    public d M() {
        this.H();
        return new d(this.a, this.f, this.e);
    }
    
    public f N() {
        this.H();
        return new f(this.a, this.f, this.e);
    }
    
    public c O(@s final int g) {
        this.g = g;
        this.a.r0(g);
        return this;
    }
    
    public c P(@j0 final Uri uri) {
        this.a.v0(uri);
        return this;
    }
    
    public c Q(@j0 final String e) {
        this.e = e;
        return this;
    }
    
    public c R(@w0 final int n) {
        if (n > 0) {
            this.a.z0(br.com.goncalves.pugnotification.notification.e.d.a.getResources().getString(n));
            return this;
        }
        throw new IllegalArgumentException("Resource ID Should Not Be Less Than Or Equal To Zero!");
    }
    
    public c S(final String s) {
        if (s == null) {
            throw new IllegalStateException("Ticker Must Not Be Null!");
        }
        if (s.trim().length() != 0) {
            this.a.z0(s);
            return this;
        }
        throw new IllegalArgumentException("Ticker Must Not Be Empty!");
    }
    
    public c T(@w0 final int n) {
        if (n > 0) {
            final String string = br.com.goncalves.pugnotification.notification.e.d.a.getResources().getString(n);
            this.b = string;
            this.a.O(string);
            return this;
        }
        throw new IllegalArgumentException("Resource ID Should Not Be Less Than Or Equal To Zero!");
    }
    
    public c U(final String b) {
        if (b == null) {
            throw new IllegalStateException("Title Must Not Be Null!");
        }
        if (b.trim().length() != 0) {
            this.b = b;
            this.a.O(b);
            return this;
        }
        throw new IllegalArgumentException("Title Must Not Be Empty!");
    }
    
    public c V(@j0 final long[] array) {
        for (final long lng : array) {
            if (lng <= 0L) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Vibrate Time ");
                sb.append(lng);
                sb.append(" Invalid!");
                throw new IllegalArgumentException(sb.toString());
            }
        }
        this.a.D0(array);
        return this;
    }
    
    public g W() {
        this.H();
        return new g(this.a, this.f, this.e);
    }
    
    public c X(final long n) {
        if (n > 0L) {
            this.a.F0(n);
            return this;
        }
        throw new IllegalArgumentException("Resource ID Should Not Be Less Than Or Equal To Zero!");
    }
    
    public c a(@j0 final String s) {
        if (s.length() != 0) {
            this.a.g(s);
            return this;
        }
        throw new IllegalArgumentException("URI Must Not Be Empty!");
    }
    
    public c b(final boolean b) {
        this.a.C(b);
        return this;
    }
    
    public c c(@w0 final int n) {
        if (n > 0) {
            return this.g(br.com.goncalves.pugnotification.notification.e.d.a.getResources().getString(n), null);
        }
        throw new IllegalArgumentException("Resource ID Should Not Be Less Than Or Equal To Zero!");
    }
    
    public c d(@w0 final int n, @w0 final int n2) {
        if (n > 0) {
            return this.g(br.com.goncalves.pugnotification.notification.e.d.a.getResources().getString(n), br.com.goncalves.pugnotification.notification.e.d.a.getResources().getString(n2));
        }
        throw new IllegalArgumentException("Resource ID Should Not Be Less Than Or Equal To Zero!");
    }
    
    public c e(@j0 final Spanned spanned, final String s) {
        if (spanned.length() != 0) {
            final r.e e = new r.e();
            e.A((CharSequence)spanned);
            if (s != null) {
                e.C(s);
            }
            this.a.x0(e);
            return this;
        }
        throw new IllegalArgumentException("Big Text Style Must Not Be Empty!");
    }
    
    public c f(@j0 final String s) {
        if (s.trim().length() != 0) {
            return this.g(s, null);
        }
        throw new IllegalArgumentException("Big Text Style Must Not Be Empty!");
    }
    
    public c g(@j0 final String s, final String s2) {
        if (s.trim().length() != 0) {
            final r.e e = new r.e();
            e.A(s);
            if (s2 != null) {
                e.C(s2);
            }
            this.a.x0(e);
            return this;
        }
        throw new IllegalArgumentException("Big Text Style Must Not Be Empty!");
    }
    
    public c h(@s final int n, @j0 final String s, @j0 final PendingIntent pendingIntent) {
        this.a.a(n, s, pendingIntent);
        return this;
    }
    
    public c i(@s final int n, @j0 final String s, @j0 final p1.c c) {
        this.a.a(n, s, c.a());
        return this;
    }
    
    public c j(@j0 final r.b b) {
        this.a.b(b);
        return this;
    }
    
    public c k(@j0 final PendingIntent pendingIntent) {
        this.a.M(pendingIntent);
        return this;
    }
    
    public c l(@j0 final Bundle bundle) {
        this.a.M(new b(bundle, this.f).a());
        return this;
    }
    
    public c m(@j0 final Class<?> clazz) {
        this.n(clazz, null);
        return this;
    }
    
    public c n(@j0 final Class<?> clazz, final Bundle bundle) {
        this.a.M(new a(clazz, bundle, this.f).a());
        return this;
    }
    
    public c o(@j0 final p1.c c) {
        this.a.M(c.a());
        return this;
    }
    
    public c p(@n int n) {
        if (n > 0) {
            final Context a = br.com.goncalves.pugnotification.notification.e.d.a;
            r.g g;
            if (Build$VERSION.SDK_INT >= 23) {
                g = this.a;
                n = a.getColor(n);
            }
            else {
                g = this.a;
                n = a.getResources().getColor(n);
            }
            g.I(n);
            return this;
        }
        throw new IllegalArgumentException("Resource ID Should Not Be Less Than Or Equal To Zero!");
    }
    
    public br.com.goncalves.pugnotification.notification.b q() {
        this.H();
        return new br.com.goncalves.pugnotification.notification.b(this.a, this.f, this.b, this.c, this.d, this.g, this.e);
    }
    
    public c r(@j0 final PendingIntent pendingIntent) {
        this.a.T(pendingIntent);
        return this;
    }
    
    public c s(@j0 final Bundle bundle) {
        this.a.T(new r1.d(bundle, this.f).a());
        return this;
    }
    
    public c t(@j0 final Class<?> clazz) {
        this.u(clazz, null);
        return this;
    }
    
    public c u(@j0 final Class<?> clazz, final Bundle bundle) {
        this.a.T(new r1.c(clazz, bundle, this.f).a());
        return this;
    }
    
    public c v(@j0 final p1.c c) {
        this.a.T(c.a());
        return this;
    }
    
    public c w(final int n) {
        this.a.S(n);
        return this;
    }
    
    public c x(@j0 final String s) {
        if (s.trim().length() != 0) {
            this.a.X(s);
            return this;
        }
        throw new IllegalArgumentException("Group Key Must Not Be Empty!");
    }
    
    public c y(final boolean b) {
        this.a.Z(b);
        return this;
    }
    
    public c z(final int f) {
        if (f > 0) {
            this.f = f;
            return this;
        }
        throw new IllegalStateException("Identifier Should Not Be Less Than Or Equal To Zero!");
    }
}
