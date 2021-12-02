// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.tls.internal.der;

import org.jetbrains.annotations.f;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import okio.p;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0080\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b*\u0010+J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0004\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0006\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\b\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\t\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\nH\u00c6\u0003J;\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\nH\u00c6\u0001J\t\u0010\u0013\u001a\u00020\u0012H\u00d6\u0001J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\"\u0010\u000f\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0019\u0010\u0010\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'R\"\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b(\u0010\u0018\"\u0004\b)\u0010\u001a¨\u0006," }, d2 = { "Lokhttp3/tls/internal/der/c;", "", "", "hashCode", "a", "", "b", "", "c", "d", "Lokio/p;", "e", "tagClass", "tag", "constructed", "length", "bytes", "f", "", "toString", "other", "equals", "J", "j", "()J", "n", "(J)V", "I", "l", "()I", "p", "(I)V", "Z", "i", "()Z", "m", "(Z)V", "Lokio/p;", "h", "()Lokio/p;", "k", "o", "<init>", "(IJZJLokio/p;)V", "okhttp-tls" }, k = 1, mv = { 1, 4, 0 })
public final class c
{
    private int a;
    private long b;
    private boolean c;
    private long d;
    @e
    private final p e;
    
    public c(final int a, final long b, final boolean c, final long d, @e final p e) {
        k0.p((Object)e, "bytes");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final int a() {
        return this.a;
    }
    
    public final long b() {
        return this.b;
    }
    
    public final boolean c() {
        return this.c;
    }
    
    public final long d() {
        return this.d;
    }
    
    @e
    public final p e() {
        return this.e;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this != o) {
            if (o instanceof c) {
                final c c = (c)o;
                if (this.a == c.a && this.b == c.b && this.c == c.c && this.d == c.d && k0.g((Object)this.e, (Object)c.e)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @e
    public final c f(final int n, final long n2, final boolean b, final long n3, @e final p p5) {
        k0.p((Object)p5, "bytes");
        return new c(n, n2, b, n3, p5);
    }
    
    @e
    public final p h() {
        return this.e;
    }
    
    @Override
    public int hashCode() {
        return ((((0 + this.a) * 31 + (int)this.b) * 31 + ((this.c ^ true) ? 1 : 0)) * 31 + (int)this.d) * 31 + this.e.hashCode();
    }
    
    public final boolean i() {
        return this.c;
    }
    
    public final long j() {
        return this.d;
    }
    
    public final long k() {
        return this.b;
    }
    
    public final int l() {
        return this.a;
    }
    
    public final void m(final boolean c) {
        this.c = c;
    }
    
    public final void n(final long d) {
        this.d = d;
    }
    
    public final void o(final long b) {
        this.b = b;
    }
    
    public final void p(final int a) {
        this.a = a;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("AnyValue(tagClass=");
        sb.append(this.a);
        sb.append(", tag=");
        sb.append(this.b);
        sb.append(", constructed=");
        sb.append(this.c);
        sb.append(", length=");
        sb.append(this.d);
        sb.append(", bytes=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
