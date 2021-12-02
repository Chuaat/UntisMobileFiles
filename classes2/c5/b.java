// 
// Decompiled by Procyon v0.5.36
// 

package c5;

import kotlin.jvm.internal.k0;
import io.realm.internal.p;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import io.realm.y5;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u000f\b\u0016\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010 \u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b#\u0010$R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\"\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR\"\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\"\u0010 \u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0018\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001c¨\u0006%" }, d2 = { "Lc5/b;", "Lio/realm/p0;", "", "originalId", "J", "x8", "()J", "E8", "(J)V", "", "label", "Ljava/lang/String;", "v8", "()Ljava/lang/String;", "C8", "(Ljava/lang/String;)V", "labelLong", "w8", "D8", "currentId", "t8", "A8", "", "backGround", "I", "s8", "()I", "z8", "(I)V", "textColor", "y8", "F8", "entityType", "u8", "B8", "<init>", "(IJJLjava/lang/String;Ljava/lang/String;II)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class b extends p0 implements y5
{
    private int J;
    private long K;
    private long L;
    @e
    private String M;
    @e
    private String N;
    private int O;
    private int P;
    
    public b() {
        this(0, 0L, 0L, null, null, 0, 0, 127, null);
        if (this instanceof p) {
            ((p)this).y4();
        }
    }
    
    public b(final int n, final long n2, final long n3, @e final String s, @e final String s2, final int n4, final int n5) {
        k0.p(s, "label");
        k0.p(s2, "labelLong");
        if (this instanceof p) {
            ((p)this).y4();
        }
        this.k(n);
        this.s1(n2);
        this.I0(n3);
        this.x7(s);
        this.X5(s2);
        this.q(n4);
        this.e7(n5);
    }
    
    public final void A8(final long n) {
        this.s1(n);
    }
    
    public final void B8(final int n) {
        this.k(n);
    }
    
    public final void C8(@e final String s) {
        k0.p(s, "<set-?>");
        this.x7(s);
    }
    
    public final void D8(@e final String s) {
        k0.p(s, "<set-?>");
        this.X5(s);
    }
    
    public final void E8(final long n) {
        this.I0(n);
    }
    
    public final void F8(final int n) {
        this.q(n);
    }
    
    @Override
    public void I0(final long l) {
        this.L = l;
    }
    
    @Override
    public long J1() {
        return this.L;
    }
    
    @Override
    public long N0() {
        return this.K;
    }
    
    @Override
    public String U1() {
        return this.N;
    }
    
    @Override
    public void X5(final String n) {
        this.N = n;
    }
    
    @Override
    public void e7(final int p) {
        this.P = p;
    }
    
    @Override
    public void k(final int j) {
        this.J = j;
    }
    
    @Override
    public int l() {
        return this.J;
    }
    
    @Override
    public String l6() {
        return this.M;
    }
    
    @Override
    public void q(final int o) {
        this.O = o;
    }
    
    @Override
    public int r() {
        return this.O;
    }
    
    @Override
    public void s1(final long k) {
        this.K = k;
    }
    
    public final int s8() {
        return this.v3();
    }
    
    public final long t8() {
        return this.N0();
    }
    
    public final int u8() {
        return this.l();
    }
    
    @Override
    public int v3() {
        return this.P;
    }
    
    @e
    public final String v8() {
        return this.l6();
    }
    
    @e
    public final String w8() {
        return this.U1();
    }
    
    @Override
    public void x7(final String m) {
        this.M = m;
    }
    
    public final long x8() {
        return this.J1();
    }
    
    public final int y8() {
        return this.r();
    }
    
    public final void z8(final int n) {
        this.e7(n);
    }
}
