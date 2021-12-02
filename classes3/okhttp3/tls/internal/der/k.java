// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.tls.internal.der;

import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.jvm.internal.w;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0080\b\u0018\u0000 \"2\u00020\u0001:\u0001\u0006B'\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b&\u0010'J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\t\u0010\u0006\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\b\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0007H\u00c6\u0003J1\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0013\u0010\u0015\u001a\u00020\t8F@\u0006¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u000f\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\r\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\"\u0010\u000e\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010 R\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006(" }, d2 = { "Lokhttp3/tls/internal/der/k;", "", "", "hashCode", "", "toString", "a", "", "b", "", "c", "d", "tagClass", "tag", "constructed", "length", "e", "other", "equals", "k", "()Z", "isEndOfData", "J", "h", "()J", "m", "(J)V", "i", "n", "Z", "g", "l", "(Z)V", "I", "j", "()I", "o", "(I)V", "<init>", "(IJZJ)V", "okhttp-tls" }, k = 1, mv = { 1, 4, 0 })
public final class k
{
    public static final int e = 0;
    public static final int f = 64;
    public static final int g = 128;
    public static final int h = 192;
    public static final long i = 0L;
    public static final a j;
    private int a;
    private long b;
    private boolean c;
    private long d;
    
    static {
        j = new a(null);
    }
    
    public k(final int a, final long b, final boolean c, final long d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
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
    public final k e(final int n, final long n2, final boolean b, final long n3) {
        return new k(n, n2, b, n3);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this != o) {
            if (o instanceof k) {
                final k k = (k)o;
                if (this.a == k.a && this.b == k.b && this.c == k.c && this.d == k.d) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public final boolean g() {
        return this.c;
    }
    
    public final long h() {
        return this.d;
    }
    
    @Override
    public int hashCode() {
        return (((0 + this.a) * 31 + (int)this.b) * 31 + ((this.c ^ true) ? 1 : 0)) * 31 + (int)this.d;
    }
    
    public final long i() {
        return this.b;
    }
    
    public final int j() {
        return this.a;
    }
    
    public final boolean k() {
        return this.a == 0 && this.b == 0L;
    }
    
    public final void l(final boolean c) {
        this.c = c;
    }
    
    public final void m(final long d) {
        this.d = d;
    }
    
    public final void n(final long b) {
        this.b = b;
    }
    
    public final void o(final int a) {
        this.a = a;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('/');
        sb.append(this.b);
        return sb.toString();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r" }, d2 = { "okhttp3/tls/internal/der/k$a", "", "", "TAG_CLASS_APPLICATION", "I", "TAG_CLASS_CONTEXT_SPECIFIC", "TAG_CLASS_PRIVATE", "TAG_CLASS_UNIVERSAL", "", "TAG_END_OF_CONTENTS", "J", "<init>", "()V", "okhttp-tls" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        private a() {
        }
    }
}
