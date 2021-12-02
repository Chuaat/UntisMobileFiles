// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work;

import androidx.annotation.j0;
import android.app.Notification;

public final class l
{
    private final int a;
    private final int b;
    private final Notification c;
    
    public l(final int n, @j0 final Notification notification) {
        this(n, notification, 0);
    }
    
    public l(final int a, @j0 final Notification c, final int b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public int a() {
        return this.b;
    }
    
    @j0
    public Notification b() {
        return this.c;
    }
    
    public int c() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && l.class == o.getClass()) {
            final l l = (l)o;
            return this.a == l.a && this.b == l.b && this.c.equals(l.c);
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return (this.a * 31 + this.b) * 31 + this.c.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ForegroundInfo{");
        sb.append("mNotificationId=");
        sb.append(this.a);
        sb.append(", mForegroundServiceType=");
        sb.append(this.b);
        sb.append(", mNotification=");
        sb.append(this.c);
        sb.append('}');
        return sb.toString();
    }
}
