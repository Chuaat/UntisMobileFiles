// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.remoteconfig.internal;

import com.google.firebase.remoteconfig.l;
import java.util.HashMap;
import java.util.Collection;
import com.google.firebase.remoteconfig.s;
import java.util.Map;
import android.util.Log;
import java.util.TreeSet;
import org.json.JSONException;
import androidx.annotation.k0;
import java.util.Iterator;
import java.util.HashSet;
import java.util.concurrent.Executor;
import com.google.android.gms.common.util.d;
import java.util.Set;
import java.util.regex.Pattern;
import androidx.annotation.b1;
import java.nio.charset.Charset;

public class n
{
    @b1(otherwise = 3)
    public static final Charset e;
    static final Pattern f;
    static final Pattern g;
    private final Set<d<String, g>> a;
    private final Executor b;
    private final f c;
    private final f d;
    
    static {
        e = Charset.forName("UTF-8");
        f = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        g = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }
    
    public n(final Executor b, final f c, final f d) {
        this.a = new HashSet<d<String, g>>();
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    private void b(final String s, final g g) {
        if (g == null) {
            return;
        }
        synchronized (this.a) {
            final Iterator<d<String, g>> iterator = this.a.iterator();
            while (iterator.hasNext()) {
                this.b.execute(m.a(iterator.next(), s, g));
            }
        }
    }
    
    @k0
    private static g f(final f f) {
        return f.e();
    }
    
    @k0
    private static Double h(final f f, final String s) {
        final g f2 = f(f);
        if (f2 == null) {
            return null;
        }
        try {
            return f2.d().getDouble(s);
        }
        catch (JSONException ex) {
            return null;
        }
    }
    
    private static Set<String> i(final f f) {
        final HashSet<String> set = new HashSet<String>();
        final g f2 = f(f);
        if (f2 == null) {
            return set;
        }
        final Iterator keys = f2.d().keys();
        while (keys.hasNext()) {
            set.add(keys.next());
        }
        return set;
    }
    
    private static TreeSet<String> k(final String prefix, final g g) {
        final TreeSet<String> set = new TreeSet<String>();
        final Iterator keys = g.d().keys();
        while (keys.hasNext()) {
            final String e = keys.next();
            if (e.startsWith(prefix)) {
                set.add(e);
            }
        }
        return set;
    }
    
    @k0
    private static Long m(final f f, final String s) {
        final g f2 = f(f);
        if (f2 == null) {
            return null;
        }
        try {
            return f2.d().getLong(s);
        }
        catch (JSONException ex) {
            return null;
        }
    }
    
    @k0
    private static String o(final f f, final String s) {
        final g f2 = f(f);
        if (f2 == null) {
            return null;
        }
        try {
            return f2.d().getString(s);
        }
        catch (JSONException ex) {
            return null;
        }
    }
    
    private static void r(final String s, final String s2) {
        Log.w("FirebaseRemoteConfig", String.format("No value of type '%s' exists for parameter key '%s'.", s2, s));
    }
    
    public void a(final d<String, g> d) {
        synchronized (this.a) {
            this.a.add(d);
        }
    }
    
    public Map<String, s> c() {
        final HashSet<String> set = new HashSet<String>();
        set.addAll((Collection<?>)i(this.c));
        set.addAll((Collection<?>)i(this.d));
        final HashMap<String, s> hashMap = new HashMap<String, s>();
        for (final String key : set) {
            hashMap.put(key, this.p(key));
        }
        return hashMap;
    }
    
    public boolean d(final String s) {
        final String o = o(this.c, s);
        if (o != null) {
            if (n.f.matcher(o).matches()) {
                this.b(s, f(this.c));
                return true;
            }
            if (n.g.matcher(o).matches()) {
                this.b(s, f(this.c));
                return false;
            }
        }
        final String o2 = o(this.d, s);
        if (o2 != null) {
            if (n.f.matcher(o2).matches()) {
                return true;
            }
            if (n.g.matcher(o2).matches()) {
                return false;
            }
        }
        r(s, "Boolean");
        return false;
    }
    
    public byte[] e(final String s) {
        final String o = o(this.c, s);
        if (o != null) {
            this.b(s, f(this.c));
            return o.getBytes(n.e);
        }
        final String o2 = o(this.d, s);
        if (o2 != null) {
            return o2.getBytes(n.e);
        }
        r(s, "ByteArray");
        return l.p;
    }
    
    public double g(final String s) {
        final Double h = h(this.c, s);
        if (h != null) {
            this.b(s, f(this.c));
            return h;
        }
        final Double h2 = h(this.d, s);
        if (h2 != null) {
            return h2;
        }
        r(s, "Double");
        return 0.0;
    }
    
    public Set<String> j(final String s) {
        String s2 = s;
        if (s == null) {
            s2 = "";
        }
        final TreeSet<String> set = new TreeSet<String>();
        final g f = f(this.c);
        if (f != null) {
            set.addAll(k(s2, f));
        }
        final g f2 = f(this.d);
        if (f2 != null) {
            set.addAll(k(s2, f2));
        }
        return set;
    }
    
    public long l(final String s) {
        final Long m = m(this.c, s);
        if (m != null) {
            this.b(s, f(this.c));
            return m;
        }
        final Long i = m(this.d, s);
        if (i != null) {
            return i;
        }
        r(s, "Long");
        return 0L;
    }
    
    public String n(final String s) {
        final String o = o(this.c, s);
        if (o != null) {
            this.b(s, f(this.c));
            return o;
        }
        final String o2 = o(this.d, s);
        if (o2 != null) {
            return o2;
        }
        r(s, "String");
        return "";
    }
    
    public s p(final String s) {
        final String o = o(this.c, s);
        if (o != null) {
            this.b(s, f(this.c));
            return new com.google.firebase.remoteconfig.internal.s(o, 2);
        }
        final String o2 = o(this.d, s);
        if (o2 != null) {
            return new com.google.firebase.remoteconfig.internal.s(o2, 1);
        }
        r(s, "FirebaseRemoteConfigValue");
        return new com.google.firebase.remoteconfig.internal.s("", 0);
    }
}
