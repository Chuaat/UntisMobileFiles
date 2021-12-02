// 
// Decompiled by Procyon v0.5.36
// 

package androidx.media.app;

import android.os.IBinder;
import android.os.Parcelable;
import android.os.Bundle;
import android.os.Parcel;
import androidx.core.app.i;
import android.app.Notification;
import android.app.PendingIntent;
import androidx.annotation.t0;
import android.os.Build$VERSION;
import androidx.core.app.o;
import androidx.media.j;
import android.app.Notification$DecoratedMediaCustomViewStyle;
import android.app.Notification$Style;
import android.app.Notification$Builder;
import android.media.session.MediaSession$Token;
import android.support.v4.media.session.MediaSessionCompat;
import android.app.Notification$MediaStyle;
import androidx.annotation.r;
import android.widget.RemoteViews;
import androidx.annotation.p0;

public class a
{
    private a() {
    }
    
    @p0(15)
    private static class a
    {
        @r
        static void a(final RemoteViews remoteViews, final int n, final CharSequence charSequence) {
            remoteViews.setContentDescription(n, charSequence);
        }
    }
    
    @p0(21)
    private static class b
    {
        @r
        static Notification$MediaStyle a() {
            return new Notification$MediaStyle();
        }
        
        @r
        static Notification$MediaStyle b(final Notification$MediaStyle notification$MediaStyle, final int[] array, final MediaSessionCompat.Token token) {
            if (array != null) {
                e(notification$MediaStyle, array);
            }
            if (token != null) {
                c(notification$MediaStyle, (MediaSession$Token)token.f());
            }
            return notification$MediaStyle;
        }
        
        @r
        static void c(final Notification$MediaStyle notification$MediaStyle, final MediaSession$Token mediaSession) {
            notification$MediaStyle.setMediaSession(mediaSession);
        }
        
        @r
        static void d(final Notification$Builder notification$Builder, final Notification$MediaStyle style) {
            notification$Builder.setStyle((Notification$Style)style);
        }
        
        @r
        static void e(final Notification$MediaStyle notification$MediaStyle, final int... showActionsInCompactView) {
            notification$MediaStyle.setShowActionsInCompactView(showActionsInCompactView);
        }
    }
    
    @p0(24)
    private static class c
    {
        @r
        static Notification$DecoratedMediaCustomViewStyle a() {
            return new Notification$DecoratedMediaCustomViewStyle();
        }
    }
    
    public static class d extends e
    {
        private void K(final RemoteViews remoteViews) {
            int n;
            if (super.a.r() != 0) {
                n = super.a.r();
            }
            else {
                n = super.a.a.getResources().getColor(androidx.media.j.a.a);
            }
            remoteViews.setInt(androidx.media.j.b.o, "setBackgroundColor", n);
        }
        
        @Override
        int D(int n) {
            if (n <= 3) {
                n = androidx.media.j.d.f;
            }
            else {
                n = androidx.media.j.d.d;
            }
            return n;
        }
        
        @Override
        int E() {
            int n;
            if (super.a.s() != null) {
                n = androidx.media.j.d.i;
            }
            else {
                n = super.E();
            }
            return n;
        }
        
        @t0({ androidx.annotation.t0.a.G })
        @Override
        public void b(final androidx.core.app.o o) {
            if (Build$VERSION.SDK_INT >= 24) {
                b.d(o.a(), b.b((Notification$MediaStyle)c.a(), super.e, super.f));
            }
            else {
                super.b(o);
            }
        }
        
        @t0({ androidx.annotation.t0.a.G })
        @Override
        public RemoteViews v(final androidx.core.app.o o) {
            final int sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT >= 24) {
                return null;
            }
            RemoteViews remoteViews;
            if (super.a.p() != null) {
                remoteViews = super.a.p();
            }
            else {
                remoteViews = super.a.s();
            }
            if (remoteViews == null) {
                return null;
            }
            final RemoteViews a = ((e)this).A();
            ((r.p)this).e(a, remoteViews);
            if (sdk_INT >= 21) {
                this.K(a);
            }
            return a;
        }
        
