// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.remoteconfig.internal;

import androidx.annotation.Keep;
import com.google.firebase.remoteconfig.q;
import androidx.annotation.b1;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.io.BufferedOutputStream;
import java.util.Iterator;
import java.net.HttpURLConnection;
import com.google.android.gms.common.util.n;
import android.util.Log;
import com.google.android.gms.common.util.a;
import java.io.IOException;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URLConnection;
import java.util.regex.Matcher;
import org.json.JSONArray;
import java.util.Date;
import android.content.pm.PackageInfo;
import java.util.Locale;
import android.content.pm.PackageManager$NameNotFoundException;
import com.google.firebase.remoteconfig.m;
import java.util.TimeZone;
import android.os.Build$VERSION;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import android.content.Context;
import java.util.regex.Pattern;

public class ConfigFetchHttpClient
{
    private static final String h = "X-Goog-Api-Key";
    private static final String i = "ETag";
    private static final String j = "If-None-Match";
    private static final String k = "X-Android-Package";
    private static final String l = "X-Android-Cert";
    private static final String m = "X-Google-GFE-Can-Retry";
    private static final String n = "X-Goog-Firebase-Installations-Auth";
    private static final Pattern o;
    private final Context a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final long f;
    private final long g;
    
    static {
        o = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    }
    
