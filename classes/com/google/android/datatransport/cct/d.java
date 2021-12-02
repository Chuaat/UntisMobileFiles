// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.cct;

import androidx.annotation.k0;
import java.util.Locale;
import android.os.Build;
import android.os.Build$VERSION;
import java.net.MalformedURLException;
import java.util.zip.GZIPInputStream;
import java.util.TimeZone;
import java.util.Calendar;
import android.telephony.TelephonyManager;
import com.google.android.datatransport.runtime.h;
import java.util.Iterator;
import java.nio.charset.Charset;
import com.google.android.datatransport.cct.internal.l;
import com.google.android.datatransport.cct.internal.k;
import com.google.android.datatransport.cct.internal.p;
import java.util.List;
import java.util.Map;
import com.google.android.datatransport.cct.internal.m;
import com.google.android.datatransport.runtime.i;
import java.util.ArrayList;
import java.util.HashMap;
import com.google.android.datatransport.runtime.backends.g;
import android.content.pm.PackageManager$NameNotFoundException;
import com.google.android.datatransport.cct.internal.o;
import android.net.NetworkInfo;
import java.io.Closeable;
import java.net.ConnectException;
import java.net.UnknownHostException;
import com.google.firebase.encoders.c;
import java.io.IOException;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.Writer;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.zip.GZIPOutputStream;
import java.net.HttpURLConnection;
import com.google.android.datatransport.cct.internal.j;
import java.net.URL;
import android.content.Context;
import android.net.ConnectivityManager;
import com.google.firebase.encoders.a;
import androidx.annotation.b1;
import com.google.android.datatransport.runtime.backends.n;

final class d implements n
{
    private static final String A = "fingerprint";
    private static final String B = "locale";
    private static final String C = "country";
    private static final String D = "mcc_mnc";
    private static final String E = "tz-offset";
    private static final String F = "application_build";
    private static final String h = "CctTransportBackend";
    private static final int i = 30000;
    private static final int j = 40000;
    private static final int k = -1;
    private static final String l = "Accept-Encoding";
    private static final String m = "Content-Encoding";
    private static final String n = "gzip";
    private static final String o = "Content-Type";
    static final String p = "X-Goog-Api-Key";
    private static final String q = "application/json";
    @b1
    static final String r = "net-type";
    @b1
    static final String s = "mobile-subtype";
    private static final String t = "sdk-version";
    private static final String u = "model";
    private static final String v = "hardware";
    private static final String w = "device";
    private static final String x = "product";
    private static final String y = "os-uild";
    private static final String z = "manufacturer";
    private final com.google.firebase.encoders.a a;
    private final ConnectivityManager b;
    private final Context c;
    final URL d;
    private final com.google.android.datatransport.runtime.time.a e;
    private final com.google.android.datatransport.runtime.time.a f;
    private final int g;
    
    d(final Context context, final com.google.android.datatransport.runtime.time.a a, final com.google.android.datatransport.runtime.time.a a2) {
        this(context, a, a2, 40000);
    }
    
