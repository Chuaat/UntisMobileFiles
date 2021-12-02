// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.data;

import com.bumptech.glide.h;
import com.bumptech.glide.load.a;
import androidx.annotation.j0;
import java.util.Iterator;
import java.net.URISyntaxException;
import com.bumptech.glide.load.e;
import java.util.Map;
import java.net.URL;
import java.io.IOException;
import android.util.Log;
import com.bumptech.glide.util.c;
import android.text.TextUtils;
import java.net.HttpURLConnection;
import com.bumptech.glide.load.model.g;
import androidx.annotation.b1;
import java.io.InputStream;

public class j implements d<InputStream>
{
    private static final String M = "HttpUrlFetcher";
    private static final int N = 5;
    @b1
    static final b O;
    private static final int P = -1;
    private final g G;
    private final int H;
    private final b I;
    private HttpURLConnection J;
    private InputStream K;
    private volatile boolean L;
    
    static {
        O = (b)new a();
    }
    
    public j(final g g, final int n) {
        this(g, n, j.O);
    }
    
    @b1
    j(final g g, final int h, final b i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    private InputStream c(final HttpURLConnection httpURLConnection) throws IOException {
        InputStream k;
        if (TextUtils.isEmpty((CharSequence)httpURLConnection.getContentEncoding())) {
            k = c.b(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
        }
        else {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Got non empty content encoding: ");
                sb.append(httpURLConnection.getContentEncoding());
                Log.d("HttpUrlFetcher", sb.toString());
            }
            k = httpURLConnection.getInputStream();
        }
        return this.K = k;
    }
    
    private static boolean f(final int n) {
        return n / 100 == 2;
    }
    
    private static boolean g(final int n) {
        return n / 100 == 3;
    }
    
    private InputStream h(final URL context, final int n, final URL url, final Map<String, String> map) throws IOException {
        Label_0308: {
            if (n >= 5) {
                break Label_0308;
            }
            while (true) {
                if (url == null) {
                    break Label_0038;
                }
                try {
                    if (context.toURI().equals(url.toURI())) {
                        throw new e("In re-direct loop");
                    }
                    this.J = this.I.a(context);
                    for (final Map.Entry<String, String> entry : map.entrySet()) {
                        this.J.addRequestProperty(entry.getKey(), entry.getValue());
                    }
                    this.J.setConnectTimeout(this.H);
                    this.J.setReadTimeout(this.H);
                    this.J.setUseCaches(false);
                    this.J.setDoInput(true);
                    this.J.setInstanceFollowRedirects(false);
                    this.J.connect();
                    this.K = this.J.getInputStream();
                    if (this.L) {
                        return null;
                    }
                    final int responseCode = this.J.getResponseCode();
                    if (f(responseCode)) {
                        return this.c(this.J);
                    }
                    if (g(responseCode)) {
                        final String headerField = this.J.getHeaderField("Location");
                        if (!TextUtils.isEmpty((CharSequence)headerField)) {
                            final URL url2 = new URL(context, headerField);
                            this.b();
                            return this.h(url2, n + 1, context, map);
                        }
                        throw new e("Received empty or null redirect url");
                    }
                    else {
                        if (responseCode == -1) {
                            throw new e(responseCode);
                        }
                        throw new e(this.J.getResponseMessage(), responseCode);
                    }
                    throw new e("Too many (> 5) redirects!");
                }
                catch (URISyntaxException ex) {
                    continue;
                }
                break;
            }
        }
    }
    
    @j0
    @Override
    public Class<InputStream> a() {
        return InputStream.class;
    }
    
    @Override
    public void b() {
        final InputStream k = this.K;
        if (k != null) {
            try {
                k.close();
            }
            catch (IOException ex) {}
        }
        final HttpURLConnection j = this.J;
        if (j != null) {
            j.disconnect();
        }
        this.J = null;
    }
    
    @Override
    public void cancel() {
        this.L = true;
    }
    
    @j0
    @Override
    public com.bumptech.glide.load.a d() {
        return com.bumptech.glide.load.a.H;
    }
    
    @Override
    public void e(@j0 final h h, @j0 final d.a<? super InputStream> a) {
        final long b = com.bumptech.glide.util.g.b();
        try {
            Label_0098: {
                try {
                    a.f(this.h(this.G.i(), 0, null, this.G.e()));
                    if (Log.isLoggable("HttpUrlFetcher", 2)) {
                        final StringBuilder sb = new StringBuilder();
                        break Label_0098;
                    }
                }
                finally {
                    if (Log.isLoggable("HttpUrlFetcher", 2)) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("Finished http url fetcher fetch in ");
                        sb2.append(com.bumptech.glide.util.g.a(b));
                        Log.v("HttpUrlFetcher", sb2.toString());
                    }
                    // iftrue(Label_0125:, !Log.isLoggable("HttpUrlFetcher", 2))
                    while (true) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Finished http url fetcher fetch in ");
                        sb.append(com.bumptech.glide.util.g.a(b));
                        Log.v("HttpUrlFetcher", sb.toString());
                        return;
                        final IOException ex;
                        Log.d("HttpUrlFetcher", "Failed to load data for url", (Throwable)ex);
                        a.c(ex);
                        continue;
                    }
                    Label_0125:;
                }
            }
        }
        catch (IOException ex2) {}
    }
    
    private static class a implements b
    {
        a() {
        }
        
        @Override
        public HttpURLConnection a(final URL url) throws IOException {
            return (HttpURLConnection)url.openConnection();
        }
    }
    
    interface b
    {
        HttpURLConnection a(final URL p0) throws IOException;
    }
}
