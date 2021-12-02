// 
// Decompiled by Procyon v0.5.36
// 

package r4;

import kotlin.jvm.internal.k0;
import io.realm.internal.p;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.f;
import io.realm.annotations.e;
import kotlin.Metadata;
import io.realm.c3;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0016\u0018\u00002\u00020\u0001BY\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010'\u001a\u00020\u0013\u0012\b\b\u0002\u0010!\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010$\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b*\u0010+R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010!\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0015\u001a\u0004\b\"\u0010\u0017\"\u0004\b#\u0010\u0019R\"\u0010$\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0004\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\"\u0010'\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0015\u001a\u0004\b(\u0010\u0017\"\u0004\b)\u0010\u0019¨\u0006," }, d2 = { "Lr4/d;", "Lio/realm/p0;", "", "studentId", "J", "y8", "()J", "G8", "(J)V", "id", "w8", "E8", "", "excused", "Z", "v8", "()Z", "D8", "(Z)V", "", "start", "Ljava/lang/String;", "x8", "()Ljava/lang/String;", "F8", "(Ljava/lang/String;)V", "Lr4/c;", "excuse", "Lr4/c;", "u8", "()Lr4/c;", "C8", "(Lr4/c;)V", "text", "z8", "H8", "absenceReasonId", "s8", "A8", "end", "t8", "B8", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZLr4/c;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class d extends p0 implements c3
{
    @e
    private long J;
    @org.jetbrains.annotations.e
    private String K;
    @org.jetbrains.annotations.e
    private String L;
    @org.jetbrains.annotations.e
    private String M;
    private long N;
    private long O;
    private boolean P;
    @f
    private c Q;
    
    public d() {
        this(0L, null, null, null, 0L, 0L, false, null, 255, null);
        if (this instanceof p) {
            ((p)this).y4();
        }
    }
    
    public d(final long n, @org.jetbrains.annotations.e final String s, @org.jetbrains.annotations.e final String s2, @org.jetbrains.annotations.e final String s3, final long n2, final long n3, final boolean b, @f final c c) {
        k0.p(s, "start");
        k0.p(s2, "end");
        k0.p(s3, "text");
        if (this instanceof p) {
            ((p)this).y4();
        }
        this.b(n);
        this.v(s);
        this.x(s2);
        this.j(s3);
        this.P(n2);
        this.T0(n3);
        this.N(b);
        this.X1(c);
    }
    
    public final void A8(final long n) {
        this.T0(n);
    }
    
    public final void B8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.x(s);
    }
    
    public final void C8(@f final c c) {
        this.X1(c);
    }
    
    public final void D8(final boolean b) {
        this.N(b);
    }
    
    public final void E8(final long n) {
        this.b(n);
    }
    
    public final void F8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.v(s);
    }
    
    public final void G8(final long n) {
        this.P(n);
    }
    
    public final void H8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.j(s);
    }
    
    @Override
    public long J() {
        return this.N;
    }
    
    @Override
    public void N(final boolean p) {
        this.P = p;
    }
    
    @Override
    public void P(final long n) {
        this.N = n;
    }
    
    @Override
    public boolean S() {
        return this.P;
    }
    
    @Override
    public void T0(final long o) {
        this.O = o;
    }
    
    @Override
    public long V0() {
        return this.O;
    }
    
    @Override
    public void X1(final c q) {
        this.Q = q;
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
    public String c() {
        return this.L;
    }
    
    @Override
    public String d() {
        return this.K;
    }
    
    @Override
    public String f() {
        return this.M;
    }
    
    @Override
    public void j(final String m) {
        this.M = m;
    }
    
    public final long s8() {
        return this.V0();
    }
    
    @org.jetbrains.annotations.e
    public final String t8() {
        return this.c();
    }
    
    @f
    public final c u8() {
        return this.w0();
    }
    
    @Override
    public void v(final String k) {
        this.K = k;
    }
    
    public final boolean v8() {
        return this.S();
    }
    
    @Override
    public c w0() {
        return this.Q;
    }
    
    public final long w8() {
        return this.a();
    }
    
    @Override
    public void x(final String l) {
        this.L = l;
    }
    
    @org.jetbrains.annotations.e
    public final String x8() {
        return this.d();
    }
    
    public final long y8() {
        return this.J();
    }
    
    @org.jetbrains.annotations.e
    public final String z8() {
        return this.f();
    }
}
