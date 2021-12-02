// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.messaging;

import java.util.concurrent.ExecutionException;
import android.text.TextUtils;
import com.google.android.gms.tasks.p;
import com.google.firebase.installations.o;
import android.os.Build$VERSION;
import androidx.annotation.d;
import android.util.Log;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import com.google.android.gms.tasks.c;
import android.os.Bundle;
import com.google.android.gms.tasks.m;
import android.util.Base64;
import androidx.annotation.b1;
import com.google.firebase.installations.j;
import com.google.firebase.heartbeatinfo.k;
import com.google.firebase.platforminfo.i;
import n3.b;
import com.google.firebase.e;

class h0
{
    private final e a;
    private final m0 b;
    private final com.google.android.gms.cloudmessaging.e c;
    private final b<i> d;
    private final b<k> e;
    private final j f;
    
    @b1
    h0(final e a, final m0 b, final com.google.android.gms.cloudmessaging.e c, final b<i> d, final b<k> e, final j f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    h0(final e e, final m0 m0, final b<i> b, final b<k> b2, final j j) {
        this(e, m0, new com.google.android.gms.cloudmessaging.e(e.m()), b, b2, j);
    }
    
    private static String a(final byte[] array) {
        return Base64.encodeToString(array, 11);
    }
    
    private m<String> c(final m<Bundle> m) {
        return (m<String>)m.n(f0.G, (c)new g0(this));
    }
    
    private String d() {
        final String q = this.a.q();
        try {
            return a(MessageDigest.getInstance("SHA-1").digest(q.getBytes()));
        }
        catch (NoSuchAlgorithmException ex) {
            return "[HASH-ERROR]";
        }
    }
    
    @d
    private String f(final Bundle obj) throws IOException {
        if (obj == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        final String string = obj.getString("registration_id");
        if (string != null) {
            return string;
        }
        final String string2 = obj.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        final String string3 = obj.getString("error");
        if ("RST".equals(string3)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        final String value = String.valueOf(obj);
        final StringBuilder sb = new StringBuilder(value.length() + 21);
        sb.append("Unexpected response: ");
        sb.append(value);
        Log.w("FirebaseMessaging", sb.toString(), new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }
    
    static boolean g(final String anObject) {
        return "SERVICE_NOT_AVAILABLE".equals(anObject) || "INTERNAL_SERVER_ERROR".equals(anObject) || "InternalServerError".equals(anObject);
    }
    
    private Bundle i(String b, final String s, final String s2, final Bundle bundle) {
        bundle.putString("scope", s2);
        bundle.putString("sender", s);
        bundle.putString("subtype", s);
        bundle.putString("appid", (String)b);
        bundle.putString("gmp_app_id", this.a.r().j());
        bundle.putString("gmsv", Integer.toString(this.b.d()));
        bundle.putString("osv", Integer.toString(Build$VERSION.SDK_INT));
        bundle.putString("app_ver", this.b.a());
        bundle.putString("app_ver_name", this.b.b());
        bundle.putString("firebase-app-name-hash", this.d());
        Label_0184: {
            try {
                b = ((o)p.a((m)this.f.a(false))).b();
                if (!TextUtils.isEmpty((CharSequence)b)) {
                    bundle.putString("Goog-Firebase-Installations-Auth", (String)b);
                    break Label_0184;
                }
                Log.w("FirebaseMessaging", "FIS auth token is empty");
                break Label_0184;
            }
            catch (InterruptedException b) {}
            catch (ExecutionException ex) {}
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", (Throwable)b);
        }
        bundle.putString("cliv", "fcm-22.0.0");
        final k k = this.e.get();
        final i i = this.d.get();
        if (k != null && i != null) {
            final k.a b2 = k.b("fire-iid");
            if (b2 != com.google.firebase.heartbeatinfo.k.a.H) {
                bundle.putString("Firebase-Client-Log-Type", Integer.toString(b2.b()));
                bundle.putString("Firebase-Client", i.a());
            }
        }
        return bundle;
    }
    
    private m<Bundle> j(final String s, final String s2, final String s3, final Bundle bundle) {
        this.i(s, s2, s3, bundle);
        return (m<Bundle>)this.c.a(bundle);
    }
    
    m<?> b(final String s) {
        final Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        return this.c(this.j(s, m0.c(this.a), "*", bundle));
    }
    
    m<String> e(final String s) {
        return this.c(this.j(s, m0.c(this.a), "*", new Bundle()));
    }
    
    m<?> k(final String s, final String s2, String str) {
        final Bundle bundle = new Bundle();
        final String value = String.valueOf(str);
        String concat;
        if (value.length() != 0) {
            concat = "/topics/".concat(value);
        }
        else {
            concat = new String("/topics/");
        }
        bundle.putString("gcm.topic", concat);
        str = String.valueOf(str);
        if (((String)str).length() != 0) {
            str = "/topics/".concat((String)str);
        }
        else {
            str = new String("/topics/");
        }
        return this.c(this.j(s, s2, (String)str, bundle));
    }
    
    m<?> l(final String s, final String s2, String str) {
        final Bundle bundle = new Bundle();
        final String value = String.valueOf(str);
        String concat;
        if (value.length() != 0) {
            concat = "/topics/".concat(value);
        }
        else {
            concat = new String("/topics/");
        }
        bundle.putString("gcm.topic", concat);
        bundle.putString("delete", "1");
        str = String.valueOf(str);
        if (((String)str).length() != 0) {
            str = "/topics/".concat((String)str);
        }
        else {
            str = new String("/topics/");
        }
        return this.c(this.j(s, s2, (String)str, bundle));
    }
}
