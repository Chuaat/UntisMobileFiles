// 
// Decompiled by Procyon v0.5.36
// 

package w4;

import kotlin.jvm.internal.k0;
import io.realm.internal.p;
import kotlin.jvm.internal.w;
import io.realm.annotations.e;
import kotlin.Metadata;
import io.realm.m4;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0016\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010*\u001a\u00020\t\u0012\b\b\u0002\u0010\u001e\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010-\u001a\u00020\u0010\u0012\b\b\u0002\u0010'\u001a\u00020\u0010\u0012\b\b\u0002\u0010!\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010$\u001a\u00020\u0017¢\u0006\u0004\b0\u00101R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001e\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u000b\u001a\u0004\b\u001f\u0010\r\"\u0004\b \u0010\u000fR\"\u0010!\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0004\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\"\u0010$\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0019\u001a\u0004\b%\u0010\u001b\"\u0004\b&\u0010\u001dR\"\u0010'\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0012\u001a\u0004\b(\u0010\u0014\"\u0004\b)\u0010\u0016R\"\u0010*\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\u000b\u001a\u0004\b+\u0010\r\"\u0004\b,\u0010\u000fR\"\u0010-\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010\u0012\u001a\u0004\b.\u0010\u0014\"\u0004\b/\u0010\u0016¨\u00062" }, d2 = { "Lw4/i;", "Lio/realm/p0;", "", "backColor", "I", "t8", "()I", "D8", "(I)V", "", "lastName", "Ljava/lang/String;", "y8", "()Ljava/lang/String;", "I8", "(Ljava/lang/String;)V", "", "id", "J", "x8", "()J", "H8", "(J)V", "", "active", "Z", "s8", "()Z", "C8", "(Z)V", "firstName", "w8", "G8", "textColor", "B8", "L8", "displayable", "u8", "E8", "end", "v8", "F8", "name", "z8", "J8", "start", "A8", "K8", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIIZZ)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class i extends p0 implements m4
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
    private int P;
    private int Q;
    private boolean R;
    private boolean S;
    
    public i() {
        this(0L, null, null, null, 0L, 0L, 0, 0, false, false, 1023, null);
        if (this instanceof p) {
            ((p)this).y4();
        }
    }
    
    public i(final long n, @org.jetbrains.annotations.e final String s, @org.jetbrains.annotations.e final String s2, @org.jetbrains.annotations.e final String s3, final long n2, final long n3, final int n4, final int n5, final boolean b, final boolean b2) {
        k0.p(s, "name");
        k0.p(s2, "firstName");
        k0.p(s3, "lastName");
        if (this instanceof p) {
            ((p)this).y4();
        }
        this.b(n);
        this.e(s);
        this.v0(s2);
        this.k0(s3);
        this.h(n2);
        this.i(n3);
        this.q(n4);
        this.w(n5);
        this.s(b);
        this.Q(b2);
    }
    
    public final long A8() {
        return this.d();
    }
    
    @Override
    public String B0() {
        return this.L;
    }
    
    public final int B8() {
        return this.r();
    }
    
    public final void C8(final boolean b) {
        this.s(b);
    }
    
    public final void D8(final int n) {
        this.w(n);
    }
    
    public final void E8(final boolean b) {
        this.Q(b);
    }
    
    public final void F8(final long n) {
        this.i(n);
    }
    
    public final void G8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.v0(s);
    }
    
    public final void H8(final long n) {
        this.b(n);
    }
    
    public final void I8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.k0(s);
    }
    
    public final void J8(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "<set-?>");
        this.e(s);
    }
    
    public final void K8(final long n) {
        this.h(n);
    }
    
    @Override
    public boolean L() {
        return this.S;
    }
    
    public final void L8(final int n) {
        this.q(n);
    }
    
    @Override
    public void Q(final boolean s) {
        this.S = s;
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
        return this.O;
    }
    
    @Override
    public long d() {
        return this.N;
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
    public void h(final long n) {
        this.N = n;
    }
    
    @Override
    public void i(final long o) {
        this.O = o;
    }
    
    @Override
    public void k0(final String m) {
        this.M = m;
    }
    
    @Override
    public void q(final int p) {
        this.P = p;
    }
    
    @Override
    public int r() {
        return this.P;
    }
    
    @Override
    public void s(final boolean r) {
        this.R = r;
    }
    
    public final boolean s8() {
        return this.t();
    }
    
    @Override
    public boolean t() {
        return this.R;
    }
    
    public final int t8() {
        return this.u();
    }
    
    @Override
    public int u() {
        return this.Q;
    }
    
    public final boolean u8() {
        return this.L();
    }
    
    @Override
    public void v0(final String l) {
        this.L = l;
    }
    
    public final long v8() {
        return this.c();
    }
    
    @Override
    public void w(final int q) {
        this.Q = q;
    }
    
    @org.jetbrains.annotations.e
    public final String w8() {
        return this.B0();
    }
    
    public final long x8() {
        return this.a();
    }
    
    @org.jetbrains.annotations.e
    public final String y8() {
        return this.z0();
    }
    
    @Override
    public String z0() {
        return this.M;
    }
    
    @org.jetbrains.annotations.e
    public final String z8() {
        return this.g();
    }
}
