// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.resource.drawable;

import androidx.annotation.k0;
import com.bumptech.glide.load.engine.v;
import java.io.IOException;
import com.bumptech.glide.load.j;
import android.content.res.Resources;
import androidx.annotation.s;
import java.util.List;
import androidx.annotation.j0;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.load.l;

public class e implements l<Uri, Drawable>
{
    private static final String b = "android";
    private static final int c = 0;
    private static final int d = 2;
    private static final int e = 0;
    private static final int f = 1;
    private static final int g = 1;
    private static final int h = 0;
    private final Context a;
    
    public e(final Context context) {
        this.a = context.getApplicationContext();
    }
    
    @j0
    private Context d(final Uri obj, final String s) {
        if (s.equals(this.a.getPackageName())) {
            return this.a;
        }
        try {
            return this.a.createPackageContext(s, 0);
        }
        catch (PackageManager$NameNotFoundException cause) {
            if (s.contains(this.a.getPackageName())) {
                return this.a;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Failed to obtain context or unrecognized Uri format for: ");
            sb.append(obj);
            throw new IllegalArgumentException(sb.toString(), (Throwable)cause);
        }
    }
    
    @s
    private int e(final Uri obj) {
        final List pathSegments = obj.getPathSegments();
        try {
            return Integer.parseInt(pathSegments.get(0));
        }
        catch (NumberFormatException cause) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Unrecognized Uri format: ");
            sb.append(obj);
            throw new IllegalArgumentException(sb.toString(), cause);
        }
    }
    
    @s
    private int f(final Context context, final Uri obj) {
        final List pathSegments = obj.getPathSegments();
        final String authority = obj.getAuthority();
        final String s = pathSegments.get(0);
        final String s2 = pathSegments.get(1);
        int n;
        if ((n = context.getResources().getIdentifier(s2, s, authority)) == 0) {
            n = Resources.getSystem().getIdentifier(s2, s, "android");
        }
        if (n != 0) {
            return n;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Failed to find resource id for: ");
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }
    
    @s
    private int g(final Context context, final Uri obj) {
        final List pathSegments = obj.getPathSegments();
        if (pathSegments.size() == 2) {
            return this.f(context, obj);
        }
        if (pathSegments.size() == 1) {
            return this.e(obj);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unrecognized Uri format: ");
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }
    
    @k0
    public v<Drawable> c(@j0 final Uri uri, int g, final int n, @j0 final j j) {
        final Context d = this.d(uri, uri.getAuthority());
        g = this.g(d, uri);
        return com.bumptech.glide.load.resource.drawable.d.d(com.bumptech.glide.load.resource.drawable.a.b(this.a, d, g));
    }
    
    public boolean h(@j0 final Uri uri, @j0 final j j) {
        return uri.getScheme().equals("android.resource");
    }
}
