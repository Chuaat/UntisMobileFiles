// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.send;

import com.google.android.datatransport.j;
import com.google.android.datatransport.d;
import com.google.android.gms.tasks.m;
import androidx.annotation.j0;
import java.nio.charset.Charset;
import com.google.android.datatransport.i;
import com.google.android.datatransport.runtime.f;
import com.google.android.datatransport.runtime.t;
import android.content.Context;
import com.google.firebase.crashlytics.internal.common.p;
import com.google.android.gms.tasks.n;
import com.google.android.datatransport.h;
import com.google.firebase.crashlytics.internal.model.a0;
import com.google.firebase.crashlytics.internal.model.serialization.g;

public class c
{
    private static final g c;
    private static final String d;
    private static final String e;
    private static final String f = "FIREBASE_CRASHLYTICS_REPORT";
    private static final com.google.android.datatransport.g<a0, byte[]> g;
    private final h<a0> a;
    private final com.google.android.datatransport.g<a0, byte[]> b;
    
    static {
        c = new g();
        d = f("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");
        e = f("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");
        g = (com.google.android.datatransport.g)a.a;
    }
    
    c(final h<a0> a, final com.google.android.datatransport.g<a0, byte[]> b) {
        this.a = a;
        this.b = b;
    }
    
    public static c c(final Context context) {
        t.f(context);
        final i g = t.c().g((f)new com.google.android.datatransport.cct.a(com.google.firebase.crashlytics.internal.send.c.d, com.google.firebase.crashlytics.internal.send.c.e));
        final com.google.android.datatransport.c b = com.google.android.datatransport.c.b("json");
        final com.google.android.datatransport.g<a0, byte[]> g2 = com.google.firebase.crashlytics.internal.send.c.g;
        return new c((h<a0>)g.b("FIREBASE_CRASHLYTICS_REPORT", (Class)a0.class, b, (com.google.android.datatransport.g)g2), g2);
    }
    
    private static String f(final String s, final String s2) {
        final int n = s.length() - s2.length();
        if (n >= 0 && n <= 1) {
            final StringBuilder sb = new StringBuilder(s.length() + s2.length());
            for (int i = 0; i < s.length(); ++i) {
                sb.append(s.charAt(i));
                if (s2.length() > i) {
                    sb.append(s2.charAt(i));
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }
    
    @j0
    public m<p> g(@j0 final p p) {
        final a0 b = p.b();
        final n n = new n();
        this.a.b(com.google.android.datatransport.d.i((Object)b), (j)new b(n, p));
        return (m<p>)n.a();
    }
}
