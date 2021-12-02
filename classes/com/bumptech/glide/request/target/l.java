// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.request.transition.f;
import androidx.annotation.j0;
import android.app.NotificationManager;
import androidx.annotation.k0;
import com.bumptech.glide.util.k;
import android.app.Notification;
import android.content.Context;
import android.widget.RemoteViews;
import android.graphics.Bitmap;

public class l extends e<Bitmap>
{
    private final RemoteViews J;
    private final Context K;
    private final int L;
    private final String M;
    private final Notification N;
    private final int O;
    
    public l(final Context context, final int n, final int n2, final int o, final RemoteViews remoteViews, final Notification notification, final int l, final String m) {
        super(n, n2);
        this.K = k.e(context, "Context must not be null!");
        this.N = k.e(notification, "Notification object can not be null!");
        this.J = k.e(remoteViews, "RemoteViews object can not be null!");
        this.O = o;
        this.L = l;
        this.M = m;
    }
    
    public l(final Context context, final int n, final RemoteViews remoteViews, final Notification notification, final int n2) {
        this(context, n, remoteViews, notification, n2, null);
    }
    
    public l(final Context context, final int n, final RemoteViews remoteViews, final Notification notification, final int n2, final String s) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, n, remoteViews, notification, n2, s);
    }
    
    private void g(@k0 final Bitmap bitmap) {
        this.J.setImageViewBitmap(this.O, bitmap);
        this.i();
    }
    
    private void i() {
        k.d(this.K.getSystemService("notification")).notify(this.M, this.L, this.N);
    }
    
    public void d(@j0 final Bitmap bitmap, @k0 final f<? super Bitmap> f) {
        this.g(bitmap);
    }
    
    @Override
    public void p(@k0 final Drawable drawable) {
        this.g(null);
    }
}
