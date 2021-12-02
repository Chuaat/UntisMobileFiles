// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import com.google.android.gms.clearcut.g;
import android.util.Log;
import java.nio.ByteBuffer;
import com.google.android.gms.phenotype.c;
import android.content.Context;
import com.google.android.gms.common.util.d0;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;
import com.google.android.gms.clearcut.a;

public final class r6 implements b
{
    private static final Charset b;
    private static final p c;
    private static final p d;
    private static final ConcurrentHashMap<String, f<d6.a>> e;
    private static final HashMap<String, f<String>> f;
    @d0
    private static Boolean g;
    @d0
    private static Long h;
    @d0
    private static final f<Boolean> i;
    private final Context a;
    
    static {
        b = Charset.forName("UTF-8");
        final p p = c = new p(com.google.android.gms.phenotype.c.a("com.google.android.gms.clearcut.public")).f("gms:playlog:service:samplingrules_").h("LogSamplingRules__");
        d = new p(com.google.android.gms.phenotype.c.a("com.google.android.gms.clearcut.public")).f("gms:playlog:service:sampling_").h("LogSampling__");
        e = new ConcurrentHashMap<String, f<d6.a>>();
        f = new HashMap<String, f<String>>();
        r6.g = null;
        r6.h = null;
        i = p.e("enable_log_sampling_rules", false);
    }
    
    public r6(final Context a) {
        this.a = a;
        if (a != null) {
            com.google.android.gms.internal.clearcut.f.b(a);
        }
    }
    
    @d0
    private static long b(final String s, final long n) {
        if (s != null && !s.isEmpty()) {
            final byte[] bytes = s.getBytes(r6.b);
            final ByteBuffer allocate = ByteBuffer.allocate(bytes.length + 8);
            allocate.put(bytes);
            allocate.putLong(n);
            return m6.c(allocate.array());
        }
        return m6.c(ByteBuffer.allocate(8).putLong(n).array());
    }
    
    @d0
    private static d6.a.b c(String s) {
        if (s == null) {
            return null;
        }
        final int index = s.indexOf(44);
        int n = 0;
        String substring;
        if (index >= 0) {
            substring = s.substring(0, index);
            n = index + 1;
        }
        else {
            substring = "";
        }
        final int index2 = s.indexOf(47, n);
        if (index2 <= 0) {
            if (s.length() != 0) {
                s = "Failed to parse the rule: ".concat(s);
            }
            else {
                s = new String("Failed to parse the rule: ");
            }
            Log.e("LogSamplerImpl", s);
            return null;
        }
        try {
            final long long1 = Long.parseLong(s.substring(n, index2));
            final long long2 = Long.parseLong(s.substring(index2 + 1));
            if (long1 >= 0L && long2 >= 0L) {
                return (d6.a.b)d6.a.b.D().t(substring).u(long1).v(long2).s();
            }
            s = (String)new StringBuilder(72);
            ((StringBuilder)s).append("negative values not supported: ");
            ((StringBuilder)s).append(long1);
            ((StringBuilder)s).append("/");
            ((StringBuilder)s).append(long2);
            Log.e("LogSamplerImpl", ((StringBuilder)s).toString());
            return null;
        }
        catch (NumberFormatException ex) {
            if (s.length() != 0) {
                s = "parseLong() failed while parsing: ".concat(s);
            }
            else {
                s = new String("parseLong() failed while parsing: ");
            }
            Log.e("LogSamplerImpl", s, (Throwable)ex);
            return null;
        }
    }
    
    @d0
    private static boolean d(long n, final long n2, final long n3) {
        if (n2 >= 0L && n3 > 0L) {
            if (n >= 0L) {
                n %= n3;
            }
            else {
                n = (Long.MAX_VALUE % n3 + 1L + (n & Long.MAX_VALUE) % n3) % n3;
            }
            if (n >= n2) {
                return false;
            }
        }
        return true;
    }
    
    private static boolean e(final Context context) {
        if (r6.g == null) {
            r6.g = (com.google.android.gms.common.wrappers.c.a(context).a("com.google.android.providers.gsf.permission.READ_GSERVICES") == 0);
        }
        return r6.g;
    }
    
    @d0
    private static long f(final Context context) {
        if (r6.h == null) {
            long a = 0L;
            if (context == null) {
                return 0L;
            }
            if (e(context)) {
                a = a7.a(context.getContentResolver(), "android_id", 0L);
            }
            r6.h = a;
        }
        return r6.h;
    }
    
    @Override
    public final boolean a(final g g) {
        final t6 g2 = g.G;
        final String m = g2.M;
        final int i = g2.I;
        final i6 o = g.O;
        int j;
        if (o != null) {
            j = o.M;
        }
        else {
            j = 0;
        }
        final boolean booleanValue = r6.i.a();
        final String s = null;
        if (!booleanValue) {
            String value;
            if (m != null && !m.isEmpty()) {
                value = m;
            }
            else if (i >= 0) {
                value = String.valueOf(i);
            }
            else {
                value = null;
            }
            if (value != null) {
                final Context a = this.a;
                String s2 = s;
                if (a != null) {
                    if (!e(a)) {
                        s2 = s;
                    }
                    else {
                        final HashMap<String, f<String>> f = r6.f;
                        f<String> b;
                        if ((b = f.get(value)) == null) {
                            b = r6.d.b(value, null);
                            f.put(value, b);
                        }
                        s2 = b.a();
                    }
                }
                final d6.a.b c = c(s2);
                if (c != null) {
                    return d(b(c.A(), f(this.a)), c.B(), c.C());
                }
            }
        }
        else {
            String value2;
            if (m != null && !m.isEmpty()) {
                value2 = m;
            }
            else if (i >= 0) {
                value2 = String.valueOf(i);
            }
            else {
                value2 = null;
            }
            if (value2 != null) {
                List<d6.a.b> list;
                if (this.a == null) {
                    list = Collections.emptyList();
                }
                else {
                    final ConcurrentHashMap<String, f<d6.a>> e = r6.e;
                    f<d6.a> a2;
                    if ((a2 = e.get(value2)) == null) {
                        a2 = r6.c.a(value2, d6.a.w(), s6.a);
                        final f<d6.a> f2 = e.putIfAbsent(value2, a2);
                        if (f2 != null) {
                            a2 = f2;
                        }
                    }
                    list = a2.a().v();
                }
                for (final d6.a.b b2 : list) {
                    if ((!b2.z() || b2.v() == 0 || b2.v() == j) && !d(b(b2.A(), f(this.a)), b2.B(), b2.C())) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
