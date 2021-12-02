// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.installations.remote;

import android.net.TrafficStats;
import java.net.URLConnection;
import java.io.InputStream;
import java.io.Reader;
import android.util.JsonReader;
import java.io.InputStreamReader;
import com.google.android.gms.common.internal.x;
import java.net.HttpURLConnection;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import android.content.pm.PackageManager$NameNotFoundException;
import com.google.android.gms.common.util.n;
import android.util.Log;
import com.google.android.gms.common.util.a;
import org.json.JSONException;
import org.json.JSONObject;
import android.text.TextUtils;
import androidx.annotation.k0;
import androidx.annotation.j0;
import com.google.firebase.heartbeatinfo.k;
import com.google.firebase.platforminfo.i;
import n3.b;
import android.content.Context;
import com.google.android.gms.common.util.d0;
import java.nio.charset.Charset;
import java.util.regex.Pattern;

public class c
{
    private static final String A = "X-Android-Cert";
    private static final String B = "x-goog-fis-android-iid-migration-auth";
    private static final String C = "x-goog-api-key";
    private static final int D = 10000;
    private static final Pattern E;
    private static final int F = 1;
    private static final Charset G;
    private static final String H = "a:";
    private static final String I = "Firebase-Installations";
    @d0
    static final String J = "Invalid Expiration Timestamp.";
    private static final int f = 32768;
    private static final int g = 32769;
    private static final int h = 32770;
    private static final int i = 32771;
    private static final String j = "firebaseinstallations.googleapis.com";
    private static final String k = "projects/%s/installations";
    private static final String l = "projects/%s/installations/%s/authTokens:generate";
    private static final String m = "projects/%s/installations/%s";
    private static final String n = "v1";
    private static final String o = "FIS_v2";
    private static final String p = "Content-Type";
    private static final String q = "Accept";
    private static final String r = "application/json";
    private static final String s = "Content-Encoding";
    private static final String t = "gzip";
    private static final String u = "Cache-Control";
    private static final String v = "no-cache";
    private static final String w = "fire-installations-id";
    private static final String x = "x-firebase-client-log-type";
    private static final String y = "x-firebase-client";
    private static final String z = "X-Android-Package";
    private boolean a;
    private final Context b;
    private final b<i> c;
    private final b<k> d;
    private final e e;
    
    static {
        E = Pattern.compile("[0-9]+s");
        G = Charset.forName("UTF-8");
    }
    
