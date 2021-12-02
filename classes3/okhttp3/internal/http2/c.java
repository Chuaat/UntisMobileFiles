// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.http2;

import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import m6.d;
import okio.p;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0005B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0014B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0006\u001a\u00020\u0004H\u00c6\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u00c6\u0001J\t\u0010\u000b\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0016\u0010\u0007\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\n8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010¨\u0006\u0017" }, d2 = { "Lokhttp3/internal/http2/c;", "", "", "toString", "Lokio/p;", "a", "b", "name", "value", "c", "", "hashCode", "other", "", "equals", "Lokio/p;", "I", "hpackSize", "<init>", "(Lokio/p;Lokio/p;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "(Lokio/p;Ljava/lang/String;)V", "o", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class c
{
    @d
    @e
    public static final p d;
    @e
    public static final String e = ":status";
    @e
    public static final String f = ":method";
    @e
    public static final String g = ":path";
    @e
    public static final String h = ":scheme";
    @e
    public static final String i = ":authority";
    @d
    @e
    public static final p j;
    @d
    @e
    public static final p k;
    @d
    @e
    public static final p l;
    @d
    @e
    public static final p m;
    @d
    @e
    public static final p n;
    public static final a o;
    @d
    public final int a;
    @d
    @e
    public final p b;
    @d
    @e
    public final p c;
    
    static {
        o = new a(null);
        final p.a i = p.L;
        d = i.l(":");
        j = i.l(":status");
        k = i.l(":method");
        l = i.l(":path");
        m = i.l(":scheme");
        n = i.l(":authority");
    }
    
    public c(@e final String s, @e final String s2) {
        k0.p((Object)s, "name");
        k0.p((Object)s2, "value");
        final p.a l = p.L;
        this(l.l(s), l.l(s2));
    }
    
    public c(@e final p p2, @e final String s) {
        k0.p((Object)p2, "name");
        k0.p((Object)s, "value");
        this(p2, p.L.l(s));
    }
    
    public c(@e final p b, @e final p c) {
        k0.p((Object)b, "name");
        k0.p((Object)c, "value");
        this.b = b;
        this.c = c;
        this.a = b.size() + 32 + c.size();
    }
    
    @e
    public final p a() {
        return this.b;
    }
    
    @e
    public final p b() {
        return this.c;
    }
    
    @e
    public final c c(@e final p p2, @e final p p3) {
        k0.p((Object)p2, "name");
        k0.p((Object)p3, "value");
        return new c(p2, p3);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this != o) {
            if (o instanceof c) {
                final c c = (c)o;
                if (k0.g((Object)this.b, (Object)c.b) && k0.g((Object)this.c, (Object)c.c)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        final p b = this.b;
        int hashCode = 0;
        int hashCode2;
        if (b != null) {
            hashCode2 = b.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final p c = this.c;
        if (c != null) {
            hashCode = c.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.b.U0());
        sb.append(": ");
        sb.append(this.c.U0());
        return sb.toString();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0016\u0010\r\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\bR\u0016\u0010\u000f\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0016\u0010\u0010\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\b¨\u0006\u0013" }, d2 = { "okhttp3/internal/http2/c$a", "", "Lokio/p;", "PSEUDO_PREFIX", "Lokio/p;", "RESPONSE_STATUS", "", "RESPONSE_STATUS_UTF8", "Ljava/lang/String;", "TARGET_AUTHORITY", "TARGET_AUTHORITY_UTF8", "TARGET_METHOD", "TARGET_METHOD_UTF8", "TARGET_PATH", "TARGET_PATH_UTF8", "TARGET_SCHEME", "TARGET_SCHEME_UTF8", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        private a() {
        }
    }
}
