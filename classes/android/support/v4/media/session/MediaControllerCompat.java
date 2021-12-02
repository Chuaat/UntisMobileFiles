// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.media.session;

import android.os.IInterface;
import android.media.Rating;
import android.support.v4.media.RatingCompat;
import android.net.Uri;
import android.os.IBinder;
import android.os.Looper;
import android.media.session.MediaSession$QueueItem;
import android.os.Message;
import android.media.session.MediaController$Callback;
import android.os.IBinder$DeathRecipient;
import androidx.versionedparcelable.c;
import androidx.core.app.i;
import java.lang.ref.WeakReference;
import android.media.session.PlaybackState;
import android.media.MediaMetadata;
import java.util.Iterator;
import android.media.session.MediaController$TransportControls;
import android.media.session.MediaController$PlaybackInfo;
import androidx.media.AudioAttributesCompat;
import android.os.RemoteException;
import android.os.Parcelable;
import android.media.session.MediaSession$Token;
import java.util.ArrayList;
import java.util.HashMap;
import androidx.annotation.w;
import android.media.session.MediaController;
import androidx.annotation.p0;
import android.app.PendingIntent;
import androidx.versionedparcelable.h;
import android.support.v4.media.MediaMetadataCompat;
import android.view.KeyEvent;
import android.os.Handler;
import android.util.Log;
import android.text.TextUtils;
import android.os.ResultReceiver;
import androidx.annotation.k0;
import java.util.List;
import android.support.v4.media.MediaDescriptionCompat;
import android.os.Bundle;
import androidx.media.j;
import android.app.Activity;
import android.os.Build$VERSION;
import androidx.annotation.j0;
import android.content.Context;
import android.annotation.SuppressLint;
import java.util.concurrent.ConcurrentHashMap;
import androidx.annotation.t0;

public final class MediaControllerCompat
{
    static final String d = "MediaControllerCompat";
    @t0({ t0.a.G })
    public static final String e = "android.support.v4.media.session.command.GET_EXTRA_BINDER";
    @t0({ t0.a.G })
    public static final String f = "android.support.v4.media.session.command.ADD_QUEUE_ITEM";
    @t0({ t0.a.G })
    public static final String g = "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT";
    @t0({ t0.a.G })
    public static final String h = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM";
    @t0({ t0.a.G })
    public static final String i = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT";
    @t0({ t0.a.G })
    public static final String j = "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION";
    @t0({ t0.a.G })
    public static final String k = "android.support.v4.media.session.command.ARGUMENT_INDEX";
    private final b a;
    private final MediaSessionCompat.Token b;
    @SuppressLint({ "BanConcurrentHashMap" })
    private final ConcurrentHashMap<a, Boolean> c;
    
