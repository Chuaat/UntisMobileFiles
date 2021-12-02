// 
// Decompiled by Procyon v0.5.36
// 

package w4;

import kotlin.jvm.internal.k0;
import io.realm.internal.p;
import kotlin.jvm.internal.w;
import io.realm.annotations.e;
import kotlin.Metadata;
import io.realm.g4;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0016\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR\"\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\b¨\u0006\u0018" }, d2 = { "Lw4/f;", "Lio/realm/p0;", "", "start", "J", "v8", "()J", "z8", "(J)V", "", "name", "Ljava/lang/String;", "u8", "()Ljava/lang/String;", "y8", "(Ljava/lang/String;)V", "id", "t8", "x8", "end", "s8", "w8", "<init>", "(JLjava/lang/String;JJ)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class f extends p0 implements g4
{
    @e
    private long J;
    @org.jetbrains.annotations.e
    private String K;
    private long L;
    private long M;
    
    public f() {
        this(0L, null, 0L, 0L, 15, null);
        if (this instanceof p) {
            ((p)this).y4();
        }
    }
    
    public f(final long n, @org.jetbrains.annotations.e final String s, final long n2, final long n3) {
        k0.p(s, "name");
        if (this instanceof p) {
            ((p)this).y4();
        }
        this.b(n);
        this.e(s);
        this.h(n2);
        this.i(n3);
    }
    
    @Override
    public long a() {
        return this.J;
    }
    
    @Override
    public void b(final long j) {
        this.J = j;
    }
    
    @Override
    public long c() {
        return this.M;
    }
    
    @Override
    public long d() {
        return this.L;
    }
    
    @Override
    public void e(final String k) {
        this.K = k;
    }
    
    @Override
    public String g() {
        return this.K;
    }
    
    @Override
    public void h(final long l) {
        this.L = l;
    }
    
    @Override
    public void i(final long m) {
        this.M = m;
    }
    
    public final long s8() {
        return this.c();
    }
    
    public final long t8() {
        return this.a();
    }
    
    @org.jetbrains.annotations.e
    public final String u8() {
        return this.g();
    }
    
    public final long v8() {
        return this.d();
    }
    
    public final void w8(final long n) {
        this.i(n);
    }
    
    public final void x8(final long n) {
        this.b(n);
    }
    
    public final void y8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.e(s);
    }
    
    public final void z8(final long n) {
        this.h(n);
    }
}
