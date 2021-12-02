// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time;

import java.util.HashMap;
import java.text.DateFormatSymbols;
import java.util.Locale;
import org.joda.time.chrono.x;
import java.security.Permission;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public class h
{
    public static final b a;
    private static volatile b b;
    private static final AtomicReference<Map<String, i>> c;
    
    static {
        h.b = (a = (b)new d());
        c = new AtomicReference<Map<String, i>>();
    }
    
    protected h() {
    }
    
    private static Map<String, i> a() {
        final LinkedHashMap<String, i> m = new LinkedHashMap<String, i>();
        final i i = org.joda.time.i.I;
        m.put("UT", i);
        m.put("UTC", i);
        m.put("GMT", i);
        q(m, "EST", "America/New_York");
        q(m, "EDT", "America/New_York");
        q(m, "CST", "America/Chicago");
        q(m, "CDT", "America/Chicago");
        q(m, "MST", "America/Denver");
        q(m, "MDT", "America/Denver");
        q(m, "PST", "America/Los_Angeles");
        q(m, "PDT", "America/Los_Angeles");
        return (Map<String, i>)Collections.unmodifiableMap((Map<?, ?>)m);
    }
    
    private static void b() throws SecurityException {
        final SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new s("CurrentTime.setProvider"));
        }
    }
    
    public static final long c() {
        return h.b.n();
    }
    
    public static final long d(final double n) {
        return (long)((n - 2440587.5) * 8.64E7);
    }
    
    public static final org.joda.time.a e(final org.joda.time.a a) {
        org.joda.time.a c0 = a;
        if (a == null) {
            c0 = x.c0();
        }
        return c0;
    }
    
    public static final DateFormatSymbols f(final Locale locale) {
        try {
            return (DateFormatSymbols)DateFormatSymbols.class.getMethod("getInstance", Locale.class).invoke(null, locale);
        }
        catch (Exception ex) {
            return new DateFormatSymbols(locale);
        }
    }
    
    public static final Map<String, i> g() {
        final AtomicReference<Map<String, i>> c = h.c;
        Map<String, i> a;
        if ((a = c.get()) == null && !c.compareAndSet(null, a = a())) {
            a = c.get();
        }
        return a;
    }
    
    public static final long h(final k0 k0) {
        if (k0 == null) {
            return 0L;
        }
        return k0.n();
    }
    
    public static final org.joda.time.a i(final l0 l0) {
        if (l0 == null) {
            return x.c0();
        }
        org.joda.time.a a;
        if ((a = l0.t()) == null) {
            a = x.c0();
        }
        return a;
    }
    
    public static final long j(final l0 l0) {
        if (l0 == null) {
            return c();
        }
        return l0.n();
    }
    
    public static final org.joda.time.a k(final l0 l0, final l0 l2) {
        org.joda.time.a a;
        if (l0 != null) {
            a = l0.t();
        }
        else if (l2 != null) {
            a = l2.t();
        }
        else {
            a = null;
        }
        org.joda.time.a c0 = a;
        if (a == null) {
            c0 = x.c0();
        }
        return c0;
    }
    
    public static final org.joda.time.a l(final m0 m0) {
        if (m0 == null) {
            return x.c0();
        }
        org.joda.time.a a;
        if ((a = m0.t()) == null) {
            a = x.c0();
        }
        return a;
    }
    
    public static final e0 m(final e0 e0) {
        e0 q = e0;
        if (e0 == null) {
            q = e0.q();
        }
        return q;
    }
    
    public static final m0 n(final m0 m0) {
        m0 m2 = m0;
        if (m0 == null) {
            final long c = c();
            m2 = new r(c, c);
        }
        return m2;
    }
    
    public static final i o(final i i) {
        i n = i;
        if (i == null) {
            n = i.n();
        }
        return n;
    }
    
    public static final boolean p(final n0 n0) {
        if (n0 != null) {
            m m = null;
            for (int i = 0; i < n0.size(); ++i) {
                final f q3 = n0.Q3(i);
                if (i > 0 && (q3.I() == null || q3.I().m() != m)) {
                    return false;
                }
                m = q3.t().m();
            }
            return true;
        }
        throw new IllegalArgumentException("Partial must not be null");
    }
    
    private static void q(final Map<String, i> map, final String s, final String s2) {
        try {
            map.put(s, i.g(s2));
        }
        catch (RuntimeException ex) {}
    }
    
    public static final void r(final long n) throws SecurityException {
        b();
        h.b = (b)new a(n);
    }
    
    public static final void s(final long n) throws SecurityException {
        b();
        if (n == 0L) {
            h.b = h.a;
        }
        else {
            h.b = (b)new c(n);
        }
    }
    
    public static final void t(final b b) throws SecurityException {
        if (b != null) {
            b();
            h.b = b;
            return;
        }
        throw new IllegalArgumentException("The MillisProvider must not be null");
    }
    
    public static final void u() throws SecurityException {
        b();
        h.b = h.a;
    }
    
    public static final void v(final Map<String, i> m) {
        h.c.set(Collections.unmodifiableMap((Map<? extends String, ? extends i>)new HashMap<String, i>(m)));
    }
    
    public static final double w(final long n) {
        return n / 8.64E7 + 2440587.5;
    }
    
    public static final long x(final long n) {
        return (long)Math.floor(w(n) + 0.5);
    }
    
    static class a implements b
    {
        private final long a;
        
        a(final long a) {
            this.a = a;
        }
        
        @Override
        public long n() {
            return this.a;
        }
    }
    
    public interface b
    {
        long n();
    }
    
    static class c implements b
    {
        private final long a;
        
        c(final long a) {
            this.a = a;
        }
        
        @Override
        public long n() {
            return System.currentTimeMillis() + this.a;
        }
    }
    
    static class d implements b
    {
        @Override
        public long n() {
            return System.currentTimeMillis();
        }
    }
}
