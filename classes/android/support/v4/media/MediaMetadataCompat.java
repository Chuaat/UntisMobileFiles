// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.media;

import androidx.annotation.t0;
import java.util.Iterator;
import java.util.Set;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.graphics.Bitmap;
import android.os.Build$VERSION;
import android.support.v4.media.session.MediaSessionCompat;
import android.os.Parcel;
import android.media.MediaMetadata;
import android.os.Bundle;
import androidx.collection.a;
import android.os.Parcelable$Creator;
import android.annotation.SuppressLint;
import android.os.Parcelable;

@SuppressLint({ "BanParcelableUsage" })
public final class MediaMetadataCompat implements Parcelable
{
    public static final Parcelable$Creator<MediaMetadataCompat> CREATOR;
    private static final String J = "MediaMetadata";
    public static final String K = "android.media.metadata.TITLE";
    public static final String L = "android.media.metadata.ARTIST";
    public static final String M = "android.media.metadata.DURATION";
    public static final String N = "android.media.metadata.ALBUM";
    public static final String O = "android.media.metadata.AUTHOR";
    public static final String P = "android.media.metadata.WRITER";
    public static final String Q = "android.media.metadata.COMPOSER";
    public static final String R = "android.media.metadata.COMPILATION";
    public static final String S = "android.media.metadata.DATE";
    public static final String T = "android.media.metadata.YEAR";
    public static final String U = "android.media.metadata.GENRE";
    public static final String V = "android.media.metadata.TRACK_NUMBER";
    public static final String W = "android.media.metadata.NUM_TRACKS";
    public static final String X = "android.media.metadata.DISC_NUMBER";
    public static final String Y = "android.media.metadata.ALBUM_ARTIST";
    public static final String Z = "android.media.metadata.ART";
    public static final String a0 = "android.media.metadata.ART_URI";
    public static final String b0 = "android.media.metadata.ALBUM_ART";
    public static final String c0 = "android.media.metadata.ALBUM_ART_URI";
    public static final String d0 = "android.media.metadata.USER_RATING";
    public static final String e0 = "android.media.metadata.RATING";
    public static final String f0 = "android.media.metadata.DISPLAY_TITLE";
    public static final String g0 = "android.media.metadata.DISPLAY_SUBTITLE";
    public static final String h0 = "android.media.metadata.DISPLAY_DESCRIPTION";
    public static final String i0 = "android.media.metadata.DISPLAY_ICON";
    public static final String j0 = "android.media.metadata.DISPLAY_ICON_URI";
    public static final String k0 = "android.media.metadata.MEDIA_ID";
    public static final String l0 = "android.media.metadata.MEDIA_URI";
    public static final String m0 = "android.media.metadata.BT_FOLDER_TYPE";
    public static final String n0 = "android.media.metadata.ADVERTISEMENT";
    public static final String o0 = "android.media.metadata.DOWNLOAD_STATUS";
    static final int p0 = 0;
    static final int q0 = 1;
    static final int r0 = 2;
    static final int s0 = 3;
    static final a<String, Integer> t0;
    private static final String[] u0;
    private static final String[] v0;
    private static final String[] w0;
    final Bundle G;
    private MediaMetadata H;
    private MediaDescriptionCompat I;
    
    static {
        final a<String, Integer> a = (a<String, Integer>)(t0 = new a<String, Integer>());
        final Integer value = 1;
        a.put("android.media.metadata.TITLE", value);
        a.put("android.media.metadata.ARTIST", value);
        final Integer value2 = 0;
        a.put("android.media.metadata.DURATION", value2);
        a.put("android.media.metadata.ALBUM", value);
        a.put("android.media.metadata.AUTHOR", value);
        a.put("android.media.metadata.WRITER", value);
        a.put("android.media.metadata.COMPOSER", value);
        a.put("android.media.metadata.COMPILATION", value);
        a.put("android.media.metadata.DATE", value);
        a.put("android.media.metadata.YEAR", value2);
        a.put("android.media.metadata.GENRE", value);
        a.put("android.media.metadata.TRACK_NUMBER", value2);
        a.put("android.media.metadata.NUM_TRACKS", value2);
        a.put("android.media.metadata.DISC_NUMBER", value2);
        a.put("android.media.metadata.ALBUM_ARTIST", value);
        final Integer value3 = 2;
        a.put("android.media.metadata.ART", value3);
        a.put("android.media.metadata.ART_URI", value);
        a.put("android.media.metadata.ALBUM_ART", value3);
        a.put("android.media.metadata.ALBUM_ART_URI", value);
        final Integer value4 = 3;
        a.put("android.media.metadata.USER_RATING", value4);
        a.put("android.media.metadata.RATING", value4);
        a.put("android.media.metadata.DISPLAY_TITLE", value);
        a.put("android.media.metadata.DISPLAY_SUBTITLE", value);
        a.put("android.media.metadata.DISPLAY_DESCRIPTION", value);
        a.put("android.media.metadata.DISPLAY_ICON", value3);
        a.put("android.media.metadata.DISPLAY_ICON_URI", value);
        a.put("android.media.metadata.MEDIA_ID", value);
        a.put("android.media.metadata.BT_FOLDER_TYPE", value2);
        a.put("android.media.metadata.MEDIA_URI", value);
        a.put("android.media.metadata.ADVERTISEMENT", value2);
        a.put("android.media.metadata.DOWNLOAD_STATUS", value2);
        u0 = new String[] { "android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER" };
        v0 = new String[] { "android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART" };
        w0 = new String[] { "android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI" };
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<MediaMetadataCompat>() {
            public MediaMetadataCompat a(final Parcel parcel) {
                return new MediaMetadataCompat(parcel);
            }
            
            public MediaMetadataCompat[] b(final int n) {
                return new MediaMetadataCompat[n];
            }
        };
    }
    
