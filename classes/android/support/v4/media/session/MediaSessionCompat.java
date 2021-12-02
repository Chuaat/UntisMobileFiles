// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.media.session;

import android.media.MediaMetadataEditor;
import android.graphics.Bitmap;
import android.media.RemoteControlClient;
import android.media.AudioManager;
import android.os.Binder;
import android.os.IInterface;
import android.media.VolumeProvider;
import java.lang.reflect.Field;
import android.media.session.PlaybackState;
import android.media.MediaMetadata;
import android.media.AudioAttributes$Builder;
import android.os.RemoteException;
import android.os.RemoteCallbackList;
import android.media.session.MediaSession;
import android.media.RemoteControlClient$MetadataEditor;
import android.media.RemoteControlClient$OnMetadataUpdateListener;
import android.media.RemoteControlClient$OnPlaybackPositionUpdateListener;
import android.media.Rating;
import android.os.Message;
import android.support.v4.media.RatingCompat;
import android.net.Uri;
import android.view.ViewConfiguration;
import android.view.KeyEvent;
import java.lang.ref.WeakReference;
import android.media.session.MediaSession$Callback;
import android.os.IBinder;
import android.media.session.MediaSession$Token;
import androidx.versionedparcelable.c;
import androidx.core.app.i;
import androidx.annotation.w;
import android.os.ResultReceiver;
import androidx.annotation.r;
import androidx.annotation.p0;
import android.media.MediaDescription;
import android.os.Parcel;
import android.media.session.MediaSession$QueueItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import java.util.HashSet;
import java.util.List;
import androidx.media.k;
import java.util.Iterator;
import androidx.media.f;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.os.BadParcelableException;
import android.annotation.SuppressLint;
import android.util.TypedValue;
import android.os.Handler;
import android.os.Looper;
import android.os.Build$VERSION;
import android.content.Intent;
import android.util.Log;
import android.text.TextUtils;
import androidx.versionedparcelable.h;
import android.os.Bundle;
import androidx.annotation.k0;
import android.app.PendingIntent;
import android.content.ComponentName;
import androidx.annotation.j0;
import android.content.Context;
import androidx.core.os.a;
import java.util.ArrayList;
import androidx.annotation.t0;

public class MediaSessionCompat
{
    @t0({ t0.a.G })
    public static final String A = "android.support.v4.media.session.action.SET_PLAYBACK_SPEED";
    @t0({ t0.a.G })
    public static final String B = "android.support.v4.media.session.action.ARGUMENT_MEDIA_ID";
    @t0({ t0.a.G })
    public static final String C = "android.support.v4.media.session.action.ARGUMENT_QUERY";
    @t0({ t0.a.G })
    public static final String D = "android.support.v4.media.session.action.ARGUMENT_URI";
    @t0({ t0.a.G })
    public static final String E = "android.support.v4.media.session.action.ARGUMENT_RATING";
    @t0({ t0.a.G })
    public static final String F = "android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED";
    @t0({ t0.a.G })
    public static final String G = "android.support.v4.media.session.action.ARGUMENT_EXTRAS";
    @t0({ t0.a.G })
    public static final String H = "android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED";
    @t0({ t0.a.G })
    public static final String I = "android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE";
    @t0({ t0.a.G })
    public static final String J = "android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE";
    @t0({ t0.a.G })
    public static final String K = "android.support.v4.media.session.TOKEN";
    @t0({ t0.a.G })
    public static final String L = "android.support.v4.media.session.EXTRA_BINDER";
    @t0({ t0.a.G })
    public static final String M = "android.support.v4.media.session.SESSION_TOKEN2";
    private static final int N = 320;
    private static final String O = "data_calling_pkg";
    private static final String P = "data_calling_pid";
    private static final String Q = "data_calling_uid";
    private static final String R = "data_extras";
    static int S = 0;
    static final String d = "MediaSessionCompat";
    @t0({ t0.a.G })
    public static final int e;
    @Deprecated
    public static final int f = 1;
    @Deprecated
    public static final int g = 2;
    public static final int h = 4;
    public static final String i = "android.support.v4.media.session.action.FLAG_AS_INAPPROPRIATE";
    public static final String j = "android.support.v4.media.session.action.SKIP_AD";
    public static final String k = "android.support.v4.media.session.action.FOLLOW";
    public static final String l = "android.support.v4.media.session.action.UNFOLLOW";
    public static final String m = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE";
    public static final String n = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE_VALUE";
    public static final int o = 0;
    public static final int p = 1;
    public static final int q = 2;
    @t0({ t0.a.G })
    public static final String r = "android.support.v4.media.session.action.PLAY_FROM_URI";
    @t0({ t0.a.G })
    public static final String s = "android.support.v4.media.session.action.PREPARE";
    @t0({ t0.a.G })
    public static final String t = "android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID";
    @t0({ t0.a.G })
    public static final String u = "android.support.v4.media.session.action.PREPARE_FROM_SEARCH";
    @t0({ t0.a.G })
    public static final String v = "android.support.v4.media.session.action.PREPARE_FROM_URI";
    @t0({ t0.a.G })
    public static final String w = "android.support.v4.media.session.action.SET_CAPTIONING_ENABLED";
    @t0({ t0.a.G })
    public static final String x = "android.support.v4.media.session.action.SET_REPEAT_MODE";
    @t0({ t0.a.G })
    public static final String y = "android.support.v4.media.session.action.SET_SHUFFLE_MODE";
    @t0({ t0.a.G })
    public static final String z = "android.support.v4.media.session.action.SET_RATING";
    private final c a;
    private final MediaControllerCompat b;
    private final ArrayList<k> c;
    
    static {
        int e2;
        if (a.i()) {
            e2 = 33554432;
        }
        else {
            e2 = 0;
        }
        e = e2;
    }
    
    private MediaSessionCompat(final Context context, final c a) {
        this.c = new ArrayList<k>();
        this.a = a;
        this.b = new MediaControllerCompat(context, this);
    }
    
    public MediaSessionCompat(@j0 final Context context, @j0 final String s) {
        this(context, s, null, null);
    }
    
    public MediaSessionCompat(@j0 final Context context, @j0 final String s, @k0 final ComponentName componentName, @k0 final PendingIntent pendingIntent) {
        this(context, s, componentName, pendingIntent, null);
    }
    
    public MediaSessionCompat(@j0 final Context context, @j0 final String s, @k0 final ComponentName componentName, @k0 final PendingIntent pendingIntent, @k0 final Bundle bundle) {
        this(context, s, componentName, pendingIntent, bundle, null);
    }
    
    @SuppressLint({ "WrongConstant" })
    @t0({ t0.a.I })
    public MediaSessionCompat(@j0 final Context context, @j0 final String s, @k0 ComponentName c, @k0 final PendingIntent pendingIntent, @k0 final Bundle bundle, @k0 final androidx.versionedparcelable.h h) {
        this.c = new ArrayList<k>();
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        if (!TextUtils.isEmpty((CharSequence)s)) {
            ComponentName component;
            if ((component = c) == null) {
                c = androidx.media.session.a.c(context);
                if ((component = c) == null) {
                    Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
                    component = c;
                }
            }
            PendingIntent broadcast = pendingIntent;
            if (component != null && (broadcast = pendingIntent) == null) {
                final Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setComponent(component);
                broadcast = PendingIntent.getBroadcast(context, 0, intent, MediaSessionCompat.e);
            }
            final int sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT >= 21) {
                c a;
                if (sdk_INT >= 29) {
                    a = new i(context, s, h, bundle);
                }
                else if (sdk_INT >= 28) {
                    a = new h(context, s, h, bundle);
                }
                else if (sdk_INT >= 22) {
                    a = new g(context, s, h, bundle);
                }
                else {
                    a = new f(context, s, h, bundle);
                }
                this.a = a;
                Looper looper;
                if (Looper.myLooper() != null) {
                    looper = Looper.myLooper();
                }
                else {
                    looper = Looper.getMainLooper();
                }
                this.q((b)new b() {}, new Handler(looper));
                this.a.l(broadcast);
            }
            else {
                c a2;
                if (sdk_INT >= 19) {
                    a2 = new e(context, s, component, broadcast, h, bundle);
                }
                else if (sdk_INT >= 18) {
                    a2 = new d(context, s, component, broadcast, h, bundle);
                }
                else {
                    a2 = new j(context, s, component, broadcast, h, bundle);
                }
                this.a = a2;
            }
            this.b = new MediaControllerCompat(context, this);
            if (MediaSessionCompat.S == 0) {
                MediaSessionCompat.S = (int)(TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
            }
            return;
        }
        throw new IllegalArgumentException("tag must not be null or empty");
    }
    
    @k0
    @t0({ t0.a.G })
    public static Bundle F(@k0 final Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        b(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        }
        catch (BadParcelableException ex) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }
    
    @t0({ t0.a.G })
    public static void b(@k0 final Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }
    
