// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.http1;

import okhttp3.v;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import okio.o;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u0000 \u00102\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0019\u0010\n\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0016\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\f¨\u0006\u0011" }, d2 = { "Lokhttp3/internal/http1/a;", "", "", "c", "Lokhttp3/v;", "b", "Lokio/o;", "Lokio/o;", "a", "()Lokio/o;", "source", "", "J", "headerLimit", "<init>", "(Lokio/o;)V", "d", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class a
{
    private static final int c = 262144;
    public static final a d;
    private long a;
    @e
    private final o b;
    
    static {
        d = new a(null);
    }
    
    public a(@e final o b) {
        k0.p((Object)b, "source");
        this.b = b;
        this.a = 262144;
    }
    
    @e
    public final o a() {
        return this.b;
    }
    
    @e
    public final v b() {
        final v.a a = new v.a();
        while (true) {
            final String c = this.c();
            if (c.length() == 0) {
                break;
            }
            a.f(c);
        }
        return a.i();
    }
    
    @e
    public final String c() {
        final String g2 = this.b.g2(this.a);
        this.a -= g2.length();
        return g2;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007" }, d2 = { "okhttp3/internal/http1/a$a", "", "", "HEADER_LIMIT", "I", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        private a() {
        }
    }
}
