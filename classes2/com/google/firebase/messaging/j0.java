// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.messaging;

import java.util.concurrent.Callable;
import com.google.android.gms.tasks.p;
import java.util.concurrent.Executor;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.internal.firebase_messaging.s;
import android.graphics.BitmapFactory;
import java.net.MalformedURLException;
import android.text.TextUtils;
import java.net.URLConnection;
import com.google.android.gms.internal.firebase_messaging.z;
import java.io.IOException;
import android.util.Log;
import com.google.android.gms.internal.firebase_messaging.r;
import java.io.InputStream;
import androidx.annotation.k0;
import android.graphics.Bitmap;
import com.google.android.gms.tasks.m;
import java.net.URL;
import java.io.Closeable;

class j0 implements Closeable
{
    private final URL G;
    @k0
    private m<Bitmap> H;
    @k0
    private volatile InputStream I;
    
    private j0(final URL g) {
        this.G = g;
    }
    
    private byte[] b() throws IOException {
        final URLConnection openConnection = this.G.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            Object o = openConnection.getInputStream();
            try {
                this.I = (InputStream)o;
                final byte[] a = r.a(r.b((InputStream)o, 1048577L));
                if (o != null) {
                    ((InputStream)o).close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    o = String.valueOf(this.G);
                    final StringBuilder sb = new StringBuilder(((String)o).length() + 34);
                    sb.append("Downloaded ");
                    sb.append(a.length);
                    sb.append(" bytes from ");
                    sb.append((String)o);
                    Log.v("FirebaseMessaging", sb.toString());
                }
                if (a.length <= 1048576) {
                    return a;
                }
                throw new IOException("Image exceeds max size of 1048576");
            }
            finally {
                if (o != null) {
                    try {
                        ((InputStream)o).close();
                    }
                    finally {
                        final Throwable t;
                        final Throwable t2;
                        z.a(t, t2);
                    }
                }
            }
        }
        throw new IOException("Content-Length exceeds max size of 1048576");
    }
    
    @k0
    public static j0 c(String str) {
        if (TextUtils.isEmpty((CharSequence)str)) {
            return null;
        }
        try {
            return new j0(new URL(str));
        }
        catch (MalformedURLException ex) {
            str = String.valueOf(str);
            if (str.length() != 0) {
                str = "Not downloading image, bad URL: ".concat(str);
            }
            else {
                str = new String("Not downloading image, bad URL: ");
            }
            Log.w("FirebaseMessaging", str);
            return null;
        }
    }
    
    public Bitmap a() throws IOException {
        final String value = String.valueOf(this.G);
        final StringBuilder sb = new StringBuilder(value.length() + 22);
        sb.append("Starting download of: ");
        sb.append(value);
        Log.i("FirebaseMessaging", sb.toString());
        final byte[] b = this.b();
        final Bitmap decodeByteArray = BitmapFactory.decodeByteArray(b, 0, b.length);
        if (decodeByteArray != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                final String value2 = String.valueOf(this.G);
                final StringBuilder sb2 = new StringBuilder(value2.length() + 31);
                sb2.append("Successfully downloaded image: ");
                sb2.append(value2);
                Log.d("FirebaseMessaging", sb2.toString());
            }
            return decodeByteArray;
        }
        final String value3 = String.valueOf(this.G);
        final StringBuilder sb3 = new StringBuilder(value3.length() + 24);
        sb3.append("Failed to decode image: ");
        sb3.append(value3);
        throw new IOException(sb3.toString());
    }
    
    @Override
    public void close() {
        try {
            s.a(this.I);
        }
        catch (NullPointerException ex) {
            Log.e("FirebaseMessaging", "Failed to close the image download stream.", (Throwable)ex);
        }
    }
    
    public m<Bitmap> d() {
        return (m<Bitmap>)x.k((Object)this.H);
    }
    
    public void e(final Executor executor) {
        this.H = (m<Bitmap>)p.d(executor, (Callable)new i0(this));
    }
}
