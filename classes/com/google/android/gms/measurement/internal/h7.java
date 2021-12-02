// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import java.net.URLConnection;
import java.net.HttpURLConnection;
import java.io.InputStream;
import java.io.IOException;
import java.io.ByteArrayOutputStream;
import java.util.List;
import com.google.android.gms.common.internal.x;
import java.util.Map;
import java.net.URL;
import androidx.annotation.c1;

@c1
final class h7 implements Runnable
{
    private final URL G;
    private final String H;
    final /* synthetic */ i7 I;
    private final x4 J;
    
    public h7(final i7 i, final String h, final String g, final URL url, final byte[] array, final Map<String, String> j, final x4 x4) {
        this.I = i;
        x.g(h);
        x.k(g);
        x.k(j);
        this.G = (URL)g;
        this.J = (x4)j;
        this.H = h;
    }
    
    private final void b(final int n, final Exception ex, final byte[] array, final Map<String, List<String>> map) {
        this.I.a.b().w(new g7(this, n, ex, array, map));
    }
    
    @Override
    public final void run() {
        this.I.d();
        Map<String, List<String>> map2 = null;
        int n2 = 0;
        Map<String, List<String>> map3 = null;
        try {
            Object l = this.I.l(this.G);
            try {
                final int responseCode = ((HttpURLConnection)l).getResponseCode();
                try {
                    final Map<String, List<String>> headerFields = ((URLConnection)l).getHeaderFields();
                    InputStream inputStream;
                    byte[] byteArray;
                    try {
                        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        inputStream = ((URLConnection)l).getInputStream();
                        try {
                            final byte[] array = new byte[1024];
                            while (true) {
                                final int read = inputStream.read(array);
                                if (read <= 0) {
                                    break;
                                }
                                byteArrayOutputStream.write(array, 0, read);
                            }
                            byteArray = byteArrayOutputStream.toByteArray();
                            final InputStream inputStream2 = inputStream;
                            inputStream2.close();
                            final HttpURLConnection httpURLConnection = (HttpURLConnection)l;
                            httpURLConnection.disconnect();
                            final h7 h7 = this;
                            final int n = responseCode;
                            final Exception ex = null;
                            final byte[] array2 = byteArray;
                            final Map<String, List<String>> map = headerFields;
                            h7.b(n, ex, array2, map);
                            return;
                        }
                        finally {
                            final Object o2;
                            final Object o = o2;
                        }
                    }
                    finally {
                        final Object o3;
                        final Object o = o3;
                        inputStream = null;
                    }
                    try {
                        final InputStream inputStream2 = inputStream;
                        inputStream2.close();
                        final HttpURLConnection httpURLConnection = (HttpURLConnection)l;
                        httpURLConnection.disconnect();
                        final h7 h7 = this;
                        final int n = responseCode;
                        final Exception ex = null;
                        final byte[] array2 = byteArray;
                        final Map<String, List<String>> map = headerFields;
                        h7.b(n, ex, array2, map);
                        return;
                        inputStream.close();
                        Label_0125: {
                            throw;
                        }
                    }
                    // iftrue(Label_0125:, inputStream == null)
                    catch (IOException ex3) {}
                    finally {
                        l = headerFields;
                    }
                }
                catch (IOException ex4) {}
                finally {
                    l = null;
                }
            }
            catch (IOException ex5) {}
        }
        catch (IOException ex2) {
            map2 = null;
            n2 = 0;
            map3 = map2;
        }
        finally {
            map2 = null;
            n2 = 0;
            map3 = map2;
        }
        if (map3 != null) {
            ((HttpURLConnection)map3).disconnect();
        }
        final IOException ex2;
        this.b(n2, ex2, null, map2);
    }
}