    public static MediaSessionCompat c(final Context context, final Object o) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 21 && context != null && o != null) {
            c c;
            if (sdk_INT >= 29) {
                c = new i(o);
            }
            else if (sdk_INT >= 28) {
                c = new h(o);
            }
            else {
                c = new f(o);
            }
            return new MediaSessionCompat(context, c);
        }
        return null;
    }
    
    static PlaybackStateCompat j(final PlaybackStateCompat playbackStateCompat, final MediaMetadataCompat mediaMetadataCompat) {
        PlaybackStateCompat c = playbackStateCompat;
        if (playbackStateCompat != null) {
            final long m = playbackStateCompat.m();
            final long n = -1L;
            if (m == -1L) {
                c = playbackStateCompat;
            }
            else {
                if (playbackStateCompat.n() != 3 && playbackStateCompat.n() != 4) {
                    c = playbackStateCompat;
                    if (playbackStateCompat.n() != 5) {
                        return c;
                    }
                }
                final long j = playbackStateCompat.j();
                c = playbackStateCompat;
                if (j > 0L) {
                    final long elapsedRealtime = SystemClock.elapsedRealtime();
                    final long n2 = (long)(playbackStateCompat.k() * (elapsedRealtime - j)) + playbackStateCompat.m();
                    long f = n;
                    if (mediaMetadataCompat != null) {
                        f = n;
                        if (mediaMetadataCompat.a("android.media.metadata.DURATION")) {
                            f = mediaMetadataCompat.f("android.media.metadata.DURATION");
                        }
                    }
                    if (f < 0L || n2 <= f) {
                        if (n2 < 0L) {
                            f = 0L;
                        }
                        else {
                            f = n2;
                        }
                    }
                    c = new PlaybackStateCompat.e(playbackStateCompat).k(playbackStateCompat.n(), f, playbackStateCompat.k(), elapsedRealtime).c();
                }
            }
        }
        return c;
    }
    
    public void A(final CharSequence charSequence) {
        this.a.i(charSequence);
    }
    
    public void B(final int n) {
        this.a.m(n);
    }
    
    public void C(final int n) {
        this.a.P(n);
    }
    
    public void D(final PendingIntent pendingIntent) {
        this.a.f(pendingIntent);
    }
    
    public void E(final int n) {
        this.a.R(n);
    }
    
    public void a(final k e) {
        if (e != null) {
            this.c.add(e);
            return;
        }
        throw new IllegalArgumentException("Listener may not be null");
    }
    
    @t0({ t0.a.G })
    public String d() {
        return this.a.e();
    }
    
    public MediaControllerCompat e() {
        return this.b;
    }
    
    @j0
    public final androidx.media.f.b f() {
        return this.a.u();
    }
    
    public Object g() {
        return this.a.s();
    }
    
    public Object h() {
        return this.a.o();
    }
    
    public Token i() {
        return this.a.b();
    }
    
    public boolean k() {
        return this.a.a();
    }
    
    public void l() {
        this.a.release();
    }
    
    public void m(final k o) {
        if (o != null) {
            this.c.remove(o);
            return;
        }
        throw new IllegalArgumentException("Listener may not be null");
    }
    
    public void n(final String s, final Bundle bundle) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            this.a.d(s, bundle);
            return;
        }
        throw new IllegalArgumentException("event cannot be null or empty");
    }
    
    public void o(final boolean b) {
        this.a.p(b);
        final Iterator<k> iterator = this.c.iterator();
        while (iterator.hasNext()) {
            iterator.next().a();
        }
    }
    
    public void p(final b b) {
        this.q(b, null);
    }
    
    public void q(final b b, Handler handler) {
        if (b == null) {
            this.a.g(null, null);
        }
        else {
            final c a = this.a;
            if (handler == null) {
                handler = new Handler();
            }
            a.g(b, handler);
        }
    }
    
    public void r(final boolean b) {
        this.a.K(b);
    }
    
    public void s(final Bundle extras) {
        this.a.setExtras(extras);
    }
    
    public void t(final int n) {
        this.a.c(n);
    }
    
    public void u(final PendingIntent pendingIntent) {
        this.a.l(pendingIntent);
    }
    
    public void v(final MediaMetadataCompat mediaMetadataCompat) {
        this.a.k(mediaMetadataCompat);
    }
    
    public void w(final PlaybackStateCompat playbackStateCompat) {
        this.a.r(playbackStateCompat);
    }
    
    public void x(final int n) {
        this.a.h(n);
    }
    
    public void y(final androidx.media.k k) {
        if (k != null) {
            this.a.t(k);
            return;
        }
        throw new IllegalArgumentException("volumeProvider may not be null!");
    }
    
    public void z(final List<QueueItem> list) {
        if (list != null) {
            final HashSet<Long> set = new HashSet<Long>();
            for (final QueueItem queueItem : list) {
                if (queueItem == null) {
                    throw new IllegalArgumentException("queue shouldn't have null items");
                }
                if (set.contains(queueItem.d())) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Found duplicate queue id: ");
                    sb.append(queueItem.d());
                    Log.e("MediaSessionCompat", sb.toString(), (Throwable)new IllegalArgumentException("id of each queue item should be unique"));
                }
                set.add(queueItem.d());
            }
        }
        this.a.n(list);
    }
    
    @SuppressLint({ "BanParcelableUsage" })
    public static final class QueueItem implements Parcelable
    {
        public static final Parcelable$Creator<QueueItem> CREATOR;
        public static final int J = -1;
        private final MediaDescriptionCompat G;
        private final long H;
        private MediaSession$QueueItem I;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator<QueueItem>() {
                public QueueItem a(final Parcel parcel) {
                    return new QueueItem(parcel);
                }
                
                public QueueItem[] b(final int n) {
                    return new QueueItem[n];
                }
            };
        }
        
        private QueueItem(final MediaSession$QueueItem i, final MediaDescriptionCompat g, final long h) {
            if (g == null) {
                throw new IllegalArgumentException("Description cannot be null");
            }
            if (h != -1L) {
                this.G = g;
                this.H = h;
                this.I = i;
                return;
            }
            throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
        }
        
        QueueItem(final Parcel parcel) {
            this.G = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.H = parcel.readLong();
        }
        
        public QueueItem(final MediaDescriptionCompat mediaDescriptionCompat, final long n) {
            this(null, mediaDescriptionCompat, n);
        }
        
        public static QueueItem a(final Object o) {
            if (o != null && Build$VERSION.SDK_INT >= 21) {
                final MediaSession$QueueItem mediaSession$QueueItem = (MediaSession$QueueItem)o;
                return new QueueItem(mediaSession$QueueItem, MediaDescriptionCompat.a(b.b(mediaSession$QueueItem)), b.c(mediaSession$QueueItem));
            }
            return null;
        }
        
        public static List<QueueItem> b(final List<?> list) {
            if (list != null && Build$VERSION.SDK_INT >= 21) {
                final ArrayList<QueueItem> list2 = new ArrayList<QueueItem>();
                final Iterator<?> iterator = list.iterator();
                while (iterator.hasNext()) {
                    list2.add(a(iterator.next()));
                }
                return list2;
            }
            return null;
        }
        
        public MediaDescriptionCompat c() {
            return this.G;
        }
        
        public long d() {
            return this.H;
        }
        
        public int describeContents() {
            return 0;
        }
        
        public Object e() {
            MediaSession$QueueItem i;
            final MediaSession$QueueItem mediaSession$QueueItem = i = this.I;
            if (mediaSession$QueueItem == null) {
                if (Build$VERSION.SDK_INT < 21) {
                    i = mediaSession$QueueItem;
                }
                else {
                    i = b.a((MediaDescription)this.G.f(), this.H);
                    this.I = i;
                }
            }
            return i;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("MediaSession.QueueItem {Description=");
            sb.append(this.G);
            sb.append(", Id=");
            sb.append(this.H);
            sb.append(" }");
            return sb.toString();
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            this.G.writeToParcel(parcel, n);
            parcel.writeLong(this.H);
        }
        
        @p0(21)
        private static class b
        {
            @r
            static MediaSession$QueueItem a(final MediaDescription mediaDescription, final long n) {
                return new MediaSession$QueueItem(mediaDescription, n);
            }
            
            @r
            static MediaDescription b(final MediaSession$QueueItem mediaSession$QueueItem) {
                return mediaSession$QueueItem.getDescription();
            }
            
            @r
            static long c(final MediaSession$QueueItem mediaSession$QueueItem) {
                return mediaSession$QueueItem.getQueueId();
            }
        }
    }
    
    @SuppressLint({ "BanParcelableUsage" })
    static final class ResultReceiverWrapper implements Parcelable
    {
        public static final Parcelable$Creator<ResultReceiverWrapper> CREATOR;
        ResultReceiver G;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator<ResultReceiverWrapper>() {
                public ResultReceiverWrapper a(final Parcel parcel) {
                    return new ResultReceiverWrapper(parcel);
                }
                
                public ResultReceiverWrapper[] b(final int n) {
                    return new ResultReceiverWrapper[n];
                }
            };
        }
        
        ResultReceiverWrapper(final Parcel parcel) {
            this.G = (ResultReceiver)ResultReceiver.CREATOR.createFromParcel(parcel);
        }
        
        public ResultReceiverWrapper(@j0 final ResultReceiver g) {
            this.G = g;
        }
        
        public int describeContents() {
            return 0;
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            this.G.writeToParcel(parcel, n);
        }
    }
    
    @SuppressLint({ "BanParcelableUsage" })
    public static final class Token implements Parcelable
    {
        public static final Parcelable$Creator<Token> CREATOR;
        private final Object G;
        private final Object H;
        @w("mLock")
        private b I;
        @w("mLock")
        private androidx.versionedparcelable.h J;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator<Token>() {
                public Token a(final Parcel parcel) {
                    Object o;
                    if (Build$VERSION.SDK_INT >= 21) {
                        o = parcel.readParcelable((ClassLoader)null);
                    }
                    else {
                        o = parcel.readStrongBinder();
                    }
                    return new Token(o);
                }
                
                public Token[] b(final int n) {
                    return new Token[n];
                }
            };
        }
        
        Token(final Object o) {
            this(o, null, null);
        }
        
        Token(final Object o, final b b) {
            this(o, b, null);
        }
        
        Token(final Object h, final b i, final androidx.versionedparcelable.h j) {
            this.G = new Object();
            this.H = h;
            this.I = i;
            this.J = j;
        }
        
        @t0({ t0.a.I })
        public static Token a(final Bundle bundle) {
            final Token token = null;
            if (bundle == null) {
                return null;
            }
            bundle.setClassLoader(Token.class.getClassLoader());
            final b h = b.b.H(androidx.core.app.i.a(bundle, "android.support.v4.media.session.EXTRA_BINDER"));
            final androidx.versionedparcelable.h c = androidx.versionedparcelable.c.c(bundle, "android.support.v4.media.session.SESSION_TOKEN2");
            final Token token2 = (Token)bundle.getParcelable("android.support.v4.media.session.TOKEN");
            Token token3;
            if (token2 == null) {
                token3 = token;
            }
            else {
                token3 = new Token(token2.H, h, c);
            }
            return token3;
        }
        
        public static Token b(final Object o) {
            return c(o, null);
        }
        
        @t0({ t0.a.G })
        public static Token c(final Object o, final b b) {
            if (o == null || Build$VERSION.SDK_INT < 21) {
                return null;
            }
            if (o instanceof MediaSession$Token) {
                return new Token(o, b);
            }
            throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
        }
        
        @t0({ t0.a.G })
        public b d() {
            synchronized (this.G) {
                return this.I;
            }
        }
        
        public int describeContents() {
            return 0;
        }
        
        @t0({ t0.a.I })
        public androidx.versionedparcelable.h e() {
            synchronized (this.G) {
                return this.J;
            }
        }
        
        @Override
        public boolean equals(Object h) {
            boolean b = true;
            if (this == h) {
                return true;
            }
            if (!(h instanceof Token)) {
                return false;
            }
            final Token token = (Token)h;
            h = this.H;
            final Object h2 = token.H;
            if (h == null) {
                if (h2 != null) {
                    b = false;
                }
                return b;
            }
            return h2 != null && h.equals(h2);
        }
        
        public Object f() {
            return this.H;
        }
        
        @t0({ t0.a.G })
        public void g(final b i) {
            synchronized (this.G) {
                this.I = i;
            }
        }
        
        @t0({ t0.a.I })
        public void h(final androidx.versionedparcelable.h j) {
            synchronized (this.G) {
                this.J = j;
            }
        }
        
        @Override
        public int hashCode() {
            final Object h = this.H;
            if (h == null) {
                return 0;
            }
            return h.hashCode();
        }
        
        @t0({ t0.a.I })
        public Bundle i() {
            final Bundle bundle = new Bundle();
            bundle.putParcelable("android.support.v4.media.session.TOKEN", (Parcelable)this);
            synchronized (this.G) {
                final b i = this.I;
                if (i != null) {
                    androidx.core.app.i.b(bundle, "android.support.v4.media.session.EXTRA_BINDER", ((IInterface)i).asBinder());
                }
                final androidx.versionedparcelable.h j = this.J;
                if (j != null) {
                    androidx.versionedparcelable.c.e(bundle, "android.support.v4.media.session.SESSION_TOKEN2", j);
                }
                return bundle;
            }
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            if (Build$VERSION.SDK_INT >= 21) {
                parcel.writeParcelable((Parcelable)this.H, n);
            }
            else {
                parcel.writeStrongBinder((IBinder)this.H);
            }
        }
    }
    
    public abstract static class b
    {
        final Object a;
        final MediaSession$Callback b;
        private boolean c;
        @w("mLock")
        WeakReference<MediaSessionCompat.c> d;
        @w("mLock")
        a e;
        
        public b() {
            this.a = new Object();
            if (Build$VERSION.SDK_INT >= 21) {
                this.b = new MediaSessionCompat.b.b();
            }
            else {
                this.b = null;
            }
            this.d = new WeakReference<MediaSessionCompat.c>(null);
        }
        
        public void A() {
        }
        
        public void B() {
        }
        
        public void C(final long n) {
        }
        
        public void D() {
        }
        
        void E(final MediaSessionCompat.c referent, final Handler handler) {
            synchronized (this.a) {
                this.d = new WeakReference<MediaSessionCompat.c>(referent);
                final a e = this.e;
                final a a = null;
                if (e != null) {
                    e.removeCallbacksAndMessages((Object)null);
                }
                a e2 = a;
                if (referent != null) {
                    if (handler == null) {
                        e2 = a;
                    }
                    else {
                        e2 = new a(handler.getLooper());
                    }
                }
                this.e = e2;
            }
        }
        
        void a(final MediaSessionCompat.c c, final Handler handler) {
            if (!this.c) {
                return;
            }
            boolean b = false;
            this.c = false;
            handler.removeMessages(1);
            final PlaybackStateCompat v = c.v();
            long b2;
            if (v == null) {
                b2 = 0L;
            }
            else {
                b2 = v.b();
            }
            final boolean b3 = v != null && v.n() == 3;
            final boolean b4 = (0x204L & b2) != 0x0L;
            if ((b2 & 0x202L) != 0x0L) {
                b = true;
            }
            if (b3 && b) {
                this.h();
            }
            else if (!b3 && b4) {
                this.i();
            }
        }
        
        public void b(final MediaDescriptionCompat mediaDescriptionCompat) {
        }
        
        public void c(final MediaDescriptionCompat mediaDescriptionCompat, final int n) {
        }
        
        public void d(final String s, final Bundle bundle, final ResultReceiver resultReceiver) {
        }
        
        public void e(final String s, final Bundle bundle) {
        }
        
        public void f() {
        }
        
        public boolean g(final Intent intent) {
            if (Build$VERSION.SDK_INT >= 27) {
                return false;
            }
            Object o = this.a;
            synchronized (o) {
                final MediaSessionCompat.c c = this.d.get();
                final a e = this.e;
                // monitorexit(o)
                if (c != null) {
                    if (e != null) {
                        final KeyEvent keyEvent = (KeyEvent)intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
                        if (keyEvent != null) {
                            if (keyEvent.getAction() == 0) {
                                o = c.u();
                                final int keyCode = keyEvent.getKeyCode();
                                if (keyCode != 79 && keyCode != 85) {
                                    this.a(c, e);
                                    return false;
                                }
                                if (keyEvent.getRepeatCount() == 0) {
                                    if (this.c) {
                                        e.removeMessages(1);
                                        this.c = false;
                                        final PlaybackStateCompat v = c.v();
                                        long b;
                                        if (v == null) {
                                            b = 0L;
                                        }
                                        else {
                                            b = v.b();
                                        }
                                        if ((b & 0x20L) != 0x0L) {
                                            this.A();
                                        }
                                    }
                                    else {
                                        this.c = true;
                                        e.sendMessageDelayed(e.obtainMessage(1, o), (long)ViewConfiguration.getDoubleTapTimeout());
                                    }
                                }
                                else {
                                    this.a(c, e);
                                }
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
        }
        
        public void h() {
        }
        
        public void i() {
        }
        
        public void j(final String s, final Bundle bundle) {
        }
        
        public void k(final String s, final Bundle bundle) {
        }
        
        public void l(final Uri uri, final Bundle bundle) {
        }
        
        public void m() {
        }
        
        public void n(final String s, final Bundle bundle) {
        }
        
        public void o(final String s, final Bundle bundle) {
        }
        
        public void p(final Uri uri, final Bundle bundle) {
        }
        
        public void q(final MediaDescriptionCompat mediaDescriptionCompat) {
        }
        
        @Deprecated
        public void r(final int n) {
        }
        
        public void s() {
        }
        
        public void t(final long n) {
        }
        
        public void u(final boolean b) {
        }
        
        public void v(final float n) {
        }
        
        public void w(final RatingCompat ratingCompat) {
        }
        
        public void x(final RatingCompat ratingCompat, final Bundle bundle) {
        }
        
        public void y(final int n) {
        }
        
        public void z(final int n) {
        }
        
        private class a extends Handler
        {
            private static final int b = 1;
            
            a(final Looper looper) {
                super(looper);
            }
            
            public void handleMessage(final Message message) {
                if (message.what == 1) {
                    synchronized (MediaSessionCompat.b.this.a) {
                        final MediaSessionCompat.c c = MediaSessionCompat.b.this.d.get();
                        final MediaSessionCompat.b a = MediaSessionCompat.b.this;
                        final a e = a.e;
                        // monitorexit(this.a.a)
                        if (c == null || a != c.j() || e == null) {
                            return;
                        }
                        c.q((androidx.media.f.b)message.obj);
                        MediaSessionCompat.b.this.a(c, e);
                        c.q(null);
                    }
                }
            }
        }
        
        @p0(21)
        private class b extends MediaSession$Callback
        {
            b() {
            }
            
            private void a(final MediaSessionCompat.c c) {
                c.q(null);
            }
            
            private f b() {
                synchronized (MediaSessionCompat.b.this.a) {
                    MediaSessionCompat.c c = MediaSessionCompat.b.this.d.get();
                    // monitorexit(this.a.a)
                    if (c == null || MediaSessionCompat.b.this != ((f)c).j()) {
                        c = null;
                    }
                    return (f)c;
                }
            }
            
            private void d(final MediaSessionCompat.c c) {
                if (Build$VERSION.SDK_INT >= 28) {
                    return;
                }
                String e;
                if (TextUtils.isEmpty((CharSequence)(e = c.e()))) {
                    e = "android.media.session.MediaController";
                }
                c.q(new androidx.media.f.b(e, -1, -1));
            }
            
            public void c(final Rating rating, final Bundle bundle) {
            }
            
            public void onCommand(final String s, final Bundle bundle, final ResultReceiver resultReceiver) {
                final f b = this.b();
                if (b == null) {
                    return;
                }
                MediaSessionCompat.b(bundle);
                this.d(b);
                Label_0319: {
                    try {
                        final boolean equals = s.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER");
                        final QueueItem queueItem = null;
                        final IBinder binder = null;
                        if (equals) {
                            final Bundle bundle2 = new Bundle();
                            final Token b2 = b.b();
                            final android.support.v4.media.session.b d = b2.d();
                            IBinder binder2;
                            if (d == null) {
                                binder2 = binder;
                            }
                            else {
                                binder2 = ((IInterface)d).asBinder();
                            }
                            androidx.core.app.i.b(bundle2, "android.support.v4.media.session.EXTRA_BINDER", binder2);
                            androidx.versionedparcelable.c.e(bundle2, "android.support.v4.media.session.SESSION_TOKEN2", b2.e());
                            resultReceiver.send(0, bundle2);
                        }
                        else if (s.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                            MediaSessionCompat.b.this.b((MediaDescriptionCompat)bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
                        }
                        else if (s.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                            MediaSessionCompat.b.this.c((MediaDescriptionCompat)bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
                        }
                        else {
                            MediaSessionCompat.b a;
                            MediaDescriptionCompat mediaDescriptionCompat;
                            if (s.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                                a = MediaSessionCompat.b.this;
                                mediaDescriptionCompat = (MediaDescriptionCompat)bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                            }
                            else {
                                if (!s.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                                    MediaSessionCompat.b.this.d(s, bundle, resultReceiver);
                                    break Label_0319;
                                }
                                if (b.h == null) {
                                    break Label_0319;
                                }
                                final int int1 = bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                                Object o = queueItem;
                                if (int1 >= 0) {
                                    o = queueItem;
                                    if (int1 < b.h.size()) {
                                        o = b.h.get(int1);
                                    }
                                }
                                if (o == null) {
                                    break Label_0319;
                                }
                                final MediaSessionCompat.b a2 = MediaSessionCompat.b.this;
                                final MediaDescriptionCompat c = ((QueueItem)o).c();
                                a = a2;
                                mediaDescriptionCompat = c;
                            }
                            a.q(mediaDescriptionCompat);
                        }
                    }
                    catch (BadParcelableException ex) {
                        Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
                    }
                }
                this.a(b);
            }
            
            public void onCustomAction(String s, Bundle bundle) {
                final f b = this.b();
                if (b == null) {
                    return;
                }
                MediaSessionCompat.b(bundle);
                this.d(b);
                try {
                    if (s.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                        final Uri uri = (Uri)bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                        bundle = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.b(bundle);
                        MediaSessionCompat.b.this.l(uri, bundle);
                    }
                    else if (s.equals("android.support.v4.media.session.action.PREPARE")) {
                        MediaSessionCompat.b.this.m();
                    }
                    else if (s.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                        s = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                        bundle = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.b(bundle);
                        MediaSessionCompat.b.this.n(s, bundle);
                    }
                    else if (s.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                        s = bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                        bundle = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.b(bundle);
                        MediaSessionCompat.b.this.o(s, bundle);
                    }
                    else if (s.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                        final Uri uri2 = (Uri)bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                        bundle = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.b(bundle);
                        MediaSessionCompat.b.this.p(uri2, bundle);
                    }
                    else if (s.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                        MediaSessionCompat.b.this.u(bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED"));
                    }
                    else if (s.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                        MediaSessionCompat.b.this.y(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                    }
                    else if (s.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                        MediaSessionCompat.b.this.z(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                    }
                    else if (s.equals("android.support.v4.media.session.action.SET_RATING")) {
                        final RatingCompat ratingCompat = (RatingCompat)bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
                        bundle = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.b(bundle);
                        MediaSessionCompat.b.this.x(ratingCompat, bundle);
                    }
                    else if (s.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                        MediaSessionCompat.b.this.v(bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
                    }
                    else {
                        MediaSessionCompat.b.this.e(s, bundle);
                    }
                }
                catch (BadParcelableException ex) {
                    Log.e("MediaSessionCompat", "Could not unparcel the data.");
                }
                this.a(b);
            }
            
            public void onFastForward() {
                final f b = this.b();
                if (b == null) {
                    return;
                }
                this.d(b);
                MediaSessionCompat.b.this.f();
                this.a(b);
            }
            
            public boolean onMediaButtonEvent(final Intent intent) {
                final f b = this.b();
                boolean b2 = false;
                if (b == null) {
                    return false;
                }
                this.d(b);
                final boolean g = MediaSessionCompat.b.this.g(intent);
                this.a(b);
                if (g || super.onMediaButtonEvent(intent)) {
                    b2 = true;
                }
                return b2;
            }
            
            public void onPause() {
                final f b = this.b();
                if (b == null) {
                    return;
                }
                this.d(b);
                MediaSessionCompat.b.this.h();
                this.a(b);
            }
            
            public void onPlay() {
                final f b = this.b();
                if (b == null) {
                    return;
                }
                this.d(b);
                MediaSessionCompat.b.this.i();
                this.a(b);
            }
            
            public void onPlayFromMediaId(final String s, final Bundle bundle) {
                final f b = this.b();
                if (b == null) {
                    return;
                }
                MediaSessionCompat.b(bundle);
                this.d(b);
                MediaSessionCompat.b.this.j(s, bundle);
                this.a(b);
            }
            
            public void onPlayFromSearch(final String s, final Bundle bundle) {
                final f b = this.b();
                if (b == null) {
                    return;
                }
                MediaSessionCompat.b(bundle);
                this.d(b);
                MediaSessionCompat.b.this.k(s, bundle);
                this.a(b);
            }
            
            @p0(23)
            public void onPlayFromUri(final Uri uri, final Bundle bundle) {
                final f b = this.b();
                if (b == null) {
                    return;
                }
                MediaSessionCompat.b(bundle);
                this.d(b);
                MediaSessionCompat.b.this.l(uri, bundle);
                this.a(b);
            }
            
            @p0(24)
            public void onPrepare() {
                final f b = this.b();
                if (b == null) {
                    return;
                }
                this.d(b);
                MediaSessionCompat.b.this.m();
                this.a(b);
            }
            
            @p0(24)
            public void onPrepareFromMediaId(final String s, final Bundle bundle) {
                final f b = this.b();
                if (b == null) {
                    return;
                }
                MediaSessionCompat.b(bundle);
                this.d(b);
                MediaSessionCompat.b.this.n(s, bundle);
                this.a(b);
            }
            
            @p0(24)
            public void onPrepareFromSearch(final String s, final Bundle bundle) {
                final f b = this.b();
                if (b == null) {
                    return;
                }
                MediaSessionCompat.b(bundle);
                this.d(b);
                MediaSessionCompat.b.this.o(s, bundle);
                this.a(b);
            }
            
            @p0(24)
            public void onPrepareFromUri(final Uri uri, final Bundle bundle) {
                final f b = this.b();
                if (b == null) {
                    return;
                }
                MediaSessionCompat.b(bundle);
                this.d(b);
                MediaSessionCompat.b.this.p(uri, bundle);
                this.a(b);
            }
            
            public void onRewind() {
                final f b = this.b();
                if (b == null) {
                    return;
                }
                this.d(b);
                MediaSessionCompat.b.this.s();
                this.a(b);
            }
            
            public void onSeekTo(final long n) {
                final f b = this.b();
                if (b == null) {
                    return;
                }
                this.d(b);
                MediaSessionCompat.b.this.t(n);
                this.a(b);
            }
            
            @p0(29)
            public void onSetPlaybackSpeed(final float n) {
                final f b = this.b();
                if (b == null) {
                    return;
                }
                this.d(b);
                MediaSessionCompat.b.this.v(n);
                this.a(b);
            }
            
            public void onSetRating(final Rating rating) {
                final f b = this.b();
                if (b == null) {
                    return;
                }
                this.d(b);
                MediaSessionCompat.b.this.w(RatingCompat.a(rating));
                this.a(b);
            }
            
            public void onSkipToNext() {
                final f b = this.b();
                if (b == null) {
                    return;
                }
                this.d(b);
                MediaSessionCompat.b.this.A();
                this.a(b);
            }
            
            public void onSkipToPrevious() {
                final f b = this.b();
                if (b == null) {
                    return;
                }
                this.d(b);
                MediaSessionCompat.b.this.B();
                this.a(b);
            }
            
            public void onSkipToQueueItem(final long n) {
                final f b = this.b();
                if (b == null) {
                    return;
                }
                this.d(b);
                MediaSessionCompat.b.this.C(n);
                this.a(b);
            }
            
            public void onStop() {
                final f b = this.b();
                if (b == null) {
                    return;
                }
                this.d(b);
                MediaSessionCompat.b.this.D();
                this.a(b);
            }
        }
    }
    
    interface c
    {
        void K(final boolean p0);
        
        void P(final int p0);
        
        void R(final int p0);
        
        boolean a();
        
        Token b();
        
        void c(final int p0);
        
        void d(final String p0, final Bundle p1);
        
        String e();
        
        void f(final PendingIntent p0);
        
        void g(final MediaSessionCompat.b p0, final Handler p1);
        
        void h(final int p0);
        
        void i(final CharSequence p0);
        
        MediaSessionCompat.b j();
        
        void k(final MediaMetadataCompat p0);
        
        void l(final PendingIntent p0);
        
        void m(final int p0);
        
        void n(final List<QueueItem> p0);
        
        Object o();
        
        void p(final boolean p0);
        
        void q(final androidx.media.f.b p0);
        
        void r(final PlaybackStateCompat p0);
        
        void release();
        
        Object s();
        
        void setExtras(final Bundle p0);
        
        void t(final androidx.media.k p0);
        
        androidx.media.f.b u();
        
        PlaybackStateCompat v();
    }
    
    @p0(18)
    static class d extends j
    {
        private static boolean H = true;
        
        d(final Context context, final String s, final ComponentName componentName, final PendingIntent pendingIntent, final androidx.versionedparcelable.h h, final Bundle bundle) {
            super(context, s, componentName, pendingIntent, h, bundle);
        }
        
        @Override
        int A(final long n) {
            int a = super.A(n);
            if ((n & 0x100L) != 0x0L) {
                a |= 0x100;
            }
            return a;
        }
        
        @Override
        void C(final PendingIntent pendingIntent, final ComponentName componentName) {
            if (d.H) {
                try {
                    super.i.registerMediaButtonEventReceiver(pendingIntent);
                }
                catch (NullPointerException ex) {
                    Log.w("MediaSessionCompat", "Unable to register media button event receiver with PendingIntent, falling back to ComponentName.");
                    d.H = false;
                }
            }
            if (!d.H) {
                super.C(pendingIntent, componentName);
            }
        }
        
        @Override
        void Q(final PlaybackStateCompat playbackStateCompat) {
            final long m = playbackStateCompat.m();
            final float k = playbackStateCompat.k();
            final long j = playbackStateCompat.j();
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            long n = m;
            if (playbackStateCompat.n() == 3) {
                final long n2 = 0L;
                n = m;
                if (m > 0L) {
                    long n3 = n2;
                    if (j > 0L) {
                        final long n4 = n3 = elapsedRealtime - j;
                        if (k > 0.0f) {
                            n3 = n4;
                            if (k != 1.0f) {
                                n3 = (long)(n4 * k);
                            }
                        }
                    }
                    n = m + n3;
                }
            }
            super.j.setPlaybackState(((j)this).z(playbackStateCompat.n()), n, k);
        }
        
        @Override
        void T(final PendingIntent pendingIntent, final ComponentName componentName) {
            if (d.H) {
                super.i.unregisterMediaButtonEventReceiver(pendingIntent);
            }
            else {
                super.T(pendingIntent, componentName);
            }
        }
        
        @Override
        public void g(final MediaSessionCompat.b b, final Handler handler) {
            super.g(b, handler);
            if (b == null) {
                super.j.setPlaybackPositionUpdateListener((RemoteControlClient$OnPlaybackPositionUpdateListener)null);
            }
            else {
                super.j.setPlaybackPositionUpdateListener((RemoteControlClient$OnPlaybackPositionUpdateListener)new RemoteControlClient$OnPlaybackPositionUpdateListener() {
                    public void onPlaybackPositionUpdate(final long l) {
                        ((j)d.this).B(18, -1, -1, l, null);
                    }
                });
            }
        }
    }
    
    @p0(19)
    static class e extends MediaSessionCompat.d
    {
        e(final Context context, final String s, final ComponentName componentName, final PendingIntent pendingIntent, final androidx.versionedparcelable.h h, final Bundle bundle) {
            super(context, s, componentName, pendingIntent, h, bundle);
        }
        
        @Override
        int A(final long n) {
            int a = super.A(n);
            if ((n & 0x80L) != 0x0L) {
                a |= 0x200;
            }
            return a;
        }
        
        @Override
        public void g(final MediaSessionCompat.b b, final Handler handler) {
            super.g(b, handler);
            if (b == null) {
                super.j.setMetadataUpdateListener((RemoteControlClient$OnMetadataUpdateListener)null);
            }
            else {
                super.j.setMetadataUpdateListener((RemoteControlClient$OnMetadataUpdateListener)new RemoteControlClient$OnMetadataUpdateListener() {
                    public void onMetadataUpdate(final int n, final Object o) {
                        if (n == 268435457 && o instanceof Rating) {
                            ((j)e.this).B(19, -1, -1, RatingCompat.a(o), null);
                        }
                    }
                });
            }
        }
        
        @Override
        RemoteControlClient$MetadataEditor x(final Bundle bundle) {
            final RemoteControlClient$MetadataEditor x = super.x(bundle);
            final PlaybackStateCompat t = super.t;
            long b;
            if (t == null) {
                b = 0L;
            }
            else {
                b = t.b();
            }
            if ((b & 0x80L) != 0x0L) {
                x.addEditableKey(268435457);
            }
            if (bundle == null) {
                return x;
            }
            if (bundle.containsKey("android.media.metadata.YEAR")) {
                x.putLong(8, bundle.getLong("android.media.metadata.YEAR"));
            }
            if (bundle.containsKey("android.media.metadata.RATING")) {
                ((MediaMetadataEditor)x).putObject(101, (Object)bundle.getParcelable("android.media.metadata.RATING"));
            }
            if (bundle.containsKey("android.media.metadata.USER_RATING")) {
                ((MediaMetadataEditor)x).putObject(268435457, (Object)bundle.getParcelable("android.media.metadata.USER_RATING"));
            }
            return x;
        }
    }
    
    @p0(21)
    static class f implements MediaSessionCompat.c
    {
        final MediaSession a;
        final Token b;
        final Object c;
        Bundle d;
        boolean e;
        final RemoteCallbackList<android.support.v4.media.session.a> f;
        PlaybackStateCompat g;
        List<QueueItem> h;
        MediaMetadataCompat i;
        int j;
        boolean k;
        int l;
        int m;
        @w("mLock")
        MediaSessionCompat.b n;
        @w("mLock")
        androidx.media.f.b o;
        
        f(final Context context, final String s, final androidx.versionedparcelable.h h, final Bundle d) {
            this.c = new Object();
            this.e = false;
            this.f = (RemoteCallbackList<android.support.v4.media.session.a>)new RemoteCallbackList();
            final MediaSession w = this.w(context, s, d);
            this.a = w;
            this.b = new Token(w.getSessionToken(), new a(), h);
            this.d = d;
            this.c(3);
        }
        
        f(final Object o) {
            this.c = new Object();
            this.e = false;
            this.f = (RemoteCallbackList<android.support.v4.media.session.a>)new RemoteCallbackList();
            if (o instanceof MediaSession) {
                final MediaSession a = (MediaSession)o;
                this.a = a;
                this.b = new Token(a.getSessionToken(), new a());
                this.d = null;
                this.c(3);
                return;
            }
            throw new IllegalArgumentException("mediaSession is not a valid MediaSession object");
        }
        
        @Override
        public void K(final boolean k) {
            if (this.k == k) {
                return;
            }
            this.k = k;
            int n = this.f.beginBroadcast() - 1;
        Label_0046_Outer:
            while (true) {
                Label_0052: {
                    if (n < 0) {
                        break Label_0052;
                    }
                    final android.support.v4.media.session.a a = (android.support.v4.media.session.a)this.f.getBroadcastItem(n);
                    while (true) {
                        try {
                            a.a1(k);
                            --n;
                            continue Label_0046_Outer;
                            this.f.finishBroadcast();
                        }
                        catch (RemoteException ex) {
                            continue;
                        }
                        break;
                    }
                }
                break;
            }
        }
        
        @Override
        public void P(final int l) {
            if (this.l == l) {
                return;
            }
            this.l = l;
            int n = this.f.beginBroadcast() - 1;
        Label_0046_Outer:
            while (true) {
                Label_0052: {
                    if (n < 0) {
                        break Label_0052;
                    }
                    final android.support.v4.media.session.a a = (android.support.v4.media.session.a)this.f.getBroadcastItem(n);
                    while (true) {
                        try {
                            a.C1(l);
                            --n;
                            continue Label_0046_Outer;
                            this.f.finishBroadcast();
                        }
                        catch (RemoteException ex) {
                            continue;
                        }
                        break;
                    }
                }
                break;
            }
        }
        
        @Override
        public void R(final int m) {
            if (this.m == m) {
                return;
            }
            this.m = m;
            int n = this.f.beginBroadcast() - 1;
        Label_0046_Outer:
            while (true) {
                Label_0052: {
                    if (n < 0) {
                        break Label_0052;
                    }
                    final android.support.v4.media.session.a a = (android.support.v4.media.session.a)this.f.getBroadcastItem(n);
                    while (true) {
                        try {
                            a.O1(m);
                            --n;
                            continue Label_0046_Outer;
                            this.f.finishBroadcast();
                        }
                        catch (RemoteException ex) {
                            continue;
                        }
                        break;
                    }
                }
                break;
            }
        }
        
        @Override
        public boolean a() {
            return this.a.isActive();
        }
        
        @Override
        public Token b() {
            return this.b;
        }
        
        @SuppressLint({ "WrongConstant" })
        @Override
        public void c(final int n) {
            this.a.setFlags(n | 0x1 | 0x2);
        }
        
        @Override
        public void d(final String s, final Bundle bundle) {
        Label_0018_Outer:
            while (true) {
                if (Build$VERSION.SDK_INT >= 23) {
                    break Label_0057;
                }
                int n = this.f.beginBroadcast() - 1;
            Label_0044_Outer:
                while (true) {
                    Label_0050: {
                        if (n < 0) {
                            break Label_0050;
                        }
                        final android.support.v4.media.session.a a = (android.support.v4.media.session.a)this.f.getBroadcastItem(n);
                        while (true) {
                            try {
                                a.S(s, bundle);
                                --n;
                                continue Label_0044_Outer;
                                this.a.sendSessionEvent(s, bundle);
                                return;
                                this.f.finishBroadcast();
                                continue Label_0018_Outer;
                            }
                            catch (RemoteException ex) {
                                continue;
                            }
                            break;
                        }
                    }
                    break;
                }
                break;
            }
        }
        
        @Override
        public String e() {
            if (Build$VERSION.SDK_INT < 24) {
                return null;
            }
            try {
                return (String)this.a.getClass().getMethod("getCallingPackage", (Class<?>[])new Class[0]).invoke(this.a, new Object[0]);
            }
            catch (Exception ex) {
                Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", (Throwable)ex);
                return null;
            }
        }
        
        @Override
        public void f(final PendingIntent sessionActivity) {
            this.a.setSessionActivity(sessionActivity);
        }
        
        @Override
        public void g(final MediaSessionCompat.b n, final Handler handler) {
            synchronized (this.c) {
                this.n = n;
                final MediaSession a = this.a;
                MediaSession$Callback b;
                if (n == null) {
                    b = null;
                }
                else {
                    b = n.b;
                }
                a.setCallback(b, handler);
                if (n != null) {
                    n.E(this, handler);
                }
            }
        }
        
        @Override
        public void h(final int legacyStreamType) {
            final AudioAttributes$Builder audioAttributes$Builder = new AudioAttributes$Builder();
            audioAttributes$Builder.setLegacyStreamType(legacyStreamType);
            this.a.setPlaybackToLocal(audioAttributes$Builder.build());
        }
        
        @Override
        public void i(final CharSequence queueTitle) {
            this.a.setQueueTitle(queueTitle);
        }
        
        @Override
        public MediaSessionCompat.b j() {
            synchronized (this.c) {
                return this.n;
            }
        }
        
        @Override
        public void k(final MediaMetadataCompat i) {
            this.i = i;
            final MediaSession a = this.a;
            MediaMetadata metadata;
            if (i == null) {
                metadata = null;
            }
            else {
                metadata = (MediaMetadata)i.g();
            }
            a.setMetadata(metadata);
        }
        
        @Override
        public void l(final PendingIntent mediaButtonReceiver) {
            this.a.setMediaButtonReceiver(mediaButtonReceiver);
        }
        
        @Override
        public void m(final int j) {
            this.j = j;
        }
        
        @Override
        public void n(final List<QueueItem> h) {
            this.h = h;
            MediaSession mediaSession;
            ArrayList<MediaSession$QueueItem> queue;
            if (h == null) {
                mediaSession = this.a;
                queue = null;
            }
            else {
                queue = new ArrayList<MediaSession$QueueItem>();
                final Iterator<QueueItem> iterator = h.iterator();
                while (iterator.hasNext()) {
                    queue.add((MediaSession$QueueItem)iterator.next().e());
                }
                mediaSession = this.a;
            }
            mediaSession.setQueue((List)queue);
        }
        
        @Override
        public Object o() {
            return null;
        }
        
        @Override
        public void p(final boolean active) {
            this.a.setActive(active);
        }
        
        @Override
        public void q(final androidx.media.f.b o) {
            synchronized (this.c) {
                this.o = o;
            }
        }
        
        @Override
        public void r(PlaybackStateCompat playbackStateCompat) {
            this.g = playbackStateCompat;
            int n = this.f.beginBroadcast() - 1;
        Label_0038_Outer:
            while (true) {
                Label_0044: {
                    if (n < 0) {
                        break Label_0044;
                    }
                    final android.support.v4.media.session.a a = (android.support.v4.media.session.a)this.f.getBroadcastItem(n);
                    while (true) {
                        try {
                            a.s2(playbackStateCompat);
                            --n;
                            continue Label_0038_Outer;
                            while (true) {
                                playbackStateCompat = null;
                                Label_0073: {
                                    break Label_0073;
                                    Label_0065: {
                                        playbackStateCompat = (PlaybackStateCompat)playbackStateCompat.l();
                                    }
                                }
                                final MediaSession a2;
                                a2.setPlaybackState((PlaybackState)playbackStateCompat);
                                return;
                                this.f.finishBroadcast();
                                a2 = this.a;
                                continue;
                            }
                        }
                        // iftrue(Label_0065:, playbackStateCompat != null)
                        catch (RemoteException ex) {
                            continue;
                        }
                        break;
                    }
                }
            }
        }
        
        @Override
        public void release() {
            this.e = true;
            this.f.kill();
            if (Build$VERSION.SDK_INT == 27) {
                try {
                    final Field declaredField = this.a.getClass().getDeclaredField("mCallback");
                    declaredField.setAccessible(true);
                    final Handler handler = (Handler)declaredField.get(this.a);
                    if (handler != null) {
                        handler.removeCallbacksAndMessages((Object)null);
                    }
                }
                catch (Exception ex) {
                    Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", (Throwable)ex);
                }
            }
            this.a.setCallback((MediaSession$Callback)null);
            this.a.release();
        }
        
        @Override
        public Object s() {
            return this.a;
        }
        
        @Override
        public void setExtras(final Bundle extras) {
            this.a.setExtras(extras);
        }
        
        @Override
        public void t(final androidx.media.k k) {
            this.a.setPlaybackToRemote((VolumeProvider)k.e());
        }
        
        @Override
        public androidx.media.f.b u() {
            synchronized (this.c) {
                return this.o;
            }
        }
        
        @Override
        public PlaybackStateCompat v() {
            return this.g;
        }
        
        public MediaSession w(final Context context, final String s, final Bundle bundle) {
            return new MediaSession(context, s);
        }
        
        class a extends b.b
        {
            public void A(final MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }
            
            public int B() {
                return MediaSessionCompat.f.this.j;
            }
            
            public CharSequence C() {
                throw new AssertionError();
            }
            
            public void D() throws RemoteException {
                throw new AssertionError();
            }
            
            public Bundle E() {
                Bundle bundle;
                if (MediaSessionCompat.f.this.d == null) {
                    bundle = null;
                }
                else {
                    bundle = new Bundle(MediaSessionCompat.f.this.d);
                }
                return bundle;
            }
            
            public String J() {
                throw new AssertionError();
            }
            
            public void K(final boolean b) throws RemoteException {
                throw new AssertionError();
            }
            
            public int L() {
                return MediaSessionCompat.f.this.m;
            }
            
            public void L1(final int n) {
                throw new AssertionError();
            }
            
            public boolean M() {
                return MediaSessionCompat.f.this.k;
            }
            
            public void M0(final String s, final Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }
            
            public void N0(final android.support.v4.media.session.a a) {
                MediaSessionCompat.f.this.f.unregister((IInterface)a);
            }
            
            public List<QueueItem> O() {
                return null;
            }
            
            public void P(final int n) throws RemoteException {
                throw new AssertionError();
            }
            
            public int Q() {
                return MediaSessionCompat.f.this.l;
            }
            
            public void Q0(final String s, final Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }
            
            public void Q1() throws RemoteException {
                throw new AssertionError();
            }
            
            public void R(final int n) throws RemoteException {
                throw new AssertionError();
            }
            
            public void R0(final String s, final Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }
            
            public void T(final String s, final Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }
            
            public void U1(final String s, final Bundle bundle, final ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }
            
            public void V0() throws RemoteException {
                throw new AssertionError();
            }
            
            public void V1() throws RemoteException {
                throw new AssertionError();
            }
            
            public void W(final android.support.v4.media.session.a a) {
                if (!MediaSessionCompat.f.this.e) {
                    MediaSessionCompat.f.this.f.register((IInterface)a, (Object)new androidx.media.f.b("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
                }
            }
            
            public void X0(final Uri uri, final Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }
            
            public void Z0(final long n) throws RemoteException {
                throw new AssertionError();
            }
            
            public boolean a0() {
                return false;
            }
            
            public void b0(final RatingCompat ratingCompat) throws RemoteException {
                throw new AssertionError();
            }
            
            public void e0(final int n, final int n2, final String s) {
                throw new AssertionError();
            }
            
            public void f2(final long n) {
                throw new AssertionError();
            }
            
            public void g0(final Uri uri, final Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }
            
            public void g2(final boolean b) throws RemoteException {
            }
            
            public Bundle getExtras() {
                throw new AssertionError();
            }
            
            public ParcelableVolumeInfo h2() {
                throw new AssertionError();
            }
            
            public void i1(final float n) throws RemoteException {
                throw new AssertionError();
            }
            
            public boolean l1(final KeyEvent keyEvent) {
                throw new AssertionError();
            }
            
            public boolean n0() {
                throw new AssertionError();
            }
            
            public void next() throws RemoteException {
                throw new AssertionError();
            }
            
            public void previous() throws RemoteException {
                throw new AssertionError();
            }
            
            public PendingIntent r0() {
                throw new AssertionError();
            }
            
            public void r1(final int n, final int n2, final String s) {
                throw new AssertionError();
            }
            
            public void stop() throws RemoteException {
                throw new AssertionError();
            }
            
            public void t1(final RatingCompat ratingCompat, final Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }
            
            public MediaMetadataCompat u() {
                throw new AssertionError();
            }
            
            public void u0(final String s, final Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }
            
            public PlaybackStateCompat v() {
                final f e0 = MediaSessionCompat.f.this;
                return MediaSessionCompat.j(e0.g, e0.i);
            }
            
            public long w() {
                throw new AssertionError();
            }
            
            public void w1(final MediaDescriptionCompat mediaDescriptionCompat, final int n) {
                throw new AssertionError();
            }
            
            public String x() {
                throw new AssertionError();
            }
            
            public void z(final MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }
            
            public void z0() throws RemoteException {
                throw new AssertionError();
            }
        }
    }
    
    @p0(22)
    static class g extends f
    {
        g(final Context context, final String s, final androidx.versionedparcelable.h h, final Bundle bundle) {
            super(context, s, h, bundle);
        }
        
        g(final Object o) {
            super(o);
        }
        
        @Override
        public void m(final int ratingType) {
            super.a.setRatingType(ratingType);
        }
    }
    
    @p0(28)
    static class h extends g
    {
        h(final Context context, final String s, final androidx.versionedparcelable.h h, final Bundle bundle) {
            super(context, s, h, bundle);
        }
        
        h(final Object o) {
            super(o);
        }
        
        @Override
        public void q(final androidx.media.f.b b) {
        }
        
        @j0
        @Override
        public final androidx.media.f.b u() {
            return new androidx.media.f.b(super.a.getCurrentControllerInfo());
        }
    }
    
    @p0(29)
    static class i extends h
    {
        i(final Context context, final String s, final androidx.versionedparcelable.h h, final Bundle bundle) {
            super(context, s, h, bundle);
        }
        
        i(final Object o) {
            super(o);
            super.d = ((MediaSession)o).getController().getSessionInfo();
        }
        
        @Override
        public MediaSession w(final Context context, final String s, final Bundle bundle) {
            return new MediaSession(context, s, bundle);
        }
    }
    
    static class j implements MediaSessionCompat.c
    {
        static final int G = 0;
        int A;
        Bundle B;
        int C;
        int D;
        androidx.media.k E;
        private androidx.media.k.d F;
        private final Context a;
        private final ComponentName b;
        private final PendingIntent c;
        private final c d;
        private final Token e;
        final String f;
        final Bundle g;
        final String h;
        final AudioManager i;
        final RemoteControlClient j;
        final Object k;
        final RemoteCallbackList<a> l;
        private d m;
        boolean n;
        boolean o;
        volatile MediaSessionCompat.b p;
        private androidx.media.f.b q;
        int r;
        MediaMetadataCompat s;
        PlaybackStateCompat t;
        PendingIntent u;
        List<QueueItem> v;
        CharSequence w;
        int x;
        boolean y;
        int z;
        
        public j(final Context a, final String h, final ComponentName b, final PendingIntent c, final androidx.versionedparcelable.h h2, final Bundle g) {
            this.k = new Object();
            this.l = (RemoteCallbackList<a>)new RemoteCallbackList();
            this.n = false;
            this.o = false;
            this.r = 3;
            this.F = new androidx.media.k.d() {
                @Override
                public void a(final k k) {
                    if (MediaSessionCompat.j.this.E != k) {
                        return;
                    }
                    final j a = MediaSessionCompat.j.this;
                    MediaSessionCompat.j.this.O(new ParcelableVolumeInfo(a.C, a.D, k.c(), k.b(), k.a()));
                }
            };
            if (b != null) {
                this.a = a;
                this.f = a.getPackageName();
                this.g = g;
                this.i = (AudioManager)a.getSystemService("audio");
                this.h = h;
                this.b = b;
                this.c = c;
                final c d = new c();
                this.d = d;
                this.e = new Token(d, null, h2);
                this.x = 0;
                this.C = 1;
                this.D = 3;
                this.j = new RemoteControlClient(c);
                return;
            }
            throw new IllegalArgumentException("MediaButtonReceiver component may not be null");
        }
        
        private void D(final boolean b) {
            int n = this.l.beginBroadcast() - 1;
        Label_0033_Outer:
            while (true) {
                Label_0039: {
                    if (n < 0) {
                        break Label_0039;
                    }
                    final a a = (a)this.l.getBroadcastItem(n);
                    while (true) {
                        try {
                            a.a1(b);
                            --n;
                            continue Label_0033_Outer;
                            this.l.finishBroadcast();
                        }
                        catch (RemoteException ex) {
                            continue;
                        }
                        break;
                    }
                }
            }
        }
        
        private void E(final String s, final Bundle bundle) {
            int n = this.l.beginBroadcast() - 1;
        Label_0036_Outer:
            while (true) {
                Label_0042: {
                    if (n < 0) {
                        break Label_0042;
                    }
                    final a a = (a)this.l.getBroadcastItem(n);
                    while (true) {
                        try {
                            a.S(s, bundle);
                            --n;
                            continue Label_0036_Outer;
                            this.l.finishBroadcast();
                        }
                        catch (RemoteException ex) {
                            continue;
                        }
                        break;
                    }
                }
            }
        }
        
        private void F(final Bundle bundle) {
            int n = this.l.beginBroadcast() - 1;
        Label_0033_Outer:
            while (true) {
                Label_0039: {
                    if (n < 0) {
                        break Label_0039;
                    }
                    final a a = (a)this.l.getBroadcastItem(n);
                    while (true) {
                        try {
                            a.B0(bundle);
                            --n;
                            continue Label_0033_Outer;
                            this.l.finishBroadcast();
                        }
                        catch (RemoteException ex) {
                            continue;
                        }
                        break;
                    }
                }
            }
        }
        
        private void G(final MediaMetadataCompat mediaMetadataCompat) {
            int n = this.l.beginBroadcast() - 1;
        Label_0033_Outer:
            while (true) {
                Label_0039: {
                    if (n < 0) {
                        break Label_0039;
                    }
                    final a a = (a)this.l.getBroadcastItem(n);
                    while (true) {
                        try {
                            a.x1(mediaMetadataCompat);
                            --n;
                            continue Label_0033_Outer;
                            this.l.finishBroadcast();
                        }
                        catch (RemoteException ex) {
                            continue;
                        }
                        break;
                    }
                }
            }
        }
        
        private void H(final List<QueueItem> list) {
            int n = this.l.beginBroadcast() - 1;
        Label_0033_Outer:
            while (true) {
                Label_0039: {
                    if (n < 0) {
                        break Label_0039;
                    }
                    final a a = (a)this.l.getBroadcastItem(n);
                    while (true) {
                        try {
                            a.G0(list);
                            --n;
                            continue Label_0033_Outer;
                            this.l.finishBroadcast();
                        }
                        catch (RemoteException ex) {
                            continue;
                        }
                        break;
                    }
                }
            }
        }
        
        private void I(final CharSequence charSequence) {
            int n = this.l.beginBroadcast() - 1;
        Label_0033_Outer:
            while (true) {
                Label_0039: {
                    if (n < 0) {
                        break Label_0039;
                    }
                    final a a = (a)this.l.getBroadcastItem(n);
                    while (true) {
                        try {
                            a.p1(charSequence);
                            --n;
                            continue Label_0033_Outer;
                            this.l.finishBroadcast();
                        }
                        catch (RemoteException ex) {
                            continue;
                        }
                        break;
                    }
                }
            }
        }
        
        private void J(final int n) {
            int n2 = this.l.beginBroadcast() - 1;
        Label_0033_Outer:
            while (true) {
                Label_0039: {
                    if (n2 < 0) {
                        break Label_0039;
                    }
                    final a a = (a)this.l.getBroadcastItem(n2);
                    while (true) {
                        try {
                            a.C1(n);
                            --n2;
                            continue Label_0033_Outer;
                            this.l.finishBroadcast();
                        }
                        catch (RemoteException ex) {
                            continue;
                        }
                        break;
                    }
                }
            }
        }
        
        private void L() {
            int n = this.l.beginBroadcast() - 1;
        Label_0032_Outer:
            while (true) {
                Label_0038: {
                    if (n < 0) {
                        break Label_0038;
                    }
                    final a a = (a)this.l.getBroadcastItem(n);
                    while (true) {
                        try {
                            a.v1();
                            --n;
                            continue Label_0032_Outer;
                            this.l.finishBroadcast();
                            this.l.kill();
                        }
                        catch (RemoteException ex) {
                            continue;
                        }
                        break;
                    }
                }
            }
        }
        
        private void M(final int n) {
            int n2 = this.l.beginBroadcast() - 1;
        Label_0033_Outer:
            while (true) {
                Label_0039: {
                    if (n2 < 0) {
                        break Label_0039;
                    }
                    final a a = (a)this.l.getBroadcastItem(n2);
                    while (true) {
                        try {
                            a.O1(n);
                            --n2;
                            continue Label_0033_Outer;
                            this.l.finishBroadcast();
                        }
                        catch (RemoteException ex) {
                            continue;
                        }
                        break;
                    }
                }
            }
        }
        
        private void N(final PlaybackStateCompat playbackStateCompat) {
            int n = this.l.beginBroadcast() - 1;
        Label_0033_Outer:
            while (true) {
                Label_0039: {
                    if (n < 0) {
                        break Label_0039;
                    }
                    final a a = (a)this.l.getBroadcastItem(n);
                    while (true) {
                        try {
                            a.s2(playbackStateCompat);
                            --n;
                            continue Label_0033_Outer;
                            this.l.finishBroadcast();
                        }
                        catch (RemoteException ex) {
                            continue;
                        }
                        break;
                    }
                }
            }
        }
        
        int A(final long n) {
            int n2;
            if ((0x1L & n) != 0x0L) {
                n2 = 32;
            }
            else {
                n2 = 0;
            }
            int n3 = n2;
            if ((0x2L & n) != 0x0L) {
                n3 = (n2 | 0x10);
            }
            int n4 = n3;
            if ((0x4L & n) != 0x0L) {
                n4 = (n3 | 0x4);
            }
            int n5 = n4;
            if ((0x8L & n) != 0x0L) {
                n5 = (n4 | 0x2);
            }
            int n6 = n5;
            if ((0x10L & n) != 0x0L) {
                n6 = (n5 | 0x1);
            }
            int n7 = n6;
            if ((0x20L & n) != 0x0L) {
                n7 = (n6 | 0x80);
            }
            int n8 = n7;
            if ((0x40L & n) != 0x0L) {
                n8 = (n7 | 0x40);
            }
            int n9 = n8;
            if ((n & 0x200L) != 0x0L) {
                n9 = (n8 | 0x8);
            }
            return n9;
        }
        
        void B(int n, final int n2, final int n3, final Object o, final Bundle bundle) {
            synchronized (this.k) {
                final d m = this.m;
                if (m != null) {
                    final Message obtainMessage = m.obtainMessage(n, n2, n3, o);
                    final Bundle data = new Bundle();
                    n = Binder.getCallingUid();
                    data.putInt("data_calling_uid", n);
                    data.putString("data_calling_pkg", this.y(n));
                    n = Binder.getCallingPid();
                    if (n > 0) {
                        data.putInt("data_calling_pid", n);
                    }
                    else {
                        data.putInt("data_calling_pid", -1);
                    }
                    if (bundle != null) {
                        data.putBundle("data_extras", bundle);
                    }
                    obtainMessage.setData(data);
                    obtainMessage.sendToTarget();
                }
            }
        }
        
        void C(final PendingIntent pendingIntent, final ComponentName componentName) {
            this.i.registerMediaButtonEventReceiver(componentName);
        }
        
        @Override
        public void K(final boolean y) {
            if (this.y != y) {
                this.D(this.y = y);
            }
        }
        
        void O(final ParcelableVolumeInfo parcelableVolumeInfo) {
            int n = this.l.beginBroadcast() - 1;
        Label_0033_Outer:
            while (true) {
                Label_0039: {
                    if (n < 0) {
                        break Label_0039;
                    }
                    final a a = (a)this.l.getBroadcastItem(n);
                    while (true) {
                        try {
                            a.v2(parcelableVolumeInfo);
                            --n;
                            continue Label_0033_Outer;
                            this.l.finishBroadcast();
                        }
                        catch (RemoteException ex) {
                            continue;
                        }
                        break;
                    }
                }
            }
        }
        
        @Override
        public void P(final int z) {
            if (this.z != z) {
                this.J(this.z = z);
            }
        }
        
        void Q(final PlaybackStateCompat playbackStateCompat) {
            this.j.setPlaybackState(this.z(playbackStateCompat.n()));
        }
        
        @Override
        public void R(final int a) {
            if (this.A != a) {
                this.M(this.A = a);
            }
        }
        
        void S(final int n, final int n2) {
            if (this.C == 2) {
                final androidx.media.k e = this.E;
                if (e != null) {
                    e.g(n);
                }
            }
            else {
                this.i.setStreamVolume(this.D, n, n2);
            }
        }
        
        void T(final PendingIntent pendingIntent, final ComponentName componentName) {
            this.i.unregisterMediaButtonEventReceiver(componentName);
        }
        
        void U() {
            if (this.o) {
                this.C(this.c, this.b);
                this.i.registerRemoteControlClient(this.j);
                this.k(this.s);
                this.r(this.t);
            }
            else {
                this.T(this.c, this.b);
                this.j.setPlaybackState(0);
                this.i.unregisterRemoteControlClient(this.j);
            }
        }
        
        @Override
        public boolean a() {
            return this.o;
        }
        
        @Override
        public Token b() {
            return this.e;
        }
        
        @Override
        public void c(final int n) {
            synchronized (this.k) {
                this.r = (n | 0x1 | 0x2);
            }
        }
        
        @Override
        public void d(final String s, final Bundle bundle) {
            this.E(s, bundle);
        }
        
        @Override
        public String e() {
            return null;
        }
        
        @Override
        public void f(final PendingIntent u) {
            synchronized (this.k) {
                this.u = u;
            }
        }
        
        @Override
        public void g(final MediaSessionCompat.b p2, final Handler handler) {
            synchronized (this.k) {
                final d m = this.m;
                if (m != null) {
                    m.removeCallbacksAndMessages((Object)null);
                }
                d i;
                if (p2 != null && handler != null) {
                    i = new d(handler.getLooper());
                }
                else {
                    i = null;
                }
                this.m = i;
                if (this.p != p2 && this.p != null) {
                    this.p.E(null, null);
                }
                this.p = p2;
                if (this.p != null) {
                    this.p.E(this, handler);
                }
            }
        }
        
        @Override
        public void h(int c) {
            final androidx.media.k e = this.E;
            if (e != null) {
                e.h(null);
            }
            this.D = c;
            this.C = 1;
            c = this.C;
            final int d = this.D;
            this.O(new ParcelableVolumeInfo(c, d, 2, this.i.getStreamMaxVolume(d), this.i.getStreamVolume(this.D)));
        }
        
        @Override
        public void i(final CharSequence w) {
            this.I(this.w = w);
        }
        
        @Override
        public MediaSessionCompat.b j() {
            synchronized (this.k) {
                return this.p;
            }
        }
        
        @Override
        public void k(MediaMetadataCompat mediaMetadataCompat) {
            MediaMetadataCompat a = mediaMetadataCompat;
            if (mediaMetadataCompat != null) {
                a = new MediaMetadataCompat.b(mediaMetadataCompat, MediaSessionCompat.S).a();
            }
            mediaMetadataCompat = (MediaMetadataCompat)this.k;
            synchronized (mediaMetadataCompat) {
                this.s = a;
                // monitorexit(mediaMetadataCompat)
                this.G(a);
                if (!this.o) {
                    return;
                }
                if (a == null) {
                    mediaMetadataCompat = null;
                }
                else {
                    mediaMetadataCompat = (MediaMetadataCompat)a.d();
                }
                this.x((Bundle)mediaMetadataCompat).apply();
            }
        }
        
        @Override
        public void l(final PendingIntent pendingIntent) {
        }
        
        @Override
        public void m(final int x) {
            this.x = x;
        }
        
        @Override
        public void n(final List<QueueItem> v) {
            this.H(this.v = v);
        }
        
        @Override
        public Object o() {
            return null;
        }
        
        @Override
        public void p(final boolean o) {
            if (o == this.o) {
                return;
            }
            this.o = o;
            this.U();
        }
        
        @Override
        public void q(final androidx.media.f.b q) {
            synchronized (this.k) {
                this.q = q;
            }
        }
        
        @Override
        public void r(final PlaybackStateCompat t) {
            synchronized (this.k) {
                this.t = t;
                // monitorexit(this.k)
                this.N(t);
                if (!this.o) {
                    return;
                }
                if (t == null) {
                    this.j.setPlaybackState(0);
                    this.j.setTransportControlFlags(0);
                }
                else {
                    this.Q(t);
                    this.j.setTransportControlFlags(this.A(t.b()));
                }
            }
        }
        
        @Override
        public void release() {
            this.o = false;
            this.n = true;
            this.U();
            this.L();
            this.g(null, null);
        }
        
        @Override
        public Object s() {
            return null;
        }
        
        @Override
        public void setExtras(final Bundle b) {
            this.F(this.B = b);
        }
        
        @Override
        public void t(final androidx.media.k e) {
            if (e != null) {
                final androidx.media.k e2 = this.E;
                if (e2 != null) {
                    e2.h(null);
                }
                this.C = 2;
                this.E = e;
                this.O(new ParcelableVolumeInfo(this.C, this.D, this.E.c(), this.E.b(), this.E.a()));
                e.h(this.F);
                return;
            }
            throw new IllegalArgumentException("volumeProvider may not be null");
        }
        
        @Override
        public androidx.media.f.b u() {
            synchronized (this.k) {
                return this.q;
            }
        }
        
        @Override
        public PlaybackStateCompat v() {
            synchronized (this.k) {
                return this.t;
            }
        }
        
        void w(final int n, final int n2) {
            if (this.C == 2) {
                final androidx.media.k e = this.E;
                if (e != null) {
                    e.f(n);
                }
            }
            else {
                this.i.adjustStreamVolume(this.D, n, n2);
            }
        }
        
        RemoteControlClient$MetadataEditor x(final Bundle bundle) {
            final RemoteControlClient$MetadataEditor editMetadata = this.j.editMetadata(true);
            if (bundle == null) {
                return editMetadata;
            }
            Label_0097: {
                Bitmap copy = null;
                Label_0054: {
                    Bitmap bitmap;
                    if (bundle.containsKey("android.media.metadata.ART")) {
                        bitmap = (Bitmap)bundle.getParcelable("android.media.metadata.ART");
                        if ((copy = bitmap) == null) {
                            break Label_0054;
                        }
                    }
                    else {
                        if (!bundle.containsKey("android.media.metadata.ALBUM_ART")) {
                            break Label_0097;
                        }
                        bitmap = (Bitmap)bundle.getParcelable("android.media.metadata.ALBUM_ART");
                        if ((copy = bitmap) == null) {
                            break Label_0054;
                        }
                    }
                    copy = bitmap.copy(bitmap.getConfig(), false);
                }
                editMetadata.putBitmap(100, copy);
            }
            if (bundle.containsKey("android.media.metadata.ALBUM")) {
                editMetadata.putString(1, bundle.getString("android.media.metadata.ALBUM"));
            }
            if (bundle.containsKey("android.media.metadata.ALBUM_ARTIST")) {
                editMetadata.putString(13, bundle.getString("android.media.metadata.ALBUM_ARTIST"));
            }
            if (bundle.containsKey("android.media.metadata.ARTIST")) {
                editMetadata.putString(2, bundle.getString("android.media.metadata.ARTIST"));
            }
            if (bundle.containsKey("android.media.metadata.AUTHOR")) {
                editMetadata.putString(3, bundle.getString("android.media.metadata.AUTHOR"));
            }
            if (bundle.containsKey("android.media.metadata.COMPILATION")) {
                editMetadata.putString(15, bundle.getString("android.media.metadata.COMPILATION"));
            }
            if (bundle.containsKey("android.media.metadata.COMPOSER")) {
                editMetadata.putString(4, bundle.getString("android.media.metadata.COMPOSER"));
            }
            if (bundle.containsKey("android.media.metadata.DATE")) {
                editMetadata.putString(5, bundle.getString("android.media.metadata.DATE"));
            }
            if (bundle.containsKey("android.media.metadata.DISC_NUMBER")) {
                editMetadata.putLong(14, bundle.getLong("android.media.metadata.DISC_NUMBER"));
            }
            if (bundle.containsKey("android.media.metadata.DURATION")) {
                editMetadata.putLong(9, bundle.getLong("android.media.metadata.DURATION"));
            }
            if (bundle.containsKey("android.media.metadata.GENRE")) {
                editMetadata.putString(6, bundle.getString("android.media.metadata.GENRE"));
            }
            if (bundle.containsKey("android.media.metadata.TITLE")) {
                editMetadata.putString(7, bundle.getString("android.media.metadata.TITLE"));
            }
            if (bundle.containsKey("android.media.metadata.TRACK_NUMBER")) {
                editMetadata.putLong(0, bundle.getLong("android.media.metadata.TRACK_NUMBER"));
            }
            if (bundle.containsKey("android.media.metadata.WRITER")) {
                editMetadata.putString(11, bundle.getString("android.media.metadata.WRITER"));
            }
            return editMetadata;
        }
        
        String y(final int n) {
            String nameForUid;
            if (TextUtils.isEmpty((CharSequence)(nameForUid = this.a.getPackageManager().getNameForUid(n)))) {
                nameForUid = "android.media.session.MediaController";
            }
            return nameForUid;
        }
        
        int z(final int n) {
            switch (n) {
                default: {
                    return -1;
                }
                case 10:
                case 11: {
                    return 6;
                }
                case 9: {
                    return 7;
                }
                case 7: {
                    return 9;
                }
                case 6:
                case 8: {
                    return 8;
                }
                case 5: {
                    return 5;
                }
                case 4: {
                    return 4;
                }
                case 3: {
                    return 3;
                }
                case 2: {
                    return 2;
                }
                case 1: {
                    return 1;
                }
                case 0: {
                    return 0;
                }
            }
        }
        
        private static final class b
        {
            public final String a;
            public final Bundle b;
            public final ResultReceiver c;
            
            public b(final String a, final Bundle b, final ResultReceiver c) {
                this.a = a;
                this.b = b;
                this.c = c;
            }
        }
        
        class c extends b.b
        {
            public void A(final MediaDescriptionCompat mediaDescriptionCompat) {
                this.B2(25, mediaDescriptionCompat);
            }
            
            void A2(final int n, final int n2) {
                MediaSessionCompat.j.this.B(n, n2, 0, null, null);
            }
            
            public int B() {
                return MediaSessionCompat.j.this.x;
            }
            
            void B2(final int n, final Object o) {
                MediaSessionCompat.j.this.B(n, 0, 0, o, null);
            }
            
            public CharSequence C() {
                return MediaSessionCompat.j.this.w;
            }
            
            void C2(final int n, final Object o, final int n2) {
                MediaSessionCompat.j.this.B(n, n2, 0, o, null);
            }
            
            public void D() throws RemoteException {
                this.z2(12);
            }
            
            void D2(final int n, final Object o, final Bundle bundle) {
                MediaSessionCompat.j.this.B(n, 0, 0, o, bundle);
            }
            
            public Bundle E() {
                Bundle bundle;
                if (MediaSessionCompat.j.this.g == null) {
                    bundle = null;
                }
                else {
                    bundle = new Bundle(MediaSessionCompat.j.this.g);
                }
                return bundle;
            }
            
            public String J() {
                return MediaSessionCompat.j.this.h;
            }
            
            public void K(final boolean b) throws RemoteException {
                this.B2(29, b);
            }
            
            public int L() {
                return MediaSessionCompat.j.this.A;
            }
            
            public void L1(final int n) {
                this.A2(28, n);
            }
            
            public boolean M() {
                return MediaSessionCompat.j.this.y;
            }
            
            public void M0(final String s, final Bundle bundle) throws RemoteException {
                this.D2(4, s, bundle);
            }
            
            public void N0(final a a) {
                MediaSessionCompat.j.this.l.unregister((IInterface)a);
            }
            
            public List<QueueItem> O() {
                synchronized (MediaSessionCompat.j.this.k) {
                    return MediaSessionCompat.j.this.v;
                }
            }
            
            public void P(final int n) throws RemoteException {
                this.A2(23, n);
            }
            
            public int Q() {
                return MediaSessionCompat.j.this.z;
            }
            
            public void Q0(final String s, final Bundle bundle) throws RemoteException {
                this.D2(8, s, bundle);
            }
            
            public void Q1() throws RemoteException {
                this.z2(7);
            }
            
            public void R(final int n) throws RemoteException {
                this.A2(30, n);
            }
            
            public void R0(final String s, final Bundle bundle) throws RemoteException {
                this.D2(9, s, bundle);
            }
            
            public void T(final String s, final Bundle bundle) throws RemoteException {
                this.D2(20, s, bundle);
            }
            
            public void U1(final String s, final Bundle bundle, final ResultReceiverWrapper resultReceiverWrapper) {
                ResultReceiver g;
                if (resultReceiverWrapper == null) {
                    g = null;
                }
                else {
                    g = resultReceiverWrapper.G;
                }
                this.B2(1, new j.b(s, bundle, g));
            }
            
            public void V0() throws RemoteException {
                this.z2(16);
            }
            
            public void V1() throws RemoteException {
                this.z2(17);
            }
            
            public void W(final a a) {
                Label_0017: {
                    if (!MediaSessionCompat.j.this.n) {
                        break Label_0017;
                    }
                    try {
                        a.v1();
                        return;
                        MediaSessionCompat.j.this.l.register((IInterface)a, (Object)new androidx.media.f.b(MediaSessionCompat.j.this.y(Binder.getCallingUid()), Binder.getCallingPid(), Binder.getCallingUid()));
                    }
                    catch (Exception ex) {}
                }
            }
            
            public void X0(final Uri uri, final Bundle bundle) throws RemoteException {
                this.D2(10, uri, bundle);
            }
            
            public void Z0(final long l) throws RemoteException {
                this.B2(18, l);
            }
            
            public boolean a0() {
                return false;
            }
            
            public void b0(final RatingCompat ratingCompat) throws RemoteException {
                this.B2(19, ratingCompat);
            }
            
            public void e0(final int n, final int n2, final String s) {
                MediaSessionCompat.j.this.S(n, n2);
            }
            
            public void f2(final long l) {
                this.B2(11, l);
            }
            
            public void g0(final Uri uri, final Bundle bundle) throws RemoteException {
                this.D2(6, uri, bundle);
            }
            
            public void g2(final boolean b) throws RemoteException {
            }
            
            public Bundle getExtras() {
                synchronized (MediaSessionCompat.j.this.k) {
                    return MediaSessionCompat.j.this.B;
                }
            }
            
            public ParcelableVolumeInfo h2() {
                synchronized (MediaSessionCompat.j.this.k) {
                    final j e0 = MediaSessionCompat.j.this;
                    final int c = e0.C;
                    final int d = e0.D;
                    final androidx.media.k e2 = e0.E;
                    final int n = 2;
                    int c2;
                    int b;
                    int n2;
                    if (c == 2) {
                        c2 = e2.c();
                        b = e2.b();
                        n2 = e2.a();
                    }
                    else {
                        final int streamMaxVolume = e0.i.getStreamMaxVolume(d);
                        n2 = MediaSessionCompat.j.this.i.getStreamVolume(d);
                        b = streamMaxVolume;
                        c2 = n;
                    }
                    // monitorexit(this.e0.k)
                    return new ParcelableVolumeInfo(c, d, c2, b, n2);
                }
            }
            
            public void i1(final float f) throws RemoteException {
                this.B2(32, f);
            }
            
            public boolean l1(final KeyEvent keyEvent) {
                this.B2(21, keyEvent);
                return true;
            }
            
            public boolean n0() {
                return true;
            }
            
            public void next() throws RemoteException {
                this.z2(14);
            }
            
            public void previous() throws RemoteException {
                this.z2(15);
            }
            
            public PendingIntent r0() {
                synchronized (MediaSessionCompat.j.this.k) {
                    return MediaSessionCompat.j.this.u;
                }
            }
            
            public void r1(final int n, final int n2, final String s) {
                MediaSessionCompat.j.this.w(n, n2);
            }
            
            public void stop() throws RemoteException {
                this.z2(13);
            }
            
            public void t1(final RatingCompat ratingCompat, final Bundle bundle) throws RemoteException {
                this.D2(31, ratingCompat, bundle);
            }
            
            public MediaMetadataCompat u() {
                return MediaSessionCompat.j.this.s;
            }
            
            public void u0(final String s, final Bundle bundle) throws RemoteException {
                this.D2(5, s, bundle);
            }
            
            public PlaybackStateCompat v() {
                synchronized (MediaSessionCompat.j.this.k) {
                    final j e0 = MediaSessionCompat.j.this;
                    final PlaybackStateCompat t = e0.t;
                    final MediaMetadataCompat s = e0.s;
                    // monitorexit(this.e0.k)
                    return MediaSessionCompat.j(t, s);
                }
            }
            
            public long w() {
                synchronized (MediaSessionCompat.j.this.k) {
                    return MediaSessionCompat.j.this.r;
                }
            }
            
            public void w1(final MediaDescriptionCompat mediaDescriptionCompat, final int n) {
                this.C2(26, mediaDescriptionCompat, n);
            }
            
            public String x() {
                return MediaSessionCompat.j.this.f;
            }
            
            public void z(final MediaDescriptionCompat mediaDescriptionCompat) {
                this.B2(27, mediaDescriptionCompat);
            }
            
            public void z0() throws RemoteException {
                this.z2(3);
            }
            
            void z2(final int n) {
                MediaSessionCompat.j.this.B(n, 0, 0, null, null);
            }
        }
        
        class d extends Handler
        {
            private static final int A = 25;
            private static final int B = 26;
            private static final int C = 27;
            private static final int D = 28;
            private static final int E = 29;
            private static final int F = 30;
            private static final int G = 127;
            private static final int H = 126;
            private static final int b = 1;
            private static final int c = 2;
            private static final int d = 3;
            private static final int e = 4;
            private static final int f = 5;
            private static final int g = 6;
            private static final int h = 7;
            private static final int i = 8;
            private static final int j = 9;
            private static final int k = 10;
            private static final int l = 11;
            private static final int m = 12;
            private static final int n = 13;
            private static final int o = 14;
            private static final int p = 15;
            private static final int q = 16;
            private static final int r = 17;
            private static final int s = 18;
            private static final int t = 19;
            private static final int u = 31;
            private static final int v = 32;
            private static final int w = 20;
            private static final int x = 21;
            private static final int y = 22;
            private static final int z = 23;
            
            public d(final Looper looper) {
                super(looper);
            }
            
            private void a(final KeyEvent keyEvent, final MediaSessionCompat.b b) {
                if (keyEvent != null) {
                    if (keyEvent.getAction() == 0) {
                        final PlaybackStateCompat t = MediaSessionCompat.j.this.t;
                        long b2;
                        if (t == null) {
                            b2 = 0L;
                        }
                        else {
                            b2 = t.b();
                        }
                        final int keyCode = keyEvent.getKeyCode();
                        if (keyCode != 79) {
                            if (keyCode != 126) {
                                if (keyCode != 127) {
                                    switch (keyCode) {
                                        default: {
                                            return;
                                        }
                                        case 90: {
                                            if ((b2 & 0x40L) != 0x0L) {
                                                b.f();
                                            }
                                            return;
                                        }
                                        case 89: {
                                            if ((b2 & 0x8L) != 0x0L) {
                                                b.s();
                                            }
                                            return;
                                        }
                                        case 88: {
                                            if ((b2 & 0x10L) != 0x0L) {
                                                b.B();
                                            }
                                            return;
                                        }
                                        case 87: {
                                            if ((b2 & 0x20L) != 0x0L) {
                                                b.A();
                                            }
                                            return;
                                        }
                                        case 86: {
                                            if ((b2 & 0x1L) != 0x0L) {
                                                b.D();
                                            }
                                            return;
                                        }
                                        case 85: {
                                            break;
                                        }
                                    }
                                }
                                else {
                                    if ((b2 & 0x2L) != 0x0L) {
                                        b.h();
                                    }
                                    return;
                                }
                            }
                            else {
                                if ((b2 & 0x4L) != 0x0L) {
                                    b.i();
                                }
                                return;
                            }
                        }
                        Log.w("MediaSessionCompat", "KEYCODE_MEDIA_PLAY_PAUSE and KEYCODE_HEADSETHOOK are handled already");
                    }
                }
            }
            
            public void handleMessage(final Message message) {
                final MediaSessionCompat.b p = MediaSessionCompat.j.this.p;
                if (p == null) {
                    return;
                }
                final Bundle data = message.getData();
                MediaSessionCompat.b(data);
                MediaSessionCompat.j.this.q(new androidx.media.f.b(data.getString("data_calling_pkg"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid")));
                final Bundle bundle = data.getBundle("data_extras");
                MediaSessionCompat.b(bundle);
                try {
                    MediaDescriptionCompat c = null;
                    switch (message.what) {
                        default: {
                            return;
                        }
                        case 32: {
                            p.v((float)message.obj);
                            return;
                        }
                        case 31: {
                            p.x((RatingCompat)message.obj, bundle);
                            return;
                        }
                        case 30: {
                            p.z(message.arg1);
                            return;
                        }
                        case 29: {
                            p.u((boolean)message.obj);
                            return;
                        }
                        case 28: {
                            final List<QueueItem> v = MediaSessionCompat.j.this.v;
                            if (v == null) {
                                return;
                            }
                            final int arg1 = message.arg1;
                            QueueItem queueItem;
                            if (arg1 >= 0 && arg1 < v.size()) {
                                queueItem = MediaSessionCompat.j.this.v.get(message.arg1);
                            }
                            else {
                                queueItem = null;
                            }
                            if (queueItem != null) {
                                c = queueItem.c();
                                break;
                            }
                            return;
                        }
                        case 27: {
                            c = (MediaDescriptionCompat)message.obj;
                            break;
                        }
                        case 26: {
                            p.c((MediaDescriptionCompat)message.obj, message.arg1);
                            return;
                        }
                        case 25: {
                            p.b((MediaDescriptionCompat)message.obj);
                            return;
                        }
                        case 23: {
                            p.y(message.arg1);
                            return;
                        }
                        case 22: {
                            MediaSessionCompat.j.this.S(message.arg1, 0);
                            return;
                        }
                        case 21: {
                            final KeyEvent keyEvent = (KeyEvent)message.obj;
                            final Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                            intent.putExtra("android.intent.extra.KEY_EVENT", (Parcelable)keyEvent);
                            if (!p.g(intent)) {
                                this.a(keyEvent, p);
                            }
                            return;
                        }
                        case 20: {
                            p.e((String)message.obj, bundle);
                            return;
                        }
                        case 19: {
                            p.w((RatingCompat)message.obj);
                            return;
                        }
                        case 18: {
                            p.t((long)message.obj);
                            return;
                        }
                        case 17: {
                            p.s();
                            return;
                        }
                        case 16: {
                            p.f();
                            return;
                        }
                        case 15: {
                            p.B();
                            return;
                        }
                        case 14: {
                            p.A();
                            return;
                        }
                        case 13: {
                            p.D();
                            return;
                        }
                        case 12: {
                            p.h();
                            return;
                        }
                        case 11: {
                            p.C((long)message.obj);
                            return;
                        }
                        case 10: {
                            p.l((Uri)message.obj, bundle);
                            return;
                        }
                        case 9: {
                            p.k((String)message.obj, bundle);
                            return;
                        }
                        case 8: {
                            p.j((String)message.obj, bundle);
                            return;
                        }
                        case 7: {
                            p.i();
                            return;
                        }
                        case 6: {
                            p.p((Uri)message.obj, bundle);
                            return;
                        }
                        case 5: {
                            p.o((String)message.obj, bundle);
                            return;
                        }
                        case 4: {
                            p.n((String)message.obj, bundle);
                            return;
                        }
                        case 3: {
                            p.m();
                            return;
                        }
                        case 2: {
                            MediaSessionCompat.j.this.w(message.arg1, 0);
                            return;
                        }
                        case 1: {
                            final b b = (b)message.obj;
                            p.d(b.a, b.b, b.c);
                            return;
                        }
                    }
                    p.q(c);
                }
                finally {
                    MediaSessionCompat.j.this.q(null);
                }
            }
        }
    }
    
    public interface k
    {
        void a();
    }
}