    public MediaControllerCompat(final Context context, @j0 final MediaSessionCompat.Token b) {
        this.c = new ConcurrentHashMap<a, Boolean>();
        if (b != null) {
            this.b = b;
            if (Build$VERSION.SDK_INT >= 21) {
                this.a = (b)new MediaControllerImplApi21(context, b);
            }
            else {
                this.a = (b)new d(b);
            }
            return;
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }
    
    public MediaControllerCompat(final Context context, @j0 final MediaSessionCompat mediaSessionCompat) {
        this.c = new ConcurrentHashMap<a, Boolean>();
        if (mediaSessionCompat != null) {
            final MediaSessionCompat.Token i = mediaSessionCompat.i();
            this.b = i;
            final int sdk_INT = Build$VERSION.SDK_INT;
            b a;
            if (sdk_INT >= 29) {
                a = new c(context, i);
            }
            else {
                if (sdk_INT < 21) {
                    this.a = (b)new d(i);
                    return;
                }
                a = new MediaControllerImplApi21(context, i);
            }
            this.a = a;
            return;
        }
        throw new IllegalArgumentException("session must not be null");
    }
    
    public static void D(@j0 final Activity activity, final MediaControllerCompat mediaControllerCompat) {
        activity.getWindow().getDecorView().setTag(androidx.media.j.b.k, (Object)mediaControllerCompat);
        if (Build$VERSION.SDK_INT >= 21) {
            MediaControllerImplApi21.p(activity, mediaControllerCompat);
        }
    }
    
    static void G(final String str, final Bundle bundle) {
        if (str == null) {
            return;
        }
        if (str.equals("android.support.v4.media.session.action.FOLLOW") || str.equals("android.support.v4.media.session.action.UNFOLLOW")) {
            if (bundle == null || !bundle.containsKey("android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE")) {
                final StringBuilder sb = new StringBuilder();
                sb.append("An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action ");
                sb.append(str);
                sb.append(".");
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }
    
    public static MediaControllerCompat g(@j0 final Activity activity) {
        final Object tag = activity.getWindow().getDecorView().getTag(androidx.media.j.b.k);
        if (tag instanceof MediaControllerCompat) {
            return (MediaControllerCompat)tag;
        }
        if (Build$VERSION.SDK_INT >= 21) {
            return MediaControllerImplApi21.m(activity);
        }
        return null;
    }
    
    public void A(final MediaDescriptionCompat mediaDescriptionCompat) {
        this.a.z(mediaDescriptionCompat);
    }
    
    @Deprecated
    public void B(final int n) {
        final List<MediaSessionCompat.QueueItem> m = this.m();
        if (m != null && n >= 0 && n < m.size()) {
            final MediaSessionCompat.QueueItem queueItem = m.get(n);
            if (queueItem != null) {
                this.A(queueItem.c());
            }
        }
    }
    
    public void C(@j0 final String s, @k0 final Bundle bundle, @k0 final ResultReceiver resultReceiver) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            this.a.g(s, bundle, resultReceiver);
            return;
        }
        throw new IllegalArgumentException("command must neither be null nor empty");
    }
    
    public void E(final int n, final int n2) {
        this.a.e(n, n2);
    }
    
    public void F(@j0 final a key) {
        if (key != null) {
            if (this.c.remove(key) == null) {
                Log.w("MediaControllerCompat", "the callback has never been registered");
                return;
            }
            try {
                this.a.c(key);
                return;
            }
            finally {
                key.o(null);
            }
        }
        throw new IllegalArgumentException("callback must not be null");
    }
    
    public void a(final MediaDescriptionCompat mediaDescriptionCompat) {
        this.a.A(mediaDescriptionCompat);
    }
    
    public void b(final MediaDescriptionCompat mediaDescriptionCompat, final int n) {
        this.a.f(mediaDescriptionCompat, n);
    }
    
    public void c(final int n, final int n2) {
        this.a.b(n, n2);
    }
    
    public boolean d(final KeyEvent keyEvent) {
        if (keyEvent != null) {
            return this.a.d(keyEvent);
        }
        throw new IllegalArgumentException("KeyEvent may not be null");
    }
    
    public Bundle e() {
        return this.a.getExtras();
    }
    
    public long f() {
        return this.a.w();
    }
    
    public Object h() {
        return this.a.k();
    }
    
    public MediaMetadataCompat i() {
        return this.a.u();
    }
    
    public String j() {
        return this.a.x();
    }
    
    public e k() {
        return this.a.a();
    }
    
    public PlaybackStateCompat l() {
        return this.a.v();
    }
    
    public List<MediaSessionCompat.QueueItem> m() {
        return this.a.O();
    }
    
    public CharSequence n() {
        return this.a.C();
    }
    
    public int o() {
        return this.a.B();
    }
    
    public int p() {
        return this.a.Q();
    }
    
    @k0
    @t0({ t0.a.G })
    public androidx.versionedparcelable.h q() {
        return this.b.e();
    }
    
    public PendingIntent r() {
        return this.a.i();
    }
    
    @j0
    public Bundle s() {
        return this.a.E();
    }
    
    public MediaSessionCompat.Token t() {
        return this.b;
    }
    
    public int u() {
        return this.a.L();
    }
    
    public f v() {
        return this.a.j();
    }
    
    public boolean w() {
        return this.a.M();
    }
    
    public boolean x() {
        return this.a.h();
    }
    
    public void y(@j0 final a a) {
        this.z(a, null);
    }
    
    public void z(@j0 final a key, final Handler handler) {
        if (key == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (this.c.putIfAbsent(key, Boolean.TRUE) != null) {
            Log.w("MediaControllerCompat", "the callback has already been registered");
            return;
        }
        Handler handler2;
        if ((handler2 = handler) == null) {
            handler2 = new Handler();
        }
        key.o(handler2);
        this.a.l(key, handler2);
    }
    
    @p0(21)
    static class MediaControllerImplApi21 implements MediaControllerCompat.b
    {
        protected final MediaController a;
        final Object b;
        @w("mLock")
        private final List<MediaControllerCompat.a> c;
        private HashMap<MediaControllerCompat.a, a> d;
        protected Bundle e;
        final MediaSessionCompat.Token f;
        
        MediaControllerImplApi21(final Context context, final MediaSessionCompat.Token f) {
            this.b = new Object();
            this.c = new ArrayList<MediaControllerCompat.a>();
            this.d = new HashMap<MediaControllerCompat.a, a>();
            this.f = f;
            this.a = new MediaController(context, (MediaSession$Token)f.f());
            if (f.d() == null) {
                this.o();
            }
        }
        
        @k0
        static MediaControllerCompat m(@j0 final Activity activity) {
            final MediaController mediaController = activity.getMediaController();
            if (mediaController == null) {
                return null;
            }
            return new MediaControllerCompat((Context)activity, MediaSessionCompat.Token.b(mediaController.getSessionToken()));
        }
        
        private void o() {
            this.g("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
        }
        
        static void p(@j0 final Activity activity, @k0 final MediaControllerCompat mediaControllerCompat) {
            MediaController mediaController;
            if (mediaControllerCompat != null) {
                mediaController = new MediaController((Context)activity, (MediaSession$Token)mediaControllerCompat.t().f());
            }
            else {
                mediaController = null;
            }
            activity.setMediaController(mediaController);
        }
        
        @Override
        public void A(final MediaDescriptionCompat mediaDescriptionCompat) {
            if ((this.w() & 0x4L) != 0x0L) {
                final Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", (Parcelable)mediaDescriptionCompat);
                this.g("android.support.v4.media.session.command.ADD_QUEUE_ITEM", bundle, null);
                return;
            }
            throw new UnsupportedOperationException("This session doesn't support queue management operations");
        }
        
        @Override
        public int B() {
            if (Build$VERSION.SDK_INT < 22 && this.f.d() != null) {
                try {
                    return this.f.d().B();
                }
                catch (RemoteException ex) {
                    Log.e("MediaControllerCompat", "Dead object in getRatingType.", (Throwable)ex);
                }
            }
            return this.a.getRatingType();
        }
        
        @Override
        public CharSequence C() {
            return this.a.getQueueTitle();
        }
        
        @Override
        public Bundle E() {
            if (this.e != null) {
                return new Bundle(this.e);
            }
            if (this.f.d() != null) {
                try {
                    this.e = this.f.d().E();
                }
                catch (RemoteException ex) {
                    Log.e("MediaControllerCompat", "Dead object in getSessionInfo.", (Throwable)ex);
                    this.e = Bundle.EMPTY;
                }
            }
            Bundle empty;
            if ((this.e = MediaSessionCompat.F(this.e)) == null) {
                empty = Bundle.EMPTY;
            }
            else {
                empty = new Bundle(this.e);
            }
            return empty;
        }
        
        @Override
        public int L() {
            if (this.f.d() != null) {
                try {
                    return this.f.d().L();
                }
                catch (RemoteException ex) {
                    Log.e("MediaControllerCompat", "Dead object in getShuffleMode.", (Throwable)ex);
                }
            }
            return -1;
        }
        
        @Override
        public boolean M() {
            if (this.f.d() != null) {
                try {
                    return this.f.d().M();
                }
                catch (RemoteException ex) {
                    Log.e("MediaControllerCompat", "Dead object in isCaptioningEnabled.", (Throwable)ex);
                }
            }
            return false;
        }
        
        @Override
        public List<MediaSessionCompat.QueueItem> O() {
            final List queue = this.a.getQueue();
            List<MediaSessionCompat.QueueItem> b;
            if (queue != null) {
                b = MediaSessionCompat.QueueItem.b(queue);
            }
            else {
                b = null;
            }
            return b;
        }
        
        @Override
        public int Q() {
            if (this.f.d() != null) {
                try {
                    return this.f.d().Q();
                }
                catch (RemoteException ex) {
                    Log.e("MediaControllerCompat", "Dead object in getRepeatMode.", (Throwable)ex);
                }
            }
            return -1;
        }
        
        @Override
        public e a() {
            final MediaController$PlaybackInfo playbackInfo = this.a.getPlaybackInfo();
            Object o;
            if (playbackInfo != null) {
                o = new e(playbackInfo.getPlaybackType(), AudioAttributesCompat.k(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
            }
            else {
                o = null;
            }
            return (e)o;
        }
        
        @Override
        public void b(final int n, final int n2) {
            this.a.adjustVolume(n, n2);
        }
        
        @Override
        public final void c(final MediaControllerCompat.a key) {
            this.a.unregisterCallback(key.a);
            synchronized (this.b) {
                if (this.f.d() != null) {
                    try {
                        final a a = this.d.remove(key);
                        if (a != null) {
                            key.c = null;
                            this.f.d().N0(a);
                        }
                    }
                    catch (RemoteException ex) {
                        Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", (Throwable)ex);
                    }
                }
                else {
                    this.c.remove(key);
                }
            }
        }
        
        @Override
        public boolean d(final KeyEvent keyEvent) {
            return this.a.dispatchMediaButtonEvent(keyEvent);
        }
        
        @Override
        public void e(final int n, final int n2) {
            this.a.setVolumeTo(n, n2);
        }
        
        @Override
        public void f(final MediaDescriptionCompat mediaDescriptionCompat, final int n) {
            if ((this.w() & 0x4L) != 0x0L) {
                final Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", (Parcelable)mediaDescriptionCompat);
                bundle.putInt("android.support.v4.media.session.command.ARGUMENT_INDEX", n);
                this.g("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT", bundle, null);
                return;
            }
            throw new UnsupportedOperationException("This session doesn't support queue management operations");
        }
        
        @Override
        public void g(final String s, final Bundle bundle, final ResultReceiver resultReceiver) {
            this.a.sendCommand(s, bundle, resultReceiver);
        }
        
        @Override
        public Bundle getExtras() {
            return this.a.getExtras();
        }
        
        @Override
        public boolean h() {
            return this.f.d() != null;
        }
        
        @Override
        public PendingIntent i() {
            return this.a.getSessionActivity();
        }
        
        @Override
        public f j() {
            final MediaController$TransportControls transportControls = this.a.getTransportControls();
            final int sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT >= 29) {
                return new j(transportControls);
            }
            if (sdk_INT >= 24) {
                return new i(transportControls);
            }
            if (sdk_INT >= 23) {
                return new h(transportControls);
            }
            return new g(transportControls);
        }
        
        @Override
        public Object k() {
            return this.a;
        }
        
        @Override
        public final void l(final MediaControllerCompat.a key, final Handler handler) {
            this.a.registerCallback(key.a, handler);
            synchronized (this.b) {
                if (this.f.d() != null) {
                    final a a = new a(key);
                    this.d.put(key, a);
                    key.c = a;
                    try {
                        this.f.d().W(a);
                        key.n(13, null, null);
                    }
                    catch (RemoteException ex) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", (Throwable)ex);
                    }
                }
                else {
                    key.c = null;
                    this.c.add(key);
                }
            }
        }
        
        @w("mLock")
        void n() {
            if (this.f.d() == null) {
                return;
            }
            for (final MediaControllerCompat.a key : this.c) {
                final a a = new a(key);
                this.d.put(key, a);
                key.c = a;
                try {
                    this.f.d().W(a);
                    key.n(13, null, null);
                    continue;
                }
                catch (RemoteException ex) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", (Throwable)ex);
                }
                break;
            }
            this.c.clear();
        }
        
        @Override
        public MediaMetadataCompat u() {
            final MediaMetadata metadata = this.a.getMetadata();
            MediaMetadataCompat b;
            if (metadata != null) {
                b = MediaMetadataCompat.b(metadata);
            }
            else {
                b = null;
            }
            return b;
        }
        
        @Override
        public PlaybackStateCompat v() {
            if (this.f.d() != null) {
                try {
                    return this.f.d().v();
                }
                catch (RemoteException ex) {
                    Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", (Throwable)ex);
                }
            }
            final PlaybackState playbackState = this.a.getPlaybackState();
            PlaybackStateCompat a;
            if (playbackState != null) {
                a = PlaybackStateCompat.a(playbackState);
            }
            else {
                a = null;
            }
            return a;
        }
        
        @Override
        public long w() {
            return this.a.getFlags();
        }
        
        @Override
        public String x() {
            return this.a.getPackageName();
        }
        
        @Override
        public void z(final MediaDescriptionCompat mediaDescriptionCompat) {
            if ((this.w() & 0x4L) != 0x0L) {
                final Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", (Parcelable)mediaDescriptionCompat);
                this.g("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM", bundle, null);
                return;
            }
            throw new UnsupportedOperationException("This session doesn't support queue management operations");
        }
        
        private static class ExtraBinderRequestResultReceiver extends ResultReceiver
        {
            private WeakReference<MediaControllerImplApi21> G;
            
            ExtraBinderRequestResultReceiver(final MediaControllerImplApi21 referent) {
                super((Handler)null);
                this.G = new WeakReference<MediaControllerImplApi21>(referent);
            }
            
            protected void onReceiveResult(final int n, final Bundle bundle) {
                final MediaControllerImplApi21 mediaControllerImplApi21 = this.G.get();
                if (mediaControllerImplApi21 != null) {
                    if (bundle != null) {
                        synchronized (mediaControllerImplApi21.b) {
                            mediaControllerImplApi21.f.g(android.support.v4.media.session.b.b.H(androidx.core.app.i.a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                            mediaControllerImplApi21.f.h(androidx.versionedparcelable.c.c(bundle, "android.support.v4.media.session.SESSION_TOKEN2"));
                            mediaControllerImplApi21.n();
                        }
                    }
                }
            }
        }
        
        private static class a extends MediaControllerCompat.a.c
        {
            a(final MediaControllerCompat.a a) {
                super(a);
            }
            
            @Override
            public void B0(final Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }
            
            @Override
            public void G0(final List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                throw new AssertionError();
            }
            
            @Override
            public void p1(final CharSequence charSequence) throws RemoteException {
                throw new AssertionError();
            }
            
            @Override
            public void v1() throws RemoteException {
                throw new AssertionError();
            }
            
            @Override
            public void v2(final ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                throw new AssertionError();
            }
            
            @Override
            public void x1(final MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                throw new AssertionError();
            }
        }
    }
    
    public abstract static class a implements IBinder$DeathRecipient
    {
        final MediaController$Callback a;
        b b;
        a c;
        
        public a() {
            if (Build$VERSION.SDK_INT >= 21) {
                this.a = new MediaControllerCompat.a.a(this);
            }
            else {
                this.a = null;
                this.c = new c(this);
            }
        }
        
        @t0({ t0.a.I })
        public a a() {
            return this.c;
        }
        
        public void b(final e e) {
        }
        
        public void binderDied() {
            this.n(8, null, null);
        }
        
        public void c(final boolean b) {
        }
        
        public void d(final Bundle bundle) {
        }
        
        public void e(final MediaMetadataCompat mediaMetadataCompat) {
        }
        
        public void f(final PlaybackStateCompat playbackStateCompat) {
        }
        
        public void g(final List<MediaSessionCompat.QueueItem> list) {
        }
        
        public void h(final CharSequence charSequence) {
        }
        
        public void i(final int n) {
        }
        
        public void j() {
        }
        
        public void k(final String s, final Bundle bundle) {
        }
        
        public void l() {
        }
        
        public void m(final int n) {
        }
        
        void n(final int n, final Object o, final Bundle data) {
            final b b = this.b;
            if (b != null) {
                final Message obtainMessage = b.obtainMessage(n, o);
                obtainMessage.setData(data);
                obtainMessage.sendToTarget();
            }
        }
        
        void o(final Handler handler) {
            if (handler == null) {
                final b b = this.b;
                if (b != null) {
                    b.a = false;
                    b.removeCallbacksAndMessages((Object)null);
                    this.b = null;
                }
            }
            else {
                final b b2 = new b(handler.getLooper());
                this.b = b2;
                b2.a = true;
            }
        }
        
        @p0(21)
        private static class a extends MediaController$Callback
        {
            private final WeakReference<MediaControllerCompat.a> a;
            
            a(final MediaControllerCompat.a referent) {
                this.a = new WeakReference<MediaControllerCompat.a>(referent);
            }
            
            public void onAudioInfoChanged(final MediaController$PlaybackInfo mediaController$PlaybackInfo) {
                final MediaControllerCompat.a a = this.a.get();
                if (a != null) {
                    a.b(new e(mediaController$PlaybackInfo.getPlaybackType(), AudioAttributesCompat.k(mediaController$PlaybackInfo.getAudioAttributes()), mediaController$PlaybackInfo.getVolumeControl(), mediaController$PlaybackInfo.getMaxVolume(), mediaController$PlaybackInfo.getCurrentVolume()));
                }
            }
            
            public void onExtrasChanged(final Bundle bundle) {
                MediaSessionCompat.b(bundle);
                final MediaControllerCompat.a a = this.a.get();
                if (a != null) {
                    a.d(bundle);
                }
            }
            
            public void onMetadataChanged(final MediaMetadata mediaMetadata) {
                final MediaControllerCompat.a a = this.a.get();
                if (a != null) {
                    a.e(MediaMetadataCompat.b(mediaMetadata));
                }
            }
            
            public void onPlaybackStateChanged(final PlaybackState playbackState) {
                final MediaControllerCompat.a a = this.a.get();
                if (a != null) {
                    if (a.c == null) {
                        a.f(PlaybackStateCompat.a(playbackState));
                    }
                }
            }
            
            public void onQueueChanged(final List<MediaSession$QueueItem> list) {
                final MediaControllerCompat.a a = this.a.get();
                if (a != null) {
                    a.g(MediaSessionCompat.QueueItem.b(list));
                }
            }
            
            public void onQueueTitleChanged(final CharSequence charSequence) {
                final MediaControllerCompat.a a = this.a.get();
                if (a != null) {
                    a.h(charSequence);
                }
            }
            
            public void onSessionDestroyed() {
                final MediaControllerCompat.a a = this.a.get();
                if (a != null) {
                    a.j();
                }
            }
            
            public void onSessionEvent(final String s, final Bundle bundle) {
                MediaSessionCompat.b(bundle);
                final MediaControllerCompat.a a = this.a.get();
                if (a != null) {
                    if (a.c == null || Build$VERSION.SDK_INT >= 23) {
                        a.k(s, bundle);
                    }
                }
            }
        }
        
        private class b extends Handler
        {
            private static final int c = 1;
            private static final int d = 2;
            private static final int e = 3;
            private static final int f = 4;
            private static final int g = 5;
            private static final int h = 6;
            private static final int i = 7;
            private static final int j = 8;
            private static final int k = 9;
            private static final int l = 11;
            private static final int m = 12;
            private static final int n = 13;
            boolean a;
            
            b(final Looper looper) {
                super(looper);
                this.a = false;
            }
            
            public void handleMessage(final Message message) {
                if (!this.a) {
                    return;
                }
                switch (message.what) {
                    case 13: {
                        MediaControllerCompat.a.this.l();
                        break;
                    }
                    case 12: {
                        MediaControllerCompat.a.this.m((int)message.obj);
                        break;
                    }
                    case 11: {
                        MediaControllerCompat.a.this.c((boolean)message.obj);
                        break;
                    }
                    case 9: {
                        MediaControllerCompat.a.this.i((int)message.obj);
                        break;
                    }
                    case 8: {
                        MediaControllerCompat.a.this.j();
                        break;
                    }
                    case 7: {
                        final Bundle bundle = (Bundle)message.obj;
                        MediaSessionCompat.b(bundle);
                        MediaControllerCompat.a.this.d(bundle);
                        break;
                    }
                    case 6: {
                        MediaControllerCompat.a.this.h((CharSequence)message.obj);
                        break;
                    }
                    case 5: {
                        MediaControllerCompat.a.this.g((List<MediaSessionCompat.QueueItem>)message.obj);
                        break;
                    }
                    case 4: {
                        MediaControllerCompat.a.this.b((e)message.obj);
                        break;
                    }
                    case 3: {
                        MediaControllerCompat.a.this.e((MediaMetadataCompat)message.obj);
                        break;
                    }
                    case 2: {
                        MediaControllerCompat.a.this.f((PlaybackStateCompat)message.obj);
                        break;
                    }
                    case 1: {
                        final Bundle data = message.getData();
                        MediaSessionCompat.b(data);
                        MediaControllerCompat.a.this.k((String)message.obj, data);
                        break;
                    }
                }
            }
        }
        
        private static class c extends a.b
        {
            private final WeakReference<MediaControllerCompat.a> s;
            
            c(final MediaControllerCompat.a referent) {
                this.s = new WeakReference<MediaControllerCompat.a>(referent);
            }
            
            public void A0() throws RemoteException {
                final MediaControllerCompat.a a = this.s.get();
                if (a != null) {
                    a.n(13, null, null);
                }
            }
            
            public void B0(final Bundle bundle) throws RemoteException {
                final MediaControllerCompat.a a = this.s.get();
                if (a != null) {
                    a.n(7, bundle, null);
                }
            }
            
            public void C1(final int i) throws RemoteException {
                final MediaControllerCompat.a a = this.s.get();
                if (a != null) {
                    a.n(9, i, null);
                }
            }
            
            public void G0(final List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                final MediaControllerCompat.a a = this.s.get();
                if (a != null) {
                    a.n(5, list, null);
                }
            }
            
            public void O1(final int i) throws RemoteException {
                final MediaControllerCompat.a a = this.s.get();
                if (a != null) {
                    a.n(12, i, null);
                }
            }
            
            public void S(final String s, final Bundle bundle) throws RemoteException {
                final MediaControllerCompat.a a = this.s.get();
                if (a != null) {
                    a.n(1, s, bundle);
                }
            }
            
            public void a1(final boolean b) throws RemoteException {
                final MediaControllerCompat.a a = this.s.get();
                if (a != null) {
                    a.n(11, b, null);
                }
            }
            
            public void n1(final boolean b) throws RemoteException {
            }
            
            public void p1(final CharSequence charSequence) throws RemoteException {
                final MediaControllerCompat.a a = this.s.get();
                if (a != null) {
                    a.n(6, charSequence, null);
                }
            }
            
            public void s2(final PlaybackStateCompat playbackStateCompat) throws RemoteException {
                final MediaControllerCompat.a a = this.s.get();
                if (a != null) {
                    a.n(2, playbackStateCompat, null);
                }
            }
            
            public void v1() throws RemoteException {
                final MediaControllerCompat.a a = this.s.get();
                if (a != null) {
                    a.n(8, null, null);
                }
            }
            
            public void v2(final ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                final MediaControllerCompat.a a = this.s.get();
                if (a != null) {
                    e e;
                    if (parcelableVolumeInfo != null) {
                        e = new e(parcelableVolumeInfo.G, parcelableVolumeInfo.H, parcelableVolumeInfo.I, parcelableVolumeInfo.J, parcelableVolumeInfo.K);
                    }
                    else {
                        e = null;
                    }
                    a.n(4, e, null);
                }
            }
            
            public void x1(final MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                final MediaControllerCompat.a a = this.s.get();
                if (a != null) {
                    a.n(3, mediaMetadataCompat, null);
                }
            }
        }
    }
    
    interface b
    {
        void A(final MediaDescriptionCompat p0);
        
        int B();
        
        CharSequence C();
        
        Bundle E();
        
        int L();
        
        boolean M();
        
        List<MediaSessionCompat.QueueItem> O();
        
        int Q();
        
        e a();
        
        void b(final int p0, final int p1);
        
        void c(final MediaControllerCompat.a p0);
        
        boolean d(final KeyEvent p0);
        
        void e(final int p0, final int p1);
        
        void f(final MediaDescriptionCompat p0, final int p1);
        
        void g(final String p0, final Bundle p1, final ResultReceiver p2);
        
        Bundle getExtras();
        
        boolean h();
        
        PendingIntent i();
        
        f j();
        
        Object k();
        
        void l(final MediaControllerCompat.a p0, final Handler p1);
        
        MediaMetadataCompat u();
        
        PlaybackStateCompat v();
        
        long w();
        
        String x();
        
        void z(final MediaDescriptionCompat p0);
    }
    
    @p0(29)
    static class c extends MediaControllerImplApi21
    {
        c(final Context context, final MediaSessionCompat.Token token) {
            super(context, token);
        }
        
        @Override
        public Bundle E() {
            if (super.e != null) {
                return new Bundle(super.e);
            }
            final Bundle sessionInfo = super.a.getSessionInfo();
            super.e = sessionInfo;
            Bundle empty;
            if ((super.e = MediaSessionCompat.F(sessionInfo)) == null) {
                empty = Bundle.EMPTY;
            }
            else {
                empty = new Bundle(super.e);
            }
            return empty;
        }
    }
    
    static class d implements MediaControllerCompat.b
    {
        private b a;
        private f b;
        private Bundle c;
        
        d(final MediaSessionCompat.Token token) {
            this.a = b.b.H((IBinder)token.f());
        }
        
        @Override
        public void A(final MediaDescriptionCompat mediaDescriptionCompat) {
            try {
                if ((this.a.w() & 0x4L) == 0x0L) {
                    throw new UnsupportedOperationException("This session doesn't support queue management operations");
                }
                this.a.A(mediaDescriptionCompat);
            }
            catch (RemoteException ex) {
                Log.e("MediaControllerCompat", "Dead object in addQueueItem.", (Throwable)ex);
            }
        }
        
        @Override
        public int B() {
            try {
                return this.a.B();
            }
            catch (RemoteException ex) {
                Log.e("MediaControllerCompat", "Dead object in getRatingType.", (Throwable)ex);
                return 0;
            }
        }
        
        @Override
        public CharSequence C() {
            try {
                return this.a.C();
            }
            catch (RemoteException ex) {
                Log.e("MediaControllerCompat", "Dead object in getQueueTitle.", (Throwable)ex);
                return null;
            }
        }
        
        @Override
        public Bundle E() {
            try {
                this.c = this.a.E();
            }
            catch (RemoteException ex) {
                Log.d("MediaControllerCompat", "Dead object in getSessionInfo.", (Throwable)ex);
            }
            final Bundle f = MediaSessionCompat.F(this.c);
            this.c = f;
            Bundle empty;
            if (f == null) {
                empty = Bundle.EMPTY;
            }
            else {
                empty = new Bundle(this.c);
            }
            return empty;
        }
        
        @Override
        public int L() {
            try {
                return this.a.L();
            }
            catch (RemoteException ex) {
                Log.e("MediaControllerCompat", "Dead object in getShuffleMode.", (Throwable)ex);
                return -1;
            }
        }
        
        @Override
        public boolean M() {
            try {
                return this.a.M();
            }
            catch (RemoteException ex) {
                Log.e("MediaControllerCompat", "Dead object in isCaptioningEnabled.", (Throwable)ex);
                return false;
            }
        }
        
        @Override
        public List<MediaSessionCompat.QueueItem> O() {
            try {
                return this.a.O();
            }
            catch (RemoteException ex) {
                Log.e("MediaControllerCompat", "Dead object in getQueue.", (Throwable)ex);
                return null;
            }
        }
        
        @Override
        public int Q() {
            try {
                return this.a.Q();
            }
            catch (RemoteException ex) {
                Log.e("MediaControllerCompat", "Dead object in getRepeatMode.", (Throwable)ex);
                return -1;
            }
        }
        
        @Override
        public e a() {
            try {
                final ParcelableVolumeInfo h2 = this.a.h2();
                return new e(h2.G, h2.H, h2.I, h2.J, h2.K);
            }
            catch (RemoteException ex) {
                Log.e("MediaControllerCompat", "Dead object in getPlaybackInfo.", (Throwable)ex);
                return null;
            }
        }
        
        @Override
        public void b(final int n, final int n2) {
            try {
                this.a.r1(n, n2, null);
            }
            catch (RemoteException ex) {
                Log.e("MediaControllerCompat", "Dead object in adjustVolume.", (Throwable)ex);
            }
        }
        
        @Override
        public void c(final MediaControllerCompat.a a) {
            if (a != null) {
                try {
                    this.a.N0(a.c);
                    ((IInterface)this.a).asBinder().unlinkToDeath((IBinder$DeathRecipient)a, 0);
                }
                catch (RemoteException ex) {
                    Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", (Throwable)ex);
                }
                return;
            }
            throw new IllegalArgumentException("callback may not be null.");
        }
        
        @Override
        public boolean d(final KeyEvent keyEvent) {
            if (keyEvent != null) {
                try {
                    this.a.l1(keyEvent);
                }
                catch (RemoteException ex) {
                    Log.e("MediaControllerCompat", "Dead object in dispatchMediaButtonEvent.", (Throwable)ex);
                }
                return false;
            }
            throw new IllegalArgumentException("event may not be null.");
        }
        
        @Override
        public void e(final int n, final int n2) {
            try {
                this.a.e0(n, n2, null);
            }
            catch (RemoteException ex) {
                Log.e("MediaControllerCompat", "Dead object in setVolumeTo.", (Throwable)ex);
            }
        }
        
        @Override
        public void f(final MediaDescriptionCompat mediaDescriptionCompat, final int n) {
            try {
                if ((this.a.w() & 0x4L) == 0x0L) {
                    throw new UnsupportedOperationException("This session doesn't support queue management operations");
                }
                this.a.w1(mediaDescriptionCompat, n);
            }
            catch (RemoteException ex) {
                Log.e("MediaControllerCompat", "Dead object in addQueueItemAt.", (Throwable)ex);
            }
        }
        
        @Override
        public void g(final String s, final Bundle bundle, final ResultReceiver resultReceiver) {
            try {
                final b a = this.a;
                MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper;
                if (resultReceiver == null) {
                    resultReceiverWrapper = null;
                }
                else {
                    resultReceiverWrapper = new MediaSessionCompat.ResultReceiverWrapper(resultReceiver);
                }
                a.U1(s, bundle, resultReceiverWrapper);
            }
            catch (RemoteException ex) {
                Log.e("MediaControllerCompat", "Dead object in sendCommand.", (Throwable)ex);
            }
        }
        
        @Override
        public Bundle getExtras() {
            try {
                return this.a.getExtras();
            }
            catch (RemoteException ex) {
                Log.e("MediaControllerCompat", "Dead object in getExtras.", (Throwable)ex);
                return null;
            }
        }
        
        @Override
        public boolean h() {
            return true;
        }
        
        @Override
        public PendingIntent i() {
            try {
                return this.a.r0();
            }
            catch (RemoteException ex) {
                Log.e("MediaControllerCompat", "Dead object in getSessionActivity.", (Throwable)ex);
                return null;
            }
        }
        
        @Override
        public f j() {
            if (this.b == null) {
                this.b = new k(this.a);
            }
            return this.b;
        }
        
        @Override
        public Object k() {
            return null;
        }
        
        @Override
        public void l(final MediaControllerCompat.a a, final Handler handler) {
            if (a != null) {
                try {
                    ((IInterface)this.a).asBinder().linkToDeath((IBinder$DeathRecipient)a, 0);
                    this.a.W(a.c);
                    a.n(13, null, null);
                }
                catch (RemoteException ex) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", (Throwable)ex);
                    a.n(8, null, null);
                }
                return;
            }
            throw new IllegalArgumentException("callback may not be null.");
        }
        
        @Override
        public MediaMetadataCompat u() {
            try {
                return this.a.u();
            }
            catch (RemoteException ex) {
                Log.e("MediaControllerCompat", "Dead object in getMetadata.", (Throwable)ex);
                return null;
            }
        }
        
        @Override
        public PlaybackStateCompat v() {
            try {
                return this.a.v();
            }
            catch (RemoteException ex) {
                Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", (Throwable)ex);
                return null;
            }
        }
        
        @Override
        public long w() {
            try {
                return this.a.w();
            }
            catch (RemoteException ex) {
                Log.e("MediaControllerCompat", "Dead object in getFlags.", (Throwable)ex);
                return 0L;
            }
        }
        
        @Override
        public String x() {
            try {
                return this.a.x();
            }
            catch (RemoteException ex) {
                Log.e("MediaControllerCompat", "Dead object in getPackageName.", (Throwable)ex);
                return null;
            }
        }
        
        @Override
        public void z(final MediaDescriptionCompat mediaDescriptionCompat) {
            try {
                if ((this.a.w() & 0x4L) == 0x0L) {
                    throw new UnsupportedOperationException("This session doesn't support queue management operations");
                }
                this.a.z(mediaDescriptionCompat);
            }
            catch (RemoteException ex) {
                Log.e("MediaControllerCompat", "Dead object in removeQueueItem.", (Throwable)ex);
            }
        }
    }
    
    public static final class e
    {
        public static final int f = 1;
        public static final int g = 2;
        private final int a;
        private final AudioAttributesCompat b;
        private final int c;
        private final int d;
        private final int e;
        
        e(final int n, final int n2, final int n3, final int n4, final int n5) {
            this(n, new AudioAttributesCompat.d().d(n2).a(), n3, n4, n5);
        }
        
        e(final int a, @j0 final AudioAttributesCompat b, final int c, final int d, final int e) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
        }
        
        @j0
        public AudioAttributesCompat a() {
            return this.b;
        }
        
        @Deprecated
        public int b() {
            return this.b.a();
        }
        
        public int c() {
            return this.e;
        }
        
        public int d() {
            return this.d;
        }
        
        public int e() {
            return this.a;
        }
        
        public int f() {
            return this.c;
        }
    }
    
    public abstract static class f
    {
        @Deprecated
        public static final String a = "android.media.session.extra.LEGACY_STREAM_TYPE";
        
        f() {
        }
        
        public abstract void a();
        
        public abstract void b();
        
        public abstract void c();
        
        public abstract void d(final String p0, final Bundle p1);
        
        public abstract void e(final String p0, final Bundle p1);
        
        public abstract void f(final Uri p0, final Bundle p1);
        
        public abstract void g();
        
        public abstract void h(final String p0, final Bundle p1);
        
        public abstract void i(final String p0, final Bundle p1);
        
        public abstract void j(final Uri p0, final Bundle p1);
        
        public abstract void k();
        
        public abstract void l(final long p0);
        
        public abstract void m(final PlaybackStateCompat.CustomAction p0, final Bundle p1);
        
        public abstract void n(final String p0, final Bundle p1);
        
        public abstract void o(final boolean p0);
        
        public void p(final float n) {
        }
        
        public abstract void q(final RatingCompat p0);
        
        public abstract void r(final RatingCompat p0, final Bundle p1);
        
        public abstract void s(final int p0);
        
        public abstract void t(final int p0);
        
        public abstract void u();
        
        public abstract void v();
        
        public abstract void w(final long p0);
        
        public abstract void x();
    }
    
    @p0(21)
    static class g extends f
    {
        protected final MediaController$TransportControls b;
        
        g(final MediaController$TransportControls b) {
            this.b = b;
        }
        
        @Override
        public void a() {
            this.b.fastForward();
        }
        
        @Override
        public void b() {
            this.b.pause();
        }
        
        @Override
        public void c() {
            this.b.play();
        }
        
        @Override
        public void d(final String s, final Bundle bundle) {
            this.b.playFromMediaId(s, bundle);
        }
        
        @Override
        public void e(final String s, final Bundle bundle) {
            this.b.playFromSearch(s, bundle);
        }
        
        @Override
        public void f(final Uri uri, final Bundle bundle) {
            if (uri != null && !Uri.EMPTY.equals((Object)uri)) {
                final Bundle bundle2 = new Bundle();
                bundle2.putParcelable("android.support.v4.media.session.action.ARGUMENT_URI", (Parcelable)uri);
                bundle2.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
                this.n("android.support.v4.media.session.action.PLAY_FROM_URI", bundle2);
                return;
            }
            throw new IllegalArgumentException("You must specify a non-empty Uri for playFromUri.");
        }
        
        @Override
        public void g() {
            this.n("android.support.v4.media.session.action.PREPARE", null);
        }
        
        @Override
        public void h(final String s, final Bundle bundle) {
            final Bundle bundle2 = new Bundle();
            bundle2.putString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID", s);
            bundle2.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
            this.n("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID", bundle2);
        }
        
        @Override
        public void i(final String s, final Bundle bundle) {
            final Bundle bundle2 = new Bundle();
            bundle2.putString("android.support.v4.media.session.action.ARGUMENT_QUERY", s);
            bundle2.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
            this.n("android.support.v4.media.session.action.PREPARE_FROM_SEARCH", bundle2);
        }
        
        @Override
        public void j(final Uri uri, final Bundle bundle) {
            final Bundle bundle2 = new Bundle();
            bundle2.putParcelable("android.support.v4.media.session.action.ARGUMENT_URI", (Parcelable)uri);
            bundle2.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
            this.n("android.support.v4.media.session.action.PREPARE_FROM_URI", bundle2);
        }
        
        @Override
        public void k() {
            this.b.rewind();
        }
        
        @Override
        public void l(final long n) {
            this.b.seekTo(n);
        }
        
        @Override
        public void m(final PlaybackStateCompat.CustomAction customAction, final Bundle bundle) {
            MediaControllerCompat.G(customAction.b(), bundle);
            this.b.sendCustomAction(customAction.b(), bundle);
        }
        
        @Override
        public void n(final String s, final Bundle bundle) {
            MediaControllerCompat.G(s, bundle);
            this.b.sendCustomAction(s, bundle);
        }
        
        @Override
        public void o(final boolean b) {
            final Bundle bundle = new Bundle();
            bundle.putBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED", b);
            this.n("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED", bundle);
        }
        
        @Override
        public void p(final float n) {
            if (n != 0.0f) {
                final Bundle bundle = new Bundle();
                bundle.putFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", n);
                this.n("android.support.v4.media.session.action.SET_PLAYBACK_SPEED", bundle);
                return;
            }
            throw new IllegalArgumentException("speed must not be zero");
        }
        
        @Override
        public void q(final RatingCompat ratingCompat) {
            final MediaController$TransportControls b = this.b;
            Rating rating;
            if (ratingCompat != null) {
                rating = (Rating)ratingCompat.c();
            }
            else {
                rating = null;
            }
            b.setRating(rating);
        }
        
        @Override
        public void r(final RatingCompat ratingCompat, final Bundle bundle) {
            final Bundle bundle2 = new Bundle();
            bundle2.putParcelable("android.support.v4.media.session.action.ARGUMENT_RATING", (Parcelable)ratingCompat);
            bundle2.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
            this.n("android.support.v4.media.session.action.SET_RATING", bundle2);
        }
        
        @Override
        public void s(final int n) {
            final Bundle bundle = new Bundle();
            bundle.putInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE", n);
            this.n("android.support.v4.media.session.action.SET_REPEAT_MODE", bundle);
        }
        
        @Override
        public void t(final int n) {
            final Bundle bundle = new Bundle();
            bundle.putInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE", n);
            this.n("android.support.v4.media.session.action.SET_SHUFFLE_MODE", bundle);
        }
        
        @Override
        public void u() {
            this.b.skipToNext();
        }
        
        @Override
        public void v() {
            this.b.skipToPrevious();
        }
        
        @Override
        public void w(final long n) {
            this.b.skipToQueueItem(n);
        }
        
        @Override
        public void x() {
            this.b.stop();
        }
    }
    
    @p0(23)
    static class h extends g
    {
        h(final MediaController$TransportControls mediaController$TransportControls) {
            super(mediaController$TransportControls);
        }
        
        @Override
        public void f(final Uri uri, final Bundle bundle) {
            super.b.playFromUri(uri, bundle);
        }
    }
    
    @p0(24)
    static class i extends h
    {
        i(final MediaController$TransportControls mediaController$TransportControls) {
            super(mediaController$TransportControls);
        }
        
        @Override
        public void g() {
            super.b.prepare();
        }
        
        @Override
        public void h(final String s, final Bundle bundle) {
            super.b.prepareFromMediaId(s, bundle);
        }
        
        @Override
        public void i(final String s, final Bundle bundle) {
            super.b.prepareFromSearch(s, bundle);
        }
        
        @Override
        public void j(final Uri uri, final Bundle bundle) {
            super.b.prepareFromUri(uri, bundle);
        }
    }
    
    @p0(29)
    static class j extends i
    {
        j(final MediaController$TransportControls mediaController$TransportControls) {
            super(mediaController$TransportControls);
        }
        
        @Override
        public void p(final float playbackSpeed) {
            if (playbackSpeed != 0.0f) {
                super.b.setPlaybackSpeed(playbackSpeed);
                return;
            }
            throw new IllegalArgumentException("speed must not be zero");
        }
    }
    
    static class k extends f
    {
        private b b;
        
        public k(final b b) {
            this.b = b;
        }
        
        @Override
        public void a() {
            try {
                this.b.V0();
            }
            catch (RemoteException ex) {
                Log.e("MediaControllerCompat", "Dead object in fastForward.", (Throwable)ex);
            }
        }
        
        @Override
        public void b() {
            try {
                this.b.D();
            }
            catch (RemoteException ex) {
                Log.e("MediaControllerCompat", "Dead object in pause.", (Throwable)ex);
            }
        }
        
        @Override
        public void c() {
            try {
                this.b.Q1();
            }
            catch (RemoteException ex) {
                Log.e("MediaControllerCompat", "Dead object in play.", (Throwable)ex);
            }
        }
        
        @Override
        public void d(final String s, final Bundle bundle) {
            try {
                this.b.Q0(s, bundle);
            }
            catch (RemoteException ex) {
                Log.e("MediaControllerCompat", "Dead object in playFromMediaId.", (Throwable)ex);
            }
        }
        
        @Override
        public void e(final String s, final Bundle bundle) {
            try {
                this.b.R0(s, bundle);
            }
            catch (RemoteException ex) {
                Log.e("MediaControllerCompat", "Dead object in playFromSearch.", (Throwable)ex);
            }
        }
        
        @Override
        public void f(final Uri uri, final Bundle bundle) {
            try {
                this.b.X0(uri, bundle);
            }
            catch (RemoteException ex) {
                Log.e("MediaControllerCompat", "Dead object in playFromUri.", (Throwable)ex);
            }
        }
        
        @Override
        public void g() {
            try {
                this.b.z0();
            }
            catch (RemoteException ex) {
                Log.e("MediaControllerCompat", "Dead object in prepare.", (Throwable)ex);
            }
        }
        
        @Override
        public void h(final String s, final Bundle bundle) {
            try {
                this.b.M0(s, bundle);
            }
            catch (RemoteException ex) {
                Log.e("MediaControllerCompat", "Dead object in prepareFromMediaId.", (Throwable)ex);
            }
        }
        
        @Override
        public void i(final String s, final Bundle bundle) {
            try {
                this.b.u0(s, bundle);
            }
            catch (RemoteException ex) {
                Log.e("MediaControllerCompat", "Dead object in prepareFromSearch.", (Throwable)ex);
            }
        }
        
        @Override
        public void j(final Uri uri, final Bundle bundle) {
            try {
                this.b.g0(uri, bundle);
            }
            catch (RemoteException ex) {
                Log.e("MediaControllerCompat", "Dead object in prepareFromUri.", (Throwable)ex);
            }
        }
        
        @Override
        public void k() {
            try {
                this.b.V1();
            }
            catch (RemoteException ex) {
                Log.e("MediaControllerCompat", "Dead object in rewind.", (Throwable)ex);
            }
        }
        
        @Override
        public void l(final long n) {
            try {
                this.b.Z0(n);
            }
            catch (RemoteException ex) {
                Log.e("MediaControllerCompat", "Dead object in seekTo.", (Throwable)ex);
            }
        }
        
        @Override
        public void m(final PlaybackStateCompat.CustomAction customAction, final Bundle bundle) {
            this.n(customAction.b(), bundle);
        }
        
        @Override
        public void n(final String s, final Bundle bundle) {
            MediaControllerCompat.G(s, bundle);
            try {
                this.b.T(s, bundle);
            }
            catch (RemoteException ex) {
                Log.e("MediaControllerCompat", "Dead object in sendCustomAction.", (Throwable)ex);
            }
        }
        
        @Override
        public void o(final boolean b) {
            try {
                this.b.K(b);
            }
            catch (RemoteException ex) {
                Log.e("MediaControllerCompat", "Dead object in setCaptioningEnabled.", (Throwable)ex);
            }
        }
        
        @Override
        public void p(final float n) {
            if (n != 0.0f) {
                try {
                    this.b.i1(n);
                }
                catch (RemoteException ex) {
                    Log.e("MediaControllerCompat", "Dead object in setPlaybackSpeed.", (Throwable)ex);
                }
                return;
            }
            throw new IllegalArgumentException("speed must not be zero");
        }
        
        @Override
        public void q(final RatingCompat ratingCompat) {
            try {
                this.b.b0(ratingCompat);
            }
            catch (RemoteException ex) {
                Log.e("MediaControllerCompat", "Dead object in setRating.", (Throwable)ex);
            }
        }
        
        @Override
        public void r(final RatingCompat ratingCompat, final Bundle bundle) {
            try {
                this.b.t1(ratingCompat, bundle);
            }
            catch (RemoteException ex) {
                Log.e("MediaControllerCompat", "Dead object in setRating.", (Throwable)ex);
            }
        }
        
        @Override
        public void s(final int n) {
            try {
                this.b.P(n);
            }
            catch (RemoteException ex) {
                Log.e("MediaControllerCompat", "Dead object in setRepeatMode.", (Throwable)ex);
            }
        }
        
        @Override
        public void t(final int n) {
            try {
                this.b.R(n);
            }
            catch (RemoteException ex) {
                Log.e("MediaControllerCompat", "Dead object in setShuffleMode.", (Throwable)ex);
            }
        }
        
        @Override
        public void u() {
            try {
                this.b.next();
            }
            catch (RemoteException ex) {
                Log.e("MediaControllerCompat", "Dead object in skipToNext.", (Throwable)ex);
            }
        }
        
        @Override
        public void v() {
            try {
                this.b.previous();
            }
            catch (RemoteException ex) {
                Log.e("MediaControllerCompat", "Dead object in skipToPrevious.", (Throwable)ex);
            }
        }
        
        @Override
        public void w(final long n) {
            try {
                this.b.f2(n);
            }
            catch (RemoteException ex) {
                Log.e("MediaControllerCompat", "Dead object in skipToQueueItem.", (Throwable)ex);
            }
        }
        
        @Override
        public void x() {
            try {
                this.b.stop();
            }
            catch (RemoteException ex) {
                Log.e("MediaControllerCompat", "Dead object in stop.", (Throwable)ex);
            }
        }
    }
}
