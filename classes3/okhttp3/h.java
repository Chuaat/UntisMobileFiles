// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3;

import kotlin.collections.y0;
import java.nio.charset.StandardCharsets;
import org.jetbrains.annotations.f;
import java.nio.charset.Charset;
import m6.g;
import kotlin.z0;
import kotlin.k;
import kotlin.i;
import java.util.Iterator;
import java.util.Locale;
import java.util.LinkedHashMap;
import java.util.Collections;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0014\u0010\u001c\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\u001d\u0010\u001eB\u0019\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0005¢\u0006\u0004\b\u001d\u0010\u001fJ\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000f\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00050\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\u0007J\u000f\u0010\f\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016R\u0013\u0010\u0003\u001a\u00020\u00028G@\u0006¢\u0006\u0006\u001a\u0004\b\u0014\u0010\rR\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u00058G@\u0006¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0007R\u0019\u0010\u0019\u001a\u00020\u00058\u0007@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0007R'\u0010\u001c\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00050\b8G@\u0006¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\n¨\u0006 " }, d2 = { "Lokhttp3/h;", "", "Ljava/nio/charset/Charset;", "charset", "i", "", "d", "()Ljava/lang/String;", "", "a", "()Ljava/util/Map;", "c", "b", "()Ljava/nio/charset/Charset;", "other", "", "equals", "", "hashCode", "toString", "f", "g", "realm", "Ljava/lang/String;", "h", "scheme", "Ljava/util/Map;", "e", "authParams", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class h
{
    @e
    private final Map<String, String> a;
    @e
    private final String b;
    
    public h(@e final String s, @e final String value) {
        k0.p((Object)s, "scheme");
        k0.p((Object)value, "realm");
        final Map<String, String> singletonMap = Collections.singletonMap("realm", value);
        k0.o((Object)singletonMap, "singletonMap(\"realm\", realm)");
        this(s, singletonMap);
    }
    
    public h(@e String lowerCase, @e final Map<String, String> map) {
        k0.p((Object)lowerCase, "scheme");
        k0.p((Object)map, "authParams");
        this.b = lowerCase;
        final LinkedHashMap<String, String> m = new LinkedHashMap<String, String>();
        for (final Map.Entry<String, String> entry : map.entrySet()) {
            lowerCase = entry.getKey();
            final String s = entry.getValue();
            if (lowerCase != null) {
                final Locale us = Locale.US;
                k0.o((Object)us, "US");
                lowerCase = lowerCase.toLowerCase(us);
                k0.o((Object)lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            }
            else {
                lowerCase = null;
            }
            m.put(lowerCase, s);
        }
        final Map<Object, Object> unmodifiableMap = Collections.unmodifiableMap((Map<?, ?>)m);
        k0.o((Object)unmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.a = (Map<String, String>)unmodifiableMap;
    }
    
    @i(level = k.H, message = "moved to val", replaceWith = @z0(expression = "authParams", imports = {}))
    @g(name = "-deprecated_authParams")
    @e
    public final Map<String, String> a() {
        return this.a;
    }
    
    @i(level = k.H, message = "moved to val", replaceWith = @z0(expression = "charset", imports = {}))
    @g(name = "-deprecated_charset")
    @e
    public final Charset b() {
        return this.f();
    }
    
    @i(level = k.H, message = "moved to val", replaceWith = @z0(expression = "realm", imports = {}))
    @g(name = "-deprecated_realm")
    @f
    public final String c() {
        return this.g();
    }
    
    @i(level = k.H, message = "moved to val", replaceWith = @z0(expression = "scheme", imports = {}))
    @g(name = "-deprecated_scheme")
    @e
    public final String d() {
        return this.b;
    }
    
    @g(name = "authParams")
    @e
    public final Map<String, String> e() {
        return this.a;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (o instanceof h) {
            final h h = (h)o;
            if (k0.g((Object)h.b, (Object)this.b) && k0.g((Object)h.a, (Object)this.a)) {
                return true;
            }
        }
        return false;
    }
    
    @g(name = "charset")
    @e
    public final Charset f() {
        final String charsetName = this.a.get("charset");
        while (true) {
            if (charsetName == null) {
                break Label_0032;
            }
            try {
                final Charset forName = Charset.forName(charsetName);
                k0.o((Object)forName, "Charset.forName(charset)");
                return forName;
                final Charset iso_8859_1 = StandardCharsets.ISO_8859_1;
                k0.o((Object)iso_8859_1, "ISO_8859_1");
                return iso_8859_1;
            }
            catch (Exception ex) {
                continue;
            }
            break;
        }
    }
    
    @g(name = "realm")
    @f
    public final String g() {
        return this.a.get("realm");
    }
    
    @g(name = "scheme")
    @e
    public final String h() {
        return this.b;
    }
    
    @Override
    public int hashCode() {
        return (899 + this.b.hashCode()) * 31 + this.a.hashCode();
    }
    
    @e
    public final h i(@e final Charset charset) {
        k0.p((Object)charset, "charset");
        final Map j0 = y0.J0((Map)this.a);
        final String name = charset.name();
        k0.o((Object)name, "charset.name()");
        j0.put("charset", name);
        return new h(this.b, j0);
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append(" authParams=");
        sb.append(this.a);
        return sb.toString();
    }
}
