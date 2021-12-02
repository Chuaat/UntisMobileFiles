// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.app;

import androidx.annotation.k0;
import android.app.Notification;
import androidx.core.util.n;
import android.provider.Settings$System;
import androidx.annotation.p0;
import android.os.Build$VERSION;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import androidx.annotation.j0;

public class p
{
    public static final String s = "miscellaneous";
    private static final boolean t = true;
    private static final int u = 0;
    @j0
    final String a;
    CharSequence b;
    int c;
    String d;
    String e;
    boolean f;
    Uri g;
    AudioAttributes h;
    boolean i;
    int j;
    boolean k;
    long[] l;
    String m;
    String n;
    private boolean o;
    private int p;
    private boolean q;
    private boolean r;
    
    @p0(26)
    p(@j0 final NotificationChannel notificationChannel) {
        this(notificationChannel.getId(), notificationChannel.getImportance());
        this.b = notificationChannel.getName();
        this.d = notificationChannel.getDescription();
        this.e = notificationChannel.getGroup();
        this.f = notificationChannel.canShowBadge();
        this.g = notificationChannel.getSound();
        this.h = notificationChannel.getAudioAttributes();
        this.i = notificationChannel.shouldShowLights();
        this.j = notificationChannel.getLightColor();
        this.k = notificationChannel.shouldVibrate();
        this.l = notificationChannel.getVibrationPattern();
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 30) {
            this.m = notificationChannel.getParentChannelId();
            this.n = notificationChannel.getConversationId();
        }
        this.o = notificationChannel.canBypassDnd();
        this.p = notificationChannel.getLockscreenVisibility();
        if (sdk_INT >= 29) {
            this.q = notificationChannel.canBubble();
        }
        if (sdk_INT >= 30) {
            this.r = notificationChannel.isImportantConversation();
        }
    }
    
    p(@j0 final String s, final int c) {
        this.f = true;
        this.g = Settings$System.DEFAULT_NOTIFICATION_URI;
        this.j = 0;
        this.a = androidx.core.util.n.g(s);
        this.c = c;
        if (Build$VERSION.SDK_INT >= 21) {
            this.h = Notification.AUDIO_ATTRIBUTES_DEFAULT;
        }
    }
    
    public boolean a() {
        return this.q;
    }
    
    public boolean b() {
        return this.o;
    }
    
    public boolean c() {
        return this.f;
    }
    
    @k0
    public AudioAttributes d() {
        return this.h;
    }
    
    @k0
    public String e() {
        return this.n;
    }
    
    @k0
    public String f() {
        return this.d;
    }
    
    @k0
    public String g() {
        return this.e;
    }
    
    @j0
    public String h() {
        return this.a;
    }
    
    public int i() {
        return this.c;
    }
    
    public int j() {
        return this.j;
    }
    
    public int k() {
        return this.p;
    }
    
    @k0
    public CharSequence l() {
        return this.b;
    }
    
    NotificationChannel m() {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT < 26) {
            return null;
        }
        final NotificationChannel notificationChannel = new NotificationChannel(this.a, this.b, this.c);
        notificationChannel.setDescription(this.d);
        notificationChannel.setGroup(this.e);
        notificationChannel.setShowBadge(this.f);
        notificationChannel.setSound(this.g, this.h);
        notificationChannel.enableLights(this.i);
        notificationChannel.setLightColor(this.j);
        notificationChannel.setVibrationPattern(this.l);
        notificationChannel.enableVibration(this.k);
        if (sdk_INT >= 30) {
            final String m = this.m;
            if (m != null) {
                final String n = this.n;
                if (n != null) {
                    notificationChannel.setConversationId(m, n);
                }
            }
        }
        return notificationChannel;
    }
    
    @k0
    public String n() {
        return this.m;
    }
    
    @k0
    public Uri o() {
        return this.g;
    }
    
    @k0
    public long[] p() {
        return this.l;
    }
    
    public boolean q() {
        return this.r;
    }
    
    public boolean r() {
        return this.i;
    }
    
    public boolean s() {
        return this.k;
    }
    
    @j0
    public a t() {
        return new a(this.a, this.c).h(this.b).c(this.d).d(this.e).i(this.f).j(this.g, this.h).g(this.i).f(this.j).k(this.k).l(this.l).b(this.m, this.n);
    }
    
    public static class a
    {
        private final p a;
        
        public a(@j0 final String s, final int n) {
            this.a = new p(s, n);
        }
        
        @j0
        public p a() {
            return this.a;
        }
        
        @j0
        public a b(@j0 final String m, @j0 final String n) {
            if (Build$VERSION.SDK_INT >= 30) {
                final p a = this.a;
                a.m = m;
                a.n = n;
            }
            return this;
        }
        
        @j0
        public a c(@k0 final String d) {
            this.a.d = d;
            return this;
        }
        
        @j0
        public a d(@k0 final String e) {
            this.a.e = e;
            return this;
        }
        
        @j0
        public a e(final int c) {
            this.a.c = c;
            return this;
        }
        
        @j0
        public a f(final int j) {
            this.a.j = j;
            return this;
        }
        
        @j0
        public a g(final boolean i) {
            this.a.i = i;
            return this;
        }
        
        @j0
        public a h(@k0 final CharSequence b) {
            this.a.b = b;
            return this;
        }
        
        @j0
        public a i(final boolean f) {
            this.a.f = f;
            return this;
        }
        
        @j0
        public a j(@k0 final Uri g, @k0 final AudioAttributes h) {
            final p a = this.a;
            a.g = g;
            a.h = h;
            return this;
        }
        
        @j0
        public a k(final boolean k) {
            this.a.k = k;
            return this;
        }
        
        @j0
        public a l(@k0 final long[] l) {
            final p a = this.a;
            a.k = (l != null && l.length > 0);
            a.l = l;
            return this;
        }
    }
}
