// 
// Decompiled by Procyon v0.5.36
// 

package m7;

import java.lang.constant.Constable;
import java.util.Iterator;
import kotlin.collections.y0;
import java.net.URL;
import org.koin.core.logger.c;
import k7.h;
import kotlin.io.z;
import org.koin.core.a;
import org.jetbrains.annotations.e;
import java.nio.charset.Charset;
import kotlin.p1;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import kotlin.jvm.internal.k0;
import kotlin.text.f;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006J\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004J)\u0010\u000e\u001a\u00020\b\"\b\b\u0000\u0010\u000b*\u00020\u00012\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0002J\u0006\u0010\u0014\u001a\u00020\bJ\u0006\u0010\u0015\u001a\u00020\b¨\u0006\u0018" }, d2 = { "Lm7/b;", "", "", "content", "Ljava/util/Properties;", "e", "", "properties", "Lkotlin/j2;", "f", "g", "T", "key", "value", "h", "(Ljava/lang/String;Ljava/lang/Object;)V", "b", "(Ljava/lang/String;)Ljava/lang/Object;", "fileName", "d", "c", "a", "<init>", "()V", "koin-core" }, k = 1, mv = { 1, 4, 0 })
public final class b
{
    private final Map<String, Object> a;
    
    public b() {
        this.a = new ConcurrentHashMap<String, Object>();
    }
    
    private final Properties e(final String s) {
        final Properties properties = new Properties();
        final Charset a = f.a;
        if (s != null) {
            final byte[] bytes = s.getBytes(a);
            k0.h((Object)bytes, "(this as java.lang.String).getBytes(charset)");
            properties.load(new ByteArrayInputStream(bytes));
            return properties;
        }
        throw new p1("null cannot be cast to non-null type java.lang.String");
    }
    
    public final void a() {
        this.a.clear();
    }
    
    @org.jetbrains.annotations.f
    public final <T> T b(@e final String s) {
        k0.q((Object)s, "key");
        Object value;
        if (!((value = this.a.get(s)) instanceof Object)) {
            value = null;
        }
        return (T)value;
    }
    
    public final void c() {
        final org.koin.core.b.a c = org.koin.core.b.c;
        if (c.b().e(org.koin.core.logger.b.G)) {
            c.b().a("load properties from environment");
        }
        final Properties properties = System.getProperties();
        k0.h((Object)properties, "sysProperties");
        this.g(properties);
        final Map<String, String> getenv = System.getenv();
        k0.h((Object)getenv, "System.getenv()");
        final Properties properties2 = new Properties();
        properties2.putAll(getenv);
        this.g(properties2);
    }
    
    public final void d(@e final String s) {
        k0.q((Object)s, "fileName");
        final org.koin.core.b.a c = org.koin.core.b.c;
        if (c.b().e(org.koin.core.logger.b.G)) {
            final c b = c.b();
            final StringBuilder sb = new StringBuilder();
            sb.append("load properties from ");
            sb.append(s);
            b.a(sb.toString());
        }
        final URL resource = a.class.getResource(s);
        String s2;
        if (resource != null) {
            s2 = new String(z.i(resource), f.a);
        }
        else {
            s2 = null;
        }
        if (s2 != null) {
            if (c.b().e(org.koin.core.logger.b.H)) {
                final c b2 = c.b();
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("loaded properties from file:'");
                sb2.append(s);
                sb2.append('\'');
                b2.d(sb2.toString());
            }
            this.g(this.e(s2));
            return;
        }
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("No properties found for file '");
        sb3.append(s);
        sb3.append('\'');
        throw new h(sb3.toString());
    }
    
    public final void f(@e final Map<String, ?> map) {
        k0.q((Object)map, "properties");
        final org.koin.core.b.a c = org.koin.core.b.c;
        if (c.b().e(org.koin.core.logger.b.G)) {
            final c b = c.b();
            final StringBuilder sb = new StringBuilder();
            sb.append("load ");
            sb.append(map.size());
            sb.append(" properties");
            b.a(sb.toString());
        }
        this.a.putAll(map);
    }
    
    public final void g(@e final Properties properties) {
        k0.q((Object)properties, "properties");
        final org.koin.core.b.a c = org.koin.core.b.c;
        if (c.b().e(org.koin.core.logger.b.G)) {
            final c b = c.b();
            final StringBuilder sb = new StringBuilder();
            sb.append("load ");
            sb.append(properties.size());
            sb.append(" properties");
            b.a(sb.toString());
        }
        final Map d0 = y0.D0((Map)properties);
        if (d0 != null) {
            for (final Map.Entry<String, V> entry : d0.entrySet()) {
                final String s = entry.getKey();
                final String s2 = (String)entry.getValue();
                Constable constable;
                if (org.koin.ext.b.b(s2)) {
                    constable = Integer.parseInt(s2);
                }
                else if (org.koin.ext.b.a(s2)) {
                    constable = Float.parseFloat(s2);
                }
                else {
                    constable = org.koin.ext.b.c(s2);
                }
                this.h(s, constable);
            }
            return;
        }
        throw new p1("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
    }
    
    public final <T> void h(@e final String s, @e final T t) {
        k0.q((Object)s, "key");
        k0.q((Object)t, "value");
        this.a.put(s, t);
    }
}
