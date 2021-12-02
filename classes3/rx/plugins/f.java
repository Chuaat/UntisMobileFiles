// 
// Decompiled by Procyon v0.5.36
// 

package rx.plugins;

import java.util.Iterator;
import java.io.Serializable;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicReference;

public class f
{
    private static final f f;
    static final b g;
    private final AtomicReference<b> a;
    private final AtomicReference<d> b;
    private final AtomicReference<h> c;
    private final AtomicReference<a> d;
    private final AtomicReference<g> e;
    
    static {
        f = new f();
        g = new b() {};
    }
    
    f() {
        this.a = new AtomicReference<b>();
        this.b = new AtomicReference<d>();
        this.c = new AtomicReference<h>();
        this.d = new AtomicReference<a>();
        this.e = new AtomicReference<g>();
    }
    
    @Deprecated
    public static f c() {
        return rx.plugins.f.f;
    }
    
    static Object e(final Class<?> clazz, Properties str) {
        final Properties properties = (Properties)((Properties)str).clone();
        final String simpleName = clazz.getSimpleName();
        final StringBuilder sb = new StringBuilder();
        sb.append("rxjava.plugin.");
        sb.append(simpleName);
        sb.append(".implementation");
        final String s = (String)(str = properties.getProperty(sb.toString()));
        Label_0362: {
            if (s == null) {
                Serializable s2 = s;
                try {
                    final Iterator<Map.Entry<Object, Object>> iterator = properties.entrySet().iterator();
                    String string;
                    while (true) {
                        s2 = s;
                        str = s;
                        if (!iterator.hasNext()) {
                            break Label_0362;
                        }
                        s2 = s;
                        final Map.Entry<Object, Object> entry = iterator.next();
                        s2 = s;
                        string = entry.getKey().toString();
                        s2 = s;
                        if (!string.startsWith("rxjava.plugin.")) {
                            continue;
                        }
                        s2 = s;
                        if (!string.endsWith(".class")) {
                            continue;
                        }
                        s2 = s;
                        if (simpleName.equals(entry.getValue().toString())) {
                            break;
                        }
                    }
                    s2 = s;
                    final String substring = string.substring(0, string.length() - 6).substring(14);
                    s2 = s;
                    s2 = s;
                    final StringBuilder sb2 = new StringBuilder();
                    s2 = s;
                    sb2.append("rxjava.plugin.");
                    s2 = s;
                    sb2.append(substring);
                    s2 = s;
                    sb2.append(".impl");
                    s2 = s;
                    final String string2 = sb2.toString();
                    s2 = s;
                    str = properties.getProperty(string2);
                    if (str == null) {
                        s2 = str;
                        s2 = str;
                        s2 = str;
                        final StringBuilder sb3 = new StringBuilder();
                        s2 = str;
                        sb3.append("Implementing class declaration for ");
                        s2 = str;
                        sb3.append(simpleName);
                        s2 = str;
                        sb3.append(" missing: ");
                        s2 = str;
                        sb3.append(string2);
                        s2 = str;
                        final IllegalStateException ex = new IllegalStateException(sb3.toString());
                        s2 = str;
                        throw ex;
                    }
                }
                catch (SecurityException ex2) {
                    ex2.printStackTrace();
                    str = s2;
                }
            }
        }
        if (str != null) {
            try {
                return Class.forName((String)str).asSubclass(clazz).newInstance();
            }
            catch (IllegalAccessException cause) {
                final StringBuilder sb4 = new StringBuilder();
                sb4.append(simpleName);
                sb4.append(" implementation not able to be accessed: ");
                sb4.append((String)str);
                throw new IllegalStateException(sb4.toString(), cause);
            }
            catch (InstantiationException cause2) {
                final StringBuilder sb5 = new StringBuilder();
                sb5.append(simpleName);
                sb5.append(" implementation not able to be instantiated: ");
                sb5.append((String)str);
                throw new IllegalStateException(sb5.toString(), cause2);
            }
            catch (ClassNotFoundException cause3) {
                final StringBuilder sb6 = new StringBuilder();
                sb6.append(simpleName);
                sb6.append(" implementation class not found: ");
                sb6.append((String)str);
                throw new IllegalStateException(sb6.toString(), cause3);
            }
            catch (ClassCastException cause4) {
                final StringBuilder sb7 = new StringBuilder();
                sb7.append(simpleName);
                sb7.append(" implementation is not an instance of ");
                sb7.append(simpleName);
                sb7.append(": ");
                sb7.append((String)str);
                throw new IllegalStateException(sb7.toString(), cause4);
            }
        }
        return null;
    }
    
    static Properties h() {
        try {
            return System.getProperties();
        }
        catch (SecurityException ex) {
            return new Properties();
        }
    }
    
    public a a() {
        if (this.d.get() == null) {
            final Object e = e(a.class, h());
            if (e == null) {
                this.d.compareAndSet(null, new a() {});
            }
            else {
                this.d.compareAndSet(null, (a)e);
            }
        }
        return this.d.get();
    }
    
    public b b() {
        if (this.a.get() == null) {
            final Object e = e(b.class, h());
            if (e == null) {
                this.a.compareAndSet(null, rx.plugins.f.g);
            }
            else {
                this.a.compareAndSet(null, (b)e);
            }
        }
        return this.a.get();
    }
    
    public d d() {
        if (this.b.get() == null) {
            final Object e = e(d.class, h());
            if (e == null) {
                this.b.compareAndSet(null, rx.plugins.e.f());
            }
            else {
                this.b.compareAndSet(null, (d)e);
            }
        }
        return this.b.get();
    }
    
    public g f() {
        if (this.e.get() == null) {
            final Object e = e(g.class, h());
            if (e == null) {
                this.e.compareAndSet(null, rx.plugins.g.h());
            }
            else {
                this.e.compareAndSet(null, (g)e);
            }
        }
        return this.e.get();
    }
    
    public h g() {
        if (this.c.get() == null) {
            final Object e = e(h.class, h());
            if (e == null) {
                this.c.compareAndSet(null, i.f());
            }
            else {
                this.c.compareAndSet(null, (h)e);
            }
        }
        return this.c.get();
    }
    
    public void i(final a newValue) {
        if (this.d.compareAndSet(null, newValue)) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Another strategy was already registered: ");
        sb.append(this.c.get());
        throw new IllegalStateException(sb.toString());
    }
    
    public void j(final b newValue) {
        if (this.a.compareAndSet(null, newValue)) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Another strategy was already registered: ");
        sb.append(this.a.get());
        throw new IllegalStateException(sb.toString());
    }
    
    public void k(final d newValue) {
        if (this.b.compareAndSet(null, newValue)) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Another strategy was already registered: ");
        sb.append(this.b.get());
        throw new IllegalStateException(sb.toString());
    }
    
    public void l(final g newValue) {
        if (this.e.compareAndSet(null, newValue)) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Another strategy was already registered: ");
        sb.append(this.e.get());
        throw new IllegalStateException(sb.toString());
    }
    
    public void m(final h newValue) {
        if (this.c.compareAndSet(null, newValue)) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Another strategy was already registered: ");
        sb.append(this.c.get());
        throw new IllegalStateException(sb.toString());
    }
    
    public void n() {
        final f f = rx.plugins.f.f;
        f.a.set(null);
        f.b.set(null);
        f.c.set(null);
        f.d.set(null);
        f.e.set(null);
    }
}