    d(final Context c, final com.google.android.datatransport.runtime.time.a f, final com.google.android.datatransport.runtime.time.a e, final int g) {
        this.a = com.google.android.datatransport.cct.internal.j.b();
        this.c = c;
        this.b = (ConnectivityManager)c.getSystemService("connectivity");
        this.d = n(com.google.android.datatransport.cct.a.d);
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    private b e(a inputStream) throws IOException {
        z1.a.b("CctTransportBackend", "Making request to: %s", ((a)inputStream).a);
        final HttpURLConnection httpURLConnection = (HttpURLConnection)((a)inputStream).a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.0.0"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        final String c = ((a)inputStream).c;
        if (c != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", c);
        }
        try {
            final OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                Closeable out = new GZIPOutputStream(outputStream);
                try {
                    this.a.b((Object)((a)inputStream).b, (Writer)new BufferedWriter(new OutputStreamWriter((OutputStream)out)));
                    ((OutputStream)out).close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    final int responseCode = httpURLConnection.getResponseCode();
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Status Code: ");
                    sb.append(responseCode);
                    z1.a.g("CctTransportBackend", sb.toString());
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Content-Type: ");
                    sb2.append(httpURLConnection.getHeaderField("Content-Type"));
                    z1.a.g("CctTransportBackend", sb2.toString());
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("Content-Encoding: ");
                    sb3.append(httpURLConnection.getHeaderField("Content-Encoding"));
                    z1.a.g("CctTransportBackend", sb3.toString());
                    if (responseCode != 302 && responseCode != 301) {
                        if (responseCode != 307) {
                            if (responseCode != 200) {
                                return new b(responseCode, null, 0L);
                            }
                            inputStream = (IOException)httpURLConnection.getInputStream();
                            try {
                                final InputStream m = m((InputStream)inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                                try {
                                    out = new BufferedReader(new InputStreamReader(m));
                                    final b b = new b(responseCode, null, com.google.android.datatransport.cct.internal.n.b((Reader)out).c());
                                    if (m != null) {
                                        m.close();
                                    }
                                    if (inputStream != null) {
                                        ((InputStream)inputStream).close();
                                    }
                                    return b;
                                }
                                finally {
                                    if (m != null) {
                                        try {
                                            m.close();
                                        }
                                        finally {
                                            final Throwable exception;
                                            ((Throwable)outputStream).addSuppressed(exception);
                                        }
                                    }
                                }
                            }
                            finally {
                                if (inputStream != null) {
                                    try {
                                        ((InputStream)inputStream).close();
                                    }
                                    finally {
                                        final Throwable t;
                                        final Throwable exception2;
                                        t.addSuppressed(exception2);
                                    }
                                }
                            }
                        }
                    }
                    return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                }
                finally {
                    try {
                        ((OutputStream)out).close();
                    }
                    finally {
                        final Throwable exception3;
                        inputStream.addSuppressed(exception3);
                    }
                }
            }
            finally {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    }
                    finally {
                        final Throwable exception4;
                        inputStream.addSuppressed(exception4);
                    }
                }
            }
        }
        catch (IOException inputStream) {
            goto Label_0526;
        }
        catch (c c2) {}
        catch (UnknownHostException inputStream) {}
        catch (ConnectException ex) {}
        z1.a.e("CctTransportBackend", "Couldn't open connection, returning with 500", inputStream);
        return new b(500, null, 0L);
    }
    
    private static int f(final NetworkInfo networkInfo) {
        o.b b;
        if (networkInfo == null) {
            b = com.google.android.datatransport.cct.internal.o.b.H;
        }
        else {
            int subtype = networkInfo.getSubtype();
            if (subtype != -1) {
                if (com.google.android.datatransport.cct.internal.o.b.b(subtype) == null) {
                    subtype = 0;
                }
                return subtype;
            }
            b = com.google.android.datatransport.cct.internal.o.b.b0;
        }
        return b.d();
    }
    
    private static int g(final NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return com.google.android.datatransport.cct.internal.o.c.Z.d();
        }
        return networkInfo.getType();
    }
    
    private static int h(final Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        }
        catch (PackageManager$NameNotFoundException ex) {
            z1.a.e("CctTransportBackend", "Unable to find version code for package", (Throwable)ex);
            return -1;
        }
    }
    
    private j i(g g) {
        final HashMap<String, ArrayList<i>> hashMap = new HashMap<String, ArrayList<i>>();
        for (final i i : g.c()) {
            final String l = i.l();
            if (!hashMap.containsKey(l)) {
                final ArrayList<i> value = new ArrayList<i>();
                value.add(i);
                hashMap.put(l, value);
            }
            else {
                hashMap.get(l).add(i);
            }
        }
        final ArrayList<m> list = new ArrayList<m>();
        final Iterator<Map.Entry<String, ArrayList<i>>> iterator2 = hashMap.entrySet().iterator();
        while (iterator2.hasNext()) {
            g = (g)iterator2.next();
            final i j = ((Map.Entry<K, List<i>>)g).getValue().get(0);
            final m.a b = com.google.android.datatransport.cct.internal.m.a().f(com.google.android.datatransport.cct.internal.p.H).g(this.f.a()).h(this.e.a()).b(com.google.android.datatransport.cct.internal.k.a().c(com.google.android.datatransport.cct.internal.k.b.I).b(com.google.android.datatransport.cct.internal.a.a().m(j.g("sdk-version")).j(j.b("model")).f(j.b("hardware")).d(j.b("device")).l(j.b("product")).k(j.b("os-uild")).h(j.b("manufacturer")).e(j.b("fingerprint")).c(j.b("country")).g(j.b("locale")).i(j.b("mcc_mnc")).b(j.b("application_build")).a()).a());
            try {
                b.i(Integer.parseInt(((Map.Entry<String, V>)g).getKey()));
            }
            catch (NumberFormatException ex) {
                b.j(((Map.Entry<String, V>)g).getKey());
            }
            final ArrayList<l> list2 = new ArrayList<l>();
            for (final i k : ((Map.Entry<K, List<i>>)g).getValue()) {
                final h e = k.e();
                final com.google.android.datatransport.c b2 = e.b();
                l.a a;
                if (b2.equals(com.google.android.datatransport.c.b("proto"))) {
                    a = com.google.android.datatransport.cct.internal.l.j(e.a());
                }
                else {
                    if (!b2.equals(com.google.android.datatransport.c.b("json"))) {
                        z1.a.h("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", b2);
                        continue;
                    }
                    a = com.google.android.datatransport.cct.internal.l.i(new String(e.a(), Charset.forName("UTF-8")));
                }
                a.c(k.f()).d(k.m()).h(k.h("tz-offset")).e(com.google.android.datatransport.cct.internal.o.a().c(com.google.android.datatransport.cct.internal.o.c.b(k.g("net-type"))).b(com.google.android.datatransport.cct.internal.o.b.b(k.g("mobile-subtype"))).a());
                if (k.d() != null) {
                    a.b(k.d());
                }
                list2.add(a.a());
            }
            b.c(list2);
            list.add(b.a());
        }
        return com.google.android.datatransport.cct.internal.j.a(list);
    }
    
    private static TelephonyManager j(final Context context) {
        return (TelephonyManager)context.getSystemService("phone");
    }
    
    @b1
    static long k() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }
    
    private static InputStream m(final InputStream in, final String anObject) throws IOException {
        if ("gzip".equals(anObject)) {
            return new GZIPInputStream(in);
        }
        return in;
    }
    
    private static URL n(final String s) {
        try {
            return new URL(s);
        }
        catch (MalformedURLException cause) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Invalid url: ");
            sb.append(s);
            throw new IllegalArgumentException(sb.toString(), cause);
        }
    }
    
    @Override
    public com.google.android.datatransport.runtime.backends.h a(final g g) {
        final j i = this.i(g);
        final URL d = this.d;
        final byte[] d2 = g.d();
        String s = null;
        final String s2 = null;
        URL n = d;
        if (d2 != null) {
            try {
                final com.google.android.datatransport.cct.a e = com.google.android.datatransport.cct.a.e(g.d());
                String f = s2;
                if (e.f() != null) {
                    f = e.f();
                }
                n = d;
                s = f;
                if (e.g() != null) {
                    n = n(e.g());
                    s = f;
                }
            }
            catch (IllegalArgumentException ex2) {
                return com.google.android.datatransport.runtime.backends.h.a();
            }
        }
        try {
            final b b = a2.b.a(5, new a(n, i, s), (a2.a<a, b, Throwable>)new com.google.android.datatransport.cct.b(this), com.google.android.datatransport.cct.c.a);
            final int a = b.a;
            if (a == 200) {
                return com.google.android.datatransport.runtime.backends.h.d(b.c);
            }
            if (a < 500 && a != 404) {
                return com.google.android.datatransport.runtime.backends.h.a();
            }
            return com.google.android.datatransport.runtime.backends.h.e();
        }
        catch (IOException ex) {
            z1.a.e("CctTransportBackend", "Could not make request to the backend", ex);
            return com.google.android.datatransport.runtime.backends.h.e();
        }
    }
    
    @Override
    public i b(final i i) {
        final NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        return i.n().a("sdk-version", Build$VERSION.SDK_INT).c("model", Build.MODEL).c("hardware", Build.HARDWARE).c("device", Build.DEVICE).c("product", Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", k()).a("net-type", g(activeNetworkInfo)).a("mobile-subtype", f(activeNetworkInfo)).c("country", Locale.getDefault().getCountry()).c("locale", Locale.getDefault().getLanguage()).c("mcc_mnc", j(this.c).getSimOperator()).c("application_build", Integer.toString(h(this.c))).d();
    }
    
    static final class a
    {
        final URL a;
        final j b;
        @k0
        final String c;
        
        a(final URL a, final j b, @k0 final String c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        a a(final URL url) {
            return new a(url, this.b, this.c);
        }
    }
    
    static final class b
    {
        final int a;
        @k0
        final URL b;
        final long c;
        
        b(final int a, @k0 final URL b, final long c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}
