// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.media;

import androidx.annotation.r;
import androidx.annotation.p0;
import android.media.MediaDescription$Builder;
import androidx.annotation.k0;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.os.Build$VERSION;
import android.os.Parcel;
import android.media.MediaDescription;
import android.os.Bundle;
import android.net.Uri;
import android.graphics.Bitmap;
import androidx.annotation.t0;
import android.os.Parcelable$Creator;
import android.annotation.SuppressLint;
import android.os.Parcelable;

@SuppressLint({ "BanParcelableUsage" })
public final class MediaDescriptionCompat implements Parcelable
{
    public static final Parcelable$Creator<MediaDescriptionCompat> CREATOR;
    private static final String P = "MediaDescriptionCompat";
    public static final String Q = "android.media.extra.BT_FOLDER_TYPE";
    public static final long R = 0L;
    public static final long S = 1L;
    public static final long T = 2L;
    public static final long U = 3L;
    public static final long V = 4L;
    public static final long W = 5L;
    public static final long X = 6L;
    public static final String Y = "android.media.extra.DOWNLOAD_STATUS";
    public static final long Z = 0L;
    public static final long a0 = 1L;
    public static final long b0 = 2L;
    @t0({ t0.a.G })
    public static final String c0 = "android.support.v4.media.description.MEDIA_URI";
    @t0({ t0.a.G })
    public static final String d0 = "android.support.v4.media.description.NULL_BUNDLE_FLAG";
    private final String G;
    private final CharSequence H;
    private final CharSequence I;
    private final CharSequence J;
    private final Bitmap K;
    private final Uri L;
    private final Bundle M;
    private final Uri N;
    private MediaDescription O;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<MediaDescriptionCompat>() {
            public MediaDescriptionCompat a(final Parcel parcel) {
                if (Build$VERSION.SDK_INT < 21) {
                    return new MediaDescriptionCompat(parcel);
                }
                return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
            }
            
            public MediaDescriptionCompat[] b(final int n) {
                return new MediaDescriptionCompat[n];
            }
        };
    }
    
    MediaDescriptionCompat(final Parcel parcel) {
        this.G = parcel.readString();
        this.H = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.I = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.J = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        final ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.K = (Bitmap)parcel.readParcelable(classLoader);
        this.L = (Uri)parcel.readParcelable(classLoader);
        this.M = parcel.readBundle(classLoader);
        this.N = (Uri)parcel.readParcelable(classLoader);
    }
    
    MediaDescriptionCompat(final String g, final CharSequence h, final CharSequence i, final CharSequence j, final Bitmap k, final Uri l, final Bundle m, final Uri n) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
        this.L = l;
        this.M = m;
        this.N = n;
    }
    
    public static MediaDescriptionCompat a(final Object o) {
        final MediaDescriptionCompat mediaDescriptionCompat = null;
        final Bundle bundle = null;
        MediaDescriptionCompat a = mediaDescriptionCompat;
        if (o != null) {
            final int sdk_INT = Build$VERSION.SDK_INT;
            a = mediaDescriptionCompat;
            if (sdk_INT >= 21) {
                final d d = new d();
                final MediaDescription o2 = (MediaDescription)o;
                d.f(b.g(o2));
                d.i(b.i(o2));
                d.h(b.h(o2));
                d.b(b.c(o2));
                d.d(b.e(o2));
                d.e(b.f(o2));
                final Bundle d2 = b.d(o2);
                Bundle f;
                if ((f = d2) != null) {
                    f = MediaSessionCompat.F(d2);
                }
                Uri uri;
                if (f != null) {
                    uri = (Uri)f.getParcelable("android.support.v4.media.description.MEDIA_URI");
                }
                else {
                    uri = null;
                }
                if (uri != null) {
                    if (f.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && f.size() == 2) {
                        f = bundle;
                    }
                    else {
                        f.remove("android.support.v4.media.description.MEDIA_URI");
                        f.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                    }
                }
                d.c(f);
                if (uri != null) {
                    d.g(uri);
                }
                else if (sdk_INT >= 23) {
                    d.g(c.a(o2));
                }
                a = d.a();
                a.O = o2;
            }
        }
        return a;
    }
    
    @k0
    public CharSequence b() {
        return this.J;
    }
    
    @k0
    public Bundle c() {
        return this.M;
    }
    
    @k0
    public Bitmap d() {
        return this.K;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @k0
    public Uri e() {
        return this.L;
    }
    
    public Object f() {
        MediaDescription o;
        final MediaDescription mediaDescription = o = this.O;
        if (mediaDescription == null) {
            final int sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT < 21) {
                o = mediaDescription;
            }
            else {
                final MediaDescription$Builder b = MediaDescriptionCompat.b.b();
                MediaDescriptionCompat.b.n(b, this.G);
                MediaDescriptionCompat.b.p(b, this.H);
                MediaDescriptionCompat.b.o(b, this.I);
                MediaDescriptionCompat.b.j(b, this.J);
                MediaDescriptionCompat.b.l(b, this.K);
                MediaDescriptionCompat.b.m(b, this.L);
                Bundle m;
                final Bundle bundle = m = this.M;
                if (sdk_INT < 23) {
                    m = bundle;
                    if (this.N != null) {
                        if ((m = bundle) == null) {
                            m = new Bundle();
                            m.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                        }
                        m.putParcelable("android.support.v4.media.description.MEDIA_URI", (Parcelable)this.N);
                    }
                }
                MediaDescriptionCompat.b.k(b, m);
                if (sdk_INT >= 23) {
                    c.b(b, this.N);
                }
                o = MediaDescriptionCompat.b.a(b);
                this.O = o;
            }
        }
        return o;
    }
    
    @k0
    public String g() {
        return this.G;
    }
    
    @k0
    public Uri h() {
        return this.N;
    }
    
    @k0
    public CharSequence i() {
        return this.I;
    }
    
    @k0
    public CharSequence j() {
        return this.H;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append((Object)this.H);
        sb.append(", ");
        sb.append((Object)this.I);
        sb.append(", ");
        sb.append((Object)this.J);
        return sb.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        if (Build$VERSION.SDK_INT < 21) {
            parcel.writeString(this.G);
            TextUtils.writeToParcel(this.H, parcel, n);
            TextUtils.writeToParcel(this.I, parcel, n);
            TextUtils.writeToParcel(this.J, parcel, n);
            parcel.writeParcelable((Parcelable)this.K, n);
            parcel.writeParcelable((Parcelable)this.L, n);
            parcel.writeBundle(this.M);
            parcel.writeParcelable((Parcelable)this.N, n);
        }
        else {
            ((MediaDescription)this.f()).writeToParcel(parcel, n);
        }
    }
    
    @p0(21)
    private static class b
    {
        @r
        static MediaDescription a(final MediaDescription$Builder mediaDescription$Builder) {
            return mediaDescription$Builder.build();
        }
        
        @r
        static MediaDescription$Builder b() {
            return new MediaDescription$Builder();
        }
        
        @k0
        @r
        static CharSequence c(final MediaDescription mediaDescription) {
            return mediaDescription.getDescription();
        }
        
        @k0
        @r
        static Bundle d(final MediaDescription mediaDescription) {
            return mediaDescription.getExtras();
        }
        
        @k0
        @r
        static Bitmap e(final MediaDescription mediaDescription) {
            return mediaDescription.getIconBitmap();
        }
        
        @k0
        @r
        static Uri f(final MediaDescription mediaDescription) {
            return mediaDescription.getIconUri();
        }
        
        @k0
        @r
        static String g(final MediaDescription mediaDescription) {
            return mediaDescription.getMediaId();
        }
        
        @k0
        @r
        static CharSequence h(final MediaDescription mediaDescription) {
            return mediaDescription.getSubtitle();
        }
        
        @k0
        @r
        static CharSequence i(final MediaDescription mediaDescription) {
            return mediaDescription.getTitle();
        }
        
        @r
        static void j(final MediaDescription$Builder mediaDescription$Builder, @k0 final CharSequence description) {
            mediaDescription$Builder.setDescription(description);
        }
        
        @r
        static void k(final MediaDescription$Builder mediaDescription$Builder, @k0 final Bundle extras) {
            mediaDescription$Builder.setExtras(extras);
        }
        
        @r
        static void l(final MediaDescription$Builder mediaDescription$Builder, @k0 final Bitmap iconBitmap) {
            mediaDescription$Builder.setIconBitmap(iconBitmap);
        }
        
        @r
        static void m(final MediaDescription$Builder mediaDescription$Builder, @k0 final Uri iconUri) {
            mediaDescription$Builder.setIconUri(iconUri);
        }
        
        @r
        static void n(final MediaDescription$Builder mediaDescription$Builder, @k0 final String mediaId) {
            mediaDescription$Builder.setMediaId(mediaId);
        }
        
        @r
        static void o(final MediaDescription$Builder mediaDescription$Builder, @k0 final CharSequence subtitle) {
            mediaDescription$Builder.setSubtitle(subtitle);
        }
        
        @r
        static void p(final MediaDescription$Builder mediaDescription$Builder, @k0 final CharSequence title) {
            mediaDescription$Builder.setTitle(title);
        }
    }
    
    @p0(23)
    private static class c
    {
        @k0
        @r
        static Uri a(final MediaDescription mediaDescription) {
            return mediaDescription.getMediaUri();
        }
        
        @r
        static void b(final MediaDescription$Builder mediaDescription$Builder, @k0 final Uri mediaUri) {
            mediaDescription$Builder.setMediaUri(mediaUri);
        }
    }
    
    public static final class d
    {
        private String a;
        private CharSequence b;
        private CharSequence c;
        private CharSequence d;
        private Bitmap e;
        private Uri f;
        private Bundle g;
        private Uri h;
        
        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        }
        
        public d b(@k0 final CharSequence d) {
            this.d = d;
            return this;
        }
        
        public d c(@k0 final Bundle g) {
            this.g = g;
            return this;
        }
        
        public d d(@k0 final Bitmap e) {
            this.e = e;
            return this;
        }
        
        public d e(@k0 final Uri f) {
            this.f = f;
            return this;
        }
        
        public d f(@k0 final String a) {
            this.a = a;
            return this;
        }
        
        public d g(@k0 final Uri h) {
            this.h = h;
            return this;
        }
        
        public d h(@k0 final CharSequence c) {
            this.c = c;
            return this;
        }
        
        public d i(@k0 final CharSequence b) {
            this.b = b;
            return this;
        }
    }
}
