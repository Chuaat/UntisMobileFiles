// 
// Decompiled by Procyon v0.5.36
// 

package j4;

import kotlin.jvm.internal.k0;
import io.realm.internal.p;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.f;
import io.realm.annotations.e;
import kotlin.Metadata;
import io.realm.s1;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\b¨\u0006\u001f" }, d2 = { "Lj4/c;", "Lio/realm/p0;", "", "id", "J", "u8", "()J", "z8", "(J)V", "date", "s8", "x8", "", "text", "Ljava/lang/String;", "w8", "()Ljava/lang/String;", "B8", "(Ljava/lang/String;)V", "Lj4/d;", "excuseStatus", "Lj4/d;", "t8", "()Lj4/d;", "y8", "(Lj4/d;)V", "number", "v8", "A8", "<init>", "(JLj4/d;Ljava/lang/String;JJ)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class c extends p0 implements s1
{
    @e
    private long J;
    @f
    private d K;
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
    
    public c(final long n, @f final d d, @org.jetbrains.annotations.e final String s, final long n2, final long n3) {
        k0.p(s, "text");
        if (this instanceof p) {
            ((p)this).y4();
        }
        this.b(n);
        this.C4(d);
        this.j(s);
        this.n0(n2);
        this.W(n3);
    }
    
    public final void A8(final long n) {
        this.n0(n);
    }
    
    public final void B8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.j(s);
    }
    
    @Override
    public void C4(final d k) {
        this.K = k;
    }
    
    @Override
    public long H() {
        return this.N;
    }
    
    @Override
    public void W(final long n) {
        this.N = n;
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
    public d e2() {
        return this.K;
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
    
    public final long s8() {
        return this.H();
    }
    
    @f
    public final d t8() {
        return this.e2();
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
    
    public final void x8(final long n) {
        this.W(n);
    }
    
    public final void y8(@f final d d) {
        this.C4(d);
    }
    
    public final void z8(final long n) {
        this.b(n);
    }
}
