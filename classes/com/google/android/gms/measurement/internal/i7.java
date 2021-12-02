// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.util.d0;
import androidx.annotation.c1;
import java.net.URLConnection;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import android.os.Build$VERSION;
import javax.net.ssl.SSLSocketFactory;

public final class i7 extends u5
{
    private final SSLSocketFactory c;
    
    i7(final z4 z4) {
        super(z4);
        ia c;
        if (Build$VERSION.SDK_INT < 19) {
            c = new ia(HttpsURLConnection.getDefaultSSLSocketFactory());
        }
        else {
            c = null;
        }
        this.c = c;
    }
    
    @Override
    protected final boolean g() {
        return false;
    }
    
    @c1
    @d0
    protected final HttpURLConnection l(final URL url) throws IOException {
        final URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpURLConnection) {
            final SSLSocketFactory c = this.c;
            if (c != null && openConnection instanceof HttpsURLConnection) {
                ((HttpsURLConnection)openConnection).setSSLSocketFactory(c);
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
}
