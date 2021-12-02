// 
// Decompiled by Procyon v0.5.36
// 

package a3;

import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import com.google.firebase.crashlytics.internal.f;
import java.io.IOException;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;

public class a
{
    private static final String d = "GET";
    private static final int e = 10000;
    private static final int f = 8192;
    private final String a;
    private final Map<String, String> b;
    private final Map<String, String> c;
    
    public a(final String a, final Map<String, String> b) {
        this.a = a;
        this.b = b;
        this.c = new HashMap<String, String>();
    }
    
    private String a(final Map<String, String> map) {
        final StringBuilder sb = new StringBuilder();
        final Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        Map.Entry<String, String> entry = iterator.next();
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(entry.getKey());
        sb2.append("=");
        StringBuilder sb3 = sb2;
    Label_0080_Outer:
        while (true) {
            if (entry.getValue() == null) {
                break Label_0095;
            }
            sb3 = sb2;
            while (true) {
                String str = entry.getValue();
                Label_0099: {
                    break Label_0099;
                    str = "";
                }
                sb3.append(str);
                sb.append(sb3.toString());
                if (!iterator.hasNext()) {
                    return sb.toString();
                }
                entry = iterator.next();
                final StringBuilder sb4 = new StringBuilder();
                sb4.append("&");
                sb4.append(entry.getKey());
                sb4.append("=");
                sb3 = sb4;
                if (entry.getValue() != null) {
                    sb3 = sb4;
                    continue;
                }
                break;
            }
            continue Label_0080_Outer;
        }
    }
    
    private String b(final String s, final Map<String, String> map) {
        final String a = this.a(map);
        if (a.isEmpty()) {
            return s;
        }
        if (s.contains("?")) {
            String string = a;
            if (!s.endsWith("&")) {
                final StringBuilder sb = new StringBuilder();
                sb.append("&");
                sb.append(a);
                string = sb.toString();
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(s);
            sb2.append(string);
            return sb2.toString();
        }
        final StringBuilder sb3 = new StringBuilder();
        sb3.append(s);
        sb3.append("?");
        sb3.append(a);
        return sb3.toString();
    }
    
    private String f(final InputStream in) throws IOException {
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in, "UTF-8"));
        final char[] array = new char[8192];
        final StringBuilder sb = new StringBuilder();
        while (true) {
            final int read = bufferedReader.read(array);
            if (read == -1) {
                break;
            }
            sb.append(array, 0, read);
        }
        return sb.toString();
    }
    
    public c c() throws IOException {
        InputStream inputStream = null;
        final String s = null;
        HttpURLConnection httpURLConnection;
        try {
            final String b = this.b(this.a, this.b);
            final f f = com.google.firebase.crashlytics.internal.f.f();
            final StringBuilder sb = new StringBuilder();
            sb.append("GET Request URL: ");
            sb.append(b);
            f.k(sb.toString());
            final HttpsURLConnection httpsURLConnection = (HttpsURLConnection)new URL(b).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("GET");
                for (final Map.Entry<String, String> entry : this.c.entrySet()) {
                    httpsURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                }
                httpsURLConnection.connect();
                final int responseCode = httpsURLConnection.getResponseCode();
                final InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        this.f(inputStream2);
                    }
                    finally {
                        inputStream = inputStream2;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new c(responseCode, s);
            }
            finally {}
        }
        finally {
            httpURLConnection = null;
        }
        if (inputStream != null) {
            inputStream.close();
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }
    
    public a d(final String s, final String s2) {
        this.c.put(s, s2);
        return this;
    }
    
    public a e(final Map.Entry<String, String> entry) {
        return this.d(entry.getKey(), entry.getValue());
    }
}
