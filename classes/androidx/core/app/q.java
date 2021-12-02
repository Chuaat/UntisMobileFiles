// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.app;

import androidx.annotation.k0;
import java.util.Iterator;
import java.util.ArrayList;
import androidx.core.util.n;
import android.os.Build$VERSION;
import android.app.NotificationChannel;
import androidx.annotation.p0;
import java.util.Collections;
import androidx.annotation.j0;
import android.app.NotificationChannelGroup;
import java.util.List;

public class q
{
    final String a;
    CharSequence b;
    String c;
    private boolean d;
    private List<p> e;
    
    @p0(28)
    q(@j0 final NotificationChannelGroup notificationChannelGroup) {
        this(notificationChannelGroup, Collections.emptyList());
    }
    
    @p0(26)
    q(@j0 final NotificationChannelGroup notificationChannelGroup, @j0 final List<NotificationChannel> list) {
        this(notificationChannelGroup.getId());
        this.b = notificationChannelGroup.getName();
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 28) {
            this.c = notificationChannelGroup.getDescription();
        }
        List<p> e;
        if (sdk_INT >= 28) {
            this.d = notificationChannelGroup.isBlocked();
            e = this.b(notificationChannelGroup.getChannels());
        }
        else {
            e = this.b(list);
        }
        this.e = e;
    }
    
    q(@j0 final String s) {
        this.e = Collections.emptyList();
        this.a = n.g(s);
    }
    
    @p0(26)
    private List<p> b(final List<NotificationChannel> list) {
        final ArrayList<p> list2 = new ArrayList<p>();
        for (final NotificationChannel notificationChannel : list) {
            if (this.a.equals(notificationChannel.getGroup())) {
                list2.add(new p(notificationChannel));
            }
        }
        return list2;
    }
    
    @j0
    public List<p> a() {
        return this.e;
    }
    
    @k0
    public String c() {
        return this.c;
    }
    
    @j0
    public String d() {
        return this.a;
    }
    
    @k0
    public CharSequence e() {
        return this.b;
    }
    
    NotificationChannelGroup f() {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT < 26) {
            return null;
        }
        final NotificationChannelGroup notificationChannelGroup = new NotificationChannelGroup(this.a, this.b);
        if (sdk_INT >= 28) {
            notificationChannelGroup.setDescription(this.c);
        }
        return notificationChannelGroup;
    }
    
    public boolean g() {
        return this.d;
    }
    
    @j0
    public a h() {
        return new a(this.a).c(this.b).b(this.c);
    }
    
    public static class a
    {
        final q a;
        
        public a(@j0 final String s) {
            this.a = new q(s);
        }
        
        @j0
        public q a() {
            return this.a;
        }
        
        @j0
        public a b(@k0 final String c) {
            this.a.c = c;
            return this;
        }
        
        @j0
        public a c(@k0 final CharSequence b) {
            this.a.b = b;
            return this;
        }
    }
}
