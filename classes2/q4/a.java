// 
// Decompiled by Procyon v0.5.36
// 

package q4;

import kotlin.jvm.internal.k0;
import io.realm.internal.p;
import kotlin.jvm.internal.w;
import io.realm.annotations.e;
import kotlin.Metadata;
import io.realm.s2;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0016\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR\"\u0010\u0016\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012¨\u0006\u001b" }, d2 = { "Lq4/a;", "Lio/realm/p0;", "", "excuseStatusId", "J", "t8", "()J", "y8", "(J)V", "id", "u8", "z8", "", "date", "Ljava/lang/String;", "s8", "()Ljava/lang/String;", "x8", "(Ljava/lang/String;)V", "number", "v8", "A8", "text", "w8", "B8", "<init>", "(JJLjava/lang/String;JLjava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class a extends p0 implements s2
{
    @e
    private long J;
    private long K;
    @org.jetbrains.annotations.e
    private String L;
    private long M;
    @org.jetbrains.annotations.e
    private String N;
    
    public a() {
        this(0L, 0L, null, 0L, null, 31, null);
        if (this instanceof p) {
            ((p)this).y4();
        }
    }
    
    public a(final long n, final long n2, @org.jetbrains.annotations.e final String s, final long n3, @org.jetbrains.annotations.e final String s2) {
        k0.p(s, "text");
        k0.p(s2, "date");
        if (this instanceof p) {
            ((p)this).y4();
        }
        this.b(n);
        this.X0(n2);
        this.j(s);
        this.n0(n3);
        this.F0(s2);
    }
    
    public final void A8(final long n) {
        this.n0(n);
    }
    
    public final void B8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.j(s);
    }
    
    @Override
    public void F0(final String n) {
        this.N = n;
    }
    
    @Override
    public String H() {
        return this.N;
    }
    
    @Override
    public void X0(final long k) {
        this.K = k;
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
    public String f() {
        return this.L;
    }
    
    @Override
    public void j(final String l) {
        this.L = l;
    }
    
    @Override
    public void n0(final long m) {
        this.M = m;
    }
    
    @Override
    public long r0() {
        return this.M;
    }
    
    @org.jetbrains.annotations.e
    public final String s8() {
        return this.H();
    }
    
    public final long t8() {
        return this.z1();
    }
    
    public final long u8() {
        return this.a();
    }
    
    public final long v8() {
        return this.r0();
    }
    
    @org.jetbrains.annotations.e
    public final String w8() {
        return this.f();
    }
    
    public final void x8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.F0(s);
    }
    
    public final void y8(final long n) {
        this.X0(n);
    }
    
    @Override
    public long z1() {
        return this.K;
    }
    
    public final void z8(final long n) {
        this.b(n);
    }
}