    public c(@j0 final Context b, @j0 final b<i> c, @j0 final b<k> d) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = new e();
    }
    
    private static String a(@k0 String string, @j0 final String s, @j0 final String s2) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            string = "";
        }
        else {
            final StringBuilder sb = new StringBuilder();
            sb.append(", ");
            sb.append(string);
            string = sb.toString();
        }
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", s, s2, string);
    }
    
    private static JSONObject b(@k0 final String s, @j0 final String s2) {
        try {
            final JSONObject jsonObject = new JSONObject();
            jsonObject.put("fid", (Object)s);
            jsonObject.put("appId", (Object)s2);
            jsonObject.put("authVersion", (Object)"FIS_v2");
            jsonObject.put("sdkVersion", (Object)"a:17.0.0");
            return jsonObject;
        }
        catch (JSONException cause) {
            throw new IllegalStateException((Throwable)cause);
        }
    }
    
    private static JSONObject c() {
        try {
            final JSONObject jsonObject = new JSONObject();
            jsonObject.put("sdkVersion", (Object)"a:17.0.0");
            final JSONObject jsonObject2 = new JSONObject();
            jsonObject2.put("installation", (Object)jsonObject);
            return jsonObject2;
        }
        catch (JSONException cause) {
            throw new IllegalStateException((Throwable)cause);
        }
    }
    
    private String g() {
        try {
            final Context b = this.b;
            final byte[] b2 = com.google.android.gms.common.util.a.b(b, b.getPackageName());
            if (b2 == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Could not get fingerprint hash for package: ");
                sb.append(this.b.getPackageName());
                Log.e("ContentValues", sb.toString());
                return null;
            }
            return com.google.android.gms.common.util.n.c(b2, false);
        }
        catch (PackageManager$NameNotFoundException ex) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("No such package: ");
            sb2.append(this.b.getPackageName());
            Log.e("ContentValues", sb2.toString(), (Throwable)ex);
            return null;
        }
    }
    
    private URL h(final String s) throws com.google.firebase.installations.k {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", s));
        }
        catch (MalformedURLException ex) {
            throw new com.google.firebase.installations.k(ex.getMessage(), com.google.firebase.installations.k.a.H);
        }
    }
    
    private static byte[] i(final JSONObject jsonObject) throws IOException {
        return jsonObject.toString().getBytes("UTF-8");
    }
    
    private static boolean j(final int n) {
        return n >= 200 && n < 300;
    }
    
    private static void k() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }
    
    private static void l(final HttpURLConnection httpURLConnection, @k0 final String s, @j0 final String s2, @j0 final String s3) {
        final String p4 = p(httpURLConnection);
        if (!TextUtils.isEmpty((CharSequence)p4)) {
            Log.w("Firebase-Installations", p4);
            Log.w("Firebase-Installations", a(s, s2, s3));
        }
    }
    
    private HttpURLConnection m(final URL url, final String value) throws com.google.firebase.installations.k {
        try {
            final HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.b.getPackageName());
            if (this.d.get() != null && this.c.get() != null) {
                final k.a b = this.d.get().b("fire-installations-id");
                if (b != com.google.firebase.heartbeatinfo.k.a.H) {
                    httpURLConnection.addRequestProperty("x-firebase-client", this.c.get().a());
                    httpURLConnection.addRequestProperty("x-firebase-client-log-type", Integer.toString(b.b()));
                }
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", this.g());
            httpURLConnection.addRequestProperty("x-goog-api-key", value);
            return httpURLConnection;
        }
        catch (IOException ex) {
            throw new com.google.firebase.installations.k("Firebase Installations Service is unavailable. Please try again later.", com.google.firebase.installations.k.a.H);
        }
    }
    
    @d0
    static long n(final String input) {
        com.google.android.gms.common.internal.x.b(c.E.matcher(input).matches(), (Object)"Invalid Expiration Timestamp.");
        long long1;
        if (input != null && input.length() != 0) {
            long1 = Long.parseLong(input.substring(0, input.length() - 1));
        }
        else {
            long1 = 0L;
        }
        return long1;
    }
    
    private d o(final HttpURLConnection httpURLConnection) throws AssertionError, IOException {
        final InputStream inputStream = httpURLConnection.getInputStream();
        final JsonReader jsonReader = new JsonReader((Reader)new InputStreamReader(inputStream, com.google.firebase.installations.remote.c.G));
        final f.a a = com.google.firebase.installations.remote.f.a();
        final d.a a2 = com.google.firebase.installations.remote.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                a2.f(jsonReader.nextString());
            }
            else if (nextName.equals("fid")) {
                a2.c(jsonReader.nextString());
            }
            else if (nextName.equals("refreshToken")) {
                a2.d(jsonReader.nextString());
            }
            else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    final String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        a.c(jsonReader.nextString());
                    }
                    else if (nextName2.equals("expiresIn")) {
                        a.d(n(jsonReader.nextString()));
                    }
                    else {
                        jsonReader.skipValue();
                    }
                }
                a2.b(a.a());
                jsonReader.endObject();
            }
            else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return a2.e(com.google.firebase.installations.remote.d.b.G).a();
    }
    
    @k0
    private static String p(final HttpURLConnection p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   java/net/HttpURLConnection.getErrorStream:()Ljava/io/InputStream;
        //     4: astore_1       
        //     5: aload_1        
        //     6: ifnonnull       11
        //     9: aconst_null    
        //    10: areturn        
        //    11: new             Ljava/io/BufferedReader;
        //    14: dup            
        //    15: new             Ljava/io/InputStreamReader;
        //    18: dup            
        //    19: aload_1        
        //    20: getstatic       com/google/firebase/installations/remote/c.G:Ljava/nio/charset/Charset;
        //    23: invokespecial   java/io/InputStreamReader.<init>:(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
        //    26: invokespecial   java/io/BufferedReader.<init>:(Ljava/io/Reader;)V
        //    29: astore_1       
        //    30: new             Ljava/lang/StringBuilder;
        //    33: astore_2       
        //    34: aload_2        
        //    35: invokespecial   java/lang/StringBuilder.<init>:()V
        //    38: aload_1        
        //    39: invokevirtual   java/io/BufferedReader.readLine:()Ljava/lang/String;
        //    42: astore_3       
        //    43: aload_3        
        //    44: ifnull          63
        //    47: aload_2        
        //    48: aload_3        
        //    49: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    52: pop            
        //    53: aload_2        
        //    54: bipush          10
        //    56: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    59: pop            
        //    60: goto            38
        //    63: ldc_w           "Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]"
        //    66: iconst_3       
        //    67: anewarray       Ljava/lang/Object;
        //    70: dup            
        //    71: iconst_0       
        //    72: aload_0        
        //    73: invokevirtual   java/net/HttpURLConnection.getResponseCode:()I
        //    76: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    79: aastore        
        //    80: dup            
        //    81: iconst_1       
        //    82: aload_0        
        //    83: invokevirtual   java/net/HttpURLConnection.getResponseMessage:()Ljava/lang/String;
        //    86: aastore        
        //    87: dup            
        //    88: iconst_2       
        //    89: aload_2        
        //    90: aastore        
        //    91: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //    94: astore_0       
        //    95: aload_1        
        //    96: invokevirtual   java/io/BufferedReader.close:()V
        //    99: aload_0        
        //   100: areturn        
        //   101: astore_0       
        //   102: aload_1        
        //   103: invokevirtual   java/io/BufferedReader.close:()V
        //   106: aload_0        
        //   107: athrow         
        //   108: astore_0       
        //   109: aload_1        
        //   110: invokevirtual   java/io/BufferedReader.close:()V
        //   113: aconst_null    
        //   114: areturn        
        //   115: astore_1       
        //   116: goto            99
        //   119: astore_1       
        //   120: goto            106
        //   123: astore_0       
        //   124: goto            113
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  30     38     108    115    Ljava/io/IOException;
        //  30     38     101    108    Any
        //  38     43     108    115    Ljava/io/IOException;
        //  38     43     101    108    Any
        //  47     60     108    115    Ljava/io/IOException;
        //  47     60     101    108    Any
        //  63     95     108    115    Ljava/io/IOException;
        //  63     95     101    108    Any
        //  95     99     115    119    Ljava/io/IOException;
        //  102    106    119    123    Ljava/io/IOException;
        //  109    113    123    127    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 74 out of bounds for length 74
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:372)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:458)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private f q(final HttpURLConnection httpURLConnection) throws AssertionError, IOException {
        final InputStream inputStream = httpURLConnection.getInputStream();
        final JsonReader jsonReader = new JsonReader((Reader)new InputStreamReader(inputStream, com.google.firebase.installations.remote.c.G));
        final f.a a = com.google.firebase.installations.remote.f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                a.c(jsonReader.nextString());
            }
            else if (nextName.equals("expiresIn")) {
                a.d(n(jsonReader.nextString()));
            }
            else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return a.b(com.google.firebase.installations.remote.f.b.G).a();
    }
    
    private void r(final HttpURLConnection httpURLConnection, @k0 final String s, @j0 final String s2) throws IOException {
        t(httpURLConnection, i(b(s, s2)));
    }
    
    private void s(final HttpURLConnection httpURLConnection) throws IOException {
        t(httpURLConnection, i(c()));
    }
    
    private static void t(final URLConnection p0, final byte[] p1) throws IOException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   java/net/URLConnection.getOutputStream:()Ljava/io/OutputStream;
        //     4: astore_2       
        //     5: aload_2        
        //     6: ifnull          43
        //     9: new             Ljava/util/zip/GZIPOutputStream;
        //    12: dup            
        //    13: aload_2        
        //    14: invokespecial   java/util/zip/GZIPOutputStream.<init>:(Ljava/io/OutputStream;)V
        //    17: astore_0       
        //    18: aload_0        
        //    19: aload_1        
        //    20: invokevirtual   java/util/zip/GZIPOutputStream.write:([B)V
        //    23: aload_0        
        //    24: invokevirtual   java/util/zip/GZIPOutputStream.close:()V
        //    27: aload_2        
        //    28: invokevirtual   java/io/OutputStream.close:()V
        //    31: return         
        //    32: astore_1       
        //    33: aload_0        
        //    34: invokevirtual   java/util/zip/GZIPOutputStream.close:()V
        //    37: aload_2        
        //    38: invokevirtual   java/io/OutputStream.close:()V
        //    41: aload_1        
        //    42: athrow         
        //    43: new             Ljava/io/IOException;
        //    46: dup            
        //    47: ldc_w           "Cannot send request to FIS servers. No OutputStream available."
        //    50: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //    53: athrow         
        //    54: astore_0       
        //    55: goto            31
        //    58: astore_0       
        //    59: goto            41
        //    Exceptions:
        //  throws java.io.IOException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  18     23     32     43     Any
        //  23     31     54     58     Ljava/io/IOException;
        //  33     41     58     62     Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 34 out of bounds for length 34
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:372)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:458)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @j0
    public d d(@j0 final String s, @k0 final String s2, @j0 final String s3, @j0 final String s4, @k0 final String value) throws com.google.firebase.installations.k {
        if (!this.e.b()) {
            goto Label_0251;
        }
        final int n = 0;
        final URL h = this.h(String.format("projects/%s/installations", s3));
        if (n > 1) {
            goto Label_0237;
        }
        TrafficStats.setThreadStatsTag(32769);
        final HttpURLConnection m = this.m(h, s);
        try {
            m.setRequestMethod("POST");
            m.setDoOutput(true);
            if (value != null) {
                m.addRequestProperty("x-goog-fis-android-iid-migration-auth", value);
            }
            this.r(m, s2, s4);
            final int responseCode = m.getResponseCode();
            this.e.f(responseCode);
            d d;
            if (j(responseCode)) {
                d = this.o(m);
            }
            else {
                l(m, s4, s, s3);
                if (responseCode == 429) {
                    throw new com.google.firebase.installations.k("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", com.google.firebase.installations.k.a.I);
                }
                if (responseCode >= 500 && responseCode < 600) {
                    goto Label_0223;
                }
                k();
                d = com.google.firebase.installations.remote.d.a().e(com.google.firebase.installations.remote.d.b.H).a();
            }
            return d;
        }
        catch (AssertionError assertionError) {}
        catch (IOException ex) {
            goto Label_0223;
        }
        finally {
            m.disconnect();
            TrafficStats.clearThreadStatsTag();
        }
    }
    
    @j0
    public void e(@j0 final String s, @j0 String m, @j0 final String s2, @j0 final String str) throws com.google.firebase.installations.k {
        int i = 0;
        final URL h = this.h(String.format("projects/%s/installations/%s", s2, m));
        while (i <= 1) {
            TrafficStats.setThreadStatsTag(32770);
            m = (String)this.m(h, s);
            while (true) {
                try {
                    ((HttpURLConnection)m).setRequestMethod("DELETE");
                    final StringBuilder sb = new StringBuilder();
                    sb.append("FIS_v2 ");
                    sb.append(str);
                    ((URLConnection)m).addRequestProperty("Authorization", sb.toString());
                    final int responseCode = ((HttpURLConnection)m).getResponseCode();
                    if (responseCode == 200 || responseCode == 401 || responseCode == 404) {
                        return;
                    }
                    l((HttpURLConnection)m, null, s, s2);
                    if (responseCode != 429) {
                        if (responseCode < 500 || responseCode >= 600) {
                            k();
                            throw new com.google.firebase.installations.k("Bad config while trying to delete FID", com.google.firebase.installations.k.a.G);
                        }
                    }
                    ++i;
                }
                catch (IOException ex) {
                    continue;
                }
                finally {
                    ((HttpURLConnection)m).disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
                break;
            }
        }
        goto Label_0211;
    }
    
    @j0
    public f f(@j0 String s, @j0 final String s2, @j0 final String s3, @j0 final String str) throws com.google.firebase.installations.k {
        if (!this.e.b()) {
            goto Label_0299;
        }
        final int n = 0;
        final URL h = this.h(String.format("projects/%s/installations/%s/authTokens:generate", s3, s2));
        if (n > 1) {
            goto Label_0285;
        }
        TrafficStats.setThreadStatsTag(32771);
        final HttpURLConnection m = this.m(h, s);
        try {
            try {
                m.setRequestMethod("POST");
                final StringBuilder sb = new StringBuilder();
                sb.append("FIS_v2 ");
                sb.append(str);
                m.addRequestProperty("Authorization", sb.toString());
                m.setDoOutput(true);
                this.s(m);
                final int responseCode = m.getResponseCode();
                this.e.f(responseCode);
                if (j(responseCode)) {
                    s = (String)this.q(m);
                }
                else {
                    l(m, null, s, s3);
                    f.a a;
                    if (responseCode != 401 && responseCode != 404) {
                        if (responseCode == 429) {
                            throw new com.google.firebase.installations.k("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", com.google.firebase.installations.k.a.I);
                        }
                        if (responseCode >= 500 && responseCode < 600) {
                            goto Label_0271;
                        }
                        k();
                        a = com.google.firebase.installations.remote.f.a().b(com.google.firebase.installations.remote.f.b.H);
                    }
                    else {
                        a = com.google.firebase.installations.remote.f.a().b(com.google.firebase.installations.remote.f.b.I);
                    }
                    s = (String)a.a();
                }
                return (f)s;
            }
            catch (IOException ex) {}
            finally {
                m.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
        }
        catch (AssertionError assertionError) {}
    }
}
