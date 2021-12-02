// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.request.transition.f;
import androidx.annotation.j0;
import android.appwidget.AppWidgetManager;
import androidx.annotation.k0;
import com.bumptech.glide.util.k;
import android.content.Context;
import android.widget.RemoteViews;
import android.content.ComponentName;
import android.graphics.Bitmap;

public class a extends e<Bitmap>
{
    private final int[] J;
    private final ComponentName K;
    private final RemoteViews L;
    private final Context M;
    private final int N;
    
    public a(final Context context, final int n, final int n2, final int n3, final RemoteViews remoteViews, final ComponentName componentName) {
        super(n, n2);
        this.M = k.e(context, "Context can not be null!");
        this.L = k.e(remoteViews, "RemoteViews object can not be null!");
        this.K = k.e(componentName, "ComponentName can not be null!");
        this.N = n3;
        this.J = null;
    }
    
    public a(final Context context, final int n, final int n2, final int n3, final RemoteViews remoteViews, final int... array) {
        super(n, n2);
        if (array.length != 0) {
            this.M = k.e(context, "Context can not be null!");
            this.L = k.e(remoteViews, "RemoteViews object can not be null!");
            this.J = k.e(array, "WidgetIds can not be null!");
            this.N = n3;
            this.K = null;
            return;
        }
        throw new IllegalArgumentException("WidgetIds must have length > 0");
    }
    
    public a(final Context context, final int n, final RemoteViews remoteViews, final ComponentName componentName) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, n, remoteViews, componentName);
    }
    
    public a(final Context context, final int n, final RemoteViews remoteViews, final int... array) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, n, remoteViews, array);
    }
    
    private void g(@k0 final Bitmap bitmap) {
        this.L.setImageViewBitmap(this.N, bitmap);
        this.i();
    }
    
    private void i() {
        final AppWidgetManager instance = AppWidgetManager.getInstance(this.M);
        final ComponentName k = this.K;
        if (k != null) {
            instance.updateAppWidget(k, this.L);
        }
        else {
            instance.updateAppWidget(this.J, this.L);
        }
    }
    
    public void d(@j0 final Bitmap bitmap, @k0 final f<? super Bitmap> f) {
        this.g(bitmap);
    }
    
    @Override
    public void p(@k0 final Drawable drawable) {
        this.g(null);
    }
}
