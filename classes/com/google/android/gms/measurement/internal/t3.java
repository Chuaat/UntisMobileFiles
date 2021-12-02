// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import android.net.NetworkInfo;
import android.net.ConnectivityManager;
import com.google.android.gms.common.util.d0;
import androidx.annotation.c1;
import java.net.URLConnection;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import android.os.Build$VERSION;
import javax.net.ssl.SSLSocketFactory;

public final class t3 extends p9
{
    private final SSLSocketFactory d;
    
    public t3(final z9 z9) {
        super(z9);
        ia d;
        if (Build$VERSION.SDK_INT < 19) {
            d = new ia(HttpsURLConnection.getDefaultSSLSocketFactory());
        }
        else {
            d = null;
        }
        this.d = d;
    }
    
    @Override
    protected final boolean i() {
        return false;
    }
    
    @c1
    @d0
    protected final HttpURLConnection j(final URL url) throws IOException {
        final URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpURLConnection) {
            final SSLSocketFactory d = this.d;
            if (d != null && openConnection instanceof HttpsURLConnection) {
                ((HttpsURLConnection)openConnection).setSSLSocketFactory(d);
            }
            final HttpsURLConnection httpsURLConnection = (HttpsURLConnection)openConnection;
            httpsURLConnection.setDefaultUseCaches(false);
            super.a.w();
            httpsURLConnection.setConnectTimeout(60000);
            super.a.w();
            httpsURLConnection.setReadTimeout(61000);
            httpsURLConnection.setInstanceFollowRedirects(false);
            httpsURLConnection.setDoInput(true);
            return httpsURLConnection;
        }
        throw new IOException("Failed to obtain HTTP connection");
    }
    
    public final boolean k() {
        this.f();
        final ConnectivityManager connectivityManager = (ConnectivityManager)super.a.X().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo;
        final NetworkInfo networkInfo = activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            }
            catch (SecurityException ex) {
                activeNetworkInfo = networkInfo;
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