    MediaMetadataCompat(Bundle g) {
        g = new Bundle(g);
        MediaSessionCompat.b(this.G = g);
    }
    
    MediaMetadataCompat(final Parcel parcel) {
        this.G = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }
    
    public static MediaMetadataCompat b(final Object o) {
        if (o != null && Build$VERSION.SDK_INT >= 21) {
            final Parcel obtain = Parcel.obtain();
            final MediaMetadata h = (MediaMetadata)o;
            h.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            final MediaMetadataCompat mediaMetadataCompat = (MediaMetadataCompat)MediaMetadataCompat.CREATOR.createFromParcel(obtain);
            obtain.recycle();
            mediaMetadataCompat.H = h;
            return mediaMetadataCompat;
        }
        return null;
    }
    
    public boolean a(final String s) {
        return this.G.containsKey(s);
    }
    
    public Bitmap c(final String s) {
        Bitmap bitmap;
        try {
            bitmap = (Bitmap)this.G.getParcelable(s);
        }
        catch (Exception ex) {
            Log.w("MediaMetadata", "Failed to retrieve a key as Bitmap.", (Throwable)ex);
            bitmap = null;
        }
        return bitmap;
    }
    
    public Bundle d() {
        return new Bundle(this.G);
    }
    
    public int describeContents() {
        return 0;
    }
    
    public MediaDescriptionCompat e() {
        final MediaDescriptionCompat i = this.I;
        if (i != null) {
            return i;
        }
        final String j = this.i("android.media.metadata.MEDIA_ID");
        final CharSequence[] array = new CharSequence[3];
        final CharSequence k = this.j("android.media.metadata.DISPLAY_TITLE");
        if (!TextUtils.isEmpty(k)) {
            array[0] = k;
            array[1] = this.j("android.media.metadata.DISPLAY_SUBTITLE");
            array[2] = this.j("android.media.metadata.DISPLAY_DESCRIPTION");
        }
        else {
            int l = 0;
            int n = 0;
            while (l < 3) {
                final String[] u0 = MediaMetadataCompat.u0;
                if (n >= u0.length) {
                    break;
                }
                final CharSequence m = this.j(u0[n]);
                int n2 = l;
                if (!TextUtils.isEmpty(m)) {
                    array[l] = m;
                    n2 = l + 1;
                }
                ++n;
                l = n2;
            }
        }
        int n3 = 0;
        Uri parse;
        Bitmap c;
        while (true) {
            final String[] v0 = MediaMetadataCompat.v0;
            final int length = v0.length;
            parse = null;
            if (n3 >= length) {
                c = null;
                break;
            }
            c = this.c(v0[n3]);
            if (c != null) {
                break;
            }
            ++n3;
        }
        int n4 = 0;
        Uri parse2;
        while (true) {
            final String[] w0 = MediaMetadataCompat.w0;
            if (n4 >= w0.length) {
                parse2 = null;
                break;
            }
            final String i2 = this.i(w0[n4]);
            if (!TextUtils.isEmpty((CharSequence)i2)) {
                parse2 = Uri.parse(i2);
                break;
            }
            ++n4;
        }
        final String i3 = this.i("android.media.metadata.MEDIA_URI");
        if (!TextUtils.isEmpty((CharSequence)i3)) {
            parse = Uri.parse(i3);
        }
        final MediaDescriptionCompat.d d = new MediaDescriptionCompat.d();
        d.f(j);
        d.i(array[0]);
        d.h(array[1]);
        d.b(array[2]);
        d.d(c);
        d.e(parse2);
        d.g(parse);
        final Bundle bundle = new Bundle();
        if (this.G.containsKey("android.media.metadata.BT_FOLDER_TYPE")) {
            bundle.putLong("android.media.extra.BT_FOLDER_TYPE", this.f("android.media.metadata.BT_FOLDER_TYPE"));
        }
        if (this.G.containsKey("android.media.metadata.DOWNLOAD_STATUS")) {
            bundle.putLong("android.media.extra.DOWNLOAD_STATUS", this.f("android.media.metadata.DOWNLOAD_STATUS"));
        }
        if (!bundle.isEmpty()) {
            d.c(bundle);
        }
        return this.I = d.a();
    }
    
    public long f(final String s) {
        return this.G.getLong(s, 0L);
    }
    
