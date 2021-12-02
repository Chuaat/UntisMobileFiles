// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.images;

import android.os.Parcelable;
import h2.c;
import android.os.Parcel;
import java.util.Locale;
import com.google.android.gms.common.internal.v;
import androidx.annotation.k0;
import org.json.JSONException;
import org.json.JSONObject;
import android.net.Uri;
import androidx.annotation.RecentlyNonNull;
import android.os.Parcelable$Creator;
import h2.d;
import h2.a;

@h2.d.a(creator = "WebImageCreator")
public final class b extends a
{
    @RecentlyNonNull
    public static final Parcelable$Creator<b> CREATOR;
    @g(id = 1)
    private final int G;
    @c(getter = "getUrl", id = 2)
    private final Uri H;
    @c(getter = "getWidth", id = 3)
    private final int I;
    @c(getter = "getHeight", id = 4)
    private final int J;
    
    static {
        CREATOR = (Parcelable$Creator)new com.google.android.gms.common.images.g();
    }
    
    @h2.d.b
    b(@e(id = 1) final int g, @e(id = 2) final Uri h, @e(id = 3) final int i, @e(id = 4) final int j) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    public b(@RecentlyNonNull final Uri uri) throws IllegalArgumentException {
        this(uri, 0, 0);
    }
    
    public b(@RecentlyNonNull final Uri uri, @RecentlyNonNull final int n, @RecentlyNonNull final int n2) throws IllegalArgumentException {
        this(1, uri, n, n2);
        if (uri == null) {
            throw new IllegalArgumentException("url cannot be null");
        }
        if (n >= 0 && n2 >= 0) {
            return;
        }
        throw new IllegalArgumentException("width and height must not be negative");
    }
    
    @f2.a
    public b(@RecentlyNonNull final JSONObject jsonObject) throws IllegalArgumentException {
        this(j2(jsonObject), jsonObject.optInt("width", 0), jsonObject.optInt("height", 0));
    }
    
    private static Uri j2(final JSONObject jsonObject) {
        Uri uri = Uri.EMPTY;
        if (!jsonObject.has("url")) {
            return uri;
        }
        try {
            uri = Uri.parse(jsonObject.getString("url"));
            return uri;
        }
        catch (JSONException ex) {
            uri = uri;
            return uri;
        }
    }
    
    @RecentlyNonNull
    public final int M() {
        return this.J;
    }
    
    @RecentlyNonNull
    @f2.a
    public final JSONObject Q1() {
        final JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("url", (Object)this.H.toString());
            jsonObject.put("width", this.I);
            jsonObject.put("height", this.J);
            return jsonObject;
        }
        catch (JSONException ex) {
            return jsonObject;
        }
    }
    
    @RecentlyNonNull
    @Override
    public final boolean equals(@k0 final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (o instanceof b) {
                final b b = (b)o;
                if (v.b(this.H, b.H) && this.I == b.I && this.J == b.J) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @RecentlyNonNull
    public final Uri g1() {
        return this.H;
    }
    
    @RecentlyNonNull
    @Override
    public final int hashCode() {
        return v.c(this.H, this.I, this.J);
    }
    
    @RecentlyNonNull
    public final int q1() {
        return this.I;
    }
    
    @RecentlyNonNull
    @Override
    public final String toString() {
        return String.format(Locale.US, "Image %dx%d %s", this.I, this.J, this.H.toString());
    }
    
    public final void writeToParcel(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull final int n) {
        final int a = h2.c.a(parcel);
        h2.c.F(parcel, 1, this.G);
        h2.c.S(parcel, 2, (Parcelable)this.g1(), n, false);
        h2.c.F(parcel, 3, this.q1());
        h2.c.F(parcel, 4, this.M());
        h2.c.b(parcel, a);
    }
}