        @t0({ androidx.annotation.t0.a.G })
        @Override
        public RemoteViews w(final androidx.core.app.o o) {
            final int sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT >= 24) {
                return null;
            }
            final RemoteViews s = super.a.s();
            final boolean b = true;
            final boolean b2 = s != null;
            if (sdk_INT >= 21) {
                int n = b ? 1 : 0;
                if (!b2) {
                    if (super.a.p() != null) {
                        n = (b ? 1 : 0);
                    }
                    else {
                        n = 0;
                    }
                }
                if (n != 0) {
                    final RemoteViews b3 = ((e)this).B();
                    if (b2) {
                        ((r.p)this).e(b3, super.a.s());
                    }
                    this.K(b3);
                    return b3;
                }
            }
            else {
                final RemoteViews b4 = ((e)this).B();
                if (b2) {
                    ((r.p)this).e(b4, super.a.s());
                    return b4;
                }
            }
            return null;
        }
        
        @t0({ androidx.annotation.t0.a.G })
        @Override
        public RemoteViews x(final androidx.core.app.o o) {
            final int sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT >= 24) {
                return null;
            }
            RemoteViews remoteViews;
            if (super.a.v() != null) {
                remoteViews = super.a.v();
            }
            else {
                remoteViews = super.a.s();
            }
            if (remoteViews == null) {
                return null;
            }
            final RemoteViews a = ((e)this).A();
            ((r.p)this).e(a, remoteViews);
            if (sdk_INT >= 21) {
                this.K(a);
            }
            return a;
        }
    }
    
    public static class e extends p
    {
        private static final int i = 3;
        private static final int j = 5;
        int[] e;
        MediaSessionCompat.Token f;
        boolean g;
        PendingIntent h;
        
        public e() {
            this.e = null;
        }
        
        public e(final g g) {
            this.e = null;
            ((r.p)this).z(g);
        }
        
        private RemoteViews C(final r.b b) {
            final boolean b2 = b.a() == null;
            final RemoteViews remoteViews = new RemoteViews(super.a.a.getPackageName(), androidx.media.j.d.a);
            final int a = androidx.media.j.b.a;
            remoteViews.setImageViewResource(a, b.e());
            if (!b2) {
                remoteViews.setOnClickPendingIntent(a, b.a());
            }
            if (Build$VERSION.SDK_INT >= 15) {
                androidx.media.app.a.a.a(remoteViews, a, b.j());
            }
            return remoteViews;
        }
        
        public static MediaSessionCompat.Token F(final Notification notification) {
            final Bundle n = androidx.core.app.r.n(notification);
            if (n != null) {
                if (Build$VERSION.SDK_INT >= 21) {
                    final Parcelable parcelable = n.getParcelable("android.mediaSession");
                    if (parcelable != null) {
                        return MediaSessionCompat.Token.b(parcelable);
                    }
                }
                else {
                    final IBinder a = androidx.core.app.i.a(n, "android.mediaSession");
                    if (a != null) {
                        final Parcel obtain = Parcel.obtain();
                        obtain.writeStrongBinder(a);
                        obtain.setDataPosition(0);
                        final MediaSessionCompat.Token token = (MediaSessionCompat.Token)MediaSessionCompat.Token.CREATOR.createFromParcel(obtain);
                        obtain.recycle();
                        return token;
                    }
                }
            }
            return null;
        }
        
        RemoteViews A() {
            final int min = Math.min(super.a.b.size(), 5);
            final RemoteViews c = ((r.p)this).c(false, this.D(min), false);
            c.removeAllViews(androidx.media.j.b.j);
            if (min > 0) {
                for (int i = 0; i < min; ++i) {
                    c.addView(androidx.media.j.b.j, this.C(super.a.b.get(i)));
                }
            }
            if (this.g) {
                final int c2 = androidx.media.j.b.c;
                c.setViewVisibility(c2, 0);
                c.setInt(c2, "setAlpha", super.a.a.getResources().getInteger(androidx.media.j.c.a));
                c.setOnClickPendingIntent(c2, this.h);
            }
            else {
                c.setViewVisibility(androidx.media.j.b.c, 8);
            }
            return c;
        }
        
        RemoteViews B() {
            final RemoteViews c = ((r.p)this).c(false, this.E(), true);
            final int size = super.a.b.size();
            final int[] e = this.e;
            int min;
            if (e == null) {
                min = 0;
            }
            else {
                min = Math.min(e.length, 3);
            }
            c.removeAllViews(androidx.media.j.b.j);
            if (min > 0) {
                for (int i = 0; i < min; ++i) {
                    if (i >= size) {
                        throw new IllegalArgumentException(String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", i, size - 1));
                    }
                    c.addView(androidx.media.j.b.j, this.C(super.a.b.get(this.e[i])));
                }
            }
            if (this.g) {
                c.setViewVisibility(androidx.media.j.b.e, 8);
                final int c2 = androidx.media.j.b.c;
                c.setViewVisibility(c2, 0);
                c.setOnClickPendingIntent(c2, this.h);
                c.setInt(c2, "setAlpha", super.a.a.getResources().getInteger(androidx.media.j.c.a));
            }
            else {
                c.setViewVisibility(androidx.media.j.b.e, 0);
                c.setViewVisibility(androidx.media.j.b.c, 8);
            }
            return c;
        }
        
        int D(int n) {
            if (n <= 3) {
                n = androidx.media.j.d.e;
            }
            else {
                n = androidx.media.j.d.c;
            }
            return n;
        }
        
        int E() {
            return androidx.media.j.d.h;
        }
        
        public e G(final PendingIntent h) {
            this.h = h;
            return this;
        }
        
        public e H(final MediaSessionCompat.Token f) {
            this.f = f;
            return this;
        }
        
        public e I(final int... e) {
            this.e = e;
            return this;
        }
        
        public e J(final boolean g) {
            if (Build$VERSION.SDK_INT < 21) {
                this.g = g;
            }
            return this;
        }
        
        @t0({ androidx.annotation.t0.a.G })
        @Override
        public void b(final androidx.core.app.o o) {
            if (Build$VERSION.SDK_INT >= 21) {
                b.d(o.a(), b.b(b.a(), this.e, this.f));
            }
            else if (this.g) {
                o.a().setOngoing(true);
            }
        }
        
        @t0({ androidx.annotation.t0.a.G })
        @Override
        public RemoteViews v(final androidx.core.app.o o) {
            if (Build$VERSION.SDK_INT >= 21) {
                return null;
            }
            return this.A();
        }
        
        @t0({ androidx.annotation.t0.a.G })
        @Override
        public RemoteViews w(final androidx.core.app.o o) {
            if (Build$VERSION.SDK_INT >= 21) {
                return null;
            }
            return this.B();
        }
    }
}
