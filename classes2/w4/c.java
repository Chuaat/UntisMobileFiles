// 
// Decompiled by Procyon v0.5.36
// 

package w4;

import kotlin.jvm.internal.k0;
import io.realm.internal.p;
import kotlin.jvm.internal.w;
import io.realm.annotations.e;
import kotlin.Metadata;
import io.realm.a4;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0016\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\"\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR\"\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\b¨\u0006\u001b" }, d2 = { "Lw4/c;", "Lio/realm/p0;", "", "end", "J", "s8", "()J", "x8", "(J)V", "", "longName", "Ljava/lang/String;", "u8", "()Ljava/lang/String;", "z8", "(Ljava/lang/String;)V", "name", "v8", "A8", "start", "w8", "B8", "id", "t8", "y8", "<init>", "(JLjava/lang/String;Ljava/lang/String;JJ)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class c extends p0 implements a4
{
    @e
    private long J;
    @org.jetbrains.annotations.e
    private String K;
    @org.jetbrains.annotations.e
    private String L;
    private long M;
    private long N;
    
    public c() {
        this(0L, null, null, 0L, 0L, 31, null);
        if (this instanceof p) {
            ((p)this).y4();
        }
    }
    
    public c(final long n, @org.jetbrains.annotations.e final String s, @org.jetbrains.annotations.e final String s2, final long n2, final long n3) {
        k0.p(s, "name");
        k0.p(s2, "longName");
        if (this instanceof p) {
            ((p)this).y4();
        }
        this.b(n);
        this.e(s);
        this.m(s2);
        this.h(n2);
        this.i(n3);
    }
    
    public final void A8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.e(s);
    }
    
    public final void B8(final long n) {
        this.h(n);
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
        return this.N;
    }
    
    @Override
    public long d() {
        return this.M;
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
    public void h(final long m) {
        this.M = m;
    }
    
    @Override
    public void i(final long n) {
        this.N = n;
    }
    
    @Override
    public void m(final String l) {
        this.L = l;
    }
    
    @Override
    public String n() {
        return this.L;
    }
    
    public final long s8() {
        return this.c();
    }
    
    public final long t8() {
        return this.a();
    }
    
    @org.jetbrains.annotations.e
    public final String u8() {
        return this.n();
    }
    
    @org.jetbrains.annotations.e
    public final String v8() {
        return this.g();
    }
    
    public final long w8() {
        return this.d();
    }
    
    public final void x8(final long n) {
        this.i(n);
    }
    
    public final void y8(final long n) {
        this.b(n);
    }
    
    public final void z8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.m(s);
    }
}
