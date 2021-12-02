// 
// Decompiled by Procyon v0.5.36
// 

package b5;

import kotlin.jvm.internal.k0;
import io.realm.internal.p;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import io.realm.u5;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000f¨\u0006\u0015" }, d2 = { "Lb5/c;", "Lio/realm/p0;", "", "name", "Ljava/lang/String;", "t8", "()Ljava/lang/String;", "w8", "(Ljava/lang/String;)V", "", "end", "J", "s8", "()J", "v8", "(J)V", "start", "u8", "x8", "<init>", "(Ljava/lang/String;JJ)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class c extends p0 implements u5
{
    @e
    private String J;
    private long K;
    private long L;
    
    public c() {
        this(null, 0L, 0L, 7, null);
        if (this instanceof p) {
            ((p)this).y4();
        }
    }
    
    public c(@e final String s, final long n, final long n2) {
        k0.p(s, "name");
        if (this instanceof p) {
            ((p)this).y4();
        }
        this.e(s);
        this.h(n);
        this.i(n2);
    }
    
    @Override
    public long c() {
        return this.L;
    }
    
    @Override
    public long d() {
        return this.K;
    }
    
    @Override
    public void e(final String j) {
        this.J = j;
    }
    
    @Override
    public String g() {
        return this.J;
    }
    
    @Override
    public void h(final long k) {
        this.K = k;
    }
    
    @Override
    public void i(final long l) {
        this.L = l;
    }
    
    public final long s8() {
        return this.c();
    }
    
    @e
    public final String t8() {
        return this.g();
    }
    
    public final long u8() {
        return this.d();
    }
    
    public final void v8(final long n) {
        this.i(n);
    }
    
    public final void w8(@e final String s) {
        k0.p(s, "<set-?>");
        this.e(s);
    }
    
    public final void x8(final long n) {
        this.h(n);
    }
}
