// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.media;

import androidx.annotation.t0;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import androidx.annotation.r;
import androidx.annotation.p0;
import android.util.Log;
import android.media.Rating;
import android.os.Build$VERSION;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.annotation.SuppressLint;
import android.os.Parcelable;

@SuppressLint({ "BanParcelableUsage" })
public final class RatingCompat implements Parcelable
{
    public static final Parcelable$Creator<RatingCompat> CREATOR;
    private static final String J = "Rating";
    public static final int K = 0;
    public static final int L = 1;
    public static final int M = 2;
    public static final int N = 3;
    public static final int O = 4;
    public static final int P = 5;
    public static final int Q = 6;
    private static final float R = -1.0f;
    private final int G;
    private final float H;
    private Object I;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<RatingCompat>() {
            public RatingCompat a(final Parcel parcel) {
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            }
            
            public RatingCompat[] b(final int n) {
                return new RatingCompat[n];
            }
        };
    }
    
    RatingCompat(final int g, final float h) {
        this.G = g;
        this.H = h;
    }
    
    public static RatingCompat a(final Object i) {
        RatingCompat ratingCompat2;
        final RatingCompat ratingCompat = ratingCompat2 = null;
        if (i != null) {
            ratingCompat2 = ratingCompat;
            if (Build$VERSION.SDK_INT >= 19) {
                final Rating rating = (Rating)i;
                final int b = RatingCompat.b.b(rating);
                if (RatingCompat.b.e(rating)) {
                    switch (b) {
                        default: {
                            return null;
                        }
                        case 6: {
                            ratingCompat2 = j(RatingCompat.b.a(rating));
                            break;
                        }
                        case 3:
                        case 4:
                        case 5: {
                            ratingCompat2 = k(b, RatingCompat.b.c(rating));
                            break;
                        }
                        case 2: {
                            ratingCompat2 = l(RatingCompat.b.f(rating));
                            break;
                        }
                        case 1: {
                            ratingCompat2 = i(RatingCompat.b.d(rating));
                            break;
                        }
                    }
                }
                else {
                    ratingCompat2 = m(b);
                }
                ratingCompat2.I = i;
            }
        }
        return ratingCompat2;
    }
    
    public static RatingCompat i(final boolean b) {
        float n;
        if (b) {
            n = 1.0f;
        }
        else {
            n = 0.0f;
        }
        return new RatingCompat(1, n);
    }
    
    public static RatingCompat j(final float n) {
        if (n >= 0.0f && n <= 100.0f) {
            return new RatingCompat(6, n);
        }
        Log.e("Rating", "Invalid percentage-based rating value");
        return null;
    }
    
    public static RatingCompat k(final int i, final float n) {
        while (true) {
            float n2 = 0.0f;
            Label_0072: {
                if (i == 3) {
                    n2 = 3.0f;
                    break Label_0072;
                }
                if (i == 4) {
                    n2 = 4.0f;
                    break Label_0072;
                }
                if (i == 5) {
                    n2 = 5.0f;
                    break Label_0072;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Invalid rating style (");
                sb.append(i);
                sb.append(") for a star rating");
                final String string = sb.toString();
                Log.e("Rating", string);
                return null;
            }
            if (n >= 0.0f && n <= n2) {
                return new RatingCompat(i, n);
            }
            final String string = "Trying to set out of range star-based rating";
            continue;
        }
    }
    
    public static RatingCompat l(final boolean b) {
        float n;
        if (b) {
            n = 1.0f;
        }
        else {
            n = 0.0f;
        }
        return new RatingCompat(2, n);
    }
    
    public static RatingCompat m(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6: {
                return new RatingCompat(n, -1.0f);
            }
        }
    }
    
    public float b() {
        if (this.G == 6 && this.g()) {
            return this.H;
        }
        return -1.0f;
    }
    
    public Object c() {
        if (this.I == null && Build$VERSION.SDK_INT >= 19) {
            Rating i = null;
            if (this.g()) {
                final int g = this.G;
                switch (g) {
                    default: {
                        return null;
                    }
                    case 6: {
                        i = b.h(this.b());
                        break;
                    }
                    case 3:
                    case 4:
                    case 5: {
                        i = b.i(g, this.e());
                        break;
                    }
                    case 2: {
                        i = b.j(this.h());
                        break;
                    }
                    case 1: {
                        i = b.g(this.f());
                        break;
                    }
                }
            }
            else {
                i = b.k(this.G);
            }
            this.I = i;
        }
        return this.I;
    }
    
    public int d() {
        return this.G;
    }
    
    public int describeContents() {
        return this.G;
    }
    
    public float e() {
        final int g = this.G;
        if (g == 3 || g == 4 || g == 5) {
            if (this.g()) {
                return this.H;
            }
        }
        return -1.0f;
    }
    
    public boolean f() {
        final int g = this.G;
        boolean b = false;
        if (g != 1) {
            return false;
        }
        if (this.H == 1.0f) {
            b = true;
        }
        return b;
    }
    
    public boolean g() {
        return this.H >= 0.0f;
    }
    
    public boolean h() {
        final int g = this.G;
        boolean b = false;
        if (g != 2) {
            return false;
        }
        if (this.H == 1.0f) {
            b = true;
        }
        return b;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.G);
        sb.append(" rating=");
        final float h = this.H;
        String value;
        if (h < 0.0f) {
            value = "unrated";
        }
        else {
            value = String.valueOf(h);
        }
        sb.append(value);
        return sb.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.G);
        parcel.writeFloat(this.H);
    }
    
    @p0(19)
    private static class b
    {
        @r
        static float a(final Rating rating) {
            return rating.getPercentRating();
        }
        
        @r
        static int b(final Rating rating) {
            return rating.getRatingStyle();
        }
        
        @r
        static float c(final Rating rating) {
            return rating.getStarRating();
        }
        
        @r
        static boolean d(final Rating rating) {
            return rating.hasHeart();
        }
        
        @r
        static boolean e(final Rating rating) {
            return rating.isRated();
        }
        
        @r
        static boolean f(final Rating rating) {
            return rating.isThumbUp();
        }
        
        @r
        static Rating g(final boolean b) {
            return Rating.newHeartRating(b);
        }
        
        @r
        static Rating h(final float n) {
            return Rating.newPercentageRating(n);
        }
        
        @r
        static Rating i(final int n, final float n2) {
            return Rating.newStarRating(n, n2);
        }
        
        @r
        static Rating j(final boolean b) {
            return Rating.newThumbRating(b);
        }
        
        @r
        static Rating k(final int n) {
            return Rating.newUnratedRating(n);
        }
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ t0.a.G })
    public @interface c {
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ t0.a.I })
    public @interface d {
    }
}