    public ConfigFetchHttpClient(final Context a, final String b, final String c, final String e, final long f, final long g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = e(b);
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    private boolean a(final JSONObject jsonObject) {
        try {
            return jsonObject.get("state").equals("NO_CHANGE") ^ true;
        }
        catch (JSONException ex) {
            return true;
        }
    }
    
    private JSONObject b(String s, final String s2, final Map<String, String> map) throws m {
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        Label_0238: {
            if (s == null) {
                break Label_0238;
            }
            hashMap.put("appInstanceId", s);
            hashMap.put("appInstanceIdToken", s2);
            hashMap.put("appId", this.b);
            final Locale locale = this.a.getResources().getConfiguration().locale;
            hashMap.put("countryCode", locale.getCountry());
            final int sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT >= 21) {
                s = locale.toLanguageTag();
            }
            else {
                s = locale.toString();
            }
            hashMap.put("languageCode", s);
            hashMap.put("platformVersion", Integer.toString(sdk_INT));
            hashMap.put("timeZone", TimeZone.getDefault().getID());
            while (true) {
                try {
                    final PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 0);
                    if (packageInfo != null) {
                        hashMap.put("appVersion", packageInfo.versionName);
                    }
                    hashMap.put("packageName", this.a.getPackageName());
                    hashMap.put("sdkVersion", "20.0.1");
                    hashMap.put("analyticsUserProperties", (String)new JSONObject((Map)map));
                    return new JSONObject((Map)hashMap);
                    throw new m("Fetch failed: Firebase installation id is null.");
                }
                catch (PackageManager$NameNotFoundException ex) {
                    continue;
                }
                break;
            }
        }
    }
    
    private static g d(JSONObject jsonObject, final Date date) throws m {
        try {
            final g.b e = g.g().e(date);
            final JSONObject jsonObject2 = null;
            JSONObject jsonObject3;
            try {
                jsonObject3 = jsonObject.getJSONObject("entries");
            }
            catch (JSONException ex2) {
                jsonObject3 = null;
            }
            if (jsonObject3 != null) {
                e.c(jsonObject3);
            }
            JSONArray jsonArray;
            try {
                jsonArray = jsonObject.getJSONArray("experimentDescriptions");
            }
            catch (JSONException ex3) {
                jsonArray = null;
            }
            if (jsonArray != null) {
                e.d(jsonArray);
            }
            try {
                jsonObject = jsonObject.getJSONObject("personalizationMetadata");
            }
            catch (JSONException ex4) {
                jsonObject = jsonObject2;
            }
            if (jsonObject != null) {
                e.f(jsonObject);
            }
            return e.a();
        }
        catch (JSONException ex) {
            throw new m("Fetch failed: fetch response could not be parsed.", (Throwable)ex);
        }
    }
    
    private static String e(String group) {
        final Matcher matcher = ConfigFetchHttpClient.o.matcher(group);
        if (matcher.matches()) {
            group = matcher.group(1);
        }
        else {
            group = null;
        }
        return group;
    }
    
    private JSONObject g(final URLConnection urlConnection) throws IOException, JSONException {
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream(), "utf-8"));
        final StringBuilder sb = new StringBuilder();
        while (true) {
            final int read = bufferedReader.read();
            if (read == -1) {
                break;
            }
            sb.append((char)read);
        }
        return new JSONObject(sb.toString());
    }
    
    private String h(final String s, final String s2) {
        return String.format("https://firebaseremoteconfig.googleapis.com/v1/projects/%s/namespaces/%s:fetch", s, s2);
    }
    
    private String i() {
        try {
            final Context a = this.a;
            final byte[] b = com.google.android.gms.common.util.a.b(a, a.getPackageName());
            if (b == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Could not get fingerprint hash for package: ");
                sb.append(this.a.getPackageName());
                Log.e("FirebaseRemoteConfig", sb.toString());
                return null;
            }
            return com.google.android.gms.common.util.n.c(b, false);
        }
        catch (PackageManager$NameNotFoundException ex) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("No such package: ");
            sb2.append(this.a.getPackageName());
            Log.e("FirebaseRemoteConfig", sb2.toString(), (Throwable)ex);
            return null;
        }
    }
    
    private void k(final HttpURLConnection httpURLConnection, final String value) {
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.c);
        httpURLConnection.setRequestProperty("X-Android-Package", this.a.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", this.i());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", value);
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
    }
    
    private void l(final HttpURLConnection httpURLConnection, final Map<String, String> map) {
        for (final Map.Entry<String, String> entry : map.entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
    }
    
    private void m(final HttpURLConnection httpURLConnection, final byte[] b) throws IOException {
        httpURLConnection.setFixedLengthStreamingMode(b.length);
        final BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(b);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }
    
    private void n(final HttpURLConnection httpURLConnection, final String value, final String s, final Map<String, String> map) {
        httpURLConnection.setDoOutput(true);
        final TimeUnit seconds = TimeUnit.SECONDS;
        httpURLConnection.setConnectTimeout((int)seconds.toMillis(this.f));
        httpURLConnection.setReadTimeout((int)seconds.toMillis(this.g));
        httpURLConnection.setRequestProperty("If-None-Match", value);
        this.k(httpURLConnection, s);
        this.l(httpURLConnection, map);
    }
    
    HttpURLConnection c() throws com.google.firebase.remoteconfig.n {
        try {
            return (HttpURLConnection)new URL(this.h(this.d, this.e)).openConnection();
        }
        catch (IOException ex) {
            throw new com.google.firebase.remoteconfig.n(ex.getMessage());
        }
    }
    
    @b1
    public long f() {
        return this.f;
    }
    
    @Keep
    l.a fetch(final HttpURLConnection httpURLConnection, String g, String headerField, final Map<String, String> map, final String s, final Map<String, String> map2, final Date date) throws com.google.firebase.remoteconfig.n {
        this.n(httpURLConnection, s, headerField, map2);
        try {
            this.m(httpURLConnection, this.b(g, headerField, map).toString().getBytes("utf-8"));
            httpURLConnection.connect();
            final int responseCode = httpURLConnection.getResponseCode();
            if (responseCode != 200) {
                g = (String)new q(responseCode, httpURLConnection.getResponseMessage());
                throw g;
            }
            headerField = httpURLConnection.getHeaderField("ETag");
            g = (String)this.g(httpURLConnection);
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
            }
            catch (IOException ex) {}
            if (!this.a((JSONObject)g)) {
                return com.google.firebase.remoteconfig.internal.l.a.a(date);
            }
            return com.google.firebase.remoteconfig.internal.l.a.b(d((JSONObject)g, date), headerField);
        }
        catch (JSONException ex2) {}
        catch (IOException ex3) {}
        finally {
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
            }
            catch (IOException ex4) {}
            throw new m("The client had an error while calling the backend!", (Throwable)g);
        }
    }
    
    @b1
    public long j() {
        return this.g;
    }
}