    public Object g() {
        if (this.H == null && Build$VERSION.SDK_INT >= 21) {
            final Parcel obtain = Parcel.obtain();
            this.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            this.H = (MediaMetadata)MediaMetadata.CREATOR.createFromParcel(obtain);
            obtain.recycle();
        }
        return this.H;
    }
    
    public RatingCompat h(final String s) {
        RatingCompat a;
        try {
            if (Build$VERSION.SDK_INT >= 19) {
                a = RatingCompat.a(this.G.getParcelable(s));
            }
            else {
                a = (RatingCompat)this.G.getParcelable(s);
            }
        }
        catch (Exception ex) {
            Log.w("MediaMetadata", "Failed to retrieve a key as Rating.", (Throwable)ex);
            a = null;
        }
        return a;
    }
    
    public String i(final String s) {
        final CharSequence charSequence = this.G.getCharSequence(s);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }
    
    public CharSequence j(final String s) {
        return this.G.getCharSequence(s);
    }
    
    public Set<String> k() {
        return (Set<String>)this.G.keySet();
    }
    
    public int l() {
        return this.G.size();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeBundle(this.G);
    }
    
    public static final class b
    {
        private final Bundle a;
        
        public b() {
            this.a = new Bundle();
        }
        
        public b(final MediaMetadataCompat mediaMetadataCompat) {
            MediaSessionCompat.b(this.a = new Bundle(mediaMetadataCompat.G));
        }
        
        @t0({ androidx.annotation.t0.a.G })
        public b(final MediaMetadataCompat mediaMetadataCompat, final int n) {
            this(mediaMetadataCompat);
            for (final String s : this.a.keySet()) {
                final Object value = this.a.get(s);
                if (value instanceof Bitmap) {
                    final Bitmap bitmap = (Bitmap)value;
                    if (bitmap.getHeight() <= n && bitmap.getWidth() <= n) {
                        continue;
                    }
                    this.b(s, this.g(bitmap, n));
                }
            }
        }
        
        private Bitmap g(final Bitmap bitmap, int n) {
            final float n2 = (float)n;
            final float min = Math.min(n2 / bitmap.getWidth(), n2 / bitmap.getHeight());
            n = (int)(bitmap.getHeight() * min);
            return Bitmap.createScaledBitmap(bitmap, (int)(bitmap.getWidth() * min), n, true);
        }
        
        public MediaMetadataCompat a() {
            return new MediaMetadataCompat(this.a);
        }
        
        public b b(final String str, final Bitmap bitmap) {
            final a<String, Integer> t0 = MediaMetadataCompat.t0;
            if (t0.containsKey(str) && (int)t0.get(str) != 2) {
                final StringBuilder sb = new StringBuilder();
                sb.append("The ");
                sb.append(str);
                sb.append(" key cannot be used to put a Bitmap");
                throw new IllegalArgumentException(sb.toString());
            }
            this.a.putParcelable(str, (Parcelable)bitmap);
            return this;
        }
        
        public b c(final String str, final long n) {
            final a<String, Integer> t0 = MediaMetadataCompat.t0;
            if (t0.containsKey(str) && (int)t0.get(str) != 0) {
                final StringBuilder sb = new StringBuilder();
                sb.append("The ");
                sb.append(str);
                sb.append(" key cannot be used to put a long");
                throw new IllegalArgumentException(sb.toString());
            }
            this.a.putLong(str, n);
            return this;
        }
        
        public b d(final String str, RatingCompat ratingCompat) {
            final a<String, Integer> t0 = MediaMetadataCompat.t0;
            if (t0.containsKey(str) && (int)t0.get(str) != 3) {
                final StringBuilder sb = new StringBuilder();
                sb.append("The ");
                sb.append(str);
                sb.append(" key cannot be used to put a Rating");
                throw new IllegalArgumentException(sb.toString());
            }
            Bundle bundle;
            if (Build$VERSION.SDK_INT >= 19) {
                bundle = this.a;
                ratingCompat = (RatingCompat)ratingCompat.c();
            }
            else {
                bundle = this.a;
            }
            bundle.putParcelable(str, (Parcelable)ratingCompat);
            return this;
        }
        
        public b e(final String str, final String s) {
            final a<String, Integer> t0 = MediaMetadataCompat.t0;
            if (t0.containsKey(str) && (int)t0.get(str) != 1) {
                final StringBuilder sb = new StringBuilder();
                sb.append("The ");
                sb.append(str);
                sb.append(" key cannot be used to put a String");
                throw new IllegalArgumentException(sb.toString());
            }
            this.a.putCharSequence(str, (CharSequence)s);
            return this;
        }
        
        public b f(final String str, final CharSequence charSequence) {
            final a<String, Integer> t0 = MediaMetadataCompat.t0;
            if (t0.containsKey(str) && (int)t0.get(str) != 1) {
                final StringBuilder sb = new StringBuilder();
                sb.append("The ");
                sb.append(str);
                sb.append(" key cannot be used to put a CharSequence");
                throw new IllegalArgumentException(sb.toString());
            }
            this.a.putCharSequence(str, charSequence);
            return this;
        }
    }
}
