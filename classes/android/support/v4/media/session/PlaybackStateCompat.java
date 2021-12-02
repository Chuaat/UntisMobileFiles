// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.media.session;

import androidx.annotation.r;
import androidx.annotation.p0;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import android.media.session.PlaybackState$CustomAction$Builder;
import android.media.session.PlaybackState$Builder;
import androidx.annotation.k0;
import androidx.annotation.t0;
import android.os.SystemClock;
import java.util.Iterator;
import android.media.session.PlaybackState$CustomAction;
import android.os.Build$VERSION;
import android.text.TextUtils;
import java.util.Collection;
import java.util.ArrayList;
import android.os.Parcel;
import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.List;
import android.os.Parcelable$Creator;
import android.annotation.SuppressLint;
import android.os.Parcelable;

@SuppressLint({ "BanParcelableUsage" })
public final class PlaybackStateCompat implements Parcelable
{
    public static final int A0 = 11;
    public static final long B0 = -1L;
    public static final int C0 = -1;
    public static final Parcelable$Creator<PlaybackStateCompat> CREATOR;
    public static final int D0 = 0;
    public static final int E0 = 1;
    public static final int F0 = 2;
    public static final int G0 = 3;
    public static final int H0 = -1;
    public static final int I0 = 0;
    public static final int J0 = 1;
    public static final int K0 = 2;
    public static final int L0 = 0;
    public static final int M0 = 1;
    public static final int N0 = 2;
    public static final int O0 = 3;
    public static final int P0 = 4;
    public static final int Q0 = 5;
    public static final int R0 = 6;
    public static final long S = 1L;
    public static final int S0 = 7;
    public static final long T = 2L;
    public static final int T0 = 8;
    public static final long U = 4L;
    public static final int U0 = 9;
    public static final long V = 8L;
    public static final int V0 = 10;
    public static final long W = 16L;
    public static final int W0 = 11;
    public static final long X = 32L;
    private static final int X0 = 127;
    public static final long Y = 64L;
    private static final int Y0 = 126;
    public static final long Z = 128L;
    public static final long a0 = 256L;
    public static final long b0 = 512L;
    public static final long c0 = 1024L;
    public static final long d0 = 2048L;
    public static final long e0 = 4096L;
    public static final long f0 = 8192L;
    public static final long g0 = 16384L;
    public static final long h0 = 32768L;
    public static final long i0 = 65536L;
    public static final long j0 = 131072L;
    public static final long k0 = 262144L;
    @Deprecated
    public static final long l0 = 524288L;
    public static final long m0 = 1048576L;
    public static final long n0 = 2097152L;
    public static final long o0 = 4194304L;
    public static final int p0 = 0;
    public static final int q0 = 1;
    public static final int r0 = 2;
    public static final int s0 = 3;
    public static final int t0 = 4;
    public static final int u0 = 5;
    public static final int v0 = 6;
    public static final int w0 = 7;
    public static final int x0 = 8;
    public static final int y0 = 9;
    public static final int z0 = 10;
    final int G;
    final long H;
    final long I;
    final float J;
    final long K;
    final int L;
    final CharSequence M;
    final long N;
    List<CustomAction> O;
    final long P;
    final Bundle Q;
    private PlaybackState R;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<PlaybackStateCompat>() {
            public PlaybackStateCompat a(final Parcel parcel) {
                return new PlaybackStateCompat(parcel);
            }
            
            public PlaybackStateCompat[] b(final int n) {
                return new PlaybackStateCompat[n];
            }
        };
    }
    
    PlaybackStateCompat(final int g, final long h, final long i, final float j, final long k, final int l, final CharSequence m, final long n, final List<CustomAction> c, final long p11, final Bundle q) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
        this.L = l;
        this.M = m;
        this.N = n;
        this.O = new ArrayList<CustomAction>(c);
        this.P = p11;
        this.Q = q;
    }
    
    PlaybackStateCompat(final Parcel parcel) {
        this.G = parcel.readInt();
        this.H = parcel.readLong();
        this.J = parcel.readFloat();
        this.N = parcel.readLong();
        this.I = parcel.readLong();
        this.K = parcel.readLong();
        this.M = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.O = (List<CustomAction>)parcel.createTypedArrayList((Parcelable$Creator)CustomAction.CREATOR);
        this.P = parcel.readLong();
        this.Q = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.L = parcel.readInt();
    }
    
    public static PlaybackStateCompat a(final Object o) {
        final PlaybackStateCompat playbackStateCompat = null;
        final Bundle bundle = null;
        PlaybackStateCompat playbackStateCompat2 = playbackStateCompat;
        if (o != null) {
            playbackStateCompat2 = playbackStateCompat;
            if (Build$VERSION.SDK_INT >= 21) {
                final PlaybackState r = (PlaybackState)o;
                final List<PlaybackState$CustomAction> j = c.j(r);
                ArrayList<CustomAction> list;
                if (j != null) {
                    list = new ArrayList<CustomAction>(j.size());
                    final Iterator<PlaybackState$CustomAction> iterator = j.iterator();
                    while (iterator.hasNext()) {
                        list.add(CustomAction.a(iterator.next()));
                    }
                }
                else {
                    list = null;
                }
                Bundle a = bundle;
                if (Build$VERSION.SDK_INT >= 22) {
                    a = d.a(r);
                    MediaSessionCompat.b(a);
                }
                playbackStateCompat2 = new PlaybackStateCompat(c.r(r), c.q(r), c.i(r), c.p(r), c.g(r), 0, c.k(r), c.n(r), list, c.h(r), a);
                playbackStateCompat2.R = r;
            }
        }
        return playbackStateCompat2;
    }
    
    public static int o(final long n) {
        if (n == 4L) {
            return 126;
        }
        if (n == 2L) {
            return 127;
        }
        if (n == 32L) {
            return 87;
        }
        if (n == 16L) {
            return 88;
        }
        if (n == 1L) {
            return 86;
        }
        if (n == 64L) {
            return 90;
        }
        if (n == 8L) {
            return 89;
        }
        if (n == 512L) {
            return 85;
        }
        return 0;
    }
    
    public long b() {
        return this.K;
    }
    
    public long c() {
        return this.P;
    }
    
    public long d() {
        return this.I;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @t0({ androidx.annotation.t0.a.I })
    public long e(final Long n) {
        final long h = this.H;
        final float j = this.J;
        long longValue;
        if (n != null) {
            longValue = n;
        }
        else {
            longValue = SystemClock.elapsedRealtime() - this.N;
        }
        return Math.max(0L, h + (long)(j * longValue));
    }
    
    public List<CustomAction> f() {
        return this.O;
    }
    
    public int g() {
        return this.L;
    }
    
    public CharSequence h() {
        return this.M;
    }
    
    @k0
    public Bundle i() {
        return this.Q;
    }
    
    public long j() {
        return this.N;
    }
    
    public float k() {
        return this.J;
    }
    
    public Object l() {
        if (this.R == null && Build$VERSION.SDK_INT >= 21) {
            final PlaybackState$Builder d = c.d();
            c.x(d, this.G, this.H, this.J, this.N);
            c.u(d, this.I);
            c.s(d, this.K);
            c.v(d, this.M);
            final Iterator<CustomAction> iterator = this.O.iterator();
            while (iterator.hasNext()) {
                c.a(d, (PlaybackState$CustomAction)iterator.next().c());
            }
            c.t(d, this.P);
            if (Build$VERSION.SDK_INT >= 22) {
                PlaybackStateCompat.d.b(d, this.Q);
            }
            this.R = c.c(d);
        }
        return this.R;
    }
    
    public long m() {
        return this.H;
    }
    
    public int n() {
        return this.G;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PlaybackState {");
        sb.append("state=");
        sb.append(this.G);
        sb.append(", position=");
        sb.append(this.H);
        sb.append(", buffered position=");
        sb.append(this.I);
        sb.append(", speed=");
        sb.append(this.J);
        sb.append(", updated=");
        sb.append(this.N);
        sb.append(", actions=");
        sb.append(this.K);
        sb.append(", error code=");
        sb.append(this.L);
        sb.append(", error message=");
        sb.append(this.M);
        sb.append(", custom actions=");
        sb.append(this.O);
        sb.append(", active item id=");
        sb.append(this.P);
        sb.append("}");
        return sb.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.G);
        parcel.writeLong(this.H);
        parcel.writeFloat(this.J);
        parcel.writeLong(this.N);
        parcel.writeLong(this.I);
        parcel.writeLong(this.K);
        TextUtils.writeToParcel(this.M, parcel, n);
        parcel.writeTypedList((List)this.O);
        parcel.writeLong(this.P);
        parcel.writeBundle(this.Q);
        parcel.writeInt(this.L);
    }
    
    public static final class CustomAction implements Parcelable
    {
        public static final Parcelable$Creator<CustomAction> CREATOR;
        private final String G;
        private final CharSequence H;
        private final int I;
        private final Bundle J;
        private PlaybackState$CustomAction K;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator<CustomAction>() {
                public CustomAction a(final Parcel parcel) {
                    return new CustomAction(parcel);
                }
                
                public CustomAction[] b(final int n) {
                    return new CustomAction[n];
                }
            };
        }
        
        CustomAction(final Parcel parcel) {
            this.G = parcel.readString();
            this.H = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.I = parcel.readInt();
            this.J = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
        
        CustomAction(final String g, final CharSequence h, final int i, final Bundle j) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
        }
        
        public static CustomAction a(final Object o) {
            if (o != null && Build$VERSION.SDK_INT >= 21) {
                final PlaybackState$CustomAction k = (PlaybackState$CustomAction)o;
                final Bundle l = c.l(k);
                MediaSessionCompat.b(l);
                final CustomAction customAction = new CustomAction(c.f(k), c.o(k), c.m(k), l);
                customAction.K = k;
                return customAction;
            }
            return null;
        }
        
        public String b() {
            return this.G;
        }
        
        public Object c() {
            PlaybackState$CustomAction playbackState$CustomAction2;
            final PlaybackState$CustomAction playbackState$CustomAction = playbackState$CustomAction2 = this.K;
            if (playbackState$CustomAction == null) {
                if (Build$VERSION.SDK_INT < 21) {
                    playbackState$CustomAction2 = playbackState$CustomAction;
                }
                else {
                    final PlaybackState$CustomAction$Builder e = c.e(this.G, this.H, this.I);
                    c.w(e, this.J);
                    playbackState$CustomAction2 = c.b(e);
                }
            }
            return playbackState$CustomAction2;
        }
        
        public Bundle d() {
            return this.J;
        }
        
        public int describeContents() {
            return 0;
        }
        
        public int e() {
            return this.I;
        }
        
        public CharSequence f() {
            return this.H;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("Action:mName='");
            sb.append((Object)this.H);
            sb.append(", mIcon=");
            sb.append(this.I);
            sb.append(", mExtras=");
            sb.append(this.J);
            return sb.toString();
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            parcel.writeString(this.G);
            TextUtils.writeToParcel(this.H, parcel, n);
            parcel.writeInt(this.I);
            parcel.writeBundle(this.J);
        }
        
        public static final class b
        {
            private final String a;
            private final CharSequence b;
            private final int c;
            private Bundle d;
            
            public b(final String a, final CharSequence b, final int c) {
                if (TextUtils.isEmpty((CharSequence)a)) {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                }
                if (TextUtils.isEmpty(b)) {
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                }
                if (c != 0) {
                    this.a = a;
                    this.b = b;
                    this.c = c;
                    return;
                }
                throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
            }
            
            public CustomAction a() {
                return new CustomAction(this.a, this.b, this.c, this.d);
            }
            
            public b b(final Bundle d) {
                this.d = d;
                return this;
            }
        }
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ androidx.annotation.t0.a.I })
    public @interface b {
    }
    
    @p0(21)
    private static class c
    {
        @r
        static void a(final PlaybackState$Builder playbackState$Builder, final PlaybackState$CustomAction playbackState$CustomAction) {
            playbackState$Builder.addCustomAction(playbackState$CustomAction);
        }
        
        @r
        static PlaybackState$CustomAction b(final PlaybackState$CustomAction$Builder playbackState$CustomAction$Builder) {
            return playbackState$CustomAction$Builder.build();
        }
        
        @r
        static PlaybackState c(final PlaybackState$Builder playbackState$Builder) {
            return playbackState$Builder.build();
        }
        
        @r
        static PlaybackState$Builder d() {
            return new PlaybackState$Builder();
        }
        
        @r
        static PlaybackState$CustomAction$Builder e(final String s, final CharSequence charSequence, final int n) {
            return new PlaybackState$CustomAction$Builder(s, charSequence, n);
        }
        
        @r
        static String f(final PlaybackState$CustomAction playbackState$CustomAction) {
            return playbackState$CustomAction.getAction();
        }
        
        @r
        static long g(final PlaybackState playbackState) {
            return playbackState.getActions();
        }
        
        @r
        static long h(final PlaybackState playbackState) {
            return playbackState.getActiveQueueItemId();
        }
        
        @r
        static long i(final PlaybackState playbackState) {
            return playbackState.getBufferedPosition();
        }
        
        @r
        static List<PlaybackState$CustomAction> j(final PlaybackState playbackState) {
            return (List<PlaybackState$CustomAction>)playbackState.getCustomActions();
        }
        
        @r
        static CharSequence k(final PlaybackState playbackState) {
            return playbackState.getErrorMessage();
        }
        
        @r
        static Bundle l(final PlaybackState$CustomAction playbackState$CustomAction) {
            return playbackState$CustomAction.getExtras();
        }
        
        @r
        static int m(final PlaybackState$CustomAction playbackState$CustomAction) {
            return playbackState$CustomAction.getIcon();
        }
        
        @r
        static long n(final PlaybackState playbackState) {
            return playbackState.getLastPositionUpdateTime();
        }
        
        @r
        static CharSequence o(final PlaybackState$CustomAction playbackState$CustomAction) {
            return playbackState$CustomAction.getName();
        }
        
        @r
        static float p(final PlaybackState playbackState) {
            return playbackState.getPlaybackSpeed();
        }
        
        @r
        static long q(final PlaybackState playbackState) {
            return playbackState.getPosition();
        }
        
        @r
        static int r(final PlaybackState playbackState) {
            return playbackState.getState();
        }
        
        @r
        static void s(final PlaybackState$Builder playbackState$Builder, final long actions) {
            playbackState$Builder.setActions(actions);
        }
        
        @r
        static void t(final PlaybackState$Builder playbackState$Builder, final long activeQueueItemId) {
            playbackState$Builder.setActiveQueueItemId(activeQueueItemId);
        }
        
        @r
        static void u(final PlaybackState$Builder playbackState$Builder, final long bufferedPosition) {
            playbackState$Builder.setBufferedPosition(bufferedPosition);
        }
        
        @r
        static void v(final PlaybackState$Builder playbackState$Builder, final CharSequence errorMessage) {
            playbackState$Builder.setErrorMessage(errorMessage);
        }
        
        @r
        static void w(final PlaybackState$CustomAction$Builder playbackState$CustomAction$Builder, final Bundle extras) {
            playbackState$CustomAction$Builder.setExtras(extras);
        }
        
        @r
        static void x(final PlaybackState$Builder playbackState$Builder, final int n, final long n2, final float n3, final long n4) {
            playbackState$Builder.setState(n, n2, n3, n4);
        }
    }
    
    @p0(22)
    private static class d
    {
        @r
        static Bundle a(final PlaybackState playbackState) {
            return playbackState.getExtras();
        }
        
        @r
        static void b(final PlaybackState$Builder playbackState$Builder, final Bundle extras) {
            playbackState$Builder.setExtras(extras);
        }
    }
    
    public static final class e
    {
        private final List<CustomAction> a;
        private int b;
        private long c;
        private long d;
        private float e;
        private long f;
        private int g;
        private CharSequence h;
        private long i;
        private long j;
        private Bundle k;
        
        public e() {
            this.a = new ArrayList<CustomAction>();
            this.j = -1L;
        }
        
        public e(final PlaybackStateCompat playbackStateCompat) {
            final ArrayList<Object> a = new ArrayList<Object>();
            this.a = (List<CustomAction>)a;
            this.j = -1L;
            this.b = playbackStateCompat.G;
            this.c = playbackStateCompat.H;
            this.e = playbackStateCompat.J;
            this.i = playbackStateCompat.N;
            this.d = playbackStateCompat.I;
            this.f = playbackStateCompat.K;
            this.g = playbackStateCompat.L;
            this.h = playbackStateCompat.M;
            final List<CustomAction> o = playbackStateCompat.O;
            if (o != null) {
                a.addAll(o);
            }
            this.j = playbackStateCompat.P;
            this.k = playbackStateCompat.Q;
        }
        
        public e a(final CustomAction customAction) {
            if (customAction != null) {
                this.a.add(customAction);
                return this;
            }
            throw new IllegalArgumentException("You may not add a null CustomAction to PlaybackStateCompat");
        }
        
        public e b(final String s, final String s2, final int n) {
            return this.a(new CustomAction(s, s2, n, null));
        }
        
        public PlaybackStateCompat c() {
            return new PlaybackStateCompat(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.a, this.j, this.k);
        }
        
        public e d(final long f) {
            this.f = f;
            return this;
        }
        
        public e e(final long j) {
            this.j = j;
            return this;
        }
        
        public e f(final long d) {
            this.d = d;
            return this;
        }
        
        public e g(final int g, final CharSequence h) {
            this.g = g;
            this.h = h;
            return this;
        }
        
        @Deprecated
        public e h(final CharSequence h) {
            this.h = h;
            return this;
        }
        
        public e i(final Bundle k) {
            this.k = k;
            return this;
        }
        
        public e j(final int n, final long n2, final float n3) {
            return this.k(n, n2, n3, SystemClock.elapsedRealtime());
        }
        
        public e k(final int b, final long c, final float e, final long i) {
            this.b = b;
            this.c = c;
            this.i = i;
            this.e = e;
            return this;
        }
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ androidx.annotation.t0.a.G })
    public @interface f {
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ androidx.annotation.t0.a.I })
    public @interface g {
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ androidx.annotation.t0.a.I })
    public @interface h {
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ androidx.annotation.t0.a.I })
    public @interface i {
    }
}
